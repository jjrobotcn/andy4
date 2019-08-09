#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
#import "Headmotion.pbobjc.h"
#endif

#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import <ProtoRPC/ProtoService.h>
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriteable.h>
#import <RxLibrary/GRXWriter.h>
#endif

@class DeleteGroupsRequest;
@class DeleteGroupsResponse;
@class GetPositionRequest;
@class GetPositionResponse;
@class ListGroupTargetsRequest;
@class ListGroupTargetsResponse;
@class ListGroupsRequest;
@class ListGroupsResponse;
@class MoveToRequest;
@class MoveToResponse;
@class NewGroupRequest;
@class NewGroupResponse;
@class PositioningDataRequest;
@class PositioningDataResponse;
@class UpdateGroupRequest;
@class UpdateGroupResponse;
@class UpdateGroupTargetsRequest;
@class UpdateGroupTargetsResponse;

#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
  #import "google/api/Annotations.pbobjc.h"
#endif

@class GRPCProtoCall;
@class GRPCUnaryProtoCall;
@class GRPCStreamingProtoCall;
@class GRPCCallOptions;
@protocol GRPCProtoResponseHandler;


NS_ASSUME_NONNULL_BEGIN

@protocol MotionService2 <NSObject>

#pragma mark MoveTo(MoveToRequest) returns (MoveToResponse)

/**
 * 移动功能
 */
- (GRPCUnaryProtoCall *)moveToWithMessage:(MoveToRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark PositioningData(PositioningDataRequest) returns (stream PositioningDataResponse)

/**
 * 持续监听位置消息
 */
- (GRPCUnaryProtoCall *)positioningDataWithMessage:(PositioningDataRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark GetPosition(GetPositionRequest) returns (GetPositionResponse)

/**
 * 获取当前位置信息
 */
- (GRPCUnaryProtoCall *)getPositionWithMessage:(GetPositionRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark NewGroup(NewGroupRequest) returns (NewGroupResponse)

/**
 * 创建组
 */
- (GRPCUnaryProtoCall *)newGroupWithMessage:(NewGroupRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark ListGroups(ListGroupsRequest) returns (ListGroupsResponse)

/**
 * 获取组列表
 */
- (GRPCUnaryProtoCall *)listGroupsWithMessage:(ListGroupsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark UpdateGroup(UpdateGroupRequest) returns (UpdateGroupResponse)

/**
 * 更新组信息
 */
- (GRPCUnaryProtoCall *)updateGroupWithMessage:(UpdateGroupRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark DeleteGroups(DeleteGroupsRequest) returns (DeleteGroupsResponse)

/**
 * 删除组列表
 */
- (GRPCUnaryProtoCall *)deleteGroupsWithMessage:(DeleteGroupsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark ListGroupTargets(ListGroupTargetsRequest) returns (ListGroupTargetsResponse)

/**
 * 获取组动作点列表
 */
- (GRPCUnaryProtoCall *)listGroupTargetsWithMessage:(ListGroupTargetsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark UpdateGroupTargets(UpdateGroupTargetsRequest) returns (UpdateGroupTargetsResponse)

/**
 * 更新组动作点列表
 */
- (GRPCUnaryProtoCall *)updateGroupTargetsWithMessage:(UpdateGroupTargetsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

@end

/**
 * The methods in this protocol belong to a set of old APIs that have been deprecated. They do not
 * recognize call options provided in the initializer. Using the v2 protocol is recommended.
 */
@protocol MotionService <NSObject>

#pragma mark MoveTo(MoveToRequest) returns (MoveToResponse)

/**
 * 移动功能
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)moveToWithRequest:(MoveToRequest *)request handler:(void(^)(MoveToResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 移动功能
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToMoveToWithRequest:(MoveToRequest *)request handler:(void(^)(MoveToResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark PositioningData(PositioningDataRequest) returns (stream PositioningDataResponse)

/**
 * 持续监听位置消息
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)positioningDataWithRequest:(PositioningDataRequest *)request eventHandler:(void(^)(BOOL done, PositioningDataResponse *_Nullable response, NSError *_Nullable error))eventHandler;

/**
 * 持续监听位置消息
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToPositioningDataWithRequest:(PositioningDataRequest *)request eventHandler:(void(^)(BOOL done, PositioningDataResponse *_Nullable response, NSError *_Nullable error))eventHandler;


#pragma mark GetPosition(GetPositionRequest) returns (GetPositionResponse)

/**
 * 获取当前位置信息
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getPositionWithRequest:(GetPositionRequest *)request handler:(void(^)(GetPositionResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 获取当前位置信息
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetPositionWithRequest:(GetPositionRequest *)request handler:(void(^)(GetPositionResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark NewGroup(NewGroupRequest) returns (NewGroupResponse)

/**
 * 创建组
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)newGroupWithRequest:(NewGroupRequest *)request handler:(void(^)(NewGroupResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 创建组
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToNewGroupWithRequest:(NewGroupRequest *)request handler:(void(^)(NewGroupResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark ListGroups(ListGroupsRequest) returns (ListGroupsResponse)

/**
 * 获取组列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listGroupsWithRequest:(ListGroupsRequest *)request handler:(void(^)(ListGroupsResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 获取组列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListGroupsWithRequest:(ListGroupsRequest *)request handler:(void(^)(ListGroupsResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark UpdateGroup(UpdateGroupRequest) returns (UpdateGroupResponse)

/**
 * 更新组信息
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)updateGroupWithRequest:(UpdateGroupRequest *)request handler:(void(^)(UpdateGroupResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 更新组信息
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToUpdateGroupWithRequest:(UpdateGroupRequest *)request handler:(void(^)(UpdateGroupResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark DeleteGroups(DeleteGroupsRequest) returns (DeleteGroupsResponse)

/**
 * 删除组列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)deleteGroupsWithRequest:(DeleteGroupsRequest *)request handler:(void(^)(DeleteGroupsResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 删除组列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToDeleteGroupsWithRequest:(DeleteGroupsRequest *)request handler:(void(^)(DeleteGroupsResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark ListGroupTargets(ListGroupTargetsRequest) returns (ListGroupTargetsResponse)

/**
 * 获取组动作点列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listGroupTargetsWithRequest:(ListGroupTargetsRequest *)request handler:(void(^)(ListGroupTargetsResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 获取组动作点列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListGroupTargetsWithRequest:(ListGroupTargetsRequest *)request handler:(void(^)(ListGroupTargetsResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark UpdateGroupTargets(UpdateGroupTargetsRequest) returns (UpdateGroupTargetsResponse)

/**
 * 更新组动作点列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)updateGroupTargetsWithRequest:(UpdateGroupTargetsRequest *)request handler:(void(^)(UpdateGroupTargetsResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 更新组动作点列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToUpdateGroupTargetsWithRequest:(UpdateGroupTargetsRequest *)request handler:(void(^)(UpdateGroupTargetsResponse *_Nullable response, NSError *_Nullable error))handler;


@end


#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
/**
 * Basic service implementation, over gRPC, that only does
 * marshalling and parsing.
 */
@interface MotionService : GRPCProtoService<MotionService, MotionService2>
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions NS_DESIGNATED_INITIALIZER;
+ (instancetype)serviceWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions;
// The following methods belong to a set of old APIs that have been deprecated.
- (instancetype)initWithHost:(NSString *)host;
+ (instancetype)serviceWithHost:(NSString *)host;
@end
#endif

NS_ASSUME_NONNULL_END

