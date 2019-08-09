// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var xcodescanner_pb = require('./xcodescanner_pb.js');

function serialize_xcScannerService_GetScanDataRequest(arg) {
  if (!(arg instanceof xcodescanner_pb.GetScanDataRequest)) {
    throw new Error('Expected argument of type xcScannerService.GetScanDataRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_xcScannerService_GetScanDataRequest(buffer_arg) {
  return xcodescanner_pb.GetScanDataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_xcScannerService_GetScanDataResponse(arg) {
  if (!(arg instanceof xcodescanner_pb.GetScanDataResponse)) {
    throw new Error('Expected argument of type xcScannerService.GetScanDataResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_xcScannerService_GetScanDataResponse(buffer_arg) {
  return xcodescanner_pb.GetScanDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var XCodeScannerServiceService = exports.XCodeScannerServiceService = {
  getScanData: {
    path: '/xcScannerService.XCodeScannerService/GetScanData',
    requestStream: false,
    responseStream: true,
    requestType: xcodescanner_pb.GetScanDataRequest,
    responseType: xcodescanner_pb.GetScanDataResponse,
    requestSerialize: serialize_xcScannerService_GetScanDataRequest,
    requestDeserialize: deserialize_xcScannerService_GetScanDataRequest,
    responseSerialize: serialize_xcScannerService_GetScanDataResponse,
    responseDeserialize: deserialize_xcScannerService_GetScanDataResponse,
  },
};

exports.XCodeScannerServiceClient = grpc.makeGenericClientConstructor(XCodeScannerServiceService);
