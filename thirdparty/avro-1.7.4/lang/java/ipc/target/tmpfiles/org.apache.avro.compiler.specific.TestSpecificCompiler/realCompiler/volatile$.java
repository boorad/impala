/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class volatile$ extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"volatile\",\"fields\":[{\"name\":\"package\",\"type\":\"string\"},{\"name\":\"data\",\"type\":\"int\"},{\"name\":\"value\",\"type\":\"int\"},{\"name\":\"defaultValue\",\"type\":\"int\"},{\"name\":\"other\",\"type\":\"int\"},{\"name\":\"short\",\"type\":\"volatile\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence package$;
  @Deprecated public int data;
  @Deprecated public int value;
  @Deprecated public int defaultValue;
  @Deprecated public int other;
  @Deprecated public volatile$ short$;

  /**
   * Default constructor.
   */
  public volatile$() {}

  /**
   * All-args constructor.
   */
  public volatile$(java.lang.CharSequence package$, java.lang.Integer data, java.lang.Integer value, java.lang.Integer defaultValue, java.lang.Integer other, volatile$ short$) {
    this.package$ = package$;
    this.data = data;
    this.value = value;
    this.defaultValue = defaultValue;
    this.other = other;
    this.short$ = short$;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return package$;
    case 1: return data;
    case 2: return value;
    case 3: return defaultValue;
    case 4: return other;
    case 5: return short$;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: package$ = (java.lang.CharSequence)value$; break;
    case 1: data = (java.lang.Integer)value$; break;
    case 2: value = (java.lang.Integer)value$; break;
    case 3: defaultValue = (java.lang.Integer)value$; break;
    case 4: other = (java.lang.Integer)value$; break;
    case 5: short$ = (volatile$)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'package$' field.
   */
  public java.lang.CharSequence getPackage$() {
    return package$;
  }

  /**
   * Sets the value of the 'package$' field.
   * @param value the value to set.
   */
  public void setPackage$(java.lang.CharSequence value) {
    this.package$ = value;
  }

  /**
   * Gets the value of the 'data' field.
   */
  public java.lang.Integer getData() {
    return data;
  }

  /**
   * Sets the value of the 'data' field.
   * @param value the value to set.
   */
  public void setData(java.lang.Integer value) {
    this.data = value;
  }

  /**
   * Gets the value of the 'value' field.
   */
  public java.lang.Integer getValue() {
    return value;
  }

  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.lang.Integer value) {
    this.value = value;
  }

  /**
   * Gets the value of the 'defaultValue' field.
   */
  public java.lang.Integer getDefaultValue() {
    return defaultValue;
  }

  /**
   * Sets the value of the 'defaultValue' field.
   * @param value the value to set.
   */
  public void setDefaultValue(java.lang.Integer value) {
    this.defaultValue = value;
  }

  /**
   * Gets the value of the 'other' field.
   */
  public java.lang.Integer getOther() {
    return other;
  }

  /**
   * Sets the value of the 'other' field.
   * @param value the value to set.
   */
  public void setOther(java.lang.Integer value) {
    this.other = value;
  }

  /**
   * Gets the value of the 'short$' field.
   */
  public volatile$ getShort$() {
    return short$;
  }

  /**
   * Sets the value of the 'short$' field.
   * @param value the value to set.
   */
  public void setShort$(volatile$ value) {
    this.short$ = value;
  }

  /** Creates a new volatile$ RecordBuilder */
  public static volatile$.Builder newBuilder() {
    return new volatile$.Builder();
  }
  
  /** Creates a new volatile$ RecordBuilder by copying an existing Builder */
  public static volatile$.Builder newBuilder(volatile$.Builder other) {
    return new volatile$.Builder(other);
  }
  
  /** Creates a new volatile$ RecordBuilder by copying an existing volatile$ instance */
  public static volatile$.Builder newBuilder(volatile$ other) {
    return new volatile$.Builder(other);
  }
  
  /**
   * RecordBuilder for volatile$ instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<volatile$>
    implements org.apache.avro.data.RecordBuilder<volatile$> {

    private java.lang.CharSequence package$;
    private int data;
    private int value;
    private int defaultValue;
    private int other;
    private volatile$ short$;

    /** Creates a new Builder */
    private Builder() {
      super(volatile$.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(volatile$.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing volatile$ instance */
    private Builder(volatile$ other) {
            super(volatile$.SCHEMA$);
      if (isValidValue(fields()[0], other.package$)) {
        this.package$ = data().deepCopy(fields()[0].schema(), other.package$);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.data)) {
        this.data = data().deepCopy(fields()[1].schema(), other.data);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.value)) {
        this.value = data().deepCopy(fields()[2].schema(), other.value);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.defaultValue)) {
        this.defaultValue = data().deepCopy(fields()[3].schema(), other.defaultValue);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.other)) {
        this.other = data().deepCopy(fields()[4].schema(), other.other);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.short$)) {
        this.short$ = data().deepCopy(fields()[5].schema(), other.short$);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'package$' field */
    public java.lang.CharSequence getPackage$() {
      return package$;
    }
    
    /** Sets the value of the 'package$' field */
    public volatile$.Builder setPackage$(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.package$ = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'package$' field has been set */
    public boolean hasPackage$() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'package$' field */
    public volatile$.Builder clearPackage$() {
      package$ = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'data' field */
    public java.lang.Integer getData() {
      return data;
    }
    
    /** Sets the value of the 'data' field */
    public volatile$.Builder setData(int value) {
      validate(fields()[1], value);
      this.data = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'data' field has been set */
    public boolean hasData() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'data' field */
    public volatile$.Builder clearData() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'value' field */
    public java.lang.Integer getValue() {
      return value;
    }
    
    /** Sets the value of the 'value' field */
    public volatile$.Builder setValue(int value) {
      validate(fields()[2], value);
      this.value = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'value' field has been set */
    public boolean hasValue() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'value' field */
    public volatile$.Builder clearValue() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'defaultValue' field */
    public java.lang.Integer getDefaultValue() {
      return defaultValue;
    }
    
    /** Sets the value of the 'defaultValue' field */
    public volatile$.Builder setDefaultValue(int value) {
      validate(fields()[3], value);
      this.defaultValue = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'defaultValue' field has been set */
    public boolean hasDefaultValue() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'defaultValue' field */
    public volatile$.Builder clearDefaultValue() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'other' field */
    public java.lang.Integer getOther() {
      return other;
    }
    
    /** Sets the value of the 'other' field */
    public volatile$.Builder setOther(int value) {
      validate(fields()[4], value);
      this.other = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'other' field has been set */
    public boolean hasOther() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'other' field */
    public volatile$.Builder clearOther() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'short$' field */
    public volatile$ getShort$() {
      return short$;
    }
    
    /** Sets the value of the 'short$' field */
    public volatile$.Builder setShort$(volatile$ value) {
      validate(fields()[5], value);
      this.short$ = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'short$' field has been set */
    public boolean hasShort$() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'short$' field */
    public volatile$.Builder clearShort$() {
      short$ = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public volatile$ build() {
      try {
        volatile$ record = new volatile$();
        record.package$ = fieldSetFlags()[0] ? this.package$ : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.data = fieldSetFlags()[1] ? this.data : (java.lang.Integer) defaultValue(fields()[1]);
        record.value = fieldSetFlags()[2] ? this.value : (java.lang.Integer) defaultValue(fields()[2]);
        record.defaultValue = fieldSetFlags()[3] ? this.defaultValue : (java.lang.Integer) defaultValue(fields()[3]);
        record.other = fieldSetFlags()[4] ? this.other : (java.lang.Integer) defaultValue(fields()[4]);
        record.short$ = fieldSetFlags()[5] ? this.short$ : (volatile$) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
