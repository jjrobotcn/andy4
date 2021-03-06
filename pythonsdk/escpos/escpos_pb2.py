# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: escpos.proto

from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='escpos.proto',
  package='escposService',
  syntax='proto3',
  serialized_options=b'\n\032com.jjrobot.andy4.escpospbB\017EscPosServicePBZ\010escpospb',
  serialized_pb=b'\n\x0c\x65scpos.proto\x12\rescposService\"\x1e\n\x0fPrintRawRequest\x12\x0b\n\x03raw\x18\x01 \x01(\x0c\"\x12\n\x10PrintRawResponse\"\xa7\x01\n\x07\x45lement\x12)\n\x05\x65type\x18\x01 \x01(\x0e\x32\x1a.escposService.ElementType\x12\x14\n\x0c\x63ontent_text\x18\x02 \x01(\t\x12\x15\n\rcontent_image\x18\x03 \x01(\x0c\x12\x1a\n\x12image_content_type\x18\x05 \x01(\t\x12(\n\x04size\x18\x04 \x01(\x0e\x32\x1a.escposService.ElementSize\"b\n\nElementRow\x12(\n\x08\x65lements\x18\x01 \x03(\x0b\x32\x16.escposService.Element\x12*\n\x05\x61lign\x18\x02 \x01(\x0e\x32\x1b.escposService.ElementAlign\"T\n\x14PrintElementsRequest\x12/\n\x0c\x65lement_rows\x18\x01 \x03(\x0b\x32\x19.escposService.ElementRow\x12\x0b\n\x03\x63ut\x18\x02 \x01(\x08\"\x17\n\x15PrintElementsResponse\"\xb5\x01\n\x18PrintHtmlTemplateRequest\x12\n\n\x02id\x18\x01 \x01(\t\x12\x0c\n\x04name\x18\x02 \x01(\t\x12\x43\n\x06params\x18\x03 \x03(\x0b\x32\x33.escposService.PrintHtmlTemplateRequest.ParamsEntry\x12\x0b\n\x03\x63ut\x18\x04 \x01(\x08\x1a-\n\x0bParamsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\x1b\n\x19PrintHtmlTemplateResponse\"9\n\x0cHtmlTemplate\x12\n\n\x02id\x18\x01 \x01(\t\x12\x0c\n\x04name\x18\x02 \x01(\t\x12\x0f\n\x07\x63ontent\x18\x03 \x01(\t\"L\n\x16NewHtmlTemplateRequest\x12\x32\n\rhtml_template\x18\x01 \x01(\x0b\x32\x1b.escposService.HtmlTemplate\"M\n\x17NewHtmlTemplateResponse\x12\x32\n\rhtml_template\x18\x01 \x01(\x0b\x32\x1b.escposService.HtmlTemplate\"\x1a\n\x18ListHtmlTemplatesRequest\"P\n\x19ListHtmlTemplatesResponse\x12\x33\n\x0ehtml_templates\x18\x01 \x03(\x0b\x32\x1b.escposService.HtmlTemplate\"$\n\x16GetHtmlTemplateRequest\x12\n\n\x02id\x18\x01 \x01(\t\"M\n\x17GetHtmlTemplateResponse\x12\x32\n\rhtml_template\x18\x01 \x01(\x0b\x32\x1b.escposService.HtmlTemplate\"O\n\x19UpdateHtmlTemplateRequest\x12\x32\n\rhtml_template\x18\x01 \x01(\x0b\x32\x1b.escposService.HtmlTemplate\"P\n\x1aUpdateHtmlTemplateResponse\x12\x32\n\rhtml_template\x18\x01 \x01(\x0b\x32\x1b.escposService.HtmlTemplate\"7\n\x1a\x44\x65leteHtmlTemplatesRequest\x12\x19\n\x11html_templates_id\x18\x01 \x03(\t\"\x1d\n\x1b\x44\x65leteHtmlTemplatesResponse*\"\n\x0b\x45lementType\x12\x08\n\x04TEXT\x10\x00\x12\t\n\x05IMAGE\x10\x01*F\n\x0b\x45lementSize\x12\x0b\n\x07\x44\x45\x46\x41ULT\x10\x00\x12\t\n\x05SMALL\x10\x01\x12\n\n\x06NORMAL\x10\x02\x12\t\n\x05LARGE\x10\x03\x12\x08\n\x04HUGE\x10\x04*/\n\x0c\x45lementAlign\x12\x08\n\x04LEFT\x10\x00\x12\n\n\x06\x43\x45NTER\x10\x01\x12\t\n\x05RIGHT\x10\x02\x32\xb5\x06\n\rEscPosService\x12M\n\x08PrintRaw\x12\x1e.escposService.PrintRawRequest\x1a\x1f.escposService.PrintRawResponse\"\x00\x12\\\n\rPrintElements\x12#.escposService.PrintElementsRequest\x1a$.escposService.PrintElementsResponse\"\x00\x12h\n\x11PrintHtmlTemplate\x12\'.escposService.PrintHtmlTemplateRequest\x1a(.escposService.PrintHtmlTemplateResponse\"\x00\x12\x62\n\x0fNewHtmlTemplate\x12%.escposService.NewHtmlTemplateRequest\x1a&.escposService.NewHtmlTemplateResponse\"\x00\x12h\n\x11ListHtmlTemplates\x12\'.escposService.ListHtmlTemplatesRequest\x1a(.escposService.ListHtmlTemplatesResponse\"\x00\x12\x62\n\x0fGetHtmlTemplate\x12%.escposService.GetHtmlTemplateRequest\x1a&.escposService.GetHtmlTemplateResponse\"\x00\x12k\n\x12UpdateHtmlTemplate\x12(.escposService.UpdateHtmlTemplateRequest\x1a).escposService.UpdateHtmlTemplateResponse\"\x00\x12n\n\x13\x44\x65leteHtmlTemplates\x12).escposService.DeleteHtmlTemplatesRequest\x1a*.escposService.DeleteHtmlTemplatesResponse\"\x00\x42\x37\n\x1a\x63om.jjrobot.andy4.escpospbB\x0f\x45scPosServicePBZ\x08\x65scpospbb\x06proto3'
)

