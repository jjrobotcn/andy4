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
    comments = "Source: capability.proto")
public final class CapabilityGrpc {

  private CapabilityGrpc() {}

  public static final String SERVICE_NAME = "handsmotion.Capability";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.FingersAdjustmentRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.FingersAdjustmentResponse> getFingersAdjustmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FingersAdjustment",
      requestType = com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.FingersAdjustmentRequest.class,
      responseType = com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.FingersAdjustmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.FingersAdjustmentRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.FingersAdjustmentResponse> getFingersAdjustmentMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.FingersAdjustmentRequest, com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.FingersAdjustmentResponse> getFingersAdjustmentMethod;
    if ((getFingersAdjustmentMethod = CapabilityGrpc.getFingersAdjustmentMethod) == null) {
      synchronized (CapabilityGrpc.class) {
        if ((getFingersAdjustmentMethod = CapabilityGrpc.getFingersAdjustmentMethod) == null) {
          CapabilityGrpc.getFingersAdjustmentMethod = getFingersAdjustmentMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.FingersAdjustmentRequest, com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.FingersAdjustmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FingersAdjustment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.FingersAdjustmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.FingersAdjustmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CapabilityMethodDescriptorSupplier("FingersAdjustment"))
              .build();
        }
      }
    }
    return getFingersAdjustmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.ArmAdjustmentRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.ArmAdjustmentResponse> getArmAdjustmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ArmAdjustment",
      requestType = com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.ArmAdjustmentRequest.class,
      responseType = com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.ArmAdjustmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.ArmAdjustmentRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.ArmAdjustmentResponse> getArmAdjustmentMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.ArmAdjustmentRequest, com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.ArmAdjustmentResponse> getArmAdjustmentMethod;
    if ((getArmAdjustmentMethod = CapabilityGrpc.getArmAdjustmentMethod) == null) {
      synchronized (CapabilityGrpc.class) {
        if ((getArmAdjustmentMethod = CapabilityGrpc.getArmAdjustmentMethod) == null) {
          CapabilityGrpc.getArmAdjustmentMethod = getArmAdjustmentMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.ArmAdjustmentRequest, com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.ArmAdjustmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ArmAdjustment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.ArmAdjustmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.ArmAdjustmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CapabilityMethodDescriptorSupplier("ArmAdjustment"))
              .build();
        }
      }
    }
    return getArmAdjustmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.MarkAsOriginalPositionRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.MarkAsOriginalPositionResponse> getMarkAsOriginalPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarkAsOriginalPosition",
      requestType = com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.MarkAsOriginalPositionRequest.class,
      responseType = com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.MarkAsOriginalPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.MarkAsOriginalPositionRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.MarkAsOriginalPositionResponse> getMarkAsOriginalPositionMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.MarkAsOriginalPositionRequest, com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.MarkAsOriginalPositionResponse> getMarkAsOriginalPositionMethod;
    if ((getMarkAsOriginalPositionMethod = CapabilityGrpc.getMarkAsOriginalPositionMethod) == null) {
      synchronized (CapabilityGrpc.class) {
        if ((getMarkAsOriginalPositionMethod = CapabilityGrpc.getMarkAsOriginalPositionMethod) == null) {
          CapabilityGrpc.getMarkAsOriginalPositionMethod = getMarkAsOriginalPositionMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.MarkAsOriginalPositionRequest, com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.MarkAsOriginalPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarkAsOriginalPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.MarkAsOriginalPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.MarkAsOriginalPositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CapabilityMethodDescriptorSupplier("MarkAsOriginalPosition"))
              .build();
        }
      }
    }
    return getMarkAsOriginalPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.SetJointOriginPosRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.SetJointOriginPosResponse> getSetJointOriginPosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetJointOriginPos",
      requestType = com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.SetJointOriginPosRequest.class,
      responseType = com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.SetJointOriginPosResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.SetJointOriginPosRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.SetJointOriginPosResponse> getSetJointOriginPosMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.SetJointOriginPosRequest, com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.SetJointOriginPosResponse> getSetJointOriginPosMethod;
    if ((getSetJointOriginPosMethod = CapabilityGrpc.getSetJointOriginPosMethod) == null) {
      synchronized (CapabilityGrpc.class) {
        if ((getSetJointOriginPosMethod = CapabilityGrpc.getSetJointOriginPosMethod) == null) {
          CapabilityGrpc.getSetJointOriginPosMethod = getSetJointOriginPosMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.SetJointOriginPosRequest, com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.SetJointOriginPosResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetJointOriginPos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.SetJointOriginPosRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.SetJointOriginPosResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CapabilityMethodDescriptorSupplier("SetJointOriginPos"))
              .build();
        }
      }
    }
    return getSetJointOriginPosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.GetAbsolutePositionRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.GetAbsolutePositionResponse> getGetAbsolutePositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAbsolutePosition",
      requestType = com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.GetAbsolutePositionRequest.class,
      responseType = com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.GetAbsolutePositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.GetAbsolutePositionRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.GetAbsolutePositionResponse> getGetAbsolutePositionMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.GetAbsolutePositionRequest, com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.GetAbsolutePositionResponse> getGetAbsolutePositionMethod;
    if ((getGetAbsolutePositionMethod = CapabilityGrpc.getGetAbsolutePositionMethod) == null) {
      synchronized (CapabilityGrpc.class) {
        if ((getGetAbsolutePositionMethod = CapabilityGrpc.getGetAbsolutePositionMethod) == null) {
          CapabilityGrpc.getGetAbsolutePositionMethod = getGetAbsolutePositionMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.GetAbsolutePositionRequest, com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.GetAbsolutePositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAbsolutePosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.GetAbsolutePositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.GetAbsolutePositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CapabilityMethodDescriptorSupplier("GetAbsolutePosition"))
              .build();
        }
      }
    }
    return getGetAbsolutePositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.AbsoluteMoveRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.AbsoluteMoveResponse> getAbsoluteMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AbsoluteMove",
      requestType = com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.AbsoluteMoveRequest.class,
      responseType = com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.AbsoluteMoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.AbsoluteMoveRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.AbsoluteMoveResponse> getAbsoluteMoveMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.AbsoluteMoveRequest, com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.AbsoluteMoveResponse> getAbsoluteMoveMethod;
    if ((getAbsoluteMoveMethod = CapabilityGrpc.getAbsoluteMoveMethod) == null) {
      synchronized (CapabilityGrpc.class) {
        if ((getAbsoluteMoveMethod = CapabilityGrpc.getAbsoluteMoveMethod) == null) {
          CapabilityGrpc.getAbsoluteMoveMethod = getAbsoluteMoveMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.AbsoluteMoveRequest, com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.AbsoluteMoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AbsoluteMove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.AbsoluteMoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.AbsoluteMoveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CapabilityMethodDescriptorSupplier("AbsoluteMove"))
              .build();
        }
      }
    }
    return getAbsoluteMoveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CapabilityStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CapabilityStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CapabilityStub>() {
        @java.lang.Override
        public CapabilityStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CapabilityStub(channel, callOptions);
        }
      };
    return CapabilityStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CapabilityBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CapabilityBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CapabilityBlockingStub>() {
        @java.lang.Override
        public CapabilityBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CapabilityBlockingStub(channel, callOptions);
        }
      };
    return CapabilityBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CapabilityFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CapabilityFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CapabilityFutureStub>() {
        @java.lang.Override
        public CapabilityFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CapabilityFutureStub(channel, callOptions);
        }
      };
    return CapabilityFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CapabilityImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *调整手指动作的开合与重置
     * </pre>
     */
    public void fingersAdjustment(com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.FingersAdjustmentRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.FingersAdjustmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFingersAdjustmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * 调整手臂位置重置、使能与失能,失能后可通过外力移动至相应位置后通过使能恢复锁定当前位置
     * </pre>
     */
    public void armAdjustment(com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.ArmAdjustmentRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.ArmAdjustmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getArmAdjustmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * 标记当前位置为初始位置,所有位置数据将基于此点进行计算
     * </pre>
     */
    public void markAsOriginalPosition(com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.MarkAsOriginalPositionRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.MarkAsOriginalPositionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMarkAsOriginalPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * 设置手臂的原始点
     * </pre>
     */
    public void setJointOriginPos(com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.SetJointOriginPosRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.SetJointOriginPosResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetJointOriginPosMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取当前绝对位置
     * </pre>
     */
    public void getAbsolutePosition(com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.GetAbsolutePositionRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.GetAbsolutePositionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAbsolutePositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * 绝对位置移动
     * </pre>
     */
    public void absoluteMove(com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.AbsoluteMoveRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.AbsoluteMoveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAbsoluteMoveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFingersAdjustmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.FingersAdjustmentRequest,
                com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.FingersAdjustmentResponse>(
                  this, METHODID_FINGERS_ADJUSTMENT)))
          .addMethod(
            getArmAdjustmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.ArmAdjustmentRequest,
                com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.ArmAdjustmentResponse>(
                  this, METHODID_ARM_ADJUSTMENT)))
          .addMethod(
            getMarkAsOriginalPositionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.MarkAsOriginalPositionRequest,
                com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.MarkAsOriginalPositionResponse>(
                  this, METHODID_MARK_AS_ORIGINAL_POSITION)))
          .addMethod(
            getSetJointOriginPosMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.SetJointOriginPosRequest,
                com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.SetJointOriginPosResponse>(
                  this, METHODID_SET_JOINT_ORIGIN_POS)))
          .addMethod(
            getGetAbsolutePositionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.GetAbsolutePositionRequest,
                com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.GetAbsolutePositionResponse>(
                  this, METHODID_GET_ABSOLUTE_POSITION)))
          .addMethod(
            getAbsoluteMoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.AbsoluteMoveRequest,
                com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.AbsoluteMoveResponse>(
                  this, METHODID_ABSOLUTE_MOVE)))
          .build();
    }
  }

  /**
   */
  public static final class CapabilityStub extends io.grpc.stub.AbstractAsyncStub<CapabilityStub> {
    private CapabilityStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CapabilityStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CapabilityStub(channel, callOptions);
    }

    /**
     * <pre>
     *调整手指动作的开合与重置
     * </pre>
     */
    public void fingersAdjustment(com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.FingersAdjustmentRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.FingersAdjustmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFingersAdjustmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 调整手臂位置重置、使能与失能,失能后可通过外力移动至相应位置后通过使能恢复锁定当前位置
     * </pre>
     */
    public void armAdjustment(com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.ArmAdjustmentRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.ArmAdjustmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getArmAdjustmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 标记当前位置为初始位置,所有位置数据将基于此点进行计算
     * </pre>
     */
    public void markAsOriginalPosition(com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.MarkAsOriginalPositionRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.MarkAsOriginalPositionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMarkAsOriginalPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 设置手臂的原始点
     * </pre>
     */
    public void setJointOriginPos(com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.SetJointOriginPosRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.SetJointOriginPosResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetJointOriginPosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取当前绝对位置
     * </pre>
     */
    public void getAbsolutePosition(com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.GetAbsolutePositionRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.GetAbsolutePositionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAbsolutePositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 绝对位置移动
     * </pre>
     */
    public void absoluteMove(com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.AbsoluteMoveRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.AbsoluteMoveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAbsoluteMoveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CapabilityBlockingStub extends io.grpc.stub.AbstractBlockingStub<CapabilityBlockingStub> {
    private CapabilityBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CapabilityBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CapabilityBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *调整手指动作的开合与重置
     * </pre>
     */
    public com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.FingersAdjustmentResponse fingersAdjustment(com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.FingersAdjustmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getFingersAdjustmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 调整手臂位置重置、使能与失能,失能后可通过外力移动至相应位置后通过使能恢复锁定当前位置
     * </pre>
     */
    public com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.ArmAdjustmentResponse armAdjustment(com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.ArmAdjustmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getArmAdjustmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 标记当前位置为初始位置,所有位置数据将基于此点进行计算
     * </pre>
     */
    public com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.MarkAsOriginalPositionResponse markAsOriginalPosition(com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.MarkAsOriginalPositionRequest request) {
      return blockingUnaryCall(
          getChannel(), getMarkAsOriginalPositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 设置手臂的原始点
     * </pre>
     */
    public com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.SetJointOriginPosResponse setJointOriginPos(com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.SetJointOriginPosRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetJointOriginPosMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取当前绝对位置
     * </pre>
     */
    public com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.GetAbsolutePositionResponse getAbsolutePosition(com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.GetAbsolutePositionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAbsolutePositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 绝对位置移动
     * </pre>
     */
    public com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.AbsoluteMoveResponse absoluteMove(com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.AbsoluteMoveRequest request) {
      return blockingUnaryCall(
          getChannel(), getAbsoluteMoveMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CapabilityFutureStub extends io.grpc.stub.AbstractFutureStub<CapabilityFutureStub> {
    private CapabilityFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CapabilityFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CapabilityFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *调整手指动作的开合与重置
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.FingersAdjustmentResponse> fingersAdjustment(
        com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.FingersAdjustmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFingersAdjustmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 调整手臂位置重置、使能与失能,失能后可通过外力移动至相应位置后通过使能恢复锁定当前位置
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.ArmAdjustmentResponse> armAdjustment(
        com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.ArmAdjustmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getArmAdjustmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 标记当前位置为初始位置,所有位置数据将基于此点进行计算
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.MarkAsOriginalPositionResponse> markAsOriginalPosition(
        com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.MarkAsOriginalPositionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMarkAsOriginalPositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 设置手臂的原始点
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.SetJointOriginPosResponse> setJointOriginPos(
        com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.SetJointOriginPosRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetJointOriginPosMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取当前绝对位置
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.GetAbsolutePositionResponse> getAbsolutePosition(
        com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.GetAbsolutePositionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAbsolutePositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 绝对位置移动
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.AbsoluteMoveResponse> absoluteMove(
        com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.AbsoluteMoveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAbsoluteMoveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FINGERS_ADJUSTMENT = 0;
  private static final int METHODID_ARM_ADJUSTMENT = 1;
  private static final int METHODID_MARK_AS_ORIGINAL_POSITION = 2;
  private static final int METHODID_SET_JOINT_ORIGIN_POS = 3;
  private static final int METHODID_GET_ABSOLUTE_POSITION = 4;
  private static final int METHODID_ABSOLUTE_MOVE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CapabilityImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CapabilityImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FINGERS_ADJUSTMENT:
          serviceImpl.fingersAdjustment((com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.FingersAdjustmentRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.FingersAdjustmentResponse>) responseObserver);
          break;
        case METHODID_ARM_ADJUSTMENT:
          serviceImpl.armAdjustment((com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.ArmAdjustmentRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.ArmAdjustmentResponse>) responseObserver);
          break;
        case METHODID_MARK_AS_ORIGINAL_POSITION:
          serviceImpl.markAsOriginalPosition((com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.MarkAsOriginalPositionRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.MarkAsOriginalPositionResponse>) responseObserver);
          break;
        case METHODID_SET_JOINT_ORIGIN_POS:
          serviceImpl.setJointOriginPos((com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.SetJointOriginPosRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.SetJointOriginPosResponse>) responseObserver);
          break;
        case METHODID_GET_ABSOLUTE_POSITION:
          serviceImpl.getAbsolutePosition((com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.GetAbsolutePositionRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.GetAbsolutePositionResponse>) responseObserver);
          break;
        case METHODID_ABSOLUTE_MOVE:
          serviceImpl.absoluteMove((com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.AbsoluteMoveRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.AbsoluteMoveResponse>) responseObserver);
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

  private static abstract class CapabilityBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CapabilityBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jjrobot.andy4.handmotionpb.HandMotionCapabilityServicePB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Capability");
    }
  }

  private static final class CapabilityFileDescriptorSupplier
      extends CapabilityBaseDescriptorSupplier {
    CapabilityFileDescriptorSupplier() {}
  }

  private static final class CapabilityMethodDescriptorSupplier
      extends CapabilityBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CapabilityMethodDescriptorSupplier(String methodName) {
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
      synchronized (CapabilityGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CapabilityFileDescriptorSupplier())
              .addMethod(getFingersAdjustmentMethod())
              .addMethod(getArmAdjustmentMethod())
              .addMethod(getMarkAsOriginalPositionMethod())
              .addMethod(getSetJointOriginPosMethod())
              .addMethod(getGetAbsolutePositionMethod())
              .addMethod(getAbsoluteMoveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
