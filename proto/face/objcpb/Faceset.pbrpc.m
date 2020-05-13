#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import "Faceset.pbrpc.h"
#import "Faceset.pbobjc.h"
#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriter+Immediate.h>

#import "google/api/Annotations.pbobjc.h"

@implementation FaceSetService

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-designated-initializers"

// Designated initializer
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [super initWithHost:host
                 packageName:@"faceRecognition"
                 serviceName:@"FaceSetService"
                 callOptions:callOptions];
}

- (instancetype)initWithHost:(NSString *)host {
  return [super initWithHost:host
                 packageName:@"faceRecognition"
                 serviceName:@"FaceSetService"];
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

#pragma mark NewFaceSet(NewFaceSetRequest) returns (NewFaceSetResponse)

// Deprecated methods.
/**
 * NewFaceSet创建一个FaceSet
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)newFaceSetWithRequest:(NewFaceSetRequest *)request handler:(void(^)(NewFaceSetResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToNewFaceSetWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * NewFaceSet创建一个FaceSet
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToNewFaceSetWithRequest:(NewFaceSetRequest *)request handler:(void(^)(NewFaceSetResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"NewFaceSet"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[NewFaceSetResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * NewFaceSet创建一个FaceSet
 */
- (GRPCUnaryProtoCall *)newFaceSetWithMessage:(NewFaceSetRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"NewFaceSet"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[NewFaceSetResponse class]];
}

#pragma mark DeleteFaceSet(DeleteFaceSetRequest) returns (DeleteFaceSetResponse)

// Deprecated methods.
/**
 * DeleteFaceSet删除一个FaceSet
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)deleteFaceSetWithRequest:(DeleteFaceSetRequest *)request handler:(void(^)(DeleteFaceSetResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToDeleteFaceSetWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * DeleteFaceSet删除一个FaceSet
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToDeleteFaceSetWithRequest:(DeleteFaceSetRequest *)request handler:(void(^)(DeleteFaceSetResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"DeleteFaceSet"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[DeleteFaceSetResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * DeleteFaceSet删除一个FaceSet
 */
- (GRPCUnaryProtoCall *)deleteFaceSetWithMessage:(DeleteFaceSetRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"DeleteFaceSet"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[DeleteFaceSetResponse class]];
}

#pragma mark UpdateFaceSet(UpdateFaceSetRequest) returns (UpdateFaceSetResponse)

// Deprecated methods.
/**
 * UpdateFaceSet更新一个FaceSet基础信息
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)updateFaceSetWithRequest:(UpdateFaceSetRequest *)request handler:(void(^)(UpdateFaceSetResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToUpdateFaceSetWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * UpdateFaceSet更新一个FaceSet基础信息
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToUpdateFaceSetWithRequest:(UpdateFaceSetRequest *)request handler:(void(^)(UpdateFaceSetResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"UpdateFaceSet"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[UpdateFaceSetResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * UpdateFaceSet更新一个FaceSet基础信息
 */
- (GRPCUnaryProtoCall *)updateFaceSetWithMessage:(UpdateFaceSetRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"UpdateFaceSet"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[UpdateFaceSetResponse class]];
}

#pragma mark ListFaceSets(ListFaceSetsRequest) returns (ListFaceSetsResponse)

// Deprecated methods.
/**
 * ListFaceSets列举所有FaceSets
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listFaceSetsWithRequest:(ListFaceSetsRequest *)request handler:(void(^)(ListFaceSetsResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToListFaceSetsWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * ListFaceSets列举所有FaceSets
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListFaceSetsWithRequest:(ListFaceSetsRequest *)request handler:(void(^)(ListFaceSetsResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"ListFaceSets"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[ListFaceSetsResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * ListFaceSets列举所有FaceSets
 */
- (GRPCUnaryProtoCall *)listFaceSetsWithMessage:(ListFaceSetsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"ListFaceSets"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[ListFaceSetsResponse class]];
}

#pragma mark AddFace(AddFaceRequest) returns (AddFaceResponse)

// Deprecated methods.
/**
 * AddFace将识别一张人脸图片并将结果添加至对应FaceSet中
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)addFaceWithRequest:(AddFaceRequest *)request handler:(void(^)(AddFaceResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToAddFaceWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * AddFace将识别一张人脸图片并将结果添加至对应FaceSet中
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToAddFaceWithRequest:(AddFaceRequest *)request handler:(void(^)(AddFaceResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"AddFace"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[AddFaceResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * AddFace将识别一张人脸图片并将结果添加至对应FaceSet中
 */
- (GRPCUnaryProtoCall *)addFaceWithMessage:(AddFaceRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"AddFace"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[AddFaceResponse class]];
}

#pragma mark RemoveFace(RemoveFaceRequest) returns (RemoveFaceResponse)

// Deprecated methods.
/**
 * RemoveFace将从FaceSet中移除对应FaceToken
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)removeFaceWithRequest:(RemoveFaceRequest *)request handler:(void(^)(RemoveFaceResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToRemoveFaceWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * RemoveFace将从FaceSet中移除对应FaceToken
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToRemoveFaceWithRequest:(RemoveFaceRequest *)request handler:(void(^)(RemoveFaceResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"RemoveFace"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[RemoveFaceResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * RemoveFace将从FaceSet中移除对应FaceToken
 */
- (GRPCUnaryProtoCall *)removeFaceWithMessage:(RemoveFaceRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"RemoveFace"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[RemoveFaceResponse class]];
}

#pragma mark FaceDetail(FaceDetailRequest) returns (FaceDetailResponse)

// Deprecated methods.
/**
 * FaceDetail通过face_token获取对应的FaceDetail
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)faceDetailWithRequest:(FaceDetailRequest *)request handler:(void(^)(FaceDetailResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToFaceDetailWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * FaceDetail通过face_token获取对应的FaceDetail
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToFaceDetailWithRequest:(FaceDetailRequest *)request handler:(void(^)(FaceDetailResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"FaceDetail"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[FaceDetailResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * FaceDetail通过face_token获取对应的FaceDetail
 */
- (GRPCUnaryProtoCall *)faceDetailWithMessage:(FaceDetailRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"FaceDetail"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[FaceDetailResponse class]];
}

#pragma mark ListFaceDetails(ListFaceDetailsRequest) returns (ListFaceDetailsResponse)

// Deprecated methods.
/**
 * ListFaceDetails返回指定FaceSet中的FaceDetails
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listFaceDetailsWithRequest:(ListFaceDetailsRequest *)request handler:(void(^)(ListFaceDetailsResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCToListFaceDetailsWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
/**
 * ListFaceDetails返回指定FaceSet中的FaceDetails
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListFaceDetailsWithRequest:(ListFaceDetailsRequest *)request handler:(void(^)(ListFaceDetailsResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"ListFaceDetails"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[ListFaceDetailsResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
/**
 * ListFaceDetails返回指定FaceSet中的FaceDetails
 */
- (GRPCUnaryProtoCall *)listFaceDetailsWithMessage:(ListFaceDetailsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"ListFaceDetails"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[ListFaceDetailsResponse class]];
}

@end
#endif
