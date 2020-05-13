#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import "Face.pbrpc.h"
#import "Face.pbobjc.h"
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriter+Immediate.h>

#import "google/api/Annotations.pbobjc.h"

@implementation FaceService

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-designated-initializers"

// Designated initializer
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [super initWithHost:host
                 packageName:@"faceRecognition"
                 serviceName:@"FaceService"
                 callOptions:callOptions];
}

- (instancetype)initWithHost:(NSString *)host {
  return [super initWithHost:host
                 packageName:@"faceRecognition"
                 serviceName:@"FaceService"];
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

#pragma mark Compare(CompareRequest) returns (CompareResponse)

// Deprecated methods.
/**
 * Compare方法实现了两张人脸图片对比识别，返回两图片的对比可信度
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)compareWithRequest:(CompareRequest *)request handler:(void(^)(CompareResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToCompareWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * Compare方法实现了两张人脸图片对比识别，返回两图片的对比可信度
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToCompareWithRequest:(CompareRequest *)request handler:(void(^)(CompareResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"Compare"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[CompareResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * Compare方法实现了两张人脸图片对比识别，返回两图片的对比可信度
 */
- (GRPCUnaryProtoCall *)compareWithMessage:(CompareRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"Compare"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[CompareResponse class]];
}

#pragma mark Search(SearchRequest) returns (SearchResponse)

// Deprecated methods.
/**
 * Search方法实现搜索FaceSet中近似人脸数据，
 * 若存在匹配数据时返回一个FaceDetail及其confidence
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)searchWithRequest:(SearchRequest *)request handler:(void(^)(SearchResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToSearchWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * Search方法实现搜索FaceSet中近似人脸数据，
 * 若存在匹配数据时返回一个FaceDetail及其confidence
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToSearchWithRequest:(SearchRequest *)request handler:(void(^)(SearchResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"Search"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[SearchResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * Search方法实现搜索FaceSet中近似人脸数据，
 * 若存在匹配数据时返回一个FaceDetail及其confidence
 */
- (GRPCUnaryProtoCall *)searchWithMessage:(SearchRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"Search"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[SearchResponse class]];
}

@end
#endif
