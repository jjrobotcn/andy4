package com.jjrobot.andy4.escpospb;

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
 * escposService.EscPosService 小票打印设备的打印与模板管理
 * 开发管理平台功能参考: http://10.10.10.2/esc_pos
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.1-SNAPSHOT)",
    comments = "Source: escpos.proto")
public final class EscPosServiceGrpc {

  private EscPosServiceGrpc() {}

  public static final String SERVICE_NAME = "escposService.EscPosService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.escpospb.EscPosServicePB.PrintRawRequest,
      com.jjrobot.andy4.escpospb.EscPosServicePB.PrintRawResponse> getPrintRawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrintRaw",
      requestType = com.jjrobot.andy4.escpospb.EscPosServicePB.PrintRawRequest.class,
      responseType = com.jjrobot.andy4.escpospb.EscPosServicePB.PrintRawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.escpospb.EscPosServicePB.PrintRawRequest,
      com.jjrobot.andy4.escpospb.EscPosServicePB.PrintRawResponse> getPrintRawMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.escpospb.EscPosServicePB.PrintRawRequest, com.jjrobot.andy4.escpospb.EscPosServicePB.PrintRawResponse> getPrintRawMethod;
    if ((getPrintRawMethod = EscPosServiceGrpc.getPrintRawMethod) == null) {
      synchronized (EscPosServiceGrpc.class) {
        if ((getPrintRawMethod = EscPosServiceGrpc.getPrintRawMethod) == null) {
          EscPosServiceGrpc.getPrintRawMethod = getPrintRawMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.escpospb.EscPosServicePB.PrintRawRequest, com.jjrobot.andy4.escpospb.EscPosServicePB.PrintRawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PrintRaw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.escpospb.EscPosServicePB.PrintRawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.escpospb.EscPosServicePB.PrintRawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EscPosServiceMethodDescriptorSupplier("PrintRaw"))
              .build();
        }
      }
    }
    return getPrintRawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.escpospb.EscPosServicePB.PrintElementsRequest,
      com.jjrobot.andy4.escpospb.EscPosServicePB.PrintElementsResponse> getPrintElementsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrintElements",
      requestType = com.jjrobot.andy4.escpospb.EscPosServicePB.PrintElementsRequest.class,
      responseType = com.jjrobot.andy4.escpospb.EscPosServicePB.PrintElementsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.escpospb.EscPosServicePB.PrintElementsRequest,
      com.jjrobot.andy4.escpospb.EscPosServicePB.PrintElementsResponse> getPrintElementsMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.escpospb.EscPosServicePB.PrintElementsRequest, com.jjrobot.andy4.escpospb.EscPosServicePB.PrintElementsResponse> getPrintElementsMethod;
    if ((getPrintElementsMethod = EscPosServiceGrpc.getPrintElementsMethod) == null) {
      synchronized (EscPosServiceGrpc.class) {
        if ((getPrintElementsMethod = EscPosServiceGrpc.getPrintElementsMethod) == null) {
          EscPosServiceGrpc.getPrintElementsMethod = getPrintElementsMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.escpospb.EscPosServicePB.PrintElementsRequest, com.jjrobot.andy4.escpospb.EscPosServicePB.PrintElementsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PrintElements"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.escpospb.EscPosServicePB.PrintElementsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.escpospb.EscPosServicePB.PrintElementsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EscPosServiceMethodDescriptorSupplier("PrintElements"))
              .build();
        }
      }
    }
    return getPrintElementsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.escpospb.EscPosServicePB.PrintHtmlTemplateRequest,
      com.jjrobot.andy4.escpospb.EscPosServicePB.PrintHtmlTemplateResponse> getPrintHtmlTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrintHtmlTemplate",
      requestType = com.jjrobot.andy4.escpospb.EscPosServicePB.PrintHtmlTemplateRequest.class,
      responseType = com.jjrobot.andy4.escpospb.EscPosServicePB.PrintHtmlTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.escpospb.EscPosServicePB.PrintHtmlTemplateRequest,
      com.jjrobot.andy4.escpospb.EscPosServicePB.PrintHtmlTemplateResponse> getPrintHtmlTemplateMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.escpospb.EscPosServicePB.PrintHtmlTemplateRequest, com.jjrobot.andy4.escpospb.EscPosServicePB.PrintHtmlTemplateResponse> getPrintHtmlTemplateMethod;
    if ((getPrintHtmlTemplateMethod = EscPosServiceGrpc.getPrintHtmlTemplateMethod) == null) {
      synchronized (EscPosServiceGrpc.class) {
        if ((getPrintHtmlTemplateMethod = EscPosServiceGrpc.getPrintHtmlTemplateMethod) == null) {
          EscPosServiceGrpc.getPrintHtmlTemplateMethod = getPrintHtmlTemplateMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.escpospb.EscPosServicePB.PrintHtmlTemplateRequest, com.jjrobot.andy4.escpospb.EscPosServicePB.PrintHtmlTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PrintHtmlTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.escpospb.EscPosServicePB.PrintHtmlTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.escpospb.EscPosServicePB.PrintHtmlTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EscPosServiceMethodDescriptorSupplier("PrintHtmlTemplate"))
              .build();
        }
      }
    }
    return getPrintHtmlTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.escpospb.EscPosServicePB.NewHtmlTemplateRequest,
      com.jjrobot.andy4.escpospb.EscPosServicePB.NewHtmlTemplateResponse> getNewHtmlTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewHtmlTemplate",
      requestType = com.jjrobot.andy4.escpospb.EscPosServicePB.NewHtmlTemplateRequest.class,
      responseType = com.jjrobot.andy4.escpospb.EscPosServicePB.NewHtmlTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.escpospb.EscPosServicePB.NewHtmlTemplateRequest,
      com.jjrobot.andy4.escpospb.EscPosServicePB.NewHtmlTemplateResponse> getNewHtmlTemplateMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.escpospb.EscPosServicePB.NewHtmlTemplateRequest, com.jjrobot.andy4.escpospb.EscPosServicePB.NewHtmlTemplateResponse> getNewHtmlTemplateMethod;
    if ((getNewHtmlTemplateMethod = EscPosServiceGrpc.getNewHtmlTemplateMethod) == null) {
      synchronized (EscPosServiceGrpc.class) {
        if ((getNewHtmlTemplateMethod = EscPosServiceGrpc.getNewHtmlTemplateMethod) == null) {
          EscPosServiceGrpc.getNewHtmlTemplateMethod = getNewHtmlTemplateMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.escpospb.EscPosServicePB.NewHtmlTemplateRequest, com.jjrobot.andy4.escpospb.EscPosServicePB.NewHtmlTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewHtmlTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.escpospb.EscPosServicePB.NewHtmlTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.escpospb.EscPosServicePB.NewHtmlTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EscPosServiceMethodDescriptorSupplier("NewHtmlTemplate"))
              .build();
        }
      }
    }
    return getNewHtmlTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.escpospb.EscPosServicePB.ListHtmlTemplatesRequest,
      com.jjrobot.andy4.escpospb.EscPosServicePB.ListHtmlTemplatesResponse> getListHtmlTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHtmlTemplates",
      requestType = com.jjrobot.andy4.escpospb.EscPosServicePB.ListHtmlTemplatesRequest.class,
      responseType = com.jjrobot.andy4.escpospb.EscPosServicePB.ListHtmlTemplatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.escpospb.EscPosServicePB.ListHtmlTemplatesRequest,
      com.jjrobot.andy4.escpospb.EscPosServicePB.ListHtmlTemplatesResponse> getListHtmlTemplatesMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.escpospb.EscPosServicePB.ListHtmlTemplatesRequest, com.jjrobot.andy4.escpospb.EscPosServicePB.ListHtmlTemplatesResponse> getListHtmlTemplatesMethod;
    if ((getListHtmlTemplatesMethod = EscPosServiceGrpc.getListHtmlTemplatesMethod) == null) {
      synchronized (EscPosServiceGrpc.class) {
        if ((getListHtmlTemplatesMethod = EscPosServiceGrpc.getListHtmlTemplatesMethod) == null) {
          EscPosServiceGrpc.getListHtmlTemplatesMethod = getListHtmlTemplatesMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.escpospb.EscPosServicePB.ListHtmlTemplatesRequest, com.jjrobot.andy4.escpospb.EscPosServicePB.ListHtmlTemplatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHtmlTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.escpospb.EscPosServicePB.ListHtmlTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.escpospb.EscPosServicePB.ListHtmlTemplatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EscPosServiceMethodDescriptorSupplier("ListHtmlTemplates"))
              .build();
        }
      }
    }
    return getListHtmlTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.escpospb.EscPosServicePB.GetHtmlTemplateRequest,
      com.jjrobot.andy4.escpospb.EscPosServicePB.GetHtmlTemplateResponse> getGetHtmlTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHtmlTemplate",
      requestType = com.jjrobot.andy4.escpospb.EscPosServicePB.GetHtmlTemplateRequest.class,
      responseType = com.jjrobot.andy4.escpospb.EscPosServicePB.GetHtmlTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.escpospb.EscPosServicePB.GetHtmlTemplateRequest,
      com.jjrobot.andy4.escpospb.EscPosServicePB.GetHtmlTemplateResponse> getGetHtmlTemplateMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.escpospb.EscPosServicePB.GetHtmlTemplateRequest, com.jjrobot.andy4.escpospb.EscPosServicePB.GetHtmlTemplateResponse> getGetHtmlTemplateMethod;
    if ((getGetHtmlTemplateMethod = EscPosServiceGrpc.getGetHtmlTemplateMethod) == null) {
      synchronized (EscPosServiceGrpc.class) {
        if ((getGetHtmlTemplateMethod = EscPosServiceGrpc.getGetHtmlTemplateMethod) == null) {
          EscPosServiceGrpc.getGetHtmlTemplateMethod = getGetHtmlTemplateMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.escpospb.EscPosServicePB.GetHtmlTemplateRequest, com.jjrobot.andy4.escpospb.EscPosServicePB.GetHtmlTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHtmlTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.escpospb.EscPosServicePB.GetHtmlTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.escpospb.EscPosServicePB.GetHtmlTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EscPosServiceMethodDescriptorSupplier("GetHtmlTemplate"))
              .build();
        }
      }
    }
    return getGetHtmlTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.escpospb.EscPosServicePB.UpdateHtmlTemplateRequest,
      com.jjrobot.andy4.escpospb.EscPosServicePB.UpdateHtmlTemplateResponse> getUpdateHtmlTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateHtmlTemplate",
      requestType = com.jjrobot.andy4.escpospb.EscPosServicePB.UpdateHtmlTemplateRequest.class,
      responseType = com.jjrobot.andy4.escpospb.EscPosServicePB.UpdateHtmlTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.escpospb.EscPosServicePB.UpdateHtmlTemplateRequest,
      com.jjrobot.andy4.escpospb.EscPosServicePB.UpdateHtmlTemplateResponse> getUpdateHtmlTemplateMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.escpospb.EscPosServicePB.UpdateHtmlTemplateRequest, com.jjrobot.andy4.escpospb.EscPosServicePB.UpdateHtmlTemplateResponse> getUpdateHtmlTemplateMethod;
    if ((getUpdateHtmlTemplateMethod = EscPosServiceGrpc.getUpdateHtmlTemplateMethod) == null) {
      synchronized (EscPosServiceGrpc.class) {
        if ((getUpdateHtmlTemplateMethod = EscPosServiceGrpc.getUpdateHtmlTemplateMethod) == null) {
          EscPosServiceGrpc.getUpdateHtmlTemplateMethod = getUpdateHtmlTemplateMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.escpospb.EscPosServicePB.UpdateHtmlTemplateRequest, com.jjrobot.andy4.escpospb.EscPosServicePB.UpdateHtmlTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateHtmlTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.escpospb.EscPosServicePB.UpdateHtmlTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.escpospb.EscPosServicePB.UpdateHtmlTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EscPosServiceMethodDescriptorSupplier("UpdateHtmlTemplate"))
              .build();
        }
      }
    }
    return getUpdateHtmlTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.escpospb.EscPosServicePB.DeleteHtmlTemplatesRequest,
      com.jjrobot.andy4.escpospb.EscPosServicePB.DeleteHtmlTemplatesResponse> getDeleteHtmlTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteHtmlTemplates",
      requestType = com.jjrobot.andy4.escpospb.EscPosServicePB.DeleteHtmlTemplatesRequest.class,
      responseType = com.jjrobot.andy4.escpospb.EscPosServicePB.DeleteHtmlTemplatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.escpospb.EscPosServicePB.DeleteHtmlTemplatesRequest,
      com.jjrobot.andy4.escpospb.EscPosServicePB.DeleteHtmlTemplatesResponse> getDeleteHtmlTemplatesMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.escpospb.EscPosServicePB.DeleteHtmlTemplatesRequest, com.jjrobot.andy4.escpospb.EscPosServicePB.DeleteHtmlTemplatesResponse> getDeleteHtmlTemplatesMethod;
    if ((getDeleteHtmlTemplatesMethod = EscPosServiceGrpc.getDeleteHtmlTemplatesMethod) == null) {
      synchronized (EscPosServiceGrpc.class) {
        if ((getDeleteHtmlTemplatesMethod = EscPosServiceGrpc.getDeleteHtmlTemplatesMethod) == null) {
          EscPosServiceGrpc.getDeleteHtmlTemplatesMethod = getDeleteHtmlTemplatesMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.escpospb.EscPosServicePB.DeleteHtmlTemplatesRequest, com.jjrobot.andy4.escpospb.EscPosServicePB.DeleteHtmlTemplatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteHtmlTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.escpospb.EscPosServicePB.DeleteHtmlTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.escpospb.EscPosServicePB.DeleteHtmlTemplatesResponse.getDefaultInstance()))
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
    io.grpc.stub.AbstractStub.StubFactory<EscPosServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EscPosServiceStub>() {
        @java.lang.Override
        public EscPosServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EscPosServiceStub(channel, callOptions);
        }
      };
    return EscPosServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EscPosServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EscPosServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EscPosServiceBlockingStub>() {
        @java.lang.Override
        public EscPosServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EscPosServiceBlockingStub(channel, callOptions);
        }
      };
    return EscPosServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EscPosServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EscPosServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EscPosServiceFutureStub>() {
        @java.lang.Override
        public EscPosServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EscPosServiceFutureStub(channel, callOptions);
        }
      };
    return EscPosServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * escposService.EscPosService 小票打印设备的打印与模板管理
   * 开发管理平台功能参考: http://10.10.10.2/esc_pos
   * </pre>
   */
  public static abstract class EscPosServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * PrintRaw 直接输入打印设备协议数据进行打印
     * 用于支持外部程序直接通过协议方式打印
     * 此方法为最底层与硬件设备通讯的方法
     * </pre>
     */
    public void printRaw(com.jjrobot.andy4.escpospb.EscPosServicePB.PrintRawRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.escpospb.EscPosServicePB.PrintRawResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPrintRawMethod(), responseObserver);
    }

    /**
     * <pre>
     * PrintElements 通过Element对象描述内容进行打印
     * Element基于行进行内容描述，通过描述每行的内容构建为打印数据
     * 不支持单行中图片与文字混合打印
     * 底层方法为PrintRaw
     * </pre>
     */
    public void printElements(com.jjrobot.andy4.escpospb.EscPosServicePB.PrintElementsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.escpospb.EscPosServicePB.PrintElementsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPrintElementsMethod(), responseObserver);
    }

    /**
     * <pre>
     * PrintHtmlTemplate 通过Html预设模板内容进行插值打印
     * 模板中请使用"{{}}"符号标记占位符
     * 如: 联系电话: {{tel}}
     *     参数: {"params": {"tel": "123"}}
     * 底层方法为PrintElements
     * </pre>
     */
    public void printHtmlTemplate(com.jjrobot.andy4.escpospb.EscPosServicePB.PrintHtmlTemplateRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.escpospb.EscPosServicePB.PrintHtmlTemplateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPrintHtmlTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * NewHtmlTemplate 新建一个Html模板
     * </pre>
     */
    public void newHtmlTemplate(com.jjrobot.andy4.escpospb.EscPosServicePB.NewHtmlTemplateRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.escpospb.EscPosServicePB.NewHtmlTemplateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNewHtmlTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListHtmlTemplates 获取Html模板列表
     * </pre>
     */
    public void listHtmlTemplates(com.jjrobot.andy4.escpospb.EscPosServicePB.ListHtmlTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.escpospb.EscPosServicePB.ListHtmlTemplatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListHtmlTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetHtmlTemplate 获取Html模板
     * </pre>
     */
    public void getHtmlTemplate(com.jjrobot.andy4.escpospb.EscPosServicePB.GetHtmlTemplateRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.escpospb.EscPosServicePB.GetHtmlTemplateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHtmlTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateHtmlTemplate 更新Html模板
     * HtmlTemplate基于(Quill)[https://quilljs.com]实现编辑部分
     * 插值占位符为{{}}
     * 插值使用请参考PrintHtmlTemplate及PrintHtmlTemplateRequest
     * </pre>
     */
    public void updateHtmlTemplate(com.jjrobot.andy4.escpospb.EscPosServicePB.UpdateHtmlTemplateRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.escpospb.EscPosServicePB.UpdateHtmlTemplateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateHtmlTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteHtmlTemplates 删除Html模板列表
     * </pre>
     */
    public void deleteHtmlTemplates(com.jjrobot.andy4.escpospb.EscPosServicePB.DeleteHtmlTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.escpospb.EscPosServicePB.DeleteHtmlTemplatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteHtmlTemplatesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPrintRawMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.escpospb.EscPosServicePB.PrintRawRequest,
                com.jjrobot.andy4.escpospb.EscPosServicePB.PrintRawResponse>(
                  this, METHODID_PRINT_RAW)))
          .addMethod(
            getPrintElementsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.escpospb.EscPosServicePB.PrintElementsRequest,
                com.jjrobot.andy4.escpospb.EscPosServicePB.PrintElementsResponse>(
                  this, METHODID_PRINT_ELEMENTS)))
          .addMethod(
            getPrintHtmlTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.escpospb.EscPosServicePB.PrintHtmlTemplateRequest,
                com.jjrobot.andy4.escpospb.EscPosServicePB.PrintHtmlTemplateResponse>(
                  this, METHODID_PRINT_HTML_TEMPLATE)))
          .addMethod(
            getNewHtmlTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.escpospb.EscPosServicePB.NewHtmlTemplateRequest,
                com.jjrobot.andy4.escpospb.EscPosServicePB.NewHtmlTemplateResponse>(
                  this, METHODID_NEW_HTML_TEMPLATE)))
          .addMethod(
            getListHtmlTemplatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.escpospb.EscPosServicePB.ListHtmlTemplatesRequest,
                com.jjrobot.andy4.escpospb.EscPosServicePB.ListHtmlTemplatesResponse>(
                  this, METHODID_LIST_HTML_TEMPLATES)))
          .addMethod(
            getGetHtmlTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.escpospb.EscPosServicePB.GetHtmlTemplateRequest,
                com.jjrobot.andy4.escpospb.EscPosServicePB.GetHtmlTemplateResponse>(
                  this, METHODID_GET_HTML_TEMPLATE)))
          .addMethod(
            getUpdateHtmlTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.escpospb.EscPosServicePB.UpdateHtmlTemplateRequest,
                com.jjrobot.andy4.escpospb.EscPosServicePB.UpdateHtmlTemplateResponse>(
                  this, METHODID_UPDATE_HTML_TEMPLATE)))
          .addMethod(
            getDeleteHtmlTemplatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.escpospb.EscPosServicePB.DeleteHtmlTemplatesRequest,
                com.jjrobot.andy4.escpospb.EscPosServicePB.DeleteHtmlTemplatesResponse>(
                  this, METHODID_DELETE_HTML_TEMPLATES)))
          .build();
    }
  }

  /**
   * <pre>
   * escposService.EscPosService 小票打印设备的打印与模板管理
   * 开发管理平台功能参考: http://10.10.10.2/esc_pos
   * </pre>
   */
  public static final class EscPosServiceStub extends io.grpc.stub.AbstractAsyncStub<EscPosServiceStub> {
    private EscPosServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EscPosServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EscPosServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * PrintRaw 直接输入打印设备协议数据进行打印
     * 用于支持外部程序直接通过协议方式打印
     * 此方法为最底层与硬件设备通讯的方法
     * </pre>
     */
    public void printRaw(com.jjrobot.andy4.escpospb.EscPosServicePB.PrintRawRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.escpospb.EscPosServicePB.PrintRawResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPrintRawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PrintElements 通过Element对象描述内容进行打印
     * Element基于行进行内容描述，通过描述每行的内容构建为打印数据
     * 不支持单行中图片与文字混合打印
     * 底层方法为PrintRaw
     * </pre>
     */
    public void printElements(com.jjrobot.andy4.escpospb.EscPosServicePB.PrintElementsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.escpospb.EscPosServicePB.PrintElementsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPrintElementsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PrintHtmlTemplate 通过Html预设模板内容进行插值打印
     * 模板中请使用"{{}}"符号标记占位符
     * 如: 联系电话: {{tel}}
     *     参数: {"params": {"tel": "123"}}
     * 底层方法为PrintElements
     * </pre>
     */
    public void printHtmlTemplate(com.jjrobot.andy4.escpospb.EscPosServicePB.PrintHtmlTemplateRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.escpospb.EscPosServicePB.PrintHtmlTemplateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPrintHtmlTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NewHtmlTemplate 新建一个Html模板
     * </pre>
     */
    public void newHtmlTemplate(com.jjrobot.andy4.escpospb.EscPosServicePB.NewHtmlTemplateRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.escpospb.EscPosServicePB.NewHtmlTemplateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNewHtmlTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListHtmlTemplates 获取Html模板列表
     * </pre>
     */
    public void listHtmlTemplates(com.jjrobot.andy4.escpospb.EscPosServicePB.ListHtmlTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.escpospb.EscPosServicePB.ListHtmlTemplatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListHtmlTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetHtmlTemplate 获取Html模板
     * </pre>
     */
    public void getHtmlTemplate(com.jjrobot.andy4.escpospb.EscPosServicePB.GetHtmlTemplateRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.escpospb.EscPosServicePB.GetHtmlTemplateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHtmlTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateHtmlTemplate 更新Html模板
     * HtmlTemplate基于(Quill)[https://quilljs.com]实现编辑部分
     * 插值占位符为{{}}
     * 插值使用请参考PrintHtmlTemplate及PrintHtmlTemplateRequest
     * </pre>
     */
    public void updateHtmlTemplate(com.jjrobot.andy4.escpospb.EscPosServicePB.UpdateHtmlTemplateRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.escpospb.EscPosServicePB.UpdateHtmlTemplateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateHtmlTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteHtmlTemplates 删除Html模板列表
     * </pre>
     */
    public void deleteHtmlTemplates(com.jjrobot.andy4.escpospb.EscPosServicePB.DeleteHtmlTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.escpospb.EscPosServicePB.DeleteHtmlTemplatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteHtmlTemplatesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * escposService.EscPosService 小票打印设备的打印与模板管理
   * 开发管理平台功能参考: http://10.10.10.2/esc_pos
   * </pre>
   */
  public static final class EscPosServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EscPosServiceBlockingStub> {
    private EscPosServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EscPosServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EscPosServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * PrintRaw 直接输入打印设备协议数据进行打印
     * 用于支持外部程序直接通过协议方式打印
     * 此方法为最底层与硬件设备通讯的方法
     * </pre>
     */
    public com.jjrobot.andy4.escpospb.EscPosServicePB.PrintRawResponse printRaw(com.jjrobot.andy4.escpospb.EscPosServicePB.PrintRawRequest request) {
      return blockingUnaryCall(
          getChannel(), getPrintRawMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PrintElements 通过Element对象描述内容进行打印
     * Element基于行进行内容描述，通过描述每行的内容构建为打印数据
     * 不支持单行中图片与文字混合打印
     * 底层方法为PrintRaw
     * </pre>
     */
    public com.jjrobot.andy4.escpospb.EscPosServicePB.PrintElementsResponse printElements(com.jjrobot.andy4.escpospb.EscPosServicePB.PrintElementsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPrintElementsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PrintHtmlTemplate 通过Html预设模板内容进行插值打印
     * 模板中请使用"{{}}"符号标记占位符
     * 如: 联系电话: {{tel}}
     *     参数: {"params": {"tel": "123"}}
     * 底层方法为PrintElements
     * </pre>
     */
    public com.jjrobot.andy4.escpospb.EscPosServicePB.PrintHtmlTemplateResponse printHtmlTemplate(com.jjrobot.andy4.escpospb.EscPosServicePB.PrintHtmlTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), getPrintHtmlTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NewHtmlTemplate 新建一个Html模板
     * </pre>
     */
    public com.jjrobot.andy4.escpospb.EscPosServicePB.NewHtmlTemplateResponse newHtmlTemplate(com.jjrobot.andy4.escpospb.EscPosServicePB.NewHtmlTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), getNewHtmlTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListHtmlTemplates 获取Html模板列表
     * </pre>
     */
    public com.jjrobot.andy4.escpospb.EscPosServicePB.ListHtmlTemplatesResponse listHtmlTemplates(com.jjrobot.andy4.escpospb.EscPosServicePB.ListHtmlTemplatesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListHtmlTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetHtmlTemplate 获取Html模板
     * </pre>
     */
    public com.jjrobot.andy4.escpospb.EscPosServicePB.GetHtmlTemplateResponse getHtmlTemplate(com.jjrobot.andy4.escpospb.EscPosServicePB.GetHtmlTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetHtmlTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateHtmlTemplate 更新Html模板
     * HtmlTemplate基于(Quill)[https://quilljs.com]实现编辑部分
     * 插值占位符为{{}}
     * 插值使用请参考PrintHtmlTemplate及PrintHtmlTemplateRequest
     * </pre>
     */
    public com.jjrobot.andy4.escpospb.EscPosServicePB.UpdateHtmlTemplateResponse updateHtmlTemplate(com.jjrobot.andy4.escpospb.EscPosServicePB.UpdateHtmlTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateHtmlTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteHtmlTemplates 删除Html模板列表
     * </pre>
     */
    public com.jjrobot.andy4.escpospb.EscPosServicePB.DeleteHtmlTemplatesResponse deleteHtmlTemplates(com.jjrobot.andy4.escpospb.EscPosServicePB.DeleteHtmlTemplatesRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteHtmlTemplatesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * escposService.EscPosService 小票打印设备的打印与模板管理
   * 开发管理平台功能参考: http://10.10.10.2/esc_pos
   * </pre>
   */
  public static final class EscPosServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EscPosServiceFutureStub> {
    private EscPosServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EscPosServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EscPosServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * PrintRaw 直接输入打印设备协议数据进行打印
     * 用于支持外部程序直接通过协议方式打印
     * 此方法为最底层与硬件设备通讯的方法
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.escpospb.EscPosServicePB.PrintRawResponse> printRaw(
        com.jjrobot.andy4.escpospb.EscPosServicePB.PrintRawRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPrintRawMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PrintElements 通过Element对象描述内容进行打印
     * Element基于行进行内容描述，通过描述每行的内容构建为打印数据
     * 不支持单行中图片与文字混合打印
     * 底层方法为PrintRaw
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.escpospb.EscPosServicePB.PrintElementsResponse> printElements(
        com.jjrobot.andy4.escpospb.EscPosServicePB.PrintElementsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPrintElementsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PrintHtmlTemplate 通过Html预设模板内容进行插值打印
     * 模板中请使用"{{}}"符号标记占位符
     * 如: 联系电话: {{tel}}
     *     参数: {"params": {"tel": "123"}}
     * 底层方法为PrintElements
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.escpospb.EscPosServicePB.PrintHtmlTemplateResponse> printHtmlTemplate(
        com.jjrobot.andy4.escpospb.EscPosServicePB.PrintHtmlTemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPrintHtmlTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NewHtmlTemplate 新建一个Html模板
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.escpospb.EscPosServicePB.NewHtmlTemplateResponse> newHtmlTemplate(
        com.jjrobot.andy4.escpospb.EscPosServicePB.NewHtmlTemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNewHtmlTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListHtmlTemplates 获取Html模板列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.escpospb.EscPosServicePB.ListHtmlTemplatesResponse> listHtmlTemplates(
        com.jjrobot.andy4.escpospb.EscPosServicePB.ListHtmlTemplatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListHtmlTemplatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetHtmlTemplate 获取Html模板
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.escpospb.EscPosServicePB.GetHtmlTemplateResponse> getHtmlTemplate(
        com.jjrobot.andy4.escpospb.EscPosServicePB.GetHtmlTemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHtmlTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateHtmlTemplate 更新Html模板
     * HtmlTemplate基于(Quill)[https://quilljs.com]实现编辑部分
     * 插值占位符为{{}}
     * 插值使用请参考PrintHtmlTemplate及PrintHtmlTemplateRequest
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.escpospb.EscPosServicePB.UpdateHtmlTemplateResponse> updateHtmlTemplate(
        com.jjrobot.andy4.escpospb.EscPosServicePB.UpdateHtmlTemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateHtmlTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteHtmlTemplates 删除Html模板列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.escpospb.EscPosServicePB.DeleteHtmlTemplatesResponse> deleteHtmlTemplates(
        com.jjrobot.andy4.escpospb.EscPosServicePB.DeleteHtmlTemplatesRequest request) {
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
          serviceImpl.printRaw((com.jjrobot.andy4.escpospb.EscPosServicePB.PrintRawRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.escpospb.EscPosServicePB.PrintRawResponse>) responseObserver);
          break;
        case METHODID_PRINT_ELEMENTS:
          serviceImpl.printElements((com.jjrobot.andy4.escpospb.EscPosServicePB.PrintElementsRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.escpospb.EscPosServicePB.PrintElementsResponse>) responseObserver);
          break;
        case METHODID_PRINT_HTML_TEMPLATE:
          serviceImpl.printHtmlTemplate((com.jjrobot.andy4.escpospb.EscPosServicePB.PrintHtmlTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.escpospb.EscPosServicePB.PrintHtmlTemplateResponse>) responseObserver);
          break;
        case METHODID_NEW_HTML_TEMPLATE:
          serviceImpl.newHtmlTemplate((com.jjrobot.andy4.escpospb.EscPosServicePB.NewHtmlTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.escpospb.EscPosServicePB.NewHtmlTemplateResponse>) responseObserver);
          break;
        case METHODID_LIST_HTML_TEMPLATES:
          serviceImpl.listHtmlTemplates((com.jjrobot.andy4.escpospb.EscPosServicePB.ListHtmlTemplatesRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.escpospb.EscPosServicePB.ListHtmlTemplatesResponse>) responseObserver);
          break;
        case METHODID_GET_HTML_TEMPLATE:
          serviceImpl.getHtmlTemplate((com.jjrobot.andy4.escpospb.EscPosServicePB.GetHtmlTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.escpospb.EscPosServicePB.GetHtmlTemplateResponse>) responseObserver);
          break;
        case METHODID_UPDATE_HTML_TEMPLATE:
          serviceImpl.updateHtmlTemplate((com.jjrobot.andy4.escpospb.EscPosServicePB.UpdateHtmlTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.escpospb.EscPosServicePB.UpdateHtmlTemplateResponse>) responseObserver);
          break;
        case METHODID_DELETE_HTML_TEMPLATES:
          serviceImpl.deleteHtmlTemplates((com.jjrobot.andy4.escpospb.EscPosServicePB.DeleteHtmlTemplatesRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.escpospb.EscPosServicePB.DeleteHtmlTemplatesResponse>) responseObserver);
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
      return com.jjrobot.andy4.escpospb.EscPosServicePB.getDescriptor();
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
