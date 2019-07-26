// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var messaging_pb = require('./messaging_pb.js');

function serialize_messaging_MessagingRequest(arg) {
  if (!(arg instanceof messaging_pb.MessagingRequest)) {
    throw new Error('Expected argument of type messaging.MessagingRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_messaging_MessagingRequest(buffer_arg) {
  return messaging_pb.MessagingRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_messaging_MessagingResponse(arg) {
  if (!(arg instanceof messaging_pb.MessagingResponse)) {
    throw new Error('Expected argument of type messaging.MessagingResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_messaging_MessagingResponse(buffer_arg) {
  return messaging_pb.MessagingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// MessagingService消息服务便于开发者在不同设备或应用中实现消息通信广播
var MessagingServiceService = exports.MessagingServiceService = {
  // Messaging为消息发布订阅方法
  messaging: {
    path: '/messaging.MessagingService/Messaging',
    requestStream: true,
    responseStream: true,
    requestType: messaging_pb.MessagingRequest,
    responseType: messaging_pb.MessagingResponse,
    requestSerialize: serialize_messaging_MessagingRequest,
    requestDeserialize: deserialize_messaging_MessagingRequest,
    responseSerialize: serialize_messaging_MessagingResponse,
    responseDeserialize: deserialize_messaging_MessagingResponse,
  },
};

exports.MessagingServiceClient = grpc.makeGenericClientConstructor(MessagingServiceService);
