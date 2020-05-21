package com.jjrobot.andy4.navpb;

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
 * navService.NavController 导航控制器
 * 导航控制器以充电为最高优先级，处于充电相关时，一切其它控制请求均返回Reject错误，
 * 需取得控制权时，请取消充电以恢复控制。
 * 开发管理平台功能参考: http://10.10.10.2/nav
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.1-SNAPSHOT)",
    comments = "Source: nav.proto")
public final class NavControllerGrpc {

  private NavControllerGrpc() {}

  public static final String SERVICE_NAME = "navService.NavController";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.MoveRequest,
      com.jjrobot.andy4.navpb.NavControllerPB.MoveResponse> getMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Move",
      requestType = com.jjrobot.andy4.navpb.NavControllerPB.MoveRequest.class,
      responseType = com.jjrobot.andy4.navpb.NavControllerPB.MoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.MoveRequest,
      com.jjrobot.andy4.navpb.NavControllerPB.MoveResponse> getMoveMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.MoveRequest, com.jjrobot.andy4.navpb.NavControllerPB.MoveResponse> getMoveMethod;
    if ((getMoveMethod = NavControllerGrpc.getMoveMethod) == null) {
      synchronized (NavControllerGrpc.class) {
        if ((getMoveMethod = NavControllerGrpc.getMoveMethod) == null) {
          NavControllerGrpc.getMoveMethod = getMoveMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.navpb.NavControllerPB.MoveRequest, com.jjrobot.andy4.navpb.NavControllerPB.MoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Move"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.NavControllerPB.MoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.NavControllerPB.MoveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavControllerMethodDescriptorSupplier("Move"))
              .build();
        }
      }
    }
    return getMoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.NavToRequest,
      com.jjrobot.andy4.navpb.NavControllerPB.NavToResponse> getNavToMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NavTo",
      requestType = com.jjrobot.andy4.navpb.NavControllerPB.NavToRequest.class,
      responseType = com.jjrobot.andy4.navpb.NavControllerPB.NavToResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.NavToRequest,
      com.jjrobot.andy4.navpb.NavControllerPB.NavToResponse> getNavToMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.NavToRequest, com.jjrobot.andy4.navpb.NavControllerPB.NavToResponse> getNavToMethod;
    if ((getNavToMethod = NavControllerGrpc.getNavToMethod) == null) {
      synchronized (NavControllerGrpc.class) {
        if ((getNavToMethod = NavControllerGrpc.getNavToMethod) == null) {
          NavControllerGrpc.getNavToMethod = getNavToMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.navpb.NavControllerPB.NavToRequest, com.jjrobot.andy4.navpb.NavControllerPB.NavToResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NavTo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.NavControllerPB.NavToRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.NavControllerPB.NavToResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavControllerMethodDescriptorSupplier("NavTo"))
              .build();
        }
      }
    }
    return getNavToMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.NavStopRequest,
      com.jjrobot.andy4.navpb.NavControllerPB.NavStopResponse> getNavStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NavStop",
      requestType = com.jjrobot.andy4.navpb.NavControllerPB.NavStopRequest.class,
      responseType = com.jjrobot.andy4.navpb.NavControllerPB.NavStopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.NavStopRequest,
      com.jjrobot.andy4.navpb.NavControllerPB.NavStopResponse> getNavStopMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.NavStopRequest, com.jjrobot.andy4.navpb.NavControllerPB.NavStopResponse> getNavStopMethod;
    if ((getNavStopMethod = NavControllerGrpc.getNavStopMethod) == null) {
      synchronized (NavControllerGrpc.class) {
        if ((getNavStopMethod = NavControllerGrpc.getNavStopMethod) == null) {
          NavControllerGrpc.getNavStopMethod = getNavStopMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.navpb.NavControllerPB.NavStopRequest, com.jjrobot.andy4.navpb.NavControllerPB.NavStopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NavStop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.NavControllerPB.NavStopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.NavControllerPB.NavStopResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavControllerMethodDescriptorSupplier("NavStop"))
              .build();
        }
      }
    }
    return getNavStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.AutoChargeRequest,
      com.jjrobot.andy4.navpb.NavControllerPB.AutoChargeResponse> getAutoChargeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AutoCharge",
      requestType = com.jjrobot.andy4.navpb.NavControllerPB.AutoChargeRequest.class,
      responseType = com.jjrobot.andy4.navpb.NavControllerPB.AutoChargeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.AutoChargeRequest,
      com.jjrobot.andy4.navpb.NavControllerPB.AutoChargeResponse> getAutoChargeMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.AutoChargeRequest, com.jjrobot.andy4.navpb.NavControllerPB.AutoChargeResponse> getAutoChargeMethod;
    if ((getAutoChargeMethod = NavControllerGrpc.getAutoChargeMethod) == null) {
      synchronized (NavControllerGrpc.class) {
        if ((getAutoChargeMethod = NavControllerGrpc.getAutoChargeMethod) == null) {
          NavControllerGrpc.getAutoChargeMethod = getAutoChargeMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.navpb.NavControllerPB.AutoChargeRequest, com.jjrobot.andy4.navpb.NavControllerPB.AutoChargeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AutoCharge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.NavControllerPB.AutoChargeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.NavControllerPB.AutoChargeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavControllerMethodDescriptorSupplier("AutoCharge"))
              .build();
        }
      }
    }
    return getAutoChargeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.RotateRequest,
      com.jjrobot.andy4.navpb.NavControllerPB.RotateResponse> getRotateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Rotate",
      requestType = com.jjrobot.andy4.navpb.NavControllerPB.RotateRequest.class,
      responseType = com.jjrobot.andy4.navpb.NavControllerPB.RotateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.RotateRequest,
      com.jjrobot.andy4.navpb.NavControllerPB.RotateResponse> getRotateMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.RotateRequest, com.jjrobot.andy4.navpb.NavControllerPB.RotateResponse> getRotateMethod;
    if ((getRotateMethod = NavControllerGrpc.getRotateMethod) == null) {
      synchronized (NavControllerGrpc.class) {
        if ((getRotateMethod = NavControllerGrpc.getRotateMethod) == null) {
          NavControllerGrpc.getRotateMethod = getRotateMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.navpb.NavControllerPB.RotateRequest, com.jjrobot.andy4.navpb.NavControllerPB.RotateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Rotate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.NavControllerPB.RotateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.NavControllerPB.RotateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavControllerMethodDescriptorSupplier("Rotate"))
              .build();
        }
      }
    }
    return getRotateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.OnNavEventChangeRequest,
      com.jjrobot.andy4.navpb.NavControllerPB.OnNavEventChangeResponse> getOnNavEventChangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnNavEventChange",
      requestType = com.jjrobot.andy4.navpb.NavControllerPB.OnNavEventChangeRequest.class,
      responseType = com.jjrobot.andy4.navpb.NavControllerPB.OnNavEventChangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.OnNavEventChangeRequest,
      com.jjrobot.andy4.navpb.NavControllerPB.OnNavEventChangeResponse> getOnNavEventChangeMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.OnNavEventChangeRequest, com.jjrobot.andy4.navpb.NavControllerPB.OnNavEventChangeResponse> getOnNavEventChangeMethod;
    if ((getOnNavEventChangeMethod = NavControllerGrpc.getOnNavEventChangeMethod) == null) {
      synchronized (NavControllerGrpc.class) {
        if ((getOnNavEventChangeMethod = NavControllerGrpc.getOnNavEventChangeMethod) == null) {
          NavControllerGrpc.getOnNavEventChangeMethod = getOnNavEventChangeMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.navpb.NavControllerPB.OnNavEventChangeRequest, com.jjrobot.andy4.navpb.NavControllerPB.OnNavEventChangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnNavEventChange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.NavControllerPB.OnNavEventChangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.NavControllerPB.OnNavEventChangeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavControllerMethodDescriptorSupplier("OnNavEventChange"))
              .build();
        }
      }
    }
    return getOnNavEventChangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.NewRouteRequest,
      com.jjrobot.andy4.navpb.NavControllerPB.NewRouteResponse> getNewRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewRoute",
      requestType = com.jjrobot.andy4.navpb.NavControllerPB.NewRouteRequest.class,
      responseType = com.jjrobot.andy4.navpb.NavControllerPB.NewRouteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.NewRouteRequest,
      com.jjrobot.andy4.navpb.NavControllerPB.NewRouteResponse> getNewRouteMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.NewRouteRequest, com.jjrobot.andy4.navpb.NavControllerPB.NewRouteResponse> getNewRouteMethod;
    if ((getNewRouteMethod = NavControllerGrpc.getNewRouteMethod) == null) {
      synchronized (NavControllerGrpc.class) {
        if ((getNewRouteMethod = NavControllerGrpc.getNewRouteMethod) == null) {
          NavControllerGrpc.getNewRouteMethod = getNewRouteMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.navpb.NavControllerPB.NewRouteRequest, com.jjrobot.andy4.navpb.NavControllerPB.NewRouteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.NavControllerPB.NewRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.NavControllerPB.NewRouteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavControllerMethodDescriptorSupplier("NewRoute"))
              .build();
        }
      }
    }
    return getNewRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.ListRoutesRequest,
      com.jjrobot.andy4.navpb.NavControllerPB.ListRoutesResponse> getListRoutesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRoutes",
      requestType = com.jjrobot.andy4.navpb.NavControllerPB.ListRoutesRequest.class,
      responseType = com.jjrobot.andy4.navpb.NavControllerPB.ListRoutesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.ListRoutesRequest,
      com.jjrobot.andy4.navpb.NavControllerPB.ListRoutesResponse> getListRoutesMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.ListRoutesRequest, com.jjrobot.andy4.navpb.NavControllerPB.ListRoutesResponse> getListRoutesMethod;
    if ((getListRoutesMethod = NavControllerGrpc.getListRoutesMethod) == null) {
      synchronized (NavControllerGrpc.class) {
        if ((getListRoutesMethod = NavControllerGrpc.getListRoutesMethod) == null) {
          NavControllerGrpc.getListRoutesMethod = getListRoutesMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.navpb.NavControllerPB.ListRoutesRequest, com.jjrobot.andy4.navpb.NavControllerPB.ListRoutesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRoutes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.NavControllerPB.ListRoutesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.NavControllerPB.ListRoutesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavControllerMethodDescriptorSupplier("ListRoutes"))
              .build();
        }
      }
    }
    return getListRoutesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.UpdateRouteRequest,
      com.jjrobot.andy4.navpb.NavControllerPB.UpdateRouteResponse> getUpdateRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRoute",
      requestType = com.jjrobot.andy4.navpb.NavControllerPB.UpdateRouteRequest.class,
      responseType = com.jjrobot.andy4.navpb.NavControllerPB.UpdateRouteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.UpdateRouteRequest,
      com.jjrobot.andy4.navpb.NavControllerPB.UpdateRouteResponse> getUpdateRouteMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.UpdateRouteRequest, com.jjrobot.andy4.navpb.NavControllerPB.UpdateRouteResponse> getUpdateRouteMethod;
    if ((getUpdateRouteMethod = NavControllerGrpc.getUpdateRouteMethod) == null) {
      synchronized (NavControllerGrpc.class) {
        if ((getUpdateRouteMethod = NavControllerGrpc.getUpdateRouteMethod) == null) {
          NavControllerGrpc.getUpdateRouteMethod = getUpdateRouteMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.navpb.NavControllerPB.UpdateRouteRequest, com.jjrobot.andy4.navpb.NavControllerPB.UpdateRouteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.NavControllerPB.UpdateRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.NavControllerPB.UpdateRouteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavControllerMethodDescriptorSupplier("UpdateRoute"))
              .build();
        }
      }
    }
    return getUpdateRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.DeleteRoutesRequest,
      com.jjrobot.andy4.navpb.NavControllerPB.DeleteRoutesResponse> getDeleteRoutesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRoutes",
      requestType = com.jjrobot.andy4.navpb.NavControllerPB.DeleteRoutesRequest.class,
      responseType = com.jjrobot.andy4.navpb.NavControllerPB.DeleteRoutesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.DeleteRoutesRequest,
      com.jjrobot.andy4.navpb.NavControllerPB.DeleteRoutesResponse> getDeleteRoutesMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.navpb.NavControllerPB.DeleteRoutesRequest, com.jjrobot.andy4.navpb.NavControllerPB.DeleteRoutesResponse> getDeleteRoutesMethod;
    if ((getDeleteRoutesMethod = NavControllerGrpc.getDeleteRoutesMethod) == null) {
      synchronized (NavControllerGrpc.class) {
        if ((getDeleteRoutesMethod = NavControllerGrpc.getDeleteRoutesMethod) == null) {
          NavControllerGrpc.getDeleteRoutesMethod = getDeleteRoutesMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.navpb.NavControllerPB.DeleteRoutesRequest, com.jjrobot.andy4.navpb.NavControllerPB.DeleteRoutesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRoutes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.NavControllerPB.DeleteRoutesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.navpb.NavControllerPB.DeleteRoutesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavControllerMethodDescriptorSupplier("DeleteRoutes"))
              .build();
        }
      }
    }
    return getDeleteRoutesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NavControllerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NavControllerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NavControllerStub>() {
        @java.lang.Override
        public NavControllerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NavControllerStub(channel, callOptions);
        }
      };
    return NavControllerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NavControllerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NavControllerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NavControllerBlockingStub>() {
        @java.lang.Override
        public NavControllerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NavControllerBlockingStub(channel, callOptions);
        }
      };
    return NavControllerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NavControllerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NavControllerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NavControllerFutureStub>() {
        @java.lang.Override
        public NavControllerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NavControllerFutureStub(channel, callOptions);
        }
      };
    return NavControllerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * navService.NavController 导航控制器
   * 导航控制器以充电为最高优先级，处于充电相关时，一切其它控制请求均返回Reject错误，
   * 需取得控制权时，请取消充电以恢复控制。
   * 开发管理平台功能参考: http://10.10.10.2/nav
   * </pre>
   */
  public static abstract class NavControllerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Move 遥控移动
     * 遥控移动需持续发送移动指令，通常为300ms
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.MoveRequest> move(
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.MoveResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getMoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * NavTo 导航
     * </pre>
     */
    public void navTo(com.jjrobot.andy4.navpb.NavControllerPB.NavToRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.NavToResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNavToMethod(), responseObserver);
    }

    /**
     * <pre>
     * NavStop 中止
     * 支持导航、旋转的中止
     * 导航中止后，可通过NavTo中CONTINUE恢复该目标导航
     * </pre>
     */
    public void navStop(com.jjrobot.andy4.navpb.NavControllerPB.NavStopRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.NavStopResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNavStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * AutoCharge 自动充电
     * 开发管理平台功能参考: http://10.10.10.2/power
     * </pre>
     */
    public void autoCharge(com.jjrobot.andy4.navpb.NavControllerPB.AutoChargeRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.AutoChargeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAutoChargeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Rotate 原地旋转
     * </pre>
     */
    public void rotate(com.jjrobot.andy4.navpb.NavControllerPB.RotateRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.RotateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRotateMethod(), responseObserver);
    }

    /**
     * <pre>
     * OnNavEventChange 导航事件监听
     * 监听导航模块中各类事件的变动更新，详见OnNavEventChangeResponse
     * </pre>
     */
    public void onNavEventChange(com.jjrobot.andy4.navpb.NavControllerPB.OnNavEventChangeRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.OnNavEventChangeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOnNavEventChangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * NewRoute 新建线路
     * 无线导航不支持通过此方法构建
     * </pre>
     */
    public void newRoute(com.jjrobot.andy4.navpb.NavControllerPB.NewRouteRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.NewRouteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNewRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListRoutes 获取线路列表
     * 无线导航此数据为地图数据的预设点数据，
     * 可通过navService.Map获取更明细数据
     * </pre>
     */
    public void listRoutes(com.jjrobot.andy4.navpb.NavControllerPB.ListRoutesRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.ListRoutesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListRoutesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateRoute 更新线路信息
     * 无线导航不支持通过此方法更新
     * </pre>
     */
    public void updateRoute(com.jjrobot.andy4.navpb.NavControllerPB.UpdateRouteRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.UpdateRouteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteRoutes 删除多个线路
     * 无线导航不支持通过此方法删除
     * </pre>
     */
    public void deleteRoutes(com.jjrobot.andy4.navpb.NavControllerPB.DeleteRoutesRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.DeleteRoutesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteRoutesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMoveMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.jjrobot.andy4.navpb.NavControllerPB.MoveRequest,
                com.jjrobot.andy4.navpb.NavControllerPB.MoveResponse>(
                  this, METHODID_MOVE)))
          .addMethod(
            getNavToMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.navpb.NavControllerPB.NavToRequest,
                com.jjrobot.andy4.navpb.NavControllerPB.NavToResponse>(
                  this, METHODID_NAV_TO)))
          .addMethod(
            getNavStopMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.navpb.NavControllerPB.NavStopRequest,
                com.jjrobot.andy4.navpb.NavControllerPB.NavStopResponse>(
                  this, METHODID_NAV_STOP)))
          .addMethod(
            getAutoChargeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.navpb.NavControllerPB.AutoChargeRequest,
                com.jjrobot.andy4.navpb.NavControllerPB.AutoChargeResponse>(
                  this, METHODID_AUTO_CHARGE)))
          .addMethod(
            getRotateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.navpb.NavControllerPB.RotateRequest,
                com.jjrobot.andy4.navpb.NavControllerPB.RotateResponse>(
                  this, METHODID_ROTATE)))
          .addMethod(
            getOnNavEventChangeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jjrobot.andy4.navpb.NavControllerPB.OnNavEventChangeRequest,
                com.jjrobot.andy4.navpb.NavControllerPB.OnNavEventChangeResponse>(
                  this, METHODID_ON_NAV_EVENT_CHANGE)))
          .addMethod(
            getNewRouteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.navpb.NavControllerPB.NewRouteRequest,
                com.jjrobot.andy4.navpb.NavControllerPB.NewRouteResponse>(
                  this, METHODID_NEW_ROUTE)))
          .addMethod(
            getListRoutesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.navpb.NavControllerPB.ListRoutesRequest,
                com.jjrobot.andy4.navpb.NavControllerPB.ListRoutesResponse>(
                  this, METHODID_LIST_ROUTES)))
          .addMethod(
            getUpdateRouteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.navpb.NavControllerPB.UpdateRouteRequest,
                com.jjrobot.andy4.navpb.NavControllerPB.UpdateRouteResponse>(
                  this, METHODID_UPDATE_ROUTE)))
          .addMethod(
            getDeleteRoutesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.navpb.NavControllerPB.DeleteRoutesRequest,
                com.jjrobot.andy4.navpb.NavControllerPB.DeleteRoutesResponse>(
                  this, METHODID_DELETE_ROUTES)))
          .build();
    }
  }

  /**
   * <pre>
   * navService.NavController 导航控制器
   * 导航控制器以充电为最高优先级，处于充电相关时，一切其它控制请求均返回Reject错误，
   * 需取得控制权时，请取消充电以恢复控制。
   * 开发管理平台功能参考: http://10.10.10.2/nav
   * </pre>
   */
  public static final class NavControllerStub extends io.grpc.stub.AbstractAsyncStub<NavControllerStub> {
    private NavControllerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NavControllerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NavControllerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Move 遥控移动
     * 遥控移动需持续发送移动指令，通常为300ms
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.MoveRequest> move(
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.MoveResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * NavTo 导航
     * </pre>
     */
    public void navTo(com.jjrobot.andy4.navpb.NavControllerPB.NavToRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.NavToResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNavToMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NavStop 中止
     * 支持导航、旋转的中止
     * 导航中止后，可通过NavTo中CONTINUE恢复该目标导航
     * </pre>
     */
    public void navStop(com.jjrobot.andy4.navpb.NavControllerPB.NavStopRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.NavStopResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNavStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AutoCharge 自动充电
     * 开发管理平台功能参考: http://10.10.10.2/power
     * </pre>
     */
    public void autoCharge(com.jjrobot.andy4.navpb.NavControllerPB.AutoChargeRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.AutoChargeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAutoChargeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Rotate 原地旋转
     * </pre>
     */
    public void rotate(com.jjrobot.andy4.navpb.NavControllerPB.RotateRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.RotateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRotateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OnNavEventChange 导航事件监听
     * 监听导航模块中各类事件的变动更新，详见OnNavEventChangeResponse
     * </pre>
     */
    public void onNavEventChange(com.jjrobot.andy4.navpb.NavControllerPB.OnNavEventChangeRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.OnNavEventChangeResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getOnNavEventChangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NewRoute 新建线路
     * 无线导航不支持通过此方法构建
     * </pre>
     */
    public void newRoute(com.jjrobot.andy4.navpb.NavControllerPB.NewRouteRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.NewRouteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNewRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListRoutes 获取线路列表
     * 无线导航此数据为地图数据的预设点数据，
     * 可通过navService.Map获取更明细数据
     * </pre>
     */
    public void listRoutes(com.jjrobot.andy4.navpb.NavControllerPB.ListRoutesRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.ListRoutesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListRoutesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateRoute 更新线路信息
     * 无线导航不支持通过此方法更新
     * </pre>
     */
    public void updateRoute(com.jjrobot.andy4.navpb.NavControllerPB.UpdateRouteRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.UpdateRouteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteRoutes 删除多个线路
     * 无线导航不支持通过此方法删除
     * </pre>
     */
    public void deleteRoutes(com.jjrobot.andy4.navpb.NavControllerPB.DeleteRoutesRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.DeleteRoutesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteRoutesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * navService.NavController 导航控制器
   * 导航控制器以充电为最高优先级，处于充电相关时，一切其它控制请求均返回Reject错误，
   * 需取得控制权时，请取消充电以恢复控制。
   * 开发管理平台功能参考: http://10.10.10.2/nav
   * </pre>
   */
  public static final class NavControllerBlockingStub extends io.grpc.stub.AbstractBlockingStub<NavControllerBlockingStub> {
    private NavControllerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NavControllerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NavControllerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * NavTo 导航
     * </pre>
     */
    public com.jjrobot.andy4.navpb.NavControllerPB.NavToResponse navTo(com.jjrobot.andy4.navpb.NavControllerPB.NavToRequest request) {
      return blockingUnaryCall(
          getChannel(), getNavToMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NavStop 中止
     * 支持导航、旋转的中止
     * 导航中止后，可通过NavTo中CONTINUE恢复该目标导航
     * </pre>
     */
    public com.jjrobot.andy4.navpb.NavControllerPB.NavStopResponse navStop(com.jjrobot.andy4.navpb.NavControllerPB.NavStopRequest request) {
      return blockingUnaryCall(
          getChannel(), getNavStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AutoCharge 自动充电
     * 开发管理平台功能参考: http://10.10.10.2/power
     * </pre>
     */
    public com.jjrobot.andy4.navpb.NavControllerPB.AutoChargeResponse autoCharge(com.jjrobot.andy4.navpb.NavControllerPB.AutoChargeRequest request) {
      return blockingUnaryCall(
          getChannel(), getAutoChargeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Rotate 原地旋转
     * </pre>
     */
    public com.jjrobot.andy4.navpb.NavControllerPB.RotateResponse rotate(com.jjrobot.andy4.navpb.NavControllerPB.RotateRequest request) {
      return blockingUnaryCall(
          getChannel(), getRotateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OnNavEventChange 导航事件监听
     * 监听导航模块中各类事件的变动更新，详见OnNavEventChangeResponse
     * </pre>
     */
    public java.util.Iterator<com.jjrobot.andy4.navpb.NavControllerPB.OnNavEventChangeResponse> onNavEventChange(
        com.jjrobot.andy4.navpb.NavControllerPB.OnNavEventChangeRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getOnNavEventChangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NewRoute 新建线路
     * 无线导航不支持通过此方法构建
     * </pre>
     */
    public com.jjrobot.andy4.navpb.NavControllerPB.NewRouteResponse newRoute(com.jjrobot.andy4.navpb.NavControllerPB.NewRouteRequest request) {
      return blockingUnaryCall(
          getChannel(), getNewRouteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListRoutes 获取线路列表
     * 无线导航此数据为地图数据的预设点数据，
     * 可通过navService.Map获取更明细数据
     * </pre>
     */
    public com.jjrobot.andy4.navpb.NavControllerPB.ListRoutesResponse listRoutes(com.jjrobot.andy4.navpb.NavControllerPB.ListRoutesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListRoutesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateRoute 更新线路信息
     * 无线导航不支持通过此方法更新
     * </pre>
     */
    public com.jjrobot.andy4.navpb.NavControllerPB.UpdateRouteResponse updateRoute(com.jjrobot.andy4.navpb.NavControllerPB.UpdateRouteRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateRouteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteRoutes 删除多个线路
     * 无线导航不支持通过此方法删除
     * </pre>
     */
    public com.jjrobot.andy4.navpb.NavControllerPB.DeleteRoutesResponse deleteRoutes(com.jjrobot.andy4.navpb.NavControllerPB.DeleteRoutesRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteRoutesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * navService.NavController 导航控制器
   * 导航控制器以充电为最高优先级，处于充电相关时，一切其它控制请求均返回Reject错误，
   * 需取得控制权时，请取消充电以恢复控制。
   * 开发管理平台功能参考: http://10.10.10.2/nav
   * </pre>
   */
  public static final class NavControllerFutureStub extends io.grpc.stub.AbstractFutureStub<NavControllerFutureStub> {
    private NavControllerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NavControllerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NavControllerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * NavTo 导航
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.navpb.NavControllerPB.NavToResponse> navTo(
        com.jjrobot.andy4.navpb.NavControllerPB.NavToRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNavToMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NavStop 中止
     * 支持导航、旋转的中止
     * 导航中止后，可通过NavTo中CONTINUE恢复该目标导航
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.navpb.NavControllerPB.NavStopResponse> navStop(
        com.jjrobot.andy4.navpb.NavControllerPB.NavStopRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNavStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AutoCharge 自动充电
     * 开发管理平台功能参考: http://10.10.10.2/power
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.navpb.NavControllerPB.AutoChargeResponse> autoCharge(
        com.jjrobot.andy4.navpb.NavControllerPB.AutoChargeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAutoChargeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Rotate 原地旋转
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.navpb.NavControllerPB.RotateResponse> rotate(
        com.jjrobot.andy4.navpb.NavControllerPB.RotateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRotateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NewRoute 新建线路
     * 无线导航不支持通过此方法构建
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.navpb.NavControllerPB.NewRouteResponse> newRoute(
        com.jjrobot.andy4.navpb.NavControllerPB.NewRouteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNewRouteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListRoutes 获取线路列表
     * 无线导航此数据为地图数据的预设点数据，
     * 可通过navService.Map获取更明细数据
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.navpb.NavControllerPB.ListRoutesResponse> listRoutes(
        com.jjrobot.andy4.navpb.NavControllerPB.ListRoutesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListRoutesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateRoute 更新线路信息
     * 无线导航不支持通过此方法更新
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.navpb.NavControllerPB.UpdateRouteResponse> updateRoute(
        com.jjrobot.andy4.navpb.NavControllerPB.UpdateRouteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateRouteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteRoutes 删除多个线路
     * 无线导航不支持通过此方法删除
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.navpb.NavControllerPB.DeleteRoutesResponse> deleteRoutes(
        com.jjrobot.andy4.navpb.NavControllerPB.DeleteRoutesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteRoutesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NAV_TO = 0;
  private static final int METHODID_NAV_STOP = 1;
  private static final int METHODID_AUTO_CHARGE = 2;
  private static final int METHODID_ROTATE = 3;
  private static final int METHODID_ON_NAV_EVENT_CHANGE = 4;
  private static final int METHODID_NEW_ROUTE = 5;
  private static final int METHODID_LIST_ROUTES = 6;
  private static final int METHODID_UPDATE_ROUTE = 7;
  private static final int METHODID_DELETE_ROUTES = 8;
  private static final int METHODID_MOVE = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NavControllerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NavControllerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NAV_TO:
          serviceImpl.navTo((com.jjrobot.andy4.navpb.NavControllerPB.NavToRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.NavToResponse>) responseObserver);
          break;
        case METHODID_NAV_STOP:
          serviceImpl.navStop((com.jjrobot.andy4.navpb.NavControllerPB.NavStopRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.NavStopResponse>) responseObserver);
          break;
        case METHODID_AUTO_CHARGE:
          serviceImpl.autoCharge((com.jjrobot.andy4.navpb.NavControllerPB.AutoChargeRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.AutoChargeResponse>) responseObserver);
          break;
        case METHODID_ROTATE:
          serviceImpl.rotate((com.jjrobot.andy4.navpb.NavControllerPB.RotateRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.RotateResponse>) responseObserver);
          break;
        case METHODID_ON_NAV_EVENT_CHANGE:
          serviceImpl.onNavEventChange((com.jjrobot.andy4.navpb.NavControllerPB.OnNavEventChangeRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.OnNavEventChangeResponse>) responseObserver);
          break;
        case METHODID_NEW_ROUTE:
          serviceImpl.newRoute((com.jjrobot.andy4.navpb.NavControllerPB.NewRouteRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.NewRouteResponse>) responseObserver);
          break;
        case METHODID_LIST_ROUTES:
          serviceImpl.listRoutes((com.jjrobot.andy4.navpb.NavControllerPB.ListRoutesRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.ListRoutesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ROUTE:
          serviceImpl.updateRoute((com.jjrobot.andy4.navpb.NavControllerPB.UpdateRouteRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.UpdateRouteResponse>) responseObserver);
          break;
        case METHODID_DELETE_ROUTES:
          serviceImpl.deleteRoutes((com.jjrobot.andy4.navpb.NavControllerPB.DeleteRoutesRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.DeleteRoutesResponse>) responseObserver);
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
        case METHODID_MOVE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.move(
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.navpb.NavControllerPB.MoveResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NavControllerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NavControllerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jjrobot.andy4.navpb.NavControllerPB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NavController");
    }
  }

  private static final class NavControllerFileDescriptorSupplier
      extends NavControllerBaseDescriptorSupplier {
    NavControllerFileDescriptorSupplier() {}
  }

  private static final class NavControllerMethodDescriptorSupplier
      extends NavControllerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NavControllerMethodDescriptorSupplier(String methodName) {
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
      synchronized (NavControllerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NavControllerFileDescriptorSupplier())
              .addMethod(getMoveMethod())
              .addMethod(getNavToMethod())
              .addMethod(getNavStopMethod())
              .addMethod(getAutoChargeMethod())
              .addMethod(getRotateMethod())
              .addMethod(getOnNavEventChangeMethod())
              .addMethod(getNewRouteMethod())
              .addMethod(getListRoutesMethod())
              .addMethod(getUpdateRouteMethod())
              .addMethod(getDeleteRoutesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
