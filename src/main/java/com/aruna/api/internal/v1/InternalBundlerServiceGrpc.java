package com.aruna.api.internal.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/internal/v1/bundler.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InternalBundlerServiceGrpc {

  private InternalBundlerServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.internal.v1.InternalBundlerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.internal.v1.BundlerProto.PrepareBundleRequest,
      com.aruna.api.internal.v1.BundlerProto.PrepareBundleResponse> getPrepareBundleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrepareBundle",
      requestType = com.aruna.api.internal.v1.BundlerProto.PrepareBundleRequest.class,
      responseType = com.aruna.api.internal.v1.BundlerProto.PrepareBundleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.internal.v1.BundlerProto.PrepareBundleRequest,
      com.aruna.api.internal.v1.BundlerProto.PrepareBundleResponse> getPrepareBundleMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.internal.v1.BundlerProto.PrepareBundleRequest, com.aruna.api.internal.v1.BundlerProto.PrepareBundleResponse> getPrepareBundleMethod;
    if ((getPrepareBundleMethod = InternalBundlerServiceGrpc.getPrepareBundleMethod) == null) {
      synchronized (InternalBundlerServiceGrpc.class) {
        if ((getPrepareBundleMethod = InternalBundlerServiceGrpc.getPrepareBundleMethod) == null) {
          InternalBundlerServiceGrpc.getPrepareBundleMethod = getPrepareBundleMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.internal.v1.BundlerProto.PrepareBundleRequest, com.aruna.api.internal.v1.BundlerProto.PrepareBundleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PrepareBundle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.BundlerProto.PrepareBundleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.BundlerProto.PrepareBundleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InternalBundlerServiceMethodDescriptorSupplier("PrepareBundle"))
              .build();
        }
      }
    }
    return getPrepareBundleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.internal.v1.BundlerProto.EnableBundleRequest,
      com.aruna.api.internal.v1.BundlerProto.EnableBundleResponse> getEnableBundleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableBundle",
      requestType = com.aruna.api.internal.v1.BundlerProto.EnableBundleRequest.class,
      responseType = com.aruna.api.internal.v1.BundlerProto.EnableBundleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.internal.v1.BundlerProto.EnableBundleRequest,
      com.aruna.api.internal.v1.BundlerProto.EnableBundleResponse> getEnableBundleMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.internal.v1.BundlerProto.EnableBundleRequest, com.aruna.api.internal.v1.BundlerProto.EnableBundleResponse> getEnableBundleMethod;
    if ((getEnableBundleMethod = InternalBundlerServiceGrpc.getEnableBundleMethod) == null) {
      synchronized (InternalBundlerServiceGrpc.class) {
        if ((getEnableBundleMethod = InternalBundlerServiceGrpc.getEnableBundleMethod) == null) {
          InternalBundlerServiceGrpc.getEnableBundleMethod = getEnableBundleMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.internal.v1.BundlerProto.EnableBundleRequest, com.aruna.api.internal.v1.BundlerProto.EnableBundleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableBundle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.BundlerProto.EnableBundleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.BundlerProto.EnableBundleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InternalBundlerServiceMethodDescriptorSupplier("EnableBundle"))
              .build();
        }
      }
    }
    return getEnableBundleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.internal.v1.BundlerProto.InvalidateBundleRequest,
      com.aruna.api.internal.v1.BundlerProto.InvalidateBundleResponse> getInvalidateBundleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InvalidateBundle",
      requestType = com.aruna.api.internal.v1.BundlerProto.InvalidateBundleRequest.class,
      responseType = com.aruna.api.internal.v1.BundlerProto.InvalidateBundleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.internal.v1.BundlerProto.InvalidateBundleRequest,
      com.aruna.api.internal.v1.BundlerProto.InvalidateBundleResponse> getInvalidateBundleMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.internal.v1.BundlerProto.InvalidateBundleRequest, com.aruna.api.internal.v1.BundlerProto.InvalidateBundleResponse> getInvalidateBundleMethod;
    if ((getInvalidateBundleMethod = InternalBundlerServiceGrpc.getInvalidateBundleMethod) == null) {
      synchronized (InternalBundlerServiceGrpc.class) {
        if ((getInvalidateBundleMethod = InternalBundlerServiceGrpc.getInvalidateBundleMethod) == null) {
          InternalBundlerServiceGrpc.getInvalidateBundleMethod = getInvalidateBundleMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.internal.v1.BundlerProto.InvalidateBundleRequest, com.aruna.api.internal.v1.BundlerProto.InvalidateBundleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InvalidateBundle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.BundlerProto.InvalidateBundleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.BundlerProto.InvalidateBundleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InternalBundlerServiceMethodDescriptorSupplier("InvalidateBundle"))
              .build();
        }
      }
    }
    return getInvalidateBundleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InternalBundlerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InternalBundlerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InternalBundlerServiceStub>() {
        @java.lang.Override
        public InternalBundlerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InternalBundlerServiceStub(channel, callOptions);
        }
      };
    return InternalBundlerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InternalBundlerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InternalBundlerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InternalBundlerServiceBlockingStub>() {
        @java.lang.Override
        public InternalBundlerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InternalBundlerServiceBlockingStub(channel, callOptions);
        }
      };
    return InternalBundlerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InternalBundlerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InternalBundlerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InternalBundlerServiceFutureStub>() {
        @java.lang.Override
        public InternalBundlerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InternalBundlerServiceFutureStub(channel, callOptions);
        }
      };
    return InternalBundlerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void prepareBundle(com.aruna.api.internal.v1.BundlerProto.PrepareBundleRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.BundlerProto.PrepareBundleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrepareBundleMethod(), responseObserver);
    }

    /**
     */
    default void enableBundle(com.aruna.api.internal.v1.BundlerProto.EnableBundleRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.BundlerProto.EnableBundleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableBundleMethod(), responseObserver);
    }

    /**
     */
    default void invalidateBundle(com.aruna.api.internal.v1.BundlerProto.InvalidateBundleRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.BundlerProto.InvalidateBundleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInvalidateBundleMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InternalBundlerService.
   */
  public static abstract class InternalBundlerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InternalBundlerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InternalBundlerService.
   */
  public static final class InternalBundlerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<InternalBundlerServiceStub> {
    private InternalBundlerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalBundlerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InternalBundlerServiceStub(channel, callOptions);
    }

    /**
     */
    public void prepareBundle(com.aruna.api.internal.v1.BundlerProto.PrepareBundleRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.BundlerProto.PrepareBundleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPrepareBundleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableBundle(com.aruna.api.internal.v1.BundlerProto.EnableBundleRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.BundlerProto.EnableBundleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableBundleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void invalidateBundle(com.aruna.api.internal.v1.BundlerProto.InvalidateBundleRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.BundlerProto.InvalidateBundleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInvalidateBundleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InternalBundlerService.
   */
  public static final class InternalBundlerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InternalBundlerServiceBlockingStub> {
    private InternalBundlerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalBundlerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InternalBundlerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.aruna.api.internal.v1.BundlerProto.PrepareBundleResponse prepareBundle(com.aruna.api.internal.v1.BundlerProto.PrepareBundleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPrepareBundleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.internal.v1.BundlerProto.EnableBundleResponse enableBundle(com.aruna.api.internal.v1.BundlerProto.EnableBundleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableBundleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.internal.v1.BundlerProto.InvalidateBundleResponse invalidateBundle(com.aruna.api.internal.v1.BundlerProto.InvalidateBundleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInvalidateBundleMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InternalBundlerService.
   */
  public static final class InternalBundlerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<InternalBundlerServiceFutureStub> {
    private InternalBundlerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalBundlerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InternalBundlerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.internal.v1.BundlerProto.PrepareBundleResponse> prepareBundle(
        com.aruna.api.internal.v1.BundlerProto.PrepareBundleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPrepareBundleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.internal.v1.BundlerProto.EnableBundleResponse> enableBundle(
        com.aruna.api.internal.v1.BundlerProto.EnableBundleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableBundleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.internal.v1.BundlerProto.InvalidateBundleResponse> invalidateBundle(
        com.aruna.api.internal.v1.BundlerProto.InvalidateBundleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInvalidateBundleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PREPARE_BUNDLE = 0;
  private static final int METHODID_ENABLE_BUNDLE = 1;
  private static final int METHODID_INVALIDATE_BUNDLE = 2;

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
        case METHODID_PREPARE_BUNDLE:
          serviceImpl.prepareBundle((com.aruna.api.internal.v1.BundlerProto.PrepareBundleRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.BundlerProto.PrepareBundleResponse>) responseObserver);
          break;
        case METHODID_ENABLE_BUNDLE:
          serviceImpl.enableBundle((com.aruna.api.internal.v1.BundlerProto.EnableBundleRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.BundlerProto.EnableBundleResponse>) responseObserver);
          break;
        case METHODID_INVALIDATE_BUNDLE:
          serviceImpl.invalidateBundle((com.aruna.api.internal.v1.BundlerProto.InvalidateBundleRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.BundlerProto.InvalidateBundleResponse>) responseObserver);
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
          getPrepareBundleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.internal.v1.BundlerProto.PrepareBundleRequest,
              com.aruna.api.internal.v1.BundlerProto.PrepareBundleResponse>(
                service, METHODID_PREPARE_BUNDLE)))
        .addMethod(
          getEnableBundleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.internal.v1.BundlerProto.EnableBundleRequest,
              com.aruna.api.internal.v1.BundlerProto.EnableBundleResponse>(
                service, METHODID_ENABLE_BUNDLE)))
        .addMethod(
          getInvalidateBundleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.internal.v1.BundlerProto.InvalidateBundleRequest,
              com.aruna.api.internal.v1.BundlerProto.InvalidateBundleResponse>(
                service, METHODID_INVALIDATE_BUNDLE)))
        .build();
  }

  private static abstract class InternalBundlerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InternalBundlerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.internal.v1.BundlerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InternalBundlerService");
    }
  }

  private static final class InternalBundlerServiceFileDescriptorSupplier
      extends InternalBundlerServiceBaseDescriptorSupplier {
    InternalBundlerServiceFileDescriptorSupplier() {}
  }

  private static final class InternalBundlerServiceMethodDescriptorSupplier
      extends InternalBundlerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InternalBundlerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InternalBundlerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InternalBundlerServiceFileDescriptorSupplier())
              .addMethod(getPrepareBundleMethod())
              .addMethod(getEnableBundleMethod())
              .addMethod(getInvalidateBundleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
