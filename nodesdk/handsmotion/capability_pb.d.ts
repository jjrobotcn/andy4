// package: handsmotion
// file: capability.proto

import * as jspb from "google-protobuf";

export class FingersAdjustmentRequest extends jspb.Message {
  getHandIdx(): number;
  setHandIdx(value: number): void;

  hasReset(): boolean;
  clearReset(): void;
  getReset(): boolean;
  setReset(value: boolean): void;

  hasMove(): boolean;
  clearMove(): void;
  getMove(): FingersAdjustmentRequest.FingerMove | undefined;
  setMove(value?: FingersAdjustmentRequest.FingerMove): void;

  getReqCase(): FingersAdjustmentRequest.ReqCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FingersAdjustmentRequest.AsObject;
  static toObject(includeInstance: boolean, msg: FingersAdjustmentRequest): FingersAdjustmentRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: FingersAdjustmentRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FingersAdjustmentRequest;
  static deserializeBinaryFromReader(message: FingersAdjustmentRequest, reader: jspb.BinaryReader): FingersAdjustmentRequest;
}

export namespace FingersAdjustmentRequest {
  export type AsObject = {
    handIdx: number,
    reset: boolean,
    move?: FingersAdjustmentRequest.FingerMove.AsObject,
  }

  export class FingerMove extends jspb.Message {
    getFingerIdx(): number;
    setFingerIdx(value: number): void;

    getType(): FingersAdjustmentRequest.FingerMove.FingerMovementTypesMap[keyof FingersAdjustmentRequest.FingerMove.FingerMovementTypesMap];
    setType(value: FingersAdjustmentRequest.FingerMove.FingerMovementTypesMap[keyof FingersAdjustmentRequest.FingerMove.FingerMovementTypesMap]): void;

    getStroke(): number;
    setStroke(value: number): void;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): FingerMove.AsObject;
    static toObject(includeInstance: boolean, msg: FingerMove): FingerMove.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: FingerMove, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): FingerMove;
    static deserializeBinaryFromReader(message: FingerMove, reader: jspb.BinaryReader): FingerMove;
  }

  export namespace FingerMove {
    export type AsObject = {
      fingerIdx: number,
      type: FingersAdjustmentRequest.FingerMove.FingerMovementTypesMap[keyof FingersAdjustmentRequest.FingerMove.FingerMovementTypesMap],
      stroke: number,
    }

    export interface FingerMovementTypesMap {
      LOOSE: 0;
      TIGHT: 1;
    }

    export const FingerMovementTypes: FingerMovementTypesMap;
  }

  export enum ReqCase {
    REQ_NOT_SET = 0,
    RESET = 2,
    MOVE = 3,
  }
}

export class FingersAdjustmentResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FingersAdjustmentResponse.AsObject;
  static toObject(includeInstance: boolean, msg: FingersAdjustmentResponse): FingersAdjustmentResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: FingersAdjustmentResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FingersAdjustmentResponse;
  static deserializeBinaryFromReader(message: FingersAdjustmentResponse, reader: jspb.BinaryReader): FingersAdjustmentResponse;
}

export namespace FingersAdjustmentResponse {
  export type AsObject = {
  }
}

export class ArmAdjustmentRequest extends jspb.Message {
  getHandIdx(): number;
  setHandIdx(value: number): void;

  hasReset(): boolean;
  clearReset(): void;
  getReset(): boolean;
  setReset(value: boolean): void;

  hasDisability(): boolean;
  clearDisability(): void;
  getDisability(): boolean;
  setDisability(value: boolean): void;

  getReqCase(): ArmAdjustmentRequest.ReqCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ArmAdjustmentRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ArmAdjustmentRequest): ArmAdjustmentRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ArmAdjustmentRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ArmAdjustmentRequest;
  static deserializeBinaryFromReader(message: ArmAdjustmentRequest, reader: jspb.BinaryReader): ArmAdjustmentRequest;
}

export namespace ArmAdjustmentRequest {
  export type AsObject = {
    handIdx: number,
    reset: boolean,
    disability: boolean,
  }

  export enum ReqCase {
    REQ_NOT_SET = 0,
    RESET = 2,
    DISABILITY = 3,
  }
}

export class ArmAdjustmentResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ArmAdjustmentResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ArmAdjustmentResponse): ArmAdjustmentResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ArmAdjustmentResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ArmAdjustmentResponse;
  static deserializeBinaryFromReader(message: ArmAdjustmentResponse, reader: jspb.BinaryReader): ArmAdjustmentResponse;
}

