// package: motionService
// file: headmotion.proto

import * as jspb from "google-protobuf";

export class Position extends jspb.Message {
  getXAxis(): number;
  setXAxis(value: number): void;

  getYAxis(): number;
  setYAxis(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Position.AsObject;
  static toObject(includeInstance: boolean, msg: Position): Position.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Position, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Position;
  static deserializeBinaryFromReader(message: Position, reader: jspb.BinaryReader): Position;
}

export namespace Position {
  export type AsObject = {
    xAxis: number,
    yAxis: number,
  }
}

export class MotionConfig extends jspb.Message {
  getSpeed(): number;
  setSpeed(value: number): void;

  getWaitMillisecond(): number;
  setWaitMillisecond(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MotionConfig.AsObject;
  static toObject(includeInstance: boolean, msg: MotionConfig): MotionConfig.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MotionConfig, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MotionConfig;
  static deserializeBinaryFromReader(message: MotionConfig, reader: jspb.BinaryReader): MotionConfig;
}

export namespace MotionConfig {
  export type AsObject = {
    speed: number,
    waitMillisecond: number,
  }
}

export class Group extends jspb.Message {
  hasGroupInfo(): boolean;
  clearGroupInfo(): void;
  getGroupInfo(): GroupInfo | undefined;
  setGroupInfo(value?: GroupInfo): void;

  clearTargetsList(): void;
  getTargetsList(): Array<Target>;
  setTargetsList(value: Array<Target>): void;
  addTargets(value?: Target, index?: number): Target;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Group.AsObject;
  static toObject(includeInstance: boolean, msg: Group): Group.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Group, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Group;
  static deserializeBinaryFromReader(message: Group, reader: jspb.BinaryReader): Group;
}

export namespace Group {
  export type AsObject = {
    groupInfo?: GroupInfo.AsObject,
    targetsList: Array<Target.AsObject>,
  }
}

export class GroupInfo extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  getName(): string;
  setName(value: string): void;

  getMotionType(): MotionTypeMap[keyof MotionTypeMap];
  setMotionType(value: MotionTypeMap[keyof MotionTypeMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GroupInfo.AsObject;
  static toObject(includeInstance: boolean, msg: GroupInfo): GroupInfo.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GroupInfo, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GroupInfo;
  static deserializeBinaryFromReader(message: GroupInfo, reader: jspb.BinaryReader): GroupInfo;
}

export namespace GroupInfo {
  export type AsObject = {
    id: string,
    name: string,
    motionType: MotionTypeMap[keyof MotionTypeMap],
  }
}

export class Target extends jspb.Message {
  hasPosition(): boolean;
  clearPosition(): void;
  getPosition(): Position | undefined;
  setPosition(value?: Position): void;

  hasMotionConfig(): boolean;
  clearMotionConfig(): void;
  getMotionConfig(): MotionConfig | undefined;
  setMotionConfig(value?: MotionConfig): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Target.AsObject;
  static toObject(includeInstance: boolean, msg: Target): Target.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Target, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Target;
  static deserializeBinaryFromReader(message: Target, reader: jspb.BinaryReader): Target;
}

export namespace Target {
  export type AsObject = {
    position?: Position.AsObject,
    motionConfig?: MotionConfig.AsObject,
  }
}

export class GroupTargetRequest extends jspb.Message {
  hasId(): boolean;
  clearId(): void;
  getId(): string;
  setId(value: string): void;

  hasName(): boolean;
  clearName(): void;
  getName(): string;
  setName(value: string): void;

  getGroupIdNameOneofCase(): GroupTargetRequest.GroupIdNameOneofCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GroupTargetRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GroupTargetRequest): GroupTargetRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GroupTargetRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GroupTargetRequest;
  static deserializeBinaryFromReader(message: GroupTargetRequest, reader: jspb.BinaryReader): GroupTargetRequest;
}

export namespace GroupTargetRequest {
  export type AsObject = {
    id: string,
    name: string,
  }

