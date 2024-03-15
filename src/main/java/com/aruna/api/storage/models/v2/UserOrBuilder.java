// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.models.v2;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.models.v2.User)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Internal Aruna UserID
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Internal Aruna UserID
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * (optional) User display_name
   * </pre>
   *
   * <code>string display_name = 3 [json_name = "displayName"];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * (optional) User display_name
   * </pre>
   *
   * <code>string display_name = 3 [json_name = "displayName"];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Is the user activated
   * </pre>
   *
   * <code>bool active = 4 [json_name = "active"];</code>
   * @return The active.
   */
  boolean getActive();

  /**
   * <pre>
   * User email (empty if service account)
   * </pre>
   *
   * <code>string email = 5 [json_name = "email"];</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <pre>
   * User email (empty if service account)
   * </pre>
   *
   * <code>string email = 5 [json_name = "email"];</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <pre>
   * User attributes
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.UserAttributes attributes = 6 [json_name = "attributes"];</code>
   * @return Whether the attributes field is set.
   */
  boolean hasAttributes();
  /**
   * <pre>
   * User attributes
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.UserAttributes attributes = 6 [json_name = "attributes"];</code>
   * @return The attributes.
   */
  com.aruna.api.storage.models.v2.UserAttributes getAttributes();
  /**
   * <pre>
   * User attributes
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.UserAttributes attributes = 6 [json_name = "attributes"];</code>
   */
  com.aruna.api.storage.models.v2.UserAttributesOrBuilder getAttributesOrBuilder();

  /**
   * <pre>
   * First and Last name
   * </pre>
   *
   * <code>string first_name = 7 [json_name = "firstName"];</code>
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   * <pre>
   * First and Last name
   * </pre>
   *
   * <code>string first_name = 7 [json_name = "firstName"];</code>
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string last_name = 8 [json_name = "lastName"];</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <code>string last_name = 8 [json_name = "lastName"];</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();
}
