// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/license_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.services.v2;

public interface GetLicenseResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aruna.api.storage.services.v2.GetLicenseResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aruna.api.storage.models.v2.License license = 1 [json_name = "license"];</code>
   * @return Whether the license field is set.
   */
  boolean hasLicense();
  /**
   * <code>.aruna.api.storage.models.v2.License license = 1 [json_name = "license"];</code>
   * @return The license.
   */
  com.aruna.api.storage.models.v2.License getLicense();
  /**
   * <code>.aruna.api.storage.models.v2.License license = 1 [json_name = "license"];</code>
   */
  com.aruna.api.storage.models.v2.LicenseOrBuilder getLicenseOrBuilder();
}
