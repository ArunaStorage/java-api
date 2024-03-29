// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/collection_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface UpdateCollectionAuthorsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.UpdateCollectionAuthorsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string collection_id = 1 [json_name = "collectionId"];</code>
   * @return The collectionId.
   */
  java.lang.String getCollectionId();
  /**
   * <code>string collection_id = 1 [json_name = "collectionId"];</code>
   * @return The bytes for collectionId.
   */
  com.google.protobuf.ByteString
      getCollectionIdBytes();

  /**
   * <code>repeated .aruna.api.storage.models.v2.Author add_authors = 2 [json_name = "addAuthors"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.Author> 
      getAddAuthorsList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Author add_authors = 2 [json_name = "addAuthors"];</code>
   */
  com.aruna.api.storage.models.v2.Author getAddAuthors(int index);
  /**
   * <code>repeated .aruna.api.storage.models.v2.Author add_authors = 2 [json_name = "addAuthors"];</code>
   */
  int getAddAuthorsCount();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Author add_authors = 2 [json_name = "addAuthors"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.AuthorOrBuilder> 
      getAddAuthorsOrBuilderList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Author add_authors = 2 [json_name = "addAuthors"];</code>
   */
  com.aruna.api.storage.models.v2.AuthorOrBuilder getAddAuthorsOrBuilder(
      int index);

  /**
   * <code>repeated .aruna.api.storage.models.v2.Author remove_authors = 3 [json_name = "removeAuthors"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.Author> 
      getRemoveAuthorsList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Author remove_authors = 3 [json_name = "removeAuthors"];</code>
   */
  com.aruna.api.storage.models.v2.Author getRemoveAuthors(int index);
  /**
   * <code>repeated .aruna.api.storage.models.v2.Author remove_authors = 3 [json_name = "removeAuthors"];</code>
   */
  int getRemoveAuthorsCount();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Author remove_authors = 3 [json_name = "removeAuthors"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.AuthorOrBuilder> 
      getRemoveAuthorsOrBuilderList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Author remove_authors = 3 [json_name = "removeAuthors"];</code>
   */
  com.aruna.api.storage.models.v2.AuthorOrBuilder getRemoveAuthorsOrBuilder(
      int index);
}
