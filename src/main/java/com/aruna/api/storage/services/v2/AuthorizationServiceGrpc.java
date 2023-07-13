package com.aruna.api.storage.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * AuthorizationService
 * Contains all methods to edit and change user authorization
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/storage/services/v2/authorization_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthorizationServiceGrpc {

  private AuthorizationServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.storage.services.v2.AuthorizationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AuthorizationServiceProto.CreateAuthorizationRequest,
      com.aruna.api.storage.services.v2.AuthorizationServiceProto.CreateAuthorizationResponse> getCreateAuthorizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAuthorization",
      requestType = com.aruna.api.storage.services.v2.AuthorizationServiceProto.CreateAuthorizationRequest.class,
      responseType = com.aruna.api.storage.services.v2.AuthorizationServiceProto.CreateAuthorizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AuthorizationServiceProto.CreateAuthorizationRequest,
      com.aruna.api.storage.services.v2.AuthorizationServiceProto.CreateAuthorizationResponse> getCreateAuthorizationMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AuthorizationServiceProto.CreateAuthorizationRequest, com.aruna.api.storage.services.v2.AuthorizationServiceProto.CreateAuthorizationResponse> getCreateAuthorizationMethod;
    if ((getCreateAuthorizationMethod = AuthorizationServiceGrpc.getCreateAuthorizationMethod) == null) {
      synchronized (AuthorizationServiceGrpc.class) {
        if ((getCreateAuthorizationMethod = AuthorizationServiceGrpc.getCreateAuthorizationMethod) == null) {
          AuthorizationServiceGrpc.getCreateAuthorizationMethod = getCreateAuthorizationMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.AuthorizationServiceProto.CreateAuthorizationRequest, com.aruna.api.storage.services.v2.AuthorizationServiceProto.CreateAuthorizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAuthorization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AuthorizationServiceProto.CreateAuthorizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AuthorizationServiceProto.CreateAuthorizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthorizationServiceMethodDescriptorSupplier("CreateAuthorization"))
              .build();
        }
      }
    }
    return getCreateAuthorizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AuthorizationServiceProto.GetAuthorizationsRequest,
      com.aruna.api.storage.services.v2.AuthorizationServiceProto.GetAuthorizationsResponse> getGetAuthorizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAuthorizations",
      requestType = com.aruna.api.storage.services.v2.AuthorizationServiceProto.GetAuthorizationsRequest.class,
      responseType = com.aruna.api.storage.services.v2.AuthorizationServiceProto.GetAuthorizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AuthorizationServiceProto.GetAuthorizationsRequest,
      com.aruna.api.storage.services.v2.AuthorizationServiceProto.GetAuthorizationsResponse> getGetAuthorizationsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AuthorizationServiceProto.GetAuthorizationsRequest, com.aruna.api.storage.services.v2.AuthorizationServiceProto.GetAuthorizationsResponse> getGetAuthorizationsMethod;
    if ((getGetAuthorizationsMethod = AuthorizationServiceGrpc.getGetAuthorizationsMethod) == null) {
      synchronized (AuthorizationServiceGrpc.class) {
        if ((getGetAuthorizationsMethod = AuthorizationServiceGrpc.getGetAuthorizationsMethod) == null) {
          AuthorizationServiceGrpc.getGetAuthorizationsMethod = getGetAuthorizationsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.AuthorizationServiceProto.GetAuthorizationsRequest, com.aruna.api.storage.services.v2.AuthorizationServiceProto.GetAuthorizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAuthorizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AuthorizationServiceProto.GetAuthorizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AuthorizationServiceProto.GetAuthorizationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthorizationServiceMethodDescriptorSupplier("GetAuthorizations"))
              .build();
        }
      }
    }
    return getGetAuthorizationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AuthorizationServiceProto.DeleteAuthorizationRequest,
      com.aruna.api.storage.services.v2.AuthorizationServiceProto.DeleteAuthorizationResponse> getDeleteAuthorizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAuthorization",
      requestType = com.aruna.api.storage.services.v2.AuthorizationServiceProto.DeleteAuthorizationRequest.class,
      responseType = com.aruna.api.storage.services.v2.AuthorizationServiceProto.DeleteAuthorizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AuthorizationServiceProto.DeleteAuthorizationRequest,
      com.aruna.api.storage.services.v2.AuthorizationServiceProto.DeleteAuthorizationResponse> getDeleteAuthorizationMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AuthorizationServiceProto.DeleteAuthorizationRequest, com.aruna.api.storage.services.v2.AuthorizationServiceProto.DeleteAuthorizationResponse> getDeleteAuthorizationMethod;
    if ((getDeleteAuthorizationMethod = AuthorizationServiceGrpc.getDeleteAuthorizationMethod) == null) {
      synchronized (AuthorizationServiceGrpc.class) {
        if ((getDeleteAuthorizationMethod = AuthorizationServiceGrpc.getDeleteAuthorizationMethod) == null) {
          AuthorizationServiceGrpc.getDeleteAuthorizationMethod = getDeleteAuthorizationMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.AuthorizationServiceProto.DeleteAuthorizationRequest, com.aruna.api.storage.services.v2.AuthorizationServiceProto.DeleteAuthorizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAuthorization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AuthorizationServiceProto.DeleteAuthorizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AuthorizationServiceProto.DeleteAuthorizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthorizationServiceMethodDescriptorSupplier("DeleteAuthorization"))
              .build();
        }
      }
    }
    return getDeleteAuthorizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AuthorizationServiceProto.UpdateAuthorizationsRequest,
      com.aruna.api.storage.services.v2.AuthorizationServiceProto.UpdateAuthorizationsResponse> getUpdateAuthorizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAuthorizations",
      requestType = com.aruna.api.storage.services.v2.AuthorizationServiceProto.UpdateAuthorizationsRequest.class,
      responseType = com.aruna.api.storage.services.v2.AuthorizationServiceProto.UpdateAuthorizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AuthorizationServiceProto.UpdateAuthorizationsRequest,
      com.aruna.api.storage.services.v2.AuthorizationServiceProto.UpdateAuthorizationsResponse> getUpdateAuthorizationsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AuthorizationServiceProto.UpdateAuthorizationsRequest, com.aruna.api.storage.services.v2.AuthorizationServiceProto.UpdateAuthorizationsResponse> getUpdateAuthorizationsMethod;
    if ((getUpdateAuthorizationsMethod = AuthorizationServiceGrpc.getUpdateAuthorizationsMethod) == null) {
      synchronized (AuthorizationServiceGrpc.class) {
        if ((getUpdateAuthorizationsMethod = AuthorizationServiceGrpc.getUpdateAuthorizationsMethod) == null) {
          AuthorizationServiceGrpc.getUpdateAuthorizationsMethod = getUpdateAuthorizationsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.AuthorizationServiceProto.UpdateAuthorizationsRequest, com.aruna.api.storage.services.v2.AuthorizationServiceProto.UpdateAuthorizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAuthorizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AuthorizationServiceProto.UpdateAuthorizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AuthorizationServiceProto.UpdateAuthorizationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthorizationServiceMethodDescriptorSupplier("UpdateAuthorizations"))
              .build();
        }
      }
    }
    return getUpdateAuthorizationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthorizationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthorizationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthorizationServiceStub>() {
        @java.lang.Override
        public AuthorizationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthorizationServiceStub(channel, callOptions);
        }
      };
    return AuthorizationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthorizationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthorizationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthorizationServiceBlockingStub>() {
        @java.lang.Override
        public AuthorizationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthorizationServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthorizationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthorizationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthorizationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthorizationServiceFutureStub>() {
        @java.lang.Override
        public AuthorizationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthorizationServiceFutureStub(channel, callOptions);
        }
      };
    return AuthorizationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * AuthorizationService
   * Contains all methods to edit and change user authorization
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateAuthorization
     * Status: BETA
     * This creates a user-specific attribute that handles permission for a
     * specific resource 
     * </pre>
     */
    default void createAuthorization(com.aruna.api.storage.services.v2.AuthorizationServiceProto.CreateAuthorizationRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AuthorizationServiceProto.CreateAuthorizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAuthorizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAuthorization
     * Status: BETA
     * This gets resource specific user authorizations
     * </pre>
     */
    default void getAuthorizations(com.aruna.api.storage.services.v2.AuthorizationServiceProto.GetAuthorizationsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AuthorizationServiceProto.GetAuthorizationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAuthorizationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAuthorization
     * Status: BETA
     * This creates a user-specific attribute that handles permission for a
     * specific resource 
     * </pre>
     */
    default void deleteAuthorization(com.aruna.api.storage.services.v2.AuthorizationServiceProto.DeleteAuthorizationRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AuthorizationServiceProto.DeleteAuthorizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAuthorizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAuthorization
     * Status: BETA
     * This creates a user-specific attribute that handles permission for a
     * specific resource 
     * </pre>
     */
    default void updateAuthorizations(com.aruna.api.storage.services.v2.AuthorizationServiceProto.UpdateAuthorizationsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AuthorizationServiceProto.UpdateAuthorizationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAuthorizationsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AuthorizationService.
   * <pre>
   * AuthorizationService
   * Contains all methods to edit and change user authorization
   * </pre>
   */
  public static abstract class AuthorizationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AuthorizationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AuthorizationService.
   * <pre>
   * AuthorizationService
   * Contains all methods to edit and change user authorization
   * </pre>
   */
  public static final class AuthorizationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AuthorizationServiceStub> {
    private AuthorizationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthorizationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateAuthorization
     * Status: BETA
     * This creates a user-specific attribute that handles permission for a
     * specific resource 
     * </pre>
     */
    public void createAuthorization(com.aruna.api.storage.services.v2.AuthorizationServiceProto.CreateAuthorizationRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AuthorizationServiceProto.CreateAuthorizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAuthorizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAuthorization
     * Status: BETA
     * This gets resource specific user authorizations
     * </pre>
     */
    public void getAuthorizations(com.aruna.api.storage.services.v2.AuthorizationServiceProto.GetAuthorizationsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AuthorizationServiceProto.GetAuthorizationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAuthorizationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteAuthorization
     * Status: BETA
     * This creates a user-specific attribute that handles permission for a
     * specific resource 
     * </pre>
     */
    public void deleteAuthorization(com.aruna.api.storage.services.v2.AuthorizationServiceProto.DeleteAuthorizationRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AuthorizationServiceProto.DeleteAuthorizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAuthorizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAuthorization
     * Status: BETA
     * This creates a user-specific attribute that handles permission for a
     * specific resource 
     * </pre>
     */
    public void updateAuthorizations(com.aruna.api.storage.services.v2.AuthorizationServiceProto.UpdateAuthorizationsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AuthorizationServiceProto.UpdateAuthorizationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAuthorizationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AuthorizationService.
   * <pre>
   * AuthorizationService
   * Contains all methods to edit and change user authorization
   * </pre>
   */
  public static final class AuthorizationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AuthorizationServiceBlockingStub> {
    private AuthorizationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthorizationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateAuthorization
     * Status: BETA
     * This creates a user-specific attribute that handles permission for a
     * specific resource 
     * </pre>
     */
    public com.aruna.api.storage.services.v2.AuthorizationServiceProto.CreateAuthorizationResponse createAuthorization(com.aruna.api.storage.services.v2.AuthorizationServiceProto.CreateAuthorizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAuthorizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAuthorization
     * Status: BETA
     * This gets resource specific user authorizations
     * </pre>
     */
    public com.aruna.api.storage.services.v2.AuthorizationServiceProto.GetAuthorizationsResponse getAuthorizations(com.aruna.api.storage.services.v2.AuthorizationServiceProto.GetAuthorizationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAuthorizationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAuthorization
     * Status: BETA
     * This creates a user-specific attribute that handles permission for a
     * specific resource 
     * </pre>
     */
    public com.aruna.api.storage.services.v2.AuthorizationServiceProto.DeleteAuthorizationResponse deleteAuthorization(com.aruna.api.storage.services.v2.AuthorizationServiceProto.DeleteAuthorizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAuthorizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAuthorization
     * Status: BETA
     * This creates a user-specific attribute that handles permission for a
     * specific resource 
     * </pre>
     */
    public com.aruna.api.storage.services.v2.AuthorizationServiceProto.UpdateAuthorizationsResponse updateAuthorizations(com.aruna.api.storage.services.v2.AuthorizationServiceProto.UpdateAuthorizationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAuthorizationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AuthorizationService.
   * <pre>
   * AuthorizationService
   * Contains all methods to edit and change user authorization
   * </pre>
   */
  public static final class AuthorizationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AuthorizationServiceFutureStub> {
    private AuthorizationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthorizationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateAuthorization
     * Status: BETA
     * This creates a user-specific attribute that handles permission for a
     * specific resource 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.AuthorizationServiceProto.CreateAuthorizationResponse> createAuthorization(
        com.aruna.api.storage.services.v2.AuthorizationServiceProto.CreateAuthorizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAuthorizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAuthorization
     * Status: BETA
     * This gets resource specific user authorizations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.AuthorizationServiceProto.GetAuthorizationsResponse> getAuthorizations(
        com.aruna.api.storage.services.v2.AuthorizationServiceProto.GetAuthorizationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAuthorizationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteAuthorization
     * Status: BETA
     * This creates a user-specific attribute that handles permission for a
     * specific resource 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.AuthorizationServiceProto.DeleteAuthorizationResponse> deleteAuthorization(
        com.aruna.api.storage.services.v2.AuthorizationServiceProto.DeleteAuthorizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAuthorizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAuthorization
     * Status: BETA
     * This creates a user-specific attribute that handles permission for a
     * specific resource 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.AuthorizationServiceProto.UpdateAuthorizationsResponse> updateAuthorizations(
        com.aruna.api.storage.services.v2.AuthorizationServiceProto.UpdateAuthorizationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAuthorizationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_AUTHORIZATION = 0;
  private static final int METHODID_GET_AUTHORIZATIONS = 1;
  private static final int METHODID_DELETE_AUTHORIZATION = 2;
  private static final int METHODID_UPDATE_AUTHORIZATIONS = 3;

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
        case METHODID_CREATE_AUTHORIZATION:
          serviceImpl.createAuthorization((com.aruna.api.storage.services.v2.AuthorizationServiceProto.CreateAuthorizationRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AuthorizationServiceProto.CreateAuthorizationResponse>) responseObserver);
          break;
        case METHODID_GET_AUTHORIZATIONS:
          serviceImpl.getAuthorizations((com.aruna.api.storage.services.v2.AuthorizationServiceProto.GetAuthorizationsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AuthorizationServiceProto.GetAuthorizationsResponse>) responseObserver);
          break;
        case METHODID_DELETE_AUTHORIZATION:
          serviceImpl.deleteAuthorization((com.aruna.api.storage.services.v2.AuthorizationServiceProto.DeleteAuthorizationRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AuthorizationServiceProto.DeleteAuthorizationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AUTHORIZATIONS:
          serviceImpl.updateAuthorizations((com.aruna.api.storage.services.v2.AuthorizationServiceProto.UpdateAuthorizationsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AuthorizationServiceProto.UpdateAuthorizationsResponse>) responseObserver);
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
          getCreateAuthorizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.AuthorizationServiceProto.CreateAuthorizationRequest,
              com.aruna.api.storage.services.v2.AuthorizationServiceProto.CreateAuthorizationResponse>(
                service, METHODID_CREATE_AUTHORIZATION)))
        .addMethod(
          getGetAuthorizationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.AuthorizationServiceProto.GetAuthorizationsRequest,
              com.aruna.api.storage.services.v2.AuthorizationServiceProto.GetAuthorizationsResponse>(
                service, METHODID_GET_AUTHORIZATIONS)))
        .addMethod(
          getDeleteAuthorizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.AuthorizationServiceProto.DeleteAuthorizationRequest,
              com.aruna.api.storage.services.v2.AuthorizationServiceProto.DeleteAuthorizationResponse>(
                service, METHODID_DELETE_AUTHORIZATION)))
        .addMethod(
          getUpdateAuthorizationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.AuthorizationServiceProto.UpdateAuthorizationsRequest,
              com.aruna.api.storage.services.v2.AuthorizationServiceProto.UpdateAuthorizationsResponse>(
                service, METHODID_UPDATE_AUTHORIZATIONS)))
        .build();
  }

  private static abstract class AuthorizationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthorizationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.storage.services.v2.AuthorizationServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthorizationService");
    }
  }

  private static final class AuthorizationServiceFileDescriptorSupplier
      extends AuthorizationServiceBaseDescriptorSupplier {
    AuthorizationServiceFileDescriptorSupplier() {}
  }

  private static final class AuthorizationServiceMethodDescriptorSupplier
      extends AuthorizationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthorizationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthorizationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthorizationServiceFileDescriptorSupplier())
              .addMethod(getCreateAuthorizationMethod())
              .addMethod(getGetAuthorizationsMethod())
              .addMethod(getDeleteAuthorizationMethod())
              .addMethod(getUpdateAuthorizationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
