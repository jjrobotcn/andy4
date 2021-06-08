// package: handsmotion
// file: group.proto

import * as jspb from "google-protobuf";
import * as capability_pb from "./capability_pb";

export class MotionMeta extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  getName(): string;
  setName(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MotionMeta.AsObject;
  static toObject(includeInstance: boolean, msg: MotionMeta): MotionMeta.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MotionMeta, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MotionMeta;
  static deserializeBinaryFromReader(message: MotionMeta, reader: jspb.BinaryReader): MotionMeta;
}

export namespace MotionMeta {
  export type AsObject = {
    id: string,
    name: string,
  }
}

export class NewMotionGroupRequest extends jspb.Message {
  getName(): string;
  setName(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): NewMotionGroupRequest.AsObject;
  static toObject(includeInstance: boolean, msg: NewMotionGroupRequest): NewMotionGroupRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: NewMotionGroupRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): NewMotionGroupRequest;
  static deserializeBinaryFromReader(message: NewMotionGroupRequest, reader: jspb.BinaryReader): NewMotionGroupRequest;
}

export namespace NewMotionGroupRequest {
  export type AsObject = {
    name: string,
  }
}

export class NewMotionGroupResponse extends jspb.Message {
  hasMotion(): boolean;
  clearMotion(): void;
  getMotion(): MotionMeta | undefined;
  setMotion(value?: MotionMeta): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): NewMotionGroupResponse.AsObject;
  static toObject(includeInstance: boolean, msg: NewMotionGroupResponse): NewMotionGroupResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: NewMotionGroupResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): NewMotionGroupResponse;
  static deserializeBinaryFromReader(message: NewMotionGroupResponse, reader: jspb.BinaryReader): NewMotionGroupResponse;
}

export namespace NewMotionGroupResponse {
  export type AsObject = {
    motion?: MotionMeta.AsObject,
  }
}

export class ListMotionGroupsRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ListMotionGroupsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ListMotionGroupsRequest): ListMotionGroupsRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ListMotionGroupsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ListMotionGroupsRequest;
  static deserializeBinaryFromReader(message: ListMotionGroupsRequest, reader: jspb.BinaryReader): ListMotionGroupsRequest;
}

export namespace ListMotionGroupsRequest {
  export type AsObject = {
  }
}

export class ListMotionGroupsResponse extends jspb.Message {
  clearMotionsList(): void;
  getMotionsList(): Array<MotionMeta>;
  setMotionsList(value: Array<MotionMeta>): void;
  addMotions(value?: MotionMeta, index?: number): MotionMeta;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ListMotionGroupsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ListMotionGroupsResponse): ListMotionGroupsResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ListMotionGroupsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ListMotionGroupsResponse;
  static deserializeBinaryFromReader(message: ListMotionGroupsResponse, reader: jspb.BinaryReader): ListMotionGroupsResponse;
}

export namespace ListMotionGroupsResponse {
  export type AsObject = {
    motionsList: Array<MotionMeta.AsObject>,
  }
}

export class DeleteMotionGroupRequest extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteMotionGroupRequest.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteMotionGroupRequest): DeleteMotionGroupRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeleteMotionGroupRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteMotionGroupRequest;
  static deserializeBinaryFromReader(message: DeleteMotionGroupRequest, reader: jspb.BinaryReader): DeleteMotionGroupRequest;
}

export namespace DeleteMotionGroupRequest {
  export type AsObject = {
    id: string,
  }
}

export class DeleteMotionGroupResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteMotionGroupResponse.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteMotionGroupResponse): DeleteMotionGroupResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeleteMotionGroupResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteMotionGroupResponse;
  static deserializeBinaryFromReader(message: DeleteMotionGroupResponse, reader: jspb.BinaryReader): DeleteMotionGroupResponse;
}

export namespace DeleteMotionGroupResponse {
  export type AsObject = {
  }
}

export class GetMotionGroupRequest extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetMotionGroupRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetMotionGroupRequest): GetMotionGroupRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetMotionGroupRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetMotionGroupRequest;
  static deserializeBinaryFromReader(message: GetMotionGroupRequest, reader: jspb.BinaryReader): GetMotionGroupRequest;
}

export namespace GetMotionGroupRequest {
  export type AsObject = {
    id: string,
  }
}

export class GetMotionGroupResponse extends jspb.Message {
  hasMeta(): boolean;
  clearMeta(): void;
  getMeta(): MotionMeta | undefined;
  setMeta(value?: MotionMeta): void;

  clearScriptsList(): void;
  getScriptsList(): Array<capability_pb.MovementScript>;
  setScriptsList(value: Array<capability_pb.MovementScript>): void;
  addScripts(value?: capability_pb.MovementScript, index?: number): capability_pb.MovementScript;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetMotionGroupResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetMotionGroupResponse): GetMotionGroupResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetMotionGroupResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetMotionGroupResponse;
  static deserializeBinaryFromReader(message: GetMotionGroupResponse, reader: jspb.BinaryReader): GetMotionGroupResponse;
}

export namespace GetMotionGroupResponse {
  export type AsObject = {
    meta?: MotionMeta.AsObject,
    scriptsList: Array<capability_pb.MovementScript.AsObject>,
  }
}

export class UpdateMotionMetaRequest extends jspb.Message {
  hasMotion(): boolean;
  clearMotion(): void;
  getMotion(): MotionMeta | undefined;
  setMotion(value?: MotionMeta): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateMotionMetaRequest.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateMotionMetaRequest): UpdateMotionMetaRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateMotionMetaRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateMotionMetaRequest;
  static deserializeBinaryFromReader(message: UpdateMotionMetaRequest, reader: jspb.BinaryReader): UpdateMotionMetaRequest;
}

export namespace UpdateMotionMetaRequest {
  export type AsObject = {
    motion?: MotionMeta.AsObject,
  }
}

export class UpdateMotionMetaResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateMotionMetaResponse.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateMotionMetaResponse): UpdateMotionMetaResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateMotionMetaResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateMotionMetaResponse;
  static deserializeBinaryFromReader(message: UpdateMotionMetaResponse, reader: jspb.BinaryReader): UpdateMotionMetaResponse;
}

export namespace UpdateMotionMetaResponse {
  export type AsObject = {
  }
}

export class UpdateMotionScriptsRequest extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  clearScriptsList(): void;
  getScriptsList(): Array<capability_pb.MovementScript>;
  setScriptsList(value: Array<capability_pb.MovementScript>): void;
  addScripts(value?: capability_pb.MovementScript, index?: number): capability_pb.MovementScript;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateMotionScriptsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateMotionScriptsRequest): UpdateMotionScriptsRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateMotionScriptsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateMotionScriptsRequest;
  static deserializeBinaryFromReader(message: UpdateMotionScriptsRequest, reader: jspb.BinaryReader): UpdateMotionScriptsRequest;
}

export namespace UpdateMotionScriptsRequest {
  export type AsObject = {
    id: string,
    scriptsList: Array<capability_pb.MovementScript.AsObject>,
  }
}

export class UpdateMotionScriptsResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateMotionScriptsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateMotionScriptsResponse): UpdateMotionScriptsResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateMotionScriptsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateMotionScriptsResponse;
  static deserializeBinaryFromReader(message: UpdateMotionScriptsResponse, reader: jspb.BinaryReader): UpdateMotionScriptsResponse;
}

export namespace UpdateMotionScriptsResponse {
  export type AsObject = {
  }
}

