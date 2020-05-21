// package: navService
// file: nav.proto

import * as jspb from "google-protobuf";
import * as map_pb from "./map_pb";

export class MoveRequest extends jspb.Message {
  getSpeed(): number;
  setSpeed(value: number): void;

  getRspeed(): number;
  setRspeed(value: number): void;

  getDirection(): MoveDirectionMap[keyof MoveDirectionMap];
  setDirection(value: MoveDirectionMap[keyof MoveDirectionMap]): void;

  getMode(): string;
  setMode(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MoveRequest.AsObject;
  static toObject(includeInstance: boolean, msg: MoveRequest): MoveRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MoveRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MoveRequest;
  static deserializeBinaryFromReader(message: MoveRequest, reader: jspb.BinaryReader): MoveRequest;
}

export namespace MoveRequest {
  export type AsObject = {
    speed: number,
    rspeed: number,
    direction: MoveDirectionMap[keyof MoveDirectionMap],
    mode: string,
  }
}

export class MoveResponse extends jspb.Message {
  getStatusCode(): StatusCodeMap[keyof StatusCodeMap];
  setStatusCode(value: StatusCodeMap[keyof StatusCodeMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MoveResponse.AsObject;
  static toObject(includeInstance: boolean, msg: MoveResponse): MoveResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MoveResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MoveResponse;
  static deserializeBinaryFromReader(message: MoveResponse, reader: jspb.BinaryReader): MoveResponse;
}

export namespace MoveResponse {
  export type AsObject = {
    statusCode: StatusCodeMap[keyof StatusCodeMap],
  }
}

export class NavTarget extends jspb.Message {
  getIndex(): string;
  setIndex(value: string): void;

  getName(): string;
  setName(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): NavTarget.AsObject;
  static toObject(includeInstance: boolean, msg: NavTarget): NavTarget.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: NavTarget, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): NavTarget;
  static deserializeBinaryFromReader(message: NavTarget, reader: jspb.BinaryReader): NavTarget;
}

export namespace NavTarget {
  export type AsObject = {
    index: string,
    name: string,
  }
}

export class NavRoaming extends jspb.Message {
  getNavRoamingType(): RoamingTypeMap[keyof RoamingTypeMap];
  setNavRoamingType(value: RoamingTypeMap[keyof RoamingTypeMap]): void;

  getWaitSec(): number;
  setWaitSec(value: number): void;

  clearRoamingTargetIndexesList(): void;
  getRoamingTargetIndexesList(): Array<string>;
  setRoamingTargetIndexesList(value: Array<string>): void;
  addRoamingTargetIndexes(value: string, index?: number): string;

  getOrderLoop(): boolean;
  setOrderLoop(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): NavRoaming.AsObject;
  static toObject(includeInstance: boolean, msg: NavRoaming): NavRoaming.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: NavRoaming, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): NavRoaming;
  static deserializeBinaryFromReader(message: NavRoaming, reader: jspb.BinaryReader): NavRoaming;
}

export namespace NavRoaming {
  export type AsObject = {
    navRoamingType: RoamingTypeMap[keyof RoamingTypeMap],
    waitSec: number,
    roamingTargetIndexesList: Array<string>,
    orderLoop: boolean,
  }
}

export class NavToRequest extends jspb.Message {
  hasTarget(): boolean;
  clearTarget(): void;
  getTarget(): NavTarget | undefined;
  setTarget(value?: NavTarget): void;

  hasRoaming(): boolean;
  clearRoaming(): void;
  getRoaming(): NavRoaming | undefined;
  setRoaming(value?: NavRoaming): void;

  hasMapPosition(): boolean;
  clearMapPosition(): void;
  getMapPosition(): map_pb.MapPosition | undefined;
  setMapPosition(value?: map_pb.MapPosition): void;

  getSpeed(): number;
  setSpeed(value: number): void;

  getSyncMode(): boolean;
  setSyncMode(value: boolean): void;

  getTargetOneofCase(): NavToRequest.TargetOneofCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): NavToRequest.AsObject;
  static toObject(includeInstance: boolean, msg: NavToRequest): NavToRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: NavToRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): NavToRequest;
  static deserializeBinaryFromReader(message: NavToRequest, reader: jspb.BinaryReader): NavToRequest;
}

