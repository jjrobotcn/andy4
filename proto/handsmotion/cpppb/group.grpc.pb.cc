// Generated by the gRPC C++ plugin.
// If you make any local change, they will be lost.
// source: group.proto

#include "group.pb.h"
#include "group.grpc.pb.h"

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
namespace handsmotion {

static const char* GroupManagement_method_names[] = {
  "/handsmotion.GroupManagement/NewMotionGroup",
  "/handsmotion.GroupManagement/ListMotionGroups",
  "/handsmotion.GroupManagement/DeleteMotionGroup",
  "/handsmotion.GroupManagement/GetMotionGroup",
  "/handsmotion.GroupManagement/UpdateMotionGroupMeta",
  "/handsmotion.GroupManagement/UpdateMotionGroupScripts",
};

std::unique_ptr< GroupManagement::Stub> GroupManagement::NewStub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options) {
  (void)options;
  std::unique_ptr< GroupManagement::Stub> stub(new GroupManagement::Stub(channel));
  return stub;
}

GroupManagement::Stub::Stub(const std::shared_ptr< ::grpc::ChannelInterface>& channel)
  : channel_(channel), rpcmethod_NewMotionGroup_(GroupManagement_method_names[0], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_ListMotionGroups_(GroupManagement_method_names[1], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_DeleteMotionGroup_(GroupManagement_method_names[2], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_GetMotionGroup_(GroupManagement_method_names[3], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_UpdateMotionGroupMeta_(GroupManagement_method_names[4], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_UpdateMotionGroupScripts_(GroupManagement_method_names[5], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  {}

::grpc::Status GroupManagement::Stub::NewMotionGroup(::grpc::ClientContext* context, const ::handsmotion::NewMotionGroupRequest& request, ::handsmotion::NewMotionGroupResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_NewMotionGroup_, context, request, response);
}

void GroupManagement::Stub::experimental_async::NewMotionGroup(::grpc::ClientContext* context, const ::handsmotion::NewMotionGroupRequest* request, ::handsmotion::NewMotionGroupResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_NewMotionGroup_, context, request, response, std::move(f));
}

void GroupManagement::Stub::experimental_async::NewMotionGroup(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::handsmotion::NewMotionGroupResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_NewMotionGroup_, context, request, response, std::move(f));
}

void GroupManagement::Stub::experimental_async::NewMotionGroup(::grpc::ClientContext* context, const ::handsmotion::NewMotionGroupRequest* request, ::handsmotion::NewMotionGroupResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_NewMotionGroup_, context, request, response, reactor);
}

void GroupManagement::Stub::experimental_async::NewMotionGroup(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::handsmotion::NewMotionGroupResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_NewMotionGroup_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::handsmotion::NewMotionGroupResponse>* GroupManagement::Stub::AsyncNewMotionGroupRaw(::grpc::ClientContext* context, const ::handsmotion::NewMotionGroupRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::handsmotion::NewMotionGroupResponse>::Create(channel_.get(), cq, rpcmethod_NewMotionGroup_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::handsmotion::NewMotionGroupResponse>* GroupManagement::Stub::PrepareAsyncNewMotionGroupRaw(::grpc::ClientContext* context, const ::handsmotion::NewMotionGroupRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::handsmotion::NewMotionGroupResponse>::Create(channel_.get(), cq, rpcmethod_NewMotionGroup_, context, request, false);
}

::grpc::Status GroupManagement::Stub::ListMotionGroups(::grpc::ClientContext* context, const ::handsmotion::ListMotionGroupsRequest& request, ::handsmotion::ListMotionGroupsResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_ListMotionGroups_, context, request, response);
}

void GroupManagement::Stub::experimental_async::ListMotionGroups(::grpc::ClientContext* context, const ::handsmotion::ListMotionGroupsRequest* request, ::handsmotion::ListMotionGroupsResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_ListMotionGroups_, context, request, response, std::move(f));
}

void GroupManagement::Stub::experimental_async::ListMotionGroups(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::handsmotion::ListMotionGroupsResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_ListMotionGroups_, context, request, response, std::move(f));
}

void GroupManagement::Stub::experimental_async::ListMotionGroups(::grpc::ClientContext* context, const ::handsmotion::ListMotionGroupsRequest* request, ::handsmotion::ListMotionGroupsResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_ListMotionGroups_, context, request, response, reactor);
}

void GroupManagement::Stub::experimental_async::ListMotionGroups(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::handsmotion::ListMotionGroupsResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_ListMotionGroups_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::handsmotion::ListMotionGroupsResponse>* GroupManagement::Stub::AsyncListMotionGroupsRaw(::grpc::ClientContext* context, const ::handsmotion::ListMotionGroupsRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::handsmotion::ListMotionGroupsResponse>::Create(channel_.get(), cq, rpcmethod_ListMotionGroups_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::handsmotion::ListMotionGroupsResponse>* GroupManagement::Stub::PrepareAsyncListMotionGroupsRaw(::grpc::ClientContext* context, const ::handsmotion::ListMotionGroupsRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::handsmotion::ListMotionGroupsResponse>::Create(channel_.get(), cq, rpcmethod_ListMotionGroups_, context, request, false);
}

::grpc::Status GroupManagement::Stub::DeleteMotionGroup(::grpc::ClientContext* context, const ::handsmotion::DeleteMotionGroupRequest& request, ::handsmotion::DeleteMotionGroupResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_DeleteMotionGroup_, context, request, response);
}

void GroupManagement::Stub::experimental_async::DeleteMotionGroup(::grpc::ClientContext* context, const ::handsmotion::DeleteMotionGroupRequest* request, ::handsmotion::DeleteMotionGroupResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_DeleteMotionGroup_, context, request, response, std::move(f));
}

void GroupManagement::Stub::experimental_async::DeleteMotionGroup(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::handsmotion::DeleteMotionGroupResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_DeleteMotionGroup_, context, request, response, std::move(f));
}

void GroupManagement::Stub::experimental_async::DeleteMotionGroup(::grpc::ClientContext* context, const ::handsmotion::DeleteMotionGroupRequest* request, ::handsmotion::DeleteMotionGroupResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_DeleteMotionGroup_, context, request, response, reactor);
}

