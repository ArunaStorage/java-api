package com.aruna.api.notification.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * EventNotificationService
 * Status: BETA
 * A service to receive events for CRUD operations on resources (users, resources etc.)
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: aruna/api/notification/services/v2/notification_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EventNotificationServiceGrpc {

  private EventNotificationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "aruna.api.notification.services.v2.EventNotificationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.CreateStreamConsumerRequest,
      com.aruna.api.notification.services.v2.CreateStreamConsumerResponse> getCreateStreamConsumerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateStreamConsumer",
      requestType = com.aruna.api.notification.services.v2.CreateStreamConsumerRequest.class,
      responseType = com.aruna.api.notification.services.v2.CreateStreamConsumerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.CreateStreamConsumerRequest,
      com.aruna.api.notification.services.v2.CreateStreamConsumerResponse> getCreateStreamConsumerMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.CreateStreamConsumerRequest, com.aruna.api.notification.services.v2.CreateStreamConsumerResponse> getCreateStreamConsumerMethod;
    if ((getCreateStreamConsumerMethod = EventNotificationServiceGrpc.getCreateStreamConsumerMethod) == null) {
      synchronized (EventNotificationServiceGrpc.class) {
        if ((getCreateStreamConsumerMethod = EventNotificationServiceGrpc.getCreateStreamConsumerMethod) == null) {
          EventNotificationServiceGrpc.getCreateStreamConsumerMethod = getCreateStreamConsumerMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.notification.services.v2.CreateStreamConsumerRequest, com.aruna.api.notification.services.v2.CreateStreamConsumerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateStreamConsumer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.notification.services.v2.CreateStreamConsumerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.notification.services.v2.CreateStreamConsumerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventNotificationServiceMethodDescriptorSupplier("CreateStreamConsumer"))
              .build();
        }
      }
    }
    return getCreateStreamConsumerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.GetEventMessageBatchRequest,
      com.aruna.api.notification.services.v2.GetEventMessageBatchResponse> getGetEventMessageBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventMessageBatch",
      requestType = com.aruna.api.notification.services.v2.GetEventMessageBatchRequest.class,
      responseType = com.aruna.api.notification.services.v2.GetEventMessageBatchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.GetEventMessageBatchRequest,
      com.aruna.api.notification.services.v2.GetEventMessageBatchResponse> getGetEventMessageBatchMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.GetEventMessageBatchRequest, com.aruna.api.notification.services.v2.GetEventMessageBatchResponse> getGetEventMessageBatchMethod;
    if ((getGetEventMessageBatchMethod = EventNotificationServiceGrpc.getGetEventMessageBatchMethod) == null) {
      synchronized (EventNotificationServiceGrpc.class) {
        if ((getGetEventMessageBatchMethod = EventNotificationServiceGrpc.getGetEventMessageBatchMethod) == null) {
          EventNotificationServiceGrpc.getGetEventMessageBatchMethod = getGetEventMessageBatchMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.notification.services.v2.GetEventMessageBatchRequest, com.aruna.api.notification.services.v2.GetEventMessageBatchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventMessageBatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.notification.services.v2.GetEventMessageBatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.notification.services.v2.GetEventMessageBatchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventNotificationServiceMethodDescriptorSupplier("GetEventMessageBatch"))
              .build();
        }
      }
    }
    return getGetEventMessageBatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.GetEventMessageStreamRequest,
      com.aruna.api.notification.services.v2.GetEventMessageStreamResponse> getGetEventMessageStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventMessageStream",
      requestType = com.aruna.api.notification.services.v2.GetEventMessageStreamRequest.class,
      responseType = com.aruna.api.notification.services.v2.GetEventMessageStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.GetEventMessageStreamRequest,
      com.aruna.api.notification.services.v2.GetEventMessageStreamResponse> getGetEventMessageStreamMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.GetEventMessageStreamRequest, com.aruna.api.notification.services.v2.GetEventMessageStreamResponse> getGetEventMessageStreamMethod;
    if ((getGetEventMessageStreamMethod = EventNotificationServiceGrpc.getGetEventMessageStreamMethod) == null) {
      synchronized (EventNotificationServiceGrpc.class) {
        if ((getGetEventMessageStreamMethod = EventNotificationServiceGrpc.getGetEventMessageStreamMethod) == null) {
          EventNotificationServiceGrpc.getGetEventMessageStreamMethod = getGetEventMessageStreamMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.notification.services.v2.GetEventMessageStreamRequest, com.aruna.api.notification.services.v2.GetEventMessageStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventMessageStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.notification.services.v2.GetEventMessageStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.notification.services.v2.GetEventMessageStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventNotificationServiceMethodDescriptorSupplier("GetEventMessageStream"))
              .build();
        }
      }
    }
    return getGetEventMessageStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.AcknowledgeMessageBatchRequest,
      com.aruna.api.notification.services.v2.AcknowledgeMessageBatchResponse> getAcknowledgeMessageBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AcknowledgeMessageBatch",
      requestType = com.aruna.api.notification.services.v2.AcknowledgeMessageBatchRequest.class,
      responseType = com.aruna.api.notification.services.v2.AcknowledgeMessageBatchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.AcknowledgeMessageBatchRequest,
      com.aruna.api.notification.services.v2.AcknowledgeMessageBatchResponse> getAcknowledgeMessageBatchMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.AcknowledgeMessageBatchRequest, com.aruna.api.notification.services.v2.AcknowledgeMessageBatchResponse> getAcknowledgeMessageBatchMethod;
    if ((getAcknowledgeMessageBatchMethod = EventNotificationServiceGrpc.getAcknowledgeMessageBatchMethod) == null) {
      synchronized (EventNotificationServiceGrpc.class) {
        if ((getAcknowledgeMessageBatchMethod = EventNotificationServiceGrpc.getAcknowledgeMessageBatchMethod) == null) {
          EventNotificationServiceGrpc.getAcknowledgeMessageBatchMethod = getAcknowledgeMessageBatchMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.notification.services.v2.AcknowledgeMessageBatchRequest, com.aruna.api.notification.services.v2.AcknowledgeMessageBatchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AcknowledgeMessageBatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.notification.services.v2.AcknowledgeMessageBatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.notification.services.v2.AcknowledgeMessageBatchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventNotificationServiceMethodDescriptorSupplier("AcknowledgeMessageBatch"))
              .build();
        }
      }
    }
    return getAcknowledgeMessageBatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.DeleteStreamConsumerRequest,
      com.aruna.api.notification.services.v2.DeleteStreamConsumerResponse> getDeleteStreamConsumerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteStreamConsumer",
      requestType = com.aruna.api.notification.services.v2.DeleteStreamConsumerRequest.class,
      responseType = com.aruna.api.notification.services.v2.DeleteStreamConsumerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.DeleteStreamConsumerRequest,
      com.aruna.api.notification.services.v2.DeleteStreamConsumerResponse> getDeleteStreamConsumerMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.DeleteStreamConsumerRequest, com.aruna.api.notification.services.v2.DeleteStreamConsumerResponse> getDeleteStreamConsumerMethod;
    if ((getDeleteStreamConsumerMethod = EventNotificationServiceGrpc.getDeleteStreamConsumerMethod) == null) {
      synchronized (EventNotificationServiceGrpc.class) {
        if ((getDeleteStreamConsumerMethod = EventNotificationServiceGrpc.getDeleteStreamConsumerMethod) == null) {
          EventNotificationServiceGrpc.getDeleteStreamConsumerMethod = getDeleteStreamConsumerMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.notification.services.v2.DeleteStreamConsumerRequest, com.aruna.api.notification.services.v2.DeleteStreamConsumerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteStreamConsumer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.notification.services.v2.DeleteStreamConsumerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.notification.services.v2.DeleteStreamConsumerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventNotificationServiceMethodDescriptorSupplier("DeleteStreamConsumer"))
              .build();
        }
      }
    }
    return getDeleteStreamConsumerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventNotificationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventNotificationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventNotificationServiceStub>() {
        @java.lang.Override
        public EventNotificationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventNotificationServiceStub(channel, callOptions);
        }
      };
    return EventNotificationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventNotificationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventNotificationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventNotificationServiceBlockingStub>() {
        @java.lang.Override
        public EventNotificationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventNotificationServiceBlockingStub(channel, callOptions);
        }
      };
    return EventNotificationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventNotificationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventNotificationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventNotificationServiceFutureStub>() {
        @java.lang.Override
        public EventNotificationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventNotificationServiceFutureStub(channel, callOptions);
        }
      };
    return EventNotificationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * EventNotificationService
   * Status: BETA
   * A service to receive events for CRUD operations on resources (users, resources etc.)
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateStreamConsumer
     * Status: BETA
     * Creates a new event stream consumer.
     * </pre>
     */
    default void createStreamConsumer(com.aruna.api.notification.services.v2.CreateStreamConsumerRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.CreateStreamConsumerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateStreamConsumerMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetEventMessageBatch
     * Status: BETA
     * Reads a set of messages from a given stream group 
     * Each message contains a separate acknowledgement message thatis protected by a salt and an hmac for verification.
     * The message can be send directly through the AcknowledgeMessageBatch call to acknowledge the message.
     * </pre>
     */
    default void getEventMessageBatch(com.aruna.api.notification.services.v2.GetEventMessageBatchRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.GetEventMessageBatchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventMessageBatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetEventMessageBatch
     * Status: BETA
     * Opens a stream which pushes each received notification individual and just-in-time.
     * Each message contains a separate acknowledgement message that is protected by a salt and an hmac for verification.
     * The message can be send directly through the AcknowledgeMessageBatch call to acknowledge the message.
     * </pre>
     */
    default void getEventMessageStream(com.aruna.api.notification.services.v2.GetEventMessageStreamRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.GetEventMessageStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventMessageStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * AcknowledgeMessageBatch
     * Status: BETA
     * List of messages to acknowledge
     * Each reply is protected by a salt and and hmac that verifies the message
     * </pre>
     */
    default void acknowledgeMessageBatch(com.aruna.api.notification.services.v2.AcknowledgeMessageBatchRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.AcknowledgeMessageBatchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAcknowledgeMessageBatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteEventStreamingGroup
     * Status: BETA
     * Deletes an existing event stream consumer by ID.
     * </pre>
     */
    default void deleteStreamConsumer(com.aruna.api.notification.services.v2.DeleteStreamConsumerRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.DeleteStreamConsumerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteStreamConsumerMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EventNotificationService.
   * <pre>
   * EventNotificationService
   * Status: BETA
   * A service to receive events for CRUD operations on resources (users, resources etc.)
   * </pre>
   */
  public static abstract class EventNotificationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EventNotificationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EventNotificationService.
   * <pre>
   * EventNotificationService
   * Status: BETA
   * A service to receive events for CRUD operations on resources (users, resources etc.)
   * </pre>
   */
  public static final class EventNotificationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EventNotificationServiceStub> {
    private EventNotificationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventNotificationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventNotificationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateStreamConsumer
     * Status: BETA
     * Creates a new event stream consumer.
     * </pre>
     */
    public void createStreamConsumer(com.aruna.api.notification.services.v2.CreateStreamConsumerRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.CreateStreamConsumerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateStreamConsumerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetEventMessageBatch
     * Status: BETA
     * Reads a set of messages from a given stream group 
     * Each message contains a separate acknowledgement message thatis protected by a salt and an hmac for verification.
     * The message can be send directly through the AcknowledgeMessageBatch call to acknowledge the message.
     * </pre>
     */
    public void getEventMessageBatch(com.aruna.api.notification.services.v2.GetEventMessageBatchRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.GetEventMessageBatchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventMessageBatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetEventMessageBatch
     * Status: BETA
     * Opens a stream which pushes each received notification individual and just-in-time.
     * Each message contains a separate acknowledgement message that is protected by a salt and an hmac for verification.
     * The message can be send directly through the AcknowledgeMessageBatch call to acknowledge the message.
     * </pre>
     */
    public void getEventMessageStream(com.aruna.api.notification.services.v2.GetEventMessageStreamRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.GetEventMessageStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetEventMessageStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AcknowledgeMessageBatch
     * Status: BETA
     * List of messages to acknowledge
     * Each reply is protected by a salt and and hmac that verifies the message
     * </pre>
     */
    public void acknowledgeMessageBatch(com.aruna.api.notification.services.v2.AcknowledgeMessageBatchRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.AcknowledgeMessageBatchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAcknowledgeMessageBatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteEventStreamingGroup
     * Status: BETA
     * Deletes an existing event stream consumer by ID.
     * </pre>
     */
    public void deleteStreamConsumer(com.aruna.api.notification.services.v2.DeleteStreamConsumerRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.DeleteStreamConsumerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteStreamConsumerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EventNotificationService.
   * <pre>
   * EventNotificationService
   * Status: BETA
   * A service to receive events for CRUD operations on resources (users, resources etc.)
   * </pre>
   */
  public static final class EventNotificationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EventNotificationServiceBlockingStub> {
    private EventNotificationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventNotificationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventNotificationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateStreamConsumer
     * Status: BETA
     * Creates a new event stream consumer.
     * </pre>
     */
    public com.aruna.api.notification.services.v2.CreateStreamConsumerResponse createStreamConsumer(com.aruna.api.notification.services.v2.CreateStreamConsumerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateStreamConsumerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetEventMessageBatch
     * Status: BETA
     * Reads a set of messages from a given stream group 
     * Each message contains a separate acknowledgement message thatis protected by a salt and an hmac for verification.
     * The message can be send directly through the AcknowledgeMessageBatch call to acknowledge the message.
     * </pre>
     */
    public com.aruna.api.notification.services.v2.GetEventMessageBatchResponse getEventMessageBatch(com.aruna.api.notification.services.v2.GetEventMessageBatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventMessageBatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetEventMessageBatch
     * Status: BETA
     * Opens a stream which pushes each received notification individual and just-in-time.
     * Each message contains a separate acknowledgement message that is protected by a salt and an hmac for verification.
     * The message can be send directly through the AcknowledgeMessageBatch call to acknowledge the message.
     * </pre>
     */
    public java.util.Iterator<com.aruna.api.notification.services.v2.GetEventMessageStreamResponse> getEventMessageStream(
        com.aruna.api.notification.services.v2.GetEventMessageStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetEventMessageStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AcknowledgeMessageBatch
     * Status: BETA
     * List of messages to acknowledge
     * Each reply is protected by a salt and and hmac that verifies the message
     * </pre>
     */
    public com.aruna.api.notification.services.v2.AcknowledgeMessageBatchResponse acknowledgeMessageBatch(com.aruna.api.notification.services.v2.AcknowledgeMessageBatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAcknowledgeMessageBatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteEventStreamingGroup
     * Status: BETA
     * Deletes an existing event stream consumer by ID.
     * </pre>
     */
    public com.aruna.api.notification.services.v2.DeleteStreamConsumerResponse deleteStreamConsumer(com.aruna.api.notification.services.v2.DeleteStreamConsumerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteStreamConsumerMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EventNotificationService.
   * <pre>
   * EventNotificationService
   * Status: BETA
   * A service to receive events for CRUD operations on resources (users, resources etc.)
   * </pre>
   */
  public static final class EventNotificationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EventNotificationServiceFutureStub> {
    private EventNotificationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventNotificationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventNotificationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateStreamConsumer
     * Status: BETA
     * Creates a new event stream consumer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.notification.services.v2.CreateStreamConsumerResponse> createStreamConsumer(
        com.aruna.api.notification.services.v2.CreateStreamConsumerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateStreamConsumerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetEventMessageBatch
     * Status: BETA
     * Reads a set of messages from a given stream group 
     * Each message contains a separate acknowledgement message thatis protected by a salt and an hmac for verification.
     * The message can be send directly through the AcknowledgeMessageBatch call to acknowledge the message.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.notification.services.v2.GetEventMessageBatchResponse> getEventMessageBatch(
        com.aruna.api.notification.services.v2.GetEventMessageBatchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventMessageBatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AcknowledgeMessageBatch
     * Status: BETA
     * List of messages to acknowledge
     * Each reply is protected by a salt and and hmac that verifies the message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.notification.services.v2.AcknowledgeMessageBatchResponse> acknowledgeMessageBatch(
        com.aruna.api.notification.services.v2.AcknowledgeMessageBatchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAcknowledgeMessageBatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteEventStreamingGroup
     * Status: BETA
     * Deletes an existing event stream consumer by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.notification.services.v2.DeleteStreamConsumerResponse> deleteStreamConsumer(
        com.aruna.api.notification.services.v2.DeleteStreamConsumerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteStreamConsumerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_STREAM_CONSUMER = 0;
  private static final int METHODID_GET_EVENT_MESSAGE_BATCH = 1;
  private static final int METHODID_GET_EVENT_MESSAGE_STREAM = 2;
  private static final int METHODID_ACKNOWLEDGE_MESSAGE_BATCH = 3;
  private static final int METHODID_DELETE_STREAM_CONSUMER = 4;

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
        case METHODID_CREATE_STREAM_CONSUMER:
          serviceImpl.createStreamConsumer((com.aruna.api.notification.services.v2.CreateStreamConsumerRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.CreateStreamConsumerResponse>) responseObserver);
          break;
        case METHODID_GET_EVENT_MESSAGE_BATCH:
          serviceImpl.getEventMessageBatch((com.aruna.api.notification.services.v2.GetEventMessageBatchRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.GetEventMessageBatchResponse>) responseObserver);
          break;
        case METHODID_GET_EVENT_MESSAGE_STREAM:
          serviceImpl.getEventMessageStream((com.aruna.api.notification.services.v2.GetEventMessageStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.GetEventMessageStreamResponse>) responseObserver);
          break;
        case METHODID_ACKNOWLEDGE_MESSAGE_BATCH:
          serviceImpl.acknowledgeMessageBatch((com.aruna.api.notification.services.v2.AcknowledgeMessageBatchRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.AcknowledgeMessageBatchResponse>) responseObserver);
          break;
        case METHODID_DELETE_STREAM_CONSUMER:
          serviceImpl.deleteStreamConsumer((com.aruna.api.notification.services.v2.DeleteStreamConsumerRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.DeleteStreamConsumerResponse>) responseObserver);
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
          getCreateStreamConsumerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.notification.services.v2.CreateStreamConsumerRequest,
              com.aruna.api.notification.services.v2.CreateStreamConsumerResponse>(
                service, METHODID_CREATE_STREAM_CONSUMER)))
        .addMethod(
          getGetEventMessageBatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.notification.services.v2.GetEventMessageBatchRequest,
              com.aruna.api.notification.services.v2.GetEventMessageBatchResponse>(
                service, METHODID_GET_EVENT_MESSAGE_BATCH)))
        .addMethod(
          getGetEventMessageStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.aruna.api.notification.services.v2.GetEventMessageStreamRequest,
              com.aruna.api.notification.services.v2.GetEventMessageStreamResponse>(
                service, METHODID_GET_EVENT_MESSAGE_STREAM)))
        .addMethod(
          getAcknowledgeMessageBatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.notification.services.v2.AcknowledgeMessageBatchRequest,
              com.aruna.api.notification.services.v2.AcknowledgeMessageBatchResponse>(
                service, METHODID_ACKNOWLEDGE_MESSAGE_BATCH)))
        .addMethod(
          getDeleteStreamConsumerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.notification.services.v2.DeleteStreamConsumerRequest,
              com.aruna.api.notification.services.v2.DeleteStreamConsumerResponse>(
                service, METHODID_DELETE_STREAM_CONSUMER)))
        .build();
  }

  private static abstract class EventNotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventNotificationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.notification.services.v2.NotificationServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventNotificationService");
    }
  }

  private static final class EventNotificationServiceFileDescriptorSupplier
      extends EventNotificationServiceBaseDescriptorSupplier {
    EventNotificationServiceFileDescriptorSupplier() {}
  }

  private static final class EventNotificationServiceMethodDescriptorSupplier
      extends EventNotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EventNotificationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EventNotificationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventNotificationServiceFileDescriptorSupplier())
              .addMethod(getCreateStreamConsumerMethod())
              .addMethod(getGetEventMessageBatchMethod())
              .addMethod(getGetEventMessageStreamMethod())
              .addMethod(getAcknowledgeMessageBatchMethod())
              .addMethod(getDeleteStreamConsumerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
