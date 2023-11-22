// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/hooks/services/v2/hooks_service.proto

// Protobuf Java Version: 3.25.1
package com.aruna.api.hooks.services.v2;

/**
 * Protobuf type {@code aruna.api.hooks.services.v2.Trigger}
 */
public final class Trigger extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aruna.api.hooks.services.v2.Trigger)
    TriggerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Trigger.newBuilder() to construct.
  private Trigger(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Trigger() {
    triggerType_ = 0;
    filters_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Trigger();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aruna.api.hooks.services.v2.HooksServiceProto.internal_static_aruna_api_hooks_services_v2_Trigger_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aruna.api.hooks.services.v2.HooksServiceProto.internal_static_aruna_api_hooks_services_v2_Trigger_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aruna.api.hooks.services.v2.Trigger.class, com.aruna.api.hooks.services.v2.Trigger.Builder.class);
  }

  public static final int TRIGGER_TYPE_FIELD_NUMBER = 1;
  private int triggerType_ = 0;
  /**
   * <code>.aruna.api.hooks.services.v2.TriggerType trigger_type = 1 [json_name = "triggerType"];</code>
   * @return The enum numeric value on the wire for triggerType.
   */
  @java.lang.Override public int getTriggerTypeValue() {
    return triggerType_;
  }
  /**
   * <code>.aruna.api.hooks.services.v2.TriggerType trigger_type = 1 [json_name = "triggerType"];</code>
   * @return The triggerType.
   */
  @java.lang.Override public com.aruna.api.hooks.services.v2.TriggerType getTriggerType() {
    com.aruna.api.hooks.services.v2.TriggerType result = com.aruna.api.hooks.services.v2.TriggerType.forNumber(triggerType_);
    return result == null ? com.aruna.api.hooks.services.v2.TriggerType.UNRECOGNIZED : result;
  }

  public static final int FILTERS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.aruna.api.hooks.services.v2.Filter> filters_;
  /**
   * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
   */
  @java.lang.Override
  public java.util.List<com.aruna.api.hooks.services.v2.Filter> getFiltersList() {
    return filters_;
  }
  /**
   * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.aruna.api.hooks.services.v2.FilterOrBuilder> 
      getFiltersOrBuilderList() {
    return filters_;
  }
  /**
   * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
   */
  @java.lang.Override
  public int getFiltersCount() {
    return filters_.size();
  }
  /**
   * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
   */
  @java.lang.Override
  public com.aruna.api.hooks.services.v2.Filter getFilters(int index) {
    return filters_.get(index);
  }
  /**
   * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
   */
  @java.lang.Override
  public com.aruna.api.hooks.services.v2.FilterOrBuilder getFiltersOrBuilder(
      int index) {
    return filters_.get(index);
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
    if (triggerType_ != com.aruna.api.hooks.services.v2.TriggerType.TRIGGER_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, triggerType_);
    }
    for (int i = 0; i < filters_.size(); i++) {
      output.writeMessage(2, filters_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (triggerType_ != com.aruna.api.hooks.services.v2.TriggerType.TRIGGER_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, triggerType_);
    }
    for (int i = 0; i < filters_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, filters_.get(i));
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
    if (!(obj instanceof com.aruna.api.hooks.services.v2.Trigger)) {
      return super.equals(obj);
    }
    com.aruna.api.hooks.services.v2.Trigger other = (com.aruna.api.hooks.services.v2.Trigger) obj;

    if (triggerType_ != other.triggerType_) return false;
    if (!getFiltersList()
        .equals(other.getFiltersList())) return false;
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
    hash = (37 * hash) + TRIGGER_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + triggerType_;
    if (getFiltersCount() > 0) {
      hash = (37 * hash) + FILTERS_FIELD_NUMBER;
      hash = (53 * hash) + getFiltersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aruna.api.hooks.services.v2.Trigger parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.hooks.services.v2.Trigger parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.hooks.services.v2.Trigger parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.hooks.services.v2.Trigger parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.hooks.services.v2.Trigger parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aruna.api.hooks.services.v2.Trigger parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aruna.api.hooks.services.v2.Trigger parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.hooks.services.v2.Trigger parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aruna.api.hooks.services.v2.Trigger parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aruna.api.hooks.services.v2.Trigger parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aruna.api.hooks.services.v2.Trigger parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aruna.api.hooks.services.v2.Trigger parseFrom(
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
  public static Builder newBuilder(com.aruna.api.hooks.services.v2.Trigger prototype) {
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
   * Protobuf type {@code aruna.api.hooks.services.v2.Trigger}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aruna.api.hooks.services.v2.Trigger)
      com.aruna.api.hooks.services.v2.TriggerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aruna.api.hooks.services.v2.HooksServiceProto.internal_static_aruna_api_hooks_services_v2_Trigger_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aruna.api.hooks.services.v2.HooksServiceProto.internal_static_aruna_api_hooks_services_v2_Trigger_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aruna.api.hooks.services.v2.Trigger.class, com.aruna.api.hooks.services.v2.Trigger.Builder.class);
    }

    // Construct using com.aruna.api.hooks.services.v2.Trigger.newBuilder()
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
      triggerType_ = 0;
      if (filtersBuilder_ == null) {
        filters_ = java.util.Collections.emptyList();
      } else {
        filters_ = null;
        filtersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aruna.api.hooks.services.v2.HooksServiceProto.internal_static_aruna_api_hooks_services_v2_Trigger_descriptor;
    }

    @java.lang.Override
    public com.aruna.api.hooks.services.v2.Trigger getDefaultInstanceForType() {
      return com.aruna.api.hooks.services.v2.Trigger.getDefaultInstance();
    }

    @java.lang.Override
    public com.aruna.api.hooks.services.v2.Trigger build() {
      com.aruna.api.hooks.services.v2.Trigger result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aruna.api.hooks.services.v2.Trigger buildPartial() {
      com.aruna.api.hooks.services.v2.Trigger result = new com.aruna.api.hooks.services.v2.Trigger(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.aruna.api.hooks.services.v2.Trigger result) {
      if (filtersBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          filters_ = java.util.Collections.unmodifiableList(filters_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.filters_ = filters_;
      } else {
        result.filters_ = filtersBuilder_.build();
      }
    }

    private void buildPartial0(com.aruna.api.hooks.services.v2.Trigger result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.triggerType_ = triggerType_;
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
      if (other instanceof com.aruna.api.hooks.services.v2.Trigger) {
        return mergeFrom((com.aruna.api.hooks.services.v2.Trigger)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aruna.api.hooks.services.v2.Trigger other) {
      if (other == com.aruna.api.hooks.services.v2.Trigger.getDefaultInstance()) return this;
      if (other.triggerType_ != 0) {
        setTriggerTypeValue(other.getTriggerTypeValue());
      }
      if (filtersBuilder_ == null) {
        if (!other.filters_.isEmpty()) {
          if (filters_.isEmpty()) {
            filters_ = other.filters_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureFiltersIsMutable();
            filters_.addAll(other.filters_);
          }
          onChanged();
        }
      } else {
        if (!other.filters_.isEmpty()) {
          if (filtersBuilder_.isEmpty()) {
            filtersBuilder_.dispose();
            filtersBuilder_ = null;
            filters_ = other.filters_;
            bitField0_ = (bitField0_ & ~0x00000002);
            filtersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFiltersFieldBuilder() : null;
          } else {
            filtersBuilder_.addAllMessages(other.filters_);
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
            case 8: {
              triggerType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              com.aruna.api.hooks.services.v2.Filter m =
                  input.readMessage(
                      com.aruna.api.hooks.services.v2.Filter.parser(),
                      extensionRegistry);
              if (filtersBuilder_ == null) {
                ensureFiltersIsMutable();
                filters_.add(m);
              } else {
                filtersBuilder_.addMessage(m);
              }
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

    private int triggerType_ = 0;
    /**
     * <code>.aruna.api.hooks.services.v2.TriggerType trigger_type = 1 [json_name = "triggerType"];</code>
     * @return The enum numeric value on the wire for triggerType.
     */
    @java.lang.Override public int getTriggerTypeValue() {
      return triggerType_;
    }
    /**
     * <code>.aruna.api.hooks.services.v2.TriggerType trigger_type = 1 [json_name = "triggerType"];</code>
     * @param value The enum numeric value on the wire for triggerType to set.
     * @return This builder for chaining.
     */
    public Builder setTriggerTypeValue(int value) {
      triggerType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.hooks.services.v2.TriggerType trigger_type = 1 [json_name = "triggerType"];</code>
     * @return The triggerType.
     */
    @java.lang.Override
    public com.aruna.api.hooks.services.v2.TriggerType getTriggerType() {
      com.aruna.api.hooks.services.v2.TriggerType result = com.aruna.api.hooks.services.v2.TriggerType.forNumber(triggerType_);
      return result == null ? com.aruna.api.hooks.services.v2.TriggerType.UNRECOGNIZED : result;
    }
    /**
     * <code>.aruna.api.hooks.services.v2.TriggerType trigger_type = 1 [json_name = "triggerType"];</code>
     * @param value The triggerType to set.
     * @return This builder for chaining.
     */
    public Builder setTriggerType(com.aruna.api.hooks.services.v2.TriggerType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      triggerType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.aruna.api.hooks.services.v2.TriggerType trigger_type = 1 [json_name = "triggerType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTriggerType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      triggerType_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.aruna.api.hooks.services.v2.Filter> filters_ =
      java.util.Collections.emptyList();
    private void ensureFiltersIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        filters_ = new java.util.ArrayList<com.aruna.api.hooks.services.v2.Filter>(filters_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aruna.api.hooks.services.v2.Filter, com.aruna.api.hooks.services.v2.Filter.Builder, com.aruna.api.hooks.services.v2.FilterOrBuilder> filtersBuilder_;

    /**
     * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
     */
    public java.util.List<com.aruna.api.hooks.services.v2.Filter> getFiltersList() {
      if (filtersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(filters_);
      } else {
        return filtersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
     */
    public int getFiltersCount() {
      if (filtersBuilder_ == null) {
        return filters_.size();
      } else {
        return filtersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
     */
    public com.aruna.api.hooks.services.v2.Filter getFilters(int index) {
      if (filtersBuilder_ == null) {
        return filters_.get(index);
      } else {
        return filtersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
     */
    public Builder setFilters(
        int index, com.aruna.api.hooks.services.v2.Filter value) {
      if (filtersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFiltersIsMutable();
        filters_.set(index, value);
        onChanged();
      } else {
        filtersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
     */
    public Builder setFilters(
        int index, com.aruna.api.hooks.services.v2.Filter.Builder builderForValue) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        filters_.set(index, builderForValue.build());
        onChanged();
      } else {
        filtersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
     */
    public Builder addFilters(com.aruna.api.hooks.services.v2.Filter value) {
      if (filtersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFiltersIsMutable();
        filters_.add(value);
        onChanged();
      } else {
        filtersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
     */
    public Builder addFilters(
        int index, com.aruna.api.hooks.services.v2.Filter value) {
      if (filtersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFiltersIsMutable();
        filters_.add(index, value);
        onChanged();
      } else {
        filtersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
     */
    public Builder addFilters(
        com.aruna.api.hooks.services.v2.Filter.Builder builderForValue) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        filters_.add(builderForValue.build());
        onChanged();
      } else {
        filtersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
     */
    public Builder addFilters(
        int index, com.aruna.api.hooks.services.v2.Filter.Builder builderForValue) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        filters_.add(index, builderForValue.build());
        onChanged();
      } else {
        filtersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
     */
    public Builder addAllFilters(
        java.lang.Iterable<? extends com.aruna.api.hooks.services.v2.Filter> values) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, filters_);
        onChanged();
      } else {
        filtersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
     */
    public Builder clearFilters() {
      if (filtersBuilder_ == null) {
        filters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        filtersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
     */
    public Builder removeFilters(int index) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        filters_.remove(index);
        onChanged();
      } else {
        filtersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
     */
    public com.aruna.api.hooks.services.v2.Filter.Builder getFiltersBuilder(
        int index) {
      return getFiltersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
     */
    public com.aruna.api.hooks.services.v2.FilterOrBuilder getFiltersOrBuilder(
        int index) {
      if (filtersBuilder_ == null) {
        return filters_.get(index);  } else {
        return filtersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
     */
    public java.util.List<? extends com.aruna.api.hooks.services.v2.FilterOrBuilder> 
         getFiltersOrBuilderList() {
      if (filtersBuilder_ != null) {
        return filtersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(filters_);
      }
    }
    /**
     * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
     */
    public com.aruna.api.hooks.services.v2.Filter.Builder addFiltersBuilder() {
      return getFiltersFieldBuilder().addBuilder(
          com.aruna.api.hooks.services.v2.Filter.getDefaultInstance());
    }
    /**
     * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
     */
    public com.aruna.api.hooks.services.v2.Filter.Builder addFiltersBuilder(
        int index) {
      return getFiltersFieldBuilder().addBuilder(
          index, com.aruna.api.hooks.services.v2.Filter.getDefaultInstance());
    }
    /**
     * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
     */
    public java.util.List<com.aruna.api.hooks.services.v2.Filter.Builder> 
         getFiltersBuilderList() {
      return getFiltersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aruna.api.hooks.services.v2.Filter, com.aruna.api.hooks.services.v2.Filter.Builder, com.aruna.api.hooks.services.v2.FilterOrBuilder> 
        getFiltersFieldBuilder() {
      if (filtersBuilder_ == null) {
        filtersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.aruna.api.hooks.services.v2.Filter, com.aruna.api.hooks.services.v2.Filter.Builder, com.aruna.api.hooks.services.v2.FilterOrBuilder>(
                filters_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        filters_ = null;
      }
      return filtersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aruna.api.hooks.services.v2.Trigger)
  }

  // @@protoc_insertion_point(class_scope:aruna.api.hooks.services.v2.Trigger)
  private static final com.aruna.api.hooks.services.v2.Trigger DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aruna.api.hooks.services.v2.Trigger();
  }

  public static com.aruna.api.hooks.services.v2.Trigger getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Trigger>
      PARSER = new com.google.protobuf.AbstractParser<Trigger>() {
    @java.lang.Override
    public Trigger parsePartialFrom(
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

  public static com.google.protobuf.Parser<Trigger> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Trigger> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aruna.api.hooks.services.v2.Trigger getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

