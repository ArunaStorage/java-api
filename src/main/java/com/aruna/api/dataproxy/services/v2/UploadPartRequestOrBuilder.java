// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/dataproxy/services/v2/dataproxy_service.proto

// Protobuf Java Version: 3.25.1
package com.aruna.api.dataproxy.services.v2;

public interface UploadPartRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.dataproxy.services.v2.UploadPartRequest)
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
   * <code>int32 part_number = 3 [json_name = "partNumber"];</code>
   * @return The partNumber.
   */
  int getPartNumber();

  /**
   * <code>bytes data = 4 [json_name = "data"];</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();
}
