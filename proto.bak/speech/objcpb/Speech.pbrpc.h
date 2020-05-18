#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
#import "Speech.pbobjc.h"
#endif

#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import <ProtoRPC/ProtoService.h>
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriteable.h>
#import <RxLibrary/GRXWriter.h>
#endif

@class GetVoiceVolumeRequest;
@class GetVoiceVolumeResponse;
@class HibernateRequest;
@class HibernateResponse;
@class ListenSpeechEventRequest;
@class ListenSpeechEventResponse;
@class SetParamsRequest;
@class SetParamsResponse;
@class SetVoiceVolumeRequest;
@class SetVoiceVolumeResponse;
@class SpeechStopRequest;
@class SpeechStopResponse;
@class TextToSpeechRequest;
@class TextToSpeechResponse;
@class WakeUpRequest;
@class WakeUpResponse;

#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
  #import "google/api/Annotations.pbobjc.h"
#endif

@class GRPCProtoCall;
@class GRPCUnaryProtoCall;
@class GRPCStreamingProtoCall;
@class GRPCCallOptions;
@protocol GRPCProtoResponseHandler;


NS_ASSUME_NONNULL_BEGIN

@protocol SpeechService2 <NSObject>

#pragma mark ListenSpeechEvent(ListenSpeechEventRequest) returns (stream ListenSpeechEventResponse)

/**
 * ListenSpeechEvent方法为监听语音事件变更状态流, 具体类型参考: SpeechEvent
 * ListenSpeechEventRequest中可配置相关状态消息过滤,
 */
