// package: cameraService
// file: camera.proto

import * as jspb from "google-protobuf";

export class LiveH264StreamRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): LiveH264StreamRequest.AsObject;
  static toObject(includeInstance: boolean, msg: LiveH264StreamRequest): LiveH264StreamRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: LiveH264StreamRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): LiveH264StreamRequest;
  static deserializeBinaryFromReader(message: LiveH264StreamRequest, reader: jspb.BinaryReader): LiveH264StreamRequest;
}

export namespace LiveH264StreamRequest {
  export type AsObject = {
  }
}

export class LiveH264StreamResponse extends jspb.Message {
  getFrame(): Uint8Array | string;
  getFrame_asU8(): Uint8Array;
  getFrame_asB64(): string;
  setFrame(value: Uint8Array | string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): LiveH264StreamResponse.AsObject;
  static toObject(includeInstance: boolean, msg: LiveH264StreamResponse): LiveH264StreamResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: LiveH264StreamResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): LiveH264StreamResponse;
  static deserializeBinaryFromReader(message: LiveH264StreamResponse, reader: jspb.BinaryReader): LiveH264StreamResponse;
}

export namespace LiveH264StreamResponse {
  export type AsObject = {
    frame: Uint8Array | string,
  }
}

export class LatestImageRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): LatestImageRequest.AsObject;
  static toObject(includeInstance: boolean, msg: LatestImageRequest): LatestImageRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: LatestImageRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): LatestImageRequest;
  static deserializeBinaryFromReader(message: LatestImageRequest, reader: jspb.BinaryReader): LatestImageRequest;
}

export namespace LatestImageRequest {
  export type AsObject = {
  }
}

export class LatestImageResponse extends jspb.Message {
  getTime(): string;
  setTime(value: string): void;

  getImage(): Uint8Array | string;
  getImage_asU8(): Uint8Array;
  getImage_asB64(): string;
  setImage(value: Uint8Array | string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): LatestImageResponse.AsObject;
  static toObject(includeInstance: boolean, msg: LatestImageResponse): LatestImageResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: LatestImageResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): LatestImageResponse;
  static deserializeBinaryFromReader(message: LatestImageResponse, reader: jspb.BinaryReader): LatestImageResponse;
}

export namespace LatestImageResponse {
  export type AsObject = {
    time: string,
    image: Uint8Array | string,
  }
}

