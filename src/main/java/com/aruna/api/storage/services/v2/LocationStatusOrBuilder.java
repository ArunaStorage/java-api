// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/info_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.services.v2;

public interface LocationStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.LocationStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Status of a specific Location e.g Gießen / AVAILABLE
   * </pre>
   *
   * <code>string location = 1 [json_name = "location"];</code>
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   * <pre>
   * Status of a specific Location e.g Gießen / AVAILABLE
   * </pre>
   *
   * <code>string location = 1 [json_name = "location"];</code>
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString
      getLocationBytes();

  /**
   * <code>repeated .aruna.api.storage.services.v2.ComponentStatus component_status = 2 [json_name = "componentStatus"];</code>
   */
  java.util.List<com.aruna.api.storage.services.v2.ComponentStatus> 
      getComponentStatusList();
  /**
   * <code>repeated .aruna.api.storage.services.v2.ComponentStatus component_status = 2 [json_name = "componentStatus"];</code>
   */
  com.aruna.api.storage.services.v2.ComponentStatus getComponentStatus(int index);
  /**
   * <code>repeated .aruna.api.storage.services.v2.ComponentStatus component_status = 2 [json_name = "componentStatus"];</code>
   */
  int getComponentStatusCount();
  /**
   * <code>repeated .aruna.api.storage.services.v2.ComponentStatus component_status = 2 [json_name = "componentStatus"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.services.v2.ComponentStatusOrBuilder> 
      getComponentStatusOrBuilderList();
  /**
   * <code>repeated .aruna.api.storage.services.v2.ComponentStatus component_status = 2 [json_name = "componentStatus"];</code>
   */
  com.aruna.api.storage.services.v2.ComponentStatusOrBuilder getComponentStatusOrBuilder(
      int index);
}
