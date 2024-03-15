// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.models.v2;

/**
 * Protobuf type {@code aruna.api.storage.models.v2.ExternalRelation}
 */
public final class ExternalRelation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.models.v2.ExternalRelation)
    ExternalRelationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExternalRelation.newBuilder() to construct.
  private ExternalRelation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExternalRelation() {
    identifier_ = "";
    definedVariant_ = 0;
    customVariant_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExternalRelation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_ExternalRelation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_ExternalRelation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.models.v2.ExternalRelation.class, com.aruna.api.storage.models.v2.ExternalRelation.Builder.class);
  }

  private int bitField0_;
  public static final int IDENTIFIER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object identifier_ = "";
  /**
   * <code>string identifier = 1 [json_name = "identifier"];</code>
   * @return The identifier.
   */
  @java.lang.Override
  public java.lang.String getIdentifier() {
    java.lang.Object ref = identifier_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      identifier_ = s;
      return s;
    }
  }
  /**
   * <code>string identifier = 1 [json_name = "identifier"];</code>
   * @return The bytes for identifier.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdentifierBytes() {
    java.lang.Object ref = identifier_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      identifier_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEFINED_VARIANT_FIELD_NUMBER = 2;
  private int definedVariant_ = 0;
  /**
   * <code>.aruna.api.storage.models.v2.ExternalRelationVariant defined_variant = 2 [json_name = "definedVariant"];</code>
   * @return The enum numeric value on the wire for definedVariant.
   */
  @java.lang.Override public int getDefinedVariantValue() {
    return definedVariant_;
  }
  /**
   * <code>.aruna.api.storage.models.v2.ExternalRelationVariant defined_variant = 2 [json_name = "definedVariant"];</code>
   * @return The definedVariant.
   */
  @java.lang.Override public com.aruna.api.storage.models.v2.ExternalRelationVariant getDefinedVariant() {
    com.aruna.api.storage.models.v2.ExternalRelationVariant result = com.aruna.api.storage.models.v2.ExternalRelationVariant.forNumber(definedVariant_);
    return result == null ? com.aruna.api.storage.models.v2.ExternalRelationVariant.UNRECOGNIZED : result;
  }

  public static final int CUSTOM_VARIANT_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object customVariant_ = "";
  /**
   * <pre>
   * Will only be filled if defined_variant == CUSTOM
   * </pre>
   *
   * <code>optional string custom_variant = 3 [json_name = "customVariant"];</code>
   * @return Whether the customVariant field is set.
   */
  @java.lang.Override
  public boolean hasCustomVariant() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Will only be filled if defined_variant == CUSTOM
   * </pre>
   *
   * <code>optional string custom_variant = 3 [json_name = "customVariant"];</code>
   * @return The customVariant.
   */
  @java.lang.Override
  public java.lang.String getCustomVariant() {
    java.lang.Object ref = customVariant_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customVariant_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Will only be filled if defined_variant == CUSTOM
   * </pre>
   *
   * <code>optional string custom_variant = 3 [json_name = "customVariant"];</code>
   * @return The bytes for customVariant.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomVariantBytes() {
    java.lang.Object ref = customVariant_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customVariant_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(identifier_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, identifier_);
    }
    if (definedVariant_ != com.aruna.api.storage.models.v2.ExternalRelationVariant.EXTERNAL_RELATION_VARIANT_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, definedVariant_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, customVariant_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(identifier_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, identifier_);
    }
    if (definedVariant_ != com.aruna.api.storage.models.v2.ExternalRelationVariant.EXTERNAL_RELATION_VARIANT_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, definedVariant_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, customVariant_);
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
    if (!(obj instanceof com.aruna.api.storage.models.v2.ExternalRelation)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.models.v2.ExternalRelation other = (com.aruna.api.storage.models.v2.ExternalRelation) obj;

    if (!getIdentifier()
        .equals(other.getIdentifier())) return false;
    if (definedVariant_ != other.definedVariant_) return false;
    if (hasCustomVariant() != other.hasCustomVariant()) return false;
    if (hasCustomVariant()) {
      if (!getCustomVariant()
          .equals(other.getCustomVariant())) return false;
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
    hash = (37 * hash) + IDENTIFIER_FIELD_NUMBER;
    hash = (53 * hash) + getIdentifier().hashCode();
    hash = (37 * hash) + DEFINED_VARIANT_FIELD_NUMBER;
    hash = (53 * hash) + definedVariant_;
    if (hasCustomVariant()) {
      hash = (37 * hash) + CUSTOM_VARIANT_FIELD_NUMBER;
      hash = (53 * hash) + getCustomVariant().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.models.v2.ExternalRelation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.models.v2.ExternalRelation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.models.v2.ExternalRelation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.models.v2.ExternalRelation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.models.v2.ExternalRelation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.models.v2.ExternalRelation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.models.v2.ExternalRelation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.models.v2.ExternalRelation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.models.v2.ExternalRelation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.models.v2.ExternalRelation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.models.v2.ExternalRelation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.models.v2.ExternalRelation parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.models.v2.ExternalRelation prototype) {
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
   * Protobuf type {@code aruna.api.storage.models.v2.ExternalRelation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.models.v2.ExternalRelation)
      com.aruna.api.storage.models.v2.ExternalRelationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_ExternalRelation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_ExternalRelation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.models.v2.ExternalRelation.class, com.aruna.api.storage.models.v2.ExternalRelation.Builder.class);
    }

    // Construct using com.aruna.api.storage.models.v2.ExternalRelation.newBuilder()
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
      identifier_ = "";
      definedVariant_ = 0;
      customVariant_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_ExternalRelation_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.models.v2.ExternalRelation getDefaultInstanceForType() {
      return com.aruna.api.storage.models.v2.ExternalRelation.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.models.v2.ExternalRelation build() {
      com.aruna.api.storage.models.v2.ExternalRelation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.models.v2.ExternalRelation buildPartial() {
      com.aruna.api.storage.models.v2.ExternalRelation result = new com.aruna.api.storage.models.v2.ExternalRelation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.models.v2.ExternalRelation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.identifier_ = identifier_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.definedVariant_ = definedVariant_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.customVariant_ = customVariant_;
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
      if (other instanceof com.aruna.api.storage.models.v2.ExternalRelation) {
        return mergeFrom((com.aruna.api.storage.models.v2.ExternalRelation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.models.v2.ExternalRelation other) {
      if (other == com.aruna.api.storage.models.v2.ExternalRelation.getDefaultInstance()) return this;
      if (!other.getIdentifier().isEmpty()) {
        identifier_ = other.identifier_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.definedVariant_ != 0) {
        setDefinedVariantValue(other.getDefinedVariantValue());
      }
      if (other.hasCustomVariant()) {
        customVariant_ = other.customVariant_;
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
              identifier_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              definedVariant_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              customVariant_ = input.readStringRequireUtf8();
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

    private java.lang.Object identifier_ = "";
    /**
     * <code>string identifier = 1 [json_name = "identifier"];</code>
     * @return The identifier.
     */
    public java.lang.String getIdentifier() {
      java.lang.Object ref = identifier_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        identifier_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string identifier = 1 [json_name = "identifier"];</code>
     * @return The bytes for identifier.
     */
    public com.google.protobuf.ByteString
        getIdentifierBytes() {
      java.lang.Object ref = identifier_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        identifier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string identifier = 1 [json_name = "identifier"];</code>
     * @param value The identifier to set.
     * @return This builder for chaining.
     */
    public Builder setIdentifier(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      identifier_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string identifier = 1 [json_name = "identifier"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIdentifier() {
      identifier_ = getDefaultInstance().getIdentifier();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string identifier = 1 [json_name = "identifier"];</code>
     * @param value The bytes for identifier to set.
     * @return This builder for chaining.
     */
    public Builder setIdentifierBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      identifier_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int definedVariant_ = 0;
    /**
     * <code>.aruna.api.storage.models.v2.ExternalRelationVariant defined_variant = 2 [json_name = "definedVariant"];</code>
     * @return The enum numeric value on the wire for definedVariant.
     */
    @java.lang.Override public int getDefinedVariantValue() {
      return definedVariant_;
    }
    /**
     * <code>.aruna.api.storage.models.v2.ExternalRelationVariant defined_variant = 2 [json_name = "definedVariant"];</code>
     * @param value The enum numeric value on the wire for definedVariant to set.
     * @return This builder for chaining.
     */
    public Builder setDefinedVariantValue(int value) {
      definedVariant_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.ExternalRelationVariant defined_variant = 2 [json_name = "definedVariant"];</code>
     * @return The definedVariant.
     */
    @java.lang.Override
    public com.aruna.api.storage.models.v2.ExternalRelationVariant getDefinedVariant() {
      com.aruna.api.storage.models.v2.ExternalRelationVariant result = com.aruna.api.storage.models.v2.ExternalRelationVariant.forNumber(definedVariant_);
      return result == null ? com.aruna.api.storage.models.v2.ExternalRelationVariant.UNRECOGNIZED : result;
    }
    /**
     * <code>.aruna.api.storage.models.v2.ExternalRelationVariant defined_variant = 2 [json_name = "definedVariant"];</code>
     * @param value The definedVariant to set.
     * @return This builder for chaining.
     */
    public Builder setDefinedVariant(com.aruna.api.storage.models.v2.ExternalRelationVariant value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      definedVariant_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.ExternalRelationVariant defined_variant = 2 [json_name = "definedVariant"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDefinedVariant() {
      bitField0_ = (bitField0_ & ~0x00000002);
      definedVariant_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object customVariant_ = "";
    /**
     * <pre>
     * Will only be filled if defined_variant == CUSTOM
     * </pre>
     *
     * <code>optional string custom_variant = 3 [json_name = "customVariant"];</code>
     * @return Whether the customVariant field is set.
     */
    public boolean hasCustomVariant() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Will only be filled if defined_variant == CUSTOM
     * </pre>
     *
     * <code>optional string custom_variant = 3 [json_name = "customVariant"];</code>
     * @return The customVariant.
     */
    public java.lang.String getCustomVariant() {
      java.lang.Object ref = customVariant_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customVariant_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Will only be filled if defined_variant == CUSTOM
     * </pre>
     *
     * <code>optional string custom_variant = 3 [json_name = "customVariant"];</code>
     * @return The bytes for customVariant.
     */
    public com.google.protobuf.ByteString
        getCustomVariantBytes() {
      java.lang.Object ref = customVariant_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customVariant_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Will only be filled if defined_variant == CUSTOM
     * </pre>
     *
     * <code>optional string custom_variant = 3 [json_name = "customVariant"];</code>
     * @param value The customVariant to set.
     * @return This builder for chaining.
     */
    public Builder setCustomVariant(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      customVariant_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Will only be filled if defined_variant == CUSTOM
     * </pre>
     *
     * <code>optional string custom_variant = 3 [json_name = "customVariant"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomVariant() {
      customVariant_ = getDefaultInstance().getCustomVariant();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Will only be filled if defined_variant == CUSTOM
     * </pre>
     *
     * <code>optional string custom_variant = 3 [json_name = "customVariant"];</code>
     * @param value The bytes for customVariant to set.
     * @return This builder for chaining.
     */
    public Builder setCustomVariantBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      customVariant_ = value;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.models.v2.ExternalRelation)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.models.v2.ExternalRelation)
  private static final com.aruna.api.storage.models.v2.ExternalRelation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.models.v2.ExternalRelation();
  }

  public static com.aruna.api.storage.models.v2.ExternalRelation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExternalRelation>
      PARSER = new com.google.protobuf.AbstractParser<ExternalRelation>() {
    @java.lang.Override
    public ExternalRelation parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExternalRelation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExternalRelation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.models.v2.ExternalRelation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

