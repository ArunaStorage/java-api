// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/dataset_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface CreateDatasetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.CreateDatasetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * dataset name
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * dataset name
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string title = 10 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 10 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * Description
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * dataset specific labels / hooks
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue key_values = 3 [json_name = "keyValues"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.KeyValue> 
      getKeyValuesList();
  /**
   * <pre>
   * dataset specific labels / hooks
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue key_values = 3 [json_name = "keyValues"];</code>
   */
  com.aruna.api.storage.models.v2.KeyValue getKeyValues(int index);
  /**
   * <pre>
   * dataset specific labels / hooks
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue key_values = 3 [json_name = "keyValues"];</code>
   */
  int getKeyValuesCount();
  /**
   * <pre>
   * dataset specific labels / hooks
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue key_values = 3 [json_name = "keyValues"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.KeyValueOrBuilder> 
      getKeyValuesOrBuilderList();
  /**
   * <pre>
   * dataset specific labels / hooks
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue key_values = 3 [json_name = "keyValues"];</code>
   */
  com.aruna.api.storage.models.v2.KeyValueOrBuilder getKeyValuesOrBuilder(
      int index);

  /**
   * <pre>
   * Internal / External relations (URLs / IDs from external sources)
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Relation relations = 4 [json_name = "relations"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.Relation> 
      getRelationsList();
  /**
   * <pre>
   * Internal / External relations (URLs / IDs from external sources)
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Relation relations = 4 [json_name = "relations"];</code>
   */
  com.aruna.api.storage.models.v2.Relation getRelations(int index);
  /**
   * <pre>
   * Internal / External relations (URLs / IDs from external sources)
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Relation relations = 4 [json_name = "relations"];</code>
   */
  int getRelationsCount();
  /**
   * <pre>
   * Internal / External relations (URLs / IDs from external sources)
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Relation relations = 4 [json_name = "relations"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.RelationOrBuilder> 
      getRelationsOrBuilderList();
  /**
   * <pre>
   * Internal / External relations (URLs / IDs from external sources)
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Relation relations = 4 [json_name = "relations"];</code>
   */
  com.aruna.api.storage.models.v2.RelationOrBuilder getRelationsOrBuilder(
      int index);

  /**
   * <pre>
   * DataClass
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.DataClass data_class = 5 [json_name = "dataClass"];</code>
   * @return The enum numeric value on the wire for dataClass.
   */
  int getDataClassValue();
  /**
   * <pre>
   * DataClass
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.DataClass data_class = 5 [json_name = "dataClass"];</code>
   * @return The dataClass.
   */
  com.aruna.api.storage.models.v2.DataClass getDataClass();

  /**
   * <code>string project_id = 6 [json_name = "projectId"];</code>
   * @return Whether the projectId field is set.
   */
  boolean hasProjectId();
  /**
   * <code>string project_id = 6 [json_name = "projectId"];</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <code>string project_id = 6 [json_name = "projectId"];</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <code>string collection_id = 7 [json_name = "collectionId"];</code>
   * @return Whether the collectionId field is set.
   */
  boolean hasCollectionId();
  /**
   * <code>string collection_id = 7 [json_name = "collectionId"];</code>
   * @return The collectionId.
   */
  java.lang.String getCollectionId();
  /**
   * <code>string collection_id = 7 [json_name = "collectionId"];</code>
   * @return The bytes for collectionId.
   */
  com.google.protobuf.ByteString
      getCollectionIdBytes();

  /**
   * <code>optional string metadata_license_tag = 8 [json_name = "metadataLicenseTag"];</code>
   * @return Whether the metadataLicenseTag field is set.
   */
  boolean hasMetadataLicenseTag();
  /**
   * <code>optional string metadata_license_tag = 8 [json_name = "metadataLicenseTag"];</code>
   * @return The metadataLicenseTag.
   */
  java.lang.String getMetadataLicenseTag();
  /**
   * <code>optional string metadata_license_tag = 8 [json_name = "metadataLicenseTag"];</code>
   * @return The bytes for metadataLicenseTag.
   */
  com.google.protobuf.ByteString
      getMetadataLicenseTagBytes();

  /**
   * <code>optional string default_data_license_tag = 9 [json_name = "defaultDataLicenseTag"];</code>
   * @return Whether the defaultDataLicenseTag field is set.
   */
  boolean hasDefaultDataLicenseTag();
  /**
   * <code>optional string default_data_license_tag = 9 [json_name = "defaultDataLicenseTag"];</code>
   * @return The defaultDataLicenseTag.
   */
  java.lang.String getDefaultDataLicenseTag();
  /**
   * <code>optional string default_data_license_tag = 9 [json_name = "defaultDataLicenseTag"];</code>
   * @return The bytes for defaultDataLicenseTag.
   */
  com.google.protobuf.ByteString
      getDefaultDataLicenseTagBytes();

  /**
   * <code>repeated .aruna.api.storage.models.v2.Author authors = 11 [json_name = "authors"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.Author> 
      getAuthorsList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Author authors = 11 [json_name = "authors"];</code>
   */
  com.aruna.api.storage.models.v2.Author getAuthors(int index);
  /**
   * <code>repeated .aruna.api.storage.models.v2.Author authors = 11 [json_name = "authors"];</code>
   */
  int getAuthorsCount();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Author authors = 11 [json_name = "authors"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.AuthorOrBuilder> 
      getAuthorsOrBuilderList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Author authors = 11 [json_name = "authors"];</code>
   */
  com.aruna.api.storage.models.v2.AuthorOrBuilder getAuthorsOrBuilder(
      int index);

  com.aruna.api.storage.services.v2.CreateDatasetRequest.ParentCase getParentCase();
}
