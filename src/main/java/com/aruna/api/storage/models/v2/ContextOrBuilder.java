// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.models.v2;

public interface ContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.models.v2.Context)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool s3_credentials = 1 [json_name = "s3Credentials"];</code>
   * @return Whether the s3Credentials field is set.
   */
  boolean hasS3Credentials();
  /**
   * <code>bool s3_credentials = 1 [json_name = "s3Credentials"];</code>
   * @return The s3Credentials.
   */
  boolean getS3Credentials();

  /**
   * <code>.aruna.api.storage.models.v2.Copy copy = 2 [json_name = "copy"];</code>
   * @return Whether the copy field is set.
   */
  boolean hasCopy();
  /**
   * <code>.aruna.api.storage.models.v2.Copy copy = 2 [json_name = "copy"];</code>
   * @return The copy.
   */
  com.aruna.api.storage.models.v2.Copy getCopy();
  /**
   * <code>.aruna.api.storage.models.v2.Copy copy = 2 [json_name = "copy"];</code>
   */
  com.aruna.api.storage.models.v2.CopyOrBuilder getCopyOrBuilder();

  com.aruna.api.storage.models.v2.Context.ContextCase getContextCase();
}
