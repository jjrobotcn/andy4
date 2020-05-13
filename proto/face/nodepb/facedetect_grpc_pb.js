// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var facedetect_pb = require('./facedetect_pb.js');
var google_api_annotations_pb = require('./google/api/annotations_pb.js');

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


var FaceDetectService = exports.FaceDetectService = {
  // FromImage实现对输入图片进行人脸检测，返回检测人脸图片列表
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
  // OnFaceDetect实现动态检测人脸，流式返回检测人脸图片戳列表
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
  // OnFaceSetFaceDetect实现动态检测人脸并与指定FaceSet进行对比，流式返回检测结果
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
