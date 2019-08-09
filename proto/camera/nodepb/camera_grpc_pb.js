// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var camera_pb = require('./camera_pb.js');
var google_api_annotations_pb = require('./google/api/annotations_pb.js');

function serialize_cameraService_DvrListDateVideosRequest(arg) {
  if (!(arg instanceof camera_pb.DvrListDateVideosRequest)) {
    throw new Error('Expected argument of type cameraService.DvrListDateVideosRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_cameraService_DvrListDateVideosRequest(buffer_arg) {
  return camera_pb.DvrListDateVideosRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cameraService_DvrListDateVideosResponse(arg) {
  if (!(arg instanceof camera_pb.DvrListDateVideosResponse)) {
    throw new Error('Expected argument of type cameraService.DvrListDateVideosResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_cameraService_DvrListDateVideosResponse(buffer_arg) {
  return camera_pb.DvrListDateVideosResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cameraService_DvrListDatesRequest(arg) {
  if (!(arg instanceof camera_pb.DvrListDatesRequest)) {
    throw new Error('Expected argument of type cameraService.DvrListDatesRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_cameraService_DvrListDatesRequest(buffer_arg) {
  return camera_pb.DvrListDatesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cameraService_DvrListDatesResponse(arg) {
  if (!(arg instanceof camera_pb.DvrListDatesResponse)) {
    throw new Error('Expected argument of type cameraService.DvrListDatesResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_cameraService_DvrListDatesResponse(buffer_arg) {
  return camera_pb.DvrListDatesResponse.deserializeBinary(new Uint8Array(buffer_arg));
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
  // 获取监控数据日期列表
  dvrListDates: {
    path: '/cameraService.CameraService/DvrListDates',
    requestStream: false,
    responseStream: false,
    requestType: camera_pb.DvrListDatesRequest,
    responseType: camera_pb.DvrListDatesResponse,
    requestSerialize: serialize_cameraService_DvrListDatesRequest,
    requestDeserialize: deserialize_cameraService_DvrListDatesRequest,
    responseSerialize: serialize_cameraService_DvrListDatesResponse,
    responseDeserialize: deserialize_cameraService_DvrListDatesResponse,
  },
  // 获取监控数据指定日期视频文件列表
  dvrListDateVideos: {
    path: '/cameraService.CameraService/DvrListDateVideos',
    requestStream: false,
    responseStream: false,
    requestType: camera_pb.DvrListDateVideosRequest,
    responseType: camera_pb.DvrListDateVideosResponse,
    requestSerialize: serialize_cameraService_DvrListDateVideosRequest,
    requestDeserialize: deserialize_cameraService_DvrListDateVideosRequest,
    responseSerialize: serialize_cameraService_DvrListDateVideosResponse,
    responseDeserialize: deserialize_cameraService_DvrListDateVideosResponse,
  },
};

exports.CameraServiceClient = grpc.makeGenericClientConstructor(CameraServiceService);
