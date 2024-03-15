// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/dataproxy/services/v2/dataproxy_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.dataproxy.services.v2;

public interface IngestResourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.dataproxy.services.v2.IngestResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * object name
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * object name
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * title
   * </pre>
   *
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * title
   * </pre>
   *
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * description
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * description
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Authors
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Author authors = 4 [json_name = "authors"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.Author> 
      getAuthorsList();
  /**
   * <pre>
   * Authors
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Author authors = 4 [json_name = "authors"];</code>
   */
  com.aruna.api.storage.models.v2.Author getAuthors(int index);
  /**
   * <pre>
   * Authors
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Author authors = 4 [json_name = "authors"];</code>
   */
  int getAuthorsCount();
  /**
   * <pre>
   * Authors
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Author authors = 4 [json_name = "authors"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.AuthorOrBuilder> 
      getAuthorsOrBuilderList();
  /**
   * <pre>
   * Authors
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Author authors = 4 [json_name = "authors"];</code>
   */
  com.aruna.api.storage.models.v2.AuthorOrBuilder getAuthorsOrBuilder(
      int index);

  /**
   * <pre>
   * object specific labels / hooks
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue key_values = 5 [json_name = "keyValues"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.KeyValue> 
      getKeyValuesList();
  /**
   * <pre>
   * object specific labels / hooks
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue key_values = 5 [json_name = "keyValues"];</code>
   */
  com.aruna.api.storage.models.v2.KeyValue getKeyValues(int index);
  /**
   * <pre>
   * object specific labels / hooks
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue key_values = 5 [json_name = "keyValues"];</code>
   */
  int getKeyValuesCount();
  /**
   * <pre>
   * object specific labels / hooks
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue key_values = 5 [json_name = "keyValues"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.KeyValueOrBuilder> 
      getKeyValuesOrBuilderList();
  /**
   * <pre>
   * object specific labels / hooks
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue key_values = 5 [json_name = "keyValues"];</code>
   */
  com.aruna.api.storage.models.v2.KeyValueOrBuilder getKeyValuesOrBuilder(
      int index);

  /**
   * <pre>
   * Internal / External relations (URLs / IDs from external sources)
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Relation relations = 6 [json_name = "relations"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.Relation> 
      getRelationsList();
  /**
   * <pre>
   * Internal / External relations (URLs / IDs from external sources)
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Relation relations = 6 [json_name = "relations"];</code>
   */
  com.aruna.api.storage.models.v2.Relation getRelations(int index);
  /**
   * <pre>
   * Internal / External relations (URLs / IDs from external sources)
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Relation relations = 6 [json_name = "relations"];</code>
   */
  int getRelationsCount();
  /**
   * <pre>
   * Internal / External relations (URLs / IDs from external sources)
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Relation relations = 6 [json_name = "relations"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.RelationOrBuilder> 
      getRelationsOrBuilderList();
  /**
   * <pre>
   * Internal / External relations (URLs / IDs from external sources)
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Relation relations = 6 [json_name = "relations"];</code>
   */
  com.aruna.api.storage.models.v2.RelationOrBuilder getRelationsOrBuilder(
      int index);

  /**
   * <pre>
   * DataClass
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.DataClass data_class = 7 [json_name = "dataClass"];</code>
   * @return The enum numeric value on the wire for dataClass.
   */
  int getDataClassValue();
  /**
   * <pre>
   * DataClass
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.DataClass data_class = 7 [json_name = "dataClass"];</code>
   * @return The dataClass.
   */
  com.aruna.api.storage.models.v2.DataClass getDataClass();

  /**
   * <pre>
   * Ignored if Collection | Dataset
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Hash hashes = 8 [json_name = "hashes"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.Hash> 
      getHashesList();
  /**
   * <pre>
   * Ignored if Collection | Dataset
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Hash hashes = 8 [json_name = "hashes"];</code>
   */
  com.aruna.api.storage.models.v2.Hash getHashes(int index);
  /**
   * <pre>
   * Ignored if Collection | Dataset
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Hash hashes = 8 [json_name = "hashes"];</code>
   */
  int getHashesCount();
  /**
   * <pre>
   * Ignored if Collection | Dataset
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Hash hashes = 8 [json_name = "hashes"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.HashOrBuilder> 
      getHashesOrBuilderList();
  /**
   * <pre>
   * Ignored if Collection | Dataset
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Hash hashes = 8 [json_name = "hashes"];</code>
   */
  com.aruna.api.storage.models.v2.HashOrBuilder getHashesOrBuilder(
      int index);

  /**
   * <code>string metadata_license_tag = 9 [json_name = "metadataLicenseTag"];</code>
   * @return The metadataLicenseTag.
   */
  java.lang.String getMetadataLicenseTag();
  /**
   * <code>string metadata_license_tag = 9 [json_name = "metadataLicenseTag"];</code>
   * @return The bytes for metadataLicenseTag.
   */
  com.google.protobuf.ByteString
      getMetadataLicenseTagBytes();

  /**
   * <code>string data_license_tag = 10 [json_name = "dataLicenseTag"];</code>
   * @return The dataLicenseTag.
   */
  java.lang.String getDataLicenseTag();
  /**
   * <code>string data_license_tag = 10 [json_name = "dataLicenseTag"];</code>
   * @return The bytes for dataLicenseTag.
   */
  com.google.protobuf.ByteString
      getDataLicenseTagBytes();
}
