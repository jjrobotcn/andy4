package com.jjrobot.andy4.headmotionpb;

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
 * <pre>
 * motionService.MotionService 头部运动功能的管理
 * motionService包含头部与手部（计划）的运动功能管理，
 * 目前手部运动功能将拆分为后续计划的handsmotion服务。
 * 为维护服务的一致性，保留motionService，但内部仅包含头部运动的设计。
 * 开发管理平台功能参考: http://10.10.10.2/motion/head/
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.1-SNAPSHOT)",
    comments = "Source: headmotion.proto")
public final class MotionServiceGrpc {

  private MotionServiceGrpc() {}

  public static final String SERVICE_NAME = "motionService.MotionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.MoveToRequest,
      com.jjrobot.andy4.headmotionpb.MotionServicePB.MoveToResponse> getMoveToMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveTo",
      requestType = com.jjrobot.andy4.headmotionpb.MotionServicePB.MoveToRequest.class,
      responseType = com.jjrobot.andy4.headmotionpb.MotionServicePB.MoveToResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.MoveToRequest,
      com.jjrobot.andy4.headmotionpb.MotionServicePB.MoveToResponse> getMoveToMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.MoveToRequest, com.jjrobot.andy4.headmotionpb.MotionServicePB.MoveToResponse> getMoveToMethod;
    if ((getMoveToMethod = MotionServiceGrpc.getMoveToMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getMoveToMethod = MotionServiceGrpc.getMoveToMethod) == null) {
          MotionServiceGrpc.getMoveToMethod = getMoveToMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.headmotionpb.MotionServicePB.MoveToRequest, com.jjrobot.andy4.headmotionpb.MotionServicePB.MoveToResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveTo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.headmotionpb.MotionServicePB.MoveToRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.headmotionpb.MotionServicePB.MoveToResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MotionServiceMethodDescriptorSupplier("MoveTo"))
              .build();
        }
      }
    }
    return getMoveToMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.PositioningDataRequest,
      com.jjrobot.andy4.headmotionpb.MotionServicePB.PositioningDataResponse> getPositioningDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PositioningData",
      requestType = com.jjrobot.andy4.headmotionpb.MotionServicePB.PositioningDataRequest.class,
      responseType = com.jjrobot.andy4.headmotionpb.MotionServicePB.PositioningDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.PositioningDataRequest,
      com.jjrobot.andy4.headmotionpb.MotionServicePB.PositioningDataResponse> getPositioningDataMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.PositioningDataRequest, com.jjrobot.andy4.headmotionpb.MotionServicePB.PositioningDataResponse> getPositioningDataMethod;
    if ((getPositioningDataMethod = MotionServiceGrpc.getPositioningDataMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getPositioningDataMethod = MotionServiceGrpc.getPositioningDataMethod) == null) {
          MotionServiceGrpc.getPositioningDataMethod = getPositioningDataMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.headmotionpb.MotionServicePB.PositioningDataRequest, com.jjrobot.andy4.headmotionpb.MotionServicePB.PositioningDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PositioningData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.headmotionpb.MotionServicePB.PositioningDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.headmotionpb.MotionServicePB.PositioningDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MotionServiceMethodDescriptorSupplier("PositioningData"))
              .build();
        }
      }
    }
    return getPositioningDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.GetPositionRequest,
      com.jjrobot.andy4.headmotionpb.MotionServicePB.GetPositionResponse> getGetPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPosition",
      requestType = com.jjrobot.andy4.headmotionpb.MotionServicePB.GetPositionRequest.class,
      responseType = com.jjrobot.andy4.headmotionpb.MotionServicePB.GetPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.GetPositionRequest,
      com.jjrobot.andy4.headmotionpb.MotionServicePB.GetPositionResponse> getGetPositionMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.GetPositionRequest, com.jjrobot.andy4.headmotionpb.MotionServicePB.GetPositionResponse> getGetPositionMethod;
    if ((getGetPositionMethod = MotionServiceGrpc.getGetPositionMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getGetPositionMethod = MotionServiceGrpc.getGetPositionMethod) == null) {
          MotionServiceGrpc.getGetPositionMethod = getGetPositionMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.headmotionpb.MotionServicePB.GetPositionRequest, com.jjrobot.andy4.headmotionpb.MotionServicePB.GetPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.headmotionpb.MotionServicePB.GetPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.headmotionpb.MotionServicePB.GetPositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MotionServiceMethodDescriptorSupplier("GetPosition"))
              .build();
        }
      }
    }
    return getGetPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.NewGroupRequest,
      com.jjrobot.andy4.headmotionpb.MotionServicePB.NewGroupResponse> getNewGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewGroup",
      requestType = com.jjrobot.andy4.headmotionpb.MotionServicePB.NewGroupRequest.class,
      responseType = com.jjrobot.andy4.headmotionpb.MotionServicePB.NewGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.NewGroupRequest,
      com.jjrobot.andy4.headmotionpb.MotionServicePB.NewGroupResponse> getNewGroupMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.NewGroupRequest, com.jjrobot.andy4.headmotionpb.MotionServicePB.NewGroupResponse> getNewGroupMethod;
    if ((getNewGroupMethod = MotionServiceGrpc.getNewGroupMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getNewGroupMethod = MotionServiceGrpc.getNewGroupMethod) == null) {
          MotionServiceGrpc.getNewGroupMethod = getNewGroupMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.headmotionpb.MotionServicePB.NewGroupRequest, com.jjrobot.andy4.headmotionpb.MotionServicePB.NewGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.headmotionpb.MotionServicePB.NewGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.headmotionpb.MotionServicePB.NewGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MotionServiceMethodDescriptorSupplier("NewGroup"))
              .build();
        }
      }
    }
    return getNewGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupsRequest,
      com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupsResponse> getListGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListGroups",
      requestType = com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupsRequest.class,
      responseType = com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupsRequest,
      com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupsResponse> getListGroupsMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupsRequest, com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupsResponse> getListGroupsMethod;
    if ((getListGroupsMethod = MotionServiceGrpc.getListGroupsMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getListGroupsMethod = MotionServiceGrpc.getListGroupsMethod) == null) {
          MotionServiceGrpc.getListGroupsMethod = getListGroupsMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupsRequest, com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MotionServiceMethodDescriptorSupplier("ListGroups"))
              .build();
        }
      }
    }
    return getListGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupRequest,
      com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupResponse> getUpdateGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGroup",
      requestType = com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupRequest.class,
      responseType = com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupRequest,
      com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupResponse> getUpdateGroupMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupRequest, com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupResponse> getUpdateGroupMethod;
    if ((getUpdateGroupMethod = MotionServiceGrpc.getUpdateGroupMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getUpdateGroupMethod = MotionServiceGrpc.getUpdateGroupMethod) == null) {
          MotionServiceGrpc.getUpdateGroupMethod = getUpdateGroupMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupRequest, com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MotionServiceMethodDescriptorSupplier("UpdateGroup"))
              .build();
        }
      }
    }
    return getUpdateGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.DeleteGroupsRequest,
      com.jjrobot.andy4.headmotionpb.MotionServicePB.DeleteGroupsResponse> getDeleteGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteGroups",
      requestType = com.jjrobot.andy4.headmotionpb.MotionServicePB.DeleteGroupsRequest.class,
      responseType = com.jjrobot.andy4.headmotionpb.MotionServicePB.DeleteGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.DeleteGroupsRequest,
      com.jjrobot.andy4.headmotionpb.MotionServicePB.DeleteGroupsResponse> getDeleteGroupsMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.DeleteGroupsRequest, com.jjrobot.andy4.headmotionpb.MotionServicePB.DeleteGroupsResponse> getDeleteGroupsMethod;
    if ((getDeleteGroupsMethod = MotionServiceGrpc.getDeleteGroupsMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getDeleteGroupsMethod = MotionServiceGrpc.getDeleteGroupsMethod) == null) {
          MotionServiceGrpc.getDeleteGroupsMethod = getDeleteGroupsMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.headmotionpb.MotionServicePB.DeleteGroupsRequest, com.jjrobot.andy4.headmotionpb.MotionServicePB.DeleteGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.headmotionpb.MotionServicePB.DeleteGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.headmotionpb.MotionServicePB.DeleteGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MotionServiceMethodDescriptorSupplier("DeleteGroups"))
              .build();
        }
      }
    }
    return getDeleteGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupTargetsRequest,
      com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupTargetsResponse> getListGroupTargetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListGroupTargets",
      requestType = com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupTargetsRequest.class,
      responseType = com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupTargetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupTargetsRequest,
      com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupTargetsResponse> getListGroupTargetsMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupTargetsRequest, com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupTargetsResponse> getListGroupTargetsMethod;
    if ((getListGroupTargetsMethod = MotionServiceGrpc.getListGroupTargetsMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getListGroupTargetsMethod = MotionServiceGrpc.getListGroupTargetsMethod) == null) {
          MotionServiceGrpc.getListGroupTargetsMethod = getListGroupTargetsMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupTargetsRequest, com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupTargetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListGroupTargets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupTargetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupTargetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MotionServiceMethodDescriptorSupplier("ListGroupTargets"))
              .build();
        }
      }
    }
    return getListGroupTargetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupTargetsRequest,
      com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupTargetsResponse> getUpdateGroupTargetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGroupTargets",
      requestType = com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupTargetsRequest.class,
      responseType = com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupTargetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupTargetsRequest,
      com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupTargetsResponse> getUpdateGroupTargetsMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupTargetsRequest, com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupTargetsResponse> getUpdateGroupTargetsMethod;
    if ((getUpdateGroupTargetsMethod = MotionServiceGrpc.getUpdateGroupTargetsMethod) == null) {
      synchronized (MotionServiceGrpc.class) {
        if ((getUpdateGroupTargetsMethod = MotionServiceGrpc.getUpdateGroupTargetsMethod) == null) {
          MotionServiceGrpc.getUpdateGroupTargetsMethod = getUpdateGroupTargetsMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupTargetsRequest, com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupTargetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGroupTargets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupTargetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupTargetsResponse.getDefaultInstance()))
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
    io.grpc.stub.AbstractStub.StubFactory<MotionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MotionServiceStub>() {
        @java.lang.Override
        public MotionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MotionServiceStub(channel, callOptions);
        }
      };
    return MotionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MotionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MotionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MotionServiceBlockingStub>() {
        @java.lang.Override
        public MotionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MotionServiceBlockingStub(channel, callOptions);
        }
      };
    return MotionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MotionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MotionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MotionServiceFutureStub>() {
        @java.lang.Override
        public MotionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MotionServiceFutureStub(channel, callOptions);
        }
      };
    return MotionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * motionService.MotionService 头部运动功能的管理
   * motionService包含头部与手部（计划）的运动功能管理，
   * 目前手部运动功能将拆分为后续计划的handsmotion服务。
   * 为维护服务的一致性，保留motionService，但内部仅包含头部运动的设计。
   * 开发管理平台功能参考: http://10.10.10.2/motion/head/
   * </pre>
   */
  public static abstract class MotionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * MoveTo 头部的移动
     * 通过预设组或定位方式移动头部
     * </pre>
     */
    public void moveTo(com.jjrobot.andy4.headmotionpb.MotionServicePB.MoveToRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.MoveToResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMoveToMethod(), responseObserver);
    }

    /**
     * <pre>
     * PositioningData 监听头部实时定位数据
     * 用于持续获取当前主轴与交叉轴的实时位置
     * 需要通过外力控制头部位置时可通过PositioningDataRequest.disability=true调节，
     * 详见PositioningDataRequest
     * </pre>
     */
    public void positioningData(com.jjrobot.andy4.headmotionpb.MotionServicePB.PositioningDataRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.PositioningDataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPositioningDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPosition 获取当前头部定位数据
     * 用于获取当前主轴与交叉轴的实时位置
     * </pre>
     */
    public void getPosition(com.jjrobot.andy4.headmotionpb.MotionServicePB.GetPositionRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.GetPositionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * NewGroup 创建头部位置预设组
     * </pre>
     */
    public void newGroup(com.jjrobot.andy4.headmotionpb.MotionServicePB.NewGroupRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.NewGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNewGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListGroups 获取头部位置预设组列表
     * </pre>
     */
    public void listGroups(com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateGroup 更新头部位置预设组
     * </pre>
     */
    public void updateGroup(com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteGroups 删除头部位置预设组列表
     * </pre>
     */
    public void deleteGroups(com.jjrobot.andy4.headmotionpb.MotionServicePB.DeleteGroupsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.DeleteGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListGroupTargets 获取头部位置预设组动作点列表
     * </pre>
     */
    public void listGroupTargets(com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupTargetsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupTargetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListGroupTargetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupTargets 更新头部位置预设组动作点列表
     * </pre>
     */
    public void updateGroupTargets(com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupTargetsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupTargetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateGroupTargetsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMoveToMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.headmotionpb.MotionServicePB.MoveToRequest,
                com.jjrobot.andy4.headmotionpb.MotionServicePB.MoveToResponse>(
                  this, METHODID_MOVE_TO)))
          .addMethod(
            getPositioningDataMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jjrobot.andy4.headmotionpb.MotionServicePB.PositioningDataRequest,
                com.jjrobot.andy4.headmotionpb.MotionServicePB.PositioningDataResponse>(
                  this, METHODID_POSITIONING_DATA)))
          .addMethod(
            getGetPositionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.headmotionpb.MotionServicePB.GetPositionRequest,
                com.jjrobot.andy4.headmotionpb.MotionServicePB.GetPositionResponse>(
                  this, METHODID_GET_POSITION)))
          .addMethod(
            getNewGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.headmotionpb.MotionServicePB.NewGroupRequest,
                com.jjrobot.andy4.headmotionpb.MotionServicePB.NewGroupResponse>(
                  this, METHODID_NEW_GROUP)))
          .addMethod(
            getListGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupsRequest,
                com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupsResponse>(
                  this, METHODID_LIST_GROUPS)))
          .addMethod(
            getUpdateGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupRequest,
                com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupResponse>(
                  this, METHODID_UPDATE_GROUP)))
          .addMethod(
            getDeleteGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.headmotionpb.MotionServicePB.DeleteGroupsRequest,
                com.jjrobot.andy4.headmotionpb.MotionServicePB.DeleteGroupsResponse>(
                  this, METHODID_DELETE_GROUPS)))
          .addMethod(
            getListGroupTargetsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupTargetsRequest,
                com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupTargetsResponse>(
                  this, METHODID_LIST_GROUP_TARGETS)))
          .addMethod(
            getUpdateGroupTargetsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupTargetsRequest,
                com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupTargetsResponse>(
                  this, METHODID_UPDATE_GROUP_TARGETS)))
          .build();
    }
  }

  /**
   * <pre>
   * motionService.MotionService 头部运动功能的管理
   * motionService包含头部与手部（计划）的运动功能管理，
   * 目前手部运动功能将拆分为后续计划的handsmotion服务。
   * 为维护服务的一致性，保留motionService，但内部仅包含头部运动的设计。
   * 开发管理平台功能参考: http://10.10.10.2/motion/head/
   * </pre>
   */
  public static final class MotionServiceStub extends io.grpc.stub.AbstractAsyncStub<MotionServiceStub> {
    private MotionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MotionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MotionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * MoveTo 头部的移动
     * 通过预设组或定位方式移动头部
     * </pre>
     */
    public void moveTo(com.jjrobot.andy4.headmotionpb.MotionServicePB.MoveToRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.MoveToResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMoveToMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PositioningData 监听头部实时定位数据
     * 用于持续获取当前主轴与交叉轴的实时位置
     * 需要通过外力控制头部位置时可通过PositioningDataRequest.disability=true调节，
     * 详见PositioningDataRequest
     * </pre>
     */
    public void positioningData(com.jjrobot.andy4.headmotionpb.MotionServicePB.PositioningDataRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.PositioningDataResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getPositioningDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetPosition 获取当前头部定位数据
     * 用于获取当前主轴与交叉轴的实时位置
     * </pre>
     */
    public void getPosition(com.jjrobot.andy4.headmotionpb.MotionServicePB.GetPositionRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.GetPositionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NewGroup 创建头部位置预设组
     * </pre>
     */
    public void newGroup(com.jjrobot.andy4.headmotionpb.MotionServicePB.NewGroupRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.NewGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNewGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListGroups 获取头部位置预设组列表
     * </pre>
     */
    public void listGroups(com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateGroup 更新头部位置预设组
     * </pre>
     */
    public void updateGroup(com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteGroups 删除头部位置预设组列表
     * </pre>
     */
    public void deleteGroups(com.jjrobot.andy4.headmotionpb.MotionServicePB.DeleteGroupsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.DeleteGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListGroupTargets 获取头部位置预设组动作点列表
     * </pre>
     */
    public void listGroupTargets(com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupTargetsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupTargetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListGroupTargetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupTargets 更新头部位置预设组动作点列表
     * </pre>
     */
    public void updateGroupTargets(com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupTargetsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupTargetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateGroupTargetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * motionService.MotionService 头部运动功能的管理
   * motionService包含头部与手部（计划）的运动功能管理，
   * 目前手部运动功能将拆分为后续计划的handsmotion服务。
   * 为维护服务的一致性，保留motionService，但内部仅包含头部运动的设计。
   * 开发管理平台功能参考: http://10.10.10.2/motion/head/
   * </pre>
   */
  public static final class MotionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MotionServiceBlockingStub> {
    private MotionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MotionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MotionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * MoveTo 头部的移动
     * 通过预设组或定位方式移动头部
     * </pre>
     */
    public com.jjrobot.andy4.headmotionpb.MotionServicePB.MoveToResponse moveTo(com.jjrobot.andy4.headmotionpb.MotionServicePB.MoveToRequest request) {
      return blockingUnaryCall(
          getChannel(), getMoveToMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PositioningData 监听头部实时定位数据
     * 用于持续获取当前主轴与交叉轴的实时位置
     * 需要通过外力控制头部位置时可通过PositioningDataRequest.disability=true调节，
     * 详见PositioningDataRequest
     * </pre>
     */
    public java.util.Iterator<com.jjrobot.andy4.headmotionpb.MotionServicePB.PositioningDataResponse> positioningData(
        com.jjrobot.andy4.headmotionpb.MotionServicePB.PositioningDataRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getPositioningDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPosition 获取当前头部定位数据
     * 用于获取当前主轴与交叉轴的实时位置
     * </pre>
     */
    public com.jjrobot.andy4.headmotionpb.MotionServicePB.GetPositionResponse getPosition(com.jjrobot.andy4.headmotionpb.MotionServicePB.GetPositionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NewGroup 创建头部位置预设组
     * </pre>
     */
    public com.jjrobot.andy4.headmotionpb.MotionServicePB.NewGroupResponse newGroup(com.jjrobot.andy4.headmotionpb.MotionServicePB.NewGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getNewGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListGroups 获取头部位置预设组列表
     * </pre>
     */
    public com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupsResponse listGroups(com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateGroup 更新头部位置预设组
     * </pre>
     */
    public com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupResponse updateGroup(com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteGroups 删除头部位置预设组列表
     * </pre>
     */
    public com.jjrobot.andy4.headmotionpb.MotionServicePB.DeleteGroupsResponse deleteGroups(com.jjrobot.andy4.headmotionpb.MotionServicePB.DeleteGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListGroupTargets 获取头部位置预设组动作点列表
     * </pre>
     */
    public com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupTargetsResponse listGroupTargets(com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupTargetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListGroupTargetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateGroupTargets 更新头部位置预设组动作点列表
     * </pre>
     */
    public com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupTargetsResponse updateGroupTargets(com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupTargetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateGroupTargetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * motionService.MotionService 头部运动功能的管理
   * motionService包含头部与手部（计划）的运动功能管理，
   * 目前手部运动功能将拆分为后续计划的handsmotion服务。
   * 为维护服务的一致性，保留motionService，但内部仅包含头部运动的设计。
   * 开发管理平台功能参考: http://10.10.10.2/motion/head/
   * </pre>
   */
  public static final class MotionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MotionServiceFutureStub> {
    private MotionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MotionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MotionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * MoveTo 头部的移动
     * 通过预设组或定位方式移动头部
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.headmotionpb.MotionServicePB.MoveToResponse> moveTo(
        com.jjrobot.andy4.headmotionpb.MotionServicePB.MoveToRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMoveToMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetPosition 获取当前头部定位数据
     * 用于获取当前主轴与交叉轴的实时位置
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.headmotionpb.MotionServicePB.GetPositionResponse> getPosition(
        com.jjrobot.andy4.headmotionpb.MotionServicePB.GetPositionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NewGroup 创建头部位置预设组
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.headmotionpb.MotionServicePB.NewGroupResponse> newGroup(
        com.jjrobot.andy4.headmotionpb.MotionServicePB.NewGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNewGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListGroups 获取头部位置预设组列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupsResponse> listGroups(
        com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateGroup 更新头部位置预设组
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupResponse> updateGroup(
        com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteGroups 删除头部位置预设组列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.headmotionpb.MotionServicePB.DeleteGroupsResponse> deleteGroups(
        com.jjrobot.andy4.headmotionpb.MotionServicePB.DeleteGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListGroupTargets 获取头部位置预设组动作点列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupTargetsResponse> listGroupTargets(
        com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupTargetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListGroupTargetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateGroupTargets 更新头部位置预设组动作点列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupTargetsResponse> updateGroupTargets(
        com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupTargetsRequest request) {
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
          serviceImpl.moveTo((com.jjrobot.andy4.headmotionpb.MotionServicePB.MoveToRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.MoveToResponse>) responseObserver);
          break;
        case METHODID_POSITIONING_DATA:
          serviceImpl.positioningData((com.jjrobot.andy4.headmotionpb.MotionServicePB.PositioningDataRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.PositioningDataResponse>) responseObserver);
          break;
        case METHODID_GET_POSITION:
          serviceImpl.getPosition((com.jjrobot.andy4.headmotionpb.MotionServicePB.GetPositionRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.GetPositionResponse>) responseObserver);
          break;
        case METHODID_NEW_GROUP:
          serviceImpl.newGroup((com.jjrobot.andy4.headmotionpb.MotionServicePB.NewGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.NewGroupResponse>) responseObserver);
          break;
        case METHODID_LIST_GROUPS:
          serviceImpl.listGroups((com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP:
          serviceImpl.updateGroup((com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupResponse>) responseObserver);
          break;
        case METHODID_DELETE_GROUPS:
          serviceImpl.deleteGroups((com.jjrobot.andy4.headmotionpb.MotionServicePB.DeleteGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.DeleteGroupsResponse>) responseObserver);
          break;
        case METHODID_LIST_GROUP_TARGETS:
          serviceImpl.listGroupTargets((com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupTargetsRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.ListGroupTargetsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP_TARGETS:
          serviceImpl.updateGroupTargets((com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupTargetsRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.headmotionpb.MotionServicePB.UpdateGroupTargetsResponse>) responseObserver);
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
      return com.jjrobot.andy4.headmotionpb.MotionServicePB.getDescriptor();
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
