// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/dataset_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.UpdateDatasetDataClassRequest}
 */
public final class UpdateDatasetDataClassRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.UpdateDatasetDataClassRequest)
    UpdateDatasetDataClassRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateDatasetDataClassRequest.newBuilder() to construct.
  private UpdateDatasetDataClassRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateDatasetDataClassRequest() {
    datasetId_ = "";
    dataClass_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateDatasetDataClassRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.DatasetServiceProto.internal_static_aruna_api_storage_services_v2_UpdateDatasetDataClassRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.DatasetServiceProto.internal_static_aruna_api_storage_services_v2_UpdateDatasetDataClassRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest.class, com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest.Builder.class);
  }

  public static final int DATASET_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object datasetId_ = "";
  /**
   * <code>string dataset_id = 1 [json_name = "datasetId"];</code>
   * @return The datasetId.
   */
  @java.lang.Override
  public java.lang.String getDatasetId() {
    java.lang.Object ref = datasetId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      datasetId_ = s;
      return s;
    }
  }
  /**
   * <code>string dataset_id = 1 [json_name = "datasetId"];</code>
   * @return The bytes for datasetId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDatasetIdBytes() {
    java.lang.Object ref = datasetId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      datasetId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_CLASS_FIELD_NUMBER = 2;
  private int dataClass_ = 0;
  /**
   * <code>.aruna.api.storage.models.v2.DataClass data_class = 2 [json_name = "dataClass"];</code>
   * @return The enum numeric value on the wire for dataClass.
   */
  @java.lang.Override public int getDataClassValue() {
    return dataClass_;
  }
  /**
   * <code>.aruna.api.storage.models.v2.DataClass data_class = 2 [json_name = "dataClass"];</code>
   * @return The dataClass.
   */
  @java.lang.Override public com.aruna.api.storage.models.v2.DataClass getDataClass() {
    com.aruna.api.storage.models.v2.DataClass result = com.aruna.api.storage.models.v2.DataClass.forNumber(dataClass_);
    return result == null ? com.aruna.api.storage.models.v2.DataClass.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(datasetId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, datasetId_);
    }
    if (dataClass_ != com.aruna.api.storage.models.v2.DataClass.DATA_CLASS_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, dataClass_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(datasetId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, datasetId_);
    }
    if (dataClass_ != com.aruna.api.storage.models.v2.DataClass.DATA_CLASS_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, dataClass_);
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest other = (com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest) obj;

    if (!getDatasetId()
        .equals(other.getDatasetId())) return false;
    if (dataClass_ != other.dataClass_) return false;
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
    hash = (37 * hash) + DATASET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDatasetId().hashCode();
    hash = (37 * hash) + DATA_CLASS_FIELD_NUMBER;
    hash = (53 * hash) + dataClass_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.UpdateDatasetDataClassRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.UpdateDatasetDataClassRequest)
      com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.DatasetServiceProto.internal_static_aruna_api_storage_services_v2_UpdateDatasetDataClassRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.DatasetServiceProto.internal_static_aruna_api_storage_services_v2_UpdateDatasetDataClassRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest.class, com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest.newBuilder()
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
      datasetId_ = "";
      dataClass_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.DatasetServiceProto.internal_static_aruna_api_storage_services_v2_UpdateDatasetDataClassRequest_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest build() {
      com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest buildPartial() {
      com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest result = new com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.datasetId_ = datasetId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dataClass_ = dataClass_;
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
      if (other instanceof com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest) {
        return mergeFrom((com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest other) {
      if (other == com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest.getDefaultInstance()) return this;
      if (!other.getDatasetId().isEmpty()) {
        datasetId_ = other.datasetId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.dataClass_ != 0) {
        setDataClassValue(other.getDataClassValue());
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
              datasetId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              dataClass_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private java.lang.Object datasetId_ = "";
    /**
     * <code>string dataset_id = 1 [json_name = "datasetId"];</code>
     * @return The datasetId.
     */
    public java.lang.String getDatasetId() {
      java.lang.Object ref = datasetId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        datasetId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dataset_id = 1 [json_name = "datasetId"];</code>
     * @return The bytes for datasetId.
     */
    public com.google.protobuf.ByteString
        getDatasetIdBytes() {
      java.lang.Object ref = datasetId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        datasetId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dataset_id = 1 [json_name = "datasetId"];</code>
     * @param value The datasetId to set.
     * @return This builder for chaining.
     */
    public Builder setDatasetId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      datasetId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string dataset_id = 1 [json_name = "datasetId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDatasetId() {
      datasetId_ = getDefaultInstance().getDatasetId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string dataset_id = 1 [json_name = "datasetId"];</code>
     * @param value The bytes for datasetId to set.
     * @return This builder for chaining.
     */
    public Builder setDatasetIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      datasetId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int dataClass_ = 0;
    /**
     * <code>.aruna.api.storage.models.v2.DataClass data_class = 2 [json_name = "dataClass"];</code>
     * @return The enum numeric value on the wire for dataClass.
     */
    @java.lang.Override public int getDataClassValue() {
      return dataClass_;
    }
    /**
     * <code>.aruna.api.storage.models.v2.DataClass data_class = 2 [json_name = "dataClass"];</code>
     * @param value The enum numeric value on the wire for dataClass to set.
     * @return This builder for chaining.
     */
    public Builder setDataClassValue(int value) {
      dataClass_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.DataClass data_class = 2 [json_name = "dataClass"];</code>
     * @return The dataClass.
     */
    @java.lang.Override
    public com.aruna.api.storage.models.v2.DataClass getDataClass() {
      com.aruna.api.storage.models.v2.DataClass result = com.aruna.api.storage.models.v2.DataClass.forNumber(dataClass_);
      return result == null ? com.aruna.api.storage.models.v2.DataClass.UNRECOGNIZED : result;
    }
    /**
     * <code>.aruna.api.storage.models.v2.DataClass data_class = 2 [json_name = "dataClass"];</code>
     * @param value The dataClass to set.
     * @return This builder for chaining.
     */
    public Builder setDataClass(com.aruna.api.storage.models.v2.DataClass value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      dataClass_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.DataClass data_class = 2 [json_name = "dataClass"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDataClass() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dataClass_ = 0;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.UpdateDatasetDataClassRequest)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.UpdateDatasetDataClassRequest)
  private static final com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest();
  }

  public static com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateDatasetDataClassRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateDatasetDataClassRequest>() {
    @java.lang.Override
    public UpdateDatasetDataClassRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateDatasetDataClassRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateDatasetDataClassRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

