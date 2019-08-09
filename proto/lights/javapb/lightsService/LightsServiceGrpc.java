package lightsService;

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
    comments = "Source: lights.proto")
public final class LightsServiceGrpc {

  private LightsServiceGrpc() {}

  public static final String SERVICE_NAME = "lightsService.LightsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<lightsService.Lights.PreviewLightRequest,
      lightsService.Lights.PreviewLightResponse> getPreviewLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PreviewLight",
      requestType = lightsService.Lights.PreviewLightRequest.class,
      responseType = lightsService.Lights.PreviewLightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lightsService.Lights.PreviewLightRequest,
      lightsService.Lights.PreviewLightResponse> getPreviewLightMethod() {
    io.grpc.MethodDescriptor<lightsService.Lights.PreviewLightRequest, lightsService.Lights.PreviewLightResponse> getPreviewLightMethod;
    if ((getPreviewLightMethod = LightsServiceGrpc.getPreviewLightMethod) == null) {
      synchronized (LightsServiceGrpc.class) {
        if ((getPreviewLightMethod = LightsServiceGrpc.getPreviewLightMethod) == null) {
          LightsServiceGrpc.getPreviewLightMethod = getPreviewLightMethod = 
              io.grpc.MethodDescriptor.<lightsService.Lights.PreviewLightRequest, lightsService.Lights.PreviewLightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lightsService.LightsService", "PreviewLight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightsService.Lights.PreviewLightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightsService.Lights.PreviewLightResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightsServiceMethodDescriptorSupplier("PreviewLight"))
                  .build();
          }
        }
     }
     return getPreviewLightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lightsService.Lights.PlayLightRequest,
      lightsService.Lights.PlayLightResponse> getPlayLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlayLight",
      requestType = lightsService.Lights.PlayLightRequest.class,
      responseType = lightsService.Lights.PlayLightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lightsService.Lights.PlayLightRequest,
      lightsService.Lights.PlayLightResponse> getPlayLightMethod() {
    io.grpc.MethodDescriptor<lightsService.Lights.PlayLightRequest, lightsService.Lights.PlayLightResponse> getPlayLightMethod;
    if ((getPlayLightMethod = LightsServiceGrpc.getPlayLightMethod) == null) {
      synchronized (LightsServiceGrpc.class) {
        if ((getPlayLightMethod = LightsServiceGrpc.getPlayLightMethod) == null) {
          LightsServiceGrpc.getPlayLightMethod = getPlayLightMethod = 
              io.grpc.MethodDescriptor.<lightsService.Lights.PlayLightRequest, lightsService.Lights.PlayLightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lightsService.LightsService", "PlayLight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightsService.Lights.PlayLightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightsService.Lights.PlayLightResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightsServiceMethodDescriptorSupplier("PlayLight"))
                  .build();
          }
        }
     }
     return getPlayLightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lightsService.Lights.StopLightRequest,
      lightsService.Lights.StopLightResponse> getStopLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopLight",
      requestType = lightsService.Lights.StopLightRequest.class,
      responseType = lightsService.Lights.StopLightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lightsService.Lights.StopLightRequest,
      lightsService.Lights.StopLightResponse> getStopLightMethod() {
    io.grpc.MethodDescriptor<lightsService.Lights.StopLightRequest, lightsService.Lights.StopLightResponse> getStopLightMethod;
    if ((getStopLightMethod = LightsServiceGrpc.getStopLightMethod) == null) {
      synchronized (LightsServiceGrpc.class) {
        if ((getStopLightMethod = LightsServiceGrpc.getStopLightMethod) == null) {
          LightsServiceGrpc.getStopLightMethod = getStopLightMethod = 
              io.grpc.MethodDescriptor.<lightsService.Lights.StopLightRequest, lightsService.Lights.StopLightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lightsService.LightsService", "StopLight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightsService.Lights.StopLightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightsService.Lights.StopLightResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightsServiceMethodDescriptorSupplier("StopLight"))
                  .build();
          }
        }
     }
     return getStopLightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lightsService.Lights.ListLightsRequest,
      lightsService.Lights.ListLightsResponse> getListLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLights",
      requestType = lightsService.Lights.ListLightsRequest.class,
      responseType = lightsService.Lights.ListLightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lightsService.Lights.ListLightsRequest,
      lightsService.Lights.ListLightsResponse> getListLightsMethod() {
    io.grpc.MethodDescriptor<lightsService.Lights.ListLightsRequest, lightsService.Lights.ListLightsResponse> getListLightsMethod;
    if ((getListLightsMethod = LightsServiceGrpc.getListLightsMethod) == null) {
      synchronized (LightsServiceGrpc.class) {
        if ((getListLightsMethod = LightsServiceGrpc.getListLightsMethod) == null) {
          LightsServiceGrpc.getListLightsMethod = getListLightsMethod = 
              io.grpc.MethodDescriptor.<lightsService.Lights.ListLightsRequest, lightsService.Lights.ListLightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lightsService.LightsService", "ListLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightsService.Lights.ListLightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightsService.Lights.ListLightsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightsServiceMethodDescriptorSupplier("ListLights"))
                  .build();
          }
        }
     }
     return getListLightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lightsService.Lights.NewLightRequest,
      lightsService.Lights.NewLightResponse> getNewLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewLight",
      requestType = lightsService.Lights.NewLightRequest.class,
      responseType = lightsService.Lights.NewLightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lightsService.Lights.NewLightRequest,
      lightsService.Lights.NewLightResponse> getNewLightMethod() {
    io.grpc.MethodDescriptor<lightsService.Lights.NewLightRequest, lightsService.Lights.NewLightResponse> getNewLightMethod;
    if ((getNewLightMethod = LightsServiceGrpc.getNewLightMethod) == null) {
      synchronized (LightsServiceGrpc.class) {
        if ((getNewLightMethod = LightsServiceGrpc.getNewLightMethod) == null) {
          LightsServiceGrpc.getNewLightMethod = getNewLightMethod = 
              io.grpc.MethodDescriptor.<lightsService.Lights.NewLightRequest, lightsService.Lights.NewLightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lightsService.LightsService", "NewLight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightsService.Lights.NewLightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightsService.Lights.NewLightResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightsServiceMethodDescriptorSupplier("NewLight"))
                  .build();
          }
        }
     }
     return getNewLightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lightsService.Lights.UpdateLightRequest,
      lightsService.Lights.UpdateLightResponse> getUpdateLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateLight",
      requestType = lightsService.Lights.UpdateLightRequest.class,
      responseType = lightsService.Lights.UpdateLightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lightsService.Lights.UpdateLightRequest,
      lightsService.Lights.UpdateLightResponse> getUpdateLightMethod() {
    io.grpc.MethodDescriptor<lightsService.Lights.UpdateLightRequest, lightsService.Lights.UpdateLightResponse> getUpdateLightMethod;
    if ((getUpdateLightMethod = LightsServiceGrpc.getUpdateLightMethod) == null) {
      synchronized (LightsServiceGrpc.class) {
        if ((getUpdateLightMethod = LightsServiceGrpc.getUpdateLightMethod) == null) {
          LightsServiceGrpc.getUpdateLightMethod = getUpdateLightMethod = 
              io.grpc.MethodDescriptor.<lightsService.Lights.UpdateLightRequest, lightsService.Lights.UpdateLightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lightsService.LightsService", "UpdateLight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightsService.Lights.UpdateLightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightsService.Lights.UpdateLightResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightsServiceMethodDescriptorSupplier("UpdateLight"))
                  .build();
          }
        }
     }
     return getUpdateLightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lightsService.Lights.DeleteLightsRequest,
      lightsService.Lights.DeleteLightsResponse> getDeleteLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLights",
      requestType = lightsService.Lights.DeleteLightsRequest.class,
      responseType = lightsService.Lights.DeleteLightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lightsService.Lights.DeleteLightsRequest,
      lightsService.Lights.DeleteLightsResponse> getDeleteLightsMethod() {
    io.grpc.MethodDescriptor<lightsService.Lights.DeleteLightsRequest, lightsService.Lights.DeleteLightsResponse> getDeleteLightsMethod;
    if ((getDeleteLightsMethod = LightsServiceGrpc.getDeleteLightsMethod) == null) {
      synchronized (LightsServiceGrpc.class) {
        if ((getDeleteLightsMethod = LightsServiceGrpc.getDeleteLightsMethod) == null) {
          LightsServiceGrpc.getDeleteLightsMethod = getDeleteLightsMethod = 
              io.grpc.MethodDescriptor.<lightsService.Lights.DeleteLightsRequest, lightsService.Lights.DeleteLightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lightsService.LightsService", "DeleteLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightsService.Lights.DeleteLightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightsService.Lights.DeleteLightsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightsServiceMethodDescriptorSupplier("DeleteLights"))
                  .build();
          }
        }
     }
     return getDeleteLightsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LightsServiceStub newStub(io.grpc.Channel channel) {
    return new LightsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LightsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LightsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LightsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LightsServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class LightsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 预览灯光
     * 创建灯光后使用此方法生成灯光文件
     * 在未生成灯光文件前调用PlayLight将无效
     * </pre>
     */
    public void previewLight(lightsService.Lights.PreviewLightRequest request,
        io.grpc.stub.StreamObserver<lightsService.Lights.PreviewLightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPreviewLightMethod(), responseObserver);
    }

