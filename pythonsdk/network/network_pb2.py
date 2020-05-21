# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: network.proto

from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='network.proto',
  package='networkService',
  syntax='proto3',
  serialized_options=b'\n\033com.jjrobot.andy4.networkpbB\020NetworkServicePBZ\tnetworkpb',
  serialized_pb=b'\n\rnetwork.proto\x12\x0enetworkService\"G\n\x0bNetworkInfo\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0b\n\x03mac\x18\x02 \x01(\t\x12\x0f\n\x07\x63hannel\x18\x03 \x01(\r\x12\x0c\n\x04rssi\x18\x04 \x01(\r\"\x15\n\x13ListNetworksRequest\"J\n\x14ListNetworksResponse\x12\x32\n\rnetworks_info\x18\x01 \x03(\x0b\x32\x1b.networkService.NetworkInfo\"\x93\x01\n\x0e\x43onnectRequest\x12\x35\n\x0cnetwork_info\x18\x01 \x01(\x0b\x32\x1b.networkService.NetworkInfoB\x02\x18\x01\x12\x0c\n\x04ssid\x18\x03 \x01(\t\x12\x0b\n\x03pwd\x18\x02 \x01(\t\x12\x12\n\nkeep_alive\x18\x04 \x01(\x08\x12\x1b\n\x13keep_alive_interval\x18\x05 \x01(\r\"\x88\x01\n\rNetworkStatus\x12&\n\x06status\x18\x01 \x01(\x0e\x32\x16.networkService.Status\x12\x0c\n\x04name\x18\x02 \x01(\t\x12\x11\n\tpublic_ip\x18\x03 \x01(\t\x12\x0c\n\x04rssi\x18\x04 \x01(\r\x12\x0e\n\x06upload\x18\x05 \x01(\r\x12\x10\n\x08\x64ownload\x18\x06 \x01(\r\"\x11\n\x0f\x43onnectResponse\"\x12\n\x10GetStatusRequest\"J\n\x11GetStatusResponse\x12\x35\n\x0enetwork_status\x18\x01 \x01(\x0b\x32\x1d.networkService.NetworkStatus\"5\n\x11NetworkDeviceInfo\x12\x0c\n\x04ssid\x18\x01 \x01(\t\x12\x12\n\ncredential\x18\x02 \x01(\t\"6\n\x1bGetNetworkDeviceInfoRequest\x12\x17\n\x0fwith_credential\x18\x01 \x01(\x08\"^\n\x1cGetNetworkDeviceInfoResponse\x12>\n\x13network_device_info\x18\x01 \x01(\x0b\x32!.networkService.NetworkDeviceInfo\"`\n\x1eUpdateNetworkDeviceInfoRequest\x12>\n\x13network_device_info\x18\x01 \x01(\x0b\x32!.networkService.NetworkDeviceInfo\"!\n\x1fUpdateNetworkDeviceInfoResponse*F\n\x06Status\x12\x0b\n\x07UNKNOWN\x10\x00\x12\x10\n\x0c\x44ISCONNECTED\x10\x01\x12\x0e\n\nCONNECTING\x10\x02\x12\r\n\tCONNECTED\x10\x03\x32\x86\x04\n\x0eNetworkService\x12]\n\x0cListNetworks\x12#.networkService.ListNetworksRequest\x1a$.networkService.ListNetworksResponse\"\x00\x30\x01\x12L\n\x07\x43onnect\x12\x1e.networkService.ConnectRequest\x1a\x1f.networkService.ConnectResponse\"\x00\x12T\n\tGetStatus\x12 .networkService.GetStatusRequest\x1a!.networkService.GetStatusResponse\"\x00\x30\x01\x12s\n\x14GetNetworkDeviceInfo\x12+.networkService.GetNetworkDeviceInfoRequest\x1a,.networkService.GetNetworkDeviceInfoResponse\"\x00\x12|\n\x17UpdateNetworkDeviceInfo\x12..networkService.UpdateNetworkDeviceInfoRequest\x1a/.networkService.UpdateNetworkDeviceInfoResponse\"\x00\x42:\n\x1b\x63om.jjrobot.andy4.networkpbB\x10NetworkServicePBZ\tnetworkpbb\x06proto3'
)

_STATUS = _descriptor.EnumDescriptor(
  name='Status',
  full_name='networkService.Status',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='UNKNOWN', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='DISCONNECTED', index=1, number=1,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='CONNECTING', index=2, number=2,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='CONNECTED', index=3, number=3,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=949,
  serialized_end=1019,
)
_sym_db.RegisterEnumDescriptor(_STATUS)

