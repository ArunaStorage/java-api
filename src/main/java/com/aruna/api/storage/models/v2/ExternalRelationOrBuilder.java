// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.models.v2;

public interface ExternalRelationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.models.v2.ExternalRelation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string identifier = 1 [json_name = "identifier"];</code>
   * @return The identifier.
   */
  java.lang.String getIdentifier();
  /**
   * <code>string identifier = 1 [json_name = "identifier"];</code>
   * @return The bytes for identifier.
   */
  com.google.protobuf.ByteString
      getIdentifierBytes();

  /**
   * <code>.aruna.api.storage.models.v2.ExternalRelationVariant defined_variant = 2 [json_name = "definedVariant"];</code>
   * @return The enum numeric value on the wire for definedVariant.
   */
  int getDefinedVariantValue();
  /**
   * <code>.aruna.api.storage.models.v2.ExternalRelationVariant defined_variant = 2 [json_name = "definedVariant"];</code>
   * @return The definedVariant.
   */
  com.aruna.api.storage.models.v2.ExternalRelationVariant getDefinedVariant();

  /**
   * <pre>
   * Will only be filled if defined_variant == CUSTOM
   * </pre>
   *
   * <code>optional string custom_variant = 3 [json_name = "customVariant"];</code>
   * @return Whether the customVariant field is set.
   */
  boolean hasCustomVariant();
  /**
   * <pre>
   * Will only be filled if defined_variant == CUSTOM
   * </pre>
   *
   * <code>optional string custom_variant = 3 [json_name = "customVariant"];</code>
   * @return The customVariant.
   */
  java.lang.String getCustomVariant();
  /**
   * <pre>
   * Will only be filled if defined_variant == CUSTOM
   * </pre>
   *
   * <code>optional string custom_variant = 3 [json_name = "customVariant"];</code>
   * @return The bytes for customVariant.
   */
  com.google.protobuf.ByteString
      getCustomVariantBytes();
}
