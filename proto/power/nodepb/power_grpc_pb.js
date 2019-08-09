// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var power_pb = require('./power_pb.js');

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
};

exports.PowerServiceClient = grpc.makeGenericClientConstructor(PowerServiceService);
