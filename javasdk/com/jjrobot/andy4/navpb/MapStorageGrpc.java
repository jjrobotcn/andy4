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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.1-SNAPSHOT)",
    comments = "Source: map.proto")
public final class MapStorageGrpc {

  private MapStorageGrpc() {}

  public static final String SERVICE_NAME = "navService.MapStorage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.MapPB.UploadMapFileRequest,
      com.jjrobot.andy4.navpb.MapPB.UploadMapFileResponse> getUploadMapFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadMapFile",
      requestType = com.jjrobot.andy4.navpb.MapPB.UploadMapFileRequest.class,
      responseType = com.jjrobot.andy4.navpb.MapPB.UploadMapFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.MapPB.UploadMapFileRequest,
      com.jjrobot.andy4.navpb.MapPB.UploadMapFileResponse> getUploadMapFileMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.MapPB.UploadMapFileRequest, com.jjrobot.andy4.navpb.MapPB.UploadMapFileResponse> getUploadMapFileMethod;
    if ((getUploadMapFileMethod = MapStorageGrpc.getUploadMapFileMethod) == null) {
      synchronized (MapStorageGrpc.class) {
        if ((getUploadMapFileMethod = MapStorageGrpc.getUploadMapFileMethod) == null) {
          MapStorageGrpc.getUploadMapFileMethod = getUploadMapFileMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.navpb.MapPB.UploadMapFileRequest, com.jjrobot.andy4.navpb.MapPB.UploadMapFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadMapFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.MapPB.UploadMapFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.MapPB.UploadMapFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapStorageMethodDescriptorSupplier("UploadMapFile"))
              .build();
        }
      }
    }
    return getUploadMapFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.MapPB.DownloadMapFileRequest,
      com.jjrobot.andy4.navpb.MapPB.DownloadMapFileResponse> getDownloadMapFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadMapFile",
      requestType = com.jjrobot.andy4.navpb.MapPB.DownloadMapFileRequest.class,
      responseType = com.jjrobot.andy4.navpb.MapPB.DownloadMapFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.MapPB.DownloadMapFileRequest,
      com.jjrobot.andy4.navpb.MapPB.DownloadMapFileResponse> getDownloadMapFileMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.MapPB.DownloadMapFileRequest, com.jjrobot.andy4.navpb.MapPB.DownloadMapFileResponse> getDownloadMapFileMethod;
    if ((getDownloadMapFileMethod = MapStorageGrpc.getDownloadMapFileMethod) == null) {
      synchronized (MapStorageGrpc.class) {
        if ((getDownloadMapFileMethod = MapStorageGrpc.getDownloadMapFileMethod) == null) {
          MapStorageGrpc.getDownloadMapFileMethod = getDownloadMapFileMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.navpb.MapPB.DownloadMapFileRequest, com.jjrobot.andy4.navpb.MapPB.DownloadMapFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadMapFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.MapPB.DownloadMapFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.MapPB.DownloadMapFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapStorageMethodDescriptorSupplier("DownloadMapFile"))
              .build();
        }
      }
    }
    return getDownloadMapFileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MapStorageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MapStorageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MapStorageStub>() {
        @java.lang.Override
        public MapStorageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MapStorageStub(channel, callOptions);
        }
      };
    return MapStorageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MapStorageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MapStorageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MapStorageBlockingStub>() {
        @java.lang.Override
        public MapStorageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MapStorageBlockingStub(channel, callOptions);
        }
      };
    return MapStorageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MapStorageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MapStorageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MapStorageFutureStub>() {
        @java.lang.Override
        public MapStorageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MapStorageFutureStub(channel, callOptions);
        }
      };
    return MapStorageFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MapStorageImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 上传地图文件
     * </pre>
     */
    public void uploadMapFile(com.jjrobot.andy4.navpb.MapPB.UploadMapFileRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.MapPB.UploadMapFileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUploadMapFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * 下载地图文件
     * </pre>
     */
    public void downloadMapFile(com.jjrobot.andy4.navpb.MapPB.DownloadMapFileRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.MapPB.DownloadMapFileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDownloadMapFileMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadMapFileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.navpb.MapPB.UploadMapFileRequest,
                com.jjrobot.andy4.navpb.MapPB.UploadMapFileResponse>(
                  this, METHODID_UPLOAD_MAP_FILE)))
          .addMethod(
            getDownloadMapFileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.navpb.MapPB.DownloadMapFileRequest,
                com.jjrobot.andy4.navpb.MapPB.DownloadMapFileResponse>(
                  this, METHODID_DOWNLOAD_MAP_FILE)))
          .build();
    }
  }

  /**
   */
  public static final class MapStorageStub extends io.grpc.stub.AbstractAsyncStub<MapStorageStub> {
    private MapStorageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapStorageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MapStorageStub(channel, callOptions);
    }

    /**
     * <pre>
     * 上传地图文件
     * </pre>
     */
    public void uploadMapFile(com.jjrobot.andy4.navpb.MapPB.UploadMapFileRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.MapPB.UploadMapFileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUploadMapFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 下载地图文件
     * </pre>
     */
    public void downloadMapFile(com.jjrobot.andy4.navpb.MapPB.DownloadMapFileRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.MapPB.DownloadMapFileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDownloadMapFileMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MapStorageBlockingStub extends io.grpc.stub.AbstractBlockingStub<MapStorageBlockingStub> {
    private MapStorageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapStorageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MapStorageBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 上传地图文件
     * </pre>
     */
    public com.jjrobot.andy4.navpb.MapPB.UploadMapFileResponse uploadMapFile(com.jjrobot.andy4.navpb.MapPB.UploadMapFileRequest request) {
      return blockingUnaryCall(
          getChannel(), getUploadMapFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 下载地图文件
     * </pre>
     */
    public com.jjrobot.andy4.navpb.MapPB.DownloadMapFileResponse downloadMapFile(com.jjrobot.andy4.navpb.MapPB.DownloadMapFileRequest request) {
      return blockingUnaryCall(
          getChannel(), getDownloadMapFileMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MapStorageFutureStub extends io.grpc.stub.AbstractFutureStub<MapStorageFutureStub> {
    private MapStorageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapStorageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MapStorageFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 上传地图文件
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.navpb.MapPB.UploadMapFileResponse> uploadMapFile(
        com.jjrobot.andy4.navpb.MapPB.UploadMapFileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUploadMapFileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 下载地图文件
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.navpb.MapPB.DownloadMapFileResponse> downloadMapFile(
        com.jjrobot.andy4.navpb.MapPB.DownloadMapFileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDownloadMapFileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD_MAP_FILE = 0;
  private static final int METHODID_DOWNLOAD_MAP_FILE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MapStorageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MapStorageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_MAP_FILE:
          serviceImpl.uploadMapFile((com.jjrobot.andy4.navpb.MapPB.UploadMapFileRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.MapPB.UploadMapFileResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_MAP_FILE:
          serviceImpl.downloadMapFile((com.jjrobot.andy4.navpb.MapPB.DownloadMapFileRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.MapPB.DownloadMapFileResponse>) responseObserver);
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

  private static abstract class MapStorageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MapStorageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jjrobot.andy4.navpb.MapPB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MapStorage");
    }
  }

  private static final class MapStorageFileDescriptorSupplier
      extends MapStorageBaseDescriptorSupplier {
    MapStorageFileDescriptorSupplier() {}
  }

  private static final class MapStorageMethodDescriptorSupplier
      extends MapStorageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MapStorageMethodDescriptorSupplier(String methodName) {
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
      synchronized (MapStorageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MapStorageFileDescriptorSupplier())
              .addMethod(getUploadMapFileMethod())
              .addMethod(getDownloadMapFileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
