// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sciobjsdb/api/storage/services/v1/dataset_object_service_models.proto

package com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1;

public interface GetObjectGroupResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sciobjsdb.api.storage.services.v1.GetObjectGroupResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.sciobjsdb.api.storage.models.v1.ObjectGroup object_group = 1 [json_name = "objectGroup"];</code>
   * @return Whether the objectGroup field is set.
   */
  boolean hasObjectGroup();
  /**
   * <code>.sciobjsdb.api.storage.models.v1.ObjectGroup object_group = 1 [json_name = "objectGroup"];</code>
   * @return The objectGroup.
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroup getObjectGroup();
  /**
   * <code>.sciobjsdb.api.storage.models.v1.ObjectGroup object_group = 1 [json_name = "objectGroup"];</code>
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupOrBuilder getObjectGroupOrBuilder();

  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 2 [json_name = "objectGroupRevisions"];</code>
   */
  java.util.List<com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision> 
      getObjectGroupRevisionsList();
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 2 [json_name = "objectGroupRevisions"];</code>
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevision getObjectGroupRevisions(int index);
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 2 [json_name = "objectGroupRevisions"];</code>
   */
  int getObjectGroupRevisionsCount();
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 2 [json_name = "objectGroupRevisions"];</code>
   */
  java.util.List<? extends com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevisionOrBuilder> 
      getObjectGroupRevisionsOrBuilderList();
  /**
   * <code>repeated .sciobjsdb.api.storage.models.v1.ObjectGroupRevision object_group_revisions = 2 [json_name = "objectGroupRevisions"];</code>
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1.ObjectGroupRevisionOrBuilder getObjectGroupRevisionsOrBuilder(
      int index);
}
