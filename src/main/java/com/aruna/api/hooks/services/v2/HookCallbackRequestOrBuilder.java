// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/hooks/services/v2/hooks_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.hooks.services.v2;

public interface HookCallbackRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.hooks.services.v2.HookCallbackRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aruna.api.hooks.services.v2.Finished finished = 1 [json_name = "finished"];</code>
   * @return Whether the finished field is set.
   */
  boolean hasFinished();
  /**
   * <code>.aruna.api.hooks.services.v2.Finished finished = 1 [json_name = "finished"];</code>
   * @return The finished.
   */
  com.aruna.api.hooks.services.v2.Finished getFinished();
  /**
   * <code>.aruna.api.hooks.services.v2.Finished finished = 1 [json_name = "finished"];</code>
   */
  com.aruna.api.hooks.services.v2.FinishedOrBuilder getFinishedOrBuilder();

  /**
   * <code>.aruna.api.hooks.services.v2.Error error = 2 [json_name = "error"];</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <code>.aruna.api.hooks.services.v2.Error error = 2 [json_name = "error"];</code>
   * @return The error.
   */
  com.aruna.api.hooks.services.v2.Error getError();
  /**
   * <code>.aruna.api.hooks.services.v2.Error error = 2 [json_name = "error"];</code>
   */
  com.aruna.api.hooks.services.v2.ErrorOrBuilder getErrorOrBuilder();

  /**
   * <code>string secret = 3 [json_name = "secret"];</code>
   * @return The secret.
   */
  java.lang.String getSecret();
  /**
   * <code>string secret = 3 [json_name = "secret"];</code>
   * @return The bytes for secret.
   */
  com.google.protobuf.ByteString
      getSecretBytes();

  /**
   * <code>string hook_id = 4 [json_name = "hookId"];</code>
   * @return The hookId.
   */
  java.lang.String getHookId();
  /**
   * <code>string hook_id = 4 [json_name = "hookId"];</code>
   * @return The bytes for hookId.
   */
  com.google.protobuf.ByteString
      getHookIdBytes();

  /**
   * <code>string object_id = 5 [json_name = "objectId"];</code>
   * @return The objectId.
   */
  java.lang.String getObjectId();
  /**
   * <code>string object_id = 5 [json_name = "objectId"];</code>
   * @return The bytes for objectId.
   */
  com.google.protobuf.ByteString
      getObjectIdBytes();

  /**
   * <code>int32 pubkey_serial = 6 [json_name = "pubkeySerial"];</code>
   * @return The pubkeySerial.
   */
  int getPubkeySerial();

  com.aruna.api.hooks.services.v2.HookCallbackRequest.StatusCase getStatusCase();
}
