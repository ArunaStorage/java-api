// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/project_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.storage.services.v2;

public interface CreateProjectResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.CreateProjectResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The freshly created project 
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Project project = 1 [json_name = "project"];</code>
   * @return Whether the project field is set.
   */
  boolean hasProject();
  /**
   * <pre>
   * The freshly created project 
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Project project = 1 [json_name = "project"];</code>
   * @return The project.
   */
  com.aruna.api.storage.models.v2.Project getProject();
  /**
   * <pre>
   * The freshly created project 
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Project project = 1 [json_name = "project"];</code>
   */
  com.aruna.api.storage.models.v2.ProjectOrBuilder getProjectOrBuilder();
}
