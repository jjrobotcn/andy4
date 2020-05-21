package com.jjrobot.andy4.networkpb;

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
 * networkService.NetworkService 网络管理
 * 管理内部路由设备
 * 开发管理平台功能参考: http://10.10.10.2/network
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.1-SNAPSHOT)",
    comments = "Source: network.proto")
public final class NetworkServiceGrpc {

  private NetworkServiceGrpc() {}

  public static final String SERVICE_NAME = "networkService.NetworkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.networkpb.NetworkServicePB.ListNetworksRequest,
      com.jjrobot.andy4.networkpb.NetworkServicePB.ListNetworksResponse> getListNetworksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNetworks",
      requestType = com.jjrobot.andy4.networkpb.NetworkServicePB.ListNetworksRequest.class,
      responseType = com.jjrobot.andy4.networkpb.NetworkServicePB.ListNetworksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.networkpb.NetworkServicePB.ListNetworksRequest,
      com.jjrobot.andy4.networkpb.NetworkServicePB.ListNetworksResponse> getListNetworksMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.networkpb.NetworkServicePB.ListNetworksRequest, com.jjrobot.andy4.networkpb.NetworkServicePB.ListNetworksResponse> getListNetworksMethod;
    if ((getListNetworksMethod = NetworkServiceGrpc.getListNetworksMethod) == null) {
      synchronized (NetworkServiceGrpc.class) {
        if ((getListNetworksMethod = NetworkServiceGrpc.getListNetworksMethod) == null) {
          NetworkServiceGrpc.getListNetworksMethod = getListNetworksMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.networkpb.NetworkServicePB.ListNetworksRequest, com.jjrobot.andy4.networkpb.NetworkServicePB.ListNetworksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNetworks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.networkpb.NetworkServicePB.ListNetworksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.networkpb.NetworkServicePB.ListNetworksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkServiceMethodDescriptorSupplier("ListNetworks"))
              .build();
        }
      }
    }
    return getListNetworksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.networkpb.NetworkServicePB.ConnectRequest,
      com.jjrobot.andy4.networkpb.NetworkServicePB.ConnectResponse> getConnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Connect",
      requestType = com.jjrobot.andy4.networkpb.NetworkServicePB.ConnectRequest.class,
      responseType = com.jjrobot.andy4.networkpb.NetworkServicePB.ConnectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.networkpb.NetworkServicePB.ConnectRequest,
      com.jjrobot.andy4.networkpb.NetworkServicePB.ConnectResponse> getConnectMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.networkpb.NetworkServicePB.ConnectRequest, com.jjrobot.andy4.networkpb.NetworkServicePB.ConnectResponse> getConnectMethod;
    if ((getConnectMethod = NetworkServiceGrpc.getConnectMethod) == null) {
      synchronized (NetworkServiceGrpc.class) {
        if ((getConnectMethod = NetworkServiceGrpc.getConnectMethod) == null) {
          NetworkServiceGrpc.getConnectMethod = getConnectMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.networkpb.NetworkServicePB.ConnectRequest, com.jjrobot.andy4.networkpb.NetworkServicePB.ConnectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Connect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.networkpb.NetworkServicePB.ConnectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.networkpb.NetworkServicePB.ConnectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkServiceMethodDescriptorSupplier("Connect"))
              .build();
        }
      }
    }
    return getConnectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.networkpb.NetworkServicePB.GetStatusRequest,
      com.jjrobot.andy4.networkpb.NetworkServicePB.GetStatusResponse> getGetStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStatus",
      requestType = com.jjrobot.andy4.networkpb.NetworkServicePB.GetStatusRequest.class,
      responseType = com.jjrobot.andy4.networkpb.NetworkServicePB.GetStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.networkpb.NetworkServicePB.GetStatusRequest,
      com.jjrobot.andy4.networkpb.NetworkServicePB.GetStatusResponse> getGetStatusMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.networkpb.NetworkServicePB.GetStatusRequest, com.jjrobot.andy4.networkpb.NetworkServicePB.GetStatusResponse> getGetStatusMethod;
    if ((getGetStatusMethod = NetworkServiceGrpc.getGetStatusMethod) == null) {
      synchronized (NetworkServiceGrpc.class) {
        if ((getGetStatusMethod = NetworkServiceGrpc.getGetStatusMethod) == null) {
          NetworkServiceGrpc.getGetStatusMethod = getGetStatusMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.networkpb.NetworkServicePB.GetStatusRequest, com.jjrobot.andy4.networkpb.NetworkServicePB.GetStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.networkpb.NetworkServicePB.GetStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.networkpb.NetworkServicePB.GetStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkServiceMethodDescriptorSupplier("GetStatus"))
              .build();
        }
      }
    }
    return getGetStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.networkpb.NetworkServicePB.GetNetworkDeviceInfoRequest,
      com.jjrobot.andy4.networkpb.NetworkServicePB.GetNetworkDeviceInfoResponse> getGetNetworkDeviceInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNetworkDeviceInfo",
      requestType = com.jjrobot.andy4.networkpb.NetworkServicePB.GetNetworkDeviceInfoRequest.class,
      responseType = com.jjrobot.andy4.networkpb.NetworkServicePB.GetNetworkDeviceInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.networkpb.NetworkServicePB.GetNetworkDeviceInfoRequest,
      com.jjrobot.andy4.networkpb.NetworkServicePB.GetNetworkDeviceInfoResponse> getGetNetworkDeviceInfoMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.networkpb.NetworkServicePB.GetNetworkDeviceInfoRequest, com.jjrobot.andy4.networkpb.NetworkServicePB.GetNetworkDeviceInfoResponse> getGetNetworkDeviceInfoMethod;
    if ((getGetNetworkDeviceInfoMethod = NetworkServiceGrpc.getGetNetworkDeviceInfoMethod) == null) {
      synchronized (NetworkServiceGrpc.class) {
        if ((getGetNetworkDeviceInfoMethod = NetworkServiceGrpc.getGetNetworkDeviceInfoMethod) == null) {
          NetworkServiceGrpc.getGetNetworkDeviceInfoMethod = getGetNetworkDeviceInfoMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.networkpb.NetworkServicePB.GetNetworkDeviceInfoRequest, com.jjrobot.andy4.networkpb.NetworkServicePB.GetNetworkDeviceInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNetworkDeviceInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.networkpb.NetworkServicePB.GetNetworkDeviceInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.networkpb.NetworkServicePB.GetNetworkDeviceInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkServiceMethodDescriptorSupplier("GetNetworkDeviceInfo"))
              .build();
        }
      }
    }
    return getGetNetworkDeviceInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.networkpb.NetworkServicePB.UpdateNetworkDeviceInfoRequest,
      com.jjrobot.andy4.networkpb.NetworkServicePB.UpdateNetworkDeviceInfoResponse> getUpdateNetworkDeviceInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNetworkDeviceInfo",
      requestType = com.jjrobot.andy4.networkpb.NetworkServicePB.UpdateNetworkDeviceInfoRequest.class,
      responseType = com.jjrobot.andy4.networkpb.NetworkServicePB.UpdateNetworkDeviceInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.networkpb.NetworkServicePB.UpdateNetworkDeviceInfoRequest,
      com.jjrobot.andy4.networkpb.NetworkServicePB.UpdateNetworkDeviceInfoResponse> getUpdateNetworkDeviceInfoMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.networkpb.NetworkServicePB.UpdateNetworkDeviceInfoRequest, com.jjrobot.andy4.networkpb.NetworkServicePB.UpdateNetworkDeviceInfoResponse> getUpdateNetworkDeviceInfoMethod;
    if ((getUpdateNetworkDeviceInfoMethod = NetworkServiceGrpc.getUpdateNetworkDeviceInfoMethod) == null) {
      synchronized (NetworkServiceGrpc.class) {
        if ((getUpdateNetworkDeviceInfoMethod = NetworkServiceGrpc.getUpdateNetworkDeviceInfoMethod) == null) {
          NetworkServiceGrpc.getUpdateNetworkDeviceInfoMethod = getUpdateNetworkDeviceInfoMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.networkpb.NetworkServicePB.UpdateNetworkDeviceInfoRequest, com.jjrobot.andy4.networkpb.NetworkServicePB.UpdateNetworkDeviceInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNetworkDeviceInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.networkpb.NetworkServicePB.UpdateNetworkDeviceInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.networkpb.NetworkServicePB.UpdateNetworkDeviceInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkServiceMethodDescriptorSupplier("UpdateNetworkDeviceInfo"))
              .build();
        }
      }
    }
    return getUpdateNetworkDeviceInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NetworkServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetworkServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetworkServiceStub>() {
        @java.lang.Override
        public NetworkServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetworkServiceStub(channel, callOptions);
        }
      };
    return NetworkServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NetworkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetworkServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetworkServiceBlockingStub>() {
        @java.lang.Override
        public NetworkServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetworkServiceBlockingStub(channel, callOptions);
        }
      };
    return NetworkServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NetworkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetworkServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetworkServiceFutureStub>() {
        @java.lang.Override
        public NetworkServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetworkServiceFutureStub(channel, callOptions);
        }
      };
    return NetworkServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * networkService.NetworkService 网络管理
   * 管理内部路由设备
   * 开发管理平台功能参考: http://10.10.10.2/network
   * </pre>
   */
  public static abstract class NetworkServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * ListNetworks 扫描附近无线信息
     * 此方法在同一扫描时刻中为单例
     * 360路由设备：
     *    由于持续扫描可能造成内部网络的断流，因此该类型路由不会进行后续的自动持续扫描，
     *    但持续监听支持后续新请求结果的同步返回
     * </pre>
     */
    public void listNetworks(com.jjrobot.andy4.networkpb.NetworkServicePB.ListNetworksRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.networkpb.NetworkServicePB.ListNetworksResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListNetworksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Connect 路由设备连接无线网络
     * 连接失败将立即返回错误
     * 若30秒后成功获取状态将返回超时失败
     * </pre>
     */
    public void connect(com.jjrobot.andy4.networkpb.NetworkServicePB.ConnectRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.networkpb.NetworkServicePB.ConnectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConnectMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetStatus 获取路由连接状态
     * </pre>
     */
    public void getStatus(com.jjrobot.andy4.networkpb.NetworkServicePB.GetStatusRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.networkpb.NetworkServicePB.GetStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetNetworkDeviceInfo 获取路由设备相关信息
     * </pre>
     */
    public void getNetworkDeviceInfo(com.jjrobot.andy4.networkpb.NetworkServicePB.GetNetworkDeviceInfoRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.networkpb.NetworkServicePB.GetNetworkDeviceInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNetworkDeviceInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateNetworkDeviceInfo 修改网络设备相关信息
     * </pre>
     */
    public void updateNetworkDeviceInfo(com.jjrobot.andy4.networkpb.NetworkServicePB.UpdateNetworkDeviceInfoRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.networkpb.NetworkServicePB.UpdateNetworkDeviceInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateNetworkDeviceInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListNetworksMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jjrobot.andy4.networkpb.NetworkServicePB.ListNetworksRequest,
                com.jjrobot.andy4.networkpb.NetworkServicePB.ListNetworksResponse>(
                  this, METHODID_LIST_NETWORKS)))
          .addMethod(
            getConnectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.networkpb.NetworkServicePB.ConnectRequest,
                com.jjrobot.andy4.networkpb.NetworkServicePB.ConnectResponse>(
                  this, METHODID_CONNECT)))
          .addMethod(
            getGetStatusMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jjrobot.andy4.networkpb.NetworkServicePB.GetStatusRequest,
                com.jjrobot.andy4.networkpb.NetworkServicePB.GetStatusResponse>(
                  this, METHODID_GET_STATUS)))
          .addMethod(
            getGetNetworkDeviceInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.networkpb.NetworkServicePB.GetNetworkDeviceInfoRequest,
                com.jjrobot.andy4.networkpb.NetworkServicePB.GetNetworkDeviceInfoResponse>(
                  this, METHODID_GET_NETWORK_DEVICE_INFO)))
          .addMethod(
            getUpdateNetworkDeviceInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.networkpb.NetworkServicePB.UpdateNetworkDeviceInfoRequest,
                com.jjrobot.andy4.networkpb.NetworkServicePB.UpdateNetworkDeviceInfoResponse>(
                  this, METHODID_UPDATE_NETWORK_DEVICE_INFO)))
          .build();
    }
  }

  /**
   * <pre>
   * networkService.NetworkService 网络管理
   * 管理内部路由设备
   * 开发管理平台功能参考: http://10.10.10.2/network
   * </pre>
   */
  public static final class NetworkServiceStub extends io.grpc.stub.AbstractAsyncStub<NetworkServiceStub> {
    private NetworkServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetworkServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListNetworks 扫描附近无线信息
     * 此方法在同一扫描时刻中为单例
     * 360路由设备：
     *    由于持续扫描可能造成内部网络的断流，因此该类型路由不会进行后续的自动持续扫描，
     *    但持续监听支持后续新请求结果的同步返回
     * </pre>
     */
    public void listNetworks(com.jjrobot.andy4.networkpb.NetworkServicePB.ListNetworksRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.networkpb.NetworkServicePB.ListNetworksResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListNetworksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Connect 路由设备连接无线网络
     * 连接失败将立即返回错误
     * 若30秒后成功获取状态将返回超时失败
     * </pre>
     */
    public void connect(com.jjrobot.andy4.networkpb.NetworkServicePB.ConnectRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.networkpb.NetworkServicePB.ConnectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConnectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetStatus 获取路由连接状态
     * </pre>
     */
    public void getStatus(com.jjrobot.andy4.networkpb.NetworkServicePB.GetStatusRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.networkpb.NetworkServicePB.GetStatusResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetNetworkDeviceInfo 获取路由设备相关信息
     * </pre>
     */
    public void getNetworkDeviceInfo(com.jjrobot.andy4.networkpb.NetworkServicePB.GetNetworkDeviceInfoRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.networkpb.NetworkServicePB.GetNetworkDeviceInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNetworkDeviceInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateNetworkDeviceInfo 修改网络设备相关信息
     * </pre>
     */
    public void updateNetworkDeviceInfo(com.jjrobot.andy4.networkpb.NetworkServicePB.UpdateNetworkDeviceInfoRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.networkpb.NetworkServicePB.UpdateNetworkDeviceInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateNetworkDeviceInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * networkService.NetworkService 网络管理
   * 管理内部路由设备
   * 开发管理平台功能参考: http://10.10.10.2/network
   * </pre>
   */
  public static final class NetworkServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<NetworkServiceBlockingStub> {
    private NetworkServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetworkServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListNetworks 扫描附近无线信息
     * 此方法在同一扫描时刻中为单例
     * 360路由设备：
     *    由于持续扫描可能造成内部网络的断流，因此该类型路由不会进行后续的自动持续扫描，
     *    但持续监听支持后续新请求结果的同步返回
     * </pre>
     */
    public java.util.Iterator<com.jjrobot.andy4.networkpb.NetworkServicePB.ListNetworksResponse> listNetworks(
        com.jjrobot.andy4.networkpb.NetworkServicePB.ListNetworksRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListNetworksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Connect 路由设备连接无线网络
     * 连接失败将立即返回错误
     * 若30秒后成功获取状态将返回超时失败
     * </pre>
     */
    public com.jjrobot.andy4.networkpb.NetworkServicePB.ConnectResponse connect(com.jjrobot.andy4.networkpb.NetworkServicePB.ConnectRequest request) {
      return blockingUnaryCall(
          getChannel(), getConnectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetStatus 获取路由连接状态
     * </pre>
     */
    public java.util.Iterator<com.jjrobot.andy4.networkpb.NetworkServicePB.GetStatusResponse> getStatus(
        com.jjrobot.andy4.networkpb.NetworkServicePB.GetStatusRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetNetworkDeviceInfo 获取路由设备相关信息
     * </pre>
     */
    public com.jjrobot.andy4.networkpb.NetworkServicePB.GetNetworkDeviceInfoResponse getNetworkDeviceInfo(com.jjrobot.andy4.networkpb.NetworkServicePB.GetNetworkDeviceInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNetworkDeviceInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateNetworkDeviceInfo 修改网络设备相关信息
     * </pre>
     */
    public com.jjrobot.andy4.networkpb.NetworkServicePB.UpdateNetworkDeviceInfoResponse updateNetworkDeviceInfo(com.jjrobot.andy4.networkpb.NetworkServicePB.UpdateNetworkDeviceInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateNetworkDeviceInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * networkService.NetworkService 网络管理
   * 管理内部路由设备
   * 开发管理平台功能参考: http://10.10.10.2/network
   * </pre>
   */
  public static final class NetworkServiceFutureStub extends io.grpc.stub.AbstractFutureStub<NetworkServiceFutureStub> {
    private NetworkServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetworkServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Connect 路由设备连接无线网络
     * 连接失败将立即返回错误
     * 若30秒后成功获取状态将返回超时失败
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.networkpb.NetworkServicePB.ConnectResponse> connect(
        com.jjrobot.andy4.networkpb.NetworkServicePB.ConnectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConnectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetNetworkDeviceInfo 获取路由设备相关信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.networkpb.NetworkServicePB.GetNetworkDeviceInfoResponse> getNetworkDeviceInfo(
        com.jjrobot.andy4.networkpb.NetworkServicePB.GetNetworkDeviceInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNetworkDeviceInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateNetworkDeviceInfo 修改网络设备相关信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.networkpb.NetworkServicePB.UpdateNetworkDeviceInfoResponse> updateNetworkDeviceInfo(
        com.jjrobot.andy4.networkpb.NetworkServicePB.UpdateNetworkDeviceInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateNetworkDeviceInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_NETWORKS = 0;
  private static final int METHODID_CONNECT = 1;
  private static final int METHODID_GET_STATUS = 2;
  private static final int METHODID_GET_NETWORK_DEVICE_INFO = 3;
  private static final int METHODID_UPDATE_NETWORK_DEVICE_INFO = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NetworkServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NetworkServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_NETWORKS:
          serviceImpl.listNetworks((com.jjrobot.andy4.networkpb.NetworkServicePB.ListNetworksRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.networkpb.NetworkServicePB.ListNetworksResponse>) responseObserver);
          break;
        case METHODID_CONNECT:
          serviceImpl.connect((com.jjrobot.andy4.networkpb.NetworkServicePB.ConnectRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.networkpb.NetworkServicePB.ConnectResponse>) responseObserver);
          break;
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((com.jjrobot.andy4.networkpb.NetworkServicePB.GetStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.networkpb.NetworkServicePB.GetStatusResponse>) responseObserver);
          break;
        case METHODID_GET_NETWORK_DEVICE_INFO:
          serviceImpl.getNetworkDeviceInfo((com.jjrobot.andy4.networkpb.NetworkServicePB.GetNetworkDeviceInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.networkpb.NetworkServicePB.GetNetworkDeviceInfoResponse>) responseObserver);
          break;
        case METHODID_UPDATE_NETWORK_DEVICE_INFO:
          serviceImpl.updateNetworkDeviceInfo((com.jjrobot.andy4.networkpb.NetworkServicePB.UpdateNetworkDeviceInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.networkpb.NetworkServicePB.UpdateNetworkDeviceInfoResponse>) responseObserver);
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

  private static abstract class NetworkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NetworkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jjrobot.andy4.networkpb.NetworkServicePB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NetworkService");
    }
  }

  private static final class NetworkServiceFileDescriptorSupplier
      extends NetworkServiceBaseDescriptorSupplier {
    NetworkServiceFileDescriptorSupplier() {}
  }

  private static final class NetworkServiceMethodDescriptorSupplier
      extends NetworkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NetworkServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NetworkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NetworkServiceFileDescriptorSupplier())
              .addMethod(getListNetworksMethod())
              .addMethod(getConnectMethod())
              .addMethod(getGetStatusMethod())
              .addMethod(getGetNetworkDeviceInfoMethod())
              .addMethod(getUpdateNetworkDeviceInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
