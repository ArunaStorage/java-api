// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/dataproxy/services/v2/dataproxy_service.proto

// Protobuf Java Version: 3.25.1
package com.aruna.api.dataproxy.services.v2;

public interface CompleteMultiPartUploadRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.dataproxy.services.v2.CompleteMultiPartUploadRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aruna.api.dataproxy.services.v2.ObjectLocation location = 1 [json_name = "location"];</code>
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   * <code>.aruna.api.dataproxy.services.v2.ObjectLocation location = 1 [json_name = "location"];</code>
   * @return The location.
   */
  com.aruna.api.dataproxy.services.v2.ObjectLocation getLocation();
  /**
   * <code>.aruna.api.dataproxy.services.v2.ObjectLocation location = 1 [json_name = "location"];</code>
   */
  com.aruna.api.dataproxy.services.v2.ObjectLocationOrBuilder getLocationOrBuilder();

  /**
   * <code>repeated .aruna.api.dataproxy.services.v2.CompletedPart completed_parts = 2 [json_name = "completedParts"];</code>
   */
  java.util.List<com.aruna.api.dataproxy.services.v2.CompletedPart> 
      getCompletedPartsList();
  /**
   * <code>repeated .aruna.api.dataproxy.services.v2.CompletedPart completed_parts = 2 [json_name = "completedParts"];</code>
   */
  com.aruna.api.dataproxy.services.v2.CompletedPart getCompletedParts(int index);
  /**
   * <code>repeated .aruna.api.dataproxy.services.v2.CompletedPart completed_parts = 2 [json_name = "completedParts"];</code>
   */
  int getCompletedPartsCount();
  /**
   * <code>repeated .aruna.api.dataproxy.services.v2.CompletedPart completed_parts = 2 [json_name = "completedParts"];</code>
   */
  java.util.List<? extends com.aruna.api.dataproxy.services.v2.CompletedPartOrBuilder> 
      getCompletedPartsOrBuilderList();
  /**
   * <code>repeated .aruna.api.dataproxy.services.v2.CompletedPart completed_parts = 2 [json_name = "completedParts"];</code>
   */
  com.aruna.api.dataproxy.services.v2.CompletedPartOrBuilder getCompletedPartsOrBuilder(
      int index);
}
