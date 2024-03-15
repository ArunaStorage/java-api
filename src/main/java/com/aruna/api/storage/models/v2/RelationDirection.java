// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.storage.models.v2;

/**
 * <pre>
 * internal object relation type (direction)
 * </pre>
 *
 * Protobuf enum {@code aruna.api.storage.models.v2.RelationDirection}
 */
public enum RelationDirection
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>RELATION_DIRECTION_UNSPECIFIED = 0;</code>
   */
  RELATION_DIRECTION_UNSPECIFIED(0),
  /**
   * <code>RELATION_DIRECTION_INBOUND = 1;</code>
   */
  RELATION_DIRECTION_INBOUND(1),
  /**
   * <code>RELATION_DIRECTION_OUTBOUND = 2;</code>
   */
  RELATION_DIRECTION_OUTBOUND(2),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      RelationDirection.class.getName());
  }
  /**
   * <code>RELATION_DIRECTION_UNSPECIFIED = 0;</code>
   */
  public static final int RELATION_DIRECTION_UNSPECIFIED_VALUE = 0;
  /**
   * <code>RELATION_DIRECTION_INBOUND = 1;</code>
   */
  public static final int RELATION_DIRECTION_INBOUND_VALUE = 1;
  /**
   * <code>RELATION_DIRECTION_OUTBOUND = 2;</code>
   */
  public static final int RELATION_DIRECTION_OUTBOUND_VALUE = 2;


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
  public static RelationDirection valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RelationDirection forNumber(int value) {
    switch (value) {
      case 0: return RELATION_DIRECTION_UNSPECIFIED;
      case 1: return RELATION_DIRECTION_INBOUND;
      case 2: return RELATION_DIRECTION_OUTBOUND;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RelationDirection>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RelationDirection> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RelationDirection>() {
          public RelationDirection findValueByNumber(int number) {
            return RelationDirection.forNumber(number);
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
    return com.aruna.api.storage.models.v2.ModelsProto.getDescriptor().getEnumTypes().get(7);
  }

  private static final RelationDirection[] VALUES = values();

  public static RelationDirection valueOf(
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

  private RelationDirection(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:aruna.api.storage.models.v2.RelationDirection)
}

