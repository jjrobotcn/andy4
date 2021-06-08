// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var capability_pb = require('./capability_pb.js');

function serialize_handsmotion_AbsoluteMoveRequest(arg) {
  if (!(arg instanceof capability_pb.AbsoluteMoveRequest)) {
    throw new Error('Expected argument of type handsmotion.AbsoluteMoveRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_AbsoluteMoveRequest(buffer_arg) {
  return capability_pb.AbsoluteMoveRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_AbsoluteMoveResponse(arg) {
  if (!(arg instanceof capability_pb.AbsoluteMoveResponse)) {
    throw new Error('Expected argument of type handsmotion.AbsoluteMoveResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_AbsoluteMoveResponse(buffer_arg) {
  return capability_pb.AbsoluteMoveResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_ArmAdjustmentRequest(arg) {
  if (!(arg instanceof capability_pb.ArmAdjustmentRequest)) {
    throw new Error('Expected argument of type handsmotion.ArmAdjustmentRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_ArmAdjustmentRequest(buffer_arg) {
  return capability_pb.ArmAdjustmentRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_ArmAdjustmentResponse(arg) {
  if (!(arg instanceof capability_pb.ArmAdjustmentResponse)) {
    throw new Error('Expected argument of type handsmotion.ArmAdjustmentResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_ArmAdjustmentResponse(buffer_arg) {
  return capability_pb.ArmAdjustmentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_FingersAdjustmentRequest(arg) {
  if (!(arg instanceof capability_pb.FingersAdjustmentRequest)) {
    throw new Error('Expected argument of type handsmotion.FingersAdjustmentRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_FingersAdjustmentRequest(buffer_arg) {
  return capability_pb.FingersAdjustmentRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_FingersAdjustmentResponse(arg) {
  if (!(arg instanceof capability_pb.FingersAdjustmentResponse)) {
    throw new Error('Expected argument of type handsmotion.FingersAdjustmentResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_FingersAdjustmentResponse(buffer_arg) {
  return capability_pb.FingersAdjustmentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_GetAbsolutePositionRequest(arg) {
  if (!(arg instanceof capability_pb.GetAbsolutePositionRequest)) {
    throw new Error('Expected argument of type handsmotion.GetAbsolutePositionRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_GetAbsolutePositionRequest(buffer_arg) {
  return capability_pb.GetAbsolutePositionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_GetAbsolutePositionResponse(arg) {
  if (!(arg instanceof capability_pb.GetAbsolutePositionResponse)) {
    throw new Error('Expected argument of type handsmotion.GetAbsolutePositionResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_GetAbsolutePositionResponse(buffer_arg) {
  return capability_pb.GetAbsolutePositionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_MarkAsOriginalPositionRequest(arg) {
  if (!(arg instanceof capability_pb.MarkAsOriginalPositionRequest)) {
    throw new Error('Expected argument of type handsmotion.MarkAsOriginalPositionRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_MarkAsOriginalPositionRequest(buffer_arg) {
  return capability_pb.MarkAsOriginalPositionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_MarkAsOriginalPositionResponse(arg) {
  if (!(arg instanceof capability_pb.MarkAsOriginalPositionResponse)) {
    throw new Error('Expected argument of type handsmotion.MarkAsOriginalPositionResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_MarkAsOriginalPositionResponse(buffer_arg) {
  return capability_pb.MarkAsOriginalPositionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var CapabilityService = exports.CapabilityService = {
  // 调整手指动作的开合与重置
  fingersAdjustment: {
    path: '/handsmotion.Capability/FingersAdjustment',
    requestStream: false,
    responseStream: false,
    requestType: capability_pb.FingersAdjustmentRequest,
    responseType: capability_pb.FingersAdjustmentResponse,
    requestSerialize: serialize_handsmotion_FingersAdjustmentRequest,
    requestDeserialize: deserialize_handsmotion_FingersAdjustmentRequest,
    responseSerialize: serialize_handsmotion_FingersAdjustmentResponse,
    responseDeserialize: deserialize_handsmotion_FingersAdjustmentResponse,
  },
  // 调整手臂位置重置、使能与失能,失能后可通过外力移动至相应位置后通过使能恢复锁定当前位置
  armAdjustment: {
    path: '/handsmotion.Capability/ArmAdjustment',
    requestStream: false,
    responseStream: false,
    requestType: capability_pb.ArmAdjustmentRequest,
    responseType: capability_pb.ArmAdjustmentResponse,
    requestSerialize: serialize_handsmotion_ArmAdjustmentRequest,
    requestDeserialize: deserialize_handsmotion_ArmAdjustmentRequest,
    responseSerialize: serialize_handsmotion_ArmAdjustmentResponse,
    responseDeserialize: deserialize_handsmotion_ArmAdjustmentResponse,
  },
  // 标记当前位置为初始位置,所有位置数据将基于此点进行计算
  markAsOriginalPosition: {
    path: '/handsmotion.Capability/MarkAsOriginalPosition',
    requestStream: false,
    responseStream: false,
    requestType: capability_pb.MarkAsOriginalPositionRequest,
    responseType: capability_pb.MarkAsOriginalPositionResponse,
    requestSerialize: serialize_handsmotion_MarkAsOriginalPositionRequest,
    requestDeserialize: deserialize_handsmotion_MarkAsOriginalPositionRequest,
    responseSerialize: serialize_handsmotion_MarkAsOriginalPositionResponse,
    responseDeserialize: deserialize_handsmotion_MarkAsOriginalPositionResponse,
  },
  // 获取当前绝对位置
  getAbsolutePosition: {
    path: '/handsmotion.Capability/GetAbsolutePosition',
    requestStream: false,
    responseStream: false,
    requestType: capability_pb.GetAbsolutePositionRequest,
    responseType: capability_pb.GetAbsolutePositionResponse,
    requestSerialize: serialize_handsmotion_GetAbsolutePositionRequest,
    requestDeserialize: deserialize_handsmotion_GetAbsolutePositionRequest,
    responseSerialize: serialize_handsmotion_GetAbsolutePositionResponse,
    responseDeserialize: deserialize_handsmotion_GetAbsolutePositionResponse,
  },
  // 绝对位置移动
  absoluteMove: {
    path: '/handsmotion.Capability/AbsoluteMove',
    requestStream: false,
    responseStream: false,
    requestType: capability_pb.AbsoluteMoveRequest,
    responseType: capability_pb.AbsoluteMoveResponse,
    requestSerialize: serialize_handsmotion_AbsoluteMoveRequest,
    requestDeserialize: deserialize_handsmotion_AbsoluteMoveRequest,
    responseSerialize: serialize_handsmotion_AbsoluteMoveResponse,
    responseDeserialize: deserialize_handsmotion_AbsoluteMoveResponse,
  },
};

exports.CapabilityClient = grpc.makeGenericClientConstructor(CapabilityService);
