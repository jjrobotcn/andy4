package expressionService;

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
    comments = "Source: expression.proto")
public final class ExpressionServiceGrpc {

  private ExpressionServiceGrpc() {}

  public static final String SERVICE_NAME = "expressionService.ExpressionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<expressionService.Expression.PlayExpressionsRequest,
      expressionService.Expression.PlayExpressionsResponse> getPlayExpressionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlayExpressions",
      requestType = expressionService.Expression.PlayExpressionsRequest.class,
      responseType = expressionService.Expression.PlayExpressionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<expressionService.Expression.PlayExpressionsRequest,
      expressionService.Expression.PlayExpressionsResponse> getPlayExpressionsMethod() {
    io.grpc.MethodDescriptor<expressionService.Expression.PlayExpressionsRequest, expressionService.Expression.PlayExpressionsResponse> getPlayExpressionsMethod;
    if ((getPlayExpressionsMethod = ExpressionServiceGrpc.getPlayExpressionsMethod) == null) {
      synchronized (ExpressionServiceGrpc.class) {
        if ((getPlayExpressionsMethod = ExpressionServiceGrpc.getPlayExpressionsMethod) == null) {
          ExpressionServiceGrpc.getPlayExpressionsMethod = getPlayExpressionsMethod = 
              io.grpc.MethodDescriptor.<expressionService.Expression.PlayExpressionsRequest, expressionService.Expression.PlayExpressionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "expressionService.ExpressionService", "PlayExpressions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  expressionService.Expression.PlayExpressionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  expressionService.Expression.PlayExpressionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ExpressionServiceMethodDescriptorSupplier("PlayExpressions"))
                  .build();
          }
        }
     }
     return getPlayExpressionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<expressionService.Expression.StopExpressionRequest,
      expressionService.Expression.StopExpressionResponse> getStopExpressionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopExpression",
      requestType = expressionService.Expression.StopExpressionRequest.class,
      responseType = expressionService.Expression.StopExpressionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<expressionService.Expression.StopExpressionRequest,
      expressionService.Expression.StopExpressionResponse> getStopExpressionMethod() {
    io.grpc.MethodDescriptor<expressionService.Expression.StopExpressionRequest, expressionService.Expression.StopExpressionResponse> getStopExpressionMethod;
    if ((getStopExpressionMethod = ExpressionServiceGrpc.getStopExpressionMethod) == null) {
      synchronized (ExpressionServiceGrpc.class) {
        if ((getStopExpressionMethod = ExpressionServiceGrpc.getStopExpressionMethod) == null) {
          ExpressionServiceGrpc.getStopExpressionMethod = getStopExpressionMethod = 
              io.grpc.MethodDescriptor.<expressionService.Expression.StopExpressionRequest, expressionService.Expression.StopExpressionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "expressionService.ExpressionService", "StopExpression"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  expressionService.Expression.StopExpressionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  expressionService.Expression.StopExpressionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ExpressionServiceMethodDescriptorSupplier("StopExpression"))
                  .build();
          }
        }
     }
     return getStopExpressionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<expressionService.Expression.UploadExpressionFileRequest,
      expressionService.Expression.UploadExpressionFileResponse> getUploadExpressionFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadExpressionFile",
      requestType = expressionService.Expression.UploadExpressionFileRequest.class,
      responseType = expressionService.Expression.UploadExpressionFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<expressionService.Expression.UploadExpressionFileRequest,
      expressionService.Expression.UploadExpressionFileResponse> getUploadExpressionFileMethod() {
    io.grpc.MethodDescriptor<expressionService.Expression.UploadExpressionFileRequest, expressionService.Expression.UploadExpressionFileResponse> getUploadExpressionFileMethod;
    if ((getUploadExpressionFileMethod = ExpressionServiceGrpc.getUploadExpressionFileMethod) == null) {
      synchronized (ExpressionServiceGrpc.class) {
        if ((getUploadExpressionFileMethod = ExpressionServiceGrpc.getUploadExpressionFileMethod) == null) {
          ExpressionServiceGrpc.getUploadExpressionFileMethod = getUploadExpressionFileMethod = 
              io.grpc.MethodDescriptor.<expressionService.Expression.UploadExpressionFileRequest, expressionService.Expression.UploadExpressionFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "expressionService.ExpressionService", "UploadExpressionFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  expressionService.Expression.UploadExpressionFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  expressionService.Expression.UploadExpressionFileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ExpressionServiceMethodDescriptorSupplier("UploadExpressionFile"))
                  .build();
          }
        }
     }
     return getUploadExpressionFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<expressionService.Expression.RenameRequest,
      expressionService.Expression.RenameResponse> getRenameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Rename",
      requestType = expressionService.Expression.RenameRequest.class,
      responseType = expressionService.Expression.RenameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<expressionService.Expression.RenameRequest,
      expressionService.Expression.RenameResponse> getRenameMethod() {
    io.grpc.MethodDescriptor<expressionService.Expression.RenameRequest, expressionService.Expression.RenameResponse> getRenameMethod;
    if ((getRenameMethod = ExpressionServiceGrpc.getRenameMethod) == null) {
      synchronized (ExpressionServiceGrpc.class) {
        if ((getRenameMethod = ExpressionServiceGrpc.getRenameMethod) == null) {
          ExpressionServiceGrpc.getRenameMethod = getRenameMethod = 
              io.grpc.MethodDescriptor.<expressionService.Expression.RenameRequest, expressionService.Expression.RenameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "expressionService.ExpressionService", "Rename"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  expressionService.Expression.RenameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  expressionService.Expression.RenameResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ExpressionServiceMethodDescriptorSupplier("Rename"))
                  .build();
          }
        }
     }
     return getRenameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<expressionService.Expression.ListExpressionsRequest,
      expressionService.Expression.ListExpressionsResponse> getListExpressionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListExpressions",
      requestType = expressionService.Expression.ListExpressionsRequest.class,
      responseType = expressionService.Expression.ListExpressionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<expressionService.Expression.ListExpressionsRequest,
      expressionService.Expression.ListExpressionsResponse> getListExpressionsMethod() {
    io.grpc.MethodDescriptor<expressionService.Expression.ListExpressionsRequest, expressionService.Expression.ListExpressionsResponse> getListExpressionsMethod;
    if ((getListExpressionsMethod = ExpressionServiceGrpc.getListExpressionsMethod) == null) {
      synchronized (ExpressionServiceGrpc.class) {
        if ((getListExpressionsMethod = ExpressionServiceGrpc.getListExpressionsMethod) == null) {
          ExpressionServiceGrpc.getListExpressionsMethod = getListExpressionsMethod = 
              io.grpc.MethodDescriptor.<expressionService.Expression.ListExpressionsRequest, expressionService.Expression.ListExpressionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "expressionService.ExpressionService", "ListExpressions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  expressionService.Expression.ListExpressionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  expressionService.Expression.ListExpressionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ExpressionServiceMethodDescriptorSupplier("ListExpressions"))
                  .build();
          }
        }
     }
     return getListExpressionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<expressionService.Expression.DeleteExpressionsRequest,
      expressionService.Expression.DeleteExpressionsResponse> getDeleteExpressionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteExpressions",
      requestType = expressionService.Expression.DeleteExpressionsRequest.class,
      responseType = expressionService.Expression.DeleteExpressionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<expressionService.Expression.DeleteExpressionsRequest,
      expressionService.Expression.DeleteExpressionsResponse> getDeleteExpressionsMethod() {
    io.grpc.MethodDescriptor<expressionService.Expression.DeleteExpressionsRequest, expressionService.Expression.DeleteExpressionsResponse> getDeleteExpressionsMethod;
    if ((getDeleteExpressionsMethod = ExpressionServiceGrpc.getDeleteExpressionsMethod) == null) {
      synchronized (ExpressionServiceGrpc.class) {
        if ((getDeleteExpressionsMethod = ExpressionServiceGrpc.getDeleteExpressionsMethod) == null) {
          ExpressionServiceGrpc.getDeleteExpressionsMethod = getDeleteExpressionsMethod = 
              io.grpc.MethodDescriptor.<expressionService.Expression.DeleteExpressionsRequest, expressionService.Expression.DeleteExpressionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "expressionService.ExpressionService", "DeleteExpressions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  expressionService.Expression.DeleteExpressionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  expressionService.Expression.DeleteExpressionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ExpressionServiceMethodDescriptorSupplier("DeleteExpressions"))
                  .build();
          }
        }
     }
     return getDeleteExpressionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExpressionServiceStub newStub(io.grpc.Channel channel) {
    return new ExpressionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExpressionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ExpressionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExpressionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ExpressionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ExpressionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 播放表情
     * </pre>
     */
    public void playExpressions(expressionService.Expression.PlayExpressionsRequest request,
        io.grpc.stub.StreamObserver<expressionService.Expression.PlayExpressionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPlayExpressionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 停止表情
     * </pre>
     */
    public void stopExpression(expressionService.Expression.StopExpressionRequest request,
        io.grpc.stub.StreamObserver<expressionService.Expression.StopExpressionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStopExpressionMethod(), responseObserver);
    }

    /**
     * <pre>
     * 上传表情
     * </pre>
     */
    public void uploadExpressionFile(expressionService.Expression.UploadExpressionFileRequest request,
        io.grpc.stub.StreamObserver<expressionService.Expression.UploadExpressionFileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUploadExpressionFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * 表情重命名
     * &gt;= v1.1.0
     * </pre>
     */
    public void rename(expressionService.Expression.RenameRequest request,
        io.grpc.stub.StreamObserver<expressionService.Expression.RenameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRenameMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取表情数据
     * </pre>
     */
    public void listExpressions(expressionService.Expression.ListExpressionsRequest request,
        io.grpc.stub.StreamObserver<expressionService.Expression.ListExpressionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListExpressionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除表情
     * </pre>
     */
    public void deleteExpressions(expressionService.Expression.DeleteExpressionsRequest request,
        io.grpc.stub.StreamObserver<expressionService.Expression.DeleteExpressionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteExpressionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPlayExpressionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                expressionService.Expression.PlayExpressionsRequest,
                expressionService.Expression.PlayExpressionsResponse>(
                  this, METHODID_PLAY_EXPRESSIONS)))
          .addMethod(
            getStopExpressionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                expressionService.Expression.StopExpressionRequest,
                expressionService.Expression.StopExpressionResponse>(
                  this, METHODID_STOP_EXPRESSION)))
          .addMethod(
            getUploadExpressionFileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                expressionService.Expression.UploadExpressionFileRequest,
                expressionService.Expression.UploadExpressionFileResponse>(
                  this, METHODID_UPLOAD_EXPRESSION_FILE)))
          .addMethod(
            getRenameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                expressionService.Expression.RenameRequest,
                expressionService.Expression.RenameResponse>(
                  this, METHODID_RENAME)))
          .addMethod(
            getListExpressionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                expressionService.Expression.ListExpressionsRequest,
                expressionService.Expression.ListExpressionsResponse>(
                  this, METHODID_LIST_EXPRESSIONS)))
          .addMethod(
            getDeleteExpressionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                expressionService.Expression.DeleteExpressionsRequest,
                expressionService.Expression.DeleteExpressionsResponse>(
                  this, METHODID_DELETE_EXPRESSIONS)))
          .build();
    }
  }

