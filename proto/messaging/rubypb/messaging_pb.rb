# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: messaging.proto

require 'google/protobuf'

Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("messaging.proto", :syntax => :proto3) do
    add_message "messagingService.Subscribe" do
      repeated :topics, :string, 1
    end
    add_message "messagingService.Unsubscribe" do
      repeated :topics, :string, 1
    end
    add_message "messagingService.MessagePublish" do
      repeated :topics, :string, 1
      optional :payload, :bytes, 2
    end
    add_message "messagingService.MessagingRequest" do
      oneof :messaging_oneof do
        optional :subscribe, :message, 1, "messagingService.Subscribe"
        optional :unsubscribe, :message, 2, "messagingService.Unsubscribe"
        optional :message_publish, :message, 3, "messagingService.MessagePublish"
      end
    end
    add_message "messagingService.MessagingResponse" do
      optional :topic, :string, 1
      optional :payload, :bytes, 2
    end
  end
end

module MessagingService
  Subscribe = Google::Protobuf::DescriptorPool.generated_pool.lookup("messagingService.Subscribe").msgclass
  Unsubscribe = Google::Protobuf::DescriptorPool.generated_pool.lookup("messagingService.Unsubscribe").msgclass
  MessagePublish = Google::Protobuf::DescriptorPool.generated_pool.lookup("messagingService.MessagePublish").msgclass
  MessagingRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("messagingService.MessagingRequest").msgclass
  MessagingResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("messagingService.MessagingResponse").msgclass
end
