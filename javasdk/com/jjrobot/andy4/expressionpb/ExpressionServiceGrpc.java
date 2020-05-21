package com.jjrobot.andy4.expressionpb;

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
 * expressionService.ExpressionService 表情管理
 * 开发管理平台功能参考: http://10.10.10.2/expression/
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.1-SNAPSHOT)",
    comments = "Source: expression.proto")
public final class ExpressionServiceGrpc {

  private ExpressionServiceGrpc() {}

  public static final String SERVICE_NAME = "expressionService.ExpressionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.expressionpb.ExpressionServicePB.PlayExpressionsRequest,
      com.jjrobot.andy4.expressionpb.ExpressionServicePB.PlayExpressionsResponse> getPlayExpressionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlayExpressions",
      requestType = com.jjrobot.andy4.expressionpb.ExpressionServicePB.PlayExpressionsRequest.class,
      responseType = com.jjrobot.andy4.expressionpb.ExpressionServicePB.PlayExpressionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.expressionpb.ExpressionServicePB.PlayExpressionsRequest,
      com.jjrobot.andy4.expressionpb.ExpressionServicePB.PlayExpressionsResponse> getPlayExpressionsMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.expressionpb.ExpressionServicePB.PlayExpressionsRequest, com.jjrobot.andy4.expressionpb.ExpressionServicePB.PlayExpressionsResponse> getPlayExpressionsMethod;
    if ((getPlayExpressionsMethod = ExpressionServiceGrpc.getPlayExpressionsMethod) == null) {
      synchronized (ExpressionServiceGrpc.class) {
        if ((getPlayExpressionsMethod = ExpressionServiceGrpc.getPlayExpressionsMethod) == null) {
          ExpressionServiceGrpc.getPlayExpressionsMethod = getPlayExpressionsMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.expressionpb.ExpressionServicePB.PlayExpressionsRequest, com.jjrobot.andy4.expressionpb.ExpressionServicePB.PlayExpressionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlayExpressions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.expressionpb.ExpressionServicePB.PlayExpressionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.expressionpb.ExpressionServicePB.PlayExpressionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExpressionServiceMethodDescriptorSupplier("PlayExpressions"))
              .build();
        }
      }
    }
    return getPlayExpressionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.expressionpb.ExpressionServicePB.StopExpressionRequest,
      com.jjrobot.andy4.expressionpb.ExpressionServicePB.StopExpressionResponse> getStopExpressionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopExpression",
      requestType = com.jjrobot.andy4.expressionpb.ExpressionServicePB.StopExpressionRequest.class,
      responseType = com.jjrobot.andy4.expressionpb.ExpressionServicePB.StopExpressionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.expressionpb.ExpressionServicePB.StopExpressionRequest,
      com.jjrobot.andy4.expressionpb.ExpressionServicePB.StopExpressionResponse> getStopExpressionMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.expressionpb.ExpressionServicePB.StopExpressionRequest, com.jjrobot.andy4.expressionpb.ExpressionServicePB.StopExpressionResponse> getStopExpressionMethod;
    if ((getStopExpressionMethod = ExpressionServiceGrpc.getStopExpressionMethod) == null) {
      synchronized (ExpressionServiceGrpc.class) {
        if ((getStopExpressionMethod = ExpressionServiceGrpc.getStopExpressionMethod) == null) {
          ExpressionServiceGrpc.getStopExpressionMethod = getStopExpressionMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.expressionpb.ExpressionServicePB.StopExpressionRequest, com.jjrobot.andy4.expressionpb.ExpressionServicePB.StopExpressionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopExpression"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.expressionpb.ExpressionServicePB.StopExpressionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.expressionpb.ExpressionServicePB.StopExpressionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExpressionServiceMethodDescriptorSupplier("StopExpression"))
              .build();
        }
      }
    }
    return getStopExpressionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.expressionpb.ExpressionServicePB.UploadExpressionFileRequest,
      com.jjrobot.andy4.expressionpb.ExpressionServicePB.UploadExpressionFileResponse> getUploadExpressionFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadExpressionFile",
      requestType = com.jjrobot.andy4.expressionpb.ExpressionServicePB.UploadExpressionFileRequest.class,
      responseType = com.jjrobot.andy4.expressionpb.ExpressionServicePB.UploadExpressionFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.expressionpb.ExpressionServicePB.UploadExpressionFileRequest,
      com.jjrobot.andy4.expressionpb.ExpressionServicePB.UploadExpressionFileResponse> getUploadExpressionFileMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.expressionpb.ExpressionServicePB.UploadExpressionFileRequest, com.jjrobot.andy4.expressionpb.ExpressionServicePB.UploadExpressionFileResponse> getUploadExpressionFileMethod;
    if ((getUploadExpressionFileMethod = ExpressionServiceGrpc.getUploadExpressionFileMethod) == null) {
      synchronized (ExpressionServiceGrpc.class) {
        if ((getUploadExpressionFileMethod = ExpressionServiceGrpc.getUploadExpressionFileMethod) == null) {
          ExpressionServiceGrpc.getUploadExpressionFileMethod = getUploadExpressionFileMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.expressionpb.ExpressionServicePB.UploadExpressionFileRequest, com.jjrobot.andy4.expressionpb.ExpressionServicePB.UploadExpressionFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadExpressionFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.expressionpb.ExpressionServicePB.UploadExpressionFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.expressionpb.ExpressionServicePB.UploadExpressionFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExpressionServiceMethodDescriptorSupplier("UploadExpressionFile"))
              .build();
        }
      }
    }
    return getUploadExpressionFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.expressionpb.ExpressionServicePB.RenameRequest,
      com.jjrobot.andy4.expressionpb.ExpressionServicePB.RenameResponse> getRenameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Rename",
      requestType = com.jjrobot.andy4.expressionpb.ExpressionServicePB.RenameRequest.class,
      responseType = com.jjrobot.andy4.expressionpb.ExpressionServicePB.RenameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.expressionpb.ExpressionServicePB.RenameRequest,
      com.jjrobot.andy4.expressionpb.ExpressionServicePB.RenameResponse> getRenameMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.expressionpb.ExpressionServicePB.RenameRequest, com.jjrobot.andy4.expressionpb.ExpressionServicePB.RenameResponse> getRenameMethod;
    if ((getRenameMethod = ExpressionServiceGrpc.getRenameMethod) == null) {
      synchronized (ExpressionServiceGrpc.class) {
        if ((getRenameMethod = ExpressionServiceGrpc.getRenameMethod) == null) {
          ExpressionServiceGrpc.getRenameMethod = getRenameMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.expressionpb.ExpressionServicePB.RenameRequest, com.jjrobot.andy4.expressionpb.ExpressionServicePB.RenameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Rename"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.expressionpb.ExpressionServicePB.RenameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.expressionpb.ExpressionServicePB.RenameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExpressionServiceMethodDescriptorSupplier("Rename"))
              .build();
        }
      }
    }
    return getRenameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.expressionpb.ExpressionServicePB.ListExpressionsRequest,
      com.jjrobot.andy4.expressionpb.ExpressionServicePB.ListExpressionsResponse> getListExpressionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListExpressions",
      requestType = com.jjrobot.andy4.expressionpb.ExpressionServicePB.ListExpressionsRequest.class,
      responseType = com.jjrobot.andy4.expressionpb.ExpressionServicePB.ListExpressionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.expressionpb.ExpressionServicePB.ListExpressionsRequest,
      com.jjrobot.andy4.expressionpb.ExpressionServicePB.ListExpressionsResponse> getListExpressionsMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.expressionpb.ExpressionServicePB.ListExpressionsRequest, com.jjrobot.andy4.expressionpb.ExpressionServicePB.ListExpressionsResponse> getListExpressionsMethod;
    if ((getListExpressionsMethod = ExpressionServiceGrpc.getListExpressionsMethod) == null) {
      synchronized (ExpressionServiceGrpc.class) {
        if ((getListExpressionsMethod = ExpressionServiceGrpc.getListExpressionsMethod) == null) {
          ExpressionServiceGrpc.getListExpressionsMethod = getListExpressionsMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.expressionpb.ExpressionServicePB.ListExpressionsRequest, com.jjrobot.andy4.expressionpb.ExpressionServicePB.ListExpressionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListExpressions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.expressionpb.ExpressionServicePB.ListExpressionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.expressionpb.ExpressionServicePB.ListExpressionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExpressionServiceMethodDescriptorSupplier("ListExpressions"))
              .build();
        }
      }
    }
    return getListExpressionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.expressionpb.ExpressionServicePB.DeleteExpressionsRequest,
      com.jjrobot.andy4.expressionpb.ExpressionServicePB.DeleteExpressionsResponse> getDeleteExpressionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteExpressions",
      requestType = com.jjrobot.andy4.expressionpb.ExpressionServicePB.DeleteExpressionsRequest.class,
      responseType = com.jjrobot.andy4.expressionpb.ExpressionServicePB.DeleteExpressionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.expressionpb.ExpressionServicePB.DeleteExpressionsRequest,
      com.jjrobot.andy4.expressionpb.ExpressionServicePB.DeleteExpressionsResponse> getDeleteExpressionsMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.expressionpb.ExpressionServicePB.DeleteExpressionsRequest, com.jjrobot.andy4.expressionpb.ExpressionServicePB.DeleteExpressionsResponse> getDeleteExpressionsMethod;
    if ((getDeleteExpressionsMethod = ExpressionServiceGrpc.getDeleteExpressionsMethod) == null) {
      synchronized (ExpressionServiceGrpc.class) {
        if ((getDeleteExpressionsMethod = ExpressionServiceGrpc.getDeleteExpressionsMethod) == null) {
          ExpressionServiceGrpc.getDeleteExpressionsMethod = getDeleteExpressionsMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.expressionpb.ExpressionServicePB.DeleteExpressionsRequest, com.jjrobot.andy4.expressionpb.ExpressionServicePB.DeleteExpressionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteExpressions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.expressionpb.ExpressionServicePB.DeleteExpressionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.expressionpb.ExpressionServicePB.DeleteExpressionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExpressionServiceMethodDescriptorSupplier("DeleteExpressions"))
              .build();
        }
      }
    }
    return getDeleteExpressionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.expressionpb.ExpressionServicePB.StateRequest,
      com.jjrobot.andy4.expressionpb.ExpressionServicePB.StateResponse> getStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "State",
      requestType = com.jjrobot.andy4.expressionpb.ExpressionServicePB.StateRequest.class,
      responseType = com.jjrobot.andy4.expressionpb.ExpressionServicePB.StateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.expressionpb.ExpressionServicePB.StateRequest,
      com.jjrobot.andy4.expressionpb.ExpressionServicePB.StateResponse> getStateMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.expressionpb.ExpressionServicePB.StateRequest, com.jjrobot.andy4.expressionpb.ExpressionServicePB.StateResponse> getStateMethod;
    if ((getStateMethod = ExpressionServiceGrpc.getStateMethod) == null) {
      synchronized (ExpressionServiceGrpc.class) {
        if ((getStateMethod = ExpressionServiceGrpc.getStateMethod) == null) {
          ExpressionServiceGrpc.getStateMethod = getStateMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.expressionpb.ExpressionServicePB.StateRequest, com.jjrobot.andy4.expressionpb.ExpressionServicePB.StateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "State"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.expressionpb.ExpressionServicePB.StateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.expressionpb.ExpressionServicePB.StateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExpressionServiceMethodDescriptorSupplier("State"))
              .build();
        }
      }
    }
    return getStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.expressionpb.ExpressionServicePB.SwitchRequest,
      com.jjrobot.andy4.expressionpb.ExpressionServicePB.SwitchResponse> getSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Switch",
      requestType = com.jjrobot.andy4.expressionpb.ExpressionServicePB.SwitchRequest.class,
      responseType = com.jjrobot.andy4.expressionpb.ExpressionServicePB.SwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.expressionpb.ExpressionServicePB.SwitchRequest,
      com.jjrobot.andy4.expressionpb.ExpressionServicePB.SwitchResponse> getSwitchMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.expressionpb.ExpressionServicePB.SwitchRequest, com.jjrobot.andy4.expressionpb.ExpressionServicePB.SwitchResponse> getSwitchMethod;
    if ((getSwitchMethod = ExpressionServiceGrpc.getSwitchMethod) == null) {
      synchronized (ExpressionServiceGrpc.class) {
        if ((getSwitchMethod = ExpressionServiceGrpc.getSwitchMethod) == null) {
          ExpressionServiceGrpc.getSwitchMethod = getSwitchMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.expressionpb.ExpressionServicePB.SwitchRequest, com.jjrobot.andy4.expressionpb.ExpressionServicePB.SwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Switch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.expressionpb.ExpressionServicePB.SwitchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.expressionpb.ExpressionServicePB.SwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExpressionServiceMethodDescriptorSupplier("Switch"))
              .build();
        }
      }
    }
    return getSwitchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExpressionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExpressionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExpressionServiceStub>() {
        @java.lang.Override
        public ExpressionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExpressionServiceStub(channel, callOptions);
        }
      };
    return ExpressionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExpressionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExpressionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExpressionServiceBlockingStub>() {
        @java.lang.Override
        public ExpressionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExpressionServiceBlockingStub(channel, callOptions);
        }
      };
    return ExpressionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExpressionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExpressionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExpressionServiceFutureStub>() {
        @java.lang.Override
        public ExpressionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExpressionServiceFutureStub(channel, callOptions);
        }
      };
    return ExpressionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * expressionService.ExpressionService 表情管理
   * 开发管理平台功能参考: http://10.10.10.2/expression/
   * </pre>
   */
  public static abstract class ExpressionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * PlayExpressions 播放表情组合
     * 单套表情限制请参考UploadExpressionFile方法，
     * 更为复杂的表情设计可基于多个最小化表情进行组合
     * </pre>
     */
    public void playExpressions(com.jjrobot.andy4.expressionpb.ExpressionServicePB.PlayExpressionsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.expressionpb.ExpressionServicePB.PlayExpressionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPlayExpressionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * StopExpression 停止表情播放
     * 此方法将表现为播放至当前帧终止，不会恢复为当前表情的首帧
     * </pre>
     */
    public void stopExpression(com.jjrobot.andy4.expressionpb.ExpressionServicePB.StopExpressionRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.expressionpb.ExpressionServicePB.StopExpressionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStopExpressionMethod(), responseObserver);
    }

    /**
     * <pre>
     * UploadExpressionFile 上传表情文件
     * 上传表情图片zip文件，用于构建新的表情
     * 表情文件为zip格式数据，如Example.zip文件上传后该表情将命名为"Example"，命名可通过Rename方法进行更改
     * windows用户请在表情目录中选中preview.png, left目录，right目录，直接压缩为zip文件，不支持包含父目录
     * 表情包目录示例：
     * left与right目录图片数量最大限制为各10张
     *├── preview.png # 表情预览文件，与表情数据无关，仅作为预览图用
     *│
     *├── left # 左眼表情数据
     *│   ├── 1.png
     *│   ├── 2.png
     *│   ├── 3.png
     *│   ├── 4.png
     *│   └── 5.png
     *│
     *└── right # 右眼表情数据
     *    ├── 1.png
     *    ├── 2.png
     *    ├── 3.png
     *    ├── 4.png
     *    └── 5.png
     * 网关不包含当前方法，HTTP上传请使用以下接口
     * POST /api/v2/expression/upload_expression_file
     * Content-Type: application/x-www-form-urlencoded
     * Body:
     *   - name: String
     *   - e: File, e.g. Example.zip
     * </pre>
     */
    public void uploadExpressionFile(com.jjrobot.andy4.expressionpb.ExpressionServicePB.UploadExpressionFileRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.expressionpb.ExpressionServicePB.UploadExpressionFileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUploadExpressionFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Rename 对已上传的表情进行重命名
     * </pre>
     */
    public void rename(com.jjrobot.andy4.expressionpb.ExpressionServicePB.RenameRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.expressionpb.ExpressionServicePB.RenameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRenameMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListExpressions 获取表情列表
     * </pre>
     */
    public void listExpressions(com.jjrobot.andy4.expressionpb.ExpressionServicePB.ListExpressionsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.expressionpb.ExpressionServicePB.ListExpressionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListExpressionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteExpressions 删除表情列表
     * </pre>
     */
    public void deleteExpressions(com.jjrobot.andy4.expressionpb.ExpressionServicePB.DeleteExpressionsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.expressionpb.ExpressionServicePB.DeleteExpressionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteExpressionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * State 获取当前表情模块状态
     * </pre>
     */
    public void state(com.jjrobot.andy4.expressionpb.ExpressionServicePB.StateRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.expressionpb.ExpressionServicePB.StateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Switch 控制表情的开关
     * 关闭时将表现为黑屏
     * </pre>
     */
    public void switch_(com.jjrobot.andy4.expressionpb.ExpressionServicePB.SwitchRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.expressionpb.ExpressionServicePB.SwitchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPlayExpressionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.expressionpb.ExpressionServicePB.PlayExpressionsRequest,
                com.jjrobot.andy4.expressionpb.ExpressionServicePB.PlayExpressionsResponse>(
                  this, METHODID_PLAY_EXPRESSIONS)))
          .addMethod(
            getStopExpressionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.expressionpb.ExpressionServicePB.StopExpressionRequest,
                com.jjrobot.andy4.expressionpb.ExpressionServicePB.StopExpressionResponse>(
                  this, METHODID_STOP_EXPRESSION)))
          .addMethod(
            getUploadExpressionFileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.expressionpb.ExpressionServicePB.UploadExpressionFileRequest,
                com.jjrobot.andy4.expressionpb.ExpressionServicePB.UploadExpressionFileResponse>(
                  this, METHODID_UPLOAD_EXPRESSION_FILE)))
          .addMethod(
            getRenameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.expressionpb.ExpressionServicePB.RenameRequest,
                com.jjrobot.andy4.expressionpb.ExpressionServicePB.RenameResponse>(
                  this, METHODID_RENAME)))
          .addMethod(
            getListExpressionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.expressionpb.ExpressionServicePB.ListExpressionsRequest,
                com.jjrobot.andy4.expressionpb.ExpressionServicePB.ListExpressionsResponse>(
                  this, METHODID_LIST_EXPRESSIONS)))
          .addMethod(
            getDeleteExpressionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.expressionpb.ExpressionServicePB.DeleteExpressionsRequest,
                com.jjrobot.andy4.expressionpb.ExpressionServicePB.DeleteExpressionsResponse>(
                  this, METHODID_DELETE_EXPRESSIONS)))
          .addMethod(
            getStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.expressionpb.ExpressionServicePB.StateRequest,
                com.jjrobot.andy4.expressionpb.ExpressionServicePB.StateResponse>(
                  this, METHODID_STATE)))
          .addMethod(
            getSwitchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.expressionpb.ExpressionServicePB.SwitchRequest,
                com.jjrobot.andy4.expressionpb.ExpressionServicePB.SwitchResponse>(
                  this, METHODID_SWITCH)))
          .build();
    }
  }

  /**
   * <pre>
   * expressionService.ExpressionService 表情管理
   * 开发管理平台功能参考: http://10.10.10.2/expression/
   * </pre>
   */
  public static final class ExpressionServiceStub extends io.grpc.stub.AbstractAsyncStub<ExpressionServiceStub> {
    private ExpressionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExpressionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExpressionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * PlayExpressions 播放表情组合
     * 单套表情限制请参考UploadExpressionFile方法，
     * 更为复杂的表情设计可基于多个最小化表情进行组合
     * </pre>
     */
    public void playExpressions(com.jjrobot.andy4.expressionpb.ExpressionServicePB.PlayExpressionsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.expressionpb.ExpressionServicePB.PlayExpressionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPlayExpressionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StopExpression 停止表情播放
     * 此方法将表现为播放至当前帧终止，不会恢复为当前表情的首帧
     * </pre>
     */
    public void stopExpression(com.jjrobot.andy4.expressionpb.ExpressionServicePB.StopExpressionRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.expressionpb.ExpressionServicePB.StopExpressionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopExpressionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UploadExpressionFile 上传表情文件
     * 上传表情图片zip文件，用于构建新的表情
     * 表情文件为zip格式数据，如Example.zip文件上传后该表情将命名为"Example"，命名可通过Rename方法进行更改
     * windows用户请在表情目录中选中preview.png, left目录，right目录，直接压缩为zip文件，不支持包含父目录
     * 表情包目录示例：
     * left与right目录图片数量最大限制为各10张
     *├── preview.png # 表情预览文件，与表情数据无关，仅作为预览图用
     *│
     *├── left # 左眼表情数据
     *│   ├── 1.png
     *│   ├── 2.png
     *│   ├── 3.png
     *│   ├── 4.png
     *│   └── 5.png
     *│
     *└── right # 右眼表情数据
     *    ├── 1.png
     *    ├── 2.png
     *    ├── 3.png
     *    ├── 4.png
     *    └── 5.png
     * 网关不包含当前方法，HTTP上传请使用以下接口
     * POST /api/v2/expression/upload_expression_file
     * Content-Type: application/x-www-form-urlencoded
     * Body:
     *   - name: String
     *   - e: File, e.g. Example.zip
     * </pre>
     */
    public void uploadExpressionFile(com.jjrobot.andy4.expressionpb.ExpressionServicePB.UploadExpressionFileRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.expressionpb.ExpressionServicePB.UploadExpressionFileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUploadExpressionFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Rename 对已上传的表情进行重命名
     * </pre>
     */
    public void rename(com.jjrobot.andy4.expressionpb.ExpressionServicePB.RenameRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.expressionpb.ExpressionServicePB.RenameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRenameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListExpressions 获取表情列表
     * </pre>
     */
    public void listExpressions(com.jjrobot.andy4.expressionpb.ExpressionServicePB.ListExpressionsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.expressionpb.ExpressionServicePB.ListExpressionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListExpressionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteExpressions 删除表情列表
     * </pre>
     */
    public void deleteExpressions(com.jjrobot.andy4.expressionpb.ExpressionServicePB.DeleteExpressionsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.expressionpb.ExpressionServicePB.DeleteExpressionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteExpressionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * State 获取当前表情模块状态
     * </pre>
     */
    public void state(com.jjrobot.andy4.expressionpb.ExpressionServicePB.StateRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.expressionpb.ExpressionServicePB.StateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Switch 控制表情的开关
     * 关闭时将表现为黑屏
     * </pre>
     */
    public void switch_(com.jjrobot.andy4.expressionpb.ExpressionServicePB.SwitchRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.expressionpb.ExpressionServicePB.SwitchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * expressionService.ExpressionService 表情管理
   * 开发管理平台功能参考: http://10.10.10.2/expression/
   * </pre>
   */
  public static final class ExpressionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ExpressionServiceBlockingStub> {
    private ExpressionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExpressionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExpressionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * PlayExpressions 播放表情组合
     * 单套表情限制请参考UploadExpressionFile方法，
     * 更为复杂的表情设计可基于多个最小化表情进行组合
     * </pre>
     */
    public com.jjrobot.andy4.expressionpb.ExpressionServicePB.PlayExpressionsResponse playExpressions(com.jjrobot.andy4.expressionpb.ExpressionServicePB.PlayExpressionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPlayExpressionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StopExpression 停止表情播放
     * 此方法将表现为播放至当前帧终止，不会恢复为当前表情的首帧
     * </pre>
     */
    public com.jjrobot.andy4.expressionpb.ExpressionServicePB.StopExpressionResponse stopExpression(com.jjrobot.andy4.expressionpb.ExpressionServicePB.StopExpressionRequest request) {
      return blockingUnaryCall(
          getChannel(), getStopExpressionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UploadExpressionFile 上传表情文件
     * 上传表情图片zip文件，用于构建新的表情
     * 表情文件为zip格式数据，如Example.zip文件上传后该表情将命名为"Example"，命名可通过Rename方法进行更改
     * windows用户请在表情目录中选中preview.png, left目录，right目录，直接压缩为zip文件，不支持包含父目录
     * 表情包目录示例：
     * left与right目录图片数量最大限制为各10张
     *├── preview.png # 表情预览文件，与表情数据无关，仅作为预览图用
     *│
     *├── left # 左眼表情数据
     *│   ├── 1.png
     *│   ├── 2.png
     *│   ├── 3.png
     *│   ├── 4.png
     *│   └── 5.png
     *│
     *└── right # 右眼表情数据
     *    ├── 1.png
     *    ├── 2.png
     *    ├── 3.png
     *    ├── 4.png
     *    └── 5.png
     * 网关不包含当前方法，HTTP上传请使用以下接口
     * POST /api/v2/expression/upload_expression_file
     * Content-Type: application/x-www-form-urlencoded
     * Body:
     *   - name: String
     *   - e: File, e.g. Example.zip
     * </pre>
     */
    public com.jjrobot.andy4.expressionpb.ExpressionServicePB.UploadExpressionFileResponse uploadExpressionFile(com.jjrobot.andy4.expressionpb.ExpressionServicePB.UploadExpressionFileRequest request) {
      return blockingUnaryCall(
          getChannel(), getUploadExpressionFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Rename 对已上传的表情进行重命名
     * </pre>
     */
    public com.jjrobot.andy4.expressionpb.ExpressionServicePB.RenameResponse rename(com.jjrobot.andy4.expressionpb.ExpressionServicePB.RenameRequest request) {
      return blockingUnaryCall(
          getChannel(), getRenameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListExpressions 获取表情列表
     * </pre>
     */
    public com.jjrobot.andy4.expressionpb.ExpressionServicePB.ListExpressionsResponse listExpressions(com.jjrobot.andy4.expressionpb.ExpressionServicePB.ListExpressionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListExpressionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteExpressions 删除表情列表
     * </pre>
     */
    public com.jjrobot.andy4.expressionpb.ExpressionServicePB.DeleteExpressionsResponse deleteExpressions(com.jjrobot.andy4.expressionpb.ExpressionServicePB.DeleteExpressionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteExpressionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * State 获取当前表情模块状态
     * </pre>
     */
    public com.jjrobot.andy4.expressionpb.ExpressionServicePB.StateResponse state(com.jjrobot.andy4.expressionpb.ExpressionServicePB.StateRequest request) {
      return blockingUnaryCall(
          getChannel(), getStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Switch 控制表情的开关
     * 关闭时将表现为黑屏
     * </pre>
     */
    public com.jjrobot.andy4.expressionpb.ExpressionServicePB.SwitchResponse switch_(com.jjrobot.andy4.expressionpb.ExpressionServicePB.SwitchRequest request) {
      return blockingUnaryCall(
          getChannel(), getSwitchMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * expressionService.ExpressionService 表情管理
   * 开发管理平台功能参考: http://10.10.10.2/expression/
   * </pre>
   */
  public static final class ExpressionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ExpressionServiceFutureStub> {
    private ExpressionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExpressionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExpressionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * PlayExpressions 播放表情组合
     * 单套表情限制请参考UploadExpressionFile方法，
     * 更为复杂的表情设计可基于多个最小化表情进行组合
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.expressionpb.ExpressionServicePB.PlayExpressionsResponse> playExpressions(
        com.jjrobot.andy4.expressionpb.ExpressionServicePB.PlayExpressionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPlayExpressionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StopExpression 停止表情播放
     * 此方法将表现为播放至当前帧终止，不会恢复为当前表情的首帧
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.expressionpb.ExpressionServicePB.StopExpressionResponse> stopExpression(
        com.jjrobot.andy4.expressionpb.ExpressionServicePB.StopExpressionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStopExpressionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UploadExpressionFile 上传表情文件
     * 上传表情图片zip文件，用于构建新的表情
     * 表情文件为zip格式数据，如Example.zip文件上传后该表情将命名为"Example"，命名可通过Rename方法进行更改
     * windows用户请在表情目录中选中preview.png, left目录，right目录，直接压缩为zip文件，不支持包含父目录
     * 表情包目录示例：
     * left与right目录图片数量最大限制为各10张
     *├── preview.png # 表情预览文件，与表情数据无关，仅作为预览图用
     *│
     *├── left # 左眼表情数据
     *│   ├── 1.png
     *│   ├── 2.png
     *│   ├── 3.png
     *│   ├── 4.png
     *│   └── 5.png
     *│
     *└── right # 右眼表情数据
     *    ├── 1.png
     *    ├── 2.png
     *    ├── 3.png
     *    ├── 4.png
     *    └── 5.png
     * 网关不包含当前方法，HTTP上传请使用以下接口
     * POST /api/v2/expression/upload_expression_file
     * Content-Type: application/x-www-form-urlencoded
     * Body:
     *   - name: String
     *   - e: File, e.g. Example.zip
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.expressionpb.ExpressionServicePB.UploadExpressionFileResponse> uploadExpressionFile(
        com.jjrobot.andy4.expressionpb.ExpressionServicePB.UploadExpressionFileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUploadExpressionFileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Rename 对已上传的表情进行重命名
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.expressionpb.ExpressionServicePB.RenameResponse> rename(
        com.jjrobot.andy4.expressionpb.ExpressionServicePB.RenameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRenameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListExpressions 获取表情列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.expressionpb.ExpressionServicePB.ListExpressionsResponse> listExpressions(
        com.jjrobot.andy4.expressionpb.ExpressionServicePB.ListExpressionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListExpressionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteExpressions 删除表情列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.expressionpb.ExpressionServicePB.DeleteExpressionsResponse> deleteExpressions(
        com.jjrobot.andy4.expressionpb.ExpressionServicePB.DeleteExpressionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteExpressionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * State 获取当前表情模块状态
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.expressionpb.ExpressionServicePB.StateResponse> state(
        com.jjrobot.andy4.expressionpb.ExpressionServicePB.StateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Switch 控制表情的开关
     * 关闭时将表现为黑屏
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.expressionpb.ExpressionServicePB.SwitchResponse> switch_(
        com.jjrobot.andy4.expressionpb.ExpressionServicePB.SwitchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PLAY_EXPRESSIONS = 0;
  private static final int METHODID_STOP_EXPRESSION = 1;
  private static final int METHODID_UPLOAD_EXPRESSION_FILE = 2;
  private static final int METHODID_RENAME = 3;
  private static final int METHODID_LIST_EXPRESSIONS = 4;
  private static final int METHODID_DELETE_EXPRESSIONS = 5;
  private static final int METHODID_STATE = 6;
  private static final int METHODID_SWITCH = 7;

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
          serviceImpl.playExpressions((com.jjrobot.andy4.expressionpb.ExpressionServicePB.PlayExpressionsRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.expressionpb.ExpressionServicePB.PlayExpressionsResponse>) responseObserver);
          break;
        case METHODID_STOP_EXPRESSION:
          serviceImpl.stopExpression((com.jjrobot.andy4.expressionpb.ExpressionServicePB.StopExpressionRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.expressionpb.ExpressionServicePB.StopExpressionResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_EXPRESSION_FILE:
          serviceImpl.uploadExpressionFile((com.jjrobot.andy4.expressionpb.ExpressionServicePB.UploadExpressionFileRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.expressionpb.ExpressionServicePB.UploadExpressionFileResponse>) responseObserver);
          break;
        case METHODID_RENAME:
          serviceImpl.rename((com.jjrobot.andy4.expressionpb.ExpressionServicePB.RenameRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.expressionpb.ExpressionServicePB.RenameResponse>) responseObserver);
          break;
        case METHODID_LIST_EXPRESSIONS:
          serviceImpl.listExpressions((com.jjrobot.andy4.expressionpb.ExpressionServicePB.ListExpressionsRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.expressionpb.ExpressionServicePB.ListExpressionsResponse>) responseObserver);
          break;
        case METHODID_DELETE_EXPRESSIONS:
          serviceImpl.deleteExpressions((com.jjrobot.andy4.expressionpb.ExpressionServicePB.DeleteExpressionsRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.expressionpb.ExpressionServicePB.DeleteExpressionsResponse>) responseObserver);
          break;
        case METHODID_STATE:
          serviceImpl.state((com.jjrobot.andy4.expressionpb.ExpressionServicePB.StateRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.expressionpb.ExpressionServicePB.StateResponse>) responseObserver);
          break;
        case METHODID_SWITCH:
          serviceImpl.switch_((com.jjrobot.andy4.expressionpb.ExpressionServicePB.SwitchRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.expressionpb.ExpressionServicePB.SwitchResponse>) responseObserver);
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
      return com.jjrobot.andy4.expressionpb.ExpressionServicePB.getDescriptor();
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
              .addMethod(getStateMethod())
              .addMethod(getSwitchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
