# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: messaging.proto

require 'google/protobuf'

Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("messaging.proto", :syntax => :proto3) do
    add_message "messaging.Subscribe" do
      repeated :topics, :string, 1
    end
    add_message "messaging.Unsubscribe" do
      repeated :topics, :string, 1
    end
    add_message "messaging.MessagePublish" do
      repeated :topics, :string, 1
      optional :payload, :bytes, 2
    end
    add_message "messaging.MessagingRequest" do
      oneof :messaging_oneof do
        optional :subscribe, :message, 1, "messaging.Subscribe"
        optional :unsubscribe, :message, 2, "messaging.Unsubscribe"
        optional :message_publish, :message, 3, "messaging.MessagePublish"
      end
    end
    add_message "messaging.MessagingResponse" do
      optional :topic, :string, 1
      optional :payload, :bytes, 2
    end
  end
end

module Messaging
  Subscribe = Google::Protobuf::DescriptorPool.generated_pool.lookup("messaging.Subscribe").msgclass
  Unsubscribe = Google::Protobuf::DescriptorPool.generated_pool.lookup("messaging.Unsubscribe").msgclass
  MessagePublish = Google::Protobuf::DescriptorPool.generated_pool.lookup("messaging.MessagePublish").msgclass
  MessagingRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("messaging.MessagingRequest").msgclass
  MessagingResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("messaging.MessagingResponse").msgclass
end
