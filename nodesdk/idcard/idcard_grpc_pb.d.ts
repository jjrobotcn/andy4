// GENERATED CODE -- DO NOT EDIT!

// package: idCardService
// file: idcard.proto

import * as idcard_pb from "./idcard_pb";
import * as grpc from "grpc";

interface IIDCardServiceService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  getIdInfo: grpc.MethodDefinition<idcard_pb.GetIdInfoRequest, idcard_pb.GetIdInfoResponse>;
}

export const IDCardServiceService: IIDCardServiceService;

export class IDCardServiceClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  getIdInfo(argument: idcard_pb.GetIdInfoRequest, metadataOrOptions?: grpc.Metadata | grpc.CallOptions | null): grpc.ClientReadableStream<idcard_pb.GetIdInfoResponse>;
  getIdInfo(argument: idcard_pb.GetIdInfoRequest, metadata?: grpc.Metadata | null, options?: grpc.CallOptions | null): grpc.ClientReadableStream<idcard_pb.GetIdInfoResponse>;
}
