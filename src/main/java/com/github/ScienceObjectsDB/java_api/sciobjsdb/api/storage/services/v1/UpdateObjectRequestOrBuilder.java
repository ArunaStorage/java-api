// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sciobjsdb/api/storage/services/v1/dataset_object_service_models.proto

package com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1;

public interface UpdateObjectRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sciobjsdb.api.storage.services.v1.UpdateObjectRequest)
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
   * <code>.sciobjsdb.api.storage.services.v1.CreateObjectRequest updated_object = 2 [json_name = "updatedObject"];</code>
   * @return Whether the updatedObject field is set.
   */
  boolean hasUpdatedObject();
  /**
   * <code>.sciobjsdb.api.storage.services.v1.CreateObjectRequest updated_object = 2 [json_name = "updatedObject"];</code>
   * @return The updatedObject.
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.CreateObjectRequest getUpdatedObject();
  /**
   * <code>.sciobjsdb.api.storage.services.v1.CreateObjectRequest updated_object = 2 [json_name = "updatedObject"];</code>
   */
  com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.CreateObjectRequestOrBuilder getUpdatedObjectOrBuilder();

  public com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.services.v1.UpdateObjectRequest.UpdateObjectCase getUpdateObjectCase();
}
