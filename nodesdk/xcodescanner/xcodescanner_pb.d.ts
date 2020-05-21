// package: xcScannerService
// file: xcodescanner.proto

import * as jspb from "google-protobuf";

export class GetScanDataRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetScanDataRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetScanDataRequest): GetScanDataRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetScanDataRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetScanDataRequest;
  static deserializeBinaryFromReader(message: GetScanDataRequest, reader: jspb.BinaryReader): GetScanDataRequest;
}

export namespace GetScanDataRequest {
  export type AsObject = {
  }
}

export class GetScanDataResponse extends jspb.Message {
  getContent(): string;
  setContent(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetScanDataResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetScanDataResponse): GetScanDataResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetScanDataResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetScanDataResponse;
  static deserializeBinaryFromReader(message: GetScanDataResponse, reader: jspb.BinaryReader): GetScanDataResponse;
}

export namespace GetScanDataResponse {
  export type AsObject = {
    content: string,
  }
}