_ELEMENTTYPE = _descriptor.EnumDescriptor(
  name='ElementType',
  full_name='escposService.ElementType',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='TEXT', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='IMAGE', index=1, number=1,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1371,
  serialized_end=1405,
)
_sym_db.RegisterEnumDescriptor(_ELEMENTTYPE)

ElementType = enum_type_wrapper.EnumTypeWrapper(_ELEMENTTYPE)
_ELEMENTSIZE = _descriptor.EnumDescriptor(
  name='ElementSize',
  full_name='escposService.ElementSize',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='DEFAULT', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='SMALL', index=1, number=1,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='NORMAL', index=2, number=2,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='LARGE', index=3, number=3,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='HUGE', index=4, number=4,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1407,
  serialized_end=1477,
)
_sym_db.RegisterEnumDescriptor(_ELEMENTSIZE)

ElementSize = enum_type_wrapper.EnumTypeWrapper(_ELEMENTSIZE)
_ELEMENTALIGN = _descriptor.EnumDescriptor(
  name='ElementAlign',
  full_name='escposService.ElementAlign',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='LEFT', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='CENTER', index=1, number=1,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='RIGHT', index=2, number=2,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1479,
  serialized_end=1526,
)
_sym_db.RegisterEnumDescriptor(_ELEMENTALIGN)

ElementAlign = enum_type_wrapper.EnumTypeWrapper(_ELEMENTALIGN)
TEXT = 0
IMAGE = 1
DEFAULT = 0
SMALL = 1
NORMAL = 2
LARGE = 3
HUGE = 4
LEFT = 0
CENTER = 1
RIGHT = 2



_PRINTRAWREQUEST = _descriptor.Descriptor(
  name='PrintRawRequest',
  full_name='escposService.PrintRawRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='raw', full_name='escposService.PrintRawRequest.raw', index=0,
      number=1, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=31,
  serialized_end=61,
)


_PRINTRAWRESPONSE = _descriptor.Descriptor(
  name='PrintRawResponse',
  full_name='escposService.PrintRawResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=63,
  serialized_end=81,
)


