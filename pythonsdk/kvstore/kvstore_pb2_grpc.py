# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

from . import kvstore_pb2 as kvstore__pb2


class KVStoreStub(object):
    """kvstore.KVStore Key-Value键值存储服务
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Put = channel.unary_unary(
                '/kvstore.KVStore/Put',
                request_serializer=kvstore__pb2.PutRequest.SerializeToString,
                response_deserializer=kvstore__pb2.PutResponse.FromString,
                )
        self.Get = channel.unary_unary(
                '/kvstore.KVStore/Get',
                request_serializer=kvstore__pb2.GetRequest.SerializeToString,
                response_deserializer=kvstore__pb2.GetResponse.FromString,
                )
        self.GetPrefix = channel.unary_unary(
                '/kvstore.KVStore/GetPrefix',
                request_serializer=kvstore__pb2.GetPrefixRequest.SerializeToString,
                response_deserializer=kvstore__pb2.GetPrefixResponse.FromString,
                )
        self.GetPrefixStream = channel.unary_stream(
                '/kvstore.KVStore/GetPrefixStream',
                request_serializer=kvstore__pb2.GetPrefixStreamRequest.SerializeToString,
                response_deserializer=kvstore__pb2.GetPrefixStreamResponse.FromString,
                )
        self.Delete = channel.unary_unary(
                '/kvstore.KVStore/Delete',
                request_serializer=kvstore__pb2.DeleteRequest.SerializeToString,
                response_deserializer=kvstore__pb2.DeleteResponse.FromString,
                )


class KVStoreServicer(object):
    """kvstore.KVStore Key-Value键值存储服务
    """

    def Put(self, request, context):
        """Put 创建kv键值对
        若key已存在将更新value值
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Get(self, request, context):
        """Get 获取key的value
        若key不存在则返回gRPC错误:NotFound
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetPrefix(self, request, context):
        """GetPrefix 获取符合key_prefix的多个kv键值对
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetPrefixStream(self, request, context):
        """GetPrefixStream gRPC stream方式获取符合key_prefix的多个kv键值对
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Delete(self, request, context):
        """Delete 删除kv键值对
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_KVStoreServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Put': grpc.unary_unary_rpc_method_handler(
                    servicer.Put,
                    request_deserializer=kvstore__pb2.PutRequest.FromString,
                    response_serializer=kvstore__pb2.PutResponse.SerializeToString,
            ),
            'Get': grpc.unary_unary_rpc_method_handler(
                    servicer.Get,
                    request_deserializer=kvstore__pb2.GetRequest.FromString,
                    response_serializer=kvstore__pb2.GetResponse.SerializeToString,
            ),
            'GetPrefix': grpc.unary_unary_rpc_method_handler(
                    servicer.GetPrefix,
                    request_deserializer=kvstore__pb2.GetPrefixRequest.FromString,
                    response_serializer=kvstore__pb2.GetPrefixResponse.SerializeToString,
            ),
            'GetPrefixStream': grpc.unary_stream_rpc_method_handler(
                    servicer.GetPrefixStream,
                    request_deserializer=kvstore__pb2.GetPrefixStreamRequest.FromString,
                    response_serializer=kvstore__pb2.GetPrefixStreamResponse.SerializeToString,
            ),
            'Delete': grpc.unary_unary_rpc_method_handler(
                    servicer.Delete,
                    request_deserializer=kvstore__pb2.DeleteRequest.FromString,
                    response_serializer=kvstore__pb2.DeleteResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'kvstore.KVStore', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class KVStore(object):
    """kvstore.KVStore Key-Value键值存储服务
    """

    @staticmethod
    def Put(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kvstore.KVStore/Put',
            kvstore__pb2.PutRequest.SerializeToString,
            kvstore__pb2.PutResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Get(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kvstore.KVStore/Get',
            kvstore__pb2.GetRequest.SerializeToString,
            kvstore__pb2.GetResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetPrefix(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kvstore.KVStore/GetPrefix',
            kvstore__pb2.GetPrefixRequest.SerializeToString,
            kvstore__pb2.GetPrefixResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetPrefixStream(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_stream(request, target, '/kvstore.KVStore/GetPrefixStream',
            kvstore__pb2.GetPrefixStreamRequest.SerializeToString,
            kvstore__pb2.GetPrefixStreamResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Delete(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kvstore.KVStore/Delete',
            kvstore__pb2.DeleteRequest.SerializeToString,
            kvstore__pb2.DeleteResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)
