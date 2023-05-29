package com.aruna.api.storage.services.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ResourceInfoService
 * This is a generic service that contains utility functions 
 * these functions are used to query additional meta-information
 * about resources
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/storage/services/v1/info_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ResourceInfoServiceGrpc {

  private ResourceInfoServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.storage.services.v1.ResourceInfoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.InfoServiceProto.GetResourceHierarchyRequest,
      com.aruna.api.storage.services.v1.InfoServiceProto.GetResourceHierarchyResponse> getGetResourceHierarchyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetResourceHierarchy",
      requestType = com.aruna.api.storage.services.v1.InfoServiceProto.GetResourceHierarchyRequest.class,
      responseType = com.aruna.api.storage.services.v1.InfoServiceProto.GetResourceHierarchyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.InfoServiceProto.GetResourceHierarchyRequest,
      com.aruna.api.storage.services.v1.InfoServiceProto.GetResourceHierarchyResponse> getGetResourceHierarchyMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.InfoServiceProto.GetResourceHierarchyRequest, com.aruna.api.storage.services.v1.InfoServiceProto.GetResourceHierarchyResponse> getGetResourceHierarchyMethod;
    if ((getGetResourceHierarchyMethod = ResourceInfoServiceGrpc.getGetResourceHierarchyMethod) == null) {
      synchronized (ResourceInfoServiceGrpc.class) {
        if ((getGetResourceHierarchyMethod = ResourceInfoServiceGrpc.getGetResourceHierarchyMethod) == null) {
          ResourceInfoServiceGrpc.getGetResourceHierarchyMethod = getGetResourceHierarchyMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.InfoServiceProto.GetResourceHierarchyRequest, com.aruna.api.storage.services.v1.InfoServiceProto.GetResourceHierarchyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetResourceHierarchy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.InfoServiceProto.GetResourceHierarchyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.InfoServiceProto.GetResourceHierarchyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceInfoServiceMethodDescriptorSupplier("GetResourceHierarchy"))
              .build();
        }
      }
    }
    return getGetResourceHierarchyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResourceInfoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceInfoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceInfoServiceStub>() {
        @java.lang.Override
        public ResourceInfoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceInfoServiceStub(channel, callOptions);
        }
      };
    return ResourceInfoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResourceInfoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceInfoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceInfoServiceBlockingStub>() {
        @java.lang.Override
        public ResourceInfoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceInfoServiceBlockingStub(channel, callOptions);
        }
      };
    return ResourceInfoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResourceInfoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceInfoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceInfoServiceFutureStub>() {
        @java.lang.Override
        public ResourceInfoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceInfoServiceFutureStub(channel, callOptions);
        }
      };
    return ResourceInfoServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ResourceInfoService
   * This is a generic service that contains utility functions 
   * these functions are used to query additional meta-information
   * about resources
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * GetResourceHierarchy
     * This requests a hierarchy based on one resource (object / objectgroup or collection)
     * and returns a hierarchy with all associated higherlevel objects up to projects.
     * Needs projects level read access.
     * </pre>
     */
    default void getResourceHierarchy(com.aruna.api.storage.services.v1.InfoServiceProto.GetResourceHierarchyRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.InfoServiceProto.GetResourceHierarchyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetResourceHierarchyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ResourceInfoService.
   * <pre>
   * ResourceInfoService
   * This is a generic service that contains utility functions 
   * these functions are used to query additional meta-information
   * about resources
   * </pre>
   */
  public static abstract class ResourceInfoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ResourceInfoServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ResourceInfoService.
   * <pre>
   * ResourceInfoService
   * This is a generic service that contains utility functions 
   * these functions are used to query additional meta-information
   * about resources
   * </pre>
   */
  public static final class ResourceInfoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ResourceInfoServiceStub> {
    private ResourceInfoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceInfoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceInfoServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetResourceHierarchy
     * This requests a hierarchy based on one resource (object / objectgroup or collection)
     * and returns a hierarchy with all associated higherlevel objects up to projects.
     * Needs projects level read access.
     * </pre>
     */
    public void getResourceHierarchy(com.aruna.api.storage.services.v1.InfoServiceProto.GetResourceHierarchyRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.InfoServiceProto.GetResourceHierarchyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetResourceHierarchyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ResourceInfoService.
   * <pre>
   * ResourceInfoService
   * This is a generic service that contains utility functions 
   * these functions are used to query additional meta-information
   * about resources
   * </pre>
   */
  public static final class ResourceInfoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ResourceInfoServiceBlockingStub> {
    private ResourceInfoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceInfoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceInfoServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetResourceHierarchy
     * This requests a hierarchy based on one resource (object / objectgroup or collection)
     * and returns a hierarchy with all associated higherlevel objects up to projects.
     * Needs projects level read access.
     * </pre>
     */
    public com.aruna.api.storage.services.v1.InfoServiceProto.GetResourceHierarchyResponse getResourceHierarchy(com.aruna.api.storage.services.v1.InfoServiceProto.GetResourceHierarchyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetResourceHierarchyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ResourceInfoService.
   * <pre>
   * ResourceInfoService
   * This is a generic service that contains utility functions 
   * these functions are used to query additional meta-information
   * about resources
   * </pre>
   */
  public static final class ResourceInfoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ResourceInfoServiceFutureStub> {
    private ResourceInfoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceInfoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceInfoServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetResourceHierarchy
     * This requests a hierarchy based on one resource (object / objectgroup or collection)
     * and returns a hierarchy with all associated higherlevel objects up to projects.
     * Needs projects level read access.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.InfoServiceProto.GetResourceHierarchyResponse> getResourceHierarchy(
        com.aruna.api.storage.services.v1.InfoServiceProto.GetResourceHierarchyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetResourceHierarchyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_RESOURCE_HIERARCHY = 0;

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
        case METHODID_GET_RESOURCE_HIERARCHY:
          serviceImpl.getResourceHierarchy((com.aruna.api.storage.services.v1.InfoServiceProto.GetResourceHierarchyRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.InfoServiceProto.GetResourceHierarchyResponse>) responseObserver);
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
          getGetResourceHierarchyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.InfoServiceProto.GetResourceHierarchyRequest,
              com.aruna.api.storage.services.v1.InfoServiceProto.GetResourceHierarchyResponse>(
                service, METHODID_GET_RESOURCE_HIERARCHY)))
        .build();
  }

  private static abstract class ResourceInfoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResourceInfoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.storage.services.v1.InfoServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ResourceInfoService");
    }
  }

  private static final class ResourceInfoServiceFileDescriptorSupplier
      extends ResourceInfoServiceBaseDescriptorSupplier {
    ResourceInfoServiceFileDescriptorSupplier() {}
  }

  private static final class ResourceInfoServiceMethodDescriptorSupplier
      extends ResourceInfoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ResourceInfoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ResourceInfoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResourceInfoServiceFileDescriptorSupplier())
              .addMethod(getGetResourceHierarchyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
