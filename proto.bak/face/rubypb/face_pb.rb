# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: face.proto

require 'google/protobuf'

require 'google/api/annotations_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("face.proto", :syntax => :proto3) do
    add_message "faceRecognition.CompareRequest" do
      optional :face_img1, :bytes, 1
      optional :face_img2, :bytes, 2
    end
    add_message "faceRecognition.CompareResponse" do
      optional :confidence, :float, 1
    end
    add_message "faceRecognition.SearchRequest" do
      optional :face_set_id, :string, 1
      optional :face_img, :bytes, 2
    end
    add_message "faceRecognition.SearchResponse" do
      optional :confidence, :float, 1
      optional :face_token, :string, 2
    end
  end
end

module FaceRecognition
  CompareRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("faceRecognition.CompareRequest").msgclass
  CompareResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("faceRecognition.CompareResponse").msgclass
  SearchRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("faceRecognition.SearchRequest").msgclass
  SearchResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("faceRecognition.SearchResponse").msgclass
end