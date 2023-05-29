package com.aruna.api.storage.services.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ProjectService
 * Contains all methods that get/create or update Projects and associated resources
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/storage/services/v1/project_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProjectServiceGrpc {

  private ProjectServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.storage.services.v1.ProjectService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.CreateProjectRequest,
      com.aruna.api.storage.services.v1.ProjectServiceProto.CreateProjectResponse> getCreateProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProject",
      requestType = com.aruna.api.storage.services.v1.ProjectServiceProto.CreateProjectRequest.class,
      responseType = com.aruna.api.storage.services.v1.ProjectServiceProto.CreateProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.CreateProjectRequest,
      com.aruna.api.storage.services.v1.ProjectServiceProto.CreateProjectResponse> getCreateProjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.CreateProjectRequest, com.aruna.api.storage.services.v1.ProjectServiceProto.CreateProjectResponse> getCreateProjectMethod;
    if ((getCreateProjectMethod = ProjectServiceGrpc.getCreateProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getCreateProjectMethod = ProjectServiceGrpc.getCreateProjectMethod) == null) {
          ProjectServiceGrpc.getCreateProjectMethod = getCreateProjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ProjectServiceProto.CreateProjectRequest, com.aruna.api.storage.services.v1.ProjectServiceProto.CreateProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ProjectServiceProto.CreateProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ProjectServiceProto.CreateProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("CreateProject"))
              .build();
        }
      }
    }
    return getCreateProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.AddUserToProjectRequest,
      com.aruna.api.storage.services.v1.ProjectServiceProto.AddUserToProjectResponse> getAddUserToProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUserToProject",
      requestType = com.aruna.api.storage.services.v1.ProjectServiceProto.AddUserToProjectRequest.class,
      responseType = com.aruna.api.storage.services.v1.ProjectServiceProto.AddUserToProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.AddUserToProjectRequest,
      com.aruna.api.storage.services.v1.ProjectServiceProto.AddUserToProjectResponse> getAddUserToProjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.AddUserToProjectRequest, com.aruna.api.storage.services.v1.ProjectServiceProto.AddUserToProjectResponse> getAddUserToProjectMethod;
    if ((getAddUserToProjectMethod = ProjectServiceGrpc.getAddUserToProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getAddUserToProjectMethod = ProjectServiceGrpc.getAddUserToProjectMethod) == null) {
          ProjectServiceGrpc.getAddUserToProjectMethod = getAddUserToProjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ProjectServiceProto.AddUserToProjectRequest, com.aruna.api.storage.services.v1.ProjectServiceProto.AddUserToProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUserToProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ProjectServiceProto.AddUserToProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ProjectServiceProto.AddUserToProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("AddUserToProject"))
              .build();
        }
      }
    }
    return getAddUserToProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectRequest,
      com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectResponse> getGetProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProject",
      requestType = com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectRequest.class,
      responseType = com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectRequest,
      com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectResponse> getGetProjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectRequest, com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectResponse> getGetProjectMethod;
    if ((getGetProjectMethod = ProjectServiceGrpc.getGetProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getGetProjectMethod = ProjectServiceGrpc.getGetProjectMethod) == null) {
          ProjectServiceGrpc.getGetProjectMethod = getGetProjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectRequest, com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("GetProject"))
              .build();
        }
      }
    }
    return getGetProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectsRequest,
      com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectsResponse> getGetProjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProjects",
      requestType = com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectsRequest.class,
      responseType = com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectsRequest,
      com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectsResponse> getGetProjectsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectsRequest, com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectsResponse> getGetProjectsMethod;
    if ((getGetProjectsMethod = ProjectServiceGrpc.getGetProjectsMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getGetProjectsMethod = ProjectServiceGrpc.getGetProjectsMethod) == null) {
          ProjectServiceGrpc.getGetProjectsMethod = getGetProjectsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectsRequest, com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("GetProjects"))
              .build();
        }
      }
    }
    return getGetProjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.DestroyProjectRequest,
      com.aruna.api.storage.services.v1.ProjectServiceProto.DestroyProjectResponse> getDestroyProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DestroyProject",
      requestType = com.aruna.api.storage.services.v1.ProjectServiceProto.DestroyProjectRequest.class,
      responseType = com.aruna.api.storage.services.v1.ProjectServiceProto.DestroyProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.DestroyProjectRequest,
      com.aruna.api.storage.services.v1.ProjectServiceProto.DestroyProjectResponse> getDestroyProjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.DestroyProjectRequest, com.aruna.api.storage.services.v1.ProjectServiceProto.DestroyProjectResponse> getDestroyProjectMethod;
    if ((getDestroyProjectMethod = ProjectServiceGrpc.getDestroyProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getDestroyProjectMethod = ProjectServiceGrpc.getDestroyProjectMethod) == null) {
          ProjectServiceGrpc.getDestroyProjectMethod = getDestroyProjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ProjectServiceProto.DestroyProjectRequest, com.aruna.api.storage.services.v1.ProjectServiceProto.DestroyProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DestroyProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ProjectServiceProto.DestroyProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ProjectServiceProto.DestroyProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("DestroyProject"))
              .build();
        }
      }
    }
    return getDestroyProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.UpdateProjectRequest,
      com.aruna.api.storage.services.v1.ProjectServiceProto.UpdateProjectResponse> getUpdateProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProject",
      requestType = com.aruna.api.storage.services.v1.ProjectServiceProto.UpdateProjectRequest.class,
      responseType = com.aruna.api.storage.services.v1.ProjectServiceProto.UpdateProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.UpdateProjectRequest,
      com.aruna.api.storage.services.v1.ProjectServiceProto.UpdateProjectResponse> getUpdateProjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.UpdateProjectRequest, com.aruna.api.storage.services.v1.ProjectServiceProto.UpdateProjectResponse> getUpdateProjectMethod;
    if ((getUpdateProjectMethod = ProjectServiceGrpc.getUpdateProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getUpdateProjectMethod = ProjectServiceGrpc.getUpdateProjectMethod) == null) {
          ProjectServiceGrpc.getUpdateProjectMethod = getUpdateProjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ProjectServiceProto.UpdateProjectRequest, com.aruna.api.storage.services.v1.ProjectServiceProto.UpdateProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ProjectServiceProto.UpdateProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ProjectServiceProto.UpdateProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("UpdateProject"))
              .build();
        }
      }
    }
    return getUpdateProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.RemoveUserFromProjectRequest,
      com.aruna.api.storage.services.v1.ProjectServiceProto.RemoveUserFromProjectResponse> getRemoveUserFromProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUserFromProject",
      requestType = com.aruna.api.storage.services.v1.ProjectServiceProto.RemoveUserFromProjectRequest.class,
      responseType = com.aruna.api.storage.services.v1.ProjectServiceProto.RemoveUserFromProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.RemoveUserFromProjectRequest,
      com.aruna.api.storage.services.v1.ProjectServiceProto.RemoveUserFromProjectResponse> getRemoveUserFromProjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.RemoveUserFromProjectRequest, com.aruna.api.storage.services.v1.ProjectServiceProto.RemoveUserFromProjectResponse> getRemoveUserFromProjectMethod;
    if ((getRemoveUserFromProjectMethod = ProjectServiceGrpc.getRemoveUserFromProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getRemoveUserFromProjectMethod = ProjectServiceGrpc.getRemoveUserFromProjectMethod) == null) {
          ProjectServiceGrpc.getRemoveUserFromProjectMethod = getRemoveUserFromProjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ProjectServiceProto.RemoveUserFromProjectRequest, com.aruna.api.storage.services.v1.ProjectServiceProto.RemoveUserFromProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUserFromProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ProjectServiceProto.RemoveUserFromProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ProjectServiceProto.RemoveUserFromProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("RemoveUserFromProject"))
              .build();
        }
      }
    }
    return getRemoveUserFromProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.GetUserPermissionsForProjectRequest,
      com.aruna.api.storage.services.v1.ProjectServiceProto.GetUserPermissionsForProjectResponse> getGetUserPermissionsForProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserPermissionsForProject",
      requestType = com.aruna.api.storage.services.v1.ProjectServiceProto.GetUserPermissionsForProjectRequest.class,
      responseType = com.aruna.api.storage.services.v1.ProjectServiceProto.GetUserPermissionsForProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.GetUserPermissionsForProjectRequest,
      com.aruna.api.storage.services.v1.ProjectServiceProto.GetUserPermissionsForProjectResponse> getGetUserPermissionsForProjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.GetUserPermissionsForProjectRequest, com.aruna.api.storage.services.v1.ProjectServiceProto.GetUserPermissionsForProjectResponse> getGetUserPermissionsForProjectMethod;
    if ((getGetUserPermissionsForProjectMethod = ProjectServiceGrpc.getGetUserPermissionsForProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getGetUserPermissionsForProjectMethod = ProjectServiceGrpc.getGetUserPermissionsForProjectMethod) == null) {
          ProjectServiceGrpc.getGetUserPermissionsForProjectMethod = getGetUserPermissionsForProjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ProjectServiceProto.GetUserPermissionsForProjectRequest, com.aruna.api.storage.services.v1.ProjectServiceProto.GetUserPermissionsForProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserPermissionsForProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ProjectServiceProto.GetUserPermissionsForProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ProjectServiceProto.GetUserPermissionsForProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("GetUserPermissionsForProject"))
              .build();
        }
      }
    }
    return getGetUserPermissionsForProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.GetAllUserPermissionsForProjectRequest,
      com.aruna.api.storage.services.v1.ProjectServiceProto.GetAllUserPermissionsForProjectResponse> getGetAllUserPermissionsForProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllUserPermissionsForProject",
      requestType = com.aruna.api.storage.services.v1.ProjectServiceProto.GetAllUserPermissionsForProjectRequest.class,
      responseType = com.aruna.api.storage.services.v1.ProjectServiceProto.GetAllUserPermissionsForProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.GetAllUserPermissionsForProjectRequest,
      com.aruna.api.storage.services.v1.ProjectServiceProto.GetAllUserPermissionsForProjectResponse> getGetAllUserPermissionsForProjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.GetAllUserPermissionsForProjectRequest, com.aruna.api.storage.services.v1.ProjectServiceProto.GetAllUserPermissionsForProjectResponse> getGetAllUserPermissionsForProjectMethod;
    if ((getGetAllUserPermissionsForProjectMethod = ProjectServiceGrpc.getGetAllUserPermissionsForProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getGetAllUserPermissionsForProjectMethod = ProjectServiceGrpc.getGetAllUserPermissionsForProjectMethod) == null) {
          ProjectServiceGrpc.getGetAllUserPermissionsForProjectMethod = getGetAllUserPermissionsForProjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ProjectServiceProto.GetAllUserPermissionsForProjectRequest, com.aruna.api.storage.services.v1.ProjectServiceProto.GetAllUserPermissionsForProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllUserPermissionsForProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ProjectServiceProto.GetAllUserPermissionsForProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ProjectServiceProto.GetAllUserPermissionsForProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("GetAllUserPermissionsForProject"))
              .build();
        }
      }
    }
    return getGetAllUserPermissionsForProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.EditUserPermissionsForProjectRequest,
      com.aruna.api.storage.services.v1.ProjectServiceProto.EditUserPermissionsForProjectResponse> getEditUserPermissionsForProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditUserPermissionsForProject",
      requestType = com.aruna.api.storage.services.v1.ProjectServiceProto.EditUserPermissionsForProjectRequest.class,
      responseType = com.aruna.api.storage.services.v1.ProjectServiceProto.EditUserPermissionsForProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.EditUserPermissionsForProjectRequest,
      com.aruna.api.storage.services.v1.ProjectServiceProto.EditUserPermissionsForProjectResponse> getEditUserPermissionsForProjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ProjectServiceProto.EditUserPermissionsForProjectRequest, com.aruna.api.storage.services.v1.ProjectServiceProto.EditUserPermissionsForProjectResponse> getEditUserPermissionsForProjectMethod;
    if ((getEditUserPermissionsForProjectMethod = ProjectServiceGrpc.getEditUserPermissionsForProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getEditUserPermissionsForProjectMethod = ProjectServiceGrpc.getEditUserPermissionsForProjectMethod) == null) {
          ProjectServiceGrpc.getEditUserPermissionsForProjectMethod = getEditUserPermissionsForProjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ProjectServiceProto.EditUserPermissionsForProjectRequest, com.aruna.api.storage.services.v1.ProjectServiceProto.EditUserPermissionsForProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditUserPermissionsForProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ProjectServiceProto.EditUserPermissionsForProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ProjectServiceProto.EditUserPermissionsForProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("EditUserPermissionsForProject"))
              .build();
        }
      }
    }
    return getEditUserPermissionsForProjectMethod;
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
     * Status: STABLE
     * Creates a new project all users and collections are bundled in a project.
     * </pre>
     */
    default void createProject(com.aruna.api.storage.services.v1.ProjectServiceProto.CreateProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.CreateProjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddUserToProject
     * Status: STABLE
     * 
     * Adds a new user to a given project by its id
     * </pre>
     */
    default void addUserToProject(com.aruna.api.storage.services.v1.ProjectServiceProto.AddUserToProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.AddUserToProjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUserToProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProject
     * Status: STABLE
     * 
     * Requests a project by id
     * </pre>
     */
    default void getProject(com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProjects
     * Status: STABLE
     * 
     * Admin request to get all projects
     * </pre>
     */
    default void getProjects(com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DestroyProject
     * Status: STABLE
     * Destroys the project and all its associated data. Must be empty
     * (cannot contain any collections).
     * </pre>
     */
    default void destroyProject(com.aruna.api.storage.services.v1.ProjectServiceProto.DestroyProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.DestroyProjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDestroyProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateProject
     * Status: STABLE
     * Updates the project. All (meta) data will be overwritten.
     * </pre>
     */
    default void updateProject(com.aruna.api.storage.services.v1.ProjectServiceProto.UpdateProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.UpdateProjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveUserFromProject
     * Status: STABLE
     * Removes a specified user from the project.
     * </pre>
     */
    default void removeUserFromProject(com.aruna.api.storage.services.v1.ProjectServiceProto.RemoveUserFromProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.RemoveUserFromProjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveUserFromProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUserPermissionsForProject
     * Status: STABLE
     * 
     * Get the user_permission of a specific user for the project.
     * </pre>
     */
    default void getUserPermissionsForProject(com.aruna.api.storage.services.v1.ProjectServiceProto.GetUserPermissionsForProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.GetUserPermissionsForProjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserPermissionsForProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAllUserPermissionsForProject
     * Status: ALPHA
     * 
     * Get the user_permission of a specific user for the project.
     * </pre>
     */
    default void getAllUserPermissionsForProject(com.aruna.api.storage.services.v1.ProjectServiceProto.GetAllUserPermissionsForProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.GetAllUserPermissionsForProjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllUserPermissionsForProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * EditUserPermissionsForProject
     * Status: STABLE
     * Modifies the user_permission of a specific user for the project.
     * </pre>
     */
    default void editUserPermissionsForProject(com.aruna.api.storage.services.v1.ProjectServiceProto.EditUserPermissionsForProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.EditUserPermissionsForProjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditUserPermissionsForProjectMethod(), responseObserver);
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
     * Status: STABLE
     * Creates a new project all users and collections are bundled in a project.
     * </pre>
     */
    public void createProject(com.aruna.api.storage.services.v1.ProjectServiceProto.CreateProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.CreateProjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddUserToProject
     * Status: STABLE
     * 
     * Adds a new user to a given project by its id
     * </pre>
     */
    public void addUserToProject(com.aruna.api.storage.services.v1.ProjectServiceProto.AddUserToProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.AddUserToProjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUserToProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProject
     * Status: STABLE
     * 
     * Requests a project by id
     * </pre>
     */
    public void getProject(com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProjects
     * Status: STABLE
     * 
     * Admin request to get all projects
     * </pre>
     */
    public void getProjects(com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DestroyProject
     * Status: STABLE
     * Destroys the project and all its associated data. Must be empty
     * (cannot contain any collections).
     * </pre>
     */
    public void destroyProject(com.aruna.api.storage.services.v1.ProjectServiceProto.DestroyProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.DestroyProjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDestroyProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateProject
     * Status: STABLE
     * Updates the project. All (meta) data will be overwritten.
     * </pre>
     */
    public void updateProject(com.aruna.api.storage.services.v1.ProjectServiceProto.UpdateProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.UpdateProjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveUserFromProject
     * Status: STABLE
     * Removes a specified user from the project.
     * </pre>
     */
    public void removeUserFromProject(com.aruna.api.storage.services.v1.ProjectServiceProto.RemoveUserFromProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.RemoveUserFromProjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveUserFromProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUserPermissionsForProject
     * Status: STABLE
     * 
     * Get the user_permission of a specific user for the project.
     * </pre>
     */
    public void getUserPermissionsForProject(com.aruna.api.storage.services.v1.ProjectServiceProto.GetUserPermissionsForProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.GetUserPermissionsForProjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserPermissionsForProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAllUserPermissionsForProject
     * Status: ALPHA
     * 
     * Get the user_permission of a specific user for the project.
     * </pre>
     */
    public void getAllUserPermissionsForProject(com.aruna.api.storage.services.v1.ProjectServiceProto.GetAllUserPermissionsForProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.GetAllUserPermissionsForProjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllUserPermissionsForProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EditUserPermissionsForProject
     * Status: STABLE
     * Modifies the user_permission of a specific user for the project.
     * </pre>
     */
    public void editUserPermissionsForProject(com.aruna.api.storage.services.v1.ProjectServiceProto.EditUserPermissionsForProjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.EditUserPermissionsForProjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditUserPermissionsForProjectMethod(), getCallOptions()), request, responseObserver);
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
     * Status: STABLE
     * Creates a new project all users and collections are bundled in a project.
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ProjectServiceProto.CreateProjectResponse createProject(com.aruna.api.storage.services.v1.ProjectServiceProto.CreateProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddUserToProject
     * Status: STABLE
     * 
     * Adds a new user to a given project by its id
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ProjectServiceProto.AddUserToProjectResponse addUserToProject(com.aruna.api.storage.services.v1.ProjectServiceProto.AddUserToProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUserToProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProject
     * Status: STABLE
     * 
     * Requests a project by id
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectResponse getProject(com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProjects
     * Status: STABLE
     * 
     * Admin request to get all projects
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectsResponse getProjects(com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DestroyProject
     * Status: STABLE
     * Destroys the project and all its associated data. Must be empty
     * (cannot contain any collections).
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ProjectServiceProto.DestroyProjectResponse destroyProject(com.aruna.api.storage.services.v1.ProjectServiceProto.DestroyProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDestroyProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateProject
     * Status: STABLE
     * Updates the project. All (meta) data will be overwritten.
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ProjectServiceProto.UpdateProjectResponse updateProject(com.aruna.api.storage.services.v1.ProjectServiceProto.UpdateProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveUserFromProject
     * Status: STABLE
     * Removes a specified user from the project.
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ProjectServiceProto.RemoveUserFromProjectResponse removeUserFromProject(com.aruna.api.storage.services.v1.ProjectServiceProto.RemoveUserFromProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveUserFromProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUserPermissionsForProject
     * Status: STABLE
     * 
     * Get the user_permission of a specific user for the project.
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ProjectServiceProto.GetUserPermissionsForProjectResponse getUserPermissionsForProject(com.aruna.api.storage.services.v1.ProjectServiceProto.GetUserPermissionsForProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserPermissionsForProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAllUserPermissionsForProject
     * Status: ALPHA
     * 
     * Get the user_permission of a specific user for the project.
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ProjectServiceProto.GetAllUserPermissionsForProjectResponse getAllUserPermissionsForProject(com.aruna.api.storage.services.v1.ProjectServiceProto.GetAllUserPermissionsForProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllUserPermissionsForProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EditUserPermissionsForProject
     * Status: STABLE
     * Modifies the user_permission of a specific user for the project.
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ProjectServiceProto.EditUserPermissionsForProjectResponse editUserPermissionsForProject(com.aruna.api.storage.services.v1.ProjectServiceProto.EditUserPermissionsForProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditUserPermissionsForProjectMethod(), getCallOptions(), request);
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
     * Status: STABLE
     * Creates a new project all users and collections are bundled in a project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ProjectServiceProto.CreateProjectResponse> createProject(
        com.aruna.api.storage.services.v1.ProjectServiceProto.CreateProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddUserToProject
     * Status: STABLE
     * 
     * Adds a new user to a given project by its id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ProjectServiceProto.AddUserToProjectResponse> addUserToProject(
        com.aruna.api.storage.services.v1.ProjectServiceProto.AddUserToProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUserToProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProject
     * Status: STABLE
     * 
     * Requests a project by id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectResponse> getProject(
        com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProjects
     * Status: STABLE
     * 
     * Admin request to get all projects
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectsResponse> getProjects(
        com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DestroyProject
     * Status: STABLE
     * Destroys the project and all its associated data. Must be empty
     * (cannot contain any collections).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ProjectServiceProto.DestroyProjectResponse> destroyProject(
        com.aruna.api.storage.services.v1.ProjectServiceProto.DestroyProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDestroyProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateProject
     * Status: STABLE
     * Updates the project. All (meta) data will be overwritten.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ProjectServiceProto.UpdateProjectResponse> updateProject(
        com.aruna.api.storage.services.v1.ProjectServiceProto.UpdateProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveUserFromProject
     * Status: STABLE
     * Removes a specified user from the project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ProjectServiceProto.RemoveUserFromProjectResponse> removeUserFromProject(
        com.aruna.api.storage.services.v1.ProjectServiceProto.RemoveUserFromProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveUserFromProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUserPermissionsForProject
     * Status: STABLE
     * 
     * Get the user_permission of a specific user for the project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ProjectServiceProto.GetUserPermissionsForProjectResponse> getUserPermissionsForProject(
        com.aruna.api.storage.services.v1.ProjectServiceProto.GetUserPermissionsForProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserPermissionsForProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAllUserPermissionsForProject
     * Status: ALPHA
     * 
     * Get the user_permission of a specific user for the project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ProjectServiceProto.GetAllUserPermissionsForProjectResponse> getAllUserPermissionsForProject(
        com.aruna.api.storage.services.v1.ProjectServiceProto.GetAllUserPermissionsForProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllUserPermissionsForProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EditUserPermissionsForProject
     * Status: STABLE
     * Modifies the user_permission of a specific user for the project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ProjectServiceProto.EditUserPermissionsForProjectResponse> editUserPermissionsForProject(
        com.aruna.api.storage.services.v1.ProjectServiceProto.EditUserPermissionsForProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditUserPermissionsForProjectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PROJECT = 0;
  private static final int METHODID_ADD_USER_TO_PROJECT = 1;
  private static final int METHODID_GET_PROJECT = 2;
  private static final int METHODID_GET_PROJECTS = 3;
  private static final int METHODID_DESTROY_PROJECT = 4;
  private static final int METHODID_UPDATE_PROJECT = 5;
  private static final int METHODID_REMOVE_USER_FROM_PROJECT = 6;
  private static final int METHODID_GET_USER_PERMISSIONS_FOR_PROJECT = 7;
  private static final int METHODID_GET_ALL_USER_PERMISSIONS_FOR_PROJECT = 8;
  private static final int METHODID_EDIT_USER_PERMISSIONS_FOR_PROJECT = 9;

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
          serviceImpl.createProject((com.aruna.api.storage.services.v1.ProjectServiceProto.CreateProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.CreateProjectResponse>) responseObserver);
          break;
        case METHODID_ADD_USER_TO_PROJECT:
          serviceImpl.addUserToProject((com.aruna.api.storage.services.v1.ProjectServiceProto.AddUserToProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.AddUserToProjectResponse>) responseObserver);
          break;
        case METHODID_GET_PROJECT:
          serviceImpl.getProject((com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectResponse>) responseObserver);
          break;
        case METHODID_GET_PROJECTS:
          serviceImpl.getProjects((com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectsResponse>) responseObserver);
          break;
        case METHODID_DESTROY_PROJECT:
          serviceImpl.destroyProject((com.aruna.api.storage.services.v1.ProjectServiceProto.DestroyProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.DestroyProjectResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROJECT:
          serviceImpl.updateProject((com.aruna.api.storage.services.v1.ProjectServiceProto.UpdateProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.UpdateProjectResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USER_FROM_PROJECT:
          serviceImpl.removeUserFromProject((com.aruna.api.storage.services.v1.ProjectServiceProto.RemoveUserFromProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.RemoveUserFromProjectResponse>) responseObserver);
          break;
        case METHODID_GET_USER_PERMISSIONS_FOR_PROJECT:
          serviceImpl.getUserPermissionsForProject((com.aruna.api.storage.services.v1.ProjectServiceProto.GetUserPermissionsForProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.GetUserPermissionsForProjectResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_USER_PERMISSIONS_FOR_PROJECT:
          serviceImpl.getAllUserPermissionsForProject((com.aruna.api.storage.services.v1.ProjectServiceProto.GetAllUserPermissionsForProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.GetAllUserPermissionsForProjectResponse>) responseObserver);
          break;
        case METHODID_EDIT_USER_PERMISSIONS_FOR_PROJECT:
          serviceImpl.editUserPermissionsForProject((com.aruna.api.storage.services.v1.ProjectServiceProto.EditUserPermissionsForProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ProjectServiceProto.EditUserPermissionsForProjectResponse>) responseObserver);
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
              com.aruna.api.storage.services.v1.ProjectServiceProto.CreateProjectRequest,
              com.aruna.api.storage.services.v1.ProjectServiceProto.CreateProjectResponse>(
                service, METHODID_CREATE_PROJECT)))
        .addMethod(
          getAddUserToProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ProjectServiceProto.AddUserToProjectRequest,
              com.aruna.api.storage.services.v1.ProjectServiceProto.AddUserToProjectResponse>(
                service, METHODID_ADD_USER_TO_PROJECT)))
        .addMethod(
          getGetProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectRequest,
              com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectResponse>(
                service, METHODID_GET_PROJECT)))
        .addMethod(
          getGetProjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectsRequest,
              com.aruna.api.storage.services.v1.ProjectServiceProto.GetProjectsResponse>(
                service, METHODID_GET_PROJECTS)))
        .addMethod(
          getDestroyProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ProjectServiceProto.DestroyProjectRequest,
              com.aruna.api.storage.services.v1.ProjectServiceProto.DestroyProjectResponse>(
                service, METHODID_DESTROY_PROJECT)))
        .addMethod(
          getUpdateProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ProjectServiceProto.UpdateProjectRequest,
              com.aruna.api.storage.services.v1.ProjectServiceProto.UpdateProjectResponse>(
                service, METHODID_UPDATE_PROJECT)))
        .addMethod(
          getRemoveUserFromProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ProjectServiceProto.RemoveUserFromProjectRequest,
              com.aruna.api.storage.services.v1.ProjectServiceProto.RemoveUserFromProjectResponse>(
                service, METHODID_REMOVE_USER_FROM_PROJECT)))
        .addMethod(
          getGetUserPermissionsForProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ProjectServiceProto.GetUserPermissionsForProjectRequest,
              com.aruna.api.storage.services.v1.ProjectServiceProto.GetUserPermissionsForProjectResponse>(
                service, METHODID_GET_USER_PERMISSIONS_FOR_PROJECT)))
        .addMethod(
          getGetAllUserPermissionsForProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ProjectServiceProto.GetAllUserPermissionsForProjectRequest,
              com.aruna.api.storage.services.v1.ProjectServiceProto.GetAllUserPermissionsForProjectResponse>(
                service, METHODID_GET_ALL_USER_PERMISSIONS_FOR_PROJECT)))
        .addMethod(
          getEditUserPermissionsForProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ProjectServiceProto.EditUserPermissionsForProjectRequest,
              com.aruna.api.storage.services.v1.ProjectServiceProto.EditUserPermissionsForProjectResponse>(
                service, METHODID_EDIT_USER_PERMISSIONS_FOR_PROJECT)))
        .build();
  }

  private static abstract class ProjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProjectServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.storage.services.v1.ProjectServiceProto.getDescriptor();
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
              .addMethod(getAddUserToProjectMethod())
              .addMethod(getGetProjectMethod())
              .addMethod(getGetProjectsMethod())
              .addMethod(getDestroyProjectMethod())
              .addMethod(getUpdateProjectMethod())
              .addMethod(getRemoveUserFromProjectMethod())
              .addMethod(getGetUserPermissionsForProjectMethod())
              .addMethod(getGetAllUserPermissionsForProjectMethod())
              .addMethod(getEditUserPermissionsForProjectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
