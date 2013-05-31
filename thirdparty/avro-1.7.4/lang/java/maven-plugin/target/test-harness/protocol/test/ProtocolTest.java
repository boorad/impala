/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package test;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface ProtocolTest {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"ProtocolTest\",\"namespace\":\"test\",\"types\":[{\"type\":\"enum\",\"name\":\"ProtocolPrivacy\",\"symbols\":[\"Public\",\"Private\"]},{\"type\":\"record\",\"name\":\"ProtocolUser\",\"doc\":\"User Test Bean\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"createdOn\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"privacy\",\"type\":[\"null\",\"ProtocolPrivacy\"],\"default\":null}]}],\"messages\":{}}");

  @SuppressWarnings("all")
  public interface Callback extends ProtocolTest {
    public static final org.apache.avro.Protocol PROTOCOL = test.ProtocolTest.PROTOCOL;
  }
}