  export enum GroupIdNameOneofCase {
    GROUP_ID_NAME_ONEOF_NOT_SET = 0,
    ID = 1,
    NAME = 2,
  }
}

export class GroupsTargetRequest extends jspb.Message {
  clearGroupsList(): void;
  getGroupsList(): Array<GroupTargetRequest>;
  setGroupsList(value: Array<GroupTargetRequest>): void;
  addGroups(value?: GroupTargetRequest, index?: number): GroupTargetRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GroupsTargetRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GroupsTargetRequest): GroupsTargetRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GroupsTargetRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GroupsTargetRequest;
  static deserializeBinaryFromReader(message: GroupsTargetRequest, reader: jspb.BinaryReader): GroupsTargetRequest;
}

export namespace GroupsTargetRequest {
  export type AsObject = {
    groupsList: Array<GroupTargetRequest.AsObject>,
  }
}

export class PositionTargetRequest extends jspb.Message {
  hasAbsoluteTarget(): boolean;
  clearAbsoluteTarget(): void;
  getAbsoluteTarget(): Target | undefined;
  setAbsoluteTarget(value?: Target): void;

  hasRelativeTarget(): boolean;
  clearRelativeTarget(): void;
  getRelativeTarget(): Target | undefined;
  setRelativeTarget(value?: Target): void;

  getPositionTargetOneofCase(): PositionTargetRequest.PositionTargetOneofCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PositionTargetRequest.AsObject;
  static toObject(includeInstance: boolean, msg: PositionTargetRequest): PositionTargetRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PositionTargetRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PositionTargetRequest;
  static deserializeBinaryFromReader(message: PositionTargetRequest, reader: jspb.BinaryReader): PositionTargetRequest;
}

export namespace PositionTargetRequest {
  export type AsObject = {
    absoluteTarget?: Target.AsObject,
    relativeTarget?: Target.AsObject,
  }

  export enum PositionTargetOneofCase {
    POSITION_TARGET_ONEOF_NOT_SET = 0,
    ABSOLUTE_TARGET = 1,
    RELATIVE_TARGET = 2,
  }
}

export class MoveToRequest extends jspb.Message {
  getMotionType(): MotionTypeMap[keyof MotionTypeMap];
  setMotionType(value: MotionTypeMap[keyof MotionTypeMap]): void;

  hasGroupsTargetRequest(): boolean;
  clearGroupsTargetRequest(): void;
  getGroupsTargetRequest(): GroupsTargetRequest | undefined;
  setGroupsTargetRequest(value?: GroupsTargetRequest): void;

  hasPositionTargetRequest(): boolean;
  clearPositionTargetRequest(): void;
  getPositionTargetRequest(): PositionTargetRequest | undefined;
  setPositionTargetRequest(value?: PositionTargetRequest): void;

  getImmediately(): boolean;
  setImmediately(value: boolean): void;

  getTargetRequestOneofCase(): MoveToRequest.TargetRequestOneofCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MoveToRequest.AsObject;
  static toObject(includeInstance: boolean, msg: MoveToRequest): MoveToRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MoveToRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MoveToRequest;
  static deserializeBinaryFromReader(message: MoveToRequest, reader: jspb.BinaryReader): MoveToRequest;
}

export namespace MoveToRequest {
  export type AsObject = {
    motionType: MotionTypeMap[keyof MotionTypeMap],
    groupsTargetRequest?: GroupsTargetRequest.AsObject,
    positionTargetRequest?: PositionTargetRequest.AsObject,
    immediately: boolean,
  }

  export enum TargetRequestOneofCase {
    TARGET_REQUEST_ONEOF_NOT_SET = 0,
    GROUPS_TARGET_REQUEST = 2,
    POSITION_TARGET_REQUEST = 3,
  }
}

export class MoveToResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MoveToResponse.AsObject;
  static toObject(includeInstance: boolean, msg: MoveToResponse): MoveToResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MoveToResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MoveToResponse;
  static deserializeBinaryFromReader(message: MoveToResponse, reader: jspb.BinaryReader): MoveToResponse;
}

export namespace MoveToResponse {
  export type AsObject = {
  }
}

export class GetPositionRequest extends jspb.Message {
  getMotionType(): MotionTypeMap[keyof MotionTypeMap];
  setMotionType(value: MotionTypeMap[keyof MotionTypeMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetPositionRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetPositionRequest): GetPositionRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetPositionRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetPositionRequest;
  static deserializeBinaryFromReader(message: GetPositionRequest, reader: jspb.BinaryReader): GetPositionRequest;
}

export namespace GetPositionRequest {
  export type AsObject = {
    motionType: MotionTypeMap[keyof MotionTypeMap],
  }
}

export class GetPositionResponse extends jspb.Message {
  getMotionType(): MotionTypeMap[keyof MotionTypeMap];
  setMotionType(value: MotionTypeMap[keyof MotionTypeMap]): void;

