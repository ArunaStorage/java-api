package com.aruna.api.notification.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * EventNotificationService
 * A service to receive events in the AOS storage
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/notification/services/v2/notification_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EventNotificationServiceGrpc {

  private EventNotificationServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.notification.services.v2.EventNotificationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.NotificationServiceProto.CreateStreamConsumerRequest,
      com.aruna.api.notification.services.v2.NotificationServiceProto.CreateStreamConsumerResponse> getCreateStreamConsumerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateStreamConsumer",
      requestType = com.aruna.api.notification.services.v2.NotificationServiceProto.CreateStreamConsumerRequest.class,
      responseType = com.aruna.api.notification.services.v2.NotificationServiceProto.CreateStreamConsumerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.NotificationServiceProto.CreateStreamConsumerRequest,
      com.aruna.api.notification.services.v2.NotificationServiceProto.CreateStreamConsumerResponse> getCreateStreamConsumerMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.NotificationServiceProto.CreateStreamConsumerRequest, com.aruna.api.notification.services.v2.NotificationServiceProto.CreateStreamConsumerResponse> getCreateStreamConsumerMethod;
    if ((getCreateStreamConsumerMethod = EventNotificationServiceGrpc.getCreateStreamConsumerMethod) == null) {
      synchronized (EventNotificationServiceGrpc.class) {
        if ((getCreateStreamConsumerMethod = EventNotificationServiceGrpc.getCreateStreamConsumerMethod) == null) {
          EventNotificationServiceGrpc.getCreateStreamConsumerMethod = getCreateStreamConsumerMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.notification.services.v2.NotificationServiceProto.CreateStreamConsumerRequest, com.aruna.api.notification.services.v2.NotificationServiceProto.CreateStreamConsumerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateStreamConsumer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.notification.services.v2.NotificationServiceProto.CreateStreamConsumerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.notification.services.v2.NotificationServiceProto.CreateStreamConsumerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventNotificationServiceMethodDescriptorSupplier("CreateStreamConsumer"))
              .build();
        }
      }
    }
    return getCreateStreamConsumerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchRequest,
      com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchResponse> getGetEventMessageBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventMessageBatch",
      requestType = com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchRequest.class,
      responseType = com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchRequest,
      com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchResponse> getGetEventMessageBatchMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchRequest, com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchResponse> getGetEventMessageBatchMethod;
    if ((getGetEventMessageBatchMethod = EventNotificationServiceGrpc.getGetEventMessageBatchMethod) == null) {
      synchronized (EventNotificationServiceGrpc.class) {
        if ((getGetEventMessageBatchMethod = EventNotificationServiceGrpc.getGetEventMessageBatchMethod) == null) {
          EventNotificationServiceGrpc.getGetEventMessageBatchMethod = getGetEventMessageBatchMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchRequest, com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventMessageBatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventNotificationServiceMethodDescriptorSupplier("GetEventMessageBatch"))
              .build();
        }
      }
    }
    return getGetEventMessageBatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchStreamRequest,
      com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchStreamResponse> getGetEventMessageBatchStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventMessageBatchStream",
      requestType = com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchStreamRequest.class,
      responseType = com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchStreamRequest,
      com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchStreamResponse> getGetEventMessageBatchStreamMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchStreamRequest, com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchStreamResponse> getGetEventMessageBatchStreamMethod;
    if ((getGetEventMessageBatchStreamMethod = EventNotificationServiceGrpc.getGetEventMessageBatchStreamMethod) == null) {
      synchronized (EventNotificationServiceGrpc.class) {
        if ((getGetEventMessageBatchStreamMethod = EventNotificationServiceGrpc.getGetEventMessageBatchStreamMethod) == null) {
          EventNotificationServiceGrpc.getGetEventMessageBatchStreamMethod = getGetEventMessageBatchStreamMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchStreamRequest, com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventMessageBatchStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventNotificationServiceMethodDescriptorSupplier("GetEventMessageBatchStream"))
              .build();
        }
      }
    }
    return getGetEventMessageBatchStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.NotificationServiceProto.AcknowledgeMessageBatchRequest,
      com.aruna.api.notification.services.v2.NotificationServiceProto.AcknowledgeMessageBatchResponse> getAcknowledgeMessageBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AcknowledgeMessageBatch",
      requestType = com.aruna.api.notification.services.v2.NotificationServiceProto.AcknowledgeMessageBatchRequest.class,
      responseType = com.aruna.api.notification.services.v2.NotificationServiceProto.AcknowledgeMessageBatchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.NotificationServiceProto.AcknowledgeMessageBatchRequest,
      com.aruna.api.notification.services.v2.NotificationServiceProto.AcknowledgeMessageBatchResponse> getAcknowledgeMessageBatchMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.NotificationServiceProto.AcknowledgeMessageBatchRequest, com.aruna.api.notification.services.v2.NotificationServiceProto.AcknowledgeMessageBatchResponse> getAcknowledgeMessageBatchMethod;
    if ((getAcknowledgeMessageBatchMethod = EventNotificationServiceGrpc.getAcknowledgeMessageBatchMethod) == null) {
      synchronized (EventNotificationServiceGrpc.class) {
        if ((getAcknowledgeMessageBatchMethod = EventNotificationServiceGrpc.getAcknowledgeMessageBatchMethod) == null) {
          EventNotificationServiceGrpc.getAcknowledgeMessageBatchMethod = getAcknowledgeMessageBatchMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.notification.services.v2.NotificationServiceProto.AcknowledgeMessageBatchRequest, com.aruna.api.notification.services.v2.NotificationServiceProto.AcknowledgeMessageBatchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AcknowledgeMessageBatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.notification.services.v2.NotificationServiceProto.AcknowledgeMessageBatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.notification.services.v2.NotificationServiceProto.AcknowledgeMessageBatchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventNotificationServiceMethodDescriptorSupplier("AcknowledgeMessageBatch"))
              .build();
        }
      }
    }
    return getAcknowledgeMessageBatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.NotificationServiceProto.DeleteEventStreamingGroupRequest,
      com.aruna.api.notification.services.v2.NotificationServiceProto.DeleteEventStreamingGroupResponse> getDeleteEventStreamingGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEventStreamingGroup",
      requestType = com.aruna.api.notification.services.v2.NotificationServiceProto.DeleteEventStreamingGroupRequest.class,
      responseType = com.aruna.api.notification.services.v2.NotificationServiceProto.DeleteEventStreamingGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.NotificationServiceProto.DeleteEventStreamingGroupRequest,
      com.aruna.api.notification.services.v2.NotificationServiceProto.DeleteEventStreamingGroupResponse> getDeleteEventStreamingGroupMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.notification.services.v2.NotificationServiceProto.DeleteEventStreamingGroupRequest, com.aruna.api.notification.services.v2.NotificationServiceProto.DeleteEventStreamingGroupResponse> getDeleteEventStreamingGroupMethod;
    if ((getDeleteEventStreamingGroupMethod = EventNotificationServiceGrpc.getDeleteEventStreamingGroupMethod) == null) {
      synchronized (EventNotificationServiceGrpc.class) {
        if ((getDeleteEventStreamingGroupMethod = EventNotificationServiceGrpc.getDeleteEventStreamingGroupMethod) == null) {
          EventNotificationServiceGrpc.getDeleteEventStreamingGroupMethod = getDeleteEventStreamingGroupMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.notification.services.v2.NotificationServiceProto.DeleteEventStreamingGroupRequest, com.aruna.api.notification.services.v2.NotificationServiceProto.DeleteEventStreamingGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEventStreamingGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.notification.services.v2.NotificationServiceProto.DeleteEventStreamingGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.notification.services.v2.NotificationServiceProto.DeleteEventStreamingGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventNotificationServiceMethodDescriptorSupplier("DeleteEventStreamingGroup"))
              .build();
        }
      }
    }
    return getDeleteEventStreamingGroupMethod;
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
   * A service to receive events in the AOS storage
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateEventStreamingGroup
     * Creates a new EventStreamingGroup
     * </pre>
     */
    default void createStreamConsumer(com.aruna.api.notification.services.v2.NotificationServiceProto.CreateStreamConsumerRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.NotificationServiceProto.CreateStreamConsumerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateStreamConsumerMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetEventMessageBatch
     * Reads a set of messages from a given stream group
     * Each message contains a separate acknowledgement message that is protected by a salt and an hmac for verification
     * The message can be send directly through the AcknowledgeMessageBatch call to acknowledge the message
     * </pre>
     */
    default void getEventMessageBatch(com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventMessageBatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetEventMessageBatch
     * Reads a set of messages from a given stream group
     * Each message contains a separate acknowledgement message that is protected by a salt and an hmac for verification
     * The message can be send directly through the AcknowledgeMessageBatch call to acknowledge the message
     * </pre>
     */
    default void getEventMessageBatchStream(com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchStreamRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventMessageBatchStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * AcknowledgeMessageBatch
     * List of messages to acknowledge
     * Each reply is protected by a salt and and hmac that verifies the message
     * </pre>
     */
    default void acknowledgeMessageBatch(com.aruna.api.notification.services.v2.NotificationServiceProto.AcknowledgeMessageBatchRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.NotificationServiceProto.AcknowledgeMessageBatchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAcknowledgeMessageBatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteEventStreamingGroup
     * Deletes a existing EventStreamingGroup by ID
     * </pre>
     */
    default void deleteEventStreamingGroup(com.aruna.api.notification.services.v2.NotificationServiceProto.DeleteEventStreamingGroupRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.NotificationServiceProto.DeleteEventStreamingGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEventStreamingGroupMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EventNotificationService.
   * <pre>
   * EventNotificationService
   * A service to receive events in the AOS storage
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
   * A service to receive events in the AOS storage
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
     * CreateEventStreamingGroup
     * Creates a new EventStreamingGroup
     * </pre>
     */
    public void createStreamConsumer(com.aruna.api.notification.services.v2.NotificationServiceProto.CreateStreamConsumerRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.NotificationServiceProto.CreateStreamConsumerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateStreamConsumerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetEventMessageBatch
     * Reads a set of messages from a given stream group
     * Each message contains a separate acknowledgement message that is protected by a salt and an hmac for verification
     * The message can be send directly through the AcknowledgeMessageBatch call to acknowledge the message
     * </pre>
     */
    public void getEventMessageBatch(com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventMessageBatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetEventMessageBatch
     * Reads a set of messages from a given stream group
     * Each message contains a separate acknowledgement message that is protected by a salt and an hmac for verification
     * The message can be send directly through the AcknowledgeMessageBatch call to acknowledge the message
     * </pre>
     */
    public void getEventMessageBatchStream(com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchStreamRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetEventMessageBatchStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AcknowledgeMessageBatch
     * List of messages to acknowledge
     * Each reply is protected by a salt and and hmac that verifies the message
     * </pre>
     */
    public void acknowledgeMessageBatch(com.aruna.api.notification.services.v2.NotificationServiceProto.AcknowledgeMessageBatchRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.NotificationServiceProto.AcknowledgeMessageBatchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAcknowledgeMessageBatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteEventStreamingGroup
     * Deletes a existing EventStreamingGroup by ID
     * </pre>
     */
    public void deleteEventStreamingGroup(com.aruna.api.notification.services.v2.NotificationServiceProto.DeleteEventStreamingGroupRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.NotificationServiceProto.DeleteEventStreamingGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEventStreamingGroupMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EventNotificationService.
   * <pre>
   * EventNotificationService
   * A service to receive events in the AOS storage
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
     * CreateEventStreamingGroup
     * Creates a new EventStreamingGroup
     * </pre>
     */
    public com.aruna.api.notification.services.v2.NotificationServiceProto.CreateStreamConsumerResponse createStreamConsumer(com.aruna.api.notification.services.v2.NotificationServiceProto.CreateStreamConsumerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateStreamConsumerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetEventMessageBatch
     * Reads a set of messages from a given stream group
     * Each message contains a separate acknowledgement message that is protected by a salt and an hmac for verification
     * The message can be send directly through the AcknowledgeMessageBatch call to acknowledge the message
     * </pre>
     */
    public com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchResponse getEventMessageBatch(com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventMessageBatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetEventMessageBatch
     * Reads a set of messages from a given stream group
     * Each message contains a separate acknowledgement message that is protected by a salt and an hmac for verification
     * The message can be send directly through the AcknowledgeMessageBatch call to acknowledge the message
     * </pre>
     */
    public java.util.Iterator<com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchStreamResponse> getEventMessageBatchStream(
        com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetEventMessageBatchStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AcknowledgeMessageBatch
     * List of messages to acknowledge
     * Each reply is protected by a salt and and hmac that verifies the message
     * </pre>
     */
    public com.aruna.api.notification.services.v2.NotificationServiceProto.AcknowledgeMessageBatchResponse acknowledgeMessageBatch(com.aruna.api.notification.services.v2.NotificationServiceProto.AcknowledgeMessageBatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAcknowledgeMessageBatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteEventStreamingGroup
     * Deletes a existing EventStreamingGroup by ID
     * </pre>
     */
    public com.aruna.api.notification.services.v2.NotificationServiceProto.DeleteEventStreamingGroupResponse deleteEventStreamingGroup(com.aruna.api.notification.services.v2.NotificationServiceProto.DeleteEventStreamingGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEventStreamingGroupMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EventNotificationService.
   * <pre>
   * EventNotificationService
   * A service to receive events in the AOS storage
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
     * CreateEventStreamingGroup
     * Creates a new EventStreamingGroup
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.notification.services.v2.NotificationServiceProto.CreateStreamConsumerResponse> createStreamConsumer(
        com.aruna.api.notification.services.v2.NotificationServiceProto.CreateStreamConsumerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateStreamConsumerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetEventMessageBatch
     * Reads a set of messages from a given stream group
     * Each message contains a separate acknowledgement message that is protected by a salt and an hmac for verification
     * The message can be send directly through the AcknowledgeMessageBatch call to acknowledge the message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchResponse> getEventMessageBatch(
        com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventMessageBatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AcknowledgeMessageBatch
     * List of messages to acknowledge
     * Each reply is protected by a salt and and hmac that verifies the message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.notification.services.v2.NotificationServiceProto.AcknowledgeMessageBatchResponse> acknowledgeMessageBatch(
        com.aruna.api.notification.services.v2.NotificationServiceProto.AcknowledgeMessageBatchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAcknowledgeMessageBatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteEventStreamingGroup
     * Deletes a existing EventStreamingGroup by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.notification.services.v2.NotificationServiceProto.DeleteEventStreamingGroupResponse> deleteEventStreamingGroup(
        com.aruna.api.notification.services.v2.NotificationServiceProto.DeleteEventStreamingGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEventStreamingGroupMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_STREAM_CONSUMER = 0;
  private static final int METHODID_GET_EVENT_MESSAGE_BATCH = 1;
  private static final int METHODID_GET_EVENT_MESSAGE_BATCH_STREAM = 2;
  private static final int METHODID_ACKNOWLEDGE_MESSAGE_BATCH = 3;
  private static final int METHODID_DELETE_EVENT_STREAMING_GROUP = 4;

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
          serviceImpl.createStreamConsumer((com.aruna.api.notification.services.v2.NotificationServiceProto.CreateStreamConsumerRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.NotificationServiceProto.CreateStreamConsumerResponse>) responseObserver);
          break;
        case METHODID_GET_EVENT_MESSAGE_BATCH:
          serviceImpl.getEventMessageBatch((com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchResponse>) responseObserver);
          break;
        case METHODID_GET_EVENT_MESSAGE_BATCH_STREAM:
          serviceImpl.getEventMessageBatchStream((com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchStreamResponse>) responseObserver);
          break;
        case METHODID_ACKNOWLEDGE_MESSAGE_BATCH:
          serviceImpl.acknowledgeMessageBatch((com.aruna.api.notification.services.v2.NotificationServiceProto.AcknowledgeMessageBatchRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.NotificationServiceProto.AcknowledgeMessageBatchResponse>) responseObserver);
          break;
        case METHODID_DELETE_EVENT_STREAMING_GROUP:
          serviceImpl.deleteEventStreamingGroup((com.aruna.api.notification.services.v2.NotificationServiceProto.DeleteEventStreamingGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.notification.services.v2.NotificationServiceProto.DeleteEventStreamingGroupResponse>) responseObserver);
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
              com.aruna.api.notification.services.v2.NotificationServiceProto.CreateStreamConsumerRequest,
              com.aruna.api.notification.services.v2.NotificationServiceProto.CreateStreamConsumerResponse>(
                service, METHODID_CREATE_STREAM_CONSUMER)))
        .addMethod(
          getGetEventMessageBatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchRequest,
              com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchResponse>(
                service, METHODID_GET_EVENT_MESSAGE_BATCH)))
        .addMethod(
          getGetEventMessageBatchStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchStreamRequest,
              com.aruna.api.notification.services.v2.NotificationServiceProto.GetEventMessageBatchStreamResponse>(
                service, METHODID_GET_EVENT_MESSAGE_BATCH_STREAM)))
        .addMethod(
          getAcknowledgeMessageBatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.notification.services.v2.NotificationServiceProto.AcknowledgeMessageBatchRequest,
              com.aruna.api.notification.services.v2.NotificationServiceProto.AcknowledgeMessageBatchResponse>(
                service, METHODID_ACKNOWLEDGE_MESSAGE_BATCH)))
        .addMethod(
          getDeleteEventStreamingGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.notification.services.v2.NotificationServiceProto.DeleteEventStreamingGroupRequest,
              com.aruna.api.notification.services.v2.NotificationServiceProto.DeleteEventStreamingGroupResponse>(
                service, METHODID_DELETE_EVENT_STREAMING_GROUP)))
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
    private final String methodName;

    EventNotificationServiceMethodDescriptorSupplier(String methodName) {
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
              .addMethod(getGetEventMessageBatchStreamMethod())
              .addMethod(getAcknowledgeMessageBatchMethod())
              .addMethod(getDeleteEventStreamingGroupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
