// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/user_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

/**
 * Protobuf enum {@code aruna.api.storage.services.v2.PersonalNotificationVariant}
 */
public enum PersonalNotificationVariant
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PERSONAL_NOTIFICATION_VARIANT_UNSPECIFIED = 0;</code>
   */
  PERSONAL_NOTIFICATION_VARIANT_UNSPECIFIED(0),
  /**
   * <code>PERSONAL_NOTIFICATION_VARIANT_ACCESS_REQUESTED = 1;</code>
   */
  PERSONAL_NOTIFICATION_VARIANT_ACCESS_REQUESTED(1),
  /**
   * <code>PERSONAL_NOTIFICATION_VARIANT_PERMISSION_GRANTED = 2;</code>
   */
  PERSONAL_NOTIFICATION_VARIANT_PERMISSION_GRANTED(2),
  /**
   * <code>PERSONAL_NOTIFICATION_VARIANT_PERMISSION_REVOKED = 3;</code>
   */
  PERSONAL_NOTIFICATION_VARIANT_PERMISSION_REVOKED(3),
  /**
   * <code>PERSONAL_NOTIFICATION_VARIANT_PERMISSION_UPDATED = 4;</code>
   */
  PERSONAL_NOTIFICATION_VARIANT_PERMISSION_UPDATED(4),
  /**
   * <code>PERSONAL_NOTIFICATION_VARIANT_ANNOUNCEMENT = 5;</code>
   */
  PERSONAL_NOTIFICATION_VARIANT_ANNOUNCEMENT(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PERSONAL_NOTIFICATION_VARIANT_UNSPECIFIED = 0;</code>
   */
  public static final int PERSONAL_NOTIFICATION_VARIANT_UNSPECIFIED_VALUE = 0;
  /**
   * <code>PERSONAL_NOTIFICATION_VARIANT_ACCESS_REQUESTED = 1;</code>
   */
  public static final int PERSONAL_NOTIFICATION_VARIANT_ACCESS_REQUESTED_VALUE = 1;
  /**
   * <code>PERSONAL_NOTIFICATION_VARIANT_PERMISSION_GRANTED = 2;</code>
   */
  public static final int PERSONAL_NOTIFICATION_VARIANT_PERMISSION_GRANTED_VALUE = 2;
  /**
   * <code>PERSONAL_NOTIFICATION_VARIANT_PERMISSION_REVOKED = 3;</code>
   */
  public static final int PERSONAL_NOTIFICATION_VARIANT_PERMISSION_REVOKED_VALUE = 3;
  /**
   * <code>PERSONAL_NOTIFICATION_VARIANT_PERMISSION_UPDATED = 4;</code>
   */
  public static final int PERSONAL_NOTIFICATION_VARIANT_PERMISSION_UPDATED_VALUE = 4;
  /**
   * <code>PERSONAL_NOTIFICATION_VARIANT_ANNOUNCEMENT = 5;</code>
   */
  public static final int PERSONAL_NOTIFICATION_VARIANT_ANNOUNCEMENT_VALUE = 5;


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
  public static PersonalNotificationVariant valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PersonalNotificationVariant forNumber(int value) {
    switch (value) {
      case 0: return PERSONAL_NOTIFICATION_VARIANT_UNSPECIFIED;
      case 1: return PERSONAL_NOTIFICATION_VARIANT_ACCESS_REQUESTED;
      case 2: return PERSONAL_NOTIFICATION_VARIANT_PERMISSION_GRANTED;
      case 3: return PERSONAL_NOTIFICATION_VARIANT_PERMISSION_REVOKED;
      case 4: return PERSONAL_NOTIFICATION_VARIANT_PERMISSION_UPDATED;
      case 5: return PERSONAL_NOTIFICATION_VARIANT_ANNOUNCEMENT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PersonalNotificationVariant>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PersonalNotificationVariant> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PersonalNotificationVariant>() {
          public PersonalNotificationVariant findValueByNumber(int number) {
            return PersonalNotificationVariant.forNumber(number);
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
    return com.aruna.api.storage.services.v2.UserServiceProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final PersonalNotificationVariant[] VALUES = values();

  public static PersonalNotificationVariant valueOf(
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

  private PersonalNotificationVariant(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:aruna.api.storage.services.v2.PersonalNotificationVariant)
}

