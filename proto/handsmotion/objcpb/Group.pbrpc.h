#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
#import "Group.pbobjc.h"
#endif

#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import <ProtoRPC/ProtoService.h>
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriteable.h>
#import <RxLibrary/GRXWriter.h>
#endif

@class DeleteMotionGroupRequest;
@class DeleteMotionGroupResponse;
@class GetMotionGroupRequest;
@class GetMotionGroupResponse;
@class ListMotionGroupsRequest;
@class ListMotionGroupsResponse;
@class NewMotionGroupRequest;
@class NewMotionGroupResponse;
@class UpdateMotionMetaRequest;
@class UpdateMotionMetaResponse;
@class UpdateMotionScriptsRequest;
@class UpdateMotionScriptsResponse;

#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
  #import "Capability.pbobjc.h"
  #import "google/api/Annotations.pbobjc.h"
#endif

@class GRPCProtoCall;
@class GRPCUnaryProtoCall;
@class GRPCStreamingProtoCall;
@class GRPCCallOptions;
@protocol GRPCProtoResponseHandler;


NS_ASSUME_NONNULL_BEGIN

@protocol GroupManagement2 <NSObject>

#pragma mark NewMotionGroup(NewMotionGroupRequest) returns (NewMotionGroupResponse)

/**
 * 新建动作分组
 */
- (GRPCUnaryProtoCall *)newMotionGroupWithMessage:(NewMotionGroupRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark ListMotionGroups(ListMotionGroupsRequest) returns (ListMotionGroupsResponse)

/**
 * 获取所有动作分组列表
 */
- (GRPCUnaryProtoCall *)listMotionGroupsWithMessage:(ListMotionGroupsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark DeleteMotionGroup(DeleteMotionGroupRequest) returns (DeleteMotionGroupResponse)

/**
 * 删除动作分组
 */
- (GRPCUnaryProtoCall *)deleteMotionGroupWithMessage:(DeleteMotionGroupRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark GetMotionGroup(GetMotionGroupRequest) returns (GetMotionGroupResponse)

/**
 * 获取动作分组
 */
- (GRPCUnaryProtoCall *)getMotionGroupWithMessage:(GetMotionGroupRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark UpdateMotionGroupMeta(UpdateMotionMetaRequest) returns (UpdateMotionMetaResponse)

/**
 * 更新动作分组Meta
 */
- (GRPCUnaryProtoCall *)updateMotionGroupMetaWithMessage:(UpdateMotionMetaRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark UpdateMotionGroupScripts(UpdateMotionScriptsRequest) returns (UpdateMotionScriptsResponse)

/**
 * 更新动作分组Scripts
 */
- (GRPCUnaryProtoCall *)updateMotionGroupScriptsWithMessage:(UpdateMotionScriptsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

@end

/**
 * The methods in this protocol belong to a set of old APIs that have been deprecated. They do not
 * recognize call options provided in the initializer. Using the v2 protocol is recommended.
 */
@protocol GroupManagement <NSObject>

#pragma mark NewMotionGroup(NewMotionGroupRequest) returns (NewMotionGroupResponse)

/**
 * 新建动作分组
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)newMotionGroupWithRequest:(NewMotionGroupRequest *)request handler:(void(^)(NewMotionGroupResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 新建动作分组
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToNewMotionGroupWithRequest:(NewMotionGroupRequest *)request handler:(void(^)(NewMotionGroupResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark ListMotionGroups(ListMotionGroupsRequest) returns (ListMotionGroupsResponse)

/**
 * 获取所有动作分组列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listMotionGroupsWithRequest:(ListMotionGroupsRequest *)request handler:(void(^)(ListMotionGroupsResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 获取所有动作分组列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListMotionGroupsWithRequest:(ListMotionGroupsRequest *)request handler:(void(^)(ListMotionGroupsResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark DeleteMotionGroup(DeleteMotionGroupRequest) returns (DeleteMotionGroupResponse)

/**
 * 删除动作分组
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)deleteMotionGroupWithRequest:(DeleteMotionGroupRequest *)request handler:(void(^)(DeleteMotionGroupResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 删除动作分组
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToDeleteMotionGroupWithRequest:(DeleteMotionGroupRequest *)request handler:(void(^)(DeleteMotionGroupResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark GetMotionGroup(GetMotionGroupRequest) returns (GetMotionGroupResponse)

/**
 * 获取动作分组
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getMotionGroupWithRequest:(GetMotionGroupRequest *)request handler:(void(^)(GetMotionGroupResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 获取动作分组
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetMotionGroupWithRequest:(GetMotionGroupRequest *)request handler:(void(^)(GetMotionGroupResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark UpdateMotionGroupMeta(UpdateMotionMetaRequest) returns (UpdateMotionMetaResponse)

/**
 * 更新动作分组Meta
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)updateMotionGroupMetaWithRequest:(UpdateMotionMetaRequest *)request handler:(void(^)(UpdateMotionMetaResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 更新动作分组Meta
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToUpdateMotionGroupMetaWithRequest:(UpdateMotionMetaRequest *)request handler:(void(^)(UpdateMotionMetaResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark UpdateMotionGroupScripts(UpdateMotionScriptsRequest) returns (UpdateMotionScriptsResponse)

/**
 * 更新动作分组Scripts
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)updateMotionGroupScriptsWithRequest:(UpdateMotionScriptsRequest *)request handler:(void(^)(UpdateMotionScriptsResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 更新动作分组Scripts
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToUpdateMotionGroupScriptsWithRequest:(UpdateMotionScriptsRequest *)request handler:(void(^)(UpdateMotionScriptsResponse *_Nullable response, NSError *_Nullable error))handler;


@end


#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
/**
 * Basic service implementation, over gRPC, that only does
 * marshalling and parsing.
 */
@interface GroupManagement : GRPCProtoService<GroupManagement, GroupManagement2>
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions NS_DESIGNATED_INITIALIZER;
+ (instancetype)serviceWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions;
// The following methods belong to a set of old APIs that have been deprecated.
- (instancetype)initWithHost:(NSString *)host;
+ (instancetype)serviceWithHost:(NSString *)host;
@end
#endif

NS_ASSUME_NONNULL_END

