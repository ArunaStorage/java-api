// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/dataproxy/services/v2/dataproxy_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.dataproxy.services.v2;

public interface RequestReplicationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.dataproxy.services.v2.RequestReplicationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aruna.api.dataproxy.services.v2.DataProxyInfo info = 1 [json_name = "info"];</code>
   * @return Whether the info field is set.
   */
  boolean hasInfo();
  /**
   * <code>.aruna.api.dataproxy.services.v2.DataProxyInfo info = 1 [json_name = "info"];</code>
   * @return The info.
   */
  com.aruna.api.dataproxy.services.v2.DataProxyInfo getInfo();
  /**
   * <code>.aruna.api.dataproxy.services.v2.DataProxyInfo info = 1 [json_name = "info"];</code>
   */
  com.aruna.api.dataproxy.services.v2.DataProxyInfoOrBuilder getInfoOrBuilder();

  /**
   * <code>bool user_initialized = 2 [json_name = "userInitialized"];</code>
   * @return The userInitialized.
   */
  boolean getUserInitialized();
}
