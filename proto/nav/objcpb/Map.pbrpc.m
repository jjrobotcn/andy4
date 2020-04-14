#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import "Map.pbrpc.h"
#import "Map.pbobjc.h"
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriter+Immediate.h>

#import "google/api/Annotations.pbobjc.h"

@implementation Map

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-designated-initializers"

// Designated initializer
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [super initWithHost:host
                 packageName:@"navService"
                 serviceName:@"Map"
                 callOptions:callOptions];
}

- (instancetype)initWithHost:(NSString *)host {
  return [super initWithHost:host
                 packageName:@"navService"
                 serviceName:@"Map"];
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

#pragma mark GetMapInfo(GetMapInfoRequest) returns (GetMapInfoResponse)

// Deprecated methods.
- (void)getMapInfoWithRequest:(GetMapInfoRequest *)request handler:(void(^)(GetMapInfoResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToGetMapInfoWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToGetMapInfoWithRequest:(GetMapInfoRequest *)request handler:(void(^)(GetMapInfoResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"GetMapInfo"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetMapInfoResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
- (GRPCUnaryProtoCall *)getMapInfoWithMessage:(GetMapInfoRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"GetMapInfo"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[GetMapInfoResponse class]];
}

#pragma mark MapPositionStream(MapPositionStreamRequest) returns (stream MapPositionStreamResponse)

// Deprecated methods.
- (void)mapPositionStreamWithRequest:(MapPositionStreamRequest *)request eventHandler:(void(^)(BOOL done, MapPositionStreamResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCToMapPositionStreamWithRequest:request eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToMapPositionStreamWithRequest:(MapPositionStreamRequest *)request eventHandler:(void(^)(BOOL done, MapPositionStreamResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"MapPositionStream"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[MapPositionStreamResponse class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
- (GRPCUnaryProtoCall *)mapPositionStreamWithMessage:(MapPositionStreamRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"MapPositionStream"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[MapPositionStreamResponse class]];
}

#pragma mark LocationReset(LocationResetRequest) returns (LocationResetResponse)

// Deprecated methods.
/**
 * 重置当前定位
 * 用于发生定位异常/错误状态，重新初始化导航定位
 * 重定位错误：定位状态超时|无地图|UWB错误
 * 重定位超时判断: 默认10s，仅在非错误状态下重置
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)locationResetWithRequest:(LocationResetRequest *)request handler:(void(^)(LocationResetResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToLocationResetWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 重置当前定位
 * 用于发生定位异常/错误状态，重新初始化导航定位
 * 重定位错误：定位状态超时|无地图|UWB错误
 * 重定位超时判断: 默认10s，仅在非错误状态下重置
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToLocationResetWithRequest:(LocationResetRequest *)request handler:(void(^)(LocationResetResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"LocationReset"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[LocationResetResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 重置当前定位
 * 用于发生定位异常/错误状态，重新初始化导航定位
 * 重定位错误：定位状态超时|无地图|UWB错误
 * 重定位超时判断: 默认10s，仅在非错误状态下重置
 */
- (GRPCUnaryProtoCall *)locationResetWithMessage:(LocationResetRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"LocationReset"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[LocationResetResponse class]];
}

@end
#endif
