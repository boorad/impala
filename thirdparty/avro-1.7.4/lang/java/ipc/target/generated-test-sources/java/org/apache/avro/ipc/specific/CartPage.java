/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.avro.ipc.specific;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CartPage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CartPage\",\"namespace\":\"org.apache.avro.ipc.specific\",\"fields\":[{\"name\":\"productsInCart\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.List<java.lang.String> productsInCart;

  /**
   * Default constructor.
   */
  public CartPage() {}

  /**
   * All-args constructor.
   */
  public CartPage(java.util.List<java.lang.String> productsInCart) {
    this.productsInCart = productsInCart;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return productsInCart;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: productsInCart = (java.util.List<java.lang.String>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'productsInCart' field.
   */
  public java.util.List<java.lang.String> getProductsInCart() {
    return productsInCart;
  }

  /**
   * Sets the value of the 'productsInCart' field.
   * @param value the value to set.
   */
  public void setProductsInCart(java.util.List<java.lang.String> value) {
    this.productsInCart = value;
  }

  /** Creates a new CartPage RecordBuilder */
  public static org.apache.avro.ipc.specific.CartPage.Builder newBuilder() {
    return new org.apache.avro.ipc.specific.CartPage.Builder();
  }
  
  /** Creates a new CartPage RecordBuilder by copying an existing Builder */
  public static org.apache.avro.ipc.specific.CartPage.Builder newBuilder(org.apache.avro.ipc.specific.CartPage.Builder other) {
    return new org.apache.avro.ipc.specific.CartPage.Builder(other);
  }
  
  /** Creates a new CartPage RecordBuilder by copying an existing CartPage instance */
  public static org.apache.avro.ipc.specific.CartPage.Builder newBuilder(org.apache.avro.ipc.specific.CartPage other) {
    return new org.apache.avro.ipc.specific.CartPage.Builder(other);
  }
  
  /**
   * RecordBuilder for CartPage instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CartPage>
    implements org.apache.avro.data.RecordBuilder<CartPage> {

    private java.util.List<java.lang.String> productsInCart;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.avro.ipc.specific.CartPage.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.avro.ipc.specific.CartPage.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing CartPage instance */
    private Builder(org.apache.avro.ipc.specific.CartPage other) {
            super(org.apache.avro.ipc.specific.CartPage.SCHEMA$);
      if (isValidValue(fields()[0], other.productsInCart)) {
        this.productsInCart = data().deepCopy(fields()[0].schema(), other.productsInCart);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'productsInCart' field */
    public java.util.List<java.lang.String> getProductsInCart() {
      return productsInCart;
    }
    
    /** Sets the value of the 'productsInCart' field */
    public org.apache.avro.ipc.specific.CartPage.Builder setProductsInCart(java.util.List<java.lang.String> value) {
      validate(fields()[0], value);
      this.productsInCart = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'productsInCart' field has been set */
    public boolean hasProductsInCart() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'productsInCart' field */
    public org.apache.avro.ipc.specific.CartPage.Builder clearProductsInCart() {
      productsInCart = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public CartPage build() {
      try {
        CartPage record = new CartPage();
        record.productsInCart = fieldSetFlags()[0] ? this.productsInCart : (java.util.List<java.lang.String>) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