_ELEMENT = _descriptor.Descriptor(
  name='Element',
  full_name='escposService.Element',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='etype', full_name='escposService.Element.etype', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='content_text', full_name='escposService.Element.content_text', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='content_image', full_name='escposService.Element.content_image', index=2,
      number=3, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='image_content_type', full_name='escposService.Element.image_content_type', index=3,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='size', full_name='escposService.Element.size', index=4,
      number=4, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=84,
  serialized_end=251,
)


_ELEMENTROW = _descriptor.Descriptor(
  name='ElementRow',
  full_name='escposService.ElementRow',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='elements', full_name='escposService.ElementRow.elements', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='align', full_name='escposService.ElementRow.align', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=253,
  serialized_end=351,
)


_PRINTELEMENTSREQUEST = _descriptor.Descriptor(
  name='PrintElementsRequest',
  full_name='escposService.PrintElementsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='element_rows', full_name='escposService.PrintElementsRequest.element_rows', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='cut', full_name='escposService.PrintElementsRequest.cut', index=1,
      number=2, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=353,
  serialized_end=437,
)


_PRINTELEMENTSRESPONSE = _descriptor.Descriptor(
  name='PrintElementsResponse',
  full_name='escposService.PrintElementsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=439,
  serialized_end=462,
)


_PRINTHTMLTEMPLATEREQUEST_PARAMSENTRY = _descriptor.Descriptor(
  name='ParamsEntry',
  full_name='escposService.PrintHtmlTemplateRequest.ParamsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='escposService.PrintHtmlTemplateRequest.ParamsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='value', full_name='escposService.PrintHtmlTemplateRequest.ParamsEntry.value', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=601,
  serialized_end=646,
)

_PRINTHTMLTEMPLATEREQUEST = _descriptor.Descriptor(
  name='PrintHtmlTemplateRequest',
  full_name='escposService.PrintHtmlTemplateRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='escposService.PrintHtmlTemplateRequest.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='name', full_name='escposService.PrintHtmlTemplateRequest.name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='params', full_name='escposService.PrintHtmlTemplateRequest.params', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='cut', full_name='escposService.PrintHtmlTemplateRequest.cut', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[_PRINTHTMLTEMPLATEREQUEST_PARAMSENTRY, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=465,
  serialized_end=646,
)


_PRINTHTMLTEMPLATERESPONSE = _descriptor.Descriptor(
  name='PrintHtmlTemplateResponse',
  full_name='escposService.PrintHtmlTemplateResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=648,
  serialized_end=675,
)


_HTMLTEMPLATE = _descriptor.Descriptor(
  name='HtmlTemplate',
  full_name='escposService.HtmlTemplate',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='escposService.HtmlTemplate.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='name', full_name='escposService.HtmlTemplate.name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='content', full_name='escposService.HtmlTemplate.content', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=677,
  serialized_end=734,
)


_NEWHTMLTEMPLATEREQUEST = _descriptor.Descriptor(
  name='NewHtmlTemplateRequest',
  full_name='escposService.NewHtmlTemplateRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='html_template', full_name='escposService.NewHtmlTemplateRequest.html_template', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=736,
  serialized_end=812,
)


_NEWHTMLTEMPLATERESPONSE = _descriptor.Descriptor(
  name='NewHtmlTemplateResponse',
  full_name='escposService.NewHtmlTemplateResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='html_template', full_name='escposService.NewHtmlTemplateResponse.html_template', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=814,
  serialized_end=891,
)


_LISTHTMLTEMPLATESREQUEST = _descriptor.Descriptor(
  name='ListHtmlTemplatesRequest',
  full_name='escposService.ListHtmlTemplatesRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=893,
  serialized_end=919,
)


_LISTHTMLTEMPLATESRESPONSE = _descriptor.Descriptor(
  name='ListHtmlTemplatesResponse',
  full_name='escposService.ListHtmlTemplatesResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='html_templates', full_name='escposService.ListHtmlTemplatesResponse.html_templates', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=921,
  serialized_end=1001,
)


_GETHTMLTEMPLATEREQUEST = _descriptor.Descriptor(
  name='GetHtmlTemplateRequest',
  full_name='escposService.GetHtmlTemplateRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='escposService.GetHtmlTemplateRequest.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1003,
  serialized_end=1039,
)


