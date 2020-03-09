// Generated by the gRPC C++ plugin.
// If you make any local change, they will be lost.
// source: power.proto

#include "power.pb.h"
#include "power.grpc.pb.h"

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
namespace powerService {

static const char* PowerService_method_names[] = {
  "/powerService.PowerService/GetPowerStatus",
  "/powerService.PowerService/Reboot",
};

std::unique_ptr< PowerService::Stub> PowerService::NewStub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options) {
  (void)options;
  std::unique_ptr< PowerService::Stub> stub(new PowerService::Stub(channel));
  return stub;
}

PowerService::Stub::Stub(const std::shared_ptr< ::grpc::ChannelInterface>& channel)
  : channel_(channel), rpcmethod_GetPowerStatus_(PowerService_method_names[0], ::grpc::internal::RpcMethod::SERVER_STREAMING, channel)
  , rpcmethod_Reboot_(PowerService_method_names[1], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  {}

::grpc::ClientReader< ::powerService::GetPowerStatusResponse>* PowerService::Stub::GetPowerStatusRaw(::grpc::ClientContext* context, const ::powerService::GetPowerStatusRequest& request) {
  return ::grpc::internal::ClientReaderFactory< ::powerService::GetPowerStatusResponse>::Create(channel_.get(), rpcmethod_GetPowerStatus_, context, request);
}

void PowerService::Stub::experimental_async::GetPowerStatus(::grpc::ClientContext* context, ::powerService::GetPowerStatusRequest* request, ::grpc::experimental::ClientReadReactor< ::powerService::GetPowerStatusResponse>* reactor) {
  ::grpc::internal::ClientCallbackReaderFactory< ::powerService::GetPowerStatusResponse>::Create(stub_->channel_.get(), stub_->rpcmethod_GetPowerStatus_, context, request, reactor);
}

::grpc::ClientAsyncReader< ::powerService::GetPowerStatusResponse>* PowerService::Stub::AsyncGetPowerStatusRaw(::grpc::ClientContext* context, const ::powerService::GetPowerStatusRequest& request, ::grpc::CompletionQueue* cq, void* tag) {
  return ::grpc::internal::ClientAsyncReaderFactory< ::powerService::GetPowerStatusResponse>::Create(channel_.get(), cq, rpcmethod_GetPowerStatus_, context, request, true, tag);
}

::grpc::ClientAsyncReader< ::powerService::GetPowerStatusResponse>* PowerService::Stub::PrepareAsyncGetPowerStatusRaw(::grpc::ClientContext* context, const ::powerService::GetPowerStatusRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncReaderFactory< ::powerService::GetPowerStatusResponse>::Create(channel_.get(), cq, rpcmethod_GetPowerStatus_, context, request, false, nullptr);
}

::grpc::Status PowerService::Stub::Reboot(::grpc::ClientContext* context, const ::powerService::RebootRequest& request, ::powerService::RebootResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_Reboot_, context, request, response);
}

void PowerService::Stub::experimental_async::Reboot(::grpc::ClientContext* context, const ::powerService::RebootRequest* request, ::powerService::RebootResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_Reboot_, context, request, response, std::move(f));
}

void PowerService::Stub::experimental_async::Reboot(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::powerService::RebootResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_Reboot_, context, request, response, std::move(f));
}

void PowerService::Stub::experimental_async::Reboot(::grpc::ClientContext* context, const ::powerService::RebootRequest* request, ::powerService::RebootResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_Reboot_, context, request, response, reactor);
}

void PowerService::Stub::experimental_async::Reboot(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::powerService::RebootResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_Reboot_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::powerService::RebootResponse>* PowerService::Stub::AsyncRebootRaw(::grpc::ClientContext* context, const ::powerService::RebootRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::powerService::RebootResponse>::Create(channel_.get(), cq, rpcmethod_Reboot_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::powerService::RebootResponse>* PowerService::Stub::PrepareAsyncRebootRaw(::grpc::ClientContext* context, const ::powerService::RebootRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::powerService::RebootResponse>::Create(channel_.get(), cq, rpcmethod_Reboot_, context, request, false);
}

PowerService::Service::Service() {
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      PowerService_method_names[0],
      ::grpc::internal::RpcMethod::SERVER_STREAMING,
      new ::grpc::internal::ServerStreamingHandler< PowerService::Service, ::powerService::GetPowerStatusRequest, ::powerService::GetPowerStatusResponse>(
          std::mem_fn(&PowerService::Service::GetPowerStatus), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      PowerService_method_names[1],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< PowerService::Service, ::powerService::RebootRequest, ::powerService::RebootResponse>(
          std::mem_fn(&PowerService::Service::Reboot), this)));
}

PowerService::Service::~Service() {
}

::grpc::Status PowerService::Service::GetPowerStatus(::grpc::ServerContext* context, const ::powerService::GetPowerStatusRequest* request, ::grpc::ServerWriter< ::powerService::GetPowerStatusResponse>* writer) {
  (void) context;
  (void) request;
  (void) writer;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status PowerService::Service::Reboot(::grpc::ServerContext* context, const ::powerService::RebootRequest* request, ::powerService::RebootResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}


}  // namespace powerService

