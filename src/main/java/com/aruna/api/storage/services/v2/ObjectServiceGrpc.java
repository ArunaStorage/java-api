package com.aruna.api.storage.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ObjectService
 * Contains all methods that get/create or update Objects and associated resources
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/storage/services/v2/object_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ObjectServiceGrpc {

  private ObjectServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.storage.services.v2.ObjectService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.CreateObjectRequest,
      com.aruna.api.storage.services.v2.ObjectServiceProto.CreateObjectResponse> getCreateObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateObject",
      requestType = com.aruna.api.storage.services.v2.ObjectServiceProto.CreateObjectRequest.class,
      responseType = com.aruna.api.storage.services.v2.ObjectServiceProto.CreateObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.CreateObjectRequest,
      com.aruna.api.storage.services.v2.ObjectServiceProto.CreateObjectResponse> getCreateObjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.CreateObjectRequest, com.aruna.api.storage.services.v2.ObjectServiceProto.CreateObjectResponse> getCreateObjectMethod;
    if ((getCreateObjectMethod = ObjectServiceGrpc.getCreateObjectMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getCreateObjectMethod = ObjectServiceGrpc.getCreateObjectMethod) == null) {
          ObjectServiceGrpc.getCreateObjectMethod = getCreateObjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ObjectServiceProto.CreateObjectRequest, com.aruna.api.storage.services.v2.ObjectServiceProto.CreateObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ObjectServiceProto.CreateObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ObjectServiceProto.CreateObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("CreateObject"))
              .build();
        }
      }
    }
    return getCreateObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.GetUploadURLRequest,
      com.aruna.api.storage.services.v2.ObjectServiceProto.GetUploadURLResponse> getGetUploadURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUploadURL",
      requestType = com.aruna.api.storage.services.v2.ObjectServiceProto.GetUploadURLRequest.class,
      responseType = com.aruna.api.storage.services.v2.ObjectServiceProto.GetUploadURLResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.GetUploadURLRequest,
      com.aruna.api.storage.services.v2.ObjectServiceProto.GetUploadURLResponse> getGetUploadURLMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.GetUploadURLRequest, com.aruna.api.storage.services.v2.ObjectServiceProto.GetUploadURLResponse> getGetUploadURLMethod;
    if ((getGetUploadURLMethod = ObjectServiceGrpc.getGetUploadURLMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getGetUploadURLMethod = ObjectServiceGrpc.getGetUploadURLMethod) == null) {
          ObjectServiceGrpc.getGetUploadURLMethod = getGetUploadURLMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ObjectServiceProto.GetUploadURLRequest, com.aruna.api.storage.services.v2.ObjectServiceProto.GetUploadURLResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUploadURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ObjectServiceProto.GetUploadURLRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ObjectServiceProto.GetUploadURLResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("GetUploadURL"))
              .build();
        }
      }
    }
    return getGetUploadURLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.GetDownloadURLRequest,
      com.aruna.api.storage.services.v2.ObjectServiceProto.GetDownloadURLResponse> getGetDownloadURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDownloadURL",
      requestType = com.aruna.api.storage.services.v2.ObjectServiceProto.GetDownloadURLRequest.class,
      responseType = com.aruna.api.storage.services.v2.ObjectServiceProto.GetDownloadURLResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.GetDownloadURLRequest,
      com.aruna.api.storage.services.v2.ObjectServiceProto.GetDownloadURLResponse> getGetDownloadURLMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.GetDownloadURLRequest, com.aruna.api.storage.services.v2.ObjectServiceProto.GetDownloadURLResponse> getGetDownloadURLMethod;
    if ((getGetDownloadURLMethod = ObjectServiceGrpc.getGetDownloadURLMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getGetDownloadURLMethod = ObjectServiceGrpc.getGetDownloadURLMethod) == null) {
          ObjectServiceGrpc.getGetDownloadURLMethod = getGetDownloadURLMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ObjectServiceProto.GetDownloadURLRequest, com.aruna.api.storage.services.v2.ObjectServiceProto.GetDownloadURLResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDownloadURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ObjectServiceProto.GetDownloadURLRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ObjectServiceProto.GetDownloadURLResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("GetDownloadURL"))
              .build();
        }
      }
    }
    return getGetDownloadURLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.FinishObjectStagingRequest,
      com.aruna.api.storage.services.v2.ObjectServiceProto.FinishObjectStagingResponse> getFinishObjectStagingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FinishObjectStaging",
      requestType = com.aruna.api.storage.services.v2.ObjectServiceProto.FinishObjectStagingRequest.class,
      responseType = com.aruna.api.storage.services.v2.ObjectServiceProto.FinishObjectStagingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.FinishObjectStagingRequest,
      com.aruna.api.storage.services.v2.ObjectServiceProto.FinishObjectStagingResponse> getFinishObjectStagingMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.FinishObjectStagingRequest, com.aruna.api.storage.services.v2.ObjectServiceProto.FinishObjectStagingResponse> getFinishObjectStagingMethod;
    if ((getFinishObjectStagingMethod = ObjectServiceGrpc.getFinishObjectStagingMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getFinishObjectStagingMethod = ObjectServiceGrpc.getFinishObjectStagingMethod) == null) {
          ObjectServiceGrpc.getFinishObjectStagingMethod = getFinishObjectStagingMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ObjectServiceProto.FinishObjectStagingRequest, com.aruna.api.storage.services.v2.ObjectServiceProto.FinishObjectStagingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FinishObjectStaging"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ObjectServiceProto.FinishObjectStagingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ObjectServiceProto.FinishObjectStagingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("FinishObjectStaging"))
              .build();
        }
      }
    }
    return getFinishObjectStagingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.UpdateObjectRequest,
      com.aruna.api.storage.services.v2.ObjectServiceProto.UpdateObjectResponse> getUpdateObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateObject",
      requestType = com.aruna.api.storage.services.v2.ObjectServiceProto.UpdateObjectRequest.class,
      responseType = com.aruna.api.storage.services.v2.ObjectServiceProto.UpdateObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.UpdateObjectRequest,
      com.aruna.api.storage.services.v2.ObjectServiceProto.UpdateObjectResponse> getUpdateObjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.UpdateObjectRequest, com.aruna.api.storage.services.v2.ObjectServiceProto.UpdateObjectResponse> getUpdateObjectMethod;
    if ((getUpdateObjectMethod = ObjectServiceGrpc.getUpdateObjectMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getUpdateObjectMethod = ObjectServiceGrpc.getUpdateObjectMethod) == null) {
          ObjectServiceGrpc.getUpdateObjectMethod = getUpdateObjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ObjectServiceProto.UpdateObjectRequest, com.aruna.api.storage.services.v2.ObjectServiceProto.UpdateObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ObjectServiceProto.UpdateObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ObjectServiceProto.UpdateObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("UpdateObject"))
              .build();
        }
      }
    }
    return getUpdateObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.CloneObjectRequest,
      com.aruna.api.storage.services.v2.ObjectServiceProto.CloneObjectResponse> getCloneObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloneObject",
      requestType = com.aruna.api.storage.services.v2.ObjectServiceProto.CloneObjectRequest.class,
      responseType = com.aruna.api.storage.services.v2.ObjectServiceProto.CloneObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.CloneObjectRequest,
      com.aruna.api.storage.services.v2.ObjectServiceProto.CloneObjectResponse> getCloneObjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.CloneObjectRequest, com.aruna.api.storage.services.v2.ObjectServiceProto.CloneObjectResponse> getCloneObjectMethod;
    if ((getCloneObjectMethod = ObjectServiceGrpc.getCloneObjectMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getCloneObjectMethod = ObjectServiceGrpc.getCloneObjectMethod) == null) {
          ObjectServiceGrpc.getCloneObjectMethod = getCloneObjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ObjectServiceProto.CloneObjectRequest, com.aruna.api.storage.services.v2.ObjectServiceProto.CloneObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloneObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ObjectServiceProto.CloneObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ObjectServiceProto.CloneObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("CloneObject"))
              .build();
        }
      }
    }
    return getCloneObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.DeleteObjectRequest,
      com.aruna.api.storage.services.v2.ObjectServiceProto.DeleteObjectResponse> getDeleteObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteObject",
      requestType = com.aruna.api.storage.services.v2.ObjectServiceProto.DeleteObjectRequest.class,
      responseType = com.aruna.api.storage.services.v2.ObjectServiceProto.DeleteObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.DeleteObjectRequest,
      com.aruna.api.storage.services.v2.ObjectServiceProto.DeleteObjectResponse> getDeleteObjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.DeleteObjectRequest, com.aruna.api.storage.services.v2.ObjectServiceProto.DeleteObjectResponse> getDeleteObjectMethod;
    if ((getDeleteObjectMethod = ObjectServiceGrpc.getDeleteObjectMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getDeleteObjectMethod = ObjectServiceGrpc.getDeleteObjectMethod) == null) {
          ObjectServiceGrpc.getDeleteObjectMethod = getDeleteObjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ObjectServiceProto.DeleteObjectRequest, com.aruna.api.storage.services.v2.ObjectServiceProto.DeleteObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ObjectServiceProto.DeleteObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ObjectServiceProto.DeleteObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("DeleteObject"))
              .build();
        }
      }
    }
    return getDeleteObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectRequest,
      com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectResponse> getGetObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObject",
      requestType = com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectRequest.class,
      responseType = com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectRequest,
      com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectResponse> getGetObjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectRequest, com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectResponse> getGetObjectMethod;
    if ((getGetObjectMethod = ObjectServiceGrpc.getGetObjectMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getGetObjectMethod = ObjectServiceGrpc.getGetObjectMethod) == null) {
          ObjectServiceGrpc.getGetObjectMethod = getGetObjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectRequest, com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("GetObject"))
              .build();
        }
      }
    }
    return getGetObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectsRequest,
      com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectsResponse> getGetObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjects",
      requestType = com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectsRequest.class,
      responseType = com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectsRequest,
      com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectsResponse> getGetObjectsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectsRequest, com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectsResponse> getGetObjectsMethod;
    if ((getGetObjectsMethod = ObjectServiceGrpc.getGetObjectsMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getGetObjectsMethod = ObjectServiceGrpc.getGetObjectsMethod) == null) {
          ObjectServiceGrpc.getGetObjectsMethod = getGetObjectsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectsRequest, com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("GetObjects"))
              .build();
        }
      }
    }
    return getGetObjectsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ObjectServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObjectServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObjectServiceStub>() {
        @java.lang.Override
        public ObjectServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObjectServiceStub(channel, callOptions);
        }
      };
    return ObjectServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ObjectServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObjectServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObjectServiceBlockingStub>() {
        @java.lang.Override
        public ObjectServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObjectServiceBlockingStub(channel, callOptions);
        }
      };
    return ObjectServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ObjectServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObjectServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObjectServiceFutureStub>() {
        @java.lang.Override
        public ObjectServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObjectServiceFutureStub(channel, callOptions);
        }
      };
    return ObjectServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ObjectService
   * Contains all methods that get/create or update Objects and associated resources
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateObject
     * Status: BETA
     * This creates a new object
     * Initializing an object will put it in a staging area.
     * </pre>
     */
    default void createObject(com.aruna.api.storage.services.v2.ObjectServiceProto.CreateObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.CreateObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUploadURL
     * Status: BETA
     * This is a proxy method that will call the apropriate method at dataproxy level
     * This method will return a (multi-part) url that can be used to upload a
     * file to S3. Part is a optional query parameter that can be used to upload a
     * part of the file / multipart upload.
     * </pre>
     */
    default void getUploadURL(com.aruna.api.storage.services.v2.ObjectServiceProto.GetUploadURLRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.GetUploadURLResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUploadURLMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDownloadUrl
     * Status: BETA
     * 
     * This is a proxy method that will call the apropriate method at dataproxy level
     * will return a url that can be used to download a file from S3.
     * </pre>
     */
    default void getDownloadURL(com.aruna.api.storage.services.v2.ObjectServiceProto.GetDownloadURLRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.GetDownloadURLResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDownloadURLMethod(), responseObserver);
    }

    /**
     * <pre>
     * FinishObjectStaging
     * Status: BETA
     * This method completes the staging of an object.
     * </pre>
     */
    default void finishObjectStaging(com.aruna.api.storage.services.v2.ObjectServiceProto.FinishObjectStagingRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.FinishObjectStagingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFinishObjectStagingMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateObject
     * Status: BETA
     * Objects are immutable!
     * Updating an object will create a new revision for the object
     * This method will put the new revision in a staging area.
     * Staged objects will get a separate staging id and need to be finished
     * before they can be used.
     * </pre>
     */
    default void updateObject(com.aruna.api.storage.services.v2.ObjectServiceProto.UpdateObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.UpdateObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * CloneObject 
     * Status: BETA
     * This method clones an object and creates a copy in the same collection.
     * This copy has a new id and revision and will not receive any updates from
     * the original object.
     * </pre>
     */
    default void cloneObject(com.aruna.api.storage.services.v2.ObjectServiceProto.CloneObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.CloneObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloneObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteObject 
     * Status: BETA
     * Deletes the object with the complete revision history.
     * </pre>
     */
    default void deleteObject(com.aruna.api.storage.services.v2.ObjectServiceProto.DeleteObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.DeleteObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetObject 
     * Status: BETA
     * 
     * gets a specific Object by ID that is associated to the
     * current collection By default only the latest revision of an object will be
     * returned Specify a revision_number to select an older revision With the
     * optional with_url boolean a download link can automatically be requested
     * </pre>
     */
    default void getObject(com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetObjects
     * Status: BETA
     * Get multiple objects by ID at once
     * </pre>
     */
    default void getObjects(com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ObjectService.
   * <pre>
   * ObjectService
   * Contains all methods that get/create or update Objects and associated resources
   * </pre>
   */
  public static abstract class ObjectServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ObjectServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ObjectService.
   * <pre>
   * ObjectService
   * Contains all methods that get/create or update Objects and associated resources
   * </pre>
   */
  public static final class ObjectServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ObjectServiceStub> {
    private ObjectServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObjectServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateObject
     * Status: BETA
     * This creates a new object
     * Initializing an object will put it in a staging area.
     * </pre>
     */
    public void createObject(com.aruna.api.storage.services.v2.ObjectServiceProto.CreateObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.CreateObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUploadURL
     * Status: BETA
     * This is a proxy method that will call the apropriate method at dataproxy level
     * This method will return a (multi-part) url that can be used to upload a
     * file to S3. Part is a optional query parameter that can be used to upload a
     * part of the file / multipart upload.
     * </pre>
     */
    public void getUploadURL(com.aruna.api.storage.services.v2.ObjectServiceProto.GetUploadURLRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.GetUploadURLResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUploadURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDownloadUrl
     * Status: BETA
     * 
     * This is a proxy method that will call the apropriate method at dataproxy level
     * will return a url that can be used to download a file from S3.
     * </pre>
     */
    public void getDownloadURL(com.aruna.api.storage.services.v2.ObjectServiceProto.GetDownloadURLRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.GetDownloadURLResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDownloadURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FinishObjectStaging
     * Status: BETA
     * This method completes the staging of an object.
     * </pre>
     */
    public void finishObjectStaging(com.aruna.api.storage.services.v2.ObjectServiceProto.FinishObjectStagingRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.FinishObjectStagingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFinishObjectStagingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateObject
     * Status: BETA
     * Objects are immutable!
     * Updating an object will create a new revision for the object
     * This method will put the new revision in a staging area.
     * Staged objects will get a separate staging id and need to be finished
     * before they can be used.
     * </pre>
     */
    public void updateObject(com.aruna.api.storage.services.v2.ObjectServiceProto.UpdateObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.UpdateObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CloneObject 
     * Status: BETA
     * This method clones an object and creates a copy in the same collection.
     * This copy has a new id and revision and will not receive any updates from
     * the original object.
     * </pre>
     */
    public void cloneObject(com.aruna.api.storage.services.v2.ObjectServiceProto.CloneObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.CloneObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloneObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteObject 
     * Status: BETA
     * Deletes the object with the complete revision history.
     * </pre>
     */
    public void deleteObject(com.aruna.api.storage.services.v2.ObjectServiceProto.DeleteObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.DeleteObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetObject 
     * Status: BETA
     * 
     * gets a specific Object by ID that is associated to the
     * current collection By default only the latest revision of an object will be
     * returned Specify a revision_number to select an older revision With the
     * optional with_url boolean a download link can automatically be requested
     * </pre>
     */
    public void getObject(com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetObjects
     * Status: BETA
     * Get multiple objects by ID at once
     * </pre>
     */
    public void getObjects(com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ObjectService.
   * <pre>
   * ObjectService
   * Contains all methods that get/create or update Objects and associated resources
   * </pre>
   */
  public static final class ObjectServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ObjectServiceBlockingStub> {
    private ObjectServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObjectServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateObject
     * Status: BETA
     * This creates a new object
     * Initializing an object will put it in a staging area.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.ObjectServiceProto.CreateObjectResponse createObject(com.aruna.api.storage.services.v2.ObjectServiceProto.CreateObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUploadURL
     * Status: BETA
     * This is a proxy method that will call the apropriate method at dataproxy level
     * This method will return a (multi-part) url that can be used to upload a
     * file to S3. Part is a optional query parameter that can be used to upload a
     * part of the file / multipart upload.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.ObjectServiceProto.GetUploadURLResponse getUploadURL(com.aruna.api.storage.services.v2.ObjectServiceProto.GetUploadURLRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUploadURLMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDownloadUrl
     * Status: BETA
     * 
     * This is a proxy method that will call the apropriate method at dataproxy level
     * will return a url that can be used to download a file from S3.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.ObjectServiceProto.GetDownloadURLResponse getDownloadURL(com.aruna.api.storage.services.v2.ObjectServiceProto.GetDownloadURLRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDownloadURLMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FinishObjectStaging
     * Status: BETA
     * This method completes the staging of an object.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.ObjectServiceProto.FinishObjectStagingResponse finishObjectStaging(com.aruna.api.storage.services.v2.ObjectServiceProto.FinishObjectStagingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFinishObjectStagingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateObject
     * Status: BETA
     * Objects are immutable!
     * Updating an object will create a new revision for the object
     * This method will put the new revision in a staging area.
     * Staged objects will get a separate staging id and need to be finished
     * before they can be used.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.ObjectServiceProto.UpdateObjectResponse updateObject(com.aruna.api.storage.services.v2.ObjectServiceProto.UpdateObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CloneObject 
     * Status: BETA
     * This method clones an object and creates a copy in the same collection.
     * This copy has a new id and revision and will not receive any updates from
     * the original object.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.ObjectServiceProto.CloneObjectResponse cloneObject(com.aruna.api.storage.services.v2.ObjectServiceProto.CloneObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloneObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteObject 
     * Status: BETA
     * Deletes the object with the complete revision history.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.ObjectServiceProto.DeleteObjectResponse deleteObject(com.aruna.api.storage.services.v2.ObjectServiceProto.DeleteObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetObject 
     * Status: BETA
     * 
     * gets a specific Object by ID that is associated to the
     * current collection By default only the latest revision of an object will be
     * returned Specify a revision_number to select an older revision With the
     * optional with_url boolean a download link can automatically be requested
     * </pre>
     */
    public com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectResponse getObject(com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetObjects
     * Status: BETA
     * Get multiple objects by ID at once
     * </pre>
     */
    public com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectsResponse getObjects(com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ObjectService.
   * <pre>
   * ObjectService
   * Contains all methods that get/create or update Objects and associated resources
   * </pre>
   */
  public static final class ObjectServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ObjectServiceFutureStub> {
    private ObjectServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObjectServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateObject
     * Status: BETA
     * This creates a new object
     * Initializing an object will put it in a staging area.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ObjectServiceProto.CreateObjectResponse> createObject(
        com.aruna.api.storage.services.v2.ObjectServiceProto.CreateObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUploadURL
     * Status: BETA
     * This is a proxy method that will call the apropriate method at dataproxy level
     * This method will return a (multi-part) url that can be used to upload a
     * file to S3. Part is a optional query parameter that can be used to upload a
     * part of the file / multipart upload.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ObjectServiceProto.GetUploadURLResponse> getUploadURL(
        com.aruna.api.storage.services.v2.ObjectServiceProto.GetUploadURLRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUploadURLMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDownloadUrl
     * Status: BETA
     * 
     * This is a proxy method that will call the apropriate method at dataproxy level
     * will return a url that can be used to download a file from S3.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ObjectServiceProto.GetDownloadURLResponse> getDownloadURL(
        com.aruna.api.storage.services.v2.ObjectServiceProto.GetDownloadURLRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDownloadURLMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FinishObjectStaging
     * Status: BETA
     * This method completes the staging of an object.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ObjectServiceProto.FinishObjectStagingResponse> finishObjectStaging(
        com.aruna.api.storage.services.v2.ObjectServiceProto.FinishObjectStagingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFinishObjectStagingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateObject
     * Status: BETA
     * Objects are immutable!
     * Updating an object will create a new revision for the object
     * This method will put the new revision in a staging area.
     * Staged objects will get a separate staging id and need to be finished
     * before they can be used.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ObjectServiceProto.UpdateObjectResponse> updateObject(
        com.aruna.api.storage.services.v2.ObjectServiceProto.UpdateObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CloneObject 
     * Status: BETA
     * This method clones an object and creates a copy in the same collection.
     * This copy has a new id and revision and will not receive any updates from
     * the original object.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ObjectServiceProto.CloneObjectResponse> cloneObject(
        com.aruna.api.storage.services.v2.ObjectServiceProto.CloneObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloneObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteObject 
     * Status: BETA
     * Deletes the object with the complete revision history.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ObjectServiceProto.DeleteObjectResponse> deleteObject(
        com.aruna.api.storage.services.v2.ObjectServiceProto.DeleteObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetObject 
     * Status: BETA
     * 
     * gets a specific Object by ID that is associated to the
     * current collection By default only the latest revision of an object will be
     * returned Specify a revision_number to select an older revision With the
     * optional with_url boolean a download link can automatically be requested
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectResponse> getObject(
        com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetObjects
     * Status: BETA
     * Get multiple objects by ID at once
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectsResponse> getObjects(
        com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_OBJECT = 0;
  private static final int METHODID_GET_UPLOAD_URL = 1;
  private static final int METHODID_GET_DOWNLOAD_URL = 2;
  private static final int METHODID_FINISH_OBJECT_STAGING = 3;
  private static final int METHODID_UPDATE_OBJECT = 4;
  private static final int METHODID_CLONE_OBJECT = 5;
  private static final int METHODID_DELETE_OBJECT = 6;
  private static final int METHODID_GET_OBJECT = 7;
  private static final int METHODID_GET_OBJECTS = 8;

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
        case METHODID_CREATE_OBJECT:
          serviceImpl.createObject((com.aruna.api.storage.services.v2.ObjectServiceProto.CreateObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.CreateObjectResponse>) responseObserver);
          break;
        case METHODID_GET_UPLOAD_URL:
          serviceImpl.getUploadURL((com.aruna.api.storage.services.v2.ObjectServiceProto.GetUploadURLRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.GetUploadURLResponse>) responseObserver);
          break;
        case METHODID_GET_DOWNLOAD_URL:
          serviceImpl.getDownloadURL((com.aruna.api.storage.services.v2.ObjectServiceProto.GetDownloadURLRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.GetDownloadURLResponse>) responseObserver);
          break;
        case METHODID_FINISH_OBJECT_STAGING:
          serviceImpl.finishObjectStaging((com.aruna.api.storage.services.v2.ObjectServiceProto.FinishObjectStagingRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.FinishObjectStagingResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OBJECT:
          serviceImpl.updateObject((com.aruna.api.storage.services.v2.ObjectServiceProto.UpdateObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.UpdateObjectResponse>) responseObserver);
          break;
        case METHODID_CLONE_OBJECT:
          serviceImpl.cloneObject((com.aruna.api.storage.services.v2.ObjectServiceProto.CloneObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.CloneObjectResponse>) responseObserver);
          break;
        case METHODID_DELETE_OBJECT:
          serviceImpl.deleteObject((com.aruna.api.storage.services.v2.ObjectServiceProto.DeleteObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.DeleteObjectResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT:
          serviceImpl.getObject((com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECTS:
          serviceImpl.getObjects((com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectsResponse>) responseObserver);
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
          getCreateObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ObjectServiceProto.CreateObjectRequest,
              com.aruna.api.storage.services.v2.ObjectServiceProto.CreateObjectResponse>(
                service, METHODID_CREATE_OBJECT)))
        .addMethod(
          getGetUploadURLMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ObjectServiceProto.GetUploadURLRequest,
              com.aruna.api.storage.services.v2.ObjectServiceProto.GetUploadURLResponse>(
                service, METHODID_GET_UPLOAD_URL)))
        .addMethod(
          getGetDownloadURLMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ObjectServiceProto.GetDownloadURLRequest,
              com.aruna.api.storage.services.v2.ObjectServiceProto.GetDownloadURLResponse>(
                service, METHODID_GET_DOWNLOAD_URL)))
        .addMethod(
          getFinishObjectStagingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ObjectServiceProto.FinishObjectStagingRequest,
              com.aruna.api.storage.services.v2.ObjectServiceProto.FinishObjectStagingResponse>(
                service, METHODID_FINISH_OBJECT_STAGING)))
        .addMethod(
          getUpdateObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ObjectServiceProto.UpdateObjectRequest,
              com.aruna.api.storage.services.v2.ObjectServiceProto.UpdateObjectResponse>(
                service, METHODID_UPDATE_OBJECT)))
        .addMethod(
          getCloneObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ObjectServiceProto.CloneObjectRequest,
              com.aruna.api.storage.services.v2.ObjectServiceProto.CloneObjectResponse>(
                service, METHODID_CLONE_OBJECT)))
        .addMethod(
          getDeleteObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ObjectServiceProto.DeleteObjectRequest,
              com.aruna.api.storage.services.v2.ObjectServiceProto.DeleteObjectResponse>(
                service, METHODID_DELETE_OBJECT)))
        .addMethod(
          getGetObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectRequest,
              com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectResponse>(
                service, METHODID_GET_OBJECT)))
        .addMethod(
          getGetObjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectsRequest,
              com.aruna.api.storage.services.v2.ObjectServiceProto.GetObjectsResponse>(
                service, METHODID_GET_OBJECTS)))
        .build();
  }

  private static abstract class ObjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ObjectServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.storage.services.v2.ObjectServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ObjectService");
    }
  }

  private static final class ObjectServiceFileDescriptorSupplier
      extends ObjectServiceBaseDescriptorSupplier {
    ObjectServiceFileDescriptorSupplier() {}
  }

  private static final class ObjectServiceMethodDescriptorSupplier
      extends ObjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ObjectServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ObjectServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ObjectServiceFileDescriptorSupplier())
              .addMethod(getCreateObjectMethod())
              .addMethod(getGetUploadURLMethod())
              .addMethod(getGetDownloadURLMethod())
              .addMethod(getFinishObjectStagingMethod())
              .addMethod(getUpdateObjectMethod())
              .addMethod(getCloneObjectMethod())
              .addMethod(getDeleteObjectMethod())
              .addMethod(getGetObjectMethod())
              .addMethod(getGetObjectsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
