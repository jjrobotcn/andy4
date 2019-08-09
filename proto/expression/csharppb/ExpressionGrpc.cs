// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: expression.proto
// </auto-generated>
#pragma warning disable 0414, 1591
#region Designer generated code

using grpc = global::Grpc.Core;

namespace ExpressionService {
  public static partial class ExpressionService
  {
    static readonly string __ServiceName = "expressionService.ExpressionService";

    static readonly grpc::Marshaller<global::ExpressionService.PlayExpressionsRequest> __Marshaller_expressionService_PlayExpressionsRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::ExpressionService.PlayExpressionsRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::ExpressionService.PlayExpressionsResponse> __Marshaller_expressionService_PlayExpressionsResponse = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::ExpressionService.PlayExpressionsResponse.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::ExpressionService.StopExpressionRequest> __Marshaller_expressionService_StopExpressionRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::ExpressionService.StopExpressionRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::ExpressionService.StopExpressionResponse> __Marshaller_expressionService_StopExpressionResponse = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::ExpressionService.StopExpressionResponse.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::ExpressionService.UploadExpressionFileRequest> __Marshaller_expressionService_UploadExpressionFileRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::ExpressionService.UploadExpressionFileRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::ExpressionService.UploadExpressionFileResponse> __Marshaller_expressionService_UploadExpressionFileResponse = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::ExpressionService.UploadExpressionFileResponse.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::ExpressionService.RenameRequest> __Marshaller_expressionService_RenameRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::ExpressionService.RenameRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::ExpressionService.RenameResponse> __Marshaller_expressionService_RenameResponse = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::ExpressionService.RenameResponse.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::ExpressionService.ListExpressionsRequest> __Marshaller_expressionService_ListExpressionsRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::ExpressionService.ListExpressionsRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::ExpressionService.ListExpressionsResponse> __Marshaller_expressionService_ListExpressionsResponse = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::ExpressionService.ListExpressionsResponse.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::ExpressionService.DeleteExpressionsRequest> __Marshaller_expressionService_DeleteExpressionsRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::ExpressionService.DeleteExpressionsRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::ExpressionService.DeleteExpressionsResponse> __Marshaller_expressionService_DeleteExpressionsResponse = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::ExpressionService.DeleteExpressionsResponse.Parser.ParseFrom);

