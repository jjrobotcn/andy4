# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: facedetect.proto

from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='facedetect.proto',
  package='faceRecognition',
  syntax='proto3',
  serialized_options=b'\n\030com.jjrobot.andy4.facepbB\014FaceDetectPBZ\006facepb',
  serialized_pb=b'\n\x10\x66\x61\x63\x65\x64\x65tect.proto\x12\x0f\x66\x61\x63\x65Recognition\"$\n\x0c\x46\x61\x63\x65Position\x12\t\n\x01x\x18\x01 \x01(\r\x12\t\n\x01y\x18\x02 \x01(\r\"}\n\x10\x46romImageRequest\x12\r\n\x05image\x18\x01 \x01(\x0c\x12\x13\n\x0bwith_gender\x18\x02 \x01(\x08\x12\x10\n\x08with_age\x18\x03 \x01(\x08\x12\x15\n\rwith_position\x18\x04 \x01(\x08\x12\x1c\n\x14with_face_crop_width\x18\x05 \x01(\x08\"\xab\x01\n\x11\x46romImageResponse\x12\x12\n\nface_crops\x18\x01 \x03(\x0c\x12(\n\x07genders\x18\x02 \x03(\x0e\x32\x17.faceRecognition.Gender\x12\x0c\n\x04\x61ges\x18\x03 \x03(\x05\x12\x30\n\tpositions\x18\x04 \x03(\x0b\x32\x1d.faceRecognition.FacePosition\x12\x18\n\x10\x66\x61\x63\x65_crop_widths\x18\x05 \x03(\r\"\x8f\x01\n\x13OnFaceDetectRequest\x12\x1c\n\x14interval_millisecond\x18\x01 \x01(\r\x12\x13\n\x0bwith_gender\x18\x02 \x01(\x08\x12\x10\n\x08with_age\x18\x03 \x01(\x08\x12\x15\n\rwith_position\x18\x04 \x01(\x08\x12\x1c\n\x14with_face_crop_width\x18\x05 \x01(\x08\"\xae\x01\n\x14OnFaceDetectResponse\x12\x12\n\nface_crops\x18\x01 \x03(\x0c\x12(\n\x07genders\x18\x02 \x03(\x0e\x32\x17.faceRecognition.Gender\x12\x0c\n\x04\x61ges\x18\x03 \x03(\x05\x12\x30\n\tpositions\x18\x04 \x03(\x0b\x32\x1d.faceRecognition.FacePosition\x12\x18\n\x10\x66\x61\x63\x65_crop_widths\x18\x05 \x03(\r\"\xdb\x01\n\x1aOnFaceSetFaceDetectRequest\x12\x13\n\x0b\x66\x61\x63\x65_set_id\x18\x01 \x01(\t\x12\x16\n\x0ewith_face_crop\x18\x02 \x01(\x08\x12\x13\n\x0bwith_gender\x18\x03 \x01(\x08\x12\x10\n\x08with_age\x18\x04 \x01(\x08\x12\x15\n\rwith_position\x18\x05 \x01(\x08\x12\x1c\n\x14interval_millisecond\x18\x06 \x01(\r\x12\x16\n\x0e\x63onfidence_min\x18\x07 \x01(\x02\x12\x1c\n\x14with_face_crop_width\x18\x08 \x01(\x08\"\xdf\x01\n\x1bOnFaceSetFaceDetectResponse\x12\x13\n\x0b\x63onfidences\x18\x01 \x03(\x02\x12\x13\n\x0b\x66\x61\x63\x65_tokens\x18\x02 \x03(\t\x12\x12\n\nface_crops\x18\x03 \x03(\x0c\x12(\n\x07genders\x18\x04 \x03(\x0e\x32\x17.faceRecognition.Gender\x12\x0c\n\x04\x61ges\x18\x05 \x03(\x05\x12\x30\n\tpositions\x18\x06 \x03(\x0b\x32\x1d.faceRecognition.FacePosition\x12\x18\n\x10\x66\x61\x63\x65_crop_widths\x18\x07 \x03(\r*@\n\x06Gender\x12\x12\n\x0eGENDER_UNKNOWN\x10\x00\x12\x0f\n\x0bGENDER_MALE\x10\x01\x12\x11\n\rGENDER_FEMALE\x10\x02\x32\xb9\x02\n\nFaceDetect\x12T\n\tFromImage\x12!.faceRecognition.FromImageRequest\x1a\".faceRecognition.FromImageResponse\"\x00\x12_\n\x0cOnFaceDetect\x12$.faceRecognition.OnFaceDetectRequest\x1a%.faceRecognition.OnFaceDetectResponse\"\x00\x30\x01\x12t\n\x13OnFaceSetFaceDetect\x12+.faceRecognition.OnFaceSetFaceDetectRequest\x1a,.faceRecognition.OnFaceSetFaceDetectResponse\"\x00\x30\x01\x42\x30\n\x18\x63om.jjrobot.andy4.facepbB\x0c\x46\x61\x63\x65\x44\x65tectPBZ\x06\x66\x61\x63\x65pbb\x06proto3'
)

