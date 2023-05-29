package com.aruna.api.internal.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/internal/v1/authorize.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InternalAuthorizeServiceGrpc {

  private InternalAuthorizeServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.internal.v1.InternalAuthorizeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.internal.v1.AuthorizeProto.AuthorizeRequest,
      com.aruna.api.internal.v1.AuthorizeProto.AuthorizeResponse> getAuthorizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Authorize",
      requestType = com.aruna.api.internal.v1.AuthorizeProto.AuthorizeRequest.class,
      responseType = com.aruna.api.internal.v1.AuthorizeProto.AuthorizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.internal.v1.AuthorizeProto.AuthorizeRequest,
      com.aruna.api.internal.v1.AuthorizeProto.AuthorizeResponse> getAuthorizeMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.internal.v1.AuthorizeProto.AuthorizeRequest, com.aruna.api.internal.v1.AuthorizeProto.AuthorizeResponse> getAuthorizeMethod;
    if ((getAuthorizeMethod = InternalAuthorizeServiceGrpc.getAuthorizeMethod) == null) {
      synchronized (InternalAuthorizeServiceGrpc.class) {
        if ((getAuthorizeMethod = InternalAuthorizeServiceGrpc.getAuthorizeMethod) == null) {
          InternalAuthorizeServiceGrpc.getAuthorizeMethod = getAuthorizeMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.internal.v1.AuthorizeProto.AuthorizeRequest, com.aruna.api.internal.v1.AuthorizeProto.AuthorizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Authorize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.AuthorizeProto.AuthorizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.AuthorizeProto.AuthorizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InternalAuthorizeServiceMethodDescriptorSupplier("Authorize"))
              .build();
        }
      }
    }
    return getAuthorizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.internal.v1.AuthorizeProto.GetSecretRequest,
      com.aruna.api.internal.v1.AuthorizeProto.GetSecretResponse> getGetSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSecret",
      requestType = com.aruna.api.internal.v1.AuthorizeProto.GetSecretRequest.class,
      responseType = com.aruna.api.internal.v1.AuthorizeProto.GetSecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.internal.v1.AuthorizeProto.GetSecretRequest,
      com.aruna.api.internal.v1.AuthorizeProto.GetSecretResponse> getGetSecretMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.internal.v1.AuthorizeProto.GetSecretRequest, com.aruna.api.internal.v1.AuthorizeProto.GetSecretResponse> getGetSecretMethod;
    if ((getGetSecretMethod = InternalAuthorizeServiceGrpc.getGetSecretMethod) == null) {
      synchronized (InternalAuthorizeServiceGrpc.class) {
        if ((getGetSecretMethod = InternalAuthorizeServiceGrpc.getGetSecretMethod) == null) {
          InternalAuthorizeServiceGrpc.getGetSecretMethod = getGetSecretMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.internal.v1.AuthorizeProto.GetSecretRequest, com.aruna.api.internal.v1.AuthorizeProto.GetSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.AuthorizeProto.GetSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.AuthorizeProto.GetSecretResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InternalAuthorizeServiceMethodDescriptorSupplier("GetSecret"))
              .build();
        }
      }
    }
    return getGetSecretMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InternalAuthorizeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InternalAuthorizeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InternalAuthorizeServiceStub>() {
        @java.lang.Override
        public InternalAuthorizeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InternalAuthorizeServiceStub(channel, callOptions);
        }
      };
    return InternalAuthorizeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InternalAuthorizeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InternalAuthorizeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InternalAuthorizeServiceBlockingStub>() {
        @java.lang.Override
        public InternalAuthorizeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InternalAuthorizeServiceBlockingStub(channel, callOptions);
        }
      };
    return InternalAuthorizeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InternalAuthorizeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InternalAuthorizeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InternalAuthorizeServiceFutureStub>() {
        @java.lang.Override
        public InternalAuthorizeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InternalAuthorizeServiceFutureStub(channel, callOptions);
        }
      };
    return InternalAuthorizeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void authorize(com.aruna.api.internal.v1.AuthorizeProto.AuthorizeRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.AuthorizeProto.AuthorizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthorizeMethod(), responseObserver);
    }

    /**
     */
    default void getSecret(com.aruna.api.internal.v1.AuthorizeProto.GetSecretRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.AuthorizeProto.GetSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSecretMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InternalAuthorizeService.
   */
  public static abstract class InternalAuthorizeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InternalAuthorizeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InternalAuthorizeService.
   */
  public static final class InternalAuthorizeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<InternalAuthorizeServiceStub> {
    private InternalAuthorizeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalAuthorizeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InternalAuthorizeServiceStub(channel, callOptions);
    }

    /**
     */
    public void authorize(com.aruna.api.internal.v1.AuthorizeProto.AuthorizeRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.AuthorizeProto.AuthorizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthorizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSecret(com.aruna.api.internal.v1.AuthorizeProto.GetSecretRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.AuthorizeProto.GetSecretResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSecretMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InternalAuthorizeService.
   */
  public static final class InternalAuthorizeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InternalAuthorizeServiceBlockingStub> {
    private InternalAuthorizeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalAuthorizeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InternalAuthorizeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.aruna.api.internal.v1.AuthorizeProto.AuthorizeResponse authorize(com.aruna.api.internal.v1.AuthorizeProto.AuthorizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthorizeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.internal.v1.AuthorizeProto.GetSecretResponse getSecret(com.aruna.api.internal.v1.AuthorizeProto.GetSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSecretMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InternalAuthorizeService.
   */
  public static final class InternalAuthorizeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<InternalAuthorizeServiceFutureStub> {
    private InternalAuthorizeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalAuthorizeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InternalAuthorizeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.internal.v1.AuthorizeProto.AuthorizeResponse> authorize(
        com.aruna.api.internal.v1.AuthorizeProto.AuthorizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthorizeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.internal.v1.AuthorizeProto.GetSecretResponse> getSecret(
        com.aruna.api.internal.v1.AuthorizeProto.GetSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSecretMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTHORIZE = 0;
  private static final int METHODID_GET_SECRET = 1;

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
        case METHODID_AUTHORIZE:
          serviceImpl.authorize((com.aruna.api.internal.v1.AuthorizeProto.AuthorizeRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.AuthorizeProto.AuthorizeResponse>) responseObserver);
          break;
        case METHODID_GET_SECRET:
          serviceImpl.getSecret((com.aruna.api.internal.v1.AuthorizeProto.GetSecretRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.AuthorizeProto.GetSecretResponse>) responseObserver);
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
          getAuthorizeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.internal.v1.AuthorizeProto.AuthorizeRequest,
              com.aruna.api.internal.v1.AuthorizeProto.AuthorizeResponse>(
                service, METHODID_AUTHORIZE)))
        .addMethod(
          getGetSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.internal.v1.AuthorizeProto.GetSecretRequest,
              com.aruna.api.internal.v1.AuthorizeProto.GetSecretResponse>(
                service, METHODID_GET_SECRET)))
        .build();
  }

  private static abstract class InternalAuthorizeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InternalAuthorizeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.internal.v1.AuthorizeProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InternalAuthorizeService");
    }
  }

  private static final class InternalAuthorizeServiceFileDescriptorSupplier
      extends InternalAuthorizeServiceBaseDescriptorSupplier {
    InternalAuthorizeServiceFileDescriptorSupplier() {}
  }

  private static final class InternalAuthorizeServiceMethodDescriptorSupplier
      extends InternalAuthorizeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InternalAuthorizeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InternalAuthorizeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InternalAuthorizeServiceFileDescriptorSupplier())
              .addMethod(getAuthorizeMethod())
              .addMethod(getGetSecretMethod())
              .build();
        }
      }
    }
    return result;
  }
}
