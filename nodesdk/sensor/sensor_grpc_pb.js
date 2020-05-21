// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var sensor_pb = require('./sensor_pb.js');

function serialize_sensorService_GetDetectRequest(arg) {
  if (!(arg instanceof sensor_pb.GetDetectRequest)) {
    throw new Error('Expected argument of type sensorService.GetDetectRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sensorService_GetDetectRequest(buffer_arg) {
  return sensor_pb.GetDetectRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sensorService_GetDetectResponse(arg) {
  if (!(arg instanceof sensor_pb.GetDetectResponse)) {
    throw new Error('Expected argument of type sensorService.GetDetectResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sensorService_GetDetectResponse(buffer_arg) {
  return sensor_pb.GetDetectResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sensorService_GetMotionInductionRequest(arg) {
  if (!(arg instanceof sensor_pb.GetMotionInductionRequest)) {
    throw new Error('Expected argument of type sensorService.GetMotionInductionRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sensorService_GetMotionInductionRequest(buffer_arg) {
  return sensor_pb.GetMotionInductionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sensorService_GetMotionInductionResponse(arg) {
  if (!(arg instanceof sensor_pb.GetMotionInductionResponse)) {
    throw new Error('Expected argument of type sensorService.GetMotionInductionResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sensorService_GetMotionInductionResponse(buffer_arg) {
  return sensor_pb.GetMotionInductionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sensorService_GetTouchRequest(arg) {
  if (!(arg instanceof sensor_pb.GetTouchRequest)) {
    throw new Error('Expected argument of type sensorService.GetTouchRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sensorService_GetTouchRequest(buffer_arg) {
  return sensor_pb.GetTouchRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sensorService_GetTouchResponse(arg) {
  if (!(arg instanceof sensor_pb.GetTouchResponse)) {
    throw new Error('Expected argument of type sensorService.GetTouchResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sensorService_GetTouchResponse(buffer_arg) {
  return sensor_pb.GetTouchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sensorService_RawRequest(arg) {
  if (!(arg instanceof sensor_pb.RawRequest)) {
    throw new Error('Expected argument of type sensorService.RawRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sensorService_RawRequest(buffer_arg) {
  return sensor_pb.RawRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sensorService_RawResponse(arg) {
  if (!(arg instanceof sensor_pb.RawResponse)) {
    throw new Error('Expected argument of type sensorService.RawResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sensorService_RawResponse(buffer_arg) {
  return sensor_pb.RawResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// sensorService.SensorService 传感器服务
//
// 开发管理平台功能参考: http://10.10.10.2/detect
var SensorServiceService = exports.SensorServiceService = {
  // GetDetect 计算前方障碍的距离与方法
  //
  // 此计算方法受GetMotionInduction数据影响
  getDetect: {
    path: '/sensorService.SensorService/GetDetect',
    requestStream: false,
    responseStream: true,
    requestType: sensor_pb.GetDetectRequest,
    responseType: sensor_pb.GetDetectResponse,
    requestSerialize: serialize_sensorService_GetDetectRequest,
    requestDeserialize: deserialize_sensorService_GetDetectRequest,
    responseSerialize: serialize_sensorService_GetDetectResponse,
    responseDeserialize: deserialize_sensorService_GetDetectResponse,
  },
  // GetMotionInduction 获取动态感应数据
  getMotionInduction: {
    path: '/sensorService.SensorService/GetMotionInduction',
    requestStream: false,
    responseStream: true,
    requestType: sensor_pb.GetMotionInductionRequest,
    responseType: sensor_pb.GetMotionInductionResponse,
    requestSerialize: serialize_sensorService_GetMotionInductionRequest,
    requestDeserialize: deserialize_sensorService_GetMotionInductionRequest,
    responseSerialize: serialize_sensorService_GetMotionInductionResponse,
    responseDeserialize: deserialize_sensorService_GetMotionInductionResponse,
  },
  // GetTouch 获取触摸感应数据
  //
  // 目前支持头部与手部的触摸
  getTouch: {
    path: '/sensorService.SensorService/GetTouch',
    requestStream: false,
    responseStream: true,
    requestType: sensor_pb.GetTouchRequest,
    responseType: sensor_pb.GetTouchResponse,
    requestSerialize: serialize_sensorService_GetTouchRequest,
    requestDeserialize: deserialize_sensorService_GetTouchRequest,
    responseSerialize: serialize_sensorService_GetTouchResponse,
    responseDeserialize: deserialize_sensorService_GetTouchResponse,
  },
  // Raw 内部传感器数据
  //
  // 此方法为底层数据方法，用于上层的计算与调试，通常开发用户不应使用此方法
  raw: {
    path: '/sensorService.SensorService/Raw',
    requestStream: false,
    responseStream: true,
    requestType: sensor_pb.RawRequest,
    responseType: sensor_pb.RawResponse,
    requestSerialize: serialize_sensorService_RawRequest,
    requestDeserialize: deserialize_sensorService_RawRequest,
    responseSerialize: serialize_sensorService_RawResponse,
    responseDeserialize: deserialize_sensorService_RawResponse,
  },
};

exports.SensorServiceClient = grpc.makeGenericClientConstructor(SensorServiceService);
