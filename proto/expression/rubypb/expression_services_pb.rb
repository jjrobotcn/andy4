# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: expression.proto for package 'expressionService'

require 'grpc'
require 'expression_pb'

module ExpressionService
  module ExpressionService
    class Service

      include GRPC::GenericService

      self.marshal_class_method = :encode
      self.unmarshal_class_method = :decode
      self.service_name = 'expressionService.ExpressionService'

      # 播放表情
      rpc :PlayExpressions, PlayExpressionsRequest, PlayExpressionsResponse
      # 停止表情
      rpc :StopExpression, StopExpressionRequest, StopExpressionResponse
      # 上传表情
      rpc :UploadExpressionFile, UploadExpressionFileRequest, UploadExpressionFileResponse
      # 表情重命名
      # >= v1.1.0
      rpc :Rename, RenameRequest, RenameResponse
      # 获取表情数据
      rpc :ListExpressions, ListExpressionsRequest, ListExpressionsResponse
      # 删除表情
      rpc :DeleteExpressions, DeleteExpressionsRequest, DeleteExpressionsResponse
    end

    Stub = Service.rpc_stub_class
  end
end