_GETHTMLTEMPLATERESPONSE = _descriptor.Descriptor(
  name='GetHtmlTemplateResponse',
  full_name='escposService.GetHtmlTemplateResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='html_template', full_name='escposService.GetHtmlTemplateResponse.html_template', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1041,
  serialized_end=1118,
)


_UPDATEHTMLTEMPLATEREQUEST = _descriptor.Descriptor(
  name='UpdateHtmlTemplateRequest',
  full_name='escposService.UpdateHtmlTemplateRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='html_template', full_name='escposService.UpdateHtmlTemplateRequest.html_template', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1120,
  serialized_end=1199,
)


_UPDATEHTMLTEMPLATERESPONSE = _descriptor.Descriptor(
  name='UpdateHtmlTemplateResponse',
  full_name='escposService.UpdateHtmlTemplateResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='html_template', full_name='escposService.UpdateHtmlTemplateResponse.html_template', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1201,
  serialized_end=1281,
)


_DELETEHTMLTEMPLATESREQUEST = _descriptor.Descriptor(
  name='DeleteHtmlTemplatesRequest',
  full_name='escposService.DeleteHtmlTemplatesRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='html_templates_id', full_name='escposService.DeleteHtmlTemplatesRequest.html_templates_id', index=0,
      number=1, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1283,
  serialized_end=1338,
)


_DELETEHTMLTEMPLATESRESPONSE = _descriptor.Descriptor(
  name='DeleteHtmlTemplatesResponse',
  full_name='escposService.DeleteHtmlTemplatesResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1340,
  serialized_end=1369,
)

_ELEMENT.fields_by_name['etype'].enum_type = _ELEMENTTYPE
_ELEMENT.fields_by_name['size'].enum_type = _ELEMENTSIZE
_ELEMENTROW.fields_by_name['elements'].message_type = _ELEMENT
_ELEMENTROW.fields_by_name['align'].enum_type = _ELEMENTALIGN
_PRINTELEMENTSREQUEST.fields_by_name['element_rows'].message_type = _ELEMENTROW
_PRINTHTMLTEMPLATEREQUEST_PARAMSENTRY.containing_type = _PRINTHTMLTEMPLATEREQUEST
_PRINTHTMLTEMPLATEREQUEST.fields_by_name['params'].message_type = _PRINTHTMLTEMPLATEREQUEST_PARAMSENTRY
_NEWHTMLTEMPLATEREQUEST.fields_by_name['html_template'].message_type = _HTMLTEMPLATE
_NEWHTMLTEMPLATERESPONSE.fields_by_name['html_template'].message_type = _HTMLTEMPLATE
_LISTHTMLTEMPLATESRESPONSE.fields_by_name['html_templates'].message_type = _HTMLTEMPLATE
_GETHTMLTEMPLATERESPONSE.fields_by_name['html_template'].message_type = _HTMLTEMPLATE
_UPDATEHTMLTEMPLATEREQUEST.fields_by_name['html_template'].message_type = _HTMLTEMPLATE
_UPDATEHTMLTEMPLATERESPONSE.fields_by_name['html_template'].message_type = _HTMLTEMPLATE
DESCRIPTOR.message_types_by_name['PrintRawRequest'] = _PRINTRAWREQUEST
DESCRIPTOR.message_types_by_name['PrintRawResponse'] = _PRINTRAWRESPONSE
DESCRIPTOR.message_types_by_name['Element'] = _ELEMENT
DESCRIPTOR.message_types_by_name['ElementRow'] = _ELEMENTROW
DESCRIPTOR.message_types_by_name['PrintElementsRequest'] = _PRINTELEMENTSREQUEST
DESCRIPTOR.message_types_by_name['PrintElementsResponse'] = _PRINTELEMENTSRESPONSE
DESCRIPTOR.message_types_by_name['PrintHtmlTemplateRequest'] = _PRINTHTMLTEMPLATEREQUEST
DESCRIPTOR.message_types_by_name['PrintHtmlTemplateResponse'] = _PRINTHTMLTEMPLATERESPONSE
DESCRIPTOR.message_types_by_name['HtmlTemplate'] = _HTMLTEMPLATE
DESCRIPTOR.message_types_by_name['NewHtmlTemplateRequest'] = _NEWHTMLTEMPLATEREQUEST
DESCRIPTOR.message_types_by_name['NewHtmlTemplateResponse'] = _NEWHTMLTEMPLATERESPONSE
DESCRIPTOR.message_types_by_name['ListHtmlTemplatesRequest'] = _LISTHTMLTEMPLATESREQUEST
DESCRIPTOR.message_types_by_name['ListHtmlTemplatesResponse'] = _LISTHTMLTEMPLATESRESPONSE
DESCRIPTOR.message_types_by_name['GetHtmlTemplateRequest'] = _GETHTMLTEMPLATEREQUEST
DESCRIPTOR.message_types_by_name['GetHtmlTemplateResponse'] = _GETHTMLTEMPLATERESPONSE
DESCRIPTOR.message_types_by_name['UpdateHtmlTemplateRequest'] = _UPDATEHTMLTEMPLATEREQUEST
DESCRIPTOR.message_types_by_name['UpdateHtmlTemplateResponse'] = _UPDATEHTMLTEMPLATERESPONSE
DESCRIPTOR.message_types_by_name['DeleteHtmlTemplatesRequest'] = _DELETEHTMLTEMPLATESREQUEST
DESCRIPTOR.message_types_by_name['DeleteHtmlTemplatesResponse'] = _DELETEHTMLTEMPLATESRESPONSE
DESCRIPTOR.enum_types_by_name['ElementType'] = _ELEMENTTYPE
DESCRIPTOR.enum_types_by_name['ElementSize'] = _ELEMENTSIZE
DESCRIPTOR.enum_types_by_name['ElementAlign'] = _ELEMENTALIGN
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

