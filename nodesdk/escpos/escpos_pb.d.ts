// package: escposService
// file: escpos.proto

import * as jspb from "google-protobuf";

export class PrintRawRequest extends jspb.Message {
  getRaw(): Uint8Array | string;
  getRaw_asU8(): Uint8Array;
  getRaw_asB64(): string;
  setRaw(value: Uint8Array | string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PrintRawRequest.AsObject;
  static toObject(includeInstance: boolean, msg: PrintRawRequest): PrintRawRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PrintRawRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PrintRawRequest;
  static deserializeBinaryFromReader(message: PrintRawRequest, reader: jspb.BinaryReader): PrintRawRequest;
}

export namespace PrintRawRequest {
  export type AsObject = {
    raw: Uint8Array | string,
  }
}

export class PrintRawResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PrintRawResponse.AsObject;
  static toObject(includeInstance: boolean, msg: PrintRawResponse): PrintRawResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PrintRawResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PrintRawResponse;
  static deserializeBinaryFromReader(message: PrintRawResponse, reader: jspb.BinaryReader): PrintRawResponse;
}

export namespace PrintRawResponse {
  export type AsObject = {
  }
}

export class Element extends jspb.Message {
  getEtype(): ElementTypeMap[keyof ElementTypeMap];
  setEtype(value: ElementTypeMap[keyof ElementTypeMap]): void;

  getContentText(): string;
  setContentText(value: string): void;

  getContentImage(): Uint8Array | string;
  getContentImage_asU8(): Uint8Array;
  getContentImage_asB64(): string;
  setContentImage(value: Uint8Array | string): void;

  getImageContentType(): string;
  setImageContentType(value: string): void;

  getSize(): ElementSizeMap[keyof ElementSizeMap];
  setSize(value: ElementSizeMap[keyof ElementSizeMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Element.AsObject;
  static toObject(includeInstance: boolean, msg: Element): Element.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Element, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Element;
  static deserializeBinaryFromReader(message: Element, reader: jspb.BinaryReader): Element;
}

export namespace Element {
  export type AsObject = {
    etype: ElementTypeMap[keyof ElementTypeMap],
    contentText: string,
    contentImage: Uint8Array | string,
    imageContentType: string,
    size: ElementSizeMap[keyof ElementSizeMap],
  }
}

export class ElementRow extends jspb.Message {
  clearElementsList(): void;
  getElementsList(): Array<Element>;
  setElementsList(value: Array<Element>): void;
  addElements(value?: Element, index?: number): Element;

  getAlign(): ElementAlignMap[keyof ElementAlignMap];
  setAlign(value: ElementAlignMap[keyof ElementAlignMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ElementRow.AsObject;
  static toObject(includeInstance: boolean, msg: ElementRow): ElementRow.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ElementRow, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ElementRow;
  static deserializeBinaryFromReader(message: ElementRow, reader: jspb.BinaryReader): ElementRow;
}

export namespace ElementRow {
  export type AsObject = {
    elementsList: Array<Element.AsObject>,
    align: ElementAlignMap[keyof ElementAlignMap],
  }
}

export class PrintElementsRequest extends jspb.Message {
  clearElementRowsList(): void;
  getElementRowsList(): Array<ElementRow>;
  setElementRowsList(value: Array<ElementRow>): void;
  addElementRows(value?: ElementRow, index?: number): ElementRow;

  getCut(): boolean;
  setCut(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PrintElementsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: PrintElementsRequest): PrintElementsRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PrintElementsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PrintElementsRequest;
  static deserializeBinaryFromReader(message: PrintElementsRequest, reader: jspb.BinaryReader): PrintElementsRequest;
}

export namespace PrintElementsRequest {
  export type AsObject = {
    elementRowsList: Array<ElementRow.AsObject>,
    cut: boolean,
  }
}

export class PrintElementsResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PrintElementsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: PrintElementsResponse): PrintElementsResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PrintElementsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PrintElementsResponse;
  static deserializeBinaryFromReader(message: PrintElementsResponse, reader: jspb.BinaryReader): PrintElementsResponse;
}

export namespace PrintElementsResponse {
  export type AsObject = {
  }
}

export class PrintHtmlTemplateRequest extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  getName(): string;
  setName(value: string): void;

  getParamsMap(): jspb.Map<string, string>;
  clearParamsMap(): void;
  getCut(): boolean;
  setCut(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PrintHtmlTemplateRequest.AsObject;
  static toObject(includeInstance: boolean, msg: PrintHtmlTemplateRequest): PrintHtmlTemplateRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PrintHtmlTemplateRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PrintHtmlTemplateRequest;
  static deserializeBinaryFromReader(message: PrintHtmlTemplateRequest, reader: jspb.BinaryReader): PrintHtmlTemplateRequest;
}

export namespace PrintHtmlTemplateRequest {
  export type AsObject = {
    id: string,
    name: string,
    paramsMap: Array<[string, string]>,
    cut: boolean,
  }
}

export class PrintHtmlTemplateResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PrintHtmlTemplateResponse.AsObject;
  static toObject(includeInstance: boolean, msg: PrintHtmlTemplateResponse): PrintHtmlTemplateResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PrintHtmlTemplateResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PrintHtmlTemplateResponse;
  static deserializeBinaryFromReader(message: PrintHtmlTemplateResponse, reader: jspb.BinaryReader): PrintHtmlTemplateResponse;
}

export namespace PrintHtmlTemplateResponse {
  export type AsObject = {
  }
}

export class HtmlTemplate extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  getName(): string;
  setName(value: string): void;

