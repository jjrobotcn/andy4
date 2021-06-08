// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: player.proto
// </auto-generated>
#pragma warning disable 0414, 1591
#region Designer generated code

using grpc = global::Grpc.Core;

namespace Handsmotion {
  public static partial class Player
  {
    static readonly string __ServiceName = "handsmotion.Player";

    static readonly grpc::Marshaller<global::Handsmotion.PlayRequest> __Marshaller_handsmotion_PlayRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Handsmotion.PlayRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Handsmotion.PlayResponse> __Marshaller_handsmotion_PlayResponse = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Handsmotion.PlayResponse.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Handsmotion.StopRequest> __Marshaller_handsmotion_StopRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Handsmotion.StopRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Handsmotion.StopResponse> __Marshaller_handsmotion_StopResponse = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Handsmotion.StopResponse.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Handsmotion.ResetRequest> __Marshaller_handsmotion_ResetRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Handsmotion.ResetRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Handsmotion.ResetResponse> __Marshaller_handsmotion_ResetResponse = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Handsmotion.ResetResponse.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Handsmotion.StateRequest> __Marshaller_handsmotion_StateRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Handsmotion.StateRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Handsmotion.StateResponse> __Marshaller_handsmotion_StateResponse = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Handsmotion.StateResponse.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Handsmotion.OnStateChangeRequest> __Marshaller_handsmotion_OnStateChangeRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Handsmotion.OnStateChangeRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Handsmotion.OnStateChangeResponse> __Marshaller_handsmotion_OnStateChangeResponse = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Handsmotion.OnStateChangeResponse.Parser.ParseFrom);

