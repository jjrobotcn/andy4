// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var nav_pb = require('./nav_pb.js');
var map_pb = require('./map_pb.js');

function serialize_navService_AutoChargeRequest(arg) {
  if (!(arg instanceof nav_pb.AutoChargeRequest)) {
    throw new Error('Expected argument of type navService.AutoChargeRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_AutoChargeRequest(buffer_arg) {
  return nav_pb.AutoChargeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_navService_AutoChargeResponse(arg) {
  if (!(arg instanceof nav_pb.AutoChargeResponse)) {
    throw new Error('Expected argument of type navService.AutoChargeResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_AutoChargeResponse(buffer_arg) {
  return nav_pb.AutoChargeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_navService_DeleteRoutesRequest(arg) {
  if (!(arg instanceof nav_pb.DeleteRoutesRequest)) {
    throw new Error('Expected argument of type navService.DeleteRoutesRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_DeleteRoutesRequest(buffer_arg) {
  return nav_pb.DeleteRoutesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_navService_DeleteRoutesResponse(arg) {
  if (!(arg instanceof nav_pb.DeleteRoutesResponse)) {
    throw new Error('Expected argument of type navService.DeleteRoutesResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_DeleteRoutesResponse(buffer_arg) {
  return nav_pb.DeleteRoutesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_navService_ListRoutesRequest(arg) {
  if (!(arg instanceof nav_pb.ListRoutesRequest)) {
    throw new Error('Expected argument of type navService.ListRoutesRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_ListRoutesRequest(buffer_arg) {
  return nav_pb.ListRoutesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_navService_ListRoutesResponse(arg) {
  if (!(arg instanceof nav_pb.ListRoutesResponse)) {
    throw new Error('Expected argument of type navService.ListRoutesResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_ListRoutesResponse(buffer_arg) {
  return nav_pb.ListRoutesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_navService_MoveRequest(arg) {
  if (!(arg instanceof nav_pb.MoveRequest)) {
    throw new Error('Expected argument of type navService.MoveRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_MoveRequest(buffer_arg) {
  return nav_pb.MoveRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_navService_MoveResponse(arg) {
  if (!(arg instanceof nav_pb.MoveResponse)) {
    throw new Error('Expected argument of type navService.MoveResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_MoveResponse(buffer_arg) {
  return nav_pb.MoveResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_navService_NavStopRequest(arg) {
  if (!(arg instanceof nav_pb.NavStopRequest)) {
    throw new Error('Expected argument of type navService.NavStopRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_NavStopRequest(buffer_arg) {
  return nav_pb.NavStopRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_navService_NavStopResponse(arg) {
  if (!(arg instanceof nav_pb.NavStopResponse)) {
    throw new Error('Expected argument of type navService.NavStopResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_NavStopResponse(buffer_arg) {
  return nav_pb.NavStopResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_navService_NavToRequest(arg) {
  if (!(arg instanceof nav_pb.NavToRequest)) {
    throw new Error('Expected argument of type navService.NavToRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_NavToRequest(buffer_arg) {
  return nav_pb.NavToRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_navService_NavToResponse(arg) {
  if (!(arg instanceof nav_pb.NavToResponse)) {
    throw new Error('Expected argument of type navService.NavToResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_NavToResponse(buffer_arg) {
  return nav_pb.NavToResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_navService_NewRouteRequest(arg) {
  if (!(arg instanceof nav_pb.NewRouteRequest)) {
    throw new Error('Expected argument of type navService.NewRouteRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_NewRouteRequest(buffer_arg) {
  return nav_pb.NewRouteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_navService_NewRouteResponse(arg) {
  if (!(arg instanceof nav_pb.NewRouteResponse)) {
    throw new Error('Expected argument of type navService.NewRouteResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_NewRouteResponse(buffer_arg) {
  return nav_pb.NewRouteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_navService_OnNavEventChangeRequest(arg) {
  if (!(arg instanceof nav_pb.OnNavEventChangeRequest)) {
    throw new Error('Expected argument of type navService.OnNavEventChangeRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_OnNavEventChangeRequest(buffer_arg) {
  return nav_pb.OnNavEventChangeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_navService_OnNavEventChangeResponse(arg) {
  if (!(arg instanceof nav_pb.OnNavEventChangeResponse)) {
    throw new Error('Expected argument of type navService.OnNavEventChangeResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_OnNavEventChangeResponse(buffer_arg) {
  return nav_pb.OnNavEventChangeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_navService_RotateRequest(arg) {
  if (!(arg instanceof nav_pb.RotateRequest)) {
    throw new Error('Expected argument of type navService.RotateRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_RotateRequest(buffer_arg) {
  return nav_pb.RotateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_navService_RotateResponse(arg) {
  if (!(arg instanceof nav_pb.RotateResponse)) {
    throw new Error('Expected argument of type navService.RotateResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_RotateResponse(buffer_arg) {
  return nav_pb.RotateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_navService_UpdateRouteRequest(arg) {
  if (!(arg instanceof nav_pb.UpdateRouteRequest)) {
    throw new Error('Expected argument of type navService.UpdateRouteRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_UpdateRouteRequest(buffer_arg) {
  return nav_pb.UpdateRouteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_navService_UpdateRouteResponse(arg) {
  if (!(arg instanceof nav_pb.UpdateRouteResponse)) {
    throw new Error('Expected argument of type navService.UpdateRouteResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_UpdateRouteResponse(buffer_arg) {
  return nav_pb.UpdateRouteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// navService.NavController 导航控制器
//
// 导航控制器以充电为最高优先级，处于充电相关时，一切其它控制请求均返回Reject错误，
// 需取得控制权时，请取消充电以恢复控制。
//
// 开发管理平台功能参考: http://10.10.10.2/nav
var NavControllerService = exports.NavControllerService = {
  // Move 遥控移动
  //
  // 遥控移动需持续发送移动指令，通常为300ms
  move: {
    path: '/navService.NavController/Move',
    requestStream: true,
    responseStream: true,
    requestType: nav_pb.MoveRequest,
    responseType: nav_pb.MoveResponse,
    requestSerialize: serialize_navService_MoveRequest,
    requestDeserialize: deserialize_navService_MoveRequest,
    responseSerialize: serialize_navService_MoveResponse,
    responseDeserialize: deserialize_navService_MoveResponse,
  },
  // NavTo 导航
  navTo: {
    path: '/navService.NavController/NavTo',
    requestStream: false,
    responseStream: false,
    requestType: nav_pb.NavToRequest,
    responseType: nav_pb.NavToResponse,
    requestSerialize: serialize_navService_NavToRequest,
    requestDeserialize: deserialize_navService_NavToRequest,
    responseSerialize: serialize_navService_NavToResponse,
    responseDeserialize: deserialize_navService_NavToResponse,
  },
  // NavStop 中止
  //
  // 支持导航、旋转的中止
  //
  // 导航中止后，可通过NavTo中CONTINUE恢复该目标导航
  navStop: {
    path: '/navService.NavController/NavStop',
    requestStream: false,
    responseStream: false,
    requestType: nav_pb.NavStopRequest,
    responseType: nav_pb.NavStopResponse,
    requestSerialize: serialize_navService_NavStopRequest,
    requestDeserialize: deserialize_navService_NavStopRequest,
    responseSerialize: serialize_navService_NavStopResponse,
    responseDeserialize: deserialize_navService_NavStopResponse,
  },
  // AutoCharge 自动充电
  //
  // 开发管理平台功能参考: http://10.10.10.2/power
  autoCharge: {
    path: '/navService.NavController/AutoCharge',
    requestStream: false,
    responseStream: false,
    requestType: nav_pb.AutoChargeRequest,
    responseType: nav_pb.AutoChargeResponse,
    requestSerialize: serialize_navService_AutoChargeRequest,
    requestDeserialize: deserialize_navService_AutoChargeRequest,
    responseSerialize: serialize_navService_AutoChargeResponse,
    responseDeserialize: deserialize_navService_AutoChargeResponse,
  },
  // Rotate 原地旋转
  rotate: {
    path: '/navService.NavController/Rotate',
    requestStream: false,
    responseStream: false,
    requestType: nav_pb.RotateRequest,
    responseType: nav_pb.RotateResponse,
    requestSerialize: serialize_navService_RotateRequest,
    requestDeserialize: deserialize_navService_RotateRequest,
    responseSerialize: serialize_navService_RotateResponse,
    responseDeserialize: deserialize_navService_RotateResponse,
  },
  // OnNavEventChange 导航事件监听
  //
  // 监听导航模块中各类事件的变动更新，详见OnNavEventChangeResponse
  onNavEventChange: {
    path: '/navService.NavController/OnNavEventChange',
    requestStream: false,
    responseStream: true,
    requestType: nav_pb.OnNavEventChangeRequest,
    responseType: nav_pb.OnNavEventChangeResponse,
    requestSerialize: serialize_navService_OnNavEventChangeRequest,
    requestDeserialize: deserialize_navService_OnNavEventChangeRequest,
    responseSerialize: serialize_navService_OnNavEventChangeResponse,
    responseDeserialize: deserialize_navService_OnNavEventChangeResponse,
  },
  // NewRoute 新建线路
  //
  // 无线导航不支持通过此方法构建
  newRoute: {
    path: '/navService.NavController/NewRoute',
    requestStream: false,
    responseStream: false,
    requestType: nav_pb.NewRouteRequest,
    responseType: nav_pb.NewRouteResponse,
    requestSerialize: serialize_navService_NewRouteRequest,
    requestDeserialize: deserialize_navService_NewRouteRequest,
    responseSerialize: serialize_navService_NewRouteResponse,
    responseDeserialize: deserialize_navService_NewRouteResponse,
  },
  // ListRoutes 获取线路列表
  //
  // 无线导航此数据为地图数据的预设点数据，
  // 可通过navService.Map获取更明细数据
  listRoutes: {
    path: '/navService.NavController/ListRoutes',
    requestStream: false,
    responseStream: false,
    requestType: nav_pb.ListRoutesRequest,
    responseType: nav_pb.ListRoutesResponse,
    requestSerialize: serialize_navService_ListRoutesRequest,
    requestDeserialize: deserialize_navService_ListRoutesRequest,
    responseSerialize: serialize_navService_ListRoutesResponse,
    responseDeserialize: deserialize_navService_ListRoutesResponse,
  },
  // UpdateRoute 更新线路信息
  //
  // 无线导航不支持通过此方法更新
  updateRoute: {
    path: '/navService.NavController/UpdateRoute',
    requestStream: false,
    responseStream: false,
    requestType: nav_pb.UpdateRouteRequest,
    responseType: nav_pb.UpdateRouteResponse,
    requestSerialize: serialize_navService_UpdateRouteRequest,
    requestDeserialize: deserialize_navService_UpdateRouteRequest,
    responseSerialize: serialize_navService_UpdateRouteResponse,
    responseDeserialize: deserialize_navService_UpdateRouteResponse,
  },
  // DeleteRoutes 删除多个线路
  //
  // 无线导航不支持通过此方法删除
  deleteRoutes: {
    path: '/navService.NavController/DeleteRoutes',
    requestStream: false,
    responseStream: false,
    requestType: nav_pb.DeleteRoutesRequest,
    responseType: nav_pb.DeleteRoutesResponse,
    requestSerialize: serialize_navService_DeleteRoutesRequest,
    requestDeserialize: deserialize_navService_DeleteRoutesRequest,
    responseSerialize: serialize_navService_DeleteRoutesResponse,
    responseDeserialize: deserialize_navService_DeleteRoutesResponse,
  },
};

exports.NavControllerClient = grpc.makeGenericClientConstructor(NavControllerService);
