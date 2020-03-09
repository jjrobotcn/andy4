# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: power.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='power.proto',
  package='powerService',
  syntax='proto3',
  serialized_options=None,
  serialized_pb=_b('\n\x0bpower.proto\x12\x0cpowerService\x1a\x1cgoogle/api/annotations.proto\"\x9a\x01\n\x0bPowerStatus\x12\r\n\x05level\x18\x01 \x01(\r\x12\x13\n\x0bis_charging\x18\x02 \x01(\x08\x12\x37\n\x07\x64\x65vices\x18\x03 \x03(\x0b\x32&.powerService.PowerStatus.DevicesEntry\x1a.\n\x0c\x44\x65vicesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\x08:\x02\x38\x01\"\x17\n\x15GetPowerStatusRequest\"I\n\x16GetPowerStatusResponse\x12/\n\x0cpower_status\x18\x01 \x01(\x0b\x32\x19.powerService.PowerStatus\"\x1c\n\rRebootRequest\x12\x0b\n\x03\x61ll\x18\x01 \x01(\x08\"\x10\n\x0eRebootResponse2\xfc\x01\n\x0cPowerService\x12\x85\x01\n\x0eGetPowerStatus\x12#.powerService.GetPowerStatusRequest\x1a$.powerService.GetPowerStatusResponse\"&\x82\xd3\xe4\x93\x02 \x12\x1e/api/v2/power/get_power_status0\x01\x12\x64\n\x06Reboot\x12\x1b.powerService.RebootRequest\x1a\x1c.powerService.RebootResponse\"\x1f\x82\xd3\xe4\x93\x02\x19\"\x14/api/v2/power/reboot:\x01*b\x06proto3')
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_POWERSTATUS_DEVICESENTRY = _descriptor.Descriptor(
  name='DevicesEntry',
  full_name='powerService.PowerStatus.DevicesEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='powerService.PowerStatus.DevicesEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='value', full_name='powerService.PowerStatus.DevicesEntry.value', index=1,
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
  serialized_options=_b('8\001'),
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=168,
  serialized_end=214,
)

_POWERSTATUS = _descriptor.Descriptor(
  name='PowerStatus',
  full_name='powerService.PowerStatus',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='level', full_name='powerService.PowerStatus.level', index=0,
      number=1, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='is_charging', full_name='powerService.PowerStatus.is_charging', index=1,
      number=2, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='devices', full_name='powerService.PowerStatus.devices', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[_POWERSTATUS_DEVICESENTRY, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=60,
  serialized_end=214,
)


_GETPOWERSTATUSREQUEST = _descriptor.Descriptor(
  name='GetPowerStatusRequest',
  full_name='powerService.GetPowerStatusRequest',
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
  serialized_start=216,
  serialized_end=239,
)


_GETPOWERSTATUSRESPONSE = _descriptor.Descriptor(
  name='GetPowerStatusResponse',
  full_name='powerService.GetPowerStatusResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='power_status', full_name='powerService.GetPowerStatusResponse.power_status', index=0,
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
  serialized_start=241,
  serialized_end=314,
)


_REBOOTREQUEST = _descriptor.Descriptor(
  name='RebootRequest',
  full_name='powerService.RebootRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='all', full_name='powerService.RebootRequest.all', index=0,
      number=1, type=8, cpp_type=7, label=1,
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
  serialized_start=316,
  serialized_end=344,
)


_REBOOTRESPONSE = _descriptor.Descriptor(
  name='RebootResponse',
  full_name='powerService.RebootResponse',
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
  serialized_start=346,
  serialized_end=362,
)

_POWERSTATUS_DEVICESENTRY.containing_type = _POWERSTATUS
_POWERSTATUS.fields_by_name['devices'].message_type = _POWERSTATUS_DEVICESENTRY
_GETPOWERSTATUSRESPONSE.fields_by_name['power_status'].message_type = _POWERSTATUS
DESCRIPTOR.message_types_by_name['PowerStatus'] = _POWERSTATUS
DESCRIPTOR.message_types_by_name['GetPowerStatusRequest'] = _GETPOWERSTATUSREQUEST
DESCRIPTOR.message_types_by_name['GetPowerStatusResponse'] = _GETPOWERSTATUSRESPONSE
DESCRIPTOR.message_types_by_name['RebootRequest'] = _REBOOTREQUEST
DESCRIPTOR.message_types_by_name['RebootResponse'] = _REBOOTRESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

PowerStatus = _reflection.GeneratedProtocolMessageType('PowerStatus', (_message.Message,), {

  'DevicesEntry' : _reflection.GeneratedProtocolMessageType('DevicesEntry', (_message.Message,), {
    'DESCRIPTOR' : _POWERSTATUS_DEVICESENTRY,
    '__module__' : 'power_pb2'
    # @@protoc_insertion_point(class_scope:powerService.PowerStatus.DevicesEntry)
    })
  ,
  'DESCRIPTOR' : _POWERSTATUS,
  '__module__' : 'power_pb2'
  # @@protoc_insertion_point(class_scope:powerService.PowerStatus)
  })
_sym_db.RegisterMessage(PowerStatus)
_sym_db.RegisterMessage(PowerStatus.DevicesEntry)

GetPowerStatusRequest = _reflection.GeneratedProtocolMessageType('GetPowerStatusRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETPOWERSTATUSREQUEST,
  '__module__' : 'power_pb2'
  # @@protoc_insertion_point(class_scope:powerService.GetPowerStatusRequest)
  })
