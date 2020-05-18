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

#pragma mark LatestImage(LatestImageRequest) returns (LatestImageResponse)

// Deprecated methods.
/**
 * 获取实时当前最新图片jpg
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)latestImageWithRequest:(LatestImageRequest *)request handler:(void(^)(LatestImageResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToLatestImageWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取实时当前最新图片jpg
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToLatestImageWithRequest:(LatestImageRequest *)request handler:(void(^)(LatestImageResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"LatestImage"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[LatestImageResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 获取实时当前最新图片jpg
 */
- (GRPCUnaryProtoCall *)latestImageWithMessage:(LatestImageRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"LatestImage"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[LatestImageResponse class]];
}

@end
#endif
