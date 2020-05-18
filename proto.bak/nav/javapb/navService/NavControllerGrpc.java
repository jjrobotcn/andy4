package navService;

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
    comments = "Source: nav.proto")
public final class NavControllerGrpc {

  private NavControllerGrpc() {}

  public static final String SERVICE_NAME = "navService.NavController";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<navService.Nav.MoveRequest,
      navService.Nav.MoveResponse> getMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Move",
      requestType = navService.Nav.MoveRequest.class,
      responseType = navService.Nav.MoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<navService.Nav.MoveRequest,
      navService.Nav.MoveResponse> getMoveMethod() {
    io.grpc.MethodDescriptor<navService.Nav.MoveRequest, navService.Nav.MoveResponse> getMoveMethod;
    if ((getMoveMethod = NavControllerGrpc.getMoveMethod) == null) {
      synchronized (NavControllerGrpc.class) {
        if ((getMoveMethod = NavControllerGrpc.getMoveMethod) == null) {
          NavControllerGrpc.getMoveMethod = getMoveMethod = 
              io.grpc.MethodDescriptor.<navService.Nav.MoveRequest, navService.Nav.MoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "navService.NavController", "Move"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.Nav.MoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.Nav.MoveResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NavControllerMethodDescriptorSupplier("Move"))
                  .build();
          }
        }
     }
     return getMoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<navService.Nav.NavToRequest,
      navService.Nav.NavToResponse> getNavToMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NavTo",
      requestType = navService.Nav.NavToRequest.class,
      responseType = navService.Nav.NavToResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<navService.Nav.NavToRequest,
      navService.Nav.NavToResponse> getNavToMethod() {
    io.grpc.MethodDescriptor<navService.Nav.NavToRequest, navService.Nav.NavToResponse> getNavToMethod;
    if ((getNavToMethod = NavControllerGrpc.getNavToMethod) == null) {
      synchronized (NavControllerGrpc.class) {
        if ((getNavToMethod = NavControllerGrpc.getNavToMethod) == null) {
          NavControllerGrpc.getNavToMethod = getNavToMethod = 
              io.grpc.MethodDescriptor.<navService.Nav.NavToRequest, navService.Nav.NavToResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "navService.NavController", "NavTo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.Nav.NavToRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.Nav.NavToResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NavControllerMethodDescriptorSupplier("NavTo"))
                  .build();
          }
        }
     }
     return getNavToMethod;
  }

