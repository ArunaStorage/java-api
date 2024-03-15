package com.aruna.api.storage.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * UserService
 * Status: BETA
 * Contains all CRUD methods for users and associated resource
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.0)",
    comments = "Source: aruna/api/storage/services/v2/user_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "aruna.api.storage.services.v2.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.RegisterUserRequest,
      com.aruna.api.storage.services.v2.RegisterUserResponse> getRegisterUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterUser",
      requestType = com.aruna.api.storage.services.v2.RegisterUserRequest.class,
      responseType = com.aruna.api.storage.services.v2.RegisterUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.RegisterUserRequest,
      com.aruna.api.storage.services.v2.RegisterUserResponse> getRegisterUserMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.RegisterUserRequest, com.aruna.api.storage.services.v2.RegisterUserResponse> getRegisterUserMethod;
    if ((getRegisterUserMethod = UserServiceGrpc.getRegisterUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRegisterUserMethod = UserServiceGrpc.getRegisterUserMethod) == null) {
          UserServiceGrpc.getRegisterUserMethod = getRegisterUserMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.RegisterUserRequest, com.aruna.api.storage.services.v2.RegisterUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.RegisterUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.RegisterUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("RegisterUser"))
              .build();
        }
      }
    }
    return getRegisterUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeactivateUserRequest,
      com.aruna.api.storage.services.v2.DeactivateUserResponse> getDeactivateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeactivateUser",
      requestType = com.aruna.api.storage.services.v2.DeactivateUserRequest.class,
      responseType = com.aruna.api.storage.services.v2.DeactivateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeactivateUserRequest,
      com.aruna.api.storage.services.v2.DeactivateUserResponse> getDeactivateUserMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeactivateUserRequest, com.aruna.api.storage.services.v2.DeactivateUserResponse> getDeactivateUserMethod;
    if ((getDeactivateUserMethod = UserServiceGrpc.getDeactivateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeactivateUserMethod = UserServiceGrpc.getDeactivateUserMethod) == null) {
          UserServiceGrpc.getDeactivateUserMethod = getDeactivateUserMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DeactivateUserRequest, com.aruna.api.storage.services.v2.DeactivateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeactivateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeactivateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeactivateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeactivateUser"))
              .build();
        }
      }
    }
    return getDeactivateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ActivateUserRequest,
      com.aruna.api.storage.services.v2.ActivateUserResponse> getActivateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActivateUser",
      requestType = com.aruna.api.storage.services.v2.ActivateUserRequest.class,
      responseType = com.aruna.api.storage.services.v2.ActivateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ActivateUserRequest,
      com.aruna.api.storage.services.v2.ActivateUserResponse> getActivateUserMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.ActivateUserRequest, com.aruna.api.storage.services.v2.ActivateUserResponse> getActivateUserMethod;
    if ((getActivateUserMethod = UserServiceGrpc.getActivateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getActivateUserMethod = UserServiceGrpc.getActivateUserMethod) == null) {
          UserServiceGrpc.getActivateUserMethod = getActivateUserMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.ActivateUserRequest, com.aruna.api.storage.services.v2.ActivateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActivateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ActivateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.ActivateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ActivateUser"))
              .build();
        }
      }
    }
    return getActivateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateAPITokenRequest,
      com.aruna.api.storage.services.v2.CreateAPITokenResponse> getCreateAPITokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAPIToken",
      requestType = com.aruna.api.storage.services.v2.CreateAPITokenRequest.class,
      responseType = com.aruna.api.storage.services.v2.CreateAPITokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateAPITokenRequest,
      com.aruna.api.storage.services.v2.CreateAPITokenResponse> getCreateAPITokenMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateAPITokenRequest, com.aruna.api.storage.services.v2.CreateAPITokenResponse> getCreateAPITokenMethod;
    if ((getCreateAPITokenMethod = UserServiceGrpc.getCreateAPITokenMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateAPITokenMethod = UserServiceGrpc.getCreateAPITokenMethod) == null) {
          UserServiceGrpc.getCreateAPITokenMethod = getCreateAPITokenMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.CreateAPITokenRequest, com.aruna.api.storage.services.v2.CreateAPITokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAPIToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateAPITokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateAPITokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateAPIToken"))
              .build();
        }
      }
    }
    return getCreateAPITokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetAPITokenRequest,
      com.aruna.api.storage.services.v2.GetAPITokenResponse> getGetAPITokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAPIToken",
      requestType = com.aruna.api.storage.services.v2.GetAPITokenRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetAPITokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetAPITokenRequest,
      com.aruna.api.storage.services.v2.GetAPITokenResponse> getGetAPITokenMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetAPITokenRequest, com.aruna.api.storage.services.v2.GetAPITokenResponse> getGetAPITokenMethod;
    if ((getGetAPITokenMethod = UserServiceGrpc.getGetAPITokenMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetAPITokenMethod = UserServiceGrpc.getGetAPITokenMethod) == null) {
          UserServiceGrpc.getGetAPITokenMethod = getGetAPITokenMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetAPITokenRequest, com.aruna.api.storage.services.v2.GetAPITokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAPIToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetAPITokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetAPITokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetAPIToken"))
              .build();
        }
      }
    }
    return getGetAPITokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetAPITokensRequest,
      com.aruna.api.storage.services.v2.GetAPITokensResponse> getGetAPITokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAPITokens",
      requestType = com.aruna.api.storage.services.v2.GetAPITokensRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetAPITokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetAPITokensRequest,
      com.aruna.api.storage.services.v2.GetAPITokensResponse> getGetAPITokensMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetAPITokensRequest, com.aruna.api.storage.services.v2.GetAPITokensResponse> getGetAPITokensMethod;
    if ((getGetAPITokensMethod = UserServiceGrpc.getGetAPITokensMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetAPITokensMethod = UserServiceGrpc.getGetAPITokensMethod) == null) {
          UserServiceGrpc.getGetAPITokensMethod = getGetAPITokensMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetAPITokensRequest, com.aruna.api.storage.services.v2.GetAPITokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAPITokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetAPITokensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetAPITokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetAPITokens"))
              .build();
        }
      }
    }
    return getGetAPITokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteAPITokenRequest,
      com.aruna.api.storage.services.v2.DeleteAPITokenResponse> getDeleteAPITokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAPIToken",
      requestType = com.aruna.api.storage.services.v2.DeleteAPITokenRequest.class,
      responseType = com.aruna.api.storage.services.v2.DeleteAPITokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteAPITokenRequest,
      com.aruna.api.storage.services.v2.DeleteAPITokenResponse> getDeleteAPITokenMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteAPITokenRequest, com.aruna.api.storage.services.v2.DeleteAPITokenResponse> getDeleteAPITokenMethod;
    if ((getDeleteAPITokenMethod = UserServiceGrpc.getDeleteAPITokenMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteAPITokenMethod = UserServiceGrpc.getDeleteAPITokenMethod) == null) {
          UserServiceGrpc.getDeleteAPITokenMethod = getDeleteAPITokenMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DeleteAPITokenRequest, com.aruna.api.storage.services.v2.DeleteAPITokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAPIToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteAPITokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteAPITokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteAPIToken"))
              .build();
        }
      }
    }
    return getDeleteAPITokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteAPITokensRequest,
      com.aruna.api.storage.services.v2.DeleteAPITokensResponse> getDeleteAPITokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAPITokens",
      requestType = com.aruna.api.storage.services.v2.DeleteAPITokensRequest.class,
      responseType = com.aruna.api.storage.services.v2.DeleteAPITokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteAPITokensRequest,
      com.aruna.api.storage.services.v2.DeleteAPITokensResponse> getDeleteAPITokensMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteAPITokensRequest, com.aruna.api.storage.services.v2.DeleteAPITokensResponse> getDeleteAPITokensMethod;
    if ((getDeleteAPITokensMethod = UserServiceGrpc.getDeleteAPITokensMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteAPITokensMethod = UserServiceGrpc.getDeleteAPITokensMethod) == null) {
          UserServiceGrpc.getDeleteAPITokensMethod = getDeleteAPITokensMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DeleteAPITokensRequest, com.aruna.api.storage.services.v2.DeleteAPITokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAPITokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteAPITokensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteAPITokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteAPITokens"))
              .build();
        }
      }
    }
    return getDeleteAPITokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetUserRequest,
      com.aruna.api.storage.services.v2.GetUserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = com.aruna.api.storage.services.v2.GetUserRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetUserRequest,
      com.aruna.api.storage.services.v2.GetUserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetUserRequest, com.aruna.api.storage.services.v2.GetUserResponse> getGetUserMethod;
    if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
          UserServiceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetUserRequest, com.aruna.api.storage.services.v2.GetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetUserRedactedRequest,
      com.aruna.api.storage.services.v2.GetUserRedactedResponse> getGetUserRedactedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserRedacted",
      requestType = com.aruna.api.storage.services.v2.GetUserRedactedRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetUserRedactedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetUserRedactedRequest,
      com.aruna.api.storage.services.v2.GetUserRedactedResponse> getGetUserRedactedMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetUserRedactedRequest, com.aruna.api.storage.services.v2.GetUserRedactedResponse> getGetUserRedactedMethod;
    if ((getGetUserRedactedMethod = UserServiceGrpc.getGetUserRedactedMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserRedactedMethod = UserServiceGrpc.getGetUserRedactedMethod) == null) {
          UserServiceGrpc.getGetUserRedactedMethod = getGetUserRedactedMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetUserRedactedRequest, com.aruna.api.storage.services.v2.GetUserRedactedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserRedacted"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetUserRedactedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetUserRedactedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUserRedacted"))
              .build();
        }
      }
    }
    return getGetUserRedactedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateUserDisplayNameRequest,
      com.aruna.api.storage.services.v2.UpdateUserDisplayNameResponse> getUpdateUserDisplayNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserDisplayName",
      requestType = com.aruna.api.storage.services.v2.UpdateUserDisplayNameRequest.class,
      responseType = com.aruna.api.storage.services.v2.UpdateUserDisplayNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateUserDisplayNameRequest,
      com.aruna.api.storage.services.v2.UpdateUserDisplayNameResponse> getUpdateUserDisplayNameMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateUserDisplayNameRequest, com.aruna.api.storage.services.v2.UpdateUserDisplayNameResponse> getUpdateUserDisplayNameMethod;
    if ((getUpdateUserDisplayNameMethod = UserServiceGrpc.getUpdateUserDisplayNameMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserDisplayNameMethod = UserServiceGrpc.getUpdateUserDisplayNameMethod) == null) {
          UserServiceGrpc.getUpdateUserDisplayNameMethod = getUpdateUserDisplayNameMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.UpdateUserDisplayNameRequest, com.aruna.api.storage.services.v2.UpdateUserDisplayNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserDisplayName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateUserDisplayNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateUserDisplayNameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateUserDisplayName"))
              .build();
        }
      }
    }
    return getUpdateUserDisplayNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateUserEmailRequest,
      com.aruna.api.storage.services.v2.UpdateUserEmailResponse> getUpdateUserEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserEmail",
      requestType = com.aruna.api.storage.services.v2.UpdateUserEmailRequest.class,
      responseType = com.aruna.api.storage.services.v2.UpdateUserEmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateUserEmailRequest,
      com.aruna.api.storage.services.v2.UpdateUserEmailResponse> getUpdateUserEmailMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.UpdateUserEmailRequest, com.aruna.api.storage.services.v2.UpdateUserEmailResponse> getUpdateUserEmailMethod;
    if ((getUpdateUserEmailMethod = UserServiceGrpc.getUpdateUserEmailMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserEmailMethod = UserServiceGrpc.getUpdateUserEmailMethod) == null) {
          UserServiceGrpc.getUpdateUserEmailMethod = getUpdateUserEmailMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.UpdateUserEmailRequest, com.aruna.api.storage.services.v2.UpdateUserEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateUserEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.UpdateUserEmailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateUserEmail"))
              .build();
        }
      }
    }
    return getUpdateUserEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetNotActivatedUsersRequest,
      com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse> getGetNotActivatedUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNotActivatedUsers",
      requestType = com.aruna.api.storage.services.v2.GetNotActivatedUsersRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetNotActivatedUsersRequest,
      com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse> getGetNotActivatedUsersMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetNotActivatedUsersRequest, com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse> getGetNotActivatedUsersMethod;
    if ((getGetNotActivatedUsersMethod = UserServiceGrpc.getGetNotActivatedUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetNotActivatedUsersMethod = UserServiceGrpc.getGetNotActivatedUsersMethod) == null) {
          UserServiceGrpc.getGetNotActivatedUsersMethod = getGetNotActivatedUsersMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetNotActivatedUsersRequest, com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNotActivatedUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetNotActivatedUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetNotActivatedUsers"))
              .build();
        }
      }
    }
    return getGetNotActivatedUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetAllUsersRequest,
      com.aruna.api.storage.services.v2.GetAllUsersResponse> getGetAllUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllUsers",
      requestType = com.aruna.api.storage.services.v2.GetAllUsersRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetAllUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetAllUsersRequest,
      com.aruna.api.storage.services.v2.GetAllUsersResponse> getGetAllUsersMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetAllUsersRequest, com.aruna.api.storage.services.v2.GetAllUsersResponse> getGetAllUsersMethod;
    if ((getGetAllUsersMethod = UserServiceGrpc.getGetAllUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetAllUsersMethod = UserServiceGrpc.getGetAllUsersMethod) == null) {
          UserServiceGrpc.getGetAllUsersMethod = getGetAllUsersMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetAllUsersRequest, com.aruna.api.storage.services.v2.GetAllUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetAllUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetAllUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetAllUsers"))
              .build();
        }
      }
    }
    return getGetAllUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateS3CredentialsUserTokenRequest,
      com.aruna.api.storage.services.v2.CreateS3CredentialsUserTokenResponse> getCreateS3CredentialsUserTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateS3CredentialsUserToken",
      requestType = com.aruna.api.storage.services.v2.CreateS3CredentialsUserTokenRequest.class,
      responseType = com.aruna.api.storage.services.v2.CreateS3CredentialsUserTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateS3CredentialsUserTokenRequest,
      com.aruna.api.storage.services.v2.CreateS3CredentialsUserTokenResponse> getCreateS3CredentialsUserTokenMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.CreateS3CredentialsUserTokenRequest, com.aruna.api.storage.services.v2.CreateS3CredentialsUserTokenResponse> getCreateS3CredentialsUserTokenMethod;
    if ((getCreateS3CredentialsUserTokenMethod = UserServiceGrpc.getCreateS3CredentialsUserTokenMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateS3CredentialsUserTokenMethod = UserServiceGrpc.getCreateS3CredentialsUserTokenMethod) == null) {
          UserServiceGrpc.getCreateS3CredentialsUserTokenMethod = getCreateS3CredentialsUserTokenMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.CreateS3CredentialsUserTokenRequest, com.aruna.api.storage.services.v2.CreateS3CredentialsUserTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateS3CredentialsUserToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateS3CredentialsUserTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.CreateS3CredentialsUserTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateS3CredentialsUserToken"))
              .build();
        }
      }
    }
    return getCreateS3CredentialsUserTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetS3CredentialsUserTokenRequest,
      com.aruna.api.storage.services.v2.GetS3CredentialsUserTokenResponse> getGetS3CredentialsUserTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetS3CredentialsUserToken",
      requestType = com.aruna.api.storage.services.v2.GetS3CredentialsUserTokenRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetS3CredentialsUserTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetS3CredentialsUserTokenRequest,
      com.aruna.api.storage.services.v2.GetS3CredentialsUserTokenResponse> getGetS3CredentialsUserTokenMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetS3CredentialsUserTokenRequest, com.aruna.api.storage.services.v2.GetS3CredentialsUserTokenResponse> getGetS3CredentialsUserTokenMethod;
    if ((getGetS3CredentialsUserTokenMethod = UserServiceGrpc.getGetS3CredentialsUserTokenMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetS3CredentialsUserTokenMethod = UserServiceGrpc.getGetS3CredentialsUserTokenMethod) == null) {
          UserServiceGrpc.getGetS3CredentialsUserTokenMethod = getGetS3CredentialsUserTokenMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetS3CredentialsUserTokenRequest, com.aruna.api.storage.services.v2.GetS3CredentialsUserTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetS3CredentialsUserToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetS3CredentialsUserTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetS3CredentialsUserTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetS3CredentialsUserToken"))
              .build();
        }
      }
    }
    return getGetS3CredentialsUserTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteS3CredentialsUserTokenRequest,
      com.aruna.api.storage.services.v2.DeleteS3CredentialsUserResponse> getDeleteS3CredentialsUserTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteS3CredentialsUserToken",
      requestType = com.aruna.api.storage.services.v2.DeleteS3CredentialsUserTokenRequest.class,
      responseType = com.aruna.api.storage.services.v2.DeleteS3CredentialsUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteS3CredentialsUserTokenRequest,
      com.aruna.api.storage.services.v2.DeleteS3CredentialsUserResponse> getDeleteS3CredentialsUserTokenMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.DeleteS3CredentialsUserTokenRequest, com.aruna.api.storage.services.v2.DeleteS3CredentialsUserResponse> getDeleteS3CredentialsUserTokenMethod;
    if ((getDeleteS3CredentialsUserTokenMethod = UserServiceGrpc.getDeleteS3CredentialsUserTokenMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteS3CredentialsUserTokenMethod = UserServiceGrpc.getDeleteS3CredentialsUserTokenMethod) == null) {
          UserServiceGrpc.getDeleteS3CredentialsUserTokenMethod = getDeleteS3CredentialsUserTokenMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.DeleteS3CredentialsUserTokenRequest, com.aruna.api.storage.services.v2.DeleteS3CredentialsUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteS3CredentialsUserToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteS3CredentialsUserTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.DeleteS3CredentialsUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteS3CredentialsUserToken"))
              .build();
        }
      }
    }
    return getDeleteS3CredentialsUserTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetDataproxyTokenUserRequest,
      com.aruna.api.storage.services.v2.GetDataproxyTokenUserResponse> getGetDataproxyTokenUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDataproxyTokenUser",
      requestType = com.aruna.api.storage.services.v2.GetDataproxyTokenUserRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetDataproxyTokenUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetDataproxyTokenUserRequest,
      com.aruna.api.storage.services.v2.GetDataproxyTokenUserResponse> getGetDataproxyTokenUserMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetDataproxyTokenUserRequest, com.aruna.api.storage.services.v2.GetDataproxyTokenUserResponse> getGetDataproxyTokenUserMethod;
    if ((getGetDataproxyTokenUserMethod = UserServiceGrpc.getGetDataproxyTokenUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetDataproxyTokenUserMethod = UserServiceGrpc.getGetDataproxyTokenUserMethod) == null) {
          UserServiceGrpc.getGetDataproxyTokenUserMethod = getGetDataproxyTokenUserMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetDataproxyTokenUserRequest, com.aruna.api.storage.services.v2.GetDataproxyTokenUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDataproxyTokenUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetDataproxyTokenUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetDataproxyTokenUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetDataproxyTokenUser"))
              .build();
        }
      }
    }
    return getGetDataproxyTokenUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetPersonalNotificationsRequest,
      com.aruna.api.storage.services.v2.GetPersonalNotificationsResponse> getGetPersonalNotificationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPersonalNotifications",
      requestType = com.aruna.api.storage.services.v2.GetPersonalNotificationsRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetPersonalNotificationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetPersonalNotificationsRequest,
      com.aruna.api.storage.services.v2.GetPersonalNotificationsResponse> getGetPersonalNotificationsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetPersonalNotificationsRequest, com.aruna.api.storage.services.v2.GetPersonalNotificationsResponse> getGetPersonalNotificationsMethod;
    if ((getGetPersonalNotificationsMethod = UserServiceGrpc.getGetPersonalNotificationsMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetPersonalNotificationsMethod = UserServiceGrpc.getGetPersonalNotificationsMethod) == null) {
          UserServiceGrpc.getGetPersonalNotificationsMethod = getGetPersonalNotificationsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetPersonalNotificationsRequest, com.aruna.api.storage.services.v2.GetPersonalNotificationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPersonalNotifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetPersonalNotificationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetPersonalNotificationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetPersonalNotifications"))
              .build();
        }
      }
    }
    return getGetPersonalNotificationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest,
      com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsResponse> getAcknowledgePersonalNotificationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AcknowledgePersonalNotifications",
      requestType = com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest.class,
      responseType = com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest,
      com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsResponse> getAcknowledgePersonalNotificationsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest, com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsResponse> getAcknowledgePersonalNotificationsMethod;
    if ((getAcknowledgePersonalNotificationsMethod = UserServiceGrpc.getAcknowledgePersonalNotificationsMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAcknowledgePersonalNotificationsMethod = UserServiceGrpc.getAcknowledgePersonalNotificationsMethod) == null) {
          UserServiceGrpc.getAcknowledgePersonalNotificationsMethod = getAcknowledgePersonalNotificationsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest, com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AcknowledgePersonalNotifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("AcknowledgePersonalNotifications"))
              .build();
        }
      }
    }
    return getAcknowledgePersonalNotificationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AddOidcProviderRequest,
      com.aruna.api.storage.services.v2.AddOidcProviderResponse> getAddOidcProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddOidcProvider",
      requestType = com.aruna.api.storage.services.v2.AddOidcProviderRequest.class,
      responseType = com.aruna.api.storage.services.v2.AddOidcProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AddOidcProviderRequest,
      com.aruna.api.storage.services.v2.AddOidcProviderResponse> getAddOidcProviderMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AddOidcProviderRequest, com.aruna.api.storage.services.v2.AddOidcProviderResponse> getAddOidcProviderMethod;
    if ((getAddOidcProviderMethod = UserServiceGrpc.getAddOidcProviderMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAddOidcProviderMethod = UserServiceGrpc.getAddOidcProviderMethod) == null) {
          UserServiceGrpc.getAddOidcProviderMethod = getAddOidcProviderMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.AddOidcProviderRequest, com.aruna.api.storage.services.v2.AddOidcProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddOidcProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AddOidcProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AddOidcProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("AddOidcProvider"))
              .build();
        }
      }
    }
    return getAddOidcProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.RemoveOidcProviderRequest,
      com.aruna.api.storage.services.v2.RemoveOidcProviderResponse> getRemoveOidcProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveOidcProvider",
      requestType = com.aruna.api.storage.services.v2.RemoveOidcProviderRequest.class,
      responseType = com.aruna.api.storage.services.v2.RemoveOidcProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.RemoveOidcProviderRequest,
      com.aruna.api.storage.services.v2.RemoveOidcProviderResponse> getRemoveOidcProviderMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.RemoveOidcProviderRequest, com.aruna.api.storage.services.v2.RemoveOidcProviderResponse> getRemoveOidcProviderMethod;
    if ((getRemoveOidcProviderMethod = UserServiceGrpc.getRemoveOidcProviderMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRemoveOidcProviderMethod = UserServiceGrpc.getRemoveOidcProviderMethod) == null) {
          UserServiceGrpc.getRemoveOidcProviderMethod = getRemoveOidcProviderMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.RemoveOidcProviderRequest, com.aruna.api.storage.services.v2.RemoveOidcProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveOidcProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.RemoveOidcProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.RemoveOidcProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("RemoveOidcProvider"))
              .build();
        }
      }
    }
    return getRemoveOidcProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AddPubkeyUserRequest,
      com.aruna.api.storage.services.v2.AddPubkeyUserResponse> getAddPubkeyUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPubkeyUser",
      requestType = com.aruna.api.storage.services.v2.AddPubkeyUserRequest.class,
      responseType = com.aruna.api.storage.services.v2.AddPubkeyUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AddPubkeyUserRequest,
      com.aruna.api.storage.services.v2.AddPubkeyUserResponse> getAddPubkeyUserMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AddPubkeyUserRequest, com.aruna.api.storage.services.v2.AddPubkeyUserResponse> getAddPubkeyUserMethod;
    if ((getAddPubkeyUserMethod = UserServiceGrpc.getAddPubkeyUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAddPubkeyUserMethod = UserServiceGrpc.getAddPubkeyUserMethod) == null) {
          UserServiceGrpc.getAddPubkeyUserMethod = getAddPubkeyUserMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.AddPubkeyUserRequest, com.aruna.api.storage.services.v2.AddPubkeyUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPubkeyUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AddPubkeyUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AddPubkeyUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("AddPubkeyUser"))
              .build();
        }
      }
    }
    return getAddPubkeyUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AddTrustedEndpointsUserRequest,
      com.aruna.api.storage.services.v2.AddTrustedEndpointsUserResponse> getAddTrustedEndpointsUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddTrustedEndpointsUser",
      requestType = com.aruna.api.storage.services.v2.AddTrustedEndpointsUserRequest.class,
      responseType = com.aruna.api.storage.services.v2.AddTrustedEndpointsUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AddTrustedEndpointsUserRequest,
      com.aruna.api.storage.services.v2.AddTrustedEndpointsUserResponse> getAddTrustedEndpointsUserMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AddTrustedEndpointsUserRequest, com.aruna.api.storage.services.v2.AddTrustedEndpointsUserResponse> getAddTrustedEndpointsUserMethod;
    if ((getAddTrustedEndpointsUserMethod = UserServiceGrpc.getAddTrustedEndpointsUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAddTrustedEndpointsUserMethod = UserServiceGrpc.getAddTrustedEndpointsUserMethod) == null) {
          UserServiceGrpc.getAddTrustedEndpointsUserMethod = getAddTrustedEndpointsUserMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.AddTrustedEndpointsUserRequest, com.aruna.api.storage.services.v2.AddTrustedEndpointsUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddTrustedEndpointsUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AddTrustedEndpointsUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AddTrustedEndpointsUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("AddTrustedEndpointsUser"))
              .build();
        }
      }
    }
    return getAddTrustedEndpointsUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.RemoveTrustedEndpointsUserRequest,
      com.aruna.api.storage.services.v2.RemoveTrustedEndpointsUserResponse> getRemoveTrustedEndpointsUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveTrustedEndpointsUser",
      requestType = com.aruna.api.storage.services.v2.RemoveTrustedEndpointsUserRequest.class,
      responseType = com.aruna.api.storage.services.v2.RemoveTrustedEndpointsUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.RemoveTrustedEndpointsUserRequest,
      com.aruna.api.storage.services.v2.RemoveTrustedEndpointsUserResponse> getRemoveTrustedEndpointsUserMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.RemoveTrustedEndpointsUserRequest, com.aruna.api.storage.services.v2.RemoveTrustedEndpointsUserResponse> getRemoveTrustedEndpointsUserMethod;
    if ((getRemoveTrustedEndpointsUserMethod = UserServiceGrpc.getRemoveTrustedEndpointsUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRemoveTrustedEndpointsUserMethod = UserServiceGrpc.getRemoveTrustedEndpointsUserMethod) == null) {
          UserServiceGrpc.getRemoveTrustedEndpointsUserMethod = getRemoveTrustedEndpointsUserMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.RemoveTrustedEndpointsUserRequest, com.aruna.api.storage.services.v2.RemoveTrustedEndpointsUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveTrustedEndpointsUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.RemoveTrustedEndpointsUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.RemoveTrustedEndpointsUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("RemoveTrustedEndpointsUser"))
              .build();
        }
      }
    }
    return getRemoveTrustedEndpointsUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest,
      com.aruna.api.storage.services.v2.AddDataProxyAttributeUserResponse> getAddDataProxyAttributeUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddDataProxyAttributeUser",
      requestType = com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest.class,
      responseType = com.aruna.api.storage.services.v2.AddDataProxyAttributeUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest,
      com.aruna.api.storage.services.v2.AddDataProxyAttributeUserResponse> getAddDataProxyAttributeUserMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest, com.aruna.api.storage.services.v2.AddDataProxyAttributeUserResponse> getAddDataProxyAttributeUserMethod;
    if ((getAddDataProxyAttributeUserMethod = UserServiceGrpc.getAddDataProxyAttributeUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAddDataProxyAttributeUserMethod = UserServiceGrpc.getAddDataProxyAttributeUserMethod) == null) {
          UserServiceGrpc.getAddDataProxyAttributeUserMethod = getAddDataProxyAttributeUserMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest, com.aruna.api.storage.services.v2.AddDataProxyAttributeUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddDataProxyAttributeUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AddDataProxyAttributeUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("AddDataProxyAttributeUser"))
              .build();
        }
      }
    }
    return getAddDataProxyAttributeUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.RemoveDataProxyAttributeUserRequest,
      com.aruna.api.storage.services.v2.RemoveDataProxyAttributeUserResponse> getRemoveDataProxyAttributeUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveDataProxyAttributeUser",
      requestType = com.aruna.api.storage.services.v2.RemoveDataProxyAttributeUserRequest.class,
      responseType = com.aruna.api.storage.services.v2.RemoveDataProxyAttributeUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.RemoveDataProxyAttributeUserRequest,
      com.aruna.api.storage.services.v2.RemoveDataProxyAttributeUserResponse> getRemoveDataProxyAttributeUserMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.RemoveDataProxyAttributeUserRequest, com.aruna.api.storage.services.v2.RemoveDataProxyAttributeUserResponse> getRemoveDataProxyAttributeUserMethod;
    if ((getRemoveDataProxyAttributeUserMethod = UserServiceGrpc.getRemoveDataProxyAttributeUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRemoveDataProxyAttributeUserMethod = UserServiceGrpc.getRemoveDataProxyAttributeUserMethod) == null) {
          UserServiceGrpc.getRemoveDataProxyAttributeUserMethod = getRemoveDataProxyAttributeUserMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.RemoveDataProxyAttributeUserRequest, com.aruna.api.storage.services.v2.RemoveDataProxyAttributeUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveDataProxyAttributeUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.RemoveDataProxyAttributeUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.RemoveDataProxyAttributeUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("RemoveDataProxyAttributeUser"))
              .build();
        }
      }
    }
    return getRemoveDataProxyAttributeUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * UserService
   * Status: BETA
   * Contains all CRUD methods for users and associated resource
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * RegisterUser
     * Status: BETA
     * This request should be called when a new user logs in for the first time
     * </pre>
     */
    default void registerUser(com.aruna.api.storage.services.v2.RegisterUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RegisterUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeActivateUser 
     * Status: BETA
     * This deactivates a specific user (Admin request)
     * </pre>
     */
    default void deactivateUser(com.aruna.api.storage.services.v2.DeactivateUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeactivateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeactivateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * ActivateUser 
     * Status: BETA
     * This activates a specific user (Admin request)
     * </pre>
     */
    default void activateUser(com.aruna.api.storage.services.v2.ActivateUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ActivateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateAPIToken
     * Status: BETA
     * Creates an API token to authenticate
     * </pre>
     */
    default void createAPIToken(com.aruna.api.storage.services.v2.CreateAPITokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateAPITokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAPITokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAPIToken
     * Status: BETA
     * Returns one API token by id
     * </pre>
     */
    default void getAPIToken(com.aruna.api.storage.services.v2.GetAPITokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetAPITokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAPITokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAPITokens
     * Status: STABLE
     * Returns a list of API tokens for a specific user
     * </pre>
     */
    default void getAPITokens(com.aruna.api.storage.services.v2.GetAPITokensRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetAPITokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAPITokensMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAPIToken
     * Status: STABLE
     * Deletes the specified API Token
     * </pre>
     */
    default void deleteAPIToken(com.aruna.api.storage.services.v2.DeleteAPITokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteAPITokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAPITokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAPITokens
     * Status: BETA
     * Deletes the specified API Token
     * </pre>
     */
    default void deleteAPITokens(com.aruna.api.storage.services.v2.DeleteAPITokensRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteAPITokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAPITokensMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUserRequest
     * Status: STABLE
     * This is a request that returns the user information of the
     * current user or if invoked by an admin from another user
     * </pre>
     */
    default void getUser(com.aruna.api.storage.services.v2.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUserRequestRedacted
     * Status: STABLE
     * This is a request that returns the user information of the
     * current user or if invoked by an admin from another user
     * Redacts personal information like name or email
     * </pre>
     */
    default void getUserRedacted(com.aruna.api.storage.services.v2.GetUserRedactedRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetUserRedactedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserRedactedMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateUserDisplayName
     * Status: STABLE
     * Updates the Displayname for the user (Personal only)
     * </pre>
     */
    default void updateUserDisplayName(com.aruna.api.storage.services.v2.UpdateUserDisplayNameRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateUserDisplayNameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserDisplayNameMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateUserDisplayName
     * Status: ALPHA
     * Updates the email for the user (Personal only)
     * </pre>
     */
    default void updateUserEmail(com.aruna.api.storage.services.v2.UpdateUserEmailRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateUserEmailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetNotActivatedUsers
     * Status: STABLE
     * Get all not activated users (Admin only)
     * </pre>
     */
    default void getNotActivatedUsers(com.aruna.api.storage.services.v2.GetNotActivatedUsersRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNotActivatedUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAllUsers
     * Status: ALPHA
     * Get all users including permissions (Admin only)
     * </pre>
     */
    default void getAllUsers(com.aruna.api.storage.services.v2.GetAllUsersRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetAllUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateS3CredentialsUserToken
     * Status: ALPHA
     * Creates or updates S3 credentials for a specific user and data_proxy
     * </pre>
     */
    default void createS3CredentialsUserToken(com.aruna.api.storage.services.v2.CreateS3CredentialsUserTokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateS3CredentialsUserTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateS3CredentialsUserTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetS3CredentialsUserToken
     * Status: ALPHA
     * Gets S3 credentials for a specific token and data_proxy
     * </pre>
     */
    default void getS3CredentialsUserToken(com.aruna.api.storage.services.v2.GetS3CredentialsUserTokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetS3CredentialsUserTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetS3CredentialsUserTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteS3CredentialsUserToken
     * Status: ALPHA
     * Revokes existing S3 credentials for a specific user and data_proxy
     * </pre>
     */
    default void deleteS3CredentialsUserToken(com.aruna.api.storage.services.v2.DeleteS3CredentialsUserTokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteS3CredentialsUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteS3CredentialsUserTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDataproxyToken
     * Status: ALPHA
     * Gets token for a specific user and data_proxy
     * </pre>
     */
    default void getDataproxyTokenUser(com.aruna.api.storage.services.v2.GetDataproxyTokenUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetDataproxyTokenUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDataproxyTokenUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPersonalNotifications
     * Status: ALPHA
     * Fetches personal notifications
     * </pre>
     */
    default void getPersonalNotifications(com.aruna.api.storage.services.v2.GetPersonalNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetPersonalNotificationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPersonalNotificationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AcknowledgePersonalNotifications
     * Status: ALPHA
     * Acknowledges personal notifications
     * </pre>
     */
    default void acknowledgePersonalNotifications(com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAcknowledgePersonalNotificationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddOidcProvider
     * Status: BETA
     * Add alternative oidc login method for user
     * </pre>
     */
    default void addOidcProvider(com.aruna.api.storage.services.v2.AddOidcProviderRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AddOidcProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddOidcProviderMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveOidcProvider
     * Status: BETA
     * Remove alternative oidc login method from user
     * (Only works if user has more than one oidc provider)
     * </pre>
     */
    default void removeOidcProvider(com.aruna.api.storage.services.v2.RemoveOidcProviderRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RemoveOidcProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveOidcProviderMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddPubkeyUser
     * Status: ALPHA
     * Adds an ED25519 public key for the user
     * </pre>
     */
    default void addPubkeyUser(com.aruna.api.storage.services.v2.AddPubkeyUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AddPubkeyUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPubkeyUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddTrustedEndpointsUser
     * Status: ALPHA
     * Adds an endpoint to the trusted endpoints list of the user
     * </pre>
     */
    default void addTrustedEndpointsUser(com.aruna.api.storage.services.v2.AddTrustedEndpointsUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AddTrustedEndpointsUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddTrustedEndpointsUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveTrustedEndpointsUser
     * Status: ALPHA
     * Removes an endpoint from the trusted endpoints list of the user
     * </pre>
     */
    default void removeTrustedEndpointsUser(com.aruna.api.storage.services.v2.RemoveTrustedEndpointsUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RemoveTrustedEndpointsUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveTrustedEndpointsUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddDataProxyAttributeUser
     * Status: ALPHA
     * Adds an data proxy specific attribute to the user
     * </pre>
     */
    default void addDataProxyAttributeUser(com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AddDataProxyAttributeUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddDataProxyAttributeUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveDataProxyAttributeUser
     * Status: ALPHA
     * Removes an data proxy specific attribute from the user
     * </pre>
     */
    default void removeDataProxyAttributeUser(com.aruna.api.storage.services.v2.RemoveDataProxyAttributeUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RemoveDataProxyAttributeUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveDataProxyAttributeUserMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserService.
   * <pre>
   * UserService
   * Status: BETA
   * Contains all CRUD methods for users and associated resource
   * </pre>
   */
  public static abstract class UserServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserService.
   * <pre>
   * UserService
   * Status: BETA
   * Contains all CRUD methods for users and associated resource
   * </pre>
   */
  public static final class UserServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * RegisterUser
     * Status: BETA
     * This request should be called when a new user logs in for the first time
     * </pre>
     */
    public void registerUser(com.aruna.api.storage.services.v2.RegisterUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RegisterUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeActivateUser 
     * Status: BETA
     * This deactivates a specific user (Admin request)
     * </pre>
     */
    public void deactivateUser(com.aruna.api.storage.services.v2.DeactivateUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeactivateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeactivateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ActivateUser 
     * Status: BETA
     * This activates a specific user (Admin request)
     * </pre>
     */
    public void activateUser(com.aruna.api.storage.services.v2.ActivateUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ActivateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateAPIToken
     * Status: BETA
     * Creates an API token to authenticate
     * </pre>
     */
    public void createAPIToken(com.aruna.api.storage.services.v2.CreateAPITokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateAPITokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAPITokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAPIToken
     * Status: BETA
     * Returns one API token by id
     * </pre>
     */
    public void getAPIToken(com.aruna.api.storage.services.v2.GetAPITokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetAPITokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAPITokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAPITokens
     * Status: STABLE
     * Returns a list of API tokens for a specific user
     * </pre>
     */
    public void getAPITokens(com.aruna.api.storage.services.v2.GetAPITokensRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetAPITokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAPITokensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteAPIToken
     * Status: STABLE
     * Deletes the specified API Token
     * </pre>
     */
    public void deleteAPIToken(com.aruna.api.storage.services.v2.DeleteAPITokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteAPITokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAPITokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteAPITokens
     * Status: BETA
     * Deletes the specified API Token
     * </pre>
     */
    public void deleteAPITokens(com.aruna.api.storage.services.v2.DeleteAPITokensRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteAPITokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAPITokensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUserRequest
     * Status: STABLE
     * This is a request that returns the user information of the
     * current user or if invoked by an admin from another user
     * </pre>
     */
    public void getUser(com.aruna.api.storage.services.v2.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUserRequestRedacted
     * Status: STABLE
     * This is a request that returns the user information of the
     * current user or if invoked by an admin from another user
     * Redacts personal information like name or email
     * </pre>
     */
    public void getUserRedacted(com.aruna.api.storage.services.v2.GetUserRedactedRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetUserRedactedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserRedactedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateUserDisplayName
     * Status: STABLE
     * Updates the Displayname for the user (Personal only)
     * </pre>
     */
    public void updateUserDisplayName(com.aruna.api.storage.services.v2.UpdateUserDisplayNameRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateUserDisplayNameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserDisplayNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateUserDisplayName
     * Status: ALPHA
     * Updates the email for the user (Personal only)
     * </pre>
     */
    public void updateUserEmail(com.aruna.api.storage.services.v2.UpdateUserEmailRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateUserEmailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetNotActivatedUsers
     * Status: STABLE
     * Get all not activated users (Admin only)
     * </pre>
     */
    public void getNotActivatedUsers(com.aruna.api.storage.services.v2.GetNotActivatedUsersRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNotActivatedUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAllUsers
     * Status: ALPHA
     * Get all users including permissions (Admin only)
     * </pre>
     */
    public void getAllUsers(com.aruna.api.storage.services.v2.GetAllUsersRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetAllUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateS3CredentialsUserToken
     * Status: ALPHA
     * Creates or updates S3 credentials for a specific user and data_proxy
     * </pre>
     */
    public void createS3CredentialsUserToken(com.aruna.api.storage.services.v2.CreateS3CredentialsUserTokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateS3CredentialsUserTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateS3CredentialsUserTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetS3CredentialsUserToken
     * Status: ALPHA
     * Gets S3 credentials for a specific token and data_proxy
     * </pre>
     */
    public void getS3CredentialsUserToken(com.aruna.api.storage.services.v2.GetS3CredentialsUserTokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetS3CredentialsUserTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetS3CredentialsUserTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteS3CredentialsUserToken
     * Status: ALPHA
     * Revokes existing S3 credentials for a specific user and data_proxy
     * </pre>
     */
    public void deleteS3CredentialsUserToken(com.aruna.api.storage.services.v2.DeleteS3CredentialsUserTokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteS3CredentialsUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteS3CredentialsUserTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDataproxyToken
     * Status: ALPHA
     * Gets token for a specific user and data_proxy
     * </pre>
     */
    public void getDataproxyTokenUser(com.aruna.api.storage.services.v2.GetDataproxyTokenUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetDataproxyTokenUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDataproxyTokenUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetPersonalNotifications
     * Status: ALPHA
     * Fetches personal notifications
     * </pre>
     */
    public void getPersonalNotifications(com.aruna.api.storage.services.v2.GetPersonalNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetPersonalNotificationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPersonalNotificationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AcknowledgePersonalNotifications
     * Status: ALPHA
     * Acknowledges personal notifications
     * </pre>
     */
    public void acknowledgePersonalNotifications(com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAcknowledgePersonalNotificationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddOidcProvider
     * Status: BETA
     * Add alternative oidc login method for user
     * </pre>
     */
    public void addOidcProvider(com.aruna.api.storage.services.v2.AddOidcProviderRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AddOidcProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddOidcProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveOidcProvider
     * Status: BETA
     * Remove alternative oidc login method from user
     * (Only works if user has more than one oidc provider)
     * </pre>
     */
    public void removeOidcProvider(com.aruna.api.storage.services.v2.RemoveOidcProviderRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RemoveOidcProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveOidcProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddPubkeyUser
     * Status: ALPHA
     * Adds an ED25519 public key for the user
     * </pre>
     */
    public void addPubkeyUser(com.aruna.api.storage.services.v2.AddPubkeyUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AddPubkeyUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPubkeyUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddTrustedEndpointsUser
     * Status: ALPHA
     * Adds an endpoint to the trusted endpoints list of the user
     * </pre>
     */
    public void addTrustedEndpointsUser(com.aruna.api.storage.services.v2.AddTrustedEndpointsUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AddTrustedEndpointsUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddTrustedEndpointsUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveTrustedEndpointsUser
     * Status: ALPHA
     * Removes an endpoint from the trusted endpoints list of the user
     * </pre>
     */
    public void removeTrustedEndpointsUser(com.aruna.api.storage.services.v2.RemoveTrustedEndpointsUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RemoveTrustedEndpointsUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveTrustedEndpointsUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddDataProxyAttributeUser
     * Status: ALPHA
     * Adds an data proxy specific attribute to the user
     * </pre>
     */
    public void addDataProxyAttributeUser(com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AddDataProxyAttributeUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddDataProxyAttributeUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveDataProxyAttributeUser
     * Status: ALPHA
     * Removes an data proxy specific attribute from the user
     * </pre>
     */
    public void removeDataProxyAttributeUser(com.aruna.api.storage.services.v2.RemoveDataProxyAttributeUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RemoveDataProxyAttributeUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveDataProxyAttributeUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserService.
   * <pre>
   * UserService
   * Status: BETA
   * Contains all CRUD methods for users and associated resource
   * </pre>
   */
  public static final class UserServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RegisterUser
     * Status: BETA
     * This request should be called when a new user logs in for the first time
     * </pre>
     */
    public com.aruna.api.storage.services.v2.RegisterUserResponse registerUser(com.aruna.api.storage.services.v2.RegisterUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeActivateUser 
     * Status: BETA
     * This deactivates a specific user (Admin request)
     * </pre>
     */
    public com.aruna.api.storage.services.v2.DeactivateUserResponse deactivateUser(com.aruna.api.storage.services.v2.DeactivateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeactivateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ActivateUser 
     * Status: BETA
     * This activates a specific user (Admin request)
     * </pre>
     */
    public com.aruna.api.storage.services.v2.ActivateUserResponse activateUser(com.aruna.api.storage.services.v2.ActivateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateAPIToken
     * Status: BETA
     * Creates an API token to authenticate
     * </pre>
     */
    public com.aruna.api.storage.services.v2.CreateAPITokenResponse createAPIToken(com.aruna.api.storage.services.v2.CreateAPITokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAPITokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAPIToken
     * Status: BETA
     * Returns one API token by id
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetAPITokenResponse getAPIToken(com.aruna.api.storage.services.v2.GetAPITokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAPITokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAPITokens
     * Status: STABLE
     * Returns a list of API tokens for a specific user
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetAPITokensResponse getAPITokens(com.aruna.api.storage.services.v2.GetAPITokensRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAPITokensMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAPIToken
     * Status: STABLE
     * Deletes the specified API Token
     * </pre>
     */
    public com.aruna.api.storage.services.v2.DeleteAPITokenResponse deleteAPIToken(com.aruna.api.storage.services.v2.DeleteAPITokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAPITokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAPITokens
     * Status: BETA
     * Deletes the specified API Token
     * </pre>
     */
    public com.aruna.api.storage.services.v2.DeleteAPITokensResponse deleteAPITokens(com.aruna.api.storage.services.v2.DeleteAPITokensRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAPITokensMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUserRequest
     * Status: STABLE
     * This is a request that returns the user information of the
     * current user or if invoked by an admin from another user
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetUserResponse getUser(com.aruna.api.storage.services.v2.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUserRequestRedacted
     * Status: STABLE
     * This is a request that returns the user information of the
     * current user or if invoked by an admin from another user
     * Redacts personal information like name or email
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetUserRedactedResponse getUserRedacted(com.aruna.api.storage.services.v2.GetUserRedactedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserRedactedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateUserDisplayName
     * Status: STABLE
     * Updates the Displayname for the user (Personal only)
     * </pre>
     */
    public com.aruna.api.storage.services.v2.UpdateUserDisplayNameResponse updateUserDisplayName(com.aruna.api.storage.services.v2.UpdateUserDisplayNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserDisplayNameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateUserDisplayName
     * Status: ALPHA
     * Updates the email for the user (Personal only)
     * </pre>
     */
    public com.aruna.api.storage.services.v2.UpdateUserEmailResponse updateUserEmail(com.aruna.api.storage.services.v2.UpdateUserEmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetNotActivatedUsers
     * Status: STABLE
     * Get all not activated users (Admin only)
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse getNotActivatedUsers(com.aruna.api.storage.services.v2.GetNotActivatedUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNotActivatedUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAllUsers
     * Status: ALPHA
     * Get all users including permissions (Admin only)
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetAllUsersResponse getAllUsers(com.aruna.api.storage.services.v2.GetAllUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateS3CredentialsUserToken
     * Status: ALPHA
     * Creates or updates S3 credentials for a specific user and data_proxy
     * </pre>
     */
    public com.aruna.api.storage.services.v2.CreateS3CredentialsUserTokenResponse createS3CredentialsUserToken(com.aruna.api.storage.services.v2.CreateS3CredentialsUserTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateS3CredentialsUserTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetS3CredentialsUserToken
     * Status: ALPHA
     * Gets S3 credentials for a specific token and data_proxy
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetS3CredentialsUserTokenResponse getS3CredentialsUserToken(com.aruna.api.storage.services.v2.GetS3CredentialsUserTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetS3CredentialsUserTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteS3CredentialsUserToken
     * Status: ALPHA
     * Revokes existing S3 credentials for a specific user and data_proxy
     * </pre>
     */
    public com.aruna.api.storage.services.v2.DeleteS3CredentialsUserResponse deleteS3CredentialsUserToken(com.aruna.api.storage.services.v2.DeleteS3CredentialsUserTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteS3CredentialsUserTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDataproxyToken
     * Status: ALPHA
     * Gets token for a specific user and data_proxy
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetDataproxyTokenUserResponse getDataproxyTokenUser(com.aruna.api.storage.services.v2.GetDataproxyTokenUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDataproxyTokenUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPersonalNotifications
     * Status: ALPHA
     * Fetches personal notifications
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetPersonalNotificationsResponse getPersonalNotifications(com.aruna.api.storage.services.v2.GetPersonalNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPersonalNotificationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AcknowledgePersonalNotifications
     * Status: ALPHA
     * Acknowledges personal notifications
     * </pre>
     */
    public com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsResponse acknowledgePersonalNotifications(com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAcknowledgePersonalNotificationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddOidcProvider
     * Status: BETA
     * Add alternative oidc login method for user
     * </pre>
     */
    public com.aruna.api.storage.services.v2.AddOidcProviderResponse addOidcProvider(com.aruna.api.storage.services.v2.AddOidcProviderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddOidcProviderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveOidcProvider
     * Status: BETA
     * Remove alternative oidc login method from user
     * (Only works if user has more than one oidc provider)
     * </pre>
     */
    public com.aruna.api.storage.services.v2.RemoveOidcProviderResponse removeOidcProvider(com.aruna.api.storage.services.v2.RemoveOidcProviderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveOidcProviderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddPubkeyUser
     * Status: ALPHA
     * Adds an ED25519 public key for the user
     * </pre>
     */
    public com.aruna.api.storage.services.v2.AddPubkeyUserResponse addPubkeyUser(com.aruna.api.storage.services.v2.AddPubkeyUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPubkeyUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddTrustedEndpointsUser
     * Status: ALPHA
     * Adds an endpoint to the trusted endpoints list of the user
     * </pre>
     */
    public com.aruna.api.storage.services.v2.AddTrustedEndpointsUserResponse addTrustedEndpointsUser(com.aruna.api.storage.services.v2.AddTrustedEndpointsUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddTrustedEndpointsUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveTrustedEndpointsUser
     * Status: ALPHA
     * Removes an endpoint from the trusted endpoints list of the user
     * </pre>
     */
    public com.aruna.api.storage.services.v2.RemoveTrustedEndpointsUserResponse removeTrustedEndpointsUser(com.aruna.api.storage.services.v2.RemoveTrustedEndpointsUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveTrustedEndpointsUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddDataProxyAttributeUser
     * Status: ALPHA
     * Adds an data proxy specific attribute to the user
     * </pre>
     */
    public com.aruna.api.storage.services.v2.AddDataProxyAttributeUserResponse addDataProxyAttributeUser(com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddDataProxyAttributeUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveDataProxyAttributeUser
     * Status: ALPHA
     * Removes an data proxy specific attribute from the user
     * </pre>
     */
    public com.aruna.api.storage.services.v2.RemoveDataProxyAttributeUserResponse removeDataProxyAttributeUser(com.aruna.api.storage.services.v2.RemoveDataProxyAttributeUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveDataProxyAttributeUserMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserService.
   * <pre>
   * UserService
   * Status: BETA
   * Contains all CRUD methods for users and associated resource
   * </pre>
   */
  public static final class UserServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RegisterUser
     * Status: BETA
     * This request should be called when a new user logs in for the first time
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.RegisterUserResponse> registerUser(
        com.aruna.api.storage.services.v2.RegisterUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeActivateUser 
     * Status: BETA
     * This deactivates a specific user (Admin request)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DeactivateUserResponse> deactivateUser(
        com.aruna.api.storage.services.v2.DeactivateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeactivateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ActivateUser 
     * Status: BETA
     * This activates a specific user (Admin request)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.ActivateUserResponse> activateUser(
        com.aruna.api.storage.services.v2.ActivateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateAPIToken
     * Status: BETA
     * Creates an API token to authenticate
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.CreateAPITokenResponse> createAPIToken(
        com.aruna.api.storage.services.v2.CreateAPITokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAPITokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAPIToken
     * Status: BETA
     * Returns one API token by id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetAPITokenResponse> getAPIToken(
        com.aruna.api.storage.services.v2.GetAPITokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAPITokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAPITokens
     * Status: STABLE
     * Returns a list of API tokens for a specific user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetAPITokensResponse> getAPITokens(
        com.aruna.api.storage.services.v2.GetAPITokensRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAPITokensMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteAPIToken
     * Status: STABLE
     * Deletes the specified API Token
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DeleteAPITokenResponse> deleteAPIToken(
        com.aruna.api.storage.services.v2.DeleteAPITokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAPITokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteAPITokens
     * Status: BETA
     * Deletes the specified API Token
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DeleteAPITokensResponse> deleteAPITokens(
        com.aruna.api.storage.services.v2.DeleteAPITokensRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAPITokensMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUserRequest
     * Status: STABLE
     * This is a request that returns the user information of the
     * current user or if invoked by an admin from another user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetUserResponse> getUser(
        com.aruna.api.storage.services.v2.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUserRequestRedacted
     * Status: STABLE
     * This is a request that returns the user information of the
     * current user or if invoked by an admin from another user
     * Redacts personal information like name or email
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetUserRedactedResponse> getUserRedacted(
        com.aruna.api.storage.services.v2.GetUserRedactedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserRedactedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateUserDisplayName
     * Status: STABLE
     * Updates the Displayname for the user (Personal only)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.UpdateUserDisplayNameResponse> updateUserDisplayName(
        com.aruna.api.storage.services.v2.UpdateUserDisplayNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserDisplayNameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateUserDisplayName
     * Status: ALPHA
     * Updates the email for the user (Personal only)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.UpdateUserEmailResponse> updateUserEmail(
        com.aruna.api.storage.services.v2.UpdateUserEmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetNotActivatedUsers
     * Status: STABLE
     * Get all not activated users (Admin only)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse> getNotActivatedUsers(
        com.aruna.api.storage.services.v2.GetNotActivatedUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNotActivatedUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAllUsers
     * Status: ALPHA
     * Get all users including permissions (Admin only)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetAllUsersResponse> getAllUsers(
        com.aruna.api.storage.services.v2.GetAllUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateS3CredentialsUserToken
     * Status: ALPHA
     * Creates or updates S3 credentials for a specific user and data_proxy
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.CreateS3CredentialsUserTokenResponse> createS3CredentialsUserToken(
        com.aruna.api.storage.services.v2.CreateS3CredentialsUserTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateS3CredentialsUserTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetS3CredentialsUserToken
     * Status: ALPHA
     * Gets S3 credentials for a specific token and data_proxy
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetS3CredentialsUserTokenResponse> getS3CredentialsUserToken(
        com.aruna.api.storage.services.v2.GetS3CredentialsUserTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetS3CredentialsUserTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteS3CredentialsUserToken
     * Status: ALPHA
     * Revokes existing S3 credentials for a specific user and data_proxy
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.DeleteS3CredentialsUserResponse> deleteS3CredentialsUserToken(
        com.aruna.api.storage.services.v2.DeleteS3CredentialsUserTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteS3CredentialsUserTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDataproxyToken
     * Status: ALPHA
     * Gets token for a specific user and data_proxy
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetDataproxyTokenUserResponse> getDataproxyTokenUser(
        com.aruna.api.storage.services.v2.GetDataproxyTokenUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDataproxyTokenUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetPersonalNotifications
     * Status: ALPHA
     * Fetches personal notifications
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetPersonalNotificationsResponse> getPersonalNotifications(
        com.aruna.api.storage.services.v2.GetPersonalNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPersonalNotificationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AcknowledgePersonalNotifications
     * Status: ALPHA
     * Acknowledges personal notifications
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsResponse> acknowledgePersonalNotifications(
        com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAcknowledgePersonalNotificationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddOidcProvider
     * Status: BETA
     * Add alternative oidc login method for user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.AddOidcProviderResponse> addOidcProvider(
        com.aruna.api.storage.services.v2.AddOidcProviderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddOidcProviderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveOidcProvider
     * Status: BETA
     * Remove alternative oidc login method from user
     * (Only works if user has more than one oidc provider)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.RemoveOidcProviderResponse> removeOidcProvider(
        com.aruna.api.storage.services.v2.RemoveOidcProviderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveOidcProviderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddPubkeyUser
     * Status: ALPHA
     * Adds an ED25519 public key for the user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.AddPubkeyUserResponse> addPubkeyUser(
        com.aruna.api.storage.services.v2.AddPubkeyUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPubkeyUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddTrustedEndpointsUser
     * Status: ALPHA
     * Adds an endpoint to the trusted endpoints list of the user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.AddTrustedEndpointsUserResponse> addTrustedEndpointsUser(
        com.aruna.api.storage.services.v2.AddTrustedEndpointsUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddTrustedEndpointsUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveTrustedEndpointsUser
     * Status: ALPHA
     * Removes an endpoint from the trusted endpoints list of the user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.RemoveTrustedEndpointsUserResponse> removeTrustedEndpointsUser(
        com.aruna.api.storage.services.v2.RemoveTrustedEndpointsUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveTrustedEndpointsUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddDataProxyAttributeUser
     * Status: ALPHA
     * Adds an data proxy specific attribute to the user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.AddDataProxyAttributeUserResponse> addDataProxyAttributeUser(
        com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddDataProxyAttributeUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveDataProxyAttributeUser
     * Status: ALPHA
     * Removes an data proxy specific attribute from the user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.RemoveDataProxyAttributeUserResponse> removeDataProxyAttributeUser(
        com.aruna.api.storage.services.v2.RemoveDataProxyAttributeUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveDataProxyAttributeUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_USER = 0;
  private static final int METHODID_DEACTIVATE_USER = 1;
  private static final int METHODID_ACTIVATE_USER = 2;
  private static final int METHODID_CREATE_APITOKEN = 3;
  private static final int METHODID_GET_APITOKEN = 4;
  private static final int METHODID_GET_APITOKENS = 5;
  private static final int METHODID_DELETE_APITOKEN = 6;
  private static final int METHODID_DELETE_APITOKENS = 7;
  private static final int METHODID_GET_USER = 8;
  private static final int METHODID_GET_USER_REDACTED = 9;
  private static final int METHODID_UPDATE_USER_DISPLAY_NAME = 10;
  private static final int METHODID_UPDATE_USER_EMAIL = 11;
  private static final int METHODID_GET_NOT_ACTIVATED_USERS = 12;
  private static final int METHODID_GET_ALL_USERS = 13;
  private static final int METHODID_CREATE_S3CREDENTIALS_USER_TOKEN = 14;
  private static final int METHODID_GET_S3CREDENTIALS_USER_TOKEN = 15;
  private static final int METHODID_DELETE_S3CREDENTIALS_USER_TOKEN = 16;
  private static final int METHODID_GET_DATAPROXY_TOKEN_USER = 17;
  private static final int METHODID_GET_PERSONAL_NOTIFICATIONS = 18;
  private static final int METHODID_ACKNOWLEDGE_PERSONAL_NOTIFICATIONS = 19;
  private static final int METHODID_ADD_OIDC_PROVIDER = 20;
  private static final int METHODID_REMOVE_OIDC_PROVIDER = 21;
  private static final int METHODID_ADD_PUBKEY_USER = 22;
  private static final int METHODID_ADD_TRUSTED_ENDPOINTS_USER = 23;
  private static final int METHODID_REMOVE_TRUSTED_ENDPOINTS_USER = 24;
  private static final int METHODID_ADD_DATA_PROXY_ATTRIBUTE_USER = 25;
  private static final int METHODID_REMOVE_DATA_PROXY_ATTRIBUTE_USER = 26;

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
        case METHODID_REGISTER_USER:
          serviceImpl.registerUser((com.aruna.api.storage.services.v2.RegisterUserRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RegisterUserResponse>) responseObserver);
          break;
        case METHODID_DEACTIVATE_USER:
          serviceImpl.deactivateUser((com.aruna.api.storage.services.v2.DeactivateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeactivateUserResponse>) responseObserver);
          break;
        case METHODID_ACTIVATE_USER:
          serviceImpl.activateUser((com.aruna.api.storage.services.v2.ActivateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.ActivateUserResponse>) responseObserver);
          break;
        case METHODID_CREATE_APITOKEN:
          serviceImpl.createAPIToken((com.aruna.api.storage.services.v2.CreateAPITokenRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateAPITokenResponse>) responseObserver);
          break;
        case METHODID_GET_APITOKEN:
          serviceImpl.getAPIToken((com.aruna.api.storage.services.v2.GetAPITokenRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetAPITokenResponse>) responseObserver);
          break;
        case METHODID_GET_APITOKENS:
          serviceImpl.getAPITokens((com.aruna.api.storage.services.v2.GetAPITokensRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetAPITokensResponse>) responseObserver);
          break;
        case METHODID_DELETE_APITOKEN:
          serviceImpl.deleteAPIToken((com.aruna.api.storage.services.v2.DeleteAPITokenRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteAPITokenResponse>) responseObserver);
          break;
        case METHODID_DELETE_APITOKENS:
          serviceImpl.deleteAPITokens((com.aruna.api.storage.services.v2.DeleteAPITokensRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteAPITokensResponse>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((com.aruna.api.storage.services.v2.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetUserResponse>) responseObserver);
          break;
        case METHODID_GET_USER_REDACTED:
          serviceImpl.getUserRedacted((com.aruna.api.storage.services.v2.GetUserRedactedRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetUserRedactedResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_DISPLAY_NAME:
          serviceImpl.updateUserDisplayName((com.aruna.api.storage.services.v2.UpdateUserDisplayNameRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateUserDisplayNameResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_EMAIL:
          serviceImpl.updateUserEmail((com.aruna.api.storage.services.v2.UpdateUserEmailRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.UpdateUserEmailResponse>) responseObserver);
          break;
        case METHODID_GET_NOT_ACTIVATED_USERS:
          serviceImpl.getNotActivatedUsers((com.aruna.api.storage.services.v2.GetNotActivatedUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_USERS:
          serviceImpl.getAllUsers((com.aruna.api.storage.services.v2.GetAllUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetAllUsersResponse>) responseObserver);
          break;
        case METHODID_CREATE_S3CREDENTIALS_USER_TOKEN:
          serviceImpl.createS3CredentialsUserToken((com.aruna.api.storage.services.v2.CreateS3CredentialsUserTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.CreateS3CredentialsUserTokenResponse>) responseObserver);
          break;
        case METHODID_GET_S3CREDENTIALS_USER_TOKEN:
          serviceImpl.getS3CredentialsUserToken((com.aruna.api.storage.services.v2.GetS3CredentialsUserTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetS3CredentialsUserTokenResponse>) responseObserver);
          break;
        case METHODID_DELETE_S3CREDENTIALS_USER_TOKEN:
          serviceImpl.deleteS3CredentialsUserToken((com.aruna.api.storage.services.v2.DeleteS3CredentialsUserTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.DeleteS3CredentialsUserResponse>) responseObserver);
          break;
        case METHODID_GET_DATAPROXY_TOKEN_USER:
          serviceImpl.getDataproxyTokenUser((com.aruna.api.storage.services.v2.GetDataproxyTokenUserRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetDataproxyTokenUserResponse>) responseObserver);
          break;
        case METHODID_GET_PERSONAL_NOTIFICATIONS:
          serviceImpl.getPersonalNotifications((com.aruna.api.storage.services.v2.GetPersonalNotificationsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetPersonalNotificationsResponse>) responseObserver);
          break;
        case METHODID_ACKNOWLEDGE_PERSONAL_NOTIFICATIONS:
          serviceImpl.acknowledgePersonalNotifications((com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsResponse>) responseObserver);
          break;
        case METHODID_ADD_OIDC_PROVIDER:
          serviceImpl.addOidcProvider((com.aruna.api.storage.services.v2.AddOidcProviderRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AddOidcProviderResponse>) responseObserver);
          break;
        case METHODID_REMOVE_OIDC_PROVIDER:
          serviceImpl.removeOidcProvider((com.aruna.api.storage.services.v2.RemoveOidcProviderRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RemoveOidcProviderResponse>) responseObserver);
          break;
        case METHODID_ADD_PUBKEY_USER:
          serviceImpl.addPubkeyUser((com.aruna.api.storage.services.v2.AddPubkeyUserRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AddPubkeyUserResponse>) responseObserver);
          break;
        case METHODID_ADD_TRUSTED_ENDPOINTS_USER:
          serviceImpl.addTrustedEndpointsUser((com.aruna.api.storage.services.v2.AddTrustedEndpointsUserRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AddTrustedEndpointsUserResponse>) responseObserver);
          break;
        case METHODID_REMOVE_TRUSTED_ENDPOINTS_USER:
          serviceImpl.removeTrustedEndpointsUser((com.aruna.api.storage.services.v2.RemoveTrustedEndpointsUserRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RemoveTrustedEndpointsUserResponse>) responseObserver);
          break;
        case METHODID_ADD_DATA_PROXY_ATTRIBUTE_USER:
          serviceImpl.addDataProxyAttributeUser((com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AddDataProxyAttributeUserResponse>) responseObserver);
          break;
        case METHODID_REMOVE_DATA_PROXY_ATTRIBUTE_USER:
          serviceImpl.removeDataProxyAttributeUser((com.aruna.api.storage.services.v2.RemoveDataProxyAttributeUserRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RemoveDataProxyAttributeUserResponse>) responseObserver);
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
          getRegisterUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.RegisterUserRequest,
              com.aruna.api.storage.services.v2.RegisterUserResponse>(
                service, METHODID_REGISTER_USER)))
        .addMethod(
          getDeactivateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DeactivateUserRequest,
              com.aruna.api.storage.services.v2.DeactivateUserResponse>(
                service, METHODID_DEACTIVATE_USER)))
        .addMethod(
          getActivateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.ActivateUserRequest,
              com.aruna.api.storage.services.v2.ActivateUserResponse>(
                service, METHODID_ACTIVATE_USER)))
        .addMethod(
          getCreateAPITokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.CreateAPITokenRequest,
              com.aruna.api.storage.services.v2.CreateAPITokenResponse>(
                service, METHODID_CREATE_APITOKEN)))
        .addMethod(
          getGetAPITokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetAPITokenRequest,
              com.aruna.api.storage.services.v2.GetAPITokenResponse>(
                service, METHODID_GET_APITOKEN)))
        .addMethod(
          getGetAPITokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetAPITokensRequest,
              com.aruna.api.storage.services.v2.GetAPITokensResponse>(
                service, METHODID_GET_APITOKENS)))
        .addMethod(
          getDeleteAPITokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DeleteAPITokenRequest,
              com.aruna.api.storage.services.v2.DeleteAPITokenResponse>(
                service, METHODID_DELETE_APITOKEN)))
        .addMethod(
          getDeleteAPITokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DeleteAPITokensRequest,
              com.aruna.api.storage.services.v2.DeleteAPITokensResponse>(
                service, METHODID_DELETE_APITOKENS)))
        .addMethod(
          getGetUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetUserRequest,
              com.aruna.api.storage.services.v2.GetUserResponse>(
                service, METHODID_GET_USER)))
        .addMethod(
          getGetUserRedactedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetUserRedactedRequest,
              com.aruna.api.storage.services.v2.GetUserRedactedResponse>(
                service, METHODID_GET_USER_REDACTED)))
        .addMethod(
          getUpdateUserDisplayNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.UpdateUserDisplayNameRequest,
              com.aruna.api.storage.services.v2.UpdateUserDisplayNameResponse>(
                service, METHODID_UPDATE_USER_DISPLAY_NAME)))
        .addMethod(
          getUpdateUserEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.UpdateUserEmailRequest,
              com.aruna.api.storage.services.v2.UpdateUserEmailResponse>(
                service, METHODID_UPDATE_USER_EMAIL)))
        .addMethod(
          getGetNotActivatedUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetNotActivatedUsersRequest,
              com.aruna.api.storage.services.v2.GetNotActivatedUsersResponse>(
                service, METHODID_GET_NOT_ACTIVATED_USERS)))
        .addMethod(
          getGetAllUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetAllUsersRequest,
              com.aruna.api.storage.services.v2.GetAllUsersResponse>(
                service, METHODID_GET_ALL_USERS)))
        .addMethod(
          getCreateS3CredentialsUserTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.CreateS3CredentialsUserTokenRequest,
              com.aruna.api.storage.services.v2.CreateS3CredentialsUserTokenResponse>(
                service, METHODID_CREATE_S3CREDENTIALS_USER_TOKEN)))
        .addMethod(
          getGetS3CredentialsUserTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetS3CredentialsUserTokenRequest,
              com.aruna.api.storage.services.v2.GetS3CredentialsUserTokenResponse>(
                service, METHODID_GET_S3CREDENTIALS_USER_TOKEN)))
        .addMethod(
          getDeleteS3CredentialsUserTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.DeleteS3CredentialsUserTokenRequest,
              com.aruna.api.storage.services.v2.DeleteS3CredentialsUserResponse>(
                service, METHODID_DELETE_S3CREDENTIALS_USER_TOKEN)))
        .addMethod(
          getGetDataproxyTokenUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetDataproxyTokenUserRequest,
              com.aruna.api.storage.services.v2.GetDataproxyTokenUserResponse>(
                service, METHODID_GET_DATAPROXY_TOKEN_USER)))
        .addMethod(
          getGetPersonalNotificationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetPersonalNotificationsRequest,
              com.aruna.api.storage.services.v2.GetPersonalNotificationsResponse>(
                service, METHODID_GET_PERSONAL_NOTIFICATIONS)))
        .addMethod(
          getAcknowledgePersonalNotificationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsRequest,
              com.aruna.api.storage.services.v2.AcknowledgePersonalNotificationsResponse>(
                service, METHODID_ACKNOWLEDGE_PERSONAL_NOTIFICATIONS)))
        .addMethod(
          getAddOidcProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.AddOidcProviderRequest,
              com.aruna.api.storage.services.v2.AddOidcProviderResponse>(
                service, METHODID_ADD_OIDC_PROVIDER)))
        .addMethod(
          getRemoveOidcProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.RemoveOidcProviderRequest,
              com.aruna.api.storage.services.v2.RemoveOidcProviderResponse>(
                service, METHODID_REMOVE_OIDC_PROVIDER)))
        .addMethod(
          getAddPubkeyUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.AddPubkeyUserRequest,
              com.aruna.api.storage.services.v2.AddPubkeyUserResponse>(
                service, METHODID_ADD_PUBKEY_USER)))
        .addMethod(
          getAddTrustedEndpointsUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.AddTrustedEndpointsUserRequest,
              com.aruna.api.storage.services.v2.AddTrustedEndpointsUserResponse>(
                service, METHODID_ADD_TRUSTED_ENDPOINTS_USER)))
        .addMethod(
          getRemoveTrustedEndpointsUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.RemoveTrustedEndpointsUserRequest,
              com.aruna.api.storage.services.v2.RemoveTrustedEndpointsUserResponse>(
                service, METHODID_REMOVE_TRUSTED_ENDPOINTS_USER)))
        .addMethod(
          getAddDataProxyAttributeUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.AddDataProxyAttributeUserRequest,
              com.aruna.api.storage.services.v2.AddDataProxyAttributeUserResponse>(
                service, METHODID_ADD_DATA_PROXY_ATTRIBUTE_USER)))
        .addMethod(
          getRemoveDataProxyAttributeUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.RemoveDataProxyAttributeUserRequest,
              com.aruna.api.storage.services.v2.RemoveDataProxyAttributeUserResponse>(
                service, METHODID_REMOVE_DATA_PROXY_ATTRIBUTE_USER)))
        .build();
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.storage.services.v2.UserServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getRegisterUserMethod())
              .addMethod(getDeactivateUserMethod())
              .addMethod(getActivateUserMethod())
              .addMethod(getCreateAPITokenMethod())
              .addMethod(getGetAPITokenMethod())
              .addMethod(getGetAPITokensMethod())
              .addMethod(getDeleteAPITokenMethod())
              .addMethod(getDeleteAPITokensMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getGetUserRedactedMethod())
              .addMethod(getUpdateUserDisplayNameMethod())
              .addMethod(getUpdateUserEmailMethod())
              .addMethod(getGetNotActivatedUsersMethod())
              .addMethod(getGetAllUsersMethod())
              .addMethod(getCreateS3CredentialsUserTokenMethod())
              .addMethod(getGetS3CredentialsUserTokenMethod())
              .addMethod(getDeleteS3CredentialsUserTokenMethod())
              .addMethod(getGetDataproxyTokenUserMethod())
              .addMethod(getGetPersonalNotificationsMethod())
              .addMethod(getAcknowledgePersonalNotificationsMethod())
              .addMethod(getAddOidcProviderMethod())
              .addMethod(getRemoveOidcProviderMethod())
              .addMethod(getAddPubkeyUserMethod())
              .addMethod(getAddTrustedEndpointsUserMethod())
              .addMethod(getRemoveTrustedEndpointsUserMethod())
              .addMethod(getAddDataProxyAttributeUserMethod())
              .addMethod(getRemoveDataProxyAttributeUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
