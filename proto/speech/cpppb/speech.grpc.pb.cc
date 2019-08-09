// Generated by the gRPC C++ plugin.
// If you make any local change, they will be lost.
// source: speech.proto

#include "speech.pb.h"
#include "speech.grpc.pb.h"

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
namespace speechService {

static const char* SpeechService_method_names[] = {
  "/speechService.SpeechService/ListenSpeechEvent",
  "/speechService.SpeechService/TextToSpeech",
  "/speechService.SpeechService/SpeechStop",
  "/speechService.SpeechService/WakeUp",
  "/speechService.SpeechService/Hibernate",
  "/speechService.SpeechService/SetVoiceVolume",
  "/speechService.SpeechService/GetVoiceVolume",
  "/speechService.SpeechService/SetParams",
};

std::unique_ptr< SpeechService::Stub> SpeechService::NewStub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options) {
  (void)options;
  std::unique_ptr< SpeechService::Stub> stub(new SpeechService::Stub(channel));
  return stub;
}

SpeechService::Stub::Stub(const std::shared_ptr< ::grpc::ChannelInterface>& channel)
  : channel_(channel), rpcmethod_ListenSpeechEvent_(SpeechService_method_names[0], ::grpc::internal::RpcMethod::SERVER_STREAMING, channel)
  , rpcmethod_TextToSpeech_(SpeechService_method_names[1], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_SpeechStop_(SpeechService_method_names[2], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_WakeUp_(SpeechService_method_names[3], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_Hibernate_(SpeechService_method_names[4], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_SetVoiceVolume_(SpeechService_method_names[5], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_GetVoiceVolume_(SpeechService_method_names[6], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_SetParams_(SpeechService_method_names[7], ::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  {}

::grpc::ClientReader< ::speechService::ListenSpeechEventResponse>* SpeechService::Stub::ListenSpeechEventRaw(::grpc::ClientContext* context, const ::speechService::ListenSpeechEventRequest& request) {
  return ::grpc::internal::ClientReaderFactory< ::speechService::ListenSpeechEventResponse>::Create(channel_.get(), rpcmethod_ListenSpeechEvent_, context, request);
}

void SpeechService::Stub::experimental_async::ListenSpeechEvent(::grpc::ClientContext* context, ::speechService::ListenSpeechEventRequest* request, ::grpc::experimental::ClientReadReactor< ::speechService::ListenSpeechEventResponse>* reactor) {
  ::grpc::internal::ClientCallbackReaderFactory< ::speechService::ListenSpeechEventResponse>::Create(stub_->channel_.get(), stub_->rpcmethod_ListenSpeechEvent_, context, request, reactor);
}

::grpc::ClientAsyncReader< ::speechService::ListenSpeechEventResponse>* SpeechService::Stub::AsyncListenSpeechEventRaw(::grpc::ClientContext* context, const ::speechService::ListenSpeechEventRequest& request, ::grpc::CompletionQueue* cq, void* tag) {
  return ::grpc::internal::ClientAsyncReaderFactory< ::speechService::ListenSpeechEventResponse>::Create(channel_.get(), cq, rpcmethod_ListenSpeechEvent_, context, request, true, tag);
}

::grpc::ClientAsyncReader< ::speechService::ListenSpeechEventResponse>* SpeechService::Stub::PrepareAsyncListenSpeechEventRaw(::grpc::ClientContext* context, const ::speechService::ListenSpeechEventRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncReaderFactory< ::speechService::ListenSpeechEventResponse>::Create(channel_.get(), cq, rpcmethod_ListenSpeechEvent_, context, request, false, nullptr);
}

::grpc::Status SpeechService::Stub::TextToSpeech(::grpc::ClientContext* context, const ::speechService::TextToSpeechRequest& request, ::speechService::TextToSpeechResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_TextToSpeech_, context, request, response);
}

void SpeechService::Stub::experimental_async::TextToSpeech(::grpc::ClientContext* context, const ::speechService::TextToSpeechRequest* request, ::speechService::TextToSpeechResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_TextToSpeech_, context, request, response, std::move(f));
}

void SpeechService::Stub::experimental_async::TextToSpeech(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::speechService::TextToSpeechResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_TextToSpeech_, context, request, response, std::move(f));
}

void SpeechService::Stub::experimental_async::TextToSpeech(::grpc::ClientContext* context, const ::speechService::TextToSpeechRequest* request, ::speechService::TextToSpeechResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_TextToSpeech_, context, request, response, reactor);
}

void SpeechService::Stub::experimental_async::TextToSpeech(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::speechService::TextToSpeechResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_TextToSpeech_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::speechService::TextToSpeechResponse>* SpeechService::Stub::AsyncTextToSpeechRaw(::grpc::ClientContext* context, const ::speechService::TextToSpeechRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::speechService::TextToSpeechResponse>::Create(channel_.get(), cq, rpcmethod_TextToSpeech_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::speechService::TextToSpeechResponse>* SpeechService::Stub::PrepareAsyncTextToSpeechRaw(::grpc::ClientContext* context, const ::speechService::TextToSpeechRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::speechService::TextToSpeechResponse>::Create(channel_.get(), cq, rpcmethod_TextToSpeech_, context, request, false);
}

::grpc::Status SpeechService::Stub::SpeechStop(::grpc::ClientContext* context, const ::speechService::SpeechStopRequest& request, ::speechService::SpeechStopResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_SpeechStop_, context, request, response);
}

void SpeechService::Stub::experimental_async::SpeechStop(::grpc::ClientContext* context, const ::speechService::SpeechStopRequest* request, ::speechService::SpeechStopResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_SpeechStop_, context, request, response, std::move(f));
}

void SpeechService::Stub::experimental_async::SpeechStop(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::speechService::SpeechStopResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_SpeechStop_, context, request, response, std::move(f));
}

void SpeechService::Stub::experimental_async::SpeechStop(::grpc::ClientContext* context, const ::speechService::SpeechStopRequest* request, ::speechService::SpeechStopResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_SpeechStop_, context, request, response, reactor);
}

void SpeechService::Stub::experimental_async::SpeechStop(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::speechService::SpeechStopResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_SpeechStop_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::speechService::SpeechStopResponse>* SpeechService::Stub::AsyncSpeechStopRaw(::grpc::ClientContext* context, const ::speechService::SpeechStopRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::speechService::SpeechStopResponse>::Create(channel_.get(), cq, rpcmethod_SpeechStop_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::speechService::SpeechStopResponse>* SpeechService::Stub::PrepareAsyncSpeechStopRaw(::grpc::ClientContext* context, const ::speechService::SpeechStopRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::speechService::SpeechStopResponse>::Create(channel_.get(), cq, rpcmethod_SpeechStop_, context, request, false);
}

::grpc::Status SpeechService::Stub::WakeUp(::grpc::ClientContext* context, const ::speechService::WakeUpRequest& request, ::speechService::WakeUpResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_WakeUp_, context, request, response);
}

void SpeechService::Stub::experimental_async::WakeUp(::grpc::ClientContext* context, const ::speechService::WakeUpRequest* request, ::speechService::WakeUpResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_WakeUp_, context, request, response, std::move(f));
}

void SpeechService::Stub::experimental_async::WakeUp(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::speechService::WakeUpResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_WakeUp_, context, request, response, std::move(f));
}

void SpeechService::Stub::experimental_async::WakeUp(::grpc::ClientContext* context, const ::speechService::WakeUpRequest* request, ::speechService::WakeUpResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_WakeUp_, context, request, response, reactor);
}

void SpeechService::Stub::experimental_async::WakeUp(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::speechService::WakeUpResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_WakeUp_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::speechService::WakeUpResponse>* SpeechService::Stub::AsyncWakeUpRaw(::grpc::ClientContext* context, const ::speechService::WakeUpRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::speechService::WakeUpResponse>::Create(channel_.get(), cq, rpcmethod_WakeUp_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::speechService::WakeUpResponse>* SpeechService::Stub::PrepareAsyncWakeUpRaw(::grpc::ClientContext* context, const ::speechService::WakeUpRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::speechService::WakeUpResponse>::Create(channel_.get(), cq, rpcmethod_WakeUp_, context, request, false);
}

::grpc::Status SpeechService::Stub::Hibernate(::grpc::ClientContext* context, const ::speechService::HibernateRequest& request, ::speechService::HibernateResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_Hibernate_, context, request, response);
}

void SpeechService::Stub::experimental_async::Hibernate(::grpc::ClientContext* context, const ::speechService::HibernateRequest* request, ::speechService::HibernateResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_Hibernate_, context, request, response, std::move(f));
}

void SpeechService::Stub::experimental_async::Hibernate(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::speechService::HibernateResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_Hibernate_, context, request, response, std::move(f));
}

void SpeechService::Stub::experimental_async::Hibernate(::grpc::ClientContext* context, const ::speechService::HibernateRequest* request, ::speechService::HibernateResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_Hibernate_, context, request, response, reactor);
}

