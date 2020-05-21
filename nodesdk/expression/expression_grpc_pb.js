// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var expression_pb = require('./expression_pb.js');

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

function serialize_expressionService_StateRequest(arg) {
  if (!(arg instanceof expression_pb.StateRequest)) {
    throw new Error('Expected argument of type expressionService.StateRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_expressionService_StateRequest(buffer_arg) {
  return expression_pb.StateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_expressionService_StateResponse(arg) {
  if (!(arg instanceof expression_pb.StateResponse)) {
    throw new Error('Expected argument of type expressionService.StateResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_expressionService_StateResponse(buffer_arg) {
  return expression_pb.StateResponse.deserializeBinary(new Uint8Array(buffer_arg));
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

function serialize_expressionService_SwitchRequest(arg) {
  if (!(arg instanceof expression_pb.SwitchRequest)) {
    throw new Error('Expected argument of type expressionService.SwitchRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_expressionService_SwitchRequest(buffer_arg) {
  return expression_pb.SwitchRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_expressionService_SwitchResponse(arg) {
  if (!(arg instanceof expression_pb.SwitchResponse)) {
    throw new Error('Expected argument of type expressionService.SwitchResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_expressionService_SwitchResponse(buffer_arg) {
  return expression_pb.SwitchResponse.deserializeBinary(new Uint8Array(buffer_arg));
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


// expressionService.ExpressionService 表情管理
//
// 开发管理平台功能参考: http://10.10.10.2/expression/
var ExpressionServiceService = exports.ExpressionServiceService = {
  // PlayExpressions 播放表情组合
  //
  // 单套表情限制请参考UploadExpressionFile方法，
  // 更为复杂的表情设计可基于多个最小化表情进行组合
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
  // StopExpression 停止表情播放
  //
  // 此方法将表现为播放至当前帧终止，不会恢复为当前表情的首帧
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
  // UploadExpressionFile 上传表情文件
  //
  // 上传表情图片zip文件，用于构建新的表情
  //
  // 表情文件为zip格式数据，如Example.zip文件上传后该表情将命名为"Example"，命名可通过Rename方法进行更改
  //
  // windows用户请在表情目录中选中preview.png, left目录，right目录，直接压缩为zip文件，不支持包含父目录
  //
  // 表情包目录示例：
  // left与right目录图片数量最大限制为各10张
  // ├── preview.png # 表情预览文件，与表情数据无关，仅作为预览图用
  // │
  // ├── left # 左眼表情数据
  // │   ├── 1.png
  // │   ├── 2.png
  // │   ├── 3.png
  // │   ├── 4.png
  // │   └── 5.png
  // │
  // └── right # 右眼表情数据
  //    ├── 1.png
  //    ├── 2.png
  //    ├── 3.png
  //    ├── 4.png
  //    └── 5.png
  //
  // 网关不包含当前方法，HTTP上传请使用以下接口
  // POST /api/v2/expression/upload_expression_file
  // Content-Type: application/x-www-form-urlencoded
  // Body:
  //   - name: String
  //   - e: File, e.g. Example.zip
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
  // Rename 对已上传的表情进行重命名
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
  // ListExpressions 获取表情列表
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
  // DeleteExpressions 删除表情列表
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
  // State 获取当前表情模块状态
  state: {
    path: '/expressionService.ExpressionService/State',
    requestStream: false,
    responseStream: false,
    requestType: expression_pb.StateRequest,
    responseType: expression_pb.StateResponse,
    requestSerialize: serialize_expressionService_StateRequest,
    requestDeserialize: deserialize_expressionService_StateRequest,
    responseSerialize: serialize_expressionService_StateResponse,
    responseDeserialize: deserialize_expressionService_StateResponse,
  },
  // Switch 控制表情的开关
  // 关闭时将表现为黑屏
  switch: {
    path: '/expressionService.ExpressionService/Switch',
    requestStream: false,
    responseStream: false,
    requestType: expression_pb.SwitchRequest,
    responseType: expression_pb.SwitchResponse,
    requestSerialize: serialize_expressionService_SwitchRequest,
    requestDeserialize: deserialize_expressionService_SwitchRequest,
    responseSerialize: serialize_expressionService_SwitchResponse,
    responseDeserialize: deserialize_expressionService_SwitchResponse,
  },
};

exports.ExpressionServiceClient = grpc.makeGenericClientConstructor(ExpressionServiceService);
