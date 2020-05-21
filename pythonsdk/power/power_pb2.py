# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: power.proto

from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='power.proto',
  package='powerService',
  syntax='proto3',
  serialized_options=b'\n\031com.jjrobot.andy4.powerpbB\016PowerServicePBZ\007powerpb',
  serialized_pb=b'\n\x0bpower.proto\x12\x0cpowerService\"\x9e\x01\n\x0bPowerStatus\x12\r\n\x05level\x18\x01 \x01(\r\x12\x13\n\x0bis_charging\x18\x02 \x01(\x08\x12;\n\x07\x64\x65vices\x18\x03 \x03(\x0b\x32&.powerService.PowerStatus.DevicesEntryB\x02\x18\x01\x1a.\n\x0c\x44\x65vicesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\x08:\x02\x38\x01\"\x17\n\x15GetPowerStatusRequest\"I\n\x16GetPowerStatusResponse\x12/\n\x0cpower_status\x18\x01 \x01(\x0b\x32\x19.powerService.PowerStatus\"\x1c\n\rRebootRequest\x12\x0b\n\x03\x61ll\x18\x01 \x01(\x08\"\x10\n\x0eRebootResponse\"f\n\x05State\x12)\n\x06module\x18\x01 \x01(\x0e\x32\x19.powerService.ModuleTypes\x12\r\n\x05is_on\x18\x02 \x01(\x08\x12\x11\n\toff_after\x18\x04 \x01(\x05\x12\x10\n\x08on_after\x18\x03 \x01(\x05\"\x0f\n\rStatesRequest\"5\n\x0eStatesResponse\x12#\n\x06states\x18\x01 \x03(\x0b\x32\x13.powerService.State\"\xa1\x01\n\rSwitchRequest\x12\x35\n\x08requests\x18\x01 \x03(\x0b\x32#.powerService.SwitchRequest.request\x1aY\n\x07request\x12)\n\x06module\x18\x01 \x01(\x0e\x32\x19.powerService.ModuleTypes\x12\x11\n\toff_after\x18\x04 \x01(\x05\x12\x10\n\x08on_after\x18\x03 \x01(\x05\"5\n\x0eSwitchResponse\x12#\n\x06states\x18\x01 \x03(\x0b\x32\x13.powerService.State*\xa4\x01\n\x0bModuleTypes\x12\x15\n\x11UnknownModuleType\x10\x00\x12\x08\n\x04Main\x10\x01\x12\n\n\x06\x45scPos\x10\x02\x12\n\n\x06Screen\x10\x03\x12\n\n\x06Sensor\x10\x04\x12\n\n\x06Speech\x10\x05\x12\n\n\x06Lights\x10\x06\x12\x0e\n\nExpression\x10\x07\x12\r\n\tNavigator\x10\x08\x12\n\n\x06Motion\x10\t\x12\r\n\tAmplifier\x10\n2\xc4\x02\n\x0cPowerService\x12_\n\x0eGetPowerStatus\x12#.powerService.GetPowerStatusRequest\x1a$.powerService.GetPowerStatusResponse\"\x00\x30\x01\x12\x45\n\x06Reboot\x12\x1b.powerService.RebootRequest\x1a\x1c.powerService.RebootResponse\"\x00\x12\x45\n\x06States\x12\x1b.powerService.StatesRequest\x1a\x1c.powerService.StatesResponse\"\x00\x12\x45\n\x06Switch\x12\x1b.powerService.SwitchRequest\x1a\x1c.powerService.SwitchResponse\"\x00\x42\x34\n\x19\x63om.jjrobot.andy4.powerpbB\x0ePowerServicePBZ\x07powerpbb\x06proto3'
)

_MODULETYPES = _descriptor.EnumDescriptor(
  name='ModuleTypes',
  full_name='powerService.ModuleTypes',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='UnknownModuleType', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='Main', index=1, number=1,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='EscPos', index=2, number=2,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='Screen', index=3, number=3,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='Sensor', index=4, number=4,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='Speech', index=5, number=5,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='Lights', index=6, number=6,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='Expression', index=7, number=7,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='Navigator', index=8, number=8,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='Motion', index=9, number=9,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='Amplifier', index=10, number=10,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=734,
  serialized_end=898,
)
_sym_db.RegisterEnumDescriptor(_MODULETYPES)

