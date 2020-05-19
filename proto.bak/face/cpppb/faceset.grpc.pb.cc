// Generated by the gRPC C++ plugin.
// If you make any local change, they will be lost.
// source: faceset.proto

#include "faceset.pb.h"
#include "faceset.grpc.pb.h"

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
namespace faceRecognition {

static const char* FaceSetService_method_names[] = {
  "/faceRecognition.FaceSetService/NewFaceSet",
  "/faceRecognition.FaceSetService/DeleteFaceSet",
  "/faceRecognition.FaceSetService/UpdateFaceSet",
  "/faceRecognition.FaceSetService/ListFaceSets",
  "/faceRecognition.FaceSetService/AddFace",
  "/faceRecognition.FaceSetService/RemoveFace",
  "/faceRecognition.FaceSetService/FaceDetail",
  "/faceRecognition.FaceSetService/ListFaceDetails",
};

std::unique_ptr< FaceSetService::Stub> FaceSetService::NewStub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options) {
  (void)options;
  std::unique_ptr< FaceSetService::Stub> stub(new FaceSetService::Stub(channel));
  return stub;
}

FaceSetService::Stub::Stub(const std::shared_ptr< ::grpc::ChannelInterface>& channel)
  : channel_(channel), rpcmethod_NewFaceSet_(FaceSetService_method_names[0], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_DeleteFaceSet_(FaceSetService_method_names[1], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_UpdateFaceSet_(FaceSetService_method_names[2], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_ListFaceSets_(FaceSetService_method_names[3], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_AddFace_(FaceSetService_method_names[4], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_RemoveFace_(FaceSetService_method_names[5], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_FaceDetail_(FaceSetService_method_names[6], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_ListFaceDetails_(FaceSetService_method_names[7], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  {}

::grpc::Status FaceSetService::Stub::NewFaceSet(::grpc::ClientContext* context, const ::faceRecognition::NewFaceSetRequest& request, ::faceRecognition::NewFaceSetResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_NewFaceSet_, context, request, response);
}

void FaceSetService::Stub::experimental_async::NewFaceSet(::grpc::ClientContext* context, const ::faceRecognition::NewFaceSetRequest* request, ::faceRecognition::NewFaceSetResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_NewFaceSet_, context, request, response, std::move(f));
}

void FaceSetService::Stub::experimental_async::NewFaceSet(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::faceRecognition::NewFaceSetResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_NewFaceSet_, context, request, response, std::move(f));
}

void FaceSetService::Stub::experimental_async::NewFaceSet(::grpc::ClientContext* context, const ::faceRecognition::NewFaceSetRequest* request, ::faceRecognition::NewFaceSetResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_NewFaceSet_, context, request, response, reactor);
}

void FaceSetService::Stub::experimental_async::NewFaceSet(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::faceRecognition::NewFaceSetResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_NewFaceSet_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::faceRecognition::NewFaceSetResponse>* FaceSetService::Stub::AsyncNewFaceSetRaw(::grpc::ClientContext* context, const ::faceRecognition::NewFaceSetRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::faceRecognition::NewFaceSetResponse>::Create(channel_.get(), cq, rpcmethod_NewFaceSet_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::faceRecognition::NewFaceSetResponse>* FaceSetService::Stub::PrepareAsyncNewFaceSetRaw(::grpc::ClientContext* context, const ::faceRecognition::NewFaceSetRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::faceRecognition::NewFaceSetResponse>::Create(channel_.get(), cq, rpcmethod_NewFaceSet_, context, request, false);
}

::grpc::Status FaceSetService::Stub::DeleteFaceSet(::grpc::ClientContext* context, const ::faceRecognition::DeleteFaceSetRequest& request, ::faceRecognition::DeleteFaceSetResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_DeleteFaceSet_, context, request, response);
}

void FaceSetService::Stub::experimental_async::DeleteFaceSet(::grpc::ClientContext* context, const ::faceRecognition::DeleteFaceSetRequest* request, ::faceRecognition::DeleteFaceSetResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_DeleteFaceSet_, context, request, response, std::move(f));
}

void FaceSetService::Stub::experimental_async::DeleteFaceSet(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::faceRecognition::DeleteFaceSetResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_DeleteFaceSet_, context, request, response, std::move(f));
}

void FaceSetService::Stub::experimental_async::DeleteFaceSet(::grpc::ClientContext* context, const ::faceRecognition::DeleteFaceSetRequest* request, ::faceRecognition::DeleteFaceSetResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_DeleteFaceSet_, context, request, response, reactor);
}

void FaceSetService::Stub::experimental_async::DeleteFaceSet(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::faceRecognition::DeleteFaceSetResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_DeleteFaceSet_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::faceRecognition::DeleteFaceSetResponse>* FaceSetService::Stub::AsyncDeleteFaceSetRaw(::grpc::ClientContext* context, const ::faceRecognition::DeleteFaceSetRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::faceRecognition::DeleteFaceSetResponse>::Create(channel_.get(), cq, rpcmethod_DeleteFaceSet_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::faceRecognition::DeleteFaceSetResponse>* FaceSetService::Stub::PrepareAsyncDeleteFaceSetRaw(::grpc::ClientContext* context, const ::faceRecognition::DeleteFaceSetRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::faceRecognition::DeleteFaceSetResponse>::Create(channel_.get(), cq, rpcmethod_DeleteFaceSet_, context, request, false);
}

::grpc::Status FaceSetService::Stub::UpdateFaceSet(::grpc::ClientContext* context, const ::faceRecognition::UpdateFaceSetRequest& request, ::faceRecognition::UpdateFaceSetResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_UpdateFaceSet_, context, request, response);
}

void FaceSetService::Stub::experimental_async::UpdateFaceSet(::grpc::ClientContext* context, const ::faceRecognition::UpdateFaceSetRequest* request, ::faceRecognition::UpdateFaceSetResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_UpdateFaceSet_, context, request, response, std::move(f));
}

void FaceSetService::Stub::experimental_async::UpdateFaceSet(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::faceRecognition::UpdateFaceSetResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_UpdateFaceSet_, context, request, response, std::move(f));
}

void FaceSetService::Stub::experimental_async::UpdateFaceSet(::grpc::ClientContext* context, const ::faceRecognition::UpdateFaceSetRequest* request, ::faceRecognition::UpdateFaceSetResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_UpdateFaceSet_, context, request, response, reactor);
}

void FaceSetService::Stub::experimental_async::UpdateFaceSet(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::faceRecognition::UpdateFaceSetResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_UpdateFaceSet_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::faceRecognition::UpdateFaceSetResponse>* FaceSetService::Stub::AsyncUpdateFaceSetRaw(::grpc::ClientContext* context, const ::faceRecognition::UpdateFaceSetRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::faceRecognition::UpdateFaceSetResponse>::Create(channel_.get(), cq, rpcmethod_UpdateFaceSet_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::faceRecognition::UpdateFaceSetResponse>* FaceSetService::Stub::PrepareAsyncUpdateFaceSetRaw(::grpc::ClientContext* context, const ::faceRecognition::UpdateFaceSetRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::faceRecognition::UpdateFaceSetResponse>::Create(channel_.get(), cq, rpcmethod_UpdateFaceSet_, context, request, false);
}

::grpc::Status FaceSetService::Stub::ListFaceSets(::grpc::ClientContext* context, const ::faceRecognition::ListFaceSetsRequest& request, ::faceRecognition::ListFaceSetsResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_ListFaceSets_, context, request, response);
}

void FaceSetService::Stub::experimental_async::ListFaceSets(::grpc::ClientContext* context, const ::faceRecognition::ListFaceSetsRequest* request, ::faceRecognition::ListFaceSetsResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_ListFaceSets_, context, request, response, std::move(f));
}

void FaceSetService::Stub::experimental_async::ListFaceSets(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::faceRecognition::ListFaceSetsResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_ListFaceSets_, context, request, response, std::move(f));
}

void FaceSetService::Stub::experimental_async::ListFaceSets(::grpc::ClientContext* context, const ::faceRecognition::ListFaceSetsRequest* request, ::faceRecognition::ListFaceSetsResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_ListFaceSets_, context, request, response, reactor);
}

void FaceSetService::Stub::experimental_async::ListFaceSets(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::faceRecognition::ListFaceSetsResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_ListFaceSets_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::faceRecognition::ListFaceSetsResponse>* FaceSetService::Stub::AsyncListFaceSetsRaw(::grpc::ClientContext* context, const ::faceRecognition::ListFaceSetsRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::faceRecognition::ListFaceSetsResponse>::Create(channel_.get(), cq, rpcmethod_ListFaceSets_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::faceRecognition::ListFaceSetsResponse>* FaceSetService::Stub::PrepareAsyncListFaceSetsRaw(::grpc::ClientContext* context, const ::faceRecognition::ListFaceSetsRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::faceRecognition::ListFaceSetsResponse>::Create(channel_.get(), cq, rpcmethod_ListFaceSets_, context, request, false);
}

::grpc::Status FaceSetService::Stub::AddFace(::grpc::ClientContext* context, const ::faceRecognition::AddFaceRequest& request, ::faceRecognition::AddFaceResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_AddFace_, context, request, response);
}

void FaceSetService::Stub::experimental_async::AddFace(::grpc::ClientContext* context, const ::faceRecognition::AddFaceRequest* request, ::faceRecognition::AddFaceResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_AddFace_, context, request, response, std::move(f));
}

void FaceSetService::Stub::experimental_async::AddFace(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::faceRecognition::AddFaceResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_AddFace_, context, request, response, std::move(f));
}

void FaceSetService::Stub::experimental_async::AddFace(::grpc::ClientContext* context, const ::faceRecognition::AddFaceRequest* request, ::faceRecognition::AddFaceResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_AddFace_, context, request, response, reactor);
}

