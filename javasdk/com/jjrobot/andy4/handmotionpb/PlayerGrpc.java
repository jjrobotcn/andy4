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
    comments = "Source: player.proto")
public final class PlayerGrpc {

  private PlayerGrpc() {}

  public static final String SERVICE_NAME = "handsmotion.Player";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.PlayRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.PlayResponse> getPlayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Play",
      requestType = com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.PlayRequest.class,
      responseType = com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.PlayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.PlayRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.PlayResponse> getPlayMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.PlayRequest, com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.PlayResponse> getPlayMethod;
    if ((getPlayMethod = PlayerGrpc.getPlayMethod) == null) {
      synchronized (PlayerGrpc.class) {
        if ((getPlayMethod = PlayerGrpc.getPlayMethod) == null) {
          PlayerGrpc.getPlayMethod = getPlayMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.PlayRequest, com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.PlayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Play"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.PlayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.PlayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlayerMethodDescriptorSupplier("Play"))
              .build();
        }
      }
    }
    return getPlayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StopRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StopResponse> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StopRequest.class,
      responseType = com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StopRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StopResponse> getStopMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StopRequest, com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StopResponse> getStopMethod;
    if ((getStopMethod = PlayerGrpc.getStopMethod) == null) {
      synchronized (PlayerGrpc.class) {
        if ((getStopMethod = PlayerGrpc.getStopMethod) == null) {
          PlayerGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StopRequest, com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StopResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlayerMethodDescriptorSupplier("Stop"))
              .build();
        }
      }
    }
    return getStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.ResetRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.ResetResponse> getResetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reset",
      requestType = com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.ResetRequest.class,
      responseType = com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.ResetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.ResetRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.ResetResponse> getResetMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.ResetRequest, com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.ResetResponse> getResetMethod;
    if ((getResetMethod = PlayerGrpc.getResetMethod) == null) {
      synchronized (PlayerGrpc.class) {
        if ((getResetMethod = PlayerGrpc.getResetMethod) == null) {
          PlayerGrpc.getResetMethod = getResetMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.ResetRequest, com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.ResetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.ResetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.ResetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlayerMethodDescriptorSupplier("Reset"))
              .build();
        }
      }
    }
    return getResetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StateRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StateResponse> getStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "State",
      requestType = com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StateRequest.class,
      responseType = com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StateRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StateResponse> getStateMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StateRequest, com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StateResponse> getStateMethod;
    if ((getStateMethod = PlayerGrpc.getStateMethod) == null) {
      synchronized (PlayerGrpc.class) {
        if ((getStateMethod = PlayerGrpc.getStateMethod) == null) {
          PlayerGrpc.getStateMethod = getStateMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StateRequest, com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "State"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlayerMethodDescriptorSupplier("State"))
              .build();
        }
      }
    }
    return getStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.OnStateChangeRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.OnStateChangeResponse> getOnStateChangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnStateChange",
      requestType = com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.OnStateChangeRequest.class,
      responseType = com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.OnStateChangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.OnStateChangeRequest,
      com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.OnStateChangeResponse> getOnStateChangeMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.OnStateChangeRequest, com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.OnStateChangeResponse> getOnStateChangeMethod;
    if ((getOnStateChangeMethod = PlayerGrpc.getOnStateChangeMethod) == null) {
      synchronized (PlayerGrpc.class) {
        if ((getOnStateChangeMethod = PlayerGrpc.getOnStateChangeMethod) == null) {
          PlayerGrpc.getOnStateChangeMethod = getOnStateChangeMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.OnStateChangeRequest, com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.OnStateChangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnStateChange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.OnStateChangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.OnStateChangeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlayerMethodDescriptorSupplier("OnStateChange"))
              .build();
        }
      }
    }
    return getOnStateChangeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PlayerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayerStub>() {
        @java.lang.Override
        public PlayerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayerStub(channel, callOptions);
        }
      };
    return PlayerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PlayerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayerBlockingStub>() {
        @java.lang.Override
        public PlayerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayerBlockingStub(channel, callOptions);
        }
      };
    return PlayerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PlayerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayerFutureStub>() {
        @java.lang.Override
        public PlayerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayerFutureStub(channel, callOptions);
        }
      };
    return PlayerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PlayerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Play 播放手臂动作
     * </pre>
     */
    public void play(com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.PlayRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.PlayResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPlayMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop 停止手臂动作
     * </pre>
     */
    public void stop(com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StopRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StopResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reset 恢复手臂至初始位置
     * </pre>
     */
    public void reset(com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.ResetRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.ResetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getResetMethod(), responseObserver);
    }

    /**
     * <pre>
     * State 查询当前player状态
     * </pre>
     */
    public void state(com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StateRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * OnStateChange 监听当前player状态
     * </pre>
     */
    public void onStateChange(com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.OnStateChangeRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.OnStateChangeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOnStateChangeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPlayMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.PlayRequest,
                com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.PlayResponse>(
                  this, METHODID_PLAY)))
          .addMethod(
            getStopMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StopRequest,
                com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StopResponse>(
                  this, METHODID_STOP)))
          .addMethod(
            getResetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.ResetRequest,
                com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.ResetResponse>(
                  this, METHODID_RESET)))
          .addMethod(
            getStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StateRequest,
                com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StateResponse>(
                  this, METHODID_STATE)))
          .addMethod(
            getOnStateChangeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.OnStateChangeRequest,
                com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.OnStateChangeResponse>(
                  this, METHODID_ON_STATE_CHANGE)))
          .build();
    }
  }

  /**
   */
  public static final class PlayerStub extends io.grpc.stub.AbstractAsyncStub<PlayerStub> {
    private PlayerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Play 播放手臂动作
     * </pre>
     */
    public void play(com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.PlayRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.PlayResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPlayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop 停止手臂动作
     * </pre>
     */
    public void stop(com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StopRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StopResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reset 恢复手臂至初始位置
     * </pre>
     */
    public void reset(com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.ResetRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.ResetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * State 查询当前player状态
     * </pre>
     */
    public void state(com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StateRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OnStateChange 监听当前player状态
     * </pre>
     */
    public void onStateChange(com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.OnStateChangeRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.OnStateChangeResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getOnStateChangeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PlayerBlockingStub extends io.grpc.stub.AbstractBlockingStub<PlayerBlockingStub> {
    private PlayerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Play 播放手臂动作
     * </pre>
     */
    public com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.PlayResponse play(com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.PlayRequest request) {
      return blockingUnaryCall(
          getChannel(), getPlayMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop 停止手臂动作
     * </pre>
     */
    public com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StopResponse stop(com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StopRequest request) {
      return blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reset 恢复手臂至初始位置
     * </pre>
     */
    public com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.ResetResponse reset(com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.ResetRequest request) {
      return blockingUnaryCall(
          getChannel(), getResetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * State 查询当前player状态
     * </pre>
     */
    public com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StateResponse state(com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StateRequest request) {
      return blockingUnaryCall(
          getChannel(), getStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OnStateChange 监听当前player状态
     * </pre>
     */
    public java.util.Iterator<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.OnStateChangeResponse> onStateChange(
        com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.OnStateChangeRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getOnStateChangeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PlayerFutureStub extends io.grpc.stub.AbstractFutureStub<PlayerFutureStub> {
    private PlayerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Play 播放手臂动作
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.PlayResponse> play(
        com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.PlayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPlayMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop 停止手臂动作
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StopResponse> stop(
        com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StopRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reset 恢复手臂至初始位置
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.ResetResponse> reset(
        com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.ResetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getResetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * State 查询当前player状态
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StateResponse> state(
        com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PLAY = 0;
  private static final int METHODID_STOP = 1;
  private static final int METHODID_RESET = 2;
  private static final int METHODID_STATE = 3;
  private static final int METHODID_ON_STATE_CHANGE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PlayerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PlayerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PLAY:
          serviceImpl.play((com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.PlayRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.PlayResponse>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StopRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StopResponse>) responseObserver);
          break;
        case METHODID_RESET:
          serviceImpl.reset((com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.ResetRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.ResetResponse>) responseObserver);
          break;
        case METHODID_STATE:
          serviceImpl.state((com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StateRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.StateResponse>) responseObserver);
          break;
        case METHODID_ON_STATE_CHANGE:
          serviceImpl.onStateChange((com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.OnStateChangeRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.OnStateChangeResponse>) responseObserver);
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

  private static abstract class PlayerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PlayerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jjrobot.andy4.handmotionpb.HandMotionPlayerServicePB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Player");
    }
  }

  private static final class PlayerFileDescriptorSupplier
      extends PlayerBaseDescriptorSupplier {
    PlayerFileDescriptorSupplier() {}
  }

  private static final class PlayerMethodDescriptorSupplier
      extends PlayerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PlayerMethodDescriptorSupplier(String methodName) {
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
      synchronized (PlayerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PlayerFileDescriptorSupplier())
              .addMethod(getPlayMethod())
              .addMethod(getStopMethod())
              .addMethod(getResetMethod())
              .addMethod(getStateMethod())
              .addMethod(getOnStateChangeMethod())
              .build();
        }
      }
    }
    return result;
  }
}