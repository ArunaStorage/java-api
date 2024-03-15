// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/dataproxy/services/v2/dataproxy_service.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.dataproxy.services.v2;

/**
 * Protobuf type {@code aruna.api.dataproxy.services.v2.ErrorMessage}
 */
public final class ErrorMessage extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:aruna.api.dataproxy.services.v2.ErrorMessage)
    ErrorMessageOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      ErrorMessage.class.getName());
  }
  // Use ErrorMessage.newBuilder() to construct.
  private ErrorMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ErrorMessage() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_ErrorMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_ErrorMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.dataproxy.services.v2.ErrorMessage.class, com.aruna.api.dataproxy.services.v2.ErrorMessage.Builder.class);
  }

  private int errorCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object error_;
  public enum ErrorCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    RETRY_CHUNK(1),
    ABORT(2),
    RETRY_OBJECT_ID(3),
    ERROR_NOT_SET(0);
    private final int value;
    private ErrorCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ErrorCase valueOf(int value) {
      return forNumber(value);
    }

    public static ErrorCase forNumber(int value) {
      switch (value) {
        case 1: return RETRY_CHUNK;
        case 2: return ABORT;
        case 3: return RETRY_OBJECT_ID;
        case 0: return ERROR_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ErrorCase
  getErrorCase() {
    return ErrorCase.forNumber(
        errorCase_);
  }

  public static final int RETRY_CHUNK_FIELD_NUMBER = 1;
  /**
   * <code>.aruna.api.dataproxy.services.v2.RetryChunkMessage retry_chunk = 1 [json_name = "retryChunk"];</code>
   * @return Whether the retryChunk field is set.
   */
  @java.lang.Override
  public boolean hasRetryChunk() {
    return errorCase_ == 1;
  }
  /**
   * <code>.aruna.api.dataproxy.services.v2.RetryChunkMessage retry_chunk = 1 [json_name = "retryChunk"];</code>
   * @return The retryChunk.
   */
  @java.lang.Override
  public com.aruna.api.dataproxy.services.v2.RetryChunkMessage getRetryChunk() {
    if (errorCase_ == 1) {
       return (com.aruna.api.dataproxy.services.v2.RetryChunkMessage) error_;
    }
    return com.aruna.api.dataproxy.services.v2.RetryChunkMessage.getDefaultInstance();
  }
  /**
   * <code>.aruna.api.dataproxy.services.v2.RetryChunkMessage retry_chunk = 1 [json_name = "retryChunk"];</code>
   */
  @java.lang.Override
  public com.aruna.api.dataproxy.services.v2.RetryChunkMessageOrBuilder getRetryChunkOrBuilder() {
    if (errorCase_ == 1) {
       return (com.aruna.api.dataproxy.services.v2.RetryChunkMessage) error_;
    }
    return com.aruna.api.dataproxy.services.v2.RetryChunkMessage.getDefaultInstance();
  }

  public static final int ABORT_FIELD_NUMBER = 2;
  /**
   * <code>.aruna.api.dataproxy.services.v2.Empty abort = 2 [json_name = "abort"];</code>
   * @return Whether the abort field is set.
   */
  @java.lang.Override
  public boolean hasAbort() {
    return errorCase_ == 2;
  }
  /**
   * <code>.aruna.api.dataproxy.services.v2.Empty abort = 2 [json_name = "abort"];</code>
   * @return The abort.
   */
  @java.lang.Override
  public com.aruna.api.dataproxy.services.v2.Empty getAbort() {
    if (errorCase_ == 2) {
       return (com.aruna.api.dataproxy.services.v2.Empty) error_;
    }
    return com.aruna.api.dataproxy.services.v2.Empty.getDefaultInstance();
  }
  /**
   * <code>.aruna.api.dataproxy.services.v2.Empty abort = 2 [json_name = "abort"];</code>
   */
  @java.lang.Override
  public com.aruna.api.dataproxy.services.v2.EmptyOrBuilder getAbortOrBuilder() {
    if (errorCase_ == 2) {
       return (com.aruna.api.dataproxy.services.v2.Empty) error_;
    }
    return com.aruna.api.dataproxy.services.v2.Empty.getDefaultInstance();
  }

  public static final int RETRY_OBJECT_ID_FIELD_NUMBER = 3;
  /**
   * <code>string retry_object_id = 3 [json_name = "retryObjectId"];</code>
   * @return Whether the retryObjectId field is set.
   */
  public boolean hasRetryObjectId() {
    return errorCase_ == 3;
  }
  /**
   * <code>string retry_object_id = 3 [json_name = "retryObjectId"];</code>
   * @return The retryObjectId.
   */
  public java.lang.String getRetryObjectId() {
    java.lang.Object ref = "";
    if (errorCase_ == 3) {
      ref = error_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (errorCase_ == 3) {
        error_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string retry_object_id = 3 [json_name = "retryObjectId"];</code>
   * @return The bytes for retryObjectId.
   */
  public com.google.protobuf.ByteString
      getRetryObjectIdBytes() {
    java.lang.Object ref = "";
    if (errorCase_ == 3) {
      ref = error_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (errorCase_ == 3) {
        error_ = b;
      }
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
    if (errorCase_ == 1) {
      output.writeMessage(1, (com.aruna.api.dataproxy.services.v2.RetryChunkMessage) error_);
    }
    if (errorCase_ == 2) {
      output.writeMessage(2, (com.aruna.api.dataproxy.services.v2.Empty) error_);
    }
    if (errorCase_ == 3) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, error_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (errorCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.aruna.api.dataproxy.services.v2.RetryChunkMessage) error_);
    }
    if (errorCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.aruna.api.dataproxy.services.v2.Empty) error_);
    }
    if (errorCase_ == 3) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, error_);
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
    if (!(obj instanceof com.aruna.api.dataproxy.services.v2.ErrorMessage)) {
      return super.equals(obj);
    }
    com.aruna.api.dataproxy.services.v2.ErrorMessage other = (com.aruna.api.dataproxy.services.v2.ErrorMessage) obj;

    if (!getErrorCase().equals(other.getErrorCase())) return false;
    switch (errorCase_) {
      case 1:
        if (!getRetryChunk()
            .equals(other.getRetryChunk())) return false;
        break;
      case 2:
        if (!getAbort()
            .equals(other.getAbort())) return false;
        break;
      case 3:
        if (!getRetryObjectId()
            .equals(other.getRetryObjectId())) return false;
        break;
      case 0:
      default:
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
    switch (errorCase_) {
      case 1:
        hash = (37 * hash) + RETRY_CHUNK_FIELD_NUMBER;
        hash = (53 * hash) + getRetryChunk().hashCode();
        break;
      case 2:
        hash = (37 * hash) + ABORT_FIELD_NUMBER;
        hash = (53 * hash) + getAbort().hashCode();
        break;
      case 3:
        hash = (37 * hash) + RETRY_OBJECT_ID_FIELD_NUMBER;
        hash = (53 * hash) + getRetryObjectId().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.dataproxy.services.v2.ErrorMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.dataproxy.services.v2.ErrorMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.ErrorMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.dataproxy.services.v2.ErrorMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.ErrorMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.dataproxy.services.v2.ErrorMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.ErrorMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.dataproxy.services.v2.ErrorMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.dataproxy.services.v2.ErrorMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.dataproxy.services.v2.ErrorMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.ErrorMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.dataproxy.services.v2.ErrorMessage parseFrom(
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
  public static Builder newBuilder(com.aruna.api.dataproxy.services.v2.ErrorMessage prototype) {
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
   * Protobuf type {@code aruna.api.dataproxy.services.v2.ErrorMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.dataproxy.services.v2.ErrorMessage)
      com.aruna.api.dataproxy.services.v2.ErrorMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_ErrorMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_ErrorMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.dataproxy.services.v2.ErrorMessage.class, com.aruna.api.dataproxy.services.v2.ErrorMessage.Builder.class);
    }

    // Construct using com.aruna.api.dataproxy.services.v2.ErrorMessage.newBuilder()
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
      if (retryChunkBuilder_ != null) {
        retryChunkBuilder_.clear();
      }
      if (abortBuilder_ != null) {
        abortBuilder_.clear();
      }
      errorCase_ = 0;
      error_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_ErrorMessage_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.ErrorMessage getDefaultInstanceForType() {
      return com.aruna.api.dataproxy.services.v2.ErrorMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.ErrorMessage build() {
      com.aruna.api.dataproxy.services.v2.ErrorMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.ErrorMessage buildPartial() {
      com.aruna.api.dataproxy.services.v2.ErrorMessage result = new com.aruna.api.dataproxy.services.v2.ErrorMessage(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.dataproxy.services.v2.ErrorMessage result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.aruna.api.dataproxy.services.v2.ErrorMessage result) {
      result.errorCase_ = errorCase_;
      result.error_ = this.error_;
      if (errorCase_ == 1 &&
          retryChunkBuilder_ != null) {
        result.error_ = retryChunkBuilder_.build();
      }
      if (errorCase_ == 2 &&
          abortBuilder_ != null) {
        result.error_ = abortBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.aruna.api.dataproxy.services.v2.ErrorMessage) {
        return mergeFrom((com.aruna.api.dataproxy.services.v2.ErrorMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.dataproxy.services.v2.ErrorMessage other) {
      if (other == com.aruna.api.dataproxy.services.v2.ErrorMessage.getDefaultInstance()) return this;
      switch (other.getErrorCase()) {
        case RETRY_CHUNK: {
          mergeRetryChunk(other.getRetryChunk());
          break;
        }
        case ABORT: {
          mergeAbort(other.getAbort());
          break;
        }
        case RETRY_OBJECT_ID: {
          errorCase_ = 3;
          error_ = other.error_;
          onChanged();
          break;
        }
        case ERROR_NOT_SET: {
          break;
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
              input.readMessage(
                  getRetryChunkFieldBuilder().getBuilder(),
                  extensionRegistry);
              errorCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAbortFieldBuilder().getBuilder(),
                  extensionRegistry);
              errorCase_ = 2;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              errorCase_ = 3;
              error_ = s;
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
    private int errorCase_ = 0;
    private java.lang.Object error_;
    public ErrorCase
        getErrorCase() {
      return ErrorCase.forNumber(
          errorCase_);
    }

    public Builder clearError() {
      errorCase_ = 0;
      error_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilder<
        com.aruna.api.dataproxy.services.v2.RetryChunkMessage, com.aruna.api.dataproxy.services.v2.RetryChunkMessage.Builder, com.aruna.api.dataproxy.services.v2.RetryChunkMessageOrBuilder> retryChunkBuilder_;
    /**
     * <code>.aruna.api.dataproxy.services.v2.RetryChunkMessage retry_chunk = 1 [json_name = "retryChunk"];</code>
     * @return Whether the retryChunk field is set.
     */
    @java.lang.Override
    public boolean hasRetryChunk() {
      return errorCase_ == 1;
    }
    /**
     * <code>.aruna.api.dataproxy.services.v2.RetryChunkMessage retry_chunk = 1 [json_name = "retryChunk"];</code>
     * @return The retryChunk.
     */
    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.RetryChunkMessage getRetryChunk() {
      if (retryChunkBuilder_ == null) {
        if (errorCase_ == 1) {
          return (com.aruna.api.dataproxy.services.v2.RetryChunkMessage) error_;
        }
        return com.aruna.api.dataproxy.services.v2.RetryChunkMessage.getDefaultInstance();
      } else {
        if (errorCase_ == 1) {
          return retryChunkBuilder_.getMessage();
        }
        return com.aruna.api.dataproxy.services.v2.RetryChunkMessage.getDefaultInstance();
      }
    }
    /**
     * <code>.aruna.api.dataproxy.services.v2.RetryChunkMessage retry_chunk = 1 [json_name = "retryChunk"];</code>
     */
    public Builder setRetryChunk(com.aruna.api.dataproxy.services.v2.RetryChunkMessage value) {
      if (retryChunkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        error_ = value;
        onChanged();
      } else {
        retryChunkBuilder_.setMessage(value);
      }
      errorCase_ = 1;
      return this;
    }
    /**
     * <code>.aruna.api.dataproxy.services.v2.RetryChunkMessage retry_chunk = 1 [json_name = "retryChunk"];</code>
     */
    public Builder setRetryChunk(
        com.aruna.api.dataproxy.services.v2.RetryChunkMessage.Builder builderForValue) {
      if (retryChunkBuilder_ == null) {
        error_ = builderForValue.build();
        onChanged();
      } else {
        retryChunkBuilder_.setMessage(builderForValue.build());
      }
      errorCase_ = 1;
      return this;
    }
    /**
     * <code>.aruna.api.dataproxy.services.v2.RetryChunkMessage retry_chunk = 1 [json_name = "retryChunk"];</code>
     */
    public Builder mergeRetryChunk(com.aruna.api.dataproxy.services.v2.RetryChunkMessage value) {
      if (retryChunkBuilder_ == null) {
        if (errorCase_ == 1 &&
            error_ != com.aruna.api.dataproxy.services.v2.RetryChunkMessage.getDefaultInstance()) {
          error_ = com.aruna.api.dataproxy.services.v2.RetryChunkMessage.newBuilder((com.aruna.api.dataproxy.services.v2.RetryChunkMessage) error_)
              .mergeFrom(value).buildPartial();
        } else {
          error_ = value;
        }
        onChanged();
      } else {
        if (errorCase_ == 1) {
          retryChunkBuilder_.mergeFrom(value);
        } else {
          retryChunkBuilder_.setMessage(value);
        }
      }
      errorCase_ = 1;
      return this;
    }
    /**
     * <code>.aruna.api.dataproxy.services.v2.RetryChunkMessage retry_chunk = 1 [json_name = "retryChunk"];</code>
     */
    public Builder clearRetryChunk() {
      if (retryChunkBuilder_ == null) {
        if (errorCase_ == 1) {
          errorCase_ = 0;
          error_ = null;
          onChanged();
        }
      } else {
        if (errorCase_ == 1) {
          errorCase_ = 0;
          error_ = null;
        }
        retryChunkBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.aruna.api.dataproxy.services.v2.RetryChunkMessage retry_chunk = 1 [json_name = "retryChunk"];</code>
     */
    public com.aruna.api.dataproxy.services.v2.RetryChunkMessage.Builder getRetryChunkBuilder() {
      return getRetryChunkFieldBuilder().getBuilder();
    }
    /**
     * <code>.aruna.api.dataproxy.services.v2.RetryChunkMessage retry_chunk = 1 [json_name = "retryChunk"];</code>
     */
    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.RetryChunkMessageOrBuilder getRetryChunkOrBuilder() {
      if ((errorCase_ == 1) && (retryChunkBuilder_ != null)) {
        return retryChunkBuilder_.getMessageOrBuilder();
      } else {
        if (errorCase_ == 1) {
          return (com.aruna.api.dataproxy.services.v2.RetryChunkMessage) error_;
        }
        return com.aruna.api.dataproxy.services.v2.RetryChunkMessage.getDefaultInstance();
      }
    }
    /**
     * <code>.aruna.api.dataproxy.services.v2.RetryChunkMessage retry_chunk = 1 [json_name = "retryChunk"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.aruna.api.dataproxy.services.v2.RetryChunkMessage, com.aruna.api.dataproxy.services.v2.RetryChunkMessage.Builder, com.aruna.api.dataproxy.services.v2.RetryChunkMessageOrBuilder> 
        getRetryChunkFieldBuilder() {
      if (retryChunkBuilder_ == null) {
        if (!(errorCase_ == 1)) {
          error_ = com.aruna.api.dataproxy.services.v2.RetryChunkMessage.getDefaultInstance();
        }
        retryChunkBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.aruna.api.dataproxy.services.v2.RetryChunkMessage, com.aruna.api.dataproxy.services.v2.RetryChunkMessage.Builder, com.aruna.api.dataproxy.services.v2.RetryChunkMessageOrBuilder>(
                (com.aruna.api.dataproxy.services.v2.RetryChunkMessage) error_,
                getParentForChildren(),
                isClean());
        error_ = null;
      }
      errorCase_ = 1;
      onChanged();
      return retryChunkBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilder<
        com.aruna.api.dataproxy.services.v2.Empty, com.aruna.api.dataproxy.services.v2.Empty.Builder, com.aruna.api.dataproxy.services.v2.EmptyOrBuilder> abortBuilder_;
    /**
     * <code>.aruna.api.dataproxy.services.v2.Empty abort = 2 [json_name = "abort"];</code>
     * @return Whether the abort field is set.
     */
    @java.lang.Override
    public boolean hasAbort() {
      return errorCase_ == 2;
    }
    /**
     * <code>.aruna.api.dataproxy.services.v2.Empty abort = 2 [json_name = "abort"];</code>
     * @return The abort.
     */
    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.Empty getAbort() {
      if (abortBuilder_ == null) {
        if (errorCase_ == 2) {
          return (com.aruna.api.dataproxy.services.v2.Empty) error_;
        }
        return com.aruna.api.dataproxy.services.v2.Empty.getDefaultInstance();
      } else {
        if (errorCase_ == 2) {
          return abortBuilder_.getMessage();
        }
        return com.aruna.api.dataproxy.services.v2.Empty.getDefaultInstance();
      }
    }
    /**
     * <code>.aruna.api.dataproxy.services.v2.Empty abort = 2 [json_name = "abort"];</code>
     */
    public Builder setAbort(com.aruna.api.dataproxy.services.v2.Empty value) {
      if (abortBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        error_ = value;
        onChanged();
      } else {
        abortBuilder_.setMessage(value);
      }
      errorCase_ = 2;
      return this;
    }
    /**
     * <code>.aruna.api.dataproxy.services.v2.Empty abort = 2 [json_name = "abort"];</code>
     */
    public Builder setAbort(
        com.aruna.api.dataproxy.services.v2.Empty.Builder builderForValue) {
      if (abortBuilder_ == null) {
        error_ = builderForValue.build();
        onChanged();
      } else {
        abortBuilder_.setMessage(builderForValue.build());
      }
      errorCase_ = 2;
      return this;
    }
    /**
     * <code>.aruna.api.dataproxy.services.v2.Empty abort = 2 [json_name = "abort"];</code>
     */
    public Builder mergeAbort(com.aruna.api.dataproxy.services.v2.Empty value) {
      if (abortBuilder_ == null) {
        if (errorCase_ == 2 &&
            error_ != com.aruna.api.dataproxy.services.v2.Empty.getDefaultInstance()) {
          error_ = com.aruna.api.dataproxy.services.v2.Empty.newBuilder((com.aruna.api.dataproxy.services.v2.Empty) error_)
              .mergeFrom(value).buildPartial();
        } else {
          error_ = value;
        }
        onChanged();
      } else {
        if (errorCase_ == 2) {
          abortBuilder_.mergeFrom(value);
        } else {
          abortBuilder_.setMessage(value);
        }
      }
      errorCase_ = 2;
      return this;
    }
    /**
     * <code>.aruna.api.dataproxy.services.v2.Empty abort = 2 [json_name = "abort"];</code>
     */
    public Builder clearAbort() {
      if (abortBuilder_ == null) {
        if (errorCase_ == 2) {
          errorCase_ = 0;
          error_ = null;
          onChanged();
        }
      } else {
        if (errorCase_ == 2) {
          errorCase_ = 0;
          error_ = null;
        }
        abortBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.aruna.api.dataproxy.services.v2.Empty abort = 2 [json_name = "abort"];</code>
     */
    public com.aruna.api.dataproxy.services.v2.Empty.Builder getAbortBuilder() {
      return getAbortFieldBuilder().getBuilder();
    }
    /**
     * <code>.aruna.api.dataproxy.services.v2.Empty abort = 2 [json_name = "abort"];</code>
     */
    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.EmptyOrBuilder getAbortOrBuilder() {
      if ((errorCase_ == 2) && (abortBuilder_ != null)) {
        return abortBuilder_.getMessageOrBuilder();
      } else {
        if (errorCase_ == 2) {
          return (com.aruna.api.dataproxy.services.v2.Empty) error_;
        }
        return com.aruna.api.dataproxy.services.v2.Empty.getDefaultInstance();
      }
    }
    /**
     * <code>.aruna.api.dataproxy.services.v2.Empty abort = 2 [json_name = "abort"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.aruna.api.dataproxy.services.v2.Empty, com.aruna.api.dataproxy.services.v2.Empty.Builder, com.aruna.api.dataproxy.services.v2.EmptyOrBuilder> 
        getAbortFieldBuilder() {
      if (abortBuilder_ == null) {
        if (!(errorCase_ == 2)) {
          error_ = com.aruna.api.dataproxy.services.v2.Empty.getDefaultInstance();
        }
        abortBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.aruna.api.dataproxy.services.v2.Empty, com.aruna.api.dataproxy.services.v2.Empty.Builder, com.aruna.api.dataproxy.services.v2.EmptyOrBuilder>(
                (com.aruna.api.dataproxy.services.v2.Empty) error_,
                getParentForChildren(),
                isClean());
        error_ = null;
      }
      errorCase_ = 2;
      onChanged();
      return abortBuilder_;
    }

    /**
     * <code>string retry_object_id = 3 [json_name = "retryObjectId"];</code>
     * @return Whether the retryObjectId field is set.
     */
    @java.lang.Override
    public boolean hasRetryObjectId() {
      return errorCase_ == 3;
    }
    /**
     * <code>string retry_object_id = 3 [json_name = "retryObjectId"];</code>
     * @return The retryObjectId.
     */
    @java.lang.Override
    public java.lang.String getRetryObjectId() {
      java.lang.Object ref = "";
      if (errorCase_ == 3) {
        ref = error_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (errorCase_ == 3) {
          error_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string retry_object_id = 3 [json_name = "retryObjectId"];</code>
     * @return The bytes for retryObjectId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRetryObjectIdBytes() {
      java.lang.Object ref = "";
      if (errorCase_ == 3) {
        ref = error_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (errorCase_ == 3) {
          error_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string retry_object_id = 3 [json_name = "retryObjectId"];</code>
     * @param value The retryObjectId to set.
     * @return This builder for chaining.
     */
    public Builder setRetryObjectId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      errorCase_ = 3;
      error_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string retry_object_id = 3 [json_name = "retryObjectId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRetryObjectId() {
      if (errorCase_ == 3) {
        errorCase_ = 0;
        error_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string retry_object_id = 3 [json_name = "retryObjectId"];</code>
     * @param value The bytes for retryObjectId to set.
     * @return This builder for chaining.
     */
    public Builder setRetryObjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      errorCase_ = 3;
      error_ = value;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:aruna.api.dataproxy.services.v2.ErrorMessage)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.dataproxy.services.v2.ErrorMessage)
  private static final com.aruna.api.dataproxy.services.v2.ErrorMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.dataproxy.services.v2.ErrorMessage();
  }

  public static com.aruna.api.dataproxy.services.v2.ErrorMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ErrorMessage>
      PARSER = new com.google.protobuf.AbstractParser<ErrorMessage>() {
    @java.lang.Override
    public ErrorMessage parsePartialFrom(
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

  public static com.google.protobuf.Parser<ErrorMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ErrorMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.dataproxy.services.v2.ErrorMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

