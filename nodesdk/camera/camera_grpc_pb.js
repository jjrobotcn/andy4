// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var camera_pb = require('./camera_pb.js');

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


// cameraService.CameraService 主摄像头视频流与图片的获取
var CameraServiceService = exports.CameraServiceService = {
  // LiveH264Stream 获取主摄像头视频流数据
  //
  // 输出数据为H264裸流，无音频，分辨率为960*720
  //
  // 网关不包含当前方法，WebSocket用户请使用独立接口
  // ws://10.10.10.2(:81)/api/v2/camera/ws/h264/live(?token=)
  // web应用中需调整数据类型: ws.binaryType = 'arraybuffer';
  //
  // 开发管理平台功能参考: http://10.10.10.2/camera/live/ws
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
  // LatestImage 获取主摄像头实时图片数据
  //
  // 开发管理平台功能参考: http://10.10.10.2/camera/live/image
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