PrintRawRequest = _reflection.GeneratedProtocolMessageType('PrintRawRequest', (_message.Message,), {
  'DESCRIPTOR' : _PRINTRAWREQUEST,
  '__module__' : 'escpos_pb2'
  # @@protoc_insertion_point(class_scope:escposService.PrintRawRequest)
  })
_sym_db.RegisterMessage(PrintRawRequest)

PrintRawResponse = _reflection.GeneratedProtocolMessageType('PrintRawResponse', (_message.Message,), {
  'DESCRIPTOR' : _PRINTRAWRESPONSE,
  '__module__' : 'escpos_pb2'
  # @@protoc_insertion_point(class_scope:escposService.PrintRawResponse)
  })
_sym_db.RegisterMessage(PrintRawResponse)

Element = _reflection.GeneratedProtocolMessageType('Element', (_message.Message,), {
  'DESCRIPTOR' : _ELEMENT,
  '__module__' : 'escpos_pb2'
  # @@protoc_insertion_point(class_scope:escposService.Element)
  })
_sym_db.RegisterMessage(Element)

ElementRow = _reflection.GeneratedProtocolMessageType('ElementRow', (_message.Message,), {
  'DESCRIPTOR' : _ELEMENTROW,
  '__module__' : 'escpos_pb2'
  # @@protoc_insertion_point(class_scope:escposService.ElementRow)
  })
_sym_db.RegisterMessage(ElementRow)

PrintElementsRequest = _reflection.GeneratedProtocolMessageType('PrintElementsRequest', (_message.Message,), {
  'DESCRIPTOR' : _PRINTELEMENTSREQUEST,
  '__module__' : 'escpos_pb2'
  # @@protoc_insertion_point(class_scope:escposService.PrintElementsRequest)
  })
_sym_db.RegisterMessage(PrintElementsRequest)

PrintElementsResponse = _reflection.GeneratedProtocolMessageType('PrintElementsResponse', (_message.Message,), {
  'DESCRIPTOR' : _PRINTELEMENTSRESPONSE,
  '__module__' : 'escpos_pb2'
  # @@protoc_insertion_point(class_scope:escposService.PrintElementsResponse)
  })
_sym_db.RegisterMessage(PrintElementsResponse)

