// Generated by the gRPC C++ plugin.
// If you make any local change, they will be lost.
// source: expression.proto

#include "expression.pb.h"
#include "expression.grpc.pb.h"

#include <functional>
#include <grpcpp/impl/codegen/async_stream.h>
#include <grpcpp/impl/codegen/async_unary_call.h>
#include <grpcpp/impl/codegen/channel_interface.h>
#include <grpcpp/impl/codegen/client_unary_call.h>
#include <grpcpp/impl/codegen/client_callback.h>
#include <grpcpp/impl/codegen/method_handler_impl.h>
#include <grpcpp/impl/codegen/rpc_service_method.h>
#include <grpcpp/impl/codegen/server_callback.h>
#include <grpcpp/impl/codegen/service_type.h>
#include <grpcpp/impl/codegen/sync_stream.h>
namespace expressionService {

static const char* ExpressionService_method_names[] = {
  "/expressionService.ExpressionService/PlayExpressions",
  "/expressionService.ExpressionService/StopExpression",
  "/expressionService.ExpressionService/UploadExpressionFile",
  "/expressionService.ExpressionService/Rename",
  "/expressionService.ExpressionService/ListExpressions",
  "/expressionService.ExpressionService/DeleteExpressions",
};

std::unique_ptr< ExpressionService::Stub> ExpressionService::NewStub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options) {
  (void)options;
  std::unique_ptr< ExpressionService::Stub> stub(new ExpressionService::Stub(channel));
  return stub;
}

ExpressionService::Stub::Stub(const std::shared_ptr< ::grpc::ChannelInterface>& channel)
  : channel_(channel), rpcmethod_PlayExpressions_(ExpressionService_method_names[0], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_StopExpression_(ExpressionService_method_names[1], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_UploadExpressionFile_(ExpressionService_method_names[2], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_Rename_(ExpressionService_method_names[3], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_ListExpressions_(ExpressionService_method_names[4], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_DeleteExpressions_(ExpressionService_method_names[5], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  {}

::grpc::Status ExpressionService::Stub::PlayExpressions(::grpc::ClientContext* context, const ::expressionService::PlayExpressionsRequest& request, ::expressionService::PlayExpressionsResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_PlayExpressions_, context, request, response);
}

void ExpressionService::Stub::experimental_async::PlayExpressions(::grpc::ClientContext* context, const ::expressionService::PlayExpressionsRequest* request, ::expressionService::PlayExpressionsResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_PlayExpressions_, context, request, response, std::move(f));
}

void ExpressionService::Stub::experimental_async::PlayExpressions(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::expressionService::PlayExpressionsResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_PlayExpressions_, context, request, response, std::move(f));
}

void ExpressionService::Stub::experimental_async::PlayExpressions(::grpc::ClientContext* context, const ::expressionService::PlayExpressionsRequest* request, ::expressionService::PlayExpressionsResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_PlayExpressions_, context, request, response, reactor);
}

void ExpressionService::Stub::experimental_async::PlayExpressions(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::expressionService::PlayExpressionsResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_PlayExpressions_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::expressionService::PlayExpressionsResponse>* ExpressionService::Stub::AsyncPlayExpressionsRaw(::grpc::ClientContext* context, const ::expressionService::PlayExpressionsRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::expressionService::PlayExpressionsResponse>::Create(channel_.get(), cq, rpcmethod_PlayExpressions_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::expressionService::PlayExpressionsResponse>* ExpressionService::Stub::PrepareAsyncPlayExpressionsRaw(::grpc::ClientContext* context, const ::expressionService::PlayExpressionsRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::expressionService::PlayExpressionsResponse>::Create(channel_.get(), cq, rpcmethod_PlayExpressions_, context, request, false);
}

::grpc::Status ExpressionService::Stub::StopExpression(::grpc::ClientContext* context, const ::expressionService::StopExpressionRequest& request, ::expressionService::StopExpressionResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_StopExpression_, context, request, response);
}

void ExpressionService::Stub::experimental_async::StopExpression(::grpc::ClientContext* context, const ::expressionService::StopExpressionRequest* request, ::expressionService::StopExpressionResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_StopExpression_, context, request, response, std::move(f));
}

void ExpressionService::Stub::experimental_async::StopExpression(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::expressionService::StopExpressionResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_StopExpression_, context, request, response, std::move(f));
}

void ExpressionService::Stub::experimental_async::StopExpression(::grpc::ClientContext* context, const ::expressionService::StopExpressionRequest* request, ::expressionService::StopExpressionResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_StopExpression_, context, request, response, reactor);
}

void ExpressionService::Stub::experimental_async::StopExpression(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::expressionService::StopExpressionResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_StopExpression_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::expressionService::StopExpressionResponse>* ExpressionService::Stub::AsyncStopExpressionRaw(::grpc::ClientContext* context, const ::expressionService::StopExpressionRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::expressionService::StopExpressionResponse>::Create(channel_.get(), cq, rpcmethod_StopExpression_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::expressionService::StopExpressionResponse>* ExpressionService::Stub::PrepareAsyncStopExpressionRaw(::grpc::ClientContext* context, const ::expressionService::StopExpressionRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::expressionService::StopExpressionResponse>::Create(channel_.get(), cq, rpcmethod_StopExpression_, context, request, false);
}

::grpc::Status ExpressionService::Stub::UploadExpressionFile(::grpc::ClientContext* context, const ::expressionService::UploadExpressionFileRequest& request, ::expressionService::UploadExpressionFileResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_UploadExpressionFile_, context, request, response);
}

void ExpressionService::Stub::experimental_async::UploadExpressionFile(::grpc::ClientContext* context, const ::expressionService::UploadExpressionFileRequest* request, ::expressionService::UploadExpressionFileResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_UploadExpressionFile_, context, request, response, std::move(f));
}

void ExpressionService::Stub::experimental_async::UploadExpressionFile(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::expressionService::UploadExpressionFileResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_UploadExpressionFile_, context, request, response, std::move(f));
}

void ExpressionService::Stub::experimental_async::UploadExpressionFile(::grpc::ClientContext* context, const ::expressionService::UploadExpressionFileRequest* request, ::expressionService::UploadExpressionFileResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_UploadExpressionFile_, context, request, response, reactor);
}

