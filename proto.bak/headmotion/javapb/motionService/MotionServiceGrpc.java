package motionService;

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
    value = "by gRPC proto compiler (version 1.21.1-SNAPSHOT)",
    comments = "Source: headmotion.proto")
public final class MotionServiceGrpc {

  private MotionServiceGrpc() {}

  public static final String SERVICE_NAME = "motionService.MotionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<motionService.Headmotion.MoveToRequest,
      motionService.Headmotion.MoveToResponse> getMoveToMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveTo",
      requestType = motionService.Headmotion.MoveToRequest.class,
      responseType = motionService.Headmotion.MoveToResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<motionService.Headmotion.MoveToRequest,
      motionService.Headmotion.MoveToResponse> getMoveToMethod() {
    io.grpc.MethodDescriptor<motionService.Headmotion.MoveToRequest, motionService.Headmotion.MoveToResponse> getMoveToMethod;
    if ((getMoveToMethod = MotionServiceGrpc.getMoveToMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getMoveToMethod = MotionServiceGrpc.getMoveToMethod) == null) {
          MotionServiceGrpc.getMoveToMethod = getMoveToMethod = 
              io.grpc.MethodDescriptor.<motionService.Headmotion.MoveToRequest, motionService.Headmotion.MoveToResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "motionService.MotionService", "MoveTo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  motionService.Headmotion.MoveToRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  motionService.Headmotion.MoveToResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MotionServiceMethodDescriptorSupplier("MoveTo"))
                  .build();
          }
        }
     }
     return getMoveToMethod;
  }

  private static volatile io.grpc.MethodDescriptor<motionService.Headmotion.PositioningDataRequest,
      motionService.Headmotion.PositioningDataResponse> getPositioningDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PositioningData",
      requestType = motionService.Headmotion.PositioningDataRequest.class,
      responseType = motionService.Headmotion.PositioningDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<motionService.Headmotion.PositioningDataRequest,
      motionService.Headmotion.PositioningDataResponse> getPositioningDataMethod() {
    io.grpc.MethodDescriptor<motionService.Headmotion.PositioningDataRequest, motionService.Headmotion.PositioningDataResponse> getPositioningDataMethod;
    if ((getPositioningDataMethod = MotionServiceGrpc.getPositioningDataMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getPositioningDataMethod = MotionServiceGrpc.getPositioningDataMethod) == null) {
          MotionServiceGrpc.getPositioningDataMethod = getPositioningDataMethod = 
              io.grpc.MethodDescriptor.<motionService.Headmotion.PositioningDataRequest, motionService.Headmotion.PositioningDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "motionService.MotionService", "PositioningData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  motionService.Headmotion.PositioningDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  motionService.Headmotion.PositioningDataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MotionServiceMethodDescriptorSupplier("PositioningData"))
                  .build();
          }
        }
     }
     return getPositioningDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<motionService.Headmotion.GetPositionRequest,
      motionService.Headmotion.GetPositionResponse> getGetPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPosition",
      requestType = motionService.Headmotion.GetPositionRequest.class,
      responseType = motionService.Headmotion.GetPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<motionService.Headmotion.GetPositionRequest,
      motionService.Headmotion.GetPositionResponse> getGetPositionMethod() {
    io.grpc.MethodDescriptor<motionService.Headmotion.GetPositionRequest, motionService.Headmotion.GetPositionResponse> getGetPositionMethod;
    if ((getGetPositionMethod = MotionServiceGrpc.getGetPositionMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getGetPositionMethod = MotionServiceGrpc.getGetPositionMethod) == null) {
          MotionServiceGrpc.getGetPositionMethod = getGetPositionMethod = 
              io.grpc.MethodDescriptor.<motionService.Headmotion.GetPositionRequest, motionService.Headmotion.GetPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "motionService.MotionService", "GetPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  motionService.Headmotion.GetPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  motionService.Headmotion.GetPositionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MotionServiceMethodDescriptorSupplier("GetPosition"))
                  .build();
          }
        }
     }
     return getGetPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<motionService.Headmotion.NewGroupRequest,
      motionService.Headmotion.NewGroupResponse> getNewGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewGroup",
      requestType = motionService.Headmotion.NewGroupRequest.class,
      responseType = motionService.Headmotion.NewGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<motionService.Headmotion.NewGroupRequest,
      motionService.Headmotion.NewGroupResponse> getNewGroupMethod() {
    io.grpc.MethodDescriptor<motionService.Headmotion.NewGroupRequest, motionService.Headmotion.NewGroupResponse> getNewGroupMethod;
    if ((getNewGroupMethod = MotionServiceGrpc.getNewGroupMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getNewGroupMethod = MotionServiceGrpc.getNewGroupMethod) == null) {
          MotionServiceGrpc.getNewGroupMethod = getNewGroupMethod = 
              io.grpc.MethodDescriptor.<motionService.Headmotion.NewGroupRequest, motionService.Headmotion.NewGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "motionService.MotionService", "NewGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  motionService.Headmotion.NewGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  motionService.Headmotion.NewGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MotionServiceMethodDescriptorSupplier("NewGroup"))
                  .build();
          }
        }
     }
     return getNewGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<motionService.Headmotion.ListGroupsRequest,
      motionService.Headmotion.ListGroupsResponse> getListGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListGroups",
      requestType = motionService.Headmotion.ListGroupsRequest.class,
      responseType = motionService.Headmotion.ListGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<motionService.Headmotion.ListGroupsRequest,
      motionService.Headmotion.ListGroupsResponse> getListGroupsMethod() {
    io.grpc.MethodDescriptor<motionService.Headmotion.ListGroupsRequest, motionService.Headmotion.ListGroupsResponse> getListGroupsMethod;
    if ((getListGroupsMethod = MotionServiceGrpc.getListGroupsMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getListGroupsMethod = MotionServiceGrpc.getListGroupsMethod) == null) {
          MotionServiceGrpc.getListGroupsMethod = getListGroupsMethod = 
              io.grpc.MethodDescriptor.<motionService.Headmotion.ListGroupsRequest, motionService.Headmotion.ListGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "motionService.MotionService", "ListGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  motionService.Headmotion.ListGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  motionService.Headmotion.ListGroupsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MotionServiceMethodDescriptorSupplier("ListGroups"))
                  .build();
          }
        }
     }
     return getListGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<motionService.Headmotion.UpdateGroupRequest,
      motionService.Headmotion.UpdateGroupResponse> getUpdateGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGroup",
      requestType = motionService.Headmotion.UpdateGroupRequest.class,
      responseType = motionService.Headmotion.UpdateGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<motionService.Headmotion.UpdateGroupRequest,
      motionService.Headmotion.UpdateGroupResponse> getUpdateGroupMethod() {
    io.grpc.MethodDescriptor<motionService.Headmotion.UpdateGroupRequest, motionService.Headmotion.UpdateGroupResponse> getUpdateGroupMethod;
    if ((getUpdateGroupMethod = MotionServiceGrpc.getUpdateGroupMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getUpdateGroupMethod = MotionServiceGrpc.getUpdateGroupMethod) == null) {
          MotionServiceGrpc.getUpdateGroupMethod = getUpdateGroupMethod = 
              io.grpc.MethodDescriptor.<motionService.Headmotion.UpdateGroupRequest, motionService.Headmotion.UpdateGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "motionService.MotionService", "UpdateGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  motionService.Headmotion.UpdateGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  motionService.Headmotion.UpdateGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MotionServiceMethodDescriptorSupplier("UpdateGroup"))
                  .build();
          }
        }
     }
     return getUpdateGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<motionService.Headmotion.DeleteGroupsRequest,
      motionService.Headmotion.DeleteGroupsResponse> getDeleteGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteGroups",
      requestType = motionService.Headmotion.DeleteGroupsRequest.class,
      responseType = motionService.Headmotion.DeleteGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<motionService.Headmotion.DeleteGroupsRequest,
      motionService.Headmotion.DeleteGroupsResponse> getDeleteGroupsMethod() {
    io.grpc.MethodDescriptor<motionService.Headmotion.DeleteGroupsRequest, motionService.Headmotion.DeleteGroupsResponse> getDeleteGroupsMethod;
    if ((getDeleteGroupsMethod = MotionServiceGrpc.getDeleteGroupsMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getDeleteGroupsMethod = MotionServiceGrpc.getDeleteGroupsMethod) == null) {
          MotionServiceGrpc.getDeleteGroupsMethod = getDeleteGroupsMethod = 
              io.grpc.MethodDescriptor.<motionService.Headmotion.DeleteGroupsRequest, motionService.Headmotion.DeleteGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "motionService.MotionService", "DeleteGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  motionService.Headmotion.DeleteGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  motionService.Headmotion.DeleteGroupsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MotionServiceMethodDescriptorSupplier("DeleteGroups"))
                  .build();
          }
        }
     }
     return getDeleteGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<motionService.Headmotion.ListGroupTargetsRequest,
      motionService.Headmotion.ListGroupTargetsResponse> getListGroupTargetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListGroupTargets",
      requestType = motionService.Headmotion.ListGroupTargetsRequest.class,
      responseType = motionService.Headmotion.ListGroupTargetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<motionService.Headmotion.ListGroupTargetsRequest,
      motionService.Headmotion.ListGroupTargetsResponse> getListGroupTargetsMethod() {
    io.grpc.MethodDescriptor<motionService.Headmotion.ListGroupTargetsRequest, motionService.Headmotion.ListGroupTargetsResponse> getListGroupTargetsMethod;
    if ((getListGroupTargetsMethod = MotionServiceGrpc.getListGroupTargetsMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getListGroupTargetsMethod = MotionServiceGrpc.getListGroupTargetsMethod) == null) {
          MotionServiceGrpc.getListGroupTargetsMethod = getListGroupTargetsMethod = 
              io.grpc.MethodDescriptor.<motionService.Headmotion.ListGroupTargetsRequest, motionService.Headmotion.ListGroupTargetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "motionService.MotionService", "ListGroupTargets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  motionService.Headmotion.ListGroupTargetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  motionService.Headmotion.ListGroupTargetsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MotionServiceMethodDescriptorSupplier("ListGroupTargets"))
                  .build();
          }
        }
     }
     return getListGroupTargetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<motionService.Headmotion.UpdateGroupTargetsRequest,
      motionService.Headmotion.UpdateGroupTargetsResponse> getUpdateGroupTargetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGroupTargets",
      requestType = motionService.Headmotion.UpdateGroupTargetsRequest.class,
      responseType = motionService.Headmotion.UpdateGroupTargetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<motionService.Headmotion.UpdateGroupTargetsRequest,
      motionService.Headmotion.UpdateGroupTargetsResponse> getUpdateGroupTargetsMethod() {
    io.grpc.MethodDescriptor<motionService.Headmotion.UpdateGroupTargetsRequest, motionService.Headmotion.UpdateGroupTargetsResponse> getUpdateGroupTargetsMethod;
    if ((getUpdateGroupTargetsMethod = MotionServiceGrpc.getUpdateGroupTargetsMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getUpdateGroupTargetsMethod = MotionServiceGrpc.getUpdateGroupTargetsMethod) == null) {
          MotionServiceGrpc.getUpdateGroupTargetsMethod = getUpdateGroupTargetsMethod = 
              io.grpc.MethodDescriptor.<motionService.Headmotion.UpdateGroupTargetsRequest, motionService.Headmotion.UpdateGroupTargetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "motionService.MotionService", "UpdateGroupTargets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  motionService.Headmotion.UpdateGroupTargetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  motionService.Headmotion.UpdateGroupTargetsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MotionServiceMethodDescriptorSupplier("UpdateGroupTargets"))
                  .build();
          }
        }
     }
     return getUpdateGroupTargetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MotionServiceStub newStub(io.grpc.Channel channel) {
    return new MotionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MotionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MotionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MotionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MotionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MotionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 移动功能
     * </pre>
     */
    public void moveTo(motionService.Headmotion.MoveToRequest request,
        io.grpc.stub.StreamObserver<motionService.Headmotion.MoveToResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMoveToMethod(), responseObserver);
    }

    /**
     * <pre>
     * 持续监听位置消息
     * </pre>
     */
    public void positioningData(motionService.Headmotion.PositioningDataRequest request,
        io.grpc.stub.StreamObserver<motionService.Headmotion.PositioningDataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPositioningDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取当前位置信息
     * </pre>
     */
    public void getPosition(motionService.Headmotion.GetPositionRequest request,
        io.grpc.stub.StreamObserver<motionService.Headmotion.GetPositionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * 创建组
     * </pre>
     */
    public void newGroup(motionService.Headmotion.NewGroupRequest request,
        io.grpc.stub.StreamObserver<motionService.Headmotion.NewGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNewGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取组列表
     * </pre>
     */
    public void listGroups(motionService.Headmotion.ListGroupsRequest request,
        io.grpc.stub.StreamObserver<motionService.Headmotion.ListGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更新组信息
     * </pre>
     */
    public void updateGroup(motionService.Headmotion.UpdateGroupRequest request,
        io.grpc.stub.StreamObserver<motionService.Headmotion.UpdateGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除组列表
     * </pre>
     */
    public void deleteGroups(motionService.Headmotion.DeleteGroupsRequest request,
        io.grpc.stub.StreamObserver<motionService.Headmotion.DeleteGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取组动作点列表
     * </pre>
     */
    public void listGroupTargets(motionService.Headmotion.ListGroupTargetsRequest request,
        io.grpc.stub.StreamObserver<motionService.Headmotion.ListGroupTargetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListGroupTargetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更新组动作点列表
     * </pre>
     */
    public void updateGroupTargets(motionService.Headmotion.UpdateGroupTargetsRequest request,
        io.grpc.stub.StreamObserver<motionService.Headmotion.UpdateGroupTargetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateGroupTargetsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMoveToMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                motionService.Headmotion.MoveToRequest,
                motionService.Headmotion.MoveToResponse>(
                  this, METHODID_MOVE_TO)))
          .addMethod(
            getPositioningDataMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                motionService.Headmotion.PositioningDataRequest,
                motionService.Headmotion.PositioningDataResponse>(
                  this, METHODID_POSITIONING_DATA)))
          .addMethod(
            getGetPositionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                motionService.Headmotion.GetPositionRequest,
                motionService.Headmotion.GetPositionResponse>(
                  this, METHODID_GET_POSITION)))
          .addMethod(
            getNewGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                motionService.Headmotion.NewGroupRequest,
                motionService.Headmotion.NewGroupResponse>(
                  this, METHODID_NEW_GROUP)))
          .addMethod(
            getListGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                motionService.Headmotion.ListGroupsRequest,
                motionService.Headmotion.ListGroupsResponse>(
                  this, METHODID_LIST_GROUPS)))
          .addMethod(
            getUpdateGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                motionService.Headmotion.UpdateGroupRequest,
                motionService.Headmotion.UpdateGroupResponse>(
                  this, METHODID_UPDATE_GROUP)))
          .addMethod(
            getDeleteGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                motionService.Headmotion.DeleteGroupsRequest,
                motionService.Headmotion.DeleteGroupsResponse>(
                  this, METHODID_DELETE_GROUPS)))
          .addMethod(
            getListGroupTargetsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                motionService.Headmotion.ListGroupTargetsRequest,
                motionService.Headmotion.ListGroupTargetsResponse>(
                  this, METHODID_LIST_GROUP_TARGETS)))
          .addMethod(
            getUpdateGroupTargetsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                motionService.Headmotion.UpdateGroupTargetsRequest,
                motionService.Headmotion.UpdateGroupTargetsResponse>(
                  this, METHODID_UPDATE_GROUP_TARGETS)))
          .build();
    }
  }

  /**
   */
  public static final class MotionServiceStub extends io.grpc.stub.AbstractStub<MotionServiceStub> {
    private MotionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MotionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MotionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MotionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 移动功能
     * </pre>
     */
    public void moveTo(motionService.Headmotion.MoveToRequest request,
        io.grpc.stub.StreamObserver<motionService.Headmotion.MoveToResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMoveToMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 持续监听位置消息
     * </pre>
     */
    public void positioningData(motionService.Headmotion.PositioningDataRequest request,
        io.grpc.stub.StreamObserver<motionService.Headmotion.PositioningDataResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getPositioningDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取当前位置信息
     * </pre>
     */
    public void getPosition(motionService.Headmotion.GetPositionRequest request,
        io.grpc.stub.StreamObserver<motionService.Headmotion.GetPositionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 创建组
     * </pre>
     */
    public void newGroup(motionService.Headmotion.NewGroupRequest request,
        io.grpc.stub.StreamObserver<motionService.Headmotion.NewGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNewGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取组列表
     * </pre>
     */
    public void listGroups(motionService.Headmotion.ListGroupsRequest request,
        io.grpc.stub.StreamObserver<motionService.Headmotion.ListGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新组信息
     * </pre>
     */
    public void updateGroup(motionService.Headmotion.UpdateGroupRequest request,
        io.grpc.stub.StreamObserver<motionService.Headmotion.UpdateGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除组列表
     * </pre>
     */
    public void deleteGroups(motionService.Headmotion.DeleteGroupsRequest request,
        io.grpc.stub.StreamObserver<motionService.Headmotion.DeleteGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取组动作点列表
     * </pre>
     */
    public void listGroupTargets(motionService.Headmotion.ListGroupTargetsRequest request,
        io.grpc.stub.StreamObserver<motionService.Headmotion.ListGroupTargetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListGroupTargetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新组动作点列表
     * </pre>
     */
    public void updateGroupTargets(motionService.Headmotion.UpdateGroupTargetsRequest request,
        io.grpc.stub.StreamObserver<motionService.Headmotion.UpdateGroupTargetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateGroupTargetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MotionServiceBlockingStub extends io.grpc.stub.AbstractStub<MotionServiceBlockingStub> {
    private MotionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MotionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MotionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MotionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 移动功能
     * </pre>
     */
    public motionService.Headmotion.MoveToResponse moveTo(motionService.Headmotion.MoveToRequest request) {
      return blockingUnaryCall(
          getChannel(), getMoveToMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 持续监听位置消息
     * </pre>
     */
    public java.util.Iterator<motionService.Headmotion.PositioningDataResponse> positioningData(
        motionService.Headmotion.PositioningDataRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getPositioningDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取当前位置信息
     * </pre>
     */
    public motionService.Headmotion.GetPositionResponse getPosition(motionService.Headmotion.GetPositionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 创建组
     * </pre>
     */
    public motionService.Headmotion.NewGroupResponse newGroup(motionService.Headmotion.NewGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getNewGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取组列表
     * </pre>
     */
    public motionService.Headmotion.ListGroupsResponse listGroups(motionService.Headmotion.ListGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新组信息
     * </pre>
     */
    public motionService.Headmotion.UpdateGroupResponse updateGroup(motionService.Headmotion.UpdateGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除组列表
     * </pre>
     */
    public motionService.Headmotion.DeleteGroupsResponse deleteGroups(motionService.Headmotion.DeleteGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取组动作点列表
     * </pre>
     */
    public motionService.Headmotion.ListGroupTargetsResponse listGroupTargets(motionService.Headmotion.ListGroupTargetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListGroupTargetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新组动作点列表
     * </pre>
     */
    public motionService.Headmotion.UpdateGroupTargetsResponse updateGroupTargets(motionService.Headmotion.UpdateGroupTargetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateGroupTargetsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MotionServiceFutureStub extends io.grpc.stub.AbstractStub<MotionServiceFutureStub> {
    private MotionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MotionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MotionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MotionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 移动功能
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<motionService.Headmotion.MoveToResponse> moveTo(
        motionService.Headmotion.MoveToRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMoveToMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取当前位置信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<motionService.Headmotion.GetPositionResponse> getPosition(
        motionService.Headmotion.GetPositionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 创建组
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<motionService.Headmotion.NewGroupResponse> newGroup(
        motionService.Headmotion.NewGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNewGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取组列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<motionService.Headmotion.ListGroupsResponse> listGroups(
        motionService.Headmotion.ListGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新组信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<motionService.Headmotion.UpdateGroupResponse> updateGroup(
        motionService.Headmotion.UpdateGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除组列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<motionService.Headmotion.DeleteGroupsResponse> deleteGroups(
        motionService.Headmotion.DeleteGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取组动作点列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<motionService.Headmotion.ListGroupTargetsResponse> listGroupTargets(
        motionService.Headmotion.ListGroupTargetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListGroupTargetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新组动作点列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<motionService.Headmotion.UpdateGroupTargetsResponse> updateGroupTargets(
        motionService.Headmotion.UpdateGroupTargetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateGroupTargetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MOVE_TO = 0;
  private static final int METHODID_POSITIONING_DATA = 1;
  private static final int METHODID_GET_POSITION = 2;
  private static final int METHODID_NEW_GROUP = 3;
  private static final int METHODID_LIST_GROUPS = 4;
  private static final int METHODID_UPDATE_GROUP = 5;
  private static final int METHODID_DELETE_GROUPS = 6;
  private static final int METHODID_LIST_GROUP_TARGETS = 7;
  private static final int METHODID_UPDATE_GROUP_TARGETS = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MotionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MotionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MOVE_TO:
          serviceImpl.moveTo((motionService.Headmotion.MoveToRequest) request,
              (io.grpc.stub.StreamObserver<motionService.Headmotion.MoveToResponse>) responseObserver);
          break;
        case METHODID_POSITIONING_DATA:
          serviceImpl.positioningData((motionService.Headmotion.PositioningDataRequest) request,
              (io.grpc.stub.StreamObserver<motionService.Headmotion.PositioningDataResponse>) responseObserver);
          break;
        case METHODID_GET_POSITION:
          serviceImpl.getPosition((motionService.Headmotion.GetPositionRequest) request,
              (io.grpc.stub.StreamObserver<motionService.Headmotion.GetPositionResponse>) responseObserver);
          break;
        case METHODID_NEW_GROUP:
          serviceImpl.newGroup((motionService.Headmotion.NewGroupRequest) request,
              (io.grpc.stub.StreamObserver<motionService.Headmotion.NewGroupResponse>) responseObserver);
          break;
        case METHODID_LIST_GROUPS:
          serviceImpl.listGroups((motionService.Headmotion.ListGroupsRequest) request,
              (io.grpc.stub.StreamObserver<motionService.Headmotion.ListGroupsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP:
          serviceImpl.updateGroup((motionService.Headmotion.UpdateGroupRequest) request,
              (io.grpc.stub.StreamObserver<motionService.Headmotion.UpdateGroupResponse>) responseObserver);
          break;
        case METHODID_DELETE_GROUPS:
          serviceImpl.deleteGroups((motionService.Headmotion.DeleteGroupsRequest) request,
              (io.grpc.stub.StreamObserver<motionService.Headmotion.DeleteGroupsResponse>) responseObserver);
          break;
        case METHODID_LIST_GROUP_TARGETS:
          serviceImpl.listGroupTargets((motionService.Headmotion.ListGroupTargetsRequest) request,
              (io.grpc.stub.StreamObserver<motionService.Headmotion.ListGroupTargetsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP_TARGETS:
          serviceImpl.updateGroupTargets((motionService.Headmotion.UpdateGroupTargetsRequest) request,
              (io.grpc.stub.StreamObserver<motionService.Headmotion.UpdateGroupTargetsResponse>) responseObserver);
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

  private static abstract class MotionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MotionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return motionService.Headmotion.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MotionService");
    }
  }

  private static final class MotionServiceFileDescriptorSupplier
      extends MotionServiceBaseDescriptorSupplier {
    MotionServiceFileDescriptorSupplier() {}
  }

  private static final class MotionServiceMethodDescriptorSupplier
      extends MotionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MotionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MotionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MotionServiceFileDescriptorSupplier())
              .addMethod(getMoveToMethod())
              .addMethod(getPositioningDataMethod())
              .addMethod(getGetPositionMethod())
              .addMethod(getNewGroupMethod())
              .addMethod(getListGroupsMethod())
              .addMethod(getUpdateGroupMethod())
              .addMethod(getDeleteGroupsMethod())
              .addMethod(getListGroupTargetsMethod())
              .addMethod(getUpdateGroupTargetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
