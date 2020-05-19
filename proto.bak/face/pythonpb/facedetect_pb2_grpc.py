# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

import facedetect_pb2 as facedetect__pb2


class FaceDetectStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.FromImage = channel.unary_unary(
        '/faceRecognition.FaceDetect/FromImage',
        request_serializer=facedetect__pb2.FromImageRequest.SerializeToString,
        response_deserializer=facedetect__pb2.FromImageResponse.FromString,
        )
    self.OnFaceDetect = channel.unary_stream(
        '/faceRecognition.FaceDetect/OnFaceDetect',
        request_serializer=facedetect__pb2.OnFaceDetectRequest.SerializeToString,
        response_deserializer=facedetect__pb2.OnFaceDetectResponse.FromString,
        )
    self.OnFaceSetFaceDetect = channel.unary_stream(
        '/faceRecognition.FaceDetect/OnFaceSetFaceDetect',
        request_serializer=facedetect__pb2.OnFaceSetFaceDetectRequest.SerializeToString,
        response_deserializer=facedetect__pb2.OnFaceSetFaceDetectResponse.FromString,
        )


class FaceDetectServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def FromImage(self, request, context):
    """FromImage实现对输入图片进行人脸检测，返回检测人脸图片列表
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def OnFaceDetect(self, request, context):
    """OnFaceDetect实现动态检测人脸，流式返回检测人脸图片戳列表
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def OnFaceSetFaceDetect(self, request, context):
    """OnFaceSetFaceDetect实现动态检测人脸并与指定FaceSet进行对比，流式返回检测结果
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_FaceDetectServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'FromImage': grpc.unary_unary_rpc_method_handler(
          servicer.FromImage,
          request_deserializer=facedetect__pb2.FromImageRequest.FromString,
          response_serializer=facedetect__pb2.FromImageResponse.SerializeToString,
      ),
      'OnFaceDetect': grpc.unary_stream_rpc_method_handler(
          servicer.OnFaceDetect,
          request_deserializer=facedetect__pb2.OnFaceDetectRequest.FromString,
          response_serializer=facedetect__pb2.OnFaceDetectResponse.SerializeToString,
      ),
      'OnFaceSetFaceDetect': grpc.unary_stream_rpc_method_handler(
          servicer.OnFaceSetFaceDetect,
          request_deserializer=facedetect__pb2.OnFaceSetFaceDetectRequest.FromString,
          response_serializer=facedetect__pb2.OnFaceSetFaceDetectResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'faceRecognition.FaceDetect', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))