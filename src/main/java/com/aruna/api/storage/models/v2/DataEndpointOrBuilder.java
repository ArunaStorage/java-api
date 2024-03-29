// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.models.v2;

public interface DataEndpointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.models.v2.DataEndpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>.aruna.api.storage.models.v2.FullSync full_sync = 2 [json_name = "fullSync"];</code>
   * @return Whether the fullSync field is set.
   */
  boolean hasFullSync();
  /**
   * <code>.aruna.api.storage.models.v2.FullSync full_sync = 2 [json_name = "fullSync"];</code>
   * @return The fullSync.
   */
  com.aruna.api.storage.models.v2.FullSync getFullSync();
  /**
   * <code>.aruna.api.storage.models.v2.FullSync full_sync = 2 [json_name = "fullSync"];</code>
   */
  com.aruna.api.storage.models.v2.FullSyncOrBuilder getFullSyncOrBuilder();

  /**
   * <code>bool partial_sync = 3 [json_name = "partialSync"];</code>
   * @return Whether the partialSync field is set.
   */
  boolean hasPartialSync();
  /**
   * <code>bool partial_sync = 3 [json_name = "partialSync"];</code>
   * @return The partialSync.
   */
  boolean getPartialSync();

  /**
   * <code>optional .aruna.api.storage.models.v2.ReplicationStatus status = 4 [json_name = "status"];</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>optional .aruna.api.storage.models.v2.ReplicationStatus status = 4 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>optional .aruna.api.storage.models.v2.ReplicationStatus status = 4 [json_name = "status"];</code>
   * @return The status.
   */
  com.aruna.api.storage.models.v2.ReplicationStatus getStatus();

  com.aruna.api.storage.models.v2.DataEndpoint.VariantCase getVariantCase();
}
