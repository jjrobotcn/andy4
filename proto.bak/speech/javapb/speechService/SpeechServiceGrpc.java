package speechService;

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
    comments = "Source: speech.proto")
public final class SpeechServiceGrpc {

  private SpeechServiceGrpc() {}

  public static final String SERVICE_NAME = "speechService.SpeechService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<speechService.Speech.ListenSpeechEventRequest,
      speechService.Speech.ListenSpeechEventResponse> getListenSpeechEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListenSpeechEvent",
      requestType = speechService.Speech.ListenSpeechEventRequest.class,
      responseType = speechService.Speech.ListenSpeechEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<speechService.Speech.ListenSpeechEventRequest,
      speechService.Speech.ListenSpeechEventResponse> getListenSpeechEventMethod() {
    io.grpc.MethodDescriptor<speechService.Speech.ListenSpeechEventRequest, speechService.Speech.ListenSpeechEventResponse> getListenSpeechEventMethod;
    if ((getListenSpeechEventMethod = SpeechServiceGrpc.getListenSpeechEventMethod) == null) {
      synchronized (SpeechServiceGrpc.class) {
        if ((getListenSpeechEventMethod = SpeechServiceGrpc.getListenSpeechEventMethod) == null) {
          SpeechServiceGrpc.getListenSpeechEventMethod = getListenSpeechEventMethod = 
              io.grpc.MethodDescriptor.<speechService.Speech.ListenSpeechEventRequest, speechService.Speech.ListenSpeechEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "speechService.SpeechService", "ListenSpeechEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  speechService.Speech.ListenSpeechEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  speechService.Speech.ListenSpeechEventResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeechServiceMethodDescriptorSupplier("ListenSpeechEvent"))
                  .build();
          }
        }
     }
     return getListenSpeechEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<speechService.Speech.TextToSpeechRequest,
      speechService.Speech.TextToSpeechResponse> getTextToSpeechMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TextToSpeech",
      requestType = speechService.Speech.TextToSpeechRequest.class,
      responseType = speechService.Speech.TextToSpeechResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<speechService.Speech.TextToSpeechRequest,
      speechService.Speech.TextToSpeechResponse> getTextToSpeechMethod() {
    io.grpc.MethodDescriptor<speechService.Speech.TextToSpeechRequest, speechService.Speech.TextToSpeechResponse> getTextToSpeechMethod;
    if ((getTextToSpeechMethod = SpeechServiceGrpc.getTextToSpeechMethod) == null) {
      synchronized (SpeechServiceGrpc.class) {
        if ((getTextToSpeechMethod = SpeechServiceGrpc.getTextToSpeechMethod) == null) {
          SpeechServiceGrpc.getTextToSpeechMethod = getTextToSpeechMethod = 
              io.grpc.MethodDescriptor.<speechService.Speech.TextToSpeechRequest, speechService.Speech.TextToSpeechResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "speechService.SpeechService", "TextToSpeech"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  speechService.Speech.TextToSpeechRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  speechService.Speech.TextToSpeechResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeechServiceMethodDescriptorSupplier("TextToSpeech"))
                  .build();
          }
        }
     }
     return getTextToSpeechMethod;
  }

