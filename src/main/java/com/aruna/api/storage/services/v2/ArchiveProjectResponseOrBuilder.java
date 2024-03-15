// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/project_service.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.storage.services.v2;

public interface ArchiveProjectResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.ArchiveProjectResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This project will be returned via an Persistent Identifier! Updates will be impossible
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Project project = 1 [json_name = "project"];</code>
   * @return Whether the project field is set.
   */
  boolean hasProject();
  /**
   * <pre>
   * This project will be returned via an Persistent Identifier! Updates will be impossible
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Project project = 1 [json_name = "project"];</code>
   * @return The project.
   */
  com.aruna.api.storage.models.v2.Project getProject();
  /**
   * <pre>
   * This project will be returned via an Persistent Identifier! Updates will be impossible
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Project project = 1 [json_name = "project"];</code>
   */
  com.aruna.api.storage.models.v2.ProjectOrBuilder getProjectOrBuilder();
}
