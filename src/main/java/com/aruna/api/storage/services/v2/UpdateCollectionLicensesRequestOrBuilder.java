// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/collection_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.services.v2;

public interface UpdateCollectionLicensesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.UpdateCollectionLicensesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string collection_id = 1 [json_name = "collectionId"];</code>
   * @return The collectionId.
   */
  java.lang.String getCollectionId();
  /**
   * <code>string collection_id = 1 [json_name = "collectionId"];</code>
   * @return The bytes for collectionId.
   */
  com.google.protobuf.ByteString
      getCollectionIdBytes();

  /**
   * <code>string metadata_license_tag = 2 [json_name = "metadataLicenseTag"];</code>
   * @return The metadataLicenseTag.
   */
  java.lang.String getMetadataLicenseTag();
  /**
   * <code>string metadata_license_tag = 2 [json_name = "metadataLicenseTag"];</code>
   * @return The bytes for metadataLicenseTag.
   */
  com.google.protobuf.ByteString
      getMetadataLicenseTagBytes();

  /**
   * <code>string default_data_license_tag = 3 [json_name = "defaultDataLicenseTag"];</code>
   * @return The defaultDataLicenseTag.
   */
  java.lang.String getDefaultDataLicenseTag();
  /**
   * <code>string default_data_license_tag = 3 [json_name = "defaultDataLicenseTag"];</code>
   * @return The bytes for defaultDataLicenseTag.
   */
  com.google.protobuf.ByteString
      getDefaultDataLicenseTagBytes();
}
