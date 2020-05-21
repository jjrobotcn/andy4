// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var lights_pb = require('./lights_pb.js');

function serialize_lightsService_DeleteLightsRequest(arg) {
  if (!(arg instanceof lights_pb.DeleteLightsRequest)) {
    throw new Error('Expected argument of type lightsService.DeleteLightsRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_lightsService_DeleteLightsRequest(buffer_arg) {
  return lights_pb.DeleteLightsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lightsService_DeleteLightsResponse(arg) {
  if (!(arg instanceof lights_pb.DeleteLightsResponse)) {
    throw new Error('Expected argument of type lightsService.DeleteLightsResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_lightsService_DeleteLightsResponse(buffer_arg) {
  return lights_pb.DeleteLightsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lightsService_ListLightsRequest(arg) {
  if (!(arg instanceof lights_pb.ListLightsRequest)) {
    throw new Error('Expected argument of type lightsService.ListLightsRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_lightsService_ListLightsRequest(buffer_arg) {
  return lights_pb.ListLightsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lightsService_ListLightsResponse(arg) {
  if (!(arg instanceof lights_pb.ListLightsResponse)) {
    throw new Error('Expected argument of type lightsService.ListLightsResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_lightsService_ListLightsResponse(buffer_arg) {
  return lights_pb.ListLightsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lightsService_NewLightRequest(arg) {
  if (!(arg instanceof lights_pb.NewLightRequest)) {
    throw new Error('Expected argument of type lightsService.NewLightRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_lightsService_NewLightRequest(buffer_arg) {
  return lights_pb.NewLightRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lightsService_NewLightResponse(arg) {
  if (!(arg instanceof lights_pb.NewLightResponse)) {
    throw new Error('Expected argument of type lightsService.NewLightResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_lightsService_NewLightResponse(buffer_arg) {
  return lights_pb.NewLightResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lightsService_PlayLightRequest(arg) {
  if (!(arg instanceof lights_pb.PlayLightRequest)) {
    throw new Error('Expected argument of type lightsService.PlayLightRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_lightsService_PlayLightRequest(buffer_arg) {
  return lights_pb.PlayLightRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lightsService_PlayLightResponse(arg) {
  if (!(arg instanceof lights_pb.PlayLightResponse)) {
    throw new Error('Expected argument of type lightsService.PlayLightResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_lightsService_PlayLightResponse(buffer_arg) {
  return lights_pb.PlayLightResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lightsService_PreviewLightRequest(arg) {
  if (!(arg instanceof lights_pb.PreviewLightRequest)) {
    throw new Error('Expected argument of type lightsService.PreviewLightRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_lightsService_PreviewLightRequest(buffer_arg) {
  return lights_pb.PreviewLightRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lightsService_PreviewLightResponse(arg) {
  if (!(arg instanceof lights_pb.PreviewLightResponse)) {
    throw new Error('Expected argument of type lightsService.PreviewLightResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_lightsService_PreviewLightResponse(buffer_arg) {
  return lights_pb.PreviewLightResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lightsService_StateRequest(arg) {
  if (!(arg instanceof lights_pb.StateRequest)) {
    throw new Error('Expected argument of type lightsService.StateRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_lightsService_StateRequest(buffer_arg) {
  return lights_pb.StateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lightsService_StateResponse(arg) {
  if (!(arg instanceof lights_pb.StateResponse)) {
    throw new Error('Expected argument of type lightsService.StateResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_lightsService_StateResponse(buffer_arg) {
  return lights_pb.StateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lightsService_StopLightRequest(arg) {
  if (!(arg instanceof lights_pb.StopLightRequest)) {
    throw new Error('Expected argument of type lightsService.StopLightRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_lightsService_StopLightRequest(buffer_arg) {
  return lights_pb.StopLightRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lightsService_StopLightResponse(arg) {
  if (!(arg instanceof lights_pb.StopLightResponse)) {
    throw new Error('Expected argument of type lightsService.StopLightResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_lightsService_StopLightResponse(buffer_arg) {
  return lights_pb.StopLightResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lightsService_SwitchRequest(arg) {
  if (!(arg instanceof lights_pb.SwitchRequest)) {
    throw new Error('Expected argument of type lightsService.SwitchRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_lightsService_SwitchRequest(buffer_arg) {
  return lights_pb.SwitchRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lightsService_SwitchResponse(arg) {
  if (!(arg instanceof lights_pb.SwitchResponse)) {
    throw new Error('Expected argument of type lightsService.SwitchResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_lightsService_SwitchResponse(buffer_arg) {
  return lights_pb.SwitchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lightsService_UpdateLightRequest(arg) {
  if (!(arg instanceof lights_pb.UpdateLightRequest)) {
    throw new Error('Expected argument of type lightsService.UpdateLightRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_lightsService_UpdateLightRequest(buffer_arg) {
  return lights_pb.UpdateLightRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lightsService_UpdateLightResponse(arg) {
  if (!(arg instanceof lights_pb.UpdateLightResponse)) {
    throw new Error('Expected argument of type lightsService.UpdateLightResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_lightsService_UpdateLightResponse(buffer_arg) {
  return lights_pb.UpdateLightResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// lightsService.LightsService 灯光管理
//
// 开发管理平台功能参考: http://10.10.10.2/lights/
var LightsServiceService = exports.LightsServiceService = {
  // PreviewLight 灯光预览
  //
  // 灯光预览方法将根据配置的灯光数据生成目标数据写入硬件，
  // 修改灯光数据后请使用此方法进行预览并更新，
  // 否则PlayLight方法将继续使用之前的旧数据进行播放
  previewLight: {
    path: '/lightsService.LightsService/PreviewLight',
    requestStream: false,
    responseStream: false,
    requestType: lights_pb.PreviewLightRequest,
    responseType: lights_pb.PreviewLightResponse,
    requestSerialize: serialize_lightsService_PreviewLightRequest,
    requestDeserialize: deserialize_lightsService_PreviewLightRequest,
    responseSerialize: serialize_lightsService_PreviewLightResponse,
    responseDeserialize: deserialize_lightsService_PreviewLightResponse,
  },
  // PlayLight 灯光播放
  //
  // 播放前请通过PreviewLight生成或更新数据实例
  playLight: {
    path: '/lightsService.LightsService/PlayLight',
    requestStream: false,
    responseStream: false,
    requestType: lights_pb.PlayLightRequest,
    responseType: lights_pb.PlayLightResponse,
    requestSerialize: serialize_lightsService_PlayLightRequest,
    requestDeserialize: deserialize_lightsService_PlayLightRequest,
    responseSerialize: serialize_lightsService_PlayLightResponse,
    responseDeserialize: deserialize_lightsService_PlayLightResponse,
  },
  // StopLight 灯光停止
  stopLight: {
    path: '/lightsService.LightsService/StopLight',
    requestStream: false,
    responseStream: false,
    requestType: lights_pb.StopLightRequest,
    responseType: lights_pb.StopLightResponse,
    requestSerialize: serialize_lightsService_StopLightRequest,
    requestDeserialize: deserialize_lightsService_StopLightRequest,
    responseSerialize: serialize_lightsService_StopLightResponse,
    responseDeserialize: deserialize_lightsService_StopLightResponse,
  },
  // ListLights 获取灯光列表
  listLights: {
    path: '/lightsService.LightsService/ListLights',
    requestStream: false,
    responseStream: false,
    requestType: lights_pb.ListLightsRequest,
    responseType: lights_pb.ListLightsResponse,
    requestSerialize: serialize_lightsService_ListLightsRequest,
    requestDeserialize: deserialize_lightsService_ListLightsRequest,
    responseSerialize: serialize_lightsService_ListLightsResponse,
    responseDeserialize: deserialize_lightsService_ListLightsResponse,
  },
  // NewLight 创建灯光
  newLight: {
    path: '/lightsService.LightsService/NewLight',
    requestStream: false,
    responseStream: false,
    requestType: lights_pb.NewLightRequest,
    responseType: lights_pb.NewLightResponse,
    requestSerialize: serialize_lightsService_NewLightRequest,
    requestDeserialize: deserialize_lightsService_NewLightRequest,
    responseSerialize: serialize_lightsService_NewLightResponse,
    responseDeserialize: deserialize_lightsService_NewLightResponse,
  },
  // UpdateLight 更新灯光
  updateLight: {
    path: '/lightsService.LightsService/UpdateLight',
    requestStream: false,
    responseStream: false,
    requestType: lights_pb.UpdateLightRequest,
    responseType: lights_pb.UpdateLightResponse,
    requestSerialize: serialize_lightsService_UpdateLightRequest,
    requestDeserialize: deserialize_lightsService_UpdateLightRequest,
    responseSerialize: serialize_lightsService_UpdateLightResponse,
    responseDeserialize: deserialize_lightsService_UpdateLightResponse,
  },
  // DeleteLights 删除灯光列表
  deleteLights: {
    path: '/lightsService.LightsService/DeleteLights',
    requestStream: false,
    responseStream: false,
    requestType: lights_pb.DeleteLightsRequest,
    responseType: lights_pb.DeleteLightsResponse,
    requestSerialize: serialize_lightsService_DeleteLightsRequest,
    requestDeserialize: deserialize_lightsService_DeleteLightsRequest,
    responseSerialize: serialize_lightsService_DeleteLightsResponse,
    responseDeserialize: deserialize_lightsService_DeleteLightsResponse,
  },
  // State 获取当前灯光模块状态
  state: {
    path: '/lightsService.LightsService/State',
    requestStream: false,
    responseStream: false,
    requestType: lights_pb.StateRequest,
    responseType: lights_pb.StateResponse,
    requestSerialize: serialize_lightsService_StateRequest,
    requestDeserialize: deserialize_lightsService_StateRequest,
    responseSerialize: serialize_lightsService_StateResponse,
    responseDeserialize: deserialize_lightsService_StateResponse,
  },
  // Switch 控制灯光的开关
  switch: {
    path: '/lightsService.LightsService/Switch',
    requestStream: false,
    responseStream: false,
    requestType: lights_pb.SwitchRequest,
    responseType: lights_pb.SwitchResponse,
    requestSerialize: serialize_lightsService_SwitchRequest,
    requestDeserialize: deserialize_lightsService_SwitchRequest,
    responseSerialize: serialize_lightsService_SwitchResponse,
    responseDeserialize: deserialize_lightsService_SwitchResponse,
  },
};

exports.LightsServiceClient = grpc.makeGenericClientConstructor(LightsServiceService);
