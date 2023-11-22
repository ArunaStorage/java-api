// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/object_service.proto

// Protobuf Java Version: 3.25.1
package com.aruna.api.storage.services.v2;

public interface GetObjectEndpointsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.GetObjectEndpointsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Collection id
   * </pre>
   *
   * <code>string collection_id = 1 [json_name = "collectionId"];</code>
   * @return The collectionId.
   */
  java.lang.String getCollectionId();
  /**
   * <pre>
   * Collection id
   * </pre>
   *
   * <code>string collection_id = 1 [json_name = "collectionId"];</code>
   * @return The bytes for collectionId.
   */
  com.google.protobuf.ByteString
      getCollectionIdBytes();

  /**
   * <pre>
   * Object id
   * </pre>
   *
   * <code>string object_id = 2 [json_name = "objectId"];</code>
   * @return The objectId.
   */
  java.lang.String getObjectId();
  /**
   * <pre>
   * Object id
   * </pre>
   *
   * <code>string object_id = 2 [json_name = "objectId"];</code>
   * @return The bytes for objectId.
   */
  com.google.protobuf.ByteString
      getObjectIdBytes();
}
