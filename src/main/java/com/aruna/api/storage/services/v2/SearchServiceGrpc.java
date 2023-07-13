package com.aruna.api.storage.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/storage/services/v2/search_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SearchServiceGrpc {

  private SearchServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.storage.services.v2.SearchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.SearchServiceProto.SearchResourcesRequest,
      com.aruna.api.storage.services.v2.SearchServiceProto.SearchResourcesResponse> getSearchResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchResources",
      requestType = com.aruna.api.storage.services.v2.SearchServiceProto.SearchResourcesRequest.class,
      responseType = com.aruna.api.storage.services.v2.SearchServiceProto.SearchResourcesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.SearchServiceProto.SearchResourcesRequest,
      com.aruna.api.storage.services.v2.SearchServiceProto.SearchResourcesResponse> getSearchResourcesMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.SearchServiceProto.SearchResourcesRequest, com.aruna.api.storage.services.v2.SearchServiceProto.SearchResourcesResponse> getSearchResourcesMethod;
    if ((getSearchResourcesMethod = SearchServiceGrpc.getSearchResourcesMethod) == null) {
      synchronized (SearchServiceGrpc.class) {
        if ((getSearchResourcesMethod = SearchServiceGrpc.getSearchResourcesMethod) == null) {
          SearchServiceGrpc.getSearchResourcesMethod = getSearchResourcesMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.SearchServiceProto.SearchResourcesRequest, com.aruna.api.storage.services.v2.SearchServiceProto.SearchResourcesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.SearchServiceProto.SearchResourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.SearchServiceProto.SearchResourcesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SearchServiceMethodDescriptorSupplier("SearchResources"))
              .build();
        }
      }
    }
    return getSearchResourcesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SearchServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchServiceStub>() {
        @java.lang.Override
        public SearchServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchServiceStub(channel, callOptions);
        }
      };
    return SearchServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SearchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchServiceBlockingStub>() {
        @java.lang.Override
        public SearchServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchServiceBlockingStub(channel, callOptions);
        }
      };
    return SearchServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SearchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchServiceFutureStub>() {
        @java.lang.Override
        public SearchServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchServiceFutureStub(channel, callOptions);
        }
      };
    return SearchServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * SearchResources
     * Status: BETA
     * 
     * Searches the index for applicable resources (only public + private can be searched)
     * </pre>
     */
    default void searchResources(com.aruna.api.storage.services.v2.SearchServiceProto.SearchResourcesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.SearchServiceProto.SearchResourcesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchResourcesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SearchService.
   */
  public static abstract class SearchServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SearchServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SearchService.
   */
  public static final class SearchServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SearchServiceStub> {
    private SearchServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * SearchResources
     * Status: BETA
     * 
     * Searches the index for applicable resources (only public + private can be searched)
     * </pre>
     */
    public void searchResources(com.aruna.api.storage.services.v2.SearchServiceProto.SearchResourcesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.SearchServiceProto.SearchResourcesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchResourcesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SearchService.
   */
  public static final class SearchServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SearchServiceBlockingStub> {
    private SearchServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * SearchResources
     * Status: BETA
     * 
     * Searches the index for applicable resources (only public + private can be searched)
     * </pre>
     */
    public com.aruna.api.storage.services.v2.SearchServiceProto.SearchResourcesResponse searchResources(com.aruna.api.storage.services.v2.SearchServiceProto.SearchResourcesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchResourcesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SearchService.
   */
  public static final class SearchServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SearchServiceFutureStub> {
    private SearchServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * SearchResources
     * Status: BETA
     * 
     * Searches the index for applicable resources (only public + private can be searched)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.SearchServiceProto.SearchResourcesResponse> searchResources(
        com.aruna.api.storage.services.v2.SearchServiceProto.SearchResourcesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchResourcesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_RESOURCES = 0;

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
        case METHODID_SEARCH_RESOURCES:
          serviceImpl.searchResources((com.aruna.api.storage.services.v2.SearchServiceProto.SearchResourcesRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.SearchServiceProto.SearchResourcesResponse>) responseObserver);
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
          getSearchResourcesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.SearchServiceProto.SearchResourcesRequest,
              com.aruna.api.storage.services.v2.SearchServiceProto.SearchResourcesResponse>(
                service, METHODID_SEARCH_RESOURCES)))
        .build();
  }

  private static abstract class SearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SearchServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.storage.services.v2.SearchServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SearchService");
    }
  }

  private static final class SearchServiceFileDescriptorSupplier
      extends SearchServiceBaseDescriptorSupplier {
    SearchServiceFileDescriptorSupplier() {}
  }

  private static final class SearchServiceMethodDescriptorSupplier
      extends SearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SearchServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SearchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SearchServiceFileDescriptorSupplier())
              .addMethod(getSearchResourcesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
