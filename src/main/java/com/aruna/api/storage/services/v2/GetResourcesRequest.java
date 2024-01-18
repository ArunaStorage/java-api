// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/search_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.GetResourcesRequest}
 */
public final class GetResourcesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.GetResourcesRequest)
    GetResourcesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetResourcesRequest.newBuilder() to construct.
  private GetResourcesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetResourcesRequest() {
    resourceIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetResourcesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.SearchServiceProto.internal_static_aruna_api_storage_services_v2_GetResourcesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.SearchServiceProto.internal_static_aruna_api_storage_services_v2_GetResourcesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.GetResourcesRequest.class, com.aruna.api.storage.services.v2.GetResourcesRequest.Builder.class);
  }

  public static final int RESOURCE_IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList resourceIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string resource_ids = 1 [json_name = "resourceIds"];</code>
   * @return A list containing the resourceIds.
   */
  public com.google.protobuf.ProtocolStringList
      getResourceIdsList() {
    return resourceIds_;
  }
  /**
   * <code>repeated string resource_ids = 1 [json_name = "resourceIds"];</code>
   * @return The count of resourceIds.
   */
  public int getResourceIdsCount() {
    return resourceIds_.size();
  }
  /**
   * <code>repeated string resource_ids = 1 [json_name = "resourceIds"];</code>
   * @param index The index of the element to return.
   * @return The resourceIds at the given index.
   */
  public java.lang.String getResourceIds(int index) {
    return resourceIds_.get(index);
  }
  /**
   * <code>repeated string resource_ids = 1 [json_name = "resourceIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the resourceIds at the given index.
   */
  public com.google.protobuf.ByteString
      getResourceIdsBytes(int index) {
    return resourceIds_.getByteString(index);
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
    for (int i = 0; i < resourceIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceIds_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < resourceIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(resourceIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getResourceIdsList().size();
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.GetResourcesRequest)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.GetResourcesRequest other = (com.aruna.api.storage.services.v2.GetResourcesRequest) obj;

    if (!getResourceIdsList()
        .equals(other.getResourceIdsList())) return false;
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
    if (getResourceIdsCount() > 0) {
      hash = (37 * hash) + RESOURCE_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getResourceIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.GetResourcesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetResourcesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetResourcesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetResourcesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetResourcesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetResourcesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetResourcesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetResourcesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.GetResourcesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.GetResourcesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetResourcesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetResourcesRequest parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.GetResourcesRequest prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.GetResourcesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.GetResourcesRequest)
      com.aruna.api.storage.services.v2.GetResourcesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.SearchServiceProto.internal_static_aruna_api_storage_services_v2_GetResourcesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.SearchServiceProto.internal_static_aruna_api_storage_services_v2_GetResourcesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.GetResourcesRequest.class, com.aruna.api.storage.services.v2.GetResourcesRequest.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.GetResourcesRequest.newBuilder()
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
      resourceIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.SearchServiceProto.internal_static_aruna_api_storage_services_v2_GetResourcesRequest_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetResourcesRequest getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.GetResourcesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetResourcesRequest build() {
      com.aruna.api.storage.services.v2.GetResourcesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetResourcesRequest buildPartial() {
      com.aruna.api.storage.services.v2.GetResourcesRequest result = new com.aruna.api.storage.services.v2.GetResourcesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.GetResourcesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        resourceIds_.makeImmutable();
        result.resourceIds_ = resourceIds_;
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
      if (other instanceof com.aruna.api.storage.services.v2.GetResourcesRequest) {
        return mergeFrom((com.aruna.api.storage.services.v2.GetResourcesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.GetResourcesRequest other) {
      if (other == com.aruna.api.storage.services.v2.GetResourcesRequest.getDefaultInstance()) return this;
      if (!other.resourceIds_.isEmpty()) {
        if (resourceIds_.isEmpty()) {
          resourceIds_ = other.resourceIds_;
          bitField0_ |= 0x00000001;
        } else {
          ensureResourceIdsIsMutable();
          resourceIds_.addAll(other.resourceIds_);
        }
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureResourceIdsIsMutable();
              resourceIds_.add(s);
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

    private com.google.protobuf.LazyStringArrayList resourceIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureResourceIdsIsMutable() {
      if (!resourceIds_.isModifiable()) {
        resourceIds_ = new com.google.protobuf.LazyStringArrayList(resourceIds_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string resource_ids = 1 [json_name = "resourceIds"];</code>
     * @return A list containing the resourceIds.
     */
    public com.google.protobuf.ProtocolStringList
        getResourceIdsList() {
      resourceIds_.makeImmutable();
      return resourceIds_;
    }
    /**
     * <code>repeated string resource_ids = 1 [json_name = "resourceIds"];</code>
     * @return The count of resourceIds.
     */
    public int getResourceIdsCount() {
      return resourceIds_.size();
    }
    /**
     * <code>repeated string resource_ids = 1 [json_name = "resourceIds"];</code>
     * @param index The index of the element to return.
     * @return The resourceIds at the given index.
     */
    public java.lang.String getResourceIds(int index) {
      return resourceIds_.get(index);
    }
    /**
     * <code>repeated string resource_ids = 1 [json_name = "resourceIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the resourceIds at the given index.
     */
    public com.google.protobuf.ByteString
        getResourceIdsBytes(int index) {
      return resourceIds_.getByteString(index);
    }
    /**
     * <code>repeated string resource_ids = 1 [json_name = "resourceIds"];</code>
     * @param index The index to set the value at.
     * @param value The resourceIds to set.
     * @return This builder for chaining.
     */
    public Builder setResourceIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureResourceIdsIsMutable();
      resourceIds_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string resource_ids = 1 [json_name = "resourceIds"];</code>
     * @param value The resourceIds to add.
     * @return This builder for chaining.
     */
    public Builder addResourceIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureResourceIdsIsMutable();
      resourceIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string resource_ids = 1 [json_name = "resourceIds"];</code>
     * @param values The resourceIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllResourceIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureResourceIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, resourceIds_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string resource_ids = 1 [json_name = "resourceIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceIds() {
      resourceIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string resource_ids = 1 [json_name = "resourceIds"];</code>
     * @param value The bytes of the resourceIds to add.
     * @return This builder for chaining.
     */
    public Builder addResourceIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureResourceIdsIsMutable();
      resourceIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.GetResourcesRequest)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.GetResourcesRequest)
  private static final com.aruna.api.storage.services.v2.GetResourcesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.GetResourcesRequest();
  }

  public static com.aruna.api.storage.services.v2.GetResourcesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetResourcesRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetResourcesRequest>() {
    @java.lang.Override
    public GetResourcesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetResourcesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetResourcesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.GetResourcesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

