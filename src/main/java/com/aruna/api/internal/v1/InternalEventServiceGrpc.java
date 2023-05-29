package com.aruna.api.internal.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service that allows the notification service to issue requests
 * to the server application 
 * Notification System --&gt; Server
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/internal/v1/notification.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InternalEventServiceGrpc {

  private InternalEventServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.internal.v1.InternalEventService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.internal.v1.NotificationProto.CreateStreamGroupRequest,
      com.aruna.api.internal.v1.NotificationProto.CreateStreamGroupResponse> getCreateStreamGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateStreamGroup",
      requestType = com.aruna.api.internal.v1.NotificationProto.CreateStreamGroupRequest.class,
      responseType = com.aruna.api.internal.v1.NotificationProto.CreateStreamGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.internal.v1.NotificationProto.CreateStreamGroupRequest,
      com.aruna.api.internal.v1.NotificationProto.CreateStreamGroupResponse> getCreateStreamGroupMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.internal.v1.NotificationProto.CreateStreamGroupRequest, com.aruna.api.internal.v1.NotificationProto.CreateStreamGroupResponse> getCreateStreamGroupMethod;
    if ((getCreateStreamGroupMethod = InternalEventServiceGrpc.getCreateStreamGroupMethod) == null) {
      synchronized (InternalEventServiceGrpc.class) {
        if ((getCreateStreamGroupMethod = InternalEventServiceGrpc.getCreateStreamGroupMethod) == null) {
          InternalEventServiceGrpc.getCreateStreamGroupMethod = getCreateStreamGroupMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.internal.v1.NotificationProto.CreateStreamGroupRequest, com.aruna.api.internal.v1.NotificationProto.CreateStreamGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateStreamGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.NotificationProto.CreateStreamGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.NotificationProto.CreateStreamGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InternalEventServiceMethodDescriptorSupplier("CreateStreamGroup"))
              .build();
        }
      }
    }
    return getCreateStreamGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.internal.v1.NotificationProto.GetStreamGroupRequest,
      com.aruna.api.internal.v1.NotificationProto.GetStreamGroupResponse> getGetStreamGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStreamGroup",
      requestType = com.aruna.api.internal.v1.NotificationProto.GetStreamGroupRequest.class,
      responseType = com.aruna.api.internal.v1.NotificationProto.GetStreamGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.internal.v1.NotificationProto.GetStreamGroupRequest,
      com.aruna.api.internal.v1.NotificationProto.GetStreamGroupResponse> getGetStreamGroupMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.internal.v1.NotificationProto.GetStreamGroupRequest, com.aruna.api.internal.v1.NotificationProto.GetStreamGroupResponse> getGetStreamGroupMethod;
    if ((getGetStreamGroupMethod = InternalEventServiceGrpc.getGetStreamGroupMethod) == null) {
      synchronized (InternalEventServiceGrpc.class) {
        if ((getGetStreamGroupMethod = InternalEventServiceGrpc.getGetStreamGroupMethod) == null) {
          InternalEventServiceGrpc.getGetStreamGroupMethod = getGetStreamGroupMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.internal.v1.NotificationProto.GetStreamGroupRequest, com.aruna.api.internal.v1.NotificationProto.GetStreamGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStreamGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.NotificationProto.GetStreamGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.NotificationProto.GetStreamGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InternalEventServiceMethodDescriptorSupplier("GetStreamGroup"))
              .build();
        }
      }
    }
    return getGetStreamGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.internal.v1.NotificationProto.DeleteStreamGroupRequest,
      com.aruna.api.internal.v1.NotificationProto.DeleteStreamGroupResponse> getDeleteStreamGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteStreamGroup",
      requestType = com.aruna.api.internal.v1.NotificationProto.DeleteStreamGroupRequest.class,
      responseType = com.aruna.api.internal.v1.NotificationProto.DeleteStreamGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.internal.v1.NotificationProto.DeleteStreamGroupRequest,
      com.aruna.api.internal.v1.NotificationProto.DeleteStreamGroupResponse> getDeleteStreamGroupMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.internal.v1.NotificationProto.DeleteStreamGroupRequest, com.aruna.api.internal.v1.NotificationProto.DeleteStreamGroupResponse> getDeleteStreamGroupMethod;
    if ((getDeleteStreamGroupMethod = InternalEventServiceGrpc.getDeleteStreamGroupMethod) == null) {
      synchronized (InternalEventServiceGrpc.class) {
        if ((getDeleteStreamGroupMethod = InternalEventServiceGrpc.getDeleteStreamGroupMethod) == null) {
          InternalEventServiceGrpc.getDeleteStreamGroupMethod = getDeleteStreamGroupMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.internal.v1.NotificationProto.DeleteStreamGroupRequest, com.aruna.api.internal.v1.NotificationProto.DeleteStreamGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteStreamGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.NotificationProto.DeleteStreamGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.NotificationProto.DeleteStreamGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InternalEventServiceMethodDescriptorSupplier("DeleteStreamGroup"))
              .build();
        }
      }
    }
    return getDeleteStreamGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.internal.v1.NotificationProto.GetSharedRevisionRequest,
      com.aruna.api.internal.v1.NotificationProto.GetSharedRevisionResponse> getGetSharedRevisionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSharedRevision",
      requestType = com.aruna.api.internal.v1.NotificationProto.GetSharedRevisionRequest.class,
      responseType = com.aruna.api.internal.v1.NotificationProto.GetSharedRevisionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.internal.v1.NotificationProto.GetSharedRevisionRequest,
      com.aruna.api.internal.v1.NotificationProto.GetSharedRevisionResponse> getGetSharedRevisionMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.internal.v1.NotificationProto.GetSharedRevisionRequest, com.aruna.api.internal.v1.NotificationProto.GetSharedRevisionResponse> getGetSharedRevisionMethod;
    if ((getGetSharedRevisionMethod = InternalEventServiceGrpc.getGetSharedRevisionMethod) == null) {
      synchronized (InternalEventServiceGrpc.class) {
        if ((getGetSharedRevisionMethod = InternalEventServiceGrpc.getGetSharedRevisionMethod) == null) {
          InternalEventServiceGrpc.getGetSharedRevisionMethod = getGetSharedRevisionMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.internal.v1.NotificationProto.GetSharedRevisionRequest, com.aruna.api.internal.v1.NotificationProto.GetSharedRevisionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSharedRevision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.NotificationProto.GetSharedRevisionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.NotificationProto.GetSharedRevisionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InternalEventServiceMethodDescriptorSupplier("GetSharedRevision"))
              .build();
        }
      }
    }
    return getGetSharedRevisionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InternalEventServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InternalEventServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InternalEventServiceStub>() {
        @java.lang.Override
        public InternalEventServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InternalEventServiceStub(channel, callOptions);
        }
      };
    return InternalEventServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InternalEventServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InternalEventServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InternalEventServiceBlockingStub>() {
        @java.lang.Override
        public InternalEventServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InternalEventServiceBlockingStub(channel, callOptions);
        }
      };
    return InternalEventServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InternalEventServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InternalEventServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InternalEventServiceFutureStub>() {
        @java.lang.Override
        public InternalEventServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InternalEventServiceFutureStub(channel, callOptions);
        }
      };
    return InternalEventServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service that allows the notification service to issue requests
   * to the server application 
   * Notification System --&gt; Server
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void createStreamGroup(com.aruna.api.internal.v1.NotificationProto.CreateStreamGroupRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.NotificationProto.CreateStreamGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateStreamGroupMethod(), responseObserver);
    }

    /**
     */
    default void getStreamGroup(com.aruna.api.internal.v1.NotificationProto.GetStreamGroupRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.NotificationProto.GetStreamGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStreamGroupMethod(), responseObserver);
    }

    /**
     */
    default void deleteStreamGroup(com.aruna.api.internal.v1.NotificationProto.DeleteStreamGroupRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.NotificationProto.DeleteStreamGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteStreamGroupMethod(), responseObserver);
    }

    /**
     */
    default void getSharedRevision(com.aruna.api.internal.v1.NotificationProto.GetSharedRevisionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.NotificationProto.GetSharedRevisionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSharedRevisionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InternalEventService.
   * <pre>
   * Service that allows the notification service to issue requests
   * to the server application 
   * Notification System --&gt; Server
   * </pre>
   */
  public static abstract class InternalEventServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InternalEventServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InternalEventService.
   * <pre>
   * Service that allows the notification service to issue requests
   * to the server application 
   * Notification System --&gt; Server
   * </pre>
   */
  public static final class InternalEventServiceStub
      extends io.grpc.stub.AbstractAsyncStub<InternalEventServiceStub> {
    private InternalEventServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalEventServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InternalEventServiceStub(channel, callOptions);
    }

    /**
     */
    public void createStreamGroup(com.aruna.api.internal.v1.NotificationProto.CreateStreamGroupRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.NotificationProto.CreateStreamGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateStreamGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStreamGroup(com.aruna.api.internal.v1.NotificationProto.GetStreamGroupRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.NotificationProto.GetStreamGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStreamGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteStreamGroup(com.aruna.api.internal.v1.NotificationProto.DeleteStreamGroupRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.NotificationProto.DeleteStreamGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteStreamGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSharedRevision(com.aruna.api.internal.v1.NotificationProto.GetSharedRevisionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.NotificationProto.GetSharedRevisionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSharedRevisionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InternalEventService.
   * <pre>
   * Service that allows the notification service to issue requests
   * to the server application 
   * Notification System --&gt; Server
   * </pre>
   */
  public static final class InternalEventServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InternalEventServiceBlockingStub> {
    private InternalEventServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalEventServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InternalEventServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.aruna.api.internal.v1.NotificationProto.CreateStreamGroupResponse createStreamGroup(com.aruna.api.internal.v1.NotificationProto.CreateStreamGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateStreamGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.internal.v1.NotificationProto.GetStreamGroupResponse getStreamGroup(com.aruna.api.internal.v1.NotificationProto.GetStreamGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStreamGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.internal.v1.NotificationProto.DeleteStreamGroupResponse deleteStreamGroup(com.aruna.api.internal.v1.NotificationProto.DeleteStreamGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteStreamGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.internal.v1.NotificationProto.GetSharedRevisionResponse getSharedRevision(com.aruna.api.internal.v1.NotificationProto.GetSharedRevisionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSharedRevisionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InternalEventService.
   * <pre>
   * Service that allows the notification service to issue requests
   * to the server application 
   * Notification System --&gt; Server
   * </pre>
   */
  public static final class InternalEventServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<InternalEventServiceFutureStub> {
    private InternalEventServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalEventServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InternalEventServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.internal.v1.NotificationProto.CreateStreamGroupResponse> createStreamGroup(
        com.aruna.api.internal.v1.NotificationProto.CreateStreamGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateStreamGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.internal.v1.NotificationProto.GetStreamGroupResponse> getStreamGroup(
        com.aruna.api.internal.v1.NotificationProto.GetStreamGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStreamGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.internal.v1.NotificationProto.DeleteStreamGroupResponse> deleteStreamGroup(
        com.aruna.api.internal.v1.NotificationProto.DeleteStreamGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteStreamGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.internal.v1.NotificationProto.GetSharedRevisionResponse> getSharedRevision(
        com.aruna.api.internal.v1.NotificationProto.GetSharedRevisionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSharedRevisionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_STREAM_GROUP = 0;
  private static final int METHODID_GET_STREAM_GROUP = 1;
  private static final int METHODID_DELETE_STREAM_GROUP = 2;
  private static final int METHODID_GET_SHARED_REVISION = 3;

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
        case METHODID_CREATE_STREAM_GROUP:
          serviceImpl.createStreamGroup((com.aruna.api.internal.v1.NotificationProto.CreateStreamGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.NotificationProto.CreateStreamGroupResponse>) responseObserver);
          break;
        case METHODID_GET_STREAM_GROUP:
          serviceImpl.getStreamGroup((com.aruna.api.internal.v1.NotificationProto.GetStreamGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.NotificationProto.GetStreamGroupResponse>) responseObserver);
          break;
        case METHODID_DELETE_STREAM_GROUP:
          serviceImpl.deleteStreamGroup((com.aruna.api.internal.v1.NotificationProto.DeleteStreamGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.NotificationProto.DeleteStreamGroupResponse>) responseObserver);
          break;
        case METHODID_GET_SHARED_REVISION:
          serviceImpl.getSharedRevision((com.aruna.api.internal.v1.NotificationProto.GetSharedRevisionRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.NotificationProto.GetSharedRevisionResponse>) responseObserver);
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
          getCreateStreamGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.internal.v1.NotificationProto.CreateStreamGroupRequest,
              com.aruna.api.internal.v1.NotificationProto.CreateStreamGroupResponse>(
                service, METHODID_CREATE_STREAM_GROUP)))
        .addMethod(
          getGetStreamGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.internal.v1.NotificationProto.GetStreamGroupRequest,
              com.aruna.api.internal.v1.NotificationProto.GetStreamGroupResponse>(
                service, METHODID_GET_STREAM_GROUP)))
        .addMethod(
          getDeleteStreamGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.internal.v1.NotificationProto.DeleteStreamGroupRequest,
              com.aruna.api.internal.v1.NotificationProto.DeleteStreamGroupResponse>(
                service, METHODID_DELETE_STREAM_GROUP)))
        .addMethod(
          getGetSharedRevisionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.internal.v1.NotificationProto.GetSharedRevisionRequest,
              com.aruna.api.internal.v1.NotificationProto.GetSharedRevisionResponse>(
                service, METHODID_GET_SHARED_REVISION)))
        .build();
  }

  private static abstract class InternalEventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InternalEventServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.internal.v1.NotificationProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InternalEventService");
    }
  }

  private static final class InternalEventServiceFileDescriptorSupplier
      extends InternalEventServiceBaseDescriptorSupplier {
    InternalEventServiceFileDescriptorSupplier() {}
  }

  private static final class InternalEventServiceMethodDescriptorSupplier
      extends InternalEventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InternalEventServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InternalEventServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InternalEventServiceFileDescriptorSupplier())
              .addMethod(getCreateStreamGroupMethod())
              .addMethod(getGetStreamGroupMethod())
              .addMethod(getDeleteStreamGroupMethod())
              .addMethod(getGetSharedRevisionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
