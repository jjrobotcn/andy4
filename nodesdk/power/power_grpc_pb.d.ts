// GENERATED CODE -- DO NOT EDIT!

// package: powerService
// file: power.proto

import * as power_pb from "./power_pb";
import * as grpc from "grpc";

interface IPowerServiceService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  getPowerStatus: grpc.MethodDefinition<power_pb.GetPowerStatusRequest, power_pb.GetPowerStatusResponse>;
  reboot: grpc.MethodDefinition<power_pb.RebootRequest, power_pb.RebootResponse>;
  states: grpc.MethodDefinition<power_pb.StatesRequest, power_pb.StatesResponse>;
  switch: grpc.MethodDefinition<power_pb.SwitchRequest, power_pb.SwitchResponse>;
  setAutoPowerOnOff: grpc.MethodDefinition<power_pb.AutoPowerOnOffModel, power_pb.SetAutoPowerOnOffResponse>;
  getAutoPowerOnOff: grpc.MethodDefinition<power_pb.GetAutoPowerOnOffRequest, power_pb.AutoPowerOnOffModel>;
}

export const PowerServiceService: IPowerServiceService;

export class PowerServiceClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  getPowerStatus(argument: power_pb.GetPowerStatusRequest, metadataOrOptions?: grpc.Metadata | grpc.CallOptions | null): grpc.ClientReadableStream<power_pb.GetPowerStatusResponse>;
  getPowerStatus(argument: power_pb.GetPowerStatusRequest, metadata?: grpc.Metadata | null, options?: grpc.CallOptions | null): grpc.ClientReadableStream<power_pb.GetPowerStatusResponse>;
  reboot(argument: power_pb.RebootRequest, callback: grpc.requestCallback<power_pb.RebootResponse>): grpc.ClientUnaryCall;
  reboot(argument: power_pb.RebootRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<power_pb.RebootResponse>): grpc.ClientUnaryCall;
  reboot(argument: power_pb.RebootRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<power_pb.RebootResponse>): grpc.ClientUnaryCall;
  states(argument: power_pb.StatesRequest, callback: grpc.requestCallback<power_pb.StatesResponse>): grpc.ClientUnaryCall;
  states(argument: power_pb.StatesRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<power_pb.StatesResponse>): grpc.ClientUnaryCall;
  states(argument: power_pb.StatesRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<power_pb.StatesResponse>): grpc.ClientUnaryCall;
  switch(argument: power_pb.SwitchRequest, callback: grpc.requestCallback<power_pb.SwitchResponse>): grpc.ClientUnaryCall;
  switch(argument: power_pb.SwitchRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<power_pb.SwitchResponse>): grpc.ClientUnaryCall;
  switch(argument: power_pb.SwitchRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<power_pb.SwitchResponse>): grpc.ClientUnaryCall;
  setAutoPowerOnOff(argument: power_pb.AutoPowerOnOffModel, callback: grpc.requestCallback<power_pb.SetAutoPowerOnOffResponse>): grpc.ClientUnaryCall;
  setAutoPowerOnOff(argument: power_pb.AutoPowerOnOffModel, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<power_pb.SetAutoPowerOnOffResponse>): grpc.ClientUnaryCall;
  setAutoPowerOnOff(argument: power_pb.AutoPowerOnOffModel, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<power_pb.SetAutoPowerOnOffResponse>): grpc.ClientUnaryCall;
  getAutoPowerOnOff(argument: power_pb.GetAutoPowerOnOffRequest, callback: grpc.requestCallback<power_pb.AutoPowerOnOffModel>): grpc.ClientUnaryCall;
  getAutoPowerOnOff(argument: power_pb.GetAutoPowerOnOffRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<power_pb.AutoPowerOnOffModel>): grpc.ClientUnaryCall;
  getAutoPowerOnOff(argument: power_pb.GetAutoPowerOnOffRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<power_pb.AutoPowerOnOffModel>): grpc.ClientUnaryCall;
}
