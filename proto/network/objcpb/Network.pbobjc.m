// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: network.proto

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

#import "Network.pbobjc.h"
#import "google/api/Annotations.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - NetworkRoot

@implementation NetworkRoot

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

#pragma mark - NetworkRoot_FileDescriptor

static GPBFileDescriptor *NetworkRoot_FileDescriptor(void) {
  // This is called by +initialize so there is no need to worry
  // about thread safety of the singleton.
  static GPBFileDescriptor *descriptor = NULL;
  if (!descriptor) {
    GPB_DEBUG_CHECK_RUNTIME_VERSIONS();
    descriptor = [[GPBFileDescriptor alloc] initWithPackage:@"networkService"
                                                     syntax:GPBFileSyntaxProto3];
  }
  return descriptor;
}

#pragma mark - Enum Status

GPBEnumDescriptor *Status_EnumDescriptor(void) {
  static _Atomic(GPBEnumDescriptor*) descriptor = nil;
  if (!descriptor) {
    static const char *valueNames =
        "Unknown\000Disconnected\000Connecting\000Connecte"
        "d\000";
    static const int32_t values[] = {
        Status_Unknown,
        Status_Disconnected,
        Status_Connecting,
        Status_Connected,
    };
    GPBEnumDescriptor *worker =
        [GPBEnumDescriptor allocDescriptorForName:GPBNSStringifySymbol(Status)
                                       valueNames:valueNames
                                           values:values
                                            count:(uint32_t)(sizeof(values) / sizeof(int32_t))
                                     enumVerifier:Status_IsValidValue];
    GPBEnumDescriptor *expected = nil;
    if (!atomic_compare_exchange_strong(&descriptor, &expected, worker)) {
      [worker release];
    }
  }
  return descriptor;
}

BOOL Status_IsValidValue(int32_t value__) {
  switch (value__) {
    case Status_Unknown:
    case Status_Disconnected:
    case Status_Connecting:
    case Status_Connected:
      return YES;
    default:
      return NO;
  }
}

#pragma mark - NetworkInfo

@implementation NetworkInfo

@dynamic name;
@dynamic mac;
@dynamic channel;
@dynamic rssi;