export namespace NavToRequest {
  export type AsObject = {
    target?: NavTarget.AsObject,
    roaming?: NavRoaming.AsObject,
    mapPosition?: map_pb.MapPosition.AsObject,
    speed: number,
    syncMode: boolean,
  }

  export enum TargetOneofCase {
    TARGET_ONEOF_NOT_SET = 0,
    TARGET = 1,
    ROAMING = 3,
    MAP_POSITION = 5,
  }
}

export class NavToResponse extends jspb.Message {
  getStatusCode(): StatusCodeMap[keyof StatusCodeMap];
  setStatusCode(value: StatusCodeMap[keyof StatusCodeMap]): void;

  hasTarget(): boolean;
  clearTarget(): void;
  getTarget(): NavTarget | undefined;
  setTarget(value?: NavTarget): void;

  hasIsRoaming(): boolean;
  clearIsRoaming(): void;
  getIsRoaming(): boolean;
  setIsRoaming(value: boolean): void;

  hasMapPosition(): boolean;
  clearMapPosition(): void;
  getMapPosition(): map_pb.MapPosition | undefined;
  setMapPosition(value?: map_pb.MapPosition): void;

  getTargetOneofCase(): NavToResponse.TargetOneofCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): NavToResponse.AsObject;
  static toObject(includeInstance: boolean, msg: NavToResponse): NavToResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: NavToResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): NavToResponse;
  static deserializeBinaryFromReader(message: NavToResponse, reader: jspb.BinaryReader): NavToResponse;
}

export namespace NavToResponse {
  export type AsObject = {
    statusCode: StatusCodeMap[keyof StatusCodeMap],
    target?: NavTarget.AsObject,
    isRoaming: boolean,
    mapPosition?: map_pb.MapPosition.AsObject,
  }

  export enum TargetOneofCase {
    TARGET_ONEOF_NOT_SET = 0,
    TARGET = 2,
    IS_ROAMING = 3,
    MAP_POSITION = 4,
  }
}

export class NavStopRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): NavStopRequest.AsObject;
  static toObject(includeInstance: boolean, msg: NavStopRequest): NavStopRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: NavStopRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): NavStopRequest;
  static deserializeBinaryFromReader(message: NavStopRequest, reader: jspb.BinaryReader): NavStopRequest;
}

export namespace NavStopRequest {
  export type AsObject = {
  }
}

export class NavStopResponse extends jspb.Message {
  getStatusCode(): StatusCodeMap[keyof StatusCodeMap];
  setStatusCode(value: StatusCodeMap[keyof StatusCodeMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): NavStopResponse.AsObject;
  static toObject(includeInstance: boolean, msg: NavStopResponse): NavStopResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: NavStopResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): NavStopResponse;
  static deserializeBinaryFromReader(message: NavStopResponse, reader: jspb.BinaryReader): NavStopResponse;
}

export namespace NavStopResponse {
  export type AsObject = {
    statusCode: StatusCodeMap[keyof StatusCodeMap],
  }
}

export class AutoChargeRequest extends jspb.Message {
  hasCharge(): boolean;
  clearCharge(): void;
  getCharge(): boolean;
  setCharge(value: boolean): void;

  hasCancel(): boolean;
  clearCancel(): void;
  getCancel(): boolean;
  setCancel(value: boolean): void;

  hasChargePreset(): boolean;
  clearChargePreset(): void;
  getChargePreset(): boolean;
  setChargePreset(value: boolean): void;

  getTimeoutSec(): number;
  setTimeoutSec(value: number): void;

  getChargeOptionOneofCase(): AutoChargeRequest.ChargeOptionOneofCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AutoChargeRequest.AsObject;
  static toObject(includeInstance: boolean, msg: AutoChargeRequest): AutoChargeRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: AutoChargeRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AutoChargeRequest;
  static deserializeBinaryFromReader(message: AutoChargeRequest, reader: jspb.BinaryReader): AutoChargeRequest;
}

