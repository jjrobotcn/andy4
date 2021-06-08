// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var group_pb = require('./group_pb.js');
var capability_pb = require('./capability_pb.js');
var google_api_annotations_pb = require('./google/api/annotations_pb.js');

function serialize_handsmotion_DeleteMotionGroupRequest(arg) {
  if (!(arg instanceof group_pb.DeleteMotionGroupRequest)) {
    throw new Error('Expected argument of type handsmotion.DeleteMotionGroupRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_DeleteMotionGroupRequest(buffer_arg) {
  return group_pb.DeleteMotionGroupRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_DeleteMotionGroupResponse(arg) {
  if (!(arg instanceof group_pb.DeleteMotionGroupResponse)) {
    throw new Error('Expected argument of type handsmotion.DeleteMotionGroupResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_DeleteMotionGroupResponse(buffer_arg) {
  return group_pb.DeleteMotionGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_GetMotionGroupRequest(arg) {
  if (!(arg instanceof group_pb.GetMotionGroupRequest)) {
    throw new Error('Expected argument of type handsmotion.GetMotionGroupRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_GetMotionGroupRequest(buffer_arg) {
  return group_pb.GetMotionGroupRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_GetMotionGroupResponse(arg) {
  if (!(arg instanceof group_pb.GetMotionGroupResponse)) {
    throw new Error('Expected argument of type handsmotion.GetMotionGroupResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_GetMotionGroupResponse(buffer_arg) {
  return group_pb.GetMotionGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_ListMotionGroupsRequest(arg) {
  if (!(arg instanceof group_pb.ListMotionGroupsRequest)) {
    throw new Error('Expected argument of type handsmotion.ListMotionGroupsRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_ListMotionGroupsRequest(buffer_arg) {
  return group_pb.ListMotionGroupsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_ListMotionGroupsResponse(arg) {
  if (!(arg instanceof group_pb.ListMotionGroupsResponse)) {
    throw new Error('Expected argument of type handsmotion.ListMotionGroupsResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_ListMotionGroupsResponse(buffer_arg) {
  return group_pb.ListMotionGroupsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_NewMotionGroupRequest(arg) {
  if (!(arg instanceof group_pb.NewMotionGroupRequest)) {
    throw new Error('Expected argument of type handsmotion.NewMotionGroupRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_NewMotionGroupRequest(buffer_arg) {
  return group_pb.NewMotionGroupRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_NewMotionGroupResponse(arg) {
  if (!(arg instanceof group_pb.NewMotionGroupResponse)) {
    throw new Error('Expected argument of type handsmotion.NewMotionGroupResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_NewMotionGroupResponse(buffer_arg) {
  return group_pb.NewMotionGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_UpdateMotionMetaRequest(arg) {
  if (!(arg instanceof group_pb.UpdateMotionMetaRequest)) {
    throw new Error('Expected argument of type handsmotion.UpdateMotionMetaRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_UpdateMotionMetaRequest(buffer_arg) {
  return group_pb.UpdateMotionMetaRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_UpdateMotionMetaResponse(arg) {
  if (!(arg instanceof group_pb.UpdateMotionMetaResponse)) {
    throw new Error('Expected argument of type handsmotion.UpdateMotionMetaResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_UpdateMotionMetaResponse(buffer_arg) {
  return group_pb.UpdateMotionMetaResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_UpdateMotionScriptsRequest(arg) {
  if (!(arg instanceof group_pb.UpdateMotionScriptsRequest)) {
    throw new Error('Expected argument of type handsmotion.UpdateMotionScriptsRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_UpdateMotionScriptsRequest(buffer_arg) {
  return group_pb.UpdateMotionScriptsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_handsmotion_UpdateMotionScriptsResponse(arg) {
  if (!(arg instanceof group_pb.UpdateMotionScriptsResponse)) {
    throw new Error('Expected argument of type handsmotion.UpdateMotionScriptsResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_handsmotion_UpdateMotionScriptsResponse(buffer_arg) {
  return group_pb.UpdateMotionScriptsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var GroupManagementService = exports.GroupManagementService = {
  // 新建动作分组
  newMotionGroup: {
    path: '/handsmotion.GroupManagement/NewMotionGroup',
    requestStream: false,
    responseStream: false,
    requestType: group_pb.NewMotionGroupRequest,
    responseType: group_pb.NewMotionGroupResponse,
    requestSerialize: serialize_handsmotion_NewMotionGroupRequest,
    requestDeserialize: deserialize_handsmotion_NewMotionGroupRequest,
    responseSerialize: serialize_handsmotion_NewMotionGroupResponse,
    responseDeserialize: deserialize_handsmotion_NewMotionGroupResponse,
  },
  // 获取所有动作分组列表
  listMotionGroups: {
    path: '/handsmotion.GroupManagement/ListMotionGroups',
    requestStream: false,
    responseStream: false,
    requestType: group_pb.ListMotionGroupsRequest,
    responseType: group_pb.ListMotionGroupsResponse,
    requestSerialize: serialize_handsmotion_ListMotionGroupsRequest,
    requestDeserialize: deserialize_handsmotion_ListMotionGroupsRequest,
    responseSerialize: serialize_handsmotion_ListMotionGroupsResponse,
    responseDeserialize: deserialize_handsmotion_ListMotionGroupsResponse,
  },
  // 删除动作分组
  deleteMotionGroup: {
    path: '/handsmotion.GroupManagement/DeleteMotionGroup',
    requestStream: false,
    responseStream: false,
    requestType: group_pb.DeleteMotionGroupRequest,
    responseType: group_pb.DeleteMotionGroupResponse,
    requestSerialize: serialize_handsmotion_DeleteMotionGroupRequest,
    requestDeserialize: deserialize_handsmotion_DeleteMotionGroupRequest,
    responseSerialize: serialize_handsmotion_DeleteMotionGroupResponse,
    responseDeserialize: deserialize_handsmotion_DeleteMotionGroupResponse,
  },
  // 获取动作分组
  getMotionGroup: {
    path: '/handsmotion.GroupManagement/GetMotionGroup',
    requestStream: false,
    responseStream: false,
    requestType: group_pb.GetMotionGroupRequest,
    responseType: group_pb.GetMotionGroupResponse,
    requestSerialize: serialize_handsmotion_GetMotionGroupRequest,
    requestDeserialize: deserialize_handsmotion_GetMotionGroupRequest,
    responseSerialize: serialize_handsmotion_GetMotionGroupResponse,
    responseDeserialize: deserialize_handsmotion_GetMotionGroupResponse,
  },
  // 更新动作分组Meta
  updateMotionGroupMeta: {
    path: '/handsmotion.GroupManagement/UpdateMotionGroupMeta',
    requestStream: false,
    responseStream: false,
    requestType: group_pb.UpdateMotionMetaRequest,
    responseType: group_pb.UpdateMotionMetaResponse,
    requestSerialize: serialize_handsmotion_UpdateMotionMetaRequest,
    requestDeserialize: deserialize_handsmotion_UpdateMotionMetaRequest,
    responseSerialize: serialize_handsmotion_UpdateMotionMetaResponse,
    responseDeserialize: deserialize_handsmotion_UpdateMotionMetaResponse,
  },
  // 更新动作分组Scripts
  updateMotionGroupScripts: {
    path: '/handsmotion.GroupManagement/UpdateMotionGroupScripts',
    requestStream: false,
    responseStream: false,
    requestType: group_pb.UpdateMotionScriptsRequest,
    responseType: group_pb.UpdateMotionScriptsResponse,
    requestSerialize: serialize_handsmotion_UpdateMotionScriptsRequest,
    requestDeserialize: deserialize_handsmotion_UpdateMotionScriptsRequest,
    responseSerialize: serialize_handsmotion_UpdateMotionScriptsResponse,
    responseDeserialize: deserialize_handsmotion_UpdateMotionScriptsResponse,
  },
};

exports.GroupManagementClient = grpc.makeGenericClientConstructor(GroupManagementService);