export namespace ArmAdjustmentResponse {
  export type AsObject = {
  }
}

export class Position extends jspb.Message {
  getData(): Uint8Array | string;
  getData_asU8(): Uint8Array;
  getData_asB64(): string;
  setData(value: Uint8Array | string): void;

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
    data: Uint8Array | string,
  }
}

export class MarkAsOriginalPositionRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MarkAsOriginalPositionRequest.AsObject;
  static toObject(includeInstance: boolean, msg: MarkAsOriginalPositionRequest): MarkAsOriginalPositionRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MarkAsOriginalPositionRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MarkAsOriginalPositionRequest;
  static deserializeBinaryFromReader(message: MarkAsOriginalPositionRequest, reader: jspb.BinaryReader): MarkAsOriginalPositionRequest;
}

export namespace MarkAsOriginalPositionRequest {
  export type AsObject = {
  }
}

export class MarkAsOriginalPositionResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MarkAsOriginalPositionResponse.AsObject;
  static toObject(includeInstance: boolean, msg: MarkAsOriginalPositionResponse): MarkAsOriginalPositionResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MarkAsOriginalPositionResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MarkAsOriginalPositionResponse;
  static deserializeBinaryFromReader(message: MarkAsOriginalPositionResponse, reader: jspb.BinaryReader): MarkAsOriginalPositionResponse;
}

export namespace MarkAsOriginalPositionResponse {
  export type AsObject = {
  }
}

export class MovementScript extends jspb.Message {
  hasPosition(): boolean;
  clearPosition(): void;
  getPosition(): Position | undefined;
  setPosition(value?: Position): void;

  getRunTime(): number;
  setRunTime(value: number): void;

  getKeepTime(): number;
  setKeepTime(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MovementScript.AsObject;
  static toObject(includeInstance: boolean, msg: MovementScript): MovementScript.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MovementScript, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MovementScript;
  static deserializeBinaryFromReader(message: MovementScript, reader: jspb.BinaryReader): MovementScript;
}

export namespace MovementScript {
  export type AsObject = {
    position?: Position.AsObject,
    runTime: number,
    keepTime: number,
  }
}

export class GetAbsolutePositionRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetAbsolutePositionRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetAbsolutePositionRequest): GetAbsolutePositionRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetAbsolutePositionRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetAbsolutePositionRequest;
  static deserializeBinaryFromReader(message: GetAbsolutePositionRequest, reader: jspb.BinaryReader): GetAbsolutePositionRequest;
}

export namespace GetAbsolutePositionRequest {
  export type AsObject = {
  }
}

export class GetAbsolutePositionResponse extends jspb.Message {
  hasPosition(): boolean;
  clearPosition(): void;
  getPosition(): Position | undefined;
  setPosition(value?: Position): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetAbsolutePositionResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetAbsolutePositionResponse): GetAbsolutePositionResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetAbsolutePositionResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetAbsolutePositionResponse;
  static deserializeBinaryFromReader(message: GetAbsolutePositionResponse, reader: jspb.BinaryReader): GetAbsolutePositionResponse;
}

export namespace GetAbsolutePositionResponse {
  export type AsObject = {
    position?: Position.AsObject,
  }
}

export class AbsoluteMoveRequest extends jspb.Message {
  clearScriptsList(): void;
  getScriptsList(): Array<MovementScript>;
  setScriptsList(value: Array<MovementScript>): void;
  addScripts(value?: MovementScript, index?: number): MovementScript;

  getSyncMode(): boolean;
  setSyncMode(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AbsoluteMoveRequest.AsObject;
  static toObject(includeInstance: boolean, msg: AbsoluteMoveRequest): AbsoluteMoveRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: AbsoluteMoveRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AbsoluteMoveRequest;
  static deserializeBinaryFromReader(message: AbsoluteMoveRequest, reader: jspb.BinaryReader): AbsoluteMoveRequest;
}

export namespace AbsoluteMoveRequest {
  export type AsObject = {
    scriptsList: Array<MovementScript.AsObject>,
    syncMode: boolean,
  }
}

export class AbsoluteMoveResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AbsoluteMoveResponse.AsObject;
  static toObject(includeInstance: boolean, msg: AbsoluteMoveResponse): AbsoluteMoveResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: AbsoluteMoveResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AbsoluteMoveResponse;
  static deserializeBinaryFromReader(message: AbsoluteMoveResponse, reader: jspb.BinaryReader): AbsoluteMoveResponse;
}

export namespace AbsoluteMoveResponse {
  export type AsObject = {
  }
}

