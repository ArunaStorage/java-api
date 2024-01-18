// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/dataproxy/services/v2/dataproxy_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.dataproxy.services.v2;

/**
 * Protobuf type {@code aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse}
 */
public final class InitMultiPartUploadResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse)
    InitMultiPartUploadResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InitMultiPartUploadResponse.newBuilder() to construct.
  private InitMultiPartUploadResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InitMultiPartUploadResponse() {
    uploadId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InitMultiPartUploadResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_InitMultiPartUploadResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_InitMultiPartUploadResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse.class, com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse.Builder.class);
  }

  public static final int UPLOAD_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object uploadId_ = "";
  /**
   * <code>string upload_id = 1 [json_name = "uploadId"];</code>
   * @return The uploadId.
   */
  @java.lang.Override
  public java.lang.String getUploadId() {
    java.lang.Object ref = uploadId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uploadId_ = s;
      return s;
    }
  }
  /**
   * <code>string upload_id = 1 [json_name = "uploadId"];</code>
   * @return The bytes for uploadId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUploadIdBytes() {
    java.lang.Object ref = uploadId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uploadId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uploadId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uploadId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uploadId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uploadId_);
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
    if (!(obj instanceof com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse)) {
      return super.equals(obj);
    }
    com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse other = (com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse) obj;

    if (!getUploadId()
        .equals(other.getUploadId())) return false;
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
    hash = (37 * hash) + UPLOAD_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUploadId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse parseFrom(
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
  public static Builder newBuilder(com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse prototype) {
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
   * Protobuf type {@code aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse)
      com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_InitMultiPartUploadResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_InitMultiPartUploadResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse.class, com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse.Builder.class);
    }

    // Construct using com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse.newBuilder()
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
      uploadId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_InitMultiPartUploadResponse_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse getDefaultInstanceForType() {
      return com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse build() {
      com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse buildPartial() {
      com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse result = new com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.uploadId_ = uploadId_;
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
      if (other instanceof com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse) {
        return mergeFrom((com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse other) {
      if (other == com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse.getDefaultInstance()) return this;
      if (!other.getUploadId().isEmpty()) {
        uploadId_ = other.uploadId_;
        bitField0_ |= 0x00000001;
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
              uploadId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
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

    private java.lang.Object uploadId_ = "";
    /**
     * <code>string upload_id = 1 [json_name = "uploadId"];</code>
     * @return The uploadId.
     */
    public java.lang.String getUploadId() {
      java.lang.Object ref = uploadId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uploadId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string upload_id = 1 [json_name = "uploadId"];</code>
     * @return The bytes for uploadId.
     */
    public com.google.protobuf.ByteString
        getUploadIdBytes() {
      java.lang.Object ref = uploadId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uploadId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string upload_id = 1 [json_name = "uploadId"];</code>
     * @param value The uploadId to set.
     * @return This builder for chaining.
     */
    public Builder setUploadId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      uploadId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string upload_id = 1 [json_name = "uploadId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUploadId() {
      uploadId_ = getDefaultInstance().getUploadId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string upload_id = 1 [json_name = "uploadId"];</code>
     * @param value The bytes for uploadId to set.
     * @return This builder for chaining.
     */
    public Builder setUploadIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      uploadId_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse)
  private static final com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse();
  }

  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InitMultiPartUploadResponse>
      PARSER = new com.google.protobuf.AbstractParser<InitMultiPartUploadResponse>() {
    @java.lang.Override
    public InitMultiPartUploadResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<InitMultiPartUploadResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InitMultiPartUploadResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

