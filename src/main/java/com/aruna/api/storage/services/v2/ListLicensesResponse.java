// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/license_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.services.v2;

/**
 * <pre>
 * ListLicenseResponse
 *
 * Response object for ListLicense
 * </pre>
 *
 * Protobuf type {@code aruna.api.storage.services.v2.ListLicensesResponse}
 */
public final class ListLicensesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.ListLicensesResponse)
    ListLicensesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListLicensesResponse.newBuilder() to construct.
  private ListLicensesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListLicensesResponse() {
    licenses_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListLicensesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.LicenseServiceProto.internal_static_aruna_api_storage_services_v2_ListLicensesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.LicenseServiceProto.internal_static_aruna_api_storage_services_v2_ListLicensesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.ListLicensesResponse.class, com.aruna.api.storage.services.v2.ListLicensesResponse.Builder.class);
  }

  public static final int LICENSES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.aruna.api.storage.models.v2.License> licenses_;
  /**
   * <code>repeated .aruna.api.storage.models.v2.License licenses = 1 [json_name = "licenses"];</code>
   */
  @java.lang.Override
  public java.util.List<com.aruna.api.storage.models.v2.License> getLicensesList() {
    return licenses_;
  }
  /**
   * <code>repeated .aruna.api.storage.models.v2.License licenses = 1 [json_name = "licenses"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.aruna.api.storage.models.v2.LicenseOrBuilder> 
      getLicensesOrBuilderList() {
    return licenses_;
  }
  /**
   * <code>repeated .aruna.api.storage.models.v2.License licenses = 1 [json_name = "licenses"];</code>
   */
  @java.lang.Override
  public int getLicensesCount() {
    return licenses_.size();
  }
  /**
   * <code>repeated .aruna.api.storage.models.v2.License licenses = 1 [json_name = "licenses"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.License getLicenses(int index) {
    return licenses_.get(index);
  }
  /**
   * <code>repeated .aruna.api.storage.models.v2.License licenses = 1 [json_name = "licenses"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.LicenseOrBuilder getLicensesOrBuilder(
      int index) {
    return licenses_.get(index);
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
    for (int i = 0; i < licenses_.size(); i++) {
      output.writeMessage(1, licenses_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < licenses_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, licenses_.get(i));
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.ListLicensesResponse)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.ListLicensesResponse other = (com.aruna.api.storage.services.v2.ListLicensesResponse) obj;

    if (!getLicensesList()
        .equals(other.getLicensesList())) return false;
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
    if (getLicensesCount() > 0) {
      hash = (37 * hash) + LICENSES_FIELD_NUMBER;
      hash = (53 * hash) + getLicensesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.ListLicensesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.ListLicensesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.ListLicensesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.ListLicensesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.ListLicensesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.ListLicensesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.ListLicensesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.ListLicensesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.ListLicensesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.ListLicensesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.ListLicensesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.ListLicensesResponse parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.ListLicensesResponse prototype) {
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
   * ListLicenseResponse
   *
   * Response object for ListLicense
   * </pre>
   *
   * Protobuf type {@code aruna.api.storage.services.v2.ListLicensesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.ListLicensesResponse)
      com.aruna.api.storage.services.v2.ListLicensesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.LicenseServiceProto.internal_static_aruna_api_storage_services_v2_ListLicensesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.LicenseServiceProto.internal_static_aruna_api_storage_services_v2_ListLicensesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.ListLicensesResponse.class, com.aruna.api.storage.services.v2.ListLicensesResponse.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.ListLicensesResponse.newBuilder()
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
      if (licensesBuilder_ == null) {
        licenses_ = java.util.Collections.emptyList();
      } else {
        licenses_ = null;
        licensesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.LicenseServiceProto.internal_static_aruna_api_storage_services_v2_ListLicensesResponse_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.ListLicensesResponse getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.ListLicensesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.ListLicensesResponse build() {
      com.aruna.api.storage.services.v2.ListLicensesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.ListLicensesResponse buildPartial() {
      com.aruna.api.storage.services.v2.ListLicensesResponse result = new com.aruna.api.storage.services.v2.ListLicensesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.aruna.api.storage.services.v2.ListLicensesResponse result) {
      if (licensesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          licenses_ = java.util.Collections.unmodifiableList(licenses_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.licenses_ = licenses_;
      } else {
        result.licenses_ = licensesBuilder_.build();
      }
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.ListLicensesResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.aruna.api.storage.services.v2.ListLicensesResponse) {
        return mergeFrom((com.aruna.api.storage.services.v2.ListLicensesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.ListLicensesResponse other) {
      if (other == com.aruna.api.storage.services.v2.ListLicensesResponse.getDefaultInstance()) return this;
      if (licensesBuilder_ == null) {
        if (!other.licenses_.isEmpty()) {
          if (licenses_.isEmpty()) {
            licenses_ = other.licenses_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLicensesIsMutable();
            licenses_.addAll(other.licenses_);
          }
          onChanged();
        }
      } else {
        if (!other.licenses_.isEmpty()) {
          if (licensesBuilder_.isEmpty()) {
            licensesBuilder_.dispose();
            licensesBuilder_ = null;
            licenses_ = other.licenses_;
            bitField0_ = (bitField0_ & ~0x00000001);
            licensesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLicensesFieldBuilder() : null;
          } else {
            licensesBuilder_.addAllMessages(other.licenses_);
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
              com.aruna.api.storage.models.v2.License m =
                  input.readMessage(
                      com.aruna.api.storage.models.v2.License.parser(),
                      extensionRegistry);
              if (licensesBuilder_ == null) {
                ensureLicensesIsMutable();
                licenses_.add(m);
              } else {
                licensesBuilder_.addMessage(m);
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

    private java.util.List<com.aruna.api.storage.models.v2.License> licenses_ =
      java.util.Collections.emptyList();
    private void ensureLicensesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        licenses_ = new java.util.ArrayList<com.aruna.api.storage.models.v2.License>(licenses_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aruna.api.storage.models.v2.License, com.aruna.api.storage.models.v2.License.Builder, com.aruna.api.storage.models.v2.LicenseOrBuilder> licensesBuilder_;

    /**
     * <code>repeated .aruna.api.storage.models.v2.License licenses = 1 [json_name = "licenses"];</code>
     */
    public java.util.List<com.aruna.api.storage.models.v2.License> getLicensesList() {
      if (licensesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(licenses_);
      } else {
        return licensesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.License licenses = 1 [json_name = "licenses"];</code>
     */
    public int getLicensesCount() {
      if (licensesBuilder_ == null) {
        return licenses_.size();
      } else {
        return licensesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.License licenses = 1 [json_name = "licenses"];</code>
     */
    public com.aruna.api.storage.models.v2.License getLicenses(int index) {
      if (licensesBuilder_ == null) {
        return licenses_.get(index);
      } else {
        return licensesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.License licenses = 1 [json_name = "licenses"];</code>
     */
    public Builder setLicenses(
        int index, com.aruna.api.storage.models.v2.License value) {
      if (licensesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLicensesIsMutable();
        licenses_.set(index, value);
        onChanged();
      } else {
        licensesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.License licenses = 1 [json_name = "licenses"];</code>
     */
    public Builder setLicenses(
        int index, com.aruna.api.storage.models.v2.License.Builder builderForValue) {
      if (licensesBuilder_ == null) {
        ensureLicensesIsMutable();
        licenses_.set(index, builderForValue.build());
        onChanged();
      } else {
        licensesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.License licenses = 1 [json_name = "licenses"];</code>
     */
    public Builder addLicenses(com.aruna.api.storage.models.v2.License value) {
      if (licensesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLicensesIsMutable();
        licenses_.add(value);
        onChanged();
      } else {
        licensesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.License licenses = 1 [json_name = "licenses"];</code>
     */
    public Builder addLicenses(
        int index, com.aruna.api.storage.models.v2.License value) {
      if (licensesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLicensesIsMutable();
        licenses_.add(index, value);
        onChanged();
      } else {
        licensesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.License licenses = 1 [json_name = "licenses"];</code>
     */
    public Builder addLicenses(
        com.aruna.api.storage.models.v2.License.Builder builderForValue) {
      if (licensesBuilder_ == null) {
        ensureLicensesIsMutable();
        licenses_.add(builderForValue.build());
        onChanged();
      } else {
        licensesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.License licenses = 1 [json_name = "licenses"];</code>
     */
    public Builder addLicenses(
        int index, com.aruna.api.storage.models.v2.License.Builder builderForValue) {
      if (licensesBuilder_ == null) {
        ensureLicensesIsMutable();
        licenses_.add(index, builderForValue.build());
        onChanged();
      } else {
        licensesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.License licenses = 1 [json_name = "licenses"];</code>
     */
    public Builder addAllLicenses(
        java.lang.Iterable<? extends com.aruna.api.storage.models.v2.License> values) {
      if (licensesBuilder_ == null) {
        ensureLicensesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, licenses_);
        onChanged();
      } else {
        licensesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.License licenses = 1 [json_name = "licenses"];</code>
     */
    public Builder clearLicenses() {
      if (licensesBuilder_ == null) {
        licenses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        licensesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.License licenses = 1 [json_name = "licenses"];</code>
     */
    public Builder removeLicenses(int index) {
      if (licensesBuilder_ == null) {
        ensureLicensesIsMutable();
        licenses_.remove(index);
        onChanged();
      } else {
        licensesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.License licenses = 1 [json_name = "licenses"];</code>
     */
    public com.aruna.api.storage.models.v2.License.Builder getLicensesBuilder(
        int index) {
      return getLicensesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.License licenses = 1 [json_name = "licenses"];</code>
     */
    public com.aruna.api.storage.models.v2.LicenseOrBuilder getLicensesOrBuilder(
        int index) {
      if (licensesBuilder_ == null) {
        return licenses_.get(index);  } else {
        return licensesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.License licenses = 1 [json_name = "licenses"];</code>
     */
    public java.util.List<? extends com.aruna.api.storage.models.v2.LicenseOrBuilder> 
         getLicensesOrBuilderList() {
      if (licensesBuilder_ != null) {
        return licensesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(licenses_);
      }
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.License licenses = 1 [json_name = "licenses"];</code>
     */
    public com.aruna.api.storage.models.v2.License.Builder addLicensesBuilder() {
      return getLicensesFieldBuilder().addBuilder(
          com.aruna.api.storage.models.v2.License.getDefaultInstance());
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.License licenses = 1 [json_name = "licenses"];</code>
     */
    public com.aruna.api.storage.models.v2.License.Builder addLicensesBuilder(
        int index) {
      return getLicensesFieldBuilder().addBuilder(
          index, com.aruna.api.storage.models.v2.License.getDefaultInstance());
    }
    /**
     * <code>repeated .aruna.api.storage.models.v2.License licenses = 1 [json_name = "licenses"];</code>
     */
    public java.util.List<com.aruna.api.storage.models.v2.License.Builder> 
         getLicensesBuilderList() {
      return getLicensesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aruna.api.storage.models.v2.License, com.aruna.api.storage.models.v2.License.Builder, com.aruna.api.storage.models.v2.LicenseOrBuilder> 
        getLicensesFieldBuilder() {
      if (licensesBuilder_ == null) {
        licensesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.aruna.api.storage.models.v2.License, com.aruna.api.storage.models.v2.License.Builder, com.aruna.api.storage.models.v2.LicenseOrBuilder>(
                licenses_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        licenses_ = null;
      }
      return licensesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.ListLicensesResponse)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.ListLicensesResponse)
  private static final com.aruna.api.storage.services.v2.ListLicensesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.ListLicensesResponse();
  }

  public static com.aruna.api.storage.services.v2.ListLicensesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListLicensesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListLicensesResponse>() {
    @java.lang.Override
    public ListLicensesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListLicensesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListLicensesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.ListLicensesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

