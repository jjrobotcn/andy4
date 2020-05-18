#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import "Lights.pbrpc.h"
#import "Lights.pbobjc.h"
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriter+Immediate.h>

#import "google/api/Annotations.pbobjc.h"

@implementation LightsService

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-designated-initializers"

// Designated initializer
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [super initWithHost:host
                 packageName:@"lightsService"
                 serviceName:@"LightsService"
                 callOptions:callOptions];
}

- (instancetype)initWithHost:(NSString *)host {
  return [super initWithHost:host
                 packageName:@"lightsService"
                 serviceName:@"LightsService"];
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

#pragma mark PreviewLight(PreviewLightRequest) returns (PreviewLightResponse)

// Deprecated methods.
/**
 * 预览灯光
 * 创建灯光后使用此方法生成灯光文件
 * 在未生成灯光文件前调用PlayLight将无效
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)previewLightWithRequest:(PreviewLightRequest *)request handler:(void(^)(PreviewLightResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPreviewLightWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 预览灯光
 * 创建灯光后使用此方法生成灯光文件
 * 在未生成灯光文件前调用PlayLight将无效
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToPreviewLightWithRequest:(PreviewLightRequest *)request handler:(void(^)(PreviewLightResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"PreviewLight"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[PreviewLightResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 预览灯光
 * 创建灯光后使用此方法生成灯光文件
 * 在未生成灯光文件前调用PlayLight将无效
 */
- (GRPCUnaryProtoCall *)previewLightWithMessage:(PreviewLightRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"PreviewLight"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[PreviewLightResponse class]];
}

#pragma mark PlayLight(PlayLightRequest) returns (PlayLightResponse)

// Deprecated methods.
/**
 * 播放灯光
 * 需在播放前执行PreviewLight生成灯光文件
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)playLightWithRequest:(PlayLightRequest *)request handler:(void(^)(PlayLightResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPlayLightWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 播放灯光
 * 需在播放前执行PreviewLight生成灯光文件
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToPlayLightWithRequest:(PlayLightRequest *)request handler:(void(^)(PlayLightResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"PlayLight"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[PlayLightResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 播放灯光
 * 需在播放前执行PreviewLight生成灯光文件
 */
- (GRPCUnaryProtoCall *)playLightWithMessage:(PlayLightRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"PlayLight"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[PlayLightResponse class]];
}

#pragma mark StopLight(StopLightRequest) returns (StopLightResponse)

// Deprecated methods.
/**
 * 停止灯光
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)stopLightWithRequest:(StopLightRequest *)request handler:(void(^)(StopLightResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToStopLightWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 停止灯光
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToStopLightWithRequest:(StopLightRequest *)request handler:(void(^)(StopLightResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"StopLight"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[StopLightResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 停止灯光
 */
- (GRPCUnaryProtoCall *)stopLightWithMessage:(StopLightRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"StopLight"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[StopLightResponse class]];
}

#pragma mark ListLights(ListLightsRequest) returns (ListLightsResponse)

// Deprecated methods.
/**
 * 获取灯光数据
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listLightsWithRequest:(ListLightsRequest *)request handler:(void(^)(ListLightsResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToListLightsWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取灯光数据
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListLightsWithRequest:(ListLightsRequest *)request handler:(void(^)(ListLightsResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"ListLights"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[ListLightsResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 获取灯光数据
 */
- (GRPCUnaryProtoCall *)listLightsWithMessage:(ListLightsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"ListLights"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[ListLightsResponse class]];
}

#pragma mark NewLight(NewLightRequest) returns (NewLightResponse)

// Deprecated methods.
/**
 * 创建灯光
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)newLightWithRequest:(NewLightRequest *)request handler:(void(^)(NewLightResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToNewLightWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 创建灯光
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToNewLightWithRequest:(NewLightRequest *)request handler:(void(^)(NewLightResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"NewLight"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[NewLightResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 创建灯光
 */
- (GRPCUnaryProtoCall *)newLightWithMessage:(NewLightRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"NewLight"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[NewLightResponse class]];
}

#pragma mark UpdateLight(UpdateLightRequest) returns (UpdateLightResponse)

// Deprecated methods.
/**
 * 更新灯光数据
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)updateLightWithRequest:(UpdateLightRequest *)request handler:(void(^)(UpdateLightResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToUpdateLightWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 更新灯光数据
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToUpdateLightWithRequest:(UpdateLightRequest *)request handler:(void(^)(UpdateLightResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"UpdateLight"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[UpdateLightResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 更新灯光数据
 */
- (GRPCUnaryProtoCall *)updateLightWithMessage:(UpdateLightRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"UpdateLight"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[UpdateLightResponse class]];
}

#pragma mark DeleteLights(DeleteLightsRequest) returns (DeleteLightsResponse)

// Deprecated methods.
/**
 * 删除灯光
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)deleteLightsWithRequest:(DeleteLightsRequest *)request handler:(void(^)(DeleteLightsResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToDeleteLightsWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 删除灯光
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToDeleteLightsWithRequest:(DeleteLightsRequest *)request handler:(void(^)(DeleteLightsResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"DeleteLights"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[DeleteLightsResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 删除灯光
 */
- (GRPCUnaryProtoCall *)deleteLightsWithMessage:(DeleteLightsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"DeleteLights"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[DeleteLightsResponse class]];
}

#pragma mark State(StateRequest) returns (StateResponse)

// Deprecated methods.
/**
 * 获取当前灯光模块状态
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)stateWithRequest:(StateRequest *)request handler:(void(^)(StateResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToStateWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取当前灯光模块状态
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToStateWithRequest:(StateRequest *)request handler:(void(^)(StateResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"State"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[StateResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 获取当前灯光模块状态
 */
- (GRPCUnaryProtoCall *)stateWithMessage:(StateRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"State"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[StateResponse class]];
}

#pragma mark Switch(SwitchRequest) returns (SwitchResponse)

// Deprecated methods.
/**
 * 控制灯光的开关
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)switchWithRequest:(SwitchRequest *)request handler:(void(^)(SwitchResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToSwitchWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 控制灯光的开关
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToSwitchWithRequest:(SwitchRequest *)request handler:(void(^)(SwitchResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"Switch"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[SwitchResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 控制灯光的开关
 */
- (GRPCUnaryProtoCall *)switchWithMessage:(SwitchRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"Switch"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[SwitchResponse class]];
}

@end
#endif
