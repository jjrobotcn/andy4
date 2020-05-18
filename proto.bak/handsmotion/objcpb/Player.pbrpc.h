#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
#import "Player.pbobjc.h"
#endif

#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import <ProtoRPC/ProtoService.h>
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriteable.h>
#import <RxLibrary/GRXWriter.h>
#endif

@class OnStateChangeRequest;
@class OnStateChangeResponse;
@class PlayRequest;
@class PlayResponse;
@class PlaylistRequest;
@class PlaylistResponse;
@class ResetRequest;
@class ResetResponse;
@class StateRequest;
@class StateResponse;
@class StopRequest;
@class StopResponse;

#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
  #import "google/api/Annotations.pbobjc.h"
#endif

@class GRPCProtoCall;
@class GRPCUnaryProtoCall;
@class GRPCStreamingProtoCall;
@class GRPCCallOptions;
@protocol GRPCProtoResponseHandler;


NS_ASSUME_NONNULL_BEGIN

@protocol Player2 <NSObject>

#pragma mark Play(PlayRequest) returns (PlayResponse)

/**
 * Play为播放动作组对象方法
 */
- (GRPCUnaryProtoCall *)playWithMessage:(PlayRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark Stop(StopRequest) returns (StopResponse)

/**
 * Stop为停止动作组对象方法
 */
- (GRPCUnaryProtoCall *)stopWithMessage:(StopRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark Reset(ResetRequest) returns (ResetResponse)

/**
 * Reset为重置初始状态方法
 */
- (GRPCUnaryProtoCall *)resetWithMessage:(ResetRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark Playlist(PlaylistRequest) returns (PlaylistResponse)

/**
 * Playlist为获取动作组对象列表方法
 */
- (GRPCUnaryProtoCall *)playlistWithMessage:(PlaylistRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark State(StateRequest) returns (StateResponse)

/**
 * State为查询当前player状态方法
 */
- (GRPCUnaryProtoCall *)stateWithMessage:(StateRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark OnStateChange(OnStateChangeRequest) returns (stream OnStateChangeResponse)

/**
 * OnStateChange为监听State改变方法，当State状态改变时将流式返回State状态数据
 */
- (GRPCUnaryProtoCall *)onStateChangeWithMessage:(OnStateChangeRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

@end

/**
 * The methods in this protocol belong to a set of old APIs that have been deprecated. They do not
 * recognize call options provided in the initializer. Using the v2 protocol is recommended.
 */
@protocol Player <NSObject>

#pragma mark Play(PlayRequest) returns (PlayResponse)

/**
 * Play为播放动作组对象方法
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)playWithRequest:(PlayRequest *)request handler:(void(^)(PlayResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * Play为播放动作组对象方法
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToPlayWithRequest:(PlayRequest *)request handler:(void(^)(PlayResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark Stop(StopRequest) returns (StopResponse)

/**
 * Stop为停止动作组对象方法
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)stopWithRequest:(StopRequest *)request handler:(void(^)(StopResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * Stop为停止动作组对象方法
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToStopWithRequest:(StopRequest *)request handler:(void(^)(StopResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark Reset(ResetRequest) returns (ResetResponse)

/**
 * Reset为重置初始状态方法
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)resetWithRequest:(ResetRequest *)request handler:(void(^)(ResetResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * Reset为重置初始状态方法
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToResetWithRequest:(ResetRequest *)request handler:(void(^)(ResetResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark Playlist(PlaylistRequest) returns (PlaylistResponse)

/**
 * Playlist为获取动作组对象列表方法
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)playlistWithRequest:(PlaylistRequest *)request handler:(void(^)(PlaylistResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * Playlist为获取动作组对象列表方法
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToPlaylistWithRequest:(PlaylistRequest *)request handler:(void(^)(PlaylistResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark State(StateRequest) returns (StateResponse)

/**
 * State为查询当前player状态方法
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)stateWithRequest:(StateRequest *)request handler:(void(^)(StateResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * State为查询当前player状态方法
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToStateWithRequest:(StateRequest *)request handler:(void(^)(StateResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark OnStateChange(OnStateChangeRequest) returns (stream OnStateChangeResponse)

/**
 * OnStateChange为监听State改变方法，当State状态改变时将流式返回State状态数据
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)onStateChangeWithRequest:(OnStateChangeRequest *)request eventHandler:(void(^)(BOOL done, OnStateChangeResponse *_Nullable response, NSError *_Nullable error))eventHandler;

/**
 * OnStateChange为监听State改变方法，当State状态改变时将流式返回State状态数据
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToOnStateChangeWithRequest:(OnStateChangeRequest *)request eventHandler:(void(^)(BOOL done, OnStateChangeResponse *_Nullable response, NSError *_Nullable error))eventHandler;


@end


#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
/**
 * Basic service implementation, over gRPC, that only does
 * marshalling and parsing.
 */
@interface Player : GRPCProtoService<Player, Player2>
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions NS_DESIGNATED_INITIALIZER;
+ (instancetype)serviceWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions;
// The following methods belong to a set of old APIs that have been deprecated.
- (instancetype)initWithHost:(NSString *)host;
+ (instancetype)serviceWithHost:(NSString *)host;
@end
#endif

NS_ASSUME_NONNULL_END

