// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/notification/services/v2/notification_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.notification.services.v2;

public interface GetEventMessageStreamResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.notification.services.v2.GetEventMessageStreamResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aruna.api.notification.services.v2.EventMessage message = 1 [json_name = "message"];</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <code>.aruna.api.notification.services.v2.EventMessage message = 1 [json_name = "message"];</code>
   * @return The message.
   */
  com.aruna.api.notification.services.v2.EventMessage getMessage();
  /**
   * <code>.aruna.api.notification.services.v2.EventMessage message = 1 [json_name = "message"];</code>
   */
  com.aruna.api.notification.services.v2.EventMessageOrBuilder getMessageOrBuilder();
}