Status = enum_type_wrapper.EnumTypeWrapper(_STATUS)
UNKNOWN = 0
DISCONNECTED = 1
CONNECTING = 2
CONNECTED = 3



_NETWORKINFO = _descriptor.Descriptor(
  name='NetworkInfo',
  full_name='networkService.NetworkInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='networkService.NetworkInfo.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='mac', full_name='networkService.NetworkInfo.mac', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='channel', full_name='networkService.NetworkInfo.channel', index=2,
      number=3, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='rssi', full_name='networkService.NetworkInfo.rssi', index=3,
      number=4, type=13, cpp_type=3, label=1,
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
  serialized_start=33,
  serialized_end=104,
)


_LISTNETWORKSREQUEST = _descriptor.Descriptor(
  name='ListNetworksRequest',
  full_name='networkService.ListNetworksRequest',
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
  serialized_start=106,
  serialized_end=127,
)


_LISTNETWORKSRESPONSE = _descriptor.Descriptor(
  name='ListNetworksResponse',
  full_name='networkService.ListNetworksResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='networks_info', full_name='networkService.ListNetworksResponse.networks_info', index=0,
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
  serialized_start=129,
  serialized_end=203,
)


_CONNECTREQUEST = _descriptor.Descriptor(
  name='ConnectRequest',
  full_name='networkService.ConnectRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='network_info', full_name='networkService.ConnectRequest.network_info', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\030\001', file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='ssid', full_name='networkService.ConnectRequest.ssid', index=1,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='pwd', full_name='networkService.ConnectRequest.pwd', index=2,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='keep_alive', full_name='networkService.ConnectRequest.keep_alive', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='keep_alive_interval', full_name='networkService.ConnectRequest.keep_alive_interval', index=4,
      number=5, type=13, cpp_type=3, label=1,
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
  serialized_start=206,
  serialized_end=353,
)


_NETWORKSTATUS = _descriptor.Descriptor(
  name='NetworkStatus',
  full_name='networkService.NetworkStatus',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='status', full_name='networkService.NetworkStatus.status', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='name', full_name='networkService.NetworkStatus.name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='public_ip', full_name='networkService.NetworkStatus.public_ip', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='rssi', full_name='networkService.NetworkStatus.rssi', index=3,
      number=4, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='upload', full_name='networkService.NetworkStatus.upload', index=4,
      number=5, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='download', full_name='networkService.NetworkStatus.download', index=5,
      number=6, type=13, cpp_type=3, label=1,
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
  serialized_start=356,
  serialized_end=492,
)


_CONNECTRESPONSE = _descriptor.Descriptor(
  name='ConnectResponse',
  full_name='networkService.ConnectResponse',
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
  serialized_start=494,
  serialized_end=511,
)


_GETSTATUSREQUEST = _descriptor.Descriptor(
  name='GetStatusRequest',
  full_name='networkService.GetStatusRequest',
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
  serialized_start=513,
  serialized_end=531,
)


_GETSTATUSRESPONSE = _descriptor.Descriptor(
  name='GetStatusResponse',
  full_name='networkService.GetStatusResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='network_status', full_name='networkService.GetStatusResponse.network_status', index=0,
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
  serialized_start=533,
  serialized_end=607,
)


_NETWORKDEVICEINFO = _descriptor.Descriptor(
  name='NetworkDeviceInfo',
  full_name='networkService.NetworkDeviceInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='ssid', full_name='networkService.NetworkDeviceInfo.ssid', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='credential', full_name='networkService.NetworkDeviceInfo.credential', index=1,
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
  serialized_start=609,
  serialized_end=662,
)


_GETNETWORKDEVICEINFOREQUEST = _descriptor.Descriptor(
  name='GetNetworkDeviceInfoRequest',
  full_name='networkService.GetNetworkDeviceInfoRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='with_credential', full_name='networkService.GetNetworkDeviceInfoRequest.with_credential', index=0,
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
  serialized_start=664,
  serialized_end=718,
)


_GETNETWORKDEVICEINFORESPONSE = _descriptor.Descriptor(
  name='GetNetworkDeviceInfoResponse',
  full_name='networkService.GetNetworkDeviceInfoResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='network_device_info', full_name='networkService.GetNetworkDeviceInfoResponse.network_device_info', index=0,
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
  serialized_start=720,
  serialized_end=814,
)


_UPDATENETWORKDEVICEINFOREQUEST = _descriptor.Descriptor(
  name='UpdateNetworkDeviceInfoRequest',
  full_name='networkService.UpdateNetworkDeviceInfoRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='network_device_info', full_name='networkService.UpdateNetworkDeviceInfoRequest.network_device_info', index=0,
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
  serialized_start=816,
  serialized_end=912,
)


