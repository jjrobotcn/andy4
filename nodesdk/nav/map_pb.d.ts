// package: navService
// file: map.proto

import * as jspb from "google-protobuf";

export class MapPosition extends jspb.Message {
  getX(): number;
  setX(value: number): void;

  getY(): number;
  setY(value: number): void;

  getAngle(): number;
  setAngle(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MapPosition.AsObject;
  static toObject(includeInstance: boolean, msg: MapPosition): MapPosition.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MapPosition, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MapPosition;
  static deserializeBinaryFromReader(message: MapPosition, reader: jspb.BinaryReader): MapPosition;
}

export namespace MapPosition {
  export type AsObject = {
    x: number,
    y: number,
    angle: number,
  }
}

export class GetMapInfoRequest extends jspb.Message {
  getNoMapImage(): boolean;
  setNoMapImage(value: boolean): void;

  getNoMapPoints(): boolean;
  setNoMapPoints(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetMapInfoRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetMapInfoRequest): GetMapInfoRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetMapInfoRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetMapInfoRequest;
  static deserializeBinaryFromReader(message: GetMapInfoRequest, reader: jspb.BinaryReader): GetMapInfoRequest;
}

export namespace GetMapInfoRequest {
  export type AsObject = {
    noMapImage: boolean,
    noMapPoints: boolean,
  }
}

export class GetMapInfoResponse extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  getName(): string;
  setName(value: string): void;

  hasMapImage(): boolean;
  clearMapImage(): void;
  getMapImage(): GetMapInfoResponse.MapImage | undefined;
  setMapImage(value?: GetMapInfoResponse.MapImage): void;

  clearMapPointsList(): void;
  getMapPointsList(): Array<GetMapInfoResponse.MapPoint>;
  setMapPointsList(value: Array<GetMapInfoResponse.MapPoint>): void;
  addMapPoints(value?: GetMapInfoResponse.MapPoint, index?: number): GetMapInfoResponse.MapPoint;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetMapInfoResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetMapInfoResponse): GetMapInfoResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetMapInfoResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetMapInfoResponse;
  static deserializeBinaryFromReader(message: GetMapInfoResponse, reader: jspb.BinaryReader): GetMapInfoResponse;
}

export namespace GetMapInfoResponse {
  export type AsObject = {
    id: string,
    name: string,
    mapImage?: GetMapInfoResponse.MapImage.AsObject,
    mapPointsList: Array<GetMapInfoResponse.MapPoint.AsObject>,
  }

  export class MapImage extends jspb.Message {
    getWidth(): number;
    setWidth(value: number): void;

    getHeight(): number;
    setHeight(value: number): void;

    getImage(): Uint8Array | string;
    getImage_asU8(): Uint8Array;
    getImage_asB64(): string;
    setImage(value: Uint8Array | string): void;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): MapImage.AsObject;
    static toObject(includeInstance: boolean, msg: MapImage): MapImage.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: MapImage, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): MapImage;
    static deserializeBinaryFromReader(message: MapImage, reader: jspb.BinaryReader): MapImage;
  }

  export namespace MapImage {
    export type AsObject = {
      width: number,
      height: number,
      image: Uint8Array | string,
    }
  }

  export class MapPoint extends jspb.Message {
    getName(): string;
    setName(value: string): void;

    hasPosition(): boolean;
    clearPosition(): void;
    getPosition(): MapPosition | undefined;
    setPosition(value?: MapPosition): void;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): MapPoint.AsObject;
    static toObject(includeInstance: boolean, msg: MapPoint): MapPoint.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: MapPoint, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): MapPoint;
    static deserializeBinaryFromReader(message: MapPoint, reader: jspb.BinaryReader): MapPoint;
  }

  export namespace MapPoint {
    export type AsObject = {
      name: string,
      position?: MapPosition.AsObject,
    }
  }
}

export class MapPositionStreamRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MapPositionStreamRequest.AsObject;
  static toObject(includeInstance: boolean, msg: MapPositionStreamRequest): MapPositionStreamRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MapPositionStreamRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MapPositionStreamRequest;
  static deserializeBinaryFromReader(message: MapPositionStreamRequest, reader: jspb.BinaryReader): MapPositionStreamRequest;
}

