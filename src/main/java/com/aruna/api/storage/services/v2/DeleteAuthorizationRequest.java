// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/authorization_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.DeleteAuthorizationRequest}
 */
public final class DeleteAuthorizationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.DeleteAuthorizationRequest)
    DeleteAuthorizationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteAuthorizationRequest.newBuilder() to construct.
  private DeleteAuthorizationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteAuthorizationRequest() {
    resourceId_ = "";
    userId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteAuthorizationRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.AuthorizationServiceProto.internal_static_aruna_api_storage_services_v2_DeleteAuthorizationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.AuthorizationServiceProto.internal_static_aruna_api_storage_services_v2_DeleteAuthorizationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.DeleteAuthorizationRequest.class, com.aruna.api.storage.services.v2.DeleteAuthorizationRequest.Builder.class);
  }

  public static final int RESOURCE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceId_ = "";
  /**
   * <code>string resource_id = 1 [json_name = "resourceId"];</code>
   * @return The resourceId.
   */
  @java.lang.Override
  public java.lang.String getResourceId() {
    java.lang.Object ref = resourceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceId_ = s;
      return s;
    }
  }
  /**
   * <code>string resource_id = 1 [json_name = "resourceId"];</code>
   * @return The bytes for resourceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceIdBytes() {
    java.lang.Object ref = resourceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userId_ = "";
  /**
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userId_);
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.DeleteAuthorizationRequest)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.DeleteAuthorizationRequest other = (com.aruna.api.storage.services.v2.DeleteAuthorizationRequest) obj;

    if (!getResourceId()
        .equals(other.getResourceId())) return false;
    if (!getUserId()
        .equals(other.getUserId())) return false;
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
    hash = (37 * hash) + RESOURCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getResourceId().hashCode();
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.DeleteAuthorizationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.DeleteAuthorizationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.DeleteAuthorizationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.DeleteAuthorizationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.DeleteAuthorizationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.DeleteAuthorizationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.DeleteAuthorizationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.DeleteAuthorizationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.DeleteAuthorizationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.DeleteAuthorizationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.DeleteAuthorizationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.DeleteAuthorizationRequest parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.DeleteAuthorizationRequest prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.DeleteAuthorizationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.DeleteAuthorizationRequest)
      com.aruna.api.storage.services.v2.DeleteAuthorizationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.AuthorizationServiceProto.internal_static_aruna_api_storage_services_v2_DeleteAuthorizationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.AuthorizationServiceProto.internal_static_aruna_api_storage_services_v2_DeleteAuthorizationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.DeleteAuthorizationRequest.class, com.aruna.api.storage.services.v2.DeleteAuthorizationRequest.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.DeleteAuthorizationRequest.newBuilder()
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
      resourceId_ = "";
      userId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.AuthorizationServiceProto.internal_static_aruna_api_storage_services_v2_DeleteAuthorizationRequest_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.DeleteAuthorizationRequest getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.DeleteAuthorizationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.DeleteAuthorizationRequest build() {
      com.aruna.api.storage.services.v2.DeleteAuthorizationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.DeleteAuthorizationRequest buildPartial() {
      com.aruna.api.storage.services.v2.DeleteAuthorizationRequest result = new com.aruna.api.storage.services.v2.DeleteAuthorizationRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.DeleteAuthorizationRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceId_ = resourceId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.userId_ = userId_;
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
      if (other instanceof com.aruna.api.storage.services.v2.DeleteAuthorizationRequest) {
        return mergeFrom((com.aruna.api.storage.services.v2.DeleteAuthorizationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.DeleteAuthorizationRequest other) {
      if (other == com.aruna.api.storage.services.v2.DeleteAuthorizationRequest.getDefaultInstance()) return this;
      if (!other.getResourceId().isEmpty()) {
        resourceId_ = other.resourceId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              resourceId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              userId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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
    private int bitField0_;

    private java.lang.Object resourceId_ = "";
    /**
     * <code>string resource_id = 1 [json_name = "resourceId"];</code>
     * @return The resourceId.
     */
    public java.lang.String getResourceId() {
      java.lang.Object ref = resourceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string resource_id = 1 [json_name = "resourceId"];</code>
     * @return The bytes for resourceId.
     */
    public com.google.protobuf.ByteString
        getResourceIdBytes() {
      java.lang.Object ref = resourceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string resource_id = 1 [json_name = "resourceId"];</code>
     * @param value The resourceId to set.
     * @return This builder for chaining.
     */
    public Builder setResourceId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      resourceId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string resource_id = 1 [json_name = "resourceId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceId() {
      resourceId_ = getDefaultInstance().getResourceId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string resource_id = 1 [json_name = "resourceId"];</code>
     * @param value The bytes for resourceId to set.
     * @return This builder for chaining.
     */
    public Builder setResourceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      resourceId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <code>string user_id = 2 [json_name = "userId"];</code>
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_id = 2 [json_name = "userId"];</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_id = 2 [json_name = "userId"];</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 2 [json_name = "userId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      userId_ = getDefaultInstance().getUserId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 2 [json_name = "userId"];</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.DeleteAuthorizationRequest)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.DeleteAuthorizationRequest)
  private static final com.aruna.api.storage.services.v2.DeleteAuthorizationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.DeleteAuthorizationRequest();
  }

  public static com.aruna.api.storage.services.v2.DeleteAuthorizationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteAuthorizationRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteAuthorizationRequest>() {
    @java.lang.Override
    public DeleteAuthorizationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteAuthorizationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteAuthorizationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.DeleteAuthorizationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