void SpeechService::Stub::experimental_async::Hibernate(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::speechService::HibernateResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_Hibernate_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::speechService::HibernateResponse>* SpeechService::Stub::AsyncHibernateRaw(::grpc::ClientContext* context, const ::speechService::HibernateRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::speechService::HibernateResponse>::Create(channel_.get(), cq, rpcmethod_Hibernate_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::speechService::HibernateResponse>* SpeechService::Stub::PrepareAsyncHibernateRaw(::grpc::ClientContext* context, const ::speechService::HibernateRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::speechService::HibernateResponse>::Create(channel_.get(), cq, rpcmethod_Hibernate_, context, request, false);
}

::grpc::Status SpeechService::Stub::SetVoiceVolume(::grpc::ClientContext* context, const ::speechService::SetVoiceVolumeRequest& request, ::speechService::SetVoiceVolumeResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_SetVoiceVolume_, context, request, response);
}

void SpeechService::Stub::experimental_async::SetVoiceVolume(::grpc::ClientContext* context, const ::speechService::SetVoiceVolumeRequest* request, ::speechService::SetVoiceVolumeResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_SetVoiceVolume_, context, request, response, std::move(f));
}

void SpeechService::Stub::experimental_async::SetVoiceVolume(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::speechService::SetVoiceVolumeResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_SetVoiceVolume_, context, request, response, std::move(f));
}

