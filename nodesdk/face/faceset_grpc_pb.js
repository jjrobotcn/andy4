// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var faceset_pb = require('./faceset_pb.js');

function serialize_faceRecognition_AddFaceRequest(arg) {
  if (!(arg instanceof faceset_pb.AddFaceRequest)) {
    throw new Error('Expected argument of type faceRecognition.AddFaceRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_AddFaceRequest(buffer_arg) {
  return faceset_pb.AddFaceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_faceRecognition_AddFaceResponse(arg) {
  if (!(arg instanceof faceset_pb.AddFaceResponse)) {
    throw new Error('Expected argument of type faceRecognition.AddFaceResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_AddFaceResponse(buffer_arg) {
  return faceset_pb.AddFaceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_faceRecognition_DeleteFaceSetRequest(arg) {
  if (!(arg instanceof faceset_pb.DeleteFaceSetRequest)) {
    throw new Error('Expected argument of type faceRecognition.DeleteFaceSetRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_DeleteFaceSetRequest(buffer_arg) {
  return faceset_pb.DeleteFaceSetRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_faceRecognition_DeleteFaceSetResponse(arg) {
  if (!(arg instanceof faceset_pb.DeleteFaceSetResponse)) {
    throw new Error('Expected argument of type faceRecognition.DeleteFaceSetResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_DeleteFaceSetResponse(buffer_arg) {
  return faceset_pb.DeleteFaceSetResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_faceRecognition_FaceDetailRequest(arg) {
  if (!(arg instanceof faceset_pb.FaceDetailRequest)) {
    throw new Error('Expected argument of type faceRecognition.FaceDetailRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_FaceDetailRequest(buffer_arg) {
  return faceset_pb.FaceDetailRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_faceRecognition_FaceDetailResponse(arg) {
  if (!(arg instanceof faceset_pb.FaceDetailResponse)) {
    throw new Error('Expected argument of type faceRecognition.FaceDetailResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_FaceDetailResponse(buffer_arg) {
  return faceset_pb.FaceDetailResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_faceRecognition_ListFaceDetailsRequest(arg) {
  if (!(arg instanceof faceset_pb.ListFaceDetailsRequest)) {
    throw new Error('Expected argument of type faceRecognition.ListFaceDetailsRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_ListFaceDetailsRequest(buffer_arg) {
  return faceset_pb.ListFaceDetailsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_faceRecognition_ListFaceDetailsResponse(arg) {
  if (!(arg instanceof faceset_pb.ListFaceDetailsResponse)) {
    throw new Error('Expected argument of type faceRecognition.ListFaceDetailsResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_ListFaceDetailsResponse(buffer_arg) {
  return faceset_pb.ListFaceDetailsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_faceRecognition_ListFaceSetsRequest(arg) {
  if (!(arg instanceof faceset_pb.ListFaceSetsRequest)) {
    throw new Error('Expected argument of type faceRecognition.ListFaceSetsRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_ListFaceSetsRequest(buffer_arg) {
  return faceset_pb.ListFaceSetsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_faceRecognition_ListFaceSetsResponse(arg) {
  if (!(arg instanceof faceset_pb.ListFaceSetsResponse)) {
    throw new Error('Expected argument of type faceRecognition.ListFaceSetsResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_ListFaceSetsResponse(buffer_arg) {
  return faceset_pb.ListFaceSetsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_faceRecognition_NewFaceSetRequest(arg) {
  if (!(arg instanceof faceset_pb.NewFaceSetRequest)) {
    throw new Error('Expected argument of type faceRecognition.NewFaceSetRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_NewFaceSetRequest(buffer_arg) {
  return faceset_pb.NewFaceSetRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_faceRecognition_NewFaceSetResponse(arg) {
  if (!(arg instanceof faceset_pb.NewFaceSetResponse)) {
    throw new Error('Expected argument of type faceRecognition.NewFaceSetResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_NewFaceSetResponse(buffer_arg) {
  return faceset_pb.NewFaceSetResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_faceRecognition_RemoveFaceRequest(arg) {
  if (!(arg instanceof faceset_pb.RemoveFaceRequest)) {
    throw new Error('Expected argument of type faceRecognition.RemoveFaceRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_RemoveFaceRequest(buffer_arg) {
  return faceset_pb.RemoveFaceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_faceRecognition_RemoveFaceResponse(arg) {
  if (!(arg instanceof faceset_pb.RemoveFaceResponse)) {
    throw new Error('Expected argument of type faceRecognition.RemoveFaceResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_RemoveFaceResponse(buffer_arg) {
  return faceset_pb.RemoveFaceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_faceRecognition_UpdateFaceSetRequest(arg) {
  if (!(arg instanceof faceset_pb.UpdateFaceSetRequest)) {
    throw new Error('Expected argument of type faceRecognition.UpdateFaceSetRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_UpdateFaceSetRequest(buffer_arg) {
  return faceset_pb.UpdateFaceSetRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_faceRecognition_UpdateFaceSetResponse(arg) {
  if (!(arg instanceof faceset_pb.UpdateFaceSetResponse)) {
    throw new Error('Expected argument of type faceRecognition.UpdateFaceSetResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_faceRecognition_UpdateFaceSetResponse(buffer_arg) {
  return faceset_pb.UpdateFaceSetResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// faceRecognition.FaceSetService FaceSet数据的管理
//
// FaceSet用于存储管理Face数据以支持相关匹配与搜索功能
//
// 开发管理平台功能参考: http://10.10.10.2/face/face-set
var FaceSetServiceService = exports.FaceSetServiceService = {
  // NewFaceSet 创建一个FaceSet
  newFaceSet: {
    path: '/faceRecognition.FaceSetService/NewFaceSet',
    requestStream: false,
    responseStream: false,
    requestType: faceset_pb.NewFaceSetRequest,
    responseType: faceset_pb.NewFaceSetResponse,
    requestSerialize: serialize_faceRecognition_NewFaceSetRequest,
    requestDeserialize: deserialize_faceRecognition_NewFaceSetRequest,
    responseSerialize: serialize_faceRecognition_NewFaceSetResponse,
    responseDeserialize: deserialize_faceRecognition_NewFaceSetResponse,
  },
  // DeleteFaceSet 删除FaceSet
  deleteFaceSet: {
    path: '/faceRecognition.FaceSetService/DeleteFaceSet',
    requestStream: false,
    responseStream: false,
    requestType: faceset_pb.DeleteFaceSetRequest,
    responseType: faceset_pb.DeleteFaceSetResponse,
    requestSerialize: serialize_faceRecognition_DeleteFaceSetRequest,
    requestDeserialize: deserialize_faceRecognition_DeleteFaceSetRequest,
    responseSerialize: serialize_faceRecognition_DeleteFaceSetResponse,
    responseDeserialize: deserialize_faceRecognition_DeleteFaceSetResponse,
  },
  // UpdateFaceSet 更新FaceSet信息
  updateFaceSet: {
    path: '/faceRecognition.FaceSetService/UpdateFaceSet',
    requestStream: false,
    responseStream: false,
    requestType: faceset_pb.UpdateFaceSetRequest,
    responseType: faceset_pb.UpdateFaceSetResponse,
    requestSerialize: serialize_faceRecognition_UpdateFaceSetRequest,
    requestDeserialize: deserialize_faceRecognition_UpdateFaceSetRequest,
    responseSerialize: serialize_faceRecognition_UpdateFaceSetResponse,
    responseDeserialize: deserialize_faceRecognition_UpdateFaceSetResponse,
  },
  // ListFaceSets 获取FaceSet列表
  listFaceSets: {
    path: '/faceRecognition.FaceSetService/ListFaceSets',
    requestStream: false,
    responseStream: false,
    requestType: faceset_pb.ListFaceSetsRequest,
    responseType: faceset_pb.ListFaceSetsResponse,
    requestSerialize: serialize_faceRecognition_ListFaceSetsRequest,
    requestDeserialize: deserialize_faceRecognition_ListFaceSetsRequest,
    responseSerialize: serialize_faceRecognition_ListFaceSetsResponse,
    responseDeserialize: deserialize_faceRecognition_ListFaceSetsResponse,
  },
  // AddFace 识别人脸图片并将结果添加至FaceSet中
  addFace: {
    path: '/faceRecognition.FaceSetService/AddFace',
    requestStream: false,
    responseStream: false,
    requestType: faceset_pb.AddFaceRequest,
    responseType: faceset_pb.AddFaceResponse,
    requestSerialize: serialize_faceRecognition_AddFaceRequest,
    requestDeserialize: deserialize_faceRecognition_AddFaceRequest,
    responseSerialize: serialize_faceRecognition_AddFaceResponse,
    responseDeserialize: deserialize_faceRecognition_AddFaceResponse,
  },
  // RemoveFace 从FaceSet中移除Face
  removeFace: {
    path: '/faceRecognition.FaceSetService/RemoveFace',
    requestStream: false,
    responseStream: false,
    requestType: faceset_pb.RemoveFaceRequest,
    responseType: faceset_pb.RemoveFaceResponse,
    requestSerialize: serialize_faceRecognition_RemoveFaceRequest,
    requestDeserialize: deserialize_faceRecognition_RemoveFaceRequest,
    responseSerialize: serialize_faceRecognition_RemoveFaceResponse,
    responseDeserialize: deserialize_faceRecognition_RemoveFaceResponse,
  },
  // FaceDetail 获取FaceSet中的Face
  faceDetail: {
    path: '/faceRecognition.FaceSetService/FaceDetail',
    requestStream: false,
    responseStream: false,
    requestType: faceset_pb.FaceDetailRequest,
    responseType: faceset_pb.FaceDetailResponse,
    requestSerialize: serialize_faceRecognition_FaceDetailRequest,
    requestDeserialize: deserialize_faceRecognition_FaceDetailRequest,
    responseSerialize: serialize_faceRecognition_FaceDetailResponse,
    responseDeserialize: deserialize_faceRecognition_FaceDetailResponse,
  },
  // ListFaceDetails 获取FaceSet中的Face列表
  listFaceDetails: {
    path: '/faceRecognition.FaceSetService/ListFaceDetails',
    requestStream: false,
    responseStream: false,
    requestType: faceset_pb.ListFaceDetailsRequest,
    responseType: faceset_pb.ListFaceDetailsResponse,
    requestSerialize: serialize_faceRecognition_ListFaceDetailsRequest,
    requestDeserialize: deserialize_faceRecognition_ListFaceDetailsRequest,
    responseSerialize: serialize_faceRecognition_ListFaceDetailsResponse,
    responseDeserialize: deserialize_faceRecognition_ListFaceDetailsResponse,
  },
};

exports.FaceSetServiceClient = grpc.makeGenericClientConstructor(FaceSetServiceService);
