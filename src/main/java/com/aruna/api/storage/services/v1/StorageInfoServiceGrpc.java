package com.aruna.api.storage.services.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * StorageInfoService
 * This is a generic service that contains utility functions 
 * these functions are used to query additional meta-information
 * about the status of the overall storage architecture
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/storage/services/v1/info_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StorageInfoServiceGrpc {

  private StorageInfoServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.storage.services.v1.StorageInfoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageVersionRequest,
      com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageVersionResponse> getGetStorageVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStorageVersion",
      requestType = com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageVersionRequest.class,
      responseType = com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageVersionRequest,
      com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageVersionResponse> getGetStorageVersionMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageVersionRequest, com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageVersionResponse> getGetStorageVersionMethod;
    if ((getGetStorageVersionMethod = StorageInfoServiceGrpc.getGetStorageVersionMethod) == null) {
      synchronized (StorageInfoServiceGrpc.class) {
        if ((getGetStorageVersionMethod = StorageInfoServiceGrpc.getGetStorageVersionMethod) == null) {
          StorageInfoServiceGrpc.getGetStorageVersionMethod = getGetStorageVersionMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageVersionRequest, com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStorageVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageInfoServiceMethodDescriptorSupplier("GetStorageVersion"))
              .build();
        }
      }
    }
    return getGetStorageVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageStatusRequest,
      com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageStatusResponse> getGetStorageStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStorageStatus",
      requestType = com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageStatusRequest.class,
      responseType = com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageStatusRequest,
      com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageStatusResponse> getGetStorageStatusMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageStatusRequest, com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageStatusResponse> getGetStorageStatusMethod;
    if ((getGetStorageStatusMethod = StorageInfoServiceGrpc.getGetStorageStatusMethod) == null) {
      synchronized (StorageInfoServiceGrpc.class) {
        if ((getGetStorageStatusMethod = StorageInfoServiceGrpc.getGetStorageStatusMethod) == null) {
          StorageInfoServiceGrpc.getGetStorageStatusMethod = getGetStorageStatusMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageStatusRequest, com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStorageStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageInfoServiceMethodDescriptorSupplier("GetStorageStatus"))
              .build();
        }
      }
    }
    return getGetStorageStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StorageInfoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageInfoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageInfoServiceStub>() {
        @java.lang.Override
        public StorageInfoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageInfoServiceStub(channel, callOptions);
        }
      };
    return StorageInfoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StorageInfoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageInfoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageInfoServiceBlockingStub>() {
        @java.lang.Override
        public StorageInfoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageInfoServiceBlockingStub(channel, callOptions);
        }
      };
    return StorageInfoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StorageInfoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageInfoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageInfoServiceFutureStub>() {
        @java.lang.Override
        public StorageInfoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageInfoServiceFutureStub(channel, callOptions);
        }
      };
    return StorageInfoServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * StorageInfoService
   * This is a generic service that contains utility functions 
   * these functions are used to query additional meta-information
   * about the status of the overall storage architecture
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * GetStorageVersion
     * Status: ALPHA
     * A request to get the current version of the server application
     * String representation and https://semver.org/
     * </pre>
     */
    default void getStorageVersion(com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageVersionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStorageVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetStorageStatus
     * Status: ALPHA
     * A request to get the current status of the storage components by location(s)
     * </pre>
     */
    default void getStorageStatus(com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageStatusRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStorageStatusMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StorageInfoService.
   * <pre>
   * StorageInfoService
   * This is a generic service that contains utility functions 
   * these functions are used to query additional meta-information
   * about the status of the overall storage architecture
   * </pre>
   */
  public static abstract class StorageInfoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StorageInfoServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StorageInfoService.
   * <pre>
   * StorageInfoService
   * This is a generic service that contains utility functions 
   * these functions are used to query additional meta-information
   * about the status of the overall storage architecture
   * </pre>
   */
  public static final class StorageInfoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StorageInfoServiceStub> {
    private StorageInfoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageInfoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageInfoServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetStorageVersion
     * Status: ALPHA
     * A request to get the current version of the server application
     * String representation and https://semver.org/
     * </pre>
     */
    public void getStorageVersion(com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageVersionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageVersionResponse> responseObserver) {
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
    public void getStorageStatus(com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageStatusRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStorageStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StorageInfoService.
   * <pre>
   * StorageInfoService
   * This is a generic service that contains utility functions 
   * these functions are used to query additional meta-information
   * about the status of the overall storage architecture
   * </pre>
   */
  public static final class StorageInfoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StorageInfoServiceBlockingStub> {
    private StorageInfoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageInfoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageInfoServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetStorageVersion
     * Status: ALPHA
     * A request to get the current version of the server application
     * String representation and https://semver.org/
     * </pre>
     */
    public com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageVersionResponse getStorageVersion(com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageVersionRequest request) {
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
    public com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageStatusResponse getStorageStatus(com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStorageStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StorageInfoService.
   * <pre>
   * StorageInfoService
   * This is a generic service that contains utility functions 
   * these functions are used to query additional meta-information
   * about the status of the overall storage architecture
   * </pre>
   */
  public static final class StorageInfoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StorageInfoServiceFutureStub> {
    private StorageInfoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageInfoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageInfoServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetStorageVersion
     * Status: ALPHA
     * A request to get the current version of the server application
     * String representation and https://semver.org/
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageVersionResponse> getStorageVersion(
        com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageVersionRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageStatusResponse> getStorageStatus(
        com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageStatusRequest request) {
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
          serviceImpl.getStorageVersion((com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageVersionResponse>) responseObserver);
          break;
        case METHODID_GET_STORAGE_STATUS:
          serviceImpl.getStorageStatus((com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageStatusResponse>) responseObserver);
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
              com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageVersionRequest,
              com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageVersionResponse>(
                service, METHODID_GET_STORAGE_VERSION)))
        .addMethod(
          getGetStorageStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageStatusRequest,
              com.aruna.api.storage.services.v1.InfoServiceProto.GetStorageStatusResponse>(
                service, METHODID_GET_STORAGE_STATUS)))
        .build();
  }

  private static abstract class StorageInfoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StorageInfoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.storage.services.v1.InfoServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StorageInfoService");
    }
  }

  private static final class StorageInfoServiceFileDescriptorSupplier
      extends StorageInfoServiceBaseDescriptorSupplier {
    StorageInfoServiceFileDescriptorSupplier() {}
  }

  private static final class StorageInfoServiceMethodDescriptorSupplier
      extends StorageInfoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StorageInfoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StorageInfoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StorageInfoServiceFileDescriptorSupplier())
              .addMethod(getGetStorageVersionMethod())
              .addMethod(getGetStorageStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
