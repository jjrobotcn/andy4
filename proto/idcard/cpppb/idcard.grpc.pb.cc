// Generated by the gRPC C++ plugin.
// If you make any local change, they will be lost.
// source: idcard.proto

#include "idcard.pb.h"
#include "idcard.grpc.pb.h"

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
namespace idCardService {

static const char* IDCardService_method_names[] = {
  "/idCardService.IDCardService/GetIdInfo",
};

std::unique_ptr< IDCardService::Stub> IDCardService::NewStub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options) {
  (void)options;
  std::unique_ptr< IDCardService::Stub> stub(new IDCardService::Stub(channel));
  return stub;
}

IDCardService::Stub::Stub(const std::shared_ptr< ::grpc::ChannelInterface>& channel)
  : channel_(channel), rpcmethod_GetIdInfo_(IDCardService_method_names[0], ::grpc::internal::RpcMethod::SERVER_STREAMING, channel)
  {}

::grpc::ClientReader< ::idCardService::GetIdInfoResponse>* IDCardService::Stub::GetIdInfoRaw(::grpc::ClientContext* context, const ::idCardService::GetIdInfoRequest& request) {
  return ::grpc::internal::ClientReaderFactory< ::idCardService::GetIdInfoResponse>::Create(channel_.get(), rpcmethod_GetIdInfo_, context, request);
}

void IDCardService::Stub::experimental_async::GetIdInfo(::grpc::ClientContext* context, ::idCardService::GetIdInfoRequest* request, ::grpc::experimental::ClientReadReactor< ::idCardService::GetIdInfoResponse>* reactor) {
  ::grpc::internal::ClientCallbackReaderFactory< ::idCardService::GetIdInfoResponse>::Create(stub_->channel_.get(), stub_->rpcmethod_GetIdInfo_, context, request, reactor);
}

::grpc::ClientAsyncReader< ::idCardService::GetIdInfoResponse>* IDCardService::Stub::AsyncGetIdInfoRaw(::grpc::ClientContext* context, const ::idCardService::GetIdInfoRequest& request, ::grpc::CompletionQueue* cq, void* tag) {
  return ::grpc::internal::ClientAsyncReaderFactory< ::idCardService::GetIdInfoResponse>::Create(channel_.get(), cq, rpcmethod_GetIdInfo_, context, request, true, tag);
}

::grpc::ClientAsyncReader< ::idCardService::GetIdInfoResponse>* IDCardService::Stub::PrepareAsyncGetIdInfoRaw(::grpc::ClientContext* context, const ::idCardService::GetIdInfoRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncReaderFactory< ::idCardService::GetIdInfoResponse>::Create(channel_.get(), cq, rpcmethod_GetIdInfo_, context, request, false, nullptr);
}

IDCardService::Service::Service() {
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      IDCardService_method_names[0],
      ::grpc::internal::RpcMethod::SERVER_STREAMING,
      new ::grpc::internal::ServerStreamingHandler< IDCardService::Service, ::idCardService::GetIdInfoRequest, ::idCardService::GetIdInfoResponse>(
          std::mem_fn(&IDCardService::Service::GetIdInfo), this)));
}

IDCardService::Service::~Service() {
}

::grpc::Status IDCardService::Service::GetIdInfo(::grpc::ServerContext* context, const ::idCardService::GetIdInfoRequest* request, ::grpc::ServerWriter< ::idCardService::GetIdInfoResponse>* writer) {
  (void) context;
  (void) request;
  (void) writer;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}


}  // namespace idCardService

