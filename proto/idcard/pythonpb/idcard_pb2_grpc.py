# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

import idcard_pb2 as idcard__pb2


class IDCardServiceStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.GetIdInfo = channel.unary_stream(
        '/idCardService.IDCardService/GetIdInfo',
        request_serializer=idcard__pb2.GetIdInfoRequest.SerializeToString,
        response_deserializer=idcard__pb2.GetIdInfoResponse.FromString,
        )


class IDCardServiceServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def GetIdInfo(self, request, context):
    """获取读卡数据流
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_IDCardServiceServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'GetIdInfo': grpc.unary_stream_rpc_method_handler(
          servicer.GetIdInfo,
          request_deserializer=idcard__pb2.GetIdInfoRequest.FromString,
          response_serializer=idcard__pb2.GetIdInfoResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'idCardService.IDCardService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))