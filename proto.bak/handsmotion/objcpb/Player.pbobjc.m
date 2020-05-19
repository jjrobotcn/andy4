// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: player.proto

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

#import "Player.pbobjc.h"
#import "google/api/Annotations.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"
#pragma clang diagnostic ignored "-Wdirect-ivar-access"

#pragma mark - PlayerRoot

@implementation PlayerRoot

+ (GPBExtensionRegistry*)extensionRegistry {
  // This is called by +initialize so there is no need to worry
  // about thread safety and initialization of registry.
  static GPBExtensionRegistry* registry = nil;
  if (!registry) {
    GPB_DEBUG_CHECK_RUNTIME_VERSIONS();
    registry = [[GPBExtensionRegistry alloc] init];
    // Merge in the imports (direct or indirect) that defined extensions.
    [registry addExtensions:[GAPIAnnotationsRoot extensionRegistry]];
  }
  return registry;
}

@end

#pragma mark - PlayerRoot_FileDescriptor

static GPBFileDescriptor *PlayerRoot_FileDescriptor(void) {
  // This is called by +initialize so there is no need to worry
  // about thread safety of the singleton.
  static GPBFileDescriptor *descriptor = NULL;
  if (!descriptor) {
    GPB_DEBUG_CHECK_RUNTIME_VERSIONS();
    descriptor = [[GPBFileDescriptor alloc] initWithPackage:@"handsmotion"
                                                     syntax:GPBFileSyntaxProto3];
  }
  return descriptor;
}

#pragma mark - Enum PlayerState

GPBEnumDescriptor *PlayerState_EnumDescriptor(void) {
  static _Atomic(GPBEnumDescriptor*) descriptor = nil;
  if (!descriptor) {
    static const char *valueNames =
        "Unknown\000Stopped\000Playing\000";
    static const int32_t values[] = {
        PlayerState_Unknown,
        PlayerState_Stopped,
        PlayerState_Playing,
    };
    GPBEnumDescriptor *worker =
        [GPBEnumDescriptor allocDescriptorForName:GPBNSStringifySymbol(PlayerState)
                                       valueNames:valueNames
                                           values:values
                                            count:(uint32_t)(sizeof(values) / sizeof(int32_t))
                                     enumVerifier:PlayerState_IsValidValue];
    GPBEnumDescriptor *expected = nil;
    if (!atomic_compare_exchange_strong(&descriptor, &expected, worker)) {
      [worker release];
    }
  }
  return descriptor;
}

BOOL PlayerState_IsValidValue(int32_t value__) {
  switch (value__) {
    case PlayerState_Unknown:
    case PlayerState_Stopped:
    case PlayerState_Playing:
      return YES;
    default:
      return NO;
  }
}

#pragma mark - Uri

@implementation Uri

@dynamic id_p;
@dynamic name;

