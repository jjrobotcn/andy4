#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import "Expression.pbrpc.h"
#import "Expression.pbobjc.h"
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriter+Immediate.h>

#import "google/api/Annotations.pbobjc.h"

@implementation ExpressionService

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-designated-initializers"

// Designated initializer
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [super initWithHost:host
                 packageName:@"expressionService"
                 serviceName:@"ExpressionService"
                 callOptions:callOptions];
}

- (instancetype)initWithHost:(NSString *)host {
  return [super initWithHost:host
                 packageName:@"expressionService"
                 serviceName:@"ExpressionService"];
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

#pragma mark PlayExpressions(PlayExpressionsRequest) returns (PlayExpressionsResponse)

// Deprecated methods.
/**
 * 播放表情
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)playExpressionsWithRequest:(PlayExpressionsRequest *)request handler:(void(^)(PlayExpressionsResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPlayExpressionsWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 播放表情
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToPlayExpressionsWithRequest:(PlayExpressionsRequest *)request handler:(void(^)(PlayExpressionsResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"PlayExpressions"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[PlayExpressionsResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 播放表情
 */
- (GRPCUnaryProtoCall *)playExpressionsWithMessage:(PlayExpressionsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"PlayExpressions"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[PlayExpressionsResponse class]];
}

#pragma mark StopExpression(StopExpressionRequest) returns (StopExpressionResponse)

// Deprecated methods.
/**
 * 停止表情
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)stopExpressionWithRequest:(StopExpressionRequest *)request handler:(void(^)(StopExpressionResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToStopExpressionWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 停止表情
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToStopExpressionWithRequest:(StopExpressionRequest *)request handler:(void(^)(StopExpressionResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"StopExpression"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[StopExpressionResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 停止表情
 */
- (GRPCUnaryProtoCall *)stopExpressionWithMessage:(StopExpressionRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"StopExpression"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[StopExpressionResponse class]];
}

#pragma mark UploadExpressionFile(UploadExpressionFileRequest) returns (UploadExpressionFileResponse)

// Deprecated methods.
/**
 * 上传表情
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)uploadExpressionFileWithRequest:(UploadExpressionFileRequest *)request handler:(void(^)(UploadExpressionFileResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToUploadExpressionFileWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 上传表情
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToUploadExpressionFileWithRequest:(UploadExpressionFileRequest *)request handler:(void(^)(UploadExpressionFileResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"UploadExpressionFile"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[UploadExpressionFileResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 上传表情
 */
- (GRPCUnaryProtoCall *)uploadExpressionFileWithMessage:(UploadExpressionFileRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"UploadExpressionFile"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[UploadExpressionFileResponse class]];
}

#pragma mark Rename(RenameRequest) returns (RenameResponse)

// Deprecated methods.
/**
 * 表情重命名
 * >= v1.1.0
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)renameWithRequest:(RenameRequest *)request handler:(void(^)(RenameResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToRenameWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 表情重命名
 * >= v1.1.0
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToRenameWithRequest:(RenameRequest *)request handler:(void(^)(RenameResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"Rename"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[RenameResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 表情重命名
 * >= v1.1.0
 */
- (GRPCUnaryProtoCall *)renameWithMessage:(RenameRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"Rename"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[RenameResponse class]];
}

#pragma mark ListExpressions(ListExpressionsRequest) returns (ListExpressionsResponse)

// Deprecated methods.
/**
 * 获取表情数据
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listExpressionsWithRequest:(ListExpressionsRequest *)request handler:(void(^)(ListExpressionsResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToListExpressionsWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取表情数据
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListExpressionsWithRequest:(ListExpressionsRequest *)request handler:(void(^)(ListExpressionsResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"ListExpressions"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[ListExpressionsResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 获取表情数据
 */
- (GRPCUnaryProtoCall *)listExpressionsWithMessage:(ListExpressionsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"ListExpressions"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[ListExpressionsResponse class]];
}

#pragma mark DeleteExpressions(DeleteExpressionsRequest) returns (DeleteExpressionsResponse)

// Deprecated methods.
/**
 * 删除表情
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)deleteExpressionsWithRequest:(DeleteExpressionsRequest *)request handler:(void(^)(DeleteExpressionsResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToDeleteExpressionsWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 删除表情
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToDeleteExpressionsWithRequest:(DeleteExpressionsRequest *)request handler:(void(^)(DeleteExpressionsResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"DeleteExpressions"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[DeleteExpressionsResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 删除表情
 */
- (GRPCUnaryProtoCall *)deleteExpressionsWithMessage:(DeleteExpressionsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"DeleteExpressions"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[DeleteExpressionsResponse class]];
}

@end
#endif
