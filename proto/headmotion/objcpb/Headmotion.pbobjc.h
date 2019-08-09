// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: headmotion.proto

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

@class GroupInfo;
@class GroupTargetRequest;
@class GroupsTargetRequest;
@class MotionConfig;
@class Position;
@class PositionTargetRequest;
@class Target;

NS_ASSUME_NONNULL_BEGIN

#pragma mark - Enum MotionType

/** 功能类型 */
typedef GPB_ENUM(MotionType) {
  /**
   * Value used if any message's field encounters a value that is not defined
   * by this enum. The message will also have C functions to get/set the rawValue
   * of the field.
   **/
  MotionType_GPBUnrecognizedEnumeratorValue = kGPBUnrecognizedEnumeratorValue,
  /** 保留 */
  MotionType_UnknownMotionType = 0,

  /** 头部 */
  MotionType_Head = 1,
};

GPBEnumDescriptor *MotionType_EnumDescriptor(void);

/**
 * Checks to see if the given value is defined by the enum or was not known at
 * the time this source was generated.
 **/
BOOL MotionType_IsValidValue(int32_t value);

#pragma mark - HeadmotionRoot

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
@interface HeadmotionRoot : GPBRootObject
@end

#pragma mark - Position

typedef GPB_ENUM(Position_FieldNumber) {
  Position_FieldNumber_XAxis = 1,
  Position_FieldNumber_YAxis = 2,
};

/**
 * 位置坐标定义
 * 0值为默认居中
 **/
@interface Position : GPBMessage

/**
 * x轴位置
 * 正负值, 左值为负
 **/
@property(nonatomic, readwrite) int32_t xAxis;

/**
 * y轴位置
 * 正负值, 底值为负
 **/
@property(nonatomic, readwrite) int32_t yAxis;

@end

#pragma mark - MotionConfig

typedef GPB_ENUM(MotionConfig_FieldNumber) {
  MotionConfig_FieldNumber_Speed = 1,
  MotionConfig_FieldNumber_WaitMillisecond = 2,
};

/**
 * 运动配置参数定义
 **/
@interface MotionConfig : GPBMessage

/** 运动速度 */
@property(nonatomic, readwrite) uint32_t speed;

/** 移动到目标后等待时长(毫秒) */
@property(nonatomic, readwrite) uint32_t waitMillisecond;

@end

#pragma mark - Group

typedef GPB_ENUM(Group_FieldNumber) {
  Group_FieldNumber_GroupInfo = 1,
  Group_FieldNumber_TargetsArray = 2,
};

/**
 * 动作组
 **/
@interface Group : GPBMessage

/** 组信息 */
@property(nonatomic, readwrite, strong, null_resettable) GroupInfo *groupInfo;
/** Test to see if @c groupInfo has been set. */
@property(nonatomic, readwrite) BOOL hasGroupInfo;

/** 目标列表 */
@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<Target*> *targetsArray;
/** The number of items in @c targetsArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger targetsArray_Count;

@end

#pragma mark - GroupInfo

typedef GPB_ENUM(GroupInfo_FieldNumber) {
  GroupInfo_FieldNumber_Id_p = 1,
  GroupInfo_FieldNumber_Name = 2,
  GroupInfo_FieldNumber_MotionType = 3,
};

/**
 * 组信息
 **/
@interface GroupInfo : GPBMessage

/** 组id */
@property(nonatomic, readwrite, copy, null_resettable) NSString *id_p;

/** 组名 */
@property(nonatomic, readwrite, copy, null_resettable) NSString *name;

/** 功能类型 */
@property(nonatomic, readwrite) MotionType motionType;

@end

/**
 * Fetches the raw value of a @c GroupInfo's @c motionType property, even
 * if the value was not defined by the enum at the time the code was generated.
 **/
int32_t GroupInfo_MotionType_RawValue(GroupInfo *message);
/**
 * Sets the raw value of an @c GroupInfo's @c motionType property, allowing
 * it to be set to a value that was not defined by the enum at the time the code
 * was generated.
 **/
void SetGroupInfo_MotionType_RawValue(GroupInfo *message, int32_t value);

#pragma mark - Target

