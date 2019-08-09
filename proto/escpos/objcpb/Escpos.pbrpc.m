#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import "Escpos.pbrpc.h"
#import "Escpos.pbobjc.h"
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriter+Immediate.h>

#import "google/api/Annotations.pbobjc.h"

@implementation EscPosService

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-designated-initializers"

// Designated initializer
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [super initWithHost:host
                 packageName:@"escposService"
                 serviceName:@"EscPosService"
                 callOptions:callOptions];
}

- (instancetype)initWithHost:(NSString *)host {
  return [super initWithHost:host
                 packageName:@"escposService"
                 serviceName:@"EscPosService"];
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

#pragma mark PrintRaw(PrintRawRequest) returns (PrintRawResponse)

// Deprecated methods.
/**
 * 打印bytes数据
 * 打印模板与打印对象方式不满足业务需求
 * 或希望接入其它已外部业务实现的打印组件时, 可通过此方法直接
 * 传入打印内容
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)printRawWithRequest:(PrintRawRequest *)request handler:(void(^)(PrintRawResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPrintRawWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 打印bytes数据
 * 打印模板与打印对象方式不满足业务需求
 * 或希望接入其它已外部业务实现的打印组件时, 可通过此方法直接
 * 传入打印内容
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToPrintRawWithRequest:(PrintRawRequest *)request handler:(void(^)(PrintRawResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"PrintRaw"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[PrintRawResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 打印bytes数据
 * 打印模板与打印对象方式不满足业务需求
 * 或希望接入其它已外部业务实现的打印组件时, 可通过此方法直接
 * 传入打印内容
 */
- (GRPCUnaryProtoCall *)printRawWithMessage:(PrintRawRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"PrintRaw"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[PrintRawResponse class]];
}

#pragma mark PrintElements(PrintElementsRequest) returns (PrintElementsResponse)

// Deprecated methods.
/**
 * 打印对象
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)printElementsWithRequest:(PrintElementsRequest *)request handler:(void(^)(PrintElementsResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPrintElementsWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 打印对象
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToPrintElementsWithRequest:(PrintElementsRequest *)request handler:(void(^)(PrintElementsResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"PrintElements"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[PrintElementsResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 打印对象
 */
- (GRPCUnaryProtoCall *)printElementsWithMessage:(PrintElementsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"PrintElements"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[PrintElementsResponse class]];
}

#pragma mark PrintHtmlTemplate(PrintHtmlTemplateRequest) returns (PrintHtmlTemplateResponse)

// Deprecated methods.
/**
 * 打印预设的html模板内容
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)printHtmlTemplateWithRequest:(PrintHtmlTemplateRequest *)request handler:(void(^)(PrintHtmlTemplateResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToPrintHtmlTemplateWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 打印预设的html模板内容
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToPrintHtmlTemplateWithRequest:(PrintHtmlTemplateRequest *)request handler:(void(^)(PrintHtmlTemplateResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"PrintHtmlTemplate"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[PrintHtmlTemplateResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 打印预设的html模板内容
 */
- (GRPCUnaryProtoCall *)printHtmlTemplateWithMessage:(PrintHtmlTemplateRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"PrintHtmlTemplate"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[PrintHtmlTemplateResponse class]];
}

#pragma mark NewHtmlTemplate(NewHtmlTemplateRequest) returns (NewHtmlTemplateResponse)

// Deprecated methods.
/**
 * 创建html模板
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)newHtmlTemplateWithRequest:(NewHtmlTemplateRequest *)request handler:(void(^)(NewHtmlTemplateResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToNewHtmlTemplateWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 创建html模板
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToNewHtmlTemplateWithRequest:(NewHtmlTemplateRequest *)request handler:(void(^)(NewHtmlTemplateResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"NewHtmlTemplate"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[NewHtmlTemplateResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 创建html模板
 */
- (GRPCUnaryProtoCall *)newHtmlTemplateWithMessage:(NewHtmlTemplateRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"NewHtmlTemplate"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[NewHtmlTemplateResponse class]];
}

#pragma mark ListHtmlTemplates(ListHtmlTemplatesRequest) returns (ListHtmlTemplatesResponse)

// Deprecated methods.
/**
 * 获取html模板列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listHtmlTemplatesWithRequest:(ListHtmlTemplatesRequest *)request handler:(void(^)(ListHtmlTemplatesResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToListHtmlTemplatesWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取html模板列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListHtmlTemplatesWithRequest:(ListHtmlTemplatesRequest *)request handler:(void(^)(ListHtmlTemplatesResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"ListHtmlTemplates"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[ListHtmlTemplatesResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 获取html模板列表
 */
- (GRPCUnaryProtoCall *)listHtmlTemplatesWithMessage:(ListHtmlTemplatesRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"ListHtmlTemplates"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[ListHtmlTemplatesResponse class]];
}

#pragma mark GetHtmlTemplate(GetHtmlTemplateRequest) returns (GetHtmlTemplateResponse)

// Deprecated methods.
/**
 * 获取指定html模板内容
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getHtmlTemplateWithRequest:(GetHtmlTemplateRequest *)request handler:(void(^)(GetHtmlTemplateResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToGetHtmlTemplateWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 获取指定html模板内容
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetHtmlTemplateWithRequest:(GetHtmlTemplateRequest *)request handler:(void(^)(GetHtmlTemplateResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"GetHtmlTemplate"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetHtmlTemplateResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 获取指定html模板内容
 */
- (GRPCUnaryProtoCall *)getHtmlTemplateWithMessage:(GetHtmlTemplateRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"GetHtmlTemplate"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[GetHtmlTemplateResponse class]];
}

#pragma mark UpdateHtmlTemplate(UpdateHtmlTemplateRequest) returns (UpdateHtmlTemplateResponse)

// Deprecated methods.
/**
 * 更新html模板
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)updateHtmlTemplateWithRequest:(UpdateHtmlTemplateRequest *)request handler:(void(^)(UpdateHtmlTemplateResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToUpdateHtmlTemplateWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 更新html模板
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToUpdateHtmlTemplateWithRequest:(UpdateHtmlTemplateRequest *)request handler:(void(^)(UpdateHtmlTemplateResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"UpdateHtmlTemplate"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[UpdateHtmlTemplateResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 更新html模板
 */
- (GRPCUnaryProtoCall *)updateHtmlTemplateWithMessage:(UpdateHtmlTemplateRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"UpdateHtmlTemplate"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[UpdateHtmlTemplateResponse class]];
}

#pragma mark DeleteHtmlTemplates(DeleteHtmlTemplatesRequest) returns (DeleteHtmlTemplatesResponse)

// Deprecated methods.
/**
 * 删除html模板
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)deleteHtmlTemplatesWithRequest:(DeleteHtmlTemplatesRequest *)request handler:(void(^)(DeleteHtmlTemplatesResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToDeleteHtmlTemplatesWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 删除html模板
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToDeleteHtmlTemplatesWithRequest:(DeleteHtmlTemplatesRequest *)request handler:(void(^)(DeleteHtmlTemplatesResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"DeleteHtmlTemplates"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[DeleteHtmlTemplatesResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 删除html模板
 */
- (GRPCUnaryProtoCall *)deleteHtmlTemplatesWithMessage:(DeleteHtmlTemplatesRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"DeleteHtmlTemplates"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[DeleteHtmlTemplatesResponse class]];
}

@end
#endif
