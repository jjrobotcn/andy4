#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import "Nav.pbrpc.h"
#import "Nav.pbobjc.h"
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriter+Immediate.h>

#import "google/api/Annotations.pbobjc.h"

@implementation NavController

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-designated-initializers"

// Designated initializer
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [super initWithHost:host
                 packageName:@"navService"
                 serviceName:@"NavController"
                 callOptions:callOptions];
}

- (instancetype)initWithHost:(NSString *)host {
  return [super initWithHost:host
                 packageName:@"navService"
                 serviceName:@"NavController"];
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

#pragma mark Move(stream MoveRequest) returns (stream MoveResponse)

// Deprecated methods.
/**
 * 遥控移动
 * 当机器人处于非空闲及遥控移动状态时， 当前链接将被强制关闭, 错误描述为: "[naving|charging|rotating] reject"
 * 当机器人处于 *其它用户* 的遥控移动状态时， *你* 将收到MoveStatusResponse状态码REJ_MOVING
 * 当机器人处于 *你* 的遥控移动状态时, 请在500ms内持续发送遥控指令， 超时将自动停止移动
 * 当机器人处于 *你* 的遥控移动状态时, 若5秒后无遥控指令的更新, *你* 将接收到MoveStatusResponse状态码RELEASED，
 * 此时遥控移动控制权交由抢占的 *其它用户* 或其它类型目标的操作
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)moveWithRequestsWriter:(GRXWriter *)requestWriter eventHandler:(void(^)(BOOL done, MoveResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCToMoveWithRequestsWriter:requestWriter eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 遥控移动
 * 当机器人处于非空闲及遥控移动状态时， 当前链接将被强制关闭, 错误描述为: "[naving|charging|rotating] reject"
 * 当机器人处于 *其它用户* 的遥控移动状态时， *你* 将收到MoveStatusResponse状态码REJ_MOVING
 * 当机器人处于 *你* 的遥控移动状态时, 请在500ms内持续发送遥控指令， 超时将自动停止移动
 * 当机器人处于 *你* 的遥控移动状态时, 若5秒后无遥控指令的更新, *你* 将接收到MoveStatusResponse状态码RELEASED，
 * 此时遥控移动控制权交由抢占的 *其它用户* 或其它类型目标的操作
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToMoveWithRequestsWriter:(GRXWriter *)requestWriter eventHandler:(void(^)(BOOL done, MoveResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"Move"
            requestsWriter:requestWriter
             responseClass:[MoveResponse class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
/**
 * 遥控移动
 * 当机器人处于非空闲及遥控移动状态时， 当前链接将被强制关闭, 错误描述为: "[naving|charging|rotating] reject"
 * 当机器人处于 *其它用户* 的遥控移动状态时， *你* 将收到MoveStatusResponse状态码REJ_MOVING
 * 当机器人处于 *你* 的遥控移动状态时, 请在500ms内持续发送遥控指令， 超时将自动停止移动
 * 当机器人处于 *你* 的遥控移动状态时, 若5秒后无遥控指令的更新, *你* 将接收到MoveStatusResponse状态码RELEASED，
 * 此时遥控移动控制权交由抢占的 *其它用户* 或其它类型目标的操作
 */
- (GRPCStreamingProtoCall *)moveWithResponseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"Move"
           responseHandler:handler
               callOptions:callOptions
             responseClass:[MoveResponse class]];
}

#pragma mark NavTo(NavToRequest) returns (NavToResponse)

// Deprecated methods.
/**
 * 导航
 * 当机器人处理遥控移动中|充电中|旋转中时, 错误描述为: "[moving|charging|rotating] reject"
 * 当机器人处理空闲或导航状态时, 将收到导航的目标NavTarget与导航或失败状态
 * 使用目标导航时支持同步异步模式, 参考NavToRequest.sync_mode的参数描述
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)navToWithRequest:(NavToRequest *)request handler:(void(^)(NavToResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToNavToWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 导航
 * 当机器人处理遥控移动中|充电中|旋转中时, 错误描述为: "[moving|charging|rotating] reject"
 * 当机器人处理空闲或导航状态时, 将收到导航的目标NavTarget与导航或失败状态
 * 使用目标导航时支持同步异步模式, 参考NavToRequest.sync_mode的参数描述
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToNavToWithRequest:(NavToRequest *)request handler:(void(^)(NavToResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"NavTo"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[NavToResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 导航
 * 当机器人处理遥控移动中|充电中|旋转中时, 错误描述为: "[moving|charging|rotating] reject"
 * 当机器人处理空闲或导航状态时, 将收到导航的目标NavTarget与导航或失败状态
 * 使用目标导航时支持同步异步模式, 参考NavToRequest.sync_mode的参数描述
 */
- (GRPCUnaryProtoCall *)navToWithMessage:(NavToRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"NavTo"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[NavToResponse class]];
}

#pragma mark NavStop(NavStopRequest) returns (NavStopResponse)

