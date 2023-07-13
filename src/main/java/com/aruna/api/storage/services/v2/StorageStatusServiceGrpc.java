package com.aruna.api.storage.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * StorageStatusService
 * This is a generic service that contains utility functions 
 * these functions are used to query additional meta-information
 * about the status of the overall storage architecture
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/storage/services/v2/info_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StorageStatusServiceGrpc {

  private StorageStatusServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.storage.services.v2.StorageStatusService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageVersionRequest,
      com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageVersionResponse> getGetStorageVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStorageVersion",
      requestType = com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageVersionRequest.class,
      responseType = com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageVersionRequest,
      com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageVersionResponse> getGetStorageVersionMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageVersionRequest, com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageVersionResponse> getGetStorageVersionMethod;
    if ((getGetStorageVersionMethod = StorageStatusServiceGrpc.getGetStorageVersionMethod) == null) {
      synchronized (StorageStatusServiceGrpc.class) {
        if ((getGetStorageVersionMethod = StorageStatusServiceGrpc.getGetStorageVersionMethod) == null) {
          StorageStatusServiceGrpc.getGetStorageVersionMethod = getGetStorageVersionMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageVersionRequest, com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStorageVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageStatusServiceMethodDescriptorSupplier("GetStorageVersion"))
              .build();
        }
      }
    }
    return getGetStorageVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageStatusRequest,
      com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageStatusResponse> getGetStorageStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStorageStatus",
      requestType = com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageStatusRequest.class,
      responseType = com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageStatusRequest,
      com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageStatusResponse> getGetStorageStatusMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageStatusRequest, com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageStatusResponse> getGetStorageStatusMethod;
    if ((getGetStorageStatusMethod = StorageStatusServiceGrpc.getGetStorageStatusMethod) == null) {
      synchronized (StorageStatusServiceGrpc.class) {
        if ((getGetStorageStatusMethod = StorageStatusServiceGrpc.getGetStorageStatusMethod) == null) {
          StorageStatusServiceGrpc.getGetStorageStatusMethod = getGetStorageStatusMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageStatusRequest, com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStorageStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageStatusServiceMethodDescriptorSupplier("GetStorageStatus"))
              .build();
        }
      }
    }
    return getGetStorageStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StorageStatusServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageStatusServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageStatusServiceStub>() {
        @java.lang.Override
        public StorageStatusServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageStatusServiceStub(channel, callOptions);
        }
      };
    return StorageStatusServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StorageStatusServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageStatusServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageStatusServiceBlockingStub>() {
        @java.lang.Override
        public StorageStatusServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageStatusServiceBlockingStub(channel, callOptions);
        }
      };
    return StorageStatusServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StorageStatusServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageStatusServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageStatusServiceFutureStub>() {
        @java.lang.Override
        public StorageStatusServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageStatusServiceFutureStub(channel, callOptions);
        }
      };
    return StorageStatusServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * StorageStatusService
   * This is a generic service that contains utility functions 
   * these functions are used to query additional meta-information
   * about the status of the overall storage architecture
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * GetStorageVersion
     * Status: BETA
     * A request to get the current version of the server application
     * String representation and https://semver.org/
     * </pre>
     */
    default void getStorageVersion(com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageVersionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStorageVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetStorageStatus
     * Status: ALPHA
     * A request to get the current status of the storage components by location(s)
     * </pre>
     */
    default void getStorageStatus(com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageStatusRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStorageStatusMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StorageStatusService.
   * <pre>
   * StorageStatusService
   * This is a generic service that contains utility functions 
   * these functions are used to query additional meta-information
   * about the status of the overall storage architecture
   * </pre>
   */
  public static abstract class StorageStatusServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StorageStatusServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StorageStatusService.
   * <pre>
   * StorageStatusService
   * This is a generic service that contains utility functions 
   * these functions are used to query additional meta-information
   * about the status of the overall storage architecture
   * </pre>
   */
  public static final class StorageStatusServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StorageStatusServiceStub> {
    private StorageStatusServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageStatusServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageStatusServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetStorageVersion
     * Status: BETA
     * A request to get the current version of the server application
     * String representation and https://semver.org/
     * </pre>
     */
    public void getStorageVersion(com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageVersionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStorageVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetStorageStatus
     * Status: ALPHA
     * A request to get the current status of the storage components by location(s)
     * </pre>
     */
    public void getStorageStatus(com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageStatusRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStorageStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StorageStatusService.
   * <pre>
   * StorageStatusService
   * This is a generic service that contains utility functions 
   * these functions are used to query additional meta-information
   * about the status of the overall storage architecture
   * </pre>
   */
  public static final class StorageStatusServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StorageStatusServiceBlockingStub> {
    private StorageStatusServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageStatusServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageStatusServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetStorageVersion
     * Status: BETA
     * A request to get the current version of the server application
     * String representation and https://semver.org/
     * </pre>
     */
    public com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageVersionResponse getStorageVersion(com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStorageVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetStorageStatus
     * Status: ALPHA
     * A request to get the current status of the storage components by location(s)
     * </pre>
     */
    public com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageStatusResponse getStorageStatus(com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStorageStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StorageStatusService.
   * <pre>
   * StorageStatusService
   * This is a generic service that contains utility functions 
   * these functions are used to query additional meta-information
   * about the status of the overall storage architecture
   * </pre>
   */
  public static final class StorageStatusServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StorageStatusServiceFutureStub> {
    private StorageStatusServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageStatusServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageStatusServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetStorageVersion
     * Status: BETA
     * A request to get the current version of the server application
     * String representation and https://semver.org/
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageVersionResponse> getStorageVersion(
        com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStorageVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetStorageStatus
     * Status: ALPHA
     * A request to get the current status of the storage components by location(s)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageStatusResponse> getStorageStatus(
        com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStorageStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STORAGE_VERSION = 0;
  private static final int METHODID_GET_STORAGE_STATUS = 1;

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
        case METHODID_GET_STORAGE_VERSION:
          serviceImpl.getStorageVersion((com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageVersionResponse>) responseObserver);
          break;
        case METHODID_GET_STORAGE_STATUS:
          serviceImpl.getStorageStatus((com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageStatusResponse>) responseObserver);
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
          getGetStorageVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageVersionRequest,
              com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageVersionResponse>(
                service, METHODID_GET_STORAGE_VERSION)))
        .addMethod(
          getGetStorageStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageStatusRequest,
              com.aruna.api.storage.services.v2.InfoServiceProto.GetStorageStatusResponse>(
                service, METHODID_GET_STORAGE_STATUS)))
        .build();
  }

  private static abstract class StorageStatusServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StorageStatusServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.storage.services.v2.InfoServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StorageStatusService");
    }
  }

  private static final class StorageStatusServiceFileDescriptorSupplier
      extends StorageStatusServiceBaseDescriptorSupplier {
    StorageStatusServiceFileDescriptorSupplier() {}
  }

  private static final class StorageStatusServiceMethodDescriptorSupplier
      extends StorageStatusServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StorageStatusServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StorageStatusServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StorageStatusServiceFileDescriptorSupplier())
              .addMethod(getGetStorageVersionMethod())
              .addMethod(getGetStorageStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
