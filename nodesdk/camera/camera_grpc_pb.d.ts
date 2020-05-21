// GENERATED CODE -- DO NOT EDIT!

// package: cameraService
// file: camera.proto

import * as camera_pb from "./camera_pb";
import * as grpc from "grpc";

interface ICameraServiceService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  liveH264Stream: grpc.MethodDefinition<camera_pb.LiveH264StreamRequest, camera_pb.LiveH264StreamResponse>;
  latestImage: grpc.MethodDefinition<camera_pb.LatestImageRequest, camera_pb.LatestImageResponse>;
}

export const CameraServiceService: ICameraServiceService;

export class CameraServiceClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  liveH264Stream(argument: camera_pb.LiveH264StreamRequest, metadataOrOptions?: grpc.Metadata | grpc.CallOptions | null): grpc.ClientReadableStream<camera_pb.LiveH264StreamResponse>;
  liveH264Stream(argument: camera_pb.LiveH264StreamRequest, metadata?: grpc.Metadata | null, options?: grpc.CallOptions | null): grpc.ClientReadableStream<camera_pb.LiveH264StreamResponse>;
  latestImage(argument: camera_pb.LatestImageRequest, callback: grpc.requestCallback<camera_pb.LatestImageResponse>): grpc.ClientUnaryCall;
  latestImage(argument: camera_pb.LatestImageRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<camera_pb.LatestImageResponse>): grpc.ClientUnaryCall;
  latestImage(argument: camera_pb.LatestImageRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<camera_pb.LatestImageResponse>): grpc.ClientUnaryCall;
}
