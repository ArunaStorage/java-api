package com.github.ScienceObjectsDB.java_api.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: api/services/ObjectLoad.proto")
public final class ObjectLoadGrpc {

  private ObjectLoadGrpc() {}

  public static final String SERVICE_NAME = "services.ObjectLoad";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse> getCreateUploadLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUploadLink",
      requestType = com.github.ScienceObjectsDB.java_api.models.ID.class,
      responseType = com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse> getCreateUploadLinkMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse> getCreateUploadLinkMethod;
    if ((getCreateUploadLinkMethod = ObjectLoadGrpc.getCreateUploadLinkMethod) == null) {
      synchronized (ObjectLoadGrpc.class) {
        if ((getCreateUploadLinkMethod = ObjectLoadGrpc.getCreateUploadLinkMethod) == null) {
          ObjectLoadGrpc.getCreateUploadLinkMethod = getCreateUploadLinkMethod = 
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "services.ObjectLoad", "CreateUploadLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ObjectLoadMethodDescriptorSupplier("CreateUploadLink"))
                  .build();
          }
        }
     }
     return getCreateUploadLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse> getCreateDownloadLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDownloadLink",
      requestType = com.github.ScienceObjectsDB.java_api.models.ID.class,
      responseType = com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse> getCreateDownloadLinkMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse> getCreateDownloadLinkMethod;
    if ((getCreateDownloadLinkMethod = ObjectLoadGrpc.getCreateDownloadLinkMethod) == null) {
      synchronized (ObjectLoadGrpc.class) {
        if ((getCreateDownloadLinkMethod = ObjectLoadGrpc.getCreateDownloadLinkMethod) == null) {
          ObjectLoadGrpc.getCreateDownloadLinkMethod = getCreateDownloadLinkMethod = 
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "services.ObjectLoad", "CreateDownloadLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ObjectLoadMethodDescriptorSupplier("CreateDownloadLink"))
                  .build();
          }
        }
     }
     return getCreateDownloadLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.models.Object> getStartMultipartUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartMultipartUpload",
      requestType = com.github.ScienceObjectsDB.java_api.models.ID.class,
      responseType = com.github.ScienceObjectsDB.java_api.models.Object.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.models.Object> getStartMultipartUploadMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.models.Object> getStartMultipartUploadMethod;
    if ((getStartMultipartUploadMethod = ObjectLoadGrpc.getStartMultipartUploadMethod) == null) {
      synchronized (ObjectLoadGrpc.class) {
        if ((getStartMultipartUploadMethod = ObjectLoadGrpc.getStartMultipartUploadMethod) == null) {
          ObjectLoadGrpc.getStartMultipartUploadMethod = getStartMultipartUploadMethod = 
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.models.Object>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "services.ObjectLoad", "StartMultipartUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.Object.getDefaultInstance()))
                  .setSchemaDescriptor(new ObjectLoadMethodDescriptorSupplier("StartMultipartUpload"))
                  .build();
          }
        }
     }
     return getStartMultipartUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.GetMultipartUploadRequest,
      com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse> getGetMultipartUploadLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMultipartUploadLink",
      requestType = com.github.ScienceObjectsDB.java_api.services.GetMultipartUploadRequest.class,
      responseType = com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.GetMultipartUploadRequest,
      com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse> getGetMultipartUploadLinkMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.GetMultipartUploadRequest, com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse> getGetMultipartUploadLinkMethod;
    if ((getGetMultipartUploadLinkMethod = ObjectLoadGrpc.getGetMultipartUploadLinkMethod) == null) {
      synchronized (ObjectLoadGrpc.class) {
        if ((getGetMultipartUploadLinkMethod = ObjectLoadGrpc.getGetMultipartUploadLinkMethod) == null) {
          ObjectLoadGrpc.getGetMultipartUploadLinkMethod = getGetMultipartUploadLinkMethod = 
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.services.GetMultipartUploadRequest, com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "services.ObjectLoad", "GetMultipartUploadLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.services.GetMultipartUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ObjectLoadMethodDescriptorSupplier("GetMultipartUploadLink"))
                  .build();
          }
        }
     }
     return getGetMultipartUploadLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.CompleteMultipartRequest,
      com.github.ScienceObjectsDB.java_api.models.Empty> getCompleteMultipartUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CompleteMultipartUpload",
      requestType = com.github.ScienceObjectsDB.java_api.services.CompleteMultipartRequest.class,
      responseType = com.github.ScienceObjectsDB.java_api.models.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.CompleteMultipartRequest,
      com.github.ScienceObjectsDB.java_api.models.Empty> getCompleteMultipartUploadMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.CompleteMultipartRequest, com.github.ScienceObjectsDB.java_api.models.Empty> getCompleteMultipartUploadMethod;
    if ((getCompleteMultipartUploadMethod = ObjectLoadGrpc.getCompleteMultipartUploadMethod) == null) {
      synchronized (ObjectLoadGrpc.class) {
        if ((getCompleteMultipartUploadMethod = ObjectLoadGrpc.getCompleteMultipartUploadMethod) == null) {
          ObjectLoadGrpc.getCompleteMultipartUploadMethod = getCompleteMultipartUploadMethod = 
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.services.CompleteMultipartRequest, com.github.ScienceObjectsDB.java_api.models.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "services.ObjectLoad", "CompleteMultipartUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.services.CompleteMultipartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ObjectLoadMethodDescriptorSupplier("CompleteMultipartUpload"))
                  .build();
          }
        }
     }
     return getCompleteMultipartUploadMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ObjectLoadStub newStub(io.grpc.Channel channel) {
    return new ObjectLoadStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ObjectLoadBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ObjectLoadBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ObjectLoadFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ObjectLoadFutureStub(channel);
  }

