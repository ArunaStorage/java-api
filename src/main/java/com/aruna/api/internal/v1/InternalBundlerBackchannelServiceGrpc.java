package com.aruna.api.internal.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/internal/v1/bundler.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InternalBundlerBackchannelServiceGrpc {

  private InternalBundlerBackchannelServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.internal.v1.InternalBundlerBackchannelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.internal.v1.BundlerProto.GetBundlesRequest,
      com.aruna.api.internal.v1.BundlerProto.GetBundlesResponse> getGetBundlesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBundles",
      requestType = com.aruna.api.internal.v1.BundlerProto.GetBundlesRequest.class,
      responseType = com.aruna.api.internal.v1.BundlerProto.GetBundlesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.internal.v1.BundlerProto.GetBundlesRequest,
      com.aruna.api.internal.v1.BundlerProto.GetBundlesResponse> getGetBundlesMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.internal.v1.BundlerProto.GetBundlesRequest, com.aruna.api.internal.v1.BundlerProto.GetBundlesResponse> getGetBundlesMethod;
    if ((getGetBundlesMethod = InternalBundlerBackchannelServiceGrpc.getGetBundlesMethod) == null) {
      synchronized (InternalBundlerBackchannelServiceGrpc.class) {
        if ((getGetBundlesMethod = InternalBundlerBackchannelServiceGrpc.getGetBundlesMethod) == null) {
          InternalBundlerBackchannelServiceGrpc.getGetBundlesMethod = getGetBundlesMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.internal.v1.BundlerProto.GetBundlesRequest, com.aruna.api.internal.v1.BundlerProto.GetBundlesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBundles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.BundlerProto.GetBundlesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.BundlerProto.GetBundlesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InternalBundlerBackchannelServiceMethodDescriptorSupplier("GetBundles"))
              .build();
        }
      }
    }
    return getGetBundlesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InternalBundlerBackchannelServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InternalBundlerBackchannelServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InternalBundlerBackchannelServiceStub>() {
        @java.lang.Override
        public InternalBundlerBackchannelServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InternalBundlerBackchannelServiceStub(channel, callOptions);
        }
      };
    return InternalBundlerBackchannelServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InternalBundlerBackchannelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InternalBundlerBackchannelServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InternalBundlerBackchannelServiceBlockingStub>() {
        @java.lang.Override
        public InternalBundlerBackchannelServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InternalBundlerBackchannelServiceBlockingStub(channel, callOptions);
        }
      };
    return InternalBundlerBackchannelServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InternalBundlerBackchannelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InternalBundlerBackchannelServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InternalBundlerBackchannelServiceFutureStub>() {
        @java.lang.Override
        public InternalBundlerBackchannelServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InternalBundlerBackchannelServiceFutureStub(channel, callOptions);
        }
      };
    return InternalBundlerBackchannelServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getBundles(com.aruna.api.internal.v1.BundlerProto.GetBundlesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.BundlerProto.GetBundlesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBundlesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InternalBundlerBackchannelService.
   */
  public static abstract class InternalBundlerBackchannelServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InternalBundlerBackchannelServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InternalBundlerBackchannelService.
   */
  public static final class InternalBundlerBackchannelServiceStub
      extends io.grpc.stub.AbstractAsyncStub<InternalBundlerBackchannelServiceStub> {
    private InternalBundlerBackchannelServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalBundlerBackchannelServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InternalBundlerBackchannelServiceStub(channel, callOptions);
    }

    /**
     */
    public void getBundles(com.aruna.api.internal.v1.BundlerProto.GetBundlesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.BundlerProto.GetBundlesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBundlesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InternalBundlerBackchannelService.
   */
  public static final class InternalBundlerBackchannelServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InternalBundlerBackchannelServiceBlockingStub> {
    private InternalBundlerBackchannelServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalBundlerBackchannelServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InternalBundlerBackchannelServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.aruna.api.internal.v1.BundlerProto.GetBundlesResponse getBundles(com.aruna.api.internal.v1.BundlerProto.GetBundlesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBundlesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InternalBundlerBackchannelService.
   */
  public static final class InternalBundlerBackchannelServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<InternalBundlerBackchannelServiceFutureStub> {
    private InternalBundlerBackchannelServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalBundlerBackchannelServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InternalBundlerBackchannelServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.internal.v1.BundlerProto.GetBundlesResponse> getBundles(
        com.aruna.api.internal.v1.BundlerProto.GetBundlesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBundlesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BUNDLES = 0;

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
        case METHODID_GET_BUNDLES:
          serviceImpl.getBundles((com.aruna.api.internal.v1.BundlerProto.GetBundlesRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.BundlerProto.GetBundlesResponse>) responseObserver);
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
          getGetBundlesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.internal.v1.BundlerProto.GetBundlesRequest,
              com.aruna.api.internal.v1.BundlerProto.GetBundlesResponse>(
                service, METHODID_GET_BUNDLES)))
        .build();
  }

  private static abstract class InternalBundlerBackchannelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InternalBundlerBackchannelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.internal.v1.BundlerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InternalBundlerBackchannelService");
    }
  }

  private static final class InternalBundlerBackchannelServiceFileDescriptorSupplier
      extends InternalBundlerBackchannelServiceBaseDescriptorSupplier {
    InternalBundlerBackchannelServiceFileDescriptorSupplier() {}
  }

  private static final class InternalBundlerBackchannelServiceMethodDescriptorSupplier
      extends InternalBundlerBackchannelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InternalBundlerBackchannelServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InternalBundlerBackchannelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InternalBundlerBackchannelServiceFileDescriptorSupplier())
              .addMethod(getGetBundlesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