    static readonly grpc::Method<global::Handsmotion.PlayRequest, global::Handsmotion.PlayResponse> __Method_Play = new grpc::Method<global::Handsmotion.PlayRequest, global::Handsmotion.PlayResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "Play",
        __Marshaller_handsmotion_PlayRequest,
        __Marshaller_handsmotion_PlayResponse);

    static readonly grpc::Method<global::Handsmotion.StopRequest, global::Handsmotion.StopResponse> __Method_Stop = new grpc::Method<global::Handsmotion.StopRequest, global::Handsmotion.StopResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "Stop",
        __Marshaller_handsmotion_StopRequest,
        __Marshaller_handsmotion_StopResponse);

    static readonly grpc::Method<global::Handsmotion.ResetRequest, global::Handsmotion.ResetResponse> __Method_Reset = new grpc::Method<global::Handsmotion.ResetRequest, global::Handsmotion.ResetResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "Reset",
        __Marshaller_handsmotion_ResetRequest,
        __Marshaller_handsmotion_ResetResponse);

    static readonly grpc::Method<global::Handsmotion.StateRequest, global::Handsmotion.StateResponse> __Method_State = new grpc::Method<global::Handsmotion.StateRequest, global::Handsmotion.StateResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "State",
        __Marshaller_handsmotion_StateRequest,
        __Marshaller_handsmotion_StateResponse);

    static readonly grpc::Method<global::Handsmotion.OnStateChangeRequest, global::Handsmotion.OnStateChangeResponse> __Method_OnStateChange = new grpc::Method<global::Handsmotion.OnStateChangeRequest, global::Handsmotion.OnStateChangeResponse>(
        grpc::MethodType.ServerStreaming,
        __ServiceName,
        "OnStateChange",
        __Marshaller_handsmotion_OnStateChangeRequest,
        __Marshaller_handsmotion_OnStateChangeResponse);

    /// <summary>Service descriptor</summary>
    public static global::Google.Protobuf.Reflection.ServiceDescriptor Descriptor
    {
      get { return global::Handsmotion.PlayerReflection.Descriptor.Services[0]; }
    }

    /// <summary>Base class for server-side implementations of Player</summary>
    [grpc::BindServiceMethod(typeof(Player), "BindService")]
    public abstract partial class PlayerBase
    {
      /// <summary>
      /// Play 播放手臂动作
      /// </summary>
      /// <param name="request">The request received from the client.</param>
      /// <param name="context">The context of the server-side call handler being invoked.</param>
      /// <returns>The response to send back to the client (wrapped by a task).</returns>
      public virtual global::System.Threading.Tasks.Task<global::Handsmotion.PlayResponse> Play(global::Handsmotion.PlayRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      /// <summary>
      /// Stop 停止手臂动作
      /// </summary>
      /// <param name="request">The request received from the client.</param>
      /// <param name="context">The context of the server-side call handler being invoked.</param>
      /// <returns>The response to send back to the client (wrapped by a task).</returns>
      public virtual global::System.Threading.Tasks.Task<global::Handsmotion.StopResponse> Stop(global::Handsmotion.StopRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      /// <summary>
      /// Reset 恢复手臂至初始位置
      /// </summary>
      /// <param name="request">The request received from the client.</param>
      /// <param name="context">The context of the server-side call handler being invoked.</param>
      /// <returns>The response to send back to the client (wrapped by a task).</returns>
      public virtual global::System.Threading.Tasks.Task<global::Handsmotion.ResetResponse> Reset(global::Handsmotion.ResetRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      /// <summary>
      /// State 查询当前player状态
      /// </summary>
      /// <param name="request">The request received from the client.</param>
      /// <param name="context">The context of the server-side call handler being invoked.</param>
      /// <returns>The response to send back to the client (wrapped by a task).</returns>
      public virtual global::System.Threading.Tasks.Task<global::Handsmotion.StateResponse> State(global::Handsmotion.StateRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      /// <summary>
      /// OnStateChange 监听当前player状态
      /// </summary>
      /// <param name="request">The request received from the client.</param>
      /// <param name="responseStream">Used for sending responses back to the client.</param>
      /// <param name="context">The context of the server-side call handler being invoked.</param>
      /// <returns>A task indicating completion of the handler.</returns>
      public virtual global::System.Threading.Tasks.Task OnStateChange(global::Handsmotion.OnStateChangeRequest request, grpc::IServerStreamWriter<global::Handsmotion.OnStateChangeResponse> responseStream, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

    }

    /// <summary>Client for Player</summary>
    public partial class PlayerClient : grpc::ClientBase<PlayerClient>
    {
      /// <summary>Creates a new client for Player</summary>
      /// <param name="channel">The channel to use to make remote calls.</param>
      public PlayerClient(grpc::Channel channel) : base(channel)
      {
      }
      /// <summary>Creates a new client for Player that uses a custom <c>CallInvoker</c>.</summary>
      /// <param name="callInvoker">The callInvoker to use to make remote calls.</param>
      public PlayerClient(grpc::CallInvoker callInvoker) : base(callInvoker)
      {
      }
      /// <summary>Protected parameterless constructor to allow creation of test doubles.</summary>
      protected PlayerClient() : base()
      {
      }
      /// <summary>Protected constructor to allow creation of configured clients.</summary>
      /// <param name="configuration">The client configuration.</param>
      protected PlayerClient(ClientBaseConfiguration configuration) : base(configuration)
      {
      }

      /// <summary>
      /// Play 播放手臂动作
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::Handsmotion.PlayResponse Play(global::Handsmotion.PlayRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return Play(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// Play 播放手臂动作
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::Handsmotion.PlayResponse Play(global::Handsmotion.PlayRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_Play, null, options, request);
      }
      /// <summary>
      /// Play 播放手臂动作
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::Handsmotion.PlayResponse> PlayAsync(global::Handsmotion.PlayRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return PlayAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// Play 播放手臂动作
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::Handsmotion.PlayResponse> PlayAsync(global::Handsmotion.PlayRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_Play, null, options, request);
      }
      /// <summary>
      /// Stop 停止手臂动作
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::Handsmotion.StopResponse Stop(global::Handsmotion.StopRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return Stop(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// Stop 停止手臂动作
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::Handsmotion.StopResponse Stop(global::Handsmotion.StopRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_Stop, null, options, request);
      }
      /// <summary>
      /// Stop 停止手臂动作
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::Handsmotion.StopResponse> StopAsync(global::Handsmotion.StopRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return StopAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// Stop 停止手臂动作
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::Handsmotion.StopResponse> StopAsync(global::Handsmotion.StopRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_Stop, null, options, request);
      }
      /// <summary>
      /// Reset 恢复手臂至初始位置
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::Handsmotion.ResetResponse Reset(global::Handsmotion.ResetRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return Reset(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// Reset 恢复手臂至初始位置
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::Handsmotion.ResetResponse Reset(global::Handsmotion.ResetRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_Reset, null, options, request);
      }
      /// <summary>
      /// Reset 恢复手臂至初始位置
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::Handsmotion.ResetResponse> ResetAsync(global::Handsmotion.ResetRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return ResetAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// Reset 恢复手臂至初始位置
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::Handsmotion.ResetResponse> ResetAsync(global::Handsmotion.ResetRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_Reset, null, options, request);
      }
      /// <summary>
      /// State 查询当前player状态
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::Handsmotion.StateResponse State(global::Handsmotion.StateRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return State(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// State 查询当前player状态
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::Handsmotion.StateResponse State(global::Handsmotion.StateRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_State, null, options, request);
      }
      /// <summary>
      /// State 查询当前player状态
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::Handsmotion.StateResponse> StateAsync(global::Handsmotion.StateRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return StateAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// State 查询当前player状态
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::Handsmotion.StateResponse> StateAsync(global::Handsmotion.StateRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_State, null, options, request);
      }
      /// <summary>
      /// OnStateChange 监听当前player状态
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncServerStreamingCall<global::Handsmotion.OnStateChangeResponse> OnStateChange(global::Handsmotion.OnStateChangeRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return OnStateChange(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// OnStateChange 监听当前player状态
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncServerStreamingCall<global::Handsmotion.OnStateChangeResponse> OnStateChange(global::Handsmotion.OnStateChangeRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncServerStreamingCall(__Method_OnStateChange, null, options, request);
      }
      /// <summary>Creates a new instance of client from given <c>ClientBaseConfiguration</c>.</summary>
      protected override PlayerClient NewInstance(ClientBaseConfiguration configuration)
      {
        return new PlayerClient(configuration);
      }
    }

    /// <summary>Creates service definition that can be registered with a server</summary>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    public static grpc::ServerServiceDefinition BindService(PlayerBase serviceImpl)
    {
      return grpc::ServerServiceDefinition.CreateBuilder()
          .AddMethod(__Method_Play, serviceImpl.Play)
          .AddMethod(__Method_Stop, serviceImpl.Stop)
          .AddMethod(__Method_Reset, serviceImpl.Reset)
          .AddMethod(__Method_State, serviceImpl.State)
          .AddMethod(__Method_OnStateChange, serviceImpl.OnStateChange).Build();
    }

    /// <summary>Register service method with a service binder with or without implementation. Useful when customizing the  service binding logic.
    /// Note: this method is part of an experimental API that can change or be removed without any prior notice.</summary>
    /// <param name="serviceBinder">Service methods will be bound by calling <c>AddMethod</c> on this object.</param>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    public static void BindService(grpc::ServiceBinderBase serviceBinder, PlayerBase serviceImpl)
    {
      serviceBinder.AddMethod(__Method_Play, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::Handsmotion.PlayRequest, global::Handsmotion.PlayResponse>(serviceImpl.Play));
      serviceBinder.AddMethod(__Method_Stop, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::Handsmotion.StopRequest, global::Handsmotion.StopResponse>(serviceImpl.Stop));
      serviceBinder.AddMethod(__Method_Reset, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::Handsmotion.ResetRequest, global::Handsmotion.ResetResponse>(serviceImpl.Reset));
      serviceBinder.AddMethod(__Method_State, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::Handsmotion.StateRequest, global::Handsmotion.StateResponse>(serviceImpl.State));
      serviceBinder.AddMethod(__Method_OnStateChange, serviceImpl == null ? null : new grpc::ServerStreamingServerMethod<global::Handsmotion.OnStateChangeRequest, global::Handsmotion.OnStateChangeResponse>(serviceImpl.OnStateChange));
    }

  }
}
#endregion
