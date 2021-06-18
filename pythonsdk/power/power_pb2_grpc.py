# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

from . import power_pb2 as power__pb2


class PowerServiceStub(object):
    """powerService.PowerService 电源控制管理
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.GetPowerStatus = channel.unary_stream(
                '/powerService.PowerService/GetPowerStatus',
                request_serializer=power__pb2.GetPowerStatusRequest.SerializeToString,
                response_deserializer=power__pb2.GetPowerStatusResponse.FromString,
                )
        self.Reboot = channel.unary_unary(
                '/powerService.PowerService/Reboot',
                request_serializer=power__pb2.RebootRequest.SerializeToString,
                response_deserializer=power__pb2.RebootResponse.FromString,
                )
        self.States = channel.unary_unary(
                '/powerService.PowerService/States',
                request_serializer=power__pb2.StatesRequest.SerializeToString,
                response_deserializer=power__pb2.StatesResponse.FromString,
                )
        self.Switch = channel.unary_unary(
                '/powerService.PowerService/Switch',
                request_serializer=power__pb2.SwitchRequest.SerializeToString,
                response_deserializer=power__pb2.SwitchResponse.FromString,
                )
        self.SetAutoPowerOnOff = channel.unary_unary(
                '/powerService.PowerService/SetAutoPowerOnOff',
                request_serializer=power__pb2.AutoPowerOnOffModel.SerializeToString,
                response_deserializer=power__pb2.SetAutoPowerOnOffResponse.FromString,
                )
        self.GetAutoPowerOnOff = channel.unary_unary(
                '/powerService.PowerService/GetAutoPowerOnOff',
                request_serializer=power__pb2.GetAutoPowerOnOffRequest.SerializeToString,
                response_deserializer=power__pb2.AutoPowerOnOffModel.FromString,
                )


class PowerServiceServicer(object):
    """powerService.PowerService 电源控制管理
    """

    def GetPowerStatus(self, request, context):
        """GetPowerStatus 监听电源状态
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Reboot(self, request, context):
        """Reboot 内部模块的电源进行断电方式重启
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def States(self, request, context):
        """States 获取电源模块状态
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Switch(self, request, context):
        """Switch 控制内部模块电源的开关
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SetAutoPowerOnOff(self, request, context):
        """设置自动开关机
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetAutoPowerOnOff(self, request, context):
        """Missing associated documentation comment in .proto file"""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_PowerServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'GetPowerStatus': grpc.unary_stream_rpc_method_handler(
                    servicer.GetPowerStatus,
                    request_deserializer=power__pb2.GetPowerStatusRequest.FromString,
                    response_serializer=power__pb2.GetPowerStatusResponse.SerializeToString,
            ),
            'Reboot': grpc.unary_unary_rpc_method_handler(
                    servicer.Reboot,
                    request_deserializer=power__pb2.RebootRequest.FromString,
                    response_serializer=power__pb2.RebootResponse.SerializeToString,
            ),
            'States': grpc.unary_unary_rpc_method_handler(
                    servicer.States,
                    request_deserializer=power__pb2.StatesRequest.FromString,
                    response_serializer=power__pb2.StatesResponse.SerializeToString,
            ),
            'Switch': grpc.unary_unary_rpc_method_handler(
                    servicer.Switch,
                    request_deserializer=power__pb2.SwitchRequest.FromString,
                    response_serializer=power__pb2.SwitchResponse.SerializeToString,
            ),
            'SetAutoPowerOnOff': grpc.unary_unary_rpc_method_handler(
                    servicer.SetAutoPowerOnOff,
                    request_deserializer=power__pb2.AutoPowerOnOffModel.FromString,
                    response_serializer=power__pb2.SetAutoPowerOnOffResponse.SerializeToString,
            ),
            'GetAutoPowerOnOff': grpc.unary_unary_rpc_method_handler(
                    servicer.GetAutoPowerOnOff,
                    request_deserializer=power__pb2.GetAutoPowerOnOffRequest.FromString,
                    response_serializer=power__pb2.AutoPowerOnOffModel.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'powerService.PowerService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class PowerService(object):
    """powerService.PowerService 电源控制管理
    """

    @staticmethod
    def GetPowerStatus(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_stream(request, target, '/powerService.PowerService/GetPowerStatus',
            power__pb2.GetPowerStatusRequest.SerializeToString,
            power__pb2.GetPowerStatusResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Reboot(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/powerService.PowerService/Reboot',
            power__pb2.RebootRequest.SerializeToString,
            power__pb2.RebootResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def States(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/powerService.PowerService/States',
            power__pb2.StatesRequest.SerializeToString,
            power__pb2.StatesResponse.FromString,
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
        return grpc.experimental.unary_unary(request, target, '/powerService.PowerService/Switch',
            power__pb2.SwitchRequest.SerializeToString,
            power__pb2.SwitchResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SetAutoPowerOnOff(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/powerService.PowerService/SetAutoPowerOnOff',
            power__pb2.AutoPowerOnOffModel.SerializeToString,
            power__pb2.SetAutoPowerOnOffResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetAutoPowerOnOff(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/powerService.PowerService/GetAutoPowerOnOff',
            power__pb2.GetAutoPowerOnOffRequest.SerializeToString,
            power__pb2.AutoPowerOnOffModel.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)
