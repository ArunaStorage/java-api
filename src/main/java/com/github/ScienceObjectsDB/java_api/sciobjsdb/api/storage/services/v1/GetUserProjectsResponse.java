// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sciobjsdb/api/storage/services/v1/project_service_models.proto

package com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1;

/**
 * Protobuf type {@code sciobjsdb.api.storage.services.v1.GetUserProjectsResponse}
 */
public final class GetUserProjectsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sciobjsdb.api.storage.services.v1.GetUserProjectsResponse)
    GetUserProjectsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetUserProjectsResponse.newBuilder() to construct.
  private GetUserProjectsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetUserProjectsResponse() {
    projects_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetUserProjectsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetUserProjectsResponse(
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
              projects_ = new java.util.ArrayList<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project>();
              mutable_bitField0_ |= 0x00000001;
            }
            projects_.add(
                input.readMessage(com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project.parser(), extensionRegistry));
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
        projects_ = java.util.Collections.unmodifiableList(projects_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.ProjectAPIServiceModels.internal_static_sciobjsdb_api_storage_services_v1_GetUserProjectsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.ProjectAPIServiceModels.internal_static_sciobjsdb_api_storage_services_v1_GetUserProjectsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse.class, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse.Builder.class);
  }

  public static final int PROJECTS_FIELD_NUMBER = 1;
  private java.util.List<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project> projects_;
  /**
   * <pre>
   *Queried projects
   * </pre>
   *
   * <code>repeated .sciobjsdb.api.storage.models.v1.Project projects = 1 [json_name = "projects"];</code>
   */
  @java.lang.Override
  public java.util.List<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project> getProjectsList() {
    return projects_;
  }
  /**
   * <pre>
   *Queried projects
   * </pre>
   *
   * <code>repeated .sciobjsdb.api.storage.models.v1.Project projects = 1 [json_name = "projects"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ProjectOrBuilder> 
      getProjectsOrBuilderList() {
    return projects_;
  }
  /**
   * <pre>
   *Queried projects
   * </pre>
   *
   * <code>repeated .sciobjsdb.api.storage.models.v1.Project projects = 1 [json_name = "projects"];</code>
   */
  @java.lang.Override
  public int getProjectsCount() {
    return projects_.size();
  }
  /**
   * <pre>
   *Queried projects
   * </pre>
   *
   * <code>repeated .sciobjsdb.api.storage.models.v1.Project projects = 1 [json_name = "projects"];</code>
   */
  @java.lang.Override
  public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project getProjects(int index) {
    return projects_.get(index);
  }
  /**
   * <pre>
   *Queried projects
   * </pre>
   *
   * <code>repeated .sciobjsdb.api.storage.models.v1.Project projects = 1 [json_name = "projects"];</code>
   */
  @java.lang.Override
  public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ProjectOrBuilder getProjectsOrBuilder(
      int index) {
    return projects_.get(index);
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
    for (int i = 0; i < projects_.size(); i++) {
      output.writeMessage(1, projects_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < projects_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, projects_.get(i));
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
    if (!(obj instanceof com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse)) {
      return super.equals(obj);
    }
    com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse other = (com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse) obj;

    if (!getProjectsList()
        .equals(other.getProjectsList())) return false;
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
    if (getProjectsCount() > 0) {
      hash = (37 * hash) + PROJECTS_FIELD_NUMBER;
      hash = (53 * hash) + getProjectsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse parseFrom(
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
  public static Builder newBuilder(com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse prototype) {
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
   * Protobuf type {@code sciobjsdb.api.storage.services.v1.GetUserProjectsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sciobjsdb.api.storage.services.v1.GetUserProjectsResponse)
      com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.ProjectAPIServiceModels.internal_static_sciobjsdb_api_storage_services_v1_GetUserProjectsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.ProjectAPIServiceModels.internal_static_sciobjsdb_api_storage_services_v1_GetUserProjectsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse.class, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse.Builder.class);
    }

    // Construct using com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse.newBuilder()
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
        getProjectsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (projectsBuilder_ == null) {
        projects_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        projectsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.ProjectAPIServiceModels.internal_static_sciobjsdb_api_storage_services_v1_GetUserProjectsResponse_descriptor;
    }

    @java.lang.Override
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse getDefaultInstanceForType() {
      return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse build() {
      com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse buildPartial() {
      com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse result = new com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse(this);
      int from_bitField0_ = bitField0_;
      if (projectsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          projects_ = java.util.Collections.unmodifiableList(projects_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.projects_ = projects_;
      } else {
        result.projects_ = projectsBuilder_.build();
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
      if (other instanceof com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse) {
        return mergeFrom((com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse other) {
      if (other == com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse.getDefaultInstance()) return this;
      if (projectsBuilder_ == null) {
        if (!other.projects_.isEmpty()) {
          if (projects_.isEmpty()) {
            projects_ = other.projects_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProjectsIsMutable();
            projects_.addAll(other.projects_);
          }
          onChanged();
        }
      } else {
        if (!other.projects_.isEmpty()) {
          if (projectsBuilder_.isEmpty()) {
            projectsBuilder_.dispose();
            projectsBuilder_ = null;
            projects_ = other.projects_;
            bitField0_ = (bitField0_ & ~0x00000001);
            projectsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getProjectsFieldBuilder() : null;
          } else {
            projectsBuilder_.addAllMessages(other.projects_);
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
      com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project> projects_ =
      java.util.Collections.emptyList();
    private void ensureProjectsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        projects_ = new java.util.ArrayList<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project>(projects_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project.Builder, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ProjectOrBuilder> projectsBuilder_;

    /**
     * <pre>
     *Queried projects
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.Project projects = 1 [json_name = "projects"];</code>
     */
    public java.util.List<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project> getProjectsList() {
      if (projectsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(projects_);
      } else {
        return projectsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *Queried projects
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.Project projects = 1 [json_name = "projects"];</code>
     */
    public int getProjectsCount() {
      if (projectsBuilder_ == null) {
        return projects_.size();
      } else {
        return projectsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *Queried projects
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.Project projects = 1 [json_name = "projects"];</code>
     */
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project getProjects(int index) {
      if (projectsBuilder_ == null) {
        return projects_.get(index);
      } else {
        return projectsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *Queried projects
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.Project projects = 1 [json_name = "projects"];</code>
     */
    public Builder setProjects(
        int index, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project value) {
      if (projectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProjectsIsMutable();
        projects_.set(index, value);
        onChanged();
      } else {
        projectsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *Queried projects
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.Project projects = 1 [json_name = "projects"];</code>
     */
    public Builder setProjects(
        int index, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project.Builder builderForValue) {
      if (projectsBuilder_ == null) {
        ensureProjectsIsMutable();
        projects_.set(index, builderForValue.build());
        onChanged();
      } else {
        projectsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *Queried projects
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.Project projects = 1 [json_name = "projects"];</code>
     */
    public Builder addProjects(com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project value) {
      if (projectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProjectsIsMutable();
        projects_.add(value);
        onChanged();
      } else {
        projectsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *Queried projects
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.Project projects = 1 [json_name = "projects"];</code>
     */
    public Builder addProjects(
        int index, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project value) {
      if (projectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProjectsIsMutable();
        projects_.add(index, value);
        onChanged();
      } else {
        projectsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *Queried projects
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.Project projects = 1 [json_name = "projects"];</code>
     */
    public Builder addProjects(
        com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project.Builder builderForValue) {
      if (projectsBuilder_ == null) {
        ensureProjectsIsMutable();
        projects_.add(builderForValue.build());
        onChanged();
      } else {
        projectsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *Queried projects
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.Project projects = 1 [json_name = "projects"];</code>
     */
    public Builder addProjects(
        int index, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project.Builder builderForValue) {
      if (projectsBuilder_ == null) {
        ensureProjectsIsMutable();
        projects_.add(index, builderForValue.build());
        onChanged();
      } else {
        projectsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *Queried projects
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.Project projects = 1 [json_name = "projects"];</code>
     */
    public Builder addAllProjects(
        java.lang.Iterable<? extends com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project> values) {
      if (projectsBuilder_ == null) {
        ensureProjectsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, projects_);
        onChanged();
      } else {
        projectsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *Queried projects
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.Project projects = 1 [json_name = "projects"];</code>
     */
    public Builder clearProjects() {
      if (projectsBuilder_ == null) {
        projects_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        projectsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *Queried projects
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.Project projects = 1 [json_name = "projects"];</code>
     */
    public Builder removeProjects(int index) {
      if (projectsBuilder_ == null) {
        ensureProjectsIsMutable();
        projects_.remove(index);
        onChanged();
      } else {
        projectsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *Queried projects
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.Project projects = 1 [json_name = "projects"];</code>
     */
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project.Builder getProjectsBuilder(
        int index) {
      return getProjectsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *Queried projects
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.Project projects = 1 [json_name = "projects"];</code>
     */
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ProjectOrBuilder getProjectsOrBuilder(
        int index) {
      if (projectsBuilder_ == null) {
        return projects_.get(index);  } else {
        return projectsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *Queried projects
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.Project projects = 1 [json_name = "projects"];</code>
     */
    public java.util.List<? extends com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ProjectOrBuilder> 
         getProjectsOrBuilderList() {
      if (projectsBuilder_ != null) {
        return projectsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(projects_);
      }
    }
    /**
     * <pre>
     *Queried projects
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.Project projects = 1 [json_name = "projects"];</code>
     */
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project.Builder addProjectsBuilder() {
      return getProjectsFieldBuilder().addBuilder(
          com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project.getDefaultInstance());
    }
    /**
     * <pre>
     *Queried projects
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.Project projects = 1 [json_name = "projects"];</code>
     */
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project.Builder addProjectsBuilder(
        int index) {
      return getProjectsFieldBuilder().addBuilder(
          index, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project.getDefaultInstance());
    }
    /**
     * <pre>
     *Queried projects
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.Project projects = 1 [json_name = "projects"];</code>
     */
    public java.util.List<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project.Builder> 
         getProjectsBuilderList() {
      return getProjectsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project.Builder, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ProjectOrBuilder> 
        getProjectsFieldBuilder() {
      if (projectsBuilder_ == null) {
        projectsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.Project.Builder, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ProjectOrBuilder>(
                projects_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        projects_ = null;
      }
      return projectsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sciobjsdb.api.storage.services.v1.GetUserProjectsResponse)
  }

  // @@protoc_insertion_point(class_scope:sciobjsdb.api.storage.services.v1.GetUserProjectsResponse)
  private static final com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse();
  }

  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetUserProjectsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetUserProjectsResponse>() {
    @java.lang.Override
    public GetUserProjectsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetUserProjectsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetUserProjectsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetUserProjectsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetUserProjectsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

