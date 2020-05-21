package com.jjrobot.andy4.lightspb;

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
 * lightsService.LightsService 灯光管理
 * 开发管理平台功能参考: http://10.10.10.2/lights/
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.1-SNAPSHOT)",
    comments = "Source: lights.proto")
public final class LightsServiceGrpc {

  private LightsServiceGrpc() {}

  public static final String SERVICE_NAME = "lightsService.LightsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.PreviewLightRequest,
      com.jjrobot.andy4.lightspb.LightsServicePB.PreviewLightResponse> getPreviewLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PreviewLight",
      requestType = com.jjrobot.andy4.lightspb.LightsServicePB.PreviewLightRequest.class,
      responseType = com.jjrobot.andy4.lightspb.LightsServicePB.PreviewLightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.PreviewLightRequest,
      com.jjrobot.andy4.lightspb.LightsServicePB.PreviewLightResponse> getPreviewLightMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.PreviewLightRequest, com.jjrobot.andy4.lightspb.LightsServicePB.PreviewLightResponse> getPreviewLightMethod;
    if ((getPreviewLightMethod = LightsServiceGrpc.getPreviewLightMethod) == null) {
      synchronized (LightsServiceGrpc.class) {
        if ((getPreviewLightMethod = LightsServiceGrpc.getPreviewLightMethod) == null) {
          LightsServiceGrpc.getPreviewLightMethod = getPreviewLightMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.lightspb.LightsServicePB.PreviewLightRequest, com.jjrobot.andy4.lightspb.LightsServicePB.PreviewLightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PreviewLight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.lightspb.LightsServicePB.PreviewLightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.lightspb.LightsServicePB.PreviewLightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LightsServiceMethodDescriptorSupplier("PreviewLight"))
              .build();
        }
      }
    }
    return getPreviewLightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.PlayLightRequest,
      com.jjrobot.andy4.lightspb.LightsServicePB.PlayLightResponse> getPlayLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlayLight",
      requestType = com.jjrobot.andy4.lightspb.LightsServicePB.PlayLightRequest.class,
      responseType = com.jjrobot.andy4.lightspb.LightsServicePB.PlayLightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.PlayLightRequest,
      com.jjrobot.andy4.lightspb.LightsServicePB.PlayLightResponse> getPlayLightMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.PlayLightRequest, com.jjrobot.andy4.lightspb.LightsServicePB.PlayLightResponse> getPlayLightMethod;
    if ((getPlayLightMethod = LightsServiceGrpc.getPlayLightMethod) == null) {
      synchronized (LightsServiceGrpc.class) {
        if ((getPlayLightMethod = LightsServiceGrpc.getPlayLightMethod) == null) {
          LightsServiceGrpc.getPlayLightMethod = getPlayLightMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.lightspb.LightsServicePB.PlayLightRequest, com.jjrobot.andy4.lightspb.LightsServicePB.PlayLightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlayLight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.lightspb.LightsServicePB.PlayLightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.lightspb.LightsServicePB.PlayLightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LightsServiceMethodDescriptorSupplier("PlayLight"))
              .build();
        }
      }
    }
    return getPlayLightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.StopLightRequest,
      com.jjrobot.andy4.lightspb.LightsServicePB.StopLightResponse> getStopLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopLight",
      requestType = com.jjrobot.andy4.lightspb.LightsServicePB.StopLightRequest.class,
      responseType = com.jjrobot.andy4.lightspb.LightsServicePB.StopLightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.StopLightRequest,
      com.jjrobot.andy4.lightspb.LightsServicePB.StopLightResponse> getStopLightMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.StopLightRequest, com.jjrobot.andy4.lightspb.LightsServicePB.StopLightResponse> getStopLightMethod;
    if ((getStopLightMethod = LightsServiceGrpc.getStopLightMethod) == null) {
      synchronized (LightsServiceGrpc.class) {
        if ((getStopLightMethod = LightsServiceGrpc.getStopLightMethod) == null) {
          LightsServiceGrpc.getStopLightMethod = getStopLightMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.lightspb.LightsServicePB.StopLightRequest, com.jjrobot.andy4.lightspb.LightsServicePB.StopLightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopLight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.lightspb.LightsServicePB.StopLightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.lightspb.LightsServicePB.StopLightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LightsServiceMethodDescriptorSupplier("StopLight"))
              .build();
        }
      }
    }
    return getStopLightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.ListLightsRequest,
      com.jjrobot.andy4.lightspb.LightsServicePB.ListLightsResponse> getListLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLights",
      requestType = com.jjrobot.andy4.lightspb.LightsServicePB.ListLightsRequest.class,
      responseType = com.jjrobot.andy4.lightspb.LightsServicePB.ListLightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.ListLightsRequest,
      com.jjrobot.andy4.lightspb.LightsServicePB.ListLightsResponse> getListLightsMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.ListLightsRequest, com.jjrobot.andy4.lightspb.LightsServicePB.ListLightsResponse> getListLightsMethod;
    if ((getListLightsMethod = LightsServiceGrpc.getListLightsMethod) == null) {
      synchronized (LightsServiceGrpc.class) {
        if ((getListLightsMethod = LightsServiceGrpc.getListLightsMethod) == null) {
          LightsServiceGrpc.getListLightsMethod = getListLightsMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.lightspb.LightsServicePB.ListLightsRequest, com.jjrobot.andy4.lightspb.LightsServicePB.ListLightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.lightspb.LightsServicePB.ListLightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.lightspb.LightsServicePB.ListLightsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LightsServiceMethodDescriptorSupplier("ListLights"))
              .build();
        }
      }
    }
    return getListLightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.NewLightRequest,
      com.jjrobot.andy4.lightspb.LightsServicePB.NewLightResponse> getNewLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewLight",
      requestType = com.jjrobot.andy4.lightspb.LightsServicePB.NewLightRequest.class,
      responseType = com.jjrobot.andy4.lightspb.LightsServicePB.NewLightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.NewLightRequest,
      com.jjrobot.andy4.lightspb.LightsServicePB.NewLightResponse> getNewLightMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.NewLightRequest, com.jjrobot.andy4.lightspb.LightsServicePB.NewLightResponse> getNewLightMethod;
    if ((getNewLightMethod = LightsServiceGrpc.getNewLightMethod) == null) {
      synchronized (LightsServiceGrpc.class) {
        if ((getNewLightMethod = LightsServiceGrpc.getNewLightMethod) == null) {
          LightsServiceGrpc.getNewLightMethod = getNewLightMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.lightspb.LightsServicePB.NewLightRequest, com.jjrobot.andy4.lightspb.LightsServicePB.NewLightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewLight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.lightspb.LightsServicePB.NewLightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.lightspb.LightsServicePB.NewLightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LightsServiceMethodDescriptorSupplier("NewLight"))
              .build();
        }
      }
    }
    return getNewLightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.UpdateLightRequest,
      com.jjrobot.andy4.lightspb.LightsServicePB.UpdateLightResponse> getUpdateLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateLight",
      requestType = com.jjrobot.andy4.lightspb.LightsServicePB.UpdateLightRequest.class,
      responseType = com.jjrobot.andy4.lightspb.LightsServicePB.UpdateLightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.UpdateLightRequest,
      com.jjrobot.andy4.lightspb.LightsServicePB.UpdateLightResponse> getUpdateLightMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.UpdateLightRequest, com.jjrobot.andy4.lightspb.LightsServicePB.UpdateLightResponse> getUpdateLightMethod;
    if ((getUpdateLightMethod = LightsServiceGrpc.getUpdateLightMethod) == null) {
      synchronized (LightsServiceGrpc.class) {
        if ((getUpdateLightMethod = LightsServiceGrpc.getUpdateLightMethod) == null) {
          LightsServiceGrpc.getUpdateLightMethod = getUpdateLightMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.lightspb.LightsServicePB.UpdateLightRequest, com.jjrobot.andy4.lightspb.LightsServicePB.UpdateLightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateLight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.lightspb.LightsServicePB.UpdateLightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.lightspb.LightsServicePB.UpdateLightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LightsServiceMethodDescriptorSupplier("UpdateLight"))
              .build();
        }
      }
    }
    return getUpdateLightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.DeleteLightsRequest,
      com.jjrobot.andy4.lightspb.LightsServicePB.DeleteLightsResponse> getDeleteLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLights",
      requestType = com.jjrobot.andy4.lightspb.LightsServicePB.DeleteLightsRequest.class,
      responseType = com.jjrobot.andy4.lightspb.LightsServicePB.DeleteLightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.DeleteLightsRequest,
      com.jjrobot.andy4.lightspb.LightsServicePB.DeleteLightsResponse> getDeleteLightsMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.DeleteLightsRequest, com.jjrobot.andy4.lightspb.LightsServicePB.DeleteLightsResponse> getDeleteLightsMethod;
    if ((getDeleteLightsMethod = LightsServiceGrpc.getDeleteLightsMethod) == null) {
      synchronized (LightsServiceGrpc.class) {
        if ((getDeleteLightsMethod = LightsServiceGrpc.getDeleteLightsMethod) == null) {
          LightsServiceGrpc.getDeleteLightsMethod = getDeleteLightsMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.lightspb.LightsServicePB.DeleteLightsRequest, com.jjrobot.andy4.lightspb.LightsServicePB.DeleteLightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.lightspb.LightsServicePB.DeleteLightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.lightspb.LightsServicePB.DeleteLightsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LightsServiceMethodDescriptorSupplier("DeleteLights"))
              .build();
        }
      }
    }
    return getDeleteLightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.StateRequest,
      com.jjrobot.andy4.lightspb.LightsServicePB.StateResponse> getStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "State",
      requestType = com.jjrobot.andy4.lightspb.LightsServicePB.StateRequest.class,
      responseType = com.jjrobot.andy4.lightspb.LightsServicePB.StateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.StateRequest,
      com.jjrobot.andy4.lightspb.LightsServicePB.StateResponse> getStateMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.StateRequest, com.jjrobot.andy4.lightspb.LightsServicePB.StateResponse> getStateMethod;
    if ((getStateMethod = LightsServiceGrpc.getStateMethod) == null) {
      synchronized (LightsServiceGrpc.class) {
        if ((getStateMethod = LightsServiceGrpc.getStateMethod) == null) {
          LightsServiceGrpc.getStateMethod = getStateMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.lightspb.LightsServicePB.StateRequest, com.jjrobot.andy4.lightspb.LightsServicePB.StateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "State"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.lightspb.LightsServicePB.StateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.lightspb.LightsServicePB.StateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LightsServiceMethodDescriptorSupplier("State"))
              .build();
        }
      }
    }
    return getStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.SwitchRequest,
      com.jjrobot.andy4.lightspb.LightsServicePB.SwitchResponse> getSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Switch",
      requestType = com.jjrobot.andy4.lightspb.LightsServicePB.SwitchRequest.class,
      responseType = com.jjrobot.andy4.lightspb.LightsServicePB.SwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.SwitchRequest,
      com.jjrobot.andy4.lightspb.LightsServicePB.SwitchResponse> getSwitchMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.lightspb.LightsServicePB.SwitchRequest, com.jjrobot.andy4.lightspb.LightsServicePB.SwitchResponse> getSwitchMethod;
    if ((getSwitchMethod = LightsServiceGrpc.getSwitchMethod) == null) {
      synchronized (LightsServiceGrpc.class) {
        if ((getSwitchMethod = LightsServiceGrpc.getSwitchMethod) == null) {
          LightsServiceGrpc.getSwitchMethod = getSwitchMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.lightspb.LightsServicePB.SwitchRequest, com.jjrobot.andy4.lightspb.LightsServicePB.SwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Switch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.lightspb.LightsServicePB.SwitchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.lightspb.LightsServicePB.SwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LightsServiceMethodDescriptorSupplier("Switch"))
              .build();
        }
      }
    }
    return getSwitchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LightsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LightsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LightsServiceStub>() {
        @java.lang.Override
        public LightsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LightsServiceStub(channel, callOptions);
        }
      };
    return LightsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LightsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LightsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LightsServiceBlockingStub>() {
        @java.lang.Override
        public LightsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LightsServiceBlockingStub(channel, callOptions);
        }
      };
    return LightsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LightsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LightsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LightsServiceFutureStub>() {
        @java.lang.Override
        public LightsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LightsServiceFutureStub(channel, callOptions);
        }
      };
    return LightsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * lightsService.LightsService 灯光管理
   * 开发管理平台功能参考: http://10.10.10.2/lights/
   * </pre>
   */
  public static abstract class LightsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * PreviewLight 灯光预览
     * 灯光预览方法将根据配置的灯光数据生成目标数据写入硬件，
     * 修改灯光数据后请使用此方法进行预览并更新，
     * 否则PlayLight方法将继续使用之前的旧数据进行播放
     * </pre>
     */
    public void previewLight(com.jjrobot.andy4.lightspb.LightsServicePB.PreviewLightRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.PreviewLightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPreviewLightMethod(), responseObserver);
    }

    /**
     * <pre>
     * PlayLight 灯光播放
     * 播放前请通过PreviewLight生成或更新数据实例
     * </pre>
     */
    public void playLight(com.jjrobot.andy4.lightspb.LightsServicePB.PlayLightRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.PlayLightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPlayLightMethod(), responseObserver);
    }

    /**
     * <pre>
     * StopLight 灯光停止
     * </pre>
     */
    public void stopLight(com.jjrobot.andy4.lightspb.LightsServicePB.StopLightRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.StopLightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStopLightMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListLights 获取灯光列表
     * </pre>
     */
    public void listLights(com.jjrobot.andy4.lightspb.LightsServicePB.ListLightsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.ListLightsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListLightsMethod(), responseObserver);
    }

    /**
     * <pre>
     * NewLight 创建灯光
     * </pre>
     */
    public void newLight(com.jjrobot.andy4.lightspb.LightsServicePB.NewLightRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.NewLightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNewLightMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateLight 更新灯光
     * </pre>
     */
    public void updateLight(com.jjrobot.andy4.lightspb.LightsServicePB.UpdateLightRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.UpdateLightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateLightMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteLights 删除灯光列表
     * </pre>
     */
    public void deleteLights(com.jjrobot.andy4.lightspb.LightsServicePB.DeleteLightsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.DeleteLightsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteLightsMethod(), responseObserver);
    }

    /**
     * <pre>
     * State 获取当前灯光模块状态
     * </pre>
     */
    public void state(com.jjrobot.andy4.lightspb.LightsServicePB.StateRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.StateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Switch 控制灯光的开关
     * </pre>
     */
    public void switch_(com.jjrobot.andy4.lightspb.LightsServicePB.SwitchRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.SwitchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPreviewLightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.lightspb.LightsServicePB.PreviewLightRequest,
                com.jjrobot.andy4.lightspb.LightsServicePB.PreviewLightResponse>(
                  this, METHODID_PREVIEW_LIGHT)))
          .addMethod(
            getPlayLightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.lightspb.LightsServicePB.PlayLightRequest,
                com.jjrobot.andy4.lightspb.LightsServicePB.PlayLightResponse>(
                  this, METHODID_PLAY_LIGHT)))
          .addMethod(
            getStopLightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.lightspb.LightsServicePB.StopLightRequest,
                com.jjrobot.andy4.lightspb.LightsServicePB.StopLightResponse>(
                  this, METHODID_STOP_LIGHT)))
          .addMethod(
            getListLightsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.lightspb.LightsServicePB.ListLightsRequest,
                com.jjrobot.andy4.lightspb.LightsServicePB.ListLightsResponse>(
                  this, METHODID_LIST_LIGHTS)))
          .addMethod(
            getNewLightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.lightspb.LightsServicePB.NewLightRequest,
                com.jjrobot.andy4.lightspb.LightsServicePB.NewLightResponse>(
                  this, METHODID_NEW_LIGHT)))
          .addMethod(
            getUpdateLightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.lightspb.LightsServicePB.UpdateLightRequest,
                com.jjrobot.andy4.lightspb.LightsServicePB.UpdateLightResponse>(
                  this, METHODID_UPDATE_LIGHT)))
          .addMethod(
            getDeleteLightsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.lightspb.LightsServicePB.DeleteLightsRequest,
                com.jjrobot.andy4.lightspb.LightsServicePB.DeleteLightsResponse>(
                  this, METHODID_DELETE_LIGHTS)))
          .addMethod(
            getStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.lightspb.LightsServicePB.StateRequest,
                com.jjrobot.andy4.lightspb.LightsServicePB.StateResponse>(
                  this, METHODID_STATE)))
          .addMethod(
            getSwitchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.lightspb.LightsServicePB.SwitchRequest,
                com.jjrobot.andy4.lightspb.LightsServicePB.SwitchResponse>(
                  this, METHODID_SWITCH)))
          .build();
    }
  }

  /**
   * <pre>
   * lightsService.LightsService 灯光管理
   * 开发管理平台功能参考: http://10.10.10.2/lights/
   * </pre>
   */
  public static final class LightsServiceStub extends io.grpc.stub.AbstractAsyncStub<LightsServiceStub> {
    private LightsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LightsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * PreviewLight 灯光预览
     * 灯光预览方法将根据配置的灯光数据生成目标数据写入硬件，
     * 修改灯光数据后请使用此方法进行预览并更新，
     * 否则PlayLight方法将继续使用之前的旧数据进行播放
     * </pre>
     */
    public void previewLight(com.jjrobot.andy4.lightspb.LightsServicePB.PreviewLightRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.PreviewLightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPreviewLightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PlayLight 灯光播放
     * 播放前请通过PreviewLight生成或更新数据实例
     * </pre>
     */
    public void playLight(com.jjrobot.andy4.lightspb.LightsServicePB.PlayLightRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.PlayLightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPlayLightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StopLight 灯光停止
     * </pre>
     */
    public void stopLight(com.jjrobot.andy4.lightspb.LightsServicePB.StopLightRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.StopLightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopLightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListLights 获取灯光列表
     * </pre>
     */
    public void listLights(com.jjrobot.andy4.lightspb.LightsServicePB.ListLightsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.ListLightsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListLightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NewLight 创建灯光
     * </pre>
     */
    public void newLight(com.jjrobot.andy4.lightspb.LightsServicePB.NewLightRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.NewLightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNewLightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateLight 更新灯光
     * </pre>
     */
    public void updateLight(com.jjrobot.andy4.lightspb.LightsServicePB.UpdateLightRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.UpdateLightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateLightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteLights 删除灯光列表
     * </pre>
     */
    public void deleteLights(com.jjrobot.andy4.lightspb.LightsServicePB.DeleteLightsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.DeleteLightsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteLightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * State 获取当前灯光模块状态
     * </pre>
     */
    public void state(com.jjrobot.andy4.lightspb.LightsServicePB.StateRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.StateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Switch 控制灯光的开关
     * </pre>
     */
    public void switch_(com.jjrobot.andy4.lightspb.LightsServicePB.SwitchRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.SwitchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * lightsService.LightsService 灯光管理
   * 开发管理平台功能参考: http://10.10.10.2/lights/
   * </pre>
   */
  public static final class LightsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LightsServiceBlockingStub> {
    private LightsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LightsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * PreviewLight 灯光预览
     * 灯光预览方法将根据配置的灯光数据生成目标数据写入硬件，
     * 修改灯光数据后请使用此方法进行预览并更新，
     * 否则PlayLight方法将继续使用之前的旧数据进行播放
     * </pre>
     */
    public com.jjrobot.andy4.lightspb.LightsServicePB.PreviewLightResponse previewLight(com.jjrobot.andy4.lightspb.LightsServicePB.PreviewLightRequest request) {
      return blockingUnaryCall(
          getChannel(), getPreviewLightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PlayLight 灯光播放
     * 播放前请通过PreviewLight生成或更新数据实例
     * </pre>
     */
    public com.jjrobot.andy4.lightspb.LightsServicePB.PlayLightResponse playLight(com.jjrobot.andy4.lightspb.LightsServicePB.PlayLightRequest request) {
      return blockingUnaryCall(
          getChannel(), getPlayLightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StopLight 灯光停止
     * </pre>
     */
    public com.jjrobot.andy4.lightspb.LightsServicePB.StopLightResponse stopLight(com.jjrobot.andy4.lightspb.LightsServicePB.StopLightRequest request) {
      return blockingUnaryCall(
          getChannel(), getStopLightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListLights 获取灯光列表
     * </pre>
     */
    public com.jjrobot.andy4.lightspb.LightsServicePB.ListLightsResponse listLights(com.jjrobot.andy4.lightspb.LightsServicePB.ListLightsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListLightsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NewLight 创建灯光
     * </pre>
     */
    public com.jjrobot.andy4.lightspb.LightsServicePB.NewLightResponse newLight(com.jjrobot.andy4.lightspb.LightsServicePB.NewLightRequest request) {
      return blockingUnaryCall(
          getChannel(), getNewLightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateLight 更新灯光
     * </pre>
     */
    public com.jjrobot.andy4.lightspb.LightsServicePB.UpdateLightResponse updateLight(com.jjrobot.andy4.lightspb.LightsServicePB.UpdateLightRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateLightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteLights 删除灯光列表
     * </pre>
     */
    public com.jjrobot.andy4.lightspb.LightsServicePB.DeleteLightsResponse deleteLights(com.jjrobot.andy4.lightspb.LightsServicePB.DeleteLightsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteLightsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * State 获取当前灯光模块状态
     * </pre>
     */
    public com.jjrobot.andy4.lightspb.LightsServicePB.StateResponse state(com.jjrobot.andy4.lightspb.LightsServicePB.StateRequest request) {
      return blockingUnaryCall(
          getChannel(), getStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Switch 控制灯光的开关
     * </pre>
     */
    public com.jjrobot.andy4.lightspb.LightsServicePB.SwitchResponse switch_(com.jjrobot.andy4.lightspb.LightsServicePB.SwitchRequest request) {
      return blockingUnaryCall(
          getChannel(), getSwitchMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * lightsService.LightsService 灯光管理
   * 开发管理平台功能参考: http://10.10.10.2/lights/
   * </pre>
   */
  public static final class LightsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LightsServiceFutureStub> {
    private LightsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LightsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * PreviewLight 灯光预览
     * 灯光预览方法将根据配置的灯光数据生成目标数据写入硬件，
     * 修改灯光数据后请使用此方法进行预览并更新，
     * 否则PlayLight方法将继续使用之前的旧数据进行播放
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.lightspb.LightsServicePB.PreviewLightResponse> previewLight(
        com.jjrobot.andy4.lightspb.LightsServicePB.PreviewLightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPreviewLightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PlayLight 灯光播放
     * 播放前请通过PreviewLight生成或更新数据实例
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.lightspb.LightsServicePB.PlayLightResponse> playLight(
        com.jjrobot.andy4.lightspb.LightsServicePB.PlayLightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPlayLightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StopLight 灯光停止
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.lightspb.LightsServicePB.StopLightResponse> stopLight(
        com.jjrobot.andy4.lightspb.LightsServicePB.StopLightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStopLightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListLights 获取灯光列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.lightspb.LightsServicePB.ListLightsResponse> listLights(
        com.jjrobot.andy4.lightspb.LightsServicePB.ListLightsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListLightsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NewLight 创建灯光
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.lightspb.LightsServicePB.NewLightResponse> newLight(
        com.jjrobot.andy4.lightspb.LightsServicePB.NewLightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNewLightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateLight 更新灯光
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.lightspb.LightsServicePB.UpdateLightResponse> updateLight(
        com.jjrobot.andy4.lightspb.LightsServicePB.UpdateLightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateLightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteLights 删除灯光列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.lightspb.LightsServicePB.DeleteLightsResponse> deleteLights(
        com.jjrobot.andy4.lightspb.LightsServicePB.DeleteLightsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteLightsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * State 获取当前灯光模块状态
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.lightspb.LightsServicePB.StateResponse> state(
        com.jjrobot.andy4.lightspb.LightsServicePB.StateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Switch 控制灯光的开关
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.lightspb.LightsServicePB.SwitchResponse> switch_(
        com.jjrobot.andy4.lightspb.LightsServicePB.SwitchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PREVIEW_LIGHT = 0;
  private static final int METHODID_PLAY_LIGHT = 1;
  private static final int METHODID_STOP_LIGHT = 2;
  private static final int METHODID_LIST_LIGHTS = 3;
  private static final int METHODID_NEW_LIGHT = 4;
  private static final int METHODID_UPDATE_LIGHT = 5;
  private static final int METHODID_DELETE_LIGHTS = 6;
  private static final int METHODID_STATE = 7;
  private static final int METHODID_SWITCH = 8;

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
          serviceImpl.previewLight((com.jjrobot.andy4.lightspb.LightsServicePB.PreviewLightRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.PreviewLightResponse>) responseObserver);
          break;
        case METHODID_PLAY_LIGHT:
          serviceImpl.playLight((com.jjrobot.andy4.lightspb.LightsServicePB.PlayLightRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.PlayLightResponse>) responseObserver);
          break;
        case METHODID_STOP_LIGHT:
          serviceImpl.stopLight((com.jjrobot.andy4.lightspb.LightsServicePB.StopLightRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.StopLightResponse>) responseObserver);
          break;
        case METHODID_LIST_LIGHTS:
          serviceImpl.listLights((com.jjrobot.andy4.lightspb.LightsServicePB.ListLightsRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.ListLightsResponse>) responseObserver);
          break;
        case METHODID_NEW_LIGHT:
          serviceImpl.newLight((com.jjrobot.andy4.lightspb.LightsServicePB.NewLightRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.NewLightResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LIGHT:
          serviceImpl.updateLight((com.jjrobot.andy4.lightspb.LightsServicePB.UpdateLightRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.UpdateLightResponse>) responseObserver);
          break;
        case METHODID_DELETE_LIGHTS:
          serviceImpl.deleteLights((com.jjrobot.andy4.lightspb.LightsServicePB.DeleteLightsRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.DeleteLightsResponse>) responseObserver);
          break;
        case METHODID_STATE:
          serviceImpl.state((com.jjrobot.andy4.lightspb.LightsServicePB.StateRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.StateResponse>) responseObserver);
          break;
        case METHODID_SWITCH:
          serviceImpl.switch_((com.jjrobot.andy4.lightspb.LightsServicePB.SwitchRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.lightspb.LightsServicePB.SwitchResponse>) responseObserver);
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
      return com.jjrobot.andy4.lightspb.LightsServicePB.getDescriptor();
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
              .addMethod(getStateMethod())
              .addMethod(getSwitchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
