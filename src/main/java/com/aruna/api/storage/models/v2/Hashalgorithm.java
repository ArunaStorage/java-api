// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.models.v2;

/**
 * Protobuf enum {@code aruna.api.storage.models.v2.Hashalgorithm}
 */
public enum Hashalgorithm
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>HASHALGORITHM_UNSPECIFIED = 0;</code>
   */
  HASHALGORITHM_UNSPECIFIED(0),
  /**
   * <code>HASHALGORITHM_MD5 = 1;</code>
   */
  HASHALGORITHM_MD5(1),
  /**
   * <code>HASHALGORITHM_SHA256 = 2;</code>
   */
  HASHALGORITHM_SHA256(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>HASHALGORITHM_UNSPECIFIED = 0;</code>
   */
  public static final int HASHALGORITHM_UNSPECIFIED_VALUE = 0;
  /**
   * <code>HASHALGORITHM_MD5 = 1;</code>
   */
  public static final int HASHALGORITHM_MD5_VALUE = 1;
  /**
   * <code>HASHALGORITHM_SHA256 = 2;</code>
   */
  public static final int HASHALGORITHM_SHA256_VALUE = 2;


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
  public static Hashalgorithm valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Hashalgorithm forNumber(int value) {
    switch (value) {
      case 0: return HASHALGORITHM_UNSPECIFIED;
      case 1: return HASHALGORITHM_MD5;
      case 2: return HASHALGORITHM_SHA256;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Hashalgorithm>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Hashalgorithm> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Hashalgorithm>() {
          public Hashalgorithm findValueByNumber(int number) {
            return Hashalgorithm.forNumber(number);
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
    return com.aruna.api.storage.models.v2.ModelsProto.getDescriptor().getEnumTypes().get(12);
  }

  private static final Hashalgorithm[] VALUES = values();

  public static Hashalgorithm valueOf(
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

  private Hashalgorithm(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:aruna.api.storage.models.v2.Hashalgorithm)
}