typedef GPB_ENUM(Target_FieldNumber) {
  Target_FieldNumber_Position = 1,
  Target_FieldNumber_MotionConfig = 2,
};

/**
 * 目标点信息
 **/
@interface Target : GPBMessage

/** 位置坐标 */
@property(nonatomic, readwrite, strong, null_resettable) Position *position;
/** Test to see if @c position has been set. */
@property(nonatomic, readwrite) BOOL hasPosition;

/** 功能类型 */
@property(nonatomic, readwrite, strong, null_resettable) MotionConfig *motionConfig;
/** Test to see if @c motionConfig has been set. */
@property(nonatomic, readwrite) BOOL hasMotionConfig;

@end

#pragma mark - GroupTargetRequest

typedef GPB_ENUM(GroupTargetRequest_FieldNumber) {
  GroupTargetRequest_FieldNumber_Id_p = 1,
  GroupTargetRequest_FieldNumber_Name = 2,
};

typedef GPB_ENUM(GroupTargetRequest_GroupIdNameOneof_OneOfCase) {
  GroupTargetRequest_GroupIdNameOneof_OneOfCase_GPBUnsetOneOfCase = 0,
  GroupTargetRequest_GroupIdNameOneof_OneOfCase_Id_p = 1,
  GroupTargetRequest_GroupIdNameOneof_OneOfCase_Name = 2,
};

/**
 * 组目标请求
 **/
@interface GroupTargetRequest : GPBMessage

@property(nonatomic, readonly) GroupTargetRequest_GroupIdNameOneof_OneOfCase groupIdNameOneofOneOfCase;

/**
 * 组id
 * GroupInfo.id
 **/
@property(nonatomic, readwrite, copy, null_resettable) NSString *id_p;

/**
 * 组名
 * GroupInfo.name
 **/
@property(nonatomic, readwrite, copy, null_resettable) NSString *name;

@end

/**
 * Clears whatever value was set for the oneof 'groupIdNameOneof'.
 **/
void GroupTargetRequest_ClearGroupIdNameOneofOneOfCase(GroupTargetRequest *message);

#pragma mark - GroupsTargetRequest

typedef GPB_ENUM(GroupsTargetRequest_FieldNumber) {
  GroupsTargetRequest_FieldNumber_GroupsArray = 1,
};

/**
 * 组目标列表请求
 **/
@interface GroupsTargetRequest : GPBMessage

/** 组目标列表 */
@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<GroupTargetRequest*> *groupsArray;
/** The number of items in @c groupsArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger groupsArray_Count;

@end

#pragma mark - PositionTargetRequest

typedef GPB_ENUM(PositionTargetRequest_FieldNumber) {
  PositionTargetRequest_FieldNumber_AbsoluteTarget = 1,
  PositionTargetRequest_FieldNumber_RelativeTarget = 2,
};

typedef GPB_ENUM(PositionTargetRequest_PositionTargetOneof_OneOfCase) {
  PositionTargetRequest_PositionTargetOneof_OneOfCase_GPBUnsetOneOfCase = 0,
  PositionTargetRequest_PositionTargetOneof_OneOfCase_AbsoluteTarget = 1,
  PositionTargetRequest_PositionTargetOneof_OneOfCase_RelativeTarget = 2,
};

/**
 * 单点目标请求
 **/
@interface PositionTargetRequest : GPBMessage

@property(nonatomic, readonly) PositionTargetRequest_PositionTargetOneof_OneOfCase positionTargetOneofOneOfCase;

/** 绝对值目标 */
@property(nonatomic, readwrite, strong, null_resettable) Target *absoluteTarget;

/** 相对当前点目标 */
@property(nonatomic, readwrite, strong, null_resettable) Target *relativeTarget;

@end

/**
 * Clears whatever value was set for the oneof 'positionTargetOneof'.
 **/
void PositionTargetRequest_ClearPositionTargetOneofOneOfCase(PositionTargetRequest *message);

#pragma mark - MoveToRequest

typedef GPB_ENUM(MoveToRequest_FieldNumber) {
  MoveToRequest_FieldNumber_MotionType = 1,
  MoveToRequest_FieldNumber_GroupsTargetRequest = 2,
  MoveToRequest_FieldNumber_PositionTargetRequest = 3,
  MoveToRequest_FieldNumber_Immediately = 4,
};

