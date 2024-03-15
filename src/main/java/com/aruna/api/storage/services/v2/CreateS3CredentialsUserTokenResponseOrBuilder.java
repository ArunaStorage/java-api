// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/user_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface CreateS3CredentialsUserTokenResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.CreateS3CredentialsUserTokenResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string s3_access_key = 1 [json_name = "s3AccessKey"];</code>
   * @return The s3AccessKey.
   */
  java.lang.String getS3AccessKey();
  /**
   * <code>string s3_access_key = 1 [json_name = "s3AccessKey"];</code>
   * @return The bytes for s3AccessKey.
   */
  com.google.protobuf.ByteString
      getS3AccessKeyBytes();

  /**
   * <code>string s3_secret_key = 2 [json_name = "s3SecretKey"];</code>
   * @return The s3SecretKey.
   */
  java.lang.String getS3SecretKey();
  /**
   * <code>string s3_secret_key = 2 [json_name = "s3SecretKey"];</code>
   * @return The bytes for s3SecretKey.
   */
  com.google.protobuf.ByteString
      getS3SecretKeyBytes();

  /**
   * <code>string s3_endpoint_url = 3 [json_name = "s3EndpointUrl"];</code>
   * @return The s3EndpointUrl.
   */
  java.lang.String getS3EndpointUrl();
  /**
   * <code>string s3_endpoint_url = 3 [json_name = "s3EndpointUrl"];</code>
   * @return The bytes for s3EndpointUrl.
   */
  com.google.protobuf.ByteString
      getS3EndpointUrlBytes();
}
