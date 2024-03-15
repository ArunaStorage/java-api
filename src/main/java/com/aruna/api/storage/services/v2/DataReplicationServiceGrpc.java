package com.aruna.api.storage.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * DataReplicationService
 * Endpoint specific methods for syncing data
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: aruna/api/storage/services/v2/data_replication_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataReplicationServiceGrpc {

  private DataReplicationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "aruna.api.storage.services.v2.DataReplicationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ReplicateProjectDataRequest,
      com.aruna.api.storage.services.v2.ReplicateProjectDataResponse> getReplicateProjectDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReplicateProjectData",
      requestType = com.aruna.api.storage.services.v2.ReplicateProjectDataRequest.class,
      responseType = com.aruna.api.storage.services.v2.ReplicateProjectDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ReplicateProjectDataRequest,
      com.aruna.api.storage.services.v2.ReplicateProjectDataResponse> getReplicateProjectDataMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ReplicateProjectDataRequest, com.aruna.api.storage.services.v2.ReplicateProjectDataResponse> getReplicateProjectDataMethod;
    if ((getReplicateProjectDataMethod = DataReplicationServiceGrpc.getReplicateProjectDataMethod) == null) {
      synchronized (DataReplicationServiceGrpc.class) {
        if ((getReplicateProjectDataMethod = DataReplicationServiceGrpc.getReplicateProjectDataMethod) == null) {
          DataReplicationServiceGrpc.getReplicateProjectDataMethod = getReplicateProjectDataMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ReplicateProjectDataRequest, com.aruna.api.storage.services.v2.ReplicateProjectDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReplicateProjectData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ReplicateProjectDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ReplicateProjectDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataReplicationServiceMethodDescriptorSupplier("ReplicateProjectData"))
              .build();
        }
      }
    }
    return getReplicateProjectDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.PartialReplicateDataRequest,
      com.aruna.api.storage.services.v2.PartialReplicateDataResponse> getPartialReplicateDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PartialReplicateData",
      requestType = com.aruna.api.storage.services.v2.PartialReplicateDataRequest.class,
      responseType = com.aruna.api.storage.services.v2.PartialReplicateDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.PartialReplicateDataRequest,
      com.aruna.api.storage.services.v2.PartialReplicateDataResponse> getPartialReplicateDataMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.PartialReplicateDataRequest, com.aruna.api.storage.services.v2.PartialReplicateDataResponse> getPartialReplicateDataMethod;
    if ((getPartialReplicateDataMethod = DataReplicationServiceGrpc.getPartialReplicateDataMethod) == null) {
      synchronized (DataReplicationServiceGrpc.class) {
        if ((getPartialReplicateDataMethod = DataReplicationServiceGrpc.getPartialReplicateDataMethod) == null) {
          DataReplicationServiceGrpc.getPartialReplicateDataMethod = getPartialReplicateDataMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.PartialReplicateDataRequest, com.aruna.api.storage.services.v2.PartialReplicateDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PartialReplicateData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.PartialReplicateDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.PartialReplicateDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataReplicationServiceMethodDescriptorSupplier("PartialReplicateData"))
              .build();
        }
      }
    }
    return getPartialReplicateDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateReplicationStatusRequest,
      com.aruna.api.storage.services.v2.UpdateReplicationStatusResponse> getUpdateReplicationStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateReplicationStatus",
      requestType = com.aruna.api.storage.services.v2.UpdateReplicationStatusRequest.class,
      responseType = com.aruna.api.storage.services.v2.UpdateReplicationStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateReplicationStatusRequest,
      com.aruna.api.storage.services.v2.UpdateReplicationStatusResponse> getUpdateReplicationStatusMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateReplicationStatusRequest, com.aruna.api.storage.services.v2.UpdateReplicationStatusResponse> getUpdateReplicationStatusMethod;
    if ((getUpdateReplicationStatusMethod = DataReplicationServiceGrpc.getUpdateReplicationStatusMethod) == null) {
      synchronized (DataReplicationServiceGrpc.class) {
        if ((getUpdateReplicationStatusMethod = DataReplicationServiceGrpc.getUpdateReplicationStatusMethod) == null) {
          DataReplicationServiceGrpc.getUpdateReplicationStatusMethod = getUpdateReplicationStatusMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.UpdateReplicationStatusRequest, com.aruna.api.storage.services.v2.UpdateReplicationStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateReplicationStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateReplicationStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateReplicationStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataReplicationServiceMethodDescriptorSupplier("UpdateReplicationStatus"))
              .build();
        }
      }
    }
    return getUpdateReplicationStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetReplicationStatusRequest,
      com.aruna.api.storage.services.v2.GetReplicationStatusResponse> getGetReplicationStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReplicationStatus",
      requestType = com.aruna.api.storage.services.v2.GetReplicationStatusRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetReplicationStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetReplicationStatusRequest,
      com.aruna.api.storage.services.v2.GetReplicationStatusResponse> getGetReplicationStatusMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetReplicationStatusRequest, com.aruna.api.storage.services.v2.GetReplicationStatusResponse> getGetReplicationStatusMethod;
    if ((getGetReplicationStatusMethod = DataReplicationServiceGrpc.getGetReplicationStatusMethod) == null) {
      synchronized (DataReplicationServiceGrpc.class) {
        if ((getGetReplicationStatusMethod = DataReplicationServiceGrpc.getGetReplicationStatusMethod) == null) {
          DataReplicationServiceGrpc.getGetReplicationStatusMethod = getGetReplicationStatusMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetReplicationStatusRequest, com.aruna.api.storage.services.v2.GetReplicationStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReplicationStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetReplicationStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetReplicationStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataReplicationServiceMethodDescriptorSupplier("GetReplicationStatus"))
              .build();
        }
      }
    }
    return getGetReplicationStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteReplicationRequest,
      com.aruna.api.storage.services.v2.DeleteReplicationResponse> getDeleteReplicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteReplication",
      requestType = com.aruna.api.storage.services.v2.DeleteReplicationRequest.class,
      responseType = com.aruna.api.storage.services.v2.DeleteReplicationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteReplicationRequest,
      com.aruna.api.storage.services.v2.DeleteReplicationResponse> getDeleteReplicationMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteReplicationRequest, com.aruna.api.storage.services.v2.DeleteReplicationResponse> getDeleteReplicationMethod;
    if ((getDeleteReplicationMethod = DataReplicationServiceGrpc.getDeleteReplicationMethod) == null) {
      synchronized (DataReplicationServiceGrpc.class) {
        if ((getDeleteReplicationMethod = DataReplicationServiceGrpc.getDeleteReplicationMethod) == null) {
          DataReplicationServiceGrpc.getDeleteReplicationMethod = getDeleteReplicationMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DeleteReplicationRequest, com.aruna.api.storage.services.v2.DeleteReplicationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteReplication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteReplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteReplicationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataReplicationServiceMethodDescriptorSupplier("DeleteReplication"))
              .build();
        }
      }
    }
    return getDeleteReplicationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataReplicationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataReplicationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataReplicationServiceStub>() {
        @java.lang.Override
        public DataReplicationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataReplicationServiceStub(channel, callOptions);
        }
      };
    return DataReplicationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataReplicationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataReplicationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataReplicationServiceBlockingStub>() {
        @java.lang.Override
        public DataReplicationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataReplicationServiceBlockingStub(channel, callOptions);
        }
      };
    return DataReplicationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataReplicationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataReplicationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataReplicationServiceFutureStub>() {
        @java.lang.Override
        public DataReplicationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataReplicationServiceFutureStub(channel, callOptions);
        }
      };
    return DataReplicationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * DataReplicationService
   * Endpoint specific methods for syncing data
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * ReplicateProjectData
     * Status: ALPHA
     * Replicates the (full) project data from one endpoint to another
     * </pre>
     */
    default void replicateProjectData(com.aruna.api.storage.services.v2.ReplicateProjectDataRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ReplicateProjectDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReplicateProjectDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * PartialReplicateData
     * Status: ALPHA
     * Partial replicate data between endpoints
     * </pre>
     */
    default void partialReplicateData(com.aruna.api.storage.services.v2.PartialReplicateDataRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.PartialReplicateDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPartialReplicateDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateReplicationStatus
     * Status: ALPHA
     * Update the replication status of a project
     * </pre>
     */
    default void updateReplicationStatus(com.aruna.api.storage.services.v2.UpdateReplicationStatusRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateReplicationStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateReplicationStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetReplicationStatus
     * Status: ALPHA
     * Get the replication status of a project
     * </pre>
     */
    default void getReplicationStatus(com.aruna.api.storage.services.v2.GetReplicationStatusRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetReplicationStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReplicationStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteReplication
     * Status: ALPHA
     * Delete the replication status of a project
     * </pre>
     */
    default void deleteReplication(com.aruna.api.storage.services.v2.DeleteReplicationRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteReplicationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteReplicationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DataReplicationService.
   * <pre>
   * DataReplicationService
   * Endpoint specific methods for syncing data
   * </pre>
   */
  public static abstract class DataReplicationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DataReplicationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DataReplicationService.
   * <pre>
   * DataReplicationService
   * Endpoint specific methods for syncing data
   * </pre>
   */
  public static final class DataReplicationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DataReplicationServiceStub> {
    private DataReplicationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataReplicationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataReplicationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * ReplicateProjectData
     * Status: ALPHA
     * Replicates the (full) project data from one endpoint to another
     * </pre>
     */
    public void replicateProjectData(com.aruna.api.storage.services.v2.ReplicateProjectDataRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ReplicateProjectDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReplicateProjectDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PartialReplicateData
     * Status: ALPHA
     * Partial replicate data between endpoints
     * </pre>
     */
    public void partialReplicateData(com.aruna.api.storage.services.v2.PartialReplicateDataRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.PartialReplicateDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPartialReplicateDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateReplicationStatus
     * Status: ALPHA
     * Update the replication status of a project
     * </pre>
     */
    public void updateReplicationStatus(com.aruna.api.storage.services.v2.UpdateReplicationStatusRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateReplicationStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateReplicationStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetReplicationStatus
     * Status: ALPHA
     * Get the replication status of a project
     * </pre>
     */
    public void getReplicationStatus(com.aruna.api.storage.services.v2.GetReplicationStatusRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetReplicationStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReplicationStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteReplication
     * Status: ALPHA
     * Delete the replication status of a project
     * </pre>
     */
    public void deleteReplication(com.aruna.api.storage.services.v2.DeleteReplicationRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteReplicationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteReplicationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DataReplicationService.
   * <pre>
   * DataReplicationService
   * Endpoint specific methods for syncing data
   * </pre>
   */
  public static final class DataReplicationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DataReplicationServiceBlockingStub> {
    private DataReplicationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataReplicationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataReplicationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ReplicateProjectData
     * Status: ALPHA
     * Replicates the (full) project data from one endpoint to another
     * </pre>
     */
    public com.aruna.api.storage.services.v2.ReplicateProjectDataResponse replicateProjectData(com.aruna.api.storage.services.v2.ReplicateProjectDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReplicateProjectDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PartialReplicateData
     * Status: ALPHA
     * Partial replicate data between endpoints
     * </pre>
     */
    public com.aruna.api.storage.services.v2.PartialReplicateDataResponse partialReplicateData(com.aruna.api.storage.services.v2.PartialReplicateDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPartialReplicateDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateReplicationStatus
     * Status: ALPHA
     * Update the replication status of a project
     * </pre>
     */
    public com.aruna.api.storage.services.v2.UpdateReplicationStatusResponse updateReplicationStatus(com.aruna.api.storage.services.v2.UpdateReplicationStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateReplicationStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetReplicationStatus
     * Status: ALPHA
     * Get the replication status of a project
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetReplicationStatusResponse getReplicationStatus(com.aruna.api.storage.services.v2.GetReplicationStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReplicationStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteReplication
     * Status: ALPHA
     * Delete the replication status of a project
     * </pre>
     */
    public com.aruna.api.storage.services.v2.DeleteReplicationResponse deleteReplication(com.aruna.api.storage.services.v2.DeleteReplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteReplicationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DataReplicationService.
   * <pre>
   * DataReplicationService
   * Endpoint specific methods for syncing data
   * </pre>
   */
  public static final class DataReplicationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DataReplicationServiceFutureStub> {
    private DataReplicationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataReplicationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataReplicationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ReplicateProjectData
     * Status: ALPHA
     * Replicates the (full) project data from one endpoint to another
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ReplicateProjectDataResponse> replicateProjectData(
        com.aruna.api.storage.services.v2.ReplicateProjectDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReplicateProjectDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PartialReplicateData
     * Status: ALPHA
     * Partial replicate data between endpoints
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.PartialReplicateDataResponse> partialReplicateData(
        com.aruna.api.storage.services.v2.PartialReplicateDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPartialReplicateDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateReplicationStatus
     * Status: ALPHA
     * Update the replication status of a project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.UpdateReplicationStatusResponse> updateReplicationStatus(
        com.aruna.api.storage.services.v2.UpdateReplicationStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateReplicationStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetReplicationStatus
     * Status: ALPHA
     * Get the replication status of a project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetReplicationStatusResponse> getReplicationStatus(
        com.aruna.api.storage.services.v2.GetReplicationStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReplicationStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteReplication
     * Status: ALPHA
     * Delete the replication status of a project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DeleteReplicationResponse> deleteReplication(
        com.aruna.api.storage.services.v2.DeleteReplicationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteReplicationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REPLICATE_PROJECT_DATA = 0;
  private static final int METHODID_PARTIAL_REPLICATE_DATA = 1;
  private static final int METHODID_UPDATE_REPLICATION_STATUS = 2;
  private static final int METHODID_GET_REPLICATION_STATUS = 3;
  private static final int METHODID_DELETE_REPLICATION = 4;

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
        case METHODID_REPLICATE_PROJECT_DATA:
          serviceImpl.replicateProjectData((com.aruna.api.storage.services.v2.ReplicateProjectDataRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ReplicateProjectDataResponse>) responseObserver);
          break;
        case METHODID_PARTIAL_REPLICATE_DATA:
          serviceImpl.partialReplicateData((com.aruna.api.storage.services.v2.PartialReplicateDataRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.PartialReplicateDataResponse>) responseObserver);
          break;
        case METHODID_UPDATE_REPLICATION_STATUS:
          serviceImpl.updateReplicationStatus((com.aruna.api.storage.services.v2.UpdateReplicationStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateReplicationStatusResponse>) responseObserver);
          break;
        case METHODID_GET_REPLICATION_STATUS:
          serviceImpl.getReplicationStatus((com.aruna.api.storage.services.v2.GetReplicationStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetReplicationStatusResponse>) responseObserver);
          break;
        case METHODID_DELETE_REPLICATION:
          serviceImpl.deleteReplication((com.aruna.api.storage.services.v2.DeleteReplicationRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteReplicationResponse>) responseObserver);
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
          getReplicateProjectDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ReplicateProjectDataRequest,
              com.aruna.api.storage.services.v2.ReplicateProjectDataResponse>(
                service, METHODID_REPLICATE_PROJECT_DATA)))
        .addMethod(
          getPartialReplicateDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.PartialReplicateDataRequest,
              com.aruna.api.storage.services.v2.PartialReplicateDataResponse>(
                service, METHODID_PARTIAL_REPLICATE_DATA)))
        .addMethod(
          getUpdateReplicationStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.UpdateReplicationStatusRequest,
              com.aruna.api.storage.services.v2.UpdateReplicationStatusResponse>(
                service, METHODID_UPDATE_REPLICATION_STATUS)))
        .addMethod(
          getGetReplicationStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetReplicationStatusRequest,
              com.aruna.api.storage.services.v2.GetReplicationStatusResponse>(
                service, METHODID_GET_REPLICATION_STATUS)))
        .addMethod(
          getDeleteReplicationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DeleteReplicationRequest,
              com.aruna.api.storage.services.v2.DeleteReplicationResponse>(
                service, METHODID_DELETE_REPLICATION)))
        .build();
  }

  private static abstract class DataReplicationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataReplicationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.storage.services.v2.DataReplicationServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataReplicationService");
    }
  }

  private static final class DataReplicationServiceFileDescriptorSupplier
      extends DataReplicationServiceBaseDescriptorSupplier {
    DataReplicationServiceFileDescriptorSupplier() {}
  }

  private static final class DataReplicationServiceMethodDescriptorSupplier
      extends DataReplicationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DataReplicationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DataReplicationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataReplicationServiceFileDescriptorSupplier())
              .addMethod(getReplicateProjectDataMethod())
              .addMethod(getPartialReplicateDataMethod())
              .addMethod(getUpdateReplicationStatusMethod())
              .addMethod(getGetReplicationStatusMethod())
              .addMethod(getDeleteReplicationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
