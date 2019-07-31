#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import "Player.pbrpc.h"
#import "Player.pbobjc.h"
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriter+Immediate.h>

#import "google/api/Annotations.pbobjc.h"

@implementation Player

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-designated-initializers"

// Designated initializer
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [super initWithHost:host
                 packageName:@"handsmotion"
                 serviceName:@"Player"
                 callOptions:callOptions];
}

- (instancetype)initWithHost:(NSString *)host {
  return [super initWithHost:host
                 packageName:@"handsmotion"
                 serviceName:@"Player"];
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

#pragma mark Play(PlayRequest) returns (PlayResponse)

// Deprecated methods.
/**
 * Play为播放动作组对象方法
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)playWithRequest:(PlayRequest *)request handler:(void(^)(PlayResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPlayWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * Play为播放动作组对象方法
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToPlayWithRequest:(PlayRequest *)request handler:(void(^)(PlayResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"Play"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[PlayResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * Play为播放动作组对象方法
 */
- (GRPCUnaryProtoCall *)playWithMessage:(PlayRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"Play"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[PlayResponse class]];
}

#pragma mark Stop(StopRequest) returns (StopResponse)

// Deprecated methods.
/**
 * Stop为停止动作组对象方法
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)stopWithRequest:(StopRequest *)request handler:(void(^)(StopResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToStopWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * Stop为停止动作组对象方法
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToStopWithRequest:(StopRequest *)request handler:(void(^)(StopResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"Stop"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[StopResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * Stop为停止动作组对象方法
 */
- (GRPCUnaryProtoCall *)stopWithMessage:(StopRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"Stop"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[StopResponse class]];
}

#pragma mark Reset(ResetRequest) returns (ResetResponse)

// Deprecated methods.
/**
 * Reset为重置初始状态方法
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)resetWithRequest:(ResetRequest *)request handler:(void(^)(ResetResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToResetWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * Reset为重置初始状态方法
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToResetWithRequest:(ResetRequest *)request handler:(void(^)(ResetResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"Reset"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[ResetResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * Reset为重置初始状态方法
 */
- (GRPCUnaryProtoCall *)resetWithMessage:(ResetRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"Reset"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[ResetResponse class]];
}

#pragma mark Playlist(PlaylistRequest) returns (PlaylistResponse)

// Deprecated methods.
/**
 * Playlist为获取动作组对象列表方法
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)playlistWithRequest:(PlaylistRequest *)request handler:(void(^)(PlaylistResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPlaylistWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * Playlist为获取动作组对象列表方法
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToPlaylistWithRequest:(PlaylistRequest *)request handler:(void(^)(PlaylistResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"Playlist"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[PlaylistResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * Playlist为获取动作组对象列表方法
 */
- (GRPCUnaryProtoCall *)playlistWithMessage:(PlaylistRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"Playlist"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[PlaylistResponse class]];
}

#pragma mark State(StateRequest) returns (StateResponse)

// Deprecated methods.
/**
 * State为查询当前player状态方法
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)stateWithRequest:(StateRequest *)request handler:(void(^)(StateResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToStateWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * State为查询当前player状态方法
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToStateWithRequest:(StateRequest *)request handler:(void(^)(StateResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"State"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[StateResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * State为查询当前player状态方法
 */
- (GRPCUnaryProtoCall *)stateWithMessage:(StateRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"State"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[StateResponse class]];
}

#pragma mark OnStateChange(OnStateChangeRequest) returns (stream OnStateChangeResponse)

// Deprecated methods.
/**
 * OnStateChange为监听State改变方法，当State状态改变时将流式返回State状态数据
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)onStateChangeWithRequest:(OnStateChangeRequest *)request eventHandler:(void(^)(BOOL done, OnStateChangeResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCToOnStateChangeWithRequest:request eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
/**
 * OnStateChange为监听State改变方法，当State状态改变时将流式返回State状态数据
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToOnStateChangeWithRequest:(OnStateChangeRequest *)request eventHandler:(void(^)(BOOL done, OnStateChangeResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"OnStateChange"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[OnStateChangeResponse class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
/**
 * OnStateChange为监听State改变方法，当State状态改变时将流式返回State状态数据
 */
- (GRPCUnaryProtoCall *)onStateChangeWithMessage:(OnStateChangeRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"OnStateChange"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[OnStateChangeResponse class]];
}

@end
#endif
