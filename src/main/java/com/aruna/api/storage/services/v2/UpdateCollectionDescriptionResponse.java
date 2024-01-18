// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/collection_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse}
 */
public final class UpdateCollectionDescriptionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse)
    UpdateCollectionDescriptionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateCollectionDescriptionResponse.newBuilder() to construct.
  private UpdateCollectionDescriptionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateCollectionDescriptionResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateCollectionDescriptionResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.CollectionServiceProto.internal_static_aruna_api_storage_services_v2_UpdateCollectionDescriptionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.CollectionServiceProto.internal_static_aruna_api_storage_services_v2_UpdateCollectionDescriptionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse.class, com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse.Builder.class);
  }

  private int bitField0_;
  public static final int COLLECTION_FIELD_NUMBER = 1;
  private com.aruna.api.storage.models.v2.Collection collection_;
  /**
   * <code>.aruna.api.storage.models.v2.Collection collection = 1 [json_name = "collection"];</code>
   * @return Whether the collection field is set.
   */
  @java.lang.Override
  public boolean hasCollection() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.aruna.api.storage.models.v2.Collection collection = 1 [json_name = "collection"];</code>
   * @return The collection.
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.Collection getCollection() {
    return collection_ == null ? com.aruna.api.storage.models.v2.Collection.getDefaultInstance() : collection_;
  }
  /**
   * <code>.aruna.api.storage.models.v2.Collection collection = 1 [json_name = "collection"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.CollectionOrBuilder getCollectionOrBuilder() {
    return collection_ == null ? com.aruna.api.storage.models.v2.Collection.getDefaultInstance() : collection_;
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
      output.writeMessage(1, getCollection());
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
        .computeMessageSize(1, getCollection());
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse other = (com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse) obj;

    if (hasCollection() != other.hasCollection()) return false;
    if (hasCollection()) {
      if (!getCollection()
          .equals(other.getCollection())) return false;
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
    if (hasCollection()) {
      hash = (37 * hash) + COLLECTION_FIELD_NUMBER;
      hash = (53 * hash) + getCollection().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse)
      com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.CollectionServiceProto.internal_static_aruna_api_storage_services_v2_UpdateCollectionDescriptionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.CollectionServiceProto.internal_static_aruna_api_storage_services_v2_UpdateCollectionDescriptionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse.class, com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse.newBuilder()
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
        getCollectionFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      collection_ = null;
      if (collectionBuilder_ != null) {
        collectionBuilder_.dispose();
        collectionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.CollectionServiceProto.internal_static_aruna_api_storage_services_v2_UpdateCollectionDescriptionResponse_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse build() {
      com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse buildPartial() {
      com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse result = new com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.collection_ = collectionBuilder_ == null
            ? collection_
            : collectionBuilder_.build();
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
      if (other instanceof com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse) {
        return mergeFrom((com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse other) {
      if (other == com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse.getDefaultInstance()) return this;
      if (other.hasCollection()) {
        mergeCollection(other.getCollection());
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
                  getCollectionFieldBuilder().getBuilder(),
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

    private com.aruna.api.storage.models.v2.Collection collection_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.storage.models.v2.Collection, com.aruna.api.storage.models.v2.Collection.Builder, com.aruna.api.storage.models.v2.CollectionOrBuilder> collectionBuilder_;
    /**
     * <code>.aruna.api.storage.models.v2.Collection collection = 1 [json_name = "collection"];</code>
     * @return Whether the collection field is set.
     */
    public boolean hasCollection() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.aruna.api.storage.models.v2.Collection collection = 1 [json_name = "collection"];</code>
     * @return The collection.
     */
    public com.aruna.api.storage.models.v2.Collection getCollection() {
      if (collectionBuilder_ == null) {
        return collection_ == null ? com.aruna.api.storage.models.v2.Collection.getDefaultInstance() : collection_;
      } else {
        return collectionBuilder_.getMessage();
      }
    }
    /**
     * <code>.aruna.api.storage.models.v2.Collection collection = 1 [json_name = "collection"];</code>
     */
    public Builder setCollection(com.aruna.api.storage.models.v2.Collection value) {
      if (collectionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        collection_ = value;
      } else {
        collectionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Collection collection = 1 [json_name = "collection"];</code>
     */
    public Builder setCollection(
        com.aruna.api.storage.models.v2.Collection.Builder builderForValue) {
      if (collectionBuilder_ == null) {
        collection_ = builderForValue.build();
      } else {
        collectionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Collection collection = 1 [json_name = "collection"];</code>
     */
    public Builder mergeCollection(com.aruna.api.storage.models.v2.Collection value) {
      if (collectionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          collection_ != null &&
          collection_ != com.aruna.api.storage.models.v2.Collection.getDefaultInstance()) {
          getCollectionBuilder().mergeFrom(value);
        } else {
          collection_ = value;
        }
      } else {
        collectionBuilder_.mergeFrom(value);
      }
      if (collection_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Collection collection = 1 [json_name = "collection"];</code>
     */
    public Builder clearCollection() {
      bitField0_ = (bitField0_ & ~0x00000001);
      collection_ = null;
      if (collectionBuilder_ != null) {
        collectionBuilder_.dispose();
        collectionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Collection collection = 1 [json_name = "collection"];</code>
     */
    public com.aruna.api.storage.models.v2.Collection.Builder getCollectionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCollectionFieldBuilder().getBuilder();
    }
    /**
     * <code>.aruna.api.storage.models.v2.Collection collection = 1 [json_name = "collection"];</code>
     */
    public com.aruna.api.storage.models.v2.CollectionOrBuilder getCollectionOrBuilder() {
      if (collectionBuilder_ != null) {
        return collectionBuilder_.getMessageOrBuilder();
      } else {
        return collection_ == null ?
            com.aruna.api.storage.models.v2.Collection.getDefaultInstance() : collection_;
      }
    }
    /**
     * <code>.aruna.api.storage.models.v2.Collection collection = 1 [json_name = "collection"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.storage.models.v2.Collection, com.aruna.api.storage.models.v2.Collection.Builder, com.aruna.api.storage.models.v2.CollectionOrBuilder> 
        getCollectionFieldBuilder() {
      if (collectionBuilder_ == null) {
        collectionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aruna.api.storage.models.v2.Collection, com.aruna.api.storage.models.v2.Collection.Builder, com.aruna.api.storage.models.v2.CollectionOrBuilder>(
                getCollection(),
                getParentForChildren(),
                isClean());
        collection_ = null;
      }
      return collectionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse)
  private static final com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse();
  }

  public static com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateCollectionDescriptionResponse>
      PARSER = new com.google.protobuf.AbstractParser<UpdateCollectionDescriptionResponse>() {
    @java.lang.Override
    public UpdateCollectionDescriptionResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateCollectionDescriptionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCollectionDescriptionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