  private static volatile io.grpc.MethodDescriptor<navService.Nav.NavStopRequest,
      navService.Nav.NavStopResponse> getNavStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NavStop",
      requestType = navService.Nav.NavStopRequest.class,
      responseType = navService.Nav.NavStopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<navService.Nav.NavStopRequest,
      navService.Nav.NavStopResponse> getNavStopMethod() {
    io.grpc.MethodDescriptor<navService.Nav.NavStopRequest, navService.Nav.NavStopResponse> getNavStopMethod;
    if ((getNavStopMethod = NavControllerGrpc.getNavStopMethod) == null) {
      synchronized (NavControllerGrpc.class) {
        if ((getNavStopMethod = NavControllerGrpc.getNavStopMethod) == null) {
          NavControllerGrpc.getNavStopMethod = getNavStopMethod = 
              io.grpc.MethodDescriptor.<navService.Nav.NavStopRequest, navService.Nav.NavStopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "navService.NavController", "NavStop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.Nav.NavStopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.Nav.NavStopResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NavControllerMethodDescriptorSupplier("NavStop"))
                  .build();
          }
        }
     }
     return getNavStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<navService.Nav.AutoChargeRequest,
      navService.Nav.AutoChargeResponse> getAutoChargeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AutoCharge",
      requestType = navService.Nav.AutoChargeRequest.class,
      responseType = navService.Nav.AutoChargeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<navService.Nav.AutoChargeRequest,
      navService.Nav.AutoChargeResponse> getAutoChargeMethod() {
    io.grpc.MethodDescriptor<navService.Nav.AutoChargeRequest, navService.Nav.AutoChargeResponse> getAutoChargeMethod;
    if ((getAutoChargeMethod = NavControllerGrpc.getAutoChargeMethod) == null) {
      synchronized (NavControllerGrpc.class) {
        if ((getAutoChargeMethod = NavControllerGrpc.getAutoChargeMethod) == null) {
          NavControllerGrpc.getAutoChargeMethod = getAutoChargeMethod = 
              io.grpc.MethodDescriptor.<navService.Nav.AutoChargeRequest, navService.Nav.AutoChargeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "navService.NavController", "AutoCharge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.Nav.AutoChargeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.Nav.AutoChargeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NavControllerMethodDescriptorSupplier("AutoCharge"))
                  .build();
          }
        }
     }
     return getAutoChargeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<navService.Nav.RotateRequest,
      navService.Nav.RotateResponse> getRotateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Rotate",
      requestType = navService.Nav.RotateRequest.class,
      responseType = navService.Nav.RotateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<navService.Nav.RotateRequest,
      navService.Nav.RotateResponse> getRotateMethod() {
    io.grpc.MethodDescriptor<navService.Nav.RotateRequest, navService.Nav.RotateResponse> getRotateMethod;
    if ((getRotateMethod = NavControllerGrpc.getRotateMethod) == null) {
      synchronized (NavControllerGrpc.class) {
        if ((getRotateMethod = NavControllerGrpc.getRotateMethod) == null) {
          NavControllerGrpc.getRotateMethod = getRotateMethod = 
              io.grpc.MethodDescriptor.<navService.Nav.RotateRequest, navService.Nav.RotateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "navService.NavController", "Rotate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.Nav.RotateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.Nav.RotateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NavControllerMethodDescriptorSupplier("Rotate"))
                  .build();
          }
        }
     }
     return getRotateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<navService.Nav.OnNavEventChangeRequest,
      navService.Nav.OnNavEventChangeResponse> getOnNavEventChangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnNavEventChange",
      requestType = navService.Nav.OnNavEventChangeRequest.class,
      responseType = navService.Nav.OnNavEventChangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<navService.Nav.OnNavEventChangeRequest,
      navService.Nav.OnNavEventChangeResponse> getOnNavEventChangeMethod() {
    io.grpc.MethodDescriptor<navService.Nav.OnNavEventChangeRequest, navService.Nav.OnNavEventChangeResponse> getOnNavEventChangeMethod;
    if ((getOnNavEventChangeMethod = NavControllerGrpc.getOnNavEventChangeMethod) == null) {
      synchronized (NavControllerGrpc.class) {
        if ((getOnNavEventChangeMethod = NavControllerGrpc.getOnNavEventChangeMethod) == null) {
          NavControllerGrpc.getOnNavEventChangeMethod = getOnNavEventChangeMethod = 
              io.grpc.MethodDescriptor.<navService.Nav.OnNavEventChangeRequest, navService.Nav.OnNavEventChangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "navService.NavController", "OnNavEventChange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.Nav.OnNavEventChangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.Nav.OnNavEventChangeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NavControllerMethodDescriptorSupplier("OnNavEventChange"))
                  .build();
          }
        }
     }
     return getOnNavEventChangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<navService.Nav.NewRouteRequest,
      navService.Nav.NewRouteResponse> getNewRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewRoute",
      requestType = navService.Nav.NewRouteRequest.class,
      responseType = navService.Nav.NewRouteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<navService.Nav.NewRouteRequest,
      navService.Nav.NewRouteResponse> getNewRouteMethod() {
    io.grpc.MethodDescriptor<navService.Nav.NewRouteRequest, navService.Nav.NewRouteResponse> getNewRouteMethod;
    if ((getNewRouteMethod = NavControllerGrpc.getNewRouteMethod) == null) {
      synchronized (NavControllerGrpc.class) {
        if ((getNewRouteMethod = NavControllerGrpc.getNewRouteMethod) == null) {
          NavControllerGrpc.getNewRouteMethod = getNewRouteMethod = 
              io.grpc.MethodDescriptor.<navService.Nav.NewRouteRequest, navService.Nav.NewRouteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "navService.NavController", "NewRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.Nav.NewRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.Nav.NewRouteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NavControllerMethodDescriptorSupplier("NewRoute"))
                  .build();
          }
        }
     }
     return getNewRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<navService.Nav.ListRoutesRequest,
      navService.Nav.ListRoutesResponse> getListRoutesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRoutes",
      requestType = navService.Nav.ListRoutesRequest.class,
      responseType = navService.Nav.ListRoutesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<navService.Nav.ListRoutesRequest,
      navService.Nav.ListRoutesResponse> getListRoutesMethod() {
    io.grpc.MethodDescriptor<navService.Nav.ListRoutesRequest, navService.Nav.ListRoutesResponse> getListRoutesMethod;
    if ((getListRoutesMethod = NavControllerGrpc.getListRoutesMethod) == null) {
      synchronized (NavControllerGrpc.class) {
        if ((getListRoutesMethod = NavControllerGrpc.getListRoutesMethod) == null) {
          NavControllerGrpc.getListRoutesMethod = getListRoutesMethod = 
              io.grpc.MethodDescriptor.<navService.Nav.ListRoutesRequest, navService.Nav.ListRoutesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "navService.NavController", "ListRoutes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.Nav.ListRoutesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.Nav.ListRoutesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NavControllerMethodDescriptorSupplier("ListRoutes"))
                  .build();
          }
        }
     }
     return getListRoutesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<navService.Nav.UpdateRouteRequest,
      navService.Nav.UpdateRouteResponse> getUpdateRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRoute",
      requestType = navService.Nav.UpdateRouteRequest.class,
      responseType = navService.Nav.UpdateRouteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<navService.Nav.UpdateRouteRequest,
      navService.Nav.UpdateRouteResponse> getUpdateRouteMethod() {
    io.grpc.MethodDescriptor<navService.Nav.UpdateRouteRequest, navService.Nav.UpdateRouteResponse> getUpdateRouteMethod;
    if ((getUpdateRouteMethod = NavControllerGrpc.getUpdateRouteMethod) == null) {
      synchronized (NavControllerGrpc.class) {
        if ((getUpdateRouteMethod = NavControllerGrpc.getUpdateRouteMethod) == null) {
          NavControllerGrpc.getUpdateRouteMethod = getUpdateRouteMethod = 
              io.grpc.MethodDescriptor.<navService.Nav.UpdateRouteRequest, navService.Nav.UpdateRouteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "navService.NavController", "UpdateRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.Nav.UpdateRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.Nav.UpdateRouteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NavControllerMethodDescriptorSupplier("UpdateRoute"))
                  .build();
          }
        }
     }
     return getUpdateRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<navService.Nav.DeleteRoutesRequest,
      navService.Nav.DeleteRoutesResponse> getDeleteRoutesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRoutes",
      requestType = navService.Nav.DeleteRoutesRequest.class,
      responseType = navService.Nav.DeleteRoutesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<navService.Nav.DeleteRoutesRequest,
      navService.Nav.DeleteRoutesResponse> getDeleteRoutesMethod() {
    io.grpc.MethodDescriptor<navService.Nav.DeleteRoutesRequest, navService.Nav.DeleteRoutesResponse> getDeleteRoutesMethod;
    if ((getDeleteRoutesMethod = NavControllerGrpc.getDeleteRoutesMethod) == null) {
      synchronized (NavControllerGrpc.class) {
        if ((getDeleteRoutesMethod = NavControllerGrpc.getDeleteRoutesMethod) == null) {
          NavControllerGrpc.getDeleteRoutesMethod = getDeleteRoutesMethod = 
              io.grpc.MethodDescriptor.<navService.Nav.DeleteRoutesRequest, navService.Nav.DeleteRoutesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "navService.NavController", "DeleteRoutes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.Nav.DeleteRoutesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  navService.Nav.DeleteRoutesResponse.getDefaultInstance()))
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
    return new NavControllerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NavControllerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NavControllerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NavControllerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NavControllerFutureStub(channel);
  }

  /**
   */
  public static abstract class NavControllerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 遥控移动
     * 当机器人处于非空闲及遥控移动状态时， 当前链接将被强制关闭, 错误描述为: "[naving|charging|rotating] reject"
     * 当机器人处于 *其它用户* 的遥控移动状态时， *你* 将收到MoveStatusResponse状态码REJ_MOVING
     * 当机器人处于 *你* 的遥控移动状态时, 请在500ms内持续发送遥控指令， 超时将自动停止移动
     * 当机器人处于 *你* 的遥控移动状态时, 若5秒后无遥控指令的更新, *你* 将接收到MoveStatusResponse状态码RELEASED，
     * 此时遥控移动控制权交由抢占的 *其它用户* 或其它类型目标的操作
     * </pre>
     */
    public io.grpc.stub.StreamObserver<navService.Nav.MoveRequest> move(
        io.grpc.stub.StreamObserver<navService.Nav.MoveResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getMoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * 导航
     * 当机器人处理遥控移动中|充电中|旋转中时, 错误描述为: "[moving|charging|rotating] reject"
     * 当机器人处理空闲或导航状态时, 将收到导航的目标NavTarget与导航或失败状态
     * 使用目标导航时支持同步异步模式, 参考NavToRequest.sync_mode的参数描述
     * </pre>
     */
    public void navTo(navService.Nav.NavToRequest request,
        io.grpc.stub.StreamObserver<navService.Nav.NavToResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNavToMethod(), responseObserver);
    }

    /**
     * <pre>
     * 停止
     * 静止: 立即返回STOPPED
     * 旋转中: 返回旋转状态, STOPPED或CANCEL, 超时3秒
     * 其它: 错误描述为: "[moving|charging] reject"
     * </pre>
     */
    public void navStop(navService.Nav.NavStopRequest request,
        io.grpc.stub.StreamObserver<navService.Nav.NavStopResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNavStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * 自动充电
     * 当前为充电中|充电连接中: 请求类型为charge|charge_preset等待状态为CHARGE_STATUS_CHARGING|CHARGE_STATUS_CONNECTING|CHARGE_STATUS_RELEASED后返回
     * 当前为充电中|充电连接中: 请求类型为cancel等待状态为CHARGE_STATUS_RELEASED后返回
     * 当前为已释放: 请求类型为cancel将直接返回CHARGE_STATUS_RELEASED
     * 当前为已释放: 请求类型为charge|charge_preset等待状态为CHARGE_STATUS_CHARGING后返回
     * 超时错误: 发送请求后默认60秒后未收到状态更新返回错误描述, 超时时间可在AutoChargeRequest中自定义配置
     * </pre>
     */
    public void autoCharge(navService.Nav.AutoChargeRequest request,
        io.grpc.stub.StreamObserver<navService.Nav.AutoChargeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAutoChargeMethod(), responseObserver);
    }

    /**
     * <pre>
     * 原地旋转
     * 当旋转完成后返回STOPPED
     * 当用户使用NavStop中止时将返回CANCEL
     * 若超时30秒未执行完毕将返回超时错误
     * </pre>
     */
    public void rotate(navService.Nav.RotateRequest request,
        io.grpc.stub.StreamObserver<navService.Nav.RotateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRotateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 导航事件监听
     * 监听导航模块中各类事件的变动更新
     * </pre>
     */
    public void onNavEventChange(navService.Nav.OnNavEventChangeRequest request,
        io.grpc.stub.StreamObserver<navService.Nav.OnNavEventChangeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOnNavEventChangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * 新建线路
     * </pre>
     */
    public void newRoute(navService.Nav.NewRouteRequest request,
        io.grpc.stub.StreamObserver<navService.Nav.NewRouteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNewRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取线路
     * </pre>
     */
    public void listRoutes(navService.Nav.ListRoutesRequest request,
        io.grpc.stub.StreamObserver<navService.Nav.ListRoutesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListRoutesMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更新线路信息
     * </pre>
     */
    public void updateRoute(navService.Nav.UpdateRouteRequest request,
        io.grpc.stub.StreamObserver<navService.Nav.UpdateRouteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除线路
     * </pre>
     */
    public void deleteRoutes(navService.Nav.DeleteRoutesRequest request,
        io.grpc.stub.StreamObserver<navService.Nav.DeleteRoutesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteRoutesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMoveMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                navService.Nav.MoveRequest,
                navService.Nav.MoveResponse>(
                  this, METHODID_MOVE)))
          .addMethod(
            getNavToMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                navService.Nav.NavToRequest,
                navService.Nav.NavToResponse>(
                  this, METHODID_NAV_TO)))
          .addMethod(
            getNavStopMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                navService.Nav.NavStopRequest,
                navService.Nav.NavStopResponse>(
                  this, METHODID_NAV_STOP)))
          .addMethod(
            getAutoChargeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                navService.Nav.AutoChargeRequest,
                navService.Nav.AutoChargeResponse>(
                  this, METHODID_AUTO_CHARGE)))
          .addMethod(
            getRotateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                navService.Nav.RotateRequest,
                navService.Nav.RotateResponse>(
                  this, METHODID_ROTATE)))
          .addMethod(
            getOnNavEventChangeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                navService.Nav.OnNavEventChangeRequest,
                navService.Nav.OnNavEventChangeResponse>(
                  this, METHODID_ON_NAV_EVENT_CHANGE)))
          .addMethod(
            getNewRouteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                navService.Nav.NewRouteRequest,
                navService.Nav.NewRouteResponse>(
                  this, METHODID_NEW_ROUTE)))
          .addMethod(
            getListRoutesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                navService.Nav.ListRoutesRequest,
                navService.Nav.ListRoutesResponse>(
                  this, METHODID_LIST_ROUTES)))
          .addMethod(
            getUpdateRouteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                navService.Nav.UpdateRouteRequest,
                navService.Nav.UpdateRouteResponse>(
                  this, METHODID_UPDATE_ROUTE)))
          .addMethod(
            getDeleteRoutesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                navService.Nav.DeleteRoutesRequest,
                navService.Nav.DeleteRoutesResponse>(
                  this, METHODID_DELETE_ROUTES)))
          .build();
    }
  }

  /**
   */
  public static final class NavControllerStub extends io.grpc.stub.AbstractStub<NavControllerStub> {
    private NavControllerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NavControllerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NavControllerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NavControllerStub(channel, callOptions);
    }

    /**
     * <pre>
     * 遥控移动
     * 当机器人处于非空闲及遥控移动状态时， 当前链接将被强制关闭, 错误描述为: "[naving|charging|rotating] reject"
     * 当机器人处于 *其它用户* 的遥控移动状态时， *你* 将收到MoveStatusResponse状态码REJ_MOVING
     * 当机器人处于 *你* 的遥控移动状态时, 请在500ms内持续发送遥控指令， 超时将自动停止移动
     * 当机器人处于 *你* 的遥控移动状态时, 若5秒后无遥控指令的更新, *你* 将接收到MoveStatusResponse状态码RELEASED，
     * 此时遥控移动控制权交由抢占的 *其它用户* 或其它类型目标的操作
     * </pre>
     */
    public io.grpc.stub.StreamObserver<navService.Nav.MoveRequest> move(
        io.grpc.stub.StreamObserver<navService.Nav.MoveResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * 导航
     * 当机器人处理遥控移动中|充电中|旋转中时, 错误描述为: "[moving|charging|rotating] reject"
     * 当机器人处理空闲或导航状态时, 将收到导航的目标NavTarget与导航或失败状态
     * 使用目标导航时支持同步异步模式, 参考NavToRequest.sync_mode的参数描述
     * </pre>
     */
    public void navTo(navService.Nav.NavToRequest request,
        io.grpc.stub.StreamObserver<navService.Nav.NavToResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNavToMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 停止
     * 静止: 立即返回STOPPED
     * 旋转中: 返回旋转状态, STOPPED或CANCEL, 超时3秒
     * 其它: 错误描述为: "[moving|charging] reject"
     * </pre>
     */
    public void navStop(navService.Nav.NavStopRequest request,
        io.grpc.stub.StreamObserver<navService.Nav.NavStopResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNavStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 自动充电
     * 当前为充电中|充电连接中: 请求类型为charge|charge_preset等待状态为CHARGE_STATUS_CHARGING|CHARGE_STATUS_CONNECTING|CHARGE_STATUS_RELEASED后返回
     * 当前为充电中|充电连接中: 请求类型为cancel等待状态为CHARGE_STATUS_RELEASED后返回
     * 当前为已释放: 请求类型为cancel将直接返回CHARGE_STATUS_RELEASED
     * 当前为已释放: 请求类型为charge|charge_preset等待状态为CHARGE_STATUS_CHARGING后返回
     * 超时错误: 发送请求后默认60秒后未收到状态更新返回错误描述, 超时时间可在AutoChargeRequest中自定义配置
     * </pre>
     */
    public void autoCharge(navService.Nav.AutoChargeRequest request,
        io.grpc.stub.StreamObserver<navService.Nav.AutoChargeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAutoChargeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 原地旋转
     * 当旋转完成后返回STOPPED
     * 当用户使用NavStop中止时将返回CANCEL
     * 若超时30秒未执行完毕将返回超时错误
     * </pre>
     */
    public void rotate(navService.Nav.RotateRequest request,
        io.grpc.stub.StreamObserver<navService.Nav.RotateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRotateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 导航事件监听
     * 监听导航模块中各类事件的变动更新
     * </pre>
     */
    public void onNavEventChange(navService.Nav.OnNavEventChangeRequest request,
        io.grpc.stub.StreamObserver<navService.Nav.OnNavEventChangeResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getOnNavEventChangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 新建线路
     * </pre>
     */
    public void newRoute(navService.Nav.NewRouteRequest request,
        io.grpc.stub.StreamObserver<navService.Nav.NewRouteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNewRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取线路
     * </pre>
     */
    public void listRoutes(navService.Nav.ListRoutesRequest request,
        io.grpc.stub.StreamObserver<navService.Nav.ListRoutesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListRoutesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新线路信息
     * </pre>
     */
    public void updateRoute(navService.Nav.UpdateRouteRequest request,
        io.grpc.stub.StreamObserver<navService.Nav.UpdateRouteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除线路
     * </pre>
     */
    public void deleteRoutes(navService.Nav.DeleteRoutesRequest request,
        io.grpc.stub.StreamObserver<navService.Nav.DeleteRoutesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteRoutesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NavControllerBlockingStub extends io.grpc.stub.AbstractStub<NavControllerBlockingStub> {
    private NavControllerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NavControllerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NavControllerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NavControllerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 导航
     * 当机器人处理遥控移动中|充电中|旋转中时, 错误描述为: "[moving|charging|rotating] reject"
     * 当机器人处理空闲或导航状态时, 将收到导航的目标NavTarget与导航或失败状态
     * 使用目标导航时支持同步异步模式, 参考NavToRequest.sync_mode的参数描述
     * </pre>
     */
    public navService.Nav.NavToResponse navTo(navService.Nav.NavToRequest request) {
      return blockingUnaryCall(
          getChannel(), getNavToMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 停止
     * 静止: 立即返回STOPPED
     * 旋转中: 返回旋转状态, STOPPED或CANCEL, 超时3秒
     * 其它: 错误描述为: "[moving|charging] reject"
     * </pre>
     */
    public navService.Nav.NavStopResponse navStop(navService.Nav.NavStopRequest request) {
      return blockingUnaryCall(
          getChannel(), getNavStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 自动充电
     * 当前为充电中|充电连接中: 请求类型为charge|charge_preset等待状态为CHARGE_STATUS_CHARGING|CHARGE_STATUS_CONNECTING|CHARGE_STATUS_RELEASED后返回
     * 当前为充电中|充电连接中: 请求类型为cancel等待状态为CHARGE_STATUS_RELEASED后返回
     * 当前为已释放: 请求类型为cancel将直接返回CHARGE_STATUS_RELEASED
     * 当前为已释放: 请求类型为charge|charge_preset等待状态为CHARGE_STATUS_CHARGING后返回
     * 超时错误: 发送请求后默认60秒后未收到状态更新返回错误描述, 超时时间可在AutoChargeRequest中自定义配置
     * </pre>
     */
    public navService.Nav.AutoChargeResponse autoCharge(navService.Nav.AutoChargeRequest request) {
      return blockingUnaryCall(
          getChannel(), getAutoChargeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 原地旋转
     * 当旋转完成后返回STOPPED
     * 当用户使用NavStop中止时将返回CANCEL
     * 若超时30秒未执行完毕将返回超时错误
     * </pre>
     */
    public navService.Nav.RotateResponse rotate(navService.Nav.RotateRequest request) {
      return blockingUnaryCall(
          getChannel(), getRotateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 导航事件监听
     * 监听导航模块中各类事件的变动更新
     * </pre>
     */
    public java.util.Iterator<navService.Nav.OnNavEventChangeResponse> onNavEventChange(
        navService.Nav.OnNavEventChangeRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getOnNavEventChangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 新建线路
     * </pre>
     */
    public navService.Nav.NewRouteResponse newRoute(navService.Nav.NewRouteRequest request) {
      return blockingUnaryCall(
          getChannel(), getNewRouteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取线路
     * </pre>
     */
    public navService.Nav.ListRoutesResponse listRoutes(navService.Nav.ListRoutesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListRoutesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新线路信息
     * </pre>
     */
    public navService.Nav.UpdateRouteResponse updateRoute(navService.Nav.UpdateRouteRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateRouteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除线路
     * </pre>
     */
    public navService.Nav.DeleteRoutesResponse deleteRoutes(navService.Nav.DeleteRoutesRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteRoutesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NavControllerFutureStub extends io.grpc.stub.AbstractStub<NavControllerFutureStub> {
    private NavControllerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NavControllerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NavControllerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NavControllerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 导航
     * 当机器人处理遥控移动中|充电中|旋转中时, 错误描述为: "[moving|charging|rotating] reject"
     * 当机器人处理空闲或导航状态时, 将收到导航的目标NavTarget与导航或失败状态
     * 使用目标导航时支持同步异步模式, 参考NavToRequest.sync_mode的参数描述
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<navService.Nav.NavToResponse> navTo(
        navService.Nav.NavToRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNavToMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 停止
     * 静止: 立即返回STOPPED
     * 旋转中: 返回旋转状态, STOPPED或CANCEL, 超时3秒
     * 其它: 错误描述为: "[moving|charging] reject"
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<navService.Nav.NavStopResponse> navStop(
        navService.Nav.NavStopRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNavStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 自动充电
     * 当前为充电中|充电连接中: 请求类型为charge|charge_preset等待状态为CHARGE_STATUS_CHARGING|CHARGE_STATUS_CONNECTING|CHARGE_STATUS_RELEASED后返回
     * 当前为充电中|充电连接中: 请求类型为cancel等待状态为CHARGE_STATUS_RELEASED后返回
     * 当前为已释放: 请求类型为cancel将直接返回CHARGE_STATUS_RELEASED
     * 当前为已释放: 请求类型为charge|charge_preset等待状态为CHARGE_STATUS_CHARGING后返回
     * 超时错误: 发送请求后默认60秒后未收到状态更新返回错误描述, 超时时间可在AutoChargeRequest中自定义配置
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<navService.Nav.AutoChargeResponse> autoCharge(
        navService.Nav.AutoChargeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAutoChargeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 原地旋转
     * 当旋转完成后返回STOPPED
     * 当用户使用NavStop中止时将返回CANCEL
     * 若超时30秒未执行完毕将返回超时错误
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<navService.Nav.RotateResponse> rotate(
        navService.Nav.RotateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRotateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 新建线路
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<navService.Nav.NewRouteResponse> newRoute(
        navService.Nav.NewRouteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNewRouteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取线路
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<navService.Nav.ListRoutesResponse> listRoutes(
        navService.Nav.ListRoutesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListRoutesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新线路信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<navService.Nav.UpdateRouteResponse> updateRoute(
        navService.Nav.UpdateRouteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateRouteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除线路
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<navService.Nav.DeleteRoutesResponse> deleteRoutes(
        navService.Nav.DeleteRoutesRequest request) {
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
          serviceImpl.navTo((navService.Nav.NavToRequest) request,
              (io.grpc.stub.StreamObserver<navService.Nav.NavToResponse>) responseObserver);
          break;
        case METHODID_NAV_STOP:
          serviceImpl.navStop((navService.Nav.NavStopRequest) request,
              (io.grpc.stub.StreamObserver<navService.Nav.NavStopResponse>) responseObserver);
          break;
        case METHODID_AUTO_CHARGE:
          serviceImpl.autoCharge((navService.Nav.AutoChargeRequest) request,
              (io.grpc.stub.StreamObserver<navService.Nav.AutoChargeResponse>) responseObserver);
          break;
        case METHODID_ROTATE:
          serviceImpl.rotate((navService.Nav.RotateRequest) request,
              (io.grpc.stub.StreamObserver<navService.Nav.RotateResponse>) responseObserver);
          break;
        case METHODID_ON_NAV_EVENT_CHANGE:
          serviceImpl.onNavEventChange((navService.Nav.OnNavEventChangeRequest) request,
              (io.grpc.stub.StreamObserver<navService.Nav.OnNavEventChangeResponse>) responseObserver);
          break;
        case METHODID_NEW_ROUTE:
          serviceImpl.newRoute((navService.Nav.NewRouteRequest) request,
              (io.grpc.stub.StreamObserver<navService.Nav.NewRouteResponse>) responseObserver);
          break;
        case METHODID_LIST_ROUTES:
          serviceImpl.listRoutes((navService.Nav.ListRoutesRequest) request,
              (io.grpc.stub.StreamObserver<navService.Nav.ListRoutesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ROUTE:
          serviceImpl.updateRoute((navService.Nav.UpdateRouteRequest) request,
              (io.grpc.stub.StreamObserver<navService.Nav.UpdateRouteResponse>) responseObserver);
          break;
        case METHODID_DELETE_ROUTES:
          serviceImpl.deleteRoutes((navService.Nav.DeleteRoutesRequest) request,
              (io.grpc.stub.StreamObserver<navService.Nav.DeleteRoutesResponse>) responseObserver);
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
              (io.grpc.stub.StreamObserver<navService.Nav.MoveResponse>) responseObserver);
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
      return navService.Nav.getDescriptor();
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
