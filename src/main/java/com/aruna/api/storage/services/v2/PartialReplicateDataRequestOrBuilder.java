// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/data_replication_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.services.v2;

public interface PartialReplicateDataRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.PartialReplicateDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string resource_id = 1 [json_name = "resourceId"];</code>
   * @return The resourceId.
   */
  java.lang.String getResourceId();
  /**
   * <code>string resource_id = 1 [json_name = "resourceId"];</code>
   * @return The bytes for resourceId.
   */
  com.google.protobuf.ByteString
      getResourceIdBytes();

  /**
   * <code>string endpoint_id = 2 [json_name = "endpointId"];</code>
   * @return The endpointId.
   */
  java.lang.String getEndpointId();
  /**
   * <code>string endpoint_id = 2 [json_name = "endpointId"];</code>
   * @return The bytes for endpointId.
   */
  com.google.protobuf.ByteString
      getEndpointIdBytes();
}
