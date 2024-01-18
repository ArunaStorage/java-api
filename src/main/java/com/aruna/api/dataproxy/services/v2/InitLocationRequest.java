// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/dataproxy/services/v2/dataproxy_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.dataproxy.services.v2;

/**
 * Protobuf type {@code aruna.api.dataproxy.services.v2.InitLocationRequest}
 */
public final class InitLocationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.dataproxy.services.v2.InitLocationRequest)
    InitLocationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InitLocationRequest.newBuilder() to construct.
  private InitLocationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InitLocationRequest() {
    objectName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InitLocationRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_InitLocationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_InitLocationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.dataproxy.services.v2.InitLocationRequest.class, com.aruna.api.dataproxy.services.v2.InitLocationRequest.Builder.class);
  }

  public static final int OBJECT_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object objectName_ = "";
  /**
   * <code>string object_name = 1 [json_name = "objectName"];</code>
   * @return The objectName.
   */
  @java.lang.Override
  public java.lang.String getObjectName() {
    java.lang.Object ref = objectName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      objectName_ = s;
      return s;
    }
  }
  /**
   * <code>string object_name = 1 [json_name = "objectName"];</code>
   * @return The bytes for objectName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getObjectNameBytes() {
    java.lang.Object ref = objectName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      objectName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SIZE_FIELD_NUMBER = 2;
  private long size_ = 0L;
  /**
   * <code>int64 size = 2 [json_name = "size"];</code>
   * @return The size.
   */
  @java.lang.Override
  public long getSize() {
    return size_;
  }

  public static final int IS_TEMPORARY_FIELD_NUMBER = 3;
  private boolean isTemporary_ = false;
  /**
   * <code>bool is_temporary = 3 [json_name = "isTemporary"];</code>
   * @return The isTemporary.
   */
  @java.lang.Override
  public boolean getIsTemporary() {
    return isTemporary_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(objectName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, objectName_);
    }
    if (size_ != 0L) {
      output.writeInt64(2, size_);
    }
    if (isTemporary_ != false) {
      output.writeBool(3, isTemporary_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(objectName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, objectName_);
    }
    if (size_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, size_);
    }
    if (isTemporary_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isTemporary_);
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
    if (!(obj instanceof com.aruna.api.dataproxy.services.v2.InitLocationRequest)) {
      return super.equals(obj);
    }
    com.aruna.api.dataproxy.services.v2.InitLocationRequest other = (com.aruna.api.dataproxy.services.v2.InitLocationRequest) obj;

    if (!getObjectName()
        .equals(other.getObjectName())) return false;
    if (getSize()
        != other.getSize()) return false;
    if (getIsTemporary()
        != other.getIsTemporary()) return false;
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
    hash = (37 * hash) + OBJECT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getObjectName().hashCode();
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSize());
    hash = (37 * hash) + IS_TEMPORARY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsTemporary());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.dataproxy.services.v2.InitLocationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.dataproxy.services.v2.InitLocationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.InitLocationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.dataproxy.services.v2.InitLocationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.InitLocationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.dataproxy.services.v2.InitLocationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.InitLocationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.dataproxy.services.v2.InitLocationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.dataproxy.services.v2.InitLocationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.dataproxy.services.v2.InitLocationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.InitLocationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.dataproxy.services.v2.InitLocationRequest parseFrom(
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
  public static Builder newBuilder(com.aruna.api.dataproxy.services.v2.InitLocationRequest prototype) {
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
   * Protobuf type {@code aruna.api.dataproxy.services.v2.InitLocationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.dataproxy.services.v2.InitLocationRequest)
      com.aruna.api.dataproxy.services.v2.InitLocationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_InitLocationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_InitLocationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.dataproxy.services.v2.InitLocationRequest.class, com.aruna.api.dataproxy.services.v2.InitLocationRequest.Builder.class);
    }

    // Construct using com.aruna.api.dataproxy.services.v2.InitLocationRequest.newBuilder()
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
      objectName_ = "";
      size_ = 0L;
      isTemporary_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_InitLocationRequest_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.InitLocationRequest getDefaultInstanceForType() {
      return com.aruna.api.dataproxy.services.v2.InitLocationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.InitLocationRequest build() {
      com.aruna.api.dataproxy.services.v2.InitLocationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.InitLocationRequest buildPartial() {
      com.aruna.api.dataproxy.services.v2.InitLocationRequest result = new com.aruna.api.dataproxy.services.v2.InitLocationRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.dataproxy.services.v2.InitLocationRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.objectName_ = objectName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.size_ = size_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.isTemporary_ = isTemporary_;
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
      if (other instanceof com.aruna.api.dataproxy.services.v2.InitLocationRequest) {
        return mergeFrom((com.aruna.api.dataproxy.services.v2.InitLocationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.dataproxy.services.v2.InitLocationRequest other) {
      if (other == com.aruna.api.dataproxy.services.v2.InitLocationRequest.getDefaultInstance()) return this;
      if (!other.getObjectName().isEmpty()) {
        objectName_ = other.objectName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getSize() != 0L) {
        setSize(other.getSize());
      }
      if (other.getIsTemporary() != false) {
        setIsTemporary(other.getIsTemporary());
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
              objectName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              size_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              isTemporary_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private java.lang.Object objectName_ = "";
    /**
     * <code>string object_name = 1 [json_name = "objectName"];</code>
     * @return The objectName.
     */
    public java.lang.String getObjectName() {
      java.lang.Object ref = objectName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        objectName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string object_name = 1 [json_name = "objectName"];</code>
     * @return The bytes for objectName.
     */
    public com.google.protobuf.ByteString
        getObjectNameBytes() {
      java.lang.Object ref = objectName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        objectName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string object_name = 1 [json_name = "objectName"];</code>
     * @param value The objectName to set.
     * @return This builder for chaining.
     */
    public Builder setObjectName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      objectName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string object_name = 1 [json_name = "objectName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearObjectName() {
      objectName_ = getDefaultInstance().getObjectName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string object_name = 1 [json_name = "objectName"];</code>
     * @param value The bytes for objectName to set.
     * @return This builder for chaining.
     */
    public Builder setObjectNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      objectName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long size_ ;
    /**
     * <code>int64 size = 2 [json_name = "size"];</code>
     * @return The size.
     */
    @java.lang.Override
    public long getSize() {
      return size_;
    }
    /**
     * <code>int64 size = 2 [json_name = "size"];</code>
     * @param value The size to set.
     * @return This builder for chaining.
     */
    public Builder setSize(long value) {

      size_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 size = 2 [json_name = "size"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSize() {
      bitField0_ = (bitField0_ & ~0x00000002);
      size_ = 0L;
      onChanged();
      return this;
    }

    private boolean isTemporary_ ;
    /**
     * <code>bool is_temporary = 3 [json_name = "isTemporary"];</code>
     * @return The isTemporary.
     */
    @java.lang.Override
    public boolean getIsTemporary() {
      return isTemporary_;
    }
    /**
     * <code>bool is_temporary = 3 [json_name = "isTemporary"];</code>
     * @param value The isTemporary to set.
     * @return This builder for chaining.
     */
    public Builder setIsTemporary(boolean value) {

      isTemporary_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_temporary = 3 [json_name = "isTemporary"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsTemporary() {
      bitField0_ = (bitField0_ & ~0x00000004);
      isTemporary_ = false;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.dataproxy.services.v2.InitLocationRequest)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.dataproxy.services.v2.InitLocationRequest)
  private static final com.aruna.api.dataproxy.services.v2.InitLocationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.dataproxy.services.v2.InitLocationRequest();
  }

  public static com.aruna.api.dataproxy.services.v2.InitLocationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InitLocationRequest>
      PARSER = new com.google.protobuf.AbstractParser<InitLocationRequest>() {
    @java.lang.Override
    public InitLocationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<InitLocationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InitLocationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.dataproxy.services.v2.InitLocationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