// Deprecated methods.
/**
 * 停止
 * 静止: 立即返回STOPPED
 * 旋转中: 返回旋转状态, STOPPED或CANCEL, 超时3秒
 * 其它: 错误描述为: "[moving|charging] reject"
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)navStopWithRequest:(NavStopRequest *)request handler:(void(^)(NavStopResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToNavStopWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 停止
 * 静止: 立即返回STOPPED
 * 旋转中: 返回旋转状态, STOPPED或CANCEL, 超时3秒
 * 其它: 错误描述为: "[moving|charging] reject"
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToNavStopWithRequest:(NavStopRequest *)request handler:(void(^)(NavStopResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"NavStop"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[NavStopResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 停止
 * 静止: 立即返回STOPPED
 * 旋转中: 返回旋转状态, STOPPED或CANCEL, 超时3秒
 * 其它: 错误描述为: "[moving|charging] reject"
 */
- (GRPCUnaryProtoCall *)navStopWithMessage:(NavStopRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"NavStop"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[NavStopResponse class]];
}

#pragma mark AutoCharge(AutoChargeRequest) returns (AutoChargeResponse)

// Deprecated methods.
/**
 * 自动充电
 * 当前为充电中|充电连接中: 请求类型为charge|charge_preset等待状态为CHARGE_STATUS_CHARGING|CHARGE_STATUS_CONNECTING|CHARGE_STATUS_RELEASED后返回
 * 当前为充电中|充电连接中: 请求类型为cancel等待状态为CHARGE_STATUS_RELEASED后返回
 * 当前为已释放: 请求类型为cancel将直接返回CHARGE_STATUS_RELEASED
 * 当前为已释放: 请求类型为charge|charge_preset等待状态为CHARGE_STATUS_CHARGING后返回
 * 超时错误: 发送请求后默认60秒后未收到状态更新返回错误描述, 超时时间可在AutoChargeRequest中自定义配置
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)autoChargeWithRequest:(AutoChargeRequest *)request handler:(void(^)(AutoChargeResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToAutoChargeWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 自动充电
 * 当前为充电中|充电连接中: 请求类型为charge|charge_preset等待状态为CHARGE_STATUS_CHARGING|CHARGE_STATUS_CONNECTING|CHARGE_STATUS_RELEASED后返回
 * 当前为充电中|充电连接中: 请求类型为cancel等待状态为CHARGE_STATUS_RELEASED后返回
 * 当前为已释放: 请求类型为cancel将直接返回CHARGE_STATUS_RELEASED
 * 当前为已释放: 请求类型为charge|charge_preset等待状态为CHARGE_STATUS_CHARGING后返回
 * 超时错误: 发送请求后默认60秒后未收到状态更新返回错误描述, 超时时间可在AutoChargeRequest中自定义配置
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToAutoChargeWithRequest:(AutoChargeRequest *)request handler:(void(^)(AutoChargeResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"AutoCharge"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[AutoChargeResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 自动充电
 * 当前为充电中|充电连接中: 请求类型为charge|charge_preset等待状态为CHARGE_STATUS_CHARGING|CHARGE_STATUS_CONNECTING|CHARGE_STATUS_RELEASED后返回
 * 当前为充电中|充电连接中: 请求类型为cancel等待状态为CHARGE_STATUS_RELEASED后返回
 * 当前为已释放: 请求类型为cancel将直接返回CHARGE_STATUS_RELEASED
 * 当前为已释放: 请求类型为charge|charge_preset等待状态为CHARGE_STATUS_CHARGING后返回
 * 超时错误: 发送请求后默认60秒后未收到状态更新返回错误描述, 超时时间可在AutoChargeRequest中自定义配置
 */
- (GRPCUnaryProtoCall *)autoChargeWithMessage:(AutoChargeRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"AutoCharge"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[AutoChargeResponse class]];
}

#pragma mark Rotate(RotateRequest) returns (RotateResponse)

// Deprecated methods.
/**
 * 原地旋转
 * 当旋转完成后返回STOPPED
 * 当用户使用NavStop中止时将返回CANCEL
 * 若超时30秒未执行完毕将返回超时错误
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)rotateWithRequest:(RotateRequest *)request handler:(void(^)(RotateResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToRotateWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 原地旋转
 * 当旋转完成后返回STOPPED
 * 当用户使用NavStop中止时将返回CANCEL
 * 若超时30秒未执行完毕将返回超时错误
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToRotateWithRequest:(RotateRequest *)request handler:(void(^)(RotateResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"Rotate"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[RotateResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 原地旋转
 * 当旋转完成后返回STOPPED
 * 当用户使用NavStop中止时将返回CANCEL
 * 若超时30秒未执行完毕将返回超时错误
 */
- (GRPCUnaryProtoCall *)rotateWithMessage:(RotateRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"Rotate"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[RotateResponse class]];
}

#pragma mark OnNavEventChange(OnNavEventChangeRequest) returns (stream OnNavEventChangeResponse)

