// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/dataproxy/services/v2/dataproxy_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.dataproxy.services.v2;

public interface RetryChunkMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.dataproxy.services.v2.RetryChunkMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string object_id = 1 [json_name = "objectId"];</code>
   * @return The objectId.
   */
  java.lang.String getObjectId();
  /**
   * <code>string object_id = 1 [json_name = "objectId"];</code>
   * @return The bytes for objectId.
   */
  com.google.protobuf.ByteString
      getObjectIdBytes();

  /**
   * <code>int64 chunk_idx = 2 [json_name = "chunkIdx"];</code>
   * @return The chunkIdx.
   */
  long getChunkIdx();
}
