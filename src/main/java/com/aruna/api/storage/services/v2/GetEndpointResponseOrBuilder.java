// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/endpoint_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.storage.services.v2;

public interface GetEndpointResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.GetEndpointResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Overview of the requested endpoint
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Endpoint endpoint = 1 [json_name = "endpoint"];</code>
   * @return Whether the endpoint field is set.
   */
  boolean hasEndpoint();
  /**
   * <pre>
   * Overview of the requested endpoint
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Endpoint endpoint = 1 [json_name = "endpoint"];</code>
   * @return The endpoint.
   */
  com.aruna.api.storage.models.v2.Endpoint getEndpoint();
  /**
   * <pre>
   * Overview of the requested endpoint
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Endpoint endpoint = 1 [json_name = "endpoint"];</code>
   */
  com.aruna.api.storage.models.v2.EndpointOrBuilder getEndpointOrBuilder();
}
