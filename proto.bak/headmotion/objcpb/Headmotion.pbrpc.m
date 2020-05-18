#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import "Headmotion.pbrpc.h"
#import "Headmotion.pbobjc.h"
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriter+Immediate.h>

#import "google/api/Annotations.pbobjc.h"

@implementation MotionService

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-designated-initializers"

// Designated initializer
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [super initWithHost:host
                 packageName:@"motionService"
                 serviceName:@"MotionService"
                 callOptions:callOptions];
}

- (instancetype)initWithHost:(NSString *)host {
  return [super initWithHost:host
                 packageName:@"motionService"
                 serviceName:@"MotionService"];
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

#pragma mark MoveTo(MoveToRequest) returns (MoveToResponse)

// Deprecated methods.
/**
 * 移动功能
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)moveToWithRequest:(MoveToRequest *)request handler:(void(^)(MoveToResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToMoveToWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 移动功能
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToMoveToWithRequest:(MoveToRequest *)request handler:(void(^)(MoveToResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"MoveTo"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[MoveToResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 移动功能
 */
- (GRPCUnaryProtoCall *)moveToWithMessage:(MoveToRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"MoveTo"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[MoveToResponse class]];
}

#pragma mark PositioningData(PositioningDataRequest) returns (stream PositioningDataResponse)

// Deprecated methods.
/**
 * 持续监听位置消息
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)positioningDataWithRequest:(PositioningDataRequest *)request eventHandler:(void(^)(BOOL done, PositioningDataResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCToPositioningDataWithRequest:request eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 持续监听位置消息
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToPositioningDataWithRequest:(PositioningDataRequest *)request eventHandler:(void(^)(BOOL done, PositioningDataResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"PositioningData"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[PositioningDataResponse class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
/**
 * 持续监听位置消息
 */
- (GRPCUnaryProtoCall *)positioningDataWithMessage:(PositioningDataRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"PositioningData"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[PositioningDataResponse class]];
}

#pragma mark GetPosition(GetPositionRequest) returns (GetPositionResponse)

// Deprecated methods.
/**
 * 获取当前位置信息
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getPositionWithRequest:(GetPositionRequest *)request handler:(void(^)(GetPositionResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToGetPositionWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取当前位置信息
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetPositionWithRequest:(GetPositionRequest *)request handler:(void(^)(GetPositionResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"GetPosition"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetPositionResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 获取当前位置信息
 */
- (GRPCUnaryProtoCall *)getPositionWithMessage:(GetPositionRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"GetPosition"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[GetPositionResponse class]];
}

#pragma mark NewGroup(NewGroupRequest) returns (NewGroupResponse)

// Deprecated methods.
/**
 * 创建组
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)newGroupWithRequest:(NewGroupRequest *)request handler:(void(^)(NewGroupResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToNewGroupWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 创建组
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToNewGroupWithRequest:(NewGroupRequest *)request handler:(void(^)(NewGroupResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"NewGroup"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[NewGroupResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 创建组
 */
- (GRPCUnaryProtoCall *)newGroupWithMessage:(NewGroupRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"NewGroup"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[NewGroupResponse class]];
}

#pragma mark ListGroups(ListGroupsRequest) returns (ListGroupsResponse)

// Deprecated methods.
/**
 * 获取组列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listGroupsWithRequest:(ListGroupsRequest *)request handler:(void(^)(ListGroupsResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToListGroupsWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取组列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListGroupsWithRequest:(ListGroupsRequest *)request handler:(void(^)(ListGroupsResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"ListGroups"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[ListGroupsResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 获取组列表
 */
- (GRPCUnaryProtoCall *)listGroupsWithMessage:(ListGroupsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"ListGroups"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[ListGroupsResponse class]];
}

#pragma mark UpdateGroup(UpdateGroupRequest) returns (UpdateGroupResponse)

// Deprecated methods.
/**
 * 更新组信息
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)updateGroupWithRequest:(UpdateGroupRequest *)request handler:(void(^)(UpdateGroupResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToUpdateGroupWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 更新组信息
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToUpdateGroupWithRequest:(UpdateGroupRequest *)request handler:(void(^)(UpdateGroupResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"UpdateGroup"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[UpdateGroupResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 更新组信息
 */
- (GRPCUnaryProtoCall *)updateGroupWithMessage:(UpdateGroupRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"UpdateGroup"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[UpdateGroupResponse class]];
}

#pragma mark DeleteGroups(DeleteGroupsRequest) returns (DeleteGroupsResponse)

// Deprecated methods.
/**
 * 删除组列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)deleteGroupsWithRequest:(DeleteGroupsRequest *)request handler:(void(^)(DeleteGroupsResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToDeleteGroupsWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 删除组列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToDeleteGroupsWithRequest:(DeleteGroupsRequest *)request handler:(void(^)(DeleteGroupsResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"DeleteGroups"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[DeleteGroupsResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 删除组列表
 */
- (GRPCUnaryProtoCall *)deleteGroupsWithMessage:(DeleteGroupsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"DeleteGroups"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[DeleteGroupsResponse class]];
}

#pragma mark ListGroupTargets(ListGroupTargetsRequest) returns (ListGroupTargetsResponse)

// Deprecated methods.
/**
 * 获取组动作点列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listGroupTargetsWithRequest:(ListGroupTargetsRequest *)request handler:(void(^)(ListGroupTargetsResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToListGroupTargetsWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取组动作点列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListGroupTargetsWithRequest:(ListGroupTargetsRequest *)request handler:(void(^)(ListGroupTargetsResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"ListGroupTargets"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[ListGroupTargetsResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 获取组动作点列表
 */
- (GRPCUnaryProtoCall *)listGroupTargetsWithMessage:(ListGroupTargetsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"ListGroupTargets"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[ListGroupTargetsResponse class]];
}

#pragma mark UpdateGroupTargets(UpdateGroupTargetsRequest) returns (UpdateGroupTargetsResponse)

// Deprecated methods.
/**
 * 更新组动作点列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)updateGroupTargetsWithRequest:(UpdateGroupTargetsRequest *)request handler:(void(^)(UpdateGroupTargetsResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToUpdateGroupTargetsWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 更新组动作点列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToUpdateGroupTargetsWithRequest:(UpdateGroupTargetsRequest *)request handler:(void(^)(UpdateGroupTargetsResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"UpdateGroupTargets"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[UpdateGroupTargetsResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 更新组动作点列表
 */
- (GRPCUnaryProtoCall *)updateGroupTargetsWithMessage:(UpdateGroupTargetsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"UpdateGroupTargets"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[UpdateGroupTargetsResponse class]];
}

@end
#endif
