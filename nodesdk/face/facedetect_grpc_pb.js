// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var facedetect_pb = require('./facedetect_pb.js');

function serialize_faceRecognition_FromImageRequest(arg) {
  if (!(arg instanceof facedetect_pb.FromImageRequest)) {
    throw new Error('Expected argument of type faceRecognition.FromImageRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_FromImageRequest(buffer_arg) {
  return facedetect_pb.FromImageRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_faceRecognition_FromImageResponse(arg) {
  if (!(arg instanceof facedetect_pb.FromImageResponse)) {
    throw new Error('Expected argument of type faceRecognition.FromImageResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_FromImageResponse(buffer_arg) {
  return facedetect_pb.FromImageResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_faceRecognition_OnFaceDetectRequest(arg) {
  if (!(arg instanceof facedetect_pb.OnFaceDetectRequest)) {
    throw new Error('Expected argument of type faceRecognition.OnFaceDetectRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_OnFaceDetectRequest(buffer_arg) {
  return facedetect_pb.OnFaceDetectRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_faceRecognition_OnFaceDetectResponse(arg) {
  if (!(arg instanceof facedetect_pb.OnFaceDetectResponse)) {
    throw new Error('Expected argument of type faceRecognition.OnFaceDetectResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_OnFaceDetectResponse(buffer_arg) {
  return facedetect_pb.OnFaceDetectResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_faceRecognition_OnFaceSetFaceDetectRequest(arg) {
  if (!(arg instanceof facedetect_pb.OnFaceSetFaceDetectRequest)) {
    throw new Error('Expected argument of type faceRecognition.OnFaceSetFaceDetectRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_OnFaceSetFaceDetectRequest(buffer_arg) {
  return facedetect_pb.OnFaceSetFaceDetectRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_faceRecognition_OnFaceSetFaceDetectResponse(arg) {
  if (!(arg instanceof facedetect_pb.OnFaceSetFaceDetectResponse)) {
    throw new Error('Expected argument of type faceRecognition.OnFaceSetFaceDetectResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_OnFaceSetFaceDetectResponse(buffer_arg) {
  return facedetect_pb.OnFaceSetFaceDetectResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// faceRecognition.FaceDetect 人脸检测服务
var FaceDetectService = exports.FaceDetectService = {
  // FromImage 检测人脸图片返回检测结果列表
  //
  // 开发管理平台功能参考: http://10.10.10.2/face/compare
  fromImage: {
    path: '/faceRecognition.FaceDetect/FromImage',
    requestStream: false,
    responseStream: false,
    requestType: facedetect_pb.FromImageRequest,
    responseType: facedetect_pb.FromImageResponse,
    requestSerialize: serialize_faceRecognition_FromImageRequest,
    requestDeserialize: deserialize_faceRecognition_FromImageRequest,
    responseSerialize: serialize_faceRecognition_FromImageResponse,
    responseDeserialize: deserialize_faceRecognition_FromImageResponse,
  },
  // OnFaceDetect 通过主摄像头动态检测人脸，持续返回检测结果列表
  //
  // 开发管理平台功能参考: http://10.10.10.2/face/detect
  onFaceDetect: {
    path: '/faceRecognition.FaceDetect/OnFaceDetect',
    requestStream: false,
    responseStream: true,
    requestType: facedetect_pb.OnFaceDetectRequest,
    responseType: facedetect_pb.OnFaceDetectResponse,
    requestSerialize: serialize_faceRecognition_OnFaceDetectRequest,
    requestDeserialize: deserialize_faceRecognition_OnFaceDetectRequest,
    responseSerialize: serialize_faceRecognition_OnFaceDetectResponse,
    responseDeserialize: deserialize_faceRecognition_OnFaceDetectResponse,
  },
  // OnFaceSetFaceDetect 通过主摄像头动态检测人脸并与指定FaceSet进行搜索，持续返回检测结果列表
  //
  // 为提搜索效率，FaceSet数据将在初始加载时获取快照数据，
  // 因此在使用过程中修改FaceSet无法影响快照中的Face结果，
  // 修改数据后可通过重新调用此方法以更新快照数据。
  //
  // 此方法为OnFaceDetect与Search的组合，用于内部FaceSet的识别搜索。
  //
  // 开发管理平台功能参考: http://10.10.10.2/face/face-set-detect
  onFaceSetFaceDetect: {
    path: '/faceRecognition.FaceDetect/OnFaceSetFaceDetect',
    requestStream: false,
    responseStream: true,
    requestType: facedetect_pb.OnFaceSetFaceDetectRequest,
    responseType: facedetect_pb.OnFaceSetFaceDetectResponse,
    requestSerialize: serialize_faceRecognition_OnFaceSetFaceDetectRequest,
    requestDeserialize: deserialize_faceRecognition_OnFaceSetFaceDetectRequest,
    responseSerialize: serialize_faceRecognition_OnFaceSetFaceDetectResponse,
    responseDeserialize: deserialize_faceRecognition_OnFaceSetFaceDetectResponse,
  },
};

exports.FaceDetectClient = grpc.makeGenericClientConstructor(FaceDetectService);
