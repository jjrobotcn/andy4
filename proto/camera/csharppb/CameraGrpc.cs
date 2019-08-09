// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: camera.proto
// </auto-generated>
#pragma warning disable 0414, 1591
#region Designer generated code

using grpc = global::Grpc.Core;

namespace CameraService {
  public static partial class CameraService
  {
    static readonly string __ServiceName = "cameraService.CameraService";

    static readonly grpc::Marshaller<global::CameraService.LiveH264StreamRequest> __Marshaller_cameraService_LiveH264StreamRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::CameraService.LiveH264StreamRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::CameraService.LiveH264StreamResponse> __Marshaller_cameraService_LiveH264StreamResponse = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::CameraService.LiveH264StreamResponse.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::CameraService.DvrListDatesRequest> __Marshaller_cameraService_DvrListDatesRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::CameraService.DvrListDatesRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::CameraService.DvrListDatesResponse> __Marshaller_cameraService_DvrListDatesResponse = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::CameraService.DvrListDatesResponse.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::CameraService.DvrListDateVideosRequest> __Marshaller_cameraService_DvrListDateVideosRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::CameraService.DvrListDateVideosRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::CameraService.DvrListDateVideosResponse> __Marshaller_cameraService_DvrListDateVideosResponse = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::CameraService.DvrListDateVideosResponse.Parser.ParseFrom);

    static readonly grpc::Method<global::CameraService.LiveH264StreamRequest, global::CameraService.LiveH264StreamResponse> __Method_LiveH264Stream = new grpc::Method<global::CameraService.LiveH264StreamRequest, global::CameraService.LiveH264StreamResponse>(
        grpc::MethodType.ServerStreaming,
        __ServiceName,
        "LiveH264Stream",
        __Marshaller_cameraService_LiveH264StreamRequest,
        __Marshaller_cameraService_LiveH264StreamResponse);

