// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/models/v2/models.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.models.v2;

public interface HashOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.models.v2.Hash)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aruna.api.storage.models.v2.Hashalgorithm alg = 1 [json_name = "alg"];</code>
   * @return The enum numeric value on the wire for alg.
   */
  int getAlgValue();
  /**
   * <code>.aruna.api.storage.models.v2.Hashalgorithm alg = 1 [json_name = "alg"];</code>
   * @return The alg.
   */
  com.aruna.api.storage.models.v2.Hashalgorithm getAlg();

  /**
   * <code>string hash = 2 [json_name = "hash"];</code>
   * @return The hash.
   */
  java.lang.String getHash();
  /**
   * <code>string hash = 2 [json_name = "hash"];</code>
   * @return The bytes for hash.
   */
  com.google.protobuf.ByteString
      getHashBytes();
}
