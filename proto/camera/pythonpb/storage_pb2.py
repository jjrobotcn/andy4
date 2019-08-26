# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: storage.proto

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
  name='storage.proto',
  package='cameraService',
  syntax='proto3',
  serialized_options=None,
  serialized_pb=_b('\n\rstorage.proto\x12\rcameraService\x1a\x1cgoogle/api/annotations.proto\"\x12\n\x10ListDatesRequest\"\"\n\x11ListDatesResponse\x12\r\n\x05\x64\x61tes\x18\x01 \x03(\t\"/\n\x11ListVideosRequest\x12\r\n\x05start\x18\x01 \x01(\t\x12\x0b\n\x03\x65nd\x18\x02 \x01(\t\"$\n\x12ListVideosResponse\x12\x0e\n\x06videos\x18\x01 \x03(\t\"$\n\x13GetVideoFileRequest\x12\r\n\x05video\x18\x01 \x01(\t\"%\n\x14GetVideoFileResponse\x12\r\n\x05\x63hunk\x18\x01 \x01(\x0c\")\n\x17\x44\x65leteVideoFilesRequest\x12\x0e\n\x06videos\x18\x01 \x03(\t\"\x1a\n\x18\x44\x65leteVideoFilesResponse2\x92\x04\n\x07Storage\x12t\n\tListDates\x12\x1f.cameraService.ListDatesRequest\x1a .cameraService.ListDatesResponse\"$\x82\xd3\xe4\x93\x02\x1e\x12\x1c/api/v2/camera/storage/dates\x12\x9c\x01\n\nListVideos\x12 .cameraService.ListVideosRequest\x1a!.cameraService.ListVideosResponse\"I\x82\xd3\xe4\x93\x02\x43\x12\x1d/api/v2/camera/storage/videosZ\"\"\x1d/api/v1/camera/storage/videos:\x01*\x12[\n\x0cGetVideoFile\x12\".cameraService.GetVideoFileRequest\x1a#.cameraService.GetVideoFileResponse\"\x00\x30\x01\x12\x94\x01\n\x10\x44\x65leteVideoFiles\x12&.cameraService.DeleteVideoFilesRequest\x1a\'.cameraService.DeleteVideoFilesResponse\"/\x82\xd3\xe4\x93\x02)\"$/api/v2/camera/storage/videos/delete:\x01*b\x06proto3')
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_LISTDATESREQUEST = _descriptor.Descriptor(
  name='ListDatesRequest',
  full_name='cameraService.ListDatesRequest',
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
  serialized_start=62,
  serialized_end=80,
)


_LISTDATESRESPONSE = _descriptor.Descriptor(
  name='ListDatesResponse',
  full_name='cameraService.ListDatesResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='dates', full_name='cameraService.ListDatesResponse.dates', index=0,
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
  serialized_start=82,
  serialized_end=116,
)


_LISTVIDEOSREQUEST = _descriptor.Descriptor(
  name='ListVideosRequest',
  full_name='cameraService.ListVideosRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='start', full_name='cameraService.ListVideosRequest.start', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='end', full_name='cameraService.ListVideosRequest.end', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
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
  serialized_start=118,
  serialized_end=165,
)


_LISTVIDEOSRESPONSE = _descriptor.Descriptor(
  name='ListVideosResponse',
  full_name='cameraService.ListVideosResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='videos', full_name='cameraService.ListVideosResponse.videos', index=0,
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
  serialized_start=167,
  serialized_end=203,
)


_GETVIDEOFILEREQUEST = _descriptor.Descriptor(
  name='GetVideoFileRequest',
  full_name='cameraService.GetVideoFileRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='video', full_name='cameraService.GetVideoFileRequest.video', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
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
  serialized_start=205,
  serialized_end=241,
)


_GETVIDEOFILERESPONSE = _descriptor.Descriptor(
  name='GetVideoFileResponse',
  full_name='cameraService.GetVideoFileResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='chunk', full_name='cameraService.GetVideoFileResponse.chunk', index=0,
      number=1, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=_b(""),
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
  serialized_start=243,
  serialized_end=280,
)


_DELETEVIDEOFILESREQUEST = _descriptor.Descriptor(
  name='DeleteVideoFilesRequest',
  full_name='cameraService.DeleteVideoFilesRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='videos', full_name='cameraService.DeleteVideoFilesRequest.videos', index=0,
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
  serialized_start=282,
  serialized_end=323,
)


_DELETEVIDEOFILESRESPONSE = _descriptor.Descriptor(
  name='DeleteVideoFilesResponse',
  full_name='cameraService.DeleteVideoFilesResponse',
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
  serialized_start=325,
  serialized_end=351,
)

