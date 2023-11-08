// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.models.v2;

/**
 * <pre>
 * Status for endpoints
 * </pre>
 *
 * Protobuf enum {@code aruna.api.storage.models.v2.ComponentStatus}
 */
public enum ComponentStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>COMPONENT_STATUS_UNSPECIFIED = 0;</code>
   */
  COMPONENT_STATUS_UNSPECIFIED(0),
  /**
   * <code>COMPONENT_STATUS_INITIALIZING = 1;</code>
   */
  COMPONENT_STATUS_INITIALIZING(1),
  /**
   * <code>COMPONENT_STATUS_AVAILABLE = 2;</code>
   */
  COMPONENT_STATUS_AVAILABLE(2),
  /**
   * <code>COMPONENT_STATUS_DEGRADED = 3;</code>
   */
  COMPONENT_STATUS_DEGRADED(3),
  /**
   * <code>COMPONENT_STATUS_UNAVAILABLE = 4;</code>
   */
  COMPONENT_STATUS_UNAVAILABLE(4),
  /**
   * <code>COMPONENT_STATUS_MAINTENANCE = 5;</code>
   */
  COMPONENT_STATUS_MAINTENANCE(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>COMPONENT_STATUS_UNSPECIFIED = 0;</code>
   */
  public static final int COMPONENT_STATUS_UNSPECIFIED_VALUE = 0;
  /**
   * <code>COMPONENT_STATUS_INITIALIZING = 1;</code>
   */
  public static final int COMPONENT_STATUS_INITIALIZING_VALUE = 1;
  /**
   * <code>COMPONENT_STATUS_AVAILABLE = 2;</code>
   */
  public static final int COMPONENT_STATUS_AVAILABLE_VALUE = 2;
  /**
   * <code>COMPONENT_STATUS_DEGRADED = 3;</code>
   */
  public static final int COMPONENT_STATUS_DEGRADED_VALUE = 3;
  /**
   * <code>COMPONENT_STATUS_UNAVAILABLE = 4;</code>
   */
  public static final int COMPONENT_STATUS_UNAVAILABLE_VALUE = 4;
  /**
   * <code>COMPONENT_STATUS_MAINTENANCE = 5;</code>
   */
  public static final int COMPONENT_STATUS_MAINTENANCE_VALUE = 5;


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
  public static ComponentStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ComponentStatus forNumber(int value) {
    switch (value) {
      case 0: return COMPONENT_STATUS_UNSPECIFIED;
      case 1: return COMPONENT_STATUS_INITIALIZING;
      case 2: return COMPONENT_STATUS_AVAILABLE;
      case 3: return COMPONENT_STATUS_DEGRADED;
      case 4: return COMPONENT_STATUS_UNAVAILABLE;
      case 5: return COMPONENT_STATUS_MAINTENANCE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ComponentStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ComponentStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ComponentStatus>() {
          public ComponentStatus findValueByNumber(int number) {
            return ComponentStatus.forNumber(number);
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
    return com.aruna.api.storage.models.v2.ModelsProto.getDescriptor().getEnumTypes().get(10);
  }

  private static final ComponentStatus[] VALUES = values();

  public static ComponentStatus valueOf(
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

  private ComponentStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:aruna.api.storage.models.v2.ComponentStatus)
}