_GENDER = _descriptor.EnumDescriptor(
  name='Gender',
  full_name='faceRecognition.Gender',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='GENDER_UNKNOWN', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='GENDER_MALE', index=1, number=1,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='GENDER_FEMALE', index=2, number=2,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1147,
  serialized_end=1211,
)
_sym_db.RegisterEnumDescriptor(_GENDER)

Gender = enum_type_wrapper.EnumTypeWrapper(_GENDER)
GENDER_UNKNOWN = 0
GENDER_MALE = 1
GENDER_FEMALE = 2



_FACEPOSITION = _descriptor.Descriptor(
  name='FacePosition',
  full_name='faceRecognition.FacePosition',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='x', full_name='faceRecognition.FacePosition.x', index=0,
      number=1, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='y', full_name='faceRecognition.FacePosition.y', index=1,
      number=2, type=13, cpp_type=3, label=1,
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
  serialized_start=37,
  serialized_end=73,
)


_FROMIMAGEREQUEST = _descriptor.Descriptor(
  name='FromImageRequest',
  full_name='faceRecognition.FromImageRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='image', full_name='faceRecognition.FromImageRequest.image', index=0,
      number=1, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='with_gender', full_name='faceRecognition.FromImageRequest.with_gender', index=1,
      number=2, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='with_age', full_name='faceRecognition.FromImageRequest.with_age', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='with_position', full_name='faceRecognition.FromImageRequest.with_position', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='with_face_crop_width', full_name='faceRecognition.FromImageRequest.with_face_crop_width', index=4,
      number=5, type=8, cpp_type=7, label=1,
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
  serialized_start=75,
  serialized_end=200,
)


_FROMIMAGERESPONSE = _descriptor.Descriptor(
  name='FromImageResponse',
  full_name='faceRecognition.FromImageResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='face_crops', full_name='faceRecognition.FromImageResponse.face_crops', index=0,
      number=1, type=12, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='genders', full_name='faceRecognition.FromImageResponse.genders', index=1,
      number=2, type=14, cpp_type=8, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='ages', full_name='faceRecognition.FromImageResponse.ages', index=2,
      number=3, type=5, cpp_type=1, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='positions', full_name='faceRecognition.FromImageResponse.positions', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='face_crop_widths', full_name='faceRecognition.FromImageResponse.face_crop_widths', index=4,
      number=5, type=13, cpp_type=3, label=3,
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
  serialized_start=203,
  serialized_end=374,
)


_ONFACEDETECTREQUEST = _descriptor.Descriptor(
  name='OnFaceDetectRequest',
  full_name='faceRecognition.OnFaceDetectRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='interval_millisecond', full_name='faceRecognition.OnFaceDetectRequest.interval_millisecond', index=0,
      number=1, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='with_gender', full_name='faceRecognition.OnFaceDetectRequest.with_gender', index=1,
      number=2, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='with_age', full_name='faceRecognition.OnFaceDetectRequest.with_age', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='with_position', full_name='faceRecognition.OnFaceDetectRequest.with_position', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='with_face_crop_width', full_name='faceRecognition.OnFaceDetectRequest.with_face_crop_width', index=4,
      number=5, type=8, cpp_type=7, label=1,
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
  serialized_start=377,
  serialized_end=520,
)