typedef GPB_ENUM(MoveToRequest_TargetRequestOneof_OneOfCase) {
  MoveToRequest_TargetRequestOneof_OneOfCase_GPBUnsetOneOfCase = 0,
  MoveToRequest_TargetRequestOneof_OneOfCase_GroupsTargetRequest = 2,
  MoveToRequest_TargetRequestOneof_OneOfCase_PositionTargetRequest = 3,
};

/**
 * 移动功能请求
 **/
@interface MoveToRequest : GPBMessage

@property(nonatomic, readwrite) MotionType motionType;

@property(nonatomic, readonly) MoveToRequest_TargetRequestOneof_OneOfCase targetRequestOneofOneOfCase;

/** 使用预设组方式 */
@property(nonatomic, readwrite, strong, null_resettable) GroupsTargetRequest *groupsTargetRequest;

/** 使用定位方式 */
@property(nonatomic, readwrite, strong, null_resettable) PositionTargetRequest *positionTargetRequest;

/**
 * 清空请求队列， 立即执行
 * 未处理完的动作列表将全部丢弃
 **/
@property(nonatomic, readwrite) BOOL immediately;

@end

/**
 * Fetches the raw value of a @c MoveToRequest's @c motionType property, even
 * if the value was not defined by the enum at the time the code was generated.
 **/
int32_t MoveToRequest_MotionType_RawValue(MoveToRequest *message);
/**
 * Sets the raw value of an @c MoveToRequest's @c motionType property, allowing
 * it to be set to a value that was not defined by the enum at the time the code
 * was generated.
 **/
void SetMoveToRequest_MotionType_RawValue(MoveToRequest *message, int32_t value);

/**
 * Clears whatever value was set for the oneof 'targetRequestOneof'.
 **/
void MoveToRequest_ClearTargetRequestOneofOneOfCase(MoveToRequest *message);

#pragma mark - MoveToResponse

/**
 * 移动功能结果
 **/
@interface MoveToResponse : GPBMessage

@end

#pragma mark - GetPositionRequest

typedef GPB_ENUM(GetPositionRequest_FieldNumber) {
  GetPositionRequest_FieldNumber_MotionType = 1,
};

/**
 * 获取当前位置信息请求
 **/
@interface GetPositionRequest : GPBMessage

@property(nonatomic, readwrite) MotionType motionType;

@end

/**
 * Fetches the raw value of a @c GetPositionRequest's @c motionType property, even
 * if the value was not defined by the enum at the time the code was generated.
 **/
int32_t GetPositionRequest_MotionType_RawValue(GetPositionRequest *message);
/**
 * Sets the raw value of an @c GetPositionRequest's @c motionType property, allowing
 * it to be set to a value that was not defined by the enum at the time the code
 * was generated.
 **/
void SetGetPositionRequest_MotionType_RawValue(GetPositionRequest *message, int32_t value);

#pragma mark - GetPositionResponse

typedef GPB_ENUM(GetPositionResponse_FieldNumber) {
  GetPositionResponse_FieldNumber_MotionType = 1,
  GetPositionResponse_FieldNumber_Position = 2,
};

/**
 * 获取当前位置信息结果
 **/
@interface GetPositionResponse : GPBMessage

/** 功能类型 */
@property(nonatomic, readwrite) MotionType motionType;

/** 位置坐标 */
@property(nonatomic, readwrite, strong, null_resettable) Position *position;
/** Test to see if @c position has been set. */
@property(nonatomic, readwrite) BOOL hasPosition;

@end

/**
 * Fetches the raw value of a @c GetPositionResponse's @c motionType property, even
 * if the value was not defined by the enum at the time the code was generated.
 **/
int32_t GetPositionResponse_MotionType_RawValue(GetPositionResponse *message);
/**
 * Sets the raw value of an @c GetPositionResponse's @c motionType property, allowing
 * it to be set to a value that was not defined by the enum at the time the code
 * was generated.
 **/
void SetGetPositionResponse_MotionType_RawValue(GetPositionResponse *message, int32_t value);

#pragma mark - PositioningDataRequest

