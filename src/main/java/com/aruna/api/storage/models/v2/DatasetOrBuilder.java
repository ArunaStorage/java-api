// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.models.v2;

public interface DatasetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.models.v2.Dataset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Dataset specific labels / hooks
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue key_values = 4 [json_name = "keyValues"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.KeyValue> 
      getKeyValuesList();
  /**
   * <pre>
   * Dataset specific labels / hooks
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue key_values = 4 [json_name = "keyValues"];</code>
   */
  com.aruna.api.storage.models.v2.KeyValue getKeyValues(int index);
  /**
   * <pre>
   * Dataset specific labels / hooks
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue key_values = 4 [json_name = "keyValues"];</code>
   */
  int getKeyValuesCount();
  /**
   * <pre>
   * Dataset specific labels / hooks
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue key_values = 4 [json_name = "keyValues"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.KeyValueOrBuilder> 
      getKeyValuesOrBuilderList();
  /**
   * <pre>
   * Dataset specific labels / hooks
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue key_values = 4 [json_name = "keyValues"];</code>
   */
  com.aruna.api.storage.models.v2.KeyValueOrBuilder getKeyValuesOrBuilder(
      int index);

  /**
   * <pre>
   * Relations to internal and external sources
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Relation relations = 5 [json_name = "relations"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.Relation> 
      getRelationsList();
  /**
   * <pre>
   * Relations to internal and external sources
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Relation relations = 5 [json_name = "relations"];</code>
   */
  com.aruna.api.storage.models.v2.Relation getRelations(int index);
  /**
   * <pre>
   * Relations to internal and external sources
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Relation relations = 5 [json_name = "relations"];</code>
   */
  int getRelationsCount();
  /**
   * <pre>
   * Relations to internal and external sources
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Relation relations = 5 [json_name = "relations"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.RelationOrBuilder> 
      getRelationsOrBuilderList();
  /**
   * <pre>
   * Relations to internal and external sources
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Relation relations = 5 [json_name = "relations"];</code>
   */
  com.aruna.api.storage.models.v2.RelationOrBuilder getRelationsOrBuilder(
      int index);

  /**
   * <code>.aruna.api.storage.models.v2.Stats stats = 6 [json_name = "stats"];</code>
   * @return Whether the stats field is set.
   */
  boolean hasStats();
  /**
   * <code>.aruna.api.storage.models.v2.Stats stats = 6 [json_name = "stats"];</code>
   * @return The stats.
   */
  com.aruna.api.storage.models.v2.Stats getStats();
  /**
   * <code>.aruna.api.storage.models.v2.Stats stats = 6 [json_name = "stats"];</code>
   */
  com.aruna.api.storage.models.v2.StatsOrBuilder getStatsOrBuilder();

  /**
   * <code>.aruna.api.storage.models.v2.DataClass data_class = 7 [json_name = "dataClass"];</code>
   * @return The enum numeric value on the wire for dataClass.
   */
  int getDataClassValue();
  /**
   * <code>.aruna.api.storage.models.v2.DataClass data_class = 7 [json_name = "dataClass"];</code>
   * @return The dataClass.
   */
  com.aruna.api.storage.models.v2.DataClass getDataClass();

  /**
   * <code>.google.protobuf.Timestamp created_at = 8 [json_name = "createdAt"];</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 8 [json_name = "createdAt"];</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 8 [json_name = "createdAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>string created_by = 9 [json_name = "createdBy"];</code>
   * @return The createdBy.
   */
  java.lang.String getCreatedBy();
  /**
   * <code>string created_by = 9 [json_name = "createdBy"];</code>
   * @return The bytes for createdBy.
   */
  com.google.protobuf.ByteString
      getCreatedByBytes();

  /**
   * <code>.aruna.api.storage.models.v2.Status status = 10 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.aruna.api.storage.models.v2.Status status = 10 [json_name = "status"];</code>
   * @return The status.
   */
  com.aruna.api.storage.models.v2.Status getStatus();

  /**
   * <code>bool dynamic = 11 [json_name = "dynamic"];</code>
   * @return The dynamic.
   */
  boolean getDynamic();

  /**
   * <code>repeated .aruna.api.storage.models.v2.DataEndpoint endpoints = 12 [json_name = "endpoints"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.DataEndpoint> 
      getEndpointsList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.DataEndpoint endpoints = 12 [json_name = "endpoints"];</code>
   */
  com.aruna.api.storage.models.v2.DataEndpoint getEndpoints(int index);
  /**
   * <code>repeated .aruna.api.storage.models.v2.DataEndpoint endpoints = 12 [json_name = "endpoints"];</code>
   */
  int getEndpointsCount();
  /**
   * <code>repeated .aruna.api.storage.models.v2.DataEndpoint endpoints = 12 [json_name = "endpoints"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.DataEndpointOrBuilder> 
      getEndpointsOrBuilderList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.DataEndpoint endpoints = 12 [json_name = "endpoints"];</code>
   */
  com.aruna.api.storage.models.v2.DataEndpointOrBuilder getEndpointsOrBuilder(
      int index);

  /**
   * <code>string metadata_license_tag = 13 [json_name = "metadataLicenseTag"];</code>
   * @return The metadataLicenseTag.
   */
  java.lang.String getMetadataLicenseTag();
  /**
   * <code>string metadata_license_tag = 13 [json_name = "metadataLicenseTag"];</code>
   * @return The bytes for metadataLicenseTag.
   */
  com.google.protobuf.ByteString
      getMetadataLicenseTagBytes();

  /**
   * <code>string default_data_license_tag = 14 [json_name = "defaultDataLicenseTag"];</code>
   * @return The defaultDataLicenseTag.
   */
  java.lang.String getDefaultDataLicenseTag();
  /**
   * <code>string default_data_license_tag = 14 [json_name = "defaultDataLicenseTag"];</code>
   * @return The bytes for defaultDataLicenseTag.
   */
  com.google.protobuf.ByteString
      getDefaultDataLicenseTagBytes();
}
