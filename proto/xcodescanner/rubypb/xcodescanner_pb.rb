# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: xcodescanner.proto

require 'google/protobuf'

Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("xcodescanner.proto", :syntax => :proto3) do
    add_message "xcScannerService.GetScanDataRequest" do
    end
    add_message "xcScannerService.GetScanDataResponse" do
      optional :content, :string, 1
    end
  end
end

module XcScannerService
  GetScanDataRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("xcScannerService.GetScanDataRequest").msgclass
  GetScanDataResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("xcScannerService.GetScanDataResponse").msgclass
end
