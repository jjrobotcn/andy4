// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var expression_pb = require('./expression_pb.js');
var google_api_annotations_pb = require('./google/api/annotations_pb.js');

function serialize_expressionService_DeleteExpressionsRequest(arg) {
  if (!(arg instanceof expression_pb.DeleteExpressionsRequest)) {
    throw new Error('Expected argument of type expressionService.DeleteExpressionsRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_expressionService_DeleteExpressionsRequest(buffer_arg) {
  return expression_pb.DeleteExpressionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_expressionService_DeleteExpressionsResponse(arg) {
  if (!(arg instanceof expression_pb.DeleteExpressionsResponse)) {
    throw new Error('Expected argument of type expressionService.DeleteExpressionsResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_expressionService_DeleteExpressionsResponse(buffer_arg) {
  return expression_pb.DeleteExpressionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_expressionService_ListExpressionsRequest(arg) {
  if (!(arg instanceof expression_pb.ListExpressionsRequest)) {
    throw new Error('Expected argument of type expressionService.ListExpressionsRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_expressionService_ListExpressionsRequest(buffer_arg) {
  return expression_pb.ListExpressionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_expressionService_ListExpressionsResponse(arg) {
  if (!(arg instanceof expression_pb.ListExpressionsResponse)) {
    throw new Error('Expected argument of type expressionService.ListExpressionsResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_expressionService_ListExpressionsResponse(buffer_arg) {
  return expression_pb.ListExpressionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_expressionService_PlayExpressionsRequest(arg) {
  if (!(arg instanceof expression_pb.PlayExpressionsRequest)) {
    throw new Error('Expected argument of type expressionService.PlayExpressionsRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_expressionService_PlayExpressionsRequest(buffer_arg) {
  return expression_pb.PlayExpressionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_expressionService_PlayExpressionsResponse(arg) {
  if (!(arg instanceof expression_pb.PlayExpressionsResponse)) {
    throw new Error('Expected argument of type expressionService.PlayExpressionsResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_expressionService_PlayExpressionsResponse(buffer_arg) {
  return expression_pb.PlayExpressionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_expressionService_RenameRequest(arg) {
  if (!(arg instanceof expression_pb.RenameRequest)) {
    throw new Error('Expected argument of type expressionService.RenameRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_expressionService_RenameRequest(buffer_arg) {
  return expression_pb.RenameRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_expressionService_RenameResponse(arg) {
  if (!(arg instanceof expression_pb.RenameResponse)) {
    throw new Error('Expected argument of type expressionService.RenameResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_expressionService_RenameResponse(buffer_arg) {
  return expression_pb.RenameResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_expressionService_StopExpressionRequest(arg) {
  if (!(arg instanceof expression_pb.StopExpressionRequest)) {
    throw new Error('Expected argument of type expressionService.StopExpressionRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_expressionService_StopExpressionRequest(buffer_arg) {
  return expression_pb.StopExpressionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_expressionService_StopExpressionResponse(arg) {
  if (!(arg instanceof expression_pb.StopExpressionResponse)) {
    throw new Error('Expected argument of type expressionService.StopExpressionResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_expressionService_StopExpressionResponse(buffer_arg) {
  return expression_pb.StopExpressionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_expressionService_UploadExpressionFileRequest(arg) {
  if (!(arg instanceof expression_pb.UploadExpressionFileRequest)) {
    throw new Error('Expected argument of type expressionService.UploadExpressionFileRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_expressionService_UploadExpressionFileRequest(buffer_arg) {
  return expression_pb.UploadExpressionFileRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_expressionService_UploadExpressionFileResponse(arg) {
  if (!(arg instanceof expression_pb.UploadExpressionFileResponse)) {
    throw new Error('Expected argument of type expressionService.UploadExpressionFileResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_expressionService_UploadExpressionFileResponse(buffer_arg) {
  return expression_pb.UploadExpressionFileResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var ExpressionServiceService = exports.ExpressionServiceService = {
  // 播放表情
  playExpressions: {
    path: '/expressionService.ExpressionService/PlayExpressions',
    requestStream: false,
    responseStream: false,
    requestType: expression_pb.PlayExpressionsRequest,
    responseType: expression_pb.PlayExpressionsResponse,
    requestSerialize: serialize_expressionService_PlayExpressionsRequest,
    requestDeserialize: deserialize_expressionService_PlayExpressionsRequest,
    responseSerialize: serialize_expressionService_PlayExpressionsResponse,
    responseDeserialize: deserialize_expressionService_PlayExpressionsResponse,
  },
  // 停止表情
  stopExpression: {
    path: '/expressionService.ExpressionService/StopExpression',
    requestStream: false,
    responseStream: false,
    requestType: expression_pb.StopExpressionRequest,
    responseType: expression_pb.StopExpressionResponse,
    requestSerialize: serialize_expressionService_StopExpressionRequest,
    requestDeserialize: deserialize_expressionService_StopExpressionRequest,
    responseSerialize: serialize_expressionService_StopExpressionResponse,
    responseDeserialize: deserialize_expressionService_StopExpressionResponse,
  },
  // 上传表情
  uploadExpressionFile: {
    path: '/expressionService.ExpressionService/UploadExpressionFile',
    requestStream: false,
    responseStream: false,
    requestType: expression_pb.UploadExpressionFileRequest,
    responseType: expression_pb.UploadExpressionFileResponse,
    requestSerialize: serialize_expressionService_UploadExpressionFileRequest,
    requestDeserialize: deserialize_expressionService_UploadExpressionFileRequest,
    responseSerialize: serialize_expressionService_UploadExpressionFileResponse,
    responseDeserialize: deserialize_expressionService_UploadExpressionFileResponse,
  },
  // 表情重命名
  // >= v1.1.0
  rename: {
    path: '/expressionService.ExpressionService/Rename',
    requestStream: false,
    responseStream: false,
    requestType: expression_pb.RenameRequest,
    responseType: expression_pb.RenameResponse,
    requestSerialize: serialize_expressionService_RenameRequest,
    requestDeserialize: deserialize_expressionService_RenameRequest,
    responseSerialize: serialize_expressionService_RenameResponse,
    responseDeserialize: deserialize_expressionService_RenameResponse,
  },
  // 获取表情数据
  listExpressions: {
    path: '/expressionService.ExpressionService/ListExpressions',
    requestStream: false,
    responseStream: false,
    requestType: expression_pb.ListExpressionsRequest,
    responseType: expression_pb.ListExpressionsResponse,
    requestSerialize: serialize_expressionService_ListExpressionsRequest,
    requestDeserialize: deserialize_expressionService_ListExpressionsRequest,
    responseSerialize: serialize_expressionService_ListExpressionsResponse,
    responseDeserialize: deserialize_expressionService_ListExpressionsResponse,
  },
  // 删除表情
  deleteExpressions: {
    path: '/expressionService.ExpressionService/DeleteExpressions',
    requestStream: false,
    responseStream: false,
    requestType: expression_pb.DeleteExpressionsRequest,
    responseType: expression_pb.DeleteExpressionsResponse,
    requestSerialize: serialize_expressionService_DeleteExpressionsRequest,
    requestDeserialize: deserialize_expressionService_DeleteExpressionsRequest,
    responseSerialize: serialize_expressionService_DeleteExpressionsResponse,
    responseDeserialize: deserialize_expressionService_DeleteExpressionsResponse,
  },
};

exports.ExpressionServiceClient = grpc.makeGenericClientConstructor(ExpressionServiceService);
