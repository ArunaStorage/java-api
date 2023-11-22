package com.aruna.api.storage.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * WorkspaceService
 * Status: BETA
 * Service to manage anonymous "scratch" projects / workspaces 
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: aruna/api/storage/services/v2/workspace_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WorkspaceServiceGrpc {

  private WorkspaceServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "aruna.api.storage.services.v2.WorkspaceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateWorkspaceTemplateRequest,
      com.aruna.api.storage.services.v2.CreateWorkspaceTemplateResponse> getCreateWorkspaceTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWorkspaceTemplate",
      requestType = com.aruna.api.storage.services.v2.CreateWorkspaceTemplateRequest.class,
      responseType = com.aruna.api.storage.services.v2.CreateWorkspaceTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateWorkspaceTemplateRequest,
      com.aruna.api.storage.services.v2.CreateWorkspaceTemplateResponse> getCreateWorkspaceTemplateMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateWorkspaceTemplateRequest, com.aruna.api.storage.services.v2.CreateWorkspaceTemplateResponse> getCreateWorkspaceTemplateMethod;
    if ((getCreateWorkspaceTemplateMethod = WorkspaceServiceGrpc.getCreateWorkspaceTemplateMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getCreateWorkspaceTemplateMethod = WorkspaceServiceGrpc.getCreateWorkspaceTemplateMethod) == null) {
          WorkspaceServiceGrpc.getCreateWorkspaceTemplateMethod = getCreateWorkspaceTemplateMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.CreateWorkspaceTemplateRequest, com.aruna.api.storage.services.v2.CreateWorkspaceTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWorkspaceTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateWorkspaceTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateWorkspaceTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("CreateWorkspaceTemplate"))
              .build();
        }
      }
    }
    return getCreateWorkspaceTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetWorkspaceTemplateRequest,
      com.aruna.api.storage.services.v2.GetWorkspaceTemplateResponse> getGetWorkspaceTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWorkspaceTemplate",
      requestType = com.aruna.api.storage.services.v2.GetWorkspaceTemplateRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetWorkspaceTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetWorkspaceTemplateRequest,
      com.aruna.api.storage.services.v2.GetWorkspaceTemplateResponse> getGetWorkspaceTemplateMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetWorkspaceTemplateRequest, com.aruna.api.storage.services.v2.GetWorkspaceTemplateResponse> getGetWorkspaceTemplateMethod;
    if ((getGetWorkspaceTemplateMethod = WorkspaceServiceGrpc.getGetWorkspaceTemplateMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getGetWorkspaceTemplateMethod = WorkspaceServiceGrpc.getGetWorkspaceTemplateMethod) == null) {
          WorkspaceServiceGrpc.getGetWorkspaceTemplateMethod = getGetWorkspaceTemplateMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetWorkspaceTemplateRequest, com.aruna.api.storage.services.v2.GetWorkspaceTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWorkspaceTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetWorkspaceTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetWorkspaceTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("GetWorkspaceTemplate"))
              .build();
        }
      }
    }
    return getGetWorkspaceTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesRequest,
      com.aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesResponse> getListOwnedWorkspaceTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOwnedWorkspaceTemplates",
      requestType = com.aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesRequest.class,
      responseType = com.aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesRequest,
      com.aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesResponse> getListOwnedWorkspaceTemplatesMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesRequest, com.aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesResponse> getListOwnedWorkspaceTemplatesMethod;
    if ((getListOwnedWorkspaceTemplatesMethod = WorkspaceServiceGrpc.getListOwnedWorkspaceTemplatesMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getListOwnedWorkspaceTemplatesMethod = WorkspaceServiceGrpc.getListOwnedWorkspaceTemplatesMethod) == null) {
          WorkspaceServiceGrpc.getListOwnedWorkspaceTemplatesMethod = getListOwnedWorkspaceTemplatesMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesRequest, com.aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOwnedWorkspaceTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("ListOwnedWorkspaceTemplates"))
              .build();
        }
      }
    }
    return getListOwnedWorkspaceTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteWorkspaceTemplateRequest,
      com.aruna.api.storage.services.v2.DeleteWorkspaceTemplateResponse> getDeleteWorkspaceTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWorkspaceTemplate",
      requestType = com.aruna.api.storage.services.v2.DeleteWorkspaceTemplateRequest.class,
      responseType = com.aruna.api.storage.services.v2.DeleteWorkspaceTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteWorkspaceTemplateRequest,
      com.aruna.api.storage.services.v2.DeleteWorkspaceTemplateResponse> getDeleteWorkspaceTemplateMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteWorkspaceTemplateRequest, com.aruna.api.storage.services.v2.DeleteWorkspaceTemplateResponse> getDeleteWorkspaceTemplateMethod;
    if ((getDeleteWorkspaceTemplateMethod = WorkspaceServiceGrpc.getDeleteWorkspaceTemplateMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getDeleteWorkspaceTemplateMethod = WorkspaceServiceGrpc.getDeleteWorkspaceTemplateMethod) == null) {
          WorkspaceServiceGrpc.getDeleteWorkspaceTemplateMethod = getDeleteWorkspaceTemplateMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DeleteWorkspaceTemplateRequest, com.aruna.api.storage.services.v2.DeleteWorkspaceTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteWorkspaceTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteWorkspaceTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteWorkspaceTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("DeleteWorkspaceTemplate"))
              .build();
        }
      }
    }
    return getDeleteWorkspaceTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateWorkspaceRequest,
      com.aruna.api.storage.services.v2.CreateWorkspaceResponse> getCreateWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWorkspace",
      requestType = com.aruna.api.storage.services.v2.CreateWorkspaceRequest.class,
      responseType = com.aruna.api.storage.services.v2.CreateWorkspaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateWorkspaceRequest,
      com.aruna.api.storage.services.v2.CreateWorkspaceResponse> getCreateWorkspaceMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateWorkspaceRequest, com.aruna.api.storage.services.v2.CreateWorkspaceResponse> getCreateWorkspaceMethod;
    if ((getCreateWorkspaceMethod = WorkspaceServiceGrpc.getCreateWorkspaceMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getCreateWorkspaceMethod = WorkspaceServiceGrpc.getCreateWorkspaceMethod) == null) {
          WorkspaceServiceGrpc.getCreateWorkspaceMethod = getCreateWorkspaceMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.CreateWorkspaceRequest, com.aruna.api.storage.services.v2.CreateWorkspaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWorkspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateWorkspaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateWorkspaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("CreateWorkspace"))
              .build();
        }
      }
    }
    return getCreateWorkspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteWorkspaceRequest,
      com.aruna.api.storage.services.v2.DeleteWorkspaceResponse> getDeleteWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWorkspace",
      requestType = com.aruna.api.storage.services.v2.DeleteWorkspaceRequest.class,
      responseType = com.aruna.api.storage.services.v2.DeleteWorkspaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteWorkspaceRequest,
      com.aruna.api.storage.services.v2.DeleteWorkspaceResponse> getDeleteWorkspaceMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteWorkspaceRequest, com.aruna.api.storage.services.v2.DeleteWorkspaceResponse> getDeleteWorkspaceMethod;
    if ((getDeleteWorkspaceMethod = WorkspaceServiceGrpc.getDeleteWorkspaceMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getDeleteWorkspaceMethod = WorkspaceServiceGrpc.getDeleteWorkspaceMethod) == null) {
          WorkspaceServiceGrpc.getDeleteWorkspaceMethod = getDeleteWorkspaceMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DeleteWorkspaceRequest, com.aruna.api.storage.services.v2.DeleteWorkspaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteWorkspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteWorkspaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteWorkspaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("DeleteWorkspace"))
              .build();
        }
      }
    }
    return getDeleteWorkspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ClaimWorkspaceRequest,
      com.aruna.api.storage.services.v2.ClaimWorkspaceResponse> getClaimWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimWorkspace",
      requestType = com.aruna.api.storage.services.v2.ClaimWorkspaceRequest.class,
      responseType = com.aruna.api.storage.services.v2.ClaimWorkspaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ClaimWorkspaceRequest,
      com.aruna.api.storage.services.v2.ClaimWorkspaceResponse> getClaimWorkspaceMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ClaimWorkspaceRequest, com.aruna.api.storage.services.v2.ClaimWorkspaceResponse> getClaimWorkspaceMethod;
    if ((getClaimWorkspaceMethod = WorkspaceServiceGrpc.getClaimWorkspaceMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getClaimWorkspaceMethod = WorkspaceServiceGrpc.getClaimWorkspaceMethod) == null) {
          WorkspaceServiceGrpc.getClaimWorkspaceMethod = getClaimWorkspaceMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ClaimWorkspaceRequest, com.aruna.api.storage.services.v2.ClaimWorkspaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimWorkspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ClaimWorkspaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ClaimWorkspaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("ClaimWorkspace"))
              .build();
        }
      }
    }
    return getClaimWorkspaceMethod;
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
   * WorkspaceService
   * Status: BETA
   * Service to manage anonymous "scratch" projects / workspaces 
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
    default void createWorkspaceTemplate(com.aruna.api.storage.services.v2.CreateWorkspaceTemplateRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateWorkspaceTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWorkspaceTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetWorkspaceTemplatesById 
     * 
     *  Status: ALPHA
     * Gets workspace template by id
     * </pre>
     */
    default void getWorkspaceTemplate(com.aruna.api.storage.services.v2.GetWorkspaceTemplateRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetWorkspaceTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWorkspaceTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListOwnedWorkspaceTemplates
     * 
     *  Status: ALPHA
     * Lists owned workspace templates
     * </pre>
     */
    default void listOwnedWorkspaceTemplates(com.aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOwnedWorkspaceTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteWorkspaceTemplates
     * 
     *  Status: ALPHA
     * Deletes specified workspace templates
     * </pre>
     */
    default void deleteWorkspaceTemplate(com.aruna.api.storage.services.v2.DeleteWorkspaceTemplateRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteWorkspaceTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteWorkspaceTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateWorkspace
     * Status: ALPHA
     * Create a personal anonymous workspace
     * </pre>
     */
    default void createWorkspace(com.aruna.api.storage.services.v2.CreateWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateWorkspaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWorkspaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteWorkspace
     * Status: ALPHA
     * Delete a workspace
     * </pre>
     */
    default void deleteWorkspace(com.aruna.api.storage.services.v2.DeleteWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteWorkspaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteWorkspaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteWorkspace
     * Status: ALPHA
     * Claims an anonymous workspace, and transfers the owner to a regular user account.
     * </pre>
     */
    default void claimWorkspace(com.aruna.api.storage.services.v2.ClaimWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ClaimWorkspaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimWorkspaceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WorkspaceService.
   * <pre>
   * WorkspaceService
   * Status: BETA
   * Service to manage anonymous "scratch" projects / workspaces 
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
   * WorkspaceService
   * Status: BETA
   * Service to manage anonymous "scratch" projects / workspaces 
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
    public void createWorkspaceTemplate(com.aruna.api.storage.services.v2.CreateWorkspaceTemplateRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateWorkspaceTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWorkspaceTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetWorkspaceTemplatesById 
     * 
     *  Status: ALPHA
     * Gets workspace template by id
     * </pre>
     */
    public void getWorkspaceTemplate(com.aruna.api.storage.services.v2.GetWorkspaceTemplateRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetWorkspaceTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWorkspaceTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListOwnedWorkspaceTemplates
     * 
     *  Status: ALPHA
     * Lists owned workspace templates
     * </pre>
     */
    public void listOwnedWorkspaceTemplates(com.aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOwnedWorkspaceTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteWorkspaceTemplates
     * 
     *  Status: ALPHA
     * Deletes specified workspace templates
     * </pre>
     */
    public void deleteWorkspaceTemplate(com.aruna.api.storage.services.v2.DeleteWorkspaceTemplateRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteWorkspaceTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteWorkspaceTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateWorkspace
     * Status: ALPHA
     * Create a personal anonymous workspace
     * </pre>
     */
    public void createWorkspace(com.aruna.api.storage.services.v2.CreateWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateWorkspaceResponse> responseObserver) {
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
    public void deleteWorkspace(com.aruna.api.storage.services.v2.DeleteWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteWorkspaceResponse> responseObserver) {
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
    public void claimWorkspace(com.aruna.api.storage.services.v2.ClaimWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ClaimWorkspaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimWorkspaceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WorkspaceService.
   * <pre>
   * WorkspaceService
   * Status: BETA
   * Service to manage anonymous "scratch" projects / workspaces 
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
    public com.aruna.api.storage.services.v2.CreateWorkspaceTemplateResponse createWorkspaceTemplate(com.aruna.api.storage.services.v2.CreateWorkspaceTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWorkspaceTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetWorkspaceTemplatesById 
     * 
     *  Status: ALPHA
     * Gets workspace template by id
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetWorkspaceTemplateResponse getWorkspaceTemplate(com.aruna.api.storage.services.v2.GetWorkspaceTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWorkspaceTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListOwnedWorkspaceTemplates
     * 
     *  Status: ALPHA
     * Lists owned workspace templates
     * </pre>
     */
    public com.aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesResponse listOwnedWorkspaceTemplates(com.aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOwnedWorkspaceTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteWorkspaceTemplates
     * 
     *  Status: ALPHA
     * Deletes specified workspace templates
     * </pre>
     */
    public com.aruna.api.storage.services.v2.DeleteWorkspaceTemplateResponse deleteWorkspaceTemplate(com.aruna.api.storage.services.v2.DeleteWorkspaceTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteWorkspaceTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateWorkspace
     * Status: ALPHA
     * Create a personal anonymous workspace
     * </pre>
     */
    public com.aruna.api.storage.services.v2.CreateWorkspaceResponse createWorkspace(com.aruna.api.storage.services.v2.CreateWorkspaceRequest request) {
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
    public com.aruna.api.storage.services.v2.DeleteWorkspaceResponse deleteWorkspace(com.aruna.api.storage.services.v2.DeleteWorkspaceRequest request) {
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
    public com.aruna.api.storage.services.v2.ClaimWorkspaceResponse claimWorkspace(com.aruna.api.storage.services.v2.ClaimWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimWorkspaceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WorkspaceService.
   * <pre>
   * WorkspaceService
   * Status: BETA
   * Service to manage anonymous "scratch" projects / workspaces 
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.CreateWorkspaceTemplateResponse> createWorkspaceTemplate(
        com.aruna.api.storage.services.v2.CreateWorkspaceTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWorkspaceTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetWorkspaceTemplatesById 
     * 
     *  Status: ALPHA
     * Gets workspace template by id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetWorkspaceTemplateResponse> getWorkspaceTemplate(
        com.aruna.api.storage.services.v2.GetWorkspaceTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWorkspaceTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListOwnedWorkspaceTemplates
     * 
     *  Status: ALPHA
     * Lists owned workspace templates
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesResponse> listOwnedWorkspaceTemplates(
        com.aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOwnedWorkspaceTemplatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteWorkspaceTemplates
     * 
     *  Status: ALPHA
     * Deletes specified workspace templates
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DeleteWorkspaceTemplateResponse> deleteWorkspaceTemplate(
        com.aruna.api.storage.services.v2.DeleteWorkspaceTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteWorkspaceTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateWorkspace
     * Status: ALPHA
     * Create a personal anonymous workspace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.CreateWorkspaceResponse> createWorkspace(
        com.aruna.api.storage.services.v2.CreateWorkspaceRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DeleteWorkspaceResponse> deleteWorkspace(
        com.aruna.api.storage.services.v2.DeleteWorkspaceRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ClaimWorkspaceResponse> claimWorkspace(
        com.aruna.api.storage.services.v2.ClaimWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimWorkspaceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_WORKSPACE_TEMPLATE = 0;
  private static final int METHODID_GET_WORKSPACE_TEMPLATE = 1;
  private static final int METHODID_LIST_OWNED_WORKSPACE_TEMPLATES = 2;
  private static final int METHODID_DELETE_WORKSPACE_TEMPLATE = 3;
  private static final int METHODID_CREATE_WORKSPACE = 4;
  private static final int METHODID_DELETE_WORKSPACE = 5;
  private static final int METHODID_CLAIM_WORKSPACE = 6;

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
          serviceImpl.createWorkspaceTemplate((com.aruna.api.storage.services.v2.CreateWorkspaceTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateWorkspaceTemplateResponse>) responseObserver);
          break;
        case METHODID_GET_WORKSPACE_TEMPLATE:
          serviceImpl.getWorkspaceTemplate((com.aruna.api.storage.services.v2.GetWorkspaceTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetWorkspaceTemplateResponse>) responseObserver);
          break;
        case METHODID_LIST_OWNED_WORKSPACE_TEMPLATES:
          serviceImpl.listOwnedWorkspaceTemplates((com.aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesResponse>) responseObserver);
          break;
        case METHODID_DELETE_WORKSPACE_TEMPLATE:
          serviceImpl.deleteWorkspaceTemplate((com.aruna.api.storage.services.v2.DeleteWorkspaceTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteWorkspaceTemplateResponse>) responseObserver);
          break;
        case METHODID_CREATE_WORKSPACE:
          serviceImpl.createWorkspace((com.aruna.api.storage.services.v2.CreateWorkspaceRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateWorkspaceResponse>) responseObserver);
          break;
        case METHODID_DELETE_WORKSPACE:
          serviceImpl.deleteWorkspace((com.aruna.api.storage.services.v2.DeleteWorkspaceRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteWorkspaceResponse>) responseObserver);
          break;
        case METHODID_CLAIM_WORKSPACE:
          serviceImpl.claimWorkspace((com.aruna.api.storage.services.v2.ClaimWorkspaceRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ClaimWorkspaceResponse>) responseObserver);
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
              com.aruna.api.storage.services.v2.CreateWorkspaceTemplateRequest,
              com.aruna.api.storage.services.v2.CreateWorkspaceTemplateResponse>(
                service, METHODID_CREATE_WORKSPACE_TEMPLATE)))
        .addMethod(
          getGetWorkspaceTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetWorkspaceTemplateRequest,
              com.aruna.api.storage.services.v2.GetWorkspaceTemplateResponse>(
                service, METHODID_GET_WORKSPACE_TEMPLATE)))
        .addMethod(
          getListOwnedWorkspaceTemplatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesRequest,
              com.aruna.api.storage.services.v2.ListOwnedWorkspaceTemplatesResponse>(
                service, METHODID_LIST_OWNED_WORKSPACE_TEMPLATES)))
        .addMethod(
          getDeleteWorkspaceTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DeleteWorkspaceTemplateRequest,
              com.aruna.api.storage.services.v2.DeleteWorkspaceTemplateResponse>(
                service, METHODID_DELETE_WORKSPACE_TEMPLATE)))
        .addMethod(
          getCreateWorkspaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.CreateWorkspaceRequest,
              com.aruna.api.storage.services.v2.CreateWorkspaceResponse>(
                service, METHODID_CREATE_WORKSPACE)))
        .addMethod(
          getDeleteWorkspaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DeleteWorkspaceRequest,
              com.aruna.api.storage.services.v2.DeleteWorkspaceResponse>(
                service, METHODID_DELETE_WORKSPACE)))
        .addMethod(
          getClaimWorkspaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ClaimWorkspaceRequest,
              com.aruna.api.storage.services.v2.ClaimWorkspaceResponse>(
                service, METHODID_CLAIM_WORKSPACE)))
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
    private final java.lang.String methodName;

    WorkspaceServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getGetWorkspaceTemplateMethod())
              .addMethod(getListOwnedWorkspaceTemplatesMethod())
              .addMethod(getDeleteWorkspaceTemplateMethod())
              .addMethod(getCreateWorkspaceMethod())
              .addMethod(getDeleteWorkspaceMethod())
              .addMethod(getClaimWorkspaceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
