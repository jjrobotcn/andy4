package com.jjrobot.andy4.messagingpb;

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
 * messagingService.MessagingService 消息服务
 * 用于扩展内部应用的消息通信广播
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.1-SNAPSHOT)",
    comments = "Source: messaging.proto")
public final class MessagingServiceGrpc {

  private MessagingServiceGrpc() {}

  public static final String SERVICE_NAME = "messagingService.MessagingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.messagingpb.MessagingServicePB.MessagingRequest,
      com.jjrobot.andy4.messagingpb.MessagingServicePB.MessagingResponse> getMessagingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Messaging",
      requestType = com.jjrobot.andy4.messagingpb.MessagingServicePB.MessagingRequest.class,
      responseType = com.jjrobot.andy4.messagingpb.MessagingServicePB.MessagingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.messagingpb.MessagingServicePB.MessagingRequest,
      com.jjrobot.andy4.messagingpb.MessagingServicePB.MessagingResponse> getMessagingMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.messagingpb.MessagingServicePB.MessagingRequest, com.jjrobot.andy4.messagingpb.MessagingServicePB.MessagingResponse> getMessagingMethod;
    if ((getMessagingMethod = MessagingServiceGrpc.getMessagingMethod) == null) {
      synchronized (MessagingServiceGrpc.class) {
        if ((getMessagingMethod = MessagingServiceGrpc.getMessagingMethod) == null) {
          MessagingServiceGrpc.getMessagingMethod = getMessagingMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.messagingpb.MessagingServicePB.MessagingRequest, com.jjrobot.andy4.messagingpb.MessagingServicePB.MessagingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Messaging"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.messagingpb.MessagingServicePB.MessagingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.messagingpb.MessagingServicePB.MessagingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessagingServiceMethodDescriptorSupplier("Messaging"))
              .build();
        }
      }
    }
    return getMessagingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MessagingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessagingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessagingServiceStub>() {
        @java.lang.Override
        public MessagingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessagingServiceStub(channel, callOptions);
        }
      };
    return MessagingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MessagingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessagingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessagingServiceBlockingStub>() {
        @java.lang.Override
        public MessagingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessagingServiceBlockingStub(channel, callOptions);
        }
      };
    return MessagingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MessagingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessagingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessagingServiceFutureStub>() {
        @java.lang.Override
        public MessagingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessagingServiceFutureStub(channel, callOptions);
        }
      };
    return MessagingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * messagingService.MessagingService 消息服务
   * 用于扩展内部应用的消息通信广播
   * </pre>
   */
  public static abstract class MessagingServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Messaging 消息的发布与订阅方法
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.jjrobot.andy4.messagingpb.MessagingServicePB.MessagingRequest> messaging(
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.messagingpb.MessagingServicePB.MessagingResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getMessagingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMessagingMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.jjrobot.andy4.messagingpb.MessagingServicePB.MessagingRequest,
                com.jjrobot.andy4.messagingpb.MessagingServicePB.MessagingResponse>(
                  this, METHODID_MESSAGING)))
          .build();
    }
  }

  /**
   * <pre>
   * messagingService.MessagingService 消息服务
   * 用于扩展内部应用的消息通信广播
   * </pre>
   */
  public static final class MessagingServiceStub extends io.grpc.stub.AbstractAsyncStub<MessagingServiceStub> {
    private MessagingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessagingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Messaging 消息的发布与订阅方法
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.jjrobot.andy4.messagingpb.MessagingServicePB.MessagingRequest> messaging(
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.messagingpb.MessagingServicePB.MessagingResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getMessagingMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * messagingService.MessagingService 消息服务
   * 用于扩展内部应用的消息通信广播
   * </pre>
   */
  public static final class MessagingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MessagingServiceBlockingStub> {
    private MessagingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessagingServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * messagingService.MessagingService 消息服务
   * 用于扩展内部应用的消息通信广播
   * </pre>
   */
  public static final class MessagingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MessagingServiceFutureStub> {
    private MessagingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessagingServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_MESSAGING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MessagingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MessagingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MESSAGING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.messaging(
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.messagingpb.MessagingServicePB.MessagingResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MessagingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MessagingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jjrobot.andy4.messagingpb.MessagingServicePB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MessagingService");
    }
  }

  private static final class MessagingServiceFileDescriptorSupplier
      extends MessagingServiceBaseDescriptorSupplier {
    MessagingServiceFileDescriptorSupplier() {}
  }

  private static final class MessagingServiceMethodDescriptorSupplier
      extends MessagingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MessagingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MessagingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MessagingServiceFileDescriptorSupplier())
              .addMethod(getMessagingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
