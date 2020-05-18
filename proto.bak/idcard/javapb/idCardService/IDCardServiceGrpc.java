package idCardService;

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
    comments = "Source: idcard.proto")
public final class IDCardServiceGrpc {

  private IDCardServiceGrpc() {}

  public static final String SERVICE_NAME = "idCardService.IDCardService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<idCardService.Idcard.GetIdInfoRequest,
      idCardService.Idcard.GetIdInfoResponse> getGetIdInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIdInfo",
      requestType = idCardService.Idcard.GetIdInfoRequest.class,
      responseType = idCardService.Idcard.GetIdInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<idCardService.Idcard.GetIdInfoRequest,
      idCardService.Idcard.GetIdInfoResponse> getGetIdInfoMethod() {
    io.grpc.MethodDescriptor<idCardService.Idcard.GetIdInfoRequest, idCardService.Idcard.GetIdInfoResponse> getGetIdInfoMethod;
    if ((getGetIdInfoMethod = IDCardServiceGrpc.getGetIdInfoMethod) == null) {
      synchronized (IDCardServiceGrpc.class) {
        if ((getGetIdInfoMethod = IDCardServiceGrpc.getGetIdInfoMethod) == null) {
          IDCardServiceGrpc.getGetIdInfoMethod = getGetIdInfoMethod = 
              io.grpc.MethodDescriptor.<idCardService.Idcard.GetIdInfoRequest, idCardService.Idcard.GetIdInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "idCardService.IDCardService", "GetIdInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  idCardService.Idcard.GetIdInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  idCardService.Idcard.GetIdInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new IDCardServiceMethodDescriptorSupplier("GetIdInfo"))
                  .build();
          }
        }
     }
     return getGetIdInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IDCardServiceStub newStub(io.grpc.Channel channel) {
    return new IDCardServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IDCardServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IDCardServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IDCardServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IDCardServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class IDCardServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 获取读卡数据流
     * </pre>
     */
    public void getIdInfo(idCardService.Idcard.GetIdInfoRequest request,
        io.grpc.stub.StreamObserver<idCardService.Idcard.GetIdInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetIdInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetIdInfoMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                idCardService.Idcard.GetIdInfoRequest,
                idCardService.Idcard.GetIdInfoResponse>(
                  this, METHODID_GET_ID_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class IDCardServiceStub extends io.grpc.stub.AbstractStub<IDCardServiceStub> {
    private IDCardServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IDCardServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IDCardServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IDCardServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取读卡数据流
     * </pre>
     */
    public void getIdInfo(idCardService.Idcard.GetIdInfoRequest request,
        io.grpc.stub.StreamObserver<idCardService.Idcard.GetIdInfoResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetIdInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IDCardServiceBlockingStub extends io.grpc.stub.AbstractStub<IDCardServiceBlockingStub> {
    private IDCardServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IDCardServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IDCardServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IDCardServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取读卡数据流
     * </pre>
     */
    public java.util.Iterator<idCardService.Idcard.GetIdInfoResponse> getIdInfo(
        idCardService.Idcard.GetIdInfoRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetIdInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IDCardServiceFutureStub extends io.grpc.stub.AbstractStub<IDCardServiceFutureStub> {
    private IDCardServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IDCardServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IDCardServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IDCardServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_ID_INFO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IDCardServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IDCardServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ID_INFO:
          serviceImpl.getIdInfo((idCardService.Idcard.GetIdInfoRequest) request,
              (io.grpc.stub.StreamObserver<idCardService.Idcard.GetIdInfoResponse>) responseObserver);
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

  private static abstract class IDCardServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IDCardServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return idCardService.Idcard.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IDCardService");
    }
  }

  private static final class IDCardServiceFileDescriptorSupplier
      extends IDCardServiceBaseDescriptorSupplier {
    IDCardServiceFileDescriptorSupplier() {}
  }

  private static final class IDCardServiceMethodDescriptorSupplier
      extends IDCardServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IDCardServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (IDCardServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IDCardServiceFileDescriptorSupplier())
              .addMethod(getGetIdInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
