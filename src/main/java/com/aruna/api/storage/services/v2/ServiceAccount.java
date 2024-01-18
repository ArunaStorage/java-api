// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/service_account_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.ServiceAccount}
 */
public final class ServiceAccount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.ServiceAccount)
    ServiceAccountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ServiceAccount.newBuilder() to construct.
  private ServiceAccount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServiceAccount() {
    svcAccountId_ = "";
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ServiceAccount();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_ServiceAccount_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_ServiceAccount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.ServiceAccount.class, com.aruna.api.storage.services.v2.ServiceAccount.Builder.class);
  }

  private int bitField0_;
  public static final int SVC_ACCOUNT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object svcAccountId_ = "";
  /**
   * <code>string svc_account_id = 1 [json_name = "svcAccountId"];</code>
   * @return The svcAccountId.
   */
  @java.lang.Override
  public java.lang.String getSvcAccountId() {
    java.lang.Object ref = svcAccountId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      svcAccountId_ = s;
      return s;
    }
  }
  /**
   * <code>string svc_account_id = 1 [json_name = "svcAccountId"];</code>
   * @return The bytes for svcAccountId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSvcAccountIdBytes() {
    java.lang.Object ref = svcAccountId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      svcAccountId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PERMISSION_FIELD_NUMBER = 3;
  private com.aruna.api.storage.models.v2.Permission permission_;
  /**
   * <code>.aruna.api.storage.models.v2.Permission permission = 3 [json_name = "permission"];</code>
   * @return Whether the permission field is set.
   */
  @java.lang.Override
  public boolean hasPermission() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.aruna.api.storage.models.v2.Permission permission = 3 [json_name = "permission"];</code>
   * @return The permission.
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.Permission getPermission() {
    return permission_ == null ? com.aruna.api.storage.models.v2.Permission.getDefaultInstance() : permission_;
  }
  /**
   * <code>.aruna.api.storage.models.v2.Permission permission = 3 [json_name = "permission"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.PermissionOrBuilder getPermissionOrBuilder() {
    return permission_ == null ? com.aruna.api.storage.models.v2.Permission.getDefaultInstance() : permission_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(svcAccountId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, svcAccountId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getPermission());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(svcAccountId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, svcAccountId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPermission());
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.ServiceAccount)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.ServiceAccount other = (com.aruna.api.storage.services.v2.ServiceAccount) obj;

    if (!getSvcAccountId()
        .equals(other.getSvcAccountId())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (hasPermission() != other.hasPermission()) return false;
    if (hasPermission()) {
      if (!getPermission()
          .equals(other.getPermission())) return false;
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
    hash = (37 * hash) + SVC_ACCOUNT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSvcAccountId().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasPermission()) {
      hash = (37 * hash) + PERMISSION_FIELD_NUMBER;
      hash = (53 * hash) + getPermission().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.ServiceAccount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.ServiceAccount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.ServiceAccount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.ServiceAccount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.ServiceAccount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.ServiceAccount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.ServiceAccount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.ServiceAccount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.ServiceAccount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.ServiceAccount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.ServiceAccount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.ServiceAccount parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.ServiceAccount prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.ServiceAccount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.ServiceAccount)
      com.aruna.api.storage.services.v2.ServiceAccountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_ServiceAccount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_ServiceAccount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.ServiceAccount.class, com.aruna.api.storage.services.v2.ServiceAccount.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.ServiceAccount.newBuilder()
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
        getPermissionFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      svcAccountId_ = "";
      name_ = "";
      permission_ = null;
      if (permissionBuilder_ != null) {
        permissionBuilder_.dispose();
        permissionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_ServiceAccount_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.ServiceAccount getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.ServiceAccount.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.ServiceAccount build() {
      com.aruna.api.storage.services.v2.ServiceAccount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.ServiceAccount buildPartial() {
      com.aruna.api.storage.services.v2.ServiceAccount result = new com.aruna.api.storage.services.v2.ServiceAccount(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.ServiceAccount result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.svcAccountId_ = svcAccountId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.permission_ = permissionBuilder_ == null
            ? permission_
            : permissionBuilder_.build();
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
      if (other instanceof com.aruna.api.storage.services.v2.ServiceAccount) {
        return mergeFrom((com.aruna.api.storage.services.v2.ServiceAccount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.ServiceAccount other) {
      if (other == com.aruna.api.storage.services.v2.ServiceAccount.getDefaultInstance()) return this;
      if (!other.getSvcAccountId().isEmpty()) {
        svcAccountId_ = other.svcAccountId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasPermission()) {
        mergePermission(other.getPermission());
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
              svcAccountId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getPermissionFieldBuilder().getBuilder(),
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

    private java.lang.Object svcAccountId_ = "";
    /**
     * <code>string svc_account_id = 1 [json_name = "svcAccountId"];</code>
     * @return The svcAccountId.
     */
    public java.lang.String getSvcAccountId() {
      java.lang.Object ref = svcAccountId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        svcAccountId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string svc_account_id = 1 [json_name = "svcAccountId"];</code>
     * @return The bytes for svcAccountId.
     */
    public com.google.protobuf.ByteString
        getSvcAccountIdBytes() {
      java.lang.Object ref = svcAccountId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        svcAccountId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string svc_account_id = 1 [json_name = "svcAccountId"];</code>
     * @param value The svcAccountId to set.
     * @return This builder for chaining.
     */
    public Builder setSvcAccountId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      svcAccountId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string svc_account_id = 1 [json_name = "svcAccountId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSvcAccountId() {
      svcAccountId_ = getDefaultInstance().getSvcAccountId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string svc_account_id = 1 [json_name = "svcAccountId"];</code>
     * @param value The bytes for svcAccountId to set.
     * @return This builder for chaining.
     */
    public Builder setSvcAccountIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      svcAccountId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.aruna.api.storage.models.v2.Permission permission_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.storage.models.v2.Permission, com.aruna.api.storage.models.v2.Permission.Builder, com.aruna.api.storage.models.v2.PermissionOrBuilder> permissionBuilder_;
    /**
     * <code>.aruna.api.storage.models.v2.Permission permission = 3 [json_name = "permission"];</code>
     * @return Whether the permission field is set.
     */
    public boolean hasPermission() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.aruna.api.storage.models.v2.Permission permission = 3 [json_name = "permission"];</code>
     * @return The permission.
     */
    public com.aruna.api.storage.models.v2.Permission getPermission() {
      if (permissionBuilder_ == null) {
        return permission_ == null ? com.aruna.api.storage.models.v2.Permission.getDefaultInstance() : permission_;
      } else {
        return permissionBuilder_.getMessage();
      }
    }
    /**
     * <code>.aruna.api.storage.models.v2.Permission permission = 3 [json_name = "permission"];</code>
     */
    public Builder setPermission(com.aruna.api.storage.models.v2.Permission value) {
      if (permissionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        permission_ = value;
      } else {
        permissionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Permission permission = 3 [json_name = "permission"];</code>
     */
    public Builder setPermission(
        com.aruna.api.storage.models.v2.Permission.Builder builderForValue) {
      if (permissionBuilder_ == null) {
        permission_ = builderForValue.build();
      } else {
        permissionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Permission permission = 3 [json_name = "permission"];</code>
     */
    public Builder mergePermission(com.aruna.api.storage.models.v2.Permission value) {
      if (permissionBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          permission_ != null &&
          permission_ != com.aruna.api.storage.models.v2.Permission.getDefaultInstance()) {
          getPermissionBuilder().mergeFrom(value);
        } else {
          permission_ = value;
        }
      } else {
        permissionBuilder_.mergeFrom(value);
      }
      if (permission_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Permission permission = 3 [json_name = "permission"];</code>
     */
    public Builder clearPermission() {
      bitField0_ = (bitField0_ & ~0x00000004);
      permission_ = null;
      if (permissionBuilder_ != null) {
        permissionBuilder_.dispose();
        permissionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Permission permission = 3 [json_name = "permission"];</code>
     */
    public com.aruna.api.storage.models.v2.Permission.Builder getPermissionBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPermissionFieldBuilder().getBuilder();
    }
    /**
     * <code>.aruna.api.storage.models.v2.Permission permission = 3 [json_name = "permission"];</code>
     */
    public com.aruna.api.storage.models.v2.PermissionOrBuilder getPermissionOrBuilder() {
      if (permissionBuilder_ != null) {
        return permissionBuilder_.getMessageOrBuilder();
      } else {
        return permission_ == null ?
            com.aruna.api.storage.models.v2.Permission.getDefaultInstance() : permission_;
      }
    }
    /**
     * <code>.aruna.api.storage.models.v2.Permission permission = 3 [json_name = "permission"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.storage.models.v2.Permission, com.aruna.api.storage.models.v2.Permission.Builder, com.aruna.api.storage.models.v2.PermissionOrBuilder> 
        getPermissionFieldBuilder() {
      if (permissionBuilder_ == null) {
        permissionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aruna.api.storage.models.v2.Permission, com.aruna.api.storage.models.v2.Permission.Builder, com.aruna.api.storage.models.v2.PermissionOrBuilder>(
                getPermission(),
                getParentForChildren(),
                isClean());
        permission_ = null;
      }
      return permissionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.ServiceAccount)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.ServiceAccount)
  private static final com.aruna.api.storage.services.v2.ServiceAccount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.ServiceAccount();
  }

  public static com.aruna.api.storage.services.v2.ServiceAccount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServiceAccount>
      PARSER = new com.google.protobuf.AbstractParser<ServiceAccount>() {
    @java.lang.Override
    public ServiceAccount parsePartialFrom(
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

  public static com.google.protobuf.Parser<ServiceAccount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServiceAccount> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.ServiceAccount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

