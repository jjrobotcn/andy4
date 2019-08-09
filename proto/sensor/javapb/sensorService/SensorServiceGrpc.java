package sensorService;

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
    comments = "Source: sensor.proto")
public final class SensorServiceGrpc {

  private SensorServiceGrpc() {}

  public static final String SERVICE_NAME = "sensorService.SensorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sensorService.Sensor.GetDetectRequest,
      sensorService.Sensor.GetDetectResponse> getGetDetectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDetect",
      requestType = sensorService.Sensor.GetDetectRequest.class,
      responseType = sensorService.Sensor.GetDetectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<sensorService.Sensor.GetDetectRequest,
      sensorService.Sensor.GetDetectResponse> getGetDetectMethod() {
    io.grpc.MethodDescriptor<sensorService.Sensor.GetDetectRequest, sensorService.Sensor.GetDetectResponse> getGetDetectMethod;
    if ((getGetDetectMethod = SensorServiceGrpc.getGetDetectMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getGetDetectMethod = SensorServiceGrpc.getGetDetectMethod) == null) {
          SensorServiceGrpc.getGetDetectMethod = getGetDetectMethod = 
              io.grpc.MethodDescriptor.<sensorService.Sensor.GetDetectRequest, sensorService.Sensor.GetDetectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "sensorService.SensorService", "GetDetect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sensorService.Sensor.GetDetectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sensorService.Sensor.GetDetectResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("GetDetect"))
                  .build();
          }
        }
     }
     return getGetDetectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sensorService.Sensor.GetMotionInductionRequest,
      sensorService.Sensor.GetMotionInductionResponse> getGetMotionInductionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMotionInduction",
      requestType = sensorService.Sensor.GetMotionInductionRequest.class,
      responseType = sensorService.Sensor.GetMotionInductionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<sensorService.Sensor.GetMotionInductionRequest,
      sensorService.Sensor.GetMotionInductionResponse> getGetMotionInductionMethod() {
    io.grpc.MethodDescriptor<sensorService.Sensor.GetMotionInductionRequest, sensorService.Sensor.GetMotionInductionResponse> getGetMotionInductionMethod;
    if ((getGetMotionInductionMethod = SensorServiceGrpc.getGetMotionInductionMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getGetMotionInductionMethod = SensorServiceGrpc.getGetMotionInductionMethod) == null) {
          SensorServiceGrpc.getGetMotionInductionMethod = getGetMotionInductionMethod = 
              io.grpc.MethodDescriptor.<sensorService.Sensor.GetMotionInductionRequest, sensorService.Sensor.GetMotionInductionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "sensorService.SensorService", "GetMotionInduction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sensorService.Sensor.GetMotionInductionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sensorService.Sensor.GetMotionInductionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("GetMotionInduction"))
                  .build();
          }
        }
     }
     return getGetMotionInductionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sensorService.Sensor.GetTouchRequest,
      sensorService.Sensor.GetTouchResponse> getGetTouchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTouch",
      requestType = sensorService.Sensor.GetTouchRequest.class,
      responseType = sensorService.Sensor.GetTouchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<sensorService.Sensor.GetTouchRequest,
      sensorService.Sensor.GetTouchResponse> getGetTouchMethod() {
    io.grpc.MethodDescriptor<sensorService.Sensor.GetTouchRequest, sensorService.Sensor.GetTouchResponse> getGetTouchMethod;
    if ((getGetTouchMethod = SensorServiceGrpc.getGetTouchMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getGetTouchMethod = SensorServiceGrpc.getGetTouchMethod) == null) {
          SensorServiceGrpc.getGetTouchMethod = getGetTouchMethod = 
              io.grpc.MethodDescriptor.<sensorService.Sensor.GetTouchRequest, sensorService.Sensor.GetTouchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "sensorService.SensorService", "GetTouch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sensorService.Sensor.GetTouchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sensorService.Sensor.GetTouchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("GetTouch"))
                  .build();
          }
        }
     }
     return getGetTouchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sensorService.Sensor.RawRequest,
      sensorService.Sensor.RawResponse> getRawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Raw",
      requestType = sensorService.Sensor.RawRequest.class,
      responseType = sensorService.Sensor.RawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<sensorService.Sensor.RawRequest,
      sensorService.Sensor.RawResponse> getRawMethod() {
    io.grpc.MethodDescriptor<sensorService.Sensor.RawRequest, sensorService.Sensor.RawResponse> getRawMethod;
    if ((getRawMethod = SensorServiceGrpc.getRawMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getRawMethod = SensorServiceGrpc.getRawMethod) == null) {
          SensorServiceGrpc.getRawMethod = getRawMethod = 
              io.grpc.MethodDescriptor.<sensorService.Sensor.RawRequest, sensorService.Sensor.RawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "sensorService.SensorService", "Raw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sensorService.Sensor.RawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sensorService.Sensor.RawResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("Raw"))
                  .build();
          }
        }
     }
     return getRawMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SensorServiceStub newStub(io.grpc.Channel channel) {
    return new SensorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SensorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SensorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SensorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SensorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SensorServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 获取感应数据流
     * </pre>
     */
    public void getDetect(sensorService.Sensor.GetDetectRequest request,
        io.grpc.stub.StreamObserver<sensorService.Sensor.GetDetectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDetectMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取动态感应数据
     * 场景示例： 迎宾感应
     * </pre>
     */
    public void getMotionInduction(sensorService.Sensor.GetMotionInductionRequest request,
        io.grpc.stub.StreamObserver<sensorService.Sensor.GetMotionInductionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMotionInductionMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取触摸数据流
     * </pre>
     */
    public void getTouch(sensorService.Sensor.GetTouchRequest request,
        io.grpc.stub.StreamObserver<sensorService.Sensor.GetTouchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTouchMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取传感器原始数据调试接口
     * </pre>
     */
    public void raw(sensorService.Sensor.RawRequest request,
        io.grpc.stub.StreamObserver<sensorService.Sensor.RawResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRawMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDetectMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                sensorService.Sensor.GetDetectRequest,
                sensorService.Sensor.GetDetectResponse>(
                  this, METHODID_GET_DETECT)))
          .addMethod(
            getGetMotionInductionMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                sensorService.Sensor.GetMotionInductionRequest,
                sensorService.Sensor.GetMotionInductionResponse>(
                  this, METHODID_GET_MOTION_INDUCTION)))
          .addMethod(
            getGetTouchMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                sensorService.Sensor.GetTouchRequest,
                sensorService.Sensor.GetTouchResponse>(
                  this, METHODID_GET_TOUCH)))
          .addMethod(
            getRawMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                sensorService.Sensor.RawRequest,
                sensorService.Sensor.RawResponse>(
                  this, METHODID_RAW)))
          .build();
    }
  }

  /**
   */
  public static final class SensorServiceStub extends io.grpc.stub.AbstractStub<SensorServiceStub> {
    private SensorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SensorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SensorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取感应数据流
     * </pre>
     */
    public void getDetect(sensorService.Sensor.GetDetectRequest request,
        io.grpc.stub.StreamObserver<sensorService.Sensor.GetDetectResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetDetectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取动态感应数据
     * 场景示例： 迎宾感应
     * </pre>
     */
    public void getMotionInduction(sensorService.Sensor.GetMotionInductionRequest request,
        io.grpc.stub.StreamObserver<sensorService.Sensor.GetMotionInductionResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetMotionInductionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取触摸数据流
     * </pre>
     */
    public void getTouch(sensorService.Sensor.GetTouchRequest request,
        io.grpc.stub.StreamObserver<sensorService.Sensor.GetTouchResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetTouchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取传感器原始数据调试接口
     * </pre>
     */
    public void raw(sensorService.Sensor.RawRequest request,
        io.grpc.stub.StreamObserver<sensorService.Sensor.RawResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getRawMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SensorServiceBlockingStub extends io.grpc.stub.AbstractStub<SensorServiceBlockingStub> {
    private SensorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SensorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SensorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取感应数据流
     * </pre>
     */
    public java.util.Iterator<sensorService.Sensor.GetDetectResponse> getDetect(
        sensorService.Sensor.GetDetectRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetDetectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取动态感应数据
     * 场景示例： 迎宾感应
     * </pre>
     */
    public java.util.Iterator<sensorService.Sensor.GetMotionInductionResponse> getMotionInduction(
        sensorService.Sensor.GetMotionInductionRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetMotionInductionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取触摸数据流
     * </pre>
     */
    public java.util.Iterator<sensorService.Sensor.GetTouchResponse> getTouch(
        sensorService.Sensor.GetTouchRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetTouchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取传感器原始数据调试接口
     * </pre>
     */
    public java.util.Iterator<sensorService.Sensor.RawResponse> raw(
        sensorService.Sensor.RawRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getRawMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SensorServiceFutureStub extends io.grpc.stub.AbstractStub<SensorServiceFutureStub> {
    private SensorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SensorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SensorServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_DETECT = 0;
  private static final int METHODID_GET_MOTION_INDUCTION = 1;
  private static final int METHODID_GET_TOUCH = 2;
  private static final int METHODID_RAW = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SensorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SensorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DETECT:
          serviceImpl.getDetect((sensorService.Sensor.GetDetectRequest) request,
              (io.grpc.stub.StreamObserver<sensorService.Sensor.GetDetectResponse>) responseObserver);
          break;
        case METHODID_GET_MOTION_INDUCTION:
          serviceImpl.getMotionInduction((sensorService.Sensor.GetMotionInductionRequest) request,
              (io.grpc.stub.StreamObserver<sensorService.Sensor.GetMotionInductionResponse>) responseObserver);
          break;
        case METHODID_GET_TOUCH:
          serviceImpl.getTouch((sensorService.Sensor.GetTouchRequest) request,
              (io.grpc.stub.StreamObserver<sensorService.Sensor.GetTouchResponse>) responseObserver);
          break;
        case METHODID_RAW:
          serviceImpl.raw((sensorService.Sensor.RawRequest) request,
              (io.grpc.stub.StreamObserver<sensorService.Sensor.RawResponse>) responseObserver);
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

  private static abstract class SensorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SensorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sensorService.Sensor.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SensorService");
    }
  }

  private static final class SensorServiceFileDescriptorSupplier
      extends SensorServiceBaseDescriptorSupplier {
    SensorServiceFileDescriptorSupplier() {}
  }

  private static final class SensorServiceMethodDescriptorSupplier
      extends SensorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SensorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SensorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SensorServiceFileDescriptorSupplier())
              .addMethod(getGetDetectMethod())
              .addMethod(getGetMotionInductionMethod())
              .addMethod(getGetTouchMethod())
              .addMethod(getRawMethod())
              .build();
        }
      }
    }
    return result;
  }
}
