# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kvstore.proto

require 'google/protobuf'

require 'google/api/annotations_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("kvstore.proto", :syntax => :proto3) do
    add_message "kvstore.PutRequest" do
      optional :key, :bytes, 1
      optional :value, :bytes, 2
    end
    add_message "kvstore.PutResponse" do
    end
    add_message "kvstore.GetRequest" do
      optional :key, :bytes, 1
    end
    add_message "kvstore.GetResponse" do
      optional :value, :bytes, 1
    end
    add_message "kvstore.GetPrefixRequest" do
      optional :key_prefix, :bytes, 1
    end
    add_message "kvstore.GetPrefixResponse" do
      repeated :matches, :message, 1, "kvstore.GetPrefixResponse.Match"
    end
    add_message "kvstore.GetPrefixResponse.Match" do
      optional :key, :bytes, 1
      optional :value, :bytes, 2
    end
    add_message "kvstore.GetPrefixStreamRequest" do
      optional :key_prefix, :bytes, 1
    end
    add_message "kvstore.GetPrefixStreamResponse" do
      optional :key, :bytes, 1
      optional :value, :bytes, 2
    end
    add_message "kvstore.DeleteRequest" do
      optional :key, :bytes, 1
    end
    add_message "kvstore.DeleteResponse" do
    end
  end
end

module Kvstore
  PutRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("kvstore.PutRequest").msgclass
  PutResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("kvstore.PutResponse").msgclass
  GetRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("kvstore.GetRequest").msgclass
  GetResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("kvstore.GetResponse").msgclass
  GetPrefixRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("kvstore.GetPrefixRequest").msgclass
  GetPrefixResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("kvstore.GetPrefixResponse").msgclass
  GetPrefixResponse::Match = Google::Protobuf::DescriptorPool.generated_pool.lookup("kvstore.GetPrefixResponse.Match").msgclass
  GetPrefixStreamRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("kvstore.GetPrefixStreamRequest").msgclass
  GetPrefixStreamResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("kvstore.GetPrefixStreamResponse").msgclass
  DeleteRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("kvstore.DeleteRequest").msgclass
  DeleteResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("kvstore.DeleteResponse").msgclass
end
