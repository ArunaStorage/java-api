// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/info_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface AnnouncementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.Announcement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Announcement id
   * </pre>
   *
   * <code>string announcement_id = 1 [json_name = "announcementId"];</code>
   * @return The announcementId.
   */
  java.lang.String getAnnouncementId();
  /**
   * <pre>
   * Announcement id
   * </pre>
   *
   * <code>string announcement_id = 1 [json_name = "announcementId"];</code>
   * @return The bytes for announcementId.
   */
  com.google.protobuf.ByteString
      getAnnouncementIdBytes();

  /**
   * <pre>
   * Announcement type
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.AnnouncementType announcement_type = 2 [json_name = "announcementType"];</code>
   * @return The enum numeric value on the wire for announcementType.
   */
  int getAnnouncementTypeValue();
  /**
   * <pre>
   * Announcement type
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.AnnouncementType announcement_type = 2 [json_name = "announcementType"];</code>
   * @return The announcementType.
   */
  com.aruna.api.storage.models.v2.AnnouncementType getAnnouncementType();

  /**
   * <pre>
   * Announcement title
   * </pre>
   *
   * <code>string title = 3 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * Announcement title
   * </pre>
   *
   * <code>string title = 3 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * Short announcement summary
   * </pre>
   *
   * <code>string teaser = 4 [json_name = "teaser"];</code>
   * @return The teaser.
   */
  java.lang.String getTeaser();
  /**
   * <pre>
   * Short announcement summary
   * </pre>
   *
   * <code>string teaser = 4 [json_name = "teaser"];</code>
   * @return The bytes for teaser.
   */
  com.google.protobuf.ByteString
      getTeaserBytes();

  /**
   * <pre>
   * URL for announcement preview image
   * </pre>
   *
   * <code>string image_url = 5 [json_name = "imageUrl"];</code>
   * @return The imageUrl.
   */
  java.lang.String getImageUrl();
  /**
   * <pre>
   * URL for announcement preview image
   * </pre>
   *
   * <code>string image_url = 5 [json_name = "imageUrl"];</code>
   * @return The bytes for imageUrl.
   */
  com.google.protobuf.ByteString
      getImageUrlBytes();

  /**
   * <pre>
   * Announcement content text
   * </pre>
   *
   * <code>string content = 6 [json_name = "content"];</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <pre>
   * Announcement content text
   * </pre>
   *
   * <code>string content = 6 [json_name = "content"];</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <pre>
   * Initial announcement author
   * </pre>
   *
   * <code>string created_by = 7 [json_name = "createdBy"];</code>
   * @return The createdBy.
   */
  java.lang.String getCreatedBy();
  /**
   * <pre>
   * Initial announcement author
   * </pre>
   *
   * <code>string created_by = 7 [json_name = "createdBy"];</code>
   * @return The bytes for createdBy.
   */
  com.google.protobuf.ByteString
      getCreatedByBytes();

  /**
   * <pre>
   * Initial creation timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 8 [json_name = "createdAt"];</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * Initial creation timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 8 [json_name = "createdAt"];</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * Initial creation timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 8 [json_name = "createdAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * Author responsible for the last modification
   * </pre>
   *
   * <code>string modified_by = 9 [json_name = "modifiedBy"];</code>
   * @return The modifiedBy.
   */
  java.lang.String getModifiedBy();
  /**
   * <pre>
   * Author responsible for the last modification
   * </pre>
   *
   * <code>string modified_by = 9 [json_name = "modifiedBy"];</code>
   * @return The bytes for modifiedBy.
   */
  com.google.protobuf.ByteString
      getModifiedByBytes();

  /**
   * <pre>
   * Last modification timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 10 [json_name = "modifiedAt"];</code>
   * @return Whether the modifiedAt field is set.
   */
  boolean hasModifiedAt();
  /**
   * <pre>
   * Last modification timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 10 [json_name = "modifiedAt"];</code>
   * @return The modifiedAt.
   */
  com.google.protobuf.Timestamp getModifiedAt();
  /**
   * <pre>
   * Last modification timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modified_at = 10 [json_name = "modifiedAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getModifiedAtOrBuilder();
}
