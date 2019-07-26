// Generated by the gRPC C++ plugin.
// If you make any local change, they will be lost.
// source: messaging.proto

#include "messaging.pb.h"
#include "messaging.grpc.pb.h"

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
namespace messaging {

static const char* MessagingService_method_names[] = {
  "/messaging.MessagingService/Messaging",
};

std::unique_ptr< MessagingService::Stub> MessagingService::NewStub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options) {
  (void)options;
  std::unique_ptr< MessagingService::Stub> stub(new MessagingService::Stub(channel));
  return stub;
}

MessagingService::Stub::Stub(const std::shared_ptr< ::grpc::ChannelInterface>& channel)
  : channel_(channel), rpcmethod_Messaging_(MessagingService_method_names[0], ::grpc::internal::RpcMethod::BIDI_STREAMING, channel)
  {}

::grpc::ClientReaderWriter< ::messaging::MessagingRequest, ::messaging::MessagingResponse>* MessagingService::Stub::MessagingRaw(::grpc::ClientContext* context) {
  return ::grpc::internal::ClientReaderWriterFactory< ::messaging::MessagingRequest, ::messaging::MessagingResponse>::Create(channel_.get(), rpcmethod_Messaging_, context);
}

void MessagingService::Stub::experimental_async::Messaging(::grpc::ClientContext* context, ::grpc::experimental::ClientBidiReactor< ::messaging::MessagingRequest,::messaging::MessagingResponse>* reactor) {
  ::grpc::internal::ClientCallbackReaderWriterFactory< ::messaging::MessagingRequest,::messaging::MessagingResponse>::Create(stub_->channel_.get(), stub_->rpcmethod_Messaging_, context, reactor);
}

::grpc::ClientAsyncReaderWriter< ::messaging::MessagingRequest, ::messaging::MessagingResponse>* MessagingService::Stub::AsyncMessagingRaw(::grpc::ClientContext* context, ::grpc::CompletionQueue* cq, void* tag) {
  return ::grpc::internal::ClientAsyncReaderWriterFactory< ::messaging::MessagingRequest, ::messaging::MessagingResponse>::Create(channel_.get(), cq, rpcmethod_Messaging_, context, true, tag);
}

::grpc::ClientAsyncReaderWriter< ::messaging::MessagingRequest, ::messaging::MessagingResponse>* MessagingService::Stub::PrepareAsyncMessagingRaw(::grpc::ClientContext* context, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncReaderWriterFactory< ::messaging::MessagingRequest, ::messaging::MessagingResponse>::Create(channel_.get(), cq, rpcmethod_Messaging_, context, false, nullptr);
}

MessagingService::Service::Service() {
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      MessagingService_method_names[0],
      ::grpc::internal::RpcMethod::BIDI_STREAMING,
      new ::grpc::internal::BidiStreamingHandler< MessagingService::Service, ::messaging::MessagingRequest, ::messaging::MessagingResponse>(
          std::mem_fn(&MessagingService::Service::Messaging), this)));
}

MessagingService::Service::~Service() {
}

::grpc::Status MessagingService::Service::Messaging(::grpc::ServerContext* context, ::grpc::ServerReaderWriter< ::messaging::MessagingResponse, ::messaging::MessagingRequest>* stream) {
  (void) context;
  (void) stream;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}


}  // namespace messaging
