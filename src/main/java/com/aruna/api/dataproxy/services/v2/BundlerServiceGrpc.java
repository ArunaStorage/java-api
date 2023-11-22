package com.aruna.api.dataproxy.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * BundlerService
 * Status: ALPHA
 * Dataproxy specific service for creating and deleting bundles.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: aruna/api/dataproxy/services/v2/bundler_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BundlerServiceGrpc {

  private BundlerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "aruna.api.dataproxy.services.v2.BundlerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.CreateBundleRequest,
      com.aruna.api.dataproxy.services.v2.CreateBundleResponse> getCreateBundleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBundle",
      requestType = com.aruna.api.dataproxy.services.v2.CreateBundleRequest.class,
      responseType = com.aruna.api.dataproxy.services.v2.CreateBundleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.CreateBundleRequest,
      com.aruna.api.dataproxy.services.v2.CreateBundleResponse> getCreateBundleMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.CreateBundleRequest, com.aruna.api.dataproxy.services.v2.CreateBundleResponse> getCreateBundleMethod;
    if ((getCreateBundleMethod = BundlerServiceGrpc.getCreateBundleMethod) == null) {
      synchronized (BundlerServiceGrpc.class) {
        if ((getCreateBundleMethod = BundlerServiceGrpc.getCreateBundleMethod) == null) {
          BundlerServiceGrpc.getCreateBundleMethod = getCreateBundleMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.dataproxy.services.v2.CreateBundleRequest, com.aruna.api.dataproxy.services.v2.CreateBundleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBundle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.CreateBundleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.CreateBundleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BundlerServiceMethodDescriptorSupplier("CreateBundle"))
              .build();
        }
      }
    }
    return getCreateBundleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DeleteBundleRequest,
      com.aruna.api.dataproxy.services.v2.DeleteBundleResponse> getDeleteBundleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBundle",
      requestType = com.aruna.api.dataproxy.services.v2.DeleteBundleRequest.class,
      responseType = com.aruna.api.dataproxy.services.v2.DeleteBundleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DeleteBundleRequest,
      com.aruna.api.dataproxy.services.v2.DeleteBundleResponse> getDeleteBundleMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DeleteBundleRequest, com.aruna.api.dataproxy.services.v2.DeleteBundleResponse> getDeleteBundleMethod;
    if ((getDeleteBundleMethod = BundlerServiceGrpc.getDeleteBundleMethod) == null) {
      synchronized (BundlerServiceGrpc.class) {
        if ((getDeleteBundleMethod = BundlerServiceGrpc.getDeleteBundleMethod) == null) {
          BundlerServiceGrpc.getDeleteBundleMethod = getDeleteBundleMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.dataproxy.services.v2.DeleteBundleRequest, com.aruna.api.dataproxy.services.v2.DeleteBundleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBundle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.DeleteBundleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.DeleteBundleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BundlerServiceMethodDescriptorSupplier("DeleteBundle"))
              .build();
        }
      }
    }
    return getDeleteBundleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BundlerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BundlerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BundlerServiceStub>() {
        @java.lang.Override
        public BundlerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BundlerServiceStub(channel, callOptions);
        }
      };
    return BundlerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BundlerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BundlerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BundlerServiceBlockingStub>() {
        @java.lang.Override
        public BundlerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BundlerServiceBlockingStub(channel, callOptions);
        }
      };
    return BundlerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BundlerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BundlerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BundlerServiceFutureStub>() {
        @java.lang.Override
        public BundlerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BundlerServiceFutureStub(channel, callOptions);
        }
      };
    return BundlerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * BundlerService
   * Status: ALPHA
   * Dataproxy specific service for creating and deleting bundles.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateBundle
     * Status: ALPHA
     * Creates a bundle with multiple resources, dataproxy only.
     * </pre>
     */
    default void createBundle(com.aruna.api.dataproxy.services.v2.CreateBundleRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.CreateBundleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBundleMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteBundle
     * Status: ALPHA
     * Delete an existing bundle, dataproxy only.
     * </pre>
     */
    default void deleteBundle(com.aruna.api.dataproxy.services.v2.DeleteBundleRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DeleteBundleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBundleMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BundlerService.
   * <pre>
   * BundlerService
   * Status: ALPHA
   * Dataproxy specific service for creating and deleting bundles.
   * </pre>
   */
  public static abstract class BundlerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BundlerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BundlerService.
   * <pre>
   * BundlerService
   * Status: ALPHA
   * Dataproxy specific service for creating and deleting bundles.
   * </pre>
   */
  public static final class BundlerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BundlerServiceStub> {
    private BundlerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BundlerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BundlerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateBundle
     * Status: ALPHA
     * Creates a bundle with multiple resources, dataproxy only.
     * </pre>
     */
    public void createBundle(com.aruna.api.dataproxy.services.v2.CreateBundleRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.CreateBundleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBundleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteBundle
     * Status: ALPHA
     * Delete an existing bundle, dataproxy only.
     * </pre>
     */
    public void deleteBundle(com.aruna.api.dataproxy.services.v2.DeleteBundleRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DeleteBundleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBundleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BundlerService.
   * <pre>
   * BundlerService
   * Status: ALPHA
   * Dataproxy specific service for creating and deleting bundles.
   * </pre>
   */
  public static final class BundlerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BundlerServiceBlockingStub> {
    private BundlerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BundlerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BundlerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateBundle
     * Status: ALPHA
     * Creates a bundle with multiple resources, dataproxy only.
     * </pre>
     */
    public com.aruna.api.dataproxy.services.v2.CreateBundleResponse createBundle(com.aruna.api.dataproxy.services.v2.CreateBundleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBundleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteBundle
     * Status: ALPHA
     * Delete an existing bundle, dataproxy only.
     * </pre>
     */
    public com.aruna.api.dataproxy.services.v2.DeleteBundleResponse deleteBundle(com.aruna.api.dataproxy.services.v2.DeleteBundleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBundleMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BundlerService.
   * <pre>
   * BundlerService
   * Status: ALPHA
   * Dataproxy specific service for creating and deleting bundles.
   * </pre>
   */
  public static final class BundlerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BundlerServiceFutureStub> {
    private BundlerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BundlerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BundlerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateBundle
     * Status: ALPHA
     * Creates a bundle with multiple resources, dataproxy only.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.dataproxy.services.v2.CreateBundleResponse> createBundle(
        com.aruna.api.dataproxy.services.v2.CreateBundleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBundleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteBundle
     * Status: ALPHA
     * Delete an existing bundle, dataproxy only.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.dataproxy.services.v2.DeleteBundleResponse> deleteBundle(
        com.aruna.api.dataproxy.services.v2.DeleteBundleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBundleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BUNDLE = 0;
  private static final int METHODID_DELETE_BUNDLE = 1;

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
        case METHODID_CREATE_BUNDLE:
          serviceImpl.createBundle((com.aruna.api.dataproxy.services.v2.CreateBundleRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.CreateBundleResponse>) responseObserver);
          break;
        case METHODID_DELETE_BUNDLE:
          serviceImpl.deleteBundle((com.aruna.api.dataproxy.services.v2.DeleteBundleRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DeleteBundleResponse>) responseObserver);
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
          getCreateBundleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.dataproxy.services.v2.CreateBundleRequest,
              com.aruna.api.dataproxy.services.v2.CreateBundleResponse>(
                service, METHODID_CREATE_BUNDLE)))
        .addMethod(
          getDeleteBundleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.dataproxy.services.v2.DeleteBundleRequest,
              com.aruna.api.dataproxy.services.v2.DeleteBundleResponse>(
                service, METHODID_DELETE_BUNDLE)))
        .build();
  }

  private static abstract class BundlerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BundlerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.dataproxy.services.v2.BundlerServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BundlerService");
    }
  }

  private static final class BundlerServiceFileDescriptorSupplier
      extends BundlerServiceBaseDescriptorSupplier {
    BundlerServiceFileDescriptorSupplier() {}
  }

  private static final class BundlerServiceMethodDescriptorSupplier
      extends BundlerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BundlerServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BundlerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BundlerServiceFileDescriptorSupplier())
              .addMethod(getCreateBundleMethod())
              .addMethod(getDeleteBundleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
