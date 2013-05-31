/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Node extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Node\",\"namespace\":\"org.apache.avro\",\"fields\":[{\"name\":\"label\",\"type\":\"string\"},{\"name\":\"children\",\"type\":{\"type\":\"array\",\"items\":\"Node\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence label;
  @Deprecated public java.util.List<org.apache.avro.Node> children;

  /**
   * Default constructor.
   */
  public Node() {}

  /**
   * All-args constructor.
   */
  public Node(java.lang.CharSequence label, java.util.List<org.apache.avro.Node> children) {
    this.label = label;
    this.children = children;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return label;
    case 1: return children;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: label = (java.lang.CharSequence)value$; break;
    case 1: children = (java.util.List<org.apache.avro.Node>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'label' field.
   */
  public java.lang.CharSequence getLabel() {
    return label;
  }

  /**
   * Sets the value of the 'label' field.
   * @param value the value to set.
   */
  public void setLabel(java.lang.CharSequence value) {
    this.label = value;
  }

  /**
   * Gets the value of the 'children' field.
   */
  public java.util.List<org.apache.avro.Node> getChildren() {
    return children;
  }

  /**
   * Sets the value of the 'children' field.
   * @param value the value to set.
   */
  public void setChildren(java.util.List<org.apache.avro.Node> value) {
    this.children = value;
  }

  /** Creates a new Node RecordBuilder */
  public static org.apache.avro.Node.Builder newBuilder() {
    return new org.apache.avro.Node.Builder();
  }
  
  /** Creates a new Node RecordBuilder by copying an existing Builder */
  public static org.apache.avro.Node.Builder newBuilder(org.apache.avro.Node.Builder other) {
    return new org.apache.avro.Node.Builder(other);
  }
  
  /** Creates a new Node RecordBuilder by copying an existing Node instance */
  public static org.apache.avro.Node.Builder newBuilder(org.apache.avro.Node other) {
    return new org.apache.avro.Node.Builder(other);
  }
  
  /**
   * RecordBuilder for Node instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Node>
    implements org.apache.avro.data.RecordBuilder<Node> {

    private java.lang.CharSequence label;
    private java.util.List<org.apache.avro.Node> children;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.avro.Node.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.avro.Node.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Node instance */
    private Builder(org.apache.avro.Node other) {
            super(org.apache.avro.Node.SCHEMA$);
      if (isValidValue(fields()[0], other.label)) {
        this.label = data().deepCopy(fields()[0].schema(), other.label);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.children)) {
        this.children = data().deepCopy(fields()[1].schema(), other.children);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'label' field */
    public java.lang.CharSequence getLabel() {
      return label;
    }
    
    /** Sets the value of the 'label' field */
    public org.apache.avro.Node.Builder setLabel(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.label = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'label' field has been set */
    public boolean hasLabel() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'label' field */
    public org.apache.avro.Node.Builder clearLabel() {
      label = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'children' field */
    public java.util.List<org.apache.avro.Node> getChildren() {
      return children;
    }
    
    /** Sets the value of the 'children' field */
    public org.apache.avro.Node.Builder setChildren(java.util.List<org.apache.avro.Node> value) {
      validate(fields()[1], value);
      this.children = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'children' field has been set */
    public boolean hasChildren() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'children' field */
    public org.apache.avro.Node.Builder clearChildren() {
      children = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Node build() {
      try {
        Node record = new Node();
        record.label = fieldSetFlags()[0] ? this.label : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.children = fieldSetFlags()[1] ? this.children : (java.util.List<org.apache.avro.Node>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
