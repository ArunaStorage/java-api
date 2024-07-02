// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/info_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.GetAnnouncementResponse}
 */
public final class GetAnnouncementResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.GetAnnouncementResponse)
    GetAnnouncementResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAnnouncementResponse.newBuilder() to construct.
  private GetAnnouncementResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAnnouncementResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAnnouncementResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_GetAnnouncementResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_GetAnnouncementResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.GetAnnouncementResponse.class, com.aruna.api.storage.services.v2.GetAnnouncementResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ANNOUNCEMENT_FIELD_NUMBER = 1;
  private com.aruna.api.storage.services.v2.Announcement announcement_;
  /**
   * <code>.aruna.api.storage.services.v2.Announcement announcement = 1 [json_name = "announcement"];</code>
   * @return Whether the announcement field is set.
   */
  @java.lang.Override
  public boolean hasAnnouncement() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.aruna.api.storage.services.v2.Announcement announcement = 1 [json_name = "announcement"];</code>
   * @return The announcement.
   */
  @java.lang.Override
  public com.aruna.api.storage.services.v2.Announcement getAnnouncement() {
    return announcement_ == null ? com.aruna.api.storage.services.v2.Announcement.getDefaultInstance() : announcement_;
  }
  /**
   * <code>.aruna.api.storage.services.v2.Announcement announcement = 1 [json_name = "announcement"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.services.v2.AnnouncementOrBuilder getAnnouncementOrBuilder() {
    return announcement_ == null ? com.aruna.api.storage.services.v2.Announcement.getDefaultInstance() : announcement_;
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
      output.writeMessage(1, getAnnouncement());
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
        .computeMessageSize(1, getAnnouncement());
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.GetAnnouncementResponse)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.GetAnnouncementResponse other = (com.aruna.api.storage.services.v2.GetAnnouncementResponse) obj;

    if (hasAnnouncement() != other.hasAnnouncement()) return false;
    if (hasAnnouncement()) {
      if (!getAnnouncement()
          .equals(other.getAnnouncement())) return false;
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
    if (hasAnnouncement()) {
      hash = (37 * hash) + ANNOUNCEMENT_FIELD_NUMBER;
      hash = (53 * hash) + getAnnouncement().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.GetAnnouncementResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetAnnouncementResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetAnnouncementResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetAnnouncementResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetAnnouncementResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetAnnouncementResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetAnnouncementResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetAnnouncementResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.GetAnnouncementResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.GetAnnouncementResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetAnnouncementResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetAnnouncementResponse parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.GetAnnouncementResponse prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.GetAnnouncementResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.GetAnnouncementResponse)
      com.aruna.api.storage.services.v2.GetAnnouncementResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_GetAnnouncementResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_GetAnnouncementResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.GetAnnouncementResponse.class, com.aruna.api.storage.services.v2.GetAnnouncementResponse.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.GetAnnouncementResponse.newBuilder()
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
        getAnnouncementFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      announcement_ = null;
      if (announcementBuilder_ != null) {
        announcementBuilder_.dispose();
        announcementBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_GetAnnouncementResponse_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetAnnouncementResponse getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.GetAnnouncementResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetAnnouncementResponse build() {
      com.aruna.api.storage.services.v2.GetAnnouncementResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetAnnouncementResponse buildPartial() {
      com.aruna.api.storage.services.v2.GetAnnouncementResponse result = new com.aruna.api.storage.services.v2.GetAnnouncementResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.GetAnnouncementResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.announcement_ = announcementBuilder_ == null
            ? announcement_
            : announcementBuilder_.build();
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
      if (other instanceof com.aruna.api.storage.services.v2.GetAnnouncementResponse) {
        return mergeFrom((com.aruna.api.storage.services.v2.GetAnnouncementResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.GetAnnouncementResponse other) {
      if (other == com.aruna.api.storage.services.v2.GetAnnouncementResponse.getDefaultInstance()) return this;
      if (other.hasAnnouncement()) {
        mergeAnnouncement(other.getAnnouncement());
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
                  getAnnouncementFieldBuilder().getBuilder(),
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

    private com.aruna.api.storage.services.v2.Announcement announcement_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.storage.services.v2.Announcement, com.aruna.api.storage.services.v2.Announcement.Builder, com.aruna.api.storage.services.v2.AnnouncementOrBuilder> announcementBuilder_;
    /**
     * <code>.aruna.api.storage.services.v2.Announcement announcement = 1 [json_name = "announcement"];</code>
     * @return Whether the announcement field is set.
     */
    public boolean hasAnnouncement() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.aruna.api.storage.services.v2.Announcement announcement = 1 [json_name = "announcement"];</code>
     * @return The announcement.
     */
    public com.aruna.api.storage.services.v2.Announcement getAnnouncement() {
      if (announcementBuilder_ == null) {
        return announcement_ == null ? com.aruna.api.storage.services.v2.Announcement.getDefaultInstance() : announcement_;
      } else {
        return announcementBuilder_.getMessage();
      }
    }
    /**
     * <code>.aruna.api.storage.services.v2.Announcement announcement = 1 [json_name = "announcement"];</code>
     */
    public Builder setAnnouncement(com.aruna.api.storage.services.v2.Announcement value) {
      if (announcementBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        announcement_ = value;
      } else {
        announcementBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.services.v2.Announcement announcement = 1 [json_name = "announcement"];</code>
     */
    public Builder setAnnouncement(
        com.aruna.api.storage.services.v2.Announcement.Builder builderForValue) {
      if (announcementBuilder_ == null) {
        announcement_ = builderForValue.build();
      } else {
        announcementBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.services.v2.Announcement announcement = 1 [json_name = "announcement"];</code>
     */
    public Builder mergeAnnouncement(com.aruna.api.storage.services.v2.Announcement value) {
      if (announcementBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          announcement_ != null &&
          announcement_ != com.aruna.api.storage.services.v2.Announcement.getDefaultInstance()) {
          getAnnouncementBuilder().mergeFrom(value);
        } else {
          announcement_ = value;
        }
      } else {
        announcementBuilder_.mergeFrom(value);
      }
      if (announcement_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.aruna.api.storage.services.v2.Announcement announcement = 1 [json_name = "announcement"];</code>
     */
    public Builder clearAnnouncement() {
      bitField0_ = (bitField0_ & ~0x00000001);
      announcement_ = null;
      if (announcementBuilder_ != null) {
        announcementBuilder_.dispose();
        announcementBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.services.v2.Announcement announcement = 1 [json_name = "announcement"];</code>
     */
    public com.aruna.api.storage.services.v2.Announcement.Builder getAnnouncementBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAnnouncementFieldBuilder().getBuilder();
    }
    /**
     * <code>.aruna.api.storage.services.v2.Announcement announcement = 1 [json_name = "announcement"];</code>
     */
    public com.aruna.api.storage.services.v2.AnnouncementOrBuilder getAnnouncementOrBuilder() {
      if (announcementBuilder_ != null) {
        return announcementBuilder_.getMessageOrBuilder();
      } else {
        return announcement_ == null ?
            com.aruna.api.storage.services.v2.Announcement.getDefaultInstance() : announcement_;
      }
    }
    /**
     * <code>.aruna.api.storage.services.v2.Announcement announcement = 1 [json_name = "announcement"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.storage.services.v2.Announcement, com.aruna.api.storage.services.v2.Announcement.Builder, com.aruna.api.storage.services.v2.AnnouncementOrBuilder> 
        getAnnouncementFieldBuilder() {
      if (announcementBuilder_ == null) {
        announcementBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aruna.api.storage.services.v2.Announcement, com.aruna.api.storage.services.v2.Announcement.Builder, com.aruna.api.storage.services.v2.AnnouncementOrBuilder>(
                getAnnouncement(),
                getParentForChildren(),
                isClean());
        announcement_ = null;
      }
      return announcementBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.GetAnnouncementResponse)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.GetAnnouncementResponse)
  private static final com.aruna.api.storage.services.v2.GetAnnouncementResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.GetAnnouncementResponse();
  }

  public static com.aruna.api.storage.services.v2.GetAnnouncementResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAnnouncementResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAnnouncementResponse>() {
    @java.lang.Override
    public GetAnnouncementResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetAnnouncementResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAnnouncementResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.GetAnnouncementResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

