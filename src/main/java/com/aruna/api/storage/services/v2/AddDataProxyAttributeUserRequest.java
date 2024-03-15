// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/user_service.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest}
 */
public final class AddDataProxyAttributeUserRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest)
    AddDataProxyAttributeUserRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      AddDataProxyAttributeUserRequest.class.getName());
  }
  // Use AddDataProxyAttributeUserRequest.newBuilder() to construct.
  private AddDataProxyAttributeUserRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AddDataProxyAttributeUserRequest() {
    userId_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.UserServiceProto.internal_static_aruna_api_storage_services_v2_AddDataProxyAttributeUserRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.UserServiceProto.internal_static_aruna_api_storage_services_v2_AddDataProxyAttributeUserRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest.class, com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest.Builder.class);
  }

  private int bitField0_;
  public static final int USER_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userId_ = "";
  /**
   * <code>string user_id = 1 [json_name = "userId"];</code>
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
   * <code>string user_id = 1 [json_name = "userId"];</code>
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

  public static final int ATTRIBUTE_FIELD_NUMBER = 2;
  private com.aruna.api.storage.models.v2.DataProxyAttribute attribute_;
  /**
   * <code>.aruna.api.storage.models.v2.DataProxyAttribute attribute = 2 [json_name = "attribute"];</code>
   * @return Whether the attribute field is set.
   */
  @java.lang.Override
  public boolean hasAttribute() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.aruna.api.storage.models.v2.DataProxyAttribute attribute = 2 [json_name = "attribute"];</code>
   * @return The attribute.
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.DataProxyAttribute getAttribute() {
    return attribute_ == null ? com.aruna.api.storage.models.v2.DataProxyAttribute.getDefaultInstance() : attribute_;
  }
  /**
   * <code>.aruna.api.storage.models.v2.DataProxyAttribute attribute = 2 [json_name = "attribute"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.DataProxyAttributeOrBuilder getAttributeOrBuilder() {
    return attribute_ == null ? com.aruna.api.storage.models.v2.DataProxyAttribute.getDefaultInstance() : attribute_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, userId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getAttribute());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, userId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAttribute());
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest other = (com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest) obj;

    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (hasAttribute() != other.hasAttribute()) return false;
    if (hasAttribute()) {
      if (!getAttribute()
          .equals(other.getAttribute())) return false;
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
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    if (hasAttribute()) {
      hash = (37 * hash) + ATTRIBUTE_FIELD_NUMBER;
      hash = (53 * hash) + getAttribute().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest)
      com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.UserServiceProto.internal_static_aruna_api_storage_services_v2_AddDataProxyAttributeUserRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.UserServiceProto.internal_static_aruna_api_storage_services_v2_AddDataProxyAttributeUserRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest.class, com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getAttributeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      userId_ = "";
      attribute_ = null;
      if (attributeBuilder_ != null) {
        attributeBuilder_.dispose();
        attributeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.UserServiceProto.internal_static_aruna_api_storage_services_v2_AddDataProxyAttributeUserRequest_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest build() {
      com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest buildPartial() {
      com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest result = new com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userId_ = userId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.attribute_ = attributeBuilder_ == null
            ? attribute_
            : attributeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest) {
        return mergeFrom((com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest other) {
      if (other == com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest.getDefaultInstance()) return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAttribute()) {
        mergeAttribute(other.getAttribute());
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
              userId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAttributeFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object userId_ = "";
    /**
     * <code>string user_id = 1 [json_name = "userId"];</code>
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
     * <code>string user_id = 1 [json_name = "userId"];</code>
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
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      userId_ = getDefaultInstance().getUserId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.aruna.api.storage.models.v2.DataProxyAttribute attribute_;
    private com.google.protobuf.SingleFieldBuilder<
        com.aruna.api.storage.models.v2.DataProxyAttribute, com.aruna.api.storage.models.v2.DataProxyAttribute.Builder, com.aruna.api.storage.models.v2.DataProxyAttributeOrBuilder> attributeBuilder_;
    /**
     * <code>.aruna.api.storage.models.v2.DataProxyAttribute attribute = 2 [json_name = "attribute"];</code>
     * @return Whether the attribute field is set.
     */
    public boolean hasAttribute() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.aruna.api.storage.models.v2.DataProxyAttribute attribute = 2 [json_name = "attribute"];</code>
     * @return The attribute.
     */
    public com.aruna.api.storage.models.v2.DataProxyAttribute getAttribute() {
      if (attributeBuilder_ == null) {
        return attribute_ == null ? com.aruna.api.storage.models.v2.DataProxyAttribute.getDefaultInstance() : attribute_;
      } else {
        return attributeBuilder_.getMessage();
      }
    }
    /**
     * <code>.aruna.api.storage.models.v2.DataProxyAttribute attribute = 2 [json_name = "attribute"];</code>
     */
    public Builder setAttribute(com.aruna.api.storage.models.v2.DataProxyAttribute value) {
      if (attributeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        attribute_ = value;
      } else {
        attributeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.DataProxyAttribute attribute = 2 [json_name = "attribute"];</code>
     */
    public Builder setAttribute(
        com.aruna.api.storage.models.v2.DataProxyAttribute.Builder builderForValue) {
      if (attributeBuilder_ == null) {
        attribute_ = builderForValue.build();
      } else {
        attributeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.DataProxyAttribute attribute = 2 [json_name = "attribute"];</code>
     */
    public Builder mergeAttribute(com.aruna.api.storage.models.v2.DataProxyAttribute value) {
      if (attributeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          attribute_ != null &&
          attribute_ != com.aruna.api.storage.models.v2.DataProxyAttribute.getDefaultInstance()) {
          getAttributeBuilder().mergeFrom(value);
        } else {
          attribute_ = value;
        }
      } else {
        attributeBuilder_.mergeFrom(value);
      }
      if (attribute_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.DataProxyAttribute attribute = 2 [json_name = "attribute"];</code>
     */
    public Builder clearAttribute() {
      bitField0_ = (bitField0_ & ~0x00000002);
      attribute_ = null;
      if (attributeBuilder_ != null) {
        attributeBuilder_.dispose();
        attributeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.DataProxyAttribute attribute = 2 [json_name = "attribute"];</code>
     */
    public com.aruna.api.storage.models.v2.DataProxyAttribute.Builder getAttributeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAttributeFieldBuilder().getBuilder();
    }
    /**
     * <code>.aruna.api.storage.models.v2.DataProxyAttribute attribute = 2 [json_name = "attribute"];</code>
     */
    public com.aruna.api.storage.models.v2.DataProxyAttributeOrBuilder getAttributeOrBuilder() {
      if (attributeBuilder_ != null) {
        return attributeBuilder_.getMessageOrBuilder();
      } else {
        return attribute_ == null ?
            com.aruna.api.storage.models.v2.DataProxyAttribute.getDefaultInstance() : attribute_;
      }
    }
    /**
     * <code>.aruna.api.storage.models.v2.DataProxyAttribute attribute = 2 [json_name = "attribute"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.aruna.api.storage.models.v2.DataProxyAttribute, com.aruna.api.storage.models.v2.DataProxyAttribute.Builder, com.aruna.api.storage.models.v2.DataProxyAttributeOrBuilder> 
        getAttributeFieldBuilder() {
      if (attributeBuilder_ == null) {
        attributeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.aruna.api.storage.models.v2.DataProxyAttribute, com.aruna.api.storage.models.v2.DataProxyAttribute.Builder, com.aruna.api.storage.models.v2.DataProxyAttributeOrBuilder>(
                getAttribute(),
                getParentForChildren(),
                isClean());
        attribute_ = null;
      }
      return attributeBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest)
  private static final com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest();
  }

  public static com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddDataProxyAttributeUserRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddDataProxyAttributeUserRequest>() {
    @java.lang.Override
    public AddDataProxyAttributeUserRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AddDataProxyAttributeUserRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddDataProxyAttributeUserRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
