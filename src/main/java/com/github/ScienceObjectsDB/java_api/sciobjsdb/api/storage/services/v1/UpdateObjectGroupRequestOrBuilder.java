// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sciobjsdb/api/storage/services/v1/dataset_object_service_models.proto

package com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1;

public interface UpdateObjectGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sciobjsdb.api.storage.services.v1.UpdateObjectGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string parent_revision_id = 2 [json_name = "parentRevisionId"];</code>
   * @return The parentRevisionId.
   */
  java.lang.String getParentRevisionId();
  /**
   * <code>string parent_revision_id = 2 [json_name = "parentRevisionId"];</code>
   * @return The bytes for parentRevisionId.
   */
  com.google.protobuf.ByteString
      getParentRevisionIdBytes();

  /**
   * <code>.sciobjsdb.api.storage.services.v1.UpdateObjectsRequests update_objects = 3 [json_name = "updateObjects"];</code>
   * @return Whether the updateObjects field is set.
   */
  boolean hasUpdateObjects();
  /**
   * <code>.sciobjsdb.api.storage.services.v1.UpdateObjectsRequests update_objects = 3 [json_name = "updateObjects"];</code>
   * @return The updateObjects.
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.UpdateObjectsRequests getUpdateObjects();
  /**
   * <code>.sciobjsdb.api.storage.services.v1.UpdateObjectsRequests update_objects = 3 [json_name = "updateObjects"];</code>
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.UpdateObjectsRequestsOrBuilder getUpdateObjectsOrBuilder();

  /**
   * <code>.sciobjsdb.api.storage.services.v1.UpdateObjectsRequests update_meta_objects = 4 [json_name = "updateMetaObjects"];</code>
   * @return Whether the updateMetaObjects field is set.
   */
  boolean hasUpdateMetaObjects();
  /**
   * <code>.sciobjsdb.api.storage.services.v1.UpdateObjectsRequests update_meta_objects = 4 [json_name = "updateMetaObjects"];</code>
   * @return The updateMetaObjects.
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.UpdateObjectsRequests getUpdateMetaObjects();
  /**
   * <code>.sciobjsdb.api.storage.services.v1.UpdateObjectsRequests update_meta_objects = 4 [json_name = "updateMetaObjects"];</code>
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.UpdateObjectsRequestsOrBuilder getUpdateMetaObjectsOrBuilder();
}
