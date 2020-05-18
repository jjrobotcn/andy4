// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var idcard_pb = require('./idcard_pb.js');

function serialize_idCardService_GetIdInfoRequest(arg) {
  if (!(arg instanceof idcard_pb.GetIdInfoRequest)) {
    throw new Error('Expected argument of type idCardService.GetIdInfoRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_idCardService_GetIdInfoRequest(buffer_arg) {
  return idcard_pb.GetIdInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_idCardService_GetIdInfoResponse(arg) {
  if (!(arg instanceof idcard_pb.GetIdInfoResponse)) {
    throw new Error('Expected argument of type idCardService.GetIdInfoResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_idCardService_GetIdInfoResponse(buffer_arg) {
  return idcard_pb.GetIdInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var IDCardServiceService = exports.IDCardServiceService = {
  // 获取读卡数据流
  getIdInfo: {
    path: '/idCardService.IDCardService/GetIdInfo',
    requestStream: false,
    responseStream: true,
    requestType: idcard_pb.GetIdInfoRequest,
    responseType: idcard_pb.GetIdInfoResponse,
    requestSerialize: serialize_idCardService_GetIdInfoRequest,
    requestDeserialize: deserialize_idCardService_GetIdInfoRequest,
    responseSerialize: serialize_idCardService_GetIdInfoResponse,
    responseDeserialize: deserialize_idCardService_GetIdInfoResponse,
  },
};

exports.IDCardServiceClient = grpc.makeGenericClientConstructor(IDCardServiceService);
