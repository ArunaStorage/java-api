// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/data_replication_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.storage.services.v2;

public interface ReplicateProjectDataResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.ReplicateProjectDataResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aruna.api.storage.models.v2.ReplicationStatus status = 1 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.aruna.api.storage.models.v2.ReplicationStatus status = 1 [json_name = "status"];</code>
   * @return The status.
   */
  com.aruna.api.storage.models.v2.ReplicationStatus getStatus();
}
