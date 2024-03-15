// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/object_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface UpdateObjectRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.UpdateObjectRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Existing object ID
   * </pre>
   *
   * <code>string object_id = 1 [json_name = "objectId"];</code>
   * @return The objectId.
   */
  java.lang.String getObjectId();
  /**
   * <pre>
   * Existing object ID
   * </pre>
   *
   * <code>string object_id = 1 [json_name = "objectId"];</code>
   * @return The bytes for objectId.
   */
  com.google.protobuf.ByteString
      getObjectIdBytes();

  /**
   * <pre>
   * object name
   * </pre>
   *
   * <code>optional string name = 2 [json_name = "name"];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * object name
   * </pre>
   *
   * <code>optional string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * object name
   * </pre>
   *
   * <code>optional string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * object description
   * </pre>
   *
   * <code>optional string description = 3 [json_name = "description"];</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * object description
   * </pre>
   *
   * <code>optional string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * object description
   * </pre>
   *
   * <code>optional string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * key_values to add
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue add_key_values = 4 [json_name = "addKeyValues"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.KeyValue> 
      getAddKeyValuesList();
  /**
   * <pre>
   * key_values to add
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue add_key_values = 4 [json_name = "addKeyValues"];</code>
   */
  com.aruna.api.storage.models.v2.KeyValue getAddKeyValues(int index);
  /**
   * <pre>
   * key_values to add
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue add_key_values = 4 [json_name = "addKeyValues"];</code>
   */
  int getAddKeyValuesCount();
  /**
   * <pre>
   * key_values to add
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue add_key_values = 4 [json_name = "addKeyValues"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.KeyValueOrBuilder> 
      getAddKeyValuesOrBuilderList();
  /**
   * <pre>
   * key_values to add
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue add_key_values = 4 [json_name = "addKeyValues"];</code>
   */
  com.aruna.api.storage.models.v2.KeyValueOrBuilder getAddKeyValuesOrBuilder(
      int index);

  /**
   * <pre>
   * key_values to remove
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue remove_key_values = 5 [json_name = "removeKeyValues"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.KeyValue> 
      getRemoveKeyValuesList();
  /**
   * <pre>
   * key_values to remove
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue remove_key_values = 5 [json_name = "removeKeyValues"];</code>
   */
  com.aruna.api.storage.models.v2.KeyValue getRemoveKeyValues(int index);
  /**
   * <pre>
   * key_values to remove
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue remove_key_values = 5 [json_name = "removeKeyValues"];</code>
   */
  int getRemoveKeyValuesCount();
  /**
   * <pre>
   * key_values to remove
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue remove_key_values = 5 [json_name = "removeKeyValues"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.KeyValueOrBuilder> 
      getRemoveKeyValuesOrBuilderList();
  /**
   * <pre>
   * key_values to remove
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.KeyValue remove_key_values = 5 [json_name = "removeKeyValues"];</code>
   */
  com.aruna.api.storage.models.v2.KeyValueOrBuilder getRemoveKeyValuesOrBuilder(
      int index);

  /**
   * <pre>
   * New DataClass
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.DataClass data_class = 7 [json_name = "dataClass"];</code>
   * @return The enum numeric value on the wire for dataClass.
   */
  int getDataClassValue();
  /**
   * <pre>
   * New DataClass
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.DataClass data_class = 7 [json_name = "dataClass"];</code>
   * @return The dataClass.
   */
  com.aruna.api.storage.models.v2.DataClass getDataClass();

  /**
   * <code>string project_id = 8 [json_name = "projectId"];</code>
   * @return Whether the projectId field is set.
   */
  boolean hasProjectId();
  /**
   * <code>string project_id = 8 [json_name = "projectId"];</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <code>string project_id = 8 [json_name = "projectId"];</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <code>string collection_id = 9 [json_name = "collectionId"];</code>
   * @return Whether the collectionId field is set.
   */
  boolean hasCollectionId();
  /**
   * <code>string collection_id = 9 [json_name = "collectionId"];</code>
   * @return The collectionId.
   */
  java.lang.String getCollectionId();
  /**
   * <code>string collection_id = 9 [json_name = "collectionId"];</code>
   * @return The bytes for collectionId.
   */
  com.google.protobuf.ByteString
      getCollectionIdBytes();

  /**
   * <code>string dataset_id = 10 [json_name = "datasetId"];</code>
   * @return Whether the datasetId field is set.
   */
  boolean hasDatasetId();
  /**
   * <code>string dataset_id = 10 [json_name = "datasetId"];</code>
   * @return The datasetId.
   */
  java.lang.String getDatasetId();
  /**
   * <code>string dataset_id = 10 [json_name = "datasetId"];</code>
   * @return The bytes for datasetId.
   */
  com.google.protobuf.ByteString
      getDatasetIdBytes();

  /**
   * <code>repeated .aruna.api.storage.models.v2.Hash hashes = 12 [json_name = "hashes"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.Hash> 
      getHashesList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Hash hashes = 12 [json_name = "hashes"];</code>
   */
  com.aruna.api.storage.models.v2.Hash getHashes(int index);
  /**
   * <code>repeated .aruna.api.storage.models.v2.Hash hashes = 12 [json_name = "hashes"];</code>
   */
  int getHashesCount();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Hash hashes = 12 [json_name = "hashes"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.HashOrBuilder> 
      getHashesOrBuilderList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Hash hashes = 12 [json_name = "hashes"];</code>
   */
  com.aruna.api.storage.models.v2.HashOrBuilder getHashesOrBuilder(
      int index);

  /**
   * <pre>
   * Force new object revision
   * </pre>
   *
   * <code>bool force_revision = 13 [json_name = "forceRevision"];</code>
   * @return The forceRevision.
   */
  boolean getForceRevision();

  /**
   * <code>optional string metadata_license_tag = 14 [json_name = "metadataLicenseTag"];</code>
   * @return Whether the metadataLicenseTag field is set.
   */
  boolean hasMetadataLicenseTag();
  /**
   * <code>optional string metadata_license_tag = 14 [json_name = "metadataLicenseTag"];</code>
   * @return The metadataLicenseTag.
   */
  java.lang.String getMetadataLicenseTag();
  /**
   * <code>optional string metadata_license_tag = 14 [json_name = "metadataLicenseTag"];</code>
   * @return The bytes for metadataLicenseTag.
   */
  com.google.protobuf.ByteString
      getMetadataLicenseTagBytes();

  /**
   * <code>optional string data_license_tag = 15 [json_name = "dataLicenseTag"];</code>
   * @return Whether the dataLicenseTag field is set.
   */
  boolean hasDataLicenseTag();
  /**
   * <code>optional string data_license_tag = 15 [json_name = "dataLicenseTag"];</code>
   * @return The dataLicenseTag.
   */
  java.lang.String getDataLicenseTag();
  /**
   * <code>optional string data_license_tag = 15 [json_name = "dataLicenseTag"];</code>
   * @return The bytes for dataLicenseTag.
   */
  com.google.protobuf.ByteString
      getDataLicenseTagBytes();

  com.aruna.api.storage.services.v2.UpdateObjectRequest.ParentCase getParentCase();
}
