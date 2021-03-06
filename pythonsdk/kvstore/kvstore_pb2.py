# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kvstore.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='kvstore.proto',
  package='kvstore',
  syntax='proto3',
  serialized_options=b'\n\033com.jjrobot.andy4.kvstorepbB\tKVStorePBZ\tkvstorepb',
  serialized_pb=b'\n\rkvstore.proto\x12\x07kvstore\"(\n\nPutRequest\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\x0c\"\r\n\x0bPutResponse\"\x19\n\nGetRequest\x12\x0b\n\x03key\x18\x01 \x01(\t\"\x1c\n\x0bGetResponse\x12\r\n\x05value\x18\x01 \x01(\x0c\"&\n\x10GetPrefixRequest\x12\x12\n\nkey_prefix\x18\x01 \x01(\t\"k\n\x11GetPrefixResponse\x12\x31\n\x07matches\x18\x01 \x03(\x0b\x32 .kvstore.GetPrefixResponse.Match\x1a#\n\x05Match\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\x0c\",\n\x16GetPrefixStreamRequest\x12\x12\n\nkey_prefix\x18\x01 \x01(\t\"5\n\x17GetPrefixStreamResponse\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\x0c\"\x1c\n\rDeleteRequest\x12\x0b\n\x03key\x18\x01 \x01(\t\"\x10\n\x0e\x44\x65leteResponse2\xce\x02\n\x07KVStore\x12\x32\n\x03Put\x12\x13.kvstore.PutRequest\x1a\x14.kvstore.PutResponse\"\x00\x12\x32\n\x03Get\x12\x13.kvstore.GetRequest\x1a\x14.kvstore.GetResponse\"\x00\x12\x44\n\tGetPrefix\x12\x19.kvstore.GetPrefixRequest\x1a\x1a.kvstore.GetPrefixResponse\"\x00\x12X\n\x0fGetPrefixStream\x12\x1f.kvstore.GetPrefixStreamRequest\x1a .kvstore.GetPrefixStreamResponse\"\x00\x30\x01\x12;\n\x06\x44\x65lete\x12\x16.kvstore.DeleteRequest\x1a\x17.kvstore.DeleteResponse\"\x00\x42\x33\n\x1b\x63om.jjrobot.andy4.kvstorepbB\tKVStorePBZ\tkvstorepbb\x06proto3'
)




_PUTREQUEST = _descriptor.Descriptor(
  name='PutRequest',
  full_name='kvstore.PutRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='kvstore.PutRequest.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='value', full_name='kvstore.PutRequest.value', index=1,
      number=2, type=12, cpp_type=9, label=1,
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
  serialized_start=26,
  serialized_end=66,
)


_PUTRESPONSE = _descriptor.Descriptor(
  name='PutResponse',
  full_name='kvstore.PutResponse',
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
  serialized_start=68,
  serialized_end=81,
)


_GETREQUEST = _descriptor.Descriptor(
  name='GetRequest',
  full_name='kvstore.GetRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='kvstore.GetRequest.key', index=0,
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
  serialized_start=83,
  serialized_end=108,
)


_GETRESPONSE = _descriptor.Descriptor(
  name='GetResponse',
  full_name='kvstore.GetResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='value', full_name='kvstore.GetResponse.value', index=0,
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
  serialized_start=110,
  serialized_end=138,
)


_GETPREFIXREQUEST = _descriptor.Descriptor(
  name='GetPrefixRequest',
  full_name='kvstore.GetPrefixRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='key_prefix', full_name='kvstore.GetPrefixRequest.key_prefix', index=0,
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
  serialized_start=140,
  serialized_end=178,
)


_GETPREFIXRESPONSE_MATCH = _descriptor.Descriptor(
  name='Match',
  full_name='kvstore.GetPrefixResponse.Match',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='kvstore.GetPrefixResponse.Match.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='value', full_name='kvstore.GetPrefixResponse.Match.value', index=1,
      number=2, type=12, cpp_type=9, label=1,
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
  serialized_start=252,
  serialized_end=287,
)