  hasPosition(): boolean;
  clearPosition(): void;
  getPosition(): Position | undefined;
  setPosition(value?: Position): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetPositionResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetPositionResponse): GetPositionResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetPositionResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetPositionResponse;
  static deserializeBinaryFromReader(message: GetPositionResponse, reader: jspb.BinaryReader): GetPositionResponse;
}

export namespace GetPositionResponse {
  export type AsObject = {
    motionType: MotionTypeMap[keyof MotionTypeMap],
    position?: Position.AsObject,
  }
}

export class PositioningDataRequest extends jspb.Message {
  getMotionType(): MotionTypeMap[keyof MotionTypeMap];
  setMotionType(value: MotionTypeMap[keyof MotionTypeMap]): void;

  getDisability(): boolean;
  setDisability(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PositioningDataRequest.AsObject;
  static toObject(includeInstance: boolean, msg: PositioningDataRequest): PositioningDataRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PositioningDataRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PositioningDataRequest;
  static deserializeBinaryFromReader(message: PositioningDataRequest, reader: jspb.BinaryReader): PositioningDataRequest;
}

export namespace PositioningDataRequest {
  export type AsObject = {
    motionType: MotionTypeMap[keyof MotionTypeMap],
    disability: boolean,
  }
}

export class PositioningDataResponse extends jspb.Message {
  getMotionType(): MotionTypeMap[keyof MotionTypeMap];
  setMotionType(value: MotionTypeMap[keyof MotionTypeMap]): void;

  hasPosition(): boolean;
  clearPosition(): void;
  getPosition(): Position | undefined;
  setPosition(value?: Position): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PositioningDataResponse.AsObject;
  static toObject(includeInstance: boolean, msg: PositioningDataResponse): PositioningDataResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PositioningDataResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PositioningDataResponse;
  static deserializeBinaryFromReader(message: PositioningDataResponse, reader: jspb.BinaryReader): PositioningDataResponse;
}

export namespace PositioningDataResponse {
  export type AsObject = {
    motionType: MotionTypeMap[keyof MotionTypeMap],
    position?: Position.AsObject,
  }
}

export class NewGroupRequest extends jspb.Message {
  getMotionType(): MotionTypeMap[keyof MotionTypeMap];
  setMotionType(value: MotionTypeMap[keyof MotionTypeMap]): void;

  getName(): string;
  setName(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): NewGroupRequest.AsObject;
  static toObject(includeInstance: boolean, msg: NewGroupRequest): NewGroupRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: NewGroupRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): NewGroupRequest;
  static deserializeBinaryFromReader(message: NewGroupRequest, reader: jspb.BinaryReader): NewGroupRequest;
}

export namespace NewGroupRequest {
  export type AsObject = {
    motionType: MotionTypeMap[keyof MotionTypeMap],
    name: string,
  }
}

export class NewGroupResponse extends jspb.Message {
  hasGroupInfo(): boolean;
  clearGroupInfo(): void;
  getGroupInfo(): GroupInfo | undefined;
  setGroupInfo(value?: GroupInfo): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): NewGroupResponse.AsObject;
  static toObject(includeInstance: boolean, msg: NewGroupResponse): NewGroupResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: NewGroupResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): NewGroupResponse;
  static deserializeBinaryFromReader(message: NewGroupResponse, reader: jspb.BinaryReader): NewGroupResponse;
}

export namespace NewGroupResponse {
  export type AsObject = {
    groupInfo?: GroupInfo.AsObject,
  }
}

export class ListGroupsRequest extends jspb.Message {
  getMotionType(): MotionTypeMap[keyof MotionTypeMap];
  setMotionType(value: MotionTypeMap[keyof MotionTypeMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ListGroupsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ListGroupsRequest): ListGroupsRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ListGroupsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ListGroupsRequest;
  static deserializeBinaryFromReader(message: ListGroupsRequest, reader: jspb.BinaryReader): ListGroupsRequest;
}

export namespace ListGroupsRequest {
  export type AsObject = {
    motionType: MotionTypeMap[keyof MotionTypeMap],
  }
}

export class ListGroupsResponse extends jspb.Message {
  clearGroupsInfoList(): void;
  getGroupsInfoList(): Array<GroupInfo>;
  setGroupsInfoList(value: Array<GroupInfo>): void;
  addGroupsInfo(value?: GroupInfo, index?: number): GroupInfo;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ListGroupsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ListGroupsResponse): ListGroupsResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ListGroupsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ListGroupsResponse;
  static deserializeBinaryFromReader(message: ListGroupsResponse, reader: jspb.BinaryReader): ListGroupsResponse;
}

