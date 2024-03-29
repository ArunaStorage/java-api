// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/hooks/services/v2/hooks_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.hooks.services.v2;

/**
 * Protobuf enum {@code aruna.api.hooks.services.v2.Method}
 */
public enum Method
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>METHOD_UNSPECIFIED = 0;</code>
   */
  METHOD_UNSPECIFIED(0),
  /**
   * <code>METHOD_PUT = 1;</code>
   */
  METHOD_PUT(1),
  /**
   * <code>METHOD_POST = 2;</code>
   */
  METHOD_POST(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>METHOD_UNSPECIFIED = 0;</code>
   */
  public static final int METHOD_UNSPECIFIED_VALUE = 0;
  /**
   * <code>METHOD_PUT = 1;</code>
   */
  public static final int METHOD_PUT_VALUE = 1;
  /**
   * <code>METHOD_POST = 2;</code>
   */
  public static final int METHOD_POST_VALUE = 2;


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
  public static Method valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Method forNumber(int value) {
    switch (value) {
      case 0: return METHOD_UNSPECIFIED;
      case 1: return METHOD_PUT;
      case 2: return METHOD_POST;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Method>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Method> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Method>() {
          public Method findValueByNumber(int number) {
            return Method.forNumber(number);
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
    return com.aruna.api.hooks.services.v2.HooksServiceProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final Method[] VALUES = values();

  public static Method valueOf(
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

  private Method(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:aruna.api.hooks.services.v2.Method)
}

