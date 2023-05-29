package com.aruna.api.internal.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/internal/v1/proxy.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InternalProxyServiceGrpc {

  private InternalProxyServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.internal.v1.InternalProxyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.internal.v1.ProxyProto.InitMultipartUploadRequest,
      com.aruna.api.internal.v1.ProxyProto.InitMultipartUploadResponse> getInitMultipartUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitMultipartUpload",
      requestType = com.aruna.api.internal.v1.ProxyProto.InitMultipartUploadRequest.class,
      responseType = com.aruna.api.internal.v1.ProxyProto.InitMultipartUploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.internal.v1.ProxyProto.InitMultipartUploadRequest,
      com.aruna.api.internal.v1.ProxyProto.InitMultipartUploadResponse> getInitMultipartUploadMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.internal.v1.ProxyProto.InitMultipartUploadRequest, com.aruna.api.internal.v1.ProxyProto.InitMultipartUploadResponse> getInitMultipartUploadMethod;
    if ((getInitMultipartUploadMethod = InternalProxyServiceGrpc.getInitMultipartUploadMethod) == null) {
      synchronized (InternalProxyServiceGrpc.class) {
        if ((getInitMultipartUploadMethod = InternalProxyServiceGrpc.getInitMultipartUploadMethod) == null) {
          InternalProxyServiceGrpc.getInitMultipartUploadMethod = getInitMultipartUploadMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.internal.v1.ProxyProto.InitMultipartUploadRequest, com.aruna.api.internal.v1.ProxyProto.InitMultipartUploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitMultipartUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.ProxyProto.InitMultipartUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.ProxyProto.InitMultipartUploadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InternalProxyServiceMethodDescriptorSupplier("InitMultipartUpload"))
              .build();
        }
      }
    }
    return getInitMultipartUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.internal.v1.ProxyProto.FinishMultipartUploadRequest,
      com.aruna.api.internal.v1.ProxyProto.FinishMultipartUploadResponse> getFinishMultipartUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FinishMultipartUpload",
      requestType = com.aruna.api.internal.v1.ProxyProto.FinishMultipartUploadRequest.class,
      responseType = com.aruna.api.internal.v1.ProxyProto.FinishMultipartUploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.internal.v1.ProxyProto.FinishMultipartUploadRequest,
      com.aruna.api.internal.v1.ProxyProto.FinishMultipartUploadResponse> getFinishMultipartUploadMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.internal.v1.ProxyProto.FinishMultipartUploadRequest, com.aruna.api.internal.v1.ProxyProto.FinishMultipartUploadResponse> getFinishMultipartUploadMethod;
    if ((getFinishMultipartUploadMethod = InternalProxyServiceGrpc.getFinishMultipartUploadMethod) == null) {
      synchronized (InternalProxyServiceGrpc.class) {
        if ((getFinishMultipartUploadMethod = InternalProxyServiceGrpc.getFinishMultipartUploadMethod) == null) {
          InternalProxyServiceGrpc.getFinishMultipartUploadMethod = getFinishMultipartUploadMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.internal.v1.ProxyProto.FinishMultipartUploadRequest, com.aruna.api.internal.v1.ProxyProto.FinishMultipartUploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FinishMultipartUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.ProxyProto.FinishMultipartUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.ProxyProto.FinishMultipartUploadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InternalProxyServiceMethodDescriptorSupplier("FinishMultipartUpload"))
              .build();
        }
      }
    }
    return getFinishMultipartUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.internal.v1.ProxyProto.DeleteObjectRequest,
      com.aruna.api.internal.v1.ProxyProto.DeleteObjectResponse> getDeleteObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteObject",
      requestType = com.aruna.api.internal.v1.ProxyProto.DeleteObjectRequest.class,
      responseType = com.aruna.api.internal.v1.ProxyProto.DeleteObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.internal.v1.ProxyProto.DeleteObjectRequest,
      com.aruna.api.internal.v1.ProxyProto.DeleteObjectResponse> getDeleteObjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.internal.v1.ProxyProto.DeleteObjectRequest, com.aruna.api.internal.v1.ProxyProto.DeleteObjectResponse> getDeleteObjectMethod;
    if ((getDeleteObjectMethod = InternalProxyServiceGrpc.getDeleteObjectMethod) == null) {
      synchronized (InternalProxyServiceGrpc.class) {
        if ((getDeleteObjectMethod = InternalProxyServiceGrpc.getDeleteObjectMethod) == null) {
          InternalProxyServiceGrpc.getDeleteObjectMethod = getDeleteObjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.internal.v1.ProxyProto.DeleteObjectRequest, com.aruna.api.internal.v1.ProxyProto.DeleteObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.ProxyProto.DeleteObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.ProxyProto.DeleteObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InternalProxyServiceMethodDescriptorSupplier("DeleteObject"))
              .build();
        }
      }
    }
    return getDeleteObjectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InternalProxyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InternalProxyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InternalProxyServiceStub>() {
        @java.lang.Override
        public InternalProxyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InternalProxyServiceStub(channel, callOptions);
        }
      };
    return InternalProxyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InternalProxyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InternalProxyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InternalProxyServiceBlockingStub>() {
        @java.lang.Override
        public InternalProxyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InternalProxyServiceBlockingStub(channel, callOptions);
        }
      };
    return InternalProxyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InternalProxyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InternalProxyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InternalProxyServiceFutureStub>() {
        @java.lang.Override
        public InternalProxyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InternalProxyServiceFutureStub(channel, callOptions);
        }
      };
    return InternalProxyServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void initMultipartUpload(com.aruna.api.internal.v1.ProxyProto.InitMultipartUploadRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.ProxyProto.InitMultipartUploadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitMultipartUploadMethod(), responseObserver);
    }

    /**
     */
    default void finishMultipartUpload(com.aruna.api.internal.v1.ProxyProto.FinishMultipartUploadRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.ProxyProto.FinishMultipartUploadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFinishMultipartUploadMethod(), responseObserver);
    }

    /**
     */
    default void deleteObject(com.aruna.api.internal.v1.ProxyProto.DeleteObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.ProxyProto.DeleteObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteObjectMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InternalProxyService.
   */
  public static abstract class InternalProxyServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InternalProxyServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InternalProxyService.
   */
  public static final class InternalProxyServiceStub
      extends io.grpc.stub.AbstractAsyncStub<InternalProxyServiceStub> {
    private InternalProxyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalProxyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InternalProxyServiceStub(channel, callOptions);
    }

    /**
     */
    public void initMultipartUpload(com.aruna.api.internal.v1.ProxyProto.InitMultipartUploadRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.ProxyProto.InitMultipartUploadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitMultipartUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void finishMultipartUpload(com.aruna.api.internal.v1.ProxyProto.FinishMultipartUploadRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.ProxyProto.FinishMultipartUploadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFinishMultipartUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteObject(com.aruna.api.internal.v1.ProxyProto.DeleteObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.ProxyProto.DeleteObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteObjectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InternalProxyService.
   */
  public static final class InternalProxyServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InternalProxyServiceBlockingStub> {
    private InternalProxyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalProxyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InternalProxyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.aruna.api.internal.v1.ProxyProto.InitMultipartUploadResponse initMultipartUpload(com.aruna.api.internal.v1.ProxyProto.InitMultipartUploadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitMultipartUploadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.internal.v1.ProxyProto.FinishMultipartUploadResponse finishMultipartUpload(com.aruna.api.internal.v1.ProxyProto.FinishMultipartUploadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFinishMultipartUploadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.internal.v1.ProxyProto.DeleteObjectResponse deleteObject(com.aruna.api.internal.v1.ProxyProto.DeleteObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteObjectMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InternalProxyService.
   */
  public static final class InternalProxyServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<InternalProxyServiceFutureStub> {
    private InternalProxyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalProxyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InternalProxyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.internal.v1.ProxyProto.InitMultipartUploadResponse> initMultipartUpload(
        com.aruna.api.internal.v1.ProxyProto.InitMultipartUploadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitMultipartUploadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.internal.v1.ProxyProto.FinishMultipartUploadResponse> finishMultipartUpload(
        com.aruna.api.internal.v1.ProxyProto.FinishMultipartUploadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFinishMultipartUploadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.internal.v1.ProxyProto.DeleteObjectResponse> deleteObject(
        com.aruna.api.internal.v1.ProxyProto.DeleteObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteObjectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INIT_MULTIPART_UPLOAD = 0;
  private static final int METHODID_FINISH_MULTIPART_UPLOAD = 1;
  private static final int METHODID_DELETE_OBJECT = 2;

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
        case METHODID_INIT_MULTIPART_UPLOAD:
          serviceImpl.initMultipartUpload((com.aruna.api.internal.v1.ProxyProto.InitMultipartUploadRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.ProxyProto.InitMultipartUploadResponse>) responseObserver);
          break;
        case METHODID_FINISH_MULTIPART_UPLOAD:
          serviceImpl.finishMultipartUpload((com.aruna.api.internal.v1.ProxyProto.FinishMultipartUploadRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.ProxyProto.FinishMultipartUploadResponse>) responseObserver);
          break;
        case METHODID_DELETE_OBJECT:
          serviceImpl.deleteObject((com.aruna.api.internal.v1.ProxyProto.DeleteObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.ProxyProto.DeleteObjectResponse>) responseObserver);
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
          getInitMultipartUploadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.internal.v1.ProxyProto.InitMultipartUploadRequest,
              com.aruna.api.internal.v1.ProxyProto.InitMultipartUploadResponse>(
                service, METHODID_INIT_MULTIPART_UPLOAD)))
        .addMethod(
          getFinishMultipartUploadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.internal.v1.ProxyProto.FinishMultipartUploadRequest,
              com.aruna.api.internal.v1.ProxyProto.FinishMultipartUploadResponse>(
                service, METHODID_FINISH_MULTIPART_UPLOAD)))
        .addMethod(
          getDeleteObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.internal.v1.ProxyProto.DeleteObjectRequest,
              com.aruna.api.internal.v1.ProxyProto.DeleteObjectResponse>(
                service, METHODID_DELETE_OBJECT)))
        .build();
  }

  private static abstract class InternalProxyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InternalProxyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.internal.v1.ProxyProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InternalProxyService");
    }
  }

  private static final class InternalProxyServiceFileDescriptorSupplier
      extends InternalProxyServiceBaseDescriptorSupplier {
    InternalProxyServiceFileDescriptorSupplier() {}
  }

  private static final class InternalProxyServiceMethodDescriptorSupplier
      extends InternalProxyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InternalProxyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InternalProxyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InternalProxyServiceFileDescriptorSupplier())
              .addMethod(getInitMultipartUploadMethod())
              .addMethod(getFinishMultipartUploadMethod())
              .addMethod(getDeleteObjectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
