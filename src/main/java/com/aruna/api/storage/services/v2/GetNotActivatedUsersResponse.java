// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/user_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.GetNotActivatedUsersResponse}
 */
public final class GetNotActivatedUsersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.GetNotActivatedUsersResponse)
    GetNotActivatedUsersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetNotActivatedUsersResponse.newBuilder() to construct.
  private GetNotActivatedUsersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetNotActivatedUsersResponse() {
    users_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetNotActivatedUsersResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.UserServiceProto.internal_static_aruna_api_storage_services_v2_GetNotActivatedUsersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.UserServiceProto.internal_static_aruna_api_storage_services_v2_GetNotActivatedUsersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse.class, com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse.Builder.class);
  }

  public static final int USERS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.aruna.api.storage.models.v2.User> users_;
  /**
   * <pre>
   * List of users that are not yet activated
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.User users = 1 [json_name = "users"];</code>
   */
  @java.lang.Override
  public java.util.List<com.aruna.api.storage.models.v2.User> getUsersList() {
    return users_;
  }
  /**
   * <pre>
   * List of users that are not yet activated
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.User users = 1 [json_name = "users"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.aruna.api.storage.models.v2.UserOrBuilder> 
      getUsersOrBuilderList() {
    return users_;
  }
  /**
   * <pre>
   * List of users that are not yet activated
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.User users = 1 [json_name = "users"];</code>
   */
  @java.lang.Override
  public int getUsersCount() {
    return users_.size();
  }
  /**
   * <pre>
   * List of users that are not yet activated
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.User users = 1 [json_name = "users"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.User getUsers(int index) {
    return users_.get(index);
  }
  /**
   * <pre>
   * List of users that are not yet activated
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.User users = 1 [json_name = "users"];</code>
   */
  @java.lang.Override
  public com.aruna.api.storage.models.v2.UserOrBuilder getUsersOrBuilder(
      int index) {
    return users_.get(index);
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
    for (int i = 0; i < users_.size(); i++) {
      output.writeMessage(1, users_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < users_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, users_.get(i));
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse other = (com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse) obj;

    if (!getUsersList()
        .equals(other.getUsersList())) return false;
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
    if (getUsersCount() > 0) {
      hash = (37 * hash) + USERS_FIELD_NUMBER;
      hash = (53 * hash) + getUsersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.GetNotActivatedUsersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.GetNotActivatedUsersResponse)
      com.aruna.api.storage.services.v2.GetNotActivatedUsersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.UserServiceProto.internal_static_aruna_api_storage_services_v2_GetNotActivatedUsersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.UserServiceProto.internal_static_aruna_api_storage_services_v2_GetNotActivatedUsersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse.class, com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse.newBuilder()
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
      if (usersBuilder_ == null) {
        users_ = java.util.Collections.emptyList();
      } else {
        users_ = null;
        usersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.UserServiceProto.internal_static_aruna_api_storage_services_v2_GetNotActivatedUsersResponse_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse build() {
      com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse buildPartial() {
      com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse result = new com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse result) {
      if (usersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          users_ = java.util.Collections.unmodifiableList(users_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.users_ = users_;
      } else {
        result.users_ = usersBuilder_.build();
      }
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse result) {
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
      if (other instanceof com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse) {
        return mergeFrom((com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse other) {
      if (other == com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse.getDefaultInstance()) return this;
      if (usersBuilder_ == null) {
        if (!other.users_.isEmpty()) {
          if (users_.isEmpty()) {
            users_ = other.users_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUsersIsMutable();
            users_.addAll(other.users_);
          }
          onChanged();
        }
      } else {
        if (!other.users_.isEmpty()) {
          if (usersBuilder_.isEmpty()) {
            usersBuilder_.dispose();
            usersBuilder_ = null;
            users_ = other.users_;
            bitField0_ = (bitField0_ & ~0x00000001);
            usersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUsersFieldBuilder() : null;
          } else {
            usersBuilder_.addAllMessages(other.users_);
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
              com.aruna.api.storage.models.v2.User m =
                  input.readMessage(
                      com.aruna.api.storage.models.v2.User.parser(),
                      extensionRegistry);
              if (usersBuilder_ == null) {
                ensureUsersIsMutable();
                users_.add(m);
              } else {
                usersBuilder_.addMessage(m);
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

    private java.util.List<com.aruna.api.storage.models.v2.User> users_ =
      java.util.Collections.emptyList();
    private void ensureUsersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        users_ = new java.util.ArrayList<com.aruna.api.storage.models.v2.User>(users_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aruna.api.storage.models.v2.User, com.aruna.api.storage.models.v2.User.Builder, com.aruna.api.storage.models.v2.UserOrBuilder> usersBuilder_;

    /**
     * <pre>
     * List of users that are not yet activated
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.User users = 1 [json_name = "users"];</code>
     */
    public java.util.List<com.aruna.api.storage.models.v2.User> getUsersList() {
      if (usersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(users_);
      } else {
        return usersBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of users that are not yet activated
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.User users = 1 [json_name = "users"];</code>
     */
    public int getUsersCount() {
      if (usersBuilder_ == null) {
        return users_.size();
      } else {
        return usersBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of users that are not yet activated
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.User users = 1 [json_name = "users"];</code>
     */
    public com.aruna.api.storage.models.v2.User getUsers(int index) {
      if (usersBuilder_ == null) {
        return users_.get(index);
      } else {
        return usersBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of users that are not yet activated
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.User users = 1 [json_name = "users"];</code>
     */
    public Builder setUsers(
        int index, com.aruna.api.storage.models.v2.User value) {
      if (usersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsersIsMutable();
        users_.set(index, value);
        onChanged();
      } else {
        usersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of users that are not yet activated
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.User users = 1 [json_name = "users"];</code>
     */
    public Builder setUsers(
        int index, com.aruna.api.storage.models.v2.User.Builder builderForValue) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.set(index, builderForValue.build());
        onChanged();
      } else {
        usersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of users that are not yet activated
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.User users = 1 [json_name = "users"];</code>
     */
    public Builder addUsers(com.aruna.api.storage.models.v2.User value) {
      if (usersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsersIsMutable();
        users_.add(value);
        onChanged();
      } else {
        usersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of users that are not yet activated
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.User users = 1 [json_name = "users"];</code>
     */
    public Builder addUsers(
        int index, com.aruna.api.storage.models.v2.User value) {
      if (usersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsersIsMutable();
        users_.add(index, value);
        onChanged();
      } else {
        usersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of users that are not yet activated
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.User users = 1 [json_name = "users"];</code>
     */
    public Builder addUsers(
        com.aruna.api.storage.models.v2.User.Builder builderForValue) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.add(builderForValue.build());
        onChanged();
      } else {
        usersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of users that are not yet activated
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.User users = 1 [json_name = "users"];</code>
     */
    public Builder addUsers(
        int index, com.aruna.api.storage.models.v2.User.Builder builderForValue) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.add(index, builderForValue.build());
        onChanged();
      } else {
        usersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of users that are not yet activated
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.User users = 1 [json_name = "users"];</code>
     */
    public Builder addAllUsers(
        java.lang.Iterable<? extends com.aruna.api.storage.models.v2.User> values) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, users_);
        onChanged();
      } else {
        usersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of users that are not yet activated
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.User users = 1 [json_name = "users"];</code>
     */
    public Builder clearUsers() {
      if (usersBuilder_ == null) {
        users_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        usersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of users that are not yet activated
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.User users = 1 [json_name = "users"];</code>
     */
    public Builder removeUsers(int index) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.remove(index);
        onChanged();
      } else {
        usersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of users that are not yet activated
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.User users = 1 [json_name = "users"];</code>
     */
    public com.aruna.api.storage.models.v2.User.Builder getUsersBuilder(
        int index) {
      return getUsersFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of users that are not yet activated
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.User users = 1 [json_name = "users"];</code>
     */
    public com.aruna.api.storage.models.v2.UserOrBuilder getUsersOrBuilder(
        int index) {
      if (usersBuilder_ == null) {
        return users_.get(index);  } else {
        return usersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of users that are not yet activated
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.User users = 1 [json_name = "users"];</code>
     */
    public java.util.List<? extends com.aruna.api.storage.models.v2.UserOrBuilder> 
         getUsersOrBuilderList() {
      if (usersBuilder_ != null) {
        return usersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(users_);
      }
    }
    /**
     * <pre>
     * List of users that are not yet activated
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.User users = 1 [json_name = "users"];</code>
     */
    public com.aruna.api.storage.models.v2.User.Builder addUsersBuilder() {
      return getUsersFieldBuilder().addBuilder(
          com.aruna.api.storage.models.v2.User.getDefaultInstance());
    }
    /**
     * <pre>
     * List of users that are not yet activated
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.User users = 1 [json_name = "users"];</code>
     */
    public com.aruna.api.storage.models.v2.User.Builder addUsersBuilder(
        int index) {
      return getUsersFieldBuilder().addBuilder(
          index, com.aruna.api.storage.models.v2.User.getDefaultInstance());
    }
    /**
     * <pre>
     * List of users that are not yet activated
     * </pre>
     *
     * <code>repeated .aruna.api.storage.models.v2.User users = 1 [json_name = "users"];</code>
     */
    public java.util.List<com.aruna.api.storage.models.v2.User.Builder> 
         getUsersBuilderList() {
      return getUsersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aruna.api.storage.models.v2.User, com.aruna.api.storage.models.v2.User.Builder, com.aruna.api.storage.models.v2.UserOrBuilder> 
        getUsersFieldBuilder() {
      if (usersBuilder_ == null) {
        usersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.aruna.api.storage.models.v2.User, com.aruna.api.storage.models.v2.User.Builder, com.aruna.api.storage.models.v2.UserOrBuilder>(
                users_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        users_ = null;
      }
      return usersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.GetNotActivatedUsersResponse)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.GetNotActivatedUsersResponse)
  private static final com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse();
  }

  public static com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetNotActivatedUsersResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetNotActivatedUsersResponse>() {
    @java.lang.Override
    public GetNotActivatedUsersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetNotActivatedUsersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetNotActivatedUsersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

