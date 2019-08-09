# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

import escpos_pb2 as escpos__pb2


class EscPosServiceStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.PrintRaw = channel.unary_unary(
        '/escposService.EscPosService/PrintRaw',
        request_serializer=escpos__pb2.PrintRawRequest.SerializeToString,
        response_deserializer=escpos__pb2.PrintRawResponse.FromString,
        )
    self.PrintElements = channel.unary_unary(
        '/escposService.EscPosService/PrintElements',
        request_serializer=escpos__pb2.PrintElementsRequest.SerializeToString,
        response_deserializer=escpos__pb2.PrintElementsResponse.FromString,
        )
    self.PrintHtmlTemplate = channel.unary_unary(
        '/escposService.EscPosService/PrintHtmlTemplate',
        request_serializer=escpos__pb2.PrintHtmlTemplateRequest.SerializeToString,
        response_deserializer=escpos__pb2.PrintHtmlTemplateResponse.FromString,
        )
    self.NewHtmlTemplate = channel.unary_unary(
        '/escposService.EscPosService/NewHtmlTemplate',
        request_serializer=escpos__pb2.NewHtmlTemplateRequest.SerializeToString,
        response_deserializer=escpos__pb2.NewHtmlTemplateResponse.FromString,
        )
    self.ListHtmlTemplates = channel.unary_unary(
        '/escposService.EscPosService/ListHtmlTemplates',
        request_serializer=escpos__pb2.ListHtmlTemplatesRequest.SerializeToString,
        response_deserializer=escpos__pb2.ListHtmlTemplatesResponse.FromString,
        )
    self.GetHtmlTemplate = channel.unary_unary(
        '/escposService.EscPosService/GetHtmlTemplate',
        request_serializer=escpos__pb2.GetHtmlTemplateRequest.SerializeToString,
        response_deserializer=escpos__pb2.GetHtmlTemplateResponse.FromString,
        )
    self.UpdateHtmlTemplate = channel.unary_unary(
        '/escposService.EscPosService/UpdateHtmlTemplate',
        request_serializer=escpos__pb2.UpdateHtmlTemplateRequest.SerializeToString,
        response_deserializer=escpos__pb2.UpdateHtmlTemplateResponse.FromString,
        )
    self.DeleteHtmlTemplates = channel.unary_unary(
        '/escposService.EscPosService/DeleteHtmlTemplates',
        request_serializer=escpos__pb2.DeleteHtmlTemplatesRequest.SerializeToString,
        response_deserializer=escpos__pb2.DeleteHtmlTemplatesResponse.FromString,
        )


class EscPosServiceServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def PrintRaw(self, request, context):
    """打印bytes数据
    打印模板与打印对象方式不满足业务需求
    或希望接入其它已外部业务实现的打印组件时, 可通过此方法直接
    传入打印内容
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def PrintElements(self, request, context):
    """打印对象
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def PrintHtmlTemplate(self, request, context):
    """打印预设的html模板内容
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def NewHtmlTemplate(self, request, context):
    """创建html模板
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def ListHtmlTemplates(self, request, context):
    """获取html模板列表
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetHtmlTemplate(self, request, context):
    """获取指定html模板内容
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def UpdateHtmlTemplate(self, request, context):
    """更新html模板
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def DeleteHtmlTemplates(self, request, context):
    """删除html模板
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_EscPosServiceServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'PrintRaw': grpc.unary_unary_rpc_method_handler(
          servicer.PrintRaw,
          request_deserializer=escpos__pb2.PrintRawRequest.FromString,
          response_serializer=escpos__pb2.PrintRawResponse.SerializeToString,
      ),
      'PrintElements': grpc.unary_unary_rpc_method_handler(
          servicer.PrintElements,
          request_deserializer=escpos__pb2.PrintElementsRequest.FromString,
          response_serializer=escpos__pb2.PrintElementsResponse.SerializeToString,
      ),
      'PrintHtmlTemplate': grpc.unary_unary_rpc_method_handler(
          servicer.PrintHtmlTemplate,
          request_deserializer=escpos__pb2.PrintHtmlTemplateRequest.FromString,
          response_serializer=escpos__pb2.PrintHtmlTemplateResponse.SerializeToString,
      ),
      'NewHtmlTemplate': grpc.unary_unary_rpc_method_handler(
          servicer.NewHtmlTemplate,
          request_deserializer=escpos__pb2.NewHtmlTemplateRequest.FromString,
          response_serializer=escpos__pb2.NewHtmlTemplateResponse.SerializeToString,
      ),
      'ListHtmlTemplates': grpc.unary_unary_rpc_method_handler(
          servicer.ListHtmlTemplates,
          request_deserializer=escpos__pb2.ListHtmlTemplatesRequest.FromString,
          response_serializer=escpos__pb2.ListHtmlTemplatesResponse.SerializeToString,
      ),
      'GetHtmlTemplate': grpc.unary_unary_rpc_method_handler(
          servicer.GetHtmlTemplate,
          request_deserializer=escpos__pb2.GetHtmlTemplateRequest.FromString,
          response_serializer=escpos__pb2.GetHtmlTemplateResponse.SerializeToString,
      ),
      'UpdateHtmlTemplate': grpc.unary_unary_rpc_method_handler(
          servicer.UpdateHtmlTemplate,
          request_deserializer=escpos__pb2.UpdateHtmlTemplateRequest.FromString,
          response_serializer=escpos__pb2.UpdateHtmlTemplateResponse.SerializeToString,
      ),
      'DeleteHtmlTemplates': grpc.unary_unary_rpc_method_handler(
          servicer.DeleteHtmlTemplates,
          request_deserializer=escpos__pb2.DeleteHtmlTemplatesRequest.FromString,
          response_serializer=escpos__pb2.DeleteHtmlTemplatesResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'escposService.EscPosService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