void ExpressionService::Stub::experimental_async::UploadExpressionFile(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::expressionService::UploadExpressionFileResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_UploadExpressionFile_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::expressionService::UploadExpressionFileResponse>* ExpressionService::Stub::AsyncUploadExpressionFileRaw(::grpc::ClientContext* context, const ::expressionService::UploadExpressionFileRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::expressionService::UploadExpressionFileResponse>::Create(channel_.get(), cq, rpcmethod_UploadExpressionFile_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::expressionService::UploadExpressionFileResponse>* ExpressionService::Stub::PrepareAsyncUploadExpressionFileRaw(::grpc::ClientContext* context, const ::expressionService::UploadExpressionFileRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::expressionService::UploadExpressionFileResponse>::Create(channel_.get(), cq, rpcmethod_UploadExpressionFile_, context, request, false);
}

::grpc::Status ExpressionService::Stub::Rename(::grpc::ClientContext* context, const ::expressionService::RenameRequest& request, ::expressionService::RenameResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_Rename_, context, request, response);
}

void ExpressionService::Stub::experimental_async::Rename(::grpc::ClientContext* context, const ::expressionService::RenameRequest* request, ::expressionService::RenameResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_Rename_, context, request, response, std::move(f));
}

void ExpressionService::Stub::experimental_async::Rename(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::expressionService::RenameResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_Rename_, context, request, response, std::move(f));
}

void ExpressionService::Stub::experimental_async::Rename(::grpc::ClientContext* context, const ::expressionService::RenameRequest* request, ::expressionService::RenameResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_Rename_, context, request, response, reactor);
}

void ExpressionService::Stub::experimental_async::Rename(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::expressionService::RenameResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_Rename_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::expressionService::RenameResponse>* ExpressionService::Stub::AsyncRenameRaw(::grpc::ClientContext* context, const ::expressionService::RenameRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::expressionService::RenameResponse>::Create(channel_.get(), cq, rpcmethod_Rename_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::expressionService::RenameResponse>* ExpressionService::Stub::PrepareAsyncRenameRaw(::grpc::ClientContext* context, const ::expressionService::RenameRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::expressionService::RenameResponse>::Create(channel_.get(), cq, rpcmethod_Rename_, context, request, false);
}

::grpc::Status ExpressionService::Stub::ListExpressions(::grpc::ClientContext* context, const ::expressionService::ListExpressionsRequest& request, ::expressionService::ListExpressionsResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_ListExpressions_, context, request, response);
}

void ExpressionService::Stub::experimental_async::ListExpressions(::grpc::ClientContext* context, const ::expressionService::ListExpressionsRequest* request, ::expressionService::ListExpressionsResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_ListExpressions_, context, request, response, std::move(f));
}

void ExpressionService::Stub::experimental_async::ListExpressions(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::expressionService::ListExpressionsResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_ListExpressions_, context, request, response, std::move(f));
}

void ExpressionService::Stub::experimental_async::ListExpressions(::grpc::ClientContext* context, const ::expressionService::ListExpressionsRequest* request, ::expressionService::ListExpressionsResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_ListExpressions_, context, request, response, reactor);
}

