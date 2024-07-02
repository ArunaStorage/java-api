package com.aruna.api.storage.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * StorageStatusService
 * Status: BETA
 * This is a generic service that contains utility functions 
 * these functions are used to query additional meta-information
 * about the status of storage components
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: aruna/api/storage/services/v2/info_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StorageStatusServiceGrpc {

  private StorageStatusServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "aruna.api.storage.services.v2.StorageStatusService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetStorageVersionRequest,
      com.aruna.api.storage.services.v2.GetStorageVersionResponse> getGetStorageVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStorageVersion",
      requestType = com.aruna.api.storage.services.v2.GetStorageVersionRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetStorageVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetStorageVersionRequest,
      com.aruna.api.storage.services.v2.GetStorageVersionResponse> getGetStorageVersionMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetStorageVersionRequest, com.aruna.api.storage.services.v2.GetStorageVersionResponse> getGetStorageVersionMethod;
    if ((getGetStorageVersionMethod = StorageStatusServiceGrpc.getGetStorageVersionMethod) == null) {
      synchronized (StorageStatusServiceGrpc.class) {
        if ((getGetStorageVersionMethod = StorageStatusServiceGrpc.getGetStorageVersionMethod) == null) {
          StorageStatusServiceGrpc.getGetStorageVersionMethod = getGetStorageVersionMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetStorageVersionRequest, com.aruna.api.storage.services.v2.GetStorageVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStorageVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetStorageVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetStorageVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageStatusServiceMethodDescriptorSupplier("GetStorageVersion"))
              .build();
        }
      }
    }
    return getGetStorageVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetStorageStatusRequest,
      com.aruna.api.storage.services.v2.GetStorageStatusResponse> getGetStorageStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStorageStatus",
      requestType = com.aruna.api.storage.services.v2.GetStorageStatusRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetStorageStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetStorageStatusRequest,
      com.aruna.api.storage.services.v2.GetStorageStatusResponse> getGetStorageStatusMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetStorageStatusRequest, com.aruna.api.storage.services.v2.GetStorageStatusResponse> getGetStorageStatusMethod;
    if ((getGetStorageStatusMethod = StorageStatusServiceGrpc.getGetStorageStatusMethod) == null) {
      synchronized (StorageStatusServiceGrpc.class) {
        if ((getGetStorageStatusMethod = StorageStatusServiceGrpc.getGetStorageStatusMethod) == null) {
          StorageStatusServiceGrpc.getGetStorageStatusMethod = getGetStorageStatusMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetStorageStatusRequest, com.aruna.api.storage.services.v2.GetStorageStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStorageStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetStorageStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetStorageStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageStatusServiceMethodDescriptorSupplier("GetStorageStatus"))
              .build();
        }
      }
    }
    return getGetStorageStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetPubkeysRequest,
      com.aruna.api.storage.services.v2.GetPubkeysResponse> getGetPubkeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPubkeys",
      requestType = com.aruna.api.storage.services.v2.GetPubkeysRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetPubkeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetPubkeysRequest,
      com.aruna.api.storage.services.v2.GetPubkeysResponse> getGetPubkeysMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetPubkeysRequest, com.aruna.api.storage.services.v2.GetPubkeysResponse> getGetPubkeysMethod;
    if ((getGetPubkeysMethod = StorageStatusServiceGrpc.getGetPubkeysMethod) == null) {
      synchronized (StorageStatusServiceGrpc.class) {
        if ((getGetPubkeysMethod = StorageStatusServiceGrpc.getGetPubkeysMethod) == null) {
          StorageStatusServiceGrpc.getGetPubkeysMethod = getGetPubkeysMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetPubkeysRequest, com.aruna.api.storage.services.v2.GetPubkeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPubkeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetPubkeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetPubkeysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageStatusServiceMethodDescriptorSupplier("GetPubkeys"))
              .build();
        }
      }
    }
    return getGetPubkeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetAnnouncementsRequest,
      com.aruna.api.storage.services.v2.GetAnnouncementsResponse> getGetAnnouncementsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnnouncements",
      requestType = com.aruna.api.storage.services.v2.GetAnnouncementsRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetAnnouncementsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetAnnouncementsRequest,
      com.aruna.api.storage.services.v2.GetAnnouncementsResponse> getGetAnnouncementsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetAnnouncementsRequest, com.aruna.api.storage.services.v2.GetAnnouncementsResponse> getGetAnnouncementsMethod;
    if ((getGetAnnouncementsMethod = StorageStatusServiceGrpc.getGetAnnouncementsMethod) == null) {
      synchronized (StorageStatusServiceGrpc.class) {
        if ((getGetAnnouncementsMethod = StorageStatusServiceGrpc.getGetAnnouncementsMethod) == null) {
          StorageStatusServiceGrpc.getGetAnnouncementsMethod = getGetAnnouncementsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetAnnouncementsRequest, com.aruna.api.storage.services.v2.GetAnnouncementsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnnouncements"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetAnnouncementsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetAnnouncementsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageStatusServiceMethodDescriptorSupplier("GetAnnouncements"))
              .build();
        }
      }
    }
    return getGetAnnouncementsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetAnnouncementsByTypeRequest,
      com.aruna.api.storage.services.v2.GetAnnouncementsByTypeResponse> getGetAnnouncementsByTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnnouncementsByType",
      requestType = com.aruna.api.storage.services.v2.GetAnnouncementsByTypeRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetAnnouncementsByTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetAnnouncementsByTypeRequest,
      com.aruna.api.storage.services.v2.GetAnnouncementsByTypeResponse> getGetAnnouncementsByTypeMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetAnnouncementsByTypeRequest, com.aruna.api.storage.services.v2.GetAnnouncementsByTypeResponse> getGetAnnouncementsByTypeMethod;
    if ((getGetAnnouncementsByTypeMethod = StorageStatusServiceGrpc.getGetAnnouncementsByTypeMethod) == null) {
      synchronized (StorageStatusServiceGrpc.class) {
        if ((getGetAnnouncementsByTypeMethod = StorageStatusServiceGrpc.getGetAnnouncementsByTypeMethod) == null) {
          StorageStatusServiceGrpc.getGetAnnouncementsByTypeMethod = getGetAnnouncementsByTypeMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetAnnouncementsByTypeRequest, com.aruna.api.storage.services.v2.GetAnnouncementsByTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnnouncementsByType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetAnnouncementsByTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetAnnouncementsByTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageStatusServiceMethodDescriptorSupplier("GetAnnouncementsByType"))
              .build();
        }
      }
    }
    return getGetAnnouncementsByTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetAnnouncementRequest,
      com.aruna.api.storage.services.v2.GetAnnouncementResponse> getGetAnnouncementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnnouncement",
      requestType = com.aruna.api.storage.services.v2.GetAnnouncementRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetAnnouncementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetAnnouncementRequest,
      com.aruna.api.storage.services.v2.GetAnnouncementResponse> getGetAnnouncementMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetAnnouncementRequest, com.aruna.api.storage.services.v2.GetAnnouncementResponse> getGetAnnouncementMethod;
    if ((getGetAnnouncementMethod = StorageStatusServiceGrpc.getGetAnnouncementMethod) == null) {
      synchronized (StorageStatusServiceGrpc.class) {
        if ((getGetAnnouncementMethod = StorageStatusServiceGrpc.getGetAnnouncementMethod) == null) {
          StorageStatusServiceGrpc.getGetAnnouncementMethod = getGetAnnouncementMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetAnnouncementRequest, com.aruna.api.storage.services.v2.GetAnnouncementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnnouncement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetAnnouncementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetAnnouncementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageStatusServiceMethodDescriptorSupplier("GetAnnouncement"))
              .build();
        }
      }
    }
    return getGetAnnouncementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.SetAnnouncementsRequest,
      com.aruna.api.storage.services.v2.SetAnnouncementsResponse> getSetAnnouncementsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAnnouncements",
      requestType = com.aruna.api.storage.services.v2.SetAnnouncementsRequest.class,
      responseType = com.aruna.api.storage.services.v2.SetAnnouncementsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.SetAnnouncementsRequest,
      com.aruna.api.storage.services.v2.SetAnnouncementsResponse> getSetAnnouncementsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.SetAnnouncementsRequest, com.aruna.api.storage.services.v2.SetAnnouncementsResponse> getSetAnnouncementsMethod;
    if ((getSetAnnouncementsMethod = StorageStatusServiceGrpc.getSetAnnouncementsMethod) == null) {
      synchronized (StorageStatusServiceGrpc.class) {
        if ((getSetAnnouncementsMethod = StorageStatusServiceGrpc.getSetAnnouncementsMethod) == null) {
          StorageStatusServiceGrpc.getSetAnnouncementsMethod = getSetAnnouncementsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.SetAnnouncementsRequest, com.aruna.api.storage.services.v2.SetAnnouncementsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAnnouncements"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.SetAnnouncementsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.SetAnnouncementsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageStatusServiceMethodDescriptorSupplier("SetAnnouncements"))
              .build();
        }
      }
    }
    return getSetAnnouncementsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StorageStatusServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageStatusServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageStatusServiceStub>() {
        @java.lang.Override
        public StorageStatusServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageStatusServiceStub(channel, callOptions);
        }
      };
    return StorageStatusServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StorageStatusServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageStatusServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageStatusServiceBlockingStub>() {
        @java.lang.Override
        public StorageStatusServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageStatusServiceBlockingStub(channel, callOptions);
        }
      };
    return StorageStatusServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StorageStatusServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageStatusServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageStatusServiceFutureStub>() {
        @java.lang.Override
        public StorageStatusServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageStatusServiceFutureStub(channel, callOptions);
        }
      };
    return StorageStatusServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * StorageStatusService
   * Status: BETA
   * This is a generic service that contains utility functions 
   * these functions are used to query additional meta-information
   * about the status of storage components
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * GetStorageVersion
     * Status: BETA
     * A request to get the current version of the server application
     * String representation and https://semver.org/
     * </pre>
     */
    default void getStorageVersion(com.aruna.api.storage.services.v2.GetStorageVersionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetStorageVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStorageVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetStorageStatus
     * Status: ALPHA
     * A request to get the current status of the storage components by location(s)
     * </pre>
     */
    default void getStorageStatus(com.aruna.api.storage.services.v2.GetStorageStatusRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetStorageStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStorageStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPubkeys
     * Status: BETA
     * Get all public keys of all storage components
     * </pre>
     */
    default void getPubkeys(com.aruna.api.storage.services.v2.GetPubkeysRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetPubkeysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPubkeysMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get Announcements
     * Status: BETA
     * Query global announcements optionally filtered by specific ids. 
     *  - Returns all announcements if no ids are provided
     *  - Returns only the specific announcements if ids are provided
     * </pre>
     */
    default void getAnnouncements(com.aruna.api.storage.services.v2.GetAnnouncementsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetAnnouncementsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnnouncementsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAnnouncementsByType
     * Status: BETA
     * Query global announcements by type
     * </pre>
     */
    default void getAnnouncementsByType(com.aruna.api.storage.services.v2.GetAnnouncementsByTypeRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetAnnouncementsByTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnnouncementsByTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a specific Announcement
     * Status: BETA
     * Query a specific global announcement by its id
     * </pre>
     */
    default void getAnnouncement(com.aruna.api.storage.services.v2.GetAnnouncementRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetAnnouncementResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnnouncementMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetAnnouncements
     * Status: BETA
     * Update / add global announcements
     * </pre>
     */
    default void setAnnouncements(com.aruna.api.storage.services.v2.SetAnnouncementsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.SetAnnouncementsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAnnouncementsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StorageStatusService.
   * <pre>
   * StorageStatusService
   * Status: BETA
   * This is a generic service that contains utility functions 
   * these functions are used to query additional meta-information
   * about the status of storage components
   * </pre>
   */
  public static abstract class StorageStatusServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StorageStatusServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StorageStatusService.
   * <pre>
   * StorageStatusService
   * Status: BETA
   * This is a generic service that contains utility functions 
   * these functions are used to query additional meta-information
   * about the status of storage components
   * </pre>
   */
  public static final class StorageStatusServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StorageStatusServiceStub> {
    private StorageStatusServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageStatusServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageStatusServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetStorageVersion
     * Status: BETA
     * A request to get the current version of the server application
     * String representation and https://semver.org/
     * </pre>
     */
    public void getStorageVersion(com.aruna.api.storage.services.v2.GetStorageVersionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetStorageVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStorageVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetStorageStatus
     * Status: ALPHA
     * A request to get the current status of the storage components by location(s)
     * </pre>
     */
    public void getStorageStatus(com.aruna.api.storage.services.v2.GetStorageStatusRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetStorageStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStorageStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetPubkeys
     * Status: BETA
     * Get all public keys of all storage components
     * </pre>
     */
    public void getPubkeys(com.aruna.api.storage.services.v2.GetPubkeysRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetPubkeysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPubkeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get Announcements
     * Status: BETA
     * Query global announcements optionally filtered by specific ids. 
     *  - Returns all announcements if no ids are provided
     *  - Returns only the specific announcements if ids are provided
     * </pre>
     */
    public void getAnnouncements(com.aruna.api.storage.services.v2.GetAnnouncementsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetAnnouncementsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnnouncementsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAnnouncementsByType
     * Status: BETA
     * Query global announcements by type
     * </pre>
     */
    public void getAnnouncementsByType(com.aruna.api.storage.services.v2.GetAnnouncementsByTypeRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetAnnouncementsByTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnnouncementsByTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a specific Announcement
     * Status: BETA
     * Query a specific global announcement by its id
     * </pre>
     */
    public void getAnnouncement(com.aruna.api.storage.services.v2.GetAnnouncementRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetAnnouncementResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnnouncementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetAnnouncements
     * Status: BETA
     * Update / add global announcements
     * </pre>
     */
    public void setAnnouncements(com.aruna.api.storage.services.v2.SetAnnouncementsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.SetAnnouncementsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAnnouncementsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StorageStatusService.
   * <pre>
   * StorageStatusService
   * Status: BETA
   * This is a generic service that contains utility functions 
   * these functions are used to query additional meta-information
   * about the status of storage components
   * </pre>
   */
  public static final class StorageStatusServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StorageStatusServiceBlockingStub> {
    private StorageStatusServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageStatusServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageStatusServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetStorageVersion
     * Status: BETA
     * A request to get the current version of the server application
     * String representation and https://semver.org/
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetStorageVersionResponse getStorageVersion(com.aruna.api.storage.services.v2.GetStorageVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStorageVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetStorageStatus
     * Status: ALPHA
     * A request to get the current status of the storage components by location(s)
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetStorageStatusResponse getStorageStatus(com.aruna.api.storage.services.v2.GetStorageStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStorageStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPubkeys
     * Status: BETA
     * Get all public keys of all storage components
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetPubkeysResponse getPubkeys(com.aruna.api.storage.services.v2.GetPubkeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPubkeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get Announcements
     * Status: BETA
     * Query global announcements optionally filtered by specific ids. 
     *  - Returns all announcements if no ids are provided
     *  - Returns only the specific announcements if ids are provided
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetAnnouncementsResponse getAnnouncements(com.aruna.api.storage.services.v2.GetAnnouncementsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnnouncementsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAnnouncementsByType
     * Status: BETA
     * Query global announcements by type
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetAnnouncementsByTypeResponse getAnnouncementsByType(com.aruna.api.storage.services.v2.GetAnnouncementsByTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnnouncementsByTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a specific Announcement
     * Status: BETA
     * Query a specific global announcement by its id
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetAnnouncementResponse getAnnouncement(com.aruna.api.storage.services.v2.GetAnnouncementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnnouncementMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetAnnouncements
     * Status: BETA
     * Update / add global announcements
     * </pre>
     */
    public com.aruna.api.storage.services.v2.SetAnnouncementsResponse setAnnouncements(com.aruna.api.storage.services.v2.SetAnnouncementsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAnnouncementsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StorageStatusService.
   * <pre>
   * StorageStatusService
   * Status: BETA
   * This is a generic service that contains utility functions 
   * these functions are used to query additional meta-information
   * about the status of storage components
   * </pre>
   */
  public static final class StorageStatusServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StorageStatusServiceFutureStub> {
    private StorageStatusServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageStatusServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageStatusServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetStorageVersion
     * Status: BETA
     * A request to get the current version of the server application
     * String representation and https://semver.org/
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetStorageVersionResponse> getStorageVersion(
        com.aruna.api.storage.services.v2.GetStorageVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStorageVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetStorageStatus
     * Status: ALPHA
     * A request to get the current status of the storage components by location(s)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetStorageStatusResponse> getStorageStatus(
        com.aruna.api.storage.services.v2.GetStorageStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStorageStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetPubkeys
     * Status: BETA
     * Get all public keys of all storage components
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetPubkeysResponse> getPubkeys(
        com.aruna.api.storage.services.v2.GetPubkeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPubkeysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get Announcements
     * Status: BETA
     * Query global announcements optionally filtered by specific ids. 
     *  - Returns all announcements if no ids are provided
     *  - Returns only the specific announcements if ids are provided
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetAnnouncementsResponse> getAnnouncements(
        com.aruna.api.storage.services.v2.GetAnnouncementsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnnouncementsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAnnouncementsByType
     * Status: BETA
     * Query global announcements by type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetAnnouncementsByTypeResponse> getAnnouncementsByType(
        com.aruna.api.storage.services.v2.GetAnnouncementsByTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnnouncementsByTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a specific Announcement
     * Status: BETA
     * Query a specific global announcement by its id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetAnnouncementResponse> getAnnouncement(
        com.aruna.api.storage.services.v2.GetAnnouncementRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnnouncementMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetAnnouncements
     * Status: BETA
     * Update / add global announcements
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.SetAnnouncementsResponse> setAnnouncements(
        com.aruna.api.storage.services.v2.SetAnnouncementsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAnnouncementsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STORAGE_VERSION = 0;
  private static final int METHODID_GET_STORAGE_STATUS = 1;
  private static final int METHODID_GET_PUBKEYS = 2;
  private static final int METHODID_GET_ANNOUNCEMENTS = 3;
  private static final int METHODID_GET_ANNOUNCEMENTS_BY_TYPE = 4;
  private static final int METHODID_GET_ANNOUNCEMENT = 5;
  private static final int METHODID_SET_ANNOUNCEMENTS = 6;

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
        case METHODID_GET_STORAGE_VERSION:
          serviceImpl.getStorageVersion((com.aruna.api.storage.services.v2.GetStorageVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetStorageVersionResponse>) responseObserver);
          break;
        case METHODID_GET_STORAGE_STATUS:
          serviceImpl.getStorageStatus((com.aruna.api.storage.services.v2.GetStorageStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetStorageStatusResponse>) responseObserver);
          break;
        case METHODID_GET_PUBKEYS:
          serviceImpl.getPubkeys((com.aruna.api.storage.services.v2.GetPubkeysRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetPubkeysResponse>) responseObserver);
          break;
        case METHODID_GET_ANNOUNCEMENTS:
          serviceImpl.getAnnouncements((com.aruna.api.storage.services.v2.GetAnnouncementsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetAnnouncementsResponse>) responseObserver);
          break;
        case METHODID_GET_ANNOUNCEMENTS_BY_TYPE:
          serviceImpl.getAnnouncementsByType((com.aruna.api.storage.services.v2.GetAnnouncementsByTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetAnnouncementsByTypeResponse>) responseObserver);
          break;
        case METHODID_GET_ANNOUNCEMENT:
          serviceImpl.getAnnouncement((com.aruna.api.storage.services.v2.GetAnnouncementRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetAnnouncementResponse>) responseObserver);
          break;
        case METHODID_SET_ANNOUNCEMENTS:
          serviceImpl.setAnnouncements((com.aruna.api.storage.services.v2.SetAnnouncementsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.SetAnnouncementsResponse>) responseObserver);
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
          getGetStorageVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetStorageVersionRequest,
              com.aruna.api.storage.services.v2.GetStorageVersionResponse>(
                service, METHODID_GET_STORAGE_VERSION)))
        .addMethod(
          getGetStorageStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetStorageStatusRequest,
              com.aruna.api.storage.services.v2.GetStorageStatusResponse>(
                service, METHODID_GET_STORAGE_STATUS)))
        .addMethod(
          getGetPubkeysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetPubkeysRequest,
              com.aruna.api.storage.services.v2.GetPubkeysResponse>(
                service, METHODID_GET_PUBKEYS)))
        .addMethod(
          getGetAnnouncementsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetAnnouncementsRequest,
              com.aruna.api.storage.services.v2.GetAnnouncementsResponse>(
                service, METHODID_GET_ANNOUNCEMENTS)))
        .addMethod(
          getGetAnnouncementsByTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetAnnouncementsByTypeRequest,
              com.aruna.api.storage.services.v2.GetAnnouncementsByTypeResponse>(
                service, METHODID_GET_ANNOUNCEMENTS_BY_TYPE)))
        .addMethod(
          getGetAnnouncementMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetAnnouncementRequest,
              com.aruna.api.storage.services.v2.GetAnnouncementResponse>(
                service, METHODID_GET_ANNOUNCEMENT)))
        .addMethod(
          getSetAnnouncementsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.SetAnnouncementsRequest,
              com.aruna.api.storage.services.v2.SetAnnouncementsResponse>(
                service, METHODID_SET_ANNOUNCEMENTS)))
        .build();
  }

  private static abstract class StorageStatusServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StorageStatusServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.storage.services.v2.InfoServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StorageStatusService");
    }
  }

  private static final class StorageStatusServiceFileDescriptorSupplier
      extends StorageStatusServiceBaseDescriptorSupplier {
    StorageStatusServiceFileDescriptorSupplier() {}
  }

  private static final class StorageStatusServiceMethodDescriptorSupplier
      extends StorageStatusServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    StorageStatusServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (StorageStatusServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StorageStatusServiceFileDescriptorSupplier())
              .addMethod(getGetStorageVersionMethod())
              .addMethod(getGetStorageStatusMethod())
              .addMethod(getGetPubkeysMethod())
              .addMethod(getGetAnnouncementsMethod())
              .addMethod(getGetAnnouncementsByTypeMethod())
              .addMethod(getGetAnnouncementMethod())
              .addMethod(getSetAnnouncementsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