  private static volatile io.grpc.MethodDescriptor<speechService.Speech.SpeechStopRequest,
      speechService.Speech.SpeechStopResponse> getSpeechStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpeechStop",
      requestType = speechService.Speech.SpeechStopRequest.class,
      responseType = speechService.Speech.SpeechStopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<speechService.Speech.SpeechStopRequest,
      speechService.Speech.SpeechStopResponse> getSpeechStopMethod() {
    io.grpc.MethodDescriptor<speechService.Speech.SpeechStopRequest, speechService.Speech.SpeechStopResponse> getSpeechStopMethod;
    if ((getSpeechStopMethod = SpeechServiceGrpc.getSpeechStopMethod) == null) {
      synchronized (SpeechServiceGrpc.class) {
        if ((getSpeechStopMethod = SpeechServiceGrpc.getSpeechStopMethod) == null) {
          SpeechServiceGrpc.getSpeechStopMethod = getSpeechStopMethod = 
              io.grpc.MethodDescriptor.<speechService.Speech.SpeechStopRequest, speechService.Speech.SpeechStopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "speechService.SpeechService", "SpeechStop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  speechService.Speech.SpeechStopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  speechService.Speech.SpeechStopResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeechServiceMethodDescriptorSupplier("SpeechStop"))
                  .build();
          }
        }
     }
     return getSpeechStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<speechService.Speech.WakeUpRequest,
      speechService.Speech.WakeUpResponse> getWakeUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WakeUp",
      requestType = speechService.Speech.WakeUpRequest.class,
      responseType = speechService.Speech.WakeUpResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<speechService.Speech.WakeUpRequest,
      speechService.Speech.WakeUpResponse> getWakeUpMethod() {
    io.grpc.MethodDescriptor<speechService.Speech.WakeUpRequest, speechService.Speech.WakeUpResponse> getWakeUpMethod;
    if ((getWakeUpMethod = SpeechServiceGrpc.getWakeUpMethod) == null) {
      synchronized (SpeechServiceGrpc.class) {
        if ((getWakeUpMethod = SpeechServiceGrpc.getWakeUpMethod) == null) {
          SpeechServiceGrpc.getWakeUpMethod = getWakeUpMethod = 
              io.grpc.MethodDescriptor.<speechService.Speech.WakeUpRequest, speechService.Speech.WakeUpResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "speechService.SpeechService", "WakeUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  speechService.Speech.WakeUpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  speechService.Speech.WakeUpResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeechServiceMethodDescriptorSupplier("WakeUp"))
                  .build();
          }
        }
     }
     return getWakeUpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<speechService.Speech.HibernateRequest,
      speechService.Speech.HibernateResponse> getHibernateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Hibernate",
      requestType = speechService.Speech.HibernateRequest.class,
      responseType = speechService.Speech.HibernateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<speechService.Speech.HibernateRequest,
      speechService.Speech.HibernateResponse> getHibernateMethod() {
    io.grpc.MethodDescriptor<speechService.Speech.HibernateRequest, speechService.Speech.HibernateResponse> getHibernateMethod;
    if ((getHibernateMethod = SpeechServiceGrpc.getHibernateMethod) == null) {
      synchronized (SpeechServiceGrpc.class) {
        if ((getHibernateMethod = SpeechServiceGrpc.getHibernateMethod) == null) {
          SpeechServiceGrpc.getHibernateMethod = getHibernateMethod = 
              io.grpc.MethodDescriptor.<speechService.Speech.HibernateRequest, speechService.Speech.HibernateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "speechService.SpeechService", "Hibernate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  speechService.Speech.HibernateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  speechService.Speech.HibernateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeechServiceMethodDescriptorSupplier("Hibernate"))
                  .build();
          }
        }
     }
     return getHibernateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<speechService.Speech.SetVoiceVolumeRequest,
      speechService.Speech.SetVoiceVolumeResponse> getSetVoiceVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetVoiceVolume",
      requestType = speechService.Speech.SetVoiceVolumeRequest.class,
      responseType = speechService.Speech.SetVoiceVolumeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<speechService.Speech.SetVoiceVolumeRequest,
      speechService.Speech.SetVoiceVolumeResponse> getSetVoiceVolumeMethod() {
    io.grpc.MethodDescriptor<speechService.Speech.SetVoiceVolumeRequest, speechService.Speech.SetVoiceVolumeResponse> getSetVoiceVolumeMethod;
    if ((getSetVoiceVolumeMethod = SpeechServiceGrpc.getSetVoiceVolumeMethod) == null) {
      synchronized (SpeechServiceGrpc.class) {
        if ((getSetVoiceVolumeMethod = SpeechServiceGrpc.getSetVoiceVolumeMethod) == null) {
          SpeechServiceGrpc.getSetVoiceVolumeMethod = getSetVoiceVolumeMethod = 
              io.grpc.MethodDescriptor.<speechService.Speech.SetVoiceVolumeRequest, speechService.Speech.SetVoiceVolumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "speechService.SpeechService", "SetVoiceVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  speechService.Speech.SetVoiceVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  speechService.Speech.SetVoiceVolumeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeechServiceMethodDescriptorSupplier("SetVoiceVolume"))
                  .build();
          }
        }
     }
     return getSetVoiceVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<speechService.Speech.GetVoiceVolumeRequest,
      speechService.Speech.GetVoiceVolumeResponse> getGetVoiceVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVoiceVolume",
      requestType = speechService.Speech.GetVoiceVolumeRequest.class,
      responseType = speechService.Speech.GetVoiceVolumeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<speechService.Speech.GetVoiceVolumeRequest,
      speechService.Speech.GetVoiceVolumeResponse> getGetVoiceVolumeMethod() {
    io.grpc.MethodDescriptor<speechService.Speech.GetVoiceVolumeRequest, speechService.Speech.GetVoiceVolumeResponse> getGetVoiceVolumeMethod;
    if ((getGetVoiceVolumeMethod = SpeechServiceGrpc.getGetVoiceVolumeMethod) == null) {
      synchronized (SpeechServiceGrpc.class) {
        if ((getGetVoiceVolumeMethod = SpeechServiceGrpc.getGetVoiceVolumeMethod) == null) {
          SpeechServiceGrpc.getGetVoiceVolumeMethod = getGetVoiceVolumeMethod = 
              io.grpc.MethodDescriptor.<speechService.Speech.GetVoiceVolumeRequest, speechService.Speech.GetVoiceVolumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "speechService.SpeechService", "GetVoiceVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  speechService.Speech.GetVoiceVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  speechService.Speech.GetVoiceVolumeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeechServiceMethodDescriptorSupplier("GetVoiceVolume"))
                  .build();
          }
        }
     }
     return getGetVoiceVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<speechService.Speech.SetParamsRequest,
      speechService.Speech.SetParamsResponse> getSetParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetParams",
      requestType = speechService.Speech.SetParamsRequest.class,
      responseType = speechService.Speech.SetParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<speechService.Speech.SetParamsRequest,
      speechService.Speech.SetParamsResponse> getSetParamsMethod() {
    io.grpc.MethodDescriptor<speechService.Speech.SetParamsRequest, speechService.Speech.SetParamsResponse> getSetParamsMethod;
    if ((getSetParamsMethod = SpeechServiceGrpc.getSetParamsMethod) == null) {
      synchronized (SpeechServiceGrpc.class) {
        if ((getSetParamsMethod = SpeechServiceGrpc.getSetParamsMethod) == null) {
          SpeechServiceGrpc.getSetParamsMethod = getSetParamsMethod = 
              io.grpc.MethodDescriptor.<speechService.Speech.SetParamsRequest, speechService.Speech.SetParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "speechService.SpeechService", "SetParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  speechService.Speech.SetParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  speechService.Speech.SetParamsResponse.getDefaultInstance()))
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
    return new SpeechServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpeechServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SpeechServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SpeechServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SpeechServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SpeechServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * ListenSpeechEvent方法为监听语音事件变更状态流, 具体类型参考: SpeechEvent
     * ListenSpeechEventRequest中可配置相关状态消息过滤,
     * </pre>
     */
    public void listenSpeechEvent(speechService.Speech.ListenSpeechEventRequest request,
        io.grpc.stub.StreamObserver<speechService.Speech.ListenSpeechEventResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListenSpeechEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * TextToSpeech(TTS)方法实现文本输入语音合成自动音频输出
     * </pre>
     */
    public void textToSpeech(speechService.Speech.TextToSpeechRequest request,
        io.grpc.stub.StreamObserver<speechService.Speech.TextToSpeechResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTextToSpeechMethod(), responseObserver);
    }

    /**
     * <pre>
     * SpeechStop方法实现打断语音功能
     * </pre>
     */
    public void speechStop(speechService.Speech.SpeechStopRequest request,
        io.grpc.stub.StreamObserver<speechService.Speech.SpeechStopResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSpeechStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * 唤醒
     * </pre>
     */
    public void wakeUp(speechService.Speech.WakeUpRequest request,
        io.grpc.stub.StreamObserver<speechService.Speech.WakeUpResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWakeUpMethod(), responseObserver);
    }

    /**
     * <pre>
     * 休眠
     * </pre>
     */
    public void hibernate(speechService.Speech.HibernateRequest request,
        io.grpc.stub.StreamObserver<speechService.Speech.HibernateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHibernateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 设置语音音量
     * v2.1.0
     * </pre>
     */
    public void setVoiceVolume(speechService.Speech.SetVoiceVolumeRequest request,
        io.grpc.stub.StreamObserver<speechService.Speech.SetVoiceVolumeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetVoiceVolumeMethod(), responseObserver);
    }

    /**
     * <pre>
     * 查询语音音量
     * v2.1.0
     * </pre>
     */
    public void getVoiceVolume(speechService.Speech.GetVoiceVolumeRequest request,
        io.grpc.stub.StreamObserver<speechService.Speech.GetVoiceVolumeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVoiceVolumeMethod(), responseObserver);
    }

    /**
     * <pre>
     * 配置参数(当前仅支持AIUI模块)
     * v2.1.0
     * AIUI模块参数配置参考: https://aiui.xfyun.cn/docs/access_docs (开发-评估板/量产板 =&gt; AIUI SDK =&gt; 参数配置)
     * </pre>
     */
    public void setParams(speechService.Speech.SetParamsRequest request,
        io.grpc.stub.StreamObserver<speechService.Speech.SetParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetParamsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListenSpeechEventMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                speechService.Speech.ListenSpeechEventRequest,
                speechService.Speech.ListenSpeechEventResponse>(
                  this, METHODID_LISTEN_SPEECH_EVENT)))
          .addMethod(
            getTextToSpeechMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                speechService.Speech.TextToSpeechRequest,
                speechService.Speech.TextToSpeechResponse>(
                  this, METHODID_TEXT_TO_SPEECH)))
          .addMethod(
            getSpeechStopMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                speechService.Speech.SpeechStopRequest,
                speechService.Speech.SpeechStopResponse>(
                  this, METHODID_SPEECH_STOP)))
          .addMethod(
            getWakeUpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                speechService.Speech.WakeUpRequest,
                speechService.Speech.WakeUpResponse>(
                  this, METHODID_WAKE_UP)))
          .addMethod(
            getHibernateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                speechService.Speech.HibernateRequest,
                speechService.Speech.HibernateResponse>(
                  this, METHODID_HIBERNATE)))
          .addMethod(
            getSetVoiceVolumeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                speechService.Speech.SetVoiceVolumeRequest,
                speechService.Speech.SetVoiceVolumeResponse>(
                  this, METHODID_SET_VOICE_VOLUME)))
          .addMethod(
            getGetVoiceVolumeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                speechService.Speech.GetVoiceVolumeRequest,
                speechService.Speech.GetVoiceVolumeResponse>(
                  this, METHODID_GET_VOICE_VOLUME)))
          .addMethod(
            getSetParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                speechService.Speech.SetParamsRequest,
                speechService.Speech.SetParamsResponse>(
                  this, METHODID_SET_PARAMS)))
          .build();
    }
  }

  /**
   */
  public static final class SpeechServiceStub extends io.grpc.stub.AbstractStub<SpeechServiceStub> {
    private SpeechServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeechServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeechServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeechServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListenSpeechEvent方法为监听语音事件变更状态流, 具体类型参考: SpeechEvent
     * ListenSpeechEventRequest中可配置相关状态消息过滤,
     * </pre>
     */
    public void listenSpeechEvent(speechService.Speech.ListenSpeechEventRequest request,
        io.grpc.stub.StreamObserver<speechService.Speech.ListenSpeechEventResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListenSpeechEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TextToSpeech(TTS)方法实现文本输入语音合成自动音频输出
     * </pre>
     */
    public void textToSpeech(speechService.Speech.TextToSpeechRequest request,
        io.grpc.stub.StreamObserver<speechService.Speech.TextToSpeechResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTextToSpeechMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SpeechStop方法实现打断语音功能
     * </pre>
     */
    public void speechStop(speechService.Speech.SpeechStopRequest request,
        io.grpc.stub.StreamObserver<speechService.Speech.SpeechStopResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSpeechStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 唤醒
     * </pre>
     */
    public void wakeUp(speechService.Speech.WakeUpRequest request,
        io.grpc.stub.StreamObserver<speechService.Speech.WakeUpResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWakeUpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 休眠
     * </pre>
     */
    public void hibernate(speechService.Speech.HibernateRequest request,
        io.grpc.stub.StreamObserver<speechService.Speech.HibernateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHibernateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 设置语音音量
     * v2.1.0
     * </pre>
     */
    public void setVoiceVolume(speechService.Speech.SetVoiceVolumeRequest request,
        io.grpc.stub.StreamObserver<speechService.Speech.SetVoiceVolumeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetVoiceVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 查询语音音量
     * v2.1.0
     * </pre>
     */
    public void getVoiceVolume(speechService.Speech.GetVoiceVolumeRequest request,
        io.grpc.stub.StreamObserver<speechService.Speech.GetVoiceVolumeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVoiceVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 配置参数(当前仅支持AIUI模块)
     * v2.1.0
     * AIUI模块参数配置参考: https://aiui.xfyun.cn/docs/access_docs (开发-评估板/量产板 =&gt; AIUI SDK =&gt; 参数配置)
     * </pre>
     */
    public void setParams(speechService.Speech.SetParamsRequest request,
        io.grpc.stub.StreamObserver<speechService.Speech.SetParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SpeechServiceBlockingStub extends io.grpc.stub.AbstractStub<SpeechServiceBlockingStub> {
    private SpeechServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeechServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeechServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeechServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListenSpeechEvent方法为监听语音事件变更状态流, 具体类型参考: SpeechEvent
     * ListenSpeechEventRequest中可配置相关状态消息过滤,
     * </pre>
     */
    public java.util.Iterator<speechService.Speech.ListenSpeechEventResponse> listenSpeechEvent(
        speechService.Speech.ListenSpeechEventRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListenSpeechEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TextToSpeech(TTS)方法实现文本输入语音合成自动音频输出
     * </pre>
     */
    public speechService.Speech.TextToSpeechResponse textToSpeech(speechService.Speech.TextToSpeechRequest request) {
      return blockingUnaryCall(
          getChannel(), getTextToSpeechMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SpeechStop方法实现打断语音功能
     * </pre>
     */
    public speechService.Speech.SpeechStopResponse speechStop(speechService.Speech.SpeechStopRequest request) {
      return blockingUnaryCall(
          getChannel(), getSpeechStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 唤醒
     * </pre>
     */
    public speechService.Speech.WakeUpResponse wakeUp(speechService.Speech.WakeUpRequest request) {
      return blockingUnaryCall(
          getChannel(), getWakeUpMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 休眠
     * </pre>
     */
    public speechService.Speech.HibernateResponse hibernate(speechService.Speech.HibernateRequest request) {
      return blockingUnaryCall(
          getChannel(), getHibernateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 设置语音音量
     * v2.1.0
     * </pre>
     */
    public speechService.Speech.SetVoiceVolumeResponse setVoiceVolume(speechService.Speech.SetVoiceVolumeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetVoiceVolumeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 查询语音音量
     * v2.1.0
     * </pre>
     */
    public speechService.Speech.GetVoiceVolumeResponse getVoiceVolume(speechService.Speech.GetVoiceVolumeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVoiceVolumeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 配置参数(当前仅支持AIUI模块)
     * v2.1.0
     * AIUI模块参数配置参考: https://aiui.xfyun.cn/docs/access_docs (开发-评估板/量产板 =&gt; AIUI SDK =&gt; 参数配置)
     * </pre>
     */
    public speechService.Speech.SetParamsResponse setParams(speechService.Speech.SetParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SpeechServiceFutureStub extends io.grpc.stub.AbstractStub<SpeechServiceFutureStub> {
    private SpeechServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeechServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeechServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeechServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * TextToSpeech(TTS)方法实现文本输入语音合成自动音频输出
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<speechService.Speech.TextToSpeechResponse> textToSpeech(
        speechService.Speech.TextToSpeechRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTextToSpeechMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SpeechStop方法实现打断语音功能
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<speechService.Speech.SpeechStopResponse> speechStop(
        speechService.Speech.SpeechStopRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSpeechStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 唤醒
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<speechService.Speech.WakeUpResponse> wakeUp(
        speechService.Speech.WakeUpRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWakeUpMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 休眠
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<speechService.Speech.HibernateResponse> hibernate(
        speechService.Speech.HibernateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHibernateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 设置语音音量
     * v2.1.0
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<speechService.Speech.SetVoiceVolumeResponse> setVoiceVolume(
        speechService.Speech.SetVoiceVolumeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetVoiceVolumeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 查询语音音量
     * v2.1.0
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<speechService.Speech.GetVoiceVolumeResponse> getVoiceVolume(
        speechService.Speech.GetVoiceVolumeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVoiceVolumeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 配置参数(当前仅支持AIUI模块)
     * v2.1.0
     * AIUI模块参数配置参考: https://aiui.xfyun.cn/docs/access_docs (开发-评估板/量产板 =&gt; AIUI SDK =&gt; 参数配置)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<speechService.Speech.SetParamsResponse> setParams(
        speechService.Speech.SetParamsRequest request) {
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
          serviceImpl.listenSpeechEvent((speechService.Speech.ListenSpeechEventRequest) request,
              (io.grpc.stub.StreamObserver<speechService.Speech.ListenSpeechEventResponse>) responseObserver);
          break;
        case METHODID_TEXT_TO_SPEECH:
          serviceImpl.textToSpeech((speechService.Speech.TextToSpeechRequest) request,
              (io.grpc.stub.StreamObserver<speechService.Speech.TextToSpeechResponse>) responseObserver);
          break;
        case METHODID_SPEECH_STOP:
          serviceImpl.speechStop((speechService.Speech.SpeechStopRequest) request,
              (io.grpc.stub.StreamObserver<speechService.Speech.SpeechStopResponse>) responseObserver);
          break;
        case METHODID_WAKE_UP:
          serviceImpl.wakeUp((speechService.Speech.WakeUpRequest) request,
              (io.grpc.stub.StreamObserver<speechService.Speech.WakeUpResponse>) responseObserver);
          break;
        case METHODID_HIBERNATE:
          serviceImpl.hibernate((speechService.Speech.HibernateRequest) request,
              (io.grpc.stub.StreamObserver<speechService.Speech.HibernateResponse>) responseObserver);
          break;
        case METHODID_SET_VOICE_VOLUME:
          serviceImpl.setVoiceVolume((speechService.Speech.SetVoiceVolumeRequest) request,
              (io.grpc.stub.StreamObserver<speechService.Speech.SetVoiceVolumeResponse>) responseObserver);
          break;
        case METHODID_GET_VOICE_VOLUME:
          serviceImpl.getVoiceVolume((speechService.Speech.GetVoiceVolumeRequest) request,
              (io.grpc.stub.StreamObserver<speechService.Speech.GetVoiceVolumeResponse>) responseObserver);
          break;
        case METHODID_SET_PARAMS:
          serviceImpl.setParams((speechService.Speech.SetParamsRequest) request,
              (io.grpc.stub.StreamObserver<speechService.Speech.SetParamsResponse>) responseObserver);
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
      return speechService.Speech.getDescriptor();
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