DESCRIPTOR.message_types_by_name['ListDatesRequest'] = _LISTDATESREQUEST
DESCRIPTOR.message_types_by_name['ListDatesResponse'] = _LISTDATESRESPONSE
DESCRIPTOR.message_types_by_name['ListVideosRequest'] = _LISTVIDEOSREQUEST
DESCRIPTOR.message_types_by_name['ListVideosResponse'] = _LISTVIDEOSRESPONSE
DESCRIPTOR.message_types_by_name['GetVideoFileRequest'] = _GETVIDEOFILEREQUEST
DESCRIPTOR.message_types_by_name['GetVideoFileResponse'] = _GETVIDEOFILERESPONSE
DESCRIPTOR.message_types_by_name['DeleteVideoFilesRequest'] = _DELETEVIDEOFILESREQUEST
DESCRIPTOR.message_types_by_name['DeleteVideoFilesResponse'] = _DELETEVIDEOFILESRESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ListDatesRequest = _reflection.GeneratedProtocolMessageType('ListDatesRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTDATESREQUEST,
  '__module__' : 'storage_pb2'
  # @@protoc_insertion_point(class_scope:cameraService.ListDatesRequest)
  })
_sym_db.RegisterMessage(ListDatesRequest)

ListDatesResponse = _reflection.GeneratedProtocolMessageType('ListDatesResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTDATESRESPONSE,
  '__module__' : 'storage_pb2'
  # @@protoc_insertion_point(class_scope:cameraService.ListDatesResponse)
  })
_sym_db.RegisterMessage(ListDatesResponse)

ListVideosRequest = _reflection.GeneratedProtocolMessageType('ListVideosRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTVIDEOSREQUEST,
  '__module__' : 'storage_pb2'
  # @@protoc_insertion_point(class_scope:cameraService.ListVideosRequest)
  })
_sym_db.RegisterMessage(ListVideosRequest)

ListVideosResponse = _reflection.GeneratedProtocolMessageType('ListVideosResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTVIDEOSRESPONSE,
  '__module__' : 'storage_pb2'
  # @@protoc_insertion_point(class_scope:cameraService.ListVideosResponse)
  })
_sym_db.RegisterMessage(ListVideosResponse)

GetVideoFileRequest = _reflection.GeneratedProtocolMessageType('GetVideoFileRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETVIDEOFILEREQUEST,
  '__module__' : 'storage_pb2'
  # @@protoc_insertion_point(class_scope:cameraService.GetVideoFileRequest)
  })
_sym_db.RegisterMessage(GetVideoFileRequest)

GetVideoFileResponse = _reflection.GeneratedProtocolMessageType('GetVideoFileResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETVIDEOFILERESPONSE,
  '__module__' : 'storage_pb2'
  # @@protoc_insertion_point(class_scope:cameraService.GetVideoFileResponse)
  })
_sym_db.RegisterMessage(GetVideoFileResponse)

DeleteVideoFilesRequest = _reflection.GeneratedProtocolMessageType('DeleteVideoFilesRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEVIDEOFILESREQUEST,
  '__module__' : 'storage_pb2'
  # @@protoc_insertion_point(class_scope:cameraService.DeleteVideoFilesRequest)
  })
_sym_db.RegisterMessage(DeleteVideoFilesRequest)

DeleteVideoFilesResponse = _reflection.GeneratedProtocolMessageType('DeleteVideoFilesResponse', (_message.Message,), {
  'DESCRIPTOR' : _DELETEVIDEOFILESRESPONSE,
  '__module__' : 'storage_pb2'
  # @@protoc_insertion_point(class_scope:cameraService.DeleteVideoFilesResponse)
  })
_sym_db.RegisterMessage(DeleteVideoFilesResponse)



_STORAGE = _descriptor.ServiceDescriptor(
  name='Storage',
  full_name='cameraService.Storage',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=354,
  serialized_end=884,
  methods=[
  _descriptor.MethodDescriptor(
    name='ListDates',
    full_name='cameraService.Storage.ListDates',
    index=0,
    containing_service=None,
    input_type=_LISTDATESREQUEST,
    output_type=_LISTDATESRESPONSE,
    serialized_options=_b('\202\323\344\223\002\036\022\034/api/v2/camera/storage/dates'),
  ),
  _descriptor.MethodDescriptor(
    name='ListVideos',
    full_name='cameraService.Storage.ListVideos',
    index=1,
    containing_service=None,
    input_type=_LISTVIDEOSREQUEST,
    output_type=_LISTVIDEOSRESPONSE,
    serialized_options=_b('\202\323\344\223\002C\022\035/api/v2/camera/storage/videosZ\"\"\035/api/v1/camera/storage/videos:\001*'),
  ),
  _descriptor.MethodDescriptor(
    name='GetVideoFile',
    full_name='cameraService.Storage.GetVideoFile',
    index=2,
    containing_service=None,
    input_type=_GETVIDEOFILEREQUEST,
    output_type=_GETVIDEOFILERESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='DeleteVideoFiles',
    full_name='cameraService.Storage.DeleteVideoFiles',
    index=3,
    containing_service=None,
    input_type=_DELETEVIDEOFILESREQUEST,
    output_type=_DELETEVIDEOFILESRESPONSE,
    serialized_options=_b('\202\323\344\223\002)\"$/api/v2/camera/storage/videos/delete:\001*'),
  ),
])
_sym_db.RegisterServiceDescriptor(_STORAGE)

DESCRIPTOR.services_by_name['Storage'] = _STORAGE

# @@protoc_insertion_point(module_scope)
