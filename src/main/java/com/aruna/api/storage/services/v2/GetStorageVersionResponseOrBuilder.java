// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/info_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface GetStorageVersionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.GetStorageVersionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .aruna.api.storage.services.v2.LocationVersion location_version = 1 [json_name = "locationVersion"];</code>
   */
  java.util.List<com.aruna.api.storage.services.v2.LocationVersion> 
      getLocationVersionList();
  /**
   * <code>repeated .aruna.api.storage.services.v2.LocationVersion location_version = 1 [json_name = "locationVersion"];</code>
   */
  com.aruna.api.storage.services.v2.LocationVersion getLocationVersion(int index);
  /**
   * <code>repeated .aruna.api.storage.services.v2.LocationVersion location_version = 1 [json_name = "locationVersion"];</code>
   */
  int getLocationVersionCount();
  /**
   * <code>repeated .aruna.api.storage.services.v2.LocationVersion location_version = 1 [json_name = "locationVersion"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.services.v2.LocationVersionOrBuilder> 
      getLocationVersionOrBuilderList();
  /**
   * <code>repeated .aruna.api.storage.services.v2.LocationVersion location_version = 1 [json_name = "locationVersion"];</code>
   */
  com.aruna.api.storage.services.v2.LocationVersionOrBuilder getLocationVersionOrBuilder(
      int index);
}