_ONFACEDETECTRESPONSE = _descriptor.Descriptor(
  name='OnFaceDetectResponse',
  full_name='faceRecognition.OnFaceDetectResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='face_crops', full_name='faceRecognition.OnFaceDetectResponse.face_crops', index=0,
      number=1, type=12, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='genders', full_name='faceRecognition.OnFaceDetectResponse.genders', index=1,
      number=2, type=14, cpp_type=8, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='ages', full_name='faceRecognition.OnFaceDetectResponse.ages', index=2,
      number=3, type=5, cpp_type=1, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='positions', full_name='faceRecognition.OnFaceDetectResponse.positions', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='face_crop_widths', full_name='faceRecognition.OnFaceDetectResponse.face_crop_widths', index=4,
      number=5, type=13, cpp_type=3, label=3,
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
  serialized_start=523,
  serialized_end=697,
)


_ONFACESETFACEDETECTREQUEST = _descriptor.Descriptor(
  name='OnFaceSetFaceDetectRequest',
  full_name='faceRecognition.OnFaceSetFaceDetectRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='face_set_id', full_name='faceRecognition.OnFaceSetFaceDetectRequest.face_set_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='with_face_crop', full_name='faceRecognition.OnFaceSetFaceDetectRequest.with_face_crop', index=1,
      number=2, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='with_gender', full_name='faceRecognition.OnFaceSetFaceDetectRequest.with_gender', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='with_age', full_name='faceRecognition.OnFaceSetFaceDetectRequest.with_age', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='with_position', full_name='faceRecognition.OnFaceSetFaceDetectRequest.with_position', index=4,
      number=5, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='interval_millisecond', full_name='faceRecognition.OnFaceSetFaceDetectRequest.interval_millisecond', index=5,
      number=6, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='confidence_min', full_name='faceRecognition.OnFaceSetFaceDetectRequest.confidence_min', index=6,
      number=7, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='with_face_crop_width', full_name='faceRecognition.OnFaceSetFaceDetectRequest.with_face_crop_width', index=7,
      number=8, type=8, cpp_type=7, label=1,
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
  serialized_start=700,
  serialized_end=919,
)


_ONFACESETFACEDETECTRESPONSE = _descriptor.Descriptor(
  name='OnFaceSetFaceDetectResponse',
  full_name='faceRecognition.OnFaceSetFaceDetectResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='confidences', full_name='faceRecognition.OnFaceSetFaceDetectResponse.confidences', index=0,
      number=1, type=2, cpp_type=6, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='face_tokens', full_name='faceRecognition.OnFaceSetFaceDetectResponse.face_tokens', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='face_crops', full_name='faceRecognition.OnFaceSetFaceDetectResponse.face_crops', index=2,
      number=3, type=12, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='genders', full_name='faceRecognition.OnFaceSetFaceDetectResponse.genders', index=3,
      number=4, type=14, cpp_type=8, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='ages', full_name='faceRecognition.OnFaceSetFaceDetectResponse.ages', index=4,
      number=5, type=5, cpp_type=1, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='positions', full_name='faceRecognition.OnFaceSetFaceDetectResponse.positions', index=5,
      number=6, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='face_crop_widths', full_name='faceRecognition.OnFaceSetFaceDetectResponse.face_crop_widths', index=6,
      number=7, type=13, cpp_type=3, label=3,
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
  serialized_start=922,
  serialized_end=1145,
)

_FROMIMAGERESPONSE.fields_by_name['genders'].enum_type = _GENDER
_FROMIMAGERESPONSE.fields_by_name['positions'].message_type = _FACEPOSITION
_ONFACEDETECTRESPONSE.fields_by_name['genders'].enum_type = _GENDER
_ONFACEDETECTRESPONSE.fields_by_name['positions'].message_type = _FACEPOSITION
_ONFACESETFACEDETECTRESPONSE.fields_by_name['genders'].enum_type = _GENDER
_ONFACESETFACEDETECTRESPONSE.fields_by_name['positions'].message_type = _FACEPOSITION
DESCRIPTOR.message_types_by_name['FacePosition'] = _FACEPOSITION
DESCRIPTOR.message_types_by_name['FromImageRequest'] = _FROMIMAGEREQUEST
DESCRIPTOR.message_types_by_name['FromImageResponse'] = _FROMIMAGERESPONSE
DESCRIPTOR.message_types_by_name['OnFaceDetectRequest'] = _ONFACEDETECTREQUEST
DESCRIPTOR.message_types_by_name['OnFaceDetectResponse'] = _ONFACEDETECTRESPONSE
DESCRIPTOR.message_types_by_name['OnFaceSetFaceDetectRequest'] = _ONFACESETFACEDETECTREQUEST
DESCRIPTOR.message_types_by_name['OnFaceSetFaceDetectResponse'] = _ONFACESETFACEDETECTRESPONSE
DESCRIPTOR.enum_types_by_name['Gender'] = _GENDER
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

