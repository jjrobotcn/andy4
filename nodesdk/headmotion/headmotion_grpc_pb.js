// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var headmotion_pb = require('./headmotion_pb.js');

function serialize_motionService_DeleteGroupsRequest(arg) {
  if (!(arg instanceof headmotion_pb.DeleteGroupsRequest)) {
    throw new Error('Expected argument of type motionService.DeleteGroupsRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_motionService_DeleteGroupsRequest(buffer_arg) {
  return headmotion_pb.DeleteGroupsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_motionService_DeleteGroupsResponse(arg) {
  if (!(arg instanceof headmotion_pb.DeleteGroupsResponse)) {
    throw new Error('Expected argument of type motionService.DeleteGroupsResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_motionService_DeleteGroupsResponse(buffer_arg) {
  return headmotion_pb.DeleteGroupsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_motionService_GetPositionRequest(arg) {
  if (!(arg instanceof headmotion_pb.GetPositionRequest)) {
    throw new Error('Expected argument of type motionService.GetPositionRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_motionService_GetPositionRequest(buffer_arg) {
  return headmotion_pb.GetPositionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_motionService_GetPositionResponse(arg) {
  if (!(arg instanceof headmotion_pb.GetPositionResponse)) {
    throw new Error('Expected argument of type motionService.GetPositionResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_motionService_GetPositionResponse(buffer_arg) {
  return headmotion_pb.GetPositionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_motionService_ListGroupTargetsRequest(arg) {
  if (!(arg instanceof headmotion_pb.ListGroupTargetsRequest)) {
    throw new Error('Expected argument of type motionService.ListGroupTargetsRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_motionService_ListGroupTargetsRequest(buffer_arg) {
  return headmotion_pb.ListGroupTargetsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_motionService_ListGroupTargetsResponse(arg) {
  if (!(arg instanceof headmotion_pb.ListGroupTargetsResponse)) {
    throw new Error('Expected argument of type motionService.ListGroupTargetsResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_motionService_ListGroupTargetsResponse(buffer_arg) {
  return headmotion_pb.ListGroupTargetsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_motionService_ListGroupsRequest(arg) {
  if (!(arg instanceof headmotion_pb.ListGroupsRequest)) {
    throw new Error('Expected argument of type motionService.ListGroupsRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_motionService_ListGroupsRequest(buffer_arg) {
  return headmotion_pb.ListGroupsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_motionService_ListGroupsResponse(arg) {
  if (!(arg instanceof headmotion_pb.ListGroupsResponse)) {
    throw new Error('Expected argument of type motionService.ListGroupsResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_motionService_ListGroupsResponse(buffer_arg) {
  return headmotion_pb.ListGroupsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_motionService_MoveToRequest(arg) {
  if (!(arg instanceof headmotion_pb.MoveToRequest)) {
    throw new Error('Expected argument of type motionService.MoveToRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_motionService_MoveToRequest(buffer_arg) {
  return headmotion_pb.MoveToRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_motionService_MoveToResponse(arg) {
  if (!(arg instanceof headmotion_pb.MoveToResponse)) {
    throw new Error('Expected argument of type motionService.MoveToResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_motionService_MoveToResponse(buffer_arg) {
  return headmotion_pb.MoveToResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_motionService_NewGroupRequest(arg) {
  if (!(arg instanceof headmotion_pb.NewGroupRequest)) {
    throw new Error('Expected argument of type motionService.NewGroupRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_motionService_NewGroupRequest(buffer_arg) {
  return headmotion_pb.NewGroupRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_motionService_NewGroupResponse(arg) {
  if (!(arg instanceof headmotion_pb.NewGroupResponse)) {
    throw new Error('Expected argument of type motionService.NewGroupResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_motionService_NewGroupResponse(buffer_arg) {
  return headmotion_pb.NewGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_motionService_PositioningDataRequest(arg) {
  if (!(arg instanceof headmotion_pb.PositioningDataRequest)) {
    throw new Error('Expected argument of type motionService.PositioningDataRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_motionService_PositioningDataRequest(buffer_arg) {
  return headmotion_pb.PositioningDataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_motionService_PositioningDataResponse(arg) {
  if (!(arg instanceof headmotion_pb.PositioningDataResponse)) {
    throw new Error('Expected argument of type motionService.PositioningDataResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_motionService_PositioningDataResponse(buffer_arg) {
  return headmotion_pb.PositioningDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_motionService_UpdateGroupRequest(arg) {
  if (!(arg instanceof headmotion_pb.UpdateGroupRequest)) {
    throw new Error('Expected argument of type motionService.UpdateGroupRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_motionService_UpdateGroupRequest(buffer_arg) {
  return headmotion_pb.UpdateGroupRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_motionService_UpdateGroupResponse(arg) {
  if (!(arg instanceof headmotion_pb.UpdateGroupResponse)) {
    throw new Error('Expected argument of type motionService.UpdateGroupResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_motionService_UpdateGroupResponse(buffer_arg) {
  return headmotion_pb.UpdateGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_motionService_UpdateGroupTargetsRequest(arg) {
  if (!(arg instanceof headmotion_pb.UpdateGroupTargetsRequest)) {
    throw new Error('Expected argument of type motionService.UpdateGroupTargetsRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_motionService_UpdateGroupTargetsRequest(buffer_arg) {
  return headmotion_pb.UpdateGroupTargetsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_motionService_UpdateGroupTargetsResponse(arg) {
  if (!(arg instanceof headmotion_pb.UpdateGroupTargetsResponse)) {
    throw new Error('Expected argument of type motionService.UpdateGroupTargetsResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_motionService_UpdateGroupTargetsResponse(buffer_arg) {
  return headmotion_pb.UpdateGroupTargetsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// motionService.MotionService 头部运动功能的管理
//
// motionService包含头部与手部（计划）的运动功能管理，
// 目前手部运动功能将拆分为后续计划的handsmotion服务。
// 为维护服务的一致性，保留motionService，但内部仅包含头部运动的设计。
//
// 开发管理平台功能参考: http://10.10.10.2/motion/head/
var MotionServiceService = exports.MotionServiceService = {
  // MoveTo 头部的移动
  //
  // 通过预设组或定位方式移动头部
  moveTo: {
    path: '/motionService.MotionService/MoveTo',
    requestStream: false,
    responseStream: false,
    requestType: headmotion_pb.MoveToRequest,
    responseType: headmotion_pb.MoveToResponse,
    requestSerialize: serialize_motionService_MoveToRequest,
    requestDeserialize: deserialize_motionService_MoveToRequest,
    responseSerialize: serialize_motionService_MoveToResponse,
    responseDeserialize: deserialize_motionService_MoveToResponse,
  },
  // PositioningData 监听头部实时定位数据
  //
  // 用于持续获取当前主轴与交叉轴的实时位置
  //
  // 需要通过外力控制头部位置时可通过PositioningDataRequest.disability=true调节，
  // 详见PositioningDataRequest
  positioningData: {
    path: '/motionService.MotionService/PositioningData',
    requestStream: false,
    responseStream: true,
    requestType: headmotion_pb.PositioningDataRequest,
    responseType: headmotion_pb.PositioningDataResponse,
    requestSerialize: serialize_motionService_PositioningDataRequest,
    requestDeserialize: deserialize_motionService_PositioningDataRequest,
    responseSerialize: serialize_motionService_PositioningDataResponse,
    responseDeserialize: deserialize_motionService_PositioningDataResponse,
  },
  // GetPosition 获取当前头部定位数据
  //
  // 用于获取当前主轴与交叉轴的实时位置
  getPosition: {
    path: '/motionService.MotionService/GetPosition',
    requestStream: false,
    responseStream: false,
    requestType: headmotion_pb.GetPositionRequest,
    responseType: headmotion_pb.GetPositionResponse,
    requestSerialize: serialize_motionService_GetPositionRequest,
    requestDeserialize: deserialize_motionService_GetPositionRequest,
    responseSerialize: serialize_motionService_GetPositionResponse,
    responseDeserialize: deserialize_motionService_GetPositionResponse,
  },
  // NewGroup 创建头部位置预设组
  newGroup: {
    path: '/motionService.MotionService/NewGroup',
    requestStream: false,
    responseStream: false,
    requestType: headmotion_pb.NewGroupRequest,
    responseType: headmotion_pb.NewGroupResponse,
    requestSerialize: serialize_motionService_NewGroupRequest,
    requestDeserialize: deserialize_motionService_NewGroupRequest,
    responseSerialize: serialize_motionService_NewGroupResponse,
    responseDeserialize: deserialize_motionService_NewGroupResponse,
  },
  // ListGroups 获取头部位置预设组列表
  listGroups: {
    path: '/motionService.MotionService/ListGroups',
    requestStream: false,
    responseStream: false,
    requestType: headmotion_pb.ListGroupsRequest,
    responseType: headmotion_pb.ListGroupsResponse,
    requestSerialize: serialize_motionService_ListGroupsRequest,
    requestDeserialize: deserialize_motionService_ListGroupsRequest,
    responseSerialize: serialize_motionService_ListGroupsResponse,
    responseDeserialize: deserialize_motionService_ListGroupsResponse,
  },
  // UpdateGroup 更新头部位置预设组
  updateGroup: {
    path: '/motionService.MotionService/UpdateGroup',
    requestStream: false,
    responseStream: false,
    requestType: headmotion_pb.UpdateGroupRequest,
    responseType: headmotion_pb.UpdateGroupResponse,
    requestSerialize: serialize_motionService_UpdateGroupRequest,
    requestDeserialize: deserialize_motionService_UpdateGroupRequest,
    responseSerialize: serialize_motionService_UpdateGroupResponse,
    responseDeserialize: deserialize_motionService_UpdateGroupResponse,
  },
  // DeleteGroups 删除头部位置预设组列表
  deleteGroups: {
    path: '/motionService.MotionService/DeleteGroups',
    requestStream: false,
    responseStream: false,
    requestType: headmotion_pb.DeleteGroupsRequest,
    responseType: headmotion_pb.DeleteGroupsResponse,
    requestSerialize: serialize_motionService_DeleteGroupsRequest,
    requestDeserialize: deserialize_motionService_DeleteGroupsRequest,
    responseSerialize: serialize_motionService_DeleteGroupsResponse,
    responseDeserialize: deserialize_motionService_DeleteGroupsResponse,
  },
  // ListGroupTargets 获取头部位置预设组动作点列表
  listGroupTargets: {
    path: '/motionService.MotionService/ListGroupTargets',
    requestStream: false,
    responseStream: false,
    requestType: headmotion_pb.ListGroupTargetsRequest,
    responseType: headmotion_pb.ListGroupTargetsResponse,
    requestSerialize: serialize_motionService_ListGroupTargetsRequest,
    requestDeserialize: deserialize_motionService_ListGroupTargetsRequest,
    responseSerialize: serialize_motionService_ListGroupTargetsResponse,
    responseDeserialize: deserialize_motionService_ListGroupTargetsResponse,
  },
  // UpdateGroupTargets 更新头部位置预设组动作点列表
  updateGroupTargets: {
    path: '/motionService.MotionService/UpdateGroupTargets',
    requestStream: false,
    responseStream: false,
    requestType: headmotion_pb.UpdateGroupTargetsRequest,
    responseType: headmotion_pb.UpdateGroupTargetsResponse,
    requestSerialize: serialize_motionService_UpdateGroupTargetsRequest,
    requestDeserialize: deserialize_motionService_UpdateGroupTargetsRequest,
    responseSerialize: serialize_motionService_UpdateGroupTargetsResponse,
    responseDeserialize: deserialize_motionService_UpdateGroupTargetsResponse,
  },
};

exports.MotionServiceClient = grpc.makeGenericClientConstructor(MotionServiceService);
