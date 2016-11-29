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
public class BuildSlaveInfo implements org.apache.thrift.TBase<BuildSlaveInfo, BuildSlaveInfo._Fields>, java.io.Serializable, Cloneable, Comparable<BuildSlaveInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuildSlaveInfo");

  private static final org.apache.thrift.protocol.TField RUN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("runId", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField HOSTNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("hostname", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField COMMAND_FIELD_DESC = new org.apache.thrift.protocol.TField("command", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField STD_OUT_FIELD_DESC = new org.apache.thrift.protocol.TField("stdOut", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField STD_ERR_FIELD_DESC = new org.apache.thrift.protocol.TField("stdErr", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BuildSlaveInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BuildSlaveInfoTupleSchemeFactory());
  }

  public RunId runId; // optional
  public String hostname; // optional
  public String command; // optional
  public List<String> stdOut; // optional
  public List<String> stdErr; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RUN_ID((short)1, "runId"),
    HOSTNAME((short)2, "hostname"),
    COMMAND((short)3, "command"),
    STD_OUT((short)4, "stdOut"),
    STD_ERR((short)5, "stdErr");

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
        case 1: // RUN_ID
          return RUN_ID;
        case 2: // HOSTNAME
          return HOSTNAME;
        case 3: // COMMAND
          return COMMAND;
        case 4: // STD_OUT
          return STD_OUT;
        case 5: // STD_ERR
          return STD_ERR;
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
  private static final _Fields optionals[] = {_Fields.RUN_ID,_Fields.HOSTNAME,_Fields.COMMAND,_Fields.STD_OUT,_Fields.STD_ERR};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RUN_ID, new org.apache.thrift.meta_data.FieldMetaData("runId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RunId.class)));
    tmpMap.put(_Fields.HOSTNAME, new org.apache.thrift.meta_data.FieldMetaData("hostname", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COMMAND, new org.apache.thrift.meta_data.FieldMetaData("command", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STD_OUT, new org.apache.thrift.meta_data.FieldMetaData("stdOut", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.STD_ERR, new org.apache.thrift.meta_data.FieldMetaData("stdErr", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuildSlaveInfo.class, metaDataMap);
  }

  public BuildSlaveInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuildSlaveInfo(BuildSlaveInfo other) {
    if (other.isSetRunId()) {
      this.runId = new RunId(other.runId);
    }
    if (other.isSetHostname()) {
      this.hostname = other.hostname;
    }
    if (other.isSetCommand()) {
      this.command = other.command;
    }
    if (other.isSetStdOut()) {
      List<String> __this__stdOut = new ArrayList<String>(other.stdOut);
      this.stdOut = __this__stdOut;
    }
    if (other.isSetStdErr()) {
      List<String> __this__stdErr = new ArrayList<String>(other.stdErr);
      this.stdErr = __this__stdErr;
    }
  }

  public BuildSlaveInfo deepCopy() {
    return new BuildSlaveInfo(this);
  }

  @Override
  public void clear() {
    this.runId = null;
    this.hostname = null;
    this.command = null;
    this.stdOut = null;
    this.stdErr = null;
  }

  public RunId getRunId() {
    return this.runId;
  }

  public BuildSlaveInfo setRunId(RunId runId) {
    this.runId = runId;
    return this;
  }

  public void unsetRunId() {
    this.runId = null;
  }

  /** Returns true if field runId is set (has been assigned a value) and false otherwise */
  public boolean isSetRunId() {
    return this.runId != null;
  }

  public void setRunIdIsSet(boolean value) {
    if (!value) {
      this.runId = null;
    }
  }

  public String getHostname() {
    return this.hostname;
  }

  public BuildSlaveInfo setHostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  public void unsetHostname() {
    this.hostname = null;
  }

  /** Returns true if field hostname is set (has been assigned a value) and false otherwise */
  public boolean isSetHostname() {
    return this.hostname != null;
  }

  public void setHostnameIsSet(boolean value) {
    if (!value) {
      this.hostname = null;
    }
  }

  public String getCommand() {
    return this.command;
  }

  public BuildSlaveInfo setCommand(String command) {
    this.command = command;
    return this;
  }

  public void unsetCommand() {
    this.command = null;
  }

  /** Returns true if field command is set (has been assigned a value) and false otherwise */
  public boolean isSetCommand() {
    return this.command != null;
  }

  public void setCommandIsSet(boolean value) {
    if (!value) {
      this.command = null;
    }
  }

  public int getStdOutSize() {
    return (this.stdOut == null) ? 0 : this.stdOut.size();
  }

  public java.util.Iterator<String> getStdOutIterator() {
    return (this.stdOut == null) ? null : this.stdOut.iterator();
  }

  public void addToStdOut(String elem) {
    if (this.stdOut == null) {
      this.stdOut = new ArrayList<String>();
    }
    this.stdOut.add(elem);
  }

  public List<String> getStdOut() {
    return this.stdOut;
  }

  public BuildSlaveInfo setStdOut(List<String> stdOut) {
    this.stdOut = stdOut;
    return this;
  }

  public void unsetStdOut() {
    this.stdOut = null;
  }

  /** Returns true if field stdOut is set (has been assigned a value) and false otherwise */
  public boolean isSetStdOut() {
    return this.stdOut != null;
  }

  public void setStdOutIsSet(boolean value) {
    if (!value) {
      this.stdOut = null;
    }
  }

  public int getStdErrSize() {
    return (this.stdErr == null) ? 0 : this.stdErr.size();
  }

  public java.util.Iterator<String> getStdErrIterator() {
    return (this.stdErr == null) ? null : this.stdErr.iterator();
  }

  public void addToStdErr(String elem) {
    if (this.stdErr == null) {
      this.stdErr = new ArrayList<String>();
    }
    this.stdErr.add(elem);
  }

  public List<String> getStdErr() {
    return this.stdErr;
  }

  public BuildSlaveInfo setStdErr(List<String> stdErr) {
    this.stdErr = stdErr;
    return this;
  }

  public void unsetStdErr() {
    this.stdErr = null;
  }

  /** Returns true if field stdErr is set (has been assigned a value) and false otherwise */
  public boolean isSetStdErr() {
    return this.stdErr != null;
  }

  public void setStdErrIsSet(boolean value) {
    if (!value) {
      this.stdErr = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RUN_ID:
      if (value == null) {
        unsetRunId();
      } else {
        setRunId((RunId)value);
      }
      break;

    case HOSTNAME:
      if (value == null) {
        unsetHostname();
      } else {
        setHostname((String)value);
      }
      break;

    case COMMAND:
      if (value == null) {
        unsetCommand();
      } else {
        setCommand((String)value);
      }
      break;

    case STD_OUT:
      if (value == null) {
        unsetStdOut();
      } else {
        setStdOut((List<String>)value);
      }
      break;

    case STD_ERR:
      if (value == null) {
        unsetStdErr();
      } else {
        setStdErr((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RUN_ID:
      return getRunId();

    case HOSTNAME:
      return getHostname();

    case COMMAND:
      return getCommand();

    case STD_OUT:
      return getStdOut();

    case STD_ERR:
      return getStdErr();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RUN_ID:
      return isSetRunId();
    case HOSTNAME:
      return isSetHostname();
    case COMMAND:
      return isSetCommand();
    case STD_OUT:
      return isSetStdOut();
    case STD_ERR:
      return isSetStdErr();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuildSlaveInfo)
      return this.equals((BuildSlaveInfo)that);
    return false;
  }

  public boolean equals(BuildSlaveInfo that) {
    if (that == null)
      return false;

    boolean this_present_runId = true && this.isSetRunId();
    boolean that_present_runId = true && that.isSetRunId();
    if (this_present_runId || that_present_runId) {
      if (!(this_present_runId && that_present_runId))
        return false;
      if (!this.runId.equals(that.runId))
        return false;
    }

    boolean this_present_hostname = true && this.isSetHostname();
    boolean that_present_hostname = true && that.isSetHostname();
    if (this_present_hostname || that_present_hostname) {
      if (!(this_present_hostname && that_present_hostname))
        return false;
      if (!this.hostname.equals(that.hostname))
        return false;
    }

    boolean this_present_command = true && this.isSetCommand();
    boolean that_present_command = true && that.isSetCommand();
    if (this_present_command || that_present_command) {
      if (!(this_present_command && that_present_command))
        return false;
      if (!this.command.equals(that.command))
        return false;
    }

    boolean this_present_stdOut = true && this.isSetStdOut();
    boolean that_present_stdOut = true && that.isSetStdOut();
    if (this_present_stdOut || that_present_stdOut) {
      if (!(this_present_stdOut && that_present_stdOut))
        return false;
      if (!this.stdOut.equals(that.stdOut))
        return false;
    }

    boolean this_present_stdErr = true && this.isSetStdErr();
    boolean that_present_stdErr = true && that.isSetStdErr();
    if (this_present_stdErr || that_present_stdErr) {
      if (!(this_present_stdErr && that_present_stdErr))
        return false;
      if (!this.stdErr.equals(that.stdErr))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_runId = true && (isSetRunId());
    list.add(present_runId);
    if (present_runId)
      list.add(runId);

    boolean present_hostname = true && (isSetHostname());
    list.add(present_hostname);
    if (present_hostname)
      list.add(hostname);

    boolean present_command = true && (isSetCommand());
    list.add(present_command);
    if (present_command)
      list.add(command);

    boolean present_stdOut = true && (isSetStdOut());
    list.add(present_stdOut);
    if (present_stdOut)
      list.add(stdOut);

    boolean present_stdErr = true && (isSetStdErr());
    list.add(present_stdErr);
    if (present_stdErr)
      list.add(stdErr);

    return list.hashCode();
  }

  @Override
  public int compareTo(BuildSlaveInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRunId()).compareTo(other.isSetRunId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRunId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.runId, other.runId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHostname()).compareTo(other.isSetHostname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHostname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hostname, other.hostname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCommand()).compareTo(other.isSetCommand());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCommand()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.command, other.command);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStdOut()).compareTo(other.isSetStdOut());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStdOut()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stdOut, other.stdOut);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStdErr()).compareTo(other.isSetStdErr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStdErr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stdErr, other.stdErr);
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
    StringBuilder sb = new StringBuilder("BuildSlaveInfo(");
    boolean first = true;

    if (isSetRunId()) {
      sb.append("runId:");
      if (this.runId == null) {
        sb.append("null");
      } else {
        sb.append(this.runId);
      }
      first = false;
    }
    if (isSetHostname()) {
      if (!first) sb.append(", ");
      sb.append("hostname:");
      if (this.hostname == null) {
        sb.append("null");
      } else {
        sb.append(this.hostname);
      }
      first = false;
    }
    if (isSetCommand()) {
      if (!first) sb.append(", ");
      sb.append("command:");
      if (this.command == null) {
        sb.append("null");
      } else {
        sb.append(this.command);
      }
      first = false;
    }
    if (isSetStdOut()) {
      if (!first) sb.append(", ");
      sb.append("stdOut:");
      if (this.stdOut == null) {
        sb.append("null");
      } else {
        sb.append(this.stdOut);
      }
      first = false;
    }
    if (isSetStdErr()) {
      if (!first) sb.append(", ");
      sb.append("stdErr:");
      if (this.stdErr == null) {
        sb.append("null");
      } else {
        sb.append(this.stdErr);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (runId != null) {
      runId.validate();
    }
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

  private static class BuildSlaveInfoStandardSchemeFactory implements SchemeFactory {
    public BuildSlaveInfoStandardScheme getScheme() {
      return new BuildSlaveInfoStandardScheme();
    }
  }

  private static class BuildSlaveInfoStandardScheme extends StandardScheme<BuildSlaveInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuildSlaveInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RUN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.runId = new RunId();
              struct.runId.read(iprot);
              struct.setRunIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HOSTNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.hostname = iprot.readString();
              struct.setHostnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COMMAND
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.command = iprot.readString();
              struct.setCommandIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STD_OUT
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.stdOut = new ArrayList<String>(_list8.size);
                String _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = iprot.readString();
                  struct.stdOut.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setStdOutIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STD_ERR
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list11 = iprot.readListBegin();
                struct.stdErr = new ArrayList<String>(_list11.size);
                String _elem12;
                for (int _i13 = 0; _i13 < _list11.size; ++_i13)
                {
                  _elem12 = iprot.readString();
                  struct.stdErr.add(_elem12);
                }
                iprot.readListEnd();
              }
              struct.setStdErrIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuildSlaveInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.runId != null) {
        if (struct.isSetRunId()) {
          oprot.writeFieldBegin(RUN_ID_FIELD_DESC);
          struct.runId.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.hostname != null) {
        if (struct.isSetHostname()) {
          oprot.writeFieldBegin(HOSTNAME_FIELD_DESC);
          oprot.writeString(struct.hostname);
          oprot.writeFieldEnd();
        }
      }
      if (struct.command != null) {
        if (struct.isSetCommand()) {
          oprot.writeFieldBegin(COMMAND_FIELD_DESC);
          oprot.writeString(struct.command);
          oprot.writeFieldEnd();
        }
      }
      if (struct.stdOut != null) {
        if (struct.isSetStdOut()) {
          oprot.writeFieldBegin(STD_OUT_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.stdOut.size()));
            for (String _iter14 : struct.stdOut)
            {
              oprot.writeString(_iter14);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.stdErr != null) {
        if (struct.isSetStdErr()) {
          oprot.writeFieldBegin(STD_ERR_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.stdErr.size()));
            for (String _iter15 : struct.stdErr)
            {
              oprot.writeString(_iter15);
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

  private static class BuildSlaveInfoTupleSchemeFactory implements SchemeFactory {
    public BuildSlaveInfoTupleScheme getScheme() {
      return new BuildSlaveInfoTupleScheme();
    }
  }

  private static class BuildSlaveInfoTupleScheme extends TupleScheme<BuildSlaveInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuildSlaveInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRunId()) {
        optionals.set(0);
      }
      if (struct.isSetHostname()) {
        optionals.set(1);
      }
      if (struct.isSetCommand()) {
        optionals.set(2);
      }
      if (struct.isSetStdOut()) {
        optionals.set(3);
      }
      if (struct.isSetStdErr()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetRunId()) {
        struct.runId.write(oprot);
      }
      if (struct.isSetHostname()) {
        oprot.writeString(struct.hostname);
      }
      if (struct.isSetCommand()) {
        oprot.writeString(struct.command);
      }
      if (struct.isSetStdOut()) {
        {
          oprot.writeI32(struct.stdOut.size());
          for (String _iter16 : struct.stdOut)
          {
            oprot.writeString(_iter16);
          }
        }
      }
      if (struct.isSetStdErr()) {
        {
          oprot.writeI32(struct.stdErr.size());
          for (String _iter17 : struct.stdErr)
          {
            oprot.writeString(_iter17);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuildSlaveInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.runId = new RunId();
        struct.runId.read(iprot);
        struct.setRunIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.hostname = iprot.readString();
        struct.setHostnameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.command = iprot.readString();
        struct.setCommandIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list18 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.stdOut = new ArrayList<String>(_list18.size);
          String _elem19;
          for (int _i20 = 0; _i20 < _list18.size; ++_i20)
          {
            _elem19 = iprot.readString();
            struct.stdOut.add(_elem19);
          }
        }
        struct.setStdOutIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.stdErr = new ArrayList<String>(_list21.size);
          String _elem22;
          for (int _i23 = 0; _i23 < _list21.size; ++_i23)
          {
            _elem22 = iprot.readString();
            struct.stdErr.add(_elem22);
          }
        }
        struct.setStdErrIsSet(true);
      }
    }
  }

}

