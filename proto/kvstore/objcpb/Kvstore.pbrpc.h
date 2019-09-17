#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
#import "Kvstore.pbobjc.h"
#endif

#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import <ProtoRPC/ProtoService.h>
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriteable.h>
#import <RxLibrary/GRXWriter.h>
#endif

@class DeleteRequest;
@class DeleteResponse;
@class GetPrefixRequest;
@class GetPrefixResponse;
@class GetPrefixStreamRequest;
@class GetPrefixStreamResponse;
@class GetRequest;
@class GetResponse;
@class PutRequest;
@class PutResponse;

#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
  #import "google/api/Annotations.pbobjc.h"
#endif

@class GRPCProtoCall;
@class GRPCUnaryProtoCall;
@class GRPCStreamingProtoCall;
@class GRPCCallOptions;
@protocol GRPCProtoResponseHandler;


NS_ASSUME_NONNULL_BEGIN

@protocol KVStore2 <NSObject>

#pragma mark Put(PutRequest) returns (PutResponse)

/**
 * Put 创建kv键值对
 * 若key已存在将更新value值
 */
- (GRPCUnaryProtoCall *)putWithMessage:(PutRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark Get(GetRequest) returns (GetResponse)

/**
 * Get 获取key的value
 * 若key不存在则返回gRPC错误:NotFound
 */
- (GRPCUnaryProtoCall *)getWithMessage:(GetRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark GetPrefix(GetPrefixRequest) returns (GetPrefixResponse)

/**
 * GetPrefix 获取符合key_prefix的多个kv键值对
 */
- (GRPCUnaryProtoCall *)getPrefixWithMessage:(GetPrefixRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark GetPrefixStream(GetPrefixStreamRequest) returns (stream GetPrefixStreamResponse)

/**
 * GetPrefixStream gRPC stream方式获取符合key_prefix的多个kv键值对
 */
- (GRPCUnaryProtoCall *)getPrefixStreamWithMessage:(GetPrefixStreamRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark Delete(DeleteRequest) returns (DeleteResponse)

/**
 * Delete 删除kv键值对
 */
- (GRPCUnaryProtoCall *)deleteWithMessage:(DeleteRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

@end

/**
 * The methods in this protocol belong to a set of old APIs that have been deprecated. They do not
 * recognize call options provided in the initializer. Using the v2 protocol is recommended.
 */
@protocol KVStore <NSObject>

#pragma mark Put(PutRequest) returns (PutResponse)

/**
 * Put 创建kv键值对
 * 若key已存在将更新value值
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)putWithRequest:(PutRequest *)request handler:(void(^)(PutResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * Put 创建kv键值对
 * 若key已存在将更新value值
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToPutWithRequest:(PutRequest *)request handler:(void(^)(PutResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark Get(GetRequest) returns (GetResponse)

/**
 * Get 获取key的value
 * 若key不存在则返回gRPC错误:NotFound
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getWithRequest:(GetRequest *)request handler:(void(^)(GetResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * Get 获取key的value
 * 若key不存在则返回gRPC错误:NotFound
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetWithRequest:(GetRequest *)request handler:(void(^)(GetResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark GetPrefix(GetPrefixRequest) returns (GetPrefixResponse)

/**
 * GetPrefix 获取符合key_prefix的多个kv键值对
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getPrefixWithRequest:(GetPrefixRequest *)request handler:(void(^)(GetPrefixResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * GetPrefix 获取符合key_prefix的多个kv键值对
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetPrefixWithRequest:(GetPrefixRequest *)request handler:(void(^)(GetPrefixResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark GetPrefixStream(GetPrefixStreamRequest) returns (stream GetPrefixStreamResponse)

/**
 * GetPrefixStream gRPC stream方式获取符合key_prefix的多个kv键值对
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getPrefixStreamWithRequest:(GetPrefixStreamRequest *)request eventHandler:(void(^)(BOOL done, GetPrefixStreamResponse *_Nullable response, NSError *_Nullable error))eventHandler;

/**
 * GetPrefixStream gRPC stream方式获取符合key_prefix的多个kv键值对
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetPrefixStreamWithRequest:(GetPrefixStreamRequest *)request eventHandler:(void(^)(BOOL done, GetPrefixStreamResponse *_Nullable response, NSError *_Nullable error))eventHandler;


#pragma mark Delete(DeleteRequest) returns (DeleteResponse)

/**
 * Delete 删除kv键值对
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)deleteWithRequest:(DeleteRequest *)request handler:(void(^)(DeleteResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * Delete 删除kv键值对
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToDeleteWithRequest:(DeleteRequest *)request handler:(void(^)(DeleteResponse *_Nullable response, NSError *_Nullable error))handler;


@end


#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
/**
 * Basic service implementation, over gRPC, that only does
 * marshalling and parsing.
 */
@interface KVStore : GRPCProtoService<KVStore, KVStore2>
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions NS_DESIGNATED_INITIALIZER;
+ (instancetype)serviceWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions;
// The following methods belong to a set of old APIs that have been deprecated.
- (instancetype)initWithHost:(NSString *)host;
+ (instancetype)serviceWithHost:(NSString *)host;
@end
#endif

NS_ASSUME_NONNULL_END

