// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/dataset_service.proto

// Protobuf Java Version: 3.25.1
package com.aruna.api.storage.services.v2;

public interface GetDatasetsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.GetDatasetsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of dataset overviews
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.Dataset> 
      getDatasetsList();
  /**
   * <pre>
   * List of dataset overviews
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
   */
  com.aruna.api.storage.models.v2.Dataset getDatasets(int index);
  /**
   * <pre>
   * List of dataset overviews
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
   */
  int getDatasetsCount();
  /**
   * <pre>
   * List of dataset overviews
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.DatasetOrBuilder> 
      getDatasetsOrBuilderList();
  /**
   * <pre>
   * List of dataset overviews
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Dataset datasets = 1 [json_name = "datasets"];</code>
   */
  com.aruna.api.storage.models.v2.DatasetOrBuilder getDatasetsOrBuilder(
      int index);
}
