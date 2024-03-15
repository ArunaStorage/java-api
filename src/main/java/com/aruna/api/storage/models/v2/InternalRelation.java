// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.models.v2;

/**
 * Protobuf type {@code aruna.api.storage.models.v2.InternalRelation}
 */
public final class InternalRelation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.models.v2.InternalRelation)
    InternalRelationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InternalRelation.newBuilder() to construct.
  private InternalRelation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InternalRelation() {
    resourceId_ = "";
    resourceVariant_ = 0;
    definedVariant_ = 0;
    customVariant_ = "";
    direction_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InternalRelation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_InternalRelation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_InternalRelation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.models.v2.InternalRelation.class, com.aruna.api.storage.models.v2.InternalRelation.Builder.class);
  }

  private int bitField0_;
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

  public static final int RESOURCE_VARIANT_FIELD_NUMBER = 2;
  private int resourceVariant_ = 0;
  /**
   * <code>.aruna.api.storage.models.v2.ResourceVariant resource_variant = 2 [json_name = "resourceVariant"];</code>
   * @return The enum numeric value on the wire for resourceVariant.
   */
  @java.lang.Override public int getResourceVariantValue() {
    return resourceVariant_;
  }
  /**
   * <code>.aruna.api.storage.models.v2.ResourceVariant resource_variant = 2 [json_name = "resourceVariant"];</code>
   * @return The resourceVariant.
   */
  @java.lang.Override public com.aruna.api.storage.models.v2.ResourceVariant getResourceVariant() {
    com.aruna.api.storage.models.v2.ResourceVariant result = com.aruna.api.storage.models.v2.ResourceVariant.forNumber(resourceVariant_);
    return result == null ? com.aruna.api.storage.models.v2.ResourceVariant.UNRECOGNIZED : result;
  }

  public static final int DEFINED_VARIANT_FIELD_NUMBER = 3;
  private int definedVariant_ = 0;
  /**
   * <code>.aruna.api.storage.models.v2.InternalRelationVariant defined_variant = 3 [json_name = "definedVariant"];</code>
   * @return The enum numeric value on the wire for definedVariant.
   */
  @java.lang.Override public int getDefinedVariantValue() {
    return definedVariant_;
  }
  /**
   * <code>.aruna.api.storage.models.v2.InternalRelationVariant defined_variant = 3 [json_name = "definedVariant"];</code>
   * @return The definedVariant.
   */
  @java.lang.Override public com.aruna.api.storage.models.v2.InternalRelationVariant getDefinedVariant() {
    com.aruna.api.storage.models.v2.InternalRelationVariant result = com.aruna.api.storage.models.v2.InternalRelationVariant.forNumber(definedVariant_);
    return result == null ? com.aruna.api.storage.models.v2.InternalRelationVariant.UNRECOGNIZED : result;
  }

  public static final int CUSTOM_VARIANT_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object customVariant_ = "";
  /**
   * <pre>
   * Will only be filled if defined_variant == CUSTOM
   * </pre>
   *
   * <code>optional string custom_variant = 4 [json_name = "customVariant"];</code>
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
   * <code>optional string custom_variant = 4 [json_name = "customVariant"];</code>
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
   * <code>optional string custom_variant = 4 [json_name = "customVariant"];</code>
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

  public static final int DIRECTION_FIELD_NUMBER = 5;
  private int direction_ = 0;
  /**
   * <code>.aruna.api.storage.models.v2.RelationDirection direction = 5 [json_name = "direction"];</code>
   * @return The enum numeric value on the wire for direction.
   */
  @java.lang.Override public int getDirectionValue() {
    return direction_;
  }
  /**
   * <code>.aruna.api.storage.models.v2.RelationDirection direction = 5 [json_name = "direction"];</code>
   * @return The direction.
   */
  @java.lang.Override public com.aruna.api.storage.models.v2.RelationDirection getDirection() {
    com.aruna.api.storage.models.v2.RelationDirection result = com.aruna.api.storage.models.v2.RelationDirection.forNumber(direction_);
    return result == null ? com.aruna.api.storage.models.v2.RelationDirection.UNRECOGNIZED : result;
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
    if (resourceVariant_ != com.aruna.api.storage.models.v2.ResourceVariant.RESOURCE_VARIANT_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, resourceVariant_);
    }
    if (definedVariant_ != com.aruna.api.storage.models.v2.InternalRelationVariant.INTERNAL_RELATION_VARIANT_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, definedVariant_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, customVariant_);
    }
    if (direction_ != com.aruna.api.storage.models.v2.RelationDirection.RELATION_DIRECTION_UNSPECIFIED.getNumber()) {
      output.writeEnum(5, direction_);
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
    if (resourceVariant_ != com.aruna.api.storage.models.v2.ResourceVariant.RESOURCE_VARIANT_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, resourceVariant_);
    }
    if (definedVariant_ != com.aruna.api.storage.models.v2.InternalRelationVariant.INTERNAL_RELATION_VARIANT_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, definedVariant_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, customVariant_);
    }
    if (direction_ != com.aruna.api.storage.models.v2.RelationDirection.RELATION_DIRECTION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, direction_);
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
    if (!(obj instanceof com.aruna.api.storage.models.v2.InternalRelation)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.models.v2.InternalRelation other = (com.aruna.api.storage.models.v2.InternalRelation) obj;

    if (!getResourceId()
        .equals(other.getResourceId())) return false;
    if (resourceVariant_ != other.resourceVariant_) return false;
    if (definedVariant_ != other.definedVariant_) return false;
    if (hasCustomVariant() != other.hasCustomVariant()) return false;
    if (hasCustomVariant()) {
      if (!getCustomVariant()
          .equals(other.getCustomVariant())) return false;
    }
    if (direction_ != other.direction_) return false;
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
    hash = (37 * hash) + RESOURCE_VARIANT_FIELD_NUMBER;
    hash = (53 * hash) + resourceVariant_;
    hash = (37 * hash) + DEFINED_VARIANT_FIELD_NUMBER;
    hash = (53 * hash) + definedVariant_;
    if (hasCustomVariant()) {
      hash = (37 * hash) + CUSTOM_VARIANT_FIELD_NUMBER;
      hash = (53 * hash) + getCustomVariant().hashCode();
    }
    hash = (37 * hash) + DIRECTION_FIELD_NUMBER;
    hash = (53 * hash) + direction_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.models.v2.InternalRelation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.models.v2.InternalRelation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.models.v2.InternalRelation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.models.v2.InternalRelation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.models.v2.InternalRelation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.models.v2.InternalRelation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.models.v2.InternalRelation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.models.v2.InternalRelation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.models.v2.InternalRelation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.models.v2.InternalRelation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.models.v2.InternalRelation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.models.v2.InternalRelation parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.models.v2.InternalRelation prototype) {
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
   * Protobuf type {@code aruna.api.storage.models.v2.InternalRelation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.models.v2.InternalRelation)
      com.aruna.api.storage.models.v2.InternalRelationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_InternalRelation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_InternalRelation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.models.v2.InternalRelation.class, com.aruna.api.storage.models.v2.InternalRelation.Builder.class);
    }

    // Construct using com.aruna.api.storage.models.v2.InternalRelation.newBuilder()
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
      resourceVariant_ = 0;
      definedVariant_ = 0;
      customVariant_ = "";
      direction_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_InternalRelation_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.models.v2.InternalRelation getDefaultInstanceForType() {
      return com.aruna.api.storage.models.v2.InternalRelation.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.models.v2.InternalRelation build() {
      com.aruna.api.storage.models.v2.InternalRelation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.models.v2.InternalRelation buildPartial() {
      com.aruna.api.storage.models.v2.InternalRelation result = new com.aruna.api.storage.models.v2.InternalRelation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.models.v2.InternalRelation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceId_ = resourceId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.resourceVariant_ = resourceVariant_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.definedVariant_ = definedVariant_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.customVariant_ = customVariant_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.direction_ = direction_;
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
      if (other instanceof com.aruna.api.storage.models.v2.InternalRelation) {
        return mergeFrom((com.aruna.api.storage.models.v2.InternalRelation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.models.v2.InternalRelation other) {
      if (other == com.aruna.api.storage.models.v2.InternalRelation.getDefaultInstance()) return this;
      if (!other.getResourceId().isEmpty()) {
        resourceId_ = other.resourceId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.resourceVariant_ != 0) {
        setResourceVariantValue(other.getResourceVariantValue());
      }
      if (other.definedVariant_ != 0) {
        setDefinedVariantValue(other.getDefinedVariantValue());
      }
      if (other.hasCustomVariant()) {
        customVariant_ = other.customVariant_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.direction_ != 0) {
        setDirectionValue(other.getDirectionValue());
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
            case 16: {
              resourceVariant_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              definedVariant_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              customVariant_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              direction_ = input.readEnum();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private int resourceVariant_ = 0;
    /**
     * <code>.aruna.api.storage.models.v2.ResourceVariant resource_variant = 2 [json_name = "resourceVariant"];</code>
     * @return The enum numeric value on the wire for resourceVariant.
     */
    @java.lang.Override public int getResourceVariantValue() {
      return resourceVariant_;
    }
    /**
     * <code>.aruna.api.storage.models.v2.ResourceVariant resource_variant = 2 [json_name = "resourceVariant"];</code>
     * @param value The enum numeric value on the wire for resourceVariant to set.
     * @return This builder for chaining.
     */
    public Builder setResourceVariantValue(int value) {
      resourceVariant_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.ResourceVariant resource_variant = 2 [json_name = "resourceVariant"];</code>
     * @return The resourceVariant.
     */
    @java.lang.Override
    public com.aruna.api.storage.models.v2.ResourceVariant getResourceVariant() {
      com.aruna.api.storage.models.v2.ResourceVariant result = com.aruna.api.storage.models.v2.ResourceVariant.forNumber(resourceVariant_);
      return result == null ? com.aruna.api.storage.models.v2.ResourceVariant.UNRECOGNIZED : result;
    }
    /**
     * <code>.aruna.api.storage.models.v2.ResourceVariant resource_variant = 2 [json_name = "resourceVariant"];</code>
     * @param value The resourceVariant to set.
     * @return This builder for chaining.
     */
    public Builder setResourceVariant(com.aruna.api.storage.models.v2.ResourceVariant value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      resourceVariant_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.ResourceVariant resource_variant = 2 [json_name = "resourceVariant"];</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceVariant() {
      bitField0_ = (bitField0_ & ~0x00000002);
      resourceVariant_ = 0;
      onChanged();
      return this;
    }

    private int definedVariant_ = 0;
    /**
     * <code>.aruna.api.storage.models.v2.InternalRelationVariant defined_variant = 3 [json_name = "definedVariant"];</code>
     * @return The enum numeric value on the wire for definedVariant.
     */
    @java.lang.Override public int getDefinedVariantValue() {
      return definedVariant_;
    }
    /**
     * <code>.aruna.api.storage.models.v2.InternalRelationVariant defined_variant = 3 [json_name = "definedVariant"];</code>
     * @param value The enum numeric value on the wire for definedVariant to set.
     * @return This builder for chaining.
     */
    public Builder setDefinedVariantValue(int value) {
      definedVariant_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.InternalRelationVariant defined_variant = 3 [json_name = "definedVariant"];</code>
     * @return The definedVariant.
     */
    @java.lang.Override
    public com.aruna.api.storage.models.v2.InternalRelationVariant getDefinedVariant() {
      com.aruna.api.storage.models.v2.InternalRelationVariant result = com.aruna.api.storage.models.v2.InternalRelationVariant.forNumber(definedVariant_);
      return result == null ? com.aruna.api.storage.models.v2.InternalRelationVariant.UNRECOGNIZED : result;
    }
    /**
     * <code>.aruna.api.storage.models.v2.InternalRelationVariant defined_variant = 3 [json_name = "definedVariant"];</code>
     * @param value The definedVariant to set.
     * @return This builder for chaining.
     */
    public Builder setDefinedVariant(com.aruna.api.storage.models.v2.InternalRelationVariant value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      definedVariant_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.InternalRelationVariant defined_variant = 3 [json_name = "definedVariant"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDefinedVariant() {
      bitField0_ = (bitField0_ & ~0x00000004);
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
     * <code>optional string custom_variant = 4 [json_name = "customVariant"];</code>
     * @return Whether the customVariant field is set.
     */
    public boolean hasCustomVariant() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Will only be filled if defined_variant == CUSTOM
     * </pre>
     *
     * <code>optional string custom_variant = 4 [json_name = "customVariant"];</code>
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
     * <code>optional string custom_variant = 4 [json_name = "customVariant"];</code>
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
     * <code>optional string custom_variant = 4 [json_name = "customVariant"];</code>
     * @param value The customVariant to set.
     * @return This builder for chaining.
     */
    public Builder setCustomVariant(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      customVariant_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Will only be filled if defined_variant == CUSTOM
     * </pre>
     *
     * <code>optional string custom_variant = 4 [json_name = "customVariant"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomVariant() {
      customVariant_ = getDefaultInstance().getCustomVariant();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Will only be filled if defined_variant == CUSTOM
     * </pre>
     *
     * <code>optional string custom_variant = 4 [json_name = "customVariant"];</code>
     * @param value The bytes for customVariant to set.
     * @return This builder for chaining.
     */
    public Builder setCustomVariantBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      customVariant_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private int direction_ = 0;
    /**
     * <code>.aruna.api.storage.models.v2.RelationDirection direction = 5 [json_name = "direction"];</code>
     * @return The enum numeric value on the wire for direction.
     */
    @java.lang.Override public int getDirectionValue() {
      return direction_;
    }
    /**
     * <code>.aruna.api.storage.models.v2.RelationDirection direction = 5 [json_name = "direction"];</code>
     * @param value The enum numeric value on the wire for direction to set.
     * @return This builder for chaining.
     */
    public Builder setDirectionValue(int value) {
      direction_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.RelationDirection direction = 5 [json_name = "direction"];</code>
     * @return The direction.
     */
    @java.lang.Override
    public com.aruna.api.storage.models.v2.RelationDirection getDirection() {
      com.aruna.api.storage.models.v2.RelationDirection result = com.aruna.api.storage.models.v2.RelationDirection.forNumber(direction_);
      return result == null ? com.aruna.api.storage.models.v2.RelationDirection.UNRECOGNIZED : result;
    }
    /**
     * <code>.aruna.api.storage.models.v2.RelationDirection direction = 5 [json_name = "direction"];</code>
     * @param value The direction to set.
     * @return This builder for chaining.
     */
    public Builder setDirection(com.aruna.api.storage.models.v2.RelationDirection value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000010;
      direction_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.RelationDirection direction = 5 [json_name = "direction"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDirection() {
      bitField0_ = (bitField0_ & ~0x00000010);
      direction_ = 0;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.models.v2.InternalRelation)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.models.v2.InternalRelation)
  private static final com.aruna.api.storage.models.v2.InternalRelation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.models.v2.InternalRelation();
  }

  public static com.aruna.api.storage.models.v2.InternalRelation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InternalRelation>
      PARSER = new com.google.protobuf.AbstractParser<InternalRelation>() {
    @java.lang.Override
    public InternalRelation parsePartialFrom(
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

  public static com.google.protobuf.Parser<InternalRelation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InternalRelation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.models.v2.InternalRelation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

