#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import "Power.pbrpc.h"
#import "Power.pbobjc.h"
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriter+Immediate.h>


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

@end
#endif
