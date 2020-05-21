// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var escpos_pb = require('./escpos_pb.js');

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


// escposService.EscPosService 小票打印设备的打印与模板管理
//
// 开发管理平台功能参考: http://10.10.10.2/esc_pos
var EscPosServiceService = exports.EscPosServiceService = {
  // PrintRaw 直接输入打印设备协议数据进行打印
  //
  // 用于支持外部程序直接通过协议方式打印
  // 此方法为最底层与硬件设备通讯的方法
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
  // PrintElements 通过Element对象描述内容进行打印
  //
  // Element基于行进行内容描述，通过描述每行的内容构建为打印数据
  // 不支持单行中图片与文字混合打印
  //
  // 底层方法为PrintRaw
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
  // PrintHtmlTemplate 通过Html预设模板内容进行插值打印
  //
  // 模板中请使用"{{}}"符号标记占位符
  // 如: 联系电话: {{tel}}
  //     参数: {"params": {"tel": "123"}}
  //
  // 底层方法为PrintElements
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
  // NewHtmlTemplate 新建一个Html模板
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
  // ListHtmlTemplates 获取Html模板列表
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
  // GetHtmlTemplate 获取Html模板
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
  // UpdateHtmlTemplate 更新Html模板
  //
  // HtmlTemplate基于(Quill)[https://quilljs.com]实现编辑部分
  //
  // 插值占位符为{{}}
  // 插值使用请参考PrintHtmlTemplate及PrintHtmlTemplateRequest
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
  // DeleteHtmlTemplates 删除Html模板列表
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
