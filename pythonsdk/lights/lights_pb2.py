# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: lights.proto

from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='lights.proto',
  package='lightsService',
  syntax='proto3',
  serialized_options=b'\n\032com.jjrobot.andy4.lightspbB\017LightsServicePBZ\010lightspb',
  serialized_pb=b'\n\x0clights.proto\x12\rlightsService\"!\n\x13PreviewLightRequest\x12\n\n\x02id\x18\x01 \x01(\t\"\x16\n\x14PreviewLightResponse\"U\n\x10PlayLightRequest\x12\'\n\x05ltype\x18\x01 \x01(\x0e\x32\x18.lightsService.LightType\x12\n\n\x02id\x18\x02 \x01(\t\x12\x0c\n\x04name\x18\x03 \x01(\t\"\x13\n\x11PlayLightResponse\"<\n\x10StopLightRequest\x12(\n\x06ltypes\x18\x01 \x03(\x0e\x32\x18.lightsService.LightType\"\x13\n\x11StopLightResponse\"y\n\tLightInfo\x12\'\n\x05ltype\x18\x01 \x01(\x0e\x32\x18.lightsService.LightType\x12\n\n\x02id\x18\x02 \x01(\t\x12\x0c\n\x04name\x18\x03 \x01(\t\x12)\n\x06\x66rames\x18\x04 \x03(\x0b\x32\x19.lightsService.LightFrame\"R\n\nLightFrame\x12\x0e\n\x06\x63olors\x18\x01 \x03(\t\x12\r\n\x05speed\x18\x02 \x01(\r\x12%\n\x04mode\x18\x03 \x01(\x0e\x32\x17.lightsService.PlayMode\"<\n\x11ListLightsRequest\x12\'\n\x05ltype\x18\x01 \x01(\x0e\x32\x18.lightsService.LightType\"C\n\x12ListLightsResponse\x12-\n\x0blights_info\x18\x01 \x03(\x0b\x32\x18.lightsService.LightInfo\"?\n\x0fNewLightRequest\x12,\n\nlight_info\x18\x01 \x01(\x0b\x32\x18.lightsService.LightInfo\"@\n\x10NewLightResponse\x12,\n\nlight_info\x18\x01 \x01(\x0b\x32\x18.lightsService.LightInfo\"B\n\x12UpdateLightRequest\x12,\n\nlight_info\x18\x01 \x01(\x0b\x32\x18.lightsService.LightInfo\"C\n\x13UpdateLightResponse\x12,\n\nlight_info\x18\x01 \x01(\x0b\x32\x18.lightsService.LightInfo\"(\n\x13\x44\x65leteLightsRequest\x12\x11\n\tlights_id\x18\x01 \x03(\t\"\x16\n\x14\x44\x65leteLightsResponse\"\x0e\n\x0cStateRequest\"6\n\rStateResponse\x12\x11\n\tis_active\x18\x01 \x01(\x08\x12\x12\n\nis_playing\x18\x02 \x01(\x08\"\x1f\n\rSwitchRequest\x12\x0e\n\x06\x61\x63tive\x18\x01 \x01(\x08\"#\n\x0eSwitchResponse\x12\x11\n\tis_active\x18\x01 \x01(\x08*:\n\tLightType\x12\r\n\tUNDEFINED\x10\x00\x12\t\n\x05MOUTH\x10\x01\x12\t\n\x05HANDS\x10\x02\x12\x08\n\x04\x45\x41RS\x10\x03*H\n\x08PlayMode\x12\n\n\x06PRESET\x10\x00\x12\n\n\x06\x41LWAYS\x10\x01\x12\x0b\n\x07MARQUEE\x10\x02\x12\t\n\x05\x46LASH\x10\x03\x12\x0c\n\x08TICKTOCK\x10\x04\x32\xf4\x05\n\rLightsService\x12Y\n\x0cPreviewLight\x12\".lightsService.PreviewLightRequest\x1a#.lightsService.PreviewLightResponse\"\x00\x12P\n\tPlayLight\x12\x1f.lightsService.PlayLightRequest\x1a .lightsService.PlayLightResponse\"\x00\x12P\n\tStopLight\x12\x1f.lightsService.StopLightRequest\x1a .lightsService.StopLightResponse\"\x00\x12S\n\nListLights\x12 .lightsService.ListLightsRequest\x1a!.lightsService.ListLightsResponse\"\x00\x12M\n\x08NewLight\x12\x1e.lightsService.NewLightRequest\x1a\x1f.lightsService.NewLightResponse\"\x00\x12V\n\x0bUpdateLight\x12!.lightsService.UpdateLightRequest\x1a\".lightsService.UpdateLightResponse\"\x00\x12Y\n\x0c\x44\x65leteLights\x12\".lightsService.DeleteLightsRequest\x1a#.lightsService.DeleteLightsResponse\"\x00\x12\x44\n\x05State\x12\x1b.lightsService.StateRequest\x1a\x1c.lightsService.StateResponse\"\x00\x12G\n\x06Switch\x12\x1c.lightsService.SwitchRequest\x1a\x1d.lightsService.SwitchResponse\"\x00\x42\x37\n\x1a\x63om.jjrobot.andy4.lightspbB\x0fLightsServicePBZ\x08lightspbb\x06proto3'
)

