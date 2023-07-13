package com.aruna.api.storage.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * RelationsService
 * Contains all methods to edit and change resource relations
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/storage/services/v2/relations_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RelationsServiceGrpc {

  private RelationsServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.storage.services.v2.RelationsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.RelationsServiceProto.ModifyRelationsRequest,
      com.aruna.api.storage.services.v2.RelationsServiceProto.ModifyRelationsResponse> getModifyRelationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyRelations",
      requestType = com.aruna.api.storage.services.v2.RelationsServiceProto.ModifyRelationsRequest.class,
      responseType = com.aruna.api.storage.services.v2.RelationsServiceProto.ModifyRelationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.RelationsServiceProto.ModifyRelationsRequest,
      com.aruna.api.storage.services.v2.RelationsServiceProto.ModifyRelationsResponse> getModifyRelationsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.RelationsServiceProto.ModifyRelationsRequest, com.aruna.api.storage.services.v2.RelationsServiceProto.ModifyRelationsResponse> getModifyRelationsMethod;
    if ((getModifyRelationsMethod = RelationsServiceGrpc.getModifyRelationsMethod) == null) {
      synchronized (RelationsServiceGrpc.class) {
        if ((getModifyRelationsMethod = RelationsServiceGrpc.getModifyRelationsMethod) == null) {
          RelationsServiceGrpc.getModifyRelationsMethod = getModifyRelationsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.RelationsServiceProto.ModifyRelationsRequest, com.aruna.api.storage.services.v2.RelationsServiceProto.ModifyRelationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyRelations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.RelationsServiceProto.ModifyRelationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.RelationsServiceProto.ModifyRelationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RelationsServiceMethodDescriptorSupplier("ModifyRelations"))
              .build();
        }
      }
    }
    return getModifyRelationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.RelationsServiceProto.GetHierachyRequest,
      com.aruna.api.storage.services.v2.RelationsServiceProto.GetHierachyResponse> getGetHierachyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHierachy",
      requestType = com.aruna.api.storage.services.v2.RelationsServiceProto.GetHierachyRequest.class,
      responseType = com.aruna.api.storage.services.v2.RelationsServiceProto.GetHierachyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.RelationsServiceProto.GetHierachyRequest,
      com.aruna.api.storage.services.v2.RelationsServiceProto.GetHierachyResponse> getGetHierachyMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.RelationsServiceProto.GetHierachyRequest, com.aruna.api.storage.services.v2.RelationsServiceProto.GetHierachyResponse> getGetHierachyMethod;
    if ((getGetHierachyMethod = RelationsServiceGrpc.getGetHierachyMethod) == null) {
      synchronized (RelationsServiceGrpc.class) {
        if ((getGetHierachyMethod = RelationsServiceGrpc.getGetHierachyMethod) == null) {
          RelationsServiceGrpc.getGetHierachyMethod = getGetHierachyMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.RelationsServiceProto.GetHierachyRequest, com.aruna.api.storage.services.v2.RelationsServiceProto.GetHierachyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHierachy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.RelationsServiceProto.GetHierachyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.RelationsServiceProto.GetHierachyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RelationsServiceMethodDescriptorSupplier("GetHierachy"))
              .build();
        }
      }
    }
    return getGetHierachyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RelationsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RelationsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RelationsServiceStub>() {
        @java.lang.Override
        public RelationsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RelationsServiceStub(channel, callOptions);
        }
      };
    return RelationsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RelationsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RelationsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RelationsServiceBlockingStub>() {
        @java.lang.Override
        public RelationsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RelationsServiceBlockingStub(channel, callOptions);
        }
      };
    return RelationsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RelationsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RelationsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RelationsServiceFutureStub>() {
        @java.lang.Override
        public RelationsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RelationsServiceFutureStub(channel, callOptions);
        }
      };
    return RelationsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * RelationsService
   * Contains all methods to edit and change resource relations
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * ModifyRelation
     * Status: BETA
     * Modifys all relations to / from a resource
     * </pre>
     */
    default void modifyRelations(com.aruna.api.storage.services.v2.RelationsServiceProto.ModifyRelationsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RelationsServiceProto.ModifyRelationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyRelationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetHierachy
     * Status: BETA
     * Gets all downstream hierarchy relations from a resource
     * </pre>
     */
    default void getHierachy(com.aruna.api.storage.services.v2.RelationsServiceProto.GetHierachyRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RelationsServiceProto.GetHierachyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHierachyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RelationsService.
   * <pre>
   * RelationsService
   * Contains all methods to edit and change resource relations
   * </pre>
   */
  public static abstract class RelationsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RelationsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RelationsService.
   * <pre>
   * RelationsService
   * Contains all methods to edit and change resource relations
   * </pre>
   */
  public static final class RelationsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RelationsServiceStub> {
    private RelationsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RelationsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RelationsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * ModifyRelation
     * Status: BETA
     * Modifys all relations to / from a resource
     * </pre>
     */
    public void modifyRelations(com.aruna.api.storage.services.v2.RelationsServiceProto.ModifyRelationsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RelationsServiceProto.ModifyRelationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyRelationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetHierachy
     * Status: BETA
     * Gets all downstream hierarchy relations from a resource
     * </pre>
     */
    public void getHierachy(com.aruna.api.storage.services.v2.RelationsServiceProto.GetHierachyRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RelationsServiceProto.GetHierachyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHierachyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RelationsService.
   * <pre>
   * RelationsService
   * Contains all methods to edit and change resource relations
   * </pre>
   */
  public static final class RelationsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RelationsServiceBlockingStub> {
    private RelationsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RelationsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RelationsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ModifyRelation
     * Status: BETA
     * Modifys all relations to / from a resource
     * </pre>
     */
    public com.aruna.api.storage.services.v2.RelationsServiceProto.ModifyRelationsResponse modifyRelations(com.aruna.api.storage.services.v2.RelationsServiceProto.ModifyRelationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyRelationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetHierachy
     * Status: BETA
     * Gets all downstream hierarchy relations from a resource
     * </pre>
     */
    public com.aruna.api.storage.services.v2.RelationsServiceProto.GetHierachyResponse getHierachy(com.aruna.api.storage.services.v2.RelationsServiceProto.GetHierachyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHierachyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RelationsService.
   * <pre>
   * RelationsService
   * Contains all methods to edit and change resource relations
   * </pre>
   */
  public static final class RelationsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RelationsServiceFutureStub> {
    private RelationsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RelationsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RelationsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ModifyRelation
     * Status: BETA
     * Modifys all relations to / from a resource
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.RelationsServiceProto.ModifyRelationsResponse> modifyRelations(
        com.aruna.api.storage.services.v2.RelationsServiceProto.ModifyRelationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyRelationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetHierachy
     * Status: BETA
     * Gets all downstream hierarchy relations from a resource
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.RelationsServiceProto.GetHierachyResponse> getHierachy(
        com.aruna.api.storage.services.v2.RelationsServiceProto.GetHierachyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHierachyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MODIFY_RELATIONS = 0;
  private static final int METHODID_GET_HIERACHY = 1;

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
        case METHODID_MODIFY_RELATIONS:
          serviceImpl.modifyRelations((com.aruna.api.storage.services.v2.RelationsServiceProto.ModifyRelationsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RelationsServiceProto.ModifyRelationsResponse>) responseObserver);
          break;
        case METHODID_GET_HIERACHY:
          serviceImpl.getHierachy((com.aruna.api.storage.services.v2.RelationsServiceProto.GetHierachyRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RelationsServiceProto.GetHierachyResponse>) responseObserver);
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
          getModifyRelationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.RelationsServiceProto.ModifyRelationsRequest,
              com.aruna.api.storage.services.v2.RelationsServiceProto.ModifyRelationsResponse>(
                service, METHODID_MODIFY_RELATIONS)))
        .addMethod(
          getGetHierachyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.RelationsServiceProto.GetHierachyRequest,
              com.aruna.api.storage.services.v2.RelationsServiceProto.GetHierachyResponse>(
                service, METHODID_GET_HIERACHY)))
        .build();
  }

  private static abstract class RelationsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RelationsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.storage.services.v2.RelationsServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RelationsService");
    }
  }

  private static final class RelationsServiceFileDescriptorSupplier
      extends RelationsServiceBaseDescriptorSupplier {
    RelationsServiceFileDescriptorSupplier() {}
  }

  private static final class RelationsServiceMethodDescriptorSupplier
      extends RelationsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RelationsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RelationsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RelationsServiceFileDescriptorSupplier())
              .addMethod(getModifyRelationsMethod())
              .addMethod(getGetHierachyMethod())
              .build();
        }
      }
    }
    return result;
  }
}