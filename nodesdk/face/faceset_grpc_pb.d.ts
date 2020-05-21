// GENERATED CODE -- DO NOT EDIT!

// package: faceRecognition
// file: faceset.proto

import * as faceset_pb from "./faceset_pb";
import * as grpc from "grpc";

interface IFaceSetServiceService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  newFaceSet: grpc.MethodDefinition<faceset_pb.NewFaceSetRequest, faceset_pb.NewFaceSetResponse>;
  deleteFaceSet: grpc.MethodDefinition<faceset_pb.DeleteFaceSetRequest, faceset_pb.DeleteFaceSetResponse>;
  updateFaceSet: grpc.MethodDefinition<faceset_pb.UpdateFaceSetRequest, faceset_pb.UpdateFaceSetResponse>;
  listFaceSets: grpc.MethodDefinition<faceset_pb.ListFaceSetsRequest, faceset_pb.ListFaceSetsResponse>;
  addFace: grpc.MethodDefinition<faceset_pb.AddFaceRequest, faceset_pb.AddFaceResponse>;
  removeFace: grpc.MethodDefinition<faceset_pb.RemoveFaceRequest, faceset_pb.RemoveFaceResponse>;
  faceDetail: grpc.MethodDefinition<faceset_pb.FaceDetailRequest, faceset_pb.FaceDetailResponse>;
  listFaceDetails: grpc.MethodDefinition<faceset_pb.ListFaceDetailsRequest, faceset_pb.ListFaceDetailsResponse>;
}

export const FaceSetServiceService: IFaceSetServiceService;

export class FaceSetServiceClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  newFaceSet(argument: faceset_pb.NewFaceSetRequest, callback: grpc.requestCallback<faceset_pb.NewFaceSetResponse>): grpc.ClientUnaryCall;
  newFaceSet(argument: faceset_pb.NewFaceSetRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<faceset_pb.NewFaceSetResponse>): grpc.ClientUnaryCall;
  newFaceSet(argument: faceset_pb.NewFaceSetRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<faceset_pb.NewFaceSetResponse>): grpc.ClientUnaryCall;
  deleteFaceSet(argument: faceset_pb.DeleteFaceSetRequest, callback: grpc.requestCallback<faceset_pb.DeleteFaceSetResponse>): grpc.ClientUnaryCall;
  deleteFaceSet(argument: faceset_pb.DeleteFaceSetRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<faceset_pb.DeleteFaceSetResponse>): grpc.ClientUnaryCall;
  deleteFaceSet(argument: faceset_pb.DeleteFaceSetRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<faceset_pb.DeleteFaceSetResponse>): grpc.ClientUnaryCall;
  updateFaceSet(argument: faceset_pb.UpdateFaceSetRequest, callback: grpc.requestCallback<faceset_pb.UpdateFaceSetResponse>): grpc.ClientUnaryCall;
  updateFaceSet(argument: faceset_pb.UpdateFaceSetRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<faceset_pb.UpdateFaceSetResponse>): grpc.ClientUnaryCall;
  updateFaceSet(argument: faceset_pb.UpdateFaceSetRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<faceset_pb.UpdateFaceSetResponse>): grpc.ClientUnaryCall;
  listFaceSets(argument: faceset_pb.ListFaceSetsRequest, callback: grpc.requestCallback<faceset_pb.ListFaceSetsResponse>): grpc.ClientUnaryCall;
  listFaceSets(argument: faceset_pb.ListFaceSetsRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<faceset_pb.ListFaceSetsResponse>): grpc.ClientUnaryCall;
  listFaceSets(argument: faceset_pb.ListFaceSetsRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<faceset_pb.ListFaceSetsResponse>): grpc.ClientUnaryCall;
  addFace(argument: faceset_pb.AddFaceRequest, callback: grpc.requestCallback<faceset_pb.AddFaceResponse>): grpc.ClientUnaryCall;
  addFace(argument: faceset_pb.AddFaceRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<faceset_pb.AddFaceResponse>): grpc.ClientUnaryCall;
  addFace(argument: faceset_pb.AddFaceRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<faceset_pb.AddFaceResponse>): grpc.ClientUnaryCall;
  removeFace(argument: faceset_pb.RemoveFaceRequest, callback: grpc.requestCallback<faceset_pb.RemoveFaceResponse>): grpc.ClientUnaryCall;
  removeFace(argument: faceset_pb.RemoveFaceRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<faceset_pb.RemoveFaceResponse>): grpc.ClientUnaryCall;
  removeFace(argument: faceset_pb.RemoveFaceRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<faceset_pb.RemoveFaceResponse>): grpc.ClientUnaryCall;
  faceDetail(argument: faceset_pb.FaceDetailRequest, callback: grpc.requestCallback<faceset_pb.FaceDetailResponse>): grpc.ClientUnaryCall;
  faceDetail(argument: faceset_pb.FaceDetailRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<faceset_pb.FaceDetailResponse>): grpc.ClientUnaryCall;
  faceDetail(argument: faceset_pb.FaceDetailRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<faceset_pb.FaceDetailResponse>): grpc.ClientUnaryCall;
  listFaceDetails(argument: faceset_pb.ListFaceDetailsRequest, callback: grpc.requestCallback<faceset_pb.ListFaceDetailsResponse>): grpc.ClientUnaryCall;
  listFaceDetails(argument: faceset_pb.ListFaceDetailsRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<faceset_pb.ListFaceDetailsResponse>): grpc.ClientUnaryCall;
  listFaceDetails(argument: faceset_pb.ListFaceDetailsRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<faceset_pb.ListFaceDetailsResponse>): grpc.ClientUnaryCall;
}
