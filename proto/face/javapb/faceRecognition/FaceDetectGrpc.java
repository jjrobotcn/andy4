package faceRecognition;

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
    comments = "Source: facedetect.proto")
public final class FaceDetectGrpc {

  private FaceDetectGrpc() {}

  public static final String SERVICE_NAME = "faceRecognition.FaceDetect";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<faceRecognition.FaceDetectPb.FromImageRequest,
      faceRecognition.FaceDetectPb.FromImageResponse> getFromImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FromImage",
      requestType = faceRecognition.FaceDetectPb.FromImageRequest.class,
      responseType = faceRecognition.FaceDetectPb.FromImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<faceRecognition.FaceDetectPb.FromImageRequest,
      faceRecognition.FaceDetectPb.FromImageResponse> getFromImageMethod() {
    io.grpc.MethodDescriptor<faceRecognition.FaceDetectPb.FromImageRequest, faceRecognition.FaceDetectPb.FromImageResponse> getFromImageMethod;
    if ((getFromImageMethod = FaceDetectGrpc.getFromImageMethod) == null) {
      synchronized (FaceDetectGrpc.class) {
        if ((getFromImageMethod = FaceDetectGrpc.getFromImageMethod) == null) {
          FaceDetectGrpc.getFromImageMethod = getFromImageMethod = 
              io.grpc.MethodDescriptor.<faceRecognition.FaceDetectPb.FromImageRequest, faceRecognition.FaceDetectPb.FromImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "faceRecognition.FaceDetect", "FromImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  faceRecognition.FaceDetectPb.FromImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  faceRecognition.FaceDetectPb.FromImageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FaceDetectMethodDescriptorSupplier("FromImage"))
                  .build();
          }
        }
     }
     return getFromImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<faceRecognition.FaceDetectPb.OnFaceDetectRequest,
      faceRecognition.FaceDetectPb.OnFaceDetectResponse> getOnFaceDetectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnFaceDetect",
      requestType = faceRecognition.FaceDetectPb.OnFaceDetectRequest.class,
      responseType = faceRecognition.FaceDetectPb.OnFaceDetectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<faceRecognition.FaceDetectPb.OnFaceDetectRequest,
      faceRecognition.FaceDetectPb.OnFaceDetectResponse> getOnFaceDetectMethod() {
    io.grpc.MethodDescriptor<faceRecognition.FaceDetectPb.OnFaceDetectRequest, faceRecognition.FaceDetectPb.OnFaceDetectResponse> getOnFaceDetectMethod;
    if ((getOnFaceDetectMethod = FaceDetectGrpc.getOnFaceDetectMethod) == null) {
      synchronized (FaceDetectGrpc.class) {
        if ((getOnFaceDetectMethod = FaceDetectGrpc.getOnFaceDetectMethod) == null) {
          FaceDetectGrpc.getOnFaceDetectMethod = getOnFaceDetectMethod = 
              io.grpc.MethodDescriptor.<faceRecognition.FaceDetectPb.OnFaceDetectRequest, faceRecognition.FaceDetectPb.OnFaceDetectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "faceRecognition.FaceDetect", "OnFaceDetect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  faceRecognition.FaceDetectPb.OnFaceDetectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  faceRecognition.FaceDetectPb.OnFaceDetectResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FaceDetectMethodDescriptorSupplier("OnFaceDetect"))
                  .build();
          }
        }
     }
     return getOnFaceDetectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<faceRecognition.FaceDetectPb.OnFaceSetFaceDetectRequest,
      faceRecognition.FaceDetectPb.OnFaceSetFaceDetectResponse> getOnFaceSetFaceDetectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnFaceSetFaceDetect",
      requestType = faceRecognition.FaceDetectPb.OnFaceSetFaceDetectRequest.class,
      responseType = faceRecognition.FaceDetectPb.OnFaceSetFaceDetectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<faceRecognition.FaceDetectPb.OnFaceSetFaceDetectRequest,
      faceRecognition.FaceDetectPb.OnFaceSetFaceDetectResponse> getOnFaceSetFaceDetectMethod() {
    io.grpc.MethodDescriptor<faceRecognition.FaceDetectPb.OnFaceSetFaceDetectRequest, faceRecognition.FaceDetectPb.OnFaceSetFaceDetectResponse> getOnFaceSetFaceDetectMethod;
    if ((getOnFaceSetFaceDetectMethod = FaceDetectGrpc.getOnFaceSetFaceDetectMethod) == null) {
      synchronized (FaceDetectGrpc.class) {
        if ((getOnFaceSetFaceDetectMethod = FaceDetectGrpc.getOnFaceSetFaceDetectMethod) == null) {
          FaceDetectGrpc.getOnFaceSetFaceDetectMethod = getOnFaceSetFaceDetectMethod = 
              io.grpc.MethodDescriptor.<faceRecognition.FaceDetectPb.OnFaceSetFaceDetectRequest, faceRecognition.FaceDetectPb.OnFaceSetFaceDetectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "faceRecognition.FaceDetect", "OnFaceSetFaceDetect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  faceRecognition.FaceDetectPb.OnFaceSetFaceDetectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  faceRecognition.FaceDetectPb.OnFaceSetFaceDetectResponse.getDefaultInstance()))
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
    return new FaceDetectStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FaceDetectBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FaceDetectBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FaceDetectFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FaceDetectFutureStub(channel);
  }

  /**
   */
  public static abstract class FaceDetectImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * FromImage实现对输入图片进行人脸检测，返回检测人脸图片列表
     * </pre>
     */
    public void fromImage(faceRecognition.FaceDetectPb.FromImageRequest request,
        io.grpc.stub.StreamObserver<faceRecognition.FaceDetectPb.FromImageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFromImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * OnFaceDetect实现动态检测人脸，流式返回检测人脸图片戳列表
     * </pre>
     */
    public void onFaceDetect(faceRecognition.FaceDetectPb.OnFaceDetectRequest request,
        io.grpc.stub.StreamObserver<faceRecognition.FaceDetectPb.OnFaceDetectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOnFaceDetectMethod(), responseObserver);
    }

    /**
     * <pre>
     * OnFaceSetFaceDetect实现动态检测人脸并与指定FaceSet进行对比，流式返回检测结果
     * </pre>
     */
    public void onFaceSetFaceDetect(faceRecognition.FaceDetectPb.OnFaceSetFaceDetectRequest request,
        io.grpc.stub.StreamObserver<faceRecognition.FaceDetectPb.OnFaceSetFaceDetectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOnFaceSetFaceDetectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFromImageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                faceRecognition.FaceDetectPb.FromImageRequest,
                faceRecognition.FaceDetectPb.FromImageResponse>(
                  this, METHODID_FROM_IMAGE)))
          .addMethod(
            getOnFaceDetectMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                faceRecognition.FaceDetectPb.OnFaceDetectRequest,
                faceRecognition.FaceDetectPb.OnFaceDetectResponse>(
                  this, METHODID_ON_FACE_DETECT)))
          .addMethod(
            getOnFaceSetFaceDetectMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                faceRecognition.FaceDetectPb.OnFaceSetFaceDetectRequest,
                faceRecognition.FaceDetectPb.OnFaceSetFaceDetectResponse>(
                  this, METHODID_ON_FACE_SET_FACE_DETECT)))
          .build();
    }
  }

