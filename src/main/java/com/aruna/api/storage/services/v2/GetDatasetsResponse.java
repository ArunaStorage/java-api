// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/dataset_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.GetDatasetsResponse}
 */
public final class GetDatasetsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.GetDatasetsResponse)
    GetDatasetsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetDatasetsResponse.newBuilder() to construct.
  private GetDatasetsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetDatasetsResponse() {
    datasets_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetDatasetsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.DatasetServiceProto.internal_static_aruna_api_storage_services_v2_GetDatasetsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.DatasetServiceProto.internal_static_aruna_api_storage_services_v2_GetDatasetsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.GetDatasetsResponse.class, com.aruna.api.storage.services.v2.GetDatasetsResponse.Builder.class);
  }

  public static final int DATASETS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.aruna.api.storage.models.v2.Dataset> datasets_;
  /**
   * <pre>
   * List of dataset overviews
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
   */
  @java.lang.Override
  public java.util.List<com.aruna.api.storage.models.v2.Dataset> getDatasetsList() {
    return datasets_;
  }
  /**
   * <pre>
   * List of dataset overviews
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.aruna.api.storage.models.v2.DatasetOrBuilder> 
      getDatasetsOrBuilderList() {
    return datasets_;
  }
  /**
   * <pre>
   * List of dataset overviews
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
   */
  @java.lang.Override
  public int getDatasetsCount() {
    return datasets_.size();
  }
  /**
   * <pre>
   * List of dataset overviews
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.Dataset getDatasets(int index) {
    return datasets_.get(index);
  }
  /**
   * <pre>
   * List of dataset overviews
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.DatasetOrBuilder getDatasetsOrBuilder(
      int index) {
    return datasets_.get(index);
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
    for (int i = 0; i < datasets_.size(); i++) {
      output.writeMessage(1, datasets_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < datasets_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, datasets_.get(i));
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.GetDatasetsResponse)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.GetDatasetsResponse other = (com.aruna.api.storage.services.v2.GetDatasetsResponse) obj;

    if (!getDatasetsList()
        .equals(other.getDatasetsList())) return false;
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
    if (getDatasetsCount() > 0) {
      hash = (37 * hash) + DATASETS_FIELD_NUMBER;
      hash = (53 * hash) + getDatasetsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.GetDatasetsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetDatasetsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetDatasetsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetDatasetsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetDatasetsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetDatasetsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetDatasetsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetDatasetsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.GetDatasetsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.GetDatasetsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetDatasetsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetDatasetsResponse parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.GetDatasetsResponse prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.GetDatasetsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.GetDatasetsResponse)
      com.aruna.api.storage.services.v2.GetDatasetsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.DatasetServiceProto.internal_static_aruna_api_storage_services_v2_GetDatasetsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.DatasetServiceProto.internal_static_aruna_api_storage_services_v2_GetDatasetsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.GetDatasetsResponse.class, com.aruna.api.storage.services.v2.GetDatasetsResponse.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.GetDatasetsResponse.newBuilder()
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
      if (datasetsBuilder_ == null) {
        datasets_ = java.util.Collections.emptyList();
      } else {
        datasets_ = null;
        datasetsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.DatasetServiceProto.internal_static_aruna_api_storage_services_v2_GetDatasetsResponse_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetDatasetsResponse getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.GetDatasetsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetDatasetsResponse build() {
      com.aruna.api.storage.services.v2.GetDatasetsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetDatasetsResponse buildPartial() {
      com.aruna.api.storage.services.v2.GetDatasetsResponse result = new com.aruna.api.storage.services.v2.GetDatasetsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.aruna.api.storage.services.v2.GetDatasetsResponse result) {
      if (datasetsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          datasets_ = java.util.Collections.unmodifiableList(datasets_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.datasets_ = datasets_;
      } else {
        result.datasets_ = datasetsBuilder_.build();
      }
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.GetDatasetsResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.aruna.api.storage.services.v2.GetDatasetsResponse) {
        return mergeFrom((com.aruna.api.storage.services.v2.GetDatasetsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.GetDatasetsResponse other) {
      if (other == com.aruna.api.storage.services.v2.GetDatasetsResponse.getDefaultInstance()) return this;
      if (datasetsBuilder_ == null) {
        if (!other.datasets_.isEmpty()) {
          if (datasets_.isEmpty()) {
            datasets_ = other.datasets_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDatasetsIsMutable();
            datasets_.addAll(other.datasets_);
          }
          onChanged();
        }
      } else {
        if (!other.datasets_.isEmpty()) {
          if (datasetsBuilder_.isEmpty()) {
            datasetsBuilder_.dispose();
            datasetsBuilder_ = null;
            datasets_ = other.datasets_;
            bitField0_ = (bitField0_ & ~0x00000001);
            datasetsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDatasetsFieldBuilder() : null;
          } else {
            datasetsBuilder_.addAllMessages(other.datasets_);
          }
        }
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
              com.aruna.api.storage.models.v2.Dataset m =
                  input.readMessage(
                      com.aruna.api.storage.models.v2.Dataset.parser(),
                      extensionRegistry);
              if (datasetsBuilder_ == null) {
                ensureDatasetsIsMutable();
                datasets_.add(m);
              } else {
                datasetsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.aruna.api.storage.models.v2.Dataset> datasets_ =
      java.util.Collections.emptyList();
    private void ensureDatasetsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        datasets_ = new java.util.ArrayList<com.aruna.api.storage.models.v2.Dataset>(datasets_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aruna.api.storage.models.v2.Dataset, com.aruna.api.storage.models.v2.Dataset.Builder, com.aruna.api.storage.models.v2.DatasetOrBuilder> datasetsBuilder_;

    /**
     * <pre>
     * List of dataset overviews
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
     */
    public java.util.List<com.aruna.api.storage.models.v2.Dataset> getDatasetsList() {
      if (datasetsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(datasets_);
      } else {
        return datasetsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of dataset overviews
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
     */
    public int getDatasetsCount() {
      if (datasetsBuilder_ == null) {
        return datasets_.size();
      } else {
        return datasetsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of dataset overviews
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
     */
    public com.aruna.api.storage.models.v2.Dataset getDatasets(int index) {
      if (datasetsBuilder_ == null) {
        return datasets_.get(index);
      } else {
        return datasetsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of dataset overviews
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
     */
    public Builder setDatasets(
        int index, com.aruna.api.storage.models.v2.Dataset value) {
      if (datasetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatasetsIsMutable();
        datasets_.set(index, value);
        onChanged();
      } else {
        datasetsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of dataset overviews
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
     */
    public Builder setDatasets(
        int index, com.aruna.api.storage.models.v2.Dataset.Builder builderForValue) {
      if (datasetsBuilder_ == null) {
        ensureDatasetsIsMutable();
        datasets_.set(index, builderForValue.build());
        onChanged();
      } else {
        datasetsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of dataset overviews
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
     */
    public Builder addDatasets(com.aruna.api.storage.models.v2.Dataset value) {
      if (datasetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatasetsIsMutable();
        datasets_.add(value);
        onChanged();
      } else {
        datasetsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of dataset overviews
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
     */
    public Builder addDatasets(
        int index, com.aruna.api.storage.models.v2.Dataset value) {
      if (datasetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatasetsIsMutable();
        datasets_.add(index, value);
        onChanged();
      } else {
        datasetsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of dataset overviews
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
     */
    public Builder addDatasets(
        com.aruna.api.storage.models.v2.Dataset.Builder builderForValue) {
      if (datasetsBuilder_ == null) {
        ensureDatasetsIsMutable();
        datasets_.add(builderForValue.build());
        onChanged();
      } else {
        datasetsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of dataset overviews
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
     */
    public Builder addDatasets(
        int index, com.aruna.api.storage.models.v2.Dataset.Builder builderForValue) {
      if (datasetsBuilder_ == null) {
        ensureDatasetsIsMutable();
        datasets_.add(index, builderForValue.build());
        onChanged();
      } else {
        datasetsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of dataset overviews
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
     */
    public Builder addAllDatasets(
        java.lang.Iterable<? extends com.aruna.api.storage.models.v2.Dataset> values) {
      if (datasetsBuilder_ == null) {
        ensureDatasetsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, datasets_);
        onChanged();
      } else {
        datasetsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of dataset overviews
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
     */
    public Builder clearDatasets() {
      if (datasetsBuilder_ == null) {
        datasets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        datasetsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of dataset overviews
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
     */
    public Builder removeDatasets(int index) {
      if (datasetsBuilder_ == null) {
        ensureDatasetsIsMutable();
        datasets_.remove(index);
        onChanged();
      } else {
        datasetsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of dataset overviews
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
     */
    public com.aruna.api.storage.models.v2.Dataset.Builder getDatasetsBuilder(
        int index) {
      return getDatasetsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of dataset overviews
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
     */
    public com.aruna.api.storage.models.v2.DatasetOrBuilder getDatasetsOrBuilder(
        int index) {
      if (datasetsBuilder_ == null) {
        return datasets_.get(index);  } else {
        return datasetsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of dataset overviews
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
     */
    public java.util.List<? extends com.aruna.api.storage.models.v2.DatasetOrBuilder> 
         getDatasetsOrBuilderList() {
      if (datasetsBuilder_ != null) {
        return datasetsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(datasets_);
      }
    }
    /**
     * <pre>
     * List of dataset overviews
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
     */
    public com.aruna.api.storage.models.v2.Dataset.Builder addDatasetsBuilder() {
      return getDatasetsFieldBuilder().addBuilder(
          com.aruna.api.storage.models.v2.Dataset.getDefaultInstance());
    }
    /**
     * <pre>
     * List of dataset overviews
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
     */
    public com.aruna.api.storage.models.v2.Dataset.Builder addDatasetsBuilder(
        int index) {
      return getDatasetsFieldBuilder().addBuilder(
          index, com.aruna.api.storage.models.v2.Dataset.getDefaultInstance());
    }
    /**
     * <pre>
     * List of dataset overviews
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
     */
    public java.util.List<com.aruna.api.storage.models.v2.Dataset.Builder> 
         getDatasetsBuilderList() {
      return getDatasetsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aruna.api.storage.models.v2.Dataset, com.aruna.api.storage.models.v2.Dataset.Builder, com.aruna.api.storage.models.v2.DatasetOrBuilder> 
        getDatasetsFieldBuilder() {
      if (datasetsBuilder_ == null) {
        datasetsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.aruna.api.storage.models.v2.Dataset, com.aruna.api.storage.models.v2.Dataset.Builder, com.aruna.api.storage.models.v2.DatasetOrBuilder>(
                datasets_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        datasets_ = null;
      }
      return datasetsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.GetDatasetsResponse)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.GetDatasetsResponse)
  private static final com.aruna.api.storage.services.v2.GetDatasetsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.GetDatasetsResponse();
  }

  public static com.aruna.api.storage.services.v2.GetDatasetsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDatasetsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetDatasetsResponse>() {
    @java.lang.Override
    public GetDatasetsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetDatasetsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetDatasetsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.GetDatasetsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

