package cameraService;

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
    comments = "Source: camera.proto")
public final class CameraServiceGrpc {

  private CameraServiceGrpc() {}

  public static final String SERVICE_NAME = "cameraService.CameraService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cameraService.Camera.LiveH264StreamRequest,
      cameraService.Camera.LiveH264StreamResponse> getLiveH264StreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiveH264Stream",
      requestType = cameraService.Camera.LiveH264StreamRequest.class,
      responseType = cameraService.Camera.LiveH264StreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cameraService.Camera.LiveH264StreamRequest,
      cameraService.Camera.LiveH264StreamResponse> getLiveH264StreamMethod() {
    io.grpc.MethodDescriptor<cameraService.Camera.LiveH264StreamRequest, cameraService.Camera.LiveH264StreamResponse> getLiveH264StreamMethod;
    if ((getLiveH264StreamMethod = CameraServiceGrpc.getLiveH264StreamMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getLiveH264StreamMethod = CameraServiceGrpc.getLiveH264StreamMethod) == null) {
          CameraServiceGrpc.getLiveH264StreamMethod = getLiveH264StreamMethod = 
              io.grpc.MethodDescriptor.<cameraService.Camera.LiveH264StreamRequest, cameraService.Camera.LiveH264StreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cameraService.CameraService", "LiveH264Stream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cameraService.Camera.LiveH264StreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cameraService.Camera.LiveH264StreamResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CameraServiceMethodDescriptorSupplier("LiveH264Stream"))
                  .build();
          }
        }
     }
     return getLiveH264StreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cameraService.Camera.DvrListDatesRequest,
      cameraService.Camera.DvrListDatesResponse> getDvrListDatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DvrListDates",
      requestType = cameraService.Camera.DvrListDatesRequest.class,
      responseType = cameraService.Camera.DvrListDatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cameraService.Camera.DvrListDatesRequest,
      cameraService.Camera.DvrListDatesResponse> getDvrListDatesMethod() {
    io.grpc.MethodDescriptor<cameraService.Camera.DvrListDatesRequest, cameraService.Camera.DvrListDatesResponse> getDvrListDatesMethod;
    if ((getDvrListDatesMethod = CameraServiceGrpc.getDvrListDatesMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getDvrListDatesMethod = CameraServiceGrpc.getDvrListDatesMethod) == null) {
          CameraServiceGrpc.getDvrListDatesMethod = getDvrListDatesMethod = 
              io.grpc.MethodDescriptor.<cameraService.Camera.DvrListDatesRequest, cameraService.Camera.DvrListDatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cameraService.CameraService", "DvrListDates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cameraService.Camera.DvrListDatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cameraService.Camera.DvrListDatesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CameraServiceMethodDescriptorSupplier("DvrListDates"))
                  .build();
          }
        }
     }
     return getDvrListDatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cameraService.Camera.DvrListDateVideosRequest,
      cameraService.Camera.DvrListDateVideosResponse> getDvrListDateVideosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DvrListDateVideos",
      requestType = cameraService.Camera.DvrListDateVideosRequest.class,
      responseType = cameraService.Camera.DvrListDateVideosResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cameraService.Camera.DvrListDateVideosRequest,
      cameraService.Camera.DvrListDateVideosResponse> getDvrListDateVideosMethod() {
    io.grpc.MethodDescriptor<cameraService.Camera.DvrListDateVideosRequest, cameraService.Camera.DvrListDateVideosResponse> getDvrListDateVideosMethod;
    if ((getDvrListDateVideosMethod = CameraServiceGrpc.getDvrListDateVideosMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getDvrListDateVideosMethod = CameraServiceGrpc.getDvrListDateVideosMethod) == null) {
          CameraServiceGrpc.getDvrListDateVideosMethod = getDvrListDateVideosMethod = 
              io.grpc.MethodDescriptor.<cameraService.Camera.DvrListDateVideosRequest, cameraService.Camera.DvrListDateVideosResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cameraService.CameraService", "DvrListDateVideos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cameraService.Camera.DvrListDateVideosRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cameraService.Camera.DvrListDateVideosResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CameraServiceMethodDescriptorSupplier("DvrListDateVideos"))
                  .build();
          }
        }
     }
     return getDvrListDateVideosMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CameraServiceStub newStub(io.grpc.Channel channel) {
    return new CameraServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CameraServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CameraServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CameraServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CameraServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CameraServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 直播流数据, 数据为h264 nal单元
     * </pre>
     */
    public void liveH264Stream(cameraService.Camera.LiveH264StreamRequest request,
        io.grpc.stub.StreamObserver<cameraService.Camera.LiveH264StreamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLiveH264StreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取监控数据日期列表
     * </pre>
     */
    public void dvrListDates(cameraService.Camera.DvrListDatesRequest request,
        io.grpc.stub.StreamObserver<cameraService.Camera.DvrListDatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDvrListDatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取监控数据指定日期视频文件列表
     * </pre>
     */
    public void dvrListDateVideos(cameraService.Camera.DvrListDateVideosRequest request,
        io.grpc.stub.StreamObserver<cameraService.Camera.DvrListDateVideosResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDvrListDateVideosMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLiveH264StreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                cameraService.Camera.LiveH264StreamRequest,
                cameraService.Camera.LiveH264StreamResponse>(
                  this, METHODID_LIVE_H264STREAM)))
          .addMethod(
            getDvrListDatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cameraService.Camera.DvrListDatesRequest,
                cameraService.Camera.DvrListDatesResponse>(
                  this, METHODID_DVR_LIST_DATES)))
          .addMethod(
            getDvrListDateVideosMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cameraService.Camera.DvrListDateVideosRequest,
                cameraService.Camera.DvrListDateVideosResponse>(
                  this, METHODID_DVR_LIST_DATE_VIDEOS)))
          .build();
    }
  }

  /**
   */
  public static final class CameraServiceStub extends io.grpc.stub.AbstractStub<CameraServiceStub> {
    private CameraServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CameraServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CameraServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 直播流数据, 数据为h264 nal单元
     * </pre>
     */
    public void liveH264Stream(cameraService.Camera.LiveH264StreamRequest request,
        io.grpc.stub.StreamObserver<cameraService.Camera.LiveH264StreamResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getLiveH264StreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取监控数据日期列表
     * </pre>
     */
    public void dvrListDates(cameraService.Camera.DvrListDatesRequest request,
        io.grpc.stub.StreamObserver<cameraService.Camera.DvrListDatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDvrListDatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取监控数据指定日期视频文件列表
     * </pre>
     */
    public void dvrListDateVideos(cameraService.Camera.DvrListDateVideosRequest request,
        io.grpc.stub.StreamObserver<cameraService.Camera.DvrListDateVideosResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDvrListDateVideosMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CameraServiceBlockingStub extends io.grpc.stub.AbstractStub<CameraServiceBlockingStub> {
    private CameraServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CameraServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CameraServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 直播流数据, 数据为h264 nal单元
     * </pre>
     */
    public java.util.Iterator<cameraService.Camera.LiveH264StreamResponse> liveH264Stream(
        cameraService.Camera.LiveH264StreamRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getLiveH264StreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取监控数据日期列表
     * </pre>
     */
    public cameraService.Camera.DvrListDatesResponse dvrListDates(cameraService.Camera.DvrListDatesRequest request) {
      return blockingUnaryCall(
          getChannel(), getDvrListDatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取监控数据指定日期视频文件列表
     * </pre>
     */
    public cameraService.Camera.DvrListDateVideosResponse dvrListDateVideos(cameraService.Camera.DvrListDateVideosRequest request) {
      return blockingUnaryCall(
          getChannel(), getDvrListDateVideosMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CameraServiceFutureStub extends io.grpc.stub.AbstractStub<CameraServiceFutureStub> {
    private CameraServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CameraServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CameraServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取监控数据日期列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cameraService.Camera.DvrListDatesResponse> dvrListDates(
        cameraService.Camera.DvrListDatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDvrListDatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取监控数据指定日期视频文件列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cameraService.Camera.DvrListDateVideosResponse> dvrListDateVideos(
        cameraService.Camera.DvrListDateVideosRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDvrListDateVideosMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIVE_H264STREAM = 0;
  private static final int METHODID_DVR_LIST_DATES = 1;
  private static final int METHODID_DVR_LIST_DATE_VIDEOS = 2;

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
          serviceImpl.liveH264Stream((cameraService.Camera.LiveH264StreamRequest) request,
              (io.grpc.stub.StreamObserver<cameraService.Camera.LiveH264StreamResponse>) responseObserver);
          break;
        case METHODID_DVR_LIST_DATES:
          serviceImpl.dvrListDates((cameraService.Camera.DvrListDatesRequest) request,
              (io.grpc.stub.StreamObserver<cameraService.Camera.DvrListDatesResponse>) responseObserver);
          break;
        case METHODID_DVR_LIST_DATE_VIDEOS:
          serviceImpl.dvrListDateVideos((cameraService.Camera.DvrListDateVideosRequest) request,
              (io.grpc.stub.StreamObserver<cameraService.Camera.DvrListDateVideosResponse>) responseObserver);
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
      return cameraService.Camera.getDescriptor();
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
              .addMethod(getDvrListDatesMethod())
              .addMethod(getDvrListDateVideosMethod())
              .build();
        }
      }
    }
    return result;
  }
}
