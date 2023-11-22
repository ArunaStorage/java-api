// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/endpoint_service.proto

// Protobuf Java Version: 3.25.1
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.GetDefaultEndpointResponse}
 */
public final class GetDefaultEndpointResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.GetDefaultEndpointResponse)
    GetDefaultEndpointResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetDefaultEndpointResponse.newBuilder() to construct.
  private GetDefaultEndpointResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetDefaultEndpointResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetDefaultEndpointResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.EndpointServiceProto.internal_static_aruna_api_storage_services_v2_GetDefaultEndpointResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.EndpointServiceProto.internal_static_aruna_api_storage_services_v2_GetDefaultEndpointResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.GetDefaultEndpointResponse.class, com.aruna.api.storage.services.v2.GetDefaultEndpointResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ENDPOINT_FIELD_NUMBER = 1;
  private com.aruna.api.storage.models.v2.Endpoint endpoint_;
  /**
   * <pre>
   * Default endpoint of the server instance
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Endpoint endpoint = 1 [json_name = "endpoint"];</code>
   * @return Whether the endpoint field is set.
   */
  @java.lang.Override
  public boolean hasEndpoint() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Default endpoint of the server instance
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Endpoint endpoint = 1 [json_name = "endpoint"];</code>
   * @return The endpoint.
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.Endpoint getEndpoint() {
    return endpoint_ == null ? com.aruna.api.storage.models.v2.Endpoint.getDefaultInstance() : endpoint_;
  }
  /**
   * <pre>
   * Default endpoint of the server instance
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Endpoint endpoint = 1 [json_name = "endpoint"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.EndpointOrBuilder getEndpointOrBuilder() {
    return endpoint_ == null ? com.aruna.api.storage.models.v2.Endpoint.getDefaultInstance() : endpoint_;
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
      output.writeMessage(1, getEndpoint());
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
        .computeMessageSize(1, getEndpoint());
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.GetDefaultEndpointResponse)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.GetDefaultEndpointResponse other = (com.aruna.api.storage.services.v2.GetDefaultEndpointResponse) obj;

    if (hasEndpoint() != other.hasEndpoint()) return false;
    if (hasEndpoint()) {
      if (!getEndpoint()
          .equals(other.getEndpoint())) return false;
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
    if (hasEndpoint()) {
      hash = (37 * hash) + ENDPOINT_FIELD_NUMBER;
      hash = (53 * hash) + getEndpoint().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.GetDefaultEndpointResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetDefaultEndpointResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetDefaultEndpointResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetDefaultEndpointResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetDefaultEndpointResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetDefaultEndpointResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetDefaultEndpointResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetDefaultEndpointResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.GetDefaultEndpointResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.GetDefaultEndpointResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetDefaultEndpointResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetDefaultEndpointResponse parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.GetDefaultEndpointResponse prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.GetDefaultEndpointResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.GetDefaultEndpointResponse)
      com.aruna.api.storage.services.v2.GetDefaultEndpointResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.EndpointServiceProto.internal_static_aruna_api_storage_services_v2_GetDefaultEndpointResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.EndpointServiceProto.internal_static_aruna_api_storage_services_v2_GetDefaultEndpointResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.GetDefaultEndpointResponse.class, com.aruna.api.storage.services.v2.GetDefaultEndpointResponse.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.GetDefaultEndpointResponse.newBuilder()
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
        getEndpointFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      endpoint_ = null;
      if (endpointBuilder_ != null) {
        endpointBuilder_.dispose();
        endpointBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.EndpointServiceProto.internal_static_aruna_api_storage_services_v2_GetDefaultEndpointResponse_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetDefaultEndpointResponse getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.GetDefaultEndpointResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetDefaultEndpointResponse build() {
      com.aruna.api.storage.services.v2.GetDefaultEndpointResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetDefaultEndpointResponse buildPartial() {
      com.aruna.api.storage.services.v2.GetDefaultEndpointResponse result = new com.aruna.api.storage.services.v2.GetDefaultEndpointResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.GetDefaultEndpointResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.endpoint_ = endpointBuilder_ == null
            ? endpoint_
            : endpointBuilder_.build();
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
      if (other instanceof com.aruna.api.storage.services.v2.GetDefaultEndpointResponse) {
        return mergeFrom((com.aruna.api.storage.services.v2.GetDefaultEndpointResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.GetDefaultEndpointResponse other) {
      if (other == com.aruna.api.storage.services.v2.GetDefaultEndpointResponse.getDefaultInstance()) return this;
      if (other.hasEndpoint()) {
        mergeEndpoint(other.getEndpoint());
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
                  getEndpointFieldBuilder().getBuilder(),
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

    private com.aruna.api.storage.models.v2.Endpoint endpoint_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.storage.models.v2.Endpoint, com.aruna.api.storage.models.v2.Endpoint.Builder, com.aruna.api.storage.models.v2.EndpointOrBuilder> endpointBuilder_;
    /**
     * <pre>
     * Default endpoint of the server instance
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Endpoint endpoint = 1 [json_name = "endpoint"];</code>
     * @return Whether the endpoint field is set.
     */
    public boolean hasEndpoint() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Default endpoint of the server instance
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Endpoint endpoint = 1 [json_name = "endpoint"];</code>
     * @return The endpoint.
     */
    public com.aruna.api.storage.models.v2.Endpoint getEndpoint() {
      if (endpointBuilder_ == null) {
        return endpoint_ == null ? com.aruna.api.storage.models.v2.Endpoint.getDefaultInstance() : endpoint_;
      } else {
        return endpointBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Default endpoint of the server instance
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Endpoint endpoint = 1 [json_name = "endpoint"];</code>
     */
    public Builder setEndpoint(com.aruna.api.storage.models.v2.Endpoint value) {
      if (endpointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endpoint_ = value;
      } else {
        endpointBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Default endpoint of the server instance
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Endpoint endpoint = 1 [json_name = "endpoint"];</code>
     */
    public Builder setEndpoint(
        com.aruna.api.storage.models.v2.Endpoint.Builder builderForValue) {
      if (endpointBuilder_ == null) {
        endpoint_ = builderForValue.build();
      } else {
        endpointBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Default endpoint of the server instance
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Endpoint endpoint = 1 [json_name = "endpoint"];</code>
     */
    public Builder mergeEndpoint(com.aruna.api.storage.models.v2.Endpoint value) {
      if (endpointBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          endpoint_ != null &&
          endpoint_ != com.aruna.api.storage.models.v2.Endpoint.getDefaultInstance()) {
          getEndpointBuilder().mergeFrom(value);
        } else {
          endpoint_ = value;
        }
      } else {
        endpointBuilder_.mergeFrom(value);
      }
      if (endpoint_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Default endpoint of the server instance
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Endpoint endpoint = 1 [json_name = "endpoint"];</code>
     */
    public Builder clearEndpoint() {
      bitField0_ = (bitField0_ & ~0x00000001);
      endpoint_ = null;
      if (endpointBuilder_ != null) {
        endpointBuilder_.dispose();
        endpointBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Default endpoint of the server instance
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Endpoint endpoint = 1 [json_name = "endpoint"];</code>
     */
    public com.aruna.api.storage.models.v2.Endpoint.Builder getEndpointBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEndpointFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Default endpoint of the server instance
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Endpoint endpoint = 1 [json_name = "endpoint"];</code>
     */
    public com.aruna.api.storage.models.v2.EndpointOrBuilder getEndpointOrBuilder() {
      if (endpointBuilder_ != null) {
        return endpointBuilder_.getMessageOrBuilder();
      } else {
        return endpoint_ == null ?
            com.aruna.api.storage.models.v2.Endpoint.getDefaultInstance() : endpoint_;
      }
    }
    /**
     * <pre>
     * Default endpoint of the server instance
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Endpoint endpoint = 1 [json_name = "endpoint"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.storage.models.v2.Endpoint, com.aruna.api.storage.models.v2.Endpoint.Builder, com.aruna.api.storage.models.v2.EndpointOrBuilder> 
        getEndpointFieldBuilder() {
      if (endpointBuilder_ == null) {
        endpointBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aruna.api.storage.models.v2.Endpoint, com.aruna.api.storage.models.v2.Endpoint.Builder, com.aruna.api.storage.models.v2.EndpointOrBuilder>(
                getEndpoint(),
                getParentForChildren(),
                isClean());
        endpoint_ = null;
      }
      return endpointBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.GetDefaultEndpointResponse)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.GetDefaultEndpointResponse)
  private static final com.aruna.api.storage.services.v2.GetDefaultEndpointResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.GetDefaultEndpointResponse();
  }

  public static com.aruna.api.storage.services.v2.GetDefaultEndpointResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDefaultEndpointResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetDefaultEndpointResponse>() {
    @java.lang.Override
    public GetDefaultEndpointResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetDefaultEndpointResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetDefaultEndpointResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.GetDefaultEndpointResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

