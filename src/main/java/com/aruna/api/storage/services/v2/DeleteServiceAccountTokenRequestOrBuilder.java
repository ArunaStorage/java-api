// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/service_account_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.storage.services.v2;

public interface DeleteServiceAccountTokenRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.DeleteServiceAccountTokenRequest)
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
   * <code>string token_id = 2 [json_name = "tokenId"];</code>
   * @return The tokenId.
   */
  java.lang.String getTokenId();
  /**
   * <code>string token_id = 2 [json_name = "tokenId"];</code>
   * @return The bytes for tokenId.
   */
  com.google.protobuf.ByteString
      getTokenIdBytes();
}
