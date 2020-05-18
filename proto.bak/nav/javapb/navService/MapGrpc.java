package navService;

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
    comments = "Source: map.proto")
public final class MapGrpc {

  private MapGrpc() {}

  public static final String SERVICE_NAME = "navService.Map";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<navService.MapOuterClass.GetMapInfoRequest,
      navService.MapOuterClass.GetMapInfoResponse> getGetMapInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMapInfo",
      requestType = navService.MapOuterClass.GetMapInfoRequest.class,
      responseType = navService.MapOuterClass.GetMapInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<navService.MapOuterClass.GetMapInfoRequest,
      navService.MapOuterClass.GetMapInfoResponse> getGetMapInfoMethod() {
    io.grpc.MethodDescriptor<navService.MapOuterClass.GetMapInfoRequest, navService.MapOuterClass.GetMapInfoResponse> getGetMapInfoMethod;
    if ((getGetMapInfoMethod = MapGrpc.getGetMapInfoMethod) == null) {
      synchronized (MapGrpc.class) {
        if ((getGetMapInfoMethod = MapGrpc.getGetMapInfoMethod) == null) {
          MapGrpc.getGetMapInfoMethod = getGetMapInfoMethod = 
              io.grpc.MethodDescriptor.<navService.MapOuterClass.GetMapInfoRequest, navService.MapOuterClass.GetMapInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "navService.Map", "GetMapInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.MapOuterClass.GetMapInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.MapOuterClass.GetMapInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MapMethodDescriptorSupplier("GetMapInfo"))
                  .build();
          }
        }
     }
     return getGetMapInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<navService.MapOuterClass.MapPositionStreamRequest,
      navService.MapOuterClass.MapPositionStreamResponse> getMapPositionStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MapPositionStream",
      requestType = navService.MapOuterClass.MapPositionStreamRequest.class,
      responseType = navService.MapOuterClass.MapPositionStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<navService.MapOuterClass.MapPositionStreamRequest,
      navService.MapOuterClass.MapPositionStreamResponse> getMapPositionStreamMethod() {
    io.grpc.MethodDescriptor<navService.MapOuterClass.MapPositionStreamRequest, navService.MapOuterClass.MapPositionStreamResponse> getMapPositionStreamMethod;
    if ((getMapPositionStreamMethod = MapGrpc.getMapPositionStreamMethod) == null) {
      synchronized (MapGrpc.class) {
        if ((getMapPositionStreamMethod = MapGrpc.getMapPositionStreamMethod) == null) {
          MapGrpc.getMapPositionStreamMethod = getMapPositionStreamMethod = 
              io.grpc.MethodDescriptor.<navService.MapOuterClass.MapPositionStreamRequest, navService.MapOuterClass.MapPositionStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "navService.Map", "MapPositionStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.MapOuterClass.MapPositionStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.MapOuterClass.MapPositionStreamResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MapMethodDescriptorSupplier("MapPositionStream"))
                  .build();
          }
        }
     }
     return getMapPositionStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<navService.MapOuterClass.LocationResetRequest,
      navService.MapOuterClass.LocationResetResponse> getLocationResetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LocationReset",
      requestType = navService.MapOuterClass.LocationResetRequest.class,
      responseType = navService.MapOuterClass.LocationResetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<navService.MapOuterClass.LocationResetRequest,
      navService.MapOuterClass.LocationResetResponse> getLocationResetMethod() {
    io.grpc.MethodDescriptor<navService.MapOuterClass.LocationResetRequest, navService.MapOuterClass.LocationResetResponse> getLocationResetMethod;
    if ((getLocationResetMethod = MapGrpc.getLocationResetMethod) == null) {
      synchronized (MapGrpc.class) {
        if ((getLocationResetMethod = MapGrpc.getLocationResetMethod) == null) {
          MapGrpc.getLocationResetMethod = getLocationResetMethod = 
              io.grpc.MethodDescriptor.<navService.MapOuterClass.LocationResetRequest, navService.MapOuterClass.LocationResetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "navService.Map", "LocationReset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.MapOuterClass.LocationResetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.MapOuterClass.LocationResetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MapMethodDescriptorSupplier("LocationReset"))
                  .build();
          }
        }
     }
     return getLocationResetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MapStub newStub(io.grpc.Channel channel) {
    return new MapStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MapBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MapBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MapFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MapFutureStub(channel);
  }

  /**
   */
  public static abstract class MapImplBase implements io.grpc.BindableService {

    /**
     */
    public void getMapInfo(navService.MapOuterClass.GetMapInfoRequest request,
        io.grpc.stub.StreamObserver<navService.MapOuterClass.GetMapInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMapInfoMethod(), responseObserver);
    }

    /**
     */
    public void mapPositionStream(navService.MapOuterClass.MapPositionStreamRequest request,
        io.grpc.stub.StreamObserver<navService.MapOuterClass.MapPositionStreamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMapPositionStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * 重置当前定位
     * 用于发生定位异常/错误状态，重新初始化导航定位
     * 重定位错误：定位状态超时|无地图|UWB错误
     * 重定位超时判断: 默认10s，仅在非错误状态下重置
     * </pre>
     */
    public void locationReset(navService.MapOuterClass.LocationResetRequest request,
        io.grpc.stub.StreamObserver<navService.MapOuterClass.LocationResetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLocationResetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMapInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                navService.MapOuterClass.GetMapInfoRequest,
                navService.MapOuterClass.GetMapInfoResponse>(
                  this, METHODID_GET_MAP_INFO)))
          .addMethod(
            getMapPositionStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                navService.MapOuterClass.MapPositionStreamRequest,
                navService.MapOuterClass.MapPositionStreamResponse>(
                  this, METHODID_MAP_POSITION_STREAM)))
          .addMethod(
            getLocationResetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                navService.MapOuterClass.LocationResetRequest,
                navService.MapOuterClass.LocationResetResponse>(
                  this, METHODID_LOCATION_RESET)))
          .build();
    }
  }

  /**
   */
  public static final class MapStub extends io.grpc.stub.AbstractStub<MapStub> {
    private MapStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MapStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MapStub(channel, callOptions);
    }

    /**
     */
    public void getMapInfo(navService.MapOuterClass.GetMapInfoRequest request,
        io.grpc.stub.StreamObserver<navService.MapOuterClass.GetMapInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMapInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mapPositionStream(navService.MapOuterClass.MapPositionStreamRequest request,
        io.grpc.stub.StreamObserver<navService.MapOuterClass.MapPositionStreamResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getMapPositionStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 重置当前定位
     * 用于发生定位异常/错误状态，重新初始化导航定位
     * 重定位错误：定位状态超时|无地图|UWB错误
     * 重定位超时判断: 默认10s，仅在非错误状态下重置
     * </pre>
     */
    public void locationReset(navService.MapOuterClass.LocationResetRequest request,
        io.grpc.stub.StreamObserver<navService.MapOuterClass.LocationResetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLocationResetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MapBlockingStub extends io.grpc.stub.AbstractStub<MapBlockingStub> {
    private MapBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MapBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MapBlockingStub(channel, callOptions);
    }

    /**
     */
    public navService.MapOuterClass.GetMapInfoResponse getMapInfo(navService.MapOuterClass.GetMapInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMapInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<navService.MapOuterClass.MapPositionStreamResponse> mapPositionStream(
        navService.MapOuterClass.MapPositionStreamRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getMapPositionStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 重置当前定位
     * 用于发生定位异常/错误状态，重新初始化导航定位
     * 重定位错误：定位状态超时|无地图|UWB错误
     * 重定位超时判断: 默认10s，仅在非错误状态下重置
     * </pre>
     */
    public navService.MapOuterClass.LocationResetResponse locationReset(navService.MapOuterClass.LocationResetRequest request) {
      return blockingUnaryCall(
          getChannel(), getLocationResetMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MapFutureStub extends io.grpc.stub.AbstractStub<MapFutureStub> {
    private MapFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MapFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MapFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<navService.MapOuterClass.GetMapInfoResponse> getMapInfo(
        navService.MapOuterClass.GetMapInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMapInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 重置当前定位
     * 用于发生定位异常/错误状态，重新初始化导航定位
     * 重定位错误：定位状态超时|无地图|UWB错误
     * 重定位超时判断: 默认10s，仅在非错误状态下重置
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<navService.MapOuterClass.LocationResetResponse> locationReset(
        navService.MapOuterClass.LocationResetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLocationResetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MAP_INFO = 0;
  private static final int METHODID_MAP_POSITION_STREAM = 1;
  private static final int METHODID_LOCATION_RESET = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MapImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MapImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MAP_INFO:
          serviceImpl.getMapInfo((navService.MapOuterClass.GetMapInfoRequest) request,
              (io.grpc.stub.StreamObserver<navService.MapOuterClass.GetMapInfoResponse>) responseObserver);
          break;
        case METHODID_MAP_POSITION_STREAM:
          serviceImpl.mapPositionStream((navService.MapOuterClass.MapPositionStreamRequest) request,
              (io.grpc.stub.StreamObserver<navService.MapOuterClass.MapPositionStreamResponse>) responseObserver);
          break;
        case METHODID_LOCATION_RESET:
          serviceImpl.locationReset((navService.MapOuterClass.LocationResetRequest) request,
              (io.grpc.stub.StreamObserver<navService.MapOuterClass.LocationResetResponse>) responseObserver);
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

  private static abstract class MapBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MapBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return navService.MapOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Map");
    }
  }

  private static final class MapFileDescriptorSupplier
      extends MapBaseDescriptorSupplier {
    MapFileDescriptorSupplier() {}
  }

  private static final class MapMethodDescriptorSupplier
      extends MapBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MapMethodDescriptorSupplier(String methodName) {
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
      synchronized (MapGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MapFileDescriptorSupplier())
              .addMethod(getGetMapInfoMethod())
              .addMethod(getMapPositionStreamMethod())
              .addMethod(getLocationResetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
