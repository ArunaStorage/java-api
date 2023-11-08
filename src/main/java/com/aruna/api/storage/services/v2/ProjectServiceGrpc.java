package com.aruna.api.storage.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ProjectService
 * Contains all methods that get/create or update Projects and associated resources
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: aruna/api/storage/services/v2/project_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProjectServiceGrpc {

  private ProjectServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "aruna.api.storage.services.v2.ProjectService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateProjectRequest,
      com.aruna.api.storage.services.v2.CreateProjectResponse> getCreateProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProject",
      requestType = com.aruna.api.storage.services.v2.CreateProjectRequest.class,
      responseType = com.aruna.api.storage.services.v2.CreateProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateProjectRequest,
      com.aruna.api.storage.services.v2.CreateProjectResponse> getCreateProjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateProjectRequest, com.aruna.api.storage.services.v2.CreateProjectResponse> getCreateProjectMethod;
    if ((getCreateProjectMethod = ProjectServiceGrpc.getCreateProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getCreateProjectMethod = ProjectServiceGrpc.getCreateProjectMethod) == null) {
          ProjectServiceGrpc.getCreateProjectMethod = getCreateProjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.CreateProjectRequest, com.aruna.api.storage.services.v2.CreateProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("CreateProject"))
              .build();
        }
      }
    }
    return getCreateProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetProjectRequest,
      com.aruna.api.storage.services.v2.GetProjectResponse> getGetProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProject",
      requestType = com.aruna.api.storage.services.v2.GetProjectRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetProjectRequest,
      com.aruna.api.storage.services.v2.GetProjectResponse> getGetProjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetProjectRequest, com.aruna.api.storage.services.v2.GetProjectResponse> getGetProjectMethod;
    if ((getGetProjectMethod = ProjectServiceGrpc.getGetProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getGetProjectMethod = ProjectServiceGrpc.getGetProjectMethod) == null) {
          ProjectServiceGrpc.getGetProjectMethod = getGetProjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetProjectRequest, com.aruna.api.storage.services.v2.GetProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("GetProject"))
              .build();
        }
      }
    }
    return getGetProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetProjectsRequest,
      com.aruna.api.storage.services.v2.GetProjectsResponse> getGetProjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProjects",
      requestType = com.aruna.api.storage.services.v2.GetProjectsRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetProjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetProjectsRequest,
      com.aruna.api.storage.services.v2.GetProjectsResponse> getGetProjectsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetProjectsRequest, com.aruna.api.storage.services.v2.GetProjectsResponse> getGetProjectsMethod;
    if ((getGetProjectsMethod = ProjectServiceGrpc.getGetProjectsMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getGetProjectsMethod = ProjectServiceGrpc.getGetProjectsMethod) == null) {
          ProjectServiceGrpc.getGetProjectsMethod = getGetProjectsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetProjectsRequest, com.aruna.api.storage.services.v2.GetProjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetProjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetProjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("GetProjects"))
              .build();
        }
      }
    }
    return getGetProjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteProjectRequest,
      com.aruna.api.storage.services.v2.DeleteProjectResponse> getDeleteProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProject",
      requestType = com.aruna.api.storage.services.v2.DeleteProjectRequest.class,
      responseType = com.aruna.api.storage.services.v2.DeleteProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteProjectRequest,
      com.aruna.api.storage.services.v2.DeleteProjectResponse> getDeleteProjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteProjectRequest, com.aruna.api.storage.services.v2.DeleteProjectResponse> getDeleteProjectMethod;
    if ((getDeleteProjectMethod = ProjectServiceGrpc.getDeleteProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getDeleteProjectMethod = ProjectServiceGrpc.getDeleteProjectMethod) == null) {
          ProjectServiceGrpc.getDeleteProjectMethod = getDeleteProjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DeleteProjectRequest, com.aruna.api.storage.services.v2.DeleteProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("DeleteProject"))
              .build();
        }
      }
    }
    return getDeleteProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateProjectNameRequest,
      com.aruna.api.storage.services.v2.UpdateProjectNameResponse> getUpdateProjectNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProjectName",
      requestType = com.aruna.api.storage.services.v2.UpdateProjectNameRequest.class,
      responseType = com.aruna.api.storage.services.v2.UpdateProjectNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateProjectNameRequest,
      com.aruna.api.storage.services.v2.UpdateProjectNameResponse> getUpdateProjectNameMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateProjectNameRequest, com.aruna.api.storage.services.v2.UpdateProjectNameResponse> getUpdateProjectNameMethod;
    if ((getUpdateProjectNameMethod = ProjectServiceGrpc.getUpdateProjectNameMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getUpdateProjectNameMethod = ProjectServiceGrpc.getUpdateProjectNameMethod) == null) {
          ProjectServiceGrpc.getUpdateProjectNameMethod = getUpdateProjectNameMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.UpdateProjectNameRequest, com.aruna.api.storage.services.v2.UpdateProjectNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProjectName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateProjectNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateProjectNameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("UpdateProjectName"))
              .build();
        }
      }
    }
    return getUpdateProjectNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateProjectDescriptionRequest,
      com.aruna.api.storage.services.v2.UpdateProjectDescriptionResponse> getUpdateProjectDescriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProjectDescription",
      requestType = com.aruna.api.storage.services.v2.UpdateProjectDescriptionRequest.class,
      responseType = com.aruna.api.storage.services.v2.UpdateProjectDescriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateProjectDescriptionRequest,
      com.aruna.api.storage.services.v2.UpdateProjectDescriptionResponse> getUpdateProjectDescriptionMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateProjectDescriptionRequest, com.aruna.api.storage.services.v2.UpdateProjectDescriptionResponse> getUpdateProjectDescriptionMethod;
    if ((getUpdateProjectDescriptionMethod = ProjectServiceGrpc.getUpdateProjectDescriptionMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getUpdateProjectDescriptionMethod = ProjectServiceGrpc.getUpdateProjectDescriptionMethod) == null) {
          ProjectServiceGrpc.getUpdateProjectDescriptionMethod = getUpdateProjectDescriptionMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.UpdateProjectDescriptionRequest, com.aruna.api.storage.services.v2.UpdateProjectDescriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProjectDescription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateProjectDescriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateProjectDescriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("UpdateProjectDescription"))
              .build();
        }
      }
    }
    return getUpdateProjectDescriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateProjectKeyValuesRequest,
      com.aruna.api.storage.services.v2.UpdateProjectKeyValuesResponse> getUpdateProjectKeyValuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProjectKeyValues",
      requestType = com.aruna.api.storage.services.v2.UpdateProjectKeyValuesRequest.class,
      responseType = com.aruna.api.storage.services.v2.UpdateProjectKeyValuesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateProjectKeyValuesRequest,
      com.aruna.api.storage.services.v2.UpdateProjectKeyValuesResponse> getUpdateProjectKeyValuesMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateProjectKeyValuesRequest, com.aruna.api.storage.services.v2.UpdateProjectKeyValuesResponse> getUpdateProjectKeyValuesMethod;
    if ((getUpdateProjectKeyValuesMethod = ProjectServiceGrpc.getUpdateProjectKeyValuesMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getUpdateProjectKeyValuesMethod = ProjectServiceGrpc.getUpdateProjectKeyValuesMethod) == null) {
          ProjectServiceGrpc.getUpdateProjectKeyValuesMethod = getUpdateProjectKeyValuesMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.UpdateProjectKeyValuesRequest, com.aruna.api.storage.services.v2.UpdateProjectKeyValuesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProjectKeyValues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateProjectKeyValuesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateProjectKeyValuesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("UpdateProjectKeyValues"))
              .build();
        }
      }
    }
    return getUpdateProjectKeyValuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateProjectDataClassRequest,
      com.aruna.api.storage.services.v2.UpdateProjectDataClassResponse> getUpdateProjectDataClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProjectDataClass",
      requestType = com.aruna.api.storage.services.v2.UpdateProjectDataClassRequest.class,
      responseType = com.aruna.api.storage.services.v2.UpdateProjectDataClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateProjectDataClassRequest,
      com.aruna.api.storage.services.v2.UpdateProjectDataClassResponse> getUpdateProjectDataClassMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateProjectDataClassRequest, com.aruna.api.storage.services.v2.UpdateProjectDataClassResponse> getUpdateProjectDataClassMethod;
    if ((getUpdateProjectDataClassMethod = ProjectServiceGrpc.getUpdateProjectDataClassMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getUpdateProjectDataClassMethod = ProjectServiceGrpc.getUpdateProjectDataClassMethod) == null) {
          ProjectServiceGrpc.getUpdateProjectDataClassMethod = getUpdateProjectDataClassMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.UpdateProjectDataClassRequest, com.aruna.api.storage.services.v2.UpdateProjectDataClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProjectDataClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateProjectDataClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateProjectDataClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("UpdateProjectDataClass"))
              .build();
        }
      }
    }
    return getUpdateProjectDataClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest,
      com.aruna.api.storage.services.v2.UpdateProjectLicensesResponse> getUpdateProjectLicensesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProjectLicenses",
      requestType = com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest.class,
      responseType = com.aruna.api.storage.services.v2.UpdateProjectLicensesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest,
      com.aruna.api.storage.services.v2.UpdateProjectLicensesResponse> getUpdateProjectLicensesMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest, com.aruna.api.storage.services.v2.UpdateProjectLicensesResponse> getUpdateProjectLicensesMethod;
    if ((getUpdateProjectLicensesMethod = ProjectServiceGrpc.getUpdateProjectLicensesMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getUpdateProjectLicensesMethod = ProjectServiceGrpc.getUpdateProjectLicensesMethod) == null) {
          ProjectServiceGrpc.getUpdateProjectLicensesMethod = getUpdateProjectLicensesMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest, com.aruna.api.storage.services.v2.UpdateProjectLicensesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProjectLicenses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateProjectLicensesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("UpdateProjectLicenses"))
              .build();
        }
      }
    }
    return getUpdateProjectLicensesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ArchiveProjectRequest,
      com.aruna.api.storage.services.v2.ArchiveProjectResponse> getArchiveProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ArchiveProject",
      requestType = com.aruna.api.storage.services.v2.ArchiveProjectRequest.class,
      responseType = com.aruna.api.storage.services.v2.ArchiveProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ArchiveProjectRequest,
      com.aruna.api.storage.services.v2.ArchiveProjectResponse> getArchiveProjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ArchiveProjectRequest, com.aruna.api.storage.services.v2.ArchiveProjectResponse> getArchiveProjectMethod;
    if ((getArchiveProjectMethod = ProjectServiceGrpc.getArchiveProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getArchiveProjectMethod = ProjectServiceGrpc.getArchiveProjectMethod) == null) {
          ProjectServiceGrpc.getArchiveProjectMethod = getArchiveProjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ArchiveProjectRequest, com.aruna.api.storage.services.v2.ArchiveProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ArchiveProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ArchiveProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ArchiveProjectResponse.getDefaultInstance()))
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
    default void createProject(com.aruna.api.storage.services.v2.CreateProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateProjectResponse> responseObserver) {
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
    default void getProject(com.aruna.api.storage.services.v2.GetProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetProjectResponse> responseObserver) {
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
    default void getProjects(com.aruna.api.storage.services.v2.GetProjectsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetProjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteProject
     * Status: BETA
     * Deletes the project and all its associated data. Must be empty!
     * </pre>
     */
    default void deleteProject(com.aruna.api.storage.services.v2.DeleteProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteProjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateProjectName
     * Status: BETA
     * Updates the project name. Caveat! Will rename the "s3 bucket" for data proxies! 
     * </pre>
     */
    default void updateProjectName(com.aruna.api.storage.services.v2.UpdateProjectNameRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateProjectNameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProjectNameMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateProjectDescription
     * Status: BETA
     * Updates the project name.
     * </pre>
     */
    default void updateProjectDescription(com.aruna.api.storage.services.v2.UpdateProjectDescriptionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateProjectDescriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProjectDescriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateProjectKeyValues
     * Status: BETA
     * Updates the project key values.
     * </pre>
     */
    default void updateProjectKeyValues(com.aruna.api.storage.services.v2.UpdateProjectKeyValuesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateProjectKeyValuesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProjectKeyValuesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateProjectDataClass
     * Status: BETA
     * Updates the project name. All (meta) data will be overwritten.
     * </pre>
     */
    default void updateProjectDataClass(com.aruna.api.storage.services.v2.UpdateProjectDataClassRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateProjectDataClassResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProjectDataClassMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateLicense
     * Status: BETA
     * Updates the project license. All (meta) data will be overwritten.
     * </pre>
     */
    default void updateProjectLicenses(com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateProjectLicensesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProjectLicensesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ArchiveProjectRequest
     * Status: BETA
     * Archives the full project, rendering all downstream relations immutable
     * </pre>
     */
    default void archiveProject(com.aruna.api.storage.services.v2.ArchiveProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ArchiveProjectResponse> responseObserver) {
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
    public void createProject(com.aruna.api.storage.services.v2.CreateProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateProjectResponse> responseObserver) {
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
    public void getProject(com.aruna.api.storage.services.v2.GetProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetProjectResponse> responseObserver) {
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
    public void getProjects(com.aruna.api.storage.services.v2.GetProjectsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetProjectsResponse> responseObserver) {
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
    public void deleteProject(com.aruna.api.storage.services.v2.DeleteProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteProjectResponse> responseObserver) {
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
    public void updateProjectName(com.aruna.api.storage.services.v2.UpdateProjectNameRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateProjectNameResponse> responseObserver) {
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
    public void updateProjectDescription(com.aruna.api.storage.services.v2.UpdateProjectDescriptionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateProjectDescriptionResponse> responseObserver) {
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
    public void updateProjectKeyValues(com.aruna.api.storage.services.v2.UpdateProjectKeyValuesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateProjectKeyValuesResponse> responseObserver) {
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
    public void updateProjectDataClass(com.aruna.api.storage.services.v2.UpdateProjectDataClassRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateProjectDataClassResponse> responseObserver) {
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
    public void updateProjectLicenses(com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateProjectLicensesResponse> responseObserver) {
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
    public void archiveProject(com.aruna.api.storage.services.v2.ArchiveProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ArchiveProjectResponse> responseObserver) {
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
    public com.aruna.api.storage.services.v2.CreateProjectResponse createProject(com.aruna.api.storage.services.v2.CreateProjectRequest request) {
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
    public com.aruna.api.storage.services.v2.GetProjectResponse getProject(com.aruna.api.storage.services.v2.GetProjectRequest request) {
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
    public com.aruna.api.storage.services.v2.GetProjectsResponse getProjects(com.aruna.api.storage.services.v2.GetProjectsRequest request) {
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
    public com.aruna.api.storage.services.v2.DeleteProjectResponse deleteProject(com.aruna.api.storage.services.v2.DeleteProjectRequest request) {
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
    public com.aruna.api.storage.services.v2.UpdateProjectNameResponse updateProjectName(com.aruna.api.storage.services.v2.UpdateProjectNameRequest request) {
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
    public com.aruna.api.storage.services.v2.UpdateProjectDescriptionResponse updateProjectDescription(com.aruna.api.storage.services.v2.UpdateProjectDescriptionRequest request) {
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
    public com.aruna.api.storage.services.v2.UpdateProjectKeyValuesResponse updateProjectKeyValues(com.aruna.api.storage.services.v2.UpdateProjectKeyValuesRequest request) {
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
    public com.aruna.api.storage.services.v2.UpdateProjectDataClassResponse updateProjectDataClass(com.aruna.api.storage.services.v2.UpdateProjectDataClassRequest request) {
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
    public com.aruna.api.storage.services.v2.UpdateProjectLicensesResponse updateProjectLicenses(com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest request) {
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
    public com.aruna.api.storage.services.v2.ArchiveProjectResponse archiveProject(com.aruna.api.storage.services.v2.ArchiveProjectRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.CreateProjectResponse> createProject(
        com.aruna.api.storage.services.v2.CreateProjectRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetProjectResponse> getProject(
        com.aruna.api.storage.services.v2.GetProjectRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetProjectsResponse> getProjects(
        com.aruna.api.storage.services.v2.GetProjectsRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DeleteProjectResponse> deleteProject(
        com.aruna.api.storage.services.v2.DeleteProjectRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.UpdateProjectNameResponse> updateProjectName(
        com.aruna.api.storage.services.v2.UpdateProjectNameRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.UpdateProjectDescriptionResponse> updateProjectDescription(
        com.aruna.api.storage.services.v2.UpdateProjectDescriptionRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.UpdateProjectKeyValuesResponse> updateProjectKeyValues(
        com.aruna.api.storage.services.v2.UpdateProjectKeyValuesRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.UpdateProjectDataClassResponse> updateProjectDataClass(
        com.aruna.api.storage.services.v2.UpdateProjectDataClassRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.UpdateProjectLicensesResponse> updateProjectLicenses(
        com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ArchiveProjectResponse> archiveProject(
        com.aruna.api.storage.services.v2.ArchiveProjectRequest request) {
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
          serviceImpl.createProject((com.aruna.api.storage.services.v2.CreateProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateProjectResponse>) responseObserver);
          break;
        case METHODID_GET_PROJECT:
          serviceImpl.getProject((com.aruna.api.storage.services.v2.GetProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetProjectResponse>) responseObserver);
          break;
        case METHODID_GET_PROJECTS:
          serviceImpl.getProjects((com.aruna.api.storage.services.v2.GetProjectsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetProjectsResponse>) responseObserver);
          break;
        case METHODID_DELETE_PROJECT:
          serviceImpl.deleteProject((com.aruna.api.storage.services.v2.DeleteProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteProjectResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROJECT_NAME:
          serviceImpl.updateProjectName((com.aruna.api.storage.services.v2.UpdateProjectNameRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateProjectNameResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROJECT_DESCRIPTION:
          serviceImpl.updateProjectDescription((com.aruna.api.storage.services.v2.UpdateProjectDescriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateProjectDescriptionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROJECT_KEY_VALUES:
          serviceImpl.updateProjectKeyValues((com.aruna.api.storage.services.v2.UpdateProjectKeyValuesRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateProjectKeyValuesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROJECT_DATA_CLASS:
          serviceImpl.updateProjectDataClass((com.aruna.api.storage.services.v2.UpdateProjectDataClassRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateProjectDataClassResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROJECT_LICENSES:
          serviceImpl.updateProjectLicenses((com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateProjectLicensesResponse>) responseObserver);
          break;
        case METHODID_ARCHIVE_PROJECT:
          serviceImpl.archiveProject((com.aruna.api.storage.services.v2.ArchiveProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ArchiveProjectResponse>) responseObserver);
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
              com.aruna.api.storage.services.v2.CreateProjectRequest,
              com.aruna.api.storage.services.v2.CreateProjectResponse>(
                service, METHODID_CREATE_PROJECT)))
        .addMethod(
          getGetProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetProjectRequest,
              com.aruna.api.storage.services.v2.GetProjectResponse>(
                service, METHODID_GET_PROJECT)))
        .addMethod(
          getGetProjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetProjectsRequest,
              com.aruna.api.storage.services.v2.GetProjectsResponse>(
                service, METHODID_GET_PROJECTS)))
        .addMethod(
          getDeleteProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DeleteProjectRequest,
              com.aruna.api.storage.services.v2.DeleteProjectResponse>(
                service, METHODID_DELETE_PROJECT)))
        .addMethod(
          getUpdateProjectNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.UpdateProjectNameRequest,
              com.aruna.api.storage.services.v2.UpdateProjectNameResponse>(
                service, METHODID_UPDATE_PROJECT_NAME)))
        .addMethod(
          getUpdateProjectDescriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.UpdateProjectDescriptionRequest,
              com.aruna.api.storage.services.v2.UpdateProjectDescriptionResponse>(
                service, METHODID_UPDATE_PROJECT_DESCRIPTION)))
        .addMethod(
          getUpdateProjectKeyValuesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.UpdateProjectKeyValuesRequest,
              com.aruna.api.storage.services.v2.UpdateProjectKeyValuesResponse>(
                service, METHODID_UPDATE_PROJECT_KEY_VALUES)))
        .addMethod(
          getUpdateProjectDataClassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.UpdateProjectDataClassRequest,
              com.aruna.api.storage.services.v2.UpdateProjectDataClassResponse>(
                service, METHODID_UPDATE_PROJECT_DATA_CLASS)))
        .addMethod(
          getUpdateProjectLicensesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.UpdateProjectLicensesRequest,
              com.aruna.api.storage.services.v2.UpdateProjectLicensesResponse>(
                service, METHODID_UPDATE_PROJECT_LICENSES)))
        .addMethod(
          getArchiveProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ArchiveProjectRequest,
              com.aruna.api.storage.services.v2.ArchiveProjectResponse>(
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
    private final java.lang.String methodName;

    ProjectServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
