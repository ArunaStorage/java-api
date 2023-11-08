// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/service_account_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.services.v2;

public interface CreateServiceAccountTokenRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.CreateServiceAccountTokenRequest)
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
   * <pre>
   * Identify the associated project (should always be provided)
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Permission permission = 2 [json_name = "permission"];</code>
   * @return Whether the permission field is set.
   */
  boolean hasPermission();
  /**
   * <pre>
   * Identify the associated project (should always be provided)
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Permission permission = 2 [json_name = "permission"];</code>
   * @return The permission.
   */
  com.aruna.api.storage.models.v2.Permission getPermission();
  /**
   * <pre>
   * Identify the associated project (should always be provided)
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Permission permission = 2 [json_name = "permission"];</code>
   */
  com.aruna.api.storage.models.v2.PermissionOrBuilder getPermissionOrBuilder();

  /**
   * <pre>
   * (optional) Token name
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * (optional) Token name
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * (optional) Token expiry 
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expires_at = 4 [json_name = "expiresAt"];</code>
   * @return Whether the expiresAt field is set.
   */
  boolean hasExpiresAt();
  /**
   * <pre>
   * (optional) Token expiry 
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expires_at = 4 [json_name = "expiresAt"];</code>
   * @return The expiresAt.
   */
  com.google.protobuf.Timestamp getExpiresAt();
  /**
   * <pre>
   * (optional) Token expiry 
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expires_at = 4 [json_name = "expiresAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpiresAtOrBuilder();
}