// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/hooks/services/v2/hooks_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.hooks.services.v2;

public interface FilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.hooks.services.v2.Filter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Regex that matches name field
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Regex that matches name field
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Regex that matches name field
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Regex that matches key AND value
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.KeyValue key_value = 2 [json_name = "keyValue"];</code>
   * @return Whether the keyValue field is set.
   */
  boolean hasKeyValue();
  /**
   * <pre>
   * Regex that matches key AND value
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.KeyValue key_value = 2 [json_name = "keyValue"];</code>
   * @return The keyValue.
   */
  com.aruna.api.storage.models.v2.KeyValue getKeyValue();
  /**
   * <pre>
   * Regex that matches key AND value
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.KeyValue key_value = 2 [json_name = "keyValue"];</code>
   */
  com.aruna.api.storage.models.v2.KeyValueOrBuilder getKeyValueOrBuilder();

  com.aruna.api.hooks.services.v2.Filter.FilterVariantCase getFilterVariantCase();
}
