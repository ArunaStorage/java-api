// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/dataproxy/services/v2/dataproxy_service.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.dataproxy.services.v2;

public interface IngestExistingObjectRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.dataproxy.services.v2.IngestExistingObjectRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string project_id = 1 [json_name = "projectId"];</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <code>string project_id = 1 [json_name = "projectId"];</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <code>string collection_id = 2 [json_name = "collectionId"];</code>
   * @return Whether the collectionId field is set.
   */
  boolean hasCollectionId();
  /**
   * <code>string collection_id = 2 [json_name = "collectionId"];</code>
   * @return The collectionId.
   */
  java.lang.String getCollectionId();
  /**
   * <code>string collection_id = 2 [json_name = "collectionId"];</code>
   * @return The bytes for collectionId.
   */
  com.google.protobuf.ByteString
      getCollectionIdBytes();

  /**
   * <code>.aruna.api.dataproxy.services.v2.IngestResource collection_resource = 3 [json_name = "collectionResource"];</code>
   * @return Whether the collectionResource field is set.
   */
  boolean hasCollectionResource();
  /**
   * <code>.aruna.api.dataproxy.services.v2.IngestResource collection_resource = 3 [json_name = "collectionResource"];</code>
   * @return The collectionResource.
   */
  com.aruna.api.dataproxy.services.v2.IngestResource getCollectionResource();
  /**
   * <code>.aruna.api.dataproxy.services.v2.IngestResource collection_resource = 3 [json_name = "collectionResource"];</code>
   */
  com.aruna.api.dataproxy.services.v2.IngestResourceOrBuilder getCollectionResourceOrBuilder();

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

  /**
   * <code>.aruna.api.dataproxy.services.v2.IngestResource dataset_resource = 5 [json_name = "datasetResource"];</code>
   * @return Whether the datasetResource field is set.
   */
  boolean hasDatasetResource();
  /**
   * <code>.aruna.api.dataproxy.services.v2.IngestResource dataset_resource = 5 [json_name = "datasetResource"];</code>
   * @return The datasetResource.
   */
  com.aruna.api.dataproxy.services.v2.IngestResource getDatasetResource();
  /**
   * <code>.aruna.api.dataproxy.services.v2.IngestResource dataset_resource = 5 [json_name = "datasetResource"];</code>
   */
  com.aruna.api.dataproxy.services.v2.IngestResourceOrBuilder getDatasetResourceOrBuilder();

  /**
   * <code>.aruna.api.dataproxy.services.v2.IngestResource object = 6 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  boolean hasObject();
  /**
   * <code>.aruna.api.dataproxy.services.v2.IngestResource object = 6 [json_name = "object"];</code>
   * @return The object.
   */
  com.aruna.api.dataproxy.services.v2.IngestResource getObject();
  /**
   * <code>.aruna.api.dataproxy.services.v2.IngestResource object = 6 [json_name = "object"];</code>
   */
  com.aruna.api.dataproxy.services.v2.IngestResourceOrBuilder getObjectOrBuilder();

  /**
   * <pre>
   * "s3://bucket/key" or "file:///foo/bar/baz.txt" must be a valid file
   * </pre>
   *
   * <code>string path = 7 [json_name = "path"];</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <pre>
   * "s3://bucket/key" or "file:///foo/bar/baz.txt" must be a valid file
   * </pre>
   *
   * <code>string path = 7 [json_name = "path"];</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  com.aruna.api.dataproxy.services.v2.IngestExistingObjectRequest.CollectionCase getCollectionCase();

  com.aruna.api.dataproxy.services.v2.IngestExistingObjectRequest.DatasetCase getDatasetCase();
}
