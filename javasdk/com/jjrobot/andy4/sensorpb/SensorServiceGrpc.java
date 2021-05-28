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

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.sensorpb.SensorServicePB.GetBumperRequest,
      com.jjrobot.andy4.sensorpb.SensorServicePB.GetBumperResponse> getGetBumperMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBumper",
      requestType = com.jjrobot.andy4.sensorpb.SensorServicePB.GetBumperRequest.class,
      responseType = com.jjrobot.andy4.sensorpb.SensorServicePB.GetBumperResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.sensorpb.SensorServicePB.GetBumperRequest,
      com.jjrobot.andy4.sensorpb.SensorServicePB.GetBumperResponse> getGetBumperMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.sensorpb.SensorServicePB.GetBumperRequest, com.jjrobot.andy4.sensorpb.SensorServicePB.GetBumperResponse> getGetBumperMethod;
    if ((getGetBumperMethod = SensorServiceGrpc.getGetBumperMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getGetBumperMethod = SensorServiceGrpc.getGetBumperMethod) == null) {
          SensorServiceGrpc.getGetBumperMethod = getGetBumperMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.sensorpb.SensorServicePB.GetBumperRequest, com.jjrobot.andy4.sensorpb.SensorServicePB.GetBumperResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBumper"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.sensorpb.SensorServicePB.GetBumperRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.sensorpb.SensorServicePB.GetBumperResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("GetBumper"))
              .build();
        }
      }
    }
    return getGetBumperMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.sensorpb.SensorServicePB.GetAntiRequest,
      com.jjrobot.andy4.sensorpb.SensorServicePB.GetAntiResponse> getGetAntiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnti",
      requestType = com.jjrobot.andy4.sensorpb.SensorServicePB.GetAntiRequest.class,
      responseType = com.jjrobot.andy4.sensorpb.SensorServicePB.GetAntiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.sensorpb.SensorServicePB.GetAntiRequest,
      com.jjrobot.andy4.sensorpb.SensorServicePB.GetAntiResponse> getGetAntiMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.sensorpb.SensorServicePB.GetAntiRequest, com.jjrobot.andy4.sensorpb.SensorServicePB.GetAntiResponse> getGetAntiMethod;
    if ((getGetAntiMethod = SensorServiceGrpc.getGetAntiMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getGetAntiMethod = SensorServiceGrpc.getGetAntiMethod) == null) {
          SensorServiceGrpc.getGetAntiMethod = getGetAntiMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.sensorpb.SensorServicePB.GetAntiRequest, com.jjrobot.andy4.sensorpb.SensorServicePB.GetAntiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnti"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.sensorpb.SensorServicePB.GetAntiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.sensorpb.SensorServicePB.GetAntiResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("GetAnti"))
              .build();
        }
      }
    }
    return getGetAntiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.sensorpb.SensorServicePB.GetObsRequest,
      com.jjrobot.andy4.sensorpb.SensorServicePB.GetObsResponse> getGetObsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObs",
      requestType = com.jjrobot.andy4.sensorpb.SensorServicePB.GetObsRequest.class,
      responseType = com.jjrobot.andy4.sensorpb.SensorServicePB.GetObsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.sensorpb.SensorServicePB.GetObsRequest,
      com.jjrobot.andy4.sensorpb.SensorServicePB.GetObsResponse> getGetObsMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.sensorpb.SensorServicePB.GetObsRequest, com.jjrobot.andy4.sensorpb.SensorServicePB.GetObsResponse> getGetObsMethod;
    if ((getGetObsMethod = SensorServiceGrpc.getGetObsMethod) == null) {
      synchronized (SensorServiceGrpc.class) {
        if ((getGetObsMethod = SensorServiceGrpc.getGetObsMethod) == null) {
          SensorServiceGrpc.getGetObsMethod = getGetObsMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.sensorpb.SensorServicePB.GetObsRequest, com.jjrobot.andy4.sensorpb.SensorServicePB.GetObsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.sensorpb.SensorServicePB.GetObsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.sensorpb.SensorServicePB.GetObsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SensorServiceMethodDescriptorSupplier("GetObs"))
              .build();
        }
      }
    }
    return getGetObsMethod;
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
     *计算前方障碍的距离与方法(该接口不再支持)
     * </pre>
     */
    public void getDetect(com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDetectMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取动态感应数据(该接口不再支持)
     * </pre>
     */
    public void getMotionInduction(com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMotionInductionMethod(), responseObserver);
    }

    /**
     * <pre>
     *获取触摸感应数据
     * </pre>
     */
    public void getTouch(com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTouchMethod(), responseObserver);
    }

    /**
     * <pre>
     *碰撞传感器数据
     * </pre>
     */
    public void getBumper(com.jjrobot.andy4.sensorpb.SensorServicePB.GetBumperRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.GetBumperResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBumperMethod(), responseObserver);
    }

    /**
     * <pre>
     *防跌落传感器数据
     * </pre>
     */
    public void getAnti(com.jjrobot.andy4.sensorpb.SensorServicePB.GetAntiRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.GetAntiResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAntiMethod(), responseObserver);
    }

    /**
     * <pre>
     *避障距离传感器
     * </pre>
     */
    public void getObs(com.jjrobot.andy4.sensorpb.SensorServicePB.GetObsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.GetObsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetObsMethod(), responseObserver);
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
            getGetBumperMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jjrobot.andy4.sensorpb.SensorServicePB.GetBumperRequest,
                com.jjrobot.andy4.sensorpb.SensorServicePB.GetBumperResponse>(
                  this, METHODID_GET_BUMPER)))
          .addMethod(
            getGetAntiMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jjrobot.andy4.sensorpb.SensorServicePB.GetAntiRequest,
                com.jjrobot.andy4.sensorpb.SensorServicePB.GetAntiResponse>(
                  this, METHODID_GET_ANTI)))
          .addMethod(
            getGetObsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jjrobot.andy4.sensorpb.SensorServicePB.GetObsRequest,
                com.jjrobot.andy4.sensorpb.SensorServicePB.GetObsResponse>(
                  this, METHODID_GET_OBS)))
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
     *计算前方障碍的距离与方法(该接口不再支持)
     * </pre>
     */
    public void getDetect(com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetDetectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取动态感应数据(该接口不再支持)
     * </pre>
     */
    public void getMotionInduction(com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetMotionInductionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取触摸感应数据
     * </pre>
     */
    public void getTouch(com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetTouchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *碰撞传感器数据
     * </pre>
     */
    public void getBumper(com.jjrobot.andy4.sensorpb.SensorServicePB.GetBumperRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.GetBumperResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetBumperMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *防跌落传感器数据
     * </pre>
     */
    public void getAnti(com.jjrobot.andy4.sensorpb.SensorServicePB.GetAntiRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.GetAntiResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAntiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *避障距离传感器
     * </pre>
     */
    public void getObs(com.jjrobot.andy4.sensorpb.SensorServicePB.GetObsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.GetObsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetObsMethod(), getCallOptions()), request, responseObserver);
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
     *计算前方障碍的距离与方法(该接口不再支持)
     * </pre>
     */
    public java.util.Iterator<com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectResponse> getDetect(
        com.jjrobot.andy4.sensorpb.SensorServicePB.GetDetectRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetDetectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取动态感应数据(该接口不再支持)
     * </pre>
     */
    public java.util.Iterator<com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionResponse> getMotionInduction(
        com.jjrobot.andy4.sensorpb.SensorServicePB.GetMotionInductionRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetMotionInductionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *获取触摸感应数据
     * </pre>
     */
    public java.util.Iterator<com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchResponse> getTouch(
        com.jjrobot.andy4.sensorpb.SensorServicePB.GetTouchRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetTouchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *碰撞传感器数据
     * </pre>
     */
    public java.util.Iterator<com.jjrobot.andy4.sensorpb.SensorServicePB.GetBumperResponse> getBumper(
        com.jjrobot.andy4.sensorpb.SensorServicePB.GetBumperRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetBumperMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *防跌落传感器数据
     * </pre>
     */
    public java.util.Iterator<com.jjrobot.andy4.sensorpb.SensorServicePB.GetAntiResponse> getAnti(
        com.jjrobot.andy4.sensorpb.SensorServicePB.GetAntiRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAntiMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *避障距离传感器
     * </pre>
     */
    public java.util.Iterator<com.jjrobot.andy4.sensorpb.SensorServicePB.GetObsResponse> getObs(
        com.jjrobot.andy4.sensorpb.SensorServicePB.GetObsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetObsMethod(), getCallOptions(), request);
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
  private static final int METHODID_GET_BUMPER = 3;
  private static final int METHODID_GET_ANTI = 4;
  private static final int METHODID_GET_OBS = 5;

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
        case METHODID_GET_BUMPER:
          serviceImpl.getBumper((com.jjrobot.andy4.sensorpb.SensorServicePB.GetBumperRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.GetBumperResponse>) responseObserver);
          break;
        case METHODID_GET_ANTI:
          serviceImpl.getAnti((com.jjrobot.andy4.sensorpb.SensorServicePB.GetAntiRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.GetAntiResponse>) responseObserver);
          break;
        case METHODID_GET_OBS:
          serviceImpl.getObs((com.jjrobot.andy4.sensorpb.SensorServicePB.GetObsRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.sensorpb.SensorServicePB.GetObsResponse>) responseObserver);
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
              .addMethod(getGetBumperMethod())
              .addMethod(getGetAntiMethod())
              .addMethod(getGetObsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
