// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/license_service.proto

// Protobuf Java Version: 3.25.1
package com.aruna.api.storage.services.v2;

public final class LicenseServiceProto {
  private LicenseServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_CreateLicenseRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_CreateLicenseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_CreateLicenseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_CreateLicenseResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_GetLicenseRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_GetLicenseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_GetLicenseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_GetLicenseResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_ListLicensesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_ListLicensesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_ListLicensesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_ListLicensesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3aruna/api/storage/services/v2/license_" +
      "service.proto\022\035aruna.api.storage.service" +
      "s.v2\032(aruna/api/storage/models/v2/models" +
      ".proto\032\034google/api/annotations.proto\032\033go" +
      "ogle/api/visibility.proto\"b\n\024CreateLicen" +
      "seRequest\022\020\n\003tag\030\001 \001(\tR\003tag\022\022\n\004name\030\002 \001(" +
      "\tR\004name\022\022\n\004text\030\003 \001(\tR\004text\022\020\n\003url\030\004 \001(\t" +
      "R\003url\")\n\025CreateLicenseResponse\022\020\n\003tag\030\001 " +
      "\001(\tR\003tag\"%\n\021GetLicenseRequest\022\020\n\003tag\030\001 \001" +
      "(\tR\003tag\"T\n\022GetLicenseResponse\022>\n\007license" +
      "\030\001 \001(\0132$.aruna.api.storage.models.v2.Lic" +
      "enseR\007license\"\025\n\023ListLicensesRequest\"X\n\024" +
      "ListLicensesResponse\022@\n\010licenses\030\001 \003(\0132$" +
      ".aruna.api.storage.models.v2.LicenseR\010li" +
      "censes2\326\003\n\016LicenseService\022\223\001\n\rCreateLice" +
      "nse\0223.aruna.api.storage.services.v2.Crea" +
      "teLicenseRequest\0324.aruna.api.storage.ser" +
      "vices.v2.CreateLicenseResponse\"\027\202\323\344\223\002\021\"\014" +
      "/v2/licenses:\001*\022\215\001\n\nGetLicense\0220.aruna.a" +
      "pi.storage.services.v2.GetLicenseRequest" +
      "\0321.aruna.api.storage.services.v2.GetLice" +
      "nseResponse\"\032\202\323\344\223\002\024\022\022/v2/licenses/{tag}\022" +
      "\215\001\n\014ListLicenses\0222.aruna.api.storage.ser" +
      "vices.v2.ListLicensesRequest\0323.aruna.api" +
      ".storage.services.v2.ListLicensesRespons" +
      "e\"\024\202\323\344\223\002\016\022\014/v2/licenses\032\016\372\322\344\223\002\010\022\006SERVERB" +
      "\222\002\n!com.aruna.api.storage.services.v2B\023L" +
      "icenseServiceProtoP\001Z?github.com/ArunaSt" +
      "orage/go-api/v2/aruna/api/storage/servic" +
      "es/v2\242\002\004AASS\252\002\035Aruna.Api.Storage.Service" +
      "s.V2\312\002\035Aruna\\Api\\Storage\\Services\\V2\342\002)A" +
      "runa\\Api\\Storage\\Services\\V2\\GPBMetadata" +
      "\352\002!Aruna::Api::Storage::Services::V2b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.aruna.api.storage.models.v2.ModelsProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.VisibilityProto.getDescriptor(),
        });
    internal_static_aruna_api_storage_services_v2_CreateLicenseRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aruna_api_storage_services_v2_CreateLicenseRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_CreateLicenseRequest_descriptor,
        new java.lang.String[] { "Tag", "Name", "Text", "Url", });
    internal_static_aruna_api_storage_services_v2_CreateLicenseResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_aruna_api_storage_services_v2_CreateLicenseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_CreateLicenseResponse_descriptor,
        new java.lang.String[] { "Tag", });
    internal_static_aruna_api_storage_services_v2_GetLicenseRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_aruna_api_storage_services_v2_GetLicenseRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_GetLicenseRequest_descriptor,
        new java.lang.String[] { "Tag", });
    internal_static_aruna_api_storage_services_v2_GetLicenseResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_aruna_api_storage_services_v2_GetLicenseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_GetLicenseResponse_descriptor,
        new java.lang.String[] { "License", });
    internal_static_aruna_api_storage_services_v2_ListLicensesRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_aruna_api_storage_services_v2_ListLicensesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_ListLicensesRequest_descriptor,
        new java.lang.String[] { });
    internal_static_aruna_api_storage_services_v2_ListLicensesResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_aruna_api_storage_services_v2_ListLicensesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_ListLicensesResponse_descriptor,
        new java.lang.String[] { "Licenses", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.VisibilityProto.apiVisibility);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.aruna.api.storage.models.v2.ModelsProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.VisibilityProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
