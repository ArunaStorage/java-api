// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/workspace_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.services.v2;

public interface ClaimWorkspaceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.ClaimWorkspaceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This can only be called by an registered user,
   * that is in possesion of the workspace_id and workspace token
   * It will remove the service account and claim all references "as" the user.
   * </pre>
   *
   * <code>string workspace_id = 1 [json_name = "workspaceId"];</code>
   * @return The workspaceId.
   */
  java.lang.String getWorkspaceId();
  /**
   * <pre>
   * This can only be called by an registered user,
   * that is in possesion of the workspace_id and workspace token
   * It will remove the service account and claim all references "as" the user.
   * </pre>
   *
   * <code>string workspace_id = 1 [json_name = "workspaceId"];</code>
   * @return The bytes for workspaceId.
   */
  com.google.protobuf.ByteString
      getWorkspaceIdBytes();

  /**
   * <code>string token = 2 [json_name = "token"];</code>
   * @return The token.
   */
  java.lang.String getToken();
  /**
   * <code>string token = 2 [json_name = "token"];</code>
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString
      getTokenBytes();
}
