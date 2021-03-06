# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

from . import sensor_pb2 as sensor__pb2


class SensorServiceStub(object):
    """sensorService.SensorService 传感器服务

    开发管理平台功能参考: http://10.10.10.2/detect
    """

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
    """sensorService.SensorService 传感器服务

    开发管理平台功能参考: http://10.10.10.2/detect
    """

    def GetDetect(self, request, context):
        """GetDetect 计算前方障碍的距离与方法

        此计算方法受GetMotionInduction数据影响
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetMotionInduction(self, request, context):
        """GetMotionInduction 获取动态感应数据
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetTouch(self, request, context):
        """GetTouch 获取触摸感应数据

        目前支持头部与手部的触摸
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Raw(self, request, context):
        """Raw 内部传感器数据

        此方法为底层数据方法，用于上层的计算与调试，通常开发用户不应使用此方法
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


 # This class is part of an EXPERIMENTAL API.
class SensorService(object):
    """sensorService.SensorService 传感器服务

    开发管理平台功能参考: http://10.10.10.2/detect
    """

    @staticmethod
    def GetDetect(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_stream(request, target, '/sensorService.SensorService/GetDetect',
            sensor__pb2.GetDetectRequest.SerializeToString,
            sensor__pb2.GetDetectResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetMotionInduction(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_stream(request, target, '/sensorService.SensorService/GetMotionInduction',
            sensor__pb2.GetMotionInductionRequest.SerializeToString,
            sensor__pb2.GetMotionInductionResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetTouch(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_stream(request, target, '/sensorService.SensorService/GetTouch',
            sensor__pb2.GetTouchRequest.SerializeToString,
            sensor__pb2.GetTouchResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Raw(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_stream(request, target, '/sensorService.SensorService/Raw',
            sensor__pb2.RawRequest.SerializeToString,
            sensor__pb2.RawResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)
