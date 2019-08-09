// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensor.proto

// This CPP symbol can be defined to use imports that match up to the framework
// imports needed when using CocoaPods.
#if !defined(GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS)
 #define GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS 0
#endif

#if GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS
 #import <Protobuf/GPBProtocolBuffers_RuntimeSupport.h>
#else
 #import "GPBProtocolBuffers_RuntimeSupport.h"
#endif

#import <stdatomic.h>

#import "Sensor.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - SensorRoot

@implementation SensorRoot

// No extensions in the file and no imports, so no need to generate
// +extensionRegistry.

@end

#pragma mark - SensorRoot_FileDescriptor

static GPBFileDescriptor *SensorRoot_FileDescriptor(void) {
  // This is called by +initialize so there is no need to worry
  // about thread safety of the singleton.
  static GPBFileDescriptor *descriptor = NULL;
  if (!descriptor) {
    GPB_DEBUG_CHECK_RUNTIME_VERSIONS();
    descriptor = [[GPBFileDescriptor alloc] initWithPackage:@"sensorService"
                                                     syntax:GPBFileSyntaxProto3];
  }
  return descriptor;
}

#pragma mark - Enum DetectDirection

GPBEnumDescriptor *DetectDirection_EnumDescriptor(void) {
  static _Atomic(GPBEnumDescriptor*) descriptor = nil;
  if (!descriptor) {
    static const char *valueNames =
        "ZeroDir\000ReleaseDir\000Left\000Center\000Right\000";
    static const int32_t values[] = {
        DetectDirection_ZeroDir,
        DetectDirection_ReleaseDir,
        DetectDirection_Left,
        DetectDirection_Center,
        DetectDirection_Right,
    };
    static const char *extraTextFormatInfo = "\001\000\344\343\000";
    GPBEnumDescriptor *worker =
        [GPBEnumDescriptor allocDescriptorForName:GPBNSStringifySymbol(DetectDirection)
                                       valueNames:valueNames
                                           values:values
                                            count:(uint32_t)(sizeof(values) / sizeof(int32_t))
                                     enumVerifier:DetectDirection_IsValidValue
                              extraTextFormatInfo:extraTextFormatInfo];
    GPBEnumDescriptor *expected = nil;
    if (!atomic_compare_exchange_strong(&descriptor, &expected, worker)) {
      [worker release];
    }
  }
  return descriptor;
}

BOOL DetectDirection_IsValidValue(int32_t value__) {
  switch (value__) {
    case DetectDirection_ZeroDir:
    case DetectDirection_ReleaseDir:
    case DetectDirection_Left:
    case DetectDirection_Center:
    case DetectDirection_Right:
      return YES;
    default:
      return NO;
  }
}

#pragma mark - Enum DetectDistance

GPBEnumDescriptor *DetectDistance_EnumDescriptor(void) {
  static _Atomic(GPBEnumDescriptor*) descriptor = nil;
  if (!descriptor) {
    static const char *valueNames =
        "ZeroDis\000ReleaseDis\000Close\000Medium\000Long\000";
    static const int32_t values[] = {
        DetectDistance_ZeroDis,
        DetectDistance_ReleaseDis,
        DetectDistance_Close,
        DetectDistance_Medium,
        DetectDistance_Long,
    };
    static const char *extraTextFormatInfo = "\001\000\344\343\000";
    GPBEnumDescriptor *worker =
        [GPBEnumDescriptor allocDescriptorForName:GPBNSStringifySymbol(DetectDistance)
                                       valueNames:valueNames
                                           values:values
                                            count:(uint32_t)(sizeof(values) / sizeof(int32_t))
                                     enumVerifier:DetectDistance_IsValidValue
                              extraTextFormatInfo:extraTextFormatInfo];
    GPBEnumDescriptor *expected = nil;
    if (!atomic_compare_exchange_strong(&descriptor, &expected, worker)) {
      [worker release];
    }
  }
  return descriptor;
}

BOOL DetectDistance_IsValidValue(int32_t value__) {
  switch (value__) {
    case DetectDistance_ZeroDis:
    case DetectDistance_ReleaseDis:
    case DetectDistance_Close:
    case DetectDistance_Medium:
    case DetectDistance_Long:
      return YES;
    default:
      return NO;
  }
}

#pragma mark - Enum DataType

