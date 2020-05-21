// package: idCardService
// file: idcard.proto

import * as jspb from "google-protobuf";

export class GetIdInfoRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetIdInfoRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetIdInfoRequest): GetIdInfoRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetIdInfoRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetIdInfoRequest;
  static deserializeBinaryFromReader(message: GetIdInfoRequest, reader: jspb.BinaryReader): GetIdInfoRequest;
}

export namespace GetIdInfoRequest {
  export type AsObject = {
  }
}

export class IdInfo extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  getName(): string;
  setName(value: string): void;

  getGender(): string;
  setGender(value: string): void;

  getNational(): string;
  setNational(value: string): void;

  getBirthday(): string;
  setBirthday(value: string): void;

  getAddress(): string;
  setAddress(value: string): void;

  getSignOrganization(): string;
  setSignOrganization(value: string): void;

  getStartDate(): string;
  setStartDate(value: string): void;

  getEndDate(): string;
  setEndDate(value: string): void;

  getPhoto(): Uint8Array | string;
  getPhoto_asU8(): Uint8Array;
  getPhoto_asB64(): string;
  setPhoto(value: Uint8Array | string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): IdInfo.AsObject;
  static toObject(includeInstance: boolean, msg: IdInfo): IdInfo.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: IdInfo, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): IdInfo;
  static deserializeBinaryFromReader(message: IdInfo, reader: jspb.BinaryReader): IdInfo;
}

export namespace IdInfo {
  export type AsObject = {
    id: string,
    name: string,
    gender: string,
    national: string,
    birthday: string,
    address: string,
    signOrganization: string,
    startDate: string,
    endDate: string,
    photo: Uint8Array | string,
  }
}

export class GetIdInfoResponse extends jspb.Message {
  hasIdInfo(): boolean;
  clearIdInfo(): void;
  getIdInfo(): IdInfo | undefined;
  setIdInfo(value?: IdInfo): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetIdInfoResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetIdInfoResponse): GetIdInfoResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetIdInfoResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetIdInfoResponse;
  static deserializeBinaryFromReader(message: GetIdInfoResponse, reader: jspb.BinaryReader): GetIdInfoResponse;
}

export namespace GetIdInfoResponse {
  export type AsObject = {
    idInfo?: IdInfo.AsObject,
  }
}