void GroupManagement::Stub::experimental_async::DeleteMotionGroup(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::handsmotion::DeleteMotionGroupResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_DeleteMotionGroup_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::handsmotion::DeleteMotionGroupResponse>* GroupManagement::Stub::AsyncDeleteMotionGroupRaw(::grpc::ClientContext* context, const ::handsmotion::DeleteMotionGroupRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::handsmotion::DeleteMotionGroupResponse>::Create(channel_.get(), cq, rpcmethod_DeleteMotionGroup_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::handsmotion::DeleteMotionGroupResponse>* GroupManagement::Stub::PrepareAsyncDeleteMotionGroupRaw(::grpc::ClientContext* context, const ::handsmotion::DeleteMotionGroupRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::handsmotion::DeleteMotionGroupResponse>::Create(channel_.get(), cq, rpcmethod_DeleteMotionGroup_, context, request, false);
}

::grpc::Status GroupManagement::Stub::GetMotionGroup(::grpc::ClientContext* context, const ::handsmotion::GetMotionGroupRequest& request, ::handsmotion::GetMotionGroupResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_GetMotionGroup_, context, request, response);
}

void GroupManagement::Stub::experimental_async::GetMotionGroup(::grpc::ClientContext* context, const ::handsmotion::GetMotionGroupRequest* request, ::handsmotion::GetMotionGroupResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_GetMotionGroup_, context, request, response, std::move(f));
}

void GroupManagement::Stub::experimental_async::GetMotionGroup(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::handsmotion::GetMotionGroupResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_GetMotionGroup_, context, request, response, std::move(f));
}

