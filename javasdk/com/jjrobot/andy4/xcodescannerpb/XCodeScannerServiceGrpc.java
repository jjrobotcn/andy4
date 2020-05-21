package com.jjrobot.andy4.xcodescannerpb;

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
 * xcScannerService.XCodeScannerService 扫码设备
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.1-SNAPSHOT)",
    comments = "Source: xcodescanner.proto")
public final class XCodeScannerServiceGrpc {

  private XCodeScannerServiceGrpc() {}

  public static final String SERVICE_NAME = "xcScannerService.XCodeScannerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.xcodescannerpb.XCodeScannerServicePB.GetScanDataRequest,
      com.jjrobot.andy4.xcodescannerpb.XCodeScannerServicePB.GetScanDataResponse> getGetScanDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetScanData",
      requestType = com.jjrobot.andy4.xcodescannerpb.XCodeScannerServicePB.GetScanDataRequest.class,
      responseType = com.jjrobot.andy4.xcodescannerpb.XCodeScannerServicePB.GetScanDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.xcodescannerpb.XCodeScannerServicePB.GetScanDataRequest,
      com.jjrobot.andy4.xcodescannerpb.XCodeScannerServicePB.GetScanDataResponse> getGetScanDataMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.xcodescannerpb.XCodeScannerServicePB.GetScanDataRequest, com.jjrobot.andy4.xcodescannerpb.XCodeScannerServicePB.GetScanDataResponse> getGetScanDataMethod;
    if ((getGetScanDataMethod = XCodeScannerServiceGrpc.getGetScanDataMethod) == null) {
      synchronized (XCodeScannerServiceGrpc.class) {
        if ((getGetScanDataMethod = XCodeScannerServiceGrpc.getGetScanDataMethod) == null) {
          XCodeScannerServiceGrpc.getGetScanDataMethod = getGetScanDataMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.xcodescannerpb.XCodeScannerServicePB.GetScanDataRequest, com.jjrobot.andy4.xcodescannerpb.XCodeScannerServicePB.GetScanDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetScanData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.xcodescannerpb.XCodeScannerServicePB.GetScanDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.xcodescannerpb.XCodeScannerServicePB.GetScanDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new XCodeScannerServiceMethodDescriptorSupplier("GetScanData"))
              .build();
        }
      }
    }
    return getGetScanDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static XCodeScannerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<XCodeScannerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<XCodeScannerServiceStub>() {
        @java.lang.Override
        public XCodeScannerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new XCodeScannerServiceStub(channel, callOptions);
        }
      };
    return XCodeScannerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static XCodeScannerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<XCodeScannerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<XCodeScannerServiceBlockingStub>() {
        @java.lang.Override
        public XCodeScannerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new XCodeScannerServiceBlockingStub(channel, callOptions);
        }
      };
    return XCodeScannerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static XCodeScannerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<XCodeScannerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<XCodeScannerServiceFutureStub>() {
        @java.lang.Override
        public XCodeScannerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new XCodeScannerServiceFutureStub(channel, callOptions);
        }
      };
    return XCodeScannerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * xcScannerService.XCodeScannerService 扫码设备
   * </pre>
   */
  public static abstract class XCodeScannerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetScanData 监听扫码设备数据
     * 支持读取常用的二维码，BarCode
     * 开发管理平台功能参考: http://10.10.10.2/xcode_scanner
     * </pre>
     */
    public void getScanData(com.jjrobot.andy4.xcodescannerpb.XCodeScannerServicePB.GetScanDataRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.xcodescannerpb.XCodeScannerServicePB.GetScanDataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetScanDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetScanDataMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jjrobot.andy4.xcodescannerpb.XCodeScannerServicePB.GetScanDataRequest,
                com.jjrobot.andy4.xcodescannerpb.XCodeScannerServicePB.GetScanDataResponse>(
                  this, METHODID_GET_SCAN_DATA)))
          .build();
    }
  }

  /**
   * <pre>
   * xcScannerService.XCodeScannerService 扫码设备
   * </pre>
   */
  public static final class XCodeScannerServiceStub extends io.grpc.stub.AbstractAsyncStub<XCodeScannerServiceStub> {
    private XCodeScannerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected XCodeScannerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new XCodeScannerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetScanData 监听扫码设备数据
     * 支持读取常用的二维码，BarCode
     * 开发管理平台功能参考: http://10.10.10.2/xcode_scanner
     * </pre>
     */
    public void getScanData(com.jjrobot.andy4.xcodescannerpb.XCodeScannerServicePB.GetScanDataRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.xcodescannerpb.XCodeScannerServicePB.GetScanDataResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetScanDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * xcScannerService.XCodeScannerService 扫码设备
   * </pre>
   */
  public static final class XCodeScannerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<XCodeScannerServiceBlockingStub> {
    private XCodeScannerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected XCodeScannerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new XCodeScannerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetScanData 监听扫码设备数据
     * 支持读取常用的二维码，BarCode
     * 开发管理平台功能参考: http://10.10.10.2/xcode_scanner
     * </pre>
     */
    public java.util.Iterator<com.jjrobot.andy4.xcodescannerpb.XCodeScannerServicePB.GetScanDataResponse> getScanData(
        com.jjrobot.andy4.xcodescannerpb.XCodeScannerServicePB.GetScanDataRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetScanDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * xcScannerService.XCodeScannerService 扫码设备
   * </pre>
   */
  public static final class XCodeScannerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<XCodeScannerServiceFutureStub> {
    private XCodeScannerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected XCodeScannerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new XCodeScannerServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_SCAN_DATA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final XCodeScannerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(XCodeScannerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SCAN_DATA:
          serviceImpl.getScanData((com.jjrobot.andy4.xcodescannerpb.XCodeScannerServicePB.GetScanDataRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.xcodescannerpb.XCodeScannerServicePB.GetScanDataResponse>) responseObserver);
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

  private static abstract class XCodeScannerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    XCodeScannerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jjrobot.andy4.xcodescannerpb.XCodeScannerServicePB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("XCodeScannerService");
    }
  }

  private static final class XCodeScannerServiceFileDescriptorSupplier
      extends XCodeScannerServiceBaseDescriptorSupplier {
    XCodeScannerServiceFileDescriptorSupplier() {}
  }

  private static final class XCodeScannerServiceMethodDescriptorSupplier
      extends XCodeScannerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    XCodeScannerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (XCodeScannerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new XCodeScannerServiceFileDescriptorSupplier())
              .addMethod(getGetScanDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
