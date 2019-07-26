// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var messaging_pb = require('./messaging_pb.js');

function serialize_messagingService_MessagingRequest(arg) {
  if (!(arg instanceof messaging_pb.MessagingRequest)) {
    throw new Error('Expected argument of type messagingService.MessagingRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_messagingService_MessagingRequest(buffer_arg) {
  return messaging_pb.MessagingRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_messagingService_MessagingResponse(arg) {
  if (!(arg instanceof messaging_pb.MessagingResponse)) {
    throw new Error('Expected argument of type messagingService.MessagingResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_messagingService_MessagingResponse(buffer_arg) {
  return messaging_pb.MessagingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// MessagingService消息服务便于开发者在不同设备或应用中实现消息通信广播
var MessagingServiceService = exports.MessagingServiceService = {
  // Messaging为消息发布订阅方法
  messaging: {
    path: '/messagingService.MessagingService/Messaging',
    requestStream: true,
    responseStream: true,
    requestType: messaging_pb.MessagingRequest,
    responseType: messaging_pb.MessagingResponse,
    requestSerialize: serialize_messagingService_MessagingRequest,
    requestDeserialize: deserialize_messagingService_MessagingRequest,
    responseSerialize: serialize_messagingService_MessagingResponse,
    responseDeserialize: deserialize_messagingService_MessagingResponse,
  },
};

exports.MessagingServiceClient = grpc.makeGenericClientConstructor(MessagingServiceService);
