// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/object_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.services.v2;

public interface FinishObjectStagingRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.FinishObjectStagingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ObjectId
   * </pre>
   *
   * <code>string object_id = 1 [json_name = "objectId"];</code>
   * @return The objectId.
   */
  java.lang.String getObjectId();
  /**
   * <pre>
   * ObjectId
   * </pre>
   *
   * <code>string object_id = 1 [json_name = "objectId"];</code>
   * @return The bytes for objectId.
   */
  com.google.protobuf.ByteString
      getObjectIdBytes();

  /**
   * <pre>
   * Final content len 
   * </pre>
   *
   * <code>int64 content_len = 2 [json_name = "contentLen"];</code>
   * @return The contentLen.
   */
  long getContentLen();

  /**
   * <pre>
   * Hash of the uploaded data - used to verify the data integrity.
   * This supports multiple hashing algorithms.
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Hash hashes = 3 [json_name = "hashes"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.Hash> 
      getHashesList();
  /**
   * <pre>
   * Hash of the uploaded data - used to verify the data integrity.
   * This supports multiple hashing algorithms.
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Hash hashes = 3 [json_name = "hashes"];</code>
   */
  com.aruna.api.storage.models.v2.Hash getHashes(int index);
  /**
   * <pre>
   * Hash of the uploaded data - used to verify the data integrity.
   * This supports multiple hashing algorithms.
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Hash hashes = 3 [json_name = "hashes"];</code>
   */
  int getHashesCount();
  /**
   * <pre>
   * Hash of the uploaded data - used to verify the data integrity.
   * This supports multiple hashing algorithms.
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Hash hashes = 3 [json_name = "hashes"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.HashOrBuilder> 
      getHashesOrBuilderList();
  /**
   * <pre>
   * Hash of the uploaded data - used to verify the data integrity.
   * This supports multiple hashing algorithms.
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Hash hashes = 3 [json_name = "hashes"];</code>
   */
  com.aruna.api.storage.models.v2.HashOrBuilder getHashesOrBuilder(
      int index);

  /**
   * <pre>
   * If the upload was multipart, this is the list of parts that were uploaded.
   * Should be empty if the upload was not multipart.
   * (optional)
   * </pre>
   *
   * <code>repeated .aruna.api.storage.services.v2.CompletedPart completed_parts = 4 [json_name = "completedParts"];</code>
   */
  java.util.List<com.aruna.api.storage.services.v2.CompletedPart> 
      getCompletedPartsList();
  /**
   * <pre>
   * If the upload was multipart, this is the list of parts that were uploaded.
   * Should be empty if the upload was not multipart.
   * (optional)
   * </pre>
   *
   * <code>repeated .aruna.api.storage.services.v2.CompletedPart completed_parts = 4 [json_name = "completedParts"];</code>
   */
  com.aruna.api.storage.services.v2.CompletedPart getCompletedParts(int index);
  /**
   * <pre>
   * If the upload was multipart, this is the list of parts that were uploaded.
   * Should be empty if the upload was not multipart.
   * (optional)
   * </pre>
   *
   * <code>repeated .aruna.api.storage.services.v2.CompletedPart completed_parts = 4 [json_name = "completedParts"];</code>
   */
  int getCompletedPartsCount();
  /**
   * <pre>
   * If the upload was multipart, this is the list of parts that were uploaded.
   * Should be empty if the upload was not multipart.
   * (optional)
   * </pre>
   *
   * <code>repeated .aruna.api.storage.services.v2.CompletedPart completed_parts = 4 [json_name = "completedParts"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.services.v2.CompletedPartOrBuilder> 
      getCompletedPartsOrBuilderList();
  /**
   * <pre>
   * If the upload was multipart, this is the list of parts that were uploaded.
   * Should be empty if the upload was not multipart.
   * (optional)
   * </pre>
   *
   * <code>repeated .aruna.api.storage.services.v2.CompletedPart completed_parts = 4 [json_name = "completedParts"];</code>
   */
  com.aruna.api.storage.services.v2.CompletedPartOrBuilder getCompletedPartsOrBuilder(
      int index);
}
