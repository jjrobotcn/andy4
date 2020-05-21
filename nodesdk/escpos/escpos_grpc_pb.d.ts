// GENERATED CODE -- DO NOT EDIT!

// package: escposService
// file: escpos.proto

import * as escpos_pb from "./escpos_pb";
import * as grpc from "grpc";

interface IEscPosServiceService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  printRaw: grpc.MethodDefinition<escpos_pb.PrintRawRequest, escpos_pb.PrintRawResponse>;
  printElements: grpc.MethodDefinition<escpos_pb.PrintElementsRequest, escpos_pb.PrintElementsResponse>;
  printHtmlTemplate: grpc.MethodDefinition<escpos_pb.PrintHtmlTemplateRequest, escpos_pb.PrintHtmlTemplateResponse>;
  newHtmlTemplate: grpc.MethodDefinition<escpos_pb.NewHtmlTemplateRequest, escpos_pb.NewHtmlTemplateResponse>;
  listHtmlTemplates: grpc.MethodDefinition<escpos_pb.ListHtmlTemplatesRequest, escpos_pb.ListHtmlTemplatesResponse>;
  getHtmlTemplate: grpc.MethodDefinition<escpos_pb.GetHtmlTemplateRequest, escpos_pb.GetHtmlTemplateResponse>;
  updateHtmlTemplate: grpc.MethodDefinition<escpos_pb.UpdateHtmlTemplateRequest, escpos_pb.UpdateHtmlTemplateResponse>;
  deleteHtmlTemplates: grpc.MethodDefinition<escpos_pb.DeleteHtmlTemplatesRequest, escpos_pb.DeleteHtmlTemplatesResponse>;
}

export const EscPosServiceService: IEscPosServiceService;

export class EscPosServiceClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  printRaw(argument: escpos_pb.PrintRawRequest, callback: grpc.requestCallback<escpos_pb.PrintRawResponse>): grpc.ClientUnaryCall;
  printRaw(argument: escpos_pb.PrintRawRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<escpos_pb.PrintRawResponse>): grpc.ClientUnaryCall;
  printRaw(argument: escpos_pb.PrintRawRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<escpos_pb.PrintRawResponse>): grpc.ClientUnaryCall;
  printElements(argument: escpos_pb.PrintElementsRequest, callback: grpc.requestCallback<escpos_pb.PrintElementsResponse>): grpc.ClientUnaryCall;
  printElements(argument: escpos_pb.PrintElementsRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<escpos_pb.PrintElementsResponse>): grpc.ClientUnaryCall;
  printElements(argument: escpos_pb.PrintElementsRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<escpos_pb.PrintElementsResponse>): grpc.ClientUnaryCall;
  printHtmlTemplate(argument: escpos_pb.PrintHtmlTemplateRequest, callback: grpc.requestCallback<escpos_pb.PrintHtmlTemplateResponse>): grpc.ClientUnaryCall;
  printHtmlTemplate(argument: escpos_pb.PrintHtmlTemplateRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<escpos_pb.PrintHtmlTemplateResponse>): grpc.ClientUnaryCall;
  printHtmlTemplate(argument: escpos_pb.PrintHtmlTemplateRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<escpos_pb.PrintHtmlTemplateResponse>): grpc.ClientUnaryCall;
  newHtmlTemplate(argument: escpos_pb.NewHtmlTemplateRequest, callback: grpc.requestCallback<escpos_pb.NewHtmlTemplateResponse>): grpc.ClientUnaryCall;
  newHtmlTemplate(argument: escpos_pb.NewHtmlTemplateRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<escpos_pb.NewHtmlTemplateResponse>): grpc.ClientUnaryCall;
  newHtmlTemplate(argument: escpos_pb.NewHtmlTemplateRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<escpos_pb.NewHtmlTemplateResponse>): grpc.ClientUnaryCall;
  listHtmlTemplates(argument: escpos_pb.ListHtmlTemplatesRequest, callback: grpc.requestCallback<escpos_pb.ListHtmlTemplatesResponse>): grpc.ClientUnaryCall;
  listHtmlTemplates(argument: escpos_pb.ListHtmlTemplatesRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<escpos_pb.ListHtmlTemplatesResponse>): grpc.ClientUnaryCall;
  listHtmlTemplates(argument: escpos_pb.ListHtmlTemplatesRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<escpos_pb.ListHtmlTemplatesResponse>): grpc.ClientUnaryCall;
  getHtmlTemplate(argument: escpos_pb.GetHtmlTemplateRequest, callback: grpc.requestCallback<escpos_pb.GetHtmlTemplateResponse>): grpc.ClientUnaryCall;
  getHtmlTemplate(argument: escpos_pb.GetHtmlTemplateRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<escpos_pb.GetHtmlTemplateResponse>): grpc.ClientUnaryCall;
  getHtmlTemplate(argument: escpos_pb.GetHtmlTemplateRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<escpos_pb.GetHtmlTemplateResponse>): grpc.ClientUnaryCall;
  updateHtmlTemplate(argument: escpos_pb.UpdateHtmlTemplateRequest, callback: grpc.requestCallback<escpos_pb.UpdateHtmlTemplateResponse>): grpc.ClientUnaryCall;
  updateHtmlTemplate(argument: escpos_pb.UpdateHtmlTemplateRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<escpos_pb.UpdateHtmlTemplateResponse>): grpc.ClientUnaryCall;
  updateHtmlTemplate(argument: escpos_pb.UpdateHtmlTemplateRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<escpos_pb.UpdateHtmlTemplateResponse>): grpc.ClientUnaryCall;
  deleteHtmlTemplates(argument: escpos_pb.DeleteHtmlTemplatesRequest, callback: grpc.requestCallback<escpos_pb.DeleteHtmlTemplatesResponse>): grpc.ClientUnaryCall;
  deleteHtmlTemplates(argument: escpos_pb.DeleteHtmlTemplatesRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<escpos_pb.DeleteHtmlTemplatesResponse>): grpc.ClientUnaryCall;
  deleteHtmlTemplates(argument: escpos_pb.DeleteHtmlTemplatesRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<escpos_pb.DeleteHtmlTemplatesResponse>): grpc.ClientUnaryCall;
}
