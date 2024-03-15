// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/dataproxy/services/v2/dataproxy_service.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.dataproxy.services.v2;

/**
 * <pre>
 * Messages (requests) from PROXY B
 * </pre>
 *
 * Protobuf type {@code aruna.api.dataproxy.services.v2.InitMessage}
 */
public final class InitMessage extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:aruna.api.dataproxy.services.v2.InitMessage)
    InitMessageOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      InitMessage.class.getName());
  }
  // Use InitMessage.newBuilder() to construct.
  private InitMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private InitMessage() {
    dataproxyId_ = "";
    objectIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_InitMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_InitMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.dataproxy.services.v2.InitMessage.class, com.aruna.api.dataproxy.services.v2.InitMessage.Builder.class);
  }

  public static final int DATAPROXY_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object dataproxyId_ = "";
  /**
   * <code>string dataproxy_id = 1 [json_name = "dataproxyId"];</code>
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
   * <code>string dataproxy_id = 1 [json_name = "dataproxyId"];</code>
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

  public static final int OBJECT_IDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList objectIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string object_ids = 2 [json_name = "objectIds"];</code>
   * @return A list containing the objectIds.
   */
  public com.google.protobuf.ProtocolStringList
      getObjectIdsList() {
    return objectIds_;
  }
  /**
   * <code>repeated string object_ids = 2 [json_name = "objectIds"];</code>
   * @return The count of objectIds.
   */
  public int getObjectIdsCount() {
    return objectIds_.size();
  }
  /**
   * <code>repeated string object_ids = 2 [json_name = "objectIds"];</code>
   * @param index The index of the element to return.
   * @return The objectIds at the given index.
   */
  public java.lang.String getObjectIds(int index) {
    return objectIds_.get(index);
  }
  /**
   * <code>repeated string object_ids = 2 [json_name = "objectIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the objectIds at the given index.
   */
  public com.google.protobuf.ByteString
      getObjectIdsBytes(int index) {
    return objectIds_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(dataproxyId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, dataproxyId_);
    }
    for (int i = 0; i < objectIds_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, objectIds_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(dataproxyId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, dataproxyId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < objectIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(objectIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getObjectIdsList().size();
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
    if (!(obj instanceof com.aruna.api.dataproxy.services.v2.InitMessage)) {
      return super.equals(obj);
    }
    com.aruna.api.dataproxy.services.v2.InitMessage other = (com.aruna.api.dataproxy.services.v2.InitMessage) obj;

    if (!getDataproxyId()
        .equals(other.getDataproxyId())) return false;
    if (!getObjectIdsList()
        .equals(other.getObjectIdsList())) return false;
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
    hash = (37 * hash) + DATAPROXY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDataproxyId().hashCode();
    if (getObjectIdsCount() > 0) {
      hash = (37 * hash) + OBJECT_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getObjectIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.dataproxy.services.v2.InitMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.dataproxy.services.v2.InitMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.dataproxy.services.v2.InitMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.aruna.api.dataproxy.services.v2.InitMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Messages (requests) from PROXY B
   * </pre>
   *
   * Protobuf type {@code aruna.api.dataproxy.services.v2.InitMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.dataproxy.services.v2.InitMessage)
      com.aruna.api.dataproxy.services.v2.InitMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_InitMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_InitMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.dataproxy.services.v2.InitMessage.class, com.aruna.api.dataproxy.services.v2.InitMessage.Builder.class);
    }

    // Construct using com.aruna.api.dataproxy.services.v2.InitMessage.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      dataproxyId_ = "";
      objectIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_InitMessage_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.InitMessage getDefaultInstanceForType() {
      return com.aruna.api.dataproxy.services.v2.InitMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.InitMessage build() {
      com.aruna.api.dataproxy.services.v2.InitMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.InitMessage buildPartial() {
      com.aruna.api.dataproxy.services.v2.InitMessage result = new com.aruna.api.dataproxy.services.v2.InitMessage(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.dataproxy.services.v2.InitMessage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dataproxyId_ = dataproxyId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        objectIds_.makeImmutable();
        result.objectIds_ = objectIds_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.aruna.api.dataproxy.services.v2.InitMessage) {
        return mergeFrom((com.aruna.api.dataproxy.services.v2.InitMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.dataproxy.services.v2.InitMessage other) {
      if (other == com.aruna.api.dataproxy.services.v2.InitMessage.getDefaultInstance()) return this;
      if (!other.getDataproxyId().isEmpty()) {
        dataproxyId_ = other.dataproxyId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.objectIds_.isEmpty()) {
        if (objectIds_.isEmpty()) {
          objectIds_ = other.objectIds_;
          bitField0_ |= 0x00000002;
        } else {
          ensureObjectIdsIsMutable();
          objectIds_.addAll(other.objectIds_);
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
              dataproxyId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureObjectIdsIsMutable();
              objectIds_.add(s);
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

    private java.lang.Object dataproxyId_ = "";
    /**
     * <code>string dataproxy_id = 1 [json_name = "dataproxyId"];</code>
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
     * <code>string dataproxy_id = 1 [json_name = "dataproxyId"];</code>
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
     * <code>string dataproxy_id = 1 [json_name = "dataproxyId"];</code>
     * @param value The dataproxyId to set.
     * @return This builder for chaining.
     */
    public Builder setDataproxyId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dataproxyId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string dataproxy_id = 1 [json_name = "dataproxyId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDataproxyId() {
      dataproxyId_ = getDefaultInstance().getDataproxyId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string dataproxy_id = 1 [json_name = "dataproxyId"];</code>
     * @param value The bytes for dataproxyId to set.
     * @return This builder for chaining.
     */
    public Builder setDataproxyIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dataproxyId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList objectIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureObjectIdsIsMutable() {
      if (!objectIds_.isModifiable()) {
        objectIds_ = new com.google.protobuf.LazyStringArrayList(objectIds_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>repeated string object_ids = 2 [json_name = "objectIds"];</code>
     * @return A list containing the objectIds.
     */
    public com.google.protobuf.ProtocolStringList
        getObjectIdsList() {
      objectIds_.makeImmutable();
      return objectIds_;
    }
    /**
     * <code>repeated string object_ids = 2 [json_name = "objectIds"];</code>
     * @return The count of objectIds.
     */
    public int getObjectIdsCount() {
      return objectIds_.size();
    }
    /**
     * <code>repeated string object_ids = 2 [json_name = "objectIds"];</code>
     * @param index The index of the element to return.
     * @return The objectIds at the given index.
     */
    public java.lang.String getObjectIds(int index) {
      return objectIds_.get(index);
    }
    /**
     * <code>repeated string object_ids = 2 [json_name = "objectIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the objectIds at the given index.
     */
    public com.google.protobuf.ByteString
        getObjectIdsBytes(int index) {
      return objectIds_.getByteString(index);
    }
    /**
     * <code>repeated string object_ids = 2 [json_name = "objectIds"];</code>
     * @param index The index to set the value at.
     * @param value The objectIds to set.
     * @return This builder for chaining.
     */
    public Builder setObjectIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureObjectIdsIsMutable();
      objectIds_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string object_ids = 2 [json_name = "objectIds"];</code>
     * @param value The objectIds to add.
     * @return This builder for chaining.
     */
    public Builder addObjectIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureObjectIdsIsMutable();
      objectIds_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string object_ids = 2 [json_name = "objectIds"];</code>
     * @param values The objectIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllObjectIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureObjectIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, objectIds_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string object_ids = 2 [json_name = "objectIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearObjectIds() {
      objectIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string object_ids = 2 [json_name = "objectIds"];</code>
     * @param value The bytes of the objectIds to add.
     * @return This builder for chaining.
     */
    public Builder addObjectIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureObjectIdsIsMutable();
      objectIds_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:aruna.api.dataproxy.services.v2.InitMessage)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.dataproxy.services.v2.InitMessage)
  private static final com.aruna.api.dataproxy.services.v2.InitMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.dataproxy.services.v2.InitMessage();
  }

  public static com.aruna.api.dataproxy.services.v2.InitMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InitMessage>
      PARSER = new com.google.protobuf.AbstractParser<InitMessage>() {
    @java.lang.Override
    public InitMessage parsePartialFrom(
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

  public static com.google.protobuf.Parser<InitMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InitMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.dataproxy.services.v2.InitMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

