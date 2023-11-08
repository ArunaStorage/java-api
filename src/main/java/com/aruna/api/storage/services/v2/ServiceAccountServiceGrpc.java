package com.aruna.api.storage.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ServiceAccountService
 * Service that contains all methods for service_accounts, these are Accounts that are
 * project specific (or global) and can be used for automation. 
 * Service account users will always contain (bot) behind their name
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: aruna/api/storage/services/v2/service_account_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServiceAccountServiceGrpc {

  private ServiceAccountServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "aruna.api.storage.services.v2.ServiceAccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateServiceAccountRequest,
      com.aruna.api.storage.services.v2.CreateServiceAccountResponse> getCreateServiceAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateServiceAccount",
      requestType = com.aruna.api.storage.services.v2.CreateServiceAccountRequest.class,
      responseType = com.aruna.api.storage.services.v2.CreateServiceAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateServiceAccountRequest,
      com.aruna.api.storage.services.v2.CreateServiceAccountResponse> getCreateServiceAccountMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateServiceAccountRequest, com.aruna.api.storage.services.v2.CreateServiceAccountResponse> getCreateServiceAccountMethod;
    if ((getCreateServiceAccountMethod = ServiceAccountServiceGrpc.getCreateServiceAccountMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getCreateServiceAccountMethod = ServiceAccountServiceGrpc.getCreateServiceAccountMethod) == null) {
          ServiceAccountServiceGrpc.getCreateServiceAccountMethod = getCreateServiceAccountMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.CreateServiceAccountRequest, com.aruna.api.storage.services.v2.CreateServiceAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateServiceAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateServiceAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateServiceAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("CreateServiceAccount"))
              .build();
        }
      }
    }
    return getCreateServiceAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateServiceAccountTokenRequest,
      com.aruna.api.storage.services.v2.CreateServiceAccountTokenResponse> getCreateServiceAccountTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateServiceAccountToken",
      requestType = com.aruna.api.storage.services.v2.CreateServiceAccountTokenRequest.class,
      responseType = com.aruna.api.storage.services.v2.CreateServiceAccountTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateServiceAccountTokenRequest,
      com.aruna.api.storage.services.v2.CreateServiceAccountTokenResponse> getCreateServiceAccountTokenMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateServiceAccountTokenRequest, com.aruna.api.storage.services.v2.CreateServiceAccountTokenResponse> getCreateServiceAccountTokenMethod;
    if ((getCreateServiceAccountTokenMethod = ServiceAccountServiceGrpc.getCreateServiceAccountTokenMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getCreateServiceAccountTokenMethod = ServiceAccountServiceGrpc.getCreateServiceAccountTokenMethod) == null) {
          ServiceAccountServiceGrpc.getCreateServiceAccountTokenMethod = getCreateServiceAccountTokenMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.CreateServiceAccountTokenRequest, com.aruna.api.storage.services.v2.CreateServiceAccountTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateServiceAccountToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateServiceAccountTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateServiceAccountTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("CreateServiceAccountToken"))
              .build();
        }
      }
    }
    return getCreateServiceAccountTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.SetServiceAccountPermissionRequest,
      com.aruna.api.storage.services.v2.SetServiceAccountPermissionResponse> getSetServiceAccountPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetServiceAccountPermission",
      requestType = com.aruna.api.storage.services.v2.SetServiceAccountPermissionRequest.class,
      responseType = com.aruna.api.storage.services.v2.SetServiceAccountPermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.SetServiceAccountPermissionRequest,
      com.aruna.api.storage.services.v2.SetServiceAccountPermissionResponse> getSetServiceAccountPermissionMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.SetServiceAccountPermissionRequest, com.aruna.api.storage.services.v2.SetServiceAccountPermissionResponse> getSetServiceAccountPermissionMethod;
    if ((getSetServiceAccountPermissionMethod = ServiceAccountServiceGrpc.getSetServiceAccountPermissionMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getSetServiceAccountPermissionMethod = ServiceAccountServiceGrpc.getSetServiceAccountPermissionMethod) == null) {
          ServiceAccountServiceGrpc.getSetServiceAccountPermissionMethod = getSetServiceAccountPermissionMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.SetServiceAccountPermissionRequest, com.aruna.api.storage.services.v2.SetServiceAccountPermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetServiceAccountPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.SetServiceAccountPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.SetServiceAccountPermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("SetServiceAccountPermission"))
              .build();
        }
      }
    }
    return getSetServiceAccountPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetServiceAccountTokenRequest,
      com.aruna.api.storage.services.v2.GetServiceAccountTokenResponse> getGetServiceAccountTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServiceAccountToken",
      requestType = com.aruna.api.storage.services.v2.GetServiceAccountTokenRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetServiceAccountTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetServiceAccountTokenRequest,
      com.aruna.api.storage.services.v2.GetServiceAccountTokenResponse> getGetServiceAccountTokenMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetServiceAccountTokenRequest, com.aruna.api.storage.services.v2.GetServiceAccountTokenResponse> getGetServiceAccountTokenMethod;
    if ((getGetServiceAccountTokenMethod = ServiceAccountServiceGrpc.getGetServiceAccountTokenMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getGetServiceAccountTokenMethod = ServiceAccountServiceGrpc.getGetServiceAccountTokenMethod) == null) {
          ServiceAccountServiceGrpc.getGetServiceAccountTokenMethod = getGetServiceAccountTokenMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetServiceAccountTokenRequest, com.aruna.api.storage.services.v2.GetServiceAccountTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceAccountToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetServiceAccountTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetServiceAccountTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("GetServiceAccountToken"))
              .build();
        }
      }
    }
    return getGetServiceAccountTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetServiceAccountTokensRequest,
      com.aruna.api.storage.services.v2.GetServiceAccountTokensResponse> getGetServiceAccountTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServiceAccountTokens",
      requestType = com.aruna.api.storage.services.v2.GetServiceAccountTokensRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetServiceAccountTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetServiceAccountTokensRequest,
      com.aruna.api.storage.services.v2.GetServiceAccountTokensResponse> getGetServiceAccountTokensMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetServiceAccountTokensRequest, com.aruna.api.storage.services.v2.GetServiceAccountTokensResponse> getGetServiceAccountTokensMethod;
    if ((getGetServiceAccountTokensMethod = ServiceAccountServiceGrpc.getGetServiceAccountTokensMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getGetServiceAccountTokensMethod = ServiceAccountServiceGrpc.getGetServiceAccountTokensMethod) == null) {
          ServiceAccountServiceGrpc.getGetServiceAccountTokensMethod = getGetServiceAccountTokensMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetServiceAccountTokensRequest, com.aruna.api.storage.services.v2.GetServiceAccountTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceAccountTokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetServiceAccountTokensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetServiceAccountTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("GetServiceAccountTokens"))
              .build();
        }
      }
    }
    return getGetServiceAccountTokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteServiceAccountTokenRequest,
      com.aruna.api.storage.services.v2.DeleteServiceAccountTokenResponse> getDeleteServiceAccountTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteServiceAccountToken",
      requestType = com.aruna.api.storage.services.v2.DeleteServiceAccountTokenRequest.class,
      responseType = com.aruna.api.storage.services.v2.DeleteServiceAccountTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteServiceAccountTokenRequest,
      com.aruna.api.storage.services.v2.DeleteServiceAccountTokenResponse> getDeleteServiceAccountTokenMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteServiceAccountTokenRequest, com.aruna.api.storage.services.v2.DeleteServiceAccountTokenResponse> getDeleteServiceAccountTokenMethod;
    if ((getDeleteServiceAccountTokenMethod = ServiceAccountServiceGrpc.getDeleteServiceAccountTokenMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getDeleteServiceAccountTokenMethod = ServiceAccountServiceGrpc.getDeleteServiceAccountTokenMethod) == null) {
          ServiceAccountServiceGrpc.getDeleteServiceAccountTokenMethod = getDeleteServiceAccountTokenMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DeleteServiceAccountTokenRequest, com.aruna.api.storage.services.v2.DeleteServiceAccountTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteServiceAccountToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteServiceAccountTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteServiceAccountTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("DeleteServiceAccountToken"))
              .build();
        }
      }
    }
    return getDeleteServiceAccountTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteServiceAccountTokensRequest,
      com.aruna.api.storage.services.v2.DeleteServiceAccountTokensResponse> getDeleteServiceAccountTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteServiceAccountTokens",
      requestType = com.aruna.api.storage.services.v2.DeleteServiceAccountTokensRequest.class,
      responseType = com.aruna.api.storage.services.v2.DeleteServiceAccountTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteServiceAccountTokensRequest,
      com.aruna.api.storage.services.v2.DeleteServiceAccountTokensResponse> getDeleteServiceAccountTokensMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteServiceAccountTokensRequest, com.aruna.api.storage.services.v2.DeleteServiceAccountTokensResponse> getDeleteServiceAccountTokensMethod;
    if ((getDeleteServiceAccountTokensMethod = ServiceAccountServiceGrpc.getDeleteServiceAccountTokensMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getDeleteServiceAccountTokensMethod = ServiceAccountServiceGrpc.getDeleteServiceAccountTokensMethod) == null) {
          ServiceAccountServiceGrpc.getDeleteServiceAccountTokensMethod = getDeleteServiceAccountTokensMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DeleteServiceAccountTokensRequest, com.aruna.api.storage.services.v2.DeleteServiceAccountTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteServiceAccountTokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteServiceAccountTokensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteServiceAccountTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("DeleteServiceAccountTokens"))
              .build();
        }
      }
    }
    return getDeleteServiceAccountTokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteServiceAccountRequest,
      com.aruna.api.storage.services.v2.DeleteServiceAccountResponse> getDeleteServiceAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteServiceAccount",
      requestType = com.aruna.api.storage.services.v2.DeleteServiceAccountRequest.class,
      responseType = com.aruna.api.storage.services.v2.DeleteServiceAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteServiceAccountRequest,
      com.aruna.api.storage.services.v2.DeleteServiceAccountResponse> getDeleteServiceAccountMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteServiceAccountRequest, com.aruna.api.storage.services.v2.DeleteServiceAccountResponse> getDeleteServiceAccountMethod;
    if ((getDeleteServiceAccountMethod = ServiceAccountServiceGrpc.getDeleteServiceAccountMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getDeleteServiceAccountMethod = ServiceAccountServiceGrpc.getDeleteServiceAccountMethod) == null) {
          ServiceAccountServiceGrpc.getDeleteServiceAccountMethod = getDeleteServiceAccountMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DeleteServiceAccountRequest, com.aruna.api.storage.services.v2.DeleteServiceAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteServiceAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteServiceAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteServiceAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("DeleteServiceAccount"))
              .build();
        }
      }
    }
    return getDeleteServiceAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountRequest,
      com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse> getGetS3CredentialsSvcAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetS3CredentialsSvcAccount",
      requestType = com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountRequest,
      com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse> getGetS3CredentialsSvcAccountMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountRequest, com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse> getGetS3CredentialsSvcAccountMethod;
    if ((getGetS3CredentialsSvcAccountMethod = ServiceAccountServiceGrpc.getGetS3CredentialsSvcAccountMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getGetS3CredentialsSvcAccountMethod = ServiceAccountServiceGrpc.getGetS3CredentialsSvcAccountMethod) == null) {
          ServiceAccountServiceGrpc.getGetS3CredentialsSvcAccountMethod = getGetS3CredentialsSvcAccountMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountRequest, com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetS3CredentialsSvcAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("GetS3CredentialsSvcAccount"))
              .build();
        }
      }
    }
    return getGetS3CredentialsSvcAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountRequest,
      com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountResponse> getCreateDataproxyTokenSvcAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDataproxyTokenSvcAccount",
      requestType = com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountRequest.class,
      responseType = com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountRequest,
      com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountResponse> getCreateDataproxyTokenSvcAccountMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountRequest, com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountResponse> getCreateDataproxyTokenSvcAccountMethod;
    if ((getCreateDataproxyTokenSvcAccountMethod = ServiceAccountServiceGrpc.getCreateDataproxyTokenSvcAccountMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getCreateDataproxyTokenSvcAccountMethod = ServiceAccountServiceGrpc.getCreateDataproxyTokenSvcAccountMethod) == null) {
          ServiceAccountServiceGrpc.getCreateDataproxyTokenSvcAccountMethod = getCreateDataproxyTokenSvcAccountMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountRequest, com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDataproxyTokenSvcAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("CreateDataproxyTokenSvcAccount"))
              .build();
        }
      }
    }
    return getCreateDataproxyTokenSvcAccountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceAccountServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceAccountServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceAccountServiceStub>() {
        @java.lang.Override
        public ServiceAccountServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceAccountServiceStub(channel, callOptions);
        }
      };
    return ServiceAccountServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceAccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceAccountServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceAccountServiceBlockingStub>() {
        @java.lang.Override
        public ServiceAccountServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceAccountServiceBlockingStub(channel, callOptions);
        }
      };
    return ServiceAccountServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceAccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceAccountServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceAccountServiceFutureStub>() {
        @java.lang.Override
        public ServiceAccountServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceAccountServiceFutureStub(channel, callOptions);
        }
      };
    return ServiceAccountServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ServiceAccountService
   * Service that contains all methods for service_accounts, these are Accounts that are
   * project specific (or global) and can be used for automation. 
   * Service account users will always contain (bot) behind their name
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateServiceAccount
     * Status: BETA
     * 
     * Creates a service account for a given project
     * If the service account has permissions for the global Admin project
     * it will be a global service account that can interact with any resource
     * </pre>
     */
    default void createServiceAccount(com.aruna.api.storage.services.v2.CreateServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateServiceAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateServiceAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateServiceAccountToken
     * Status: BETA
     * Creates a token for a service account
     * Each service account can only have one permission -&gt; The token will have the same permission as the
     * service account
     * </pre>
     */
    default void createServiceAccountToken(com.aruna.api.storage.services.v2.CreateServiceAccountTokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateServiceAccountTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateServiceAccountTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetServiceAccountPermission
     * Status: BETA
     * Overwrites the project specific permissions for a service account
     * </pre>
     */
    default void setServiceAccountPermission(com.aruna.api.storage.services.v2.SetServiceAccountPermissionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.SetServiceAccountPermissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetServiceAccountPermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetServiceAccountToken
     * Status: BETA
     * This requests the overall information about a specifc service account token (by id)
     * it will not contain the token itself.
     * </pre>
     */
    default void getServiceAccountToken(com.aruna.api.storage.services.v2.GetServiceAccountTokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetServiceAccountTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetServiceAccountTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetServiceAccountTokens
     * Status: BETA
     * This requests the overall information about all service account tokens
     * it will not contain the token itself.
     * </pre>
     */
    default void getServiceAccountTokens(com.aruna.api.storage.services.v2.GetServiceAccountTokensRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetServiceAccountTokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetServiceAccountTokensMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteServiceAccountToken
     * Status: BETA
     * Deletes one service account token by ID
     * </pre>
     */
    default void deleteServiceAccountToken(com.aruna.api.storage.services.v2.DeleteServiceAccountTokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteServiceAccountTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteServiceAccountTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteServiceAccountTokens
     * Status: BETA
     * Deletes all service account tokens
     * </pre>
     */
    default void deleteServiceAccountTokens(com.aruna.api.storage.services.v2.DeleteServiceAccountTokensRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteServiceAccountTokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteServiceAccountTokensMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteServiceAccount
     * Status: BETA
     * Deletes a service account (by id)
     * </pre>
     */
    default void deleteServiceAccount(com.aruna.api.storage.services.v2.DeleteServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteServiceAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteServiceAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetS3Credentials
     * Status: ALPHA
     * Gets s3 credentials for a specific user and data_proxy
     * </pre>
     */
    default void getS3CredentialsSvcAccount(com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetS3CredentialsSvcAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDataproxyToken
     * Status: ALPHA
     * Gets token for a specific user and data_proxy
     * </pre>
     */
    default void createDataproxyTokenSvcAccount(com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDataproxyTokenSvcAccountMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ServiceAccountService.
   * <pre>
   * ServiceAccountService
   * Service that contains all methods for service_accounts, these are Accounts that are
   * project specific (or global) and can be used for automation. 
   * Service account users will always contain (bot) behind their name
   * </pre>
   */
  public static abstract class ServiceAccountServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ServiceAccountServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ServiceAccountService.
   * <pre>
   * ServiceAccountService
   * Service that contains all methods for service_accounts, these are Accounts that are
   * project specific (or global) and can be used for automation. 
   * Service account users will always contain (bot) behind their name
   * </pre>
   */
  public static final class ServiceAccountServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ServiceAccountServiceStub> {
    private ServiceAccountServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceAccountServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceAccountServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateServiceAccount
     * Status: BETA
     * 
     * Creates a service account for a given project
     * If the service account has permissions for the global Admin project
     * it will be a global service account that can interact with any resource
     * </pre>
     */
    public void createServiceAccount(com.aruna.api.storage.services.v2.CreateServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateServiceAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateServiceAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateServiceAccountToken
     * Status: BETA
     * Creates a token for a service account
     * Each service account can only have one permission -&gt; The token will have the same permission as the
     * service account
     * </pre>
     */
    public void createServiceAccountToken(com.aruna.api.storage.services.v2.CreateServiceAccountTokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateServiceAccountTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateServiceAccountTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetServiceAccountPermission
     * Status: BETA
     * Overwrites the project specific permissions for a service account
     * </pre>
     */
    public void setServiceAccountPermission(com.aruna.api.storage.services.v2.SetServiceAccountPermissionRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.SetServiceAccountPermissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetServiceAccountPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetServiceAccountToken
     * Status: BETA
     * This requests the overall information about a specifc service account token (by id)
     * it will not contain the token itself.
     * </pre>
     */
    public void getServiceAccountToken(com.aruna.api.storage.services.v2.GetServiceAccountTokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetServiceAccountTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetServiceAccountTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetServiceAccountTokens
     * Status: BETA
     * This requests the overall information about all service account tokens
     * it will not contain the token itself.
     * </pre>
     */
    public void getServiceAccountTokens(com.aruna.api.storage.services.v2.GetServiceAccountTokensRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetServiceAccountTokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetServiceAccountTokensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteServiceAccountToken
     * Status: BETA
     * Deletes one service account token by ID
     * </pre>
     */
    public void deleteServiceAccountToken(com.aruna.api.storage.services.v2.DeleteServiceAccountTokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteServiceAccountTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteServiceAccountTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteServiceAccountTokens
     * Status: BETA
     * Deletes all service account tokens
     * </pre>
     */
    public void deleteServiceAccountTokens(com.aruna.api.storage.services.v2.DeleteServiceAccountTokensRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteServiceAccountTokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteServiceAccountTokensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteServiceAccount
     * Status: BETA
     * Deletes a service account (by id)
     * </pre>
     */
    public void deleteServiceAccount(com.aruna.api.storage.services.v2.DeleteServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteServiceAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteServiceAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetS3Credentials
     * Status: ALPHA
     * Gets s3 credentials for a specific user and data_proxy
     * </pre>
     */
    public void getS3CredentialsSvcAccount(com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetS3CredentialsSvcAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDataproxyToken
     * Status: ALPHA
     * Gets token for a specific user and data_proxy
     * </pre>
     */
    public void createDataproxyTokenSvcAccount(com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDataproxyTokenSvcAccountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ServiceAccountService.
   * <pre>
   * ServiceAccountService
   * Service that contains all methods for service_accounts, these are Accounts that are
   * project specific (or global) and can be used for automation. 
   * Service account users will always contain (bot) behind their name
   * </pre>
   */
  public static final class ServiceAccountServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ServiceAccountServiceBlockingStub> {
    private ServiceAccountServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceAccountServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceAccountServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateServiceAccount
     * Status: BETA
     * 
     * Creates a service account for a given project
     * If the service account has permissions for the global Admin project
     * it will be a global service account that can interact with any resource
     * </pre>
     */
    public com.aruna.api.storage.services.v2.CreateServiceAccountResponse createServiceAccount(com.aruna.api.storage.services.v2.CreateServiceAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateServiceAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateServiceAccountToken
     * Status: BETA
     * Creates a token for a service account
     * Each service account can only have one permission -&gt; The token will have the same permission as the
     * service account
     * </pre>
     */
    public com.aruna.api.storage.services.v2.CreateServiceAccountTokenResponse createServiceAccountToken(com.aruna.api.storage.services.v2.CreateServiceAccountTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateServiceAccountTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetServiceAccountPermission
     * Status: BETA
     * Overwrites the project specific permissions for a service account
     * </pre>
     */
    public com.aruna.api.storage.services.v2.SetServiceAccountPermissionResponse setServiceAccountPermission(com.aruna.api.storage.services.v2.SetServiceAccountPermissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetServiceAccountPermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetServiceAccountToken
     * Status: BETA
     * This requests the overall information about a specifc service account token (by id)
     * it will not contain the token itself.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetServiceAccountTokenResponse getServiceAccountToken(com.aruna.api.storage.services.v2.GetServiceAccountTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetServiceAccountTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetServiceAccountTokens
     * Status: BETA
     * This requests the overall information about all service account tokens
     * it will not contain the token itself.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetServiceAccountTokensResponse getServiceAccountTokens(com.aruna.api.storage.services.v2.GetServiceAccountTokensRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetServiceAccountTokensMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteServiceAccountToken
     * Status: BETA
     * Deletes one service account token by ID
     * </pre>
     */
    public com.aruna.api.storage.services.v2.DeleteServiceAccountTokenResponse deleteServiceAccountToken(com.aruna.api.storage.services.v2.DeleteServiceAccountTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteServiceAccountTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteServiceAccountTokens
     * Status: BETA
     * Deletes all service account tokens
     * </pre>
     */
    public com.aruna.api.storage.services.v2.DeleteServiceAccountTokensResponse deleteServiceAccountTokens(com.aruna.api.storage.services.v2.DeleteServiceAccountTokensRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteServiceAccountTokensMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteServiceAccount
     * Status: BETA
     * Deletes a service account (by id)
     * </pre>
     */
    public com.aruna.api.storage.services.v2.DeleteServiceAccountResponse deleteServiceAccount(com.aruna.api.storage.services.v2.DeleteServiceAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteServiceAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetS3Credentials
     * Status: ALPHA
     * Gets s3 credentials for a specific user and data_proxy
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse getS3CredentialsSvcAccount(com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetS3CredentialsSvcAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDataproxyToken
     * Status: ALPHA
     * Gets token for a specific user and data_proxy
     * </pre>
     */
    public com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountResponse createDataproxyTokenSvcAccount(com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDataproxyTokenSvcAccountMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ServiceAccountService.
   * <pre>
   * ServiceAccountService
   * Service that contains all methods for service_accounts, these are Accounts that are
   * project specific (or global) and can be used for automation. 
   * Service account users will always contain (bot) behind their name
   * </pre>
   */
  public static final class ServiceAccountServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ServiceAccountServiceFutureStub> {
    private ServiceAccountServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceAccountServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceAccountServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateServiceAccount
     * Status: BETA
     * 
     * Creates a service account for a given project
     * If the service account has permissions for the global Admin project
     * it will be a global service account that can interact with any resource
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.CreateServiceAccountResponse> createServiceAccount(
        com.aruna.api.storage.services.v2.CreateServiceAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateServiceAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateServiceAccountToken
     * Status: BETA
     * Creates a token for a service account
     * Each service account can only have one permission -&gt; The token will have the same permission as the
     * service account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.CreateServiceAccountTokenResponse> createServiceAccountToken(
        com.aruna.api.storage.services.v2.CreateServiceAccountTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateServiceAccountTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetServiceAccountPermission
     * Status: BETA
     * Overwrites the project specific permissions for a service account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.SetServiceAccountPermissionResponse> setServiceAccountPermission(
        com.aruna.api.storage.services.v2.SetServiceAccountPermissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetServiceAccountPermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetServiceAccountToken
     * Status: BETA
     * This requests the overall information about a specifc service account token (by id)
     * it will not contain the token itself.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetServiceAccountTokenResponse> getServiceAccountToken(
        com.aruna.api.storage.services.v2.GetServiceAccountTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetServiceAccountTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetServiceAccountTokens
     * Status: BETA
     * This requests the overall information about all service account tokens
     * it will not contain the token itself.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetServiceAccountTokensResponse> getServiceAccountTokens(
        com.aruna.api.storage.services.v2.GetServiceAccountTokensRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetServiceAccountTokensMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteServiceAccountToken
     * Status: BETA
     * Deletes one service account token by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DeleteServiceAccountTokenResponse> deleteServiceAccountToken(
        com.aruna.api.storage.services.v2.DeleteServiceAccountTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteServiceAccountTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteServiceAccountTokens
     * Status: BETA
     * Deletes all service account tokens
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DeleteServiceAccountTokensResponse> deleteServiceAccountTokens(
        com.aruna.api.storage.services.v2.DeleteServiceAccountTokensRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteServiceAccountTokensMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteServiceAccount
     * Status: BETA
     * Deletes a service account (by id)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DeleteServiceAccountResponse> deleteServiceAccount(
        com.aruna.api.storage.services.v2.DeleteServiceAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteServiceAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetS3Credentials
     * Status: ALPHA
     * Gets s3 credentials for a specific user and data_proxy
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse> getS3CredentialsSvcAccount(
        com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetS3CredentialsSvcAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDataproxyToken
     * Status: ALPHA
     * Gets token for a specific user and data_proxy
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountResponse> createDataproxyTokenSvcAccount(
        com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDataproxyTokenSvcAccountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SERVICE_ACCOUNT = 0;
  private static final int METHODID_CREATE_SERVICE_ACCOUNT_TOKEN = 1;
  private static final int METHODID_SET_SERVICE_ACCOUNT_PERMISSION = 2;
  private static final int METHODID_GET_SERVICE_ACCOUNT_TOKEN = 3;
  private static final int METHODID_GET_SERVICE_ACCOUNT_TOKENS = 4;
  private static final int METHODID_DELETE_SERVICE_ACCOUNT_TOKEN = 5;
  private static final int METHODID_DELETE_SERVICE_ACCOUNT_TOKENS = 6;
  private static final int METHODID_DELETE_SERVICE_ACCOUNT = 7;
  private static final int METHODID_GET_S3CREDENTIALS_SVC_ACCOUNT = 8;
  private static final int METHODID_CREATE_DATAPROXY_TOKEN_SVC_ACCOUNT = 9;

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
        case METHODID_CREATE_SERVICE_ACCOUNT:
          serviceImpl.createServiceAccount((com.aruna.api.storage.services.v2.CreateServiceAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateServiceAccountResponse>) responseObserver);
          break;
        case METHODID_CREATE_SERVICE_ACCOUNT_TOKEN:
          serviceImpl.createServiceAccountToken((com.aruna.api.storage.services.v2.CreateServiceAccountTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateServiceAccountTokenResponse>) responseObserver);
          break;
        case METHODID_SET_SERVICE_ACCOUNT_PERMISSION:
          serviceImpl.setServiceAccountPermission((com.aruna.api.storage.services.v2.SetServiceAccountPermissionRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.SetServiceAccountPermissionResponse>) responseObserver);
          break;
        case METHODID_GET_SERVICE_ACCOUNT_TOKEN:
          serviceImpl.getServiceAccountToken((com.aruna.api.storage.services.v2.GetServiceAccountTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetServiceAccountTokenResponse>) responseObserver);
          break;
        case METHODID_GET_SERVICE_ACCOUNT_TOKENS:
          serviceImpl.getServiceAccountTokens((com.aruna.api.storage.services.v2.GetServiceAccountTokensRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetServiceAccountTokensResponse>) responseObserver);
          break;
        case METHODID_DELETE_SERVICE_ACCOUNT_TOKEN:
          serviceImpl.deleteServiceAccountToken((com.aruna.api.storage.services.v2.DeleteServiceAccountTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteServiceAccountTokenResponse>) responseObserver);
          break;
        case METHODID_DELETE_SERVICE_ACCOUNT_TOKENS:
          serviceImpl.deleteServiceAccountTokens((com.aruna.api.storage.services.v2.DeleteServiceAccountTokensRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteServiceAccountTokensResponse>) responseObserver);
          break;
        case METHODID_DELETE_SERVICE_ACCOUNT:
          serviceImpl.deleteServiceAccount((com.aruna.api.storage.services.v2.DeleteServiceAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteServiceAccountResponse>) responseObserver);
          break;
        case METHODID_GET_S3CREDENTIALS_SVC_ACCOUNT:
          serviceImpl.getS3CredentialsSvcAccount((com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse>) responseObserver);
          break;
        case METHODID_CREATE_DATAPROXY_TOKEN_SVC_ACCOUNT:
          serviceImpl.createDataproxyTokenSvcAccount((com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountResponse>) responseObserver);
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
          getCreateServiceAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.CreateServiceAccountRequest,
              com.aruna.api.storage.services.v2.CreateServiceAccountResponse>(
                service, METHODID_CREATE_SERVICE_ACCOUNT)))
        .addMethod(
          getCreateServiceAccountTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.CreateServiceAccountTokenRequest,
              com.aruna.api.storage.services.v2.CreateServiceAccountTokenResponse>(
                service, METHODID_CREATE_SERVICE_ACCOUNT_TOKEN)))
        .addMethod(
          getSetServiceAccountPermissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.SetServiceAccountPermissionRequest,
              com.aruna.api.storage.services.v2.SetServiceAccountPermissionResponse>(
                service, METHODID_SET_SERVICE_ACCOUNT_PERMISSION)))
        .addMethod(
          getGetServiceAccountTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetServiceAccountTokenRequest,
              com.aruna.api.storage.services.v2.GetServiceAccountTokenResponse>(
                service, METHODID_GET_SERVICE_ACCOUNT_TOKEN)))
        .addMethod(
          getGetServiceAccountTokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetServiceAccountTokensRequest,
              com.aruna.api.storage.services.v2.GetServiceAccountTokensResponse>(
                service, METHODID_GET_SERVICE_ACCOUNT_TOKENS)))
        .addMethod(
          getDeleteServiceAccountTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DeleteServiceAccountTokenRequest,
              com.aruna.api.storage.services.v2.DeleteServiceAccountTokenResponse>(
                service, METHODID_DELETE_SERVICE_ACCOUNT_TOKEN)))
        .addMethod(
          getDeleteServiceAccountTokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DeleteServiceAccountTokensRequest,
              com.aruna.api.storage.services.v2.DeleteServiceAccountTokensResponse>(
                service, METHODID_DELETE_SERVICE_ACCOUNT_TOKENS)))
        .addMethod(
          getDeleteServiceAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DeleteServiceAccountRequest,
              com.aruna.api.storage.services.v2.DeleteServiceAccountResponse>(
                service, METHODID_DELETE_SERVICE_ACCOUNT)))
        .addMethod(
          getGetS3CredentialsSvcAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountRequest,
              com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse>(
                service, METHODID_GET_S3CREDENTIALS_SVC_ACCOUNT)))
        .addMethod(
          getCreateDataproxyTokenSvcAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountRequest,
              com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountResponse>(
                service, METHODID_CREATE_DATAPROXY_TOKEN_SVC_ACCOUNT)))
        .build();
  }

  private static abstract class ServiceAccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceAccountServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.storage.services.v2.ServiceAccountServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceAccountService");
    }
  }

  private static final class ServiceAccountServiceFileDescriptorSupplier
      extends ServiceAccountServiceBaseDescriptorSupplier {
    ServiceAccountServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceAccountServiceMethodDescriptorSupplier
      extends ServiceAccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ServiceAccountServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ServiceAccountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceAccountServiceFileDescriptorSupplier())
              .addMethod(getCreateServiceAccountMethod())
              .addMethod(getCreateServiceAccountTokenMethod())
              .addMethod(getSetServiceAccountPermissionMethod())
              .addMethod(getGetServiceAccountTokenMethod())
              .addMethod(getGetServiceAccountTokensMethod())
              .addMethod(getDeleteServiceAccountTokenMethod())
              .addMethod(getDeleteServiceAccountTokensMethod())
              .addMethod(getDeleteServiceAccountMethod())
              .addMethod(getGetS3CredentialsSvcAccountMethod())
              .addMethod(getCreateDataproxyTokenSvcAccountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
