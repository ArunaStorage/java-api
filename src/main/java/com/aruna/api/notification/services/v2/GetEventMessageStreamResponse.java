// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/notification/services/v2/notification_service.proto

// Protobuf Java Version: 3.25.1
package com.aruna.api.notification.services.v2;

/**
 * Protobuf type {@code aruna.api.notification.services.v2.GetEventMessageStreamResponse}
 */
public final class GetEventMessageStreamResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.notification.services.v2.GetEventMessageStreamResponse)
    GetEventMessageStreamResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetEventMessageStreamResponse.newBuilder() to construct.
  private GetEventMessageStreamResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetEventMessageStreamResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetEventMessageStreamResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.notification.services.v2.NotificationServiceProto.internal_static_aruna_api_notification_services_v2_GetEventMessageStreamResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.notification.services.v2.NotificationServiceProto.internal_static_aruna_api_notification_services_v2_GetEventMessageStreamResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.notification.services.v2.GetEventMessageStreamResponse.class, com.aruna.api.notification.services.v2.GetEventMessageStreamResponse.Builder.class);
  }

  private int bitField0_;
  public static final int MESSAGE_FIELD_NUMBER = 1;
  private com.aruna.api.notification.services.v2.EventMessage message_;
  /**
   * <code>.aruna.api.notification.services.v2.EventMessage message = 1 [json_name = "message"];</code>
   * @return Whether the message field is set.
   */
  @java.lang.Override
  public boolean hasMessage() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.aruna.api.notification.services.v2.EventMessage message = 1 [json_name = "message"];</code>
   * @return The message.
   */
  @java.lang.Override
  public com.aruna.api.notification.services.v2.EventMessage getMessage() {
    return message_ == null ? com.aruna.api.notification.services.v2.EventMessage.getDefaultInstance() : message_;
  }
  /**
   * <code>.aruna.api.notification.services.v2.EventMessage message = 1 [json_name = "message"];</code>
   */
  @java.lang.Override
  public com.aruna.api.notification.services.v2.EventMessageOrBuilder getMessageOrBuilder() {
    return message_ == null ? com.aruna.api.notification.services.v2.EventMessage.getDefaultInstance() : message_;
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
      output.writeMessage(1, getMessage());
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
        .computeMessageSize(1, getMessage());
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
    if (!(obj instanceof com.aruna.api.notification.services.v2.GetEventMessageStreamResponse)) {
      return super.equals(obj);
    }
    com.aruna.api.notification.services.v2.GetEventMessageStreamResponse other = (com.aruna.api.notification.services.v2.GetEventMessageStreamResponse) obj;

    if (hasMessage() != other.hasMessage()) return false;
    if (hasMessage()) {
      if (!getMessage()
          .equals(other.getMessage())) return false;
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
    if (hasMessage()) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.notification.services.v2.GetEventMessageStreamResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.notification.services.v2.GetEventMessageStreamResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.notification.services.v2.GetEventMessageStreamResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.notification.services.v2.GetEventMessageStreamResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.notification.services.v2.GetEventMessageStreamResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.notification.services.v2.GetEventMessageStreamResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.notification.services.v2.GetEventMessageStreamResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.notification.services.v2.GetEventMessageStreamResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.notification.services.v2.GetEventMessageStreamResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.notification.services.v2.GetEventMessageStreamResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.notification.services.v2.GetEventMessageStreamResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.notification.services.v2.GetEventMessageStreamResponse parseFrom(
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
  public static Builder newBuilder(com.aruna.api.notification.services.v2.GetEventMessageStreamResponse prototype) {
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
   * Protobuf type {@code aruna.api.notification.services.v2.GetEventMessageStreamResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.notification.services.v2.GetEventMessageStreamResponse)
      com.aruna.api.notification.services.v2.GetEventMessageStreamResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.notification.services.v2.NotificationServiceProto.internal_static_aruna_api_notification_services_v2_GetEventMessageStreamResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.notification.services.v2.NotificationServiceProto.internal_static_aruna_api_notification_services_v2_GetEventMessageStreamResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.notification.services.v2.GetEventMessageStreamResponse.class, com.aruna.api.notification.services.v2.GetEventMessageStreamResponse.Builder.class);
    }

    // Construct using com.aruna.api.notification.services.v2.GetEventMessageStreamResponse.newBuilder()
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
        getMessageFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      message_ = null;
      if (messageBuilder_ != null) {
        messageBuilder_.dispose();
        messageBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.notification.services.v2.NotificationServiceProto.internal_static_aruna_api_notification_services_v2_GetEventMessageStreamResponse_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.notification.services.v2.GetEventMessageStreamResponse getDefaultInstanceForType() {
      return com.aruna.api.notification.services.v2.GetEventMessageStreamResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.notification.services.v2.GetEventMessageStreamResponse build() {
      com.aruna.api.notification.services.v2.GetEventMessageStreamResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.notification.services.v2.GetEventMessageStreamResponse buildPartial() {
      com.aruna.api.notification.services.v2.GetEventMessageStreamResponse result = new com.aruna.api.notification.services.v2.GetEventMessageStreamResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.notification.services.v2.GetEventMessageStreamResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.message_ = messageBuilder_ == null
            ? message_
            : messageBuilder_.build();
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
      if (other instanceof com.aruna.api.notification.services.v2.GetEventMessageStreamResponse) {
        return mergeFrom((com.aruna.api.notification.services.v2.GetEventMessageStreamResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.notification.services.v2.GetEventMessageStreamResponse other) {
      if (other == com.aruna.api.notification.services.v2.GetEventMessageStreamResponse.getDefaultInstance()) return this;
      if (other.hasMessage()) {
        mergeMessage(other.getMessage());
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
                  getMessageFieldBuilder().getBuilder(),
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

    private com.aruna.api.notification.services.v2.EventMessage message_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.notification.services.v2.EventMessage, com.aruna.api.notification.services.v2.EventMessage.Builder, com.aruna.api.notification.services.v2.EventMessageOrBuilder> messageBuilder_;
    /**
     * <code>.aruna.api.notification.services.v2.EventMessage message = 1 [json_name = "message"];</code>
     * @return Whether the message field is set.
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.aruna.api.notification.services.v2.EventMessage message = 1 [json_name = "message"];</code>
     * @return The message.
     */
    public com.aruna.api.notification.services.v2.EventMessage getMessage() {
      if (messageBuilder_ == null) {
        return message_ == null ? com.aruna.api.notification.services.v2.EventMessage.getDefaultInstance() : message_;
      } else {
        return messageBuilder_.getMessage();
      }
    }
    /**
     * <code>.aruna.api.notification.services.v2.EventMessage message = 1 [json_name = "message"];</code>
     */
    public Builder setMessage(com.aruna.api.notification.services.v2.EventMessage value) {
      if (messageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        message_ = value;
      } else {
        messageBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.notification.services.v2.EventMessage message = 1 [json_name = "message"];</code>
     */
    public Builder setMessage(
        com.aruna.api.notification.services.v2.EventMessage.Builder builderForValue) {
      if (messageBuilder_ == null) {
        message_ = builderForValue.build();
      } else {
        messageBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.notification.services.v2.EventMessage message = 1 [json_name = "message"];</code>
     */
    public Builder mergeMessage(com.aruna.api.notification.services.v2.EventMessage value) {
      if (messageBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          message_ != null &&
          message_ != com.aruna.api.notification.services.v2.EventMessage.getDefaultInstance()) {
          getMessageBuilder().mergeFrom(value);
        } else {
          message_ = value;
        }
      } else {
        messageBuilder_.mergeFrom(value);
      }
      if (message_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.aruna.api.notification.services.v2.EventMessage message = 1 [json_name = "message"];</code>
     */
    public Builder clearMessage() {
      bitField0_ = (bitField0_ & ~0x00000001);
      message_ = null;
      if (messageBuilder_ != null) {
        messageBuilder_.dispose();
        messageBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.notification.services.v2.EventMessage message = 1 [json_name = "message"];</code>
     */
    public com.aruna.api.notification.services.v2.EventMessage.Builder getMessageBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMessageFieldBuilder().getBuilder();
    }
    /**
     * <code>.aruna.api.notification.services.v2.EventMessage message = 1 [json_name = "message"];</code>
     */
    public com.aruna.api.notification.services.v2.EventMessageOrBuilder getMessageOrBuilder() {
      if (messageBuilder_ != null) {
        return messageBuilder_.getMessageOrBuilder();
      } else {
        return message_ == null ?
            com.aruna.api.notification.services.v2.EventMessage.getDefaultInstance() : message_;
      }
    }
    /**
     * <code>.aruna.api.notification.services.v2.EventMessage message = 1 [json_name = "message"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.notification.services.v2.EventMessage, com.aruna.api.notification.services.v2.EventMessage.Builder, com.aruna.api.notification.services.v2.EventMessageOrBuilder> 
        getMessageFieldBuilder() {
      if (messageBuilder_ == null) {
        messageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aruna.api.notification.services.v2.EventMessage, com.aruna.api.notification.services.v2.EventMessage.Builder, com.aruna.api.notification.services.v2.EventMessageOrBuilder>(
                getMessage(),
                getParentForChildren(),
                isClean());
        message_ = null;
      }
      return messageBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.notification.services.v2.GetEventMessageStreamResponse)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.notification.services.v2.GetEventMessageStreamResponse)
  private static final com.aruna.api.notification.services.v2.GetEventMessageStreamResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.notification.services.v2.GetEventMessageStreamResponse();
  }

  public static com.aruna.api.notification.services.v2.GetEventMessageStreamResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetEventMessageStreamResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetEventMessageStreamResponse>() {
    @java.lang.Override
    public GetEventMessageStreamResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetEventMessageStreamResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetEventMessageStreamResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.notification.services.v2.GetEventMessageStreamResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

