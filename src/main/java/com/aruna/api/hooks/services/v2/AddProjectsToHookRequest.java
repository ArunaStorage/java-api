// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/hooks/services/v2/hooks_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.hooks.services.v2;

/**
 * Protobuf type {@code aruna.api.hooks.services.v2.AddProjectsToHookRequest}
 */
public final class AddProjectsToHookRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.hooks.services.v2.AddProjectsToHookRequest)
    AddProjectsToHookRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddProjectsToHookRequest.newBuilder() to construct.
  private AddProjectsToHookRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddProjectsToHookRequest() {
    hookId_ = "";
    projectIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddProjectsToHookRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.hooks.services.v2.HooksServiceProto.internal_static_aruna_api_hooks_services_v2_AddProjectsToHookRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.hooks.services.v2.HooksServiceProto.internal_static_aruna_api_hooks_services_v2_AddProjectsToHookRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.hooks.services.v2.AddProjectsToHookRequest.class, com.aruna.api.hooks.services.v2.AddProjectsToHookRequest.Builder.class);
  }

  public static final int HOOK_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object hookId_ = "";
  /**
   * <code>string hook_id = 1 [json_name = "hookId"];</code>
   * @return The hookId.
   */
  @java.lang.Override
  public java.lang.String getHookId() {
    java.lang.Object ref = hookId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hookId_ = s;
      return s;
    }
  }
  /**
   * <code>string hook_id = 1 [json_name = "hookId"];</code>
   * @return The bytes for hookId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHookIdBytes() {
    java.lang.Object ref = hookId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hookId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROJECT_IDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList projectIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string project_ids = 2 [json_name = "projectIds"];</code>
   * @return A list containing the projectIds.
   */
  public com.google.protobuf.ProtocolStringList
      getProjectIdsList() {
    return projectIds_;
  }
  /**
   * <code>repeated string project_ids = 2 [json_name = "projectIds"];</code>
   * @return The count of projectIds.
   */
  public int getProjectIdsCount() {
    return projectIds_.size();
  }
  /**
   * <code>repeated string project_ids = 2 [json_name = "projectIds"];</code>
   * @param index The index of the element to return.
   * @return The projectIds at the given index.
   */
  public java.lang.String getProjectIds(int index) {
    return projectIds_.get(index);
  }
  /**
   * <code>repeated string project_ids = 2 [json_name = "projectIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the projectIds at the given index.
   */
  public com.google.protobuf.ByteString
      getProjectIdsBytes(int index) {
    return projectIds_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hookId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, hookId_);
    }
    for (int i = 0; i < projectIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, projectIds_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hookId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, hookId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < projectIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(projectIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getProjectIdsList().size();
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
    if (!(obj instanceof com.aruna.api.hooks.services.v2.AddProjectsToHookRequest)) {
      return super.equals(obj);
    }
    com.aruna.api.hooks.services.v2.AddProjectsToHookRequest other = (com.aruna.api.hooks.services.v2.AddProjectsToHookRequest) obj;

    if (!getHookId()
        .equals(other.getHookId())) return false;
    if (!getProjectIdsList()
        .equals(other.getProjectIdsList())) return false;
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
    hash = (37 * hash) + HOOK_ID_FIELD_NUMBER;
    hash = (53 * hash) + getHookId().hashCode();
    if (getProjectIdsCount() > 0) {
      hash = (37 * hash) + PROJECT_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getProjectIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.hooks.services.v2.AddProjectsToHookRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.hooks.services.v2.AddProjectsToHookRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.hooks.services.v2.AddProjectsToHookRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.hooks.services.v2.AddProjectsToHookRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.hooks.services.v2.AddProjectsToHookRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.hooks.services.v2.AddProjectsToHookRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.hooks.services.v2.AddProjectsToHookRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.hooks.services.v2.AddProjectsToHookRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.hooks.services.v2.AddProjectsToHookRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.hooks.services.v2.AddProjectsToHookRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.hooks.services.v2.AddProjectsToHookRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.hooks.services.v2.AddProjectsToHookRequest parseFrom(
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
  public static Builder newBuilder(com.aruna.api.hooks.services.v2.AddProjectsToHookRequest prototype) {
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
   * Protobuf type {@code aruna.api.hooks.services.v2.AddProjectsToHookRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.hooks.services.v2.AddProjectsToHookRequest)
      com.aruna.api.hooks.services.v2.AddProjectsToHookRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.hooks.services.v2.HooksServiceProto.internal_static_aruna_api_hooks_services_v2_AddProjectsToHookRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.hooks.services.v2.HooksServiceProto.internal_static_aruna_api_hooks_services_v2_AddProjectsToHookRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.hooks.services.v2.AddProjectsToHookRequest.class, com.aruna.api.hooks.services.v2.AddProjectsToHookRequest.Builder.class);
    }

    // Construct using com.aruna.api.hooks.services.v2.AddProjectsToHookRequest.newBuilder()
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
      hookId_ = "";
      projectIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.hooks.services.v2.HooksServiceProto.internal_static_aruna_api_hooks_services_v2_AddProjectsToHookRequest_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.hooks.services.v2.AddProjectsToHookRequest getDefaultInstanceForType() {
      return com.aruna.api.hooks.services.v2.AddProjectsToHookRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.hooks.services.v2.AddProjectsToHookRequest build() {
      com.aruna.api.hooks.services.v2.AddProjectsToHookRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.hooks.services.v2.AddProjectsToHookRequest buildPartial() {
      com.aruna.api.hooks.services.v2.AddProjectsToHookRequest result = new com.aruna.api.hooks.services.v2.AddProjectsToHookRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.hooks.services.v2.AddProjectsToHookRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hookId_ = hookId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        projectIds_.makeImmutable();
        result.projectIds_ = projectIds_;
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
      if (other instanceof com.aruna.api.hooks.services.v2.AddProjectsToHookRequest) {
        return mergeFrom((com.aruna.api.hooks.services.v2.AddProjectsToHookRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.hooks.services.v2.AddProjectsToHookRequest other) {
      if (other == com.aruna.api.hooks.services.v2.AddProjectsToHookRequest.getDefaultInstance()) return this;
      if (!other.getHookId().isEmpty()) {
        hookId_ = other.hookId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.projectIds_.isEmpty()) {
        if (projectIds_.isEmpty()) {
          projectIds_ = other.projectIds_;
          bitField0_ |= 0x00000002;
        } else {
          ensureProjectIdsIsMutable();
          projectIds_.addAll(other.projectIds_);
        }
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
              hookId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureProjectIdsIsMutable();
              projectIds_.add(s);
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

    private java.lang.Object hookId_ = "";
    /**
     * <code>string hook_id = 1 [json_name = "hookId"];</code>
     * @return The hookId.
     */
    public java.lang.String getHookId() {
      java.lang.Object ref = hookId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hookId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hook_id = 1 [json_name = "hookId"];</code>
     * @return The bytes for hookId.
     */
    public com.google.protobuf.ByteString
        getHookIdBytes() {
      java.lang.Object ref = hookId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hookId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hook_id = 1 [json_name = "hookId"];</code>
     * @param value The hookId to set.
     * @return This builder for chaining.
     */
    public Builder setHookId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      hookId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string hook_id = 1 [json_name = "hookId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHookId() {
      hookId_ = getDefaultInstance().getHookId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string hook_id = 1 [json_name = "hookId"];</code>
     * @param value The bytes for hookId to set.
     * @return This builder for chaining.
     */
    public Builder setHookIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      hookId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList projectIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureProjectIdsIsMutable() {
      if (!projectIds_.isModifiable()) {
        projectIds_ = new com.google.protobuf.LazyStringArrayList(projectIds_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>repeated string project_ids = 2 [json_name = "projectIds"];</code>
     * @return A list containing the projectIds.
     */
    public com.google.protobuf.ProtocolStringList
        getProjectIdsList() {
      projectIds_.makeImmutable();
      return projectIds_;
    }
    /**
     * <code>repeated string project_ids = 2 [json_name = "projectIds"];</code>
     * @return The count of projectIds.
     */
    public int getProjectIdsCount() {
      return projectIds_.size();
    }
    /**
     * <code>repeated string project_ids = 2 [json_name = "projectIds"];</code>
     * @param index The index of the element to return.
     * @return The projectIds at the given index.
     */
    public java.lang.String getProjectIds(int index) {
      return projectIds_.get(index);
    }
    /**
     * <code>repeated string project_ids = 2 [json_name = "projectIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the projectIds at the given index.
     */
    public com.google.protobuf.ByteString
        getProjectIdsBytes(int index) {
      return projectIds_.getByteString(index);
    }
    /**
     * <code>repeated string project_ids = 2 [json_name = "projectIds"];</code>
     * @param index The index to set the value at.
     * @param value The projectIds to set.
     * @return This builder for chaining.
     */
    public Builder setProjectIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureProjectIdsIsMutable();
      projectIds_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string project_ids = 2 [json_name = "projectIds"];</code>
     * @param value The projectIds to add.
     * @return This builder for chaining.
     */
    public Builder addProjectIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureProjectIdsIsMutable();
      projectIds_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string project_ids = 2 [json_name = "projectIds"];</code>
     * @param values The projectIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllProjectIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureProjectIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, projectIds_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string project_ids = 2 [json_name = "projectIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProjectIds() {
      projectIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string project_ids = 2 [json_name = "projectIds"];</code>
     * @param value The bytes of the projectIds to add.
     * @return This builder for chaining.
     */
    public Builder addProjectIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureProjectIdsIsMutable();
      projectIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:aruna.api.hooks.services.v2.AddProjectsToHookRequest)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.hooks.services.v2.AddProjectsToHookRequest)
  private static final com.aruna.api.hooks.services.v2.AddProjectsToHookRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.hooks.services.v2.AddProjectsToHookRequest();
  }

  public static com.aruna.api.hooks.services.v2.AddProjectsToHookRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddProjectsToHookRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddProjectsToHookRequest>() {
    @java.lang.Override
    public AddProjectsToHookRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AddProjectsToHookRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddProjectsToHookRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.hooks.services.v2.AddProjectsToHookRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

