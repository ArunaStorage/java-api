// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 3.25.1
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
   * <pre>
   * Hint if the objects' project 
   * is fully synced to the endpoint
   * </pre>
   *
   * <code>bool full_synced = 2 [json_name = "fullSynced"];</code>
   * @return The fullSynced.
   */
  boolean getFullSynced();
}
