// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/workspace_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface ListOwnedWorkspaceTemplatesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .aruna.api.storage.services.v2.WorkspaceInfo workspaces = 1 [json_name = "workspaces"];</code>
   */
  java.util.List<com.aruna.api.storage.services.v2.WorkspaceInfo> 
      getWorkspacesList();
  /**
   * <code>repeated .aruna.api.storage.services.v2.WorkspaceInfo workspaces = 1 [json_name = "workspaces"];</code>
   */
  com.aruna.api.storage.services.v2.WorkspaceInfo getWorkspaces(int index);
  /**
   * <code>repeated .aruna.api.storage.services.v2.WorkspaceInfo workspaces = 1 [json_name = "workspaces"];</code>
   */
  int getWorkspacesCount();
  /**
   * <code>repeated .aruna.api.storage.services.v2.WorkspaceInfo workspaces = 1 [json_name = "workspaces"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.services.v2.WorkspaceInfoOrBuilder> 
      getWorkspacesOrBuilderList();
  /**
   * <code>repeated .aruna.api.storage.services.v2.WorkspaceInfo workspaces = 1 [json_name = "workspaces"];</code>
   */
  com.aruna.api.storage.services.v2.WorkspaceInfoOrBuilder getWorkspacesOrBuilder(
      int index);
}
