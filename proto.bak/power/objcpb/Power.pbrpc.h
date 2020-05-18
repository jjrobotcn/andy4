#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
#import "Power.pbobjc.h"
#endif

#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import <ProtoRPC/ProtoService.h>
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriteable.h>
#import <RxLibrary/GRXWriter.h>
#endif

@class GetPowerStatusRequest;
@class GetPowerStatusResponse;
@class RebootRequest;
@class RebootResponse;
@class StatesRequest;
@class StatesResponse;
@class SwitchRequest;
@class SwitchResponse;

#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
  #import "google/api/Annotations.pbobjc.h"
#endif

@class GRPCProtoCall;
@class GRPCUnaryProtoCall;
@class GRPCStreamingProtoCall;
@class GRPCCallOptions;
@protocol GRPCProtoResponseHandler;


NS_ASSUME_NONNULL_BEGIN

@protocol PowerService2 <NSObject>

#pragma mark GetPowerStatus(GetPowerStatusRequest) returns (stream GetPowerStatusResponse)

/**
 * 获取电源状态数据流
 */
- (GRPCUnaryProtoCall *)getPowerStatusWithMessage:(GetPowerStatusRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark Reboot(RebootRequest) returns (RebootResponse)

/**
 * 对各模块的电源进行断电方式重启
 */
- (GRPCUnaryProtoCall *)rebootWithMessage:(RebootRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark States(StatesRequest) returns (StatesResponse)

/**
 * 获取所有电源模块状态
 */
- (GRPCUnaryProtoCall *)statesWithMessage:(StatesRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark Switch(SwitchRequest) returns (SwitchResponse)

/**
 * 控制模块供电开关
 */
- (GRPCUnaryProtoCall *)switchWithMessage:(SwitchRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

@end

/**
 * The methods in this protocol belong to a set of old APIs that have been deprecated. They do not
 * recognize call options provided in the initializer. Using the v2 protocol is recommended.
 */
@protocol PowerService <NSObject>

#pragma mark GetPowerStatus(GetPowerStatusRequest) returns (stream GetPowerStatusResponse)

/**
 * 获取电源状态数据流
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getPowerStatusWithRequest:(GetPowerStatusRequest *)request eventHandler:(void(^)(BOOL done, GetPowerStatusResponse *_Nullable response, NSError *_Nullable error))eventHandler;

/**
 * 获取电源状态数据流
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetPowerStatusWithRequest:(GetPowerStatusRequest *)request eventHandler:(void(^)(BOOL done, GetPowerStatusResponse *_Nullable response, NSError *_Nullable error))eventHandler;


#pragma mark Reboot(RebootRequest) returns (RebootResponse)

/**
 * 对各模块的电源进行断电方式重启
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)rebootWithRequest:(RebootRequest *)request handler:(void(^)(RebootResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 对各模块的电源进行断电方式重启
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToRebootWithRequest:(RebootRequest *)request handler:(void(^)(RebootResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark States(StatesRequest) returns (StatesResponse)

/**
 * 获取所有电源模块状态
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)statesWithRequest:(StatesRequest *)request handler:(void(^)(StatesResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 获取所有电源模块状态
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToStatesWithRequest:(StatesRequest *)request handler:(void(^)(StatesResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark Switch(SwitchRequest) returns (SwitchResponse)

/**
 * 控制模块供电开关
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)switchWithRequest:(SwitchRequest *)request handler:(void(^)(SwitchResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 控制模块供电开关
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToSwitchWithRequest:(SwitchRequest *)request handler:(void(^)(SwitchResponse *_Nullable response, NSError *_Nullable error))handler;


@end


#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
/**
 * Basic service implementation, over gRPC, that only does
 * marshalling and parsing.
 */
@interface PowerService : GRPCProtoService<PowerService, PowerService2>
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions NS_DESIGNATED_INITIALIZER;
+ (instancetype)serviceWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions;
// The following methods belong to a set of old APIs that have been deprecated.
- (instancetype)initWithHost:(NSString *)host;
+ (instancetype)serviceWithHost:(NSString *)host;
@end
#endif

NS_ASSUME_NONNULL_END

