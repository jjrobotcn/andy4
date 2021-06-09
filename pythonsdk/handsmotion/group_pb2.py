# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: group.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from . import capability_pb2 as capability__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='group.proto',
  package='handsmotion',
  syntax='proto3',
  serialized_options=b'\n\036com.jjrobot.andy4.handmotionpbB\030HandMotionGroupServicePBZ\014handmotionpb',
  serialized_pb=b'\n\x0bgroup.proto\x12\x0bhandsmotion\x1a\x10\x63\x61pability.proto\"&\n\nMotionMeta\x12\n\n\x02id\x18\x01 \x01(\t\x12\x0c\n\x04name\x18\x02 \x01(\t\"%\n\x15NewMotionGroupRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\"A\n\x16NewMotionGroupResponse\x12\'\n\x06motion\x18\x01 \x01(\x0b\x32\x17.handsmotion.MotionMeta\"\x19\n\x17ListMotionGroupsRequest\"D\n\x18ListMotionGroupsResponse\x12(\n\x07motions\x18\x01 \x03(\x0b\x32\x17.handsmotion.MotionMeta\"&\n\x18\x44\x65leteMotionGroupRequest\x12\n\n\x02id\x18\x01 \x01(\t\"\x1b\n\x19\x44\x65leteMotionGroupResponse\"#\n\x15GetMotionGroupRequest\x12\n\n\x02id\x18\x01 \x01(\t\"m\n\x16GetMotionGroupResponse\x12%\n\x04meta\x18\x01 \x01(\x0b\x32\x17.handsmotion.MotionMeta\x12,\n\x07scripts\x18\x02 \x03(\x0b\x32\x1b.handsmotion.MovementScript\"B\n\x17UpdateMotionMetaRequest\x12\'\n\x06motion\x18\x02 \x01(\x0b\x32\x17.handsmotion.MotionMeta\"\x1a\n\x18UpdateMotionMetaResponse\"V\n\x1aUpdateMotionScriptsRequest\x12\n\n\x02id\x18\x01 \x01(\t\x12,\n\x07scripts\x18\x02 \x03(\x0b\x32\x1b.handsmotion.MovementScript\"\x1d\n\x1bUpdateMotionScriptsResponse2\xed\x04\n\x0fGroupManagement\x12[\n\x0eNewMotionGroup\x12\".handsmotion.NewMotionGroupRequest\x1a#.handsmotion.NewMotionGroupResponse\"\x00\x12\x61\n\x10ListMotionGroups\x12$.handsmotion.ListMotionGroupsRequest\x1a%.handsmotion.ListMotionGroupsResponse\"\x00\x12\x64\n\x11\x44\x65leteMotionGroup\x12%.handsmotion.DeleteMotionGroupRequest\x1a&.handsmotion.DeleteMotionGroupResponse\"\x00\x12[\n\x0eGetMotionGroup\x12\".handsmotion.GetMotionGroupRequest\x1a#.handsmotion.GetMotionGroupResponse\"\x00\x12\x66\n\x15UpdateMotionGroupMeta\x12$.handsmotion.UpdateMotionMetaRequest\x1a%.handsmotion.UpdateMotionMetaResponse\"\x00\x12o\n\x18UpdateMotionGroupScripts\x12\'.handsmotion.UpdateMotionScriptsRequest\x1a(.handsmotion.UpdateMotionScriptsResponse\"\x00\x42H\n\x1e\x63om.jjrobot.andy4.handmotionpbB\x18HandMotionGroupServicePBZ\x0chandmotionpbb\x06proto3'
  ,
  dependencies=[capability__pb2.DESCRIPTOR,])




_MOTIONMETA = _descriptor.Descriptor(
  name='MotionMeta',
  full_name='handsmotion.MotionMeta',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='handsmotion.MotionMeta.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='name', full_name='handsmotion.MotionMeta.name', index=1,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=46,
  serialized_end=84,
)


_NEWMOTIONGROUPREQUEST = _descriptor.Descriptor(
  name='NewMotionGroupRequest',
  full_name='handsmotion.NewMotionGroupRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='handsmotion.NewMotionGroupRequest.name', index=0,
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
  serialized_start=86,
  serialized_end=123,
)


