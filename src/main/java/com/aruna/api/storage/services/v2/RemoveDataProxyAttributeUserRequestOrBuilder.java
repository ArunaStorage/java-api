// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/user_service.proto

// Protobuf Java Version: 4.26.0
package com.aruna.api.storage.services.v2;

public interface RemoveDataProxyAttributeUserRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.RemoveDataProxyAttributeUserRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>string dataproxy_id = 2 [json_name = "dataproxyId"];</code>
   * @return The dataproxyId.
   */
  java.lang.String getDataproxyId();
  /**
   * <code>string dataproxy_id = 2 [json_name = "dataproxyId"];</code>
   * @return The bytes for dataproxyId.
   */
  com.google.protobuf.ByteString
      getDataproxyIdBytes();

  /**
   * <code>string attribute_name = 3 [json_name = "attributeName"];</code>
   * @return The attributeName.
   */
  java.lang.String getAttributeName();
  /**
   * <code>string attribute_name = 3 [json_name = "attributeName"];</code>
   * @return The bytes for attributeName.
   */
  com.google.protobuf.ByteString
      getAttributeNameBytes();
}
