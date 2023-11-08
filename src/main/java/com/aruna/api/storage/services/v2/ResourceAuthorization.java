// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/authorization_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.ResourceAuthorization}
 */
public final class ResourceAuthorization extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.ResourceAuthorization)
    ResourceAuthorizationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResourceAuthorization.newBuilder() to construct.
  private ResourceAuthorization(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResourceAuthorization() {
    resourceId_ = "";
    userPermission_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResourceAuthorization();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.AuthorizationServiceProto.internal_static_aruna_api_storage_services_v2_ResourceAuthorization_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.AuthorizationServiceProto.internal_static_aruna_api_storage_services_v2_ResourceAuthorization_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.ResourceAuthorization.class, com.aruna.api.storage.services.v2.ResourceAuthorization.Builder.class);
  }

  public static final int RESOURCE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceId_ = "";
  /**
   * <code>string resource_id = 1 [json_name = "resourceId"];</code>
   * @return The resourceId.
   */
  @java.lang.Override
  public java.lang.String getResourceId() {
    java.lang.Object ref = resourceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceId_ = s;
      return s;
    }
  }
  /**
   * <code>string resource_id = 1 [json_name = "resourceId"];</code>
   * @return The bytes for resourceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceIdBytes() {
    java.lang.Object ref = resourceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_PERMISSION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.aruna.api.storage.services.v2.UserPermission> userPermission_;
  /**
   * <code>repeated .aruna.api.storage.services.v2.UserPermission user_permission = 2 [json_name = "userPermission"];</code>
   */
  @java.lang.Override
  public java.util.List<com.aruna.api.storage.services.v2.UserPermission> getUserPermissionList() {
    return userPermission_;
  }
  /**
   * <code>repeated .aruna.api.storage.services.v2.UserPermission user_permission = 2 [json_name = "userPermission"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.aruna.api.storage.services.v2.UserPermissionOrBuilder> 
      getUserPermissionOrBuilderList() {
    return userPermission_;
  }
  /**
   * <code>repeated .aruna.api.storage.services.v2.UserPermission user_permission = 2 [json_name = "userPermission"];</code>
   */
  @java.lang.Override
  public int getUserPermissionCount() {
    return userPermission_.size();
  }
  /**
   * <code>repeated .aruna.api.storage.services.v2.UserPermission user_permission = 2 [json_name = "userPermission"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.services.v2.UserPermission getUserPermission(int index) {
    return userPermission_.get(index);
  }
  /**
   * <code>repeated .aruna.api.storage.services.v2.UserPermission user_permission = 2 [json_name = "userPermission"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.services.v2.UserPermissionOrBuilder getUserPermissionOrBuilder(
      int index) {
    return userPermission_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceId_);
    }
    for (int i = 0; i < userPermission_.size(); i++) {
      output.writeMessage(2, userPermission_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceId_);
    }
    for (int i = 0; i < userPermission_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, userPermission_.get(i));
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.ResourceAuthorization)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.ResourceAuthorization other = (com.aruna.api.storage.services.v2.ResourceAuthorization) obj;

    if (!getResourceId()
        .equals(other.getResourceId())) return false;
    if (!getUserPermissionList()
        .equals(other.getUserPermissionList())) return false;
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
    hash = (37 * hash) + RESOURCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getResourceId().hashCode();
    if (getUserPermissionCount() > 0) {
      hash = (37 * hash) + USER_PERMISSION_FIELD_NUMBER;
      hash = (53 * hash) + getUserPermissionList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.ResourceAuthorization parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.ResourceAuthorization parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.ResourceAuthorization parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.ResourceAuthorization parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.ResourceAuthorization parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.ResourceAuthorization parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.ResourceAuthorization parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.ResourceAuthorization parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.ResourceAuthorization parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.ResourceAuthorization parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.ResourceAuthorization parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.ResourceAuthorization parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.ResourceAuthorization prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.ResourceAuthorization}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.ResourceAuthorization)
      com.aruna.api.storage.services.v2.ResourceAuthorizationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.AuthorizationServiceProto.internal_static_aruna_api_storage_services_v2_ResourceAuthorization_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.AuthorizationServiceProto.internal_static_aruna_api_storage_services_v2_ResourceAuthorization_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.ResourceAuthorization.class, com.aruna.api.storage.services.v2.ResourceAuthorization.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.ResourceAuthorization.newBuilder()
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
      resourceId_ = "";
      if (userPermissionBuilder_ == null) {
        userPermission_ = java.util.Collections.emptyList();
      } else {
        userPermission_ = null;
        userPermissionBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.AuthorizationServiceProto.internal_static_aruna_api_storage_services_v2_ResourceAuthorization_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.ResourceAuthorization getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.ResourceAuthorization.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.ResourceAuthorization build() {
      com.aruna.api.storage.services.v2.ResourceAuthorization result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.ResourceAuthorization buildPartial() {
      com.aruna.api.storage.services.v2.ResourceAuthorization result = new com.aruna.api.storage.services.v2.ResourceAuthorization(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.aruna.api.storage.services.v2.ResourceAuthorization result) {
      if (userPermissionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          userPermission_ = java.util.Collections.unmodifiableList(userPermission_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.userPermission_ = userPermission_;
      } else {
        result.userPermission_ = userPermissionBuilder_.build();
      }
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.ResourceAuthorization result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceId_ = resourceId_;
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
      if (other instanceof com.aruna.api.storage.services.v2.ResourceAuthorization) {
        return mergeFrom((com.aruna.api.storage.services.v2.ResourceAuthorization)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.ResourceAuthorization other) {
      if (other == com.aruna.api.storage.services.v2.ResourceAuthorization.getDefaultInstance()) return this;
      if (!other.getResourceId().isEmpty()) {
        resourceId_ = other.resourceId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (userPermissionBuilder_ == null) {
        if (!other.userPermission_.isEmpty()) {
          if (userPermission_.isEmpty()) {
            userPermission_ = other.userPermission_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureUserPermissionIsMutable();
            userPermission_.addAll(other.userPermission_);
          }
          onChanged();
        }
      } else {
        if (!other.userPermission_.isEmpty()) {
          if (userPermissionBuilder_.isEmpty()) {
            userPermissionBuilder_.dispose();
            userPermissionBuilder_ = null;
            userPermission_ = other.userPermission_;
            bitField0_ = (bitField0_ & ~0x00000002);
            userPermissionBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUserPermissionFieldBuilder() : null;
          } else {
            userPermissionBuilder_.addAllMessages(other.userPermission_);
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
              resourceId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.aruna.api.storage.services.v2.UserPermission m =
                  input.readMessage(
                      com.aruna.api.storage.services.v2.UserPermission.parser(),
                      extensionRegistry);
              if (userPermissionBuilder_ == null) {
                ensureUserPermissionIsMutable();
                userPermission_.add(m);
              } else {
                userPermissionBuilder_.addMessage(m);
              }
              break;
            } // case 18
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

    private java.lang.Object resourceId_ = "";
    /**
     * <code>string resource_id = 1 [json_name = "resourceId"];</code>
     * @return The resourceId.
     */
    public java.lang.String getResourceId() {
      java.lang.Object ref = resourceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string resource_id = 1 [json_name = "resourceId"];</code>
     * @return The bytes for resourceId.
     */
    public com.google.protobuf.ByteString
        getResourceIdBytes() {
      java.lang.Object ref = resourceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string resource_id = 1 [json_name = "resourceId"];</code>
     * @param value The resourceId to set.
     * @return This builder for chaining.
     */
    public Builder setResourceId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      resourceId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string resource_id = 1 [json_name = "resourceId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceId() {
      resourceId_ = getDefaultInstance().getResourceId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string resource_id = 1 [json_name = "resourceId"];</code>
     * @param value The bytes for resourceId to set.
     * @return This builder for chaining.
     */
    public Builder setResourceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      resourceId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.aruna.api.storage.services.v2.UserPermission> userPermission_ =
      java.util.Collections.emptyList();
    private void ensureUserPermissionIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        userPermission_ = new java.util.ArrayList<com.aruna.api.storage.services.v2.UserPermission>(userPermission_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aruna.api.storage.services.v2.UserPermission, com.aruna.api.storage.services.v2.UserPermission.Builder, com.aruna.api.storage.services.v2.UserPermissionOrBuilder> userPermissionBuilder_;

    /**
     * <code>repeated .aruna.api.storage.services.v2.UserPermission user_permission = 2 [json_name = "userPermission"];</code>
     */
    public java.util.List<com.aruna.api.storage.services.v2.UserPermission> getUserPermissionList() {
      if (userPermissionBuilder_ == null) {
        return java.util.Collections.unmodifiableList(userPermission_);
      } else {
        return userPermissionBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.UserPermission user_permission = 2 [json_name = "userPermission"];</code>
     */
    public int getUserPermissionCount() {
      if (userPermissionBuilder_ == null) {
        return userPermission_.size();
      } else {
        return userPermissionBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.UserPermission user_permission = 2 [json_name = "userPermission"];</code>
     */
    public com.aruna.api.storage.services.v2.UserPermission getUserPermission(int index) {
      if (userPermissionBuilder_ == null) {
        return userPermission_.get(index);
      } else {
        return userPermissionBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.UserPermission user_permission = 2 [json_name = "userPermission"];</code>
     */
    public Builder setUserPermission(
        int index, com.aruna.api.storage.services.v2.UserPermission value) {
      if (userPermissionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserPermissionIsMutable();
        userPermission_.set(index, value);
        onChanged();
      } else {
        userPermissionBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.UserPermission user_permission = 2 [json_name = "userPermission"];</code>
     */
    public Builder setUserPermission(
        int index, com.aruna.api.storage.services.v2.UserPermission.Builder builderForValue) {
      if (userPermissionBuilder_ == null) {
        ensureUserPermissionIsMutable();
        userPermission_.set(index, builderForValue.build());
        onChanged();
      } else {
        userPermissionBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.UserPermission user_permission = 2 [json_name = "userPermission"];</code>
     */
    public Builder addUserPermission(com.aruna.api.storage.services.v2.UserPermission value) {
      if (userPermissionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserPermissionIsMutable();
        userPermission_.add(value);
        onChanged();
      } else {
        userPermissionBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.UserPermission user_permission = 2 [json_name = "userPermission"];</code>
     */
    public Builder addUserPermission(
        int index, com.aruna.api.storage.services.v2.UserPermission value) {
      if (userPermissionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserPermissionIsMutable();
        userPermission_.add(index, value);
        onChanged();
      } else {
        userPermissionBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.UserPermission user_permission = 2 [json_name = "userPermission"];</code>
     */
    public Builder addUserPermission(
        com.aruna.api.storage.services.v2.UserPermission.Builder builderForValue) {
      if (userPermissionBuilder_ == null) {
        ensureUserPermissionIsMutable();
        userPermission_.add(builderForValue.build());
        onChanged();
      } else {
        userPermissionBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.UserPermission user_permission = 2 [json_name = "userPermission"];</code>
     */
    public Builder addUserPermission(
        int index, com.aruna.api.storage.services.v2.UserPermission.Builder builderForValue) {
      if (userPermissionBuilder_ == null) {
        ensureUserPermissionIsMutable();
        userPermission_.add(index, builderForValue.build());
        onChanged();
      } else {
        userPermissionBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.UserPermission user_permission = 2 [json_name = "userPermission"];</code>
     */
    public Builder addAllUserPermission(
        java.lang.Iterable<? extends com.aruna.api.storage.services.v2.UserPermission> values) {
      if (userPermissionBuilder_ == null) {
        ensureUserPermissionIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, userPermission_);
        onChanged();
      } else {
        userPermissionBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.UserPermission user_permission = 2 [json_name = "userPermission"];</code>
     */
    public Builder clearUserPermission() {
      if (userPermissionBuilder_ == null) {
        userPermission_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        userPermissionBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.UserPermission user_permission = 2 [json_name = "userPermission"];</code>
     */
    public Builder removeUserPermission(int index) {
      if (userPermissionBuilder_ == null) {
        ensureUserPermissionIsMutable();
        userPermission_.remove(index);
        onChanged();
      } else {
        userPermissionBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.UserPermission user_permission = 2 [json_name = "userPermission"];</code>
     */
    public com.aruna.api.storage.services.v2.UserPermission.Builder getUserPermissionBuilder(
        int index) {
      return getUserPermissionFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.UserPermission user_permission = 2 [json_name = "userPermission"];</code>
     */
    public com.aruna.api.storage.services.v2.UserPermissionOrBuilder getUserPermissionOrBuilder(
        int index) {
      if (userPermissionBuilder_ == null) {
        return userPermission_.get(index);  } else {
        return userPermissionBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.UserPermission user_permission = 2 [json_name = "userPermission"];</code>
     */
    public java.util.List<? extends com.aruna.api.storage.services.v2.UserPermissionOrBuilder> 
         getUserPermissionOrBuilderList() {
      if (userPermissionBuilder_ != null) {
        return userPermissionBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(userPermission_);
      }
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.UserPermission user_permission = 2 [json_name = "userPermission"];</code>
     */
    public com.aruna.api.storage.services.v2.UserPermission.Builder addUserPermissionBuilder() {
      return getUserPermissionFieldBuilder().addBuilder(
          com.aruna.api.storage.services.v2.UserPermission.getDefaultInstance());
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.UserPermission user_permission = 2 [json_name = "userPermission"];</code>
     */
    public com.aruna.api.storage.services.v2.UserPermission.Builder addUserPermissionBuilder(
        int index) {
      return getUserPermissionFieldBuilder().addBuilder(
          index, com.aruna.api.storage.services.v2.UserPermission.getDefaultInstance());
    }
    /**
     * <code>repeated .aruna.api.storage.services.v2.UserPermission user_permission = 2 [json_name = "userPermission"];</code>
     */
    public java.util.List<com.aruna.api.storage.services.v2.UserPermission.Builder> 
         getUserPermissionBuilderList() {
      return getUserPermissionFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aruna.api.storage.services.v2.UserPermission, com.aruna.api.storage.services.v2.UserPermission.Builder, com.aruna.api.storage.services.v2.UserPermissionOrBuilder> 
        getUserPermissionFieldBuilder() {
      if (userPermissionBuilder_ == null) {
        userPermissionBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.aruna.api.storage.services.v2.UserPermission, com.aruna.api.storage.services.v2.UserPermission.Builder, com.aruna.api.storage.services.v2.UserPermissionOrBuilder>(
                userPermission_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        userPermission_ = null;
      }
      return userPermissionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.ResourceAuthorization)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.ResourceAuthorization)
  private static final com.aruna.api.storage.services.v2.ResourceAuthorization DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.ResourceAuthorization();
  }

  public static com.aruna.api.storage.services.v2.ResourceAuthorization getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceAuthorization>
      PARSER = new com.google.protobuf.AbstractParser<ResourceAuthorization>() {
    @java.lang.Override
    public ResourceAuthorization parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResourceAuthorization> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceAuthorization> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.ResourceAuthorization getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
