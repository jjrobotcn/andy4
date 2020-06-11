// package: faceRecognition
// file: facedetect.proto

import * as jspb from "google-protobuf";

export class FacePosition extends jspb.Message {
  getX(): number;
  setX(value: number): void;

  getY(): number;
  setY(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FacePosition.AsObject;
  static toObject(includeInstance: boolean, msg: FacePosition): FacePosition.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: FacePosition, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FacePosition;
  static deserializeBinaryFromReader(message: FacePosition, reader: jspb.BinaryReader): FacePosition;
}

export namespace FacePosition {
  export type AsObject = {
    x: number,
    y: number,
  }
}

export class FromImageRequest extends jspb.Message {
  getImage(): Uint8Array | string;
  getImage_asU8(): Uint8Array;
  getImage_asB64(): string;
  setImage(value: Uint8Array | string): void;

  getWithGender(): boolean;
  setWithGender(value: boolean): void;

  getWithAge(): boolean;
  setWithAge(value: boolean): void;

  getWithPosition(): boolean;
  setWithPosition(value: boolean): void;

  getWithFaceCropWidth(): boolean;
  setWithFaceCropWidth(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FromImageRequest.AsObject;
  static toObject(includeInstance: boolean, msg: FromImageRequest): FromImageRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: FromImageRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FromImageRequest;
  static deserializeBinaryFromReader(message: FromImageRequest, reader: jspb.BinaryReader): FromImageRequest;
}

export namespace FromImageRequest {
  export type AsObject = {
    image: Uint8Array | string,
    withGender: boolean,
    withAge: boolean,
    withPosition: boolean,
    withFaceCropWidth: boolean,
  }
}

export class FromImageResponse extends jspb.Message {
  clearFaceCropsList(): void;
  getFaceCropsList(): Array<Uint8Array | string>;
  getFaceCropsList_asU8(): Array<Uint8Array>;
  getFaceCropsList_asB64(): Array<string>;
  setFaceCropsList(value: Array<Uint8Array | string>): void;
  addFaceCrops(value: Uint8Array | string, index?: number): Uint8Array | string;

  clearGendersList(): void;
  getGendersList(): Array<GenderMap[keyof GenderMap]>;
  setGendersList(value: Array<GenderMap[keyof GenderMap]>): void;
  addGenders(value: GenderMap[keyof GenderMap], index?: number): GenderMap[keyof GenderMap];

  clearAgesList(): void;
  getAgesList(): Array<number>;
  setAgesList(value: Array<number>): void;
  addAges(value: number, index?: number): number;

  clearPositionsList(): void;
  getPositionsList(): Array<FacePosition>;
  setPositionsList(value: Array<FacePosition>): void;
  addPositions(value?: FacePosition, index?: number): FacePosition;

  clearFaceCropWidthsList(): void;
  getFaceCropWidthsList(): Array<number>;
  setFaceCropWidthsList(value: Array<number>): void;
  addFaceCropWidths(value: number, index?: number): number;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FromImageResponse.AsObject;
  static toObject(includeInstance: boolean, msg: FromImageResponse): FromImageResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: FromImageResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FromImageResponse;
  static deserializeBinaryFromReader(message: FromImageResponse, reader: jspb.BinaryReader): FromImageResponse;
}

export namespace FromImageResponse {
  export type AsObject = {
    faceCropsList: Array<Uint8Array | string>,
    gendersList: Array<GenderMap[keyof GenderMap]>,
    agesList: Array<number>,
    positionsList: Array<FacePosition.AsObject>,
    faceCropWidthsList: Array<number>,
  }
}

export class OnFaceDetectRequest extends jspb.Message {
  getIntervalMillisecond(): number;
  setIntervalMillisecond(value: number): void;

  getWithGender(): boolean;
  setWithGender(value: boolean): void;

  getWithAge(): boolean;
  setWithAge(value: boolean): void;

  getWithPosition(): boolean;
  setWithPosition(value: boolean): void;

  getWithFaceCropWidth(): boolean;
  setWithFaceCropWidth(value: boolean): void;

