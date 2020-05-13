#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
#import "Faceset.pbobjc.h"
#endif

#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import <ProtoRPC/ProtoService.h>
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriteable.h>
#import <RxLibrary/GRXWriter.h>
#endif

@class AddFaceRequest;
@class AddFaceResponse;
@class DeleteFaceSetRequest;
@class DeleteFaceSetResponse;
@class FaceDetailRequest;
@class FaceDetailResponse;
@class ListFaceDetailsRequest;
@class ListFaceDetailsResponse;
@class ListFaceSetsRequest;
@class ListFaceSetsResponse;
@class NewFaceSetRequest;
@class NewFaceSetResponse;
@class RemoveFaceRequest;
@class RemoveFaceResponse;
@class UpdateFaceSetRequest;
@class UpdateFaceSetResponse;

#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
  #import "google/api/Annotations.pbobjc.h"
#endif

@class GRPCProtoCall;
@class GRPCUnaryProtoCall;
@class GRPCStreamingProtoCall;
@class GRPCCallOptions;
@protocol GRPCProtoResponseHandler;


NS_ASSUME_NONNULL_BEGIN

@protocol FaceSetService2 <NSObject>

#pragma mark NewFaceSet(NewFaceSetRequest) returns (NewFaceSetResponse)

/**
 * NewFaceSet创建一个FaceSet
 */
