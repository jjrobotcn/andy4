package com.jj-robot.andy4srv.handsmotion;

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
    comments = "Source: player.proto")
public final class PlayerGrpc {

  private PlayerGrpc() {}

  public static final String SERVICE_NAME = "handsmotion.Player";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlayRequest,
      com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlayResponse> getPlayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Play",
      requestType = com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlayRequest.class,
      responseType = com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlayRequest,
      com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlayResponse> getPlayMethod() {
    io.grpc.MethodDescriptor<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlayRequest, com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlayResponse> getPlayMethod;
    if ((getPlayMethod = PlayerGrpc.getPlayMethod) == null) {
      synchronized (PlayerGrpc.class) {
        if ((getPlayMethod = PlayerGrpc.getPlayMethod) == null) {
          PlayerGrpc.getPlayMethod = getPlayMethod = 
              io.grpc.MethodDescriptor.<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlayRequest, com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handsmotion.Player", "Play"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlayResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PlayerMethodDescriptorSupplier("Play"))
                  .build();
          }
        }
     }
     return getPlayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StopRequest,
      com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StopResponse> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StopRequest.class,
      responseType = com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StopRequest,
      com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StopResponse> getStopMethod() {
    io.grpc.MethodDescriptor<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StopRequest, com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StopResponse> getStopMethod;
    if ((getStopMethod = PlayerGrpc.getStopMethod) == null) {
      synchronized (PlayerGrpc.class) {
        if ((getStopMethod = PlayerGrpc.getStopMethod) == null) {
          PlayerGrpc.getStopMethod = getStopMethod = 
              io.grpc.MethodDescriptor.<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StopRequest, com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handsmotion.Player", "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StopResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PlayerMethodDescriptorSupplier("Stop"))
                  .build();
          }
        }
     }
     return getStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.ResetRequest,
      com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.ResetResponse> getResetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reset",
      requestType = com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.ResetRequest.class,
      responseType = com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.ResetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.ResetRequest,
      com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.ResetResponse> getResetMethod() {
    io.grpc.MethodDescriptor<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.ResetRequest, com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.ResetResponse> getResetMethod;
    if ((getResetMethod = PlayerGrpc.getResetMethod) == null) {
      synchronized (PlayerGrpc.class) {
        if ((getResetMethod = PlayerGrpc.getResetMethod) == null) {
          PlayerGrpc.getResetMethod = getResetMethod = 
              io.grpc.MethodDescriptor.<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.ResetRequest, com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.ResetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handsmotion.Player", "Reset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.ResetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.ResetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PlayerMethodDescriptorSupplier("Reset"))
                  .build();
          }
        }
     }
     return getResetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlaylistRequest,
      com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlaylistResponse> getPlaylistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Playlist",
      requestType = com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlaylistRequest.class,
      responseType = com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlaylistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlaylistRequest,
      com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlaylistResponse> getPlaylistMethod() {
    io.grpc.MethodDescriptor<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlaylistRequest, com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlaylistResponse> getPlaylistMethod;
    if ((getPlaylistMethod = PlayerGrpc.getPlaylistMethod) == null) {
      synchronized (PlayerGrpc.class) {
        if ((getPlaylistMethod = PlayerGrpc.getPlaylistMethod) == null) {
          PlayerGrpc.getPlaylistMethod = getPlaylistMethod = 
              io.grpc.MethodDescriptor.<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlaylistRequest, com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlaylistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handsmotion.Player", "Playlist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlaylistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlaylistResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PlayerMethodDescriptorSupplier("Playlist"))
                  .build();
          }
        }
     }
     return getPlaylistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StateRequest,
      com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StateResponse> getStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "State",
      requestType = com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StateRequest.class,
      responseType = com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StateRequest,
      com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StateResponse> getStateMethod() {
    io.grpc.MethodDescriptor<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StateRequest, com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StateResponse> getStateMethod;
    if ((getStateMethod = PlayerGrpc.getStateMethod) == null) {
      synchronized (PlayerGrpc.class) {
        if ((getStateMethod = PlayerGrpc.getStateMethod) == null) {
          PlayerGrpc.getStateMethod = getStateMethod = 
              io.grpc.MethodDescriptor.<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StateRequest, com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handsmotion.Player", "State"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PlayerMethodDescriptorSupplier("State"))
                  .build();
          }
        }
     }
     return getStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.OnStateChangeRequest,
      com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.OnStateChangeResponse> getOnStateChangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnStateChange",
      requestType = com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.OnStateChangeRequest.class,
      responseType = com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.OnStateChangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.OnStateChangeRequest,
      com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.OnStateChangeResponse> getOnStateChangeMethod() {
    io.grpc.MethodDescriptor<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.OnStateChangeRequest, com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.OnStateChangeResponse> getOnStateChangeMethod;
    if ((getOnStateChangeMethod = PlayerGrpc.getOnStateChangeMethod) == null) {
      synchronized (PlayerGrpc.class) {
        if ((getOnStateChangeMethod = PlayerGrpc.getOnStateChangeMethod) == null) {
          PlayerGrpc.getOnStateChangeMethod = getOnStateChangeMethod = 
              io.grpc.MethodDescriptor.<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.OnStateChangeRequest, com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.OnStateChangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "handsmotion.Player", "OnStateChange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.OnStateChangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.OnStateChangeResponse.getDefaultInstance()))
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
    return new PlayerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PlayerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PlayerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PlayerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PlayerFutureStub(channel);
  }

  /**
   */
  public static abstract class PlayerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Play为播放动作组对象方法
     * </pre>
     */
    public void play(com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlayRequest request,
        io.grpc.stub.StreamObserver<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlayResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPlayMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop为停止动作组对象方法
     * </pre>
     */
    public void stop(com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StopRequest request,
        io.grpc.stub.StreamObserver<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StopResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reset为重置初始状态方法
     * </pre>
     */
    public void reset(com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.ResetRequest request,
        io.grpc.stub.StreamObserver<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.ResetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getResetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Playlist为获取动作组对象列表方法
     * </pre>
     */
    public void playlist(com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlaylistRequest request,
        io.grpc.stub.StreamObserver<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlaylistResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPlaylistMethod(), responseObserver);
    }

    /**
     * <pre>
     * State为查询当前player状态方法
     * </pre>
     */
    public void state(com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StateRequest request,
        io.grpc.stub.StreamObserver<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * OnStateChange为监听State改变方法，当State状态改变时将流式返回State状态数据
     * </pre>
     */
    public void onStateChange(com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.OnStateChangeRequest request,
        io.grpc.stub.StreamObserver<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.OnStateChangeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOnStateChangeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPlayMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlayRequest,
                com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlayResponse>(
                  this, METHODID_PLAY)))
          .addMethod(
            getStopMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StopRequest,
                com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StopResponse>(
                  this, METHODID_STOP)))
          .addMethod(
            getResetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.ResetRequest,
                com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.ResetResponse>(
                  this, METHODID_RESET)))
          .addMethod(
            getPlaylistMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlaylistRequest,
                com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlaylistResponse>(
                  this, METHODID_PLAYLIST)))
          .addMethod(
            getStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StateRequest,
                com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StateResponse>(
                  this, METHODID_STATE)))
          .addMethod(
            getOnStateChangeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.OnStateChangeRequest,
                com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.OnStateChangeResponse>(
                  this, METHODID_ON_STATE_CHANGE)))
          .build();
    }
  }