_LIGHTTYPE = _descriptor.EnumDescriptor(
  name='LightType',
  full_name='lightsService.LightType',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='UNDEFINED', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='MOUTH', index=1, number=1,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='HANDS', index=2, number=2,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='EARS', index=3, number=3,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1095,
  serialized_end=1153,
)
_sym_db.RegisterEnumDescriptor(_LIGHTTYPE)

LightType = enum_type_wrapper.EnumTypeWrapper(_LIGHTTYPE)
_PLAYMODE = _descriptor.EnumDescriptor(
  name='PlayMode',
  full_name='lightsService.PlayMode',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='PRESET', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='ALWAYS', index=1, number=1,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='MARQUEE', index=2, number=2,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='FLASH', index=3, number=3,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='TICKTOCK', index=4, number=4,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1155,
  serialized_end=1227,
)
_sym_db.RegisterEnumDescriptor(_PLAYMODE)

PlayMode = enum_type_wrapper.EnumTypeWrapper(_PLAYMODE)
UNDEFINED = 0
MOUTH = 1
HANDS = 2
EARS = 3
PRESET = 0
ALWAYS = 1
MARQUEE = 2
FLASH = 3
TICKTOCK = 4



_PREVIEWLIGHTREQUEST = _descriptor.Descriptor(
  name='PreviewLightRequest',
  full_name='lightsService.PreviewLightRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='lightsService.PreviewLightRequest.id', index=0,
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
  serialized_start=31,
  serialized_end=64,
)


_PREVIEWLIGHTRESPONSE = _descriptor.Descriptor(
  name='PreviewLightResponse',
  full_name='lightsService.PreviewLightResponse',
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
  serialized_start=66,
  serialized_end=88,
)


_PLAYLIGHTREQUEST = _descriptor.Descriptor(
  name='PlayLightRequest',
  full_name='lightsService.PlayLightRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='ltype', full_name='lightsService.PlayLightRequest.ltype', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='id', full_name='lightsService.PlayLightRequest.id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='name', full_name='lightsService.PlayLightRequest.name', index=2,
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
  serialized_start=90,
  serialized_end=175,
)


_PLAYLIGHTRESPONSE = _descriptor.Descriptor(
  name='PlayLightResponse',
  full_name='lightsService.PlayLightResponse',
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
  serialized_start=177,
  serialized_end=196,
)


_STOPLIGHTREQUEST = _descriptor.Descriptor(
  name='StopLightRequest',
  full_name='lightsService.StopLightRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='ltypes', full_name='lightsService.StopLightRequest.ltypes', index=0,
      number=1, type=14, cpp_type=8, label=3,
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
  serialized_start=198,
  serialized_end=258,
)


_STOPLIGHTRESPONSE = _descriptor.Descriptor(
  name='StopLightResponse',
  full_name='lightsService.StopLightResponse',
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
  serialized_start=260,
  serialized_end=279,
)


_LIGHTINFO = _descriptor.Descriptor(
  name='LightInfo',
  full_name='lightsService.LightInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='ltype', full_name='lightsService.LightInfo.ltype', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='id', full_name='lightsService.LightInfo.id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='name', full_name='lightsService.LightInfo.name', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='frames', full_name='lightsService.LightInfo.frames', index=3,
      number=4, type=11, cpp_type=10, label=3,
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
  serialized_start=281,
  serialized_end=402,
)


