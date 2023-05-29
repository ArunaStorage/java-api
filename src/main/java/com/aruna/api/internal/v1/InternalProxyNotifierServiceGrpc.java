package com.aruna.api.internal.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * This service enables a "return" channel for dataproxy to aruna server communication
 * Mainly used to notify the backend of validation / move events after the upload of new files
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/internal/v1/proxy.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InternalProxyNotifierServiceGrpc {

  private InternalProxyNotifierServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.internal.v1.InternalProxyNotifierService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.internal.v1.ProxyProto.GetOrCreateObjectByPathRequest,
      com.aruna.api.internal.v1.ProxyProto.GetOrCreateObjectByPathResponse> getGetOrCreateObjectByPathMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrCreateObjectByPath",
      requestType = com.aruna.api.internal.v1.ProxyProto.GetOrCreateObjectByPathRequest.class,
      responseType = com.aruna.api.internal.v1.ProxyProto.GetOrCreateObjectByPathResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.internal.v1.ProxyProto.GetOrCreateObjectByPathRequest,
      com.aruna.api.internal.v1.ProxyProto.GetOrCreateObjectByPathResponse> getGetOrCreateObjectByPathMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.internal.v1.ProxyProto.GetOrCreateObjectByPathRequest, com.aruna.api.internal.v1.ProxyProto.GetOrCreateObjectByPathResponse> getGetOrCreateObjectByPathMethod;
    if ((getGetOrCreateObjectByPathMethod = InternalProxyNotifierServiceGrpc.getGetOrCreateObjectByPathMethod) == null) {
      synchronized (InternalProxyNotifierServiceGrpc.class) {
        if ((getGetOrCreateObjectByPathMethod = InternalProxyNotifierServiceGrpc.getGetOrCreateObjectByPathMethod) == null) {
          InternalProxyNotifierServiceGrpc.getGetOrCreateObjectByPathMethod = getGetOrCreateObjectByPathMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.internal.v1.ProxyProto.GetOrCreateObjectByPathRequest, com.aruna.api.internal.v1.ProxyProto.GetOrCreateObjectByPathResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrCreateObjectByPath"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.ProxyProto.GetOrCreateObjectByPathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.ProxyProto.GetOrCreateObjectByPathResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InternalProxyNotifierServiceMethodDescriptorSupplier("GetOrCreateObjectByPath"))
              .build();
        }
      }
    }
    return getGetOrCreateObjectByPathMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.internal.v1.ProxyProto.FinalizeObjectRequest,
      com.aruna.api.internal.v1.ProxyProto.FinalizeObjectResponse> getFinalizeObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FinalizeObject",
      requestType = com.aruna.api.internal.v1.ProxyProto.FinalizeObjectRequest.class,
      responseType = com.aruna.api.internal.v1.ProxyProto.FinalizeObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.internal.v1.ProxyProto.FinalizeObjectRequest,
      com.aruna.api.internal.v1.ProxyProto.FinalizeObjectResponse> getFinalizeObjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.internal.v1.ProxyProto.FinalizeObjectRequest, com.aruna.api.internal.v1.ProxyProto.FinalizeObjectResponse> getFinalizeObjectMethod;
    if ((getFinalizeObjectMethod = InternalProxyNotifierServiceGrpc.getFinalizeObjectMethod) == null) {
      synchronized (InternalProxyNotifierServiceGrpc.class) {
        if ((getFinalizeObjectMethod = InternalProxyNotifierServiceGrpc.getFinalizeObjectMethod) == null) {
          InternalProxyNotifierServiceGrpc.getFinalizeObjectMethod = getFinalizeObjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.internal.v1.ProxyProto.FinalizeObjectRequest, com.aruna.api.internal.v1.ProxyProto.FinalizeObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FinalizeObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.ProxyProto.FinalizeObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.ProxyProto.FinalizeObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InternalProxyNotifierServiceMethodDescriptorSupplier("FinalizeObject"))
              .build();
        }
      }
    }
    return getFinalizeObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.internal.v1.ProxyProto.GetOrCreateEncryptionKeyRequest,
      com.aruna.api.internal.v1.ProxyProto.GetOrCreateEncryptionKeyResponse> getGetOrCreateEncryptionKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrCreateEncryptionKey",
      requestType = com.aruna.api.internal.v1.ProxyProto.GetOrCreateEncryptionKeyRequest.class,
      responseType = com.aruna.api.internal.v1.ProxyProto.GetOrCreateEncryptionKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.internal.v1.ProxyProto.GetOrCreateEncryptionKeyRequest,
      com.aruna.api.internal.v1.ProxyProto.GetOrCreateEncryptionKeyResponse> getGetOrCreateEncryptionKeyMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.internal.v1.ProxyProto.GetOrCreateEncryptionKeyRequest, com.aruna.api.internal.v1.ProxyProto.GetOrCreateEncryptionKeyResponse> getGetOrCreateEncryptionKeyMethod;
    if ((getGetOrCreateEncryptionKeyMethod = InternalProxyNotifierServiceGrpc.getGetOrCreateEncryptionKeyMethod) == null) {
      synchronized (InternalProxyNotifierServiceGrpc.class) {
        if ((getGetOrCreateEncryptionKeyMethod = InternalProxyNotifierServiceGrpc.getGetOrCreateEncryptionKeyMethod) == null) {
          InternalProxyNotifierServiceGrpc.getGetOrCreateEncryptionKeyMethod = getGetOrCreateEncryptionKeyMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.internal.v1.ProxyProto.GetOrCreateEncryptionKeyRequest, com.aruna.api.internal.v1.ProxyProto.GetOrCreateEncryptionKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrCreateEncryptionKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.ProxyProto.GetOrCreateEncryptionKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.ProxyProto.GetOrCreateEncryptionKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InternalProxyNotifierServiceMethodDescriptorSupplier("GetOrCreateEncryptionKey"))
              .build();
        }
      }
    }
    return getGetOrCreateEncryptionKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.internal.v1.ProxyProto.GetObjectLocationRequest,
      com.aruna.api.internal.v1.ProxyProto.GetObjectLocationResponse> getGetObjectLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectLocation",
      requestType = com.aruna.api.internal.v1.ProxyProto.GetObjectLocationRequest.class,
      responseType = com.aruna.api.internal.v1.ProxyProto.GetObjectLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.internal.v1.ProxyProto.GetObjectLocationRequest,
      com.aruna.api.internal.v1.ProxyProto.GetObjectLocationResponse> getGetObjectLocationMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.internal.v1.ProxyProto.GetObjectLocationRequest, com.aruna.api.internal.v1.ProxyProto.GetObjectLocationResponse> getGetObjectLocationMethod;
    if ((getGetObjectLocationMethod = InternalProxyNotifierServiceGrpc.getGetObjectLocationMethod) == null) {
      synchronized (InternalProxyNotifierServiceGrpc.class) {
        if ((getGetObjectLocationMethod = InternalProxyNotifierServiceGrpc.getGetObjectLocationMethod) == null) {
          InternalProxyNotifierServiceGrpc.getGetObjectLocationMethod = getGetObjectLocationMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.internal.v1.ProxyProto.GetObjectLocationRequest, com.aruna.api.internal.v1.ProxyProto.GetObjectLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjectLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.ProxyProto.GetObjectLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.ProxyProto.GetObjectLocationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InternalProxyNotifierServiceMethodDescriptorSupplier("GetObjectLocation"))
              .build();
        }
      }
    }
    return getGetObjectLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.internal.v1.ProxyProto.GetCollectionByBucketRequest,
      com.aruna.api.internal.v1.ProxyProto.GetCollectionByBucketResponse> getGetCollectionByBucketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCollectionByBucket",
      requestType = com.aruna.api.internal.v1.ProxyProto.GetCollectionByBucketRequest.class,
      responseType = com.aruna.api.internal.v1.ProxyProto.GetCollectionByBucketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.internal.v1.ProxyProto.GetCollectionByBucketRequest,
      com.aruna.api.internal.v1.ProxyProto.GetCollectionByBucketResponse> getGetCollectionByBucketMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.internal.v1.ProxyProto.GetCollectionByBucketRequest, com.aruna.api.internal.v1.ProxyProto.GetCollectionByBucketResponse> getGetCollectionByBucketMethod;
    if ((getGetCollectionByBucketMethod = InternalProxyNotifierServiceGrpc.getGetCollectionByBucketMethod) == null) {
      synchronized (InternalProxyNotifierServiceGrpc.class) {
        if ((getGetCollectionByBucketMethod = InternalProxyNotifierServiceGrpc.getGetCollectionByBucketMethod) == null) {
          InternalProxyNotifierServiceGrpc.getGetCollectionByBucketMethod = getGetCollectionByBucketMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.internal.v1.ProxyProto.GetCollectionByBucketRequest, com.aruna.api.internal.v1.ProxyProto.GetCollectionByBucketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCollectionByBucket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.ProxyProto.GetCollectionByBucketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.internal.v1.ProxyProto.GetCollectionByBucketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InternalProxyNotifierServiceMethodDescriptorSupplier("GetCollectionByBucket"))
              .build();
        }
      }
    }
    return getGetCollectionByBucketMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InternalProxyNotifierServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InternalProxyNotifierServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InternalProxyNotifierServiceStub>() {
        @java.lang.Override
        public InternalProxyNotifierServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InternalProxyNotifierServiceStub(channel, callOptions);
        }
      };
    return InternalProxyNotifierServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InternalProxyNotifierServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InternalProxyNotifierServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InternalProxyNotifierServiceBlockingStub>() {
        @java.lang.Override
        public InternalProxyNotifierServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InternalProxyNotifierServiceBlockingStub(channel, callOptions);
        }
      };
    return InternalProxyNotifierServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InternalProxyNotifierServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InternalProxyNotifierServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InternalProxyNotifierServiceFutureStub>() {
        @java.lang.Override
        public InternalProxyNotifierServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InternalProxyNotifierServiceFutureStub(channel, callOptions);
        }
      };
    return InternalProxyNotifierServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * This service enables a "return" channel for dataproxy to aruna server communication
   * Mainly used to notify the backend of validation / move events after the upload of new files
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void getOrCreateObjectByPath(com.aruna.api.internal.v1.ProxyProto.GetOrCreateObjectByPathRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.ProxyProto.GetOrCreateObjectByPathResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrCreateObjectByPathMethod(), responseObserver);
    }

    /**
     */
    default void finalizeObject(com.aruna.api.internal.v1.ProxyProto.FinalizeObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.ProxyProto.FinalizeObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFinalizeObjectMethod(), responseObserver);
    }

    /**
     */
    default void getOrCreateEncryptionKey(com.aruna.api.internal.v1.ProxyProto.GetOrCreateEncryptionKeyRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.ProxyProto.GetOrCreateEncryptionKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrCreateEncryptionKeyMethod(), responseObserver);
    }

    /**
     */
    default void getObjectLocation(com.aruna.api.internal.v1.ProxyProto.GetObjectLocationRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.ProxyProto.GetObjectLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectLocationMethod(), responseObserver);
    }

    /**
     */
    default void getCollectionByBucket(com.aruna.api.internal.v1.ProxyProto.GetCollectionByBucketRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.ProxyProto.GetCollectionByBucketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCollectionByBucketMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InternalProxyNotifierService.
   * <pre>
   * This service enables a "return" channel for dataproxy to aruna server communication
   * Mainly used to notify the backend of validation / move events after the upload of new files
   * </pre>
   */
  public static abstract class InternalProxyNotifierServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InternalProxyNotifierServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InternalProxyNotifierService.
   * <pre>
   * This service enables a "return" channel for dataproxy to aruna server communication
   * Mainly used to notify the backend of validation / move events after the upload of new files
   * </pre>
   */
  public static final class InternalProxyNotifierServiceStub
      extends io.grpc.stub.AbstractAsyncStub<InternalProxyNotifierServiceStub> {
    private InternalProxyNotifierServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalProxyNotifierServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InternalProxyNotifierServiceStub(channel, callOptions);
    }

    /**
     */
    public void getOrCreateObjectByPath(com.aruna.api.internal.v1.ProxyProto.GetOrCreateObjectByPathRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.ProxyProto.GetOrCreateObjectByPathResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrCreateObjectByPathMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void finalizeObject(com.aruna.api.internal.v1.ProxyProto.FinalizeObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.ProxyProto.FinalizeObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFinalizeObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrCreateEncryptionKey(com.aruna.api.internal.v1.ProxyProto.GetOrCreateEncryptionKeyRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.ProxyProto.GetOrCreateEncryptionKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrCreateEncryptionKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getObjectLocation(com.aruna.api.internal.v1.ProxyProto.GetObjectLocationRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.ProxyProto.GetObjectLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCollectionByBucket(com.aruna.api.internal.v1.ProxyProto.GetCollectionByBucketRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.ProxyProto.GetCollectionByBucketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCollectionByBucketMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InternalProxyNotifierService.
   * <pre>
   * This service enables a "return" channel for dataproxy to aruna server communication
   * Mainly used to notify the backend of validation / move events after the upload of new files
   * </pre>
   */
  public static final class InternalProxyNotifierServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InternalProxyNotifierServiceBlockingStub> {
    private InternalProxyNotifierServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalProxyNotifierServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InternalProxyNotifierServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.aruna.api.internal.v1.ProxyProto.GetOrCreateObjectByPathResponse getOrCreateObjectByPath(com.aruna.api.internal.v1.ProxyProto.GetOrCreateObjectByPathRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrCreateObjectByPathMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.internal.v1.ProxyProto.FinalizeObjectResponse finalizeObject(com.aruna.api.internal.v1.ProxyProto.FinalizeObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFinalizeObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.internal.v1.ProxyProto.GetOrCreateEncryptionKeyResponse getOrCreateEncryptionKey(com.aruna.api.internal.v1.ProxyProto.GetOrCreateEncryptionKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrCreateEncryptionKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.internal.v1.ProxyProto.GetObjectLocationResponse getObjectLocation(com.aruna.api.internal.v1.ProxyProto.GetObjectLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.internal.v1.ProxyProto.GetCollectionByBucketResponse getCollectionByBucket(com.aruna.api.internal.v1.ProxyProto.GetCollectionByBucketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCollectionByBucketMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InternalProxyNotifierService.
   * <pre>
   * This service enables a "return" channel for dataproxy to aruna server communication
   * Mainly used to notify the backend of validation / move events after the upload of new files
   * </pre>
   */
  public static final class InternalProxyNotifierServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<InternalProxyNotifierServiceFutureStub> {
    private InternalProxyNotifierServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalProxyNotifierServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InternalProxyNotifierServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.internal.v1.ProxyProto.GetOrCreateObjectByPathResponse> getOrCreateObjectByPath(
        com.aruna.api.internal.v1.ProxyProto.GetOrCreateObjectByPathRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrCreateObjectByPathMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.internal.v1.ProxyProto.FinalizeObjectResponse> finalizeObject(
        com.aruna.api.internal.v1.ProxyProto.FinalizeObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFinalizeObjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.internal.v1.ProxyProto.GetOrCreateEncryptionKeyResponse> getOrCreateEncryptionKey(
        com.aruna.api.internal.v1.ProxyProto.GetOrCreateEncryptionKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrCreateEncryptionKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.internal.v1.ProxyProto.GetObjectLocationResponse> getObjectLocation(
        com.aruna.api.internal.v1.ProxyProto.GetObjectLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.internal.v1.ProxyProto.GetCollectionByBucketResponse> getCollectionByBucket(
        com.aruna.api.internal.v1.ProxyProto.GetCollectionByBucketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCollectionByBucketMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_OR_CREATE_OBJECT_BY_PATH = 0;
  private static final int METHODID_FINALIZE_OBJECT = 1;
  private static final int METHODID_GET_OR_CREATE_ENCRYPTION_KEY = 2;
  private static final int METHODID_GET_OBJECT_LOCATION = 3;
  private static final int METHODID_GET_COLLECTION_BY_BUCKET = 4;

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
        case METHODID_GET_OR_CREATE_OBJECT_BY_PATH:
          serviceImpl.getOrCreateObjectByPath((com.aruna.api.internal.v1.ProxyProto.GetOrCreateObjectByPathRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.ProxyProto.GetOrCreateObjectByPathResponse>) responseObserver);
          break;
        case METHODID_FINALIZE_OBJECT:
          serviceImpl.finalizeObject((com.aruna.api.internal.v1.ProxyProto.FinalizeObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.ProxyProto.FinalizeObjectResponse>) responseObserver);
          break;
        case METHODID_GET_OR_CREATE_ENCRYPTION_KEY:
          serviceImpl.getOrCreateEncryptionKey((com.aruna.api.internal.v1.ProxyProto.GetOrCreateEncryptionKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.ProxyProto.GetOrCreateEncryptionKeyResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT_LOCATION:
          serviceImpl.getObjectLocation((com.aruna.api.internal.v1.ProxyProto.GetObjectLocationRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.ProxyProto.GetObjectLocationResponse>) responseObserver);
          break;
        case METHODID_GET_COLLECTION_BY_BUCKET:
          serviceImpl.getCollectionByBucket((com.aruna.api.internal.v1.ProxyProto.GetCollectionByBucketRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.internal.v1.ProxyProto.GetCollectionByBucketResponse>) responseObserver);
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
          getGetOrCreateObjectByPathMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.internal.v1.ProxyProto.GetOrCreateObjectByPathRequest,
              com.aruna.api.internal.v1.ProxyProto.GetOrCreateObjectByPathResponse>(
                service, METHODID_GET_OR_CREATE_OBJECT_BY_PATH)))
        .addMethod(
          getFinalizeObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.internal.v1.ProxyProto.FinalizeObjectRequest,
              com.aruna.api.internal.v1.ProxyProto.FinalizeObjectResponse>(
                service, METHODID_FINALIZE_OBJECT)))
        .addMethod(
          getGetOrCreateEncryptionKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.internal.v1.ProxyProto.GetOrCreateEncryptionKeyRequest,
              com.aruna.api.internal.v1.ProxyProto.GetOrCreateEncryptionKeyResponse>(
                service, METHODID_GET_OR_CREATE_ENCRYPTION_KEY)))
        .addMethod(
          getGetObjectLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.internal.v1.ProxyProto.GetObjectLocationRequest,
              com.aruna.api.internal.v1.ProxyProto.GetObjectLocationResponse>(
                service, METHODID_GET_OBJECT_LOCATION)))
        .addMethod(
          getGetCollectionByBucketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.internal.v1.ProxyProto.GetCollectionByBucketRequest,
              com.aruna.api.internal.v1.ProxyProto.GetCollectionByBucketResponse>(
                service, METHODID_GET_COLLECTION_BY_BUCKET)))
        .build();
  }

  private static abstract class InternalProxyNotifierServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InternalProxyNotifierServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.internal.v1.ProxyProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InternalProxyNotifierService");
    }
  }

  private static final class InternalProxyNotifierServiceFileDescriptorSupplier
      extends InternalProxyNotifierServiceBaseDescriptorSupplier {
    InternalProxyNotifierServiceFileDescriptorSupplier() {}
  }

  private static final class InternalProxyNotifierServiceMethodDescriptorSupplier
      extends InternalProxyNotifierServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InternalProxyNotifierServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InternalProxyNotifierServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InternalProxyNotifierServiceFileDescriptorSupplier())
              .addMethod(getGetOrCreateObjectByPathMethod())
              .addMethod(getFinalizeObjectMethod())
              .addMethod(getGetOrCreateEncryptionKeyMethod())
              .addMethod(getGetObjectLocationMethod())
              .addMethod(getGetCollectionByBucketMethod())
              .build();
        }
      }
    }
    return result;
  }
}
