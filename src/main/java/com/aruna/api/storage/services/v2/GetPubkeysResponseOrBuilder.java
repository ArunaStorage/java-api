// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/info_service.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.storage.services.v2;

public interface GetPubkeysResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.GetPubkeysResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.Pubkey> 
      getPubkeysList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
   */
  com.aruna.api.storage.models.v2.Pubkey getPubkeys(int index);
  /**
   * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
   */
  int getPubkeysCount();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.PubkeyOrBuilder> 
      getPubkeysOrBuilderList();
  /**
   * <code>repeated .aruna.api.storage.models.v2.Pubkey pubkeys = 1 [json_name = "pubkeys"];</code>
   */
  com.aruna.api.storage.models.v2.PubkeyOrBuilder getPubkeysOrBuilder(
      int index);
}