FacePosition = _reflection.GeneratedProtocolMessageType('FacePosition', (_message.Message,), {
  'DESCRIPTOR' : _FACEPOSITION,
  '__module__' : 'facedetect_pb2'
  # @@protoc_insertion_point(class_scope:faceRecognition.FacePosition)
  })
_sym_db.RegisterMessage(FacePosition)

FromImageRequest = _reflection.GeneratedProtocolMessageType('FromImageRequest', (_message.Message,), {
  'DESCRIPTOR' : _FROMIMAGEREQUEST,
  '__module__' : 'facedetect_pb2'
  # @@protoc_insertion_point(class_scope:faceRecognition.FromImageRequest)
  })
_sym_db.RegisterMessage(FromImageRequest)

FromImageResponse = _reflection.GeneratedProtocolMessageType('FromImageResponse', (_message.Message,), {
  'DESCRIPTOR' : _FROMIMAGERESPONSE,
  '__module__' : 'facedetect_pb2'
  # @@protoc_insertion_point(class_scope:faceRecognition.FromImageResponse)
  })
_sym_db.RegisterMessage(FromImageResponse)

OnFaceDetectRequest = _reflection.GeneratedProtocolMessageType('OnFaceDetectRequest', (_message.Message,), {
  'DESCRIPTOR' : _ONFACEDETECTREQUEST,
  '__module__' : 'facedetect_pb2'
  # @@protoc_insertion_point(class_scope:faceRecognition.OnFaceDetectRequest)
  })
_sym_db.RegisterMessage(OnFaceDetectRequest)

OnFaceDetectResponse = _reflection.GeneratedProtocolMessageType('OnFaceDetectResponse', (_message.Message,), {
  'DESCRIPTOR' : _ONFACEDETECTRESPONSE,
  '__module__' : 'facedetect_pb2'
  # @@protoc_insertion_point(class_scope:faceRecognition.OnFaceDetectResponse)
  })
_sym_db.RegisterMessage(OnFaceDetectResponse)

OnFaceSetFaceDetectRequest = _reflection.GeneratedProtocolMessageType('OnFaceSetFaceDetectRequest', (_message.Message,), {
  'DESCRIPTOR' : _ONFACESETFACEDETECTREQUEST,
  '__module__' : 'facedetect_pb2'
  # @@protoc_insertion_point(class_scope:faceRecognition.OnFaceSetFaceDetectRequest)
  })
_sym_db.RegisterMessage(OnFaceSetFaceDetectRequest)

OnFaceSetFaceDetectResponse = _reflection.GeneratedProtocolMessageType('OnFaceSetFaceDetectResponse', (_message.Message,), {
  'DESCRIPTOR' : _ONFACESETFACEDETECTRESPONSE,
  '__module__' : 'facedetect_pb2'
  # @@protoc_insertion_point(class_scope:faceRecognition.OnFaceSetFaceDetectResponse)
  })
_sym_db.RegisterMessage(OnFaceSetFaceDetectResponse)


DESCRIPTOR._options = None

_FACEDETECT = _descriptor.ServiceDescriptor(
  name='FaceDetect',
  full_name='faceRecognition.FaceDetect',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=1214,
  serialized_end=1527,
  methods=[
  _descriptor.MethodDescriptor(
    name='FromImage',
    full_name='faceRecognition.FaceDetect.FromImage',
    index=0,
    containing_service=None,
    input_type=_FROMIMAGEREQUEST,
    output_type=_FROMIMAGERESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='OnFaceDetect',
    full_name='faceRecognition.FaceDetect.OnFaceDetect',
    index=1,
    containing_service=None,
    input_type=_ONFACEDETECTREQUEST,
    output_type=_ONFACEDETECTRESPONSE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='OnFaceSetFaceDetect',
    full_name='faceRecognition.FaceDetect.OnFaceSetFaceDetect',
    index=2,
    containing_service=None,
    input_type=_ONFACESETFACEDETECTREQUEST,
    output_type=_ONFACESETFACEDETECTRESPONSE,
    serialized_options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_FACEDETECT)

DESCRIPTOR.services_by_name['FaceDetect'] = _FACEDETECT

# @@protoc_insertion_point(module_scope)
