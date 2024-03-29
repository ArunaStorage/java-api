// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/object_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface CloneObjectRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.CloneObjectRequest)
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
   * <code>string project_id = 2 [json_name = "projectId"];</code>
   * @return Whether the projectId field is set.
   */
  boolean hasProjectId();
  /**
   * <code>string project_id = 2 [json_name = "projectId"];</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <code>string project_id = 2 [json_name = "projectId"];</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <code>string collection_id = 3 [json_name = "collectionId"];</code>
   * @return Whether the collectionId field is set.
   */
  boolean hasCollectionId();
  /**
   * <code>string collection_id = 3 [json_name = "collectionId"];</code>
   * @return The collectionId.
   */
  java.lang.String getCollectionId();
  /**
   * <code>string collection_id = 3 [json_name = "collectionId"];</code>
   * @return The bytes for collectionId.
   */
  com.google.protobuf.ByteString
      getCollectionIdBytes();

  /**
   * <code>string dataset_id = 4 [json_name = "datasetId"];</code>
   * @return Whether the datasetId field is set.
   */
  boolean hasDatasetId();
  /**
   * <code>string dataset_id = 4 [json_name = "datasetId"];</code>
   * @return The datasetId.
   */
  java.lang.String getDatasetId();
  /**
   * <code>string dataset_id = 4 [json_name = "datasetId"];</code>
   * @return The bytes for datasetId.
   */
  com.google.protobuf.ByteString
      getDatasetIdBytes();

  com.aruna.api.storage.services.v2.CloneObjectRequest.ParentCase getParentCase();
}
