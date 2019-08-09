package powerService;

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
    comments = "Source: power.proto")
public final class PowerServiceGrpc {

  private PowerServiceGrpc() {}

  public static final String SERVICE_NAME = "powerService.PowerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<powerService.Power.GetPowerStatusRequest,
      powerService.Power.GetPowerStatusResponse> getGetPowerStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPowerStatus",
      requestType = powerService.Power.GetPowerStatusRequest.class,
      responseType = powerService.Power.GetPowerStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<powerService.Power.GetPowerStatusRequest,
      powerService.Power.GetPowerStatusResponse> getGetPowerStatusMethod() {
    io.grpc.MethodDescriptor<powerService.Power.GetPowerStatusRequest, powerService.Power.GetPowerStatusResponse> getGetPowerStatusMethod;
    if ((getGetPowerStatusMethod = PowerServiceGrpc.getGetPowerStatusMethod) == null) {
      synchronized (PowerServiceGrpc.class) {
        if ((getGetPowerStatusMethod = PowerServiceGrpc.getGetPowerStatusMethod) == null) {
          PowerServiceGrpc.getGetPowerStatusMethod = getGetPowerStatusMethod = 
              io.grpc.MethodDescriptor.<powerService.Power.GetPowerStatusRequest, powerService.Power.GetPowerStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "powerService.PowerService", "GetPowerStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  powerService.Power.GetPowerStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  powerService.Power.GetPowerStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PowerServiceMethodDescriptorSupplier("GetPowerStatus"))
                  .build();
          }
        }
     }
     return getGetPowerStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PowerServiceStub newStub(io.grpc.Channel channel) {
    return new PowerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PowerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PowerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PowerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PowerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PowerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 获取电源状态数据流
     * </pre>
     */
    public void getPowerStatus(powerService.Power.GetPowerStatusRequest request,
        io.grpc.stub.StreamObserver<powerService.Power.GetPowerStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPowerStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPowerStatusMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                powerService.Power.GetPowerStatusRequest,
                powerService.Power.GetPowerStatusResponse>(
                  this, METHODID_GET_POWER_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class PowerServiceStub extends io.grpc.stub.AbstractStub<PowerServiceStub> {
    private PowerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PowerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PowerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PowerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取电源状态数据流
     * </pre>
     */
    public void getPowerStatus(powerService.Power.GetPowerStatusRequest request,
        io.grpc.stub.StreamObserver<powerService.Power.GetPowerStatusResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetPowerStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PowerServiceBlockingStub extends io.grpc.stub.AbstractStub<PowerServiceBlockingStub> {
    private PowerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PowerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PowerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PowerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取电源状态数据流
     * </pre>
     */
    public java.util.Iterator<powerService.Power.GetPowerStatusResponse> getPowerStatus(
        powerService.Power.GetPowerStatusRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetPowerStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PowerServiceFutureStub extends io.grpc.stub.AbstractStub<PowerServiceFutureStub> {
    private PowerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PowerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PowerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PowerServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_POWER_STATUS = 0;

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
          serviceImpl.getPowerStatus((powerService.Power.GetPowerStatusRequest) request,
              (io.grpc.stub.StreamObserver<powerService.Power.GetPowerStatusResponse>) responseObserver);
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
      return powerService.Power.getDescriptor();
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
              .build();
        }
      }
    }
    return result;
  }
}
