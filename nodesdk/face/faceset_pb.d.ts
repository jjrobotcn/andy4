// package: faceRecognition
// file: faceset.proto

import * as jspb from "google-protobuf";

export class FaceSet extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  getName(): string;
  setName(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FaceSet.AsObject;
  static toObject(includeInstance: boolean, msg: FaceSet): FaceSet.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: FaceSet, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FaceSet;
  static deserializeBinaryFromReader(message: FaceSet, reader: jspb.BinaryReader): FaceSet;
}

export namespace FaceSet {
  export type AsObject = {
    id: string,
    name: string,
  }
}

export class FaceDetail extends jspb.Message {
  getFaceToken(): string;
  setFaceToken(value: string): void;

  getFaceImg(): Uint8Array | string;
  getFaceImg_asU8(): Uint8Array;
  getFaceImg_asB64(): string;
  setFaceImg(value: Uint8Array | string): void;

  getDetailMap(): jspb.Map<string, string>;
  clearDetailMap(): void;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FaceDetail.AsObject;
  static toObject(includeInstance: boolean, msg: FaceDetail): FaceDetail.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: FaceDetail, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FaceDetail;
  static deserializeBinaryFromReader(message: FaceDetail, reader: jspb.BinaryReader): FaceDetail;
}

export namespace FaceDetail {
  export type AsObject = {
    faceToken: string,
    faceImg: Uint8Array | string,
    detailMap: Array<[string, string]>,
  }
}

export class NewFaceSetRequest extends jspb.Message {
  getName(): string;
  setName(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): NewFaceSetRequest.AsObject;
  static toObject(includeInstance: boolean, msg: NewFaceSetRequest): NewFaceSetRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: NewFaceSetRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): NewFaceSetRequest;
  static deserializeBinaryFromReader(message: NewFaceSetRequest, reader: jspb.BinaryReader): NewFaceSetRequest;
}

export namespace NewFaceSetRequest {
  export type AsObject = {
    name: string,
  }
}

export class NewFaceSetResponse extends jspb.Message {
  hasFaceSet(): boolean;
  clearFaceSet(): void;
  getFaceSet(): FaceSet | undefined;
  setFaceSet(value?: FaceSet): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): NewFaceSetResponse.AsObject;
  static toObject(includeInstance: boolean, msg: NewFaceSetResponse): NewFaceSetResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: NewFaceSetResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): NewFaceSetResponse;
  static deserializeBinaryFromReader(message: NewFaceSetResponse, reader: jspb.BinaryReader): NewFaceSetResponse;
}

export namespace NewFaceSetResponse {
  export type AsObject = {
    faceSet?: FaceSet.AsObject,
  }
}

export class DeleteFaceSetRequest extends jspb.Message {
  getFaceSetId(): string;
  setFaceSetId(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteFaceSetRequest.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteFaceSetRequest): DeleteFaceSetRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeleteFaceSetRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteFaceSetRequest;
  static deserializeBinaryFromReader(message: DeleteFaceSetRequest, reader: jspb.BinaryReader): DeleteFaceSetRequest;
}

export namespace DeleteFaceSetRequest {
  export type AsObject = {
    faceSetId: string,
  }
}

export class DeleteFaceSetResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteFaceSetResponse.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteFaceSetResponse): DeleteFaceSetResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeleteFaceSetResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteFaceSetResponse;
  static deserializeBinaryFromReader(message: DeleteFaceSetResponse, reader: jspb.BinaryReader): DeleteFaceSetResponse;
}

export namespace DeleteFaceSetResponse {
  export type AsObject = {
  }
}

export class UpdateFaceSetRequest extends jspb.Message {
  hasFaceSet(): boolean;
  clearFaceSet(): void;
  getFaceSet(): FaceSet | undefined;
  setFaceSet(value?: FaceSet): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateFaceSetRequest.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateFaceSetRequest): UpdateFaceSetRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateFaceSetRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateFaceSetRequest;
  static deserializeBinaryFromReader(message: UpdateFaceSetRequest, reader: jspb.BinaryReader): UpdateFaceSetRequest;
}

export namespace UpdateFaceSetRequest {
  export type AsObject = {
    faceSet?: FaceSet.AsObject,
  }
}

export class UpdateFaceSetResponse extends jspb.Message {
  hasFaceSet(): boolean;
  clearFaceSet(): void;
  getFaceSet(): FaceSet | undefined;
  setFaceSet(value?: FaceSet): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateFaceSetResponse.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateFaceSetResponse): UpdateFaceSetResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateFaceSetResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateFaceSetResponse;
  static deserializeBinaryFromReader(message: UpdateFaceSetResponse, reader: jspb.BinaryReader): UpdateFaceSetResponse;
}

export namespace UpdateFaceSetResponse {
  export type AsObject = {
    faceSet?: FaceSet.AsObject,
  }
}

export class ListFaceSetsRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ListFaceSetsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ListFaceSetsRequest): ListFaceSetsRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ListFaceSetsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ListFaceSetsRequest;
  static deserializeBinaryFromReader(message: ListFaceSetsRequest, reader: jspb.BinaryReader): ListFaceSetsRequest;
}

export namespace ListFaceSetsRequest {
  export type AsObject = {
  }
}

export class ListFaceSetsResponse extends jspb.Message {
  clearFaceSetsList(): void;
  getFaceSetsList(): Array<FaceSet>;
  setFaceSetsList(value: Array<FaceSet>): void;
  addFaceSets(value?: FaceSet, index?: number): FaceSet;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ListFaceSetsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ListFaceSetsResponse): ListFaceSetsResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ListFaceSetsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ListFaceSetsResponse;
  static deserializeBinaryFromReader(message: ListFaceSetsResponse, reader: jspb.BinaryReader): ListFaceSetsResponse;
}