_NEWMOTIONGROUPRESPONSE = _descriptor.Descriptor(
  name='NewMotionGroupResponse',
  full_name='handsmotion.NewMotionGroupResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='motion', full_name='handsmotion.NewMotionGroupResponse.motion', index=0,
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
  serialized_start=125,
  serialized_end=190,
)


_LISTMOTIONGROUPSREQUEST = _descriptor.Descriptor(
  name='ListMotionGroupsRequest',
  full_name='handsmotion.ListMotionGroupsRequest',
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
  serialized_start=192,
  serialized_end=217,
)


_LISTMOTIONGROUPSRESPONSE = _descriptor.Descriptor(
  name='ListMotionGroupsResponse',
  full_name='handsmotion.ListMotionGroupsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='motions', full_name='handsmotion.ListMotionGroupsResponse.motions', index=0,
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
  serialized_start=219,
  serialized_end=287,
)


_DELETEMOTIONGROUPREQUEST = _descriptor.Descriptor(
  name='DeleteMotionGroupRequest',
  full_name='handsmotion.DeleteMotionGroupRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='handsmotion.DeleteMotionGroupRequest.id', index=0,
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
  serialized_end=327,
)


_DELETEMOTIONGROUPRESPONSE = _descriptor.Descriptor(
  name='DeleteMotionGroupResponse',
  full_name='handsmotion.DeleteMotionGroupResponse',
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
  serialized_start=329,
  serialized_end=356,
)


_GETMOTIONGROUPREQUEST = _descriptor.Descriptor(
  name='GetMotionGroupRequest',
  full_name='handsmotion.GetMotionGroupRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='handsmotion.GetMotionGroupRequest.id', index=0,
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
  serialized_start=358,
  serialized_end=393,
)


_GETMOTIONGROUPRESPONSE = _descriptor.Descriptor(
  name='GetMotionGroupResponse',
  full_name='handsmotion.GetMotionGroupResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='meta', full_name='handsmotion.GetMotionGroupResponse.meta', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='scripts', full_name='handsmotion.GetMotionGroupResponse.scripts', index=1,
      number=2, type=11, cpp_type=10, label=3,
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
  serialized_start=395,
  serialized_end=504,
)


_UPDATEMOTIONMETAREQUEST = _descriptor.Descriptor(
  name='UpdateMotionMetaRequest',
  full_name='handsmotion.UpdateMotionMetaRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='motion', full_name='handsmotion.UpdateMotionMetaRequest.motion', index=0,
      number=2, type=11, cpp_type=10, label=1,
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
  serialized_start=506,
  serialized_end=572,
)


_UPDATEMOTIONMETARESPONSE = _descriptor.Descriptor(
  name='UpdateMotionMetaResponse',
  full_name='handsmotion.UpdateMotionMetaResponse',
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
  serialized_start=574,
  serialized_end=600,
)


_UPDATEMOTIONSCRIPTSREQUEST = _descriptor.Descriptor(
  name='UpdateMotionScriptsRequest',
  full_name='handsmotion.UpdateMotionScriptsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='handsmotion.UpdateMotionScriptsRequest.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='scripts', full_name='handsmotion.UpdateMotionScriptsRequest.scripts', index=1,
      number=2, type=11, cpp_type=10, label=3,
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
  serialized_start=602,
  serialized_end=688,
)


_UPDATEMOTIONSCRIPTSRESPONSE = _descriptor.Descriptor(
  name='UpdateMotionScriptsResponse',
  full_name='handsmotion.UpdateMotionScriptsResponse',
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
  serialized_start=690,
  serialized_end=719,
)

