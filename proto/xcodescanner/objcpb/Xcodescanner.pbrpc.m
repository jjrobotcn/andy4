#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import "Xcodescanner.pbrpc.h"
#import "Xcodescanner.pbobjc.h"
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriter+Immediate.h>


@implementation XCodeScannerService

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-designated-initializers"

// Designated initializer
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [super initWithHost:host
                 packageName:@"xcScannerService"
                 serviceName:@"XCodeScannerService"
                 callOptions:callOptions];
}

- (instancetype)initWithHost:(NSString *)host {
  return [super initWithHost:host
                 packageName:@"xcScannerService"
                 serviceName:@"XCodeScannerService"];
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

#pragma mark GetScanData(GetScanDataRequest) returns (stream GetScanDataResponse)

// Deprecated methods.
- (void)getScanDataWithRequest:(GetScanDataRequest *)request eventHandler:(void(^)(BOOL done, GetScanDataResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCToGetScanDataWithRequest:request eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToGetScanDataWithRequest:(GetScanDataRequest *)request eventHandler:(void(^)(BOOL done, GetScanDataResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"GetScanData"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetScanDataResponse class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
- (GRPCUnaryProtoCall *)getScanDataWithMessage:(GetScanDataRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"GetScanData"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[GetScanDataResponse class]];
}

@end
#endif