void SpeechService::Stub::experimental_async::SetVoiceVolume(::grpc::ClientContext* context, const ::speechService::SetVoiceVolumeRequest* request, ::speechService::SetVoiceVolumeResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_SetVoiceVolume_, context, request, response, reactor);
}

void SpeechService::Stub::experimental_async::SetVoiceVolume(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::speechService::SetVoiceVolumeResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_SetVoiceVolume_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::speechService::SetVoiceVolumeResponse>* SpeechService::Stub::AsyncSetVoiceVolumeRaw(::grpc::ClientContext* context, const ::speechService::SetVoiceVolumeRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::speechService::SetVoiceVolumeResponse>::Create(channel_.get(), cq, rpcmethod_SetVoiceVolume_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::speechService::SetVoiceVolumeResponse>* SpeechService::Stub::PrepareAsyncSetVoiceVolumeRaw(::grpc::ClientContext* context, const ::speechService::SetVoiceVolumeRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::speechService::SetVoiceVolumeResponse>::Create(channel_.get(), cq, rpcmethod_SetVoiceVolume_, context, request, false);
}

::grpc::Status SpeechService::Stub::GetVoiceVolume(::grpc::ClientContext* context, const ::speechService::GetVoiceVolumeRequest& request, ::speechService::GetVoiceVolumeResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_GetVoiceVolume_, context, request, response);
}

void SpeechService::Stub::experimental_async::GetVoiceVolume(::grpc::ClientContext* context, const ::speechService::GetVoiceVolumeRequest* request, ::speechService::GetVoiceVolumeResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_GetVoiceVolume_, context, request, response, std::move(f));
}

void SpeechService::Stub::experimental_async::GetVoiceVolume(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::speechService::GetVoiceVolumeResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_GetVoiceVolume_, context, request, response, std::move(f));
}

void SpeechService::Stub::experimental_async::GetVoiceVolume(::grpc::ClientContext* context, const ::speechService::GetVoiceVolumeRequest* request, ::speechService::GetVoiceVolumeResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_GetVoiceVolume_, context, request, response, reactor);
}

