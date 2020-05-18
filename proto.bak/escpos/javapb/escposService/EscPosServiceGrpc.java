package escposService;

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
    comments = "Source: escpos.proto")
public final class EscPosServiceGrpc {

  private EscPosServiceGrpc() {}

  public static final String SERVICE_NAME = "escposService.EscPosService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<escposService.Escpos.PrintRawRequest,
      escposService.Escpos.PrintRawResponse> getPrintRawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrintRaw",
      requestType = escposService.Escpos.PrintRawRequest.class,
      responseType = escposService.Escpos.PrintRawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<escposService.Escpos.PrintRawRequest,
      escposService.Escpos.PrintRawResponse> getPrintRawMethod() {
    io.grpc.MethodDescriptor<escposService.Escpos.PrintRawRequest, escposService.Escpos.PrintRawResponse> getPrintRawMethod;
    if ((getPrintRawMethod = EscPosServiceGrpc.getPrintRawMethod) == null) {
      synchronized (EscPosServiceGrpc.class) {
        if ((getPrintRawMethod = EscPosServiceGrpc.getPrintRawMethod) == null) {
          EscPosServiceGrpc.getPrintRawMethod = getPrintRawMethod = 
              io.grpc.MethodDescriptor.<escposService.Escpos.PrintRawRequest, escposService.Escpos.PrintRawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "escposService.EscPosService", "PrintRaw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  escposService.Escpos.PrintRawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  escposService.Escpos.PrintRawResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EscPosServiceMethodDescriptorSupplier("PrintRaw"))
                  .build();
          }
        }
     }
     return getPrintRawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<escposService.Escpos.PrintElementsRequest,
      escposService.Escpos.PrintElementsResponse> getPrintElementsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrintElements",
      requestType = escposService.Escpos.PrintElementsRequest.class,
      responseType = escposService.Escpos.PrintElementsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<escposService.Escpos.PrintElementsRequest,
      escposService.Escpos.PrintElementsResponse> getPrintElementsMethod() {
    io.grpc.MethodDescriptor<escposService.Escpos.PrintElementsRequest, escposService.Escpos.PrintElementsResponse> getPrintElementsMethod;
    if ((getPrintElementsMethod = EscPosServiceGrpc.getPrintElementsMethod) == null) {
      synchronized (EscPosServiceGrpc.class) {
        if ((getPrintElementsMethod = EscPosServiceGrpc.getPrintElementsMethod) == null) {
          EscPosServiceGrpc.getPrintElementsMethod = getPrintElementsMethod = 
              io.grpc.MethodDescriptor.<escposService.Escpos.PrintElementsRequest, escposService.Escpos.PrintElementsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "escposService.EscPosService", "PrintElements"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  escposService.Escpos.PrintElementsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  escposService.Escpos.PrintElementsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EscPosServiceMethodDescriptorSupplier("PrintElements"))
                  .build();
          }
        }
     }
     return getPrintElementsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<escposService.Escpos.PrintHtmlTemplateRequest,
      escposService.Escpos.PrintHtmlTemplateResponse> getPrintHtmlTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrintHtmlTemplate",
      requestType = escposService.Escpos.PrintHtmlTemplateRequest.class,
      responseType = escposService.Escpos.PrintHtmlTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<escposService.Escpos.PrintHtmlTemplateRequest,
      escposService.Escpos.PrintHtmlTemplateResponse> getPrintHtmlTemplateMethod() {
    io.grpc.MethodDescriptor<escposService.Escpos.PrintHtmlTemplateRequest, escposService.Escpos.PrintHtmlTemplateResponse> getPrintHtmlTemplateMethod;
    if ((getPrintHtmlTemplateMethod = EscPosServiceGrpc.getPrintHtmlTemplateMethod) == null) {
      synchronized (EscPosServiceGrpc.class) {
        if ((getPrintHtmlTemplateMethod = EscPosServiceGrpc.getPrintHtmlTemplateMethod) == null) {
          EscPosServiceGrpc.getPrintHtmlTemplateMethod = getPrintHtmlTemplateMethod = 
              io.grpc.MethodDescriptor.<escposService.Escpos.PrintHtmlTemplateRequest, escposService.Escpos.PrintHtmlTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "escposService.EscPosService", "PrintHtmlTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  escposService.Escpos.PrintHtmlTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  escposService.Escpos.PrintHtmlTemplateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EscPosServiceMethodDescriptorSupplier("PrintHtmlTemplate"))
                  .build();
          }
        }
     }
     return getPrintHtmlTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<escposService.Escpos.NewHtmlTemplateRequest,
      escposService.Escpos.NewHtmlTemplateResponse> getNewHtmlTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewHtmlTemplate",
      requestType = escposService.Escpos.NewHtmlTemplateRequest.class,
      responseType = escposService.Escpos.NewHtmlTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<escposService.Escpos.NewHtmlTemplateRequest,
      escposService.Escpos.NewHtmlTemplateResponse> getNewHtmlTemplateMethod() {
    io.grpc.MethodDescriptor<escposService.Escpos.NewHtmlTemplateRequest, escposService.Escpos.NewHtmlTemplateResponse> getNewHtmlTemplateMethod;
    if ((getNewHtmlTemplateMethod = EscPosServiceGrpc.getNewHtmlTemplateMethod) == null) {
      synchronized (EscPosServiceGrpc.class) {
        if ((getNewHtmlTemplateMethod = EscPosServiceGrpc.getNewHtmlTemplateMethod) == null) {
          EscPosServiceGrpc.getNewHtmlTemplateMethod = getNewHtmlTemplateMethod = 
              io.grpc.MethodDescriptor.<escposService.Escpos.NewHtmlTemplateRequest, escposService.Escpos.NewHtmlTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "escposService.EscPosService", "NewHtmlTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  escposService.Escpos.NewHtmlTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  escposService.Escpos.NewHtmlTemplateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EscPosServiceMethodDescriptorSupplier("NewHtmlTemplate"))
                  .build();
          }
        }
     }
     return getNewHtmlTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<escposService.Escpos.ListHtmlTemplatesRequest,
      escposService.Escpos.ListHtmlTemplatesResponse> getListHtmlTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHtmlTemplates",
      requestType = escposService.Escpos.ListHtmlTemplatesRequest.class,
      responseType = escposService.Escpos.ListHtmlTemplatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<escposService.Escpos.ListHtmlTemplatesRequest,
      escposService.Escpos.ListHtmlTemplatesResponse> getListHtmlTemplatesMethod() {
    io.grpc.MethodDescriptor<escposService.Escpos.ListHtmlTemplatesRequest, escposService.Escpos.ListHtmlTemplatesResponse> getListHtmlTemplatesMethod;
    if ((getListHtmlTemplatesMethod = EscPosServiceGrpc.getListHtmlTemplatesMethod) == null) {
      synchronized (EscPosServiceGrpc.class) {
        if ((getListHtmlTemplatesMethod = EscPosServiceGrpc.getListHtmlTemplatesMethod) == null) {
          EscPosServiceGrpc.getListHtmlTemplatesMethod = getListHtmlTemplatesMethod = 
              io.grpc.MethodDescriptor.<escposService.Escpos.ListHtmlTemplatesRequest, escposService.Escpos.ListHtmlTemplatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "escposService.EscPosService", "ListHtmlTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  escposService.Escpos.ListHtmlTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  escposService.Escpos.ListHtmlTemplatesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EscPosServiceMethodDescriptorSupplier("ListHtmlTemplates"))
                  .build();
          }
        }
     }
     return getListHtmlTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<escposService.Escpos.GetHtmlTemplateRequest,
      escposService.Escpos.GetHtmlTemplateResponse> getGetHtmlTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHtmlTemplate",
      requestType = escposService.Escpos.GetHtmlTemplateRequest.class,
      responseType = escposService.Escpos.GetHtmlTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<escposService.Escpos.GetHtmlTemplateRequest,
      escposService.Escpos.GetHtmlTemplateResponse> getGetHtmlTemplateMethod() {
    io.grpc.MethodDescriptor<escposService.Escpos.GetHtmlTemplateRequest, escposService.Escpos.GetHtmlTemplateResponse> getGetHtmlTemplateMethod;
    if ((getGetHtmlTemplateMethod = EscPosServiceGrpc.getGetHtmlTemplateMethod) == null) {
      synchronized (EscPosServiceGrpc.class) {
        if ((getGetHtmlTemplateMethod = EscPosServiceGrpc.getGetHtmlTemplateMethod) == null) {
          EscPosServiceGrpc.getGetHtmlTemplateMethod = getGetHtmlTemplateMethod = 
              io.grpc.MethodDescriptor.<escposService.Escpos.GetHtmlTemplateRequest, escposService.Escpos.GetHtmlTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "escposService.EscPosService", "GetHtmlTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  escposService.Escpos.GetHtmlTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  escposService.Escpos.GetHtmlTemplateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EscPosServiceMethodDescriptorSupplier("GetHtmlTemplate"))
                  .build();
          }
        }
     }
     return getGetHtmlTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<escposService.Escpos.UpdateHtmlTemplateRequest,
      escposService.Escpos.UpdateHtmlTemplateResponse> getUpdateHtmlTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateHtmlTemplate",
      requestType = escposService.Escpos.UpdateHtmlTemplateRequest.class,
      responseType = escposService.Escpos.UpdateHtmlTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<escposService.Escpos.UpdateHtmlTemplateRequest,
      escposService.Escpos.UpdateHtmlTemplateResponse> getUpdateHtmlTemplateMethod() {
    io.grpc.MethodDescriptor<escposService.Escpos.UpdateHtmlTemplateRequest, escposService.Escpos.UpdateHtmlTemplateResponse> getUpdateHtmlTemplateMethod;
    if ((getUpdateHtmlTemplateMethod = EscPosServiceGrpc.getUpdateHtmlTemplateMethod) == null) {
      synchronized (EscPosServiceGrpc.class) {
        if ((getUpdateHtmlTemplateMethod = EscPosServiceGrpc.getUpdateHtmlTemplateMethod) == null) {
          EscPosServiceGrpc.getUpdateHtmlTemplateMethod = getUpdateHtmlTemplateMethod = 
              io.grpc.MethodDescriptor.<escposService.Escpos.UpdateHtmlTemplateRequest, escposService.Escpos.UpdateHtmlTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "escposService.EscPosService", "UpdateHtmlTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  escposService.Escpos.UpdateHtmlTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  escposService.Escpos.UpdateHtmlTemplateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EscPosServiceMethodDescriptorSupplier("UpdateHtmlTemplate"))
                  .build();
          }
        }
     }
     return getUpdateHtmlTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<escposService.Escpos.DeleteHtmlTemplatesRequest,
      escposService.Escpos.DeleteHtmlTemplatesResponse> getDeleteHtmlTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteHtmlTemplates",
      requestType = escposService.Escpos.DeleteHtmlTemplatesRequest.class,
      responseType = escposService.Escpos.DeleteHtmlTemplatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<escposService.Escpos.DeleteHtmlTemplatesRequest,
      escposService.Escpos.DeleteHtmlTemplatesResponse> getDeleteHtmlTemplatesMethod() {
    io.grpc.MethodDescriptor<escposService.Escpos.DeleteHtmlTemplatesRequest, escposService.Escpos.DeleteHtmlTemplatesResponse> getDeleteHtmlTemplatesMethod;
    if ((getDeleteHtmlTemplatesMethod = EscPosServiceGrpc.getDeleteHtmlTemplatesMethod) == null) {
      synchronized (EscPosServiceGrpc.class) {
        if ((getDeleteHtmlTemplatesMethod = EscPosServiceGrpc.getDeleteHtmlTemplatesMethod) == null) {
          EscPosServiceGrpc.getDeleteHtmlTemplatesMethod = getDeleteHtmlTemplatesMethod = 
              io.grpc.MethodDescriptor.<escposService.Escpos.DeleteHtmlTemplatesRequest, escposService.Escpos.DeleteHtmlTemplatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "escposService.EscPosService", "DeleteHtmlTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  escposService.Escpos.DeleteHtmlTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  escposService.Escpos.DeleteHtmlTemplatesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EscPosServiceMethodDescriptorSupplier("DeleteHtmlTemplates"))
                  .build();
          }
        }
     }
     return getDeleteHtmlTemplatesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EscPosServiceStub newStub(io.grpc.Channel channel) {
    return new EscPosServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EscPosServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EscPosServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EscPosServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EscPosServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class EscPosServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 打印bytes数据
     * 打印模板与打印对象方式不满足业务需求
     * 或希望接入其它已外部业务实现的打印组件时, 可通过此方法直接
     * 传入打印内容
     * </pre>
     */
    public void printRaw(escposService.Escpos.PrintRawRequest request,
        io.grpc.stub.StreamObserver<escposService.Escpos.PrintRawResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPrintRawMethod(), responseObserver);
    }

    /**
     * <pre>
     * 打印对象
     * </pre>
     */
    public void printElements(escposService.Escpos.PrintElementsRequest request,
        io.grpc.stub.StreamObserver<escposService.Escpos.PrintElementsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPrintElementsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 打印预设的html模板内容
     * </pre>
     */
    public void printHtmlTemplate(escposService.Escpos.PrintHtmlTemplateRequest request,
        io.grpc.stub.StreamObserver<escposService.Escpos.PrintHtmlTemplateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPrintHtmlTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 创建html模板
     * </pre>
     */
    public void newHtmlTemplate(escposService.Escpos.NewHtmlTemplateRequest request,
        io.grpc.stub.StreamObserver<escposService.Escpos.NewHtmlTemplateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNewHtmlTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取html模板列表
     * </pre>
     */
    public void listHtmlTemplates(escposService.Escpos.ListHtmlTemplatesRequest request,
        io.grpc.stub.StreamObserver<escposService.Escpos.ListHtmlTemplatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListHtmlTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取指定html模板内容
     * </pre>
     */
    public void getHtmlTemplate(escposService.Escpos.GetHtmlTemplateRequest request,
        io.grpc.stub.StreamObserver<escposService.Escpos.GetHtmlTemplateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHtmlTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更新html模板
     * </pre>
     */
    public void updateHtmlTemplate(escposService.Escpos.UpdateHtmlTemplateRequest request,
        io.grpc.stub.StreamObserver<escposService.Escpos.UpdateHtmlTemplateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateHtmlTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除html模板
     * </pre>
     */
    public void deleteHtmlTemplates(escposService.Escpos.DeleteHtmlTemplatesRequest request,
        io.grpc.stub.StreamObserver<escposService.Escpos.DeleteHtmlTemplatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteHtmlTemplatesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPrintRawMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                escposService.Escpos.PrintRawRequest,
                escposService.Escpos.PrintRawResponse>(
                  this, METHODID_PRINT_RAW)))
          .addMethod(
            getPrintElementsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                escposService.Escpos.PrintElementsRequest,
                escposService.Escpos.PrintElementsResponse>(
                  this, METHODID_PRINT_ELEMENTS)))
          .addMethod(
            getPrintHtmlTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                escposService.Escpos.PrintHtmlTemplateRequest,
                escposService.Escpos.PrintHtmlTemplateResponse>(
                  this, METHODID_PRINT_HTML_TEMPLATE)))
          .addMethod(
            getNewHtmlTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                escposService.Escpos.NewHtmlTemplateRequest,
                escposService.Escpos.NewHtmlTemplateResponse>(
                  this, METHODID_NEW_HTML_TEMPLATE)))
          .addMethod(
            getListHtmlTemplatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                escposService.Escpos.ListHtmlTemplatesRequest,
                escposService.Escpos.ListHtmlTemplatesResponse>(
                  this, METHODID_LIST_HTML_TEMPLATES)))
          .addMethod(
            getGetHtmlTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                escposService.Escpos.GetHtmlTemplateRequest,
                escposService.Escpos.GetHtmlTemplateResponse>(
                  this, METHODID_GET_HTML_TEMPLATE)))
          .addMethod(
            getUpdateHtmlTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                escposService.Escpos.UpdateHtmlTemplateRequest,
                escposService.Escpos.UpdateHtmlTemplateResponse>(
                  this, METHODID_UPDATE_HTML_TEMPLATE)))
          .addMethod(
            getDeleteHtmlTemplatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                escposService.Escpos.DeleteHtmlTemplatesRequest,
                escposService.Escpos.DeleteHtmlTemplatesResponse>(
                  this, METHODID_DELETE_HTML_TEMPLATES)))
          .build();
    }
  }

  /**
   */
  public static final class EscPosServiceStub extends io.grpc.stub.AbstractStub<EscPosServiceStub> {
    private EscPosServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EscPosServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EscPosServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EscPosServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 打印bytes数据
     * 打印模板与打印对象方式不满足业务需求
     * 或希望接入其它已外部业务实现的打印组件时, 可通过此方法直接
     * 传入打印内容
     * </pre>
     */
    public void printRaw(escposService.Escpos.PrintRawRequest request,
        io.grpc.stub.StreamObserver<escposService.Escpos.PrintRawResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPrintRawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 打印对象
     * </pre>
     */
    public void printElements(escposService.Escpos.PrintElementsRequest request,
        io.grpc.stub.StreamObserver<escposService.Escpos.PrintElementsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPrintElementsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 打印预设的html模板内容
     * </pre>
     */
    public void printHtmlTemplate(escposService.Escpos.PrintHtmlTemplateRequest request,
        io.grpc.stub.StreamObserver<escposService.Escpos.PrintHtmlTemplateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPrintHtmlTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 创建html模板
     * </pre>
     */
    public void newHtmlTemplate(escposService.Escpos.NewHtmlTemplateRequest request,
        io.grpc.stub.StreamObserver<escposService.Escpos.NewHtmlTemplateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNewHtmlTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取html模板列表
     * </pre>
     */
    public void listHtmlTemplates(escposService.Escpos.ListHtmlTemplatesRequest request,
        io.grpc.stub.StreamObserver<escposService.Escpos.ListHtmlTemplatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListHtmlTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取指定html模板内容
     * </pre>
     */
    public void getHtmlTemplate(escposService.Escpos.GetHtmlTemplateRequest request,
        io.grpc.stub.StreamObserver<escposService.Escpos.GetHtmlTemplateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHtmlTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新html模板
     * </pre>
     */
    public void updateHtmlTemplate(escposService.Escpos.UpdateHtmlTemplateRequest request,
        io.grpc.stub.StreamObserver<escposService.Escpos.UpdateHtmlTemplateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateHtmlTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除html模板
     * </pre>
     */
    public void deleteHtmlTemplates(escposService.Escpos.DeleteHtmlTemplatesRequest request,
        io.grpc.stub.StreamObserver<escposService.Escpos.DeleteHtmlTemplatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteHtmlTemplatesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EscPosServiceBlockingStub extends io.grpc.stub.AbstractStub<EscPosServiceBlockingStub> {
    private EscPosServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EscPosServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EscPosServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EscPosServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 打印bytes数据
     * 打印模板与打印对象方式不满足业务需求
     * 或希望接入其它已外部业务实现的打印组件时, 可通过此方法直接
     * 传入打印内容
     * </pre>
     */
    public escposService.Escpos.PrintRawResponse printRaw(escposService.Escpos.PrintRawRequest request) {
      return blockingUnaryCall(
          getChannel(), getPrintRawMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 打印对象
     * </pre>
     */
    public escposService.Escpos.PrintElementsResponse printElements(escposService.Escpos.PrintElementsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPrintElementsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 打印预设的html模板内容
     * </pre>
     */
    public escposService.Escpos.PrintHtmlTemplateResponse printHtmlTemplate(escposService.Escpos.PrintHtmlTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), getPrintHtmlTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 创建html模板
     * </pre>
     */
    public escposService.Escpos.NewHtmlTemplateResponse newHtmlTemplate(escposService.Escpos.NewHtmlTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), getNewHtmlTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取html模板列表
     * </pre>
     */
    public escposService.Escpos.ListHtmlTemplatesResponse listHtmlTemplates(escposService.Escpos.ListHtmlTemplatesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListHtmlTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取指定html模板内容
     * </pre>
     */
    public escposService.Escpos.GetHtmlTemplateResponse getHtmlTemplate(escposService.Escpos.GetHtmlTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetHtmlTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新html模板
     * </pre>
     */
    public escposService.Escpos.UpdateHtmlTemplateResponse updateHtmlTemplate(escposService.Escpos.UpdateHtmlTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateHtmlTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除html模板
     * </pre>
     */
    public escposService.Escpos.DeleteHtmlTemplatesResponse deleteHtmlTemplates(escposService.Escpos.DeleteHtmlTemplatesRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteHtmlTemplatesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EscPosServiceFutureStub extends io.grpc.stub.AbstractStub<EscPosServiceFutureStub> {
    private EscPosServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EscPosServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EscPosServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EscPosServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 打印bytes数据
     * 打印模板与打印对象方式不满足业务需求
     * 或希望接入其它已外部业务实现的打印组件时, 可通过此方法直接
     * 传入打印内容
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<escposService.Escpos.PrintRawResponse> printRaw(
        escposService.Escpos.PrintRawRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPrintRawMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 打印对象
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<escposService.Escpos.PrintElementsResponse> printElements(
        escposService.Escpos.PrintElementsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPrintElementsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 打印预设的html模板内容
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<escposService.Escpos.PrintHtmlTemplateResponse> printHtmlTemplate(
        escposService.Escpos.PrintHtmlTemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPrintHtmlTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 创建html模板
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<escposService.Escpos.NewHtmlTemplateResponse> newHtmlTemplate(
        escposService.Escpos.NewHtmlTemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNewHtmlTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取html模板列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<escposService.Escpos.ListHtmlTemplatesResponse> listHtmlTemplates(
        escposService.Escpos.ListHtmlTemplatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListHtmlTemplatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取指定html模板内容
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<escposService.Escpos.GetHtmlTemplateResponse> getHtmlTemplate(
        escposService.Escpos.GetHtmlTemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHtmlTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新html模板
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<escposService.Escpos.UpdateHtmlTemplateResponse> updateHtmlTemplate(
        escposService.Escpos.UpdateHtmlTemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateHtmlTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除html模板
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<escposService.Escpos.DeleteHtmlTemplatesResponse> deleteHtmlTemplates(
        escposService.Escpos.DeleteHtmlTemplatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteHtmlTemplatesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PRINT_RAW = 0;
  private static final int METHODID_PRINT_ELEMENTS = 1;
  private static final int METHODID_PRINT_HTML_TEMPLATE = 2;
  private static final int METHODID_NEW_HTML_TEMPLATE = 3;
  private static final int METHODID_LIST_HTML_TEMPLATES = 4;
  private static final int METHODID_GET_HTML_TEMPLATE = 5;
  private static final int METHODID_UPDATE_HTML_TEMPLATE = 6;
  private static final int METHODID_DELETE_HTML_TEMPLATES = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EscPosServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EscPosServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PRINT_RAW:
          serviceImpl.printRaw((escposService.Escpos.PrintRawRequest) request,
              (io.grpc.stub.StreamObserver<escposService.Escpos.PrintRawResponse>) responseObserver);
          break;
        case METHODID_PRINT_ELEMENTS:
          serviceImpl.printElements((escposService.Escpos.PrintElementsRequest) request,
              (io.grpc.stub.StreamObserver<escposService.Escpos.PrintElementsResponse>) responseObserver);
          break;
        case METHODID_PRINT_HTML_TEMPLATE:
          serviceImpl.printHtmlTemplate((escposService.Escpos.PrintHtmlTemplateRequest) request,
              (io.grpc.stub.StreamObserver<escposService.Escpos.PrintHtmlTemplateResponse>) responseObserver);
          break;
        case METHODID_NEW_HTML_TEMPLATE:
          serviceImpl.newHtmlTemplate((escposService.Escpos.NewHtmlTemplateRequest) request,
              (io.grpc.stub.StreamObserver<escposService.Escpos.NewHtmlTemplateResponse>) responseObserver);
          break;
        case METHODID_LIST_HTML_TEMPLATES:
          serviceImpl.listHtmlTemplates((escposService.Escpos.ListHtmlTemplatesRequest) request,
              (io.grpc.stub.StreamObserver<escposService.Escpos.ListHtmlTemplatesResponse>) responseObserver);
          break;
        case METHODID_GET_HTML_TEMPLATE:
          serviceImpl.getHtmlTemplate((escposService.Escpos.GetHtmlTemplateRequest) request,
              (io.grpc.stub.StreamObserver<escposService.Escpos.GetHtmlTemplateResponse>) responseObserver);
          break;
        case METHODID_UPDATE_HTML_TEMPLATE:
          serviceImpl.updateHtmlTemplate((escposService.Escpos.UpdateHtmlTemplateRequest) request,
              (io.grpc.stub.StreamObserver<escposService.Escpos.UpdateHtmlTemplateResponse>) responseObserver);
          break;
        case METHODID_DELETE_HTML_TEMPLATES:
          serviceImpl.deleteHtmlTemplates((escposService.Escpos.DeleteHtmlTemplatesRequest) request,
              (io.grpc.stub.StreamObserver<escposService.Escpos.DeleteHtmlTemplatesResponse>) responseObserver);
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

  private static abstract class EscPosServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EscPosServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return escposService.Escpos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EscPosService");
    }
  }

  private static final class EscPosServiceFileDescriptorSupplier
      extends EscPosServiceBaseDescriptorSupplier {
    EscPosServiceFileDescriptorSupplier() {}
  }

  private static final class EscPosServiceMethodDescriptorSupplier
      extends EscPosServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EscPosServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EscPosServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EscPosServiceFileDescriptorSupplier())
              .addMethod(getPrintRawMethod())
              .addMethod(getPrintElementsMethod())
              .addMethod(getPrintHtmlTemplateMethod())
              .addMethod(getNewHtmlTemplateMethod())
              .addMethod(getListHtmlTemplatesMethod())
              .addMethod(getGetHtmlTemplateMethod())
              .addMethod(getUpdateHtmlTemplateMethod())
              .addMethod(getDeleteHtmlTemplatesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
