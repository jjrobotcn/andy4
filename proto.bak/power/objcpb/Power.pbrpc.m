#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import "Power.pbrpc.h"
#import "Power.pbobjc.h"
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriter+Immediate.h>

#import "google/api/Annotations.pbobjc.h"

@implementation PowerService

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-designated-initializers"

// Designated initializer
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [super initWithHost:host
                 packageName:@"powerService"
                 serviceName:@"PowerService"
                 callOptions:callOptions];
}

- (instancetype)initWithHost:(NSString *)host {
  return [super initWithHost:host
                 packageName:@"powerService"
                 serviceName:@"PowerService"];
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

#pragma mark GetPowerStatus(GetPowerStatusRequest) returns (stream GetPowerStatusResponse)

// Deprecated methods.
/**
 * 获取电源状态数据流
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getPowerStatusWithRequest:(GetPowerStatusRequest *)request eventHandler:(void(^)(BOOL done, GetPowerStatusResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCToGetPowerStatusWithRequest:request eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取电源状态数据流
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetPowerStatusWithRequest:(GetPowerStatusRequest *)request eventHandler:(void(^)(BOOL done, GetPowerStatusResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"GetPowerStatus"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetPowerStatusResponse class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
/**
 * 获取电源状态数据流
 */
- (GRPCUnaryProtoCall *)getPowerStatusWithMessage:(GetPowerStatusRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"GetPowerStatus"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[GetPowerStatusResponse class]];
}

#pragma mark Reboot(RebootRequest) returns (RebootResponse)

// Deprecated methods.
/**
 * 对各模块的电源进行断电方式重启
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)rebootWithRequest:(RebootRequest *)request handler:(void(^)(RebootResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToRebootWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 对各模块的电源进行断电方式重启
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToRebootWithRequest:(RebootRequest *)request handler:(void(^)(RebootResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"Reboot"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[RebootResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 对各模块的电源进行断电方式重启
 */
- (GRPCUnaryProtoCall *)rebootWithMessage:(RebootRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"Reboot"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[RebootResponse class]];
}

#pragma mark States(StatesRequest) returns (StatesResponse)

// Deprecated methods.
/**
 * 获取所有电源模块状态
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)statesWithRequest:(StatesRequest *)request handler:(void(^)(StatesResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToStatesWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取所有电源模块状态
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToStatesWithRequest:(StatesRequest *)request handler:(void(^)(StatesResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"States"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[StatesResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 获取所有电源模块状态
 */
- (GRPCUnaryProtoCall *)statesWithMessage:(StatesRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"States"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[StatesResponse class]];
}

#pragma mark Switch(SwitchRequest) returns (SwitchResponse)

// Deprecated methods.
/**
 * 控制模块供电开关
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)switchWithRequest:(SwitchRequest *)request handler:(void(^)(SwitchResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToSwitchWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 控制模块供电开关
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToSwitchWithRequest:(SwitchRequest *)request handler:(void(^)(SwitchResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"Switch"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[SwitchResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 控制模块供电开关
 */
- (GRPCUnaryProtoCall *)switchWithMessage:(SwitchRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"Switch"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[SwitchResponse class]];
}

@end
#endif
