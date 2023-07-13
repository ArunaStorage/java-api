package com.aruna.api.storage.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * DatasetService
 * Contains all methods that get/create or update Dataset and associated resources
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/storage/services/v2/dataset_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DatasetServiceGrpc {

  private DatasetServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.storage.services.v2.DatasetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.CreateDatasetRequest,
      com.aruna.api.storage.services.v2.DatasetServiceProto.CreateDatasetResponse> getCreateDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDataset",
      requestType = com.aruna.api.storage.services.v2.DatasetServiceProto.CreateDatasetRequest.class,
      responseType = com.aruna.api.storage.services.v2.DatasetServiceProto.CreateDatasetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.CreateDatasetRequest,
      com.aruna.api.storage.services.v2.DatasetServiceProto.CreateDatasetResponse> getCreateDatasetMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.CreateDatasetRequest, com.aruna.api.storage.services.v2.DatasetServiceProto.CreateDatasetResponse> getCreateDatasetMethod;
    if ((getCreateDatasetMethod = DatasetServiceGrpc.getCreateDatasetMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getCreateDatasetMethod = DatasetServiceGrpc.getCreateDatasetMethod) == null) {
          DatasetServiceGrpc.getCreateDatasetMethod = getCreateDatasetMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DatasetServiceProto.CreateDatasetRequest, com.aruna.api.storage.services.v2.DatasetServiceProto.CreateDatasetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DatasetServiceProto.CreateDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DatasetServiceProto.CreateDatasetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("CreateDataset"))
              .build();
        }
      }
    }
    return getCreateDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetRequest,
      com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetResponse> getGetDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDataset",
      requestType = com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetRequest.class,
      responseType = com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetRequest,
      com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetResponse> getGetDatasetMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetRequest, com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetResponse> getGetDatasetMethod;
    if ((getGetDatasetMethod = DatasetServiceGrpc.getGetDatasetMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getGetDatasetMethod = DatasetServiceGrpc.getGetDatasetMethod) == null) {
          DatasetServiceGrpc.getGetDatasetMethod = getGetDatasetMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetRequest, com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("GetDataset"))
              .build();
        }
      }
    }
    return getGetDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetsRequest,
      com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetsResponse> getGetDatasetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDatasets",
      requestType = com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetsRequest.class,
      responseType = com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetsRequest,
      com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetsResponse> getGetDatasetsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetsRequest, com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetsResponse> getGetDatasetsMethod;
    if ((getGetDatasetsMethod = DatasetServiceGrpc.getGetDatasetsMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getGetDatasetsMethod = DatasetServiceGrpc.getGetDatasetsMethod) == null) {
          DatasetServiceGrpc.getGetDatasetsMethod = getGetDatasetsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetsRequest, com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDatasets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("GetDatasets"))
              .build();
        }
      }
    }
    return getGetDatasetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.DeleteDatasetRequest,
      com.aruna.api.storage.services.v2.DatasetServiceProto.DeleteDatasetResponse> getDeleteDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDataset",
      requestType = com.aruna.api.storage.services.v2.DatasetServiceProto.DeleteDatasetRequest.class,
      responseType = com.aruna.api.storage.services.v2.DatasetServiceProto.DeleteDatasetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.DeleteDatasetRequest,
      com.aruna.api.storage.services.v2.DatasetServiceProto.DeleteDatasetResponse> getDeleteDatasetMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.DeleteDatasetRequest, com.aruna.api.storage.services.v2.DatasetServiceProto.DeleteDatasetResponse> getDeleteDatasetMethod;
    if ((getDeleteDatasetMethod = DatasetServiceGrpc.getDeleteDatasetMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getDeleteDatasetMethod = DatasetServiceGrpc.getDeleteDatasetMethod) == null) {
          DatasetServiceGrpc.getDeleteDatasetMethod = getDeleteDatasetMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DatasetServiceProto.DeleteDatasetRequest, com.aruna.api.storage.services.v2.DatasetServiceProto.DeleteDatasetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DatasetServiceProto.DeleteDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DatasetServiceProto.DeleteDatasetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("DeleteDataset"))
              .build();
        }
      }
    }
    return getDeleteDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetNameRequest,
      com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetNameResponse> getUpdateDatasetNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDatasetName",
      requestType = com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetNameRequest.class,
      responseType = com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetNameRequest,
      com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetNameResponse> getUpdateDatasetNameMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetNameRequest, com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetNameResponse> getUpdateDatasetNameMethod;
    if ((getUpdateDatasetNameMethod = DatasetServiceGrpc.getUpdateDatasetNameMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getUpdateDatasetNameMethod = DatasetServiceGrpc.getUpdateDatasetNameMethod) == null) {
          DatasetServiceGrpc.getUpdateDatasetNameMethod = getUpdateDatasetNameMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetNameRequest, com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDatasetName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetNameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("UpdateDatasetName"))
              .build();
        }
      }
    }
    return getUpdateDatasetNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDescriptionRequest,
      com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDescriptionResponse> getUpdateDatasetDescriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDatasetDescription",
      requestType = com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDescriptionRequest.class,
      responseType = com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDescriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDescriptionRequest,
      com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDescriptionResponse> getUpdateDatasetDescriptionMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDescriptionRequest, com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDescriptionResponse> getUpdateDatasetDescriptionMethod;
    if ((getUpdateDatasetDescriptionMethod = DatasetServiceGrpc.getUpdateDatasetDescriptionMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getUpdateDatasetDescriptionMethod = DatasetServiceGrpc.getUpdateDatasetDescriptionMethod) == null) {
          DatasetServiceGrpc.getUpdateDatasetDescriptionMethod = getUpdateDatasetDescriptionMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDescriptionRequest, com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDescriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDatasetDescription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDescriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDescriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("UpdateDatasetDescription"))
              .build();
        }
      }
    }
    return getUpdateDatasetDescriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetKeyValuesRequest,
      com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetKeyValuesResponse> getUpdateDatasetKeyValuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDatasetKeyValues",
      requestType = com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetKeyValuesRequest.class,
      responseType = com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetKeyValuesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetKeyValuesRequest,
      com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetKeyValuesResponse> getUpdateDatasetKeyValuesMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetKeyValuesRequest, com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetKeyValuesResponse> getUpdateDatasetKeyValuesMethod;
    if ((getUpdateDatasetKeyValuesMethod = DatasetServiceGrpc.getUpdateDatasetKeyValuesMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getUpdateDatasetKeyValuesMethod = DatasetServiceGrpc.getUpdateDatasetKeyValuesMethod) == null) {
          DatasetServiceGrpc.getUpdateDatasetKeyValuesMethod = getUpdateDatasetKeyValuesMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetKeyValuesRequest, com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetKeyValuesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDatasetKeyValues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetKeyValuesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetKeyValuesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("UpdateDatasetKeyValues"))
              .build();
        }
      }
    }
    return getUpdateDatasetKeyValuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDataClassRequest,
      com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDataClassResponse> getUpdateDatasetDataClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDatasetDataClass",
      requestType = com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDataClassRequest.class,
      responseType = com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDataClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDataClassRequest,
      com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDataClassResponse> getUpdateDatasetDataClassMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDataClassRequest, com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDataClassResponse> getUpdateDatasetDataClassMethod;
    if ((getUpdateDatasetDataClassMethod = DatasetServiceGrpc.getUpdateDatasetDataClassMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getUpdateDatasetDataClassMethod = DatasetServiceGrpc.getUpdateDatasetDataClassMethod) == null) {
          DatasetServiceGrpc.getUpdateDatasetDataClassMethod = getUpdateDatasetDataClassMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDataClassRequest, com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDataClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDatasetDataClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDataClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDataClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("UpdateDatasetDataClass"))
              .build();
        }
      }
    }
    return getUpdateDatasetDataClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.SnapshotDatasetRequest,
      com.aruna.api.storage.services.v2.DatasetServiceProto.SnapshotDatasetResponse> getSnapshotDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SnapshotDataset",
      requestType = com.aruna.api.storage.services.v2.DatasetServiceProto.SnapshotDatasetRequest.class,
      responseType = com.aruna.api.storage.services.v2.DatasetServiceProto.SnapshotDatasetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.SnapshotDatasetRequest,
      com.aruna.api.storage.services.v2.DatasetServiceProto.SnapshotDatasetResponse> getSnapshotDatasetMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DatasetServiceProto.SnapshotDatasetRequest, com.aruna.api.storage.services.v2.DatasetServiceProto.SnapshotDatasetResponse> getSnapshotDatasetMethod;
    if ((getSnapshotDatasetMethod = DatasetServiceGrpc.getSnapshotDatasetMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getSnapshotDatasetMethod = DatasetServiceGrpc.getSnapshotDatasetMethod) == null) {
          DatasetServiceGrpc.getSnapshotDatasetMethod = getSnapshotDatasetMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DatasetServiceProto.SnapshotDatasetRequest, com.aruna.api.storage.services.v2.DatasetServiceProto.SnapshotDatasetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SnapshotDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DatasetServiceProto.SnapshotDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DatasetServiceProto.SnapshotDatasetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("SnapshotDataset"))
              .build();
        }
      }
    }
    return getSnapshotDatasetMethod;
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
    default void createDataset(com.aruna.api.storage.services.v2.DatasetServiceProto.CreateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.CreateDatasetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDataset
     * Status: BETA
     * Request a specific dataset by ID
     * </pre>
     */
    default void getDataset(com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDatasets
     * Status: BETA
     * Queries multiple datasets by ID
     * </pre>
     */
    default void getDatasets(com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDatasetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteDataset
     * Status: STABLE
     * This request deletes the dataset.
     * </pre>
     */
    default void deleteDataset(com.aruna.api.storage.services.v2.DatasetServiceProto.DeleteDatasetRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.DeleteDatasetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDatasetName
     * Status: BETA
     * Updates the dataset name. Caveat! Will rename the "s3 bucket" for data proxies! 
     * </pre>
     */
    default void updateDatasetName(com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetNameRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetNameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDatasetNameMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDatasetDescription
     * Status: BETA
     * Updates the dataset description.
     * </pre>
     */
    default void updateDatasetDescription(com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDescriptionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDescriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDatasetDescriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDatasetKeyValues
     * Status: BETA
     * Updates the dataset key values.
     * </pre>
     */
    default void updateDatasetKeyValues(com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetKeyValuesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetKeyValuesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDatasetKeyValuesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDatasetDataClass
     * Status: BETA
     * Updates the dataset name. All (meta) data will be overwritten.
     * </pre>
     */
    default void updateDatasetDataClass(com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDataClassRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDataClassResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDatasetDataClassMethod(), responseObserver);
    }

    /**
     * <pre>
     * SnapshotDatasetRequest
     * Status: BETA
     * Archives the full dataset, rendering all downstream relations immutable
     * </pre>
     */
    default void snapshotDataset(com.aruna.api.storage.services.v2.DatasetServiceProto.SnapshotDatasetRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.SnapshotDatasetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSnapshotDatasetMethod(), responseObserver);
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
    public void createDataset(com.aruna.api.storage.services.v2.DatasetServiceProto.CreateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.CreateDatasetResponse> responseObserver) {
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
    public void getDataset(com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetResponse> responseObserver) {
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
    public void getDatasets(com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetsResponse> responseObserver) {
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
    public void deleteDataset(com.aruna.api.storage.services.v2.DatasetServiceProto.DeleteDatasetRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.DeleteDatasetResponse> responseObserver) {
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
    public void updateDatasetName(com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetNameRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetNameResponse> responseObserver) {
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
    public void updateDatasetDescription(com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDescriptionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDescriptionResponse> responseObserver) {
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
    public void updateDatasetKeyValues(com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetKeyValuesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetKeyValuesResponse> responseObserver) {
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
    public void updateDatasetDataClass(com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDataClassRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDataClassResponse> responseObserver) {
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
    public void snapshotDataset(com.aruna.api.storage.services.v2.DatasetServiceProto.SnapshotDatasetRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.SnapshotDatasetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSnapshotDatasetMethod(), getCallOptions()), request, responseObserver);
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
    public com.aruna.api.storage.services.v2.DatasetServiceProto.CreateDatasetResponse createDataset(com.aruna.api.storage.services.v2.DatasetServiceProto.CreateDatasetRequest request) {
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
    public com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetResponse getDataset(com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetRequest request) {
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
    public com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetsResponse getDatasets(com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetsRequest request) {
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
    public com.aruna.api.storage.services.v2.DatasetServiceProto.DeleteDatasetResponse deleteDataset(com.aruna.api.storage.services.v2.DatasetServiceProto.DeleteDatasetRequest request) {
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
    public com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetNameResponse updateDatasetName(com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetNameRequest request) {
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
    public com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDescriptionResponse updateDatasetDescription(com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDescriptionRequest request) {
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
    public com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetKeyValuesResponse updateDatasetKeyValues(com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetKeyValuesRequest request) {
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
    public com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDataClassResponse updateDatasetDataClass(com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDataClassRequest request) {
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
    public com.aruna.api.storage.services.v2.DatasetServiceProto.SnapshotDatasetResponse snapshotDataset(com.aruna.api.storage.services.v2.DatasetServiceProto.SnapshotDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSnapshotDatasetMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DatasetServiceProto.CreateDatasetResponse> createDataset(
        com.aruna.api.storage.services.v2.DatasetServiceProto.CreateDatasetRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetResponse> getDataset(
        com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetsResponse> getDatasets(
        com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetsRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DatasetServiceProto.DeleteDatasetResponse> deleteDataset(
        com.aruna.api.storage.services.v2.DatasetServiceProto.DeleteDatasetRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetNameResponse> updateDatasetName(
        com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetNameRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDescriptionResponse> updateDatasetDescription(
        com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDescriptionRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetKeyValuesResponse> updateDatasetKeyValues(
        com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetKeyValuesRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDataClassResponse> updateDatasetDataClass(
        com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDataClassRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DatasetServiceProto.SnapshotDatasetResponse> snapshotDataset(
        com.aruna.api.storage.services.v2.DatasetServiceProto.SnapshotDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSnapshotDatasetMethod(), getCallOptions()), request);
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
          serviceImpl.createDataset((com.aruna.api.storage.services.v2.DatasetServiceProto.CreateDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.CreateDatasetResponse>) responseObserver);
          break;
        case METHODID_GET_DATASET:
          serviceImpl.getDataset((com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetResponse>) responseObserver);
          break;
        case METHODID_GET_DATASETS:
          serviceImpl.getDatasets((com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetsResponse>) responseObserver);
          break;
        case METHODID_DELETE_DATASET:
          serviceImpl.deleteDataset((com.aruna.api.storage.services.v2.DatasetServiceProto.DeleteDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.DeleteDatasetResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DATASET_NAME:
          serviceImpl.updateDatasetName((com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetNameRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetNameResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DATASET_DESCRIPTION:
          serviceImpl.updateDatasetDescription((com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDescriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDescriptionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DATASET_KEY_VALUES:
          serviceImpl.updateDatasetKeyValues((com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetKeyValuesRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetKeyValuesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DATASET_DATA_CLASS:
          serviceImpl.updateDatasetDataClass((com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDataClassRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDataClassResponse>) responseObserver);
          break;
        case METHODID_SNAPSHOT_DATASET:
          serviceImpl.snapshotDataset((com.aruna.api.storage.services.v2.DatasetServiceProto.SnapshotDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DatasetServiceProto.SnapshotDatasetResponse>) responseObserver);
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
              com.aruna.api.storage.services.v2.DatasetServiceProto.CreateDatasetRequest,
              com.aruna.api.storage.services.v2.DatasetServiceProto.CreateDatasetResponse>(
                service, METHODID_CREATE_DATASET)))
        .addMethod(
          getGetDatasetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetRequest,
              com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetResponse>(
                service, METHODID_GET_DATASET)))
        .addMethod(
          getGetDatasetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetsRequest,
              com.aruna.api.storage.services.v2.DatasetServiceProto.GetDatasetsResponse>(
                service, METHODID_GET_DATASETS)))
        .addMethod(
          getDeleteDatasetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DatasetServiceProto.DeleteDatasetRequest,
              com.aruna.api.storage.services.v2.DatasetServiceProto.DeleteDatasetResponse>(
                service, METHODID_DELETE_DATASET)))
        .addMethod(
          getUpdateDatasetNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetNameRequest,
              com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetNameResponse>(
                service, METHODID_UPDATE_DATASET_NAME)))
        .addMethod(
          getUpdateDatasetDescriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDescriptionRequest,
              com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDescriptionResponse>(
                service, METHODID_UPDATE_DATASET_DESCRIPTION)))
        .addMethod(
          getUpdateDatasetKeyValuesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetKeyValuesRequest,
              com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetKeyValuesResponse>(
                service, METHODID_UPDATE_DATASET_KEY_VALUES)))
        .addMethod(
          getUpdateDatasetDataClassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDataClassRequest,
              com.aruna.api.storage.services.v2.DatasetServiceProto.UpdateDatasetDataClassResponse>(
                service, METHODID_UPDATE_DATASET_DATA_CLASS)))
        .addMethod(
          getSnapshotDatasetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DatasetServiceProto.SnapshotDatasetRequest,
              com.aruna.api.storage.services.v2.DatasetServiceProto.SnapshotDatasetResponse>(
                service, METHODID_SNAPSHOT_DATASET)))
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
    private final String methodName;

    DatasetServiceMethodDescriptorSupplier(String methodName) {
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
              .build();
        }
      }
    }
    return result;
  }
}
