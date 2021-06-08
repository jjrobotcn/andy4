# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

from . import capability_pb2 as capability__pb2


class CapabilityStub(object):
    """Missing associated documentation comment in .proto file"""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.FingersAdjustment = channel.unary_unary(
                '/handsmotion.Capability/FingersAdjustment',
                request_serializer=capability__pb2.FingersAdjustmentRequest.SerializeToString,
                response_deserializer=capability__pb2.FingersAdjustmentResponse.FromString,
                )
        self.ArmAdjustment = channel.unary_unary(
                '/handsmotion.Capability/ArmAdjustment',
                request_serializer=capability__pb2.ArmAdjustmentRequest.SerializeToString,
                response_deserializer=capability__pb2.ArmAdjustmentResponse.FromString,
                )
        self.MarkAsOriginalPosition = channel.unary_unary(
                '/handsmotion.Capability/MarkAsOriginalPosition',
                request_serializer=capability__pb2.MarkAsOriginalPositionRequest.SerializeToString,
                response_deserializer=capability__pb2.MarkAsOriginalPositionResponse.FromString,
                )
        self.GetAbsolutePosition = channel.unary_unary(
                '/handsmotion.Capability/GetAbsolutePosition',
                request_serializer=capability__pb2.GetAbsolutePositionRequest.SerializeToString,
                response_deserializer=capability__pb2.GetAbsolutePositionResponse.FromString,
                )
        self.AbsoluteMove = channel.unary_unary(
                '/handsmotion.Capability/AbsoluteMove',
                request_serializer=capability__pb2.AbsoluteMoveRequest.SerializeToString,
                response_deserializer=capability__pb2.AbsoluteMoveResponse.FromString,
                )


class CapabilityServicer(object):
    """Missing associated documentation comment in .proto file"""

    def FingersAdjustment(self, request, context):
        """调整手指动作的开合与重置
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ArmAdjustment(self, request, context):
        """调整手臂位置重置、使能与失能,失能后可通过外力移动至相应位置后通过使能恢复锁定当前位置
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def MarkAsOriginalPosition(self, request, context):
        """标记当前位置为初始位置,所有位置数据将基于此点进行计算
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetAbsolutePosition(self, request, context):
        """获取当前绝对位置
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AbsoluteMove(self, request, context):
        """绝对位置移动
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_CapabilityServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'FingersAdjustment': grpc.unary_unary_rpc_method_handler(
                    servicer.FingersAdjustment,
                    request_deserializer=capability__pb2.FingersAdjustmentRequest.FromString,
                    response_serializer=capability__pb2.FingersAdjustmentResponse.SerializeToString,
            ),
            'ArmAdjustment': grpc.unary_unary_rpc_method_handler(
                    servicer.ArmAdjustment,
                    request_deserializer=capability__pb2.ArmAdjustmentRequest.FromString,
                    response_serializer=capability__pb2.ArmAdjustmentResponse.SerializeToString,
            ),
            'MarkAsOriginalPosition': grpc.unary_unary_rpc_method_handler(
                    servicer.MarkAsOriginalPosition,
                    request_deserializer=capability__pb2.MarkAsOriginalPositionRequest.FromString,
                    response_serializer=capability__pb2.MarkAsOriginalPositionResponse.SerializeToString,
            ),
            'GetAbsolutePosition': grpc.unary_unary_rpc_method_handler(
                    servicer.GetAbsolutePosition,
                    request_deserializer=capability__pb2.GetAbsolutePositionRequest.FromString,
                    response_serializer=capability__pb2.GetAbsolutePositionResponse.SerializeToString,
            ),
            'AbsoluteMove': grpc.unary_unary_rpc_method_handler(
                    servicer.AbsoluteMove,
                    request_deserializer=capability__pb2.AbsoluteMoveRequest.FromString,
                    response_serializer=capability__pb2.AbsoluteMoveResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'handsmotion.Capability', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Capability(object):
    """Missing associated documentation comment in .proto file"""

    @staticmethod
    def FingersAdjustment(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/handsmotion.Capability/FingersAdjustment',
            capability__pb2.FingersAdjustmentRequest.SerializeToString,
            capability__pb2.FingersAdjustmentResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ArmAdjustment(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/handsmotion.Capability/ArmAdjustment',
            capability__pb2.ArmAdjustmentRequest.SerializeToString,
            capability__pb2.ArmAdjustmentResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def MarkAsOriginalPosition(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/handsmotion.Capability/MarkAsOriginalPosition',
            capability__pb2.MarkAsOriginalPositionRequest.SerializeToString,
            capability__pb2.MarkAsOriginalPositionResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetAbsolutePosition(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/handsmotion.Capability/GetAbsolutePosition',
            capability__pb2.GetAbsolutePositionRequest.SerializeToString,
            capability__pb2.GetAbsolutePositionResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AbsoluteMove(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/handsmotion.Capability/AbsoluteMove',
            capability__pb2.AbsoluteMoveRequest.SerializeToString,
            capability__pb2.AbsoluteMoveResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)
