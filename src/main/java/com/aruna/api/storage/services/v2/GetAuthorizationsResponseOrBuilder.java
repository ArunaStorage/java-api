// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/authorization_service.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.storage.services.v2;

public interface GetAuthorizationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.GetAuthorizationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
   */
  java.util.List<com.aruna.api.storage.services.v2.ResourceAuthorization> 
      getAuthorizationsList();
  /**
   * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
   */
  com.aruna.api.storage.services.v2.ResourceAuthorization getAuthorizations(int index);
  /**
   * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
   */
  int getAuthorizationsCount();
  /**
   * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.services.v2.ResourceAuthorizationOrBuilder> 
      getAuthorizationsOrBuilderList();
  /**
   * <code>repeated .aruna.api.storage.services.v2.ResourceAuthorization authorizations = 1 [json_name = "authorizations"];</code>
   */
  com.aruna.api.storage.services.v2.ResourceAuthorizationOrBuilder getAuthorizationsOrBuilder(
      int index);
}