_GETPREFIXRESPONSE = _descriptor.Descriptor(
  name='GetPrefixResponse',
  full_name='kvstore.GetPrefixResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='matches', full_name='kvstore.GetPrefixResponse.matches', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[_GETPREFIXRESPONSE_MATCH, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=180,
  serialized_end=287,
)


_GETPREFIXSTREAMREQUEST = _descriptor.Descriptor(
  name='GetPrefixStreamRequest',
  full_name='kvstore.GetPrefixStreamRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='key_prefix', full_name='kvstore.GetPrefixStreamRequest.key_prefix', index=0,
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
  serialized_start=289,
  serialized_end=333,
)


_GETPREFIXSTREAMRESPONSE = _descriptor.Descriptor(
  name='GetPrefixStreamResponse',
  full_name='kvstore.GetPrefixStreamResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='kvstore.GetPrefixStreamResponse.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='value', full_name='kvstore.GetPrefixStreamResponse.value', index=1,
      number=2, type=12, cpp_type=9, label=1,
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
  serialized_start=335,
  serialized_end=388,
)


_DELETEREQUEST = _descriptor.Descriptor(
  name='DeleteRequest',
  full_name='kvstore.DeleteRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='kvstore.DeleteRequest.key', index=0,
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
  serialized_start=390,
  serialized_end=418,
)


_DELETERESPONSE = _descriptor.Descriptor(
  name='DeleteResponse',
  full_name='kvstore.DeleteResponse',
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
  serialized_start=420,
  serialized_end=436,
)

_GETPREFIXRESPONSE_MATCH.containing_type = _GETPREFIXRESPONSE
_GETPREFIXRESPONSE.fields_by_name['matches'].message_type = _GETPREFIXRESPONSE_MATCH
DESCRIPTOR.message_types_by_name['PutRequest'] = _PUTREQUEST
DESCRIPTOR.message_types_by_name['PutResponse'] = _PUTRESPONSE
DESCRIPTOR.message_types_by_name['GetRequest'] = _GETREQUEST
DESCRIPTOR.message_types_by_name['GetResponse'] = _GETRESPONSE
DESCRIPTOR.message_types_by_name['GetPrefixRequest'] = _GETPREFIXREQUEST
DESCRIPTOR.message_types_by_name['GetPrefixResponse'] = _GETPREFIXRESPONSE
DESCRIPTOR.message_types_by_name['GetPrefixStreamRequest'] = _GETPREFIXSTREAMREQUEST
DESCRIPTOR.message_types_by_name['GetPrefixStreamResponse'] = _GETPREFIXSTREAMRESPONSE
DESCRIPTOR.message_types_by_name['DeleteRequest'] = _DELETEREQUEST
DESCRIPTOR.message_types_by_name['DeleteResponse'] = _DELETERESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

PutRequest = _reflection.GeneratedProtocolMessageType('PutRequest', (_message.Message,), {
  'DESCRIPTOR' : _PUTREQUEST,
  '__module__' : 'kvstore_pb2'
  # @@protoc_insertion_point(class_scope:kvstore.PutRequest)
  })
_sym_db.RegisterMessage(PutRequest)

PutResponse = _reflection.GeneratedProtocolMessageType('PutResponse', (_message.Message,), {
  'DESCRIPTOR' : _PUTRESPONSE,
  '__module__' : 'kvstore_pb2'
  # @@protoc_insertion_point(class_scope:kvstore.PutResponse)
  })
_sym_db.RegisterMessage(PutResponse)

GetRequest = _reflection.GeneratedProtocolMessageType('GetRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETREQUEST,
  '__module__' : 'kvstore_pb2'
  # @@protoc_insertion_point(class_scope:kvstore.GetRequest)
  })
_sym_db.RegisterMessage(GetRequest)

GetResponse = _reflection.GeneratedProtocolMessageType('GetResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETRESPONSE,
  '__module__' : 'kvstore_pb2'
  # @@protoc_insertion_point(class_scope:kvstore.GetResponse)
  })
