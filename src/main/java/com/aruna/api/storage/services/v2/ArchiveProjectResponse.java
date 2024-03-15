// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/project_service.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.ArchiveProjectResponse}
 */
public final class ArchiveProjectResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.ArchiveProjectResponse)
    ArchiveProjectResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      ArchiveProjectResponse.class.getName());
  }
  // Use ArchiveProjectResponse.newBuilder() to construct.
  private ArchiveProjectResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ArchiveProjectResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.ProjectServiceProto.internal_static_aruna_api_storage_services_v2_ArchiveProjectResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.ProjectServiceProto.internal_static_aruna_api_storage_services_v2_ArchiveProjectResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.ArchiveProjectResponse.class, com.aruna.api.storage.services.v2.ArchiveProjectResponse.Builder.class);
  }

  private int bitField0_;
  public static final int PROJECT_FIELD_NUMBER = 1;
  private com.aruna.api.storage.models.v2.Project project_;
  /**
   * <pre>
   * This project will be returned via an Persistent Identifier! Updates will be impossible
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Project project = 1 [json_name = "project"];</code>
   * @return Whether the project field is set.
   */
  @java.lang.Override
  public boolean hasProject() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * This project will be returned via an Persistent Identifier! Updates will be impossible
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Project project = 1 [json_name = "project"];</code>
   * @return The project.
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.Project getProject() {
    return project_ == null ? com.aruna.api.storage.models.v2.Project.getDefaultInstance() : project_;
  }
  /**
   * <pre>
   * This project will be returned via an Persistent Identifier! Updates will be impossible
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Project project = 1 [json_name = "project"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.ProjectOrBuilder getProjectOrBuilder() {
    return project_ == null ? com.aruna.api.storage.models.v2.Project.getDefaultInstance() : project_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getProject());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProject());
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.ArchiveProjectResponse)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.ArchiveProjectResponse other = (com.aruna.api.storage.services.v2.ArchiveProjectResponse) obj;

    if (hasProject() != other.hasProject()) return false;
    if (hasProject()) {
      if (!getProject()
          .equals(other.getProject())) return false;
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
    if (hasProject()) {
      hash = (37 * hash) + PROJECT_FIELD_NUMBER;
      hash = (53 * hash) + getProject().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.ArchiveProjectResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.ArchiveProjectResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.ArchiveProjectResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.ArchiveProjectResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.ArchiveProjectResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.ArchiveProjectResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.ArchiveProjectResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.ArchiveProjectResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.ArchiveProjectResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.ArchiveProjectResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.ArchiveProjectResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.ArchiveProjectResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.aruna.api.storage.services.v2.ArchiveProjectResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code aruna.api.storage.services.v2.ArchiveProjectResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.ArchiveProjectResponse)
      com.aruna.api.storage.services.v2.ArchiveProjectResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.ProjectServiceProto.internal_static_aruna_api_storage_services_v2_ArchiveProjectResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.ProjectServiceProto.internal_static_aruna_api_storage_services_v2_ArchiveProjectResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.ArchiveProjectResponse.class, com.aruna.api.storage.services.v2.ArchiveProjectResponse.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.ArchiveProjectResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getProjectFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      project_ = null;
      if (projectBuilder_ != null) {
        projectBuilder_.dispose();
        projectBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.ProjectServiceProto.internal_static_aruna_api_storage_services_v2_ArchiveProjectResponse_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.ArchiveProjectResponse getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.ArchiveProjectResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.ArchiveProjectResponse build() {
      com.aruna.api.storage.services.v2.ArchiveProjectResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.ArchiveProjectResponse buildPartial() {
      com.aruna.api.storage.services.v2.ArchiveProjectResponse result = new com.aruna.api.storage.services.v2.ArchiveProjectResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.ArchiveProjectResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.project_ = projectBuilder_ == null
            ? project_
            : projectBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.aruna.api.storage.services.v2.ArchiveProjectResponse) {
        return mergeFrom((com.aruna.api.storage.services.v2.ArchiveProjectResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.ArchiveProjectResponse other) {
      if (other == com.aruna.api.storage.services.v2.ArchiveProjectResponse.getDefaultInstance()) return this;
      if (other.hasProject()) {
        mergeProject(other.getProject());
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
              input.readMessage(
                  getProjectFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.aruna.api.storage.models.v2.Project project_;
    private com.google.protobuf.SingleFieldBuilder<
        com.aruna.api.storage.models.v2.Project, com.aruna.api.storage.models.v2.Project.Builder, com.aruna.api.storage.models.v2.ProjectOrBuilder> projectBuilder_;
    /**
     * <pre>
     * This project will be returned via an Persistent Identifier! Updates will be impossible
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Project project = 1 [json_name = "project"];</code>
     * @return Whether the project field is set.
     */
    public boolean hasProject() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * This project will be returned via an Persistent Identifier! Updates will be impossible
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Project project = 1 [json_name = "project"];</code>
     * @return The project.
     */
    public com.aruna.api.storage.models.v2.Project getProject() {
      if (projectBuilder_ == null) {
        return project_ == null ? com.aruna.api.storage.models.v2.Project.getDefaultInstance() : project_;
      } else {
        return projectBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * This project will be returned via an Persistent Identifier! Updates will be impossible
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Project project = 1 [json_name = "project"];</code>
     */
    public Builder setProject(com.aruna.api.storage.models.v2.Project value) {
      if (projectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        project_ = value;
      } else {
        projectBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This project will be returned via an Persistent Identifier! Updates will be impossible
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Project project = 1 [json_name = "project"];</code>
     */
    public Builder setProject(
        com.aruna.api.storage.models.v2.Project.Builder builderForValue) {
      if (projectBuilder_ == null) {
        project_ = builderForValue.build();
      } else {
        projectBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This project will be returned via an Persistent Identifier! Updates will be impossible
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Project project = 1 [json_name = "project"];</code>
     */
    public Builder mergeProject(com.aruna.api.storage.models.v2.Project value) {
      if (projectBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          project_ != null &&
          project_ != com.aruna.api.storage.models.v2.Project.getDefaultInstance()) {
          getProjectBuilder().mergeFrom(value);
        } else {
          project_ = value;
        }
      } else {
        projectBuilder_.mergeFrom(value);
      }
      if (project_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * This project will be returned via an Persistent Identifier! Updates will be impossible
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Project project = 1 [json_name = "project"];</code>
     */
    public Builder clearProject() {
      bitField0_ = (bitField0_ & ~0x00000001);
      project_ = null;
      if (projectBuilder_ != null) {
        projectBuilder_.dispose();
        projectBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This project will be returned via an Persistent Identifier! Updates will be impossible
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Project project = 1 [json_name = "project"];</code>
     */
    public com.aruna.api.storage.models.v2.Project.Builder getProjectBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getProjectFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * This project will be returned via an Persistent Identifier! Updates will be impossible
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Project project = 1 [json_name = "project"];</code>
     */
    public com.aruna.api.storage.models.v2.ProjectOrBuilder getProjectOrBuilder() {
      if (projectBuilder_ != null) {
        return projectBuilder_.getMessageOrBuilder();
      } else {
        return project_ == null ?
            com.aruna.api.storage.models.v2.Project.getDefaultInstance() : project_;
      }
    }
    /**
     * <pre>
     * This project will be returned via an Persistent Identifier! Updates will be impossible
     * </pre>
     *
     * <code>.aruna.api.storage.models.v2.Project project = 1 [json_name = "project"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.aruna.api.storage.models.v2.Project, com.aruna.api.storage.models.v2.Project.Builder, com.aruna.api.storage.models.v2.ProjectOrBuilder> 
        getProjectFieldBuilder() {
      if (projectBuilder_ == null) {
        projectBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.aruna.api.storage.models.v2.Project, com.aruna.api.storage.models.v2.Project.Builder, com.aruna.api.storage.models.v2.ProjectOrBuilder>(
                getProject(),
                getParentForChildren(),
                isClean());
        project_ = null;
      }
      return projectBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.ArchiveProjectResponse)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.ArchiveProjectResponse)
  private static final com.aruna.api.storage.services.v2.ArchiveProjectResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.ArchiveProjectResponse();
  }

  public static com.aruna.api.storage.services.v2.ArchiveProjectResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ArchiveProjectResponse>
      PARSER = new com.google.protobuf.AbstractParser<ArchiveProjectResponse>() {
    @java.lang.Override
    public ArchiveProjectResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ArchiveProjectResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ArchiveProjectResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.ArchiveProjectResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

