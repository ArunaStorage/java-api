// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/service_account_service.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.AddPubkeySvcAccountRequest}
 */
public final class AddPubkeySvcAccountRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.AddPubkeySvcAccountRequest)
    AddPubkeySvcAccountRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      AddPubkeySvcAccountRequest.class.getName());
  }
  // Use AddPubkeySvcAccountRequest.newBuilder() to construct.
  private AddPubkeySvcAccountRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AddPubkeySvcAccountRequest() {
    svcAccountId_ = "";
    publicKey_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_AddPubkeySvcAccountRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_AddPubkeySvcAccountRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest.class, com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest.Builder.class);
  }

  public static final int SVC_ACCOUNT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object svcAccountId_ = "";
  /**
   * <code>string svc_account_id = 1 [json_name = "svcAccountId"];</code>
   * @return The svcAccountId.
   */
  @java.lang.Override
  public java.lang.String getSvcAccountId() {
    java.lang.Object ref = svcAccountId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      svcAccountId_ = s;
      return s;
    }
  }
  /**
   * <code>string svc_account_id = 1 [json_name = "svcAccountId"];</code>
   * @return The bytes for svcAccountId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSvcAccountIdBytes() {
    java.lang.Object ref = svcAccountId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      svcAccountId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object publicKey_ = "";
  /**
   * <code>string public_key = 2 [json_name = "publicKey"];</code>
   * @return The publicKey.
   */
  @java.lang.Override
  public java.lang.String getPublicKey() {
    java.lang.Object ref = publicKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      publicKey_ = s;
      return s;
    }
  }
  /**
   * <code>string public_key = 2 [json_name = "publicKey"];</code>
   * @return The bytes for publicKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPublicKeyBytes() {
    java.lang.Object ref = publicKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      publicKey_ = b;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(svcAccountId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, svcAccountId_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(publicKey_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, publicKey_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(svcAccountId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, svcAccountId_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(publicKey_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, publicKey_);
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest other = (com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest) obj;

    if (!getSvcAccountId()
        .equals(other.getSvcAccountId())) return false;
    if (!getPublicKey()
        .equals(other.getPublicKey())) return false;
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
    hash = (37 * hash) + SVC_ACCOUNT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSvcAccountId().hashCode();
    hash = (37 * hash) + PUBLIC_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getPublicKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.AddPubkeySvcAccountRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.AddPubkeySvcAccountRequest)
      com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_AddPubkeySvcAccountRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_AddPubkeySvcAccountRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest.class, com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      svcAccountId_ = "";
      publicKey_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_AddPubkeySvcAccountRequest_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest build() {
      com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest buildPartial() {
      com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest result = new com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.svcAccountId_ = svcAccountId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.publicKey_ = publicKey_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest) {
        return mergeFrom((com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest other) {
      if (other == com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest.getDefaultInstance()) return this;
      if (!other.getSvcAccountId().isEmpty()) {
        svcAccountId_ = other.svcAccountId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPublicKey().isEmpty()) {
        publicKey_ = other.publicKey_;
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
              svcAccountId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              publicKey_ = input.readStringRequireUtf8();
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

    private java.lang.Object svcAccountId_ = "";
    /**
     * <code>string svc_account_id = 1 [json_name = "svcAccountId"];</code>
     * @return The svcAccountId.
     */
    public java.lang.String getSvcAccountId() {
      java.lang.Object ref = svcAccountId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        svcAccountId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string svc_account_id = 1 [json_name = "svcAccountId"];</code>
     * @return The bytes for svcAccountId.
     */
    public com.google.protobuf.ByteString
        getSvcAccountIdBytes() {
      java.lang.Object ref = svcAccountId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        svcAccountId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string svc_account_id = 1 [json_name = "svcAccountId"];</code>
     * @param value The svcAccountId to set.
     * @return This builder for chaining.
     */
    public Builder setSvcAccountId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      svcAccountId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string svc_account_id = 1 [json_name = "svcAccountId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSvcAccountId() {
      svcAccountId_ = getDefaultInstance().getSvcAccountId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string svc_account_id = 1 [json_name = "svcAccountId"];</code>
     * @param value The bytes for svcAccountId to set.
     * @return This builder for chaining.
     */
    public Builder setSvcAccountIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      svcAccountId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object publicKey_ = "";
    /**
     * <code>string public_key = 2 [json_name = "publicKey"];</code>
     * @return The publicKey.
     */
    public java.lang.String getPublicKey() {
      java.lang.Object ref = publicKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        publicKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string public_key = 2 [json_name = "publicKey"];</code>
     * @return The bytes for publicKey.
     */
    public com.google.protobuf.ByteString
        getPublicKeyBytes() {
      java.lang.Object ref = publicKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        publicKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string public_key = 2 [json_name = "publicKey"];</code>
     * @param value The publicKey to set.
     * @return This builder for chaining.
     */
    public Builder setPublicKey(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      publicKey_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string public_key = 2 [json_name = "publicKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPublicKey() {
      publicKey_ = getDefaultInstance().getPublicKey();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string public_key = 2 [json_name = "publicKey"];</code>
     * @param value The bytes for publicKey to set.
     * @return This builder for chaining.
     */
    public Builder setPublicKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      publicKey_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.AddPubkeySvcAccountRequest)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.AddPubkeySvcAccountRequest)
  private static final com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest();
  }

  public static com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddPubkeySvcAccountRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddPubkeySvcAccountRequest>() {
    @java.lang.Override
    public AddPubkeySvcAccountRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AddPubkeySvcAccountRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddPubkeySvcAccountRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
