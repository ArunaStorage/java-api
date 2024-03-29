// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/object_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface GetObjectsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.GetObjectsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A List of objects
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.Object> 
      getObjectsList();
  /**
   * <pre>
   * A List of objects
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
   */
  com.aruna.api.storage.models.v2.Object getObjects(int index);
  /**
   * <pre>
   * A List of objects
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
   */
  int getObjectsCount();
  /**
   * <pre>
   * A List of objects
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.ObjectOrBuilder> 
      getObjectsOrBuilderList();
  /**
   * <pre>
   * A List of objects
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Object objects = 1 [json_name = "objects"];</code>
   */
  com.aruna.api.storage.models.v2.ObjectOrBuilder getObjectsOrBuilder(
      int index);
}
