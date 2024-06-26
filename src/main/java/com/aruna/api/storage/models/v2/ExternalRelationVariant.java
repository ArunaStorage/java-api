// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.models.v2;

/**
 * <pre>
 * External Relations
 * </pre>
 *
 * Protobuf enum {@code aruna.api.storage.models.v2.ExternalRelationVariant}
 */
public enum ExternalRelationVariant
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>EXTERNAL_RELATION_VARIANT_UNSPECIFIED = 0;</code>
   */
  EXTERNAL_RELATION_VARIANT_UNSPECIFIED(0),
  /**
   * <code>EXTERNAL_RELATION_VARIANT_URL = 1;</code>
   */
  EXTERNAL_RELATION_VARIANT_URL(1),
  /**
   * <code>EXTERNAL_RELATION_VARIANT_IDENTIFIER = 2;</code>
   */
  EXTERNAL_RELATION_VARIANT_IDENTIFIER(2),
  /**
   * <code>EXTERNAL_RELATION_VARIANT_CUSTOM = 3;</code>
   */
  EXTERNAL_RELATION_VARIANT_CUSTOM(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>EXTERNAL_RELATION_VARIANT_UNSPECIFIED = 0;</code>
   */
  public static final int EXTERNAL_RELATION_VARIANT_UNSPECIFIED_VALUE = 0;
  /**
   * <code>EXTERNAL_RELATION_VARIANT_URL = 1;</code>
   */
  public static final int EXTERNAL_RELATION_VARIANT_URL_VALUE = 1;
  /**
   * <code>EXTERNAL_RELATION_VARIANT_IDENTIFIER = 2;</code>
   */
  public static final int EXTERNAL_RELATION_VARIANT_IDENTIFIER_VALUE = 2;
  /**
   * <code>EXTERNAL_RELATION_VARIANT_CUSTOM = 3;</code>
   */
  public static final int EXTERNAL_RELATION_VARIANT_CUSTOM_VALUE = 3;


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
  public static ExternalRelationVariant valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ExternalRelationVariant forNumber(int value) {
    switch (value) {
      case 0: return EXTERNAL_RELATION_VARIANT_UNSPECIFIED;
      case 1: return EXTERNAL_RELATION_VARIANT_URL;
      case 2: return EXTERNAL_RELATION_VARIANT_IDENTIFIER;
      case 3: return EXTERNAL_RELATION_VARIANT_CUSTOM;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ExternalRelationVariant>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ExternalRelationVariant> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ExternalRelationVariant>() {
          public ExternalRelationVariant findValueByNumber(int number) {
            return ExternalRelationVariant.forNumber(number);
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
    return com.aruna.api.storage.models.v2.ModelsProto.getDescriptor().getEnumTypes().get(6);
  }

  private static final ExternalRelationVariant[] VALUES = values();

  public static ExternalRelationVariant valueOf(
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

  private ExternalRelationVariant(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:aruna.api.storage.models.v2.ExternalRelationVariant)
}

