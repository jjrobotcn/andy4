# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

import nav_pb2 as nav__pb2


class NavControllerStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.Move = channel.stream_stream(
        '/navService.NavController/Move',
        request_serializer=nav__pb2.MoveRequest.SerializeToString,
        response_deserializer=nav__pb2.MoveResponse.FromString,
        )
    self.NavTo = channel.unary_unary(
        '/navService.NavController/NavTo',
        request_serializer=nav__pb2.NavToRequest.SerializeToString,
        response_deserializer=nav__pb2.NavToResponse.FromString,
        )
    self.NavStop = channel.unary_unary(
        '/navService.NavController/NavStop',
        request_serializer=nav__pb2.NavStopRequest.SerializeToString,
        response_deserializer=nav__pb2.NavStopResponse.FromString,
        )
    self.AutoCharge = channel.unary_unary(
        '/navService.NavController/AutoCharge',
        request_serializer=nav__pb2.AutoChargeRequest.SerializeToString,
        response_deserializer=nav__pb2.AutoChargeResponse.FromString,
        )
    self.Rotate = channel.unary_unary(
        '/navService.NavController/Rotate',
        request_serializer=nav__pb2.RotateRequest.SerializeToString,
        response_deserializer=nav__pb2.RotateResponse.FromString,
        )
    self.OnNavEventChange = channel.unary_stream(
        '/navService.NavController/OnNavEventChange',
        request_serializer=nav__pb2.OnNavEventChangeRequest.SerializeToString,
        response_deserializer=nav__pb2.OnNavEventChangeResponse.FromString,
        )
    self.LocationReset = channel.unary_unary(
        '/navService.NavController/LocationReset',
        request_serializer=nav__pb2.LocationResetRequest.SerializeToString,
        response_deserializer=nav__pb2.LocationResetResponse.FromString,
        )
    self.NewRoute = channel.unary_unary(
        '/navService.NavController/NewRoute',
        request_serializer=nav__pb2.NewRouteRequest.SerializeToString,
        response_deserializer=nav__pb2.NewRouteResponse.FromString,
        )
    self.ListRoutes = channel.unary_unary(
        '/navService.NavController/ListRoutes',
        request_serializer=nav__pb2.ListRoutesRequest.SerializeToString,
        response_deserializer=nav__pb2.ListRoutesResponse.FromString,
        )
    self.UpdateRoute = channel.unary_unary(
        '/navService.NavController/UpdateRoute',
        request_serializer=nav__pb2.UpdateRouteRequest.SerializeToString,
        response_deserializer=nav__pb2.UpdateRouteResponse.FromString,
        )
    self.DeleteRoutes = channel.unary_unary(
        '/navService.NavController/DeleteRoutes',
        request_serializer=nav__pb2.DeleteRoutesRequest.SerializeToString,
        response_deserializer=nav__pb2.DeleteRoutesResponse.FromString,
        )


class NavControllerServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def Move(self, request_iterator, context):
    """遥控移动
    当机器人处于非空闲及遥控移动状态时， 当前链接将被强制关闭, 错误描述为: "[naving|charging|rotating] reject"
    当机器人处于 *其它用户* 的遥控移动状态时， *你* 将收到MoveStatusResponse状态码REJ_MOVING
    当机器人处于 *你* 的遥控移动状态时, 请在500ms内持续发送遥控指令， 超时将自动停止移动
    当机器人处于 *你* 的遥控移动状态时, 若5秒后无遥控指令的更新, *你* 将接收到MoveStatusResponse状态码RELEASED，
    此时遥控移动控制权交由抢占的 *其它用户* 或其它类型目标的操作
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def NavTo(self, request, context):
    """导航
    当机器人处理遥控移动中|充电中|旋转中时, 错误描述为: "[moving|charging|rotating] reject"
    当机器人处理空闲或导航状态时, 将收到导航的目标NavTarget与导航或失败状态
    使用目标导航时支持同步异步模式, 参考NavToRequest.sync_mode的参数描述
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def NavStop(self, request, context):
    """停止
    静止: 立即返回STOPPED
    旋转中: 返回旋转状态, STOPPED或CANCEL, 超时3秒
    其它: 错误描述为: "[moving|charging] reject"
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def AutoCharge(self, request, context):
    """自动充电
    当前为充电中|充电连接中: 请求类型为charge|charge_preset等待状态为CHARGE_STATUS_CHARGING|CHARGE_STATUS_CONNECTING|CHARGE_STATUS_RELEASED后返回
    当前为充电中|充电连接中: 请求类型为cancel等待状态为CHARGE_STATUS_RELEASED后返回
    当前为已释放: 请求类型为cancel将直接返回CHARGE_STATUS_RELEASED
    当前为已释放: 请求类型为charge|charge_preset等待状态为CHARGE_STATUS_CHARGING后返回
    超时错误: 发送请求后默认60秒后未收到状态更新返回错误描述, 超时时间可在AutoChargeRequest中自定义配置
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Rotate(self, request, context):
    """原地旋转
    当旋转完成后返回STOPPED
    当用户使用NavStop中止时将返回CANCEL
    若超时30秒未执行完毕将返回超时错误
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def OnNavEventChange(self, request, context):
    """导航事件监听
    监听导航模块中各类事件的变动更新
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def LocationReset(self, request, context):
    """>=2.2.0
    重置当前定位
    用于发生定位异常/错误状态，重新初始化导航定位
    重定位错误：定位状态超时|无地图|UWB错误
    重定位超时判断: 默认3s，仅在非错误状态下重置
    *目前仅支持无线导航版本，磁导航版本中将直接返回成功状态
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def NewRoute(self, request, context):
    """新建线路
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def ListRoutes(self, request, context):
    """获取线路
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def UpdateRoute(self, request, context):
    """更新线路信息
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def DeleteRoutes(self, request, context):
    """删除线路
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_NavControllerServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'Move': grpc.stream_stream_rpc_method_handler(
          servicer.Move,
          request_deserializer=nav__pb2.MoveRequest.FromString,
          response_serializer=nav__pb2.MoveResponse.SerializeToString,
      ),
      'NavTo': grpc.unary_unary_rpc_method_handler(
          servicer.NavTo,
          request_deserializer=nav__pb2.NavToRequest.FromString,
          response_serializer=nav__pb2.NavToResponse.SerializeToString,
      ),
      'NavStop': grpc.unary_unary_rpc_method_handler(
          servicer.NavStop,
          request_deserializer=nav__pb2.NavStopRequest.FromString,
          response_serializer=nav__pb2.NavStopResponse.SerializeToString,
      ),
      'AutoCharge': grpc.unary_unary_rpc_method_handler(
          servicer.AutoCharge,
          request_deserializer=nav__pb2.AutoChargeRequest.FromString,
          response_serializer=nav__pb2.AutoChargeResponse.SerializeToString,
      ),
      'Rotate': grpc.unary_unary_rpc_method_handler(
          servicer.Rotate,
          request_deserializer=nav__pb2.RotateRequest.FromString,
          response_serializer=nav__pb2.RotateResponse.SerializeToString,
      ),
      'OnNavEventChange': grpc.unary_stream_rpc_method_handler(
          servicer.OnNavEventChange,
          request_deserializer=nav__pb2.OnNavEventChangeRequest.FromString,
          response_serializer=nav__pb2.OnNavEventChangeResponse.SerializeToString,
      ),
      'LocationReset': grpc.unary_unary_rpc_method_handler(
          servicer.LocationReset,
          request_deserializer=nav__pb2.LocationResetRequest.FromString,
          response_serializer=nav__pb2.LocationResetResponse.SerializeToString,
      ),
      'NewRoute': grpc.unary_unary_rpc_method_handler(
          servicer.NewRoute,
          request_deserializer=nav__pb2.NewRouteRequest.FromString,
          response_serializer=nav__pb2.NewRouteResponse.SerializeToString,
      ),
      'ListRoutes': grpc.unary_unary_rpc_method_handler(
          servicer.ListRoutes,
          request_deserializer=nav__pb2.ListRoutesRequest.FromString,
          response_serializer=nav__pb2.ListRoutesResponse.SerializeToString,
      ),
      'UpdateRoute': grpc.unary_unary_rpc_method_handler(
          servicer.UpdateRoute,
          request_deserializer=nav__pb2.UpdateRouteRequest.FromString,
          response_serializer=nav__pb2.UpdateRouteResponse.SerializeToString,
      ),
      'DeleteRoutes': grpc.unary_unary_rpc_method_handler(
          servicer.DeleteRoutes,
          request_deserializer=nav__pb2.DeleteRoutesRequest.FromString,
          response_serializer=nav__pb2.DeleteRoutesResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'navService.NavController', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
