// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/notification/services/v2/notification_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.notification.services.v2;

public interface ScheduledDowntimeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.notification.services.v2.ScheduledDowntime)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string location = 1 [json_name = "location"];</code>
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   * <code>string location = 1 [json_name = "location"];</code>
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString
      getLocationBytes();

  /**
   * <code>string component = 2 [json_name = "component"];</code>
   * @return The component.
   */
  java.lang.String getComponent();
  /**
   * <code>string component = 2 [json_name = "component"];</code>
   * @return The bytes for component.
   */
  com.google.protobuf.ByteString
      getComponentBytes();

  /**
   * <code>.google.protobuf.Timestamp from = 3 [json_name = "from"];</code>
   * @return Whether the from field is set.
   */
  boolean hasFrom();
  /**
   * <code>.google.protobuf.Timestamp from = 3 [json_name = "from"];</code>
   * @return The from.
   */
  com.google.protobuf.Timestamp getFrom();
  /**
   * <code>.google.protobuf.Timestamp from = 3 [json_name = "from"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getFromOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp to = 4 [json_name = "to"];</code>
   * @return Whether the to field is set.
   */
  boolean hasTo();
  /**
   * <code>.google.protobuf.Timestamp to = 4 [json_name = "to"];</code>
   * @return The to.
   */
  com.google.protobuf.Timestamp getTo();
  /**
   * <code>.google.protobuf.Timestamp to = 4 [json_name = "to"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getToOrBuilder();
}