PrintHtmlTemplateRequest = _reflection.GeneratedProtocolMessageType('PrintHtmlTemplateRequest', (_message.Message,), {

  'ParamsEntry' : _reflection.GeneratedProtocolMessageType('ParamsEntry', (_message.Message,), {
    'DESCRIPTOR' : _PRINTHTMLTEMPLATEREQUEST_PARAMSENTRY,
    '__module__' : 'escpos_pb2'
    # @@protoc_insertion_point(class_scope:escposService.PrintHtmlTemplateRequest.ParamsEntry)
    })
  ,
  'DESCRIPTOR' : _PRINTHTMLTEMPLATEREQUEST,
  '__module__' : 'escpos_pb2'
  # @@protoc_insertion_point(class_scope:escposService.PrintHtmlTemplateRequest)
  })
_sym_db.RegisterMessage(PrintHtmlTemplateRequest)
_sym_db.RegisterMessage(PrintHtmlTemplateRequest.ParamsEntry)

PrintHtmlTemplateResponse = _reflection.GeneratedProtocolMessageType('PrintHtmlTemplateResponse', (_message.Message,), {
  'DESCRIPTOR' : _PRINTHTMLTEMPLATERESPONSE,
  '__module__' : 'escpos_pb2'
  # @@protoc_insertion_point(class_scope:escposService.PrintHtmlTemplateResponse)
  })
_sym_db.RegisterMessage(PrintHtmlTemplateResponse)

HtmlTemplate = _reflection.GeneratedProtocolMessageType('HtmlTemplate', (_message.Message,), {
  'DESCRIPTOR' : _HTMLTEMPLATE,
  '__module__' : 'escpos_pb2'
  # @@protoc_insertion_point(class_scope:escposService.HtmlTemplate)
  })
_sym_db.RegisterMessage(HtmlTemplate)

NewHtmlTemplateRequest = _reflection.GeneratedProtocolMessageType('NewHtmlTemplateRequest', (_message.Message,), {
  'DESCRIPTOR' : _NEWHTMLTEMPLATEREQUEST,
  '__module__' : 'escpos_pb2'
  # @@protoc_insertion_point(class_scope:escposService.NewHtmlTemplateRequest)
  })
_sym_db.RegisterMessage(NewHtmlTemplateRequest)

NewHtmlTemplateResponse = _reflection.GeneratedProtocolMessageType('NewHtmlTemplateResponse', (_message.Message,), {
  'DESCRIPTOR' : _NEWHTMLTEMPLATERESPONSE,
  '__module__' : 'escpos_pb2'
  # @@protoc_insertion_point(class_scope:escposService.NewHtmlTemplateResponse)
  })
_sym_db.RegisterMessage(NewHtmlTemplateResponse)

ListHtmlTemplatesRequest = _reflection.GeneratedProtocolMessageType('ListHtmlTemplatesRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTHTMLTEMPLATESREQUEST,
  '__module__' : 'escpos_pb2'
  # @@protoc_insertion_point(class_scope:escposService.ListHtmlTemplatesRequest)
  })
_sym_db.RegisterMessage(ListHtmlTemplatesRequest)

ListHtmlTemplatesResponse = _reflection.GeneratedProtocolMessageType('ListHtmlTemplatesResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTHTMLTEMPLATESRESPONSE,
  '__module__' : 'escpos_pb2'
  # @@protoc_insertion_point(class_scope:escposService.ListHtmlTemplatesResponse)
  })
_sym_db.RegisterMessage(ListHtmlTemplatesResponse)

GetHtmlTemplateRequest = _reflection.GeneratedProtocolMessageType('GetHtmlTemplateRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETHTMLTEMPLATEREQUEST,
  '__module__' : 'escpos_pb2'
  # @@protoc_insertion_point(class_scope:escposService.GetHtmlTemplateRequest)
  })
_sym_db.RegisterMessage(GetHtmlTemplateRequest)

GetHtmlTemplateResponse = _reflection.GeneratedProtocolMessageType('GetHtmlTemplateResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETHTMLTEMPLATERESPONSE,
  '__module__' : 'escpos_pb2'
  # @@protoc_insertion_point(class_scope:escposService.GetHtmlTemplateResponse)
  })
_sym_db.RegisterMessage(GetHtmlTemplateResponse)

