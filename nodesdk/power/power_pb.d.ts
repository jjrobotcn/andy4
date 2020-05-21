// package: powerService
// file: power.proto

import * as jspb from "google-protobuf";

export class PowerStatus extends jspb.Message {
  getLevel(): number;
  setLevel(value: number): void;

  getIsCharging(): boolean;
  setIsCharging(value: boolean): void;

  getDevicesMap(): jspb.Map<string, boolean>;
  clearDevicesMap(): void;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PowerStatus.AsObject;
  static toObject(includeInstance: boolean, msg: PowerStatus): PowerStatus.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PowerStatus, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PowerStatus;
  static deserializeBinaryFromReader(message: PowerStatus, reader: jspb.BinaryReader): PowerStatus;
}

export namespace PowerStatus {
  export type AsObject = {
    level: number,
    isCharging: boolean,
    devicesMap: Array<[string, boolean]>,
  }
}

export class GetPowerStatusRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetPowerStatusRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetPowerStatusRequest): GetPowerStatusRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetPowerStatusRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetPowerStatusRequest;
  static deserializeBinaryFromReader(message: GetPowerStatusRequest, reader: jspb.BinaryReader): GetPowerStatusRequest;
}

export namespace GetPowerStatusRequest {
  export type AsObject = {
  }
}

export class GetPowerStatusResponse extends jspb.Message {
  hasPowerStatus(): boolean;
  clearPowerStatus(): void;
  getPowerStatus(): PowerStatus | undefined;
  setPowerStatus(value?: PowerStatus): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetPowerStatusResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetPowerStatusResponse): GetPowerStatusResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetPowerStatusResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetPowerStatusResponse;
  static deserializeBinaryFromReader(message: GetPowerStatusResponse, reader: jspb.BinaryReader): GetPowerStatusResponse;
}

export namespace GetPowerStatusResponse {
  export type AsObject = {
    powerStatus?: PowerStatus.AsObject,
  }
}

export class RebootRequest extends jspb.Message {
  getAll(): boolean;
  setAll(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RebootRequest.AsObject;
  static toObject(includeInstance: boolean, msg: RebootRequest): RebootRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: RebootRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RebootRequest;
  static deserializeBinaryFromReader(message: RebootRequest, reader: jspb.BinaryReader): RebootRequest;
}

export namespace RebootRequest {
  export type AsObject = {
    all: boolean,
  }
}

export class RebootResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RebootResponse.AsObject;
  static toObject(includeInstance: boolean, msg: RebootResponse): RebootResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: RebootResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RebootResponse;
  static deserializeBinaryFromReader(message: RebootResponse, reader: jspb.BinaryReader): RebootResponse;
}

export namespace RebootResponse {
  export type AsObject = {
  }
}

export class State extends jspb.Message {
  getModule(): ModuleTypesMap[keyof ModuleTypesMap];
  setModule(value: ModuleTypesMap[keyof ModuleTypesMap]): void;

  getIsOn(): boolean;
  setIsOn(value: boolean): void;

  getOffAfter(): number;
  setOffAfter(value: number): void;

  getOnAfter(): number;
  setOnAfter(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): State.AsObject;
  static toObject(includeInstance: boolean, msg: State): State.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: State, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): State;
  static deserializeBinaryFromReader(message: State, reader: jspb.BinaryReader): State;
}

export namespace State {
  export type AsObject = {
    module: ModuleTypesMap[keyof ModuleTypesMap],
    isOn: boolean,
    offAfter: number,
    onAfter: number,
  }
}

export class StatesRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): StatesRequest.AsObject;
  static toObject(includeInstance: boolean, msg: StatesRequest): StatesRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: StatesRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): StatesRequest;
  static deserializeBinaryFromReader(message: StatesRequest, reader: jspb.BinaryReader): StatesRequest;
}

export namespace StatesRequest {
  export type AsObject = {
  }
}

export class StatesResponse extends jspb.Message {
  clearStatesList(): void;
  getStatesList(): Array<State>;
  setStatesList(value: Array<State>): void;
  addStates(value?: State, index?: number): State;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): StatesResponse.AsObject;
  static toObject(includeInstance: boolean, msg: StatesResponse): StatesResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: StatesResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): StatesResponse;
  static deserializeBinaryFromReader(message: StatesResponse, reader: jspb.BinaryReader): StatesResponse;
}

export namespace StatesResponse {
  export type AsObject = {
    statesList: Array<State.AsObject>,
  }
}

export class SwitchRequest extends jspb.Message {
  clearRequestsList(): void;
  getRequestsList(): Array<SwitchRequest.request>;
  setRequestsList(value: Array<SwitchRequest.request>): void;
  addRequests(value?: SwitchRequest.request, index?: number): SwitchRequest.request;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SwitchRequest.AsObject;
  static toObject(includeInstance: boolean, msg: SwitchRequest): SwitchRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SwitchRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SwitchRequest;
  static deserializeBinaryFromReader(message: SwitchRequest, reader: jspb.BinaryReader): SwitchRequest;
}

export namespace SwitchRequest {
  export type AsObject = {
    requestsList: Array<SwitchRequest.request.AsObject>,
  }

  export class request extends jspb.Message {
    getModule(): ModuleTypesMap[keyof ModuleTypesMap];
    setModule(value: ModuleTypesMap[keyof ModuleTypesMap]): void;

    getOffAfter(): number;
    setOffAfter(value: number): void;

    getOnAfter(): number;
    setOnAfter(value: number): void;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): request.AsObject;
    static toObject(includeInstance: boolean, msg: request): request.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: request, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): request;
    static deserializeBinaryFromReader(message: request, reader: jspb.BinaryReader): request;
  }

  export namespace request {
    export type AsObject = {
      module: ModuleTypesMap[keyof ModuleTypesMap],
      offAfter: number,
      onAfter: number,
    }
  }
}

export class SwitchResponse extends jspb.Message {
  clearStatesList(): void;
  getStatesList(): Array<State>;
  setStatesList(value: Array<State>): void;
  addStates(value?: State, index?: number): State;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SwitchResponse.AsObject;
  static toObject(includeInstance: boolean, msg: SwitchResponse): SwitchResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SwitchResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SwitchResponse;
  static deserializeBinaryFromReader(message: SwitchResponse, reader: jspb.BinaryReader): SwitchResponse;
}

export namespace SwitchResponse {
  export type AsObject = {
    statesList: Array<State.AsObject>,
  }
}

export interface ModuleTypesMap {
  UNKNOWNMODULETYPE: 0;
  MAIN: 1;
  ESCPOS: 2;
  SCREEN: 3;
  SENSOR: 4;
  SPEECH: 5;
  LIGHTS: 6;
  EXPRESSION: 7;
  NAVIGATOR: 8;
  MOTION: 9;
  AMPLIFIER: 10;
}

export const ModuleTypes: ModuleTypesMap;

