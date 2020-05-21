package com.jjrobot.andy4.facepb;

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
 * faceRecognition.FaceService 人脸服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.1-SNAPSHOT)",
    comments = "Source: face.proto")
public final class FaceServiceGrpc {

  private FaceServiceGrpc() {}

  public static final String SERVICE_NAME = "faceRecognition.FaceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceServicePB.CompareRequest,
      com.jjrobot.andy4.facepb.FaceServicePB.CompareResponse> getCompareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Compare",
      requestType = com.jjrobot.andy4.facepb.FaceServicePB.CompareRequest.class,
      responseType = com.jjrobot.andy4.facepb.FaceServicePB.CompareResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceServicePB.CompareRequest,
      com.jjrobot.andy4.facepb.FaceServicePB.CompareResponse> getCompareMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceServicePB.CompareRequest, com.jjrobot.andy4.facepb.FaceServicePB.CompareResponse> getCompareMethod;
    if ((getCompareMethod = FaceServiceGrpc.getCompareMethod) == null) {
      synchronized (FaceServiceGrpc.class) {
        if ((getCompareMethod = FaceServiceGrpc.getCompareMethod) == null) {
          FaceServiceGrpc.getCompareMethod = getCompareMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.facepb.FaceServicePB.CompareRequest, com.jjrobot.andy4.facepb.FaceServicePB.CompareResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Compare"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceServicePB.CompareRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceServicePB.CompareResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FaceServiceMethodDescriptorSupplier("Compare"))
              .build();
        }
      }
    }
    return getCompareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceServicePB.SearchRequest,
      com.jjrobot.andy4.facepb.FaceServicePB.SearchResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = com.jjrobot.andy4.facepb.FaceServicePB.SearchRequest.class,
      responseType = com.jjrobot.andy4.facepb.FaceServicePB.SearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceServicePB.SearchRequest,
      com.jjrobot.andy4.facepb.FaceServicePB.SearchResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceServicePB.SearchRequest, com.jjrobot.andy4.facepb.FaceServicePB.SearchResponse> getSearchMethod;
    if ((getSearchMethod = FaceServiceGrpc.getSearchMethod) == null) {
      synchronized (FaceServiceGrpc.class) {
        if ((getSearchMethod = FaceServiceGrpc.getSearchMethod) == null) {
          FaceServiceGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.facepb.FaceServicePB.SearchRequest, com.jjrobot.andy4.facepb.FaceServicePB.SearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceServicePB.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceServicePB.SearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FaceServiceMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FaceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FaceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FaceServiceStub>() {
        @java.lang.Override
        public FaceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FaceServiceStub(channel, callOptions);
        }
      };
    return FaceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FaceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FaceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FaceServiceBlockingStub>() {
        @java.lang.Override
        public FaceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FaceServiceBlockingStub(channel, callOptions);
        }
      };
    return FaceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FaceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FaceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FaceServiceFutureStub>() {
        @java.lang.Override
        public FaceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FaceServiceFutureStub(channel, callOptions);
        }
      };
    return FaceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * faceRecognition.FaceService 人脸服务
   * </pre>
   */
  public static abstract class FaceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Compare 实现两张人脸图片对比识别，返回两张人脸图片对比的可信度
     * 开发管理平台功能参考: http://10.10.10.2/face/compare
     * </pre>
     */
    public void compare(com.jjrobot.andy4.facepb.FaceServicePB.CompareRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceServicePB.CompareResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCompareMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search 从FaceSet中搜索近似人脸数据
     * 若存在匹配数据时返回一个FaceDetail及可信度
     * 开发管理平台功能参考: http://10.10.10.2/face/compare
     * </pre>
     */
    public void search(com.jjrobot.andy4.facepb.FaceServicePB.SearchRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceServicePB.SearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCompareMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.facepb.FaceServicePB.CompareRequest,
                com.jjrobot.andy4.facepb.FaceServicePB.CompareResponse>(
                  this, METHODID_COMPARE)))
          .addMethod(
            getSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.facepb.FaceServicePB.SearchRequest,
                com.jjrobot.andy4.facepb.FaceServicePB.SearchResponse>(
                  this, METHODID_SEARCH)))
          .build();
    }
  }

  /**
   * <pre>
   * faceRecognition.FaceService 人脸服务
   * </pre>
   */
  public static final class FaceServiceStub extends io.grpc.stub.AbstractAsyncStub<FaceServiceStub> {
    private FaceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FaceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FaceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Compare 实现两张人脸图片对比识别，返回两张人脸图片对比的可信度
     * 开发管理平台功能参考: http://10.10.10.2/face/compare
     * </pre>
     */
    public void compare(com.jjrobot.andy4.facepb.FaceServicePB.CompareRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceServicePB.CompareResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCompareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search 从FaceSet中搜索近似人脸数据
     * 若存在匹配数据时返回一个FaceDetail及可信度
     * 开发管理平台功能参考: http://10.10.10.2/face/compare
     * </pre>
     */
    public void search(com.jjrobot.andy4.facepb.FaceServicePB.SearchRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceServicePB.SearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * faceRecognition.FaceService 人脸服务
   * </pre>
   */
  public static final class FaceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FaceServiceBlockingStub> {
    private FaceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FaceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FaceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Compare 实现两张人脸图片对比识别，返回两张人脸图片对比的可信度
     * 开发管理平台功能参考: http://10.10.10.2/face/compare
     * </pre>
     */
    public com.jjrobot.andy4.facepb.FaceServicePB.CompareResponse compare(com.jjrobot.andy4.facepb.FaceServicePB.CompareRequest request) {
      return blockingUnaryCall(
          getChannel(), getCompareMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search 从FaceSet中搜索近似人脸数据
     * 若存在匹配数据时返回一个FaceDetail及可信度
     * 开发管理平台功能参考: http://10.10.10.2/face/compare
     * </pre>
     */
    public com.jjrobot.andy4.facepb.FaceServicePB.SearchResponse search(com.jjrobot.andy4.facepb.FaceServicePB.SearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * faceRecognition.FaceService 人脸服务
   * </pre>
   */
  public static final class FaceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FaceServiceFutureStub> {
    private FaceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FaceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FaceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Compare 实现两张人脸图片对比识别，返回两张人脸图片对比的可信度
     * 开发管理平台功能参考: http://10.10.10.2/face/compare
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.facepb.FaceServicePB.CompareResponse> compare(
        com.jjrobot.andy4.facepb.FaceServicePB.CompareRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCompareMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search 从FaceSet中搜索近似人脸数据
     * 若存在匹配数据时返回一个FaceDetail及可信度
     * 开发管理平台功能参考: http://10.10.10.2/face/compare
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.facepb.FaceServicePB.SearchResponse> search(
        com.jjrobot.andy4.facepb.FaceServicePB.SearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COMPARE = 0;
  private static final int METHODID_SEARCH = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FaceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FaceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COMPARE:
          serviceImpl.compare((com.jjrobot.andy4.facepb.FaceServicePB.CompareRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceServicePB.CompareResponse>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((com.jjrobot.andy4.facepb.FaceServicePB.SearchRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceServicePB.SearchResponse>) responseObserver);
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

  private static abstract class FaceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FaceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jjrobot.andy4.facepb.FaceServicePB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FaceService");
    }
  }

  private static final class FaceServiceFileDescriptorSupplier
      extends FaceServiceBaseDescriptorSupplier {
    FaceServiceFileDescriptorSupplier() {}
  }

  private static final class FaceServiceMethodDescriptorSupplier
      extends FaceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FaceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FaceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FaceServiceFileDescriptorSupplier())
              .addMethod(getCompareMethod())
              .addMethod(getSearchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
