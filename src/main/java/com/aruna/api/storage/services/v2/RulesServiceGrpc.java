package com.aruna.api.storage.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * RulesService
 * Status: BETA
 * Contains all methods to edit and change rules
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.0)",
    comments = "Source: aruna/api/storage/services/v2/rules_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RulesServiceGrpc {

  private RulesServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "aruna.api.storage.services.v2.RulesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateRuleRequest,
      com.aruna.api.storage.services.v2.CreateRuleResponse> getCreateRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRule",
      requestType = com.aruna.api.storage.services.v2.CreateRuleRequest.class,
      responseType = com.aruna.api.storage.services.v2.CreateRuleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateRuleRequest,
      com.aruna.api.storage.services.v2.CreateRuleResponse> getCreateRuleMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateRuleRequest, com.aruna.api.storage.services.v2.CreateRuleResponse> getCreateRuleMethod;
    if ((getCreateRuleMethod = RulesServiceGrpc.getCreateRuleMethod) == null) {
      synchronized (RulesServiceGrpc.class) {
        if ((getCreateRuleMethod = RulesServiceGrpc.getCreateRuleMethod) == null) {
          RulesServiceGrpc.getCreateRuleMethod = getCreateRuleMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.CreateRuleRequest, com.aruna.api.storage.services.v2.CreateRuleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateRuleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RulesServiceMethodDescriptorSupplier("CreateRule"))
              .build();
        }
      }
    }
    return getCreateRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetRuleRequest,
      com.aruna.api.storage.services.v2.GetRuleResponse> getGetRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRule",
      requestType = com.aruna.api.storage.services.v2.GetRuleRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetRuleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetRuleRequest,
      com.aruna.api.storage.services.v2.GetRuleResponse> getGetRuleMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetRuleRequest, com.aruna.api.storage.services.v2.GetRuleResponse> getGetRuleMethod;
    if ((getGetRuleMethod = RulesServiceGrpc.getGetRuleMethod) == null) {
      synchronized (RulesServiceGrpc.class) {
        if ((getGetRuleMethod = RulesServiceGrpc.getGetRuleMethod) == null) {
          RulesServiceGrpc.getGetRuleMethod = getGetRuleMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetRuleRequest, com.aruna.api.storage.services.v2.GetRuleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetRuleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RulesServiceMethodDescriptorSupplier("GetRule"))
              .build();
        }
      }
    }
    return getGetRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ListRuleRequest,
      com.aruna.api.storage.services.v2.ListRuleResponse> getListRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRule",
      requestType = com.aruna.api.storage.services.v2.ListRuleRequest.class,
      responseType = com.aruna.api.storage.services.v2.ListRuleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ListRuleRequest,
      com.aruna.api.storage.services.v2.ListRuleResponse> getListRuleMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ListRuleRequest, com.aruna.api.storage.services.v2.ListRuleResponse> getListRuleMethod;
    if ((getListRuleMethod = RulesServiceGrpc.getListRuleMethod) == null) {
      synchronized (RulesServiceGrpc.class) {
        if ((getListRuleMethod = RulesServiceGrpc.getListRuleMethod) == null) {
          RulesServiceGrpc.getListRuleMethod = getListRuleMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ListRuleRequest, com.aruna.api.storage.services.v2.ListRuleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ListRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ListRuleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RulesServiceMethodDescriptorSupplier("ListRule"))
              .build();
        }
      }
    }
    return getListRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateRuleRequest,
      com.aruna.api.storage.services.v2.UpdateRuleResponse> getUpdateRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRule",
      requestType = com.aruna.api.storage.services.v2.UpdateRuleRequest.class,
      responseType = com.aruna.api.storage.services.v2.UpdateRuleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateRuleRequest,
      com.aruna.api.storage.services.v2.UpdateRuleResponse> getUpdateRuleMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateRuleRequest, com.aruna.api.storage.services.v2.UpdateRuleResponse> getUpdateRuleMethod;
    if ((getUpdateRuleMethod = RulesServiceGrpc.getUpdateRuleMethod) == null) {
      synchronized (RulesServiceGrpc.class) {
        if ((getUpdateRuleMethod = RulesServiceGrpc.getUpdateRuleMethod) == null) {
          RulesServiceGrpc.getUpdateRuleMethod = getUpdateRuleMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.UpdateRuleRequest, com.aruna.api.storage.services.v2.UpdateRuleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateRuleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RulesServiceMethodDescriptorSupplier("UpdateRule"))
              .build();
        }
      }
    }
    return getUpdateRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteRuleRequest,
      com.aruna.api.storage.services.v2.DeleteRuleResponse> getDeleteRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRule",
      requestType = com.aruna.api.storage.services.v2.DeleteRuleRequest.class,
      responseType = com.aruna.api.storage.services.v2.DeleteRuleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteRuleRequest,
      com.aruna.api.storage.services.v2.DeleteRuleResponse> getDeleteRuleMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteRuleRequest, com.aruna.api.storage.services.v2.DeleteRuleResponse> getDeleteRuleMethod;
    if ((getDeleteRuleMethod = RulesServiceGrpc.getDeleteRuleMethod) == null) {
      synchronized (RulesServiceGrpc.class) {
        if ((getDeleteRuleMethod = RulesServiceGrpc.getDeleteRuleMethod) == null) {
          RulesServiceGrpc.getDeleteRuleMethod = getDeleteRuleMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DeleteRuleRequest, com.aruna.api.storage.services.v2.DeleteRuleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteRuleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RulesServiceMethodDescriptorSupplier("DeleteRule"))
              .build();
        }
      }
    }
    return getDeleteRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateRuleBindingRequest,
      com.aruna.api.storage.services.v2.CreateRuleBindingResponse> getCreateRuleBindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRuleBinding",
      requestType = com.aruna.api.storage.services.v2.CreateRuleBindingRequest.class,
      responseType = com.aruna.api.storage.services.v2.CreateRuleBindingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateRuleBindingRequest,
      com.aruna.api.storage.services.v2.CreateRuleBindingResponse> getCreateRuleBindingMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateRuleBindingRequest, com.aruna.api.storage.services.v2.CreateRuleBindingResponse> getCreateRuleBindingMethod;
    if ((getCreateRuleBindingMethod = RulesServiceGrpc.getCreateRuleBindingMethod) == null) {
      synchronized (RulesServiceGrpc.class) {
        if ((getCreateRuleBindingMethod = RulesServiceGrpc.getCreateRuleBindingMethod) == null) {
          RulesServiceGrpc.getCreateRuleBindingMethod = getCreateRuleBindingMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.CreateRuleBindingRequest, com.aruna.api.storage.services.v2.CreateRuleBindingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRuleBinding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateRuleBindingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateRuleBindingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RulesServiceMethodDescriptorSupplier("CreateRuleBinding"))
              .build();
        }
      }
    }
    return getCreateRuleBindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteRuleBindingRequest,
      com.aruna.api.storage.services.v2.DeleteRuleBindingResponse> getDeleteRuleBindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRuleBinding",
      requestType = com.aruna.api.storage.services.v2.DeleteRuleBindingRequest.class,
      responseType = com.aruna.api.storage.services.v2.DeleteRuleBindingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteRuleBindingRequest,
      com.aruna.api.storage.services.v2.DeleteRuleBindingResponse> getDeleteRuleBindingMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteRuleBindingRequest, com.aruna.api.storage.services.v2.DeleteRuleBindingResponse> getDeleteRuleBindingMethod;
    if ((getDeleteRuleBindingMethod = RulesServiceGrpc.getDeleteRuleBindingMethod) == null) {
      synchronized (RulesServiceGrpc.class) {
        if ((getDeleteRuleBindingMethod = RulesServiceGrpc.getDeleteRuleBindingMethod) == null) {
          RulesServiceGrpc.getDeleteRuleBindingMethod = getDeleteRuleBindingMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DeleteRuleBindingRequest, com.aruna.api.storage.services.v2.DeleteRuleBindingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRuleBinding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteRuleBindingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteRuleBindingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RulesServiceMethodDescriptorSupplier("DeleteRuleBinding"))
              .build();
        }
      }
    }
    return getDeleteRuleBindingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RulesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RulesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RulesServiceStub>() {
        @java.lang.Override
        public RulesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RulesServiceStub(channel, callOptions);
        }
      };
    return RulesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RulesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RulesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RulesServiceBlockingStub>() {
        @java.lang.Override
        public RulesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RulesServiceBlockingStub(channel, callOptions);
        }
      };
    return RulesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RulesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RulesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RulesServiceFutureStub>() {
        @java.lang.Override
        public RulesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RulesServiceFutureStub(channel, callOptions);
        }
      };
    return RulesServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * RulesService
   * Status: BETA
   * Contains all methods to edit and change rules
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateRule
     * Status: ALPHA
     * Create a new rule
     * </pre>
     */
    default void createRule(com.aruna.api.storage.services.v2.CreateRuleRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateRuleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRuleMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetRule
     * Status: ALPHA
     * Gets an existing rule
     * </pre>
     */
    default void getRule(com.aruna.api.storage.services.v2.GetRuleRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetRuleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRuleMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListRule
     * Status: ALPHA
     * Lists rules -&gt; Owned and public rules
     * </pre>
     */
    default void listRule(com.aruna.api.storage.services.v2.ListRuleRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ListRuleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRuleMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateRule
     * Status: ALPHA
     * Updates an existing rule
     * </pre>
     */
    default void updateRule(com.aruna.api.storage.services.v2.UpdateRuleRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateRuleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRuleMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteRule
     * Status: ALPHA
     * Deletes an existing rule
     * </pre>
     */
    default void deleteRule(com.aruna.api.storage.services.v2.DeleteRuleRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteRuleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRuleMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateRuleBinding
     * Status: ALPHA
     * Associates a rule with an object, optionally cascading the rule to all children
     * </pre>
     */
    default void createRuleBinding(com.aruna.api.storage.services.v2.CreateRuleBindingRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateRuleBindingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRuleBindingMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteRuleBinding
     * Status: ALPHA
     * Disassociates a rule from an object
     * </pre>
     */
    default void deleteRuleBinding(com.aruna.api.storage.services.v2.DeleteRuleBindingRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteRuleBindingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRuleBindingMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RulesService.
   * <pre>
   * RulesService
   * Status: BETA
   * Contains all methods to edit and change rules
   * </pre>
   */
  public static abstract class RulesServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RulesServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RulesService.
   * <pre>
   * RulesService
   * Status: BETA
   * Contains all methods to edit and change rules
   * </pre>
   */
  public static final class RulesServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RulesServiceStub> {
    private RulesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RulesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RulesServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateRule
     * Status: ALPHA
     * Create a new rule
     * </pre>
     */
    public void createRule(com.aruna.api.storage.services.v2.CreateRuleRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateRuleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetRule
     * Status: ALPHA
     * Gets an existing rule
     * </pre>
     */
    public void getRule(com.aruna.api.storage.services.v2.GetRuleRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetRuleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListRule
     * Status: ALPHA
     * Lists rules -&gt; Owned and public rules
     * </pre>
     */
    public void listRule(com.aruna.api.storage.services.v2.ListRuleRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ListRuleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateRule
     * Status: ALPHA
     * Updates an existing rule
     * </pre>
     */
    public void updateRule(com.aruna.api.storage.services.v2.UpdateRuleRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateRuleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteRule
     * Status: ALPHA
     * Deletes an existing rule
     * </pre>
     */
    public void deleteRule(com.aruna.api.storage.services.v2.DeleteRuleRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteRuleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateRuleBinding
     * Status: ALPHA
     * Associates a rule with an object, optionally cascading the rule to all children
     * </pre>
     */
    public void createRuleBinding(com.aruna.api.storage.services.v2.CreateRuleBindingRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateRuleBindingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRuleBindingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteRuleBinding
     * Status: ALPHA
     * Disassociates a rule from an object
     * </pre>
     */
    public void deleteRuleBinding(com.aruna.api.storage.services.v2.DeleteRuleBindingRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteRuleBindingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRuleBindingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RulesService.
   * <pre>
   * RulesService
   * Status: BETA
   * Contains all methods to edit and change rules
   * </pre>
   */
  public static final class RulesServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RulesServiceBlockingStub> {
    private RulesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RulesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RulesServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateRule
     * Status: ALPHA
     * Create a new rule
     * </pre>
     */
    public com.aruna.api.storage.services.v2.CreateRuleResponse createRule(com.aruna.api.storage.services.v2.CreateRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRuleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetRule
     * Status: ALPHA
     * Gets an existing rule
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetRuleResponse getRule(com.aruna.api.storage.services.v2.GetRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRuleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListRule
     * Status: ALPHA
     * Lists rules -&gt; Owned and public rules
     * </pre>
     */
    public com.aruna.api.storage.services.v2.ListRuleResponse listRule(com.aruna.api.storage.services.v2.ListRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRuleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateRule
     * Status: ALPHA
     * Updates an existing rule
     * </pre>
     */
    public com.aruna.api.storage.services.v2.UpdateRuleResponse updateRule(com.aruna.api.storage.services.v2.UpdateRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRuleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteRule
     * Status: ALPHA
     * Deletes an existing rule
     * </pre>
     */
    public com.aruna.api.storage.services.v2.DeleteRuleResponse deleteRule(com.aruna.api.storage.services.v2.DeleteRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRuleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateRuleBinding
     * Status: ALPHA
     * Associates a rule with an object, optionally cascading the rule to all children
     * </pre>
     */
    public com.aruna.api.storage.services.v2.CreateRuleBindingResponse createRuleBinding(com.aruna.api.storage.services.v2.CreateRuleBindingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRuleBindingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteRuleBinding
     * Status: ALPHA
     * Disassociates a rule from an object
     * </pre>
     */
    public com.aruna.api.storage.services.v2.DeleteRuleBindingResponse deleteRuleBinding(com.aruna.api.storage.services.v2.DeleteRuleBindingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRuleBindingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RulesService.
   * <pre>
   * RulesService
   * Status: BETA
   * Contains all methods to edit and change rules
   * </pre>
   */
  public static final class RulesServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RulesServiceFutureStub> {
    private RulesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RulesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RulesServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateRule
     * Status: ALPHA
     * Create a new rule
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.CreateRuleResponse> createRule(
        com.aruna.api.storage.services.v2.CreateRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRuleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetRule
     * Status: ALPHA
     * Gets an existing rule
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetRuleResponse> getRule(
        com.aruna.api.storage.services.v2.GetRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRuleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListRule
     * Status: ALPHA
     * Lists rules -&gt; Owned and public rules
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ListRuleResponse> listRule(
        com.aruna.api.storage.services.v2.ListRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRuleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateRule
     * Status: ALPHA
     * Updates an existing rule
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.UpdateRuleResponse> updateRule(
        com.aruna.api.storage.services.v2.UpdateRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRuleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteRule
     * Status: ALPHA
     * Deletes an existing rule
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DeleteRuleResponse> deleteRule(
        com.aruna.api.storage.services.v2.DeleteRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRuleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateRuleBinding
     * Status: ALPHA
     * Associates a rule with an object, optionally cascading the rule to all children
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.CreateRuleBindingResponse> createRuleBinding(
        com.aruna.api.storage.services.v2.CreateRuleBindingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRuleBindingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteRuleBinding
     * Status: ALPHA
     * Disassociates a rule from an object
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DeleteRuleBindingResponse> deleteRuleBinding(
        com.aruna.api.storage.services.v2.DeleteRuleBindingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRuleBindingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_RULE = 0;
  private static final int METHODID_GET_RULE = 1;
  private static final int METHODID_LIST_RULE = 2;
  private static final int METHODID_UPDATE_RULE = 3;
  private static final int METHODID_DELETE_RULE = 4;
  private static final int METHODID_CREATE_RULE_BINDING = 5;
  private static final int METHODID_DELETE_RULE_BINDING = 6;

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
        case METHODID_CREATE_RULE:
          serviceImpl.createRule((com.aruna.api.storage.services.v2.CreateRuleRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateRuleResponse>) responseObserver);
          break;
        case METHODID_GET_RULE:
          serviceImpl.getRule((com.aruna.api.storage.services.v2.GetRuleRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetRuleResponse>) responseObserver);
          break;
        case METHODID_LIST_RULE:
          serviceImpl.listRule((com.aruna.api.storage.services.v2.ListRuleRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ListRuleResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RULE:
          serviceImpl.updateRule((com.aruna.api.storage.services.v2.UpdateRuleRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateRuleResponse>) responseObserver);
          break;
        case METHODID_DELETE_RULE:
          serviceImpl.deleteRule((com.aruna.api.storage.services.v2.DeleteRuleRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteRuleResponse>) responseObserver);
          break;
        case METHODID_CREATE_RULE_BINDING:
          serviceImpl.createRuleBinding((com.aruna.api.storage.services.v2.CreateRuleBindingRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateRuleBindingResponse>) responseObserver);
          break;
        case METHODID_DELETE_RULE_BINDING:
          serviceImpl.deleteRuleBinding((com.aruna.api.storage.services.v2.DeleteRuleBindingRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteRuleBindingResponse>) responseObserver);
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
          getCreateRuleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.CreateRuleRequest,
              com.aruna.api.storage.services.v2.CreateRuleResponse>(
                service, METHODID_CREATE_RULE)))
        .addMethod(
          getGetRuleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetRuleRequest,
              com.aruna.api.storage.services.v2.GetRuleResponse>(
                service, METHODID_GET_RULE)))
        .addMethod(
          getListRuleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ListRuleRequest,
              com.aruna.api.storage.services.v2.ListRuleResponse>(
                service, METHODID_LIST_RULE)))
        .addMethod(
          getUpdateRuleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.UpdateRuleRequest,
              com.aruna.api.storage.services.v2.UpdateRuleResponse>(
                service, METHODID_UPDATE_RULE)))
        .addMethod(
          getDeleteRuleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DeleteRuleRequest,
              com.aruna.api.storage.services.v2.DeleteRuleResponse>(
                service, METHODID_DELETE_RULE)))
        .addMethod(
          getCreateRuleBindingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.CreateRuleBindingRequest,
              com.aruna.api.storage.services.v2.CreateRuleBindingResponse>(
                service, METHODID_CREATE_RULE_BINDING)))
        .addMethod(
          getDeleteRuleBindingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DeleteRuleBindingRequest,
              com.aruna.api.storage.services.v2.DeleteRuleBindingResponse>(
                service, METHODID_DELETE_RULE_BINDING)))
        .build();
  }

  private static abstract class RulesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RulesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.storage.services.v2.RulesServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RulesService");
    }
  }

  private static final class RulesServiceFileDescriptorSupplier
      extends RulesServiceBaseDescriptorSupplier {
    RulesServiceFileDescriptorSupplier() {}
  }

  private static final class RulesServiceMethodDescriptorSupplier
      extends RulesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RulesServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RulesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RulesServiceFileDescriptorSupplier())
              .addMethod(getCreateRuleMethod())
              .addMethod(getGetRuleMethod())
              .addMethod(getListRuleMethod())
              .addMethod(getUpdateRuleMethod())
              .addMethod(getDeleteRuleMethod())
              .addMethod(getCreateRuleBindingMethod())
              .addMethod(getDeleteRuleBindingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
