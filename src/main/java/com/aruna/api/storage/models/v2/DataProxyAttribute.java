// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.storage.models.v2;

/**
 * Protobuf type {@code aruna.api.storage.models.v2.DataProxyAttribute}
 */
public final class DataProxyAttribute extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.models.v2.DataProxyAttribute)
    DataProxyAttributeOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      DataProxyAttribute.class.getName());
  }
  // Use DataProxyAttribute.newBuilder() to construct.
  private DataProxyAttribute(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private DataProxyAttribute() {
    attributeName_ = "";
    attributeValue_ = "";
    signature_ = "";
    proxyId_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_DataProxyAttribute_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_DataProxyAttribute_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.models.v2.DataProxyAttribute.class, com.aruna.api.storage.models.v2.DataProxyAttribute.Builder.class);
  }

  public static final int ATTRIBUTE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object attributeName_ = "";
  /**
   * <code>string attribute_name = 1 [json_name = "attributeName"];</code>
   * @return The attributeName.
   */
  @java.lang.Override
  public java.lang.String getAttributeName() {
    java.lang.Object ref = attributeName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      attributeName_ = s;
      return s;
    }
  }
  /**
   * <code>string attribute_name = 1 [json_name = "attributeName"];</code>
   * @return The bytes for attributeName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAttributeNameBytes() {
    java.lang.Object ref = attributeName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      attributeName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ATTRIBUTE_VALUE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object attributeValue_ = "";
  /**
   * <code>string attribute_value = 2 [json_name = "attributeValue"];</code>
   * @return The attributeValue.
   */
  @java.lang.Override
  public java.lang.String getAttributeValue() {
    java.lang.Object ref = attributeValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      attributeValue_ = s;
      return s;
    }
  }
  /**
   * <code>string attribute_value = 2 [json_name = "attributeValue"];</code>
   * @return The bytes for attributeValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAttributeValueBytes() {
    java.lang.Object ref = attributeValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      attributeValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SIGNATURE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object signature_ = "";
  /**
   * <code>string signature = 3 [json_name = "signature"];</code>
   * @return The signature.
   */
  @java.lang.Override
  public java.lang.String getSignature() {
    java.lang.Object ref = signature_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      signature_ = s;
      return s;
    }
  }
  /**
   * <code>string signature = 3 [json_name = "signature"];</code>
   * @return The bytes for signature.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSignatureBytes() {
    java.lang.Object ref = signature_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      signature_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROXY_ID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object proxyId_ = "";
  /**
   * <code>string proxy_id = 4 [json_name = "proxyId"];</code>
   * @return The proxyId.
   */
  @java.lang.Override
  public java.lang.String getProxyId() {
    java.lang.Object ref = proxyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      proxyId_ = s;
      return s;
    }
  }
  /**
   * <code>string proxy_id = 4 [json_name = "proxyId"];</code>
   * @return The bytes for proxyId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProxyIdBytes() {
    java.lang.Object ref = proxyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      proxyId_ = b;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(attributeName_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, attributeName_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(attributeValue_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, attributeValue_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(signature_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, signature_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(proxyId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, proxyId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(attributeName_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, attributeName_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(attributeValue_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, attributeValue_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(signature_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, signature_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(proxyId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, proxyId_);
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
    if (!(obj instanceof com.aruna.api.storage.models.v2.DataProxyAttribute)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.models.v2.DataProxyAttribute other = (com.aruna.api.storage.models.v2.DataProxyAttribute) obj;

    if (!getAttributeName()
        .equals(other.getAttributeName())) return false;
    if (!getAttributeValue()
        .equals(other.getAttributeValue())) return false;
    if (!getSignature()
        .equals(other.getSignature())) return false;
    if (!getProxyId()
        .equals(other.getProxyId())) return false;
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
    hash = (37 * hash) + ATTRIBUTE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getAttributeName().hashCode();
    hash = (37 * hash) + ATTRIBUTE_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getAttributeValue().hashCode();
    hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getSignature().hashCode();
    hash = (37 * hash) + PROXY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProxyId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.models.v2.DataProxyAttribute parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.models.v2.DataProxyAttribute parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.models.v2.DataProxyAttribute parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.models.v2.DataProxyAttribute parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.models.v2.DataProxyAttribute parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.models.v2.DataProxyAttribute parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.models.v2.DataProxyAttribute parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.models.v2.DataProxyAttribute parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.models.v2.DataProxyAttribute parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.models.v2.DataProxyAttribute parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.models.v2.DataProxyAttribute parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.models.v2.DataProxyAttribute parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.models.v2.DataProxyAttribute prototype) {
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
   * Protobuf type {@code aruna.api.storage.models.v2.DataProxyAttribute}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.models.v2.DataProxyAttribute)
      com.aruna.api.storage.models.v2.DataProxyAttributeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_DataProxyAttribute_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_DataProxyAttribute_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.models.v2.DataProxyAttribute.class, com.aruna.api.storage.models.v2.DataProxyAttribute.Builder.class);
    }

    // Construct using com.aruna.api.storage.models.v2.DataProxyAttribute.newBuilder()
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
      attributeName_ = "";
      attributeValue_ = "";
      signature_ = "";
      proxyId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_DataProxyAttribute_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.models.v2.DataProxyAttribute getDefaultInstanceForType() {
      return com.aruna.api.storage.models.v2.DataProxyAttribute.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.models.v2.DataProxyAttribute build() {
      com.aruna.api.storage.models.v2.DataProxyAttribute result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.models.v2.DataProxyAttribute buildPartial() {
      com.aruna.api.storage.models.v2.DataProxyAttribute result = new com.aruna.api.storage.models.v2.DataProxyAttribute(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.models.v2.DataProxyAttribute result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.attributeName_ = attributeName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.attributeValue_ = attributeValue_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.signature_ = signature_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.proxyId_ = proxyId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.aruna.api.storage.models.v2.DataProxyAttribute) {
        return mergeFrom((com.aruna.api.storage.models.v2.DataProxyAttribute)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.models.v2.DataProxyAttribute other) {
      if (other == com.aruna.api.storage.models.v2.DataProxyAttribute.getDefaultInstance()) return this;
      if (!other.getAttributeName().isEmpty()) {
        attributeName_ = other.attributeName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAttributeValue().isEmpty()) {
        attributeValue_ = other.attributeValue_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getSignature().isEmpty()) {
        signature_ = other.signature_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getProxyId().isEmpty()) {
        proxyId_ = other.proxyId_;
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
              attributeName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              attributeValue_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              signature_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              proxyId_ = input.readStringRequireUtf8();
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

    private java.lang.Object attributeName_ = "";
    /**
     * <code>string attribute_name = 1 [json_name = "attributeName"];</code>
     * @return The attributeName.
     */
    public java.lang.String getAttributeName() {
      java.lang.Object ref = attributeName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        attributeName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string attribute_name = 1 [json_name = "attributeName"];</code>
     * @return The bytes for attributeName.
     */
    public com.google.protobuf.ByteString
        getAttributeNameBytes() {
      java.lang.Object ref = attributeName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        attributeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string attribute_name = 1 [json_name = "attributeName"];</code>
     * @param value The attributeName to set.
     * @return This builder for chaining.
     */
    public Builder setAttributeName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      attributeName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string attribute_name = 1 [json_name = "attributeName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAttributeName() {
      attributeName_ = getDefaultInstance().getAttributeName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string attribute_name = 1 [json_name = "attributeName"];</code>
     * @param value The bytes for attributeName to set.
     * @return This builder for chaining.
     */
    public Builder setAttributeNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      attributeName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object attributeValue_ = "";
    /**
     * <code>string attribute_value = 2 [json_name = "attributeValue"];</code>
     * @return The attributeValue.
     */
    public java.lang.String getAttributeValue() {
      java.lang.Object ref = attributeValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        attributeValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string attribute_value = 2 [json_name = "attributeValue"];</code>
     * @return The bytes for attributeValue.
     */
    public com.google.protobuf.ByteString
        getAttributeValueBytes() {
      java.lang.Object ref = attributeValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        attributeValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string attribute_value = 2 [json_name = "attributeValue"];</code>
     * @param value The attributeValue to set.
     * @return This builder for chaining.
     */
    public Builder setAttributeValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      attributeValue_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string attribute_value = 2 [json_name = "attributeValue"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAttributeValue() {
      attributeValue_ = getDefaultInstance().getAttributeValue();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string attribute_value = 2 [json_name = "attributeValue"];</code>
     * @param value The bytes for attributeValue to set.
     * @return This builder for chaining.
     */
    public Builder setAttributeValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      attributeValue_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object signature_ = "";
    /**
     * <code>string signature = 3 [json_name = "signature"];</code>
     * @return The signature.
     */
    public java.lang.String getSignature() {
      java.lang.Object ref = signature_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        signature_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string signature = 3 [json_name = "signature"];</code>
     * @return The bytes for signature.
     */
    public com.google.protobuf.ByteString
        getSignatureBytes() {
      java.lang.Object ref = signature_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        signature_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string signature = 3 [json_name = "signature"];</code>
     * @param value The signature to set.
     * @return This builder for chaining.
     */
    public Builder setSignature(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      signature_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string signature = 3 [json_name = "signature"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSignature() {
      signature_ = getDefaultInstance().getSignature();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string signature = 3 [json_name = "signature"];</code>
     * @param value The bytes for signature to set.
     * @return This builder for chaining.
     */
    public Builder setSignatureBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      signature_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object proxyId_ = "";
    /**
     * <code>string proxy_id = 4 [json_name = "proxyId"];</code>
     * @return The proxyId.
     */
    public java.lang.String getProxyId() {
      java.lang.Object ref = proxyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        proxyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string proxy_id = 4 [json_name = "proxyId"];</code>
     * @return The bytes for proxyId.
     */
    public com.google.protobuf.ByteString
        getProxyIdBytes() {
      java.lang.Object ref = proxyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        proxyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string proxy_id = 4 [json_name = "proxyId"];</code>
     * @param value The proxyId to set.
     * @return This builder for chaining.
     */
    public Builder setProxyId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      proxyId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string proxy_id = 4 [json_name = "proxyId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProxyId() {
      proxyId_ = getDefaultInstance().getProxyId();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string proxy_id = 4 [json_name = "proxyId"];</code>
     * @param value The bytes for proxyId to set.
     * @return This builder for chaining.
     */
    public Builder setProxyIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      proxyId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:aruna.api.storage.models.v2.DataProxyAttribute)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.models.v2.DataProxyAttribute)
  private static final com.aruna.api.storage.models.v2.DataProxyAttribute DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.models.v2.DataProxyAttribute();
  }

  public static com.aruna.api.storage.models.v2.DataProxyAttribute getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataProxyAttribute>
      PARSER = new com.google.protobuf.AbstractParser<DataProxyAttribute>() {
    @java.lang.Override
    public DataProxyAttribute parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataProxyAttribute> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataProxyAttribute> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.models.v2.DataProxyAttribute getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