typedef GPB_ENUM(PositioningDataRequest_FieldNumber) {
  PositioningDataRequest_FieldNumber_MotionType = 1,
  PositioningDataRequest_FieldNumber_Disability = 2,
};

/**
 * 持续监听位置消息请求
 **/
@interface PositioningDataRequest : GPBMessage

/** 功能类型 */
@property(nonatomic, readwrite) MotionType motionType;

/**
 * 设备是否失能
 * 需使用手动控制运动功能时启用
 * 服务断开后将自动使能
 **/
@property(nonatomic, readwrite) BOOL disability;

@end

/**
 * Fetches the raw value of a @c PositioningDataRequest's @c motionType property, even
 * if the value was not defined by the enum at the time the code was generated.
 **/
int32_t PositioningDataRequest_MotionType_RawValue(PositioningDataRequest *message);
/**
 * Sets the raw value of an @c PositioningDataRequest's @c motionType property, allowing
 * it to be set to a value that was not defined by the enum at the time the code
 * was generated.
 **/
void SetPositioningDataRequest_MotionType_RawValue(PositioningDataRequest *message, int32_t value);

#pragma mark - PositioningDataResponse

typedef GPB_ENUM(PositioningDataResponse_FieldNumber) {
  PositioningDataResponse_FieldNumber_MotionType = 1,
  PositioningDataResponse_FieldNumber_Position = 2,
};

/**
 * 持续监听位置消息结果
 **/
@interface PositioningDataResponse : GPBMessage

/** 功能类型 */
@property(nonatomic, readwrite) MotionType motionType;

/** 位置坐标 */
@property(nonatomic, readwrite, strong, null_resettable) Position *position;
/** Test to see if @c position has been set. */
@property(nonatomic, readwrite) BOOL hasPosition;

@end

/**
 * Fetches the raw value of a @c PositioningDataResponse's @c motionType property, even
 * if the value was not defined by the enum at the time the code was generated.
 **/
int32_t PositioningDataResponse_MotionType_RawValue(PositioningDataResponse *message);
/**
 * Sets the raw value of an @c PositioningDataResponse's @c motionType property, allowing
 * it to be set to a value that was not defined by the enum at the time the code
 * was generated.
 **/
void SetPositioningDataResponse_MotionType_RawValue(PositioningDataResponse *message, int32_t value);

#pragma mark - NewGroupRequest

typedef GPB_ENUM(NewGroupRequest_FieldNumber) {
  NewGroupRequest_FieldNumber_MotionType = 1,
  NewGroupRequest_FieldNumber_Name = 2,
};

/**
 * 创建组请求
 **/
@interface NewGroupRequest : GPBMessage

/** 功能类型 */
@property(nonatomic, readwrite) MotionType motionType;

/** 组名 */
@property(nonatomic, readwrite, copy, null_resettable) NSString *name;

@end

/**
 * Fetches the raw value of a @c NewGroupRequest's @c motionType property, even
 * if the value was not defined by the enum at the time the code was generated.
 **/
int32_t NewGroupRequest_MotionType_RawValue(NewGroupRequest *message);
/**
 * Sets the raw value of an @c NewGroupRequest's @c motionType property, allowing
 * it to be set to a value that was not defined by the enum at the time the code
 * was generated.
 **/
void SetNewGroupRequest_MotionType_RawValue(NewGroupRequest *message, int32_t value);

#pragma mark - NewGroupResponse

typedef GPB_ENUM(NewGroupResponse_FieldNumber) {
  NewGroupResponse_FieldNumber_GroupInfo = 1,
};

/**
 * 创建组结果
 **/
@interface NewGroupResponse : GPBMessage

/** 组信息 */
@property(nonatomic, readwrite, strong, null_resettable) GroupInfo *groupInfo;
/** Test to see if @c groupInfo has been set. */
@property(nonatomic, readwrite) BOOL hasGroupInfo;

@end

#pragma mark - ListGroupsRequest

typedef GPB_ENUM(ListGroupsRequest_FieldNumber) {
  ListGroupsRequest_FieldNumber_MotionType = 1,
};

/**
 * 获取组列表请求
 **/
@interface ListGroupsRequest : GPBMessage

