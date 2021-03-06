// Copyright 2012 Cloudera Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

#include "common/logging.h"

#include "util/debug-util.h"

#include <iomanip>
#include <sstream>

#include "common/logging.h"
#include "common/version.h"
#include "runtime/descriptors.h"
#include "runtime/raw-value.h"
#include "runtime/tuple-row.h"
#include "runtime/row-batch.h"
#include "util/cpu-info.h"
#include "gen-cpp/Opcodes_types.h"

#define PRECISION 2
#define KILOBYTE (1024)
#define MEGABYTE (1024 * 1024)
#define GIGABYTE (1024 * 1024 * 1024)

#define SECOND (1000)
#define MINUTE (1000 * 60)
#define HOUR (1000 * 60 * 60)

#define THOUSAND (1000)
#define MILLION (THOUSAND * 1000)
#define BILLION (MILLION * 1000)

using namespace std;
using namespace beeswax;
using namespace parquet;

namespace impala {

#define THRIFT_ENUM_OUTPUT_FN_IMPL(E, MAP) \
  ostream& operator<<(ostream& os, const E::type& e) {\
    map<int, const char*>::const_iterator i;\
    i = MAP.find(e);\
    if (i != MAP.end()) {\
      os << i->second;\
    }\
    return os;\
  }

// Macro to stamp out operator<< for thrift enums.  Why doesn't thrift do this?
#define THRIFT_ENUM_OUTPUT_FN(E) THRIFT_ENUM_OUTPUT_FN_IMPL(E , _##E##_VALUES_TO_NAMES)

// Macro to implement Print function that returns string for thrift enums
#define THRIFT_ENUM_PRINT_FN(E) \
  string Print##E(const E::type& e) {\
    stringstream ss;\
    ss << e;\
    return ss.str();\
  }

THRIFT_ENUM_OUTPUT_FN(TExprOpcode);
THRIFT_ENUM_OUTPUT_FN(TAggregationOp);
THRIFT_ENUM_OUTPUT_FN(THdfsFileFormat);
THRIFT_ENUM_OUTPUT_FN(THdfsCompression);
THRIFT_ENUM_OUTPUT_FN(TStmtType);
THRIFT_ENUM_OUTPUT_FN(QueryState);
THRIFT_ENUM_OUTPUT_FN(Encoding);

THRIFT_ENUM_PRINT_FN(TStmtType);
THRIFT_ENUM_PRINT_FN(QueryState);

ostream& operator<<(ostream& os, const TUniqueId& id) {
  os << PrintId(id);
  return os;
}

string PrintId(const TUniqueId& id) {
  stringstream out;
  out << std::hex << id.hi << ":" << id.lo;
  return out.str();
}

bool ParseId(const string& s, TUniqueId* id) {
  DCHECK(id != NULL);

  const char* hi_part = s.c_str();
  char* colon = const_cast<char*>(strchr(hi_part, ':'));
  if (colon == NULL) return false;
  const char* lo_part = colon + 1;
  *colon = '\0';

  char* error_hi = NULL;
  char* error_lo = NULL;
  id->hi = strtoul(hi_part, &error_hi, 16);
  id->lo = strtoul(lo_part, &error_lo, 16);

  bool valid = *error_hi == '\0' && *error_lo == '\0';
  *colon = ':';
  return valid;
}

string PrintPlanNodeType(const TPlanNodeType::type& type) {
  map<int, const char*>::const_iterator i;
  i = _TPlanNodeType_VALUES_TO_NAMES.find(type);
  if (i != _TPlanNodeType_VALUES_TO_NAMES.end()) {
    return i->second;
  }
  return "Invalid plan node type";
}

string PrintTuple(const Tuple* t, const TupleDescriptor& d) {
  if (t == NULL) return "null";
  stringstream out;
  out << "(";
  bool first_value = true;
  for (int i = 0; i < d.slots().size(); ++i) {
    SlotDescriptor* slot_d = d.slots()[i];
    if (!slot_d->is_materialized()) continue;
    if (first_value) {
      first_value = false;
    } else {
      out << " ";
    }
    if (t->IsNull(slot_d->null_indicator_offset())) {
      out << "null";
    } else {
      string value_str;
      RawValue::PrintValue(
          t->GetSlot(slot_d->tuple_offset()), slot_d->type(), -1, &value_str);
      out << value_str;
    }
  }
  out << ")";
  return out.str();
}

string PrintRow(TupleRow* row, const RowDescriptor& d) {
  stringstream out;
  out << "[";
  for (int i = 0; i < d.tuple_descriptors().size(); ++i) {
    if (i != 0) out << " ";
    out << PrintTuple(row->GetTuple(i), *d.tuple_descriptors()[i]);
  }
  out << "]";
  return out.str();
}

