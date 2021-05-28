// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var sensor_pb = require('./sensor_pb.js');

function serialize_sensorService_GetAntiRequest(arg) {
  if (!(arg instanceof sensor_pb.GetAntiRequest)) {
    throw new Error('Expected argument of type sensorService.GetAntiRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sensorService_GetAntiRequest(buffer_arg) {
  return sensor_pb.GetAntiRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sensorService_GetAntiResponse(arg) {
  if (!(arg instanceof sensor_pb.GetAntiResponse)) {
    throw new Error('Expected argument of type sensorService.GetAntiResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sensorService_GetAntiResponse(buffer_arg) {
  return sensor_pb.GetAntiResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sensorService_GetBumperRequest(arg) {
  if (!(arg instanceof sensor_pb.GetBumperRequest)) {
    throw new Error('Expected argument of type sensorService.GetBumperRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sensorService_GetBumperRequest(buffer_arg) {
  return sensor_pb.GetBumperRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sensorService_GetBumperResponse(arg) {
  if (!(arg instanceof sensor_pb.GetBumperResponse)) {
    throw new Error('Expected argument of type sensorService.GetBumperResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sensorService_GetBumperResponse(buffer_arg) {
  return sensor_pb.GetBumperResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

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

function serialize_sensorService_GetObsRequest(arg) {
  if (!(arg instanceof sensor_pb.GetObsRequest)) {
    throw new Error('Expected argument of type sensorService.GetObsRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sensorService_GetObsRequest(buffer_arg) {
  return sensor_pb.GetObsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sensorService_GetObsResponse(arg) {
  if (!(arg instanceof sensor_pb.GetObsResponse)) {
    throw new Error('Expected argument of type sensorService.GetObsResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sensorService_GetObsResponse(buffer_arg) {
  return sensor_pb.GetObsResponse.deserializeBinary(new Uint8Array(buffer_arg));
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


// sensorService.SensorService 传感器服务
//
// 开发管理平台功能参考: http://10.10.10.2/detect
var SensorServiceService = exports.SensorServiceService = {
  // 计算前方障碍的距离与方法(该接口不再支持)
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
  // 获取动态感应数据(该接口不再支持)
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
  // 获取触摸感应数据
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
  // 碰撞传感器数据
  getBumper: {
    path: '/sensorService.SensorService/GetBumper',
    requestStream: false,
    responseStream: true,
    requestType: sensor_pb.GetBumperRequest,
    responseType: sensor_pb.GetBumperResponse,
    requestSerialize: serialize_sensorService_GetBumperRequest,
    requestDeserialize: deserialize_sensorService_GetBumperRequest,
    responseSerialize: serialize_sensorService_GetBumperResponse,
    responseDeserialize: deserialize_sensorService_GetBumperResponse,
  },
  // 防跌落传感器数据
  getAnti: {
    path: '/sensorService.SensorService/GetAnti',
    requestStream: false,
    responseStream: true,
    requestType: sensor_pb.GetAntiRequest,
    responseType: sensor_pb.GetAntiResponse,
    requestSerialize: serialize_sensorService_GetAntiRequest,
    requestDeserialize: deserialize_sensorService_GetAntiRequest,
    responseSerialize: serialize_sensorService_GetAntiResponse,
    responseDeserialize: deserialize_sensorService_GetAntiResponse,
  },
  // 避障距离传感器
  getObs: {
    path: '/sensorService.SensorService/GetObs',
    requestStream: false,
    responseStream: true,
    requestType: sensor_pb.GetObsRequest,
    responseType: sensor_pb.GetObsResponse,
    requestSerialize: serialize_sensorService_GetObsRequest,
    requestDeserialize: deserialize_sensorService_GetObsRequest,
    responseSerialize: serialize_sensorService_GetObsResponse,
    responseDeserialize: deserialize_sensorService_GetObsResponse,
  },
};

exports.SensorServiceClient = grpc.makeGenericClientConstructor(SensorServiceService);
