// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/dataproxy/services/v2/dataproxy_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.dataproxy.services.v2;

/**
 * Protobuf type {@code aruna.api.dataproxy.services.v2.RevokeCredentialsResponse}
 */
public final class RevokeCredentialsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.dataproxy.services.v2.RevokeCredentialsResponse)
    RevokeCredentialsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RevokeCredentialsResponse.newBuilder() to construct.
  private RevokeCredentialsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RevokeCredentialsResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RevokeCredentialsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_RevokeCredentialsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_RevokeCredentialsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse.class, com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse.Builder.class);
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse)) {
      return super.equals(obj);
    }
    com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse other = (com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse parseFrom(
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
  public static Builder newBuilder(com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse prototype) {
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
   * Protobuf type {@code aruna.api.dataproxy.services.v2.RevokeCredentialsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.dataproxy.services.v2.RevokeCredentialsResponse)
      com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_RevokeCredentialsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_RevokeCredentialsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse.class, com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse.Builder.class);
    }

    // Construct using com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.internal_static_aruna_api_dataproxy_services_v2_RevokeCredentialsResponse_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse getDefaultInstanceForType() {
      return com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse build() {
      com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse buildPartial() {
      com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse result = new com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse(this);
      onBuilt();
      return result;
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
      if (other instanceof com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse) {
        return mergeFrom((com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse other) {
      if (other == com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.dataproxy.services.v2.RevokeCredentialsResponse)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.dataproxy.services.v2.RevokeCredentialsResponse)
  private static final com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse();
  }

  public static com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RevokeCredentialsResponse>
      PARSER = new com.google.protobuf.AbstractParser<RevokeCredentialsResponse>() {
    @java.lang.Override
    public RevokeCredentialsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<RevokeCredentialsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RevokeCredentialsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.dataproxy.services.v2.RevokeCredentialsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

