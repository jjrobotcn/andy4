#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
#import "Capability.pbobjc.h"
#endif

#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import <ProtoRPC/ProtoService.h>
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriteable.h>
#import <RxLibrary/GRXWriter.h>
#endif

@class AbsoluteMoveRequest;
@class AbsoluteMoveResponse;
@class ArmAdjustmentRequest;
@class ArmAdjustmentResponse;
@class FingersAdjustmentRequest;
@class FingersAdjustmentResponse;
@class GetAbsolutePositionRequest;
@class GetAbsolutePositionResponse;
@class MarkAsOriginalPositionRequest;
@class MarkAsOriginalPositionResponse;

#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
  #import "google/api/Annotations.pbobjc.h"
#endif

@class GRPCProtoCall;
@class GRPCUnaryProtoCall;
@class GRPCStreamingProtoCall;
@class GRPCCallOptions;
@protocol GRPCProtoResponseHandler;


NS_ASSUME_NONNULL_BEGIN

@protocol Capability2 <NSObject>

#pragma mark FingersAdjustment(FingersAdjustmentRequest) returns (FingersAdjustmentResponse)

/**
 * 手指调整方法
 * 调整手指动作的开合与重置
 */
- (GRPCUnaryProtoCall *)fingersAdjustmentWithMessage:(FingersAdjustmentRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark ArmAdjustment(ArmAdjustmentRequest) returns (ArmAdjustmentResponse)

/**
 * 手臂调整方法
 * 调整手臂位置重置、使能与失能。
 * 失能后可通过外力移动至相应位置后通过使能恢复锁定当前位置
 */
- (GRPCUnaryProtoCall *)armAdjustmentWithMessage:(ArmAdjustmentRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark MarkAsOriginalPosition(MarkAsOriginalPositionRequest) returns (MarkAsOriginalPositionResponse)

/**
 * 标记当前位置为初始位置
 * 所有位置数据将基于此点进行计算
 */
- (GRPCUnaryProtoCall *)markAsOriginalPositionWithMessage:(MarkAsOriginalPositionRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark GetAbsolutePosition(GetAbsolutePositionRequest) returns (GetAbsolutePositionResponse)

/**
 * 获取当前绝对位置
 */
- (GRPCUnaryProtoCall *)getAbsolutePositionWithMessage:(GetAbsolutePositionRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark AbsoluteMove(AbsoluteMoveRequest) returns (AbsoluteMoveResponse)

/**
 * 绝对位置移动
 */
- (GRPCUnaryProtoCall *)absoluteMoveWithMessage:(AbsoluteMoveRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

@end

/**
 * The methods in this protocol belong to a set of old APIs that have been deprecated. They do not
 * recognize call options provided in the initializer. Using the v2 protocol is recommended.
 */
@protocol Capability <NSObject>

#pragma mark FingersAdjustment(FingersAdjustmentRequest) returns (FingersAdjustmentResponse)

/**
 * 手指调整方法
 * 调整手指动作的开合与重置
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)fingersAdjustmentWithRequest:(FingersAdjustmentRequest *)request handler:(void(^)(FingersAdjustmentResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 手指调整方法
 * 调整手指动作的开合与重置
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToFingersAdjustmentWithRequest:(FingersAdjustmentRequest *)request handler:(void(^)(FingersAdjustmentResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark ArmAdjustment(ArmAdjustmentRequest) returns (ArmAdjustmentResponse)

/**
 * 手臂调整方法
 * 调整手臂位置重置、使能与失能。
 * 失能后可通过外力移动至相应位置后通过使能恢复锁定当前位置
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)armAdjustmentWithRequest:(ArmAdjustmentRequest *)request handler:(void(^)(ArmAdjustmentResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 手臂调整方法
 * 调整手臂位置重置、使能与失能。
 * 失能后可通过外力移动至相应位置后通过使能恢复锁定当前位置
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToArmAdjustmentWithRequest:(ArmAdjustmentRequest *)request handler:(void(^)(ArmAdjustmentResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark MarkAsOriginalPosition(MarkAsOriginalPositionRequest) returns (MarkAsOriginalPositionResponse)

/**
 * 标记当前位置为初始位置
 * 所有位置数据将基于此点进行计算
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)markAsOriginalPositionWithRequest:(MarkAsOriginalPositionRequest *)request handler:(void(^)(MarkAsOriginalPositionResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 标记当前位置为初始位置
 * 所有位置数据将基于此点进行计算
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToMarkAsOriginalPositionWithRequest:(MarkAsOriginalPositionRequest *)request handler:(void(^)(MarkAsOriginalPositionResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark GetAbsolutePosition(GetAbsolutePositionRequest) returns (GetAbsolutePositionResponse)

/**
 * 获取当前绝对位置
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getAbsolutePositionWithRequest:(GetAbsolutePositionRequest *)request handler:(void(^)(GetAbsolutePositionResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 获取当前绝对位置
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetAbsolutePositionWithRequest:(GetAbsolutePositionRequest *)request handler:(void(^)(GetAbsolutePositionResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark AbsoluteMove(AbsoluteMoveRequest) returns (AbsoluteMoveResponse)

/**
 * 绝对位置移动
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)absoluteMoveWithRequest:(AbsoluteMoveRequest *)request handler:(void(^)(AbsoluteMoveResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 绝对位置移动
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToAbsoluteMoveWithRequest:(AbsoluteMoveRequest *)request handler:(void(^)(AbsoluteMoveResponse *_Nullable response, NSError *_Nullable error))handler;


@end


#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
/**
 * Basic service implementation, over gRPC, that only does
 * marshalling and parsing.
 */
@interface Capability : GRPCProtoService<Capability, Capability2>
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions NS_DESIGNATED_INITIALIZER;
+ (instancetype)serviceWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions;
// The following methods belong to a set of old APIs that have been deprecated.
- (instancetype)initWithHost:(NSString *)host;
+ (instancetype)serviceWithHost:(NSString *)host;
@end
#endif

NS_ASSUME_NONNULL_END