_LIGHTFRAME = _descriptor.Descriptor(
  name='LightFrame',
  full_name='lightsService.LightFrame',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='colors', full_name='lightsService.LightFrame.colors', index=0,
      number=1, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='speed', full_name='lightsService.LightFrame.speed', index=1,
      number=2, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='mode', full_name='lightsService.LightFrame.mode', index=2,
      number=3, type=14, cpp_type=8, label=1,
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
  serialized_start=404,
  serialized_end=486,
)


_LISTLIGHTSREQUEST = _descriptor.Descriptor(
  name='ListLightsRequest',
  full_name='lightsService.ListLightsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='ltype', full_name='lightsService.ListLightsRequest.ltype', index=0,
      number=1, type=14, cpp_type=8, label=1,
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
  serialized_start=488,
  serialized_end=548,
)


_LISTLIGHTSRESPONSE = _descriptor.Descriptor(
  name='ListLightsResponse',
  full_name='lightsService.ListLightsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='lights_info', full_name='lightsService.ListLightsResponse.lights_info', index=0,
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
  serialized_start=550,
  serialized_end=617,
)


_NEWLIGHTREQUEST = _descriptor.Descriptor(
  name='NewLightRequest',
  full_name='lightsService.NewLightRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='light_info', full_name='lightsService.NewLightRequest.light_info', index=0,
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
  serialized_start=619,
  serialized_end=682,
)


_NEWLIGHTRESPONSE = _descriptor.Descriptor(
  name='NewLightResponse',
  full_name='lightsService.NewLightResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='light_info', full_name='lightsService.NewLightResponse.light_info', index=0,
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
  serialized_start=684,
  serialized_end=748,
)


_UPDATELIGHTREQUEST = _descriptor.Descriptor(
  name='UpdateLightRequest',
  full_name='lightsService.UpdateLightRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='light_info', full_name='lightsService.UpdateLightRequest.light_info', index=0,
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
  serialized_start=750,
  serialized_end=816,
)


_UPDATELIGHTRESPONSE = _descriptor.Descriptor(
  name='UpdateLightResponse',
  full_name='lightsService.UpdateLightResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='light_info', full_name='lightsService.UpdateLightResponse.light_info', index=0,
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
  serialized_start=818,
  serialized_end=885,
)


_DELETELIGHTSREQUEST = _descriptor.Descriptor(
  name='DeleteLightsRequest',
  full_name='lightsService.DeleteLightsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='lights_id', full_name='lightsService.DeleteLightsRequest.lights_id', index=0,
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
  serialized_start=887,
  serialized_end=927,
)


_DELETELIGHTSRESPONSE = _descriptor.Descriptor(
  name='DeleteLightsResponse',
  full_name='lightsService.DeleteLightsResponse',
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
  serialized_start=929,
  serialized_end=951,
)


_STATEREQUEST = _descriptor.Descriptor(
  name='StateRequest',
  full_name='lightsService.StateRequest',
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
  serialized_start=953,
  serialized_end=967,
)


_STATERESPONSE = _descriptor.Descriptor(
  name='StateResponse',
  full_name='lightsService.StateResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='is_active', full_name='lightsService.StateResponse.is_active', index=0,
      number=1, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='is_playing', full_name='lightsService.StateResponse.is_playing', index=1,
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
  serialized_start=969,
  serialized_end=1023,
)


_SWITCHREQUEST = _descriptor.Descriptor(
  name='SwitchRequest',
  full_name='lightsService.SwitchRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='active', full_name='lightsService.SwitchRequest.active', index=0,
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
  serialized_start=1025,
  serialized_end=1056,
)


_SWITCHRESPONSE = _descriptor.Descriptor(
  name='SwitchResponse',
  full_name='lightsService.SwitchResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='is_active', full_name='lightsService.SwitchResponse.is_active', index=0,
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
  serialized_start=1058,
  serialized_end=1093,
)

