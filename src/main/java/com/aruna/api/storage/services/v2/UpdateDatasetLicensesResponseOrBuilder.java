// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/dataset_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface UpdateDatasetLicensesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.UpdateDatasetLicensesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aruna.api.storage.models.v2.Dataset dataset = 1 [json_name = "dataset"];</code>
   * @return Whether the dataset field is set.
   */
  boolean hasDataset();
  /**
   * <code>.aruna.api.storage.models.v2.Dataset dataset = 1 [json_name = "dataset"];</code>
   * @return The dataset.
   */
  com.aruna.api.storage.models.v2.Dataset getDataset();
  /**
   * <code>.aruna.api.storage.models.v2.Dataset dataset = 1 [json_name = "dataset"];</code>
   */
  com.aruna.api.storage.models.v2.DatasetOrBuilder getDatasetOrBuilder();
}
