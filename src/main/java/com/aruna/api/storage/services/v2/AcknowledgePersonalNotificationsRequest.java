// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/user_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest}
 */
public final class AcknowledgePersonalNotificationsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest)
    AcknowledgePersonalNotificationsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AcknowledgePersonalNotificationsRequest.newBuilder() to construct.
  private AcknowledgePersonalNotificationsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AcknowledgePersonalNotificationsRequest() {
    notificationIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AcknowledgePersonalNotificationsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.UserServiceProto.internal_static_aruna_api_storage_services_v2_AcknowledgePersonalNotificationsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.UserServiceProto.internal_static_aruna_api_storage_services_v2_AcknowledgePersonalNotificationsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest.class, com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest.Builder.class);
  }

  public static final int NOTIFICATION_IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList notificationIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string notification_ids = 1 [json_name = "notificationIds"];</code>
   * @return A list containing the notificationIds.
   */
  public com.google.protobuf.ProtocolStringList
      getNotificationIdsList() {
    return notificationIds_;
  }
  /**
   * <code>repeated string notification_ids = 1 [json_name = "notificationIds"];</code>
   * @return The count of notificationIds.
   */
  public int getNotificationIdsCount() {
    return notificationIds_.size();
  }
  /**
   * <code>repeated string notification_ids = 1 [json_name = "notificationIds"];</code>
   * @param index The index of the element to return.
   * @return The notificationIds at the given index.
   */
  public java.lang.String getNotificationIds(int index) {
    return notificationIds_.get(index);
  }
  /**
   * <code>repeated string notification_ids = 1 [json_name = "notificationIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the notificationIds at the given index.
   */
  public com.google.protobuf.ByteString
      getNotificationIdsBytes(int index) {
    return notificationIds_.getByteString(index);
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
    for (int i = 0; i < notificationIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, notificationIds_.getRaw(i));
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
      for (int i = 0; i < notificationIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(notificationIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNotificationIdsList().size();
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest other = (com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest) obj;

    if (!getNotificationIdsList()
        .equals(other.getNotificationIdsList())) return false;
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
    if (getNotificationIdsCount() > 0) {
      hash = (37 * hash) + NOTIFICATION_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getNotificationIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest)
      com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.UserServiceProto.internal_static_aruna_api_storage_services_v2_AcknowledgePersonalNotificationsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.UserServiceProto.internal_static_aruna_api_storage_services_v2_AcknowledgePersonalNotificationsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest.class, com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest.newBuilder()
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
      notificationIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.UserServiceProto.internal_static_aruna_api_storage_services_v2_AcknowledgePersonalNotificationsRequest_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest build() {
      com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest buildPartial() {
      com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest result = new com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        notificationIds_.makeImmutable();
        result.notificationIds_ = notificationIds_;
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
      if (other instanceof com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest) {
        return mergeFrom((com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest other) {
      if (other == com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest.getDefaultInstance()) return this;
      if (!other.notificationIds_.isEmpty()) {
        if (notificationIds_.isEmpty()) {
          notificationIds_ = other.notificationIds_;
          bitField0_ |= 0x00000001;
        } else {
          ensureNotificationIdsIsMutable();
          notificationIds_.addAll(other.notificationIds_);
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
              ensureNotificationIdsIsMutable();
              notificationIds_.add(s);
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

    private com.google.protobuf.LazyStringArrayList notificationIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureNotificationIdsIsMutable() {
      if (!notificationIds_.isModifiable()) {
        notificationIds_ = new com.google.protobuf.LazyStringArrayList(notificationIds_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string notification_ids = 1 [json_name = "notificationIds"];</code>
     * @return A list containing the notificationIds.
     */
    public com.google.protobuf.ProtocolStringList
        getNotificationIdsList() {
      notificationIds_.makeImmutable();
      return notificationIds_;
    }
    /**
     * <code>repeated string notification_ids = 1 [json_name = "notificationIds"];</code>
     * @return The count of notificationIds.
     */
    public int getNotificationIdsCount() {
      return notificationIds_.size();
    }
    /**
     * <code>repeated string notification_ids = 1 [json_name = "notificationIds"];</code>
     * @param index The index of the element to return.
     * @return The notificationIds at the given index.
     */
    public java.lang.String getNotificationIds(int index) {
      return notificationIds_.get(index);
    }
    /**
     * <code>repeated string notification_ids = 1 [json_name = "notificationIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the notificationIds at the given index.
     */
    public com.google.protobuf.ByteString
        getNotificationIdsBytes(int index) {
      return notificationIds_.getByteString(index);
    }
    /**
     * <code>repeated string notification_ids = 1 [json_name = "notificationIds"];</code>
     * @param index The index to set the value at.
     * @param value The notificationIds to set.
     * @return This builder for chaining.
     */
    public Builder setNotificationIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureNotificationIdsIsMutable();
      notificationIds_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string notification_ids = 1 [json_name = "notificationIds"];</code>
     * @param value The notificationIds to add.
     * @return This builder for chaining.
     */
    public Builder addNotificationIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureNotificationIdsIsMutable();
      notificationIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string notification_ids = 1 [json_name = "notificationIds"];</code>
     * @param values The notificationIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllNotificationIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureNotificationIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, notificationIds_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string notification_ids = 1 [json_name = "notificationIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNotificationIds() {
      notificationIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string notification_ids = 1 [json_name = "notificationIds"];</code>
     * @param value The bytes of the notificationIds to add.
     * @return This builder for chaining.
     */
    public Builder addNotificationIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureNotificationIdsIsMutable();
      notificationIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest)
  private static final com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest();
  }

  public static com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AcknowledgePersonalNotificationsRequest>
      PARSER = new com.google.protobuf.AbstractParser<AcknowledgePersonalNotificationsRequest>() {
    @java.lang.Override
    public AcknowledgePersonalNotificationsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AcknowledgePersonalNotificationsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AcknowledgePersonalNotificationsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

