// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var map_pb = require('./map_pb.js');

function serialize_navService_GetMapInfoRequest(arg) {
  if (!(arg instanceof map_pb.GetMapInfoRequest)) {
    throw new Error('Expected argument of type navService.GetMapInfoRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_GetMapInfoRequest(buffer_arg) {
  return map_pb.GetMapInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_navService_GetMapInfoResponse(arg) {
  if (!(arg instanceof map_pb.GetMapInfoResponse)) {
    throw new Error('Expected argument of type navService.GetMapInfoResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_GetMapInfoResponse(buffer_arg) {
  return map_pb.GetMapInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_navService_LocationResetRequest(arg) {
  if (!(arg instanceof map_pb.LocationResetRequest)) {
    throw new Error('Expected argument of type navService.LocationResetRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_LocationResetRequest(buffer_arg) {
  return map_pb.LocationResetRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_navService_LocationResetResponse(arg) {
  if (!(arg instanceof map_pb.LocationResetResponse)) {
    throw new Error('Expected argument of type navService.LocationResetResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_LocationResetResponse(buffer_arg) {
  return map_pb.LocationResetResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_navService_MapPositionStreamRequest(arg) {
  if (!(arg instanceof map_pb.MapPositionStreamRequest)) {
    throw new Error('Expected argument of type navService.MapPositionStreamRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_MapPositionStreamRequest(buffer_arg) {
  return map_pb.MapPositionStreamRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_navService_MapPositionStreamResponse(arg) {
  if (!(arg instanceof map_pb.MapPositionStreamResponse)) {
    throw new Error('Expected argument of type navService.MapPositionStreamResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_navService_MapPositionStreamResponse(buffer_arg) {
  return map_pb.MapPositionStreamResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// navService.Map 导航地图
//
// 仅无线导航版本支持
var MapService = exports.MapService = {
  // GetMapInfo 获取地图信息
  getMapInfo: {
    path: '/navService.Map/GetMapInfo',
    requestStream: false,
    responseStream: false,
    requestType: map_pb.GetMapInfoRequest,
    responseType: map_pb.GetMapInfoResponse,
    requestSerialize: serialize_navService_GetMapInfoRequest,
    requestDeserialize: deserialize_navService_GetMapInfoRequest,
    responseSerialize: serialize_navService_GetMapInfoResponse,
    responseDeserialize: deserialize_navService_GetMapInfoResponse,
  },
  // MapPositionStream 监听设备的地图定位信息
  mapPositionStream: {
    path: '/navService.Map/MapPositionStream',
    requestStream: false,
    responseStream: true,
    requestType: map_pb.MapPositionStreamRequest,
    responseType: map_pb.MapPositionStreamResponse,
    requestSerialize: serialize_navService_MapPositionStreamRequest,
    requestDeserialize: deserialize_navService_MapPositionStreamRequest,
    responseSerialize: serialize_navService_MapPositionStreamResponse,
    responseDeserialize: deserialize_navService_MapPositionStreamResponse,
  },
  // LocationReset 重置当前定位
  //
  // 某些情况下此方法返回成功时可能出现实际位置与地图位置不相符，
  // 在有明确参照物附近调用此方法可提高准确定位成功率。
  //
  // 用于发生定位异常/错误状态，重新初始化导航定位
  // 重定位错误：定位状态超时|无地图|UWB错误
  // 重定位超时判断: 默认10s，仅在非错误状态下重置
  locationReset: {
    path: '/navService.Map/LocationReset',
    requestStream: false,
    responseStream: false,
    requestType: map_pb.LocationResetRequest,
    responseType: map_pb.LocationResetResponse,
    requestSerialize: serialize_navService_LocationResetRequest,
    requestDeserialize: deserialize_navService_LocationResetRequest,
    responseSerialize: serialize_navService_LocationResetResponse,
    responseDeserialize: deserialize_navService_LocationResetResponse,
  },
};

exports.MapClient = grpc.makeGenericClientConstructor(MapService);