_UPDATENETWORKDEVICEINFORESPONSE = _descriptor.Descriptor(
  name='UpdateNetworkDeviceInfoResponse',
  full_name='networkService.UpdateNetworkDeviceInfoResponse',
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
  serialized_start=914,
  serialized_end=947,
)

_LISTNETWORKSRESPONSE.fields_by_name['networks_info'].message_type = _NETWORKINFO
_CONNECTREQUEST.fields_by_name['network_info'].message_type = _NETWORKINFO
_NETWORKSTATUS.fields_by_name['status'].enum_type = _STATUS
_GETSTATUSRESPONSE.fields_by_name['network_status'].message_type = _NETWORKSTATUS
_GETNETWORKDEVICEINFORESPONSE.fields_by_name['network_device_info'].message_type = _NETWORKDEVICEINFO
_UPDATENETWORKDEVICEINFOREQUEST.fields_by_name['network_device_info'].message_type = _NETWORKDEVICEINFO
DESCRIPTOR.message_types_by_name['NetworkInfo'] = _NETWORKINFO
DESCRIPTOR.message_types_by_name['ListNetworksRequest'] = _LISTNETWORKSREQUEST
DESCRIPTOR.message_types_by_name['ListNetworksResponse'] = _LISTNETWORKSRESPONSE
DESCRIPTOR.message_types_by_name['ConnectRequest'] = _CONNECTREQUEST
DESCRIPTOR.message_types_by_name['NetworkStatus'] = _NETWORKSTATUS
DESCRIPTOR.message_types_by_name['ConnectResponse'] = _CONNECTRESPONSE
DESCRIPTOR.message_types_by_name['GetStatusRequest'] = _GETSTATUSREQUEST
DESCRIPTOR.message_types_by_name['GetStatusResponse'] = _GETSTATUSRESPONSE
DESCRIPTOR.message_types_by_name['NetworkDeviceInfo'] = _NETWORKDEVICEINFO
DESCRIPTOR.message_types_by_name['GetNetworkDeviceInfoRequest'] = _GETNETWORKDEVICEINFOREQUEST
DESCRIPTOR.message_types_by_name['GetNetworkDeviceInfoResponse'] = _GETNETWORKDEVICEINFORESPONSE
DESCRIPTOR.message_types_by_name['UpdateNetworkDeviceInfoRequest'] = _UPDATENETWORKDEVICEINFOREQUEST
DESCRIPTOR.message_types_by_name['UpdateNetworkDeviceInfoResponse'] = _UPDATENETWORKDEVICEINFORESPONSE
DESCRIPTOR.enum_types_by_name['Status'] = _STATUS
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

NetworkInfo = _reflection.GeneratedProtocolMessageType('NetworkInfo', (_message.Message,), {
  'DESCRIPTOR' : _NETWORKINFO,
  '__module__' : 'network_pb2'
  # @@protoc_insertion_point(class_scope:networkService.NetworkInfo)
  })
_sym_db.RegisterMessage(NetworkInfo)

ListNetworksRequest = _reflection.GeneratedProtocolMessageType('ListNetworksRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTNETWORKSREQUEST,
  '__module__' : 'network_pb2'
  # @@protoc_insertion_point(class_scope:networkService.ListNetworksRequest)
  })
_sym_db.RegisterMessage(ListNetworksRequest)

ListNetworksResponse = _reflection.GeneratedProtocolMessageType('ListNetworksResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTNETWORKSRESPONSE,
  '__module__' : 'network_pb2'
  # @@protoc_insertion_point(class_scope:networkService.ListNetworksResponse)
  })
_sym_db.RegisterMessage(ListNetworksResponse)

ConnectRequest = _reflection.GeneratedProtocolMessageType('ConnectRequest', (_message.Message,), {
  'DESCRIPTOR' : _CONNECTREQUEST,
  '__module__' : 'network_pb2'
  # @@protoc_insertion_point(class_scope:networkService.ConnectRequest)
  })
_sym_db.RegisterMessage(ConnectRequest)

NetworkStatus = _reflection.GeneratedProtocolMessageType('NetworkStatus', (_message.Message,), {
  'DESCRIPTOR' : _NETWORKSTATUS,
  '__module__' : 'network_pb2'
  # @@protoc_insertion_point(class_scope:networkService.NetworkStatus)
  })
_sym_db.RegisterMessage(NetworkStatus)

ConnectResponse = _reflection.GeneratedProtocolMessageType('ConnectResponse', (_message.Message,), {
  'DESCRIPTOR' : _CONNECTRESPONSE,
  '__module__' : 'network_pb2'
  # @@protoc_insertion_point(class_scope:networkService.ConnectResponse)
  })
