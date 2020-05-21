// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kvstore_pb = require('./kvstore_pb.js');

function serialize_kvstore_DeleteRequest(arg) {
  if (!(arg instanceof kvstore_pb.DeleteRequest)) {
    throw new Error('Expected argument of type kvstore.DeleteRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_kvstore_DeleteRequest(buffer_arg) {
  return kvstore_pb.DeleteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kvstore_DeleteResponse(arg) {
  if (!(arg instanceof kvstore_pb.DeleteResponse)) {
    throw new Error('Expected argument of type kvstore.DeleteResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_kvstore_DeleteResponse(buffer_arg) {
  return kvstore_pb.DeleteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kvstore_GetPrefixRequest(arg) {
  if (!(arg instanceof kvstore_pb.GetPrefixRequest)) {
    throw new Error('Expected argument of type kvstore.GetPrefixRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_kvstore_GetPrefixRequest(buffer_arg) {
  return kvstore_pb.GetPrefixRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kvstore_GetPrefixResponse(arg) {
  if (!(arg instanceof kvstore_pb.GetPrefixResponse)) {
    throw new Error('Expected argument of type kvstore.GetPrefixResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_kvstore_GetPrefixResponse(buffer_arg) {
  return kvstore_pb.GetPrefixResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kvstore_GetPrefixStreamRequest(arg) {
  if (!(arg instanceof kvstore_pb.GetPrefixStreamRequest)) {
    throw new Error('Expected argument of type kvstore.GetPrefixStreamRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_kvstore_GetPrefixStreamRequest(buffer_arg) {
  return kvstore_pb.GetPrefixStreamRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kvstore_GetPrefixStreamResponse(arg) {
  if (!(arg instanceof kvstore_pb.GetPrefixStreamResponse)) {
    throw new Error('Expected argument of type kvstore.GetPrefixStreamResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_kvstore_GetPrefixStreamResponse(buffer_arg) {
  return kvstore_pb.GetPrefixStreamResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kvstore_GetRequest(arg) {
  if (!(arg instanceof kvstore_pb.GetRequest)) {
    throw new Error('Expected argument of type kvstore.GetRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_kvstore_GetRequest(buffer_arg) {
  return kvstore_pb.GetRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kvstore_GetResponse(arg) {
  if (!(arg instanceof kvstore_pb.GetResponse)) {
    throw new Error('Expected argument of type kvstore.GetResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_kvstore_GetResponse(buffer_arg) {
  return kvstore_pb.GetResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kvstore_PutRequest(arg) {
  if (!(arg instanceof kvstore_pb.PutRequest)) {
    throw new Error('Expected argument of type kvstore.PutRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_kvstore_PutRequest(buffer_arg) {
  return kvstore_pb.PutRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kvstore_PutResponse(arg) {
  if (!(arg instanceof kvstore_pb.PutResponse)) {
    throw new Error('Expected argument of type kvstore.PutResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_kvstore_PutResponse(buffer_arg) {
  return kvstore_pb.PutResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// kvstore.KVStore Key-Value键值存储服务
var KVStoreService = exports.KVStoreService = {
  // Put 创建kv键值对
  // 若key已存在将更新value值
  put: {
    path: '/kvstore.KVStore/Put',
    requestStream: false,
    responseStream: false,
    requestType: kvstore_pb.PutRequest,
    responseType: kvstore_pb.PutResponse,
    requestSerialize: serialize_kvstore_PutRequest,
    requestDeserialize: deserialize_kvstore_PutRequest,
    responseSerialize: serialize_kvstore_PutResponse,
    responseDeserialize: deserialize_kvstore_PutResponse,
  },
  // Get 获取key的value
  // 若key不存在则返回gRPC错误:NotFound
  get: {
    path: '/kvstore.KVStore/Get',
    requestStream: false,
    responseStream: false,
    requestType: kvstore_pb.GetRequest,
    responseType: kvstore_pb.GetResponse,
    requestSerialize: serialize_kvstore_GetRequest,
    requestDeserialize: deserialize_kvstore_GetRequest,
    responseSerialize: serialize_kvstore_GetResponse,
    responseDeserialize: deserialize_kvstore_GetResponse,
  },
  // GetPrefix 获取符合key_prefix的多个kv键值对
  getPrefix: {
    path: '/kvstore.KVStore/GetPrefix',
    requestStream: false,
    responseStream: false,
    requestType: kvstore_pb.GetPrefixRequest,
    responseType: kvstore_pb.GetPrefixResponse,
    requestSerialize: serialize_kvstore_GetPrefixRequest,
    requestDeserialize: deserialize_kvstore_GetPrefixRequest,
    responseSerialize: serialize_kvstore_GetPrefixResponse,
    responseDeserialize: deserialize_kvstore_GetPrefixResponse,
  },
  // GetPrefixStream gRPC stream方式获取符合key_prefix的多个kv键值对
  getPrefixStream: {
    path: '/kvstore.KVStore/GetPrefixStream',
    requestStream: false,
    responseStream: true,
    requestType: kvstore_pb.GetPrefixStreamRequest,
    responseType: kvstore_pb.GetPrefixStreamResponse,
    requestSerialize: serialize_kvstore_GetPrefixStreamRequest,
    requestDeserialize: deserialize_kvstore_GetPrefixStreamRequest,
    responseSerialize: serialize_kvstore_GetPrefixStreamResponse,
    responseDeserialize: deserialize_kvstore_GetPrefixStreamResponse,
  },
  // Delete 删除kv键值对
  delete: {
    path: '/kvstore.KVStore/Delete',
    requestStream: false,
    responseStream: false,
    requestType: kvstore_pb.DeleteRequest,
    responseType: kvstore_pb.DeleteResponse,
    requestSerialize: serialize_kvstore_DeleteRequest,
    requestDeserialize: deserialize_kvstore_DeleteRequest,
    responseSerialize: serialize_kvstore_DeleteResponse,
    responseDeserialize: deserialize_kvstore_DeleteResponse,
  },
};

exports.KVStoreClient = grpc.makeGenericClientConstructor(KVStoreService);
