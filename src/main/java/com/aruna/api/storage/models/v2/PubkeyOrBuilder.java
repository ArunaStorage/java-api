// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 3.25.1
package com.aruna.api.storage.models.v2;

public interface PubkeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.models.v2.Pubkey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string key = 2 [json_name = "key"];</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <code>string key = 2 [json_name = "key"];</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>string location = 3 [json_name = "location"];</code>
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   * <code>string location = 3 [json_name = "location"];</code>
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString
      getLocationBytes();
}
