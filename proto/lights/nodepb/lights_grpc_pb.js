// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var lights_pb = require('./lights_pb.js');
var google_api_annotations_pb = require('./google/api/annotations_pb.js');

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


var LightsServiceService = exports.LightsServiceService = {
  // 预览灯光
  // 创建灯光后使用此方法生成灯光文件
  // 在未生成灯光文件前调用PlayLight将无效
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
  // 播放灯光
  // 需在播放前执行PreviewLight生成灯光文件
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
  // 停止灯光
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
  // 获取灯光数据
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
  // 创建灯光
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
  // 更新灯光数据
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
  // 删除灯光
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
};

exports.LightsServiceClient = grpc.makeGenericClientConstructor(LightsServiceService);
