// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/dataset_service.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.storage.services.v2;

public interface CreateDatasetResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.CreateDatasetResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The new dataset_id
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Dataset dataset = 1 [json_name = "dataset"];</code>
   * @return Whether the dataset field is set.
   */
  boolean hasDataset();
  /**
   * <pre>
   * The new dataset_id
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Dataset dataset = 1 [json_name = "dataset"];</code>
   * @return The dataset.
   */
  com.aruna.api.storage.models.v2.Dataset getDataset();
  /**
   * <pre>
   * The new dataset_id
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Dataset dataset = 1 [json_name = "dataset"];</code>
   */
  com.aruna.api.storage.models.v2.DatasetOrBuilder getDatasetOrBuilder();
}