_NEWMOTIONGROUPRESPONSE.fields_by_name['motion'].message_type = _MOTIONMETA
_LISTMOTIONGROUPSRESPONSE.fields_by_name['motions'].message_type = _MOTIONMETA
_GETMOTIONGROUPRESPONSE.fields_by_name['meta'].message_type = _MOTIONMETA
_GETMOTIONGROUPRESPONSE.fields_by_name['scripts'].message_type = capability__pb2._MOVEMENTSCRIPT
_UPDATEMOTIONMETAREQUEST.fields_by_name['motion'].message_type = _MOTIONMETA
_UPDATEMOTIONSCRIPTSREQUEST.fields_by_name['scripts'].message_type = capability__pb2._MOVEMENTSCRIPT
DESCRIPTOR.message_types_by_name['MotionMeta'] = _MOTIONMETA
DESCRIPTOR.message_types_by_name['NewMotionGroupRequest'] = _NEWMOTIONGROUPREQUEST
DESCRIPTOR.message_types_by_name['NewMotionGroupResponse'] = _NEWMOTIONGROUPRESPONSE
DESCRIPTOR.message_types_by_name['ListMotionGroupsRequest'] = _LISTMOTIONGROUPSREQUEST
DESCRIPTOR.message_types_by_name['ListMotionGroupsResponse'] = _LISTMOTIONGROUPSRESPONSE
DESCRIPTOR.message_types_by_name['DeleteMotionGroupRequest'] = _DELETEMOTIONGROUPREQUEST
DESCRIPTOR.message_types_by_name['DeleteMotionGroupResponse'] = _DELETEMOTIONGROUPRESPONSE
DESCRIPTOR.message_types_by_name['GetMotionGroupRequest'] = _GETMOTIONGROUPREQUEST
DESCRIPTOR.message_types_by_name['GetMotionGroupResponse'] = _GETMOTIONGROUPRESPONSE
DESCRIPTOR.message_types_by_name['UpdateMotionMetaRequest'] = _UPDATEMOTIONMETAREQUEST
DESCRIPTOR.message_types_by_name['UpdateMotionMetaResponse'] = _UPDATEMOTIONMETARESPONSE
DESCRIPTOR.message_types_by_name['UpdateMotionScriptsRequest'] = _UPDATEMOTIONSCRIPTSREQUEST
DESCRIPTOR.message_types_by_name['UpdateMotionScriptsResponse'] = _UPDATEMOTIONSCRIPTSRESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

MotionMeta = _reflection.GeneratedProtocolMessageType('MotionMeta', (_message.Message,), {
  'DESCRIPTOR' : _MOTIONMETA,
  '__module__' : 'group_pb2'
  # @@protoc_insertion_point(class_scope:handsmotion.MotionMeta)
  })
_sym_db.RegisterMessage(MotionMeta)

NewMotionGroupRequest = _reflection.GeneratedProtocolMessageType('NewMotionGroupRequest', (_message.Message,), {
  'DESCRIPTOR' : _NEWMOTIONGROUPREQUEST,
  '__module__' : 'group_pb2'
  # @@protoc_insertion_point(class_scope:handsmotion.NewMotionGroupRequest)
  })
_sym_db.RegisterMessage(NewMotionGroupRequest)

NewMotionGroupResponse = _reflection.GeneratedProtocolMessageType('NewMotionGroupResponse', (_message.Message,), {
  'DESCRIPTOR' : _NEWMOTIONGROUPRESPONSE,
  '__module__' : 'group_pb2'
  # @@protoc_insertion_point(class_scope:handsmotion.NewMotionGroupResponse)
  })
_sym_db.RegisterMessage(NewMotionGroupResponse)

ListMotionGroupsRequest = _reflection.GeneratedProtocolMessageType('ListMotionGroupsRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTMOTIONGROUPSREQUEST,
  '__module__' : 'group_pb2'
  # @@protoc_insertion_point(class_scope:handsmotion.ListMotionGroupsRequest)
  })
_sym_db.RegisterMessage(ListMotionGroupsRequest)

ListMotionGroupsResponse = _reflection.GeneratedProtocolMessageType('ListMotionGroupsResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTMOTIONGROUPSRESPONSE,
  '__module__' : 'group_pb2'
  # @@protoc_insertion_point(class_scope:handsmotion.ListMotionGroupsResponse)
  })
_sym_db.RegisterMessage(ListMotionGroupsResponse)

DeleteMotionGroupRequest = _reflection.GeneratedProtocolMessageType('DeleteMotionGroupRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEMOTIONGROUPREQUEST,
  '__module__' : 'group_pb2'
  # @@protoc_insertion_point(class_scope:handsmotion.DeleteMotionGroupRequest)
  })
_sym_db.RegisterMessage(DeleteMotionGroupRequest)

DeleteMotionGroupResponse = _reflection.GeneratedProtocolMessageType('DeleteMotionGroupResponse', (_message.Message,), {
  'DESCRIPTOR' : _DELETEMOTIONGROUPRESPONSE,
  '__module__' : 'group_pb2'
  # @@protoc_insertion_point(class_scope:handsmotion.DeleteMotionGroupResponse)
  })
_sym_db.RegisterMessage(DeleteMotionGroupResponse)

