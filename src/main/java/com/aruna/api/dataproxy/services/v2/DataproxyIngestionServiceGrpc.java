package com.aruna.api.dataproxy.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: aruna/api/dataproxy/services/v2/dataproxy_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataproxyIngestionServiceGrpc {

  private DataproxyIngestionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "aruna.api.dataproxy.services.v2.DataproxyIngestionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.IngestExistingObjectRequest,
      com.aruna.api.dataproxy.services.v2.IngestExistingObjectResponse> getIngestExistingObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IngestExistingObject",
      requestType = com.aruna.api.dataproxy.services.v2.IngestExistingObjectRequest.class,
      responseType = com.aruna.api.dataproxy.services.v2.IngestExistingObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.IngestExistingObjectRequest,
      com.aruna.api.dataproxy.services.v2.IngestExistingObjectResponse> getIngestExistingObjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.IngestExistingObjectRequest, com.aruna.api.dataproxy.services.v2.IngestExistingObjectResponse> getIngestExistingObjectMethod;
    if ((getIngestExistingObjectMethod = DataproxyIngestionServiceGrpc.getIngestExistingObjectMethod) == null) {
      synchronized (DataproxyIngestionServiceGrpc.class) {
        if ((getIngestExistingObjectMethod = DataproxyIngestionServiceGrpc.getIngestExistingObjectMethod) == null) {
          DataproxyIngestionServiceGrpc.getIngestExistingObjectMethod = getIngestExistingObjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.dataproxy.services.v2.IngestExistingObjectRequest, com.aruna.api.dataproxy.services.v2.IngestExistingObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IngestExistingObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.IngestExistingObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.IngestExistingObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataproxyIngestionServiceMethodDescriptorSupplier("IngestExistingObject"))
              .build();
        }
      }
    }
    return getIngestExistingObjectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataproxyIngestionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataproxyIngestionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataproxyIngestionServiceStub>() {
        @java.lang.Override
        public DataproxyIngestionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataproxyIngestionServiceStub(channel, callOptions);
        }
      };
    return DataproxyIngestionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataproxyIngestionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataproxyIngestionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataproxyIngestionServiceBlockingStub>() {
        @java.lang.Override
        public DataproxyIngestionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataproxyIngestionServiceBlockingStub(channel, callOptions);
        }
      };
    return DataproxyIngestionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataproxyIngestionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataproxyIngestionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataproxyIngestionServiceFutureStub>() {
        @java.lang.Override
        public DataproxyIngestionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataproxyIngestionServiceFutureStub(channel, callOptions);
        }
      };
    return DataproxyIngestionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * IngestExistingObject
     * Status: ALPHA
     * Ingest an existing object into backend
     * </pre>
     */
    default void ingestExistingObject(com.aruna.api.dataproxy.services.v2.IngestExistingObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.IngestExistingObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIngestExistingObjectMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DataproxyIngestionService.
   */
  public static abstract class DataproxyIngestionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DataproxyIngestionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DataproxyIngestionService.
   */
  public static final class DataproxyIngestionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DataproxyIngestionServiceStub> {
    private DataproxyIngestionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataproxyIngestionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataproxyIngestionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * IngestExistingObject
     * Status: ALPHA
     * Ingest an existing object into backend
     * </pre>
     */
    public void ingestExistingObject(com.aruna.api.dataproxy.services.v2.IngestExistingObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.IngestExistingObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIngestExistingObjectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DataproxyIngestionService.
   */
  public static final class DataproxyIngestionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DataproxyIngestionServiceBlockingStub> {
    private DataproxyIngestionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataproxyIngestionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataproxyIngestionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * IngestExistingObject
     * Status: ALPHA
     * Ingest an existing object into backend
     * </pre>
     */
    public com.aruna.api.dataproxy.services.v2.IngestExistingObjectResponse ingestExistingObject(com.aruna.api.dataproxy.services.v2.IngestExistingObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIngestExistingObjectMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DataproxyIngestionService.
   */
  public static final class DataproxyIngestionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DataproxyIngestionServiceFutureStub> {
    private DataproxyIngestionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataproxyIngestionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataproxyIngestionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * IngestExistingObject
     * Status: ALPHA
     * Ingest an existing object into backend
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.dataproxy.services.v2.IngestExistingObjectResponse> ingestExistingObject(
        com.aruna.api.dataproxy.services.v2.IngestExistingObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIngestExistingObjectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INGEST_EXISTING_OBJECT = 0;

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
        case METHODID_INGEST_EXISTING_OBJECT:
          serviceImpl.ingestExistingObject((com.aruna.api.dataproxy.services.v2.IngestExistingObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.IngestExistingObjectResponse>) responseObserver);
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
          getIngestExistingObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.dataproxy.services.v2.IngestExistingObjectRequest,
              com.aruna.api.dataproxy.services.v2.IngestExistingObjectResponse>(
                service, METHODID_INGEST_EXISTING_OBJECT)))
        .build();
  }

  private static abstract class DataproxyIngestionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataproxyIngestionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataproxyIngestionService");
    }
  }

  private static final class DataproxyIngestionServiceFileDescriptorSupplier
      extends DataproxyIngestionServiceBaseDescriptorSupplier {
    DataproxyIngestionServiceFileDescriptorSupplier() {}
  }

  private static final class DataproxyIngestionServiceMethodDescriptorSupplier
      extends DataproxyIngestionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DataproxyIngestionServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DataproxyIngestionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataproxyIngestionServiceFileDescriptorSupplier())
              .addMethod(getIngestExistingObjectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
