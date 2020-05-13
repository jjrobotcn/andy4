// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: faceset.proto

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

#import "Faceset.pbobjc.h"
#import "google/api/Annotations.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - FacesetRoot

@implementation FacesetRoot

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

#pragma mark - FacesetRoot_FileDescriptor

static GPBFileDescriptor *FacesetRoot_FileDescriptor(void) {
  // This is called by +initialize so there is no need to worry
  // about thread safety of the singleton.
  static GPBFileDescriptor *descriptor = NULL;
  if (!descriptor) {
    GPB_DEBUG_CHECK_RUNTIME_VERSIONS();
    descriptor = [[GPBFileDescriptor alloc] initWithPackage:@"faceRecognition"
                                                     syntax:GPBFileSyntaxProto3];
  }
  return descriptor;
}

#pragma mark - FaceSet

@implementation FaceSet

@dynamic id_p;
@dynamic name;

typedef struct FaceSet__storage_ {
  uint32_t _has_storage_[1];
  NSString *id_p;
  NSString *name;
} FaceSet__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "id_p",
        .dataTypeSpecific.className = NULL,
        .number = FaceSet_FieldNumber_Id_p,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(FaceSet__storage_, id_p),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "name",
        .dataTypeSpecific.className = NULL,
        .number = FaceSet_FieldNumber_Name,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(FaceSet__storage_, name),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[FaceSet class]
                                     rootClass:[FacesetRoot class]
                                          file:FacesetRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(FaceSet__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - FaceDetail

@implementation FaceDetail

@dynamic faceToken;
@dynamic faceImg;
@dynamic detail, detail_Count;

typedef struct FaceDetail__storage_ {
  uint32_t _has_storage_[1];
  NSString *faceToken;
  NSData *faceImg;
  NSMutableDictionary *detail;
} FaceDetail__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "faceToken",
        .dataTypeSpecific.className = NULL,
        .number = FaceDetail_FieldNumber_FaceToken,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(FaceDetail__storage_, faceToken),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "faceImg",
        .dataTypeSpecific.className = NULL,
        .number = FaceDetail_FieldNumber_FaceImg,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(FaceDetail__storage_, faceImg),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeBytes,
      },
      {
        .name = "detail",
        .dataTypeSpecific.className = NULL,
        .number = FaceDetail_FieldNumber_Detail,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(FaceDetail__storage_, detail),
        .flags = GPBFieldMapKeyString,
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[FaceDetail class]
                                     rootClass:[FacesetRoot class]
                                          file:FacesetRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(FaceDetail__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - NewFaceSetRequest

@implementation NewFaceSetRequest

@dynamic name;

typedef struct NewFaceSetRequest__storage_ {
  uint32_t _has_storage_[1];
  NSString *name;
} NewFaceSetRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "name",
        .dataTypeSpecific.className = NULL,
        .number = NewFaceSetRequest_FieldNumber_Name,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(NewFaceSetRequest__storage_, name),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[NewFaceSetRequest class]
                                     rootClass:[FacesetRoot class]
                                          file:FacesetRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(NewFaceSetRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - NewFaceSetResponse

@implementation NewFaceSetResponse

@dynamic hasFaceSet, faceSet;

typedef struct NewFaceSetResponse__storage_ {
  uint32_t _has_storage_[1];
  FaceSet *faceSet;
} NewFaceSetResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "faceSet",
        .dataTypeSpecific.className = GPBStringifySymbol(FaceSet),
        .number = NewFaceSetResponse_FieldNumber_FaceSet,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(NewFaceSetResponse__storage_, faceSet),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[NewFaceSetResponse class]
                                     rootClass:[FacesetRoot class]
                                          file:FacesetRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(NewFaceSetResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - DeleteFaceSetRequest

@implementation DeleteFaceSetRequest

@dynamic faceSetId;

typedef struct DeleteFaceSetRequest__storage_ {
  uint32_t _has_storage_[1];
  NSString *faceSetId;
} DeleteFaceSetRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "faceSetId",
        .dataTypeSpecific.className = NULL,
        .number = DeleteFaceSetRequest_FieldNumber_FaceSetId,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(DeleteFaceSetRequest__storage_, faceSetId),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[DeleteFaceSetRequest class]
                                     rootClass:[FacesetRoot class]
                                          file:FacesetRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(DeleteFaceSetRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - DeleteFaceSetResponse

@implementation DeleteFaceSetResponse


typedef struct DeleteFaceSetResponse__storage_ {
  uint32_t _has_storage_[1];
} DeleteFaceSetResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[DeleteFaceSetResponse class]
                                     rootClass:[FacesetRoot class]
                                          file:FacesetRoot_FileDescriptor()
                                        fields:NULL
                                    fieldCount:0
                                   storageSize:sizeof(DeleteFaceSetResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - UpdateFaceSetRequest

@implementation UpdateFaceSetRequest

@dynamic hasFaceSet, faceSet;

typedef struct UpdateFaceSetRequest__storage_ {
  uint32_t _has_storage_[1];
  FaceSet *faceSet;
} UpdateFaceSetRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "faceSet",
        .dataTypeSpecific.className = GPBStringifySymbol(FaceSet),
        .number = UpdateFaceSetRequest_FieldNumber_FaceSet,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(UpdateFaceSetRequest__storage_, faceSet),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[UpdateFaceSetRequest class]
                                     rootClass:[FacesetRoot class]
                                          file:FacesetRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(UpdateFaceSetRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - UpdateFaceSetResponse

@implementation UpdateFaceSetResponse

@dynamic hasFaceSet, faceSet;

typedef struct UpdateFaceSetResponse__storage_ {
  uint32_t _has_storage_[1];
  FaceSet *faceSet;
} UpdateFaceSetResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "faceSet",
        .dataTypeSpecific.className = GPBStringifySymbol(FaceSet),
        .number = UpdateFaceSetResponse_FieldNumber_FaceSet,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(UpdateFaceSetResponse__storage_, faceSet),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[UpdateFaceSetResponse class]
                                     rootClass:[FacesetRoot class]
                                          file:FacesetRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(UpdateFaceSetResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - ListFaceSetsRequest

@implementation ListFaceSetsRequest


typedef struct ListFaceSetsRequest__storage_ {
  uint32_t _has_storage_[1];
} ListFaceSetsRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[ListFaceSetsRequest class]
                                     rootClass:[FacesetRoot class]
                                          file:FacesetRoot_FileDescriptor()
                                        fields:NULL
                                    fieldCount:0
                                   storageSize:sizeof(ListFaceSetsRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - ListFaceSetsResponse

@implementation ListFaceSetsResponse

@dynamic faceSetsArray, faceSetsArray_Count;

typedef struct ListFaceSetsResponse__storage_ {
  uint32_t _has_storage_[1];
  NSMutableArray *faceSetsArray;
} ListFaceSetsResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "faceSetsArray",
        .dataTypeSpecific.className = GPBStringifySymbol(FaceSet),
        .number = ListFaceSetsResponse_FieldNumber_FaceSetsArray,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(ListFaceSetsResponse__storage_, faceSetsArray),
        .flags = GPBFieldRepeated,
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[ListFaceSetsResponse class]
                                     rootClass:[FacesetRoot class]
                                          file:FacesetRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(ListFaceSetsResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - AddFaceRequest

@implementation AddFaceRequest

@dynamic faceSetId;
@dynamic faceImg;
@dynamic detail, detail_Count;

typedef struct AddFaceRequest__storage_ {
  uint32_t _has_storage_[1];
  NSString *faceSetId;
  NSData *faceImg;
  NSMutableDictionary *detail;
} AddFaceRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "faceSetId",
        .dataTypeSpecific.className = NULL,
        .number = AddFaceRequest_FieldNumber_FaceSetId,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(AddFaceRequest__storage_, faceSetId),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "faceImg",
        .dataTypeSpecific.className = NULL,
        .number = AddFaceRequest_FieldNumber_FaceImg,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(AddFaceRequest__storage_, faceImg),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeBytes,
      },
      {
        .name = "detail",
        .dataTypeSpecific.className = NULL,
        .number = AddFaceRequest_FieldNumber_Detail,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(AddFaceRequest__storage_, detail),
        .flags = GPBFieldMapKeyString,
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[AddFaceRequest class]
                                     rootClass:[FacesetRoot class]
                                          file:FacesetRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(AddFaceRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - AddFaceResponse

@implementation AddFaceResponse

@dynamic faceToken;

typedef struct AddFaceResponse__storage_ {
  uint32_t _has_storage_[1];
  NSString *faceToken;
} AddFaceResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "faceToken",
        .dataTypeSpecific.className = NULL,
        .number = AddFaceResponse_FieldNumber_FaceToken,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(AddFaceResponse__storage_, faceToken),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[AddFaceResponse class]
                                     rootClass:[FacesetRoot class]
                                          file:FacesetRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(AddFaceResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - RemoveFaceRequest

@implementation RemoveFaceRequest

@dynamic faceSetId;
@dynamic faceToken;

typedef struct RemoveFaceRequest__storage_ {
  uint32_t _has_storage_[1];
  NSString *faceSetId;
  NSString *faceToken;
} RemoveFaceRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "faceSetId",
        .dataTypeSpecific.className = NULL,
        .number = RemoveFaceRequest_FieldNumber_FaceSetId,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(RemoveFaceRequest__storage_, faceSetId),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "faceToken",
        .dataTypeSpecific.className = NULL,
        .number = RemoveFaceRequest_FieldNumber_FaceToken,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(RemoveFaceRequest__storage_, faceToken),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[RemoveFaceRequest class]
                                     rootClass:[FacesetRoot class]
                                          file:FacesetRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(RemoveFaceRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - RemoveFaceResponse

@implementation RemoveFaceResponse


typedef struct RemoveFaceResponse__storage_ {
  uint32_t _has_storage_[1];
} RemoveFaceResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[RemoveFaceResponse class]
                                     rootClass:[FacesetRoot class]
                                          file:FacesetRoot_FileDescriptor()
                                        fields:NULL
                                    fieldCount:0
                                   storageSize:sizeof(RemoveFaceResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - FaceDetailRequest

@implementation FaceDetailRequest

@dynamic faceSetId;
@dynamic faceToken;
@dynamic withFaceImg;

typedef struct FaceDetailRequest__storage_ {
  uint32_t _has_storage_[1];
  NSString *faceSetId;
  NSString *faceToken;
} FaceDetailRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "faceSetId",
        .dataTypeSpecific.className = NULL,
        .number = FaceDetailRequest_FieldNumber_FaceSetId,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(FaceDetailRequest__storage_, faceSetId),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "faceToken",
        .dataTypeSpecific.className = NULL,
        .number = FaceDetailRequest_FieldNumber_FaceToken,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(FaceDetailRequest__storage_, faceToken),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "withFaceImg",
        .dataTypeSpecific.className = NULL,
        .number = FaceDetailRequest_FieldNumber_WithFaceImg,
        .hasIndex = 2,
        .offset = 3,  // Stored in _has_storage_ to save space.
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeBool,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[FaceDetailRequest class]
                                     rootClass:[FacesetRoot class]
                                          file:FacesetRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(FaceDetailRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - FaceDetailResponse

@implementation FaceDetailResponse

@dynamic hasFaceDetail, faceDetail;

typedef struct FaceDetailResponse__storage_ {
  uint32_t _has_storage_[1];
  FaceDetail *faceDetail;
} FaceDetailResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "faceDetail",
        .dataTypeSpecific.className = GPBStringifySymbol(FaceDetail),
        .number = FaceDetailResponse_FieldNumber_FaceDetail,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(FaceDetailResponse__storage_, faceDetail),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[FaceDetailResponse class]
                                     rootClass:[FacesetRoot class]
                                          file:FacesetRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(FaceDetailResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - ListFaceDetailsRequest

@implementation ListFaceDetailsRequest

@dynamic faceSetId;
@dynamic limit;
@dynamic offset;

typedef struct ListFaceDetailsRequest__storage_ {
  uint32_t _has_storage_[1];
  uint32_t limit;
  uint32_t offset;
  NSString *faceSetId;
} ListFaceDetailsRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "faceSetId",
        .dataTypeSpecific.className = NULL,
        .number = ListFaceDetailsRequest_FieldNumber_FaceSetId,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(ListFaceDetailsRequest__storage_, faceSetId),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "limit",
        .dataTypeSpecific.className = NULL,
        .number = ListFaceDetailsRequest_FieldNumber_Limit,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(ListFaceDetailsRequest__storage_, limit),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeUInt32,
      },
      {
        .name = "offset",
        .dataTypeSpecific.className = NULL,
        .number = ListFaceDetailsRequest_FieldNumber_Offset,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(ListFaceDetailsRequest__storage_, offset),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeUInt32,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[ListFaceDetailsRequest class]
                                     rootClass:[FacesetRoot class]
                                          file:FacesetRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(ListFaceDetailsRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - ListFaceDetailsResponse

@implementation ListFaceDetailsResponse

@dynamic hasFaceSet, faceSet;
@dynamic faceDetailsArray, faceDetailsArray_Count;
@dynamic total;

typedef struct ListFaceDetailsResponse__storage_ {
  uint32_t _has_storage_[1];
  uint32_t total;
  FaceSet *faceSet;
  NSMutableArray *faceDetailsArray;
} ListFaceDetailsResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "faceSet",
        .dataTypeSpecific.className = GPBStringifySymbol(FaceSet),
        .number = ListFaceDetailsResponse_FieldNumber_FaceSet,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(ListFaceDetailsResponse__storage_, faceSet),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "faceDetailsArray",
        .dataTypeSpecific.className = GPBStringifySymbol(FaceDetail),
        .number = ListFaceDetailsResponse_FieldNumber_FaceDetailsArray,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(ListFaceDetailsResponse__storage_, faceDetailsArray),
        .flags = GPBFieldRepeated,
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "total",
        .dataTypeSpecific.className = NULL,
        .number = ListFaceDetailsResponse_FieldNumber_Total,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(ListFaceDetailsResponse__storage_, total),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeUInt32,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[ListFaceDetailsResponse class]
                                     rootClass:[FacesetRoot class]
                                          file:FacesetRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(ListFaceDetailsResponse__storage_)
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
