// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.models.v2;

public interface LicenseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.models.v2.License)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * CC-BY-SA-4.0
   * </pre>
   *
   * <code>string tag = 1 [json_name = "tag"];</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <pre>
   * CC-BY-SA-4.0
   * </pre>
   *
   * <code>string tag = 1 [json_name = "tag"];</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();

  /**
   * <pre>
   * Creative Commons Attribution-ShareAlike 4.0 International
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Creative Commons Attribution-ShareAlike 4.0 International
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string text = 3 [json_name = "text"];</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <code>string text = 3 [json_name = "text"];</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * url is optional
   * </pre>
   *
   * <code>string url = 4 [json_name = "url"];</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * url is optional
   * </pre>
   *
   * <code>string url = 4 [json_name = "url"];</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();
}