package faceRecognition;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.2-SNAPSHOT)",
    comments = "Source: faceset.proto")
public final class FaceSetServiceGrpc {

  private FaceSetServiceGrpc() {}

  public static final String SERVICE_NAME = "faceRecognition.FaceSetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<faceRecognition.FaceSetPb.NewFaceSetRequest,
      faceRecognition.FaceSetPb.NewFaceSetResponse> getNewFaceSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewFaceSet",
      requestType = faceRecognition.FaceSetPb.NewFaceSetRequest.class,
      responseType = faceRecognition.FaceSetPb.NewFaceSetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<faceRecognition.FaceSetPb.NewFaceSetRequest,
      faceRecognition.FaceSetPb.NewFaceSetResponse> getNewFaceSetMethod() {
    io.grpc.MethodDescriptor<faceRecognition.FaceSetPb.NewFaceSetRequest, faceRecognition.FaceSetPb.NewFaceSetResponse> getNewFaceSetMethod;
    if ((getNewFaceSetMethod = FaceSetServiceGrpc.getNewFaceSetMethod) == null) {
      synchronized (FaceSetServiceGrpc.class) {
        if ((getNewFaceSetMethod = FaceSetServiceGrpc.getNewFaceSetMethod) == null) {
          FaceSetServiceGrpc.getNewFaceSetMethod = getNewFaceSetMethod = 
              io.grpc.MethodDescriptor.<faceRecognition.FaceSetPb.NewFaceSetRequest, faceRecognition.FaceSetPb.NewFaceSetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "faceRecognition.FaceSetService", "NewFaceSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  faceRecognition.FaceSetPb.NewFaceSetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  faceRecognition.FaceSetPb.NewFaceSetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FaceSetServiceMethodDescriptorSupplier("NewFaceSet"))
                  .build();
          }
        }
     }
     return getNewFaceSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<faceRecognition.FaceSetPb.DeleteFaceSetRequest,
      faceRecognition.FaceSetPb.DeleteFaceSetResponse> getDeleteFaceSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFaceSet",
      requestType = faceRecognition.FaceSetPb.DeleteFaceSetRequest.class,
      responseType = faceRecognition.FaceSetPb.DeleteFaceSetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<faceRecognition.FaceSetPb.DeleteFaceSetRequest,
      faceRecognition.FaceSetPb.DeleteFaceSetResponse> getDeleteFaceSetMethod() {
    io.grpc.MethodDescriptor<faceRecognition.FaceSetPb.DeleteFaceSetRequest, faceRecognition.FaceSetPb.DeleteFaceSetResponse> getDeleteFaceSetMethod;
    if ((getDeleteFaceSetMethod = FaceSetServiceGrpc.getDeleteFaceSetMethod) == null) {
      synchronized (FaceSetServiceGrpc.class) {
        if ((getDeleteFaceSetMethod = FaceSetServiceGrpc.getDeleteFaceSetMethod) == null) {
          FaceSetServiceGrpc.getDeleteFaceSetMethod = getDeleteFaceSetMethod = 
              io.grpc.MethodDescriptor.<faceRecognition.FaceSetPb.DeleteFaceSetRequest, faceRecognition.FaceSetPb.DeleteFaceSetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "faceRecognition.FaceSetService", "DeleteFaceSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  faceRecognition.FaceSetPb.DeleteFaceSetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  faceRecognition.FaceSetPb.DeleteFaceSetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FaceSetServiceMethodDescriptorSupplier("DeleteFaceSet"))
                  .build();
          }
        }
     }
     return getDeleteFaceSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<faceRecognition.FaceSetPb.UpdateFaceSetRequest,
      faceRecognition.FaceSetPb.UpdateFaceSetResponse> getUpdateFaceSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFaceSet",
      requestType = faceRecognition.FaceSetPb.UpdateFaceSetRequest.class,
      responseType = faceRecognition.FaceSetPb.UpdateFaceSetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<faceRecognition.FaceSetPb.UpdateFaceSetRequest,
      faceRecognition.FaceSetPb.UpdateFaceSetResponse> getUpdateFaceSetMethod() {
    io.grpc.MethodDescriptor<faceRecognition.FaceSetPb.UpdateFaceSetRequest, faceRecognition.FaceSetPb.UpdateFaceSetResponse> getUpdateFaceSetMethod;
    if ((getUpdateFaceSetMethod = FaceSetServiceGrpc.getUpdateFaceSetMethod) == null) {
      synchronized (FaceSetServiceGrpc.class) {
        if ((getUpdateFaceSetMethod = FaceSetServiceGrpc.getUpdateFaceSetMethod) == null) {
          FaceSetServiceGrpc.getUpdateFaceSetMethod = getUpdateFaceSetMethod = 
              io.grpc.MethodDescriptor.<faceRecognition.FaceSetPb.UpdateFaceSetRequest, faceRecognition.FaceSetPb.UpdateFaceSetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "faceRecognition.FaceSetService", "UpdateFaceSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  faceRecognition.FaceSetPb.UpdateFaceSetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  faceRecognition.FaceSetPb.UpdateFaceSetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FaceSetServiceMethodDescriptorSupplier("UpdateFaceSet"))
                  .build();
          }
        }
     }
     return getUpdateFaceSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<faceRecognition.FaceSetPb.ListFaceSetsRequest,
      faceRecognition.FaceSetPb.ListFaceSetsResponse> getListFaceSetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFaceSets",
      requestType = faceRecognition.FaceSetPb.ListFaceSetsRequest.class,
      responseType = faceRecognition.FaceSetPb.ListFaceSetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<faceRecognition.FaceSetPb.ListFaceSetsRequest,
      faceRecognition.FaceSetPb.ListFaceSetsResponse> getListFaceSetsMethod() {
    io.grpc.MethodDescriptor<faceRecognition.FaceSetPb.ListFaceSetsRequest, faceRecognition.FaceSetPb.ListFaceSetsResponse> getListFaceSetsMethod;
    if ((getListFaceSetsMethod = FaceSetServiceGrpc.getListFaceSetsMethod) == null) {
      synchronized (FaceSetServiceGrpc.class) {
        if ((getListFaceSetsMethod = FaceSetServiceGrpc.getListFaceSetsMethod) == null) {
          FaceSetServiceGrpc.getListFaceSetsMethod = getListFaceSetsMethod = 
              io.grpc.MethodDescriptor.<faceRecognition.FaceSetPb.ListFaceSetsRequest, faceRecognition.FaceSetPb.ListFaceSetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "faceRecognition.FaceSetService", "ListFaceSets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  faceRecognition.FaceSetPb.ListFaceSetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  faceRecognition.FaceSetPb.ListFaceSetsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FaceSetServiceMethodDescriptorSupplier("ListFaceSets"))
                  .build();
          }
        }
     }
     return getListFaceSetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<faceRecognition.FaceSetPb.AddFaceRequest,
      faceRecognition.FaceSetPb.AddFaceResponse> getAddFaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddFace",
      requestType = faceRecognition.FaceSetPb.AddFaceRequest.class,
      responseType = faceRecognition.FaceSetPb.AddFaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<faceRecognition.FaceSetPb.AddFaceRequest,
      faceRecognition.FaceSetPb.AddFaceResponse> getAddFaceMethod() {
    io.grpc.MethodDescriptor<faceRecognition.FaceSetPb.AddFaceRequest, faceRecognition.FaceSetPb.AddFaceResponse> getAddFaceMethod;
    if ((getAddFaceMethod = FaceSetServiceGrpc.getAddFaceMethod) == null) {
      synchronized (FaceSetServiceGrpc.class) {
        if ((getAddFaceMethod = FaceSetServiceGrpc.getAddFaceMethod) == null) {
          FaceSetServiceGrpc.getAddFaceMethod = getAddFaceMethod = 
              io.grpc.MethodDescriptor.<faceRecognition.FaceSetPb.AddFaceRequest, faceRecognition.FaceSetPb.AddFaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "faceRecognition.FaceSetService", "AddFace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  faceRecognition.FaceSetPb.AddFaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  faceRecognition.FaceSetPb.AddFaceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FaceSetServiceMethodDescriptorSupplier("AddFace"))
                  .build();
          }
        }
     }
     return getAddFaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<faceRecognition.FaceSetPb.RemoveFaceRequest,
      faceRecognition.FaceSetPb.RemoveFaceResponse> getRemoveFaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveFace",
      requestType = faceRecognition.FaceSetPb.RemoveFaceRequest.class,
      responseType = faceRecognition.FaceSetPb.RemoveFaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<faceRecognition.FaceSetPb.RemoveFaceRequest,
      faceRecognition.FaceSetPb.RemoveFaceResponse> getRemoveFaceMethod() {
    io.grpc.MethodDescriptor<faceRecognition.FaceSetPb.RemoveFaceRequest, faceRecognition.FaceSetPb.RemoveFaceResponse> getRemoveFaceMethod;
    if ((getRemoveFaceMethod = FaceSetServiceGrpc.getRemoveFaceMethod) == null) {
      synchronized (FaceSetServiceGrpc.class) {
        if ((getRemoveFaceMethod = FaceSetServiceGrpc.getRemoveFaceMethod) == null) {
          FaceSetServiceGrpc.getRemoveFaceMethod = getRemoveFaceMethod = 
              io.grpc.MethodDescriptor.<faceRecognition.FaceSetPb.RemoveFaceRequest, faceRecognition.FaceSetPb.RemoveFaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "faceRecognition.FaceSetService", "RemoveFace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  faceRecognition.FaceSetPb.RemoveFaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  faceRecognition.FaceSetPb.RemoveFaceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FaceSetServiceMethodDescriptorSupplier("RemoveFace"))
                  .build();
          }
        }
     }
     return getRemoveFaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<faceRecognition.FaceSetPb.FaceDetailRequest,
      faceRecognition.FaceSetPb.FaceDetailResponse> getFaceDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FaceDetail",
      requestType = faceRecognition.FaceSetPb.FaceDetailRequest.class,
      responseType = faceRecognition.FaceSetPb.FaceDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<faceRecognition.FaceSetPb.FaceDetailRequest,
      faceRecognition.FaceSetPb.FaceDetailResponse> getFaceDetailMethod() {
    io.grpc.MethodDescriptor<faceRecognition.FaceSetPb.FaceDetailRequest, faceRecognition.FaceSetPb.FaceDetailResponse> getFaceDetailMethod;
    if ((getFaceDetailMethod = FaceSetServiceGrpc.getFaceDetailMethod) == null) {
      synchronized (FaceSetServiceGrpc.class) {
        if ((getFaceDetailMethod = FaceSetServiceGrpc.getFaceDetailMethod) == null) {
          FaceSetServiceGrpc.getFaceDetailMethod = getFaceDetailMethod = 
              io.grpc.MethodDescriptor.<faceRecognition.FaceSetPb.FaceDetailRequest, faceRecognition.FaceSetPb.FaceDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "faceRecognition.FaceSetService", "FaceDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  faceRecognition.FaceSetPb.FaceDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  faceRecognition.FaceSetPb.FaceDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FaceSetServiceMethodDescriptorSupplier("FaceDetail"))
                  .build();
          }
        }
     }
     return getFaceDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<faceRecognition.FaceSetPb.ListFaceDetailsRequest,
      faceRecognition.FaceSetPb.ListFaceDetailsResponse> getListFaceDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFaceDetails",
      requestType = faceRecognition.FaceSetPb.ListFaceDetailsRequest.class,
      responseType = faceRecognition.FaceSetPb.ListFaceDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<faceRecognition.FaceSetPb.ListFaceDetailsRequest,
      faceRecognition.FaceSetPb.ListFaceDetailsResponse> getListFaceDetailsMethod() {
    io.grpc.MethodDescriptor<faceRecognition.FaceSetPb.ListFaceDetailsRequest, faceRecognition.FaceSetPb.ListFaceDetailsResponse> getListFaceDetailsMethod;
    if ((getListFaceDetailsMethod = FaceSetServiceGrpc.getListFaceDetailsMethod) == null) {
      synchronized (FaceSetServiceGrpc.class) {
        if ((getListFaceDetailsMethod = FaceSetServiceGrpc.getListFaceDetailsMethod) == null) {
          FaceSetServiceGrpc.getListFaceDetailsMethod = getListFaceDetailsMethod = 
              io.grpc.MethodDescriptor.<faceRecognition.FaceSetPb.ListFaceDetailsRequest, faceRecognition.FaceSetPb.ListFaceDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "faceRecognition.FaceSetService", "ListFaceDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  faceRecognition.FaceSetPb.ListFaceDetailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  faceRecognition.FaceSetPb.ListFaceDetailsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FaceSetServiceMethodDescriptorSupplier("ListFaceDetails"))
                  .build();
          }
        }
     }
     return getListFaceDetailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FaceSetServiceStub newStub(io.grpc.Channel channel) {
    return new FaceSetServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FaceSetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FaceSetServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FaceSetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FaceSetServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class FaceSetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * NewFaceSet创建一个FaceSet
     * </pre>
     */
    public void newFaceSet(faceRecognition.FaceSetPb.NewFaceSetRequest request,
        io.grpc.stub.StreamObserver<faceRecognition.FaceSetPb.NewFaceSetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNewFaceSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteFaceSet删除一个FaceSet
     * </pre>
     */
    public void deleteFaceSet(faceRecognition.FaceSetPb.DeleteFaceSetRequest request,
        io.grpc.stub.StreamObserver<faceRecognition.FaceSetPb.DeleteFaceSetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteFaceSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateFaceSet更新一个FaceSet基础信息
     * </pre>
     */
    public void updateFaceSet(faceRecognition.FaceSetPb.UpdateFaceSetRequest request,
        io.grpc.stub.StreamObserver<faceRecognition.FaceSetPb.UpdateFaceSetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateFaceSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListFaceSets列举所有FaceSets
     * </pre>
     */
    public void listFaceSets(faceRecognition.FaceSetPb.ListFaceSetsRequest request,
        io.grpc.stub.StreamObserver<faceRecognition.FaceSetPb.ListFaceSetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListFaceSetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddFace将识别一张人脸图片并将结果添加至对应FaceSet中
     * </pre>
     */
    public void addFace(faceRecognition.FaceSetPb.AddFaceRequest request,
        io.grpc.stub.StreamObserver<faceRecognition.FaceSetPb.AddFaceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddFaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveFace将从FaceSet中移除对应FaceToken
     * </pre>
     */
    public void removeFace(faceRecognition.FaceSetPb.RemoveFaceRequest request,
        io.grpc.stub.StreamObserver<faceRecognition.FaceSetPb.RemoveFaceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveFaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * FaceDetail通过face_token获取对应的FaceDetail
     * </pre>
     */
    public void faceDetail(faceRecognition.FaceSetPb.FaceDetailRequest request,
        io.grpc.stub.StreamObserver<faceRecognition.FaceSetPb.FaceDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFaceDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListFaceDetails返回指定FaceSet中的FaceDetails
     * </pre>
     */
    public void listFaceDetails(faceRecognition.FaceSetPb.ListFaceDetailsRequest request,
        io.grpc.stub.StreamObserver<faceRecognition.FaceSetPb.ListFaceDetailsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListFaceDetailsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNewFaceSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                faceRecognition.FaceSetPb.NewFaceSetRequest,
                faceRecognition.FaceSetPb.NewFaceSetResponse>(
                  this, METHODID_NEW_FACE_SET)))
          .addMethod(
            getDeleteFaceSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                faceRecognition.FaceSetPb.DeleteFaceSetRequest,
                faceRecognition.FaceSetPb.DeleteFaceSetResponse>(
                  this, METHODID_DELETE_FACE_SET)))
          .addMethod(
            getUpdateFaceSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                faceRecognition.FaceSetPb.UpdateFaceSetRequest,
                faceRecognition.FaceSetPb.UpdateFaceSetResponse>(
                  this, METHODID_UPDATE_FACE_SET)))
          .addMethod(
            getListFaceSetsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                faceRecognition.FaceSetPb.ListFaceSetsRequest,
                faceRecognition.FaceSetPb.ListFaceSetsResponse>(
                  this, METHODID_LIST_FACE_SETS)))
          .addMethod(
            getAddFaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                faceRecognition.FaceSetPb.AddFaceRequest,
                faceRecognition.FaceSetPb.AddFaceResponse>(
                  this, METHODID_ADD_FACE)))
          .addMethod(
            getRemoveFaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                faceRecognition.FaceSetPb.RemoveFaceRequest,
                faceRecognition.FaceSetPb.RemoveFaceResponse>(
                  this, METHODID_REMOVE_FACE)))
          .addMethod(
            getFaceDetailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                faceRecognition.FaceSetPb.FaceDetailRequest,
                faceRecognition.FaceSetPb.FaceDetailResponse>(
                  this, METHODID_FACE_DETAIL)))
          .addMethod(
            getListFaceDetailsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                faceRecognition.FaceSetPb.ListFaceDetailsRequest,
                faceRecognition.FaceSetPb.ListFaceDetailsResponse>(
                  this, METHODID_LIST_FACE_DETAILS)))
          .build();
    }
  }

  /**
   */
  public static final class FaceSetServiceStub extends io.grpc.stub.AbstractStub<FaceSetServiceStub> {
    private FaceSetServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FaceSetServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FaceSetServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FaceSetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * NewFaceSet创建一个FaceSet
     * </pre>
     */
    public void newFaceSet(faceRecognition.FaceSetPb.NewFaceSetRequest request,
        io.grpc.stub.StreamObserver<faceRecognition.FaceSetPb.NewFaceSetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNewFaceSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteFaceSet删除一个FaceSet
     * </pre>
     */
    public void deleteFaceSet(faceRecognition.FaceSetPb.DeleteFaceSetRequest request,
        io.grpc.stub.StreamObserver<faceRecognition.FaceSetPb.DeleteFaceSetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteFaceSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateFaceSet更新一个FaceSet基础信息
     * </pre>
     */
    public void updateFaceSet(faceRecognition.FaceSetPb.UpdateFaceSetRequest request,
        io.grpc.stub.StreamObserver<faceRecognition.FaceSetPb.UpdateFaceSetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateFaceSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListFaceSets列举所有FaceSets
     * </pre>
     */
    public void listFaceSets(faceRecognition.FaceSetPb.ListFaceSetsRequest request,
        io.grpc.stub.StreamObserver<faceRecognition.FaceSetPb.ListFaceSetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListFaceSetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddFace将识别一张人脸图片并将结果添加至对应FaceSet中
     * </pre>
     */
    public void addFace(faceRecognition.FaceSetPb.AddFaceRequest request,
        io.grpc.stub.StreamObserver<faceRecognition.FaceSetPb.AddFaceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddFaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveFace将从FaceSet中移除对应FaceToken
     * </pre>
     */
    public void removeFace(faceRecognition.FaceSetPb.RemoveFaceRequest request,
        io.grpc.stub.StreamObserver<faceRecognition.FaceSetPb.RemoveFaceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveFaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FaceDetail通过face_token获取对应的FaceDetail
     * </pre>
     */
    public void faceDetail(faceRecognition.FaceSetPb.FaceDetailRequest request,
        io.grpc.stub.StreamObserver<faceRecognition.FaceSetPb.FaceDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFaceDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListFaceDetails返回指定FaceSet中的FaceDetails
     * </pre>
     */
    public void listFaceDetails(faceRecognition.FaceSetPb.ListFaceDetailsRequest request,
        io.grpc.stub.StreamObserver<faceRecognition.FaceSetPb.ListFaceDetailsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListFaceDetailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FaceSetServiceBlockingStub extends io.grpc.stub.AbstractStub<FaceSetServiceBlockingStub> {
    private FaceSetServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FaceSetServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FaceSetServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FaceSetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * NewFaceSet创建一个FaceSet
     * </pre>
     */
    public faceRecognition.FaceSetPb.NewFaceSetResponse newFaceSet(faceRecognition.FaceSetPb.NewFaceSetRequest request) {
      return blockingUnaryCall(
          getChannel(), getNewFaceSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteFaceSet删除一个FaceSet
     * </pre>
     */
    public faceRecognition.FaceSetPb.DeleteFaceSetResponse deleteFaceSet(faceRecognition.FaceSetPb.DeleteFaceSetRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteFaceSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateFaceSet更新一个FaceSet基础信息
     * </pre>
     */
    public faceRecognition.FaceSetPb.UpdateFaceSetResponse updateFaceSet(faceRecognition.FaceSetPb.UpdateFaceSetRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateFaceSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListFaceSets列举所有FaceSets
     * </pre>
     */
    public faceRecognition.FaceSetPb.ListFaceSetsResponse listFaceSets(faceRecognition.FaceSetPb.ListFaceSetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListFaceSetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddFace将识别一张人脸图片并将结果添加至对应FaceSet中
     * </pre>
     */
    public faceRecognition.FaceSetPb.AddFaceResponse addFace(faceRecognition.FaceSetPb.AddFaceRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddFaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveFace将从FaceSet中移除对应FaceToken
     * </pre>
     */
    public faceRecognition.FaceSetPb.RemoveFaceResponse removeFace(faceRecognition.FaceSetPb.RemoveFaceRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveFaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FaceDetail通过face_token获取对应的FaceDetail
     * </pre>
     */
    public faceRecognition.FaceSetPb.FaceDetailResponse faceDetail(faceRecognition.FaceSetPb.FaceDetailRequest request) {
      return blockingUnaryCall(
          getChannel(), getFaceDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListFaceDetails返回指定FaceSet中的FaceDetails
     * </pre>
     */
    public faceRecognition.FaceSetPb.ListFaceDetailsResponse listFaceDetails(faceRecognition.FaceSetPb.ListFaceDetailsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListFaceDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FaceSetServiceFutureStub extends io.grpc.stub.AbstractStub<FaceSetServiceFutureStub> {
    private FaceSetServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FaceSetServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FaceSetServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FaceSetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * NewFaceSet创建一个FaceSet
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<faceRecognition.FaceSetPb.NewFaceSetResponse> newFaceSet(
        faceRecognition.FaceSetPb.NewFaceSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNewFaceSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteFaceSet删除一个FaceSet
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<faceRecognition.FaceSetPb.DeleteFaceSetResponse> deleteFaceSet(
        faceRecognition.FaceSetPb.DeleteFaceSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteFaceSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateFaceSet更新一个FaceSet基础信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<faceRecognition.FaceSetPb.UpdateFaceSetResponse> updateFaceSet(
        faceRecognition.FaceSetPb.UpdateFaceSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateFaceSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListFaceSets列举所有FaceSets
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<faceRecognition.FaceSetPb.ListFaceSetsResponse> listFaceSets(
        faceRecognition.FaceSetPb.ListFaceSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListFaceSetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddFace将识别一张人脸图片并将结果添加至对应FaceSet中
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<faceRecognition.FaceSetPb.AddFaceResponse> addFace(
        faceRecognition.FaceSetPb.AddFaceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddFaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveFace将从FaceSet中移除对应FaceToken
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<faceRecognition.FaceSetPb.RemoveFaceResponse> removeFace(
        faceRecognition.FaceSetPb.RemoveFaceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveFaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FaceDetail通过face_token获取对应的FaceDetail
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<faceRecognition.FaceSetPb.FaceDetailResponse> faceDetail(
        faceRecognition.FaceSetPb.FaceDetailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFaceDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListFaceDetails返回指定FaceSet中的FaceDetails
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<faceRecognition.FaceSetPb.ListFaceDetailsResponse> listFaceDetails(
        faceRecognition.FaceSetPb.ListFaceDetailsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListFaceDetailsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NEW_FACE_SET = 0;
  private static final int METHODID_DELETE_FACE_SET = 1;
  private static final int METHODID_UPDATE_FACE_SET = 2;
  private static final int METHODID_LIST_FACE_SETS = 3;
  private static final int METHODID_ADD_FACE = 4;
  private static final int METHODID_REMOVE_FACE = 5;
  private static final int METHODID_FACE_DETAIL = 6;
  private static final int METHODID_LIST_FACE_DETAILS = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FaceSetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FaceSetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NEW_FACE_SET:
          serviceImpl.newFaceSet((faceRecognition.FaceSetPb.NewFaceSetRequest) request,
              (io.grpc.stub.StreamObserver<faceRecognition.FaceSetPb.NewFaceSetResponse>) responseObserver);
          break;
        case METHODID_DELETE_FACE_SET:
          serviceImpl.deleteFaceSet((faceRecognition.FaceSetPb.DeleteFaceSetRequest) request,
              (io.grpc.stub.StreamObserver<faceRecognition.FaceSetPb.DeleteFaceSetResponse>) responseObserver);
          break;
        case METHODID_UPDATE_FACE_SET:
          serviceImpl.updateFaceSet((faceRecognition.FaceSetPb.UpdateFaceSetRequest) request,
              (io.grpc.stub.StreamObserver<faceRecognition.FaceSetPb.UpdateFaceSetResponse>) responseObserver);
          break;
        case METHODID_LIST_FACE_SETS:
          serviceImpl.listFaceSets((faceRecognition.FaceSetPb.ListFaceSetsRequest) request,
              (io.grpc.stub.StreamObserver<faceRecognition.FaceSetPb.ListFaceSetsResponse>) responseObserver);
          break;
        case METHODID_ADD_FACE:
          serviceImpl.addFace((faceRecognition.FaceSetPb.AddFaceRequest) request,
              (io.grpc.stub.StreamObserver<faceRecognition.FaceSetPb.AddFaceResponse>) responseObserver);
          break;
        case METHODID_REMOVE_FACE:
          serviceImpl.removeFace((faceRecognition.FaceSetPb.RemoveFaceRequest) request,
              (io.grpc.stub.StreamObserver<faceRecognition.FaceSetPb.RemoveFaceResponse>) responseObserver);
          break;
        case METHODID_FACE_DETAIL:
          serviceImpl.faceDetail((faceRecognition.FaceSetPb.FaceDetailRequest) request,
              (io.grpc.stub.StreamObserver<faceRecognition.FaceSetPb.FaceDetailResponse>) responseObserver);
          break;
        case METHODID_LIST_FACE_DETAILS:
          serviceImpl.listFaceDetails((faceRecognition.FaceSetPb.ListFaceDetailsRequest) request,
              (io.grpc.stub.StreamObserver<faceRecognition.FaceSetPb.ListFaceDetailsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FaceSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FaceSetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return faceRecognition.FaceSetPb.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FaceSetService");
    }
  }

  private static final class FaceSetServiceFileDescriptorSupplier
      extends FaceSetServiceBaseDescriptorSupplier {
    FaceSetServiceFileDescriptorSupplier() {}
  }

  private static final class FaceSetServiceMethodDescriptorSupplier
      extends FaceSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FaceSetServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FaceSetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FaceSetServiceFileDescriptorSupplier())
              .addMethod(getNewFaceSetMethod())
              .addMethod(getDeleteFaceSetMethod())
              .addMethod(getUpdateFaceSetMethod())
              .addMethod(getListFaceSetsMethod())
              .addMethod(getAddFaceMethod())
              .addMethod(getRemoveFaceMethod())
              .addMethod(getFaceDetailMethod())
              .addMethod(getListFaceDetailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
