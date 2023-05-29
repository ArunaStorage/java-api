package com.aruna.api.storage.services.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * CollectionService
 * Contains all methods that get/create or update Collection and associated resources
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/storage/services/v1/collection_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CollectionServiceGrpc {

  private CollectionServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.storage.services.v1.CollectionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.CollectionServiceProto.CreateNewCollectionRequest,
      com.aruna.api.storage.services.v1.CollectionServiceProto.CreateNewCollectionResponse> getCreateNewCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNewCollection",
      requestType = com.aruna.api.storage.services.v1.CollectionServiceProto.CreateNewCollectionRequest.class,
      responseType = com.aruna.api.storage.services.v1.CollectionServiceProto.CreateNewCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.CollectionServiceProto.CreateNewCollectionRequest,
      com.aruna.api.storage.services.v1.CollectionServiceProto.CreateNewCollectionResponse> getCreateNewCollectionMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.CollectionServiceProto.CreateNewCollectionRequest, com.aruna.api.storage.services.v1.CollectionServiceProto.CreateNewCollectionResponse> getCreateNewCollectionMethod;
    if ((getCreateNewCollectionMethod = CollectionServiceGrpc.getCreateNewCollectionMethod) == null) {
      synchronized (CollectionServiceGrpc.class) {
        if ((getCreateNewCollectionMethod = CollectionServiceGrpc.getCreateNewCollectionMethod) == null) {
          CollectionServiceGrpc.getCreateNewCollectionMethod = getCreateNewCollectionMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.CollectionServiceProto.CreateNewCollectionRequest, com.aruna.api.storage.services.v1.CollectionServiceProto.CreateNewCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNewCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.CollectionServiceProto.CreateNewCollectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.CollectionServiceProto.CreateNewCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CollectionServiceMethodDescriptorSupplier("CreateNewCollection"))
              .build();
        }
      }
    }
    return getCreateNewCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionByIDRequest,
      com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionByIDResponse> getGetCollectionByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCollectionByID",
      requestType = com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionByIDRequest.class,
      responseType = com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionByIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionByIDRequest,
      com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionByIDResponse> getGetCollectionByIDMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionByIDRequest, com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionByIDResponse> getGetCollectionByIDMethod;
    if ((getGetCollectionByIDMethod = CollectionServiceGrpc.getGetCollectionByIDMethod) == null) {
      synchronized (CollectionServiceGrpc.class) {
        if ((getGetCollectionByIDMethod = CollectionServiceGrpc.getGetCollectionByIDMethod) == null) {
          CollectionServiceGrpc.getGetCollectionByIDMethod = getGetCollectionByIDMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionByIDRequest, com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionByIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCollectionByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionByIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CollectionServiceMethodDescriptorSupplier("GetCollectionByID"))
              .build();
        }
      }
    }
    return getGetCollectionByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionsRequest,
      com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionsResponse> getGetCollectionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCollections",
      requestType = com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionsRequest.class,
      responseType = com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionsRequest,
      com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionsResponse> getGetCollectionsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionsRequest, com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionsResponse> getGetCollectionsMethod;
    if ((getGetCollectionsMethod = CollectionServiceGrpc.getGetCollectionsMethod) == null) {
      synchronized (CollectionServiceGrpc.class) {
        if ((getGetCollectionsMethod = CollectionServiceGrpc.getGetCollectionsMethod) == null) {
          CollectionServiceGrpc.getGetCollectionsMethod = getGetCollectionsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionsRequest, com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCollections"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CollectionServiceMethodDescriptorSupplier("GetCollections"))
              .build();
        }
      }
    }
    return getGetCollectionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.CollectionServiceProto.UpdateCollectionRequest,
      com.aruna.api.storage.services.v1.CollectionServiceProto.UpdateCollectionResponse> getUpdateCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCollection",
      requestType = com.aruna.api.storage.services.v1.CollectionServiceProto.UpdateCollectionRequest.class,
      responseType = com.aruna.api.storage.services.v1.CollectionServiceProto.UpdateCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.CollectionServiceProto.UpdateCollectionRequest,
      com.aruna.api.storage.services.v1.CollectionServiceProto.UpdateCollectionResponse> getUpdateCollectionMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.CollectionServiceProto.UpdateCollectionRequest, com.aruna.api.storage.services.v1.CollectionServiceProto.UpdateCollectionResponse> getUpdateCollectionMethod;
    if ((getUpdateCollectionMethod = CollectionServiceGrpc.getUpdateCollectionMethod) == null) {
      synchronized (CollectionServiceGrpc.class) {
        if ((getUpdateCollectionMethod = CollectionServiceGrpc.getUpdateCollectionMethod) == null) {
          CollectionServiceGrpc.getUpdateCollectionMethod = getUpdateCollectionMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.CollectionServiceProto.UpdateCollectionRequest, com.aruna.api.storage.services.v1.CollectionServiceProto.UpdateCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.CollectionServiceProto.UpdateCollectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.CollectionServiceProto.UpdateCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CollectionServiceMethodDescriptorSupplier("UpdateCollection"))
              .build();
        }
      }
    }
    return getUpdateCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.CollectionServiceProto.PinCollectionVersionRequest,
      com.aruna.api.storage.services.v1.CollectionServiceProto.PinCollectionVersionResponse> getPinCollectionVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PinCollectionVersion",
      requestType = com.aruna.api.storage.services.v1.CollectionServiceProto.PinCollectionVersionRequest.class,
      responseType = com.aruna.api.storage.services.v1.CollectionServiceProto.PinCollectionVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.CollectionServiceProto.PinCollectionVersionRequest,
      com.aruna.api.storage.services.v1.CollectionServiceProto.PinCollectionVersionResponse> getPinCollectionVersionMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.CollectionServiceProto.PinCollectionVersionRequest, com.aruna.api.storage.services.v1.CollectionServiceProto.PinCollectionVersionResponse> getPinCollectionVersionMethod;
    if ((getPinCollectionVersionMethod = CollectionServiceGrpc.getPinCollectionVersionMethod) == null) {
      synchronized (CollectionServiceGrpc.class) {
        if ((getPinCollectionVersionMethod = CollectionServiceGrpc.getPinCollectionVersionMethod) == null) {
          CollectionServiceGrpc.getPinCollectionVersionMethod = getPinCollectionVersionMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.CollectionServiceProto.PinCollectionVersionRequest, com.aruna.api.storage.services.v1.CollectionServiceProto.PinCollectionVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PinCollectionVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.CollectionServiceProto.PinCollectionVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.CollectionServiceProto.PinCollectionVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CollectionServiceMethodDescriptorSupplier("PinCollectionVersion"))
              .build();
        }
      }
    }
    return getPinCollectionVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.CollectionServiceProto.DeleteCollectionRequest,
      com.aruna.api.storage.services.v1.CollectionServiceProto.DeleteCollectionResponse> getDeleteCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCollection",
      requestType = com.aruna.api.storage.services.v1.CollectionServiceProto.DeleteCollectionRequest.class,
      responseType = com.aruna.api.storage.services.v1.CollectionServiceProto.DeleteCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.CollectionServiceProto.DeleteCollectionRequest,
      com.aruna.api.storage.services.v1.CollectionServiceProto.DeleteCollectionResponse> getDeleteCollectionMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.CollectionServiceProto.DeleteCollectionRequest, com.aruna.api.storage.services.v1.CollectionServiceProto.DeleteCollectionResponse> getDeleteCollectionMethod;
    if ((getDeleteCollectionMethod = CollectionServiceGrpc.getDeleteCollectionMethod) == null) {
      synchronized (CollectionServiceGrpc.class) {
        if ((getDeleteCollectionMethod = CollectionServiceGrpc.getDeleteCollectionMethod) == null) {
          CollectionServiceGrpc.getDeleteCollectionMethod = getDeleteCollectionMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.CollectionServiceProto.DeleteCollectionRequest, com.aruna.api.storage.services.v1.CollectionServiceProto.DeleteCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.CollectionServiceProto.DeleteCollectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.CollectionServiceProto.DeleteCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CollectionServiceMethodDescriptorSupplier("DeleteCollection"))
              .build();
        }
      }
    }
    return getDeleteCollectionMethod;
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
   * Contains all methods that get/create or update Collection and associated resources
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateNewCollection
     * Status: STABLE
     * creates a new Collection
     * </pre>
     */
    default void createNewCollection(com.aruna.api.storage.services.v1.CollectionServiceProto.CreateNewCollectionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.CollectionServiceProto.CreateNewCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNewCollectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetCollectionByID
     * Status: STABLE
     * Queries a specific Collection by ID
     * The result can be one_of:
     * CollectionOverview -&gt; default
     * CollectionWithID
     * Collection (full)
     * This can be modified with the optional OutputFormat parameter
     * </pre>
     */
    default void getCollectionByID(com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionByIDRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionByIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCollectionByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetCollections
     * Status: STABLE
     * queries multiple collections by ID or by LabelFilter
     * This returns by default a paginated result with 20 entries.
     * Must specify a project_id as context
     * </pre>
     */
    default void getCollections(com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCollectionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateCollection
     * Status: STABLE
     * Updates the current collection
     * This will update the collection in place if it is unversioned / latest
     * A versioned (pinned) collection requires a new semantic version after the
     * update This can be used to pin a collection to a specific version similar
     * to the PinCollectionVersion request
     * </pre>
     */
    default void updateCollection(com.aruna.api.storage.services.v1.CollectionServiceProto.UpdateCollectionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.CollectionServiceProto.UpdateCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCollectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * PinCollectionVersion
     * Status: STABLE
     * This pins the current status of the version to a
     * specific version. Effectively creating a copy of the collection with a
     * stable version All objects will be pinned to an explicit revision number
     * Pinned collections can not be updated in place
     * </pre>
     */
    default void pinCollectionVersion(com.aruna.api.storage.services.v1.CollectionServiceProto.PinCollectionVersionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.CollectionServiceProto.PinCollectionVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPinCollectionVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteCollection
     * Status: STABLE
     * This request deletes the collection.
     * If with_version is true, it deletes the collection and all its versions.
     * If cascade is true, all objects that are owned by the collection will also
     * deleted. This should be avoided
     * </pre>
     */
    default void deleteCollection(com.aruna.api.storage.services.v1.CollectionServiceProto.DeleteCollectionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.CollectionServiceProto.DeleteCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCollectionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CollectionService.
   * <pre>
   * CollectionService
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
     * Status: STABLE
     * creates a new Collection
     * </pre>
     */
    public void createNewCollection(com.aruna.api.storage.services.v1.CollectionServiceProto.CreateNewCollectionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.CollectionServiceProto.CreateNewCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNewCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetCollectionByID
     * Status: STABLE
     * Queries a specific Collection by ID
     * The result can be one_of:
     * CollectionOverview -&gt; default
     * CollectionWithID
     * Collection (full)
     * This can be modified with the optional OutputFormat parameter
     * </pre>
     */
    public void getCollectionByID(com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionByIDRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionByIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCollectionByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetCollections
     * Status: STABLE
     * queries multiple collections by ID or by LabelFilter
     * This returns by default a paginated result with 20 entries.
     * Must specify a project_id as context
     * </pre>
     */
    public void getCollections(com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCollectionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateCollection
     * Status: STABLE
     * Updates the current collection
     * This will update the collection in place if it is unversioned / latest
     * A versioned (pinned) collection requires a new semantic version after the
     * update This can be used to pin a collection to a specific version similar
     * to the PinCollectionVersion request
     * </pre>
     */
    public void updateCollection(com.aruna.api.storage.services.v1.CollectionServiceProto.UpdateCollectionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.CollectionServiceProto.UpdateCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PinCollectionVersion
     * Status: STABLE
     * This pins the current status of the version to a
     * specific version. Effectively creating a copy of the collection with a
     * stable version All objects will be pinned to an explicit revision number
     * Pinned collections can not be updated in place
     * </pre>
     */
    public void pinCollectionVersion(com.aruna.api.storage.services.v1.CollectionServiceProto.PinCollectionVersionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.CollectionServiceProto.PinCollectionVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPinCollectionVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteCollection
     * Status: STABLE
     * This request deletes the collection.
     * If with_version is true, it deletes the collection and all its versions.
     * If cascade is true, all objects that are owned by the collection will also
     * deleted. This should be avoided
     * </pre>
     */
    public void deleteCollection(com.aruna.api.storage.services.v1.CollectionServiceProto.DeleteCollectionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.CollectionServiceProto.DeleteCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCollectionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CollectionService.
   * <pre>
   * CollectionService
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
     * Status: STABLE
     * creates a new Collection
     * </pre>
     */
    public com.aruna.api.storage.services.v1.CollectionServiceProto.CreateNewCollectionResponse createNewCollection(com.aruna.api.storage.services.v1.CollectionServiceProto.CreateNewCollectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNewCollectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetCollectionByID
     * Status: STABLE
     * Queries a specific Collection by ID
     * The result can be one_of:
     * CollectionOverview -&gt; default
     * CollectionWithID
     * Collection (full)
     * This can be modified with the optional OutputFormat parameter
     * </pre>
     */
    public com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionByIDResponse getCollectionByID(com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionByIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCollectionByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetCollections
     * Status: STABLE
     * queries multiple collections by ID or by LabelFilter
     * This returns by default a paginated result with 20 entries.
     * Must specify a project_id as context
     * </pre>
     */
    public com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionsResponse getCollections(com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCollectionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateCollection
     * Status: STABLE
     * Updates the current collection
     * This will update the collection in place if it is unversioned / latest
     * A versioned (pinned) collection requires a new semantic version after the
     * update This can be used to pin a collection to a specific version similar
     * to the PinCollectionVersion request
     * </pre>
     */
    public com.aruna.api.storage.services.v1.CollectionServiceProto.UpdateCollectionResponse updateCollection(com.aruna.api.storage.services.v1.CollectionServiceProto.UpdateCollectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCollectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PinCollectionVersion
     * Status: STABLE
     * This pins the current status of the version to a
     * specific version. Effectively creating a copy of the collection with a
     * stable version All objects will be pinned to an explicit revision number
     * Pinned collections can not be updated in place
     * </pre>
     */
    public com.aruna.api.storage.services.v1.CollectionServiceProto.PinCollectionVersionResponse pinCollectionVersion(com.aruna.api.storage.services.v1.CollectionServiceProto.PinCollectionVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPinCollectionVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteCollection
     * Status: STABLE
     * This request deletes the collection.
     * If with_version is true, it deletes the collection and all its versions.
     * If cascade is true, all objects that are owned by the collection will also
     * deleted. This should be avoided
     * </pre>
     */
    public com.aruna.api.storage.services.v1.CollectionServiceProto.DeleteCollectionResponse deleteCollection(com.aruna.api.storage.services.v1.CollectionServiceProto.DeleteCollectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCollectionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CollectionService.
   * <pre>
   * CollectionService
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
     * Status: STABLE
     * creates a new Collection
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.CollectionServiceProto.CreateNewCollectionResponse> createNewCollection(
        com.aruna.api.storage.services.v1.CollectionServiceProto.CreateNewCollectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNewCollectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetCollectionByID
     * Status: STABLE
     * Queries a specific Collection by ID
     * The result can be one_of:
     * CollectionOverview -&gt; default
     * CollectionWithID
     * Collection (full)
     * This can be modified with the optional OutputFormat parameter
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionByIDResponse> getCollectionByID(
        com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionByIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCollectionByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetCollections
     * Status: STABLE
     * queries multiple collections by ID or by LabelFilter
     * This returns by default a paginated result with 20 entries.
     * Must specify a project_id as context
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionsResponse> getCollections(
        com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCollectionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateCollection
     * Status: STABLE
     * Updates the current collection
     * This will update the collection in place if it is unversioned / latest
     * A versioned (pinned) collection requires a new semantic version after the
     * update This can be used to pin a collection to a specific version similar
     * to the PinCollectionVersion request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.CollectionServiceProto.UpdateCollectionResponse> updateCollection(
        com.aruna.api.storage.services.v1.CollectionServiceProto.UpdateCollectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCollectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PinCollectionVersion
     * Status: STABLE
     * This pins the current status of the version to a
     * specific version. Effectively creating a copy of the collection with a
     * stable version All objects will be pinned to an explicit revision number
     * Pinned collections can not be updated in place
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.CollectionServiceProto.PinCollectionVersionResponse> pinCollectionVersion(
        com.aruna.api.storage.services.v1.CollectionServiceProto.PinCollectionVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPinCollectionVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteCollection
     * Status: STABLE
     * This request deletes the collection.
     * If with_version is true, it deletes the collection and all its versions.
     * If cascade is true, all objects that are owned by the collection will also
     * deleted. This should be avoided
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.CollectionServiceProto.DeleteCollectionResponse> deleteCollection(
        com.aruna.api.storage.services.v1.CollectionServiceProto.DeleteCollectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCollectionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_NEW_COLLECTION = 0;
  private static final int METHODID_GET_COLLECTION_BY_ID = 1;
  private static final int METHODID_GET_COLLECTIONS = 2;
  private static final int METHODID_UPDATE_COLLECTION = 3;
  private static final int METHODID_PIN_COLLECTION_VERSION = 4;
  private static final int METHODID_DELETE_COLLECTION = 5;

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
        case METHODID_CREATE_NEW_COLLECTION:
          serviceImpl.createNewCollection((com.aruna.api.storage.services.v1.CollectionServiceProto.CreateNewCollectionRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.CollectionServiceProto.CreateNewCollectionResponse>) responseObserver);
          break;
        case METHODID_GET_COLLECTION_BY_ID:
          serviceImpl.getCollectionByID((com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionByIDRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionByIDResponse>) responseObserver);
          break;
        case METHODID_GET_COLLECTIONS:
          serviceImpl.getCollections((com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_COLLECTION:
          serviceImpl.updateCollection((com.aruna.api.storage.services.v1.CollectionServiceProto.UpdateCollectionRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.CollectionServiceProto.UpdateCollectionResponse>) responseObserver);
          break;
        case METHODID_PIN_COLLECTION_VERSION:
          serviceImpl.pinCollectionVersion((com.aruna.api.storage.services.v1.CollectionServiceProto.PinCollectionVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.CollectionServiceProto.PinCollectionVersionResponse>) responseObserver);
          break;
        case METHODID_DELETE_COLLECTION:
          serviceImpl.deleteCollection((com.aruna.api.storage.services.v1.CollectionServiceProto.DeleteCollectionRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.CollectionServiceProto.DeleteCollectionResponse>) responseObserver);
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
          getCreateNewCollectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.CollectionServiceProto.CreateNewCollectionRequest,
              com.aruna.api.storage.services.v1.CollectionServiceProto.CreateNewCollectionResponse>(
                service, METHODID_CREATE_NEW_COLLECTION)))
        .addMethod(
          getGetCollectionByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionByIDRequest,
              com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionByIDResponse>(
                service, METHODID_GET_COLLECTION_BY_ID)))
        .addMethod(
          getGetCollectionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionsRequest,
              com.aruna.api.storage.services.v1.CollectionServiceProto.GetCollectionsResponse>(
                service, METHODID_GET_COLLECTIONS)))
        .addMethod(
          getUpdateCollectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.CollectionServiceProto.UpdateCollectionRequest,
              com.aruna.api.storage.services.v1.CollectionServiceProto.UpdateCollectionResponse>(
                service, METHODID_UPDATE_COLLECTION)))
        .addMethod(
          getPinCollectionVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.CollectionServiceProto.PinCollectionVersionRequest,
              com.aruna.api.storage.services.v1.CollectionServiceProto.PinCollectionVersionResponse>(
                service, METHODID_PIN_COLLECTION_VERSION)))
        .addMethod(
          getDeleteCollectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.CollectionServiceProto.DeleteCollectionRequest,
              com.aruna.api.storage.services.v1.CollectionServiceProto.DeleteCollectionResponse>(
                service, METHODID_DELETE_COLLECTION)))
        .build();
  }

  private static abstract class CollectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CollectionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.storage.services.v1.CollectionServiceProto.getDescriptor();
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
    private final String methodName;

    CollectionServiceMethodDescriptorSupplier(String methodName) {
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
              .addMethod(getCreateNewCollectionMethod())
              .addMethod(getGetCollectionByIDMethod())
              .addMethod(getGetCollectionsMethod())
              .addMethod(getUpdateCollectionMethod())
              .addMethod(getPinCollectionVersionMethod())
              .addMethod(getDeleteCollectionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
