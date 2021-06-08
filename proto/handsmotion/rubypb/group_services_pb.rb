# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: group.proto for package 'handsmotion'

require 'grpc'
require 'group_pb'

module Handsmotion
  module GroupManagement
    class Service

      include GRPC::GenericService

      self.marshal_class_method = :encode
      self.unmarshal_class_method = :decode
      self.service_name = 'handsmotion.GroupManagement'

      # 新建动作分组
      rpc :NewMotionGroup, NewMotionGroupRequest, NewMotionGroupResponse
      # 获取所有动作分组列表
      rpc :ListMotionGroups, ListMotionGroupsRequest, ListMotionGroupsResponse
      # 删除动作分组
      rpc :DeleteMotionGroup, DeleteMotionGroupRequest, DeleteMotionGroupResponse
      # 获取动作分组
      rpc :GetMotionGroup, GetMotionGroupRequest, GetMotionGroupResponse
      # 更新动作分组Meta
      rpc :UpdateMotionGroupMeta, UpdateMotionMetaRequest, UpdateMotionMetaResponse
      # 更新动作分组Scripts
      rpc :UpdateMotionGroupScripts, UpdateMotionScriptsRequest, UpdateMotionScriptsResponse
    end

    Stub = Service.rpc_stub_class
  end
end
