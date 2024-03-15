// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.models.v2;

/**
 * <pre>
 * Which kind of endpoint 
 * </pre>
 *
 * Protobuf enum {@code aruna.api.storage.models.v2.EndpointVariant}
 */
public enum EndpointVariant
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ENDPOINT_VARIANT_UNSPECIFIED = 0;</code>
   */
  ENDPOINT_VARIANT_UNSPECIFIED(0),
  /**
   * <code>ENDPOINT_VARIANT_PERSISTENT = 1;</code>
   */
  ENDPOINT_VARIANT_PERSISTENT(1),
  /**
   * <code>ENDPOINT_VARIANT_VOLATILE = 2;</code>
   */
  ENDPOINT_VARIANT_VOLATILE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ENDPOINT_VARIANT_UNSPECIFIED = 0;</code>
   */
  public static final int ENDPOINT_VARIANT_UNSPECIFIED_VALUE = 0;
  /**
   * <code>ENDPOINT_VARIANT_PERSISTENT = 1;</code>
   */
  public static final int ENDPOINT_VARIANT_PERSISTENT_VALUE = 1;
  /**
   * <code>ENDPOINT_VARIANT_VOLATILE = 2;</code>
   */
  public static final int ENDPOINT_VARIANT_VOLATILE_VALUE = 2;


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
  public static EndpointVariant valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EndpointVariant forNumber(int value) {
    switch (value) {
      case 0: return ENDPOINT_VARIANT_UNSPECIFIED;
      case 1: return ENDPOINT_VARIANT_PERSISTENT;
      case 2: return ENDPOINT_VARIANT_VOLATILE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EndpointVariant>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EndpointVariant> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EndpointVariant>() {
          public EndpointVariant findValueByNumber(int number) {
            return EndpointVariant.forNumber(number);
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
    return com.aruna.api.storage.models.v2.ModelsProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final EndpointVariant[] VALUES = values();

  public static EndpointVariant valueOf(
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

  private EndpointVariant(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:aruna.api.storage.models.v2.EndpointVariant)
}

