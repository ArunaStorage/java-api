// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/dataproxy/services/v2/dataproxy_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.dataproxy.services.v2;

public interface RequestReplicationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.dataproxy.services.v2.RequestReplicationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aruna.api.dataproxy.services.v2.DataInfos data_infos = 1 [json_name = "dataInfos"];</code>
   * @return Whether the dataInfos field is set.
   */
  boolean hasDataInfos();
  /**
   * <code>.aruna.api.dataproxy.services.v2.DataInfos data_infos = 1 [json_name = "dataInfos"];</code>
   * @return The dataInfos.
   */
  com.aruna.api.dataproxy.services.v2.DataInfos getDataInfos();
  /**
   * <code>.aruna.api.dataproxy.services.v2.DataInfos data_infos = 1 [json_name = "dataInfos"];</code>
   */
  com.aruna.api.dataproxy.services.v2.DataInfosOrBuilder getDataInfosOrBuilder();

  /**
   * <code>bool ack = 2 [json_name = "ack"];</code>
   * @return Whether the ack field is set.
   */
  boolean hasAck();
  /**
   * <code>bool ack = 2 [json_name = "ack"];</code>
   * @return The ack.
   */
  boolean getAck();

  com.aruna.api.dataproxy.services.v2.RequestReplicationResponse.ResponseCase getResponseCase();
}
