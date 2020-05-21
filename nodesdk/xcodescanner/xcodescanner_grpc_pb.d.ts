// GENERATED CODE -- DO NOT EDIT!

// package: xcScannerService
// file: xcodescanner.proto

import * as xcodescanner_pb from "./xcodescanner_pb";
import * as grpc from "grpc";

interface IXCodeScannerServiceService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  getScanData: grpc.MethodDefinition<xcodescanner_pb.GetScanDataRequest, xcodescanner_pb.GetScanDataResponse>;
}

export const XCodeScannerServiceService: IXCodeScannerServiceService;

export class XCodeScannerServiceClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  getScanData(argument: xcodescanner_pb.GetScanDataRequest, metadataOrOptions?: grpc.Metadata | grpc.CallOptions | null): grpc.ClientReadableStream<xcodescanner_pb.GetScanDataResponse>;
  getScanData(argument: xcodescanner_pb.GetScanDataRequest, metadata?: grpc.Metadata | null, options?: grpc.CallOptions | null): grpc.ClientReadableStream<xcodescanner_pb.GetScanDataResponse>;
}
