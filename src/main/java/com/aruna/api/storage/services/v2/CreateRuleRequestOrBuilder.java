// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/rules_service.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.storage.services.v2;

public interface CreateRuleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.CreateRuleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string rule = 1 [json_name = "rule"];</code>
   * @return The rule.
   */
  java.lang.String getRule();
  /**
   * <code>string rule = 1 [json_name = "rule"];</code>
   * @return The bytes for rule.
   */
  com.google.protobuf.ByteString
      getRuleBytes();

  /**
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>bool public = 3 [json_name = "public"];</code>
   * @return The public.
   */
  boolean getPublic();
}
