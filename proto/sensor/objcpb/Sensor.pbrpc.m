#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import "Sensor.pbrpc.h"
#import "Sensor.pbobjc.h"
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriter+Immediate.h>


@implementation SensorService

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-designated-initializers"

// Designated initializer
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [super initWithHost:host
                 packageName:@"sensorService"
                 serviceName:@"SensorService"
                 callOptions:callOptions];
}

- (instancetype)initWithHost:(NSString *)host {
  return [super initWithHost:host
                 packageName:@"sensorService"
                 serviceName:@"SensorService"];
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

#pragma mark GetDetect(GetDetectRequest) returns (stream GetDetectResponse)

// Deprecated methods.
/**
 * 获取感应数据流
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getDetectWithRequest:(GetDetectRequest *)request eventHandler:(void(^)(BOOL done, GetDetectResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCToGetDetectWithRequest:request eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取感应数据流
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetDetectWithRequest:(GetDetectRequest *)request eventHandler:(void(^)(BOOL done, GetDetectResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"GetDetect"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetDetectResponse class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
/**
 * 获取感应数据流
 */
- (GRPCUnaryProtoCall *)getDetectWithMessage:(GetDetectRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"GetDetect"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[GetDetectResponse class]];
}

#pragma mark GetMotionInduction(GetMotionInductionRequest) returns (stream GetMotionInductionResponse)

// Deprecated methods.
/**
 * 获取动态感应数据
 * 场景示例： 迎宾感应
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getMotionInductionWithRequest:(GetMotionInductionRequest *)request eventHandler:(void(^)(BOOL done, GetMotionInductionResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCToGetMotionInductionWithRequest:request eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取动态感应数据
 * 场景示例： 迎宾感应
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetMotionInductionWithRequest:(GetMotionInductionRequest *)request eventHandler:(void(^)(BOOL done, GetMotionInductionResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"GetMotionInduction"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetMotionInductionResponse class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
/**
 * 获取动态感应数据
 * 场景示例： 迎宾感应
 */
- (GRPCUnaryProtoCall *)getMotionInductionWithMessage:(GetMotionInductionRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"GetMotionInduction"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[GetMotionInductionResponse class]];
}

#pragma mark GetTouch(GetTouchRequest) returns (stream GetTouchResponse)

// Deprecated methods.
/**
 * 获取触摸数据流
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getTouchWithRequest:(GetTouchRequest *)request eventHandler:(void(^)(BOOL done, GetTouchResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCToGetTouchWithRequest:request eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取触摸数据流
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetTouchWithRequest:(GetTouchRequest *)request eventHandler:(void(^)(BOOL done, GetTouchResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"GetTouch"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetTouchResponse class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
/**
 * 获取触摸数据流
 */
- (GRPCUnaryProtoCall *)getTouchWithMessage:(GetTouchRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"GetTouch"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[GetTouchResponse class]];
}

#pragma mark Raw(RawRequest) returns (stream RawResponse)

// Deprecated methods.
/**
 * 获取传感器原始数据调试接口
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)rawWithRequest:(RawRequest *)request eventHandler:(void(^)(BOOL done, RawResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCToRawWithRequest:request eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取传感器原始数据调试接口
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToRawWithRequest:(RawRequest *)request eventHandler:(void(^)(BOOL done, RawResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"Raw"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[RawResponse class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
/**
 * 获取传感器原始数据调试接口
 */
- (GRPCUnaryProtoCall *)rawWithMessage:(RawRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"Raw"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[RawResponse class]];
}

@end
#endif
