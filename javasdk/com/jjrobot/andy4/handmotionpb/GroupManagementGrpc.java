package com.jjrobot.andy4.handmotionpb;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.1-SNAPSHOT)",
    comments = "Source: group.proto")
public final class GroupManagementGrpc {

  private GroupManagementGrpc() {}

  public static final String SERVICE_NAME = "handsmotion.GroupManagement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.NewMotionGroupRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.NewMotionGroupResponse> getNewMotionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewMotionGroup",
      requestType = com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.NewMotionGroupRequest.class,
      responseType = com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.NewMotionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.NewMotionGroupRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.NewMotionGroupResponse> getNewMotionGroupMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.NewMotionGroupRequest, com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.NewMotionGroupResponse> getNewMotionGroupMethod;
    if ((getNewMotionGroupMethod = GroupManagementGrpc.getNewMotionGroupMethod) == null) {
      synchronized (GroupManagementGrpc.class) {
        if ((getNewMotionGroupMethod = GroupManagementGrpc.getNewMotionGroupMethod) == null) {
          GroupManagementGrpc.getNewMotionGroupMethod = getNewMotionGroupMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.NewMotionGroupRequest, com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.NewMotionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewMotionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.NewMotionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.NewMotionGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupManagementMethodDescriptorSupplier("NewMotionGroup"))
              .build();
        }
      }
    }
    return getNewMotionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.ListMotionGroupsRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.ListMotionGroupsResponse> getListMotionGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMotionGroups",
      requestType = com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.ListMotionGroupsRequest.class,
      responseType = com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.ListMotionGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.ListMotionGroupsRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.ListMotionGroupsResponse> getListMotionGroupsMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.ListMotionGroupsRequest, com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.ListMotionGroupsResponse> getListMotionGroupsMethod;
    if ((getListMotionGroupsMethod = GroupManagementGrpc.getListMotionGroupsMethod) == null) {
      synchronized (GroupManagementGrpc.class) {
        if ((getListMotionGroupsMethod = GroupManagementGrpc.getListMotionGroupsMethod) == null) {
          GroupManagementGrpc.getListMotionGroupsMethod = getListMotionGroupsMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.ListMotionGroupsRequest, com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.ListMotionGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMotionGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.ListMotionGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.ListMotionGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupManagementMethodDescriptorSupplier("ListMotionGroups"))
              .build();
        }
      }
    }
    return getListMotionGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.DeleteMotionGroupRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.DeleteMotionGroupResponse> getDeleteMotionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMotionGroup",
      requestType = com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.DeleteMotionGroupRequest.class,
      responseType = com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.DeleteMotionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.DeleteMotionGroupRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.DeleteMotionGroupResponse> getDeleteMotionGroupMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.DeleteMotionGroupRequest, com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.DeleteMotionGroupResponse> getDeleteMotionGroupMethod;
    if ((getDeleteMotionGroupMethod = GroupManagementGrpc.getDeleteMotionGroupMethod) == null) {
      synchronized (GroupManagementGrpc.class) {
        if ((getDeleteMotionGroupMethod = GroupManagementGrpc.getDeleteMotionGroupMethod) == null) {
          GroupManagementGrpc.getDeleteMotionGroupMethod = getDeleteMotionGroupMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.DeleteMotionGroupRequest, com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.DeleteMotionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMotionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.DeleteMotionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.DeleteMotionGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupManagementMethodDescriptorSupplier("DeleteMotionGroup"))
              .build();
        }
      }
    }
    return getDeleteMotionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.GetMotionGroupRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.GetMotionGroupResponse> getGetMotionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMotionGroup",
      requestType = com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.GetMotionGroupRequest.class,
      responseType = com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.GetMotionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.GetMotionGroupRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.GetMotionGroupResponse> getGetMotionGroupMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.GetMotionGroupRequest, com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.GetMotionGroupResponse> getGetMotionGroupMethod;
    if ((getGetMotionGroupMethod = GroupManagementGrpc.getGetMotionGroupMethod) == null) {
      synchronized (GroupManagementGrpc.class) {
        if ((getGetMotionGroupMethod = GroupManagementGrpc.getGetMotionGroupMethod) == null) {
          GroupManagementGrpc.getGetMotionGroupMethod = getGetMotionGroupMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.GetMotionGroupRequest, com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.GetMotionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMotionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.GetMotionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.GetMotionGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupManagementMethodDescriptorSupplier("GetMotionGroup"))
              .build();
        }
      }
    }
    return getGetMotionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionMetaRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionMetaResponse> getUpdateMotionGroupMetaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMotionGroupMeta",
      requestType = com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionMetaRequest.class,
      responseType = com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionMetaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionMetaRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionMetaResponse> getUpdateMotionGroupMetaMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionMetaRequest, com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionMetaResponse> getUpdateMotionGroupMetaMethod;
    if ((getUpdateMotionGroupMetaMethod = GroupManagementGrpc.getUpdateMotionGroupMetaMethod) == null) {
      synchronized (GroupManagementGrpc.class) {
        if ((getUpdateMotionGroupMetaMethod = GroupManagementGrpc.getUpdateMotionGroupMetaMethod) == null) {
          GroupManagementGrpc.getUpdateMotionGroupMetaMethod = getUpdateMotionGroupMetaMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionMetaRequest, com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionMetaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMotionGroupMeta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionMetaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionMetaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupManagementMethodDescriptorSupplier("UpdateMotionGroupMeta"))
              .build();
        }
      }
    }
    return getUpdateMotionGroupMetaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionScriptsRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionScriptsResponse> getUpdateMotionGroupScriptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMotionGroupScripts",
      requestType = com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionScriptsRequest.class,
      responseType = com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionScriptsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionScriptsRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionScriptsResponse> getUpdateMotionGroupScriptsMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionScriptsRequest, com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionScriptsResponse> getUpdateMotionGroupScriptsMethod;
    if ((getUpdateMotionGroupScriptsMethod = GroupManagementGrpc.getUpdateMotionGroupScriptsMethod) == null) {
      synchronized (GroupManagementGrpc.class) {
        if ((getUpdateMotionGroupScriptsMethod = GroupManagementGrpc.getUpdateMotionGroupScriptsMethod) == null) {
          GroupManagementGrpc.getUpdateMotionGroupScriptsMethod = getUpdateMotionGroupScriptsMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionScriptsRequest, com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionScriptsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMotionGroupScripts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionScriptsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionScriptsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupManagementMethodDescriptorSupplier("UpdateMotionGroupScripts"))
              .build();
        }
      }
    }
    return getUpdateMotionGroupScriptsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroupManagementStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupManagementStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupManagementStub>() {
        @java.lang.Override
        public GroupManagementStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupManagementStub(channel, callOptions);
        }
      };
    return GroupManagementStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupManagementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupManagementBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupManagementBlockingStub>() {
        @java.lang.Override
        public GroupManagementBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupManagementBlockingStub(channel, callOptions);
        }
      };
    return GroupManagementBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GroupManagementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupManagementFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupManagementFutureStub>() {
        @java.lang.Override
        public GroupManagementFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupManagementFutureStub(channel, callOptions);
        }
      };
    return GroupManagementFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GroupManagementImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 新建动作分组
     * </pre>
     */
    public void newMotionGroup(com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.NewMotionGroupRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.NewMotionGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNewMotionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取所有动作分组列表
     * </pre>
     */
    public void listMotionGroups(com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.ListMotionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.ListMotionGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMotionGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除动作分组
     * </pre>
     */
    public void deleteMotionGroup(com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.DeleteMotionGroupRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.DeleteMotionGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMotionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取动作分组
     * </pre>
     */
    public void getMotionGroup(com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.GetMotionGroupRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.GetMotionGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMotionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更新动作分组Meta
     * </pre>
     */
    public void updateMotionGroupMeta(com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionMetaRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionMetaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMotionGroupMetaMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更新动作分组Scripts
     * </pre>
     */
    public void updateMotionGroupScripts(com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionScriptsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionScriptsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMotionGroupScriptsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNewMotionGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.NewMotionGroupRequest,
                com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.NewMotionGroupResponse>(
                  this, METHODID_NEW_MOTION_GROUP)))
          .addMethod(
            getListMotionGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.ListMotionGroupsRequest,
                com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.ListMotionGroupsResponse>(
                  this, METHODID_LIST_MOTION_GROUPS)))
          .addMethod(
            getDeleteMotionGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.DeleteMotionGroupRequest,
                com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.DeleteMotionGroupResponse>(
                  this, METHODID_DELETE_MOTION_GROUP)))
          .addMethod(
            getGetMotionGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.GetMotionGroupRequest,
                com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.GetMotionGroupResponse>(
                  this, METHODID_GET_MOTION_GROUP)))
          .addMethod(
            getUpdateMotionGroupMetaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionMetaRequest,
                com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionMetaResponse>(
                  this, METHODID_UPDATE_MOTION_GROUP_META)))
          .addMethod(
            getUpdateMotionGroupScriptsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionScriptsRequest,
                com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionScriptsResponse>(
                  this, METHODID_UPDATE_MOTION_GROUP_SCRIPTS)))
          .build();
    }
  }

  /**
   */
  public static final class GroupManagementStub extends io.grpc.stub.AbstractAsyncStub<GroupManagementStub> {
    private GroupManagementStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupManagementStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupManagementStub(channel, callOptions);
    }

    /**
     * <pre>
     * 新建动作分组
     * </pre>
     */
    public void newMotionGroup(com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.NewMotionGroupRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.NewMotionGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNewMotionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取所有动作分组列表
     * </pre>
     */
    public void listMotionGroups(com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.ListMotionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.ListMotionGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMotionGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除动作分组
     * </pre>
     */
    public void deleteMotionGroup(com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.DeleteMotionGroupRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.DeleteMotionGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMotionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取动作分组
     * </pre>
     */
    public void getMotionGroup(com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.GetMotionGroupRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.GetMotionGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMotionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新动作分组Meta
     * </pre>
     */
    public void updateMotionGroupMeta(com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionMetaRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionMetaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMotionGroupMetaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新动作分组Scripts
     * </pre>
     */
    public void updateMotionGroupScripts(com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionScriptsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionScriptsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMotionGroupScriptsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GroupManagementBlockingStub extends io.grpc.stub.AbstractBlockingStub<GroupManagementBlockingStub> {
    private GroupManagementBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupManagementBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupManagementBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 新建动作分组
     * </pre>
     */
    public com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.NewMotionGroupResponse newMotionGroup(com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.NewMotionGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getNewMotionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取所有动作分组列表
     * </pre>
     */
    public com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.ListMotionGroupsResponse listMotionGroups(com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.ListMotionGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMotionGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除动作分组
     * </pre>
     */
    public com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.DeleteMotionGroupResponse deleteMotionGroup(com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.DeleteMotionGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMotionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取动作分组
     * </pre>
     */
    public com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.GetMotionGroupResponse getMotionGroup(com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.GetMotionGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMotionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新动作分组Meta
     * </pre>
     */
    public com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionMetaResponse updateMotionGroupMeta(com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionMetaRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMotionGroupMetaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新动作分组Scripts
     * </pre>
     */
    public com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionScriptsResponse updateMotionGroupScripts(com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionScriptsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMotionGroupScriptsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GroupManagementFutureStub extends io.grpc.stub.AbstractFutureStub<GroupManagementFutureStub> {
    private GroupManagementFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupManagementFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupManagementFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 新建动作分组
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.NewMotionGroupResponse> newMotionGroup(
        com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.NewMotionGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNewMotionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取所有动作分组列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.ListMotionGroupsResponse> listMotionGroups(
        com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.ListMotionGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMotionGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除动作分组
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.DeleteMotionGroupResponse> deleteMotionGroup(
        com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.DeleteMotionGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMotionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取动作分组
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.GetMotionGroupResponse> getMotionGroup(
        com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.GetMotionGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMotionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新动作分组Meta
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionMetaResponse> updateMotionGroupMeta(
        com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionMetaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMotionGroupMetaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新动作分组Scripts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionScriptsResponse> updateMotionGroupScripts(
        com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionScriptsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMotionGroupScriptsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NEW_MOTION_GROUP = 0;
  private static final int METHODID_LIST_MOTION_GROUPS = 1;
  private static final int METHODID_DELETE_MOTION_GROUP = 2;
  private static final int METHODID_GET_MOTION_GROUP = 3;
  private static final int METHODID_UPDATE_MOTION_GROUP_META = 4;
  private static final int METHODID_UPDATE_MOTION_GROUP_SCRIPTS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GroupManagementImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GroupManagementImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NEW_MOTION_GROUP:
          serviceImpl.newMotionGroup((com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.NewMotionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.NewMotionGroupResponse>) responseObserver);
          break;
        case METHODID_LIST_MOTION_GROUPS:
          serviceImpl.listMotionGroups((com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.ListMotionGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.ListMotionGroupsResponse>) responseObserver);
          break;
        case METHODID_DELETE_MOTION_GROUP:
          serviceImpl.deleteMotionGroup((com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.DeleteMotionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.DeleteMotionGroupResponse>) responseObserver);
          break;
        case METHODID_GET_MOTION_GROUP:
          serviceImpl.getMotionGroup((com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.GetMotionGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.GetMotionGroupResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MOTION_GROUP_META:
          serviceImpl.updateMotionGroupMeta((com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionMetaRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionMetaResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MOTION_GROUP_SCRIPTS:
          serviceImpl.updateMotionGroupScripts((com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionScriptsRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.UpdateMotionScriptsResponse>) responseObserver);
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

  private static abstract class GroupManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GroupManagementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jjrobot.andy4.handmotionpb.HandMotionGroupServicePB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GroupManagement");
    }
  }

  private static final class GroupManagementFileDescriptorSupplier
      extends GroupManagementBaseDescriptorSupplier {
    GroupManagementFileDescriptorSupplier() {}
  }

  private static final class GroupManagementMethodDescriptorSupplier
      extends GroupManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GroupManagementMethodDescriptorSupplier(String methodName) {
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
      synchronized (GroupManagementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GroupManagementFileDescriptorSupplier())
              .addMethod(getNewMotionGroupMethod())
              .addMethod(getListMotionGroupsMethod())
              .addMethod(getDeleteMotionGroupMethod())
              .addMethod(getGetMotionGroupMethod())
              .addMethod(getUpdateMotionGroupMetaMethod())
              .addMethod(getUpdateMotionGroupScriptsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
