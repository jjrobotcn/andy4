#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import "Capability.pbrpc.h"
#import "Capability.pbobjc.h"
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriter+Immediate.h>

#import "google/api/Annotations.pbobjc.h"

@implementation Capability

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-designated-initializers"

// Designated initializer
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [super initWithHost:host
                 packageName:@"handsmotion"
                 serviceName:@"Capability"
                 callOptions:callOptions];
}

- (instancetype)initWithHost:(NSString *)host {
  return [super initWithHost:host
                 packageName:@"handsmotion"
                 serviceName:@"Capability"];
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

#pragma mark FingersAdjustment(FingersAdjustmentRequest) returns (FingersAdjustmentResponse)

// Deprecated methods.
/**
 * 手指调整方法
 * 调整手指动作的开合与重置
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)fingersAdjustmentWithRequest:(FingersAdjustmentRequest *)request handler:(void(^)(FingersAdjustmentResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToFingersAdjustmentWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 手指调整方法
 * 调整手指动作的开合与重置
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToFingersAdjustmentWithRequest:(FingersAdjustmentRequest *)request handler:(void(^)(FingersAdjustmentResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"FingersAdjustment"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[FingersAdjustmentResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 手指调整方法
 * 调整手指动作的开合与重置
 */
- (GRPCUnaryProtoCall *)fingersAdjustmentWithMessage:(FingersAdjustmentRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"FingersAdjustment"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[FingersAdjustmentResponse class]];
}

#pragma mark ArmAdjustment(ArmAdjustmentRequest) returns (ArmAdjustmentResponse)

// Deprecated methods.
/**
 * 手臂调整方法
 * 调整手臂位置重置、使能与失能。
 * 失能后可通过外力移动至相应位置后通过使能恢复锁定当前位置
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)armAdjustmentWithRequest:(ArmAdjustmentRequest *)request handler:(void(^)(ArmAdjustmentResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToArmAdjustmentWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 手臂调整方法
 * 调整手臂位置重置、使能与失能。
 * 失能后可通过外力移动至相应位置后通过使能恢复锁定当前位置
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToArmAdjustmentWithRequest:(ArmAdjustmentRequest *)request handler:(void(^)(ArmAdjustmentResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"ArmAdjustment"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[ArmAdjustmentResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 手臂调整方法
 * 调整手臂位置重置、使能与失能。
 * 失能后可通过外力移动至相应位置后通过使能恢复锁定当前位置
 */
- (GRPCUnaryProtoCall *)armAdjustmentWithMessage:(ArmAdjustmentRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"ArmAdjustment"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[ArmAdjustmentResponse class]];
}

#pragma mark MarkAsOriginalPosition(MarkAsOriginalPositionRequest) returns (MarkAsOriginalPositionResponse)

// Deprecated methods.
/**
 * 标记当前位置为初始位置
 * 所有位置数据将基于此点进行计算
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)markAsOriginalPositionWithRequest:(MarkAsOriginalPositionRequest *)request handler:(void(^)(MarkAsOriginalPositionResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToMarkAsOriginalPositionWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 标记当前位置为初始位置
 * 所有位置数据将基于此点进行计算
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToMarkAsOriginalPositionWithRequest:(MarkAsOriginalPositionRequest *)request handler:(void(^)(MarkAsOriginalPositionResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"MarkAsOriginalPosition"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[MarkAsOriginalPositionResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 标记当前位置为初始位置
 * 所有位置数据将基于此点进行计算
 */
- (GRPCUnaryProtoCall *)markAsOriginalPositionWithMessage:(MarkAsOriginalPositionRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"MarkAsOriginalPosition"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[MarkAsOriginalPositionResponse class]];
}

#pragma mark GetAbsolutePosition(GetAbsolutePositionRequest) returns (GetAbsolutePositionResponse)

// Deprecated methods.
/**
 * 获取当前绝对位置
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getAbsolutePositionWithRequest:(GetAbsolutePositionRequest *)request handler:(void(^)(GetAbsolutePositionResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToGetAbsolutePositionWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取当前绝对位置
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetAbsolutePositionWithRequest:(GetAbsolutePositionRequest *)request handler:(void(^)(GetAbsolutePositionResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"GetAbsolutePosition"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetAbsolutePositionResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 获取当前绝对位置
 */
- (GRPCUnaryProtoCall *)getAbsolutePositionWithMessage:(GetAbsolutePositionRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"GetAbsolutePosition"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[GetAbsolutePositionResponse class]];
}

#pragma mark AbsoluteMove(AbsoluteMoveRequest) returns (AbsoluteMoveResponse)

// Deprecated methods.
/**
 * 绝对位置移动
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)absoluteMoveWithRequest:(AbsoluteMoveRequest *)request handler:(void(^)(AbsoluteMoveResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToAbsoluteMoveWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 绝对位置移动
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToAbsoluteMoveWithRequest:(AbsoluteMoveRequest *)request handler:(void(^)(AbsoluteMoveResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"AbsoluteMove"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[AbsoluteMoveResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 绝对位置移动
 */
- (GRPCUnaryProtoCall *)absoluteMoveWithMessage:(AbsoluteMoveRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"AbsoluteMove"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[AbsoluteMoveResponse class]];
}

@end
#endif
