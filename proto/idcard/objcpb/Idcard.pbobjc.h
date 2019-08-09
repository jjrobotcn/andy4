// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: idcard.proto

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

@class IdInfo;

NS_ASSUME_NONNULL_BEGIN

#pragma mark - IdcardRoot

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
@interface IdcardRoot : GPBRootObject
@end

#pragma mark - GetIdInfoRequest

/**
 * 获取读卡数据流请求
 **/
@interface GetIdInfoRequest : GPBMessage

@end

#pragma mark - IdInfo

typedef GPB_ENUM(IdInfo_FieldNumber) {
  IdInfo_FieldNumber_Id_p = 1,
  IdInfo_FieldNumber_Name = 2,
  IdInfo_FieldNumber_Gender = 3,
  IdInfo_FieldNumber_National = 4,
  IdInfo_FieldNumber_Birthday = 5,
  IdInfo_FieldNumber_Address = 6,
  IdInfo_FieldNumber_SignOrganization = 7,
  IdInfo_FieldNumber_StartDate = 8,
  IdInfo_FieldNumber_EndDate = 9,
  IdInfo_FieldNumber_Photo = 10,
};

/**
 * 身份证数据
 **/
@interface IdInfo : GPBMessage

/** 身份证号 */
@property(nonatomic, readwrite, copy, null_resettable) NSString *id_p;

/** 姓名 */
@property(nonatomic, readwrite, copy, null_resettable) NSString *name;

/** 性别 */
@property(nonatomic, readwrite, copy, null_resettable) NSString *gender;

/** 民族 */
@property(nonatomic, readwrite, copy, null_resettable) NSString *national;

/** 出生日期 */
@property(nonatomic, readwrite, copy, null_resettable) NSString *birthday;

/** 地址 */
@property(nonatomic, readwrite, copy, null_resettable) NSString *address;

/** 发证机关 */
@property(nonatomic, readwrite, copy, null_resettable) NSString *signOrganization;

/** 有效期开始日期 */
@property(nonatomic, readwrite, copy, null_resettable) NSString *startDate;

/** 有效期截止日期 */
@property(nonatomic, readwrite, copy, null_resettable) NSString *endDate;

/** 身份证头像图片数据 */
@property(nonatomic, readwrite, copy, null_resettable) NSData *photo;

@end

#pragma mark - GetIdInfoResponse

typedef GPB_ENUM(GetIdInfoResponse_FieldNumber) {
  GetIdInfoResponse_FieldNumber_IdInfo = 1,
};

/**
 * 获取读卡数据流结果
 **/
@interface GetIdInfoResponse : GPBMessage

/** 身份证数据 */
@property(nonatomic, readwrite, strong, null_resettable) IdInfo *idInfo;
/** Test to see if @c idInfo has been set. */
@property(nonatomic, readwrite) BOOL hasIdInfo;

@end

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)