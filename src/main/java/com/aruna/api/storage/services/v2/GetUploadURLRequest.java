// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/object_service.proto

// Protobuf Java Version: 3.25.1
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.GetUploadURLRequest}
 */
public final class GetUploadURLRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.GetUploadURLRequest)
    GetUploadURLRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetUploadURLRequest.newBuilder() to construct.
  private GetUploadURLRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetUploadURLRequest() {
    objectId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetUploadURLRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_GetUploadURLRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_GetUploadURLRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.GetUploadURLRequest.class, com.aruna.api.storage.services.v2.GetUploadURLRequest.Builder.class);
  }

  public static final int OBJECT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object objectId_ = "";
  /**
   * <pre>
   * ObjectId
   * </pre>
   *
   * <code>string object_id = 1 [json_name = "objectId"];</code>
   * @return The objectId.
   */
  @java.lang.Override
  public java.lang.String getObjectId() {
    java.lang.Object ref = objectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      objectId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * ObjectId
   * </pre>
   *
   * <code>string object_id = 1 [json_name = "objectId"];</code>
   * @return The bytes for objectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getObjectIdBytes() {
    java.lang.Object ref = objectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      objectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MULTIPART_FIELD_NUMBER = 2;
  private boolean multipart_ = false;
  /**
   * <pre>
   * Is this a multipart upload?
   * </pre>
   *
   * <code>bool multipart = 2 [json_name = "multipart"];</code>
   * @return The multipart.
   */
  @java.lang.Override
  public boolean getMultipart() {
    return multipart_;
  }

  public static final int PART_NUMBER_FIELD_NUMBER = 3;
  private int partNumber_ = 0;
  /**
   * <pre>
   * (optional) if multi was initialized
   * </pre>
   *
   * <code>int32 part_number = 3 [json_name = "partNumber"];</code>
   * @return The partNumber.
   */
  @java.lang.Override
  public int getPartNumber() {
    return partNumber_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(objectId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, objectId_);
    }
    if (multipart_ != false) {
      output.writeBool(2, multipart_);
    }
    if (partNumber_ != 0) {
      output.writeInt32(3, partNumber_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(objectId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, objectId_);
    }
    if (multipart_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, multipart_);
    }
    if (partNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, partNumber_);
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.GetUploadURLRequest)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.GetUploadURLRequest other = (com.aruna.api.storage.services.v2.GetUploadURLRequest) obj;

    if (!getObjectId()
        .equals(other.getObjectId())) return false;
    if (getMultipart()
        != other.getMultipart()) return false;
    if (getPartNumber()
        != other.getPartNumber()) return false;
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
    hash = (37 * hash) + OBJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getObjectId().hashCode();
    hash = (37 * hash) + MULTIPART_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMultipart());
    hash = (37 * hash) + PART_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getPartNumber();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.GetUploadURLRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetUploadURLRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetUploadURLRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetUploadURLRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetUploadURLRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetUploadURLRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetUploadURLRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetUploadURLRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.GetUploadURLRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.GetUploadURLRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetUploadURLRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetUploadURLRequest parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.GetUploadURLRequest prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.GetUploadURLRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.GetUploadURLRequest)
      com.aruna.api.storage.services.v2.GetUploadURLRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_GetUploadURLRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_GetUploadURLRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.GetUploadURLRequest.class, com.aruna.api.storage.services.v2.GetUploadURLRequest.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.GetUploadURLRequest.newBuilder()
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
      objectId_ = "";
      multipart_ = false;
      partNumber_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_GetUploadURLRequest_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetUploadURLRequest getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.GetUploadURLRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetUploadURLRequest build() {
      com.aruna.api.storage.services.v2.GetUploadURLRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetUploadURLRequest buildPartial() {
      com.aruna.api.storage.services.v2.GetUploadURLRequest result = new com.aruna.api.storage.services.v2.GetUploadURLRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.GetUploadURLRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.objectId_ = objectId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.multipart_ = multipart_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.partNumber_ = partNumber_;
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
      if (other instanceof com.aruna.api.storage.services.v2.GetUploadURLRequest) {
        return mergeFrom((com.aruna.api.storage.services.v2.GetUploadURLRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.GetUploadURLRequest other) {
      if (other == com.aruna.api.storage.services.v2.GetUploadURLRequest.getDefaultInstance()) return this;
      if (!other.getObjectId().isEmpty()) {
        objectId_ = other.objectId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getMultipart() != false) {
        setMultipart(other.getMultipart());
      }
      if (other.getPartNumber() != 0) {
        setPartNumber(other.getPartNumber());
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
              objectId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              multipart_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              partNumber_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private java.lang.Object objectId_ = "";
    /**
     * <pre>
     * ObjectId
     * </pre>
     *
     * <code>string object_id = 1 [json_name = "objectId"];</code>
     * @return The objectId.
     */
    public java.lang.String getObjectId() {
      java.lang.Object ref = objectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        objectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * ObjectId
     * </pre>
     *
     * <code>string object_id = 1 [json_name = "objectId"];</code>
     * @return The bytes for objectId.
     */
    public com.google.protobuf.ByteString
        getObjectIdBytes() {
      java.lang.Object ref = objectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        objectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * ObjectId
     * </pre>
     *
     * <code>string object_id = 1 [json_name = "objectId"];</code>
     * @param value The objectId to set.
     * @return This builder for chaining.
     */
    public Builder setObjectId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      objectId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ObjectId
     * </pre>
     *
     * <code>string object_id = 1 [json_name = "objectId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearObjectId() {
      objectId_ = getDefaultInstance().getObjectId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ObjectId
     * </pre>
     *
     * <code>string object_id = 1 [json_name = "objectId"];</code>
     * @param value The bytes for objectId to set.
     * @return This builder for chaining.
     */
    public Builder setObjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      objectId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean multipart_ ;
    /**
     * <pre>
     * Is this a multipart upload?
     * </pre>
     *
     * <code>bool multipart = 2 [json_name = "multipart"];</code>
     * @return The multipart.
     */
    @java.lang.Override
    public boolean getMultipart() {
      return multipart_;
    }
    /**
     * <pre>
     * Is this a multipart upload?
     * </pre>
     *
     * <code>bool multipart = 2 [json_name = "multipart"];</code>
     * @param value The multipart to set.
     * @return This builder for chaining.
     */
    public Builder setMultipart(boolean value) {

      multipart_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Is this a multipart upload?
     * </pre>
     *
     * <code>bool multipart = 2 [json_name = "multipart"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMultipart() {
      bitField0_ = (bitField0_ & ~0x00000002);
      multipart_ = false;
      onChanged();
      return this;
    }

    private int partNumber_ ;
    /**
     * <pre>
     * (optional) if multi was initialized
     * </pre>
     *
     * <code>int32 part_number = 3 [json_name = "partNumber"];</code>
     * @return The partNumber.
     */
    @java.lang.Override
    public int getPartNumber() {
      return partNumber_;
    }
    /**
     * <pre>
     * (optional) if multi was initialized
     * </pre>
     *
     * <code>int32 part_number = 3 [json_name = "partNumber"];</code>
     * @param value The partNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPartNumber(int value) {

      partNumber_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (optional) if multi was initialized
     * </pre>
     *
     * <code>int32 part_number = 3 [json_name = "partNumber"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPartNumber() {
      bitField0_ = (bitField0_ & ~0x00000004);
      partNumber_ = 0;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.GetUploadURLRequest)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.GetUploadURLRequest)
  private static final com.aruna.api.storage.services.v2.GetUploadURLRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.GetUploadURLRequest();
  }

  public static com.aruna.api.storage.services.v2.GetUploadURLRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetUploadURLRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetUploadURLRequest>() {
    @java.lang.Override
    public GetUploadURLRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetUploadURLRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetUploadURLRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.GetUploadURLRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

