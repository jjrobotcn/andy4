#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
#import "Escpos.pbobjc.h"
#endif

#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import <ProtoRPC/ProtoService.h>
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriteable.h>
#import <RxLibrary/GRXWriter.h>
#endif

@class DeleteHtmlTemplatesRequest;
@class DeleteHtmlTemplatesResponse;
@class GetHtmlTemplateRequest;
@class GetHtmlTemplateResponse;
@class ListHtmlTemplatesRequest;
@class ListHtmlTemplatesResponse;
@class NewHtmlTemplateRequest;
@class NewHtmlTemplateResponse;
@class PrintElementsRequest;
@class PrintElementsResponse;
@class PrintHtmlTemplateRequest;
@class PrintHtmlTemplateResponse;
@class PrintRawRequest;
@class PrintRawResponse;
@class UpdateHtmlTemplateRequest;
@class UpdateHtmlTemplateResponse;

#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
  #import "google/api/Annotations.pbobjc.h"
#endif

@class GRPCProtoCall;
@class GRPCUnaryProtoCall;
@class GRPCStreamingProtoCall;
@class GRPCCallOptions;
@protocol GRPCProtoResponseHandler;


NS_ASSUME_NONNULL_BEGIN

@protocol EscPosService2 <NSObject>

#pragma mark PrintRaw(PrintRawRequest) returns (PrintRawResponse)

/**
 * 打印bytes数据
 * 打印模板与打印对象方式不满足业务需求
 * 或希望接入其它已外部业务实现的打印组件时, 可通过此方法直接
 * 传入打印内容
 */
