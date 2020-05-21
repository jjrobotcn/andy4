// GENERATED CODE -- DO NOT EDIT!

// package: messagingService
// file: messaging.proto

import * as messaging_pb from "./messaging_pb";
import * as grpc from "grpc";

interface IMessagingServiceService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  messaging: grpc.MethodDefinition<messaging_pb.MessagingRequest, messaging_pb.MessagingResponse>;
}

export const MessagingServiceService: IMessagingServiceService;

export class MessagingServiceClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  messaging(metadataOrOptions?: grpc.Metadata | grpc.CallOptions | null): grpc.ClientDuplexStream<messaging_pb.MessagingRequest, messaging_pb.MessagingResponse>;
  messaging(metadata?: grpc.Metadata | null, options?: grpc.CallOptions | null): grpc.ClientDuplexStream<messaging_pb.MessagingRequest, messaging_pb.MessagingResponse>;
}
