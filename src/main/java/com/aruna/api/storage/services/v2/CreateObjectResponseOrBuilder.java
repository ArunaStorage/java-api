// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/object_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.storage.services.v2;

public interface CreateObjectResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.CreateObjectResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aruna.api.storage.models.v2.Object object = 1 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  boolean hasObject();
  /**
   * <code>.aruna.api.storage.models.v2.Object object = 1 [json_name = "object"];</code>
   * @return The object.
   */
  com.aruna.api.storage.models.v2.Object getObject();
  /**
   * <code>.aruna.api.storage.models.v2.Object object = 1 [json_name = "object"];</code>
   */
  com.aruna.api.storage.models.v2.ObjectOrBuilder getObjectOrBuilder();
}
