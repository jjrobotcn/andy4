# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: lights.proto for package 'lightsService'

require 'grpc'
require 'lights_pb'

module LightsService
  module LightsService
    class Service

      include GRPC::GenericService

      self.marshal_class_method = :encode
      self.unmarshal_class_method = :decode
      self.service_name = 'lightsService.LightsService'

      # 预览灯光
      # 创建灯光后使用此方法生成灯光文件
      # 在未生成灯光文件前调用PlayLight将无效
      rpc :PreviewLight, PreviewLightRequest, PreviewLightResponse
      # 播放灯光
      # 需在播放前执行PreviewLight生成灯光文件
      rpc :PlayLight, PlayLightRequest, PlayLightResponse
      # 停止灯光
      rpc :StopLight, StopLightRequest, StopLightResponse
      # 获取灯光数据
      rpc :ListLights, ListLightsRequest, ListLightsResponse
      # 创建灯光
      rpc :NewLight, NewLightRequest, NewLightResponse
      # 更新灯光数据
      rpc :UpdateLight, UpdateLightRequest, UpdateLightResponse
      # 删除灯光
      rpc :DeleteLights, DeleteLightsRequest, DeleteLightsResponse
      # 获取当前灯光模块状态
      rpc :State, StateRequest, StateResponse
      # 控制灯光的开关
      rpc :Switch, SwitchRequest, SwitchResponse
    end

    Stub = Service.rpc_stub_class
  end
end