  /**
   */
  public static final class FaceDetectStub extends io.grpc.stub.AbstractStub<FaceDetectStub> {
    private FaceDetectStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FaceDetectStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FaceDetectStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FaceDetectStub(channel, callOptions);
    }

    /**
     * <pre>
     * FromImage实现对输入图片进行人脸检测，返回检测人脸图片列表
     * </pre>
     */
    public void fromImage(faceRecognition.FaceDetectPb.FromImageRequest request,
        io.grpc.stub.StreamObserver<faceRecognition.FaceDetectPb.FromImageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFromImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OnFaceDetect实现动态检测人脸，流式返回检测人脸图片戳列表
     * </pre>
     */
    public void onFaceDetect(faceRecognition.FaceDetectPb.OnFaceDetectRequest request,
        io.grpc.stub.StreamObserver<faceRecognition.FaceDetectPb.OnFaceDetectResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getOnFaceDetectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OnFaceSetFaceDetect实现动态检测人脸并与指定FaceSet进行对比，流式返回检测结果
     * </pre>
     */
    public void onFaceSetFaceDetect(faceRecognition.FaceDetectPb.OnFaceSetFaceDetectRequest request,
        io.grpc.stub.StreamObserver<faceRecognition.FaceDetectPb.OnFaceSetFaceDetectResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getOnFaceSetFaceDetectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FaceDetectBlockingStub extends io.grpc.stub.AbstractStub<FaceDetectBlockingStub> {
    private FaceDetectBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FaceDetectBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FaceDetectBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FaceDetectBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * FromImage实现对输入图片进行人脸检测，返回检测人脸图片列表
     * </pre>
     */
    public faceRecognition.FaceDetectPb.FromImageResponse fromImage(faceRecognition.FaceDetectPb.FromImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getFromImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OnFaceDetect实现动态检测人脸，流式返回检测人脸图片戳列表
     * </pre>
     */
    public java.util.Iterator<faceRecognition.FaceDetectPb.OnFaceDetectResponse> onFaceDetect(
        faceRecognition.FaceDetectPb.OnFaceDetectRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getOnFaceDetectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OnFaceSetFaceDetect实现动态检测人脸并与指定FaceSet进行对比，流式返回检测结果
     * </pre>
     */
    public java.util.Iterator<faceRecognition.FaceDetectPb.OnFaceSetFaceDetectResponse> onFaceSetFaceDetect(
        faceRecognition.FaceDetectPb.OnFaceSetFaceDetectRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getOnFaceSetFaceDetectMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FaceDetectFutureStub extends io.grpc.stub.AbstractStub<FaceDetectFutureStub> {
    private FaceDetectFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FaceDetectFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FaceDetectFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FaceDetectFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * FromImage实现对输入图片进行人脸检测，返回检测人脸图片列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<faceRecognition.FaceDetectPb.FromImageResponse> fromImage(
        faceRecognition.FaceDetectPb.FromImageRequest request) {
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
          serviceImpl.fromImage((faceRecognition.FaceDetectPb.FromImageRequest) request,
              (io.grpc.stub.StreamObserver<faceRecognition.FaceDetectPb.FromImageResponse>) responseObserver);
          break;
        case METHODID_ON_FACE_DETECT:
          serviceImpl.onFaceDetect((faceRecognition.FaceDetectPb.OnFaceDetectRequest) request,
              (io.grpc.stub.StreamObserver<faceRecognition.FaceDetectPb.OnFaceDetectResponse>) responseObserver);
          break;
        case METHODID_ON_FACE_SET_FACE_DETECT:
          serviceImpl.onFaceSetFaceDetect((faceRecognition.FaceDetectPb.OnFaceSetFaceDetectRequest) request,
              (io.grpc.stub.StreamObserver<faceRecognition.FaceDetectPb.OnFaceSetFaceDetectResponse>) responseObserver);
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
      return faceRecognition.FaceDetectPb.getDescriptor();
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
