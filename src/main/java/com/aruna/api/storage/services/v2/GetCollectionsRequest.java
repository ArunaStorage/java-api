// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/collection_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.GetCollectionsRequest}
 */
public final class GetCollectionsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.GetCollectionsRequest)
    GetCollectionsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetCollectionsRequest.newBuilder() to construct.
  private GetCollectionsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetCollectionsRequest() {
    collectionIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetCollectionsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.CollectionServiceProto.internal_static_aruna_api_storage_services_v2_GetCollectionsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.CollectionServiceProto.internal_static_aruna_api_storage_services_v2_GetCollectionsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.GetCollectionsRequest.class, com.aruna.api.storage.services.v2.GetCollectionsRequest.Builder.class);
  }

  public static final int COLLECTION_IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList collectionIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string collection_ids = 1 [json_name = "collectionIds"];</code>
   * @return A list containing the collectionIds.
   */
  public com.google.protobuf.ProtocolStringList
      getCollectionIdsList() {
    return collectionIds_;
  }
  /**
   * <code>repeated string collection_ids = 1 [json_name = "collectionIds"];</code>
   * @return The count of collectionIds.
   */
  public int getCollectionIdsCount() {
    return collectionIds_.size();
  }
  /**
   * <code>repeated string collection_ids = 1 [json_name = "collectionIds"];</code>
   * @param index The index of the element to return.
   * @return The collectionIds at the given index.
   */
  public java.lang.String getCollectionIds(int index) {
    return collectionIds_.get(index);
  }
  /**
   * <code>repeated string collection_ids = 1 [json_name = "collectionIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the collectionIds at the given index.
   */
  public com.google.protobuf.ByteString
      getCollectionIdsBytes(int index) {
    return collectionIds_.getByteString(index);
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
    for (int i = 0; i < collectionIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, collectionIds_.getRaw(i));
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
      for (int i = 0; i < collectionIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(collectionIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getCollectionIdsList().size();
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.GetCollectionsRequest)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.GetCollectionsRequest other = (com.aruna.api.storage.services.v2.GetCollectionsRequest) obj;

    if (!getCollectionIdsList()
        .equals(other.getCollectionIdsList())) return false;
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
    if (getCollectionIdsCount() > 0) {
      hash = (37 * hash) + COLLECTION_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getCollectionIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.GetCollectionsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetCollectionsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetCollectionsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetCollectionsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetCollectionsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetCollectionsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetCollectionsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetCollectionsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.GetCollectionsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.GetCollectionsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetCollectionsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetCollectionsRequest parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.GetCollectionsRequest prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.GetCollectionsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.GetCollectionsRequest)
      com.aruna.api.storage.services.v2.GetCollectionsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.CollectionServiceProto.internal_static_aruna_api_storage_services_v2_GetCollectionsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.CollectionServiceProto.internal_static_aruna_api_storage_services_v2_GetCollectionsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.GetCollectionsRequest.class, com.aruna.api.storage.services.v2.GetCollectionsRequest.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.GetCollectionsRequest.newBuilder()
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
      collectionIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.CollectionServiceProto.internal_static_aruna_api_storage_services_v2_GetCollectionsRequest_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetCollectionsRequest getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.GetCollectionsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetCollectionsRequest build() {
      com.aruna.api.storage.services.v2.GetCollectionsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetCollectionsRequest buildPartial() {
      com.aruna.api.storage.services.v2.GetCollectionsRequest result = new com.aruna.api.storage.services.v2.GetCollectionsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.GetCollectionsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        collectionIds_.makeImmutable();
        result.collectionIds_ = collectionIds_;
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
      if (other instanceof com.aruna.api.storage.services.v2.GetCollectionsRequest) {
        return mergeFrom((com.aruna.api.storage.services.v2.GetCollectionsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.GetCollectionsRequest other) {
      if (other == com.aruna.api.storage.services.v2.GetCollectionsRequest.getDefaultInstance()) return this;
      if (!other.collectionIds_.isEmpty()) {
        if (collectionIds_.isEmpty()) {
          collectionIds_ = other.collectionIds_;
          bitField0_ |= 0x00000001;
        } else {
          ensureCollectionIdsIsMutable();
          collectionIds_.addAll(other.collectionIds_);
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
              ensureCollectionIdsIsMutable();
              collectionIds_.add(s);
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

    private com.google.protobuf.LazyStringArrayList collectionIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureCollectionIdsIsMutable() {
      if (!collectionIds_.isModifiable()) {
        collectionIds_ = new com.google.protobuf.LazyStringArrayList(collectionIds_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string collection_ids = 1 [json_name = "collectionIds"];</code>
     * @return A list containing the collectionIds.
     */
    public com.google.protobuf.ProtocolStringList
        getCollectionIdsList() {
      collectionIds_.makeImmutable();
      return collectionIds_;
    }
    /**
     * <code>repeated string collection_ids = 1 [json_name = "collectionIds"];</code>
     * @return The count of collectionIds.
     */
    public int getCollectionIdsCount() {
      return collectionIds_.size();
    }
    /**
     * <code>repeated string collection_ids = 1 [json_name = "collectionIds"];</code>
     * @param index The index of the element to return.
     * @return The collectionIds at the given index.
     */
    public java.lang.String getCollectionIds(int index) {
      return collectionIds_.get(index);
    }
    /**
     * <code>repeated string collection_ids = 1 [json_name = "collectionIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the collectionIds at the given index.
     */
    public com.google.protobuf.ByteString
        getCollectionIdsBytes(int index) {
      return collectionIds_.getByteString(index);
    }
    /**
     * <code>repeated string collection_ids = 1 [json_name = "collectionIds"];</code>
     * @param index The index to set the value at.
     * @param value The collectionIds to set.
     * @return This builder for chaining.
     */
    public Builder setCollectionIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureCollectionIdsIsMutable();
      collectionIds_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string collection_ids = 1 [json_name = "collectionIds"];</code>
     * @param value The collectionIds to add.
     * @return This builder for chaining.
     */
    public Builder addCollectionIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureCollectionIdsIsMutable();
      collectionIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string collection_ids = 1 [json_name = "collectionIds"];</code>
     * @param values The collectionIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllCollectionIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureCollectionIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, collectionIds_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string collection_ids = 1 [json_name = "collectionIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCollectionIds() {
      collectionIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string collection_ids = 1 [json_name = "collectionIds"];</code>
     * @param value The bytes of the collectionIds to add.
     * @return This builder for chaining.
     */
    public Builder addCollectionIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureCollectionIdsIsMutable();
      collectionIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.GetCollectionsRequest)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.GetCollectionsRequest)
  private static final com.aruna.api.storage.services.v2.GetCollectionsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.GetCollectionsRequest();
  }

  public static com.aruna.api.storage.services.v2.GetCollectionsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCollectionsRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetCollectionsRequest>() {
    @java.lang.Override
    public GetCollectionsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetCollectionsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCollectionsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.GetCollectionsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

