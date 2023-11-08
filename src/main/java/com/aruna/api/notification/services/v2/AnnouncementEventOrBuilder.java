// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/notification/services/v2/notification_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.notification.services.v2;

public interface AnnouncementEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.notification.services.v2.AnnouncementEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string new_data_proxy_id = 1 [json_name = "newDataProxyId"];</code>
   * @return Whether the newDataProxyId field is set.
   */
  boolean hasNewDataProxyId();
  /**
   * <code>string new_data_proxy_id = 1 [json_name = "newDataProxyId"];</code>
   * @return The newDataProxyId.
   */
  java.lang.String getNewDataProxyId();
  /**
   * <code>string new_data_proxy_id = 1 [json_name = "newDataProxyId"];</code>
   * @return The bytes for newDataProxyId.
   */
  com.google.protobuf.ByteString
      getNewDataProxyIdBytes();

  /**
   * <code>string remove_data_proxy_id = 2 [json_name = "removeDataProxyId"];</code>
   * @return Whether the removeDataProxyId field is set.
   */
  boolean hasRemoveDataProxyId();
  /**
   * <code>string remove_data_proxy_id = 2 [json_name = "removeDataProxyId"];</code>
   * @return The removeDataProxyId.
   */
  java.lang.String getRemoveDataProxyId();
  /**
   * <code>string remove_data_proxy_id = 2 [json_name = "removeDataProxyId"];</code>
   * @return The bytes for removeDataProxyId.
   */
  com.google.protobuf.ByteString
      getRemoveDataProxyIdBytes();

  /**
   * <code>string update_data_proxy_id = 3 [json_name = "updateDataProxyId"];</code>
   * @return Whether the updateDataProxyId field is set.
   */
  boolean hasUpdateDataProxyId();
  /**
   * <code>string update_data_proxy_id = 3 [json_name = "updateDataProxyId"];</code>
   * @return The updateDataProxyId.
   */
  java.lang.String getUpdateDataProxyId();
  /**
   * <code>string update_data_proxy_id = 3 [json_name = "updateDataProxyId"];</code>
   * @return The bytes for updateDataProxyId.
   */
  com.google.protobuf.ByteString
      getUpdateDataProxyIdBytes();

  /**
   * <code>int32 new_pubkey = 4 [json_name = "newPubkey"];</code>
   * @return Whether the newPubkey field is set.
   */
  boolean hasNewPubkey();
  /**
   * <code>int32 new_pubkey = 4 [json_name = "newPubkey"];</code>
   * @return The newPubkey.
   */
  int getNewPubkey();

  /**
   * <code>int32 remove_pubkey = 5 [json_name = "removePubkey"];</code>
   * @return Whether the removePubkey field is set.
   */
  boolean hasRemovePubkey();
  /**
   * <code>int32 remove_pubkey = 5 [json_name = "removePubkey"];</code>
   * @return The removePubkey.
   */
  int getRemovePubkey();

  /**
   * <code>.aruna.api.notification.services.v2.ScheduledDowntime downtime = 6 [json_name = "downtime"];</code>
   * @return Whether the downtime field is set.
   */
  boolean hasDowntime();
  /**
   * <code>.aruna.api.notification.services.v2.ScheduledDowntime downtime = 6 [json_name = "downtime"];</code>
   * @return The downtime.
   */
  com.aruna.api.notification.services.v2.ScheduledDowntime getDowntime();
  /**
   * <code>.aruna.api.notification.services.v2.ScheduledDowntime downtime = 6 [json_name = "downtime"];</code>
   */
  com.aruna.api.notification.services.v2.ScheduledDowntimeOrBuilder getDowntimeOrBuilder();

  /**
   * <code>.aruna.api.notification.services.v2.NewVersion version = 7 [json_name = "version"];</code>
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   * <code>.aruna.api.notification.services.v2.NewVersion version = 7 [json_name = "version"];</code>
   * @return The version.
   */
  com.aruna.api.notification.services.v2.NewVersion getVersion();
  /**
   * <code>.aruna.api.notification.services.v2.NewVersion version = 7 [json_name = "version"];</code>
   */
  com.aruna.api.notification.services.v2.NewVersionOrBuilder getVersionOrBuilder();

  /**
   * <code>.aruna.api.notification.services.v2.Reply reply = 8 [json_name = "reply"];</code>
   * @return Whether the reply field is set.
   */
  boolean hasReply();
  /**
   * <code>.aruna.api.notification.services.v2.Reply reply = 8 [json_name = "reply"];</code>
   * @return The reply.
   */
  com.aruna.api.notification.services.v2.Reply getReply();
  /**
   * <code>.aruna.api.notification.services.v2.Reply reply = 8 [json_name = "reply"];</code>
   */
  com.aruna.api.notification.services.v2.ReplyOrBuilder getReplyOrBuilder();

  com.aruna.api.notification.services.v2.AnnouncementEvent.EventVariantCase getEventVariantCase();
}