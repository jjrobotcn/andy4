// GENERATED CODE -- DO NOT EDIT!

// package: sensorService
// file: sensor.proto

import * as sensor_pb from "./sensor_pb";
import * as grpc from "grpc";

interface ISensorServiceService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  getDetect: grpc.MethodDefinition<sensor_pb.GetDetectRequest, sensor_pb.GetDetectResponse>;
  getMotionInduction: grpc.MethodDefinition<sensor_pb.GetMotionInductionRequest, sensor_pb.GetMotionInductionResponse>;
  getTouch: grpc.MethodDefinition<sensor_pb.GetTouchRequest, sensor_pb.GetTouchResponse>;
  getBumper: grpc.MethodDefinition<sensor_pb.GetBumperRequest, sensor_pb.GetBumperResponse>;
  getAnti: grpc.MethodDefinition<sensor_pb.GetAntiRequest, sensor_pb.GetAntiResponse>;
  getObs: grpc.MethodDefinition<sensor_pb.GetObsRequest, sensor_pb.GetObsResponse>;
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
  getBumper(argument: sensor_pb.GetBumperRequest, metadataOrOptions?: grpc.Metadata | grpc.CallOptions | null): grpc.ClientReadableStream<sensor_pb.GetBumperResponse>;
  getBumper(argument: sensor_pb.GetBumperRequest, metadata?: grpc.Metadata | null, options?: grpc.CallOptions | null): grpc.ClientReadableStream<sensor_pb.GetBumperResponse>;
  getAnti(argument: sensor_pb.GetAntiRequest, metadataOrOptions?: grpc.Metadata | grpc.CallOptions | null): grpc.ClientReadableStream<sensor_pb.GetAntiResponse>;
  getAnti(argument: sensor_pb.GetAntiRequest, metadata?: grpc.Metadata | null, options?: grpc.CallOptions | null): grpc.ClientReadableStream<sensor_pb.GetAntiResponse>;
  getObs(argument: sensor_pb.GetObsRequest, metadataOrOptions?: grpc.Metadata | grpc.CallOptions | null): grpc.ClientReadableStream<sensor_pb.GetObsResponse>;
  getObs(argument: sensor_pb.GetObsRequest, metadata?: grpc.Metadata | null, options?: grpc.CallOptions | null): grpc.ClientReadableStream<sensor_pb.GetObsResponse>;
}
