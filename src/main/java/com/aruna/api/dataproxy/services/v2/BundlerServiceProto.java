// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/dataproxy/services/v2/bundler_service.proto

// Protobuf Java Version: 3.25.1
package com.aruna.api.dataproxy.services.v2;

public final class BundlerServiceProto {
  private BundlerServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_dataproxy_services_v2_CreateBundleRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_dataproxy_services_v2_CreateBundleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_dataproxy_services_v2_CreateBundleResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_dataproxy_services_v2_CreateBundleResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_dataproxy_services_v2_DeleteBundleRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_dataproxy_services_v2_DeleteBundleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_dataproxy_services_v2_DeleteBundleResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_dataproxy_services_v2_DeleteBundleResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5aruna/api/dataproxy/services/v2/bundle" +
      "r_service.proto\022\037aruna.api.dataproxy.ser" +
      "vices.v2\032\037google/protobuf/timestamp.prot" +
      "o\032\033google/api/visibility.proto\032\034google/a" +
      "pi/annotations.proto\"\217\001\n\023CreateBundleReq" +
      "uest\022!\n\014resource_ids\030\001 \003(\tR\013resourceIds\022" +
      "\032\n\010filename\030\002 \001(\tR\010filename\0229\n\nexpires_a" +
      "t\030\003 \001(\0132\032.google.protobuf.TimestampR\texp" +
      "iresAt\"R\n\024CreateBundleResponse\022\033\n\tbundle" +
      "_id\030\001 \001(\tR\010bundleId\022\035\n\nbundle_url\030\002 \001(\tR" +
      "\tbundleUrl\"2\n\023DeleteBundleRequest\022\033\n\tbun" +
      "dle_id\030\001 \001(\tR\010bundleId\"\026\n\024DeleteBundleRe" +
      "sponse2\327\002\n\016BundlerService\022\223\001\n\014CreateBund" +
      "le\0224.aruna.api.dataproxy.services.v2.Cre" +
      "ateBundleRequest\0325.aruna.api.dataproxy.s" +
      "ervices.v2.CreateBundleResponse\"\026\202\323\344\223\002\020\"" +
      "\013/v2/bundles:\001*\022\237\001\n\014DeleteBundle\0224.aruna" +
      ".api.dataproxy.services.v2.DeleteBundleR" +
      "equest\0325.aruna.api.dataproxy.services.v2" +
      ".DeleteBundleResponse\"\"\202\323\344\223\002\034*\027/v2/bundl" +
      "es/{bundle_id}:\001*\032\r\372\322\344\223\002\007\022\005PROXYB\233\002\n#com" +
      ".aruna.api.dataproxy.services.v2B\023Bundle" +
      "rServiceProtoP\001Z>github.com/ArunaStorage" +
      "/go-api/aruna/api/dataproxy/services/v2\242" +
      "\002\004AADS\252\002\037Aruna.Api.Dataproxy.Services.V2" +
      "\312\002\037Aruna\\Api\\Dataproxy\\Services\\V2\342\002+Aru" +
      "na\\Api\\Dataproxy\\Services\\V2\\GPBMetadata" +
      "\352\002#Aruna::Api::Dataproxy::Services::V2b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.VisibilityProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_aruna_api_dataproxy_services_v2_CreateBundleRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aruna_api_dataproxy_services_v2_CreateBundleRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_dataproxy_services_v2_CreateBundleRequest_descriptor,
        new java.lang.String[] { "ResourceIds", "Filename", "ExpiresAt", });
    internal_static_aruna_api_dataproxy_services_v2_CreateBundleResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_aruna_api_dataproxy_services_v2_CreateBundleResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_dataproxy_services_v2_CreateBundleResponse_descriptor,
        new java.lang.String[] { "BundleId", "BundleUrl", });
    internal_static_aruna_api_dataproxy_services_v2_DeleteBundleRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_aruna_api_dataproxy_services_v2_DeleteBundleRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_dataproxy_services_v2_DeleteBundleRequest_descriptor,
        new java.lang.String[] { "BundleId", });
    internal_static_aruna_api_dataproxy_services_v2_DeleteBundleResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_aruna_api_dataproxy_services_v2_DeleteBundleResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_dataproxy_services_v2_DeleteBundleResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.VisibilityProto.apiVisibility);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.VisibilityProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
