# Copyright 2012 Cloudera Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# set the python path for test modules and beeswax
PYTHONPATH=$IMPALA_HOME:$IMPALA_HOME/shell/gen-py:$HIVE_HOME/lib/py

# There should be just a single version of python that created the
# site-packages directory.
# Note: this could go wrong if we have used two different versions of
# Python to build Thrift on this machine, and the first version is not
# compatible with the second.
for PYTHON_DIR in ${THRIFT_HOME}/python/lib/python*/site-packages; do
    PYTHONPATH=$PYTHONPATH:${PYTHON_DIR}/
done

# Add all the built eggs to the python path
for EGG in ${IMPALA_HOME}/shell/ext-py/*/dist/*.egg; do
  PYTHONPATH=${PYTHONPATH}:${EGG}
done

# original site-packages
# BSA - impala build didn't like the above PYTHONPATH (ClassType error)
PYTHONPATH=`python -c "from distutils.sysconfig import get_python_lib; print get_python_lib()"`

export PYTHONPATH
