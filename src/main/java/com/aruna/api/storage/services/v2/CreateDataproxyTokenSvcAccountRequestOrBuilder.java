// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/service_account_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.storage.services.v2;

public interface CreateDataproxyTokenSvcAccountRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string svc_account_id = 1 [json_name = "svcAccountId"];</code>
   * @return The svcAccountId.
   */
  java.lang.String getSvcAccountId();
  /**
   * <code>string svc_account_id = 1 [json_name = "svcAccountId"];</code>
   * @return The bytes for svcAccountId.
   */
  com.google.protobuf.ByteString
      getSvcAccountIdBytes();

  /**
   * <code>string endpoint_id = 2 [json_name = "endpointId"];</code>
   * @return The endpointId.
   */
  java.lang.String getEndpointId();
  /**
   * <code>string endpoint_id = 2 [json_name = "endpointId"];</code>
   * @return The bytes for endpointId.
   */
  com.google.protobuf.ByteString
      getEndpointIdBytes();

  /**
   * <code>.aruna.api.storage.models.v2.Context context = 3 [json_name = "context"];</code>
   * @return Whether the context field is set.
   */
  boolean hasContext();
  /**
   * <code>.aruna.api.storage.models.v2.Context context = 3 [json_name = "context"];</code>
   * @return The context.
   */
  com.aruna.api.storage.models.v2.Context getContext();
  /**
   * <code>.aruna.api.storage.models.v2.Context context = 3 [json_name = "context"];</code>
   */
  com.aruna.api.storage.models.v2.ContextOrBuilder getContextOrBuilder();
}
