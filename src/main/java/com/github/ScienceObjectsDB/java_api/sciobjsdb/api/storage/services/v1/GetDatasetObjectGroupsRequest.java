// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sciobjsdb/api/storage/services/v1/dataset_service_models.proto

package com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1;

/**
 * Protobuf type {@code sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest}
 */
public final class GetDatasetObjectGroupsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest)
    GetDatasetObjectGroupsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetDatasetObjectGroupsRequest.newBuilder() to construct.
  private GetDatasetObjectGroupsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetDatasetObjectGroupsRequest() {
    id_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetDatasetObjectGroupsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetDatasetObjectGroupsRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 18: {
            com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequest.Builder subBuilder = null;
            if (pageRequest_ != null) {
              subBuilder = pageRequest_.toBuilder();
            }
            pageRequest_ = input.readMessage(com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pageRequest_);
              pageRequest_ = subBuilder.buildPartial();
            }

            break;
          }
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
    return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DatasetServiceModels.internal_static_sciobjsdb_api_storage_services_v1_GetDatasetObjectGroupsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DatasetServiceModels.internal_static_sciobjsdb_api_storage_services_v1_GetDatasetObjectGroupsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest.class, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_REQUEST_FIELD_NUMBER = 2;
  private com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequest pageRequest_;
  /**
   * <code>.sciobjsdb.api.storage.models.v1.PageRequest page_request = 2 [json_name = "pageRequest"];</code>
   * @return Whether the pageRequest field is set.
   */
  @java.lang.Override
  public boolean hasPageRequest() {
    return pageRequest_ != null;
  }
  /**
   * <code>.sciobjsdb.api.storage.models.v1.PageRequest page_request = 2 [json_name = "pageRequest"];</code>
   * @return The pageRequest.
   */
  @java.lang.Override
  public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequest getPageRequest() {
    return pageRequest_ == null ? com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequest.getDefaultInstance() : pageRequest_;
  }
  /**
   * <code>.sciobjsdb.api.storage.models.v1.PageRequest page_request = 2 [json_name = "pageRequest"];</code>
   */
  @java.lang.Override
  public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequestOrBuilder getPageRequestOrBuilder() {
    return getPageRequest();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (pageRequest_ != null) {
      output.writeMessage(2, getPageRequest());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (pageRequest_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPageRequest());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest)) {
      return super.equals(obj);
    }
    com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest other = (com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (hasPageRequest() != other.hasPageRequest()) return false;
    if (hasPageRequest()) {
      if (!getPageRequest()
          .equals(other.getPageRequest())) return false;
    }
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    if (hasPageRequest()) {
      hash = (37 * hash) + PAGE_REQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getPageRequest().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest parseFrom(
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
  public static Builder newBuilder(com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest prototype) {
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
   * Protobuf type {@code sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest)
      com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DatasetServiceModels.internal_static_sciobjsdb_api_storage_services_v1_GetDatasetObjectGroupsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DatasetServiceModels.internal_static_sciobjsdb_api_storage_services_v1_GetDatasetObjectGroupsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest.class, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest.Builder.class);
    }

    // Construct using com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest.newBuilder()
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
      id_ = "";

      if (pageRequestBuilder_ == null) {
        pageRequest_ = null;
      } else {
        pageRequest_ = null;
        pageRequestBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DatasetServiceModels.internal_static_sciobjsdb_api_storage_services_v1_GetDatasetObjectGroupsRequest_descriptor;
    }

    @java.lang.Override
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest getDefaultInstanceForType() {
      return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest build() {
      com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest buildPartial() {
      com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest result = new com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest(this);
      result.id_ = id_;
      if (pageRequestBuilder_ == null) {
        result.pageRequest_ = pageRequest_;
      } else {
        result.pageRequest_ = pageRequestBuilder_.build();
      }
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
      if (other instanceof com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest) {
        return mergeFrom((com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest other) {
      if (other == com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (other.hasPageRequest()) {
        mergePageRequest(other.getPageRequest());
      }
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
      com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1 [json_name = "id"];</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1 [json_name = "id"];</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1 [json_name = "id"];</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequest pageRequest_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequest, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequest.Builder, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequestOrBuilder> pageRequestBuilder_;
    /**
     * <code>.sciobjsdb.api.storage.models.v1.PageRequest page_request = 2 [json_name = "pageRequest"];</code>
     * @return Whether the pageRequest field is set.
     */
    public boolean hasPageRequest() {
      return pageRequestBuilder_ != null || pageRequest_ != null;
    }
    /**
     * <code>.sciobjsdb.api.storage.models.v1.PageRequest page_request = 2 [json_name = "pageRequest"];</code>
     * @return The pageRequest.
     */
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequest getPageRequest() {
      if (pageRequestBuilder_ == null) {
        return pageRequest_ == null ? com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequest.getDefaultInstance() : pageRequest_;
      } else {
        return pageRequestBuilder_.getMessage();
      }
    }
    /**
     * <code>.sciobjsdb.api.storage.models.v1.PageRequest page_request = 2 [json_name = "pageRequest"];</code>
     */
    public Builder setPageRequest(com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequest value) {
      if (pageRequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pageRequest_ = value;
        onChanged();
      } else {
        pageRequestBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.sciobjsdb.api.storage.models.v1.PageRequest page_request = 2 [json_name = "pageRequest"];</code>
     */
    public Builder setPageRequest(
        com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequest.Builder builderForValue) {
      if (pageRequestBuilder_ == null) {
        pageRequest_ = builderForValue.build();
        onChanged();
      } else {
        pageRequestBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.sciobjsdb.api.storage.models.v1.PageRequest page_request = 2 [json_name = "pageRequest"];</code>
     */
    public Builder mergePageRequest(com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequest value) {
      if (pageRequestBuilder_ == null) {
        if (pageRequest_ != null) {
          pageRequest_ =
            com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequest.newBuilder(pageRequest_).mergeFrom(value).buildPartial();
        } else {
          pageRequest_ = value;
        }
        onChanged();
      } else {
        pageRequestBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.sciobjsdb.api.storage.models.v1.PageRequest page_request = 2 [json_name = "pageRequest"];</code>
     */
    public Builder clearPageRequest() {
      if (pageRequestBuilder_ == null) {
        pageRequest_ = null;
        onChanged();
      } else {
        pageRequest_ = null;
        pageRequestBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.sciobjsdb.api.storage.models.v1.PageRequest page_request = 2 [json_name = "pageRequest"];</code>
     */
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequest.Builder getPageRequestBuilder() {
      
      onChanged();
      return getPageRequestFieldBuilder().getBuilder();
    }
    /**
     * <code>.sciobjsdb.api.storage.models.v1.PageRequest page_request = 2 [json_name = "pageRequest"];</code>
     */
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequestOrBuilder getPageRequestOrBuilder() {
      if (pageRequestBuilder_ != null) {
        return pageRequestBuilder_.getMessageOrBuilder();
      } else {
        return pageRequest_ == null ?
            com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequest.getDefaultInstance() : pageRequest_;
      }
    }
    /**
     * <code>.sciobjsdb.api.storage.models.v1.PageRequest page_request = 2 [json_name = "pageRequest"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequest, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequest.Builder, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequestOrBuilder> 
        getPageRequestFieldBuilder() {
      if (pageRequestBuilder_ == null) {
        pageRequestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequest, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequest.Builder, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.PageRequestOrBuilder>(
                getPageRequest(),
                getParentForChildren(),
                isClean());
        pageRequest_ = null;
      }
      return pageRequestBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest)
  }

  // @@protoc_insertion_point(class_scope:sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest)
  private static final com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest();
  }

  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDatasetObjectGroupsRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetDatasetObjectGroupsRequest>() {
    @java.lang.Override
    public GetDatasetObjectGroupsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetDatasetObjectGroupsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetDatasetObjectGroupsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetDatasetObjectGroupsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetDatasetObjectGroupsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

