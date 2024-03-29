// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/dataset_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface SnapshotDatasetResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.SnapshotDatasetResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This dataset will be returned via an Persistent Identifier! Updates will be impossible
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Dataset dataset = 1 [json_name = "dataset"];</code>
   * @return Whether the dataset field is set.
   */
  boolean hasDataset();
  /**
   * <pre>
   * This dataset will be returned via an Persistent Identifier! Updates will be impossible
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Dataset dataset = 1 [json_name = "dataset"];</code>
   * @return The dataset.
   */
  com.aruna.api.storage.models.v2.Dataset getDataset();
  /**
   * <pre>
   * This dataset will be returned via an Persistent Identifier! Updates will be impossible
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Dataset dataset = 1 [json_name = "dataset"];</code>
   */
  com.aruna.api.storage.models.v2.DatasetOrBuilder getDatasetOrBuilder();
}
