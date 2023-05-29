package com.aruna.api.storage.services.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ObjectService
 * Contains all methods that get/create or update Objects and associated resource
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: aruna/api/storage/services/v1/objectgroup_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ObjectGroupServiceGrpc {

  private ObjectGroupServiceGrpc() {}

  public static final String SERVICE_NAME = "aruna.api.storage.services.v1.ObjectGroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.CreateObjectGroupRequest,
      com.aruna.api.storage.services.v1.ObjectgroupServiceProto.CreateObjectGroupResponse> getCreateObjectGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateObjectGroup",
      requestType = com.aruna.api.storage.services.v1.ObjectgroupServiceProto.CreateObjectGroupRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectgroupServiceProto.CreateObjectGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.CreateObjectGroupRequest,
      com.aruna.api.storage.services.v1.ObjectgroupServiceProto.CreateObjectGroupResponse> getCreateObjectGroupMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.CreateObjectGroupRequest, com.aruna.api.storage.services.v1.ObjectgroupServiceProto.CreateObjectGroupResponse> getCreateObjectGroupMethod;
    if ((getCreateObjectGroupMethod = ObjectGroupServiceGrpc.getCreateObjectGroupMethod) == null) {
      synchronized (ObjectGroupServiceGrpc.class) {
        if ((getCreateObjectGroupMethod = ObjectGroupServiceGrpc.getCreateObjectGroupMethod) == null) {
          ObjectGroupServiceGrpc.getCreateObjectGroupMethod = getCreateObjectGroupMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.CreateObjectGroupRequest, com.aruna.api.storage.services.v1.ObjectgroupServiceProto.CreateObjectGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateObjectGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectgroupServiceProto.CreateObjectGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectgroupServiceProto.CreateObjectGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectGroupServiceMethodDescriptorSupplier("CreateObjectGroup"))
              .build();
        }
      }
    }
    return getCreateObjectGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.UpdateObjectGroupRequest,
      com.aruna.api.storage.services.v1.ObjectgroupServiceProto.UpdateObjectGroupResponse> getUpdateObjectGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateObjectGroup",
      requestType = com.aruna.api.storage.services.v1.ObjectgroupServiceProto.UpdateObjectGroupRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectgroupServiceProto.UpdateObjectGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.UpdateObjectGroupRequest,
      com.aruna.api.storage.services.v1.ObjectgroupServiceProto.UpdateObjectGroupResponse> getUpdateObjectGroupMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.UpdateObjectGroupRequest, com.aruna.api.storage.services.v1.ObjectgroupServiceProto.UpdateObjectGroupResponse> getUpdateObjectGroupMethod;
    if ((getUpdateObjectGroupMethod = ObjectGroupServiceGrpc.getUpdateObjectGroupMethod) == null) {
      synchronized (ObjectGroupServiceGrpc.class) {
        if ((getUpdateObjectGroupMethod = ObjectGroupServiceGrpc.getUpdateObjectGroupMethod) == null) {
          ObjectGroupServiceGrpc.getUpdateObjectGroupMethod = getUpdateObjectGroupMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.UpdateObjectGroupRequest, com.aruna.api.storage.services.v1.ObjectgroupServiceProto.UpdateObjectGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateObjectGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectgroupServiceProto.UpdateObjectGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectgroupServiceProto.UpdateObjectGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectGroupServiceMethodDescriptorSupplier("UpdateObjectGroup"))
              .build();
        }
      }
    }
    return getUpdateObjectGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupByIdRequest,
      com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupByIdResponse> getGetObjectGroupByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectGroupById",
      requestType = com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupByIdRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupByIdRequest,
      com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupByIdResponse> getGetObjectGroupByIdMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupByIdRequest, com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupByIdResponse> getGetObjectGroupByIdMethod;
    if ((getGetObjectGroupByIdMethod = ObjectGroupServiceGrpc.getGetObjectGroupByIdMethod) == null) {
      synchronized (ObjectGroupServiceGrpc.class) {
        if ((getGetObjectGroupByIdMethod = ObjectGroupServiceGrpc.getGetObjectGroupByIdMethod) == null) {
          ObjectGroupServiceGrpc.getGetObjectGroupByIdMethod = getGetObjectGroupByIdMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupByIdRequest, com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjectGroupById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectGroupServiceMethodDescriptorSupplier("GetObjectGroupById"))
              .build();
        }
      }
    }
    return getGetObjectGroupByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsFromObjectRequest,
      com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsFromObjectResponse> getGetObjectGroupsFromObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectGroupsFromObject",
      requestType = com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsFromObjectRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsFromObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsFromObjectRequest,
      com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsFromObjectResponse> getGetObjectGroupsFromObjectMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsFromObjectRequest, com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsFromObjectResponse> getGetObjectGroupsFromObjectMethod;
    if ((getGetObjectGroupsFromObjectMethod = ObjectGroupServiceGrpc.getGetObjectGroupsFromObjectMethod) == null) {
      synchronized (ObjectGroupServiceGrpc.class) {
        if ((getGetObjectGroupsFromObjectMethod = ObjectGroupServiceGrpc.getGetObjectGroupsFromObjectMethod) == null) {
          ObjectGroupServiceGrpc.getGetObjectGroupsFromObjectMethod = getGetObjectGroupsFromObjectMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsFromObjectRequest, com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsFromObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjectGroupsFromObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsFromObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsFromObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectGroupServiceMethodDescriptorSupplier("GetObjectGroupsFromObject"))
              .build();
        }
      }
    }
    return getGetObjectGroupsFromObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsRequest,
      com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsResponse> getGetObjectGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectGroups",
      requestType = com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsRequest,
      com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsResponse> getGetObjectGroupsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsRequest, com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsResponse> getGetObjectGroupsMethod;
    if ((getGetObjectGroupsMethod = ObjectGroupServiceGrpc.getGetObjectGroupsMethod) == null) {
      synchronized (ObjectGroupServiceGrpc.class) {
        if ((getGetObjectGroupsMethod = ObjectGroupServiceGrpc.getGetObjectGroupsMethod) == null) {
          ObjectGroupServiceGrpc.getGetObjectGroupsMethod = getGetObjectGroupsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsRequest, com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjectGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectGroupServiceMethodDescriptorSupplier("GetObjectGroups"))
              .build();
        }
      }
    }
    return getGetObjectGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupHistoryRequest,
      com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupHistoryResponse> getGetObjectGroupHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectGroupHistory",
      requestType = com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupHistoryRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupHistoryRequest,
      com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupHistoryResponse> getGetObjectGroupHistoryMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupHistoryRequest, com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupHistoryResponse> getGetObjectGroupHistoryMethod;
    if ((getGetObjectGroupHistoryMethod = ObjectGroupServiceGrpc.getGetObjectGroupHistoryMethod) == null) {
      synchronized (ObjectGroupServiceGrpc.class) {
        if ((getGetObjectGroupHistoryMethod = ObjectGroupServiceGrpc.getGetObjectGroupHistoryMethod) == null) {
          ObjectGroupServiceGrpc.getGetObjectGroupHistoryMethod = getGetObjectGroupHistoryMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupHistoryRequest, com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjectGroupHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectGroupServiceMethodDescriptorSupplier("GetObjectGroupHistory"))
              .build();
        }
      }
    }
    return getGetObjectGroupHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupObjectsRequest,
      com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupObjectsResponse> getGetObjectGroupObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectGroupObjects",
      requestType = com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupObjectsRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupObjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupObjectsRequest,
      com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupObjectsResponse> getGetObjectGroupObjectsMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupObjectsRequest, com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupObjectsResponse> getGetObjectGroupObjectsMethod;
    if ((getGetObjectGroupObjectsMethod = ObjectGroupServiceGrpc.getGetObjectGroupObjectsMethod) == null) {
      synchronized (ObjectGroupServiceGrpc.class) {
        if ((getGetObjectGroupObjectsMethod = ObjectGroupServiceGrpc.getGetObjectGroupObjectsMethod) == null) {
          ObjectGroupServiceGrpc.getGetObjectGroupObjectsMethod = getGetObjectGroupObjectsMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupObjectsRequest, com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupObjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjectGroupObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupObjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectGroupServiceMethodDescriptorSupplier("GetObjectGroupObjects"))
              .build();
        }
      }
    }
    return getGetObjectGroupObjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.DeleteObjectGroupRequest,
      com.aruna.api.storage.services.v1.ObjectgroupServiceProto.DeleteObjectGroupResponse> getDeleteObjectGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteObjectGroup",
      requestType = com.aruna.api.storage.services.v1.ObjectgroupServiceProto.DeleteObjectGroupRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectgroupServiceProto.DeleteObjectGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.DeleteObjectGroupRequest,
      com.aruna.api.storage.services.v1.ObjectgroupServiceProto.DeleteObjectGroupResponse> getDeleteObjectGroupMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.DeleteObjectGroupRequest, com.aruna.api.storage.services.v1.ObjectgroupServiceProto.DeleteObjectGroupResponse> getDeleteObjectGroupMethod;
    if ((getDeleteObjectGroupMethod = ObjectGroupServiceGrpc.getDeleteObjectGroupMethod) == null) {
      synchronized (ObjectGroupServiceGrpc.class) {
        if ((getDeleteObjectGroupMethod = ObjectGroupServiceGrpc.getDeleteObjectGroupMethod) == null) {
          ObjectGroupServiceGrpc.getDeleteObjectGroupMethod = getDeleteObjectGroupMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.DeleteObjectGroupRequest, com.aruna.api.storage.services.v1.ObjectgroupServiceProto.DeleteObjectGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteObjectGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectgroupServiceProto.DeleteObjectGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectgroupServiceProto.DeleteObjectGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectGroupServiceMethodDescriptorSupplier("DeleteObjectGroup"))
              .build();
        }
      }
    }
    return getDeleteObjectGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.AddLabelsToObjectGroupRequest,
      com.aruna.api.storage.services.v1.ObjectgroupServiceProto.AddLabelsToObjectGroupResponse> getAddLabelsToObjectGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddLabelsToObjectGroup",
      requestType = com.aruna.api.storage.services.v1.ObjectgroupServiceProto.AddLabelsToObjectGroupRequest.class,
      responseType = com.aruna.api.storage.services.v1.ObjectgroupServiceProto.AddLabelsToObjectGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.AddLabelsToObjectGroupRequest,
      com.aruna.api.storage.services.v1.ObjectgroupServiceProto.AddLabelsToObjectGroupResponse> getAddLabelsToObjectGroupMethod() {
    io.grpc.MethodDescriptor<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.AddLabelsToObjectGroupRequest, com.aruna.api.storage.services.v1.ObjectgroupServiceProto.AddLabelsToObjectGroupResponse> getAddLabelsToObjectGroupMethod;
    if ((getAddLabelsToObjectGroupMethod = ObjectGroupServiceGrpc.getAddLabelsToObjectGroupMethod) == null) {
      synchronized (ObjectGroupServiceGrpc.class) {
        if ((getAddLabelsToObjectGroupMethod = ObjectGroupServiceGrpc.getAddLabelsToObjectGroupMethod) == null) {
          ObjectGroupServiceGrpc.getAddLabelsToObjectGroupMethod = getAddLabelsToObjectGroupMethod =
              io.grpc.MethodDescriptor.<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.AddLabelsToObjectGroupRequest, com.aruna.api.storage.services.v1.ObjectgroupServiceProto.AddLabelsToObjectGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddLabelsToObjectGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectgroupServiceProto.AddLabelsToObjectGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aruna.api.storage.services.v1.ObjectgroupServiceProto.AddLabelsToObjectGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectGroupServiceMethodDescriptorSupplier("AddLabelsToObjectGroup"))
              .build();
        }
      }
    }
    return getAddLabelsToObjectGroupMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ObjectGroupServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObjectGroupServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObjectGroupServiceStub>() {
        @java.lang.Override
        public ObjectGroupServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObjectGroupServiceStub(channel, callOptions);
        }
      };
    return ObjectGroupServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ObjectGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObjectGroupServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObjectGroupServiceBlockingStub>() {
        @java.lang.Override
        public ObjectGroupServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObjectGroupServiceBlockingStub(channel, callOptions);
        }
      };
    return ObjectGroupServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ObjectGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObjectGroupServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObjectGroupServiceFutureStub>() {
        @java.lang.Override
        public ObjectGroupServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObjectGroupServiceFutureStub(channel, callOptions);
        }
      };
    return ObjectGroupServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ObjectService
   * Contains all methods that get/create or update Objects and associated resource
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateObjectGroup
     * Status: STABLE
     * 
     * This creates a new ObjectGroup in the collection
     * </pre>
     */
    default void createObjectGroup(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.CreateObjectGroupRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.CreateObjectGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateObjectGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateObjectGroup
     * Status: STABLE
     * This creates an updated ObjectGroup
     * ObjectGroups are immutable
     * Updating an ObjectGroup will create a new Revision of the ObjectGroup
     * </pre>
     */
    default void updateObjectGroup(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.UpdateObjectGroupRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.UpdateObjectGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateObjectGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetObjectGroupById
     * Status: STABLE
     * 
     * This gets a specific ObjectGroup by ID
     * By default the latest revision is always returned, older revisions need to
     * be specified separately
     * </pre>
     */
    default void getObjectGroupById(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupByIdRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectGroupByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetObjectGroupsFromObject
     * Status: STABLE
     * This gets all ObjectGroups associated to a specific
     * Object Objects can be part of multiple ObjectGroups at once
     * </pre>
     */
    default void getObjectGroupsFromObject(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsFromObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsFromObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectGroupsFromObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetObjectGroups
     * Status: STABLE
     * This is a request that returns a (paginated) list of
     * ObjectGroups that contain a specific set of labels.
     * </pre>
     */
    default void getObjectGroups(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetObjectGroupHistory
     * Status: BETA
     * This requests a full history with all objectgroups
     * that are part of this objectgroups history
     * </pre>
     */
    default void getObjectGroupHistory(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupHistoryRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectGroupHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetObjectGroupObjects
     * Status: STABLE
     * Requests a list of paginated objects associated with this
     * specific objectgroup
     * </pre>
     */
    default void getObjectGroupObjects(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupObjectsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupObjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectGroupObjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteObjectGroup
     * Status: STABLE
     * 
     * This is a request that deletes a specified ObjectGroup
     * This does not delete the associated Objects
     * </pre>
     */
    default void deleteObjectGroup(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.DeleteObjectGroupRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.DeleteObjectGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteObjectGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddLabelsToObjectGroup 
     * Status: STABLE
     * This is a specific request to add new label(s)
     * to an existing object_group, in contrast to UpdateObjectGroup
     * this will not create a new revision for the specific object_group
     * Instead it will directly add the specified label(s) to the object_group
     * </pre>
     */
    default void addLabelsToObjectGroup(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.AddLabelsToObjectGroupRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.AddLabelsToObjectGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddLabelsToObjectGroupMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ObjectGroupService.
   * <pre>
   * ObjectService
   * Contains all methods that get/create or update Objects and associated resource
   * </pre>
   */
  public static abstract class ObjectGroupServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ObjectGroupServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ObjectGroupService.
   * <pre>
   * ObjectService
   * Contains all methods that get/create or update Objects and associated resource
   * </pre>
   */
  public static final class ObjectGroupServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ObjectGroupServiceStub> {
    private ObjectGroupServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectGroupServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObjectGroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateObjectGroup
     * Status: STABLE
     * 
     * This creates a new ObjectGroup in the collection
     * </pre>
     */
    public void createObjectGroup(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.CreateObjectGroupRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.CreateObjectGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateObjectGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateObjectGroup
     * Status: STABLE
     * This creates an updated ObjectGroup
     * ObjectGroups are immutable
     * Updating an ObjectGroup will create a new Revision of the ObjectGroup
     * </pre>
     */
    public void updateObjectGroup(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.UpdateObjectGroupRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.UpdateObjectGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateObjectGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetObjectGroupById
     * Status: STABLE
     * 
     * This gets a specific ObjectGroup by ID
     * By default the latest revision is always returned, older revisions need to
     * be specified separately
     * </pre>
     */
    public void getObjectGroupById(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupByIdRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectGroupByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetObjectGroupsFromObject
     * Status: STABLE
     * This gets all ObjectGroups associated to a specific
     * Object Objects can be part of multiple ObjectGroups at once
     * </pre>
     */
    public void getObjectGroupsFromObject(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsFromObjectRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsFromObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectGroupsFromObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetObjectGroups
     * Status: STABLE
     * This is a request that returns a (paginated) list of
     * ObjectGroups that contain a specific set of labels.
     * </pre>
     */
    public void getObjectGroups(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetObjectGroupHistory
     * Status: BETA
     * This requests a full history with all objectgroups
     * that are part of this objectgroups history
     * </pre>
     */
    public void getObjectGroupHistory(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupHistoryRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectGroupHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetObjectGroupObjects
     * Status: STABLE
     * Requests a list of paginated objects associated with this
     * specific objectgroup
     * </pre>
     */
    public void getObjectGroupObjects(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupObjectsRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupObjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectGroupObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteObjectGroup
     * Status: STABLE
     * 
     * This is a request that deletes a specified ObjectGroup
     * This does not delete the associated Objects
     * </pre>
     */
    public void deleteObjectGroup(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.DeleteObjectGroupRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.DeleteObjectGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteObjectGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddLabelsToObjectGroup 
     * Status: STABLE
     * This is a specific request to add new label(s)
     * to an existing object_group, in contrast to UpdateObjectGroup
     * this will not create a new revision for the specific object_group
     * Instead it will directly add the specified label(s) to the object_group
     * </pre>
     */
    public void addLabelsToObjectGroup(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.AddLabelsToObjectGroupRequest request,
        io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.AddLabelsToObjectGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddLabelsToObjectGroupMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ObjectGroupService.
   * <pre>
   * ObjectService
   * Contains all methods that get/create or update Objects and associated resource
   * </pre>
   */
  public static final class ObjectGroupServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ObjectGroupServiceBlockingStub> {
    private ObjectGroupServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectGroupServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObjectGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateObjectGroup
     * Status: STABLE
     * 
     * This creates a new ObjectGroup in the collection
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectgroupServiceProto.CreateObjectGroupResponse createObjectGroup(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.CreateObjectGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateObjectGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateObjectGroup
     * Status: STABLE
     * This creates an updated ObjectGroup
     * ObjectGroups are immutable
     * Updating an ObjectGroup will create a new Revision of the ObjectGroup
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectgroupServiceProto.UpdateObjectGroupResponse updateObjectGroup(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.UpdateObjectGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateObjectGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetObjectGroupById
     * Status: STABLE
     * 
     * This gets a specific ObjectGroup by ID
     * By default the latest revision is always returned, older revisions need to
     * be specified separately
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupByIdResponse getObjectGroupById(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectGroupByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetObjectGroupsFromObject
     * Status: STABLE
     * This gets all ObjectGroups associated to a specific
     * Object Objects can be part of multiple ObjectGroups at once
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsFromObjectResponse getObjectGroupsFromObject(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsFromObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectGroupsFromObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetObjectGroups
     * Status: STABLE
     * This is a request that returns a (paginated) list of
     * ObjectGroups that contain a specific set of labels.
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsResponse getObjectGroups(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetObjectGroupHistory
     * Status: BETA
     * This requests a full history with all objectgroups
     * that are part of this objectgroups history
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupHistoryResponse getObjectGroupHistory(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectGroupHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetObjectGroupObjects
     * Status: STABLE
     * Requests a list of paginated objects associated with this
     * specific objectgroup
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupObjectsResponse getObjectGroupObjects(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectGroupObjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteObjectGroup
     * Status: STABLE
     * 
     * This is a request that deletes a specified ObjectGroup
     * This does not delete the associated Objects
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectgroupServiceProto.DeleteObjectGroupResponse deleteObjectGroup(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.DeleteObjectGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteObjectGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddLabelsToObjectGroup 
     * Status: STABLE
     * This is a specific request to add new label(s)
     * to an existing object_group, in contrast to UpdateObjectGroup
     * this will not create a new revision for the specific object_group
     * Instead it will directly add the specified label(s) to the object_group
     * </pre>
     */
    public com.aruna.api.storage.services.v1.ObjectgroupServiceProto.AddLabelsToObjectGroupResponse addLabelsToObjectGroup(com.aruna.api.storage.services.v1.ObjectgroupServiceProto.AddLabelsToObjectGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddLabelsToObjectGroupMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ObjectGroupService.
   * <pre>
   * ObjectService
   * Contains all methods that get/create or update Objects and associated resource
   * </pre>
   */
  public static final class ObjectGroupServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ObjectGroupServiceFutureStub> {
    private ObjectGroupServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectGroupServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObjectGroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateObjectGroup
     * Status: STABLE
     * 
     * This creates a new ObjectGroup in the collection
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.CreateObjectGroupResponse> createObjectGroup(
        com.aruna.api.storage.services.v1.ObjectgroupServiceProto.CreateObjectGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateObjectGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateObjectGroup
     * Status: STABLE
     * This creates an updated ObjectGroup
     * ObjectGroups are immutable
     * Updating an ObjectGroup will create a new Revision of the ObjectGroup
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.UpdateObjectGroupResponse> updateObjectGroup(
        com.aruna.api.storage.services.v1.ObjectgroupServiceProto.UpdateObjectGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateObjectGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetObjectGroupById
     * Status: STABLE
     * 
     * This gets a specific ObjectGroup by ID
     * By default the latest revision is always returned, older revisions need to
     * be specified separately
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupByIdResponse> getObjectGroupById(
        com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectGroupByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetObjectGroupsFromObject
     * Status: STABLE
     * This gets all ObjectGroups associated to a specific
     * Object Objects can be part of multiple ObjectGroups at once
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsFromObjectResponse> getObjectGroupsFromObject(
        com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsFromObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectGroupsFromObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetObjectGroups
     * Status: STABLE
     * This is a request that returns a (paginated) list of
     * ObjectGroups that contain a specific set of labels.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsResponse> getObjectGroups(
        com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetObjectGroupHistory
     * Status: BETA
     * This requests a full history with all objectgroups
     * that are part of this objectgroups history
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupHistoryResponse> getObjectGroupHistory(
        com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectGroupHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetObjectGroupObjects
     * Status: STABLE
     * Requests a list of paginated objects associated with this
     * specific objectgroup
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupObjectsResponse> getObjectGroupObjects(
        com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupObjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectGroupObjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteObjectGroup
     * Status: STABLE
     * 
     * This is a request that deletes a specified ObjectGroup
     * This does not delete the associated Objects
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.DeleteObjectGroupResponse> deleteObjectGroup(
        com.aruna.api.storage.services.v1.ObjectgroupServiceProto.DeleteObjectGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteObjectGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddLabelsToObjectGroup 
     * Status: STABLE
     * This is a specific request to add new label(s)
     * to an existing object_group, in contrast to UpdateObjectGroup
     * this will not create a new revision for the specific object_group
     * Instead it will directly add the specified label(s) to the object_group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.AddLabelsToObjectGroupResponse> addLabelsToObjectGroup(
        com.aruna.api.storage.services.v1.ObjectgroupServiceProto.AddLabelsToObjectGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddLabelsToObjectGroupMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_OBJECT_GROUP = 0;
  private static final int METHODID_UPDATE_OBJECT_GROUP = 1;
  private static final int METHODID_GET_OBJECT_GROUP_BY_ID = 2;
  private static final int METHODID_GET_OBJECT_GROUPS_FROM_OBJECT = 3;
  private static final int METHODID_GET_OBJECT_GROUPS = 4;
  private static final int METHODID_GET_OBJECT_GROUP_HISTORY = 5;
  private static final int METHODID_GET_OBJECT_GROUP_OBJECTS = 6;
  private static final int METHODID_DELETE_OBJECT_GROUP = 7;
  private static final int METHODID_ADD_LABELS_TO_OBJECT_GROUP = 8;

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
        case METHODID_CREATE_OBJECT_GROUP:
          serviceImpl.createObjectGroup((com.aruna.api.storage.services.v1.ObjectgroupServiceProto.CreateObjectGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.CreateObjectGroupResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OBJECT_GROUP:
          serviceImpl.updateObjectGroup((com.aruna.api.storage.services.v1.ObjectgroupServiceProto.UpdateObjectGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.UpdateObjectGroupResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT_GROUP_BY_ID:
          serviceImpl.getObjectGroupById((com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupByIdResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT_GROUPS_FROM_OBJECT:
          serviceImpl.getObjectGroupsFromObject((com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsFromObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsFromObjectResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT_GROUPS:
          serviceImpl.getObjectGroups((com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT_GROUP_HISTORY:
          serviceImpl.getObjectGroupHistory((com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupHistoryResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT_GROUP_OBJECTS:
          serviceImpl.getObjectGroupObjects((com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupObjectsRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupObjectsResponse>) responseObserver);
          break;
        case METHODID_DELETE_OBJECT_GROUP:
          serviceImpl.deleteObjectGroup((com.aruna.api.storage.services.v1.ObjectgroupServiceProto.DeleteObjectGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.DeleteObjectGroupResponse>) responseObserver);
          break;
        case METHODID_ADD_LABELS_TO_OBJECT_GROUP:
          serviceImpl.addLabelsToObjectGroup((com.aruna.api.storage.services.v1.ObjectgroupServiceProto.AddLabelsToObjectGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.aruna.api.storage.services.v1.ObjectgroupServiceProto.AddLabelsToObjectGroupResponse>) responseObserver);
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
          getCreateObjectGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectgroupServiceProto.CreateObjectGroupRequest,
              com.aruna.api.storage.services.v1.ObjectgroupServiceProto.CreateObjectGroupResponse>(
                service, METHODID_CREATE_OBJECT_GROUP)))
        .addMethod(
          getUpdateObjectGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectgroupServiceProto.UpdateObjectGroupRequest,
              com.aruna.api.storage.services.v1.ObjectgroupServiceProto.UpdateObjectGroupResponse>(
                service, METHODID_UPDATE_OBJECT_GROUP)))
        .addMethod(
          getGetObjectGroupByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupByIdRequest,
              com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupByIdResponse>(
                service, METHODID_GET_OBJECT_GROUP_BY_ID)))
        .addMethod(
          getGetObjectGroupsFromObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsFromObjectRequest,
              com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsFromObjectResponse>(
                service, METHODID_GET_OBJECT_GROUPS_FROM_OBJECT)))
        .addMethod(
          getGetObjectGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsRequest,
              com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupsResponse>(
                service, METHODID_GET_OBJECT_GROUPS)))
        .addMethod(
          getGetObjectGroupHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupHistoryRequest,
              com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupHistoryResponse>(
                service, METHODID_GET_OBJECT_GROUP_HISTORY)))
        .addMethod(
          getGetObjectGroupObjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupObjectsRequest,
              com.aruna.api.storage.services.v1.ObjectgroupServiceProto.GetObjectGroupObjectsResponse>(
                service, METHODID_GET_OBJECT_GROUP_OBJECTS)))
        .addMethod(
          getDeleteObjectGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectgroupServiceProto.DeleteObjectGroupRequest,
              com.aruna.api.storage.services.v1.ObjectgroupServiceProto.DeleteObjectGroupResponse>(
                service, METHODID_DELETE_OBJECT_GROUP)))
        .addMethod(
          getAddLabelsToObjectGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aruna.api.storage.services.v1.ObjectgroupServiceProto.AddLabelsToObjectGroupRequest,
              com.aruna.api.storage.services.v1.ObjectgroupServiceProto.AddLabelsToObjectGroupResponse>(
                service, METHODID_ADD_LABELS_TO_OBJECT_GROUP)))
        .build();
  }

  private static abstract class ObjectGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ObjectGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aruna.api.storage.services.v1.ObjectgroupServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ObjectGroupService");
    }
  }

  private static final class ObjectGroupServiceFileDescriptorSupplier
      extends ObjectGroupServiceBaseDescriptorSupplier {
    ObjectGroupServiceFileDescriptorSupplier() {}
  }

  private static final class ObjectGroupServiceMethodDescriptorSupplier
      extends ObjectGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ObjectGroupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ObjectGroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ObjectGroupServiceFileDescriptorSupplier())
              .addMethod(getCreateObjectGroupMethod())
              .addMethod(getUpdateObjectGroupMethod())
              .addMethod(getGetObjectGroupByIdMethod())
              .addMethod(getGetObjectGroupsFromObjectMethod())
              .addMethod(getGetObjectGroupsMethod())
              .addMethod(getGetObjectGroupHistoryMethod())
              .addMethod(getGetObjectGroupObjectsMethod())
              .addMethod(getDeleteObjectGroupMethod())
              .addMethod(getAddLabelsToObjectGroupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
