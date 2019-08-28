// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var camera_pb = require('./camera_pb.js');
var google_api_annotations_pb = require('./google/api/annotations_pb.js');

function serialize_cameraService_LatestImageRequest(arg) {
  if (!(arg instanceof camera_pb.LatestImageRequest)) {
    throw new Error('Expected argument of type cameraService.LatestImageRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_cameraService_LatestImageRequest(buffer_arg) {
  return camera_pb.LatestImageRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cameraService_LatestImageResponse(arg) {
  if (!(arg instanceof camera_pb.LatestImageResponse)) {
    throw new Error('Expected argument of type cameraService.LatestImageResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_cameraService_LatestImageResponse(buffer_arg) {
  return camera_pb.LatestImageResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cameraService_LiveH264StreamRequest(arg) {
  if (!(arg instanceof camera_pb.LiveH264StreamRequest)) {
    throw new Error('Expected argument of type cameraService.LiveH264StreamRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_cameraService_LiveH264StreamRequest(buffer_arg) {
  return camera_pb.LiveH264StreamRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cameraService_LiveH264StreamResponse(arg) {
  if (!(arg instanceof camera_pb.LiveH264StreamResponse)) {
    throw new Error('Expected argument of type cameraService.LiveH264StreamResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_cameraService_LiveH264StreamResponse(buffer_arg) {
  return camera_pb.LiveH264StreamResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var CameraServiceService = exports.CameraServiceService = {
  // 直播流数据, 数据为h264 nal单元
  liveH264Stream: {
    path: '/cameraService.CameraService/LiveH264Stream',
    requestStream: false,
    responseStream: true,
    requestType: camera_pb.LiveH264StreamRequest,
    responseType: camera_pb.LiveH264StreamResponse,
    requestSerialize: serialize_cameraService_LiveH264StreamRequest,
    requestDeserialize: deserialize_cameraService_LiveH264StreamRequest,
    responseSerialize: serialize_cameraService_LiveH264StreamResponse,
    responseDeserialize: deserialize_cameraService_LiveH264StreamResponse,
  },
  // 获取实时当前最新图片jpg
  latestImage: {
    path: '/cameraService.CameraService/LatestImage',
    requestStream: false,
    responseStream: false,
    requestType: camera_pb.LatestImageRequest,
    responseType: camera_pb.LatestImageResponse,
    requestSerialize: serialize_cameraService_LatestImageRequest,
    requestDeserialize: deserialize_cameraService_LatestImageRequest,
    responseSerialize: serialize_cameraService_LatestImageResponse,
    responseDeserialize: deserialize_cameraService_LatestImageResponse,
  },
};

exports.CameraServiceClient = grpc.makeGenericClientConstructor(CameraServiceService);