  getContent(): string;
  setContent(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): HtmlTemplate.AsObject;
  static toObject(includeInstance: boolean, msg: HtmlTemplate): HtmlTemplate.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: HtmlTemplate, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): HtmlTemplate;
  static deserializeBinaryFromReader(message: HtmlTemplate, reader: jspb.BinaryReader): HtmlTemplate;
}

export namespace HtmlTemplate {
  export type AsObject = {
    id: string,
    name: string,
    content: string,
  }
}

export class NewHtmlTemplateRequest extends jspb.Message {
  hasHtmlTemplate(): boolean;
  clearHtmlTemplate(): void;
  getHtmlTemplate(): HtmlTemplate | undefined;
  setHtmlTemplate(value?: HtmlTemplate): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): NewHtmlTemplateRequest.AsObject;
  static toObject(includeInstance: boolean, msg: NewHtmlTemplateRequest): NewHtmlTemplateRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: NewHtmlTemplateRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): NewHtmlTemplateRequest;
  static deserializeBinaryFromReader(message: NewHtmlTemplateRequest, reader: jspb.BinaryReader): NewHtmlTemplateRequest;
}

export namespace NewHtmlTemplateRequest {
  export type AsObject = {
    htmlTemplate?: HtmlTemplate.AsObject,
  }
}

export class NewHtmlTemplateResponse extends jspb.Message {
  hasHtmlTemplate(): boolean;
  clearHtmlTemplate(): void;
  getHtmlTemplate(): HtmlTemplate | undefined;
  setHtmlTemplate(value?: HtmlTemplate): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): NewHtmlTemplateResponse.AsObject;
  static toObject(includeInstance: boolean, msg: NewHtmlTemplateResponse): NewHtmlTemplateResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: NewHtmlTemplateResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): NewHtmlTemplateResponse;
  static deserializeBinaryFromReader(message: NewHtmlTemplateResponse, reader: jspb.BinaryReader): NewHtmlTemplateResponse;
}

export namespace NewHtmlTemplateResponse {
  export type AsObject = {
    htmlTemplate?: HtmlTemplate.AsObject,
  }
}

export class ListHtmlTemplatesRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ListHtmlTemplatesRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ListHtmlTemplatesRequest): ListHtmlTemplatesRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ListHtmlTemplatesRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ListHtmlTemplatesRequest;
  static deserializeBinaryFromReader(message: ListHtmlTemplatesRequest, reader: jspb.BinaryReader): ListHtmlTemplatesRequest;
}

export namespace ListHtmlTemplatesRequest {
  export type AsObject = {
  }
}

export class ListHtmlTemplatesResponse extends jspb.Message {
  clearHtmlTemplatesList(): void;
  getHtmlTemplatesList(): Array<HtmlTemplate>;
  setHtmlTemplatesList(value: Array<HtmlTemplate>): void;
  addHtmlTemplates(value?: HtmlTemplate, index?: number): HtmlTemplate;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ListHtmlTemplatesResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ListHtmlTemplatesResponse): ListHtmlTemplatesResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ListHtmlTemplatesResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ListHtmlTemplatesResponse;
  static deserializeBinaryFromReader(message: ListHtmlTemplatesResponse, reader: jspb.BinaryReader): ListHtmlTemplatesResponse;
}

export namespace ListHtmlTemplatesResponse {
  export type AsObject = {
    htmlTemplatesList: Array<HtmlTemplate.AsObject>,
  }
}