  getWithLiveDetect(): boolean;
  setWithLiveDetect(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): OnFaceDetectRequest.AsObject;
  static toObject(includeInstance: boolean, msg: OnFaceDetectRequest): OnFaceDetectRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: OnFaceDetectRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): OnFaceDetectRequest;
  static deserializeBinaryFromReader(message: OnFaceDetectRequest, reader: jspb.BinaryReader): OnFaceDetectRequest;
}

export namespace OnFaceDetectRequest {
  export type AsObject = {
    intervalMillisecond: number,
    withGender: boolean,
    withAge: boolean,
    withPosition: boolean,
    withFaceCropWidth: boolean,
    withLiveDetect: boolean,
  }
}

export class OnFaceDetectResponse extends jspb.Message {
  clearFaceCropsList(): void;
  getFaceCropsList(): Array<Uint8Array | string>;
  getFaceCropsList_asU8(): Array<Uint8Array>;
  getFaceCropsList_asB64(): Array<string>;
  setFaceCropsList(value: Array<Uint8Array | string>): void;
  addFaceCrops(value: Uint8Array | string, index?: number): Uint8Array | string;

  clearGendersList(): void;
  getGendersList(): Array<GenderMap[keyof GenderMap]>;
  setGendersList(value: Array<GenderMap[keyof GenderMap]>): void;
  addGenders(value: GenderMap[keyof GenderMap], index?: number): GenderMap[keyof GenderMap];

  clearAgesList(): void;
  getAgesList(): Array<number>;
  setAgesList(value: Array<number>): void;
  addAges(value: number, index?: number): number;

  clearPositionsList(): void;
  getPositionsList(): Array<FacePosition>;
  setPositionsList(value: Array<FacePosition>): void;
  addPositions(value?: FacePosition, index?: number): FacePosition;

  clearFaceCropWidthsList(): void;
  getFaceCropWidthsList(): Array<number>;
  setFaceCropWidthsList(value: Array<number>): void;
  addFaceCropWidths(value: number, index?: number): number;

  clearLiveDetectList(): void;
  getLiveDetectList(): Array<LiveDetectTypeMap[keyof LiveDetectTypeMap]>;
  setLiveDetectList(value: Array<LiveDetectTypeMap[keyof LiveDetectTypeMap]>): void;
  addLiveDetect(value: LiveDetectTypeMap[keyof LiveDetectTypeMap], index?: number): LiveDetectTypeMap[keyof LiveDetectTypeMap];

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): OnFaceDetectResponse.AsObject;
  static toObject(includeInstance: boolean, msg: OnFaceDetectResponse): OnFaceDetectResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: OnFaceDetectResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): OnFaceDetectResponse;
  static deserializeBinaryFromReader(message: OnFaceDetectResponse, reader: jspb.BinaryReader): OnFaceDetectResponse;
}

export namespace OnFaceDetectResponse {
  export type AsObject = {
    faceCropsList: Array<Uint8Array | string>,
    gendersList: Array<GenderMap[keyof GenderMap]>,
    agesList: Array<number>,
    positionsList: Array<FacePosition.AsObject>,
    faceCropWidthsList: Array<number>,
    liveDetectList: Array<LiveDetectTypeMap[keyof LiveDetectTypeMap]>,
  }
}

export class OnFaceSetFaceDetectRequest extends jspb.Message {
  getFaceSetId(): string;
  setFaceSetId(value: string): void;

  getWithFaceCrop(): boolean;
  setWithFaceCrop(value: boolean): void;

  getWithGender(): boolean;
  setWithGender(value: boolean): void;

  getWithAge(): boolean;
  setWithAge(value: boolean): void;

  getWithPosition(): boolean;
  setWithPosition(value: boolean): void;

  getIntervalMillisecond(): number;
  setIntervalMillisecond(value: number): void;

  getConfidenceMin(): number;
  setConfidenceMin(value: number): void;

  getWithFaceCropWidth(): boolean;
  setWithFaceCropWidth(value: boolean): void;

  getWithLiveDetect(): boolean;
  setWithLiveDetect(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): OnFaceSetFaceDetectRequest.AsObject;
  static toObject(includeInstance: boolean, msg: OnFaceSetFaceDetectRequest): OnFaceSetFaceDetectRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: OnFaceSetFaceDetectRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): OnFaceSetFaceDetectRequest;
  static deserializeBinaryFromReader(message: OnFaceSetFaceDetectRequest, reader: jspb.BinaryReader): OnFaceSetFaceDetectRequest;
}

