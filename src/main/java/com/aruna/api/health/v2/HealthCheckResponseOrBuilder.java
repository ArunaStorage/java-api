// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/health/v2/health.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.health.v2;

public interface HealthCheckResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.health.v2.HealthCheckResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aruna.api.health.v2.HealthCheckResponse.ServingStatus status = 1 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.aruna.api.health.v2.HealthCheckResponse.ServingStatus status = 1 [json_name = "status"];</code>
   * @return The status.
   */
  com.aruna.api.health.v2.HealthCheckResponse.ServingStatus getStatus();
}
