# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: power.proto

require 'google/protobuf'

require 'google/api/annotations_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("power.proto", :syntax => :proto3) do
    add_message "powerService.PowerStatus" do
      optional :level, :uint32, 1
      optional :is_charging, :bool, 2
      map :devices, :string, :bool, 3
    end
    add_message "powerService.GetPowerStatusRequest" do
    end
    add_message "powerService.GetPowerStatusResponse" do
      optional :power_status, :message, 1, "powerService.PowerStatus"
    end
    add_message "powerService.RebootRequest" do
      optional :all, :bool, 1
    end
    add_message "powerService.RebootResponse" do
    end
  end
end

module PowerService
  PowerStatus = Google::Protobuf::DescriptorPool.generated_pool.lookup("powerService.PowerStatus").msgclass
  GetPowerStatusRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("powerService.GetPowerStatusRequest").msgclass
  GetPowerStatusResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("powerService.GetPowerStatusResponse").msgclass
  RebootRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("powerService.RebootRequest").msgclass
  RebootResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("powerService.RebootResponse").msgclass
end
