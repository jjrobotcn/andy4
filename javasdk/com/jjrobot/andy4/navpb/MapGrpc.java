package com.jjrobot.andy4.navpb;

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
 * navService.Map 导航地图
 * 仅无线导航版本支持
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.1-SNAPSHOT)",
    comments = "Source: map.proto")
public final class MapGrpc {

  private MapGrpc() {}

  public static final String SERVICE_NAME = "navService.Map";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.MapPB.GetMapInfoRequest,
      com.jjrobot.andy4.navpb.MapPB.GetMapInfoResponse> getGetMapInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMapInfo",
      requestType = com.jjrobot.andy4.navpb.MapPB.GetMapInfoRequest.class,
      responseType = com.jjrobot.andy4.navpb.MapPB.GetMapInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.MapPB.GetMapInfoRequest,
      com.jjrobot.andy4.navpb.MapPB.GetMapInfoResponse> getGetMapInfoMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.MapPB.GetMapInfoRequest, com.jjrobot.andy4.navpb.MapPB.GetMapInfoResponse> getGetMapInfoMethod;
    if ((getGetMapInfoMethod = MapGrpc.getGetMapInfoMethod) == null) {
      synchronized (MapGrpc.class) {
        if ((getGetMapInfoMethod = MapGrpc.getGetMapInfoMethod) == null) {
          MapGrpc.getGetMapInfoMethod = getGetMapInfoMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.navpb.MapPB.GetMapInfoRequest, com.jjrobot.andy4.navpb.MapPB.GetMapInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMapInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.MapPB.GetMapInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.MapPB.GetMapInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapMethodDescriptorSupplier("GetMapInfo"))
              .build();
        }
      }
    }
    return getGetMapInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.MapPB.MapPositionStreamRequest,
      com.jjrobot.andy4.navpb.MapPB.MapPositionStreamResponse> getMapPositionStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MapPositionStream",
      requestType = com.jjrobot.andy4.navpb.MapPB.MapPositionStreamRequest.class,
      responseType = com.jjrobot.andy4.navpb.MapPB.MapPositionStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.MapPB.MapPositionStreamRequest,
      com.jjrobot.andy4.navpb.MapPB.MapPositionStreamResponse> getMapPositionStreamMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.MapPB.MapPositionStreamRequest, com.jjrobot.andy4.navpb.MapPB.MapPositionStreamResponse> getMapPositionStreamMethod;
    if ((getMapPositionStreamMethod = MapGrpc.getMapPositionStreamMethod) == null) {
      synchronized (MapGrpc.class) {
        if ((getMapPositionStreamMethod = MapGrpc.getMapPositionStreamMethod) == null) {
          MapGrpc.getMapPositionStreamMethod = getMapPositionStreamMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.navpb.MapPB.MapPositionStreamRequest, com.jjrobot.andy4.navpb.MapPB.MapPositionStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MapPositionStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.MapPB.MapPositionStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.MapPB.MapPositionStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapMethodDescriptorSupplier("MapPositionStream"))
              .build();
        }
      }
    }
    return getMapPositionStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.MapPB.LocationResetRequest,
      com.jjrobot.andy4.navpb.MapPB.LocationResetResponse> getLocationResetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LocationReset",
      requestType = com.jjrobot.andy4.navpb.MapPB.LocationResetRequest.class,
      responseType = com.jjrobot.andy4.navpb.MapPB.LocationResetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.MapPB.LocationResetRequest,
      com.jjrobot.andy4.navpb.MapPB.LocationResetResponse> getLocationResetMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.MapPB.LocationResetRequest, com.jjrobot.andy4.navpb.MapPB.LocationResetResponse> getLocationResetMethod;
    if ((getLocationResetMethod = MapGrpc.getLocationResetMethod) == null) {
      synchronized (MapGrpc.class) {
        if ((getLocationResetMethod = MapGrpc.getLocationResetMethod) == null) {
          MapGrpc.getLocationResetMethod = getLocationResetMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.navpb.MapPB.LocationResetRequest, com.jjrobot.andy4.navpb.MapPB.LocationResetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LocationReset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.MapPB.LocationResetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.MapPB.LocationResetResponse.getDefaultInstance()))
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
    io.grpc.stub.AbstractStub.StubFactory<MapStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MapStub>() {
        @java.lang.Override
        public MapStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MapStub(channel, callOptions);
        }
      };
    return MapStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MapBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MapBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MapBlockingStub>() {
        @java.lang.Override
        public MapBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MapBlockingStub(channel, callOptions);
        }
      };
    return MapBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MapFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MapFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MapFutureStub>() {
        @java.lang.Override
        public MapFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MapFutureStub(channel, callOptions);
        }
      };
    return MapFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * navService.Map 导航地图
   * 仅无线导航版本支持
   * </pre>
   */
  public static abstract class MapImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetMapInfo 获取地图信息
     * </pre>
     */
    public void getMapInfo(com.jjrobot.andy4.navpb.MapPB.GetMapInfoRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.MapPB.GetMapInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMapInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * MapPositionStream 监听设备的地图定位信息
     * </pre>
     */
    public void mapPositionStream(com.jjrobot.andy4.navpb.MapPB.MapPositionStreamRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.MapPB.MapPositionStreamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMapPositionStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * LocationReset 重置当前定位
     * 某些情况下此方法返回成功时可能出现实际位置与地图位置不相符，
     * 在有明确参照物附近调用此方法可提高准确定位成功率。
     * 用于发生定位异常/错误状态，重新初始化导航定位
     * 重定位错误：定位状态超时|无地图|UWB错误
     * 重定位超时判断: 默认10s，仅在非错误状态下重置
     * </pre>
     */
    public void locationReset(com.jjrobot.andy4.navpb.MapPB.LocationResetRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.MapPB.LocationResetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLocationResetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMapInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.navpb.MapPB.GetMapInfoRequest,
                com.jjrobot.andy4.navpb.MapPB.GetMapInfoResponse>(
                  this, METHODID_GET_MAP_INFO)))
          .addMethod(
            getMapPositionStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jjrobot.andy4.navpb.MapPB.MapPositionStreamRequest,
                com.jjrobot.andy4.navpb.MapPB.MapPositionStreamResponse>(
                  this, METHODID_MAP_POSITION_STREAM)))
          .addMethod(
            getLocationResetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.navpb.MapPB.LocationResetRequest,
                com.jjrobot.andy4.navpb.MapPB.LocationResetResponse>(
                  this, METHODID_LOCATION_RESET)))
          .build();
    }
  }

  /**
   * <pre>
   * navService.Map 导航地图
   * 仅无线导航版本支持
   * </pre>
   */
  public static final class MapStub extends io.grpc.stub.AbstractAsyncStub<MapStub> {
    private MapStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MapStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetMapInfo 获取地图信息
     * </pre>
     */
    public void getMapInfo(com.jjrobot.andy4.navpb.MapPB.GetMapInfoRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.MapPB.GetMapInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMapInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MapPositionStream 监听设备的地图定位信息
     * </pre>
     */
    public void mapPositionStream(com.jjrobot.andy4.navpb.MapPB.MapPositionStreamRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.MapPB.MapPositionStreamResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getMapPositionStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LocationReset 重置当前定位
     * 某些情况下此方法返回成功时可能出现实际位置与地图位置不相符，
     * 在有明确参照物附近调用此方法可提高准确定位成功率。
     * 用于发生定位异常/错误状态，重新初始化导航定位
     * 重定位错误：定位状态超时|无地图|UWB错误
     * 重定位超时判断: 默认10s，仅在非错误状态下重置
     * </pre>
     */
    public void locationReset(com.jjrobot.andy4.navpb.MapPB.LocationResetRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.MapPB.LocationResetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLocationResetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * navService.Map 导航地图
   * 仅无线导航版本支持
   * </pre>
   */
  public static final class MapBlockingStub extends io.grpc.stub.AbstractBlockingStub<MapBlockingStub> {
    private MapBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MapBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetMapInfo 获取地图信息
     * </pre>
     */
    public com.jjrobot.andy4.navpb.MapPB.GetMapInfoResponse getMapInfo(com.jjrobot.andy4.navpb.MapPB.GetMapInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMapInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MapPositionStream 监听设备的地图定位信息
     * </pre>
     */
    public java.util.Iterator<com.jjrobot.andy4.navpb.MapPB.MapPositionStreamResponse> mapPositionStream(
        com.jjrobot.andy4.navpb.MapPB.MapPositionStreamRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getMapPositionStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LocationReset 重置当前定位
     * 某些情况下此方法返回成功时可能出现实际位置与地图位置不相符，
     * 在有明确参照物附近调用此方法可提高准确定位成功率。
     * 用于发生定位异常/错误状态，重新初始化导航定位
     * 重定位错误：定位状态超时|无地图|UWB错误
     * 重定位超时判断: 默认10s，仅在非错误状态下重置
     * </pre>
     */
    public com.jjrobot.andy4.navpb.MapPB.LocationResetResponse locationReset(com.jjrobot.andy4.navpb.MapPB.LocationResetRequest request) {
      return blockingUnaryCall(
          getChannel(), getLocationResetMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * navService.Map 导航地图
   * 仅无线导航版本支持
   * </pre>
   */
  public static final class MapFutureStub extends io.grpc.stub.AbstractFutureStub<MapFutureStub> {
    private MapFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MapFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetMapInfo 获取地图信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.navpb.MapPB.GetMapInfoResponse> getMapInfo(
        com.jjrobot.andy4.navpb.MapPB.GetMapInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMapInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LocationReset 重置当前定位
     * 某些情况下此方法返回成功时可能出现实际位置与地图位置不相符，
     * 在有明确参照物附近调用此方法可提高准确定位成功率。
     * 用于发生定位异常/错误状态，重新初始化导航定位
     * 重定位错误：定位状态超时|无地图|UWB错误
     * 重定位超时判断: 默认10s，仅在非错误状态下重置
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.navpb.MapPB.LocationResetResponse> locationReset(
        com.jjrobot.andy4.navpb.MapPB.LocationResetRequest request) {
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
          serviceImpl.getMapInfo((com.jjrobot.andy4.navpb.MapPB.GetMapInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.MapPB.GetMapInfoResponse>) responseObserver);
          break;
        case METHODID_MAP_POSITION_STREAM:
          serviceImpl.mapPositionStream((com.jjrobot.andy4.navpb.MapPB.MapPositionStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.MapPB.MapPositionStreamResponse>) responseObserver);
          break;
        case METHODID_LOCATION_RESET:
          serviceImpl.locationReset((com.jjrobot.andy4.navpb.MapPB.LocationResetRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.MapPB.LocationResetResponse>) responseObserver);
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
      return com.jjrobot.andy4.navpb.MapPB.getDescriptor();
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
