# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

from . import player_pb2 as player__pb2


class PlayerStub(object):
    """Missing associated documentation comment in .proto file"""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Play = channel.unary_unary(
                '/handsmotion.Player/Play',
                request_serializer=player__pb2.PlayRequest.SerializeToString,
                response_deserializer=player__pb2.PlayResponse.FromString,
                )
        self.Stop = channel.unary_unary(
                '/handsmotion.Player/Stop',
                request_serializer=player__pb2.StopRequest.SerializeToString,
                response_deserializer=player__pb2.StopResponse.FromString,
                )
        self.Reset = channel.unary_unary(
                '/handsmotion.Player/Reset',
                request_serializer=player__pb2.ResetRequest.SerializeToString,
                response_deserializer=player__pb2.ResetResponse.FromString,
                )
        self.State = channel.unary_unary(
                '/handsmotion.Player/State',
                request_serializer=player__pb2.StateRequest.SerializeToString,
                response_deserializer=player__pb2.StateResponse.FromString,
                )
        self.OnStateChange = channel.unary_stream(
                '/handsmotion.Player/OnStateChange',
                request_serializer=player__pb2.OnStateChangeRequest.SerializeToString,
                response_deserializer=player__pb2.OnStateChangeResponse.FromString,
                )


class PlayerServicer(object):
    """Missing associated documentation comment in .proto file"""

    def Play(self, request, context):
        """Play 播放手臂动作
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Stop(self, request, context):
        """Stop 停止手臂动作
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Reset(self, request, context):
        """Reset 恢复手臂至初始位置
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def State(self, request, context):
        """State 查询当前player状态
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def OnStateChange(self, request, context):
        """OnStateChange 监听当前player状态
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_PlayerServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Play': grpc.unary_unary_rpc_method_handler(
                    servicer.Play,
                    request_deserializer=player__pb2.PlayRequest.FromString,
                    response_serializer=player__pb2.PlayResponse.SerializeToString,
            ),
            'Stop': grpc.unary_unary_rpc_method_handler(
                    servicer.Stop,
                    request_deserializer=player__pb2.StopRequest.FromString,
                    response_serializer=player__pb2.StopResponse.SerializeToString,
            ),
            'Reset': grpc.unary_unary_rpc_method_handler(
                    servicer.Reset,
                    request_deserializer=player__pb2.ResetRequest.FromString,
                    response_serializer=player__pb2.ResetResponse.SerializeToString,
            ),
            'State': grpc.unary_unary_rpc_method_handler(
                    servicer.State,
                    request_deserializer=player__pb2.StateRequest.FromString,
                    response_serializer=player__pb2.StateResponse.SerializeToString,
            ),
            'OnStateChange': grpc.unary_stream_rpc_method_handler(
                    servicer.OnStateChange,
                    request_deserializer=player__pb2.OnStateChangeRequest.FromString,
                    response_serializer=player__pb2.OnStateChangeResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'handsmotion.Player', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Player(object):
    """Missing associated documentation comment in .proto file"""

    @staticmethod
    def Play(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/handsmotion.Player/Play',
            player__pb2.PlayRequest.SerializeToString,
            player__pb2.PlayResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Stop(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/handsmotion.Player/Stop',
            player__pb2.StopRequest.SerializeToString,
            player__pb2.StopResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Reset(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/handsmotion.Player/Reset',
            player__pb2.ResetRequest.SerializeToString,
            player__pb2.ResetResponse.FromString,
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
        return grpc.experimental.unary_unary(request, target, '/handsmotion.Player/State',
            player__pb2.StateRequest.SerializeToString,
            player__pb2.StateResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def OnStateChange(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_stream(request, target, '/handsmotion.Player/OnStateChange',
            player__pb2.OnStateChangeRequest.SerializeToString,
            player__pb2.OnStateChangeResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)
