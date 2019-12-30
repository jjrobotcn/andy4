#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
#import "Network.pbobjc.h"
#endif

#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import <ProtoRPC/ProtoService.h>
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriteable.h>
#import <RxLibrary/GRXWriter.h>
#endif

@class ConnectRequest;
@class ConnectResponse;
@class GetNetworkDeviceInfoRequest;
@class GetNetworkDeviceInfoResponse;
@class GetStatusRequest;
@class GetStatusResponse;
@class ListNetworksRequest;
@class ListNetworksResponse;
@class UpdateNetworkDeviceInfoRequest;
@class UpdateNetworkDeviceInfoResponse;

#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
  #import "google/api/Annotations.pbobjc.h"
#endif

@class GRPCProtoCall;
@class GRPCUnaryProtoCall;
@class GRPCStreamingProtoCall;
@class GRPCCallOptions;
@protocol GRPCProtoResponseHandler;


NS_ASSUME_NONNULL_BEGIN

@protocol NetworkService2 <NSObject>

#pragma mark ListNetworks(ListNetworksRequest) returns (stream ListNetworksResponse)

/**
 * 获取网络扫描结果流
 * api请求时将触发ssid扫描更新，该方法在同一时刻多个请求仅处理一次，向所有监听返回同一扫描结果
 * 方法不主动进行更新，但监听用户可获取其它请求中返回的扫描结果
 */
- (GRPCUnaryProtoCall *)listNetworksWithMessage:(ListNetworksRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark Connect(ConnectRequest) returns (ConnectResponse)

/**
 * 连接至指定网络
 * 连接失败将立即返回错误
 * 若30秒后成功获取状态将返回超时失败
 */
- (GRPCUnaryProtoCall *)connectWithMessage:(ConnectRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark GetStatus(GetStatusRequest) returns (stream GetStatusResponse)

/**
 * 获取连接状态流
 * 在连接开始时立即返回当前最新的扫描数据
 * 并持续在网络数据更新时接收新数据
 */
- (GRPCUnaryProtoCall *)getStatusWithMessage:(GetStatusRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark GetNetworkDeviceInfo(GetNetworkDeviceInfoRequest) returns (GetNetworkDeviceInfoResponse)

/**
 * 获取网络设备相关信息
 * v1.1.0
 */
- (GRPCUnaryProtoCall *)getNetworkDeviceInfoWithMessage:(GetNetworkDeviceInfoRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark UpdateNetworkDeviceInfo(UpdateNetworkDeviceInfoRequest) returns (UpdateNetworkDeviceInfoResponse)

/**
 * 修改网络设备相关信息
 * v1.1.0
 */
- (GRPCUnaryProtoCall *)updateNetworkDeviceInfoWithMessage:(UpdateNetworkDeviceInfoRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

@end

/**
 * The methods in this protocol belong to a set of old APIs that have been deprecated. They do not
 * recognize call options provided in the initializer. Using the v2 protocol is recommended.
 */
@protocol NetworkService <NSObject>

#pragma mark ListNetworks(ListNetworksRequest) returns (stream ListNetworksResponse)

/**
 * 获取网络扫描结果流
 * api请求时将触发ssid扫描更新，该方法在同一时刻多个请求仅处理一次，向所有监听返回同一扫描结果
 * 方法不主动进行更新，但监听用户可获取其它请求中返回的扫描结果
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listNetworksWithRequest:(ListNetworksRequest *)request eventHandler:(void(^)(BOOL done, ListNetworksResponse *_Nullable response, NSError *_Nullable error))eventHandler;

/**
 * 获取网络扫描结果流
 * api请求时将触发ssid扫描更新，该方法在同一时刻多个请求仅处理一次，向所有监听返回同一扫描结果
 * 方法不主动进行更新，但监听用户可获取其它请求中返回的扫描结果
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListNetworksWithRequest:(ListNetworksRequest *)request eventHandler:(void(^)(BOOL done, ListNetworksResponse *_Nullable response, NSError *_Nullable error))eventHandler;


#pragma mark Connect(ConnectRequest) returns (ConnectResponse)

/**
 * 连接至指定网络
 * 连接失败将立即返回错误
 * 若30秒后成功获取状态将返回超时失败
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)connectWithRequest:(ConnectRequest *)request handler:(void(^)(ConnectResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 连接至指定网络
 * 连接失败将立即返回错误
 * 若30秒后成功获取状态将返回超时失败
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToConnectWithRequest:(ConnectRequest *)request handler:(void(^)(ConnectResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark GetStatus(GetStatusRequest) returns (stream GetStatusResponse)

/**
 * 获取连接状态流
 * 在连接开始时立即返回当前最新的扫描数据
 * 并持续在网络数据更新时接收新数据
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getStatusWithRequest:(GetStatusRequest *)request eventHandler:(void(^)(BOOL done, GetStatusResponse *_Nullable response, NSError *_Nullable error))eventHandler;

/**
 * 获取连接状态流
 * 在连接开始时立即返回当前最新的扫描数据
 * 并持续在网络数据更新时接收新数据
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetStatusWithRequest:(GetStatusRequest *)request eventHandler:(void(^)(BOOL done, GetStatusResponse *_Nullable response, NSError *_Nullable error))eventHandler;


#pragma mark GetNetworkDeviceInfo(GetNetworkDeviceInfoRequest) returns (GetNetworkDeviceInfoResponse)

/**
 * 获取网络设备相关信息
 * v1.1.0
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getNetworkDeviceInfoWithRequest:(GetNetworkDeviceInfoRequest *)request handler:(void(^)(GetNetworkDeviceInfoResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 获取网络设备相关信息
 * v1.1.0
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetNetworkDeviceInfoWithRequest:(GetNetworkDeviceInfoRequest *)request handler:(void(^)(GetNetworkDeviceInfoResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark UpdateNetworkDeviceInfo(UpdateNetworkDeviceInfoRequest) returns (UpdateNetworkDeviceInfoResponse)

/**
 * 修改网络设备相关信息
 * v1.1.0
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)updateNetworkDeviceInfoWithRequest:(UpdateNetworkDeviceInfoRequest *)request handler:(void(^)(UpdateNetworkDeviceInfoResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 修改网络设备相关信息
 * v1.1.0
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToUpdateNetworkDeviceInfoWithRequest:(UpdateNetworkDeviceInfoRequest *)request handler:(void(^)(UpdateNetworkDeviceInfoResponse *_Nullable response, NSError *_Nullable error))handler;


@end


#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
/**
 * Basic service implementation, over gRPC, that only does
 * marshalling and parsing.
 */
@interface NetworkService : GRPCProtoService<NetworkService, NetworkService2>
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions NS_DESIGNATED_INITIALIZER;
+ (instancetype)serviceWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions;
// The following methods belong to a set of old APIs that have been deprecated.
- (instancetype)initWithHost:(NSString *)host;
+ (instancetype)serviceWithHost:(NSString *)host;
@end
#endif

NS_ASSUME_NONNULL_END

