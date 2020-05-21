# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: xcodescanner.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='xcodescanner.proto',
  package='xcScannerService',
  syntax='proto3',
  serialized_options=b'\n com.jjrobot.andy4.xcodescannerpbB\025XCodeScannerServicePBZ\016xcodescannerpb',
  serialized_pb=b'\n\x12xcodescanner.proto\x12\x10xcScannerService\"\x14\n\x12GetScanDataRequest\"&\n\x13GetScanDataResponse\x12\x0f\n\x07\x63ontent\x18\x01 \x01(\t2u\n\x13XCodeScannerService\x12^\n\x0bGetScanData\x12$.xcScannerService.GetScanDataRequest\x1a%.xcScannerService.GetScanDataResponse\"\x00\x30\x01\x42I\n com.jjrobot.andy4.xcodescannerpbB\x15XCodeScannerServicePBZ\x0excodescannerpbb\x06proto3'
)




_GETSCANDATAREQUEST = _descriptor.Descriptor(
  name='GetScanDataRequest',
  full_name='xcScannerService.GetScanDataRequest',
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
  serialized_start=40,
  serialized_end=60,
)


_GETSCANDATARESPONSE = _descriptor.Descriptor(
  name='GetScanDataResponse',
  full_name='xcScannerService.GetScanDataResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='content', full_name='xcScannerService.GetScanDataResponse.content', index=0,
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
  serialized_start=62,
  serialized_end=100,
)

DESCRIPTOR.message_types_by_name['GetScanDataRequest'] = _GETSCANDATAREQUEST
DESCRIPTOR.message_types_by_name['GetScanDataResponse'] = _GETSCANDATARESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetScanDataRequest = _reflection.GeneratedProtocolMessageType('GetScanDataRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETSCANDATAREQUEST,
  '__module__' : 'xcodescanner_pb2'
  # @@protoc_insertion_point(class_scope:xcScannerService.GetScanDataRequest)
  })
_sym_db.RegisterMessage(GetScanDataRequest)

GetScanDataResponse = _reflection.GeneratedProtocolMessageType('GetScanDataResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETSCANDATARESPONSE,
  '__module__' : 'xcodescanner_pb2'
  # @@protoc_insertion_point(class_scope:xcScannerService.GetScanDataResponse)
  })
_sym_db.RegisterMessage(GetScanDataResponse)


DESCRIPTOR._options = None

_XCODESCANNERSERVICE = _descriptor.ServiceDescriptor(
  name='XCodeScannerService',
  full_name='xcScannerService.XCodeScannerService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=102,
  serialized_end=219,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetScanData',
    full_name='xcScannerService.XCodeScannerService.GetScanData',
    index=0,
    containing_service=None,
    input_type=_GETSCANDATAREQUEST,
    output_type=_GETSCANDATARESPONSE,
    serialized_options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_XCODESCANNERSERVICE)

DESCRIPTOR.services_by_name['XCodeScannerService'] = _XCODESCANNERSERVICE

# @@protoc_insertion_point(module_scope)
