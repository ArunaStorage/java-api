// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/collection_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.services.v2;

public interface UpdateCollectionDataClassRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.UpdateCollectionDataClassRequest)
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
   * <code>.aruna.api.storage.models.v2.DataClass data_class = 2 [json_name = "dataClass"];</code>
   * @return The enum numeric value on the wire for dataClass.
   */
  int getDataClassValue();
  /**
   * <code>.aruna.api.storage.models.v2.DataClass data_class = 2 [json_name = "dataClass"];</code>
   * @return The dataClass.
   */
  com.aruna.api.storage.models.v2.DataClass getDataClass();
}
