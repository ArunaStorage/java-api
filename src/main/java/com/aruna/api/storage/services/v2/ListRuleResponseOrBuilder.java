// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/rules_service.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.storage.services.v2;

public interface ListRuleResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.ListRuleResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .aruna.api.storage.services.v2.Rule rules = 1 [json_name = "rules"];</code>
   */
  java.util.List<com.aruna.api.storage.services.v2.Rule> 
      getRulesList();
  /**
   * <code>repeated .aruna.api.storage.services.v2.Rule rules = 1 [json_name = "rules"];</code>
   */
  com.aruna.api.storage.services.v2.Rule getRules(int index);
  /**
   * <code>repeated .aruna.api.storage.services.v2.Rule rules = 1 [json_name = "rules"];</code>
   */
  int getRulesCount();
  /**
   * <code>repeated .aruna.api.storage.services.v2.Rule rules = 1 [json_name = "rules"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.services.v2.RuleOrBuilder> 
      getRulesOrBuilderList();
  /**
   * <code>repeated .aruna.api.storage.services.v2.Rule rules = 1 [json_name = "rules"];</code>
   */
  com.aruna.api.storage.services.v2.RuleOrBuilder getRulesOrBuilder(
      int index);
}