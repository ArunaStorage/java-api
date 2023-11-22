// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/license_service.proto

// Protobuf Java Version: 3.25.1
package com.aruna.api.storage.services.v2;

/**
 * <pre>
 * GetLicenseResponse
 *
 * Response object for GetLicense
 * </pre>
 *
 * Protobuf type {@code aruna.api.storage.services.v2.GetLicenseResponse}
 */
public final class GetLicenseResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.GetLicenseResponse)
    GetLicenseResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetLicenseResponse.newBuilder() to construct.
  private GetLicenseResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetLicenseResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetLicenseResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.LicenseServiceProto.internal_static_aruna_api_storage_services_v2_GetLicenseResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.LicenseServiceProto.internal_static_aruna_api_storage_services_v2_GetLicenseResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.GetLicenseResponse.class, com.aruna.api.storage.services.v2.GetLicenseResponse.Builder.class);
  }

  private int bitField0_;
  public static final int LICENSE_FIELD_NUMBER = 1;
  private com.aruna.api.storage.models.v2.License license_;
  /**
   * <code>.aruna.api.storage.models.v2.License license = 1 [json_name = "license"];</code>
   * @return Whether the license field is set.
   */
  @java.lang.Override
  public boolean hasLicense() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.aruna.api.storage.models.v2.License license = 1 [json_name = "license"];</code>
   * @return The license.
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.License getLicense() {
    return license_ == null ? com.aruna.api.storage.models.v2.License.getDefaultInstance() : license_;
  }
  /**
   * <code>.aruna.api.storage.models.v2.License license = 1 [json_name = "license"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.LicenseOrBuilder getLicenseOrBuilder() {
    return license_ == null ? com.aruna.api.storage.models.v2.License.getDefaultInstance() : license_;
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
      output.writeMessage(1, getLicense());
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
        .computeMessageSize(1, getLicense());
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.GetLicenseResponse)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.GetLicenseResponse other = (com.aruna.api.storage.services.v2.GetLicenseResponse) obj;

    if (hasLicense() != other.hasLicense()) return false;
    if (hasLicense()) {
      if (!getLicense()
          .equals(other.getLicense())) return false;
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
    if (hasLicense()) {
      hash = (37 * hash) + LICENSE_FIELD_NUMBER;
      hash = (53 * hash) + getLicense().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.GetLicenseResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetLicenseResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetLicenseResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetLicenseResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetLicenseResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetLicenseResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetLicenseResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetLicenseResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.GetLicenseResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.GetLicenseResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetLicenseResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetLicenseResponse parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.GetLicenseResponse prototype) {
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
   * <pre>
   * GetLicenseResponse
   *
   * Response object for GetLicense
   * </pre>
   *
   * Protobuf type {@code aruna.api.storage.services.v2.GetLicenseResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.GetLicenseResponse)
      com.aruna.api.storage.services.v2.GetLicenseResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.LicenseServiceProto.internal_static_aruna_api_storage_services_v2_GetLicenseResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.LicenseServiceProto.internal_static_aruna_api_storage_services_v2_GetLicenseResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.GetLicenseResponse.class, com.aruna.api.storage.services.v2.GetLicenseResponse.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.GetLicenseResponse.newBuilder()
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
        getLicenseFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      license_ = null;
      if (licenseBuilder_ != null) {
        licenseBuilder_.dispose();
        licenseBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.LicenseServiceProto.internal_static_aruna_api_storage_services_v2_GetLicenseResponse_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetLicenseResponse getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.GetLicenseResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetLicenseResponse build() {
      com.aruna.api.storage.services.v2.GetLicenseResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetLicenseResponse buildPartial() {
      com.aruna.api.storage.services.v2.GetLicenseResponse result = new com.aruna.api.storage.services.v2.GetLicenseResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.GetLicenseResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.license_ = licenseBuilder_ == null
            ? license_
            : licenseBuilder_.build();
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
      if (other instanceof com.aruna.api.storage.services.v2.GetLicenseResponse) {
        return mergeFrom((com.aruna.api.storage.services.v2.GetLicenseResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.GetLicenseResponse other) {
      if (other == com.aruna.api.storage.services.v2.GetLicenseResponse.getDefaultInstance()) return this;
      if (other.hasLicense()) {
        mergeLicense(other.getLicense());
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
                  getLicenseFieldBuilder().getBuilder(),
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

    private com.aruna.api.storage.models.v2.License license_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.storage.models.v2.License, com.aruna.api.storage.models.v2.License.Builder, com.aruna.api.storage.models.v2.LicenseOrBuilder> licenseBuilder_;
    /**
     * <code>.aruna.api.storage.models.v2.License license = 1 [json_name = "license"];</code>
     * @return Whether the license field is set.
     */
    public boolean hasLicense() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.aruna.api.storage.models.v2.License license = 1 [json_name = "license"];</code>
     * @return The license.
     */
    public com.aruna.api.storage.models.v2.License getLicense() {
      if (licenseBuilder_ == null) {
        return license_ == null ? com.aruna.api.storage.models.v2.License.getDefaultInstance() : license_;
      } else {
        return licenseBuilder_.getMessage();
      }
    }
    /**
     * <code>.aruna.api.storage.models.v2.License license = 1 [json_name = "license"];</code>
     */
    public Builder setLicense(com.aruna.api.storage.models.v2.License value) {
      if (licenseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        license_ = value;
      } else {
        licenseBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.License license = 1 [json_name = "license"];</code>
     */
    public Builder setLicense(
        com.aruna.api.storage.models.v2.License.Builder builderForValue) {
      if (licenseBuilder_ == null) {
        license_ = builderForValue.build();
      } else {
        licenseBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.License license = 1 [json_name = "license"];</code>
     */
    public Builder mergeLicense(com.aruna.api.storage.models.v2.License value) {
      if (licenseBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          license_ != null &&
          license_ != com.aruna.api.storage.models.v2.License.getDefaultInstance()) {
          getLicenseBuilder().mergeFrom(value);
        } else {
          license_ = value;
        }
      } else {
        licenseBuilder_.mergeFrom(value);
      }
      if (license_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.License license = 1 [json_name = "license"];</code>
     */
    public Builder clearLicense() {
      bitField0_ = (bitField0_ & ~0x00000001);
      license_ = null;
      if (licenseBuilder_ != null) {
        licenseBuilder_.dispose();
        licenseBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.License license = 1 [json_name = "license"];</code>
     */
    public com.aruna.api.storage.models.v2.License.Builder getLicenseBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getLicenseFieldBuilder().getBuilder();
    }
    /**
     * <code>.aruna.api.storage.models.v2.License license = 1 [json_name = "license"];</code>
     */
    public com.aruna.api.storage.models.v2.LicenseOrBuilder getLicenseOrBuilder() {
      if (licenseBuilder_ != null) {
        return licenseBuilder_.getMessageOrBuilder();
      } else {
        return license_ == null ?
            com.aruna.api.storage.models.v2.License.getDefaultInstance() : license_;
      }
    }
    /**
     * <code>.aruna.api.storage.models.v2.License license = 1 [json_name = "license"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aruna.api.storage.models.v2.License, com.aruna.api.storage.models.v2.License.Builder, com.aruna.api.storage.models.v2.LicenseOrBuilder> 
        getLicenseFieldBuilder() {
      if (licenseBuilder_ == null) {
        licenseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aruna.api.storage.models.v2.License, com.aruna.api.storage.models.v2.License.Builder, com.aruna.api.storage.models.v2.LicenseOrBuilder>(
                getLicense(),
                getParentForChildren(),
                isClean());
        license_ = null;
      }
      return licenseBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.GetLicenseResponse)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.GetLicenseResponse)
  private static final com.aruna.api.storage.services.v2.GetLicenseResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.GetLicenseResponse();
  }

  public static com.aruna.api.storage.services.v2.GetLicenseResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetLicenseResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetLicenseResponse>() {
    @java.lang.Override
    public GetLicenseResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetLicenseResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetLicenseResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.GetLicenseResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

