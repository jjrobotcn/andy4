// GENERATED CODE -- DO NOT EDIT!

// package: lightsService
// file: lights.proto

import * as lights_pb from "./lights_pb";
import * as grpc from "grpc";

interface ILightsServiceService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  previewLight: grpc.MethodDefinition<lights_pb.PreviewLightRequest, lights_pb.PreviewLightResponse>;
  playLight: grpc.MethodDefinition<lights_pb.PlayLightRequest, lights_pb.PlayLightResponse>;
  stopLight: grpc.MethodDefinition<lights_pb.StopLightRequest, lights_pb.StopLightResponse>;
  listLights: grpc.MethodDefinition<lights_pb.ListLightsRequest, lights_pb.ListLightsResponse>;
  newLight: grpc.MethodDefinition<lights_pb.NewLightRequest, lights_pb.NewLightResponse>;
  updateLight: grpc.MethodDefinition<lights_pb.UpdateLightRequest, lights_pb.UpdateLightResponse>;
  deleteLights: grpc.MethodDefinition<lights_pb.DeleteLightsRequest, lights_pb.DeleteLightsResponse>;
  state: grpc.MethodDefinition<lights_pb.StateRequest, lights_pb.StateResponse>;
  switch: grpc.MethodDefinition<lights_pb.SwitchRequest, lights_pb.SwitchResponse>;
}

export const LightsServiceService: ILightsServiceService;

export class LightsServiceClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  previewLight(argument: lights_pb.PreviewLightRequest, callback: grpc.requestCallback<lights_pb.PreviewLightResponse>): grpc.ClientUnaryCall;
  previewLight(argument: lights_pb.PreviewLightRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<lights_pb.PreviewLightResponse>): grpc.ClientUnaryCall;
  previewLight(argument: lights_pb.PreviewLightRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<lights_pb.PreviewLightResponse>): grpc.ClientUnaryCall;
  playLight(argument: lights_pb.PlayLightRequest, callback: grpc.requestCallback<lights_pb.PlayLightResponse>): grpc.ClientUnaryCall;
  playLight(argument: lights_pb.PlayLightRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<lights_pb.PlayLightResponse>): grpc.ClientUnaryCall;
  playLight(argument: lights_pb.PlayLightRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<lights_pb.PlayLightResponse>): grpc.ClientUnaryCall;
  stopLight(argument: lights_pb.StopLightRequest, callback: grpc.requestCallback<lights_pb.StopLightResponse>): grpc.ClientUnaryCall;
  stopLight(argument: lights_pb.StopLightRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<lights_pb.StopLightResponse>): grpc.ClientUnaryCall;
  stopLight(argument: lights_pb.StopLightRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<lights_pb.StopLightResponse>): grpc.ClientUnaryCall;
  listLights(argument: lights_pb.ListLightsRequest, callback: grpc.requestCallback<lights_pb.ListLightsResponse>): grpc.ClientUnaryCall;
  listLights(argument: lights_pb.ListLightsRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<lights_pb.ListLightsResponse>): grpc.ClientUnaryCall;
  listLights(argument: lights_pb.ListLightsRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<lights_pb.ListLightsResponse>): grpc.ClientUnaryCall;
  newLight(argument: lights_pb.NewLightRequest, callback: grpc.requestCallback<lights_pb.NewLightResponse>): grpc.ClientUnaryCall;
  newLight(argument: lights_pb.NewLightRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<lights_pb.NewLightResponse>): grpc.ClientUnaryCall;
  newLight(argument: lights_pb.NewLightRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<lights_pb.NewLightResponse>): grpc.ClientUnaryCall;
  updateLight(argument: lights_pb.UpdateLightRequest, callback: grpc.requestCallback<lights_pb.UpdateLightResponse>): grpc.ClientUnaryCall;
  updateLight(argument: lights_pb.UpdateLightRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<lights_pb.UpdateLightResponse>): grpc.ClientUnaryCall;
  updateLight(argument: lights_pb.UpdateLightRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<lights_pb.UpdateLightResponse>): grpc.ClientUnaryCall;
  deleteLights(argument: lights_pb.DeleteLightsRequest, callback: grpc.requestCallback<lights_pb.DeleteLightsResponse>): grpc.ClientUnaryCall;
  deleteLights(argument: lights_pb.DeleteLightsRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<lights_pb.DeleteLightsResponse>): grpc.ClientUnaryCall;
  deleteLights(argument: lights_pb.DeleteLightsRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<lights_pb.DeleteLightsResponse>): grpc.ClientUnaryCall;
  state(argument: lights_pb.StateRequest, callback: grpc.requestCallback<lights_pb.StateResponse>): grpc.ClientUnaryCall;
  state(argument: lights_pb.StateRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<lights_pb.StateResponse>): grpc.ClientUnaryCall;
  state(argument: lights_pb.StateRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<lights_pb.StateResponse>): grpc.ClientUnaryCall;
  switch(argument: lights_pb.SwitchRequest, callback: grpc.requestCallback<lights_pb.SwitchResponse>): grpc.ClientUnaryCall;
  switch(argument: lights_pb.SwitchRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<lights_pb.SwitchResponse>): grpc.ClientUnaryCall;
  switch(argument: lights_pb.SwitchRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<lights_pb.SwitchResponse>): grpc.ClientUnaryCall;
}
