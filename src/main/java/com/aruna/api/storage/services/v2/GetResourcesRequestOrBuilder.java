// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/search_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface GetResourcesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.GetResourcesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string resource_ids = 1 [json_name = "resourceIds"];</code>
   * @return A list containing the resourceIds.
   */
  java.util.List<java.lang.String>
      getResourceIdsList();
  /**
   * <code>repeated string resource_ids = 1 [json_name = "resourceIds"];</code>
   * @return The count of resourceIds.
   */
  int getResourceIdsCount();
  /**
   * <code>repeated string resource_ids = 1 [json_name = "resourceIds"];</code>
   * @param index The index of the element to return.
   * @return The resourceIds at the given index.
   */
  java.lang.String getResourceIds(int index);
  /**
   * <code>repeated string resource_ids = 1 [json_name = "resourceIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the resourceIds at the given index.
   */
  com.google.protobuf.ByteString
      getResourceIdsBytes(int index);
}
