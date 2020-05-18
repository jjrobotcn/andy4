package cameraService;

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
    comments = "Source: storage.proto")
public final class StorageGrpc {

  private StorageGrpc() {}

  public static final String SERVICE_NAME = "cameraService.Storage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cameraService.StorageOuterClass.ListDatesRequest,
      cameraService.StorageOuterClass.ListDatesResponse> getListDatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDates",
      requestType = cameraService.StorageOuterClass.ListDatesRequest.class,
      responseType = cameraService.StorageOuterClass.ListDatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cameraService.StorageOuterClass.ListDatesRequest,
      cameraService.StorageOuterClass.ListDatesResponse> getListDatesMethod() {
    io.grpc.MethodDescriptor<cameraService.StorageOuterClass.ListDatesRequest, cameraService.StorageOuterClass.ListDatesResponse> getListDatesMethod;
    if ((getListDatesMethod = StorageGrpc.getListDatesMethod) == null) {
      synchronized (StorageGrpc.class) {
        if ((getListDatesMethod = StorageGrpc.getListDatesMethod) == null) {
          StorageGrpc.getListDatesMethod = getListDatesMethod = 
              io.grpc.MethodDescriptor.<cameraService.StorageOuterClass.ListDatesRequest, cameraService.StorageOuterClass.ListDatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cameraService.Storage", "ListDates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cameraService.StorageOuterClass.ListDatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cameraService.StorageOuterClass.ListDatesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StorageMethodDescriptorSupplier("ListDates"))
                  .build();
          }
        }
     }
     return getListDatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cameraService.StorageOuterClass.ListVideosRequest,
      cameraService.StorageOuterClass.ListVideosResponse> getListVideosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVideos",
      requestType = cameraService.StorageOuterClass.ListVideosRequest.class,
      responseType = cameraService.StorageOuterClass.ListVideosResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cameraService.StorageOuterClass.ListVideosRequest,
      cameraService.StorageOuterClass.ListVideosResponse> getListVideosMethod() {
    io.grpc.MethodDescriptor<cameraService.StorageOuterClass.ListVideosRequest, cameraService.StorageOuterClass.ListVideosResponse> getListVideosMethod;
    if ((getListVideosMethod = StorageGrpc.getListVideosMethod) == null) {
      synchronized (StorageGrpc.class) {
        if ((getListVideosMethod = StorageGrpc.getListVideosMethod) == null) {
          StorageGrpc.getListVideosMethod = getListVideosMethod = 
              io.grpc.MethodDescriptor.<cameraService.StorageOuterClass.ListVideosRequest, cameraService.StorageOuterClass.ListVideosResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cameraService.Storage", "ListVideos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cameraService.StorageOuterClass.ListVideosRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cameraService.StorageOuterClass.ListVideosResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StorageMethodDescriptorSupplier("ListVideos"))
                  .build();
          }
        }
     }
     return getListVideosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cameraService.StorageOuterClass.GetVideoFileRequest,
      cameraService.StorageOuterClass.GetVideoFileResponse> getGetVideoFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVideoFile",
      requestType = cameraService.StorageOuterClass.GetVideoFileRequest.class,
      responseType = cameraService.StorageOuterClass.GetVideoFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cameraService.StorageOuterClass.GetVideoFileRequest,
      cameraService.StorageOuterClass.GetVideoFileResponse> getGetVideoFileMethod() {
    io.grpc.MethodDescriptor<cameraService.StorageOuterClass.GetVideoFileRequest, cameraService.StorageOuterClass.GetVideoFileResponse> getGetVideoFileMethod;
    if ((getGetVideoFileMethod = StorageGrpc.getGetVideoFileMethod) == null) {
      synchronized (StorageGrpc.class) {
        if ((getGetVideoFileMethod = StorageGrpc.getGetVideoFileMethod) == null) {
          StorageGrpc.getGetVideoFileMethod = getGetVideoFileMethod = 
              io.grpc.MethodDescriptor.<cameraService.StorageOuterClass.GetVideoFileRequest, cameraService.StorageOuterClass.GetVideoFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cameraService.Storage", "GetVideoFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cameraService.StorageOuterClass.GetVideoFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cameraService.StorageOuterClass.GetVideoFileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StorageMethodDescriptorSupplier("GetVideoFile"))
                  .build();
          }
        }
     }
     return getGetVideoFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cameraService.StorageOuterClass.DeleteVideoFilesRequest,
      cameraService.StorageOuterClass.DeleteVideoFilesResponse> getDeleteVideoFilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteVideoFiles",
      requestType = cameraService.StorageOuterClass.DeleteVideoFilesRequest.class,
      responseType = cameraService.StorageOuterClass.DeleteVideoFilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cameraService.StorageOuterClass.DeleteVideoFilesRequest,
      cameraService.StorageOuterClass.DeleteVideoFilesResponse> getDeleteVideoFilesMethod() {
    io.grpc.MethodDescriptor<cameraService.StorageOuterClass.DeleteVideoFilesRequest, cameraService.StorageOuterClass.DeleteVideoFilesResponse> getDeleteVideoFilesMethod;
    if ((getDeleteVideoFilesMethod = StorageGrpc.getDeleteVideoFilesMethod) == null) {
      synchronized (StorageGrpc.class) {
        if ((getDeleteVideoFilesMethod = StorageGrpc.getDeleteVideoFilesMethod) == null) {
          StorageGrpc.getDeleteVideoFilesMethod = getDeleteVideoFilesMethod = 
              io.grpc.MethodDescriptor.<cameraService.StorageOuterClass.DeleteVideoFilesRequest, cameraService.StorageOuterClass.DeleteVideoFilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cameraService.Storage", "DeleteVideoFiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cameraService.StorageOuterClass.DeleteVideoFilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cameraService.StorageOuterClass.DeleteVideoFilesResponse.getDefaultInstance()))
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
    return new StorageStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StorageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StorageBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StorageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StorageFutureStub(channel);
  }

  /**
   */
  public static abstract class StorageImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 获取监控视频日期列表
     * </pre>
     */
    public void listDates(cameraService.StorageOuterClass.ListDatesRequest request,
        io.grpc.stub.StreamObserver<cameraService.StorageOuterClass.ListDatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListDatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取监控视频列表
     * </pre>
     */
    public void listVideos(cameraService.StorageOuterClass.ListVideosRequest request,
        io.grpc.stub.StreamObserver<cameraService.StorageOuterClass.ListVideosResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListVideosMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取监控视频文件
     * </pre>
     */
    public void getVideoFile(cameraService.StorageOuterClass.GetVideoFileRequest request,
        io.grpc.stub.StreamObserver<cameraService.StorageOuterClass.GetVideoFileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVideoFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除监控视频文件
     * </pre>
     */
    public void deleteVideoFiles(cameraService.StorageOuterClass.DeleteVideoFilesRequest request,
        io.grpc.stub.StreamObserver<cameraService.StorageOuterClass.DeleteVideoFilesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteVideoFilesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListDatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cameraService.StorageOuterClass.ListDatesRequest,
                cameraService.StorageOuterClass.ListDatesResponse>(
                  this, METHODID_LIST_DATES)))
          .addMethod(
            getListVideosMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cameraService.StorageOuterClass.ListVideosRequest,
                cameraService.StorageOuterClass.ListVideosResponse>(
                  this, METHODID_LIST_VIDEOS)))
          .addMethod(
            getGetVideoFileMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                cameraService.StorageOuterClass.GetVideoFileRequest,
                cameraService.StorageOuterClass.GetVideoFileResponse>(
                  this, METHODID_GET_VIDEO_FILE)))
          .addMethod(
            getDeleteVideoFilesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cameraService.StorageOuterClass.DeleteVideoFilesRequest,
                cameraService.StorageOuterClass.DeleteVideoFilesResponse>(
                  this, METHODID_DELETE_VIDEO_FILES)))
          .build();
    }
  }

  /**
   */
  public static final class StorageStub extends io.grpc.stub.AbstractStub<StorageStub> {
    private StorageStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StorageStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StorageStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取监控视频日期列表
     * </pre>
     */
    public void listDates(cameraService.StorageOuterClass.ListDatesRequest request,
        io.grpc.stub.StreamObserver<cameraService.StorageOuterClass.ListDatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取监控视频列表
     * </pre>
     */
    public void listVideos(cameraService.StorageOuterClass.ListVideosRequest request,
        io.grpc.stub.StreamObserver<cameraService.StorageOuterClass.ListVideosResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListVideosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取监控视频文件
     * </pre>
     */
    public void getVideoFile(cameraService.StorageOuterClass.GetVideoFileRequest request,
        io.grpc.stub.StreamObserver<cameraService.StorageOuterClass.GetVideoFileResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetVideoFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除监控视频文件
     * </pre>
     */
    public void deleteVideoFiles(cameraService.StorageOuterClass.DeleteVideoFilesRequest request,
        io.grpc.stub.StreamObserver<cameraService.StorageOuterClass.DeleteVideoFilesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteVideoFilesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StorageBlockingStub extends io.grpc.stub.AbstractStub<StorageBlockingStub> {
    private StorageBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StorageBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StorageBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取监控视频日期列表
     * </pre>
     */
    public cameraService.StorageOuterClass.ListDatesResponse listDates(cameraService.StorageOuterClass.ListDatesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListDatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取监控视频列表
     * </pre>
     */
    public cameraService.StorageOuterClass.ListVideosResponse listVideos(cameraService.StorageOuterClass.ListVideosRequest request) {
      return blockingUnaryCall(
          getChannel(), getListVideosMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取监控视频文件
     * </pre>
     */
    public java.util.Iterator<cameraService.StorageOuterClass.GetVideoFileResponse> getVideoFile(
        cameraService.StorageOuterClass.GetVideoFileRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetVideoFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除监控视频文件
     * </pre>
     */
    public cameraService.StorageOuterClass.DeleteVideoFilesResponse deleteVideoFiles(cameraService.StorageOuterClass.DeleteVideoFilesRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteVideoFilesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StorageFutureStub extends io.grpc.stub.AbstractStub<StorageFutureStub> {
    private StorageFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StorageFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StorageFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取监控视频日期列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cameraService.StorageOuterClass.ListDatesResponse> listDates(
        cameraService.StorageOuterClass.ListDatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListDatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取监控视频列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cameraService.StorageOuterClass.ListVideosResponse> listVideos(
        cameraService.StorageOuterClass.ListVideosRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListVideosMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除监控视频文件
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cameraService.StorageOuterClass.DeleteVideoFilesResponse> deleteVideoFiles(
        cameraService.StorageOuterClass.DeleteVideoFilesRequest request) {
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
          serviceImpl.listDates((cameraService.StorageOuterClass.ListDatesRequest) request,
              (io.grpc.stub.StreamObserver<cameraService.StorageOuterClass.ListDatesResponse>) responseObserver);
          break;
        case METHODID_LIST_VIDEOS:
          serviceImpl.listVideos((cameraService.StorageOuterClass.ListVideosRequest) request,
              (io.grpc.stub.StreamObserver<cameraService.StorageOuterClass.ListVideosResponse>) responseObserver);
          break;
        case METHODID_GET_VIDEO_FILE:
          serviceImpl.getVideoFile((cameraService.StorageOuterClass.GetVideoFileRequest) request,
              (io.grpc.stub.StreamObserver<cameraService.StorageOuterClass.GetVideoFileResponse>) responseObserver);
          break;
        case METHODID_DELETE_VIDEO_FILES:
          serviceImpl.deleteVideoFiles((cameraService.StorageOuterClass.DeleteVideoFilesRequest) request,
              (io.grpc.stub.StreamObserver<cameraService.StorageOuterClass.DeleteVideoFilesResponse>) responseObserver);
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
      return cameraService.StorageOuterClass.getDescriptor();
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