_PLAYLIGHTREQUEST.fields_by_name['ltype'].enum_type = _LIGHTTYPE
_STOPLIGHTREQUEST.fields_by_name['ltypes'].enum_type = _LIGHTTYPE
_LIGHTINFO.fields_by_name['ltype'].enum_type = _LIGHTTYPE
_LIGHTINFO.fields_by_name['frames'].message_type = _LIGHTFRAME
_LIGHTFRAME.fields_by_name['mode'].enum_type = _PLAYMODE
_LISTLIGHTSREQUEST.fields_by_name['ltype'].enum_type = _LIGHTTYPE
_LISTLIGHTSRESPONSE.fields_by_name['lights_info'].message_type = _LIGHTINFO
_NEWLIGHTREQUEST.fields_by_name['light_info'].message_type = _LIGHTINFO
_NEWLIGHTRESPONSE.fields_by_name['light_info'].message_type = _LIGHTINFO
_UPDATELIGHTREQUEST.fields_by_name['light_info'].message_type = _LIGHTINFO
_UPDATELIGHTRESPONSE.fields_by_name['light_info'].message_type = _LIGHTINFO
DESCRIPTOR.message_types_by_name['PreviewLightRequest'] = _PREVIEWLIGHTREQUEST
DESCRIPTOR.message_types_by_name['PreviewLightResponse'] = _PREVIEWLIGHTRESPONSE
DESCRIPTOR.message_types_by_name['PlayLightRequest'] = _PLAYLIGHTREQUEST
DESCRIPTOR.message_types_by_name['PlayLightResponse'] = _PLAYLIGHTRESPONSE
DESCRIPTOR.message_types_by_name['StopLightRequest'] = _STOPLIGHTREQUEST
DESCRIPTOR.message_types_by_name['StopLightResponse'] = _STOPLIGHTRESPONSE
DESCRIPTOR.message_types_by_name['LightInfo'] = _LIGHTINFO
DESCRIPTOR.message_types_by_name['LightFrame'] = _LIGHTFRAME
DESCRIPTOR.message_types_by_name['ListLightsRequest'] = _LISTLIGHTSREQUEST
DESCRIPTOR.message_types_by_name['ListLightsResponse'] = _LISTLIGHTSRESPONSE
DESCRIPTOR.message_types_by_name['NewLightRequest'] = _NEWLIGHTREQUEST
DESCRIPTOR.message_types_by_name['NewLightResponse'] = _NEWLIGHTRESPONSE
DESCRIPTOR.message_types_by_name['UpdateLightRequest'] = _UPDATELIGHTREQUEST
DESCRIPTOR.message_types_by_name['UpdateLightResponse'] = _UPDATELIGHTRESPONSE
DESCRIPTOR.message_types_by_name['DeleteLightsRequest'] = _DELETELIGHTSREQUEST
DESCRIPTOR.message_types_by_name['DeleteLightsResponse'] = _DELETELIGHTSRESPONSE
DESCRIPTOR.message_types_by_name['StateRequest'] = _STATEREQUEST
DESCRIPTOR.message_types_by_name['StateResponse'] = _STATERESPONSE
DESCRIPTOR.message_types_by_name['SwitchRequest'] = _SWITCHREQUEST
DESCRIPTOR.message_types_by_name['SwitchResponse'] = _SWITCHRESPONSE
DESCRIPTOR.enum_types_by_name['LightType'] = _LIGHTTYPE
DESCRIPTOR.enum_types_by_name['PlayMode'] = _PLAYMODE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

PreviewLightRequest = _reflection.GeneratedProtocolMessageType('PreviewLightRequest', (_message.Message,), {
  'DESCRIPTOR' : _PREVIEWLIGHTREQUEST,
  '__module__' : 'lights_pb2'
  # @@protoc_insertion_point(class_scope:lightsService.PreviewLightRequest)
  })
_sym_db.RegisterMessage(PreviewLightRequest)

PreviewLightResponse = _reflection.GeneratedProtocolMessageType('PreviewLightResponse', (_message.Message,), {
  'DESCRIPTOR' : _PREVIEWLIGHTRESPONSE,
  '__module__' : 'lights_pb2'
  # @@protoc_insertion_point(class_scope:lightsService.PreviewLightResponse)
  })
_sym_db.RegisterMessage(PreviewLightResponse)

PlayLightRequest = _reflection.GeneratedProtocolMessageType('PlayLightRequest', (_message.Message,), {
  'DESCRIPTOR' : _PLAYLIGHTREQUEST,
  '__module__' : 'lights_pb2'
  # @@protoc_insertion_point(class_scope:lightsService.PlayLightRequest)
  })
