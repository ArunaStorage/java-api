// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/notification/services/v2/notification_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.notification.services.v2;

public interface GetEventMessageBatchRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.notification.services.v2.GetEventMessageBatchRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string stream_consumer = 1 [json_name = "streamConsumer"];</code>
   * @return The streamConsumer.
   */
  java.lang.String getStreamConsumer();
  /**
   * <code>string stream_consumer = 1 [json_name = "streamConsumer"];</code>
   * @return The bytes for streamConsumer.
   */
  com.google.protobuf.ByteString
      getStreamConsumerBytes();

  /**
   * <code>uint32 batch_size = 2 [json_name = "batchSize"];</code>
   * @return The batchSize.
   */
  int getBatchSize();
}
