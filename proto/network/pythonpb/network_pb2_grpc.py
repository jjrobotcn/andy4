# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

import network_pb2 as network__pb2


class NetworkServiceStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.ListNetworks = channel.unary_stream(
        '/networkService.NetworkService/ListNetworks',
        request_serializer=network__pb2.ListNetworksRequest.SerializeToString,
        response_deserializer=network__pb2.ListNetworksResponse.FromString,
        )
    self.Connect = channel.unary_unary(
        '/networkService.NetworkService/Connect',
        request_serializer=network__pb2.ConnectRequest.SerializeToString,
        response_deserializer=network__pb2.ConnectResponse.FromString,
        )
    self.GetStatus = channel.unary_stream(
        '/networkService.NetworkService/GetStatus',
        request_serializer=network__pb2.GetStatusRequest.SerializeToString,
        response_deserializer=network__pb2.GetStatusResponse.FromString,
        )
    self.GetNetworkDeviceInfo = channel.unary_unary(
        '/networkService.NetworkService/GetNetworkDeviceInfo',
        request_serializer=network__pb2.GetNetworkDeviceInfoRequest.SerializeToString,
        response_deserializer=network__pb2.GetNetworkDeviceInfoResponse.FromString,
        )
    self.UpdateNetworkDeviceInfo = channel.unary_unary(
        '/networkService.NetworkService/UpdateNetworkDeviceInfo',
        request_serializer=network__pb2.UpdateNetworkDeviceInfoRequest.SerializeToString,
        response_deserializer=network__pb2.UpdateNetworkDeviceInfoResponse.FromString,
        )


class NetworkServiceServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def ListNetworks(self, request, context):
    """获取网络扫描结果流
    扫描结果每30秒自动更新, 首次获取将返回记录中最新记录
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Connect(self, request, context):
    """连接至指定网络
    连接失败将立即返回错误
    若30秒后成功获取状态将返回超时失败
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetStatus(self, request, context):
    """获取连接状态流
    在连接开始时立即返回当前最新的扫描数据
    并持续在网络数据更新时接收新数据
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetNetworkDeviceInfo(self, request, context):
    """获取网络设备相关信息
    v1.1.0
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def UpdateNetworkDeviceInfo(self, request, context):
    """修改网络设备相关信息
    v1.1.0
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_NetworkServiceServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'ListNetworks': grpc.unary_stream_rpc_method_handler(
          servicer.ListNetworks,
          request_deserializer=network__pb2.ListNetworksRequest.FromString,
          response_serializer=network__pb2.ListNetworksResponse.SerializeToString,
      ),
      'Connect': grpc.unary_unary_rpc_method_handler(
          servicer.Connect,
          request_deserializer=network__pb2.ConnectRequest.FromString,
          response_serializer=network__pb2.ConnectResponse.SerializeToString,
      ),
      'GetStatus': grpc.unary_stream_rpc_method_handler(
          servicer.GetStatus,
          request_deserializer=network__pb2.GetStatusRequest.FromString,
          response_serializer=network__pb2.GetStatusResponse.SerializeToString,
      ),
      'GetNetworkDeviceInfo': grpc.unary_unary_rpc_method_handler(
          servicer.GetNetworkDeviceInfo,
          request_deserializer=network__pb2.GetNetworkDeviceInfoRequest.FromString,
          response_serializer=network__pb2.GetNetworkDeviceInfoResponse.SerializeToString,
      ),
      'UpdateNetworkDeviceInfo': grpc.unary_unary_rpc_method_handler(
          servicer.UpdateNetworkDeviceInfo,
          request_deserializer=network__pb2.UpdateNetworkDeviceInfoRequest.FromString,
          response_serializer=network__pb2.UpdateNetworkDeviceInfoResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'networkService.NetworkService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
