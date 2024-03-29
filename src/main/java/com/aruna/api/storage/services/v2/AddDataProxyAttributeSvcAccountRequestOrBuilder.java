// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/service_account_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface AddDataProxyAttributeSvcAccountRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountRequest)
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
   * <code>.aruna.api.storage.models.v2.DataProxyAttribute attribute = 2 [json_name = "attribute"];</code>
   * @return Whether the attribute field is set.
   */
  boolean hasAttribute();
  /**
   * <code>.aruna.api.storage.models.v2.DataProxyAttribute attribute = 2 [json_name = "attribute"];</code>
   * @return The attribute.
   */
  com.aruna.api.storage.models.v2.DataProxyAttribute getAttribute();
  /**
   * <code>.aruna.api.storage.models.v2.DataProxyAttribute attribute = 2 [json_name = "attribute"];</code>
   */
  com.aruna.api.storage.models.v2.DataProxyAttributeOrBuilder getAttributeOrBuilder();
}