void FaceSetService::Stub::experimental_async::AddFace(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::faceRecognition::AddFaceResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_AddFace_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::faceRecognition::AddFaceResponse>* FaceSetService::Stub::AsyncAddFaceRaw(::grpc::ClientContext* context, const ::faceRecognition::AddFaceRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::faceRecognition::AddFaceResponse>::Create(channel_.get(), cq, rpcmethod_AddFace_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::faceRecognition::AddFaceResponse>* FaceSetService::Stub::PrepareAsyncAddFaceRaw(::grpc::ClientContext* context, const ::faceRecognition::AddFaceRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::faceRecognition::AddFaceResponse>::Create(channel_.get(), cq, rpcmethod_AddFace_, context, request, false);
}

::grpc::Status FaceSetService::Stub::RemoveFace(::grpc::ClientContext* context, const ::faceRecognition::RemoveFaceRequest& request, ::faceRecognition::RemoveFaceResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_RemoveFace_, context, request, response);
}

void FaceSetService::Stub::experimental_async::RemoveFace(::grpc::ClientContext* context, const ::faceRecognition::RemoveFaceRequest* request, ::faceRecognition::RemoveFaceResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_RemoveFace_, context, request, response, std::move(f));
}

void FaceSetService::Stub::experimental_async::RemoveFace(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::faceRecognition::RemoveFaceResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_RemoveFace_, context, request, response, std::move(f));
}

