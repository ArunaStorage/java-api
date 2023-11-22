// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/notification/services/v2/notification_service.proto

// Protobuf Java Version: 3.25.1
package com.aruna.api.notification.services.v2;

/**
 * Protobuf type {@code aruna.api.notification.services.v2.Reply}
 */
public final class Reply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.notification.services.v2.Reply)
    ReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Reply.newBuilder() to construct.
  private Reply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Reply() {
    reply_ = "";
    salt_ = "";
    hmac_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Reply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.notification.services.v2.NotificationServiceProto.internal_static_aruna_api_notification_services_v2_Reply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.notification.services.v2.NotificationServiceProto.internal_static_aruna_api_notification_services_v2_Reply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.notification.services.v2.Reply.class, com.aruna.api.notification.services.v2.Reply.Builder.class);
  }

  public static final int REPLY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object reply_ = "";
  /**
   * <code>string reply = 1 [json_name = "reply"];</code>
   * @return The reply.
   */
  @java.lang.Override
  public java.lang.String getReply() {
    java.lang.Object ref = reply_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      reply_ = s;
      return s;
    }
  }
  /**
   * <code>string reply = 1 [json_name = "reply"];</code>
   * @return The bytes for reply.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReplyBytes() {
    java.lang.Object ref = reply_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      reply_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SALT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object salt_ = "";
  /**
   * <code>string salt = 2 [json_name = "salt"];</code>
   * @return The salt.
   */
  @java.lang.Override
  public java.lang.String getSalt() {
    java.lang.Object ref = salt_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      salt_ = s;
      return s;
    }
  }
  /**
   * <code>string salt = 2 [json_name = "salt"];</code>
   * @return The bytes for salt.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSaltBytes() {
    java.lang.Object ref = salt_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      salt_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HMAC_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object hmac_ = "";
  /**
   * <code>string hmac = 3 [json_name = "hmac"];</code>
   * @return The hmac.
   */
  @java.lang.Override
  public java.lang.String getHmac() {
    java.lang.Object ref = hmac_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hmac_ = s;
      return s;
    }
  }
  /**
   * <code>string hmac = 3 [json_name = "hmac"];</code>
   * @return The bytes for hmac.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHmacBytes() {
    java.lang.Object ref = hmac_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hmac_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reply_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, reply_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(salt_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, salt_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hmac_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, hmac_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reply_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, reply_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(salt_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, salt_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hmac_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, hmac_);
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
    if (!(obj instanceof com.aruna.api.notification.services.v2.Reply)) {
      return super.equals(obj);
    }
    com.aruna.api.notification.services.v2.Reply other = (com.aruna.api.notification.services.v2.Reply) obj;

    if (!getReply()
        .equals(other.getReply())) return false;
    if (!getSalt()
        .equals(other.getSalt())) return false;
    if (!getHmac()
        .equals(other.getHmac())) return false;
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
    hash = (37 * hash) + REPLY_FIELD_NUMBER;
    hash = (53 * hash) + getReply().hashCode();
    hash = (37 * hash) + SALT_FIELD_NUMBER;
    hash = (53 * hash) + getSalt().hashCode();
    hash = (37 * hash) + HMAC_FIELD_NUMBER;
    hash = (53 * hash) + getHmac().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.notification.services.v2.Reply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.notification.services.v2.Reply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.notification.services.v2.Reply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.notification.services.v2.Reply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.notification.services.v2.Reply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.notification.services.v2.Reply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.notification.services.v2.Reply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.notification.services.v2.Reply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.notification.services.v2.Reply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.notification.services.v2.Reply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.notification.services.v2.Reply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.notification.services.v2.Reply parseFrom(
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
  public static Builder newBuilder(com.aruna.api.notification.services.v2.Reply prototype) {
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
   * Protobuf type {@code aruna.api.notification.services.v2.Reply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.notification.services.v2.Reply)
      com.aruna.api.notification.services.v2.ReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.notification.services.v2.NotificationServiceProto.internal_static_aruna_api_notification_services_v2_Reply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.notification.services.v2.NotificationServiceProto.internal_static_aruna_api_notification_services_v2_Reply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.notification.services.v2.Reply.class, com.aruna.api.notification.services.v2.Reply.Builder.class);
    }

    // Construct using com.aruna.api.notification.services.v2.Reply.newBuilder()
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
      reply_ = "";
      salt_ = "";
      hmac_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.notification.services.v2.NotificationServiceProto.internal_static_aruna_api_notification_services_v2_Reply_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.notification.services.v2.Reply getDefaultInstanceForType() {
      return com.aruna.api.notification.services.v2.Reply.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.notification.services.v2.Reply build() {
      com.aruna.api.notification.services.v2.Reply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.notification.services.v2.Reply buildPartial() {
      com.aruna.api.notification.services.v2.Reply result = new com.aruna.api.notification.services.v2.Reply(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.notification.services.v2.Reply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.reply_ = reply_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.salt_ = salt_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.hmac_ = hmac_;
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
      if (other instanceof com.aruna.api.notification.services.v2.Reply) {
        return mergeFrom((com.aruna.api.notification.services.v2.Reply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.notification.services.v2.Reply other) {
      if (other == com.aruna.api.notification.services.v2.Reply.getDefaultInstance()) return this;
      if (!other.getReply().isEmpty()) {
        reply_ = other.reply_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSalt().isEmpty()) {
        salt_ = other.salt_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getHmac().isEmpty()) {
        hmac_ = other.hmac_;
        bitField0_ |= 0x00000004;
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
              reply_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              salt_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              hmac_ = input.readStringRequireUtf8();
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

    private java.lang.Object reply_ = "";
    /**
     * <code>string reply = 1 [json_name = "reply"];</code>
     * @return The reply.
     */
    public java.lang.String getReply() {
      java.lang.Object ref = reply_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reply_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string reply = 1 [json_name = "reply"];</code>
     * @return The bytes for reply.
     */
    public com.google.protobuf.ByteString
        getReplyBytes() {
      java.lang.Object ref = reply_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reply_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string reply = 1 [json_name = "reply"];</code>
     * @param value The reply to set.
     * @return This builder for chaining.
     */
    public Builder setReply(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      reply_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string reply = 1 [json_name = "reply"];</code>
     * @return This builder for chaining.
     */
    public Builder clearReply() {
      reply_ = getDefaultInstance().getReply();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string reply = 1 [json_name = "reply"];</code>
     * @param value The bytes for reply to set.
     * @return This builder for chaining.
     */
    public Builder setReplyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      reply_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object salt_ = "";
    /**
     * <code>string salt = 2 [json_name = "salt"];</code>
     * @return The salt.
     */
    public java.lang.String getSalt() {
      java.lang.Object ref = salt_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        salt_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string salt = 2 [json_name = "salt"];</code>
     * @return The bytes for salt.
     */
    public com.google.protobuf.ByteString
        getSaltBytes() {
      java.lang.Object ref = salt_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        salt_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string salt = 2 [json_name = "salt"];</code>
     * @param value The salt to set.
     * @return This builder for chaining.
     */
    public Builder setSalt(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      salt_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string salt = 2 [json_name = "salt"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSalt() {
      salt_ = getDefaultInstance().getSalt();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string salt = 2 [json_name = "salt"];</code>
     * @param value The bytes for salt to set.
     * @return This builder for chaining.
     */
    public Builder setSaltBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      salt_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object hmac_ = "";
    /**
     * <code>string hmac = 3 [json_name = "hmac"];</code>
     * @return The hmac.
     */
    public java.lang.String getHmac() {
      java.lang.Object ref = hmac_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hmac_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hmac = 3 [json_name = "hmac"];</code>
     * @return The bytes for hmac.
     */
    public com.google.protobuf.ByteString
        getHmacBytes() {
      java.lang.Object ref = hmac_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hmac_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hmac = 3 [json_name = "hmac"];</code>
     * @param value The hmac to set.
     * @return This builder for chaining.
     */
    public Builder setHmac(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      hmac_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string hmac = 3 [json_name = "hmac"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHmac() {
      hmac_ = getDefaultInstance().getHmac();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string hmac = 3 [json_name = "hmac"];</code>
     * @param value The bytes for hmac to set.
     * @return This builder for chaining.
     */
    public Builder setHmacBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      hmac_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.notification.services.v2.Reply)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.notification.services.v2.Reply)
  private static final com.aruna.api.notification.services.v2.Reply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.notification.services.v2.Reply();
  }

  public static com.aruna.api.notification.services.v2.Reply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Reply>
      PARSER = new com.google.protobuf.AbstractParser<Reply>() {
    @java.lang.Override
    public Reply parsePartialFrom(
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

  public static com.google.protobuf.Parser<Reply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Reply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.notification.services.v2.Reply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

