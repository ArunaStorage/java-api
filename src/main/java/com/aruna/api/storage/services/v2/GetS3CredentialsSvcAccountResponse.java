// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/service_account_service.proto

// Protobuf Java Version: 3.25.1
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse}
 */
public final class GetS3CredentialsSvcAccountResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse)
    GetS3CredentialsSvcAccountResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetS3CredentialsSvcAccountResponse.newBuilder() to construct.
  private GetS3CredentialsSvcAccountResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetS3CredentialsSvcAccountResponse() {
    s3AccessKey_ = "";
    s3SecretKey_ = "";
    s3EndpointUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetS3CredentialsSvcAccountResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_GetS3CredentialsSvcAccountResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_GetS3CredentialsSvcAccountResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse.class, com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse.Builder.class);
  }

  public static final int S3_ACCESS_KEY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object s3AccessKey_ = "";
  /**
   * <code>string s3_access_key = 1 [json_name = "s3AccessKey"];</code>
   * @return The s3AccessKey.
   */
  @java.lang.Override
  public java.lang.String getS3AccessKey() {
    java.lang.Object ref = s3AccessKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      s3AccessKey_ = s;
      return s;
    }
  }
  /**
   * <code>string s3_access_key = 1 [json_name = "s3AccessKey"];</code>
   * @return The bytes for s3AccessKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getS3AccessKeyBytes() {
    java.lang.Object ref = s3AccessKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      s3AccessKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int S3_SECRET_KEY_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object s3SecretKey_ = "";
  /**
   * <code>string s3_secret_key = 2 [json_name = "s3SecretKey"];</code>
   * @return The s3SecretKey.
   */
  @java.lang.Override
  public java.lang.String getS3SecretKey() {
    java.lang.Object ref = s3SecretKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      s3SecretKey_ = s;
      return s;
    }
  }
  /**
   * <code>string s3_secret_key = 2 [json_name = "s3SecretKey"];</code>
   * @return The bytes for s3SecretKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getS3SecretKeyBytes() {
    java.lang.Object ref = s3SecretKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      s3SecretKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int S3_ENDPOINT_URL_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object s3EndpointUrl_ = "";
  /**
   * <code>string s3_endpoint_url = 3 [json_name = "s3EndpointUrl"];</code>
   * @return The s3EndpointUrl.
   */
  @java.lang.Override
  public java.lang.String getS3EndpointUrl() {
    java.lang.Object ref = s3EndpointUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      s3EndpointUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string s3_endpoint_url = 3 [json_name = "s3EndpointUrl"];</code>
   * @return The bytes for s3EndpointUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getS3EndpointUrlBytes() {
    java.lang.Object ref = s3EndpointUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      s3EndpointUrl_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(s3AccessKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, s3AccessKey_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(s3SecretKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, s3SecretKey_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(s3EndpointUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, s3EndpointUrl_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(s3AccessKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, s3AccessKey_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(s3SecretKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, s3SecretKey_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(s3EndpointUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, s3EndpointUrl_);
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse other = (com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse) obj;

    if (!getS3AccessKey()
        .equals(other.getS3AccessKey())) return false;
    if (!getS3SecretKey()
        .equals(other.getS3SecretKey())) return false;
    if (!getS3EndpointUrl()
        .equals(other.getS3EndpointUrl())) return false;
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
    hash = (37 * hash) + S3_ACCESS_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getS3AccessKey().hashCode();
    hash = (37 * hash) + S3_SECRET_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getS3SecretKey().hashCode();
    hash = (37 * hash) + S3_ENDPOINT_URL_FIELD_NUMBER;
    hash = (53 * hash) + getS3EndpointUrl().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse)
      com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_GetS3CredentialsSvcAccountResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_GetS3CredentialsSvcAccountResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse.class, com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse.newBuilder()
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
      s3AccessKey_ = "";
      s3SecretKey_ = "";
      s3EndpointUrl_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_GetS3CredentialsSvcAccountResponse_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse build() {
      com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse buildPartial() {
      com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse result = new com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.s3AccessKey_ = s3AccessKey_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.s3SecretKey_ = s3SecretKey_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.s3EndpointUrl_ = s3EndpointUrl_;
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
      if (other instanceof com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse) {
        return mergeFrom((com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse other) {
      if (other == com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse.getDefaultInstance()) return this;
      if (!other.getS3AccessKey().isEmpty()) {
        s3AccessKey_ = other.s3AccessKey_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getS3SecretKey().isEmpty()) {
        s3SecretKey_ = other.s3SecretKey_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getS3EndpointUrl().isEmpty()) {
        s3EndpointUrl_ = other.s3EndpointUrl_;
        bitField0_ |= 0x00000004;
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
              s3AccessKey_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              s3SecretKey_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              s3EndpointUrl_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
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
    private int bitField0_;

    private java.lang.Object s3AccessKey_ = "";
    /**
     * <code>string s3_access_key = 1 [json_name = "s3AccessKey"];</code>
     * @return The s3AccessKey.
     */
    public java.lang.String getS3AccessKey() {
      java.lang.Object ref = s3AccessKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        s3AccessKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string s3_access_key = 1 [json_name = "s3AccessKey"];</code>
     * @return The bytes for s3AccessKey.
     */
    public com.google.protobuf.ByteString
        getS3AccessKeyBytes() {
      java.lang.Object ref = s3AccessKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        s3AccessKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string s3_access_key = 1 [json_name = "s3AccessKey"];</code>
     * @param value The s3AccessKey to set.
     * @return This builder for chaining.
     */
    public Builder setS3AccessKey(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      s3AccessKey_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string s3_access_key = 1 [json_name = "s3AccessKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearS3AccessKey() {
      s3AccessKey_ = getDefaultInstance().getS3AccessKey();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string s3_access_key = 1 [json_name = "s3AccessKey"];</code>
     * @param value The bytes for s3AccessKey to set.
     * @return This builder for chaining.
     */
    public Builder setS3AccessKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      s3AccessKey_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object s3SecretKey_ = "";
    /**
     * <code>string s3_secret_key = 2 [json_name = "s3SecretKey"];</code>
     * @return The s3SecretKey.
     */
    public java.lang.String getS3SecretKey() {
      java.lang.Object ref = s3SecretKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        s3SecretKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string s3_secret_key = 2 [json_name = "s3SecretKey"];</code>
     * @return The bytes for s3SecretKey.
     */
    public com.google.protobuf.ByteString
        getS3SecretKeyBytes() {
      java.lang.Object ref = s3SecretKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        s3SecretKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string s3_secret_key = 2 [json_name = "s3SecretKey"];</code>
     * @param value The s3SecretKey to set.
     * @return This builder for chaining.
     */
    public Builder setS3SecretKey(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      s3SecretKey_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string s3_secret_key = 2 [json_name = "s3SecretKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearS3SecretKey() {
      s3SecretKey_ = getDefaultInstance().getS3SecretKey();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string s3_secret_key = 2 [json_name = "s3SecretKey"];</code>
     * @param value The bytes for s3SecretKey to set.
     * @return This builder for chaining.
     */
    public Builder setS3SecretKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      s3SecretKey_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object s3EndpointUrl_ = "";
    /**
     * <code>string s3_endpoint_url = 3 [json_name = "s3EndpointUrl"];</code>
     * @return The s3EndpointUrl.
     */
    public java.lang.String getS3EndpointUrl() {
      java.lang.Object ref = s3EndpointUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        s3EndpointUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string s3_endpoint_url = 3 [json_name = "s3EndpointUrl"];</code>
     * @return The bytes for s3EndpointUrl.
     */
    public com.google.protobuf.ByteString
        getS3EndpointUrlBytes() {
      java.lang.Object ref = s3EndpointUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        s3EndpointUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string s3_endpoint_url = 3 [json_name = "s3EndpointUrl"];</code>
     * @param value The s3EndpointUrl to set.
     * @return This builder for chaining.
     */
    public Builder setS3EndpointUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      s3EndpointUrl_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string s3_endpoint_url = 3 [json_name = "s3EndpointUrl"];</code>
     * @return This builder for chaining.
     */
    public Builder clearS3EndpointUrl() {
      s3EndpointUrl_ = getDefaultInstance().getS3EndpointUrl();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string s3_endpoint_url = 3 [json_name = "s3EndpointUrl"];</code>
     * @param value The bytes for s3EndpointUrl to set.
     * @return This builder for chaining.
     */
    public Builder setS3EndpointUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      s3EndpointUrl_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse)
  private static final com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse();
  }

  public static com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetS3CredentialsSvcAccountResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetS3CredentialsSvcAccountResponse>() {
    @java.lang.Override
    public GetS3CredentialsSvcAccountResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetS3CredentialsSvcAccountResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetS3CredentialsSvcAccountResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

