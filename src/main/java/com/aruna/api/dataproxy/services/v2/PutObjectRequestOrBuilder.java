// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/dataproxy/services/v2/dataproxy_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.dataproxy.services.v2;

public interface PutObjectRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.dataproxy.services.v2.PutObjectRequest)
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
   * <code>bytes data = 2 [json_name = "data"];</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();
}
