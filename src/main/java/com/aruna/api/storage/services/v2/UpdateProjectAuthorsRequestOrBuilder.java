// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/project_service.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.storage.services.v2;

public interface UpdateProjectAuthorsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.UpdateProjectAuthorsRequest)
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
   * Add authors
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Author add_authors = 2 [json_name = "addAuthors"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.Author> 
      getAddAuthorsList();
  /**
   * <pre>
   * Add authors
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Author add_authors = 2 [json_name = "addAuthors"];</code>
   */
  com.aruna.api.storage.models.v2.Author getAddAuthors(int index);
  /**
   * <pre>
   * Add authors
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Author add_authors = 2 [json_name = "addAuthors"];</code>
   */
  int getAddAuthorsCount();
  /**
   * <pre>
   * Add authors
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Author add_authors = 2 [json_name = "addAuthors"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.AuthorOrBuilder> 
      getAddAuthorsOrBuilderList();
  /**
   * <pre>
   * Add authors
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Author add_authors = 2 [json_name = "addAuthors"];</code>
   */
  com.aruna.api.storage.models.v2.AuthorOrBuilder getAddAuthorsOrBuilder(
      int index);

  /**
   * <pre>
   * Remove authors
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Author remove_authors = 3 [json_name = "removeAuthors"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.Author> 
      getRemoveAuthorsList();
  /**
   * <pre>
   * Remove authors
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Author remove_authors = 3 [json_name = "removeAuthors"];</code>
   */
  com.aruna.api.storage.models.v2.Author getRemoveAuthors(int index);
  /**
   * <pre>
   * Remove authors
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Author remove_authors = 3 [json_name = "removeAuthors"];</code>
   */
  int getRemoveAuthorsCount();
  /**
   * <pre>
   * Remove authors
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Author remove_authors = 3 [json_name = "removeAuthors"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.AuthorOrBuilder> 
      getRemoveAuthorsOrBuilderList();
  /**
   * <pre>
   * Remove authors
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Author remove_authors = 3 [json_name = "removeAuthors"];</code>
   */
  com.aruna.api.storage.models.v2.AuthorOrBuilder getRemoveAuthorsOrBuilder(
      int index);
}
