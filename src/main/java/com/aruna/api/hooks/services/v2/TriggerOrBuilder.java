// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/hooks/services/v2/hooks_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.hooks.services.v2;

public interface TriggerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.hooks.services.v2.Trigger)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aruna.api.hooks.services.v2.TriggerType trigger_type = 1 [json_name = "triggerType"];</code>
   * @return The enum numeric value on the wire for triggerType.
   */
  int getTriggerTypeValue();
  /**
   * <code>.aruna.api.hooks.services.v2.TriggerType trigger_type = 1 [json_name = "triggerType"];</code>
   * @return The triggerType.
   */
  com.aruna.api.hooks.services.v2.TriggerType getTriggerType();

  /**
   * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
   */
  java.util.List<com.aruna.api.hooks.services.v2.Filter> 
      getFiltersList();
  /**
   * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
   */
  com.aruna.api.hooks.services.v2.Filter getFilters(int index);
  /**
   * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
   */
  int getFiltersCount();
  /**
   * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
   */
  java.util.List<? extends com.aruna.api.hooks.services.v2.FilterOrBuilder> 
      getFiltersOrBuilderList();
  /**
   * <code>repeated .aruna.api.hooks.services.v2.Filter filters = 2 [json_name = "filters"];</code>
   */
  com.aruna.api.hooks.services.v2.FilterOrBuilder getFiltersOrBuilder(
      int index);
}