void ExpressionService::Stub::experimental_async::ListExpressions(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::expressionService::ListExpressionsResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_ListExpressions_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::expressionService::ListExpressionsResponse>* ExpressionService::Stub::AsyncListExpressionsRaw(::grpc::ClientContext* context, const ::expressionService::ListExpressionsRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::expressionService::ListExpressionsResponse>::Create(channel_.get(), cq, rpcmethod_ListExpressions_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::expressionService::ListExpressionsResponse>* ExpressionService::Stub::PrepareAsyncListExpressionsRaw(::grpc::ClientContext* context, const ::expressionService::ListExpressionsRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::expressionService::ListExpressionsResponse>::Create(channel_.get(), cq, rpcmethod_ListExpressions_, context, request, false);
}

::grpc::Status ExpressionService::Stub::DeleteExpressions(::grpc::ClientContext* context, const ::expressionService::DeleteExpressionsRequest& request, ::expressionService::DeleteExpressionsResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_DeleteExpressions_, context, request, response);
}

void ExpressionService::Stub::experimental_async::DeleteExpressions(::grpc::ClientContext* context, const ::expressionService::DeleteExpressionsRequest* request, ::expressionService::DeleteExpressionsResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_DeleteExpressions_, context, request, response, std::move(f));
}

void ExpressionService::Stub::experimental_async::DeleteExpressions(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::expressionService::DeleteExpressionsResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_DeleteExpressions_, context, request, response, std::move(f));
}

void ExpressionService::Stub::experimental_async::DeleteExpressions(::grpc::ClientContext* context, const ::expressionService::DeleteExpressionsRequest* request, ::expressionService::DeleteExpressionsResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_DeleteExpressions_, context, request, response, reactor);
}

void ExpressionService::Stub::experimental_async::DeleteExpressions(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::expressionService::DeleteExpressionsResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_DeleteExpressions_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::expressionService::DeleteExpressionsResponse>* ExpressionService::Stub::AsyncDeleteExpressionsRaw(::grpc::ClientContext* context, const ::expressionService::DeleteExpressionsRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::expressionService::DeleteExpressionsResponse>::Create(channel_.get(), cq, rpcmethod_DeleteExpressions_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::expressionService::DeleteExpressionsResponse>* ExpressionService::Stub::PrepareAsyncDeleteExpressionsRaw(::grpc::ClientContext* context, const ::expressionService::DeleteExpressionsRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::expressionService::DeleteExpressionsResponse>::Create(channel_.get(), cq, rpcmethod_DeleteExpressions_, context, request, false);
}

ExpressionService::Service::Service() {
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      ExpressionService_method_names[0],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< ExpressionService::Service, ::expressionService::PlayExpressionsRequest, ::expressionService::PlayExpressionsResponse>(
          std::mem_fn(&ExpressionService::Service::PlayExpressions), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      ExpressionService_method_names[1],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< ExpressionService::Service, ::expressionService::StopExpressionRequest, ::expressionService::StopExpressionResponse>(
          std::mem_fn(&ExpressionService::Service::StopExpression), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      ExpressionService_method_names[2],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< ExpressionService::Service, ::expressionService::UploadExpressionFileRequest, ::expressionService::UploadExpressionFileResponse>(
          std::mem_fn(&ExpressionService::Service::UploadExpressionFile), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      ExpressionService_method_names[3],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< ExpressionService::Service, ::expressionService::RenameRequest, ::expressionService::RenameResponse>(
          std::mem_fn(&ExpressionService::Service::Rename), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      ExpressionService_method_names[4],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< ExpressionService::Service, ::expressionService::ListExpressionsRequest, ::expressionService::ListExpressionsResponse>(
          std::mem_fn(&ExpressionService::Service::ListExpressions), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      ExpressionService_method_names[5],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< ExpressionService::Service, ::expressionService::DeleteExpressionsRequest, ::expressionService::DeleteExpressionsResponse>(
          std::mem_fn(&ExpressionService::Service::DeleteExpressions), this)));
}

ExpressionService::Service::~Service() {
}

::grpc::Status ExpressionService::Service::PlayExpressions(::grpc::ServerContext* context, const ::expressionService::PlayExpressionsRequest* request, ::expressionService::PlayExpressionsResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status ExpressionService::Service::StopExpression(::grpc::ServerContext* context, const ::expressionService::StopExpressionRequest* request, ::expressionService::StopExpressionResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status ExpressionService::Service::UploadExpressionFile(::grpc::ServerContext* context, const ::expressionService::UploadExpressionFileRequest* request, ::expressionService::UploadExpressionFileResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status ExpressionService::Service::Rename(::grpc::ServerContext* context, const ::expressionService::RenameRequest* request, ::expressionService::RenameResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status ExpressionService::Service::ListExpressions(::grpc::ServerContext* context, const ::expressionService::ListExpressionsRequest* request, ::expressionService::ListExpressionsResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status ExpressionService::Service::DeleteExpressions(::grpc::ServerContext* context, const ::expressionService::DeleteExpressionsRequest* request, ::expressionService::DeleteExpressionsResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}


}  // namespace expressionService