_sym_db.RegisterMessage(ConnectResponse)

GetStatusRequest = _reflection.GeneratedProtocolMessageType('GetStatusRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETSTATUSREQUEST,
  '__module__' : 'network_pb2'
  # @@protoc_insertion_point(class_scope:networkService.GetStatusRequest)
  })
_sym_db.RegisterMessage(GetStatusRequest)

GetStatusResponse = _reflection.GeneratedProtocolMessageType('GetStatusResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETSTATUSRESPONSE,
  '__module__' : 'network_pb2'
  # @@protoc_insertion_point(class_scope:networkService.GetStatusResponse)
  })
_sym_db.RegisterMessage(GetStatusResponse)

NetworkDeviceInfo = _reflection.GeneratedProtocolMessageType('NetworkDeviceInfo', (_message.Message,), {
  'DESCRIPTOR' : _NETWORKDEVICEINFO,
  '__module__' : 'network_pb2'
  # @@protoc_insertion_point(class_scope:networkService.NetworkDeviceInfo)
  })
_sym_db.RegisterMessage(NetworkDeviceInfo)

GetNetworkDeviceInfoRequest = _reflection.GeneratedProtocolMessageType('GetNetworkDeviceInfoRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETNETWORKDEVICEINFOREQUEST,
  '__module__' : 'network_pb2'
  # @@protoc_insertion_point(class_scope:networkService.GetNetworkDeviceInfoRequest)
  })
_sym_db.RegisterMessage(GetNetworkDeviceInfoRequest)

GetNetworkDeviceInfoResponse = _reflection.GeneratedProtocolMessageType('GetNetworkDeviceInfoResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETNETWORKDEVICEINFORESPONSE,
  '__module__' : 'network_pb2'
  # @@protoc_insertion_point(class_scope:networkService.GetNetworkDeviceInfoResponse)
  })
_sym_db.RegisterMessage(GetNetworkDeviceInfoResponse)

UpdateNetworkDeviceInfoRequest = _reflection.GeneratedProtocolMessageType('UpdateNetworkDeviceInfoRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATENETWORKDEVICEINFOREQUEST,
  '__module__' : 'network_pb2'
  # @@protoc_insertion_point(class_scope:networkService.UpdateNetworkDeviceInfoRequest)
  })
_sym_db.RegisterMessage(UpdateNetworkDeviceInfoRequest)

UpdateNetworkDeviceInfoResponse = _reflection.GeneratedProtocolMessageType('UpdateNetworkDeviceInfoResponse', (_message.Message,), {
  'DESCRIPTOR' : _UPDATENETWORKDEVICEINFORESPONSE,
  '__module__' : 'network_pb2'
  # @@protoc_insertion_point(class_scope:networkService.UpdateNetworkDeviceInfoResponse)
  })
_sym_db.RegisterMessage(UpdateNetworkDeviceInfoResponse)


DESCRIPTOR._options = None
_CONNECTREQUEST.fields_by_name['network_info']._options = None

_NETWORKSERVICE = _descriptor.ServiceDescriptor(
  name='NetworkService',
  full_name='networkService.NetworkService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=1022,
  serialized_end=1540,
  methods=[
  _descriptor.MethodDescriptor(
    name='ListNetworks',
    full_name='networkService.NetworkService.ListNetworks',
    index=0,
    containing_service=None,
    input_type=_LISTNETWORKSREQUEST,
    output_type=_LISTNETWORKSRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='Connect',
    full_name='networkService.NetworkService.Connect',
    index=1,
    containing_service=None,
    input_type=_CONNECTREQUEST,
    output_type=_CONNECTRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='GetStatus',
    full_name='networkService.NetworkService.GetStatus',
    index=2,
    containing_service=None,
    input_type=_GETSTATUSREQUEST,
    output_type=_GETSTATUSRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='GetNetworkDeviceInfo',
    full_name='networkService.NetworkService.GetNetworkDeviceInfo',
    index=3,
    containing_service=None,
    input_type=_GETNETWORKDEVICEINFOREQUEST,
    output_type=_GETNETWORKDEVICEINFORESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='UpdateNetworkDeviceInfo',
    full_name='networkService.NetworkService.UpdateNetworkDeviceInfo',
    index=4,
    containing_service=None,
    input_type=_UPDATENETWORKDEVICEINFOREQUEST,
    output_type=_UPDATENETWORKDEVICEINFORESPONSE,
    serialized_options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_NETWORKSERVICE)

DESCRIPTOR.services_by_name['NetworkService'] = _NETWORKSERVICE

# @@protoc_insertion_point(module_scope)