export namespace ListFaceSetsResponse {
  export type AsObject = {
    faceSetsList: Array<FaceSet.AsObject>,
  }
}

export class AddFaceRequest extends jspb.Message {
  getFaceSetId(): string;
  setFaceSetId(value: string): void;

  getFaceImg(): Uint8Array | string;
  getFaceImg_asU8(): Uint8Array;
  getFaceImg_asB64(): string;
  setFaceImg(value: Uint8Array | string): void;

  getDetailMap(): jspb.Map<string, string>;
  clearDetailMap(): void;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AddFaceRequest.AsObject;
  static toObject(includeInstance: boolean, msg: AddFaceRequest): AddFaceRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: AddFaceRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AddFaceRequest;
  static deserializeBinaryFromReader(message: AddFaceRequest, reader: jspb.BinaryReader): AddFaceRequest;
}

export namespace AddFaceRequest {
  export type AsObject = {
    faceSetId: string,
    faceImg: Uint8Array | string,
    detailMap: Array<[string, string]>,
  }
}

export class AddFaceResponse extends jspb.Message {
  getFaceToken(): string;
  setFaceToken(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AddFaceResponse.AsObject;
  static toObject(includeInstance: boolean, msg: AddFaceResponse): AddFaceResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: AddFaceResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AddFaceResponse;
  static deserializeBinaryFromReader(message: AddFaceResponse, reader: jspb.BinaryReader): AddFaceResponse;
}

export namespace AddFaceResponse {
  export type AsObject = {
    faceToken: string,
  }
}

export class RemoveFaceRequest extends jspb.Message {
  getFaceSetId(): string;
  setFaceSetId(value: string): void;

  getFaceToken(): string;
  setFaceToken(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RemoveFaceRequest.AsObject;
  static toObject(includeInstance: boolean, msg: RemoveFaceRequest): RemoveFaceRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: RemoveFaceRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RemoveFaceRequest;
  static deserializeBinaryFromReader(message: RemoveFaceRequest, reader: jspb.BinaryReader): RemoveFaceRequest;
}

export namespace RemoveFaceRequest {
  export type AsObject = {
    faceSetId: string,
    faceToken: string,
  }
}

export class RemoveFaceResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RemoveFaceResponse.AsObject;
  static toObject(includeInstance: boolean, msg: RemoveFaceResponse): RemoveFaceResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: RemoveFaceResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RemoveFaceResponse;
  static deserializeBinaryFromReader(message: RemoveFaceResponse, reader: jspb.BinaryReader): RemoveFaceResponse;
}

export namespace RemoveFaceResponse {
  export type AsObject = {
  }
}

export class FaceDetailRequest extends jspb.Message {
  getFaceSetId(): string;
  setFaceSetId(value: string): void;

  getFaceToken(): string;
  setFaceToken(value: string): void;

  getWithFaceImg(): boolean;
  setWithFaceImg(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FaceDetailRequest.AsObject;
  static toObject(includeInstance: boolean, msg: FaceDetailRequest): FaceDetailRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: FaceDetailRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FaceDetailRequest;
  static deserializeBinaryFromReader(message: FaceDetailRequest, reader: jspb.BinaryReader): FaceDetailRequest;
}

export namespace FaceDetailRequest {
  export type AsObject = {
    faceSetId: string,
    faceToken: string,
    withFaceImg: boolean,
  }
}

export class FaceDetailResponse extends jspb.Message {
  hasFaceDetail(): boolean;
  clearFaceDetail(): void;
  getFaceDetail(): FaceDetail | undefined;
  setFaceDetail(value?: FaceDetail): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FaceDetailResponse.AsObject;
  static toObject(includeInstance: boolean, msg: FaceDetailResponse): FaceDetailResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: FaceDetailResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FaceDetailResponse;
  static deserializeBinaryFromReader(message: FaceDetailResponse, reader: jspb.BinaryReader): FaceDetailResponse;
}

export namespace FaceDetailResponse {
  export type AsObject = {
    faceDetail?: FaceDetail.AsObject,
  }
}

export class ListFaceDetailsRequest extends jspb.Message {
  getFaceSetId(): string;
  setFaceSetId(value: string): void;

  getLimit(): number;
  setLimit(value: number): void;

  getOffset(): number;
  setOffset(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ListFaceDetailsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ListFaceDetailsRequest): ListFaceDetailsRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ListFaceDetailsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ListFaceDetailsRequest;
  static deserializeBinaryFromReader(message: ListFaceDetailsRequest, reader: jspb.BinaryReader): ListFaceDetailsRequest;
}

export namespace ListFaceDetailsRequest {
  export type AsObject = {
    faceSetId: string,
    limit: number,
    offset: number,
  }
}

export class ListFaceDetailsResponse extends jspb.Message {
  hasFaceSet(): boolean;
  clearFaceSet(): void;
  getFaceSet(): FaceSet | undefined;
  setFaceSet(value?: FaceSet): void;

  clearFaceDetailsList(): void;
  getFaceDetailsList(): Array<FaceDetail>;
  setFaceDetailsList(value: Array<FaceDetail>): void;
  addFaceDetails(value?: FaceDetail, index?: number): FaceDetail;

  getTotal(): number;
  setTotal(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ListFaceDetailsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ListFaceDetailsResponse): ListFaceDetailsResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ListFaceDetailsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ListFaceDetailsResponse;
  static deserializeBinaryFromReader(message: ListFaceDetailsResponse, reader: jspb.BinaryReader): ListFaceDetailsResponse;
}

export namespace ListFaceDetailsResponse {
  export type AsObject = {
    faceSet?: FaceSet.AsObject,
    faceDetailsList: Array<FaceDetail.AsObject>,
    total: number,
  }
}

