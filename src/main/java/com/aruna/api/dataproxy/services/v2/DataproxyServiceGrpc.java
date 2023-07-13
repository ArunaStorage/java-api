package com.aruna.api.dataproxy.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/dataproxy/services/v2/dataproxy_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataproxyServiceGrpc {

  private DataproxyServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.dataproxy.services.v2.DataproxyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.RequestReplicationRequest,
      com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.RequestReplicationResponse> getRequestReplicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestReplication",
      requestType = com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.RequestReplicationRequest.class,
      responseType = com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.RequestReplicationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.RequestReplicationRequest,
      com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.RequestReplicationResponse> getRequestReplicationMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.RequestReplicationRequest, com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.RequestReplicationResponse> getRequestReplicationMethod;
    if ((getRequestReplicationMethod = DataproxyServiceGrpc.getRequestReplicationMethod) == null) {
      synchronized (DataproxyServiceGrpc.class) {
        if ((getRequestReplicationMethod = DataproxyServiceGrpc.getRequestReplicationMethod) == null) {
          DataproxyServiceGrpc.getRequestReplicationMethod = getRequestReplicationMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.RequestReplicationRequest, com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.RequestReplicationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestReplication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.RequestReplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.RequestReplicationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataproxyServiceMethodDescriptorSupplier("RequestReplication"))
              .build();
        }
      }
    }
    return getRequestReplicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.InitReplicationRequest,
      com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.InitReplicationResponse> getInitReplicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitReplication",
      requestType = com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.InitReplicationRequest.class,
      responseType = com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.InitReplicationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.InitReplicationRequest,
      com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.InitReplicationResponse> getInitReplicationMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.InitReplicationRequest, com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.InitReplicationResponse> getInitReplicationMethod;
    if ((getInitReplicationMethod = DataproxyServiceGrpc.getInitReplicationMethod) == null) {
      synchronized (DataproxyServiceGrpc.class) {
        if ((getInitReplicationMethod = DataproxyServiceGrpc.getInitReplicationMethod) == null) {
          DataproxyServiceGrpc.getInitReplicationMethod = getInitReplicationMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.InitReplicationRequest, com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.InitReplicationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitReplication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.InitReplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.InitReplicationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataproxyServiceMethodDescriptorSupplier("InitReplication"))
              .build();
        }
      }
    }
    return getInitReplicationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataproxyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataproxyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataproxyServiceStub>() {
        @java.lang.Override
        public DataproxyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataproxyServiceStub(channel, callOptions);
        }
      };
    return DataproxyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataproxyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataproxyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataproxyServiceBlockingStub>() {
        @java.lang.Override
        public DataproxyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataproxyServiceBlockingStub(channel, callOptions);
        }
      };
    return DataproxyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataproxyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataproxyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataproxyServiceFutureStub>() {
        @java.lang.Override
        public DataproxyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataproxyServiceFutureStub(channel, callOptions);
        }
      };
    return DataproxyServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * RequestReplication
     * Status: BETA
     * Creates a replication request
     * </pre>
     */
    default void requestReplication(com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.RequestReplicationRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.RequestReplicationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestReplicationMethod(), responseObserver);
    }

    /**
     * <pre>
     * InitReplication
     * Status: BETA
     * Provides the necessary url to init replication
     * </pre>
     */
    default void initReplication(com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.InitReplicationRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.InitReplicationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitReplicationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DataproxyService.
   */
  public static abstract class DataproxyServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DataproxyServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DataproxyService.
   */
  public static final class DataproxyServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DataproxyServiceStub> {
    private DataproxyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataproxyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataproxyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * RequestReplication
     * Status: BETA
     * Creates a replication request
     * </pre>
     */
    public void requestReplication(com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.RequestReplicationRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.RequestReplicationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestReplicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * InitReplication
     * Status: BETA
     * Provides the necessary url to init replication
     * </pre>
     */
    public void initReplication(com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.InitReplicationRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.InitReplicationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitReplicationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DataproxyService.
   */
  public static final class DataproxyServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DataproxyServiceBlockingStub> {
    private DataproxyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataproxyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataproxyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RequestReplication
     * Status: BETA
     * Creates a replication request
     * </pre>
     */
    public com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.RequestReplicationResponse requestReplication(com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.RequestReplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestReplicationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * InitReplication
     * Status: BETA
     * Provides the necessary url to init replication
     * </pre>
     */
    public com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.InitReplicationResponse initReplication(com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.InitReplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitReplicationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DataproxyService.
   */
  public static final class DataproxyServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DataproxyServiceFutureStub> {
    private DataproxyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataproxyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataproxyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RequestReplication
     * Status: BETA
     * Creates a replication request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.RequestReplicationResponse> requestReplication(
        com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.RequestReplicationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestReplicationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * InitReplication
     * Status: BETA
     * Provides the necessary url to init replication
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.InitReplicationResponse> initReplication(
        com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.InitReplicationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitReplicationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REQUEST_REPLICATION = 0;
  private static final int METHODID_INIT_REPLICATION = 1;

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
        case METHODID_REQUEST_REPLICATION:
          serviceImpl.requestReplication((com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.RequestReplicationRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.RequestReplicationResponse>) responseObserver);
          break;
        case METHODID_INIT_REPLICATION:
          serviceImpl.initReplication((com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.InitReplicationRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.InitReplicationResponse>) responseObserver);
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
          getRequestReplicationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.RequestReplicationRequest,
              com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.RequestReplicationResponse>(
                service, METHODID_REQUEST_REPLICATION)))
        .addMethod(
          getInitReplicationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.InitReplicationRequest,
              com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.InitReplicationResponse>(
                service, METHODID_INIT_REPLICATION)))
        .build();
  }

  private static abstract class DataproxyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataproxyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataproxyService");
    }
  }

  private static final class DataproxyServiceFileDescriptorSupplier
      extends DataproxyServiceBaseDescriptorSupplier {
    DataproxyServiceFileDescriptorSupplier() {}
  }

  private static final class DataproxyServiceMethodDescriptorSupplier
      extends DataproxyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataproxyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DataproxyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataproxyServiceFileDescriptorSupplier())
              .addMethod(getRequestReplicationMethod())
              .addMethod(getInitReplicationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
