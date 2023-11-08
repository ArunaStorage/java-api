package com.aruna.api.storage.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * DatasetService
 * Contains all methods that get/create or update Dataset and associated resources
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: aruna/api/storage/services/v2/dataset_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DatasetServiceGrpc {

  private DatasetServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "aruna.api.storage.services.v2.DatasetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateDatasetRequest,
      com.aruna.api.storage.services.v2.CreateDatasetResponse> getCreateDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDataset",
      requestType = com.aruna.api.storage.services.v2.CreateDatasetRequest.class,
      responseType = com.aruna.api.storage.services.v2.CreateDatasetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateDatasetRequest,
      com.aruna.api.storage.services.v2.CreateDatasetResponse> getCreateDatasetMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateDatasetRequest, com.aruna.api.storage.services.v2.CreateDatasetResponse> getCreateDatasetMethod;
    if ((getCreateDatasetMethod = DatasetServiceGrpc.getCreateDatasetMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getCreateDatasetMethod = DatasetServiceGrpc.getCreateDatasetMethod) == null) {
          DatasetServiceGrpc.getCreateDatasetMethod = getCreateDatasetMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.CreateDatasetRequest, com.aruna.api.storage.services.v2.CreateDatasetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateDatasetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("CreateDataset"))
              .build();
        }
      }
    }
    return getCreateDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetDatasetRequest,
      com.aruna.api.storage.services.v2.GetDatasetResponse> getGetDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDataset",
      requestType = com.aruna.api.storage.services.v2.GetDatasetRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetDatasetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetDatasetRequest,
      com.aruna.api.storage.services.v2.GetDatasetResponse> getGetDatasetMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetDatasetRequest, com.aruna.api.storage.services.v2.GetDatasetResponse> getGetDatasetMethod;
    if ((getGetDatasetMethod = DatasetServiceGrpc.getGetDatasetMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getGetDatasetMethod = DatasetServiceGrpc.getGetDatasetMethod) == null) {
          DatasetServiceGrpc.getGetDatasetMethod = getGetDatasetMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetDatasetRequest, com.aruna.api.storage.services.v2.GetDatasetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetDatasetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("GetDataset"))
              .build();
        }
      }
    }
    return getGetDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetDatasetsRequest,
      com.aruna.api.storage.services.v2.GetDatasetsResponse> getGetDatasetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDatasets",
      requestType = com.aruna.api.storage.services.v2.GetDatasetsRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetDatasetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetDatasetsRequest,
      com.aruna.api.storage.services.v2.GetDatasetsResponse> getGetDatasetsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetDatasetsRequest, com.aruna.api.storage.services.v2.GetDatasetsResponse> getGetDatasetsMethod;
    if ((getGetDatasetsMethod = DatasetServiceGrpc.getGetDatasetsMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getGetDatasetsMethod = DatasetServiceGrpc.getGetDatasetsMethod) == null) {
          DatasetServiceGrpc.getGetDatasetsMethod = getGetDatasetsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetDatasetsRequest, com.aruna.api.storage.services.v2.GetDatasetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDatasets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetDatasetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetDatasetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("GetDatasets"))
              .build();
        }
      }
    }
    return getGetDatasetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteDatasetRequest,
      com.aruna.api.storage.services.v2.DeleteDatasetResponse> getDeleteDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDataset",
      requestType = com.aruna.api.storage.services.v2.DeleteDatasetRequest.class,
      responseType = com.aruna.api.storage.services.v2.DeleteDatasetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteDatasetRequest,
      com.aruna.api.storage.services.v2.DeleteDatasetResponse> getDeleteDatasetMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteDatasetRequest, com.aruna.api.storage.services.v2.DeleteDatasetResponse> getDeleteDatasetMethod;
    if ((getDeleteDatasetMethod = DatasetServiceGrpc.getDeleteDatasetMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getDeleteDatasetMethod = DatasetServiceGrpc.getDeleteDatasetMethod) == null) {
          DatasetServiceGrpc.getDeleteDatasetMethod = getDeleteDatasetMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DeleteDatasetRequest, com.aruna.api.storage.services.v2.DeleteDatasetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteDatasetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("DeleteDataset"))
              .build();
        }
      }
    }
    return getDeleteDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateDatasetNameRequest,
      com.aruna.api.storage.services.v2.UpdateDatasetNameResponse> getUpdateDatasetNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDatasetName",
      requestType = com.aruna.api.storage.services.v2.UpdateDatasetNameRequest.class,
      responseType = com.aruna.api.storage.services.v2.UpdateDatasetNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateDatasetNameRequest,
      com.aruna.api.storage.services.v2.UpdateDatasetNameResponse> getUpdateDatasetNameMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateDatasetNameRequest, com.aruna.api.storage.services.v2.UpdateDatasetNameResponse> getUpdateDatasetNameMethod;
    if ((getUpdateDatasetNameMethod = DatasetServiceGrpc.getUpdateDatasetNameMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getUpdateDatasetNameMethod = DatasetServiceGrpc.getUpdateDatasetNameMethod) == null) {
          DatasetServiceGrpc.getUpdateDatasetNameMethod = getUpdateDatasetNameMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.UpdateDatasetNameRequest, com.aruna.api.storage.services.v2.UpdateDatasetNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDatasetName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateDatasetNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateDatasetNameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("UpdateDatasetName"))
              .build();
        }
      }
    }
    return getUpdateDatasetNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateDatasetDescriptionRequest,
      com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse> getUpdateDatasetDescriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDatasetDescription",
      requestType = com.aruna.api.storage.services.v2.UpdateDatasetDescriptionRequest.class,
      responseType = com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateDatasetDescriptionRequest,
      com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse> getUpdateDatasetDescriptionMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateDatasetDescriptionRequest, com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse> getUpdateDatasetDescriptionMethod;
    if ((getUpdateDatasetDescriptionMethod = DatasetServiceGrpc.getUpdateDatasetDescriptionMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getUpdateDatasetDescriptionMethod = DatasetServiceGrpc.getUpdateDatasetDescriptionMethod) == null) {
          DatasetServiceGrpc.getUpdateDatasetDescriptionMethod = getUpdateDatasetDescriptionMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.UpdateDatasetDescriptionRequest, com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDatasetDescription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateDatasetDescriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("UpdateDatasetDescription"))
              .build();
        }
      }
    }
    return getUpdateDatasetDescriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateDatasetKeyValuesRequest,
      com.aruna.api.storage.services.v2.UpdateDatasetKeyValuesResponse> getUpdateDatasetKeyValuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDatasetKeyValues",
      requestType = com.aruna.api.storage.services.v2.UpdateDatasetKeyValuesRequest.class,
      responseType = com.aruna.api.storage.services.v2.UpdateDatasetKeyValuesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateDatasetKeyValuesRequest,
      com.aruna.api.storage.services.v2.UpdateDatasetKeyValuesResponse> getUpdateDatasetKeyValuesMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateDatasetKeyValuesRequest, com.aruna.api.storage.services.v2.UpdateDatasetKeyValuesResponse> getUpdateDatasetKeyValuesMethod;
    if ((getUpdateDatasetKeyValuesMethod = DatasetServiceGrpc.getUpdateDatasetKeyValuesMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getUpdateDatasetKeyValuesMethod = DatasetServiceGrpc.getUpdateDatasetKeyValuesMethod) == null) {
          DatasetServiceGrpc.getUpdateDatasetKeyValuesMethod = getUpdateDatasetKeyValuesMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.UpdateDatasetKeyValuesRequest, com.aruna.api.storage.services.v2.UpdateDatasetKeyValuesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDatasetKeyValues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateDatasetKeyValuesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateDatasetKeyValuesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("UpdateDatasetKeyValues"))
              .build();
        }
      }
    }
    return getUpdateDatasetKeyValuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest,
      com.aruna.api.storage.services.v2.UpdateDatasetDataClassResponse> getUpdateDatasetDataClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDatasetDataClass",
      requestType = com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest.class,
      responseType = com.aruna.api.storage.services.v2.UpdateDatasetDataClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest,
      com.aruna.api.storage.services.v2.UpdateDatasetDataClassResponse> getUpdateDatasetDataClassMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest, com.aruna.api.storage.services.v2.UpdateDatasetDataClassResponse> getUpdateDatasetDataClassMethod;
    if ((getUpdateDatasetDataClassMethod = DatasetServiceGrpc.getUpdateDatasetDataClassMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getUpdateDatasetDataClassMethod = DatasetServiceGrpc.getUpdateDatasetDataClassMethod) == null) {
          DatasetServiceGrpc.getUpdateDatasetDataClassMethod = getUpdateDatasetDataClassMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest, com.aruna.api.storage.services.v2.UpdateDatasetDataClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDatasetDataClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateDatasetDataClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("UpdateDatasetDataClass"))
              .build();
        }
      }
    }
    return getUpdateDatasetDataClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.SnapshotDatasetRequest,
      com.aruna.api.storage.services.v2.SnapshotDatasetResponse> getSnapshotDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SnapshotDataset",
      requestType = com.aruna.api.storage.services.v2.SnapshotDatasetRequest.class,
      responseType = com.aruna.api.storage.services.v2.SnapshotDatasetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.SnapshotDatasetRequest,
      com.aruna.api.storage.services.v2.SnapshotDatasetResponse> getSnapshotDatasetMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.SnapshotDatasetRequest, com.aruna.api.storage.services.v2.SnapshotDatasetResponse> getSnapshotDatasetMethod;
    if ((getSnapshotDatasetMethod = DatasetServiceGrpc.getSnapshotDatasetMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getSnapshotDatasetMethod = DatasetServiceGrpc.getSnapshotDatasetMethod) == null) {
          DatasetServiceGrpc.getSnapshotDatasetMethod = getSnapshotDatasetMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.SnapshotDatasetRequest, com.aruna.api.storage.services.v2.SnapshotDatasetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SnapshotDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.SnapshotDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.SnapshotDatasetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("SnapshotDataset"))
              .build();
        }
      }
    }
    return getSnapshotDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateDatasetLicensesRequest,
      com.aruna.api.storage.services.v2.UpdateDatasetLicensesResponse> getUpdateDatasetLicensesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDatasetLicenses",
      requestType = com.aruna.api.storage.services.v2.UpdateDatasetLicensesRequest.class,
      responseType = com.aruna.api.storage.services.v2.UpdateDatasetLicensesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateDatasetLicensesRequest,
      com.aruna.api.storage.services.v2.UpdateDatasetLicensesResponse> getUpdateDatasetLicensesMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateDatasetLicensesRequest, com.aruna.api.storage.services.v2.UpdateDatasetLicensesResponse> getUpdateDatasetLicensesMethod;
    if ((getUpdateDatasetLicensesMethod = DatasetServiceGrpc.getUpdateDatasetLicensesMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getUpdateDatasetLicensesMethod = DatasetServiceGrpc.getUpdateDatasetLicensesMethod) == null) {
          DatasetServiceGrpc.getUpdateDatasetLicensesMethod = getUpdateDatasetLicensesMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.UpdateDatasetLicensesRequest, com.aruna.api.storage.services.v2.UpdateDatasetLicensesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDatasetLicenses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateDatasetLicensesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateDatasetLicensesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("UpdateDatasetLicenses"))
              .build();
        }
      }
    }
    return getUpdateDatasetLicensesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DatasetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatasetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatasetServiceStub>() {
        @java.lang.Override
        public DatasetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatasetServiceStub(channel, callOptions);
        }
      };
    return DatasetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DatasetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatasetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatasetServiceBlockingStub>() {
        @java.lang.Override
        public DatasetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatasetServiceBlockingStub(channel, callOptions);
        }
      };
    return DatasetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DatasetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatasetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatasetServiceFutureStub>() {
        @java.lang.Override
        public DatasetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatasetServiceFutureStub(channel, callOptions);
        }
      };
    return DatasetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * DatasetService
   * Contains all methods that get/create or update Dataset and associated resources
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateNewDataset
     * Status: BETA
     * creates a new Dataset
     * </pre>
     */
    default void createDataset(com.aruna.api.storage.services.v2.CreateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateDatasetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDataset
     * Status: BETA
     * Request a specific dataset by ID
     * </pre>
     */
    default void getDataset(com.aruna.api.storage.services.v2.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetDatasetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDatasets
     * Status: BETA
     * Queries multiple datasets by ID
     * </pre>
     */
    default void getDatasets(com.aruna.api.storage.services.v2.GetDatasetsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetDatasetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDatasetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteDataset
     * Status: STABLE
     * This request deletes the dataset.
     * </pre>
     */
    default void deleteDataset(com.aruna.api.storage.services.v2.DeleteDatasetRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteDatasetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDatasetName
     * Status: BETA
     * Updates the dataset name. Caveat! Will rename the "s3 bucket" for data proxies! 
     * </pre>
     */
    default void updateDatasetName(com.aruna.api.storage.services.v2.UpdateDatasetNameRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateDatasetNameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDatasetNameMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDatasetDescription
     * Status: BETA
     * Updates the dataset description.
     * </pre>
     */
    default void updateDatasetDescription(com.aruna.api.storage.services.v2.UpdateDatasetDescriptionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDatasetDescriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDatasetKeyValues
     * Status: BETA
     * Updates the dataset key values.
     * </pre>
     */
    default void updateDatasetKeyValues(com.aruna.api.storage.services.v2.UpdateDatasetKeyValuesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateDatasetKeyValuesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDatasetKeyValuesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDatasetDataClass
     * Status: BETA
     * Updates the dataset name. All (meta) data will be overwritten.
     * </pre>
     */
    default void updateDatasetDataClass(com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateDatasetDataClassResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDatasetDataClassMethod(), responseObserver);
    }

    /**
     * <pre>
     * SnapshotDatasetRequest
     * Status: BETA
     * Archives the full dataset, rendering all downstream relations immutable
     * </pre>
     */
    default void snapshotDataset(com.aruna.api.storage.services.v2.SnapshotDatasetRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.SnapshotDatasetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSnapshotDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateLicenses
     * Status: BETA
     * Updates the dataset metadata license and/or default data license.
     * </pre>
     */
    default void updateDatasetLicenses(com.aruna.api.storage.services.v2.UpdateDatasetLicensesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateDatasetLicensesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDatasetLicensesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DatasetService.
   * <pre>
   * DatasetService
   * Contains all methods that get/create or update Dataset and associated resources
   * </pre>
   */
  public static abstract class DatasetServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DatasetServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DatasetService.
   * <pre>
   * DatasetService
   * Contains all methods that get/create or update Dataset and associated resources
   * </pre>
   */
  public static final class DatasetServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DatasetServiceStub> {
    private DatasetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatasetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateNewDataset
     * Status: BETA
     * creates a new Dataset
     * </pre>
     */
    public void createDataset(com.aruna.api.storage.services.v2.CreateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateDatasetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDataset
     * Status: BETA
     * Request a specific dataset by ID
     * </pre>
     */
    public void getDataset(com.aruna.api.storage.services.v2.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetDatasetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDatasets
     * Status: BETA
     * Queries multiple datasets by ID
     * </pre>
     */
    public void getDatasets(com.aruna.api.storage.services.v2.GetDatasetsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetDatasetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDatasetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteDataset
     * Status: STABLE
     * This request deletes the dataset.
     * </pre>
     */
    public void deleteDataset(com.aruna.api.storage.services.v2.DeleteDatasetRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteDatasetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateDatasetName
     * Status: BETA
     * Updates the dataset name. Caveat! Will rename the "s3 bucket" for data proxies! 
     * </pre>
     */
    public void updateDatasetName(com.aruna.api.storage.services.v2.UpdateDatasetNameRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateDatasetNameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDatasetNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateDatasetDescription
     * Status: BETA
     * Updates the dataset description.
     * </pre>
     */
    public void updateDatasetDescription(com.aruna.api.storage.services.v2.UpdateDatasetDescriptionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDatasetDescriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateDatasetKeyValues
     * Status: BETA
     * Updates the dataset key values.
     * </pre>
     */
    public void updateDatasetKeyValues(com.aruna.api.storage.services.v2.UpdateDatasetKeyValuesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateDatasetKeyValuesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDatasetKeyValuesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateDatasetDataClass
     * Status: BETA
     * Updates the dataset name. All (meta) data will be overwritten.
     * </pre>
     */
    public void updateDatasetDataClass(com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateDatasetDataClassResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDatasetDataClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SnapshotDatasetRequest
     * Status: BETA
     * Archives the full dataset, rendering all downstream relations immutable
     * </pre>
     */
    public void snapshotDataset(com.aruna.api.storage.services.v2.SnapshotDatasetRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.SnapshotDatasetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSnapshotDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateLicenses
     * Status: BETA
     * Updates the dataset metadata license and/or default data license.
     * </pre>
     */
    public void updateDatasetLicenses(com.aruna.api.storage.services.v2.UpdateDatasetLicensesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateDatasetLicensesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDatasetLicensesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DatasetService.
   * <pre>
   * DatasetService
   * Contains all methods that get/create or update Dataset and associated resources
   * </pre>
   */
  public static final class DatasetServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DatasetServiceBlockingStub> {
    private DatasetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatasetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateNewDataset
     * Status: BETA
     * creates a new Dataset
     * </pre>
     */
    public com.aruna.api.storage.services.v2.CreateDatasetResponse createDataset(com.aruna.api.storage.services.v2.CreateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDataset
     * Status: BETA
     * Request a specific dataset by ID
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetDatasetResponse getDataset(com.aruna.api.storage.services.v2.GetDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDatasets
     * Status: BETA
     * Queries multiple datasets by ID
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetDatasetsResponse getDatasets(com.aruna.api.storage.services.v2.GetDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDatasetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteDataset
     * Status: STABLE
     * This request deletes the dataset.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.DeleteDatasetResponse deleteDataset(com.aruna.api.storage.services.v2.DeleteDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateDatasetName
     * Status: BETA
     * Updates the dataset name. Caveat! Will rename the "s3 bucket" for data proxies! 
     * </pre>
     */
    public com.aruna.api.storage.services.v2.UpdateDatasetNameResponse updateDatasetName(com.aruna.api.storage.services.v2.UpdateDatasetNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDatasetNameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateDatasetDescription
     * Status: BETA
     * Updates the dataset description.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse updateDatasetDescription(com.aruna.api.storage.services.v2.UpdateDatasetDescriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDatasetDescriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateDatasetKeyValues
     * Status: BETA
     * Updates the dataset key values.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.UpdateDatasetKeyValuesResponse updateDatasetKeyValues(com.aruna.api.storage.services.v2.UpdateDatasetKeyValuesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDatasetKeyValuesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateDatasetDataClass
     * Status: BETA
     * Updates the dataset name. All (meta) data will be overwritten.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.UpdateDatasetDataClassResponse updateDatasetDataClass(com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDatasetDataClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SnapshotDatasetRequest
     * Status: BETA
     * Archives the full dataset, rendering all downstream relations immutable
     * </pre>
     */
    public com.aruna.api.storage.services.v2.SnapshotDatasetResponse snapshotDataset(com.aruna.api.storage.services.v2.SnapshotDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSnapshotDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateLicenses
     * Status: BETA
     * Updates the dataset metadata license and/or default data license.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.UpdateDatasetLicensesResponse updateDatasetLicenses(com.aruna.api.storage.services.v2.UpdateDatasetLicensesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDatasetLicensesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DatasetService.
   * <pre>
   * DatasetService
   * Contains all methods that get/create or update Dataset and associated resources
   * </pre>
   */
  public static final class DatasetServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DatasetServiceFutureStub> {
    private DatasetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatasetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateNewDataset
     * Status: BETA
     * creates a new Dataset
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.CreateDatasetResponse> createDataset(
        com.aruna.api.storage.services.v2.CreateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDatasetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDataset
     * Status: BETA
     * Request a specific dataset by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetDatasetResponse> getDataset(
        com.aruna.api.storage.services.v2.GetDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDatasetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDatasets
     * Status: BETA
     * Queries multiple datasets by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetDatasetsResponse> getDatasets(
        com.aruna.api.storage.services.v2.GetDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDatasetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteDataset
     * Status: STABLE
     * This request deletes the dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DeleteDatasetResponse> deleteDataset(
        com.aruna.api.storage.services.v2.DeleteDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDatasetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateDatasetName
     * Status: BETA
     * Updates the dataset name. Caveat! Will rename the "s3 bucket" for data proxies! 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.UpdateDatasetNameResponse> updateDatasetName(
        com.aruna.api.storage.services.v2.UpdateDatasetNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDatasetNameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateDatasetDescription
     * Status: BETA
     * Updates the dataset description.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse> updateDatasetDescription(
        com.aruna.api.storage.services.v2.UpdateDatasetDescriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDatasetDescriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateDatasetKeyValues
     * Status: BETA
     * Updates the dataset key values.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.UpdateDatasetKeyValuesResponse> updateDatasetKeyValues(
        com.aruna.api.storage.services.v2.UpdateDatasetKeyValuesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDatasetKeyValuesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateDatasetDataClass
     * Status: BETA
     * Updates the dataset name. All (meta) data will be overwritten.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.UpdateDatasetDataClassResponse> updateDatasetDataClass(
        com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDatasetDataClassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SnapshotDatasetRequest
     * Status: BETA
     * Archives the full dataset, rendering all downstream relations immutable
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.SnapshotDatasetResponse> snapshotDataset(
        com.aruna.api.storage.services.v2.SnapshotDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSnapshotDatasetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateLicenses
     * Status: BETA
     * Updates the dataset metadata license and/or default data license.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.UpdateDatasetLicensesResponse> updateDatasetLicenses(
        com.aruna.api.storage.services.v2.UpdateDatasetLicensesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDatasetLicensesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DATASET = 0;
  private static final int METHODID_GET_DATASET = 1;
  private static final int METHODID_GET_DATASETS = 2;
  private static final int METHODID_DELETE_DATASET = 3;
  private static final int METHODID_UPDATE_DATASET_NAME = 4;
  private static final int METHODID_UPDATE_DATASET_DESCRIPTION = 5;
  private static final int METHODID_UPDATE_DATASET_KEY_VALUES = 6;
  private static final int METHODID_UPDATE_DATASET_DATA_CLASS = 7;
  private static final int METHODID_SNAPSHOT_DATASET = 8;
  private static final int METHODID_UPDATE_DATASET_LICENSES = 9;

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
        case METHODID_CREATE_DATASET:
          serviceImpl.createDataset((com.aruna.api.storage.services.v2.CreateDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateDatasetResponse>) responseObserver);
          break;
        case METHODID_GET_DATASET:
          serviceImpl.getDataset((com.aruna.api.storage.services.v2.GetDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetDatasetResponse>) responseObserver);
          break;
        case METHODID_GET_DATASETS:
          serviceImpl.getDatasets((com.aruna.api.storage.services.v2.GetDatasetsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetDatasetsResponse>) responseObserver);
          break;
        case METHODID_DELETE_DATASET:
          serviceImpl.deleteDataset((com.aruna.api.storage.services.v2.DeleteDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteDatasetResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DATASET_NAME:
          serviceImpl.updateDatasetName((com.aruna.api.storage.services.v2.UpdateDatasetNameRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateDatasetNameResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DATASET_DESCRIPTION:
          serviceImpl.updateDatasetDescription((com.aruna.api.storage.services.v2.UpdateDatasetDescriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DATASET_KEY_VALUES:
          serviceImpl.updateDatasetKeyValues((com.aruna.api.storage.services.v2.UpdateDatasetKeyValuesRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateDatasetKeyValuesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DATASET_DATA_CLASS:
          serviceImpl.updateDatasetDataClass((com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateDatasetDataClassResponse>) responseObserver);
          break;
        case METHODID_SNAPSHOT_DATASET:
          serviceImpl.snapshotDataset((com.aruna.api.storage.services.v2.SnapshotDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.SnapshotDatasetResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DATASET_LICENSES:
          serviceImpl.updateDatasetLicenses((com.aruna.api.storage.services.v2.UpdateDatasetLicensesRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateDatasetLicensesResponse>) responseObserver);
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
          getCreateDatasetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.CreateDatasetRequest,
              com.aruna.api.storage.services.v2.CreateDatasetResponse>(
                service, METHODID_CREATE_DATASET)))
        .addMethod(
          getGetDatasetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetDatasetRequest,
              com.aruna.api.storage.services.v2.GetDatasetResponse>(
                service, METHODID_GET_DATASET)))
        .addMethod(
          getGetDatasetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetDatasetsRequest,
              com.aruna.api.storage.services.v2.GetDatasetsResponse>(
                service, METHODID_GET_DATASETS)))
        .addMethod(
          getDeleteDatasetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DeleteDatasetRequest,
              com.aruna.api.storage.services.v2.DeleteDatasetResponse>(
                service, METHODID_DELETE_DATASET)))
        .addMethod(
          getUpdateDatasetNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.UpdateDatasetNameRequest,
              com.aruna.api.storage.services.v2.UpdateDatasetNameResponse>(
                service, METHODID_UPDATE_DATASET_NAME)))
        .addMethod(
          getUpdateDatasetDescriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.UpdateDatasetDescriptionRequest,
              com.aruna.api.storage.services.v2.UpdateDatasetDescriptionResponse>(
                service, METHODID_UPDATE_DATASET_DESCRIPTION)))
        .addMethod(
          getUpdateDatasetKeyValuesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.UpdateDatasetKeyValuesRequest,
              com.aruna.api.storage.services.v2.UpdateDatasetKeyValuesResponse>(
                service, METHODID_UPDATE_DATASET_KEY_VALUES)))
        .addMethod(
          getUpdateDatasetDataClassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.UpdateDatasetDataClassRequest,
              com.aruna.api.storage.services.v2.UpdateDatasetDataClassResponse>(
                service, METHODID_UPDATE_DATASET_DATA_CLASS)))
        .addMethod(
          getSnapshotDatasetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.SnapshotDatasetRequest,
              com.aruna.api.storage.services.v2.SnapshotDatasetResponse>(
                service, METHODID_SNAPSHOT_DATASET)))
        .addMethod(
          getUpdateDatasetLicensesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.UpdateDatasetLicensesRequest,
              com.aruna.api.storage.services.v2.UpdateDatasetLicensesResponse>(
                service, METHODID_UPDATE_DATASET_LICENSES)))
        .build();
  }

  private static abstract class DatasetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DatasetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.storage.services.v2.DatasetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DatasetService");
    }
  }

  private static final class DatasetServiceFileDescriptorSupplier
      extends DatasetServiceBaseDescriptorSupplier {
    DatasetServiceFileDescriptorSupplier() {}
  }

  private static final class DatasetServiceMethodDescriptorSupplier
      extends DatasetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DatasetServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DatasetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DatasetServiceFileDescriptorSupplier())
              .addMethod(getCreateDatasetMethod())
              .addMethod(getGetDatasetMethod())
              .addMethod(getGetDatasetsMethod())
              .addMethod(getDeleteDatasetMethod())
              .addMethod(getUpdateDatasetNameMethod())
              .addMethod(getUpdateDatasetDescriptionMethod())
              .addMethod(getUpdateDatasetKeyValuesMethod())
              .addMethod(getUpdateDatasetDataClassMethod())
              .addMethod(getSnapshotDatasetMethod())
              .addMethod(getUpdateDatasetLicensesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
