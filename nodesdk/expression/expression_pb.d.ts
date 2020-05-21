// package: expressionService
// file: expression.proto

import * as jspb from "google-protobuf";

export class ExpressionInfo extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  getName(): string;
  setName(value: string): void;

  getPreviewB64(): string;
  setPreviewB64(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ExpressionInfo.AsObject;
  static toObject(includeInstance: boolean, msg: ExpressionInfo): ExpressionInfo.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ExpressionInfo, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ExpressionInfo;
  static deserializeBinaryFromReader(message: ExpressionInfo, reader: jspb.BinaryReader): ExpressionInfo;
}

export namespace ExpressionInfo {
  export type AsObject = {
    id: string,
    name: string,
    previewB64: string,
  }
}

export class PlayExpressionsRequest extends jspb.Message {
  clearExpressionsInfoList(): void;
  getExpressionsInfoList(): Array<ExpressionInfo>;
  setExpressionsInfoList(value: Array<ExpressionInfo>): void;
  addExpressionsInfo(value?: ExpressionInfo, index?: number): ExpressionInfo;

  getLoopTimes(): number;
  setLoopTimes(value: number): void;

  getDuration(): number;
  setDuration(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PlayExpressionsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: PlayExpressionsRequest): PlayExpressionsRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PlayExpressionsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PlayExpressionsRequest;
  static deserializeBinaryFromReader(message: PlayExpressionsRequest, reader: jspb.BinaryReader): PlayExpressionsRequest;
}

export namespace PlayExpressionsRequest {
  export type AsObject = {
    expressionsInfoList: Array<ExpressionInfo.AsObject>,
    loopTimes: number,
    duration: number,
  }
}

export class PlayExpressionsResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PlayExpressionsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: PlayExpressionsResponse): PlayExpressionsResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PlayExpressionsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PlayExpressionsResponse;
  static deserializeBinaryFromReader(message: PlayExpressionsResponse, reader: jspb.BinaryReader): PlayExpressionsResponse;
}

export namespace PlayExpressionsResponse {
  export type AsObject = {
  }
}

export class StopExpressionRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): StopExpressionRequest.AsObject;
  static toObject(includeInstance: boolean, msg: StopExpressionRequest): StopExpressionRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: StopExpressionRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): StopExpressionRequest;
  static deserializeBinaryFromReader(message: StopExpressionRequest, reader: jspb.BinaryReader): StopExpressionRequest;
}

export namespace StopExpressionRequest {
  export type AsObject = {
  }
}

export class StopExpressionResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): StopExpressionResponse.AsObject;
  static toObject(includeInstance: boolean, msg: StopExpressionResponse): StopExpressionResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: StopExpressionResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): StopExpressionResponse;
  static deserializeBinaryFromReader(message: StopExpressionResponse, reader: jspb.BinaryReader): StopExpressionResponse;
}

export namespace StopExpressionResponse {
  export type AsObject = {
  }
}

export class UploadExpressionFileRequest extends jspb.Message {
  getName(): string;
  setName(value: string): void;

  getData(): Uint8Array | string;
  getData_asU8(): Uint8Array;
  getData_asB64(): string;
  setData(value: Uint8Array | string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UploadExpressionFileRequest.AsObject;
  static toObject(includeInstance: boolean, msg: UploadExpressionFileRequest): UploadExpressionFileRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UploadExpressionFileRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UploadExpressionFileRequest;
  static deserializeBinaryFromReader(message: UploadExpressionFileRequest, reader: jspb.BinaryReader): UploadExpressionFileRequest;
}

export namespace UploadExpressionFileRequest {
  export type AsObject = {
    name: string,
    data: Uint8Array | string,
  }
}

export class UploadExpressionFileResponse extends jspb.Message {
  hasExpressionInfo(): boolean;
  clearExpressionInfo(): void;
  getExpressionInfo(): ExpressionInfo | undefined;
  setExpressionInfo(value?: ExpressionInfo): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UploadExpressionFileResponse.AsObject;
  static toObject(includeInstance: boolean, msg: UploadExpressionFileResponse): UploadExpressionFileResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UploadExpressionFileResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UploadExpressionFileResponse;
  static deserializeBinaryFromReader(message: UploadExpressionFileResponse, reader: jspb.BinaryReader): UploadExpressionFileResponse;
}

export namespace UploadExpressionFileResponse {
  export type AsObject = {
    expressionInfo?: ExpressionInfo.AsObject,
  }
}

export class ListExpressionsRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ListExpressionsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ListExpressionsRequest): ListExpressionsRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ListExpressionsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ListExpressionsRequest;
  static deserializeBinaryFromReader(message: ListExpressionsRequest, reader: jspb.BinaryReader): ListExpressionsRequest;
}

export namespace ListExpressionsRequest {
  export type AsObject = {
  }
}

export class ListExpressionsResponse extends jspb.Message {
  clearExpressionsInfoList(): void;
  getExpressionsInfoList(): Array<ExpressionInfo>;
  setExpressionsInfoList(value: Array<ExpressionInfo>): void;
  addExpressionsInfo(value?: ExpressionInfo, index?: number): ExpressionInfo;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ListExpressionsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ListExpressionsResponse): ListExpressionsResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ListExpressionsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ListExpressionsResponse;
  static deserializeBinaryFromReader(message: ListExpressionsResponse, reader: jspb.BinaryReader): ListExpressionsResponse;
}

export namespace ListExpressionsResponse {
  export type AsObject = {
    expressionsInfoList: Array<ExpressionInfo.AsObject>,
  }
}

export class DeleteExpressionsRequest extends jspb.Message {
  clearExpressionsIdList(): void;
  getExpressionsIdList(): Array<string>;
  setExpressionsIdList(value: Array<string>): void;
  addExpressionsId(value: string, index?: number): string;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteExpressionsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteExpressionsRequest): DeleteExpressionsRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeleteExpressionsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteExpressionsRequest;
  static deserializeBinaryFromReader(message: DeleteExpressionsRequest, reader: jspb.BinaryReader): DeleteExpressionsRequest;
}

export namespace DeleteExpressionsRequest {
  export type AsObject = {
    expressionsIdList: Array<string>,
  }
}

export class DeleteExpressionsResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteExpressionsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteExpressionsResponse): DeleteExpressionsResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeleteExpressionsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteExpressionsResponse;
  static deserializeBinaryFromReader(message: DeleteExpressionsResponse, reader: jspb.BinaryReader): DeleteExpressionsResponse;
}

export namespace DeleteExpressionsResponse {
  export type AsObject = {
  }
}

export class RenameRequest extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  getName(): string;
  setName(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RenameRequest.AsObject;
  static toObject(includeInstance: boolean, msg: RenameRequest): RenameRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: RenameRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RenameRequest;
  static deserializeBinaryFromReader(message: RenameRequest, reader: jspb.BinaryReader): RenameRequest;
}

export namespace RenameRequest {
  export type AsObject = {
    id: string,
    name: string,
  }
}

export class RenameResponse extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  getName(): string;
  setName(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RenameResponse.AsObject;
  static toObject(includeInstance: boolean, msg: RenameResponse): RenameResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: RenameResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RenameResponse;
  static deserializeBinaryFromReader(message: RenameResponse, reader: jspb.BinaryReader): RenameResponse;
}

export namespace RenameResponse {
  export type AsObject = {
    id: string,
    name: string,
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

