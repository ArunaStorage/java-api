// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/service_account_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.CreateServiceAccountResponse}
 */
public final class CreateServiceAccountResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.CreateServiceAccountResponse)
    CreateServiceAccountResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateServiceAccountResponse.newBuilder() to construct.
  private CreateServiceAccountResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateServiceAccountResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateServiceAccountResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_CreateServiceAccountResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_CreateServiceAccountResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.CreateServiceAccountResponse.class, com.aruna.api.storage.services.v2.CreateServiceAccountResponse.Builder.class);
  }

  private int bitField0_;
  public static final int SERVICE_ACCOUNT_FIELD_NUMBER = 1;
  private com.aruna.api.storage.services.v2.ServiceAccount serviceAccount_;
  /**
   * <code>.aruna.api.storage.services.v2.ServiceAccount service_account = 1 [json_name = "serviceAccount"];</code>
   * @return Whether the serviceAccount field is set.
   */
  @java.lang.Override
  public boolean hasServiceAccount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.aruna.api.storage.services.v2.ServiceAccount service_account = 1 [json_name = "serviceAccount"];</code>
   * @return The serviceAccount.
   */
  @java.lang.Override
  public com.aruna.api.storage.services.v2.ServiceAccount getServiceAccount() {
    return serviceAccount_ == null ? com.aruna.api.storage.services.v2.ServiceAccount.getDefaultInstance() : serviceAccount_;
  }
  /**
   * <code>.aruna.api.storage.services.v2.ServiceAccount service_account = 1 [json_name = "serviceAccount"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.services.v2.ServiceAccountOrBuilder getServiceAccountOrBuilder() {
    return serviceAccount_ == null ? com.aruna.api.storage.services.v2.ServiceAccount.getDefaultInstance() : serviceAccount_;
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
      output.writeMessage(1, getServiceAccount());
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
        .computeMessageSize(1, getServiceAccount());
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.CreateServiceAccountResponse)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.CreateServiceAccountResponse other = (com.aruna.api.storage.services.v2.CreateServiceAccountResponse) obj;

    if (hasServiceAccount() != other.hasServiceAccount()) return false;
    if (hasServiceAccount()) {
      if (!getServiceAccount()
          .equals(other.getServiceAccount())) return false;
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
    if (hasServiceAccount()) {
      hash = (37 * hash) + SERVICE_ACCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getServiceAccount().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.CreateServiceAccountResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.CreateServiceAccountResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.CreateServiceAccountResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.CreateServiceAccountResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.CreateServiceAccountResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.CreateServiceAccountResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.CreateServiceAccountResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.CreateServiceAccountResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.CreateServiceAccountResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.CreateServiceAccountResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.CreateServiceAccountResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.CreateServiceAccountResponse parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.CreateServiceAccountResponse prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.CreateServiceAccountResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.CreateServiceAccountResponse)
      com.aruna.api.storage.services.v2.CreateServiceAccountResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_CreateServiceAccountResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_CreateServiceAccountResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.CreateServiceAccountResponse.class, com.aruna.api.storage.services.v2.CreateServiceAccountResponse.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.CreateServiceAccountResponse.newBuilder()
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
        getServiceAccountFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      serviceAccount_ = null;
      if (serviceAccountBuilder_ != null) {
        serviceAccountBuilder_.dispose();
        serviceAccountBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.internal_static_aruna_api_storage_services_v2_CreateServiceAccountResponse_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.CreateServiceAccountResponse getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.CreateServiceAccountResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.CreateServiceAccountResponse build() {
      com.aruna.api.storage.services.v2.CreateServiceAccountResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.CreateServiceAccountResponse buildPartial() {
      com.aruna.api.storage.services.v2.CreateServiceAccountResponse result = new com.aruna.api.storage.services.v2.CreateServiceAccountResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.CreateServiceAccountResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.serviceAccount_ = serviceAccountBuilder_ == null
            ? serviceAccount_
            : serviceAccountBuilder_.build();
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
      if (other instanceof com.aruna.api.storage.services.v2.CreateServiceAccountResponse) {
        return mergeFrom((com.aruna.api.storage.services.v2.CreateServiceAccountResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.CreateServiceAccountResponse other) {
      if (other == com.aruna.api.storage.services.v2.CreateServiceAccountResponse.getDefaultInstance()) return this;
      if (other.hasServiceAccount()) {
        mergeServiceAccount(other.getServiceAccount());
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
                  getServiceAccountFieldBuilder().getBuilder(),
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

    private com.aruna.api.storage.services.v2.ServiceAccount serviceAccount_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.storage.services.v2.ServiceAccount, com.aruna.api.storage.services.v2.ServiceAccount.Builder, com.aruna.api.storage.services.v2.ServiceAccountOrBuilder> serviceAccountBuilder_;
    /**
     * <code>.aruna.api.storage.services.v2.ServiceAccount service_account = 1 [json_name = "serviceAccount"];</code>
     * @return Whether the serviceAccount field is set.
     */
    public boolean hasServiceAccount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.aruna.api.storage.services.v2.ServiceAccount service_account = 1 [json_name = "serviceAccount"];</code>
     * @return The serviceAccount.
     */
    public com.aruna.api.storage.services.v2.ServiceAccount getServiceAccount() {
      if (serviceAccountBuilder_ == null) {
        return serviceAccount_ == null ? com.aruna.api.storage.services.v2.ServiceAccount.getDefaultInstance() : serviceAccount_;
      } else {
        return serviceAccountBuilder_.getMessage();
      }
    }
    /**
     * <code>.aruna.api.storage.services.v2.ServiceAccount service_account = 1 [json_name = "serviceAccount"];</code>
     */
    public Builder setServiceAccount(com.aruna.api.storage.services.v2.ServiceAccount value) {
      if (serviceAccountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        serviceAccount_ = value;
      } else {
        serviceAccountBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.services.v2.ServiceAccount service_account = 1 [json_name = "serviceAccount"];</code>
     */
    public Builder setServiceAccount(
        com.aruna.api.storage.services.v2.ServiceAccount.Builder builderForValue) {
      if (serviceAccountBuilder_ == null) {
        serviceAccount_ = builderForValue.build();
      } else {
        serviceAccountBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.services.v2.ServiceAccount service_account = 1 [json_name = "serviceAccount"];</code>
     */
    public Builder mergeServiceAccount(com.aruna.api.storage.services.v2.ServiceAccount value) {
      if (serviceAccountBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          serviceAccount_ != null &&
          serviceAccount_ != com.aruna.api.storage.services.v2.ServiceAccount.getDefaultInstance()) {
          getServiceAccountBuilder().mergeFrom(value);
        } else {
          serviceAccount_ = value;
        }
      } else {
        serviceAccountBuilder_.mergeFrom(value);
      }
      if (serviceAccount_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.aruna.api.storage.services.v2.ServiceAccount service_account = 1 [json_name = "serviceAccount"];</code>
     */
    public Builder clearServiceAccount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      serviceAccount_ = null;
      if (serviceAccountBuilder_ != null) {
        serviceAccountBuilder_.dispose();
        serviceAccountBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.services.v2.ServiceAccount service_account = 1 [json_name = "serviceAccount"];</code>
     */
    public com.aruna.api.storage.services.v2.ServiceAccount.Builder getServiceAccountBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getServiceAccountFieldBuilder().getBuilder();
    }
    /**
     * <code>.aruna.api.storage.services.v2.ServiceAccount service_account = 1 [json_name = "serviceAccount"];</code>
     */
    public com.aruna.api.storage.services.v2.ServiceAccountOrBuilder getServiceAccountOrBuilder() {
      if (serviceAccountBuilder_ != null) {
        return serviceAccountBuilder_.getMessageOrBuilder();
      } else {
        return serviceAccount_ == null ?
            com.aruna.api.storage.services.v2.ServiceAccount.getDefaultInstance() : serviceAccount_;
      }
    }
    /**
     * <code>.aruna.api.storage.services.v2.ServiceAccount service_account = 1 [json_name = "serviceAccount"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.storage.services.v2.ServiceAccount, com.aruna.api.storage.services.v2.ServiceAccount.Builder, com.aruna.api.storage.services.v2.ServiceAccountOrBuilder> 
        getServiceAccountFieldBuilder() {
      if (serviceAccountBuilder_ == null) {
        serviceAccountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aruna.api.storage.services.v2.ServiceAccount, com.aruna.api.storage.services.v2.ServiceAccount.Builder, com.aruna.api.storage.services.v2.ServiceAccountOrBuilder>(
                getServiceAccount(),
                getParentForChildren(),
                isClean());
        serviceAccount_ = null;
      }
      return serviceAccountBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.CreateServiceAccountResponse)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.CreateServiceAccountResponse)
  private static final com.aruna.api.storage.services.v2.CreateServiceAccountResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.CreateServiceAccountResponse();
  }

  public static com.aruna.api.storage.services.v2.CreateServiceAccountResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateServiceAccountResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateServiceAccountResponse>() {
    @java.lang.Override
    public CreateServiceAccountResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateServiceAccountResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateServiceAccountResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.CreateServiceAccountResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