- (GRPCUnaryProtoCall *)printRawWithMessage:(PrintRawRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark PrintElements(PrintElementsRequest) returns (PrintElementsResponse)

/**
 * 打印对象
 */
- (GRPCUnaryProtoCall *)printElementsWithMessage:(PrintElementsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark PrintHtmlTemplate(PrintHtmlTemplateRequest) returns (PrintHtmlTemplateResponse)

/**
 * 打印预设的html模板内容
 */
- (GRPCUnaryProtoCall *)printHtmlTemplateWithMessage:(PrintHtmlTemplateRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark NewHtmlTemplate(NewHtmlTemplateRequest) returns (NewHtmlTemplateResponse)

/**
 * 创建html模板
 */
- (GRPCUnaryProtoCall *)newHtmlTemplateWithMessage:(NewHtmlTemplateRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark ListHtmlTemplates(ListHtmlTemplatesRequest) returns (ListHtmlTemplatesResponse)

/**
 * 获取html模板列表
 */
- (GRPCUnaryProtoCall *)listHtmlTemplatesWithMessage:(ListHtmlTemplatesRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark GetHtmlTemplate(GetHtmlTemplateRequest) returns (GetHtmlTemplateResponse)

/**
 * 获取指定html模板内容
 */
- (GRPCUnaryProtoCall *)getHtmlTemplateWithMessage:(GetHtmlTemplateRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark UpdateHtmlTemplate(UpdateHtmlTemplateRequest) returns (UpdateHtmlTemplateResponse)

/**
 * 更新html模板
 */
- (GRPCUnaryProtoCall *)updateHtmlTemplateWithMessage:(UpdateHtmlTemplateRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark DeleteHtmlTemplates(DeleteHtmlTemplatesRequest) returns (DeleteHtmlTemplatesResponse)

/**
 * 删除html模板
 */
- (GRPCUnaryProtoCall *)deleteHtmlTemplatesWithMessage:(DeleteHtmlTemplatesRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

@end

/**
 * The methods in this protocol belong to a set of old APIs that have been deprecated. They do not
 * recognize call options provided in the initializer. Using the v2 protocol is recommended.
 */
@protocol EscPosService <NSObject>

#pragma mark PrintRaw(PrintRawRequest) returns (PrintRawResponse)

/**
 * 打印bytes数据
 * 打印模板与打印对象方式不满足业务需求
 * 或希望接入其它已外部业务实现的打印组件时, 可通过此方法直接
 * 传入打印内容
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)printRawWithRequest:(PrintRawRequest *)request handler:(void(^)(PrintRawResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 打印bytes数据
 * 打印模板与打印对象方式不满足业务需求
 * 或希望接入其它已外部业务实现的打印组件时, 可通过此方法直接
 * 传入打印内容
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToPrintRawWithRequest:(PrintRawRequest *)request handler:(void(^)(PrintRawResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark PrintElements(PrintElementsRequest) returns (PrintElementsResponse)

/**
 * 打印对象
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)printElementsWithRequest:(PrintElementsRequest *)request handler:(void(^)(PrintElementsResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 打印对象
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToPrintElementsWithRequest:(PrintElementsRequest *)request handler:(void(^)(PrintElementsResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark PrintHtmlTemplate(PrintHtmlTemplateRequest) returns (PrintHtmlTemplateResponse)

/**
 * 打印预设的html模板内容
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)printHtmlTemplateWithRequest:(PrintHtmlTemplateRequest *)request handler:(void(^)(PrintHtmlTemplateResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 打印预设的html模板内容
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToPrintHtmlTemplateWithRequest:(PrintHtmlTemplateRequest *)request handler:(void(^)(PrintHtmlTemplateResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark NewHtmlTemplate(NewHtmlTemplateRequest) returns (NewHtmlTemplateResponse)

/**
 * 创建html模板
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)newHtmlTemplateWithRequest:(NewHtmlTemplateRequest *)request handler:(void(^)(NewHtmlTemplateResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 创建html模板
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToNewHtmlTemplateWithRequest:(NewHtmlTemplateRequest *)request handler:(void(^)(NewHtmlTemplateResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark ListHtmlTemplates(ListHtmlTemplatesRequest) returns (ListHtmlTemplatesResponse)

/**
 * 获取html模板列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listHtmlTemplatesWithRequest:(ListHtmlTemplatesRequest *)request handler:(void(^)(ListHtmlTemplatesResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 获取html模板列表
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListHtmlTemplatesWithRequest:(ListHtmlTemplatesRequest *)request handler:(void(^)(ListHtmlTemplatesResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark GetHtmlTemplate(GetHtmlTemplateRequest) returns (GetHtmlTemplateResponse)

/**
 * 获取指定html模板内容
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getHtmlTemplateWithRequest:(GetHtmlTemplateRequest *)request handler:(void(^)(GetHtmlTemplateResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 获取指定html模板内容
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetHtmlTemplateWithRequest:(GetHtmlTemplateRequest *)request handler:(void(^)(GetHtmlTemplateResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark UpdateHtmlTemplate(UpdateHtmlTemplateRequest) returns (UpdateHtmlTemplateResponse)

/**
 * 更新html模板
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)updateHtmlTemplateWithRequest:(UpdateHtmlTemplateRequest *)request handler:(void(^)(UpdateHtmlTemplateResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 更新html模板
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToUpdateHtmlTemplateWithRequest:(UpdateHtmlTemplateRequest *)request handler:(void(^)(UpdateHtmlTemplateResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark DeleteHtmlTemplates(DeleteHtmlTemplatesRequest) returns (DeleteHtmlTemplatesResponse)

/**
 * 删除html模板
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)deleteHtmlTemplatesWithRequest:(DeleteHtmlTemplatesRequest *)request handler:(void(^)(DeleteHtmlTemplatesResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 删除html模板
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToDeleteHtmlTemplatesWithRequest:(DeleteHtmlTemplatesRequest *)request handler:(void(^)(DeleteHtmlTemplatesResponse *_Nullable response, NSError *_Nullable error))handler;


@end


#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
/**
 * Basic service implementation, over gRPC, that only does
 * marshalling and parsing.
 */
@interface EscPosService : GRPCProtoService<EscPosService, EscPosService2>
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions NS_DESIGNATED_INITIALIZER;
+ (instancetype)serviceWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions;
// The following methods belong to a set of old APIs that have been deprecated.
- (instancetype)initWithHost:(NSString *)host;
+ (instancetype)serviceWithHost:(NSString *)host;
@end
#endif

NS_ASSUME_NONNULL_END

