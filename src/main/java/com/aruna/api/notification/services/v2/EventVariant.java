// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/notification/services/v2/notification_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.notification.services.v2;

/**
 * Protobuf enum {@code aruna.api.notification.services.v2.EventVariant}
 */
public enum EventVariant
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>EVENT_VARIANT_UNSPECIFIED = 0;</code>
   */
  EVENT_VARIANT_UNSPECIFIED(0),
  /**
   * <code>EVENT_VARIANT_CREATED = 1;</code>
   */
  EVENT_VARIANT_CREATED(1),
  /**
   * <code>EVENT_VARIANT_AVAILABLE = 2;</code>
   */
  EVENT_VARIANT_AVAILABLE(2),
  /**
   * <code>EVENT_VARIANT_UPDATED = 3;</code>
   */
  EVENT_VARIANT_UPDATED(3),
  /**
   * <code>EVENT_VARIANT_DELETED = 4;</code>
   */
  EVENT_VARIANT_DELETED(4),
  /**
   * <code>EVENT_VARIANT_SNAPSHOTTED = 5;</code>
   */
  EVENT_VARIANT_SNAPSHOTTED(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>EVENT_VARIANT_UNSPECIFIED = 0;</code>
   */
  public static final int EVENT_VARIANT_UNSPECIFIED_VALUE = 0;
  /**
   * <code>EVENT_VARIANT_CREATED = 1;</code>
   */
  public static final int EVENT_VARIANT_CREATED_VALUE = 1;
  /**
   * <code>EVENT_VARIANT_AVAILABLE = 2;</code>
   */
  public static final int EVENT_VARIANT_AVAILABLE_VALUE = 2;
  /**
   * <code>EVENT_VARIANT_UPDATED = 3;</code>
   */
  public static final int EVENT_VARIANT_UPDATED_VALUE = 3;
  /**
   * <code>EVENT_VARIANT_DELETED = 4;</code>
   */
  public static final int EVENT_VARIANT_DELETED_VALUE = 4;
  /**
   * <code>EVENT_VARIANT_SNAPSHOTTED = 5;</code>
   */
  public static final int EVENT_VARIANT_SNAPSHOTTED_VALUE = 5;


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
  public static EventVariant valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EventVariant forNumber(int value) {
    switch (value) {
      case 0: return EVENT_VARIANT_UNSPECIFIED;
      case 1: return EVENT_VARIANT_CREATED;
      case 2: return EVENT_VARIANT_AVAILABLE;
      case 3: return EVENT_VARIANT_UPDATED;
      case 4: return EVENT_VARIANT_DELETED;
      case 5: return EVENT_VARIANT_SNAPSHOTTED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EventVariant>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EventVariant> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EventVariant>() {
          public EventVariant findValueByNumber(int number) {
            return EventVariant.forNumber(number);
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
    return com.aruna.api.notification.services.v2.NotificationServiceProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final EventVariant[] VALUES = values();

  public static EventVariant valueOf(
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

  private EventVariant(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:aruna.api.notification.services.v2.EventVariant)
}

