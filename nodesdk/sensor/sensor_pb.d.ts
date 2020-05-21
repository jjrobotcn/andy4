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

export class DataObs extends jspb.Message {
  getDataMap(): jspb.Map<string, number>;
  clearDataMap(): void;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DataObs.AsObject;
  static toObject(includeInstance: boolean, msg: DataObs): DataObs.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DataObs, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DataObs;
  static deserializeBinaryFromReader(message: DataObs, reader: jspb.BinaryReader): DataObs;
}

export namespace DataObs {
  export type AsObject = {
    dataMap: Array<[string, number]>,
  }
}

export class DataAgv extends jspb.Message {
  getCardId(): string;
  setCardId(value: string): void;

  clearDataList(): void;
  getDataList(): Array<boolean>;
  setDataList(value: Array<boolean>): void;
  addData(value: boolean, index?: number): boolean;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DataAgv.AsObject;
  static toObject(includeInstance: boolean, msg: DataAgv): DataAgv.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DataAgv, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DataAgv;
  static deserializeBinaryFromReader(message: DataAgv, reader: jspb.BinaryReader): DataAgv;
}

export namespace DataAgv {
  export type AsObject = {
    cardId: string,
    dataList: Array<boolean>,
  }
}

export class DataTouch extends jspb.Message {
  getTouchedMap(): jspb.Map<string, boolean>;
  clearTouchedMap(): void;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DataTouch.AsObject;
  static toObject(includeInstance: boolean, msg: DataTouch): DataTouch.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DataTouch, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DataTouch;
  static deserializeBinaryFromReader(message: DataTouch, reader: jspb.BinaryReader): DataTouch;
}

export namespace DataTouch {
  export type AsObject = {
    touchedMap: Array<[string, boolean]>,
  }
}

export class UpdateReq extends jspb.Message {
  getDtype(): DataTypeMap[keyof DataTypeMap];
  setDtype(value: DataTypeMap[keyof DataTypeMap]): void;

  hasObs(): boolean;
  clearObs(): void;
  getObs(): DataObs | undefined;
  setObs(value?: DataObs): void;

  hasAgv(): boolean;
  clearAgv(): void;
  getAgv(): DataAgv | undefined;
  setAgv(value?: DataAgv): void;

  hasTouch(): boolean;
  clearTouch(): void;
  getTouch(): DataTouch | undefined;
  setTouch(value?: DataTouch): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateReq.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateReq): UpdateReq.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateReq, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateReq;
  static deserializeBinaryFromReader(message: UpdateReq, reader: jspb.BinaryReader): UpdateReq;
}

export namespace UpdateReq {
  export type AsObject = {
    dtype: DataTypeMap[keyof DataTypeMap],
    obs?: DataObs.AsObject,
    agv?: DataAgv.AsObject,
    touch?: DataTouch.AsObject,
  }
}

export class RawRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RawRequest.AsObject;
  static toObject(includeInstance: boolean, msg: RawRequest): RawRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: RawRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RawRequest;
  static deserializeBinaryFromReader(message: RawRequest, reader: jspb.BinaryReader): RawRequest;
}

export namespace RawRequest {
  export type AsObject = {
  }
}

export class RawResponse extends jspb.Message {
  getDtype(): DataTypeMap[keyof DataTypeMap];
  setDtype(value: DataTypeMap[keyof DataTypeMap]): void;

  hasObs(): boolean;
  clearObs(): void;
  getObs(): DataObs | undefined;
  setObs(value?: DataObs): void;

  hasAgv(): boolean;
  clearAgv(): void;
  getAgv(): DataAgv | undefined;
  setAgv(value?: DataAgv): void;

  hasTouch(): boolean;
  clearTouch(): void;
  getTouch(): DataTouch | undefined;
  setTouch(value?: DataTouch): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RawResponse.AsObject;
  static toObject(includeInstance: boolean, msg: RawResponse): RawResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: RawResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RawResponse;
  static deserializeBinaryFromReader(message: RawResponse, reader: jspb.BinaryReader): RawResponse;
}

export namespace RawResponse {
  export type AsObject = {
    dtype: DataTypeMap[keyof DataTypeMap],
    obs?: DataObs.AsObject,
    agv?: DataAgv.AsObject,
    touch?: DataTouch.AsObject,
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

export interface DataTypeMap {
  UNKNOWN: 0;
  OBS: 1;
  AGV: 2;
  TOUCH: 4;
}

export const DataType: DataTypeMap;

