// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/data_replication_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.services.v2;

public final class DataReplicationServiceProto {
  private DataReplicationServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_ReplicateProjectDataRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_ReplicateProjectDataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_ReplicateProjectDataResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_ReplicateProjectDataResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_PartialReplicateDataRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_PartialReplicateDataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_PartialReplicateDataResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_PartialReplicateDataResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_UpdateReplicationStatusRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_UpdateReplicationStatusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_UpdateReplicationStatusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_UpdateReplicationStatusResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_GetReplicationStatusRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_GetReplicationStatusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_GetReplicationStatusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_GetReplicationStatusResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_DeleteReplicationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_DeleteReplicationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_DeleteReplicationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_DeleteReplicationResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<aruna/api/storage/services/v2/data_rep" +
      "lication_service.proto\022\035aruna.api.storag" +
      "e.services.v2\032\034google/api/annotations.pr" +
      "oto\"]\n\033ReplicateProjectDataRequest\022\035\n\npr" +
      "oject_id\030\001 \001(\tR\tprojectId\022\037\n\013endpoint_id" +
      "\030\002 \001(\tR\nendpointId\"h\n\034ReplicateProjectDa" +
      "taResponse\022H\n\006status\030\001 \001(\01620.aruna.api.s" +
      "torage.services.v2.ReplicationStatusR\006st" +
      "atus\"_\n\033PartialReplicateDataRequest\022\037\n\013r" +
      "esource_id\030\001 \001(\tR\nresourceId\022\037\n\013endpoint" +
      "_id\030\002 \001(\tR\nendpointId\"h\n\034PartialReplicat" +
      "eDataResponse\022H\n\006status\030\001 \001(\01620.aruna.ap" +
      "i.storage.services.v2.ReplicationStatusR" +
      "\006status\"\254\001\n\036UpdateReplicationStatusReque" +
      "st\022\037\n\013resource_id\030\001 \001(\tR\nresourceId\022\037\n\013e" +
      "ndpoint_id\030\002 \001(\tR\nendpointId\022H\n\006status\030\003" +
      " \001(\01620.aruna.api.storage.services.v2.Rep" +
      "licationStatusR\006status\"!\n\037UpdateReplicat" +
      "ionStatusResponse\"_\n\033GetReplicationStatu" +
      "sRequest\022\037\n\013resource_id\030\001 \001(\tR\nresourceI" +
      "d\022\037\n\013endpoint_id\030\002 \001(\tR\nendpointId\"h\n\034Ge" +
      "tReplicationStatusResponse\022H\n\006status\030\001 \001" +
      "(\01620.aruna.api.storage.services.v2.Repli" +
      "cationStatusR\006status\"\\\n\030DeleteReplicatio" +
      "nRequest\022\037\n\013resource_id\030\001 \001(\tR\nresourceI" +
      "d\022\037\n\013endpoint_id\030\002 \001(\tR\nendpointId\"\033\n\031De" +
      "leteReplicationResponse*\266\001\n\021ReplicationS" +
      "tatus\022\"\n\036REPLICATION_STATUS_UNSPECIFIED\020" +
      "\000\022\036\n\032REPLICATION_STATUS_WAITING\020\001\022\036\n\032REP" +
      "LICATION_STATUS_RUNNING\020\002\022\037\n\033REPLICATION" +
      "_STATUS_FINISHED\020\003\022\034\n\030REPLICATION_STATUS" +
      "_ERROR\020\0042\313\010\n\026DataReplicationService\022\320\001\n\024" +
      "ReplicateProjectData\022:.aruna.api.storage" +
      ".services.v2.ReplicateProjectDataRequest" +
      "\032;.aruna.api.storage.services.v2.Replica" +
      "teProjectDataResponse\"?\202\323\344\223\0029\"4/v2/endpo" +
      "ints/{endpoint_id}/replication/{project_" +
      "id}:\001*\022\331\001\n\024PartialReplicateData\022:.aruna." +
      "api.storage.services.v2.PartialReplicate" +
      "DataRequest\032;.aruna.api.storage.services" +
      ".v2.PartialReplicateDataResponse\"H\202\323\344\223\002B" +
      "\"=/v2/endpoints/{endpoint_id}/replicatio" +
      "n/{resource_id}/partial:\001*\022\341\001\n\027UpdateRep" +
      "licationStatus\022=.aruna.api.storage.servi" +
      "ces.v2.UpdateReplicationStatusRequest\032>." +
      "aruna.api.storage.services.v2.UpdateRepl" +
      "icationStatusResponse\"G\202\323\344\223\002A2</v2/endpo" +
      "ints/{endpoint_id}/replication/{resource" +
      "_id}/status:\001*\022\325\001\n\024GetReplicationStatus\022" +
      ":.aruna.api.storage.services.v2.GetRepli" +
      "cationStatusRequest\032;.aruna.api.storage." +
      "services.v2.GetReplicationStatusResponse" +
      "\"D\202\323\344\223\002>\022</v2/endpoints/{endpoint_id}/re" +
      "plication/{resource_id}/status\022\305\001\n\021Delet" +
      "eReplication\0227.aruna.api.storage.service" +
      "s.v2.DeleteReplicationRequest\0328.aruna.ap" +
      "i.storage.services.v2.DeleteReplicationR" +
      "esponse\"=\202\323\344\223\0027*5/v2/endpoints/{endpoint" +
      "_id}/replication/{resource_id}B\232\002\n!com.a" +
      "runa.api.storage.services.v2B\033DataReplic" +
      "ationServiceProtoP\001Z?github.com/ArunaSto" +
      "rage/go-api/v2/aruna/api/storage/service" +
      "s/v2\242\002\004AASS\252\002\035Aruna.Api.Storage.Services" +
      ".V2\312\002\035Aruna\\Api\\Storage\\Services\\V2\342\002)Ar" +
      "una\\Api\\Storage\\Services\\V2\\GPBMetadata\352" +
      "\002!Aruna::Api::Storage::Services::V2b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_aruna_api_storage_services_v2_ReplicateProjectDataRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aruna_api_storage_services_v2_ReplicateProjectDataRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_ReplicateProjectDataRequest_descriptor,
        new java.lang.String[] { "ProjectId", "EndpointId", });
    internal_static_aruna_api_storage_services_v2_ReplicateProjectDataResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_aruna_api_storage_services_v2_ReplicateProjectDataResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_ReplicateProjectDataResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_aruna_api_storage_services_v2_PartialReplicateDataRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_aruna_api_storage_services_v2_PartialReplicateDataRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_PartialReplicateDataRequest_descriptor,
        new java.lang.String[] { "ResourceId", "EndpointId", });
    internal_static_aruna_api_storage_services_v2_PartialReplicateDataResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_aruna_api_storage_services_v2_PartialReplicateDataResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_PartialReplicateDataResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_aruna_api_storage_services_v2_UpdateReplicationStatusRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_aruna_api_storage_services_v2_UpdateReplicationStatusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_UpdateReplicationStatusRequest_descriptor,
        new java.lang.String[] { "ResourceId", "EndpointId", "Status", });
    internal_static_aruna_api_storage_services_v2_UpdateReplicationStatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_aruna_api_storage_services_v2_UpdateReplicationStatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_UpdateReplicationStatusResponse_descriptor,
        new java.lang.String[] { });
    internal_static_aruna_api_storage_services_v2_GetReplicationStatusRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_aruna_api_storage_services_v2_GetReplicationStatusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_GetReplicationStatusRequest_descriptor,
        new java.lang.String[] { "ResourceId", "EndpointId", });
    internal_static_aruna_api_storage_services_v2_GetReplicationStatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_aruna_api_storage_services_v2_GetReplicationStatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_GetReplicationStatusResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_aruna_api_storage_services_v2_DeleteReplicationRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_aruna_api_storage_services_v2_DeleteReplicationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_DeleteReplicationRequest_descriptor,
        new java.lang.String[] { "ResourceId", "EndpointId", });
    internal_static_aruna_api_storage_services_v2_DeleteReplicationResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_aruna_api_storage_services_v2_DeleteReplicationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_DeleteReplicationResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
