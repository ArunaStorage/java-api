// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/object_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.GetObjectEndpointsRequest}
 */
public final class GetObjectEndpointsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.GetObjectEndpointsRequest)
    GetObjectEndpointsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetObjectEndpointsRequest.newBuilder() to construct.
  private GetObjectEndpointsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetObjectEndpointsRequest() {
    collectionId_ = "";
    objectId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetObjectEndpointsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_GetObjectEndpointsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_GetObjectEndpointsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.GetObjectEndpointsRequest.class, com.aruna.api.storage.services.v2.GetObjectEndpointsRequest.Builder.class);
  }

  public static final int COLLECTION_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object collectionId_ = "";
  /**
   * <pre>
   * Collection id
   * </pre>
   *
   * <code>string collection_id = 1 [json_name = "collectionId"];</code>
   * @return The collectionId.
   */
  @java.lang.Override
  public java.lang.String getCollectionId() {
    java.lang.Object ref = collectionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      collectionId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Collection id
   * </pre>
   *
   * <code>string collection_id = 1 [json_name = "collectionId"];</code>
   * @return The bytes for collectionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCollectionIdBytes() {
    java.lang.Object ref = collectionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      collectionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OBJECT_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object objectId_ = "";
  /**
   * <pre>
   * Object id
   * </pre>
   *
   * <code>string object_id = 2 [json_name = "objectId"];</code>
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
   * Object id
   * </pre>
   *
   * <code>string object_id = 2 [json_name = "objectId"];</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(collectionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, collectionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(objectId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, objectId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(collectionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, collectionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(objectId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, objectId_);
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.GetObjectEndpointsRequest)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.GetObjectEndpointsRequest other = (com.aruna.api.storage.services.v2.GetObjectEndpointsRequest) obj;

    if (!getCollectionId()
        .equals(other.getCollectionId())) return false;
    if (!getObjectId()
        .equals(other.getObjectId())) return false;
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
    hash = (37 * hash) + COLLECTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCollectionId().hashCode();
    hash = (37 * hash) + OBJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getObjectId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.GetObjectEndpointsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetObjectEndpointsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetObjectEndpointsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetObjectEndpointsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetObjectEndpointsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetObjectEndpointsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetObjectEndpointsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetObjectEndpointsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.GetObjectEndpointsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.GetObjectEndpointsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetObjectEndpointsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetObjectEndpointsRequest parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.GetObjectEndpointsRequest prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.GetObjectEndpointsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.GetObjectEndpointsRequest)
      com.aruna.api.storage.services.v2.GetObjectEndpointsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_GetObjectEndpointsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_GetObjectEndpointsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.GetObjectEndpointsRequest.class, com.aruna.api.storage.services.v2.GetObjectEndpointsRequest.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.GetObjectEndpointsRequest.newBuilder()
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
      collectionId_ = "";
      objectId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_GetObjectEndpointsRequest_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetObjectEndpointsRequest getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.GetObjectEndpointsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetObjectEndpointsRequest build() {
      com.aruna.api.storage.services.v2.GetObjectEndpointsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetObjectEndpointsRequest buildPartial() {
      com.aruna.api.storage.services.v2.GetObjectEndpointsRequest result = new com.aruna.api.storage.services.v2.GetObjectEndpointsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.GetObjectEndpointsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.collectionId_ = collectionId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.objectId_ = objectId_;
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
      if (other instanceof com.aruna.api.storage.services.v2.GetObjectEndpointsRequest) {
        return mergeFrom((com.aruna.api.storage.services.v2.GetObjectEndpointsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.GetObjectEndpointsRequest other) {
      if (other == com.aruna.api.storage.services.v2.GetObjectEndpointsRequest.getDefaultInstance()) return this;
      if (!other.getCollectionId().isEmpty()) {
        collectionId_ = other.collectionId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getObjectId().isEmpty()) {
        objectId_ = other.objectId_;
        bitField0_ |= 0x00000002;
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
              collectionId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              objectId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object collectionId_ = "";
    /**
     * <pre>
     * Collection id
     * </pre>
     *
     * <code>string collection_id = 1 [json_name = "collectionId"];</code>
     * @return The collectionId.
     */
    public java.lang.String getCollectionId() {
      java.lang.Object ref = collectionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        collectionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Collection id
     * </pre>
     *
     * <code>string collection_id = 1 [json_name = "collectionId"];</code>
     * @return The bytes for collectionId.
     */
    public com.google.protobuf.ByteString
        getCollectionIdBytes() {
      java.lang.Object ref = collectionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        collectionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Collection id
     * </pre>
     *
     * <code>string collection_id = 1 [json_name = "collectionId"];</code>
     * @param value The collectionId to set.
     * @return This builder for chaining.
     */
    public Builder setCollectionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      collectionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Collection id
     * </pre>
     *
     * <code>string collection_id = 1 [json_name = "collectionId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCollectionId() {
      collectionId_ = getDefaultInstance().getCollectionId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Collection id
     * </pre>
     *
     * <code>string collection_id = 1 [json_name = "collectionId"];</code>
     * @param value The bytes for collectionId to set.
     * @return This builder for chaining.
     */
    public Builder setCollectionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      collectionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object objectId_ = "";
    /**
     * <pre>
     * Object id
     * </pre>
     *
     * <code>string object_id = 2 [json_name = "objectId"];</code>
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
     * Object id
     * </pre>
     *
     * <code>string object_id = 2 [json_name = "objectId"];</code>
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
     * Object id
     * </pre>
     *
     * <code>string object_id = 2 [json_name = "objectId"];</code>
     * @param value The objectId to set.
     * @return This builder for chaining.
     */
    public Builder setObjectId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      objectId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Object id
     * </pre>
     *
     * <code>string object_id = 2 [json_name = "objectId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearObjectId() {
      objectId_ = getDefaultInstance().getObjectId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Object id
     * </pre>
     *
     * <code>string object_id = 2 [json_name = "objectId"];</code>
     * @param value The bytes for objectId to set.
     * @return This builder for chaining.
     */
    public Builder setObjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      objectId_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.GetObjectEndpointsRequest)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.GetObjectEndpointsRequest)
  private static final com.aruna.api.storage.services.v2.GetObjectEndpointsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.GetObjectEndpointsRequest();
  }

  public static com.aruna.api.storage.services.v2.GetObjectEndpointsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetObjectEndpointsRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetObjectEndpointsRequest>() {
    @java.lang.Override
    public GetObjectEndpointsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetObjectEndpointsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetObjectEndpointsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.GetObjectEndpointsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

