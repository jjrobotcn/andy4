// GENERATED CODE -- DO NOT EDIT!

// package: motionService
// file: headmotion.proto

import * as headmotion_pb from "./headmotion_pb";
import * as grpc from "grpc";

interface IMotionServiceService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  moveTo: grpc.MethodDefinition<headmotion_pb.MoveToRequest, headmotion_pb.MoveToResponse>;
  positioningData: grpc.MethodDefinition<headmotion_pb.PositioningDataRequest, headmotion_pb.PositioningDataResponse>;
  getPosition: grpc.MethodDefinition<headmotion_pb.GetPositionRequest, headmotion_pb.GetPositionResponse>;
  newGroup: grpc.MethodDefinition<headmotion_pb.NewGroupRequest, headmotion_pb.NewGroupResponse>;
  listGroups: grpc.MethodDefinition<headmotion_pb.ListGroupsRequest, headmotion_pb.ListGroupsResponse>;
  updateGroup: grpc.MethodDefinition<headmotion_pb.UpdateGroupRequest, headmotion_pb.UpdateGroupResponse>;
  deleteGroups: grpc.MethodDefinition<headmotion_pb.DeleteGroupsRequest, headmotion_pb.DeleteGroupsResponse>;
  listGroupTargets: grpc.MethodDefinition<headmotion_pb.ListGroupTargetsRequest, headmotion_pb.ListGroupTargetsResponse>;
  updateGroupTargets: grpc.MethodDefinition<headmotion_pb.UpdateGroupTargetsRequest, headmotion_pb.UpdateGroupTargetsResponse>;
}

export const MotionServiceService: IMotionServiceService;

export class MotionServiceClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  moveTo(argument: headmotion_pb.MoveToRequest, callback: grpc.requestCallback<headmotion_pb.MoveToResponse>): grpc.ClientUnaryCall;
  moveTo(argument: headmotion_pb.MoveToRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<headmotion_pb.MoveToResponse>): grpc.ClientUnaryCall;
  moveTo(argument: headmotion_pb.MoveToRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<headmotion_pb.MoveToResponse>): grpc.ClientUnaryCall;
  positioningData(argument: headmotion_pb.PositioningDataRequest, metadataOrOptions?: grpc.Metadata | grpc.CallOptions | null): grpc.ClientReadableStream<headmotion_pb.PositioningDataResponse>;
  positioningData(argument: headmotion_pb.PositioningDataRequest, metadata?: grpc.Metadata | null, options?: grpc.CallOptions | null): grpc.ClientReadableStream<headmotion_pb.PositioningDataResponse>;
  getPosition(argument: headmotion_pb.GetPositionRequest, callback: grpc.requestCallback<headmotion_pb.GetPositionResponse>): grpc.ClientUnaryCall;
  getPosition(argument: headmotion_pb.GetPositionRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<headmotion_pb.GetPositionResponse>): grpc.ClientUnaryCall;
  getPosition(argument: headmotion_pb.GetPositionRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<headmotion_pb.GetPositionResponse>): grpc.ClientUnaryCall;
  newGroup(argument: headmotion_pb.NewGroupRequest, callback: grpc.requestCallback<headmotion_pb.NewGroupResponse>): grpc.ClientUnaryCall;
  newGroup(argument: headmotion_pb.NewGroupRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<headmotion_pb.NewGroupResponse>): grpc.ClientUnaryCall;
  newGroup(argument: headmotion_pb.NewGroupRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<headmotion_pb.NewGroupResponse>): grpc.ClientUnaryCall;
  listGroups(argument: headmotion_pb.ListGroupsRequest, callback: grpc.requestCallback<headmotion_pb.ListGroupsResponse>): grpc.ClientUnaryCall;
  listGroups(argument: headmotion_pb.ListGroupsRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<headmotion_pb.ListGroupsResponse>): grpc.ClientUnaryCall;
  listGroups(argument: headmotion_pb.ListGroupsRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<headmotion_pb.ListGroupsResponse>): grpc.ClientUnaryCall;
  updateGroup(argument: headmotion_pb.UpdateGroupRequest, callback: grpc.requestCallback<headmotion_pb.UpdateGroupResponse>): grpc.ClientUnaryCall;
  updateGroup(argument: headmotion_pb.UpdateGroupRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<headmotion_pb.UpdateGroupResponse>): grpc.ClientUnaryCall;
  updateGroup(argument: headmotion_pb.UpdateGroupRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<headmotion_pb.UpdateGroupResponse>): grpc.ClientUnaryCall;
  deleteGroups(argument: headmotion_pb.DeleteGroupsRequest, callback: grpc.requestCallback<headmotion_pb.DeleteGroupsResponse>): grpc.ClientUnaryCall;
  deleteGroups(argument: headmotion_pb.DeleteGroupsRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<headmotion_pb.DeleteGroupsResponse>): grpc.ClientUnaryCall;
  deleteGroups(argument: headmotion_pb.DeleteGroupsRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<headmotion_pb.DeleteGroupsResponse>): grpc.ClientUnaryCall;
  listGroupTargets(argument: headmotion_pb.ListGroupTargetsRequest, callback: grpc.requestCallback<headmotion_pb.ListGroupTargetsResponse>): grpc.ClientUnaryCall;
  listGroupTargets(argument: headmotion_pb.ListGroupTargetsRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<headmotion_pb.ListGroupTargetsResponse>): grpc.ClientUnaryCall;
  listGroupTargets(argument: headmotion_pb.ListGroupTargetsRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<headmotion_pb.ListGroupTargetsResponse>): grpc.ClientUnaryCall;
  updateGroupTargets(argument: headmotion_pb.UpdateGroupTargetsRequest, callback: grpc.requestCallback<headmotion_pb.UpdateGroupTargetsResponse>): grpc.ClientUnaryCall;
  updateGroupTargets(argument: headmotion_pb.UpdateGroupTargetsRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<headmotion_pb.UpdateGroupTargetsResponse>): grpc.ClientUnaryCall;
  updateGroupTargets(argument: headmotion_pb.UpdateGroupTargetsRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<headmotion_pb.UpdateGroupTargetsResponse>): grpc.ClientUnaryCall;
}
