package com.aruna.api.storage.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * CollectionService
 * Status: BETA
 * Contains all methods that get/create or update Collection and associated resources
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: aruna/api/storage/services/v2/collection_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CollectionServiceGrpc {

  private CollectionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "aruna.api.storage.services.v2.CollectionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateCollectionRequest,
      com.aruna.api.storage.services.v2.CreateCollectionResponse> getCreateCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCollection",
      requestType = com.aruna.api.storage.services.v2.CreateCollectionRequest.class,
      responseType = com.aruna.api.storage.services.v2.CreateCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateCollectionRequest,
      com.aruna.api.storage.services.v2.CreateCollectionResponse> getCreateCollectionMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateCollectionRequest, com.aruna.api.storage.services.v2.CreateCollectionResponse> getCreateCollectionMethod;
    if ((getCreateCollectionMethod = CollectionServiceGrpc.getCreateCollectionMethod) == null) {
      synchronized (CollectionServiceGrpc.class) {
        if ((getCreateCollectionMethod = CollectionServiceGrpc.getCreateCollectionMethod) == null) {
          CollectionServiceGrpc.getCreateCollectionMethod = getCreateCollectionMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.CreateCollectionRequest, com.aruna.api.storage.services.v2.CreateCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateCollectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CollectionServiceMethodDescriptorSupplier("CreateCollection"))
              .build();
        }
      }
    }
    return getCreateCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetCollectionRequest,
      com.aruna.api.storage.services.v2.GetCollectionResponse> getGetCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCollection",
      requestType = com.aruna.api.storage.services.v2.GetCollectionRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetCollectionRequest,
      com.aruna.api.storage.services.v2.GetCollectionResponse> getGetCollectionMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetCollectionRequest, com.aruna.api.storage.services.v2.GetCollectionResponse> getGetCollectionMethod;
    if ((getGetCollectionMethod = CollectionServiceGrpc.getGetCollectionMethod) == null) {
      synchronized (CollectionServiceGrpc.class) {
        if ((getGetCollectionMethod = CollectionServiceGrpc.getGetCollectionMethod) == null) {
          CollectionServiceGrpc.getGetCollectionMethod = getGetCollectionMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetCollectionRequest, com.aruna.api.storage.services.v2.GetCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetCollectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CollectionServiceMethodDescriptorSupplier("GetCollection"))
              .build();
        }
      }
    }
    return getGetCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetCollectionsRequest,
      com.aruna.api.storage.services.v2.GetCollectionsResponse> getGetCollectionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCollections",
      requestType = com.aruna.api.storage.services.v2.GetCollectionsRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetCollectionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetCollectionsRequest,
      com.aruna.api.storage.services.v2.GetCollectionsResponse> getGetCollectionsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetCollectionsRequest, com.aruna.api.storage.services.v2.GetCollectionsResponse> getGetCollectionsMethod;
    if ((getGetCollectionsMethod = CollectionServiceGrpc.getGetCollectionsMethod) == null) {
      synchronized (CollectionServiceGrpc.class) {
        if ((getGetCollectionsMethod = CollectionServiceGrpc.getGetCollectionsMethod) == null) {
          CollectionServiceGrpc.getGetCollectionsMethod = getGetCollectionsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetCollectionsRequest, com.aruna.api.storage.services.v2.GetCollectionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCollections"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetCollectionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetCollectionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CollectionServiceMethodDescriptorSupplier("GetCollections"))
              .build();
        }
      }
    }
    return getGetCollectionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteCollectionRequest,
      com.aruna.api.storage.services.v2.DeleteCollectionResponse> getDeleteCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCollection",
      requestType = com.aruna.api.storage.services.v2.DeleteCollectionRequest.class,
      responseType = com.aruna.api.storage.services.v2.DeleteCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteCollectionRequest,
      com.aruna.api.storage.services.v2.DeleteCollectionResponse> getDeleteCollectionMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteCollectionRequest, com.aruna.api.storage.services.v2.DeleteCollectionResponse> getDeleteCollectionMethod;
    if ((getDeleteCollectionMethod = CollectionServiceGrpc.getDeleteCollectionMethod) == null) {
      synchronized (CollectionServiceGrpc.class) {
        if ((getDeleteCollectionMethod = CollectionServiceGrpc.getDeleteCollectionMethod) == null) {
          CollectionServiceGrpc.getDeleteCollectionMethod = getDeleteCollectionMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DeleteCollectionRequest, com.aruna.api.storage.services.v2.DeleteCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteCollectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CollectionServiceMethodDescriptorSupplier("DeleteCollection"))
              .build();
        }
      }
    }
    return getDeleteCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateCollectionNameRequest,
      com.aruna.api.storage.services.v2.UpdateCollectionNameResponse> getUpdateCollectionNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCollectionName",
      requestType = com.aruna.api.storage.services.v2.UpdateCollectionNameRequest.class,
      responseType = com.aruna.api.storage.services.v2.UpdateCollectionNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateCollectionNameRequest,
      com.aruna.api.storage.services.v2.UpdateCollectionNameResponse> getUpdateCollectionNameMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateCollectionNameRequest, com.aruna.api.storage.services.v2.UpdateCollectionNameResponse> getUpdateCollectionNameMethod;
    if ((getUpdateCollectionNameMethod = CollectionServiceGrpc.getUpdateCollectionNameMethod) == null) {
      synchronized (CollectionServiceGrpc.class) {
        if ((getUpdateCollectionNameMethod = CollectionServiceGrpc.getUpdateCollectionNameMethod) == null) {
          CollectionServiceGrpc.getUpdateCollectionNameMethod = getUpdateCollectionNameMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.UpdateCollectionNameRequest, com.aruna.api.storage.services.v2.UpdateCollectionNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCollectionName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateCollectionNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateCollectionNameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CollectionServiceMethodDescriptorSupplier("UpdateCollectionName"))
              .build();
        }
      }
    }
    return getUpdateCollectionNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateCollectionDescriptionRequest,
      com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse> getUpdateCollectionDescriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCollectionDescription",
      requestType = com.aruna.api.storage.services.v2.UpdateCollectionDescriptionRequest.class,
      responseType = com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateCollectionDescriptionRequest,
      com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse> getUpdateCollectionDescriptionMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateCollectionDescriptionRequest, com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse> getUpdateCollectionDescriptionMethod;
    if ((getUpdateCollectionDescriptionMethod = CollectionServiceGrpc.getUpdateCollectionDescriptionMethod) == null) {
      synchronized (CollectionServiceGrpc.class) {
        if ((getUpdateCollectionDescriptionMethod = CollectionServiceGrpc.getUpdateCollectionDescriptionMethod) == null) {
          CollectionServiceGrpc.getUpdateCollectionDescriptionMethod = getUpdateCollectionDescriptionMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.UpdateCollectionDescriptionRequest, com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCollectionDescription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateCollectionDescriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CollectionServiceMethodDescriptorSupplier("UpdateCollectionDescription"))
              .build();
        }
      }
    }
    return getUpdateCollectionDescriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateCollectionKeyValuesRequest,
      com.aruna.api.storage.services.v2.UpdateCollectionKeyValuesResponse> getUpdateCollectionKeyValuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCollectionKeyValues",
      requestType = com.aruna.api.storage.services.v2.UpdateCollectionKeyValuesRequest.class,
      responseType = com.aruna.api.storage.services.v2.UpdateCollectionKeyValuesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateCollectionKeyValuesRequest,
      com.aruna.api.storage.services.v2.UpdateCollectionKeyValuesResponse> getUpdateCollectionKeyValuesMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateCollectionKeyValuesRequest, com.aruna.api.storage.services.v2.UpdateCollectionKeyValuesResponse> getUpdateCollectionKeyValuesMethod;
    if ((getUpdateCollectionKeyValuesMethod = CollectionServiceGrpc.getUpdateCollectionKeyValuesMethod) == null) {
      synchronized (CollectionServiceGrpc.class) {
        if ((getUpdateCollectionKeyValuesMethod = CollectionServiceGrpc.getUpdateCollectionKeyValuesMethod) == null) {
          CollectionServiceGrpc.getUpdateCollectionKeyValuesMethod = getUpdateCollectionKeyValuesMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.UpdateCollectionKeyValuesRequest, com.aruna.api.storage.services.v2.UpdateCollectionKeyValuesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCollectionKeyValues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateCollectionKeyValuesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateCollectionKeyValuesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CollectionServiceMethodDescriptorSupplier("UpdateCollectionKeyValues"))
              .build();
        }
      }
    }
    return getUpdateCollectionKeyValuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateCollectionDataClassRequest,
      com.aruna.api.storage.services.v2.UpdateCollectionDataClassResponse> getUpdateCollectionDataClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCollectionDataClass",
      requestType = com.aruna.api.storage.services.v2.UpdateCollectionDataClassRequest.class,
      responseType = com.aruna.api.storage.services.v2.UpdateCollectionDataClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateCollectionDataClassRequest,
      com.aruna.api.storage.services.v2.UpdateCollectionDataClassResponse> getUpdateCollectionDataClassMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateCollectionDataClassRequest, com.aruna.api.storage.services.v2.UpdateCollectionDataClassResponse> getUpdateCollectionDataClassMethod;
    if ((getUpdateCollectionDataClassMethod = CollectionServiceGrpc.getUpdateCollectionDataClassMethod) == null) {
      synchronized (CollectionServiceGrpc.class) {
        if ((getUpdateCollectionDataClassMethod = CollectionServiceGrpc.getUpdateCollectionDataClassMethod) == null) {
          CollectionServiceGrpc.getUpdateCollectionDataClassMethod = getUpdateCollectionDataClassMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.UpdateCollectionDataClassRequest, com.aruna.api.storage.services.v2.UpdateCollectionDataClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCollectionDataClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateCollectionDataClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateCollectionDataClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CollectionServiceMethodDescriptorSupplier("UpdateCollectionDataClass"))
              .build();
        }
      }
    }
    return getUpdateCollectionDataClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.SnapshotCollectionRequest,
      com.aruna.api.storage.services.v2.SnapshotCollectionResponse> getSnapshotCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SnapshotCollection",
      requestType = com.aruna.api.storage.services.v2.SnapshotCollectionRequest.class,
      responseType = com.aruna.api.storage.services.v2.SnapshotCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.SnapshotCollectionRequest,
      com.aruna.api.storage.services.v2.SnapshotCollectionResponse> getSnapshotCollectionMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.SnapshotCollectionRequest, com.aruna.api.storage.services.v2.SnapshotCollectionResponse> getSnapshotCollectionMethod;
    if ((getSnapshotCollectionMethod = CollectionServiceGrpc.getSnapshotCollectionMethod) == null) {
      synchronized (CollectionServiceGrpc.class) {
        if ((getSnapshotCollectionMethod = CollectionServiceGrpc.getSnapshotCollectionMethod) == null) {
          CollectionServiceGrpc.getSnapshotCollectionMethod = getSnapshotCollectionMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.SnapshotCollectionRequest, com.aruna.api.storage.services.v2.SnapshotCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SnapshotCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.SnapshotCollectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.SnapshotCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CollectionServiceMethodDescriptorSupplier("SnapshotCollection"))
              .build();
        }
      }
    }
    return getSnapshotCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateCollectionLicensesRequest,
      com.aruna.api.storage.services.v2.UpdateCollectionLicensesResponse> getUpdateCollectionLicensesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCollectionLicenses",
      requestType = com.aruna.api.storage.services.v2.UpdateCollectionLicensesRequest.class,
      responseType = com.aruna.api.storage.services.v2.UpdateCollectionLicensesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateCollectionLicensesRequest,
      com.aruna.api.storage.services.v2.UpdateCollectionLicensesResponse> getUpdateCollectionLicensesMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateCollectionLicensesRequest, com.aruna.api.storage.services.v2.UpdateCollectionLicensesResponse> getUpdateCollectionLicensesMethod;
    if ((getUpdateCollectionLicensesMethod = CollectionServiceGrpc.getUpdateCollectionLicensesMethod) == null) {
      synchronized (CollectionServiceGrpc.class) {
        if ((getUpdateCollectionLicensesMethod = CollectionServiceGrpc.getUpdateCollectionLicensesMethod) == null) {
          CollectionServiceGrpc.getUpdateCollectionLicensesMethod = getUpdateCollectionLicensesMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.UpdateCollectionLicensesRequest, com.aruna.api.storage.services.v2.UpdateCollectionLicensesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCollectionLicenses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateCollectionLicensesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateCollectionLicensesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CollectionServiceMethodDescriptorSupplier("UpdateCollectionLicenses"))
              .build();
        }
      }
    }
    return getUpdateCollectionLicensesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateCollectionTitleRequest,
      com.aruna.api.storage.services.v2.UpdateCollectionTitleResponse> getUpdateCollectionTitleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCollectionTitle",
      requestType = com.aruna.api.storage.services.v2.UpdateCollectionTitleRequest.class,
      responseType = com.aruna.api.storage.services.v2.UpdateCollectionTitleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateCollectionTitleRequest,
      com.aruna.api.storage.services.v2.UpdateCollectionTitleResponse> getUpdateCollectionTitleMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateCollectionTitleRequest, com.aruna.api.storage.services.v2.UpdateCollectionTitleResponse> getUpdateCollectionTitleMethod;
    if ((getUpdateCollectionTitleMethod = CollectionServiceGrpc.getUpdateCollectionTitleMethod) == null) {
      synchronized (CollectionServiceGrpc.class) {
        if ((getUpdateCollectionTitleMethod = CollectionServiceGrpc.getUpdateCollectionTitleMethod) == null) {
          CollectionServiceGrpc.getUpdateCollectionTitleMethod = getUpdateCollectionTitleMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.UpdateCollectionTitleRequest, com.aruna.api.storage.services.v2.UpdateCollectionTitleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCollectionTitle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateCollectionTitleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateCollectionTitleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CollectionServiceMethodDescriptorSupplier("UpdateCollectionTitle"))
              .build();
        }
      }
    }
    return getUpdateCollectionTitleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateCollectionAuthorsRequest,
      com.aruna.api.storage.services.v2.UpdateCollectionAuthorsResponse> getUpdateCollectionAuthorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCollectionAuthors",
      requestType = com.aruna.api.storage.services.v2.UpdateCollectionAuthorsRequest.class,
      responseType = com.aruna.api.storage.services.v2.UpdateCollectionAuthorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateCollectionAuthorsRequest,
      com.aruna.api.storage.services.v2.UpdateCollectionAuthorsResponse> getUpdateCollectionAuthorsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateCollectionAuthorsRequest, com.aruna.api.storage.services.v2.UpdateCollectionAuthorsResponse> getUpdateCollectionAuthorsMethod;
    if ((getUpdateCollectionAuthorsMethod = CollectionServiceGrpc.getUpdateCollectionAuthorsMethod) == null) {
      synchronized (CollectionServiceGrpc.class) {
        if ((getUpdateCollectionAuthorsMethod = CollectionServiceGrpc.getUpdateCollectionAuthorsMethod) == null) {
          CollectionServiceGrpc.getUpdateCollectionAuthorsMethod = getUpdateCollectionAuthorsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.UpdateCollectionAuthorsRequest, com.aruna.api.storage.services.v2.UpdateCollectionAuthorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCollectionAuthors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateCollectionAuthorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateCollectionAuthorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CollectionServiceMethodDescriptorSupplier("UpdateCollectionAuthors"))
              .build();
        }
      }
    }
    return getUpdateCollectionAuthorsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CollectionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CollectionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CollectionServiceStub>() {
        @java.lang.Override
        public CollectionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CollectionServiceStub(channel, callOptions);
        }
      };
    return CollectionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CollectionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CollectionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CollectionServiceBlockingStub>() {
        @java.lang.Override
        public CollectionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CollectionServiceBlockingStub(channel, callOptions);
        }
      };
    return CollectionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CollectionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CollectionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CollectionServiceFutureStub>() {
        @java.lang.Override
        public CollectionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CollectionServiceFutureStub(channel, callOptions);
        }
      };
    return CollectionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * CollectionService
   * Status: BETA
   * Contains all methods that get/create or update Collection and associated resources
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateNewCollection
     * Status: BETA
     * creates a new Collection
     * </pre>
     */
    default void createCollection(com.aruna.api.storage.services.v2.CreateCollectionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCollectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetCollection
     * Status: BETA
     * Request a specific collection by ID
     * </pre>
     */
    default void getCollection(com.aruna.api.storage.services.v2.GetCollectionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCollectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetCollections
     * Status: BETA
     * Queries multiple collections by ID
     * </pre>
     */
    default void getCollections(com.aruna.api.storage.services.v2.GetCollectionsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetCollectionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCollectionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteCollection
     * Status: STABLE
     * This request deletes the collection.
     * </pre>
     */
    default void deleteCollection(com.aruna.api.storage.services.v2.DeleteCollectionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCollectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateCollectionName
     * Status: BETA
     * Updates the collection name. Caveat! Will rename the "s3 bucket" for data proxies! 
     * </pre>
     */
    default void updateCollectionName(com.aruna.api.storage.services.v2.UpdateCollectionNameRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateCollectionNameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCollectionNameMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateCollectionDescription
     * Status: BETA
     * Updates the collection description.
     * </pre>
     */
    default void updateCollectionDescription(com.aruna.api.storage.services.v2.UpdateCollectionDescriptionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCollectionDescriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateCollectionKeyValues
     * Status: BETA
     * Updates the collection key values.
     * </pre>
     */
    default void updateCollectionKeyValues(com.aruna.api.storage.services.v2.UpdateCollectionKeyValuesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateCollectionKeyValuesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCollectionKeyValuesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateCollectionDataClass
     * Status: BETA
     * Updates the collection name. All (meta) data will be overwritten.
     * </pre>
     */
    default void updateCollectionDataClass(com.aruna.api.storage.services.v2.UpdateCollectionDataClassRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateCollectionDataClassResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCollectionDataClassMethod(), responseObserver);
    }

    /**
     * <pre>
     * SnapshotCollectionRequest
     * Status: BETA
     * Archives the full collection, rendering all downstream relations immutable
     * </pre>
     */
    default void snapshotCollection(com.aruna.api.storage.services.v2.SnapshotCollectionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.SnapshotCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSnapshotCollectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateLicenses
     * Status: BETA
     * Updates the collections metadata license and/or default data license.
     * </pre>
     */
    default void updateCollectionLicenses(com.aruna.api.storage.services.v2.UpdateCollectionLicensesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateCollectionLicensesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCollectionLicensesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateTitle
     * Status: ALPHA
     * Updates the collections metadata title.
     * </pre>
     */
    default void updateCollectionTitle(com.aruna.api.storage.services.v2.UpdateCollectionTitleRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateCollectionTitleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCollectionTitleMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAuthors
     * Status: ALPHA
     * Updates the collections metadata title.
     * </pre>
     */
    default void updateCollectionAuthors(com.aruna.api.storage.services.v2.UpdateCollectionAuthorsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateCollectionAuthorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCollectionAuthorsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CollectionService.
   * <pre>
   * CollectionService
   * Status: BETA
   * Contains all methods that get/create or update Collection and associated resources
   * </pre>
   */
  public static abstract class CollectionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CollectionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CollectionService.
   * <pre>
   * CollectionService
   * Status: BETA
   * Contains all methods that get/create or update Collection and associated resources
   * </pre>
   */
  public static final class CollectionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CollectionServiceStub> {
    private CollectionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CollectionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CollectionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateNewCollection
     * Status: BETA
     * creates a new Collection
     * </pre>
     */
    public void createCollection(com.aruna.api.storage.services.v2.CreateCollectionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetCollection
     * Status: BETA
     * Request a specific collection by ID
     * </pre>
     */
    public void getCollection(com.aruna.api.storage.services.v2.GetCollectionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetCollections
     * Status: BETA
     * Queries multiple collections by ID
     * </pre>
     */
    public void getCollections(com.aruna.api.storage.services.v2.GetCollectionsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetCollectionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCollectionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteCollection
     * Status: STABLE
     * This request deletes the collection.
     * </pre>
     */
    public void deleteCollection(com.aruna.api.storage.services.v2.DeleteCollectionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateCollectionName
     * Status: BETA
     * Updates the collection name. Caveat! Will rename the "s3 bucket" for data proxies! 
     * </pre>
     */
    public void updateCollectionName(com.aruna.api.storage.services.v2.UpdateCollectionNameRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateCollectionNameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCollectionNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateCollectionDescription
     * Status: BETA
     * Updates the collection description.
     * </pre>
     */
    public void updateCollectionDescription(com.aruna.api.storage.services.v2.UpdateCollectionDescriptionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCollectionDescriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateCollectionKeyValues
     * Status: BETA
     * Updates the collection key values.
     * </pre>
     */
    public void updateCollectionKeyValues(com.aruna.api.storage.services.v2.UpdateCollectionKeyValuesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateCollectionKeyValuesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCollectionKeyValuesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateCollectionDataClass
     * Status: BETA
     * Updates the collection name. All (meta) data will be overwritten.
     * </pre>
     */
    public void updateCollectionDataClass(com.aruna.api.storage.services.v2.UpdateCollectionDataClassRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateCollectionDataClassResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCollectionDataClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SnapshotCollectionRequest
     * Status: BETA
     * Archives the full collection, rendering all downstream relations immutable
     * </pre>
     */
    public void snapshotCollection(com.aruna.api.storage.services.v2.SnapshotCollectionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.SnapshotCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSnapshotCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateLicenses
     * Status: BETA
     * Updates the collections metadata license and/or default data license.
     * </pre>
     */
    public void updateCollectionLicenses(com.aruna.api.storage.services.v2.UpdateCollectionLicensesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateCollectionLicensesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCollectionLicensesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateTitle
     * Status: ALPHA
     * Updates the collections metadata title.
     * </pre>
     */
    public void updateCollectionTitle(com.aruna.api.storage.services.v2.UpdateCollectionTitleRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateCollectionTitleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCollectionTitleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAuthors
     * Status: ALPHA
     * Updates the collections metadata title.
     * </pre>
     */
    public void updateCollectionAuthors(com.aruna.api.storage.services.v2.UpdateCollectionAuthorsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateCollectionAuthorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCollectionAuthorsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CollectionService.
   * <pre>
   * CollectionService
   * Status: BETA
   * Contains all methods that get/create or update Collection and associated resources
   * </pre>
   */
  public static final class CollectionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CollectionServiceBlockingStub> {
    private CollectionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CollectionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CollectionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateNewCollection
     * Status: BETA
     * creates a new Collection
     * </pre>
     */
    public com.aruna.api.storage.services.v2.CreateCollectionResponse createCollection(com.aruna.api.storage.services.v2.CreateCollectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCollectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetCollection
     * Status: BETA
     * Request a specific collection by ID
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetCollectionResponse getCollection(com.aruna.api.storage.services.v2.GetCollectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCollectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetCollections
     * Status: BETA
     * Queries multiple collections by ID
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetCollectionsResponse getCollections(com.aruna.api.storage.services.v2.GetCollectionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCollectionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteCollection
     * Status: STABLE
     * This request deletes the collection.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.DeleteCollectionResponse deleteCollection(com.aruna.api.storage.services.v2.DeleteCollectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCollectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateCollectionName
     * Status: BETA
     * Updates the collection name. Caveat! Will rename the "s3 bucket" for data proxies! 
     * </pre>
     */
    public com.aruna.api.storage.services.v2.UpdateCollectionNameResponse updateCollectionName(com.aruna.api.storage.services.v2.UpdateCollectionNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCollectionNameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateCollectionDescription
     * Status: BETA
     * Updates the collection description.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse updateCollectionDescription(com.aruna.api.storage.services.v2.UpdateCollectionDescriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCollectionDescriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateCollectionKeyValues
     * Status: BETA
     * Updates the collection key values.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.UpdateCollectionKeyValuesResponse updateCollectionKeyValues(com.aruna.api.storage.services.v2.UpdateCollectionKeyValuesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCollectionKeyValuesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateCollectionDataClass
     * Status: BETA
     * Updates the collection name. All (meta) data will be overwritten.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.UpdateCollectionDataClassResponse updateCollectionDataClass(com.aruna.api.storage.services.v2.UpdateCollectionDataClassRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCollectionDataClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SnapshotCollectionRequest
     * Status: BETA
     * Archives the full collection, rendering all downstream relations immutable
     * </pre>
     */
    public com.aruna.api.storage.services.v2.SnapshotCollectionResponse snapshotCollection(com.aruna.api.storage.services.v2.SnapshotCollectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSnapshotCollectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateLicenses
     * Status: BETA
     * Updates the collections metadata license and/or default data license.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.UpdateCollectionLicensesResponse updateCollectionLicenses(com.aruna.api.storage.services.v2.UpdateCollectionLicensesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCollectionLicensesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateTitle
     * Status: ALPHA
     * Updates the collections metadata title.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.UpdateCollectionTitleResponse updateCollectionTitle(com.aruna.api.storage.services.v2.UpdateCollectionTitleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCollectionTitleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAuthors
     * Status: ALPHA
     * Updates the collections metadata title.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.UpdateCollectionAuthorsResponse updateCollectionAuthors(com.aruna.api.storage.services.v2.UpdateCollectionAuthorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCollectionAuthorsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CollectionService.
   * <pre>
   * CollectionService
   * Status: BETA
   * Contains all methods that get/create or update Collection and associated resources
   * </pre>
   */
  public static final class CollectionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CollectionServiceFutureStub> {
    private CollectionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CollectionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CollectionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateNewCollection
     * Status: BETA
     * creates a new Collection
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.CreateCollectionResponse> createCollection(
        com.aruna.api.storage.services.v2.CreateCollectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCollectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetCollection
     * Status: BETA
     * Request a specific collection by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetCollectionResponse> getCollection(
        com.aruna.api.storage.services.v2.GetCollectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCollectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetCollections
     * Status: BETA
     * Queries multiple collections by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetCollectionsResponse> getCollections(
        com.aruna.api.storage.services.v2.GetCollectionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCollectionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteCollection
     * Status: STABLE
     * This request deletes the collection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DeleteCollectionResponse> deleteCollection(
        com.aruna.api.storage.services.v2.DeleteCollectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCollectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateCollectionName
     * Status: BETA
     * Updates the collection name. Caveat! Will rename the "s3 bucket" for data proxies! 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.UpdateCollectionNameResponse> updateCollectionName(
        com.aruna.api.storage.services.v2.UpdateCollectionNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCollectionNameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateCollectionDescription
     * Status: BETA
     * Updates the collection description.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse> updateCollectionDescription(
        com.aruna.api.storage.services.v2.UpdateCollectionDescriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCollectionDescriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateCollectionKeyValues
     * Status: BETA
     * Updates the collection key values.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.UpdateCollectionKeyValuesResponse> updateCollectionKeyValues(
        com.aruna.api.storage.services.v2.UpdateCollectionKeyValuesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCollectionKeyValuesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateCollectionDataClass
     * Status: BETA
     * Updates the collection name. All (meta) data will be overwritten.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.UpdateCollectionDataClassResponse> updateCollectionDataClass(
        com.aruna.api.storage.services.v2.UpdateCollectionDataClassRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCollectionDataClassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SnapshotCollectionRequest
     * Status: BETA
     * Archives the full collection, rendering all downstream relations immutable
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.SnapshotCollectionResponse> snapshotCollection(
        com.aruna.api.storage.services.v2.SnapshotCollectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSnapshotCollectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateLicenses
     * Status: BETA
     * Updates the collections metadata license and/or default data license.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.UpdateCollectionLicensesResponse> updateCollectionLicenses(
        com.aruna.api.storage.services.v2.UpdateCollectionLicensesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCollectionLicensesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateTitle
     * Status: ALPHA
     * Updates the collections metadata title.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.UpdateCollectionTitleResponse> updateCollectionTitle(
        com.aruna.api.storage.services.v2.UpdateCollectionTitleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCollectionTitleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAuthors
     * Status: ALPHA
     * Updates the collections metadata title.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.UpdateCollectionAuthorsResponse> updateCollectionAuthors(
        com.aruna.api.storage.services.v2.UpdateCollectionAuthorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCollectionAuthorsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_COLLECTION = 0;
  private static final int METHODID_GET_COLLECTION = 1;
  private static final int METHODID_GET_COLLECTIONS = 2;
  private static final int METHODID_DELETE_COLLECTION = 3;
  private static final int METHODID_UPDATE_COLLECTION_NAME = 4;
  private static final int METHODID_UPDATE_COLLECTION_DESCRIPTION = 5;
  private static final int METHODID_UPDATE_COLLECTION_KEY_VALUES = 6;
  private static final int METHODID_UPDATE_COLLECTION_DATA_CLASS = 7;
  private static final int METHODID_SNAPSHOT_COLLECTION = 8;
  private static final int METHODID_UPDATE_COLLECTION_LICENSES = 9;
  private static final int METHODID_UPDATE_COLLECTION_TITLE = 10;
  private static final int METHODID_UPDATE_COLLECTION_AUTHORS = 11;

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
        case METHODID_CREATE_COLLECTION:
          serviceImpl.createCollection((com.aruna.api.storage.services.v2.CreateCollectionRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateCollectionResponse>) responseObserver);
          break;
        case METHODID_GET_COLLECTION:
          serviceImpl.getCollection((com.aruna.api.storage.services.v2.GetCollectionRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetCollectionResponse>) responseObserver);
          break;
        case METHODID_GET_COLLECTIONS:
          serviceImpl.getCollections((com.aruna.api.storage.services.v2.GetCollectionsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetCollectionsResponse>) responseObserver);
          break;
        case METHODID_DELETE_COLLECTION:
          serviceImpl.deleteCollection((com.aruna.api.storage.services.v2.DeleteCollectionRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteCollectionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_COLLECTION_NAME:
          serviceImpl.updateCollectionName((com.aruna.api.storage.services.v2.UpdateCollectionNameRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateCollectionNameResponse>) responseObserver);
          break;
        case METHODID_UPDATE_COLLECTION_DESCRIPTION:
          serviceImpl.updateCollectionDescription((com.aruna.api.storage.services.v2.UpdateCollectionDescriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_COLLECTION_KEY_VALUES:
          serviceImpl.updateCollectionKeyValues((com.aruna.api.storage.services.v2.UpdateCollectionKeyValuesRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateCollectionKeyValuesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_COLLECTION_DATA_CLASS:
          serviceImpl.updateCollectionDataClass((com.aruna.api.storage.services.v2.UpdateCollectionDataClassRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateCollectionDataClassResponse>) responseObserver);
          break;
        case METHODID_SNAPSHOT_COLLECTION:
          serviceImpl.snapshotCollection((com.aruna.api.storage.services.v2.SnapshotCollectionRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.SnapshotCollectionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_COLLECTION_LICENSES:
          serviceImpl.updateCollectionLicenses((com.aruna.api.storage.services.v2.UpdateCollectionLicensesRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateCollectionLicensesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_COLLECTION_TITLE:
          serviceImpl.updateCollectionTitle((com.aruna.api.storage.services.v2.UpdateCollectionTitleRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateCollectionTitleResponse>) responseObserver);
          break;
        case METHODID_UPDATE_COLLECTION_AUTHORS:
          serviceImpl.updateCollectionAuthors((com.aruna.api.storage.services.v2.UpdateCollectionAuthorsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateCollectionAuthorsResponse>) responseObserver);
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
          getCreateCollectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.CreateCollectionRequest,
              com.aruna.api.storage.services.v2.CreateCollectionResponse>(
                service, METHODID_CREATE_COLLECTION)))
        .addMethod(
          getGetCollectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetCollectionRequest,
              com.aruna.api.storage.services.v2.GetCollectionResponse>(
                service, METHODID_GET_COLLECTION)))
        .addMethod(
          getGetCollectionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetCollectionsRequest,
              com.aruna.api.storage.services.v2.GetCollectionsResponse>(
                service, METHODID_GET_COLLECTIONS)))
        .addMethod(
          getDeleteCollectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DeleteCollectionRequest,
              com.aruna.api.storage.services.v2.DeleteCollectionResponse>(
                service, METHODID_DELETE_COLLECTION)))
        .addMethod(
          getUpdateCollectionNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.UpdateCollectionNameRequest,
              com.aruna.api.storage.services.v2.UpdateCollectionNameResponse>(
                service, METHODID_UPDATE_COLLECTION_NAME)))
        .addMethod(
          getUpdateCollectionDescriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.UpdateCollectionDescriptionRequest,
              com.aruna.api.storage.services.v2.UpdateCollectionDescriptionResponse>(
                service, METHODID_UPDATE_COLLECTION_DESCRIPTION)))
        .addMethod(
          getUpdateCollectionKeyValuesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.UpdateCollectionKeyValuesRequest,
              com.aruna.api.storage.services.v2.UpdateCollectionKeyValuesResponse>(
                service, METHODID_UPDATE_COLLECTION_KEY_VALUES)))
        .addMethod(
          getUpdateCollectionDataClassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.UpdateCollectionDataClassRequest,
              com.aruna.api.storage.services.v2.UpdateCollectionDataClassResponse>(
                service, METHODID_UPDATE_COLLECTION_DATA_CLASS)))
        .addMethod(
          getSnapshotCollectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.SnapshotCollectionRequest,
              com.aruna.api.storage.services.v2.SnapshotCollectionResponse>(
                service, METHODID_SNAPSHOT_COLLECTION)))
        .addMethod(
          getUpdateCollectionLicensesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.UpdateCollectionLicensesRequest,
              com.aruna.api.storage.services.v2.UpdateCollectionLicensesResponse>(
                service, METHODID_UPDATE_COLLECTION_LICENSES)))
        .addMethod(
          getUpdateCollectionTitleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.UpdateCollectionTitleRequest,
              com.aruna.api.storage.services.v2.UpdateCollectionTitleResponse>(
                service, METHODID_UPDATE_COLLECTION_TITLE)))
        .addMethod(
          getUpdateCollectionAuthorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.UpdateCollectionAuthorsRequest,
              com.aruna.api.storage.services.v2.UpdateCollectionAuthorsResponse>(
                service, METHODID_UPDATE_COLLECTION_AUTHORS)))
        .build();
  }

  private static abstract class CollectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CollectionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.storage.services.v2.CollectionServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CollectionService");
    }
  }

  private static final class CollectionServiceFileDescriptorSupplier
      extends CollectionServiceBaseDescriptorSupplier {
    CollectionServiceFileDescriptorSupplier() {}
  }

  private static final class CollectionServiceMethodDescriptorSupplier
      extends CollectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CollectionServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CollectionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CollectionServiceFileDescriptorSupplier())
              .addMethod(getCreateCollectionMethod())
              .addMethod(getGetCollectionMethod())
              .addMethod(getGetCollectionsMethod())
              .addMethod(getDeleteCollectionMethod())
              .addMethod(getUpdateCollectionNameMethod())
              .addMethod(getUpdateCollectionDescriptionMethod())
              .addMethod(getUpdateCollectionKeyValuesMethod())
              .addMethod(getUpdateCollectionDataClassMethod())
              .addMethod(getSnapshotCollectionMethod())
              .addMethod(getUpdateCollectionLicensesMethod())
              .addMethod(getUpdateCollectionTitleMethod())
              .addMethod(getUpdateCollectionAuthorsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
