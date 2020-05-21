package com.jjrobot.andy4.facepb;

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
 * <pre>
 * faceRecognition.FaceSetService FaceSet数据的管理
 * FaceSet用于存储管理Face数据以支持相关匹配与搜索功能
 * 开发管理平台功能参考: http://10.10.10.2/face/face-set
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.1-SNAPSHOT)",
    comments = "Source: faceset.proto")
public final class FaceSetServiceGrpc {

  private FaceSetServiceGrpc() {}

  public static final String SERVICE_NAME = "faceRecognition.FaceSetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceSetServicePB.NewFaceSetRequest,
      com.jjrobot.andy4.facepb.FaceSetServicePB.NewFaceSetResponse> getNewFaceSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewFaceSet",
      requestType = com.jjrobot.andy4.facepb.FaceSetServicePB.NewFaceSetRequest.class,
      responseType = com.jjrobot.andy4.facepb.FaceSetServicePB.NewFaceSetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceSetServicePB.NewFaceSetRequest,
      com.jjrobot.andy4.facepb.FaceSetServicePB.NewFaceSetResponse> getNewFaceSetMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceSetServicePB.NewFaceSetRequest, com.jjrobot.andy4.facepb.FaceSetServicePB.NewFaceSetResponse> getNewFaceSetMethod;
    if ((getNewFaceSetMethod = FaceSetServiceGrpc.getNewFaceSetMethod) == null) {
      synchronized (FaceSetServiceGrpc.class) {
        if ((getNewFaceSetMethod = FaceSetServiceGrpc.getNewFaceSetMethod) == null) {
          FaceSetServiceGrpc.getNewFaceSetMethod = getNewFaceSetMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.facepb.FaceSetServicePB.NewFaceSetRequest, com.jjrobot.andy4.facepb.FaceSetServicePB.NewFaceSetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewFaceSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceSetServicePB.NewFaceSetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceSetServicePB.NewFaceSetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FaceSetServiceMethodDescriptorSupplier("NewFaceSet"))
              .build();
        }
      }
    }
    return getNewFaceSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceSetServicePB.DeleteFaceSetRequest,
      com.jjrobot.andy4.facepb.FaceSetServicePB.DeleteFaceSetResponse> getDeleteFaceSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFaceSet",
      requestType = com.jjrobot.andy4.facepb.FaceSetServicePB.DeleteFaceSetRequest.class,
      responseType = com.jjrobot.andy4.facepb.FaceSetServicePB.DeleteFaceSetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceSetServicePB.DeleteFaceSetRequest,
      com.jjrobot.andy4.facepb.FaceSetServicePB.DeleteFaceSetResponse> getDeleteFaceSetMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceSetServicePB.DeleteFaceSetRequest, com.jjrobot.andy4.facepb.FaceSetServicePB.DeleteFaceSetResponse> getDeleteFaceSetMethod;
    if ((getDeleteFaceSetMethod = FaceSetServiceGrpc.getDeleteFaceSetMethod) == null) {
      synchronized (FaceSetServiceGrpc.class) {
        if ((getDeleteFaceSetMethod = FaceSetServiceGrpc.getDeleteFaceSetMethod) == null) {
          FaceSetServiceGrpc.getDeleteFaceSetMethod = getDeleteFaceSetMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.facepb.FaceSetServicePB.DeleteFaceSetRequest, com.jjrobot.andy4.facepb.FaceSetServicePB.DeleteFaceSetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFaceSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceSetServicePB.DeleteFaceSetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceSetServicePB.DeleteFaceSetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FaceSetServiceMethodDescriptorSupplier("DeleteFaceSet"))
              .build();
        }
      }
    }
    return getDeleteFaceSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceSetServicePB.UpdateFaceSetRequest,
      com.jjrobot.andy4.facepb.FaceSetServicePB.UpdateFaceSetResponse> getUpdateFaceSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFaceSet",
      requestType = com.jjrobot.andy4.facepb.FaceSetServicePB.UpdateFaceSetRequest.class,
      responseType = com.jjrobot.andy4.facepb.FaceSetServicePB.UpdateFaceSetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceSetServicePB.UpdateFaceSetRequest,
      com.jjrobot.andy4.facepb.FaceSetServicePB.UpdateFaceSetResponse> getUpdateFaceSetMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceSetServicePB.UpdateFaceSetRequest, com.jjrobot.andy4.facepb.FaceSetServicePB.UpdateFaceSetResponse> getUpdateFaceSetMethod;
    if ((getUpdateFaceSetMethod = FaceSetServiceGrpc.getUpdateFaceSetMethod) == null) {
      synchronized (FaceSetServiceGrpc.class) {
        if ((getUpdateFaceSetMethod = FaceSetServiceGrpc.getUpdateFaceSetMethod) == null) {
          FaceSetServiceGrpc.getUpdateFaceSetMethod = getUpdateFaceSetMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.facepb.FaceSetServicePB.UpdateFaceSetRequest, com.jjrobot.andy4.facepb.FaceSetServicePB.UpdateFaceSetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFaceSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceSetServicePB.UpdateFaceSetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceSetServicePB.UpdateFaceSetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FaceSetServiceMethodDescriptorSupplier("UpdateFaceSet"))
              .build();
        }
      }
    }
    return getUpdateFaceSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceSetsRequest,
      com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceSetsResponse> getListFaceSetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFaceSets",
      requestType = com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceSetsRequest.class,
      responseType = com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceSetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceSetsRequest,
      com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceSetsResponse> getListFaceSetsMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceSetsRequest, com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceSetsResponse> getListFaceSetsMethod;
    if ((getListFaceSetsMethod = FaceSetServiceGrpc.getListFaceSetsMethod) == null) {
      synchronized (FaceSetServiceGrpc.class) {
        if ((getListFaceSetsMethod = FaceSetServiceGrpc.getListFaceSetsMethod) == null) {
          FaceSetServiceGrpc.getListFaceSetsMethod = getListFaceSetsMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceSetsRequest, com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceSetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFaceSets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceSetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceSetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FaceSetServiceMethodDescriptorSupplier("ListFaceSets"))
              .build();
        }
      }
    }
    return getListFaceSetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceSetServicePB.AddFaceRequest,
      com.jjrobot.andy4.facepb.FaceSetServicePB.AddFaceResponse> getAddFaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddFace",
      requestType = com.jjrobot.andy4.facepb.FaceSetServicePB.AddFaceRequest.class,
      responseType = com.jjrobot.andy4.facepb.FaceSetServicePB.AddFaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceSetServicePB.AddFaceRequest,
      com.jjrobot.andy4.facepb.FaceSetServicePB.AddFaceResponse> getAddFaceMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceSetServicePB.AddFaceRequest, com.jjrobot.andy4.facepb.FaceSetServicePB.AddFaceResponse> getAddFaceMethod;
    if ((getAddFaceMethod = FaceSetServiceGrpc.getAddFaceMethod) == null) {
      synchronized (FaceSetServiceGrpc.class) {
        if ((getAddFaceMethod = FaceSetServiceGrpc.getAddFaceMethod) == null) {
          FaceSetServiceGrpc.getAddFaceMethod = getAddFaceMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.facepb.FaceSetServicePB.AddFaceRequest, com.jjrobot.andy4.facepb.FaceSetServicePB.AddFaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddFace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceSetServicePB.AddFaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceSetServicePB.AddFaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FaceSetServiceMethodDescriptorSupplier("AddFace"))
              .build();
        }
      }
    }
    return getAddFaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceSetServicePB.RemoveFaceRequest,
      com.jjrobot.andy4.facepb.FaceSetServicePB.RemoveFaceResponse> getRemoveFaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveFace",
      requestType = com.jjrobot.andy4.facepb.FaceSetServicePB.RemoveFaceRequest.class,
      responseType = com.jjrobot.andy4.facepb.FaceSetServicePB.RemoveFaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceSetServicePB.RemoveFaceRequest,
      com.jjrobot.andy4.facepb.FaceSetServicePB.RemoveFaceResponse> getRemoveFaceMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceSetServicePB.RemoveFaceRequest, com.jjrobot.andy4.facepb.FaceSetServicePB.RemoveFaceResponse> getRemoveFaceMethod;
    if ((getRemoveFaceMethod = FaceSetServiceGrpc.getRemoveFaceMethod) == null) {
      synchronized (FaceSetServiceGrpc.class) {
        if ((getRemoveFaceMethod = FaceSetServiceGrpc.getRemoveFaceMethod) == null) {
          FaceSetServiceGrpc.getRemoveFaceMethod = getRemoveFaceMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.facepb.FaceSetServicePB.RemoveFaceRequest, com.jjrobot.andy4.facepb.FaceSetServicePB.RemoveFaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveFace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceSetServicePB.RemoveFaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceSetServicePB.RemoveFaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FaceSetServiceMethodDescriptorSupplier("RemoveFace"))
              .build();
        }
      }
    }
    return getRemoveFaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceSetServicePB.FaceDetailRequest,
      com.jjrobot.andy4.facepb.FaceSetServicePB.FaceDetailResponse> getFaceDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FaceDetail",
      requestType = com.jjrobot.andy4.facepb.FaceSetServicePB.FaceDetailRequest.class,
      responseType = com.jjrobot.andy4.facepb.FaceSetServicePB.FaceDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceSetServicePB.FaceDetailRequest,
      com.jjrobot.andy4.facepb.FaceSetServicePB.FaceDetailResponse> getFaceDetailMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceSetServicePB.FaceDetailRequest, com.jjrobot.andy4.facepb.FaceSetServicePB.FaceDetailResponse> getFaceDetailMethod;
    if ((getFaceDetailMethod = FaceSetServiceGrpc.getFaceDetailMethod) == null) {
      synchronized (FaceSetServiceGrpc.class) {
        if ((getFaceDetailMethod = FaceSetServiceGrpc.getFaceDetailMethod) == null) {
          FaceSetServiceGrpc.getFaceDetailMethod = getFaceDetailMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.facepb.FaceSetServicePB.FaceDetailRequest, com.jjrobot.andy4.facepb.FaceSetServicePB.FaceDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FaceDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceSetServicePB.FaceDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceSetServicePB.FaceDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FaceSetServiceMethodDescriptorSupplier("FaceDetail"))
              .build();
        }
      }
    }
    return getFaceDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceDetailsRequest,
      com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceDetailsResponse> getListFaceDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFaceDetails",
      requestType = com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceDetailsRequest.class,
      responseType = com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceDetailsRequest,
      com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceDetailsResponse> getListFaceDetailsMethod() {
    io.grpc.MethodDescriptor<com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceDetailsRequest, com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceDetailsResponse> getListFaceDetailsMethod;
    if ((getListFaceDetailsMethod = FaceSetServiceGrpc.getListFaceDetailsMethod) == null) {
      synchronized (FaceSetServiceGrpc.class) {
        if ((getListFaceDetailsMethod = FaceSetServiceGrpc.getListFaceDetailsMethod) == null) {
          FaceSetServiceGrpc.getListFaceDetailsMethod = getListFaceDetailsMethod =
              io.grpc.MethodDescriptor.<com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceDetailsRequest, com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFaceDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceDetailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceDetailsResponse.getDefaultInstance()))
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
    io.grpc.stub.AbstractStub.StubFactory<FaceSetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FaceSetServiceStub>() {
        @java.lang.Override
        public FaceSetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FaceSetServiceStub(channel, callOptions);
        }
      };
    return FaceSetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FaceSetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FaceSetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FaceSetServiceBlockingStub>() {
        @java.lang.Override
        public FaceSetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FaceSetServiceBlockingStub(channel, callOptions);
        }
      };
    return FaceSetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FaceSetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FaceSetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FaceSetServiceFutureStub>() {
        @java.lang.Override
        public FaceSetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FaceSetServiceFutureStub(channel, callOptions);
        }
      };
    return FaceSetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * faceRecognition.FaceSetService FaceSet数据的管理
   * FaceSet用于存储管理Face数据以支持相关匹配与搜索功能
   * 开发管理平台功能参考: http://10.10.10.2/face/face-set
   * </pre>
   */
  public static abstract class FaceSetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * NewFaceSet 创建一个FaceSet
     * </pre>
     */
    public void newFaceSet(com.jjrobot.andy4.facepb.FaceSetServicePB.NewFaceSetRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceSetServicePB.NewFaceSetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNewFaceSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteFaceSet 删除FaceSet
     * </pre>
     */
    public void deleteFaceSet(com.jjrobot.andy4.facepb.FaceSetServicePB.DeleteFaceSetRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceSetServicePB.DeleteFaceSetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteFaceSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateFaceSet 更新FaceSet信息
     * </pre>
     */
    public void updateFaceSet(com.jjrobot.andy4.facepb.FaceSetServicePB.UpdateFaceSetRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceSetServicePB.UpdateFaceSetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateFaceSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListFaceSets 获取FaceSet列表
     * </pre>
     */
    public void listFaceSets(com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceSetsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceSetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListFaceSetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddFace 识别人脸图片并将结果添加至FaceSet中
     * </pre>
     */
    public void addFace(com.jjrobot.andy4.facepb.FaceSetServicePB.AddFaceRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceSetServicePB.AddFaceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddFaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveFace 从FaceSet中移除Face
     * </pre>
     */
    public void removeFace(com.jjrobot.andy4.facepb.FaceSetServicePB.RemoveFaceRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceSetServicePB.RemoveFaceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveFaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * FaceDetail 获取FaceSet中的Face
     * </pre>
     */
    public void faceDetail(com.jjrobot.andy4.facepb.FaceSetServicePB.FaceDetailRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceSetServicePB.FaceDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFaceDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListFaceDetails 获取FaceSet中的Face列表
     * </pre>
     */
    public void listFaceDetails(com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceDetailsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceDetailsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListFaceDetailsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNewFaceSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.facepb.FaceSetServicePB.NewFaceSetRequest,
                com.jjrobot.andy4.facepb.FaceSetServicePB.NewFaceSetResponse>(
                  this, METHODID_NEW_FACE_SET)))
          .addMethod(
            getDeleteFaceSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.facepb.FaceSetServicePB.DeleteFaceSetRequest,
                com.jjrobot.andy4.facepb.FaceSetServicePB.DeleteFaceSetResponse>(
                  this, METHODID_DELETE_FACE_SET)))
          .addMethod(
            getUpdateFaceSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.facepb.FaceSetServicePB.UpdateFaceSetRequest,
                com.jjrobot.andy4.facepb.FaceSetServicePB.UpdateFaceSetResponse>(
                  this, METHODID_UPDATE_FACE_SET)))
          .addMethod(
            getListFaceSetsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceSetsRequest,
                com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceSetsResponse>(
                  this, METHODID_LIST_FACE_SETS)))
          .addMethod(
            getAddFaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.facepb.FaceSetServicePB.AddFaceRequest,
                com.jjrobot.andy4.facepb.FaceSetServicePB.AddFaceResponse>(
                  this, METHODID_ADD_FACE)))
          .addMethod(
            getRemoveFaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.facepb.FaceSetServicePB.RemoveFaceRequest,
                com.jjrobot.andy4.facepb.FaceSetServicePB.RemoveFaceResponse>(
                  this, METHODID_REMOVE_FACE)))
          .addMethod(
            getFaceDetailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.facepb.FaceSetServicePB.FaceDetailRequest,
                com.jjrobot.andy4.facepb.FaceSetServicePB.FaceDetailResponse>(
                  this, METHODID_FACE_DETAIL)))
          .addMethod(
            getListFaceDetailsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceDetailsRequest,
                com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceDetailsResponse>(
                  this, METHODID_LIST_FACE_DETAILS)))
          .build();
    }
  }

  /**
   * <pre>
   * faceRecognition.FaceSetService FaceSet数据的管理
   * FaceSet用于存储管理Face数据以支持相关匹配与搜索功能
   * 开发管理平台功能参考: http://10.10.10.2/face/face-set
   * </pre>
   */
  public static final class FaceSetServiceStub extends io.grpc.stub.AbstractAsyncStub<FaceSetServiceStub> {
    private FaceSetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FaceSetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FaceSetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * NewFaceSet 创建一个FaceSet
     * </pre>
     */
    public void newFaceSet(com.jjrobot.andy4.facepb.FaceSetServicePB.NewFaceSetRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceSetServicePB.NewFaceSetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNewFaceSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteFaceSet 删除FaceSet
     * </pre>
     */
    public void deleteFaceSet(com.jjrobot.andy4.facepb.FaceSetServicePB.DeleteFaceSetRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceSetServicePB.DeleteFaceSetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteFaceSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateFaceSet 更新FaceSet信息
     * </pre>
     */
    public void updateFaceSet(com.jjrobot.andy4.facepb.FaceSetServicePB.UpdateFaceSetRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceSetServicePB.UpdateFaceSetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateFaceSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListFaceSets 获取FaceSet列表
     * </pre>
     */
    public void listFaceSets(com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceSetsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceSetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListFaceSetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddFace 识别人脸图片并将结果添加至FaceSet中
     * </pre>
     */
    public void addFace(com.jjrobot.andy4.facepb.FaceSetServicePB.AddFaceRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceSetServicePB.AddFaceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddFaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveFace 从FaceSet中移除Face
     * </pre>
     */
    public void removeFace(com.jjrobot.andy4.facepb.FaceSetServicePB.RemoveFaceRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceSetServicePB.RemoveFaceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveFaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FaceDetail 获取FaceSet中的Face
     * </pre>
     */
    public void faceDetail(com.jjrobot.andy4.facepb.FaceSetServicePB.FaceDetailRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceSetServicePB.FaceDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFaceDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListFaceDetails 获取FaceSet中的Face列表
     * </pre>
     */
    public void listFaceDetails(com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceDetailsRequest request,
        io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceDetailsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListFaceDetailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * faceRecognition.FaceSetService FaceSet数据的管理
   * FaceSet用于存储管理Face数据以支持相关匹配与搜索功能
   * 开发管理平台功能参考: http://10.10.10.2/face/face-set
   * </pre>
   */
  public static final class FaceSetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FaceSetServiceBlockingStub> {
    private FaceSetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FaceSetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FaceSetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * NewFaceSet 创建一个FaceSet
     * </pre>
     */
    public com.jjrobot.andy4.facepb.FaceSetServicePB.NewFaceSetResponse newFaceSet(com.jjrobot.andy4.facepb.FaceSetServicePB.NewFaceSetRequest request) {
      return blockingUnaryCall(
          getChannel(), getNewFaceSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteFaceSet 删除FaceSet
     * </pre>
     */
    public com.jjrobot.andy4.facepb.FaceSetServicePB.DeleteFaceSetResponse deleteFaceSet(com.jjrobot.andy4.facepb.FaceSetServicePB.DeleteFaceSetRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteFaceSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateFaceSet 更新FaceSet信息
     * </pre>
     */
    public com.jjrobot.andy4.facepb.FaceSetServicePB.UpdateFaceSetResponse updateFaceSet(com.jjrobot.andy4.facepb.FaceSetServicePB.UpdateFaceSetRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateFaceSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListFaceSets 获取FaceSet列表
     * </pre>
     */
    public com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceSetsResponse listFaceSets(com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceSetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListFaceSetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddFace 识别人脸图片并将结果添加至FaceSet中
     * </pre>
     */
    public com.jjrobot.andy4.facepb.FaceSetServicePB.AddFaceResponse addFace(com.jjrobot.andy4.facepb.FaceSetServicePB.AddFaceRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddFaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveFace 从FaceSet中移除Face
     * </pre>
     */
    public com.jjrobot.andy4.facepb.FaceSetServicePB.RemoveFaceResponse removeFace(com.jjrobot.andy4.facepb.FaceSetServicePB.RemoveFaceRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveFaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FaceDetail 获取FaceSet中的Face
     * </pre>
     */
    public com.jjrobot.andy4.facepb.FaceSetServicePB.FaceDetailResponse faceDetail(com.jjrobot.andy4.facepb.FaceSetServicePB.FaceDetailRequest request) {
      return blockingUnaryCall(
          getChannel(), getFaceDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListFaceDetails 获取FaceSet中的Face列表
     * </pre>
     */
    public com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceDetailsResponse listFaceDetails(com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceDetailsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListFaceDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * faceRecognition.FaceSetService FaceSet数据的管理
   * FaceSet用于存储管理Face数据以支持相关匹配与搜索功能
   * 开发管理平台功能参考: http://10.10.10.2/face/face-set
   * </pre>
   */
  public static final class FaceSetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FaceSetServiceFutureStub> {
    private FaceSetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FaceSetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FaceSetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * NewFaceSet 创建一个FaceSet
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.facepb.FaceSetServicePB.NewFaceSetResponse> newFaceSet(
        com.jjrobot.andy4.facepb.FaceSetServicePB.NewFaceSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNewFaceSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteFaceSet 删除FaceSet
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.facepb.FaceSetServicePB.DeleteFaceSetResponse> deleteFaceSet(
        com.jjrobot.andy4.facepb.FaceSetServicePB.DeleteFaceSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteFaceSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateFaceSet 更新FaceSet信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.facepb.FaceSetServicePB.UpdateFaceSetResponse> updateFaceSet(
        com.jjrobot.andy4.facepb.FaceSetServicePB.UpdateFaceSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateFaceSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListFaceSets 获取FaceSet列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceSetsResponse> listFaceSets(
        com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListFaceSetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddFace 识别人脸图片并将结果添加至FaceSet中
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.facepb.FaceSetServicePB.AddFaceResponse> addFace(
        com.jjrobot.andy4.facepb.FaceSetServicePB.AddFaceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddFaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveFace 从FaceSet中移除Face
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.facepb.FaceSetServicePB.RemoveFaceResponse> removeFace(
        com.jjrobot.andy4.facepb.FaceSetServicePB.RemoveFaceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveFaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FaceDetail 获取FaceSet中的Face
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.facepb.FaceSetServicePB.FaceDetailResponse> faceDetail(
        com.jjrobot.andy4.facepb.FaceSetServicePB.FaceDetailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFaceDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListFaceDetails 获取FaceSet中的Face列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceDetailsResponse> listFaceDetails(
        com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceDetailsRequest request) {
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
          serviceImpl.newFaceSet((com.jjrobot.andy4.facepb.FaceSetServicePB.NewFaceSetRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceSetServicePB.NewFaceSetResponse>) responseObserver);
          break;
        case METHODID_DELETE_FACE_SET:
          serviceImpl.deleteFaceSet((com.jjrobot.andy4.facepb.FaceSetServicePB.DeleteFaceSetRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceSetServicePB.DeleteFaceSetResponse>) responseObserver);
          break;
        case METHODID_UPDATE_FACE_SET:
          serviceImpl.updateFaceSet((com.jjrobot.andy4.facepb.FaceSetServicePB.UpdateFaceSetRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceSetServicePB.UpdateFaceSetResponse>) responseObserver);
          break;
        case METHODID_LIST_FACE_SETS:
          serviceImpl.listFaceSets((com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceSetsRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceSetsResponse>) responseObserver);
          break;
        case METHODID_ADD_FACE:
          serviceImpl.addFace((com.jjrobot.andy4.facepb.FaceSetServicePB.AddFaceRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceSetServicePB.AddFaceResponse>) responseObserver);
          break;
        case METHODID_REMOVE_FACE:
          serviceImpl.removeFace((com.jjrobot.andy4.facepb.FaceSetServicePB.RemoveFaceRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceSetServicePB.RemoveFaceResponse>) responseObserver);
          break;
        case METHODID_FACE_DETAIL:
          serviceImpl.faceDetail((com.jjrobot.andy4.facepb.FaceSetServicePB.FaceDetailRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceSetServicePB.FaceDetailResponse>) responseObserver);
          break;
        case METHODID_LIST_FACE_DETAILS:
          serviceImpl.listFaceDetails((com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceDetailsRequest) request,
              (io.grpc.stub.StreamObserver<com.jjrobot.andy4.facepb.FaceSetServicePB.ListFaceDetailsResponse>) responseObserver);
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
      return com.jjrobot.andy4.facepb.FaceSetServicePB.getDescriptor();
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
