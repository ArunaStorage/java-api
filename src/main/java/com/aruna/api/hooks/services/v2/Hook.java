// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/hooks/services/v2/hooks_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.hooks.services.v2;

/**
 * Protobuf type {@code aruna.api.hooks.services.v2.Hook}
 */
public final class Hook extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.hooks.services.v2.Hook)
    HookOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Hook.newBuilder() to construct.
  private Hook(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Hook() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Hook();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.hooks.services.v2.HooksServiceProto.internal_static_aruna_api_hooks_services_v2_Hook_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.hooks.services.v2.HooksServiceProto.internal_static_aruna_api_hooks_services_v2_Hook_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.hooks.services.v2.Hook.class, com.aruna.api.hooks.services.v2.Hook.Builder.class);
  }

  private int hookTypeCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object hookType_;
  public enum HookTypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    EXTERNAL_HOOK(1),
    INTERNAL_HOOK(2),
    HOOKTYPE_NOT_SET(0);
    private final int value;
    private HookTypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static HookTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static HookTypeCase forNumber(int value) {
      switch (value) {
        case 1: return EXTERNAL_HOOK;
        case 2: return INTERNAL_HOOK;
        case 0: return HOOKTYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public HookTypeCase
  getHookTypeCase() {
    return HookTypeCase.forNumber(
        hookTypeCase_);
  }

  public static final int EXTERNAL_HOOK_FIELD_NUMBER = 1;
  /**
   * <code>.aruna.api.hooks.services.v2.ExternalHook external_hook = 1 [json_name = "externalHook"];</code>
   * @return Whether the externalHook field is set.
   */
  @java.lang.Override
  public boolean hasExternalHook() {
    return hookTypeCase_ == 1;
  }
  /**
   * <code>.aruna.api.hooks.services.v2.ExternalHook external_hook = 1 [json_name = "externalHook"];</code>
   * @return The externalHook.
   */
  @java.lang.Override
  public com.aruna.api.hooks.services.v2.ExternalHook getExternalHook() {
    if (hookTypeCase_ == 1) {
       return (com.aruna.api.hooks.services.v2.ExternalHook) hookType_;
    }
    return com.aruna.api.hooks.services.v2.ExternalHook.getDefaultInstance();
  }
  /**
   * <code>.aruna.api.hooks.services.v2.ExternalHook external_hook = 1 [json_name = "externalHook"];</code>
   */
  @java.lang.Override
  public com.aruna.api.hooks.services.v2.ExternalHookOrBuilder getExternalHookOrBuilder() {
    if (hookTypeCase_ == 1) {
       return (com.aruna.api.hooks.services.v2.ExternalHook) hookType_;
    }
    return com.aruna.api.hooks.services.v2.ExternalHook.getDefaultInstance();
  }

  public static final int INTERNAL_HOOK_FIELD_NUMBER = 2;
  /**
   * <code>.aruna.api.hooks.services.v2.InternalHook internal_hook = 2 [json_name = "internalHook"];</code>
   * @return Whether the internalHook field is set.
   */
  @java.lang.Override
  public boolean hasInternalHook() {
    return hookTypeCase_ == 2;
  }
  /**
   * <code>.aruna.api.hooks.services.v2.InternalHook internal_hook = 2 [json_name = "internalHook"];</code>
   * @return The internalHook.
   */
  @java.lang.Override
  public com.aruna.api.hooks.services.v2.InternalHook getInternalHook() {
    if (hookTypeCase_ == 2) {
       return (com.aruna.api.hooks.services.v2.InternalHook) hookType_;
    }
    return com.aruna.api.hooks.services.v2.InternalHook.getDefaultInstance();
  }
  /**
   * <code>.aruna.api.hooks.services.v2.InternalHook internal_hook = 2 [json_name = "internalHook"];</code>
   */
  @java.lang.Override
  public com.aruna.api.hooks.services.v2.InternalHookOrBuilder getInternalHookOrBuilder() {
    if (hookTypeCase_ == 2) {
       return (com.aruna.api.hooks.services.v2.InternalHook) hookType_;
    }
    return com.aruna.api.hooks.services.v2.InternalHook.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (hookTypeCase_ == 1) {
      output.writeMessage(1, (com.aruna.api.hooks.services.v2.ExternalHook) hookType_);
    }
    if (hookTypeCase_ == 2) {
      output.writeMessage(2, (com.aruna.api.hooks.services.v2.InternalHook) hookType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hookTypeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.aruna.api.hooks.services.v2.ExternalHook) hookType_);
    }
    if (hookTypeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.aruna.api.hooks.services.v2.InternalHook) hookType_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.aruna.api.hooks.services.v2.Hook)) {
      return super.equals(obj);
    }
    com.aruna.api.hooks.services.v2.Hook other = (com.aruna.api.hooks.services.v2.Hook) obj;

    if (!getHookTypeCase().equals(other.getHookTypeCase())) return false;
    switch (hookTypeCase_) {
      case 1:
        if (!getExternalHook()
            .equals(other.getExternalHook())) return false;
        break;
      case 2:
        if (!getInternalHook()
            .equals(other.getInternalHook())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (hookTypeCase_) {
      case 1:
        hash = (37 * hash) + EXTERNAL_HOOK_FIELD_NUMBER;
        hash = (53 * hash) + getExternalHook().hashCode();
        break;
      case 2:
        hash = (37 * hash) + INTERNAL_HOOK_FIELD_NUMBER;
        hash = (53 * hash) + getInternalHook().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.hooks.services.v2.Hook parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.hooks.services.v2.Hook parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.hooks.services.v2.Hook parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.hooks.services.v2.Hook parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.hooks.services.v2.Hook parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.hooks.services.v2.Hook parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.hooks.services.v2.Hook parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.hooks.services.v2.Hook parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.hooks.services.v2.Hook parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.hooks.services.v2.Hook parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.hooks.services.v2.Hook parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.hooks.services.v2.Hook parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.aruna.api.hooks.services.v2.Hook prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code aruna.api.hooks.services.v2.Hook}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.hooks.services.v2.Hook)
      com.aruna.api.hooks.services.v2.HookOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.hooks.services.v2.HooksServiceProto.internal_static_aruna_api_hooks_services_v2_Hook_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.hooks.services.v2.HooksServiceProto.internal_static_aruna_api_hooks_services_v2_Hook_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.hooks.services.v2.Hook.class, com.aruna.api.hooks.services.v2.Hook.Builder.class);
    }

    // Construct using com.aruna.api.hooks.services.v2.Hook.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (externalHookBuilder_ != null) {
        externalHookBuilder_.clear();
      }
      if (internalHookBuilder_ != null) {
        internalHookBuilder_.clear();
      }
      hookTypeCase_ = 0;
      hookType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.hooks.services.v2.HooksServiceProto.internal_static_aruna_api_hooks_services_v2_Hook_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.hooks.services.v2.Hook getDefaultInstanceForType() {
      return com.aruna.api.hooks.services.v2.Hook.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.hooks.services.v2.Hook build() {
      com.aruna.api.hooks.services.v2.Hook result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.hooks.services.v2.Hook buildPartial() {
      com.aruna.api.hooks.services.v2.Hook result = new com.aruna.api.hooks.services.v2.Hook(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.hooks.services.v2.Hook result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.aruna.api.hooks.services.v2.Hook result) {
      result.hookTypeCase_ = hookTypeCase_;
      result.hookType_ = this.hookType_;
      if (hookTypeCase_ == 1 &&
          externalHookBuilder_ != null) {
        result.hookType_ = externalHookBuilder_.build();
      }
      if (hookTypeCase_ == 2 &&
          internalHookBuilder_ != null) {
        result.hookType_ = internalHookBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.aruna.api.hooks.services.v2.Hook) {
        return mergeFrom((com.aruna.api.hooks.services.v2.Hook)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.hooks.services.v2.Hook other) {
      if (other == com.aruna.api.hooks.services.v2.Hook.getDefaultInstance()) return this;
      switch (other.getHookTypeCase()) {
        case EXTERNAL_HOOK: {
          mergeExternalHook(other.getExternalHook());
          break;
        }
        case INTERNAL_HOOK: {
          mergeInternalHook(other.getInternalHook());
          break;
        }
        case HOOKTYPE_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getExternalHookFieldBuilder().getBuilder(),
                  extensionRegistry);
              hookTypeCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getInternalHookFieldBuilder().getBuilder(),
                  extensionRegistry);
              hookTypeCase_ = 2;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int hookTypeCase_ = 0;
    private java.lang.Object hookType_;
    public HookTypeCase
        getHookTypeCase() {
      return HookTypeCase.forNumber(
          hookTypeCase_);
    }

    public Builder clearHookType() {
      hookTypeCase_ = 0;
      hookType_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.hooks.services.v2.ExternalHook, com.aruna.api.hooks.services.v2.ExternalHook.Builder, com.aruna.api.hooks.services.v2.ExternalHookOrBuilder> externalHookBuilder_;
    /**
     * <code>.aruna.api.hooks.services.v2.ExternalHook external_hook = 1 [json_name = "externalHook"];</code>
     * @return Whether the externalHook field is set.
     */
    @java.lang.Override
    public boolean hasExternalHook() {
      return hookTypeCase_ == 1;
    }
    /**
     * <code>.aruna.api.hooks.services.v2.ExternalHook external_hook = 1 [json_name = "externalHook"];</code>
     * @return The externalHook.
     */
    @java.lang.Override
    public com.aruna.api.hooks.services.v2.ExternalHook getExternalHook() {
      if (externalHookBuilder_ == null) {
        if (hookTypeCase_ == 1) {
          return (com.aruna.api.hooks.services.v2.ExternalHook) hookType_;
        }
        return com.aruna.api.hooks.services.v2.ExternalHook.getDefaultInstance();
      } else {
        if (hookTypeCase_ == 1) {
          return externalHookBuilder_.getMessage();
        }
        return com.aruna.api.hooks.services.v2.ExternalHook.getDefaultInstance();
      }
    }
    /**
     * <code>.aruna.api.hooks.services.v2.ExternalHook external_hook = 1 [json_name = "externalHook"];</code>
     */
    public Builder setExternalHook(com.aruna.api.hooks.services.v2.ExternalHook value) {
      if (externalHookBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hookType_ = value;
        onChanged();
      } else {
        externalHookBuilder_.setMessage(value);
      }
      hookTypeCase_ = 1;
      return this;
    }
    /**
     * <code>.aruna.api.hooks.services.v2.ExternalHook external_hook = 1 [json_name = "externalHook"];</code>
     */
    public Builder setExternalHook(
        com.aruna.api.hooks.services.v2.ExternalHook.Builder builderForValue) {
      if (externalHookBuilder_ == null) {
        hookType_ = builderForValue.build();
        onChanged();
      } else {
        externalHookBuilder_.setMessage(builderForValue.build());
      }
      hookTypeCase_ = 1;
      return this;
    }
    /**
     * <code>.aruna.api.hooks.services.v2.ExternalHook external_hook = 1 [json_name = "externalHook"];</code>
     */
    public Builder mergeExternalHook(com.aruna.api.hooks.services.v2.ExternalHook value) {
      if (externalHookBuilder_ == null) {
        if (hookTypeCase_ == 1 &&
            hookType_ != com.aruna.api.hooks.services.v2.ExternalHook.getDefaultInstance()) {
          hookType_ = com.aruna.api.hooks.services.v2.ExternalHook.newBuilder((com.aruna.api.hooks.services.v2.ExternalHook) hookType_)
              .mergeFrom(value).buildPartial();
        } else {
          hookType_ = value;
        }
        onChanged();
      } else {
        if (hookTypeCase_ == 1) {
          externalHookBuilder_.mergeFrom(value);
        } else {
          externalHookBuilder_.setMessage(value);
        }
      }
      hookTypeCase_ = 1;
      return this;
    }
    /**
     * <code>.aruna.api.hooks.services.v2.ExternalHook external_hook = 1 [json_name = "externalHook"];</code>
     */
    public Builder clearExternalHook() {
      if (externalHookBuilder_ == null) {
        if (hookTypeCase_ == 1) {
          hookTypeCase_ = 0;
          hookType_ = null;
          onChanged();
        }
      } else {
        if (hookTypeCase_ == 1) {
          hookTypeCase_ = 0;
          hookType_ = null;
        }
        externalHookBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.aruna.api.hooks.services.v2.ExternalHook external_hook = 1 [json_name = "externalHook"];</code>
     */
    public com.aruna.api.hooks.services.v2.ExternalHook.Builder getExternalHookBuilder() {
      return getExternalHookFieldBuilder().getBuilder();
    }
    /**
     * <code>.aruna.api.hooks.services.v2.ExternalHook external_hook = 1 [json_name = "externalHook"];</code>
     */
    @java.lang.Override
    public com.aruna.api.hooks.services.v2.ExternalHookOrBuilder getExternalHookOrBuilder() {
      if ((hookTypeCase_ == 1) && (externalHookBuilder_ != null)) {
        return externalHookBuilder_.getMessageOrBuilder();
      } else {
        if (hookTypeCase_ == 1) {
          return (com.aruna.api.hooks.services.v2.ExternalHook) hookType_;
        }
        return com.aruna.api.hooks.services.v2.ExternalHook.getDefaultInstance();
      }
    }
    /**
     * <code>.aruna.api.hooks.services.v2.ExternalHook external_hook = 1 [json_name = "externalHook"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.hooks.services.v2.ExternalHook, com.aruna.api.hooks.services.v2.ExternalHook.Builder, com.aruna.api.hooks.services.v2.ExternalHookOrBuilder> 
        getExternalHookFieldBuilder() {
      if (externalHookBuilder_ == null) {
        if (!(hookTypeCase_ == 1)) {
          hookType_ = com.aruna.api.hooks.services.v2.ExternalHook.getDefaultInstance();
        }
        externalHookBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aruna.api.hooks.services.v2.ExternalHook, com.aruna.api.hooks.services.v2.ExternalHook.Builder, com.aruna.api.hooks.services.v2.ExternalHookOrBuilder>(
                (com.aruna.api.hooks.services.v2.ExternalHook) hookType_,
                getParentForChildren(),
                isClean());
        hookType_ = null;
      }
      hookTypeCase_ = 1;
      onChanged();
      return externalHookBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.hooks.services.v2.InternalHook, com.aruna.api.hooks.services.v2.InternalHook.Builder, com.aruna.api.hooks.services.v2.InternalHookOrBuilder> internalHookBuilder_;
    /**
     * <code>.aruna.api.hooks.services.v2.InternalHook internal_hook = 2 [json_name = "internalHook"];</code>
     * @return Whether the internalHook field is set.
     */
    @java.lang.Override
    public boolean hasInternalHook() {
      return hookTypeCase_ == 2;
    }
    /**
     * <code>.aruna.api.hooks.services.v2.InternalHook internal_hook = 2 [json_name = "internalHook"];</code>
     * @return The internalHook.
     */
    @java.lang.Override
    public com.aruna.api.hooks.services.v2.InternalHook getInternalHook() {
      if (internalHookBuilder_ == null) {
        if (hookTypeCase_ == 2) {
          return (com.aruna.api.hooks.services.v2.InternalHook) hookType_;
        }
        return com.aruna.api.hooks.services.v2.InternalHook.getDefaultInstance();
      } else {
        if (hookTypeCase_ == 2) {
          return internalHookBuilder_.getMessage();
        }
        return com.aruna.api.hooks.services.v2.InternalHook.getDefaultInstance();
      }
    }
    /**
     * <code>.aruna.api.hooks.services.v2.InternalHook internal_hook = 2 [json_name = "internalHook"];</code>
     */
    public Builder setInternalHook(com.aruna.api.hooks.services.v2.InternalHook value) {
      if (internalHookBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hookType_ = value;
        onChanged();
      } else {
        internalHookBuilder_.setMessage(value);
      }
      hookTypeCase_ = 2;
      return this;
    }
    /**
     * <code>.aruna.api.hooks.services.v2.InternalHook internal_hook = 2 [json_name = "internalHook"];</code>
     */
    public Builder setInternalHook(
        com.aruna.api.hooks.services.v2.InternalHook.Builder builderForValue) {
      if (internalHookBuilder_ == null) {
        hookType_ = builderForValue.build();
        onChanged();
      } else {
        internalHookBuilder_.setMessage(builderForValue.build());
      }
      hookTypeCase_ = 2;
      return this;
    }
    /**
     * <code>.aruna.api.hooks.services.v2.InternalHook internal_hook = 2 [json_name = "internalHook"];</code>
     */
    public Builder mergeInternalHook(com.aruna.api.hooks.services.v2.InternalHook value) {
      if (internalHookBuilder_ == null) {
        if (hookTypeCase_ == 2 &&
            hookType_ != com.aruna.api.hooks.services.v2.InternalHook.getDefaultInstance()) {
          hookType_ = com.aruna.api.hooks.services.v2.InternalHook.newBuilder((com.aruna.api.hooks.services.v2.InternalHook) hookType_)
              .mergeFrom(value).buildPartial();
        } else {
          hookType_ = value;
        }
        onChanged();
      } else {
        if (hookTypeCase_ == 2) {
          internalHookBuilder_.mergeFrom(value);
        } else {
          internalHookBuilder_.setMessage(value);
        }
      }
      hookTypeCase_ = 2;
      return this;
    }
    /**
     * <code>.aruna.api.hooks.services.v2.InternalHook internal_hook = 2 [json_name = "internalHook"];</code>
     */
    public Builder clearInternalHook() {
      if (internalHookBuilder_ == null) {
        if (hookTypeCase_ == 2) {
          hookTypeCase_ = 0;
          hookType_ = null;
          onChanged();
        }
      } else {
        if (hookTypeCase_ == 2) {
          hookTypeCase_ = 0;
          hookType_ = null;
        }
        internalHookBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.aruna.api.hooks.services.v2.InternalHook internal_hook = 2 [json_name = "internalHook"];</code>
     */
    public com.aruna.api.hooks.services.v2.InternalHook.Builder getInternalHookBuilder() {
      return getInternalHookFieldBuilder().getBuilder();
    }
    /**
     * <code>.aruna.api.hooks.services.v2.InternalHook internal_hook = 2 [json_name = "internalHook"];</code>
     */
    @java.lang.Override
    public com.aruna.api.hooks.services.v2.InternalHookOrBuilder getInternalHookOrBuilder() {
      if ((hookTypeCase_ == 2) && (internalHookBuilder_ != null)) {
        return internalHookBuilder_.getMessageOrBuilder();
      } else {
        if (hookTypeCase_ == 2) {
          return (com.aruna.api.hooks.services.v2.InternalHook) hookType_;
        }
        return com.aruna.api.hooks.services.v2.InternalHook.getDefaultInstance();
      }
    }
    /**
     * <code>.aruna.api.hooks.services.v2.InternalHook internal_hook = 2 [json_name = "internalHook"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.hooks.services.v2.InternalHook, com.aruna.api.hooks.services.v2.InternalHook.Builder, com.aruna.api.hooks.services.v2.InternalHookOrBuilder> 
        getInternalHookFieldBuilder() {
      if (internalHookBuilder_ == null) {
        if (!(hookTypeCase_ == 2)) {
          hookType_ = com.aruna.api.hooks.services.v2.InternalHook.getDefaultInstance();
        }
        internalHookBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aruna.api.hooks.services.v2.InternalHook, com.aruna.api.hooks.services.v2.InternalHook.Builder, com.aruna.api.hooks.services.v2.InternalHookOrBuilder>(
                (com.aruna.api.hooks.services.v2.InternalHook) hookType_,
                getParentForChildren(),
                isClean());
        hookType_ = null;
      }
      hookTypeCase_ = 2;
      onChanged();
      return internalHookBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:aruna.api.hooks.services.v2.Hook)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.hooks.services.v2.Hook)
  private static final com.aruna.api.hooks.services.v2.Hook DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.hooks.services.v2.Hook();
  }

  public static com.aruna.api.hooks.services.v2.Hook getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Hook>
      PARSER = new com.google.protobuf.AbstractParser<Hook>() {
    @java.lang.Override
    public Hook parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Hook> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Hook> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.hooks.services.v2.Hook getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
