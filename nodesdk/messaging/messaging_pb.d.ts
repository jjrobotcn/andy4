// package: messagingService
// file: messaging.proto

import * as jspb from "google-protobuf";

export class Subscribe extends jspb.Message {
  clearTopicsList(): void;
  getTopicsList(): Array<string>;
  setTopicsList(value: Array<string>): void;
  addTopics(value: string, index?: number): string;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Subscribe.AsObject;
  static toObject(includeInstance: boolean, msg: Subscribe): Subscribe.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Subscribe, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Subscribe;
  static deserializeBinaryFromReader(message: Subscribe, reader: jspb.BinaryReader): Subscribe;
}

export namespace Subscribe {
  export type AsObject = {
    topicsList: Array<string>,
  }
}

export class Unsubscribe extends jspb.Message {
  clearTopicsList(): void;
  getTopicsList(): Array<string>;
  setTopicsList(value: Array<string>): void;
  addTopics(value: string, index?: number): string;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Unsubscribe.AsObject;
  static toObject(includeInstance: boolean, msg: Unsubscribe): Unsubscribe.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Unsubscribe, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Unsubscribe;
  static deserializeBinaryFromReader(message: Unsubscribe, reader: jspb.BinaryReader): Unsubscribe;
}

export namespace Unsubscribe {
  export type AsObject = {
    topicsList: Array<string>,
  }
}

export class MessagePublish extends jspb.Message {
  clearTopicsList(): void;
  getTopicsList(): Array<string>;
  setTopicsList(value: Array<string>): void;
  addTopics(value: string, index?: number): string;

  getPayload(): Uint8Array | string;
  getPayload_asU8(): Uint8Array;
  getPayload_asB64(): string;
  setPayload(value: Uint8Array | string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MessagePublish.AsObject;
  static toObject(includeInstance: boolean, msg: MessagePublish): MessagePublish.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MessagePublish, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MessagePublish;
  static deserializeBinaryFromReader(message: MessagePublish, reader: jspb.BinaryReader): MessagePublish;
}

export namespace MessagePublish {
  export type AsObject = {
    topicsList: Array<string>,
    payload: Uint8Array | string,
  }
}

export class MessagingRequest extends jspb.Message {
  hasSubscribe(): boolean;
  clearSubscribe(): void;
  getSubscribe(): Subscribe | undefined;
  setSubscribe(value?: Subscribe): void;

  hasUnsubscribe(): boolean;
  clearUnsubscribe(): void;
  getUnsubscribe(): Unsubscribe | undefined;
  setUnsubscribe(value?: Unsubscribe): void;

  hasMessagePublish(): boolean;
  clearMessagePublish(): void;
  getMessagePublish(): MessagePublish | undefined;
  setMessagePublish(value?: MessagePublish): void;

  getMessagingOneofCase(): MessagingRequest.MessagingOneofCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MessagingRequest.AsObject;
  static toObject(includeInstance: boolean, msg: MessagingRequest): MessagingRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MessagingRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MessagingRequest;
  static deserializeBinaryFromReader(message: MessagingRequest, reader: jspb.BinaryReader): MessagingRequest;
}

export namespace MessagingRequest {
  export type AsObject = {
    subscribe?: Subscribe.AsObject,
    unsubscribe?: Unsubscribe.AsObject,
    messagePublish?: MessagePublish.AsObject,
  }

  export enum MessagingOneofCase {
    MESSAGING_ONEOF_NOT_SET = 0,
    SUBSCRIBE = 1,
    UNSUBSCRIBE = 2,
    MESSAGE_PUBLISH = 3,
  }
}

export class MessagingResponse extends jspb.Message {
  getTopic(): string;
  setTopic(value: string): void;

  getPayload(): Uint8Array | string;
  getPayload_asU8(): Uint8Array;
  getPayload_asB64(): string;
  setPayload(value: Uint8Array | string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MessagingResponse.AsObject;
  static toObject(includeInstance: boolean, msg: MessagingResponse): MessagingResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MessagingResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MessagingResponse;
  static deserializeBinaryFromReader(message: MessagingResponse, reader: jspb.BinaryReader): MessagingResponse;
}

export namespace MessagingResponse {
  export type AsObject = {
    topic: string,
    payload: Uint8Array | string,
  }
}

