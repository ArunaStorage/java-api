package com.aruna.api.storage.services.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * UserService
 * Contains all methods that get/create or update Users and associated resource
 * including all autorization methods
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/storage/services/v1/user_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.storage.services.v1.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.RegisterUserRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.RegisterUserResponse> getRegisterUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterUser",
      requestType = com.aruna.api.storage.services.v1.UserServiceProto.RegisterUserRequest.class,
      responseType = com.aruna.api.storage.services.v1.UserServiceProto.RegisterUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.RegisterUserRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.RegisterUserResponse> getRegisterUserMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.RegisterUserRequest, com.aruna.api.storage.services.v1.UserServiceProto.RegisterUserResponse> getRegisterUserMethod;
    if ((getRegisterUserMethod = UserServiceGrpc.getRegisterUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRegisterUserMethod = UserServiceGrpc.getRegisterUserMethod) == null) {
          UserServiceGrpc.getRegisterUserMethod = getRegisterUserMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.UserServiceProto.RegisterUserRequest, com.aruna.api.storage.services.v1.UserServiceProto.RegisterUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.RegisterUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.RegisterUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("RegisterUser"))
              .build();
        }
      }
    }
    return getRegisterUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.DeactivateUserRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.DeactivateUserResponse> getDeactivateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeactivateUser",
      requestType = com.aruna.api.storage.services.v1.UserServiceProto.DeactivateUserRequest.class,
      responseType = com.aruna.api.storage.services.v1.UserServiceProto.DeactivateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.DeactivateUserRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.DeactivateUserResponse> getDeactivateUserMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.DeactivateUserRequest, com.aruna.api.storage.services.v1.UserServiceProto.DeactivateUserResponse> getDeactivateUserMethod;
    if ((getDeactivateUserMethod = UserServiceGrpc.getDeactivateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeactivateUserMethod = UserServiceGrpc.getDeactivateUserMethod) == null) {
          UserServiceGrpc.getDeactivateUserMethod = getDeactivateUserMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.UserServiceProto.DeactivateUserRequest, com.aruna.api.storage.services.v1.UserServiceProto.DeactivateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeactivateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.DeactivateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.DeactivateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeactivateUser"))
              .build();
        }
      }
    }
    return getDeactivateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.ActivateUserRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.ActivateUserResponse> getActivateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActivateUser",
      requestType = com.aruna.api.storage.services.v1.UserServiceProto.ActivateUserRequest.class,
      responseType = com.aruna.api.storage.services.v1.UserServiceProto.ActivateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.ActivateUserRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.ActivateUserResponse> getActivateUserMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.ActivateUserRequest, com.aruna.api.storage.services.v1.UserServiceProto.ActivateUserResponse> getActivateUserMethod;
    if ((getActivateUserMethod = UserServiceGrpc.getActivateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getActivateUserMethod = UserServiceGrpc.getActivateUserMethod) == null) {
          UserServiceGrpc.getActivateUserMethod = getActivateUserMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.UserServiceProto.ActivateUserRequest, com.aruna.api.storage.services.v1.UserServiceProto.ActivateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActivateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.ActivateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.ActivateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ActivateUser"))
              .build();
        }
      }
    }
    return getActivateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.CreateAPITokenRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.CreateAPITokenResponse> getCreateAPITokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAPIToken",
      requestType = com.aruna.api.storage.services.v1.UserServiceProto.CreateAPITokenRequest.class,
      responseType = com.aruna.api.storage.services.v1.UserServiceProto.CreateAPITokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.CreateAPITokenRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.CreateAPITokenResponse> getCreateAPITokenMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.CreateAPITokenRequest, com.aruna.api.storage.services.v1.UserServiceProto.CreateAPITokenResponse> getCreateAPITokenMethod;
    if ((getCreateAPITokenMethod = UserServiceGrpc.getCreateAPITokenMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateAPITokenMethod = UserServiceGrpc.getCreateAPITokenMethod) == null) {
          UserServiceGrpc.getCreateAPITokenMethod = getCreateAPITokenMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.UserServiceProto.CreateAPITokenRequest, com.aruna.api.storage.services.v1.UserServiceProto.CreateAPITokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAPIToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.CreateAPITokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.CreateAPITokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateAPIToken"))
              .build();
        }
      }
    }
    return getCreateAPITokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokenRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokenResponse> getGetAPITokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAPIToken",
      requestType = com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokenRequest.class,
      responseType = com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokenRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokenResponse> getGetAPITokenMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokenRequest, com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokenResponse> getGetAPITokenMethod;
    if ((getGetAPITokenMethod = UserServiceGrpc.getGetAPITokenMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetAPITokenMethod = UserServiceGrpc.getGetAPITokenMethod) == null) {
          UserServiceGrpc.getGetAPITokenMethod = getGetAPITokenMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokenRequest, com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAPIToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetAPIToken"))
              .build();
        }
      }
    }
    return getGetAPITokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokensRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokensResponse> getGetAPITokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAPITokens",
      requestType = com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokensRequest.class,
      responseType = com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokensRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokensResponse> getGetAPITokensMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokensRequest, com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokensResponse> getGetAPITokensMethod;
    if ((getGetAPITokensMethod = UserServiceGrpc.getGetAPITokensMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetAPITokensMethod = UserServiceGrpc.getGetAPITokensMethod) == null) {
          UserServiceGrpc.getGetAPITokensMethod = getGetAPITokensMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokensRequest, com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAPITokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetAPITokens"))
              .build();
        }
      }
    }
    return getGetAPITokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokenRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokenResponse> getDeleteAPITokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAPIToken",
      requestType = com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokenRequest.class,
      responseType = com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokenRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokenResponse> getDeleteAPITokenMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokenRequest, com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokenResponse> getDeleteAPITokenMethod;
    if ((getDeleteAPITokenMethod = UserServiceGrpc.getDeleteAPITokenMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteAPITokenMethod = UserServiceGrpc.getDeleteAPITokenMethod) == null) {
          UserServiceGrpc.getDeleteAPITokenMethod = getDeleteAPITokenMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokenRequest, com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAPIToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteAPIToken"))
              .build();
        }
      }
    }
    return getDeleteAPITokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokensRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokensResponse> getDeleteAPITokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAPITokens",
      requestType = com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokensRequest.class,
      responseType = com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokensRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokensResponse> getDeleteAPITokensMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokensRequest, com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokensResponse> getDeleteAPITokensMethod;
    if ((getDeleteAPITokensMethod = UserServiceGrpc.getDeleteAPITokensMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteAPITokensMethod = UserServiceGrpc.getDeleteAPITokensMethod) == null) {
          UserServiceGrpc.getDeleteAPITokensMethod = getDeleteAPITokensMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokensRequest, com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAPITokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteAPITokens"))
              .build();
        }
      }
    }
    return getDeleteAPITokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.GetUserRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.GetUserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = com.aruna.api.storage.services.v1.UserServiceProto.GetUserRequest.class,
      responseType = com.aruna.api.storage.services.v1.UserServiceProto.GetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.GetUserRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.GetUserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.GetUserRequest, com.aruna.api.storage.services.v1.UserServiceProto.GetUserResponse> getGetUserMethod;
    if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
          UserServiceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.UserServiceProto.GetUserRequest, com.aruna.api.storage.services.v1.UserServiceProto.GetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.GetUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserDisplayNameRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserDisplayNameResponse> getUpdateUserDisplayNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserDisplayName",
      requestType = com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserDisplayNameRequest.class,
      responseType = com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserDisplayNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserDisplayNameRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserDisplayNameResponse> getUpdateUserDisplayNameMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserDisplayNameRequest, com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserDisplayNameResponse> getUpdateUserDisplayNameMethod;
    if ((getUpdateUserDisplayNameMethod = UserServiceGrpc.getUpdateUserDisplayNameMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserDisplayNameMethod = UserServiceGrpc.getUpdateUserDisplayNameMethod) == null) {
          UserServiceGrpc.getUpdateUserDisplayNameMethod = getUpdateUserDisplayNameMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserDisplayNameRequest, com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserDisplayNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserDisplayName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserDisplayNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserDisplayNameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateUserDisplayName"))
              .build();
        }
      }
    }
    return getUpdateUserDisplayNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserEmailRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserEmailResponse> getUpdateUserEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserEmail",
      requestType = com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserEmailRequest.class,
      responseType = com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserEmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserEmailRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserEmailResponse> getUpdateUserEmailMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserEmailRequest, com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserEmailResponse> getUpdateUserEmailMethod;
    if ((getUpdateUserEmailMethod = UserServiceGrpc.getUpdateUserEmailMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserEmailMethod = UserServiceGrpc.getUpdateUserEmailMethod) == null) {
          UserServiceGrpc.getUpdateUserEmailMethod = getUpdateUserEmailMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserEmailRequest, com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserEmailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateUserEmail"))
              .build();
        }
      }
    }
    return getUpdateUserEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.GetUserProjectsRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.GetUserProjectsResponse> getGetUserProjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserProjects",
      requestType = com.aruna.api.storage.services.v1.UserServiceProto.GetUserProjectsRequest.class,
      responseType = com.aruna.api.storage.services.v1.UserServiceProto.GetUserProjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.GetUserProjectsRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.GetUserProjectsResponse> getGetUserProjectsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.GetUserProjectsRequest, com.aruna.api.storage.services.v1.UserServiceProto.GetUserProjectsResponse> getGetUserProjectsMethod;
    if ((getGetUserProjectsMethod = UserServiceGrpc.getGetUserProjectsMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserProjectsMethod = UserServiceGrpc.getGetUserProjectsMethod) == null) {
          UserServiceGrpc.getGetUserProjectsMethod = getGetUserProjectsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.UserServiceProto.GetUserProjectsRequest, com.aruna.api.storage.services.v1.UserServiceProto.GetUserProjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserProjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.GetUserProjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.GetUserProjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUserProjects"))
              .build();
        }
      }
    }
    return getGetUserProjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.GetNotActivatedUsersRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.GetNotActivatedUsersResponse> getGetNotActivatedUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNotActivatedUsers",
      requestType = com.aruna.api.storage.services.v1.UserServiceProto.GetNotActivatedUsersRequest.class,
      responseType = com.aruna.api.storage.services.v1.UserServiceProto.GetNotActivatedUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.GetNotActivatedUsersRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.GetNotActivatedUsersResponse> getGetNotActivatedUsersMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.GetNotActivatedUsersRequest, com.aruna.api.storage.services.v1.UserServiceProto.GetNotActivatedUsersResponse> getGetNotActivatedUsersMethod;
    if ((getGetNotActivatedUsersMethod = UserServiceGrpc.getGetNotActivatedUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetNotActivatedUsersMethod = UserServiceGrpc.getGetNotActivatedUsersMethod) == null) {
          UserServiceGrpc.getGetNotActivatedUsersMethod = getGetNotActivatedUsersMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.UserServiceProto.GetNotActivatedUsersRequest, com.aruna.api.storage.services.v1.UserServiceProto.GetNotActivatedUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNotActivatedUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.GetNotActivatedUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.GetNotActivatedUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetNotActivatedUsers"))
              .build();
        }
      }
    }
    return getGetNotActivatedUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.GetAllUsersRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.GetAllUsersResponse> getGetAllUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllUsers",
      requestType = com.aruna.api.storage.services.v1.UserServiceProto.GetAllUsersRequest.class,
      responseType = com.aruna.api.storage.services.v1.UserServiceProto.GetAllUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.GetAllUsersRequest,
      com.aruna.api.storage.services.v1.UserServiceProto.GetAllUsersResponse> getGetAllUsersMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.UserServiceProto.GetAllUsersRequest, com.aruna.api.storage.services.v1.UserServiceProto.GetAllUsersResponse> getGetAllUsersMethod;
    if ((getGetAllUsersMethod = UserServiceGrpc.getGetAllUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetAllUsersMethod = UserServiceGrpc.getGetAllUsersMethod) == null) {
          UserServiceGrpc.getGetAllUsersMethod = getGetAllUsersMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.UserServiceProto.GetAllUsersRequest, com.aruna.api.storage.services.v1.UserServiceProto.GetAllUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.GetAllUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.UserServiceProto.GetAllUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetAllUsers"))
              .build();
        }
      }
    }
    return getGetAllUsersMethod;
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
     * Status: STABLE
     * This request should be called when a new user logs in for the first time
     * </pre>
     */
    default void registerUser(com.aruna.api.storage.services.v1.UserServiceProto.RegisterUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.RegisterUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeActivateUser 
     * Status: ALPHA
     * This deactivates a specific user (Admin request)
     * </pre>
     */
    default void deactivateUser(com.aruna.api.storage.services.v1.UserServiceProto.DeactivateUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.DeactivateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeactivateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * ActivateUser 
     * Status: STABLE
     * This activates a specific user (Admin request)
     * </pre>
     */
    default void activateUser(com.aruna.api.storage.services.v1.UserServiceProto.ActivateUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.ActivateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateAPIToken
     * Status: STABLE
     * Creates an API token to authenticate
     * </pre>
     */
    default void createAPIToken(com.aruna.api.storage.services.v1.UserServiceProto.CreateAPITokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.CreateAPITokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAPITokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAPIToken
     * Status: STABLE
     * Returns one API token by id
     * </pre>
     */
    default void getAPIToken(com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAPITokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAPITokens
     * Status: STABLE
     * Returns a list of API tokens for a specific user
     * </pre>
     */
    default void getAPITokens(com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokensRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAPITokensMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAPIToken
     * Status: STABLE
     * Deletes the specified API Token
     * </pre>
     */
    default void deleteAPIToken(com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAPITokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAPITokens
     * Status: STABLE
     * Deletes the specified API Token
     * </pre>
     */
    default void deleteAPITokens(com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokensRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokensResponse> responseObserver) {
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
    default void getUser(com.aruna.api.storage.services.v1.UserServiceProto.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.GetUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateUserDisplayName
     * Status: STABLE
     * Updates the Displayname for the user (Personal only)
     * </pre>
     */
    default void updateUserDisplayName(com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserDisplayNameRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserDisplayNameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserDisplayNameMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateUserDisplayName
     * Status: ALPHA
     * Updates the email for the user (Personal only)
     * </pre>
     */
    default void updateUserEmail(com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserEmailRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserEmailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUserProjects
     * Status: STABLE
     * Gets all project_ids a user is member of
     * </pre>
     */
    default void getUserProjects(com.aruna.api.storage.services.v1.UserServiceProto.GetUserProjectsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.GetUserProjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserProjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetNotActivatedUsers
     * Status: STABLE
     * Get all not activated users (Admin only)
     * </pre>
     */
    default void getNotActivatedUsers(com.aruna.api.storage.services.v1.UserServiceProto.GetNotActivatedUsersRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.GetNotActivatedUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNotActivatedUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAllUsers
     * Status: ALPHA
     * Get all users inkluding permissions (Admin only)
     * </pre>
     */
    default void getAllUsers(com.aruna.api.storage.services.v1.UserServiceProto.GetAllUsersRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.GetAllUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllUsersMethod(), responseObserver);
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
     * Status: STABLE
     * This request should be called when a new user logs in for the first time
     * </pre>
     */
    public void registerUser(com.aruna.api.storage.services.v1.UserServiceProto.RegisterUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.RegisterUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeActivateUser 
     * Status: ALPHA
     * This deactivates a specific user (Admin request)
     * </pre>
     */
    public void deactivateUser(com.aruna.api.storage.services.v1.UserServiceProto.DeactivateUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.DeactivateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeactivateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ActivateUser 
     * Status: STABLE
     * This activates a specific user (Admin request)
     * </pre>
     */
    public void activateUser(com.aruna.api.storage.services.v1.UserServiceProto.ActivateUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.ActivateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateAPIToken
     * Status: STABLE
     * Creates an API token to authenticate
     * </pre>
     */
    public void createAPIToken(com.aruna.api.storage.services.v1.UserServiceProto.CreateAPITokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.CreateAPITokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAPITokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAPIToken
     * Status: STABLE
     * Returns one API token by id
     * </pre>
     */
    public void getAPIToken(com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokenResponse> responseObserver) {
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
    public void getAPITokens(com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokensRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokensResponse> responseObserver) {
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
    public void deleteAPIToken(com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokenRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAPITokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteAPITokens
     * Status: STABLE
     * Deletes the specified API Token
     * </pre>
     */
    public void deleteAPITokens(com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokensRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokensResponse> responseObserver) {
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
    public void getUser(com.aruna.api.storage.services.v1.UserServiceProto.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.GetUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateUserDisplayName
     * Status: STABLE
     * Updates the Displayname for the user (Personal only)
     * </pre>
     */
    public void updateUserDisplayName(com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserDisplayNameRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserDisplayNameResponse> responseObserver) {
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
    public void updateUserEmail(com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserEmailRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserEmailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUserProjects
     * Status: STABLE
     * Gets all project_ids a user is member of
     * </pre>
     */
    public void getUserProjects(com.aruna.api.storage.services.v1.UserServiceProto.GetUserProjectsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.GetUserProjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserProjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetNotActivatedUsers
     * Status: STABLE
     * Get all not activated users (Admin only)
     * </pre>
     */
    public void getNotActivatedUsers(com.aruna.api.storage.services.v1.UserServiceProto.GetNotActivatedUsersRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.GetNotActivatedUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNotActivatedUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAllUsers
     * Status: ALPHA
     * Get all users inkluding permissions (Admin only)
     * </pre>
     */
    public void getAllUsers(com.aruna.api.storage.services.v1.UserServiceProto.GetAllUsersRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.GetAllUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllUsersMethod(), getCallOptions()), request, responseObserver);
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
     * Status: STABLE
     * This request should be called when a new user logs in for the first time
     * </pre>
     */
    public com.aruna.api.storage.services.v1.UserServiceProto.RegisterUserResponse registerUser(com.aruna.api.storage.services.v1.UserServiceProto.RegisterUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeActivateUser 
     * Status: ALPHA
     * This deactivates a specific user (Admin request)
     * </pre>
     */
    public com.aruna.api.storage.services.v1.UserServiceProto.DeactivateUserResponse deactivateUser(com.aruna.api.storage.services.v1.UserServiceProto.DeactivateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeactivateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ActivateUser 
     * Status: STABLE
     * This activates a specific user (Admin request)
     * </pre>
     */
    public com.aruna.api.storage.services.v1.UserServiceProto.ActivateUserResponse activateUser(com.aruna.api.storage.services.v1.UserServiceProto.ActivateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateAPIToken
     * Status: STABLE
     * Creates an API token to authenticate
     * </pre>
     */
    public com.aruna.api.storage.services.v1.UserServiceProto.CreateAPITokenResponse createAPIToken(com.aruna.api.storage.services.v1.UserServiceProto.CreateAPITokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAPITokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAPIToken
     * Status: STABLE
     * Returns one API token by id
     * </pre>
     */
    public com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokenResponse getAPIToken(com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokenRequest request) {
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
    public com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokensResponse getAPITokens(com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokensRequest request) {
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
    public com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokenResponse deleteAPIToken(com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAPITokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAPITokens
     * Status: STABLE
     * Deletes the specified API Token
     * </pre>
     */
    public com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokensResponse deleteAPITokens(com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokensRequest request) {
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
    public com.aruna.api.storage.services.v1.UserServiceProto.GetUserResponse getUser(com.aruna.api.storage.services.v1.UserServiceProto.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateUserDisplayName
     * Status: STABLE
     * Updates the Displayname for the user (Personal only)
     * </pre>
     */
    public com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserDisplayNameResponse updateUserDisplayName(com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserDisplayNameRequest request) {
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
    public com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserEmailResponse updateUserEmail(com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserEmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUserProjects
     * Status: STABLE
     * Gets all project_ids a user is member of
     * </pre>
     */
    public com.aruna.api.storage.services.v1.UserServiceProto.GetUserProjectsResponse getUserProjects(com.aruna.api.storage.services.v1.UserServiceProto.GetUserProjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserProjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetNotActivatedUsers
     * Status: STABLE
     * Get all not activated users (Admin only)
     * </pre>
     */
    public com.aruna.api.storage.services.v1.UserServiceProto.GetNotActivatedUsersResponse getNotActivatedUsers(com.aruna.api.storage.services.v1.UserServiceProto.GetNotActivatedUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNotActivatedUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAllUsers
     * Status: ALPHA
     * Get all users inkluding permissions (Admin only)
     * </pre>
     */
    public com.aruna.api.storage.services.v1.UserServiceProto.GetAllUsersResponse getAllUsers(com.aruna.api.storage.services.v1.UserServiceProto.GetAllUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllUsersMethod(), getCallOptions(), request);
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
     * Status: STABLE
     * This request should be called when a new user logs in for the first time
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.UserServiceProto.RegisterUserResponse> registerUser(
        com.aruna.api.storage.services.v1.UserServiceProto.RegisterUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeActivateUser 
     * Status: ALPHA
     * This deactivates a specific user (Admin request)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.UserServiceProto.DeactivateUserResponse> deactivateUser(
        com.aruna.api.storage.services.v1.UserServiceProto.DeactivateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeactivateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ActivateUser 
     * Status: STABLE
     * This activates a specific user (Admin request)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.UserServiceProto.ActivateUserResponse> activateUser(
        com.aruna.api.storage.services.v1.UserServiceProto.ActivateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateAPIToken
     * Status: STABLE
     * Creates an API token to authenticate
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.UserServiceProto.CreateAPITokenResponse> createAPIToken(
        com.aruna.api.storage.services.v1.UserServiceProto.CreateAPITokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAPITokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAPIToken
     * Status: STABLE
     * Returns one API token by id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokenResponse> getAPIToken(
        com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokenRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokensResponse> getAPITokens(
        com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokensRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokenResponse> deleteAPIToken(
        com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAPITokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteAPITokens
     * Status: STABLE
     * Deletes the specified API Token
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokensResponse> deleteAPITokens(
        com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokensRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.UserServiceProto.GetUserResponse> getUser(
        com.aruna.api.storage.services.v1.UserServiceProto.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateUserDisplayName
     * Status: STABLE
     * Updates the Displayname for the user (Personal only)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserDisplayNameResponse> updateUserDisplayName(
        com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserDisplayNameRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserEmailResponse> updateUserEmail(
        com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserEmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUserProjects
     * Status: STABLE
     * Gets all project_ids a user is member of
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.UserServiceProto.GetUserProjectsResponse> getUserProjects(
        com.aruna.api.storage.services.v1.UserServiceProto.GetUserProjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserProjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetNotActivatedUsers
     * Status: STABLE
     * Get all not activated users (Admin only)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.UserServiceProto.GetNotActivatedUsersResponse> getNotActivatedUsers(
        com.aruna.api.storage.services.v1.UserServiceProto.GetNotActivatedUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNotActivatedUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAllUsers
     * Status: ALPHA
     * Get all users inkluding permissions (Admin only)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.UserServiceProto.GetAllUsersResponse> getAllUsers(
        com.aruna.api.storage.services.v1.UserServiceProto.GetAllUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllUsersMethod(), getCallOptions()), request);
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
  private static final int METHODID_UPDATE_USER_DISPLAY_NAME = 9;
  private static final int METHODID_UPDATE_USER_EMAIL = 10;
  private static final int METHODID_GET_USER_PROJECTS = 11;
  private static final int METHODID_GET_NOT_ACTIVATED_USERS = 12;
  private static final int METHODID_GET_ALL_USERS = 13;

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
          serviceImpl.registerUser((com.aruna.api.storage.services.v1.UserServiceProto.RegisterUserRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.RegisterUserResponse>) responseObserver);
          break;
        case METHODID_DEACTIVATE_USER:
          serviceImpl.deactivateUser((com.aruna.api.storage.services.v1.UserServiceProto.DeactivateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.DeactivateUserResponse>) responseObserver);
          break;
        case METHODID_ACTIVATE_USER:
          serviceImpl.activateUser((com.aruna.api.storage.services.v1.UserServiceProto.ActivateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.ActivateUserResponse>) responseObserver);
          break;
        case METHODID_CREATE_APITOKEN:
          serviceImpl.createAPIToken((com.aruna.api.storage.services.v1.UserServiceProto.CreateAPITokenRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.CreateAPITokenResponse>) responseObserver);
          break;
        case METHODID_GET_APITOKEN:
          serviceImpl.getAPIToken((com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokenRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokenResponse>) responseObserver);
          break;
        case METHODID_GET_APITOKENS:
          serviceImpl.getAPITokens((com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokensRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokensResponse>) responseObserver);
          break;
        case METHODID_DELETE_APITOKEN:
          serviceImpl.deleteAPIToken((com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokenRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokenResponse>) responseObserver);
          break;
        case METHODID_DELETE_APITOKENS:
          serviceImpl.deleteAPITokens((com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokensRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokensResponse>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((com.aruna.api.storage.services.v1.UserServiceProto.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.GetUserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_DISPLAY_NAME:
          serviceImpl.updateUserDisplayName((com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserDisplayNameRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserDisplayNameResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_EMAIL:
          serviceImpl.updateUserEmail((com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserEmailRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserEmailResponse>) responseObserver);
          break;
        case METHODID_GET_USER_PROJECTS:
          serviceImpl.getUserProjects((com.aruna.api.storage.services.v1.UserServiceProto.GetUserProjectsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.GetUserProjectsResponse>) responseObserver);
          break;
        case METHODID_GET_NOT_ACTIVATED_USERS:
          serviceImpl.getNotActivatedUsers((com.aruna.api.storage.services.v1.UserServiceProto.GetNotActivatedUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.GetNotActivatedUsersResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_USERS:
          serviceImpl.getAllUsers((com.aruna.api.storage.services.v1.UserServiceProto.GetAllUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.UserServiceProto.GetAllUsersResponse>) responseObserver);
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
              com.aruna.api.storage.services.v1.UserServiceProto.RegisterUserRequest,
              com.aruna.api.storage.services.v1.UserServiceProto.RegisterUserResponse>(
                service, METHODID_REGISTER_USER)))
        .addMethod(
          getDeactivateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.UserServiceProto.DeactivateUserRequest,
              com.aruna.api.storage.services.v1.UserServiceProto.DeactivateUserResponse>(
                service, METHODID_DEACTIVATE_USER)))
        .addMethod(
          getActivateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.UserServiceProto.ActivateUserRequest,
              com.aruna.api.storage.services.v1.UserServiceProto.ActivateUserResponse>(
                service, METHODID_ACTIVATE_USER)))
        .addMethod(
          getCreateAPITokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.UserServiceProto.CreateAPITokenRequest,
              com.aruna.api.storage.services.v1.UserServiceProto.CreateAPITokenResponse>(
                service, METHODID_CREATE_APITOKEN)))
        .addMethod(
          getGetAPITokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokenRequest,
              com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokenResponse>(
                service, METHODID_GET_APITOKEN)))
        .addMethod(
          getGetAPITokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokensRequest,
              com.aruna.api.storage.services.v1.UserServiceProto.GetAPITokensResponse>(
                service, METHODID_GET_APITOKENS)))
        .addMethod(
          getDeleteAPITokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokenRequest,
              com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokenResponse>(
                service, METHODID_DELETE_APITOKEN)))
        .addMethod(
          getDeleteAPITokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokensRequest,
              com.aruna.api.storage.services.v1.UserServiceProto.DeleteAPITokensResponse>(
                service, METHODID_DELETE_APITOKENS)))
        .addMethod(
          getGetUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.UserServiceProto.GetUserRequest,
              com.aruna.api.storage.services.v1.UserServiceProto.GetUserResponse>(
                service, METHODID_GET_USER)))
        .addMethod(
          getUpdateUserDisplayNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserDisplayNameRequest,
              com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserDisplayNameResponse>(
                service, METHODID_UPDATE_USER_DISPLAY_NAME)))
        .addMethod(
          getUpdateUserEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserEmailRequest,
              com.aruna.api.storage.services.v1.UserServiceProto.UpdateUserEmailResponse>(
                service, METHODID_UPDATE_USER_EMAIL)))
        .addMethod(
          getGetUserProjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.UserServiceProto.GetUserProjectsRequest,
              com.aruna.api.storage.services.v1.UserServiceProto.GetUserProjectsResponse>(
                service, METHODID_GET_USER_PROJECTS)))
        .addMethod(
          getGetNotActivatedUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.UserServiceProto.GetNotActivatedUsersRequest,
              com.aruna.api.storage.services.v1.UserServiceProto.GetNotActivatedUsersResponse>(
                service, METHODID_GET_NOT_ACTIVATED_USERS)))
        .addMethod(
          getGetAllUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.UserServiceProto.GetAllUsersRequest,
              com.aruna.api.storage.services.v1.UserServiceProto.GetAllUsersResponse>(
                service, METHODID_GET_ALL_USERS)))
        .build();
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.storage.services.v1.UserServiceProto.getDescriptor();
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
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
              .addMethod(getUpdateUserDisplayNameMethod())
              .addMethod(getUpdateUserEmailMethod())
              .addMethod(getGetUserProjectsMethod())
              .addMethod(getGetNotActivatedUsersMethod())
              .addMethod(getGetAllUsersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
