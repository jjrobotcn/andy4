#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
#import "Storage.pbobjc.h"
#endif

#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import <ProtoRPC/ProtoService.h>
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriteable.h>
#import <RxLibrary/GRXWriter.h>
#endif

@class DeleteVideoFilesRequest;
@class DeleteVideoFilesResponse;
@class GetVideoFileRequest;
@class GetVideoFileResponse;
@class ListDatesRequest;
@class ListDatesResponse;
@class ListVideosRequest;
@class ListVideosResponse;

#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
  #import "google/api/Annotations.pbobjc.h"
#endif

@class GRPCProtoCall;
@class GRPCUnaryProtoCall;
@class GRPCStreamingProtoCall;
@class GRPCCallOptions;
@protocol GRPCProtoResponseHandler;


NS_ASSUME_NONNULL_BEGIN

@protocol Storage2 <NSObject>

#pragma mark ListDates(ListDatesRequest) returns (ListDatesResponse)

/**
 * 获取监控视频日期列表
 */
- (GRPCUnaryProtoCall *)listDatesWithMessage:(ListDatesRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark ListVideos(ListVideosRequest) returns (ListVideosResponse)

/**
 * 获取监控视频列表
 */
- (GRPCUnaryProtoCall *)listVideosWithMessage:(ListVideosRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark GetVideoFile(GetVideoFileRequest) returns (stream GetVideoFileResponse)

/**
 * 获取监控视频文件
 */
- (GRPCUnaryProtoCall *)getVideoFileWithMessage:(GetVideoFileRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark DeleteVideoFiles(DeleteVideoFilesRequest) returns (DeleteVideoFilesResponse)

/**
 * 删除监控视频文件
 */
- (GRPCUnaryProtoCall *)deleteVideoFilesWithMessage:(DeleteVideoFilesRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

@end

/**
 * The methods in this protocol belong to a set of old APIs that have been deprecated. They do not
 * recognize call options provided in the initializer. Using the v2 protocol is recommended.
 */
@protocol Storage <NSObject>

#pragma mark ListDates(ListDatesRequest) returns (ListDatesResponse)

/**
 * 获取监控视频日期列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listDatesWithRequest:(ListDatesRequest *)request handler:(void(^)(ListDatesResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 获取监控视频日期列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListDatesWithRequest:(ListDatesRequest *)request handler:(void(^)(ListDatesResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark ListVideos(ListVideosRequest) returns (ListVideosResponse)

/**
 * 获取监控视频列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listVideosWithRequest:(ListVideosRequest *)request handler:(void(^)(ListVideosResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 获取监控视频列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListVideosWithRequest:(ListVideosRequest *)request handler:(void(^)(ListVideosResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark GetVideoFile(GetVideoFileRequest) returns (stream GetVideoFileResponse)

/**
 * 获取监控视频文件
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getVideoFileWithRequest:(GetVideoFileRequest *)request eventHandler:(void(^)(BOOL done, GetVideoFileResponse *_Nullable response, NSError *_Nullable error))eventHandler;

/**
 * 获取监控视频文件
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetVideoFileWithRequest:(GetVideoFileRequest *)request eventHandler:(void(^)(BOOL done, GetVideoFileResponse *_Nullable response, NSError *_Nullable error))eventHandler;


#pragma mark DeleteVideoFiles(DeleteVideoFilesRequest) returns (DeleteVideoFilesResponse)

/**
 * 删除监控视频文件
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)deleteVideoFilesWithRequest:(DeleteVideoFilesRequest *)request handler:(void(^)(DeleteVideoFilesResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 删除监控视频文件
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToDeleteVideoFilesWithRequest:(DeleteVideoFilesRequest *)request handler:(void(^)(DeleteVideoFilesResponse *_Nullable response, NSError *_Nullable error))handler;


@end


#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
/**
 * Basic service implementation, over gRPC, that only does
 * marshalling and parsing.
 */
@interface Storage : GRPCProtoService<Storage, Storage2>
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions NS_DESIGNATED_INITIALIZER;
+ (instancetype)serviceWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions;
// The following methods belong to a set of old APIs that have been deprecated.
- (instancetype)initWithHost:(NSString *)host;
+ (instancetype)serviceWithHost:(NSString *)host;
@end
#endif

NS_ASSUME_NONNULL_END

