// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/workspace_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface GetWorkspaceTemplateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.GetWorkspaceTemplateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aruna.api.storage.services.v2.WorkspaceInfo workspace = 1 [json_name = "workspace"];</code>
   * @return Whether the workspace field is set.
   */
  boolean hasWorkspace();
  /**
   * <code>.aruna.api.storage.services.v2.WorkspaceInfo workspace = 1 [json_name = "workspace"];</code>
   * @return The workspace.
   */
  com.aruna.api.storage.services.v2.WorkspaceInfo getWorkspace();
  /**
   * <code>.aruna.api.storage.services.v2.WorkspaceInfo workspace = 1 [json_name = "workspace"];</code>
   */
  com.aruna.api.storage.services.v2.WorkspaceInfoOrBuilder getWorkspaceOrBuilder();
}
