package kvstore;

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
    comments = "Source: kvstore.proto")
public final class KVStoreGrpc {

  private KVStoreGrpc() {}

  public static final String SERVICE_NAME = "kvstore.KVStore";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kvstore.KVStoreOuterClass.PutRequest,
      kvstore.KVStoreOuterClass.PutResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Put",
      requestType = kvstore.KVStoreOuterClass.PutRequest.class,
      responseType = kvstore.KVStoreOuterClass.PutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kvstore.KVStoreOuterClass.PutRequest,
      kvstore.KVStoreOuterClass.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<kvstore.KVStoreOuterClass.PutRequest, kvstore.KVStoreOuterClass.PutResponse> getPutMethod;
    if ((getPutMethod = KVStoreGrpc.getPutMethod) == null) {
      synchronized (KVStoreGrpc.class) {
        if ((getPutMethod = KVStoreGrpc.getPutMethod) == null) {
          KVStoreGrpc.getPutMethod = getPutMethod = 
              io.grpc.MethodDescriptor.<kvstore.KVStoreOuterClass.PutRequest, kvstore.KVStoreOuterClass.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "kvstore.KVStore", "Put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kvstore.KVStoreOuterClass.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kvstore.KVStoreOuterClass.PutResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KVStoreMethodDescriptorSupplier("Put"))
                  .build();
          }
        }
     }
     return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kvstore.KVStoreOuterClass.GetRequest,
      kvstore.KVStoreOuterClass.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = kvstore.KVStoreOuterClass.GetRequest.class,
      responseType = kvstore.KVStoreOuterClass.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kvstore.KVStoreOuterClass.GetRequest,
      kvstore.KVStoreOuterClass.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<kvstore.KVStoreOuterClass.GetRequest, kvstore.KVStoreOuterClass.GetResponse> getGetMethod;
    if ((getGetMethod = KVStoreGrpc.getGetMethod) == null) {
      synchronized (KVStoreGrpc.class) {
        if ((getGetMethod = KVStoreGrpc.getGetMethod) == null) {
          KVStoreGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<kvstore.KVStoreOuterClass.GetRequest, kvstore.KVStoreOuterClass.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "kvstore.KVStore", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kvstore.KVStoreOuterClass.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kvstore.KVStoreOuterClass.GetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KVStoreMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kvstore.KVStoreOuterClass.GetPrefixRequest,
      kvstore.KVStoreOuterClass.GetPrefixResponse> getGetPrefixMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPrefix",
      requestType = kvstore.KVStoreOuterClass.GetPrefixRequest.class,
      responseType = kvstore.KVStoreOuterClass.GetPrefixResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kvstore.KVStoreOuterClass.GetPrefixRequest,
      kvstore.KVStoreOuterClass.GetPrefixResponse> getGetPrefixMethod() {
    io.grpc.MethodDescriptor<kvstore.KVStoreOuterClass.GetPrefixRequest, kvstore.KVStoreOuterClass.GetPrefixResponse> getGetPrefixMethod;
    if ((getGetPrefixMethod = KVStoreGrpc.getGetPrefixMethod) == null) {
      synchronized (KVStoreGrpc.class) {
        if ((getGetPrefixMethod = KVStoreGrpc.getGetPrefixMethod) == null) {
          KVStoreGrpc.getGetPrefixMethod = getGetPrefixMethod = 
              io.grpc.MethodDescriptor.<kvstore.KVStoreOuterClass.GetPrefixRequest, kvstore.KVStoreOuterClass.GetPrefixResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "kvstore.KVStore", "GetPrefix"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kvstore.KVStoreOuterClass.GetPrefixRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kvstore.KVStoreOuterClass.GetPrefixResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KVStoreMethodDescriptorSupplier("GetPrefix"))
                  .build();
          }
        }
     }
     return getGetPrefixMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kvstore.KVStoreOuterClass.GetPrefixStreamRequest,
      kvstore.KVStoreOuterClass.GetPrefixStreamResponse> getGetPrefixStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPrefixStream",
      requestType = kvstore.KVStoreOuterClass.GetPrefixStreamRequest.class,
      responseType = kvstore.KVStoreOuterClass.GetPrefixStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<kvstore.KVStoreOuterClass.GetPrefixStreamRequest,
      kvstore.KVStoreOuterClass.GetPrefixStreamResponse> getGetPrefixStreamMethod() {
    io.grpc.MethodDescriptor<kvstore.KVStoreOuterClass.GetPrefixStreamRequest, kvstore.KVStoreOuterClass.GetPrefixStreamResponse> getGetPrefixStreamMethod;
    if ((getGetPrefixStreamMethod = KVStoreGrpc.getGetPrefixStreamMethod) == null) {
      synchronized (KVStoreGrpc.class) {
        if ((getGetPrefixStreamMethod = KVStoreGrpc.getGetPrefixStreamMethod) == null) {
          KVStoreGrpc.getGetPrefixStreamMethod = getGetPrefixStreamMethod = 
              io.grpc.MethodDescriptor.<kvstore.KVStoreOuterClass.GetPrefixStreamRequest, kvstore.KVStoreOuterClass.GetPrefixStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "kvstore.KVStore", "GetPrefixStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kvstore.KVStoreOuterClass.GetPrefixStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kvstore.KVStoreOuterClass.GetPrefixStreamResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KVStoreMethodDescriptorSupplier("GetPrefixStream"))
                  .build();
          }
        }
     }
     return getGetPrefixStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kvstore.KVStoreOuterClass.DeleteRequest,
      kvstore.KVStoreOuterClass.DeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = kvstore.KVStoreOuterClass.DeleteRequest.class,
      responseType = kvstore.KVStoreOuterClass.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kvstore.KVStoreOuterClass.DeleteRequest,
      kvstore.KVStoreOuterClass.DeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<kvstore.KVStoreOuterClass.DeleteRequest, kvstore.KVStoreOuterClass.DeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = KVStoreGrpc.getDeleteMethod) == null) {
      synchronized (KVStoreGrpc.class) {
        if ((getDeleteMethod = KVStoreGrpc.getDeleteMethod) == null) {
          KVStoreGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<kvstore.KVStoreOuterClass.DeleteRequest, kvstore.KVStoreOuterClass.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "kvstore.KVStore", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kvstore.KVStoreOuterClass.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kvstore.KVStoreOuterClass.DeleteResponse.getDefaultInstance()))
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
    return new KVStoreStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KVStoreBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new KVStoreBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KVStoreFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new KVStoreFutureStub(channel);
  }

  /**
   */
  public static abstract class KVStoreImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Put 创建kv键值对
     * 若key已存在将更新value值
     * </pre>
     */
    public void put(kvstore.KVStoreOuterClass.PutRequest request,
        io.grpc.stub.StreamObserver<kvstore.KVStoreOuterClass.PutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get 获取key的value
     * 若key不存在则返回gRPC错误:NotFound
     * </pre>
     */
    public void get(kvstore.KVStoreOuterClass.GetRequest request,
        io.grpc.stub.StreamObserver<kvstore.KVStoreOuterClass.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPrefix 获取符合key_prefix的多个kv键值对
     * </pre>
     */
    public void getPrefix(kvstore.KVStoreOuterClass.GetPrefixRequest request,
        io.grpc.stub.StreamObserver<kvstore.KVStoreOuterClass.GetPrefixResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPrefixMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPrefixStream gRPC stream方式获取符合key_prefix的多个kv键值对
     * </pre>
     */
    public void getPrefixStream(kvstore.KVStoreOuterClass.GetPrefixStreamRequest request,
        io.grpc.stub.StreamObserver<kvstore.KVStoreOuterClass.GetPrefixStreamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPrefixStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete 删除kv键值对
     * </pre>
     */
    public void delete(kvstore.KVStoreOuterClass.DeleteRequest request,
        io.grpc.stub.StreamObserver<kvstore.KVStoreOuterClass.DeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kvstore.KVStoreOuterClass.PutRequest,
                kvstore.KVStoreOuterClass.PutResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kvstore.KVStoreOuterClass.GetRequest,
                kvstore.KVStoreOuterClass.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getGetPrefixMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kvstore.KVStoreOuterClass.GetPrefixRequest,
                kvstore.KVStoreOuterClass.GetPrefixResponse>(
                  this, METHODID_GET_PREFIX)))
          .addMethod(
            getGetPrefixStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                kvstore.KVStoreOuterClass.GetPrefixStreamRequest,
                kvstore.KVStoreOuterClass.GetPrefixStreamResponse>(
                  this, METHODID_GET_PREFIX_STREAM)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kvstore.KVStoreOuterClass.DeleteRequest,
                kvstore.KVStoreOuterClass.DeleteResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class KVStoreStub extends io.grpc.stub.AbstractStub<KVStoreStub> {
    private KVStoreStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KVStoreStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KVStoreStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KVStoreStub(channel, callOptions);
    }

    /**
     * <pre>
     * Put 创建kv键值对
     * 若key已存在将更新value值
     * </pre>
     */
    public void put(kvstore.KVStoreOuterClass.PutRequest request,
        io.grpc.stub.StreamObserver<kvstore.KVStoreOuterClass.PutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get 获取key的value
     * 若key不存在则返回gRPC错误:NotFound
     * </pre>
     */
    public void get(kvstore.KVStoreOuterClass.GetRequest request,
        io.grpc.stub.StreamObserver<kvstore.KVStoreOuterClass.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetPrefix 获取符合key_prefix的多个kv键值对
     * </pre>
     */
    public void getPrefix(kvstore.KVStoreOuterClass.GetPrefixRequest request,
        io.grpc.stub.StreamObserver<kvstore.KVStoreOuterClass.GetPrefixResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPrefixMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetPrefixStream gRPC stream方式获取符合key_prefix的多个kv键值对
     * </pre>
     */
    public void getPrefixStream(kvstore.KVStoreOuterClass.GetPrefixStreamRequest request,
        io.grpc.stub.StreamObserver<kvstore.KVStoreOuterClass.GetPrefixStreamResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetPrefixStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete 删除kv键值对
     * </pre>
     */
    public void delete(kvstore.KVStoreOuterClass.DeleteRequest request,
        io.grpc.stub.StreamObserver<kvstore.KVStoreOuterClass.DeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KVStoreBlockingStub extends io.grpc.stub.AbstractStub<KVStoreBlockingStub> {
    private KVStoreBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KVStoreBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KVStoreBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KVStoreBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Put 创建kv键值对
     * 若key已存在将更新value值
     * </pre>
     */
    public kvstore.KVStoreOuterClass.PutResponse put(kvstore.KVStoreOuterClass.PutRequest request) {
      return blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get 获取key的value
     * 若key不存在则返回gRPC错误:NotFound
     * </pre>
     */
    public kvstore.KVStoreOuterClass.GetResponse get(kvstore.KVStoreOuterClass.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPrefix 获取符合key_prefix的多个kv键值对
     * </pre>
     */
    public kvstore.KVStoreOuterClass.GetPrefixResponse getPrefix(kvstore.KVStoreOuterClass.GetPrefixRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPrefixMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPrefixStream gRPC stream方式获取符合key_prefix的多个kv键值对
     * </pre>
     */
    public java.util.Iterator<kvstore.KVStoreOuterClass.GetPrefixStreamResponse> getPrefixStream(
        kvstore.KVStoreOuterClass.GetPrefixStreamRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetPrefixStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete 删除kv键值对
     * </pre>
     */
    public kvstore.KVStoreOuterClass.DeleteResponse delete(kvstore.KVStoreOuterClass.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KVStoreFutureStub extends io.grpc.stub.AbstractStub<KVStoreFutureStub> {
    private KVStoreFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KVStoreFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KVStoreFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KVStoreFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Put 创建kv键值对
     * 若key已存在将更新value值
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kvstore.KVStoreOuterClass.PutResponse> put(
        kvstore.KVStoreOuterClass.PutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get 获取key的value
     * 若key不存在则返回gRPC错误:NotFound
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kvstore.KVStoreOuterClass.GetResponse> get(
        kvstore.KVStoreOuterClass.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetPrefix 获取符合key_prefix的多个kv键值对
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kvstore.KVStoreOuterClass.GetPrefixResponse> getPrefix(
        kvstore.KVStoreOuterClass.GetPrefixRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPrefixMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete 删除kv键值对
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kvstore.KVStoreOuterClass.DeleteResponse> delete(
        kvstore.KVStoreOuterClass.DeleteRequest request) {
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
          serviceImpl.put((kvstore.KVStoreOuterClass.PutRequest) request,
              (io.grpc.stub.StreamObserver<kvstore.KVStoreOuterClass.PutResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((kvstore.KVStoreOuterClass.GetRequest) request,
              (io.grpc.stub.StreamObserver<kvstore.KVStoreOuterClass.GetResponse>) responseObserver);
          break;
        case METHODID_GET_PREFIX:
          serviceImpl.getPrefix((kvstore.KVStoreOuterClass.GetPrefixRequest) request,
              (io.grpc.stub.StreamObserver<kvstore.KVStoreOuterClass.GetPrefixResponse>) responseObserver);
          break;
        case METHODID_GET_PREFIX_STREAM:
          serviceImpl.getPrefixStream((kvstore.KVStoreOuterClass.GetPrefixStreamRequest) request,
              (io.grpc.stub.StreamObserver<kvstore.KVStoreOuterClass.GetPrefixStreamResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((kvstore.KVStoreOuterClass.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<kvstore.KVStoreOuterClass.DeleteResponse>) responseObserver);
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
      return kvstore.KVStoreOuterClass.getDescriptor();
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
