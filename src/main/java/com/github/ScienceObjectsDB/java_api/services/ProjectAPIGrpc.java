package com.github.ScienceObjectsDB.java_api.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.0)",
    comments = "Source: api/services/ProjectService.proto")
public final class ProjectAPIGrpc {

  private ProjectAPIGrpc() {}

  public static final String SERVICE_NAME = "services.ProjectAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.CreateProjectRequest,
      com.github.ScienceObjectsDB.java_api.models.Project> getCreateProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProject",
      requestType = com.github.ScienceObjectsDB.java_api.services.CreateProjectRequest.class,
      responseType = com.github.ScienceObjectsDB.java_api.models.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.CreateProjectRequest,
      com.github.ScienceObjectsDB.java_api.models.Project> getCreateProjectMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.CreateProjectRequest, com.github.ScienceObjectsDB.java_api.models.Project> getCreateProjectMethod;
    if ((getCreateProjectMethod = ProjectAPIGrpc.getCreateProjectMethod) == null) {
      synchronized (ProjectAPIGrpc.class) {
        if ((getCreateProjectMethod = ProjectAPIGrpc.getCreateProjectMethod) == null) {
          ProjectAPIGrpc.getCreateProjectMethod = getCreateProjectMethod =
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.services.CreateProjectRequest, com.github.ScienceObjectsDB.java_api.models.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.services.CreateProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.Project.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAPIMethodDescriptorSupplier("CreateProject"))
              .build();
        }
      }
    }
    return getCreateProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.AddUserToProjectRequest,
      com.github.ScienceObjectsDB.java_api.models.Project> getAddUserToProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUserToProject",
      requestType = com.github.ScienceObjectsDB.java_api.services.AddUserToProjectRequest.class,
      responseType = com.github.ScienceObjectsDB.java_api.models.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.AddUserToProjectRequest,
      com.github.ScienceObjectsDB.java_api.models.Project> getAddUserToProjectMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.AddUserToProjectRequest, com.github.ScienceObjectsDB.java_api.models.Project> getAddUserToProjectMethod;
    if ((getAddUserToProjectMethod = ProjectAPIGrpc.getAddUserToProjectMethod) == null) {
      synchronized (ProjectAPIGrpc.class) {
        if ((getAddUserToProjectMethod = ProjectAPIGrpc.getAddUserToProjectMethod) == null) {
          ProjectAPIGrpc.getAddUserToProjectMethod = getAddUserToProjectMethod =
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.services.AddUserToProjectRequest, com.github.ScienceObjectsDB.java_api.models.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUserToProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.services.AddUserToProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.Project.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAPIMethodDescriptorSupplier("AddUserToProject"))
              .build();
        }
      }
    }
    return getAddUserToProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.services.DatasetList> getGetProjectDatasetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProjectDatasets",
      requestType = com.github.ScienceObjectsDB.java_api.models.ID.class,
      responseType = com.github.ScienceObjectsDB.java_api.services.DatasetList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.services.DatasetList> getGetProjectDatasetsMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.services.DatasetList> getGetProjectDatasetsMethod;
    if ((getGetProjectDatasetsMethod = ProjectAPIGrpc.getGetProjectDatasetsMethod) == null) {
      synchronized (ProjectAPIGrpc.class) {
        if ((getGetProjectDatasetsMethod = ProjectAPIGrpc.getGetProjectDatasetsMethod) == null) {
          ProjectAPIGrpc.getGetProjectDatasetsMethod = getGetProjectDatasetsMethod =
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.services.DatasetList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProjectDatasets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.services.DatasetList.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAPIMethodDescriptorSupplier("GetProjectDatasets"))
              .build();
        }
      }
    }
    return getGetProjectDatasetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.Empty,
      com.github.ScienceObjectsDB.java_api.services.ProjectList> getGetUserProjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserProjects",
      requestType = com.github.ScienceObjectsDB.java_api.models.Empty.class,
      responseType = com.github.ScienceObjectsDB.java_api.services.ProjectList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.Empty,
      com.github.ScienceObjectsDB.java_api.services.ProjectList> getGetUserProjectsMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.Empty, com.github.ScienceObjectsDB.java_api.services.ProjectList> getGetUserProjectsMethod;
    if ((getGetUserProjectsMethod = ProjectAPIGrpc.getGetUserProjectsMethod) == null) {
      synchronized (ProjectAPIGrpc.class) {
        if ((getGetUserProjectsMethod = ProjectAPIGrpc.getGetUserProjectsMethod) == null) {
          ProjectAPIGrpc.getGetUserProjectsMethod = getGetUserProjectsMethod =
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.models.Empty, com.github.ScienceObjectsDB.java_api.services.ProjectList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserProjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.services.ProjectList.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAPIMethodDescriptorSupplier("GetUserProjects"))
              .build();
        }
      }
    }
    return getGetUserProjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.models.Empty> getDeleteProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProject",
      requestType = com.github.ScienceObjectsDB.java_api.models.ID.class,
      responseType = com.github.ScienceObjectsDB.java_api.models.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.models.Empty> getDeleteProjectMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.models.Empty> getDeleteProjectMethod;
    if ((getDeleteProjectMethod = ProjectAPIGrpc.getDeleteProjectMethod) == null) {
      synchronized (ProjectAPIGrpc.class) {
        if ((getDeleteProjectMethod = ProjectAPIGrpc.getDeleteProjectMethod) == null) {
          ProjectAPIGrpc.getDeleteProjectMethod = getDeleteProjectMethod =
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.models.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAPIMethodDescriptorSupplier("DeleteProject"))
              .build();
        }
      }
    }
    return getDeleteProjectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProjectAPIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectAPIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectAPIStub>() {
        @java.lang.Override
        public ProjectAPIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectAPIStub(channel, callOptions);
        }
      };
    return ProjectAPIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectAPIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectAPIBlockingStub>() {
        @java.lang.Override
        public ProjectAPIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectAPIBlockingStub(channel, callOptions);
        }
      };
    return ProjectAPIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProjectAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectAPIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectAPIFutureStub>() {
        @java.lang.Override
        public ProjectAPIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectAPIFutureStub(channel, callOptions);
        }
      };
    return ProjectAPIFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProjectAPIImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *CreateProject creates a new projects
     * </pre>
     */
    public void createProject(com.github.ScienceObjectsDB.java_api.services.CreateProjectRequest request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     *AddUserToProject Adds a new user to a given project
     * </pre>
     */
    public void addUserToProject(com.github.ScienceObjectsDB.java_api.services.AddUserToProjectRequest request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUserToProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     *GetProjectDatasets Returns all datasets that belong to a certain project
     * </pre>
     */
    public void getProjectDatasets(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.DatasetList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectDatasetsMethod(), responseObserver);
    }

    /**
     * <pre>
     *GetUserProjects Returns all projects that a specified user has access to
     * </pre>
     */
    public void getUserProjects(com.github.ScienceObjectsDB.java_api.models.Empty request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.ProjectList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserProjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     *DeleteProject Deletes a specific project
     *Will also delete all associated resources (Datasets/Objects/etc...) both from objects storage and the database
     * </pre>
     */
    public void deleteProject(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProjectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateProjectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.services.CreateProjectRequest,
                com.github.ScienceObjectsDB.java_api.models.Project>(
                  this, METHODID_CREATE_PROJECT)))
          .addMethod(
            getAddUserToProjectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.services.AddUserToProjectRequest,
                com.github.ScienceObjectsDB.java_api.models.Project>(
                  this, METHODID_ADD_USER_TO_PROJECT)))
          .addMethod(
            getGetProjectDatasetsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.models.ID,
                com.github.ScienceObjectsDB.java_api.services.DatasetList>(
                  this, METHODID_GET_PROJECT_DATASETS)))
          .addMethod(
            getGetUserProjectsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.models.Empty,
                com.github.ScienceObjectsDB.java_api.services.ProjectList>(
                  this, METHODID_GET_USER_PROJECTS)))
          .addMethod(
            getDeleteProjectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.models.ID,
                com.github.ScienceObjectsDB.java_api.models.Empty>(
                  this, METHODID_DELETE_PROJECT)))
          .build();
    }
  }

  /**
   */
  public static final class ProjectAPIStub extends io.grpc.stub.AbstractAsyncStub<ProjectAPIStub> {
    private ProjectAPIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectAPIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectAPIStub(channel, callOptions);
    }

    /**
     * <pre>
     *CreateProject creates a new projects
     * </pre>
     */
    public void createProject(com.github.ScienceObjectsDB.java_api.services.CreateProjectRequest request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *AddUserToProject Adds a new user to a given project
     * </pre>
     */
    public void addUserToProject(com.github.ScienceObjectsDB.java_api.services.AddUserToProjectRequest request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUserToProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *GetProjectDatasets Returns all datasets that belong to a certain project
     * </pre>
     */
    public void getProjectDatasets(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.DatasetList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProjectDatasetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *GetUserProjects Returns all projects that a specified user has access to
     * </pre>
     */
    public void getUserProjects(com.github.ScienceObjectsDB.java_api.models.Empty request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.ProjectList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserProjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *DeleteProject Deletes a specific project
     *Will also delete all associated resources (Datasets/Objects/etc...) both from objects storage and the database
     * </pre>
     */
    public void deleteProject(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProjectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProjectAPIBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProjectAPIBlockingStub> {
    private ProjectAPIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectAPIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectAPIBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *CreateProject creates a new projects
     * </pre>
     */
    public com.github.ScienceObjectsDB.java_api.models.Project createProject(com.github.ScienceObjectsDB.java_api.services.CreateProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *AddUserToProject Adds a new user to a given project
     * </pre>
     */
    public com.github.ScienceObjectsDB.java_api.models.Project addUserToProject(com.github.ScienceObjectsDB.java_api.services.AddUserToProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUserToProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *GetProjectDatasets Returns all datasets that belong to a certain project
     * </pre>
     */
    public com.github.ScienceObjectsDB.java_api.services.DatasetList getProjectDatasets(com.github.ScienceObjectsDB.java_api.models.ID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProjectDatasetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *GetUserProjects Returns all projects that a specified user has access to
     * </pre>
     */
    public com.github.ScienceObjectsDB.java_api.services.ProjectList getUserProjects(com.github.ScienceObjectsDB.java_api.models.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserProjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *DeleteProject Deletes a specific project
     *Will also delete all associated resources (Datasets/Objects/etc...) both from objects storage and the database
     * </pre>
     */
    public com.github.ScienceObjectsDB.java_api.models.Empty deleteProject(com.github.ScienceObjectsDB.java_api.models.ID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProjectMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProjectAPIFutureStub extends io.grpc.stub.AbstractFutureStub<ProjectAPIFutureStub> {
    private ProjectAPIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectAPIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectAPIFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *CreateProject creates a new projects
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.models.Project> createProject(
        com.github.ScienceObjectsDB.java_api.services.CreateProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *AddUserToProject Adds a new user to a given project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.models.Project> addUserToProject(
        com.github.ScienceObjectsDB.java_api.services.AddUserToProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUserToProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *GetProjectDatasets Returns all datasets that belong to a certain project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.services.DatasetList> getProjectDatasets(
        com.github.ScienceObjectsDB.java_api.models.ID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProjectDatasetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *GetUserProjects Returns all projects that a specified user has access to
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.services.ProjectList> getUserProjects(
        com.github.ScienceObjectsDB.java_api.models.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserProjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *DeleteProject Deletes a specific project
     *Will also delete all associated resources (Datasets/Objects/etc...) both from objects storage and the database
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.models.Empty> deleteProject(
        com.github.ScienceObjectsDB.java_api.models.ID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProjectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PROJECT = 0;
  private static final int METHODID_ADD_USER_TO_PROJECT = 1;
  private static final int METHODID_GET_PROJECT_DATASETS = 2;
  private static final int METHODID_GET_USER_PROJECTS = 3;
  private static final int METHODID_DELETE_PROJECT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProjectAPIImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProjectAPIImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PROJECT:
          serviceImpl.createProject((com.github.ScienceObjectsDB.java_api.services.CreateProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Project>) responseObserver);
          break;
        case METHODID_ADD_USER_TO_PROJECT:
          serviceImpl.addUserToProject((com.github.ScienceObjectsDB.java_api.services.AddUserToProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Project>) responseObserver);
          break;
        case METHODID_GET_PROJECT_DATASETS:
          serviceImpl.getProjectDatasets((com.github.ScienceObjectsDB.java_api.models.ID) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.DatasetList>) responseObserver);
          break;
        case METHODID_GET_USER_PROJECTS:
          serviceImpl.getUserProjects((com.github.ScienceObjectsDB.java_api.models.Empty) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.ProjectList>) responseObserver);
          break;
        case METHODID_DELETE_PROJECT:
          serviceImpl.deleteProject((com.github.ScienceObjectsDB.java_api.models.ID) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Empty>) responseObserver);
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

  private static abstract class ProjectAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProjectAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.ScienceObjectsDB.java_api.services.ProjectAPIServices.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProjectAPI");
    }
  }

  private static final class ProjectAPIFileDescriptorSupplier
      extends ProjectAPIBaseDescriptorSupplier {
    ProjectAPIFileDescriptorSupplier() {}
  }

  private static final class ProjectAPIMethodDescriptorSupplier
      extends ProjectAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProjectAPIMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProjectAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProjectAPIFileDescriptorSupplier())
              .addMethod(getCreateProjectMethod())
              .addMethod(getAddUserToProjectMethod())
              .addMethod(getGetProjectDatasetsMethod())
              .addMethod(getGetUserProjectsMethod())
              .addMethod(getDeleteProjectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
