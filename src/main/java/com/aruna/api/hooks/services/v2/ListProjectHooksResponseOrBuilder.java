// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/hooks/services/v2/hooks_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.hooks.services.v2;

public interface ListProjectHooksResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.hooks.services.v2.ListProjectHooksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .aruna.api.hooks.services.v2.HookInfo infos = 1 [json_name = "infos"];</code>
   */
  java.util.List<com.aruna.api.hooks.services.v2.HookInfo> 
      getInfosList();
  /**
   * <code>repeated .aruna.api.hooks.services.v2.HookInfo infos = 1 [json_name = "infos"];</code>
   */
  com.aruna.api.hooks.services.v2.HookInfo getInfos(int index);
  /**
   * <code>repeated .aruna.api.hooks.services.v2.HookInfo infos = 1 [json_name = "infos"];</code>
   */
  int getInfosCount();
  /**
   * <code>repeated .aruna.api.hooks.services.v2.HookInfo infos = 1 [json_name = "infos"];</code>
   */
  java.util.List<? extends com.aruna.api.hooks.services.v2.HookInfoOrBuilder> 
      getInfosOrBuilderList();
  /**
   * <code>repeated .aruna.api.hooks.services.v2.HookInfo infos = 1 [json_name = "infos"];</code>
   */
  com.aruna.api.hooks.services.v2.HookInfoOrBuilder getInfosOrBuilder(
      int index);
}
