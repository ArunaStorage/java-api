// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/data_replication_service.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.storage.services.v2;

public interface ReplicateProjectDataRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.ReplicateProjectDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string project_id = 1 [json_name = "projectId"];</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <code>string project_id = 1 [json_name = "projectId"];</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

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
