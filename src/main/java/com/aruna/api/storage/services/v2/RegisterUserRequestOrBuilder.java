// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/user_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface RegisterUserRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.RegisterUserRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * user_displayname
   * </pre>
   *
   * <code>string display_name = 1 [json_name = "displayName"];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * user_displayname
   * </pre>
   *
   * <code>string display_name = 1 [json_name = "displayName"];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Mail address (optional)
   * </pre>
   *
   * <code>string email = 2 [json_name = "email"];</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <pre>
   * Mail address (optional)
   * </pre>
   *
   * <code>string email = 2 [json_name = "email"];</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <pre>
   * Project hint description string (optional)
   * </pre>
   *
   * <code>string project = 3 [json_name = "project"];</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Project hint description string (optional)
   * </pre>
   *
   * <code>string project = 3 [json_name = "project"];</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();
}
