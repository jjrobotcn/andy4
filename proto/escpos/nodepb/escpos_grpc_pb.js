// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var escpos_pb = require('./escpos_pb.js');
var google_api_annotations_pb = require('./google/api/annotations_pb.js');

function serialize_escposService_DeleteHtmlTemplatesRequest(arg) {
  if (!(arg instanceof escpos_pb.DeleteHtmlTemplatesRequest)) {
    throw new Error('Expected argument of type escposService.DeleteHtmlTemplatesRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_escposService_DeleteHtmlTemplatesRequest(buffer_arg) {
  return escpos_pb.DeleteHtmlTemplatesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_escposService_DeleteHtmlTemplatesResponse(arg) {
  if (!(arg instanceof escpos_pb.DeleteHtmlTemplatesResponse)) {
    throw new Error('Expected argument of type escposService.DeleteHtmlTemplatesResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_escposService_DeleteHtmlTemplatesResponse(buffer_arg) {
  return escpos_pb.DeleteHtmlTemplatesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_escposService_GetHtmlTemplateRequest(arg) {
  if (!(arg instanceof escpos_pb.GetHtmlTemplateRequest)) {
    throw new Error('Expected argument of type escposService.GetHtmlTemplateRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_escposService_GetHtmlTemplateRequest(buffer_arg) {
  return escpos_pb.GetHtmlTemplateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_escposService_GetHtmlTemplateResponse(arg) {
  if (!(arg instanceof escpos_pb.GetHtmlTemplateResponse)) {
    throw new Error('Expected argument of type escposService.GetHtmlTemplateResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_escposService_GetHtmlTemplateResponse(buffer_arg) {
  return escpos_pb.GetHtmlTemplateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_escposService_ListHtmlTemplatesRequest(arg) {
  if (!(arg instanceof escpos_pb.ListHtmlTemplatesRequest)) {
    throw new Error('Expected argument of type escposService.ListHtmlTemplatesRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_escposService_ListHtmlTemplatesRequest(buffer_arg) {
  return escpos_pb.ListHtmlTemplatesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_escposService_ListHtmlTemplatesResponse(arg) {
  if (!(arg instanceof escpos_pb.ListHtmlTemplatesResponse)) {
    throw new Error('Expected argument of type escposService.ListHtmlTemplatesResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_escposService_ListHtmlTemplatesResponse(buffer_arg) {
  return escpos_pb.ListHtmlTemplatesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_escposService_NewHtmlTemplateRequest(arg) {
  if (!(arg instanceof escpos_pb.NewHtmlTemplateRequest)) {
    throw new Error('Expected argument of type escposService.NewHtmlTemplateRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_escposService_NewHtmlTemplateRequest(buffer_arg) {
  return escpos_pb.NewHtmlTemplateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_escposService_NewHtmlTemplateResponse(arg) {
  if (!(arg instanceof escpos_pb.NewHtmlTemplateResponse)) {
    throw new Error('Expected argument of type escposService.NewHtmlTemplateResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_escposService_NewHtmlTemplateResponse(buffer_arg) {
  return escpos_pb.NewHtmlTemplateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_escposService_PrintElementsRequest(arg) {
  if (!(arg instanceof escpos_pb.PrintElementsRequest)) {
    throw new Error('Expected argument of type escposService.PrintElementsRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_escposService_PrintElementsRequest(buffer_arg) {
  return escpos_pb.PrintElementsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_escposService_PrintElementsResponse(arg) {
  if (!(arg instanceof escpos_pb.PrintElementsResponse)) {
    throw new Error('Expected argument of type escposService.PrintElementsResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_escposService_PrintElementsResponse(buffer_arg) {
  return escpos_pb.PrintElementsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_escposService_PrintHtmlTemplateRequest(arg) {
  if (!(arg instanceof escpos_pb.PrintHtmlTemplateRequest)) {
    throw new Error('Expected argument of type escposService.PrintHtmlTemplateRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_escposService_PrintHtmlTemplateRequest(buffer_arg) {
  return escpos_pb.PrintHtmlTemplateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_escposService_PrintHtmlTemplateResponse(arg) {
  if (!(arg instanceof escpos_pb.PrintHtmlTemplateResponse)) {
    throw new Error('Expected argument of type escposService.PrintHtmlTemplateResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_escposService_PrintHtmlTemplateResponse(buffer_arg) {
  return escpos_pb.PrintHtmlTemplateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_escposService_PrintRawRequest(arg) {
  if (!(arg instanceof escpos_pb.PrintRawRequest)) {
    throw new Error('Expected argument of type escposService.PrintRawRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_escposService_PrintRawRequest(buffer_arg) {
  return escpos_pb.PrintRawRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_escposService_PrintRawResponse(arg) {
  if (!(arg instanceof escpos_pb.PrintRawResponse)) {
    throw new Error('Expected argument of type escposService.PrintRawResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_escposService_PrintRawResponse(buffer_arg) {
  return escpos_pb.PrintRawResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_escposService_UpdateHtmlTemplateRequest(arg) {
  if (!(arg instanceof escpos_pb.UpdateHtmlTemplateRequest)) {
    throw new Error('Expected argument of type escposService.UpdateHtmlTemplateRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_escposService_UpdateHtmlTemplateRequest(buffer_arg) {
  return escpos_pb.UpdateHtmlTemplateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_escposService_UpdateHtmlTemplateResponse(arg) {
  if (!(arg instanceof escpos_pb.UpdateHtmlTemplateResponse)) {
    throw new Error('Expected argument of type escposService.UpdateHtmlTemplateResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_escposService_UpdateHtmlTemplateResponse(buffer_arg) {
  return escpos_pb.UpdateHtmlTemplateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var EscPosServiceService = exports.EscPosServiceService = {
  // 打印bytes数据
  // 打印模板与打印对象方式不满足业务需求
  // 或希望接入其它已外部业务实现的打印组件时, 可通过此方法直接
  // 传入打印内容
  printRaw: {
    path: '/escposService.EscPosService/PrintRaw',
    requestStream: false,
    responseStream: false,
    requestType: escpos_pb.PrintRawRequest,
    responseType: escpos_pb.PrintRawResponse,
    requestSerialize: serialize_escposService_PrintRawRequest,
    requestDeserialize: deserialize_escposService_PrintRawRequest,
    responseSerialize: serialize_escposService_PrintRawResponse,
    responseDeserialize: deserialize_escposService_PrintRawResponse,
  },
  // 打印对象
  printElements: {
    path: '/escposService.EscPosService/PrintElements',
    requestStream: false,
    responseStream: false,
    requestType: escpos_pb.PrintElementsRequest,
    responseType: escpos_pb.PrintElementsResponse,
    requestSerialize: serialize_escposService_PrintElementsRequest,
    requestDeserialize: deserialize_escposService_PrintElementsRequest,
    responseSerialize: serialize_escposService_PrintElementsResponse,
    responseDeserialize: deserialize_escposService_PrintElementsResponse,
  },
  // 打印预设的html模板内容
  printHtmlTemplate: {
    path: '/escposService.EscPosService/PrintHtmlTemplate',
    requestStream: false,
    responseStream: false,
    requestType: escpos_pb.PrintHtmlTemplateRequest,
    responseType: escpos_pb.PrintHtmlTemplateResponse,
    requestSerialize: serialize_escposService_PrintHtmlTemplateRequest,
    requestDeserialize: deserialize_escposService_PrintHtmlTemplateRequest,
    responseSerialize: serialize_escposService_PrintHtmlTemplateResponse,
    responseDeserialize: deserialize_escposService_PrintHtmlTemplateResponse,
  },
  // 创建html模板
  newHtmlTemplate: {
    path: '/escposService.EscPosService/NewHtmlTemplate',
    requestStream: false,
    responseStream: false,
    requestType: escpos_pb.NewHtmlTemplateRequest,
    responseType: escpos_pb.NewHtmlTemplateResponse,
    requestSerialize: serialize_escposService_NewHtmlTemplateRequest,
    requestDeserialize: deserialize_escposService_NewHtmlTemplateRequest,
    responseSerialize: serialize_escposService_NewHtmlTemplateResponse,
    responseDeserialize: deserialize_escposService_NewHtmlTemplateResponse,
  },
  // 获取html模板列表
  listHtmlTemplates: {
    path: '/escposService.EscPosService/ListHtmlTemplates',
    requestStream: false,
    responseStream: false,
    requestType: escpos_pb.ListHtmlTemplatesRequest,
    responseType: escpos_pb.ListHtmlTemplatesResponse,
    requestSerialize: serialize_escposService_ListHtmlTemplatesRequest,
    requestDeserialize: deserialize_escposService_ListHtmlTemplatesRequest,
    responseSerialize: serialize_escposService_ListHtmlTemplatesResponse,
    responseDeserialize: deserialize_escposService_ListHtmlTemplatesResponse,
  },
  // 获取指定html模板内容
  getHtmlTemplate: {
    path: '/escposService.EscPosService/GetHtmlTemplate',
    requestStream: false,
    responseStream: false,
    requestType: escpos_pb.GetHtmlTemplateRequest,
    responseType: escpos_pb.GetHtmlTemplateResponse,
    requestSerialize: serialize_escposService_GetHtmlTemplateRequest,
    requestDeserialize: deserialize_escposService_GetHtmlTemplateRequest,
    responseSerialize: serialize_escposService_GetHtmlTemplateResponse,
    responseDeserialize: deserialize_escposService_GetHtmlTemplateResponse,
  },
  // 更新html模板
  updateHtmlTemplate: {
    path: '/escposService.EscPosService/UpdateHtmlTemplate',
    requestStream: false,
    responseStream: false,
    requestType: escpos_pb.UpdateHtmlTemplateRequest,
    responseType: escpos_pb.UpdateHtmlTemplateResponse,
    requestSerialize: serialize_escposService_UpdateHtmlTemplateRequest,
    requestDeserialize: deserialize_escposService_UpdateHtmlTemplateRequest,
    responseSerialize: serialize_escposService_UpdateHtmlTemplateResponse,
    responseDeserialize: deserialize_escposService_UpdateHtmlTemplateResponse,
  },
  // 删除html模板
  deleteHtmlTemplates: {
    path: '/escposService.EscPosService/DeleteHtmlTemplates',
    requestStream: false,
    responseStream: false,
    requestType: escpos_pb.DeleteHtmlTemplatesRequest,
    responseType: escpos_pb.DeleteHtmlTemplatesResponse,
    requestSerialize: serialize_escposService_DeleteHtmlTemplatesRequest,
    requestDeserialize: deserialize_escposService_DeleteHtmlTemplatesRequest,
    responseSerialize: serialize_escposService_DeleteHtmlTemplatesResponse,
    responseDeserialize: deserialize_escposService_DeleteHtmlTemplatesResponse,
  },
};

exports.EscPosServiceClient = grpc.makeGenericClientConstructor(EscPosServiceService);
