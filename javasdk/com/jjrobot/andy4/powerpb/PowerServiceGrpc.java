package com.jjrobot.andy4.powerpb;

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
 * powerService.PowerService 电源控制管理
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.1-SNAPSHOT)",
    comments = "Source: power.proto")
public final class PowerServiceGrpc {

  private PowerServiceGrpc() {}

  public static final String SERVICE_NAME = "powerService.PowerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.powerpb.PowerServicePB.GetPowerStatusRequest,
      com.jjrobot.andy4.powerpb.PowerServicePB.GetPowerStatusResponse> getGetPowerStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPowerStatus",
      requestType = com.jjrobot.andy4.powerpb.PowerServicePB.GetPowerStatusRequest.class,
      responseType = com.jjrobot.andy4.powerpb.PowerServicePB.GetPowerStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.powerpb.PowerServicePB.GetPowerStatusRequest,
      com.jjrobot.andy4.powerpb.PowerServicePB.GetPowerStatusResponse> getGetPowerStatusMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.powerpb.PowerServicePB.GetPowerStatusRequest, com.jjrobot.andy4.powerpb.PowerServicePB.GetPowerStatusResponse> getGetPowerStatusMethod;
    if ((getGetPowerStatusMethod = PowerServiceGrpc.getGetPowerStatusMethod) == null) {
      synchronized (PowerServiceGrpc.class) {
        if ((getGetPowerStatusMethod = PowerServiceGrpc.getGetPowerStatusMethod) == null) {
          PowerServiceGrpc.getGetPowerStatusMethod = getGetPowerStatusMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.powerpb.PowerServicePB.GetPowerStatusRequest, com.jjrobot.andy4.powerpb.PowerServicePB.GetPowerStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPowerStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.powerpb.PowerServicePB.GetPowerStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.powerpb.PowerServicePB.GetPowerStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PowerServiceMethodDescriptorSupplier("GetPowerStatus"))
              .build();
        }
      }
    }
    return getGetPowerStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.powerpb.PowerServicePB.RebootRequest,
      com.jjrobot.andy4.powerpb.PowerServicePB.RebootResponse> getRebootMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reboot",
      requestType = com.jjrobot.andy4.powerpb.PowerServicePB.RebootRequest.class,
      responseType = com.jjrobot.andy4.powerpb.PowerServicePB.RebootResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.powerpb.PowerServicePB.RebootRequest,
      com.jjrobot.andy4.powerpb.PowerServicePB.RebootResponse> getRebootMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.powerpb.PowerServicePB.RebootRequest, com.jjrobot.andy4.powerpb.PowerServicePB.RebootResponse> getRebootMethod;
    if ((getRebootMethod = PowerServiceGrpc.getRebootMethod) == null) {
      synchronized (PowerServiceGrpc.class) {
        if ((getRebootMethod = PowerServiceGrpc.getRebootMethod) == null) {
          PowerServiceGrpc.getRebootMethod = getRebootMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.powerpb.PowerServicePB.RebootRequest, com.jjrobot.andy4.powerpb.PowerServicePB.RebootResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reboot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.powerpb.PowerServicePB.RebootRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.powerpb.PowerServicePB.RebootResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PowerServiceMethodDescriptorSupplier("Reboot"))
              .build();
        }
      }
    }
    return getRebootMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.powerpb.PowerServicePB.StatesRequest,
      com.jjrobot.andy4.powerpb.PowerServicePB.StatesResponse> getStatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "States",
      requestType = com.jjrobot.andy4.powerpb.PowerServicePB.StatesRequest.class,
      responseType = com.jjrobot.andy4.powerpb.PowerServicePB.StatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.powerpb.PowerServicePB.StatesRequest,
      com.jjrobot.andy4.powerpb.PowerServicePB.StatesResponse> getStatesMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.powerpb.PowerServicePB.StatesRequest, com.jjrobot.andy4.powerpb.PowerServicePB.StatesResponse> getStatesMethod;
    if ((getStatesMethod = PowerServiceGrpc.getStatesMethod) == null) {
      synchronized (PowerServiceGrpc.class) {
        if ((getStatesMethod = PowerServiceGrpc.getStatesMethod) == null) {
          PowerServiceGrpc.getStatesMethod = getStatesMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.powerpb.PowerServicePB.StatesRequest, com.jjrobot.andy4.powerpb.PowerServicePB.StatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "States"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.powerpb.PowerServicePB.StatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.powerpb.PowerServicePB.StatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PowerServiceMethodDescriptorSupplier("States"))
              .build();
        }
      }
    }
    return getStatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.powerpb.PowerServicePB.SwitchRequest,
      com.jjrobot.andy4.powerpb.PowerServicePB.SwitchResponse> getSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Switch",
      requestType = com.jjrobot.andy4.powerpb.PowerServicePB.SwitchRequest.class,
      responseType = com.jjrobot.andy4.powerpb.PowerServicePB.SwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.powerpb.PowerServicePB.SwitchRequest,
      com.jjrobot.andy4.powerpb.PowerServicePB.SwitchResponse> getSwitchMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.powerpb.PowerServicePB.SwitchRequest, com.jjrobot.andy4.powerpb.PowerServicePB.SwitchResponse> getSwitchMethod;
    if ((getSwitchMethod = PowerServiceGrpc.getSwitchMethod) == null) {
      synchronized (PowerServiceGrpc.class) {
        if ((getSwitchMethod = PowerServiceGrpc.getSwitchMethod) == null) {
          PowerServiceGrpc.getSwitchMethod = getSwitchMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.powerpb.PowerServicePB.SwitchRequest, com.jjrobot.andy4.powerpb.PowerServicePB.SwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Switch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.powerpb.PowerServicePB.SwitchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.powerpb.PowerServicePB.SwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PowerServiceMethodDescriptorSupplier("Switch"))
              .build();
        }
      }
    }
    return getSwitchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PowerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PowerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PowerServiceStub>() {
        @java.lang.Override
        public PowerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PowerServiceStub(channel, callOptions);
        }
      };
    return PowerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PowerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PowerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PowerServiceBlockingStub>() {
        @java.lang.Override
        public PowerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PowerServiceBlockingStub(channel, callOptions);
        }
      };
    return PowerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PowerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PowerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PowerServiceFutureStub>() {
        @java.lang.Override
        public PowerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PowerServiceFutureStub(channel, callOptions);
        }
      };
    return PowerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * powerService.PowerService 电源控制管理
   * </pre>
   */
  public static abstract class PowerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetPowerStatus 监听电源状态
     * 开发管理平台功能参考: http://10.10.10.2/power
     * </pre>
     */
    public void getPowerStatus(com.jjrobot.andy4.powerpb.PowerServicePB.GetPowerStatusRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.powerpb.PowerServicePB.GetPowerStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPowerStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reboot 内部模块的电源进行断电方式重启
     * </pre>
     */
    public void reboot(com.jjrobot.andy4.powerpb.PowerServicePB.RebootRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.powerpb.PowerServicePB.RebootResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRebootMethod(), responseObserver);
    }

    /**
     * <pre>
     * States 获取电源模块状态
     * </pre>
     */
    public void states(com.jjrobot.andy4.powerpb.PowerServicePB.StatesRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.powerpb.PowerServicePB.StatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Switch 控制内部模块电源的开关
     * </pre>
     */
    public void switch_(com.jjrobot.andy4.powerpb.PowerServicePB.SwitchRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.powerpb.PowerServicePB.SwitchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPowerStatusMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jjrobot.andy4.powerpb.PowerServicePB.GetPowerStatusRequest,
                com.jjrobot.andy4.powerpb.PowerServicePB.GetPowerStatusResponse>(
                  this, METHODID_GET_POWER_STATUS)))
          .addMethod(
            getRebootMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.powerpb.PowerServicePB.RebootRequest,
                com.jjrobot.andy4.powerpb.PowerServicePB.RebootResponse>(
                  this, METHODID_REBOOT)))
          .addMethod(
            getStatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.powerpb.PowerServicePB.StatesRequest,
                com.jjrobot.andy4.powerpb.PowerServicePB.StatesResponse>(
                  this, METHODID_STATES)))
          .addMethod(
            getSwitchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.powerpb.PowerServicePB.SwitchRequest,
                com.jjrobot.andy4.powerpb.PowerServicePB.SwitchResponse>(
                  this, METHODID_SWITCH)))
          .build();
    }
  }

  /**
   * <pre>
   * powerService.PowerService 电源控制管理
   * </pre>
   */
  public static final class PowerServiceStub extends io.grpc.stub.AbstractAsyncStub<PowerServiceStub> {
    private PowerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PowerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PowerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetPowerStatus 监听电源状态
     * 开发管理平台功能参考: http://10.10.10.2/power
     * </pre>
     */
    public void getPowerStatus(com.jjrobot.andy4.powerpb.PowerServicePB.GetPowerStatusRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.powerpb.PowerServicePB.GetPowerStatusResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetPowerStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reboot 内部模块的电源进行断电方式重启
     * </pre>
     */
    public void reboot(com.jjrobot.andy4.powerpb.PowerServicePB.RebootRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.powerpb.PowerServicePB.RebootResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRebootMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * States 获取电源模块状态
     * </pre>
     */
    public void states(com.jjrobot.andy4.powerpb.PowerServicePB.StatesRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.powerpb.PowerServicePB.StatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Switch 控制内部模块电源的开关
     * </pre>
     */
    public void switch_(com.jjrobot.andy4.powerpb.PowerServicePB.SwitchRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.powerpb.PowerServicePB.SwitchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * powerService.PowerService 电源控制管理
   * </pre>
   */
  public static final class PowerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PowerServiceBlockingStub> {
    private PowerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PowerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PowerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetPowerStatus 监听电源状态
     * 开发管理平台功能参考: http://10.10.10.2/power
     * </pre>
     */
    public java.util.Iterator<com.jjrobot.andy4.powerpb.PowerServicePB.GetPowerStatusResponse> getPowerStatus(
        com.jjrobot.andy4.powerpb.PowerServicePB.GetPowerStatusRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetPowerStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reboot 内部模块的电源进行断电方式重启
     * </pre>
     */
    public com.jjrobot.andy4.powerpb.PowerServicePB.RebootResponse reboot(com.jjrobot.andy4.powerpb.PowerServicePB.RebootRequest request) {
      return blockingUnaryCall(
          getChannel(), getRebootMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * States 获取电源模块状态
     * </pre>
     */
    public com.jjrobot.andy4.powerpb.PowerServicePB.StatesResponse states(com.jjrobot.andy4.powerpb.PowerServicePB.StatesRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Switch 控制内部模块电源的开关
     * </pre>
     */
    public com.jjrobot.andy4.powerpb.PowerServicePB.SwitchResponse switch_(com.jjrobot.andy4.powerpb.PowerServicePB.SwitchRequest request) {
      return blockingUnaryCall(
          getChannel(), getSwitchMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * powerService.PowerService 电源控制管理
   * </pre>
   */
  public static final class PowerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PowerServiceFutureStub> {
    private PowerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PowerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PowerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Reboot 内部模块的电源进行断电方式重启
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.powerpb.PowerServicePB.RebootResponse> reboot(
        com.jjrobot.andy4.powerpb.PowerServicePB.RebootRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRebootMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * States 获取电源模块状态
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.powerpb.PowerServicePB.StatesResponse> states(
        com.jjrobot.andy4.powerpb.PowerServicePB.StatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Switch 控制内部模块电源的开关
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.powerpb.PowerServicePB.SwitchResponse> switch_(
        com.jjrobot.andy4.powerpb.PowerServicePB.SwitchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_POWER_STATUS = 0;
  private static final int METHODID_REBOOT = 1;
  private static final int METHODID_STATES = 2;
  private static final int METHODID_SWITCH = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PowerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PowerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_POWER_STATUS:
          serviceImpl.getPowerStatus((com.jjrobot.andy4.powerpb.PowerServicePB.GetPowerStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.powerpb.PowerServicePB.GetPowerStatusResponse>) responseObserver);
          break;
        case METHODID_REBOOT:
          serviceImpl.reboot((com.jjrobot.andy4.powerpb.PowerServicePB.RebootRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.powerpb.PowerServicePB.RebootResponse>) responseObserver);
          break;
        case METHODID_STATES:
          serviceImpl.states((com.jjrobot.andy4.powerpb.PowerServicePB.StatesRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.powerpb.PowerServicePB.StatesResponse>) responseObserver);
          break;
        case METHODID_SWITCH:
          serviceImpl.switch_((com.jjrobot.andy4.powerpb.PowerServicePB.SwitchRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.powerpb.PowerServicePB.SwitchResponse>) responseObserver);
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

  private static abstract class PowerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PowerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jjrobot.andy4.powerpb.PowerServicePB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PowerService");
    }
  }

  private static final class PowerServiceFileDescriptorSupplier
      extends PowerServiceBaseDescriptorSupplier {
    PowerServiceFileDescriptorSupplier() {}
  }

  private static final class PowerServiceMethodDescriptorSupplier
      extends PowerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PowerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PowerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PowerServiceFileDescriptorSupplier())
              .addMethod(getGetPowerStatusMethod())
              .addMethod(getRebootMethod())
              .addMethod(getStatesMethod())
              .addMethod(getSwitchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
