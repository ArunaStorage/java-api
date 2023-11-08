// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/info_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.SetAnnouncementsRequest}
 */
public final class SetAnnouncementsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.SetAnnouncementsRequest)
    SetAnnouncementsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetAnnouncementsRequest.newBuilder() to construct.
  private SetAnnouncementsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetAnnouncementsRequest() {
    announcementsUpsert_ = java.util.Collections.emptyList();
    announcementsDelete_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetAnnouncementsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_SetAnnouncementsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_SetAnnouncementsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.SetAnnouncementsRequest.class, com.aruna.api.storage.services.v2.SetAnnouncementsRequest.Builder.class);
  }

  public static final int ANNOUNCEMENTS_UPSERT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.aruna.api.storage.services.v2.Announcement> announcementsUpsert_;
  /**
   * <code>repeated .aruna.api.storage.services.v2.Announcement announcements_upsert = 1 [json_name = "announcementsUpsert"];</code>
   */
  @java.lang.Override
  public java.util.List<com.aruna.api.storage.services.v2.Announcement> getAnnouncementsUpsertList() {
    return announcementsUpsert_;
  }
  /**
   * <code>repeated .aruna.api.storage.services.v2.Announcement announcements_upsert = 1 [json_name = "announcementsUpsert"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.aruna.api.storage.services.v2.AnnouncementOrBuilder> 
      getAnnouncementsUpsertOrBuilderList() {
    return announcementsUpsert_;
  }
  /**
   * <code>repeated .aruna.api.storage.services.v2.Announcement announcements_upsert = 1 [json_name = "announcementsUpsert"];</code>
   */
  @java.lang.Override
  public int getAnnouncementsUpsertCount() {
    return announcementsUpsert_.size();
  }
  /**
   * <code>repeated .aruna.api.storage.services.v2.Announcement announcements_upsert = 1 [json_name = "announcementsUpsert"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.services.v2.Announcement getAnnouncementsUpsert(int index) {
    return announcementsUpsert_.get(index);
  }
  /**
   * <code>repeated .aruna.api.storage.services.v2.Announcement announcements_upsert = 1 [json_name = "announcementsUpsert"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.services.v2.AnnouncementOrBuilder getAnnouncementsUpsertOrBuilder(
      int index) {
    return announcementsUpsert_.get(index);
  }

  public static final int ANNOUNCEMENTS_DELETE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList announcementsDelete_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string announcements_delete = 2 [json_name = "announcementsDelete"];</code>
   * @return A list containing the announcementsDelete.
   */
  public com.google.protobuf.ProtocolStringList
      getAnnouncementsDeleteList() {
    return announcementsDelete_;
  }
  /**
   * <code>repeated string announcements_delete = 2 [json_name = "announcementsDelete"];</code>
   * @return The count of announcementsDelete.
   */
  public int getAnnouncementsDeleteCount() {
    return announcementsDelete_.size();
  }
  /**
   * <code>repeated string announcements_delete = 2 [json_name = "announcementsDelete"];</code>
   * @param index The index of the element to return.
   * @return The announcementsDelete at the given index.
   */
  public java.lang.String getAnnouncementsDelete(int index) {
    return announcementsDelete_.get(index);
  }
  /**
   * <code>repeated string announcements_delete = 2 [json_name = "announcementsDelete"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the announcementsDelete at the given index.
   */
  public com.google.protobuf.ByteString
      getAnnouncementsDeleteBytes(int index) {
    return announcementsDelete_.getByteString(index);
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
    for (int i = 0; i < announcementsUpsert_.size(); i++) {
      output.writeMessage(1, announcementsUpsert_.get(i));
    }
    for (int i = 0; i < announcementsDelete_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, announcementsDelete_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < announcementsUpsert_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, announcementsUpsert_.get(i));
    }
    {
      int dataSize = 0;
      for (int i = 0; i < announcementsDelete_.size(); i++) {
        dataSize += computeStringSizeNoTag(announcementsDelete_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAnnouncementsDeleteList().size();
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.SetAnnouncementsRequest)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.SetAnnouncementsRequest other = (com.aruna.api.storage.services.v2.SetAnnouncementsRequest) obj;

    if (!getAnnouncementsUpsertList()
        .equals(other.getAnnouncementsUpsertList())) return false;
    if (!getAnnouncementsDeleteList()
        .equals(other.getAnnouncementsDeleteList())) return false;
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
    if (getAnnouncementsUpsertCount() > 0) {
      hash = (37 * hash) + ANNOUNCEMENTS_UPSERT_FIELD_NUMBER;
      hash = (53 * hash) + getAnnouncementsUpsertList().hashCode();
    }
    if (getAnnouncementsDeleteCount() > 0) {
      hash = (37 * hash) + ANNOUNCEMENTS_DELETE_FIELD_NUMBER;
      hash = (53 * hash) + getAnnouncementsDeleteList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.SetAnnouncementsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.SetAnnouncementsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.SetAnnouncementsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.SetAnnouncementsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.SetAnnouncementsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.SetAnnouncementsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.SetAnnouncementsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.SetAnnouncementsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.SetAnnouncementsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.SetAnnouncementsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.SetAnnouncementsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.SetAnnouncementsRequest parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.SetAnnouncementsRequest prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.SetAnnouncementsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.SetAnnouncementsRequest)
      com.aruna.api.storage.services.v2.SetAnnouncementsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_SetAnnouncementsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_SetAnnouncementsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.SetAnnouncementsRequest.class, com.aruna.api.storage.services.v2.SetAnnouncementsRequest.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.SetAnnouncementsRequest.newBuilder()
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
      if (announcementsUpsertBuilder_ == null) {
        announcementsUpsert_ = java.util.Collections.emptyList();
      } else {
        announcementsUpsert_ = null;
        announcementsUpsertBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      announcementsDelete_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_SetAnnouncementsRequest_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.SetAnnouncementsRequest getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.SetAnnouncementsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.SetAnnouncementsRequest build() {
      com.aruna.api.storage.services.v2.SetAnnouncementsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.SetAnnouncementsRequest buildPartial() {
      com.aruna.api.storage.services.v2.SetAnnouncementsRequest result = new com.aruna.api.storage.services.v2.SetAnnouncementsRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.aruna.api.storage.services.v2.SetAnnouncementsRequest result) {
      if (announcementsUpsertBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          announcementsUpsert_ = java.util.Collections.unmodifiableList(announcementsUpsert_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.announcementsUpsert_ = announcementsUpsert_;
      } else {
        result.announcementsUpsert_ = announcementsUpsertBuilder_.build();
      }
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.SetAnnouncementsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        announcementsDelete_.makeImmutable();
        result.announcementsDelete_ = announcementsDelete_;
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
      if (other instanceof com.aruna.api.storage.services.v2.SetAnnouncementsRequest) {
        return mergeFrom((com.aruna.api.storage.services.v2.SetAnnouncementsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.SetAnnouncementsRequest other) {
      if (other == com.aruna.api.storage.services.v2.SetAnnouncementsRequest.getDefaultInstance()) return this;
      if (announcementsUpsertBuilder_ == null) {
        if (!other.announcementsUpsert_.isEmpty()) {
          if (announcementsUpsert_.isEmpty()) {
            announcementsUpsert_ = other.announcementsUpsert_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAnnouncementsUpsertIsMutable();
            announcementsUpsert_.addAll(other.announcementsUpsert_);
          }
          onChanged();
        }
      } else {
        if (!other.announcementsUpsert_.isEmpty()) {
          if (announcementsUpsertBuilder_.isEmpty()) {
            announcementsUpsertBuilder_.dispose();
            announcementsUpsertBuilder_ = null;
            announcementsUpsert_ = other.announcementsUpsert_;
            bitField0_ = (bitField0_ & ~0x00000001);
            announcementsUpsertBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAnnouncementsUpsertFieldBuilder() : null;
          } else {
            announcementsUpsertBuilder_.addAllMessages(other.announcementsUpsert_);
          }
        }
      }
      if (!other.announcementsDelete_.isEmpty()) {
        if (announcementsDelete_.isEmpty()) {
          announcementsDelete_ = other.announcementsDelete_;
          bitField0_ |= 0x00000002;
        } else {
          ensureAnnouncementsDeleteIsMutable();
          announcementsDelete_.addAll(other.announcementsDelete_);
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
              com.aruna.api.storage.services.v2.Announcement m =
                  input.readMessage(
                      com.aruna.api.storage.services.v2.Announcement.parser(),
                      extensionRegistry);
              if (announcementsUpsertBuilder_ == null) {
                ensureAnnouncementsUpsertIsMutable();
                announcementsUpsert_.add(m);
              } else {
                announcementsUpsertBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureAnnouncementsDeleteIsMutable();
              announcementsDelete_.add(s);
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

    private java.util.List<com.aruna.api.storage.services.v2.Announcement> announcementsUpsert_ =
      java.util.Collections.emptyList();
    private void ensureAnnouncementsUpsertIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        announcementsUpsert_ = new java.util.ArrayList<com.aruna.api.storage.services.v2.Announcement>(announcementsUpsert_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aruna.api.storage.services.v2.Announcement, com.aruna.api.storage.services.v2.Announcement.Builder, com.aruna.api.storage.services.v2.AnnouncementOrBuilder> announcementsUpsertBuilder_;

    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements_upsert = 1 [json_name = "announcementsUpsert"];</code>
     */
    public java.util.List<com.aruna.api.storage.services.v2.Announcement> getAnnouncementsUpsertList() {
      if (announcementsUpsertBuilder_ == null) {
        return java.util.Collections.unmodifiableList(announcementsUpsert_);
      } else {
        return announcementsUpsertBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements_upsert = 1 [json_name = "announcementsUpsert"];</code>
     */
    public int getAnnouncementsUpsertCount() {
      if (announcementsUpsertBuilder_ == null) {
        return announcementsUpsert_.size();
      } else {
        return announcementsUpsertBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements_upsert = 1 [json_name = "announcementsUpsert"];</code>
     */
    public com.aruna.api.storage.services.v2.Announcement getAnnouncementsUpsert(int index) {
      if (announcementsUpsertBuilder_ == null) {
        return announcementsUpsert_.get(index);
      } else {
        return announcementsUpsertBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements_upsert = 1 [json_name = "announcementsUpsert"];</code>
     */
    public Builder setAnnouncementsUpsert(
        int index, com.aruna.api.storage.services.v2.Announcement value) {
      if (announcementsUpsertBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnouncementsUpsertIsMutable();
        announcementsUpsert_.set(index, value);
        onChanged();
      } else {
        announcementsUpsertBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements_upsert = 1 [json_name = "announcementsUpsert"];</code>
     */
    public Builder setAnnouncementsUpsert(
        int index, com.aruna.api.storage.services.v2.Announcement.Builder builderForValue) {
      if (announcementsUpsertBuilder_ == null) {
        ensureAnnouncementsUpsertIsMutable();
        announcementsUpsert_.set(index, builderForValue.build());
        onChanged();
      } else {
        announcementsUpsertBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements_upsert = 1 [json_name = "announcementsUpsert"];</code>
     */
    public Builder addAnnouncementsUpsert(com.aruna.api.storage.services.v2.Announcement value) {
      if (announcementsUpsertBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnouncementsUpsertIsMutable();
        announcementsUpsert_.add(value);
        onChanged();
      } else {
        announcementsUpsertBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements_upsert = 1 [json_name = "announcementsUpsert"];</code>
     */
    public Builder addAnnouncementsUpsert(
        int index, com.aruna.api.storage.services.v2.Announcement value) {
      if (announcementsUpsertBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnouncementsUpsertIsMutable();
        announcementsUpsert_.add(index, value);
        onChanged();
      } else {
        announcementsUpsertBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements_upsert = 1 [json_name = "announcementsUpsert"];</code>
     */
    public Builder addAnnouncementsUpsert(
        com.aruna.api.storage.services.v2.Announcement.Builder builderForValue) {
      if (announcementsUpsertBuilder_ == null) {
        ensureAnnouncementsUpsertIsMutable();
        announcementsUpsert_.add(builderForValue.build());
        onChanged();
      } else {
        announcementsUpsertBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements_upsert = 1 [json_name = "announcementsUpsert"];</code>
     */
    public Builder addAnnouncementsUpsert(
        int index, com.aruna.api.storage.services.v2.Announcement.Builder builderForValue) {
      if (announcementsUpsertBuilder_ == null) {
        ensureAnnouncementsUpsertIsMutable();
        announcementsUpsert_.add(index, builderForValue.build());
        onChanged();
      } else {
        announcementsUpsertBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements_upsert = 1 [json_name = "announcementsUpsert"];</code>
     */
    public Builder addAllAnnouncementsUpsert(
        java.lang.Iterable<? extends com.aruna.api.storage.services.v2.Announcement> values) {
      if (announcementsUpsertBuilder_ == null) {
        ensureAnnouncementsUpsertIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, announcementsUpsert_);
        onChanged();
      } else {
        announcementsUpsertBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements_upsert = 1 [json_name = "announcementsUpsert"];</code>
     */
    public Builder clearAnnouncementsUpsert() {
      if (announcementsUpsertBuilder_ == null) {
        announcementsUpsert_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        announcementsUpsertBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements_upsert = 1 [json_name = "announcementsUpsert"];</code>
     */
    public Builder removeAnnouncementsUpsert(int index) {
      if (announcementsUpsertBuilder_ == null) {
        ensureAnnouncementsUpsertIsMutable();
        announcementsUpsert_.remove(index);
        onChanged();
      } else {
        announcementsUpsertBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements_upsert = 1 [json_name = "announcementsUpsert"];</code>
     */
    public com.aruna.api.storage.services.v2.Announcement.Builder getAnnouncementsUpsertBuilder(
        int index) {
      return getAnnouncementsUpsertFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements_upsert = 1 [json_name = "announcementsUpsert"];</code>
     */
    public com.aruna.api.storage.services.v2.AnnouncementOrBuilder getAnnouncementsUpsertOrBuilder(
        int index) {
      if (announcementsUpsertBuilder_ == null) {
        return announcementsUpsert_.get(index);  } else {
        return announcementsUpsertBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements_upsert = 1 [json_name = "announcementsUpsert"];</code>
     */
    public java.util.List<? extends com.aruna.api.storage.services.v2.AnnouncementOrBuilder> 
         getAnnouncementsUpsertOrBuilderList() {
      if (announcementsUpsertBuilder_ != null) {
        return announcementsUpsertBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(announcementsUpsert_);
      }
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements_upsert = 1 [json_name = "announcementsUpsert"];</code>
     */
    public com.aruna.api.storage.services.v2.Announcement.Builder addAnnouncementsUpsertBuilder() {
      return getAnnouncementsUpsertFieldBuilder().addBuilder(
          com.aruna.api.storage.services.v2.Announcement.getDefaultInstance());
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements_upsert = 1 [json_name = "announcementsUpsert"];</code>
     */
    public com.aruna.api.storage.services.v2.Announcement.Builder addAnnouncementsUpsertBuilder(
        int index) {
      return getAnnouncementsUpsertFieldBuilder().addBuilder(
          index, com.aruna.api.storage.services.v2.Announcement.getDefaultInstance());
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements_upsert = 1 [json_name = "announcementsUpsert"];</code>
     */
    public java.util.List<com.aruna.api.storage.services.v2.Announcement.Builder> 
         getAnnouncementsUpsertBuilderList() {
      return getAnnouncementsUpsertFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aruna.api.storage.services.v2.Announcement, com.aruna.api.storage.services.v2.Announcement.Builder, com.aruna.api.storage.services.v2.AnnouncementOrBuilder> 
        getAnnouncementsUpsertFieldBuilder() {
      if (announcementsUpsertBuilder_ == null) {
        announcementsUpsertBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.aruna.api.storage.services.v2.Announcement, com.aruna.api.storage.services.v2.Announcement.Builder, com.aruna.api.storage.services.v2.AnnouncementOrBuilder>(
                announcementsUpsert_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        announcementsUpsert_ = null;
      }
      return announcementsUpsertBuilder_;
    }

    private com.google.protobuf.LazyStringArrayList announcementsDelete_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureAnnouncementsDeleteIsMutable() {
      if (!announcementsDelete_.isModifiable()) {
        announcementsDelete_ = new com.google.protobuf.LazyStringArrayList(announcementsDelete_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>repeated string announcements_delete = 2 [json_name = "announcementsDelete"];</code>
     * @return A list containing the announcementsDelete.
     */
    public com.google.protobuf.ProtocolStringList
        getAnnouncementsDeleteList() {
      announcementsDelete_.makeImmutable();
      return announcementsDelete_;
    }
    /**
     * <code>repeated string announcements_delete = 2 [json_name = "announcementsDelete"];</code>
     * @return The count of announcementsDelete.
     */
    public int getAnnouncementsDeleteCount() {
      return announcementsDelete_.size();
    }
    /**
     * <code>repeated string announcements_delete = 2 [json_name = "announcementsDelete"];</code>
     * @param index The index of the element to return.
     * @return The announcementsDelete at the given index.
     */
    public java.lang.String getAnnouncementsDelete(int index) {
      return announcementsDelete_.get(index);
    }
    /**
     * <code>repeated string announcements_delete = 2 [json_name = "announcementsDelete"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the announcementsDelete at the given index.
     */
    public com.google.protobuf.ByteString
        getAnnouncementsDeleteBytes(int index) {
      return announcementsDelete_.getByteString(index);
    }
    /**
     * <code>repeated string announcements_delete = 2 [json_name = "announcementsDelete"];</code>
     * @param index The index to set the value at.
     * @param value The announcementsDelete to set.
     * @return This builder for chaining.
     */
    public Builder setAnnouncementsDelete(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAnnouncementsDeleteIsMutable();
      announcementsDelete_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string announcements_delete = 2 [json_name = "announcementsDelete"];</code>
     * @param value The announcementsDelete to add.
     * @return This builder for chaining.
     */
    public Builder addAnnouncementsDelete(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAnnouncementsDeleteIsMutable();
      announcementsDelete_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string announcements_delete = 2 [json_name = "announcementsDelete"];</code>
     * @param values The announcementsDelete to add.
     * @return This builder for chaining.
     */
    public Builder addAllAnnouncementsDelete(
        java.lang.Iterable<java.lang.String> values) {
      ensureAnnouncementsDeleteIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, announcementsDelete_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string announcements_delete = 2 [json_name = "announcementsDelete"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAnnouncementsDelete() {
      announcementsDelete_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string announcements_delete = 2 [json_name = "announcementsDelete"];</code>
     * @param value The bytes of the announcementsDelete to add.
     * @return This builder for chaining.
     */
    public Builder addAnnouncementsDeleteBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureAnnouncementsDeleteIsMutable();
      announcementsDelete_.add(value);
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.SetAnnouncementsRequest)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.SetAnnouncementsRequest)
  private static final com.aruna.api.storage.services.v2.SetAnnouncementsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.SetAnnouncementsRequest();
  }

  public static com.aruna.api.storage.services.v2.SetAnnouncementsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetAnnouncementsRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetAnnouncementsRequest>() {
    @java.lang.Override
    public SetAnnouncementsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SetAnnouncementsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetAnnouncementsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.SetAnnouncementsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
