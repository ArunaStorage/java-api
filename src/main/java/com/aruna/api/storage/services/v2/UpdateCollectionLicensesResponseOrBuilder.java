// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/collection_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface UpdateCollectionLicensesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.UpdateCollectionLicensesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aruna.api.storage.models.v2.Collection collection = 1 [json_name = "collection"];</code>
   * @return Whether the collection field is set.
   */
  boolean hasCollection();
  /**
   * <code>.aruna.api.storage.models.v2.Collection collection = 1 [json_name = "collection"];</code>
   * @return The collection.
   */
  com.aruna.api.storage.models.v2.Collection getCollection();
  /**
   * <code>.aruna.api.storage.models.v2.Collection collection = 1 [json_name = "collection"];</code>
   */
  com.aruna.api.storage.models.v2.CollectionOrBuilder getCollectionOrBuilder();
}