export namespace AutoChargeRequest {
  export type AsObject = {
    charge: boolean,
    cancel: boolean,
    chargePreset: boolean,
    timeoutSec: number,
  }

  export enum ChargeOptionOneofCase {
    CHARGE_OPTION_ONEOF_NOT_SET = 0,
    CHARGE = 1,
    CANCEL = 2,
    CHARGE_PRESET = 3,
  }
}

export class AutoChargeResponse extends jspb.Message {
  getChargeStatusCode(): ChargeStatusCodeMap[keyof ChargeStatusCodeMap];
  setChargeStatusCode(value: ChargeStatusCodeMap[keyof ChargeStatusCodeMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AutoChargeResponse.AsObject;
  static toObject(includeInstance: boolean, msg: AutoChargeResponse): AutoChargeResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: AutoChargeResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AutoChargeResponse;
  static deserializeBinaryFromReader(message: AutoChargeResponse, reader: jspb.BinaryReader): AutoChargeResponse;
}

export namespace AutoChargeResponse {
  export type AsObject = {
    chargeStatusCode: ChargeStatusCodeMap[keyof ChargeStatusCodeMap],
  }
}

export class RotateRequest extends jspb.Message {
  hasAngle(): boolean;
  clearAngle(): void;
  getAngle(): number;
  setAngle(value: number): void;

  hasRollback(): boolean;
  clearRollback(): void;
  getRollback(): boolean;
  setRollback(value: boolean): void;

  getRotateOneofCase(): RotateRequest.RotateOneofCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RotateRequest.AsObject;
  static toObject(includeInstance: boolean, msg: RotateRequest): RotateRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: RotateRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RotateRequest;
  static deserializeBinaryFromReader(message: RotateRequest, reader: jspb.BinaryReader): RotateRequest;
}

export namespace RotateRequest {
  export type AsObject = {
    angle: number,
    rollback: boolean,
  }

  export enum RotateOneofCase {
    ROTATE_ONEOF_NOT_SET = 0,
    ANGLE = 1,
    ROLLBACK = 2,
  }
}

export class RotateResponse extends jspb.Message {
  getStatusCode(): StatusCodeMap[keyof StatusCodeMap];
  setStatusCode(value: StatusCodeMap[keyof StatusCodeMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RotateResponse.AsObject;
  static toObject(includeInstance: boolean, msg: RotateResponse): RotateResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: RotateResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RotateResponse;
  static deserializeBinaryFromReader(message: RotateResponse, reader: jspb.BinaryReader): RotateResponse;
}

export namespace RotateResponse {
  export type AsObject = {
    statusCode: StatusCodeMap[keyof StatusCodeMap],
  }
}

export class OnNavEventChangeRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): OnNavEventChangeRequest.AsObject;
  static toObject(includeInstance: boolean, msg: OnNavEventChangeRequest): OnNavEventChangeRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: OnNavEventChangeRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): OnNavEventChangeRequest;
  static deserializeBinaryFromReader(message: OnNavEventChangeRequest, reader: jspb.BinaryReader): OnNavEventChangeRequest;
}

export namespace OnNavEventChangeRequest {
  export type AsObject = {
  }
}

export class MoveEvent extends jspb.Message {
  getStatusCode(): StatusCodeMap[keyof StatusCodeMap];
  setStatusCode(value: StatusCodeMap[keyof StatusCodeMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MoveEvent.AsObject;
  static toObject(includeInstance: boolean, msg: MoveEvent): MoveEvent.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MoveEvent, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MoveEvent;
  static deserializeBinaryFromReader(message: MoveEvent, reader: jspb.BinaryReader): MoveEvent;
}

export namespace MoveEvent {
  export type AsObject = {
    statusCode: StatusCodeMap[keyof StatusCodeMap],
  }
}

export class NavEvent extends jspb.Message {
  getStatusCode(): StatusCodeMap[keyof StatusCodeMap];
  setStatusCode(value: StatusCodeMap[keyof StatusCodeMap]): void;

  hasNavTarget(): boolean;
  clearNavTarget(): void;
  getNavTarget(): NavTarget | undefined;
  setNavTarget(value?: NavTarget): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): NavEvent.AsObject;
  static toObject(includeInstance: boolean, msg: NavEvent): NavEvent.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: NavEvent, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): NavEvent;
  static deserializeBinaryFromReader(message: NavEvent, reader: jspb.BinaryReader): NavEvent;
}

export namespace NavEvent {
  export type AsObject = {
    statusCode: StatusCodeMap[keyof StatusCodeMap],
    navTarget?: NavTarget.AsObject,
  }
}

export class AutoChargeEvent extends jspb.Message {
  getChargeStatusCode(): ChargeStatusCodeMap[keyof ChargeStatusCodeMap];
  setChargeStatusCode(value: ChargeStatusCodeMap[keyof ChargeStatusCodeMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AutoChargeEvent.AsObject;
  static toObject(includeInstance: boolean, msg: AutoChargeEvent): AutoChargeEvent.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: AutoChargeEvent, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AutoChargeEvent;
  static deserializeBinaryFromReader(message: AutoChargeEvent, reader: jspb.BinaryReader): AutoChargeEvent;
}

export namespace AutoChargeEvent {
  export type AsObject = {
    chargeStatusCode: ChargeStatusCodeMap[keyof ChargeStatusCodeMap],
  }
}

export class RotateEvent extends jspb.Message {
  getStatusCode(): StatusCodeMap[keyof StatusCodeMap];
  setStatusCode(value: StatusCodeMap[keyof StatusCodeMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RotateEvent.AsObject;
  static toObject(includeInstance: boolean, msg: RotateEvent): RotateEvent.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: RotateEvent, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RotateEvent;
  static deserializeBinaryFromReader(message: RotateEvent, reader: jspb.BinaryReader): RotateEvent;
}

export namespace RotateEvent {
  export type AsObject = {
    statusCode: StatusCodeMap[keyof StatusCodeMap],
  }
}

export class OnNavEventChangeResponse extends jspb.Message {
  getNavEventType(): NavEventTypeMap[keyof NavEventTypeMap];
  setNavEventType(value: NavEventTypeMap[keyof NavEventTypeMap]): void;

  hasMoveEvent(): boolean;
  clearMoveEvent(): void;
  getMoveEvent(): MoveEvent | undefined;
  setMoveEvent(value?: MoveEvent): void;

  hasNavEvent(): boolean;
  clearNavEvent(): void;
  getNavEvent(): NavEvent | undefined;
  setNavEvent(value?: NavEvent): void;

  hasRotateEvent(): boolean;
  clearRotateEvent(): void;
  getRotateEvent(): RotateEvent | undefined;
  setRotateEvent(value?: RotateEvent): void;

  hasAutoChargeEvent(): boolean;
  clearAutoChargeEvent(): void;
  getAutoChargeEvent(): AutoChargeEvent | undefined;
  setAutoChargeEvent(value?: AutoChargeEvent): void;

  getChangeOneofCase(): OnNavEventChangeResponse.ChangeOneofCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): OnNavEventChangeResponse.AsObject;
  static toObject(includeInstance: boolean, msg: OnNavEventChangeResponse): OnNavEventChangeResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: OnNavEventChangeResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): OnNavEventChangeResponse;
  static deserializeBinaryFromReader(message: OnNavEventChangeResponse, reader: jspb.BinaryReader): OnNavEventChangeResponse;
}

export namespace OnNavEventChangeResponse {
  export type AsObject = {
    navEventType: NavEventTypeMap[keyof NavEventTypeMap],
    moveEvent?: MoveEvent.AsObject,
    navEvent?: NavEvent.AsObject,
    rotateEvent?: RotateEvent.AsObject,
    autoChargeEvent?: AutoChargeEvent.AsObject,
  }

  export enum ChangeOneofCase {
    CHANGE_ONEOF_NOT_SET = 0,
    MOVE_EVENT = 2,
    NAV_EVENT = 3,
    ROTATE_EVENT = 4,
    AUTO_CHARGE_EVENT = 5,
  }
}

export class Route extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  getName(): string;
  setName(value: string): void;

  getIsActive(): boolean;
  setIsActive(value: boolean): void;

  clearRoutePointsList(): void;
  getRoutePointsList(): Array<RoutePoint>;
  setRoutePointsList(value: Array<RoutePoint>): void;
  addRoutePoints(value?: RoutePoint, index?: number): RoutePoint;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Route.AsObject;
  static toObject(includeInstance: boolean, msg: Route): Route.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Route, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Route;
  static deserializeBinaryFromReader(message: Route, reader: jspb.BinaryReader): Route;
}

export namespace Route {
  export type AsObject = {
    id: string,
    name: string,
    isActive: boolean,
    routePointsList: Array<RoutePoint.AsObject>,
  }
}

export class RoutePoint extends jspb.Message {
  getName(): string;
  setName(value: string): void;

