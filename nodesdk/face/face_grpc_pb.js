// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var face_pb = require('./face_pb.js');

function serialize_faceRecognition_CompareRequest(arg) {
  if (!(arg instanceof face_pb.CompareRequest)) {
    throw new Error('Expected argument of type faceRecognition.CompareRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_CompareRequest(buffer_arg) {
  return face_pb.CompareRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_faceRecognition_CompareResponse(arg) {
  if (!(arg instanceof face_pb.CompareResponse)) {
    throw new Error('Expected argument of type faceRecognition.CompareResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_CompareResponse(buffer_arg) {
  return face_pb.CompareResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_faceRecognition_SearchRequest(arg) {
  if (!(arg instanceof face_pb.SearchRequest)) {
    throw new Error('Expected argument of type faceRecognition.SearchRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_SearchRequest(buffer_arg) {
  return face_pb.SearchRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_faceRecognition_SearchResponse(arg) {
  if (!(arg instanceof face_pb.SearchResponse)) {
    throw new Error('Expected argument of type faceRecognition.SearchResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_SearchResponse(buffer_arg) {
  return face_pb.SearchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// faceRecognition.FaceService 人脸服务
var FaceServiceService = exports.FaceServiceService = {
  // Compare 实现两张人脸图片对比识别，返回两张人脸图片对比的可信度
  //
  // 开发管理平台功能参考: http://10.10.10.2/face/compare
  compare: {
    path: '/faceRecognition.FaceService/Compare',
    requestStream: false,
    responseStream: false,
    requestType: face_pb.CompareRequest,
    responseType: face_pb.CompareResponse,
    requestSerialize: serialize_faceRecognition_CompareRequest,
    requestDeserialize: deserialize_faceRecognition_CompareRequest,
    responseSerialize: serialize_faceRecognition_CompareResponse,
    responseDeserialize: deserialize_faceRecognition_CompareResponse,
  },
  // Search 从FaceSet中搜索近似人脸数据
  // 若存在匹配数据时返回一个FaceDetail及可信度
  //
  // 开发管理平台功能参考: http://10.10.10.2/face/compare
  search: {
    path: '/faceRecognition.FaceService/Search',
    requestStream: false,
    responseStream: false,
    requestType: face_pb.SearchRequest,
    responseType: face_pb.SearchResponse,
    requestSerialize: serialize_faceRecognition_SearchRequest,
    requestDeserialize: deserialize_faceRecognition_SearchRequest,
    responseSerialize: serialize_faceRecognition_SearchResponse,
    responseDeserialize: deserialize_faceRecognition_SearchResponse,
  },
};

exports.FaceServiceClient = grpc.makeGenericClientConstructor(FaceServiceService);
