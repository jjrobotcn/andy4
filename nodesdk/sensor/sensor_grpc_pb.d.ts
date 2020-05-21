// GENERATED CODE -- DO NOT EDIT!

// package: sensorService
// file: sensor.proto

import * as sensor_pb from "./sensor_pb";
import * as grpc from "grpc";

interface ISensorServiceService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  getDetect: grpc.MethodDefinition<sensor_pb.GetDetectRequest, sensor_pb.GetDetectResponse>;
  getMotionInduction: grpc.MethodDefinition<sensor_pb.GetMotionInductionRequest, sensor_pb.GetMotionInductionResponse>;
  getTouch: grpc.MethodDefinition<sensor_pb.GetTouchRequest, sensor_pb.GetTouchResponse>;
  raw: grpc.MethodDefinition<sensor_pb.RawRequest, sensor_pb.RawResponse>;
}

export const SensorServiceService: ISensorServiceService;

export class SensorServiceClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  getDetect(argument: sensor_pb.GetDetectRequest, metadataOrOptions?: grpc.Metadata | grpc.CallOptions | null): grpc.ClientReadableStream<sensor_pb.GetDetectResponse>;
  getDetect(argument: sensor_pb.GetDetectRequest, metadata?: grpc.Metadata | null, options?: grpc.CallOptions | null): grpc.ClientReadableStream<sensor_pb.GetDetectResponse>;
  getMotionInduction(argument: sensor_pb.GetMotionInductionRequest, metadataOrOptions?: grpc.Metadata | grpc.CallOptions | null): grpc.ClientReadableStream<sensor_pb.GetMotionInductionResponse>;
  getMotionInduction(argument: sensor_pb.GetMotionInductionRequest, metadata?: grpc.Metadata | null, options?: grpc.CallOptions | null): grpc.ClientReadableStream<sensor_pb.GetMotionInductionResponse>;
  getTouch(argument: sensor_pb.GetTouchRequest, metadataOrOptions?: grpc.Metadata | grpc.CallOptions | null): grpc.ClientReadableStream<sensor_pb.GetTouchResponse>;
  getTouch(argument: sensor_pb.GetTouchRequest, metadata?: grpc.Metadata | null, options?: grpc.CallOptions | null): grpc.ClientReadableStream<sensor_pb.GetTouchResponse>;
  raw(argument: sensor_pb.RawRequest, metadataOrOptions?: grpc.Metadata | grpc.CallOptions | null): grpc.ClientReadableStream<sensor_pb.RawResponse>;
  raw(argument: sensor_pb.RawRequest, metadata?: grpc.Metadata | null, options?: grpc.CallOptions | null): grpc.ClientReadableStream<sensor_pb.RawResponse>;
}
