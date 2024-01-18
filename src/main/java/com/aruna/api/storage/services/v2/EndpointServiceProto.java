// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/endpoint_service.proto

// Protobuf Java Version: 3.25.2
package com.aruna.api.storage.services.v2;

public final class EndpointServiceProto {
  private EndpointServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_CreateEndpointRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_CreateEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_CreateEndpointResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_CreateEndpointResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_FullSyncEndpointRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_FullSyncEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_FullSyncEndpointResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_FullSyncEndpointResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_GetEndpointRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_GetEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_GetEndpointResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_GetEndpointResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_GetEndpointsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_GetEndpointsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_GetEndpointsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_GetEndpointsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_DeleteEndpointRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_DeleteEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_DeleteEndpointResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_DeleteEndpointResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_GetDefaultEndpointRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_GetDefaultEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_GetDefaultEndpointResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_GetDefaultEndpointResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_SetEndpointStatusRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_SetEndpointStatusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_SetEndpointStatusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_SetEndpointStatusResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4aruna/api/storage/services/v2/endpoint" +
      "_service.proto\022\035aruna.api.storage.servic" +
      "es.v2\032(aruna/api/storage/models/v2/model" +
      "s.proto\032\034google/api/annotations.proto\"\201\002" +
      "\n\025CreateEndpointRequest\022\022\n\004name\030\001 \001(\tR\004n" +
      "ame\022K\n\nep_variant\030\002 \001(\0162,.aruna.api.stor" +
      "age.models.v2.EndpointVariantR\tepVariant" +
      "\022\033\n\tis_public\030\003 \001(\010R\010isPublic\022\026\n\006pubkey\030" +
      "\004 \001(\tR\006pubkey\022R\n\014host_configs\030\005 \003(\0132/.ar" +
      "una.api.storage.models.v2.EndpointHostCo" +
      "nfigR\013hostConfigs\"[\n\026CreateEndpointRespo" +
      "nse\022A\n\010endpoint\030\001 \001(\0132%.aruna.api.storag" +
      "e.models.v2.EndpointR\010endpoint\"\031\n\027FullSy" +
      "ncEndpointRequest\"\367\001\n\030FullSyncEndpointRe" +
      "sponse\022Y\n\020generic_resource\030\001 \001(\0132,.aruna" +
      ".api.storage.models.v2.GenericResourceH\000" +
      "R\017genericResource\0227\n\004user\030\002 \001(\0132!.aruna." +
      "api.storage.models.v2.UserH\000R\004user\022=\n\006pu" +
      "bkey\030\003 \001(\0132#.aruna.api.storage.models.v2" +
      ".PubkeyH\000R\006pubkeyB\010\n\006target\"j\n\022GetEndpoi" +
      "ntRequest\022%\n\rendpoint_name\030\001 \001(\tH\000R\014endp" +
      "ointName\022!\n\013endpoint_id\030\002 \001(\tH\000R\nendpoin" +
      "tIdB\n\n\010endpoint\"X\n\023GetEndpointResponse\022A" +
      "\n\010endpoint\030\001 \001(\0132%.aruna.api.storage.mod" +
      "els.v2.EndpointR\010endpoint\"\025\n\023GetEndpoint" +
      "sRequest\"[\n\024GetEndpointsResponse\022C\n\tendp" +
      "oints\030\001 \003(\0132%.aruna.api.storage.models.v" +
      "2.EndpointR\tendpoints\"8\n\025DeleteEndpointR" +
      "equest\022\037\n\013endpoint_id\030\001 \001(\tR\nendpointId\"" +
      "\030\n\026DeleteEndpointResponse\"\033\n\031GetDefaultE" +
      "ndpointRequest\"_\n\032GetDefaultEndpointResp" +
      "onse\022A\n\010endpoint\030\001 \001(\0132%.aruna.api.stora" +
      "ge.models.v2.EndpointR\010endpoint\"\201\001\n\030SetE" +
      "ndpointStatusRequest\022\037\n\013endpoint_id\030\001 \001(" +
      "\tR\nendpointId\022D\n\006status\030\002 \001(\0162,.aruna.ap" +
      "i.storage.models.v2.ComponentStatusR\006sta" +
      "tus\"^\n\031SetEndpointStatusResponse\022A\n\010endp" +
      "oint\030\001 \001(\0132%.aruna.api.storage.models.v2" +
      ".EndpointR\010endpoint2\201\t\n\017EndpointService\022" +
      "\227\001\n\016CreateEndpoint\0224.aruna.api.storage.s" +
      "ervices.v2.CreateEndpointRequest\0325.aruna" +
      ".api.storage.services.v2.CreateEndpointR" +
      "esponse\"\030\202\323\344\223\002\022\"\r/v2/endpoints:\001*\022\241\001\n\020Fu" +
      "llSyncEndpoint\0226.aruna.api.storage.servi" +
      "ces.v2.FullSyncEndpointRequest\0327.aruna.a" +
      "pi.storage.services.v2.FullSyncEndpointR" +
      "esponse\"\032\202\323\344\223\002\024\022\022/v2/endpoints/sync0\001\022\262\001" +
      "\n\021SetEndpointStatus\0227.aruna.api.storage." +
      "services.v2.SetEndpointStatusRequest\0328.a" +
      "runa.api.storage.services.v2.SetEndpoint" +
      "StatusResponse\"*\202\323\344\223\002$2\"/v2/endpoints/{e" +
      "ndpoint_id}/status\022\231\001\n\013GetEndpoint\0221.aru" +
      "na.api.storage.services.v2.GetEndpointRe" +
      "quest\0322.aruna.api.storage.services.v2.Ge" +
      "tEndpointResponse\"#\202\323\344\223\002\035\022\033/v2/endpoints" +
      "/{endpoint_id}\022\216\001\n\014GetEndpoints\0222.aruna." +
      "api.storage.services.v2.GetEndpointsRequ" +
      "est\0323.aruna.api.storage.services.v2.GetE" +
      "ndpointsResponse\"\025\202\323\344\223\002\017\022\r/v2/endpoints\022" +
      "\242\001\n\016DeleteEndpoint\0224.aruna.api.storage.s" +
      "ervices.v2.DeleteEndpointRequest\0325.aruna" +
      ".api.storage.services.v2.DeleteEndpointR" +
      "esponse\"#\202\323\344\223\002\035*\033/v2/endpoints/{endpoint" +
      "_id}\022\250\001\n\022GetDefaultEndpoint\0228.aruna.api." +
      "storage.services.v2.GetDefaultEndpointRe" +
      "quest\0329.aruna.api.storage.services.v2.Ge" +
      "tDefaultEndpointResponse\"\035\202\323\344\223\002\027\022\025/v2/en" +
      "dpoints/defaultB\223\002\n!com.aruna.api.storag" +
      "e.services.v2B\024EndpointServiceProtoP\001Z?g" +
      "ithub.com/ArunaStorage/go-api/v2/aruna/a" +
      "pi/storage/services/v2\242\002\004AASS\252\002\035Aruna.Ap" +
      "i.Storage.Services.V2\312\002\035Aruna\\Api\\Storag" +
      "e\\Services\\V2\342\002)Aruna\\Api\\Storage\\Servic" +
      "es\\V2\\GPBMetadata\352\002!Aruna::Api::Storage:" +
      ":Services::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.aruna.api.storage.models.v2.ModelsProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_aruna_api_storage_services_v2_CreateEndpointRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aruna_api_storage_services_v2_CreateEndpointRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_CreateEndpointRequest_descriptor,
        new java.lang.String[] { "Name", "EpVariant", "IsPublic", "Pubkey", "HostConfigs", });
    internal_static_aruna_api_storage_services_v2_CreateEndpointResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_aruna_api_storage_services_v2_CreateEndpointResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_CreateEndpointResponse_descriptor,
        new java.lang.String[] { "Endpoint", });
    internal_static_aruna_api_storage_services_v2_FullSyncEndpointRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_aruna_api_storage_services_v2_FullSyncEndpointRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_FullSyncEndpointRequest_descriptor,
        new java.lang.String[] { });
    internal_static_aruna_api_storage_services_v2_FullSyncEndpointResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_aruna_api_storage_services_v2_FullSyncEndpointResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_FullSyncEndpointResponse_descriptor,
        new java.lang.String[] { "GenericResource", "User", "Pubkey", "Target", });
    internal_static_aruna_api_storage_services_v2_GetEndpointRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_aruna_api_storage_services_v2_GetEndpointRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_GetEndpointRequest_descriptor,
        new java.lang.String[] { "EndpointName", "EndpointId", "Endpoint", });
    internal_static_aruna_api_storage_services_v2_GetEndpointResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_aruna_api_storage_services_v2_GetEndpointResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_GetEndpointResponse_descriptor,
        new java.lang.String[] { "Endpoint", });
    internal_static_aruna_api_storage_services_v2_GetEndpointsRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_aruna_api_storage_services_v2_GetEndpointsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_GetEndpointsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_aruna_api_storage_services_v2_GetEndpointsResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_aruna_api_storage_services_v2_GetEndpointsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_GetEndpointsResponse_descriptor,
        new java.lang.String[] { "Endpoints", });
    internal_static_aruna_api_storage_services_v2_DeleteEndpointRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_aruna_api_storage_services_v2_DeleteEndpointRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_DeleteEndpointRequest_descriptor,
        new java.lang.String[] { "EndpointId", });
    internal_static_aruna_api_storage_services_v2_DeleteEndpointResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_aruna_api_storage_services_v2_DeleteEndpointResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_DeleteEndpointResponse_descriptor,
        new java.lang.String[] { });
    internal_static_aruna_api_storage_services_v2_GetDefaultEndpointRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_aruna_api_storage_services_v2_GetDefaultEndpointRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_GetDefaultEndpointRequest_descriptor,
        new java.lang.String[] { });
    internal_static_aruna_api_storage_services_v2_GetDefaultEndpointResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_aruna_api_storage_services_v2_GetDefaultEndpointResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_GetDefaultEndpointResponse_descriptor,
        new java.lang.String[] { "Endpoint", });
    internal_static_aruna_api_storage_services_v2_SetEndpointStatusRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_aruna_api_storage_services_v2_SetEndpointStatusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_SetEndpointStatusRequest_descriptor,
        new java.lang.String[] { "EndpointId", "Status", });
    internal_static_aruna_api_storage_services_v2_SetEndpointStatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_aruna_api_storage_services_v2_SetEndpointStatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_SetEndpointStatusResponse_descriptor,
        new java.lang.String[] { "Endpoint", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.aruna.api.storage.models.v2.ModelsProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
