// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/object_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface SetObjectHashesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.SetObjectHashesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Object id
   * </pre>
   *
   * <code>string object_id = 1 [json_name = "objectId"];</code>
   * @return The objectId.
   */
  java.lang.String getObjectId();
  /**
   * <pre>
   * Object id
   * </pre>
   *
   * <code>string object_id = 1 [json_name = "objectId"];</code>
   * @return The bytes for objectId.
   */
  com.google.protobuf.ByteString
      getObjectIdBytes();

  /**
   * <pre>
   * Hashes
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Hash hashes = 2 [json_name = "hashes"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.Hash> 
      getHashesList();
  /**
   * <pre>
   * Hashes
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Hash hashes = 2 [json_name = "hashes"];</code>
   */
  com.aruna.api.storage.models.v2.Hash getHashes(int index);
  /**
   * <pre>
   * Hashes
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Hash hashes = 2 [json_name = "hashes"];</code>
   */
  int getHashesCount();
  /**
   * <pre>
   * Hashes
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Hash hashes = 2 [json_name = "hashes"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.HashOrBuilder> 
      getHashesOrBuilderList();
  /**
   * <pre>
   * Hashes
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Hash hashes = 2 [json_name = "hashes"];</code>
   */
  com.aruna.api.storage.models.v2.HashOrBuilder getHashesOrBuilder(
      int index);
}