_sym_db.RegisterMessage(GetResponse)

GetPrefixRequest = _reflection.GeneratedProtocolMessageType('GetPrefixRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETPREFIXREQUEST,
  '__module__' : 'kvstore_pb2'
  # @@protoc_insertion_point(class_scope:kvstore.GetPrefixRequest)
  })
_sym_db.RegisterMessage(GetPrefixRequest)

GetPrefixResponse = _reflection.GeneratedProtocolMessageType('GetPrefixResponse', (_message.Message,), {

  'Match' : _reflection.GeneratedProtocolMessageType('Match', (_message.Message,), {
    'DESCRIPTOR' : _GETPREFIXRESPONSE_MATCH,
    '__module__' : 'kvstore_pb2'
    # @@protoc_insertion_point(class_scope:kvstore.GetPrefixResponse.Match)
    })
  ,
  'DESCRIPTOR' : _GETPREFIXRESPONSE,
  '__module__' : 'kvstore_pb2'
  # @@protoc_insertion_point(class_scope:kvstore.GetPrefixResponse)
  })
_sym_db.RegisterMessage(GetPrefixResponse)
_sym_db.RegisterMessage(GetPrefixResponse.Match)

GetPrefixStreamRequest = _reflection.GeneratedProtocolMessageType('GetPrefixStreamRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETPREFIXSTREAMREQUEST,
  '__module__' : 'kvstore_pb2'
  # @@protoc_insertion_point(class_scope:kvstore.GetPrefixStreamRequest)
  })
_sym_db.RegisterMessage(GetPrefixStreamRequest)

GetPrefixStreamResponse = _reflection.GeneratedProtocolMessageType('GetPrefixStreamResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETPREFIXSTREAMRESPONSE,
  '__module__' : 'kvstore_pb2'
  # @@protoc_insertion_point(class_scope:kvstore.GetPrefixStreamResponse)
  })
_sym_db.RegisterMessage(GetPrefixStreamResponse)

DeleteRequest = _reflection.GeneratedProtocolMessageType('DeleteRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEREQUEST,
  '__module__' : 'kvstore_pb2'
  # @@protoc_insertion_point(class_scope:kvstore.DeleteRequest)
  })
_sym_db.RegisterMessage(DeleteRequest)

DeleteResponse = _reflection.GeneratedProtocolMessageType('DeleteResponse', (_message.Message,), {
  'DESCRIPTOR' : _DELETERESPONSE,
  '__module__' : 'kvstore_pb2'
  # @@protoc_insertion_point(class_scope:kvstore.DeleteResponse)
  })
_sym_db.RegisterMessage(DeleteResponse)


DESCRIPTOR._options = None

_KVSTORE = _descriptor.ServiceDescriptor(
  name='KVStore',
  full_name='kvstore.KVStore',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=439,
  serialized_end=773,
  methods=[
  _descriptor.MethodDescriptor(
    name='Put',
    full_name='kvstore.KVStore.Put',
    index=0,
    containing_service=None,
    input_type=_PUTREQUEST,
    output_type=_PUTRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='Get',
    full_name='kvstore.KVStore.Get',
    index=1,
    containing_service=None,
    input_type=_GETREQUEST,
    output_type=_GETRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='GetPrefix',
    full_name='kvstore.KVStore.GetPrefix',
    index=2,
    containing_service=None,
    input_type=_GETPREFIXREQUEST,
    output_type=_GETPREFIXRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='GetPrefixStream',
    full_name='kvstore.KVStore.GetPrefixStream',
    index=3,
    containing_service=None,
    input_type=_GETPREFIXSTREAMREQUEST,
    output_type=_GETPREFIXSTREAMRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='Delete',
    full_name='kvstore.KVStore.Delete',
    index=4,
    containing_service=None,
    input_type=_DELETEREQUEST,
    output_type=_DELETERESPONSE,
    serialized_options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_KVSTORE)

DESCRIPTOR.services_by_name['KVStore'] = _KVSTORE

# @@protoc_insertion_point(module_scope)
