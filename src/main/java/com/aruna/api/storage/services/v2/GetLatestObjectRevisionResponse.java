// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/object_service.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.GetLatestObjectRevisionResponse}
 */
public final class GetLatestObjectRevisionResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.GetLatestObjectRevisionResponse)
    GetLatestObjectRevisionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      GetLatestObjectRevisionResponse.class.getName());
  }
  // Use GetLatestObjectRevisionResponse.newBuilder() to construct.
  private GetLatestObjectRevisionResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetLatestObjectRevisionResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_GetLatestObjectRevisionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_GetLatestObjectRevisionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse.class, com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse.Builder.class);
  }

  private int bitField0_;
  public static final int OBJECT_FIELD_NUMBER = 1;
  private com.aruna.api.storage.models.v2.Object object_;
  /**
   * <pre>
   * The object with the latest revision
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Object object = 1 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  @java.lang.Override
  public boolean hasObject() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The object with the latest revision
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Object object = 1 [json_name = "object"];</code>
   * @return The object.
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.Object getObject() {
    return object_ == null ? com.aruna.api.storage.models.v2.Object.getDefaultInstance() : object_;
  }
  /**
   * <pre>
   * The object with the latest revision
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Object object = 1 [json_name = "object"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.ObjectOrBuilder getObjectOrBuilder() {
    return object_ == null ? com.aruna.api.storage.models.v2.Object.getDefaultInstance() : object_;
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
      output.writeMessage(1, getObject());
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
        .computeMessageSize(1, getObject());
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse other = (com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse) obj;

    if (hasObject() != other.hasObject()) return false;
    if (hasObject()) {
      if (!getObject()
          .equals(other.getObject())) return false;
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
    if (hasObject()) {
      hash = (37 * hash) + OBJECT_FIELD_NUMBER;
      hash = (53 * hash) + getObject().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.GetLatestObjectRevisionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.GetLatestObjectRevisionResponse)
      com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_GetLatestObjectRevisionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_GetLatestObjectRevisionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse.class, com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getObjectFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      object_ = null;
      if (objectBuilder_ != null) {
        objectBuilder_.dispose();
        objectBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_GetLatestObjectRevisionResponse_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse build() {
      com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse buildPartial() {
      com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse result = new com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.object_ = objectBuilder_ == null
            ? object_
            : objectBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse) {
        return mergeFrom((com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse other) {
      if (other == com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse.getDefaultInstance()) return this;
      if (other.hasObject()) {
        mergeObject(other.getObject());
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
                  getObjectFieldBuilder().getBuilder(),
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

    private com.aruna.api.storage.models.v2.Object object_;
    private com.google.protobuf.SingleFieldBuilder<
        com.aruna.api.storage.models.v2.Object, com.aruna.api.storage.models.v2.Object.Builder, com.aruna.api.storage.models.v2.ObjectOrBuilder> objectBuilder_;
    /**
     * <pre>
     * The object with the latest revision
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Object object = 1 [json_name = "object"];</code>
     * @return Whether the object field is set.
     */
    public boolean hasObject() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The object with the latest revision
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Object object = 1 [json_name = "object"];</code>
     * @return The object.
     */
    public com.aruna.api.storage.models.v2.Object getObject() {
      if (objectBuilder_ == null) {
        return object_ == null ? com.aruna.api.storage.models.v2.Object.getDefaultInstance() : object_;
      } else {
        return objectBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The object with the latest revision
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Object object = 1 [json_name = "object"];</code>
     */
    public Builder setObject(com.aruna.api.storage.models.v2.Object value) {
      if (objectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        object_ = value;
      } else {
        objectBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The object with the latest revision
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Object object = 1 [json_name = "object"];</code>
     */
    public Builder setObject(
        com.aruna.api.storage.models.v2.Object.Builder builderForValue) {
      if (objectBuilder_ == null) {
        object_ = builderForValue.build();
      } else {
        objectBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The object with the latest revision
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Object object = 1 [json_name = "object"];</code>
     */
    public Builder mergeObject(com.aruna.api.storage.models.v2.Object value) {
      if (objectBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          object_ != null &&
          object_ != com.aruna.api.storage.models.v2.Object.getDefaultInstance()) {
          getObjectBuilder().mergeFrom(value);
        } else {
          object_ = value;
        }
      } else {
        objectBuilder_.mergeFrom(value);
      }
      if (object_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The object with the latest revision
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Object object = 1 [json_name = "object"];</code>
     */
    public Builder clearObject() {
      bitField0_ = (bitField0_ & ~0x00000001);
      object_ = null;
      if (objectBuilder_ != null) {
        objectBuilder_.dispose();
        objectBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The object with the latest revision
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Object object = 1 [json_name = "object"];</code>
     */
    public com.aruna.api.storage.models.v2.Object.Builder getObjectBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getObjectFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The object with the latest revision
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Object object = 1 [json_name = "object"];</code>
     */
    public com.aruna.api.storage.models.v2.ObjectOrBuilder getObjectOrBuilder() {
      if (objectBuilder_ != null) {
        return objectBuilder_.getMessageOrBuilder();
      } else {
        return object_ == null ?
            com.aruna.api.storage.models.v2.Object.getDefaultInstance() : object_;
      }
    }
    /**
     * <pre>
     * The object with the latest revision
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Object object = 1 [json_name = "object"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.aruna.api.storage.models.v2.Object, com.aruna.api.storage.models.v2.Object.Builder, com.aruna.api.storage.models.v2.ObjectOrBuilder> 
        getObjectFieldBuilder() {
      if (objectBuilder_ == null) {
        objectBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.aruna.api.storage.models.v2.Object, com.aruna.api.storage.models.v2.Object.Builder, com.aruna.api.storage.models.v2.ObjectOrBuilder>(
                getObject(),
                getParentForChildren(),
                isClean());
        object_ = null;
      }
      return objectBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.GetLatestObjectRevisionResponse)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.GetLatestObjectRevisionResponse)
  private static final com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse();
  }

  public static com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetLatestObjectRevisionResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetLatestObjectRevisionResponse>() {
    @java.lang.Override
    public GetLatestObjectRevisionResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetLatestObjectRevisionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetLatestObjectRevisionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.GetLatestObjectRevisionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

