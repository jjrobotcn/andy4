// package: lightsService
// file: lights.proto

import * as jspb from "google-protobuf";

export class PreviewLightRequest extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PreviewLightRequest.AsObject;
  static toObject(includeInstance: boolean, msg: PreviewLightRequest): PreviewLightRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PreviewLightRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PreviewLightRequest;
  static deserializeBinaryFromReader(message: PreviewLightRequest, reader: jspb.BinaryReader): PreviewLightRequest;
}

export namespace PreviewLightRequest {
  export type AsObject = {
    id: string,
  }
}

export class PreviewLightResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PreviewLightResponse.AsObject;
  static toObject(includeInstance: boolean, msg: PreviewLightResponse): PreviewLightResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PreviewLightResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PreviewLightResponse;
  static deserializeBinaryFromReader(message: PreviewLightResponse, reader: jspb.BinaryReader): PreviewLightResponse;
}

export namespace PreviewLightResponse {
  export type AsObject = {
  }
}

export class PlayLightRequest extends jspb.Message {
  getLtype(): LightTypeMap[keyof LightTypeMap];
  setLtype(value: LightTypeMap[keyof LightTypeMap]): void;

  getId(): string;
  setId(value: string): void;

  getName(): string;
  setName(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PlayLightRequest.AsObject;
  static toObject(includeInstance: boolean, msg: PlayLightRequest): PlayLightRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PlayLightRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PlayLightRequest;
  static deserializeBinaryFromReader(message: PlayLightRequest, reader: jspb.BinaryReader): PlayLightRequest;
}

export namespace PlayLightRequest {
  export type AsObject = {
    ltype: LightTypeMap[keyof LightTypeMap],
    id: string,
    name: string,
  }
}

export class PlayLightResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PlayLightResponse.AsObject;
  static toObject(includeInstance: boolean, msg: PlayLightResponse): PlayLightResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PlayLightResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PlayLightResponse;
  static deserializeBinaryFromReader(message: PlayLightResponse, reader: jspb.BinaryReader): PlayLightResponse;
}

export namespace PlayLightResponse {
  export type AsObject = {
  }
}

export class StopLightRequest extends jspb.Message {
  clearLtypesList(): void;
  getLtypesList(): Array<LightTypeMap[keyof LightTypeMap]>;
  setLtypesList(value: Array<LightTypeMap[keyof LightTypeMap]>): void;
  addLtypes(value: LightTypeMap[keyof LightTypeMap], index?: number): LightTypeMap[keyof LightTypeMap];

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): StopLightRequest.AsObject;
  static toObject(includeInstance: boolean, msg: StopLightRequest): StopLightRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: StopLightRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): StopLightRequest;
  static deserializeBinaryFromReader(message: StopLightRequest, reader: jspb.BinaryReader): StopLightRequest;
}

export namespace StopLightRequest {
  export type AsObject = {
    ltypesList: Array<LightTypeMap[keyof LightTypeMap]>,
  }
}

export class StopLightResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): StopLightResponse.AsObject;
  static toObject(includeInstance: boolean, msg: StopLightResponse): StopLightResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: StopLightResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): StopLightResponse;
  static deserializeBinaryFromReader(message: StopLightResponse, reader: jspb.BinaryReader): StopLightResponse;
}

export namespace StopLightResponse {
  export type AsObject = {
  }
}

export class LightInfo extends jspb.Message {
  getLtype(): LightTypeMap[keyof LightTypeMap];
  setLtype(value: LightTypeMap[keyof LightTypeMap]): void;

  getId(): string;
  setId(value: string): void;

  getName(): string;
  setName(value: string): void;

  clearFramesList(): void;
  getFramesList(): Array<LightFrame>;
  setFramesList(value: Array<LightFrame>): void;
  addFrames(value?: LightFrame, index?: number): LightFrame;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): LightInfo.AsObject;
  static toObject(includeInstance: boolean, msg: LightInfo): LightInfo.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: LightInfo, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): LightInfo;
  static deserializeBinaryFromReader(message: LightInfo, reader: jspb.BinaryReader): LightInfo;
}

export namespace LightInfo {
  export type AsObject = {
    ltype: LightTypeMap[keyof LightTypeMap],
    id: string,
    name: string,
    framesList: Array<LightFrame.AsObject>,
  }
}

export class LightFrame extends jspb.Message {
  clearColorsList(): void;
  getColorsList(): Array<string>;
  setColorsList(value: Array<string>): void;
  addColors(value: string, index?: number): string;

  getSpeed(): number;
  setSpeed(value: number): void;

  getMode(): PlayModeMap[keyof PlayModeMap];
  setMode(value: PlayModeMap[keyof PlayModeMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): LightFrame.AsObject;
  static toObject(includeInstance: boolean, msg: LightFrame): LightFrame.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: LightFrame, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): LightFrame;
  static deserializeBinaryFromReader(message: LightFrame, reader: jspb.BinaryReader): LightFrame;
}

export namespace LightFrame {
  export type AsObject = {
    colorsList: Array<string>,
    speed: number,
    mode: PlayModeMap[keyof PlayModeMap],
  }
}

