#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
#import "Map.pbobjc.h"
#endif

#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import <ProtoRPC/ProtoService.h>
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriteable.h>
#import <RxLibrary/GRXWriter.h>
#endif

@class GetMapInfoRequest;
@class GetMapInfoResponse;
@class LocationResetRequest;
@class LocationResetResponse;
@class MapPositionStreamRequest;
@class MapPositionStreamResponse;

#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
  #import "google/api/Annotations.pbobjc.h"
#endif

@class GRPCProtoCall;
@class GRPCUnaryProtoCall;
@class GRPCStreamingProtoCall;
@class GRPCCallOptions;
@protocol GRPCProtoResponseHandler;


NS_ASSUME_NONNULL_BEGIN

@protocol Map2 <NSObject>

#pragma mark GetMapInfo(GetMapInfoRequest) returns (GetMapInfoResponse)

- (GRPCUnaryProtoCall *)getMapInfoWithMessage:(GetMapInfoRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark MapPositionStream(MapPositionStreamRequest) returns (stream MapPositionStreamResponse)

- (GRPCUnaryProtoCall *)mapPositionStreamWithMessage:(MapPositionStreamRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark LocationReset(LocationResetRequest) returns (LocationResetResponse)

/**
 * 重置当前定位
 * 用于发生定位异常/错误状态，重新初始化导航定位
 * 重定位错误：定位状态超时|无地图|UWB错误
 * 重定位超时判断: 默认10s，仅在非错误状态下重置
 */
- (GRPCUnaryProtoCall *)locationResetWithMessage:(LocationResetRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

@end

/**
 * The methods in this protocol belong to a set of old APIs that have been deprecated. They do not
 * recognize call options provided in the initializer. Using the v2 protocol is recommended.
 */
@protocol Map <NSObject>

#pragma mark GetMapInfo(GetMapInfoRequest) returns (GetMapInfoResponse)

- (void)getMapInfoWithRequest:(GetMapInfoRequest *)request handler:(void(^)(GetMapInfoResponse *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToGetMapInfoWithRequest:(GetMapInfoRequest *)request handler:(void(^)(GetMapInfoResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark MapPositionStream(MapPositionStreamRequest) returns (stream MapPositionStreamResponse)

- (void)mapPositionStreamWithRequest:(MapPositionStreamRequest *)request eventHandler:(void(^)(BOOL done, MapPositionStreamResponse *_Nullable response, NSError *_Nullable error))eventHandler;

- (GRPCProtoCall *)RPCToMapPositionStreamWithRequest:(MapPositionStreamRequest *)request eventHandler:(void(^)(BOOL done, MapPositionStreamResponse *_Nullable response, NSError *_Nullable error))eventHandler;


#pragma mark LocationReset(LocationResetRequest) returns (LocationResetResponse)

/**
 * 重置当前定位
 * 用于发生定位异常/错误状态，重新初始化导航定位
 * 重定位错误：定位状态超时|无地图|UWB错误
 * 重定位超时判断: 默认10s，仅在非错误状态下重置
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)locationResetWithRequest:(LocationResetRequest *)request handler:(void(^)(LocationResetResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 重置当前定位
 * 用于发生定位异常/错误状态，重新初始化导航定位
 * 重定位错误：定位状态超时|无地图|UWB错误
 * 重定位超时判断: 默认10s，仅在非错误状态下重置
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToLocationResetWithRequest:(LocationResetRequest *)request handler:(void(^)(LocationResetResponse *_Nullable response, NSError *_Nullable error))handler;


@end


#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
/**
 * Basic service implementation, over gRPC, that only does
 * marshalling and parsing.
 */
@interface Map : GRPCProtoService<Map, Map2>
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions NS_DESIGNATED_INITIALIZER;
+ (instancetype)serviceWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions;
// The following methods belong to a set of old APIs that have been deprecated.
- (instancetype)initWithHost:(NSString *)host;
+ (instancetype)serviceWithHost:(NSString *)host;
@end
#endif

NS_ASSUME_NONNULL_END

