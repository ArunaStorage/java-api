// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/authorization_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface UpdateAuthorizationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.UpdateAuthorizationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aruna.api.storage.services.v2.UserPermission user_permission = 1 [json_name = "userPermission"];</code>
   * @return Whether the userPermission field is set.
   */
  boolean hasUserPermission();
  /**
   * <code>.aruna.api.storage.services.v2.UserPermission user_permission = 1 [json_name = "userPermission"];</code>
   * @return The userPermission.
   */
  com.aruna.api.storage.services.v2.UserPermission getUserPermission();
  /**
   * <code>.aruna.api.storage.services.v2.UserPermission user_permission = 1 [json_name = "userPermission"];</code>
   */
  com.aruna.api.storage.services.v2.UserPermissionOrBuilder getUserPermissionOrBuilder();
}
