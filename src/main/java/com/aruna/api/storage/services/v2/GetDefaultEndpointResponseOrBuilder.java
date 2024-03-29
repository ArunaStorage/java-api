// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/endpoint_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface GetDefaultEndpointResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.GetDefaultEndpointResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Default endpoint of the server instance
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Endpoint endpoint = 1 [json_name = "endpoint"];</code>
   * @return Whether the endpoint field is set.
   */
  boolean hasEndpoint();
  /**
   * <pre>
   * Default endpoint of the server instance
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Endpoint endpoint = 1 [json_name = "endpoint"];</code>
   * @return The endpoint.
   */
  com.aruna.api.storage.models.v2.Endpoint getEndpoint();
  /**
   * <pre>
   * Default endpoint of the server instance
   * </pre>
   *
   * <code>.aruna.api.storage.models.v2.Endpoint endpoint = 1 [json_name = "endpoint"];</code>
   */
  com.aruna.api.storage.models.v2.EndpointOrBuilder getEndpointOrBuilder();
}
