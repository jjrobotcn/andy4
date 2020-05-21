// package: faceRecognition
// file: face.proto

import * as jspb from "google-protobuf";

export class CompareRequest extends jspb.Message {
  getFaceImg1(): Uint8Array | string;
  getFaceImg1_asU8(): Uint8Array;
  getFaceImg1_asB64(): string;
  setFaceImg1(value: Uint8Array | string): void;

  getFaceImg2(): Uint8Array | string;
  getFaceImg2_asU8(): Uint8Array;
  getFaceImg2_asB64(): string;
  setFaceImg2(value: Uint8Array | string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CompareRequest.AsObject;
  static toObject(includeInstance: boolean, msg: CompareRequest): CompareRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: CompareRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CompareRequest;
  static deserializeBinaryFromReader(message: CompareRequest, reader: jspb.BinaryReader): CompareRequest;
}

export namespace CompareRequest {
  export type AsObject = {
    faceImg1: Uint8Array | string,
    faceImg2: Uint8Array | string,
  }
}

export class CompareResponse extends jspb.Message {
  getConfidence(): number;
  setConfidence(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CompareResponse.AsObject;
  static toObject(includeInstance: boolean, msg: CompareResponse): CompareResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: CompareResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CompareResponse;
  static deserializeBinaryFromReader(message: CompareResponse, reader: jspb.BinaryReader): CompareResponse;
}

export namespace CompareResponse {
  export type AsObject = {
    confidence: number,
  }
}

export class SearchRequest extends jspb.Message {
  getFaceSetId(): string;
  setFaceSetId(value: string): void;

  getFaceImg(): Uint8Array | string;
  getFaceImg_asU8(): Uint8Array;
  getFaceImg_asB64(): string;
  setFaceImg(value: Uint8Array | string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SearchRequest.AsObject;
  static toObject(includeInstance: boolean, msg: SearchRequest): SearchRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SearchRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SearchRequest;
  static deserializeBinaryFromReader(message: SearchRequest, reader: jspb.BinaryReader): SearchRequest;
}

export namespace SearchRequest {
  export type AsObject = {
    faceSetId: string,
    faceImg: Uint8Array | string,
  }
}

export class SearchResponse extends jspb.Message {
  getConfidence(): number;
  setConfidence(value: number): void;

  getFaceToken(): string;
  setFaceToken(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SearchResponse.AsObject;
  static toObject(includeInstance: boolean, msg: SearchResponse): SearchResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SearchResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SearchResponse;
  static deserializeBinaryFromReader(message: SearchResponse, reader: jspb.BinaryReader): SearchResponse;
}

export namespace SearchResponse {
  export type AsObject = {
    confidence: number,
    faceToken: string,
  }
}

