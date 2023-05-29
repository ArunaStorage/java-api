package com.aruna.api.storage.services.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ObjectService
 * Contains all methods that get/create or update Objects and associated resources
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/storage/services/v1/object_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ObjectServiceGrpc {

  private ObjectServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.storage.services.v1.ObjectService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.InitializeNewObjectRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.InitializeNewObjectResponse> getInitializeNewObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitializeNewObject",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.InitializeNewObjectRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.InitializeNewObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.InitializeNewObjectRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.InitializeNewObjectResponse> getInitializeNewObjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.InitializeNewObjectRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.InitializeNewObjectResponse> getInitializeNewObjectMethod;
    if ((getInitializeNewObjectMethod = ObjectServiceGrpc.getInitializeNewObjectMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getInitializeNewObjectMethod = ObjectServiceGrpc.getInitializeNewObjectMethod) == null) {
          ObjectServiceGrpc.getInitializeNewObjectMethod = getInitializeNewObjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.InitializeNewObjectRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.InitializeNewObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitializeNewObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.InitializeNewObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.InitializeNewObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("InitializeNewObject"))
              .build();
        }
      }
    }
    return getInitializeNewObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetUploadURLRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetUploadURLResponse> getGetUploadURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUploadURL",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetUploadURLRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetUploadURLResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetUploadURLRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetUploadURLResponse> getGetUploadURLMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetUploadURLRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetUploadURLResponse> getGetUploadURLMethod;
    if ((getGetUploadURLMethod = ObjectServiceGrpc.getGetUploadURLMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getGetUploadURLMethod = ObjectServiceGrpc.getGetUploadURLMethod) == null) {
          ObjectServiceGrpc.getGetUploadURLMethod = getGetUploadURLMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.GetUploadURLRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetUploadURLResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUploadURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetUploadURLRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetUploadURLResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("GetUploadURL"))
              .build();
        }
      }
    }
    return getGetUploadURLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadURLRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadURLResponse> getGetDownloadURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDownloadURL",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadURLRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadURLResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadURLRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadURLResponse> getGetDownloadURLMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadURLRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadURLResponse> getGetDownloadURLMethod;
    if ((getGetDownloadURLMethod = ObjectServiceGrpc.getGetDownloadURLMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getGetDownloadURLMethod = ObjectServiceGrpc.getGetDownloadURLMethod) == null) {
          ObjectServiceGrpc.getGetDownloadURLMethod = getGetDownloadURLMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadURLRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadURLResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDownloadURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadURLRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadURLResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("GetDownloadURL"))
              .build();
        }
      }
    }
    return getGetDownloadURLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadLinksBatchRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadLinksBatchResponse> getGetDownloadLinksBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDownloadLinksBatch",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadLinksBatchRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadLinksBatchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadLinksBatchRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadLinksBatchResponse> getGetDownloadLinksBatchMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadLinksBatchRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadLinksBatchResponse> getGetDownloadLinksBatchMethod;
    if ((getGetDownloadLinksBatchMethod = ObjectServiceGrpc.getGetDownloadLinksBatchMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getGetDownloadLinksBatchMethod = ObjectServiceGrpc.getGetDownloadLinksBatchMethod) == null) {
          ObjectServiceGrpc.getGetDownloadLinksBatchMethod = getGetDownloadLinksBatchMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadLinksBatchRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadLinksBatchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDownloadLinksBatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadLinksBatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadLinksBatchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("GetDownloadLinksBatch"))
              .build();
        }
      }
    }
    return getGetDownloadLinksBatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.CreateDownloadLinksStreamRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.CreateDownloadLinksStreamResponse> getCreateDownloadLinksStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDownloadLinksStream",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.CreateDownloadLinksStreamRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.CreateDownloadLinksStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.CreateDownloadLinksStreamRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.CreateDownloadLinksStreamResponse> getCreateDownloadLinksStreamMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.CreateDownloadLinksStreamRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.CreateDownloadLinksStreamResponse> getCreateDownloadLinksStreamMethod;
    if ((getCreateDownloadLinksStreamMethod = ObjectServiceGrpc.getCreateDownloadLinksStreamMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getCreateDownloadLinksStreamMethod = ObjectServiceGrpc.getCreateDownloadLinksStreamMethod) == null) {
          ObjectServiceGrpc.getCreateDownloadLinksStreamMethod = getCreateDownloadLinksStreamMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.CreateDownloadLinksStreamRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.CreateDownloadLinksStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDownloadLinksStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.CreateDownloadLinksStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.CreateDownloadLinksStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("CreateDownloadLinksStream"))
              .build();
        }
      }
    }
    return getCreateDownloadLinksStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.FinishObjectStagingRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.FinishObjectStagingResponse> getFinishObjectStagingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FinishObjectStaging",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.FinishObjectStagingRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.FinishObjectStagingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.FinishObjectStagingRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.FinishObjectStagingResponse> getFinishObjectStagingMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.FinishObjectStagingRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.FinishObjectStagingResponse> getFinishObjectStagingMethod;
    if ((getFinishObjectStagingMethod = ObjectServiceGrpc.getFinishObjectStagingMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getFinishObjectStagingMethod = ObjectServiceGrpc.getFinishObjectStagingMethod) == null) {
          ObjectServiceGrpc.getFinishObjectStagingMethod = getFinishObjectStagingMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.FinishObjectStagingRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.FinishObjectStagingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FinishObjectStaging"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.FinishObjectStagingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.FinishObjectStagingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("FinishObjectStaging"))
              .build();
        }
      }
    }
    return getFinishObjectStagingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.UpdateObjectRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.UpdateObjectResponse> getUpdateObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateObject",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.UpdateObjectRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.UpdateObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.UpdateObjectRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.UpdateObjectResponse> getUpdateObjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.UpdateObjectRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.UpdateObjectResponse> getUpdateObjectMethod;
    if ((getUpdateObjectMethod = ObjectServiceGrpc.getUpdateObjectMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getUpdateObjectMethod = ObjectServiceGrpc.getUpdateObjectMethod) == null) {
          ObjectServiceGrpc.getUpdateObjectMethod = getUpdateObjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.UpdateObjectRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.UpdateObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.UpdateObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.UpdateObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("UpdateObject"))
              .build();
        }
      }
    }
    return getUpdateObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectReferenceRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectReferenceResponse> getCreateObjectReferenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateObjectReference",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectReferenceRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectReferenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectReferenceRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectReferenceResponse> getCreateObjectReferenceMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectReferenceRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectReferenceResponse> getCreateObjectReferenceMethod;
    if ((getCreateObjectReferenceMethod = ObjectServiceGrpc.getCreateObjectReferenceMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getCreateObjectReferenceMethod = ObjectServiceGrpc.getCreateObjectReferenceMethod) == null) {
          ObjectServiceGrpc.getCreateObjectReferenceMethod = getCreateObjectReferenceMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectReferenceRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectReferenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateObjectReference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectReferenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectReferenceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("CreateObjectReference"))
              .build();
        }
      }
    }
    return getCreateObjectReferenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.CloneObjectRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.CloneObjectResponse> getCloneObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloneObject",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.CloneObjectRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.CloneObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.CloneObjectRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.CloneObjectResponse> getCloneObjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.CloneObjectRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.CloneObjectResponse> getCloneObjectMethod;
    if ((getCloneObjectMethod = ObjectServiceGrpc.getCloneObjectMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getCloneObjectMethod = ObjectServiceGrpc.getCloneObjectMethod) == null) {
          ObjectServiceGrpc.getCloneObjectMethod = getCloneObjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.CloneObjectRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.CloneObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloneObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.CloneObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.CloneObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("CloneObject"))
              .build();
        }
      }
    }
    return getCloneObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectResponse> getDeleteObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteObject",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectResponse> getDeleteObjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectResponse> getDeleteObjectMethod;
    if ((getDeleteObjectMethod = ObjectServiceGrpc.getDeleteObjectMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getDeleteObjectMethod = ObjectServiceGrpc.getDeleteObjectMethod) == null) {
          ObjectServiceGrpc.getDeleteObjectMethod = getDeleteObjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("DeleteObject"))
              .build();
        }
      }
    }
    return getDeleteObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectsRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectsResponse> getDeleteObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteObjects",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectsRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectsRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectsResponse> getDeleteObjectsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectsRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectsResponse> getDeleteObjectsMethod;
    if ((getDeleteObjectsMethod = ObjectServiceGrpc.getDeleteObjectsMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getDeleteObjectsMethod = ObjectServiceGrpc.getDeleteObjectsMethod) == null) {
          ObjectServiceGrpc.getDeleteObjectsMethod = getDeleteObjectsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectsRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("DeleteObjects"))
              .build();
        }
      }
    }
    return getDeleteObjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectByIDRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectByIDResponse> getGetObjectByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectByID",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectByIDRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectByIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectByIDRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectByIDResponse> getGetObjectByIDMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectByIDRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectByIDResponse> getGetObjectByIDMethod;
    if ((getGetObjectByIDMethod = ObjectServiceGrpc.getGetObjectByIDMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getGetObjectByIDMethod = ObjectServiceGrpc.getGetObjectByIDMethod) == null) {
          ObjectServiceGrpc.getGetObjectByIDMethod = getGetObjectByIDMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectByIDRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectByIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjectByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectByIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("GetObjectByID"))
              .build();
        }
      }
    }
    return getGetObjectByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsResponse> getGetObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjects",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsResponse> getGetObjectsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsResponse> getGetObjectsMethod;
    if ((getGetObjectsMethod = ObjectServiceGrpc.getGetObjectsMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getGetObjectsMethod = ObjectServiceGrpc.getGetObjectsMethod) == null) {
          ObjectServiceGrpc.getGetObjectsMethod = getGetObjectsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("GetObjects"))
              .build();
        }
      }
    }
    return getGetObjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectRevisionsRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectRevisionsResponse> getGetObjectRevisionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectRevisions",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectRevisionsRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectRevisionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectRevisionsRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectRevisionsResponse> getGetObjectRevisionsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectRevisionsRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectRevisionsResponse> getGetObjectRevisionsMethod;
    if ((getGetObjectRevisionsMethod = ObjectServiceGrpc.getGetObjectRevisionsMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getGetObjectRevisionsMethod = ObjectServiceGrpc.getGetObjectRevisionsMethod) == null) {
          ObjectServiceGrpc.getGetObjectRevisionsMethod = getGetObjectRevisionsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectRevisionsRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectRevisionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjectRevisions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectRevisionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectRevisionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("GetObjectRevisions"))
              .build();
        }
      }
    }
    return getGetObjectRevisionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetLatestObjectRevisionRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetLatestObjectRevisionResponse> getGetLatestObjectRevisionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLatestObjectRevision",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetLatestObjectRevisionRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetLatestObjectRevisionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetLatestObjectRevisionRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetLatestObjectRevisionResponse> getGetLatestObjectRevisionMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetLatestObjectRevisionRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetLatestObjectRevisionResponse> getGetLatestObjectRevisionMethod;
    if ((getGetLatestObjectRevisionMethod = ObjectServiceGrpc.getGetLatestObjectRevisionMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getGetLatestObjectRevisionMethod = ObjectServiceGrpc.getGetLatestObjectRevisionMethod) == null) {
          ObjectServiceGrpc.getGetLatestObjectRevisionMethod = getGetLatestObjectRevisionMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.GetLatestObjectRevisionRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetLatestObjectRevisionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLatestObjectRevision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetLatestObjectRevisionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetLatestObjectRevisionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("GetLatestObjectRevision"))
              .build();
        }
      }
    }
    return getGetLatestObjectRevisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectEndpointsRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectEndpointsResponse> getGetObjectEndpointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectEndpoints",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectEndpointsRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectEndpointsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectEndpointsRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectEndpointsResponse> getGetObjectEndpointsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectEndpointsRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectEndpointsResponse> getGetObjectEndpointsMethod;
    if ((getGetObjectEndpointsMethod = ObjectServiceGrpc.getGetObjectEndpointsMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getGetObjectEndpointsMethod = ObjectServiceGrpc.getGetObjectEndpointsMethod) == null) {
          ObjectServiceGrpc.getGetObjectEndpointsMethod = getGetObjectEndpointsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectEndpointsRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectEndpointsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjectEndpoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectEndpointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectEndpointsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("GetObjectEndpoints"))
              .build();
        }
      }
    }
    return getGetObjectEndpointsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.AddLabelsToObjectRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.AddLabelsToObjectResponse> getAddLabelsToObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddLabelsToObject",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.AddLabelsToObjectRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.AddLabelsToObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.AddLabelsToObjectRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.AddLabelsToObjectResponse> getAddLabelsToObjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.AddLabelsToObjectRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.AddLabelsToObjectResponse> getAddLabelsToObjectMethod;
    if ((getAddLabelsToObjectMethod = ObjectServiceGrpc.getAddLabelsToObjectMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getAddLabelsToObjectMethod = ObjectServiceGrpc.getAddLabelsToObjectMethod) == null) {
          ObjectServiceGrpc.getAddLabelsToObjectMethod = getAddLabelsToObjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.AddLabelsToObjectRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.AddLabelsToObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddLabelsToObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.AddLabelsToObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.AddLabelsToObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("AddLabelsToObject"))
              .build();
        }
      }
    }
    return getAddLabelsToObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.SetHooksOfObjectRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.SetHooksOfObjectResponse> getSetHooksOfObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetHooksOfObject",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.SetHooksOfObjectRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.SetHooksOfObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.SetHooksOfObjectRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.SetHooksOfObjectResponse> getSetHooksOfObjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.SetHooksOfObjectRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.SetHooksOfObjectResponse> getSetHooksOfObjectMethod;
    if ((getSetHooksOfObjectMethod = ObjectServiceGrpc.getSetHooksOfObjectMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getSetHooksOfObjectMethod = ObjectServiceGrpc.getSetHooksOfObjectMethod) == null) {
          ObjectServiceGrpc.getSetHooksOfObjectMethod = getSetHooksOfObjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.SetHooksOfObjectRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.SetHooksOfObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetHooksOfObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.SetHooksOfObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.SetHooksOfObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("SetHooksOfObject"))
              .build();
        }
      }
    }
    return getSetHooksOfObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetReferencesRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetReferencesResponse> getGetReferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReferences",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetReferencesRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetReferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetReferencesRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetReferencesResponse> getGetReferencesMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetReferencesRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetReferencesResponse> getGetReferencesMethod;
    if ((getGetReferencesMethod = ObjectServiceGrpc.getGetReferencesMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getGetReferencesMethod = ObjectServiceGrpc.getGetReferencesMethod) == null) {
          ObjectServiceGrpc.getGetReferencesMethod = getGetReferencesMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.GetReferencesRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetReferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetReferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetReferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("GetReferences"))
              .build();
        }
      }
    }
    return getGetReferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathResponse> getGetObjectPathMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectPath",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathResponse> getGetObjectPathMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathResponse> getGetObjectPathMethod;
    if ((getGetObjectPathMethod = ObjectServiceGrpc.getGetObjectPathMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getGetObjectPathMethod = ObjectServiceGrpc.getGetObjectPathMethod) == null) {
          ObjectServiceGrpc.getGetObjectPathMethod = getGetObjectPathMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjectPath"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("GetObjectPath"))
              .build();
        }
      }
    }
    return getGetObjectPathMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathsRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathsResponse> getGetObjectPathsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectPaths",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathsRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathsRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathsResponse> getGetObjectPathsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathsRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathsResponse> getGetObjectPathsMethod;
    if ((getGetObjectPathsMethod = ObjectServiceGrpc.getGetObjectPathsMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getGetObjectPathsMethod = ObjectServiceGrpc.getGetObjectPathsMethod) == null) {
          ObjectServiceGrpc.getGetObjectPathsMethod = getGetObjectPathsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathsRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjectPaths"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("GetObjectPaths"))
              .build();
        }
      }
    }
    return getGetObjectPathsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectPathRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectPathResponse> getCreateObjectPathMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateObjectPath",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectPathRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectPathResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectPathRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectPathResponse> getCreateObjectPathMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectPathRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectPathResponse> getCreateObjectPathMethod;
    if ((getCreateObjectPathMethod = ObjectServiceGrpc.getCreateObjectPathMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getCreateObjectPathMethod = ObjectServiceGrpc.getCreateObjectPathMethod) == null) {
          ObjectServiceGrpc.getCreateObjectPathMethod = getCreateObjectPathMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectPathRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectPathResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateObjectPath"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectPathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectPathResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("CreateObjectPath"))
              .build();
        }
      }
    }
    return getCreateObjectPathMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.SetObjectPathVisibilityRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.SetObjectPathVisibilityResponse> getSetObjectPathVisibilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetObjectPathVisibility",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.SetObjectPathVisibilityRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.SetObjectPathVisibilityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.SetObjectPathVisibilityRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.SetObjectPathVisibilityResponse> getSetObjectPathVisibilityMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.SetObjectPathVisibilityRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.SetObjectPathVisibilityResponse> getSetObjectPathVisibilityMethod;
    if ((getSetObjectPathVisibilityMethod = ObjectServiceGrpc.getSetObjectPathVisibilityMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getSetObjectPathVisibilityMethod = ObjectServiceGrpc.getSetObjectPathVisibilityMethod) == null) {
          ObjectServiceGrpc.getSetObjectPathVisibilityMethod = getSetObjectPathVisibilityMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.SetObjectPathVisibilityRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.SetObjectPathVisibilityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetObjectPathVisibility"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.SetObjectPathVisibilityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.SetObjectPathVisibilityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("SetObjectPathVisibility"))
              .build();
        }
      }
    }
    return getSetObjectPathVisibilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsByPathRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsByPathResponse> getGetObjectsByPathMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectsByPath",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsByPathRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsByPathResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsByPathRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsByPathResponse> getGetObjectsByPathMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsByPathRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsByPathResponse> getGetObjectsByPathMethod;
    if ((getGetObjectsByPathMethod = ObjectServiceGrpc.getGetObjectsByPathMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getGetObjectsByPathMethod = ObjectServiceGrpc.getGetObjectsByPathMethod) == null) {
          ObjectServiceGrpc.getGetObjectsByPathMethod = getGetObjectsByPathMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsByPathRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsByPathResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjectsByPath"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsByPathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsByPathResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("GetObjectsByPath"))
              .build();
        }
      }
    }
    return getGetObjectsByPathMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetProjectCollectionIdsByPathRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetProjectCollectionIdsByPathResponse> getGetProjectCollectionIdsByPathMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProjectCollectionIdsByPath",
      requestType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetProjectCollectionIdsByPathRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectServiceProto.GetProjectCollectionIdsByPathResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetProjectCollectionIdsByPathRequest,
      com.aruna.api.storage.services.v1.ObjectServiceProto.GetProjectCollectionIdsByPathResponse> getGetProjectCollectionIdsByPathMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectServiceProto.GetProjectCollectionIdsByPathRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetProjectCollectionIdsByPathResponse> getGetProjectCollectionIdsByPathMethod;
    if ((getGetProjectCollectionIdsByPathMethod = ObjectServiceGrpc.getGetProjectCollectionIdsByPathMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getGetProjectCollectionIdsByPathMethod = ObjectServiceGrpc.getGetProjectCollectionIdsByPathMethod) == null) {
          ObjectServiceGrpc.getGetProjectCollectionIdsByPathMethod = getGetProjectCollectionIdsByPathMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectServiceProto.GetProjectCollectionIdsByPathRequest, com.aruna.api.storage.services.v1.ObjectServiceProto.GetProjectCollectionIdsByPathResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProjectCollectionIdsByPath"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetProjectCollectionIdsByPathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectServiceProto.GetProjectCollectionIdsByPathResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("GetProjectCollectionIdsByPath"))
              .build();
        }
      }
    }
    return getGetProjectCollectionIdsByPathMethod;
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
     * InitializeNewObject
     * Status: STABLE
     * This initializes a new object
     * Initializing an object will put it in a staging area.
     * Staged objects will get a separate staging id and need to be finished
     * before they can be used.
     * </pre>
     */
    default void initializeNewObject(com.aruna.api.storage.services.v1.ObjectServiceProto.InitializeNewObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.InitializeNewObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitializeNewObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUploadURL
     * Status: STABLE
     * This method will return a (multi-part) url that can be used to upload a
     * file to S3. Part is a optional query parameter that can be used to upload a
     * part of the file / multipart upload.
     * </pre>
     */
    default void getUploadURL(com.aruna.api.storage.services.v1.ObjectServiceProto.GetUploadURLRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetUploadURLResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUploadURLMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDownloadUrl
     * Status: STABLE
     * 
     * This method will return a url that can be used to download a file from S3.
     * </pre>
     */
    default void getDownloadURL(com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadURLRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadURLResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDownloadURLMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDownloadLinksBatch
     * Status: BETA
     * This method can be used to get download urls for multiple objects.
     * The order of the returned urls will be the same as the order of the object
     * ids in the request.
     * </pre>
     */
    default void getDownloadLinksBatch(com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadLinksBatchRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadLinksBatchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDownloadLinksBatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateDownloadLinksStream
     * Status: BETA
     * Creates a stream of objects and presigned links based on the provided query
     * This can be used retrieve a large number of Objects as a stream that would
     * otherwise cause issues with the connection
     * </pre>
     */
    default void createDownloadLinksStream(com.aruna.api.storage.services.v1.ObjectServiceProto.CreateDownloadLinksStreamRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.CreateDownloadLinksStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDownloadLinksStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * FinishObjectStaging
     * Status: STABLE
     * This method completes the staging of an object.
     * </pre>
     */
    default void finishObjectStaging(com.aruna.api.storage.services.v1.ObjectServiceProto.FinishObjectStagingRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.FinishObjectStagingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFinishObjectStagingMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateObject
     * Status: STABLE
     * Objects are immutable!
     * Updating an object will create a new revision for the object
     * This method will put the new revision in a staging area.
     * Staged objects will get a separate staging id and need to be finished
     * before they can be used.
     * </pre>
     */
    default void updateObject(com.aruna.api.storage.services.v1.ObjectServiceProto.UpdateObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.UpdateObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateObjectReference
     * Status: STABLE
     * Creates a new reference of this object in another collection
     * </pre>
     */
    default void createObjectReference(com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectReferenceRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectReferenceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateObjectReferenceMethod(), responseObserver);
    }

    /**
     * <pre>
     * CloneObject 
     * Status: STABLE
     * This method clones an object and creates a copy in the same collection.
     * This copy has a new id and revision and will not receive any updates from
     * the original object.
     * </pre>
     */
    default void cloneObject(com.aruna.api.storage.services.v1.ObjectServiceProto.CloneObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.CloneObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloneObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteObject 
     * Status: STABLE
     * Deletes the object with the complete revision history.
     * </pre>
     */
    default void deleteObject(com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteObjects
     * Status: STABLE
     * Deletes multiple objects at once.
     * </pre>
     */
    default void deleteObjects(com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteObjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetObjectByID 
     * Status: STABLE
     * 
     * gets a specific Object by ID that is associated to the
     * current collection By default only the latest revision of an object will be
     * returned Specify a revision_number to select an older revision With the
     * optional with_url boolean a download link can automatically be requested
     * </pre>
     */
    default void getObjectByID(com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectByIDRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectByIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetObjects
     * Status: STABLE
     * GetObjects returns a (paginated) list of objects in a specific collection
     * By default only the latest revisions of all objects will be shown
     * This behaviour can be changed with the include_history flag
     * With the optional with_url boolean a download link can automatically be
     * requested for each Object This request contains a LabelOrIDQuery message,
     * this is either a list of request ObjectIDs or a query filtered by Labels
     * </pre>
     */
    default void getObjects(com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetObjectRevisions
     * Status: STABLE
     * This returns the full list of revisions of a specified object
     * With the optional with_url boolean a download link can automatically be
     * requested for each Object This is by default a paginated request
     * </pre>
     */
    default void getObjectRevisions(com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectRevisionsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectRevisionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectRevisionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetLatestObjectRevision
     * Status: STABLE
     * This returns the latest revision of a specific object
     * The returned `latest` object will have a different id if the current
     * object is not the latest revision
     * </pre>
     */
    default void getLatestObjectRevision(com.aruna.api.storage.services.v1.ObjectServiceProto.GetLatestObjectRevisionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetLatestObjectRevisionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLatestObjectRevisionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetObjectEndpoints
     * Status: BETA
     * This returns a list of endpoints
     * One endpoint will be the "default" endpoint
     * </pre>
     */
    default void getObjectEndpoints(com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectEndpointsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectEndpointsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectEndpointsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddLabelsToObject 
     * Status: STABLE
     * This is a specific request to add new label(s)
     * to an existing object, in contrast to UpdateObject
     * this will not create a new object in the staging area
     * Instead it will directly add the specified label(s) to the object
     * </pre>
     */
    default void addLabelsToObject(com.aruna.api.storage.services.v1.ObjectServiceProto.AddLabelsToObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.AddLabelsToObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddLabelsToObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetHooksOfObject
     * Status: BETA
     * 
     * This is a specific request to update the complete list
     * of hooks for a specific object. This will not update the object
     * and create a new id, instead it will overwrite all hooks of the existing
     * object.
     * </pre>
     */
    default void setHooksOfObject(com.aruna.api.storage.services.v1.ObjectServiceProto.SetHooksOfObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.SetHooksOfObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetHooksOfObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetReferences
     * Status: STABLE
     * Get a list of references for this object (optional) including all revisions
     * </pre>
     */
    default void getReferences(com.aruna.api.storage.services.v1.ObjectServiceProto.GetReferencesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetReferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetObjectPath
     * Status: BETA
     * Get all object_paths for this object in a specific collection
     * !! Paths are collection specific !!
     * </pre>
     */
    default void getObjectPath(com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectPathMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetObjectPaths
     * Status: BETA
     * Get all object_paths for a specific collection
     * !! Paths are collection specific !!
     * </pre>
     */
    default void getObjectPaths(com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectPathsMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateObjectPath
     * Status: BETA
     * Create collection_specific object_paths for an object
     * !! Paths are collection specific !!
     * </pre>
     */
    default void createObjectPath(com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectPathRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectPathResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateObjectPathMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetObjectPathVisibility
     * Status: BETA
     * Updates the visibility setting for an object_path (hide/unhide)
     * !! Paths are collection specific !!
     * </pre>
     */
    default void setObjectPathVisibility(com.aruna.api.storage.services.v1.ObjectServiceProto.SetObjectPathVisibilityRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.SetObjectPathVisibilityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetObjectPathVisibilityMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetObjectsByPath
     * Status: BETA
     * Gets a specific object by object_path
     * !! Paths are collection specific !!
     * </pre>
     */
    default void getObjectsByPath(com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsByPathRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsByPathResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectsByPathMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetObjectsByPath
     * Status: BETA
     * Gets a specific object by object_path
     * !! Paths are collection specific !!
     * </pre>
     */
    default void getProjectCollectionIdsByPath(com.aruna.api.storage.services.v1.ObjectServiceProto.GetProjectCollectionIdsByPathRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetProjectCollectionIdsByPathResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectCollectionIdsByPathMethod(), responseObserver);
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
     * InitializeNewObject
     * Status: STABLE
     * This initializes a new object
     * Initializing an object will put it in a staging area.
     * Staged objects will get a separate staging id and need to be finished
     * before they can be used.
     * </pre>
     */
    public void initializeNewObject(com.aruna.api.storage.services.v1.ObjectServiceProto.InitializeNewObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.InitializeNewObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitializeNewObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUploadURL
     * Status: STABLE
     * This method will return a (multi-part) url that can be used to upload a
     * file to S3. Part is a optional query parameter that can be used to upload a
     * part of the file / multipart upload.
     * </pre>
     */
    public void getUploadURL(com.aruna.api.storage.services.v1.ObjectServiceProto.GetUploadURLRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetUploadURLResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUploadURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDownloadUrl
     * Status: STABLE
     * 
     * This method will return a url that can be used to download a file from S3.
     * </pre>
     */
    public void getDownloadURL(com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadURLRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadURLResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDownloadURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDownloadLinksBatch
     * Status: BETA
     * This method can be used to get download urls for multiple objects.
     * The order of the returned urls will be the same as the order of the object
     * ids in the request.
     * </pre>
     */
    public void getDownloadLinksBatch(com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadLinksBatchRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadLinksBatchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDownloadLinksBatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateDownloadLinksStream
     * Status: BETA
     * Creates a stream of objects and presigned links based on the provided query
     * This can be used retrieve a large number of Objects as a stream that would
     * otherwise cause issues with the connection
     * </pre>
     */
    public void createDownloadLinksStream(com.aruna.api.storage.services.v1.ObjectServiceProto.CreateDownloadLinksStreamRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.CreateDownloadLinksStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getCreateDownloadLinksStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FinishObjectStaging
     * Status: STABLE
     * This method completes the staging of an object.
     * </pre>
     */
    public void finishObjectStaging(com.aruna.api.storage.services.v1.ObjectServiceProto.FinishObjectStagingRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.FinishObjectStagingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFinishObjectStagingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateObject
     * Status: STABLE
     * Objects are immutable!
     * Updating an object will create a new revision for the object
     * This method will put the new revision in a staging area.
     * Staged objects will get a separate staging id and need to be finished
     * before they can be used.
     * </pre>
     */
    public void updateObject(com.aruna.api.storage.services.v1.ObjectServiceProto.UpdateObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.UpdateObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateObjectReference
     * Status: STABLE
     * Creates a new reference of this object in another collection
     * </pre>
     */
    public void createObjectReference(com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectReferenceRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectReferenceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateObjectReferenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CloneObject 
     * Status: STABLE
     * This method clones an object and creates a copy in the same collection.
     * This copy has a new id and revision and will not receive any updates from
     * the original object.
     * </pre>
     */
    public void cloneObject(com.aruna.api.storage.services.v1.ObjectServiceProto.CloneObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.CloneObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloneObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteObject 
     * Status: STABLE
     * Deletes the object with the complete revision history.
     * </pre>
     */
    public void deleteObject(com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteObjects
     * Status: STABLE
     * Deletes multiple objects at once.
     * </pre>
     */
    public void deleteObjects(com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetObjectByID 
     * Status: STABLE
     * 
     * gets a specific Object by ID that is associated to the
     * current collection By default only the latest revision of an object will be
     * returned Specify a revision_number to select an older revision With the
     * optional with_url boolean a download link can automatically be requested
     * </pre>
     */
    public void getObjectByID(com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectByIDRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectByIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetObjects
     * Status: STABLE
     * GetObjects returns a (paginated) list of objects in a specific collection
     * By default only the latest revisions of all objects will be shown
     * This behaviour can be changed with the include_history flag
     * With the optional with_url boolean a download link can automatically be
     * requested for each Object This request contains a LabelOrIDQuery message,
     * this is either a list of request ObjectIDs or a query filtered by Labels
     * </pre>
     */
    public void getObjects(com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetObjectRevisions
     * Status: STABLE
     * This returns the full list of revisions of a specified object
     * With the optional with_url boolean a download link can automatically be
     * requested for each Object This is by default a paginated request
     * </pre>
     */
    public void getObjectRevisions(com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectRevisionsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectRevisionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectRevisionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetLatestObjectRevision
     * Status: STABLE
     * This returns the latest revision of a specific object
     * The returned `latest` object will have a different id if the current
     * object is not the latest revision
     * </pre>
     */
    public void getLatestObjectRevision(com.aruna.api.storage.services.v1.ObjectServiceProto.GetLatestObjectRevisionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetLatestObjectRevisionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLatestObjectRevisionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetObjectEndpoints
     * Status: BETA
     * This returns a list of endpoints
     * One endpoint will be the "default" endpoint
     * </pre>
     */
    public void getObjectEndpoints(com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectEndpointsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectEndpointsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectEndpointsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddLabelsToObject 
     * Status: STABLE
     * This is a specific request to add new label(s)
     * to an existing object, in contrast to UpdateObject
     * this will not create a new object in the staging area
     * Instead it will directly add the specified label(s) to the object
     * </pre>
     */
    public void addLabelsToObject(com.aruna.api.storage.services.v1.ObjectServiceProto.AddLabelsToObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.AddLabelsToObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddLabelsToObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetHooksOfObject
     * Status: BETA
     * 
     * This is a specific request to update the complete list
     * of hooks for a specific object. This will not update the object
     * and create a new id, instead it will overwrite all hooks of the existing
     * object.
     * </pre>
     */
    public void setHooksOfObject(com.aruna.api.storage.services.v1.ObjectServiceProto.SetHooksOfObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.SetHooksOfObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetHooksOfObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetReferences
     * Status: STABLE
     * Get a list of references for this object (optional) including all revisions
     * </pre>
     */
    public void getReferences(com.aruna.api.storage.services.v1.ObjectServiceProto.GetReferencesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetReferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetObjectPath
     * Status: BETA
     * Get all object_paths for this object in a specific collection
     * !! Paths are collection specific !!
     * </pre>
     */
    public void getObjectPath(com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectPathMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetObjectPaths
     * Status: BETA
     * Get all object_paths for a specific collection
     * !! Paths are collection specific !!
     * </pre>
     */
    public void getObjectPaths(com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectPathsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateObjectPath
     * Status: BETA
     * Create collection_specific object_paths for an object
     * !! Paths are collection specific !!
     * </pre>
     */
    public void createObjectPath(com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectPathRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectPathResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateObjectPathMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetObjectPathVisibility
     * Status: BETA
     * Updates the visibility setting for an object_path (hide/unhide)
     * !! Paths are collection specific !!
     * </pre>
     */
    public void setObjectPathVisibility(com.aruna.api.storage.services.v1.ObjectServiceProto.SetObjectPathVisibilityRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.SetObjectPathVisibilityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetObjectPathVisibilityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetObjectsByPath
     * Status: BETA
     * Gets a specific object by object_path
     * !! Paths are collection specific !!
     * </pre>
     */
    public void getObjectsByPath(com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsByPathRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsByPathResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectsByPathMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetObjectsByPath
     * Status: BETA
     * Gets a specific object by object_path
     * !! Paths are collection specific !!
     * </pre>
     */
    public void getProjectCollectionIdsByPath(com.aruna.api.storage.services.v1.ObjectServiceProto.GetProjectCollectionIdsByPathRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetProjectCollectionIdsByPathResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProjectCollectionIdsByPathMethod(), getCallOptions()), request, responseObserver);
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
     * InitializeNewObject
     * Status: STABLE
     * This initializes a new object
     * Initializing an object will put it in a staging area.
     * Staged objects will get a separate staging id and need to be finished
     * before they can be used.
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectServiceProto.InitializeNewObjectResponse initializeNewObject(com.aruna.api.storage.services.v1.ObjectServiceProto.InitializeNewObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitializeNewObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUploadURL
     * Status: STABLE
     * This method will return a (multi-part) url that can be used to upload a
     * file to S3. Part is a optional query parameter that can be used to upload a
     * part of the file / multipart upload.
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectServiceProto.GetUploadURLResponse getUploadURL(com.aruna.api.storage.services.v1.ObjectServiceProto.GetUploadURLRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUploadURLMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDownloadUrl
     * Status: STABLE
     * 
     * This method will return a url that can be used to download a file from S3.
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadURLResponse getDownloadURL(com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadURLRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDownloadURLMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDownloadLinksBatch
     * Status: BETA
     * This method can be used to get download urls for multiple objects.
     * The order of the returned urls will be the same as the order of the object
     * ids in the request.
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadLinksBatchResponse getDownloadLinksBatch(com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadLinksBatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDownloadLinksBatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateDownloadLinksStream
     * Status: BETA
     * Creates a stream of objects and presigned links based on the provided query
     * This can be used retrieve a large number of Objects as a stream that would
     * otherwise cause issues with the connection
     * </pre>
     */
    public java.util.Iterator<com.aruna.api.storage.services.v1.ObjectServiceProto.CreateDownloadLinksStreamResponse> createDownloadLinksStream(
        com.aruna.api.storage.services.v1.ObjectServiceProto.CreateDownloadLinksStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getCreateDownloadLinksStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FinishObjectStaging
     * Status: STABLE
     * This method completes the staging of an object.
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectServiceProto.FinishObjectStagingResponse finishObjectStaging(com.aruna.api.storage.services.v1.ObjectServiceProto.FinishObjectStagingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFinishObjectStagingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateObject
     * Status: STABLE
     * Objects are immutable!
     * Updating an object will create a new revision for the object
     * This method will put the new revision in a staging area.
     * Staged objects will get a separate staging id and need to be finished
     * before they can be used.
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectServiceProto.UpdateObjectResponse updateObject(com.aruna.api.storage.services.v1.ObjectServiceProto.UpdateObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateObjectReference
     * Status: STABLE
     * Creates a new reference of this object in another collection
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectReferenceResponse createObjectReference(com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectReferenceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateObjectReferenceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CloneObject 
     * Status: STABLE
     * This method clones an object and creates a copy in the same collection.
     * This copy has a new id and revision and will not receive any updates from
     * the original object.
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectServiceProto.CloneObjectResponse cloneObject(com.aruna.api.storage.services.v1.ObjectServiceProto.CloneObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloneObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteObject 
     * Status: STABLE
     * Deletes the object with the complete revision history.
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectResponse deleteObject(com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteObjects
     * Status: STABLE
     * Deletes multiple objects at once.
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectsResponse deleteObjects(com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteObjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetObjectByID 
     * Status: STABLE
     * 
     * gets a specific Object by ID that is associated to the
     * current collection By default only the latest revision of an object will be
     * returned Specify a revision_number to select an older revision With the
     * optional with_url boolean a download link can automatically be requested
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectByIDResponse getObjectByID(com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectByIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetObjects
     * Status: STABLE
     * GetObjects returns a (paginated) list of objects in a specific collection
     * By default only the latest revisions of all objects will be shown
     * This behaviour can be changed with the include_history flag
     * With the optional with_url boolean a download link can automatically be
     * requested for each Object This request contains a LabelOrIDQuery message,
     * this is either a list of request ObjectIDs or a query filtered by Labels
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsResponse getObjects(com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetObjectRevisions
     * Status: STABLE
     * This returns the full list of revisions of a specified object
     * With the optional with_url boolean a download link can automatically be
     * requested for each Object This is by default a paginated request
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectRevisionsResponse getObjectRevisions(com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectRevisionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectRevisionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetLatestObjectRevision
     * Status: STABLE
     * This returns the latest revision of a specific object
     * The returned `latest` object will have a different id if the current
     * object is not the latest revision
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectServiceProto.GetLatestObjectRevisionResponse getLatestObjectRevision(com.aruna.api.storage.services.v1.ObjectServiceProto.GetLatestObjectRevisionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLatestObjectRevisionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetObjectEndpoints
     * Status: BETA
     * This returns a list of endpoints
     * One endpoint will be the "default" endpoint
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectEndpointsResponse getObjectEndpoints(com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectEndpointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectEndpointsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddLabelsToObject 
     * Status: STABLE
     * This is a specific request to add new label(s)
     * to an existing object, in contrast to UpdateObject
     * this will not create a new object in the staging area
     * Instead it will directly add the specified label(s) to the object
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectServiceProto.AddLabelsToObjectResponse addLabelsToObject(com.aruna.api.storage.services.v1.ObjectServiceProto.AddLabelsToObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddLabelsToObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetHooksOfObject
     * Status: BETA
     * 
     * This is a specific request to update the complete list
     * of hooks for a specific object. This will not update the object
     * and create a new id, instead it will overwrite all hooks of the existing
     * object.
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectServiceProto.SetHooksOfObjectResponse setHooksOfObject(com.aruna.api.storage.services.v1.ObjectServiceProto.SetHooksOfObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetHooksOfObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetReferences
     * Status: STABLE
     * Get a list of references for this object (optional) including all revisions
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectServiceProto.GetReferencesResponse getReferences(com.aruna.api.storage.services.v1.ObjectServiceProto.GetReferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetObjectPath
     * Status: BETA
     * Get all object_paths for this object in a specific collection
     * !! Paths are collection specific !!
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathResponse getObjectPath(com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectPathMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetObjectPaths
     * Status: BETA
     * Get all object_paths for a specific collection
     * !! Paths are collection specific !!
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathsResponse getObjectPaths(com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectPathsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateObjectPath
     * Status: BETA
     * Create collection_specific object_paths for an object
     * !! Paths are collection specific !!
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectPathResponse createObjectPath(com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectPathRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateObjectPathMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetObjectPathVisibility
     * Status: BETA
     * Updates the visibility setting for an object_path (hide/unhide)
     * !! Paths are collection specific !!
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectServiceProto.SetObjectPathVisibilityResponse setObjectPathVisibility(com.aruna.api.storage.services.v1.ObjectServiceProto.SetObjectPathVisibilityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetObjectPathVisibilityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetObjectsByPath
     * Status: BETA
     * Gets a specific object by object_path
     * !! Paths are collection specific !!
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsByPathResponse getObjectsByPath(com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsByPathRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectsByPathMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetObjectsByPath
     * Status: BETA
     * Gets a specific object by object_path
     * !! Paths are collection specific !!
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectServiceProto.GetProjectCollectionIdsByPathResponse getProjectCollectionIdsByPath(com.aruna.api.storage.services.v1.ObjectServiceProto.GetProjectCollectionIdsByPathRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProjectCollectionIdsByPathMethod(), getCallOptions(), request);
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
     * InitializeNewObject
     * Status: STABLE
     * This initializes a new object
     * Initializing an object will put it in a staging area.
     * Staged objects will get a separate staging id and need to be finished
     * before they can be used.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectServiceProto.InitializeNewObjectResponse> initializeNewObject(
        com.aruna.api.storage.services.v1.ObjectServiceProto.InitializeNewObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitializeNewObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUploadURL
     * Status: STABLE
     * This method will return a (multi-part) url that can be used to upload a
     * file to S3. Part is a optional query parameter that can be used to upload a
     * part of the file / multipart upload.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectServiceProto.GetUploadURLResponse> getUploadURL(
        com.aruna.api.storage.services.v1.ObjectServiceProto.GetUploadURLRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUploadURLMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDownloadUrl
     * Status: STABLE
     * 
     * This method will return a url that can be used to download a file from S3.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadURLResponse> getDownloadURL(
        com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadURLRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDownloadURLMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDownloadLinksBatch
     * Status: BETA
     * This method can be used to get download urls for multiple objects.
     * The order of the returned urls will be the same as the order of the object
     * ids in the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadLinksBatchResponse> getDownloadLinksBatch(
        com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadLinksBatchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDownloadLinksBatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FinishObjectStaging
     * Status: STABLE
     * This method completes the staging of an object.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectServiceProto.FinishObjectStagingResponse> finishObjectStaging(
        com.aruna.api.storage.services.v1.ObjectServiceProto.FinishObjectStagingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFinishObjectStagingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateObject
     * Status: STABLE
     * Objects are immutable!
     * Updating an object will create a new revision for the object
     * This method will put the new revision in a staging area.
     * Staged objects will get a separate staging id and need to be finished
     * before they can be used.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectServiceProto.UpdateObjectResponse> updateObject(
        com.aruna.api.storage.services.v1.ObjectServiceProto.UpdateObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateObjectReference
     * Status: STABLE
     * Creates a new reference of this object in another collection
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectReferenceResponse> createObjectReference(
        com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectReferenceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateObjectReferenceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CloneObject 
     * Status: STABLE
     * This method clones an object and creates a copy in the same collection.
     * This copy has a new id and revision and will not receive any updates from
     * the original object.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectServiceProto.CloneObjectResponse> cloneObject(
        com.aruna.api.storage.services.v1.ObjectServiceProto.CloneObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloneObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteObject 
     * Status: STABLE
     * Deletes the object with the complete revision history.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectResponse> deleteObject(
        com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteObjects
     * Status: STABLE
     * Deletes multiple objects at once.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectsResponse> deleteObjects(
        com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteObjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetObjectByID 
     * Status: STABLE
     * 
     * gets a specific Object by ID that is associated to the
     * current collection By default only the latest revision of an object will be
     * returned Specify a revision_number to select an older revision With the
     * optional with_url boolean a download link can automatically be requested
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectByIDResponse> getObjectByID(
        com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectByIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetObjects
     * Status: STABLE
     * GetObjects returns a (paginated) list of objects in a specific collection
     * By default only the latest revisions of all objects will be shown
     * This behaviour can be changed with the include_history flag
     * With the optional with_url boolean a download link can automatically be
     * requested for each Object This request contains a LabelOrIDQuery message,
     * this is either a list of request ObjectIDs or a query filtered by Labels
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsResponse> getObjects(
        com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetObjectRevisions
     * Status: STABLE
     * This returns the full list of revisions of a specified object
     * With the optional with_url boolean a download link can automatically be
     * requested for each Object This is by default a paginated request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectRevisionsResponse> getObjectRevisions(
        com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectRevisionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectRevisionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetLatestObjectRevision
     * Status: STABLE
     * This returns the latest revision of a specific object
     * The returned `latest` object will have a different id if the current
     * object is not the latest revision
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectServiceProto.GetLatestObjectRevisionResponse> getLatestObjectRevision(
        com.aruna.api.storage.services.v1.ObjectServiceProto.GetLatestObjectRevisionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLatestObjectRevisionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetObjectEndpoints
     * Status: BETA
     * This returns a list of endpoints
     * One endpoint will be the "default" endpoint
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectEndpointsResponse> getObjectEndpoints(
        com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectEndpointsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectEndpointsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddLabelsToObject 
     * Status: STABLE
     * This is a specific request to add new label(s)
     * to an existing object, in contrast to UpdateObject
     * this will not create a new object in the staging area
     * Instead it will directly add the specified label(s) to the object
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectServiceProto.AddLabelsToObjectResponse> addLabelsToObject(
        com.aruna.api.storage.services.v1.ObjectServiceProto.AddLabelsToObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddLabelsToObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetHooksOfObject
     * Status: BETA
     * 
     * This is a specific request to update the complete list
     * of hooks for a specific object. This will not update the object
     * and create a new id, instead it will overwrite all hooks of the existing
     * object.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectServiceProto.SetHooksOfObjectResponse> setHooksOfObject(
        com.aruna.api.storage.services.v1.ObjectServiceProto.SetHooksOfObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetHooksOfObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetReferences
     * Status: STABLE
     * Get a list of references for this object (optional) including all revisions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectServiceProto.GetReferencesResponse> getReferences(
        com.aruna.api.storage.services.v1.ObjectServiceProto.GetReferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetObjectPath
     * Status: BETA
     * Get all object_paths for this object in a specific collection
     * !! Paths are collection specific !!
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathResponse> getObjectPath(
        com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectPathMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetObjectPaths
     * Status: BETA
     * Get all object_paths for a specific collection
     * !! Paths are collection specific !!
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathsResponse> getObjectPaths(
        com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectPathsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateObjectPath
     * Status: BETA
     * Create collection_specific object_paths for an object
     * !! Paths are collection specific !!
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectPathResponse> createObjectPath(
        com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectPathRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateObjectPathMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetObjectPathVisibility
     * Status: BETA
     * Updates the visibility setting for an object_path (hide/unhide)
     * !! Paths are collection specific !!
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectServiceProto.SetObjectPathVisibilityResponse> setObjectPathVisibility(
        com.aruna.api.storage.services.v1.ObjectServiceProto.SetObjectPathVisibilityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetObjectPathVisibilityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetObjectsByPath
     * Status: BETA
     * Gets a specific object by object_path
     * !! Paths are collection specific !!
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsByPathResponse> getObjectsByPath(
        com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsByPathRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectsByPathMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetObjectsByPath
     * Status: BETA
     * Gets a specific object by object_path
     * !! Paths are collection specific !!
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectServiceProto.GetProjectCollectionIdsByPathResponse> getProjectCollectionIdsByPath(
        com.aruna.api.storage.services.v1.ObjectServiceProto.GetProjectCollectionIdsByPathRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProjectCollectionIdsByPathMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INITIALIZE_NEW_OBJECT = 0;
  private static final int METHODID_GET_UPLOAD_URL = 1;
  private static final int METHODID_GET_DOWNLOAD_URL = 2;
  private static final int METHODID_GET_DOWNLOAD_LINKS_BATCH = 3;
  private static final int METHODID_CREATE_DOWNLOAD_LINKS_STREAM = 4;
  private static final int METHODID_FINISH_OBJECT_STAGING = 5;
  private static final int METHODID_UPDATE_OBJECT = 6;
  private static final int METHODID_CREATE_OBJECT_REFERENCE = 7;
  private static final int METHODID_CLONE_OBJECT = 8;
  private static final int METHODID_DELETE_OBJECT = 9;
  private static final int METHODID_DELETE_OBJECTS = 10;
  private static final int METHODID_GET_OBJECT_BY_ID = 11;
  private static final int METHODID_GET_OBJECTS = 12;
  private static final int METHODID_GET_OBJECT_REVISIONS = 13;
  private static final int METHODID_GET_LATEST_OBJECT_REVISION = 14;
  private static final int METHODID_GET_OBJECT_ENDPOINTS = 15;
  private static final int METHODID_ADD_LABELS_TO_OBJECT = 16;
  private static final int METHODID_SET_HOOKS_OF_OBJECT = 17;
  private static final int METHODID_GET_REFERENCES = 18;
  private static final int METHODID_GET_OBJECT_PATH = 19;
  private static final int METHODID_GET_OBJECT_PATHS = 20;
  private static final int METHODID_CREATE_OBJECT_PATH = 21;
  private static final int METHODID_SET_OBJECT_PATH_VISIBILITY = 22;
  private static final int METHODID_GET_OBJECTS_BY_PATH = 23;
  private static final int METHODID_GET_PROJECT_COLLECTION_IDS_BY_PATH = 24;

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
        case METHODID_INITIALIZE_NEW_OBJECT:
          serviceImpl.initializeNewObject((com.aruna.api.storage.services.v1.ObjectServiceProto.InitializeNewObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.InitializeNewObjectResponse>) responseObserver);
          break;
        case METHODID_GET_UPLOAD_URL:
          serviceImpl.getUploadURL((com.aruna.api.storage.services.v1.ObjectServiceProto.GetUploadURLRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetUploadURLResponse>) responseObserver);
          break;
        case METHODID_GET_DOWNLOAD_URL:
          serviceImpl.getDownloadURL((com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadURLRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadURLResponse>) responseObserver);
          break;
        case METHODID_GET_DOWNLOAD_LINKS_BATCH:
          serviceImpl.getDownloadLinksBatch((com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadLinksBatchRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadLinksBatchResponse>) responseObserver);
          break;
        case METHODID_CREATE_DOWNLOAD_LINKS_STREAM:
          serviceImpl.createDownloadLinksStream((com.aruna.api.storage.services.v1.ObjectServiceProto.CreateDownloadLinksStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.CreateDownloadLinksStreamResponse>) responseObserver);
          break;
        case METHODID_FINISH_OBJECT_STAGING:
          serviceImpl.finishObjectStaging((com.aruna.api.storage.services.v1.ObjectServiceProto.FinishObjectStagingRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.FinishObjectStagingResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OBJECT:
          serviceImpl.updateObject((com.aruna.api.storage.services.v1.ObjectServiceProto.UpdateObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.UpdateObjectResponse>) responseObserver);
          break;
        case METHODID_CREATE_OBJECT_REFERENCE:
          serviceImpl.createObjectReference((com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectReferenceRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectReferenceResponse>) responseObserver);
          break;
        case METHODID_CLONE_OBJECT:
          serviceImpl.cloneObject((com.aruna.api.storage.services.v1.ObjectServiceProto.CloneObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.CloneObjectResponse>) responseObserver);
          break;
        case METHODID_DELETE_OBJECT:
          serviceImpl.deleteObject((com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectResponse>) responseObserver);
          break;
        case METHODID_DELETE_OBJECTS:
          serviceImpl.deleteObjects((com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectsResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT_BY_ID:
          serviceImpl.getObjectByID((com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectByIDRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectByIDResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECTS:
          serviceImpl.getObjects((com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT_REVISIONS:
          serviceImpl.getObjectRevisions((com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectRevisionsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectRevisionsResponse>) responseObserver);
          break;
        case METHODID_GET_LATEST_OBJECT_REVISION:
          serviceImpl.getLatestObjectRevision((com.aruna.api.storage.services.v1.ObjectServiceProto.GetLatestObjectRevisionRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetLatestObjectRevisionResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT_ENDPOINTS:
          serviceImpl.getObjectEndpoints((com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectEndpointsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectEndpointsResponse>) responseObserver);
          break;
        case METHODID_ADD_LABELS_TO_OBJECT:
          serviceImpl.addLabelsToObject((com.aruna.api.storage.services.v1.ObjectServiceProto.AddLabelsToObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.AddLabelsToObjectResponse>) responseObserver);
          break;
        case METHODID_SET_HOOKS_OF_OBJECT:
          serviceImpl.setHooksOfObject((com.aruna.api.storage.services.v1.ObjectServiceProto.SetHooksOfObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.SetHooksOfObjectResponse>) responseObserver);
          break;
        case METHODID_GET_REFERENCES:
          serviceImpl.getReferences((com.aruna.api.storage.services.v1.ObjectServiceProto.GetReferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetReferencesResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT_PATH:
          serviceImpl.getObjectPath((com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT_PATHS:
          serviceImpl.getObjectPaths((com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathsResponse>) responseObserver);
          break;
        case METHODID_CREATE_OBJECT_PATH:
          serviceImpl.createObjectPath((com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectPathRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectPathResponse>) responseObserver);
          break;
        case METHODID_SET_OBJECT_PATH_VISIBILITY:
          serviceImpl.setObjectPathVisibility((com.aruna.api.storage.services.v1.ObjectServiceProto.SetObjectPathVisibilityRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.SetObjectPathVisibilityResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECTS_BY_PATH:
          serviceImpl.getObjectsByPath((com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsByPathRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsByPathResponse>) responseObserver);
          break;
        case METHODID_GET_PROJECT_COLLECTION_IDS_BY_PATH:
          serviceImpl.getProjectCollectionIdsByPath((com.aruna.api.storage.services.v1.ObjectServiceProto.GetProjectCollectionIdsByPathRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectServiceProto.GetProjectCollectionIdsByPathResponse>) responseObserver);
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
          getInitializeNewObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.InitializeNewObjectRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.InitializeNewObjectResponse>(
                service, METHODID_INITIALIZE_NEW_OBJECT)))
        .addMethod(
          getGetUploadURLMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetUploadURLRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetUploadURLResponse>(
                service, METHODID_GET_UPLOAD_URL)))
        .addMethod(
          getGetDownloadURLMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadURLRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadURLResponse>(
                service, METHODID_GET_DOWNLOAD_URL)))
        .addMethod(
          getGetDownloadLinksBatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadLinksBatchRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetDownloadLinksBatchResponse>(
                service, METHODID_GET_DOWNLOAD_LINKS_BATCH)))
        .addMethod(
          getCreateDownloadLinksStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.CreateDownloadLinksStreamRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.CreateDownloadLinksStreamResponse>(
                service, METHODID_CREATE_DOWNLOAD_LINKS_STREAM)))
        .addMethod(
          getFinishObjectStagingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.FinishObjectStagingRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.FinishObjectStagingResponse>(
                service, METHODID_FINISH_OBJECT_STAGING)))
        .addMethod(
          getUpdateObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.UpdateObjectRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.UpdateObjectResponse>(
                service, METHODID_UPDATE_OBJECT)))
        .addMethod(
          getCreateObjectReferenceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectReferenceRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectReferenceResponse>(
                service, METHODID_CREATE_OBJECT_REFERENCE)))
        .addMethod(
          getCloneObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.CloneObjectRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.CloneObjectResponse>(
                service, METHODID_CLONE_OBJECT)))
        .addMethod(
          getDeleteObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectResponse>(
                service, METHODID_DELETE_OBJECT)))
        .addMethod(
          getDeleteObjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectsRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.DeleteObjectsResponse>(
                service, METHODID_DELETE_OBJECTS)))
        .addMethod(
          getGetObjectByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectByIDRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectByIDResponse>(
                service, METHODID_GET_OBJECT_BY_ID)))
        .addMethod(
          getGetObjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsResponse>(
                service, METHODID_GET_OBJECTS)))
        .addMethod(
          getGetObjectRevisionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectRevisionsRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectRevisionsResponse>(
                service, METHODID_GET_OBJECT_REVISIONS)))
        .addMethod(
          getGetLatestObjectRevisionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetLatestObjectRevisionRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetLatestObjectRevisionResponse>(
                service, METHODID_GET_LATEST_OBJECT_REVISION)))
        .addMethod(
          getGetObjectEndpointsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectEndpointsRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectEndpointsResponse>(
                service, METHODID_GET_OBJECT_ENDPOINTS)))
        .addMethod(
          getAddLabelsToObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.AddLabelsToObjectRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.AddLabelsToObjectResponse>(
                service, METHODID_ADD_LABELS_TO_OBJECT)))
        .addMethod(
          getSetHooksOfObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.SetHooksOfObjectRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.SetHooksOfObjectResponse>(
                service, METHODID_SET_HOOKS_OF_OBJECT)))
        .addMethod(
          getGetReferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetReferencesRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetReferencesResponse>(
                service, METHODID_GET_REFERENCES)))
        .addMethod(
          getGetObjectPathMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathResponse>(
                service, METHODID_GET_OBJECT_PATH)))
        .addMethod(
          getGetObjectPathsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathsRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectPathsResponse>(
                service, METHODID_GET_OBJECT_PATHS)))
        .addMethod(
          getCreateObjectPathMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectPathRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.CreateObjectPathResponse>(
                service, METHODID_CREATE_OBJECT_PATH)))
        .addMethod(
          getSetObjectPathVisibilityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.SetObjectPathVisibilityRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.SetObjectPathVisibilityResponse>(
                service, METHODID_SET_OBJECT_PATH_VISIBILITY)))
        .addMethod(
          getGetObjectsByPathMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsByPathRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetObjectsByPathResponse>(
                service, METHODID_GET_OBJECTS_BY_PATH)))
        .addMethod(
          getGetProjectCollectionIdsByPathMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetProjectCollectionIdsByPathRequest,
              com.aruna.api.storage.services.v1.ObjectServiceProto.GetProjectCollectionIdsByPathResponse>(
                service, METHODID_GET_PROJECT_COLLECTION_IDS_BY_PATH)))
        .build();
  }

  private static abstract class ObjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ObjectServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.storage.services.v1.ObjectServiceProto.getDescriptor();
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
              .addMethod(getInitializeNewObjectMethod())
              .addMethod(getGetUploadURLMethod())
              .addMethod(getGetDownloadURLMethod())
              .addMethod(getGetDownloadLinksBatchMethod())
              .addMethod(getCreateDownloadLinksStreamMethod())
              .addMethod(getFinishObjectStagingMethod())
              .addMethod(getUpdateObjectMethod())
              .addMethod(getCreateObjectReferenceMethod())
              .addMethod(getCloneObjectMethod())
              .addMethod(getDeleteObjectMethod())
              .addMethod(getDeleteObjectsMethod())
              .addMethod(getGetObjectByIDMethod())
              .addMethod(getGetObjectsMethod())
              .addMethod(getGetObjectRevisionsMethod())
              .addMethod(getGetLatestObjectRevisionMethod())
              .addMethod(getGetObjectEndpointsMethod())
              .addMethod(getAddLabelsToObjectMethod())
              .addMethod(getSetHooksOfObjectMethod())
              .addMethod(getGetReferencesMethod())
              .addMethod(getGetObjectPathMethod())
              .addMethod(getGetObjectPathsMethod())
              .addMethod(getCreateObjectPathMethod())
              .addMethod(getSetObjectPathVisibilityMethod())
              .addMethod(getGetObjectsByPathMethod())
              .addMethod(getGetProjectCollectionIdsByPathMethod())
              .build();
        }
      }
    }
    return result;
  }
}
