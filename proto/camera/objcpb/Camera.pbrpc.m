#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import "Camera.pbrpc.h"
#import "Camera.pbobjc.h"
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriter+Immediate.h>

#import "google/api/Annotations.pbobjc.h"

@implementation CameraService

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-designated-initializers"

// Designated initializer
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [super initWithHost:host
                 packageName:@"cameraService"
                 serviceName:@"CameraService"
                 callOptions:callOptions];
}

- (instancetype)initWithHost:(NSString *)host {
  return [super initWithHost:host
                 packageName:@"cameraService"
                 serviceName:@"CameraService"];
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

#pragma mark LiveH264Stream(LiveH264StreamRequest) returns (stream LiveH264StreamResponse)

// Deprecated methods.
/**
 * 直播流数据, 数据为h264 nal单元
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)liveH264StreamWithRequest:(LiveH264StreamRequest *)request eventHandler:(void(^)(BOOL done, LiveH264StreamResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCToLiveH264StreamWithRequest:request eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 直播流数据, 数据为h264 nal单元
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToLiveH264StreamWithRequest:(LiveH264StreamRequest *)request eventHandler:(void(^)(BOOL done, LiveH264StreamResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"LiveH264Stream"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[LiveH264StreamResponse class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
/**
 * 直播流数据, 数据为h264 nal单元
 */
- (GRPCUnaryProtoCall *)liveH264StreamWithMessage:(LiveH264StreamRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"LiveH264Stream"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[LiveH264StreamResponse class]];
}

#pragma mark DvrListDates(DvrListDatesRequest) returns (DvrListDatesResponse)

// Deprecated methods.
/**
 * 获取监控数据日期列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)dvrListDatesWithRequest:(DvrListDatesRequest *)request handler:(void(^)(DvrListDatesResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToDvrListDatesWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取监控数据日期列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToDvrListDatesWithRequest:(DvrListDatesRequest *)request handler:(void(^)(DvrListDatesResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"DvrListDates"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[DvrListDatesResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 获取监控数据日期列表
 */
- (GRPCUnaryProtoCall *)dvrListDatesWithMessage:(DvrListDatesRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"DvrListDates"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[DvrListDatesResponse class]];
}

#pragma mark DvrListDateVideos(DvrListDateVideosRequest) returns (DvrListDateVideosResponse)

// Deprecated methods.
/**
 * 获取监控数据指定日期视频文件列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)dvrListDateVideosWithRequest:(DvrListDateVideosRequest *)request handler:(void(^)(DvrListDateVideosResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToDvrListDateVideosWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取监控数据指定日期视频文件列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToDvrListDateVideosWithRequest:(DvrListDateVideosRequest *)request handler:(void(^)(DvrListDateVideosResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"DvrListDateVideos"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[DvrListDateVideosResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 获取监控数据指定日期视频文件列表
 */
- (GRPCUnaryProtoCall *)dvrListDateVideosWithMessage:(DvrListDateVideosRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"DvrListDateVideos"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[DvrListDateVideosResponse class]];
}

@end
#endif