- (GRPCUnaryProtoCall *)listenSpeechEventWithMessage:(ListenSpeechEventRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark TextToSpeech(TextToSpeechRequest) returns (TextToSpeechResponse)

/**
 * TextToSpeech(TTS)方法实现文本输入语音合成自动音频输出
 */
- (GRPCUnaryProtoCall *)textToSpeechWithMessage:(TextToSpeechRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark SpeechStop(SpeechStopRequest) returns (SpeechStopResponse)

/**
 * SpeechStop方法实现打断语音功能
 */
- (GRPCUnaryProtoCall *)speechStopWithMessage:(SpeechStopRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark WakeUp(WakeUpRequest) returns (WakeUpResponse)

/**
 * 唤醒
 */
- (GRPCUnaryProtoCall *)wakeUpWithMessage:(WakeUpRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark Hibernate(HibernateRequest) returns (HibernateResponse)

/**
 * 休眠
 */
- (GRPCUnaryProtoCall *)hibernateWithMessage:(HibernateRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark SetVoiceVolume(SetVoiceVolumeRequest) returns (SetVoiceVolumeResponse)

/**
 * 设置语音音量
 * v2.1.0
 */
- (GRPCUnaryProtoCall *)setVoiceVolumeWithMessage:(SetVoiceVolumeRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark GetVoiceVolume(GetVoiceVolumeRequest) returns (GetVoiceVolumeResponse)

/**
 * 查询语音音量
 * v2.1.0
 */
- (GRPCUnaryProtoCall *)getVoiceVolumeWithMessage:(GetVoiceVolumeRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark SetParams(SetParamsRequest) returns (SetParamsResponse)

/**
 * 配置参数(当前仅支持AIUI模块)
 * v2.1.0
 * AIUI模块参数配置参考: https://aiui.xfyun.cn/docs/access_docs (开发-评估板/量产板 => AIUI SDK => 参数配置)
 */
- (GRPCUnaryProtoCall *)setParamsWithMessage:(SetParamsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

@end

/**
 * The methods in this protocol belong to a set of old APIs that have been deprecated. They do not
 * recognize call options provided in the initializer. Using the v2 protocol is recommended.
 */
@protocol SpeechService <NSObject>

#pragma mark ListenSpeechEvent(ListenSpeechEventRequest) returns (stream ListenSpeechEventResponse)

/**
 * ListenSpeechEvent方法为监听语音事件变更状态流, 具体类型参考: SpeechEvent
 * ListenSpeechEventRequest中可配置相关状态消息过滤,
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listenSpeechEventWithRequest:(ListenSpeechEventRequest *)request eventHandler:(void(^)(BOOL done, ListenSpeechEventResponse *_Nullable response, NSError *_Nullable error))eventHandler;

/**
 * ListenSpeechEvent方法为监听语音事件变更状态流, 具体类型参考: SpeechEvent
 * ListenSpeechEventRequest中可配置相关状态消息过滤,
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListenSpeechEventWithRequest:(ListenSpeechEventRequest *)request eventHandler:(void(^)(BOOL done, ListenSpeechEventResponse *_Nullable response, NSError *_Nullable error))eventHandler;


#pragma mark TextToSpeech(TextToSpeechRequest) returns (TextToSpeechResponse)

/**
 * TextToSpeech(TTS)方法实现文本输入语音合成自动音频输出
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)textToSpeechWithRequest:(TextToSpeechRequest *)request handler:(void(^)(TextToSpeechResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * TextToSpeech(TTS)方法实现文本输入语音合成自动音频输出
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToTextToSpeechWithRequest:(TextToSpeechRequest *)request handler:(void(^)(TextToSpeechResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark SpeechStop(SpeechStopRequest) returns (SpeechStopResponse)

/**
 * SpeechStop方法实现打断语音功能
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)speechStopWithRequest:(SpeechStopRequest *)request handler:(void(^)(SpeechStopResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * SpeechStop方法实现打断语音功能
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToSpeechStopWithRequest:(SpeechStopRequest *)request handler:(void(^)(SpeechStopResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark WakeUp(WakeUpRequest) returns (WakeUpResponse)

/**
 * 唤醒
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)wakeUpWithRequest:(WakeUpRequest *)request handler:(void(^)(WakeUpResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 唤醒
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToWakeUpWithRequest:(WakeUpRequest *)request handler:(void(^)(WakeUpResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark Hibernate(HibernateRequest) returns (HibernateResponse)

/**
 * 休眠
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)hibernateWithRequest:(HibernateRequest *)request handler:(void(^)(HibernateResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 休眠
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToHibernateWithRequest:(HibernateRequest *)request handler:(void(^)(HibernateResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark SetVoiceVolume(SetVoiceVolumeRequest) returns (SetVoiceVolumeResponse)

/**
 * 设置语音音量
 * v2.1.0
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)setVoiceVolumeWithRequest:(SetVoiceVolumeRequest *)request handler:(void(^)(SetVoiceVolumeResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 设置语音音量
 * v2.1.0
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToSetVoiceVolumeWithRequest:(SetVoiceVolumeRequest *)request handler:(void(^)(SetVoiceVolumeResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark GetVoiceVolume(GetVoiceVolumeRequest) returns (GetVoiceVolumeResponse)

/**
 * 查询语音音量
 * v2.1.0
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getVoiceVolumeWithRequest:(GetVoiceVolumeRequest *)request handler:(void(^)(GetVoiceVolumeResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 查询语音音量
 * v2.1.0
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetVoiceVolumeWithRequest:(GetVoiceVolumeRequest *)request handler:(void(^)(GetVoiceVolumeResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark SetParams(SetParamsRequest) returns (SetParamsResponse)

/**
 * 配置参数(当前仅支持AIUI模块)
 * v2.1.0
 * AIUI模块参数配置参考: https://aiui.xfyun.cn/docs/access_docs (开发-评估板/量产板 => AIUI SDK => 参数配置)
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)setParamsWithRequest:(SetParamsRequest *)request handler:(void(^)(SetParamsResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * 配置参数(当前仅支持AIUI模块)
 * v2.1.0
 * AIUI模块参数配置参考: https://aiui.xfyun.cn/docs/access_docs (开发-评估板/量产板 => AIUI SDK => 参数配置)
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToSetParamsWithRequest:(SetParamsRequest *)request handler:(void(^)(SetParamsResponse *_Nullable response, NSError *_Nullable error))handler;


@end


#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
/**
 * Basic service implementation, over gRPC, that only does
 * marshalling and parsing.
 */
@interface SpeechService : GRPCProtoService<SpeechService, SpeechService2>
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions NS_DESIGNATED_INITIALIZER;
+ (instancetype)serviceWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions;
// The following methods belong to a set of old APIs that have been deprecated.
- (instancetype)initWithHost:(NSString *)host;
+ (instancetype)serviceWithHost:(NSString *)host;
@end
#endif

NS_ASSUME_NONNULL_END

