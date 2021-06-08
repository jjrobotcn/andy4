// GENERATED CODE -- DO NOT EDIT!

// package: handsmotion
// file: group.proto

import * as group_pb from "./group_pb";
import * as grpc from "grpc";

interface IGroupManagementService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  newMotionGroup: grpc.MethodDefinition<group_pb.NewMotionGroupRequest, group_pb.NewMotionGroupResponse>;
  listMotionGroups: grpc.MethodDefinition<group_pb.ListMotionGroupsRequest, group_pb.ListMotionGroupsResponse>;
  deleteMotionGroup: grpc.MethodDefinition<group_pb.DeleteMotionGroupRequest, group_pb.DeleteMotionGroupResponse>;
  getMotionGroup: grpc.MethodDefinition<group_pb.GetMotionGroupRequest, group_pb.GetMotionGroupResponse>;
  updateMotionGroupMeta: grpc.MethodDefinition<group_pb.UpdateMotionMetaRequest, group_pb.UpdateMotionMetaResponse>;
  updateMotionGroupScripts: grpc.MethodDefinition<group_pb.UpdateMotionScriptsRequest, group_pb.UpdateMotionScriptsResponse>;
}

export const GroupManagementService: IGroupManagementService;

export class GroupManagementClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  newMotionGroup(argument: group_pb.NewMotionGroupRequest, callback: grpc.requestCallback<group_pb.NewMotionGroupResponse>): grpc.ClientUnaryCall;
  newMotionGroup(argument: group_pb.NewMotionGroupRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<group_pb.NewMotionGroupResponse>): grpc.ClientUnaryCall;
  newMotionGroup(argument: group_pb.NewMotionGroupRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<group_pb.NewMotionGroupResponse>): grpc.ClientUnaryCall;
  listMotionGroups(argument: group_pb.ListMotionGroupsRequest, callback: grpc.requestCallback<group_pb.ListMotionGroupsResponse>): grpc.ClientUnaryCall;
  listMotionGroups(argument: group_pb.ListMotionGroupsRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<group_pb.ListMotionGroupsResponse>): grpc.ClientUnaryCall;
  listMotionGroups(argument: group_pb.ListMotionGroupsRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<group_pb.ListMotionGroupsResponse>): grpc.ClientUnaryCall;
  deleteMotionGroup(argument: group_pb.DeleteMotionGroupRequest, callback: grpc.requestCallback<group_pb.DeleteMotionGroupResponse>): grpc.ClientUnaryCall;
  deleteMotionGroup(argument: group_pb.DeleteMotionGroupRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<group_pb.DeleteMotionGroupResponse>): grpc.ClientUnaryCall;
  deleteMotionGroup(argument: group_pb.DeleteMotionGroupRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<group_pb.DeleteMotionGroupResponse>): grpc.ClientUnaryCall;
  getMotionGroup(argument: group_pb.GetMotionGroupRequest, callback: grpc.requestCallback<group_pb.GetMotionGroupResponse>): grpc.ClientUnaryCall;
  getMotionGroup(argument: group_pb.GetMotionGroupRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<group_pb.GetMotionGroupResponse>): grpc.ClientUnaryCall;
  getMotionGroup(argument: group_pb.GetMotionGroupRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<group_pb.GetMotionGroupResponse>): grpc.ClientUnaryCall;
  updateMotionGroupMeta(argument: group_pb.UpdateMotionMetaRequest, callback: grpc.requestCallback<group_pb.UpdateMotionMetaResponse>): grpc.ClientUnaryCall;
  updateMotionGroupMeta(argument: group_pb.UpdateMotionMetaRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<group_pb.UpdateMotionMetaResponse>): grpc.ClientUnaryCall;
  updateMotionGroupMeta(argument: group_pb.UpdateMotionMetaRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<group_pb.UpdateMotionMetaResponse>): grpc.ClientUnaryCall;
  updateMotionGroupScripts(argument: group_pb.UpdateMotionScriptsRequest, callback: grpc.requestCallback<group_pb.UpdateMotionScriptsResponse>): grpc.ClientUnaryCall;
  updateMotionGroupScripts(argument: group_pb.UpdateMotionScriptsRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<group_pb.UpdateMotionScriptsResponse>): grpc.ClientUnaryCall;
  updateMotionGroupScripts(argument: group_pb.UpdateMotionScriptsRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<group_pb.UpdateMotionScriptsResponse>): grpc.ClientUnaryCall;
}