  /**
   */
  public static abstract class ObjectLoadImplBase implements io.grpc.BindableService {

    /**
     */
    public void createUploadLink(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateUploadLinkMethod(), responseObserver);
    }

    /**
     */
    public void createDownloadLink(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateDownloadLinkMethod(), responseObserver);
    }

    /**
     */
    public void startMultipartUpload(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Object> responseObserver) {
      asyncUnimplementedUnaryCall(getStartMultipartUploadMethod(), responseObserver);
    }

    /**
     */
    public void getMultipartUploadLink(com.github.ScienceObjectsDB.java_api.services.GetMultipartUploadRequest request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMultipartUploadLinkMethod(), responseObserver);
    }

    /**
     */
    public void completeMultipartUpload(com.github.ScienceObjectsDB.java_api.services.CompleteMultipartRequest request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCompleteMultipartUploadMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUploadLinkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.models.ID,
                com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse>(
                  this, METHODID_CREATE_UPLOAD_LINK)))
          .addMethod(
            getCreateDownloadLinkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.models.ID,
                com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse>(
                  this, METHODID_CREATE_DOWNLOAD_LINK)))
          .addMethod(
            getStartMultipartUploadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.models.ID,
                com.github.ScienceObjectsDB.java_api.models.Object>(
                  this, METHODID_START_MULTIPART_UPLOAD)))
          .addMethod(
            getGetMultipartUploadLinkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.services.GetMultipartUploadRequest,
                com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse>(
                  this, METHODID_GET_MULTIPART_UPLOAD_LINK)))
          .addMethod(
            getCompleteMultipartUploadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.services.CompleteMultipartRequest,
                com.github.ScienceObjectsDB.java_api.models.Empty>(
                  this, METHODID_COMPLETE_MULTIPART_UPLOAD)))
          .build();
    }
  }

  /**
   */
  public static final class ObjectLoadStub extends io.grpc.stub.AbstractStub<ObjectLoadStub> {
    private ObjectLoadStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ObjectLoadStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectLoadStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ObjectLoadStub(channel, callOptions);
    }

    /**
     */
    public void createUploadLink(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateUploadLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createDownloadLink(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateDownloadLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startMultipartUpload(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Object> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartMultipartUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMultipartUploadLink(com.github.ScienceObjectsDB.java_api.services.GetMultipartUploadRequest request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMultipartUploadLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void completeMultipartUpload(com.github.ScienceObjectsDB.java_api.services.CompleteMultipartRequest request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCompleteMultipartUploadMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ObjectLoadBlockingStub extends io.grpc.stub.AbstractStub<ObjectLoadBlockingStub> {
    private ObjectLoadBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ObjectLoadBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectLoadBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ObjectLoadBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse createUploadLink(com.github.ScienceObjectsDB.java_api.models.ID request) {
      return blockingUnaryCall(
          getChannel(), getCreateUploadLinkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse createDownloadLink(com.github.ScienceObjectsDB.java_api.models.ID request) {
      return blockingUnaryCall(
          getChannel(), getCreateDownloadLinkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.ScienceObjectsDB.java_api.models.Object startMultipartUpload(com.github.ScienceObjectsDB.java_api.models.ID request) {
      return blockingUnaryCall(
          getChannel(), getStartMultipartUploadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse getMultipartUploadLink(com.github.ScienceObjectsDB.java_api.services.GetMultipartUploadRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMultipartUploadLinkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.ScienceObjectsDB.java_api.models.Empty completeMultipartUpload(com.github.ScienceObjectsDB.java_api.services.CompleteMultipartRequest request) {
      return blockingUnaryCall(
          getChannel(), getCompleteMultipartUploadMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ObjectLoadFutureStub extends io.grpc.stub.AbstractStub<ObjectLoadFutureStub> {
    private ObjectLoadFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ObjectLoadFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectLoadFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ObjectLoadFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse> createUploadLink(
        com.github.ScienceObjectsDB.java_api.models.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateUploadLinkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse> createDownloadLink(
        com.github.ScienceObjectsDB.java_api.models.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateDownloadLinkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.models.Object> startMultipartUpload(
        com.github.ScienceObjectsDB.java_api.models.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getStartMultipartUploadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse> getMultipartUploadLink(
        com.github.ScienceObjectsDB.java_api.services.GetMultipartUploadRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMultipartUploadLinkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.models.Empty> completeMultipartUpload(
        com.github.ScienceObjectsDB.java_api.services.CompleteMultipartRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCompleteMultipartUploadMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_UPLOAD_LINK = 0;
  private static final int METHODID_CREATE_DOWNLOAD_LINK = 1;
  private static final int METHODID_START_MULTIPART_UPLOAD = 2;
  private static final int METHODID_GET_MULTIPART_UPLOAD_LINK = 3;
  private static final int METHODID_COMPLETE_MULTIPART_UPLOAD = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ObjectLoadImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ObjectLoadImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_UPLOAD_LINK:
          serviceImpl.createUploadLink((com.github.ScienceObjectsDB.java_api.models.ID) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse>) responseObserver);
          break;
        case METHODID_CREATE_DOWNLOAD_LINK:
          serviceImpl.createDownloadLink((com.github.ScienceObjectsDB.java_api.models.ID) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse>) responseObserver);
          break;
        case METHODID_START_MULTIPART_UPLOAD:
          serviceImpl.startMultipartUpload((com.github.ScienceObjectsDB.java_api.models.ID) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Object>) responseObserver);
          break;
        case METHODID_GET_MULTIPART_UPLOAD_LINK:
          serviceImpl.getMultipartUploadLink((com.github.ScienceObjectsDB.java_api.services.GetMultipartUploadRequest) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.CreateLinkResponse>) responseObserver);
          break;
        case METHODID_COMPLETE_MULTIPART_UPLOAD:
          serviceImpl.completeMultipartUpload((com.github.ScienceObjectsDB.java_api.services.CompleteMultipartRequest) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Empty>) responseObserver);
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

  private static abstract class ObjectLoadBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ObjectLoadBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.ScienceObjectsDB.java_api.services.ObjectLoadServices.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ObjectLoad");
    }
  }

  private static final class ObjectLoadFileDescriptorSupplier
      extends ObjectLoadBaseDescriptorSupplier {
    ObjectLoadFileDescriptorSupplier() {}
  }

  private static final class ObjectLoadMethodDescriptorSupplier
      extends ObjectLoadBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ObjectLoadMethodDescriptorSupplier(String methodName) {
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
      synchronized (ObjectLoadGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ObjectLoadFileDescriptorSupplier())
              .addMethod(getCreateUploadLinkMethod())
              .addMethod(getCreateDownloadLinkMethod())
              .addMethod(getStartMultipartUploadMethod())
              .addMethod(getGetMultipartUploadLinkMethod())
              .addMethod(getCompleteMultipartUploadMethod())
              .build();
        }
      }
    }
    return result;
  }
}