export namespace MapPositionStreamRequest {
  export type AsObject = {
  }
}

export class MapPositionStreamResponse extends jspb.Message {
  hasPosition(): boolean;
  clearPosition(): void;
  getPosition(): MapPosition | undefined;
  setPosition(value?: MapPosition): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MapPositionStreamResponse.AsObject;
  static toObject(includeInstance: boolean, msg: MapPositionStreamResponse): MapPositionStreamResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MapPositionStreamResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MapPositionStreamResponse;
  static deserializeBinaryFromReader(message: MapPositionStreamResponse, reader: jspb.BinaryReader): MapPositionStreamResponse;
}

export namespace MapPositionStreamResponse {
  export type AsObject = {
    position?: MapPosition.AsObject,
  }
}

export class LocationResetRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): LocationResetRequest.AsObject;
  static toObject(includeInstance: boolean, msg: LocationResetRequest): LocationResetRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: LocationResetRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): LocationResetRequest;
  static deserializeBinaryFromReader(message: LocationResetRequest, reader: jspb.BinaryReader): LocationResetRequest;
}

export namespace LocationResetRequest {
  export type AsObject = {
  }
}

export class LocationResetResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): LocationResetResponse.AsObject;
  static toObject(includeInstance: boolean, msg: LocationResetResponse): LocationResetResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: LocationResetResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): LocationResetResponse;
  static deserializeBinaryFromReader(message: LocationResetResponse, reader: jspb.BinaryReader): LocationResetResponse;
}

export namespace LocationResetResponse {
  export type AsObject = {
  }
}

export class UploadMapFileRequest extends jspb.Message {
  getName(): string;
  setName(value: string): void;

  getMapFile(): Uint8Array | string;
  getMapFile_asU8(): Uint8Array;
  getMapFile_asB64(): string;
  setMapFile(value: Uint8Array | string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UploadMapFileRequest.AsObject;
  static toObject(includeInstance: boolean, msg: UploadMapFileRequest): UploadMapFileRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UploadMapFileRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UploadMapFileRequest;
  static deserializeBinaryFromReader(message: UploadMapFileRequest, reader: jspb.BinaryReader): UploadMapFileRequest;
}

export namespace UploadMapFileRequest {
  export type AsObject = {
    name: string,
    mapFile: Uint8Array | string,
  }
}

export class UploadMapFileResponse extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UploadMapFileResponse.AsObject;
  static toObject(includeInstance: boolean, msg: UploadMapFileResponse): UploadMapFileResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UploadMapFileResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UploadMapFileResponse;
  static deserializeBinaryFromReader(message: UploadMapFileResponse, reader: jspb.BinaryReader): UploadMapFileResponse;
}

export namespace UploadMapFileResponse {
  export type AsObject = {
    id: string,
  }
}

export class DownloadMapFileRequest extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DownloadMapFileRequest.AsObject;
  static toObject(includeInstance: boolean, msg: DownloadMapFileRequest): DownloadMapFileRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DownloadMapFileRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DownloadMapFileRequest;
  static deserializeBinaryFromReader(message: DownloadMapFileRequest, reader: jspb.BinaryReader): DownloadMapFileRequest;
}

export namespace DownloadMapFileRequest {
  export type AsObject = {
    id: string,
  }
}

export class DownloadMapFileResponse extends jspb.Message {
  getName(): string;
  setName(value: string): void;

  getMapFile(): Uint8Array | string;
  getMapFile_asU8(): Uint8Array;
  getMapFile_asB64(): string;
  setMapFile(value: Uint8Array | string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DownloadMapFileResponse.AsObject;
  static toObject(includeInstance: boolean, msg: DownloadMapFileResponse): DownloadMapFileResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DownloadMapFileResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DownloadMapFileResponse;
  static deserializeBinaryFromReader(message: DownloadMapFileResponse, reader: jspb.BinaryReader): DownloadMapFileResponse;
}

export namespace DownloadMapFileResponse {
  export type AsObject = {
    name: string,
    mapFile: Uint8Array | string,
  }
}