export class ListLightsRequest extends jspb.Message {
  getLtype(): LightTypeMap[keyof LightTypeMap];
  setLtype(value: LightTypeMap[keyof LightTypeMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ListLightsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ListLightsRequest): ListLightsRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ListLightsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ListLightsRequest;
  static deserializeBinaryFromReader(message: ListLightsRequest, reader: jspb.BinaryReader): ListLightsRequest;
}

export namespace ListLightsRequest {
  export type AsObject = {
    ltype: LightTypeMap[keyof LightTypeMap],
  }
}

export class ListLightsResponse extends jspb.Message {
  clearLightsInfoList(): void;
  getLightsInfoList(): Array<LightInfo>;
  setLightsInfoList(value: Array<LightInfo>): void;
  addLightsInfo(value?: LightInfo, index?: number): LightInfo;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ListLightsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ListLightsResponse): ListLightsResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ListLightsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ListLightsResponse;
  static deserializeBinaryFromReader(message: ListLightsResponse, reader: jspb.BinaryReader): ListLightsResponse;
}

export namespace ListLightsResponse {
  export type AsObject = {
    lightsInfoList: Array<LightInfo.AsObject>,
  }
}

export class NewLightRequest extends jspb.Message {
  hasLightInfo(): boolean;
  clearLightInfo(): void;
  getLightInfo(): LightInfo | undefined;
  setLightInfo(value?: LightInfo): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): NewLightRequest.AsObject;
  static toObject(includeInstance: boolean, msg: NewLightRequest): NewLightRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: NewLightRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): NewLightRequest;
  static deserializeBinaryFromReader(message: NewLightRequest, reader: jspb.BinaryReader): NewLightRequest;
}

export namespace NewLightRequest {
  export type AsObject = {
    lightInfo?: LightInfo.AsObject,
  }
}

export class NewLightResponse extends jspb.Message {
  hasLightInfo(): boolean;
  clearLightInfo(): void;
  getLightInfo(): LightInfo | undefined;
  setLightInfo(value?: LightInfo): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): NewLightResponse.AsObject;
  static toObject(includeInstance: boolean, msg: NewLightResponse): NewLightResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: NewLightResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): NewLightResponse;
  static deserializeBinaryFromReader(message: NewLightResponse, reader: jspb.BinaryReader): NewLightResponse;
}

export namespace NewLightResponse {
  export type AsObject = {
    lightInfo?: LightInfo.AsObject,
  }
}

export class UpdateLightRequest extends jspb.Message {
  hasLightInfo(): boolean;
  clearLightInfo(): void;
  getLightInfo(): LightInfo | undefined;
  setLightInfo(value?: LightInfo): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateLightRequest.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateLightRequest): UpdateLightRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateLightRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateLightRequest;
  static deserializeBinaryFromReader(message: UpdateLightRequest, reader: jspb.BinaryReader): UpdateLightRequest;
}

export namespace UpdateLightRequest {
  export type AsObject = {
    lightInfo?: LightInfo.AsObject,
  }
}

export class UpdateLightResponse extends jspb.Message {
  hasLightInfo(): boolean;
  clearLightInfo(): void;
  getLightInfo(): LightInfo | undefined;
  setLightInfo(value?: LightInfo): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateLightResponse.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateLightResponse): UpdateLightResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateLightResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateLightResponse;
  static deserializeBinaryFromReader(message: UpdateLightResponse, reader: jspb.BinaryReader): UpdateLightResponse;
}

export namespace UpdateLightResponse {
  export type AsObject = {
    lightInfo?: LightInfo.AsObject,
  }
}

export class DeleteLightsRequest extends jspb.Message {
  clearLightsIdList(): void;
  getLightsIdList(): Array<string>;
  setLightsIdList(value: Array<string>): void;
  addLightsId(value: string, index?: number): string;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteLightsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteLightsRequest): DeleteLightsRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeleteLightsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteLightsRequest;
  static deserializeBinaryFromReader(message: DeleteLightsRequest, reader: jspb.BinaryReader): DeleteLightsRequest;
}

export namespace DeleteLightsRequest {
  export type AsObject = {
    lightsIdList: Array<string>,
  }
}

export class DeleteLightsResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteLightsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteLightsResponse): DeleteLightsResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeleteLightsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteLightsResponse;
  static deserializeBinaryFromReader(message: DeleteLightsResponse, reader: jspb.BinaryReader): DeleteLightsResponse;
}

export namespace DeleteLightsResponse {
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
  getIsActive(): boolean;
  setIsActive(value: boolean): void;

  getIsPlaying(): boolean;
  setIsPlaying(value: boolean): void;

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
    isActive: boolean,
    isPlaying: boolean,
  }
}

export class SwitchRequest extends jspb.Message {
  getActive(): boolean;
  setActive(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SwitchRequest.AsObject;
  static toObject(includeInstance: boolean, msg: SwitchRequest): SwitchRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SwitchRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SwitchRequest;
  static deserializeBinaryFromReader(message: SwitchRequest, reader: jspb.BinaryReader): SwitchRequest;
}

export namespace SwitchRequest {
  export type AsObject = {
    active: boolean,
  }
}

export class SwitchResponse extends jspb.Message {
  getIsActive(): boolean;
  setIsActive(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SwitchResponse.AsObject;
  static toObject(includeInstance: boolean, msg: SwitchResponse): SwitchResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SwitchResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SwitchResponse;
  static deserializeBinaryFromReader(message: SwitchResponse, reader: jspb.BinaryReader): SwitchResponse;
}

export namespace SwitchResponse {
  export type AsObject = {
    isActive: boolean,
  }
}

export interface LightTypeMap {
  UNDEFINED: 0;
  MOUTH: 1;
  HANDS: 2;
  EARS: 3;
}

export const LightType: LightTypeMap;

export interface PlayModeMap {
  PRESET: 0;
  ALWAYS: 1;
  MARQUEE: 2;
  FLASH: 3;
  TICKTOCK: 4;
}

export const PlayMode: PlayModeMap;