GPBEnumDescriptor *DataType_EnumDescriptor(void) {
  static _Atomic(GPBEnumDescriptor*) descriptor = nil;
  if (!descriptor) {
    static const char *valueNames =
        "Unknown\000Obs\000Agv\000Touch\000";
    static const int32_t values[] = {
        DataType_Unknown,
        DataType_Obs,
        DataType_Agv,
        DataType_Touch,
    };
    GPBEnumDescriptor *worker =
        [GPBEnumDescriptor allocDescriptorForName:GPBNSStringifySymbol(DataType)
                                       valueNames:valueNames
                                           values:values
                                            count:(uint32_t)(sizeof(values) / sizeof(int32_t))
                                     enumVerifier:DataType_IsValidValue];
    GPBEnumDescriptor *expected = nil;
    if (!atomic_compare_exchange_strong(&descriptor, &expected, worker)) {
      [worker release];
    }
  }
  return descriptor;
}

BOOL DataType_IsValidValue(int32_t value__) {
  switch (value__) {
    case DataType_Unknown:
    case DataType_Obs:
    case DataType_Agv:
    case DataType_Touch:
      return YES;
    default:
      return NO;
  }
}

#pragma mark - GetDetectRequest

@implementation GetDetectRequest


typedef struct GetDetectRequest__storage_ {
  uint32_t _has_storage_[1];
} GetDetectRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[GetDetectRequest class]
                                     rootClass:[SensorRoot class]
                                          file:SensorRoot_FileDescriptor()
                                        fields:NULL
                                    fieldCount:0
                                   storageSize:sizeof(GetDetectRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - GetDetectResponse

@implementation GetDetectResponse

@dynamic direction;
@dynamic distance;

typedef struct GetDetectResponse__storage_ {
  uint32_t _has_storage_[1];
  DetectDirection direction;
  DetectDistance distance;
} GetDetectResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "direction",
        .dataTypeSpecific.enumDescFunc = DetectDirection_EnumDescriptor,
        .number = GetDetectResponse_FieldNumber_Direction,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(GetDetectResponse__storage_, direction),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldHasEnumDescriptor),
        .dataType = GPBDataTypeEnum,
      },
      {
        .name = "distance",
        .dataTypeSpecific.enumDescFunc = DetectDistance_EnumDescriptor,
        .number = GetDetectResponse_FieldNumber_Distance,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(GetDetectResponse__storage_, distance),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldHasEnumDescriptor),
        .dataType = GPBDataTypeEnum,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[GetDetectResponse class]
                                     rootClass:[SensorRoot class]
                                          file:SensorRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(GetDetectResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

int32_t GetDetectResponse_Direction_RawValue(GetDetectResponse *message) {
  GPBDescriptor *descriptor = [GetDetectResponse descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:GetDetectResponse_FieldNumber_Direction];
  return GPBGetMessageInt32Field(message, field);
}

void SetGetDetectResponse_Direction_RawValue(GetDetectResponse *message, int32_t value) {
  GPBDescriptor *descriptor = [GetDetectResponse descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:GetDetectResponse_FieldNumber_Direction];
  GPBSetInt32IvarWithFieldInternal(message, field, value, descriptor.file.syntax);
}

int32_t GetDetectResponse_Distance_RawValue(GetDetectResponse *message) {
  GPBDescriptor *descriptor = [GetDetectResponse descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:GetDetectResponse_FieldNumber_Distance];
  return GPBGetMessageInt32Field(message, field);
}

void SetGetDetectResponse_Distance_RawValue(GetDetectResponse *message, int32_t value) {
  GPBDescriptor *descriptor = [GetDetectResponse descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:GetDetectResponse_FieldNumber_Distance];
  GPBSetInt32IvarWithFieldInternal(message, field, value, descriptor.file.syntax);
}

#pragma mark - GetMotionInductionRequest

@implementation GetMotionInductionRequest


typedef struct GetMotionInductionRequest__storage_ {
  uint32_t _has_storage_[1];
} GetMotionInductionRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[GetMotionInductionRequest class]
                                     rootClass:[SensorRoot class]
                                          file:SensorRoot_FileDescriptor()
                                        fields:NULL
                                    fieldCount:0
                                   storageSize:sizeof(GetMotionInductionRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - GetMotionInductionResponse

@implementation GetMotionInductionResponse

@dynamic left;
@dynamic right;

typedef struct GetMotionInductionResponse__storage_ {
  uint32_t _has_storage_[1];
} GetMotionInductionResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "left",
        .dataTypeSpecific.className = NULL,
        .number = GetMotionInductionResponse_FieldNumber_Left,
        .hasIndex = 0,
        .offset = 1,  // Stored in _has_storage_ to save space.
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeBool,
      },
      {
        .name = "right",
        .dataTypeSpecific.className = NULL,
        .number = GetMotionInductionResponse_FieldNumber_Right,
        .hasIndex = 2,
        .offset = 3,  // Stored in _has_storage_ to save space.
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeBool,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[GetMotionInductionResponse class]
                                     rootClass:[SensorRoot class]
                                          file:SensorRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(GetMotionInductionResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - GetTouchRequest

@implementation GetTouchRequest


typedef struct GetTouchRequest__storage_ {
  uint32_t _has_storage_[1];
} GetTouchRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[GetTouchRequest class]
                                     rootClass:[SensorRoot class]
                                          file:SensorRoot_FileDescriptor()
                                        fields:NULL
                                    fieldCount:0
                                   storageSize:sizeof(GetTouchRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - GetTouchResponse

@implementation GetTouchResponse

@dynamic handLeft;
@dynamic handRight;
@dynamic head;

typedef struct GetTouchResponse__storage_ {
  uint32_t _has_storage_[1];
} GetTouchResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "handLeft",
        .dataTypeSpecific.className = NULL,
        .number = GetTouchResponse_FieldNumber_HandLeft,
        .hasIndex = 0,
        .offset = 1,  // Stored in _has_storage_ to save space.
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeBool,
      },
      {
        .name = "handRight",
        .dataTypeSpecific.className = NULL,
        .number = GetTouchResponse_FieldNumber_HandRight,
        .hasIndex = 2,
        .offset = 3,  // Stored in _has_storage_ to save space.
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeBool,
      },
      {
        .name = "head",
        .dataTypeSpecific.className = NULL,
        .number = GetTouchResponse_FieldNumber_Head,
        .hasIndex = 4,
        .offset = 5,  // Stored in _has_storage_ to save space.
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeBool,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[GetTouchResponse class]
                                     rootClass:[SensorRoot class]
                                          file:SensorRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(GetTouchResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - DataObs

@implementation DataObs

@dynamic data_p, data_p_Count;

typedef struct DataObs__storage_ {
  uint32_t _has_storage_[1];
  GPBStringInt32Dictionary *data_p;
} DataObs__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "data_p",
        .dataTypeSpecific.className = NULL,
        .number = DataObs_FieldNumber_Data_p,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(DataObs__storage_, data_p),
        .flags = GPBFieldMapKeyString,
        .dataType = GPBDataTypeInt32,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[DataObs class]
                                     rootClass:[SensorRoot class]
                                          file:SensorRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(DataObs__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - DataAgv

@implementation DataAgv

@dynamic cardId;
@dynamic dataArray, dataArray_Count;

typedef struct DataAgv__storage_ {
  uint32_t _has_storage_[1];
  NSString *cardId;
  GPBBoolArray *dataArray;
} DataAgv__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "cardId",
        .dataTypeSpecific.className = NULL,
        .number = DataAgv_FieldNumber_CardId,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(DataAgv__storage_, cardId),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "dataArray",
        .dataTypeSpecific.className = NULL,
        .number = DataAgv_FieldNumber_DataArray,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(DataAgv__storage_, dataArray),
        .flags = (GPBFieldFlags)(GPBFieldRepeated | GPBFieldPacked),
        .dataType = GPBDataTypeBool,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[DataAgv class]
                                     rootClass:[SensorRoot class]
                                          file:SensorRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(DataAgv__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - DataTouch

@implementation DataTouch

@dynamic touched, touched_Count;

typedef struct DataTouch__storage_ {
  uint32_t _has_storage_[1];
  GPBStringBoolDictionary *touched;
} DataTouch__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "touched",
        .dataTypeSpecific.className = NULL,
        .number = DataTouch_FieldNumber_Touched,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(DataTouch__storage_, touched),
        .flags = GPBFieldMapKeyString,
        .dataType = GPBDataTypeBool,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[DataTouch class]
                                     rootClass:[SensorRoot class]
                                          file:SensorRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(DataTouch__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - UpdateReq

@implementation UpdateReq

@dynamic dtype;
@dynamic hasObs, obs;
@dynamic hasAgv, agv;
@dynamic hasTouch, touch;

typedef struct UpdateReq__storage_ {
  uint32_t _has_storage_[1];
  DataType dtype;
  DataObs *obs;
  DataAgv *agv;
  DataTouch *touch;
} UpdateReq__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "dtype",
        .dataTypeSpecific.enumDescFunc = DataType_EnumDescriptor,
        .number = UpdateReq_FieldNumber_Dtype,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(UpdateReq__storage_, dtype),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldHasEnumDescriptor),
        .dataType = GPBDataTypeEnum,
      },
      {
        .name = "obs",
        .dataTypeSpecific.className = GPBStringifySymbol(DataObs),
        .number = UpdateReq_FieldNumber_Obs,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(UpdateReq__storage_, obs),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "agv",
        .dataTypeSpecific.className = GPBStringifySymbol(DataAgv),
        .number = UpdateReq_FieldNumber_Agv,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(UpdateReq__storage_, agv),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "touch",
        .dataTypeSpecific.className = GPBStringifySymbol(DataTouch),
        .number = UpdateReq_FieldNumber_Touch,
        .hasIndex = 3,
        .offset = (uint32_t)offsetof(UpdateReq__storage_, touch),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[UpdateReq class]
                                     rootClass:[SensorRoot class]
                                          file:SensorRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(UpdateReq__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

int32_t UpdateReq_Dtype_RawValue(UpdateReq *message) {
  GPBDescriptor *descriptor = [UpdateReq descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:UpdateReq_FieldNumber_Dtype];
  return GPBGetMessageInt32Field(message, field);
}

void SetUpdateReq_Dtype_RawValue(UpdateReq *message, int32_t value) {
  GPBDescriptor *descriptor = [UpdateReq descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:UpdateReq_FieldNumber_Dtype];
  GPBSetInt32IvarWithFieldInternal(message, field, value, descriptor.file.syntax);
}

#pragma mark - RawRequest

@implementation RawRequest


typedef struct RawRequest__storage_ {
  uint32_t _has_storage_[1];
} RawRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[RawRequest class]
                                     rootClass:[SensorRoot class]
                                          file:SensorRoot_FileDescriptor()
                                        fields:NULL
                                    fieldCount:0
                                   storageSize:sizeof(RawRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - RawResponse

@implementation RawResponse

@dynamic dtype;
@dynamic hasObs, obs;
@dynamic hasAgv, agv;
@dynamic hasTouch, touch;

typedef struct RawResponse__storage_ {
  uint32_t _has_storage_[1];
  DataType dtype;
  DataObs *obs;
  DataAgv *agv;
  DataTouch *touch;
} RawResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "dtype",
        .dataTypeSpecific.enumDescFunc = DataType_EnumDescriptor,
        .number = RawResponse_FieldNumber_Dtype,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(RawResponse__storage_, dtype),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldHasEnumDescriptor),
        .dataType = GPBDataTypeEnum,
      },
      {
        .name = "obs",
        .dataTypeSpecific.className = GPBStringifySymbol(DataObs),
        .number = RawResponse_FieldNumber_Obs,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(RawResponse__storage_, obs),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "agv",
        .dataTypeSpecific.className = GPBStringifySymbol(DataAgv),
        .number = RawResponse_FieldNumber_Agv,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(RawResponse__storage_, agv),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "touch",
        .dataTypeSpecific.className = GPBStringifySymbol(DataTouch),
        .number = RawResponse_FieldNumber_Touch,
        .hasIndex = 3,
        .offset = (uint32_t)offsetof(RawResponse__storage_, touch),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[RawResponse class]
                                     rootClass:[SensorRoot class]
                                          file:SensorRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(RawResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

int32_t RawResponse_Dtype_RawValue(RawResponse *message) {
  GPBDescriptor *descriptor = [RawResponse descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:RawResponse_FieldNumber_Dtype];
  return GPBGetMessageInt32Field(message, field);
}

void SetRawResponse_Dtype_RawValue(RawResponse *message, int32_t value) {
  GPBDescriptor *descriptor = [RawResponse descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:RawResponse_FieldNumber_Dtype];
  GPBSetInt32IvarWithFieldInternal(message, field, value, descriptor.file.syntax);
}


#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)
