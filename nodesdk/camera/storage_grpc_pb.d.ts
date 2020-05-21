// GENERATED CODE -- DO NOT EDIT!

// package: cameraService
// file: storage.proto

import * as storage_pb from "./storage_pb";
import * as grpc from "grpc";

interface IStorageService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  listDates: grpc.MethodDefinition<storage_pb.ListDatesRequest, storage_pb.ListDatesResponse>;
  listVideos: grpc.MethodDefinition<storage_pb.ListVideosRequest, storage_pb.ListVideosResponse>;
  getVideoFile: grpc.MethodDefinition<storage_pb.GetVideoFileRequest, storage_pb.GetVideoFileResponse>;
  deleteVideoFiles: grpc.MethodDefinition<storage_pb.DeleteVideoFilesRequest, storage_pb.DeleteVideoFilesResponse>;
}

export const StorageService: IStorageService;

export class StorageClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  listDates(argument: storage_pb.ListDatesRequest, callback: grpc.requestCallback<storage_pb.ListDatesResponse>): grpc.ClientUnaryCall;
  listDates(argument: storage_pb.ListDatesRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<storage_pb.ListDatesResponse>): grpc.ClientUnaryCall;
  listDates(argument: storage_pb.ListDatesRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<storage_pb.ListDatesResponse>): grpc.ClientUnaryCall;
  listVideos(argument: storage_pb.ListVideosRequest, callback: grpc.requestCallback<storage_pb.ListVideosResponse>): grpc.ClientUnaryCall;
  listVideos(argument: storage_pb.ListVideosRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<storage_pb.ListVideosResponse>): grpc.ClientUnaryCall;
  listVideos(argument: storage_pb.ListVideosRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<storage_pb.ListVideosResponse>): grpc.ClientUnaryCall;
  getVideoFile(argument: storage_pb.GetVideoFileRequest, metadataOrOptions?: grpc.Metadata | grpc.CallOptions | null): grpc.ClientReadableStream<storage_pb.GetVideoFileResponse>;
  getVideoFile(argument: storage_pb.GetVideoFileRequest, metadata?: grpc.Metadata | null, options?: grpc.CallOptions | null): grpc.ClientReadableStream<storage_pb.GetVideoFileResponse>;
  deleteVideoFiles(argument: storage_pb.DeleteVideoFilesRequest, callback: grpc.requestCallback<storage_pb.DeleteVideoFilesResponse>): grpc.ClientUnaryCall;
  deleteVideoFiles(argument: storage_pb.DeleteVideoFilesRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<storage_pb.DeleteVideoFilesResponse>): grpc.ClientUnaryCall;
  deleteVideoFiles(argument: storage_pb.DeleteVideoFilesRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<storage_pb.DeleteVideoFilesResponse>): grpc.ClientUnaryCall;
}
