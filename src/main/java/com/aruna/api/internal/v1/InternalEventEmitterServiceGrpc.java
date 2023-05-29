package com.aruna.api.internal.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service hosted by the notification service application
 * the API server emits events to the notification service
 * Server --&gt; Notification System
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/internal/v1/notification.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InternalEventEmitterServiceGrpc {

  private InternalEventEmitterServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.internal.v1.InternalEventEmitterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.internal.v1.NotificationProto.EmitEventRequest,
      com.aruna.api.internal.v1.NotificationProto.EmitEventResponse> getEmitEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EmitEvent",
      requestType = com.aruna.api.internal.v1.NotificationProto.EmitEventRequest.class,
      responseType = com.aruna.api.internal.v1.NotificationProto.EmitEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.internal.v1.NotificationProto.EmitEventRequest,
      com.aruna.api.internal.v1.NotificationProto.EmitEventResponse> getEmitEventMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.internal.v1.NotificationProto.EmitEventRequest, com.aruna.api.internal.v1.NotificationProto.EmitEventResponse> getEmitEventMethod;
    if ((getEmitEventMethod = InternalEventEmitterServiceGrpc.getEmitEventMethod) == null) {
      synchronized (InternalEventEmitterServiceGrpc.class) {
        if ((getEmitEventMethod = InternalEventEmitterServiceGrpc.getEmitEventMethod) == null) {
          InternalEventEmitterServiceGrpc.getEmitEventMethod = getEmitEventMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.internal.v1.NotificationProto.EmitEventRequest, com.aruna.api.internal.v1.NotificationProto.EmitEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EmitEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.NotificationProto.EmitEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.NotificationProto.EmitEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InternalEventEmitterServiceMethodDescriptorSupplier("EmitEvent"))
              .build();
        }
      }
    }
    return getEmitEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InternalEventEmitterServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InternalEventEmitterServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InternalEventEmitterServiceStub>() {
        @java.lang.Override
        public InternalEventEmitterServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InternalEventEmitterServiceStub(channel, callOptions);
        }
      };
    return InternalEventEmitterServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InternalEventEmitterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InternalEventEmitterServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InternalEventEmitterServiceBlockingStub>() {
        @java.lang.Override
        public InternalEventEmitterServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InternalEventEmitterServiceBlockingStub(channel, callOptions);
        }
      };
    return InternalEventEmitterServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InternalEventEmitterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InternalEventEmitterServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InternalEventEmitterServiceFutureStub>() {
        @java.lang.Override
        public InternalEventEmitterServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InternalEventEmitterServiceFutureStub(channel, callOptions);
        }
      };
    return InternalEventEmitterServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service hosted by the notification service application
   * the API server emits events to the notification service
   * Server --&gt; Notification System
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void emitEvent(com.aruna.api.internal.v1.NotificationProto.EmitEventRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.NotificationProto.EmitEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEmitEventMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InternalEventEmitterService.
   * <pre>
   * Service hosted by the notification service application
   * the API server emits events to the notification service
   * Server --&gt; Notification System
   * </pre>
   */
  public static abstract class InternalEventEmitterServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InternalEventEmitterServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InternalEventEmitterService.
   * <pre>
   * Service hosted by the notification service application
   * the API server emits events to the notification service
   * Server --&gt; Notification System
   * </pre>
   */
  public static final class InternalEventEmitterServiceStub
      extends io.grpc.stub.AbstractAsyncStub<InternalEventEmitterServiceStub> {
    private InternalEventEmitterServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalEventEmitterServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InternalEventEmitterServiceStub(channel, callOptions);
    }

    /**
     */
    public void emitEvent(com.aruna.api.internal.v1.NotificationProto.EmitEventRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.NotificationProto.EmitEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEmitEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InternalEventEmitterService.
   * <pre>
   * Service hosted by the notification service application
   * the API server emits events to the notification service
   * Server --&gt; Notification System
   * </pre>
   */
  public static final class InternalEventEmitterServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InternalEventEmitterServiceBlockingStub> {
    private InternalEventEmitterServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalEventEmitterServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InternalEventEmitterServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.aruna.api.internal.v1.NotificationProto.EmitEventResponse emitEvent(com.aruna.api.internal.v1.NotificationProto.EmitEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEmitEventMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InternalEventEmitterService.
   * <pre>
   * Service hosted by the notification service application
   * the API server emits events to the notification service
   * Server --&gt; Notification System
   * </pre>
   */
  public static final class InternalEventEmitterServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<InternalEventEmitterServiceFutureStub> {
    private InternalEventEmitterServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalEventEmitterServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InternalEventEmitterServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.internal.v1.NotificationProto.EmitEventResponse> emitEvent(
        com.aruna.api.internal.v1.NotificationProto.EmitEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEmitEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EMIT_EVENT = 0;

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
        case METHODID_EMIT_EVENT:
          serviceImpl.emitEvent((com.aruna.api.internal.v1.NotificationProto.EmitEventRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.NotificationProto.EmitEventResponse>) responseObserver);
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
          getEmitEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.internal.v1.NotificationProto.EmitEventRequest,
              com.aruna.api.internal.v1.NotificationProto.EmitEventResponse>(
                service, METHODID_EMIT_EVENT)))
        .build();
  }

  private static abstract class InternalEventEmitterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InternalEventEmitterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.internal.v1.NotificationProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InternalEventEmitterService");
    }
  }

  private static final class InternalEventEmitterServiceFileDescriptorSupplier
      extends InternalEventEmitterServiceBaseDescriptorSupplier {
    InternalEventEmitterServiceFileDescriptorSupplier() {}
  }

  private static final class InternalEventEmitterServiceMethodDescriptorSupplier
      extends InternalEventEmitterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InternalEventEmitterServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InternalEventEmitterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InternalEventEmitterServiceFileDescriptorSupplier())
              .addMethod(getEmitEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
