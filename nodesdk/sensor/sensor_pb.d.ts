// package: sensorService
// file: sensor.proto

import * as jspb from "google-protobuf";

export class GetDetectRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetDetectRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetDetectRequest): GetDetectRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetDetectRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetDetectRequest;
  static deserializeBinaryFromReader(message: GetDetectRequest, reader: jspb.BinaryReader): GetDetectRequest;
}

export namespace GetDetectRequest {
  export type AsObject = {
  }
}

export class GetDetectResponse extends jspb.Message {
  getDirection(): DetectDirectionMap[keyof DetectDirectionMap];
  setDirection(value: DetectDirectionMap[keyof DetectDirectionMap]): void;

  getDistance(): DetectDistanceMap[keyof DetectDistanceMap];
  setDistance(value: DetectDistanceMap[keyof DetectDistanceMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetDetectResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetDetectResponse): GetDetectResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetDetectResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetDetectResponse;
  static deserializeBinaryFromReader(message: GetDetectResponse, reader: jspb.BinaryReader): GetDetectResponse;
}

export namespace GetDetectResponse {
  export type AsObject = {
    direction: DetectDirectionMap[keyof DetectDirectionMap],
    distance: DetectDistanceMap[keyof DetectDistanceMap],
  }
}

export class GetMotionInductionRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetMotionInductionRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetMotionInductionRequest): GetMotionInductionRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetMotionInductionRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetMotionInductionRequest;
  static deserializeBinaryFromReader(message: GetMotionInductionRequest, reader: jspb.BinaryReader): GetMotionInductionRequest;
}

export namespace GetMotionInductionRequest {
  export type AsObject = {
  }
}

export class GetMotionInductionResponse extends jspb.Message {
  getLeft(): boolean;
  setLeft(value: boolean): void;

  getRight(): boolean;
  setRight(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetMotionInductionResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetMotionInductionResponse): GetMotionInductionResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetMotionInductionResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetMotionInductionResponse;
  static deserializeBinaryFromReader(message: GetMotionInductionResponse, reader: jspb.BinaryReader): GetMotionInductionResponse;
}

export namespace GetMotionInductionResponse {
  export type AsObject = {
    left: boolean,
    right: boolean,
  }
}

export class GetTouchRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetTouchRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetTouchRequest): GetTouchRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetTouchRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetTouchRequest;
  static deserializeBinaryFromReader(message: GetTouchRequest, reader: jspb.BinaryReader): GetTouchRequest;
}

export namespace GetTouchRequest {
  export type AsObject = {
  }
}

export class GetTouchResponse extends jspb.Message {
  getHandLeft(): boolean;
  setHandLeft(value: boolean): void;

  getHandRight(): boolean;
  setHandRight(value: boolean): void;

  getHead(): boolean;
  setHead(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetTouchResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetTouchResponse): GetTouchResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetTouchResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetTouchResponse;
  static deserializeBinaryFromReader(message: GetTouchResponse, reader: jspb.BinaryReader): GetTouchResponse;
}

export namespace GetTouchResponse {
  export type AsObject = {
    handLeft: boolean,
    handRight: boolean,
    head: boolean,
  }
}

export class GetBumperRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetBumperRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetBumperRequest): GetBumperRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetBumperRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetBumperRequest;
  static deserializeBinaryFromReader(message: GetBumperRequest, reader: jspb.BinaryReader): GetBumperRequest;
}

export namespace GetBumperRequest {
  export type AsObject = {
  }
}

export class GetBumperResponse extends jspb.Message {
  getForward(): boolean;
  setForward(value: boolean): void;

  getBackward(): boolean;
  setBackward(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetBumperResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetBumperResponse): GetBumperResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetBumperResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetBumperResponse;
  static deserializeBinaryFromReader(message: GetBumperResponse, reader: jspb.BinaryReader): GetBumperResponse;
}

export namespace GetBumperResponse {
  export type AsObject = {
    forward: boolean,
    backward: boolean,
  }
}

export class GetAntiRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetAntiRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetAntiRequest): GetAntiRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetAntiRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetAntiRequest;
  static deserializeBinaryFromReader(message: GetAntiRequest, reader: jspb.BinaryReader): GetAntiRequest;
}

export namespace GetAntiRequest {
  export type AsObject = {
  }
}

export class GetAntiResponse extends jspb.Message {
  getForwardLeftStatus(): boolean;
  setForwardLeftStatus(value: boolean): void;

  getForwardRightStatus(): boolean;
  setForwardRightStatus(value: boolean): void;

  getForwardLeftDistance(): number;
  setForwardLeftDistance(value: number): void;

  getForwardRightDistance(): number;
  setForwardRightDistance(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetAntiResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetAntiResponse): GetAntiResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetAntiResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetAntiResponse;
  static deserializeBinaryFromReader(message: GetAntiResponse, reader: jspb.BinaryReader): GetAntiResponse;
}

export namespace GetAntiResponse {
  export type AsObject = {
    forwardLeftStatus: boolean,
    forwardRightStatus: boolean,
    forwardLeftDistance: number,
    forwardRightDistance: number,
  }
}

export class GetObsRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetObsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetObsRequest): GetObsRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetObsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetObsRequest;
  static deserializeBinaryFromReader(message: GetObsRequest, reader: jspb.BinaryReader): GetObsRequest;
}

export namespace GetObsRequest {
  export type AsObject = {
  }
}

export class GetObsResponse extends jspb.Message {
  getForwardLeft(): number;
  setForwardLeft(value: number): void;

  getForwardRight(): number;
  setForwardRight(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetObsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetObsResponse): GetObsResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetObsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetObsResponse;
  static deserializeBinaryFromReader(message: GetObsResponse, reader: jspb.BinaryReader): GetObsResponse;
}

export namespace GetObsResponse {
  export type AsObject = {
    forwardLeft: number,
    forwardRight: number,
  }
}

export interface DetectDirectionMap {
  _ZERO_DIR: 0;
  RELEASE_DIR: 1;
  LEFT: 2;
  CENTER: 3;
  RIGHT: 4;
}

export const DetectDirection: DetectDirectionMap;

export interface DetectDistanceMap {
  _ZERO_DIS: 0;
  RELEASE_DIS: 1;
  CLOSE: 2;
  MEDIUM: 3;
  LONG: 4;
}

export const DetectDistance: DetectDistanceMap;

