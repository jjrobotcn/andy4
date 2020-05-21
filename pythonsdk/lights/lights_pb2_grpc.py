# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

from . import lights_pb2 as lights__pb2


class LightsServiceStub(object):
    """lightsService.LightsService 灯光管理

    开发管理平台功能参考: http://10.10.10.2/lights/
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.PreviewLight = channel.unary_unary(
                '/lightsService.LightsService/PreviewLight',
                request_serializer=lights__pb2.PreviewLightRequest.SerializeToString,
                response_deserializer=lights__pb2.PreviewLightResponse.FromString,
                )
        self.PlayLight = channel.unary_unary(
                '/lightsService.LightsService/PlayLight',
                request_serializer=lights__pb2.PlayLightRequest.SerializeToString,
                response_deserializer=lights__pb2.PlayLightResponse.FromString,
                )
        self.StopLight = channel.unary_unary(
                '/lightsService.LightsService/StopLight',
                request_serializer=lights__pb2.StopLightRequest.SerializeToString,
                response_deserializer=lights__pb2.StopLightResponse.FromString,
                )
        self.ListLights = channel.unary_unary(
                '/lightsService.LightsService/ListLights',
                request_serializer=lights__pb2.ListLightsRequest.SerializeToString,
                response_deserializer=lights__pb2.ListLightsResponse.FromString,
                )
        self.NewLight = channel.unary_unary(
                '/lightsService.LightsService/NewLight',
                request_serializer=lights__pb2.NewLightRequest.SerializeToString,
                response_deserializer=lights__pb2.NewLightResponse.FromString,
                )
        self.UpdateLight = channel.unary_unary(
                '/lightsService.LightsService/UpdateLight',
                request_serializer=lights__pb2.UpdateLightRequest.SerializeToString,
                response_deserializer=lights__pb2.UpdateLightResponse.FromString,
                )
        self.DeleteLights = channel.unary_unary(
                '/lightsService.LightsService/DeleteLights',
                request_serializer=lights__pb2.DeleteLightsRequest.SerializeToString,
                response_deserializer=lights__pb2.DeleteLightsResponse.FromString,
                )
        self.State = channel.unary_unary(
                '/lightsService.LightsService/State',
                request_serializer=lights__pb2.StateRequest.SerializeToString,
                response_deserializer=lights__pb2.StateResponse.FromString,
                )
        self.Switch = channel.unary_unary(
                '/lightsService.LightsService/Switch',
                request_serializer=lights__pb2.SwitchRequest.SerializeToString,
                response_deserializer=lights__pb2.SwitchResponse.FromString,
                )


class LightsServiceServicer(object):
    """lightsService.LightsService 灯光管理

    开发管理平台功能参考: http://10.10.10.2/lights/
    """

    def PreviewLight(self, request, context):
        """PreviewLight 灯光预览

        灯光预览方法将根据配置的灯光数据生成目标数据写入硬件，
        修改灯光数据后请使用此方法进行预览并更新，
        否则PlayLight方法将继续使用之前的旧数据进行播放
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def PlayLight(self, request, context):
        """PlayLight 灯光播放

        播放前请通过PreviewLight生成或更新数据实例
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def StopLight(self, request, context):
        """StopLight 灯光停止
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ListLights(self, request, context):
        """ListLights 获取灯光列表
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def NewLight(self, request, context):
        """NewLight 创建灯光
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateLight(self, request, context):
        """UpdateLight 更新灯光
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteLights(self, request, context):
        """DeleteLights 删除灯光列表
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def State(self, request, context):
        """State 获取当前灯光模块状态
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Switch(self, request, context):
        """Switch 控制灯光的开关
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_LightsServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'PreviewLight': grpc.unary_unary_rpc_method_handler(
                    servicer.PreviewLight,
                    request_deserializer=lights__pb2.PreviewLightRequest.FromString,
                    response_serializer=lights__pb2.PreviewLightResponse.SerializeToString,
            ),
            'PlayLight': grpc.unary_unary_rpc_method_handler(
                    servicer.PlayLight,
                    request_deserializer=lights__pb2.PlayLightRequest.FromString,
                    response_serializer=lights__pb2.PlayLightResponse.SerializeToString,
            ),
            'StopLight': grpc.unary_unary_rpc_method_handler(
                    servicer.StopLight,
                    request_deserializer=lights__pb2.StopLightRequest.FromString,
                    response_serializer=lights__pb2.StopLightResponse.SerializeToString,
            ),
            'ListLights': grpc.unary_unary_rpc_method_handler(
                    servicer.ListLights,
                    request_deserializer=lights__pb2.ListLightsRequest.FromString,
                    response_serializer=lights__pb2.ListLightsResponse.SerializeToString,
            ),
            'NewLight': grpc.unary_unary_rpc_method_handler(
                    servicer.NewLight,
                    request_deserializer=lights__pb2.NewLightRequest.FromString,
                    response_serializer=lights__pb2.NewLightResponse.SerializeToString,
            ),
            'UpdateLight': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateLight,
                    request_deserializer=lights__pb2.UpdateLightRequest.FromString,
                    response_serializer=lights__pb2.UpdateLightResponse.SerializeToString,
            ),
            'DeleteLights': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteLights,
                    request_deserializer=lights__pb2.DeleteLightsRequest.FromString,
                    response_serializer=lights__pb2.DeleteLightsResponse.SerializeToString,
            ),
            'State': grpc.unary_unary_rpc_method_handler(
                    servicer.State,
                    request_deserializer=lights__pb2.StateRequest.FromString,
                    response_serializer=lights__pb2.StateResponse.SerializeToString,
            ),
            'Switch': grpc.unary_unary_rpc_method_handler(
                    servicer.Switch,
                    request_deserializer=lights__pb2.SwitchRequest.FromString,
                    response_serializer=lights__pb2.SwitchResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'lightsService.LightsService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class LightsService(object):
    """lightsService.LightsService 灯光管理

    开发管理平台功能参考: http://10.10.10.2/lights/
    """

    @staticmethod
    def PreviewLight(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/lightsService.LightsService/PreviewLight',
            lights__pb2.PreviewLightRequest.SerializeToString,
            lights__pb2.PreviewLightResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def PlayLight(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/lightsService.LightsService/PlayLight',
            lights__pb2.PlayLightRequest.SerializeToString,
            lights__pb2.PlayLightResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def StopLight(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/lightsService.LightsService/StopLight',
            lights__pb2.StopLightRequest.SerializeToString,
            lights__pb2.StopLightResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ListLights(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/lightsService.LightsService/ListLights',
            lights__pb2.ListLightsRequest.SerializeToString,
            lights__pb2.ListLightsResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def NewLight(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/lightsService.LightsService/NewLight',
            lights__pb2.NewLightRequest.SerializeToString,
            lights__pb2.NewLightResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateLight(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/lightsService.LightsService/UpdateLight',
            lights__pb2.UpdateLightRequest.SerializeToString,
            lights__pb2.UpdateLightResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteLights(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/lightsService.LightsService/DeleteLights',
            lights__pb2.DeleteLightsRequest.SerializeToString,
            lights__pb2.DeleteLightsResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def State(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/lightsService.LightsService/State',
            lights__pb2.StateRequest.SerializeToString,
            lights__pb2.StateResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Switch(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/lightsService.LightsService/Switch',
            lights__pb2.SwitchRequest.SerializeToString,
            lights__pb2.SwitchResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)
