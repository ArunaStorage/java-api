// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/dataproxy/services/v2/dataproxy_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.dataproxy.services.v2;

public interface DataInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.dataproxy.services.v2.DataInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string object_id = 1 [json_name = "objectId"];</code>
   * @return The objectId.
   */
  java.lang.String getObjectId();
  /**
   * <code>string object_id = 1 [json_name = "objectId"];</code>
   * @return The bytes for objectId.
   */
  com.google.protobuf.ByteString
      getObjectIdBytes();

  /**
   * <code>string download_url = 2 [json_name = "downloadUrl"];</code>
   * @return The downloadUrl.
   */
  java.lang.String getDownloadUrl();
  /**
   * <code>string download_url = 2 [json_name = "downloadUrl"];</code>
   * @return The bytes for downloadUrl.
   */
  com.google.protobuf.ByteString
      getDownloadUrlBytes();

  /**
   * <code>string encryption_key = 3 [json_name = "encryptionKey"];</code>
   * @return The encryptionKey.
   */
  java.lang.String getEncryptionKey();
  /**
   * <code>string encryption_key = 3 [json_name = "encryptionKey"];</code>
   * @return The bytes for encryptionKey.
   */
  com.google.protobuf.ByteString
      getEncryptionKeyBytes();

  /**
   * <code>bool is_compressed = 4 [json_name = "isCompressed"];</code>
   * @return The isCompressed.
   */
  boolean getIsCompressed();
}
