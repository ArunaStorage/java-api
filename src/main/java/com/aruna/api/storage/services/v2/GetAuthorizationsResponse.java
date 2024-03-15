// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/authorization_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.GetAuthorizationsResponse}
 */
public final class GetAuthorizationsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.GetAuthorizationsResponse)
    GetAuthorizationsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAuthorizationsResponse.newBuilder() to construct.
  private GetAuthorizationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAuthorizationsResponse() {
    authorizations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAuthorizationsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.AuthorizationServiceProto.internal_static_aruna_api_storage_services_v2_GetAuthorizationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.AuthorizationServiceProto.internal_static_aruna_api_storage_services_v2_GetAuthorizationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.GetAuthorizationsResponse.class, com.aruna.api.storage.services.v2.GetAuthorizationsResponse.Builder.class);
  }

  public static final int AUTHORIZATIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.aruna.api.storage.services.v2.ResourceAuthorization> authorizations_;
  /**
   * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
   */
  @java.lang.Override
  public java.util.List<com.aruna.api.storage.services.v2.ResourceAuthorization> getAuthorizationsList() {
    return authorizations_;
  }
  /**
   * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.aruna.api.storage.services.v2.ResourceAuthorizationOrBuilder> 
      getAuthorizationsOrBuilderList() {
    return authorizations_;
  }
  /**
   * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
   */
  @java.lang.Override
  public int getAuthorizationsCount() {
    return authorizations_.size();
  }
  /**
   * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.services.v2.ResourceAuthorization getAuthorizations(int index) {
    return authorizations_.get(index);
  }
  /**
   * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.services.v2.ResourceAuthorizationOrBuilder getAuthorizationsOrBuilder(
      int index) {
    return authorizations_.get(index);
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
    for (int i = 0; i < authorizations_.size(); i++) {
      output.writeMessage(1, authorizations_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < authorizations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, authorizations_.get(i));
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.GetAuthorizationsResponse)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.GetAuthorizationsResponse other = (com.aruna.api.storage.services.v2.GetAuthorizationsResponse) obj;

    if (!getAuthorizationsList()
        .equals(other.getAuthorizationsList())) return false;
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
    if (getAuthorizationsCount() > 0) {
      hash = (37 * hash) + AUTHORIZATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getAuthorizationsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.GetAuthorizationsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetAuthorizationsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetAuthorizationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetAuthorizationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetAuthorizationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetAuthorizationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetAuthorizationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetAuthorizationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.GetAuthorizationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.GetAuthorizationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetAuthorizationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetAuthorizationsResponse parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.GetAuthorizationsResponse prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.GetAuthorizationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.GetAuthorizationsResponse)
      com.aruna.api.storage.services.v2.GetAuthorizationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.AuthorizationServiceProto.internal_static_aruna_api_storage_services_v2_GetAuthorizationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.AuthorizationServiceProto.internal_static_aruna_api_storage_services_v2_GetAuthorizationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.GetAuthorizationsResponse.class, com.aruna.api.storage.services.v2.GetAuthorizationsResponse.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.GetAuthorizationsResponse.newBuilder()
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
      if (authorizationsBuilder_ == null) {
        authorizations_ = java.util.Collections.emptyList();
      } else {
        authorizations_ = null;
        authorizationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.AuthorizationServiceProto.internal_static_aruna_api_storage_services_v2_GetAuthorizationsResponse_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetAuthorizationsResponse getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.GetAuthorizationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetAuthorizationsResponse build() {
      com.aruna.api.storage.services.v2.GetAuthorizationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetAuthorizationsResponse buildPartial() {
      com.aruna.api.storage.services.v2.GetAuthorizationsResponse result = new com.aruna.api.storage.services.v2.GetAuthorizationsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.aruna.api.storage.services.v2.GetAuthorizationsResponse result) {
      if (authorizationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          authorizations_ = java.util.Collections.unmodifiableList(authorizations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.authorizations_ = authorizations_;
      } else {
        result.authorizations_ = authorizationsBuilder_.build();
      }
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.GetAuthorizationsResponse result) {
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
      if (other instanceof com.aruna.api.storage.services.v2.GetAuthorizationsResponse) {
        return mergeFrom((com.aruna.api.storage.services.v2.GetAuthorizationsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.GetAuthorizationsResponse other) {
      if (other == com.aruna.api.storage.services.v2.GetAuthorizationsResponse.getDefaultInstance()) return this;
      if (authorizationsBuilder_ == null) {
        if (!other.authorizations_.isEmpty()) {
          if (authorizations_.isEmpty()) {
            authorizations_ = other.authorizations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAuthorizationsIsMutable();
            authorizations_.addAll(other.authorizations_);
          }
          onChanged();
        }
      } else {
        if (!other.authorizations_.isEmpty()) {
          if (authorizationsBuilder_.isEmpty()) {
            authorizationsBuilder_.dispose();
            authorizationsBuilder_ = null;
            authorizations_ = other.authorizations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            authorizationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAuthorizationsFieldBuilder() : null;
          } else {
            authorizationsBuilder_.addAllMessages(other.authorizations_);
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
              com.aruna.api.storage.services.v2.ResourceAuthorization m =
                  input.readMessage(
                      com.aruna.api.storage.services.v2.ResourceAuthorization.parser(),
                      extensionRegistry);
              if (authorizationsBuilder_ == null) {
                ensureAuthorizationsIsMutable();
                authorizations_.add(m);
              } else {
                authorizationsBuilder_.addMessage(m);
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

    private java.util.List<com.aruna.api.storage.services.v2.ResourceAuthorization> authorizations_ =
      java.util.Collections.emptyList();
    private void ensureAuthorizationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        authorizations_ = new java.util.ArrayList<com.aruna.api.storage.services.v2.ResourceAuthorization>(authorizations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aruna.api.storage.services.v2.ResourceAuthorization, com.aruna.api.storage.services.v2.ResourceAuthorization.Builder, com.aruna.api.storage.services.v2.ResourceAuthorizationOrBuilder> authorizationsBuilder_;

    /**
     * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
     */
    public java.util.List<com.aruna.api.storage.services.v2.ResourceAuthorization> getAuthorizationsList() {
      if (authorizationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(authorizations_);
      } else {
        return authorizationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
     */
    public int getAuthorizationsCount() {
      if (authorizationsBuilder_ == null) {
        return authorizations_.size();
      } else {
        return authorizationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
     */
    public com.aruna.api.storage.services.v2.ResourceAuthorization getAuthorizations(int index) {
      if (authorizationsBuilder_ == null) {
        return authorizations_.get(index);
      } else {
        return authorizationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
     */
    public Builder setAuthorizations(
        int index, com.aruna.api.storage.services.v2.ResourceAuthorization value) {
      if (authorizationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAuthorizationsIsMutable();
        authorizations_.set(index, value);
        onChanged();
      } else {
        authorizationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
     */
    public Builder setAuthorizations(
        int index, com.aruna.api.storage.services.v2.ResourceAuthorization.Builder builderForValue) {
      if (authorizationsBuilder_ == null) {
        ensureAuthorizationsIsMutable();
        authorizations_.set(index, builderForValue.build());
        onChanged();
      } else {
        authorizationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
     */
    public Builder addAuthorizations(com.aruna.api.storage.services.v2.ResourceAuthorization value) {
      if (authorizationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAuthorizationsIsMutable();
        authorizations_.add(value);
        onChanged();
      } else {
        authorizationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
     */
    public Builder addAuthorizations(
        int index, com.aruna.api.storage.services.v2.ResourceAuthorization value) {
      if (authorizationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAuthorizationsIsMutable();
        authorizations_.add(index, value);
        onChanged();
      } else {
        authorizationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
     */
    public Builder addAuthorizations(
        com.aruna.api.storage.services.v2.ResourceAuthorization.Builder builderForValue) {
      if (authorizationsBuilder_ == null) {
        ensureAuthorizationsIsMutable();
        authorizations_.add(builderForValue.build());
        onChanged();
      } else {
        authorizationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
     */
    public Builder addAuthorizations(
        int index, com.aruna.api.storage.services.v2.ResourceAuthorization.Builder builderForValue) {
      if (authorizationsBuilder_ == null) {
        ensureAuthorizationsIsMutable();
        authorizations_.add(index, builderForValue.build());
        onChanged();
      } else {
        authorizationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
     */
    public Builder addAllAuthorizations(
        java.lang.Iterable<? extends com.aruna.api.storage.services.v2.ResourceAuthorization> values) {
      if (authorizationsBuilder_ == null) {
        ensureAuthorizationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, authorizations_);
        onChanged();
      } else {
        authorizationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
     */
    public Builder clearAuthorizations() {
      if (authorizationsBuilder_ == null) {
        authorizations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        authorizationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
     */
    public Builder removeAuthorizations(int index) {
      if (authorizationsBuilder_ == null) {
        ensureAuthorizationsIsMutable();
        authorizations_.remove(index);
        onChanged();
      } else {
        authorizationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
     */
    public com.aruna.api.storage.services.v2.ResourceAuthorization.Builder getAuthorizationsBuilder(
        int index) {
      return getAuthorizationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
     */
    public com.aruna.api.storage.services.v2.ResourceAuthorizationOrBuilder getAuthorizationsOrBuilder(
        int index) {
      if (authorizationsBuilder_ == null) {
        return authorizations_.get(index);  } else {
        return authorizationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
     */
    public java.util.List<? extends com.aruna.api.storage.services.v2.ResourceAuthorizationOrBuilder> 
         getAuthorizationsOrBuilderList() {
      if (authorizationsBuilder_ != null) {
        return authorizationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(authorizations_);
      }
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
     */
    public com.aruna.api.storage.services.v2.ResourceAuthorization.Builder addAuthorizationsBuilder() {
      return getAuthorizationsFieldBuilder().addBuilder(
          com.aruna.api.storage.services.v2.ResourceAuthorization.getDefaultInstance());
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
     */
    public com.aruna.api.storage.services.v2.ResourceAuthorization.Builder addAuthorizationsBuilder(
        int index) {
      return getAuthorizationsFieldBuilder().addBuilder(
          index, com.aruna.api.storage.services.v2.ResourceAuthorization.getDefaultInstance());
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
     */
    public java.util.List<com.aruna.api.storage.services.v2.ResourceAuthorization.Builder> 
         getAuthorizationsBuilderList() {
      return getAuthorizationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aruna.api.storage.services.v2.ResourceAuthorization, com.aruna.api.storage.services.v2.ResourceAuthorization.Builder, com.aruna.api.storage.services.v2.ResourceAuthorizationOrBuilder> 
        getAuthorizationsFieldBuilder() {
      if (authorizationsBuilder_ == null) {
        authorizationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.aruna.api.storage.services.v2.ResourceAuthorization, com.aruna.api.storage.services.v2.ResourceAuthorization.Builder, com.aruna.api.storage.services.v2.ResourceAuthorizationOrBuilder>(
                authorizations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        authorizations_ = null;
      }
      return authorizationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.GetAuthorizationsResponse)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.GetAuthorizationsResponse)
  private static final com.aruna.api.storage.services.v2.GetAuthorizationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.GetAuthorizationsResponse();
  }

  public static com.aruna.api.storage.services.v2.GetAuthorizationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAuthorizationsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAuthorizationsResponse>() {
    @java.lang.Override
    public GetAuthorizationsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetAuthorizationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAuthorizationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.GetAuthorizationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

