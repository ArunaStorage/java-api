// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/user_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.services.v2;

public interface CreateAPITokenResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.CreateAPITokenResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This contains only the token description
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Token token = 1 [json_name = "token"];</code>
   * @return Whether the token field is set.
   */
  boolean hasToken();
  /**
   * <pre>
   * This contains only the token description
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Token token = 1 [json_name = "token"];</code>
   * @return The token.
   */
  com.aruna.api.storage.models.v2.Token getToken();
  /**
   * <pre>
   * This contains only the token description
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Token token = 1 [json_name = "token"];</code>
   */
  com.aruna.api.storage.models.v2.TokenOrBuilder getTokenOrBuilder();

  /**
   * <pre>
   * This is the actual secret token
   * Attention, this can not be recreated and needs to be stored securely
   * New tokens will always contain a new secret
   * </pre>
   *
   * <code>string token_secret = 2 [json_name = "tokenSecret"];</code>
   * @return The tokenSecret.
   */
  java.lang.String getTokenSecret();
  /**
   * <pre>
   * This is the actual secret token
   * Attention, this can not be recreated and needs to be stored securely
   * New tokens will always contain a new secret
   * </pre>
   *
   * <code>string token_secret = 2 [json_name = "tokenSecret"];</code>
   * @return The bytes for tokenSecret.
   */
  com.google.protobuf.ByteString
      getTokenSecretBytes();
}