export namespace OnFaceSetFaceDetectRequest {
  export type AsObject = {
    faceSetId: string,
    withFaceCrop: boolean,
    withGender: boolean,
    withAge: boolean,
    withPosition: boolean,
    intervalMillisecond: number,
    confidenceMin: number,
    withFaceCropWidth: boolean,
    withLiveDetect: boolean,
  }
}

export class OnFaceSetFaceDetectResponse extends jspb.Message {
  clearConfidencesList(): void;
  getConfidencesList(): Array<number>;
  setConfidencesList(value: Array<number>): void;
  addConfidences(value: number, index?: number): number;

  clearFaceTokensList(): void;
  getFaceTokensList(): Array<string>;
  setFaceTokensList(value: Array<string>): void;
  addFaceTokens(value: string, index?: number): string;

  clearFaceCropsList(): void;
  getFaceCropsList(): Array<Uint8Array | string>;
  getFaceCropsList_asU8(): Array<Uint8Array>;
  getFaceCropsList_asB64(): Array<string>;
  setFaceCropsList(value: Array<Uint8Array | string>): void;
  addFaceCrops(value: Uint8Array | string, index?: number): Uint8Array | string;

  clearGendersList(): void;
  getGendersList(): Array<GenderMap[keyof GenderMap]>;
  setGendersList(value: Array<GenderMap[keyof GenderMap]>): void;
  addGenders(value: GenderMap[keyof GenderMap], index?: number): GenderMap[keyof GenderMap];

  clearAgesList(): void;
  getAgesList(): Array<number>;
  setAgesList(value: Array<number>): void;
  addAges(value: number, index?: number): number;

  clearPositionsList(): void;
  getPositionsList(): Array<FacePosition>;
  setPositionsList(value: Array<FacePosition>): void;
  addPositions(value?: FacePosition, index?: number): FacePosition;

  clearFaceCropWidthsList(): void;
  getFaceCropWidthsList(): Array<number>;
  setFaceCropWidthsList(value: Array<number>): void;
  addFaceCropWidths(value: number, index?: number): number;

  clearLiveDetectList(): void;
  getLiveDetectList(): Array<LiveDetectTypeMap[keyof LiveDetectTypeMap]>;
  setLiveDetectList(value: Array<LiveDetectTypeMap[keyof LiveDetectTypeMap]>): void;
  addLiveDetect(value: LiveDetectTypeMap[keyof LiveDetectTypeMap], index?: number): LiveDetectTypeMap[keyof LiveDetectTypeMap];

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): OnFaceSetFaceDetectResponse.AsObject;
  static toObject(includeInstance: boolean, msg: OnFaceSetFaceDetectResponse): OnFaceSetFaceDetectResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: OnFaceSetFaceDetectResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): OnFaceSetFaceDetectResponse;
  static deserializeBinaryFromReader(message: OnFaceSetFaceDetectResponse, reader: jspb.BinaryReader): OnFaceSetFaceDetectResponse;
}

export namespace OnFaceSetFaceDetectResponse {
  export type AsObject = {
    confidencesList: Array<number>,
    faceTokensList: Array<string>,
    faceCropsList: Array<Uint8Array | string>,
    gendersList: Array<GenderMap[keyof GenderMap]>,
    agesList: Array<number>,
    positionsList: Array<FacePosition.AsObject>,
    faceCropWidthsList: Array<number>,
    liveDetectList: Array<LiveDetectTypeMap[keyof LiveDetectTypeMap]>,
  }
}

export interface GenderMap {
  GENDER_UNKNOWN: 0;
  GENDER_MALE: 1;
  GENDER_FEMALE: 2;
}

export const Gender: GenderMap;

export interface LiveDetectTypeMap {
  LIVE_DETECT_UNKNOWN: 0;
  LIVE_DETECT_TRUE: 1;
  LIVE_DETECT_FALSE: 2;
}

export const LiveDetectType: LiveDetectTypeMap;

