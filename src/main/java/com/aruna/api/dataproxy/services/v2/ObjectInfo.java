// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/dataproxy/services/v2/dataproxy_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.dataproxy.services.v2;

/**
 * Protobuf type {@code aruna.api.dataproxy.services.v2.ObjectInfo}
 */
public final class ObjectInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.dataproxy.services.v2.ObjectInfo)
    ObjectInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ObjectInfo.newBuilder() to construct.
  private ObjectInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ObjectInfo() {
    objectId_ = "";
    extra_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ObjectInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_ObjectInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_ObjectInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.dataproxy.services.v2.ObjectInfo.class, com.aruna.api.dataproxy.services.v2.ObjectInfo.Builder.class);
  }

  private int bitField0_;
  public static final int OBJECT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object objectId_ = "";
  /**
   * <code>string object_id = 1 [json_name = "objectId"];</code>
   * @return The objectId.
   */
  @java.lang.Override
  public java.lang.String getObjectId() {
    java.lang.Object ref = objectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      objectId_ = s;
      return s;
    }
  }
  /**
   * <code>string object_id = 1 [json_name = "objectId"];</code>
   * @return The bytes for objectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getObjectIdBytes() {
    java.lang.Object ref = objectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      objectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHUNKS_FIELD_NUMBER = 2;
  private long chunks_ = 0L;
  /**
   * <pre>
   * == (Compressed_size / (65536 + 28)) + 1
   * </pre>
   *
   * <code>int64 chunks = 2 [json_name = "chunks"];</code>
   * @return The chunks.
   */
  @java.lang.Override
  public long getChunks() {
    return chunks_;
  }

  public static final int RAW_SIZE_FIELD_NUMBER = 3;
  private long rawSize_ = 0L;
  /**
   * <code>int64 raw_size = 3 [json_name = "rawSize"];</code>
   * @return The rawSize.
   */
  @java.lang.Override
  public long getRawSize() {
    return rawSize_;
  }

  public static final int COMPRESSED_SIZE_FIELD_NUMBER = 4;
  private long compressedSize_ = 0L;
  /**
   * <code>int64 compressed_size = 4 [json_name = "compressedSize"];</code>
   * @return The compressedSize.
   */
  @java.lang.Override
  public long getCompressedSize() {
    return compressedSize_;
  }

  public static final int EXTRA_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object extra_ = "";
  /**
   * <pre>
   * JSON encoded proxy specific extra fields
   * </pre>
   *
   * <code>optional string extra = 5 [json_name = "extra"];</code>
   * @return Whether the extra field is set.
   */
  @java.lang.Override
  public boolean hasExtra() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * JSON encoded proxy specific extra fields
   * </pre>
   *
   * <code>optional string extra = 5 [json_name = "extra"];</code>
   * @return The extra.
   */
  @java.lang.Override
  public java.lang.String getExtra() {
    java.lang.Object ref = extra_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      extra_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * JSON encoded proxy specific extra fields
   * </pre>
   *
   * <code>optional string extra = 5 [json_name = "extra"];</code>
   * @return The bytes for extra.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExtraBytes() {
    java.lang.Object ref = extra_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      extra_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(objectId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, objectId_);
    }
    if (chunks_ != 0L) {
      output.writeInt64(2, chunks_);
    }
    if (rawSize_ != 0L) {
      output.writeInt64(3, rawSize_);
    }
    if (compressedSize_ != 0L) {
      output.writeInt64(4, compressedSize_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, extra_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(objectId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, objectId_);
    }
    if (chunks_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, chunks_);
    }
    if (rawSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, rawSize_);
    }
    if (compressedSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, compressedSize_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, extra_);
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
    if (!(obj instanceof com.aruna.api.dataproxy.services.v2.ObjectInfo)) {
      return super.equals(obj);
    }
    com.aruna.api.dataproxy.services.v2.ObjectInfo other = (com.aruna.api.dataproxy.services.v2.ObjectInfo) obj;

    if (!getObjectId()
        .equals(other.getObjectId())) return false;
    if (getChunks()
        != other.getChunks()) return false;
    if (getRawSize()
        != other.getRawSize()) return false;
    if (getCompressedSize()
        != other.getCompressedSize()) return false;
    if (hasExtra() != other.hasExtra()) return false;
    if (hasExtra()) {
      if (!getExtra()
          .equals(other.getExtra())) return false;
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
    hash = (37 * hash) + OBJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getObjectId().hashCode();
    hash = (37 * hash) + CHUNKS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getChunks());
    hash = (37 * hash) + RAW_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRawSize());
    hash = (37 * hash) + COMPRESSED_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCompressedSize());
    if (hasExtra()) {
      hash = (37 * hash) + EXTRA_FIELD_NUMBER;
      hash = (53 * hash) + getExtra().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.dataproxy.services.v2.ObjectInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.dataproxy.services.v2.ObjectInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.ObjectInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.dataproxy.services.v2.ObjectInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.ObjectInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.dataproxy.services.v2.ObjectInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.ObjectInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.dataproxy.services.v2.ObjectInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.dataproxy.services.v2.ObjectInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.dataproxy.services.v2.ObjectInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.ObjectInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.dataproxy.services.v2.ObjectInfo parseFrom(
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
  public static Builder newBuilder(com.aruna.api.dataproxy.services.v2.ObjectInfo prototype) {
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
   * Protobuf type {@code aruna.api.dataproxy.services.v2.ObjectInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.dataproxy.services.v2.ObjectInfo)
      com.aruna.api.dataproxy.services.v2.ObjectInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_ObjectInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_ObjectInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.dataproxy.services.v2.ObjectInfo.class, com.aruna.api.dataproxy.services.v2.ObjectInfo.Builder.class);
    }

    // Construct using com.aruna.api.dataproxy.services.v2.ObjectInfo.newBuilder()
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
      objectId_ = "";
      chunks_ = 0L;
      rawSize_ = 0L;
      compressedSize_ = 0L;
      extra_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_ObjectInfo_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.ObjectInfo getDefaultInstanceForType() {
      return com.aruna.api.dataproxy.services.v2.ObjectInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.ObjectInfo build() {
      com.aruna.api.dataproxy.services.v2.ObjectInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.ObjectInfo buildPartial() {
      com.aruna.api.dataproxy.services.v2.ObjectInfo result = new com.aruna.api.dataproxy.services.v2.ObjectInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.dataproxy.services.v2.ObjectInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.objectId_ = objectId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.chunks_ = chunks_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.rawSize_ = rawSize_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.compressedSize_ = compressedSize_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.extra_ = extra_;
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
      if (other instanceof com.aruna.api.dataproxy.services.v2.ObjectInfo) {
        return mergeFrom((com.aruna.api.dataproxy.services.v2.ObjectInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.dataproxy.services.v2.ObjectInfo other) {
      if (other == com.aruna.api.dataproxy.services.v2.ObjectInfo.getDefaultInstance()) return this;
      if (!other.getObjectId().isEmpty()) {
        objectId_ = other.objectId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getChunks() != 0L) {
        setChunks(other.getChunks());
      }
      if (other.getRawSize() != 0L) {
        setRawSize(other.getRawSize());
      }
      if (other.getCompressedSize() != 0L) {
        setCompressedSize(other.getCompressedSize());
      }
      if (other.hasExtra()) {
        extra_ = other.extra_;
        bitField0_ |= 0x00000010;
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
              objectId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              chunks_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              rawSize_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              compressedSize_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              extra_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private java.lang.Object objectId_ = "";
    /**
     * <code>string object_id = 1 [json_name = "objectId"];</code>
     * @return The objectId.
     */
    public java.lang.String getObjectId() {
      java.lang.Object ref = objectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        objectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string object_id = 1 [json_name = "objectId"];</code>
     * @return The bytes for objectId.
     */
    public com.google.protobuf.ByteString
        getObjectIdBytes() {
      java.lang.Object ref = objectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        objectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string object_id = 1 [json_name = "objectId"];</code>
     * @param value The objectId to set.
     * @return This builder for chaining.
     */
    public Builder setObjectId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      objectId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string object_id = 1 [json_name = "objectId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearObjectId() {
      objectId_ = getDefaultInstance().getObjectId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string object_id = 1 [json_name = "objectId"];</code>
     * @param value The bytes for objectId to set.
     * @return This builder for chaining.
     */
    public Builder setObjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      objectId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long chunks_ ;
    /**
     * <pre>
     * == (Compressed_size / (65536 + 28)) + 1
     * </pre>
     *
     * <code>int64 chunks = 2 [json_name = "chunks"];</code>
     * @return The chunks.
     */
    @java.lang.Override
    public long getChunks() {
      return chunks_;
    }
    /**
     * <pre>
     * == (Compressed_size / (65536 + 28)) + 1
     * </pre>
     *
     * <code>int64 chunks = 2 [json_name = "chunks"];</code>
     * @param value The chunks to set.
     * @return This builder for chaining.
     */
    public Builder setChunks(long value) {

      chunks_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * == (Compressed_size / (65536 + 28)) + 1
     * </pre>
     *
     * <code>int64 chunks = 2 [json_name = "chunks"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChunks() {
      bitField0_ = (bitField0_ & ~0x00000002);
      chunks_ = 0L;
      onChanged();
      return this;
    }

    private long rawSize_ ;
    /**
     * <code>int64 raw_size = 3 [json_name = "rawSize"];</code>
     * @return The rawSize.
     */
    @java.lang.Override
    public long getRawSize() {
      return rawSize_;
    }
    /**
     * <code>int64 raw_size = 3 [json_name = "rawSize"];</code>
     * @param value The rawSize to set.
     * @return This builder for chaining.
     */
    public Builder setRawSize(long value) {

      rawSize_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 raw_size = 3 [json_name = "rawSize"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRawSize() {
      bitField0_ = (bitField0_ & ~0x00000004);
      rawSize_ = 0L;
      onChanged();
      return this;
    }

    private long compressedSize_ ;
    /**
     * <code>int64 compressed_size = 4 [json_name = "compressedSize"];</code>
     * @return The compressedSize.
     */
    @java.lang.Override
    public long getCompressedSize() {
      return compressedSize_;
    }
    /**
     * <code>int64 compressed_size = 4 [json_name = "compressedSize"];</code>
     * @param value The compressedSize to set.
     * @return This builder for chaining.
     */
    public Builder setCompressedSize(long value) {

      compressedSize_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int64 compressed_size = 4 [json_name = "compressedSize"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCompressedSize() {
      bitField0_ = (bitField0_ & ~0x00000008);
      compressedSize_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object extra_ = "";
    /**
     * <pre>
     * JSON encoded proxy specific extra fields
     * </pre>
     *
     * <code>optional string extra = 5 [json_name = "extra"];</code>
     * @return Whether the extra field is set.
     */
    public boolean hasExtra() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * JSON encoded proxy specific extra fields
     * </pre>
     *
     * <code>optional string extra = 5 [json_name = "extra"];</code>
     * @return The extra.
     */
    public java.lang.String getExtra() {
      java.lang.Object ref = extra_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        extra_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * JSON encoded proxy specific extra fields
     * </pre>
     *
     * <code>optional string extra = 5 [json_name = "extra"];</code>
     * @return The bytes for extra.
     */
    public com.google.protobuf.ByteString
        getExtraBytes() {
      java.lang.Object ref = extra_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        extra_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * JSON encoded proxy specific extra fields
     * </pre>
     *
     * <code>optional string extra = 5 [json_name = "extra"];</code>
     * @param value The extra to set.
     * @return This builder for chaining.
     */
    public Builder setExtra(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      extra_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * JSON encoded proxy specific extra fields
     * </pre>
     *
     * <code>optional string extra = 5 [json_name = "extra"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExtra() {
      extra_ = getDefaultInstance().getExtra();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * JSON encoded proxy specific extra fields
     * </pre>
     *
     * <code>optional string extra = 5 [json_name = "extra"];</code>
     * @param value The bytes for extra to set.
     * @return This builder for chaining.
     */
    public Builder setExtraBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      extra_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.dataproxy.services.v2.ObjectInfo)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.dataproxy.services.v2.ObjectInfo)
  private static final com.aruna.api.dataproxy.services.v2.ObjectInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.dataproxy.services.v2.ObjectInfo();
  }

  public static com.aruna.api.dataproxy.services.v2.ObjectInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ObjectInfo>
      PARSER = new com.google.protobuf.AbstractParser<ObjectInfo>() {
    @java.lang.Override
    public ObjectInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<ObjectInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ObjectInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.dataproxy.services.v2.ObjectInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

