// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/notification/services/v2/notification_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.notification.services.v2;

public interface AcknowledgeMessageBatchRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.notification.services.v2.AcknowledgeMessageBatchRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .aruna.api.notification.services.v2.Reply replies = 1 [json_name = "replies"];</code>
   */
  java.util.List<com.aruna.api.notification.services.v2.Reply> 
      getRepliesList();
  /**
   * <code>repeated .aruna.api.notification.services.v2.Reply replies = 1 [json_name = "replies"];</code>
   */
  com.aruna.api.notification.services.v2.Reply getReplies(int index);
  /**
   * <code>repeated .aruna.api.notification.services.v2.Reply replies = 1 [json_name = "replies"];</code>
   */
  int getRepliesCount();
  /**
   * <code>repeated .aruna.api.notification.services.v2.Reply replies = 1 [json_name = "replies"];</code>
   */
  java.util.List<? extends com.aruna.api.notification.services.v2.ReplyOrBuilder> 
      getRepliesOrBuilderList();
  /**
   * <code>repeated .aruna.api.notification.services.v2.Reply replies = 1 [json_name = "replies"];</code>
   */
  com.aruna.api.notification.services.v2.ReplyOrBuilder getRepliesOrBuilder(
      int index);
}
