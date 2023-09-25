package com.aruna.api.hooks.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * HooksService
 * Status: ALPHA
 * A service that enables automatic Hook scheduling
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/hooks/services/v2/hooks_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HooksServiceGrpc {

  private HooksServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.hooks.services.v2.HooksService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.hooks.services.v2.HooksServiceProto.CreateHookRequest,
      com.aruna.api.hooks.services.v2.HooksServiceProto.CreateHookResponse> getCreateHookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateHook",
      requestType = com.aruna.api.hooks.services.v2.HooksServiceProto.CreateHookRequest.class,
      responseType = com.aruna.api.hooks.services.v2.HooksServiceProto.CreateHookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.hooks.services.v2.HooksServiceProto.CreateHookRequest,
      com.aruna.api.hooks.services.v2.HooksServiceProto.CreateHookResponse> getCreateHookMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.hooks.services.v2.HooksServiceProto.CreateHookRequest, com.aruna.api.hooks.services.v2.HooksServiceProto.CreateHookResponse> getCreateHookMethod;
    if ((getCreateHookMethod = HooksServiceGrpc.getCreateHookMethod) == null) {
      synchronized (HooksServiceGrpc.class) {
        if ((getCreateHookMethod = HooksServiceGrpc.getCreateHookMethod) == null) {
          HooksServiceGrpc.getCreateHookMethod = getCreateHookMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.hooks.services.v2.HooksServiceProto.CreateHookRequest, com.aruna.api.hooks.services.v2.HooksServiceProto.CreateHookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateHook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.hooks.services.v2.HooksServiceProto.CreateHookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.hooks.services.v2.HooksServiceProto.CreateHookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HooksServiceMethodDescriptorSupplier("CreateHook"))
              .build();
        }
      }
    }
    return getCreateHookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.hooks.services.v2.HooksServiceProto.AddProjectsToHookRequest,
      com.aruna.api.hooks.services.v2.HooksServiceProto.AddProjectsToHookResponse> getAddProjectsToHookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddProjectsToHook",
      requestType = com.aruna.api.hooks.services.v2.HooksServiceProto.AddProjectsToHookRequest.class,
      responseType = com.aruna.api.hooks.services.v2.HooksServiceProto.AddProjectsToHookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.hooks.services.v2.HooksServiceProto.AddProjectsToHookRequest,
      com.aruna.api.hooks.services.v2.HooksServiceProto.AddProjectsToHookResponse> getAddProjectsToHookMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.hooks.services.v2.HooksServiceProto.AddProjectsToHookRequest, com.aruna.api.hooks.services.v2.HooksServiceProto.AddProjectsToHookResponse> getAddProjectsToHookMethod;
    if ((getAddProjectsToHookMethod = HooksServiceGrpc.getAddProjectsToHookMethod) == null) {
      synchronized (HooksServiceGrpc.class) {
        if ((getAddProjectsToHookMethod = HooksServiceGrpc.getAddProjectsToHookMethod) == null) {
          HooksServiceGrpc.getAddProjectsToHookMethod = getAddProjectsToHookMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.hooks.services.v2.HooksServiceProto.AddProjectsToHookRequest, com.aruna.api.hooks.services.v2.HooksServiceProto.AddProjectsToHookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddProjectsToHook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.hooks.services.v2.HooksServiceProto.AddProjectsToHookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.hooks.services.v2.HooksServiceProto.AddProjectsToHookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HooksServiceMethodDescriptorSupplier("AddProjectsToHook"))
              .build();
        }
      }
    }
    return getAddProjectsToHookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.hooks.services.v2.HooksServiceProto.ListProjectHooksRequest,
      com.aruna.api.hooks.services.v2.HooksServiceProto.ListProjectHooksResponse> getListProjectHooksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProjectHooks",
      requestType = com.aruna.api.hooks.services.v2.HooksServiceProto.ListProjectHooksRequest.class,
      responseType = com.aruna.api.hooks.services.v2.HooksServiceProto.ListProjectHooksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.hooks.services.v2.HooksServiceProto.ListProjectHooksRequest,
      com.aruna.api.hooks.services.v2.HooksServiceProto.ListProjectHooksResponse> getListProjectHooksMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.hooks.services.v2.HooksServiceProto.ListProjectHooksRequest, com.aruna.api.hooks.services.v2.HooksServiceProto.ListProjectHooksResponse> getListProjectHooksMethod;
    if ((getListProjectHooksMethod = HooksServiceGrpc.getListProjectHooksMethod) == null) {
      synchronized (HooksServiceGrpc.class) {
        if ((getListProjectHooksMethod = HooksServiceGrpc.getListProjectHooksMethod) == null) {
          HooksServiceGrpc.getListProjectHooksMethod = getListProjectHooksMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.hooks.services.v2.HooksServiceProto.ListProjectHooksRequest, com.aruna.api.hooks.services.v2.HooksServiceProto.ListProjectHooksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProjectHooks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.hooks.services.v2.HooksServiceProto.ListProjectHooksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.hooks.services.v2.HooksServiceProto.ListProjectHooksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HooksServiceMethodDescriptorSupplier("ListProjectHooks"))
              .build();
        }
      }
    }
    return getListProjectHooksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.hooks.services.v2.HooksServiceProto.ListOwnedHooksRequest,
      com.aruna.api.hooks.services.v2.HooksServiceProto.ListOwnedHooksResponse> getListOwnedHooksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOwnedHooks",
      requestType = com.aruna.api.hooks.services.v2.HooksServiceProto.ListOwnedHooksRequest.class,
      responseType = com.aruna.api.hooks.services.v2.HooksServiceProto.ListOwnedHooksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.hooks.services.v2.HooksServiceProto.ListOwnedHooksRequest,
      com.aruna.api.hooks.services.v2.HooksServiceProto.ListOwnedHooksResponse> getListOwnedHooksMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.hooks.services.v2.HooksServiceProto.ListOwnedHooksRequest, com.aruna.api.hooks.services.v2.HooksServiceProto.ListOwnedHooksResponse> getListOwnedHooksMethod;
    if ((getListOwnedHooksMethod = HooksServiceGrpc.getListOwnedHooksMethod) == null) {
      synchronized (HooksServiceGrpc.class) {
        if ((getListOwnedHooksMethod = HooksServiceGrpc.getListOwnedHooksMethod) == null) {
          HooksServiceGrpc.getListOwnedHooksMethod = getListOwnedHooksMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.hooks.services.v2.HooksServiceProto.ListOwnedHooksRequest, com.aruna.api.hooks.services.v2.HooksServiceProto.ListOwnedHooksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOwnedHooks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.hooks.services.v2.HooksServiceProto.ListOwnedHooksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.hooks.services.v2.HooksServiceProto.ListOwnedHooksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HooksServiceMethodDescriptorSupplier("ListOwnedHooks"))
              .build();
        }
      }
    }
    return getListOwnedHooksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.hooks.services.v2.HooksServiceProto.DeleteHookRequest,
      com.aruna.api.hooks.services.v2.HooksServiceProto.DeleteHookResponse> getDeleteHookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteHook",
      requestType = com.aruna.api.hooks.services.v2.HooksServiceProto.DeleteHookRequest.class,
      responseType = com.aruna.api.hooks.services.v2.HooksServiceProto.DeleteHookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.hooks.services.v2.HooksServiceProto.DeleteHookRequest,
      com.aruna.api.hooks.services.v2.HooksServiceProto.DeleteHookResponse> getDeleteHookMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.hooks.services.v2.HooksServiceProto.DeleteHookRequest, com.aruna.api.hooks.services.v2.HooksServiceProto.DeleteHookResponse> getDeleteHookMethod;
    if ((getDeleteHookMethod = HooksServiceGrpc.getDeleteHookMethod) == null) {
      synchronized (HooksServiceGrpc.class) {
        if ((getDeleteHookMethod = HooksServiceGrpc.getDeleteHookMethod) == null) {
          HooksServiceGrpc.getDeleteHookMethod = getDeleteHookMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.hooks.services.v2.HooksServiceProto.DeleteHookRequest, com.aruna.api.hooks.services.v2.HooksServiceProto.DeleteHookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteHook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.hooks.services.v2.HooksServiceProto.DeleteHookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.hooks.services.v2.HooksServiceProto.DeleteHookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HooksServiceMethodDescriptorSupplier("DeleteHook"))
              .build();
        }
      }
    }
    return getDeleteHookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.hooks.services.v2.HooksServiceProto.HookCallbackRequest,
      com.aruna.api.hooks.services.v2.HooksServiceProto.HookCallbackResponse> getHookCallbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HookCallback",
      requestType = com.aruna.api.hooks.services.v2.HooksServiceProto.HookCallbackRequest.class,
      responseType = com.aruna.api.hooks.services.v2.HooksServiceProto.HookCallbackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.hooks.services.v2.HooksServiceProto.HookCallbackRequest,
      com.aruna.api.hooks.services.v2.HooksServiceProto.HookCallbackResponse> getHookCallbackMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.hooks.services.v2.HooksServiceProto.HookCallbackRequest, com.aruna.api.hooks.services.v2.HooksServiceProto.HookCallbackResponse> getHookCallbackMethod;
    if ((getHookCallbackMethod = HooksServiceGrpc.getHookCallbackMethod) == null) {
      synchronized (HooksServiceGrpc.class) {
        if ((getHookCallbackMethod = HooksServiceGrpc.getHookCallbackMethod) == null) {
          HooksServiceGrpc.getHookCallbackMethod = getHookCallbackMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.hooks.services.v2.HooksServiceProto.HookCallbackRequest, com.aruna.api.hooks.services.v2.HooksServiceProto.HookCallbackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HookCallback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.hooks.services.v2.HooksServiceProto.HookCallbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.hooks.services.v2.HooksServiceProto.HookCallbackResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HooksServiceMethodDescriptorSupplier("HookCallback"))
              .build();
        }
      }
    }
    return getHookCallbackMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HooksServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HooksServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HooksServiceStub>() {
        @java.lang.Override
        public HooksServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HooksServiceStub(channel, callOptions);
        }
      };
    return HooksServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HooksServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HooksServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HooksServiceBlockingStub>() {
        @java.lang.Override
        public HooksServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HooksServiceBlockingStub(channel, callOptions);
        }
      };
    return HooksServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HooksServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HooksServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HooksServiceFutureStub>() {
        @java.lang.Override
        public HooksServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HooksServiceFutureStub(channel, callOptions);
        }
      };
    return HooksServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * HooksService
   * Status: ALPHA
   * A service that enables automatic Hook scheduling
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Created Hooks are always associated with the owner that creates the hook
     * </pre>
     */
    default void createHook(com.aruna.api.hooks.services.v2.HooksServiceProto.CreateHookRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.hooks.services.v2.HooksServiceProto.CreateHookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateHookMethod(), responseObserver);
    }

    /**
     */
    default void addProjectsToHook(com.aruna.api.hooks.services.v2.HooksServiceProto.AddProjectsToHookRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.hooks.services.v2.HooksServiceProto.AddProjectsToHookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddProjectsToHookMethod(), responseObserver);
    }

    /**
     */
    default void listProjectHooks(com.aruna.api.hooks.services.v2.HooksServiceProto.ListProjectHooksRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.hooks.services.v2.HooksServiceProto.ListProjectHooksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListProjectHooksMethod(), responseObserver);
    }

    /**
     */
    default void listOwnedHooks(com.aruna.api.hooks.services.v2.HooksServiceProto.ListOwnedHooksRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.hooks.services.v2.HooksServiceProto.ListOwnedHooksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOwnedHooksMethod(), responseObserver);
    }

    /**
     */
    default void deleteHook(com.aruna.api.hooks.services.v2.HooksServiceProto.DeleteHookRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.hooks.services.v2.HooksServiceProto.DeleteHookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteHookMethod(), responseObserver);
    }

    /**
     */
    default void hookCallback(com.aruna.api.hooks.services.v2.HooksServiceProto.HookCallbackRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.hooks.services.v2.HooksServiceProto.HookCallbackResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHookCallbackMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HooksService.
   * <pre>
   * HooksService
   * Status: ALPHA
   * A service that enables automatic Hook scheduling
   * </pre>
   */
  public static abstract class HooksServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HooksServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HooksService.
   * <pre>
   * HooksService
   * Status: ALPHA
   * A service that enables automatic Hook scheduling
   * </pre>
   */
  public static final class HooksServiceStub
      extends io.grpc.stub.AbstractAsyncStub<HooksServiceStub> {
    private HooksServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HooksServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HooksServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Created Hooks are always associated with the owner that creates the hook
     * </pre>
     */
    public void createHook(com.aruna.api.hooks.services.v2.HooksServiceProto.CreateHookRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.hooks.services.v2.HooksServiceProto.CreateHookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateHookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addProjectsToHook(com.aruna.api.hooks.services.v2.HooksServiceProto.AddProjectsToHookRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.hooks.services.v2.HooksServiceProto.AddProjectsToHookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddProjectsToHookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listProjectHooks(com.aruna.api.hooks.services.v2.HooksServiceProto.ListProjectHooksRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.hooks.services.v2.HooksServiceProto.ListProjectHooksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListProjectHooksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOwnedHooks(com.aruna.api.hooks.services.v2.HooksServiceProto.ListOwnedHooksRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.hooks.services.v2.HooksServiceProto.ListOwnedHooksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOwnedHooksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteHook(com.aruna.api.hooks.services.v2.HooksServiceProto.DeleteHookRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.hooks.services.v2.HooksServiceProto.DeleteHookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteHookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hookCallback(com.aruna.api.hooks.services.v2.HooksServiceProto.HookCallbackRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.hooks.services.v2.HooksServiceProto.HookCallbackResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHookCallbackMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HooksService.
   * <pre>
   * HooksService
   * Status: ALPHA
   * A service that enables automatic Hook scheduling
   * </pre>
   */
  public static final class HooksServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HooksServiceBlockingStub> {
    private HooksServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HooksServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HooksServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Created Hooks are always associated with the owner that creates the hook
     * </pre>
     */
    public com.aruna.api.hooks.services.v2.HooksServiceProto.CreateHookResponse createHook(com.aruna.api.hooks.services.v2.HooksServiceProto.CreateHookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateHookMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.hooks.services.v2.HooksServiceProto.AddProjectsToHookResponse addProjectsToHook(com.aruna.api.hooks.services.v2.HooksServiceProto.AddProjectsToHookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddProjectsToHookMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.hooks.services.v2.HooksServiceProto.ListProjectHooksResponse listProjectHooks(com.aruna.api.hooks.services.v2.HooksServiceProto.ListProjectHooksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListProjectHooksMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.hooks.services.v2.HooksServiceProto.ListOwnedHooksResponse listOwnedHooks(com.aruna.api.hooks.services.v2.HooksServiceProto.ListOwnedHooksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOwnedHooksMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.hooks.services.v2.HooksServiceProto.DeleteHookResponse deleteHook(com.aruna.api.hooks.services.v2.HooksServiceProto.DeleteHookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteHookMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.hooks.services.v2.HooksServiceProto.HookCallbackResponse hookCallback(com.aruna.api.hooks.services.v2.HooksServiceProto.HookCallbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHookCallbackMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HooksService.
   * <pre>
   * HooksService
   * Status: ALPHA
   * A service that enables automatic Hook scheduling
   * </pre>
   */
  public static final class HooksServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<HooksServiceFutureStub> {
    private HooksServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HooksServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HooksServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Created Hooks are always associated with the owner that creates the hook
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.hooks.services.v2.HooksServiceProto.CreateHookResponse> createHook(
        com.aruna.api.hooks.services.v2.HooksServiceProto.CreateHookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateHookMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.hooks.services.v2.HooksServiceProto.AddProjectsToHookResponse> addProjectsToHook(
        com.aruna.api.hooks.services.v2.HooksServiceProto.AddProjectsToHookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddProjectsToHookMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.hooks.services.v2.HooksServiceProto.ListProjectHooksResponse> listProjectHooks(
        com.aruna.api.hooks.services.v2.HooksServiceProto.ListProjectHooksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListProjectHooksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.hooks.services.v2.HooksServiceProto.ListOwnedHooksResponse> listOwnedHooks(
        com.aruna.api.hooks.services.v2.HooksServiceProto.ListOwnedHooksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOwnedHooksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.hooks.services.v2.HooksServiceProto.DeleteHookResponse> deleteHook(
        com.aruna.api.hooks.services.v2.HooksServiceProto.DeleteHookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteHookMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.hooks.services.v2.HooksServiceProto.HookCallbackResponse> hookCallback(
        com.aruna.api.hooks.services.v2.HooksServiceProto.HookCallbackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHookCallbackMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_HOOK = 0;
  private static final int METHODID_ADD_PROJECTS_TO_HOOK = 1;
  private static final int METHODID_LIST_PROJECT_HOOKS = 2;
  private static final int METHODID_LIST_OWNED_HOOKS = 3;
  private static final int METHODID_DELETE_HOOK = 4;
  private static final int METHODID_HOOK_CALLBACK = 5;

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
        case METHODID_CREATE_HOOK:
          serviceImpl.createHook((com.aruna.api.hooks.services.v2.HooksServiceProto.CreateHookRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.hooks.services.v2.HooksServiceProto.CreateHookResponse>) responseObserver);
          break;
        case METHODID_ADD_PROJECTS_TO_HOOK:
          serviceImpl.addProjectsToHook((com.aruna.api.hooks.services.v2.HooksServiceProto.AddProjectsToHookRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.hooks.services.v2.HooksServiceProto.AddProjectsToHookResponse>) responseObserver);
          break;
        case METHODID_LIST_PROJECT_HOOKS:
          serviceImpl.listProjectHooks((com.aruna.api.hooks.services.v2.HooksServiceProto.ListProjectHooksRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.hooks.services.v2.HooksServiceProto.ListProjectHooksResponse>) responseObserver);
          break;
        case METHODID_LIST_OWNED_HOOKS:
          serviceImpl.listOwnedHooks((com.aruna.api.hooks.services.v2.HooksServiceProto.ListOwnedHooksRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.hooks.services.v2.HooksServiceProto.ListOwnedHooksResponse>) responseObserver);
          break;
        case METHODID_DELETE_HOOK:
          serviceImpl.deleteHook((com.aruna.api.hooks.services.v2.HooksServiceProto.DeleteHookRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.hooks.services.v2.HooksServiceProto.DeleteHookResponse>) responseObserver);
          break;
        case METHODID_HOOK_CALLBACK:
          serviceImpl.hookCallback((com.aruna.api.hooks.services.v2.HooksServiceProto.HookCallbackRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.hooks.services.v2.HooksServiceProto.HookCallbackResponse>) responseObserver);
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
          getCreateHookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.hooks.services.v2.HooksServiceProto.CreateHookRequest,
              com.aruna.api.hooks.services.v2.HooksServiceProto.CreateHookResponse>(
                service, METHODID_CREATE_HOOK)))
        .addMethod(
          getAddProjectsToHookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.hooks.services.v2.HooksServiceProto.AddProjectsToHookRequest,
              com.aruna.api.hooks.services.v2.HooksServiceProto.AddProjectsToHookResponse>(
                service, METHODID_ADD_PROJECTS_TO_HOOK)))
        .addMethod(
          getListProjectHooksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.hooks.services.v2.HooksServiceProto.ListProjectHooksRequest,
              com.aruna.api.hooks.services.v2.HooksServiceProto.ListProjectHooksResponse>(
                service, METHODID_LIST_PROJECT_HOOKS)))
        .addMethod(
          getListOwnedHooksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.hooks.services.v2.HooksServiceProto.ListOwnedHooksRequest,
              com.aruna.api.hooks.services.v2.HooksServiceProto.ListOwnedHooksResponse>(
                service, METHODID_LIST_OWNED_HOOKS)))
        .addMethod(
          getDeleteHookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.hooks.services.v2.HooksServiceProto.DeleteHookRequest,
              com.aruna.api.hooks.services.v2.HooksServiceProto.DeleteHookResponse>(
                service, METHODID_DELETE_HOOK)))
        .addMethod(
          getHookCallbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.hooks.services.v2.HooksServiceProto.HookCallbackRequest,
              com.aruna.api.hooks.services.v2.HooksServiceProto.HookCallbackResponse>(
                service, METHODID_HOOK_CALLBACK)))
        .build();
  }

  private static abstract class HooksServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HooksServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.hooks.services.v2.HooksServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HooksService");
    }
  }

  private static final class HooksServiceFileDescriptorSupplier
      extends HooksServiceBaseDescriptorSupplier {
    HooksServiceFileDescriptorSupplier() {}
  }

  private static final class HooksServiceMethodDescriptorSupplier
      extends HooksServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HooksServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HooksServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HooksServiceFileDescriptorSupplier())
              .addMethod(getCreateHookMethod())
              .addMethod(getAddProjectsToHookMethod())
              .addMethod(getListProjectHooksMethod())
              .addMethod(getListOwnedHooksMethod())
              .addMethod(getDeleteHookMethod())
              .addMethod(getHookCallbackMethod())
              .build();
        }
      }
    }
    return result;
  }
}
