// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var storage_pb = require('./storage_pb.js');
var google_api_annotations_pb = require('./google/api/annotations_pb.js');

function serialize_cameraService_DeleteVideoFilesRequest(arg) {
  if (!(arg instanceof storage_pb.DeleteVideoFilesRequest)) {
    throw new Error('Expected argument of type cameraService.DeleteVideoFilesRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_cameraService_DeleteVideoFilesRequest(buffer_arg) {
  return storage_pb.DeleteVideoFilesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cameraService_DeleteVideoFilesResponse(arg) {
  if (!(arg instanceof storage_pb.DeleteVideoFilesResponse)) {
    throw new Error('Expected argument of type cameraService.DeleteVideoFilesResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_cameraService_DeleteVideoFilesResponse(buffer_arg) {
  return storage_pb.DeleteVideoFilesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cameraService_GetVideoFileRequest(arg) {
  if (!(arg instanceof storage_pb.GetVideoFileRequest)) {
    throw new Error('Expected argument of type cameraService.GetVideoFileRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_cameraService_GetVideoFileRequest(buffer_arg) {
  return storage_pb.GetVideoFileRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cameraService_GetVideoFileResponse(arg) {
  if (!(arg instanceof storage_pb.GetVideoFileResponse)) {
    throw new Error('Expected argument of type cameraService.GetVideoFileResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_cameraService_GetVideoFileResponse(buffer_arg) {
  return storage_pb.GetVideoFileResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cameraService_ListDatesRequest(arg) {
  if (!(arg instanceof storage_pb.ListDatesRequest)) {
    throw new Error('Expected argument of type cameraService.ListDatesRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_cameraService_ListDatesRequest(buffer_arg) {
  return storage_pb.ListDatesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cameraService_ListDatesResponse(arg) {
  if (!(arg instanceof storage_pb.ListDatesResponse)) {
    throw new Error('Expected argument of type cameraService.ListDatesResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_cameraService_ListDatesResponse(buffer_arg) {
  return storage_pb.ListDatesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cameraService_ListVideosRequest(arg) {
  if (!(arg instanceof storage_pb.ListVideosRequest)) {
    throw new Error('Expected argument of type cameraService.ListVideosRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_cameraService_ListVideosRequest(buffer_arg) {
  return storage_pb.ListVideosRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cameraService_ListVideosResponse(arg) {
  if (!(arg instanceof storage_pb.ListVideosResponse)) {
    throw new Error('Expected argument of type cameraService.ListVideosResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_cameraService_ListVideosResponse(buffer_arg) {
  return storage_pb.ListVideosResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var StorageService = exports.StorageService = {
  // 获取监控视频日期列表
  listDates: {
    path: '/cameraService.Storage/ListDates',
    requestStream: false,
    responseStream: false,
    requestType: storage_pb.ListDatesRequest,
    responseType: storage_pb.ListDatesResponse,
    requestSerialize: serialize_cameraService_ListDatesRequest,
    requestDeserialize: deserialize_cameraService_ListDatesRequest,
    responseSerialize: serialize_cameraService_ListDatesResponse,
    responseDeserialize: deserialize_cameraService_ListDatesResponse,
  },
  // 获取监控视频列表
  listVideos: {
    path: '/cameraService.Storage/ListVideos',
    requestStream: false,
    responseStream: false,
    requestType: storage_pb.ListVideosRequest,
    responseType: storage_pb.ListVideosResponse,
    requestSerialize: serialize_cameraService_ListVideosRequest,
    requestDeserialize: deserialize_cameraService_ListVideosRequest,
    responseSerialize: serialize_cameraService_ListVideosResponse,
    responseDeserialize: deserialize_cameraService_ListVideosResponse,
  },
  // 获取监控视频文件
  getVideoFile: {
    path: '/cameraService.Storage/GetVideoFile',
    requestStream: false,
    responseStream: true,
    requestType: storage_pb.GetVideoFileRequest,
    responseType: storage_pb.GetVideoFileResponse,
    requestSerialize: serialize_cameraService_GetVideoFileRequest,
    requestDeserialize: deserialize_cameraService_GetVideoFileRequest,
    responseSerialize: serialize_cameraService_GetVideoFileResponse,
    responseDeserialize: deserialize_cameraService_GetVideoFileResponse,
  },
  // 删除监控视频文件
  deleteVideoFiles: {
    path: '/cameraService.Storage/DeleteVideoFiles',
    requestStream: false,
    responseStream: false,
    requestType: storage_pb.DeleteVideoFilesRequest,
    responseType: storage_pb.DeleteVideoFilesResponse,
    requestSerialize: serialize_cameraService_DeleteVideoFilesRequest,
    requestDeserialize: deserialize_cameraService_DeleteVideoFilesRequest,
    responseSerialize: serialize_cameraService_DeleteVideoFilesResponse,
    responseDeserialize: deserialize_cameraService_DeleteVideoFilesResponse,
  },
};

exports.StorageClient = grpc.makeGenericClientConstructor(StorageService);
