// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sciobjsdb/api/storage/services/v1/project_service_models.proto

package com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1;

/**
 * Protobuf type {@code sciobjsdb.api.storage.services.v1.GetAPITokenResponse}
 */
public final class GetAPITokenResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sciobjsdb.api.storage.services.v1.GetAPITokenResponse)
    GetAPITokenResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAPITokenResponse.newBuilder() to construct.
  private GetAPITokenResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAPITokenResponse() {
    token_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAPITokenResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetAPITokenResponse(
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
              token_ = new java.util.ArrayList<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken>();
              mutable_bitField0_ |= 0x00000001;
            }
            token_.add(
                input.readMessage(com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken.parser(), extensionRegistry));
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
        token_ = java.util.Collections.unmodifiableList(token_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.ProjectAPIServiceModels.internal_static_sciobjsdb_api_storage_services_v1_GetAPITokenResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.ProjectAPIServiceModels.internal_static_sciobjsdb_api_storage_services_v1_GetAPITokenResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse.class, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse.Builder.class);
  }

  public static final int TOKEN_FIELD_NUMBER = 1;
  private java.util.List<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken> token_;
  /**
   * <pre>
   *Queried API token
   * </pre>
   *
   * <code>repeated .sciobjsdb.api.storage.models.v1.APIToken token = 1 [json_name = "token"];</code>
   */
  @java.lang.Override
  public java.util.List<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken> getTokenList() {
    return token_;
  }
  /**
   * <pre>
   *Queried API token
   * </pre>
   *
   * <code>repeated .sciobjsdb.api.storage.models.v1.APIToken token = 1 [json_name = "token"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APITokenOrBuilder> 
      getTokenOrBuilderList() {
    return token_;
  }
  /**
   * <pre>
   *Queried API token
   * </pre>
   *
   * <code>repeated .sciobjsdb.api.storage.models.v1.APIToken token = 1 [json_name = "token"];</code>
   */
  @java.lang.Override
  public int getTokenCount() {
    return token_.size();
  }
  /**
   * <pre>
   *Queried API token
   * </pre>
   *
   * <code>repeated .sciobjsdb.api.storage.models.v1.APIToken token = 1 [json_name = "token"];</code>
   */
  @java.lang.Override
  public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken getToken(int index) {
    return token_.get(index);
  }
  /**
   * <pre>
   *Queried API token
   * </pre>
   *
   * <code>repeated .sciobjsdb.api.storage.models.v1.APIToken token = 1 [json_name = "token"];</code>
   */
  @java.lang.Override
  public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APITokenOrBuilder getTokenOrBuilder(
      int index) {
    return token_.get(index);
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
    for (int i = 0; i < token_.size(); i++) {
      output.writeMessage(1, token_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < token_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, token_.get(i));
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
    if (!(obj instanceof com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse)) {
      return super.equals(obj);
    }
    com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse other = (com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse) obj;

    if (!getTokenList()
        .equals(other.getTokenList())) return false;
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
    if (getTokenCount() > 0) {
      hash = (37 * hash) + TOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getTokenList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse parseFrom(
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
  public static Builder newBuilder(com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse prototype) {
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
   * Protobuf type {@code sciobjsdb.api.storage.services.v1.GetAPITokenResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sciobjsdb.api.storage.services.v1.GetAPITokenResponse)
      com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.ProjectAPIServiceModels.internal_static_sciobjsdb_api_storage_services_v1_GetAPITokenResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.ProjectAPIServiceModels.internal_static_sciobjsdb_api_storage_services_v1_GetAPITokenResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse.class, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse.Builder.class);
    }

    // Construct using com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse.newBuilder()
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
        getTokenFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (tokenBuilder_ == null) {
        token_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        tokenBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.ProjectAPIServiceModels.internal_static_sciobjsdb_api_storage_services_v1_GetAPITokenResponse_descriptor;
    }

    @java.lang.Override
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse getDefaultInstanceForType() {
      return com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse build() {
      com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse buildPartial() {
      com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse result = new com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse(this);
      int from_bitField0_ = bitField0_;
      if (tokenBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          token_ = java.util.Collections.unmodifiableList(token_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.token_ = token_;
      } else {
        result.token_ = tokenBuilder_.build();
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
      if (other instanceof com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse) {
        return mergeFrom((com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse other) {
      if (other == com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse.getDefaultInstance()) return this;
      if (tokenBuilder_ == null) {
        if (!other.token_.isEmpty()) {
          if (token_.isEmpty()) {
            token_ = other.token_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTokenIsMutable();
            token_.addAll(other.token_);
          }
          onChanged();
        }
      } else {
        if (!other.token_.isEmpty()) {
          if (tokenBuilder_.isEmpty()) {
            tokenBuilder_.dispose();
            tokenBuilder_ = null;
            token_ = other.token_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tokenBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTokenFieldBuilder() : null;
          } else {
            tokenBuilder_.addAllMessages(other.token_);
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
      com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken> token_ =
      java.util.Collections.emptyList();
    private void ensureTokenIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        token_ = new java.util.ArrayList<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken>(token_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken.Builder, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APITokenOrBuilder> tokenBuilder_;

    /**
     * <pre>
     *Queried API token
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.APIToken token = 1 [json_name = "token"];</code>
     */
    public java.util.List<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken> getTokenList() {
      if (tokenBuilder_ == null) {
        return java.util.Collections.unmodifiableList(token_);
      } else {
        return tokenBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *Queried API token
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.APIToken token = 1 [json_name = "token"];</code>
     */
    public int getTokenCount() {
      if (tokenBuilder_ == null) {
        return token_.size();
      } else {
        return tokenBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *Queried API token
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.APIToken token = 1 [json_name = "token"];</code>
     */
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken getToken(int index) {
      if (tokenBuilder_ == null) {
        return token_.get(index);
      } else {
        return tokenBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *Queried API token
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.APIToken token = 1 [json_name = "token"];</code>
     */
    public Builder setToken(
        int index, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken value) {
      if (tokenBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTokenIsMutable();
        token_.set(index, value);
        onChanged();
      } else {
        tokenBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *Queried API token
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.APIToken token = 1 [json_name = "token"];</code>
     */
    public Builder setToken(
        int index, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken.Builder builderForValue) {
      if (tokenBuilder_ == null) {
        ensureTokenIsMutable();
        token_.set(index, builderForValue.build());
        onChanged();
      } else {
        tokenBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *Queried API token
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.APIToken token = 1 [json_name = "token"];</code>
     */
    public Builder addToken(com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken value) {
      if (tokenBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTokenIsMutable();
        token_.add(value);
        onChanged();
      } else {
        tokenBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *Queried API token
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.APIToken token = 1 [json_name = "token"];</code>
     */
    public Builder addToken(
        int index, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken value) {
      if (tokenBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTokenIsMutable();
        token_.add(index, value);
        onChanged();
      } else {
        tokenBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *Queried API token
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.APIToken token = 1 [json_name = "token"];</code>
     */
    public Builder addToken(
        com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken.Builder builderForValue) {
      if (tokenBuilder_ == null) {
        ensureTokenIsMutable();
        token_.add(builderForValue.build());
        onChanged();
      } else {
        tokenBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *Queried API token
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.APIToken token = 1 [json_name = "token"];</code>
     */
    public Builder addToken(
        int index, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken.Builder builderForValue) {
      if (tokenBuilder_ == null) {
        ensureTokenIsMutable();
        token_.add(index, builderForValue.build());
        onChanged();
      } else {
        tokenBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *Queried API token
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.APIToken token = 1 [json_name = "token"];</code>
     */
    public Builder addAllToken(
        java.lang.Iterable<? extends com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken> values) {
      if (tokenBuilder_ == null) {
        ensureTokenIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, token_);
        onChanged();
      } else {
        tokenBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *Queried API token
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.APIToken token = 1 [json_name = "token"];</code>
     */
    public Builder clearToken() {
      if (tokenBuilder_ == null) {
        token_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tokenBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *Queried API token
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.APIToken token = 1 [json_name = "token"];</code>
     */
    public Builder removeToken(int index) {
      if (tokenBuilder_ == null) {
        ensureTokenIsMutable();
        token_.remove(index);
        onChanged();
      } else {
        tokenBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *Queried API token
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.APIToken token = 1 [json_name = "token"];</code>
     */
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken.Builder getTokenBuilder(
        int index) {
      return getTokenFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *Queried API token
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.APIToken token = 1 [json_name = "token"];</code>
     */
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APITokenOrBuilder getTokenOrBuilder(
        int index) {
      if (tokenBuilder_ == null) {
        return token_.get(index);  } else {
        return tokenBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *Queried API token
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.APIToken token = 1 [json_name = "token"];</code>
     */
    public java.util.List<? extends com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APITokenOrBuilder> 
         getTokenOrBuilderList() {
      if (tokenBuilder_ != null) {
        return tokenBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(token_);
      }
    }
    /**
     * <pre>
     *Queried API token
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.APIToken token = 1 [json_name = "token"];</code>
     */
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken.Builder addTokenBuilder() {
      return getTokenFieldBuilder().addBuilder(
          com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken.getDefaultInstance());
    }
    /**
     * <pre>
     *Queried API token
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.APIToken token = 1 [json_name = "token"];</code>
     */
    public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken.Builder addTokenBuilder(
        int index) {
      return getTokenFieldBuilder().addBuilder(
          index, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken.getDefaultInstance());
    }
    /**
     * <pre>
     *Queried API token
     * </pre>
     *
     * <code>repeated .sciobjsdb.api.storage.models.v1.APIToken token = 1 [json_name = "token"];</code>
     */
    public java.util.List<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken.Builder> 
         getTokenBuilderList() {
      return getTokenFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken.Builder, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APITokenOrBuilder> 
        getTokenFieldBuilder() {
      if (tokenBuilder_ == null) {
        tokenBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APIToken.Builder, com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.APITokenOrBuilder>(
                token_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        token_ = null;
      }
      return tokenBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sciobjsdb.api.storage.services.v1.GetAPITokenResponse)
  }

  // @@protoc_insertion_point(class_scope:sciobjsdb.api.storage.services.v1.GetAPITokenResponse)
  private static final com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse();
  }

  public static com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAPITokenResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAPITokenResponse>() {
    @java.lang.Override
    public GetAPITokenResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetAPITokenResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAPITokenResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAPITokenResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.GetAPITokenResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

