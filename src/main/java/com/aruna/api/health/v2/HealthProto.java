// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aruna/api/health/v2/health.proto

// Protobuf Java Version: 3.25.3
package com.aruna.api.health.v2;

public final class HealthProto {
  private HealthProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_health_v2_HealthCheckRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_health_v2_HealthCheckRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aruna_api_health_v2_HealthCheckResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aruna_api_health_v2_HealthCheckResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n aruna/api/health/v2/health.proto\022\023arun" +
      "a.api.health.v2\032\033google/api/visibility.p" +
      "roto\".\n\022HealthCheckRequest\022\030\n\007service\030\001 " +
      "\001(\tR\007service\"\266\001\n\023HealthCheckResponse\022N\n\006" +
      "status\030\001 \001(\01626.aruna.api.health.v2.Healt" +
      "hCheckResponse.ServingStatusR\006status\"O\n\r" +
      "ServingStatus\022\013\n\007UNKNOWN\020\000\022\013\n\007SERVING\020\001\022" +
      "\017\n\013NOT_SERVING\020\002\022\023\n\017SERVICE_UNKNOWN\020\0032\324\001" +
      "\n\006Health\022Z\n\005Check\022\'.aruna.api.health.v2." +
      "HealthCheckRequest\032(.aruna.api.health.v2" +
      ".HealthCheckResponse\022\\\n\005Watch\022\'.aruna.ap" +
      "i.health.v2.HealthCheckRequest\032(.aruna.a" +
      "pi.health.v2.HealthCheckResponse0\001\032\020\372\322\344\223" +
      "\002\n\022\010INTERNALB\314\001\n\027com.aruna.api.health.v2" +
      "B\013HealthProtoP\001Z5github.com/ArunaStorage" +
      "/go-api/v2/aruna/api/health/v2\242\002\003AAH\252\002\023A" +
      "runa.Api.Health.V2\312\002\023Aruna\\Api\\Health\\V2" +
      "\342\002\037Aruna\\Api\\Health\\V2\\GPBMetadata\352\002\026Aru" +
      "na::Api::Health::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.VisibilityProto.getDescriptor(),
        });
    internal_static_aruna_api_health_v2_HealthCheckRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aruna_api_health_v2_HealthCheckRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_health_v2_HealthCheckRequest_descriptor,
        new java.lang.String[] { "Service", });
    internal_static_aruna_api_health_v2_HealthCheckResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_aruna_api_health_v2_HealthCheckResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aruna_api_health_v2_HealthCheckResponse_descriptor,
        new java.lang.String[] { "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.VisibilityProto.apiVisibility);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.VisibilityProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
