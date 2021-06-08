package handsmotion;

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
    value = "by gRPC proto compiler (version 1.22.2-SNAPSHOT)",
    comments = "Source: group.proto")
public final class GroupManagementGrpc {

  private GroupManagementGrpc() {}

  public static final String SERVICE_NAME = "handsmotion.GroupManagement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<handsmotion.Group.NewMotionGroupRequest,
      handsmotion.Group.NewMotionGroupResponse> getNewMotionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewMotionGroup",
      requestType = handsmotion.Group.NewMotionGroupRequest.class,
      responseType = handsmotion.Group.NewMotionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<handsmotion.Group.NewMotionGroupRequest,
      handsmotion.Group.NewMotionGroupResponse> getNewMotionGroupMethod() {
    io.grpc.MethodDescriptor<handsmotion.Group.NewMotionGroupRequest, handsmotion.Group.NewMotionGroupResponse> getNewMotionGroupMethod;
    if ((getNewMotionGroupMethod = GroupManagementGrpc.getNewMotionGroupMethod) == null) {
      synchronized (GroupManagementGrpc.class) {
        if ((getNewMotionGroupMethod = GroupManagementGrpc.getNewMotionGroupMethod) == null) {
          GroupManagementGrpc.getNewMotionGroupMethod = getNewMotionGroupMethod = 
              io.grpc.MethodDescriptor.<handsmotion.Group.NewMotionGroupRequest, handsmotion.Group.NewMotionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handsmotion.GroupManagement", "NewMotionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  handsmotion.Group.NewMotionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  handsmotion.Group.NewMotionGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupManagementMethodDescriptorSupplier("NewMotionGroup"))
                  .build();
          }
        }
     }
     return getNewMotionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<handsmotion.Group.ListMotionGroupsRequest,
      handsmotion.Group.ListMotionGroupsResponse> getListMotionGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMotionGroups",
      requestType = handsmotion.Group.ListMotionGroupsRequest.class,
      responseType = handsmotion.Group.ListMotionGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<handsmotion.Group.ListMotionGroupsRequest,
      handsmotion.Group.ListMotionGroupsResponse> getListMotionGroupsMethod() {
    io.grpc.MethodDescriptor<handsmotion.Group.ListMotionGroupsRequest, handsmotion.Group.ListMotionGroupsResponse> getListMotionGroupsMethod;
    if ((getListMotionGroupsMethod = GroupManagementGrpc.getListMotionGroupsMethod) == null) {
      synchronized (GroupManagementGrpc.class) {
        if ((getListMotionGroupsMethod = GroupManagementGrpc.getListMotionGroupsMethod) == null) {
          GroupManagementGrpc.getListMotionGroupsMethod = getListMotionGroupsMethod = 
              io.grpc.MethodDescriptor.<handsmotion.Group.ListMotionGroupsRequest, handsmotion.Group.ListMotionGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handsmotion.GroupManagement", "ListMotionGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  handsmotion.Group.ListMotionGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  handsmotion.Group.ListMotionGroupsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupManagementMethodDescriptorSupplier("ListMotionGroups"))
                  .build();
          }
        }
     }
     return getListMotionGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<handsmotion.Group.DeleteMotionGroupRequest,
      handsmotion.Group.DeleteMotionGroupResponse> getDeleteMotionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMotionGroup",
      requestType = handsmotion.Group.DeleteMotionGroupRequest.class,
      responseType = handsmotion.Group.DeleteMotionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<handsmotion.Group.DeleteMotionGroupRequest,
      handsmotion.Group.DeleteMotionGroupResponse> getDeleteMotionGroupMethod() {
    io.grpc.MethodDescriptor<handsmotion.Group.DeleteMotionGroupRequest, handsmotion.Group.DeleteMotionGroupResponse> getDeleteMotionGroupMethod;
    if ((getDeleteMotionGroupMethod = GroupManagementGrpc.getDeleteMotionGroupMethod) == null) {
      synchronized (GroupManagementGrpc.class) {
        if ((getDeleteMotionGroupMethod = GroupManagementGrpc.getDeleteMotionGroupMethod) == null) {
          GroupManagementGrpc.getDeleteMotionGroupMethod = getDeleteMotionGroupMethod = 
              io.grpc.MethodDescriptor.<handsmotion.Group.DeleteMotionGroupRequest, handsmotion.Group.DeleteMotionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handsmotion.GroupManagement", "DeleteMotionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  handsmotion.Group.DeleteMotionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  handsmotion.Group.DeleteMotionGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupManagementMethodDescriptorSupplier("DeleteMotionGroup"))
                  .build();
          }
        }
     }
     return getDeleteMotionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<handsmotion.Group.GetMotionGroupRequest,
      handsmotion.Group.GetMotionGroupResponse> getGetMotionGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMotionGroup",
      requestType = handsmotion.Group.GetMotionGroupRequest.class,
      responseType = handsmotion.Group.GetMotionGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<handsmotion.Group.GetMotionGroupRequest,
      handsmotion.Group.GetMotionGroupResponse> getGetMotionGroupMethod() {
    io.grpc.MethodDescriptor<handsmotion.Group.GetMotionGroupRequest, handsmotion.Group.GetMotionGroupResponse> getGetMotionGroupMethod;
    if ((getGetMotionGroupMethod = GroupManagementGrpc.getGetMotionGroupMethod) == null) {
      synchronized (GroupManagementGrpc.class) {
        if ((getGetMotionGroupMethod = GroupManagementGrpc.getGetMotionGroupMethod) == null) {
          GroupManagementGrpc.getGetMotionGroupMethod = getGetMotionGroupMethod = 
              io.grpc.MethodDescriptor.<handsmotion.Group.GetMotionGroupRequest, handsmotion.Group.GetMotionGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handsmotion.GroupManagement", "GetMotionGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  handsmotion.Group.GetMotionGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  handsmotion.Group.GetMotionGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupManagementMethodDescriptorSupplier("GetMotionGroup"))
                  .build();
          }
        }
     }
     return getGetMotionGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<handsmotion.Group.UpdateMotionMetaRequest,
      handsmotion.Group.UpdateMotionMetaResponse> getUpdateMotionGroupMetaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMotionGroupMeta",
      requestType = handsmotion.Group.UpdateMotionMetaRequest.class,
      responseType = handsmotion.Group.UpdateMotionMetaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<handsmotion.Group.UpdateMotionMetaRequest,
      handsmotion.Group.UpdateMotionMetaResponse> getUpdateMotionGroupMetaMethod() {
    io.grpc.MethodDescriptor<handsmotion.Group.UpdateMotionMetaRequest, handsmotion.Group.UpdateMotionMetaResponse> getUpdateMotionGroupMetaMethod;
    if ((getUpdateMotionGroupMetaMethod = GroupManagementGrpc.getUpdateMotionGroupMetaMethod) == null) {
      synchronized (GroupManagementGrpc.class) {
        if ((getUpdateMotionGroupMetaMethod = GroupManagementGrpc.getUpdateMotionGroupMetaMethod) == null) {
          GroupManagementGrpc.getUpdateMotionGroupMetaMethod = getUpdateMotionGroupMetaMethod = 
              io.grpc.MethodDescriptor.<handsmotion.Group.UpdateMotionMetaRequest, handsmotion.Group.UpdateMotionMetaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handsmotion.GroupManagement", "UpdateMotionGroupMeta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  handsmotion.Group.UpdateMotionMetaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  handsmotion.Group.UpdateMotionMetaResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupManagementMethodDescriptorSupplier("UpdateMotionGroupMeta"))
                  .build();
          }
        }
     }
     return getUpdateMotionGroupMetaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<handsmotion.Group.UpdateMotionScriptsRequest,
      handsmotion.Group.UpdateMotionScriptsResponse> getUpdateMotionGroupScriptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMotionGroupScripts",
      requestType = handsmotion.Group.UpdateMotionScriptsRequest.class,
      responseType = handsmotion.Group.UpdateMotionScriptsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<handsmotion.Group.UpdateMotionScriptsRequest,
      handsmotion.Group.UpdateMotionScriptsResponse> getUpdateMotionGroupScriptsMethod() {
    io.grpc.MethodDescriptor<handsmotion.Group.UpdateMotionScriptsRequest, handsmotion.Group.UpdateMotionScriptsResponse> getUpdateMotionGroupScriptsMethod;
    if ((getUpdateMotionGroupScriptsMethod = GroupManagementGrpc.getUpdateMotionGroupScriptsMethod) == null) {
      synchronized (GroupManagementGrpc.class) {
        if ((getUpdateMotionGroupScriptsMethod = GroupManagementGrpc.getUpdateMotionGroupScriptsMethod) == null) {
          GroupManagementGrpc.getUpdateMotionGroupScriptsMethod = getUpdateMotionGroupScriptsMethod = 
              io.grpc.MethodDescriptor.<handsmotion.Group.UpdateMotionScriptsRequest, handsmotion.Group.UpdateMotionScriptsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handsmotion.GroupManagement", "UpdateMotionGroupScripts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  handsmotion.Group.UpdateMotionScriptsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  handsmotion.Group.UpdateMotionScriptsResponse.getDefaultInstance()))
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
    return new GroupManagementStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupManagementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GroupManagementBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GroupManagementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GroupManagementFutureStub(channel);
  }

  /**
   */
  public static abstract class GroupManagementImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 新建动作分组
     * </pre>
     */
    public void newMotionGroup(handsmotion.Group.NewMotionGroupRequest request,
        io.grpc.stub.StreamObserver<handsmotion.Group.NewMotionGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNewMotionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取所有动作分组列表
     * </pre>
     */
    public void listMotionGroups(handsmotion.Group.ListMotionGroupsRequest request,
        io.grpc.stub.StreamObserver<handsmotion.Group.ListMotionGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMotionGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除动作分组
     * </pre>
     */
    public void deleteMotionGroup(handsmotion.Group.DeleteMotionGroupRequest request,
        io.grpc.stub.StreamObserver<handsmotion.Group.DeleteMotionGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMotionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取动作分组
     * </pre>
     */
    public void getMotionGroup(handsmotion.Group.GetMotionGroupRequest request,
        io.grpc.stub.StreamObserver<handsmotion.Group.GetMotionGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMotionGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更新动作分组Meta
     * </pre>
     */
    public void updateMotionGroupMeta(handsmotion.Group.UpdateMotionMetaRequest request,
        io.grpc.stub.StreamObserver<handsmotion.Group.UpdateMotionMetaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMotionGroupMetaMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更新动作分组Scripts
     * </pre>
     */
    public void updateMotionGroupScripts(handsmotion.Group.UpdateMotionScriptsRequest request,
        io.grpc.stub.StreamObserver<handsmotion.Group.UpdateMotionScriptsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMotionGroupScriptsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNewMotionGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                handsmotion.Group.NewMotionGroupRequest,
                handsmotion.Group.NewMotionGroupResponse>(
                  this, METHODID_NEW_MOTION_GROUP)))
          .addMethod(
            getListMotionGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                handsmotion.Group.ListMotionGroupsRequest,
                handsmotion.Group.ListMotionGroupsResponse>(
                  this, METHODID_LIST_MOTION_GROUPS)))
          .addMethod(
            getDeleteMotionGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                handsmotion.Group.DeleteMotionGroupRequest,
                handsmotion.Group.DeleteMotionGroupResponse>(
                  this, METHODID_DELETE_MOTION_GROUP)))
          .addMethod(
            getGetMotionGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                handsmotion.Group.GetMotionGroupRequest,
                handsmotion.Group.GetMotionGroupResponse>(
                  this, METHODID_GET_MOTION_GROUP)))
          .addMethod(
            getUpdateMotionGroupMetaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                handsmotion.Group.UpdateMotionMetaRequest,
                handsmotion.Group.UpdateMotionMetaResponse>(
                  this, METHODID_UPDATE_MOTION_GROUP_META)))
          .addMethod(
            getUpdateMotionGroupScriptsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                handsmotion.Group.UpdateMotionScriptsRequest,
                handsmotion.Group.UpdateMotionScriptsResponse>(
                  this, METHODID_UPDATE_MOTION_GROUP_SCRIPTS)))
          .build();
    }
  }

  /**
   */
  public static final class GroupManagementStub extends io.grpc.stub.AbstractStub<GroupManagementStub> {
    private GroupManagementStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupManagementStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupManagementStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupManagementStub(channel, callOptions);
    }

    /**
     * <pre>
     * 新建动作分组
     * </pre>
     */
    public void newMotionGroup(handsmotion.Group.NewMotionGroupRequest request,
        io.grpc.stub.StreamObserver<handsmotion.Group.NewMotionGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNewMotionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取所有动作分组列表
     * </pre>
     */
    public void listMotionGroups(handsmotion.Group.ListMotionGroupsRequest request,
        io.grpc.stub.StreamObserver<handsmotion.Group.ListMotionGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMotionGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除动作分组
     * </pre>
     */
    public void deleteMotionGroup(handsmotion.Group.DeleteMotionGroupRequest request,
        io.grpc.stub.StreamObserver<handsmotion.Group.DeleteMotionGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMotionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取动作分组
     * </pre>
     */
    public void getMotionGroup(handsmotion.Group.GetMotionGroupRequest request,
        io.grpc.stub.StreamObserver<handsmotion.Group.GetMotionGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMotionGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新动作分组Meta
     * </pre>
     */
    public void updateMotionGroupMeta(handsmotion.Group.UpdateMotionMetaRequest request,
        io.grpc.stub.StreamObserver<handsmotion.Group.UpdateMotionMetaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMotionGroupMetaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新动作分组Scripts
     * </pre>
     */
    public void updateMotionGroupScripts(handsmotion.Group.UpdateMotionScriptsRequest request,
        io.grpc.stub.StreamObserver<handsmotion.Group.UpdateMotionScriptsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMotionGroupScriptsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GroupManagementBlockingStub extends io.grpc.stub.AbstractStub<GroupManagementBlockingStub> {
    private GroupManagementBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupManagementBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupManagementBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupManagementBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 新建动作分组
     * </pre>
     */
    public handsmotion.Group.NewMotionGroupResponse newMotionGroup(handsmotion.Group.NewMotionGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getNewMotionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取所有动作分组列表
     * </pre>
     */
    public handsmotion.Group.ListMotionGroupsResponse listMotionGroups(handsmotion.Group.ListMotionGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMotionGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除动作分组
     * </pre>
     */
    public handsmotion.Group.DeleteMotionGroupResponse deleteMotionGroup(handsmotion.Group.DeleteMotionGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMotionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取动作分组
     * </pre>
     */
    public handsmotion.Group.GetMotionGroupResponse getMotionGroup(handsmotion.Group.GetMotionGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMotionGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新动作分组Meta
     * </pre>
     */
    public handsmotion.Group.UpdateMotionMetaResponse updateMotionGroupMeta(handsmotion.Group.UpdateMotionMetaRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMotionGroupMetaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新动作分组Scripts
     * </pre>
     */
    public handsmotion.Group.UpdateMotionScriptsResponse updateMotionGroupScripts(handsmotion.Group.UpdateMotionScriptsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMotionGroupScriptsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GroupManagementFutureStub extends io.grpc.stub.AbstractStub<GroupManagementFutureStub> {
    private GroupManagementFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupManagementFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupManagementFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupManagementFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 新建动作分组
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<handsmotion.Group.NewMotionGroupResponse> newMotionGroup(
        handsmotion.Group.NewMotionGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNewMotionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取所有动作分组列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<handsmotion.Group.ListMotionGroupsResponse> listMotionGroups(
        handsmotion.Group.ListMotionGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMotionGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除动作分组
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<handsmotion.Group.DeleteMotionGroupResponse> deleteMotionGroup(
        handsmotion.Group.DeleteMotionGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMotionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取动作分组
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<handsmotion.Group.GetMotionGroupResponse> getMotionGroup(
        handsmotion.Group.GetMotionGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMotionGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新动作分组Meta
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<handsmotion.Group.UpdateMotionMetaResponse> updateMotionGroupMeta(
        handsmotion.Group.UpdateMotionMetaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMotionGroupMetaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新动作分组Scripts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<handsmotion.Group.UpdateMotionScriptsResponse> updateMotionGroupScripts(
        handsmotion.Group.UpdateMotionScriptsRequest request) {
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
          serviceImpl.newMotionGroup((handsmotion.Group.NewMotionGroupRequest) request,
              (io.grpc.stub.StreamObserver<handsmotion.Group.NewMotionGroupResponse>) responseObserver);
          break;
        case METHODID_LIST_MOTION_GROUPS:
          serviceImpl.listMotionGroups((handsmotion.Group.ListMotionGroupsRequest) request,
              (io.grpc.stub.StreamObserver<handsmotion.Group.ListMotionGroupsResponse>) responseObserver);
          break;
        case METHODID_DELETE_MOTION_GROUP:
          serviceImpl.deleteMotionGroup((handsmotion.Group.DeleteMotionGroupRequest) request,
              (io.grpc.stub.StreamObserver<handsmotion.Group.DeleteMotionGroupResponse>) responseObserver);
          break;
        case METHODID_GET_MOTION_GROUP:
          serviceImpl.getMotionGroup((handsmotion.Group.GetMotionGroupRequest) request,
              (io.grpc.stub.StreamObserver<handsmotion.Group.GetMotionGroupResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MOTION_GROUP_META:
          serviceImpl.updateMotionGroupMeta((handsmotion.Group.UpdateMotionMetaRequest) request,
              (io.grpc.stub.StreamObserver<handsmotion.Group.UpdateMotionMetaResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MOTION_GROUP_SCRIPTS:
          serviceImpl.updateMotionGroupScripts((handsmotion.Group.UpdateMotionScriptsRequest) request,
              (io.grpc.stub.StreamObserver<handsmotion.Group.UpdateMotionScriptsResponse>) responseObserver);
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
      return handsmotion.Group.getDescriptor();
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
