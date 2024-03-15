// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/project_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface UpdateProjectTitleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.UpdateProjectTitleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Project id
   * </pre>
   *
   * <code>string project_id = 1 [json_name = "projectId"];</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * Project id
   * </pre>
   *
   * <code>string project_id = 1 [json_name = "projectId"];</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * New title
   * </pre>
   *
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * New title
   * </pre>
   *
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();
}
