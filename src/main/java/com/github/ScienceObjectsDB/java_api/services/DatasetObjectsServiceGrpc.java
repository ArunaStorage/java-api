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
    comments = "Source: api/services/DatasetObjectService.proto")
public final class DatasetObjectsServiceGrpc {

  private DatasetObjectsServiceGrpc() {}

  public static final String SERVICE_NAME = "services.DatasetObjectsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.CreateObjectGroupWithVersionRequest,
      com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse> getCreateObjectGroupWithVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateObjectGroupWithVersion",
      requestType = com.github.ScienceObjectsDB.java_api.services.CreateObjectGroupWithVersionRequest.class,
      responseType = com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.CreateObjectGroupWithVersionRequest,
      com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse> getCreateObjectGroupWithVersionMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.CreateObjectGroupWithVersionRequest, com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse> getCreateObjectGroupWithVersionMethod;
    if ((getCreateObjectGroupWithVersionMethod = DatasetObjectsServiceGrpc.getCreateObjectGroupWithVersionMethod) == null) {
      synchronized (DatasetObjectsServiceGrpc.class) {
        if ((getCreateObjectGroupWithVersionMethod = DatasetObjectsServiceGrpc.getCreateObjectGroupWithVersionMethod) == null) {
          DatasetObjectsServiceGrpc.getCreateObjectGroupWithVersionMethod = getCreateObjectGroupWithVersionMethod = 
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.services.CreateObjectGroupWithVersionRequest, com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "services.DatasetObjectsService", "CreateObjectGroupWithVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.services.CreateObjectGroupWithVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DatasetObjectsServiceMethodDescriptorSupplier("CreateObjectGroupWithVersion"))
                  .build();
          }
        }
     }
     return getCreateObjectGroupWithVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.AddVersionToObjectGroupRequest,
      com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse> getAddVersionToObjectGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddVersionToObjectGroup",
      requestType = com.github.ScienceObjectsDB.java_api.services.AddVersionToObjectGroupRequest.class,
      responseType = com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.AddVersionToObjectGroupRequest,
      com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse> getAddVersionToObjectGroupMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.AddVersionToObjectGroupRequest, com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse> getAddVersionToObjectGroupMethod;
    if ((getAddVersionToObjectGroupMethod = DatasetObjectsServiceGrpc.getAddVersionToObjectGroupMethod) == null) {
      synchronized (DatasetObjectsServiceGrpc.class) {
        if ((getAddVersionToObjectGroupMethod = DatasetObjectsServiceGrpc.getAddVersionToObjectGroupMethod) == null) {
          DatasetObjectsServiceGrpc.getAddVersionToObjectGroupMethod = getAddVersionToObjectGroupMethod = 
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.services.AddVersionToObjectGroupRequest, com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "services.DatasetObjectsService", "AddVersionToObjectGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.services.AddVersionToObjectGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DatasetObjectsServiceMethodDescriptorSupplier("AddVersionToObjectGroup"))
                  .build();
          }
        }
     }
     return getAddVersionToObjectGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse> getGetObjectGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectGroup",
      requestType = com.github.ScienceObjectsDB.java_api.models.ID.class,
      responseType = com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse> getGetObjectGroupMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse> getGetObjectGroupMethod;
    if ((getGetObjectGroupMethod = DatasetObjectsServiceGrpc.getGetObjectGroupMethod) == null) {
      synchronized (DatasetObjectsServiceGrpc.class) {
        if ((getGetObjectGroupMethod = DatasetObjectsServiceGrpc.getGetObjectGroupMethod) == null) {
          DatasetObjectsServiceGrpc.getGetObjectGroupMethod = getGetObjectGroupMethod = 
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "services.DatasetObjectsService", "GetObjectGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DatasetObjectsServiceMethodDescriptorSupplier("GetObjectGroup"))
                  .build();
          }
        }
     }
     return getGetObjectGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse> getGetCurrentObjectGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentObjectGroup",
      requestType = com.github.ScienceObjectsDB.java_api.models.ID.class,
      responseType = com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse> getGetCurrentObjectGroupMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse> getGetCurrentObjectGroupMethod;
    if ((getGetCurrentObjectGroupMethod = DatasetObjectsServiceGrpc.getGetCurrentObjectGroupMethod) == null) {
      synchronized (DatasetObjectsServiceGrpc.class) {
        if ((getGetCurrentObjectGroupMethod = DatasetObjectsServiceGrpc.getGetCurrentObjectGroupMethod) == null) {
          DatasetObjectsServiceGrpc.getGetCurrentObjectGroupMethod = getGetCurrentObjectGroupMethod = 
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "services.DatasetObjectsService", "GetCurrentObjectGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DatasetObjectsServiceMethodDescriptorSupplier("GetCurrentObjectGroup"))
                  .build();
          }
        }
     }
     return getGetCurrentObjectGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionRequest,
      com.github.ScienceObjectsDB.java_api.models.ObjectGroupVersion> getGetObjectGroupVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectGroupVersion",
      requestType = com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionRequest.class,
      responseType = com.github.ScienceObjectsDB.java_api.models.ObjectGroupVersion.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionRequest,
      com.github.ScienceObjectsDB.java_api.models.ObjectGroupVersion> getGetObjectGroupVersionMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionRequest, com.github.ScienceObjectsDB.java_api.models.ObjectGroupVersion> getGetObjectGroupVersionMethod;
    if ((getGetObjectGroupVersionMethod = DatasetObjectsServiceGrpc.getGetObjectGroupVersionMethod) == null) {
      synchronized (DatasetObjectsServiceGrpc.class) {
        if ((getGetObjectGroupVersionMethod = DatasetObjectsServiceGrpc.getGetObjectGroupVersionMethod) == null) {
          DatasetObjectsServiceGrpc.getGetObjectGroupVersionMethod = getGetObjectGroupVersionMethod = 
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionRequest, com.github.ScienceObjectsDB.java_api.models.ObjectGroupVersion>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "services.DatasetObjectsService", "GetObjectGroupVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.ObjectGroupVersion.getDefaultInstance()))
                  .setSchemaDescriptor(new DatasetObjectsServiceMethodDescriptorSupplier("GetObjectGroupVersion"))
                  .build();
          }
        }
     }
     return getGetObjectGroupVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions> getGetObjectGroupVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectGroupVersions",
      requestType = com.github.ScienceObjectsDB.java_api.models.ID.class,
      responseType = com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions> getGetObjectGroupVersionsMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions> getGetObjectGroupVersionsMethod;
    if ((getGetObjectGroupVersionsMethod = DatasetObjectsServiceGrpc.getGetObjectGroupVersionsMethod) == null) {
      synchronized (DatasetObjectsServiceGrpc.class) {
        if ((getGetObjectGroupVersionsMethod = DatasetObjectsServiceGrpc.getGetObjectGroupVersionsMethod) == null) {
          DatasetObjectsServiceGrpc.getGetObjectGroupVersionsMethod = getGetObjectGroupVersionsMethod = 
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "services.DatasetObjectsService", "GetObjectGroupVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions.getDefaultInstance()))
                  .setSchemaDescriptor(new DatasetObjectsServiceMethodDescriptorSupplier("GetObjectGroupVersions"))
                  .build();
          }
        }
     }
     return getGetObjectGroupVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.models.Empty> getFinishObjectUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FinishObjectUpload",
      requestType = com.github.ScienceObjectsDB.java_api.models.ID.class,
      responseType = com.github.ScienceObjectsDB.java_api.models.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.models.Empty> getFinishObjectUploadMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.models.Empty> getFinishObjectUploadMethod;
    if ((getFinishObjectUploadMethod = DatasetObjectsServiceGrpc.getFinishObjectUploadMethod) == null) {
      synchronized (DatasetObjectsServiceGrpc.class) {
        if ((getFinishObjectUploadMethod = DatasetObjectsServiceGrpc.getFinishObjectUploadMethod) == null) {
          DatasetObjectsServiceGrpc.getFinishObjectUploadMethod = getFinishObjectUploadMethod = 
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.models.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "services.DatasetObjectsService", "FinishObjectUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DatasetObjectsServiceMethodDescriptorSupplier("FinishObjectUpload"))
                  .build();
          }
        }
     }
     return getFinishObjectUploadMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DatasetObjectsServiceStub newStub(io.grpc.Channel channel) {
    return new DatasetObjectsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DatasetObjectsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DatasetObjectsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DatasetObjectsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DatasetObjectsServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DatasetObjectsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *CreateObjectGroup Creates a new object group
     * </pre>
     */
    public void createObjectGroupWithVersion(com.github.ScienceObjectsDB.java_api.services.CreateObjectGroupWithVersionRequest request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateObjectGroupWithVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     *CreateObjectGroupVersion Creates a new object group version
     * </pre>
     */
    public void addVersionToObjectGroup(com.github.ScienceObjectsDB.java_api.services.AddVersionToObjectGroupRequest request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddVersionToObjectGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     *GetObjectGroup Returns the object group with the given ID
     * </pre>
     */
    public void getObjectGroup(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetObjectGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     *GetObjectGroupCurrentVersion Returns the head version in the history of a given object group
     * </pre>
     */
    public void getCurrentObjectGroup(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCurrentObjectGroupMethod(), responseObserver);
    }

    /**
     */
    public void getObjectGroupVersion(com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionRequest request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.ObjectGroupVersion> responseObserver) {
      asyncUnimplementedUnaryCall(getGetObjectGroupVersionMethod(), responseObserver);
    }

    /**
     */
    public void getObjectGroupVersions(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions> responseObserver) {
      asyncUnimplementedUnaryCall(getGetObjectGroupVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     *FinishObjectUpload Finishes the upload process for an object
     * </pre>
     */
    public void finishObjectUpload(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getFinishObjectUploadMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateObjectGroupWithVersionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.services.CreateObjectGroupWithVersionRequest,
                com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse>(
                  this, METHODID_CREATE_OBJECT_GROUP_WITH_VERSION)))
          .addMethod(
            getAddVersionToObjectGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.services.AddVersionToObjectGroupRequest,
                com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse>(
                  this, METHODID_ADD_VERSION_TO_OBJECT_GROUP)))
          .addMethod(
            getGetObjectGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.models.ID,
                com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse>(
                  this, METHODID_GET_OBJECT_GROUP)))
          .addMethod(
            getGetCurrentObjectGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.models.ID,
                com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse>(
                  this, METHODID_GET_CURRENT_OBJECT_GROUP)))
          .addMethod(
            getGetObjectGroupVersionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionRequest,
                com.github.ScienceObjectsDB.java_api.models.ObjectGroupVersion>(
                  this, METHODID_GET_OBJECT_GROUP_VERSION)))
          .addMethod(
            getGetObjectGroupVersionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.models.ID,
                com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions>(
                  this, METHODID_GET_OBJECT_GROUP_VERSIONS)))
          .addMethod(
            getFinishObjectUploadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.models.ID,
                com.github.ScienceObjectsDB.java_api.models.Empty>(
                  this, METHODID_FINISH_OBJECT_UPLOAD)))
          .build();
    }
  }

  /**
   */
  public static final class DatasetObjectsServiceStub extends io.grpc.stub.AbstractStub<DatasetObjectsServiceStub> {
    private DatasetObjectsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatasetObjectsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetObjectsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatasetObjectsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *CreateObjectGroup Creates a new object group
     * </pre>
     */
    public void createObjectGroupWithVersion(com.github.ScienceObjectsDB.java_api.services.CreateObjectGroupWithVersionRequest request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateObjectGroupWithVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *CreateObjectGroupVersion Creates a new object group version
     * </pre>
     */
    public void addVersionToObjectGroup(com.github.ScienceObjectsDB.java_api.services.AddVersionToObjectGroupRequest request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddVersionToObjectGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *GetObjectGroup Returns the object group with the given ID
     * </pre>
     */
    public void getObjectGroup(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetObjectGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *GetObjectGroupCurrentVersion Returns the head version in the history of a given object group
     * </pre>
     */
    public void getCurrentObjectGroup(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCurrentObjectGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getObjectGroupVersion(com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionRequest request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.ObjectGroupVersion> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetObjectGroupVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getObjectGroupVersions(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetObjectGroupVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *FinishObjectUpload Finishes the upload process for an object
     * </pre>
     */
    public void finishObjectUpload(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFinishObjectUploadMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DatasetObjectsServiceBlockingStub extends io.grpc.stub.AbstractStub<DatasetObjectsServiceBlockingStub> {
    private DatasetObjectsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatasetObjectsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetObjectsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatasetObjectsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *CreateObjectGroup Creates a new object group
     * </pre>
     */
    public com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse createObjectGroupWithVersion(com.github.ScienceObjectsDB.java_api.services.CreateObjectGroupWithVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateObjectGroupWithVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *CreateObjectGroupVersion Creates a new object group version
     * </pre>
     */
    public com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse addVersionToObjectGroup(com.github.ScienceObjectsDB.java_api.services.AddVersionToObjectGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddVersionToObjectGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *GetObjectGroup Returns the object group with the given ID
     * </pre>
     */
    public com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse getObjectGroup(com.github.ScienceObjectsDB.java_api.models.ID request) {
      return blockingUnaryCall(
          getChannel(), getGetObjectGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *GetObjectGroupCurrentVersion Returns the head version in the history of a given object group
     * </pre>
     */
    public com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse getCurrentObjectGroup(com.github.ScienceObjectsDB.java_api.models.ID request) {
      return blockingUnaryCall(
          getChannel(), getGetCurrentObjectGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.ScienceObjectsDB.java_api.models.ObjectGroupVersion getObjectGroupVersion(com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetObjectGroupVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions getObjectGroupVersions(com.github.ScienceObjectsDB.java_api.models.ID request) {
      return blockingUnaryCall(
          getChannel(), getGetObjectGroupVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *FinishObjectUpload Finishes the upload process for an object
     * </pre>
     */
    public com.github.ScienceObjectsDB.java_api.models.Empty finishObjectUpload(com.github.ScienceObjectsDB.java_api.models.ID request) {
      return blockingUnaryCall(
          getChannel(), getFinishObjectUploadMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DatasetObjectsServiceFutureStub extends io.grpc.stub.AbstractStub<DatasetObjectsServiceFutureStub> {
    private DatasetObjectsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatasetObjectsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetObjectsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatasetObjectsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *CreateObjectGroup Creates a new object group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse> createObjectGroupWithVersion(
        com.github.ScienceObjectsDB.java_api.services.CreateObjectGroupWithVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateObjectGroupWithVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *CreateObjectGroupVersion Creates a new object group version
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse> addVersionToObjectGroup(
        com.github.ScienceObjectsDB.java_api.services.AddVersionToObjectGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddVersionToObjectGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *GetObjectGroup Returns the object group with the given ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse> getObjectGroup(
        com.github.ScienceObjectsDB.java_api.models.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetObjectGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *GetObjectGroupCurrentVersion Returns the head version in the history of a given object group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse> getCurrentObjectGroup(
        com.github.ScienceObjectsDB.java_api.models.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCurrentObjectGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.models.ObjectGroupVersion> getObjectGroupVersion(
        com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetObjectGroupVersionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions> getObjectGroupVersions(
        com.github.ScienceObjectsDB.java_api.models.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetObjectGroupVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *FinishObjectUpload Finishes the upload process for an object
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.models.Empty> finishObjectUpload(
        com.github.ScienceObjectsDB.java_api.models.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getFinishObjectUploadMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_OBJECT_GROUP_WITH_VERSION = 0;
  private static final int METHODID_ADD_VERSION_TO_OBJECT_GROUP = 1;
  private static final int METHODID_GET_OBJECT_GROUP = 2;
  private static final int METHODID_GET_CURRENT_OBJECT_GROUP = 3;
  private static final int METHODID_GET_OBJECT_GROUP_VERSION = 4;
  private static final int METHODID_GET_OBJECT_GROUP_VERSIONS = 5;
  private static final int METHODID_FINISH_OBJECT_UPLOAD = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DatasetObjectsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DatasetObjectsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_OBJECT_GROUP_WITH_VERSION:
          serviceImpl.createObjectGroupWithVersion((com.github.ScienceObjectsDB.java_api.services.CreateObjectGroupWithVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse>) responseObserver);
          break;
        case METHODID_ADD_VERSION_TO_OBJECT_GROUP:
          serviceImpl.addVersionToObjectGroup((com.github.ScienceObjectsDB.java_api.services.AddVersionToObjectGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT_GROUP:
          serviceImpl.getObjectGroup((com.github.ScienceObjectsDB.java_api.models.ID) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse>) responseObserver);
          break;
        case METHODID_GET_CURRENT_OBJECT_GROUP:
          serviceImpl.getCurrentObjectGroup((com.github.ScienceObjectsDB.java_api.models.ID) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT_GROUP_VERSION:
          serviceImpl.getObjectGroupVersion((com.github.ScienceObjectsDB.java_api.services.GetObjectGroupVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.ObjectGroupVersion>) responseObserver);
          break;
        case METHODID_GET_OBJECT_GROUP_VERSIONS:
          serviceImpl.getObjectGroupVersions((com.github.ScienceObjectsDB.java_api.models.ID) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions>) responseObserver);
          break;
        case METHODID_FINISH_OBJECT_UPLOAD:
          serviceImpl.finishObjectUpload((com.github.ScienceObjectsDB.java_api.models.ID) request,
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

  private static abstract class DatasetObjectsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DatasetObjectsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.ScienceObjectsDB.java_api.services.DatasetObjectsServices.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DatasetObjectsService");
    }
  }

  private static final class DatasetObjectsServiceFileDescriptorSupplier
      extends DatasetObjectsServiceBaseDescriptorSupplier {
    DatasetObjectsServiceFileDescriptorSupplier() {}
  }

  private static final class DatasetObjectsServiceMethodDescriptorSupplier
      extends DatasetObjectsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DatasetObjectsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DatasetObjectsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DatasetObjectsServiceFileDescriptorSupplier())
              .addMethod(getCreateObjectGroupWithVersionMethod())
              .addMethod(getAddVersionToObjectGroupMethod())
              .addMethod(getGetObjectGroupMethod())
              .addMethod(getGetCurrentObjectGroupMethod())
              .addMethod(getGetObjectGroupVersionMethod())
              .addMethod(getGetObjectGroupVersionsMethod())
              .addMethod(getFinishObjectUploadMethod())
              .build();
        }
      }
    }
    return result;
  }
}
