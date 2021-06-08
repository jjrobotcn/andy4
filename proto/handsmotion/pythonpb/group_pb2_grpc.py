# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

import group_pb2 as group__pb2


class GroupManagementStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.NewMotionGroup = channel.unary_unary(
        '/handsmotion.GroupManagement/NewMotionGroup',
        request_serializer=group__pb2.NewMotionGroupRequest.SerializeToString,
        response_deserializer=group__pb2.NewMotionGroupResponse.FromString,
        )
    self.ListMotionGroups = channel.unary_unary(
        '/handsmotion.GroupManagement/ListMotionGroups',
        request_serializer=group__pb2.ListMotionGroupsRequest.SerializeToString,
        response_deserializer=group__pb2.ListMotionGroupsResponse.FromString,
        )
    self.DeleteMotionGroup = channel.unary_unary(
        '/handsmotion.GroupManagement/DeleteMotionGroup',
        request_serializer=group__pb2.DeleteMotionGroupRequest.SerializeToString,
        response_deserializer=group__pb2.DeleteMotionGroupResponse.FromString,
        )
    self.GetMotionGroup = channel.unary_unary(
        '/handsmotion.GroupManagement/GetMotionGroup',
        request_serializer=group__pb2.GetMotionGroupRequest.SerializeToString,
        response_deserializer=group__pb2.GetMotionGroupResponse.FromString,
        )
    self.UpdateMotionGroupMeta = channel.unary_unary(
        '/handsmotion.GroupManagement/UpdateMotionGroupMeta',
        request_serializer=group__pb2.UpdateMotionMetaRequest.SerializeToString,
        response_deserializer=group__pb2.UpdateMotionMetaResponse.FromString,
        )
    self.UpdateMotionGroupScripts = channel.unary_unary(
        '/handsmotion.GroupManagement/UpdateMotionGroupScripts',
        request_serializer=group__pb2.UpdateMotionScriptsRequest.SerializeToString,
        response_deserializer=group__pb2.UpdateMotionScriptsResponse.FromString,
        )


class GroupManagementServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def NewMotionGroup(self, request, context):
    """新建动作分组
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def ListMotionGroups(self, request, context):
    """获取所有动作分组列表
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def DeleteMotionGroup(self, request, context):
    """删除动作分组
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetMotionGroup(self, request, context):
    """获取动作分组
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def UpdateMotionGroupMeta(self, request, context):
    """更新动作分组Meta
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def UpdateMotionGroupScripts(self, request, context):
    """更新动作分组Scripts
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_GroupManagementServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'NewMotionGroup': grpc.unary_unary_rpc_method_handler(
          servicer.NewMotionGroup,
          request_deserializer=group__pb2.NewMotionGroupRequest.FromString,
          response_serializer=group__pb2.NewMotionGroupResponse.SerializeToString,
      ),
      'ListMotionGroups': grpc.unary_unary_rpc_method_handler(
          servicer.ListMotionGroups,
          request_deserializer=group__pb2.ListMotionGroupsRequest.FromString,
          response_serializer=group__pb2.ListMotionGroupsResponse.SerializeToString,
      ),
      'DeleteMotionGroup': grpc.unary_unary_rpc_method_handler(
          servicer.DeleteMotionGroup,
          request_deserializer=group__pb2.DeleteMotionGroupRequest.FromString,
          response_serializer=group__pb2.DeleteMotionGroupResponse.SerializeToString,
      ),
      'GetMotionGroup': grpc.unary_unary_rpc_method_handler(
          servicer.GetMotionGroup,
          request_deserializer=group__pb2.GetMotionGroupRequest.FromString,
          response_serializer=group__pb2.GetMotionGroupResponse.SerializeToString,
      ),
      'UpdateMotionGroupMeta': grpc.unary_unary_rpc_method_handler(
          servicer.UpdateMotionGroupMeta,
          request_deserializer=group__pb2.UpdateMotionMetaRequest.FromString,
          response_serializer=group__pb2.UpdateMotionMetaResponse.SerializeToString,
      ),
      'UpdateMotionGroupScripts': grpc.unary_unary_rpc_method_handler(
          servicer.UpdateMotionGroupScripts,
          request_deserializer=group__pb2.UpdateMotionScriptsRequest.FromString,
          response_serializer=group__pb2.UpdateMotionScriptsResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'handsmotion.GroupManagement', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
