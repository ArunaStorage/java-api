// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/workspace_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface WorkspaceInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.WorkspaceInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string workspace_id = 1 [json_name = "workspaceId"];</code>
   * @return The workspaceId.
   */
  java.lang.String getWorkspaceId();
  /**
   * <code>string workspace_id = 1 [json_name = "workspaceId"];</code>
   * @return The bytes for workspaceId.
   */
  com.google.protobuf.ByteString
      getWorkspaceIdBytes();

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
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string owner = 4 [json_name = "owner"];</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <code>string owner = 4 [json_name = "owner"];</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <code>string prefix = 5 [json_name = "prefix"];</code>
   * @return The prefix.
   */
  java.lang.String getPrefix();
  /**
   * <code>string prefix = 5 [json_name = "prefix"];</code>
   * @return The bytes for prefix.
   */
  com.google.protobuf.ByteString
      getPrefixBytes();

  /**
   * <code>string hook_ids = 6 [json_name = "hookIds"];</code>
   * @return The hookIds.
   */
  java.lang.String getHookIds();
  /**
   * <code>string hook_ids = 6 [json_name = "hookIds"];</code>
   * @return The bytes for hookIds.
   */
  com.google.protobuf.ByteString
      getHookIdsBytes();

  /**
   * <code>string endpoint_ids = 7 [json_name = "endpointIds"];</code>
   * @return The endpointIds.
   */
  java.lang.String getEndpointIds();
  /**
   * <code>string endpoint_ids = 7 [json_name = "endpointIds"];</code>
   * @return The bytes for endpointIds.
   */
  com.google.protobuf.ByteString
      getEndpointIdsBytes();
}