void FaceSetService::Stub::experimental_async::RemoveFace(::grpc::ClientContext* context, const ::faceRecognition::RemoveFaceRequest* request, ::faceRecognition::RemoveFaceResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_RemoveFace_, context, request, response, reactor);
}

void FaceSetService::Stub::experimental_async::RemoveFace(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::faceRecognition::RemoveFaceResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_RemoveFace_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::faceRecognition::RemoveFaceResponse>* FaceSetService::Stub::AsyncRemoveFaceRaw(::grpc::ClientContext* context, const ::faceRecognition::RemoveFaceRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::faceRecognition::RemoveFaceResponse>::Create(channel_.get(), cq, rpcmethod_RemoveFace_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::faceRecognition::RemoveFaceResponse>* FaceSetService::Stub::PrepareAsyncRemoveFaceRaw(::grpc::ClientContext* context, const ::faceRecognition::RemoveFaceRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::faceRecognition::RemoveFaceResponse>::Create(channel_.get(), cq, rpcmethod_RemoveFace_, context, request, false);
}

::grpc::Status FaceSetService::Stub::FaceDetail(::grpc::ClientContext* context, const ::faceRecognition::FaceDetailRequest& request, ::faceRecognition::FaceDetailResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_FaceDetail_, context, request, response);
}

void FaceSetService::Stub::experimental_async::FaceDetail(::grpc::ClientContext* context, const ::faceRecognition::FaceDetailRequest* request, ::faceRecognition::FaceDetailResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_FaceDetail_, context, request, response, std::move(f));
}

void FaceSetService::Stub::experimental_async::FaceDetail(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::faceRecognition::FaceDetailResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_FaceDetail_, context, request, response, std::move(f));
}