typedef struct Uri__storage_ {
  uint32_t _has_storage_[1];
  NSString *id_p;
  NSString *name;
} Uri__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "id_p",
        .dataTypeSpecific.className = NULL,
        .number = Uri_FieldNumber_Id_p,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(Uri__storage_, id_p),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "name",
        .dataTypeSpecific.className = NULL,
        .number = Uri_FieldNumber_Name,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(Uri__storage_, name),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[Uri class]
                                     rootClass:[PlayerRoot class]
                                          file:PlayerRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(Uri__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - PlayRequest

@implementation PlayRequest

@dynamic uriOneOfCase;
@dynamic id_p;
@dynamic name;
@dynamic repeated;
@dynamic repeatedIntervalMs;

typedef struct PlayRequest__storage_ {
  uint32_t _has_storage_[2];
  int32_t repeated;
  uint32_t repeatedIntervalMs;
  NSString *id_p;
  NSString *name;
} PlayRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "id_p",
        .dataTypeSpecific.className = NULL,
        .number = PlayRequest_FieldNumber_Id_p,
        .hasIndex = -1,
        .offset = (uint32_t)offsetof(PlayRequest__storage_, id_p),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "name",
        .dataTypeSpecific.className = NULL,
        .number = PlayRequest_FieldNumber_Name,
        .hasIndex = -1,
        .offset = (uint32_t)offsetof(PlayRequest__storage_, name),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "repeated",
        .dataTypeSpecific.className = NULL,
        .number = PlayRequest_FieldNumber_Repeated,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(PlayRequest__storage_, repeated),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeInt32,
      },
      {
        .name = "repeatedIntervalMs",
        .dataTypeSpecific.className = NULL,
        .number = PlayRequest_FieldNumber_RepeatedIntervalMs,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(PlayRequest__storage_, repeatedIntervalMs),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeUInt32,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[PlayRequest class]
                                     rootClass:[PlayerRoot class]
                                          file:PlayerRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(PlayRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    static const char *oneofs[] = {
      "uri",
    };
    [localDescriptor setupOneofs:oneofs
                           count:(uint32_t)(sizeof(oneofs) / sizeof(char*))
                   firstHasIndex:-1];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

void PlayRequest_ClearUriOneOfCase(PlayRequest *message) {
  GPBDescriptor *descriptor = [message descriptor];
  GPBOneofDescriptor *oneof = [descriptor.oneofs objectAtIndex:0];
  GPBMaybeClearOneof(message, oneof, -1, 0);
}
#pragma mark - PlayResponse

@implementation PlayResponse


typedef struct PlayResponse__storage_ {
  uint32_t _has_storage_[1];
} PlayResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[PlayResponse class]
                                     rootClass:[PlayerRoot class]
                                          file:PlayerRoot_FileDescriptor()
                                        fields:NULL
                                    fieldCount:0
                                   storageSize:sizeof(PlayResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - StopRequest

@implementation StopRequest


typedef struct StopRequest__storage_ {
  uint32_t _has_storage_[1];
} StopRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[StopRequest class]
                                     rootClass:[PlayerRoot class]
                                          file:PlayerRoot_FileDescriptor()
                                        fields:NULL
                                    fieldCount:0
                                   storageSize:sizeof(StopRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - StopResponse

@implementation StopResponse


typedef struct StopResponse__storage_ {
  uint32_t _has_storage_[1];
} StopResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[StopResponse class]
                                     rootClass:[PlayerRoot class]
                                          file:PlayerRoot_FileDescriptor()
                                        fields:NULL
                                    fieldCount:0
                                   storageSize:sizeof(StopResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - ResetRequest

@implementation ResetRequest


typedef struct ResetRequest__storage_ {
  uint32_t _has_storage_[1];
} ResetRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[ResetRequest class]
                                     rootClass:[PlayerRoot class]
                                          file:PlayerRoot_FileDescriptor()
                                        fields:NULL
                                    fieldCount:0
                                   storageSize:sizeof(ResetRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - ResetResponse

@implementation ResetResponse


typedef struct ResetResponse__storage_ {
  uint32_t _has_storage_[1];
} ResetResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[ResetResponse class]
                                     rootClass:[PlayerRoot class]
                                          file:PlayerRoot_FileDescriptor()
                                        fields:NULL
                                    fieldCount:0
                                   storageSize:sizeof(ResetResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - PlaylistRequest

@implementation PlaylistRequest


typedef struct PlaylistRequest__storage_ {
  uint32_t _has_storage_[1];
} PlaylistRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[PlaylistRequest class]
                                     rootClass:[PlayerRoot class]
                                          file:PlayerRoot_FileDescriptor()
                                        fields:NULL
                                    fieldCount:0
                                   storageSize:sizeof(PlaylistRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - PlaylistResponse

@implementation PlaylistResponse

@dynamic playlistArray, playlistArray_Count;

typedef struct PlaylistResponse__storage_ {
  uint32_t _has_storage_[1];
  NSMutableArray *playlistArray;
} PlaylistResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "playlistArray",
        .dataTypeSpecific.className = GPBStringifySymbol(Uri),
        .number = PlaylistResponse_FieldNumber_PlaylistArray,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(PlaylistResponse__storage_, playlistArray),
        .flags = GPBFieldRepeated,
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[PlaylistResponse class]
                                     rootClass:[PlayerRoot class]
                                          file:PlayerRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(PlaylistResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - StateRequest

@implementation StateRequest


typedef struct StateRequest__storage_ {
  uint32_t _has_storage_[1];
} StateRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[StateRequest class]
                                     rootClass:[PlayerRoot class]
                                          file:PlayerRoot_FileDescriptor()
                                        fields:NULL
                                    fieldCount:0
                                   storageSize:sizeof(StateRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - StateResponse

@implementation StateResponse

@dynamic state;
@dynamic hasUri, uri;

typedef struct StateResponse__storage_ {
  uint32_t _has_storage_[1];
  PlayerState state;
  Uri *uri;
} StateResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "state",
        .dataTypeSpecific.enumDescFunc = PlayerState_EnumDescriptor,
        .number = StateResponse_FieldNumber_State,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(StateResponse__storage_, state),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldHasEnumDescriptor),
        .dataType = GPBDataTypeEnum,
      },
      {
        .name = "uri",
        .dataTypeSpecific.className = GPBStringifySymbol(Uri),
        .number = StateResponse_FieldNumber_Uri,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(StateResponse__storage_, uri),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[StateResponse class]
                                     rootClass:[PlayerRoot class]
                                          file:PlayerRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(StateResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

int32_t StateResponse_State_RawValue(StateResponse *message) {
  GPBDescriptor *descriptor = [StateResponse descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:StateResponse_FieldNumber_State];
  return GPBGetMessageInt32Field(message, field);
}

void SetStateResponse_State_RawValue(StateResponse *message, int32_t value) {
  GPBDescriptor *descriptor = [StateResponse descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:StateResponse_FieldNumber_State];
  GPBSetInt32IvarWithFieldInternal(message, field, value, descriptor.file.syntax);
}

#pragma mark - OnStateChangeRequest

@implementation OnStateChangeRequest


typedef struct OnStateChangeRequest__storage_ {
  uint32_t _has_storage_[1];
} OnStateChangeRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[OnStateChangeRequest class]
                                     rootClass:[PlayerRoot class]
                                          file:PlayerRoot_FileDescriptor()
                                        fields:NULL
                                    fieldCount:0
                                   storageSize:sizeof(OnStateChangeRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - OnStateChangeResponse

@implementation OnStateChangeResponse

@dynamic state;
@dynamic hasUri, uri;

typedef struct OnStateChangeResponse__storage_ {
  uint32_t _has_storage_[1];
  PlayerState state;
  Uri *uri;
} OnStateChangeResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "state",
        .dataTypeSpecific.enumDescFunc = PlayerState_EnumDescriptor,
        .number = OnStateChangeResponse_FieldNumber_State,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(OnStateChangeResponse__storage_, state),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldHasEnumDescriptor),
        .dataType = GPBDataTypeEnum,
      },
      {
        .name = "uri",
        .dataTypeSpecific.className = GPBStringifySymbol(Uri),
        .number = OnStateChangeResponse_FieldNumber_Uri,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(OnStateChangeResponse__storage_, uri),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[OnStateChangeResponse class]
                                     rootClass:[PlayerRoot class]
                                          file:PlayerRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(OnStateChangeResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

int32_t OnStateChangeResponse_State_RawValue(OnStateChangeResponse *message) {
  GPBDescriptor *descriptor = [OnStateChangeResponse descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:OnStateChangeResponse_FieldNumber_State];
  return GPBGetMessageInt32Field(message, field);
}

void SetOnStateChangeResponse_State_RawValue(OnStateChangeResponse *message, int32_t value) {
  GPBDescriptor *descriptor = [OnStateChangeResponse descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:OnStateChangeResponse_FieldNumber_State];
  GPBSetInt32IvarWithFieldInternal(message, field, value, descriptor.file.syntax);
}


#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)