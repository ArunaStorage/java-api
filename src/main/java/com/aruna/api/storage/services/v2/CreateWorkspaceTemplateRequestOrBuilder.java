// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/workspace_service.proto

// Protobuf Java Version: 3.25.1
package com.aruna.api.storage.services.v2;

public interface CreateWorkspaceTemplateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.CreateWorkspaceTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The user id of the template owner (will be automatically added as "admin" to each associated workspace)
   * </pre>
   *
   * <code>string owner_id = 1 [json_name = "ownerId"];</code>
   * @return The ownerId.
   */
  java.lang.String getOwnerId();
  /**
   * <pre>
   * The user id of the template owner (will be automatically added as "admin" to each associated workspace)
   * </pre>
   *
   * <code>string owner_id = 1 [json_name = "ownerId"];</code>
   * @return The bytes for ownerId.
   */
  com.google.protobuf.ByteString
      getOwnerIdBytes();

  /**
   * <pre>
   * Short prefix for each workspace_project (will be prepended by a random id) example: test-i12ashj9g2
   * </pre>
   *
   * <code>string prefix = 2 [json_name = "prefix"];</code>
   * @return The prefix.
   */
  java.lang.String getPrefix();
  /**
   * <pre>
   * Short prefix for each workspace_project (will be prepended by a random id) example: test-i12ashj9g2
   * </pre>
   *
   * <code>string prefix = 2 [json_name = "prefix"];</code>
   * @return The bytes for prefix.
   */
  com.google.protobuf.ByteString
      getPrefixBytes();

  /**
   * <pre>
   * The name of the workspace template
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the workspace template
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Hooks that are added to created workspaces
   * </pre>
   *
   * <code>repeated string hook_ids = 5 [json_name = "hookIds"];</code>
   * @return A list containing the hookIds.
   */
  java.util.List<java.lang.String>
      getHookIdsList();
  /**
   * <pre>
   * Hooks that are added to created workspaces
   * </pre>
   *
   * <code>repeated string hook_ids = 5 [json_name = "hookIds"];</code>
   * @return The count of hookIds.
   */
  int getHookIdsCount();
  /**
   * <pre>
   * Hooks that are added to created workspaces
   * </pre>
   *
   * <code>repeated string hook_ids = 5 [json_name = "hookIds"];</code>
   * @param index The index of the element to return.
   * @return The hookIds at the given index.
   */
  java.lang.String getHookIds(int index);
  /**
   * <pre>
   * Hooks that are added to created workspaces
   * </pre>
   *
   * <code>repeated string hook_ids = 5 [json_name = "hookIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the hookIds at the given index.
   */
  com.google.protobuf.ByteString
      getHookIdsBytes(int index);

  /**
   * <pre>
   * Description of the workspace
   * </pre>
   *
   * <code>string description = 6 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description of the workspace
   * </pre>
   *
   * <code>string description = 6 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Endpoint ids that are used for this template
   * </pre>
   *
   * <code>repeated string endpoint_ids = 7 [json_name = "endpointIds"];</code>
   * @return A list containing the endpointIds.
   */
  java.util.List<java.lang.String>
      getEndpointIdsList();
  /**
   * <pre>
   * Endpoint ids that are used for this template
   * </pre>
   *
   * <code>repeated string endpoint_ids = 7 [json_name = "endpointIds"];</code>
   * @return The count of endpointIds.
   */
  int getEndpointIdsCount();
  /**
   * <pre>
   * Endpoint ids that are used for this template
   * </pre>
   *
   * <code>repeated string endpoint_ids = 7 [json_name = "endpointIds"];</code>
   * @param index The index of the element to return.
   * @return The endpointIds at the given index.
   */
  java.lang.String getEndpointIds(int index);
  /**
   * <pre>
   * Endpoint ids that are used for this template
   * </pre>
   *
   * <code>repeated string endpoint_ids = 7 [json_name = "endpointIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the endpointIds at the given index.
   */
  com.google.protobuf.ByteString
      getEndpointIdsBytes(int index);
}