_sym_db.RegisterMessage(GetPowerStatusRequest)

GetPowerStatusResponse = _reflection.GeneratedProtocolMessageType('GetPowerStatusResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETPOWERSTATUSRESPONSE,
  '__module__' : 'power_pb2'
  # @@protoc_insertion_point(class_scope:powerService.GetPowerStatusResponse)
  })
_sym_db.RegisterMessage(GetPowerStatusResponse)

RebootRequest = _reflection.GeneratedProtocolMessageType('RebootRequest', (_message.Message,), {
  'DESCRIPTOR' : _REBOOTREQUEST,
  '__module__' : 'power_pb2'
  # @@protoc_insertion_point(class_scope:powerService.RebootRequest)
  })
_sym_db.RegisterMessage(RebootRequest)

RebootResponse = _reflection.GeneratedProtocolMessageType('RebootResponse', (_message.Message,), {
  'DESCRIPTOR' : _REBOOTRESPONSE,
  '__module__' : 'power_pb2'
  # @@protoc_insertion_point(class_scope:powerService.RebootResponse)
  })
_sym_db.RegisterMessage(RebootResponse)


_POWERSTATUS_DEVICESENTRY._options = None

_POWERSERVICE = _descriptor.ServiceDescriptor(
  name='PowerService',
  full_name='powerService.PowerService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=365,
  serialized_end=617,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetPowerStatus',
    full_name='powerService.PowerService.GetPowerStatus',
    index=0,
    containing_service=None,
    input_type=_GETPOWERSTATUSREQUEST,
    output_type=_GETPOWERSTATUSRESPONSE,
    serialized_options=_b('\202\323\344\223\002 \022\036/api/v2/power/get_power_status'),
  ),
  _descriptor.MethodDescriptor(
    name='Reboot',
    full_name='powerService.PowerService.Reboot',
    index=1,
    containing_service=None,
    input_type=_REBOOTREQUEST,
    output_type=_REBOOTRESPONSE,
    serialized_options=_b('\202\323\344\223\002\031\"\024/api/v2/power/reboot:\001*'),
  ),
])
_sym_db.RegisterServiceDescriptor(_POWERSERVICE)

DESCRIPTOR.services_by_name['PowerService'] = _POWERSERVICE

# @@protoc_insertion_point(module_scope)
