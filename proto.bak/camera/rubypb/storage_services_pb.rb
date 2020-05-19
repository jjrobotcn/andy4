# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: storage.proto for package 'cameraService'

require 'grpc'
require 'storage_pb'

module CameraService
  module Storage
    class Service

      include GRPC::GenericService

      self.marshal_class_method = :encode
      self.unmarshal_class_method = :decode
      self.service_name = 'cameraService.Storage'

      # 获取监控视频日期列表
      rpc :ListDates, ListDatesRequest, ListDatesResponse
      # 获取监控视频列表
      rpc :ListVideos, ListVideosRequest, ListVideosResponse
      # 获取监控视频文件
      rpc :GetVideoFile, GetVideoFileRequest, stream(GetVideoFileResponse)
      # 删除监控视频文件
      rpc :DeleteVideoFiles, DeleteVideoFilesRequest, DeleteVideoFilesResponse
    end

    Stub = Service.rpc_stub_class
  end
end