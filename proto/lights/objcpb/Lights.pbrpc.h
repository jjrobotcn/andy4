#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
#import "Lights.pbobjc.h"
#endif

#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import <ProtoRPC/ProtoService.h>
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriteable.h>
#import <RxLibrary/GRXWriter.h>
#endif

@class DeleteLightsRequest;
@class DeleteLightsResponse;
@class ListLightsRequest;
@class ListLightsResponse;
@class NewLightRequest;
@class NewLightResponse;
@class PlayLightRequest;
@class PlayLightResponse;
@class PreviewLightRequest;
@class PreviewLightResponse;
@class StateRequest;
@class StateResponse;
@class StopLightRequest;
@class StopLightResponse;
@class SwitchRequest;
@class SwitchResponse;
@class UpdateLightRequest;
@class UpdateLightResponse;

#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
  #import "google/api/Annotations.pbobjc.h"
#endif

@class GRPCProtoCall;
@class GRPCUnaryProtoCall;
@class GRPCStreamingProtoCall;
@class GRPCCallOptions;
@protocol GRPCProtoResponseHandler;


NS_ASSUME_NONNULL_BEGIN

@protocol LightsService2 <NSObject>

#pragma mark PreviewLight(PreviewLightRequest) returns (PreviewLightResponse)

/**
 * 预览灯光
 * 创建灯光后使用此方法生成灯光文件
 * 在未生成灯光文件前调用PlayLight将无效
 */
- (GRPCUnaryProtoCall *)previewLightWithMessage:(PreviewLightRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark PlayLight(PlayLightRequest) returns (PlayLightResponse)

/**
 * 播放灯光
 * 需在播放前执行PreviewLight生成灯光文件
 */
- (GRPCUnaryProtoCall *)playLightWithMessage:(PlayLightRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark StopLight(StopLightRequest) returns (StopLightResponse)

/**
 * 停止灯光
 */
- (GRPCUnaryProtoCall *)stopLightWithMessage:(StopLightRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark ListLights(ListLightsRequest) returns (ListLightsResponse)

/**
 * 获取灯光数据
 */
- (GRPCUnaryProtoCall *)listLightsWithMessage:(ListLightsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark NewLight(NewLightRequest) returns (NewLightResponse)

/**
 * 创建灯光
 */
- (GRPCUnaryProtoCall *)newLightWithMessage:(NewLightRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark UpdateLight(UpdateLightRequest) returns (UpdateLightResponse)

/**
 * 更新灯光数据
 */
- (GRPCUnaryProtoCall *)updateLightWithMessage:(UpdateLightRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark DeleteLights(DeleteLightsRequest) returns (DeleteLightsResponse)

/**
 * 删除灯光
 */
- (GRPCUnaryProtoCall *)deleteLightsWithMessage:(DeleteLightsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark State(StateRequest) returns (StateResponse)

/**
 * 获取当前灯光模块状态
 */
- (GRPCUnaryProtoCall *)stateWithMessage:(StateRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark Switch(SwitchRequest) returns (SwitchResponse)

/**
 * 控制灯光的开关
 */
- (GRPCUnaryProtoCall *)switchWithMessage:(SwitchRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

@end

/**
 * The methods in this protocol belong to a set of old APIs that have been deprecated. They do not
 * recognize call options provided in the initializer. Using the v2 protocol is recommended.
 */
@protocol LightsService <NSObject>

#pragma mark PreviewLight(PreviewLightRequest) returns (PreviewLightResponse)

/**
 * 预览灯光
 * 创建灯光后使用此方法生成灯光文件
 * 在未生成灯光文件前调用PlayLight将无效
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)previewLightWithRequest:(PreviewLightRequest *)request handler:(void(^)(PreviewLightResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 预览灯光
 * 创建灯光后使用此方法生成灯光文件
 * 在未生成灯光文件前调用PlayLight将无效
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToPreviewLightWithRequest:(PreviewLightRequest *)request handler:(void(^)(PreviewLightResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark PlayLight(PlayLightRequest) returns (PlayLightResponse)

/**
 * 播放灯光
 * 需在播放前执行PreviewLight生成灯光文件
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)playLightWithRequest:(PlayLightRequest *)request handler:(void(^)(PlayLightResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 播放灯光
 * 需在播放前执行PreviewLight生成灯光文件
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToPlayLightWithRequest:(PlayLightRequest *)request handler:(void(^)(PlayLightResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark StopLight(StopLightRequest) returns (StopLightResponse)

/**
 * 停止灯光
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)stopLightWithRequest:(StopLightRequest *)request handler:(void(^)(StopLightResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 停止灯光
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToStopLightWithRequest:(StopLightRequest *)request handler:(void(^)(StopLightResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark ListLights(ListLightsRequest) returns (ListLightsResponse)

/**
 * 获取灯光数据
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listLightsWithRequest:(ListLightsRequest *)request handler:(void(^)(ListLightsResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 获取灯光数据
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListLightsWithRequest:(ListLightsRequest *)request handler:(void(^)(ListLightsResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark NewLight(NewLightRequest) returns (NewLightResponse)

/**
 * 创建灯光
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)newLightWithRequest:(NewLightRequest *)request handler:(void(^)(NewLightResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 创建灯光
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToNewLightWithRequest:(NewLightRequest *)request handler:(void(^)(NewLightResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark UpdateLight(UpdateLightRequest) returns (UpdateLightResponse)

/**
 * 更新灯光数据
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)updateLightWithRequest:(UpdateLightRequest *)request handler:(void(^)(UpdateLightResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 更新灯光数据
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToUpdateLightWithRequest:(UpdateLightRequest *)request handler:(void(^)(UpdateLightResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark DeleteLights(DeleteLightsRequest) returns (DeleteLightsResponse)

/**
 * 删除灯光
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)deleteLightsWithRequest:(DeleteLightsRequest *)request handler:(void(^)(DeleteLightsResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 删除灯光
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToDeleteLightsWithRequest:(DeleteLightsRequest *)request handler:(void(^)(DeleteLightsResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark State(StateRequest) returns (StateResponse)

/**
 * 获取当前灯光模块状态
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)stateWithRequest:(StateRequest *)request handler:(void(^)(StateResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 获取当前灯光模块状态
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToStateWithRequest:(StateRequest *)request handler:(void(^)(StateResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark Switch(SwitchRequest) returns (SwitchResponse)

/**
 * 控制灯光的开关
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)switchWithRequest:(SwitchRequest *)request handler:(void(^)(SwitchResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 控制灯光的开关
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
@interface LightsService : GRPCProtoService<LightsService, LightsService2>
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions NS_DESIGNATED_INITIALIZER;
+ (instancetype)serviceWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions;
// The following methods belong to a set of old APIs that have been deprecated.
- (instancetype)initWithHost:(NSString *)host;
+ (instancetype)serviceWithHost:(NSString *)host;
@end
#endif

NS_ASSUME_NONNULL_END

