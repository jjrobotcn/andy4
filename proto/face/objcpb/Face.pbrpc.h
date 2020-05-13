#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
#import "Face.pbobjc.h"
#endif

#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import <ProtoRPC/ProtoService.h>
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriteable.h>
#import <RxLibrary/GRXWriter.h>
#endif

@class CompareRequest;
@class CompareResponse;
@class SearchRequest;
@class SearchResponse;

#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
  #import "google/api/Annotations.pbobjc.h"
#endif

@class GRPCProtoCall;
@class GRPCUnaryProtoCall;
@class GRPCStreamingProtoCall;
@class GRPCCallOptions;
@protocol GRPCProtoResponseHandler;


NS_ASSUME_NONNULL_BEGIN

@protocol FaceService2 <NSObject>

#pragma mark Compare(CompareRequest) returns (CompareResponse)

/**
 * Compare方法实现了两张人脸图片对比识别，返回两图片的对比可信度
 */
- (GRPCUnaryProtoCall *)compareWithMessage:(CompareRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark Search(SearchRequest) returns (SearchResponse)

/**
 * Search方法实现搜索FaceSet中近似人脸数据，
 * 若存在匹配数据时返回一个FaceDetail及其confidence
 */
- (GRPCUnaryProtoCall *)searchWithMessage:(SearchRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

@end

/**
 * The methods in this protocol belong to a set of old APIs that have been deprecated. They do not
 * recognize call options provided in the initializer. Using the v2 protocol is recommended.
 */
@protocol FaceService <NSObject>

#pragma mark Compare(CompareRequest) returns (CompareResponse)

/**
 * Compare方法实现了两张人脸图片对比识别，返回两图片的对比可信度
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)compareWithRequest:(CompareRequest *)request handler:(void(^)(CompareResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * Compare方法实现了两张人脸图片对比识别，返回两图片的对比可信度
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToCompareWithRequest:(CompareRequest *)request handler:(void(^)(CompareResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark Search(SearchRequest) returns (SearchResponse)

/**
 * Search方法实现搜索FaceSet中近似人脸数据，
 * 若存在匹配数据时返回一个FaceDetail及其confidence
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)searchWithRequest:(SearchRequest *)request handler:(void(^)(SearchResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * Search方法实现搜索FaceSet中近似人脸数据，
 * 若存在匹配数据时返回一个FaceDetail及其confidence
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToSearchWithRequest:(SearchRequest *)request handler:(void(^)(SearchResponse *_Nullable response, NSError *_Nullable error))handler;


@end


#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
/**
 * Basic service implementation, over gRPC, that only does
 * marshalling and parsing.
 */
@interface FaceService : GRPCProtoService<FaceService, FaceService2>
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions NS_DESIGNATED_INITIALIZER;
+ (instancetype)serviceWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions;
// The following methods belong to a set of old APIs that have been deprecated.
- (instancetype)initWithHost:(NSString *)host;
+ (instancetype)serviceWithHost:(NSString *)host;
@end
#endif

NS_ASSUME_NONNULL_END