    static readonly grpc::Method<global::ExpressionService.PlayExpressionsRequest, global::ExpressionService.PlayExpressionsResponse> __Method_PlayExpressions = new grpc::Method<global::ExpressionService.PlayExpressionsRequest, global::ExpressionService.PlayExpressionsResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "PlayExpressions",
        __Marshaller_expressionService_PlayExpressionsRequest,
        __Marshaller_expressionService_PlayExpressionsResponse);

    static readonly grpc::Method<global::ExpressionService.StopExpressionRequest, global::ExpressionService.StopExpressionResponse> __Method_StopExpression = new grpc::Method<global::ExpressionService.StopExpressionRequest, global::ExpressionService.StopExpressionResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "StopExpression",
        __Marshaller_expressionService_StopExpressionRequest,
        __Marshaller_expressionService_StopExpressionResponse);

    static readonly grpc::Method<global::ExpressionService.UploadExpressionFileRequest, global::ExpressionService.UploadExpressionFileResponse> __Method_UploadExpressionFile = new grpc::Method<global::ExpressionService.UploadExpressionFileRequest, global::ExpressionService.UploadExpressionFileResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "UploadExpressionFile",
        __Marshaller_expressionService_UploadExpressionFileRequest,
        __Marshaller_expressionService_UploadExpressionFileResponse);

    static readonly grpc::Method<global::ExpressionService.RenameRequest, global::ExpressionService.RenameResponse> __Method_Rename = new grpc::Method<global::ExpressionService.RenameRequest, global::ExpressionService.RenameResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "Rename",
        __Marshaller_expressionService_RenameRequest,
        __Marshaller_expressionService_RenameResponse);

    static readonly grpc::Method<global::ExpressionService.ListExpressionsRequest, global::ExpressionService.ListExpressionsResponse> __Method_ListExpressions = new grpc::Method<global::ExpressionService.ListExpressionsRequest, global::ExpressionService.ListExpressionsResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "ListExpressions",
        __Marshaller_expressionService_ListExpressionsRequest,
        __Marshaller_expressionService_ListExpressionsResponse);

    static readonly grpc::Method<global::ExpressionService.DeleteExpressionsRequest, global::ExpressionService.DeleteExpressionsResponse> __Method_DeleteExpressions = new grpc::Method<global::ExpressionService.DeleteExpressionsRequest, global::ExpressionService.DeleteExpressionsResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "DeleteExpressions",
        __Marshaller_expressionService_DeleteExpressionsRequest,
        __Marshaller_expressionService_DeleteExpressionsResponse);

    /// <summary>Service descriptor</summary>
    public static global::Google.Protobuf.Reflection.ServiceDescriptor Descriptor
    {
      get { return global::ExpressionService.ExpressionReflection.Descriptor.Services[0]; }
    }

    /// <summary>Base class for server-side implementations of ExpressionService</summary>
    [grpc::BindServiceMethod(typeof(ExpressionService), "BindService")]
    public abstract partial class ExpressionServiceBase
    {
      /// <summary>
      /// 播放表情
      /// </summary>
      /// <param name="request">The request received from the client.</param>
      /// <param name="context">The context of the server-side call handler being invoked.</param>
      /// <returns>The response to send back to the client (wrapped by a task).</returns>
      public virtual global::System.Threading.Tasks.Task<global::ExpressionService.PlayExpressionsResponse> PlayExpressions(global::ExpressionService.PlayExpressionsRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      /// <summary>
      /// 停止表情
      /// </summary>
      /// <param name="request">The request received from the client.</param>
      /// <param name="context">The context of the server-side call handler being invoked.</param>
      /// <returns>The response to send back to the client (wrapped by a task).</returns>
      public virtual global::System.Threading.Tasks.Task<global::ExpressionService.StopExpressionResponse> StopExpression(global::ExpressionService.StopExpressionRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      /// <summary>
      /// 上传表情
      /// </summary>
      /// <param name="request">The request received from the client.</param>
      /// <param name="context">The context of the server-side call handler being invoked.</param>
      /// <returns>The response to send back to the client (wrapped by a task).</returns>
      public virtual global::System.Threading.Tasks.Task<global::ExpressionService.UploadExpressionFileResponse> UploadExpressionFile(global::ExpressionService.UploadExpressionFileRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      /// <summary>
      /// 表情重命名
      /// >= v1.1.0
      /// </summary>
      /// <param name="request">The request received from the client.</param>
      /// <param name="context">The context of the server-side call handler being invoked.</param>
      /// <returns>The response to send back to the client (wrapped by a task).</returns>
      public virtual global::System.Threading.Tasks.Task<global::ExpressionService.RenameResponse> Rename(global::ExpressionService.RenameRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      /// <summary>
      /// 获取表情数据
      /// </summary>
      /// <param name="request">The request received from the client.</param>
      /// <param name="context">The context of the server-side call handler being invoked.</param>
      /// <returns>The response to send back to the client (wrapped by a task).</returns>
      public virtual global::System.Threading.Tasks.Task<global::ExpressionService.ListExpressionsResponse> ListExpressions(global::ExpressionService.ListExpressionsRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      /// <summary>
      /// 删除表情
      /// </summary>
      /// <param name="request">The request received from the client.</param>
      /// <param name="context">The context of the server-side call handler being invoked.</param>
      /// <returns>The response to send back to the client (wrapped by a task).</returns>
      public virtual global::System.Threading.Tasks.Task<global::ExpressionService.DeleteExpressionsResponse> DeleteExpressions(global::ExpressionService.DeleteExpressionsRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

    }

    /// <summary>Client for ExpressionService</summary>
    public partial class ExpressionServiceClient : grpc::ClientBase<ExpressionServiceClient>
    {
      /// <summary>Creates a new client for ExpressionService</summary>
      /// <param name="channel">The channel to use to make remote calls.</param>
      public ExpressionServiceClient(grpc::Channel channel) : base(channel)
      {
      }
      /// <summary>Creates a new client for ExpressionService that uses a custom <c>CallInvoker</c>.</summary>
      /// <param name="callInvoker">The callInvoker to use to make remote calls.</param>
      public ExpressionServiceClient(grpc::CallInvoker callInvoker) : base(callInvoker)
      {
      }
      /// <summary>Protected parameterless constructor to allow creation of test doubles.</summary>
      protected ExpressionServiceClient() : base()
      {
      }
      /// <summary>Protected constructor to allow creation of configured clients.</summary>
      /// <param name="configuration">The client configuration.</param>
      protected ExpressionServiceClient(ClientBaseConfiguration configuration) : base(configuration)
      {
      }

      /// <summary>
      /// 播放表情
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::ExpressionService.PlayExpressionsResponse PlayExpressions(global::ExpressionService.PlayExpressionsRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return PlayExpressions(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// 播放表情
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::ExpressionService.PlayExpressionsResponse PlayExpressions(global::ExpressionService.PlayExpressionsRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_PlayExpressions, null, options, request);
      }
      /// <summary>
      /// 播放表情
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::ExpressionService.PlayExpressionsResponse> PlayExpressionsAsync(global::ExpressionService.PlayExpressionsRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return PlayExpressionsAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// 播放表情
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::ExpressionService.PlayExpressionsResponse> PlayExpressionsAsync(global::ExpressionService.PlayExpressionsRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_PlayExpressions, null, options, request);
      }
      /// <summary>
      /// 停止表情
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::ExpressionService.StopExpressionResponse StopExpression(global::ExpressionService.StopExpressionRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return StopExpression(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// 停止表情
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::ExpressionService.StopExpressionResponse StopExpression(global::ExpressionService.StopExpressionRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_StopExpression, null, options, request);
      }
      /// <summary>
      /// 停止表情
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::ExpressionService.StopExpressionResponse> StopExpressionAsync(global::ExpressionService.StopExpressionRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return StopExpressionAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// 停止表情
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::ExpressionService.StopExpressionResponse> StopExpressionAsync(global::ExpressionService.StopExpressionRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_StopExpression, null, options, request);
      }
      /// <summary>
      /// 上传表情
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::ExpressionService.UploadExpressionFileResponse UploadExpressionFile(global::ExpressionService.UploadExpressionFileRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return UploadExpressionFile(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// 上传表情
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::ExpressionService.UploadExpressionFileResponse UploadExpressionFile(global::ExpressionService.UploadExpressionFileRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_UploadExpressionFile, null, options, request);
      }
      /// <summary>
      /// 上传表情
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::ExpressionService.UploadExpressionFileResponse> UploadExpressionFileAsync(global::ExpressionService.UploadExpressionFileRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return UploadExpressionFileAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// 上传表情
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::ExpressionService.UploadExpressionFileResponse> UploadExpressionFileAsync(global::ExpressionService.UploadExpressionFileRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_UploadExpressionFile, null, options, request);
      }
      /// <summary>
      /// 表情重命名
      /// >= v1.1.0
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::ExpressionService.RenameResponse Rename(global::ExpressionService.RenameRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return Rename(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// 表情重命名
      /// >= v1.1.0
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::ExpressionService.RenameResponse Rename(global::ExpressionService.RenameRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_Rename, null, options, request);
      }
      /// <summary>
      /// 表情重命名
      /// >= v1.1.0
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::ExpressionService.RenameResponse> RenameAsync(global::ExpressionService.RenameRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return RenameAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// 表情重命名
      /// >= v1.1.0
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::ExpressionService.RenameResponse> RenameAsync(global::ExpressionService.RenameRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_Rename, null, options, request);
      }
      /// <summary>
      /// 获取表情数据
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::ExpressionService.ListExpressionsResponse ListExpressions(global::ExpressionService.ListExpressionsRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return ListExpressions(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// 获取表情数据
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::ExpressionService.ListExpressionsResponse ListExpressions(global::ExpressionService.ListExpressionsRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_ListExpressions, null, options, request);
      }
      /// <summary>
      /// 获取表情数据
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::ExpressionService.ListExpressionsResponse> ListExpressionsAsync(global::ExpressionService.ListExpressionsRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return ListExpressionsAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// 获取表情数据
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::ExpressionService.ListExpressionsResponse> ListExpressionsAsync(global::ExpressionService.ListExpressionsRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_ListExpressions, null, options, request);
      }
      /// <summary>
      /// 删除表情
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::ExpressionService.DeleteExpressionsResponse DeleteExpressions(global::ExpressionService.DeleteExpressionsRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return DeleteExpressions(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// 删除表情
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The response received from the server.</returns>
      public virtual global::ExpressionService.DeleteExpressionsResponse DeleteExpressions(global::ExpressionService.DeleteExpressionsRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_DeleteExpressions, null, options, request);
      }
      /// <summary>
      /// 删除表情
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::ExpressionService.DeleteExpressionsResponse> DeleteExpressionsAsync(global::ExpressionService.DeleteExpressionsRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return DeleteExpressionsAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// 删除表情
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      public virtual grpc::AsyncUnaryCall<global::ExpressionService.DeleteExpressionsResponse> DeleteExpressionsAsync(global::ExpressionService.DeleteExpressionsRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_DeleteExpressions, null, options, request);
      }
      /// <summary>Creates a new instance of client from given <c>ClientBaseConfiguration</c>.</summary>
      protected override ExpressionServiceClient NewInstance(ClientBaseConfiguration configuration)
      {
        return new ExpressionServiceClient(configuration);
      }
    }

    /// <summary>Creates service definition that can be registered with a server</summary>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    public static grpc::ServerServiceDefinition BindService(ExpressionServiceBase serviceImpl)
    {
      return grpc::ServerServiceDefinition.CreateBuilder()
          .AddMethod(__Method_PlayExpressions, serviceImpl.PlayExpressions)
          .AddMethod(__Method_StopExpression, serviceImpl.StopExpression)
          .AddMethod(__Method_UploadExpressionFile, serviceImpl.UploadExpressionFile)
          .AddMethod(__Method_Rename, serviceImpl.Rename)
          .AddMethod(__Method_ListExpressions, serviceImpl.ListExpressions)
          .AddMethod(__Method_DeleteExpressions, serviceImpl.DeleteExpressions).Build();
    }

    /// <summary>Register service method with a service binder with or without implementation. Useful when customizing the  service binding logic.
    /// Note: this method is part of an experimental API that can change or be removed without any prior notice.</summary>
    /// <param name="serviceBinder">Service methods will be bound by calling <c>AddMethod</c> on this object.</param>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    public static void BindService(grpc::ServiceBinderBase serviceBinder, ExpressionServiceBase serviceImpl)
    {
      serviceBinder.AddMethod(__Method_PlayExpressions, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::ExpressionService.PlayExpressionsRequest, global::ExpressionService.PlayExpressionsResponse>(serviceImpl.PlayExpressions));
      serviceBinder.AddMethod(__Method_StopExpression, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::ExpressionService.StopExpressionRequest, global::ExpressionService.StopExpressionResponse>(serviceImpl.StopExpression));
      serviceBinder.AddMethod(__Method_UploadExpressionFile, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::ExpressionService.UploadExpressionFileRequest, global::ExpressionService.UploadExpressionFileResponse>(serviceImpl.UploadExpressionFile));
      serviceBinder.AddMethod(__Method_Rename, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::ExpressionService.RenameRequest, global::ExpressionService.RenameResponse>(serviceImpl.Rename));
      serviceBinder.AddMethod(__Method_ListExpressions, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::ExpressionService.ListExpressionsRequest, global::ExpressionService.ListExpressionsResponse>(serviceImpl.ListExpressions));
      serviceBinder.AddMethod(__Method_DeleteExpressions, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::ExpressionService.DeleteExpressionsRequest, global::ExpressionService.DeleteExpressionsResponse>(serviceImpl.DeleteExpressions));
    }

  }
}
#endregion