void FaceSetService::Stub::experimental_async::FaceDetail(::grpc::ClientContext* context, const ::faceRecognition::FaceDetailRequest* request, ::faceRecognition::FaceDetailResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_FaceDetail_, context, request, response, reactor);
}

void FaceSetService::Stub::experimental_async::FaceDetail(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::faceRecognition::FaceDetailResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_FaceDetail_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::faceRecognition::FaceDetailResponse>* FaceSetService::Stub::AsyncFaceDetailRaw(::grpc::ClientContext* context, const ::faceRecognition::FaceDetailRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::faceRecognition::FaceDetailResponse>::Create(channel_.get(), cq, rpcmethod_FaceDetail_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::faceRecognition::FaceDetailResponse>* FaceSetService::Stub::PrepareAsyncFaceDetailRaw(::grpc::ClientContext* context, const ::faceRecognition::FaceDetailRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::faceRecognition::FaceDetailResponse>::Create(channel_.get(), cq, rpcmethod_FaceDetail_, context, request, false);
}

::grpc::Status FaceSetService::Stub::ListFaceDetails(::grpc::ClientContext* context, const ::faceRecognition::ListFaceDetailsRequest& request, ::faceRecognition::ListFaceDetailsResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_ListFaceDetails_, context, request, response);
}

void FaceSetService::Stub::experimental_async::ListFaceDetails(::grpc::ClientContext* context, const ::faceRecognition::ListFaceDetailsRequest* request, ::faceRecognition::ListFaceDetailsResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_ListFaceDetails_, context, request, response, std::move(f));
}

void FaceSetService::Stub::experimental_async::ListFaceDetails(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::faceRecognition::ListFaceDetailsResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_ListFaceDetails_, context, request, response, std::move(f));
}

void FaceSetService::Stub::experimental_async::ListFaceDetails(::grpc::ClientContext* context, const ::faceRecognition::ListFaceDetailsRequest* request, ::faceRecognition::ListFaceDetailsResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_ListFaceDetails_, context, request, response, reactor);
}