    /**
     * <pre>
     * 播放灯光
     * 需在播放前执行PreviewLight生成灯光文件
     * </pre>
     */
    public void playLight(lightsService.Lights.PlayLightRequest request,
        io.grpc.stub.StreamObserver<lightsService.Lights.PlayLightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPlayLightMethod(), responseObserver);
    }

    /**
     * <pre>
     * 停止灯光
     * </pre>
     */
    public void stopLight(lightsService.Lights.StopLightRequest request,
        io.grpc.stub.StreamObserver<lightsService.Lights.StopLightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStopLightMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取灯光数据
     * </pre>
     */
    public void listLights(lightsService.Lights.ListLightsRequest request,
        io.grpc.stub.StreamObserver<lightsService.Lights.ListLightsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListLightsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 创建灯光
     * </pre>
     */
    public void newLight(lightsService.Lights.NewLightRequest request,
        io.grpc.stub.StreamObserver<lightsService.Lights.NewLightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNewLightMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更新灯光数据
     * </pre>
     */
    public void updateLight(lightsService.Lights.UpdateLightRequest request,
        io.grpc.stub.StreamObserver<lightsService.Lights.UpdateLightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateLightMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除灯光
     * </pre>
     */
    public void deleteLights(lightsService.Lights.DeleteLightsRequest request,
        io.grpc.stub.StreamObserver<lightsService.Lights.DeleteLightsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteLightsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPreviewLightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lightsService.Lights.PreviewLightRequest,
                lightsService.Lights.PreviewLightResponse>(
                  this, METHODID_PREVIEW_LIGHT)))
          .addMethod(
            getPlayLightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lightsService.Lights.PlayLightRequest,
                lightsService.Lights.PlayLightResponse>(
                  this, METHODID_PLAY_LIGHT)))
          .addMethod(
            getStopLightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lightsService.Lights.StopLightRequest,
                lightsService.Lights.StopLightResponse>(
                  this, METHODID_STOP_LIGHT)))
          .addMethod(
            getListLightsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lightsService.Lights.ListLightsRequest,
                lightsService.Lights.ListLightsResponse>(
                  this, METHODID_LIST_LIGHTS)))
          .addMethod(
            getNewLightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lightsService.Lights.NewLightRequest,
                lightsService.Lights.NewLightResponse>(
                  this, METHODID_NEW_LIGHT)))
          .addMethod(
            getUpdateLightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lightsService.Lights.UpdateLightRequest,
                lightsService.Lights.UpdateLightResponse>(
                  this, METHODID_UPDATE_LIGHT)))
          .addMethod(
            getDeleteLightsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lightsService.Lights.DeleteLightsRequest,
                lightsService.Lights.DeleteLightsResponse>(
                  this, METHODID_DELETE_LIGHTS)))
          .build();
    }
  }

  /**
   */
  public static final class LightsServiceStub extends io.grpc.stub.AbstractStub<LightsServiceStub> {
    private LightsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 预览灯光
     * 创建灯光后使用此方法生成灯光文件
     * 在未生成灯光文件前调用PlayLight将无效
     * </pre>
     */
    public void previewLight(lightsService.Lights.PreviewLightRequest request,
        io.grpc.stub.StreamObserver<lightsService.Lights.PreviewLightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPreviewLightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 播放灯光
     * 需在播放前执行PreviewLight生成灯光文件
     * </pre>
     */
    public void playLight(lightsService.Lights.PlayLightRequest request,
        io.grpc.stub.StreamObserver<lightsService.Lights.PlayLightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPlayLightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 停止灯光
     * </pre>
     */
    public void stopLight(lightsService.Lights.StopLightRequest request,
        io.grpc.stub.StreamObserver<lightsService.Lights.StopLightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopLightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取灯光数据
     * </pre>
     */
    public void listLights(lightsService.Lights.ListLightsRequest request,
        io.grpc.stub.StreamObserver<lightsService.Lights.ListLightsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListLightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 创建灯光
     * </pre>
     */
    public void newLight(lightsService.Lights.NewLightRequest request,
        io.grpc.stub.StreamObserver<lightsService.Lights.NewLightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNewLightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新灯光数据
     * </pre>
     */
    public void updateLight(lightsService.Lights.UpdateLightRequest request,
        io.grpc.stub.StreamObserver<lightsService.Lights.UpdateLightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateLightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除灯光
     * </pre>
     */
    public void deleteLights(lightsService.Lights.DeleteLightsRequest request,
        io.grpc.stub.StreamObserver<lightsService.Lights.DeleteLightsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteLightsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LightsServiceBlockingStub extends io.grpc.stub.AbstractStub<LightsServiceBlockingStub> {
    private LightsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 预览灯光
     * 创建灯光后使用此方法生成灯光文件
     * 在未生成灯光文件前调用PlayLight将无效
     * </pre>
     */
    public lightsService.Lights.PreviewLightResponse previewLight(lightsService.Lights.PreviewLightRequest request) {
      return blockingUnaryCall(
          getChannel(), getPreviewLightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 播放灯光
     * 需在播放前执行PreviewLight生成灯光文件
     * </pre>
     */
    public lightsService.Lights.PlayLightResponse playLight(lightsService.Lights.PlayLightRequest request) {
      return blockingUnaryCall(
          getChannel(), getPlayLightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 停止灯光
     * </pre>
     */
    public lightsService.Lights.StopLightResponse stopLight(lightsService.Lights.StopLightRequest request) {
      return blockingUnaryCall(
          getChannel(), getStopLightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取灯光数据
     * </pre>
     */
    public lightsService.Lights.ListLightsResponse listLights(lightsService.Lights.ListLightsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListLightsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 创建灯光
     * </pre>
     */
    public lightsService.Lights.NewLightResponse newLight(lightsService.Lights.NewLightRequest request) {
      return blockingUnaryCall(
          getChannel(), getNewLightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新灯光数据
     * </pre>
     */
    public lightsService.Lights.UpdateLightResponse updateLight(lightsService.Lights.UpdateLightRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateLightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除灯光
     * </pre>
     */
    public lightsService.Lights.DeleteLightsResponse deleteLights(lightsService.Lights.DeleteLightsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteLightsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LightsServiceFutureStub extends io.grpc.stub.AbstractStub<LightsServiceFutureStub> {
    private LightsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 预览灯光
     * 创建灯光后使用此方法生成灯光文件
     * 在未生成灯光文件前调用PlayLight将无效
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightsService.Lights.PreviewLightResponse> previewLight(
        lightsService.Lights.PreviewLightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPreviewLightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 播放灯光
     * 需在播放前执行PreviewLight生成灯光文件
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightsService.Lights.PlayLightResponse> playLight(
        lightsService.Lights.PlayLightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPlayLightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 停止灯光
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightsService.Lights.StopLightResponse> stopLight(
        lightsService.Lights.StopLightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStopLightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取灯光数据
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightsService.Lights.ListLightsResponse> listLights(
        lightsService.Lights.ListLightsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListLightsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 创建灯光
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightsService.Lights.NewLightResponse> newLight(
        lightsService.Lights.NewLightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNewLightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新灯光数据
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightsService.Lights.UpdateLightResponse> updateLight(
        lightsService.Lights.UpdateLightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateLightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除灯光
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightsService.Lights.DeleteLightsResponse> deleteLights(
        lightsService.Lights.DeleteLightsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteLightsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PREVIEW_LIGHT = 0;
  private static final int METHODID_PLAY_LIGHT = 1;
  private static final int METHODID_STOP_LIGHT = 2;
  private static final int METHODID_LIST_LIGHTS = 3;
  private static final int METHODID_NEW_LIGHT = 4;
  private static final int METHODID_UPDATE_LIGHT = 5;
  private static final int METHODID_DELETE_LIGHTS = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LightsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LightsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PREVIEW_LIGHT:
          serviceImpl.previewLight((lightsService.Lights.PreviewLightRequest) request,
              (io.grpc.stub.StreamObserver<lightsService.Lights.PreviewLightResponse>) responseObserver);
          break;
        case METHODID_PLAY_LIGHT:
          serviceImpl.playLight((lightsService.Lights.PlayLightRequest) request,
              (io.grpc.stub.StreamObserver<lightsService.Lights.PlayLightResponse>) responseObserver);
          break;
        case METHODID_STOP_LIGHT:
          serviceImpl.stopLight((lightsService.Lights.StopLightRequest) request,
              (io.grpc.stub.StreamObserver<lightsService.Lights.StopLightResponse>) responseObserver);
          break;
        case METHODID_LIST_LIGHTS:
          serviceImpl.listLights((lightsService.Lights.ListLightsRequest) request,
              (io.grpc.stub.StreamObserver<lightsService.Lights.ListLightsResponse>) responseObserver);
          break;
        case METHODID_NEW_LIGHT:
          serviceImpl.newLight((lightsService.Lights.NewLightRequest) request,
              (io.grpc.stub.StreamObserver<lightsService.Lights.NewLightResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LIGHT:
          serviceImpl.updateLight((lightsService.Lights.UpdateLightRequest) request,
              (io.grpc.stub.StreamObserver<lightsService.Lights.UpdateLightResponse>) responseObserver);
          break;
        case METHODID_DELETE_LIGHTS:
          serviceImpl.deleteLights((lightsService.Lights.DeleteLightsRequest) request,
              (io.grpc.stub.StreamObserver<lightsService.Lights.DeleteLightsResponse>) responseObserver);
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

  private static abstract class LightsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LightsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lightsService.Lights.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LightsService");
    }
  }

  private static final class LightsServiceFileDescriptorSupplier
      extends LightsServiceBaseDescriptorSupplier {
    LightsServiceFileDescriptorSupplier() {}
  }

  private static final class LightsServiceMethodDescriptorSupplier
      extends LightsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LightsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LightsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LightsServiceFileDescriptorSupplier())
              .addMethod(getPreviewLightMethod())
              .addMethod(getPlayLightMethod())
              .addMethod(getStopLightMethod())
              .addMethod(getListLightsMethod())
              .addMethod(getNewLightMethod())
              .addMethod(getUpdateLightMethod())
              .addMethod(getDeleteLightsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
