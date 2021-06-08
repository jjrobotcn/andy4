#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import "Group.pbrpc.h"
#import "Group.pbobjc.h"
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriter+Immediate.h>

#import "Capability.pbobjc.h"
#import "google/api/Annotations.pbobjc.h"

@implementation GroupManagement

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-designated-initializers"

// Designated initializer
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [super initWithHost:host
                 packageName:@"handsmotion"
                 serviceName:@"GroupManagement"
                 callOptions:callOptions];
}

- (instancetype)initWithHost:(NSString *)host {
  return [super initWithHost:host
                 packageName:@"handsmotion"
                 serviceName:@"GroupManagement"];
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

#pragma mark NewMotionGroup(NewMotionGroupRequest) returns (NewMotionGroupResponse)

// Deprecated methods.
/**
 * 新建动作分组
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)newMotionGroupWithRequest:(NewMotionGroupRequest *)request handler:(void(^)(NewMotionGroupResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToNewMotionGroupWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 新建动作分组
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToNewMotionGroupWithRequest:(NewMotionGroupRequest *)request handler:(void(^)(NewMotionGroupResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"NewMotionGroup"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[NewMotionGroupResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 新建动作分组
 */
- (GRPCUnaryProtoCall *)newMotionGroupWithMessage:(NewMotionGroupRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"NewMotionGroup"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[NewMotionGroupResponse class]];
}

#pragma mark ListMotionGroups(ListMotionGroupsRequest) returns (ListMotionGroupsResponse)

// Deprecated methods.
/**
 * 获取所有动作分组列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listMotionGroupsWithRequest:(ListMotionGroupsRequest *)request handler:(void(^)(ListMotionGroupsResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToListMotionGroupsWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取所有动作分组列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListMotionGroupsWithRequest:(ListMotionGroupsRequest *)request handler:(void(^)(ListMotionGroupsResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"ListMotionGroups"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[ListMotionGroupsResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 获取所有动作分组列表
 */
- (GRPCUnaryProtoCall *)listMotionGroupsWithMessage:(ListMotionGroupsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"ListMotionGroups"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[ListMotionGroupsResponse class]];
}

#pragma mark DeleteMotionGroup(DeleteMotionGroupRequest) returns (DeleteMotionGroupResponse)

// Deprecated methods.
/**
 * 删除动作分组
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)deleteMotionGroupWithRequest:(DeleteMotionGroupRequest *)request handler:(void(^)(DeleteMotionGroupResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToDeleteMotionGroupWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 删除动作分组
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToDeleteMotionGroupWithRequest:(DeleteMotionGroupRequest *)request handler:(void(^)(DeleteMotionGroupResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"DeleteMotionGroup"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[DeleteMotionGroupResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 删除动作分组
 */
- (GRPCUnaryProtoCall *)deleteMotionGroupWithMessage:(DeleteMotionGroupRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"DeleteMotionGroup"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[DeleteMotionGroupResponse class]];
}

#pragma mark GetMotionGroup(GetMotionGroupRequest) returns (GetMotionGroupResponse)

// Deprecated methods.
/**
 * 获取动作分组
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getMotionGroupWithRequest:(GetMotionGroupRequest *)request handler:(void(^)(GetMotionGroupResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToGetMotionGroupWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取动作分组
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetMotionGroupWithRequest:(GetMotionGroupRequest *)request handler:(void(^)(GetMotionGroupResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"GetMotionGroup"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetMotionGroupResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 获取动作分组
 */
- (GRPCUnaryProtoCall *)getMotionGroupWithMessage:(GetMotionGroupRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"GetMotionGroup"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[GetMotionGroupResponse class]];
}

#pragma mark UpdateMotionGroupMeta(UpdateMotionMetaRequest) returns (UpdateMotionMetaResponse)

// Deprecated methods.
/**
 * 更新动作分组Meta
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)updateMotionGroupMetaWithRequest:(UpdateMotionMetaRequest *)request handler:(void(^)(UpdateMotionMetaResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToUpdateMotionGroupMetaWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 更新动作分组Meta
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToUpdateMotionGroupMetaWithRequest:(UpdateMotionMetaRequest *)request handler:(void(^)(UpdateMotionMetaResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"UpdateMotionGroupMeta"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[UpdateMotionMetaResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 更新动作分组Meta
 */
- (GRPCUnaryProtoCall *)updateMotionGroupMetaWithMessage:(UpdateMotionMetaRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"UpdateMotionGroupMeta"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[UpdateMotionMetaResponse class]];
}

#pragma mark UpdateMotionGroupScripts(UpdateMotionScriptsRequest) returns (UpdateMotionScriptsResponse)

// Deprecated methods.
/**
 * 更新动作分组Scripts
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)updateMotionGroupScriptsWithRequest:(UpdateMotionScriptsRequest *)request handler:(void(^)(UpdateMotionScriptsResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToUpdateMotionGroupScriptsWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 更新动作分组Scripts
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToUpdateMotionGroupScriptsWithRequest:(UpdateMotionScriptsRequest *)request handler:(void(^)(UpdateMotionScriptsResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"UpdateMotionGroupScripts"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[UpdateMotionScriptsResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 更新动作分组Scripts
 */
- (GRPCUnaryProtoCall *)updateMotionGroupScriptsWithMessage:(UpdateMotionScriptsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"UpdateMotionGroupScripts"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[UpdateMotionScriptsResponse class]];
}

@end
#endif
