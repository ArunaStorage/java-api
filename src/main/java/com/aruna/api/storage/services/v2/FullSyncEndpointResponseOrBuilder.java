// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/endpoint_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface FullSyncEndpointResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.FullSyncEndpointResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aruna.api.storage.models.v2.GenericResource generic_resource = 1 [json_name = "genericResource"];</code>
   * @return Whether the genericResource field is set.
   */
  boolean hasGenericResource();
  /**
   * <code>.aruna.api.storage.models.v2.GenericResource generic_resource = 1 [json_name = "genericResource"];</code>
   * @return The genericResource.
   */
  com.aruna.api.storage.models.v2.GenericResource getGenericResource();
  /**
   * <code>.aruna.api.storage.models.v2.GenericResource generic_resource = 1 [json_name = "genericResource"];</code>
   */
  com.aruna.api.storage.models.v2.GenericResourceOrBuilder getGenericResourceOrBuilder();

  /**
   * <code>.aruna.api.storage.models.v2.User user = 2 [json_name = "user"];</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <code>.aruna.api.storage.models.v2.User user = 2 [json_name = "user"];</code>
   * @return The user.
   */
  com.aruna.api.storage.models.v2.User getUser();
  /**
   * <code>.aruna.api.storage.models.v2.User user = 2 [json_name = "user"];</code>
   */
  com.aruna.api.storage.models.v2.UserOrBuilder getUserOrBuilder();

  /**
   * <code>.aruna.api.storage.models.v2.Pubkey pubkey = 3 [json_name = "pubkey"];</code>
   * @return Whether the pubkey field is set.
   */
  boolean hasPubkey();
  /**
   * <code>.aruna.api.storage.models.v2.Pubkey pubkey = 3 [json_name = "pubkey"];</code>
   * @return The pubkey.
   */
  com.aruna.api.storage.models.v2.Pubkey getPubkey();
  /**
   * <code>.aruna.api.storage.models.v2.Pubkey pubkey = 3 [json_name = "pubkey"];</code>
   */
  com.aruna.api.storage.models.v2.PubkeyOrBuilder getPubkeyOrBuilder();

  com.aruna.api.storage.services.v2.FullSyncEndpointResponse.TargetCase getTargetCase();
}
