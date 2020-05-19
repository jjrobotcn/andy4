# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

import sensor_pb2 as sensor__pb2


class SensorServiceStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.GetDetect = channel.unary_stream(
        '/sensorService.SensorService/GetDetect',
        request_serializer=sensor__pb2.GetDetectRequest.SerializeToString,
        response_deserializer=sensor__pb2.GetDetectResponse.FromString,
        )
    self.GetMotionInduction = channel.unary_stream(
        '/sensorService.SensorService/GetMotionInduction',
        request_serializer=sensor__pb2.GetMotionInductionRequest.SerializeToString,
        response_deserializer=sensor__pb2.GetMotionInductionResponse.FromString,
        )
    self.GetTouch = channel.unary_stream(
        '/sensorService.SensorService/GetTouch',
        request_serializer=sensor__pb2.GetTouchRequest.SerializeToString,
        response_deserializer=sensor__pb2.GetTouchResponse.FromString,
        )
    self.Raw = channel.unary_stream(
        '/sensorService.SensorService/Raw',
        request_serializer=sensor__pb2.RawRequest.SerializeToString,
        response_deserializer=sensor__pb2.RawResponse.FromString,
        )


class SensorServiceServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def GetDetect(self, request, context):
    """获取感应数据流
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetMotionInduction(self, request, context):
    """获取动态感应数据
    场景示例： 迎宾感应
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetTouch(self, request, context):
    """获取触摸数据流
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Raw(self, request, context):
    """获取传感器原始数据调试接口
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_SensorServiceServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'GetDetect': grpc.unary_stream_rpc_method_handler(
          servicer.GetDetect,
          request_deserializer=sensor__pb2.GetDetectRequest.FromString,
          response_serializer=sensor__pb2.GetDetectResponse.SerializeToString,
      ),
      'GetMotionInduction': grpc.unary_stream_rpc_method_handler(
          servicer.GetMotionInduction,
          request_deserializer=sensor__pb2.GetMotionInductionRequest.FromString,
          response_serializer=sensor__pb2.GetMotionInductionResponse.SerializeToString,
      ),
      'GetTouch': grpc.unary_stream_rpc_method_handler(
          servicer.GetTouch,
          request_deserializer=sensor__pb2.GetTouchRequest.FromString,
          response_serializer=sensor__pb2.GetTouchResponse.SerializeToString,
      ),
      'Raw': grpc.unary_stream_rpc_method_handler(
          servicer.Raw,
          request_deserializer=sensor__pb2.RawRequest.FromString,
          response_serializer=sensor__pb2.RawResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'sensorService.SensorService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))