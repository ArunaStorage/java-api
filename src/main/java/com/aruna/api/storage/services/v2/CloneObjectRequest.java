// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/object_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.CloneObjectRequest}
 */
public final class CloneObjectRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.CloneObjectRequest)
    CloneObjectRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CloneObjectRequest.newBuilder() to construct.
  private CloneObjectRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CloneObjectRequest() {
    objectId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CloneObjectRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_CloneObjectRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_CloneObjectRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.CloneObjectRequest.class, com.aruna.api.storage.services.v2.CloneObjectRequest.Builder.class);
  }

  private int parentCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object parent_;
  public enum ParentCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    PROJECT_ID(2),
    COLLECTION_ID(3),
    DATASET_ID(4),
    PARENT_NOT_SET(0);
    private final int value;
    private ParentCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ParentCase valueOf(int value) {
      return forNumber(value);
    }

    public static ParentCase forNumber(int value) {
      switch (value) {
        case 2: return PROJECT_ID;
        case 3: return COLLECTION_ID;
        case 4: return DATASET_ID;
        case 0: return PARENT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ParentCase
  getParentCase() {
    return ParentCase.forNumber(
        parentCase_);
  }

  public static final int OBJECT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object objectId_ = "";
  /**
   * <pre>
   * ObjectId
   * </pre>
   *
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
   * <pre>
   * ObjectId
   * </pre>
   *
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

  public static final int PROJECT_ID_FIELD_NUMBER = 2;
  /**
   * <code>string project_id = 2 [json_name = "projectId"];</code>
   * @return Whether the projectId field is set.
   */
  public boolean hasProjectId() {
    return parentCase_ == 2;
  }
  /**
   * <code>string project_id = 2 [json_name = "projectId"];</code>
   * @return The projectId.
   */
  public java.lang.String getProjectId() {
    java.lang.Object ref = "";
    if (parentCase_ == 2) {
      ref = parent_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (parentCase_ == 2) {
        parent_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string project_id = 2 [json_name = "projectId"];</code>
   * @return The bytes for projectId.
   */
  public com.google.protobuf.ByteString
      getProjectIdBytes() {
    java.lang.Object ref = "";
    if (parentCase_ == 2) {
      ref = parent_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (parentCase_ == 2) {
        parent_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COLLECTION_ID_FIELD_NUMBER = 3;
  /**
   * <code>string collection_id = 3 [json_name = "collectionId"];</code>
   * @return Whether the collectionId field is set.
   */
  public boolean hasCollectionId() {
    return parentCase_ == 3;
  }
  /**
   * <code>string collection_id = 3 [json_name = "collectionId"];</code>
   * @return The collectionId.
   */
  public java.lang.String getCollectionId() {
    java.lang.Object ref = "";
    if (parentCase_ == 3) {
      ref = parent_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (parentCase_ == 3) {
        parent_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string collection_id = 3 [json_name = "collectionId"];</code>
   * @return The bytes for collectionId.
   */
  public com.google.protobuf.ByteString
      getCollectionIdBytes() {
    java.lang.Object ref = "";
    if (parentCase_ == 3) {
      ref = parent_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (parentCase_ == 3) {
        parent_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATASET_ID_FIELD_NUMBER = 4;
  /**
   * <code>string dataset_id = 4 [json_name = "datasetId"];</code>
   * @return Whether the datasetId field is set.
   */
  public boolean hasDatasetId() {
    return parentCase_ == 4;
  }
  /**
   * <code>string dataset_id = 4 [json_name = "datasetId"];</code>
   * @return The datasetId.
   */
  public java.lang.String getDatasetId() {
    java.lang.Object ref = "";
    if (parentCase_ == 4) {
      ref = parent_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (parentCase_ == 4) {
        parent_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string dataset_id = 4 [json_name = "datasetId"];</code>
   * @return The bytes for datasetId.
   */
  public com.google.protobuf.ByteString
      getDatasetIdBytes() {
    java.lang.Object ref = "";
    if (parentCase_ == 4) {
      ref = parent_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (parentCase_ == 4) {
        parent_ = b;
      }
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
    if (parentCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, parent_);
    }
    if (parentCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, parent_);
    }
    if (parentCase_ == 4) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, parent_);
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
    if (parentCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, parent_);
    }
    if (parentCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, parent_);
    }
    if (parentCase_ == 4) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, parent_);
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.CloneObjectRequest)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.CloneObjectRequest other = (com.aruna.api.storage.services.v2.CloneObjectRequest) obj;

    if (!getObjectId()
        .equals(other.getObjectId())) return false;
    if (!getParentCase().equals(other.getParentCase())) return false;
    switch (parentCase_) {
      case 2:
        if (!getProjectId()
            .equals(other.getProjectId())) return false;
        break;
      case 3:
        if (!getCollectionId()
            .equals(other.getCollectionId())) return false;
        break;
      case 4:
        if (!getDatasetId()
            .equals(other.getDatasetId())) return false;
        break;
      case 0:
      default:
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
    switch (parentCase_) {
      case 2:
        hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
        hash = (53 * hash) + getProjectId().hashCode();
        break;
      case 3:
        hash = (37 * hash) + COLLECTION_ID_FIELD_NUMBER;
        hash = (53 * hash) + getCollectionId().hashCode();
        break;
      case 4:
        hash = (37 * hash) + DATASET_ID_FIELD_NUMBER;
        hash = (53 * hash) + getDatasetId().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.CloneObjectRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.CloneObjectRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.CloneObjectRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.CloneObjectRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.CloneObjectRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.CloneObjectRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.CloneObjectRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.CloneObjectRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.CloneObjectRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.CloneObjectRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.CloneObjectRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.CloneObjectRequest parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.CloneObjectRequest prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.CloneObjectRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.CloneObjectRequest)
      com.aruna.api.storage.services.v2.CloneObjectRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_CloneObjectRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_CloneObjectRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.CloneObjectRequest.class, com.aruna.api.storage.services.v2.CloneObjectRequest.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.CloneObjectRequest.newBuilder()
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
      parentCase_ = 0;
      parent_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.ObjectServiceProto.internal_static_aruna_api_storage_services_v2_CloneObjectRequest_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.CloneObjectRequest getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.CloneObjectRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.CloneObjectRequest build() {
      com.aruna.api.storage.services.v2.CloneObjectRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.CloneObjectRequest buildPartial() {
      com.aruna.api.storage.services.v2.CloneObjectRequest result = new com.aruna.api.storage.services.v2.CloneObjectRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.CloneObjectRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.objectId_ = objectId_;
      }
    }

    private void buildPartialOneofs(com.aruna.api.storage.services.v2.CloneObjectRequest result) {
      result.parentCase_ = parentCase_;
      result.parent_ = this.parent_;
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
      if (other instanceof com.aruna.api.storage.services.v2.CloneObjectRequest) {
        return mergeFrom((com.aruna.api.storage.services.v2.CloneObjectRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.CloneObjectRequest other) {
      if (other == com.aruna.api.storage.services.v2.CloneObjectRequest.getDefaultInstance()) return this;
      if (!other.getObjectId().isEmpty()) {
        objectId_ = other.objectId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      switch (other.getParentCase()) {
        case PROJECT_ID: {
          parentCase_ = 2;
          parent_ = other.parent_;
          onChanged();
          break;
        }
        case COLLECTION_ID: {
          parentCase_ = 3;
          parent_ = other.parent_;
          onChanged();
          break;
        }
        case DATASET_ID: {
          parentCase_ = 4;
          parent_ = other.parent_;
          onChanged();
          break;
        }
        case PARENT_NOT_SET: {
          break;
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
              objectId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              parentCase_ = 2;
              parent_ = s;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              parentCase_ = 3;
              parent_ = s;
              break;
            } // case 26
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();
              parentCase_ = 4;
              parent_ = s;
              break;
            } // case 34
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
    private int parentCase_ = 0;
    private java.lang.Object parent_;
    public ParentCase
        getParentCase() {
      return ParentCase.forNumber(
          parentCase_);
    }

    public Builder clearParent() {
      parentCase_ = 0;
      parent_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private java.lang.Object objectId_ = "";
    /**
     * <pre>
     * ObjectId
     * </pre>
     *
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
     * <pre>
     * ObjectId
     * </pre>
     *
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
     * <pre>
     * ObjectId
     * </pre>
     *
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
     * <pre>
     * ObjectId
     * </pre>
     *
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
     * <pre>
     * ObjectId
     * </pre>
     *
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

    /**
     * <code>string project_id = 2 [json_name = "projectId"];</code>
     * @return Whether the projectId field is set.
     */
    @java.lang.Override
    public boolean hasProjectId() {
      return parentCase_ == 2;
    }
    /**
     * <code>string project_id = 2 [json_name = "projectId"];</code>
     * @return The projectId.
     */
    @java.lang.Override
    public java.lang.String getProjectId() {
      java.lang.Object ref = "";
      if (parentCase_ == 2) {
        ref = parent_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (parentCase_ == 2) {
          parent_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string project_id = 2 [json_name = "projectId"];</code>
     * @return The bytes for projectId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      java.lang.Object ref = "";
      if (parentCase_ == 2) {
        ref = parent_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (parentCase_ == 2) {
          parent_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string project_id = 2 [json_name = "projectId"];</code>
     * @param value The projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parentCase_ = 2;
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string project_id = 2 [json_name = "projectId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProjectId() {
      if (parentCase_ == 2) {
        parentCase_ = 0;
        parent_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string project_id = 2 [json_name = "projectId"];</code>
     * @param value The bytes for projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parentCase_ = 2;
      parent_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string collection_id = 3 [json_name = "collectionId"];</code>
     * @return Whether the collectionId field is set.
     */
    @java.lang.Override
    public boolean hasCollectionId() {
      return parentCase_ == 3;
    }
    /**
     * <code>string collection_id = 3 [json_name = "collectionId"];</code>
     * @return The collectionId.
     */
    @java.lang.Override
    public java.lang.String getCollectionId() {
      java.lang.Object ref = "";
      if (parentCase_ == 3) {
        ref = parent_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (parentCase_ == 3) {
          parent_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string collection_id = 3 [json_name = "collectionId"];</code>
     * @return The bytes for collectionId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCollectionIdBytes() {
      java.lang.Object ref = "";
      if (parentCase_ == 3) {
        ref = parent_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (parentCase_ == 3) {
          parent_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string collection_id = 3 [json_name = "collectionId"];</code>
     * @param value The collectionId to set.
     * @return This builder for chaining.
     */
    public Builder setCollectionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parentCase_ = 3;
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string collection_id = 3 [json_name = "collectionId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCollectionId() {
      if (parentCase_ == 3) {
        parentCase_ = 0;
        parent_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string collection_id = 3 [json_name = "collectionId"];</code>
     * @param value The bytes for collectionId to set.
     * @return This builder for chaining.
     */
    public Builder setCollectionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parentCase_ = 3;
      parent_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string dataset_id = 4 [json_name = "datasetId"];</code>
     * @return Whether the datasetId field is set.
     */
    @java.lang.Override
    public boolean hasDatasetId() {
      return parentCase_ == 4;
    }
    /**
     * <code>string dataset_id = 4 [json_name = "datasetId"];</code>
     * @return The datasetId.
     */
    @java.lang.Override
    public java.lang.String getDatasetId() {
      java.lang.Object ref = "";
      if (parentCase_ == 4) {
        ref = parent_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (parentCase_ == 4) {
          parent_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dataset_id = 4 [json_name = "datasetId"];</code>
     * @return The bytes for datasetId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDatasetIdBytes() {
      java.lang.Object ref = "";
      if (parentCase_ == 4) {
        ref = parent_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (parentCase_ == 4) {
          parent_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dataset_id = 4 [json_name = "datasetId"];</code>
     * @param value The datasetId to set.
     * @return This builder for chaining.
     */
    public Builder setDatasetId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parentCase_ = 4;
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dataset_id = 4 [json_name = "datasetId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDatasetId() {
      if (parentCase_ == 4) {
        parentCase_ = 0;
        parent_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string dataset_id = 4 [json_name = "datasetId"];</code>
     * @param value The bytes for datasetId to set.
     * @return This builder for chaining.
     */
    public Builder setDatasetIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parentCase_ = 4;
      parent_ = value;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.CloneObjectRequest)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.CloneObjectRequest)
  private static final com.aruna.api.storage.services.v2.CloneObjectRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.CloneObjectRequest();
  }

  public static com.aruna.api.storage.services.v2.CloneObjectRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CloneObjectRequest>
      PARSER = new com.google.protobuf.AbstractParser<CloneObjectRequest>() {
    @java.lang.Override
    public CloneObjectRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CloneObjectRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CloneObjectRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.CloneObjectRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

