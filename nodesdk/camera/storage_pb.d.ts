// package: cameraService
// file: storage.proto

import * as jspb from "google-protobuf";

export class ListDatesRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ListDatesRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ListDatesRequest): ListDatesRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ListDatesRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ListDatesRequest;
  static deserializeBinaryFromReader(message: ListDatesRequest, reader: jspb.BinaryReader): ListDatesRequest;
}

export namespace ListDatesRequest {
  export type AsObject = {
  }
}

export class ListDatesResponse extends jspb.Message {
  clearDatesList(): void;
  getDatesList(): Array<string>;
  setDatesList(value: Array<string>): void;
  addDates(value: string, index?: number): string;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ListDatesResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ListDatesResponse): ListDatesResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ListDatesResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ListDatesResponse;
  static deserializeBinaryFromReader(message: ListDatesResponse, reader: jspb.BinaryReader): ListDatesResponse;
}

export namespace ListDatesResponse {
  export type AsObject = {
    datesList: Array<string>,
  }
}

export class ListVideosRequest extends jspb.Message {
  getStart(): string;
  setStart(value: string): void;

  getEnd(): string;
  setEnd(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ListVideosRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ListVideosRequest): ListVideosRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ListVideosRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ListVideosRequest;
  static deserializeBinaryFromReader(message: ListVideosRequest, reader: jspb.BinaryReader): ListVideosRequest;
}

export namespace ListVideosRequest {
  export type AsObject = {
    start: string,
    end: string,
  }
}

export class ListVideosResponse extends jspb.Message {
  clearVideosList(): void;
  getVideosList(): Array<string>;
  setVideosList(value: Array<string>): void;
  addVideos(value: string, index?: number): string;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ListVideosResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ListVideosResponse): ListVideosResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ListVideosResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ListVideosResponse;
  static deserializeBinaryFromReader(message: ListVideosResponse, reader: jspb.BinaryReader): ListVideosResponse;
}

export namespace ListVideosResponse {
  export type AsObject = {
    videosList: Array<string>,
  }
}

export class GetVideoFileRequest extends jspb.Message {
  getVideo(): string;
  setVideo(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetVideoFileRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetVideoFileRequest): GetVideoFileRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetVideoFileRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetVideoFileRequest;
  static deserializeBinaryFromReader(message: GetVideoFileRequest, reader: jspb.BinaryReader): GetVideoFileRequest;
}

export namespace GetVideoFileRequest {
  export type AsObject = {
    video: string,
  }
}

export class GetVideoFileResponse extends jspb.Message {
  getChunk(): Uint8Array | string;
  getChunk_asU8(): Uint8Array;
  getChunk_asB64(): string;
  setChunk(value: Uint8Array | string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetVideoFileResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetVideoFileResponse): GetVideoFileResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetVideoFileResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetVideoFileResponse;
  static deserializeBinaryFromReader(message: GetVideoFileResponse, reader: jspb.BinaryReader): GetVideoFileResponse;
}

export namespace GetVideoFileResponse {
  export type AsObject = {
    chunk: Uint8Array | string,
  }
}

export class DeleteVideoFilesRequest extends jspb.Message {
  clearVideosList(): void;
  getVideosList(): Array<string>;
  setVideosList(value: Array<string>): void;
  addVideos(value: string, index?: number): string;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteVideoFilesRequest.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteVideoFilesRequest): DeleteVideoFilesRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeleteVideoFilesRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteVideoFilesRequest;
  static deserializeBinaryFromReader(message: DeleteVideoFilesRequest, reader: jspb.BinaryReader): DeleteVideoFilesRequest;
}

export namespace DeleteVideoFilesRequest {
  export type AsObject = {
    videosList: Array<string>,
  }
}

export class DeleteVideoFilesResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteVideoFilesResponse.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteVideoFilesResponse): DeleteVideoFilesResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeleteVideoFilesResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteVideoFilesResponse;
  static deserializeBinaryFromReader(message: DeleteVideoFilesResponse, reader: jspb.BinaryReader): DeleteVideoFilesResponse;
}

export namespace DeleteVideoFilesResponse {
  export type AsObject = {
  }
}

