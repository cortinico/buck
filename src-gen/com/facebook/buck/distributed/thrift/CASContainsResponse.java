/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-11-25")
public class CASContainsResponse implements org.apache.thrift.TBase<CASContainsResponse, CASContainsResponse._Fields>, java.io.Serializable, Cloneable, Comparable<CASContainsResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CASContainsResponse");

  private static final org.apache.thrift.protocol.TField EXISTS_FIELD_DESC = new org.apache.thrift.protocol.TField("exists", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CASContainsResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CASContainsResponseTupleSchemeFactory());
  }

  public List<Boolean> exists; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXISTS((short)1, "exists");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // EXISTS
          return EXISTS;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.EXISTS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXISTS, new org.apache.thrift.meta_data.FieldMetaData("exists", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CASContainsResponse.class, metaDataMap);
  }

  public CASContainsResponse() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CASContainsResponse(CASContainsResponse other) {
    if (other.isSetExists()) {
      List<Boolean> __this__exists = new ArrayList<Boolean>(other.exists);
      this.exists = __this__exists;
    }
  }

  public CASContainsResponse deepCopy() {
    return new CASContainsResponse(this);
  }

  @Override
  public void clear() {
    this.exists = null;
  }

  public int getExistsSize() {
    return (this.exists == null) ? 0 : this.exists.size();
  }

  public java.util.Iterator<Boolean> getExistsIterator() {
    return (this.exists == null) ? null : this.exists.iterator();
  }

  public void addToExists(boolean elem) {
    if (this.exists == null) {
      this.exists = new ArrayList<Boolean>();
    }
    this.exists.add(elem);
  }

  public List<Boolean> getExists() {
    return this.exists;
  }

  public CASContainsResponse setExists(List<Boolean> exists) {
    this.exists = exists;
    return this;
  }

  public void unsetExists() {
    this.exists = null;
  }

  /** Returns true if field exists is set (has been assigned a value) and false otherwise */
  public boolean isSetExists() {
    return this.exists != null;
  }

  public void setExistsIsSet(boolean value) {
    if (!value) {
      this.exists = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXISTS:
      if (value == null) {
        unsetExists();
      } else {
        setExists((List<Boolean>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXISTS:
      return getExists();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXISTS:
      return isSetExists();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CASContainsResponse)
      return this.equals((CASContainsResponse)that);
    return false;
  }

  public boolean equals(CASContainsResponse that) {
    if (that == null)
      return false;

    boolean this_present_exists = true && this.isSetExists();
    boolean that_present_exists = true && that.isSetExists();
    if (this_present_exists || that_present_exists) {
      if (!(this_present_exists && that_present_exists))
        return false;
      if (!this.exists.equals(that.exists))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_exists = true && (isSetExists());
    list.add(present_exists);
    if (present_exists)
      list.add(exists);

    return list.hashCode();
  }

  @Override
  public int compareTo(CASContainsResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetExists()).compareTo(other.isSetExists());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExists()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exists, other.exists);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CASContainsResponse(");
    boolean first = true;

    if (isSetExists()) {
      sb.append("exists:");
      if (this.exists == null) {
        sb.append("null");
      } else {
        sb.append(this.exists);
      }
      first = false;
    }
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CASContainsResponseStandardSchemeFactory implements SchemeFactory {
    public CASContainsResponseStandardScheme getScheme() {
      return new CASContainsResponseStandardScheme();
    }
  }

  private static class CASContainsResponseStandardScheme extends StandardScheme<CASContainsResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CASContainsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXISTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list50 = iprot.readListBegin();
                struct.exists = new ArrayList<Boolean>(_list50.size);
                boolean _elem51;
                for (int _i52 = 0; _i52 < _list50.size; ++_i52)
                {
                  _elem51 = iprot.readBool();
                  struct.exists.add(_elem51);
                }
                iprot.readListEnd();
              }
              struct.setExistsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CASContainsResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.exists != null) {
        if (struct.isSetExists()) {
          oprot.writeFieldBegin(EXISTS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.BOOL, struct.exists.size()));
            for (boolean _iter53 : struct.exists)
            {
              oprot.writeBool(_iter53);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CASContainsResponseTupleSchemeFactory implements SchemeFactory {
    public CASContainsResponseTupleScheme getScheme() {
      return new CASContainsResponseTupleScheme();
    }
  }

  private static class CASContainsResponseTupleScheme extends TupleScheme<CASContainsResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CASContainsResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetExists()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetExists()) {
        {
          oprot.writeI32(struct.exists.size());
          for (boolean _iter54 : struct.exists)
          {
            oprot.writeBool(_iter54);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CASContainsResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list55 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.BOOL, iprot.readI32());
          struct.exists = new ArrayList<Boolean>(_list55.size);
          boolean _elem56;
          for (int _i57 = 0; _i57 < _list55.size; ++_i57)
          {
            _elem56 = iprot.readBool();
            struct.exists.add(_elem56);
          }
        }
        struct.setExistsIsSet(true);
      }
    }
  }

}