export class GetHtmlTemplateRequest extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetHtmlTemplateRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetHtmlTemplateRequest): GetHtmlTemplateRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetHtmlTemplateRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetHtmlTemplateRequest;
  static deserializeBinaryFromReader(message: GetHtmlTemplateRequest, reader: jspb.BinaryReader): GetHtmlTemplateRequest;
}

export namespace GetHtmlTemplateRequest {
  export type AsObject = {
    id: string,
  }
}

export class GetHtmlTemplateResponse extends jspb.Message {
  hasHtmlTemplate(): boolean;
  clearHtmlTemplate(): void;
  getHtmlTemplate(): HtmlTemplate | undefined;
  setHtmlTemplate(value?: HtmlTemplate): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetHtmlTemplateResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetHtmlTemplateResponse): GetHtmlTemplateResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetHtmlTemplateResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetHtmlTemplateResponse;
  static deserializeBinaryFromReader(message: GetHtmlTemplateResponse, reader: jspb.BinaryReader): GetHtmlTemplateResponse;
}

export namespace GetHtmlTemplateResponse {
  export type AsObject = {
    htmlTemplate?: HtmlTemplate.AsObject,
  }
}

export class UpdateHtmlTemplateRequest extends jspb.Message {
  hasHtmlTemplate(): boolean;
  clearHtmlTemplate(): void;
  getHtmlTemplate(): HtmlTemplate | undefined;
  setHtmlTemplate(value?: HtmlTemplate): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateHtmlTemplateRequest.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateHtmlTemplateRequest): UpdateHtmlTemplateRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateHtmlTemplateRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateHtmlTemplateRequest;
  static deserializeBinaryFromReader(message: UpdateHtmlTemplateRequest, reader: jspb.BinaryReader): UpdateHtmlTemplateRequest;
}

export namespace UpdateHtmlTemplateRequest {
  export type AsObject = {
    htmlTemplate?: HtmlTemplate.AsObject,
  }
}

export class UpdateHtmlTemplateResponse extends jspb.Message {
  hasHtmlTemplate(): boolean;
  clearHtmlTemplate(): void;
  getHtmlTemplate(): HtmlTemplate | undefined;
  setHtmlTemplate(value?: HtmlTemplate): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateHtmlTemplateResponse.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateHtmlTemplateResponse): UpdateHtmlTemplateResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: UpdateHtmlTemplateResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateHtmlTemplateResponse;
  static deserializeBinaryFromReader(message: UpdateHtmlTemplateResponse, reader: jspb.BinaryReader): UpdateHtmlTemplateResponse;
}

export namespace UpdateHtmlTemplateResponse {
  export type AsObject = {
    htmlTemplate?: HtmlTemplate.AsObject,
  }
}

export class DeleteHtmlTemplatesRequest extends jspb.Message {
  clearHtmlTemplatesIdList(): void;
  getHtmlTemplatesIdList(): Array<string>;
  setHtmlTemplatesIdList(value: Array<string>): void;
  addHtmlTemplatesId(value: string, index?: number): string;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteHtmlTemplatesRequest.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteHtmlTemplatesRequest): DeleteHtmlTemplatesRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeleteHtmlTemplatesRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteHtmlTemplatesRequest;
  static deserializeBinaryFromReader(message: DeleteHtmlTemplatesRequest, reader: jspb.BinaryReader): DeleteHtmlTemplatesRequest;
}

export namespace DeleteHtmlTemplatesRequest {
  export type AsObject = {
    htmlTemplatesIdList: Array<string>,
  }
}

export class DeleteHtmlTemplatesResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteHtmlTemplatesResponse.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteHtmlTemplatesResponse): DeleteHtmlTemplatesResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeleteHtmlTemplatesResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteHtmlTemplatesResponse;
  static deserializeBinaryFromReader(message: DeleteHtmlTemplatesResponse, reader: jspb.BinaryReader): DeleteHtmlTemplatesResponse;
}

export namespace DeleteHtmlTemplatesResponse {
  export type AsObject = {
  }
}

export interface ElementTypeMap {
  TEXT: 0;
  IMAGE: 1;
}

export const ElementType: ElementTypeMap;

export interface ElementSizeMap {
  DEFAULT: 0;
  SMALL: 1;
  NORMAL: 2;
  LARGE: 3;
  HUGE: 4;
}

export const ElementSize: ElementSizeMap;

export interface ElementAlignMap {
  LEFT: 0;
  CENTER: 1;
  RIGHT: 2;
}

export const ElementAlign: ElementAlignMap;