ModuleTypes = enum_type_wrapper.EnumTypeWrapper(_MODULETYPES)
UnknownModuleType = 0
Main = 1
EscPos = 2
Screen = 3
Sensor = 4
Speech = 5
Lights = 6
Expression = 7
Navigator = 8
Motion = 9
Amplifier = 10



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
      has_default_value=False, default_value=b"".decode('utf-8'),
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
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=142,
  serialized_end=188,
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
      serialized_options=b'\030\001', file=DESCRIPTOR),
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
  serialized_start=30,
  serialized_end=188,
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
  serialized_start=190,
  serialized_end=213,
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
  serialized_start=215,
  serialized_end=288,
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
  serialized_start=290,
  serialized_end=318,
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
  serialized_start=320,
  serialized_end=336,
)


_STATE = _descriptor.Descriptor(
  name='State',
  full_name='powerService.State',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='module', full_name='powerService.State.module', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='is_on', full_name='powerService.State.is_on', index=1,
      number=2, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='off_after', full_name='powerService.State.off_after', index=2,
      number=4, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='on_after', full_name='powerService.State.on_after', index=3,
      number=3, type=5, cpp_type=1, label=1,
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
  serialized_start=338,
  serialized_end=440,
)


_STATESREQUEST = _descriptor.Descriptor(
  name='StatesRequest',
  full_name='powerService.StatesRequest',
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
  serialized_start=442,
  serialized_end=457,
)


_STATESRESPONSE = _descriptor.Descriptor(
  name='StatesResponse',
  full_name='powerService.StatesResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='states', full_name='powerService.StatesResponse.states', index=0,
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
  serialized_start=459,
  serialized_end=512,
)


_SWITCHREQUEST_REQUEST = _descriptor.Descriptor(
  name='request',
  full_name='powerService.SwitchRequest.request',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='module', full_name='powerService.SwitchRequest.request.module', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='off_after', full_name='powerService.SwitchRequest.request.off_after', index=1,
      number=4, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='on_after', full_name='powerService.SwitchRequest.request.on_after', index=2,
      number=3, type=5, cpp_type=1, label=1,
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
  serialized_start=587,
  serialized_end=676,
)

_SWITCHREQUEST = _descriptor.Descriptor(
  name='SwitchRequest',
  full_name='powerService.SwitchRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='requests', full_name='powerService.SwitchRequest.requests', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[_SWITCHREQUEST_REQUEST, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=515,
  serialized_end=676,
)


_SWITCHRESPONSE = _descriptor.Descriptor(
  name='SwitchResponse',
  full_name='powerService.SwitchResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='states', full_name='powerService.SwitchResponse.states', index=0,
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
  serialized_start=678,
  serialized_end=731,
)

_POWERSTATUS_DEVICESENTRY.containing_type = _POWERSTATUS
_POWERSTATUS.fields_by_name['devices'].message_type = _POWERSTATUS_DEVICESENTRY
_GETPOWERSTATUSRESPONSE.fields_by_name['power_status'].message_type = _POWERSTATUS
_STATE.fields_by_name['module'].enum_type = _MODULETYPES
_STATESRESPONSE.fields_by_name['states'].message_type = _STATE
_SWITCHREQUEST_REQUEST.fields_by_name['module'].enum_type = _MODULETYPES
_SWITCHREQUEST_REQUEST.containing_type = _SWITCHREQUEST
_SWITCHREQUEST.fields_by_name['requests'].message_type = _SWITCHREQUEST_REQUEST
_SWITCHRESPONSE.fields_by_name['states'].message_type = _STATE
DESCRIPTOR.message_types_by_name['PowerStatus'] = _POWERSTATUS
DESCRIPTOR.message_types_by_name['GetPowerStatusRequest'] = _GETPOWERSTATUSREQUEST
DESCRIPTOR.message_types_by_name['GetPowerStatusResponse'] = _GETPOWERSTATUSRESPONSE
DESCRIPTOR.message_types_by_name['RebootRequest'] = _REBOOTREQUEST
DESCRIPTOR.message_types_by_name['RebootResponse'] = _REBOOTRESPONSE
DESCRIPTOR.message_types_by_name['State'] = _STATE
DESCRIPTOR.message_types_by_name['StatesRequest'] = _STATESREQUEST
DESCRIPTOR.message_types_by_name['StatesResponse'] = _STATESRESPONSE
DESCRIPTOR.message_types_by_name['SwitchRequest'] = _SWITCHREQUEST
DESCRIPTOR.message_types_by_name['SwitchResponse'] = _SWITCHRESPONSE
DESCRIPTOR.enum_types_by_name['ModuleTypes'] = _MODULETYPES
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

