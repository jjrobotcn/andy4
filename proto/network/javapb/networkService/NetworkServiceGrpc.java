package networkService;

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
    comments = "Source: network.proto")
public final class NetworkServiceGrpc {

  private NetworkServiceGrpc() {}

  public static final String SERVICE_NAME = "networkService.NetworkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<networkService.Network.ListNetworksRequest,
      networkService.Network.ListNetworksResponse> getListNetworksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNetworks",
      requestType = networkService.Network.ListNetworksRequest.class,
      responseType = networkService.Network.ListNetworksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<networkService.Network.ListNetworksRequest,
      networkService.Network.ListNetworksResponse> getListNetworksMethod() {
    io.grpc.MethodDescriptor<networkService.Network.ListNetworksRequest, networkService.Network.ListNetworksResponse> getListNetworksMethod;
    if ((getListNetworksMethod = NetworkServiceGrpc.getListNetworksMethod) == null) {
      synchronized (NetworkServiceGrpc.class) {
        if ((getListNetworksMethod = NetworkServiceGrpc.getListNetworksMethod) == null) {
          NetworkServiceGrpc.getListNetworksMethod = getListNetworksMethod = 
              io.grpc.MethodDescriptor.<networkService.Network.ListNetworksRequest, networkService.Network.ListNetworksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "networkService.NetworkService", "ListNetworks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  networkService.Network.ListNetworksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  networkService.Network.ListNetworksResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkServiceMethodDescriptorSupplier("ListNetworks"))
                  .build();
          }
        }
     }
     return getListNetworksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<networkService.Network.ConnectRequest,
      networkService.Network.ConnectResponse> getConnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Connect",
      requestType = networkService.Network.ConnectRequest.class,
      responseType = networkService.Network.ConnectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<networkService.Network.ConnectRequest,
      networkService.Network.ConnectResponse> getConnectMethod() {
    io.grpc.MethodDescriptor<networkService.Network.ConnectRequest, networkService.Network.ConnectResponse> getConnectMethod;
    if ((getConnectMethod = NetworkServiceGrpc.getConnectMethod) == null) {
      synchronized (NetworkServiceGrpc.class) {
        if ((getConnectMethod = NetworkServiceGrpc.getConnectMethod) == null) {
          NetworkServiceGrpc.getConnectMethod = getConnectMethod = 
              io.grpc.MethodDescriptor.<networkService.Network.ConnectRequest, networkService.Network.ConnectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "networkService.NetworkService", "Connect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  networkService.Network.ConnectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  networkService.Network.ConnectResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkServiceMethodDescriptorSupplier("Connect"))
                  .build();
          }
        }
     }
     return getConnectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<networkService.Network.GetStatusRequest,
      networkService.Network.GetStatusResponse> getGetStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStatus",
      requestType = networkService.Network.GetStatusRequest.class,
      responseType = networkService.Network.GetStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<networkService.Network.GetStatusRequest,
      networkService.Network.GetStatusResponse> getGetStatusMethod() {
    io.grpc.MethodDescriptor<networkService.Network.GetStatusRequest, networkService.Network.GetStatusResponse> getGetStatusMethod;
    if ((getGetStatusMethod = NetworkServiceGrpc.getGetStatusMethod) == null) {
      synchronized (NetworkServiceGrpc.class) {
        if ((getGetStatusMethod = NetworkServiceGrpc.getGetStatusMethod) == null) {
          NetworkServiceGrpc.getGetStatusMethod = getGetStatusMethod = 
              io.grpc.MethodDescriptor.<networkService.Network.GetStatusRequest, networkService.Network.GetStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "networkService.NetworkService", "GetStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  networkService.Network.GetStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  networkService.Network.GetStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkServiceMethodDescriptorSupplier("GetStatus"))
                  .build();
          }
        }
     }
     return getGetStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<networkService.Network.GetNetworkDeviceInfoRequest,
      networkService.Network.GetNetworkDeviceInfoResponse> getGetNetworkDeviceInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNetworkDeviceInfo",
      requestType = networkService.Network.GetNetworkDeviceInfoRequest.class,
      responseType = networkService.Network.GetNetworkDeviceInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<networkService.Network.GetNetworkDeviceInfoRequest,
      networkService.Network.GetNetworkDeviceInfoResponse> getGetNetworkDeviceInfoMethod() {
    io.grpc.MethodDescriptor<networkService.Network.GetNetworkDeviceInfoRequest, networkService.Network.GetNetworkDeviceInfoResponse> getGetNetworkDeviceInfoMethod;
    if ((getGetNetworkDeviceInfoMethod = NetworkServiceGrpc.getGetNetworkDeviceInfoMethod) == null) {
      synchronized (NetworkServiceGrpc.class) {
        if ((getGetNetworkDeviceInfoMethod = NetworkServiceGrpc.getGetNetworkDeviceInfoMethod) == null) {
          NetworkServiceGrpc.getGetNetworkDeviceInfoMethod = getGetNetworkDeviceInfoMethod = 
              io.grpc.MethodDescriptor.<networkService.Network.GetNetworkDeviceInfoRequest, networkService.Network.GetNetworkDeviceInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "networkService.NetworkService", "GetNetworkDeviceInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  networkService.Network.GetNetworkDeviceInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  networkService.Network.GetNetworkDeviceInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkServiceMethodDescriptorSupplier("GetNetworkDeviceInfo"))
                  .build();
          }
        }
     }
     return getGetNetworkDeviceInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<networkService.Network.UpdateNetworkDeviceInfoRequest,
      networkService.Network.UpdateNetworkDeviceInfoResponse> getUpdateNetworkDeviceInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNetworkDeviceInfo",
      requestType = networkService.Network.UpdateNetworkDeviceInfoRequest.class,
      responseType = networkService.Network.UpdateNetworkDeviceInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<networkService.Network.UpdateNetworkDeviceInfoRequest,
      networkService.Network.UpdateNetworkDeviceInfoResponse> getUpdateNetworkDeviceInfoMethod() {
    io.grpc.MethodDescriptor<networkService.Network.UpdateNetworkDeviceInfoRequest, networkService.Network.UpdateNetworkDeviceInfoResponse> getUpdateNetworkDeviceInfoMethod;
    if ((getUpdateNetworkDeviceInfoMethod = NetworkServiceGrpc.getUpdateNetworkDeviceInfoMethod) == null) {
      synchronized (NetworkServiceGrpc.class) {
        if ((getUpdateNetworkDeviceInfoMethod = NetworkServiceGrpc.getUpdateNetworkDeviceInfoMethod) == null) {
          NetworkServiceGrpc.getUpdateNetworkDeviceInfoMethod = getUpdateNetworkDeviceInfoMethod = 
              io.grpc.MethodDescriptor.<networkService.Network.UpdateNetworkDeviceInfoRequest, networkService.Network.UpdateNetworkDeviceInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "networkService.NetworkService", "UpdateNetworkDeviceInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  networkService.Network.UpdateNetworkDeviceInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  networkService.Network.UpdateNetworkDeviceInfoResponse.getDefaultInstance()))
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
    return new NetworkServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NetworkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NetworkServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NetworkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NetworkServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class NetworkServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 获取网络扫描结果流
     * 扫描结果每30秒自动更新, 首次获取将返回记录中最新记录
     * </pre>
     */
    public void listNetworks(networkService.Network.ListNetworksRequest request,
        io.grpc.stub.StreamObserver<networkService.Network.ListNetworksResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListNetworksMethod(), responseObserver);
    }

    /**
     * <pre>
     * 连接至指定网络
     * 连接失败将立即返回错误
     * 若30秒后成功获取状态将返回超时失败
     * </pre>
     */
    public void connect(networkService.Network.ConnectRequest request,
        io.grpc.stub.StreamObserver<networkService.Network.ConnectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConnectMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取连接状态流
     * 在连接开始时立即返回当前最新的扫描数据
     * 并持续在网络数据更新时接收新数据
     * </pre>
     */
    public void getStatus(networkService.Network.GetStatusRequest request,
        io.grpc.stub.StreamObserver<networkService.Network.GetStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取网络设备相关信息
     * v1.1.0
     * </pre>
     */
    public void getNetworkDeviceInfo(networkService.Network.GetNetworkDeviceInfoRequest request,
        io.grpc.stub.StreamObserver<networkService.Network.GetNetworkDeviceInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNetworkDeviceInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * 修改网络设备相关信息
     * v1.1.0
     * </pre>
     */
    public void updateNetworkDeviceInfo(networkService.Network.UpdateNetworkDeviceInfoRequest request,
        io.grpc.stub.StreamObserver<networkService.Network.UpdateNetworkDeviceInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateNetworkDeviceInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListNetworksMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                networkService.Network.ListNetworksRequest,
                networkService.Network.ListNetworksResponse>(
                  this, METHODID_LIST_NETWORKS)))
          .addMethod(
            getConnectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                networkService.Network.ConnectRequest,
                networkService.Network.ConnectResponse>(
                  this, METHODID_CONNECT)))
          .addMethod(
            getGetStatusMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                networkService.Network.GetStatusRequest,
                networkService.Network.GetStatusResponse>(
                  this, METHODID_GET_STATUS)))
          .addMethod(
            getGetNetworkDeviceInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                networkService.Network.GetNetworkDeviceInfoRequest,
                networkService.Network.GetNetworkDeviceInfoResponse>(
                  this, METHODID_GET_NETWORK_DEVICE_INFO)))
          .addMethod(
            getUpdateNetworkDeviceInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                networkService.Network.UpdateNetworkDeviceInfoRequest,
                networkService.Network.UpdateNetworkDeviceInfoResponse>(
                  this, METHODID_UPDATE_NETWORK_DEVICE_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class NetworkServiceStub extends io.grpc.stub.AbstractStub<NetworkServiceStub> {
    private NetworkServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取网络扫描结果流
     * 扫描结果每30秒自动更新, 首次获取将返回记录中最新记录
     * </pre>
     */
    public void listNetworks(networkService.Network.ListNetworksRequest request,
        io.grpc.stub.StreamObserver<networkService.Network.ListNetworksResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListNetworksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 连接至指定网络
     * 连接失败将立即返回错误
     * 若30秒后成功获取状态将返回超时失败
     * </pre>
     */
    public void connect(networkService.Network.ConnectRequest request,
        io.grpc.stub.StreamObserver<networkService.Network.ConnectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConnectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取连接状态流
     * 在连接开始时立即返回当前最新的扫描数据
     * 并持续在网络数据更新时接收新数据
     * </pre>
     */
    public void getStatus(networkService.Network.GetStatusRequest request,
        io.grpc.stub.StreamObserver<networkService.Network.GetStatusResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取网络设备相关信息
     * v1.1.0
     * </pre>
     */
    public void getNetworkDeviceInfo(networkService.Network.GetNetworkDeviceInfoRequest request,
        io.grpc.stub.StreamObserver<networkService.Network.GetNetworkDeviceInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNetworkDeviceInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 修改网络设备相关信息
     * v1.1.0
     * </pre>
     */
    public void updateNetworkDeviceInfo(networkService.Network.UpdateNetworkDeviceInfoRequest request,
        io.grpc.stub.StreamObserver<networkService.Network.UpdateNetworkDeviceInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateNetworkDeviceInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NetworkServiceBlockingStub extends io.grpc.stub.AbstractStub<NetworkServiceBlockingStub> {
    private NetworkServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取网络扫描结果流
     * 扫描结果每30秒自动更新, 首次获取将返回记录中最新记录
     * </pre>
     */
    public java.util.Iterator<networkService.Network.ListNetworksResponse> listNetworks(
        networkService.Network.ListNetworksRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListNetworksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 连接至指定网络
     * 连接失败将立即返回错误
     * 若30秒后成功获取状态将返回超时失败
     * </pre>
     */
    public networkService.Network.ConnectResponse connect(networkService.Network.ConnectRequest request) {
      return blockingUnaryCall(
          getChannel(), getConnectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取连接状态流
     * 在连接开始时立即返回当前最新的扫描数据
     * 并持续在网络数据更新时接收新数据
     * </pre>
     */
    public java.util.Iterator<networkService.Network.GetStatusResponse> getStatus(
        networkService.Network.GetStatusRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取网络设备相关信息
     * v1.1.0
     * </pre>
     */
    public networkService.Network.GetNetworkDeviceInfoResponse getNetworkDeviceInfo(networkService.Network.GetNetworkDeviceInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNetworkDeviceInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 修改网络设备相关信息
     * v1.1.0
     * </pre>
     */
    public networkService.Network.UpdateNetworkDeviceInfoResponse updateNetworkDeviceInfo(networkService.Network.UpdateNetworkDeviceInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateNetworkDeviceInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NetworkServiceFutureStub extends io.grpc.stub.AbstractStub<NetworkServiceFutureStub> {
    private NetworkServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 连接至指定网络
     * 连接失败将立即返回错误
     * 若30秒后成功获取状态将返回超时失败
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<networkService.Network.ConnectResponse> connect(
        networkService.Network.ConnectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConnectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取网络设备相关信息
     * v1.1.0
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<networkService.Network.GetNetworkDeviceInfoResponse> getNetworkDeviceInfo(
        networkService.Network.GetNetworkDeviceInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNetworkDeviceInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 修改网络设备相关信息
     * v1.1.0
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<networkService.Network.UpdateNetworkDeviceInfoResponse> updateNetworkDeviceInfo(
        networkService.Network.UpdateNetworkDeviceInfoRequest request) {
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
          serviceImpl.listNetworks((networkService.Network.ListNetworksRequest) request,
              (io.grpc.stub.StreamObserver<networkService.Network.ListNetworksResponse>) responseObserver);
          break;
        case METHODID_CONNECT:
          serviceImpl.connect((networkService.Network.ConnectRequest) request,
              (io.grpc.stub.StreamObserver<networkService.Network.ConnectResponse>) responseObserver);
          break;
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((networkService.Network.GetStatusRequest) request,
              (io.grpc.stub.StreamObserver<networkService.Network.GetStatusResponse>) responseObserver);
          break;
        case METHODID_GET_NETWORK_DEVICE_INFO:
          serviceImpl.getNetworkDeviceInfo((networkService.Network.GetNetworkDeviceInfoRequest) request,
              (io.grpc.stub.StreamObserver<networkService.Network.GetNetworkDeviceInfoResponse>) responseObserver);
          break;
        case METHODID_UPDATE_NETWORK_DEVICE_INFO:
          serviceImpl.updateNetworkDeviceInfo((networkService.Network.UpdateNetworkDeviceInfoRequest) request,
              (io.grpc.stub.StreamObserver<networkService.Network.UpdateNetworkDeviceInfoResponse>) responseObserver);
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
      return networkService.Network.getDescriptor();
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