  /**
   */
  public static final class ExpressionServiceStub extends io.grpc.stub.AbstractStub<ExpressionServiceStub> {
    private ExpressionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExpressionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExpressionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExpressionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 播放表情
     * </pre>
     */
    public void playExpressions(expressionService.Expression.PlayExpressionsRequest request,
        io.grpc.stub.StreamObserver<expressionService.Expression.PlayExpressionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPlayExpressionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 停止表情
     * </pre>
     */
    public void stopExpression(expressionService.Expression.StopExpressionRequest request,
        io.grpc.stub.StreamObserver<expressionService.Expression.StopExpressionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopExpressionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 上传表情
     * </pre>
     */
    public void uploadExpressionFile(expressionService.Expression.UploadExpressionFileRequest request,
        io.grpc.stub.StreamObserver<expressionService.Expression.UploadExpressionFileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUploadExpressionFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 表情重命名
     * &gt;= v1.1.0
     * </pre>
     */
    public void rename(expressionService.Expression.RenameRequest request,
        io.grpc.stub.StreamObserver<expressionService.Expression.RenameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRenameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取表情数据
     * </pre>
     */
    public void listExpressions(expressionService.Expression.ListExpressionsRequest request,
        io.grpc.stub.StreamObserver<expressionService.Expression.ListExpressionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListExpressionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除表情
     * </pre>
     */
    public void deleteExpressions(expressionService.Expression.DeleteExpressionsRequest request,
        io.grpc.stub.StreamObserver<expressionService.Expression.DeleteExpressionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteExpressionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ExpressionServiceBlockingStub extends io.grpc.stub.AbstractStub<ExpressionServiceBlockingStub> {
    private ExpressionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExpressionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExpressionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExpressionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 播放表情
     * </pre>
     */
    public expressionService.Expression.PlayExpressionsResponse playExpressions(expressionService.Expression.PlayExpressionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPlayExpressionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 停止表情
     * </pre>
     */
    public expressionService.Expression.StopExpressionResponse stopExpression(expressionService.Expression.StopExpressionRequest request) {
      return blockingUnaryCall(
          getChannel(), getStopExpressionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 上传表情
     * </pre>
     */
    public expressionService.Expression.UploadExpressionFileResponse uploadExpressionFile(expressionService.Expression.UploadExpressionFileRequest request) {
      return blockingUnaryCall(
          getChannel(), getUploadExpressionFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 表情重命名
     * &gt;= v1.1.0
     * </pre>
     */
    public expressionService.Expression.RenameResponse rename(expressionService.Expression.RenameRequest request) {
      return blockingUnaryCall(
          getChannel(), getRenameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取表情数据
     * </pre>
     */
    public expressionService.Expression.ListExpressionsResponse listExpressions(expressionService.Expression.ListExpressionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListExpressionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除表情
     * </pre>
     */
    public expressionService.Expression.DeleteExpressionsResponse deleteExpressions(expressionService.Expression.DeleteExpressionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteExpressionsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ExpressionServiceFutureStub extends io.grpc.stub.AbstractStub<ExpressionServiceFutureStub> {
    private ExpressionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExpressionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExpressionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExpressionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 播放表情
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<expressionService.Expression.PlayExpressionsResponse> playExpressions(
        expressionService.Expression.PlayExpressionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPlayExpressionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 停止表情
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<expressionService.Expression.StopExpressionResponse> stopExpression(
        expressionService.Expression.StopExpressionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStopExpressionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 上传表情
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<expressionService.Expression.UploadExpressionFileResponse> uploadExpressionFile(
        expressionService.Expression.UploadExpressionFileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUploadExpressionFileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 表情重命名
     * &gt;= v1.1.0
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<expressionService.Expression.RenameResponse> rename(
        expressionService.Expression.RenameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRenameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取表情数据
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<expressionService.Expression.ListExpressionsResponse> listExpressions(
        expressionService.Expression.ListExpressionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListExpressionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除表情
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<expressionService.Expression.DeleteExpressionsResponse> deleteExpressions(
        expressionService.Expression.DeleteExpressionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteExpressionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PLAY_EXPRESSIONS = 0;
  private static final int METHODID_STOP_EXPRESSION = 1;
  private static final int METHODID_UPLOAD_EXPRESSION_FILE = 2;
  private static final int METHODID_RENAME = 3;
  private static final int METHODID_LIST_EXPRESSIONS = 4;
  private static final int METHODID_DELETE_EXPRESSIONS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExpressionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ExpressionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PLAY_EXPRESSIONS:
          serviceImpl.playExpressions((expressionService.Expression.PlayExpressionsRequest) request,
              (io.grpc.stub.StreamObserver<expressionService.Expression.PlayExpressionsResponse>) responseObserver);
          break;
        case METHODID_STOP_EXPRESSION:
          serviceImpl.stopExpression((expressionService.Expression.StopExpressionRequest) request,
              (io.grpc.stub.StreamObserver<expressionService.Expression.StopExpressionResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_EXPRESSION_FILE:
          serviceImpl.uploadExpressionFile((expressionService.Expression.UploadExpressionFileRequest) request,
              (io.grpc.stub.StreamObserver<expressionService.Expression.UploadExpressionFileResponse>) responseObserver);
          break;
        case METHODID_RENAME:
          serviceImpl.rename((expressionService.Expression.RenameRequest) request,
              (io.grpc.stub.StreamObserver<expressionService.Expression.RenameResponse>) responseObserver);
          break;
        case METHODID_LIST_EXPRESSIONS:
          serviceImpl.listExpressions((expressionService.Expression.ListExpressionsRequest) request,
              (io.grpc.stub.StreamObserver<expressionService.Expression.ListExpressionsResponse>) responseObserver);
          break;
        case METHODID_DELETE_EXPRESSIONS:
          serviceImpl.deleteExpressions((expressionService.Expression.DeleteExpressionsRequest) request,
              (io.grpc.stub.StreamObserver<expressionService.Expression.DeleteExpressionsResponse>) responseObserver);
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

  private static abstract class ExpressionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExpressionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return expressionService.Expression.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExpressionService");
    }
  }

  private static final class ExpressionServiceFileDescriptorSupplier
      extends ExpressionServiceBaseDescriptorSupplier {
    ExpressionServiceFileDescriptorSupplier() {}
  }

  private static final class ExpressionServiceMethodDescriptorSupplier
      extends ExpressionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ExpressionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ExpressionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExpressionServiceFileDescriptorSupplier())
              .addMethod(getPlayExpressionsMethod())
              .addMethod(getStopExpressionMethod())
              .addMethod(getUploadExpressionFileMethod())
              .addMethod(getRenameMethod())
              .addMethod(getListExpressionsMethod())
              .addMethod(getDeleteExpressionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
