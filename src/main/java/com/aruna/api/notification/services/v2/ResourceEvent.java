// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/notification/services/v2/notification_service.proto

// Protobuf Java Version: 3.25.1
package com.aruna.api.notification.services.v2;

/**
 * Protobuf type {@code aruna.api.notification.services.v2.ResourceEvent}
 */
public final class ResourceEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.notification.services.v2.ResourceEvent)
    ResourceEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResourceEvent.newBuilder() to construct.
  private ResourceEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResourceEvent() {
    eventVariant_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResourceEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.notification.services.v2.NotificationServiceProto.internal_static_aruna_api_notification_services_v2_ResourceEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.notification.services.v2.NotificationServiceProto.internal_static_aruna_api_notification_services_v2_ResourceEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.notification.services.v2.ResourceEvent.class, com.aruna.api.notification.services.v2.ResourceEvent.Builder.class);
  }

  private int bitField0_;
  public static final int RESOURCE_FIELD_NUMBER = 1;
  private com.aruna.api.notification.services.v2.Resource resource_;
  /**
   * <code>.aruna.api.notification.services.v2.Resource resource = 1 [json_name = "resource"];</code>
   * @return Whether the resource field is set.
   */
  @java.lang.Override
  public boolean hasResource() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.aruna.api.notification.services.v2.Resource resource = 1 [json_name = "resource"];</code>
   * @return The resource.
   */
  @java.lang.Override
  public com.aruna.api.notification.services.v2.Resource getResource() {
    return resource_ == null ? com.aruna.api.notification.services.v2.Resource.getDefaultInstance() : resource_;
  }
  /**
   * <code>.aruna.api.notification.services.v2.Resource resource = 1 [json_name = "resource"];</code>
   */
  @java.lang.Override
  public com.aruna.api.notification.services.v2.ResourceOrBuilder getResourceOrBuilder() {
    return resource_ == null ? com.aruna.api.notification.services.v2.Resource.getDefaultInstance() : resource_;
  }

  public static final int EVENT_VARIANT_FIELD_NUMBER = 2;
  private int eventVariant_ = 0;
  /**
   * <code>.aruna.api.notification.services.v2.EventVariant event_variant = 2 [json_name = "eventVariant"];</code>
   * @return The enum numeric value on the wire for eventVariant.
   */
  @java.lang.Override public int getEventVariantValue() {
    return eventVariant_;
  }
  /**
   * <code>.aruna.api.notification.services.v2.EventVariant event_variant = 2 [json_name = "eventVariant"];</code>
   * @return The eventVariant.
   */
  @java.lang.Override public com.aruna.api.notification.services.v2.EventVariant getEventVariant() {
    com.aruna.api.notification.services.v2.EventVariant result = com.aruna.api.notification.services.v2.EventVariant.forNumber(eventVariant_);
    return result == null ? com.aruna.api.notification.services.v2.EventVariant.UNRECOGNIZED : result;
  }

  public static final int REPLY_FIELD_NUMBER = 3;
  private com.aruna.api.notification.services.v2.Reply reply_;
  /**
   * <code>.aruna.api.notification.services.v2.Reply reply = 3 [json_name = "reply"];</code>
   * @return Whether the reply field is set.
   */
  @java.lang.Override
  public boolean hasReply() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.aruna.api.notification.services.v2.Reply reply = 3 [json_name = "reply"];</code>
   * @return The reply.
   */
  @java.lang.Override
  public com.aruna.api.notification.services.v2.Reply getReply() {
    return reply_ == null ? com.aruna.api.notification.services.v2.Reply.getDefaultInstance() : reply_;
  }
  /**
   * <code>.aruna.api.notification.services.v2.Reply reply = 3 [json_name = "reply"];</code>
   */
  @java.lang.Override
  public com.aruna.api.notification.services.v2.ReplyOrBuilder getReplyOrBuilder() {
    return reply_ == null ? com.aruna.api.notification.services.v2.Reply.getDefaultInstance() : reply_;
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
      output.writeMessage(1, getResource());
    }
    if (eventVariant_ != com.aruna.api.notification.services.v2.EventVariant.EVENT_VARIANT_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, eventVariant_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getReply());
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
        .computeMessageSize(1, getResource());
    }
    if (eventVariant_ != com.aruna.api.notification.services.v2.EventVariant.EVENT_VARIANT_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, eventVariant_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getReply());
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
    if (!(obj instanceof com.aruna.api.notification.services.v2.ResourceEvent)) {
      return super.equals(obj);
    }
    com.aruna.api.notification.services.v2.ResourceEvent other = (com.aruna.api.notification.services.v2.ResourceEvent) obj;

    if (hasResource() != other.hasResource()) return false;
    if (hasResource()) {
      if (!getResource()
          .equals(other.getResource())) return false;
    }
    if (eventVariant_ != other.eventVariant_) return false;
    if (hasReply() != other.hasReply()) return false;
    if (hasReply()) {
      if (!getReply()
          .equals(other.getReply())) return false;
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
    if (hasResource()) {
      hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getResource().hashCode();
    }
    hash = (37 * hash) + EVENT_VARIANT_FIELD_NUMBER;
    hash = (53 * hash) + eventVariant_;
    if (hasReply()) {
      hash = (37 * hash) + REPLY_FIELD_NUMBER;
      hash = (53 * hash) + getReply().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.notification.services.v2.ResourceEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.notification.services.v2.ResourceEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.notification.services.v2.ResourceEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.notification.services.v2.ResourceEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.notification.services.v2.ResourceEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.notification.services.v2.ResourceEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.notification.services.v2.ResourceEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.notification.services.v2.ResourceEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.notification.services.v2.ResourceEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.notification.services.v2.ResourceEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.notification.services.v2.ResourceEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.notification.services.v2.ResourceEvent parseFrom(
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
  public static Builder newBuilder(com.aruna.api.notification.services.v2.ResourceEvent prototype) {
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
   * Protobuf type {@code aruna.api.notification.services.v2.ResourceEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.notification.services.v2.ResourceEvent)
      com.aruna.api.notification.services.v2.ResourceEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.notification.services.v2.NotificationServiceProto.internal_static_aruna_api_notification_services_v2_ResourceEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.notification.services.v2.NotificationServiceProto.internal_static_aruna_api_notification_services_v2_ResourceEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.notification.services.v2.ResourceEvent.class, com.aruna.api.notification.services.v2.ResourceEvent.Builder.class);
    }

    // Construct using com.aruna.api.notification.services.v2.ResourceEvent.newBuilder()
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
        getResourceFieldBuilder();
        getReplyFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      resource_ = null;
      if (resourceBuilder_ != null) {
        resourceBuilder_.dispose();
        resourceBuilder_ = null;
      }
      eventVariant_ = 0;
      reply_ = null;
      if (replyBuilder_ != null) {
        replyBuilder_.dispose();
        replyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.notification.services.v2.NotificationServiceProto.internal_static_aruna_api_notification_services_v2_ResourceEvent_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.notification.services.v2.ResourceEvent getDefaultInstanceForType() {
      return com.aruna.api.notification.services.v2.ResourceEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.notification.services.v2.ResourceEvent build() {
      com.aruna.api.notification.services.v2.ResourceEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.notification.services.v2.ResourceEvent buildPartial() {
      com.aruna.api.notification.services.v2.ResourceEvent result = new com.aruna.api.notification.services.v2.ResourceEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.notification.services.v2.ResourceEvent result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resource_ = resourceBuilder_ == null
            ? resource_
            : resourceBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.eventVariant_ = eventVariant_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.reply_ = replyBuilder_ == null
            ? reply_
            : replyBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.aruna.api.notification.services.v2.ResourceEvent) {
        return mergeFrom((com.aruna.api.notification.services.v2.ResourceEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.notification.services.v2.ResourceEvent other) {
      if (other == com.aruna.api.notification.services.v2.ResourceEvent.getDefaultInstance()) return this;
      if (other.hasResource()) {
        mergeResource(other.getResource());
      }
      if (other.eventVariant_ != 0) {
        setEventVariantValue(other.getEventVariantValue());
      }
      if (other.hasReply()) {
        mergeReply(other.getReply());
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
                  getResourceFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              eventVariant_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getReplyFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private com.aruna.api.notification.services.v2.Resource resource_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.notification.services.v2.Resource, com.aruna.api.notification.services.v2.Resource.Builder, com.aruna.api.notification.services.v2.ResourceOrBuilder> resourceBuilder_;
    /**
     * <code>.aruna.api.notification.services.v2.Resource resource = 1 [json_name = "resource"];</code>
     * @return Whether the resource field is set.
     */
    public boolean hasResource() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.aruna.api.notification.services.v2.Resource resource = 1 [json_name = "resource"];</code>
     * @return The resource.
     */
    public com.aruna.api.notification.services.v2.Resource getResource() {
      if (resourceBuilder_ == null) {
        return resource_ == null ? com.aruna.api.notification.services.v2.Resource.getDefaultInstance() : resource_;
      } else {
        return resourceBuilder_.getMessage();
      }
    }
    /**
     * <code>.aruna.api.notification.services.v2.Resource resource = 1 [json_name = "resource"];</code>
     */
    public Builder setResource(com.aruna.api.notification.services.v2.Resource value) {
      if (resourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resource_ = value;
      } else {
        resourceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.notification.services.v2.Resource resource = 1 [json_name = "resource"];</code>
     */
    public Builder setResource(
        com.aruna.api.notification.services.v2.Resource.Builder builderForValue) {
      if (resourceBuilder_ == null) {
        resource_ = builderForValue.build();
      } else {
        resourceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.notification.services.v2.Resource resource = 1 [json_name = "resource"];</code>
     */
    public Builder mergeResource(com.aruna.api.notification.services.v2.Resource value) {
      if (resourceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          resource_ != null &&
          resource_ != com.aruna.api.notification.services.v2.Resource.getDefaultInstance()) {
          getResourceBuilder().mergeFrom(value);
        } else {
          resource_ = value;
        }
      } else {
        resourceBuilder_.mergeFrom(value);
      }
      if (resource_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.aruna.api.notification.services.v2.Resource resource = 1 [json_name = "resource"];</code>
     */
    public Builder clearResource() {
      bitField0_ = (bitField0_ & ~0x00000001);
      resource_ = null;
      if (resourceBuilder_ != null) {
        resourceBuilder_.dispose();
        resourceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.notification.services.v2.Resource resource = 1 [json_name = "resource"];</code>
     */
    public com.aruna.api.notification.services.v2.Resource.Builder getResourceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getResourceFieldBuilder().getBuilder();
    }
    /**
     * <code>.aruna.api.notification.services.v2.Resource resource = 1 [json_name = "resource"];</code>
     */
    public com.aruna.api.notification.services.v2.ResourceOrBuilder getResourceOrBuilder() {
      if (resourceBuilder_ != null) {
        return resourceBuilder_.getMessageOrBuilder();
      } else {
        return resource_ == null ?
            com.aruna.api.notification.services.v2.Resource.getDefaultInstance() : resource_;
      }
    }
    /**
     * <code>.aruna.api.notification.services.v2.Resource resource = 1 [json_name = "resource"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.notification.services.v2.Resource, com.aruna.api.notification.services.v2.Resource.Builder, com.aruna.api.notification.services.v2.ResourceOrBuilder> 
        getResourceFieldBuilder() {
      if (resourceBuilder_ == null) {
        resourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aruna.api.notification.services.v2.Resource, com.aruna.api.notification.services.v2.Resource.Builder, com.aruna.api.notification.services.v2.ResourceOrBuilder>(
                getResource(),
                getParentForChildren(),
                isClean());
        resource_ = null;
      }
      return resourceBuilder_;
    }

    private int eventVariant_ = 0;
    /**
     * <code>.aruna.api.notification.services.v2.EventVariant event_variant = 2 [json_name = "eventVariant"];</code>
     * @return The enum numeric value on the wire for eventVariant.
     */
    @java.lang.Override public int getEventVariantValue() {
      return eventVariant_;
    }
    /**
     * <code>.aruna.api.notification.services.v2.EventVariant event_variant = 2 [json_name = "eventVariant"];</code>
     * @param value The enum numeric value on the wire for eventVariant to set.
     * @return This builder for chaining.
     */
    public Builder setEventVariantValue(int value) {
      eventVariant_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.notification.services.v2.EventVariant event_variant = 2 [json_name = "eventVariant"];</code>
     * @return The eventVariant.
     */
    @java.lang.Override
    public com.aruna.api.notification.services.v2.EventVariant getEventVariant() {
      com.aruna.api.notification.services.v2.EventVariant result = com.aruna.api.notification.services.v2.EventVariant.forNumber(eventVariant_);
      return result == null ? com.aruna.api.notification.services.v2.EventVariant.UNRECOGNIZED : result;
    }
    /**
     * <code>.aruna.api.notification.services.v2.EventVariant event_variant = 2 [json_name = "eventVariant"];</code>
     * @param value The eventVariant to set.
     * @return This builder for chaining.
     */
    public Builder setEventVariant(com.aruna.api.notification.services.v2.EventVariant value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      eventVariant_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.notification.services.v2.EventVariant event_variant = 2 [json_name = "eventVariant"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEventVariant() {
      bitField0_ = (bitField0_ & ~0x00000002);
      eventVariant_ = 0;
      onChanged();
      return this;
    }

    private com.aruna.api.notification.services.v2.Reply reply_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.notification.services.v2.Reply, com.aruna.api.notification.services.v2.Reply.Builder, com.aruna.api.notification.services.v2.ReplyOrBuilder> replyBuilder_;
    /**
     * <code>.aruna.api.notification.services.v2.Reply reply = 3 [json_name = "reply"];</code>
     * @return Whether the reply field is set.
     */
    public boolean hasReply() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.aruna.api.notification.services.v2.Reply reply = 3 [json_name = "reply"];</code>
     * @return The reply.
     */
    public com.aruna.api.notification.services.v2.Reply getReply() {
      if (replyBuilder_ == null) {
        return reply_ == null ? com.aruna.api.notification.services.v2.Reply.getDefaultInstance() : reply_;
      } else {
        return replyBuilder_.getMessage();
      }
    }
    /**
     * <code>.aruna.api.notification.services.v2.Reply reply = 3 [json_name = "reply"];</code>
     */
    public Builder setReply(com.aruna.api.notification.services.v2.Reply value) {
      if (replyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        reply_ = value;
      } else {
        replyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.notification.services.v2.Reply reply = 3 [json_name = "reply"];</code>
     */
    public Builder setReply(
        com.aruna.api.notification.services.v2.Reply.Builder builderForValue) {
      if (replyBuilder_ == null) {
        reply_ = builderForValue.build();
      } else {
        replyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.notification.services.v2.Reply reply = 3 [json_name = "reply"];</code>
     */
    public Builder mergeReply(com.aruna.api.notification.services.v2.Reply value) {
      if (replyBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          reply_ != null &&
          reply_ != com.aruna.api.notification.services.v2.Reply.getDefaultInstance()) {
          getReplyBuilder().mergeFrom(value);
        } else {
          reply_ = value;
        }
      } else {
        replyBuilder_.mergeFrom(value);
      }
      if (reply_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.aruna.api.notification.services.v2.Reply reply = 3 [json_name = "reply"];</code>
     */
    public Builder clearReply() {
      bitField0_ = (bitField0_ & ~0x00000004);
      reply_ = null;
      if (replyBuilder_ != null) {
        replyBuilder_.dispose();
        replyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.notification.services.v2.Reply reply = 3 [json_name = "reply"];</code>
     */
    public com.aruna.api.notification.services.v2.Reply.Builder getReplyBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getReplyFieldBuilder().getBuilder();
    }
    /**
     * <code>.aruna.api.notification.services.v2.Reply reply = 3 [json_name = "reply"];</code>
     */
    public com.aruna.api.notification.services.v2.ReplyOrBuilder getReplyOrBuilder() {
      if (replyBuilder_ != null) {
        return replyBuilder_.getMessageOrBuilder();
      } else {
        return reply_ == null ?
            com.aruna.api.notification.services.v2.Reply.getDefaultInstance() : reply_;
      }
    }
    /**
     * <code>.aruna.api.notification.services.v2.Reply reply = 3 [json_name = "reply"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.notification.services.v2.Reply, com.aruna.api.notification.services.v2.Reply.Builder, com.aruna.api.notification.services.v2.ReplyOrBuilder> 
        getReplyFieldBuilder() {
      if (replyBuilder_ == null) {
        replyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aruna.api.notification.services.v2.Reply, com.aruna.api.notification.services.v2.Reply.Builder, com.aruna.api.notification.services.v2.ReplyOrBuilder>(
                getReply(),
                getParentForChildren(),
                isClean());
        reply_ = null;
      }
      return replyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.notification.services.v2.ResourceEvent)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.notification.services.v2.ResourceEvent)
  private static final com.aruna.api.notification.services.v2.ResourceEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.notification.services.v2.ResourceEvent();
  }

  public static com.aruna.api.notification.services.v2.ResourceEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceEvent>
      PARSER = new com.google.protobuf.AbstractParser<ResourceEvent>() {
    @java.lang.Override
    public ResourceEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResourceEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.notification.services.v2.ResourceEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

