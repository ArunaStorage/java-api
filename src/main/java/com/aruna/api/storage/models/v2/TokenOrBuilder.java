// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.storage.models.v2;

public interface TokenOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.models.v2.Token)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

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
   * <code>.google.protobuf.Timestamp created_at = 3 [json_name = "createdAt"];</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 3 [json_name = "createdAt"];</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 3 [json_name = "createdAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp expires_at = 4 [json_name = "expiresAt"];</code>
   * @return Whether the expiresAt field is set.
   */
  boolean hasExpiresAt();
  /**
   * <code>.google.protobuf.Timestamp expires_at = 4 [json_name = "expiresAt"];</code>
   * @return The expiresAt.
   */
  com.google.protobuf.Timestamp getExpiresAt();
  /**
   * <code>.google.protobuf.Timestamp expires_at = 4 [json_name = "expiresAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpiresAtOrBuilder();

  /**
   * <pre>
   * Tokens can either be personal or resource "specific"
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Permission permission = 5 [json_name = "permission"];</code>
   * @return Whether the permission field is set.
   */
  boolean hasPermission();
  /**
   * <pre>
   * Tokens can either be personal or resource "specific"
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Permission permission = 5 [json_name = "permission"];</code>
   * @return The permission.
   */
  com.aruna.api.storage.models.v2.Permission getPermission();
  /**
   * <pre>
   * Tokens can either be personal or resource "specific"
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Permission permission = 5 [json_name = "permission"];</code>
   */
  com.aruna.api.storage.models.v2.PermissionOrBuilder getPermissionOrBuilder();
}