/** 功能类型 */
@property(nonatomic, readwrite) MotionType motionType;

@end

/**
 * Fetches the raw value of a @c ListGroupsRequest's @c motionType property, even
 * if the value was not defined by the enum at the time the code was generated.
 **/
int32_t ListGroupsRequest_MotionType_RawValue(ListGroupsRequest *message);
/**
 * Sets the raw value of an @c ListGroupsRequest's @c motionType property, allowing
 * it to be set to a value that was not defined by the enum at the time the code
 * was generated.
 **/
void SetListGroupsRequest_MotionType_RawValue(ListGroupsRequest *message, int32_t value);

#pragma mark - ListGroupsResponse

typedef GPB_ENUM(ListGroupsResponse_FieldNumber) {
  ListGroupsResponse_FieldNumber_GroupsInfoArray = 1,
};

/**
 * 获取组列表结果
 **/
@interface ListGroupsResponse : GPBMessage

/** 组信息列表 */
@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<GroupInfo*> *groupsInfoArray;
/** The number of items in @c groupsInfoArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger groupsInfoArray_Count;

@end

#pragma mark - UpdateGroupRequest

typedef GPB_ENUM(UpdateGroupRequest_FieldNumber) {
  UpdateGroupRequest_FieldNumber_Id_p = 1,
  UpdateGroupRequest_FieldNumber_Name = 2,
};

/**
 * 更新组信息请求
 **/
@interface UpdateGroupRequest : GPBMessage

/** 组id */
@property(nonatomic, readwrite, copy, null_resettable) NSString *id_p;

/** 组名 */
@property(nonatomic, readwrite, copy, null_resettable) NSString *name;

@end

#pragma mark - UpdateGroupResponse

/**
 * 更新组信息结果
 **/
@interface UpdateGroupResponse : GPBMessage

@end

#pragma mark - DeleteGroupsRequest

typedef GPB_ENUM(DeleteGroupsRequest_FieldNumber) {
  DeleteGroupsRequest_FieldNumber_GroupsIdArray = 1,
};

/**
 * 删除组列表请求
 **/
@interface DeleteGroupsRequest : GPBMessage

/** 组id列表 */
@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<NSString*> *groupsIdArray;
/** The number of items in @c groupsIdArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger groupsIdArray_Count;

@end

#pragma mark - DeleteGroupsResponse

/**
 * 删除组列表结果
 **/
@interface DeleteGroupsResponse : GPBMessage

@end

#pragma mark - ListGroupTargetsRequest

typedef GPB_ENUM(ListGroupTargetsRequest_FieldNumber) {
  ListGroupTargetsRequest_FieldNumber_GroupId = 1,
};

/**
 * 获取组动作点列表请求
 **/
@interface ListGroupTargetsRequest : GPBMessage

/** 组id */
@property(nonatomic, readwrite, copy, null_resettable) NSString *groupId;

@end

#pragma mark - ListGroupTargetsResponse

typedef GPB_ENUM(ListGroupTargetsResponse_FieldNumber) {
  ListGroupTargetsResponse_FieldNumber_TargetsArray = 1,
};

/**
 * 获取组动作点列表结果
 **/
@interface ListGroupTargetsResponse : GPBMessage

/** 目标点列表 */
@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<Target*> *targetsArray;
/** The number of items in @c targetsArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger targetsArray_Count;

@end

#pragma mark - UpdateGroupTargetsRequest

typedef GPB_ENUM(UpdateGroupTargetsRequest_FieldNumber) {
  UpdateGroupTargetsRequest_FieldNumber_GroupId = 1,
  UpdateGroupTargetsRequest_FieldNumber_TargetsArray = 2,
};

/**
 * 更新组动作点列表请求
 **/
@interface UpdateGroupTargetsRequest : GPBMessage

/** 组id */
@property(nonatomic, readwrite, copy, null_resettable) NSString *groupId;

/** 目标点列表 */
@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<Target*> *targetsArray;
/** The number of items in @c targetsArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger targetsArray_Count;

@end

#pragma mark - UpdateGroupTargetsResponse

/**
 * 更新组动作点列表结果
 **/
@interface UpdateGroupTargetsResponse : GPBMessage

@end

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)
