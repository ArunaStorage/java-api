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
 * <pre>
 * Dataset management service
 * Manages all dataset related services
 * All data objects are associated with one data dataset
 * Dataset versions group these data objects, which makes them reusable
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: api/services/DatasetService.proto")
public final class DatasetServiceGrpc {

  private DatasetServiceGrpc() {}

  public static final String SERVICE_NAME = "services.DatasetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.CreateDatasetRequest,
      com.github.ScienceObjectsDB.java_api.models.Dataset> getCreateNewDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNewDataset",
      requestType = com.github.ScienceObjectsDB.java_api.services.CreateDatasetRequest.class,
      responseType = com.github.ScienceObjectsDB.java_api.models.Dataset.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.CreateDatasetRequest,
      com.github.ScienceObjectsDB.java_api.models.Dataset> getCreateNewDatasetMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.CreateDatasetRequest, com.github.ScienceObjectsDB.java_api.models.Dataset> getCreateNewDatasetMethod;
    if ((getCreateNewDatasetMethod = DatasetServiceGrpc.getCreateNewDatasetMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getCreateNewDatasetMethod = DatasetServiceGrpc.getCreateNewDatasetMethod) == null) {
          DatasetServiceGrpc.getCreateNewDatasetMethod = getCreateNewDatasetMethod = 
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.services.CreateDatasetRequest, com.github.ScienceObjectsDB.java_api.models.Dataset>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "services.DatasetService", "CreateNewDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.services.CreateDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.Dataset.getDefaultInstance()))
                  .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("CreateNewDataset"))
                  .build();
          }
        }
     }
     return getCreateNewDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.models.Dataset> getDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Dataset",
      requestType = com.github.ScienceObjectsDB.java_api.models.ID.class,
      responseType = com.github.ScienceObjectsDB.java_api.models.Dataset.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.models.Dataset> getDatasetMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.models.Dataset> getDatasetMethod;
    if ((getDatasetMethod = DatasetServiceGrpc.getDatasetMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getDatasetMethod = DatasetServiceGrpc.getDatasetMethod) == null) {
          DatasetServiceGrpc.getDatasetMethod = getDatasetMethod = 
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.models.Dataset>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "services.DatasetService", "Dataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.Dataset.getDefaultInstance()))
                  .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("Dataset"))
                  .build();
          }
        }
     }
     return getDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.services.DatasetVersionList> getDatasetVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DatasetVersions",
      requestType = com.github.ScienceObjectsDB.java_api.models.ID.class,
      responseType = com.github.ScienceObjectsDB.java_api.services.DatasetVersionList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.services.DatasetVersionList> getDatasetVersionsMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.services.DatasetVersionList> getDatasetVersionsMethod;
    if ((getDatasetVersionsMethod = DatasetServiceGrpc.getDatasetVersionsMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getDatasetVersionsMethod = DatasetServiceGrpc.getDatasetVersionsMethod) == null) {
          DatasetServiceGrpc.getDatasetVersionsMethod = getDatasetVersionsMethod = 
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.services.DatasetVersionList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "services.DatasetService", "DatasetVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.services.DatasetVersionList.getDefaultInstance()))
                  .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("DatasetVersions"))
                  .build();
          }
        }
     }
     return getDatasetVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.services.ObjectGroupList> getDatasetObjectGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DatasetObjectGroups",
      requestType = com.github.ScienceObjectsDB.java_api.models.ID.class,
      responseType = com.github.ScienceObjectsDB.java_api.services.ObjectGroupList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.services.ObjectGroupList> getDatasetObjectGroupsMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.services.ObjectGroupList> getDatasetObjectGroupsMethod;
    if ((getDatasetObjectGroupsMethod = DatasetServiceGrpc.getDatasetObjectGroupsMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getDatasetObjectGroupsMethod = DatasetServiceGrpc.getDatasetObjectGroupsMethod) == null) {
          DatasetServiceGrpc.getDatasetObjectGroupsMethod = getDatasetObjectGroupsMethod = 
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.services.ObjectGroupList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "services.DatasetService", "DatasetObjectGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.services.ObjectGroupList.getDefaultInstance()))
                  .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("DatasetObjectGroups"))
                  .build();
          }
        }
     }
     return getDatasetObjectGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions> getCurrentObjectGroupVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CurrentObjectGroupVersions",
      requestType = com.github.ScienceObjectsDB.java_api.models.ID.class,
      responseType = com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions> getCurrentObjectGroupVersionsMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions> getCurrentObjectGroupVersionsMethod;
    if ((getCurrentObjectGroupVersionsMethod = DatasetServiceGrpc.getCurrentObjectGroupVersionsMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getCurrentObjectGroupVersionsMethod = DatasetServiceGrpc.getCurrentObjectGroupVersionsMethod) == null) {
          DatasetServiceGrpc.getCurrentObjectGroupVersionsMethod = getCurrentObjectGroupVersionsMethod = 
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "services.DatasetService", "CurrentObjectGroupVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions.getDefaultInstance()))
                  .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("CurrentObjectGroupVersions"))
                  .build();
          }
        }
     }
     return getCurrentObjectGroupVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.UpdateFieldsRequest,
      com.github.ScienceObjectsDB.java_api.models.Dataset> getUpdateDatasetFieldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDatasetField",
      requestType = com.github.ScienceObjectsDB.java_api.models.UpdateFieldsRequest.class,
      responseType = com.github.ScienceObjectsDB.java_api.models.Dataset.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.UpdateFieldsRequest,
      com.github.ScienceObjectsDB.java_api.models.Dataset> getUpdateDatasetFieldMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.UpdateFieldsRequest, com.github.ScienceObjectsDB.java_api.models.Dataset> getUpdateDatasetFieldMethod;
    if ((getUpdateDatasetFieldMethod = DatasetServiceGrpc.getUpdateDatasetFieldMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getUpdateDatasetFieldMethod = DatasetServiceGrpc.getUpdateDatasetFieldMethod) == null) {
          DatasetServiceGrpc.getUpdateDatasetFieldMethod = getUpdateDatasetFieldMethod = 
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.models.UpdateFieldsRequest, com.github.ScienceObjectsDB.java_api.models.Dataset>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "services.DatasetService", "UpdateDatasetField"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.UpdateFieldsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.Dataset.getDefaultInstance()))
                  .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("UpdateDatasetField"))
                  .build();
          }
        }
     }
     return getUpdateDatasetFieldMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.models.Empty> getDeleteDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDataset",
      requestType = com.github.ScienceObjectsDB.java_api.models.ID.class,
      responseType = com.github.ScienceObjectsDB.java_api.models.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.models.Empty> getDeleteDatasetMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.models.Empty> getDeleteDatasetMethod;
    if ((getDeleteDatasetMethod = DatasetServiceGrpc.getDeleteDatasetMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getDeleteDatasetMethod = DatasetServiceGrpc.getDeleteDatasetMethod) == null) {
          DatasetServiceGrpc.getDeleteDatasetMethod = getDeleteDatasetMethod = 
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.models.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "services.DatasetService", "DeleteDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("DeleteDataset"))
                  .build();
          }
        }
     }
     return getDeleteDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.ReleaseDatasetVersionRequest,
      com.github.ScienceObjectsDB.java_api.models.DatasetVersion> getReleaseDatasetVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReleaseDatasetVersion",
      requestType = com.github.ScienceObjectsDB.java_api.services.ReleaseDatasetVersionRequest.class,
      responseType = com.github.ScienceObjectsDB.java_api.models.DatasetVersion.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.ReleaseDatasetVersionRequest,
      com.github.ScienceObjectsDB.java_api.models.DatasetVersion> getReleaseDatasetVersionMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.services.ReleaseDatasetVersionRequest, com.github.ScienceObjectsDB.java_api.models.DatasetVersion> getReleaseDatasetVersionMethod;
    if ((getReleaseDatasetVersionMethod = DatasetServiceGrpc.getReleaseDatasetVersionMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getReleaseDatasetVersionMethod = DatasetServiceGrpc.getReleaseDatasetVersionMethod) == null) {
          DatasetServiceGrpc.getReleaseDatasetVersionMethod = getReleaseDatasetVersionMethod = 
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.services.ReleaseDatasetVersionRequest, com.github.ScienceObjectsDB.java_api.models.DatasetVersion>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "services.DatasetService", "ReleaseDatasetVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.services.ReleaseDatasetVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.DatasetVersion.getDefaultInstance()))
                  .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("ReleaseDatasetVersion"))
                  .build();
          }
        }
     }
     return getReleaseDatasetVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions> getDatasetVersionObjectGroupVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DatasetVersionObjectGroupVersions",
      requestType = com.github.ScienceObjectsDB.java_api.models.ID.class,
      responseType = com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID,
      com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions> getDatasetVersionObjectGroupVersionsMethod() {
    io.grpc.MethodDescriptor<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions> getDatasetVersionObjectGroupVersionsMethod;
    if ((getDatasetVersionObjectGroupVersionsMethod = DatasetServiceGrpc.getDatasetVersionObjectGroupVersionsMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getDatasetVersionObjectGroupVersionsMethod = DatasetServiceGrpc.getDatasetVersionObjectGroupVersionsMethod) == null) {
          DatasetServiceGrpc.getDatasetVersionObjectGroupVersionsMethod = getDatasetVersionObjectGroupVersionsMethod = 
              io.grpc.MethodDescriptor.<com.github.ScienceObjectsDB.java_api.models.ID, com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "services.DatasetService", "DatasetVersionObjectGroupVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.models.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions.getDefaultInstance()))
                  .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("DatasetVersionObjectGroupVersions"))
                  .build();
          }
        }
     }
     return getDatasetVersionObjectGroupVersionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DatasetServiceStub newStub(io.grpc.Channel channel) {
    return new DatasetServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DatasetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DatasetServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DatasetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DatasetServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Dataset management service
   * Manages all dataset related services
   * All data objects are associated with one data dataset
   * Dataset versions group these data objects, which makes them reusable
   * </pre>
   */
  public static abstract class DatasetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * CreateNewDataset Creates a new dataset and associates it with a dataset
     * </pre>
     */
    public void createNewDataset(com.github.ScienceObjectsDB.java_api.services.CreateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Dataset> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateNewDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Dataset Returns a specific dataset
     * </pre>
     */
    public void dataset(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Dataset> responseObserver) {
      asyncUnimplementedUnaryCall(getDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists Versions of a dataset
     * </pre>
     */
    public void datasetVersions(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.DatasetVersionList> responseObserver) {
      asyncUnimplementedUnaryCall(getDatasetVersionsMethod(), responseObserver);
    }

    /**
     */
    public void datasetObjectGroups(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.ObjectGroupList> responseObserver) {
      asyncUnimplementedUnaryCall(getDatasetObjectGroupsMethod(), responseObserver);
    }

    /**
     */
    public void currentObjectGroupVersions(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions> responseObserver) {
      asyncUnimplementedUnaryCall(getCurrentObjectGroupVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a field of a dataset
     * </pre>
     */
    public void updateDatasetField(com.github.ScienceObjectsDB.java_api.models.UpdateFieldsRequest request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Dataset> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateDatasetFieldMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteDataset Delete a dataset
     * </pre>
     */
    public void deleteDataset(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     *ReleaseDatasetVersion Release a new dataset version
     * </pre>
     */
    public void releaseDatasetVersion(com.github.ScienceObjectsDB.java_api.services.ReleaseDatasetVersionRequest request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.DatasetVersion> responseObserver) {
      asyncUnimplementedUnaryCall(getReleaseDatasetVersionMethod(), responseObserver);
    }

    /**
     */
    public void datasetVersionObjectGroupVersions(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions> responseObserver) {
      asyncUnimplementedUnaryCall(getDatasetVersionObjectGroupVersionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateNewDatasetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.services.CreateDatasetRequest,
                com.github.ScienceObjectsDB.java_api.models.Dataset>(
                  this, METHODID_CREATE_NEW_DATASET)))
          .addMethod(
            getDatasetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.models.ID,
                com.github.ScienceObjectsDB.java_api.models.Dataset>(
                  this, METHODID_DATASET)))
          .addMethod(
            getDatasetVersionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.models.ID,
                com.github.ScienceObjectsDB.java_api.services.DatasetVersionList>(
                  this, METHODID_DATASET_VERSIONS)))
          .addMethod(
            getDatasetObjectGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.models.ID,
                com.github.ScienceObjectsDB.java_api.services.ObjectGroupList>(
                  this, METHODID_DATASET_OBJECT_GROUPS)))
          .addMethod(
            getCurrentObjectGroupVersionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.models.ID,
                com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions>(
                  this, METHODID_CURRENT_OBJECT_GROUP_VERSIONS)))
          .addMethod(
            getUpdateDatasetFieldMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.models.UpdateFieldsRequest,
                com.github.ScienceObjectsDB.java_api.models.Dataset>(
                  this, METHODID_UPDATE_DATASET_FIELD)))
          .addMethod(
            getDeleteDatasetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.models.ID,
                com.github.ScienceObjectsDB.java_api.models.Empty>(
                  this, METHODID_DELETE_DATASET)))
          .addMethod(
            getReleaseDatasetVersionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.services.ReleaseDatasetVersionRequest,
                com.github.ScienceObjectsDB.java_api.models.DatasetVersion>(
                  this, METHODID_RELEASE_DATASET_VERSION)))
          .addMethod(
            getDatasetVersionObjectGroupVersionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.ScienceObjectsDB.java_api.models.ID,
                com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions>(
                  this, METHODID_DATASET_VERSION_OBJECT_GROUP_VERSIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * Dataset management service
   * Manages all dataset related services
   * All data objects are associated with one data dataset
   * Dataset versions group these data objects, which makes them reusable
   * </pre>
   */
  public static final class DatasetServiceStub extends io.grpc.stub.AbstractStub<DatasetServiceStub> {
    private DatasetServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatasetServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatasetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateNewDataset Creates a new dataset and associates it with a dataset
     * </pre>
     */
    public void createNewDataset(com.github.ScienceObjectsDB.java_api.services.CreateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Dataset> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateNewDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Dataset Returns a specific dataset
     * </pre>
     */
    public void dataset(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Dataset> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists Versions of a dataset
     * </pre>
     */
    public void datasetVersions(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.DatasetVersionList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDatasetVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void datasetObjectGroups(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.ObjectGroupList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDatasetObjectGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void currentObjectGroupVersions(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCurrentObjectGroupVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a field of a dataset
     * </pre>
     */
    public void updateDatasetField(com.github.ScienceObjectsDB.java_api.models.UpdateFieldsRequest request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Dataset> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateDatasetFieldMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteDataset Delete a dataset
     * </pre>
     */
    public void deleteDataset(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *ReleaseDatasetVersion Release a new dataset version
     * </pre>
     */
    public void releaseDatasetVersion(com.github.ScienceObjectsDB.java_api.services.ReleaseDatasetVersionRequest request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.DatasetVersion> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReleaseDatasetVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void datasetVersionObjectGroupVersions(com.github.ScienceObjectsDB.java_api.models.ID request,
        io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDatasetVersionObjectGroupVersionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Dataset management service
   * Manages all dataset related services
   * All data objects are associated with one data dataset
   * Dataset versions group these data objects, which makes them reusable
   * </pre>
   */
  public static final class DatasetServiceBlockingStub extends io.grpc.stub.AbstractStub<DatasetServiceBlockingStub> {
    private DatasetServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatasetServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatasetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateNewDataset Creates a new dataset and associates it with a dataset
     * </pre>
     */
    public com.github.ScienceObjectsDB.java_api.models.Dataset createNewDataset(com.github.ScienceObjectsDB.java_api.services.CreateDatasetRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateNewDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Dataset Returns a specific dataset
     * </pre>
     */
    public com.github.ScienceObjectsDB.java_api.models.Dataset dataset(com.github.ScienceObjectsDB.java_api.models.ID request) {
      return blockingUnaryCall(
          getChannel(), getDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists Versions of a dataset
     * </pre>
     */
    public com.github.ScienceObjectsDB.java_api.services.DatasetVersionList datasetVersions(com.github.ScienceObjectsDB.java_api.models.ID request) {
      return blockingUnaryCall(
          getChannel(), getDatasetVersionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.ScienceObjectsDB.java_api.services.ObjectGroupList datasetObjectGroups(com.github.ScienceObjectsDB.java_api.models.ID request) {
      return blockingUnaryCall(
          getChannel(), getDatasetObjectGroupsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions currentObjectGroupVersions(com.github.ScienceObjectsDB.java_api.models.ID request) {
      return blockingUnaryCall(
          getChannel(), getCurrentObjectGroupVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a field of a dataset
     * </pre>
     */
    public com.github.ScienceObjectsDB.java_api.models.Dataset updateDatasetField(com.github.ScienceObjectsDB.java_api.models.UpdateFieldsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateDatasetFieldMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteDataset Delete a dataset
     * </pre>
     */
    public com.github.ScienceObjectsDB.java_api.models.Empty deleteDataset(com.github.ScienceObjectsDB.java_api.models.ID request) {
      return blockingUnaryCall(
          getChannel(), getDeleteDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *ReleaseDatasetVersion Release a new dataset version
     * </pre>
     */
    public com.github.ScienceObjectsDB.java_api.models.DatasetVersion releaseDatasetVersion(com.github.ScienceObjectsDB.java_api.services.ReleaseDatasetVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getReleaseDatasetVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions datasetVersionObjectGroupVersions(com.github.ScienceObjectsDB.java_api.models.ID request) {
      return blockingUnaryCall(
          getChannel(), getDatasetVersionObjectGroupVersionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Dataset management service
   * Manages all dataset related services
   * All data objects are associated with one data dataset
   * Dataset versions group these data objects, which makes them reusable
   * </pre>
   */
  public static final class DatasetServiceFutureStub extends io.grpc.stub.AbstractStub<DatasetServiceFutureStub> {
    private DatasetServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatasetServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatasetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateNewDataset Creates a new dataset and associates it with a dataset
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.models.Dataset> createNewDataset(
        com.github.ScienceObjectsDB.java_api.services.CreateDatasetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateNewDatasetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Dataset Returns a specific dataset
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.models.Dataset> dataset(
        com.github.ScienceObjectsDB.java_api.models.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getDatasetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists Versions of a dataset
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.services.DatasetVersionList> datasetVersions(
        com.github.ScienceObjectsDB.java_api.models.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getDatasetVersionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.services.ObjectGroupList> datasetObjectGroups(
        com.github.ScienceObjectsDB.java_api.models.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getDatasetObjectGroupsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions> currentObjectGroupVersions(
        com.github.ScienceObjectsDB.java_api.models.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getCurrentObjectGroupVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a field of a dataset
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.models.Dataset> updateDatasetField(
        com.github.ScienceObjectsDB.java_api.models.UpdateFieldsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateDatasetFieldMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteDataset Delete a dataset
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.models.Empty> deleteDataset(
        com.github.ScienceObjectsDB.java_api.models.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteDatasetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *ReleaseDatasetVersion Release a new dataset version
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.models.DatasetVersion> releaseDatasetVersion(
        com.github.ScienceObjectsDB.java_api.services.ReleaseDatasetVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReleaseDatasetVersionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions> datasetVersionObjectGroupVersions(
        com.github.ScienceObjectsDB.java_api.models.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getDatasetVersionObjectGroupVersionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_NEW_DATASET = 0;
  private static final int METHODID_DATASET = 1;
  private static final int METHODID_DATASET_VERSIONS = 2;
  private static final int METHODID_DATASET_OBJECT_GROUPS = 3;
  private static final int METHODID_CURRENT_OBJECT_GROUP_VERSIONS = 4;
  private static final int METHODID_UPDATE_DATASET_FIELD = 5;
  private static final int METHODID_DELETE_DATASET = 6;
  private static final int METHODID_RELEASE_DATASET_VERSION = 7;
  private static final int METHODID_DATASET_VERSION_OBJECT_GROUP_VERSIONS = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DatasetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DatasetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_NEW_DATASET:
          serviceImpl.createNewDataset((com.github.ScienceObjectsDB.java_api.services.CreateDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Dataset>) responseObserver);
          break;
        case METHODID_DATASET:
          serviceImpl.dataset((com.github.ScienceObjectsDB.java_api.models.ID) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Dataset>) responseObserver);
          break;
        case METHODID_DATASET_VERSIONS:
          serviceImpl.datasetVersions((com.github.ScienceObjectsDB.java_api.models.ID) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.DatasetVersionList>) responseObserver);
          break;
        case METHODID_DATASET_OBJECT_GROUPS:
          serviceImpl.datasetObjectGroups((com.github.ScienceObjectsDB.java_api.models.ID) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.ObjectGroupList>) responseObserver);
          break;
        case METHODID_CURRENT_OBJECT_GROUP_VERSIONS:
          serviceImpl.currentObjectGroupVersions((com.github.ScienceObjectsDB.java_api.models.ID) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions>) responseObserver);
          break;
        case METHODID_UPDATE_DATASET_FIELD:
          serviceImpl.updateDatasetField((com.github.ScienceObjectsDB.java_api.models.UpdateFieldsRequest) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Dataset>) responseObserver);
          break;
        case METHODID_DELETE_DATASET:
          serviceImpl.deleteDataset((com.github.ScienceObjectsDB.java_api.models.ID) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.Empty>) responseObserver);
          break;
        case METHODID_RELEASE_DATASET_VERSION:
          serviceImpl.releaseDatasetVersion((com.github.ScienceObjectsDB.java_api.services.ReleaseDatasetVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.models.DatasetVersion>) responseObserver);
          break;
        case METHODID_DATASET_VERSION_OBJECT_GROUP_VERSIONS:
          serviceImpl.datasetVersionObjectGroupVersions((com.github.ScienceObjectsDB.java_api.models.ID) request,
              (io.grpc.stub.StreamObserver<com.github.ScienceObjectsDB.java_api.services.ObjectGroupVersions>) responseObserver);
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

  private static abstract class DatasetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DatasetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.ScienceObjectsDB.java_api.services.DatasetServices.getDescriptor();
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
              .addMethod(getCreateNewDatasetMethod())
              .addMethod(getDatasetMethod())
              .addMethod(getDatasetVersionsMethod())
              .addMethod(getDatasetObjectGroupsMethod())
              .addMethod(getCurrentObjectGroupVersionsMethod())
              .addMethod(getUpdateDatasetFieldMethod())
              .addMethod(getDeleteDatasetMethod())
              .addMethod(getReleaseDatasetVersionMethod())
              .addMethod(getDatasetVersionObjectGroupVersionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
