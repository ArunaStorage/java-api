// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/collection_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface SnapshotCollectionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.SnapshotCollectionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This collection will be returned via an Persistent Identifier! Updates will be impossible
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Collection collection = 1 [json_name = "collection"];</code>
   * @return Whether the collection field is set.
   */
  boolean hasCollection();
  /**
   * <pre>
   * This collection will be returned via an Persistent Identifier! Updates will be impossible
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Collection collection = 1 [json_name = "collection"];</code>
   * @return The collection.
   */
  com.aruna.api.storage.models.v2.Collection getCollection();
  /**
   * <pre>
   * This collection will be returned via an Persistent Identifier! Updates will be impossible
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Collection collection = 1 [json_name = "collection"];</code>
   */
  com.aruna.api.storage.models.v2.CollectionOrBuilder getCollectionOrBuilder();
}
