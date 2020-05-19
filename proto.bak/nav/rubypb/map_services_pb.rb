# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: map.proto for package 'navService'

require 'grpc'
require 'map_pb'

module NavService
  module Map
    class Service

      include GRPC::GenericService

      self.marshal_class_method = :encode
      self.unmarshal_class_method = :decode
      self.service_name = 'navService.Map'

      rpc :GetMapInfo, GetMapInfoRequest, GetMapInfoResponse
      rpc :MapPositionStream, MapPositionStreamRequest, stream(MapPositionStreamResponse)
      # 重置当前定位
      # 用于发生定位异常/错误状态，重新初始化导航定位
      # 重定位错误：定位状态超时|无地图|UWB错误
      # 重定位超时判断: 默认10s，仅在非错误状态下重置
      rpc :LocationReset, LocationResetRequest, LocationResetResponse
    end

    Stub = Service.rpc_stub_class
  end
end