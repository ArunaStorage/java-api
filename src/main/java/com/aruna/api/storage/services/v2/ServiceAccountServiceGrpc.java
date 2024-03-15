package com.aruna.api.storage.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ServiceAccountService
 * Status: BETA
 * 
 * Service that contains CRUD operations for service_accounts.
 * Service accounts are project specific accounts that can be used for automation. 
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.0)",
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

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateS3CredentialsSvcAccountRequest,
      com.aruna.api.storage.services.v2.CreateS3CredentialsSvcAccountResponse> getCreateS3CredentialsSvcAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateS3CredentialsSvcAccount",
      requestType = com.aruna.api.storage.services.v2.CreateS3CredentialsSvcAccountRequest.class,
      responseType = com.aruna.api.storage.services.v2.CreateS3CredentialsSvcAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateS3CredentialsSvcAccountRequest,
      com.aruna.api.storage.services.v2.CreateS3CredentialsSvcAccountResponse> getCreateS3CredentialsSvcAccountMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateS3CredentialsSvcAccountRequest, com.aruna.api.storage.services.v2.CreateS3CredentialsSvcAccountResponse> getCreateS3CredentialsSvcAccountMethod;
    if ((getCreateS3CredentialsSvcAccountMethod = ServiceAccountServiceGrpc.getCreateS3CredentialsSvcAccountMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getCreateS3CredentialsSvcAccountMethod = ServiceAccountServiceGrpc.getCreateS3CredentialsSvcAccountMethod) == null) {
          ServiceAccountServiceGrpc.getCreateS3CredentialsSvcAccountMethod = getCreateS3CredentialsSvcAccountMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.CreateS3CredentialsSvcAccountRequest, com.aruna.api.storage.services.v2.CreateS3CredentialsSvcAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateS3CredentialsSvcAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateS3CredentialsSvcAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateS3CredentialsSvcAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("CreateS3CredentialsSvcAccount"))
              .build();
        }
      }
    }
    return getCreateS3CredentialsSvcAccountMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteS3CredentialsSvcAccountRequest,
      com.aruna.api.storage.services.v2.DeleteS3CredentialsSvcAccountResponse> getDeleteS3CredentialsSvcAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteS3CredentialsSvcAccount",
      requestType = com.aruna.api.storage.services.v2.DeleteS3CredentialsSvcAccountRequest.class,
      responseType = com.aruna.api.storage.services.v2.DeleteS3CredentialsSvcAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteS3CredentialsSvcAccountRequest,
      com.aruna.api.storage.services.v2.DeleteS3CredentialsSvcAccountResponse> getDeleteS3CredentialsSvcAccountMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteS3CredentialsSvcAccountRequest, com.aruna.api.storage.services.v2.DeleteS3CredentialsSvcAccountResponse> getDeleteS3CredentialsSvcAccountMethod;
    if ((getDeleteS3CredentialsSvcAccountMethod = ServiceAccountServiceGrpc.getDeleteS3CredentialsSvcAccountMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getDeleteS3CredentialsSvcAccountMethod = ServiceAccountServiceGrpc.getDeleteS3CredentialsSvcAccountMethod) == null) {
          ServiceAccountServiceGrpc.getDeleteS3CredentialsSvcAccountMethod = getDeleteS3CredentialsSvcAccountMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DeleteS3CredentialsSvcAccountRequest, com.aruna.api.storage.services.v2.DeleteS3CredentialsSvcAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteS3CredentialsSvcAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteS3CredentialsSvcAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteS3CredentialsSvcAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("DeleteS3CredentialsSvcAccount"))
              .build();
        }
      }
    }
    return getDeleteS3CredentialsSvcAccountMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest,
      com.aruna.api.storage.services.v2.AddPubkeySvcAccountResponse> getAddPubkeySvcAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPubkeySvcAccount",
      requestType = com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest.class,
      responseType = com.aruna.api.storage.services.v2.AddPubkeySvcAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest,
      com.aruna.api.storage.services.v2.AddPubkeySvcAccountResponse> getAddPubkeySvcAccountMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest, com.aruna.api.storage.services.v2.AddPubkeySvcAccountResponse> getAddPubkeySvcAccountMethod;
    if ((getAddPubkeySvcAccountMethod = ServiceAccountServiceGrpc.getAddPubkeySvcAccountMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getAddPubkeySvcAccountMethod = ServiceAccountServiceGrpc.getAddPubkeySvcAccountMethod) == null) {
          ServiceAccountServiceGrpc.getAddPubkeySvcAccountMethod = getAddPubkeySvcAccountMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest, com.aruna.api.storage.services.v2.AddPubkeySvcAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPubkeySvcAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AddPubkeySvcAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("AddPubkeySvcAccount"))
              .build();
        }
      }
    }
    return getAddPubkeySvcAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AddTrustedEndpointsSvcAccountRequest,
      com.aruna.api.storage.services.v2.AddTrustedEndpointsSvcAccountResponse> getAddTrustedEndpointsSvcAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddTrustedEndpointsSvcAccount",
      requestType = com.aruna.api.storage.services.v2.AddTrustedEndpointsSvcAccountRequest.class,
      responseType = com.aruna.api.storage.services.v2.AddTrustedEndpointsSvcAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AddTrustedEndpointsSvcAccountRequest,
      com.aruna.api.storage.services.v2.AddTrustedEndpointsSvcAccountResponse> getAddTrustedEndpointsSvcAccountMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AddTrustedEndpointsSvcAccountRequest, com.aruna.api.storage.services.v2.AddTrustedEndpointsSvcAccountResponse> getAddTrustedEndpointsSvcAccountMethod;
    if ((getAddTrustedEndpointsSvcAccountMethod = ServiceAccountServiceGrpc.getAddTrustedEndpointsSvcAccountMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getAddTrustedEndpointsSvcAccountMethod = ServiceAccountServiceGrpc.getAddTrustedEndpointsSvcAccountMethod) == null) {
          ServiceAccountServiceGrpc.getAddTrustedEndpointsSvcAccountMethod = getAddTrustedEndpointsSvcAccountMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.AddTrustedEndpointsSvcAccountRequest, com.aruna.api.storage.services.v2.AddTrustedEndpointsSvcAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddTrustedEndpointsSvcAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AddTrustedEndpointsSvcAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AddTrustedEndpointsSvcAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("AddTrustedEndpointsSvcAccount"))
              .build();
        }
      }
    }
    return getAddTrustedEndpointsSvcAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.RemoveTrustedEndpointsSvcAccountRequest,
      com.aruna.api.storage.services.v2.RemoveTrustedEndpointsSvcAccountResponse> getRemoveTrustedEndpointsSvcAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveTrustedEndpointsSvcAccount",
      requestType = com.aruna.api.storage.services.v2.RemoveTrustedEndpointsSvcAccountRequest.class,
      responseType = com.aruna.api.storage.services.v2.RemoveTrustedEndpointsSvcAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.RemoveTrustedEndpointsSvcAccountRequest,
      com.aruna.api.storage.services.v2.RemoveTrustedEndpointsSvcAccountResponse> getRemoveTrustedEndpointsSvcAccountMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.RemoveTrustedEndpointsSvcAccountRequest, com.aruna.api.storage.services.v2.RemoveTrustedEndpointsSvcAccountResponse> getRemoveTrustedEndpointsSvcAccountMethod;
    if ((getRemoveTrustedEndpointsSvcAccountMethod = ServiceAccountServiceGrpc.getRemoveTrustedEndpointsSvcAccountMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getRemoveTrustedEndpointsSvcAccountMethod = ServiceAccountServiceGrpc.getRemoveTrustedEndpointsSvcAccountMethod) == null) {
          ServiceAccountServiceGrpc.getRemoveTrustedEndpointsSvcAccountMethod = getRemoveTrustedEndpointsSvcAccountMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.RemoveTrustedEndpointsSvcAccountRequest, com.aruna.api.storage.services.v2.RemoveTrustedEndpointsSvcAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveTrustedEndpointsSvcAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.RemoveTrustedEndpointsSvcAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.RemoveTrustedEndpointsSvcAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("RemoveTrustedEndpointsSvcAccount"))
              .build();
        }
      }
    }
    return getRemoveTrustedEndpointsSvcAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountRequest,
      com.aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountResponse> getAddDataProxyAttributeSvcAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddDataProxyAttributeSvcAccount",
      requestType = com.aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountRequest.class,
      responseType = com.aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountRequest,
      com.aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountResponse> getAddDataProxyAttributeSvcAccountMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountRequest, com.aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountResponse> getAddDataProxyAttributeSvcAccountMethod;
    if ((getAddDataProxyAttributeSvcAccountMethod = ServiceAccountServiceGrpc.getAddDataProxyAttributeSvcAccountMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getAddDataProxyAttributeSvcAccountMethod = ServiceAccountServiceGrpc.getAddDataProxyAttributeSvcAccountMethod) == null) {
          ServiceAccountServiceGrpc.getAddDataProxyAttributeSvcAccountMethod = getAddDataProxyAttributeSvcAccountMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountRequest, com.aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddDataProxyAttributeSvcAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("AddDataProxyAttributeSvcAccount"))
              .build();
        }
      }
    }
    return getAddDataProxyAttributeSvcAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest,
      com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountResponse> getRemoveDataProxyAttributeSvcAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveDataProxyAttributeSvcAccount",
      requestType = com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest.class,
      responseType = com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest,
      com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountResponse> getRemoveDataProxyAttributeSvcAccountMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest, com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountResponse> getRemoveDataProxyAttributeSvcAccountMethod;
    if ((getRemoveDataProxyAttributeSvcAccountMethod = ServiceAccountServiceGrpc.getRemoveDataProxyAttributeSvcAccountMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getRemoveDataProxyAttributeSvcAccountMethod = ServiceAccountServiceGrpc.getRemoveDataProxyAttributeSvcAccountMethod) == null) {
          ServiceAccountServiceGrpc.getRemoveDataProxyAttributeSvcAccountMethod = getRemoveDataProxyAttributeSvcAccountMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest, com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveDataProxyAttributeSvcAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("RemoveDataProxyAttributeSvcAccount"))
              .build();
        }
      }
    }
    return getRemoveDataProxyAttributeSvcAccountMethod;
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
   * Status: BETA
   * 
   * Service that contains CRUD operations for service_accounts.
   * Service accounts are project specific accounts that can be used for automation. 
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
     * service account or a subset of it.
     * </pre>
     */
    default void createServiceAccountToken(com.aruna.api.storage.services.v2.CreateServiceAccountTokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateServiceAccountTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateServiceAccountTokenMethod(), responseObserver);
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
     * CreateS3CredentialsSvcAccount
     * Status: ALPHA
     * Creates or updates S3 credentials for a specific SvcAccount and data_proxy
     * </pre>
     */
    default void createS3CredentialsSvcAccount(com.aruna.api.storage.services.v2.CreateS3CredentialsSvcAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateS3CredentialsSvcAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateS3CredentialsSvcAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetS3CredentialsSvcAccount
     * Status: ALPHA
     * Gets S3 credentials for a specific svc_account and data_proxy
     * </pre>
     */
    default void getS3CredentialsSvcAccount(com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetS3CredentialsSvcAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteS3CredentialsSvcAccount
     * Status: ALPHA
     * Revokes existing S3 credentials for a specific user and data_proxy
     * </pre>
     */
    default void deleteS3CredentialsSvcAccount(com.aruna.api.storage.services.v2.DeleteS3CredentialsSvcAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteS3CredentialsSvcAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteS3CredentialsSvcAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDataproxyToken
     * Status: ALPHA
     * Gets token for a specific SvcAccount and data_proxy
     * </pre>
     */
    default void createDataproxyTokenSvcAccount(com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDataproxyTokenSvcAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddPubkeySvcAccount
     * Status: ALPHA
     * Adds an ED25519 public key for the SvcAccount
     * </pre>
     */
    default void addPubkeySvcAccount(com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AddPubkeySvcAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPubkeySvcAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddTrustedEndpointsSvcAccount
     * Status: ALPHA
     * Adds an endpoint to the trusted endpoints list of the SvcAccount
     * </pre>
     */
    default void addTrustedEndpointsSvcAccount(com.aruna.api.storage.services.v2.AddTrustedEndpointsSvcAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AddTrustedEndpointsSvcAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddTrustedEndpointsSvcAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveTrustedEndpointsSvcAccount
     * Status: ALPHA
     * Removes an endpoint from the trusted endpoints list of the SvcAccount
     * </pre>
     */
    default void removeTrustedEndpointsSvcAccount(com.aruna.api.storage.services.v2.RemoveTrustedEndpointsSvcAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RemoveTrustedEndpointsSvcAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveTrustedEndpointsSvcAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddDataProxyAttributeSvcAccount
     * Status: ALPHA
     * Adds an data proxy specific attribute to the SvcAccount
     * </pre>
     */
    default void addDataProxyAttributeSvcAccount(com.aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddDataProxyAttributeSvcAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveDataProxyAttributeSvcAccount
     * Status: ALPHA
     * Removes an data proxy specific attribute from the SvcAccount
     * </pre>
     */
    default void removeDataProxyAttributeSvcAccount(com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveDataProxyAttributeSvcAccountMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ServiceAccountService.
   * <pre>
   * ServiceAccountService
   * Status: BETA
   * 
   * Service that contains CRUD operations for service_accounts.
   * Service accounts are project specific accounts that can be used for automation. 
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
   * Status: BETA
   * 
   * Service that contains CRUD operations for service_accounts.
   * Service accounts are project specific accounts that can be used for automation. 
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
     * service account or a subset of it.
     * </pre>
     */
    public void createServiceAccountToken(com.aruna.api.storage.services.v2.CreateServiceAccountTokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateServiceAccountTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateServiceAccountTokenMethod(), getCallOptions()), request, responseObserver);
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
     * CreateS3CredentialsSvcAccount
     * Status: ALPHA
     * Creates or updates S3 credentials for a specific SvcAccount and data_proxy
     * </pre>
     */
    public void createS3CredentialsSvcAccount(com.aruna.api.storage.services.v2.CreateS3CredentialsSvcAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateS3CredentialsSvcAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateS3CredentialsSvcAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetS3CredentialsSvcAccount
     * Status: ALPHA
     * Gets S3 credentials for a specific svc_account and data_proxy
     * </pre>
     */
    public void getS3CredentialsSvcAccount(com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetS3CredentialsSvcAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteS3CredentialsSvcAccount
     * Status: ALPHA
     * Revokes existing S3 credentials for a specific user and data_proxy
     * </pre>
     */
    public void deleteS3CredentialsSvcAccount(com.aruna.api.storage.services.v2.DeleteS3CredentialsSvcAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteS3CredentialsSvcAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteS3CredentialsSvcAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDataproxyToken
     * Status: ALPHA
     * Gets token for a specific SvcAccount and data_proxy
     * </pre>
     */
    public void createDataproxyTokenSvcAccount(com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDataproxyTokenSvcAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddPubkeySvcAccount
     * Status: ALPHA
     * Adds an ED25519 public key for the SvcAccount
     * </pre>
     */
    public void addPubkeySvcAccount(com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AddPubkeySvcAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPubkeySvcAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddTrustedEndpointsSvcAccount
     * Status: ALPHA
     * Adds an endpoint to the trusted endpoints list of the SvcAccount
     * </pre>
     */
    public void addTrustedEndpointsSvcAccount(com.aruna.api.storage.services.v2.AddTrustedEndpointsSvcAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AddTrustedEndpointsSvcAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddTrustedEndpointsSvcAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveTrustedEndpointsSvcAccount
     * Status: ALPHA
     * Removes an endpoint from the trusted endpoints list of the SvcAccount
     * </pre>
     */
    public void removeTrustedEndpointsSvcAccount(com.aruna.api.storage.services.v2.RemoveTrustedEndpointsSvcAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RemoveTrustedEndpointsSvcAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveTrustedEndpointsSvcAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddDataProxyAttributeSvcAccount
     * Status: ALPHA
     * Adds an data proxy specific attribute to the SvcAccount
     * </pre>
     */
    public void addDataProxyAttributeSvcAccount(com.aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddDataProxyAttributeSvcAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveDataProxyAttributeSvcAccount
     * Status: ALPHA
     * Removes an data proxy specific attribute from the SvcAccount
     * </pre>
     */
    public void removeDataProxyAttributeSvcAccount(com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveDataProxyAttributeSvcAccountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ServiceAccountService.
   * <pre>
   * ServiceAccountService
   * Status: BETA
   * 
   * Service that contains CRUD operations for service_accounts.
   * Service accounts are project specific accounts that can be used for automation. 
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
     * service account or a subset of it.
     * </pre>
     */
    public com.aruna.api.storage.services.v2.CreateServiceAccountTokenResponse createServiceAccountToken(com.aruna.api.storage.services.v2.CreateServiceAccountTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateServiceAccountTokenMethod(), getCallOptions(), request);
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
     * CreateS3CredentialsSvcAccount
     * Status: ALPHA
     * Creates or updates S3 credentials for a specific SvcAccount and data_proxy
     * </pre>
     */
    public com.aruna.api.storage.services.v2.CreateS3CredentialsSvcAccountResponse createS3CredentialsSvcAccount(com.aruna.api.storage.services.v2.CreateS3CredentialsSvcAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateS3CredentialsSvcAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetS3CredentialsSvcAccount
     * Status: ALPHA
     * Gets S3 credentials for a specific svc_account and data_proxy
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse getS3CredentialsSvcAccount(com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetS3CredentialsSvcAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteS3CredentialsSvcAccount
     * Status: ALPHA
     * Revokes existing S3 credentials for a specific user and data_proxy
     * </pre>
     */
    public com.aruna.api.storage.services.v2.DeleteS3CredentialsSvcAccountResponse deleteS3CredentialsSvcAccount(com.aruna.api.storage.services.v2.DeleteS3CredentialsSvcAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteS3CredentialsSvcAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDataproxyToken
     * Status: ALPHA
     * Gets token for a specific SvcAccount and data_proxy
     * </pre>
     */
    public com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountResponse createDataproxyTokenSvcAccount(com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDataproxyTokenSvcAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddPubkeySvcAccount
     * Status: ALPHA
     * Adds an ED25519 public key for the SvcAccount
     * </pre>
     */
    public com.aruna.api.storage.services.v2.AddPubkeySvcAccountResponse addPubkeySvcAccount(com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPubkeySvcAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddTrustedEndpointsSvcAccount
     * Status: ALPHA
     * Adds an endpoint to the trusted endpoints list of the SvcAccount
     * </pre>
     */
    public com.aruna.api.storage.services.v2.AddTrustedEndpointsSvcAccountResponse addTrustedEndpointsSvcAccount(com.aruna.api.storage.services.v2.AddTrustedEndpointsSvcAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddTrustedEndpointsSvcAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveTrustedEndpointsSvcAccount
     * Status: ALPHA
     * Removes an endpoint from the trusted endpoints list of the SvcAccount
     * </pre>
     */
    public com.aruna.api.storage.services.v2.RemoveTrustedEndpointsSvcAccountResponse removeTrustedEndpointsSvcAccount(com.aruna.api.storage.services.v2.RemoveTrustedEndpointsSvcAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveTrustedEndpointsSvcAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddDataProxyAttributeSvcAccount
     * Status: ALPHA
     * Adds an data proxy specific attribute to the SvcAccount
     * </pre>
     */
    public com.aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountResponse addDataProxyAttributeSvcAccount(com.aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddDataProxyAttributeSvcAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveDataProxyAttributeSvcAccount
     * Status: ALPHA
     * Removes an data proxy specific attribute from the SvcAccount
     * </pre>
     */
    public com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountResponse removeDataProxyAttributeSvcAccount(com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveDataProxyAttributeSvcAccountMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ServiceAccountService.
   * <pre>
   * ServiceAccountService
   * Status: BETA
   * 
   * Service that contains CRUD operations for service_accounts.
   * Service accounts are project specific accounts that can be used for automation. 
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
     * service account or a subset of it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.CreateServiceAccountTokenResponse> createServiceAccountToken(
        com.aruna.api.storage.services.v2.CreateServiceAccountTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateServiceAccountTokenMethod(), getCallOptions()), request);
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
     * CreateS3CredentialsSvcAccount
     * Status: ALPHA
     * Creates or updates S3 credentials for a specific SvcAccount and data_proxy
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.CreateS3CredentialsSvcAccountResponse> createS3CredentialsSvcAccount(
        com.aruna.api.storage.services.v2.CreateS3CredentialsSvcAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateS3CredentialsSvcAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetS3CredentialsSvcAccount
     * Status: ALPHA
     * Gets S3 credentials for a specific svc_account and data_proxy
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse> getS3CredentialsSvcAccount(
        com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetS3CredentialsSvcAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteS3CredentialsSvcAccount
     * Status: ALPHA
     * Revokes existing S3 credentials for a specific user and data_proxy
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DeleteS3CredentialsSvcAccountResponse> deleteS3CredentialsSvcAccount(
        com.aruna.api.storage.services.v2.DeleteS3CredentialsSvcAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteS3CredentialsSvcAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDataproxyToken
     * Status: ALPHA
     * Gets token for a specific SvcAccount and data_proxy
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountResponse> createDataproxyTokenSvcAccount(
        com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDataproxyTokenSvcAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddPubkeySvcAccount
     * Status: ALPHA
     * Adds an ED25519 public key for the SvcAccount
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.AddPubkeySvcAccountResponse> addPubkeySvcAccount(
        com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPubkeySvcAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddTrustedEndpointsSvcAccount
     * Status: ALPHA
     * Adds an endpoint to the trusted endpoints list of the SvcAccount
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.AddTrustedEndpointsSvcAccountResponse> addTrustedEndpointsSvcAccount(
        com.aruna.api.storage.services.v2.AddTrustedEndpointsSvcAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddTrustedEndpointsSvcAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveTrustedEndpointsSvcAccount
     * Status: ALPHA
     * Removes an endpoint from the trusted endpoints list of the SvcAccount
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.RemoveTrustedEndpointsSvcAccountResponse> removeTrustedEndpointsSvcAccount(
        com.aruna.api.storage.services.v2.RemoveTrustedEndpointsSvcAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveTrustedEndpointsSvcAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddDataProxyAttributeSvcAccount
     * Status: ALPHA
     * Adds an data proxy specific attribute to the SvcAccount
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountResponse> addDataProxyAttributeSvcAccount(
        com.aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddDataProxyAttributeSvcAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveDataProxyAttributeSvcAccount
     * Status: ALPHA
     * Removes an data proxy specific attribute from the SvcAccount
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountResponse> removeDataProxyAttributeSvcAccount(
        com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveDataProxyAttributeSvcAccountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SERVICE_ACCOUNT = 0;
  private static final int METHODID_CREATE_SERVICE_ACCOUNT_TOKEN = 1;
  private static final int METHODID_GET_SERVICE_ACCOUNT_TOKEN = 2;
  private static final int METHODID_GET_SERVICE_ACCOUNT_TOKENS = 3;
  private static final int METHODID_DELETE_SERVICE_ACCOUNT_TOKEN = 4;
  private static final int METHODID_DELETE_SERVICE_ACCOUNT_TOKENS = 5;
  private static final int METHODID_DELETE_SERVICE_ACCOUNT = 6;
  private static final int METHODID_CREATE_S3CREDENTIALS_SVC_ACCOUNT = 7;
  private static final int METHODID_GET_S3CREDENTIALS_SVC_ACCOUNT = 8;
  private static final int METHODID_DELETE_S3CREDENTIALS_SVC_ACCOUNT = 9;
  private static final int METHODID_CREATE_DATAPROXY_TOKEN_SVC_ACCOUNT = 10;
  private static final int METHODID_ADD_PUBKEY_SVC_ACCOUNT = 11;
  private static final int METHODID_ADD_TRUSTED_ENDPOINTS_SVC_ACCOUNT = 12;
  private static final int METHODID_REMOVE_TRUSTED_ENDPOINTS_SVC_ACCOUNT = 13;
  private static final int METHODID_ADD_DATA_PROXY_ATTRIBUTE_SVC_ACCOUNT = 14;
  private static final int METHODID_REMOVE_DATA_PROXY_ATTRIBUTE_SVC_ACCOUNT = 15;

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
        case METHODID_CREATE_S3CREDENTIALS_SVC_ACCOUNT:
          serviceImpl.createS3CredentialsSvcAccount((com.aruna.api.storage.services.v2.CreateS3CredentialsSvcAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateS3CredentialsSvcAccountResponse>) responseObserver);
          break;
        case METHODID_GET_S3CREDENTIALS_SVC_ACCOUNT:
          serviceImpl.getS3CredentialsSvcAccount((com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse>) responseObserver);
          break;
        case METHODID_DELETE_S3CREDENTIALS_SVC_ACCOUNT:
          serviceImpl.deleteS3CredentialsSvcAccount((com.aruna.api.storage.services.v2.DeleteS3CredentialsSvcAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteS3CredentialsSvcAccountResponse>) responseObserver);
          break;
        case METHODID_CREATE_DATAPROXY_TOKEN_SVC_ACCOUNT:
          serviceImpl.createDataproxyTokenSvcAccount((com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountResponse>) responseObserver);
          break;
        case METHODID_ADD_PUBKEY_SVC_ACCOUNT:
          serviceImpl.addPubkeySvcAccount((com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AddPubkeySvcAccountResponse>) responseObserver);
          break;
        case METHODID_ADD_TRUSTED_ENDPOINTS_SVC_ACCOUNT:
          serviceImpl.addTrustedEndpointsSvcAccount((com.aruna.api.storage.services.v2.AddTrustedEndpointsSvcAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AddTrustedEndpointsSvcAccountResponse>) responseObserver);
          break;
        case METHODID_REMOVE_TRUSTED_ENDPOINTS_SVC_ACCOUNT:
          serviceImpl.removeTrustedEndpointsSvcAccount((com.aruna.api.storage.services.v2.RemoveTrustedEndpointsSvcAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RemoveTrustedEndpointsSvcAccountResponse>) responseObserver);
          break;
        case METHODID_ADD_DATA_PROXY_ATTRIBUTE_SVC_ACCOUNT:
          serviceImpl.addDataProxyAttributeSvcAccount((com.aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountResponse>) responseObserver);
          break;
        case METHODID_REMOVE_DATA_PROXY_ATTRIBUTE_SVC_ACCOUNT:
          serviceImpl.removeDataProxyAttributeSvcAccount((com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountResponse>) responseObserver);
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
          getCreateS3CredentialsSvcAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.CreateS3CredentialsSvcAccountRequest,
              com.aruna.api.storage.services.v2.CreateS3CredentialsSvcAccountResponse>(
                service, METHODID_CREATE_S3CREDENTIALS_SVC_ACCOUNT)))
        .addMethod(
          getGetS3CredentialsSvcAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountRequest,
              com.aruna.api.storage.services.v2.GetS3CredentialsSvcAccountResponse>(
                service, METHODID_GET_S3CREDENTIALS_SVC_ACCOUNT)))
        .addMethod(
          getDeleteS3CredentialsSvcAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DeleteS3CredentialsSvcAccountRequest,
              com.aruna.api.storage.services.v2.DeleteS3CredentialsSvcAccountResponse>(
                service, METHODID_DELETE_S3CREDENTIALS_SVC_ACCOUNT)))
        .addMethod(
          getCreateDataproxyTokenSvcAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountRequest,
              com.aruna.api.storage.services.v2.CreateDataproxyTokenSvcAccountResponse>(
                service, METHODID_CREATE_DATAPROXY_TOKEN_SVC_ACCOUNT)))
        .addMethod(
          getAddPubkeySvcAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.AddPubkeySvcAccountRequest,
              com.aruna.api.storage.services.v2.AddPubkeySvcAccountResponse>(
                service, METHODID_ADD_PUBKEY_SVC_ACCOUNT)))
        .addMethod(
          getAddTrustedEndpointsSvcAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.AddTrustedEndpointsSvcAccountRequest,
              com.aruna.api.storage.services.v2.AddTrustedEndpointsSvcAccountResponse>(
                service, METHODID_ADD_TRUSTED_ENDPOINTS_SVC_ACCOUNT)))
        .addMethod(
          getRemoveTrustedEndpointsSvcAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.RemoveTrustedEndpointsSvcAccountRequest,
              com.aruna.api.storage.services.v2.RemoveTrustedEndpointsSvcAccountResponse>(
                service, METHODID_REMOVE_TRUSTED_ENDPOINTS_SVC_ACCOUNT)))
        .addMethod(
          getAddDataProxyAttributeSvcAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountRequest,
              com.aruna.api.storage.services.v2.AddDataProxyAttributeSvcAccountResponse>(
                service, METHODID_ADD_DATA_PROXY_ATTRIBUTE_SVC_ACCOUNT)))
        .addMethod(
          getRemoveDataProxyAttributeSvcAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountRequest,
              com.aruna.api.storage.services.v2.RemoveDataProxyAttributeSvcAccountResponse>(
                service, METHODID_REMOVE_DATA_PROXY_ATTRIBUTE_SVC_ACCOUNT)))
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
              .addMethod(getGetServiceAccountTokenMethod())
              .addMethod(getGetServiceAccountTokensMethod())
              .addMethod(getDeleteServiceAccountTokenMethod())
              .addMethod(getDeleteServiceAccountTokensMethod())
              .addMethod(getDeleteServiceAccountMethod())
              .addMethod(getCreateS3CredentialsSvcAccountMethod())
              .addMethod(getGetS3CredentialsSvcAccountMethod())
              .addMethod(getDeleteS3CredentialsSvcAccountMethod())
              .addMethod(getCreateDataproxyTokenSvcAccountMethod())
              .addMethod(getAddPubkeySvcAccountMethod())
              .addMethod(getAddTrustedEndpointsSvcAccountMethod())
              .addMethod(getRemoveTrustedEndpointsSvcAccountMethod())
              .addMethod(getAddDataProxyAttributeSvcAccountMethod())
              .addMethod(getRemoveDataProxyAttributeSvcAccountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
