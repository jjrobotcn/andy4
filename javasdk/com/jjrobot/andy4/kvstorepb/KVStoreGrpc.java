package com.jjrobot.andy4.kvstorepb;

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
 * kvstore.KVStore Key-Value键值存储服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.1-SNAPSHOT)",
    comments = "Source: kvstore.proto")
public final class KVStoreGrpc {

  private KVStoreGrpc() {}

  public static final String SERVICE_NAME = "kvstore.KVStore";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.kvstorepb.KVStorePB.PutRequest,
      com.jjrobot.andy4.kvstorepb.KVStorePB.PutResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Put",
      requestType = com.jjrobot.andy4.kvstorepb.KVStorePB.PutRequest.class,
      responseType = com.jjrobot.andy4.kvstorepb.KVStorePB.PutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.kvstorepb.KVStorePB.PutRequest,
      com.jjrobot.andy4.kvstorepb.KVStorePB.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.kvstorepb.KVStorePB.PutRequest, com.jjrobot.andy4.kvstorepb.KVStorePB.PutResponse> getPutMethod;
    if ((getPutMethod = KVStoreGrpc.getPutMethod) == null) {
      synchronized (KVStoreGrpc.class) {
        if ((getPutMethod = KVStoreGrpc.getPutMethod) == null) {
          KVStoreGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.kvstorepb.KVStorePB.PutRequest, com.jjrobot.andy4.kvstorepb.KVStorePB.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.kvstorepb.KVStorePB.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.kvstorepb.KVStorePB.PutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KVStoreMethodDescriptorSupplier("Put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.kvstorepb.KVStorePB.GetRequest,
      com.jjrobot.andy4.kvstorepb.KVStorePB.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.jjrobot.andy4.kvstorepb.KVStorePB.GetRequest.class,
      responseType = com.jjrobot.andy4.kvstorepb.KVStorePB.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.kvstorepb.KVStorePB.GetRequest,
      com.jjrobot.andy4.kvstorepb.KVStorePB.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.kvstorepb.KVStorePB.GetRequest, com.jjrobot.andy4.kvstorepb.KVStorePB.GetResponse> getGetMethod;
    if ((getGetMethod = KVStoreGrpc.getGetMethod) == null) {
      synchronized (KVStoreGrpc.class) {
        if ((getGetMethod = KVStoreGrpc.getGetMethod) == null) {
          KVStoreGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.kvstorepb.KVStorePB.GetRequest, com.jjrobot.andy4.kvstorepb.KVStorePB.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.kvstorepb.KVStorePB.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.kvstorepb.KVStorePB.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KVStoreMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixRequest,
      com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixResponse> getGetPrefixMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPrefix",
      requestType = com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixRequest.class,
      responseType = com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixRequest,
      com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixResponse> getGetPrefixMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixRequest, com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixResponse> getGetPrefixMethod;
    if ((getGetPrefixMethod = KVStoreGrpc.getGetPrefixMethod) == null) {
      synchronized (KVStoreGrpc.class) {
        if ((getGetPrefixMethod = KVStoreGrpc.getGetPrefixMethod) == null) {
          KVStoreGrpc.getGetPrefixMethod = getGetPrefixMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixRequest, com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPrefix"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KVStoreMethodDescriptorSupplier("GetPrefix"))
              .build();
        }
      }
    }
    return getGetPrefixMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixStreamRequest,
      com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixStreamResponse> getGetPrefixStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPrefixStream",
      requestType = com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixStreamRequest.class,
      responseType = com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixStreamRequest,
      com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixStreamResponse> getGetPrefixStreamMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixStreamRequest, com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixStreamResponse> getGetPrefixStreamMethod;
    if ((getGetPrefixStreamMethod = KVStoreGrpc.getGetPrefixStreamMethod) == null) {
      synchronized (KVStoreGrpc.class) {
        if ((getGetPrefixStreamMethod = KVStoreGrpc.getGetPrefixStreamMethod) == null) {
          KVStoreGrpc.getGetPrefixStreamMethod = getGetPrefixStreamMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixStreamRequest, com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPrefixStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KVStoreMethodDescriptorSupplier("GetPrefixStream"))
              .build();
        }
      }
    }
    return getGetPrefixStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.kvstorepb.KVStorePB.DeleteRequest,
      com.jjrobot.andy4.kvstorepb.KVStorePB.DeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.jjrobot.andy4.kvstorepb.KVStorePB.DeleteRequest.class,
      responseType = com.jjrobot.andy4.kvstorepb.KVStorePB.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.kvstorepb.KVStorePB.DeleteRequest,
      com.jjrobot.andy4.kvstorepb.KVStorePB.DeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.kvstorepb.KVStorePB.DeleteRequest, com.jjrobot.andy4.kvstorepb.KVStorePB.DeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = KVStoreGrpc.getDeleteMethod) == null) {
      synchronized (KVStoreGrpc.class) {
        if ((getDeleteMethod = KVStoreGrpc.getDeleteMethod) == null) {
          KVStoreGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.kvstorepb.KVStorePB.DeleteRequest, com.jjrobot.andy4.kvstorepb.KVStorePB.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.kvstorepb.KVStorePB.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.kvstorepb.KVStorePB.DeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KVStoreMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KVStoreStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KVStoreStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KVStoreStub>() {
        @java.lang.Override
        public KVStoreStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KVStoreStub(channel, callOptions);
        }
      };
    return KVStoreStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KVStoreBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KVStoreBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KVStoreBlockingStub>() {
        @java.lang.Override
        public KVStoreBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KVStoreBlockingStub(channel, callOptions);
        }
      };
    return KVStoreBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KVStoreFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KVStoreFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KVStoreFutureStub>() {
        @java.lang.Override
        public KVStoreFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KVStoreFutureStub(channel, callOptions);
        }
      };
    return KVStoreFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * kvstore.KVStore Key-Value键值存储服务
   * </pre>
   */
  public static abstract class KVStoreImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Put 创建kv键值对
     * 若key已存在将更新value值
     * </pre>
     */
    public void put(com.jjrobot.andy4.kvstorepb.KVStorePB.PutRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.kvstorepb.KVStorePB.PutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get 获取key的value
     * 若key不存在则返回gRPC错误:NotFound
     * </pre>
     */
    public void get(com.jjrobot.andy4.kvstorepb.KVStorePB.GetRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.kvstorepb.KVStorePB.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPrefix 获取符合key_prefix的多个kv键值对
     * </pre>
     */
    public void getPrefix(com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPrefixMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPrefixStream gRPC stream方式获取符合key_prefix的多个kv键值对
     * </pre>
     */
    public void getPrefixStream(com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixStreamRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixStreamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPrefixStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete 删除kv键值对
     * </pre>
     */
    public void delete(com.jjrobot.andy4.kvstorepb.KVStorePB.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.kvstorepb.KVStorePB.DeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.kvstorepb.KVStorePB.PutRequest,
                com.jjrobot.andy4.kvstorepb.KVStorePB.PutResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.kvstorepb.KVStorePB.GetRequest,
                com.jjrobot.andy4.kvstorepb.KVStorePB.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getGetPrefixMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixRequest,
                com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixResponse>(
                  this, METHODID_GET_PREFIX)))
          .addMethod(
            getGetPrefixStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixStreamRequest,
                com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixStreamResponse>(
                  this, METHODID_GET_PREFIX_STREAM)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.kvstorepb.KVStorePB.DeleteRequest,
                com.jjrobot.andy4.kvstorepb.KVStorePB.DeleteResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * kvstore.KVStore Key-Value键值存储服务
   * </pre>
   */
  public static final class KVStoreStub extends io.grpc.stub.AbstractAsyncStub<KVStoreStub> {
    private KVStoreStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KVStoreStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KVStoreStub(channel, callOptions);
    }

    /**
     * <pre>
     * Put 创建kv键值对
     * 若key已存在将更新value值
     * </pre>
     */
    public void put(com.jjrobot.andy4.kvstorepb.KVStorePB.PutRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.kvstorepb.KVStorePB.PutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get 获取key的value
     * 若key不存在则返回gRPC错误:NotFound
     * </pre>
     */
    public void get(com.jjrobot.andy4.kvstorepb.KVStorePB.GetRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.kvstorepb.KVStorePB.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetPrefix 获取符合key_prefix的多个kv键值对
     * </pre>
     */
    public void getPrefix(com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPrefixMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetPrefixStream gRPC stream方式获取符合key_prefix的多个kv键值对
     * </pre>
     */
    public void getPrefixStream(com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixStreamRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixStreamResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetPrefixStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete 删除kv键值对
     * </pre>
     */
    public void delete(com.jjrobot.andy4.kvstorepb.KVStorePB.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.kvstorepb.KVStorePB.DeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * kvstore.KVStore Key-Value键值存储服务
   * </pre>
   */
  public static final class KVStoreBlockingStub extends io.grpc.stub.AbstractBlockingStub<KVStoreBlockingStub> {
    private KVStoreBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KVStoreBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KVStoreBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Put 创建kv键值对
     * 若key已存在将更新value值
     * </pre>
     */
    public com.jjrobot.andy4.kvstorepb.KVStorePB.PutResponse put(com.jjrobot.andy4.kvstorepb.KVStorePB.PutRequest request) {
      return blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get 获取key的value
     * 若key不存在则返回gRPC错误:NotFound
     * </pre>
     */
    public com.jjrobot.andy4.kvstorepb.KVStorePB.GetResponse get(com.jjrobot.andy4.kvstorepb.KVStorePB.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPrefix 获取符合key_prefix的多个kv键值对
     * </pre>
     */
    public com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixResponse getPrefix(com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPrefixMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPrefixStream gRPC stream方式获取符合key_prefix的多个kv键值对
     * </pre>
     */
    public java.util.Iterator<com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixStreamResponse> getPrefixStream(
        com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixStreamRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetPrefixStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete 删除kv键值对
     * </pre>
     */
    public com.jjrobot.andy4.kvstorepb.KVStorePB.DeleteResponse delete(com.jjrobot.andy4.kvstorepb.KVStorePB.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * kvstore.KVStore Key-Value键值存储服务
   * </pre>
   */
  public static final class KVStoreFutureStub extends io.grpc.stub.AbstractFutureStub<KVStoreFutureStub> {
    private KVStoreFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KVStoreFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KVStoreFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Put 创建kv键值对
     * 若key已存在将更新value值
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.kvstorepb.KVStorePB.PutResponse> put(
        com.jjrobot.andy4.kvstorepb.KVStorePB.PutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get 获取key的value
     * 若key不存在则返回gRPC错误:NotFound
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.kvstorepb.KVStorePB.GetResponse> get(
        com.jjrobot.andy4.kvstorepb.KVStorePB.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetPrefix 获取符合key_prefix的多个kv键值对
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixResponse> getPrefix(
        com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPrefixMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete 删除kv键值对
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.kvstorepb.KVStorePB.DeleteResponse> delete(
        com.jjrobot.andy4.kvstorepb.KVStorePB.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUT = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_GET_PREFIX = 2;
  private static final int METHODID_GET_PREFIX_STREAM = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KVStoreImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KVStoreImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUT:
          serviceImpl.put((com.jjrobot.andy4.kvstorepb.KVStorePB.PutRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.kvstorepb.KVStorePB.PutResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.jjrobot.andy4.kvstorepb.KVStorePB.GetRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.kvstorepb.KVStorePB.GetResponse>) responseObserver);
          break;
        case METHODID_GET_PREFIX:
          serviceImpl.getPrefix((com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixResponse>) responseObserver);
          break;
        case METHODID_GET_PREFIX_STREAM:
          serviceImpl.getPrefixStream((com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.kvstorepb.KVStorePB.GetPrefixStreamResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.jjrobot.andy4.kvstorepb.KVStorePB.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.kvstorepb.KVStorePB.DeleteResponse>) responseObserver);
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

  private static abstract class KVStoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KVStoreBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jjrobot.andy4.kvstorepb.KVStorePB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KVStore");
    }
  }

  private static final class KVStoreFileDescriptorSupplier
      extends KVStoreBaseDescriptorSupplier {
    KVStoreFileDescriptorSupplier() {}
  }

  private static final class KVStoreMethodDescriptorSupplier
      extends KVStoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KVStoreMethodDescriptorSupplier(String methodName) {
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
      synchronized (KVStoreGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KVStoreFileDescriptorSupplier())
              .addMethod(getPutMethod())
              .addMethod(getGetMethod())
              .addMethod(getGetPrefixMethod())
              .addMethod(getGetPrefixStreamMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
