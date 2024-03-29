// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/info_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.GetPubkeysResponse}
 */
public final class GetPubkeysResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.GetPubkeysResponse)
    GetPubkeysResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPubkeysResponse.newBuilder() to construct.
  private GetPubkeysResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPubkeysResponse() {
    pubkeys_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetPubkeysResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_GetPubkeysResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_GetPubkeysResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.GetPubkeysResponse.class, com.aruna.api.storage.services.v2.GetPubkeysResponse.Builder.class);
  }

  public static final int PUBKEYS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.aruna.api.storage.models.v2.Pubkey> pubkeys_;
  /**
   * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
   */
  @java.lang.Override
  public java.util.List<com.aruna.api.storage.models.v2.Pubkey> getPubkeysList() {
    return pubkeys_;
  }
  /**
   * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.aruna.api.storage.models.v2.PubkeyOrBuilder> 
      getPubkeysOrBuilderList() {
    return pubkeys_;
  }
  /**
   * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
   */
  @java.lang.Override
  public int getPubkeysCount() {
    return pubkeys_.size();
  }
  /**
   * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.Pubkey getPubkeys(int index) {
    return pubkeys_.get(index);
  }
  /**
   * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.PubkeyOrBuilder getPubkeysOrBuilder(
      int index) {
    return pubkeys_.get(index);
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
    for (int i = 0; i < pubkeys_.size(); i++) {
      output.writeMessage(1, pubkeys_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < pubkeys_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, pubkeys_.get(i));
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.GetPubkeysResponse)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.GetPubkeysResponse other = (com.aruna.api.storage.services.v2.GetPubkeysResponse) obj;

    if (!getPubkeysList()
        .equals(other.getPubkeysList())) return false;
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
    if (getPubkeysCount() > 0) {
      hash = (37 * hash) + PUBKEYS_FIELD_NUMBER;
      hash = (53 * hash) + getPubkeysList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.GetPubkeysResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetPubkeysResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetPubkeysResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetPubkeysResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetPubkeysResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetPubkeysResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetPubkeysResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetPubkeysResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.GetPubkeysResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.GetPubkeysResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetPubkeysResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetPubkeysResponse parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.GetPubkeysResponse prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.GetPubkeysResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.GetPubkeysResponse)
      com.aruna.api.storage.services.v2.GetPubkeysResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_GetPubkeysResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_GetPubkeysResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.GetPubkeysResponse.class, com.aruna.api.storage.services.v2.GetPubkeysResponse.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.GetPubkeysResponse.newBuilder()
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
      if (pubkeysBuilder_ == null) {
        pubkeys_ = java.util.Collections.emptyList();
      } else {
        pubkeys_ = null;
        pubkeysBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_GetPubkeysResponse_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetPubkeysResponse getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.GetPubkeysResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetPubkeysResponse build() {
      com.aruna.api.storage.services.v2.GetPubkeysResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetPubkeysResponse buildPartial() {
      com.aruna.api.storage.services.v2.GetPubkeysResponse result = new com.aruna.api.storage.services.v2.GetPubkeysResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.aruna.api.storage.services.v2.GetPubkeysResponse result) {
      if (pubkeysBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          pubkeys_ = java.util.Collections.unmodifiableList(pubkeys_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.pubkeys_ = pubkeys_;
      } else {
        result.pubkeys_ = pubkeysBuilder_.build();
      }
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.GetPubkeysResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.aruna.api.storage.services.v2.GetPubkeysResponse) {
        return mergeFrom((com.aruna.api.storage.services.v2.GetPubkeysResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.GetPubkeysResponse other) {
      if (other == com.aruna.api.storage.services.v2.GetPubkeysResponse.getDefaultInstance()) return this;
      if (pubkeysBuilder_ == null) {
        if (!other.pubkeys_.isEmpty()) {
          if (pubkeys_.isEmpty()) {
            pubkeys_ = other.pubkeys_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePubkeysIsMutable();
            pubkeys_.addAll(other.pubkeys_);
          }
          onChanged();
        }
      } else {
        if (!other.pubkeys_.isEmpty()) {
          if (pubkeysBuilder_.isEmpty()) {
            pubkeysBuilder_.dispose();
            pubkeysBuilder_ = null;
            pubkeys_ = other.pubkeys_;
            bitField0_ = (bitField0_ & ~0x00000001);
            pubkeysBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPubkeysFieldBuilder() : null;
          } else {
            pubkeysBuilder_.addAllMessages(other.pubkeys_);
          }
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
              com.aruna.api.storage.models.v2.Pubkey m =
                  input.readMessage(
                      com.aruna.api.storage.models.v2.Pubkey.parser(),
                      extensionRegistry);
              if (pubkeysBuilder_ == null) {
                ensurePubkeysIsMutable();
                pubkeys_.add(m);
              } else {
                pubkeysBuilder_.addMessage(m);
              }
              break;
            } // case 10
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
    private int bitField0_;

    private java.util.List<com.aruna.api.storage.models.v2.Pubkey> pubkeys_ =
      java.util.Collections.emptyList();
    private void ensurePubkeysIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        pubkeys_ = new java.util.ArrayList<com.aruna.api.storage.models.v2.Pubkey>(pubkeys_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aruna.api.storage.models.v2.Pubkey, com.aruna.api.storage.models.v2.Pubkey.Builder, com.aruna.api.storage.models.v2.PubkeyOrBuilder> pubkeysBuilder_;

    /**
     * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
     */
    public java.util.List<com.aruna.api.storage.models.v2.Pubkey> getPubkeysList() {
      if (pubkeysBuilder_ == null) {
        return java.util.Collections.unmodifiableList(pubkeys_);
      } else {
        return pubkeysBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
     */
    public int getPubkeysCount() {
      if (pubkeysBuilder_ == null) {
        return pubkeys_.size();
      } else {
        return pubkeysBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
     */
    public com.aruna.api.storage.models.v2.Pubkey getPubkeys(int index) {
      if (pubkeysBuilder_ == null) {
        return pubkeys_.get(index);
      } else {
        return pubkeysBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
     */
    public Builder setPubkeys(
        int index, com.aruna.api.storage.models.v2.Pubkey value) {
      if (pubkeysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePubkeysIsMutable();
        pubkeys_.set(index, value);
        onChanged();
      } else {
        pubkeysBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
     */
    public Builder setPubkeys(
        int index, com.aruna.api.storage.models.v2.Pubkey.Builder builderForValue) {
      if (pubkeysBuilder_ == null) {
        ensurePubkeysIsMutable();
        pubkeys_.set(index, builderForValue.build());
        onChanged();
      } else {
        pubkeysBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
     */
    public Builder addPubkeys(com.aruna.api.storage.models.v2.Pubkey value) {
      if (pubkeysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePubkeysIsMutable();
        pubkeys_.add(value);
        onChanged();
      } else {
        pubkeysBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
     */
    public Builder addPubkeys(
        int index, com.aruna.api.storage.models.v2.Pubkey value) {
      if (pubkeysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePubkeysIsMutable();
        pubkeys_.add(index, value);
        onChanged();
      } else {
        pubkeysBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
     */
    public Builder addPubkeys(
        com.aruna.api.storage.models.v2.Pubkey.Builder builderForValue) {
      if (pubkeysBuilder_ == null) {
        ensurePubkeysIsMutable();
        pubkeys_.add(builderForValue.build());
        onChanged();
      } else {
        pubkeysBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
     */
    public Builder addPubkeys(
        int index, com.aruna.api.storage.models.v2.Pubkey.Builder builderForValue) {
      if (pubkeysBuilder_ == null) {
        ensurePubkeysIsMutable();
        pubkeys_.add(index, builderForValue.build());
        onChanged();
      } else {
        pubkeysBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
     */
    public Builder addAllPubkeys(
        java.lang.Iterable<? extends com.aruna.api.storage.models.v2.Pubkey> values) {
      if (pubkeysBuilder_ == null) {
        ensurePubkeysIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, pubkeys_);
        onChanged();
      } else {
        pubkeysBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
     */
    public Builder clearPubkeys() {
      if (pubkeysBuilder_ == null) {
        pubkeys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        pubkeysBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
     */
    public Builder removePubkeys(int index) {
      if (pubkeysBuilder_ == null) {
        ensurePubkeysIsMutable();
        pubkeys_.remove(index);
        onChanged();
      } else {
        pubkeysBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
     */
    public com.aruna.api.storage.models.v2.Pubkey.Builder getPubkeysBuilder(
        int index) {
      return getPubkeysFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
     */
    public com.aruna.api.storage.models.v2.PubkeyOrBuilder getPubkeysOrBuilder(
        int index) {
      if (pubkeysBuilder_ == null) {
        return pubkeys_.get(index);  } else {
        return pubkeysBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
     */
    public java.util.List<? extends com.aruna.api.storage.models.v2.PubkeyOrBuilder> 
         getPubkeysOrBuilderList() {
      if (pubkeysBuilder_ != null) {
        return pubkeysBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(pubkeys_);
      }
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
     */
    public com.aruna.api.storage.models.v2.Pubkey.Builder addPubkeysBuilder() {
      return getPubkeysFieldBuilder().addBuilder(
          com.aruna.api.storage.models.v2.Pubkey.getDefaultInstance());
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
     */
    public com.aruna.api.storage.models.v2.Pubkey.Builder addPubkeysBuilder(
        int index) {
      return getPubkeysFieldBuilder().addBuilder(
          index, com.aruna.api.storage.models.v2.Pubkey.getDefaultInstance());
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
     */
    public java.util.List<com.aruna.api.storage.models.v2.Pubkey.Builder> 
         getPubkeysBuilderList() {
      return getPubkeysFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aruna.api.storage.models.v2.Pubkey, com.aruna.api.storage.models.v2.Pubkey.Builder, com.aruna.api.storage.models.v2.PubkeyOrBuilder> 
        getPubkeysFieldBuilder() {
      if (pubkeysBuilder_ == null) {
        pubkeysBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.aruna.api.storage.models.v2.Pubkey, com.aruna.api.storage.models.v2.Pubkey.Builder, com.aruna.api.storage.models.v2.PubkeyOrBuilder>(
                pubkeys_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        pubkeys_ = null;
      }
      return pubkeysBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.GetPubkeysResponse)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.GetPubkeysResponse)
  private static final com.aruna.api.storage.services.v2.GetPubkeysResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.GetPubkeysResponse();
  }

  public static com.aruna.api.storage.services.v2.GetPubkeysResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPubkeysResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetPubkeysResponse>() {
    @java.lang.Override
    public GetPubkeysResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetPubkeysResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPubkeysResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.GetPubkeysResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

