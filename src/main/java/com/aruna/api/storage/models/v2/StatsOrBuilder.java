// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.storage.models.v2;

public interface StatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.models.v2.Stats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 count = 1 [json_name = "count"];</code>
   * @return The count.
   */
  long getCount();

  /**
   * <code>int64 size = 2 [json_name = "size"];</code>
   * @return The size.
   */
  long getSize();

  /**
   * <code>.google.protobuf.Timestamp last_updated = 3 [json_name = "lastUpdated"];</code>
   * @return Whether the lastUpdated field is set.
   */
  boolean hasLastUpdated();
  /**
   * <code>.google.protobuf.Timestamp last_updated = 3 [json_name = "lastUpdated"];</code>
   * @return The lastUpdated.
   */
  com.google.protobuf.Timestamp getLastUpdated();
  /**
   * <code>.google.protobuf.Timestamp last_updated = 3 [json_name = "lastUpdated"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastUpdatedOrBuilder();
}