  getRotate(): number;
  setRotate(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RoutePoint.AsObject;
  static toObject(includeInstance: boolean, msg: RoutePoint): RoutePoint.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: RoutePoint, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RoutePoint;
  static deserializeBinaryFromReader(message: RoutePoint, reader: jspb.BinaryReader): RoutePoint;
}

export namespace RoutePoint {
  export type AsObject = {
    name: string,
    rotate: number,
  }
}

export class NewRouteRequest extends jspb.Message {
  hasRoute(): boolean;
  clearRoute(): void;
  getRoute(): Route | undefined;
  setRoute(value?: Route): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): NewRouteRequest.AsObject;
  static toObject(includeInstance: boolean, msg: NewRouteRequest): NewRouteRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: NewRouteRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): NewRouteRequest;
  static deserializeBinaryFromReader(message: NewRouteRequest, reader: jspb.BinaryReader): NewRouteRequest;
}

export namespace NewRouteRequest {
  export type AsObject = {
    route?: Route.AsObject,
  }
}

export class NewRouteResponse extends jspb.Message {
  hasRoute(): boolean;
  clearRoute(): void;
  getRoute(): Route | undefined;
  setRoute(value?: Route): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): NewRouteResponse.AsObject;
  static toObject(includeInstance: boolean, msg: NewRouteResponse): NewRouteResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: NewRouteResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): NewRouteResponse;
  static deserializeBinaryFromReader(message: NewRouteResponse, reader: jspb.BinaryReader): NewRouteResponse;
}