- (GRPCUnaryProtoCall *)newFaceSetWithMessage:(NewFaceSetRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark DeleteFaceSet(DeleteFaceSetRequest) returns (DeleteFaceSetResponse)

/**
 * DeleteFaceSet删除一个FaceSet
 */
- (GRPCUnaryProtoCall *)deleteFaceSetWithMessage:(DeleteFaceSetRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark UpdateFaceSet(UpdateFaceSetRequest) returns (UpdateFaceSetResponse)

/**
 * UpdateFaceSet更新一个FaceSet基础信息
 */
- (GRPCUnaryProtoCall *)updateFaceSetWithMessage:(UpdateFaceSetRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark ListFaceSets(ListFaceSetsRequest) returns (ListFaceSetsResponse)

/**
 * ListFaceSets列举所有FaceSets
 */
- (GRPCUnaryProtoCall *)listFaceSetsWithMessage:(ListFaceSetsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark AddFace(AddFaceRequest) returns (AddFaceResponse)

/**
 * AddFace将识别一张人脸图片并将结果添加至对应FaceSet中
 */
- (GRPCUnaryProtoCall *)addFaceWithMessage:(AddFaceRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark RemoveFace(RemoveFaceRequest) returns (RemoveFaceResponse)

/**
 * RemoveFace将从FaceSet中移除对应FaceToken
 */
- (GRPCUnaryProtoCall *)removeFaceWithMessage:(RemoveFaceRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark FaceDetail(FaceDetailRequest) returns (FaceDetailResponse)

/**
 * FaceDetail通过face_token获取对应的FaceDetail
 */
- (GRPCUnaryProtoCall *)faceDetailWithMessage:(FaceDetailRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark ListFaceDetails(ListFaceDetailsRequest) returns (ListFaceDetailsResponse)

/**
 * ListFaceDetails返回指定FaceSet中的FaceDetails
 */
- (GRPCUnaryProtoCall *)listFaceDetailsWithMessage:(ListFaceDetailsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

@end

/**
 * The methods in this protocol belong to a set of old APIs that have been deprecated. They do not
 * recognize call options provided in the initializer. Using the v2 protocol is recommended.
 */
@protocol FaceSetService <NSObject>

#pragma mark NewFaceSet(NewFaceSetRequest) returns (NewFaceSetResponse)

/**
 * NewFaceSet创建一个FaceSet
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)newFaceSetWithRequest:(NewFaceSetRequest *)request handler:(void(^)(NewFaceSetResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * NewFaceSet创建一个FaceSet
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToNewFaceSetWithRequest:(NewFaceSetRequest *)request handler:(void(^)(NewFaceSetResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark DeleteFaceSet(DeleteFaceSetRequest) returns (DeleteFaceSetResponse)

/**
 * DeleteFaceSet删除一个FaceSet
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)deleteFaceSetWithRequest:(DeleteFaceSetRequest *)request handler:(void(^)(DeleteFaceSetResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * DeleteFaceSet删除一个FaceSet
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToDeleteFaceSetWithRequest:(DeleteFaceSetRequest *)request handler:(void(^)(DeleteFaceSetResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark UpdateFaceSet(UpdateFaceSetRequest) returns (UpdateFaceSetResponse)

/**
 * UpdateFaceSet更新一个FaceSet基础信息
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)updateFaceSetWithRequest:(UpdateFaceSetRequest *)request handler:(void(^)(UpdateFaceSetResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * UpdateFaceSet更新一个FaceSet基础信息
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToUpdateFaceSetWithRequest:(UpdateFaceSetRequest *)request handler:(void(^)(UpdateFaceSetResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark ListFaceSets(ListFaceSetsRequest) returns (ListFaceSetsResponse)

/**
 * ListFaceSets列举所有FaceSets
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listFaceSetsWithRequest:(ListFaceSetsRequest *)request handler:(void(^)(ListFaceSetsResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * ListFaceSets列举所有FaceSets
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListFaceSetsWithRequest:(ListFaceSetsRequest *)request handler:(void(^)(ListFaceSetsResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark AddFace(AddFaceRequest) returns (AddFaceResponse)

/**
 * AddFace将识别一张人脸图片并将结果添加至对应FaceSet中
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)addFaceWithRequest:(AddFaceRequest *)request handler:(void(^)(AddFaceResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * AddFace将识别一张人脸图片并将结果添加至对应FaceSet中
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToAddFaceWithRequest:(AddFaceRequest *)request handler:(void(^)(AddFaceResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark RemoveFace(RemoveFaceRequest) returns (RemoveFaceResponse)

/**
 * RemoveFace将从FaceSet中移除对应FaceToken
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)removeFaceWithRequest:(RemoveFaceRequest *)request handler:(void(^)(RemoveFaceResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * RemoveFace将从FaceSet中移除对应FaceToken
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToRemoveFaceWithRequest:(RemoveFaceRequest *)request handler:(void(^)(RemoveFaceResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark FaceDetail(FaceDetailRequest) returns (FaceDetailResponse)

/**
 * FaceDetail通过face_token获取对应的FaceDetail
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)faceDetailWithRequest:(FaceDetailRequest *)request handler:(void(^)(FaceDetailResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * FaceDetail通过face_token获取对应的FaceDetail
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToFaceDetailWithRequest:(FaceDetailRequest *)request handler:(void(^)(FaceDetailResponse *_Nullable response, NSError *_Nullable error))handler;


#pragma mark ListFaceDetails(ListFaceDetailsRequest) returns (ListFaceDetailsResponse)

/**
 * ListFaceDetails返回指定FaceSet中的FaceDetails
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listFaceDetailsWithRequest:(ListFaceDetailsRequest *)request handler:(void(^)(ListFaceDetailsResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * ListFaceDetails返回指定FaceSet中的FaceDetails
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListFaceDetailsWithRequest:(ListFaceDetailsRequest *)request handler:(void(^)(ListFaceDetailsResponse *_Nullable response, NSError *_Nullable error))handler;


@end


#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
/**
 * Basic service implementation, over gRPC, that only does
 * marshalling and parsing.
 */
@interface FaceSetService : GRPCProtoService<FaceSetService, FaceSetService2>
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions NS_DESIGNATED_INITIALIZER;
+ (instancetype)serviceWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions;
// The following methods belong to a set of old APIs that have been deprecated.
- (instancetype)initWithHost:(NSString *)host;
+ (instancetype)serviceWithHost:(NSString *)host;
@end
#endif

NS_ASSUME_NONNULL_END

