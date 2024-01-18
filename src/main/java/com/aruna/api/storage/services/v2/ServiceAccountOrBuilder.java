// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/service_account_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.storage.services.v2;

public interface ServiceAccountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.ServiceAccount)
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
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.aruna.api.storage.models.v2.Permission permission = 3 [json_name = "permission"];</code>
   * @return Whether the permission field is set.
   */
  boolean hasPermission();
  /**
   * <code>.aruna.api.storage.models.v2.Permission permission = 3 [json_name = "permission"];</code>
   * @return The permission.
   */
  com.aruna.api.storage.models.v2.Permission getPermission();
  /**
   * <code>.aruna.api.storage.models.v2.Permission permission = 3 [json_name = "permission"];</code>
   */
  com.aruna.api.storage.models.v2.PermissionOrBuilder getPermissionOrBuilder();
}
