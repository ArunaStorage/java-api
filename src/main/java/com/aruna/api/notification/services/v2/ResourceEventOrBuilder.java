// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/notification/services/v2/notification_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.notification.services.v2;

public interface ResourceEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.notification.services.v2.ResourceEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aruna.api.notification.services.v2.Resource resource = 1 [json_name = "resource"];</code>
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   * <code>.aruna.api.notification.services.v2.Resource resource = 1 [json_name = "resource"];</code>
   * @return The resource.
   */
  com.aruna.api.notification.services.v2.Resource getResource();
  /**
   * <code>.aruna.api.notification.services.v2.Resource resource = 1 [json_name = "resource"];</code>
   */
  com.aruna.api.notification.services.v2.ResourceOrBuilder getResourceOrBuilder();

  /**
   * <code>.aruna.api.notification.services.v2.EventVariant event_variant = 2 [json_name = "eventVariant"];</code>
   * @return The enum numeric value on the wire for eventVariant.
   */
  int getEventVariantValue();
  /**
   * <code>.aruna.api.notification.services.v2.EventVariant event_variant = 2 [json_name = "eventVariant"];</code>
   * @return The eventVariant.
   */
  com.aruna.api.notification.services.v2.EventVariant getEventVariant();

  /**
   * <code>.aruna.api.notification.services.v2.Reply reply = 3 [json_name = "reply"];</code>
   * @return Whether the reply field is set.
   */
  boolean hasReply();
  /**
   * <code>.aruna.api.notification.services.v2.Reply reply = 3 [json_name = "reply"];</code>
   * @return The reply.
   */
  com.aruna.api.notification.services.v2.Reply getReply();
  /**
   * <code>.aruna.api.notification.services.v2.Reply reply = 3 [json_name = "reply"];</code>
   */
  com.aruna.api.notification.services.v2.ReplyOrBuilder getReplyOrBuilder();
}
