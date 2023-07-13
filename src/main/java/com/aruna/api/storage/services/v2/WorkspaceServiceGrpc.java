package com.aruna.api.storage.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage "special" anonymous collections / workspaces 
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/storage/services/v2/workspace_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WorkspaceServiceGrpc {

  private WorkspaceServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.storage.services.v2.WorkspaceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceTemplateRequest,
      com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceTemplateResponse> getCreateWorkspaceTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWorkspaceTemplate",
      requestType = com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceTemplateRequest.class,
      responseType = com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceTemplateRequest,
      com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceTemplateResponse> getCreateWorkspaceTemplateMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceTemplateRequest, com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceTemplateResponse> getCreateWorkspaceTemplateMethod;
    if ((getCreateWorkspaceTemplateMethod = WorkspaceServiceGrpc.getCreateWorkspaceTemplateMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getCreateWorkspaceTemplateMethod = WorkspaceServiceGrpc.getCreateWorkspaceTemplateMethod) == null) {
          WorkspaceServiceGrpc.getCreateWorkspaceTemplateMethod = getCreateWorkspaceTemplateMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceTemplateRequest, com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWorkspaceTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("CreateWorkspaceTemplate"))
              .build();
        }
      }
    }
    return getCreateWorkspaceTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceRequest,
      com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceResponse> getCreateWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWorkspace",
      requestType = com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceRequest.class,
      responseType = com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceRequest,
      com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceResponse> getCreateWorkspaceMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceRequest, com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceResponse> getCreateWorkspaceMethod;
    if ((getCreateWorkspaceMethod = WorkspaceServiceGrpc.getCreateWorkspaceMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getCreateWorkspaceMethod = WorkspaceServiceGrpc.getCreateWorkspaceMethod) == null) {
          WorkspaceServiceGrpc.getCreateWorkspaceMethod = getCreateWorkspaceMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceRequest, com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWorkspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("CreateWorkspace"))
              .build();
        }
      }
    }
    return getCreateWorkspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.WorkspaceServiceProto.DeleteWorkspaceRequest,
      com.aruna.api.storage.services.v2.WorkspaceServiceProto.DeleteWorkspaceResponse> getDeleteWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWorkspace",
      requestType = com.aruna.api.storage.services.v2.WorkspaceServiceProto.DeleteWorkspaceRequest.class,
      responseType = com.aruna.api.storage.services.v2.WorkspaceServiceProto.DeleteWorkspaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.WorkspaceServiceProto.DeleteWorkspaceRequest,
      com.aruna.api.storage.services.v2.WorkspaceServiceProto.DeleteWorkspaceResponse> getDeleteWorkspaceMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.WorkspaceServiceProto.DeleteWorkspaceRequest, com.aruna.api.storage.services.v2.WorkspaceServiceProto.DeleteWorkspaceResponse> getDeleteWorkspaceMethod;
    if ((getDeleteWorkspaceMethod = WorkspaceServiceGrpc.getDeleteWorkspaceMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getDeleteWorkspaceMethod = WorkspaceServiceGrpc.getDeleteWorkspaceMethod) == null) {
          WorkspaceServiceGrpc.getDeleteWorkspaceMethod = getDeleteWorkspaceMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.WorkspaceServiceProto.DeleteWorkspaceRequest, com.aruna.api.storage.services.v2.WorkspaceServiceProto.DeleteWorkspaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteWorkspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.WorkspaceServiceProto.DeleteWorkspaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.WorkspaceServiceProto.DeleteWorkspaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("DeleteWorkspace"))
              .build();
        }
      }
    }
    return getDeleteWorkspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.WorkspaceServiceProto.ClaimWorkspaceRequest,
      com.aruna.api.storage.services.v2.WorkspaceServiceProto.ClaimWorkspaceResponse> getClaimWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimWorkspace",
      requestType = com.aruna.api.storage.services.v2.WorkspaceServiceProto.ClaimWorkspaceRequest.class,
      responseType = com.aruna.api.storage.services.v2.WorkspaceServiceProto.ClaimWorkspaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.WorkspaceServiceProto.ClaimWorkspaceRequest,
      com.aruna.api.storage.services.v2.WorkspaceServiceProto.ClaimWorkspaceResponse> getClaimWorkspaceMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.WorkspaceServiceProto.ClaimWorkspaceRequest, com.aruna.api.storage.services.v2.WorkspaceServiceProto.ClaimWorkspaceResponse> getClaimWorkspaceMethod;
    if ((getClaimWorkspaceMethod = WorkspaceServiceGrpc.getClaimWorkspaceMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getClaimWorkspaceMethod = WorkspaceServiceGrpc.getClaimWorkspaceMethod) == null) {
          WorkspaceServiceGrpc.getClaimWorkspaceMethod = getClaimWorkspaceMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.WorkspaceServiceProto.ClaimWorkspaceRequest, com.aruna.api.storage.services.v2.WorkspaceServiceProto.ClaimWorkspaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimWorkspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.WorkspaceServiceProto.ClaimWorkspaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.WorkspaceServiceProto.ClaimWorkspaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("ClaimWorkspace"))
              .build();
        }
      }
    }
    return getClaimWorkspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.WorkspaceServiceProto.MoveWorkspaceDataRequest,
      com.aruna.api.storage.services.v2.WorkspaceServiceProto.MoveWorkspaceDataResponse> getMoveWorkspaceDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveWorkspaceData",
      requestType = com.aruna.api.storage.services.v2.WorkspaceServiceProto.MoveWorkspaceDataRequest.class,
      responseType = com.aruna.api.storage.services.v2.WorkspaceServiceProto.MoveWorkspaceDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.WorkspaceServiceProto.MoveWorkspaceDataRequest,
      com.aruna.api.storage.services.v2.WorkspaceServiceProto.MoveWorkspaceDataResponse> getMoveWorkspaceDataMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.WorkspaceServiceProto.MoveWorkspaceDataRequest, com.aruna.api.storage.services.v2.WorkspaceServiceProto.MoveWorkspaceDataResponse> getMoveWorkspaceDataMethod;
    if ((getMoveWorkspaceDataMethod = WorkspaceServiceGrpc.getMoveWorkspaceDataMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getMoveWorkspaceDataMethod = WorkspaceServiceGrpc.getMoveWorkspaceDataMethod) == null) {
          WorkspaceServiceGrpc.getMoveWorkspaceDataMethod = getMoveWorkspaceDataMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.WorkspaceServiceProto.MoveWorkspaceDataRequest, com.aruna.api.storage.services.v2.WorkspaceServiceProto.MoveWorkspaceDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveWorkspaceData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.WorkspaceServiceProto.MoveWorkspaceDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.WorkspaceServiceProto.MoveWorkspaceDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("MoveWorkspaceData"))
              .build();
        }
      }
    }
    return getMoveWorkspaceDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkspaceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkspaceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkspaceServiceStub>() {
        @java.lang.Override
        public WorkspaceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkspaceServiceStub(channel, callOptions);
        }
      };
    return WorkspaceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkspaceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkspaceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkspaceServiceBlockingStub>() {
        @java.lang.Override
        public WorkspaceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkspaceServiceBlockingStub(channel, callOptions);
        }
      };
    return WorkspaceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkspaceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkspaceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkspaceServiceFutureStub>() {
        @java.lang.Override
        public WorkspaceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkspaceServiceFutureStub(channel, callOptions);
        }
      };
    return WorkspaceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage "special" anonymous collections / workspaces 
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreatesNewWorkspaceTemplate
     * Status: ALPHA
     * This will create a new template for workspaces (admin only)
     * </pre>
     */
    default void createWorkspaceTemplate(com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceTemplateRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWorkspaceTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateWorkspace
     * Status: ALPHA
     * A new request to create a personal anonymous workspace
     * </pre>
     */
    default void createWorkspace(com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWorkspaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteWorkspace
     * Status: ALPHA
     * Delete a workspace
     * </pre>
     */
    default void deleteWorkspace(com.aruna.api.storage.services.v2.WorkspaceServiceProto.DeleteWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.WorkspaceServiceProto.DeleteWorkspaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteWorkspaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteWorkspace
     * Status: ALPHA
     * Claims an anonymous workspace, and transfers the owner to a regular user account.
     * </pre>
     */
    default void claimWorkspace(com.aruna.api.storage.services.v2.WorkspaceServiceProto.ClaimWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.WorkspaceServiceProto.ClaimWorkspaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimWorkspaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * MoveWorkspaceData
     * Status: ALPHA
     * Claims an anonymous workspace
     * </pre>
     */
    default void moveWorkspaceData(com.aruna.api.storage.services.v2.WorkspaceServiceProto.MoveWorkspaceDataRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.WorkspaceServiceProto.MoveWorkspaceDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveWorkspaceDataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WorkspaceService.
   * <pre>
   * Service to manage "special" anonymous collections / workspaces 
   * </pre>
   */
  public static abstract class WorkspaceServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WorkspaceServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WorkspaceService.
   * <pre>
   * Service to manage "special" anonymous collections / workspaces 
   * </pre>
   */
  public static final class WorkspaceServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WorkspaceServiceStub> {
    private WorkspaceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkspaceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkspaceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreatesNewWorkspaceTemplate
     * Status: ALPHA
     * This will create a new template for workspaces (admin only)
     * </pre>
     */
    public void createWorkspaceTemplate(com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceTemplateRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWorkspaceTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateWorkspace
     * Status: ALPHA
     * A new request to create a personal anonymous workspace
     * </pre>
     */
    public void createWorkspace(com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWorkspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteWorkspace
     * Status: ALPHA
     * Delete a workspace
     * </pre>
     */
    public void deleteWorkspace(com.aruna.api.storage.services.v2.WorkspaceServiceProto.DeleteWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.WorkspaceServiceProto.DeleteWorkspaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteWorkspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteWorkspace
     * Status: ALPHA
     * Claims an anonymous workspace, and transfers the owner to a regular user account.
     * </pre>
     */
    public void claimWorkspace(com.aruna.api.storage.services.v2.WorkspaceServiceProto.ClaimWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.WorkspaceServiceProto.ClaimWorkspaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimWorkspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MoveWorkspaceData
     * Status: ALPHA
     * Claims an anonymous workspace
     * </pre>
     */
    public void moveWorkspaceData(com.aruna.api.storage.services.v2.WorkspaceServiceProto.MoveWorkspaceDataRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.WorkspaceServiceProto.MoveWorkspaceDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveWorkspaceDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WorkspaceService.
   * <pre>
   * Service to manage "special" anonymous collections / workspaces 
   * </pre>
   */
  public static final class WorkspaceServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WorkspaceServiceBlockingStub> {
    private WorkspaceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkspaceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkspaceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreatesNewWorkspaceTemplate
     * Status: ALPHA
     * This will create a new template for workspaces (admin only)
     * </pre>
     */
    public com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceTemplateResponse createWorkspaceTemplate(com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWorkspaceTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateWorkspace
     * Status: ALPHA
     * A new request to create a personal anonymous workspace
     * </pre>
     */
    public com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceResponse createWorkspace(com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWorkspaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteWorkspace
     * Status: ALPHA
     * Delete a workspace
     * </pre>
     */
    public com.aruna.api.storage.services.v2.WorkspaceServiceProto.DeleteWorkspaceResponse deleteWorkspace(com.aruna.api.storage.services.v2.WorkspaceServiceProto.DeleteWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteWorkspaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteWorkspace
     * Status: ALPHA
     * Claims an anonymous workspace, and transfers the owner to a regular user account.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.WorkspaceServiceProto.ClaimWorkspaceResponse claimWorkspace(com.aruna.api.storage.services.v2.WorkspaceServiceProto.ClaimWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimWorkspaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MoveWorkspaceData
     * Status: ALPHA
     * Claims an anonymous workspace
     * </pre>
     */
    public com.aruna.api.storage.services.v2.WorkspaceServiceProto.MoveWorkspaceDataResponse moveWorkspaceData(com.aruna.api.storage.services.v2.WorkspaceServiceProto.MoveWorkspaceDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveWorkspaceDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WorkspaceService.
   * <pre>
   * Service to manage "special" anonymous collections / workspaces 
   * </pre>
   */
  public static final class WorkspaceServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WorkspaceServiceFutureStub> {
    private WorkspaceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkspaceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkspaceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreatesNewWorkspaceTemplate
     * Status: ALPHA
     * This will create a new template for workspaces (admin only)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceTemplateResponse> createWorkspaceTemplate(
        com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWorkspaceTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateWorkspace
     * Status: ALPHA
     * A new request to create a personal anonymous workspace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceResponse> createWorkspace(
        com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWorkspaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteWorkspace
     * Status: ALPHA
     * Delete a workspace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.WorkspaceServiceProto.DeleteWorkspaceResponse> deleteWorkspace(
        com.aruna.api.storage.services.v2.WorkspaceServiceProto.DeleteWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteWorkspaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteWorkspace
     * Status: ALPHA
     * Claims an anonymous workspace, and transfers the owner to a regular user account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.WorkspaceServiceProto.ClaimWorkspaceResponse> claimWorkspace(
        com.aruna.api.storage.services.v2.WorkspaceServiceProto.ClaimWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimWorkspaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MoveWorkspaceData
     * Status: ALPHA
     * Claims an anonymous workspace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.WorkspaceServiceProto.MoveWorkspaceDataResponse> moveWorkspaceData(
        com.aruna.api.storage.services.v2.WorkspaceServiceProto.MoveWorkspaceDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveWorkspaceDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_WORKSPACE_TEMPLATE = 0;
  private static final int METHODID_CREATE_WORKSPACE = 1;
  private static final int METHODID_DELETE_WORKSPACE = 2;
  private static final int METHODID_CLAIM_WORKSPACE = 3;
  private static final int METHODID_MOVE_WORKSPACE_DATA = 4;

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
        case METHODID_CREATE_WORKSPACE_TEMPLATE:
          serviceImpl.createWorkspaceTemplate((com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceTemplateResponse>) responseObserver);
          break;
        case METHODID_CREATE_WORKSPACE:
          serviceImpl.createWorkspace((com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceResponse>) responseObserver);
          break;
        case METHODID_DELETE_WORKSPACE:
          serviceImpl.deleteWorkspace((com.aruna.api.storage.services.v2.WorkspaceServiceProto.DeleteWorkspaceRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.WorkspaceServiceProto.DeleteWorkspaceResponse>) responseObserver);
          break;
        case METHODID_CLAIM_WORKSPACE:
          serviceImpl.claimWorkspace((com.aruna.api.storage.services.v2.WorkspaceServiceProto.ClaimWorkspaceRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.WorkspaceServiceProto.ClaimWorkspaceResponse>) responseObserver);
          break;
        case METHODID_MOVE_WORKSPACE_DATA:
          serviceImpl.moveWorkspaceData((com.aruna.api.storage.services.v2.WorkspaceServiceProto.MoveWorkspaceDataRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.WorkspaceServiceProto.MoveWorkspaceDataResponse>) responseObserver);
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
          getCreateWorkspaceTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceTemplateRequest,
              com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceTemplateResponse>(
                service, METHODID_CREATE_WORKSPACE_TEMPLATE)))
        .addMethod(
          getCreateWorkspaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceRequest,
              com.aruna.api.storage.services.v2.WorkspaceServiceProto.CreateWorkspaceResponse>(
                service, METHODID_CREATE_WORKSPACE)))
        .addMethod(
          getDeleteWorkspaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.WorkspaceServiceProto.DeleteWorkspaceRequest,
              com.aruna.api.storage.services.v2.WorkspaceServiceProto.DeleteWorkspaceResponse>(
                service, METHODID_DELETE_WORKSPACE)))
        .addMethod(
          getClaimWorkspaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.WorkspaceServiceProto.ClaimWorkspaceRequest,
              com.aruna.api.storage.services.v2.WorkspaceServiceProto.ClaimWorkspaceResponse>(
                service, METHODID_CLAIM_WORKSPACE)))
        .addMethod(
          getMoveWorkspaceDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.WorkspaceServiceProto.MoveWorkspaceDataRequest,
              com.aruna.api.storage.services.v2.WorkspaceServiceProto.MoveWorkspaceDataResponse>(
                service, METHODID_MOVE_WORKSPACE_DATA)))
        .build();
  }

  private static abstract class WorkspaceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkspaceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.storage.services.v2.WorkspaceServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WorkspaceService");
    }
  }

  private static final class WorkspaceServiceFileDescriptorSupplier
      extends WorkspaceServiceBaseDescriptorSupplier {
    WorkspaceServiceFileDescriptorSupplier() {}
  }

  private static final class WorkspaceServiceMethodDescriptorSupplier
      extends WorkspaceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WorkspaceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WorkspaceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkspaceServiceFileDescriptorSupplier())
              .addMethod(getCreateWorkspaceTemplateMethod())
              .addMethod(getCreateWorkspaceMethod())
              .addMethod(getDeleteWorkspaceMethod())
              .addMethod(getClaimWorkspaceMethod())
              .addMethod(getMoveWorkspaceDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
