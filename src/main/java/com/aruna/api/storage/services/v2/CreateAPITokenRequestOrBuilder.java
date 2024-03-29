// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/user_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface CreateAPITokenRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.CreateAPITokenRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Token name
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Token name
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Personal or resource specific
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Permission permission = 2 [json_name = "permission"];</code>
   * @return Whether the permission field is set.
   */
  boolean hasPermission();
  /**
   * <pre>
   * Personal or resource specific
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Permission permission = 2 [json_name = "permission"];</code>
   * @return The permission.
   */
  com.aruna.api.storage.models.v2.Permission getPermission();
  /**
   * <pre>
   * Personal or resource specific
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Permission permission = 2 [json_name = "permission"];</code>
   */
  com.aruna.api.storage.models.v2.PermissionOrBuilder getPermissionOrBuilder();

  /**
   * <pre>
   * Token expiry
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expires_at = 3 [json_name = "expiresAt"];</code>
   * @return Whether the expiresAt field is set.
   */
  boolean hasExpiresAt();
  /**
   * <pre>
   * Token expiry
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expires_at = 3 [json_name = "expiresAt"];</code>
   * @return The expiresAt.
   */
  com.google.protobuf.Timestamp getExpiresAt();
  /**
   * <pre>
   * Token expiry
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expires_at = 3 [json_name = "expiresAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpiresAtOrBuilder();
}
