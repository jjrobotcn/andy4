#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import "Storage.pbrpc.h"
#import "Storage.pbobjc.h"
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriter+Immediate.h>

#import "google/api/Annotations.pbobjc.h"

@implementation Storage

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-designated-initializers"

// Designated initializer
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [super initWithHost:host
                 packageName:@"cameraService"
                 serviceName:@"Storage"
                 callOptions:callOptions];
}

- (instancetype)initWithHost:(NSString *)host {
  return [super initWithHost:host
                 packageName:@"cameraService"
                 serviceName:@"Storage"];
}

#pragma clang diagnostic pop

// Override superclass initializer to disallow different package and service names.
- (instancetype)initWithHost:(NSString *)host
                 packageName:(NSString *)packageName
                 serviceName:(NSString *)serviceName {
  return [self initWithHost:host];
}

- (instancetype)initWithHost:(NSString *)host
                 packageName:(NSString *)packageName
                 serviceName:(NSString *)serviceName
                 callOptions:(GRPCCallOptions *)callOptions {
  return [self initWithHost:host callOptions:callOptions];
}

#pragma mark - Class Methods

+ (instancetype)serviceWithHost:(NSString *)host {
  return [[self alloc] initWithHost:host];
}

+ (instancetype)serviceWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [[self alloc] initWithHost:host callOptions:callOptions];
}

#pragma mark - Method Implementations

#pragma mark ListDates(ListDatesRequest) returns (ListDatesResponse)

// Deprecated methods.
/**
 * 获取监控视频日期列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listDatesWithRequest:(ListDatesRequest *)request handler:(void(^)(ListDatesResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToListDatesWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取监控视频日期列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListDatesWithRequest:(ListDatesRequest *)request handler:(void(^)(ListDatesResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"ListDates"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[ListDatesResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 获取监控视频日期列表
 */
- (GRPCUnaryProtoCall *)listDatesWithMessage:(ListDatesRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"ListDates"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[ListDatesResponse class]];
}

#pragma mark ListVideos(ListVideosRequest) returns (ListVideosResponse)

// Deprecated methods.
/**
 * 获取监控视频列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listVideosWithRequest:(ListVideosRequest *)request handler:(void(^)(ListVideosResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToListVideosWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取监控视频列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListVideosWithRequest:(ListVideosRequest *)request handler:(void(^)(ListVideosResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"ListVideos"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[ListVideosResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 获取监控视频列表
 */
- (GRPCUnaryProtoCall *)listVideosWithMessage:(ListVideosRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"ListVideos"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[ListVideosResponse class]];
}

#pragma mark GetVideoFile(GetVideoFileRequest) returns (stream GetVideoFileResponse)

// Deprecated methods.
/**
 * 获取监控视频文件
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getVideoFileWithRequest:(GetVideoFileRequest *)request eventHandler:(void(^)(BOOL done, GetVideoFileResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCToGetVideoFileWithRequest:request eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取监控视频文件
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetVideoFileWithRequest:(GetVideoFileRequest *)request eventHandler:(void(^)(BOOL done, GetVideoFileResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"GetVideoFile"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetVideoFileResponse class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
/**
 * 获取监控视频文件
 */
- (GRPCUnaryProtoCall *)getVideoFileWithMessage:(GetVideoFileRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"GetVideoFile"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[GetVideoFileResponse class]];
}

#pragma mark DeleteVideoFiles(DeleteVideoFilesRequest) returns (DeleteVideoFilesResponse)

// Deprecated methods.
/**
 * 删除监控视频文件
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)deleteVideoFilesWithRequest:(DeleteVideoFilesRequest *)request handler:(void(^)(DeleteVideoFilesResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToDeleteVideoFilesWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 删除监控视频文件
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToDeleteVideoFilesWithRequest:(DeleteVideoFilesRequest *)request handler:(void(^)(DeleteVideoFilesResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"DeleteVideoFiles"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[DeleteVideoFilesResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 删除监控视频文件
 */
- (GRPCUnaryProtoCall *)deleteVideoFilesWithMessage:(DeleteVideoFilesRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"DeleteVideoFiles"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[DeleteVideoFilesResponse class]];
}

@end
#endif
