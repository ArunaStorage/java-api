// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/object_service.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.storage.services.v2;

public interface SetObjectHashesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.SetObjectHashesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The updated object (possibly with error status)
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Object object = 1 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  boolean hasObject();
  /**
   * <pre>
   * The updated object (possibly with error status)
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Object object = 1 [json_name = "object"];</code>
   * @return The object.
   */
  com.aruna.api.storage.models.v2.Object getObject();
  /**
   * <pre>
   * The updated object (possibly with error status)
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Object object = 1 [json_name = "object"];</code>
   */
  com.aruna.api.storage.models.v2.ObjectOrBuilder getObjectOrBuilder();
}