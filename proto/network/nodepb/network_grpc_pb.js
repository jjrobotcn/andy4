// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var network_pb = require('./network_pb.js');
var google_api_annotations_pb = require('./google/api/annotations_pb.js');

function serialize_networkService_ConnectRequest(arg) {
  if (!(arg instanceof network_pb.ConnectRequest)) {
    throw new Error('Expected argument of type networkService.ConnectRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_networkService_ConnectRequest(buffer_arg) {
  return network_pb.ConnectRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_networkService_ConnectResponse(arg) {
  if (!(arg instanceof network_pb.ConnectResponse)) {
    throw new Error('Expected argument of type networkService.ConnectResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_networkService_ConnectResponse(buffer_arg) {
  return network_pb.ConnectResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_networkService_GetNetworkDeviceInfoRequest(arg) {
  if (!(arg instanceof network_pb.GetNetworkDeviceInfoRequest)) {
    throw new Error('Expected argument of type networkService.GetNetworkDeviceInfoRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_networkService_GetNetworkDeviceInfoRequest(buffer_arg) {
  return network_pb.GetNetworkDeviceInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_networkService_GetNetworkDeviceInfoResponse(arg) {
  if (!(arg instanceof network_pb.GetNetworkDeviceInfoResponse)) {
    throw new Error('Expected argument of type networkService.GetNetworkDeviceInfoResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_networkService_GetNetworkDeviceInfoResponse(buffer_arg) {
  return network_pb.GetNetworkDeviceInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_networkService_GetStatusRequest(arg) {
  if (!(arg instanceof network_pb.GetStatusRequest)) {
    throw new Error('Expected argument of type networkService.GetStatusRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_networkService_GetStatusRequest(buffer_arg) {
  return network_pb.GetStatusRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_networkService_GetStatusResponse(arg) {
  if (!(arg instanceof network_pb.GetStatusResponse)) {
    throw new Error('Expected argument of type networkService.GetStatusResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_networkService_GetStatusResponse(buffer_arg) {
  return network_pb.GetStatusResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_networkService_ListNetworksRequest(arg) {
  if (!(arg instanceof network_pb.ListNetworksRequest)) {
    throw new Error('Expected argument of type networkService.ListNetworksRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_networkService_ListNetworksRequest(buffer_arg) {
  return network_pb.ListNetworksRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_networkService_ListNetworksResponse(arg) {
  if (!(arg instanceof network_pb.ListNetworksResponse)) {
    throw new Error('Expected argument of type networkService.ListNetworksResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_networkService_ListNetworksResponse(buffer_arg) {
  return network_pb.ListNetworksResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_networkService_UpdateNetworkDeviceInfoRequest(arg) {
  if (!(arg instanceof network_pb.UpdateNetworkDeviceInfoRequest)) {
    throw new Error('Expected argument of type networkService.UpdateNetworkDeviceInfoRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_networkService_UpdateNetworkDeviceInfoRequest(buffer_arg) {
  return network_pb.UpdateNetworkDeviceInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_networkService_UpdateNetworkDeviceInfoResponse(arg) {
  if (!(arg instanceof network_pb.UpdateNetworkDeviceInfoResponse)) {
    throw new Error('Expected argument of type networkService.UpdateNetworkDeviceInfoResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_networkService_UpdateNetworkDeviceInfoResponse(buffer_arg) {
  return network_pb.UpdateNetworkDeviceInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var NetworkServiceService = exports.NetworkServiceService = {
  // 获取网络扫描结果流
  // 扫描结果每30秒自动更新, 首次获取将返回记录中最新记录
  listNetworks: {
    path: '/networkService.NetworkService/ListNetworks',
    requestStream: false,
    responseStream: true,
    requestType: network_pb.ListNetworksRequest,
    responseType: network_pb.ListNetworksResponse,
    requestSerialize: serialize_networkService_ListNetworksRequest,
    requestDeserialize: deserialize_networkService_ListNetworksRequest,
    responseSerialize: serialize_networkService_ListNetworksResponse,
    responseDeserialize: deserialize_networkService_ListNetworksResponse,
  },
  // 连接至指定网络
  // 连接失败将立即返回错误
  // 若30秒后成功获取状态将返回超时失败
  connect: {
    path: '/networkService.NetworkService/Connect',
    requestStream: false,
    responseStream: false,
    requestType: network_pb.ConnectRequest,
    responseType: network_pb.ConnectResponse,
    requestSerialize: serialize_networkService_ConnectRequest,
    requestDeserialize: deserialize_networkService_ConnectRequest,
    responseSerialize: serialize_networkService_ConnectResponse,
    responseDeserialize: deserialize_networkService_ConnectResponse,
  },
  // 获取连接状态流
  // 在连接开始时立即返回当前最新的扫描数据
  // 并持续在网络数据更新时接收新数据
  getStatus: {
    path: '/networkService.NetworkService/GetStatus',
    requestStream: false,
    responseStream: true,
    requestType: network_pb.GetStatusRequest,
    responseType: network_pb.GetStatusResponse,
    requestSerialize: serialize_networkService_GetStatusRequest,
    requestDeserialize: deserialize_networkService_GetStatusRequest,
    responseSerialize: serialize_networkService_GetStatusResponse,
    responseDeserialize: deserialize_networkService_GetStatusResponse,
  },
  // 获取网络设备相关信息
  // v1.1.0
  getNetworkDeviceInfo: {
    path: '/networkService.NetworkService/GetNetworkDeviceInfo',
    requestStream: false,
    responseStream: false,
    requestType: network_pb.GetNetworkDeviceInfoRequest,
    responseType: network_pb.GetNetworkDeviceInfoResponse,
    requestSerialize: serialize_networkService_GetNetworkDeviceInfoRequest,
    requestDeserialize: deserialize_networkService_GetNetworkDeviceInfoRequest,
    responseSerialize: serialize_networkService_GetNetworkDeviceInfoResponse,
    responseDeserialize: deserialize_networkService_GetNetworkDeviceInfoResponse,
  },
  // 修改网络设备相关信息
  // v1.1.0
  updateNetworkDeviceInfo: {
    path: '/networkService.NetworkService/UpdateNetworkDeviceInfo',
    requestStream: false,
    responseStream: false,
    requestType: network_pb.UpdateNetworkDeviceInfoRequest,
    responseType: network_pb.UpdateNetworkDeviceInfoResponse,
    requestSerialize: serialize_networkService_UpdateNetworkDeviceInfoRequest,
    requestDeserialize: deserialize_networkService_UpdateNetworkDeviceInfoRequest,
    responseSerialize: serialize_networkService_UpdateNetworkDeviceInfoResponse,
    responseDeserialize: deserialize_networkService_UpdateNetworkDeviceInfoResponse,
  },
};

exports.NetworkServiceClient = grpc.makeGenericClientConstructor(NetworkServiceService);
