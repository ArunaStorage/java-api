// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/service_account_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.services.v2;

public interface GetS3CredentialsSvcAccountRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.GetS3CredentialsSvcAccountRequest)
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
}
