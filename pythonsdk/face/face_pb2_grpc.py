# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

from . import face_pb2 as face__pb2


class FaceServiceStub(object):
    """faceRecognition.FaceService 人脸服务
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Compare = channel.unary_unary(
                '/faceRecognition.FaceService/Compare',
                request_serializer=face__pb2.CompareRequest.SerializeToString,
                response_deserializer=face__pb2.CompareResponse.FromString,
                )
        self.Search = channel.unary_unary(
                '/faceRecognition.FaceService/Search',
                request_serializer=face__pb2.SearchRequest.SerializeToString,
                response_deserializer=face__pb2.SearchResponse.FromString,
                )


class FaceServiceServicer(object):
    """faceRecognition.FaceService 人脸服务
    """

    def Compare(self, request, context):
        """Compare 实现两张人脸图片对比识别，返回两张人脸图片对比的可信度

        开发管理平台功能参考: http://10.10.10.2/face/compare
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Search(self, request, context):
        """Search 从FaceSet中搜索近似人脸数据
        若存在匹配数据时返回一个FaceDetail及可信度

        开发管理平台功能参考: http://10.10.10.2/face/compare
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_FaceServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Compare': grpc.unary_unary_rpc_method_handler(
                    servicer.Compare,
                    request_deserializer=face__pb2.CompareRequest.FromString,
                    response_serializer=face__pb2.CompareResponse.SerializeToString,
            ),
            'Search': grpc.unary_unary_rpc_method_handler(
                    servicer.Search,
                    request_deserializer=face__pb2.SearchRequest.FromString,
                    response_serializer=face__pb2.SearchResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'faceRecognition.FaceService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class FaceService(object):
    """faceRecognition.FaceService 人脸服务
    """

    @staticmethod
    def Compare(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/faceRecognition.FaceService/Compare',
            face__pb2.CompareRequest.SerializeToString,
            face__pb2.CompareResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Search(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/faceRecognition.FaceService/Search',
            face__pb2.SearchRequest.SerializeToString,
            face__pb2.SearchResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)