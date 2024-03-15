// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/authorization_service.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.storage.services.v2;

public interface CreateAuthorizationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.CreateAuthorizationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string resource_id = 1 [json_name = "resourceId"];</code>
   * @return The resourceId.
   */
  java.lang.String getResourceId();
  /**
   * <code>string resource_id = 1 [json_name = "resourceId"];</code>
   * @return The bytes for resourceId.
   */
  com.google.protobuf.ByteString
      getResourceIdBytes();

  /**
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * Can also include "deny"
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.PermissionLevel permission_level = 3 [json_name = "permissionLevel"];</code>
   * @return The enum numeric value on the wire for permissionLevel.
   */
  int getPermissionLevelValue();
  /**
   * <pre>
   * Can also include "deny"
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.PermissionLevel permission_level = 3 [json_name = "permissionLevel"];</code>
   * @return The permissionLevel.
   */
  com.aruna.api.storage.models.v2.PermissionLevel getPermissionLevel();
}
