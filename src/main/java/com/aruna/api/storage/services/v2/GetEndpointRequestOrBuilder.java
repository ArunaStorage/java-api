// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/endpoint_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.storage.services.v2;

public interface GetEndpointRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.GetEndpointRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the endpoint
   * </pre>
   *
   * <code>string endpoint_name = 1 [json_name = "endpointName"];</code>
   * @return Whether the endpointName field is set.
   */
  boolean hasEndpointName();
  /**
   * <pre>
   * The name of the endpoint
   * </pre>
   *
   * <code>string endpoint_name = 1 [json_name = "endpointName"];</code>
   * @return The endpointName.
   */
  java.lang.String getEndpointName();
  /**
   * <pre>
   * The name of the endpoint
   * </pre>
   *
   * <code>string endpoint_name = 1 [json_name = "endpointName"];</code>
   * @return The bytes for endpointName.
   */
  com.google.protobuf.ByteString
      getEndpointNameBytes();

  /**
   * <pre>
   * Id of the endpoint
   * </pre>
   *
   * <code>string endpoint_id = 2 [json_name = "endpointId"];</code>
   * @return Whether the endpointId field is set.
   */
  boolean hasEndpointId();
  /**
   * <pre>
   * Id of the endpoint
   * </pre>
   *
   * <code>string endpoint_id = 2 [json_name = "endpointId"];</code>
   * @return The endpointId.
   */
  java.lang.String getEndpointId();
  /**
   * <pre>
   * Id of the endpoint
   * </pre>
   *
   * <code>string endpoint_id = 2 [json_name = "endpointId"];</code>
   * @return The bytes for endpointId.
   */
  com.google.protobuf.ByteString
      getEndpointIdBytes();

  com.aruna.api.storage.services.v2.GetEndpointRequest.EndpointCase getEndpointCase();
}