void GroupManagement::Stub::experimental_async::GetMotionGroup(::grpc::ClientContext* context, const ::handsmotion::GetMotionGroupRequest* request, ::handsmotion::GetMotionGroupResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_GetMotionGroup_, context, request, response, reactor);
}

void GroupManagement::Stub::experimental_async::GetMotionGroup(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::handsmotion::GetMotionGroupResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_GetMotionGroup_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::handsmotion::GetMotionGroupResponse>* GroupManagement::Stub::AsyncGetMotionGroupRaw(::grpc::ClientContext* context, const ::handsmotion::GetMotionGroupRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::handsmotion::GetMotionGroupResponse>::Create(channel_.get(), cq, rpcmethod_GetMotionGroup_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::handsmotion::GetMotionGroupResponse>* GroupManagement::Stub::PrepareAsyncGetMotionGroupRaw(::grpc::ClientContext* context, const ::handsmotion::GetMotionGroupRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::handsmotion::GetMotionGroupResponse>::Create(channel_.get(), cq, rpcmethod_GetMotionGroup_, context, request, false);
}

::grpc::Status GroupManagement::Stub::UpdateMotionGroupMeta(::grpc::ClientContext* context, const ::handsmotion::UpdateMotionMetaRequest& request, ::handsmotion::UpdateMotionMetaResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_UpdateMotionGroupMeta_, context, request, response);
}

void GroupManagement::Stub::experimental_async::UpdateMotionGroupMeta(::grpc::ClientContext* context, const ::handsmotion::UpdateMotionMetaRequest* request, ::handsmotion::UpdateMotionMetaResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_UpdateMotionGroupMeta_, context, request, response, std::move(f));
}

void GroupManagement::Stub::experimental_async::UpdateMotionGroupMeta(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::handsmotion::UpdateMotionMetaResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_UpdateMotionGroupMeta_, context, request, response, std::move(f));
}

void GroupManagement::Stub::experimental_async::UpdateMotionGroupMeta(::grpc::ClientContext* context, const ::handsmotion::UpdateMotionMetaRequest* request, ::handsmotion::UpdateMotionMetaResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_UpdateMotionGroupMeta_, context, request, response, reactor);
}

void GroupManagement::Stub::experimental_async::UpdateMotionGroupMeta(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::handsmotion::UpdateMotionMetaResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_UpdateMotionGroupMeta_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::handsmotion::UpdateMotionMetaResponse>* GroupManagement::Stub::AsyncUpdateMotionGroupMetaRaw(::grpc::ClientContext* context, const ::handsmotion::UpdateMotionMetaRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::handsmotion::UpdateMotionMetaResponse>::Create(channel_.get(), cq, rpcmethod_UpdateMotionGroupMeta_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::handsmotion::UpdateMotionMetaResponse>* GroupManagement::Stub::PrepareAsyncUpdateMotionGroupMetaRaw(::grpc::ClientContext* context, const ::handsmotion::UpdateMotionMetaRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::handsmotion::UpdateMotionMetaResponse>::Create(channel_.get(), cq, rpcmethod_UpdateMotionGroupMeta_, context, request, false);
}

::grpc::Status GroupManagement::Stub::UpdateMotionGroupScripts(::grpc::ClientContext* context, const ::handsmotion::UpdateMotionScriptsRequest& request, ::handsmotion::UpdateMotionScriptsResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_UpdateMotionGroupScripts_, context, request, response);
}

void GroupManagement::Stub::experimental_async::UpdateMotionGroupScripts(::grpc::ClientContext* context, const ::handsmotion::UpdateMotionScriptsRequest* request, ::handsmotion::UpdateMotionScriptsResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_UpdateMotionGroupScripts_, context, request, response, std::move(f));
}

void GroupManagement::Stub::experimental_async::UpdateMotionGroupScripts(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::handsmotion::UpdateMotionScriptsResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_UpdateMotionGroupScripts_, context, request, response, std::move(f));
}

void GroupManagement::Stub::experimental_async::UpdateMotionGroupScripts(::grpc::ClientContext* context, const ::handsmotion::UpdateMotionScriptsRequest* request, ::handsmotion::UpdateMotionScriptsResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_UpdateMotionGroupScripts_, context, request, response, reactor);
}

