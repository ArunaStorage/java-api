// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sciobjsdb/api/storage/models/v1/common_models.proto

package com.github.ScienceObjectsDB.java_api.sciobjsdb.api.storage.models.v1;

public interface PageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sciobjsdb.api.storage.models.v1.PageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string last_uuid = 1 [json_name = "lastUuid"];</code>
   * @return The lastUuid.
   */
  java.lang.String getLastUuid();
  /**
   * <code>string last_uuid = 1 [json_name = "lastUuid"];</code>
   * @return The bytes for lastUuid.
   */
  com.google.protobuf.ByteString
      getLastUuidBytes();

  /**
   * <code>uint64 page_size = 2 [json_name = "pageSize"];</code>
   * @return The pageSize.
   */
  long getPageSize();
}
