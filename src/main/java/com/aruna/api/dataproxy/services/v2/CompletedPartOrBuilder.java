// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/dataproxy/services/v2/dataproxy_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.dataproxy.services.v2;

public interface CompletedPartOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.dataproxy.services.v2.CompletedPart)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 part_number = 1 [json_name = "partNumber"];</code>
   * @return The partNumber.
   */
  int getPartNumber();

  /**
   * <code>string etag = 2 [json_name = "etag"];</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <code>string etag = 2 [json_name = "etag"];</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();
}
