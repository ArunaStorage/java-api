// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/project_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public interface UpdateProjectDataClassRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.UpdateProjectDataClassRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string project_id = 1 [json_name = "projectId"];</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <code>string project_id = 1 [json_name = "projectId"];</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <code>.aruna.api.storage.models.v2.DataClass data_class = 2 [json_name = "dataClass"];</code>
   * @return The enum numeric value on the wire for dataClass.
   */
  int getDataClassValue();
  /**
   * <code>.aruna.api.storage.models.v2.DataClass data_class = 2 [json_name = "dataClass"];</code>
   * @return The dataClass.
   */
  com.aruna.api.storage.models.v2.DataClass getDataClass();
}
