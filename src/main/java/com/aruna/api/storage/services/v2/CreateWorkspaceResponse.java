// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/workspace_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.CreateWorkspaceResponse}
 */
public final class CreateWorkspaceResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.CreateWorkspaceResponse)
    CreateWorkspaceResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateWorkspaceResponse.newBuilder() to construct.
  private CreateWorkspaceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateWorkspaceResponse() {
    workspaceId_ = "";
    token_ = "";
    accessKey_ = "";
    secretKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateWorkspaceResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.WorkspaceServiceProto.internal_static_aruna_api_storage_services_v2_CreateWorkspaceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.WorkspaceServiceProto.internal_static_aruna_api_storage_services_v2_CreateWorkspaceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.CreateWorkspaceResponse.class, com.aruna.api.storage.services.v2.CreateWorkspaceResponse.Builder.class);
  }

  public static final int WORKSPACE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object workspaceId_ = "";
  /**
   * <code>string workspace_id = 1 [json_name = "workspaceId"];</code>
   * @return The workspaceId.
   */
  @java.lang.Override
  public java.lang.String getWorkspaceId() {
    java.lang.Object ref = workspaceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      workspaceId_ = s;
      return s;
    }
  }
  /**
   * <code>string workspace_id = 1 [json_name = "workspaceId"];</code>
   * @return The bytes for workspaceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWorkspaceIdBytes() {
    java.lang.Object ref = workspaceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      workspaceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object token_ = "";
  /**
   * <code>string token = 2 [json_name = "token"];</code>
   * @return The token.
   */
  @java.lang.Override
  public java.lang.String getToken() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      token_ = s;
      return s;
    }
  }
  /**
   * <code>string token = 2 [json_name = "token"];</code>
   * @return The bytes for token.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTokenBytes() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      token_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCESS_KEY_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object accessKey_ = "";
  /**
   * <code>string access_key = 3 [json_name = "accessKey"];</code>
   * @return The accessKey.
   */
  @java.lang.Override
  public java.lang.String getAccessKey() {
    java.lang.Object ref = accessKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accessKey_ = s;
      return s;
    }
  }
  /**
   * <code>string access_key = 3 [json_name = "accessKey"];</code>
   * @return The bytes for accessKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAccessKeyBytes() {
    java.lang.Object ref = accessKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      accessKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECRET_KEY_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object secretKey_ = "";
  /**
   * <code>string secret_key = 4 [json_name = "secretKey"];</code>
   * @return The secretKey.
   */
  @java.lang.Override
  public java.lang.String getSecretKey() {
    java.lang.Object ref = secretKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      secretKey_ = s;
      return s;
    }
  }
  /**
   * <code>string secret_key = 4 [json_name = "secretKey"];</code>
   * @return The bytes for secretKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSecretKeyBytes() {
    java.lang.Object ref = secretKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      secretKey_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workspaceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, workspaceId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(token_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, token_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accessKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, accessKey_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(secretKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, secretKey_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workspaceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, workspaceId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(token_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, token_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accessKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, accessKey_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(secretKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, secretKey_);
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.CreateWorkspaceResponse)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.CreateWorkspaceResponse other = (com.aruna.api.storage.services.v2.CreateWorkspaceResponse) obj;

    if (!getWorkspaceId()
        .equals(other.getWorkspaceId())) return false;
    if (!getToken()
        .equals(other.getToken())) return false;
    if (!getAccessKey()
        .equals(other.getAccessKey())) return false;
    if (!getSecretKey()
        .equals(other.getSecretKey())) return false;
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
    hash = (37 * hash) + WORKSPACE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getWorkspaceId().hashCode();
    hash = (37 * hash) + TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getToken().hashCode();
    hash = (37 * hash) + ACCESS_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getAccessKey().hashCode();
    hash = (37 * hash) + SECRET_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getSecretKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.CreateWorkspaceResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.CreateWorkspaceResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.CreateWorkspaceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.CreateWorkspaceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.CreateWorkspaceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.CreateWorkspaceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.CreateWorkspaceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.CreateWorkspaceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.CreateWorkspaceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.CreateWorkspaceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.CreateWorkspaceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.CreateWorkspaceResponse parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.CreateWorkspaceResponse prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.CreateWorkspaceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.CreateWorkspaceResponse)
      com.aruna.api.storage.services.v2.CreateWorkspaceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.WorkspaceServiceProto.internal_static_aruna_api_storage_services_v2_CreateWorkspaceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.WorkspaceServiceProto.internal_static_aruna_api_storage_services_v2_CreateWorkspaceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.CreateWorkspaceResponse.class, com.aruna.api.storage.services.v2.CreateWorkspaceResponse.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.CreateWorkspaceResponse.newBuilder()
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
      workspaceId_ = "";
      token_ = "";
      accessKey_ = "";
      secretKey_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.WorkspaceServiceProto.internal_static_aruna_api_storage_services_v2_CreateWorkspaceResponse_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.CreateWorkspaceResponse getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.CreateWorkspaceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.CreateWorkspaceResponse build() {
      com.aruna.api.storage.services.v2.CreateWorkspaceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.CreateWorkspaceResponse buildPartial() {
      com.aruna.api.storage.services.v2.CreateWorkspaceResponse result = new com.aruna.api.storage.services.v2.CreateWorkspaceResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.CreateWorkspaceResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.workspaceId_ = workspaceId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.token_ = token_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.accessKey_ = accessKey_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.secretKey_ = secretKey_;
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
      if (other instanceof com.aruna.api.storage.services.v2.CreateWorkspaceResponse) {
        return mergeFrom((com.aruna.api.storage.services.v2.CreateWorkspaceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.CreateWorkspaceResponse other) {
      if (other == com.aruna.api.storage.services.v2.CreateWorkspaceResponse.getDefaultInstance()) return this;
      if (!other.getWorkspaceId().isEmpty()) {
        workspaceId_ = other.workspaceId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getToken().isEmpty()) {
        token_ = other.token_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getAccessKey().isEmpty()) {
        accessKey_ = other.accessKey_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getSecretKey().isEmpty()) {
        secretKey_ = other.secretKey_;
        bitField0_ |= 0x00000008;
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
              workspaceId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              token_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              accessKey_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              secretKey_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object workspaceId_ = "";
    /**
     * <code>string workspace_id = 1 [json_name = "workspaceId"];</code>
     * @return The workspaceId.
     */
    public java.lang.String getWorkspaceId() {
      java.lang.Object ref = workspaceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        workspaceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string workspace_id = 1 [json_name = "workspaceId"];</code>
     * @return The bytes for workspaceId.
     */
    public com.google.protobuf.ByteString
        getWorkspaceIdBytes() {
      java.lang.Object ref = workspaceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        workspaceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string workspace_id = 1 [json_name = "workspaceId"];</code>
     * @param value The workspaceId to set.
     * @return This builder for chaining.
     */
    public Builder setWorkspaceId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      workspaceId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string workspace_id = 1 [json_name = "workspaceId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWorkspaceId() {
      workspaceId_ = getDefaultInstance().getWorkspaceId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string workspace_id = 1 [json_name = "workspaceId"];</code>
     * @param value The bytes for workspaceId to set.
     * @return This builder for chaining.
     */
    public Builder setWorkspaceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      workspaceId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object token_ = "";
    /**
     * <code>string token = 2 [json_name = "token"];</code>
     * @return The token.
     */
    public java.lang.String getToken() {
      java.lang.Object ref = token_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        token_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string token = 2 [json_name = "token"];</code>
     * @return The bytes for token.
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string token = 2 [json_name = "token"];</code>
     * @param value The token to set.
     * @return This builder for chaining.
     */
    public Builder setToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      token_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string token = 2 [json_name = "token"];</code>
     * @return This builder for chaining.
     */
    public Builder clearToken() {
      token_ = getDefaultInstance().getToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string token = 2 [json_name = "token"];</code>
     * @param value The bytes for token to set.
     * @return This builder for chaining.
     */
    public Builder setTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      token_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object accessKey_ = "";
    /**
     * <code>string access_key = 3 [json_name = "accessKey"];</code>
     * @return The accessKey.
     */
    public java.lang.String getAccessKey() {
      java.lang.Object ref = accessKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accessKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string access_key = 3 [json_name = "accessKey"];</code>
     * @return The bytes for accessKey.
     */
    public com.google.protobuf.ByteString
        getAccessKeyBytes() {
      java.lang.Object ref = accessKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accessKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string access_key = 3 [json_name = "accessKey"];</code>
     * @param value The accessKey to set.
     * @return This builder for chaining.
     */
    public Builder setAccessKey(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      accessKey_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string access_key = 3 [json_name = "accessKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAccessKey() {
      accessKey_ = getDefaultInstance().getAccessKey();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string access_key = 3 [json_name = "accessKey"];</code>
     * @param value The bytes for accessKey to set.
     * @return This builder for chaining.
     */
    public Builder setAccessKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      accessKey_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object secretKey_ = "";
    /**
     * <code>string secret_key = 4 [json_name = "secretKey"];</code>
     * @return The secretKey.
     */
    public java.lang.String getSecretKey() {
      java.lang.Object ref = secretKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        secretKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string secret_key = 4 [json_name = "secretKey"];</code>
     * @return The bytes for secretKey.
     */
    public com.google.protobuf.ByteString
        getSecretKeyBytes() {
      java.lang.Object ref = secretKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        secretKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string secret_key = 4 [json_name = "secretKey"];</code>
     * @param value The secretKey to set.
     * @return This builder for chaining.
     */
    public Builder setSecretKey(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      secretKey_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string secret_key = 4 [json_name = "secretKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSecretKey() {
      secretKey_ = getDefaultInstance().getSecretKey();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string secret_key = 4 [json_name = "secretKey"];</code>
     * @param value The bytes for secretKey to set.
     * @return This builder for chaining.
     */
    public Builder setSecretKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      secretKey_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.CreateWorkspaceResponse)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.CreateWorkspaceResponse)
  private static final com.aruna.api.storage.services.v2.CreateWorkspaceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.CreateWorkspaceResponse();
  }

  public static com.aruna.api.storage.services.v2.CreateWorkspaceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateWorkspaceResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateWorkspaceResponse>() {
    @java.lang.Override
    public CreateWorkspaceResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateWorkspaceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateWorkspaceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.CreateWorkspaceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

