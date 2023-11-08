// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/storage/services/v2/workspace_service.proto

// Protobuf Java Version: 3.25.0
package com.aruna.api.storage.services.v2;

public final class WorkspaceServiceProto {
  private WorkspaceServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_CreateWorkspaceTemplateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_CreateWorkspaceTemplateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_CreateWorkspaceTemplateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_CreateWorkspaceTemplateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_GetWorkspaceTemplateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_GetWorkspaceTemplateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_GetWorkspaceTemplateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_GetWorkspaceTemplateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_DeleteWorkspaceTemplateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_DeleteWorkspaceTemplateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_DeleteWorkspaceTemplateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_DeleteWorkspaceTemplateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_ListOwnedWorkspaceTemplatesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_ListOwnedWorkspaceTemplatesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_ListOwnedWorkspaceTemplatesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_ListOwnedWorkspaceTemplatesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_WorkspaceInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_WorkspaceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_CreateWorkspaceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_CreateWorkspaceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_CreateWorkspaceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_CreateWorkspaceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_DeleteWorkspaceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_DeleteWorkspaceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_DeleteWorkspaceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_DeleteWorkspaceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_ClaimWorkspaceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_ClaimWorkspaceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_storage_services_v2_ClaimWorkspaceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_storage_services_v2_ClaimWorkspaceResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5aruna/api/storage/services/v2/workspac" +
      "e_service.proto\022\035aruna.api.storage.servi" +
      "ces.v2\032\034google/api/annotations.proto\032\033go" +
      "ogle/api/visibility.proto\"\307\001\n\036CreateWork" +
      "spaceTemplateRequest\022\031\n\010owner_id\030\001 \001(\tR\007" +
      "ownerId\022\026\n\006prefix\030\002 \001(\tR\006prefix\022\022\n\004name\030" +
      "\003 \001(\tR\004name\022\031\n\010hook_ids\030\005 \003(\tR\007hookIds\022 " +
      "\n\013description\030\006 \001(\tR\013description\022!\n\014endp" +
      "oint_ids\030\007 \003(\tR\013endpointIds\"B\n\037CreateWor" +
      "kspaceTemplateResponse\022\037\n\013template_id\030\001 " +
      "\001(\tR\ntemplateId\">\n\033GetWorkspaceTemplateR" +
      "equest\022\037\n\013template_id\030\001 \001(\tR\ntemplateId\"" +
      "j\n\034GetWorkspaceTemplateResponse\022J\n\tworks" +
      "pace\030\001 \001(\0132,.aruna.api.storage.services." +
      "v2.WorkspaceInfoR\tworkspace\"A\n\036DeleteWor" +
      "kspaceTemplateRequest\022\037\n\013template_id\030\001 \001" +
      "(\tR\ntemplateId\"!\n\037DeleteWorkspaceTemplat" +
      "eResponse\"$\n\"ListOwnedWorkspaceTemplates" +
      "Request\"s\n#ListOwnedWorkspaceTemplatesRe" +
      "sponse\022L\n\nworkspaces\030\001 \003(\0132,.aruna.api.s" +
      "torage.services.v2.WorkspaceInfoR\nworksp" +
      "aces\"\324\001\n\rWorkspaceInfo\022!\n\014workspace_id\030\001" +
      " \001(\tR\013workspaceId\022\022\n\004name\030\002 \001(\tR\004name\022 \n" +
      "\013description\030\003 \001(\tR\013description\022\024\n\005owner" +
      "\030\004 \001(\tR\005owner\022\026\n\006prefix\030\005 \001(\tR\006prefix\022\031\n" +
      "\010hook_ids\030\006 \001(\tR\007hookIds\022!\n\014endpoint_ids" +
      "\030\007 \001(\tR\013endpointIds\"i\n\026CreateWorkspaceRe" +
      "quest\022-\n\022workspace_template\030\001 \001(\tR\021works" +
      "paceTemplate\022 \n\013description\030\002 \001(\tR\013descr" +
      "iption\"\220\001\n\027CreateWorkspaceResponse\022!\n\014wo" +
      "rkspace_id\030\001 \001(\tR\013workspaceId\022\024\n\005token\030\002" +
      " \001(\tR\005token\022\035\n\naccess_key\030\003 \001(\tR\taccessK" +
      "ey\022\035\n\nsecret_key\030\004 \001(\tR\tsecretKey\";\n\026Del" +
      "eteWorkspaceRequest\022!\n\014workspace_id\030\001 \001(" +
      "\tR\013workspaceId\"\031\n\027DeleteWorkspaceRespons" +
      "e\"P\n\025ClaimWorkspaceRequest\022!\n\014workspace_" +
      "id\030\001 \001(\tR\013workspaceId\022\024\n\005token\030\002 \001(\tR\005to" +
      "ken\"\030\n\026ClaimWorkspaceResponse2\266\n\n\020Worksp" +
      "aceService\022\275\001\n\027CreateWorkspaceTemplate\022=" +
      ".aruna.api.storage.services.v2.CreateWor" +
      "kspaceTemplateRequest\032>.aruna.api.storag" +
      "e.services.v2.CreateWorkspaceTemplateRes" +
      "ponse\"#\202\323\344\223\002\035\"\030/v2/workspaces/templates:" +
      "\001*\022\277\001\n\024GetWorkspaceTemplate\022:.aruna.api." +
      "storage.services.v2.GetWorkspaceTemplate" +
      "Request\032;.aruna.api.storage.services.v2." +
      "GetWorkspaceTemplateResponse\".\202\323\344\223\002(\022&/v" +
      "2/workspaces/templates/{template_id}\022\306\001\n" +
      "\033ListOwnedWorkspaceTemplates\022A.aruna.api" +
      ".storage.services.v2.ListOwnedWorkspaceT" +
      "emplatesRequest\032B.aruna.api.storage.serv" +
      "ices.v2.ListOwnedWorkspaceTemplatesRespo" +
      "nse\" \202\323\344\223\002\032\022\030/v2/workspaces/templates\022\313\001" +
      "\n\027DeleteWorkspaceTemplate\022=.aruna.api.st" +
      "orage.services.v2.DeleteWorkspaceTemplat" +
      "eRequest\032>.aruna.api.storage.services.v2" +
      ".DeleteWorkspaceTemplateResponse\"1\202\323\344\223\002+" +
      "*&/v2/workspaces/templates/{template_id}" +
      ":\001*\022\233\001\n\017CreateWorkspace\0225.aruna.api.stor" +
      "age.services.v2.CreateWorkspaceRequest\0326" +
      ".aruna.api.storage.services.v2.CreateWor" +
      "kspaceResponse\"\031\202\323\344\223\002\023\"\016/v2/workspaces:\001" +
      "*\022\252\001\n\017DeleteWorkspace\0225.aruna.api.storag" +
      "e.services.v2.DeleteWorkspaceRequest\0326.a" +
      "runa.api.storage.services.v2.DeleteWorks" +
      "paceResponse\"(\202\323\344\223\002\"*\035/v2/workspaces/{wo" +
      "rkspace_id}:\001*\022\255\001\n\016ClaimWorkspace\0224.arun" +
      "a.api.storage.services.v2.ClaimWorkspace" +
      "Request\0325.aruna.api.storage.services.v2." +
      "ClaimWorkspaceResponse\".\202\323\344\223\002(\"#/v2/work" +
      "spaces/{workspace_id}/claim:\001*\032\016\372\322\344\223\002\010\022\006" +
      "SERVERB\224\002\n!com.aruna.api.storage.service" +
      "s.v2B\025WorkspaceServiceProtoP\001Z?github.co" +
      "m/ArunaStorage/go-api/v2/aruna/api/stora" +
      "ge/services/v2\242\002\004AASS\252\002\035Aruna.Api.Storag" +
      "e.Services.V2\312\002\035Aruna\\Api\\Storage\\Servic" +
      "es\\V2\342\002)Aruna\\Api\\Storage\\Services\\V2\\GP" +
      "BMetadata\352\002!Aruna::Api::Storage::Service" +
      "s::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.VisibilityProto.getDescriptor(),
        });
    internal_static_aruna_api_storage_services_v2_CreateWorkspaceTemplateRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aruna_api_storage_services_v2_CreateWorkspaceTemplateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_CreateWorkspaceTemplateRequest_descriptor,
        new java.lang.String[] { "OwnerId", "Prefix", "Name", "HookIds", "Description", "EndpointIds", });
    internal_static_aruna_api_storage_services_v2_CreateWorkspaceTemplateResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_aruna_api_storage_services_v2_CreateWorkspaceTemplateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_CreateWorkspaceTemplateResponse_descriptor,
        new java.lang.String[] { "TemplateId", });
    internal_static_aruna_api_storage_services_v2_GetWorkspaceTemplateRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_aruna_api_storage_services_v2_GetWorkspaceTemplateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_GetWorkspaceTemplateRequest_descriptor,
        new java.lang.String[] { "TemplateId", });
    internal_static_aruna_api_storage_services_v2_GetWorkspaceTemplateResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_aruna_api_storage_services_v2_GetWorkspaceTemplateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_GetWorkspaceTemplateResponse_descriptor,
        new java.lang.String[] { "Workspace", });
    internal_static_aruna_api_storage_services_v2_DeleteWorkspaceTemplateRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_aruna_api_storage_services_v2_DeleteWorkspaceTemplateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_DeleteWorkspaceTemplateRequest_descriptor,
        new java.lang.String[] { "TemplateId", });
    internal_static_aruna_api_storage_services_v2_DeleteWorkspaceTemplateResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_aruna_api_storage_services_v2_DeleteWorkspaceTemplateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_DeleteWorkspaceTemplateResponse_descriptor,
        new java.lang.String[] { });
    internal_static_aruna_api_storage_services_v2_ListOwnedWorkspaceTemplatesRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_aruna_api_storage_services_v2_ListOwnedWorkspaceTemplatesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_ListOwnedWorkspaceTemplatesRequest_descriptor,
        new java.lang.String[] { });
    internal_static_aruna_api_storage_services_v2_ListOwnedWorkspaceTemplatesResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_aruna_api_storage_services_v2_ListOwnedWorkspaceTemplatesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_ListOwnedWorkspaceTemplatesResponse_descriptor,
        new java.lang.String[] { "Workspaces", });
    internal_static_aruna_api_storage_services_v2_WorkspaceInfo_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_aruna_api_storage_services_v2_WorkspaceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_WorkspaceInfo_descriptor,
        new java.lang.String[] { "WorkspaceId", "Name", "Description", "Owner", "Prefix", "HookIds", "EndpointIds", });
    internal_static_aruna_api_storage_services_v2_CreateWorkspaceRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_aruna_api_storage_services_v2_CreateWorkspaceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_CreateWorkspaceRequest_descriptor,
        new java.lang.String[] { "WorkspaceTemplate", "Description", });
    internal_static_aruna_api_storage_services_v2_CreateWorkspaceResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_aruna_api_storage_services_v2_CreateWorkspaceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_CreateWorkspaceResponse_descriptor,
        new java.lang.String[] { "WorkspaceId", "Token", "AccessKey", "SecretKey", });
    internal_static_aruna_api_storage_services_v2_DeleteWorkspaceRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_aruna_api_storage_services_v2_DeleteWorkspaceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_DeleteWorkspaceRequest_descriptor,
        new java.lang.String[] { "WorkspaceId", });
    internal_static_aruna_api_storage_services_v2_DeleteWorkspaceResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_aruna_api_storage_services_v2_DeleteWorkspaceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_DeleteWorkspaceResponse_descriptor,
        new java.lang.String[] { });
    internal_static_aruna_api_storage_services_v2_ClaimWorkspaceRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_aruna_api_storage_services_v2_ClaimWorkspaceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_ClaimWorkspaceRequest_descriptor,
        new java.lang.String[] { "WorkspaceId", "Token", });
    internal_static_aruna_api_storage_services_v2_ClaimWorkspaceResponse_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_aruna_api_storage_services_v2_ClaimWorkspaceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_storage_services_v2_ClaimWorkspaceResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.VisibilityProto.apiVisibility);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.VisibilityProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}