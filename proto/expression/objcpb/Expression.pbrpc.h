#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
#import "Expression.pbobjc.h"
#endif

#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import <ProtoRPC/ProtoService.h>
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriteable.h>
#import <RxLibrary/GRXWriter.h>
#endif

@class DeleteExpressionsRequest;
@class DeleteExpressionsResponse;
@class ListExpressionsRequest;
@class ListExpressionsResponse;
@class PlayExpressionsRequest;
@class PlayExpressionsResponse;
@class RenameRequest;
@class RenameResponse;
@class StateRequest;
@class StateResponse;
@class StopExpressionRequest;
@class StopExpressionResponse;
@class SwitchRequest;
@class SwitchResponse;
@class UploadExpressionFileRequest;
@class UploadExpressionFileResponse;

#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
  #import "google/api/Annotations.pbobjc.h"
#endif

@class GRPCProtoCall;
@class GRPCUnaryProtoCall;
@class GRPCStreamingProtoCall;
@class GRPCCallOptions;
@protocol GRPCProtoResponseHandler;


NS_ASSUME_NONNULL_BEGIN

@protocol ExpressionService2 <NSObject>

#pragma mark PlayExpressions(PlayExpressionsRequest) returns (PlayExpressionsResponse)

/**
 * 播放表情
 */
- (GRPCUnaryProtoCall *)playExpressionsWithMessage:(PlayExpressionsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark StopExpression(StopExpressionRequest) returns (StopExpressionResponse)

/**
 * 停止表情
 */
- (GRPCUnaryProtoCall *)stopExpressionWithMessage:(StopExpressionRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark UploadExpressionFile(UploadExpressionFileRequest) returns (UploadExpressionFileResponse)

/**
 * 上传表情
 */
- (GRPCUnaryProtoCall *)uploadExpressionFileWithMessage:(UploadExpressionFileRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark Rename(RenameRequest) returns (RenameResponse)

/**
 * 表情重命名
 * >= v1.1.0
 */
- (GRPCUnaryProtoCall *)renameWithMessage:(RenameRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark ListExpressions(ListExpressionsRequest) returns (ListExpressionsResponse)

/**
 * 获取表情数据
 */
- (GRPCUnaryProtoCall *)listExpressionsWithMessage:(ListExpressionsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark DeleteExpressions(DeleteExpressionsRequest) returns (DeleteExpressionsResponse)

/**
 * 删除表情
 */
- (GRPCUnaryProtoCall *)deleteExpressionsWithMessage:(DeleteExpressionsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark State(StateRequest) returns (StateResponse)

/**
 * 获取当前表情模块状态
 */
- (GRPCUnaryProtoCall *)stateWithMessage:(StateRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark Switch(SwitchRequest) returns (SwitchResponse)

/**
 * 控制表情的开关
 * 关闭时表现为黑屏
 */
- (GRPCUnaryProtoCall *)switchWithMessage:(SwitchRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

@end

/**
 * The methods in this protocol belong to a set of old APIs that have been deprecated. They do not
 * recognize call options provided in the initializer. Using the v2 protocol is recommended.
 */
@protocol ExpressionService <NSObject>

#pragma mark PlayExpressions(PlayExpressionsRequest) returns (PlayExpressionsResponse)

/**
 * 播放表情
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)playExpressionsWithRequest:(PlayExpressionsRequest *)request handler:(void(^)(PlayExpressionsResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 播放表情
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToPlayExpressionsWithRequest:(PlayExpressionsRequest *)request handler:(void(^)(PlayExpressionsResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark StopExpression(StopExpressionRequest) returns (StopExpressionResponse)

/**
 * 停止表情
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)stopExpressionWithRequest:(StopExpressionRequest *)request handler:(void(^)(StopExpressionResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 停止表情
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToStopExpressionWithRequest:(StopExpressionRequest *)request handler:(void(^)(StopExpressionResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark UploadExpressionFile(UploadExpressionFileRequest) returns (UploadExpressionFileResponse)

/**
 * 上传表情
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)uploadExpressionFileWithRequest:(UploadExpressionFileRequest *)request handler:(void(^)(UploadExpressionFileResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 上传表情
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToUploadExpressionFileWithRequest:(UploadExpressionFileRequest *)request handler:(void(^)(UploadExpressionFileResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark Rename(RenameRequest) returns (RenameResponse)

/**
 * 表情重命名
 * >= v1.1.0
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)renameWithRequest:(RenameRequest *)request handler:(void(^)(RenameResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 表情重命名
 * >= v1.1.0
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToRenameWithRequest:(RenameRequest *)request handler:(void(^)(RenameResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark ListExpressions(ListExpressionsRequest) returns (ListExpressionsResponse)

/**
 * 获取表情数据
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listExpressionsWithRequest:(ListExpressionsRequest *)request handler:(void(^)(ListExpressionsResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 获取表情数据
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListExpressionsWithRequest:(ListExpressionsRequest *)request handler:(void(^)(ListExpressionsResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark DeleteExpressions(DeleteExpressionsRequest) returns (DeleteExpressionsResponse)

/**
 * 删除表情
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)deleteExpressionsWithRequest:(DeleteExpressionsRequest *)request handler:(void(^)(DeleteExpressionsResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 删除表情
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToDeleteExpressionsWithRequest:(DeleteExpressionsRequest *)request handler:(void(^)(DeleteExpressionsResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark State(StateRequest) returns (StateResponse)

/**
 * 获取当前表情模块状态
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)stateWithRequest:(StateRequest *)request handler:(void(^)(StateResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 获取当前表情模块状态
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToStateWithRequest:(StateRequest *)request handler:(void(^)(StateResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark Switch(SwitchRequest) returns (SwitchResponse)

/**
 * 控制表情的开关
 * 关闭时表现为黑屏
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)switchWithRequest:(SwitchRequest *)request handler:(void(^)(SwitchResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 控制表情的开关
 * 关闭时表现为黑屏
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
@interface ExpressionService : GRPCProtoService<ExpressionService, ExpressionService2>
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions NS_DESIGNATED_INITIALIZER;
+ (instancetype)serviceWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions;
// The following methods belong to a set of old APIs that have been deprecated.
- (instancetype)initWithHost:(NSString *)host;
+ (instancetype)serviceWithHost:(NSString *)host;
@end
#endif

NS_ASSUME_NONNULL_END

