#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
#import "Facedetect.pbobjc.h"
#endif

#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import <ProtoRPC/ProtoService.h>
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriteable.h>
#import <RxLibrary/GRXWriter.h>
#endif

@class FromImageRequest;
@class FromImageResponse;
@class OnFaceDetectRequest;
@class OnFaceDetectResponse;
@class OnFaceSetFaceDetectRequest;
@class OnFaceSetFaceDetectResponse;

#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
  #import "google/api/Annotations.pbobjc.h"
#endif

@class GRPCProtoCall;
@class GRPCUnaryProtoCall;
@class GRPCStreamingProtoCall;
@class GRPCCallOptions;
@protocol GRPCProtoResponseHandler;


NS_ASSUME_NONNULL_BEGIN

@protocol FaceDetect2 <NSObject>

#pragma mark FromImage(FromImageRequest) returns (FromImageResponse)

/**
 * FromImage实现对输入图片进行人脸检测，返回检测人脸图片列表
 */
- (GRPCUnaryProtoCall *)fromImageWithMessage:(FromImageRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark OnFaceDetect(OnFaceDetectRequest) returns (stream OnFaceDetectResponse)

/**
 * OnFaceDetect实现动态检测人脸，流式返回检测人脸图片戳列表
 */
- (GRPCUnaryProtoCall *)onFaceDetectWithMessage:(OnFaceDetectRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark OnFaceSetFaceDetect(OnFaceSetFaceDetectRequest) returns (stream OnFaceSetFaceDetectResponse)

/**
 * OnFaceSetFaceDetect实现动态检测人脸并与指定FaceSet进行对比，流式返回检测结果
 */
- (GRPCUnaryProtoCall *)onFaceSetFaceDetectWithMessage:(OnFaceSetFaceDetectRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

@end

/**
 * The methods in this protocol belong to a set of old APIs that have been deprecated. They do not
 * recognize call options provided in the initializer. Using the v2 protocol is recommended.
 */
@protocol FaceDetect <NSObject>

#pragma mark FromImage(FromImageRequest) returns (FromImageResponse)

/**
 * FromImage实现对输入图片进行人脸检测，返回检测人脸图片列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)fromImageWithRequest:(FromImageRequest *)request handler:(void(^)(FromImageResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * FromImage实现对输入图片进行人脸检测，返回检测人脸图片列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToFromImageWithRequest:(FromImageRequest *)request handler:(void(^)(FromImageResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark OnFaceDetect(OnFaceDetectRequest) returns (stream OnFaceDetectResponse)

/**
 * OnFaceDetect实现动态检测人脸，流式返回检测人脸图片戳列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)onFaceDetectWithRequest:(OnFaceDetectRequest *)request eventHandler:(void(^)(BOOL done, OnFaceDetectResponse *_Nullable response, NSError *_Nullable error))eventHandler;

/**
 * OnFaceDetect实现动态检测人脸，流式返回检测人脸图片戳列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToOnFaceDetectWithRequest:(OnFaceDetectRequest *)request eventHandler:(void(^)(BOOL done, OnFaceDetectResponse *_Nullable response, NSError *_Nullable error))eventHandler;


#pragma mark OnFaceSetFaceDetect(OnFaceSetFaceDetectRequest) returns (stream OnFaceSetFaceDetectResponse)

/**
 * OnFaceSetFaceDetect实现动态检测人脸并与指定FaceSet进行对比，流式返回检测结果
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)onFaceSetFaceDetectWithRequest:(OnFaceSetFaceDetectRequest *)request eventHandler:(void(^)(BOOL done, OnFaceSetFaceDetectResponse *_Nullable response, NSError *_Nullable error))eventHandler;

/**
 * OnFaceSetFaceDetect实现动态检测人脸并与指定FaceSet进行对比，流式返回检测结果
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToOnFaceSetFaceDetectWithRequest:(OnFaceSetFaceDetectRequest *)request eventHandler:(void(^)(BOOL done, OnFaceSetFaceDetectResponse *_Nullable response, NSError *_Nullable error))eventHandler;


@end


#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
/**
 * Basic service implementation, over gRPC, that only does
 * marshalling and parsing.
 */
@interface FaceDetect : GRPCProtoService<FaceDetect, FaceDetect2>
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions NS_DESIGNATED_INITIALIZER;
+ (instancetype)serviceWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions;
// The following methods belong to a set of old APIs that have been deprecated.
- (instancetype)initWithHost:(NSString *)host;
+ (instancetype)serviceWithHost:(NSString *)host;
@end
#endif

NS_ASSUME_NONNULL_END

