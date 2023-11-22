// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/endpoint_service.proto

// Protobuf Java Version: 3.25.1
package com.aruna.api.storage.services.v2;

public interface GetEndpointsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.GetEndpointsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of endpoints
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Endpoint endpoints = 1 [json_name = "endpoints"];</code>
   */
  java.util.List<com.aruna.api.storage.models.v2.Endpoint> 
      getEndpointsList();
  /**
   * <pre>
   * List of endpoints
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Endpoint endpoints = 1 [json_name = "endpoints"];</code>
   */
  com.aruna.api.storage.models.v2.Endpoint getEndpoints(int index);
  /**
   * <pre>
   * List of endpoints
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Endpoint endpoints = 1 [json_name = "endpoints"];</code>
   */
  int getEndpointsCount();
  /**
   * <pre>
   * List of endpoints
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Endpoint endpoints = 1 [json_name = "endpoints"];</code>
   */
  java.util.List<? extends com.aruna.api.storage.models.v2.EndpointOrBuilder> 
      getEndpointsOrBuilderList();
  /**
   * <pre>
   * List of endpoints
   * </pre>
   *
   * <code>repeated .aruna.api.storage.models.v2.Endpoint endpoints = 1 [json_name = "endpoints"];</code>
   */
  com.aruna.api.storage.models.v2.EndpointOrBuilder getEndpointsOrBuilder(
      int index);
}
