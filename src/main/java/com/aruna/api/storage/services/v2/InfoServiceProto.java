// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/info_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public final class InfoServiceProto {
  private InfoServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_GetStorageVersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_GetStorageVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_SemanticVersion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_SemanticVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_LocationVersion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_LocationVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_ComponentVersion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_ComponentVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_GetStorageVersionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_GetStorageVersionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_GetStorageStatusRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_GetStorageStatusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_LocationStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_LocationStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_ComponentStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_ComponentStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_GetStorageStatusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_GetStorageStatusResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_GetPubkeysRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_GetPubkeysRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_GetPubkeysResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_GetPubkeysResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_Announcement_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_Announcement_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_GetAnnouncementsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_GetAnnouncementsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_GetAnnouncementsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_GetAnnouncementsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_SetAnnouncementsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_SetAnnouncementsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_SetAnnouncementsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_SetAnnouncementsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0aruna/api/storage/services/v2/info_ser" +
      "vice.proto\022\035aruna.api.storage.services.v" +
      "2\032(aruna/api/storage/models/v2/models.pr" +
      "oto\032\034google/api/annotations.proto\032\037googl" +
      "e/protobuf/timestamp.proto\"\032\n\030GetStorage" +
      "VersionRequest\"\222\001\n\017SemanticVersion\022%\n\016ve" +
      "rsion_string\030\001 \001(\tR\rversionString\022\024\n\005maj" +
      "or\030\002 \001(\005R\005major\022\024\n\005minor\030\003 \001(\005R\005minor\022\024\n" +
      "\005patch\030\004 \001(\005R\005patch\022\026\n\006labels\030\005 \001(\tR\006lab" +
      "els\"x\n\017LocationVersion\022\032\n\010location\030\001 \001(\t" +
      "R\010location\022I\n\007version\030\002 \003(\0132/.aruna.api." +
      "storage.services.v2.ComponentVersionR\007ve" +
      "rsion\"p\n\020ComponentVersion\022\022\n\004name\030\001 \001(\tR" +
      "\004name\022H\n\007version\030\002 \001(\0132..aruna.api.stora" +
      "ge.services.v2.SemanticVersionR\007version\"" +
      "v\n\031GetStorageVersionResponse\022Y\n\020location" +
      "_version\030\001 \003(\0132..aruna.api.storage.servi" +
      "ces.v2.LocationVersionR\017locationVersion\"" +
      "\031\n\027GetStorageStatusRequest\"\207\001\n\016LocationS" +
      "tatus\022\032\n\010location\030\001 \001(\tR\010location\022Y\n\020com" +
      "ponent_status\030\002 \003(\0132..aruna.api.storage." +
      "services.v2.ComponentStatusR\017componentSt" +
      "atus\"k\n\017ComponentStatus\022\022\n\004name\030\001 \001(\tR\004n" +
      "ame\022D\n\006status\030\002 \001(\0162,.aruna.api.storage." +
      "models.v2.ComponentStatusR\006status\"r\n\030Get" +
      "StorageStatusResponse\022V\n\017location_status" +
      "\030\001 \003(\0132-.aruna.api.storage.services.v2.L" +
      "ocationStatusR\016locationStatus\"\023\n\021GetPubk" +
      "eysRequest\"S\n\022GetPubkeysResponse\022=\n\007pubk" +
      "eys\030\001 \003(\0132#.aruna.api.storage.models.v2." +
      "PubkeyR\007pubkeys\"s\n\014Announcement\022\016\n\002id\030\001 " +
      "\001(\tR\002id\022\030\n\007content\030\002 \001(\tR\007content\0229\n\ncre" +
      "ated_at\030\003 \001(\0132\032.google.protobuf.Timestam" +
      "pR\tcreatedAt\"\031\n\027GetAnnouncementsRequest\"" +
      "m\n\030GetAnnouncementsResponse\022Q\n\rannouncem" +
      "ents\030\001 \003(\0132+.aruna.api.storage.services." +
      "v2.AnnouncementR\rannouncements\"\254\001\n\027SetAn" +
      "nouncementsRequest\022^\n\024announcements_upse" +
      "rt\030\001 \003(\0132+.aruna.api.storage.services.v2" +
      ".AnnouncementR\023announcementsUpsert\0221\n\024an" +
      "nouncements_delete\030\002 \003(\tR\023announcementsD" +
      "elete\"m\n\030SetAnnouncementsResponse\022Q\n\rann" +
      "ouncements\030\001 \003(\0132+.aruna.api.storage.ser" +
      "vices.v2.AnnouncementR\rannouncements2\271\006\n" +
      "\024StorageStatusService\022\240\001\n\021GetStorageVers" +
      "ion\0227.aruna.api.storage.services.v2.GetS" +
      "torageVersionRequest\0328.aruna.api.storage" +
      ".services.v2.GetStorageVersionResponse\"\030" +
      "\202\323\344\223\002\022\022\020/v2/info/version\022\234\001\n\020GetStorageS" +
      "tatus\0226.aruna.api.storage.services.v2.Ge" +
      "tStorageStatusRequest\0327.aruna.api.storag" +
      "e.services.v2.GetStorageStatusResponse\"\027" +
      "\202\323\344\223\002\021\022\017/v2/info/status\022\213\001\n\nGetPubkeys\0220" +
      ".aruna.api.storage.services.v2.GetPubkey" +
      "sRequest\0321.aruna.api.storage.services.v2" +
      ".GetPubkeysResponse\"\030\202\323\344\223\002\022\022\020/v2/info/pu" +
      "bkeys\022\243\001\n\020GetAnnouncements\0226.aruna.api.s" +
      "torage.services.v2.GetAnnouncementsReque" +
      "st\0327.aruna.api.storage.services.v2.GetAn" +
      "nouncementsResponse\"\036\202\323\344\223\002\030\022\026/v2/info/an" +
      "nouncements\022\252\001\n\020SetAnnouncements\0226.aruna" +
      ".api.storage.services.v2.SetAnnouncement" +
      "sRequest\0327.aruna.api.storage.services.v2" +
      ".SetAnnouncementsResponse\"%\202\323\344\223\002\037\"\032/v2/i" +
      "nfo/announcements/set:\001*B\217\002\n!com.aruna.a" +
      "pi.storage.services.v2B\020InfoServiceProto" +
      "P\001Z?github.com/ArunaStorage/go-api/v2/ar" +
      "una/api/storage/services/v2\242\002\004AASS\252\002\035Aru" +
      "na.Api.Storage.Services.V2\312\002\035Aruna\\Api\\S" +
      "torage\\Services\\V2\342\002)Aruna\\Api\\Storage\\S" +
      "ervices\\V2\\GPBMetadata\352\002!Aruna::Api::Sto" +
      "rage::Services::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.aruna.api.storage.models.v2.ModelsProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_aruna_api_storage_services_v2_GetStorageVersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aruna_api_storage_services_v2_GetStorageVersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_GetStorageVersionRequest_descriptor,
        new java.lang.String[] { });
    internal_static_aruna_api_storage_services_v2_SemanticVersion_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_aruna_api_storage_services_v2_SemanticVersion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_SemanticVersion_descriptor,
        new java.lang.String[] { "VersionString", "Major", "Minor", "Patch", "Labels", });
    internal_static_aruna_api_storage_services_v2_LocationVersion_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_aruna_api_storage_services_v2_LocationVersion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_LocationVersion_descriptor,
        new java.lang.String[] { "Location", "Version", });
    internal_static_aruna_api_storage_services_v2_ComponentVersion_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_aruna_api_storage_services_v2_ComponentVersion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_ComponentVersion_descriptor,
        new java.lang.String[] { "Name", "Version", });
    internal_static_aruna_api_storage_services_v2_GetStorageVersionResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_aruna_api_storage_services_v2_GetStorageVersionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_GetStorageVersionResponse_descriptor,
        new java.lang.String[] { "LocationVersion", });
    internal_static_aruna_api_storage_services_v2_GetStorageStatusRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_aruna_api_storage_services_v2_GetStorageStatusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_GetStorageStatusRequest_descriptor,
        new java.lang.String[] { });
    internal_static_aruna_api_storage_services_v2_LocationStatus_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_aruna_api_storage_services_v2_LocationStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_LocationStatus_descriptor,
        new java.lang.String[] { "Location", "ComponentStatus", });
    internal_static_aruna_api_storage_services_v2_ComponentStatus_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_aruna_api_storage_services_v2_ComponentStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_ComponentStatus_descriptor,
        new java.lang.String[] { "Name", "Status", });
    internal_static_aruna_api_storage_services_v2_GetStorageStatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_aruna_api_storage_services_v2_GetStorageStatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_GetStorageStatusResponse_descriptor,
        new java.lang.String[] { "LocationStatus", });
    internal_static_aruna_api_storage_services_v2_GetPubkeysRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_aruna_api_storage_services_v2_GetPubkeysRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_GetPubkeysRequest_descriptor,
        new java.lang.String[] { });
    internal_static_aruna_api_storage_services_v2_GetPubkeysResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_aruna_api_storage_services_v2_GetPubkeysResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_GetPubkeysResponse_descriptor,
        new java.lang.String[] { "Pubkeys", });
    internal_static_aruna_api_storage_services_v2_Announcement_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_aruna_api_storage_services_v2_Announcement_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_Announcement_descriptor,
        new java.lang.String[] { "Id", "Content", "CreatedAt", });
    internal_static_aruna_api_storage_services_v2_GetAnnouncementsRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_aruna_api_storage_services_v2_GetAnnouncementsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_GetAnnouncementsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_aruna_api_storage_services_v2_GetAnnouncementsResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_aruna_api_storage_services_v2_GetAnnouncementsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_GetAnnouncementsResponse_descriptor,
        new java.lang.String[] { "Announcements", });
    internal_static_aruna_api_storage_services_v2_SetAnnouncementsRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_aruna_api_storage_services_v2_SetAnnouncementsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_SetAnnouncementsRequest_descriptor,
        new java.lang.String[] { "AnnouncementsUpsert", "AnnouncementsDelete", });
    internal_static_aruna_api_storage_services_v2_SetAnnouncementsResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_aruna_api_storage_services_v2_SetAnnouncementsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_SetAnnouncementsResponse_descriptor,
        new java.lang.String[] { "Announcements", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.aruna.api.storage.models.v2.ModelsProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
