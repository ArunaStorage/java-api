// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/endpoint_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.storage.services.v2;

public interface SetEndpointStatusResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.SetEndpointStatusResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aruna.api.storage.models.v2.Endpoint endpoint = 1 [json_name = "endpoint"];</code>
   * @return Whether the endpoint field is set.
   */
  boolean hasEndpoint();
  /**
   * <code>.aruna.api.storage.models.v2.Endpoint endpoint = 1 [json_name = "endpoint"];</code>
   * @return The endpoint.
   */
  com.aruna.api.storage.models.v2.Endpoint getEndpoint();
  /**
   * <code>.aruna.api.storage.models.v2.Endpoint endpoint = 1 [json_name = "endpoint"];</code>
   */
  com.aruna.api.storage.models.v2.EndpointOrBuilder getEndpointOrBuilder();
}
