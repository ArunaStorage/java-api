// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/relations_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.services.v2;

public interface GetHierarchyResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.GetHierarchyResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aruna.api.storage.services.v2.ProjectRelations project = 1 [json_name = "project"];</code>
   * @return Whether the project field is set.
   */
  boolean hasProject();
  /**
   * <code>.aruna.api.storage.services.v2.ProjectRelations project = 1 [json_name = "project"];</code>
   * @return The project.
   */
  com.aruna.api.storage.services.v2.ProjectRelations getProject();
  /**
   * <code>.aruna.api.storage.services.v2.ProjectRelations project = 1 [json_name = "project"];</code>
   */
  com.aruna.api.storage.services.v2.ProjectRelationsOrBuilder getProjectOrBuilder();

  /**
   * <code>.aruna.api.storage.services.v2.CollectionRelations collection = 2 [json_name = "collection"];</code>
   * @return Whether the collection field is set.
   */
  boolean hasCollection();
  /**
   * <code>.aruna.api.storage.services.v2.CollectionRelations collection = 2 [json_name = "collection"];</code>
   * @return The collection.
   */
  com.aruna.api.storage.services.v2.CollectionRelations getCollection();
  /**
   * <code>.aruna.api.storage.services.v2.CollectionRelations collection = 2 [json_name = "collection"];</code>
   */
  com.aruna.api.storage.services.v2.CollectionRelationsOrBuilder getCollectionOrBuilder();

  /**
   * <code>.aruna.api.storage.services.v2.DatasetRelations dataset = 3 [json_name = "dataset"];</code>
   * @return Whether the dataset field is set.
   */
  boolean hasDataset();
  /**
   * <code>.aruna.api.storage.services.v2.DatasetRelations dataset = 3 [json_name = "dataset"];</code>
   * @return The dataset.
   */
  com.aruna.api.storage.services.v2.DatasetRelations getDataset();
  /**
   * <code>.aruna.api.storage.services.v2.DatasetRelations dataset = 3 [json_name = "dataset"];</code>
   */
  com.aruna.api.storage.services.v2.DatasetRelationsOrBuilder getDatasetOrBuilder();

  com.aruna.api.storage.services.v2.GetHierarchyResponse.GraphCase getGraphCase();
}