// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/health/v2/health.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.health.v2;

/**
 * Protobuf type {@code aruna.api.health.v2.HealthCheckResponse}
 */
public final class HealthCheckResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.health.v2.HealthCheckResponse)
    HealthCheckResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HealthCheckResponse.newBuilder() to construct.
  private HealthCheckResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HealthCheckResponse() {
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HealthCheckResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.health.v2.HealthProto.internal_static_aruna_api_health_v2_HealthCheckResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.health.v2.HealthProto.internal_static_aruna_api_health_v2_HealthCheckResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.health.v2.HealthCheckResponse.class, com.aruna.api.health.v2.HealthCheckResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code aruna.api.health.v2.HealthCheckResponse.ServingStatus}
   */
  public enum ServingStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>SERVING = 1;</code>
     */
    SERVING(1),
    /**
     * <code>NOT_SERVING = 2;</code>
     */
    NOT_SERVING(2),
    /**
     * <pre>
     * Used only by the Watch method.
     * </pre>
     *
     * <code>SERVICE_UNKNOWN = 3;</code>
     */
    SERVICE_UNKNOWN(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>SERVING = 1;</code>
     */
    public static final int SERVING_VALUE = 1;
    /**
     * <code>NOT_SERVING = 2;</code>
     */
    public static final int NOT_SERVING_VALUE = 2;
    /**
     * <pre>
     * Used only by the Watch method.
     * </pre>
     *
     * <code>SERVICE_UNKNOWN = 3;</code>
     */
    public static final int SERVICE_UNKNOWN_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ServingStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ServingStatus forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return SERVING;
        case 2: return NOT_SERVING;
        case 3: return SERVICE_UNKNOWN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ServingStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ServingStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ServingStatus>() {
            public ServingStatus findValueByNumber(int number) {
              return ServingStatus.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.aruna.api.health.v2.HealthCheckResponse.getDescriptor().getEnumTypes().get(0);
    }

    private static final ServingStatus[] VALUES = values();

    public static ServingStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ServingStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:aruna.api.health.v2.HealthCheckResponse.ServingStatus)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_ = 0;
  /**
   * <code>.aruna.api.health.v2.HealthCheckResponse.ServingStatus status = 1 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.aruna.api.health.v2.HealthCheckResponse.ServingStatus status = 1 [json_name = "status"];</code>
   * @return The status.
   */
  @java.lang.Override public com.aruna.api.health.v2.HealthCheckResponse.ServingStatus getStatus() {
    com.aruna.api.health.v2.HealthCheckResponse.ServingStatus result = com.aruna.api.health.v2.HealthCheckResponse.ServingStatus.forNumber(status_);
    return result == null ? com.aruna.api.health.v2.HealthCheckResponse.ServingStatus.UNRECOGNIZED : result;
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
    if (status_ != com.aruna.api.health.v2.HealthCheckResponse.ServingStatus.UNKNOWN.getNumber()) {
      output.writeEnum(1, status_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != com.aruna.api.health.v2.HealthCheckResponse.ServingStatus.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
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
    if (!(obj instanceof com.aruna.api.health.v2.HealthCheckResponse)) {
      return super.equals(obj);
    }
    com.aruna.api.health.v2.HealthCheckResponse other = (com.aruna.api.health.v2.HealthCheckResponse) obj;

    if (status_ != other.status_) return false;
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.health.v2.HealthCheckResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.health.v2.HealthCheckResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.health.v2.HealthCheckResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.health.v2.HealthCheckResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.health.v2.HealthCheckResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.health.v2.HealthCheckResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.health.v2.HealthCheckResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.health.v2.HealthCheckResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.health.v2.HealthCheckResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.health.v2.HealthCheckResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.health.v2.HealthCheckResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.health.v2.HealthCheckResponse parseFrom(
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
  public static Builder newBuilder(com.aruna.api.health.v2.HealthCheckResponse prototype) {
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
   * Protobuf type {@code aruna.api.health.v2.HealthCheckResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.health.v2.HealthCheckResponse)
      com.aruna.api.health.v2.HealthCheckResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.health.v2.HealthProto.internal_static_aruna_api_health_v2_HealthCheckResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.health.v2.HealthProto.internal_static_aruna_api_health_v2_HealthCheckResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.health.v2.HealthCheckResponse.class, com.aruna.api.health.v2.HealthCheckResponse.Builder.class);
    }

    // Construct using com.aruna.api.health.v2.HealthCheckResponse.newBuilder()
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
      status_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.health.v2.HealthProto.internal_static_aruna_api_health_v2_HealthCheckResponse_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.health.v2.HealthCheckResponse getDefaultInstanceForType() {
      return com.aruna.api.health.v2.HealthCheckResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.health.v2.HealthCheckResponse build() {
      com.aruna.api.health.v2.HealthCheckResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.health.v2.HealthCheckResponse buildPartial() {
      com.aruna.api.health.v2.HealthCheckResponse result = new com.aruna.api.health.v2.HealthCheckResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.health.v2.HealthCheckResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.status_ = status_;
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
      if (other instanceof com.aruna.api.health.v2.HealthCheckResponse) {
        return mergeFrom((com.aruna.api.health.v2.HealthCheckResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.health.v2.HealthCheckResponse other) {
      if (other == com.aruna.api.health.v2.HealthCheckResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
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
              status_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private int status_ = 0;
    /**
     * <code>.aruna.api.health.v2.HealthCheckResponse.ServingStatus status = 1 [json_name = "status"];</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.aruna.api.health.v2.HealthCheckResponse.ServingStatus status = 1 [json_name = "status"];</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.health.v2.HealthCheckResponse.ServingStatus status = 1 [json_name = "status"];</code>
     * @return The status.
     */
    @java.lang.Override
    public com.aruna.api.health.v2.HealthCheckResponse.ServingStatus getStatus() {
      com.aruna.api.health.v2.HealthCheckResponse.ServingStatus result = com.aruna.api.health.v2.HealthCheckResponse.ServingStatus.forNumber(status_);
      return result == null ? com.aruna.api.health.v2.HealthCheckResponse.ServingStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.aruna.api.health.v2.HealthCheckResponse.ServingStatus status = 1 [json_name = "status"];</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(com.aruna.api.health.v2.HealthCheckResponse.ServingStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.health.v2.HealthCheckResponse.ServingStatus status = 1 [json_name = "status"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000001);
      status_ = 0;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.health.v2.HealthCheckResponse)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.health.v2.HealthCheckResponse)
  private static final com.aruna.api.health.v2.HealthCheckResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.health.v2.HealthCheckResponse();
  }

  public static com.aruna.api.health.v2.HealthCheckResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HealthCheckResponse>
      PARSER = new com.google.protobuf.AbstractParser<HealthCheckResponse>() {
    @java.lang.Override
    public HealthCheckResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<HealthCheckResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HealthCheckResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.health.v2.HealthCheckResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

