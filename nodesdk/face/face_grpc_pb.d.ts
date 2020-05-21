// GENERATED CODE -- DO NOT EDIT!

// package: faceRecognition
// file: face.proto

import * as face_pb from "./face_pb";
import * as grpc from "grpc";

interface IFaceServiceService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  compare: grpc.MethodDefinition<face_pb.CompareRequest, face_pb.CompareResponse>;
  search: grpc.MethodDefinition<face_pb.SearchRequest, face_pb.SearchResponse>;
}

export const FaceServiceService: IFaceServiceService;

export class FaceServiceClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  compare(argument: face_pb.CompareRequest, callback: grpc.requestCallback<face_pb.CompareResponse>): grpc.ClientUnaryCall;
  compare(argument: face_pb.CompareRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<face_pb.CompareResponse>): grpc.ClientUnaryCall;
  compare(argument: face_pb.CompareRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<face_pb.CompareResponse>): grpc.ClientUnaryCall;
  search(argument: face_pb.SearchRequest, callback: grpc.requestCallback<face_pb.SearchResponse>): grpc.ClientUnaryCall;
  search(argument: face_pb.SearchRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<face_pb.SearchResponse>): grpc.ClientUnaryCall;
  search(argument: face_pb.SearchRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<face_pb.SearchResponse>): grpc.ClientUnaryCall;
}
