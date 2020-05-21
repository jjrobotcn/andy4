package com.jjrobot.andy4.speechpb;

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
 * speechService.SpeechService 语音服务
 * 开发管理平台功能参考: http://10.10.10.2/speech
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.1-SNAPSHOT)",
    comments = "Source: speech.proto")
public final class SpeechServiceGrpc {

  private SpeechServiceGrpc() {}

  public static final String SERVICE_NAME = "speechService.SpeechService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.speechpb.SpeechServicePB.ListenSpeechEventRequest,
      com.jjrobot.andy4.speechpb.SpeechServicePB.ListenSpeechEventResponse> getListenSpeechEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListenSpeechEvent",
      requestType = com.jjrobot.andy4.speechpb.SpeechServicePB.ListenSpeechEventRequest.class,
      responseType = com.jjrobot.andy4.speechpb.SpeechServicePB.ListenSpeechEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.speechpb.SpeechServicePB.ListenSpeechEventRequest,
      com.jjrobot.andy4.speechpb.SpeechServicePB.ListenSpeechEventResponse> getListenSpeechEventMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.speechpb.SpeechServicePB.ListenSpeechEventRequest, com.jjrobot.andy4.speechpb.SpeechServicePB.ListenSpeechEventResponse> getListenSpeechEventMethod;
    if ((getListenSpeechEventMethod = SpeechServiceGrpc.getListenSpeechEventMethod) == null) {
      synchronized (SpeechServiceGrpc.class) {
        if ((getListenSpeechEventMethod = SpeechServiceGrpc.getListenSpeechEventMethod) == null) {
          SpeechServiceGrpc.getListenSpeechEventMethod = getListenSpeechEventMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.speechpb.SpeechServicePB.ListenSpeechEventRequest, com.jjrobot.andy4.speechpb.SpeechServicePB.ListenSpeechEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListenSpeechEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.speechpb.SpeechServicePB.ListenSpeechEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.speechpb.SpeechServicePB.ListenSpeechEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SpeechServiceMethodDescriptorSupplier("ListenSpeechEvent"))
              .build();
        }
      }
    }
    return getListenSpeechEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.speechpb.SpeechServicePB.TextToSpeechRequest,
      com.jjrobot.andy4.speechpb.SpeechServicePB.TextToSpeechResponse> getTextToSpeechMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TextToSpeech",
      requestType = com.jjrobot.andy4.speechpb.SpeechServicePB.TextToSpeechRequest.class,
      responseType = com.jjrobot.andy4.speechpb.SpeechServicePB.TextToSpeechResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.speechpb.SpeechServicePB.TextToSpeechRequest,
      com.jjrobot.andy4.speechpb.SpeechServicePB.TextToSpeechResponse> getTextToSpeechMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.speechpb.SpeechServicePB.TextToSpeechRequest, com.jjrobot.andy4.speechpb.SpeechServicePB.TextToSpeechResponse> getTextToSpeechMethod;
    if ((getTextToSpeechMethod = SpeechServiceGrpc.getTextToSpeechMethod) == null) {
      synchronized (SpeechServiceGrpc.class) {
        if ((getTextToSpeechMethod = SpeechServiceGrpc.getTextToSpeechMethod) == null) {
          SpeechServiceGrpc.getTextToSpeechMethod = getTextToSpeechMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.speechpb.SpeechServicePB.TextToSpeechRequest, com.jjrobot.andy4.speechpb.SpeechServicePB.TextToSpeechResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TextToSpeech"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.speechpb.SpeechServicePB.TextToSpeechRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.speechpb.SpeechServicePB.TextToSpeechResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SpeechServiceMethodDescriptorSupplier("TextToSpeech"))
              .build();
        }
      }
    }
    return getTextToSpeechMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.speechpb.SpeechServicePB.SpeechStopRequest,
      com.jjrobot.andy4.speechpb.SpeechServicePB.SpeechStopResponse> getSpeechStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpeechStop",
      requestType = com.jjrobot.andy4.speechpb.SpeechServicePB.SpeechStopRequest.class,
      responseType = com.jjrobot.andy4.speechpb.SpeechServicePB.SpeechStopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.speechpb.SpeechServicePB.SpeechStopRequest,
      com.jjrobot.andy4.speechpb.SpeechServicePB.SpeechStopResponse> getSpeechStopMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.speechpb.SpeechServicePB.SpeechStopRequest, com.jjrobot.andy4.speechpb.SpeechServicePB.SpeechStopResponse> getSpeechStopMethod;
    if ((getSpeechStopMethod = SpeechServiceGrpc.getSpeechStopMethod) == null) {
      synchronized (SpeechServiceGrpc.class) {
        if ((getSpeechStopMethod = SpeechServiceGrpc.getSpeechStopMethod) == null) {
          SpeechServiceGrpc.getSpeechStopMethod = getSpeechStopMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.speechpb.SpeechServicePB.SpeechStopRequest, com.jjrobot.andy4.speechpb.SpeechServicePB.SpeechStopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SpeechStop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.speechpb.SpeechServicePB.SpeechStopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.speechpb.SpeechServicePB.SpeechStopResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SpeechServiceMethodDescriptorSupplier("SpeechStop"))
              .build();
        }
      }
    }
    return getSpeechStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.speechpb.SpeechServicePB.WakeUpRequest,
      com.jjrobot.andy4.speechpb.SpeechServicePB.WakeUpResponse> getWakeUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WakeUp",
      requestType = com.jjrobot.andy4.speechpb.SpeechServicePB.WakeUpRequest.class,
      responseType = com.jjrobot.andy4.speechpb.SpeechServicePB.WakeUpResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.speechpb.SpeechServicePB.WakeUpRequest,
      com.jjrobot.andy4.speechpb.SpeechServicePB.WakeUpResponse> getWakeUpMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.speechpb.SpeechServicePB.WakeUpRequest, com.jjrobot.andy4.speechpb.SpeechServicePB.WakeUpResponse> getWakeUpMethod;
    if ((getWakeUpMethod = SpeechServiceGrpc.getWakeUpMethod) == null) {
      synchronized (SpeechServiceGrpc.class) {
        if ((getWakeUpMethod = SpeechServiceGrpc.getWakeUpMethod) == null) {
          SpeechServiceGrpc.getWakeUpMethod = getWakeUpMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.speechpb.SpeechServicePB.WakeUpRequest, com.jjrobot.andy4.speechpb.SpeechServicePB.WakeUpResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WakeUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.speechpb.SpeechServicePB.WakeUpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.speechpb.SpeechServicePB.WakeUpResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SpeechServiceMethodDescriptorSupplier("WakeUp"))
              .build();
        }
      }
    }
    return getWakeUpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.speechpb.SpeechServicePB.HibernateRequest,
      com.jjrobot.andy4.speechpb.SpeechServicePB.HibernateResponse> getHibernateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Hibernate",
      requestType = com.jjrobot.andy4.speechpb.SpeechServicePB.HibernateRequest.class,
      responseType = com.jjrobot.andy4.speechpb.SpeechServicePB.HibernateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.speechpb.SpeechServicePB.HibernateRequest,
      com.jjrobot.andy4.speechpb.SpeechServicePB.HibernateResponse> getHibernateMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.speechpb.SpeechServicePB.HibernateRequest, com.jjrobot.andy4.speechpb.SpeechServicePB.HibernateResponse> getHibernateMethod;
    if ((getHibernateMethod = SpeechServiceGrpc.getHibernateMethod) == null) {
      synchronized (SpeechServiceGrpc.class) {
        if ((getHibernateMethod = SpeechServiceGrpc.getHibernateMethod) == null) {
          SpeechServiceGrpc.getHibernateMethod = getHibernateMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.speechpb.SpeechServicePB.HibernateRequest, com.jjrobot.andy4.speechpb.SpeechServicePB.HibernateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Hibernate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.speechpb.SpeechServicePB.HibernateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.speechpb.SpeechServicePB.HibernateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SpeechServiceMethodDescriptorSupplier("Hibernate"))
              .build();
        }
      }
    }
    return getHibernateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.speechpb.SpeechServicePB.SetVoiceVolumeRequest,
      com.jjrobot.andy4.speechpb.SpeechServicePB.SetVoiceVolumeResponse> getSetVoiceVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetVoiceVolume",
      requestType = com.jjrobot.andy4.speechpb.SpeechServicePB.SetVoiceVolumeRequest.class,
      responseType = com.jjrobot.andy4.speechpb.SpeechServicePB.SetVoiceVolumeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.speechpb.SpeechServicePB.SetVoiceVolumeRequest,
      com.jjrobot.andy4.speechpb.SpeechServicePB.SetVoiceVolumeResponse> getSetVoiceVolumeMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.speechpb.SpeechServicePB.SetVoiceVolumeRequest, com.jjrobot.andy4.speechpb.SpeechServicePB.SetVoiceVolumeResponse> getSetVoiceVolumeMethod;
    if ((getSetVoiceVolumeMethod = SpeechServiceGrpc.getSetVoiceVolumeMethod) == null) {
      synchronized (SpeechServiceGrpc.class) {
        if ((getSetVoiceVolumeMethod = SpeechServiceGrpc.getSetVoiceVolumeMethod) == null) {
          SpeechServiceGrpc.getSetVoiceVolumeMethod = getSetVoiceVolumeMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.speechpb.SpeechServicePB.SetVoiceVolumeRequest, com.jjrobot.andy4.speechpb.SpeechServicePB.SetVoiceVolumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetVoiceVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.speechpb.SpeechServicePB.SetVoiceVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.speechpb.SpeechServicePB.SetVoiceVolumeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SpeechServiceMethodDescriptorSupplier("SetVoiceVolume"))
              .build();
        }
      }
    }
    return getSetVoiceVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.speechpb.SpeechServicePB.GetVoiceVolumeRequest,
      com.jjrobot.andy4.speechpb.SpeechServicePB.GetVoiceVolumeResponse> getGetVoiceVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVoiceVolume",
      requestType = com.jjrobot.andy4.speechpb.SpeechServicePB.GetVoiceVolumeRequest.class,
      responseType = com.jjrobot.andy4.speechpb.SpeechServicePB.GetVoiceVolumeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.speechpb.SpeechServicePB.GetVoiceVolumeRequest,
      com.jjrobot.andy4.speechpb.SpeechServicePB.GetVoiceVolumeResponse> getGetVoiceVolumeMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.speechpb.SpeechServicePB.GetVoiceVolumeRequest, com.jjrobot.andy4.speechpb.SpeechServicePB.GetVoiceVolumeResponse> getGetVoiceVolumeMethod;
    if ((getGetVoiceVolumeMethod = SpeechServiceGrpc.getGetVoiceVolumeMethod) == null) {
      synchronized (SpeechServiceGrpc.class) {
        if ((getGetVoiceVolumeMethod = SpeechServiceGrpc.getGetVoiceVolumeMethod) == null) {
          SpeechServiceGrpc.getGetVoiceVolumeMethod = getGetVoiceVolumeMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.speechpb.SpeechServicePB.GetVoiceVolumeRequest, com.jjrobot.andy4.speechpb.SpeechServicePB.GetVoiceVolumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVoiceVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.speechpb.SpeechServicePB.GetVoiceVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.speechpb.SpeechServicePB.GetVoiceVolumeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SpeechServiceMethodDescriptorSupplier("GetVoiceVolume"))
              .build();
        }
      }
    }
    return getGetVoiceVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.speechpb.SpeechServicePB.SetParamsRequest,
      com.jjrobot.andy4.speechpb.SpeechServicePB.SetParamsResponse> getSetParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetParams",
      requestType = com.jjrobot.andy4.speechpb.SpeechServicePB.SetParamsRequest.class,
      responseType = com.jjrobot.andy4.speechpb.SpeechServicePB.SetParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.speechpb.SpeechServicePB.SetParamsRequest,
      com.jjrobot.andy4.speechpb.SpeechServicePB.SetParamsResponse> getSetParamsMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.speechpb.SpeechServicePB.SetParamsRequest, com.jjrobot.andy4.speechpb.SpeechServicePB.SetParamsResponse> getSetParamsMethod;
    if ((getSetParamsMethod = SpeechServiceGrpc.getSetParamsMethod) == null) {
      synchronized (SpeechServiceGrpc.class) {
        if ((getSetParamsMethod = SpeechServiceGrpc.getSetParamsMethod) == null) {
          SpeechServiceGrpc.getSetParamsMethod = getSetParamsMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.speechpb.SpeechServicePB.SetParamsRequest, com.jjrobot.andy4.speechpb.SpeechServicePB.SetParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.speechpb.SpeechServicePB.SetParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.speechpb.SpeechServicePB.SetParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SpeechServiceMethodDescriptorSupplier("SetParams"))
              .build();
        }
      }
    }
    return getSetParamsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SpeechServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpeechServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpeechServiceStub>() {
        @java.lang.Override
        public SpeechServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpeechServiceStub(channel, callOptions);
        }
      };
    return SpeechServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpeechServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpeechServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpeechServiceBlockingStub>() {
        @java.lang.Override
        public SpeechServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpeechServiceBlockingStub(channel, callOptions);
        }
      };
    return SpeechServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SpeechServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpeechServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpeechServiceFutureStub>() {
        @java.lang.Override
        public SpeechServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpeechServiceFutureStub(channel, callOptions);
        }
      };
    return SpeechServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * speechService.SpeechService 语音服务
   * 开发管理平台功能参考: http://10.10.10.2/speech
   * </pre>
   */
  public static abstract class SpeechServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * ListenSpeechEvent 监听语音事件
     * 语音内容识别支持单句多次返回，请留意完整句标识
     * 详见SpeechEvent
     * </pre>
     */
    public void listenSpeechEvent(com.jjrobot.andy4.speechpb.SpeechServicePB.ListenSpeechEventRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.speechpb.SpeechServicePB.ListenSpeechEventResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListenSpeechEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * TextToSpeech 文本转语音
     * 新的TTS请求将立即中断当前语音，
     * 需要结束后播放新语音应监听TTS_END事件后再进行新的请求。
     * TTS方法支持在休眠状态下调用
     * </pre>
     */
    public void textToSpeech(com.jjrobot.andy4.speechpb.SpeechServicePB.TextToSpeechRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.speechpb.SpeechServicePB.TextToSpeechResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTextToSpeechMethod(), responseObserver);
    }

    /**
     * <pre>
     * SpeechStop 中止语音
     * 通过此方法进行打断不会产生TTS_END事件
     * </pre>
     */
    public void speechStop(com.jjrobot.andy4.speechpb.SpeechServicePB.SpeechStopRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.speechpb.SpeechServicePB.SpeechStopResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSpeechStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * WakeUp 唤醒
     * 唤醒后开始监听语音输入
     * </pre>
     */
    public void wakeUp(com.jjrobot.andy4.speechpb.SpeechServicePB.WakeUpRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.speechpb.SpeechServicePB.WakeUpResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWakeUpMethod(), responseObserver);
    }

    /**
     * <pre>
     * Hibernate 休眠
     * 休眠后不再监听语音输入
     * </pre>
     */
    public void hibernate(com.jjrobot.andy4.speechpb.SpeechServicePB.HibernateRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.speechpb.SpeechServicePB.HibernateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHibernateMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetVoiceVolume 设置语音音量
     * </pre>
     */
    public void setVoiceVolume(com.jjrobot.andy4.speechpb.SpeechServicePB.SetVoiceVolumeRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.speechpb.SpeechServicePB.SetVoiceVolumeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetVoiceVolumeMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetVoiceVolume 查询语音音量
     * </pre>
     */
    public void getVoiceVolume(com.jjrobot.andy4.speechpb.SpeechServicePB.GetVoiceVolumeRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.speechpb.SpeechServicePB.GetVoiceVolumeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVoiceVolumeMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetParams 配置参数
     * 此方法通常为开发用户在开发过程中进行一次性配置
     * 不建议不了解该配置文件的用户进行参数设置
     * AIUI模块参数配置参考:
     *    https://doc.iflyos.cn/aiui/sdk/smart_doc/config_file.html#配置文件
     * </pre>
     */
    public void setParams(com.jjrobot.andy4.speechpb.SpeechServicePB.SetParamsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.speechpb.SpeechServicePB.SetParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetParamsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListenSpeechEventMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jjrobot.andy4.speechpb.SpeechServicePB.ListenSpeechEventRequest,
                com.jjrobot.andy4.speechpb.SpeechServicePB.ListenSpeechEventResponse>(
                  this, METHODID_LISTEN_SPEECH_EVENT)))
          .addMethod(
            getTextToSpeechMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.speechpb.SpeechServicePB.TextToSpeechRequest,
                com.jjrobot.andy4.speechpb.SpeechServicePB.TextToSpeechResponse>(
                  this, METHODID_TEXT_TO_SPEECH)))
          .addMethod(
            getSpeechStopMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.speechpb.SpeechServicePB.SpeechStopRequest,
                com.jjrobot.andy4.speechpb.SpeechServicePB.SpeechStopResponse>(
                  this, METHODID_SPEECH_STOP)))
          .addMethod(
            getWakeUpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.speechpb.SpeechServicePB.WakeUpRequest,
                com.jjrobot.andy4.speechpb.SpeechServicePB.WakeUpResponse>(
                  this, METHODID_WAKE_UP)))
          .addMethod(
            getHibernateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.speechpb.SpeechServicePB.HibernateRequest,
                com.jjrobot.andy4.speechpb.SpeechServicePB.HibernateResponse>(
                  this, METHODID_HIBERNATE)))
          .addMethod(
            getSetVoiceVolumeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.speechpb.SpeechServicePB.SetVoiceVolumeRequest,
                com.jjrobot.andy4.speechpb.SpeechServicePB.SetVoiceVolumeResponse>(
                  this, METHODID_SET_VOICE_VOLUME)))
          .addMethod(
            getGetVoiceVolumeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.speechpb.SpeechServicePB.GetVoiceVolumeRequest,
                com.jjrobot.andy4.speechpb.SpeechServicePB.GetVoiceVolumeResponse>(
                  this, METHODID_GET_VOICE_VOLUME)))
          .addMethod(
            getSetParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.speechpb.SpeechServicePB.SetParamsRequest,
                com.jjrobot.andy4.speechpb.SpeechServicePB.SetParamsResponse>(
                  this, METHODID_SET_PARAMS)))
          .build();
    }
  }

  /**
   * <pre>
   * speechService.SpeechService 语音服务
   * 开发管理平台功能参考: http://10.10.10.2/speech
   * </pre>
   */
  public static final class SpeechServiceStub extends io.grpc.stub.AbstractAsyncStub<SpeechServiceStub> {
    private SpeechServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeechServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpeechServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListenSpeechEvent 监听语音事件
     * 语音内容识别支持单句多次返回，请留意完整句标识
     * 详见SpeechEvent
     * </pre>
     */
    public void listenSpeechEvent(com.jjrobot.andy4.speechpb.SpeechServicePB.ListenSpeechEventRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.speechpb.SpeechServicePB.ListenSpeechEventResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListenSpeechEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TextToSpeech 文本转语音
     * 新的TTS请求将立即中断当前语音，
     * 需要结束后播放新语音应监听TTS_END事件后再进行新的请求。
     * TTS方法支持在休眠状态下调用
     * </pre>
     */
    public void textToSpeech(com.jjrobot.andy4.speechpb.SpeechServicePB.TextToSpeechRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.speechpb.SpeechServicePB.TextToSpeechResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTextToSpeechMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SpeechStop 中止语音
     * 通过此方法进行打断不会产生TTS_END事件
     * </pre>
     */
    public void speechStop(com.jjrobot.andy4.speechpb.SpeechServicePB.SpeechStopRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.speechpb.SpeechServicePB.SpeechStopResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSpeechStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WakeUp 唤醒
     * 唤醒后开始监听语音输入
     * </pre>
     */
    public void wakeUp(com.jjrobot.andy4.speechpb.SpeechServicePB.WakeUpRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.speechpb.SpeechServicePB.WakeUpResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWakeUpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Hibernate 休眠
     * 休眠后不再监听语音输入
     * </pre>
     */
    public void hibernate(com.jjrobot.andy4.speechpb.SpeechServicePB.HibernateRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.speechpb.SpeechServicePB.HibernateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHibernateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetVoiceVolume 设置语音音量
     * </pre>
     */
    public void setVoiceVolume(com.jjrobot.andy4.speechpb.SpeechServicePB.SetVoiceVolumeRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.speechpb.SpeechServicePB.SetVoiceVolumeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetVoiceVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetVoiceVolume 查询语音音量
     * </pre>
     */
    public void getVoiceVolume(com.jjrobot.andy4.speechpb.SpeechServicePB.GetVoiceVolumeRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.speechpb.SpeechServicePB.GetVoiceVolumeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVoiceVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetParams 配置参数
     * 此方法通常为开发用户在开发过程中进行一次性配置
     * 不建议不了解该配置文件的用户进行参数设置
     * AIUI模块参数配置参考:
     *    https://doc.iflyos.cn/aiui/sdk/smart_doc/config_file.html#配置文件
     * </pre>
     */
    public void setParams(com.jjrobot.andy4.speechpb.SpeechServicePB.SetParamsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.speechpb.SpeechServicePB.SetParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * speechService.SpeechService 语音服务
   * 开发管理平台功能参考: http://10.10.10.2/speech
   * </pre>
   */
  public static final class SpeechServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SpeechServiceBlockingStub> {
    private SpeechServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeechServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpeechServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListenSpeechEvent 监听语音事件
     * 语音内容识别支持单句多次返回，请留意完整句标识
     * 详见SpeechEvent
     * </pre>
     */
    public java.util.Iterator<com.jjrobot.andy4.speechpb.SpeechServicePB.ListenSpeechEventResponse> listenSpeechEvent(
        com.jjrobot.andy4.speechpb.SpeechServicePB.ListenSpeechEventRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListenSpeechEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TextToSpeech 文本转语音
     * 新的TTS请求将立即中断当前语音，
     * 需要结束后播放新语音应监听TTS_END事件后再进行新的请求。
     * TTS方法支持在休眠状态下调用
     * </pre>
     */
    public com.jjrobot.andy4.speechpb.SpeechServicePB.TextToSpeechResponse textToSpeech(com.jjrobot.andy4.speechpb.SpeechServicePB.TextToSpeechRequest request) {
      return blockingUnaryCall(
          getChannel(), getTextToSpeechMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SpeechStop 中止语音
     * 通过此方法进行打断不会产生TTS_END事件
     * </pre>
     */
    public com.jjrobot.andy4.speechpb.SpeechServicePB.SpeechStopResponse speechStop(com.jjrobot.andy4.speechpb.SpeechServicePB.SpeechStopRequest request) {
      return blockingUnaryCall(
          getChannel(), getSpeechStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WakeUp 唤醒
     * 唤醒后开始监听语音输入
     * </pre>
     */
    public com.jjrobot.andy4.speechpb.SpeechServicePB.WakeUpResponse wakeUp(com.jjrobot.andy4.speechpb.SpeechServicePB.WakeUpRequest request) {
      return blockingUnaryCall(
          getChannel(), getWakeUpMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Hibernate 休眠
     * 休眠后不再监听语音输入
     * </pre>
     */
    public com.jjrobot.andy4.speechpb.SpeechServicePB.HibernateResponse hibernate(com.jjrobot.andy4.speechpb.SpeechServicePB.HibernateRequest request) {
      return blockingUnaryCall(
          getChannel(), getHibernateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetVoiceVolume 设置语音音量
     * </pre>
     */
    public com.jjrobot.andy4.speechpb.SpeechServicePB.SetVoiceVolumeResponse setVoiceVolume(com.jjrobot.andy4.speechpb.SpeechServicePB.SetVoiceVolumeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetVoiceVolumeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetVoiceVolume 查询语音音量
     * </pre>
     */
    public com.jjrobot.andy4.speechpb.SpeechServicePB.GetVoiceVolumeResponse getVoiceVolume(com.jjrobot.andy4.speechpb.SpeechServicePB.GetVoiceVolumeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVoiceVolumeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetParams 配置参数
     * 此方法通常为开发用户在开发过程中进行一次性配置
     * 不建议不了解该配置文件的用户进行参数设置
     * AIUI模块参数配置参考:
     *    https://doc.iflyos.cn/aiui/sdk/smart_doc/config_file.html#配置文件
     * </pre>
     */
    public com.jjrobot.andy4.speechpb.SpeechServicePB.SetParamsResponse setParams(com.jjrobot.andy4.speechpb.SpeechServicePB.SetParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * speechService.SpeechService 语音服务
   * 开发管理平台功能参考: http://10.10.10.2/speech
   * </pre>
   */
  public static final class SpeechServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SpeechServiceFutureStub> {
    private SpeechServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeechServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpeechServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * TextToSpeech 文本转语音
     * 新的TTS请求将立即中断当前语音，
     * 需要结束后播放新语音应监听TTS_END事件后再进行新的请求。
     * TTS方法支持在休眠状态下调用
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.speechpb.SpeechServicePB.TextToSpeechResponse> textToSpeech(
        com.jjrobot.andy4.speechpb.SpeechServicePB.TextToSpeechRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTextToSpeechMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SpeechStop 中止语音
     * 通过此方法进行打断不会产生TTS_END事件
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.speechpb.SpeechServicePB.SpeechStopResponse> speechStop(
        com.jjrobot.andy4.speechpb.SpeechServicePB.SpeechStopRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSpeechStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WakeUp 唤醒
     * 唤醒后开始监听语音输入
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.speechpb.SpeechServicePB.WakeUpResponse> wakeUp(
        com.jjrobot.andy4.speechpb.SpeechServicePB.WakeUpRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWakeUpMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Hibernate 休眠
     * 休眠后不再监听语音输入
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.speechpb.SpeechServicePB.HibernateResponse> hibernate(
        com.jjrobot.andy4.speechpb.SpeechServicePB.HibernateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHibernateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetVoiceVolume 设置语音音量
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.speechpb.SpeechServicePB.SetVoiceVolumeResponse> setVoiceVolume(
        com.jjrobot.andy4.speechpb.SpeechServicePB.SetVoiceVolumeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetVoiceVolumeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetVoiceVolume 查询语音音量
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.speechpb.SpeechServicePB.GetVoiceVolumeResponse> getVoiceVolume(
        com.jjrobot.andy4.speechpb.SpeechServicePB.GetVoiceVolumeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVoiceVolumeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetParams 配置参数
     * 此方法通常为开发用户在开发过程中进行一次性配置
     * 不建议不了解该配置文件的用户进行参数设置
     * AIUI模块参数配置参考:
     *    https://doc.iflyos.cn/aiui/sdk/smart_doc/config_file.html#配置文件
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.speechpb.SpeechServicePB.SetParamsResponse> setParams(
        com.jjrobot.andy4.speechpb.SpeechServicePB.SetParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LISTEN_SPEECH_EVENT = 0;
  private static final int METHODID_TEXT_TO_SPEECH = 1;
  private static final int METHODID_SPEECH_STOP = 2;
  private static final int METHODID_WAKE_UP = 3;
  private static final int METHODID_HIBERNATE = 4;
  private static final int METHODID_SET_VOICE_VOLUME = 5;
  private static final int METHODID_GET_VOICE_VOLUME = 6;
  private static final int METHODID_SET_PARAMS = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SpeechServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SpeechServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LISTEN_SPEECH_EVENT:
          serviceImpl.listenSpeechEvent((com.jjrobot.andy4.speechpb.SpeechServicePB.ListenSpeechEventRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.speechpb.SpeechServicePB.ListenSpeechEventResponse>) responseObserver);
          break;
        case METHODID_TEXT_TO_SPEECH:
          serviceImpl.textToSpeech((com.jjrobot.andy4.speechpb.SpeechServicePB.TextToSpeechRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.speechpb.SpeechServicePB.TextToSpeechResponse>) responseObserver);
          break;
        case METHODID_SPEECH_STOP:
          serviceImpl.speechStop((com.jjrobot.andy4.speechpb.SpeechServicePB.SpeechStopRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.speechpb.SpeechServicePB.SpeechStopResponse>) responseObserver);
          break;
        case METHODID_WAKE_UP:
          serviceImpl.wakeUp((com.jjrobot.andy4.speechpb.SpeechServicePB.WakeUpRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.speechpb.SpeechServicePB.WakeUpResponse>) responseObserver);
          break;
        case METHODID_HIBERNATE:
          serviceImpl.hibernate((com.jjrobot.andy4.speechpb.SpeechServicePB.HibernateRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.speechpb.SpeechServicePB.HibernateResponse>) responseObserver);
          break;
        case METHODID_SET_VOICE_VOLUME:
          serviceImpl.setVoiceVolume((com.jjrobot.andy4.speechpb.SpeechServicePB.SetVoiceVolumeRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.speechpb.SpeechServicePB.SetVoiceVolumeResponse>) responseObserver);
          break;
        case METHODID_GET_VOICE_VOLUME:
          serviceImpl.getVoiceVolume((com.jjrobot.andy4.speechpb.SpeechServicePB.GetVoiceVolumeRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.speechpb.SpeechServicePB.GetVoiceVolumeResponse>) responseObserver);
          break;
        case METHODID_SET_PARAMS:
          serviceImpl.setParams((com.jjrobot.andy4.speechpb.SpeechServicePB.SetParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.speechpb.SpeechServicePB.SetParamsResponse>) responseObserver);
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

  private static abstract class SpeechServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SpeechServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jjrobot.andy4.speechpb.SpeechServicePB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SpeechService");
    }
  }

  private static final class SpeechServiceFileDescriptorSupplier
      extends SpeechServiceBaseDescriptorSupplier {
    SpeechServiceFileDescriptorSupplier() {}
  }

  private static final class SpeechServiceMethodDescriptorSupplier
      extends SpeechServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SpeechServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SpeechServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SpeechServiceFileDescriptorSupplier())
              .addMethod(getListenSpeechEventMethod())
              .addMethod(getTextToSpeechMethod())
              .addMethod(getSpeechStopMethod())
              .addMethod(getWakeUpMethod())
              .addMethod(getHibernateMethod())
              .addMethod(getSetVoiceVolumeMethod())
              .addMethod(getGetVoiceVolumeMethod())
              .addMethod(getSetParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
