package com.aruna.api.storage.services.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * UserService
 * Contains all methods that get/create or update Users and associated resource
 * including all autorization methods
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
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

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetS3CredentialsUserRequest,
      com.aruna.api.storage.services.v2.GetS3CredentialsUserResponse> getGetS3CredentialsUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetS3CredentialsUser",
      requestType = com.aruna.api.storage.services.v2.GetS3CredentialsUserRequest.class,
      responseType = com.aruna.api.storage.services.v2.GetS3CredentialsUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetS3CredentialsUserRequest,
      com.aruna.api.storage.services.v2.GetS3CredentialsUserResponse> getGetS3CredentialsUserMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.GetS3CredentialsUserRequest, com.aruna.api.storage.services.v2.GetS3CredentialsUserResponse> getGetS3CredentialsUserMethod;
    if ((getGetS3CredentialsUserMethod = UserServiceGrpc.getGetS3CredentialsUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetS3CredentialsUserMethod = UserServiceGrpc.getGetS3CredentialsUserMethod) == null) {
          UserServiceGrpc.getGetS3CredentialsUserMethod = getGetS3CredentialsUserMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.GetS3CredentialsUserRequest, com.aruna.api.storage.services.v2.GetS3CredentialsUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetS3CredentialsUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetS3CredentialsUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.GetS3CredentialsUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetS3CredentialsUser"))
              .build();
        }
      }
    }
    return getGetS3CredentialsUserMethod;
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
      com.aruna.api.storage.services.v2.AddOidcProviderResponse> getAddOidcProvierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddOidcProvier",
      requestType = com.aruna.api.storage.services.v2.AddOidcProviderRequest.class,
      responseType = com.aruna.api.storage.services.v2.AddOidcProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AddOidcProviderRequest,
      com.aruna.api.storage.services.v2.AddOidcProviderResponse> getAddOidcProvierMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v2.AddOidcProviderRequest, com.aruna.api.storage.services.v2.AddOidcProviderResponse> getAddOidcProvierMethod;
    if ((getAddOidcProvierMethod = UserServiceGrpc.getAddOidcProvierMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAddOidcProvierMethod = UserServiceGrpc.getAddOidcProvierMethod) == null) {
          UserServiceGrpc.getAddOidcProvierMethod = getAddOidcProvierMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v2.AddOidcProviderRequest, com.aruna.api.storage.services.v2.AddOidcProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddOidcProvier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AddOidcProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v2.AddOidcProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("AddOidcProvier"))
              .build();
        }
      }
    }
    return getAddOidcProvierMethod;
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
   * Contains all methods that get/create or update Users and associated resource
   * including all autorization methods
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
     * GetS3Credentials
     * Status: ALPHA
     * Gets s3 credentials for a specific user and data_proxy
     * </pre>
     */
    default void getS3CredentialsUser(com.aruna.api.storage.services.v2.GetS3CredentialsUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetS3CredentialsUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetS3CredentialsUserMethod(), responseObserver);
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
     */
    default void addOidcProvier(com.aruna.api.storage.services.v2.AddOidcProviderRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AddOidcProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddOidcProvierMethod(), responseObserver);
    }

    /**
     */
    default void removeOidcProvider(com.aruna.api.storage.services.v2.RemoveOidcProviderRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RemoveOidcProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveOidcProviderMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserService.
   * <pre>
   * UserService
   * Contains all methods that get/create or update Users and associated resource
   * including all autorization methods
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
   * Contains all methods that get/create or update Users and associated resource
   * including all autorization methods
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
     * GetS3Credentials
     * Status: ALPHA
     * Gets s3 credentials for a specific user and data_proxy
     * </pre>
     */
    public void getS3CredentialsUser(com.aruna.api.storage.services.v2.GetS3CredentialsUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetS3CredentialsUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetS3CredentialsUserMethod(), getCallOptions()), request, responseObserver);
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
     */
    public void addOidcProvier(com.aruna.api.storage.services.v2.AddOidcProviderRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AddOidcProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddOidcProvierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeOidcProvider(com.aruna.api.storage.services.v2.RemoveOidcProviderRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RemoveOidcProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveOidcProviderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserService.
   * <pre>
   * UserService
   * Contains all methods that get/create or update Users and associated resource
   * including all autorization methods
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
     * GetS3Credentials
     * Status: ALPHA
     * Gets s3 credentials for a specific user and data_proxy
     * </pre>
     */
    public com.aruna.api.storage.services.v2.GetS3CredentialsUserResponse getS3CredentialsUser(com.aruna.api.storage.services.v2.GetS3CredentialsUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetS3CredentialsUserMethod(), getCallOptions(), request);
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
     */
    public com.aruna.api.storage.services.v2.AddOidcProviderResponse addOidcProvier(com.aruna.api.storage.services.v2.AddOidcProviderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddOidcProvierMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aruna.api.storage.services.v2.RemoveOidcProviderResponse removeOidcProvider(com.aruna.api.storage.services.v2.RemoveOidcProviderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveOidcProviderMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserService.
   * <pre>
   * UserService
   * Contains all methods that get/create or update Users and associated resource
   * including all autorization methods
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
     * GetS3Credentials
     * Status: ALPHA
     * Gets s3 credentials for a specific user and data_proxy
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.GetS3CredentialsUserResponse> getS3CredentialsUser(
        com.aruna.api.storage.services.v2.GetS3CredentialsUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetS3CredentialsUserMethod(), getCallOptions()), request);
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.AddOidcProviderResponse> addOidcProvier(
        com.aruna.api.storage.services.v2.AddOidcProviderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddOidcProvierMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v2.RemoveOidcProviderResponse> removeOidcProvider(
        com.aruna.api.storage.services.v2.RemoveOidcProviderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveOidcProviderMethod(), getCallOptions()), request);
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
  private static final int METHODID_GET_S3CREDENTIALS_USER = 14;
  private static final int METHODID_GET_DATAPROXY_TOKEN_USER = 15;
  private static final int METHODID_GET_PERSONAL_NOTIFICATIONS = 16;
  private static final int METHODID_ACKNOWLEDGE_PERSONAL_NOTIFICATIONS = 17;
  private static final int METHODID_ADD_OIDC_PROVIER = 18;
  private static final int METHODID_REMOVE_OIDC_PROVIDER = 19;

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
        case METHODID_GET_S3CREDENTIALS_USER:
          serviceImpl.getS3CredentialsUser((com.aruna.api.storage.services.v2.GetS3CredentialsUserRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.GetS3CredentialsUserResponse>) responseObserver);
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
        case METHODID_ADD_OIDC_PROVIER:
          serviceImpl.addOidcProvier((com.aruna.api.storage.services.v2.AddOidcProviderRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.AddOidcProviderResponse>) responseObserver);
          break;
        case METHODID_REMOVE_OIDC_PROVIDER:
          serviceImpl.removeOidcProvider((com.aruna.api.storage.services.v2.RemoveOidcProviderRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v2.RemoveOidcProviderResponse>) responseObserver);
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
          getGetS3CredentialsUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.GetS3CredentialsUserRequest,
              com.aruna.api.storage.services.v2.GetS3CredentialsUserResponse>(
                service, METHODID_GET_S3CREDENTIALS_USER)))
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
          getAddOidcProvierMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.AddOidcProviderRequest,
              com.aruna.api.storage.services.v2.AddOidcProviderResponse>(
                service, METHODID_ADD_OIDC_PROVIER)))
        .addMethod(
          getRemoveOidcProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v2.RemoveOidcProviderRequest,
              com.aruna.api.storage.services.v2.RemoveOidcProviderResponse>(
                service, METHODID_REMOVE_OIDC_PROVIDER)))
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
              .addMethod(getGetS3CredentialsUserMethod())
              .addMethod(getGetDataproxyTokenUserMethod())
              .addMethod(getGetPersonalNotificationsMethod())
              .addMethod(getAcknowledgePersonalNotificationsMethod())
              .addMethod(getAddOidcProvierMethod())
              .addMethod(getRemoveOidcProviderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
