// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/search_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

/**
 * Protobuf type {@code aruna.api.storage.services.v2.SearchResourcesRequest}
 */
public final class SearchResourcesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.storage.services.v2.SearchResourcesRequest)
    SearchResourcesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchResourcesRequest.newBuilder() to construct.
  private SearchResourcesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchResourcesRequest() {
    query_ = "";
    filter_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchResourcesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.storage.services.v2.SearchServiceProto.internal_static_aruna_api_storage_services_v2_SearchResourcesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.storage.services.v2.SearchServiceProto.internal_static_aruna_api_storage_services_v2_SearchResourcesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.storage.services.v2.SearchResourcesRequest.class, com.aruna.api.storage.services.v2.SearchResourcesRequest.Builder.class);
  }

  public static final int QUERY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object query_ = "";
  /**
   * <code>string query = 1 [json_name = "query"];</code>
   * @return The query.
   */
  @java.lang.Override
  public java.lang.String getQuery() {
    java.lang.Object ref = query_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      query_ = s;
      return s;
    }
  }
  /**
   * <code>string query = 1 [json_name = "query"];</code>
   * @return The bytes for query.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQueryBytes() {
    java.lang.Object ref = query_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      query_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILTER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object filter_ = "";
  /**
   * <code>string filter = 2 [json_name = "filter"];</code>
   * @return The filter.
   */
  @java.lang.Override
  public java.lang.String getFilter() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filter_ = s;
      return s;
    }
  }
  /**
   * <code>string filter = 2 [json_name = "filter"];</code>
   * @return The bytes for filter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFilterBytes() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LIMIT_FIELD_NUMBER = 3;
  private long limit_ = 0L;
  /**
   * <code>int64 limit = 3 [json_name = "limit"];</code>
   * @return The limit.
   */
  @java.lang.Override
  public long getLimit() {
    return limit_;
  }

  public static final int OFFSET_FIELD_NUMBER = 4;
  private long offset_ = 0L;
  /**
   * <code>int64 offset = 4 [json_name = "offset"];</code>
   * @return The offset.
   */
  @java.lang.Override
  public long getOffset() {
    return offset_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(query_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, query_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, filter_);
    }
    if (limit_ != 0L) {
      output.writeInt64(3, limit_);
    }
    if (offset_ != 0L) {
      output.writeInt64(4, offset_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(query_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, query_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, filter_);
    }
    if (limit_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, limit_);
    }
    if (offset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, offset_);
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
    if (!(obj instanceof com.aruna.api.storage.services.v2.SearchResourcesRequest)) {
      return super.equals(obj);
    }
    com.aruna.api.storage.services.v2.SearchResourcesRequest other = (com.aruna.api.storage.services.v2.SearchResourcesRequest) obj;

    if (!getQuery()
        .equals(other.getQuery())) return false;
    if (!getFilter()
        .equals(other.getFilter())) return false;
    if (getLimit()
        != other.getLimit()) return false;
    if (getOffset()
        != other.getOffset()) return false;
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
    hash = (37 * hash) + QUERY_FIELD_NUMBER;
    hash = (53 * hash) + getQuery().hashCode();
    hash = (37 * hash) + FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getFilter().hashCode();
    hash = (37 * hash) + LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLimit());
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOffset());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.storage.services.v2.SearchResourcesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.SearchResourcesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.SearchResourcesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.SearchResourcesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.SearchResourcesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.storage.services.v2.SearchResourcesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.SearchResourcesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.SearchResourcesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.storage.services.v2.SearchResourcesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.storage.services.v2.SearchResourcesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.storage.services.v2.SearchResourcesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.storage.services.v2.SearchResourcesRequest parseFrom(
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
  public static Builder newBuilder(com.aruna.api.storage.services.v2.SearchResourcesRequest prototype) {
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
   * Protobuf type {@code aruna.api.storage.services.v2.SearchResourcesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.storage.services.v2.SearchResourcesRequest)
      com.aruna.api.storage.services.v2.SearchResourcesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.storage.services.v2.SearchServiceProto.internal_static_aruna_api_storage_services_v2_SearchResourcesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.storage.services.v2.SearchServiceProto.internal_static_aruna_api_storage_services_v2_SearchResourcesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.storage.services.v2.SearchResourcesRequest.class, com.aruna.api.storage.services.v2.SearchResourcesRequest.Builder.class);
    }

    // Construct using com.aruna.api.storage.services.v2.SearchResourcesRequest.newBuilder()
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
      query_ = "";
      filter_ = "";
      limit_ = 0L;
      offset_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.storage.services.v2.SearchServiceProto.internal_static_aruna_api_storage_services_v2_SearchResourcesRequest_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.SearchResourcesRequest getDefaultInstanceForType() {
      return com.aruna.api.storage.services.v2.SearchResourcesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.SearchResourcesRequest build() {
      com.aruna.api.storage.services.v2.SearchResourcesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.storage.services.v2.SearchResourcesRequest buildPartial() {
      com.aruna.api.storage.services.v2.SearchResourcesRequest result = new com.aruna.api.storage.services.v2.SearchResourcesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aruna.api.storage.services.v2.SearchResourcesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.query_ = query_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.filter_ = filter_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.limit_ = limit_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.offset_ = offset_;
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
      if (other instanceof com.aruna.api.storage.services.v2.SearchResourcesRequest) {
        return mergeFrom((com.aruna.api.storage.services.v2.SearchResourcesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.storage.services.v2.SearchResourcesRequest other) {
      if (other == com.aruna.api.storage.services.v2.SearchResourcesRequest.getDefaultInstance()) return this;
      if (!other.getQuery().isEmpty()) {
        query_ = other.query_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getFilter().isEmpty()) {
        filter_ = other.filter_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getLimit() != 0L) {
        setLimit(other.getLimit());
      }
      if (other.getOffset() != 0L) {
        setOffset(other.getOffset());
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
              query_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              filter_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              limit_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              offset_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private java.lang.Object query_ = "";
    /**
     * <code>string query = 1 [json_name = "query"];</code>
     * @return The query.
     */
    public java.lang.String getQuery() {
      java.lang.Object ref = query_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        query_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string query = 1 [json_name = "query"];</code>
     * @return The bytes for query.
     */
    public com.google.protobuf.ByteString
        getQueryBytes() {
      java.lang.Object ref = query_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        query_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string query = 1 [json_name = "query"];</code>
     * @param value The query to set.
     * @return This builder for chaining.
     */
    public Builder setQuery(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      query_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string query = 1 [json_name = "query"];</code>
     * @return This builder for chaining.
     */
    public Builder clearQuery() {
      query_ = getDefaultInstance().getQuery();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string query = 1 [json_name = "query"];</code>
     * @param value The bytes for query to set.
     * @return This builder for chaining.
     */
    public Builder setQueryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      query_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object filter_ = "";
    /**
     * <code>string filter = 2 [json_name = "filter"];</code>
     * @return The filter.
     */
    public java.lang.String getFilter() {
      java.lang.Object ref = filter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string filter = 2 [json_name = "filter"];</code>
     * @return The bytes for filter.
     */
    public com.google.protobuf.ByteString
        getFilterBytes() {
      java.lang.Object ref = filter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string filter = 2 [json_name = "filter"];</code>
     * @param value The filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilter(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      filter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string filter = 2 [json_name = "filter"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFilter() {
      filter_ = getDefaultInstance().getFilter();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string filter = 2 [json_name = "filter"];</code>
     * @param value The bytes for filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      filter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long limit_ ;
    /**
     * <code>int64 limit = 3 [json_name = "limit"];</code>
     * @return The limit.
     */
    @java.lang.Override
    public long getLimit() {
      return limit_;
    }
    /**
     * <code>int64 limit = 3 [json_name = "limit"];</code>
     * @param value The limit to set.
     * @return This builder for chaining.
     */
    public Builder setLimit(long value) {

      limit_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 limit = 3 [json_name = "limit"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLimit() {
      bitField0_ = (bitField0_ & ~0x00000004);
      limit_ = 0L;
      onChanged();
      return this;
    }

    private long offset_ ;
    /**
     * <code>int64 offset = 4 [json_name = "offset"];</code>
     * @return The offset.
     */
    @java.lang.Override
    public long getOffset() {
      return offset_;
    }
    /**
     * <code>int64 offset = 4 [json_name = "offset"];</code>
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(long value) {

      offset_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int64 offset = 4 [json_name = "offset"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      bitField0_ = (bitField0_ & ~0x00000008);
      offset_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.storage.services.v2.SearchResourcesRequest)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.storage.services.v2.SearchResourcesRequest)
  private static final com.aruna.api.storage.services.v2.SearchResourcesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.storage.services.v2.SearchResourcesRequest();
  }

  public static com.aruna.api.storage.services.v2.SearchResourcesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchResourcesRequest>
      PARSER = new com.google.protobuf.AbstractParser<SearchResourcesRequest>() {
    @java.lang.Override
    public SearchResourcesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchResourcesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchResourcesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.storage.services.v2.SearchResourcesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