GetMotionGroupRequest = _reflection.GeneratedProtocolMessageType('GetMotionGroupRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETMOTIONGROUPREQUEST,
  '__module__' : 'group_pb2'
  # @@protoc_insertion_point(class_scope:handsmotion.GetMotionGroupRequest)
  })
_sym_db.RegisterMessage(GetMotionGroupRequest)

GetMotionGroupResponse = _reflection.GeneratedProtocolMessageType('GetMotionGroupResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETMOTIONGROUPRESPONSE,
  '__module__' : 'group_pb2'
  # @@protoc_insertion_point(class_scope:handsmotion.GetMotionGroupResponse)
  })
_sym_db.RegisterMessage(GetMotionGroupResponse)

UpdateMotionMetaRequest = _reflection.GeneratedProtocolMessageType('UpdateMotionMetaRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEMOTIONMETAREQUEST,
  '__module__' : 'group_pb2'
  # @@protoc_insertion_point(class_scope:handsmotion.UpdateMotionMetaRequest)
  })
_sym_db.RegisterMessage(UpdateMotionMetaRequest)

UpdateMotionMetaResponse = _reflection.GeneratedProtocolMessageType('UpdateMotionMetaResponse', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEMOTIONMETARESPONSE,
  '__module__' : 'group_pb2'
  # @@protoc_insertion_point(class_scope:handsmotion.UpdateMotionMetaResponse)
  })
_sym_db.RegisterMessage(UpdateMotionMetaResponse)

UpdateMotionScriptsRequest = _reflection.GeneratedProtocolMessageType('UpdateMotionScriptsRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEMOTIONSCRIPTSREQUEST,
  '__module__' : 'group_pb2'
  # @@protoc_insertion_point(class_scope:handsmotion.UpdateMotionScriptsRequest)
  })
_sym_db.RegisterMessage(UpdateMotionScriptsRequest)

UpdateMotionScriptsResponse = _reflection.GeneratedProtocolMessageType('UpdateMotionScriptsResponse', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEMOTIONSCRIPTSRESPONSE,
  '__module__' : 'group_pb2'
  # @@protoc_insertion_point(class_scope:handsmotion.UpdateMotionScriptsResponse)
  })
_sym_db.RegisterMessage(UpdateMotionScriptsResponse)


DESCRIPTOR._options = None

_GROUPMANAGEMENT = _descriptor.ServiceDescriptor(
  name='GroupManagement',
  full_name='handsmotion.GroupManagement',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=722,
  serialized_end=1343,
  methods=[
  _descriptor.MethodDescriptor(
    name='NewMotionGroup',
    full_name='handsmotion.GroupManagement.NewMotionGroup',
    index=0,
    containing_service=None,
    input_type=_NEWMOTIONGROUPREQUEST,
    output_type=_NEWMOTIONGROUPRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='ListMotionGroups',
    full_name='handsmotion.GroupManagement.ListMotionGroups',
    index=1,
    containing_service=None,
    input_type=_LISTMOTIONGROUPSREQUEST,
    output_type=_LISTMOTIONGROUPSRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='DeleteMotionGroup',
    full_name='handsmotion.GroupManagement.DeleteMotionGroup',
    index=2,
    containing_service=None,
    input_type=_DELETEMOTIONGROUPREQUEST,
    output_type=_DELETEMOTIONGROUPRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='GetMotionGroup',
    full_name='handsmotion.GroupManagement.GetMotionGroup',
    index=3,
    containing_service=None,
    input_type=_GETMOTIONGROUPREQUEST,
    output_type=_GETMOTIONGROUPRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='UpdateMotionGroupMeta',
    full_name='handsmotion.GroupManagement.UpdateMotionGroupMeta',
    index=4,
    containing_service=None,
    input_type=_UPDATEMOTIONMETAREQUEST,
    output_type=_UPDATEMOTIONMETARESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='UpdateMotionGroupScripts',
    full_name='handsmotion.GroupManagement.UpdateMotionGroupScripts',
    index=5,
    containing_service=None,
    input_type=_UPDATEMOTIONSCRIPTSREQUEST,
    output_type=_UPDATEMOTIONSCRIPTSRESPONSE,
    serialized_options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_GROUPMANAGEMENT)

DESCRIPTOR.services_by_name['GroupManagement'] = _GROUPMANAGEMENT

# @@protoc_insertion_point(module_scope)