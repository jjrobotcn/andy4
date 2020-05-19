# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: lights.proto

require 'google/protobuf'

require 'google/api/annotations_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("lights.proto", :syntax => :proto3) do
    add_message "lightsService.PreviewLightRequest" do
      optional :id, :string, 1
    end
    add_message "lightsService.PreviewLightResponse" do
    end
    add_message "lightsService.PlayLightRequest" do
      optional :ltype, :enum, 1, "lightsService.LightType"
      optional :id, :string, 2
      optional :name, :string, 3
    end
    add_message "lightsService.PlayLightResponse" do
    end
    add_message "lightsService.StopLightRequest" do
      repeated :ltypes, :enum, 1, "lightsService.LightType"
    end
    add_message "lightsService.StopLightResponse" do
    end
    add_message "lightsService.LightInfo" do
      optional :ltype, :enum, 1, "lightsService.LightType"
      optional :id, :string, 2
      optional :name, :string, 3
      repeated :frames, :message, 4, "lightsService.LightFrame"
    end
    add_message "lightsService.LightFrame" do
      repeated :colors, :string, 1
      optional :speed, :uint32, 2
      optional :mode, :enum, 3, "lightsService.PlayMode"
    end
    add_message "lightsService.ListLightsRequest" do
      optional :ltype, :enum, 1, "lightsService.LightType"
    end
    add_message "lightsService.ListLightsResponse" do
      repeated :lights_info, :message, 1, "lightsService.LightInfo"
    end
    add_message "lightsService.NewLightRequest" do
      optional :light_info, :message, 1, "lightsService.LightInfo"
    end
    add_message "lightsService.NewLightResponse" do
      optional :light_info, :message, 1, "lightsService.LightInfo"
    end
    add_message "lightsService.UpdateLightRequest" do
      optional :light_info, :message, 1, "lightsService.LightInfo"
    end
    add_message "lightsService.UpdateLightResponse" do
      optional :light_info, :message, 1, "lightsService.LightInfo"
    end
    add_message "lightsService.DeleteLightsRequest" do
      repeated :lights_id, :string, 1
    end
    add_message "lightsService.DeleteLightsResponse" do
    end
    add_message "lightsService.StateRequest" do
    end
    add_message "lightsService.StateResponse" do
      optional :is_active, :bool, 1
      optional :is_playing, :bool, 2
    end
    add_message "lightsService.SwitchRequest" do
      optional :active, :bool, 1
    end
    add_message "lightsService.SwitchResponse" do
      optional :is_active, :bool, 1
    end
    add_enum "lightsService.LightType" do
      value :UNDEFINED, 0
      value :MOUTH, 1
      value :HANDS, 2
      value :EARS, 3
    end
    add_enum "lightsService.PlayMode" do
      value :PRESET, 0
      value :ALWAYS, 1
      value :MARQUEE, 2
      value :FLASH, 3
      value :TICKTOCK, 4
    end
  end
end

module LightsService
  PreviewLightRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("lightsService.PreviewLightRequest").msgclass
  PreviewLightResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("lightsService.PreviewLightResponse").msgclass
  PlayLightRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("lightsService.PlayLightRequest").msgclass
  PlayLightResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("lightsService.PlayLightResponse").msgclass
  StopLightRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("lightsService.StopLightRequest").msgclass
  StopLightResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("lightsService.StopLightResponse").msgclass
  LightInfo = Google::Protobuf::DescriptorPool.generated_pool.lookup("lightsService.LightInfo").msgclass
  LightFrame = Google::Protobuf::DescriptorPool.generated_pool.lookup("lightsService.LightFrame").msgclass
  ListLightsRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("lightsService.ListLightsRequest").msgclass
  ListLightsResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("lightsService.ListLightsResponse").msgclass
  NewLightRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("lightsService.NewLightRequest").msgclass
  NewLightResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("lightsService.NewLightResponse").msgclass
  UpdateLightRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("lightsService.UpdateLightRequest").msgclass
  UpdateLightResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("lightsService.UpdateLightResponse").msgclass
  DeleteLightsRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("lightsService.DeleteLightsRequest").msgclass
  DeleteLightsResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("lightsService.DeleteLightsResponse").msgclass
  StateRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("lightsService.StateRequest").msgclass
  StateResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("lightsService.StateResponse").msgclass
  SwitchRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("lightsService.SwitchRequest").msgclass
  SwitchResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("lightsService.SwitchResponse").msgclass
  LightType = Google::Protobuf::DescriptorPool.generated_pool.lookup("lightsService.LightType").enummodule
  PlayMode = Google::Protobuf::DescriptorPool.generated_pool.lookup("lightsService.PlayMode").enummodule
end