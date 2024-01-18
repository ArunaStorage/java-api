// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/dataset_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse}
 */
public final class UpdateDatasetDescriptionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse)
    UpdateDatasetDescriptionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateDatasetDescriptionResponse.newBuilder() to construct.
  private UpdateDatasetDescriptionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateDatasetDescriptionResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateDatasetDescriptionResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.DatasetServiceProto.internal_static_aruna_api_storage_services_v2_UpdateDatasetDescriptionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.DatasetServiceProto.internal_static_aruna_api_storage_services_v2_UpdateDatasetDescriptionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse.class, com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse.Builder.class);
  }

  private int bitField0_;
  public static final int DATASET_FIELD_NUMBER = 1;
  private com.aruna.api.storage.models.v2.Dataset dataset_;
  /**
   * <code>.aruna.api.storage.models.v2.Dataset dataset = 1 [json_name = "dataset"];</code>
   * @return Whether the dataset field is set.
   */
  @java.lang.Override
  public boolean hasDataset() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.aruna.api.storage.models.v2.Dataset dataset = 1 [json_name = "dataset"];</code>
   * @return The dataset.
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.Dataset getDataset() {
    return dataset_ == null ? com.aruna.api.storage.models.v2.Dataset.getDefaultInstance() : dataset_;
  }
  /**
   * <code>.aruna.api.storage.models.v2.Dataset dataset = 1 [json_name = "dataset"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.DatasetOrBuilder getDatasetOrBuilder() {
    return dataset_ == null ? com.aruna.api.storage.models.v2.Dataset.getDefaultInstance() : dataset_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getDataset());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDataset());
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse other = (com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse) obj;

    if (hasDataset() != other.hasDataset()) return false;
    if (hasDataset()) {
      if (!getDataset()
          .equals(other.getDataset())) return false;
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
    if (hasDataset()) {
      hash = (37 * hash) + DATASET_FIELD_NUMBER;
      hash = (53 * hash) + getDataset().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse)
      com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.DatasetServiceProto.internal_static_aruna_api_storage_services_v2_UpdateDatasetDescriptionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.DatasetServiceProto.internal_static_aruna_api_storage_services_v2_UpdateDatasetDescriptionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse.class, com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getDatasetFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      dataset_ = null;
      if (datasetBuilder_ != null) {
        datasetBuilder_.dispose();
        datasetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.DatasetServiceProto.internal_static_aruna_api_storage_services_v2_UpdateDatasetDescriptionResponse_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse build() {
      com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse buildPartial() {
      com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse result = new com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dataset_ = datasetBuilder_ == null
            ? dataset_
            : datasetBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse) {
        return mergeFrom((com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse other) {
      if (other == com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse.getDefaultInstance()) return this;
      if (other.hasDataset()) {
        mergeDataset(other.getDataset());
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
              input.readMessage(
                  getDatasetFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.aruna.api.storage.models.v2.Dataset dataset_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.storage.models.v2.Dataset, com.aruna.api.storage.models.v2.Dataset.Builder, com.aruna.api.storage.models.v2.DatasetOrBuilder> datasetBuilder_;
    /**
     * <code>.aruna.api.storage.models.v2.Dataset dataset = 1 [json_name = "dataset"];</code>
     * @return Whether the dataset field is set.
     */
    public boolean hasDataset() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.aruna.api.storage.models.v2.Dataset dataset = 1 [json_name = "dataset"];</code>
     * @return The dataset.
     */
    public com.aruna.api.storage.models.v2.Dataset getDataset() {
      if (datasetBuilder_ == null) {
        return dataset_ == null ? com.aruna.api.storage.models.v2.Dataset.getDefaultInstance() : dataset_;
      } else {
        return datasetBuilder_.getMessage();
      }
    }
    /**
     * <code>.aruna.api.storage.models.v2.Dataset dataset = 1 [json_name = "dataset"];</code>
     */
    public Builder setDataset(com.aruna.api.storage.models.v2.Dataset value) {
      if (datasetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataset_ = value;
      } else {
        datasetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Dataset dataset = 1 [json_name = "dataset"];</code>
     */
    public Builder setDataset(
        com.aruna.api.storage.models.v2.Dataset.Builder builderForValue) {
      if (datasetBuilder_ == null) {
        dataset_ = builderForValue.build();
      } else {
        datasetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Dataset dataset = 1 [json_name = "dataset"];</code>
     */
    public Builder mergeDataset(com.aruna.api.storage.models.v2.Dataset value) {
      if (datasetBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          dataset_ != null &&
          dataset_ != com.aruna.api.storage.models.v2.Dataset.getDefaultInstance()) {
          getDatasetBuilder().mergeFrom(value);
        } else {
          dataset_ = value;
        }
      } else {
        datasetBuilder_.mergeFrom(value);
      }
      if (dataset_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Dataset dataset = 1 [json_name = "dataset"];</code>
     */
    public Builder clearDataset() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dataset_ = null;
      if (datasetBuilder_ != null) {
        datasetBuilder_.dispose();
        datasetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Dataset dataset = 1 [json_name = "dataset"];</code>
     */
    public com.aruna.api.storage.models.v2.Dataset.Builder getDatasetBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDatasetFieldBuilder().getBuilder();
    }
    /**
     * <code>.aruna.api.storage.models.v2.Dataset dataset = 1 [json_name = "dataset"];</code>
     */
    public com.aruna.api.storage.models.v2.DatasetOrBuilder getDatasetOrBuilder() {
      if (datasetBuilder_ != null) {
        return datasetBuilder_.getMessageOrBuilder();
      } else {
        return dataset_ == null ?
            com.aruna.api.storage.models.v2.Dataset.getDefaultInstance() : dataset_;
      }
    }
    /**
     * <code>.aruna.api.storage.models.v2.Dataset dataset = 1 [json_name = "dataset"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.storage.models.v2.Dataset, com.aruna.api.storage.models.v2.Dataset.Builder, com.aruna.api.storage.models.v2.DatasetOrBuilder> 
        getDatasetFieldBuilder() {
      if (datasetBuilder_ == null) {
        datasetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aruna.api.storage.models.v2.Dataset, com.aruna.api.storage.models.v2.Dataset.Builder, com.aruna.api.storage.models.v2.DatasetOrBuilder>(
                getDataset(),
                getParentForChildren(),
                isClean());
        dataset_ = null;
      }
      return datasetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse)
  private static final com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse();
  }

  public static com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateDatasetDescriptionResponse>
      PARSER = new com.google.protobuf.AbstractParser<UpdateDatasetDescriptionResponse>() {
    @java.lang.Override
    public UpdateDatasetDescriptionResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateDatasetDescriptionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateDatasetDescriptionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

