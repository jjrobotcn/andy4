// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var player_pb = require('./player_pb.js');
var google_api_annotations_pb = require('./google/api/annotations_pb.js');

function serialize_handsmotion_OnStateChangeRequest(arg) {
  if (!(arg instanceof player_pb.OnStateChangeRequest)) {
    throw new Error('Expected argument of type handsmotion.OnStateChangeRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_OnStateChangeRequest(buffer_arg) {
  return player_pb.OnStateChangeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_OnStateChangeResponse(arg) {
  if (!(arg instanceof player_pb.OnStateChangeResponse)) {
    throw new Error('Expected argument of type handsmotion.OnStateChangeResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_OnStateChangeResponse(buffer_arg) {
  return player_pb.OnStateChangeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_PlayRequest(arg) {
  if (!(arg instanceof player_pb.PlayRequest)) {
    throw new Error('Expected argument of type handsmotion.PlayRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_PlayRequest(buffer_arg) {
  return player_pb.PlayRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_PlayResponse(arg) {
  if (!(arg instanceof player_pb.PlayResponse)) {
    throw new Error('Expected argument of type handsmotion.PlayResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_PlayResponse(buffer_arg) {
  return player_pb.PlayResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_PlaylistRequest(arg) {
  if (!(arg instanceof player_pb.PlaylistRequest)) {
    throw new Error('Expected argument of type handsmotion.PlaylistRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_PlaylistRequest(buffer_arg) {
  return player_pb.PlaylistRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_PlaylistResponse(arg) {
  if (!(arg instanceof player_pb.PlaylistResponse)) {
    throw new Error('Expected argument of type handsmotion.PlaylistResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_PlaylistResponse(buffer_arg) {
  return player_pb.PlaylistResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_ResetRequest(arg) {
  if (!(arg instanceof player_pb.ResetRequest)) {
    throw new Error('Expected argument of type handsmotion.ResetRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_ResetRequest(buffer_arg) {
  return player_pb.ResetRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_ResetResponse(arg) {
  if (!(arg instanceof player_pb.ResetResponse)) {
    throw new Error('Expected argument of type handsmotion.ResetResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_ResetResponse(buffer_arg) {
  return player_pb.ResetResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_StateRequest(arg) {
  if (!(arg instanceof player_pb.StateRequest)) {
    throw new Error('Expected argument of type handsmotion.StateRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_StateRequest(buffer_arg) {
  return player_pb.StateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_StateResponse(arg) {
  if (!(arg instanceof player_pb.StateResponse)) {
    throw new Error('Expected argument of type handsmotion.StateResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_StateResponse(buffer_arg) {
  return player_pb.StateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_StopRequest(arg) {
  if (!(arg instanceof player_pb.StopRequest)) {
    throw new Error('Expected argument of type handsmotion.StopRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_StopRequest(buffer_arg) {
  return player_pb.StopRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_StopResponse(arg) {
  if (!(arg instanceof player_pb.StopResponse)) {
    throw new Error('Expected argument of type handsmotion.StopResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_StopResponse(buffer_arg) {
  return player_pb.StopResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var PlayerService = exports.PlayerService = {
  // Play为播放动作组对象方法
  play: {
    path: '/handsmotion.Player/Play',
    requestStream: false,
    responseStream: false,
    requestType: player_pb.PlayRequest,
    responseType: player_pb.PlayResponse,
    requestSerialize: serialize_handsmotion_PlayRequest,
    requestDeserialize: deserialize_handsmotion_PlayRequest,
    responseSerialize: serialize_handsmotion_PlayResponse,
    responseDeserialize: deserialize_handsmotion_PlayResponse,
  },
  // Stop为停止动作组对象方法
  stop: {
    path: '/handsmotion.Player/Stop',
    requestStream: false,
    responseStream: false,
    requestType: player_pb.StopRequest,
    responseType: player_pb.StopResponse,
    requestSerialize: serialize_handsmotion_StopRequest,
    requestDeserialize: deserialize_handsmotion_StopRequest,
    responseSerialize: serialize_handsmotion_StopResponse,
    responseDeserialize: deserialize_handsmotion_StopResponse,
  },
  // Reset为重置初始状态方法
  reset: {
    path: '/handsmotion.Player/Reset',
    requestStream: false,
    responseStream: false,
    requestType: player_pb.ResetRequest,
    responseType: player_pb.ResetResponse,
    requestSerialize: serialize_handsmotion_ResetRequest,
    requestDeserialize: deserialize_handsmotion_ResetRequest,
    responseSerialize: serialize_handsmotion_ResetResponse,
    responseDeserialize: deserialize_handsmotion_ResetResponse,
  },
  // Playlist为获取动作组对象列表方法
  playlist: {
    path: '/handsmotion.Player/Playlist',
    requestStream: false,
    responseStream: false,
    requestType: player_pb.PlaylistRequest,
    responseType: player_pb.PlaylistResponse,
    requestSerialize: serialize_handsmotion_PlaylistRequest,
    requestDeserialize: deserialize_handsmotion_PlaylistRequest,
    responseSerialize: serialize_handsmotion_PlaylistResponse,
    responseDeserialize: deserialize_handsmotion_PlaylistResponse,
  },
  // State为查询当前player状态方法
  state: {
    path: '/handsmotion.Player/State',
    requestStream: false,
    responseStream: false,
    requestType: player_pb.StateRequest,
    responseType: player_pb.StateResponse,
    requestSerialize: serialize_handsmotion_StateRequest,
    requestDeserialize: deserialize_handsmotion_StateRequest,
    responseSerialize: serialize_handsmotion_StateResponse,
    responseDeserialize: deserialize_handsmotion_StateResponse,
  },
  // OnStateChange为监听State改变方法，当State状态改变时将流式返回State状态数据
  onStateChange: {
    path: '/handsmotion.Player/OnStateChange',
    requestStream: false,
    responseStream: true,
    requestType: player_pb.OnStateChangeRequest,
    responseType: player_pb.OnStateChangeResponse,
    requestSerialize: serialize_handsmotion_OnStateChangeRequest,
    requestDeserialize: deserialize_handsmotion_OnStateChangeRequest,
    responseSerialize: serialize_handsmotion_OnStateChangeResponse,
    responseDeserialize: deserialize_handsmotion_OnStateChangeResponse,
  },
};

exports.PlayerClient = grpc.makeGenericClientConstructor(PlayerService);
