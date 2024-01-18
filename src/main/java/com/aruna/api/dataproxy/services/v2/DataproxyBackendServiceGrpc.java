package com.aruna.api.dataproxy.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.0)",
    comments = "Source: aruna/api/dataproxy/services/v2/dataproxy_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataproxyBackendServiceGrpc {

  private DataproxyBackendServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "aruna.api.dataproxy.services.v2.DataproxyBackendService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.PutObjectRequest,
      com.aruna.api.dataproxy.services.v2.PutObjectResponse> getPutObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutObject",
      requestType = com.aruna.api.dataproxy.services.v2.PutObjectRequest.class,
      responseType = com.aruna.api.dataproxy.services.v2.PutObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.PutObjectRequest,
      com.aruna.api.dataproxy.services.v2.PutObjectResponse> getPutObjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.PutObjectRequest, com.aruna.api.dataproxy.services.v2.PutObjectResponse> getPutObjectMethod;
    if ((getPutObjectMethod = DataproxyBackendServiceGrpc.getPutObjectMethod) == null) {
      synchronized (DataproxyBackendServiceGrpc.class) {
        if ((getPutObjectMethod = DataproxyBackendServiceGrpc.getPutObjectMethod) == null) {
          DataproxyBackendServiceGrpc.getPutObjectMethod = getPutObjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.dataproxy.services.v2.PutObjectRequest, com.aruna.api.dataproxy.services.v2.PutObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.PutObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.PutObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataproxyBackendServiceMethodDescriptorSupplier("PutObject"))
              .build();
        }
      }
    }
    return getPutObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.GetObjectRequest,
      com.aruna.api.dataproxy.services.v2.GetObjectResponse> getGetObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObject",
      requestType = com.aruna.api.dataproxy.services.v2.GetObjectRequest.class,
      responseType = com.aruna.api.dataproxy.services.v2.GetObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.GetObjectRequest,
      com.aruna.api.dataproxy.services.v2.GetObjectResponse> getGetObjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.GetObjectRequest, com.aruna.api.dataproxy.services.v2.GetObjectResponse> getGetObjectMethod;
    if ((getGetObjectMethod = DataproxyBackendServiceGrpc.getGetObjectMethod) == null) {
      synchronized (DataproxyBackendServiceGrpc.class) {
        if ((getGetObjectMethod = DataproxyBackendServiceGrpc.getGetObjectMethod) == null) {
          DataproxyBackendServiceGrpc.getGetObjectMethod = getGetObjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.dataproxy.services.v2.GetObjectRequest, com.aruna.api.dataproxy.services.v2.GetObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.GetObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.GetObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataproxyBackendServiceMethodDescriptorSupplier("GetObject"))
              .build();
        }
      }
    }
    return getGetObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.HeadObjectRequest,
      com.aruna.api.dataproxy.services.v2.HeadObjectResponse> getHeadObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HeadObject",
      requestType = com.aruna.api.dataproxy.services.v2.HeadObjectRequest.class,
      responseType = com.aruna.api.dataproxy.services.v2.HeadObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.HeadObjectRequest,
      com.aruna.api.dataproxy.services.v2.HeadObjectResponse> getHeadObjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.HeadObjectRequest, com.aruna.api.dataproxy.services.v2.HeadObjectResponse> getHeadObjectMethod;
    if ((getHeadObjectMethod = DataproxyBackendServiceGrpc.getHeadObjectMethod) == null) {
      synchronized (DataproxyBackendServiceGrpc.class) {
        if ((getHeadObjectMethod = DataproxyBackendServiceGrpc.getHeadObjectMethod) == null) {
          DataproxyBackendServiceGrpc.getHeadObjectMethod = getHeadObjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.dataproxy.services.v2.HeadObjectRequest, com.aruna.api.dataproxy.services.v2.HeadObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HeadObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.HeadObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.HeadObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataproxyBackendServiceMethodDescriptorSupplier("HeadObject"))
              .build();
        }
      }
    }
    return getHeadObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest,
      com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse> getInitMultiPartUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitMultiPartUpload",
      requestType = com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest.class,
      responseType = com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest,
      com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse> getInitMultiPartUploadMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest, com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse> getInitMultiPartUploadMethod;
    if ((getInitMultiPartUploadMethod = DataproxyBackendServiceGrpc.getInitMultiPartUploadMethod) == null) {
      synchronized (DataproxyBackendServiceGrpc.class) {
        if ((getInitMultiPartUploadMethod = DataproxyBackendServiceGrpc.getInitMultiPartUploadMethod) == null) {
          DataproxyBackendServiceGrpc.getInitMultiPartUploadMethod = getInitMultiPartUploadMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest, com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitMultiPartUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataproxyBackendServiceMethodDescriptorSupplier("InitMultiPartUpload"))
              .build();
        }
      }
    }
    return getInitMultiPartUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.UploadPartRequest,
      com.aruna.api.dataproxy.services.v2.UploadPartResponse> getUploadPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadPart",
      requestType = com.aruna.api.dataproxy.services.v2.UploadPartRequest.class,
      responseType = com.aruna.api.dataproxy.services.v2.UploadPartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.UploadPartRequest,
      com.aruna.api.dataproxy.services.v2.UploadPartResponse> getUploadPartMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.UploadPartRequest, com.aruna.api.dataproxy.services.v2.UploadPartResponse> getUploadPartMethod;
    if ((getUploadPartMethod = DataproxyBackendServiceGrpc.getUploadPartMethod) == null) {
      synchronized (DataproxyBackendServiceGrpc.class) {
        if ((getUploadPartMethod = DataproxyBackendServiceGrpc.getUploadPartMethod) == null) {
          DataproxyBackendServiceGrpc.getUploadPartMethod = getUploadPartMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.dataproxy.services.v2.UploadPartRequest, com.aruna.api.dataproxy.services.v2.UploadPartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.UploadPartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.UploadPartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataproxyBackendServiceMethodDescriptorSupplier("UploadPart"))
              .build();
        }
      }
    }
    return getUploadPartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.CompleteMultiPartUploadRequest,
      com.aruna.api.dataproxy.services.v2.CompleteMultiPartUploadResponse> getCompleteMultiPartUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CompleteMultiPartUpload",
      requestType = com.aruna.api.dataproxy.services.v2.CompleteMultiPartUploadRequest.class,
      responseType = com.aruna.api.dataproxy.services.v2.CompleteMultiPartUploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.CompleteMultiPartUploadRequest,
      com.aruna.api.dataproxy.services.v2.CompleteMultiPartUploadResponse> getCompleteMultiPartUploadMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.CompleteMultiPartUploadRequest, com.aruna.api.dataproxy.services.v2.CompleteMultiPartUploadResponse> getCompleteMultiPartUploadMethod;
    if ((getCompleteMultiPartUploadMethod = DataproxyBackendServiceGrpc.getCompleteMultiPartUploadMethod) == null) {
      synchronized (DataproxyBackendServiceGrpc.class) {
        if ((getCompleteMultiPartUploadMethod = DataproxyBackendServiceGrpc.getCompleteMultiPartUploadMethod) == null) {
          DataproxyBackendServiceGrpc.getCompleteMultiPartUploadMethod = getCompleteMultiPartUploadMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.dataproxy.services.v2.CompleteMultiPartUploadRequest, com.aruna.api.dataproxy.services.v2.CompleteMultiPartUploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CompleteMultiPartUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.CompleteMultiPartUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.CompleteMultiPartUploadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataproxyBackendServiceMethodDescriptorSupplier("CompleteMultiPartUpload"))
              .build();
        }
      }
    }
    return getCompleteMultiPartUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.CreateBucketRequest,
      com.aruna.api.dataproxy.services.v2.CreateBucketResponse> getCreateBucketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBucket",
      requestType = com.aruna.api.dataproxy.services.v2.CreateBucketRequest.class,
      responseType = com.aruna.api.dataproxy.services.v2.CreateBucketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.CreateBucketRequest,
      com.aruna.api.dataproxy.services.v2.CreateBucketResponse> getCreateBucketMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.CreateBucketRequest, com.aruna.api.dataproxy.services.v2.CreateBucketResponse> getCreateBucketMethod;
    if ((getCreateBucketMethod = DataproxyBackendServiceGrpc.getCreateBucketMethod) == null) {
      synchronized (DataproxyBackendServiceGrpc.class) {
        if ((getCreateBucketMethod = DataproxyBackendServiceGrpc.getCreateBucketMethod) == null) {
          DataproxyBackendServiceGrpc.getCreateBucketMethod = getCreateBucketMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.dataproxy.services.v2.CreateBucketRequest, com.aruna.api.dataproxy.services.v2.CreateBucketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBucket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.CreateBucketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.CreateBucketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataproxyBackendServiceMethodDescriptorSupplier("CreateBucket"))
              .build();
        }
      }
    }
    return getCreateBucketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DeleteBucketRequest,
      com.aruna.api.dataproxy.services.v2.DeleteBucketResponse> getDeleteBucketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBucket",
      requestType = com.aruna.api.dataproxy.services.v2.DeleteBucketRequest.class,
      responseType = com.aruna.api.dataproxy.services.v2.DeleteBucketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DeleteBucketRequest,
      com.aruna.api.dataproxy.services.v2.DeleteBucketResponse> getDeleteBucketMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DeleteBucketRequest, com.aruna.api.dataproxy.services.v2.DeleteBucketResponse> getDeleteBucketMethod;
    if ((getDeleteBucketMethod = DataproxyBackendServiceGrpc.getDeleteBucketMethod) == null) {
      synchronized (DataproxyBackendServiceGrpc.class) {
        if ((getDeleteBucketMethod = DataproxyBackendServiceGrpc.getDeleteBucketMethod) == null) {
          DataproxyBackendServiceGrpc.getDeleteBucketMethod = getDeleteBucketMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.dataproxy.services.v2.DeleteBucketRequest, com.aruna.api.dataproxy.services.v2.DeleteBucketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBucket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.DeleteBucketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.DeleteBucketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataproxyBackendServiceMethodDescriptorSupplier("DeleteBucket"))
              .build();
        }
      }
    }
    return getDeleteBucketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DeleteObjectRequest,
      com.aruna.api.dataproxy.services.v2.DeleteObjectResponse> getDeleteObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteObject",
      requestType = com.aruna.api.dataproxy.services.v2.DeleteObjectRequest.class,
      responseType = com.aruna.api.dataproxy.services.v2.DeleteObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DeleteObjectRequest,
      com.aruna.api.dataproxy.services.v2.DeleteObjectResponse> getDeleteObjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.DeleteObjectRequest, com.aruna.api.dataproxy.services.v2.DeleteObjectResponse> getDeleteObjectMethod;
    if ((getDeleteObjectMethod = DataproxyBackendServiceGrpc.getDeleteObjectMethod) == null) {
      synchronized (DataproxyBackendServiceGrpc.class) {
        if ((getDeleteObjectMethod = DataproxyBackendServiceGrpc.getDeleteObjectMethod) == null) {
          DataproxyBackendServiceGrpc.getDeleteObjectMethod = getDeleteObjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.dataproxy.services.v2.DeleteObjectRequest, com.aruna.api.dataproxy.services.v2.DeleteObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.DeleteObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.DeleteObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataproxyBackendServiceMethodDescriptorSupplier("DeleteObject"))
              .build();
        }
      }
    }
    return getDeleteObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.InitLocationRequest,
      com.aruna.api.dataproxy.services.v2.InitLocationResponse> getInitLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitLocation",
      requestType = com.aruna.api.dataproxy.services.v2.InitLocationRequest.class,
      responseType = com.aruna.api.dataproxy.services.v2.InitLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.InitLocationRequest,
      com.aruna.api.dataproxy.services.v2.InitLocationResponse> getInitLocationMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.dataproxy.services.v2.InitLocationRequest, com.aruna.api.dataproxy.services.v2.InitLocationResponse> getInitLocationMethod;
    if ((getInitLocationMethod = DataproxyBackendServiceGrpc.getInitLocationMethod) == null) {
      synchronized (DataproxyBackendServiceGrpc.class) {
        if ((getInitLocationMethod = DataproxyBackendServiceGrpc.getInitLocationMethod) == null) {
          DataproxyBackendServiceGrpc.getInitLocationMethod = getInitLocationMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.dataproxy.services.v2.InitLocationRequest, com.aruna.api.dataproxy.services.v2.InitLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.InitLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.dataproxy.services.v2.InitLocationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataproxyBackendServiceMethodDescriptorSupplier("InitLocation"))
              .build();
        }
      }
    }
    return getInitLocationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataproxyBackendServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataproxyBackendServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataproxyBackendServiceStub>() {
        @java.lang.Override
        public DataproxyBackendServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataproxyBackendServiceStub(channel, callOptions);
        }
      };
    return DataproxyBackendServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataproxyBackendServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataproxyBackendServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataproxyBackendServiceBlockingStub>() {
        @java.lang.Override
        public DataproxyBackendServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataproxyBackendServiceBlockingStub(channel, callOptions);
        }
      };
    return DataproxyBackendServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataproxyBackendServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataproxyBackendServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataproxyBackendServiceFutureStub>() {
        @java.lang.Override
        public DataproxyBackendServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataproxyBackendServiceFutureStub(channel, callOptions);
        }
      };
    return DataproxyBackendServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.PutObjectRequest> putObject(
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.PutObjectResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getPutObjectMethod(), responseObserver);
    }

    /**
     */
    default void getObject(com.aruna.api.dataproxy.services.v2.GetObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.GetObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectMethod(), responseObserver);
    }

    /**
     */
    default void headObject(com.aruna.api.dataproxy.services.v2.HeadObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.HeadObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHeadObjectMethod(), responseObserver);
    }

    /**
     */
    default void initMultiPartUpload(com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitMultiPartUploadMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.UploadPartRequest> uploadPart(
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.UploadPartResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadPartMethod(), responseObserver);
    }

    /**
     */
    default void completeMultiPartUpload(com.aruna.api.dataproxy.services.v2.CompleteMultiPartUploadRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.CompleteMultiPartUploadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompleteMultiPartUploadMethod(), responseObserver);
    }

    /**
     */
    default void createBucket(com.aruna.api.dataproxy.services.v2.CreateBucketRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.CreateBucketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBucketMethod(), responseObserver);
    }

    /**
     */
    default void deleteBucket(com.aruna.api.dataproxy.services.v2.DeleteBucketRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DeleteBucketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBucketMethod(), responseObserver);
    }

    /**
     */
    default void deleteObject(com.aruna.api.dataproxy.services.v2.DeleteObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DeleteObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteObjectMethod(), responseObserver);
    }

    /**
     */
    default void initLocation(com.aruna.api.dataproxy.services.v2.InitLocationRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.InitLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitLocationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DataproxyBackendService.
   */
  public static abstract class DataproxyBackendServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DataproxyBackendServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DataproxyBackendService.
   */
  public static final class DataproxyBackendServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DataproxyBackendServiceStub> {
    private DataproxyBackendServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataproxyBackendServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataproxyBackendServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.PutObjectRequest> putObject(
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.PutObjectResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getPutObjectMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getObject(com.aruna.api.dataproxy.services.v2.GetObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.GetObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void headObject(com.aruna.api.dataproxy.services.v2.HeadObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.HeadObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHeadObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void initMultiPartUpload(com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitMultiPartUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.UploadPartRequest> uploadPart(
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.UploadPartResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadPartMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void completeMultiPartUpload(com.aruna.api.dataproxy.services.v2.CompleteMultiPartUploadRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.CompleteMultiPartUploadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCompleteMultiPartUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createBucket(com.aruna.api.dataproxy.services.v2.CreateBucketRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.CreateBucketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBucketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBucket(com.aruna.api.dataproxy.services.v2.DeleteBucketRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DeleteBucketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBucketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteObject(com.aruna.api.dataproxy.services.v2.DeleteObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DeleteObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void initLocation(com.aruna.api.dataproxy.services.v2.InitLocationRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.InitLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitLocationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DataproxyBackendService.
   */
  public static final class DataproxyBackendServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DataproxyBackendServiceBlockingStub> {
    private DataproxyBackendServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataproxyBackendServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataproxyBackendServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.aruna.api.dataproxy.services.v2.GetObjectResponse> getObject(
        com.aruna.api.dataproxy.services.v2.GetObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.dataproxy.services.v2.HeadObjectResponse headObject(com.aruna.api.dataproxy.services.v2.HeadObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHeadObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse initMultiPartUpload(com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitMultiPartUploadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.dataproxy.services.v2.CompleteMultiPartUploadResponse completeMultiPartUpload(com.aruna.api.dataproxy.services.v2.CompleteMultiPartUploadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCompleteMultiPartUploadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.dataproxy.services.v2.CreateBucketResponse createBucket(com.aruna.api.dataproxy.services.v2.CreateBucketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBucketMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.dataproxy.services.v2.DeleteBucketResponse deleteBucket(com.aruna.api.dataproxy.services.v2.DeleteBucketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBucketMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.dataproxy.services.v2.DeleteObjectResponse deleteObject(com.aruna.api.dataproxy.services.v2.DeleteObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.dataproxy.services.v2.InitLocationResponse initLocation(com.aruna.api.dataproxy.services.v2.InitLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitLocationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DataproxyBackendService.
   */
  public static final class DataproxyBackendServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DataproxyBackendServiceFutureStub> {
    private DataproxyBackendServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataproxyBackendServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataproxyBackendServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.dataproxy.services.v2.HeadObjectResponse> headObject(
        com.aruna.api.dataproxy.services.v2.HeadObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHeadObjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse> initMultiPartUpload(
        com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitMultiPartUploadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.dataproxy.services.v2.CompleteMultiPartUploadResponse> completeMultiPartUpload(
        com.aruna.api.dataproxy.services.v2.CompleteMultiPartUploadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCompleteMultiPartUploadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.dataproxy.services.v2.CreateBucketResponse> createBucket(
        com.aruna.api.dataproxy.services.v2.CreateBucketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBucketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.dataproxy.services.v2.DeleteBucketResponse> deleteBucket(
        com.aruna.api.dataproxy.services.v2.DeleteBucketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBucketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.dataproxy.services.v2.DeleteObjectResponse> deleteObject(
        com.aruna.api.dataproxy.services.v2.DeleteObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteObjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.dataproxy.services.v2.InitLocationResponse> initLocation(
        com.aruna.api.dataproxy.services.v2.InitLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitLocationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_OBJECT = 0;
  private static final int METHODID_HEAD_OBJECT = 1;
  private static final int METHODID_INIT_MULTI_PART_UPLOAD = 2;
  private static final int METHODID_COMPLETE_MULTI_PART_UPLOAD = 3;
  private static final int METHODID_CREATE_BUCKET = 4;
  private static final int METHODID_DELETE_BUCKET = 5;
  private static final int METHODID_DELETE_OBJECT = 6;
  private static final int METHODID_INIT_LOCATION = 7;
  private static final int METHODID_PUT_OBJECT = 8;
  private static final int METHODID_UPLOAD_PART = 9;

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
        case METHODID_GET_OBJECT:
          serviceImpl.getObject((com.aruna.api.dataproxy.services.v2.GetObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.GetObjectResponse>) responseObserver);
          break;
        case METHODID_HEAD_OBJECT:
          serviceImpl.headObject((com.aruna.api.dataproxy.services.v2.HeadObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.HeadObjectResponse>) responseObserver);
          break;
        case METHODID_INIT_MULTI_PART_UPLOAD:
          serviceImpl.initMultiPartUpload((com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse>) responseObserver);
          break;
        case METHODID_COMPLETE_MULTI_PART_UPLOAD:
          serviceImpl.completeMultiPartUpload((com.aruna.api.dataproxy.services.v2.CompleteMultiPartUploadRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.CompleteMultiPartUploadResponse>) responseObserver);
          break;
        case METHODID_CREATE_BUCKET:
          serviceImpl.createBucket((com.aruna.api.dataproxy.services.v2.CreateBucketRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.CreateBucketResponse>) responseObserver);
          break;
        case METHODID_DELETE_BUCKET:
          serviceImpl.deleteBucket((com.aruna.api.dataproxy.services.v2.DeleteBucketRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DeleteBucketResponse>) responseObserver);
          break;
        case METHODID_DELETE_OBJECT:
          serviceImpl.deleteObject((com.aruna.api.dataproxy.services.v2.DeleteObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.DeleteObjectResponse>) responseObserver);
          break;
        case METHODID_INIT_LOCATION:
          serviceImpl.initLocation((com.aruna.api.dataproxy.services.v2.InitLocationRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.InitLocationResponse>) responseObserver);
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
        case METHODID_PUT_OBJECT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.putObject(
              (io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.PutObjectResponse>) responseObserver);
        case METHODID_UPLOAD_PART:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadPart(
              (io.grpc.stub.StreamObserver<com.aruna.api.dataproxy.services.v2.UploadPartResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getPutObjectMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.aruna.api.dataproxy.services.v2.PutObjectRequest,
              com.aruna.api.dataproxy.services.v2.PutObjectResponse>(
                service, METHODID_PUT_OBJECT)))
        .addMethod(
          getGetObjectMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.aruna.api.dataproxy.services.v2.GetObjectRequest,
              com.aruna.api.dataproxy.services.v2.GetObjectResponse>(
                service, METHODID_GET_OBJECT)))
        .addMethod(
          getHeadObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.dataproxy.services.v2.HeadObjectRequest,
              com.aruna.api.dataproxy.services.v2.HeadObjectResponse>(
                service, METHODID_HEAD_OBJECT)))
        .addMethod(
          getInitMultiPartUploadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.dataproxy.services.v2.InitMultiPartUploadRequest,
              com.aruna.api.dataproxy.services.v2.InitMultiPartUploadResponse>(
                service, METHODID_INIT_MULTI_PART_UPLOAD)))
        .addMethod(
          getUploadPartMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.aruna.api.dataproxy.services.v2.UploadPartRequest,
              com.aruna.api.dataproxy.services.v2.UploadPartResponse>(
                service, METHODID_UPLOAD_PART)))
        .addMethod(
          getCompleteMultiPartUploadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.dataproxy.services.v2.CompleteMultiPartUploadRequest,
              com.aruna.api.dataproxy.services.v2.CompleteMultiPartUploadResponse>(
                service, METHODID_COMPLETE_MULTI_PART_UPLOAD)))
        .addMethod(
          getCreateBucketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.dataproxy.services.v2.CreateBucketRequest,
              com.aruna.api.dataproxy.services.v2.CreateBucketResponse>(
                service, METHODID_CREATE_BUCKET)))
        .addMethod(
          getDeleteBucketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.dataproxy.services.v2.DeleteBucketRequest,
              com.aruna.api.dataproxy.services.v2.DeleteBucketResponse>(
                service, METHODID_DELETE_BUCKET)))
        .addMethod(
          getDeleteObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.dataproxy.services.v2.DeleteObjectRequest,
              com.aruna.api.dataproxy.services.v2.DeleteObjectResponse>(
                service, METHODID_DELETE_OBJECT)))
        .addMethod(
          getInitLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.dataproxy.services.v2.InitLocationRequest,
              com.aruna.api.dataproxy.services.v2.InitLocationResponse>(
                service, METHODID_INIT_LOCATION)))
        .build();
  }

  private static abstract class DataproxyBackendServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataproxyBackendServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.dataproxy.services.v2.DataproxyServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataproxyBackendService");
    }
  }

  private static final class DataproxyBackendServiceFileDescriptorSupplier
      extends DataproxyBackendServiceBaseDescriptorSupplier {
    DataproxyBackendServiceFileDescriptorSupplier() {}
  }

  private static final class DataproxyBackendServiceMethodDescriptorSupplier
      extends DataproxyBackendServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DataproxyBackendServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DataproxyBackendServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataproxyBackendServiceFileDescriptorSupplier())
              .addMethod(getPutObjectMethod())
              .addMethod(getGetObjectMethod())
              .addMethod(getHeadObjectMethod())
              .addMethod(getInitMultiPartUploadMethod())
              .addMethod(getUploadPartMethod())
              .addMethod(getCompleteMultiPartUploadMethod())
              .addMethod(getCreateBucketMethod())
              .addMethod(getDeleteBucketMethod())
              .addMethod(getDeleteObjectMethod())
              .addMethod(getInitLocationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
