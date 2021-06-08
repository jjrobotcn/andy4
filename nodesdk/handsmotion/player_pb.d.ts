// package: handsmotion
// file: player.proto

import * as jspb from "google-protobuf";
import * as group_pb from "./group_pb";

export class PlayRequest extends jspb.Message {
  hasMotion(): boolean;
  clearMotion(): void;
  getMotion(): group_pb.MotionMeta | undefined;
  setMotion(value?: group_pb.MotionMeta): void;

  getSyncMode(): boolean;
  setSyncMode(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PlayRequest.AsObject;
  static toObject(includeInstance: boolean, msg: PlayRequest): PlayRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PlayRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PlayRequest;
  static deserializeBinaryFromReader(message: PlayRequest, reader: jspb.BinaryReader): PlayRequest;
}

export namespace PlayRequest {
  export type AsObject = {
    motion?: group_pb.MotionMeta.AsObject,
    syncMode: boolean,
  }
}

export class PlayResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PlayResponse.AsObject;
  static toObject(includeInstance: boolean, msg: PlayResponse): PlayResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PlayResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PlayResponse;
  static deserializeBinaryFromReader(message: PlayResponse, reader: jspb.BinaryReader): PlayResponse;
}

export namespace PlayResponse {
  export type AsObject = {
  }
}

export class StopRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): StopRequest.AsObject;
  static toObject(includeInstance: boolean, msg: StopRequest): StopRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: StopRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): StopRequest;
  static deserializeBinaryFromReader(message: StopRequest, reader: jspb.BinaryReader): StopRequest;
}

export namespace StopRequest {
  export type AsObject = {
  }
}

export class StopResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): StopResponse.AsObject;
  static toObject(includeInstance: boolean, msg: StopResponse): StopResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: StopResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): StopResponse;
  static deserializeBinaryFromReader(message: StopResponse, reader: jspb.BinaryReader): StopResponse;
}

export namespace StopResponse {
  export type AsObject = {
  }
}

export class ResetRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ResetRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ResetRequest): ResetRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ResetRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ResetRequest;
  static deserializeBinaryFromReader(message: ResetRequest, reader: jspb.BinaryReader): ResetRequest;
}

export namespace ResetRequest {
  export type AsObject = {
  }
}

export class ResetResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ResetResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ResetResponse): ResetResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ResetResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ResetResponse;
  static deserializeBinaryFromReader(message: ResetResponse, reader: jspb.BinaryReader): ResetResponse;
}

export namespace ResetResponse {
  export type AsObject = {
  }
}

export class StateRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): StateRequest.AsObject;
  static toObject(includeInstance: boolean, msg: StateRequest): StateRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: StateRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): StateRequest;
  static deserializeBinaryFromReader(message: StateRequest, reader: jspb.BinaryReader): StateRequest;
}

export namespace StateRequest {
  export type AsObject = {
  }
}

export class StateResponse extends jspb.Message {
  getState(): PlayerStateMap[keyof PlayerStateMap];
  setState(value: PlayerStateMap[keyof PlayerStateMap]): void;

  hasMotion(): boolean;
  clearMotion(): void;
  getMotion(): group_pb.MotionMeta | undefined;
  setMotion(value?: group_pb.MotionMeta): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): StateResponse.AsObject;
  static toObject(includeInstance: boolean, msg: StateResponse): StateResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: StateResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): StateResponse;
  static deserializeBinaryFromReader(message: StateResponse, reader: jspb.BinaryReader): StateResponse;
}

export namespace StateResponse {
  export type AsObject = {
    state: PlayerStateMap[keyof PlayerStateMap],
    motion?: group_pb.MotionMeta.AsObject,
  }
}

export class OnStateChangeRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): OnStateChangeRequest.AsObject;
  static toObject(includeInstance: boolean, msg: OnStateChangeRequest): OnStateChangeRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: OnStateChangeRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): OnStateChangeRequest;
  static deserializeBinaryFromReader(message: OnStateChangeRequest, reader: jspb.BinaryReader): OnStateChangeRequest;
}

export namespace OnStateChangeRequest {
  export type AsObject = {
  }
}

export class OnStateChangeResponse extends jspb.Message {
  getState(): PlayerStateMap[keyof PlayerStateMap];
  setState(value: PlayerStateMap[keyof PlayerStateMap]): void;

  hasMotion(): boolean;
  clearMotion(): void;
  getMotion(): group_pb.MotionMeta | undefined;
  setMotion(value?: group_pb.MotionMeta): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): OnStateChangeResponse.AsObject;
  static toObject(includeInstance: boolean, msg: OnStateChangeResponse): OnStateChangeResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: OnStateChangeResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): OnStateChangeResponse;
  static deserializeBinaryFromReader(message: OnStateChangeResponse, reader: jspb.BinaryReader): OnStateChangeResponse;
}

export namespace OnStateChangeResponse {
  export type AsObject = {
    state: PlayerStateMap[keyof PlayerStateMap],
    motion?: group_pb.MotionMeta.AsObject,
  }
}

export interface PlayerStateMap {
  UNKNOWN: 0;
  STOPPED: 1;
  PLAYING: 2;
}

export const PlayerState: PlayerStateMap;

