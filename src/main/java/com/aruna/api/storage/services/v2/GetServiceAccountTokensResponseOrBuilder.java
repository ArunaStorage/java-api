// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/service_account_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface GetServiceAccountTokensResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.GetServiceAccountTokensResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This contains only the token description
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Token tokens = 1 [json_name = "tokens"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.Token> 
      getTokensList();
  /**
   * <pre>
   * This contains only the token description
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Token tokens = 1 [json_name = "tokens"];</code>
   */
  com.aruna.api.storage.models.v2.Token getTokens(int index);
  /**
   * <pre>
   * This contains only the token description
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Token tokens = 1 [json_name = "tokens"];</code>
   */
  int getTokensCount();
  /**
   * <pre>
   * This contains only the token description
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Token tokens = 1 [json_name = "tokens"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.TokenOrBuilder> 
      getTokensOrBuilderList();
  /**
   * <pre>
   * This contains only the token description
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Token tokens = 1 [json_name = "tokens"];</code>
   */
  com.aruna.api.storage.models.v2.TokenOrBuilder getTokensOrBuilder(
      int index);
}
