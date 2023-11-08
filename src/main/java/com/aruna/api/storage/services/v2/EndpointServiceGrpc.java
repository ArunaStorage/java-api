package com.aruna.api.storage.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * EndpointService
 * Contains all methods that get/create or update Endpoint and associated resources
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: aruna/api/storage/services/v2/endpoint_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EndpointServiceGrpc {

  private EndpointServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "aruna.api.storage.services.v2.EndpointService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateEndpointRequest,
      com.aruna.api.storage.services.v2.CreateEndpointResponse> getCreateEndpointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEndpoint",
      requestType = com.aruna.api.storage.services.v2.CreateEndpointRequest.class,
      responseType = com.aruna.api.storage.services.v2.CreateEndpointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateEndpointRequest,
      com.aruna.api.storage.services.v2.CreateEndpointResponse> getCreateEndpointMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateEndpointRequest, com.aruna.api.storage.services.v2.CreateEndpointResponse> getCreateEndpointMethod;
    if ((getCreateEndpointMethod = EndpointServiceGrpc.getCreateEndpointMethod) == null) {
      synchronized (EndpointServiceGrpc.class) {
        if ((getCreateEndpointMethod = EndpointServiceGrpc.getCreateEndpointMethod) == null) {
          EndpointServiceGrpc.getCreateEndpointMethod = getCreateEndpointMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.CreateEndpointRequest, com.aruna.api.storage.services.v2.CreateEndpointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEndpoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateEndpointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EndpointServiceMethodDescriptorSupplier("CreateEndpoint"))
              .build();
        }
      }
    }
    return getCreateEndpointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.FullSyncEndpointRequest,
      com.aruna.api.storage.services.v2.FullSyncEndpointResponse> getFullSyncEndpointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FullSyncEndpoint",
      requestType = com.aruna.api.storage.services.v2.FullSyncEndpointRequest.class,
      responseType = com.aruna.api.storage.services.v2.FullSyncEndpointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.FullSyncEndpointRequest,
      com.aruna.api.storage.services.v2.FullSyncEndpointResponse> getFullSyncEndpointMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.FullSyncEndpointRequest, com.aruna.api.storage.services.v2.FullSyncEndpointResponse> getFullSyncEndpointMethod;
    if ((getFullSyncEndpointMethod = EndpointServiceGrpc.getFullSyncEndpointMethod) == null) {
      synchronized (EndpointServiceGrpc.class) {
        if ((getFullSyncEndpointMethod = EndpointServiceGrpc.getFullSyncEndpointMethod) == null) {
          EndpointServiceGrpc.getFullSyncEndpointMethod = getFullSyncEndpointMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.FullSyncEndpointRequest, com.aruna.api.storage.services.v2.FullSyncEndpointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FullSyncEndpoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.FullSyncEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.FullSyncEndpointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EndpointServiceMethodDescriptorSupplier("FullSyncEndpoint"))
              .build();
        }
      }
    }
    return getFullSyncEndpointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetEndpointRequest,
      com.aruna.api.storage.services.v2.GetEndpointResponse> getGetEndpointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEndpoint",
      requestType = com.aruna.api.storage.services.v2.GetEndpointRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetEndpointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetEndpointRequest,
      com.aruna.api.storage.services.v2.GetEndpointResponse> getGetEndpointMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetEndpointRequest, com.aruna.api.storage.services.v2.GetEndpointResponse> getGetEndpointMethod;
    if ((getGetEndpointMethod = EndpointServiceGrpc.getGetEndpointMethod) == null) {
      synchronized (EndpointServiceGrpc.class) {
        if ((getGetEndpointMethod = EndpointServiceGrpc.getGetEndpointMethod) == null) {
          EndpointServiceGrpc.getGetEndpointMethod = getGetEndpointMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetEndpointRequest, com.aruna.api.storage.services.v2.GetEndpointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEndpoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetEndpointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EndpointServiceMethodDescriptorSupplier("GetEndpoint"))
              .build();
        }
      }
    }
    return getGetEndpointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetEndpointsRequest,
      com.aruna.api.storage.services.v2.GetEndpointsResponse> getGetEndpointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEndpoints",
      requestType = com.aruna.api.storage.services.v2.GetEndpointsRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetEndpointsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetEndpointsRequest,
      com.aruna.api.storage.services.v2.GetEndpointsResponse> getGetEndpointsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetEndpointsRequest, com.aruna.api.storage.services.v2.GetEndpointsResponse> getGetEndpointsMethod;
    if ((getGetEndpointsMethod = EndpointServiceGrpc.getGetEndpointsMethod) == null) {
      synchronized (EndpointServiceGrpc.class) {
        if ((getGetEndpointsMethod = EndpointServiceGrpc.getGetEndpointsMethod) == null) {
          EndpointServiceGrpc.getGetEndpointsMethod = getGetEndpointsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetEndpointsRequest, com.aruna.api.storage.services.v2.GetEndpointsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEndpoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetEndpointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetEndpointsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EndpointServiceMethodDescriptorSupplier("GetEndpoints"))
              .build();
        }
      }
    }
    return getGetEndpointsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteEndpointRequest,
      com.aruna.api.storage.services.v2.DeleteEndpointResponse> getDeleteEndpointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEndpoint",
      requestType = com.aruna.api.storage.services.v2.DeleteEndpointRequest.class,
      responseType = com.aruna.api.storage.services.v2.DeleteEndpointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteEndpointRequest,
      com.aruna.api.storage.services.v2.DeleteEndpointResponse> getDeleteEndpointMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteEndpointRequest, com.aruna.api.storage.services.v2.DeleteEndpointResponse> getDeleteEndpointMethod;
    if ((getDeleteEndpointMethod = EndpointServiceGrpc.getDeleteEndpointMethod) == null) {
      synchronized (EndpointServiceGrpc.class) {
        if ((getDeleteEndpointMethod = EndpointServiceGrpc.getDeleteEndpointMethod) == null) {
          EndpointServiceGrpc.getDeleteEndpointMethod = getDeleteEndpointMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DeleteEndpointRequest, com.aruna.api.storage.services.v2.DeleteEndpointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEndpoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteEndpointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EndpointServiceMethodDescriptorSupplier("DeleteEndpoint"))
              .build();
        }
      }
    }
    return getDeleteEndpointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetDefaultEndpointRequest,
      com.aruna.api.storage.services.v2.GetDefaultEndpointResponse> getGetDefaultEndpointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDefaultEndpoint",
      requestType = com.aruna.api.storage.services.v2.GetDefaultEndpointRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetDefaultEndpointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetDefaultEndpointRequest,
      com.aruna.api.storage.services.v2.GetDefaultEndpointResponse> getGetDefaultEndpointMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetDefaultEndpointRequest, com.aruna.api.storage.services.v2.GetDefaultEndpointResponse> getGetDefaultEndpointMethod;
    if ((getGetDefaultEndpointMethod = EndpointServiceGrpc.getGetDefaultEndpointMethod) == null) {
      synchronized (EndpointServiceGrpc.class) {
        if ((getGetDefaultEndpointMethod = EndpointServiceGrpc.getGetDefaultEndpointMethod) == null) {
          EndpointServiceGrpc.getGetDefaultEndpointMethod = getGetDefaultEndpointMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetDefaultEndpointRequest, com.aruna.api.storage.services.v2.GetDefaultEndpointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDefaultEndpoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetDefaultEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetDefaultEndpointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EndpointServiceMethodDescriptorSupplier("GetDefaultEndpoint"))
              .build();
        }
      }
    }
    return getGetDefaultEndpointMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EndpointServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EndpointServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EndpointServiceStub>() {
        @java.lang.Override
        public EndpointServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EndpointServiceStub(channel, callOptions);
        }
      };
    return EndpointServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EndpointServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EndpointServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EndpointServiceBlockingStub>() {
        @java.lang.Override
        public EndpointServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EndpointServiceBlockingStub(channel, callOptions);
        }
      };
    return EndpointServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EndpointServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EndpointServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EndpointServiceFutureStub>() {
        @java.lang.Override
        public EndpointServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EndpointServiceFutureStub(channel, callOptions);
        }
      };
    return EndpointServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * EndpointService
   * Contains all methods that get/create or update Endpoint and associated resources
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateEndpoint
     * Status: BETA
     * Registers a new Endpoint (Aruna DataProxy) to the server
     * Needs admin permissions
     * </pre>
     */
    default void createEndpoint(com.aruna.api.storage.services.v2.CreateEndpointRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateEndpointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEndpointMethod(), responseObserver);
    }

    /**
     * <pre>
     * FullSyncEndpoint
     * Status: BETA
     * Requests a full sync of all endpoint related data
     * </pre>
     */
    default void fullSyncEndpoint(com.aruna.api.storage.services.v2.FullSyncEndpointRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.FullSyncEndpointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFullSyncEndpointMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetEndpoint
     * Status: BETA
     * Gets an specific endpoint by ID or Name
     * </pre>
     */
    default void getEndpoint(com.aruna.api.storage.services.v2.GetEndpointRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetEndpointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEndpointMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetEndpoints
     * 
     * Status: BETA
     * Gets all available endpoints
     * </pre>
     */
    default void getEndpoints(com.aruna.api.storage.services.v2.GetEndpointsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetEndpointsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEndpointsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteEndpoint
     * Status: BETA
     * Deletes a specific endpoint by id
     * This needs admin permissions
     * </pre>
     */
    default void deleteEndpoint(com.aruna.api.storage.services.v2.DeleteEndpointRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteEndpointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEndpointMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDefaultEndpoint
     * Status: BETA
     * This request returns the default endpoint for the current aruna_server
     * It may produce different results depending on the used server
     * </pre>
     */
    default void getDefaultEndpoint(com.aruna.api.storage.services.v2.GetDefaultEndpointRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetDefaultEndpointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDefaultEndpointMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EndpointService.
   * <pre>
   * EndpointService
   * Contains all methods that get/create or update Endpoint and associated resources
   * </pre>
   */
  public static abstract class EndpointServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EndpointServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EndpointService.
   * <pre>
   * EndpointService
   * Contains all methods that get/create or update Endpoint and associated resources
   * </pre>
   */
  public static final class EndpointServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EndpointServiceStub> {
    private EndpointServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EndpointServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EndpointServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateEndpoint
     * Status: BETA
     * Registers a new Endpoint (Aruna DataProxy) to the server
     * Needs admin permissions
     * </pre>
     */
    public void createEndpoint(com.aruna.api.storage.services.v2.CreateEndpointRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateEndpointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEndpointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FullSyncEndpoint
     * Status: BETA
     * Requests a full sync of all endpoint related data
     * </pre>
     */
    public void fullSyncEndpoint(com.aruna.api.storage.services.v2.FullSyncEndpointRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.FullSyncEndpointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFullSyncEndpointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetEndpoint
     * Status: BETA
     * Gets an specific endpoint by ID or Name
     * </pre>
     */
    public void getEndpoint(com.aruna.api.storage.services.v2.GetEndpointRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetEndpointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEndpointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetEndpoints
     * 
     * Status: BETA
     * Gets all available endpoints
     * </pre>
     */
    public void getEndpoints(com.aruna.api.storage.services.v2.GetEndpointsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetEndpointsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEndpointsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteEndpoint
     * Status: BETA
     * Deletes a specific endpoint by id
     * This needs admin permissions
     * </pre>
     */
    public void deleteEndpoint(com.aruna.api.storage.services.v2.DeleteEndpointRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteEndpointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEndpointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDefaultEndpoint
     * Status: BETA
     * This request returns the default endpoint for the current aruna_server
     * It may produce different results depending on the used server
     * </pre>
     */
    public void getDefaultEndpoint(com.aruna.api.storage.services.v2.GetDefaultEndpointRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetDefaultEndpointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDefaultEndpointMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EndpointService.
   * <pre>
   * EndpointService
   * Contains all methods that get/create or update Endpoint and associated resources
   * </pre>
   */
  public static final class EndpointServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EndpointServiceBlockingStub> {
    private EndpointServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EndpointServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EndpointServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateEndpoint
     * Status: BETA
     * Registers a new Endpoint (Aruna DataProxy) to the server
     * Needs admin permissions
     * </pre>
     */
    public com.aruna.api.storage.services.v2.CreateEndpointResponse createEndpoint(com.aruna.api.storage.services.v2.CreateEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEndpointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FullSyncEndpoint
     * Status: BETA
     * Requests a full sync of all endpoint related data
     * </pre>
     */
    public java.util.Iterator<com.aruna.api.storage.services.v2.FullSyncEndpointResponse> fullSyncEndpoint(
        com.aruna.api.storage.services.v2.FullSyncEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFullSyncEndpointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetEndpoint
     * Status: BETA
     * Gets an specific endpoint by ID or Name
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetEndpointResponse getEndpoint(com.aruna.api.storage.services.v2.GetEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEndpointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetEndpoints
     * 
     * Status: BETA
     * Gets all available endpoints
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetEndpointsResponse getEndpoints(com.aruna.api.storage.services.v2.GetEndpointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEndpointsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteEndpoint
     * Status: BETA
     * Deletes a specific endpoint by id
     * This needs admin permissions
     * </pre>
     */
    public com.aruna.api.storage.services.v2.DeleteEndpointResponse deleteEndpoint(com.aruna.api.storage.services.v2.DeleteEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEndpointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDefaultEndpoint
     * Status: BETA
     * This request returns the default endpoint for the current aruna_server
     * It may produce different results depending on the used server
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetDefaultEndpointResponse getDefaultEndpoint(com.aruna.api.storage.services.v2.GetDefaultEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDefaultEndpointMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EndpointService.
   * <pre>
   * EndpointService
   * Contains all methods that get/create or update Endpoint and associated resources
   * </pre>
   */
  public static final class EndpointServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EndpointServiceFutureStub> {
    private EndpointServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EndpointServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EndpointServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateEndpoint
     * Status: BETA
     * Registers a new Endpoint (Aruna DataProxy) to the server
     * Needs admin permissions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.CreateEndpointResponse> createEndpoint(
        com.aruna.api.storage.services.v2.CreateEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEndpointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetEndpoint
     * Status: BETA
     * Gets an specific endpoint by ID or Name
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetEndpointResponse> getEndpoint(
        com.aruna.api.storage.services.v2.GetEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEndpointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetEndpoints
     * 
     * Status: BETA
     * Gets all available endpoints
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetEndpointsResponse> getEndpoints(
        com.aruna.api.storage.services.v2.GetEndpointsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEndpointsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteEndpoint
     * Status: BETA
     * Deletes a specific endpoint by id
     * This needs admin permissions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DeleteEndpointResponse> deleteEndpoint(
        com.aruna.api.storage.services.v2.DeleteEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEndpointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDefaultEndpoint
     * Status: BETA
     * This request returns the default endpoint for the current aruna_server
     * It may produce different results depending on the used server
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetDefaultEndpointResponse> getDefaultEndpoint(
        com.aruna.api.storage.services.v2.GetDefaultEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDefaultEndpointMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ENDPOINT = 0;
  private static final int METHODID_FULL_SYNC_ENDPOINT = 1;
  private static final int METHODID_GET_ENDPOINT = 2;
  private static final int METHODID_GET_ENDPOINTS = 3;
  private static final int METHODID_DELETE_ENDPOINT = 4;
  private static final int METHODID_GET_DEFAULT_ENDPOINT = 5;

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
        case METHODID_CREATE_ENDPOINT:
          serviceImpl.createEndpoint((com.aruna.api.storage.services.v2.CreateEndpointRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateEndpointResponse>) responseObserver);
          break;
        case METHODID_FULL_SYNC_ENDPOINT:
          serviceImpl.fullSyncEndpoint((com.aruna.api.storage.services.v2.FullSyncEndpointRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.FullSyncEndpointResponse>) responseObserver);
          break;
        case METHODID_GET_ENDPOINT:
          serviceImpl.getEndpoint((com.aruna.api.storage.services.v2.GetEndpointRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetEndpointResponse>) responseObserver);
          break;
        case METHODID_GET_ENDPOINTS:
          serviceImpl.getEndpoints((com.aruna.api.storage.services.v2.GetEndpointsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetEndpointsResponse>) responseObserver);
          break;
        case METHODID_DELETE_ENDPOINT:
          serviceImpl.deleteEndpoint((com.aruna.api.storage.services.v2.DeleteEndpointRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteEndpointResponse>) responseObserver);
          break;
        case METHODID_GET_DEFAULT_ENDPOINT:
          serviceImpl.getDefaultEndpoint((com.aruna.api.storage.services.v2.GetDefaultEndpointRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetDefaultEndpointResponse>) responseObserver);
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
          getCreateEndpointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.CreateEndpointRequest,
              com.aruna.api.storage.services.v2.CreateEndpointResponse>(
                service, METHODID_CREATE_ENDPOINT)))
        .addMethod(
          getFullSyncEndpointMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.FullSyncEndpointRequest,
              com.aruna.api.storage.services.v2.FullSyncEndpointResponse>(
                service, METHODID_FULL_SYNC_ENDPOINT)))
        .addMethod(
          getGetEndpointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetEndpointRequest,
              com.aruna.api.storage.services.v2.GetEndpointResponse>(
                service, METHODID_GET_ENDPOINT)))
        .addMethod(
          getGetEndpointsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetEndpointsRequest,
              com.aruna.api.storage.services.v2.GetEndpointsResponse>(
                service, METHODID_GET_ENDPOINTS)))
        .addMethod(
          getDeleteEndpointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DeleteEndpointRequest,
              com.aruna.api.storage.services.v2.DeleteEndpointResponse>(
                service, METHODID_DELETE_ENDPOINT)))
        .addMethod(
          getGetDefaultEndpointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetDefaultEndpointRequest,
              com.aruna.api.storage.services.v2.GetDefaultEndpointResponse>(
                service, METHODID_GET_DEFAULT_ENDPOINT)))
        .build();
  }

  private static abstract class EndpointServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EndpointServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.storage.services.v2.EndpointServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EndpointService");
    }
  }

  private static final class EndpointServiceFileDescriptorSupplier
      extends EndpointServiceBaseDescriptorSupplier {
    EndpointServiceFileDescriptorSupplier() {}
  }

  private static final class EndpointServiceMethodDescriptorSupplier
      extends EndpointServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EndpointServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EndpointServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EndpointServiceFileDescriptorSupplier())
              .addMethod(getCreateEndpointMethod())
              .addMethod(getFullSyncEndpointMethod())
              .addMethod(getGetEndpointMethod())
              .addMethod(getGetEndpointsMethod())
              .addMethod(getDeleteEndpointMethod())
              .addMethod(getGetDefaultEndpointMethod())
              .build();
        }
      }
    }
    return result;
  }
}
