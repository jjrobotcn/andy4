package com.jjrobot.andy4.facepb;

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
 * faceRecognition.FaceDetect 人脸检测服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.1-SNAPSHOT)",
    comments = "Source: facedetect.proto")
public final class FaceDetectGrpc {

  private FaceDetectGrpc() {}

  public static final String SERVICE_NAME = "faceRecognition.FaceDetect";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceDetectPB.FromImageRequest,
      com.jjrobot.andy4.facepb.FaceDetectPB.FromImageResponse> getFromImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FromImage",
      requestType = com.jjrobot.andy4.facepb.FaceDetectPB.FromImageRequest.class,
      responseType = com.jjrobot.andy4.facepb.FaceDetectPB.FromImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceDetectPB.FromImageRequest,
      com.jjrobot.andy4.facepb.FaceDetectPB.FromImageResponse> getFromImageMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceDetectPB.FromImageRequest, com.jjrobot.andy4.facepb.FaceDetectPB.FromImageResponse> getFromImageMethod;
    if ((getFromImageMethod = FaceDetectGrpc.getFromImageMethod) == null) {
      synchronized (FaceDetectGrpc.class) {
        if ((getFromImageMethod = FaceDetectGrpc.getFromImageMethod) == null) {
          FaceDetectGrpc.getFromImageMethod = getFromImageMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.facepb.FaceDetectPB.FromImageRequest, com.jjrobot.andy4.facepb.FaceDetectPB.FromImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FromImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceDetectPB.FromImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceDetectPB.FromImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FaceDetectMethodDescriptorSupplier("FromImage"))
              .build();
        }
      }
    }
    return getFromImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceDetectRequest,
      com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceDetectResponse> getOnFaceDetectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnFaceDetect",
      requestType = com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceDetectRequest.class,
      responseType = com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceDetectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceDetectRequest,
      com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceDetectResponse> getOnFaceDetectMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceDetectRequest, com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceDetectResponse> getOnFaceDetectMethod;
    if ((getOnFaceDetectMethod = FaceDetectGrpc.getOnFaceDetectMethod) == null) {
      synchronized (FaceDetectGrpc.class) {
        if ((getOnFaceDetectMethod = FaceDetectGrpc.getOnFaceDetectMethod) == null) {
          FaceDetectGrpc.getOnFaceDetectMethod = getOnFaceDetectMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceDetectRequest, com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceDetectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnFaceDetect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceDetectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceDetectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FaceDetectMethodDescriptorSupplier("OnFaceDetect"))
              .build();
        }
      }
    }
    return getOnFaceDetectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceSetFaceDetectRequest,
      com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceSetFaceDetectResponse> getOnFaceSetFaceDetectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnFaceSetFaceDetect",
      requestType = com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceSetFaceDetectRequest.class,
      responseType = com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceSetFaceDetectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceSetFaceDetectRequest,
      com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceSetFaceDetectResponse> getOnFaceSetFaceDetectMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceSetFaceDetectRequest, com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceSetFaceDetectResponse> getOnFaceSetFaceDetectMethod;
    if ((getOnFaceSetFaceDetectMethod = FaceDetectGrpc.getOnFaceSetFaceDetectMethod) == null) {
      synchronized (FaceDetectGrpc.class) {
        if ((getOnFaceSetFaceDetectMethod = FaceDetectGrpc.getOnFaceSetFaceDetectMethod) == null) {
          FaceDetectGrpc.getOnFaceSetFaceDetectMethod = getOnFaceSetFaceDetectMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceSetFaceDetectRequest, com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceSetFaceDetectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnFaceSetFaceDetect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceSetFaceDetectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceSetFaceDetectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FaceDetectMethodDescriptorSupplier("OnFaceSetFaceDetect"))
              .build();
        }
      }
    }
    return getOnFaceSetFaceDetectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FaceDetectStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FaceDetectStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FaceDetectStub>() {
        @java.lang.Override
        public FaceDetectStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FaceDetectStub(channel, callOptions);
        }
      };
    return FaceDetectStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FaceDetectBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FaceDetectBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FaceDetectBlockingStub>() {
        @java.lang.Override
        public FaceDetectBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FaceDetectBlockingStub(channel, callOptions);
        }
      };
    return FaceDetectBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FaceDetectFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FaceDetectFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FaceDetectFutureStub>() {
        @java.lang.Override
        public FaceDetectFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FaceDetectFutureStub(channel, callOptions);
        }
      };
    return FaceDetectFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * faceRecognition.FaceDetect 人脸检测服务
   * </pre>
   */
  public static abstract class FaceDetectImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * FromImage 检测人脸图片返回检测结果列表
     * 开发管理平台功能参考: http://10.10.10.2/face/compare
     * </pre>
     */
    public void fromImage(com.jjrobot.andy4.facepb.FaceDetectPB.FromImageRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceDetectPB.FromImageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFromImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * OnFaceDetect 通过主摄像头动态检测人脸，持续返回检测结果列表
     * 开发管理平台功能参考: http://10.10.10.2/face/detect
     * </pre>
     */
    public void onFaceDetect(com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceDetectRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceDetectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOnFaceDetectMethod(), responseObserver);
    }

    /**
     * <pre>
     * 此方法为OnFaceDetect与Search的组合，用于内部FaceSet的识别搜索。
     * 开发管理平台功能参考: http://10.10.10.2/face/face-set-detect
     * </pre>
     */
    public void onFaceSetFaceDetect(com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceSetFaceDetectRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceSetFaceDetectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOnFaceSetFaceDetectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFromImageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.facepb.FaceDetectPB.FromImageRequest,
                com.jjrobot.andy4.facepb.FaceDetectPB.FromImageResponse>(
                  this, METHODID_FROM_IMAGE)))
          .addMethod(
            getOnFaceDetectMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceDetectRequest,
                com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceDetectResponse>(
                  this, METHODID_ON_FACE_DETECT)))
          .addMethod(
            getOnFaceSetFaceDetectMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceSetFaceDetectRequest,
                com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceSetFaceDetectResponse>(
                  this, METHODID_ON_FACE_SET_FACE_DETECT)))
          .build();
    }
  }

  /**
   * <pre>
   * faceRecognition.FaceDetect 人脸检测服务
   * </pre>
   */
  public static final class FaceDetectStub extends io.grpc.stub.AbstractAsyncStub<FaceDetectStub> {
    private FaceDetectStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FaceDetectStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FaceDetectStub(channel, callOptions);
    }

    /**
     * <pre>
     * FromImage 检测人脸图片返回检测结果列表
     * 开发管理平台功能参考: http://10.10.10.2/face/compare
     * </pre>
     */
    public void fromImage(com.jjrobot.andy4.facepb.FaceDetectPB.FromImageRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceDetectPB.FromImageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFromImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OnFaceDetect 通过主摄像头动态检测人脸，持续返回检测结果列表
     * 开发管理平台功能参考: http://10.10.10.2/face/detect
     * </pre>
     */
    public void onFaceDetect(com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceDetectRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceDetectResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getOnFaceDetectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 此方法为OnFaceDetect与Search的组合，用于内部FaceSet的识别搜索。
     * 开发管理平台功能参考: http://10.10.10.2/face/face-set-detect
     * </pre>
     */
    public void onFaceSetFaceDetect(com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceSetFaceDetectRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceSetFaceDetectResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getOnFaceSetFaceDetectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * faceRecognition.FaceDetect 人脸检测服务
   * </pre>
   */
  public static final class FaceDetectBlockingStub extends io.grpc.stub.AbstractBlockingStub<FaceDetectBlockingStub> {
    private FaceDetectBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FaceDetectBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FaceDetectBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * FromImage 检测人脸图片返回检测结果列表
     * 开发管理平台功能参考: http://10.10.10.2/face/compare
     * </pre>
     */
    public com.jjrobot.andy4.facepb.FaceDetectPB.FromImageResponse fromImage(com.jjrobot.andy4.facepb.FaceDetectPB.FromImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getFromImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OnFaceDetect 通过主摄像头动态检测人脸，持续返回检测结果列表
     * 开发管理平台功能参考: http://10.10.10.2/face/detect
     * </pre>
     */
    public java.util.Iterator<com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceDetectResponse> onFaceDetect(
        com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceDetectRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getOnFaceDetectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 此方法为OnFaceDetect与Search的组合，用于内部FaceSet的识别搜索。
     * 开发管理平台功能参考: http://10.10.10.2/face/face-set-detect
     * </pre>
     */
    public java.util.Iterator<com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceSetFaceDetectResponse> onFaceSetFaceDetect(
        com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceSetFaceDetectRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getOnFaceSetFaceDetectMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * faceRecognition.FaceDetect 人脸检测服务
   * </pre>
   */
  public static final class FaceDetectFutureStub extends io.grpc.stub.AbstractFutureStub<FaceDetectFutureStub> {
    private FaceDetectFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FaceDetectFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FaceDetectFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * FromImage 检测人脸图片返回检测结果列表
     * 开发管理平台功能参考: http://10.10.10.2/face/compare
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.facepb.FaceDetectPB.FromImageResponse> fromImage(
        com.jjrobot.andy4.facepb.FaceDetectPB.FromImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFromImageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FROM_IMAGE = 0;
  private static final int METHODID_ON_FACE_DETECT = 1;
  private static final int METHODID_ON_FACE_SET_FACE_DETECT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FaceDetectImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FaceDetectImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FROM_IMAGE:
          serviceImpl.fromImage((com.jjrobot.andy4.facepb.FaceDetectPB.FromImageRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceDetectPB.FromImageResponse>) responseObserver);
          break;
        case METHODID_ON_FACE_DETECT:
          serviceImpl.onFaceDetect((com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceDetectRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceDetectResponse>) responseObserver);
          break;
        case METHODID_ON_FACE_SET_FACE_DETECT:
          serviceImpl.onFaceSetFaceDetect((com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceSetFaceDetectRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceDetectPB.OnFaceSetFaceDetectResponse>) responseObserver);
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

  private static abstract class FaceDetectBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FaceDetectBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jjrobot.andy4.facepb.FaceDetectPB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FaceDetect");
    }
  }

  private static final class FaceDetectFileDescriptorSupplier
      extends FaceDetectBaseDescriptorSupplier {
    FaceDetectFileDescriptorSupplier() {}
  }

  private static final class FaceDetectMethodDescriptorSupplier
      extends FaceDetectBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FaceDetectMethodDescriptorSupplier(String methodName) {
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
      synchronized (FaceDetectGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FaceDetectFileDescriptorSupplier())
              .addMethod(getFromImageMethod())
              .addMethod(getOnFaceDetectMethod())
              .addMethod(getOnFaceSetFaceDetectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