void SpeechService::Stub::experimental_async::GetVoiceVolume(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::speechService::GetVoiceVolumeResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_GetVoiceVolume_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::speechService::GetVoiceVolumeResponse>* SpeechService::Stub::AsyncGetVoiceVolumeRaw(::grpc::ClientContext* context, const ::speechService::GetVoiceVolumeRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::speechService::GetVoiceVolumeResponse>::Create(channel_.get(), cq, rpcmethod_GetVoiceVolume_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::speechService::GetVoiceVolumeResponse>* SpeechService::Stub::PrepareAsyncGetVoiceVolumeRaw(::grpc::ClientContext* context, const ::speechService::GetVoiceVolumeRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::speechService::GetVoiceVolumeResponse>::Create(channel_.get(), cq, rpcmethod_GetVoiceVolume_, context, request, false);
}

::grpc::Status SpeechService::Stub::SetParams(::grpc::ClientContext* context, const ::speechService::SetParamsRequest& request, ::speechService::SetParamsResponse* response) {
  return ::grpc::internal::BlockingUnaryCall(channel_.get(), rpcmethod_SetParams_, context, request, response);
}

void SpeechService::Stub::experimental_async::SetParams(::grpc::ClientContext* context, const ::speechService::SetParamsRequest* request, ::speechService::SetParamsResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_SetParams_, context, request, response, std::move(f));
}

void SpeechService::Stub::experimental_async::SetParams(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::speechService::SetParamsResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall(stub_->channel_.get(), stub_->rpcmethod_SetParams_, context, request, response, std::move(f));
}

void SpeechService::Stub::experimental_async::SetParams(::grpc::ClientContext* context, const ::speechService::SetParamsRequest* request, ::speechService::SetParamsResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_SetParams_, context, request, response, reactor);
}

void SpeechService::Stub::experimental_async::SetParams(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::speechService::SetParamsResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create(stub_->channel_.get(), stub_->rpcmethod_SetParams_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::speechService::SetParamsResponse>* SpeechService::Stub::AsyncSetParamsRaw(::grpc::ClientContext* context, const ::speechService::SetParamsRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::speechService::SetParamsResponse>::Create(channel_.get(), cq, rpcmethod_SetParams_, context, request, true);
}

::grpc::ClientAsyncResponseReader< ::speechService::SetParamsResponse>* SpeechService::Stub::PrepareAsyncSetParamsRaw(::grpc::ClientContext* context, const ::speechService::SetParamsRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderFactory< ::speechService::SetParamsResponse>::Create(channel_.get(), cq, rpcmethod_SetParams_, context, request, false);
}

SpeechService::Service::Service() {
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      SpeechService_method_names[0],
      ::grpc::internal::RpcMethod::SERVER_STREAMING,
      new ::grpc::internal::ServerStreamingHandler< SpeechService::Service, ::speechService::ListenSpeechEventRequest, ::speechService::ListenSpeechEventResponse>(
          std::mem_fn(&SpeechService::Service::ListenSpeechEvent), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      SpeechService_method_names[1],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< SpeechService::Service, ::speechService::TextToSpeechRequest, ::speechService::TextToSpeechResponse>(
          std::mem_fn(&SpeechService::Service::TextToSpeech), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      SpeechService_method_names[2],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< SpeechService::Service, ::speechService::SpeechStopRequest, ::speechService::SpeechStopResponse>(
          std::mem_fn(&SpeechService::Service::SpeechStop), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      SpeechService_method_names[3],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< SpeechService::Service, ::speechService::WakeUpRequest, ::speechService::WakeUpResponse>(
          std::mem_fn(&SpeechService::Service::WakeUp), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      SpeechService_method_names[4],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< SpeechService::Service, ::speechService::HibernateRequest, ::speechService::HibernateResponse>(
          std::mem_fn(&SpeechService::Service::Hibernate), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      SpeechService_method_names[5],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< SpeechService::Service, ::speechService::SetVoiceVolumeRequest, ::speechService::SetVoiceVolumeResponse>(
          std::mem_fn(&SpeechService::Service::SetVoiceVolume), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      SpeechService_method_names[6],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< SpeechService::Service, ::speechService::GetVoiceVolumeRequest, ::speechService::GetVoiceVolumeResponse>(
          std::mem_fn(&SpeechService::Service::GetVoiceVolume), this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      SpeechService_method_names[7],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< SpeechService::Service, ::speechService::SetParamsRequest, ::speechService::SetParamsResponse>(
          std::mem_fn(&SpeechService::Service::SetParams), this)));
}

SpeechService::Service::~Service() {
}

::grpc::Status SpeechService::Service::ListenSpeechEvent(::grpc::ServerContext* context, const ::speechService::ListenSpeechEventRequest* request, ::grpc::ServerWriter< ::speechService::ListenSpeechEventResponse>* writer) {
  (void) context;
  (void) request;
  (void) writer;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status SpeechService::Service::TextToSpeech(::grpc::ServerContext* context, const ::speechService::TextToSpeechRequest* request, ::speechService::TextToSpeechResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status SpeechService::Service::SpeechStop(::grpc::ServerContext* context, const ::speechService::SpeechStopRequest* request, ::speechService::SpeechStopResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status SpeechService::Service::WakeUp(::grpc::ServerContext* context, const ::speechService::WakeUpRequest* request, ::speechService::WakeUpResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status SpeechService::Service::Hibernate(::grpc::ServerContext* context, const ::speechService::HibernateRequest* request, ::speechService::HibernateResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status SpeechService::Service::SetVoiceVolume(::grpc::ServerContext* context, const ::speechService::SetVoiceVolumeRequest* request, ::speechService::SetVoiceVolumeResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status SpeechService::Service::GetVoiceVolume(::grpc::ServerContext* context, const ::speechService::GetVoiceVolumeRequest* request, ::speechService::GetVoiceVolumeResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status SpeechService::Service::SetParams(::grpc::ServerContext* context, const ::speechService::SetParamsRequest* request, ::speechService::SetParamsResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}


}  // namespace speechService

