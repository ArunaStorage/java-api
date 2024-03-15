// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.models.v2;

/**
 * <pre>
 * InternalRelations
 * </pre>
 *
 * Protobuf enum {@code aruna.api.storage.models.v2.InternalRelationVariant}
 */
public enum InternalRelationVariant
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>INTERNAL_RELATION_VARIANT_UNSPECIFIED = 0;</code>
   */
  INTERNAL_RELATION_VARIANT_UNSPECIFIED(0),
  /**
   * <code>INTERNAL_RELATION_VARIANT_BELONGS_TO = 1;</code>
   */
  INTERNAL_RELATION_VARIANT_BELONGS_TO(1),
  /**
   * <code>INTERNAL_RELATION_VARIANT_ORIGIN = 2;</code>
   */
  INTERNAL_RELATION_VARIANT_ORIGIN(2),
  /**
   * <code>INTERNAL_RELATION_VARIANT_VERSION = 3;</code>
   */
  INTERNAL_RELATION_VARIANT_VERSION(3),
  /**
   * <code>INTERNAL_RELATION_VARIANT_METADATA = 4;</code>
   */
  INTERNAL_RELATION_VARIANT_METADATA(4),
  /**
   * <code>INTERNAL_RELATION_VARIANT_POLICY = 5;</code>
   */
  INTERNAL_RELATION_VARIANT_POLICY(5),
  /**
   * <code>INTERNAL_RELATION_VARIANT_DELETED = 6;</code>
   */
  INTERNAL_RELATION_VARIANT_DELETED(6),
  /**
   * <code>INTERNAL_RELATION_VARIANT_CUSTOM = 7;</code>
   */
  INTERNAL_RELATION_VARIANT_CUSTOM(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>INTERNAL_RELATION_VARIANT_UNSPECIFIED = 0;</code>
   */
  public static final int INTERNAL_RELATION_VARIANT_UNSPECIFIED_VALUE = 0;
  /**
   * <code>INTERNAL_RELATION_VARIANT_BELONGS_TO = 1;</code>
   */
  public static final int INTERNAL_RELATION_VARIANT_BELONGS_TO_VALUE = 1;
  /**
   * <code>INTERNAL_RELATION_VARIANT_ORIGIN = 2;</code>
   */
  public static final int INTERNAL_RELATION_VARIANT_ORIGIN_VALUE = 2;
  /**
   * <code>INTERNAL_RELATION_VARIANT_VERSION = 3;</code>
   */
  public static final int INTERNAL_RELATION_VARIANT_VERSION_VALUE = 3;
  /**
   * <code>INTERNAL_RELATION_VARIANT_METADATA = 4;</code>
   */
  public static final int INTERNAL_RELATION_VARIANT_METADATA_VALUE = 4;
  /**
   * <code>INTERNAL_RELATION_VARIANT_POLICY = 5;</code>
   */
  public static final int INTERNAL_RELATION_VARIANT_POLICY_VALUE = 5;
  /**
   * <code>INTERNAL_RELATION_VARIANT_DELETED = 6;</code>
   */
  public static final int INTERNAL_RELATION_VARIANT_DELETED_VALUE = 6;
  /**
   * <code>INTERNAL_RELATION_VARIANT_CUSTOM = 7;</code>
   */
  public static final int INTERNAL_RELATION_VARIANT_CUSTOM_VALUE = 7;


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
  public static InternalRelationVariant valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static InternalRelationVariant forNumber(int value) {
    switch (value) {
      case 0: return INTERNAL_RELATION_VARIANT_UNSPECIFIED;
      case 1: return INTERNAL_RELATION_VARIANT_BELONGS_TO;
      case 2: return INTERNAL_RELATION_VARIANT_ORIGIN;
      case 3: return INTERNAL_RELATION_VARIANT_VERSION;
      case 4: return INTERNAL_RELATION_VARIANT_METADATA;
      case 5: return INTERNAL_RELATION_VARIANT_POLICY;
      case 6: return INTERNAL_RELATION_VARIANT_DELETED;
      case 7: return INTERNAL_RELATION_VARIANT_CUSTOM;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<InternalRelationVariant>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      InternalRelationVariant> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<InternalRelationVariant>() {
          public InternalRelationVariant findValueByNumber(int number) {
            return InternalRelationVariant.forNumber(number);
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

  private static final InternalRelationVariant[] VALUES = values();

  public static InternalRelationVariant valueOf(
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

  private InternalRelationVariant(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:aruna.api.storage.models.v2.InternalRelationVariant)
}