void GroupManagement::Stub::experimental_async::UpdateMotionGroupScripts(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::handsmotion::UpdateMotionScriptsResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_UpdateMotionGroupScripts_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::handsmotion::UpdateMotionScriptsResponse>* GroupManagement::Stub::AsyncUpdateMotionGroupScriptsRaw(::grpc::ClientContext* context, const ::handsmotion::UpdateMotionScriptsRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::handsmotion::UpdateMotionScriptsResponse>::Create(channel_.get(), cq, rpcmethod_UpdateMotionGroupScripts_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::handsmotion::UpdateMotionScriptsResponse>* GroupManagement::Stub::PrepareAsyncUpdateMotionGroupScriptsRaw(::grpc::ClientContext* context, const ::handsmotion::UpdateMotionScriptsRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::handsmotion::UpdateMotionScriptsResponse>::Create(channel_.get(), cq, rpcmethod_UpdateMotionGroupScripts_, context, request, false);
}

GroupManagement::Service::Service() {
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      GroupManagement_method_names[0],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< GroupManagement::Service, ::handsmotion::NewMotionGroupRequest, ::handsmotion::NewMotionGroupResponse>(
          std::mem_fn(&GroupManagement::Service::NewMotionGroup), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      GroupManagement_method_names[1],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< GroupManagement::Service, ::handsmotion::ListMotionGroupsRequest, ::handsmotion::ListMotionGroupsResponse>(
          std::mem_fn(&GroupManagement::Service::ListMotionGroups), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      GroupManagement_method_names[2],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< GroupManagement::Service, ::handsmotion::DeleteMotionGroupRequest, ::handsmotion::DeleteMotionGroupResponse>(
          std::mem_fn(&GroupManagement::Service::DeleteMotionGroup), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      GroupManagement_method_names[3],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< GroupManagement::Service, ::handsmotion::GetMotionGroupRequest, ::handsmotion::GetMotionGroupResponse>(
          std::mem_fn(&GroupManagement::Service::GetMotionGroup), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      GroupManagement_method_names[4],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< GroupManagement::Service, ::handsmotion::UpdateMotionMetaRequest, ::handsmotion::UpdateMotionMetaResponse>(
          std::mem_fn(&GroupManagement::Service::UpdateMotionGroupMeta), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      GroupManagement_method_names[5],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< GroupManagement::Service, ::handsmotion::UpdateMotionScriptsRequest, ::handsmotion::UpdateMotionScriptsResponse>(
          std::mem_fn(&GroupManagement::Service::UpdateMotionGroupScripts), this)));
}

GroupManagement::Service::~Service() {
}

::grpc::Status GroupManagement::Service::NewMotionGroup(::grpc::ServerContext* context, const ::handsmotion::NewMotionGroupRequest* request, ::handsmotion::NewMotionGroupResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status GroupManagement::Service::ListMotionGroups(::grpc::ServerContext* context, const ::handsmotion::ListMotionGroupsRequest* request, ::handsmotion::ListMotionGroupsResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status GroupManagement::Service::DeleteMotionGroup(::grpc::ServerContext* context, const ::handsmotion::DeleteMotionGroupRequest* request, ::handsmotion::DeleteMotionGroupResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status GroupManagement::Service::GetMotionGroup(::grpc::ServerContext* context, const ::handsmotion::GetMotionGroupRequest* request, ::handsmotion::GetMotionGroupResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status GroupManagement::Service::UpdateMotionGroupMeta(::grpc::ServerContext* context, const ::handsmotion::UpdateMotionMetaRequest* request, ::handsmotion::UpdateMotionMetaResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status GroupManagement::Service::UpdateMotionGroupScripts(::grpc::ServerContext* context, const ::handsmotion::UpdateMotionScriptsRequest* request, ::handsmotion::UpdateMotionScriptsResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}


}  // namespace handsmotion

