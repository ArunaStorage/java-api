package com.aruna.api.storage.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ProjectService
 * Contains all methods that get/create or update Projects and associated resources
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/storage/services/v2/project_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProjectServiceGrpc {

  private ProjectServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.storage.services.v2.ProjectService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.CreateProjectRequest,
      com.aruna.api.storage.services.v2.ProjectServiceProto.CreateProjectResponse> getCreateProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProject",
      requestType = com.aruna.api.storage.services.v2.ProjectServiceProto.CreateProjectRequest.class,
      responseType = com.aruna.api.storage.services.v2.ProjectServiceProto.CreateProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.CreateProjectRequest,
      com.aruna.api.storage.services.v2.ProjectServiceProto.CreateProjectResponse> getCreateProjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.CreateProjectRequest, com.aruna.api.storage.services.v2.ProjectServiceProto.CreateProjectResponse> getCreateProjectMethod;
    if ((getCreateProjectMethod = ProjectServiceGrpc.getCreateProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getCreateProjectMethod = ProjectServiceGrpc.getCreateProjectMethod) == null) {
          ProjectServiceGrpc.getCreateProjectMethod = getCreateProjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ProjectServiceProto.CreateProjectRequest, com.aruna.api.storage.services.v2.ProjectServiceProto.CreateProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ProjectServiceProto.CreateProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ProjectServiceProto.CreateProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("CreateProject"))
              .build();
        }
      }
    }
    return getCreateProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectRequest,
      com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectResponse> getGetProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProject",
      requestType = com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectRequest.class,
      responseType = com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectRequest,
      com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectResponse> getGetProjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectRequest, com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectResponse> getGetProjectMethod;
    if ((getGetProjectMethod = ProjectServiceGrpc.getGetProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getGetProjectMethod = ProjectServiceGrpc.getGetProjectMethod) == null) {
          ProjectServiceGrpc.getGetProjectMethod = getGetProjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectRequest, com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("GetProject"))
              .build();
        }
      }
    }
    return getGetProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectsRequest,
      com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectsResponse> getGetProjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProjects",
      requestType = com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectsRequest.class,
      responseType = com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectsRequest,
      com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectsResponse> getGetProjectsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectsRequest, com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectsResponse> getGetProjectsMethod;
    if ((getGetProjectsMethod = ProjectServiceGrpc.getGetProjectsMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getGetProjectsMethod = ProjectServiceGrpc.getGetProjectsMethod) == null) {
          ProjectServiceGrpc.getGetProjectsMethod = getGetProjectsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectsRequest, com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("GetProjects"))
              .build();
        }
      }
    }
    return getGetProjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.DeleteProjectRequest,
      com.aruna.api.storage.services.v2.ProjectServiceProto.DeleteProjectResponse> getDeleteProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProject",
      requestType = com.aruna.api.storage.services.v2.ProjectServiceProto.DeleteProjectRequest.class,
      responseType = com.aruna.api.storage.services.v2.ProjectServiceProto.DeleteProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.DeleteProjectRequest,
      com.aruna.api.storage.services.v2.ProjectServiceProto.DeleteProjectResponse> getDeleteProjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.DeleteProjectRequest, com.aruna.api.storage.services.v2.ProjectServiceProto.DeleteProjectResponse> getDeleteProjectMethod;
    if ((getDeleteProjectMethod = ProjectServiceGrpc.getDeleteProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getDeleteProjectMethod = ProjectServiceGrpc.getDeleteProjectMethod) == null) {
          ProjectServiceGrpc.getDeleteProjectMethod = getDeleteProjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ProjectServiceProto.DeleteProjectRequest, com.aruna.api.storage.services.v2.ProjectServiceProto.DeleteProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ProjectServiceProto.DeleteProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ProjectServiceProto.DeleteProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("DeleteProject"))
              .build();
        }
      }
    }
    return getDeleteProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectNameRequest,
      com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectNameResponse> getUpdateProjectNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProjectName",
      requestType = com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectNameRequest.class,
      responseType = com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectNameRequest,
      com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectNameResponse> getUpdateProjectNameMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectNameRequest, com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectNameResponse> getUpdateProjectNameMethod;
    if ((getUpdateProjectNameMethod = ProjectServiceGrpc.getUpdateProjectNameMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getUpdateProjectNameMethod = ProjectServiceGrpc.getUpdateProjectNameMethod) == null) {
          ProjectServiceGrpc.getUpdateProjectNameMethod = getUpdateProjectNameMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectNameRequest, com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProjectName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectNameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("UpdateProjectName"))
              .build();
        }
      }
    }
    return getUpdateProjectNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDescriptionRequest,
      com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDescriptionResponse> getUpdateProjectDescriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProjectDescription",
      requestType = com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDescriptionRequest.class,
      responseType = com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDescriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDescriptionRequest,
      com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDescriptionResponse> getUpdateProjectDescriptionMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDescriptionRequest, com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDescriptionResponse> getUpdateProjectDescriptionMethod;
    if ((getUpdateProjectDescriptionMethod = ProjectServiceGrpc.getUpdateProjectDescriptionMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getUpdateProjectDescriptionMethod = ProjectServiceGrpc.getUpdateProjectDescriptionMethod) == null) {
          ProjectServiceGrpc.getUpdateProjectDescriptionMethod = getUpdateProjectDescriptionMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDescriptionRequest, com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDescriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProjectDescription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDescriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDescriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("UpdateProjectDescription"))
              .build();
        }
      }
    }
    return getUpdateProjectDescriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectKeyValuesRequest,
      com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectKeyValuesResponse> getUpdateProjectKeyValuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProjectKeyValues",
      requestType = com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectKeyValuesRequest.class,
      responseType = com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectKeyValuesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectKeyValuesRequest,
      com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectKeyValuesResponse> getUpdateProjectKeyValuesMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectKeyValuesRequest, com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectKeyValuesResponse> getUpdateProjectKeyValuesMethod;
    if ((getUpdateProjectKeyValuesMethod = ProjectServiceGrpc.getUpdateProjectKeyValuesMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getUpdateProjectKeyValuesMethod = ProjectServiceGrpc.getUpdateProjectKeyValuesMethod) == null) {
          ProjectServiceGrpc.getUpdateProjectKeyValuesMethod = getUpdateProjectKeyValuesMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectKeyValuesRequest, com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectKeyValuesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProjectKeyValues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectKeyValuesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectKeyValuesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("UpdateProjectKeyValues"))
              .build();
        }
      }
    }
    return getUpdateProjectKeyValuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDataClassRequest,
      com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDataClassResponse> getUpdateProjectDataClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProjectDataClass",
      requestType = com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDataClassRequest.class,
      responseType = com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDataClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDataClassRequest,
      com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDataClassResponse> getUpdateProjectDataClassMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDataClassRequest, com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDataClassResponse> getUpdateProjectDataClassMethod;
    if ((getUpdateProjectDataClassMethod = ProjectServiceGrpc.getUpdateProjectDataClassMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getUpdateProjectDataClassMethod = ProjectServiceGrpc.getUpdateProjectDataClassMethod) == null) {
          ProjectServiceGrpc.getUpdateProjectDataClassMethod = getUpdateProjectDataClassMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDataClassRequest, com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDataClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProjectDataClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDataClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDataClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("UpdateProjectDataClass"))
              .build();
        }
      }
    }
    return getUpdateProjectDataClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectLicensesRequest,
      com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectLicensesResponse> getUpdateProjectLicensesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProjectLicenses",
      requestType = com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectLicensesRequest.class,
      responseType = com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectLicensesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectLicensesRequest,
      com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectLicensesResponse> getUpdateProjectLicensesMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectLicensesRequest, com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectLicensesResponse> getUpdateProjectLicensesMethod;
    if ((getUpdateProjectLicensesMethod = ProjectServiceGrpc.getUpdateProjectLicensesMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getUpdateProjectLicensesMethod = ProjectServiceGrpc.getUpdateProjectLicensesMethod) == null) {
          ProjectServiceGrpc.getUpdateProjectLicensesMethod = getUpdateProjectLicensesMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectLicensesRequest, com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectLicensesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProjectLicenses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectLicensesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectLicensesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("UpdateProjectLicenses"))
              .build();
        }
      }
    }
    return getUpdateProjectLicensesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.ArchiveProjectRequest,
      com.aruna.api.storage.services.v2.ProjectServiceProto.ArchiveProjectResponse> getArchiveProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ArchiveProject",
      requestType = com.aruna.api.storage.services.v2.ProjectServiceProto.ArchiveProjectRequest.class,
      responseType = com.aruna.api.storage.services.v2.ProjectServiceProto.ArchiveProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.ArchiveProjectRequest,
      com.aruna.api.storage.services.v2.ProjectServiceProto.ArchiveProjectResponse> getArchiveProjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ProjectServiceProto.ArchiveProjectRequest, com.aruna.api.storage.services.v2.ProjectServiceProto.ArchiveProjectResponse> getArchiveProjectMethod;
    if ((getArchiveProjectMethod = ProjectServiceGrpc.getArchiveProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getArchiveProjectMethod = ProjectServiceGrpc.getArchiveProjectMethod) == null) {
          ProjectServiceGrpc.getArchiveProjectMethod = getArchiveProjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ProjectServiceProto.ArchiveProjectRequest, com.aruna.api.storage.services.v2.ProjectServiceProto.ArchiveProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ArchiveProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ProjectServiceProto.ArchiveProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ProjectServiceProto.ArchiveProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("ArchiveProject"))
              .build();
        }
      }
    }
    return getArchiveProjectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProjectServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectServiceStub>() {
        @java.lang.Override
        public ProjectServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectServiceStub(channel, callOptions);
        }
      };
    return ProjectServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectServiceBlockingStub>() {
        @java.lang.Override
        public ProjectServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectServiceBlockingStub(channel, callOptions);
        }
      };
    return ProjectServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProjectServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectServiceFutureStub>() {
        @java.lang.Override
        public ProjectServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectServiceFutureStub(channel, callOptions);
        }
      };
    return ProjectServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ProjectService
   * Contains all methods that get/create or update Projects and associated resources
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateProject
     * Status: BETA
     * Creates a new project. All subsequent resources are part of a project.
     * </pre>
     */
    default void createProject(com.aruna.api.storage.services.v2.ProjectServiceProto.CreateProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.CreateProjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProject
     * Status: BETA
     * 
     * Requests a project (by id)
     * </pre>
     */
    default void getProject(com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProjects
     * Status: BETA
     * 
     * Admin request to get all projects
     * </pre>
     */
    default void getProjects(com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteProject
     * Status: BETA
     * Deletes the project and all its associated data. Must be empty!
     * </pre>
     */
    default void deleteProject(com.aruna.api.storage.services.v2.ProjectServiceProto.DeleteProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.DeleteProjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateProjectName
     * Status: BETA
     * Updates the project name. Caveat! Will rename the "s3 bucket" for data proxies! 
     * </pre>
     */
    default void updateProjectName(com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectNameRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectNameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProjectNameMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateProjectDescription
     * Status: BETA
     * Updates the project name.
     * </pre>
     */
    default void updateProjectDescription(com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDescriptionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDescriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProjectDescriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateProjectKeyValues
     * Status: BETA
     * Updates the project key values.
     * </pre>
     */
    default void updateProjectKeyValues(com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectKeyValuesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectKeyValuesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProjectKeyValuesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateProjectDataClass
     * Status: BETA
     * Updates the project name. All (meta) data will be overwritten.
     * </pre>
     */
    default void updateProjectDataClass(com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDataClassRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDataClassResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProjectDataClassMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateLicense
     * Status: BETA
     * Updates the project license. All (meta) data will be overwritten.
     * </pre>
     */
    default void updateProjectLicenses(com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectLicensesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectLicensesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProjectLicensesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ArchiveProjectRequest
     * Status: BETA
     * Archives the full project, rendering all downstream relations immutable
     * </pre>
     */
    default void archiveProject(com.aruna.api.storage.services.v2.ProjectServiceProto.ArchiveProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.ArchiveProjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getArchiveProjectMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProjectService.
   * <pre>
   * ProjectService
   * Contains all methods that get/create or update Projects and associated resources
   * </pre>
   */
  public static abstract class ProjectServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProjectServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProjectService.
   * <pre>
   * ProjectService
   * Contains all methods that get/create or update Projects and associated resources
   * </pre>
   */
  public static final class ProjectServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProjectServiceStub> {
    private ProjectServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateProject
     * Status: BETA
     * Creates a new project. All subsequent resources are part of a project.
     * </pre>
     */
    public void createProject(com.aruna.api.storage.services.v2.ProjectServiceProto.CreateProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.CreateProjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProject
     * Status: BETA
     * 
     * Requests a project (by id)
     * </pre>
     */
    public void getProject(com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProjects
     * Status: BETA
     * 
     * Admin request to get all projects
     * </pre>
     */
    public void getProjects(com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteProject
     * Status: BETA
     * Deletes the project and all its associated data. Must be empty!
     * </pre>
     */
    public void deleteProject(com.aruna.api.storage.services.v2.ProjectServiceProto.DeleteProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.DeleteProjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateProjectName
     * Status: BETA
     * Updates the project name. Caveat! Will rename the "s3 bucket" for data proxies! 
     * </pre>
     */
    public void updateProjectName(com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectNameRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectNameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProjectNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateProjectDescription
     * Status: BETA
     * Updates the project name.
     * </pre>
     */
    public void updateProjectDescription(com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDescriptionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDescriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProjectDescriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateProjectKeyValues
     * Status: BETA
     * Updates the project key values.
     * </pre>
     */
    public void updateProjectKeyValues(com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectKeyValuesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectKeyValuesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProjectKeyValuesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateProjectDataClass
     * Status: BETA
     * Updates the project name. All (meta) data will be overwritten.
     * </pre>
     */
    public void updateProjectDataClass(com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDataClassRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDataClassResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProjectDataClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateLicense
     * Status: BETA
     * Updates the project license. All (meta) data will be overwritten.
     * </pre>
     */
    public void updateProjectLicenses(com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectLicensesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectLicensesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProjectLicensesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ArchiveProjectRequest
     * Status: BETA
     * Archives the full project, rendering all downstream relations immutable
     * </pre>
     */
    public void archiveProject(com.aruna.api.storage.services.v2.ProjectServiceProto.ArchiveProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.ArchiveProjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getArchiveProjectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProjectService.
   * <pre>
   * ProjectService
   * Contains all methods that get/create or update Projects and associated resources
   * </pre>
   */
  public static final class ProjectServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProjectServiceBlockingStub> {
    private ProjectServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateProject
     * Status: BETA
     * Creates a new project. All subsequent resources are part of a project.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.ProjectServiceProto.CreateProjectResponse createProject(com.aruna.api.storage.services.v2.ProjectServiceProto.CreateProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProject
     * Status: BETA
     * 
     * Requests a project (by id)
     * </pre>
     */
    public com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectResponse getProject(com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProjects
     * Status: BETA
     * 
     * Admin request to get all projects
     * </pre>
     */
    public com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectsResponse getProjects(com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteProject
     * Status: BETA
     * Deletes the project and all its associated data. Must be empty!
     * </pre>
     */
    public com.aruna.api.storage.services.v2.ProjectServiceProto.DeleteProjectResponse deleteProject(com.aruna.api.storage.services.v2.ProjectServiceProto.DeleteProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateProjectName
     * Status: BETA
     * Updates the project name. Caveat! Will rename the "s3 bucket" for data proxies! 
     * </pre>
     */
    public com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectNameResponse updateProjectName(com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProjectNameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateProjectDescription
     * Status: BETA
     * Updates the project name.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDescriptionResponse updateProjectDescription(com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDescriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProjectDescriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateProjectKeyValues
     * Status: BETA
     * Updates the project key values.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectKeyValuesResponse updateProjectKeyValues(com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectKeyValuesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProjectKeyValuesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateProjectDataClass
     * Status: BETA
     * Updates the project name. All (meta) data will be overwritten.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDataClassResponse updateProjectDataClass(com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDataClassRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProjectDataClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateLicense
     * Status: BETA
     * Updates the project license. All (meta) data will be overwritten.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectLicensesResponse updateProjectLicenses(com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectLicensesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProjectLicensesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ArchiveProjectRequest
     * Status: BETA
     * Archives the full project, rendering all downstream relations immutable
     * </pre>
     */
    public com.aruna.api.storage.services.v2.ProjectServiceProto.ArchiveProjectResponse archiveProject(com.aruna.api.storage.services.v2.ProjectServiceProto.ArchiveProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getArchiveProjectMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProjectService.
   * <pre>
   * ProjectService
   * Contains all methods that get/create or update Projects and associated resources
   * </pre>
   */
  public static final class ProjectServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProjectServiceFutureStub> {
    private ProjectServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateProject
     * Status: BETA
     * Creates a new project. All subsequent resources are part of a project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ProjectServiceProto.CreateProjectResponse> createProject(
        com.aruna.api.storage.services.v2.ProjectServiceProto.CreateProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProject
     * Status: BETA
     * 
     * Requests a project (by id)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectResponse> getProject(
        com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProjects
     * Status: BETA
     * 
     * Admin request to get all projects
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectsResponse> getProjects(
        com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteProject
     * Status: BETA
     * Deletes the project and all its associated data. Must be empty!
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ProjectServiceProto.DeleteProjectResponse> deleteProject(
        com.aruna.api.storage.services.v2.ProjectServiceProto.DeleteProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateProjectName
     * Status: BETA
     * Updates the project name. Caveat! Will rename the "s3 bucket" for data proxies! 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectNameResponse> updateProjectName(
        com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProjectNameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateProjectDescription
     * Status: BETA
     * Updates the project name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDescriptionResponse> updateProjectDescription(
        com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDescriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProjectDescriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateProjectKeyValues
     * Status: BETA
     * Updates the project key values.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectKeyValuesResponse> updateProjectKeyValues(
        com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectKeyValuesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProjectKeyValuesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateProjectDataClass
     * Status: BETA
     * Updates the project name. All (meta) data will be overwritten.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDataClassResponse> updateProjectDataClass(
        com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDataClassRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProjectDataClassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateLicense
     * Status: BETA
     * Updates the project license. All (meta) data will be overwritten.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectLicensesResponse> updateProjectLicenses(
        com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectLicensesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProjectLicensesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ArchiveProjectRequest
     * Status: BETA
     * Archives the full project, rendering all downstream relations immutable
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ProjectServiceProto.ArchiveProjectResponse> archiveProject(
        com.aruna.api.storage.services.v2.ProjectServiceProto.ArchiveProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getArchiveProjectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PROJECT = 0;
  private static final int METHODID_GET_PROJECT = 1;
  private static final int METHODID_GET_PROJECTS = 2;
  private static final int METHODID_DELETE_PROJECT = 3;
  private static final int METHODID_UPDATE_PROJECT_NAME = 4;
  private static final int METHODID_UPDATE_PROJECT_DESCRIPTION = 5;
  private static final int METHODID_UPDATE_PROJECT_KEY_VALUES = 6;
  private static final int METHODID_UPDATE_PROJECT_DATA_CLASS = 7;
  private static final int METHODID_UPDATE_PROJECT_LICENSES = 8;
  private static final int METHODID_ARCHIVE_PROJECT = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PROJECT:
          serviceImpl.createProject((com.aruna.api.storage.services.v2.ProjectServiceProto.CreateProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.CreateProjectResponse>) responseObserver);
          break;
        case METHODID_GET_PROJECT:
          serviceImpl.getProject((com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectResponse>) responseObserver);
          break;
        case METHODID_GET_PROJECTS:
          serviceImpl.getProjects((com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectsResponse>) responseObserver);
          break;
        case METHODID_DELETE_PROJECT:
          serviceImpl.deleteProject((com.aruna.api.storage.services.v2.ProjectServiceProto.DeleteProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.DeleteProjectResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROJECT_NAME:
          serviceImpl.updateProjectName((com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectNameRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectNameResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROJECT_DESCRIPTION:
          serviceImpl.updateProjectDescription((com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDescriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDescriptionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROJECT_KEY_VALUES:
          serviceImpl.updateProjectKeyValues((com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectKeyValuesRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectKeyValuesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROJECT_DATA_CLASS:
          serviceImpl.updateProjectDataClass((com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDataClassRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDataClassResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROJECT_LICENSES:
          serviceImpl.updateProjectLicenses((com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectLicensesRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectLicensesResponse>) responseObserver);
          break;
        case METHODID_ARCHIVE_PROJECT:
          serviceImpl.archiveProject((com.aruna.api.storage.services.v2.ProjectServiceProto.ArchiveProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ProjectServiceProto.ArchiveProjectResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ProjectServiceProto.CreateProjectRequest,
              com.aruna.api.storage.services.v2.ProjectServiceProto.CreateProjectResponse>(
                service, METHODID_CREATE_PROJECT)))
        .addMethod(
          getGetProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectRequest,
              com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectResponse>(
                service, METHODID_GET_PROJECT)))
        .addMethod(
          getGetProjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectsRequest,
              com.aruna.api.storage.services.v2.ProjectServiceProto.GetProjectsResponse>(
                service, METHODID_GET_PROJECTS)))
        .addMethod(
          getDeleteProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ProjectServiceProto.DeleteProjectRequest,
              com.aruna.api.storage.services.v2.ProjectServiceProto.DeleteProjectResponse>(
                service, METHODID_DELETE_PROJECT)))
        .addMethod(
          getUpdateProjectNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectNameRequest,
              com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectNameResponse>(
                service, METHODID_UPDATE_PROJECT_NAME)))
        .addMethod(
          getUpdateProjectDescriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDescriptionRequest,
              com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDescriptionResponse>(
                service, METHODID_UPDATE_PROJECT_DESCRIPTION)))
        .addMethod(
          getUpdateProjectKeyValuesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectKeyValuesRequest,
              com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectKeyValuesResponse>(
                service, METHODID_UPDATE_PROJECT_KEY_VALUES)))
        .addMethod(
          getUpdateProjectDataClassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDataClassRequest,
              com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectDataClassResponse>(
                service, METHODID_UPDATE_PROJECT_DATA_CLASS)))
        .addMethod(
          getUpdateProjectLicensesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectLicensesRequest,
              com.aruna.api.storage.services.v2.ProjectServiceProto.UpdateProjectLicensesResponse>(
                service, METHODID_UPDATE_PROJECT_LICENSES)))
        .addMethod(
          getArchiveProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ProjectServiceProto.ArchiveProjectRequest,
              com.aruna.api.storage.services.v2.ProjectServiceProto.ArchiveProjectResponse>(
                service, METHODID_ARCHIVE_PROJECT)))
        .build();
  }

  private static abstract class ProjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProjectServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.storage.services.v2.ProjectServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProjectService");
    }
  }

  private static final class ProjectServiceFileDescriptorSupplier
      extends ProjectServiceBaseDescriptorSupplier {
    ProjectServiceFileDescriptorSupplier() {}
  }

  private static final class ProjectServiceMethodDescriptorSupplier
      extends ProjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProjectServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProjectServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProjectServiceFileDescriptorSupplier())
              .addMethod(getCreateProjectMethod())
              .addMethod(getGetProjectMethod())
              .addMethod(getGetProjectsMethod())
              .addMethod(getDeleteProjectMethod())
              .addMethod(getUpdateProjectNameMethod())
              .addMethod(getUpdateProjectDescriptionMethod())
              .addMethod(getUpdateProjectKeyValuesMethod())
              .addMethod(getUpdateProjectDataClassMethod())
              .addMethod(getUpdateProjectLicensesMethod())
              .addMethod(getArchiveProjectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
