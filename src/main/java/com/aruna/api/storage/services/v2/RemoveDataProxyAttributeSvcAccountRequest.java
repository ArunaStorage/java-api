// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/service_account_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest}
 */
public final class RemoveDataProxyAttributeSvcAccountRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest)
    RemoveDataProxyAttributeSvcAccountRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RemoveDataProxyAttributeSvcAccountRequest.newBuilder() to construct.
  private RemoveDataProxyAttributeSvcAccountRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RemoveDataProxyAttributeSvcAccountRequest() {
    svcAccountId_ = "";
    dataproxyId_ = "";
    attributeName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RemoveDataProxyAttributeSvcAccountRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_RemoveDataProxyAttributeSvcAccountRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_RemoveDataProxyAttributeSvcAccountRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest.class, com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest.Builder.class);
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

  public static final int DATAPROXY_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object dataproxyId_ = "";
  /**
   * <code>string dataproxy_id = 2 [json_name = "dataproxyId"];</code>
   * @return The dataproxyId.
   */
  @java.lang.Override
  public java.lang.String getDataproxyId() {
    java.lang.Object ref = dataproxyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dataproxyId_ = s;
      return s;
    }
  }
  /**
   * <code>string dataproxy_id = 2 [json_name = "dataproxyId"];</code>
   * @return The bytes for dataproxyId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDataproxyIdBytes() {
    java.lang.Object ref = dataproxyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dataproxyId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ATTRIBUTE_NAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object attributeName_ = "";
  /**
   * <code>string attribute_name = 3 [json_name = "attributeName"];</code>
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
   * <code>string attribute_name = 3 [json_name = "attributeName"];</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(svcAccountId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, svcAccountId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataproxyId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dataproxyId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(attributeName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, attributeName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(svcAccountId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, svcAccountId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataproxyId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dataproxyId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(attributeName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, attributeName_);
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest other = (com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest) obj;

    if (!getSvcAccountId()
        .equals(other.getSvcAccountId())) return false;
    if (!getDataproxyId()
        .equals(other.getDataproxyId())) return false;
    if (!getAttributeName()
        .equals(other.getAttributeName())) return false;
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
    hash = (37 * hash) + DATAPROXY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDataproxyId().hashCode();
    hash = (37 * hash) + ATTRIBUTE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getAttributeName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest)
      com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_RemoveDataProxyAttributeSvcAccountRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_RemoveDataProxyAttributeSvcAccountRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest.class, com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest.newBuilder()
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
      svcAccountId_ = "";
      dataproxyId_ = "";
      attributeName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_RemoveDataProxyAttributeSvcAccountRequest_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest build() {
      com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest buildPartial() {
      com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest result = new com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.svcAccountId_ = svcAccountId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dataproxyId_ = dataproxyId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.attributeName_ = attributeName_;
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
      if (other instanceof com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest) {
        return mergeFrom((com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest other) {
      if (other == com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest.getDefaultInstance()) return this;
      if (!other.getSvcAccountId().isEmpty()) {
        svcAccountId_ = other.svcAccountId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDataproxyId().isEmpty()) {
        dataproxyId_ = other.dataproxyId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getAttributeName().isEmpty()) {
        attributeName_ = other.attributeName_;
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
              svcAccountId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              dataproxyId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              attributeName_ = input.readStringRequireUtf8();
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

    private java.lang.Object dataproxyId_ = "";
    /**
     * <code>string dataproxy_id = 2 [json_name = "dataproxyId"];</code>
     * @return The dataproxyId.
     */
    public java.lang.String getDataproxyId() {
      java.lang.Object ref = dataproxyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dataproxyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dataproxy_id = 2 [json_name = "dataproxyId"];</code>
     * @return The bytes for dataproxyId.
     */
    public com.google.protobuf.ByteString
        getDataproxyIdBytes() {
      java.lang.Object ref = dataproxyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dataproxyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dataproxy_id = 2 [json_name = "dataproxyId"];</code>
     * @param value The dataproxyId to set.
     * @return This builder for chaining.
     */
    public Builder setDataproxyId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dataproxyId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string dataproxy_id = 2 [json_name = "dataproxyId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDataproxyId() {
      dataproxyId_ = getDefaultInstance().getDataproxyId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string dataproxy_id = 2 [json_name = "dataproxyId"];</code>
     * @param value The bytes for dataproxyId to set.
     * @return This builder for chaining.
     */
    public Builder setDataproxyIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dataproxyId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object attributeName_ = "";
    /**
     * <code>string attribute_name = 3 [json_name = "attributeName"];</code>
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
     * <code>string attribute_name = 3 [json_name = "attributeName"];</code>
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
     * <code>string attribute_name = 3 [json_name = "attributeName"];</code>
     * @param value The attributeName to set.
     * @return This builder for chaining.
     */
    public Builder setAttributeName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      attributeName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string attribute_name = 3 [json_name = "attributeName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAttributeName() {
      attributeName_ = getDefaultInstance().getAttributeName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string attribute_name = 3 [json_name = "attributeName"];</code>
     * @param value The bytes for attributeName to set.
     * @return This builder for chaining.
     */
    public Builder setAttributeNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      attributeName_ = value;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest)
  private static final com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest();
  }

  public static com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveDataProxyAttributeSvcAccountRequest>
      PARSER = new com.google.protobuf.AbstractParser<RemoveDataProxyAttributeSvcAccountRequest>() {
    @java.lang.Override
    public RemoveDataProxyAttributeSvcAccountRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RemoveDataProxyAttributeSvcAccountRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveDataProxyAttributeSvcAccountRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

