// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/endpoint_service.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.storage.services.v2;

public interface SetEndpointStatusRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.SetEndpointStatusRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string endpoint_id = 1 [json_name = "endpointId"];</code>
   * @return The endpointId.
   */
  java.lang.String getEndpointId();
  /**
   * <code>string endpoint_id = 1 [json_name = "endpointId"];</code>
   * @return The bytes for endpointId.
   */
  com.google.protobuf.ByteString
      getEndpointIdBytes();

  /**
   * <code>.aruna.api.storage.models.v2.ComponentStatus status = 2 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.aruna.api.storage.models.v2.ComponentStatus status = 2 [json_name = "status"];</code>
   * @return The status.
   */
  com.aruna.api.storage.models.v2.ComponentStatus getStatus();
}
