#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import "Messaging.pbrpc.h"
#import "Messaging.pbobjc.h"
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriter+Immediate.h>


@implementation MessagingService

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-designated-initializers"

// Designated initializer
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [super initWithHost:host
                 packageName:@"messaging"
                 serviceName:@"MessagingService"
                 callOptions:callOptions];
}

- (instancetype)initWithHost:(NSString *)host {
  return [super initWithHost:host
                 packageName:@"messaging"
                 serviceName:@"MessagingService"];
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

#pragma mark Messaging(stream MessagingRequest) returns (stream MessagingResponse)

// Deprecated methods.
/**
 * Messaging为消息发布订阅方法
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)messagingWithRequestsWriter:(GRXWriter *)requestWriter eventHandler:(void(^)(BOOL done, MessagingResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCToMessagingWithRequestsWriter:requestWriter eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
/**
 * Messaging为消息发布订阅方法
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToMessagingWithRequestsWriter:(GRXWriter *)requestWriter eventHandler:(void(^)(BOOL done, MessagingResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"Messaging"
            requestsWriter:requestWriter
             responseClass:[MessagingResponse class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
/**
 * Messaging为消息发布订阅方法
 */
- (GRPCStreamingProtoCall *)messagingWithResponseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"Messaging"
           responseHandler:handler
               callOptions:callOptions
             responseClass:[MessagingResponse class]];
}

@end
#endif
