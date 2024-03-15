// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/object_service.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.storage.services.v2;

public interface GetUploadURLRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.GetUploadURLRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ObjectId
   * </pre>
   *
   * <code>string object_id = 1 [json_name = "objectId"];</code>
   * @return The objectId.
   */
  java.lang.String getObjectId();
  /**
   * <pre>
   * ObjectId
   * </pre>
   *
   * <code>string object_id = 1 [json_name = "objectId"];</code>
   * @return The bytes for objectId.
   */
  com.google.protobuf.ByteString
      getObjectIdBytes();

  /**
   * <pre>
   * Is this a multipart upload?
   * </pre>
   *
   * <code>bool multipart = 2 [json_name = "multipart"];</code>
   * @return The multipart.
   */
  boolean getMultipart();

  /**
   * <pre>
   * (optional) if multi was initialized
   * </pre>
   *
   * <code>int32 part_number = 3 [json_name = "partNumber"];</code>
   * @return The partNumber.
   */
  int getPartNumber();
}
