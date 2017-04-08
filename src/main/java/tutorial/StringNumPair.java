/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package tutorial;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-05-12")
public class StringNumPair implements org.apache.thrift.TBase<StringNumPair, StringNumPair._Fields>, java.io.Serializable, Cloneable, Comparable<StringNumPair> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StringNumPair");

  private static final org.apache.thrift.protocol.TField STR_FIELD_DESC = new org.apache.thrift.protocol.TField("str", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("num", org.apache.thrift.protocol.TType.DOUBLE, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new StringNumPairStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new StringNumPairTupleSchemeFactory();

  public java.lang.String str; // required
  public double num; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STR((short)1, "str"),
    NUM((short)2, "num");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STR
          return STR;
        case 2: // NUM
          return NUM;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __NUM_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STR, new org.apache.thrift.meta_data.FieldMetaData("str", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NUM, new org.apache.thrift.meta_data.FieldMetaData("num", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StringNumPair.class, metaDataMap);
  }

  public StringNumPair() {
  }

  public StringNumPair(
    java.lang.String str,
    double num)
  {
    this();
    this.str = str;
    this.num = num;
    setNumIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StringNumPair(StringNumPair other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStr()) {
      this.str = other.str;
    }
    this.num = other.num;
  }

  public StringNumPair deepCopy() {
    return new StringNumPair(this);
  }

  @Override
  public void clear() {
    this.str = null;
    setNumIsSet(false);
    this.num = 0.0;
  }

  public java.lang.String getStr() {
    return this.str;
  }

  public StringNumPair setStr(java.lang.String str) {
    this.str = str;
    return this;
  }

  public void unsetStr() {
    this.str = null;
  }

  /** Returns true if field str is set (has been assigned a value) and false otherwise */
  public boolean isSetStr() {
    return this.str != null;
  }

  public void setStrIsSet(boolean value) {
    if (!value) {
      this.str = null;
    }
  }

  public double getNum() {
    return this.num;
  }

  public StringNumPair setNum(double num) {
    this.num = num;
    setNumIsSet(true);
    return this;
  }

  public void unsetNum() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NUM_ISSET_ID);
  }

  /** Returns true if field num is set (has been assigned a value) and false otherwise */
  public boolean isSetNum() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NUM_ISSET_ID);
  }

  public void setNumIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NUM_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case STR:
      if (value == null) {
        unsetStr();
      } else {
        setStr((java.lang.String)value);
      }
      break;

    case NUM:
      if (value == null) {
        unsetNum();
      } else {
        setNum((java.lang.Double)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STR:
      return getStr();

    case NUM:
      return getNum();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STR:
      return isSetStr();
    case NUM:
      return isSetNum();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof StringNumPair)
      return this.equals((StringNumPair)that);
    return false;
  }

  public boolean equals(StringNumPair that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_str = true && this.isSetStr();
    boolean that_present_str = true && that.isSetStr();
    if (this_present_str || that_present_str) {
      if (!(this_present_str && that_present_str))
        return false;
      if (!this.str.equals(that.str))
        return false;
    }

    boolean this_present_num = true;
    boolean that_present_num = true;
    if (this_present_num || that_present_num) {
      if (!(this_present_num && that_present_num))
        return false;
      if (this.num != that.num)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStr()) ? 131071 : 524287);
    if (isSetStr())
      hashCode = hashCode * 8191 + str.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(num);

    return hashCode;
  }

  @Override
  public int compareTo(StringNumPair other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetStr()).compareTo(other.isSetStr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.str, other.str);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNum()).compareTo(other.isSetNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num, other.num);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("StringNumPair(");
    boolean first = true;

    sb.append("str:");
    if (this.str == null) {
      sb.append("null");
    } else {
      sb.append(this.str);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("num:");
    sb.append(this.num);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StringNumPairStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StringNumPairStandardScheme getScheme() {
      return new StringNumPairStandardScheme();
    }
  }

  private static class StringNumPairStandardScheme extends org.apache.thrift.scheme.StandardScheme<StringNumPair> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StringNumPair struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.str = iprot.readString();
              struct.setStrIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.num = iprot.readDouble();
              struct.setNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, StringNumPair struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.str != null) {
        oprot.writeFieldBegin(STR_FIELD_DESC);
        oprot.writeString(struct.str);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(NUM_FIELD_DESC);
      oprot.writeDouble(struct.num);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StringNumPairTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StringNumPairTupleScheme getScheme() {
      return new StringNumPairTupleScheme();
    }
  }

  private static class StringNumPairTupleScheme extends org.apache.thrift.scheme.TupleScheme<StringNumPair> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StringNumPair struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStr()) {
        optionals.set(0);
      }
      if (struct.isSetNum()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetStr()) {
        oprot.writeString(struct.str);
      }
      if (struct.isSetNum()) {
        oprot.writeDouble(struct.num);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StringNumPair struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.str = iprot.readString();
        struct.setStrIsSet(true);
      }
      if (incoming.get(1)) {
        struct.num = iprot.readDouble();
        struct.setNumIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

