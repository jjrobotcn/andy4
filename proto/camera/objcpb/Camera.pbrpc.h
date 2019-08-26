#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
#import "Camera.pbobjc.h"
#endif

#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import <ProtoRPC/ProtoService.h>
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriteable.h>
#import <RxLibrary/GRXWriter.h>
#endif

@class LatestImageRequest;
@class LatestImageResponse;
@class LiveH264StreamRequest;
@class LiveH264StreamResponse;

#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
  #import "google/api/Annotations.pbobjc.h"
#endif

@class GRPCProtoCall;
@class GRPCUnaryProtoCall;
@class GRPCStreamingProtoCall;
@class GRPCCallOptions;
@protocol GRPCProtoResponseHandler;


NS_ASSUME_NONNULL_BEGIN

@protocol CameraService2 <NSObject>

#pragma mark LiveH264Stream(LiveH264StreamRequest) returns (stream LiveH264StreamResponse)

/**
 * 直播流数据, 数据为h264 nal单元
 */
- (GRPCUnaryProtoCall *)liveH264StreamWithMessage:(LiveH264StreamRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark LatestImage(LatestImageRequest) returns (LatestImageResponse)

/**
 * 获取当前最新图片jpg
 * 图片更新时间周期为1s
 */
- (GRPCUnaryProtoCall *)latestImageWithMessage:(LatestImageRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

@end

/**
 * The methods in this protocol belong to a set of old APIs that have been deprecated. They do not
 * recognize call options provided in the initializer. Using the v2 protocol is recommended.
 */
@protocol CameraService <NSObject>

#pragma mark LiveH264Stream(LiveH264StreamRequest) returns (stream LiveH264StreamResponse)

/**
 * 直播流数据, 数据为h264 nal单元
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)liveH264StreamWithRequest:(LiveH264StreamRequest *)request eventHandler:(void(^)(BOOL done, LiveH264StreamResponse *_Nullable response, NSError *_Nullable error))eventHandler;

/**
 * 直播流数据, 数据为h264 nal单元
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToLiveH264StreamWithRequest:(LiveH264StreamRequest *)request eventHandler:(void(^)(BOOL done, LiveH264StreamResponse *_Nullable response, NSError *_Nullable error))eventHandler;


#pragma mark LatestImage(LatestImageRequest) returns (LatestImageResponse)

/**
 * 获取当前最新图片jpg
 * 图片更新时间周期为1s
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)latestImageWithRequest:(LatestImageRequest *)request handler:(void(^)(LatestImageResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 获取当前最新图片jpg
 * 图片更新时间周期为1s
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToLatestImageWithRequest:(LatestImageRequest *)request handler:(void(^)(LatestImageResponse *_Nullable response, NSError *_Nullable error))handler;


@end


#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
/**
 * Basic service implementation, over gRPC, that only does
 * marshalling and parsing.
 */
@interface CameraService : GRPCProtoService<CameraService, CameraService2>
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions NS_DESIGNATED_INITIALIZER;
+ (instancetype)serviceWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions;
// The following methods belong to a set of old APIs that have been deprecated.
- (instancetype)initWithHost:(NSString *)host;
+ (instancetype)serviceWithHost:(NSString *)host;
@end
#endif

NS_ASSUME_NONNULL_END

