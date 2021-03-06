# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

from . import storage_pb2 as storage__pb2


class StorageStub(object):
    """cameraService.Storage 管理主摄像头监控数据存储
    此服务限制为仅内网使用

    开发管理平台功能参考: http://10.10.10.2/camera/storage/dates
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.ListDates = channel.unary_unary(
                '/cameraService.Storage/ListDates',
                request_serializer=storage__pb2.ListDatesRequest.SerializeToString,
                response_deserializer=storage__pb2.ListDatesResponse.FromString,
                )
        self.ListVideos = channel.unary_unary(
                '/cameraService.Storage/ListVideos',
                request_serializer=storage__pb2.ListVideosRequest.SerializeToString,
                response_deserializer=storage__pb2.ListVideosResponse.FromString,
                )
        self.GetVideoFile = channel.unary_stream(
                '/cameraService.Storage/GetVideoFile',
                request_serializer=storage__pb2.GetVideoFileRequest.SerializeToString,
                response_deserializer=storage__pb2.GetVideoFileResponse.FromString,
                )
        self.DeleteVideoFiles = channel.unary_unary(
                '/cameraService.Storage/DeleteVideoFiles',
                request_serializer=storage__pb2.DeleteVideoFilesRequest.SerializeToString,
                response_deserializer=storage__pb2.DeleteVideoFilesResponse.FromString,
                )


class StorageServicer(object):
    """cameraService.Storage 管理主摄像头监控数据存储
    此服务限制为仅内网使用

    开发管理平台功能参考: http://10.10.10.2/camera/storage/dates
    """

    def ListDates(self, request, context):
        """ListDates 获取监控存储的视频日期列表
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ListVideos(self, request, context):
        """ListVideos 获取时间范围内的监控视频列表

        未配置时间范围将默认获取当日时间
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetVideoFile(self, request, context):
        """GetVideoFile 获取监控视频文件

        HTTP中可使用文件服务器方法处理，支持HTTP Range
        http://10.10.10.2(:81)/api/v2/camera/storage/videos/2020-01-02/15:04:05.mp4(?token=)
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteVideoFiles(self, request, context):
        """DeleteVideoFiles 删除多个监控视频文件
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_StorageServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'ListDates': grpc.unary_unary_rpc_method_handler(
                    servicer.ListDates,
                    request_deserializer=storage__pb2.ListDatesRequest.FromString,
                    response_serializer=storage__pb2.ListDatesResponse.SerializeToString,
            ),
            'ListVideos': grpc.unary_unary_rpc_method_handler(
                    servicer.ListVideos,
                    request_deserializer=storage__pb2.ListVideosRequest.FromString,
                    response_serializer=storage__pb2.ListVideosResponse.SerializeToString,
            ),
            'GetVideoFile': grpc.unary_stream_rpc_method_handler(
                    servicer.GetVideoFile,
                    request_deserializer=storage__pb2.GetVideoFileRequest.FromString,
                    response_serializer=storage__pb2.GetVideoFileResponse.SerializeToString,
            ),
            'DeleteVideoFiles': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteVideoFiles,
                    request_deserializer=storage__pb2.DeleteVideoFilesRequest.FromString,
                    response_serializer=storage__pb2.DeleteVideoFilesResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'cameraService.Storage', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Storage(object):
    """cameraService.Storage 管理主摄像头监控数据存储
    此服务限制为仅内网使用

    开发管理平台功能参考: http://10.10.10.2/camera/storage/dates
    """

    @staticmethod
    def ListDates(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cameraService.Storage/ListDates',
            storage__pb2.ListDatesRequest.SerializeToString,
            storage__pb2.ListDatesResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ListVideos(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cameraService.Storage/ListVideos',
            storage__pb2.ListVideosRequest.SerializeToString,
            storage__pb2.ListVideosResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetVideoFile(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_stream(request, target, '/cameraService.Storage/GetVideoFile',
            storage__pb2.GetVideoFileRequest.SerializeToString,
            storage__pb2.GetVideoFileResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteVideoFiles(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cameraService.Storage/DeleteVideoFiles',
            storage__pb2.DeleteVideoFilesRequest.SerializeToString,
            storage__pb2.DeleteVideoFilesResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)
