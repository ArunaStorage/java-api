// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/relations_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.DatasetRelations}
 */
public final class DatasetRelations extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.DatasetRelations)
    DatasetRelationsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DatasetRelations.newBuilder() to construct.
  private DatasetRelations(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DatasetRelations() {
    origin_ = "";
    objectChildren_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DatasetRelations();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.RelationsServiceProto.internal_static_aruna_api_storage_services_v2_DatasetRelations_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.RelationsServiceProto.internal_static_aruna_api_storage_services_v2_DatasetRelations_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.DatasetRelations.class, com.aruna.api.storage.services.v2.DatasetRelations.Builder.class);
  }

  public static final int ORIGIN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object origin_ = "";
  /**
   * <code>string origin = 1 [json_name = "origin"];</code>
   * @return The origin.
   */
  @java.lang.Override
  public java.lang.String getOrigin() {
    java.lang.Object ref = origin_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      origin_ = s;
      return s;
    }
  }
  /**
   * <code>string origin = 1 [json_name = "origin"];</code>
   * @return The bytes for origin.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOriginBytes() {
    java.lang.Object ref = origin_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      origin_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OBJECT_CHILDREN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList objectChildren_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string object_children = 2 [json_name = "objectChildren"];</code>
   * @return A list containing the objectChildren.
   */
  public com.google.protobuf.ProtocolStringList
      getObjectChildrenList() {
    return objectChildren_;
  }
  /**
   * <code>repeated string object_children = 2 [json_name = "objectChildren"];</code>
   * @return The count of objectChildren.
   */
  public int getObjectChildrenCount() {
    return objectChildren_.size();
  }
  /**
   * <code>repeated string object_children = 2 [json_name = "objectChildren"];</code>
   * @param index The index of the element to return.
   * @return The objectChildren at the given index.
   */
  public java.lang.String getObjectChildren(int index) {
    return objectChildren_.get(index);
  }
  /**
   * <code>repeated string object_children = 2 [json_name = "objectChildren"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the objectChildren at the given index.
   */
  public com.google.protobuf.ByteString
      getObjectChildrenBytes(int index) {
    return objectChildren_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(origin_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, origin_);
    }
    for (int i = 0; i < objectChildren_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, objectChildren_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(origin_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, origin_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < objectChildren_.size(); i++) {
        dataSize += computeStringSizeNoTag(objectChildren_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getObjectChildrenList().size();
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.DatasetRelations)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.DatasetRelations other = (com.aruna.api.storage.services.v2.DatasetRelations) obj;

    if (!getOrigin()
        .equals(other.getOrigin())) return false;
    if (!getObjectChildrenList()
        .equals(other.getObjectChildrenList())) return false;
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
    hash = (37 * hash) + ORIGIN_FIELD_NUMBER;
    hash = (53 * hash) + getOrigin().hashCode();
    if (getObjectChildrenCount() > 0) {
      hash = (37 * hash) + OBJECT_CHILDREN_FIELD_NUMBER;
      hash = (53 * hash) + getObjectChildrenList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.DatasetRelations parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.DatasetRelations parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.DatasetRelations parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.DatasetRelations parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.DatasetRelations parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.DatasetRelations parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.DatasetRelations parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.DatasetRelations parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.DatasetRelations parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.DatasetRelations parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.DatasetRelations parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.DatasetRelations parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.DatasetRelations prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.DatasetRelations}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.DatasetRelations)
      com.aruna.api.storage.services.v2.DatasetRelationsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.RelationsServiceProto.internal_static_aruna_api_storage_services_v2_DatasetRelations_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.RelationsServiceProto.internal_static_aruna_api_storage_services_v2_DatasetRelations_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.DatasetRelations.class, com.aruna.api.storage.services.v2.DatasetRelations.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.DatasetRelations.newBuilder()
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
      origin_ = "";
      objectChildren_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.RelationsServiceProto.internal_static_aruna_api_storage_services_v2_DatasetRelations_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.DatasetRelations getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.DatasetRelations.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.DatasetRelations build() {
      com.aruna.api.storage.services.v2.DatasetRelations result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.DatasetRelations buildPartial() {
      com.aruna.api.storage.services.v2.DatasetRelations result = new com.aruna.api.storage.services.v2.DatasetRelations(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.DatasetRelations result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.origin_ = origin_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        objectChildren_.makeImmutable();
        result.objectChildren_ = objectChildren_;
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
      if (other instanceof com.aruna.api.storage.services.v2.DatasetRelations) {
        return mergeFrom((com.aruna.api.storage.services.v2.DatasetRelations)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.DatasetRelations other) {
      if (other == com.aruna.api.storage.services.v2.DatasetRelations.getDefaultInstance()) return this;
      if (!other.getOrigin().isEmpty()) {
        origin_ = other.origin_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.objectChildren_.isEmpty()) {
        if (objectChildren_.isEmpty()) {
          objectChildren_ = other.objectChildren_;
          bitField0_ |= 0x00000002;
        } else {
          ensureObjectChildrenIsMutable();
          objectChildren_.addAll(other.objectChildren_);
        }
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
              origin_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureObjectChildrenIsMutable();
              objectChildren_.add(s);
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

    private java.lang.Object origin_ = "";
    /**
     * <code>string origin = 1 [json_name = "origin"];</code>
     * @return The origin.
     */
    public java.lang.String getOrigin() {
      java.lang.Object ref = origin_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        origin_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string origin = 1 [json_name = "origin"];</code>
     * @return The bytes for origin.
     */
    public com.google.protobuf.ByteString
        getOriginBytes() {
      java.lang.Object ref = origin_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        origin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string origin = 1 [json_name = "origin"];</code>
     * @param value The origin to set.
     * @return This builder for chaining.
     */
    public Builder setOrigin(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      origin_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string origin = 1 [json_name = "origin"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrigin() {
      origin_ = getDefaultInstance().getOrigin();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string origin = 1 [json_name = "origin"];</code>
     * @param value The bytes for origin to set.
     * @return This builder for chaining.
     */
    public Builder setOriginBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      origin_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList objectChildren_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureObjectChildrenIsMutable() {
      if (!objectChildren_.isModifiable()) {
        objectChildren_ = new com.google.protobuf.LazyStringArrayList(objectChildren_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>repeated string object_children = 2 [json_name = "objectChildren"];</code>
     * @return A list containing the objectChildren.
     */
    public com.google.protobuf.ProtocolStringList
        getObjectChildrenList() {
      objectChildren_.makeImmutable();
      return objectChildren_;
    }
    /**
     * <code>repeated string object_children = 2 [json_name = "objectChildren"];</code>
     * @return The count of objectChildren.
     */
    public int getObjectChildrenCount() {
      return objectChildren_.size();
    }
    /**
     * <code>repeated string object_children = 2 [json_name = "objectChildren"];</code>
     * @param index The index of the element to return.
     * @return The objectChildren at the given index.
     */
    public java.lang.String getObjectChildren(int index) {
      return objectChildren_.get(index);
    }
    /**
     * <code>repeated string object_children = 2 [json_name = "objectChildren"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the objectChildren at the given index.
     */
    public com.google.protobuf.ByteString
        getObjectChildrenBytes(int index) {
      return objectChildren_.getByteString(index);
    }
    /**
     * <code>repeated string object_children = 2 [json_name = "objectChildren"];</code>
     * @param index The index to set the value at.
     * @param value The objectChildren to set.
     * @return This builder for chaining.
     */
    public Builder setObjectChildren(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureObjectChildrenIsMutable();
      objectChildren_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string object_children = 2 [json_name = "objectChildren"];</code>
     * @param value The objectChildren to add.
     * @return This builder for chaining.
     */
    public Builder addObjectChildren(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureObjectChildrenIsMutable();
      objectChildren_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string object_children = 2 [json_name = "objectChildren"];</code>
     * @param values The objectChildren to add.
     * @return This builder for chaining.
     */
    public Builder addAllObjectChildren(
        java.lang.Iterable<java.lang.String> values) {
      ensureObjectChildrenIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, objectChildren_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string object_children = 2 [json_name = "objectChildren"];</code>
     * @return This builder for chaining.
     */
    public Builder clearObjectChildren() {
      objectChildren_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string object_children = 2 [json_name = "objectChildren"];</code>
     * @param value The bytes of the objectChildren to add.
     * @return This builder for chaining.
     */
    public Builder addObjectChildrenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureObjectChildrenIsMutable();
      objectChildren_.add(value);
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.DatasetRelations)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.DatasetRelations)
  private static final com.aruna.api.storage.services.v2.DatasetRelations DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.DatasetRelations();
  }

  public static com.aruna.api.storage.services.v2.DatasetRelations getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DatasetRelations>
      PARSER = new com.google.protobuf.AbstractParser<DatasetRelations>() {
    @java.lang.Override
    public DatasetRelations parsePartialFrom(
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

  public static com.google.protobuf.Parser<DatasetRelations> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DatasetRelations> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.DatasetRelations getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

