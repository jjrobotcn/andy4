# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

from . import headmotion_pb2 as headmotion__pb2


class MotionServiceStub(object):
    """motionService.MotionService 头部运动功能的管理

    motionService包含头部与手部（计划）的运动功能管理，
    目前手部运动功能将拆分为后续计划的handsmotion服务。
    为维护服务的一致性，保留motionService，但内部仅包含头部运动的设计。

    开发管理平台功能参考: http://10.10.10.2/motion/head/
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.MoveTo = channel.unary_unary(
                '/motionService.MotionService/MoveTo',
                request_serializer=headmotion__pb2.MoveToRequest.SerializeToString,
                response_deserializer=headmotion__pb2.MoveToResponse.FromString,
                )
        self.PositioningData = channel.unary_stream(
                '/motionService.MotionService/PositioningData',
                request_serializer=headmotion__pb2.PositioningDataRequest.SerializeToString,
                response_deserializer=headmotion__pb2.PositioningDataResponse.FromString,
                )
        self.GetPosition = channel.unary_unary(
                '/motionService.MotionService/GetPosition',
                request_serializer=headmotion__pb2.GetPositionRequest.SerializeToString,
                response_deserializer=headmotion__pb2.GetPositionResponse.FromString,
                )
        self.NewGroup = channel.unary_unary(
                '/motionService.MotionService/NewGroup',
                request_serializer=headmotion__pb2.NewGroupRequest.SerializeToString,
                response_deserializer=headmotion__pb2.NewGroupResponse.FromString,
                )
        self.ListGroups = channel.unary_unary(
                '/motionService.MotionService/ListGroups',
                request_serializer=headmotion__pb2.ListGroupsRequest.SerializeToString,
                response_deserializer=headmotion__pb2.ListGroupsResponse.FromString,
                )
        self.UpdateGroup = channel.unary_unary(
                '/motionService.MotionService/UpdateGroup',
                request_serializer=headmotion__pb2.UpdateGroupRequest.SerializeToString,
                response_deserializer=headmotion__pb2.UpdateGroupResponse.FromString,
                )
        self.DeleteGroups = channel.unary_unary(
                '/motionService.MotionService/DeleteGroups',
                request_serializer=headmotion__pb2.DeleteGroupsRequest.SerializeToString,
                response_deserializer=headmotion__pb2.DeleteGroupsResponse.FromString,
                )
        self.ListGroupTargets = channel.unary_unary(
                '/motionService.MotionService/ListGroupTargets',
                request_serializer=headmotion__pb2.ListGroupTargetsRequest.SerializeToString,
                response_deserializer=headmotion__pb2.ListGroupTargetsResponse.FromString,
                )
        self.UpdateGroupTargets = channel.unary_unary(
                '/motionService.MotionService/UpdateGroupTargets',
                request_serializer=headmotion__pb2.UpdateGroupTargetsRequest.SerializeToString,
                response_deserializer=headmotion__pb2.UpdateGroupTargetsResponse.FromString,
                )


class MotionServiceServicer(object):
    """motionService.MotionService 头部运动功能的管理

    motionService包含头部与手部（计划）的运动功能管理，
    目前手部运动功能将拆分为后续计划的handsmotion服务。
    为维护服务的一致性，保留motionService，但内部仅包含头部运动的设计。

    开发管理平台功能参考: http://10.10.10.2/motion/head/
    """

    def MoveTo(self, request, context):
        """MoveTo 头部的移动

        通过预设组或定位方式移动头部
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def PositioningData(self, request, context):
        """PositioningData 监听头部实时定位数据

        用于持续获取当前主轴与交叉轴的实时位置

        需要通过外力控制头部位置时可通过PositioningDataRequest.disability=true调节，
        详见PositioningDataRequest
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetPosition(self, request, context):
        """GetPosition 获取当前头部定位数据

        用于获取当前主轴与交叉轴的实时位置
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def NewGroup(self, request, context):
        """NewGroup 创建头部位置预设组
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ListGroups(self, request, context):
        """ListGroups 获取头部位置预设组列表
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateGroup(self, request, context):
        """UpdateGroup 更新头部位置预设组
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteGroups(self, request, context):
        """DeleteGroups 删除头部位置预设组列表
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ListGroupTargets(self, request, context):
        """ListGroupTargets 获取头部位置预设组动作点列表
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateGroupTargets(self, request, context):
        """UpdateGroupTargets 更新头部位置预设组动作点列表
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MotionServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'MoveTo': grpc.unary_unary_rpc_method_handler(
                    servicer.MoveTo,
                    request_deserializer=headmotion__pb2.MoveToRequest.FromString,
                    response_serializer=headmotion__pb2.MoveToResponse.SerializeToString,
            ),
            'PositioningData': grpc.unary_stream_rpc_method_handler(
                    servicer.PositioningData,
                    request_deserializer=headmotion__pb2.PositioningDataRequest.FromString,
                    response_serializer=headmotion__pb2.PositioningDataResponse.SerializeToString,
            ),
            'GetPosition': grpc.unary_unary_rpc_method_handler(
                    servicer.GetPosition,
                    request_deserializer=headmotion__pb2.GetPositionRequest.FromString,
                    response_serializer=headmotion__pb2.GetPositionResponse.SerializeToString,
            ),
            'NewGroup': grpc.unary_unary_rpc_method_handler(
                    servicer.NewGroup,
                    request_deserializer=headmotion__pb2.NewGroupRequest.FromString,
                    response_serializer=headmotion__pb2.NewGroupResponse.SerializeToString,
            ),
            'ListGroups': grpc.unary_unary_rpc_method_handler(
                    servicer.ListGroups,
                    request_deserializer=headmotion__pb2.ListGroupsRequest.FromString,
                    response_serializer=headmotion__pb2.ListGroupsResponse.SerializeToString,
            ),
            'UpdateGroup': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateGroup,
                    request_deserializer=headmotion__pb2.UpdateGroupRequest.FromString,
                    response_serializer=headmotion__pb2.UpdateGroupResponse.SerializeToString,
            ),
            'DeleteGroups': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteGroups,
                    request_deserializer=headmotion__pb2.DeleteGroupsRequest.FromString,
                    response_serializer=headmotion__pb2.DeleteGroupsResponse.SerializeToString,
            ),
            'ListGroupTargets': grpc.unary_unary_rpc_method_handler(
                    servicer.ListGroupTargets,
                    request_deserializer=headmotion__pb2.ListGroupTargetsRequest.FromString,
                    response_serializer=headmotion__pb2.ListGroupTargetsResponse.SerializeToString,
            ),
            'UpdateGroupTargets': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateGroupTargets,
                    request_deserializer=headmotion__pb2.UpdateGroupTargetsRequest.FromString,
                    response_serializer=headmotion__pb2.UpdateGroupTargetsResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'motionService.MotionService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class MotionService(object):
    """motionService.MotionService 头部运动功能的管理

    motionService包含头部与手部（计划）的运动功能管理，
    目前手部运动功能将拆分为后续计划的handsmotion服务。
    为维护服务的一致性，保留motionService，但内部仅包含头部运动的设计。

    开发管理平台功能参考: http://10.10.10.2/motion/head/
    """

    @staticmethod
    def MoveTo(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/motionService.MotionService/MoveTo',
            headmotion__pb2.MoveToRequest.SerializeToString,
            headmotion__pb2.MoveToResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def PositioningData(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_stream(request, target, '/motionService.MotionService/PositioningData',
            headmotion__pb2.PositioningDataRequest.SerializeToString,
            headmotion__pb2.PositioningDataResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetPosition(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/motionService.MotionService/GetPosition',
            headmotion__pb2.GetPositionRequest.SerializeToString,
            headmotion__pb2.GetPositionResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def NewGroup(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/motionService.MotionService/NewGroup',
            headmotion__pb2.NewGroupRequest.SerializeToString,
            headmotion__pb2.NewGroupResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ListGroups(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/motionService.MotionService/ListGroups',
            headmotion__pb2.ListGroupsRequest.SerializeToString,
            headmotion__pb2.ListGroupsResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateGroup(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/motionService.MotionService/UpdateGroup',
            headmotion__pb2.UpdateGroupRequest.SerializeToString,
            headmotion__pb2.UpdateGroupResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteGroups(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/motionService.MotionService/DeleteGroups',
            headmotion__pb2.DeleteGroupsRequest.SerializeToString,
            headmotion__pb2.DeleteGroupsResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ListGroupTargets(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/motionService.MotionService/ListGroupTargets',
            headmotion__pb2.ListGroupTargetsRequest.SerializeToString,
            headmotion__pb2.ListGroupTargetsResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateGroupTargets(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/motionService.MotionService/UpdateGroupTargets',
            headmotion__pb2.UpdateGroupTargetsRequest.SerializeToString,
            headmotion__pb2.UpdateGroupTargetsResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)
