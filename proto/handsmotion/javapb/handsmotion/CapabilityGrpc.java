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
    comments = "Source: capability.proto")
public final class CapabilityGrpc {

  private CapabilityGrpc() {}

  public static final String SERVICE_NAME = "handsmotion.Capability";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<handsmotion.CapabilityOuterClass.FingersAdjustmentRequest,
      handsmotion.CapabilityOuterClass.FingersAdjustmentResponse> getFingersAdjustmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FingersAdjustment",
      requestType = handsmotion.CapabilityOuterClass.FingersAdjustmentRequest.class,
      responseType = handsmotion.CapabilityOuterClass.FingersAdjustmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<handsmotion.CapabilityOuterClass.FingersAdjustmentRequest,
      handsmotion.CapabilityOuterClass.FingersAdjustmentResponse> getFingersAdjustmentMethod() {
    io.grpc.MethodDescriptor<handsmotion.CapabilityOuterClass.FingersAdjustmentRequest, handsmotion.CapabilityOuterClass.FingersAdjustmentResponse> getFingersAdjustmentMethod;
    if ((getFingersAdjustmentMethod = CapabilityGrpc.getFingersAdjustmentMethod) == null) {
      synchronized (CapabilityGrpc.class) {
        if ((getFingersAdjustmentMethod = CapabilityGrpc.getFingersAdjustmentMethod) == null) {
          CapabilityGrpc.getFingersAdjustmentMethod = getFingersAdjustmentMethod = 
              io.grpc.MethodDescriptor.<handsmotion.CapabilityOuterClass.FingersAdjustmentRequest, handsmotion.CapabilityOuterClass.FingersAdjustmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handsmotion.Capability", "FingersAdjustment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  handsmotion.CapabilityOuterClass.FingersAdjustmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  handsmotion.CapabilityOuterClass.FingersAdjustmentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CapabilityMethodDescriptorSupplier("FingersAdjustment"))
                  .build();
          }
        }
     }
     return getFingersAdjustmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<handsmotion.CapabilityOuterClass.ArmAdjustmentRequest,
      handsmotion.CapabilityOuterClass.ArmAdjustmentResponse> getArmAdjustmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ArmAdjustment",
      requestType = handsmotion.CapabilityOuterClass.ArmAdjustmentRequest.class,
      responseType = handsmotion.CapabilityOuterClass.ArmAdjustmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<handsmotion.CapabilityOuterClass.ArmAdjustmentRequest,
      handsmotion.CapabilityOuterClass.ArmAdjustmentResponse> getArmAdjustmentMethod() {
    io.grpc.MethodDescriptor<handsmotion.CapabilityOuterClass.ArmAdjustmentRequest, handsmotion.CapabilityOuterClass.ArmAdjustmentResponse> getArmAdjustmentMethod;
    if ((getArmAdjustmentMethod = CapabilityGrpc.getArmAdjustmentMethod) == null) {
      synchronized (CapabilityGrpc.class) {
        if ((getArmAdjustmentMethod = CapabilityGrpc.getArmAdjustmentMethod) == null) {
          CapabilityGrpc.getArmAdjustmentMethod = getArmAdjustmentMethod = 
              io.grpc.MethodDescriptor.<handsmotion.CapabilityOuterClass.ArmAdjustmentRequest, handsmotion.CapabilityOuterClass.ArmAdjustmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handsmotion.Capability", "ArmAdjustment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  handsmotion.CapabilityOuterClass.ArmAdjustmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  handsmotion.CapabilityOuterClass.ArmAdjustmentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CapabilityMethodDescriptorSupplier("ArmAdjustment"))
                  .build();
          }
        }
     }
     return getArmAdjustmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<handsmotion.CapabilityOuterClass.MarkAsOriginalPositionRequest,
      handsmotion.CapabilityOuterClass.MarkAsOriginalPositionResponse> getMarkAsOriginalPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarkAsOriginalPosition",
      requestType = handsmotion.CapabilityOuterClass.MarkAsOriginalPositionRequest.class,
      responseType = handsmotion.CapabilityOuterClass.MarkAsOriginalPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<handsmotion.CapabilityOuterClass.MarkAsOriginalPositionRequest,
      handsmotion.CapabilityOuterClass.MarkAsOriginalPositionResponse> getMarkAsOriginalPositionMethod() {
    io.grpc.MethodDescriptor<handsmotion.CapabilityOuterClass.MarkAsOriginalPositionRequest, handsmotion.CapabilityOuterClass.MarkAsOriginalPositionResponse> getMarkAsOriginalPositionMethod;
    if ((getMarkAsOriginalPositionMethod = CapabilityGrpc.getMarkAsOriginalPositionMethod) == null) {
      synchronized (CapabilityGrpc.class) {
        if ((getMarkAsOriginalPositionMethod = CapabilityGrpc.getMarkAsOriginalPositionMethod) == null) {
          CapabilityGrpc.getMarkAsOriginalPositionMethod = getMarkAsOriginalPositionMethod = 
              io.grpc.MethodDescriptor.<handsmotion.CapabilityOuterClass.MarkAsOriginalPositionRequest, handsmotion.CapabilityOuterClass.MarkAsOriginalPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handsmotion.Capability", "MarkAsOriginalPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  handsmotion.CapabilityOuterClass.MarkAsOriginalPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  handsmotion.CapabilityOuterClass.MarkAsOriginalPositionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CapabilityMethodDescriptorSupplier("MarkAsOriginalPosition"))
                  .build();
          }
        }
     }
     return getMarkAsOriginalPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<handsmotion.CapabilityOuterClass.GetAbsolutePositionRequest,
      handsmotion.CapabilityOuterClass.GetAbsolutePositionResponse> getGetAbsolutePositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAbsolutePosition",
      requestType = handsmotion.CapabilityOuterClass.GetAbsolutePositionRequest.class,
      responseType = handsmotion.CapabilityOuterClass.GetAbsolutePositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<handsmotion.CapabilityOuterClass.GetAbsolutePositionRequest,
      handsmotion.CapabilityOuterClass.GetAbsolutePositionResponse> getGetAbsolutePositionMethod() {
    io.grpc.MethodDescriptor<handsmotion.CapabilityOuterClass.GetAbsolutePositionRequest, handsmotion.CapabilityOuterClass.GetAbsolutePositionResponse> getGetAbsolutePositionMethod;
    if ((getGetAbsolutePositionMethod = CapabilityGrpc.getGetAbsolutePositionMethod) == null) {
      synchronized (CapabilityGrpc.class) {
        if ((getGetAbsolutePositionMethod = CapabilityGrpc.getGetAbsolutePositionMethod) == null) {
          CapabilityGrpc.getGetAbsolutePositionMethod = getGetAbsolutePositionMethod = 
              io.grpc.MethodDescriptor.<handsmotion.CapabilityOuterClass.GetAbsolutePositionRequest, handsmotion.CapabilityOuterClass.GetAbsolutePositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handsmotion.Capability", "GetAbsolutePosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  handsmotion.CapabilityOuterClass.GetAbsolutePositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  handsmotion.CapabilityOuterClass.GetAbsolutePositionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CapabilityMethodDescriptorSupplier("GetAbsolutePosition"))
                  .build();
          }
        }
     }
     return getGetAbsolutePositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<handsmotion.CapabilityOuterClass.AbsoluteMoveRequest,
      handsmotion.CapabilityOuterClass.AbsoluteMoveResponse> getAbsoluteMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AbsoluteMove",
      requestType = handsmotion.CapabilityOuterClass.AbsoluteMoveRequest.class,
      responseType = handsmotion.CapabilityOuterClass.AbsoluteMoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<handsmotion.CapabilityOuterClass.AbsoluteMoveRequest,
      handsmotion.CapabilityOuterClass.AbsoluteMoveResponse> getAbsoluteMoveMethod() {
    io.grpc.MethodDescriptor<handsmotion.CapabilityOuterClass.AbsoluteMoveRequest, handsmotion.CapabilityOuterClass.AbsoluteMoveResponse> getAbsoluteMoveMethod;
    if ((getAbsoluteMoveMethod = CapabilityGrpc.getAbsoluteMoveMethod) == null) {
      synchronized (CapabilityGrpc.class) {
        if ((getAbsoluteMoveMethod = CapabilityGrpc.getAbsoluteMoveMethod) == null) {
          CapabilityGrpc.getAbsoluteMoveMethod = getAbsoluteMoveMethod = 
              io.grpc.MethodDescriptor.<handsmotion.CapabilityOuterClass.AbsoluteMoveRequest, handsmotion.CapabilityOuterClass.AbsoluteMoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handsmotion.Capability", "AbsoluteMove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  handsmotion.CapabilityOuterClass.AbsoluteMoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  handsmotion.CapabilityOuterClass.AbsoluteMoveResponse.getDefaultInstance()))
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
    return new CapabilityStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CapabilityBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CapabilityBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CapabilityFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CapabilityFutureStub(channel);
  }

  /**
   */
  public static abstract class CapabilityImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 手指调整方法
     * 调整手指动作的开合与重置
     * </pre>
     */
    public void fingersAdjustment(handsmotion.CapabilityOuterClass.FingersAdjustmentRequest request,
        io.grpc.stub.StreamObserver<handsmotion.CapabilityOuterClass.FingersAdjustmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFingersAdjustmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * 手臂调整方法
     * 调整手臂位置重置、使能与失能。
     * 失能后可通过外力移动至相应位置后通过使能恢复锁定当前位置
     * </pre>
     */
    public void armAdjustment(handsmotion.CapabilityOuterClass.ArmAdjustmentRequest request,
        io.grpc.stub.StreamObserver<handsmotion.CapabilityOuterClass.ArmAdjustmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getArmAdjustmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * 标记当前位置为初始位置
     * 所有位置数据将基于此点进行计算
     * </pre>
     */
    public void markAsOriginalPosition(handsmotion.CapabilityOuterClass.MarkAsOriginalPositionRequest request,
        io.grpc.stub.StreamObserver<handsmotion.CapabilityOuterClass.MarkAsOriginalPositionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMarkAsOriginalPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取当前绝对位置
     * </pre>
     */
    public void getAbsolutePosition(handsmotion.CapabilityOuterClass.GetAbsolutePositionRequest request,
        io.grpc.stub.StreamObserver<handsmotion.CapabilityOuterClass.GetAbsolutePositionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAbsolutePositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * 绝对位置移动
     * </pre>
     */
    public void absoluteMove(handsmotion.CapabilityOuterClass.AbsoluteMoveRequest request,
        io.grpc.stub.StreamObserver<handsmotion.CapabilityOuterClass.AbsoluteMoveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAbsoluteMoveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFingersAdjustmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                handsmotion.CapabilityOuterClass.FingersAdjustmentRequest,
                handsmotion.CapabilityOuterClass.FingersAdjustmentResponse>(
                  this, METHODID_FINGERS_ADJUSTMENT)))
          .addMethod(
            getArmAdjustmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                handsmotion.CapabilityOuterClass.ArmAdjustmentRequest,
                handsmotion.CapabilityOuterClass.ArmAdjustmentResponse>(
                  this, METHODID_ARM_ADJUSTMENT)))
          .addMethod(
            getMarkAsOriginalPositionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                handsmotion.CapabilityOuterClass.MarkAsOriginalPositionRequest,
                handsmotion.CapabilityOuterClass.MarkAsOriginalPositionResponse>(
                  this, METHODID_MARK_AS_ORIGINAL_POSITION)))
          .addMethod(
            getGetAbsolutePositionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                handsmotion.CapabilityOuterClass.GetAbsolutePositionRequest,
                handsmotion.CapabilityOuterClass.GetAbsolutePositionResponse>(
                  this, METHODID_GET_ABSOLUTE_POSITION)))
          .addMethod(
            getAbsoluteMoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                handsmotion.CapabilityOuterClass.AbsoluteMoveRequest,
                handsmotion.CapabilityOuterClass.AbsoluteMoveResponse>(
                  this, METHODID_ABSOLUTE_MOVE)))
          .build();
    }
  }

  /**
   */
  public static final class CapabilityStub extends io.grpc.stub.AbstractStub<CapabilityStub> {
    private CapabilityStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CapabilityStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CapabilityStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CapabilityStub(channel, callOptions);
    }

    /**
     * <pre>
     * 手指调整方法
     * 调整手指动作的开合与重置
     * </pre>
     */
    public void fingersAdjustment(handsmotion.CapabilityOuterClass.FingersAdjustmentRequest request,
        io.grpc.stub.StreamObserver<handsmotion.CapabilityOuterClass.FingersAdjustmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFingersAdjustmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 手臂调整方法
     * 调整手臂位置重置、使能与失能。
     * 失能后可通过外力移动至相应位置后通过使能恢复锁定当前位置
     * </pre>
     */
    public void armAdjustment(handsmotion.CapabilityOuterClass.ArmAdjustmentRequest request,
        io.grpc.stub.StreamObserver<handsmotion.CapabilityOuterClass.ArmAdjustmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getArmAdjustmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 标记当前位置为初始位置
     * 所有位置数据将基于此点进行计算
     * </pre>
     */
    public void markAsOriginalPosition(handsmotion.CapabilityOuterClass.MarkAsOriginalPositionRequest request,
        io.grpc.stub.StreamObserver<handsmotion.CapabilityOuterClass.MarkAsOriginalPositionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMarkAsOriginalPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取当前绝对位置
     * </pre>
     */
    public void getAbsolutePosition(handsmotion.CapabilityOuterClass.GetAbsolutePositionRequest request,
        io.grpc.stub.StreamObserver<handsmotion.CapabilityOuterClass.GetAbsolutePositionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAbsolutePositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 绝对位置移动
     * </pre>
     */
    public void absoluteMove(handsmotion.CapabilityOuterClass.AbsoluteMoveRequest request,
        io.grpc.stub.StreamObserver<handsmotion.CapabilityOuterClass.AbsoluteMoveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAbsoluteMoveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CapabilityBlockingStub extends io.grpc.stub.AbstractStub<CapabilityBlockingStub> {
    private CapabilityBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CapabilityBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CapabilityBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CapabilityBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 手指调整方法
     * 调整手指动作的开合与重置
     * </pre>
     */
    public handsmotion.CapabilityOuterClass.FingersAdjustmentResponse fingersAdjustment(handsmotion.CapabilityOuterClass.FingersAdjustmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getFingersAdjustmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 手臂调整方法
     * 调整手臂位置重置、使能与失能。
     * 失能后可通过外力移动至相应位置后通过使能恢复锁定当前位置
     * </pre>
     */
    public handsmotion.CapabilityOuterClass.ArmAdjustmentResponse armAdjustment(handsmotion.CapabilityOuterClass.ArmAdjustmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getArmAdjustmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 标记当前位置为初始位置
     * 所有位置数据将基于此点进行计算
     * </pre>
     */
    public handsmotion.CapabilityOuterClass.MarkAsOriginalPositionResponse markAsOriginalPosition(handsmotion.CapabilityOuterClass.MarkAsOriginalPositionRequest request) {
      return blockingUnaryCall(
          getChannel(), getMarkAsOriginalPositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取当前绝对位置
     * </pre>
     */
    public handsmotion.CapabilityOuterClass.GetAbsolutePositionResponse getAbsolutePosition(handsmotion.CapabilityOuterClass.GetAbsolutePositionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAbsolutePositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 绝对位置移动
     * </pre>
     */
    public handsmotion.CapabilityOuterClass.AbsoluteMoveResponse absoluteMove(handsmotion.CapabilityOuterClass.AbsoluteMoveRequest request) {
      return blockingUnaryCall(
          getChannel(), getAbsoluteMoveMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CapabilityFutureStub extends io.grpc.stub.AbstractStub<CapabilityFutureStub> {
    private CapabilityFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CapabilityFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CapabilityFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CapabilityFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 手指调整方法
     * 调整手指动作的开合与重置
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<handsmotion.CapabilityOuterClass.FingersAdjustmentResponse> fingersAdjustment(
        handsmotion.CapabilityOuterClass.FingersAdjustmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFingersAdjustmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 手臂调整方法
     * 调整手臂位置重置、使能与失能。
     * 失能后可通过外力移动至相应位置后通过使能恢复锁定当前位置
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<handsmotion.CapabilityOuterClass.ArmAdjustmentResponse> armAdjustment(
        handsmotion.CapabilityOuterClass.ArmAdjustmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getArmAdjustmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 标记当前位置为初始位置
     * 所有位置数据将基于此点进行计算
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<handsmotion.CapabilityOuterClass.MarkAsOriginalPositionResponse> markAsOriginalPosition(
        handsmotion.CapabilityOuterClass.MarkAsOriginalPositionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMarkAsOriginalPositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取当前绝对位置
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<handsmotion.CapabilityOuterClass.GetAbsolutePositionResponse> getAbsolutePosition(
        handsmotion.CapabilityOuterClass.GetAbsolutePositionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAbsolutePositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 绝对位置移动
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<handsmotion.CapabilityOuterClass.AbsoluteMoveResponse> absoluteMove(
        handsmotion.CapabilityOuterClass.AbsoluteMoveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAbsoluteMoveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FINGERS_ADJUSTMENT = 0;
  private static final int METHODID_ARM_ADJUSTMENT = 1;
  private static final int METHODID_MARK_AS_ORIGINAL_POSITION = 2;
  private static final int METHODID_GET_ABSOLUTE_POSITION = 3;
  private static final int METHODID_ABSOLUTE_MOVE = 4;

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
          serviceImpl.fingersAdjustment((handsmotion.CapabilityOuterClass.FingersAdjustmentRequest) request,
              (io.grpc.stub.StreamObserver<handsmotion.CapabilityOuterClass.FingersAdjustmentResponse>) responseObserver);
          break;
        case METHODID_ARM_ADJUSTMENT:
          serviceImpl.armAdjustment((handsmotion.CapabilityOuterClass.ArmAdjustmentRequest) request,
              (io.grpc.stub.StreamObserver<handsmotion.CapabilityOuterClass.ArmAdjustmentResponse>) responseObserver);
          break;
        case METHODID_MARK_AS_ORIGINAL_POSITION:
          serviceImpl.markAsOriginalPosition((handsmotion.CapabilityOuterClass.MarkAsOriginalPositionRequest) request,
              (io.grpc.stub.StreamObserver<handsmotion.CapabilityOuterClass.MarkAsOriginalPositionResponse>) responseObserver);
          break;
        case METHODID_GET_ABSOLUTE_POSITION:
          serviceImpl.getAbsolutePosition((handsmotion.CapabilityOuterClass.GetAbsolutePositionRequest) request,
              (io.grpc.stub.StreamObserver<handsmotion.CapabilityOuterClass.GetAbsolutePositionResponse>) responseObserver);
          break;
        case METHODID_ABSOLUTE_MOVE:
          serviceImpl.absoluteMove((handsmotion.CapabilityOuterClass.AbsoluteMoveRequest) request,
              (io.grpc.stub.StreamObserver<handsmotion.CapabilityOuterClass.AbsoluteMoveResponse>) responseObserver);
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
      return handsmotion.CapabilityOuterClass.getDescriptor();
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
              .addMethod(getGetAbsolutePositionMethod())
              .addMethod(getAbsoluteMoveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
