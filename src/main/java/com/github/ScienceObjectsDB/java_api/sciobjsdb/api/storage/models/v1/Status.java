// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sciobjsdb/api/storage/models/v1/common_models.proto

package com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1;

/**
 * Protobuf enum {@code sciobjsdb.api.storage.models.v1.Status}
 */
public enum Status
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>STATUS_UNSPECIFIED = 0;</code>
   */
  STATUS_UNSPECIFIED(0),
  /**
   * <code>STATUS_INITIATING = 1;</code>
   */
  STATUS_INITIATING(1),
  /**
   * <code>STATUS_AVAILABLE = 2;</code>
   */
  STATUS_AVAILABLE(2),
  /**
   * <code>STATUS_UPDATING = 3;</code>
   */
  STATUS_UPDATING(3),
  /**
   * <code>STATUS_ARCHIVED = 4;</code>
   */
  STATUS_ARCHIVED(4),
  /**
   * <code>STATUS_DELETING = 5;</code>
   */
  STATUS_DELETING(5),
  /**
   * <code>STATUS_STAGING = 6;</code>
   */
  STATUS_STAGING(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>STATUS_UNSPECIFIED = 0;</code>
   */
  public static final int STATUS_UNSPECIFIED_VALUE = 0;
  /**
   * <code>STATUS_INITIATING = 1;</code>
   */
  public static final int STATUS_INITIATING_VALUE = 1;
  /**
   * <code>STATUS_AVAILABLE = 2;</code>
   */
  public static final int STATUS_AVAILABLE_VALUE = 2;
  /**
   * <code>STATUS_UPDATING = 3;</code>
   */
  public static final int STATUS_UPDATING_VALUE = 3;
  /**
   * <code>STATUS_ARCHIVED = 4;</code>
   */
  public static final int STATUS_ARCHIVED_VALUE = 4;
  /**
   * <code>STATUS_DELETING = 5;</code>
   */
  public static final int STATUS_DELETING_VALUE = 5;
  /**
   * <code>STATUS_STAGING = 6;</code>
   */
  public static final int STATUS_STAGING_VALUE = 6;


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
  public static Status valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Status forNumber(int value) {
    switch (value) {
      case 0: return STATUS_UNSPECIFIED;
      case 1: return STATUS_INITIATING;
      case 2: return STATUS_AVAILABLE;
      case 3: return STATUS_UPDATING;
      case 4: return STATUS_ARCHIVED;
      case 5: return STATUS_DELETING;
      case 6: return STATUS_STAGING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Status>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Status> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Status>() {
          public Status findValueByNumber(int number) {
            return Status.forNumber(number);
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
    return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.CommonModels.getDescriptor().getEnumTypes().get(0);
  }

  private static final Status[] VALUES = values();

  public static Status valueOf(
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

  private Status(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:sciobjsdb.api.storage.models.v1.Status)
}

