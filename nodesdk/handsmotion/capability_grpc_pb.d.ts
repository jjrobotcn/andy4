// GENERATED CODE -- DO NOT EDIT!

// package: handsmotion
// file: capability.proto

import * as capability_pb from "./capability_pb";
import * as grpc from "grpc";

interface ICapabilityService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  fingersAdjustment: grpc.MethodDefinition<capability_pb.FingersAdjustmentRequest, capability_pb.FingersAdjustmentResponse>;
  armAdjustment: grpc.MethodDefinition<capability_pb.ArmAdjustmentRequest, capability_pb.ArmAdjustmentResponse>;
  markAsOriginalPosition: grpc.MethodDefinition<capability_pb.MarkAsOriginalPositionRequest, capability_pb.MarkAsOriginalPositionResponse>;
  setJointOriginPos: grpc.MethodDefinition<capability_pb.SetJointOriginPosRequest, capability_pb.SetJointOriginPosResponse>;
  getAbsolutePosition: grpc.MethodDefinition<capability_pb.GetAbsolutePositionRequest, capability_pb.GetAbsolutePositionResponse>;
  absoluteMove: grpc.MethodDefinition<capability_pb.AbsoluteMoveRequest, capability_pb.AbsoluteMoveResponse>;
}

export const CapabilityService: ICapabilityService;

export class CapabilityClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  fingersAdjustment(argument: capability_pb.FingersAdjustmentRequest, callback: grpc.requestCallback<capability_pb.FingersAdjustmentResponse>): grpc.ClientUnaryCall;
  fingersAdjustment(argument: capability_pb.FingersAdjustmentRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<capability_pb.FingersAdjustmentResponse>): grpc.ClientUnaryCall;
  fingersAdjustment(argument: capability_pb.FingersAdjustmentRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<capability_pb.FingersAdjustmentResponse>): grpc.ClientUnaryCall;
  armAdjustment(argument: capability_pb.ArmAdjustmentRequest, callback: grpc.requestCallback<capability_pb.ArmAdjustmentResponse>): grpc.ClientUnaryCall;
  armAdjustment(argument: capability_pb.ArmAdjustmentRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<capability_pb.ArmAdjustmentResponse>): grpc.ClientUnaryCall;
  armAdjustment(argument: capability_pb.ArmAdjustmentRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<capability_pb.ArmAdjustmentResponse>): grpc.ClientUnaryCall;
  markAsOriginalPosition(argument: capability_pb.MarkAsOriginalPositionRequest, callback: grpc.requestCallback<capability_pb.MarkAsOriginalPositionResponse>): grpc.ClientUnaryCall;
  markAsOriginalPosition(argument: capability_pb.MarkAsOriginalPositionRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<capability_pb.MarkAsOriginalPositionResponse>): grpc.ClientUnaryCall;
  markAsOriginalPosition(argument: capability_pb.MarkAsOriginalPositionRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<capability_pb.MarkAsOriginalPositionResponse>): grpc.ClientUnaryCall;
  setJointOriginPos(argument: capability_pb.SetJointOriginPosRequest, callback: grpc.requestCallback<capability_pb.SetJointOriginPosResponse>): grpc.ClientUnaryCall;
  setJointOriginPos(argument: capability_pb.SetJointOriginPosRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<capability_pb.SetJointOriginPosResponse>): grpc.ClientUnaryCall;
  setJointOriginPos(argument: capability_pb.SetJointOriginPosRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<capability_pb.SetJointOriginPosResponse>): grpc.ClientUnaryCall;
  getAbsolutePosition(argument: capability_pb.GetAbsolutePositionRequest, callback: grpc.requestCallback<capability_pb.GetAbsolutePositionResponse>): grpc.ClientUnaryCall;
  getAbsolutePosition(argument: capability_pb.GetAbsolutePositionRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<capability_pb.GetAbsolutePositionResponse>): grpc.ClientUnaryCall;
  getAbsolutePosition(argument: capability_pb.GetAbsolutePositionRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<capability_pb.GetAbsolutePositionResponse>): grpc.ClientUnaryCall;
  absoluteMove(argument: capability_pb.AbsoluteMoveRequest, callback: grpc.requestCallback<capability_pb.AbsoluteMoveResponse>): grpc.ClientUnaryCall;
  absoluteMove(argument: capability_pb.AbsoluteMoveRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<capability_pb.AbsoluteMoveResponse>): grpc.ClientUnaryCall;
  absoluteMove(argument: capability_pb.AbsoluteMoveRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<capability_pb.AbsoluteMoveResponse>): grpc.ClientUnaryCall;
}
