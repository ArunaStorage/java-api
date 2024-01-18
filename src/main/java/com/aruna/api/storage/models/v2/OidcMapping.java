// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.storage.models.v2;

/**
 * Protobuf type {@code aruna.api.storage.models.v2.OidcMapping}
 */
public final class OidcMapping extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.models.v2.OidcMapping)
    OidcMappingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OidcMapping.newBuilder() to construct.
  private OidcMapping(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OidcMapping() {
    externalId_ = "";
    oidcUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OidcMapping();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_OidcMapping_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_OidcMapping_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.models.v2.OidcMapping.class, com.aruna.api.storage.models.v2.OidcMapping.Builder.class);
  }

  public static final int EXTERNAL_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object externalId_ = "";
  /**
   * <code>string external_id = 1 [json_name = "externalId"];</code>
   * @return The externalId.
   */
  @java.lang.Override
  public java.lang.String getExternalId() {
    java.lang.Object ref = externalId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      externalId_ = s;
      return s;
    }
  }
  /**
   * <code>string external_id = 1 [json_name = "externalId"];</code>
   * @return The bytes for externalId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExternalIdBytes() {
    java.lang.Object ref = externalId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      externalId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OIDC_URL_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object oidcUrl_ = "";
  /**
   * <code>string oidc_url = 2 [json_name = "oidcUrl"];</code>
   * @return The oidcUrl.
   */
  @java.lang.Override
  public java.lang.String getOidcUrl() {
    java.lang.Object ref = oidcUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      oidcUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string oidc_url = 2 [json_name = "oidcUrl"];</code>
   * @return The bytes for oidcUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOidcUrlBytes() {
    java.lang.Object ref = oidcUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      oidcUrl_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(externalId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, externalId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(oidcUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, oidcUrl_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(externalId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, externalId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(oidcUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, oidcUrl_);
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
    if (!(obj instanceof com.aruna.api.storage.models.v2.OidcMapping)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.models.v2.OidcMapping other = (com.aruna.api.storage.models.v2.OidcMapping) obj;

    if (!getExternalId()
        .equals(other.getExternalId())) return false;
    if (!getOidcUrl()
        .equals(other.getOidcUrl())) return false;
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
    hash = (37 * hash) + EXTERNAL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getExternalId().hashCode();
    hash = (37 * hash) + OIDC_URL_FIELD_NUMBER;
    hash = (53 * hash) + getOidcUrl().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.models.v2.OidcMapping parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.models.v2.OidcMapping parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.models.v2.OidcMapping parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.models.v2.OidcMapping parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.models.v2.OidcMapping parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.models.v2.OidcMapping parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.models.v2.OidcMapping parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.models.v2.OidcMapping parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.models.v2.OidcMapping parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.models.v2.OidcMapping parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.models.v2.OidcMapping parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.models.v2.OidcMapping parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.models.v2.OidcMapping prototype) {
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
   * Protobuf type {@code aruna.api.storage.models.v2.OidcMapping}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.models.v2.OidcMapping)
      com.aruna.api.storage.models.v2.OidcMappingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_OidcMapping_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_OidcMapping_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.models.v2.OidcMapping.class, com.aruna.api.storage.models.v2.OidcMapping.Builder.class);
    }

    // Construct using com.aruna.api.storage.models.v2.OidcMapping.newBuilder()
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
      externalId_ = "";
      oidcUrl_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_OidcMapping_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.models.v2.OidcMapping getDefaultInstanceForType() {
      return com.aruna.api.storage.models.v2.OidcMapping.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.models.v2.OidcMapping build() {
      com.aruna.api.storage.models.v2.OidcMapping result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.models.v2.OidcMapping buildPartial() {
      com.aruna.api.storage.models.v2.OidcMapping result = new com.aruna.api.storage.models.v2.OidcMapping(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.models.v2.OidcMapping result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.externalId_ = externalId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.oidcUrl_ = oidcUrl_;
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
      if (other instanceof com.aruna.api.storage.models.v2.OidcMapping) {
        return mergeFrom((com.aruna.api.storage.models.v2.OidcMapping)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.models.v2.OidcMapping other) {
      if (other == com.aruna.api.storage.models.v2.OidcMapping.getDefaultInstance()) return this;
      if (!other.getExternalId().isEmpty()) {
        externalId_ = other.externalId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getOidcUrl().isEmpty()) {
        oidcUrl_ = other.oidcUrl_;
        bitField0_ |= 0x00000002;
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
              externalId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              oidcUrl_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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

    private java.lang.Object externalId_ = "";
    /**
     * <code>string external_id = 1 [json_name = "externalId"];</code>
     * @return The externalId.
     */
    public java.lang.String getExternalId() {
      java.lang.Object ref = externalId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        externalId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string external_id = 1 [json_name = "externalId"];</code>
     * @return The bytes for externalId.
     */
    public com.google.protobuf.ByteString
        getExternalIdBytes() {
      java.lang.Object ref = externalId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        externalId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string external_id = 1 [json_name = "externalId"];</code>
     * @param value The externalId to set.
     * @return This builder for chaining.
     */
    public Builder setExternalId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      externalId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string external_id = 1 [json_name = "externalId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExternalId() {
      externalId_ = getDefaultInstance().getExternalId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string external_id = 1 [json_name = "externalId"];</code>
     * @param value The bytes for externalId to set.
     * @return This builder for chaining.
     */
    public Builder setExternalIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      externalId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object oidcUrl_ = "";
    /**
     * <code>string oidc_url = 2 [json_name = "oidcUrl"];</code>
     * @return The oidcUrl.
     */
    public java.lang.String getOidcUrl() {
      java.lang.Object ref = oidcUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        oidcUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string oidc_url = 2 [json_name = "oidcUrl"];</code>
     * @return The bytes for oidcUrl.
     */
    public com.google.protobuf.ByteString
        getOidcUrlBytes() {
      java.lang.Object ref = oidcUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        oidcUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string oidc_url = 2 [json_name = "oidcUrl"];</code>
     * @param value The oidcUrl to set.
     * @return This builder for chaining.
     */
    public Builder setOidcUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      oidcUrl_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string oidc_url = 2 [json_name = "oidcUrl"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOidcUrl() {
      oidcUrl_ = getDefaultInstance().getOidcUrl();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string oidc_url = 2 [json_name = "oidcUrl"];</code>
     * @param value The bytes for oidcUrl to set.
     * @return This builder for chaining.
     */
    public Builder setOidcUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      oidcUrl_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.models.v2.OidcMapping)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.models.v2.OidcMapping)
  private static final com.aruna.api.storage.models.v2.OidcMapping DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.models.v2.OidcMapping();
  }

  public static com.aruna.api.storage.models.v2.OidcMapping getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OidcMapping>
      PARSER = new com.google.protobuf.AbstractParser<OidcMapping>() {
    @java.lang.Override
    public OidcMapping parsePartialFrom(
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

  public static com.google.protobuf.Parser<OidcMapping> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OidcMapping> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.models.v2.OidcMapping getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

