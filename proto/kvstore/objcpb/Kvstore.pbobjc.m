// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kvstore.proto

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

#import "Kvstore.pbobjc.h"
#import "google/api/Annotations.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - KvstoreRoot

@implementation KvstoreRoot

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

#pragma mark - KvstoreRoot_FileDescriptor

static GPBFileDescriptor *KvstoreRoot_FileDescriptor(void) {
  // This is called by +initialize so there is no need to worry
  // about thread safety of the singleton.
  static GPBFileDescriptor *descriptor = NULL;
  if (!descriptor) {
    GPB_DEBUG_CHECK_RUNTIME_VERSIONS();
    descriptor = [[GPBFileDescriptor alloc] initWithPackage:@"kvstore"
                                                     syntax:GPBFileSyntaxProto3];
  }
  return descriptor;
}

#pragma mark - PutRequest

@implementation PutRequest

@dynamic key;
@dynamic value;

typedef struct PutRequest__storage_ {
  uint32_t _has_storage_[1];
  NSString *key;
  NSData *value;
} PutRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "key",
        .dataTypeSpecific.className = NULL,
        .number = PutRequest_FieldNumber_Key,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(PutRequest__storage_, key),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "value",
        .dataTypeSpecific.className = NULL,
        .number = PutRequest_FieldNumber_Value,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(PutRequest__storage_, value),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeBytes,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[PutRequest class]
                                     rootClass:[KvstoreRoot class]
                                          file:KvstoreRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(PutRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - PutResponse

@implementation PutResponse


typedef struct PutResponse__storage_ {
  uint32_t _has_storage_[1];
} PutResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[PutResponse class]
                                     rootClass:[KvstoreRoot class]
                                          file:KvstoreRoot_FileDescriptor()
                                        fields:NULL
                                    fieldCount:0
                                   storageSize:sizeof(PutResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - GetRequest

@implementation GetRequest

@dynamic key;

typedef struct GetRequest__storage_ {
  uint32_t _has_storage_[1];
  NSString *key;
} GetRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "key",
        .dataTypeSpecific.className = NULL,
        .number = GetRequest_FieldNumber_Key,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(GetRequest__storage_, key),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[GetRequest class]
                                     rootClass:[KvstoreRoot class]
                                          file:KvstoreRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(GetRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - GetResponse

@implementation GetResponse

@dynamic value;

typedef struct GetResponse__storage_ {
  uint32_t _has_storage_[1];
  NSData *value;
} GetResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "value",
        .dataTypeSpecific.className = NULL,
        .number = GetResponse_FieldNumber_Value,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(GetResponse__storage_, value),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeBytes,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[GetResponse class]
                                     rootClass:[KvstoreRoot class]
                                          file:KvstoreRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(GetResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - GetPrefixRequest

@implementation GetPrefixRequest

@dynamic keyPrefix;

typedef struct GetPrefixRequest__storage_ {
  uint32_t _has_storage_[1];
  NSString *keyPrefix;
} GetPrefixRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "keyPrefix",
        .dataTypeSpecific.className = NULL,
        .number = GetPrefixRequest_FieldNumber_KeyPrefix,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(GetPrefixRequest__storage_, keyPrefix),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[GetPrefixRequest class]
                                     rootClass:[KvstoreRoot class]
                                          file:KvstoreRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(GetPrefixRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - GetPrefixResponse

@implementation GetPrefixResponse

@dynamic matchesArray, matchesArray_Count;

typedef struct GetPrefixResponse__storage_ {
  uint32_t _has_storage_[1];
  NSMutableArray *matchesArray;
} GetPrefixResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "matchesArray",
        .dataTypeSpecific.className = GPBStringifySymbol(GetPrefixResponse_Match),
        .number = GetPrefixResponse_FieldNumber_MatchesArray,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(GetPrefixResponse__storage_, matchesArray),
        .flags = GPBFieldRepeated,
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[GetPrefixResponse class]
                                     rootClass:[KvstoreRoot class]
                                          file:KvstoreRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(GetPrefixResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - GetPrefixResponse_Match

@implementation GetPrefixResponse_Match

@dynamic key;
@dynamic value;

typedef struct GetPrefixResponse_Match__storage_ {
  uint32_t _has_storage_[1];
  NSString *key;
  NSData *value;
} GetPrefixResponse_Match__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "key",
        .dataTypeSpecific.className = NULL,
        .number = GetPrefixResponse_Match_FieldNumber_Key,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(GetPrefixResponse_Match__storage_, key),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "value",
        .dataTypeSpecific.className = NULL,
        .number = GetPrefixResponse_Match_FieldNumber_Value,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(GetPrefixResponse_Match__storage_, value),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeBytes,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[GetPrefixResponse_Match class]
                                     rootClass:[KvstoreRoot class]
                                          file:KvstoreRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(GetPrefixResponse_Match__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    [localDescriptor setupContainingMessageClassName:GPBStringifySymbol(GetPrefixResponse)];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - GetPrefixStreamRequest

@implementation GetPrefixStreamRequest

@dynamic keyPrefix;

typedef struct GetPrefixStreamRequest__storage_ {
  uint32_t _has_storage_[1];
  NSString *keyPrefix;
} GetPrefixStreamRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "keyPrefix",
        .dataTypeSpecific.className = NULL,
        .number = GetPrefixStreamRequest_FieldNumber_KeyPrefix,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(GetPrefixStreamRequest__storage_, keyPrefix),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[GetPrefixStreamRequest class]
                                     rootClass:[KvstoreRoot class]
                                          file:KvstoreRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(GetPrefixStreamRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - GetPrefixStreamResponse

@implementation GetPrefixStreamResponse

@dynamic key;
@dynamic value;

typedef struct GetPrefixStreamResponse__storage_ {
  uint32_t _has_storage_[1];
  NSString *key;
  NSData *value;
} GetPrefixStreamResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "key",
        .dataTypeSpecific.className = NULL,
        .number = GetPrefixStreamResponse_FieldNumber_Key,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(GetPrefixStreamResponse__storage_, key),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "value",
        .dataTypeSpecific.className = NULL,
        .number = GetPrefixStreamResponse_FieldNumber_Value,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(GetPrefixStreamResponse__storage_, value),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeBytes,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[GetPrefixStreamResponse class]
                                     rootClass:[KvstoreRoot class]
                                          file:KvstoreRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(GetPrefixStreamResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - DeleteRequest

@implementation DeleteRequest

@dynamic key;

typedef struct DeleteRequest__storage_ {
  uint32_t _has_storage_[1];
  NSString *key;
} DeleteRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "key",
        .dataTypeSpecific.className = NULL,
        .number = DeleteRequest_FieldNumber_Key,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(DeleteRequest__storage_, key),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[DeleteRequest class]
                                     rootClass:[KvstoreRoot class]
                                          file:KvstoreRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(DeleteRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - DeleteResponse

@implementation DeleteResponse


typedef struct DeleteResponse__storage_ {
  uint32_t _has_storage_[1];
} DeleteResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[DeleteResponse class]
                                     rootClass:[KvstoreRoot class]
                                          file:KvstoreRoot_FileDescriptor()
                                        fields:NULL
                                    fieldCount:0
                                   storageSize:sizeof(DeleteResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end


#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)