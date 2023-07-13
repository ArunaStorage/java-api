package com.aruna.api.dataproxy.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/dataproxy/services/v2/dataproxy_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataproxyUserServiceGrpc {

  private DataproxyUserServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.dataproxy.services.v2.DataproxyUserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.GetCredentialsRequest,
      com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.GetCredentialsResponse> getGetCredentialsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCredentials",
      requestType = com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.GetCredentialsRequest.class,
      responseType = com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.GetCredentialsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.GetCredentialsRequest,
      com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.GetCredentialsResponse> getGetCredentialsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.GetCredentialsRequest, com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.GetCredentialsResponse> getGetCredentialsMethod;
    if ((getGetCredentialsMethod = DataproxyUserServiceGrpc.getGetCredentialsMethod) == null) {
      synchronized (DataproxyUserServiceGrpc.class) {
        if ((getGetCredentialsMethod = DataproxyUserServiceGrpc.getGetCredentialsMethod) == null) {
          DataproxyUserServiceGrpc.getGetCredentialsMethod = getGetCredentialsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.GetCredentialsRequest, com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.GetCredentialsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCredentials"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.GetCredentialsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.GetCredentialsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataproxyUserServiceMethodDescriptorSupplier("GetCredentials"))
              .build();
        }
      }
    }
    return getGetCredentialsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PushReplicaRequest,
      com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PushReplicaResponse> getPushReplicaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PushReplica",
      requestType = com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PushReplicaRequest.class,
      responseType = com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PushReplicaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PushReplicaRequest,
      com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PushReplicaResponse> getPushReplicaMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PushReplicaRequest, com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PushReplicaResponse> getPushReplicaMethod;
    if ((getPushReplicaMethod = DataproxyUserServiceGrpc.getPushReplicaMethod) == null) {
      synchronized (DataproxyUserServiceGrpc.class) {
        if ((getPushReplicaMethod = DataproxyUserServiceGrpc.getPushReplicaMethod) == null) {
          DataproxyUserServiceGrpc.getPushReplicaMethod = getPushReplicaMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PushReplicaRequest, com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PushReplicaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PushReplica"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PushReplicaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PushReplicaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataproxyUserServiceMethodDescriptorSupplier("PushReplica"))
              .build();
        }
      }
    }
    return getPushReplicaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PullReplicaRequest,
      com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PullReplicaResponse> getPullReplicaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PullReplica",
      requestType = com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PullReplicaRequest.class,
      responseType = com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PullReplicaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PullReplicaRequest,
      com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PullReplicaResponse> getPullReplicaMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PullReplicaRequest, com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PullReplicaResponse> getPullReplicaMethod;
    if ((getPullReplicaMethod = DataproxyUserServiceGrpc.getPullReplicaMethod) == null) {
      synchronized (DataproxyUserServiceGrpc.class) {
        if ((getPullReplicaMethod = DataproxyUserServiceGrpc.getPullReplicaMethod) == null) {
          DataproxyUserServiceGrpc.getPullReplicaMethod = getPullReplicaMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PullReplicaRequest, com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PullReplicaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PullReplica"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PullReplicaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PullReplicaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataproxyUserServiceMethodDescriptorSupplier("PullReplica"))
              .build();
        }
      }
    }
    return getPullReplicaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.ReplicationStatusRequest,
      com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.ReplicationStatusResponse> getReplicationStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReplicationStatus",
      requestType = com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.ReplicationStatusRequest.class,
      responseType = com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.ReplicationStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.ReplicationStatusRequest,
      com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.ReplicationStatusResponse> getReplicationStatusMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.ReplicationStatusRequest, com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.ReplicationStatusResponse> getReplicationStatusMethod;
    if ((getReplicationStatusMethod = DataproxyUserServiceGrpc.getReplicationStatusMethod) == null) {
      synchronized (DataproxyUserServiceGrpc.class) {
        if ((getReplicationStatusMethod = DataproxyUserServiceGrpc.getReplicationStatusMethod) == null) {
          DataproxyUserServiceGrpc.getReplicationStatusMethod = getReplicationStatusMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.ReplicationStatusRequest, com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.ReplicationStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReplicationStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.ReplicationStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.ReplicationStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataproxyUserServiceMethodDescriptorSupplier("ReplicationStatus"))
              .build();
        }
      }
    }
    return getReplicationStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataproxyUserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataproxyUserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataproxyUserServiceStub>() {
        @java.lang.Override
        public DataproxyUserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataproxyUserServiceStub(channel, callOptions);
        }
      };
    return DataproxyUserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataproxyUserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataproxyUserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataproxyUserServiceBlockingStub>() {
        @java.lang.Override
        public DataproxyUserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataproxyUserServiceBlockingStub(channel, callOptions);
        }
      };
    return DataproxyUserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataproxyUserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataproxyUserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataproxyUserServiceFutureStub>() {
        @java.lang.Override
        public DataproxyUserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataproxyUserServiceFutureStub(channel, callOptions);
        }
      };
    return DataproxyUserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * GetCredentials
     * Status: BETA
     * Authorized method that needs a aruna-token to exchange for dataproxy
     * specific S3AccessKey and S3SecretKey
     * </pre>
     */
    default void getCredentials(com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.GetCredentialsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.GetCredentialsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCredentialsMethod(), responseObserver);
    }

    /**
     * <pre>
     * PushReplica
     * Status: BETA
     * Manually transfers a replica to another data-proxy
     * </pre>
     */
    default void pushReplica(com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PushReplicaRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PushReplicaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPushReplicaMethod(), responseObserver);
    }

    /**
     * <pre>
     * PullReplica
     * Status: BETA
     * Manually request data to be transferred to this data-proxy
     * </pre>
     */
    default void pullReplica(com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PullReplicaRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PullReplicaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPullReplicaMethod(), responseObserver);
    }

    /**
     * <pre>
     * PullReplica
     * Status: BETA
     * Status of the previous replication request
     * </pre>
     */
    default void replicationStatus(com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.ReplicationStatusRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.ReplicationStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReplicationStatusMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DataproxyUserService.
   */
  public static abstract class DataproxyUserServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DataproxyUserServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DataproxyUserService.
   */
  public static final class DataproxyUserServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DataproxyUserServiceStub> {
    private DataproxyUserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataproxyUserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataproxyUserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetCredentials
     * Status: BETA
     * Authorized method that needs a aruna-token to exchange for dataproxy
     * specific S3AccessKey and S3SecretKey
     * </pre>
     */
    public void getCredentials(com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.GetCredentialsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.GetCredentialsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCredentialsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PushReplica
     * Status: BETA
     * Manually transfers a replica to another data-proxy
     * </pre>
     */
    public void pushReplica(com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PushReplicaRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PushReplicaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPushReplicaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PullReplica
     * Status: BETA
     * Manually request data to be transferred to this data-proxy
     * </pre>
     */
    public void pullReplica(com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PullReplicaRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PullReplicaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPullReplicaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PullReplica
     * Status: BETA
     * Status of the previous replication request
     * </pre>
     */
    public void replicationStatus(com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.ReplicationStatusRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.ReplicationStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReplicationStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DataproxyUserService.
   */
  public static final class DataproxyUserServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DataproxyUserServiceBlockingStub> {
    private DataproxyUserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataproxyUserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataproxyUserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetCredentials
     * Status: BETA
     * Authorized method that needs a aruna-token to exchange for dataproxy
     * specific S3AccessKey and S3SecretKey
     * </pre>
     */
    public com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.GetCredentialsResponse getCredentials(com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.GetCredentialsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCredentialsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PushReplica
     * Status: BETA
     * Manually transfers a replica to another data-proxy
     * </pre>
     */
    public com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PushReplicaResponse pushReplica(com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PushReplicaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPushReplicaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PullReplica
     * Status: BETA
     * Manually request data to be transferred to this data-proxy
     * </pre>
     */
    public com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PullReplicaResponse pullReplica(com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PullReplicaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPullReplicaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PullReplica
     * Status: BETA
     * Status of the previous replication request
     * </pre>
     */
    public com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.ReplicationStatusResponse replicationStatus(com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.ReplicationStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReplicationStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DataproxyUserService.
   */
  public static final class DataproxyUserServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DataproxyUserServiceFutureStub> {
    private DataproxyUserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataproxyUserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataproxyUserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetCredentials
     * Status: BETA
     * Authorized method that needs a aruna-token to exchange for dataproxy
     * specific S3AccessKey and S3SecretKey
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.GetCredentialsResponse> getCredentials(
        com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.GetCredentialsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCredentialsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PushReplica
     * Status: BETA
     * Manually transfers a replica to another data-proxy
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PushReplicaResponse> pushReplica(
        com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PushReplicaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPushReplicaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PullReplica
     * Status: BETA
     * Manually request data to be transferred to this data-proxy
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PullReplicaResponse> pullReplica(
        com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PullReplicaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPullReplicaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PullReplica
     * Status: BETA
     * Status of the previous replication request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.ReplicationStatusResponse> replicationStatus(
        com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.ReplicationStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReplicationStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CREDENTIALS = 0;
  private static final int METHODID_PUSH_REPLICA = 1;
  private static final int METHODID_PULL_REPLICA = 2;
  private static final int METHODID_REPLICATION_STATUS = 3;

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
        case METHODID_GET_CREDENTIALS:
          serviceImpl.getCredentials((com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.GetCredentialsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.GetCredentialsResponse>) responseObserver);
          break;
        case METHODID_PUSH_REPLICA:
          serviceImpl.pushReplica((com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PushReplicaRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PushReplicaResponse>) responseObserver);
          break;
        case METHODID_PULL_REPLICA:
          serviceImpl.pullReplica((com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PullReplicaRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PullReplicaResponse>) responseObserver);
          break;
        case METHODID_REPLICATION_STATUS:
          serviceImpl.replicationStatus((com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.ReplicationStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.ReplicationStatusResponse>) responseObserver);
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
          getGetCredentialsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.GetCredentialsRequest,
              com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.GetCredentialsResponse>(
                service, METHODID_GET_CREDENTIALS)))
        .addMethod(
          getPushReplicaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PushReplicaRequest,
              com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PushReplicaResponse>(
                service, METHODID_PUSH_REPLICA)))
        .addMethod(
          getPullReplicaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PullReplicaRequest,
              com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.PullReplicaResponse>(
                service, METHODID_PULL_REPLICA)))
        .addMethod(
          getReplicationStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.ReplicationStatusRequest,
              com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.ReplicationStatusResponse>(
                service, METHODID_REPLICATION_STATUS)))
        .build();
  }

  private static abstract class DataproxyUserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataproxyUserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataproxyUserService");
    }
  }

  private static final class DataproxyUserServiceFileDescriptorSupplier
      extends DataproxyUserServiceBaseDescriptorSupplier {
    DataproxyUserServiceFileDescriptorSupplier() {}
  }

  private static final class DataproxyUserServiceMethodDescriptorSupplier
      extends DataproxyUserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataproxyUserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DataproxyUserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataproxyUserServiceFileDescriptorSupplier())
              .addMethod(getGetCredentialsMethod())
              .addMethod(getPushReplicaMethod())
              .addMethod(getPullReplicaMethod())
              .addMethod(getReplicationStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
