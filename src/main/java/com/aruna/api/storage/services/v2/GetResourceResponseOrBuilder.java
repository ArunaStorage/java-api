// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/search_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.storage.services.v2;

public interface GetResourceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.GetResourceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aruna.api.storage.services.v2.ResourceWithPermission resource = 1 [json_name = "resource"];</code>
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   * <code>.aruna.api.storage.services.v2.ResourceWithPermission resource = 1 [json_name = "resource"];</code>
   * @return The resource.
   */
  com.aruna.api.storage.services.v2.ResourceWithPermission getResource();
  /**
   * <code>.aruna.api.storage.services.v2.ResourceWithPermission resource = 1 [json_name = "resource"];</code>
   */
  com.aruna.api.storage.services.v2.ResourceWithPermissionOrBuilder getResourceOrBuilder();
}
