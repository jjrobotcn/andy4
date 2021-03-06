// GENERATED CODE -- DO NOT EDIT!

// package: navService
// file: map.proto

import * as map_pb from "./map_pb";
import * as grpc from "grpc";

interface IMapService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  getMapInfo: grpc.MethodDefinition<map_pb.GetMapInfoRequest, map_pb.GetMapInfoResponse>;
  mapPositionStream: grpc.MethodDefinition<map_pb.MapPositionStreamRequest, map_pb.MapPositionStreamResponse>;
  locationReset: grpc.MethodDefinition<map_pb.LocationResetRequest, map_pb.LocationResetResponse>;
}

export const MapService: IMapService;

export class MapClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  getMapInfo(argument: map_pb.GetMapInfoRequest, callback: grpc.requestCallback<map_pb.GetMapInfoResponse>): grpc.ClientUnaryCall;
  getMapInfo(argument: map_pb.GetMapInfoRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<map_pb.GetMapInfoResponse>): grpc.ClientUnaryCall;
  getMapInfo(argument: map_pb.GetMapInfoRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<map_pb.GetMapInfoResponse>): grpc.ClientUnaryCall;
  mapPositionStream(argument: map_pb.MapPositionStreamRequest, metadataOrOptions?: grpc.Metadata | grpc.CallOptions | null): grpc.ClientReadableStream<map_pb.MapPositionStreamResponse>;
  mapPositionStream(argument: map_pb.MapPositionStreamRequest, metadata?: grpc.Metadata | null, options?: grpc.CallOptions | null): grpc.ClientReadableStream<map_pb.MapPositionStreamResponse>;
  locationReset(argument: map_pb.LocationResetRequest, callback: grpc.requestCallback<map_pb.LocationResetResponse>): grpc.ClientUnaryCall;
  locationReset(argument: map_pb.LocationResetRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<map_pb.LocationResetResponse>): grpc.ClientUnaryCall;
  locationReset(argument: map_pb.LocationResetRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<map_pb.LocationResetResponse>): grpc.ClientUnaryCall;
}
