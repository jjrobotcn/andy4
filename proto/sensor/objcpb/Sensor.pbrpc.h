#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
#import "Sensor.pbobjc.h"
#endif

#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import <ProtoRPC/ProtoService.h>
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriteable.h>
#import <RxLibrary/GRXWriter.h>
#endif

@class GetDetectRequest;
@class GetDetectResponse;
@class GetMotionInductionRequest;
@class GetMotionInductionResponse;
@class GetTouchRequest;
@class GetTouchResponse;
@class RawRequest;
@class RawResponse;

#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
#endif

@class GRPCProtoCall;
@class GRPCUnaryProtoCall;
@class GRPCStreamingProtoCall;
@class GRPCCallOptions;
@protocol GRPCProtoResponseHandler;


NS_ASSUME_NONNULL_BEGIN

@protocol SensorService2 <NSObject>

#pragma mark GetDetect(GetDetectRequest) returns (stream GetDetectResponse)

/**
 * 获取感应数据流
 */
- (GRPCUnaryProtoCall *)getDetectWithMessage:(GetDetectRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark GetMotionInduction(GetMotionInductionRequest) returns (stream GetMotionInductionResponse)

/**
 * 获取动态感应数据
 * 场景示例： 迎宾感应
 */
- (GRPCUnaryProtoCall *)getMotionInductionWithMessage:(GetMotionInductionRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark GetTouch(GetTouchRequest) returns (stream GetTouchResponse)

/**
 * 获取触摸数据流
 */
- (GRPCUnaryProtoCall *)getTouchWithMessage:(GetTouchRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark Raw(RawRequest) returns (stream RawResponse)

/**
 * 获取传感器原始数据调试接口
 */
- (GRPCUnaryProtoCall *)rawWithMessage:(RawRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

@end

/**
 * The methods in this protocol belong to a set of old APIs that have been deprecated. They do not
 * recognize call options provided in the initializer. Using the v2 protocol is recommended.
 */
@protocol SensorService <NSObject>

#pragma mark GetDetect(GetDetectRequest) returns (stream GetDetectResponse)

/**
 * 获取感应数据流
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getDetectWithRequest:(GetDetectRequest *)request eventHandler:(void(^)(BOOL done, GetDetectResponse *_Nullable response, NSError *_Nullable error))eventHandler;

/**
 * 获取感应数据流
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetDetectWithRequest:(GetDetectRequest *)request eventHandler:(void(^)(BOOL done, GetDetectResponse *_Nullable response, NSError *_Nullable error))eventHandler;


#pragma mark GetMotionInduction(GetMotionInductionRequest) returns (stream GetMotionInductionResponse)

/**
 * 获取动态感应数据
 * 场景示例： 迎宾感应
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getMotionInductionWithRequest:(GetMotionInductionRequest *)request eventHandler:(void(^)(BOOL done, GetMotionInductionResponse *_Nullable response, NSError *_Nullable error))eventHandler;

/**
 * 获取动态感应数据
 * 场景示例： 迎宾感应
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetMotionInductionWithRequest:(GetMotionInductionRequest *)request eventHandler:(void(^)(BOOL done, GetMotionInductionResponse *_Nullable response, NSError *_Nullable error))eventHandler;


#pragma mark GetTouch(GetTouchRequest) returns (stream GetTouchResponse)

/**
 * 获取触摸数据流
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getTouchWithRequest:(GetTouchRequest *)request eventHandler:(void(^)(BOOL done, GetTouchResponse *_Nullable response, NSError *_Nullable error))eventHandler;

/**
 * 获取触摸数据流
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetTouchWithRequest:(GetTouchRequest *)request eventHandler:(void(^)(BOOL done, GetTouchResponse *_Nullable response, NSError *_Nullable error))eventHandler;


#pragma mark Raw(RawRequest) returns (stream RawResponse)

/**
 * 获取传感器原始数据调试接口
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)rawWithRequest:(RawRequest *)request eventHandler:(void(^)(BOOL done, RawResponse *_Nullable response, NSError *_Nullable error))eventHandler;

/**
 * 获取传感器原始数据调试接口
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToRawWithRequest:(RawRequest *)request eventHandler:(void(^)(BOOL done, RawResponse *_Nullable response, NSError *_Nullable error))eventHandler;


@end


#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
/**
 * Basic service implementation, over gRPC, that only does
 * marshalling and parsing.
 */
@interface SensorService : GRPCProtoService<SensorService, SensorService2>
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions NS_DESIGNATED_INITIALIZER;
+ (instancetype)serviceWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions;
// The following methods belong to a set of old APIs that have been deprecated.
- (instancetype)initWithHost:(NSString *)host;
+ (instancetype)serviceWithHost:(NSString *)host;
@end
#endif

NS_ASSUME_NONNULL_END

