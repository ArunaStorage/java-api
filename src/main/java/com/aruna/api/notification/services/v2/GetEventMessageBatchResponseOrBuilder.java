// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/notification/services/v2/notification_service.proto

// Protobuf Java Version: 3.25.1
package com.aruna.api.notification.services.v2;

public interface GetEventMessageBatchResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.notification.services.v2.GetEventMessageBatchResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .aruna.api.notification.services.v2.EventMessage messages = 1 [json_name = "messages"];</code>
   */
  java.util.List<com.aruna.api.notification.services.v2.EventMessage> 
      getMessagesList();
  /**
   * <code>repeated .aruna.api.notification.services.v2.EventMessage messages = 1 [json_name = "messages"];</code>
   */
  com.aruna.api.notification.services.v2.EventMessage getMessages(int index);
  /**
   * <code>repeated .aruna.api.notification.services.v2.EventMessage messages = 1 [json_name = "messages"];</code>
   */
  int getMessagesCount();
  /**
   * <code>repeated .aruna.api.notification.services.v2.EventMessage messages = 1 [json_name = "messages"];</code>
   */
  java.util.List<? extends com.aruna.api.notification.services.v2.EventMessageOrBuilder> 
      getMessagesOrBuilderList();
  /**
   * <code>repeated .aruna.api.notification.services.v2.EventMessage messages = 1 [json_name = "messages"];</code>
   */
  com.aruna.api.notification.services.v2.EventMessageOrBuilder getMessagesOrBuilder(
      int index);
}
