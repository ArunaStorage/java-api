// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/user_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

/**
 * Protobuf enum {@code aruna.api.storage.services.v2.ReferenceType}
 */
public enum ReferenceType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>REFERENCE_TYPE_UNSPECIFIED = 0;</code>
   */
  REFERENCE_TYPE_UNSPECIFIED(0),
  /**
   * <code>REFERENCE_TYPE_USER = 1;</code>
   */
  REFERENCE_TYPE_USER(1),
  /**
   * <code>REFERENCE_TYPE_RESOURCE = 2;</code>
   */
  REFERENCE_TYPE_RESOURCE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>REFERENCE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int REFERENCE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>REFERENCE_TYPE_USER = 1;</code>
   */
  public static final int REFERENCE_TYPE_USER_VALUE = 1;
  /**
   * <code>REFERENCE_TYPE_RESOURCE = 2;</code>
   */
  public static final int REFERENCE_TYPE_RESOURCE_VALUE = 2;


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
  public static ReferenceType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ReferenceType forNumber(int value) {
    switch (value) {
      case 0: return REFERENCE_TYPE_UNSPECIFIED;
      case 1: return REFERENCE_TYPE_USER;
      case 2: return REFERENCE_TYPE_RESOURCE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ReferenceType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ReferenceType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ReferenceType>() {
          public ReferenceType findValueByNumber(int number) {
            return ReferenceType.forNumber(number);
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
    return com.aruna.api.storage.services.v2.UserServiceProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ReferenceType[] VALUES = values();

  public static ReferenceType valueOf(
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

  private ReferenceType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:aruna.api.storage.services.v2.ReferenceType)
}