_sym_db.RegisterMessage(PlayLightRequest)

PlayLightResponse = _reflection.GeneratedProtocolMessageType('PlayLightResponse', (_message.Message,), {
  'DESCRIPTOR' : _PLAYLIGHTRESPONSE,
  '__module__' : 'lights_pb2'
  # @@protoc_insertion_point(class_scope:lightsService.PlayLightResponse)
  })
_sym_db.RegisterMessage(PlayLightResponse)

StopLightRequest = _reflection.GeneratedProtocolMessageType('StopLightRequest', (_message.Message,), {
  'DESCRIPTOR' : _STOPLIGHTREQUEST,
  '__module__' : 'lights_pb2'
  # @@protoc_insertion_point(class_scope:lightsService.StopLightRequest)
  })
_sym_db.RegisterMessage(StopLightRequest)

StopLightResponse = _reflection.GeneratedProtocolMessageType('StopLightResponse', (_message.Message,), {
  'DESCRIPTOR' : _STOPLIGHTRESPONSE,
  '__module__' : 'lights_pb2'
  # @@protoc_insertion_point(class_scope:lightsService.StopLightResponse)
  })
_sym_db.RegisterMessage(StopLightResponse)

LightInfo = _reflection.GeneratedProtocolMessageType('LightInfo', (_message.Message,), {
  'DESCRIPTOR' : _LIGHTINFO,
  '__module__' : 'lights_pb2'
  # @@protoc_insertion_point(class_scope:lightsService.LightInfo)
  })
_sym_db.RegisterMessage(LightInfo)

LightFrame = _reflection.GeneratedProtocolMessageType('LightFrame', (_message.Message,), {
  'DESCRIPTOR' : _LIGHTFRAME,
  '__module__' : 'lights_pb2'
  # @@protoc_insertion_point(class_scope:lightsService.LightFrame)
  })
_sym_db.RegisterMessage(LightFrame)

ListLightsRequest = _reflection.GeneratedProtocolMessageType('ListLightsRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTLIGHTSREQUEST,
  '__module__' : 'lights_pb2'
  # @@protoc_insertion_point(class_scope:lightsService.ListLightsRequest)
  })
_sym_db.RegisterMessage(ListLightsRequest)

ListLightsResponse = _reflection.GeneratedProtocolMessageType('ListLightsResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTLIGHTSRESPONSE,
  '__module__' : 'lights_pb2'
  # @@protoc_insertion_point(class_scope:lightsService.ListLightsResponse)
  })
_sym_db.RegisterMessage(ListLightsResponse)

NewLightRequest = _reflection.GeneratedProtocolMessageType('NewLightRequest', (_message.Message,), {
  'DESCRIPTOR' : _NEWLIGHTREQUEST,
  '__module__' : 'lights_pb2'
  # @@protoc_insertion_point(class_scope:lightsService.NewLightRequest)
  })
_sym_db.RegisterMessage(NewLightRequest)

NewLightResponse = _reflection.GeneratedProtocolMessageType('NewLightResponse', (_message.Message,), {
  'DESCRIPTOR' : _NEWLIGHTRESPONSE,
  '__module__' : 'lights_pb2'
  # @@protoc_insertion_point(class_scope:lightsService.NewLightResponse)
  })
_sym_db.RegisterMessage(NewLightResponse)

UpdateLightRequest = _reflection.GeneratedProtocolMessageType('UpdateLightRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATELIGHTREQUEST,
  '__module__' : 'lights_pb2'
  # @@protoc_insertion_point(class_scope:lightsService.UpdateLightRequest)
  })
_sym_db.RegisterMessage(UpdateLightRequest)

UpdateLightResponse = _reflection.GeneratedProtocolMessageType('UpdateLightResponse', (_message.Message,), {
  'DESCRIPTOR' : _UPDATELIGHTRESPONSE,
  '__module__' : 'lights_pb2'
  # @@protoc_insertion_point(class_scope:lightsService.UpdateLightResponse)
  })
_sym_db.RegisterMessage(UpdateLightResponse)

DeleteLightsRequest = _reflection.GeneratedProtocolMessageType('DeleteLightsRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETELIGHTSREQUEST,
  '__module__' : 'lights_pb2'
  # @@protoc_insertion_point(class_scope:lightsService.DeleteLightsRequest)
  })
