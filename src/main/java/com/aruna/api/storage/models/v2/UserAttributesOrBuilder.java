// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.storage.models.v2;

public interface UserAttributesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.models.v2.UserAttributes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool global_admin = 1 [json_name = "globalAdmin"];</code>
   * @return The globalAdmin.
   */
  boolean getGlobalAdmin();

  /**
   * <code>bool service_account = 2 [json_name = "serviceAccount"];</code>
   * @return The serviceAccount.
   */
  boolean getServiceAccount();

  /**
   * <code>repeated .aruna.api.storage.models.v2.Token tokens = 3 [json_name = "tokens"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.Token> 
      getTokensList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Token tokens = 3 [json_name = "tokens"];</code>
   */
  com.aruna.api.storage.models.v2.Token getTokens(int index);
  /**
   * <code>repeated .aruna.api.storage.models.v2.Token tokens = 3 [json_name = "tokens"];</code>
   */
  int getTokensCount();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Token tokens = 3 [json_name = "tokens"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.TokenOrBuilder> 
      getTokensOrBuilderList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Token tokens = 3 [json_name = "tokens"];</code>
   */
  com.aruna.api.storage.models.v2.TokenOrBuilder getTokensOrBuilder(
      int index);

  /**
   * <code>repeated string trusted_endpoints = 4 [json_name = "trustedEndpoints"];</code>
   * @return A list containing the trustedEndpoints.
   */
  java.util.List<java.lang.String>
      getTrustedEndpointsList();
  /**
   * <code>repeated string trusted_endpoints = 4 [json_name = "trustedEndpoints"];</code>
   * @return The count of trustedEndpoints.
   */
  int getTrustedEndpointsCount();
  /**
   * <code>repeated string trusted_endpoints = 4 [json_name = "trustedEndpoints"];</code>
   * @param index The index of the element to return.
   * @return The trustedEndpoints at the given index.
   */
  java.lang.String getTrustedEndpoints(int index);
  /**
   * <code>repeated string trusted_endpoints = 4 [json_name = "trustedEndpoints"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the trustedEndpoints at the given index.
   */
  com.google.protobuf.ByteString
      getTrustedEndpointsBytes(int index);

  /**
   * <code>repeated .aruna.api.storage.models.v2.CustomAttribute custom_attributes = 5 [json_name = "customAttributes"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.CustomAttribute> 
      getCustomAttributesList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.CustomAttribute custom_attributes = 5 [json_name = "customAttributes"];</code>
   */
  com.aruna.api.storage.models.v2.CustomAttribute getCustomAttributes(int index);
  /**
   * <code>repeated .aruna.api.storage.models.v2.CustomAttribute custom_attributes = 5 [json_name = "customAttributes"];</code>
   */
  int getCustomAttributesCount();
  /**
   * <code>repeated .aruna.api.storage.models.v2.CustomAttribute custom_attributes = 5 [json_name = "customAttributes"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.CustomAttributeOrBuilder> 
      getCustomAttributesOrBuilderList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.CustomAttribute custom_attributes = 5 [json_name = "customAttributes"];</code>
   */
  com.aruna.api.storage.models.v2.CustomAttributeOrBuilder getCustomAttributesOrBuilder(
      int index);

  /**
   * <code>repeated .aruna.api.storage.models.v2.Permission personal_permissions = 6 [json_name = "personalPermissions"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.Permission> 
      getPersonalPermissionsList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Permission personal_permissions = 6 [json_name = "personalPermissions"];</code>
   */
  com.aruna.api.storage.models.v2.Permission getPersonalPermissions(int index);
  /**
   * <code>repeated .aruna.api.storage.models.v2.Permission personal_permissions = 6 [json_name = "personalPermissions"];</code>
   */
  int getPersonalPermissionsCount();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Permission personal_permissions = 6 [json_name = "personalPermissions"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.PermissionOrBuilder> 
      getPersonalPermissionsOrBuilderList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Permission personal_permissions = 6 [json_name = "personalPermissions"];</code>
   */
  com.aruna.api.storage.models.v2.PermissionOrBuilder getPersonalPermissionsOrBuilder(
      int index);

  /**
   * <code>repeated .aruna.api.storage.models.v2.OidcMapping external_ids = 7 [json_name = "externalIds"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.OidcMapping> 
      getExternalIdsList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.OidcMapping external_ids = 7 [json_name = "externalIds"];</code>
   */
  com.aruna.api.storage.models.v2.OidcMapping getExternalIds(int index);
  /**
   * <code>repeated .aruna.api.storage.models.v2.OidcMapping external_ids = 7 [json_name = "externalIds"];</code>
   */
  int getExternalIdsCount();
  /**
   * <code>repeated .aruna.api.storage.models.v2.OidcMapping external_ids = 7 [json_name = "externalIds"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.OidcMappingOrBuilder> 
      getExternalIdsOrBuilderList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.OidcMapping external_ids = 7 [json_name = "externalIds"];</code>
   */
  com.aruna.api.storage.models.v2.OidcMappingOrBuilder getExternalIdsOrBuilder(
      int index);

  /**
   * <code>string pubkey = 8 [json_name = "pubkey"];</code>
   * @return The pubkey.
   */
  java.lang.String getPubkey();
  /**
   * <code>string pubkey = 8 [json_name = "pubkey"];</code>
   * @return The bytes for pubkey.
   */
  com.google.protobuf.ByteString
      getPubkeyBytes();

  /**
   * <code>repeated .aruna.api.storage.models.v2.DataProxyAttribute data_proxy_attributes = 9 [json_name = "dataProxyAttributes"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.DataProxyAttribute> 
      getDataProxyAttributesList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.DataProxyAttribute data_proxy_attributes = 9 [json_name = "dataProxyAttributes"];</code>
   */
  com.aruna.api.storage.models.v2.DataProxyAttribute getDataProxyAttributes(int index);
  /**
   * <code>repeated .aruna.api.storage.models.v2.DataProxyAttribute data_proxy_attributes = 9 [json_name = "dataProxyAttributes"];</code>
   */
  int getDataProxyAttributesCount();
  /**
   * <code>repeated .aruna.api.storage.models.v2.DataProxyAttribute data_proxy_attributes = 9 [json_name = "dataProxyAttributes"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.DataProxyAttributeOrBuilder> 
      getDataProxyAttributesOrBuilderList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.DataProxyAttribute data_proxy_attributes = 9 [json_name = "dataProxyAttributes"];</code>
   */
  com.aruna.api.storage.models.v2.DataProxyAttributeOrBuilder getDataProxyAttributesOrBuilder(
      int index);
}
