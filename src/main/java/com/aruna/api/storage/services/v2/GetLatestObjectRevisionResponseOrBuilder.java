// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/object_service.proto

// Protobuf Java Version: 3.25.1
package com.aruna.api.storage.services.v2;

public interface GetLatestObjectRevisionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.GetLatestObjectRevisionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The object with the latest revision
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Object object = 1 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  boolean hasObject();
  /**
   * <pre>
   * The object with the latest revision
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Object object = 1 [json_name = "object"];</code>
   * @return The object.
   */
  com.aruna.api.storage.models.v2.Object getObject();
  /**
   * <pre>
   * The object with the latest revision
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Object object = 1 [json_name = "object"];</code>
   */
  com.aruna.api.storage.models.v2.ObjectOrBuilder getObjectOrBuilder();
}
