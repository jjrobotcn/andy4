#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import "Network.pbrpc.h"
#import "Network.pbobjc.h"
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriter+Immediate.h>

#import "google/api/Annotations.pbobjc.h"

@implementation NetworkService

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-designated-initializers"

// Designated initializer
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [super initWithHost:host
                 packageName:@"networkService"
                 serviceName:@"NetworkService"
                 callOptions:callOptions];
}

- (instancetype)initWithHost:(NSString *)host {
  return [super initWithHost:host
                 packageName:@"networkService"
                 serviceName:@"NetworkService"];
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

#pragma mark ListNetworks(ListNetworksRequest) returns (stream ListNetworksResponse)

// Deprecated methods.
/**
 * 获取网络扫描结果流
 * 扫描结果每30秒自动更新, 首次获取将返回记录中最新记录
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listNetworksWithRequest:(ListNetworksRequest *)request eventHandler:(void(^)(BOOL done, ListNetworksResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCToListNetworksWithRequest:request eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取网络扫描结果流
 * 扫描结果每30秒自动更新, 首次获取将返回记录中最新记录
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListNetworksWithRequest:(ListNetworksRequest *)request eventHandler:(void(^)(BOOL done, ListNetworksResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"ListNetworks"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[ListNetworksResponse class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
/**
 * 获取网络扫描结果流
 * 扫描结果每30秒自动更新, 首次获取将返回记录中最新记录
 */
- (GRPCUnaryProtoCall *)listNetworksWithMessage:(ListNetworksRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"ListNetworks"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[ListNetworksResponse class]];
}

#pragma mark Connect(ConnectRequest) returns (ConnectResponse)

// Deprecated methods.
/**
 * 连接至指定网络
 * 连接失败将立即返回错误
 * 若30秒后成功获取状态将返回超时失败
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)connectWithRequest:(ConnectRequest *)request handler:(void(^)(ConnectResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToConnectWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 连接至指定网络
 * 连接失败将立即返回错误
 * 若30秒后成功获取状态将返回超时失败
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToConnectWithRequest:(ConnectRequest *)request handler:(void(^)(ConnectResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"Connect"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[ConnectResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 连接至指定网络
 * 连接失败将立即返回错误
 * 若30秒后成功获取状态将返回超时失败
 */
- (GRPCUnaryProtoCall *)connectWithMessage:(ConnectRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"Connect"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[ConnectResponse class]];
}

#pragma mark GetStatus(GetStatusRequest) returns (stream GetStatusResponse)

// Deprecated methods.
/**
 * 获取连接状态流
 * 在连接开始时立即返回当前最新的扫描数据
 * 并持续在网络数据更新时接收新数据
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getStatusWithRequest:(GetStatusRequest *)request eventHandler:(void(^)(BOOL done, GetStatusResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCToGetStatusWithRequest:request eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取连接状态流
 * 在连接开始时立即返回当前最新的扫描数据
 * 并持续在网络数据更新时接收新数据
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetStatusWithRequest:(GetStatusRequest *)request eventHandler:(void(^)(BOOL done, GetStatusResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"GetStatus"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetStatusResponse class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
/**
 * 获取连接状态流
 * 在连接开始时立即返回当前最新的扫描数据
 * 并持续在网络数据更新时接收新数据
 */
- (GRPCUnaryProtoCall *)getStatusWithMessage:(GetStatusRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"GetStatus"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[GetStatusResponse class]];
}

#pragma mark GetNetworkDeviceInfo(GetNetworkDeviceInfoRequest) returns (GetNetworkDeviceInfoResponse)

// Deprecated methods.
/**
 * 获取网络设备相关信息
 * v1.1.0
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getNetworkDeviceInfoWithRequest:(GetNetworkDeviceInfoRequest *)request handler:(void(^)(GetNetworkDeviceInfoResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToGetNetworkDeviceInfoWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取网络设备相关信息
 * v1.1.0
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetNetworkDeviceInfoWithRequest:(GetNetworkDeviceInfoRequest *)request handler:(void(^)(GetNetworkDeviceInfoResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"GetNetworkDeviceInfo"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetNetworkDeviceInfoResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 获取网络设备相关信息
 * v1.1.0
 */
- (GRPCUnaryProtoCall *)getNetworkDeviceInfoWithMessage:(GetNetworkDeviceInfoRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"GetNetworkDeviceInfo"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[GetNetworkDeviceInfoResponse class]];
}

#pragma mark UpdateNetworkDeviceInfo(UpdateNetworkDeviceInfoRequest) returns (UpdateNetworkDeviceInfoResponse)

// Deprecated methods.
/**
 * 修改网络设备相关信息
 * v1.1.0
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)updateNetworkDeviceInfoWithRequest:(UpdateNetworkDeviceInfoRequest *)request handler:(void(^)(UpdateNetworkDeviceInfoResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToUpdateNetworkDeviceInfoWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 修改网络设备相关信息
 * v1.1.0
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToUpdateNetworkDeviceInfoWithRequest:(UpdateNetworkDeviceInfoRequest *)request handler:(void(^)(UpdateNetworkDeviceInfoResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"UpdateNetworkDeviceInfo"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[UpdateNetworkDeviceInfoResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 修改网络设备相关信息
 * v1.1.0
 */
- (GRPCUnaryProtoCall *)updateNetworkDeviceInfoWithMessage:(UpdateNetworkDeviceInfoRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"UpdateNetworkDeviceInfo"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[UpdateNetworkDeviceInfoResponse class]];
}

@end
#endif
