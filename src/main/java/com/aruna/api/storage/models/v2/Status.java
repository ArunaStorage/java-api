// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.storage.models.v2;

/**
 * <pre>
 * An arbitrary status for Objects
 * </pre>
 *
 * Protobuf enum {@code aruna.api.storage.models.v2.Status}
 */
public enum Status
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unspecified
   * </pre>
   *
   * <code>STATUS_UNSPECIFIED = 0;</code>
   */
  STATUS_UNSPECIFIED(0),
  /**
   * <pre>
   * This object is initializing -&gt; Staging
   * </pre>
   *
   * <code>STATUS_INITIALIZING = 1;</code>
   */
  STATUS_INITIALIZING(1),
  /**
   * <pre>
   * Data got uploaded and a validating hook got triggered
   * </pre>
   *
   * <code>STATUS_VALIDATING = 2;</code>
   */
  STATUS_VALIDATING(2),
  /**
   * <pre>
   * Data is available
   * </pre>
   *
   * <code>STATUS_AVAILABLE = 3;</code>
   */
  STATUS_AVAILABLE(3),
  /**
   * <pre>
   * Data is temporarily not available
   * </pre>
   *
   * <code>STATUS_UNAVAILABLE = 4;</code>
   */
  STATUS_UNAVAILABLE(4),
  /**
   * <pre>
   * Validating failed or fatal error in data proxy
   * </pre>
   *
   * <code>STATUS_ERROR = 5;</code>
   */
  STATUS_ERROR(5),
  /**
   * <pre>
   * Object got deleted
   * </pre>
   *
   * <code>STATUS_DELETED = 6;</code>
   */
  STATUS_DELETED(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unspecified
   * </pre>
   *
   * <code>STATUS_UNSPECIFIED = 0;</code>
   */
  public static final int STATUS_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * This object is initializing -&gt; Staging
   * </pre>
   *
   * <code>STATUS_INITIALIZING = 1;</code>
   */
  public static final int STATUS_INITIALIZING_VALUE = 1;
  /**
   * <pre>
   * Data got uploaded and a validating hook got triggered
   * </pre>
   *
   * <code>STATUS_VALIDATING = 2;</code>
   */
  public static final int STATUS_VALIDATING_VALUE = 2;
  /**
   * <pre>
   * Data is available
   * </pre>
   *
   * <code>STATUS_AVAILABLE = 3;</code>
   */
  public static final int STATUS_AVAILABLE_VALUE = 3;
  /**
   * <pre>
   * Data is temporarily not available
   * </pre>
   *
   * <code>STATUS_UNAVAILABLE = 4;</code>
   */
  public static final int STATUS_UNAVAILABLE_VALUE = 4;
  /**
   * <pre>
   * Validating failed or fatal error in data proxy
   * </pre>
   *
   * <code>STATUS_ERROR = 5;</code>
   */
  public static final int STATUS_ERROR_VALUE = 5;
  /**
   * <pre>
   * Object got deleted
   * </pre>
   *
   * <code>STATUS_DELETED = 6;</code>
   */
  public static final int STATUS_DELETED_VALUE = 6;


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
      case 1: return STATUS_INITIALIZING;
      case 2: return STATUS_VALIDATING;
      case 3: return STATUS_AVAILABLE;
      case 4: return STATUS_UNAVAILABLE;
      case 5: return STATUS_ERROR;
      case 6: return STATUS_DELETED;
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
    return com.aruna.api.storage.models.v2.ModelsProto.getDescriptor().getEnumTypes().get(9);
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

  // @@protoc_insertion_point(enum_scope:aruna.api.storage.models.v2.Status)
}

