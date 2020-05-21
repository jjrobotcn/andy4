package com.jjrobot.andy4.sensorpb;

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
 * sensorService.SensorService 传感器服务
 * 开发管理平台功能参考: http://10.10.10.2/detect
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.1-SNAPSHOT)",
    comments = "Source: sensor.proto")
public final class SensorServiceGrpc {

  private SensorServiceGrpc() {}

  public static final String SERVICE_NAME = "sensorService.SensorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectRequest,
      com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectResponse> getGetDetectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDetect",
      requestType = com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectRequest.class,
      responseType = com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectRequest,
      com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectResponse> getGetDetectMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectRequest, com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectResponse> getGetDetectMethod;
    if ((getGetDetectMethod = SensorServiceGrpc.getGetDetectMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getGetDetectMethod = SensorServiceGrpc.getGetDetectMethod) == null) {
          SensorServiceGrpc.getGetDetectMethod = getGetDetectMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectRequest, com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDetect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("GetDetect"))
              .build();
        }
      }
    }
    return getGetDetectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionRequest,
      com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionResponse> getGetMotionInductionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMotionInduction",
      requestType = com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionRequest.class,
      responseType = com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionRequest,
      com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionResponse> getGetMotionInductionMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionRequest, com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionResponse> getGetMotionInductionMethod;
    if ((getGetMotionInductionMethod = SensorServiceGrpc.getGetMotionInductionMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getGetMotionInductionMethod = SensorServiceGrpc.getGetMotionInductionMethod) == null) {
          SensorServiceGrpc.getGetMotionInductionMethod = getGetMotionInductionMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionRequest, com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMotionInduction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("GetMotionInduction"))
              .build();
        }
      }
    }
    return getGetMotionInductionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchRequest,
      com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchResponse> getGetTouchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTouch",
      requestType = com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchRequest.class,
      responseType = com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchRequest,
      com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchResponse> getGetTouchMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchRequest, com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchResponse> getGetTouchMethod;
    if ((getGetTouchMethod = SensorServiceGrpc.getGetTouchMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getGetTouchMethod = SensorServiceGrpc.getGetTouchMethod) == null) {
          SensorServiceGrpc.getGetTouchMethod = getGetTouchMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchRequest, com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTouch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("GetTouch"))
              .build();
        }
      }
    }
    return getGetTouchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.sensorpb.SensorServicePB.RawRequest,
      com.jjrobot.andy4.sensorpb.SensorServicePB.RawResponse> getRawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Raw",
      requestType = com.jjrobot.andy4.sensorpb.SensorServicePB.RawRequest.class,
      responseType = com.jjrobot.andy4.sensorpb.SensorServicePB.RawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.sensorpb.SensorServicePB.RawRequest,
      com.jjrobot.andy4.sensorpb.SensorServicePB.RawResponse> getRawMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.sensorpb.SensorServicePB.RawRequest, com.jjrobot.andy4.sensorpb.SensorServicePB.RawResponse> getRawMethod;
    if ((getRawMethod = SensorServiceGrpc.getRawMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getRawMethod = SensorServiceGrpc.getRawMethod) == null) {
          SensorServiceGrpc.getRawMethod = getRawMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.sensorpb.SensorServicePB.RawRequest, com.jjrobot.andy4.sensorpb.SensorServicePB.RawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Raw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.sensorpb.SensorServicePB.RawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.sensorpb.SensorServicePB.RawResponse.getDefaultInstance()))
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
    io.grpc.stub.AbstractStub.StubFactory<SensorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SensorServiceStub>() {
        @java.lang.Override
        public SensorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SensorServiceStub(channel, callOptions);
        }
      };
    return SensorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SensorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SensorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SensorServiceBlockingStub>() {
        @java.lang.Override
        public SensorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SensorServiceBlockingStub(channel, callOptions);
        }
      };
    return SensorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SensorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SensorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SensorServiceFutureStub>() {
        @java.lang.Override
        public SensorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SensorServiceFutureStub(channel, callOptions);
        }
      };
    return SensorServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * sensorService.SensorService 传感器服务
   * 开发管理平台功能参考: http://10.10.10.2/detect
   * </pre>
   */
  public static abstract class SensorServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetDetect 计算前方障碍的距离与方法
     * 此计算方法受GetMotionInduction数据影响
     * </pre>
     */
    public void getDetect(com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDetectMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetMotionInduction 获取动态感应数据
     * </pre>
     */
    public void getMotionInduction(com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMotionInductionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetTouch 获取触摸感应数据
     * 目前支持头部与手部的触摸
     * </pre>
     */
    public void getTouch(com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTouchMethod(), responseObserver);
    }

    /**
     * <pre>
     * Raw 内部传感器数据
     * 此方法为底层数据方法，用于上层的计算与调试，通常开发用户不应使用此方法
     * </pre>
     */
    public void raw(com.jjrobot.andy4.sensorpb.SensorServicePB.RawRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.RawResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRawMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDetectMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectRequest,
                com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectResponse>(
                  this, METHODID_GET_DETECT)))
          .addMethod(
            getGetMotionInductionMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionRequest,
                com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionResponse>(
                  this, METHODID_GET_MOTION_INDUCTION)))
          .addMethod(
            getGetTouchMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchRequest,
                com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchResponse>(
                  this, METHODID_GET_TOUCH)))
          .addMethod(
            getRawMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jjrobot.andy4.sensorpb.SensorServicePB.RawRequest,
                com.jjrobot.andy4.sensorpb.SensorServicePB.RawResponse>(
                  this, METHODID_RAW)))
          .build();
    }
  }

  /**
   * <pre>
   * sensorService.SensorService 传感器服务
   * 开发管理平台功能参考: http://10.10.10.2/detect
   * </pre>
   */
  public static final class SensorServiceStub extends io.grpc.stub.AbstractAsyncStub<SensorServiceStub> {
    private SensorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SensorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetDetect 计算前方障碍的距离与方法
     * 此计算方法受GetMotionInduction数据影响
     * </pre>
     */
    public void getDetect(com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetDetectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetMotionInduction 获取动态感应数据
     * </pre>
     */
    public void getMotionInduction(com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetMotionInductionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetTouch 获取触摸感应数据
     * 目前支持头部与手部的触摸
     * </pre>
     */
    public void getTouch(com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetTouchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Raw 内部传感器数据
     * 此方法为底层数据方法，用于上层的计算与调试，通常开发用户不应使用此方法
     * </pre>
     */
    public void raw(com.jjrobot.andy4.sensorpb.SensorServicePB.RawRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.RawResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getRawMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * sensorService.SensorService 传感器服务
   * 开发管理平台功能参考: http://10.10.10.2/detect
   * </pre>
   */
  public static final class SensorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SensorServiceBlockingStub> {
    private SensorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SensorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetDetect 计算前方障碍的距离与方法
     * 此计算方法受GetMotionInduction数据影响
     * </pre>
     */
    public java.util.Iterator<com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectResponse> getDetect(
        com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetDetectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetMotionInduction 获取动态感应数据
     * </pre>
     */
    public java.util.Iterator<com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionResponse> getMotionInduction(
        com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetMotionInductionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetTouch 获取触摸感应数据
     * 目前支持头部与手部的触摸
     * </pre>
     */
    public java.util.Iterator<com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchResponse> getTouch(
        com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetTouchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Raw 内部传感器数据
     * 此方法为底层数据方法，用于上层的计算与调试，通常开发用户不应使用此方法
     * </pre>
     */
    public java.util.Iterator<com.jjrobot.andy4.sensorpb.SensorServicePB.RawResponse> raw(
        com.jjrobot.andy4.sensorpb.SensorServicePB.RawRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getRawMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * sensorService.SensorService 传感器服务
   * 开发管理平台功能参考: http://10.10.10.2/detect
   * </pre>
   */
  public static final class SensorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SensorServiceFutureStub> {
    private SensorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SensorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
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
          serviceImpl.getDetect((com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectResponse>) responseObserver);
          break;
        case METHODID_GET_MOTION_INDUCTION:
          serviceImpl.getMotionInduction((com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionResponse>) responseObserver);
          break;
        case METHODID_GET_TOUCH:
          serviceImpl.getTouch((com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchResponse>) responseObserver);
          break;
        case METHODID_RAW:
          serviceImpl.raw((com.jjrobot.andy4.sensorpb.SensorServicePB.RawRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.RawResponse>) responseObserver);
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
      return com.jjrobot.andy4.sensorpb.SensorServicePB.getDescriptor();
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
