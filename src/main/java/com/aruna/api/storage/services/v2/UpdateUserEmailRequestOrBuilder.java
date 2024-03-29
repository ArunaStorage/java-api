// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/user_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface UpdateUserEmailRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.UpdateUserEmailRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * If new email is empty == unsubscribe
   * </pre>
   *
   * <code>string new_email = 2 [json_name = "newEmail"];</code>
   * @return The newEmail.
   */
  java.lang.String getNewEmail();
  /**
   * <pre>
   * If new email is empty == unsubscribe
   * </pre>
   *
   * <code>string new_email = 2 [json_name = "newEmail"];</code>
   * @return The bytes for newEmail.
   */
  com.google.protobuf.ByteString
      getNewEmailBytes();
}
