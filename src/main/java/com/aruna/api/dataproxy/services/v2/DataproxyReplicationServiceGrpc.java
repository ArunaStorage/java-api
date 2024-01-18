package com.aruna.api.dataproxy.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * DataproxyService
 * Status: ALPHA
 * Service for data replication between data-proxies
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: aruna/api/dataproxy/services/v2/dataproxy_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataproxyReplicationServiceGrpc {

  private DataproxyReplicationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "aruna.api.dataproxy.services.v2.DataproxyReplicationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.PullReplicationRequest,
      com.aruna.api.dataproxy.services.v2.PullReplicationResponse> getPullReplicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PullReplication",
      requestType = com.aruna.api.dataproxy.services.v2.PullReplicationRequest.class,
      responseType = com.aruna.api.dataproxy.services.v2.PullReplicationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.PullReplicationRequest,
      com.aruna.api.dataproxy.services.v2.PullReplicationResponse> getPullReplicationMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.PullReplicationRequest, com.aruna.api.dataproxy.services.v2.PullReplicationResponse> getPullReplicationMethod;
    if ((getPullReplicationMethod = DataproxyReplicationServiceGrpc.getPullReplicationMethod) == null) {
      synchronized (DataproxyReplicationServiceGrpc.class) {
        if ((getPullReplicationMethod = DataproxyReplicationServiceGrpc.getPullReplicationMethod) == null) {
          DataproxyReplicationServiceGrpc.getPullReplicationMethod = getPullReplicationMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.dataproxy.services.v2.PullReplicationRequest, com.aruna.api.dataproxy.services.v2.PullReplicationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PullReplication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.PullReplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.PullReplicationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataproxyReplicationServiceMethodDescriptorSupplier("PullReplication"))
              .build();
        }
      }
    }
    return getPullReplicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.PushReplicationRequest,
      com.aruna.api.dataproxy.services.v2.PushReplicationResponse> getPushReplicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PushReplication",
      requestType = com.aruna.api.dataproxy.services.v2.PushReplicationRequest.class,
      responseType = com.aruna.api.dataproxy.services.v2.PushReplicationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.PushReplicationRequest,
      com.aruna.api.dataproxy.services.v2.PushReplicationResponse> getPushReplicationMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.PushReplicationRequest, com.aruna.api.dataproxy.services.v2.PushReplicationResponse> getPushReplicationMethod;
    if ((getPushReplicationMethod = DataproxyReplicationServiceGrpc.getPushReplicationMethod) == null) {
      synchronized (DataproxyReplicationServiceGrpc.class) {
        if ((getPushReplicationMethod = DataproxyReplicationServiceGrpc.getPushReplicationMethod) == null) {
          DataproxyReplicationServiceGrpc.getPushReplicationMethod = getPushReplicationMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.dataproxy.services.v2.PushReplicationRequest, com.aruna.api.dataproxy.services.v2.PushReplicationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PushReplication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.PushReplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.PushReplicationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataproxyReplicationServiceMethodDescriptorSupplier("PushReplication"))
              .build();
        }
      }
    }
    return getPushReplicationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataproxyReplicationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataproxyReplicationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataproxyReplicationServiceStub>() {
        @java.lang.Override
        public DataproxyReplicationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataproxyReplicationServiceStub(channel, callOptions);
        }
      };
    return DataproxyReplicationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataproxyReplicationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataproxyReplicationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataproxyReplicationServiceBlockingStub>() {
        @java.lang.Override
        public DataproxyReplicationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataproxyReplicationServiceBlockingStub(channel, callOptions);
        }
      };
    return DataproxyReplicationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataproxyReplicationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataproxyReplicationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataproxyReplicationServiceFutureStub>() {
        @java.lang.Override
        public DataproxyReplicationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataproxyReplicationServiceFutureStub(channel, callOptions);
        }
      };
    return DataproxyReplicationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * DataproxyService
   * Status: ALPHA
   * Service for data replication between data-proxies
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * RequestReplication
     * Status: ALPHA
     * Creates a replication stream
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.PullReplicationRequest> pullReplication(
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.PullReplicationResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getPullReplicationMethod(), responseObserver);
    }

    /**
     * <pre>
     * InitReplication
     * Status: ALPHA
     * Provides the necessary url to init replication
     * </pre>
     */
    default void pushReplication(com.aruna.api.dataproxy.services.v2.PushReplicationRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.PushReplicationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPushReplicationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DataproxyReplicationService.
   * <pre>
   * DataproxyService
   * Status: ALPHA
   * Service for data replication between data-proxies
   * </pre>
   */
  public static abstract class DataproxyReplicationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DataproxyReplicationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DataproxyReplicationService.
   * <pre>
   * DataproxyService
   * Status: ALPHA
   * Service for data replication between data-proxies
   * </pre>
   */
  public static final class DataproxyReplicationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DataproxyReplicationServiceStub> {
    private DataproxyReplicationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataproxyReplicationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataproxyReplicationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * RequestReplication
     * Status: ALPHA
     * Creates a replication stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.PullReplicationRequest> pullReplication(
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.PullReplicationResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getPullReplicationMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * InitReplication
     * Status: ALPHA
     * Provides the necessary url to init replication
     * </pre>
     */
    public void pushReplication(com.aruna.api.dataproxy.services.v2.PushReplicationRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.PushReplicationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPushReplicationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DataproxyReplicationService.
   * <pre>
   * DataproxyService
   * Status: ALPHA
   * Service for data replication between data-proxies
   * </pre>
   */
  public static final class DataproxyReplicationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DataproxyReplicationServiceBlockingStub> {
    private DataproxyReplicationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataproxyReplicationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataproxyReplicationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * InitReplication
     * Status: ALPHA
     * Provides the necessary url to init replication
     * </pre>
     */
    public com.aruna.api.dataproxy.services.v2.PushReplicationResponse pushReplication(com.aruna.api.dataproxy.services.v2.PushReplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPushReplicationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DataproxyReplicationService.
   * <pre>
   * DataproxyService
   * Status: ALPHA
   * Service for data replication between data-proxies
   * </pre>
   */
  public static final class DataproxyReplicationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DataproxyReplicationServiceFutureStub> {
    private DataproxyReplicationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataproxyReplicationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataproxyReplicationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * InitReplication
     * Status: ALPHA
     * Provides the necessary url to init replication
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.dataproxy.services.v2.PushReplicationResponse> pushReplication(
        com.aruna.api.dataproxy.services.v2.PushReplicationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPushReplicationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUSH_REPLICATION = 0;
  private static final int METHODID_PULL_REPLICATION = 1;

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
        case METHODID_PUSH_REPLICATION:
          serviceImpl.pushReplication((com.aruna.api.dataproxy.services.v2.PushReplicationRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.PushReplicationResponse>) responseObserver);
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
        case METHODID_PULL_REPLICATION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.pullReplication(
              (io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.PullReplicationResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getPullReplicationMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.aruna.api.dataproxy.services.v2.PullReplicationRequest,
              com.aruna.api.dataproxy.services.v2.PullReplicationResponse>(
                service, METHODID_PULL_REPLICATION)))
        .addMethod(
          getPushReplicationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.dataproxy.services.v2.PushReplicationRequest,
              com.aruna.api.dataproxy.services.v2.PushReplicationResponse>(
                service, METHODID_PUSH_REPLICATION)))
        .build();
  }

  private static abstract class DataproxyReplicationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataproxyReplicationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataproxyReplicationService");
    }
  }

  private static final class DataproxyReplicationServiceFileDescriptorSupplier
      extends DataproxyReplicationServiceBaseDescriptorSupplier {
    DataproxyReplicationServiceFileDescriptorSupplier() {}
  }

  private static final class DataproxyReplicationServiceMethodDescriptorSupplier
      extends DataproxyReplicationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DataproxyReplicationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DataproxyReplicationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataproxyReplicationServiceFileDescriptorSupplier())
              .addMethod(getPullReplicationMethod())
              .addMethod(getPushReplicationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
