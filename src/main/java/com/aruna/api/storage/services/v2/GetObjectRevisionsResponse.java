// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/object_service.proto

// Protobuf Java Version: 3.25.1
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.GetObjectRevisionsResponse}
 */
public final class GetObjectRevisionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.GetObjectRevisionsResponse)
    GetObjectRevisionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetObjectRevisionsResponse.newBuilder() to construct.
  private GetObjectRevisionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetObjectRevisionsResponse() {
    objects_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetObjectRevisionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_GetObjectRevisionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_GetObjectRevisionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.GetObjectRevisionsResponse.class, com.aruna.api.storage.services.v2.GetObjectRevisionsResponse.Builder.class);
  }

  public static final int OBJECTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.aruna.api.storage.models.v2.Object> objects_;
  /**
   * <pre>
   * List of objects
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
   */
  @java.lang.Override
  public java.util.List<com.aruna.api.storage.models.v2.Object> getObjectsList() {
    return objects_;
  }
  /**
   * <pre>
   * List of objects
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.aruna.api.storage.models.v2.ObjectOrBuilder> 
      getObjectsOrBuilderList() {
    return objects_;
  }
  /**
   * <pre>
   * List of objects
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
   */
  @java.lang.Override
  public int getObjectsCount() {
    return objects_.size();
  }
  /**
   * <pre>
   * List of objects
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.Object getObjects(int index) {
    return objects_.get(index);
  }
  /**
   * <pre>
   * List of objects
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.ObjectOrBuilder getObjectsOrBuilder(
      int index) {
    return objects_.get(index);
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
    for (int i = 0; i < objects_.size(); i++) {
      output.writeMessage(1, objects_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < objects_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, objects_.get(i));
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.GetObjectRevisionsResponse)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.GetObjectRevisionsResponse other = (com.aruna.api.storage.services.v2.GetObjectRevisionsResponse) obj;

    if (!getObjectsList()
        .equals(other.getObjectsList())) return false;
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
    if (getObjectsCount() > 0) {
      hash = (37 * hash) + OBJECTS_FIELD_NUMBER;
      hash = (53 * hash) + getObjectsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.GetObjectRevisionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetObjectRevisionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetObjectRevisionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetObjectRevisionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetObjectRevisionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetObjectRevisionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetObjectRevisionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetObjectRevisionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.GetObjectRevisionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.GetObjectRevisionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetObjectRevisionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetObjectRevisionsResponse parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.GetObjectRevisionsResponse prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.GetObjectRevisionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.GetObjectRevisionsResponse)
      com.aruna.api.storage.services.v2.GetObjectRevisionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_GetObjectRevisionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_GetObjectRevisionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.GetObjectRevisionsResponse.class, com.aruna.api.storage.services.v2.GetObjectRevisionsResponse.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.GetObjectRevisionsResponse.newBuilder()
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
      if (objectsBuilder_ == null) {
        objects_ = java.util.Collections.emptyList();
      } else {
        objects_ = null;
        objectsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_GetObjectRevisionsResponse_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetObjectRevisionsResponse getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.GetObjectRevisionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetObjectRevisionsResponse build() {
      com.aruna.api.storage.services.v2.GetObjectRevisionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetObjectRevisionsResponse buildPartial() {
      com.aruna.api.storage.services.v2.GetObjectRevisionsResponse result = new com.aruna.api.storage.services.v2.GetObjectRevisionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.aruna.api.storage.services.v2.GetObjectRevisionsResponse result) {
      if (objectsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          objects_ = java.util.Collections.unmodifiableList(objects_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.objects_ = objects_;
      } else {
        result.objects_ = objectsBuilder_.build();
      }
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.GetObjectRevisionsResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.aruna.api.storage.services.v2.GetObjectRevisionsResponse) {
        return mergeFrom((com.aruna.api.storage.services.v2.GetObjectRevisionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.GetObjectRevisionsResponse other) {
      if (other == com.aruna.api.storage.services.v2.GetObjectRevisionsResponse.getDefaultInstance()) return this;
      if (objectsBuilder_ == null) {
        if (!other.objects_.isEmpty()) {
          if (objects_.isEmpty()) {
            objects_ = other.objects_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureObjectsIsMutable();
            objects_.addAll(other.objects_);
          }
          onChanged();
        }
      } else {
        if (!other.objects_.isEmpty()) {
          if (objectsBuilder_.isEmpty()) {
            objectsBuilder_.dispose();
            objectsBuilder_ = null;
            objects_ = other.objects_;
            bitField0_ = (bitField0_ & ~0x00000001);
            objectsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getObjectsFieldBuilder() : null;
          } else {
            objectsBuilder_.addAllMessages(other.objects_);
          }
        }
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
              com.aruna.api.storage.models.v2.Object m =
                  input.readMessage(
                      com.aruna.api.storage.models.v2.Object.parser(),
                      extensionRegistry);
              if (objectsBuilder_ == null) {
                ensureObjectsIsMutable();
                objects_.add(m);
              } else {
                objectsBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.aruna.api.storage.models.v2.Object> objects_ =
      java.util.Collections.emptyList();
    private void ensureObjectsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        objects_ = new java.util.ArrayList<com.aruna.api.storage.models.v2.Object>(objects_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aruna.api.storage.models.v2.Object, com.aruna.api.storage.models.v2.Object.Builder, com.aruna.api.storage.models.v2.ObjectOrBuilder> objectsBuilder_;

    /**
     * <pre>
     * List of objects
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
     */
    public java.util.List<com.aruna.api.storage.models.v2.Object> getObjectsList() {
      if (objectsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(objects_);
      } else {
        return objectsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of objects
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
     */
    public int getObjectsCount() {
      if (objectsBuilder_ == null) {
        return objects_.size();
      } else {
        return objectsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of objects
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
     */
    public com.aruna.api.storage.models.v2.Object getObjects(int index) {
      if (objectsBuilder_ == null) {
        return objects_.get(index);
      } else {
        return objectsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of objects
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
     */
    public Builder setObjects(
        int index, com.aruna.api.storage.models.v2.Object value) {
      if (objectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureObjectsIsMutable();
        objects_.set(index, value);
        onChanged();
      } else {
        objectsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of objects
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
     */
    public Builder setObjects(
        int index, com.aruna.api.storage.models.v2.Object.Builder builderForValue) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        objects_.set(index, builderForValue.build());
        onChanged();
      } else {
        objectsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of objects
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
     */
    public Builder addObjects(com.aruna.api.storage.models.v2.Object value) {
      if (objectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureObjectsIsMutable();
        objects_.add(value);
        onChanged();
      } else {
        objectsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of objects
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
     */
    public Builder addObjects(
        int index, com.aruna.api.storage.models.v2.Object value) {
      if (objectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureObjectsIsMutable();
        objects_.add(index, value);
        onChanged();
      } else {
        objectsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of objects
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
     */
    public Builder addObjects(
        com.aruna.api.storage.models.v2.Object.Builder builderForValue) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        objects_.add(builderForValue.build());
        onChanged();
      } else {
        objectsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of objects
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
     */
    public Builder addObjects(
        int index, com.aruna.api.storage.models.v2.Object.Builder builderForValue) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        objects_.add(index, builderForValue.build());
        onChanged();
      } else {
        objectsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of objects
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
     */
    public Builder addAllObjects(
        java.lang.Iterable<? extends com.aruna.api.storage.models.v2.Object> values) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, objects_);
        onChanged();
      } else {
        objectsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of objects
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
     */
    public Builder clearObjects() {
      if (objectsBuilder_ == null) {
        objects_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        objectsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of objects
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
     */
    public Builder removeObjects(int index) {
      if (objectsBuilder_ == null) {
        ensureObjectsIsMutable();
        objects_.remove(index);
        onChanged();
      } else {
        objectsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of objects
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
     */
    public com.aruna.api.storage.models.v2.Object.Builder getObjectsBuilder(
        int index) {
      return getObjectsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of objects
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
     */
    public com.aruna.api.storage.models.v2.ObjectOrBuilder getObjectsOrBuilder(
        int index) {
      if (objectsBuilder_ == null) {
        return objects_.get(index);  } else {
        return objectsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of objects
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
     */
    public java.util.List<? extends com.aruna.api.storage.models.v2.ObjectOrBuilder> 
         getObjectsOrBuilderList() {
      if (objectsBuilder_ != null) {
        return objectsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(objects_);
      }
    }
    /**
     * <pre>
     * List of objects
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
     */
    public com.aruna.api.storage.models.v2.Object.Builder addObjectsBuilder() {
      return getObjectsFieldBuilder().addBuilder(
          com.aruna.api.storage.models.v2.Object.getDefaultInstance());
    }
    /**
     * <pre>
     * List of objects
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
     */
    public com.aruna.api.storage.models.v2.Object.Builder addObjectsBuilder(
        int index) {
      return getObjectsFieldBuilder().addBuilder(
          index, com.aruna.api.storage.models.v2.Object.getDefaultInstance());
    }
    /**
     * <pre>
     * List of objects
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
     */
    public java.util.List<com.aruna.api.storage.models.v2.Object.Builder> 
         getObjectsBuilderList() {
      return getObjectsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aruna.api.storage.models.v2.Object, com.aruna.api.storage.models.v2.Object.Builder, com.aruna.api.storage.models.v2.ObjectOrBuilder> 
        getObjectsFieldBuilder() {
      if (objectsBuilder_ == null) {
        objectsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.aruna.api.storage.models.v2.Object, com.aruna.api.storage.models.v2.Object.Builder, com.aruna.api.storage.models.v2.ObjectOrBuilder>(
                objects_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        objects_ = null;
      }
      return objectsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.GetObjectRevisionsResponse)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.GetObjectRevisionsResponse)
  private static final com.aruna.api.storage.services.v2.GetObjectRevisionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.GetObjectRevisionsResponse();
  }

  public static com.aruna.api.storage.services.v2.GetObjectRevisionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetObjectRevisionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetObjectRevisionsResponse>() {
    @java.lang.Override
    public GetObjectRevisionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetObjectRevisionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetObjectRevisionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.GetObjectRevisionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

