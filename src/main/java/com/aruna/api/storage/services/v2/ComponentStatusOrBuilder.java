// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/info_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.storage.services.v2;

public interface ComponentStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.ComponentStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of a specific component e.g. server, dataproxy etc. and their status by location
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of a specific component e.g. server, dataproxy etc. and their status by location
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

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
