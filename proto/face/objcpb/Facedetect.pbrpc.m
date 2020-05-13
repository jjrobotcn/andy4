#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import "Facedetect.pbrpc.h"
#import "Facedetect.pbobjc.h"
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriter+Immediate.h>

#import "google/api/Annotations.pbobjc.h"

@implementation FaceDetect

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-designated-initializers"

// Designated initializer
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [super initWithHost:host
                 packageName:@"faceRecognition"
                 serviceName:@"FaceDetect"
                 callOptions:callOptions];
}

- (instancetype)initWithHost:(NSString *)host {
  return [super initWithHost:host
                 packageName:@"faceRecognition"
                 serviceName:@"FaceDetect"];
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

#pragma mark FromImage(FromImageRequest) returns (FromImageResponse)

// Deprecated methods.
/**
 * FromImage实现对输入图片进行人脸检测，返回检测人脸图片列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)fromImageWithRequest:(FromImageRequest *)request handler:(void(^)(FromImageResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToFromImageWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * FromImage实现对输入图片进行人脸检测，返回检测人脸图片列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToFromImageWithRequest:(FromImageRequest *)request handler:(void(^)(FromImageResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"FromImage"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[FromImageResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * FromImage实现对输入图片进行人脸检测，返回检测人脸图片列表
 */
- (GRPCUnaryProtoCall *)fromImageWithMessage:(FromImageRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"FromImage"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[FromImageResponse class]];
}

#pragma mark OnFaceDetect(OnFaceDetectRequest) returns (stream OnFaceDetectResponse)

// Deprecated methods.
/**
 * OnFaceDetect实现动态检测人脸，流式返回检测人脸图片戳列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)onFaceDetectWithRequest:(OnFaceDetectRequest *)request eventHandler:(void(^)(BOOL done, OnFaceDetectResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCToOnFaceDetectWithRequest:request eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
/**
 * OnFaceDetect实现动态检测人脸，流式返回检测人脸图片戳列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToOnFaceDetectWithRequest:(OnFaceDetectRequest *)request eventHandler:(void(^)(BOOL done, OnFaceDetectResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"OnFaceDetect"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[OnFaceDetectResponse class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
/**
 * OnFaceDetect实现动态检测人脸，流式返回检测人脸图片戳列表
 */
- (GRPCUnaryProtoCall *)onFaceDetectWithMessage:(OnFaceDetectRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"OnFaceDetect"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[OnFaceDetectResponse class]];
}

#pragma mark OnFaceSetFaceDetect(OnFaceSetFaceDetectRequest) returns (stream OnFaceSetFaceDetectResponse)

// Deprecated methods.
/**
 * OnFaceSetFaceDetect实现动态检测人脸并与指定FaceSet进行对比，流式返回检测结果
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)onFaceSetFaceDetectWithRequest:(OnFaceSetFaceDetectRequest *)request eventHandler:(void(^)(BOOL done, OnFaceSetFaceDetectResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCToOnFaceSetFaceDetectWithRequest:request eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
/**
 * OnFaceSetFaceDetect实现动态检测人脸并与指定FaceSet进行对比，流式返回检测结果
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToOnFaceSetFaceDetectWithRequest:(OnFaceSetFaceDetectRequest *)request eventHandler:(void(^)(BOOL done, OnFaceSetFaceDetectResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"OnFaceSetFaceDetect"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[OnFaceSetFaceDetectResponse class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
/**
 * OnFaceSetFaceDetect实现动态检测人脸并与指定FaceSet进行对比，流式返回检测结果
 */
- (GRPCUnaryProtoCall *)onFaceSetFaceDetectWithMessage:(OnFaceSetFaceDetectRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"OnFaceSetFaceDetect"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[OnFaceSetFaceDetectResponse class]];
}

@end
#endif
