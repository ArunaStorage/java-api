// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/dataproxy/services/v2/bundler_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.dataproxy.services.v2;

public interface CreateBundleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.dataproxy.services.v2.CreateBundleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string resource_ids = 1 [json_name = "resourceIds"];</code>
   * @return A list containing the resourceIds.
   */
  java.util.List<java.lang.String>
      getResourceIdsList();
  /**
   * <code>repeated string resource_ids = 1 [json_name = "resourceIds"];</code>
   * @return The count of resourceIds.
   */
  int getResourceIdsCount();
  /**
   * <code>repeated string resource_ids = 1 [json_name = "resourceIds"];</code>
   * @param index The index of the element to return.
   * @return The resourceIds at the given index.
   */
  java.lang.String getResourceIds(int index);
  /**
   * <code>repeated string resource_ids = 1 [json_name = "resourceIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the resourceIds at the given index.
   */
  com.google.protobuf.ByteString
      getResourceIdsBytes(int index);

  /**
   * <pre>
   * .tar.gz / .zip
   * </pre>
   *
   * <code>string filename = 2 [json_name = "filename"];</code>
   * @return The filename.
   */
  java.lang.String getFilename();
  /**
   * <pre>
   * .tar.gz / .zip
   * </pre>
   *
   * <code>string filename = 2 [json_name = "filename"];</code>
   * @return The bytes for filename.
   */
  com.google.protobuf.ByteString
      getFilenameBytes();

  /**
   * <pre>
   * Default 1 Month
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expires_at = 3 [json_name = "expiresAt"];</code>
   * @return Whether the expiresAt field is set.
   */
  boolean hasExpiresAt();
  /**
   * <pre>
   * Default 1 Month
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expires_at = 3 [json_name = "expiresAt"];</code>
   * @return The expiresAt.
   */
  com.google.protobuf.Timestamp getExpiresAt();
  /**
   * <pre>
   * Default 1 Month
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expires_at = 3 [json_name = "expiresAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpiresAtOrBuilder();

  /**
   * <pre>
   * Default false (expires after first download)
   * </pre>
   *
   * <code>bool once = 4 [json_name = "once"];</code>
   * @return The once.
   */
  boolean getOnce();
}
