#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import "Speech.pbrpc.h"
#import "Speech.pbobjc.h"
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriter+Immediate.h>

#import "google/api/Annotations.pbobjc.h"

@implementation SpeechService

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-designated-initializers"

// Designated initializer
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [super initWithHost:host
                 packageName:@"speechService"
                 serviceName:@"SpeechService"
                 callOptions:callOptions];
}

- (instancetype)initWithHost:(NSString *)host {
  return [super initWithHost:host
                 packageName:@"speechService"
                 serviceName:@"SpeechService"];
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

#pragma mark ListenSpeechEvent(ListenSpeechEventRequest) returns (stream ListenSpeechEventResponse)

// Deprecated methods.
/**
 * ListenSpeechEvent方法为监听语音事件变更状态流, 具体类型参考: SpeechEvent
 * ListenSpeechEventRequest中可配置相关状态消息过滤,
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listenSpeechEventWithRequest:(ListenSpeechEventRequest *)request eventHandler:(void(^)(BOOL done, ListenSpeechEventResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCToListenSpeechEventWithRequest:request eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
/**
 * ListenSpeechEvent方法为监听语音事件变更状态流, 具体类型参考: SpeechEvent
 * ListenSpeechEventRequest中可配置相关状态消息过滤,
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListenSpeechEventWithRequest:(ListenSpeechEventRequest *)request eventHandler:(void(^)(BOOL done, ListenSpeechEventResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"ListenSpeechEvent"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[ListenSpeechEventResponse class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
/**
 * ListenSpeechEvent方法为监听语音事件变更状态流, 具体类型参考: SpeechEvent
 * ListenSpeechEventRequest中可配置相关状态消息过滤,
 */
- (GRPCUnaryProtoCall *)listenSpeechEventWithMessage:(ListenSpeechEventRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"ListenSpeechEvent"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[ListenSpeechEventResponse class]];
}

#pragma mark TextToSpeech(TextToSpeechRequest) returns (TextToSpeechResponse)

// Deprecated methods.
/**
 * TextToSpeech(TTS)方法实现文本输入语音合成自动音频输出
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)textToSpeechWithRequest:(TextToSpeechRequest *)request handler:(void(^)(TextToSpeechResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToTextToSpeechWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * TextToSpeech(TTS)方法实现文本输入语音合成自动音频输出
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToTextToSpeechWithRequest:(TextToSpeechRequest *)request handler:(void(^)(TextToSpeechResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"TextToSpeech"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[TextToSpeechResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * TextToSpeech(TTS)方法实现文本输入语音合成自动音频输出
 */
- (GRPCUnaryProtoCall *)textToSpeechWithMessage:(TextToSpeechRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"TextToSpeech"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[TextToSpeechResponse class]];
}

#pragma mark SpeechStop(SpeechStopRequest) returns (SpeechStopResponse)

// Deprecated methods.
/**
 * SpeechStop方法实现打断语音功能
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)speechStopWithRequest:(SpeechStopRequest *)request handler:(void(^)(SpeechStopResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToSpeechStopWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * SpeechStop方法实现打断语音功能
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToSpeechStopWithRequest:(SpeechStopRequest *)request handler:(void(^)(SpeechStopResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"SpeechStop"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[SpeechStopResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * SpeechStop方法实现打断语音功能
 */
- (GRPCUnaryProtoCall *)speechStopWithMessage:(SpeechStopRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"SpeechStop"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[SpeechStopResponse class]];
}

#pragma mark WakeUp(WakeUpRequest) returns (WakeUpResponse)

// Deprecated methods.
/**
 * 唤醒
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)wakeUpWithRequest:(WakeUpRequest *)request handler:(void(^)(WakeUpResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToWakeUpWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 唤醒
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToWakeUpWithRequest:(WakeUpRequest *)request handler:(void(^)(WakeUpResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"WakeUp"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[WakeUpResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 唤醒
 */
- (GRPCUnaryProtoCall *)wakeUpWithMessage:(WakeUpRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"WakeUp"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[WakeUpResponse class]];
}

#pragma mark Hibernate(HibernateRequest) returns (HibernateResponse)

// Deprecated methods.
/**
 * 休眠
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)hibernateWithRequest:(HibernateRequest *)request handler:(void(^)(HibernateResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToHibernateWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 休眠
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToHibernateWithRequest:(HibernateRequest *)request handler:(void(^)(HibernateResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"Hibernate"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[HibernateResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 休眠
 */
- (GRPCUnaryProtoCall *)hibernateWithMessage:(HibernateRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"Hibernate"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[HibernateResponse class]];
}

#pragma mark SetVoiceVolume(SetVoiceVolumeRequest) returns (SetVoiceVolumeResponse)

// Deprecated methods.
/**
 * 设置语音音量
 * v2.1.0
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)setVoiceVolumeWithRequest:(SetVoiceVolumeRequest *)request handler:(void(^)(SetVoiceVolumeResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToSetVoiceVolumeWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 设置语音音量
 * v2.1.0
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToSetVoiceVolumeWithRequest:(SetVoiceVolumeRequest *)request handler:(void(^)(SetVoiceVolumeResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"SetVoiceVolume"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[SetVoiceVolumeResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 设置语音音量
 * v2.1.0
 */
- (GRPCUnaryProtoCall *)setVoiceVolumeWithMessage:(SetVoiceVolumeRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"SetVoiceVolume"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[SetVoiceVolumeResponse class]];
}

#pragma mark GetVoiceVolume(GetVoiceVolumeRequest) returns (GetVoiceVolumeResponse)

// Deprecated methods.
/**
 * 查询语音音量
 * v2.1.0
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getVoiceVolumeWithRequest:(GetVoiceVolumeRequest *)request handler:(void(^)(GetVoiceVolumeResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToGetVoiceVolumeWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 查询语音音量
 * v2.1.0
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetVoiceVolumeWithRequest:(GetVoiceVolumeRequest *)request handler:(void(^)(GetVoiceVolumeResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"GetVoiceVolume"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetVoiceVolumeResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 查询语音音量
 * v2.1.0
 */
- (GRPCUnaryProtoCall *)getVoiceVolumeWithMessage:(GetVoiceVolumeRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"GetVoiceVolume"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[GetVoiceVolumeResponse class]];
}

#pragma mark SetParams(SetParamsRequest) returns (SetParamsResponse)

// Deprecated methods.
/**
 * 配置参数(当前仅支持AIUI模块)
 * v2.1.0
 * AIUI模块参数配置参考: https://aiui.xfyun.cn/docs/access_docs (开发-评估板/量产板 => AIUI SDK => 参数配置)
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)setParamsWithRequest:(SetParamsRequest *)request handler:(void(^)(SetParamsResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToSetParamsWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * 配置参数(当前仅支持AIUI模块)
 * v2.1.0
 * AIUI模块参数配置参考: https://aiui.xfyun.cn/docs/access_docs (开发-评估板/量产板 => AIUI SDK => 参数配置)
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToSetParamsWithRequest:(SetParamsRequest *)request handler:(void(^)(SetParamsResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"SetParams"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[SetParamsResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * 配置参数(当前仅支持AIUI模块)
 * v2.1.0
 * AIUI模块参数配置参考: https://aiui.xfyun.cn/docs/access_docs (开发-评估板/量产板 => AIUI SDK => 参数配置)
 */
- (GRPCUnaryProtoCall *)setParamsWithMessage:(SetParamsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"SetParams"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[SetParamsResponse class]];
}

@end
#endif