export namespace ListGroupsResponse {
  export type AsObject = {
    groupsInfoList: Array<GroupInfo.AsObject>,
  }
}

export class UpdateGroupRequest extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  getName(): string;
  setName(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateGroupRequest.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateGroupRequest): UpdateGroupRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateGroupRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateGroupRequest;
  static deserializeBinaryFromReader(message: UpdateGroupRequest, reader: jspb.BinaryReader): UpdateGroupRequest;
}

export namespace UpdateGroupRequest {
  export type AsObject = {
    id: string,
    name: string,
  }
}

export class UpdateGroupResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateGroupResponse.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateGroupResponse): UpdateGroupResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateGroupResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateGroupResponse;
  static deserializeBinaryFromReader(message: UpdateGroupResponse, reader: jspb.BinaryReader): UpdateGroupResponse;
}

export namespace UpdateGroupResponse {
  export type AsObject = {
  }
}

export class DeleteGroupsRequest extends jspb.Message {
  clearGroupsIdList(): void;
  getGroupsIdList(): Array<string>;
  setGroupsIdList(value: Array<string>): void;
  addGroupsId(value: string, index?: number): string;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteGroupsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteGroupsRequest): DeleteGroupsRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeleteGroupsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteGroupsRequest;
  static deserializeBinaryFromReader(message: DeleteGroupsRequest, reader: jspb.BinaryReader): DeleteGroupsRequest;
}

export namespace DeleteGroupsRequest {
  export type AsObject = {
    groupsIdList: Array<string>,
  }
}

export class DeleteGroupsResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteGroupsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteGroupsResponse): DeleteGroupsResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeleteGroupsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteGroupsResponse;
  static deserializeBinaryFromReader(message: DeleteGroupsResponse, reader: jspb.BinaryReader): DeleteGroupsResponse;
}

export namespace DeleteGroupsResponse {
  export type AsObject = {
  }
}

export class ListGroupTargetsRequest extends jspb.Message {
  getGroupId(): string;
  setGroupId(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ListGroupTargetsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ListGroupTargetsRequest): ListGroupTargetsRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ListGroupTargetsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ListGroupTargetsRequest;
  static deserializeBinaryFromReader(message: ListGroupTargetsRequest, reader: jspb.BinaryReader): ListGroupTargetsRequest;
}

export namespace ListGroupTargetsRequest {
  export type AsObject = {
    groupId: string,
  }
}

export class ListGroupTargetsResponse extends jspb.Message {
  clearTargetsList(): void;
  getTargetsList(): Array<Target>;
  setTargetsList(value: Array<Target>): void;
  addTargets(value?: Target, index?: number): Target;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ListGroupTargetsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ListGroupTargetsResponse): ListGroupTargetsResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ListGroupTargetsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ListGroupTargetsResponse;
  static deserializeBinaryFromReader(message: ListGroupTargetsResponse, reader: jspb.BinaryReader): ListGroupTargetsResponse;
}

export namespace ListGroupTargetsResponse {
  export type AsObject = {
    targetsList: Array<Target.AsObject>,
  }
}

export class UpdateGroupTargetsRequest extends jspb.Message {
  getGroupId(): string;
  setGroupId(value: string): void;

  clearTargetsList(): void;
  getTargetsList(): Array<Target>;
  setTargetsList(value: Array<Target>): void;
  addTargets(value?: Target, index?: number): Target;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateGroupTargetsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateGroupTargetsRequest): UpdateGroupTargetsRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateGroupTargetsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateGroupTargetsRequest;
  static deserializeBinaryFromReader(message: UpdateGroupTargetsRequest, reader: jspb.BinaryReader): UpdateGroupTargetsRequest;
}

export namespace UpdateGroupTargetsRequest {
  export type AsObject = {
    groupId: string,
    targetsList: Array<Target.AsObject>,
  }
}

export class UpdateGroupTargetsResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateGroupTargetsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateGroupTargetsResponse): UpdateGroupTargetsResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateGroupTargetsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateGroupTargetsResponse;
  static deserializeBinaryFromReader(message: UpdateGroupTargetsResponse, reader: jspb.BinaryReader): UpdateGroupTargetsResponse;
}

export namespace UpdateGroupTargetsResponse {
  export type AsObject = {
  }
}

export interface MotionTypeMap {
  UNKNOWN_MOTION_TYPE: 0;
  HEAD: 1;
}

export const MotionType: MotionTypeMap;

