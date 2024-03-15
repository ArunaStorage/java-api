// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/relations_service.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.storage.services.v2;

public interface CollectionRelationsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.CollectionRelations)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string origin = 1 [json_name = "origin"];</code>
   * @return The origin.
   */
  java.lang.String getOrigin();
  /**
   * <code>string origin = 1 [json_name = "origin"];</code>
   * @return The bytes for origin.
   */
  com.google.protobuf.ByteString
      getOriginBytes();

  /**
   * <code>repeated .aruna.api.storage.services.v2.DatasetRelations dataset_children = 2 [json_name = "datasetChildren"];</code>
   */
  java.util.List<com.aruna.api.storage.services.v2.DatasetRelations> 
      getDatasetChildrenList();
  /**
   * <code>repeated .aruna.api.storage.services.v2.DatasetRelations dataset_children = 2 [json_name = "datasetChildren"];</code>
   */
  com.aruna.api.storage.services.v2.DatasetRelations getDatasetChildren(int index);
  /**
   * <code>repeated .aruna.api.storage.services.v2.DatasetRelations dataset_children = 2 [json_name = "datasetChildren"];</code>
   */
  int getDatasetChildrenCount();
  /**
   * <code>repeated .aruna.api.storage.services.v2.DatasetRelations dataset_children = 2 [json_name = "datasetChildren"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.services.v2.DatasetRelationsOrBuilder> 
      getDatasetChildrenOrBuilderList();
  /**
   * <code>repeated .aruna.api.storage.services.v2.DatasetRelations dataset_children = 2 [json_name = "datasetChildren"];</code>
   */
  com.aruna.api.storage.services.v2.DatasetRelationsOrBuilder getDatasetChildrenOrBuilder(
      int index);

  /**
   * <code>repeated string object_children = 3 [json_name = "objectChildren"];</code>
   * @return A list containing the objectChildren.
   */
  java.util.List<java.lang.String>
      getObjectChildrenList();
  /**
   * <code>repeated string object_children = 3 [json_name = "objectChildren"];</code>
   * @return The count of objectChildren.
   */
  int getObjectChildrenCount();
  /**
   * <code>repeated string object_children = 3 [json_name = "objectChildren"];</code>
   * @param index The index of the element to return.
   * @return The objectChildren at the given index.
   */
  java.lang.String getObjectChildren(int index);
  /**
   * <code>repeated string object_children = 3 [json_name = "objectChildren"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the objectChildren at the given index.
   */
  com.google.protobuf.ByteString
      getObjectChildrenBytes(int index);
}
