// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/dataproxy/services/v2/dataproxy_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.dataproxy.services.v2;

public interface InitLocationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.dataproxy.services.v2.InitLocationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string object_name = 1 [json_name = "objectName"];</code>
   * @return The objectName.
   */
  java.lang.String getObjectName();
  /**
   * <code>string object_name = 1 [json_name = "objectName"];</code>
   * @return The bytes for objectName.
   */
  com.google.protobuf.ByteString
      getObjectNameBytes();

  /**
   * <code>int64 size = 2 [json_name = "size"];</code>
   * @return The size.
   */
  long getSize();

  /**
   * <code>bool is_temporary = 3 [json_name = "isTemporary"];</code>
   * @return The isTemporary.
   */
  boolean getIsTemporary();
}
