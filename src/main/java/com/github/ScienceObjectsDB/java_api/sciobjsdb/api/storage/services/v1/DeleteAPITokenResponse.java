// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sciobjsdb/api/storage/services/v1/project_service_models.proto

package com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1;

/**
 * Protobuf type {@code sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse}
 */
public final class DeleteAPITokenResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse)
    DeleteAPITokenResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteAPITokenResponse.newBuilder() to construct.
  private DeleteAPITokenResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteAPITokenResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteAPITokenResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteAPITokenResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.ProjectAPIServiceModels.internal_static_sciobjsdb_api_storage_services_v1_DeleteAPITokenResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.ProjectAPIServiceModels.internal_static_sciobjsdb_api_storage_services_v1_DeleteAPITokenResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse.class, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse.Builder.class);
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse)) {
      return super.equals(obj);
    }
    com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse other = (com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse) obj;

    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse parseFrom(
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
  public static Builder newBuilder(com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse prototype) {
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
   * Protobuf type {@code sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse)
      com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.ProjectAPIServiceModels.internal_static_sciobjsdb_api_storage_services_v1_DeleteAPITokenResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.ProjectAPIServiceModels.internal_static_sciobjsdb_api_storage_services_v1_DeleteAPITokenResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse.class, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse.Builder.class);
    }

    // Construct using com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.ProjectAPIServiceModels.internal_static_sciobjsdb_api_storage_services_v1_DeleteAPITokenResponse_descriptor;
    }

    @java.lang.Override
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse getDefaultInstanceForType() {
      return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse build() {
      com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse buildPartial() {
      com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse result = new com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse(this);
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
      if (other instanceof com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse) {
        return mergeFrom((com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse other) {
      if (other == com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
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
      com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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


    // @@protoc_insertion_point(builder_scope:sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse)
  }

  // @@protoc_insertion_point(class_scope:sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse)
  private static final com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse();
  }

  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteAPITokenResponse>
      PARSER = new com.google.protobuf.AbstractParser<DeleteAPITokenResponse>() {
    @java.lang.Override
    public DeleteAPITokenResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeleteAPITokenResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteAPITokenResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteAPITokenResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DeleteAPITokenResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

