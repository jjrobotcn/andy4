# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: network.proto for package 'networkService'

require 'grpc'
require 'network_pb'

module NetworkService
  module NetworkService
    class Service

      include GRPC::GenericService

      self.marshal_class_method = :encode
      self.unmarshal_class_method = :decode
      self.service_name = 'networkService.NetworkService'

      # 获取网络扫描结果流
      # 扫描结果每30秒自动更新, 首次获取将返回记录中最新记录
      rpc :ListNetworks, ListNetworksRequest, stream(ListNetworksResponse)
      # 连接至指定网络
      # 连接失败将立即返回错误
      # 若30秒后成功获取状态将返回超时失败
      rpc :Connect, ConnectRequest, ConnectResponse
      # 获取连接状态流
      # 在连接开始时立即返回当前最新的扫描数据
      # 并持续在网络数据更新时接收新数据
      rpc :GetStatus, GetStatusRequest, stream(GetStatusResponse)
      # 获取网络设备相关信息
      # v1.1.0
      rpc :GetNetworkDeviceInfo, GetNetworkDeviceInfoRequest, GetNetworkDeviceInfoResponse
      # 修改网络设备相关信息
      # v1.1.0
      rpc :UpdateNetworkDeviceInfo, UpdateNetworkDeviceInfoRequest, UpdateNetworkDeviceInfoResponse
    end

    Stub = Service.rpc_stub_class
  end
end