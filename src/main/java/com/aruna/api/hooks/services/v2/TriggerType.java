// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/hooks/services/v2/hooks_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.hooks.services.v2;

/**
 * Protobuf enum {@code aruna.api.hooks.services.v2.TriggerType}
 */
public enum TriggerType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TRIGGER_TYPE_UNSPECIFIED = 0;</code>
   */
  TRIGGER_TYPE_UNSPECIFIED(0),
  /**
   * <code>TRIGGER_TYPE_HOOK_ADDED = 1;</code>
   */
  TRIGGER_TYPE_HOOK_ADDED(1),
  /**
   * <code>TRIGGER_TYPE_RESOURCE_CREATED = 2;</code>
   */
  TRIGGER_TYPE_RESOURCE_CREATED(2),
  /**
   * <code>TRIGGER_TYPE_LABEL_ADDED = 3;</code>
   */
  TRIGGER_TYPE_LABEL_ADDED(3),
  /**
   * <code>TRIGGER_TYPE_STATIC_LABEL_ADDED = 4;</code>
   */
  TRIGGER_TYPE_STATIC_LABEL_ADDED(4),
  /**
   * <code>TRIGGER_TYPE_HOOK_STATUS_CHANGED = 5;</code>
   */
  TRIGGER_TYPE_HOOK_STATUS_CHANGED(5),
  /**
   * <code>TRIGGER_TYPE_OBJECT_FINISHED = 6;</code>
   */
  TRIGGER_TYPE_OBJECT_FINISHED(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TRIGGER_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int TRIGGER_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>TRIGGER_TYPE_HOOK_ADDED = 1;</code>
   */
  public static final int TRIGGER_TYPE_HOOK_ADDED_VALUE = 1;
  /**
   * <code>TRIGGER_TYPE_RESOURCE_CREATED = 2;</code>
   */
  public static final int TRIGGER_TYPE_RESOURCE_CREATED_VALUE = 2;
  /**
   * <code>TRIGGER_TYPE_LABEL_ADDED = 3;</code>
   */
  public static final int TRIGGER_TYPE_LABEL_ADDED_VALUE = 3;
  /**
   * <code>TRIGGER_TYPE_STATIC_LABEL_ADDED = 4;</code>
   */
  public static final int TRIGGER_TYPE_STATIC_LABEL_ADDED_VALUE = 4;
  /**
   * <code>TRIGGER_TYPE_HOOK_STATUS_CHANGED = 5;</code>
   */
  public static final int TRIGGER_TYPE_HOOK_STATUS_CHANGED_VALUE = 5;
  /**
   * <code>TRIGGER_TYPE_OBJECT_FINISHED = 6;</code>
   */
  public static final int TRIGGER_TYPE_OBJECT_FINISHED_VALUE = 6;


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
  public static TriggerType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TriggerType forNumber(int value) {
    switch (value) {
      case 0: return TRIGGER_TYPE_UNSPECIFIED;
      case 1: return TRIGGER_TYPE_HOOK_ADDED;
      case 2: return TRIGGER_TYPE_RESOURCE_CREATED;
      case 3: return TRIGGER_TYPE_LABEL_ADDED;
      case 4: return TRIGGER_TYPE_STATIC_LABEL_ADDED;
      case 5: return TRIGGER_TYPE_HOOK_STATUS_CHANGED;
      case 6: return TRIGGER_TYPE_OBJECT_FINISHED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TriggerType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TriggerType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TriggerType>() {
          public TriggerType findValueByNumber(int number) {
            return TriggerType.forNumber(number);
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
    return com.aruna.api.hooks.services.v2.HooksServiceProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final TriggerType[] VALUES = values();

  public static TriggerType valueOf(
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

  private TriggerType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:aruna.api.hooks.services.v2.TriggerType)
}

