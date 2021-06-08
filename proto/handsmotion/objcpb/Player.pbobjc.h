// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: player.proto

// This CPP symbol can be defined to use imports that match up to the framework
// imports needed when using CocoaPods.
#if !defined(GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS)
 #define GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS 0
#endif

#if GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS
 #import <Protobuf/GPBProtocolBuffers.h>
#else
 #import "GPBProtocolBuffers.h"
#endif

#if GOOGLE_PROTOBUF_OBJC_VERSION < 30002
#error This file was generated by a newer version of protoc which is incompatible with your Protocol Buffer library sources.
#endif
#if 30002 < GOOGLE_PROTOBUF_OBJC_MIN_SUPPORTED_VERSION
#error This file was generated by an older version of protoc which is incompatible with your Protocol Buffer library sources.
#endif

// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

CF_EXTERN_C_BEGIN

@class MotionMeta;

NS_ASSUME_NONNULL_BEGIN

#pragma mark - Enum PlayerState

/** 播放状态 */
typedef GPB_ENUM(PlayerState) {
  /**
   * Value used if any message's field encounters a value that is not defined
   * by this enum. The message will also have C functions to get/set the rawValue
   * of the field.
   **/
  PlayerState_GPBUnrecognizedEnumeratorValue = kGPBUnrecognizedEnumeratorValue,
  /** 默认零值，不使用 */
  PlayerState_Unknown = 0,

  /** 已停止 */
  PlayerState_Stopped = 1,

  /** 播放中 */
  PlayerState_Playing = 2,
};

GPBEnumDescriptor *PlayerState_EnumDescriptor(void);

/**
 * Checks to see if the given value is defined by the enum or was not known at
 * the time this source was generated.
 **/
BOOL PlayerState_IsValidValue(int32_t value);

#pragma mark - PlayerRoot

/**
 * Exposes the extension registry for this file.
 *
 * The base class provides:
 * @code
 *   + (GPBExtensionRegistry *)extensionRegistry;
 * @endcode
 * which is a @c GPBExtensionRegistry that includes all the extensions defined by
 * this file and all files that it depends on.
 **/
@interface PlayerRoot : GPBRootObject
@end

#pragma mark - PlayRequest

typedef GPB_ENUM(PlayRequest_FieldNumber) {
  PlayRequest_FieldNumber_Motion = 1,
  PlayRequest_FieldNumber_SyncMode = 2,
};

@interface PlayRequest : GPBMessage

/**
 * 手臂动作
 * 支持通过id或名称任意一值
 **/
@property(nonatomic, readwrite, strong, null_resettable) MotionMeta *motion;
/** Test to see if @c motion has been set. */
@property(nonatomic, readwrite) BOOL hasMotion;

/**
 * 同步标识
 * true: 等待动作完成时返回
 * false: 动作开始执行时立即返回
 **/
@property(nonatomic, readwrite) BOOL syncMode;

@end

#pragma mark - PlayResponse

@interface PlayResponse : GPBMessage

@end

#pragma mark - StopRequest

@interface StopRequest : GPBMessage

@end

#pragma mark - StopResponse

@interface StopResponse : GPBMessage

@end

#pragma mark - ResetRequest

@interface ResetRequest : GPBMessage

@end

#pragma mark - ResetResponse

@interface ResetResponse : GPBMessage

@end

#pragma mark - StateRequest

@interface StateRequest : GPBMessage

@end

#pragma mark - StateResponse

typedef GPB_ENUM(StateResponse_FieldNumber) {
  StateResponse_FieldNumber_State = 1,
  StateResponse_FieldNumber_Motion = 2,
};

@interface StateResponse : GPBMessage

/** 播放状态 */
@property(nonatomic, readwrite) PlayerState state;

/** 当前手臂动作 */
@property(nonatomic, readwrite, strong, null_resettable) MotionMeta *motion;
/** Test to see if @c motion has been set. */
@property(nonatomic, readwrite) BOOL hasMotion;

@end

/**
 * Fetches the raw value of a @c StateResponse's @c state property, even
 * if the value was not defined by the enum at the time the code was generated.
 **/
int32_t StateResponse_State_RawValue(StateResponse *message);
/**
 * Sets the raw value of an @c StateResponse's @c state property, allowing
 * it to be set to a value that was not defined by the enum at the time the code
 * was generated.
 **/
void SetStateResponse_State_RawValue(StateResponse *message, int32_t value);

#pragma mark - OnStateChangeRequest

@interface OnStateChangeRequest : GPBMessage

@end

#pragma mark - OnStateChangeResponse

typedef GPB_ENUM(OnStateChangeResponse_FieldNumber) {
  OnStateChangeResponse_FieldNumber_State = 1,
  OnStateChangeResponse_FieldNumber_Motion = 2,
};

@interface OnStateChangeResponse : GPBMessage

/** 播放状态 */
@property(nonatomic, readwrite) PlayerState state;

/** 当前手臂动作 */
@property(nonatomic, readwrite, strong, null_resettable) MotionMeta *motion;
/** Test to see if @c motion has been set. */
@property(nonatomic, readwrite) BOOL hasMotion;

@end

/**
 * Fetches the raw value of a @c OnStateChangeResponse's @c state property, even
 * if the value was not defined by the enum at the time the code was generated.
 **/
int32_t OnStateChangeResponse_State_RawValue(OnStateChangeResponse *message);
/**
 * Sets the raw value of an @c OnStateChangeResponse's @c state property, allowing
 * it to be set to a value that was not defined by the enum at the time the code
 * was generated.
 **/
void SetOnStateChangeResponse_State_RawValue(OnStateChangeResponse *message, int32_t value);

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)