void FaceSetService::Stub::experimental_async::ListFaceDetails(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::faceRecognition::ListFaceDetailsResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_ListFaceDetails_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::faceRecognition::ListFaceDetailsResponse>* FaceSetService::Stub::AsyncListFaceDetailsRaw(::grpc::ClientContext* context, const ::faceRecognition::ListFaceDetailsRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::faceRecognition::ListFaceDetailsResponse>::Create(channel_.get(), cq, rpcmethod_ListFaceDetails_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::faceRecognition::ListFaceDetailsResponse>* FaceSetService::Stub::PrepareAsyncListFaceDetailsRaw(::grpc::ClientContext* context, const ::faceRecognition::ListFaceDetailsRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::faceRecognition::ListFaceDetailsResponse>::Create(channel_.get(), cq, rpcmethod_ListFaceDetails_, context, request, false);
}

FaceSetService::Service::Service() {
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      FaceSetService_method_names[0],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< FaceSetService::Service, ::faceRecognition::NewFaceSetRequest, ::faceRecognition::NewFaceSetResponse>(
          std::mem_fn(&FaceSetService::Service::NewFaceSet), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      FaceSetService_method_names[1],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< FaceSetService::Service, ::faceRecognition::DeleteFaceSetRequest, ::faceRecognition::DeleteFaceSetResponse>(
          std::mem_fn(&FaceSetService::Service::DeleteFaceSet), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      FaceSetService_method_names[2],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< FaceSetService::Service, ::faceRecognition::UpdateFaceSetRequest, ::faceRecognition::UpdateFaceSetResponse>(
          std::mem_fn(&FaceSetService::Service::UpdateFaceSet), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      FaceSetService_method_names[3],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< FaceSetService::Service, ::faceRecognition::ListFaceSetsRequest, ::faceRecognition::ListFaceSetsResponse>(
          std::mem_fn(&FaceSetService::Service::ListFaceSets), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      FaceSetService_method_names[4],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< FaceSetService::Service, ::faceRecognition::AddFaceRequest, ::faceRecognition::AddFaceResponse>(
          std::mem_fn(&FaceSetService::Service::AddFace), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      FaceSetService_method_names[5],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< FaceSetService::Service, ::faceRecognition::RemoveFaceRequest, ::faceRecognition::RemoveFaceResponse>(
          std::mem_fn(&FaceSetService::Service::RemoveFace), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      FaceSetService_method_names[6],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< FaceSetService::Service, ::faceRecognition::FaceDetailRequest, ::faceRecognition::FaceDetailResponse>(
          std::mem_fn(&FaceSetService::Service::FaceDetail), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      FaceSetService_method_names[7],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< FaceSetService::Service, ::faceRecognition::ListFaceDetailsRequest, ::faceRecognition::ListFaceDetailsResponse>(
          std::mem_fn(&FaceSetService::Service::ListFaceDetails), this)));
}

FaceSetService::Service::~Service() {
}

::grpc::Status FaceSetService::Service::NewFaceSet(::grpc::ServerContext* context, const ::faceRecognition::NewFaceSetRequest* request, ::faceRecognition::NewFaceSetResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status FaceSetService::Service::DeleteFaceSet(::grpc::ServerContext* context, const ::faceRecognition::DeleteFaceSetRequest* request, ::faceRecognition::DeleteFaceSetResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status FaceSetService::Service::UpdateFaceSet(::grpc::ServerContext* context, const ::faceRecognition::UpdateFaceSetRequest* request, ::faceRecognition::UpdateFaceSetResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status FaceSetService::Service::ListFaceSets(::grpc::ServerContext* context, const ::faceRecognition::ListFaceSetsRequest* request, ::faceRecognition::ListFaceSetsResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status FaceSetService::Service::AddFace(::grpc::ServerContext* context, const ::faceRecognition::AddFaceRequest* request, ::faceRecognition::AddFaceResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status FaceSetService::Service::RemoveFace(::grpc::ServerContext* context, const ::faceRecognition::RemoveFaceRequest* request, ::faceRecognition::RemoveFaceResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status FaceSetService::Service::FaceDetail(::grpc::ServerContext* context, const ::faceRecognition::FaceDetailRequest* request, ::faceRecognition::FaceDetailResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status FaceSetService::Service::ListFaceDetails(::grpc::ServerContext* context, const ::faceRecognition::ListFaceDetailsRequest* request, ::faceRecognition::ListFaceDetailsResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}


}  // namespace faceRecognition
