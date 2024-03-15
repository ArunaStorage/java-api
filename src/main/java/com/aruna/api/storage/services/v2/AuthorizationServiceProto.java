// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/authorization_service.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.storage.services.v2;

public final class AuthorizationServiceProto {
  private AuthorizationServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_UserPermission_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_UserPermission_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_ResourceAuthorization_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_ResourceAuthorization_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_CreateAuthorizationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_CreateAuthorizationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_CreateAuthorizationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_CreateAuthorizationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_GetAuthorizationsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_GetAuthorizationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_GetAuthorizationsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_GetAuthorizationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_DeleteAuthorizationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_DeleteAuthorizationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_DeleteAuthorizationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_DeleteAuthorizationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_UpdateAuthorizationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_UpdateAuthorizationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_UpdateAuthorizationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_UpdateAuthorizationResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9aruna/api/storage/services/v2/authoriz" +
      "ation_service.proto\022\035aruna.api.storage.s" +
      "ervices.v2\032(aruna/api/storage/models/v2/" +
      "models.proto\032\034google/api/annotations.pro" +
      "to\"\237\001\n\016UserPermission\022\027\n\007user_id\030\001 \001(\tR\006" +
      "userId\022\033\n\tuser_name\030\002 \001(\tR\010userName\022W\n\020p" +
      "ermission_level\030\003 \001(\0162,.aruna.api.storag" +
      "e.models.v2.PermissionLevelR\017permissionL" +
      "evel\"\220\001\n\025ResourceAuthorization\022\037\n\013resour" +
      "ce_id\030\001 \001(\tR\nresourceId\022V\n\017user_permissi" +
      "on\030\002 \003(\0132-.aruna.api.storage.services.v2" +
      ".UserPermissionR\016userPermission\"\257\001\n\032Crea" +
      "teAuthorizationRequest\022\037\n\013resource_id\030\001 " +
      "\001(\tR\nresourceId\022\027\n\007user_id\030\002 \001(\tR\006userId" +
      "\022W\n\020permission_level\030\003 \001(\0162,.aruna.api.s" +
      "torage.models.v2.PermissionLevelR\017permis" +
      "sionLevel\"\315\001\n\033CreateAuthorizationRespons" +
      "e\022\037\n\013resource_id\030\001 \001(\tR\nresourceId\022\027\n\007us" +
      "er_id\030\002 \001(\tR\006userId\022\033\n\tuser_name\030\003 \001(\tR\010" +
      "userName\022W\n\020permission_level\030\004 \001(\0162,.aru" +
      "na.api.storage.models.v2.PermissionLevel" +
      "R\017permissionLevel\"Y\n\030GetAuthorizationsRe" +
      "quest\022\037\n\013resource_id\030\001 \001(\tR\nresourceId\022\034" +
      "\n\trecursive\030\002 \001(\010R\trecursive\"y\n\031GetAutho" +
      "rizationsResponse\022\\\n\016authorizations\030\001 \003(" +
      "\01324.aruna.api.storage.services.v2.Resour" +
      "ceAuthorizationR\016authorizations\"V\n\032Delet" +
      "eAuthorizationRequest\022\037\n\013resource_id\030\001 \001" +
      "(\tR\nresourceId\022\027\n\007user_id\030\002 \001(\tR\006userId\"" +
      "\035\n\033DeleteAuthorizationResponse\"\257\001\n\032Updat" +
      "eAuthorizationRequest\022\037\n\013resource_id\030\001 \001" +
      "(\tR\nresourceId\022\027\n\007user_id\030\002 \001(\tR\006userId\022" +
      "W\n\020permission_level\030\003 \001(\0162,.aruna.api.st" +
      "orage.models.v2.PermissionLevelR\017permiss" +
      "ionLevel\"u\n\033UpdateAuthorizationResponse\022" +
      "V\n\017user_permission\030\001 \001(\0132-.aruna.api.sto" +
      "rage.services.v2.UserPermissionR\016userPer" +
      "mission2\357\005\n\024AuthorizationService\022\253\001\n\023Cre" +
      "ateAuthorization\0229.aruna.api.storage.ser" +
      "vices.v2.CreateAuthorizationRequest\032:.ar" +
      "una.api.storage.services.v2.CreateAuthor" +
      "izationResponse\"\035\202\323\344\223\002\027\"\022/v2/authorizati" +
      "ons:\001*\022\260\001\n\021GetAuthorizations\0227.aruna.api" +
      ".storage.services.v2.GetAuthorizationsRe" +
      "quest\0328.aruna.api.storage.services.v2.Ge" +
      "tAuthorizationsResponse\"(\202\323\344\223\002\"\022 /v2/aut" +
      "horizations/{resource_id}\022\271\001\n\023DeleteAuth" +
      "orization\0229.aruna.api.storage.services.v" +
      "2.DeleteAuthorizationRequest\032:.aruna.api" +
      ".storage.services.v2.DeleteAuthorization" +
      "Response\"+\202\323\344\223\002%* /v2/authorizations/{re" +
      "source_id}:\001*\022\271\001\n\023UpdateAuthorization\0229." +
      "aruna.api.storage.services.v2.UpdateAuth" +
      "orizationRequest\032:.aruna.api.storage.ser" +
      "vices.v2.UpdateAuthorizationResponse\"+\202\323" +
      "\344\223\002%2 /v2/authorizations/{resource_id}:\001" +
      "*B\230\002\n!com.aruna.api.storage.services.v2B" +
      "\031AuthorizationServiceProtoP\001Z?github.com" +
      "/ArunaStorage/go-api/v2/aruna/api/storag" +
      "e/services/v2\242\002\004AASS\252\002\035Aruna.Api.Storage" +
      ".Services.V2\312\002\035Aruna\\Api\\Storage\\Service" +
      "s\\V2\342\002)Aruna\\Api\\Storage\\Services\\V2\\GPB" +
      "Metadata\352\002!Aruna::Api::Storage::Services" +
      "::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.aruna.api.storage.models.v2.ModelsProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_aruna_api_storage_services_v2_UserPermission_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aruna_api_storage_services_v2_UserPermission_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_UserPermission_descriptor,
        new java.lang.String[] { "UserId", "UserName", "PermissionLevel", });
    internal_static_aruna_api_storage_services_v2_ResourceAuthorization_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_aruna_api_storage_services_v2_ResourceAuthorization_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_ResourceAuthorization_descriptor,
        new java.lang.String[] { "ResourceId", "UserPermission", });
    internal_static_aruna_api_storage_services_v2_CreateAuthorizationRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_aruna_api_storage_services_v2_CreateAuthorizationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_CreateAuthorizationRequest_descriptor,
        new java.lang.String[] { "ResourceId", "UserId", "PermissionLevel", });
    internal_static_aruna_api_storage_services_v2_CreateAuthorizationResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_aruna_api_storage_services_v2_CreateAuthorizationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_CreateAuthorizationResponse_descriptor,
        new java.lang.String[] { "ResourceId", "UserId", "UserName", "PermissionLevel", });
    internal_static_aruna_api_storage_services_v2_GetAuthorizationsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_aruna_api_storage_services_v2_GetAuthorizationsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_GetAuthorizationsRequest_descriptor,
        new java.lang.String[] { "ResourceId", "Recursive", });
    internal_static_aruna_api_storage_services_v2_GetAuthorizationsResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_aruna_api_storage_services_v2_GetAuthorizationsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_GetAuthorizationsResponse_descriptor,
        new java.lang.String[] { "Authorizations", });
    internal_static_aruna_api_storage_services_v2_DeleteAuthorizationRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_aruna_api_storage_services_v2_DeleteAuthorizationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_DeleteAuthorizationRequest_descriptor,
        new java.lang.String[] { "ResourceId", "UserId", });
    internal_static_aruna_api_storage_services_v2_DeleteAuthorizationResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_aruna_api_storage_services_v2_DeleteAuthorizationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_DeleteAuthorizationResponse_descriptor,
        new java.lang.String[] { });
    internal_static_aruna_api_storage_services_v2_UpdateAuthorizationRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_aruna_api_storage_services_v2_UpdateAuthorizationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_UpdateAuthorizationRequest_descriptor,
        new java.lang.String[] { "ResourceId", "UserId", "PermissionLevel", });
    internal_static_aruna_api_storage_services_v2_UpdateAuthorizationResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_aruna_api_storage_services_v2_UpdateAuthorizationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_UpdateAuthorizationResponse_descriptor,
        new java.lang.String[] { "UserPermission", });
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
