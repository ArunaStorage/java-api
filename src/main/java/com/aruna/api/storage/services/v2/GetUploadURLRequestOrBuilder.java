// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/object_service.proto

// Protobuf Java Version: 3.25.3
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

  /**
   * <pre>
   * (optional) if part_number &gt; 1 and multipart = true
   * </pre>
   *
   * <code>string upload_id = 4 [json_name = "uploadId"];</code>
   * @return The uploadId.
   */
  java.lang.String getUploadId();
  /**
   * <pre>
   * (optional) if part_number &gt; 1 and multipart = true
   * </pre>
   *
   * <code>string upload_id = 4 [json_name = "uploadId"];</code>
   * @return The bytes for uploadId.
   */
  com.google.protobuf.ByteString
      getUploadIdBytes();
}
