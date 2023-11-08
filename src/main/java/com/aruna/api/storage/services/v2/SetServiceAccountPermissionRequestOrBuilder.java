// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/service_account_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.services.v2;

public interface SetServiceAccountPermissionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.SetServiceAccountPermissionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string svc_account_id = 1 [json_name = "svcAccountId"];</code>
   * @return The svcAccountId.
   */
  java.lang.String getSvcAccountId();
  /**
   * <code>string svc_account_id = 1 [json_name = "svcAccountId"];</code>
   * @return The bytes for svcAccountId.
   */
  com.google.protobuf.ByteString
      getSvcAccountIdBytes();

  /**
   * <code>.aruna.api.storage.models.v2.Permission permission = 2 [json_name = "permission"];</code>
   * @return Whether the permission field is set.
   */
  boolean hasPermission();
  /**
   * <code>.aruna.api.storage.models.v2.Permission permission = 2 [json_name = "permission"];</code>
   * @return The permission.
   */
  com.aruna.api.storage.models.v2.Permission getPermission();
  /**
   * <code>.aruna.api.storage.models.v2.Permission permission = 2 [json_name = "permission"];</code>
   */
  com.aruna.api.storage.models.v2.PermissionOrBuilder getPermissionOrBuilder();
}