    static readonly grpc::Method<global::CameraService.DvrListDatesRequest, global::CameraService.DvrListDatesResponse> __Method_DvrListDates = new grpc::Method<global::CameraService.DvrListDatesRequest, global::CameraService.DvrListDatesResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "DvrListDates",
        __Marshaller_cameraService_DvrListDatesRequest,
        __Marshaller_cameraService_DvrListDatesResponse);

    static readonly grpc::Method<global::CameraService.DvrListDateVideosRequest, global::CameraService.DvrListDateVideosResponse> __Method_DvrListDateVideos = new grpc::Method<global::CameraService.DvrListDateVideosRequest, global::CameraService.DvrListDateVideosResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "DvrListDateVideos",
        __Marshaller_cameraService_DvrListDateVideosRequest,
        __Marshaller_cameraService_DvrListDateVideosResponse);

    /// <summary>Service descriptor</summary>
    public static global::Google.Protobuf.Reflection.ServiceDescriptor Descriptor
    {
      get { return global::CameraService.CameraReflection.Descriptor.Services[0]; }
    }

    /// <summary>Base class for server-side implementations of CameraService</summary>
    [grpc::BindServiceMethod(typeof(CameraService), "BindService")]
    public abstract partial class CameraServiceBase
    {
      /// <summary>
      /// 直播流数据, 数据为h264 nal单元
      /// </summary>
      /// <param name="request">The request received from the client.</param>
      /// <param name="responseStream">Used for sending responses back to the client.</param>
      /// <param name="context">The context of the server-side call handler being invoked.</param>
      /// <returns>A task indicating completion of the handler.</returns>
      public virtual global::System.Threading.Tasks.Task LiveH264Stream(global::CameraService.LiveH264StreamRequest request, grpc::IServerStreamWriter<global::CameraService.LiveH264StreamResponse> responseStream, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      /// <summary>
      /// 获取监控数据日期列表
      /// </summary>
      /// <param name="request">The request received from the client.</param>
      /// <param name="context">The context of the server-side call handler being invoked.</param>
      /// <returns>The response to send back to the client (wrapped by a task).</returns>
      public virtual global::System.Threading.Tasks.Task<global::CameraService.DvrListDatesResponse> DvrListDates(global::CameraService.DvrListDatesRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      /// <summary>
      /// 获取监控数据指定日期视频文件列表
      /// </summary>
      /// <param name="request">The request received from the client.</param>
      /// <param name="context">The context of the server-side call handler being invoked.</param>
      /// <returns>The response to send back to the client (wrapped by a task).</returns>
      public virtual global::System.Threading.Tasks.Task<global::CameraService.DvrListDateVideosResponse> DvrListDateVideos(global::CameraService.DvrListDateVideosRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

    }

    /// <summary>Client for CameraService</summary>
    public partial class CameraServiceClient : grpc::ClientBase<CameraServiceClient>
    {
      /// <summary>Creates a new client for CameraService</summary>
      /// <param name="channel">The channel to use to make remote calls.</param>
      public CameraServiceClient(grpc::Channel channel) : base(channel)
      {
      }
      /// <summary>Creates a new client for CameraService that uses a custom <c>CallInvoker</c>.</summary>
      /// <param name="callInvoker">The callInvoker to use to make remote calls.</param>
      public CameraServiceClient(grpc::CallInvoker callInvoker) : base(callInvoker)
      {
      }
      /// <summary>Protected parameterless constructor to allow creation of test doubles.</summary>
      protected CameraServiceClient() : base()
      {
      }
      /// <summary>Protected constructor to allow creation of configured clients.</summary>
      /// <param name="configuration">The client configuration.</param>
      protected CameraServiceClient(ClientBaseConfiguration configuration) : base(configuration)
      {
      }

      /// <summary>
      /// 直播流数据, 数据为h264 nal单元
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncServerStreamingCall<global::CameraService.LiveH264StreamResponse> LiveH264Stream(global::CameraService.LiveH264StreamRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return LiveH264Stream(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// 直播流数据, 数据为h264 nal单元
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncServerStreamingCall<global::CameraService.LiveH264StreamResponse> LiveH264Stream(global::CameraService.LiveH264StreamRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncServerStreamingCall(__Method_LiveH264Stream, null, options, request);
      }
      /// <summary>
      /// 获取监控数据日期列表
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::CameraService.DvrListDatesResponse DvrListDates(global::CameraService.DvrListDatesRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return DvrListDates(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// 获取监控数据日期列表
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::CameraService.DvrListDatesResponse DvrListDates(global::CameraService.DvrListDatesRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_DvrListDates, null, options, request);
      }
      /// <summary>
      /// 获取监控数据日期列表
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::CameraService.DvrListDatesResponse> DvrListDatesAsync(global::CameraService.DvrListDatesRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return DvrListDatesAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// 获取监控数据日期列表
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::CameraService.DvrListDatesResponse> DvrListDatesAsync(global::CameraService.DvrListDatesRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_DvrListDates, null, options, request);
      }
      /// <summary>
      /// 获取监控数据指定日期视频文件列表
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::CameraService.DvrListDateVideosResponse DvrListDateVideos(global::CameraService.DvrListDateVideosRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return DvrListDateVideos(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// 获取监控数据指定日期视频文件列表
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::CameraService.DvrListDateVideosResponse DvrListDateVideos(global::CameraService.DvrListDateVideosRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_DvrListDateVideos, null, options, request);
      }
      /// <summary>
      /// 获取监控数据指定日期视频文件列表
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::CameraService.DvrListDateVideosResponse> DvrListDateVideosAsync(global::CameraService.DvrListDateVideosRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return DvrListDateVideosAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// 获取监控数据指定日期视频文件列表
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::CameraService.DvrListDateVideosResponse> DvrListDateVideosAsync(global::CameraService.DvrListDateVideosRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_DvrListDateVideos, null, options, request);
      }
      /// <summary>Creates a new instance of client from given <c>ClientBaseConfiguration</c>.</summary>
      protected override CameraServiceClient NewInstance(ClientBaseConfiguration configuration)
      {
        return new CameraServiceClient(configuration);
      }
    }

    /// <summary>Creates service definition that can be registered with a server</summary>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    public static grpc::ServerServiceDefinition BindService(CameraServiceBase serviceImpl)
    {
      return grpc::ServerServiceDefinition.CreateBuilder()
          .AddMethod(__Method_LiveH264Stream, serviceImpl.LiveH264Stream)
          .AddMethod(__Method_DvrListDates, serviceImpl.DvrListDates)
          .AddMethod(__Method_DvrListDateVideos, serviceImpl.DvrListDateVideos).Build();
    }

    /// <summary>Register service method with a service binder with or without implementation. Useful when customizing the  service binding logic.
    /// Note: this method is part of an experimental API that can change or be removed without any prior notice.</summary>
    /// <param name="serviceBinder">Service methods will be bound by calling <c>AddMethod</c> on this object.</param>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    public static void BindService(grpc::ServiceBinderBase serviceBinder, CameraServiceBase serviceImpl)
    {
      serviceBinder.AddMethod(__Method_LiveH264Stream, serviceImpl == null ? null : new grpc::ServerStreamingServerMethod<global::CameraService.LiveH264StreamRequest, global::CameraService.LiveH264StreamResponse>(serviceImpl.LiveH264Stream));
      serviceBinder.AddMethod(__Method_DvrListDates, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::CameraService.DvrListDatesRequest, global::CameraService.DvrListDatesResponse>(serviceImpl.DvrListDates));
      serviceBinder.AddMethod(__Method_DvrListDateVideos, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::CameraService.DvrListDateVideosRequest, global::CameraService.DvrListDateVideosResponse>(serviceImpl.DvrListDateVideos));
    }

  }
}
#endregion
