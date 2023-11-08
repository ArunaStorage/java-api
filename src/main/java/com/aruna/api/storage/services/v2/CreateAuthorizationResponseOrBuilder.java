// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/authorization_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.services.v2;

public interface CreateAuthorizationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.CreateAuthorizationResponse)
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
   * <code>string user_name = 3 [json_name = "userName"];</code>
   * @return The userName.
   */
  java.lang.String getUserName();
  /**
   * <code>string user_name = 3 [json_name = "userName"];</code>
   * @return The bytes for userName.
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <code>.aruna.api.storage.models.v2.PermissionLevel permission_level = 4 [json_name = "permissionLevel"];</code>
   * @return The enum numeric value on the wire for permissionLevel.
   */
  int getPermissionLevelValue();
  /**
   * <code>.aruna.api.storage.models.v2.PermissionLevel permission_level = 4 [json_name = "permissionLevel"];</code>
   * @return The permissionLevel.
   */
  com.aruna.api.storage.models.v2.PermissionLevel getPermissionLevel();
}