export namespace NewRouteResponse {
  export type AsObject = {
    route?: Route.AsObject,
  }
}

export class ListRoutesRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ListRoutesRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ListRoutesRequest): ListRoutesRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ListRoutesRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ListRoutesRequest;
  static deserializeBinaryFromReader(message: ListRoutesRequest, reader: jspb.BinaryReader): ListRoutesRequest;
}

export namespace ListRoutesRequest {
  export type AsObject = {
  }
}

export class ListRoutesResponse extends jspb.Message {
  clearRoutesList(): void;
  getRoutesList(): Array<Route>;
  setRoutesList(value: Array<Route>): void;
  addRoutes(value?: Route, index?: number): Route;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ListRoutesResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ListRoutesResponse): ListRoutesResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ListRoutesResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ListRoutesResponse;
  static deserializeBinaryFromReader(message: ListRoutesResponse, reader: jspb.BinaryReader): ListRoutesResponse;
}

export namespace ListRoutesResponse {
  export type AsObject = {
    routesList: Array<Route.AsObject>,
  }
}

export class GetRouteRequest extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetRouteRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetRouteRequest): GetRouteRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetRouteRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetRouteRequest;
  static deserializeBinaryFromReader(message: GetRouteRequest, reader: jspb.BinaryReader): GetRouteRequest;
}

export namespace GetRouteRequest {
  export type AsObject = {
    id: string,
  }
}

export class GetRouteResponse extends jspb.Message {
  hasRoute(): boolean;
  clearRoute(): void;
  getRoute(): Route | undefined;
  setRoute(value?: Route): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetRouteResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetRouteResponse): GetRouteResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetRouteResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetRouteResponse;
  static deserializeBinaryFromReader(message: GetRouteResponse, reader: jspb.BinaryReader): GetRouteResponse;
}

export namespace GetRouteResponse {
  export type AsObject = {
    route?: Route.AsObject,
  }
}

