// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/info_service.proto

// Protobuf Java Version: 3.25.1
package com.aruna.api.storage.services.v2;

public interface SetAnnouncementsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.SetAnnouncementsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
   */
  java.util.List<com.aruna.api.storage.services.v2.Announcement> 
      getAnnouncementsList();
  /**
   * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
   */
  com.aruna.api.storage.services.v2.Announcement getAnnouncements(int index);
  /**
   * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
   */
  int getAnnouncementsCount();
  /**
   * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.services.v2.AnnouncementOrBuilder> 
      getAnnouncementsOrBuilderList();
  /**
   * <code>repeated .aruna.api.storage.services.v2.Announcement announcements = 1 [json_name = "announcements"];</code>
   */
  com.aruna.api.storage.services.v2.AnnouncementOrBuilder getAnnouncementsOrBuilder(
      int index);
}