UpdateHtmlTemplateRequest = _reflection.GeneratedProtocolMessageType('UpdateHtmlTemplateRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEHTMLTEMPLATEREQUEST,
  '__module__' : 'escpos_pb2'
  # @@protoc_insertion_point(class_scope:escposService.UpdateHtmlTemplateRequest)
  })
_sym_db.RegisterMessage(UpdateHtmlTemplateRequest)

UpdateHtmlTemplateResponse = _reflection.GeneratedProtocolMessageType('UpdateHtmlTemplateResponse', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEHTMLTEMPLATERESPONSE,
  '__module__' : 'escpos_pb2'
  # @@protoc_insertion_point(class_scope:escposService.UpdateHtmlTemplateResponse)
  })
_sym_db.RegisterMessage(UpdateHtmlTemplateResponse)

DeleteHtmlTemplatesRequest = _reflection.GeneratedProtocolMessageType('DeleteHtmlTemplatesRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEHTMLTEMPLATESREQUEST,
  '__module__' : 'escpos_pb2'
  # @@protoc_insertion_point(class_scope:escposService.DeleteHtmlTemplatesRequest)
  })
_sym_db.RegisterMessage(DeleteHtmlTemplatesRequest)

DeleteHtmlTemplatesResponse = _reflection.GeneratedProtocolMessageType('DeleteHtmlTemplatesResponse', (_message.Message,), {
  'DESCRIPTOR' : _DELETEHTMLTEMPLATESRESPONSE,
  '__module__' : 'escpos_pb2'
  # @@protoc_insertion_point(class_scope:escposService.DeleteHtmlTemplatesResponse)
  })
_sym_db.RegisterMessage(DeleteHtmlTemplatesResponse)


DESCRIPTOR._options = None
_PRINTHTMLTEMPLATEREQUEST_PARAMSENTRY._options = None

_ESCPOSSERVICE = _descriptor.ServiceDescriptor(
  name='EscPosService',
  full_name='escposService.EscPosService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=1529,
  serialized_end=2350,
  methods=[
  _descriptor.MethodDescriptor(
    name='PrintRaw',
    full_name='escposService.EscPosService.PrintRaw',
    index=0,
    containing_service=None,
    input_type=_PRINTRAWREQUEST,
    output_type=_PRINTRAWRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='PrintElements',
    full_name='escposService.EscPosService.PrintElements',
    index=1,
    containing_service=None,
    input_type=_PRINTELEMENTSREQUEST,
    output_type=_PRINTELEMENTSRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='PrintHtmlTemplate',
    full_name='escposService.EscPosService.PrintHtmlTemplate',
    index=2,
    containing_service=None,
    input_type=_PRINTHTMLTEMPLATEREQUEST,
    output_type=_PRINTHTMLTEMPLATERESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='NewHtmlTemplate',
    full_name='escposService.EscPosService.NewHtmlTemplate',
    index=3,
    containing_service=None,
    input_type=_NEWHTMLTEMPLATEREQUEST,
    output_type=_NEWHTMLTEMPLATERESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='ListHtmlTemplates',
    full_name='escposService.EscPosService.ListHtmlTemplates',
    index=4,
    containing_service=None,
    input_type=_LISTHTMLTEMPLATESREQUEST,
    output_type=_LISTHTMLTEMPLATESRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='GetHtmlTemplate',
    full_name='escposService.EscPosService.GetHtmlTemplate',
    index=5,
    containing_service=None,
    input_type=_GETHTMLTEMPLATEREQUEST,
    output_type=_GETHTMLTEMPLATERESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='UpdateHtmlTemplate',
    full_name='escposService.EscPosService.UpdateHtmlTemplate',
    index=6,
    containing_service=None,
    input_type=_UPDATEHTMLTEMPLATEREQUEST,
    output_type=_UPDATEHTMLTEMPLATERESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='DeleteHtmlTemplates',
    full_name='escposService.EscPosService.DeleteHtmlTemplates',
    index=7,
    containing_service=None,
    input_type=_DELETEHTMLTEMPLATESREQUEST,
    output_type=_DELETEHTMLTEMPLATESRESPONSE,
    serialized_options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_ESCPOSSERVICE)

DESCRIPTOR.services_by_name['EscPosService'] = _ESCPOSSERVICE

# @@protoc_insertion_point(module_scope)