_sym_db.RegisterMessage(DeleteLightsRequest)

DeleteLightsResponse = _reflection.GeneratedProtocolMessageType('DeleteLightsResponse', (_message.Message,), {
  'DESCRIPTOR' : _DELETELIGHTSRESPONSE,
  '__module__' : 'lights_pb2'
  # @@protoc_insertion_point(class_scope:lightsService.DeleteLightsResponse)
  })
_sym_db.RegisterMessage(DeleteLightsResponse)

StateRequest = _reflection.GeneratedProtocolMessageType('StateRequest', (_message.Message,), {
  'DESCRIPTOR' : _STATEREQUEST,
  '__module__' : 'lights_pb2'
  # @@protoc_insertion_point(class_scope:lightsService.StateRequest)
  })
_sym_db.RegisterMessage(StateRequest)

StateResponse = _reflection.GeneratedProtocolMessageType('StateResponse', (_message.Message,), {
  'DESCRIPTOR' : _STATERESPONSE,
  '__module__' : 'lights_pb2'
  # @@protoc_insertion_point(class_scope:lightsService.StateResponse)
  })
_sym_db.RegisterMessage(StateResponse)

SwitchRequest = _reflection.GeneratedProtocolMessageType('SwitchRequest', (_message.Message,), {
  'DESCRIPTOR' : _SWITCHREQUEST,
  '__module__' : 'lights_pb2'
  # @@protoc_insertion_point(class_scope:lightsService.SwitchRequest)
  })
_sym_db.RegisterMessage(SwitchRequest)

SwitchResponse = _reflection.GeneratedProtocolMessageType('SwitchResponse', (_message.Message,), {
  'DESCRIPTOR' : _SWITCHRESPONSE,
  '__module__' : 'lights_pb2'
  # @@protoc_insertion_point(class_scope:lightsService.SwitchResponse)
  })
_sym_db.RegisterMessage(SwitchResponse)


DESCRIPTOR._options = None

_LIGHTSSERVICE = _descriptor.ServiceDescriptor(
  name='LightsService',
  full_name='lightsService.LightsService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=1230,
  serialized_end=1986,
  methods=[
  _descriptor.MethodDescriptor(
    name='PreviewLight',
    full_name='lightsService.LightsService.PreviewLight',
    index=0,
    containing_service=None,
    input_type=_PREVIEWLIGHTREQUEST,
    output_type=_PREVIEWLIGHTRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='PlayLight',
    full_name='lightsService.LightsService.PlayLight',
    index=1,
    containing_service=None,
    input_type=_PLAYLIGHTREQUEST,
    output_type=_PLAYLIGHTRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='StopLight',
    full_name='lightsService.LightsService.StopLight',
    index=2,
    containing_service=None,
    input_type=_STOPLIGHTREQUEST,
    output_type=_STOPLIGHTRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='ListLights',
    full_name='lightsService.LightsService.ListLights',
    index=3,
    containing_service=None,
    input_type=_LISTLIGHTSREQUEST,
    output_type=_LISTLIGHTSRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='NewLight',
    full_name='lightsService.LightsService.NewLight',
    index=4,
    containing_service=None,
    input_type=_NEWLIGHTREQUEST,
    output_type=_NEWLIGHTRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='UpdateLight',
    full_name='lightsService.LightsService.UpdateLight',
    index=5,
    containing_service=None,
    input_type=_UPDATELIGHTREQUEST,
    output_type=_UPDATELIGHTRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='DeleteLights',
    full_name='lightsService.LightsService.DeleteLights',
    index=6,
    containing_service=None,
    input_type=_DELETELIGHTSREQUEST,
    output_type=_DELETELIGHTSRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='State',
    full_name='lightsService.LightsService.State',
    index=7,
    containing_service=None,
    input_type=_STATEREQUEST,
    output_type=_STATERESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='Switch',
    full_name='lightsService.LightsService.Switch',
    index=8,
    containing_service=None,
    input_type=_SWITCHREQUEST,
    output_type=_SWITCHRESPONSE,
    serialized_options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_LIGHTSSERVICE)

DESCRIPTOR.services_by_name['LightsService'] = _LIGHTSSERVICE

# @@protoc_insertion_point(module_scope)
