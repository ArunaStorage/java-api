// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/dataproxy/services/v2/dataproxy_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.dataproxy.services.v2;

public interface ErrorMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.dataproxy.services.v2.ErrorMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aruna.api.dataproxy.services.v2.RetryChunkMessage retry_chunk = 1 [json_name = "retryChunk"];</code>
   * @return Whether the retryChunk field is set.
   */
  boolean hasRetryChunk();
  /**
   * <code>.aruna.api.dataproxy.services.v2.RetryChunkMessage retry_chunk = 1 [json_name = "retryChunk"];</code>
   * @return The retryChunk.
   */
  com.aruna.api.dataproxy.services.v2.RetryChunkMessage getRetryChunk();
  /**
   * <code>.aruna.api.dataproxy.services.v2.RetryChunkMessage retry_chunk = 1 [json_name = "retryChunk"];</code>
   */
  com.aruna.api.dataproxy.services.v2.RetryChunkMessageOrBuilder getRetryChunkOrBuilder();

  /**
   * <code>.aruna.api.dataproxy.services.v2.Empty abort = 2 [json_name = "abort"];</code>
   * @return Whether the abort field is set.
   */
  boolean hasAbort();
  /**
   * <code>.aruna.api.dataproxy.services.v2.Empty abort = 2 [json_name = "abort"];</code>
   * @return The abort.
   */
  com.aruna.api.dataproxy.services.v2.Empty getAbort();
  /**
   * <code>.aruna.api.dataproxy.services.v2.Empty abort = 2 [json_name = "abort"];</code>
   */
  com.aruna.api.dataproxy.services.v2.EmptyOrBuilder getAbortOrBuilder();

  /**
   * <code>string retry_object_id = 3 [json_name = "retryObjectId"];</code>
   * @return Whether the retryObjectId field is set.
   */
  boolean hasRetryObjectId();
  /**
   * <code>string retry_object_id = 3 [json_name = "retryObjectId"];</code>
   * @return The retryObjectId.
   */
  java.lang.String getRetryObjectId();
  /**
   * <code>string retry_object_id = 3 [json_name = "retryObjectId"];</code>
   * @return The bytes for retryObjectId.
   */
  com.google.protobuf.ByteString
      getRetryObjectIdBytes();

  com.aruna.api.dataproxy.services.v2.ErrorMessage.ErrorCase getErrorCase();
}
