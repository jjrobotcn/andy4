// GENERATED CODE -- DO NOT EDIT!

// package: handsmotion
// file: player.proto

import * as player_pb from "./player_pb";
import * as grpc from "grpc";

interface IPlayerService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  play: grpc.MethodDefinition<player_pb.PlayRequest, player_pb.PlayResponse>;
  stop: grpc.MethodDefinition<player_pb.StopRequest, player_pb.StopResponse>;
  reset: grpc.MethodDefinition<player_pb.ResetRequest, player_pb.ResetResponse>;
  state: grpc.MethodDefinition<player_pb.StateRequest, player_pb.StateResponse>;
  onStateChange: grpc.MethodDefinition<player_pb.OnStateChangeRequest, player_pb.OnStateChangeResponse>;
}

export const PlayerService: IPlayerService;

export class PlayerClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  play(argument: player_pb.PlayRequest, callback: grpc.requestCallback<player_pb.PlayResponse>): grpc.ClientUnaryCall;
  play(argument: player_pb.PlayRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<player_pb.PlayResponse>): grpc.ClientUnaryCall;
  play(argument: player_pb.PlayRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<player_pb.PlayResponse>): grpc.ClientUnaryCall;
  stop(argument: player_pb.StopRequest, callback: grpc.requestCallback<player_pb.StopResponse>): grpc.ClientUnaryCall;
  stop(argument: player_pb.StopRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<player_pb.StopResponse>): grpc.ClientUnaryCall;
  stop(argument: player_pb.StopRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<player_pb.StopResponse>): grpc.ClientUnaryCall;
  reset(argument: player_pb.ResetRequest, callback: grpc.requestCallback<player_pb.ResetResponse>): grpc.ClientUnaryCall;
  reset(argument: player_pb.ResetRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<player_pb.ResetResponse>): grpc.ClientUnaryCall;
  reset(argument: player_pb.ResetRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<player_pb.ResetResponse>): grpc.ClientUnaryCall;
  state(argument: player_pb.StateRequest, callback: grpc.requestCallback<player_pb.StateResponse>): grpc.ClientUnaryCall;
  state(argument: player_pb.StateRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<player_pb.StateResponse>): grpc.ClientUnaryCall;
  state(argument: player_pb.StateRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<player_pb.StateResponse>): grpc.ClientUnaryCall;
  onStateChange(argument: player_pb.OnStateChangeRequest, metadataOrOptions?: grpc.Metadata | grpc.CallOptions | null): grpc.ClientReadableStream<player_pb.OnStateChangeResponse>;
  onStateChange(argument: player_pb.OnStateChangeRequest, metadata?: grpc.Metadata | null, options?: grpc.CallOptions | null): grpc.ClientReadableStream<player_pb.OnStateChangeResponse>;
}