  /**
   */
  public static final class PlayerStub extends io.grpc.stub.AbstractStub<PlayerStub> {
    private PlayerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PlayerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PlayerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Play为播放动作组对象方法
     * </pre>
     */
    public void play(com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlayRequest request,
        io.grpc.stub.StreamObserver<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlayResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPlayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop为停止动作组对象方法
     * </pre>
     */
    public void stop(com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StopRequest request,
        io.grpc.stub.StreamObserver<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StopResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reset为重置初始状态方法
     * </pre>
     */
    public void reset(com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.ResetRequest request,
        io.grpc.stub.StreamObserver<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.ResetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Playlist为获取动作组对象列表方法
     * </pre>
     */
    public void playlist(com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlaylistRequest request,
        io.grpc.stub.StreamObserver<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlaylistResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPlaylistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * State为查询当前player状态方法
     * </pre>
     */
    public void state(com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StateRequest request,
        io.grpc.stub.StreamObserver<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OnStateChange为监听State改变方法，当State状态改变时将流式返回State状态数据
     * </pre>
     */
    public void onStateChange(com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.OnStateChangeRequest request,
        io.grpc.stub.StreamObserver<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.OnStateChangeResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getOnStateChangeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PlayerBlockingStub extends io.grpc.stub.AbstractStub<PlayerBlockingStub> {
    private PlayerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PlayerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PlayerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Play为播放动作组对象方法
     * </pre>
     */
    public com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlayResponse play(com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlayRequest request) {
      return blockingUnaryCall(
          getChannel(), getPlayMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop为停止动作组对象方法
     * </pre>
     */
    public com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StopResponse stop(com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StopRequest request) {
      return blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reset为重置初始状态方法
     * </pre>
     */
    public com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.ResetResponse reset(com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.ResetRequest request) {
      return blockingUnaryCall(
          getChannel(), getResetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Playlist为获取动作组对象列表方法
     * </pre>
     */
    public com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlaylistResponse playlist(com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlaylistRequest request) {
      return blockingUnaryCall(
          getChannel(), getPlaylistMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * State为查询当前player状态方法
     * </pre>
     */
    public com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StateResponse state(com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StateRequest request) {
      return blockingUnaryCall(
          getChannel(), getStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OnStateChange为监听State改变方法，当State状态改变时将流式返回State状态数据
     * </pre>
     */
    public java.util.Iterator<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.OnStateChangeResponse> onStateChange(
        com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.OnStateChangeRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getOnStateChangeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PlayerFutureStub extends io.grpc.stub.AbstractStub<PlayerFutureStub> {
    private PlayerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PlayerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PlayerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Play为播放动作组对象方法
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlayResponse> play(
        com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPlayMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop为停止动作组对象方法
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StopResponse> stop(
        com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StopRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reset为重置初始状态方法
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.ResetResponse> reset(
        com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.ResetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getResetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Playlist为获取动作组对象列表方法
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlaylistResponse> playlist(
        com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlaylistRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPlaylistMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * State为查询当前player状态方法
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StateResponse> state(
        com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PLAY = 0;
  private static final int METHODID_STOP = 1;
  private static final int METHODID_RESET = 2;
  private static final int METHODID_PLAYLIST = 3;
  private static final int METHODID_STATE = 4;
  private static final int METHODID_ON_STATE_CHANGE = 5;

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
          serviceImpl.play((com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlayRequest) request,
              (io.grpc.stub.StreamObserver<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlayResponse>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StopRequest) request,
              (io.grpc.stub.StreamObserver<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StopResponse>) responseObserver);
          break;
        case METHODID_RESET:
          serviceImpl.reset((com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.ResetRequest) request,
              (io.grpc.stub.StreamObserver<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.ResetResponse>) responseObserver);
          break;
        case METHODID_PLAYLIST:
          serviceImpl.playlist((com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlaylistRequest) request,
              (io.grpc.stub.StreamObserver<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.PlaylistResponse>) responseObserver);
          break;
        case METHODID_STATE:
          serviceImpl.state((com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StateRequest) request,
              (io.grpc.stub.StreamObserver<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.StateResponse>) responseObserver);
          break;
        case METHODID_ON_STATE_CHANGE:
          serviceImpl.onStateChange((com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.OnStateChangeRequest) request,
              (io.grpc.stub.StreamObserver<com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.OnStateChangeResponse>) responseObserver);
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
      return com.jj-robot.andy4srv.handsmotion.PlayerOuterClass.getDescriptor();
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
              .addMethod(getPlaylistMethod())
              .addMethod(getStateMethod())
              .addMethod(getOnStateChangeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
