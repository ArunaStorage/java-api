// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/dataproxy/services/v2/dataproxy_service.proto

// Protobuf Java Version: 3.25.1
package com.aruna.api.dataproxy.services.v2;

/**
 * Protobuf type {@code aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest}
 */
public final class InitMultiPartUploadRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest)
    InitMultiPartUploadRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InitMultiPartUploadRequest.newBuilder() to construct.
  private InitMultiPartUploadRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InitMultiPartUploadRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InitMultiPartUploadRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_InitMultiPartUploadRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_InitMultiPartUploadRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest.class, com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest.Builder.class);
  }

  private int bitField0_;
  public static final int LOCATION_FIELD_NUMBER = 1;
  private com.aruna.api.dataproxy.services.v2.ObjectLocation location_;
  /**
   * <code>.aruna.api.dataproxy.services.v2.ObjectLocation location = 1 [json_name = "location"];</code>
   * @return Whether the location field is set.
   */
  @java.lang.Override
  public boolean hasLocation() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.aruna.api.dataproxy.services.v2.ObjectLocation location = 1 [json_name = "location"];</code>
   * @return The location.
   */
  @java.lang.Override
  public com.aruna.api.dataproxy.services.v2.ObjectLocation getLocation() {
    return location_ == null ? com.aruna.api.dataproxy.services.v2.ObjectLocation.getDefaultInstance() : location_;
  }
  /**
   * <code>.aruna.api.dataproxy.services.v2.ObjectLocation location = 1 [json_name = "location"];</code>
   */
  @java.lang.Override
  public com.aruna.api.dataproxy.services.v2.ObjectLocationOrBuilder getLocationOrBuilder() {
    return location_ == null ? com.aruna.api.dataproxy.services.v2.ObjectLocation.getDefaultInstance() : location_;
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
      output.writeMessage(1, getLocation());
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
        .computeMessageSize(1, getLocation());
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
    if (!(obj instanceof com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest)) {
      return super.equals(obj);
    }
    com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest other = (com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest) obj;

    if (hasLocation() != other.hasLocation()) return false;
    if (hasLocation()) {
      if (!getLocation()
          .equals(other.getLocation())) return false;
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
    if (hasLocation()) {
      hash = (37 * hash) + LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getLocation().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest parseFrom(
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
  public static Builder newBuilder(com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest prototype) {
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
   * Protobuf type {@code aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest)
      com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_InitMultiPartUploadRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_InitMultiPartUploadRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest.class, com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest.Builder.class);
    }

    // Construct using com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest.newBuilder()
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
        getLocationFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      location_ = null;
      if (locationBuilder_ != null) {
        locationBuilder_.dispose();
        locationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_InitMultiPartUploadRequest_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest getDefaultInstanceForType() {
      return com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest build() {
      com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest buildPartial() {
      com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest result = new com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.location_ = locationBuilder_ == null
            ? location_
            : locationBuilder_.build();
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
      if (other instanceof com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest) {
        return mergeFrom((com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest other) {
      if (other == com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest.getDefaultInstance()) return this;
      if (other.hasLocation()) {
        mergeLocation(other.getLocation());
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
                  getLocationFieldBuilder().getBuilder(),
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

    private com.aruna.api.dataproxy.services.v2.ObjectLocation location_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.dataproxy.services.v2.ObjectLocation, com.aruna.api.dataproxy.services.v2.ObjectLocation.Builder, com.aruna.api.dataproxy.services.v2.ObjectLocationOrBuilder> locationBuilder_;
    /**
     * <code>.aruna.api.dataproxy.services.v2.ObjectLocation location = 1 [json_name = "location"];</code>
     * @return Whether the location field is set.
     */
    public boolean hasLocation() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.aruna.api.dataproxy.services.v2.ObjectLocation location = 1 [json_name = "location"];</code>
     * @return The location.
     */
    public com.aruna.api.dataproxy.services.v2.ObjectLocation getLocation() {
      if (locationBuilder_ == null) {
        return location_ == null ? com.aruna.api.dataproxy.services.v2.ObjectLocation.getDefaultInstance() : location_;
      } else {
        return locationBuilder_.getMessage();
      }
    }
    /**
     * <code>.aruna.api.dataproxy.services.v2.ObjectLocation location = 1 [json_name = "location"];</code>
     */
    public Builder setLocation(com.aruna.api.dataproxy.services.v2.ObjectLocation value) {
      if (locationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        location_ = value;
      } else {
        locationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.dataproxy.services.v2.ObjectLocation location = 1 [json_name = "location"];</code>
     */
    public Builder setLocation(
        com.aruna.api.dataproxy.services.v2.ObjectLocation.Builder builderForValue) {
      if (locationBuilder_ == null) {
        location_ = builderForValue.build();
      } else {
        locationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.dataproxy.services.v2.ObjectLocation location = 1 [json_name = "location"];</code>
     */
    public Builder mergeLocation(com.aruna.api.dataproxy.services.v2.ObjectLocation value) {
      if (locationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          location_ != null &&
          location_ != com.aruna.api.dataproxy.services.v2.ObjectLocation.getDefaultInstance()) {
          getLocationBuilder().mergeFrom(value);
        } else {
          location_ = value;
        }
      } else {
        locationBuilder_.mergeFrom(value);
      }
      if (location_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.aruna.api.dataproxy.services.v2.ObjectLocation location = 1 [json_name = "location"];</code>
     */
    public Builder clearLocation() {
      bitField0_ = (bitField0_ & ~0x00000001);
      location_ = null;
      if (locationBuilder_ != null) {
        locationBuilder_.dispose();
        locationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.dataproxy.services.v2.ObjectLocation location = 1 [json_name = "location"];</code>
     */
    public com.aruna.api.dataproxy.services.v2.ObjectLocation.Builder getLocationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getLocationFieldBuilder().getBuilder();
    }
    /**
     * <code>.aruna.api.dataproxy.services.v2.ObjectLocation location = 1 [json_name = "location"];</code>
     */
    public com.aruna.api.dataproxy.services.v2.ObjectLocationOrBuilder getLocationOrBuilder() {
      if (locationBuilder_ != null) {
        return locationBuilder_.getMessageOrBuilder();
      } else {
        return location_ == null ?
            com.aruna.api.dataproxy.services.v2.ObjectLocation.getDefaultInstance() : location_;
      }
    }
    /**
     * <code>.aruna.api.dataproxy.services.v2.ObjectLocation location = 1 [json_name = "location"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.dataproxy.services.v2.ObjectLocation, com.aruna.api.dataproxy.services.v2.ObjectLocation.Builder, com.aruna.api.dataproxy.services.v2.ObjectLocationOrBuilder> 
        getLocationFieldBuilder() {
      if (locationBuilder_ == null) {
        locationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aruna.api.dataproxy.services.v2.ObjectLocation, com.aruna.api.dataproxy.services.v2.ObjectLocation.Builder, com.aruna.api.dataproxy.services.v2.ObjectLocationOrBuilder>(
                getLocation(),
                getParentForChildren(),
                isClean());
        location_ = null;
      }
      return locationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest)
  private static final com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest();
  }

  public static com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InitMultiPartUploadRequest>
      PARSER = new com.google.protobuf.AbstractParser<InitMultiPartUploadRequest>() {
    @java.lang.Override
    public InitMultiPartUploadRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<InitMultiPartUploadRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InitMultiPartUploadRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

