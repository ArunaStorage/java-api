// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 3.25.1
package com.aruna.api.storage.models.v2;

/**
 * <pre>
 * Permission Levels
 * </pre>
 *
 * Protobuf enum {@code aruna.api.storage.models.v2.PermissionLevel}
 */
public enum PermissionLevel
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PERMISSION_LEVEL_UNSPECIFIED = 0;</code>
   */
  PERMISSION_LEVEL_UNSPECIFIED(0),
  /**
   * <code>PERMISSION_LEVEL_NONE = 2;</code>
   */
  PERMISSION_LEVEL_NONE(2),
  /**
   * <code>PERMISSION_LEVEL_READ = 3;</code>
   */
  PERMISSION_LEVEL_READ(3),
  /**
   * <code>PERMISSION_LEVEL_APPEND = 4;</code>
   */
  PERMISSION_LEVEL_APPEND(4),
  /**
   * <code>PERMISSION_LEVEL_WRITE = 5;</code>
   */
  PERMISSION_LEVEL_WRITE(5),
  /**
   * <code>PERMISSION_LEVEL_ADMIN = 6;</code>
   */
  PERMISSION_LEVEL_ADMIN(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PERMISSION_LEVEL_UNSPECIFIED = 0;</code>
   */
  public static final int PERMISSION_LEVEL_UNSPECIFIED_VALUE = 0;
  /**
   * <code>PERMISSION_LEVEL_NONE = 2;</code>
   */
  public static final int PERMISSION_LEVEL_NONE_VALUE = 2;
  /**
   * <code>PERMISSION_LEVEL_READ = 3;</code>
   */
  public static final int PERMISSION_LEVEL_READ_VALUE = 3;
  /**
   * <code>PERMISSION_LEVEL_APPEND = 4;</code>
   */
  public static final int PERMISSION_LEVEL_APPEND_VALUE = 4;
  /**
   * <code>PERMISSION_LEVEL_WRITE = 5;</code>
   */
  public static final int PERMISSION_LEVEL_WRITE_VALUE = 5;
  /**
   * <code>PERMISSION_LEVEL_ADMIN = 6;</code>
   */
  public static final int PERMISSION_LEVEL_ADMIN_VALUE = 6;


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
  public static PermissionLevel valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PermissionLevel forNumber(int value) {
    switch (value) {
      case 0: return PERMISSION_LEVEL_UNSPECIFIED;
      case 2: return PERMISSION_LEVEL_NONE;
      case 3: return PERMISSION_LEVEL_READ;
      case 4: return PERMISSION_LEVEL_APPEND;
      case 5: return PERMISSION_LEVEL_WRITE;
      case 6: return PERMISSION_LEVEL_ADMIN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PermissionLevel>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PermissionLevel> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PermissionLevel>() {
          public PermissionLevel findValueByNumber(int number) {
            return PermissionLevel.forNumber(number);
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
    return com.aruna.api.storage.models.v2.ModelsProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final PermissionLevel[] VALUES = values();

  public static PermissionLevel valueOf(
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

  private PermissionLevel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:aruna.api.storage.models.v2.PermissionLevel)
}

