package xcScannerService;

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
    comments = "Source: xcodescanner.proto")
public final class XCodeScannerServiceGrpc {

  private XCodeScannerServiceGrpc() {}

  public static final String SERVICE_NAME = "xcScannerService.XCodeScannerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<xcScannerService.Xcodescanner.GetScanDataRequest,
      xcScannerService.Xcodescanner.GetScanDataResponse> getGetScanDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetScanData",
      requestType = xcScannerService.Xcodescanner.GetScanDataRequest.class,
      responseType = xcScannerService.Xcodescanner.GetScanDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<xcScannerService.Xcodescanner.GetScanDataRequest,
      xcScannerService.Xcodescanner.GetScanDataResponse> getGetScanDataMethod() {
    io.grpc.MethodDescriptor<xcScannerService.Xcodescanner.GetScanDataRequest, xcScannerService.Xcodescanner.GetScanDataResponse> getGetScanDataMethod;
    if ((getGetScanDataMethod = XCodeScannerServiceGrpc.getGetScanDataMethod) == null) {
      synchronized (XCodeScannerServiceGrpc.class) {
        if ((getGetScanDataMethod = XCodeScannerServiceGrpc.getGetScanDataMethod) == null) {
          XCodeScannerServiceGrpc.getGetScanDataMethod = getGetScanDataMethod = 
              io.grpc.MethodDescriptor.<xcScannerService.Xcodescanner.GetScanDataRequest, xcScannerService.Xcodescanner.GetScanDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "xcScannerService.XCodeScannerService", "GetScanData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xcScannerService.Xcodescanner.GetScanDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  xcScannerService.Xcodescanner.GetScanDataResponse.getDefaultInstance()))
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
    return new XCodeScannerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static XCodeScannerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new XCodeScannerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static XCodeScannerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new XCodeScannerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class XCodeScannerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getScanData(xcScannerService.Xcodescanner.GetScanDataRequest request,
        io.grpc.stub.StreamObserver<xcScannerService.Xcodescanner.GetScanDataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetScanDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetScanDataMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                xcScannerService.Xcodescanner.GetScanDataRequest,
                xcScannerService.Xcodescanner.GetScanDataResponse>(
                  this, METHODID_GET_SCAN_DATA)))
          .build();
    }
  }

  /**
   */
  public static final class XCodeScannerServiceStub extends io.grpc.stub.AbstractStub<XCodeScannerServiceStub> {
    private XCodeScannerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private XCodeScannerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected XCodeScannerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new XCodeScannerServiceStub(channel, callOptions);
    }

    /**
     */
    public void getScanData(xcScannerService.Xcodescanner.GetScanDataRequest request,
        io.grpc.stub.StreamObserver<xcScannerService.Xcodescanner.GetScanDataResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetScanDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class XCodeScannerServiceBlockingStub extends io.grpc.stub.AbstractStub<XCodeScannerServiceBlockingStub> {
    private XCodeScannerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private XCodeScannerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected XCodeScannerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new XCodeScannerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<xcScannerService.Xcodescanner.GetScanDataResponse> getScanData(
        xcScannerService.Xcodescanner.GetScanDataRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetScanDataMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class XCodeScannerServiceFutureStub extends io.grpc.stub.AbstractStub<XCodeScannerServiceFutureStub> {
    private XCodeScannerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private XCodeScannerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected XCodeScannerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
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
          serviceImpl.getScanData((xcScannerService.Xcodescanner.GetScanDataRequest) request,
              (io.grpc.stub.StreamObserver<xcScannerService.Xcodescanner.GetScanDataResponse>) responseObserver);
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
      return xcScannerService.Xcodescanner.getDescriptor();
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
