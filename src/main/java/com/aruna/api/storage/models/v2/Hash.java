// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.models.v2;

/**
 * Protobuf type {@code aruna.api.storage.models.v2.Hash}
 */
public final class Hash extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.models.v2.Hash)
    HashOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Hash.newBuilder() to construct.
  private Hash(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Hash() {
    alg_ = 0;
    hash_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Hash();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_Hash_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_Hash_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.models.v2.Hash.class, com.aruna.api.storage.models.v2.Hash.Builder.class);
  }

  public static final int ALG_FIELD_NUMBER = 1;
  private int alg_ = 0;
  /**
   * <code>.aruna.api.storage.models.v2.Hashalgorithm alg = 1 [json_name = "alg"];</code>
   * @return The enum numeric value on the wire for alg.
   */
  @java.lang.Override public int getAlgValue() {
    return alg_;
  }
  /**
   * <code>.aruna.api.storage.models.v2.Hashalgorithm alg = 1 [json_name = "alg"];</code>
   * @return The alg.
   */
  @java.lang.Override public com.aruna.api.storage.models.v2.Hashalgorithm getAlg() {
    com.aruna.api.storage.models.v2.Hashalgorithm result = com.aruna.api.storage.models.v2.Hashalgorithm.forNumber(alg_);
    return result == null ? com.aruna.api.storage.models.v2.Hashalgorithm.UNRECOGNIZED : result;
  }

  public static final int HASH_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object hash_ = "";
  /**
   * <code>string hash = 2 [json_name = "hash"];</code>
   * @return The hash.
   */
  @java.lang.Override
  public java.lang.String getHash() {
    java.lang.Object ref = hash_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hash_ = s;
      return s;
    }
  }
  /**
   * <code>string hash = 2 [json_name = "hash"];</code>
   * @return The bytes for hash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHashBytes() {
    java.lang.Object ref = hash_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hash_ = b;
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
    if (alg_ != com.aruna.api.storage.models.v2.Hashalgorithm.HASHALGORITHM_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, alg_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hash_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, hash_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (alg_ != com.aruna.api.storage.models.v2.Hashalgorithm.HASHALGORITHM_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, alg_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hash_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, hash_);
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
    if (!(obj instanceof com.aruna.api.storage.models.v2.Hash)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.models.v2.Hash other = (com.aruna.api.storage.models.v2.Hash) obj;

    if (alg_ != other.alg_) return false;
    if (!getHash()
        .equals(other.getHash())) return false;
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
    hash = (37 * hash) + ALG_FIELD_NUMBER;
    hash = (53 * hash) + alg_;
    hash = (37 * hash) + HASH_FIELD_NUMBER;
    hash = (53 * hash) + getHash().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.models.v2.Hash parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.models.v2.Hash parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.models.v2.Hash parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.models.v2.Hash parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.models.v2.Hash parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.models.v2.Hash parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.models.v2.Hash parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.models.v2.Hash parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.models.v2.Hash parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.models.v2.Hash parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.models.v2.Hash parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.models.v2.Hash parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.models.v2.Hash prototype) {
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
   * Protobuf type {@code aruna.api.storage.models.v2.Hash}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.models.v2.Hash)
      com.aruna.api.storage.models.v2.HashOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_Hash_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_Hash_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.models.v2.Hash.class, com.aruna.api.storage.models.v2.Hash.Builder.class);
    }

    // Construct using com.aruna.api.storage.models.v2.Hash.newBuilder()
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
      alg_ = 0;
      hash_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.models.v2.ModelsProto.internal_static_aruna_api_storage_models_v2_Hash_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.models.v2.Hash getDefaultInstanceForType() {
      return com.aruna.api.storage.models.v2.Hash.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.models.v2.Hash build() {
      com.aruna.api.storage.models.v2.Hash result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.models.v2.Hash buildPartial() {
      com.aruna.api.storage.models.v2.Hash result = new com.aruna.api.storage.models.v2.Hash(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.models.v2.Hash result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.alg_ = alg_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.hash_ = hash_;
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
      if (other instanceof com.aruna.api.storage.models.v2.Hash) {
        return mergeFrom((com.aruna.api.storage.models.v2.Hash)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.models.v2.Hash other) {
      if (other == com.aruna.api.storage.models.v2.Hash.getDefaultInstance()) return this;
      if (other.alg_ != 0) {
        setAlgValue(other.getAlgValue());
      }
      if (!other.getHash().isEmpty()) {
        hash_ = other.hash_;
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
            case 8: {
              alg_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              hash_ = input.readStringRequireUtf8();
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

    private int alg_ = 0;
    /**
     * <code>.aruna.api.storage.models.v2.Hashalgorithm alg = 1 [json_name = "alg"];</code>
     * @return The enum numeric value on the wire for alg.
     */
    @java.lang.Override public int getAlgValue() {
      return alg_;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Hashalgorithm alg = 1 [json_name = "alg"];</code>
     * @param value The enum numeric value on the wire for alg to set.
     * @return This builder for chaining.
     */
    public Builder setAlgValue(int value) {
      alg_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Hashalgorithm alg = 1 [json_name = "alg"];</code>
     * @return The alg.
     */
    @java.lang.Override
    public com.aruna.api.storage.models.v2.Hashalgorithm getAlg() {
      com.aruna.api.storage.models.v2.Hashalgorithm result = com.aruna.api.storage.models.v2.Hashalgorithm.forNumber(alg_);
      return result == null ? com.aruna.api.storage.models.v2.Hashalgorithm.UNRECOGNIZED : result;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Hashalgorithm alg = 1 [json_name = "alg"];</code>
     * @param value The alg to set.
     * @return This builder for chaining.
     */
    public Builder setAlg(com.aruna.api.storage.models.v2.Hashalgorithm value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      alg_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.storage.models.v2.Hashalgorithm alg = 1 [json_name = "alg"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAlg() {
      bitField0_ = (bitField0_ & ~0x00000001);
      alg_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object hash_ = "";
    /**
     * <code>string hash = 2 [json_name = "hash"];</code>
     * @return The hash.
     */
    public java.lang.String getHash() {
      java.lang.Object ref = hash_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hash_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hash = 2 [json_name = "hash"];</code>
     * @return The bytes for hash.
     */
    public com.google.protobuf.ByteString
        getHashBytes() {
      java.lang.Object ref = hash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hash = 2 [json_name = "hash"];</code>
     * @param value The hash to set.
     * @return This builder for chaining.
     */
    public Builder setHash(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      hash_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string hash = 2 [json_name = "hash"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHash() {
      hash_ = getDefaultInstance().getHash();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string hash = 2 [json_name = "hash"];</code>
     * @param value The bytes for hash to set.
     * @return This builder for chaining.
     */
    public Builder setHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      hash_ = value;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.models.v2.Hash)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.models.v2.Hash)
  private static final com.aruna.api.storage.models.v2.Hash DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.models.v2.Hash();
  }

  public static com.aruna.api.storage.models.v2.Hash getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Hash>
      PARSER = new com.google.protobuf.AbstractParser<Hash>() {
    @java.lang.Override
    public Hash parsePartialFrom(
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

  public static com.google.protobuf.Parser<Hash> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Hash> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.models.v2.Hash getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

