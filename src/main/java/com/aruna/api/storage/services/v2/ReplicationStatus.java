// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/data_replication_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.services.v2;

/**
 * Protobuf enum {@code aruna.api.storage.services.v2.ReplicationStatus}
 */
public enum ReplicationStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>REPLICATION_STATUS_UNSPECIFIED = 0;</code>
   */
  REPLICATION_STATUS_UNSPECIFIED(0),
  /**
   * <code>REPLICATION_STATUS_WAITING = 1;</code>
   */
  REPLICATION_STATUS_WAITING(1),
  /**
   * <code>REPLICATION_STATUS_RUNNING = 2;</code>
   */
  REPLICATION_STATUS_RUNNING(2),
  /**
   * <code>REPLICATION_STATUS_FINISHED = 3;</code>
   */
  REPLICATION_STATUS_FINISHED(3),
  /**
   * <code>REPLICATION_STATUS_ERROR = 4;</code>
   */
  REPLICATION_STATUS_ERROR(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>REPLICATION_STATUS_UNSPECIFIED = 0;</code>
   */
  public static final int REPLICATION_STATUS_UNSPECIFIED_VALUE = 0;
  /**
   * <code>REPLICATION_STATUS_WAITING = 1;</code>
   */
  public static final int REPLICATION_STATUS_WAITING_VALUE = 1;
  /**
   * <code>REPLICATION_STATUS_RUNNING = 2;</code>
   */
  public static final int REPLICATION_STATUS_RUNNING_VALUE = 2;
  /**
   * <code>REPLICATION_STATUS_FINISHED = 3;</code>
   */
  public static final int REPLICATION_STATUS_FINISHED_VALUE = 3;
  /**
   * <code>REPLICATION_STATUS_ERROR = 4;</code>
   */
  public static final int REPLICATION_STATUS_ERROR_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ReplicationStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ReplicationStatus forNumber(int value) {
    switch (value) {
      case 0: return REPLICATION_STATUS_UNSPECIFIED;
      case 1: return REPLICATION_STATUS_WAITING;
      case 2: return REPLICATION_STATUS_RUNNING;
      case 3: return REPLICATION_STATUS_FINISHED;
      case 4: return REPLICATION_STATUS_ERROR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ReplicationStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ReplicationStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ReplicationStatus>() {
          public ReplicationStatus findValueByNumber(int number) {
            return ReplicationStatus.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.DataReplicationServiceProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ReplicationStatus[] VALUES = values();

  public static ReplicationStatus valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ReplicationStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:aruna.api.storage.services.v2.ReplicationStatus)
}

