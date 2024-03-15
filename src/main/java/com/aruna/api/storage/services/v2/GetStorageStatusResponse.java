// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/info_service.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.GetStorageStatusResponse}
 */
public final class GetStorageStatusResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.GetStorageStatusResponse)
    GetStorageStatusResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      GetStorageStatusResponse.class.getName());
  }
  // Use GetStorageStatusResponse.newBuilder() to construct.
  private GetStorageStatusResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetStorageStatusResponse() {
    locationStatus_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_GetStorageStatusResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_GetStorageStatusResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.GetStorageStatusResponse.class, com.aruna.api.storage.services.v2.GetStorageStatusResponse.Builder.class);
  }

  public static final int LOCATION_STATUS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.aruna.api.storage.services.v2.LocationStatus> locationStatus_;
  /**
   * <pre>
   * List of all locations and their component / status
   * </pre>
   *
   * <code>repeated .aruna.api.storage.services.v2.LocationStatus location_status = 1 [json_name = "locationStatus"];</code>
   */
  @java.lang.Override
  public java.util.List<com.aruna.api.storage.services.v2.LocationStatus> getLocationStatusList() {
    return locationStatus_;
  }
  /**
   * <pre>
   * List of all locations and their component / status
   * </pre>
   *
   * <code>repeated .aruna.api.storage.services.v2.LocationStatus location_status = 1 [json_name = "locationStatus"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.aruna.api.storage.services.v2.LocationStatusOrBuilder> 
      getLocationStatusOrBuilderList() {
    return locationStatus_;
  }
  /**
   * <pre>
   * List of all locations and their component / status
   * </pre>
   *
   * <code>repeated .aruna.api.storage.services.v2.LocationStatus location_status = 1 [json_name = "locationStatus"];</code>
   */
  @java.lang.Override
  public int getLocationStatusCount() {
    return locationStatus_.size();
  }
  /**
   * <pre>
   * List of all locations and their component / status
   * </pre>
   *
   * <code>repeated .aruna.api.storage.services.v2.LocationStatus location_status = 1 [json_name = "locationStatus"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.services.v2.LocationStatus getLocationStatus(int index) {
    return locationStatus_.get(index);
  }
  /**
   * <pre>
   * List of all locations and their component / status
   * </pre>
   *
   * <code>repeated .aruna.api.storage.services.v2.LocationStatus location_status = 1 [json_name = "locationStatus"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.services.v2.LocationStatusOrBuilder getLocationStatusOrBuilder(
      int index) {
    return locationStatus_.get(index);
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
    for (int i = 0; i < locationStatus_.size(); i++) {
      output.writeMessage(1, locationStatus_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < locationStatus_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, locationStatus_.get(i));
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.GetStorageStatusResponse)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.GetStorageStatusResponse other = (com.aruna.api.storage.services.v2.GetStorageStatusResponse) obj;

    if (!getLocationStatusList()
        .equals(other.getLocationStatusList())) return false;
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
    if (getLocationStatusCount() > 0) {
      hash = (37 * hash) + LOCATION_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getLocationStatusList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.GetStorageStatusResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetStorageStatusResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetStorageStatusResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetStorageStatusResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetStorageStatusResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetStorageStatusResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetStorageStatusResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetStorageStatusResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.GetStorageStatusResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.GetStorageStatusResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetStorageStatusResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetStorageStatusResponse parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.GetStorageStatusResponse prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.GetStorageStatusResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.GetStorageStatusResponse)
      com.aruna.api.storage.services.v2.GetStorageStatusResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_GetStorageStatusResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_GetStorageStatusResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.GetStorageStatusResponse.class, com.aruna.api.storage.services.v2.GetStorageStatusResponse.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.GetStorageStatusResponse.newBuilder()
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
      if (locationStatusBuilder_ == null) {
        locationStatus_ = java.util.Collections.emptyList();
      } else {
        locationStatus_ = null;
        locationStatusBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.InfoServiceProto.internal_static_aruna_api_storage_services_v2_GetStorageStatusResponse_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetStorageStatusResponse getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.GetStorageStatusResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetStorageStatusResponse build() {
      com.aruna.api.storage.services.v2.GetStorageStatusResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetStorageStatusResponse buildPartial() {
      com.aruna.api.storage.services.v2.GetStorageStatusResponse result = new com.aruna.api.storage.services.v2.GetStorageStatusResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.aruna.api.storage.services.v2.GetStorageStatusResponse result) {
      if (locationStatusBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          locationStatus_ = java.util.Collections.unmodifiableList(locationStatus_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.locationStatus_ = locationStatus_;
      } else {
        result.locationStatus_ = locationStatusBuilder_.build();
      }
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.GetStorageStatusResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.aruna.api.storage.services.v2.GetStorageStatusResponse) {
        return mergeFrom((com.aruna.api.storage.services.v2.GetStorageStatusResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.GetStorageStatusResponse other) {
      if (other == com.aruna.api.storage.services.v2.GetStorageStatusResponse.getDefaultInstance()) return this;
      if (locationStatusBuilder_ == null) {
        if (!other.locationStatus_.isEmpty()) {
          if (locationStatus_.isEmpty()) {
            locationStatus_ = other.locationStatus_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLocationStatusIsMutable();
            locationStatus_.addAll(other.locationStatus_);
          }
          onChanged();
        }
      } else {
        if (!other.locationStatus_.isEmpty()) {
          if (locationStatusBuilder_.isEmpty()) {
            locationStatusBuilder_.dispose();
            locationStatusBuilder_ = null;
            locationStatus_ = other.locationStatus_;
            bitField0_ = (bitField0_ & ~0x00000001);
            locationStatusBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getLocationStatusFieldBuilder() : null;
          } else {
            locationStatusBuilder_.addAllMessages(other.locationStatus_);
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
              com.aruna.api.storage.services.v2.LocationStatus m =
                  input.readMessage(
                      com.aruna.api.storage.services.v2.LocationStatus.parser(),
                      extensionRegistry);
              if (locationStatusBuilder_ == null) {
                ensureLocationStatusIsMutable();
                locationStatus_.add(m);
              } else {
                locationStatusBuilder_.addMessage(m);
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

    private java.util.List<com.aruna.api.storage.services.v2.LocationStatus> locationStatus_ =
      java.util.Collections.emptyList();
    private void ensureLocationStatusIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        locationStatus_ = new java.util.ArrayList<com.aruna.api.storage.services.v2.LocationStatus>(locationStatus_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.aruna.api.storage.services.v2.LocationStatus, com.aruna.api.storage.services.v2.LocationStatus.Builder, com.aruna.api.storage.services.v2.LocationStatusOrBuilder> locationStatusBuilder_;

    /**
     * <pre>
     * List of all locations and their component / status
     * </pre>
     *
     * <code>repeated .aruna.api.storage.services.v2.LocationStatus location_status = 1 [json_name = "locationStatus"];</code>
     */
    public java.util.List<com.aruna.api.storage.services.v2.LocationStatus> getLocationStatusList() {
      if (locationStatusBuilder_ == null) {
        return java.util.Collections.unmodifiableList(locationStatus_);
      } else {
        return locationStatusBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of all locations and their component / status
     * </pre>
     *
     * <code>repeated .aruna.api.storage.services.v2.LocationStatus location_status = 1 [json_name = "locationStatus"];</code>
     */
    public int getLocationStatusCount() {
      if (locationStatusBuilder_ == null) {
        return locationStatus_.size();
      } else {
        return locationStatusBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of all locations and their component / status
     * </pre>
     *
     * <code>repeated .aruna.api.storage.services.v2.LocationStatus location_status = 1 [json_name = "locationStatus"];</code>
     */
    public com.aruna.api.storage.services.v2.LocationStatus getLocationStatus(int index) {
      if (locationStatusBuilder_ == null) {
        return locationStatus_.get(index);
      } else {
        return locationStatusBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of all locations and their component / status
     * </pre>
     *
     * <code>repeated .aruna.api.storage.services.v2.LocationStatus location_status = 1 [json_name = "locationStatus"];</code>
     */
    public Builder setLocationStatus(
        int index, com.aruna.api.storage.services.v2.LocationStatus value) {
      if (locationStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocationStatusIsMutable();
        locationStatus_.set(index, value);
        onChanged();
      } else {
        locationStatusBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of all locations and their component / status
     * </pre>
     *
     * <code>repeated .aruna.api.storage.services.v2.LocationStatus location_status = 1 [json_name = "locationStatus"];</code>
     */
    public Builder setLocationStatus(
        int index, com.aruna.api.storage.services.v2.LocationStatus.Builder builderForValue) {
      if (locationStatusBuilder_ == null) {
        ensureLocationStatusIsMutable();
        locationStatus_.set(index, builderForValue.build());
        onChanged();
      } else {
        locationStatusBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of all locations and their component / status
     * </pre>
     *
     * <code>repeated .aruna.api.storage.services.v2.LocationStatus location_status = 1 [json_name = "locationStatus"];</code>
     */
    public Builder addLocationStatus(com.aruna.api.storage.services.v2.LocationStatus value) {
      if (locationStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocationStatusIsMutable();
        locationStatus_.add(value);
        onChanged();
      } else {
        locationStatusBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of all locations and their component / status
     * </pre>
     *
     * <code>repeated .aruna.api.storage.services.v2.LocationStatus location_status = 1 [json_name = "locationStatus"];</code>
     */
    public Builder addLocationStatus(
        int index, com.aruna.api.storage.services.v2.LocationStatus value) {
      if (locationStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocationStatusIsMutable();
        locationStatus_.add(index, value);
        onChanged();
      } else {
        locationStatusBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of all locations and their component / status
     * </pre>
     *
     * <code>repeated .aruna.api.storage.services.v2.LocationStatus location_status = 1 [json_name = "locationStatus"];</code>
     */
    public Builder addLocationStatus(
        com.aruna.api.storage.services.v2.LocationStatus.Builder builderForValue) {
      if (locationStatusBuilder_ == null) {
        ensureLocationStatusIsMutable();
        locationStatus_.add(builderForValue.build());
        onChanged();
      } else {
        locationStatusBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of all locations and their component / status
     * </pre>
     *
     * <code>repeated .aruna.api.storage.services.v2.LocationStatus location_status = 1 [json_name = "locationStatus"];</code>
     */
    public Builder addLocationStatus(
        int index, com.aruna.api.storage.services.v2.LocationStatus.Builder builderForValue) {
      if (locationStatusBuilder_ == null) {
        ensureLocationStatusIsMutable();
        locationStatus_.add(index, builderForValue.build());
        onChanged();
      } else {
        locationStatusBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of all locations and their component / status
     * </pre>
     *
     * <code>repeated .aruna.api.storage.services.v2.LocationStatus location_status = 1 [json_name = "locationStatus"];</code>
     */
    public Builder addAllLocationStatus(
        java.lang.Iterable<? extends com.aruna.api.storage.services.v2.LocationStatus> values) {
      if (locationStatusBuilder_ == null) {
        ensureLocationStatusIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, locationStatus_);
        onChanged();
      } else {
        locationStatusBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of all locations and their component / status
     * </pre>
     *
     * <code>repeated .aruna.api.storage.services.v2.LocationStatus location_status = 1 [json_name = "locationStatus"];</code>
     */
    public Builder clearLocationStatus() {
      if (locationStatusBuilder_ == null) {
        locationStatus_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        locationStatusBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of all locations and their component / status
     * </pre>
     *
     * <code>repeated .aruna.api.storage.services.v2.LocationStatus location_status = 1 [json_name = "locationStatus"];</code>
     */
    public Builder removeLocationStatus(int index) {
      if (locationStatusBuilder_ == null) {
        ensureLocationStatusIsMutable();
        locationStatus_.remove(index);
        onChanged();
      } else {
        locationStatusBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of all locations and their component / status
     * </pre>
     *
     * <code>repeated .aruna.api.storage.services.v2.LocationStatus location_status = 1 [json_name = "locationStatus"];</code>
     */
    public com.aruna.api.storage.services.v2.LocationStatus.Builder getLocationStatusBuilder(
        int index) {
      return getLocationStatusFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of all locations and their component / status
     * </pre>
     *
     * <code>repeated .aruna.api.storage.services.v2.LocationStatus location_status = 1 [json_name = "locationStatus"];</code>
     */
    public com.aruna.api.storage.services.v2.LocationStatusOrBuilder getLocationStatusOrBuilder(
        int index) {
      if (locationStatusBuilder_ == null) {
        return locationStatus_.get(index);  } else {
        return locationStatusBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of all locations and their component / status
     * </pre>
     *
     * <code>repeated .aruna.api.storage.services.v2.LocationStatus location_status = 1 [json_name = "locationStatus"];</code>
     */
    public java.util.List<? extends com.aruna.api.storage.services.v2.LocationStatusOrBuilder> 
         getLocationStatusOrBuilderList() {
      if (locationStatusBuilder_ != null) {
        return locationStatusBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(locationStatus_);
      }
    }
    /**
     * <pre>
     * List of all locations and their component / status
     * </pre>
     *
     * <code>repeated .aruna.api.storage.services.v2.LocationStatus location_status = 1 [json_name = "locationStatus"];</code>
     */
    public com.aruna.api.storage.services.v2.LocationStatus.Builder addLocationStatusBuilder() {
      return getLocationStatusFieldBuilder().addBuilder(
          com.aruna.api.storage.services.v2.LocationStatus.getDefaultInstance());
    }
    /**
     * <pre>
     * List of all locations and their component / status
     * </pre>
     *
     * <code>repeated .aruna.api.storage.services.v2.LocationStatus location_status = 1 [json_name = "locationStatus"];</code>
     */
    public com.aruna.api.storage.services.v2.LocationStatus.Builder addLocationStatusBuilder(
        int index) {
      return getLocationStatusFieldBuilder().addBuilder(
          index, com.aruna.api.storage.services.v2.LocationStatus.getDefaultInstance());
    }
    /**
     * <pre>
     * List of all locations and their component / status
     * </pre>
     *
     * <code>repeated .aruna.api.storage.services.v2.LocationStatus location_status = 1 [json_name = "locationStatus"];</code>
     */
    public java.util.List<com.aruna.api.storage.services.v2.LocationStatus.Builder> 
         getLocationStatusBuilderList() {
      return getLocationStatusFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.aruna.api.storage.services.v2.LocationStatus, com.aruna.api.storage.services.v2.LocationStatus.Builder, com.aruna.api.storage.services.v2.LocationStatusOrBuilder> 
        getLocationStatusFieldBuilder() {
      if (locationStatusBuilder_ == null) {
        locationStatusBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.aruna.api.storage.services.v2.LocationStatus, com.aruna.api.storage.services.v2.LocationStatus.Builder, com.aruna.api.storage.services.v2.LocationStatusOrBuilder>(
                locationStatus_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        locationStatus_ = null;
      }
      return locationStatusBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.GetStorageStatusResponse)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.GetStorageStatusResponse)
  private static final com.aruna.api.storage.services.v2.GetStorageStatusResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.GetStorageStatusResponse();
  }

  public static com.aruna.api.storage.services.v2.GetStorageStatusResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetStorageStatusResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetStorageStatusResponse>() {
    @java.lang.Override
    public GetStorageStatusResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetStorageStatusResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetStorageStatusResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.GetStorageStatusResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