static double GetByteUnit(int64_t value, string* unit) {
  if (value == 0) {
    *unit = "";
    return value;
  } else if (value > GIGABYTE) {
    *unit = "GB";
    return value /(double) GIGABYTE;
  } else if (value > MEGABYTE ) {
    *unit = "MB";
    return value /(double) MEGABYTE;
  } else if (value > KILOBYTE)  {
    *unit = "KB";
    return value /(double) KILOBYTE;
  } else {
    *unit = "B";
    return value;
  }
}

static double GetUnit(int64_t value, string* unit) {
  if (value >= BILLION) {
    *unit = "B";
    return value / (1000*1000*1000.);
  } else if (value >= MILLION) {
    *unit = "M";
    return value / (1000*1000.);
  } else if (value >= THOUSAND) {
    *unit = "K";
    return value / (1000.);
  } else {
    *unit = "";
    return value;
  }
}

// Print the value (time in ms) to ss
static void PrintTimeMS(int64_t value, stringstream* ss) {
  if (value == 0 ) {
    *ss << "0";
  } else {
    bool hour = false;
    bool minute = false;
    bool second = false;
    if (value >= HOUR) {
      *ss << value / HOUR << "h";
      value %= HOUR;
      hour = true;
    }
    if (value >= MINUTE) {
      *ss << value / MINUTE << "m";
      value %= MINUTE;
      minute = true;
    }
    if (!hour && value >= SECOND) {
      *ss << value / SECOND << "s";
      value %= SECOND;
      second = true;
    }
    if (!hour && !minute) {
      if (second) *ss << setw(3) << setfill('0');
      *ss << value << "ms";
    }
  }
}

string PrettyPrinter::Print(int64_t value, TCounterType::type type) {
  stringstream ss;
  ss.flags(ios::fixed);
  switch (type) {
    case TCounterType::UNIT: {
      string unit;
      double output = GetUnit(value, &unit);
      if (unit.empty()) {
        ss << value;
      } else {
        ss << setprecision(PRECISION) << output << unit << " (" << value << ")";
      }
      break;
    }

    case TCounterType::UNIT_PER_SECOND: {
      string unit;
      double output = GetUnit(value, &unit);
      if (output == 0) {
        ss << "0";
      } else {
        ss << setprecision(PRECISION) << output << " " << unit << "/sec";
      }
      break;
    }

    case TCounterType::CPU_TICKS: {
      if (value < CpuInfo::cycles_per_ms()) {
        ss << (value / 1000) << "K clock cycles";
      } else {
        value /= CpuInfo::cycles_per_ms();
        PrintTimeMS(value, &ss);
      }
      break;
    }

    case TCounterType::TIME_NS: {
      if (value >= BILLION) {
        // If the time is over a second, print it up to ms.
        value /= MILLION;
        PrintTimeMS(value, &ss);
      } else if (value >= MILLION) {
        // if the time is over a ms, print it up to microsecond in the unit of ms.
        value /= 1000;
        ss << value / 1000 << "." << value % 1000 << "ms";
      } else if (value > 1000) {
        // if the time is over a microsecond, print it using unit microsecond
        ss << value / 1000 << "." << value % 1000 << "us";
      } else {
        ss << value << "ns";
      }
      break;
    }

    case TCounterType::BYTES: {
      string unit;
      double output = GetByteUnit(value, &unit);
      ss << setprecision(PRECISION) << output << " " << unit;
      break;
    }

    case TCounterType::BYTES_PER_SECOND: {
      string unit;
      double output = GetByteUnit(value, &unit);
      ss << setprecision(PRECISION) << output << " " << unit << "/sec";
      break;
    }

    case TCounterType::DOUBLE_VALUE: {
      double output = *reinterpret_cast<double*>(&value);
      ss << setprecision(PRECISION) << output << " ";
      break;
    }

    default:
      DCHECK(false);
      break;
  }
  return ss.str();
}

string PrintBatch(RowBatch* batch) {
  stringstream out;
  for (int i = 0; i < batch->num_rows(); ++i) {
    out << PrintRow(batch->GetRow(i), batch->row_desc()) << "\n";
  }
  return out.str();
}

string GetBuildVersion(bool compact) {
  stringstream ss;
  ss << IMPALA_BUILD_VERSION
#ifdef NDEBUG
     << " RELEASE"
#else
     << " DEBUG"
#endif
     << " (build " << IMPALA_BUILD_HASH
     << ")";
  if (!compact) {
    ss << endl << "Built on " << IMPALA_BUILD_TIME;
  }
  return ss.str();
}

string GetVersionString(bool compact) {
  stringstream ss;
  ss << google::ProgramInvocationShortName()
     << " version " << GetBuildVersion(compact);
  return ss.str();
}

string GetStackTrace() {
  string s;
  google::glog_internal_namespace_::DumpStackTraceToString(&s);
  return s;
}

}
