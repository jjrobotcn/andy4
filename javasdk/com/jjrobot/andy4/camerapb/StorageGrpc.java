package com.jjrobot.andy4.camerapb;

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
 * cameraService.Storage 管理主摄像头监控数据存储
 * 此服务限制为仅内网使用
 * 开发管理平台功能参考: http://10.10.10.2/camera/storage/dates
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.1-SNAPSHOT)",
    comments = "Source: storage.proto")
public final class StorageGrpc {

  private StorageGrpc() {}

  public static final String SERVICE_NAME = "cameraService.Storage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.camerapb.StoragePB.ListDatesRequest,
      com.jjrobot.andy4.camerapb.StoragePB.ListDatesResponse> getListDatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDates",
      requestType = com.jjrobot.andy4.camerapb.StoragePB.ListDatesRequest.class,
      responseType = com.jjrobot.andy4.camerapb.StoragePB.ListDatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.camerapb.StoragePB.ListDatesRequest,
      com.jjrobot.andy4.camerapb.StoragePB.ListDatesResponse> getListDatesMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.camerapb.StoragePB.ListDatesRequest, com.jjrobot.andy4.camerapb.StoragePB.ListDatesResponse> getListDatesMethod;
    if ((getListDatesMethod = StorageGrpc.getListDatesMethod) == null) {
      synchronized (StorageGrpc.class) {
        if ((getListDatesMethod = StorageGrpc.getListDatesMethod) == null) {
          StorageGrpc.getListDatesMethod = getListDatesMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.camerapb.StoragePB.ListDatesRequest, com.jjrobot.andy4.camerapb.StoragePB.ListDatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.camerapb.StoragePB.ListDatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.camerapb.StoragePB.ListDatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageMethodDescriptorSupplier("ListDates"))
              .build();
        }
      }
    }
    return getListDatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.camerapb.StoragePB.ListVideosRequest,
      com.jjrobot.andy4.camerapb.StoragePB.ListVideosResponse> getListVideosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVideos",
      requestType = com.jjrobot.andy4.camerapb.StoragePB.ListVideosRequest.class,
      responseType = com.jjrobot.andy4.camerapb.StoragePB.ListVideosResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.camerapb.StoragePB.ListVideosRequest,
      com.jjrobot.andy4.camerapb.StoragePB.ListVideosResponse> getListVideosMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.camerapb.StoragePB.ListVideosRequest, com.jjrobot.andy4.camerapb.StoragePB.ListVideosResponse> getListVideosMethod;
    if ((getListVideosMethod = StorageGrpc.getListVideosMethod) == null) {
      synchronized (StorageGrpc.class) {
        if ((getListVideosMethod = StorageGrpc.getListVideosMethod) == null) {
          StorageGrpc.getListVideosMethod = getListVideosMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.camerapb.StoragePB.ListVideosRequest, com.jjrobot.andy4.camerapb.StoragePB.ListVideosResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListVideos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.camerapb.StoragePB.ListVideosRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.camerapb.StoragePB.ListVideosResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageMethodDescriptorSupplier("ListVideos"))
              .build();
        }
      }
    }
    return getListVideosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.camerapb.StoragePB.GetVideoFileRequest,
      com.jjrobot.andy4.camerapb.StoragePB.GetVideoFileResponse> getGetVideoFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVideoFile",
      requestType = com.jjrobot.andy4.camerapb.StoragePB.GetVideoFileRequest.class,
      responseType = com.jjrobot.andy4.camerapb.StoragePB.GetVideoFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.camerapb.StoragePB.GetVideoFileRequest,
      com.jjrobot.andy4.camerapb.StoragePB.GetVideoFileResponse> getGetVideoFileMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.camerapb.StoragePB.GetVideoFileRequest, com.jjrobot.andy4.camerapb.StoragePB.GetVideoFileResponse> getGetVideoFileMethod;
    if ((getGetVideoFileMethod = StorageGrpc.getGetVideoFileMethod) == null) {
      synchronized (StorageGrpc.class) {
        if ((getGetVideoFileMethod = StorageGrpc.getGetVideoFileMethod) == null) {
          StorageGrpc.getGetVideoFileMethod = getGetVideoFileMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.camerapb.StoragePB.GetVideoFileRequest, com.jjrobot.andy4.camerapb.StoragePB.GetVideoFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVideoFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.camerapb.StoragePB.GetVideoFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.camerapb.StoragePB.GetVideoFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageMethodDescriptorSupplier("GetVideoFile"))
              .build();
        }
      }
    }
    return getGetVideoFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.camerapb.StoragePB.DeleteVideoFilesRequest,
      com.jjrobot.andy4.camerapb.StoragePB.DeleteVideoFilesResponse> getDeleteVideoFilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteVideoFiles",
      requestType = com.jjrobot.andy4.camerapb.StoragePB.DeleteVideoFilesRequest.class,
      responseType = com.jjrobot.andy4.camerapb.StoragePB.DeleteVideoFilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.camerapb.StoragePB.DeleteVideoFilesRequest,
      com.jjrobot.andy4.camerapb.StoragePB.DeleteVideoFilesResponse> getDeleteVideoFilesMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.camerapb.StoragePB.DeleteVideoFilesRequest, com.jjrobot.andy4.camerapb.StoragePB.DeleteVideoFilesResponse> getDeleteVideoFilesMethod;
    if ((getDeleteVideoFilesMethod = StorageGrpc.getDeleteVideoFilesMethod) == null) {
      synchronized (StorageGrpc.class) {
        if ((getDeleteVideoFilesMethod = StorageGrpc.getDeleteVideoFilesMethod) == null) {
          StorageGrpc.getDeleteVideoFilesMethod = getDeleteVideoFilesMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.camerapb.StoragePB.DeleteVideoFilesRequest, com.jjrobot.andy4.camerapb.StoragePB.DeleteVideoFilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteVideoFiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.camerapb.StoragePB.DeleteVideoFilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.camerapb.StoragePB.DeleteVideoFilesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageMethodDescriptorSupplier("DeleteVideoFiles"))
              .build();
        }
      }
    }
    return getDeleteVideoFilesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StorageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageStub>() {
        @java.lang.Override
        public StorageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageStub(channel, callOptions);
        }
      };
    return StorageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StorageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageBlockingStub>() {
        @java.lang.Override
        public StorageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageBlockingStub(channel, callOptions);
        }
      };
    return StorageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StorageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageFutureStub>() {
        @java.lang.Override
        public StorageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageFutureStub(channel, callOptions);
        }
      };
    return StorageFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * cameraService.Storage 管理主摄像头监控数据存储
   * 此服务限制为仅内网使用
   * 开发管理平台功能参考: http://10.10.10.2/camera/storage/dates
   * </pre>
   */
  public static abstract class StorageImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * ListDates 获取监控存储的视频日期列表
     * </pre>
     */
    public void listDates(com.jjrobot.andy4.camerapb.StoragePB.ListDatesRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.camerapb.StoragePB.ListDatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListDatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListVideos 获取时间范围内的监控视频列表
     * 未配置时间范围将默认获取当日时间
     * </pre>
     */
    public void listVideos(com.jjrobot.andy4.camerapb.StoragePB.ListVideosRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.camerapb.StoragePB.ListVideosResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListVideosMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetVideoFile 获取监控视频文件
     * HTTP中可使用文件服务器方法处理，支持HTTP Range
     * http://10.10.10.2(:81)/api/v2/camera/storage/videos/2020-01-02/15:04:05.mp4(?token=)
     * </pre>
     */
    public void getVideoFile(com.jjrobot.andy4.camerapb.StoragePB.GetVideoFileRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.camerapb.StoragePB.GetVideoFileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVideoFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteVideoFiles 删除多个监控视频文件
     * </pre>
     */
    public void deleteVideoFiles(com.jjrobot.andy4.camerapb.StoragePB.DeleteVideoFilesRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.camerapb.StoragePB.DeleteVideoFilesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteVideoFilesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListDatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.camerapb.StoragePB.ListDatesRequest,
                com.jjrobot.andy4.camerapb.StoragePB.ListDatesResponse>(
                  this, METHODID_LIST_DATES)))
          .addMethod(
            getListVideosMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.camerapb.StoragePB.ListVideosRequest,
                com.jjrobot.andy4.camerapb.StoragePB.ListVideosResponse>(
                  this, METHODID_LIST_VIDEOS)))
          .addMethod(
            getGetVideoFileMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jjrobot.andy4.camerapb.StoragePB.GetVideoFileRequest,
                com.jjrobot.andy4.camerapb.StoragePB.GetVideoFileResponse>(
                  this, METHODID_GET_VIDEO_FILE)))
          .addMethod(
            getDeleteVideoFilesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.camerapb.StoragePB.DeleteVideoFilesRequest,
                com.jjrobot.andy4.camerapb.StoragePB.DeleteVideoFilesResponse>(
                  this, METHODID_DELETE_VIDEO_FILES)))
          .build();
    }
  }

  /**
   * <pre>
   * cameraService.Storage 管理主摄像头监控数据存储
   * 此服务限制为仅内网使用
   * 开发管理平台功能参考: http://10.10.10.2/camera/storage/dates
   * </pre>
   */
  public static final class StorageStub extends io.grpc.stub.AbstractAsyncStub<StorageStub> {
    private StorageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListDates 获取监控存储的视频日期列表
     * </pre>
     */
    public void listDates(com.jjrobot.andy4.camerapb.StoragePB.ListDatesRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.camerapb.StoragePB.ListDatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListVideos 获取时间范围内的监控视频列表
     * 未配置时间范围将默认获取当日时间
     * </pre>
     */
    public void listVideos(com.jjrobot.andy4.camerapb.StoragePB.ListVideosRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.camerapb.StoragePB.ListVideosResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListVideosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetVideoFile 获取监控视频文件
     * HTTP中可使用文件服务器方法处理，支持HTTP Range
     * http://10.10.10.2(:81)/api/v2/camera/storage/videos/2020-01-02/15:04:05.mp4(?token=)
     * </pre>
     */
    public void getVideoFile(com.jjrobot.andy4.camerapb.StoragePB.GetVideoFileRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.camerapb.StoragePB.GetVideoFileResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetVideoFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteVideoFiles 删除多个监控视频文件
     * </pre>
     */
    public void deleteVideoFiles(com.jjrobot.andy4.camerapb.StoragePB.DeleteVideoFilesRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.camerapb.StoragePB.DeleteVideoFilesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteVideoFilesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * cameraService.Storage 管理主摄像头监控数据存储
   * 此服务限制为仅内网使用
   * 开发管理平台功能参考: http://10.10.10.2/camera/storage/dates
   * </pre>
   */
  public static final class StorageBlockingStub extends io.grpc.stub.AbstractBlockingStub<StorageBlockingStub> {
    private StorageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListDates 获取监控存储的视频日期列表
     * </pre>
     */
    public com.jjrobot.andy4.camerapb.StoragePB.ListDatesResponse listDates(com.jjrobot.andy4.camerapb.StoragePB.ListDatesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListDatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListVideos 获取时间范围内的监控视频列表
     * 未配置时间范围将默认获取当日时间
     * </pre>
     */
    public com.jjrobot.andy4.camerapb.StoragePB.ListVideosResponse listVideos(com.jjrobot.andy4.camerapb.StoragePB.ListVideosRequest request) {
      return blockingUnaryCall(
          getChannel(), getListVideosMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetVideoFile 获取监控视频文件
     * HTTP中可使用文件服务器方法处理，支持HTTP Range
     * http://10.10.10.2(:81)/api/v2/camera/storage/videos/2020-01-02/15:04:05.mp4(?token=)
     * </pre>
     */
    public java.util.Iterator<com.jjrobot.andy4.camerapb.StoragePB.GetVideoFileResponse> getVideoFile(
        com.jjrobot.andy4.camerapb.StoragePB.GetVideoFileRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetVideoFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteVideoFiles 删除多个监控视频文件
     * </pre>
     */
    public com.jjrobot.andy4.camerapb.StoragePB.DeleteVideoFilesResponse deleteVideoFiles(com.jjrobot.andy4.camerapb.StoragePB.DeleteVideoFilesRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteVideoFilesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * cameraService.Storage 管理主摄像头监控数据存储
   * 此服务限制为仅内网使用
   * 开发管理平台功能参考: http://10.10.10.2/camera/storage/dates
   * </pre>
   */
  public static final class StorageFutureStub extends io.grpc.stub.AbstractFutureStub<StorageFutureStub> {
    private StorageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListDates 获取监控存储的视频日期列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.camerapb.StoragePB.ListDatesResponse> listDates(
        com.jjrobot.andy4.camerapb.StoragePB.ListDatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListDatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListVideos 获取时间范围内的监控视频列表
     * 未配置时间范围将默认获取当日时间
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.camerapb.StoragePB.ListVideosResponse> listVideos(
        com.jjrobot.andy4.camerapb.StoragePB.ListVideosRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListVideosMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteVideoFiles 删除多个监控视频文件
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.camerapb.StoragePB.DeleteVideoFilesResponse> deleteVideoFiles(
        com.jjrobot.andy4.camerapb.StoragePB.DeleteVideoFilesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteVideoFilesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_DATES = 0;
  private static final int METHODID_LIST_VIDEOS = 1;
  private static final int METHODID_GET_VIDEO_FILE = 2;
  private static final int METHODID_DELETE_VIDEO_FILES = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StorageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StorageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_DATES:
          serviceImpl.listDates((com.jjrobot.andy4.camerapb.StoragePB.ListDatesRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.camerapb.StoragePB.ListDatesResponse>) responseObserver);
          break;
        case METHODID_LIST_VIDEOS:
          serviceImpl.listVideos((com.jjrobot.andy4.camerapb.StoragePB.ListVideosRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.camerapb.StoragePB.ListVideosResponse>) responseObserver);
          break;
        case METHODID_GET_VIDEO_FILE:
          serviceImpl.getVideoFile((com.jjrobot.andy4.camerapb.StoragePB.GetVideoFileRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.camerapb.StoragePB.GetVideoFileResponse>) responseObserver);
          break;
        case METHODID_DELETE_VIDEO_FILES:
          serviceImpl.deleteVideoFiles((com.jjrobot.andy4.camerapb.StoragePB.DeleteVideoFilesRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.camerapb.StoragePB.DeleteVideoFilesResponse>) responseObserver);
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

  private static abstract class StorageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StorageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jjrobot.andy4.camerapb.StoragePB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Storage");
    }
  }

  private static final class StorageFileDescriptorSupplier
      extends StorageBaseDescriptorSupplier {
    StorageFileDescriptorSupplier() {}
  }

  private static final class StorageMethodDescriptorSupplier
      extends StorageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StorageMethodDescriptorSupplier(String methodName) {
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
      synchronized (StorageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StorageFileDescriptorSupplier())
              .addMethod(getListDatesMethod())
              .addMethod(getListVideosMethod())
              .addMethod(getGetVideoFileMethod())
              .addMethod(getDeleteVideoFilesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
