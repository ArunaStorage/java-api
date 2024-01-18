// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/notification/services/v2/notification_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.notification.services.v2;

/**
 * Protobuf type {@code aruna.api.notification.services.v2.NewVersion}
 */
public final class NewVersion extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.notification.services.v2.NewVersion)
    NewVersionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NewVersion.newBuilder() to construct.
  private NewVersion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NewVersion() {
    location_ = "";
    component_ = "";
    newVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NewVersion();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.notification.services.v2.NotificationServiceProto.internal_static_aruna_api_notification_services_v2_NewVersion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.notification.services.v2.NotificationServiceProto.internal_static_aruna_api_notification_services_v2_NewVersion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.notification.services.v2.NewVersion.class, com.aruna.api.notification.services.v2.NewVersion.Builder.class);
  }

  public static final int LOCATION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object location_ = "";
  /**
   * <code>string location = 1 [json_name = "location"];</code>
   * @return The location.
   */
  @java.lang.Override
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   * <code>string location = 1 [json_name = "location"];</code>
   * @return The bytes for location.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      location_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMPONENT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object component_ = "";
  /**
   * <code>string component = 2 [json_name = "component"];</code>
   * @return The component.
   */
  @java.lang.Override
  public java.lang.String getComponent() {
    java.lang.Object ref = component_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      component_ = s;
      return s;
    }
  }
  /**
   * <code>string component = 2 [json_name = "component"];</code>
   * @return The bytes for component.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getComponentBytes() {
    java.lang.Object ref = component_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      component_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEW_VERSION_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object newVersion_ = "";
  /**
   * <code>string new_version = 3 [json_name = "newVersion"];</code>
   * @return The newVersion.
   */
  @java.lang.Override
  public java.lang.String getNewVersion() {
    java.lang.Object ref = newVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newVersion_ = s;
      return s;
    }
  }
  /**
   * <code>string new_version = 3 [json_name = "newVersion"];</code>
   * @return The bytes for newVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNewVersionBytes() {
    java.lang.Object ref = newVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newVersion_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, location_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(component_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, component_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, newVersion_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, location_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(component_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, component_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, newVersion_);
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
    if (!(obj instanceof com.aruna.api.notification.services.v2.NewVersion)) {
      return super.equals(obj);
    }
    com.aruna.api.notification.services.v2.NewVersion other = (com.aruna.api.notification.services.v2.NewVersion) obj;

    if (!getLocation()
        .equals(other.getLocation())) return false;
    if (!getComponent()
        .equals(other.getComponent())) return false;
    if (!getNewVersion()
        .equals(other.getNewVersion())) return false;
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
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    hash = (37 * hash) + COMPONENT_FIELD_NUMBER;
    hash = (53 * hash) + getComponent().hashCode();
    hash = (37 * hash) + NEW_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getNewVersion().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.notification.services.v2.NewVersion parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.notification.services.v2.NewVersion parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.notification.services.v2.NewVersion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.notification.services.v2.NewVersion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.notification.services.v2.NewVersion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.notification.services.v2.NewVersion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.notification.services.v2.NewVersion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.notification.services.v2.NewVersion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.notification.services.v2.NewVersion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.notification.services.v2.NewVersion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.notification.services.v2.NewVersion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.notification.services.v2.NewVersion parseFrom(
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
  public static Builder newBuilder(com.aruna.api.notification.services.v2.NewVersion prototype) {
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
   * Protobuf type {@code aruna.api.notification.services.v2.NewVersion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.notification.services.v2.NewVersion)
      com.aruna.api.notification.services.v2.NewVersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.notification.services.v2.NotificationServiceProto.internal_static_aruna_api_notification_services_v2_NewVersion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.notification.services.v2.NotificationServiceProto.internal_static_aruna_api_notification_services_v2_NewVersion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.notification.services.v2.NewVersion.class, com.aruna.api.notification.services.v2.NewVersion.Builder.class);
    }

    // Construct using com.aruna.api.notification.services.v2.NewVersion.newBuilder()
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
      location_ = "";
      component_ = "";
      newVersion_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.notification.services.v2.NotificationServiceProto.internal_static_aruna_api_notification_services_v2_NewVersion_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.notification.services.v2.NewVersion getDefaultInstanceForType() {
      return com.aruna.api.notification.services.v2.NewVersion.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.notification.services.v2.NewVersion build() {
      com.aruna.api.notification.services.v2.NewVersion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.notification.services.v2.NewVersion buildPartial() {
      com.aruna.api.notification.services.v2.NewVersion result = new com.aruna.api.notification.services.v2.NewVersion(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.notification.services.v2.NewVersion result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.location_ = location_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.component_ = component_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.newVersion_ = newVersion_;
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
      if (other instanceof com.aruna.api.notification.services.v2.NewVersion) {
        return mergeFrom((com.aruna.api.notification.services.v2.NewVersion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.notification.services.v2.NewVersion other) {
      if (other == com.aruna.api.notification.services.v2.NewVersion.getDefaultInstance()) return this;
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getComponent().isEmpty()) {
        component_ = other.component_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getNewVersion().isEmpty()) {
        newVersion_ = other.newVersion_;
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
              location_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              component_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              newVersion_ = input.readStringRequireUtf8();
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

    private java.lang.Object location_ = "";
    /**
     * <code>string location = 1 [json_name = "location"];</code>
     * @return The location.
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string location = 1 [json_name = "location"];</code>
     * @return The bytes for location.
     */
    public com.google.protobuf.ByteString
        getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string location = 1 [json_name = "location"];</code>
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      location_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string location = 1 [json_name = "location"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      location_ = getDefaultInstance().getLocation();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string location = 1 [json_name = "location"];</code>
     * @param value The bytes for location to set.
     * @return This builder for chaining.
     */
    public Builder setLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      location_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object component_ = "";
    /**
     * <code>string component = 2 [json_name = "component"];</code>
     * @return The component.
     */
    public java.lang.String getComponent() {
      java.lang.Object ref = component_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        component_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string component = 2 [json_name = "component"];</code>
     * @return The bytes for component.
     */
    public com.google.protobuf.ByteString
        getComponentBytes() {
      java.lang.Object ref = component_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        component_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string component = 2 [json_name = "component"];</code>
     * @param value The component to set.
     * @return This builder for chaining.
     */
    public Builder setComponent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      component_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string component = 2 [json_name = "component"];</code>
     * @return This builder for chaining.
     */
    public Builder clearComponent() {
      component_ = getDefaultInstance().getComponent();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string component = 2 [json_name = "component"];</code>
     * @param value The bytes for component to set.
     * @return This builder for chaining.
     */
    public Builder setComponentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      component_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object newVersion_ = "";
    /**
     * <code>string new_version = 3 [json_name = "newVersion"];</code>
     * @return The newVersion.
     */
    public java.lang.String getNewVersion() {
      java.lang.Object ref = newVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string new_version = 3 [json_name = "newVersion"];</code>
     * @return The bytes for newVersion.
     */
    public com.google.protobuf.ByteString
        getNewVersionBytes() {
      java.lang.Object ref = newVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string new_version = 3 [json_name = "newVersion"];</code>
     * @param value The newVersion to set.
     * @return This builder for chaining.
     */
    public Builder setNewVersion(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      newVersion_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string new_version = 3 [json_name = "newVersion"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNewVersion() {
      newVersion_ = getDefaultInstance().getNewVersion();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string new_version = 3 [json_name = "newVersion"];</code>
     * @param value The bytes for newVersion to set.
     * @return This builder for chaining.
     */
    public Builder setNewVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      newVersion_ = value;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.notification.services.v2.NewVersion)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.notification.services.v2.NewVersion)
  private static final com.aruna.api.notification.services.v2.NewVersion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.notification.services.v2.NewVersion();
  }

  public static com.aruna.api.notification.services.v2.NewVersion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NewVersion>
      PARSER = new com.google.protobuf.AbstractParser<NewVersion>() {
    @java.lang.Override
    public NewVersion parsePartialFrom(
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

  public static com.google.protobuf.Parser<NewVersion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NewVersion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.notification.services.v2.NewVersion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

