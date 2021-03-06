// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sciobjsdb/api/storage/services/v1/dataset_service_models.proto

package com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1;

/**
 * Protobuf type {@code sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse}
 */
public final class GetObjectGroupRevisionsInDateRangeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse)
    GetObjectGroupRevisionsInDateRangeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetObjectGroupRevisionsInDateRangeResponse.newBuilder() to construct.
  private GetObjectGroupRevisionsInDateRangeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetObjectGroupRevisionsInDateRangeResponse() {
    objectGroupRevisions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetObjectGroupRevisionsInDateRangeResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetObjectGroupRevisionsInDateRangeResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              objectGroupRevisions_ = new java.util.ArrayList<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision>();
              mutable_bitField0_ |= 0x00000001;
            }
            objectGroupRevisions_.add(
                input.readMessage(com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        objectGroupRevisions_ = java.util.Collections.unmodifiableList(objectGroupRevisions_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DatasetServiceModels.internal_static_sciobjsdb_api_storage_services_v1_GetObjectGroupRevisionsInDateRangeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DatasetServiceModels.internal_static_sciobjsdb_api_storage_services_v1_GetObjectGroupRevisionsInDateRangeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse.class, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse.Builder.class);
  }

  public static final int OBJECT_GROUP_REVISIONS_FIELD_NUMBER = 1;
  private java.util.List<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision> objectGroupRevisions_;
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 1 [json_name = "objectGroupRevisions"];</code>
   */
  @java.lang.Override
  public java.util.List<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision> getObjectGroupRevisionsList() {
    return objectGroupRevisions_;
  }
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 1 [json_name = "objectGroupRevisions"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevisionOrBuilder> 
      getObjectGroupRevisionsOrBuilderList() {
    return objectGroupRevisions_;
  }
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 1 [json_name = "objectGroupRevisions"];</code>
   */
  @java.lang.Override
  public int getObjectGroupRevisionsCount() {
    return objectGroupRevisions_.size();
  }
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 1 [json_name = "objectGroupRevisions"];</code>
   */
  @java.lang.Override
  public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision getObjectGroupRevisions(int index) {
    return objectGroupRevisions_.get(index);
  }
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 1 [json_name = "objectGroupRevisions"];</code>
   */
  @java.lang.Override
  public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevisionOrBuilder getObjectGroupRevisionsOrBuilder(
      int index) {
    return objectGroupRevisions_.get(index);
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
    for (int i = 0; i < objectGroupRevisions_.size(); i++) {
      output.writeMessage(1, objectGroupRevisions_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < objectGroupRevisions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, objectGroupRevisions_.get(i));
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
    if (!(obj instanceof com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse)) {
      return super.equals(obj);
    }
    com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse other = (com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse) obj;

    if (!getObjectGroupRevisionsList()
        .equals(other.getObjectGroupRevisionsList())) return false;
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
    if (getObjectGroupRevisionsCount() > 0) {
      hash = (37 * hash) + OBJECT_GROUP_REVISIONS_FIELD_NUMBER;
      hash = (53 * hash) + getObjectGroupRevisionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse parseFrom(
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
  public static Builder newBuilder(com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse prototype) {
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
   * Protobuf type {@code sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse)
      com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DatasetServiceModels.internal_static_sciobjsdb_api_storage_services_v1_GetObjectGroupRevisionsInDateRangeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DatasetServiceModels.internal_static_sciobjsdb_api_storage_services_v1_GetObjectGroupRevisionsInDateRangeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse.class, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse.Builder.class);
    }

    // Construct using com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse.newBuilder()
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
        getObjectGroupRevisionsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (objectGroupRevisionsBuilder_ == null) {
        objectGroupRevisions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        objectGroupRevisionsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.DatasetServiceModels.internal_static_sciobjsdb_api_storage_services_v1_GetObjectGroupRevisionsInDateRangeResponse_descriptor;
    }

    @java.lang.Override
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse getDefaultInstanceForType() {
      return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse build() {
      com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse buildPartial() {
      com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse result = new com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse(this);
      int from_bitField0_ = bitField0_;
      if (objectGroupRevisionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          objectGroupRevisions_ = java.util.Collections.unmodifiableList(objectGroupRevisions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.objectGroupRevisions_ = objectGroupRevisions_;
      } else {
        result.objectGroupRevisions_ = objectGroupRevisionsBuilder_.build();
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
      if (other instanceof com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse) {
        return mergeFrom((com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse other) {
      if (other == com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse.getDefaultInstance()) return this;
      if (objectGroupRevisionsBuilder_ == null) {
        if (!other.objectGroupRevisions_.isEmpty()) {
          if (objectGroupRevisions_.isEmpty()) {
            objectGroupRevisions_ = other.objectGroupRevisions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureObjectGroupRevisionsIsMutable();
            objectGroupRevisions_.addAll(other.objectGroupRevisions_);
          }
          onChanged();
        }
      } else {
        if (!other.objectGroupRevisions_.isEmpty()) {
          if (objectGroupRevisionsBuilder_.isEmpty()) {
            objectGroupRevisionsBuilder_.dispose();
            objectGroupRevisionsBuilder_ = null;
            objectGroupRevisions_ = other.objectGroupRevisions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            objectGroupRevisionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getObjectGroupRevisionsFieldBuilder() : null;
          } else {
            objectGroupRevisionsBuilder_.addAllMessages(other.objectGroupRevisions_);
          }
        }
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
      com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision> objectGroupRevisions_ =
      java.util.Collections.emptyList();
    private void ensureObjectGroupRevisionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        objectGroupRevisions_ = new java.util.ArrayList<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision>(objectGroupRevisions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision.Builder, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevisionOrBuilder> objectGroupRevisionsBuilder_;

    /**
     * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 1 [json_name = "objectGroupRevisions"];</code>
     */
    public java.util.List<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision> getObjectGroupRevisionsList() {
      if (objectGroupRevisionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(objectGroupRevisions_);
      } else {
        return objectGroupRevisionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 1 [json_name = "objectGroupRevisions"];</code>
     */
    public int getObjectGroupRevisionsCount() {
      if (objectGroupRevisionsBuilder_ == null) {
        return objectGroupRevisions_.size();
      } else {
        return objectGroupRevisionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 1 [json_name = "objectGroupRevisions"];</code>
     */
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision getObjectGroupRevisions(int index) {
      if (objectGroupRevisionsBuilder_ == null) {
        return objectGroupRevisions_.get(index);
      } else {
        return objectGroupRevisionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 1 [json_name = "objectGroupRevisions"];</code>
     */
    public Builder setObjectGroupRevisions(
        int index, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision value) {
      if (objectGroupRevisionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureObjectGroupRevisionsIsMutable();
        objectGroupRevisions_.set(index, value);
        onChanged();
      } else {
        objectGroupRevisionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 1 [json_name = "objectGroupRevisions"];</code>
     */
    public Builder setObjectGroupRevisions(
        int index, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision.Builder builderForValue) {
      if (objectGroupRevisionsBuilder_ == null) {
        ensureObjectGroupRevisionsIsMutable();
        objectGroupRevisions_.set(index, builderForValue.build());
        onChanged();
      } else {
        objectGroupRevisionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 1 [json_name = "objectGroupRevisions"];</code>
     */
    public Builder addObjectGroupRevisions(com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision value) {
      if (objectGroupRevisionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureObjectGroupRevisionsIsMutable();
        objectGroupRevisions_.add(value);
        onChanged();
      } else {
        objectGroupRevisionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 1 [json_name = "objectGroupRevisions"];</code>
     */
    public Builder addObjectGroupRevisions(
        int index, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision value) {
      if (objectGroupRevisionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureObjectGroupRevisionsIsMutable();
        objectGroupRevisions_.add(index, value);
        onChanged();
      } else {
        objectGroupRevisionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 1 [json_name = "objectGroupRevisions"];</code>
     */
    public Builder addObjectGroupRevisions(
        com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision.Builder builderForValue) {
      if (objectGroupRevisionsBuilder_ == null) {
        ensureObjectGroupRevisionsIsMutable();
        objectGroupRevisions_.add(builderForValue.build());
        onChanged();
      } else {
        objectGroupRevisionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 1 [json_name = "objectGroupRevisions"];</code>
     */
    public Builder addObjectGroupRevisions(
        int index, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision.Builder builderForValue) {
      if (objectGroupRevisionsBuilder_ == null) {
        ensureObjectGroupRevisionsIsMutable();
        objectGroupRevisions_.add(index, builderForValue.build());
        onChanged();
      } else {
        objectGroupRevisionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 1 [json_name = "objectGroupRevisions"];</code>
     */
    public Builder addAllObjectGroupRevisions(
        java.lang.Iterable<? extends com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision> values) {
      if (objectGroupRevisionsBuilder_ == null) {
        ensureObjectGroupRevisionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, objectGroupRevisions_);
        onChanged();
      } else {
        objectGroupRevisionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 1 [json_name = "objectGroupRevisions"];</code>
     */
    public Builder clearObjectGroupRevisions() {
      if (objectGroupRevisionsBuilder_ == null) {
        objectGroupRevisions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        objectGroupRevisionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 1 [json_name = "objectGroupRevisions"];</code>
     */
    public Builder removeObjectGroupRevisions(int index) {
      if (objectGroupRevisionsBuilder_ == null) {
        ensureObjectGroupRevisionsIsMutable();
        objectGroupRevisions_.remove(index);
        onChanged();
      } else {
        objectGroupRevisionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 1 [json_name = "objectGroupRevisions"];</code>
     */
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision.Builder getObjectGroupRevisionsBuilder(
        int index) {
      return getObjectGroupRevisionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 1 [json_name = "objectGroupRevisions"];</code>
     */
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevisionOrBuilder getObjectGroupRevisionsOrBuilder(
        int index) {
      if (objectGroupRevisionsBuilder_ == null) {
        return objectGroupRevisions_.get(index);  } else {
        return objectGroupRevisionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 1 [json_name = "objectGroupRevisions"];</code>
     */
    public java.util.List<? extends com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevisionOrBuilder> 
         getObjectGroupRevisionsOrBuilderList() {
      if (objectGroupRevisionsBuilder_ != null) {
        return objectGroupRevisionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(objectGroupRevisions_);
      }
    }
    /**
     * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 1 [json_name = "objectGroupRevisions"];</code>
     */
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision.Builder addObjectGroupRevisionsBuilder() {
      return getObjectGroupRevisionsFieldBuilder().addBuilder(
          com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision.getDefaultInstance());
    }
    /**
     * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 1 [json_name = "objectGroupRevisions"];</code>
     */
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision.Builder addObjectGroupRevisionsBuilder(
        int index) {
      return getObjectGroupRevisionsFieldBuilder().addBuilder(
          index, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision.getDefaultInstance());
    }
    /**
     * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 1 [json_name = "objectGroupRevisions"];</code>
     */
    public java.util.List<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision.Builder> 
         getObjectGroupRevisionsBuilderList() {
      return getObjectGroupRevisionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision.Builder, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevisionOrBuilder> 
        getObjectGroupRevisionsFieldBuilder() {
      if (objectGroupRevisionsBuilder_ == null) {
        objectGroupRevisionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision.Builder, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevisionOrBuilder>(
                objectGroupRevisions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        objectGroupRevisions_ = null;
      }
      return objectGroupRevisionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse)
  }

  // @@protoc_insertion_point(class_scope:sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse)
  private static final com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse();
  }

  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetObjectGroupRevisionsInDateRangeResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetObjectGroupRevisionsInDateRangeResponse>() {
    @java.lang.Override
    public GetObjectGroupRevisionsInDateRangeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetObjectGroupRevisionsInDateRangeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetObjectGroupRevisionsInDateRangeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetObjectGroupRevisionsInDateRangeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetObjectGroupRevisionsInDateRangeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

