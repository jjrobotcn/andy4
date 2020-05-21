// GENERATED CODE -- DO NOT EDIT!

// package: faceRecognition
// file: facedetect.proto

import * as facedetect_pb from "./facedetect_pb";
import * as grpc from "grpc";

interface IFaceDetectService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  fromImage: grpc.MethodDefinition<facedetect_pb.FromImageRequest, facedetect_pb.FromImageResponse>;
  onFaceDetect: grpc.MethodDefinition<facedetect_pb.OnFaceDetectRequest, facedetect_pb.OnFaceDetectResponse>;
  onFaceSetFaceDetect: grpc.MethodDefinition<facedetect_pb.OnFaceSetFaceDetectRequest, facedetect_pb.OnFaceSetFaceDetectResponse>;
}

export const FaceDetectService: IFaceDetectService;

export class FaceDetectClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  fromImage(argument: facedetect_pb.FromImageRequest, callback: grpc.requestCallback<facedetect_pb.FromImageResponse>): grpc.ClientUnaryCall;
  fromImage(argument: facedetect_pb.FromImageRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<facedetect_pb.FromImageResponse>): grpc.ClientUnaryCall;
  fromImage(argument: facedetect_pb.FromImageRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<facedetect_pb.FromImageResponse>): grpc.ClientUnaryCall;
  onFaceDetect(argument: facedetect_pb.OnFaceDetectRequest, metadataOrOptions?: grpc.Metadata | grpc.CallOptions | null): grpc.ClientReadableStream<facedetect_pb.OnFaceDetectResponse>;
  onFaceDetect(argument: facedetect_pb.OnFaceDetectRequest, metadata?: grpc.Metadata | null, options?: grpc.CallOptions | null): grpc.ClientReadableStream<facedetect_pb.OnFaceDetectResponse>;
  onFaceSetFaceDetect(argument: facedetect_pb.OnFaceSetFaceDetectRequest, metadataOrOptions?: grpc.Metadata | grpc.CallOptions | null): grpc.ClientReadableStream<facedetect_pb.OnFaceSetFaceDetectResponse>;
  onFaceSetFaceDetect(argument: facedetect_pb.OnFaceSetFaceDetectRequest, metadata?: grpc.Metadata | null, options?: grpc.CallOptions | null): grpc.ClientReadableStream<facedetect_pb.OnFaceSetFaceDetectResponse>;
}
