// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protoc-gen-openapiv2/options/annotations.proto
// Protobuf Java Version: 4.26.0

package com.grpc.gateway.protoc_gen_openapiv2.options;

public final class AnnotationsProto {
  private AnnotationsProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      AnnotationsProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.openapiv2Swagger);
    registry.add(com.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.openapiv2Operation);
    registry.add(com.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.openapiv2Schema);
    registry.add(com.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.openapiv2Tag);
    registry.add(com.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.openapiv2Field);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int OPENAPIV2_SWAGGER_FIELD_NUMBER = 1042;
  /**
   * <pre>
   * ID assigned by protobuf-global-extension-registry&#64;google.com for gRPC-Gateway project.
   *
   * All IDs are the same, as assigned. It is okay that they are the same, as they extend
   * different descriptor messages.
   * </pre>
   *
   * <code>extend .google.protobuf.FileOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FileOptions,
      com.grpc.gateway.protoc_gen_openapiv2.options.Swagger> openapiv2Swagger = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        com.grpc.gateway.protoc_gen_openapiv2.options.Swagger.class,
        com.grpc.gateway.protoc_gen_openapiv2.options.Swagger.getDefaultInstance());
  public static final int OPENAPIV2_OPERATION_FIELD_NUMBER = 1042;
  /**
   * <pre>
   * ID assigned by protobuf-global-extension-registry&#64;google.com for gRPC-Gateway project.
   *
   * All IDs are the same, as assigned. It is okay that they are the same, as they extend
   * different descriptor messages.
   * </pre>
   *
   * <code>extend .google.protobuf.MethodOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MethodOptions,
      com.grpc.gateway.protoc_gen_openapiv2.options.Operation> openapiv2Operation = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        com.grpc.gateway.protoc_gen_openapiv2.options.Operation.class,
        com.grpc.gateway.protoc_gen_openapiv2.options.Operation.getDefaultInstance());
  public static final int OPENAPIV2_SCHEMA_FIELD_NUMBER = 1042;
  /**
   * <pre>
   * ID assigned by protobuf-global-extension-registry&#64;google.com for gRPC-Gateway project.
   *
   * All IDs are the same, as assigned. It is okay that they are the same, as they extend
   * different descriptor messages.
   * </pre>
   *
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      com.grpc.gateway.protoc_gen_openapiv2.options.Schema> openapiv2Schema = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        com.grpc.gateway.protoc_gen_openapiv2.options.Schema.class,
        com.grpc.gateway.protoc_gen_openapiv2.options.Schema.getDefaultInstance());
  public static final int OPENAPIV2_TAG_FIELD_NUMBER = 1042;
  /**
   * <pre>
   * ID assigned by protobuf-global-extension-registry&#64;google.com for gRPC-Gateway project.
   *
   * All IDs are the same, as assigned. It is okay that they are the same, as they extend
   * different descriptor messages.
   * </pre>
   *
   * <code>extend .google.protobuf.ServiceOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.ServiceOptions,
      com.grpc.gateway.protoc_gen_openapiv2.options.Tag> openapiv2Tag = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        com.grpc.gateway.protoc_gen_openapiv2.options.Tag.class,
        com.grpc.gateway.protoc_gen_openapiv2.options.Tag.getDefaultInstance());
  public static final int OPENAPIV2_FIELD_FIELD_NUMBER = 1042;
  /**
   * <pre>
   * ID assigned by protobuf-global-extension-registry&#64;google.com for gRPC-Gateway project.
   *
   * All IDs are the same, as assigned. It is okay that they are the same, as they extend
   * different descriptor messages.
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      com.grpc.gateway.protoc_gen_openapiv2.options.JSONSchema> openapiv2Field = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        com.grpc.gateway.protoc_gen_openapiv2.options.JSONSchema.class,
        com.grpc.gateway.protoc_gen_openapiv2.options.JSONSchema.getDefaultInstance());

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.protoc-gen-openapiv2/options/annotatio" +
      "ns.proto\022)grpc.gateway.protoc_gen_openap" +
      "iv2.options\032 google/protobuf/descriptor." +
      "proto\032,protoc-gen-openapiv2/options/open" +
      "apiv2.proto:~\n\021openapiv2_swagger\022\034.googl" +
      "e.protobuf.FileOptions\030\222\010 \001(\01322.grpc.gat" +
      "eway.protoc_gen_openapiv2.options.Swagge" +
      "rR\020openapiv2Swagger:\206\001\n\023openapiv2_operat" +
      "ion\022\036.google.protobuf.MethodOptions\030\222\010 \001" +
      "(\01324.grpc.gateway.protoc_gen_openapiv2.o" +
      "ptions.OperationR\022openapiv2Operation:~\n\020" +
      "openapiv2_schema\022\037.google.protobuf.Messa" +
      "geOptions\030\222\010 \001(\01321.grpc.gateway.protoc_g" +
      "en_openapiv2.options.SchemaR\017openapiv2Sc" +
      "hema:u\n\ropenapiv2_tag\022\037.google.protobuf." +
      "ServiceOptions\030\222\010 \001(\0132..grpc.gateway.pro" +
      "toc_gen_openapiv2.options.TagR\014openapiv2" +
      "Tag:~\n\017openapiv2_field\022\035.google.protobuf" +
      ".FieldOptions\030\222\010 \001(\01325.grpc.gateway.prot" +
      "oc_gen_openapiv2.options.JSONSchemaR\016ope" +
      "napiv2FieldB\311\002\n-com.grpc.gateway.protoc_" +
      "gen_openapiv2.optionsB\020AnnotationsProtoP" +
      "\001ZFgithub.com/grpc-ecosystem/grpc-gatewa" +
      "y/v2/protoc-gen-openapiv2/options\242\002\004GGPO" +
      "\252\002\'Grpc.Gateway.ProtocGenOpenapiv2.Optio" +
      "ns\312\002\'Grpc\\Gateway\\ProtocGenOpenapiv2\\Opt" +
      "ions\342\0023Grpc\\Gateway\\ProtocGenOpenapiv2\\O" +
      "ptions\\GPBMetadata\352\002*Grpc::Gateway::Prot" +
      "ocGenOpenapiv2::Optionsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
          com.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.getDescriptor(),
        });
    openapiv2Swagger.internalInit(descriptor.getExtensions().get(0));
    openapiv2Operation.internalInit(descriptor.getExtensions().get(1));
    openapiv2Schema.internalInit(descriptor.getExtensions().get(2));
    openapiv2Tag.internalInit(descriptor.getExtensions().get(3));
    openapiv2Field.internalInit(descriptor.getExtensions().get(4));
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.DescriptorProtos.getDescriptor();
    com.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
