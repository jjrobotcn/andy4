#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import "Kvstore.pbrpc.h"
#import "Kvstore.pbobjc.h"
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriter+Immediate.h>

#import "google/api/Annotations.pbobjc.h"

@implementation KVStore

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-designated-initializers"

// Designated initializer
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [super initWithHost:host
                 packageName:@"kvstore"
                 serviceName:@"KVStore"
                 callOptions:callOptions];
}

- (instancetype)initWithHost:(NSString *)host {
  return [super initWithHost:host
                 packageName:@"kvstore"
                 serviceName:@"KVStore"];
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

#pragma mark Put(PutRequest) returns (PutResponse)

// Deprecated methods.
/**
 * Put 创建kv键值对
 * 若key已存在将更新value值
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)putWithRequest:(PutRequest *)request handler:(void(^)(PutResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPutWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * Put 创建kv键值对
 * 若key已存在将更新value值
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToPutWithRequest:(PutRequest *)request handler:(void(^)(PutResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"Put"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[PutResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * Put 创建kv键值对
 * 若key已存在将更新value值
 */
- (GRPCUnaryProtoCall *)putWithMessage:(PutRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"Put"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[PutResponse class]];
}

#pragma mark Get(GetRequest) returns (GetResponse)

// Deprecated methods.
/**
 * Get 获取key的value
 * 若key不存在则返回gRPC错误:NotFound
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getWithRequest:(GetRequest *)request handler:(void(^)(GetResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToGetWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * Get 获取key的value
 * 若key不存在则返回gRPC错误:NotFound
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetWithRequest:(GetRequest *)request handler:(void(^)(GetResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"Get"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * Get 获取key的value
 * 若key不存在则返回gRPC错误:NotFound
 */
- (GRPCUnaryProtoCall *)getWithMessage:(GetRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"Get"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[GetResponse class]];
}

#pragma mark GetPrefix(GetPrefixRequest) returns (GetPrefixResponse)

// Deprecated methods.
/**
 * GetPrefix 获取符合key_prefix的多个kv键值对
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getPrefixWithRequest:(GetPrefixRequest *)request handler:(void(^)(GetPrefixResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToGetPrefixWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * GetPrefix 获取符合key_prefix的多个kv键值对
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetPrefixWithRequest:(GetPrefixRequest *)request handler:(void(^)(GetPrefixResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"GetPrefix"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetPrefixResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * GetPrefix 获取符合key_prefix的多个kv键值对
 */
- (GRPCUnaryProtoCall *)getPrefixWithMessage:(GetPrefixRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"GetPrefix"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[GetPrefixResponse class]];
}

#pragma mark GetPrefixStream(GetPrefixStreamRequest) returns (stream GetPrefixStreamResponse)

// Deprecated methods.
/**
 * GetPrefixStream gRPC stream方式获取符合key_prefix的多个kv键值对
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getPrefixStreamWithRequest:(GetPrefixStreamRequest *)request eventHandler:(void(^)(BOOL done, GetPrefixStreamResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCToGetPrefixStreamWithRequest:request eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
/**
 * GetPrefixStream gRPC stream方式获取符合key_prefix的多个kv键值对
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetPrefixStreamWithRequest:(GetPrefixStreamRequest *)request eventHandler:(void(^)(BOOL done, GetPrefixStreamResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"GetPrefixStream"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetPrefixStreamResponse class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
/**
 * GetPrefixStream gRPC stream方式获取符合key_prefix的多个kv键值对
 */
- (GRPCUnaryProtoCall *)getPrefixStreamWithMessage:(GetPrefixStreamRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"GetPrefixStream"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[GetPrefixStreamResponse class]];
}

#pragma mark Delete(DeleteRequest) returns (DeleteResponse)

// Deprecated methods.
/**
 * Delete 删除kv键值对
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)deleteWithRequest:(DeleteRequest *)request handler:(void(^)(DeleteResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToDeleteWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * Delete 删除kv键值对
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToDeleteWithRequest:(DeleteRequest *)request handler:(void(^)(DeleteResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"Delete"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[DeleteResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * Delete 删除kv键值对
 */
- (GRPCUnaryProtoCall *)deleteWithMessage:(DeleteRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"Delete"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[DeleteResponse class]];
}

@end
#endif
