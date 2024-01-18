// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/hooks/services/v2/hooks_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.hooks.services.v2;

/**
 * Protobuf type {@code aruna.api.hooks.services.v2.InternalHook}
 */
public final class InternalHook extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.hooks.services.v2.InternalHook)
    InternalHookOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InternalHook.newBuilder() to construct.
  private InternalHook(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InternalHook() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InternalHook();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.hooks.services.v2.HooksServiceProto.internal_static_aruna_api_hooks_services_v2_InternalHook_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.hooks.services.v2.HooksServiceProto.internal_static_aruna_api_hooks_services_v2_InternalHook_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.hooks.services.v2.InternalHook.class, com.aruna.api.hooks.services.v2.InternalHook.Builder.class);
  }

  private int internalActionCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object internalAction_;
  public enum InternalActionCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ADD_LABEL(1),
    ADD_HOOK(2),
    ADD_RELATION(3),
    INTERNALACTION_NOT_SET(0);
    private final int value;
    private InternalActionCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static InternalActionCase valueOf(int value) {
      return forNumber(value);
    }

    public static InternalActionCase forNumber(int value) {
      switch (value) {
        case 1: return ADD_LABEL;
        case 2: return ADD_HOOK;
        case 3: return ADD_RELATION;
        case 0: return INTERNALACTION_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public InternalActionCase
  getInternalActionCase() {
    return InternalActionCase.forNumber(
        internalActionCase_);
  }

  public static final int ADD_LABEL_FIELD_NUMBER = 1;
  /**
   * <code>.aruna.api.hooks.services.v2.AddLabel add_label = 1 [json_name = "addLabel"];</code>
   * @return Whether the addLabel field is set.
   */
  @java.lang.Override
  public boolean hasAddLabel() {
    return internalActionCase_ == 1;
  }
  /**
   * <code>.aruna.api.hooks.services.v2.AddLabel add_label = 1 [json_name = "addLabel"];</code>
   * @return The addLabel.
   */
  @java.lang.Override
  public com.aruna.api.hooks.services.v2.AddLabel getAddLabel() {
    if (internalActionCase_ == 1) {
       return (com.aruna.api.hooks.services.v2.AddLabel) internalAction_;
    }
    return com.aruna.api.hooks.services.v2.AddLabel.getDefaultInstance();
  }
  /**
   * <code>.aruna.api.hooks.services.v2.AddLabel add_label = 1 [json_name = "addLabel"];</code>
   */
  @java.lang.Override
  public com.aruna.api.hooks.services.v2.AddLabelOrBuilder getAddLabelOrBuilder() {
    if (internalActionCase_ == 1) {
       return (com.aruna.api.hooks.services.v2.AddLabel) internalAction_;
    }
    return com.aruna.api.hooks.services.v2.AddLabel.getDefaultInstance();
  }

  public static final int ADD_HOOK_FIELD_NUMBER = 2;
  /**
   * <code>.aruna.api.hooks.services.v2.AddHook add_hook = 2 [json_name = "addHook"];</code>
   * @return Whether the addHook field is set.
   */
  @java.lang.Override
  public boolean hasAddHook() {
    return internalActionCase_ == 2;
  }
  /**
   * <code>.aruna.api.hooks.services.v2.AddHook add_hook = 2 [json_name = "addHook"];</code>
   * @return The addHook.
   */
  @java.lang.Override
  public com.aruna.api.hooks.services.v2.AddHook getAddHook() {
    if (internalActionCase_ == 2) {
       return (com.aruna.api.hooks.services.v2.AddHook) internalAction_;
    }
    return com.aruna.api.hooks.services.v2.AddHook.getDefaultInstance();
  }
  /**
   * <code>.aruna.api.hooks.services.v2.AddHook add_hook = 2 [json_name = "addHook"];</code>
   */
  @java.lang.Override
  public com.aruna.api.hooks.services.v2.AddHookOrBuilder getAddHookOrBuilder() {
    if (internalActionCase_ == 2) {
       return (com.aruna.api.hooks.services.v2.AddHook) internalAction_;
    }
    return com.aruna.api.hooks.services.v2.AddHook.getDefaultInstance();
  }

  public static final int ADD_RELATION_FIELD_NUMBER = 3;
  /**
   * <code>.aruna.api.storage.models.v2.Relation add_relation = 3 [json_name = "addRelation"];</code>
   * @return Whether the addRelation field is set.
   */
  @java.lang.Override
  public boolean hasAddRelation() {
    return internalActionCase_ == 3;
  }
  /**
   * <code>.aruna.api.storage.models.v2.Relation add_relation = 3 [json_name = "addRelation"];</code>
   * @return The addRelation.
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.Relation getAddRelation() {
    if (internalActionCase_ == 3) {
       return (com.aruna.api.storage.models.v2.Relation) internalAction_;
    }
    return com.aruna.api.storage.models.v2.Relation.getDefaultInstance();
  }
  /**
   * <code>.aruna.api.storage.models.v2.Relation add_relation = 3 [json_name = "addRelation"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.RelationOrBuilder getAddRelationOrBuilder() {
    if (internalActionCase_ == 3) {
       return (com.aruna.api.storage.models.v2.Relation) internalAction_;
    }
    return com.aruna.api.storage.models.v2.Relation.getDefaultInstance();
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
    if (internalActionCase_ == 1) {
      output.writeMessage(1, (com.aruna.api.hooks.services.v2.AddLabel) internalAction_);
    }
    if (internalActionCase_ == 2) {
      output.writeMessage(2, (com.aruna.api.hooks.services.v2.AddHook) internalAction_);
    }
    if (internalActionCase_ == 3) {
      output.writeMessage(3, (com.aruna.api.storage.models.v2.Relation) internalAction_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (internalActionCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.aruna.api.hooks.services.v2.AddLabel) internalAction_);
    }
    if (internalActionCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.aruna.api.hooks.services.v2.AddHook) internalAction_);
    }
    if (internalActionCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (com.aruna.api.storage.models.v2.Relation) internalAction_);
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
    if (!(obj instanceof com.aruna.api.hooks.services.v2.InternalHook)) {
      return super.equals(obj);
    }
    com.aruna.api.hooks.services.v2.InternalHook other = (com.aruna.api.hooks.services.v2.InternalHook) obj;

    if (!getInternalActionCase().equals(other.getInternalActionCase())) return false;
    switch (internalActionCase_) {
      case 1:
        if (!getAddLabel()
            .equals(other.getAddLabel())) return false;
        break;
      case 2:
        if (!getAddHook()
            .equals(other.getAddHook())) return false;
        break;
      case 3:
        if (!getAddRelation()
            .equals(other.getAddRelation())) return false;
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
    switch (internalActionCase_) {
      case 1:
        hash = (37 * hash) + ADD_LABEL_FIELD_NUMBER;
        hash = (53 * hash) + getAddLabel().hashCode();
        break;
      case 2:
        hash = (37 * hash) + ADD_HOOK_FIELD_NUMBER;
        hash = (53 * hash) + getAddHook().hashCode();
        break;
      case 3:
        hash = (37 * hash) + ADD_RELATION_FIELD_NUMBER;
        hash = (53 * hash) + getAddRelation().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.hooks.services.v2.InternalHook parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.hooks.services.v2.InternalHook parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.hooks.services.v2.InternalHook parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.hooks.services.v2.InternalHook parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.hooks.services.v2.InternalHook parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.hooks.services.v2.InternalHook parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.hooks.services.v2.InternalHook parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.hooks.services.v2.InternalHook parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.hooks.services.v2.InternalHook parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.hooks.services.v2.InternalHook parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.hooks.services.v2.InternalHook parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.hooks.services.v2.InternalHook parseFrom(
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
  public static Builder newBuilder(com.aruna.api.hooks.services.v2.InternalHook prototype) {
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
   * Protobuf type {@code aruna.api.hooks.services.v2.InternalHook}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.hooks.services.v2.InternalHook)
      com.aruna.api.hooks.services.v2.InternalHookOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.hooks.services.v2.HooksServiceProto.internal_static_aruna_api_hooks_services_v2_InternalHook_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.hooks.services.v2.HooksServiceProto.internal_static_aruna_api_hooks_services_v2_InternalHook_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.hooks.services.v2.InternalHook.class, com.aruna.api.hooks.services.v2.InternalHook.Builder.class);
    }

    // Construct using com.aruna.api.hooks.services.v2.InternalHook.newBuilder()
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
      if (addLabelBuilder_ != null) {
        addLabelBuilder_.clear();
      }
      if (addHookBuilder_ != null) {
        addHookBuilder_.clear();
      }
      if (addRelationBuilder_ != null) {
        addRelationBuilder_.clear();
      }
      internalActionCase_ = 0;
      internalAction_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.hooks.services.v2.HooksServiceProto.internal_static_aruna_api_hooks_services_v2_InternalHook_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.hooks.services.v2.InternalHook getDefaultInstanceForType() {
      return com.aruna.api.hooks.services.v2.InternalHook.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.hooks.services.v2.InternalHook build() {
      com.aruna.api.hooks.services.v2.InternalHook result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.hooks.services.v2.InternalHook buildPartial() {
      com.aruna.api.hooks.services.v2.InternalHook result = new com.aruna.api.hooks.services.v2.InternalHook(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.hooks.services.v2.InternalHook result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.aruna.api.hooks.services.v2.InternalHook result) {
      result.internalActionCase_ = internalActionCase_;
      result.internalAction_ = this.internalAction_;
      if (internalActionCase_ == 1 &&
          addLabelBuilder_ != null) {
        result.internalAction_ = addLabelBuilder_.build();
      }
      if (internalActionCase_ == 2 &&
          addHookBuilder_ != null) {
        result.internalAction_ = addHookBuilder_.build();
      }
      if (internalActionCase_ == 3 &&
          addRelationBuilder_ != null) {
        result.internalAction_ = addRelationBuilder_.build();
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
      if (other instanceof com.aruna.api.hooks.services.v2.InternalHook) {
        return mergeFrom((com.aruna.api.hooks.services.v2.InternalHook)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.hooks.services.v2.InternalHook other) {
      if (other == com.aruna.api.hooks.services.v2.InternalHook.getDefaultInstance()) return this;
      switch (other.getInternalActionCase()) {
        case ADD_LABEL: {
          mergeAddLabel(other.getAddLabel());
          break;
        }
        case ADD_HOOK: {
          mergeAddHook(other.getAddHook());
          break;
        }
        case ADD_RELATION: {
          mergeAddRelation(other.getAddRelation());
          break;
        }
        case INTERNALACTION_NOT_SET: {
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
                  getAddLabelFieldBuilder().getBuilder(),
                  extensionRegistry);
              internalActionCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAddHookFieldBuilder().getBuilder(),
                  extensionRegistry);
              internalActionCase_ = 2;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getAddRelationFieldBuilder().getBuilder(),
                  extensionRegistry);
              internalActionCase_ = 3;
              break;
            } // case 26
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
    private int internalActionCase_ = 0;
    private java.lang.Object internalAction_;
    public InternalActionCase
        getInternalActionCase() {
      return InternalActionCase.forNumber(
          internalActionCase_);
    }

    public Builder clearInternalAction() {
      internalActionCase_ = 0;
      internalAction_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.hooks.services.v2.AddLabel, com.aruna.api.hooks.services.v2.AddLabel.Builder, com.aruna.api.hooks.services.v2.AddLabelOrBuilder> addLabelBuilder_;
    /**
     * <code>.aruna.api.hooks.services.v2.AddLabel add_label = 1 [json_name = "addLabel"];</code>
     * @return Whether the addLabel field is set.
     */
    @java.lang.Override
    public boolean hasAddLabel() {
      return internalActionCase_ == 1;
    }
    /**
     * <code>.aruna.api.hooks.services.v2.AddLabel add_label = 1 [json_name = "addLabel"];</code>
     * @return The addLabel.
     */
    @java.lang.Override
    public com.aruna.api.hooks.services.v2.AddLabel getAddLabel() {
      if (addLabelBuilder_ == null) {
        if (internalActionCase_ == 1) {
          return (com.aruna.api.hooks.services.v2.AddLabel) internalAction_;
        }
        return com.aruna.api.hooks.services.v2.AddLabel.getDefaultInstance();
      } else {
        if (internalActionCase_ == 1) {
          return addLabelBuilder_.getMessage();
        }
        return com.aruna.api.hooks.services.v2.AddLabel.getDefaultInstance();
      }
    }
    /**
     * <code>.aruna.api.hooks.services.v2.AddLabel add_label = 1 [json_name = "addLabel"];</code>
     */
    public Builder setAddLabel(com.aruna.api.hooks.services.v2.AddLabel value) {
      if (addLabelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        internalAction_ = value;
        onChanged();
      } else {
        addLabelBuilder_.setMessage(value);
      }
      internalActionCase_ = 1;
      return this;
    }
    /**
     * <code>.aruna.api.hooks.services.v2.AddLabel add_label = 1 [json_name = "addLabel"];</code>
     */
    public Builder setAddLabel(
        com.aruna.api.hooks.services.v2.AddLabel.Builder builderForValue) {
      if (addLabelBuilder_ == null) {
        internalAction_ = builderForValue.build();
        onChanged();
      } else {
        addLabelBuilder_.setMessage(builderForValue.build());
      }
      internalActionCase_ = 1;
      return this;
    }
    /**
     * <code>.aruna.api.hooks.services.v2.AddLabel add_label = 1 [json_name = "addLabel"];</code>
     */
    public Builder mergeAddLabel(com.aruna.api.hooks.services.v2.AddLabel value) {
      if (addLabelBuilder_ == null) {
        if (internalActionCase_ == 1 &&
            internalAction_ != com.aruna.api.hooks.services.v2.AddLabel.getDefaultInstance()) {
          internalAction_ = com.aruna.api.hooks.services.v2.AddLabel.newBuilder((com.aruna.api.hooks.services.v2.AddLabel) internalAction_)
              .mergeFrom(value).buildPartial();
        } else {
          internalAction_ = value;
        }
        onChanged();
      } else {
        if (internalActionCase_ == 1) {
          addLabelBuilder_.mergeFrom(value);
        } else {
          addLabelBuilder_.setMessage(value);
        }
      }
      internalActionCase_ = 1;
      return this;
    }
    /**
     * <code>.aruna.api.hooks.services.v2.AddLabel add_label = 1 [json_name = "addLabel"];</code>
     */
    public Builder clearAddLabel() {
      if (addLabelBuilder_ == null) {
        if (internalActionCase_ == 1) {
          internalActionCase_ = 0;
          internalAction_ = null;
          onChanged();
        }
      } else {
        if (internalActionCase_ == 1) {
          internalActionCase_ = 0;
          internalAction_ = null;
        }
        addLabelBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.aruna.api.hooks.services.v2.AddLabel add_label = 1 [json_name = "addLabel"];</code>
     */
    public com.aruna.api.hooks.services.v2.AddLabel.Builder getAddLabelBuilder() {
      return getAddLabelFieldBuilder().getBuilder();
    }
    /**
     * <code>.aruna.api.hooks.services.v2.AddLabel add_label = 1 [json_name = "addLabel"];</code>
     */
    @java.lang.Override
    public com.aruna.api.hooks.services.v2.AddLabelOrBuilder getAddLabelOrBuilder() {
      if ((internalActionCase_ == 1) && (addLabelBuilder_ != null)) {
        return addLabelBuilder_.getMessageOrBuilder();
      } else {
        if (internalActionCase_ == 1) {
          return (com.aruna.api.hooks.services.v2.AddLabel) internalAction_;
        }
        return com.aruna.api.hooks.services.v2.AddLabel.getDefaultInstance();
      }
    }
    /**
     * <code>.aruna.api.hooks.services.v2.AddLabel add_label = 1 [json_name = "addLabel"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.hooks.services.v2.AddLabel, com.aruna.api.hooks.services.v2.AddLabel.Builder, com.aruna.api.hooks.services.v2.AddLabelOrBuilder> 
        getAddLabelFieldBuilder() {
      if (addLabelBuilder_ == null) {
        if (!(internalActionCase_ == 1)) {
          internalAction_ = com.aruna.api.hooks.services.v2.AddLabel.getDefaultInstance();
        }
        addLabelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aruna.api.hooks.services.v2.AddLabel, com.aruna.api.hooks.services.v2.AddLabel.Builder, com.aruna.api.hooks.services.v2.AddLabelOrBuilder>(
                (com.aruna.api.hooks.services.v2.AddLabel) internalAction_,
                getParentForChildren(),
                isClean());
        internalAction_ = null;
      }
      internalActionCase_ = 1;
      onChanged();
      return addLabelBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.hooks.services.v2.AddHook, com.aruna.api.hooks.services.v2.AddHook.Builder, com.aruna.api.hooks.services.v2.AddHookOrBuilder> addHookBuilder_;
    /**
     * <code>.aruna.api.hooks.services.v2.AddHook add_hook = 2 [json_name = "addHook"];</code>
     * @return Whether the addHook field is set.
     */
    @java.lang.Override
    public boolean hasAddHook() {
      return internalActionCase_ == 2;
    }
    /**
     * <code>.aruna.api.hooks.services.v2.AddHook add_hook = 2 [json_name = "addHook"];</code>
     * @return The addHook.
     */
    @java.lang.Override
    public com.aruna.api.hooks.services.v2.AddHook getAddHook() {
      if (addHookBuilder_ == null) {
        if (internalActionCase_ == 2) {
          return (com.aruna.api.hooks.services.v2.AddHook) internalAction_;
        }
        return com.aruna.api.hooks.services.v2.AddHook.getDefaultInstance();
      } else {
        if (internalActionCase_ == 2) {
          return addHookBuilder_.getMessage();
        }
        return com.aruna.api.hooks.services.v2.AddHook.getDefaultInstance();
      }
    }
    /**
     * <code>.aruna.api.hooks.services.v2.AddHook add_hook = 2 [json_name = "addHook"];</code>
     */
    public Builder setAddHook(com.aruna.api.hooks.services.v2.AddHook value) {
      if (addHookBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        internalAction_ = value;
        onChanged();
      } else {
        addHookBuilder_.setMessage(value);
      }
      internalActionCase_ = 2;
      return this;
    }
    /**
     * <code>.aruna.api.hooks.services.v2.AddHook add_hook = 2 [json_name = "addHook"];</code>
     */
    public Builder setAddHook(
        com.aruna.api.hooks.services.v2.AddHook.Builder builderForValue) {
      if (addHookBuilder_ == null) {
        internalAction_ = builderForValue.build();
        onChanged();
      } else {
        addHookBuilder_.setMessage(builderForValue.build());
      }
      internalActionCase_ = 2;
      return this;
    }
    /**
     * <code>.aruna.api.hooks.services.v2.AddHook add_hook = 2 [json_name = "addHook"];</code>
     */
    public Builder mergeAddHook(com.aruna.api.hooks.services.v2.AddHook value) {
      if (addHookBuilder_ == null) {
        if (internalActionCase_ == 2 &&
            internalAction_ != com.aruna.api.hooks.services.v2.AddHook.getDefaultInstance()) {
          internalAction_ = com.aruna.api.hooks.services.v2.AddHook.newBuilder((com.aruna.api.hooks.services.v2.AddHook) internalAction_)
              .mergeFrom(value).buildPartial();
        } else {
          internalAction_ = value;
        }
        onChanged();
      } else {
        if (internalActionCase_ == 2) {
          addHookBuilder_.mergeFrom(value);
        } else {
          addHookBuilder_.setMessage(value);
        }
      }
      internalActionCase_ = 2;
      return this;
    }
    /**
     * <code>.aruna.api.hooks.services.v2.AddHook add_hook = 2 [json_name = "addHook"];</code>
     */
    public Builder clearAddHook() {
      if (addHookBuilder_ == null) {
        if (internalActionCase_ == 2) {
          internalActionCase_ = 0;
          internalAction_ = null;
          onChanged();
        }
      } else {
        if (internalActionCase_ == 2) {
          internalActionCase_ = 0;
          internalAction_ = null;
        }
        addHookBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.aruna.api.hooks.services.v2.AddHook add_hook = 2 [json_name = "addHook"];</code>
     */
    public com.aruna.api.hooks.services.v2.AddHook.Builder getAddHookBuilder() {
      return getAddHookFieldBuilder().getBuilder();
    }
    /**
     * <code>.aruna.api.hooks.services.v2.AddHook add_hook = 2 [json_name = "addHook"];</code>
     */
    @java.lang.Override
    public com.aruna.api.hooks.services.v2.AddHookOrBuilder getAddHookOrBuilder() {
      if ((internalActionCase_ == 2) && (addHookBuilder_ != null)) {
        return addHookBuilder_.getMessageOrBuilder();
      } else {
        if (internalActionCase_ == 2) {
          return (com.aruna.api.hooks.services.v2.AddHook) internalAction_;
        }
        return com.aruna.api.hooks.services.v2.AddHook.getDefaultInstance();
      }
    }
    /**
     * <code>.aruna.api.hooks.services.v2.AddHook add_hook = 2 [json_name = "addHook"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.hooks.services.v2.AddHook, com.aruna.api.hooks.services.v2.AddHook.Builder, com.aruna.api.hooks.services.v2.AddHookOrBuilder> 
        getAddHookFieldBuilder() {
      if (addHookBuilder_ == null) {
        if (!(internalActionCase_ == 2)) {
          internalAction_ = com.aruna.api.hooks.services.v2.AddHook.getDefaultInstance();
        }
        addHookBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aruna.api.hooks.services.v2.AddHook, com.aruna.api.hooks.services.v2.AddHook.Builder, com.aruna.api.hooks.services.v2.AddHookOrBuilder>(
                (com.aruna.api.hooks.services.v2.AddHook) internalAction_,
                getParentForChildren(),
                isClean());
        internalAction_ = null;
      }
      internalActionCase_ = 2;
      onChanged();
      return addHookBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.storage.models.v2.Relation, com.aruna.api.storage.models.v2.Relation.Builder, com.aruna.api.storage.models.v2.RelationOrBuilder> addRelationBuilder_;
    /**
     * <code>.aruna.api.storage.models.v2.Relation add_relation = 3 [json_name = "addRelation"];</code>
     * @return Whether the addRelation field is set.
     */
    @java.lang.Override
    public boolean hasAddRelation() {
      return internalActionCase_ == 3;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Relation add_relation = 3 [json_name = "addRelation"];</code>
     * @return The addRelation.
     */
    @java.lang.Override
    public com.aruna.api.storage.models.v2.Relation getAddRelation() {
      if (addRelationBuilder_ == null) {
        if (internalActionCase_ == 3) {
          return (com.aruna.api.storage.models.v2.Relation) internalAction_;
        }
        return com.aruna.api.storage.models.v2.Relation.getDefaultInstance();
      } else {
        if (internalActionCase_ == 3) {
          return addRelationBuilder_.getMessage();
        }
        return com.aruna.api.storage.models.v2.Relation.getDefaultInstance();
      }
    }
    /**
     * <code>.aruna.api.storage.models.v2.Relation add_relation = 3 [json_name = "addRelation"];</code>
     */
    public Builder setAddRelation(com.aruna.api.storage.models.v2.Relation value) {
      if (addRelationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        internalAction_ = value;
        onChanged();
      } else {
        addRelationBuilder_.setMessage(value);
      }
      internalActionCase_ = 3;
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Relation add_relation = 3 [json_name = "addRelation"];</code>
     */
    public Builder setAddRelation(
        com.aruna.api.storage.models.v2.Relation.Builder builderForValue) {
      if (addRelationBuilder_ == null) {
        internalAction_ = builderForValue.build();
        onChanged();
      } else {
        addRelationBuilder_.setMessage(builderForValue.build());
      }
      internalActionCase_ = 3;
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Relation add_relation = 3 [json_name = "addRelation"];</code>
     */
    public Builder mergeAddRelation(com.aruna.api.storage.models.v2.Relation value) {
      if (addRelationBuilder_ == null) {
        if (internalActionCase_ == 3 &&
            internalAction_ != com.aruna.api.storage.models.v2.Relation.getDefaultInstance()) {
          internalAction_ = com.aruna.api.storage.models.v2.Relation.newBuilder((com.aruna.api.storage.models.v2.Relation) internalAction_)
              .mergeFrom(value).buildPartial();
        } else {
          internalAction_ = value;
        }
        onChanged();
      } else {
        if (internalActionCase_ == 3) {
          addRelationBuilder_.mergeFrom(value);
        } else {
          addRelationBuilder_.setMessage(value);
        }
      }
      internalActionCase_ = 3;
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Relation add_relation = 3 [json_name = "addRelation"];</code>
     */
    public Builder clearAddRelation() {
      if (addRelationBuilder_ == null) {
        if (internalActionCase_ == 3) {
          internalActionCase_ = 0;
          internalAction_ = null;
          onChanged();
        }
      } else {
        if (internalActionCase_ == 3) {
          internalActionCase_ = 0;
          internalAction_ = null;
        }
        addRelationBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Relation add_relation = 3 [json_name = "addRelation"];</code>
     */
    public com.aruna.api.storage.models.v2.Relation.Builder getAddRelationBuilder() {
      return getAddRelationFieldBuilder().getBuilder();
    }
    /**
     * <code>.aruna.api.storage.models.v2.Relation add_relation = 3 [json_name = "addRelation"];</code>
     */
    @java.lang.Override
    public com.aruna.api.storage.models.v2.RelationOrBuilder getAddRelationOrBuilder() {
      if ((internalActionCase_ == 3) && (addRelationBuilder_ != null)) {
        return addRelationBuilder_.getMessageOrBuilder();
      } else {
        if (internalActionCase_ == 3) {
          return (com.aruna.api.storage.models.v2.Relation) internalAction_;
        }
        return com.aruna.api.storage.models.v2.Relation.getDefaultInstance();
      }
    }
    /**
     * <code>.aruna.api.storage.models.v2.Relation add_relation = 3 [json_name = "addRelation"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.storage.models.v2.Relation, com.aruna.api.storage.models.v2.Relation.Builder, com.aruna.api.storage.models.v2.RelationOrBuilder> 
        getAddRelationFieldBuilder() {
      if (addRelationBuilder_ == null) {
        if (!(internalActionCase_ == 3)) {
          internalAction_ = com.aruna.api.storage.models.v2.Relation.getDefaultInstance();
        }
        addRelationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aruna.api.storage.models.v2.Relation, com.aruna.api.storage.models.v2.Relation.Builder, com.aruna.api.storage.models.v2.RelationOrBuilder>(
                (com.aruna.api.storage.models.v2.Relation) internalAction_,
                getParentForChildren(),
                isClean());
        internalAction_ = null;
      }
      internalActionCase_ = 3;
      onChanged();
      return addRelationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.hooks.services.v2.InternalHook)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.hooks.services.v2.InternalHook)
  private static final com.aruna.api.hooks.services.v2.InternalHook DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.hooks.services.v2.InternalHook();
  }

  public static com.aruna.api.hooks.services.v2.InternalHook getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InternalHook>
      PARSER = new com.google.protobuf.AbstractParser<InternalHook>() {
    @java.lang.Override
    public InternalHook parsePartialFrom(
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

  public static com.google.protobuf.Parser<InternalHook> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InternalHook> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.hooks.services.v2.InternalHook getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

