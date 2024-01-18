// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/endpoint_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.FullSyncEndpointResponse}
 */
public final class FullSyncEndpointResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.FullSyncEndpointResponse)
    FullSyncEndpointResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FullSyncEndpointResponse.newBuilder() to construct.
  private FullSyncEndpointResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FullSyncEndpointResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FullSyncEndpointResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.EndpointServiceProto.internal_static_aruna_api_storage_services_v2_FullSyncEndpointResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.EndpointServiceProto.internal_static_aruna_api_storage_services_v2_FullSyncEndpointResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.FullSyncEndpointResponse.class, com.aruna.api.storage.services.v2.FullSyncEndpointResponse.Builder.class);
  }

  private int targetCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object target_;
  public enum TargetCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GENERIC_RESOURCE(1),
    USER(2),
    PUBKEY(3),
    TARGET_NOT_SET(0);
    private final int value;
    private TargetCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TargetCase valueOf(int value) {
      return forNumber(value);
    }

    public static TargetCase forNumber(int value) {
      switch (value) {
        case 1: return GENERIC_RESOURCE;
        case 2: return USER;
        case 3: return PUBKEY;
        case 0: return TARGET_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TargetCase
  getTargetCase() {
    return TargetCase.forNumber(
        targetCase_);
  }

  public static final int GENERIC_RESOURCE_FIELD_NUMBER = 1;
  /**
   * <code>.aruna.api.storage.models.v2.GenericResource generic_resource = 1 [json_name = "genericResource"];</code>
   * @return Whether the genericResource field is set.
   */
  @java.lang.Override
  public boolean hasGenericResource() {
    return targetCase_ == 1;
  }
  /**
   * <code>.aruna.api.storage.models.v2.GenericResource generic_resource = 1 [json_name = "genericResource"];</code>
   * @return The genericResource.
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.GenericResource getGenericResource() {
    if (targetCase_ == 1) {
       return (com.aruna.api.storage.models.v2.GenericResource) target_;
    }
    return com.aruna.api.storage.models.v2.GenericResource.getDefaultInstance();
  }
  /**
   * <code>.aruna.api.storage.models.v2.GenericResource generic_resource = 1 [json_name = "genericResource"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.GenericResourceOrBuilder getGenericResourceOrBuilder() {
    if (targetCase_ == 1) {
       return (com.aruna.api.storage.models.v2.GenericResource) target_;
    }
    return com.aruna.api.storage.models.v2.GenericResource.getDefaultInstance();
  }

  public static final int USER_FIELD_NUMBER = 2;
  /**
   * <code>.aruna.api.storage.models.v2.User user = 2 [json_name = "user"];</code>
   * @return Whether the user field is set.
   */
  @java.lang.Override
  public boolean hasUser() {
    return targetCase_ == 2;
  }
  /**
   * <code>.aruna.api.storage.models.v2.User user = 2 [json_name = "user"];</code>
   * @return The user.
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.User getUser() {
    if (targetCase_ == 2) {
       return (com.aruna.api.storage.models.v2.User) target_;
    }
    return com.aruna.api.storage.models.v2.User.getDefaultInstance();
  }
  /**
   * <code>.aruna.api.storage.models.v2.User user = 2 [json_name = "user"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.UserOrBuilder getUserOrBuilder() {
    if (targetCase_ == 2) {
       return (com.aruna.api.storage.models.v2.User) target_;
    }
    return com.aruna.api.storage.models.v2.User.getDefaultInstance();
  }

  public static final int PUBKEY_FIELD_NUMBER = 3;
  /**
   * <code>.aruna.api.storage.models.v2.Pubkey pubkey = 3 [json_name = "pubkey"];</code>
   * @return Whether the pubkey field is set.
   */
  @java.lang.Override
  public boolean hasPubkey() {
    return targetCase_ == 3;
  }
  /**
   * <code>.aruna.api.storage.models.v2.Pubkey pubkey = 3 [json_name = "pubkey"];</code>
   * @return The pubkey.
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.Pubkey getPubkey() {
    if (targetCase_ == 3) {
       return (com.aruna.api.storage.models.v2.Pubkey) target_;
    }
    return com.aruna.api.storage.models.v2.Pubkey.getDefaultInstance();
  }
  /**
   * <code>.aruna.api.storage.models.v2.Pubkey pubkey = 3 [json_name = "pubkey"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.PubkeyOrBuilder getPubkeyOrBuilder() {
    if (targetCase_ == 3) {
       return (com.aruna.api.storage.models.v2.Pubkey) target_;
    }
    return com.aruna.api.storage.models.v2.Pubkey.getDefaultInstance();
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
    if (targetCase_ == 1) {
      output.writeMessage(1, (com.aruna.api.storage.models.v2.GenericResource) target_);
    }
    if (targetCase_ == 2) {
      output.writeMessage(2, (com.aruna.api.storage.models.v2.User) target_);
    }
    if (targetCase_ == 3) {
      output.writeMessage(3, (com.aruna.api.storage.models.v2.Pubkey) target_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (targetCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.aruna.api.storage.models.v2.GenericResource) target_);
    }
    if (targetCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.aruna.api.storage.models.v2.User) target_);
    }
    if (targetCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (com.aruna.api.storage.models.v2.Pubkey) target_);
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.FullSyncEndpointResponse)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.FullSyncEndpointResponse other = (com.aruna.api.storage.services.v2.FullSyncEndpointResponse) obj;

    if (!getTargetCase().equals(other.getTargetCase())) return false;
    switch (targetCase_) {
      case 1:
        if (!getGenericResource()
            .equals(other.getGenericResource())) return false;
        break;
      case 2:
        if (!getUser()
            .equals(other.getUser())) return false;
        break;
      case 3:
        if (!getPubkey()
            .equals(other.getPubkey())) return false;
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
    switch (targetCase_) {
      case 1:
        hash = (37 * hash) + GENERIC_RESOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getGenericResource().hashCode();
        break;
      case 2:
        hash = (37 * hash) + USER_FIELD_NUMBER;
        hash = (53 * hash) + getUser().hashCode();
        break;
      case 3:
        hash = (37 * hash) + PUBKEY_FIELD_NUMBER;
        hash = (53 * hash) + getPubkey().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.FullSyncEndpointResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.FullSyncEndpointResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.FullSyncEndpointResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.FullSyncEndpointResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.FullSyncEndpointResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.FullSyncEndpointResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.FullSyncEndpointResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.FullSyncEndpointResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.FullSyncEndpointResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.FullSyncEndpointResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.FullSyncEndpointResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.FullSyncEndpointResponse parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.FullSyncEndpointResponse prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.FullSyncEndpointResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.FullSyncEndpointResponse)
      com.aruna.api.storage.services.v2.FullSyncEndpointResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.EndpointServiceProto.internal_static_aruna_api_storage_services_v2_FullSyncEndpointResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.EndpointServiceProto.internal_static_aruna_api_storage_services_v2_FullSyncEndpointResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.FullSyncEndpointResponse.class, com.aruna.api.storage.services.v2.FullSyncEndpointResponse.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.FullSyncEndpointResponse.newBuilder()
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
      if (genericResourceBuilder_ != null) {
        genericResourceBuilder_.clear();
      }
      if (userBuilder_ != null) {
        userBuilder_.clear();
      }
      if (pubkeyBuilder_ != null) {
        pubkeyBuilder_.clear();
      }
      targetCase_ = 0;
      target_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.EndpointServiceProto.internal_static_aruna_api_storage_services_v2_FullSyncEndpointResponse_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.FullSyncEndpointResponse getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.FullSyncEndpointResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.FullSyncEndpointResponse build() {
      com.aruna.api.storage.services.v2.FullSyncEndpointResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.FullSyncEndpointResponse buildPartial() {
      com.aruna.api.storage.services.v2.FullSyncEndpointResponse result = new com.aruna.api.storage.services.v2.FullSyncEndpointResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.FullSyncEndpointResponse result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.aruna.api.storage.services.v2.FullSyncEndpointResponse result) {
      result.targetCase_ = targetCase_;
      result.target_ = this.target_;
      if (targetCase_ == 1 &&
          genericResourceBuilder_ != null) {
        result.target_ = genericResourceBuilder_.build();
      }
      if (targetCase_ == 2 &&
          userBuilder_ != null) {
        result.target_ = userBuilder_.build();
      }
      if (targetCase_ == 3 &&
          pubkeyBuilder_ != null) {
        result.target_ = pubkeyBuilder_.build();
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
      if (other instanceof com.aruna.api.storage.services.v2.FullSyncEndpointResponse) {
        return mergeFrom((com.aruna.api.storage.services.v2.FullSyncEndpointResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.FullSyncEndpointResponse other) {
      if (other == com.aruna.api.storage.services.v2.FullSyncEndpointResponse.getDefaultInstance()) return this;
      switch (other.getTargetCase()) {
        case GENERIC_RESOURCE: {
          mergeGenericResource(other.getGenericResource());
          break;
        }
        case USER: {
          mergeUser(other.getUser());
          break;
        }
        case PUBKEY: {
          mergePubkey(other.getPubkey());
          break;
        }
        case TARGET_NOT_SET: {
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
                  getGenericResourceFieldBuilder().getBuilder(),
                  extensionRegistry);
              targetCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUserFieldBuilder().getBuilder(),
                  extensionRegistry);
              targetCase_ = 2;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getPubkeyFieldBuilder().getBuilder(),
                  extensionRegistry);
              targetCase_ = 3;
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
    private int targetCase_ = 0;
    private java.lang.Object target_;
    public TargetCase
        getTargetCase() {
      return TargetCase.forNumber(
          targetCase_);
    }

    public Builder clearTarget() {
      targetCase_ = 0;
      target_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.storage.models.v2.GenericResource, com.aruna.api.storage.models.v2.GenericResource.Builder, com.aruna.api.storage.models.v2.GenericResourceOrBuilder> genericResourceBuilder_;
    /**
     * <code>.aruna.api.storage.models.v2.GenericResource generic_resource = 1 [json_name = "genericResource"];</code>
     * @return Whether the genericResource field is set.
     */
    @java.lang.Override
    public boolean hasGenericResource() {
      return targetCase_ == 1;
    }
    /**
     * <code>.aruna.api.storage.models.v2.GenericResource generic_resource = 1 [json_name = "genericResource"];</code>
     * @return The genericResource.
     */
    @java.lang.Override
    public com.aruna.api.storage.models.v2.GenericResource getGenericResource() {
      if (genericResourceBuilder_ == null) {
        if (targetCase_ == 1) {
          return (com.aruna.api.storage.models.v2.GenericResource) target_;
        }
        return com.aruna.api.storage.models.v2.GenericResource.getDefaultInstance();
      } else {
        if (targetCase_ == 1) {
          return genericResourceBuilder_.getMessage();
        }
        return com.aruna.api.storage.models.v2.GenericResource.getDefaultInstance();
      }
    }
    /**
     * <code>.aruna.api.storage.models.v2.GenericResource generic_resource = 1 [json_name = "genericResource"];</code>
     */
    public Builder setGenericResource(com.aruna.api.storage.models.v2.GenericResource value) {
      if (genericResourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        target_ = value;
        onChanged();
      } else {
        genericResourceBuilder_.setMessage(value);
      }
      targetCase_ = 1;
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.GenericResource generic_resource = 1 [json_name = "genericResource"];</code>
     */
    public Builder setGenericResource(
        com.aruna.api.storage.models.v2.GenericResource.Builder builderForValue) {
      if (genericResourceBuilder_ == null) {
        target_ = builderForValue.build();
        onChanged();
      } else {
        genericResourceBuilder_.setMessage(builderForValue.build());
      }
      targetCase_ = 1;
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.GenericResource generic_resource = 1 [json_name = "genericResource"];</code>
     */
    public Builder mergeGenericResource(com.aruna.api.storage.models.v2.GenericResource value) {
      if (genericResourceBuilder_ == null) {
        if (targetCase_ == 1 &&
            target_ != com.aruna.api.storage.models.v2.GenericResource.getDefaultInstance()) {
          target_ = com.aruna.api.storage.models.v2.GenericResource.newBuilder((com.aruna.api.storage.models.v2.GenericResource) target_)
              .mergeFrom(value).buildPartial();
        } else {
          target_ = value;
        }
        onChanged();
      } else {
        if (targetCase_ == 1) {
          genericResourceBuilder_.mergeFrom(value);
        } else {
          genericResourceBuilder_.setMessage(value);
        }
      }
      targetCase_ = 1;
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.GenericResource generic_resource = 1 [json_name = "genericResource"];</code>
     */
    public Builder clearGenericResource() {
      if (genericResourceBuilder_ == null) {
        if (targetCase_ == 1) {
          targetCase_ = 0;
          target_ = null;
          onChanged();
        }
      } else {
        if (targetCase_ == 1) {
          targetCase_ = 0;
          target_ = null;
        }
        genericResourceBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.GenericResource generic_resource = 1 [json_name = "genericResource"];</code>
     */
    public com.aruna.api.storage.models.v2.GenericResource.Builder getGenericResourceBuilder() {
      return getGenericResourceFieldBuilder().getBuilder();
    }
    /**
     * <code>.aruna.api.storage.models.v2.GenericResource generic_resource = 1 [json_name = "genericResource"];</code>
     */
    @java.lang.Override
    public com.aruna.api.storage.models.v2.GenericResourceOrBuilder getGenericResourceOrBuilder() {
      if ((targetCase_ == 1) && (genericResourceBuilder_ != null)) {
        return genericResourceBuilder_.getMessageOrBuilder();
      } else {
        if (targetCase_ == 1) {
          return (com.aruna.api.storage.models.v2.GenericResource) target_;
        }
        return com.aruna.api.storage.models.v2.GenericResource.getDefaultInstance();
      }
    }
    /**
     * <code>.aruna.api.storage.models.v2.GenericResource generic_resource = 1 [json_name = "genericResource"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.storage.models.v2.GenericResource, com.aruna.api.storage.models.v2.GenericResource.Builder, com.aruna.api.storage.models.v2.GenericResourceOrBuilder> 
        getGenericResourceFieldBuilder() {
      if (genericResourceBuilder_ == null) {
        if (!(targetCase_ == 1)) {
          target_ = com.aruna.api.storage.models.v2.GenericResource.getDefaultInstance();
        }
        genericResourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aruna.api.storage.models.v2.GenericResource, com.aruna.api.storage.models.v2.GenericResource.Builder, com.aruna.api.storage.models.v2.GenericResourceOrBuilder>(
                (com.aruna.api.storage.models.v2.GenericResource) target_,
                getParentForChildren(),
                isClean());
        target_ = null;
      }
      targetCase_ = 1;
      onChanged();
      return genericResourceBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.storage.models.v2.User, com.aruna.api.storage.models.v2.User.Builder, com.aruna.api.storage.models.v2.UserOrBuilder> userBuilder_;
    /**
     * <code>.aruna.api.storage.models.v2.User user = 2 [json_name = "user"];</code>
     * @return Whether the user field is set.
     */
    @java.lang.Override
    public boolean hasUser() {
      return targetCase_ == 2;
    }
    /**
     * <code>.aruna.api.storage.models.v2.User user = 2 [json_name = "user"];</code>
     * @return The user.
     */
    @java.lang.Override
    public com.aruna.api.storage.models.v2.User getUser() {
      if (userBuilder_ == null) {
        if (targetCase_ == 2) {
          return (com.aruna.api.storage.models.v2.User) target_;
        }
        return com.aruna.api.storage.models.v2.User.getDefaultInstance();
      } else {
        if (targetCase_ == 2) {
          return userBuilder_.getMessage();
        }
        return com.aruna.api.storage.models.v2.User.getDefaultInstance();
      }
    }
    /**
     * <code>.aruna.api.storage.models.v2.User user = 2 [json_name = "user"];</code>
     */
    public Builder setUser(com.aruna.api.storage.models.v2.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        target_ = value;
        onChanged();
      } else {
        userBuilder_.setMessage(value);
      }
      targetCase_ = 2;
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.User user = 2 [json_name = "user"];</code>
     */
    public Builder setUser(
        com.aruna.api.storage.models.v2.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        target_ = builderForValue.build();
        onChanged();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }
      targetCase_ = 2;
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.User user = 2 [json_name = "user"];</code>
     */
    public Builder mergeUser(com.aruna.api.storage.models.v2.User value) {
      if (userBuilder_ == null) {
        if (targetCase_ == 2 &&
            target_ != com.aruna.api.storage.models.v2.User.getDefaultInstance()) {
          target_ = com.aruna.api.storage.models.v2.User.newBuilder((com.aruna.api.storage.models.v2.User) target_)
              .mergeFrom(value).buildPartial();
        } else {
          target_ = value;
        }
        onChanged();
      } else {
        if (targetCase_ == 2) {
          userBuilder_.mergeFrom(value);
        } else {
          userBuilder_.setMessage(value);
        }
      }
      targetCase_ = 2;
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.User user = 2 [json_name = "user"];</code>
     */
    public Builder clearUser() {
      if (userBuilder_ == null) {
        if (targetCase_ == 2) {
          targetCase_ = 0;
          target_ = null;
          onChanged();
        }
      } else {
        if (targetCase_ == 2) {
          targetCase_ = 0;
          target_ = null;
        }
        userBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.User user = 2 [json_name = "user"];</code>
     */
    public com.aruna.api.storage.models.v2.User.Builder getUserBuilder() {
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <code>.aruna.api.storage.models.v2.User user = 2 [json_name = "user"];</code>
     */
    @java.lang.Override
    public com.aruna.api.storage.models.v2.UserOrBuilder getUserOrBuilder() {
      if ((targetCase_ == 2) && (userBuilder_ != null)) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        if (targetCase_ == 2) {
          return (com.aruna.api.storage.models.v2.User) target_;
        }
        return com.aruna.api.storage.models.v2.User.getDefaultInstance();
      }
    }
    /**
     * <code>.aruna.api.storage.models.v2.User user = 2 [json_name = "user"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.storage.models.v2.User, com.aruna.api.storage.models.v2.User.Builder, com.aruna.api.storage.models.v2.UserOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        if (!(targetCase_ == 2)) {
          target_ = com.aruna.api.storage.models.v2.User.getDefaultInstance();
        }
        userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aruna.api.storage.models.v2.User, com.aruna.api.storage.models.v2.User.Builder, com.aruna.api.storage.models.v2.UserOrBuilder>(
                (com.aruna.api.storage.models.v2.User) target_,
                getParentForChildren(),
                isClean());
        target_ = null;
      }
      targetCase_ = 2;
      onChanged();
      return userBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.storage.models.v2.Pubkey, com.aruna.api.storage.models.v2.Pubkey.Builder, com.aruna.api.storage.models.v2.PubkeyOrBuilder> pubkeyBuilder_;
    /**
     * <code>.aruna.api.storage.models.v2.Pubkey pubkey = 3 [json_name = "pubkey"];</code>
     * @return Whether the pubkey field is set.
     */
    @java.lang.Override
    public boolean hasPubkey() {
      return targetCase_ == 3;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Pubkey pubkey = 3 [json_name = "pubkey"];</code>
     * @return The pubkey.
     */
    @java.lang.Override
    public com.aruna.api.storage.models.v2.Pubkey getPubkey() {
      if (pubkeyBuilder_ == null) {
        if (targetCase_ == 3) {
          return (com.aruna.api.storage.models.v2.Pubkey) target_;
        }
        return com.aruna.api.storage.models.v2.Pubkey.getDefaultInstance();
      } else {
        if (targetCase_ == 3) {
          return pubkeyBuilder_.getMessage();
        }
        return com.aruna.api.storage.models.v2.Pubkey.getDefaultInstance();
      }
    }
    /**
     * <code>.aruna.api.storage.models.v2.Pubkey pubkey = 3 [json_name = "pubkey"];</code>
     */
    public Builder setPubkey(com.aruna.api.storage.models.v2.Pubkey value) {
      if (pubkeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        target_ = value;
        onChanged();
      } else {
        pubkeyBuilder_.setMessage(value);
      }
      targetCase_ = 3;
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Pubkey pubkey = 3 [json_name = "pubkey"];</code>
     */
    public Builder setPubkey(
        com.aruna.api.storage.models.v2.Pubkey.Builder builderForValue) {
      if (pubkeyBuilder_ == null) {
        target_ = builderForValue.build();
        onChanged();
      } else {
        pubkeyBuilder_.setMessage(builderForValue.build());
      }
      targetCase_ = 3;
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Pubkey pubkey = 3 [json_name = "pubkey"];</code>
     */
    public Builder mergePubkey(com.aruna.api.storage.models.v2.Pubkey value) {
      if (pubkeyBuilder_ == null) {
        if (targetCase_ == 3 &&
            target_ != com.aruna.api.storage.models.v2.Pubkey.getDefaultInstance()) {
          target_ = com.aruna.api.storage.models.v2.Pubkey.newBuilder((com.aruna.api.storage.models.v2.Pubkey) target_)
              .mergeFrom(value).buildPartial();
        } else {
          target_ = value;
        }
        onChanged();
      } else {
        if (targetCase_ == 3) {
          pubkeyBuilder_.mergeFrom(value);
        } else {
          pubkeyBuilder_.setMessage(value);
        }
      }
      targetCase_ = 3;
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Pubkey pubkey = 3 [json_name = "pubkey"];</code>
     */
    public Builder clearPubkey() {
      if (pubkeyBuilder_ == null) {
        if (targetCase_ == 3) {
          targetCase_ = 0;
          target_ = null;
          onChanged();
        }
      } else {
        if (targetCase_ == 3) {
          targetCase_ = 0;
          target_ = null;
        }
        pubkeyBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Pubkey pubkey = 3 [json_name = "pubkey"];</code>
     */
    public com.aruna.api.storage.models.v2.Pubkey.Builder getPubkeyBuilder() {
      return getPubkeyFieldBuilder().getBuilder();
    }
    /**
     * <code>.aruna.api.storage.models.v2.Pubkey pubkey = 3 [json_name = "pubkey"];</code>
     */
    @java.lang.Override
    public com.aruna.api.storage.models.v2.PubkeyOrBuilder getPubkeyOrBuilder() {
      if ((targetCase_ == 3) && (pubkeyBuilder_ != null)) {
        return pubkeyBuilder_.getMessageOrBuilder();
      } else {
        if (targetCase_ == 3) {
          return (com.aruna.api.storage.models.v2.Pubkey) target_;
        }
        return com.aruna.api.storage.models.v2.Pubkey.getDefaultInstance();
      }
    }
    /**
     * <code>.aruna.api.storage.models.v2.Pubkey pubkey = 3 [json_name = "pubkey"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.storage.models.v2.Pubkey, com.aruna.api.storage.models.v2.Pubkey.Builder, com.aruna.api.storage.models.v2.PubkeyOrBuilder> 
        getPubkeyFieldBuilder() {
      if (pubkeyBuilder_ == null) {
        if (!(targetCase_ == 3)) {
          target_ = com.aruna.api.storage.models.v2.Pubkey.getDefaultInstance();
        }
        pubkeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aruna.api.storage.models.v2.Pubkey, com.aruna.api.storage.models.v2.Pubkey.Builder, com.aruna.api.storage.models.v2.PubkeyOrBuilder>(
                (com.aruna.api.storage.models.v2.Pubkey) target_,
                getParentForChildren(),
                isClean());
        target_ = null;
      }
      targetCase_ = 3;
      onChanged();
      return pubkeyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.FullSyncEndpointResponse)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.FullSyncEndpointResponse)
  private static final com.aruna.api.storage.services.v2.FullSyncEndpointResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.FullSyncEndpointResponse();
  }

  public static com.aruna.api.storage.services.v2.FullSyncEndpointResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FullSyncEndpointResponse>
      PARSER = new com.google.protobuf.AbstractParser<FullSyncEndpointResponse>() {
    @java.lang.Override
    public FullSyncEndpointResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<FullSyncEndpointResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FullSyncEndpointResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.FullSyncEndpointResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

