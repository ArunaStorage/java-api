// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/project_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.UpdateProjectLicensesRequest}
 */
public final class UpdateProjectLicensesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.UpdateProjectLicensesRequest)
    UpdateProjectLicensesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateProjectLicensesRequest.newBuilder() to construct.
  private UpdateProjectLicensesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateProjectLicensesRequest() {
    projectId_ = "";
    metadataLicenseTag_ = "";
    defaultDataLicenseTag_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateProjectLicensesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.ProjectServiceProto.internal_static_aruna_api_storage_services_v2_UpdateProjectLicensesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.ProjectServiceProto.internal_static_aruna_api_storage_services_v2_UpdateProjectLicensesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest.class, com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest.Builder.class);
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object projectId_ = "";
  /**
   * <code>string project_id = 1 [json_name = "projectId"];</code>
   * @return The projectId.
   */
  @java.lang.Override
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   * <code>string project_id = 1 [json_name = "projectId"];</code>
   * @return The bytes for projectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METADATA_LICENSE_TAG_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object metadataLicenseTag_ = "";
  /**
   * <code>string metadata_license_tag = 2 [json_name = "metadataLicenseTag"];</code>
   * @return The metadataLicenseTag.
   */
  @java.lang.Override
  public java.lang.String getMetadataLicenseTag() {
    java.lang.Object ref = metadataLicenseTag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      metadataLicenseTag_ = s;
      return s;
    }
  }
  /**
   * <code>string metadata_license_tag = 2 [json_name = "metadataLicenseTag"];</code>
   * @return The bytes for metadataLicenseTag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMetadataLicenseTagBytes() {
    java.lang.Object ref = metadataLicenseTag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      metadataLicenseTag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEFAULT_DATA_LICENSE_TAG_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object defaultDataLicenseTag_ = "";
  /**
   * <code>string default_data_license_tag = 3 [json_name = "defaultDataLicenseTag"];</code>
   * @return The defaultDataLicenseTag.
   */
  @java.lang.Override
  public java.lang.String getDefaultDataLicenseTag() {
    java.lang.Object ref = defaultDataLicenseTag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      defaultDataLicenseTag_ = s;
      return s;
    }
  }
  /**
   * <code>string default_data_license_tag = 3 [json_name = "defaultDataLicenseTag"];</code>
   * @return The bytes for defaultDataLicenseTag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDefaultDataLicenseTagBytes() {
    java.lang.Object ref = defaultDataLicenseTag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      defaultDataLicenseTag_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metadataLicenseTag_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, metadataLicenseTag_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(defaultDataLicenseTag_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, defaultDataLicenseTag_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metadataLicenseTag_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, metadataLicenseTag_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(defaultDataLicenseTag_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, defaultDataLicenseTag_);
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest other = (com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest) obj;

    if (!getProjectId()
        .equals(other.getProjectId())) return false;
    if (!getMetadataLicenseTag()
        .equals(other.getMetadataLicenseTag())) return false;
    if (!getDefaultDataLicenseTag()
        .equals(other.getDefaultDataLicenseTag())) return false;
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
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (37 * hash) + METADATA_LICENSE_TAG_FIELD_NUMBER;
    hash = (53 * hash) + getMetadataLicenseTag().hashCode();
    hash = (37 * hash) + DEFAULT_DATA_LICENSE_TAG_FIELD_NUMBER;
    hash = (53 * hash) + getDefaultDataLicenseTag().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.UpdateProjectLicensesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.UpdateProjectLicensesRequest)
      com.aruna.api.storage.services.v2.UpdateProjectLicensesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.ProjectServiceProto.internal_static_aruna_api_storage_services_v2_UpdateProjectLicensesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.ProjectServiceProto.internal_static_aruna_api_storage_services_v2_UpdateProjectLicensesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest.class, com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest.newBuilder()
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
      projectId_ = "";
      metadataLicenseTag_ = "";
      defaultDataLicenseTag_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.ProjectServiceProto.internal_static_aruna_api_storage_services_v2_UpdateProjectLicensesRequest_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest build() {
      com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest buildPartial() {
      com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest result = new com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.projectId_ = projectId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.metadataLicenseTag_ = metadataLicenseTag_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.defaultDataLicenseTag_ = defaultDataLicenseTag_;
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
      if (other instanceof com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest) {
        return mergeFrom((com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest other) {
      if (other == com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest.getDefaultInstance()) return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getMetadataLicenseTag().isEmpty()) {
        metadataLicenseTag_ = other.metadataLicenseTag_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDefaultDataLicenseTag().isEmpty()) {
        defaultDataLicenseTag_ = other.defaultDataLicenseTag_;
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
              projectId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              metadataLicenseTag_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              defaultDataLicenseTag_ = input.readStringRequireUtf8();
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

    private java.lang.Object projectId_ = "";
    /**
     * <code>string project_id = 1 [json_name = "projectId"];</code>
     * @return The projectId.
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string project_id = 1 [json_name = "projectId"];</code>
     * @return The bytes for projectId.
     */
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string project_id = 1 [json_name = "projectId"];</code>
     * @param value The projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      projectId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string project_id = 1 [json_name = "projectId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProjectId() {
      projectId_ = getDefaultInstance().getProjectId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string project_id = 1 [json_name = "projectId"];</code>
     * @param value The bytes for projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      projectId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object metadataLicenseTag_ = "";
    /**
     * <code>string metadata_license_tag = 2 [json_name = "metadataLicenseTag"];</code>
     * @return The metadataLicenseTag.
     */
    public java.lang.String getMetadataLicenseTag() {
      java.lang.Object ref = metadataLicenseTag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        metadataLicenseTag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string metadata_license_tag = 2 [json_name = "metadataLicenseTag"];</code>
     * @return The bytes for metadataLicenseTag.
     */
    public com.google.protobuf.ByteString
        getMetadataLicenseTagBytes() {
      java.lang.Object ref = metadataLicenseTag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        metadataLicenseTag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string metadata_license_tag = 2 [json_name = "metadataLicenseTag"];</code>
     * @param value The metadataLicenseTag to set.
     * @return This builder for chaining.
     */
    public Builder setMetadataLicenseTag(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      metadataLicenseTag_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string metadata_license_tag = 2 [json_name = "metadataLicenseTag"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMetadataLicenseTag() {
      metadataLicenseTag_ = getDefaultInstance().getMetadataLicenseTag();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string metadata_license_tag = 2 [json_name = "metadataLicenseTag"];</code>
     * @param value The bytes for metadataLicenseTag to set.
     * @return This builder for chaining.
     */
    public Builder setMetadataLicenseTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      metadataLicenseTag_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object defaultDataLicenseTag_ = "";
    /**
     * <code>string default_data_license_tag = 3 [json_name = "defaultDataLicenseTag"];</code>
     * @return The defaultDataLicenseTag.
     */
    public java.lang.String getDefaultDataLicenseTag() {
      java.lang.Object ref = defaultDataLicenseTag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        defaultDataLicenseTag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string default_data_license_tag = 3 [json_name = "defaultDataLicenseTag"];</code>
     * @return The bytes for defaultDataLicenseTag.
     */
    public com.google.protobuf.ByteString
        getDefaultDataLicenseTagBytes() {
      java.lang.Object ref = defaultDataLicenseTag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        defaultDataLicenseTag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string default_data_license_tag = 3 [json_name = "defaultDataLicenseTag"];</code>
     * @param value The defaultDataLicenseTag to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultDataLicenseTag(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      defaultDataLicenseTag_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string default_data_license_tag = 3 [json_name = "defaultDataLicenseTag"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDefaultDataLicenseTag() {
      defaultDataLicenseTag_ = getDefaultInstance().getDefaultDataLicenseTag();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string default_data_license_tag = 3 [json_name = "defaultDataLicenseTag"];</code>
     * @param value The bytes for defaultDataLicenseTag to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultDataLicenseTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      defaultDataLicenseTag_ = value;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.UpdateProjectLicensesRequest)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.UpdateProjectLicensesRequest)
  private static final com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest();
  }

  public static com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateProjectLicensesRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateProjectLicensesRequest>() {
    @java.lang.Override
    public UpdateProjectLicensesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateProjectLicensesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateProjectLicensesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