typedef struct NetworkInfo__storage_ {
  uint32_t _has_storage_[1];
  uint32_t channel;
  uint32_t rssi;
  NSString *name;
  NSString *mac;
} NetworkInfo__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "name",
        .dataTypeSpecific.className = NULL,
        .number = NetworkInfo_FieldNumber_Name,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(NetworkInfo__storage_, name),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "mac",
        .dataTypeSpecific.className = NULL,
        .number = NetworkInfo_FieldNumber_Mac,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(NetworkInfo__storage_, mac),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "channel",
        .dataTypeSpecific.className = NULL,
        .number = NetworkInfo_FieldNumber_Channel,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(NetworkInfo__storage_, channel),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeUInt32,
      },
      {
        .name = "rssi",
        .dataTypeSpecific.className = NULL,
        .number = NetworkInfo_FieldNumber_Rssi,
        .hasIndex = 3,
        .offset = (uint32_t)offsetof(NetworkInfo__storage_, rssi),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeUInt32,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[NetworkInfo class]
                                     rootClass:[NetworkRoot class]
                                          file:NetworkRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(NetworkInfo__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - ListNetworksRequest

@implementation ListNetworksRequest


typedef struct ListNetworksRequest__storage_ {
  uint32_t _has_storage_[1];
} ListNetworksRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[ListNetworksRequest class]
                                     rootClass:[NetworkRoot class]
                                          file:NetworkRoot_FileDescriptor()
                                        fields:NULL
                                    fieldCount:0
                                   storageSize:sizeof(ListNetworksRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - ListNetworksResponse

@implementation ListNetworksResponse

@dynamic networksInfoArray, networksInfoArray_Count;

typedef struct ListNetworksResponse__storage_ {
  uint32_t _has_storage_[1];
  NSMutableArray *networksInfoArray;
} ListNetworksResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "networksInfoArray",
        .dataTypeSpecific.className = GPBStringifySymbol(NetworkInfo),
        .number = ListNetworksResponse_FieldNumber_NetworksInfoArray,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(ListNetworksResponse__storage_, networksInfoArray),
        .flags = GPBFieldRepeated,
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[ListNetworksResponse class]
                                     rootClass:[NetworkRoot class]
                                          file:NetworkRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(ListNetworksResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - ConnectRequest

@implementation ConnectRequest

@dynamic hasNetworkInfo, networkInfo;
@dynamic ssid;
@dynamic pwd;
@dynamic keepAlive;
@dynamic keepAliveInterval;

typedef struct ConnectRequest__storage_ {
  uint32_t _has_storage_[1];
  uint32_t keepAliveInterval;
  NetworkInfo *networkInfo;
  NSString *pwd;
  NSString *ssid;
} ConnectRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "networkInfo",
        .dataTypeSpecific.className = GPBStringifySymbol(NetworkInfo),
        .number = ConnectRequest_FieldNumber_NetworkInfo,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(ConnectRequest__storage_, networkInfo),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "pwd",
        .dataTypeSpecific.className = NULL,
        .number = ConnectRequest_FieldNumber_Pwd,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(ConnectRequest__storage_, pwd),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "ssid",
        .dataTypeSpecific.className = NULL,
        .number = ConnectRequest_FieldNumber_Ssid,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(ConnectRequest__storage_, ssid),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "keepAlive",
        .dataTypeSpecific.className = NULL,
        .number = ConnectRequest_FieldNumber_KeepAlive,
        .hasIndex = 3,
        .offset = 4,  // Stored in _has_storage_ to save space.
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeBool,
      },
      {
        .name = "keepAliveInterval",
        .dataTypeSpecific.className = NULL,
        .number = ConnectRequest_FieldNumber_KeepAliveInterval,
        .hasIndex = 5,
        .offset = (uint32_t)offsetof(ConnectRequest__storage_, keepAliveInterval),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeUInt32,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[ConnectRequest class]
                                     rootClass:[NetworkRoot class]
                                          file:NetworkRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(ConnectRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - NetworkStatus

@implementation NetworkStatus

@dynamic status;
@dynamic name;
@dynamic publicIp;
@dynamic rssi;
@dynamic upload;
@dynamic download;

typedef struct NetworkStatus__storage_ {
  uint32_t _has_storage_[1];
  Status status;
  uint32_t rssi;
  uint32_t upload;
  uint32_t download;
  NSString *name;
  NSString *publicIp;
} NetworkStatus__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "status",
        .dataTypeSpecific.enumDescFunc = Status_EnumDescriptor,
        .number = NetworkStatus_FieldNumber_Status,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(NetworkStatus__storage_, status),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldHasEnumDescriptor),
        .dataType = GPBDataTypeEnum,
      },
      {
        .name = "name",
        .dataTypeSpecific.className = NULL,
        .number = NetworkStatus_FieldNumber_Name,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(NetworkStatus__storage_, name),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "publicIp",
        .dataTypeSpecific.className = NULL,
        .number = NetworkStatus_FieldNumber_PublicIp,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(NetworkStatus__storage_, publicIp),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "rssi",
        .dataTypeSpecific.className = NULL,
        .number = NetworkStatus_FieldNumber_Rssi,
        .hasIndex = 3,
        .offset = (uint32_t)offsetof(NetworkStatus__storage_, rssi),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeUInt32,
      },
      {
        .name = "upload",
        .dataTypeSpecific.className = NULL,
        .number = NetworkStatus_FieldNumber_Upload,
        .hasIndex = 4,
        .offset = (uint32_t)offsetof(NetworkStatus__storage_, upload),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeUInt32,
      },
      {
        .name = "download",
        .dataTypeSpecific.className = NULL,
        .number = NetworkStatus_FieldNumber_Download,
        .hasIndex = 5,
        .offset = (uint32_t)offsetof(NetworkStatus__storage_, download),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeUInt32,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[NetworkStatus class]
                                     rootClass:[NetworkRoot class]
                                          file:NetworkRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(NetworkStatus__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

int32_t NetworkStatus_Status_RawValue(NetworkStatus *message) {
  GPBDescriptor *descriptor = [NetworkStatus descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:NetworkStatus_FieldNumber_Status];
  return GPBGetMessageInt32Field(message, field);
}

void SetNetworkStatus_Status_RawValue(NetworkStatus *message, int32_t value) {
  GPBDescriptor *descriptor = [NetworkStatus descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:NetworkStatus_FieldNumber_Status];
  GPBSetInt32IvarWithFieldInternal(message, field, value, descriptor.file.syntax);
}

#pragma mark - ConnectResponse

@implementation ConnectResponse


typedef struct ConnectResponse__storage_ {
  uint32_t _has_storage_[1];
} ConnectResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[ConnectResponse class]
                                     rootClass:[NetworkRoot class]
                                          file:NetworkRoot_FileDescriptor()
                                        fields:NULL
                                    fieldCount:0
                                   storageSize:sizeof(ConnectResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - GetStatusRequest

@implementation GetStatusRequest


typedef struct GetStatusRequest__storage_ {
  uint32_t _has_storage_[1];
} GetStatusRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[GetStatusRequest class]
                                     rootClass:[NetworkRoot class]
                                          file:NetworkRoot_FileDescriptor()
                                        fields:NULL
                                    fieldCount:0
                                   storageSize:sizeof(GetStatusRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - GetStatusResponse

@implementation GetStatusResponse

@dynamic hasNetworkStatus, networkStatus;

typedef struct GetStatusResponse__storage_ {
  uint32_t _has_storage_[1];
  NetworkStatus *networkStatus;
} GetStatusResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "networkStatus",
        .dataTypeSpecific.className = GPBStringifySymbol(NetworkStatus),
        .number = GetStatusResponse_FieldNumber_NetworkStatus,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(GetStatusResponse__storage_, networkStatus),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[GetStatusResponse class]
                                     rootClass:[NetworkRoot class]
                                          file:NetworkRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(GetStatusResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - NetworkDeviceInfo

@implementation NetworkDeviceInfo

@dynamic ssid;
@dynamic credential;

typedef struct NetworkDeviceInfo__storage_ {
  uint32_t _has_storage_[1];
  NSString *ssid;
  NSString *credential;
} NetworkDeviceInfo__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "ssid",
        .dataTypeSpecific.className = NULL,
        .number = NetworkDeviceInfo_FieldNumber_Ssid,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(NetworkDeviceInfo__storage_, ssid),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "credential",
        .dataTypeSpecific.className = NULL,
        .number = NetworkDeviceInfo_FieldNumber_Credential,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(NetworkDeviceInfo__storage_, credential),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[NetworkDeviceInfo class]
                                     rootClass:[NetworkRoot class]
                                          file:NetworkRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(NetworkDeviceInfo__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - GetNetworkDeviceInfoRequest

@implementation GetNetworkDeviceInfoRequest

@dynamic withCredential;

typedef struct GetNetworkDeviceInfoRequest__storage_ {
  uint32_t _has_storage_[1];
} GetNetworkDeviceInfoRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "withCredential",
        .dataTypeSpecific.className = NULL,
        .number = GetNetworkDeviceInfoRequest_FieldNumber_WithCredential,
        .hasIndex = 0,
        .offset = 1,  // Stored in _has_storage_ to save space.
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeBool,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[GetNetworkDeviceInfoRequest class]
                                     rootClass:[NetworkRoot class]
                                          file:NetworkRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(GetNetworkDeviceInfoRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - GetNetworkDeviceInfoResponse

@implementation GetNetworkDeviceInfoResponse

@dynamic hasNetworkDeviceInfo, networkDeviceInfo;

typedef struct GetNetworkDeviceInfoResponse__storage_ {
  uint32_t _has_storage_[1];
  NetworkDeviceInfo *networkDeviceInfo;
} GetNetworkDeviceInfoResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "networkDeviceInfo",
        .dataTypeSpecific.className = GPBStringifySymbol(NetworkDeviceInfo),
        .number = GetNetworkDeviceInfoResponse_FieldNumber_NetworkDeviceInfo,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(GetNetworkDeviceInfoResponse__storage_, networkDeviceInfo),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[GetNetworkDeviceInfoResponse class]
                                     rootClass:[NetworkRoot class]
                                          file:NetworkRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(GetNetworkDeviceInfoResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - UpdateNetworkDeviceInfoRequest

@implementation UpdateNetworkDeviceInfoRequest

@dynamic hasNetworkDeviceInfo, networkDeviceInfo;

typedef struct UpdateNetworkDeviceInfoRequest__storage_ {
  uint32_t _has_storage_[1];
  NetworkDeviceInfo *networkDeviceInfo;
} UpdateNetworkDeviceInfoRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "networkDeviceInfo",
        .dataTypeSpecific.className = GPBStringifySymbol(NetworkDeviceInfo),
        .number = UpdateNetworkDeviceInfoRequest_FieldNumber_NetworkDeviceInfo,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(UpdateNetworkDeviceInfoRequest__storage_, networkDeviceInfo),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[UpdateNetworkDeviceInfoRequest class]
                                     rootClass:[NetworkRoot class]
                                          file:NetworkRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(UpdateNetworkDeviceInfoRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - UpdateNetworkDeviceInfoResponse

@implementation UpdateNetworkDeviceInfoResponse


typedef struct UpdateNetworkDeviceInfoResponse__storage_ {
  uint32_t _has_storage_[1];
} UpdateNetworkDeviceInfoResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[UpdateNetworkDeviceInfoResponse class]
                                     rootClass:[NetworkRoot class]
                                          file:NetworkRoot_FileDescriptor()
                                        fields:NULL
                                    fieldCount:0
                                   storageSize:sizeof(UpdateNetworkDeviceInfoResponse__storage_)
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