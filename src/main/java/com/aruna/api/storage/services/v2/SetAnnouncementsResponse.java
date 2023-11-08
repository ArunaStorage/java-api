// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/info_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.SetAnnouncementsResponse}
 */
public final class SetAnnouncementsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.SetAnnouncementsResponse)
    SetAnnouncementsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetAnnouncementsResponse.newBuilder() to construct.
  private SetAnnouncementsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetAnnouncementsResponse() {
    announcements_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetAnnouncementsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_SetAnnouncementsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_SetAnnouncementsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.SetAnnouncementsResponse.class, com.aruna.api.storage.services.v2.SetAnnouncementsResponse.Builder.class);
  }

  public static final int ANNOUNCEMENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.aruna.api.storage.services.v2.Announcement> announcements_;
  /**
   * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
   */
  @java.lang.Override
  public java.util.List<com.aruna.api.storage.services.v2.Announcement> getAnnouncementsList() {
    return announcements_;
  }
  /**
   * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.aruna.api.storage.services.v2.AnnouncementOrBuilder> 
      getAnnouncementsOrBuilderList() {
    return announcements_;
  }
  /**
   * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
   */
  @java.lang.Override
  public int getAnnouncementsCount() {
    return announcements_.size();
  }
  /**
   * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.services.v2.Announcement getAnnouncements(int index) {
    return announcements_.get(index);
  }
  /**
   * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.services.v2.AnnouncementOrBuilder getAnnouncementsOrBuilder(
      int index) {
    return announcements_.get(index);
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
    for (int i = 0; i < announcements_.size(); i++) {
      output.writeMessage(1, announcements_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < announcements_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, announcements_.get(i));
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.SetAnnouncementsResponse)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.SetAnnouncementsResponse other = (com.aruna.api.storage.services.v2.SetAnnouncementsResponse) obj;

    if (!getAnnouncementsList()
        .equals(other.getAnnouncementsList())) return false;
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
    if (getAnnouncementsCount() > 0) {
      hash = (37 * hash) + ANNOUNCEMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getAnnouncementsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.SetAnnouncementsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.SetAnnouncementsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.SetAnnouncementsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.SetAnnouncementsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.SetAnnouncementsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.SetAnnouncementsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.SetAnnouncementsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.SetAnnouncementsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.SetAnnouncementsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.SetAnnouncementsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.SetAnnouncementsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.SetAnnouncementsResponse parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.SetAnnouncementsResponse prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.SetAnnouncementsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.SetAnnouncementsResponse)
      com.aruna.api.storage.services.v2.SetAnnouncementsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_SetAnnouncementsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_SetAnnouncementsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.SetAnnouncementsResponse.class, com.aruna.api.storage.services.v2.SetAnnouncementsResponse.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.SetAnnouncementsResponse.newBuilder()
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
      if (announcementsBuilder_ == null) {
        announcements_ = java.util.Collections.emptyList();
      } else {
        announcements_ = null;
        announcementsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_SetAnnouncementsResponse_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.SetAnnouncementsResponse getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.SetAnnouncementsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.SetAnnouncementsResponse build() {
      com.aruna.api.storage.services.v2.SetAnnouncementsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.SetAnnouncementsResponse buildPartial() {
      com.aruna.api.storage.services.v2.SetAnnouncementsResponse result = new com.aruna.api.storage.services.v2.SetAnnouncementsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.aruna.api.storage.services.v2.SetAnnouncementsResponse result) {
      if (announcementsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          announcements_ = java.util.Collections.unmodifiableList(announcements_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.announcements_ = announcements_;
      } else {
        result.announcements_ = announcementsBuilder_.build();
      }
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.SetAnnouncementsResponse result) {
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
      if (other instanceof com.aruna.api.storage.services.v2.SetAnnouncementsResponse) {
        return mergeFrom((com.aruna.api.storage.services.v2.SetAnnouncementsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.SetAnnouncementsResponse other) {
      if (other == com.aruna.api.storage.services.v2.SetAnnouncementsResponse.getDefaultInstance()) return this;
      if (announcementsBuilder_ == null) {
        if (!other.announcements_.isEmpty()) {
          if (announcements_.isEmpty()) {
            announcements_ = other.announcements_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAnnouncementsIsMutable();
            announcements_.addAll(other.announcements_);
          }
          onChanged();
        }
      } else {
        if (!other.announcements_.isEmpty()) {
          if (announcementsBuilder_.isEmpty()) {
            announcementsBuilder_.dispose();
            announcementsBuilder_ = null;
            announcements_ = other.announcements_;
            bitField0_ = (bitField0_ & ~0x00000001);
            announcementsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAnnouncementsFieldBuilder() : null;
          } else {
            announcementsBuilder_.addAllMessages(other.announcements_);
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
              com.aruna.api.storage.services.v2.Announcement m =
                  input.readMessage(
                      com.aruna.api.storage.services.v2.Announcement.parser(),
                      extensionRegistry);
              if (announcementsBuilder_ == null) {
                ensureAnnouncementsIsMutable();
                announcements_.add(m);
              } else {
                announcementsBuilder_.addMessage(m);
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

    private java.util.List<com.aruna.api.storage.services.v2.Announcement> announcements_ =
      java.util.Collections.emptyList();
    private void ensureAnnouncementsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        announcements_ = new java.util.ArrayList<com.aruna.api.storage.services.v2.Announcement>(announcements_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aruna.api.storage.services.v2.Announcement, com.aruna.api.storage.services.v2.Announcement.Builder, com.aruna.api.storage.services.v2.AnnouncementOrBuilder> announcementsBuilder_;

    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
     */
    public java.util.List<com.aruna.api.storage.services.v2.Announcement> getAnnouncementsList() {
      if (announcementsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(announcements_);
      } else {
        return announcementsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
     */
    public int getAnnouncementsCount() {
      if (announcementsBuilder_ == null) {
        return announcements_.size();
      } else {
        return announcementsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
     */
    public com.aruna.api.storage.services.v2.Announcement getAnnouncements(int index) {
      if (announcementsBuilder_ == null) {
        return announcements_.get(index);
      } else {
        return announcementsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
     */
    public Builder setAnnouncements(
        int index, com.aruna.api.storage.services.v2.Announcement value) {
      if (announcementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnouncementsIsMutable();
        announcements_.set(index, value);
        onChanged();
      } else {
        announcementsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
     */
    public Builder setAnnouncements(
        int index, com.aruna.api.storage.services.v2.Announcement.Builder builderForValue) {
      if (announcementsBuilder_ == null) {
        ensureAnnouncementsIsMutable();
        announcements_.set(index, builderForValue.build());
        onChanged();
      } else {
        announcementsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
     */
    public Builder addAnnouncements(com.aruna.api.storage.services.v2.Announcement value) {
      if (announcementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnouncementsIsMutable();
        announcements_.add(value);
        onChanged();
      } else {
        announcementsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
     */
    public Builder addAnnouncements(
        int index, com.aruna.api.storage.services.v2.Announcement value) {
      if (announcementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnouncementsIsMutable();
        announcements_.add(index, value);
        onChanged();
      } else {
        announcementsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
     */
    public Builder addAnnouncements(
        com.aruna.api.storage.services.v2.Announcement.Builder builderForValue) {
      if (announcementsBuilder_ == null) {
        ensureAnnouncementsIsMutable();
        announcements_.add(builderForValue.build());
        onChanged();
      } else {
        announcementsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
     */
    public Builder addAnnouncements(
        int index, com.aruna.api.storage.services.v2.Announcement.Builder builderForValue) {
      if (announcementsBuilder_ == null) {
        ensureAnnouncementsIsMutable();
        announcements_.add(index, builderForValue.build());
        onChanged();
      } else {
        announcementsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
     */
    public Builder addAllAnnouncements(
        java.lang.Iterable<? extends com.aruna.api.storage.services.v2.Announcement> values) {
      if (announcementsBuilder_ == null) {
        ensureAnnouncementsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, announcements_);
        onChanged();
      } else {
        announcementsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
     */
    public Builder clearAnnouncements() {
      if (announcementsBuilder_ == null) {
        announcements_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        announcementsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
     */
    public Builder removeAnnouncements(int index) {
      if (announcementsBuilder_ == null) {
        ensureAnnouncementsIsMutable();
        announcements_.remove(index);
        onChanged();
      } else {
        announcementsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
     */
    public com.aruna.api.storage.services.v2.Announcement.Builder getAnnouncementsBuilder(
        int index) {
      return getAnnouncementsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
     */
    public com.aruna.api.storage.services.v2.AnnouncementOrBuilder getAnnouncementsOrBuilder(
        int index) {
      if (announcementsBuilder_ == null) {
        return announcements_.get(index);  } else {
        return announcementsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
     */
    public java.util.List<? extends com.aruna.api.storage.services.v2.AnnouncementOrBuilder> 
         getAnnouncementsOrBuilderList() {
      if (announcementsBuilder_ != null) {
        return announcementsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(announcements_);
      }
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
     */
    public com.aruna.api.storage.services.v2.Announcement.Builder addAnnouncementsBuilder() {
      return getAnnouncementsFieldBuilder().addBuilder(
          com.aruna.api.storage.services.v2.Announcement.getDefaultInstance());
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
     */
    public com.aruna.api.storage.services.v2.Announcement.Builder addAnnouncementsBuilder(
        int index) {
      return getAnnouncementsFieldBuilder().addBuilder(
          index, com.aruna.api.storage.services.v2.Announcement.getDefaultInstance());
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
     */
    public java.util.List<com.aruna.api.storage.services.v2.Announcement.Builder> 
         getAnnouncementsBuilderList() {
      return getAnnouncementsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aruna.api.storage.services.v2.Announcement, com.aruna.api.storage.services.v2.Announcement.Builder, com.aruna.api.storage.services.v2.AnnouncementOrBuilder> 
        getAnnouncementsFieldBuilder() {
      if (announcementsBuilder_ == null) {
        announcementsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.aruna.api.storage.services.v2.Announcement, com.aruna.api.storage.services.v2.Announcement.Builder, com.aruna.api.storage.services.v2.AnnouncementOrBuilder>(
                announcements_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        announcements_ = null;
      }
      return announcementsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.SetAnnouncementsResponse)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.SetAnnouncementsResponse)
  private static final com.aruna.api.storage.services.v2.SetAnnouncementsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.SetAnnouncementsResponse();
  }

  public static com.aruna.api.storage.services.v2.SetAnnouncementsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetAnnouncementsResponse>
      PARSER = new com.google.protobuf.AbstractParser<SetAnnouncementsResponse>() {
    @java.lang.Override
    public SetAnnouncementsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SetAnnouncementsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetAnnouncementsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.SetAnnouncementsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