export class UpdateRouteRequest extends jspb.Message {
  hasRoute(): boolean;
  clearRoute(): void;
  getRoute(): Route | undefined;
  setRoute(value?: Route): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateRouteRequest.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateRouteRequest): UpdateRouteRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateRouteRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateRouteRequest;
  static deserializeBinaryFromReader(message: UpdateRouteRequest, reader: jspb.BinaryReader): UpdateRouteRequest;
}

export namespace UpdateRouteRequest {
  export type AsObject = {
    route?: Route.AsObject,
  }
}

export class UpdateRouteResponse extends jspb.Message {
  hasRoute(): boolean;
  clearRoute(): void;
  getRoute(): Route | undefined;
  setRoute(value?: Route): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateRouteResponse.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateRouteResponse): UpdateRouteResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateRouteResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateRouteResponse;
  static deserializeBinaryFromReader(message: UpdateRouteResponse, reader: jspb.BinaryReader): UpdateRouteResponse;
}

export namespace UpdateRouteResponse {
  export type AsObject = {
    route?: Route.AsObject,
  }
}

export class DeleteRoutesRequest extends jspb.Message {
  clearRoutesIdList(): void;
  getRoutesIdList(): Array<string>;
  setRoutesIdList(value: Array<string>): void;
  addRoutesId(value: string, index?: number): string;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteRoutesRequest.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteRoutesRequest): DeleteRoutesRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeleteRoutesRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteRoutesRequest;
  static deserializeBinaryFromReader(message: DeleteRoutesRequest, reader: jspb.BinaryReader): DeleteRoutesRequest;
}

export namespace DeleteRoutesRequest {
  export type AsObject = {
    routesIdList: Array<string>,
  }
}

export class DeleteRoutesResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteRoutesResponse.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteRoutesResponse): DeleteRoutesResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeleteRoutesResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteRoutesResponse;
  static deserializeBinaryFromReader(message: DeleteRoutesResponse, reader: jspb.BinaryReader): DeleteRoutesResponse;
}

export namespace DeleteRoutesResponse {
  export type AsObject = {
  }
}

export interface StatusCodeMap {
  UNKNOWN: 0;
  STOPPED: 1;
  MOVING: 2;
  PREPARING: 3;
  CANCEL: 4;
  RELEASED: 5;
  ERR_OBSTACLE: 10;
  ERR_NOT_READY: 11;
  ERR_MOTOR_FAIL: 12;
  ERR_WRONG_TARGET: 13;
  REJ_MOVING: 20;
  REJ_NAVING: 21;
  REJ_CHARGING: 22;
  REJ_ROTATING: 23;
}

export const StatusCode: StatusCodeMap;

export interface MoveDirectionMap {
  RELEASE: 0;
  FORWARD: 1;
  BACKWARD: 2;
  LEFT: 3;
  RIGHT: 4;
  LEFT_FORWARD: 5;
  RIGHT_FORWARD: 6;
  LEFT_BACKWARD: 7;
  RIGHT_BACKWARD: 8;
}

export const MoveDirection: MoveDirectionMap;

export interface RoamingTypeMap {
  ROAMING_TYPE_CONTINUE: 0;
  ROAMING_TYPE_ORDER: 1;
  ROAMING_TYPE_RANDOM: 2;
}

export const RoamingType: RoamingTypeMap;

export interface ChargeStatusCodeMap {
  CHARGE_STATUS_UNKNOWN: 0;
  CHARGE_STATUS_PREPARING: 1;
  CHARGE_STATUS_RELEASED: 2;
  CHARGE_STATUS_CONNECTING: 3;
  CHARGE_STATUS_CHARGING: 4;
  CHARGE_STATUS_DISCONNECTING: 5;
  CHARGE_CONNECT_FAIL: 6;
  CHARGE_STATUS_NAV_OBSTACLE: 7;
}

export const ChargeStatusCode: ChargeStatusCodeMap;

export interface NavEventTypeMap {
  NAV_EVENT_REVERSED: 0;
  MOVE_EVENT: 1;
  NAV_EVENT: 2;
  AUTO_CHARGE_EVENT: 3;
  ROTATE_EVENT: 4;
}

export const NavEventType: NavEventTypeMap;