State = _reflection.GeneratedProtocolMessageType('State', (_message.Message,), {
  'DESCRIPTOR' : _STATE,
  '__module__' : 'power_pb2'
  # @@protoc_insertion_point(class_scope:powerService.State)
  })
_sym_db.RegisterMessage(State)

StatesRequest = _reflection.GeneratedProtocolMessageType('StatesRequest', (_message.Message,), {
  'DESCRIPTOR' : _STATESREQUEST,
  '__module__' : 'power_pb2'
  # @@protoc_insertion_point(class_scope:powerService.StatesRequest)
  })
_sym_db.RegisterMessage(StatesRequest)

StatesResponse = _reflection.GeneratedProtocolMessageType('StatesResponse', (_message.Message,), {
  'DESCRIPTOR' : _STATESRESPONSE,
  '__module__' : 'power_pb2'
  # @@protoc_insertion_point(class_scope:powerService.StatesResponse)
  })
_sym_db.RegisterMessage(StatesResponse)

SwitchRequest = _reflection.GeneratedProtocolMessageType('SwitchRequest', (_message.Message,), {

  'request' : _reflection.GeneratedProtocolMessageType('request', (_message.Message,), {
    'DESCRIPTOR' : _SWITCHREQUEST_REQUEST,
    '__module__' : 'power_pb2'
    # @@protoc_insertion_point(class_scope:powerService.SwitchRequest.request)
    })
  ,
  'DESCRIPTOR' : _SWITCHREQUEST,
  '__module__' : 'power_pb2'
  # @@protoc_insertion_point(class_scope:powerService.SwitchRequest)
  })
_sym_db.RegisterMessage(SwitchRequest)
_sym_db.RegisterMessage(SwitchRequest.request)

SwitchResponse = _reflection.GeneratedProtocolMessageType('SwitchResponse', (_message.Message,), {
  'DESCRIPTOR' : _SWITCHRESPONSE,
  '__module__' : 'power_pb2'
  # @@protoc_insertion_point(class_scope:powerService.SwitchResponse)
  })
_sym_db.RegisterMessage(SwitchResponse)


DESCRIPTOR._options = None
_POWERSTATUS_DEVICESENTRY._options = None
_POWERSTATUS.fields_by_name['devices']._options = None

_POWERSERVICE = _descriptor.ServiceDescriptor(
  name='PowerService',
  full_name='powerService.PowerService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=901,
  serialized_end=1225,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetPowerStatus',
    full_name='powerService.PowerService.GetPowerStatus',
    index=0,
    containing_service=None,
    input_type=_GETPOWERSTATUSREQUEST,
    output_type=_GETPOWERSTATUSRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='Reboot',
    full_name='powerService.PowerService.Reboot',
    index=1,
    containing_service=None,
    input_type=_REBOOTREQUEST,
    output_type=_REBOOTRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='States',
    full_name='powerService.PowerService.States',
    index=2,
    containing_service=None,
    input_type=_STATESREQUEST,
    output_type=_STATESRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='Switch',
    full_name='powerService.PowerService.Switch',
    index=3,
    containing_service=None,
    input_type=_SWITCHREQUEST,
    output_type=_SWITCHRESPONSE,
    serialized_options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_POWERSERVICE)

DESCRIPTOR.services_by_name['PowerService'] = _POWERSERVICE

# @@protoc_insertion_point(module_scope)