// Deprecated methods.
/**
 * 导航事件监听
 * 监听导航模块中各类事件的变动更新
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)onNavEventChangeWithRequest:(OnNavEventChangeRequest *)request eventHandler:(void(^)(BOOL done, OnNavEventChangeResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCToOnNavEventChangeWithRequest:request eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 导航事件监听
 * 监听导航模块中各类事件的变动更新
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToOnNavEventChangeWithRequest:(OnNavEventChangeRequest *)request eventHandler:(void(^)(BOOL done, OnNavEventChangeResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"OnNavEventChange"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[OnNavEventChangeResponse class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
/**
 * 导航事件监听
 * 监听导航模块中各类事件的变动更新
 */
- (GRPCUnaryProtoCall *)onNavEventChangeWithMessage:(OnNavEventChangeRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"OnNavEventChange"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[OnNavEventChangeResponse class]];
}

#pragma mark LocationReset(LocationResetRequest) returns (LocationResetResponse)

// Deprecated methods.
/**
 * >=2.2.0
 * 重置当前定位
 * 用于发生定位异常/错误状态，重新初始化导航定位
 * 重定位错误：定位状态超时|无地图|UWB错误
 * 重定位超时判断: 默认3s，仅在非错误状态下重置
 * *目前仅支持无线导航版本，磁导航版本中将直接返回成功状态
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)locationResetWithRequest:(LocationResetRequest *)request handler:(void(^)(LocationResetResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToLocationResetWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * >=2.2.0
 * 重置当前定位
 * 用于发生定位异常/错误状态，重新初始化导航定位
 * 重定位错误：定位状态超时|无地图|UWB错误
 * 重定位超时判断: 默认3s，仅在非错误状态下重置
 * *目前仅支持无线导航版本，磁导航版本中将直接返回成功状态
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToLocationResetWithRequest:(LocationResetRequest *)request handler:(void(^)(LocationResetResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"LocationReset"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[LocationResetResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * >=2.2.0
 * 重置当前定位
 * 用于发生定位异常/错误状态，重新初始化导航定位
 * 重定位错误：定位状态超时|无地图|UWB错误
 * 重定位超时判断: 默认3s，仅在非错误状态下重置
 * *目前仅支持无线导航版本，磁导航版本中将直接返回成功状态
 */
- (GRPCUnaryProtoCall *)locationResetWithMessage:(LocationResetRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"LocationReset"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[LocationResetResponse class]];
}

#pragma mark NewRoute(NewRouteRequest) returns (NewRouteResponse)

// Deprecated methods.
/**
 * 新建线路
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)newRouteWithRequest:(NewRouteRequest *)request handler:(void(^)(NewRouteResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToNewRouteWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 新建线路
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToNewRouteWithRequest:(NewRouteRequest *)request handler:(void(^)(NewRouteResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"NewRoute"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[NewRouteResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 新建线路
 */
- (GRPCUnaryProtoCall *)newRouteWithMessage:(NewRouteRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"NewRoute"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[NewRouteResponse class]];
}

#pragma mark ListRoutes(ListRoutesRequest) returns (ListRoutesResponse)

// Deprecated methods.
/**
 * 获取线路
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listRoutesWithRequest:(ListRoutesRequest *)request handler:(void(^)(ListRoutesResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToListRoutesWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取线路
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListRoutesWithRequest:(ListRoutesRequest *)request handler:(void(^)(ListRoutesResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"ListRoutes"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[ListRoutesResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 获取线路
 */
- (GRPCUnaryProtoCall *)listRoutesWithMessage:(ListRoutesRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"ListRoutes"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[ListRoutesResponse class]];
}

#pragma mark UpdateRoute(UpdateRouteRequest) returns (UpdateRouteResponse)

// Deprecated methods.
/**
 * 更新线路信息
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)updateRouteWithRequest:(UpdateRouteRequest *)request handler:(void(^)(UpdateRouteResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToUpdateRouteWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 更新线路信息
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToUpdateRouteWithRequest:(UpdateRouteRequest *)request handler:(void(^)(UpdateRouteResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"UpdateRoute"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[UpdateRouteResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 更新线路信息
 */
- (GRPCUnaryProtoCall *)updateRouteWithMessage:(UpdateRouteRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"UpdateRoute"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[UpdateRouteResponse class]];
}

#pragma mark DeleteRoutes(DeleteRoutesRequest) returns (DeleteRoutesResponse)

// Deprecated methods.
/**
 * 删除线路
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)deleteRoutesWithRequest:(DeleteRoutesRequest *)request handler:(void(^)(DeleteRoutesResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToDeleteRoutesWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 删除线路
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToDeleteRoutesWithRequest:(DeleteRoutesRequest *)request handler:(void(^)(DeleteRoutesResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"DeleteRoutes"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[DeleteRoutesResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 删除线路
 */
- (GRPCUnaryProtoCall *)deleteRoutesWithMessage:(DeleteRoutesRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"DeleteRoutes"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[DeleteRoutesResponse class]];
}

@end
#endif
