package com.aruna.api.storage.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * LicenseService
 * Status: BETA
 * Contains all methods to add, get or list (custom) licenses
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: aruna/api/storage/services/v2/license_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LicenseServiceGrpc {

  private LicenseServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "aruna.api.storage.services.v2.LicenseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateLicenseRequest,
      com.aruna.api.storage.services.v2.CreateLicenseResponse> getCreateLicenseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateLicense",
      requestType = com.aruna.api.storage.services.v2.CreateLicenseRequest.class,
      responseType = com.aruna.api.storage.services.v2.CreateLicenseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateLicenseRequest,
      com.aruna.api.storage.services.v2.CreateLicenseResponse> getCreateLicenseMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateLicenseRequest, com.aruna.api.storage.services.v2.CreateLicenseResponse> getCreateLicenseMethod;
    if ((getCreateLicenseMethod = LicenseServiceGrpc.getCreateLicenseMethod) == null) {
      synchronized (LicenseServiceGrpc.class) {
        if ((getCreateLicenseMethod = LicenseServiceGrpc.getCreateLicenseMethod) == null) {
          LicenseServiceGrpc.getCreateLicenseMethod = getCreateLicenseMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.CreateLicenseRequest, com.aruna.api.storage.services.v2.CreateLicenseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateLicense"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateLicenseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateLicenseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LicenseServiceMethodDescriptorSupplier("CreateLicense"))
              .build();
        }
      }
    }
    return getCreateLicenseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetLicenseRequest,
      com.aruna.api.storage.services.v2.GetLicenseResponse> getGetLicenseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLicense",
      requestType = com.aruna.api.storage.services.v2.GetLicenseRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetLicenseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetLicenseRequest,
      com.aruna.api.storage.services.v2.GetLicenseResponse> getGetLicenseMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetLicenseRequest, com.aruna.api.storage.services.v2.GetLicenseResponse> getGetLicenseMethod;
    if ((getGetLicenseMethod = LicenseServiceGrpc.getGetLicenseMethod) == null) {
      synchronized (LicenseServiceGrpc.class) {
        if ((getGetLicenseMethod = LicenseServiceGrpc.getGetLicenseMethod) == null) {
          LicenseServiceGrpc.getGetLicenseMethod = getGetLicenseMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetLicenseRequest, com.aruna.api.storage.services.v2.GetLicenseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLicense"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetLicenseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetLicenseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LicenseServiceMethodDescriptorSupplier("GetLicense"))
              .build();
        }
      }
    }
    return getGetLicenseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ListLicensesRequest,
      com.aruna.api.storage.services.v2.ListLicensesResponse> getListLicensesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLicenses",
      requestType = com.aruna.api.storage.services.v2.ListLicensesRequest.class,
      responseType = com.aruna.api.storage.services.v2.ListLicensesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ListLicensesRequest,
      com.aruna.api.storage.services.v2.ListLicensesResponse> getListLicensesMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ListLicensesRequest, com.aruna.api.storage.services.v2.ListLicensesResponse> getListLicensesMethod;
    if ((getListLicensesMethod = LicenseServiceGrpc.getListLicensesMethod) == null) {
      synchronized (LicenseServiceGrpc.class) {
        if ((getListLicensesMethod = LicenseServiceGrpc.getListLicensesMethod) == null) {
          LicenseServiceGrpc.getListLicensesMethod = getListLicensesMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ListLicensesRequest, com.aruna.api.storage.services.v2.ListLicensesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLicenses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ListLicensesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ListLicensesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LicenseServiceMethodDescriptorSupplier("ListLicenses"))
              .build();
        }
      }
    }
    return getListLicensesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LicenseServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LicenseServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LicenseServiceStub>() {
        @java.lang.Override
        public LicenseServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LicenseServiceStub(channel, callOptions);
        }
      };
    return LicenseServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LicenseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LicenseServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LicenseServiceBlockingStub>() {
        @java.lang.Override
        public LicenseServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LicenseServiceBlockingStub(channel, callOptions);
        }
      };
    return LicenseServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LicenseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LicenseServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LicenseServiceFutureStub>() {
        @java.lang.Override
        public LicenseServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LicenseServiceFutureStub(channel, callOptions);
        }
      };
    return LicenseServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * LicenseService
   * Status: BETA
   * Contains all methods to add, get or list (custom) licenses
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateLicense
     * Status: BETA
     * This creates a new license
     * </pre>
     */
    default void createLicense(com.aruna.api.storage.services.v2.CreateLicenseRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateLicenseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateLicenseMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetLicense
     * Status: BETA
     * This returns the license for a given tag
     * </pre>
     */
    default void getLicense(com.aruna.api.storage.services.v2.GetLicenseRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetLicenseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLicenseMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListLicenses
     * Status: BETA
     * This returns a list of all licenses
     * </pre>
     */
    default void listLicenses(com.aruna.api.storage.services.v2.ListLicensesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ListLicensesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLicensesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LicenseService.
   * <pre>
   * LicenseService
   * Status: BETA
   * Contains all methods to add, get or list (custom) licenses
   * </pre>
   */
  public static abstract class LicenseServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LicenseServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LicenseService.
   * <pre>
   * LicenseService
   * Status: BETA
   * Contains all methods to add, get or list (custom) licenses
   * </pre>
   */
  public static final class LicenseServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LicenseServiceStub> {
    private LicenseServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LicenseServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LicenseServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateLicense
     * Status: BETA
     * This creates a new license
     * </pre>
     */
    public void createLicense(com.aruna.api.storage.services.v2.CreateLicenseRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateLicenseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateLicenseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetLicense
     * Status: BETA
     * This returns the license for a given tag
     * </pre>
     */
    public void getLicense(com.aruna.api.storage.services.v2.GetLicenseRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetLicenseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLicenseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListLicenses
     * Status: BETA
     * This returns a list of all licenses
     * </pre>
     */
    public void listLicenses(com.aruna.api.storage.services.v2.ListLicensesRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ListLicensesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLicensesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LicenseService.
   * <pre>
   * LicenseService
   * Status: BETA
   * Contains all methods to add, get or list (custom) licenses
   * </pre>
   */
  public static final class LicenseServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LicenseServiceBlockingStub> {
    private LicenseServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LicenseServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LicenseServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateLicense
     * Status: BETA
     * This creates a new license
     * </pre>
     */
    public com.aruna.api.storage.services.v2.CreateLicenseResponse createLicense(com.aruna.api.storage.services.v2.CreateLicenseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateLicenseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetLicense
     * Status: BETA
     * This returns the license for a given tag
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetLicenseResponse getLicense(com.aruna.api.storage.services.v2.GetLicenseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLicenseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListLicenses
     * Status: BETA
     * This returns a list of all licenses
     * </pre>
     */
    public com.aruna.api.storage.services.v2.ListLicensesResponse listLicenses(com.aruna.api.storage.services.v2.ListLicensesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLicensesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LicenseService.
   * <pre>
   * LicenseService
   * Status: BETA
   * Contains all methods to add, get or list (custom) licenses
   * </pre>
   */
  public static final class LicenseServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LicenseServiceFutureStub> {
    private LicenseServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LicenseServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LicenseServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateLicense
     * Status: BETA
     * This creates a new license
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.CreateLicenseResponse> createLicense(
        com.aruna.api.storage.services.v2.CreateLicenseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateLicenseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetLicense
     * Status: BETA
     * This returns the license for a given tag
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetLicenseResponse> getLicense(
        com.aruna.api.storage.services.v2.GetLicenseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLicenseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListLicenses
     * Status: BETA
     * This returns a list of all licenses
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ListLicensesResponse> listLicenses(
        com.aruna.api.storage.services.v2.ListLicensesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLicensesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_LICENSE = 0;
  private static final int METHODID_GET_LICENSE = 1;
  private static final int METHODID_LIST_LICENSES = 2;

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
        case METHODID_CREATE_LICENSE:
          serviceImpl.createLicense((com.aruna.api.storage.services.v2.CreateLicenseRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateLicenseResponse>) responseObserver);
          break;
        case METHODID_GET_LICENSE:
          serviceImpl.getLicense((com.aruna.api.storage.services.v2.GetLicenseRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetLicenseResponse>) responseObserver);
          break;
        case METHODID_LIST_LICENSES:
          serviceImpl.listLicenses((com.aruna.api.storage.services.v2.ListLicensesRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ListLicensesResponse>) responseObserver);
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
          getCreateLicenseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.CreateLicenseRequest,
              com.aruna.api.storage.services.v2.CreateLicenseResponse>(
                service, METHODID_CREATE_LICENSE)))
        .addMethod(
          getGetLicenseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetLicenseRequest,
              com.aruna.api.storage.services.v2.GetLicenseResponse>(
                service, METHODID_GET_LICENSE)))
        .addMethod(
          getListLicensesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ListLicensesRequest,
              com.aruna.api.storage.services.v2.ListLicensesResponse>(
                service, METHODID_LIST_LICENSES)))
        .build();
  }

  private static abstract class LicenseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LicenseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.storage.services.v2.LicenseServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LicenseService");
    }
  }

  private static final class LicenseServiceFileDescriptorSupplier
      extends LicenseServiceBaseDescriptorSupplier {
    LicenseServiceFileDescriptorSupplier() {}
  }

  private static final class LicenseServiceMethodDescriptorSupplier
      extends LicenseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LicenseServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LicenseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LicenseServiceFileDescriptorSupplier())
              .addMethod(getCreateLicenseMethod())
              .addMethod(getGetLicenseMethod())
              .addMethod(getListLicensesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
