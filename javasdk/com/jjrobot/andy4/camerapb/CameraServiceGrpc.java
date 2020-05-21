package com.jjrobot.andy4.camerapb;

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
 * cameraService.CameraService 主摄像头视频流与图片的获取
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.1-SNAPSHOT)",
    comments = "Source: camera.proto")
public final class CameraServiceGrpc {

  private CameraServiceGrpc() {}

  public static final String SERVICE_NAME = "cameraService.CameraService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.camerapb.CameraServicePB.LiveH264StreamRequest,
      com.jjrobot.andy4.camerapb.CameraServicePB.LiveH264StreamResponse> getLiveH264StreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiveH264Stream",
      requestType = com.jjrobot.andy4.camerapb.CameraServicePB.LiveH264StreamRequest.class,
      responseType = com.jjrobot.andy4.camerapb.CameraServicePB.LiveH264StreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.camerapb.CameraServicePB.LiveH264StreamRequest,
      com.jjrobot.andy4.camerapb.CameraServicePB.LiveH264StreamResponse> getLiveH264StreamMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.camerapb.CameraServicePB.LiveH264StreamRequest, com.jjrobot.andy4.camerapb.CameraServicePB.LiveH264StreamResponse> getLiveH264StreamMethod;
    if ((getLiveH264StreamMethod = CameraServiceGrpc.getLiveH264StreamMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getLiveH264StreamMethod = CameraServiceGrpc.getLiveH264StreamMethod) == null) {
          CameraServiceGrpc.getLiveH264StreamMethod = getLiveH264StreamMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.camerapb.CameraServicePB.LiveH264StreamRequest, com.jjrobot.andy4.camerapb.CameraServicePB.LiveH264StreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiveH264Stream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.camerapb.CameraServicePB.LiveH264StreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.camerapb.CameraServicePB.LiveH264StreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CameraServiceMethodDescriptorSupplier("LiveH264Stream"))
              .build();
        }
      }
    }
    return getLiveH264StreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.camerapb.CameraServicePB.LatestImageRequest,
      com.jjrobot.andy4.camerapb.CameraServicePB.LatestImageResponse> getLatestImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LatestImage",
      requestType = com.jjrobot.andy4.camerapb.CameraServicePB.LatestImageRequest.class,
      responseType = com.jjrobot.andy4.camerapb.CameraServicePB.LatestImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.camerapb.CameraServicePB.LatestImageRequest,
      com.jjrobot.andy4.camerapb.CameraServicePB.LatestImageResponse> getLatestImageMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.camerapb.CameraServicePB.LatestImageRequest, com.jjrobot.andy4.camerapb.CameraServicePB.LatestImageResponse> getLatestImageMethod;
    if ((getLatestImageMethod = CameraServiceGrpc.getLatestImageMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getLatestImageMethod = CameraServiceGrpc.getLatestImageMethod) == null) {
          CameraServiceGrpc.getLatestImageMethod = getLatestImageMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.camerapb.CameraServicePB.LatestImageRequest, com.jjrobot.andy4.camerapb.CameraServicePB.LatestImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LatestImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.camerapb.CameraServicePB.LatestImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.camerapb.CameraServicePB.LatestImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CameraServiceMethodDescriptorSupplier("LatestImage"))
              .build();
        }
      }
    }
    return getLatestImageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CameraServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CameraServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CameraServiceStub>() {
        @java.lang.Override
        public CameraServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CameraServiceStub(channel, callOptions);
        }
      };
    return CameraServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CameraServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CameraServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CameraServiceBlockingStub>() {
        @java.lang.Override
        public CameraServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CameraServiceBlockingStub(channel, callOptions);
        }
      };
    return CameraServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CameraServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CameraServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CameraServiceFutureStub>() {
        @java.lang.Override
        public CameraServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CameraServiceFutureStub(channel, callOptions);
        }
      };
    return CameraServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * cameraService.CameraService 主摄像头视频流与图片的获取
   * </pre>
   */
  public static abstract class CameraServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * LiveH264Stream 获取主摄像头视频流数据
     * 输出数据为H264裸流，无音频，分辨率为960*720
     * 网关不包含当前方法，WebSocket用户请使用独立接口
     * ws://10.10.10.2(:81)/api/v2/camera/ws/h264/live(?token=)
     * web应用中需调整数据类型: ws.binaryType = 'arraybuffer';
     * 开发管理平台功能参考: http://10.10.10.2/camera/live/ws
     * </pre>
     */
    public void liveH264Stream(com.jjrobot.andy4.camerapb.CameraServicePB.LiveH264StreamRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.camerapb.CameraServicePB.LiveH264StreamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLiveH264StreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * LatestImage 获取主摄像头实时图片数据
     * 开发管理平台功能参考: http://10.10.10.2/camera/live/image
     * </pre>
     */
    public void latestImage(com.jjrobot.andy4.camerapb.CameraServicePB.LatestImageRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.camerapb.CameraServicePB.LatestImageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLatestImageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLiveH264StreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jjrobot.andy4.camerapb.CameraServicePB.LiveH264StreamRequest,
                com.jjrobot.andy4.camerapb.CameraServicePB.LiveH264StreamResponse>(
                  this, METHODID_LIVE_H264STREAM)))
          .addMethod(
            getLatestImageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.camerapb.CameraServicePB.LatestImageRequest,
                com.jjrobot.andy4.camerapb.CameraServicePB.LatestImageResponse>(
                  this, METHODID_LATEST_IMAGE)))
          .build();
    }
  }

  /**
   * <pre>
   * cameraService.CameraService 主摄像头视频流与图片的获取
   * </pre>
   */
  public static final class CameraServiceStub extends io.grpc.stub.AbstractAsyncStub<CameraServiceStub> {
    private CameraServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CameraServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * LiveH264Stream 获取主摄像头视频流数据
     * 输出数据为H264裸流，无音频，分辨率为960*720
     * 网关不包含当前方法，WebSocket用户请使用独立接口
     * ws://10.10.10.2(:81)/api/v2/camera/ws/h264/live(?token=)
     * web应用中需调整数据类型: ws.binaryType = 'arraybuffer';
     * 开发管理平台功能参考: http://10.10.10.2/camera/live/ws
     * </pre>
     */
    public void liveH264Stream(com.jjrobot.andy4.camerapb.CameraServicePB.LiveH264StreamRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.camerapb.CameraServicePB.LiveH264StreamResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getLiveH264StreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LatestImage 获取主摄像头实时图片数据
     * 开发管理平台功能参考: http://10.10.10.2/camera/live/image
     * </pre>
     */
    public void latestImage(com.jjrobot.andy4.camerapb.CameraServicePB.LatestImageRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.camerapb.CameraServicePB.LatestImageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLatestImageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * cameraService.CameraService 主摄像头视频流与图片的获取
   * </pre>
   */
  public static final class CameraServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CameraServiceBlockingStub> {
    private CameraServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CameraServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * LiveH264Stream 获取主摄像头视频流数据
     * 输出数据为H264裸流，无音频，分辨率为960*720
     * 网关不包含当前方法，WebSocket用户请使用独立接口
     * ws://10.10.10.2(:81)/api/v2/camera/ws/h264/live(?token=)
     * web应用中需调整数据类型: ws.binaryType = 'arraybuffer';
     * 开发管理平台功能参考: http://10.10.10.2/camera/live/ws
     * </pre>
     */
    public java.util.Iterator<com.jjrobot.andy4.camerapb.CameraServicePB.LiveH264StreamResponse> liveH264Stream(
        com.jjrobot.andy4.camerapb.CameraServicePB.LiveH264StreamRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getLiveH264StreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LatestImage 获取主摄像头实时图片数据
     * 开发管理平台功能参考: http://10.10.10.2/camera/live/image
     * </pre>
     */
    public com.jjrobot.andy4.camerapb.CameraServicePB.LatestImageResponse latestImage(com.jjrobot.andy4.camerapb.CameraServicePB.LatestImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getLatestImageMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * cameraService.CameraService 主摄像头视频流与图片的获取
   * </pre>
   */
  public static final class CameraServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CameraServiceFutureStub> {
    private CameraServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CameraServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * LatestImage 获取主摄像头实时图片数据
     * 开发管理平台功能参考: http://10.10.10.2/camera/live/image
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.camerapb.CameraServicePB.LatestImageResponse> latestImage(
        com.jjrobot.andy4.camerapb.CameraServicePB.LatestImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLatestImageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIVE_H264STREAM = 0;
  private static final int METHODID_LATEST_IMAGE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CameraServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CameraServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIVE_H264STREAM:
          serviceImpl.liveH264Stream((com.jjrobot.andy4.camerapb.CameraServicePB.LiveH264StreamRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.camerapb.CameraServicePB.LiveH264StreamResponse>) responseObserver);
          break;
        case METHODID_LATEST_IMAGE:
          serviceImpl.latestImage((com.jjrobot.andy4.camerapb.CameraServicePB.LatestImageRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.camerapb.CameraServicePB.LatestImageResponse>) responseObserver);
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

  private static abstract class CameraServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CameraServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jjrobot.andy4.camerapb.CameraServicePB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CameraService");
    }
  }

  private static final class CameraServiceFileDescriptorSupplier
      extends CameraServiceBaseDescriptorSupplier {
    CameraServiceFileDescriptorSupplier() {}
  }

  private static final class CameraServiceMethodDescriptorSupplier
      extends CameraServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CameraServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CameraServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CameraServiceFileDescriptorSupplier())
              .addMethod(getLiveH264StreamMethod())
              .addMethod(getLatestImageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
