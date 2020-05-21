// GENERATED CODE -- DO NOT EDIT!

// package: kvstore
// file: kvstore.proto

import * as kvstore_pb from "./kvstore_pb";
import * as grpc from "grpc";

interface IKVStoreService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  put: grpc.MethodDefinition<kvstore_pb.PutRequest, kvstore_pb.PutResponse>;
  get: grpc.MethodDefinition<kvstore_pb.GetRequest, kvstore_pb.GetResponse>;
  getPrefix: grpc.MethodDefinition<kvstore_pb.GetPrefixRequest, kvstore_pb.GetPrefixResponse>;
  getPrefixStream: grpc.MethodDefinition<kvstore_pb.GetPrefixStreamRequest, kvstore_pb.GetPrefixStreamResponse>;
  delete: grpc.MethodDefinition<kvstore_pb.DeleteRequest, kvstore_pb.DeleteResponse>;
}

export const KVStoreService: IKVStoreService;

export class KVStoreClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  put(argument: kvstore_pb.PutRequest, callback: grpc.requestCallback<kvstore_pb.PutResponse>): grpc.ClientUnaryCall;
  put(argument: kvstore_pb.PutRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<kvstore_pb.PutResponse>): grpc.ClientUnaryCall;
  put(argument: kvstore_pb.PutRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<kvstore_pb.PutResponse>): grpc.ClientUnaryCall;
  get(argument: kvstore_pb.GetRequest, callback: grpc.requestCallback<kvstore_pb.GetResponse>): grpc.ClientUnaryCall;
  get(argument: kvstore_pb.GetRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<kvstore_pb.GetResponse>): grpc.ClientUnaryCall;
  get(argument: kvstore_pb.GetRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<kvstore_pb.GetResponse>): grpc.ClientUnaryCall;
  getPrefix(argument: kvstore_pb.GetPrefixRequest, callback: grpc.requestCallback<kvstore_pb.GetPrefixResponse>): grpc.ClientUnaryCall;
  getPrefix(argument: kvstore_pb.GetPrefixRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<kvstore_pb.GetPrefixResponse>): grpc.ClientUnaryCall;
  getPrefix(argument: kvstore_pb.GetPrefixRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<kvstore_pb.GetPrefixResponse>): grpc.ClientUnaryCall;
  getPrefixStream(argument: kvstore_pb.GetPrefixStreamRequest, metadataOrOptions?: grpc.Metadata | grpc.CallOptions | null): grpc.ClientReadableStream<kvstore_pb.GetPrefixStreamResponse>;
  getPrefixStream(argument: kvstore_pb.GetPrefixStreamRequest, metadata?: grpc.Metadata | null, options?: grpc.CallOptions | null): grpc.ClientReadableStream<kvstore_pb.GetPrefixStreamResponse>;
  delete(argument: kvstore_pb.DeleteRequest, callback: grpc.requestCallback<kvstore_pb.DeleteResponse>): grpc.ClientUnaryCall;
  delete(argument: kvstore_pb.DeleteRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<kvstore_pb.DeleteResponse>): grpc.ClientUnaryCall;
  delete(argument: kvstore_pb.DeleteRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<kvstore_pb.DeleteResponse>): grpc.ClientUnaryCall;
}
