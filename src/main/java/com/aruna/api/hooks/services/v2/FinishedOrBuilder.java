// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/hooks/services/v2/hooks_service.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.hooks.services.v2;

public interface FinishedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.hooks.services.v2.Finished)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .aruna.api.storage.models.v2.KeyValue add_key_values = 1 [json_name = "addKeyValues"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.KeyValue> 
      getAddKeyValuesList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.KeyValue add_key_values = 1 [json_name = "addKeyValues"];</code>
   */
  com.aruna.api.storage.models.v2.KeyValue getAddKeyValues(int index);
  /**
   * <code>repeated .aruna.api.storage.models.v2.KeyValue add_key_values = 1 [json_name = "addKeyValues"];</code>
   */
  int getAddKeyValuesCount();
  /**
   * <code>repeated .aruna.api.storage.models.v2.KeyValue add_key_values = 1 [json_name = "addKeyValues"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.KeyValueOrBuilder> 
      getAddKeyValuesOrBuilderList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.KeyValue add_key_values = 1 [json_name = "addKeyValues"];</code>
   */
  com.aruna.api.storage.models.v2.KeyValueOrBuilder getAddKeyValuesOrBuilder(
      int index);

  /**
   * <code>repeated .aruna.api.storage.models.v2.KeyValue remove_key_values = 2 [json_name = "removeKeyValues"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.KeyValue> 
      getRemoveKeyValuesList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.KeyValue remove_key_values = 2 [json_name = "removeKeyValues"];</code>
   */
  com.aruna.api.storage.models.v2.KeyValue getRemoveKeyValues(int index);
  /**
   * <code>repeated .aruna.api.storage.models.v2.KeyValue remove_key_values = 2 [json_name = "removeKeyValues"];</code>
   */
  int getRemoveKeyValuesCount();
  /**
   * <code>repeated .aruna.api.storage.models.v2.KeyValue remove_key_values = 2 [json_name = "removeKeyValues"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.KeyValueOrBuilder> 
      getRemoveKeyValuesOrBuilderList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.KeyValue remove_key_values = 2 [json_name = "removeKeyValues"];</code>
   */
  com.aruna.api.storage.models.v2.KeyValueOrBuilder getRemoveKeyValuesOrBuilder(
      int index);
}
