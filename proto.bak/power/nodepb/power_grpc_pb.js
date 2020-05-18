// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var power_pb = require('./power_pb.js');
var google_api_annotations_pb = require('./google/api/annotations_pb.js');

function serialize_powerService_GetPowerStatusRequest(arg) {
  if (!(arg instanceof power_pb.GetPowerStatusRequest)) {
    throw new Error('Expected argument of type powerService.GetPowerStatusRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_powerService_GetPowerStatusRequest(buffer_arg) {
  return power_pb.GetPowerStatusRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_powerService_GetPowerStatusResponse(arg) {
  if (!(arg instanceof power_pb.GetPowerStatusResponse)) {
    throw new Error('Expected argument of type powerService.GetPowerStatusResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_powerService_GetPowerStatusResponse(buffer_arg) {
  return power_pb.GetPowerStatusResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_powerService_RebootRequest(arg) {
  if (!(arg instanceof power_pb.RebootRequest)) {
    throw new Error('Expected argument of type powerService.RebootRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_powerService_RebootRequest(buffer_arg) {
  return power_pb.RebootRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_powerService_RebootResponse(arg) {
  if (!(arg instanceof power_pb.RebootResponse)) {
    throw new Error('Expected argument of type powerService.RebootResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_powerService_RebootResponse(buffer_arg) {
  return power_pb.RebootResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_powerService_StatesRequest(arg) {
  if (!(arg instanceof power_pb.StatesRequest)) {
    throw new Error('Expected argument of type powerService.StatesRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_powerService_StatesRequest(buffer_arg) {
  return power_pb.StatesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_powerService_StatesResponse(arg) {
  if (!(arg instanceof power_pb.StatesResponse)) {
    throw new Error('Expected argument of type powerService.StatesResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_powerService_StatesResponse(buffer_arg) {
  return power_pb.StatesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_powerService_SwitchRequest(arg) {
  if (!(arg instanceof power_pb.SwitchRequest)) {
    throw new Error('Expected argument of type powerService.SwitchRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_powerService_SwitchRequest(buffer_arg) {
  return power_pb.SwitchRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_powerService_SwitchResponse(arg) {
  if (!(arg instanceof power_pb.SwitchResponse)) {
    throw new Error('Expected argument of type powerService.SwitchResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_powerService_SwitchResponse(buffer_arg) {
  return power_pb.SwitchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var PowerServiceService = exports.PowerServiceService = {
  // 获取电源状态数据流
  getPowerStatus: {
    path: '/powerService.PowerService/GetPowerStatus',
    requestStream: false,
    responseStream: true,
    requestType: power_pb.GetPowerStatusRequest,
    responseType: power_pb.GetPowerStatusResponse,
    requestSerialize: serialize_powerService_GetPowerStatusRequest,
    requestDeserialize: deserialize_powerService_GetPowerStatusRequest,
    responseSerialize: serialize_powerService_GetPowerStatusResponse,
    responseDeserialize: deserialize_powerService_GetPowerStatusResponse,
  },
  // 对各模块的电源进行断电方式重启
  reboot: {
    path: '/powerService.PowerService/Reboot',
    requestStream: false,
    responseStream: false,
    requestType: power_pb.RebootRequest,
    responseType: power_pb.RebootResponse,
    requestSerialize: serialize_powerService_RebootRequest,
    requestDeserialize: deserialize_powerService_RebootRequest,
    responseSerialize: serialize_powerService_RebootResponse,
    responseDeserialize: deserialize_powerService_RebootResponse,
  },
  // 获取所有电源模块状态
  states: {
    path: '/powerService.PowerService/States',
    requestStream: false,
    responseStream: false,
    requestType: power_pb.StatesRequest,
    responseType: power_pb.StatesResponse,
    requestSerialize: serialize_powerService_StatesRequest,
    requestDeserialize: deserialize_powerService_StatesRequest,
    responseSerialize: serialize_powerService_StatesResponse,
    responseDeserialize: deserialize_powerService_StatesResponse,
  },
  // 控制模块供电开关
  switch: {
    path: '/powerService.PowerService/Switch',
    requestStream: false,
    responseStream: false,
    requestType: power_pb.SwitchRequest,
    responseType: power_pb.SwitchResponse,
    requestSerialize: serialize_powerService_SwitchRequest,
    requestDeserialize: deserialize_powerService_SwitchRequest,
    responseSerialize: serialize_powerService_SwitchResponse,
    responseDeserialize: deserialize_powerService_SwitchResponse,
  },
};

exports.PowerServiceClient = grpc.makeGenericClientConstructor(PowerServiceService);
