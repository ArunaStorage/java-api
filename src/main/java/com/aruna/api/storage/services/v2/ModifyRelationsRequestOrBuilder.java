// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/relations_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface ModifyRelationsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.ModifyRelationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string resource_id = 1 [json_name = "resourceId"];</code>
   * @return The resourceId.
   */
  java.lang.String getResourceId();
  /**
   * <code>string resource_id = 1 [json_name = "resourceId"];</code>
   * @return The bytes for resourceId.
   */
  com.google.protobuf.ByteString
      getResourceIdBytes();

  /**
   * <code>repeated .aruna.api.storage.models.v2.Relation add_relations = 2 [json_name = "addRelations"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.Relation> 
      getAddRelationsList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Relation add_relations = 2 [json_name = "addRelations"];</code>
   */
  com.aruna.api.storage.models.v2.Relation getAddRelations(int index);
  /**
   * <code>repeated .aruna.api.storage.models.v2.Relation add_relations = 2 [json_name = "addRelations"];</code>
   */
  int getAddRelationsCount();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Relation add_relations = 2 [json_name = "addRelations"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.RelationOrBuilder> 
      getAddRelationsOrBuilderList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Relation add_relations = 2 [json_name = "addRelations"];</code>
   */
  com.aruna.api.storage.models.v2.RelationOrBuilder getAddRelationsOrBuilder(
      int index);

  /**
   * <code>repeated .aruna.api.storage.models.v2.Relation remove_relations = 3 [json_name = "removeRelations"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.Relation> 
      getRemoveRelationsList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Relation remove_relations = 3 [json_name = "removeRelations"];</code>
   */
  com.aruna.api.storage.models.v2.Relation getRemoveRelations(int index);
  /**
   * <code>repeated .aruna.api.storage.models.v2.Relation remove_relations = 3 [json_name = "removeRelations"];</code>
   */
  int getRemoveRelationsCount();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Relation remove_relations = 3 [json_name = "removeRelations"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.RelationOrBuilder> 
      getRemoveRelationsOrBuilderList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Relation remove_relations = 3 [json_name = "removeRelations"];</code>
   */
  com.aruna.api.storage.models.v2.RelationOrBuilder getRemoveRelationsOrBuilder(
      int index);
}
