// Generated by the gRPC C++ plugin.
// If you make any local change, they will be lost.
// source: map.proto
#ifndef GRPC_map_2eproto__INCLUDED
#define GRPC_map_2eproto__INCLUDED

#include "map.pb.h"

#include <functional>
#include <grpcpp/impl/codegen/async_generic_service.h>
#include <grpcpp/impl/codegen/async_stream.h>
#include <grpcpp/impl/codegen/async_unary_call.h>
#include <grpcpp/impl/codegen/client_callback.h>
#include <grpcpp/impl/codegen/method_handler_impl.h>
#include <grpcpp/impl/codegen/proto_utils.h>
#include <grpcpp/impl/codegen/rpc_method.h>
#include <grpcpp/impl/codegen/server_callback.h>
#include <grpcpp/impl/codegen/service_type.h>
#include <grpcpp/impl/codegen/status.h>
#include <grpcpp/impl/codegen/stub_options.h>
#include <grpcpp/impl/codegen/sync_stream.h>

namespace grpc_impl {
class CompletionQueue;
class ServerCompletionQueue;
class ServerContext;
}  // namespace grpc_impl

namespace grpc {
namespace experimental {
template <typename RequestT, typename ResponseT>
class MessageAllocator;
}  // namespace experimental
}  // namespace grpc

namespace navService {

class Map final {
 public:
  static constexpr char const* service_full_name() {
    return "navService.Map";
  }
  class StubInterface {
   public:
    virtual ~StubInterface() {}
    virtual ::grpc::Status GetMapInfo(::grpc::ClientContext* context, const ::navService::GetMapInfoRequest& request, ::navService::GetMapInfoResponse* response) = 0;
    std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::navService::GetMapInfoResponse>> AsyncGetMapInfo(::grpc::ClientContext* context, const ::navService::GetMapInfoRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::navService::GetMapInfoResponse>>(AsyncGetMapInfoRaw(context, request, cq));
    }
    std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::navService::GetMapInfoResponse>> PrepareAsyncGetMapInfo(::grpc::ClientContext* context, const ::navService::GetMapInfoRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::navService::GetMapInfoResponse>>(PrepareAsyncGetMapInfoRaw(context, request, cq));
    }
    std::unique_ptr< ::grpc::ClientReaderInterface< ::navService::MapPositionStreamResponse>> MapPositionStream(::grpc::ClientContext* context, const ::navService::MapPositionStreamRequest& request) {
      return std::unique_ptr< ::grpc::ClientReaderInterface< ::navService::MapPositionStreamResponse>>(MapPositionStreamRaw(context, request));
    }
    std::unique_ptr< ::grpc::ClientAsyncReaderInterface< ::navService::MapPositionStreamResponse>> AsyncMapPositionStream(::grpc::ClientContext* context, const ::navService::MapPositionStreamRequest& request, ::grpc::CompletionQueue* cq, void* tag) {
      return std::unique_ptr< ::grpc::ClientAsyncReaderInterface< ::navService::MapPositionStreamResponse>>(AsyncMapPositionStreamRaw(context, request, cq, tag));
    }
    std::unique_ptr< ::grpc::ClientAsyncReaderInterface< ::navService::MapPositionStreamResponse>> PrepareAsyncMapPositionStream(::grpc::ClientContext* context, const ::navService::MapPositionStreamRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncReaderInterface< ::navService::MapPositionStreamResponse>>(PrepareAsyncMapPositionStreamRaw(context, request, cq));
    }
    // 重置当前定位
    // 用于发生定位异常/错误状态，重新初始化导航定位
    // 重定位错误：定位状态超时|无地图|UWB错误
    // 重定位超时判断: 默认10s，仅在非错误状态下重置
    virtual ::grpc::Status LocationReset(::grpc::ClientContext* context, const ::navService::LocationResetRequest& request, ::navService::LocationResetResponse* response) = 0;
    std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::navService::LocationResetResponse>> AsyncLocationReset(::grpc::ClientContext* context, const ::navService::LocationResetRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::navService::LocationResetResponse>>(AsyncLocationResetRaw(context, request, cq));
    }
    std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::navService::LocationResetResponse>> PrepareAsyncLocationReset(::grpc::ClientContext* context, const ::navService::LocationResetRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::navService::LocationResetResponse>>(PrepareAsyncLocationResetRaw(context, request, cq));
    }
    class experimental_async_interface {
     public:
      virtual ~experimental_async_interface() {}
      virtual void GetMapInfo(::grpc::ClientContext* context, const ::navService::GetMapInfoRequest* request, ::navService::GetMapInfoResponse* response, std::function<void(::grpc::Status)>) = 0;
      virtual void GetMapInfo(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::navService::GetMapInfoResponse* response, std::function<void(::grpc::Status)>) = 0;
      virtual void GetMapInfo(::grpc::ClientContext* context, const ::navService::GetMapInfoRequest* request, ::navService::GetMapInfoResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) = 0;
      virtual void GetMapInfo(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::navService::GetMapInfoResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) = 0;
      virtual void MapPositionStream(::grpc::ClientContext* context, ::navService::MapPositionStreamRequest* request, ::grpc::experimental::ClientReadReactor< ::navService::MapPositionStreamResponse>* reactor) = 0;
      // 重置当前定位
      // 用于发生定位异常/错误状态，重新初始化导航定位
      // 重定位错误：定位状态超时|无地图|UWB错误
      // 重定位超时判断: 默认10s，仅在非错误状态下重置
      virtual void LocationReset(::grpc::ClientContext* context, const ::navService::LocationResetRequest* request, ::navService::LocationResetResponse* response, std::function<void(::grpc::Status)>) = 0;
      virtual void LocationReset(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::navService::LocationResetResponse* response, std::function<void(::grpc::Status)>) = 0;
      virtual void LocationReset(::grpc::ClientContext* context, const ::navService::LocationResetRequest* request, ::navService::LocationResetResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) = 0;
      virtual void LocationReset(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::navService::LocationResetResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) = 0;
    };
    virtual class experimental_async_interface* experimental_async() { return nullptr; }
  private:
    virtual ::grpc::ClientAsyncResponseReaderInterface< ::navService::GetMapInfoResponse>* AsyncGetMapInfoRaw(::grpc::ClientContext* context, const ::navService::GetMapInfoRequest& request, ::grpc::CompletionQueue* cq) = 0;
    virtual ::grpc::ClientAsyncResponseReaderInterface< ::navService::GetMapInfoResponse>* PrepareAsyncGetMapInfoRaw(::grpc::ClientContext* context, const ::navService::GetMapInfoRequest& request, ::grpc::CompletionQueue* cq) = 0;
    virtual ::grpc::ClientReaderInterface< ::navService::MapPositionStreamResponse>* MapPositionStreamRaw(::grpc::ClientContext* context, const ::navService::MapPositionStreamRequest& request) = 0;
    virtual ::grpc::ClientAsyncReaderInterface< ::navService::MapPositionStreamResponse>* AsyncMapPositionStreamRaw(::grpc::ClientContext* context, const ::navService::MapPositionStreamRequest& request, ::grpc::CompletionQueue* cq, void* tag) = 0;
    virtual ::grpc::ClientAsyncReaderInterface< ::navService::MapPositionStreamResponse>* PrepareAsyncMapPositionStreamRaw(::grpc::ClientContext* context, const ::navService::MapPositionStreamRequest& request, ::grpc::CompletionQueue* cq) = 0;
    virtual ::grpc::ClientAsyncResponseReaderInterface< ::navService::LocationResetResponse>* AsyncLocationResetRaw(::grpc::ClientContext* context, const ::navService::LocationResetRequest& request, ::grpc::CompletionQueue* cq) = 0;
    virtual ::grpc::ClientAsyncResponseReaderInterface< ::navService::LocationResetResponse>* PrepareAsyncLocationResetRaw(::grpc::ClientContext* context, const ::navService::LocationResetRequest& request, ::grpc::CompletionQueue* cq) = 0;
  };
  class Stub final : public StubInterface {
   public:
    Stub(const std::shared_ptr< ::grpc::ChannelInterface>& channel);
    ::grpc::Status GetMapInfo(::grpc::ClientContext* context, const ::navService::GetMapInfoRequest& request, ::navService::GetMapInfoResponse* response) override;
    std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::navService::GetMapInfoResponse>> AsyncGetMapInfo(::grpc::ClientContext* context, const ::navService::GetMapInfoRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::navService::GetMapInfoResponse>>(AsyncGetMapInfoRaw(context, request, cq));
    }
    std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::navService::GetMapInfoResponse>> PrepareAsyncGetMapInfo(::grpc::ClientContext* context, const ::navService::GetMapInfoRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::navService::GetMapInfoResponse>>(PrepareAsyncGetMapInfoRaw(context, request, cq));
    }
    std::unique_ptr< ::grpc::ClientReader< ::navService::MapPositionStreamResponse>> MapPositionStream(::grpc::ClientContext* context, const ::navService::MapPositionStreamRequest& request) {
      return std::unique_ptr< ::grpc::ClientReader< ::navService::MapPositionStreamResponse>>(MapPositionStreamRaw(context, request));
    }
    std::unique_ptr< ::grpc::ClientAsyncReader< ::navService::MapPositionStreamResponse>> AsyncMapPositionStream(::grpc::ClientContext* context, const ::navService::MapPositionStreamRequest& request, ::grpc::CompletionQueue* cq, void* tag) {
      return std::unique_ptr< ::grpc::ClientAsyncReader< ::navService::MapPositionStreamResponse>>(AsyncMapPositionStreamRaw(context, request, cq, tag));
    }
    std::unique_ptr< ::grpc::ClientAsyncReader< ::navService::MapPositionStreamResponse>> PrepareAsyncMapPositionStream(::grpc::ClientContext* context, const ::navService::MapPositionStreamRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncReader< ::navService::MapPositionStreamResponse>>(PrepareAsyncMapPositionStreamRaw(context, request, cq));
    }
    ::grpc::Status LocationReset(::grpc::ClientContext* context, const ::navService::LocationResetRequest& request, ::navService::LocationResetResponse* response) override;
    std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::navService::LocationResetResponse>> AsyncLocationReset(::grpc::ClientContext* context, const ::navService::LocationResetRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::navService::LocationResetResponse>>(AsyncLocationResetRaw(context, request, cq));
    }
    std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::navService::LocationResetResponse>> PrepareAsyncLocationReset(::grpc::ClientContext* context, const ::navService::LocationResetRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::navService::LocationResetResponse>>(PrepareAsyncLocationResetRaw(context, request, cq));
    }
    class experimental_async final :
      public StubInterface::experimental_async_interface {
     public:
      void GetMapInfo(::grpc::ClientContext* context, const ::navService::GetMapInfoRequest* request, ::navService::GetMapInfoResponse* response, std::function<void(::grpc::Status)>) override;
      void GetMapInfo(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::navService::GetMapInfoResponse* response, std::function<void(::grpc::Status)>) override;
      void GetMapInfo(::grpc::ClientContext* context, const ::navService::GetMapInfoRequest* request, ::navService::GetMapInfoResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) override;
      void GetMapInfo(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::navService::GetMapInfoResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) override;
      void MapPositionStream(::grpc::ClientContext* context, ::navService::MapPositionStreamRequest* request, ::grpc::experimental::ClientReadReactor< ::navService::MapPositionStreamResponse>* reactor) override;
      void LocationReset(::grpc::ClientContext* context, const ::navService::LocationResetRequest* request, ::navService::LocationResetResponse* response, std::function<void(::grpc::Status)>) override;
      void LocationReset(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::navService::LocationResetResponse* response, std::function<void(::grpc::Status)>) override;
      void LocationReset(::grpc::ClientContext* context, const ::navService::LocationResetRequest* request, ::navService::LocationResetResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) override;
      void LocationReset(::grpc::ClientContext* context, const ::grpc::ByteBuffer* request, ::navService::LocationResetResponse* response, ::grpc::experimental::ClientUnaryReactor* reactor) override;
     private:
      friend class Stub;
      explicit experimental_async(Stub* stub): stub_(stub) { }
      Stub* stub() { return stub_; }
      Stub* stub_;
    };
    class experimental_async_interface* experimental_async() override { return &async_stub_; }

   private:
    std::shared_ptr< ::grpc::ChannelInterface> channel_;
    class experimental_async async_stub_{this};
    ::grpc::ClientAsyncResponseReader< ::navService::GetMapInfoResponse>* AsyncGetMapInfoRaw(::grpc::ClientContext* context, const ::navService::GetMapInfoRequest& request, ::grpc::CompletionQueue* cq) override;
    ::grpc::ClientAsyncResponseReader< ::navService::GetMapInfoResponse>* PrepareAsyncGetMapInfoRaw(::grpc::ClientContext* context, const ::navService::GetMapInfoRequest& request, ::grpc::CompletionQueue* cq) override;
    ::grpc::ClientReader< ::navService::MapPositionStreamResponse>* MapPositionStreamRaw(::grpc::ClientContext* context, const ::navService::MapPositionStreamRequest& request) override;
    ::grpc::ClientAsyncReader< ::navService::MapPositionStreamResponse>* AsyncMapPositionStreamRaw(::grpc::ClientContext* context, const ::navService::MapPositionStreamRequest& request, ::grpc::CompletionQueue* cq, void* tag) override;
    ::grpc::ClientAsyncReader< ::navService::MapPositionStreamResponse>* PrepareAsyncMapPositionStreamRaw(::grpc::ClientContext* context, const ::navService::MapPositionStreamRequest& request, ::grpc::CompletionQueue* cq) override;
    ::grpc::ClientAsyncResponseReader< ::navService::LocationResetResponse>* AsyncLocationResetRaw(::grpc::ClientContext* context, const ::navService::LocationResetRequest& request, ::grpc::CompletionQueue* cq) override;
    ::grpc::ClientAsyncResponseReader< ::navService::LocationResetResponse>* PrepareAsyncLocationResetRaw(::grpc::ClientContext* context, const ::navService::LocationResetRequest& request, ::grpc::CompletionQueue* cq) override;
    const ::grpc::internal::RpcMethod rpcmethod_GetMapInfo_;
    const ::grpc::internal::RpcMethod rpcmethod_MapPositionStream_;
    const ::grpc::internal::RpcMethod rpcmethod_LocationReset_;
  };
  static std::unique_ptr<Stub> NewStub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options = ::grpc::StubOptions());

  class Service : public ::grpc::Service {
   public:
    Service();
    virtual ~Service();
    virtual ::grpc::Status GetMapInfo(::grpc::ServerContext* context, const ::navService::GetMapInfoRequest* request, ::navService::GetMapInfoResponse* response);
    virtual ::grpc::Status MapPositionStream(::grpc::ServerContext* context, const ::navService::MapPositionStreamRequest* request, ::grpc::ServerWriter< ::navService::MapPositionStreamResponse>* writer);
    // 重置当前定位
    // 用于发生定位异常/错误状态，重新初始化导航定位
    // 重定位错误：定位状态超时|无地图|UWB错误
    // 重定位超时判断: 默认10s，仅在非错误状态下重置
    virtual ::grpc::Status LocationReset(::grpc::ServerContext* context, const ::navService::LocationResetRequest* request, ::navService::LocationResetResponse* response);
  };
  template <class BaseClass>
  class WithAsyncMethod_GetMapInfo : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service *service) {}
   public:
    WithAsyncMethod_GetMapInfo() {
      ::grpc::Service::MarkMethodAsync(0);
    }
    ~WithAsyncMethod_GetMapInfo() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status GetMapInfo(::grpc::ServerContext* context, const ::navService::GetMapInfoRequest* request, ::navService::GetMapInfoResponse* response) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    void RequestGetMapInfo(::grpc::ServerContext* context, ::navService::GetMapInfoRequest* request, ::grpc::ServerAsyncResponseWriter< ::navService::GetMapInfoResponse>* response, ::grpc::CompletionQueue* new_call_cq, ::grpc::ServerCompletionQueue* notification_cq, void *tag) {
      ::grpc::Service::RequestAsyncUnary(0, context, request, response, new_call_cq, notification_cq, tag);
    }
  };
  template <class BaseClass>
  class WithAsyncMethod_MapPositionStream : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service *service) {}
   public:
    WithAsyncMethod_MapPositionStream() {
      ::grpc::Service::MarkMethodAsync(1);
    }
    ~WithAsyncMethod_MapPositionStream() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status MapPositionStream(::grpc::ServerContext* context, const ::navService::MapPositionStreamRequest* request, ::grpc::ServerWriter< ::navService::MapPositionStreamResponse>* writer) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    void RequestMapPositionStream(::grpc::ServerContext* context, ::navService::MapPositionStreamRequest* request, ::grpc::ServerAsyncWriter< ::navService::MapPositionStreamResponse>* writer, ::grpc::CompletionQueue* new_call_cq, ::grpc::ServerCompletionQueue* notification_cq, void *tag) {
      ::grpc::Service::RequestAsyncServerStreaming(1, context, request, writer, new_call_cq, notification_cq, tag);
    }
  };
  template <class BaseClass>
  class WithAsyncMethod_LocationReset : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service *service) {}
   public:
    WithAsyncMethod_LocationReset() {
      ::grpc::Service::MarkMethodAsync(2);
    }
    ~WithAsyncMethod_LocationReset() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status LocationReset(::grpc::ServerContext* context, const ::navService::LocationResetRequest* request, ::navService::LocationResetResponse* response) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    void RequestLocationReset(::grpc::ServerContext* context, ::navService::LocationResetRequest* request, ::grpc::ServerAsyncResponseWriter< ::navService::LocationResetResponse>* response, ::grpc::CompletionQueue* new_call_cq, ::grpc::ServerCompletionQueue* notification_cq, void *tag) {
      ::grpc::Service::RequestAsyncUnary(2, context, request, response, new_call_cq, notification_cq, tag);
    }
  };
  typedef WithAsyncMethod_GetMapInfo<WithAsyncMethod_MapPositionStream<WithAsyncMethod_LocationReset<Service > > > AsyncService;
  template <class BaseClass>
  class ExperimentalWithCallbackMethod_GetMapInfo : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service *service) {}
   public:
    ExperimentalWithCallbackMethod_GetMapInfo() {
      ::grpc::Service::experimental().MarkMethodCallback(0,
        new ::grpc::internal::CallbackUnaryHandler< ::navService::GetMapInfoRequest, ::navService::GetMapInfoResponse>(
          [this](::grpc::ServerContext* context,
                 const ::navService::GetMapInfoRequest* request,
                 ::navService::GetMapInfoResponse* response,
                 ::grpc::experimental::ServerCallbackRpcController* controller) {
                   return this->GetMapInfo(context, request, response, controller);
                 }));
    }
    void SetMessageAllocatorFor_GetMapInfo(
        ::grpc::experimental::MessageAllocator< ::navService::GetMapInfoRequest, ::navService::GetMapInfoResponse>* allocator) {
      static_cast<::grpc::internal::CallbackUnaryHandler< ::navService::GetMapInfoRequest, ::navService::GetMapInfoResponse>*>(
          ::grpc::Service::experimental().GetHandler(0))
              ->SetMessageAllocator(allocator);
    }
    ~ExperimentalWithCallbackMethod_GetMapInfo() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status GetMapInfo(::grpc::ServerContext* context, const ::navService::GetMapInfoRequest* request, ::navService::GetMapInfoResponse* response) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    virtual void GetMapInfo(::grpc::ServerContext* context, const ::navService::GetMapInfoRequest* request, ::navService::GetMapInfoResponse* response, ::grpc::experimental::ServerCallbackRpcController* controller) { controller->Finish(::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "")); }
  };
  template <class BaseClass>
  class ExperimentalWithCallbackMethod_MapPositionStream : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service *service) {}
   public:
    ExperimentalWithCallbackMethod_MapPositionStream() {
      ::grpc::Service::experimental().MarkMethodCallback(1,
        new ::grpc::internal::CallbackServerStreamingHandler< ::navService::MapPositionStreamRequest, ::navService::MapPositionStreamResponse>(
          [this] { return this->MapPositionStream(); }));
    }
    ~ExperimentalWithCallbackMethod_MapPositionStream() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status MapPositionStream(::grpc::ServerContext* context, const ::navService::MapPositionStreamRequest* request, ::grpc::ServerWriter< ::navService::MapPositionStreamResponse>* writer) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    virtual ::grpc::experimental::ServerWriteReactor< ::navService::MapPositionStreamRequest, ::navService::MapPositionStreamResponse>* MapPositionStream() {
      return new ::grpc::internal::UnimplementedWriteReactor<
        ::navService::MapPositionStreamRequest, ::navService::MapPositionStreamResponse>;}
  };
  template <class BaseClass>
  class ExperimentalWithCallbackMethod_LocationReset : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service *service) {}
   public:
    ExperimentalWithCallbackMethod_LocationReset() {
      ::grpc::Service::experimental().MarkMethodCallback(2,
        new ::grpc::internal::CallbackUnaryHandler< ::navService::LocationResetRequest, ::navService::LocationResetResponse>(
          [this](::grpc::ServerContext* context,
                 const ::navService::LocationResetRequest* request,
                 ::navService::LocationResetResponse* response,
                 ::grpc::experimental::ServerCallbackRpcController* controller) {
                   return this->LocationReset(context, request, response, controller);
                 }));
    }
    void SetMessageAllocatorFor_LocationReset(
        ::grpc::experimental::MessageAllocator< ::navService::LocationResetRequest, ::navService::LocationResetResponse>* allocator) {
      static_cast<::grpc::internal::CallbackUnaryHandler< ::navService::LocationResetRequest, ::navService::LocationResetResponse>*>(
          ::grpc::Service::experimental().GetHandler(2))
              ->SetMessageAllocator(allocator);
    }
    ~ExperimentalWithCallbackMethod_LocationReset() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status LocationReset(::grpc::ServerContext* context, const ::navService::LocationResetRequest* request, ::navService::LocationResetResponse* response) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    virtual void LocationReset(::grpc::ServerContext* context, const ::navService::LocationResetRequest* request, ::navService::LocationResetResponse* response, ::grpc::experimental::ServerCallbackRpcController* controller) { controller->Finish(::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "")); }
  };
  typedef ExperimentalWithCallbackMethod_GetMapInfo<ExperimentalWithCallbackMethod_MapPositionStream<ExperimentalWithCallbackMethod_LocationReset<Service > > > ExperimentalCallbackService;
  template <class BaseClass>
  class WithGenericMethod_GetMapInfo : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service *service) {}
   public:
    WithGenericMethod_GetMapInfo() {
      ::grpc::Service::MarkMethodGeneric(0);
    }
    ~WithGenericMethod_GetMapInfo() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status GetMapInfo(::grpc::ServerContext* context, const ::navService::GetMapInfoRequest* request, ::navService::GetMapInfoResponse* response) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
  };
  template <class BaseClass>
  class WithGenericMethod_MapPositionStream : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service *service) {}
   public:
    WithGenericMethod_MapPositionStream() {
      ::grpc::Service::MarkMethodGeneric(1);
    }
    ~WithGenericMethod_MapPositionStream() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status MapPositionStream(::grpc::ServerContext* context, const ::navService::MapPositionStreamRequest* request, ::grpc::ServerWriter< ::navService::MapPositionStreamResponse>* writer) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
  };
  template <class BaseClass>
  class WithGenericMethod_LocationReset : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service *service) {}
   public:
    WithGenericMethod_LocationReset() {
      ::grpc::Service::MarkMethodGeneric(2);
    }
    ~WithGenericMethod_LocationReset() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status LocationReset(::grpc::ServerContext* context, const ::navService::LocationResetRequest* request, ::navService::LocationResetResponse* response) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
  };
  template <class BaseClass>
  class WithRawMethod_GetMapInfo : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service *service) {}
   public:
    WithRawMethod_GetMapInfo() {
      ::grpc::Service::MarkMethodRaw(0);
    }
    ~WithRawMethod_GetMapInfo() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status GetMapInfo(::grpc::ServerContext* context, const ::navService::GetMapInfoRequest* request, ::navService::GetMapInfoResponse* response) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    void RequestGetMapInfo(::grpc::ServerContext* context, ::grpc::ByteBuffer* request, ::grpc::ServerAsyncResponseWriter< ::grpc::ByteBuffer>* response, ::grpc::CompletionQueue* new_call_cq, ::grpc::ServerCompletionQueue* notification_cq, void *tag) {
      ::grpc::Service::RequestAsyncUnary(0, context, request, response, new_call_cq, notification_cq, tag);
    }
  };
  template <class BaseClass>
  class WithRawMethod_MapPositionStream : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service *service) {}
   public:
    WithRawMethod_MapPositionStream() {
      ::grpc::Service::MarkMethodRaw(1);
    }
    ~WithRawMethod_MapPositionStream() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status MapPositionStream(::grpc::ServerContext* context, const ::navService::MapPositionStreamRequest* request, ::grpc::ServerWriter< ::navService::MapPositionStreamResponse>* writer) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    void RequestMapPositionStream(::grpc::ServerContext* context, ::grpc::ByteBuffer* request, ::grpc::ServerAsyncWriter< ::grpc::ByteBuffer>* writer, ::grpc::CompletionQueue* new_call_cq, ::grpc::ServerCompletionQueue* notification_cq, void *tag) {
      ::grpc::Service::RequestAsyncServerStreaming(1, context, request, writer, new_call_cq, notification_cq, tag);
    }
  };
  template <class BaseClass>
  class WithRawMethod_LocationReset : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service *service) {}
   public:
    WithRawMethod_LocationReset() {
      ::grpc::Service::MarkMethodRaw(2);
    }
    ~WithRawMethod_LocationReset() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status LocationReset(::grpc::ServerContext* context, const ::navService::LocationResetRequest* request, ::navService::LocationResetResponse* response) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    void RequestLocationReset(::grpc::ServerContext* context, ::grpc::ByteBuffer* request, ::grpc::ServerAsyncResponseWriter< ::grpc::ByteBuffer>* response, ::grpc::CompletionQueue* new_call_cq, ::grpc::ServerCompletionQueue* notification_cq, void *tag) {
      ::grpc::Service::RequestAsyncUnary(2, context, request, response, new_call_cq, notification_cq, tag);
    }
  };
  template <class BaseClass>
  class ExperimentalWithRawCallbackMethod_GetMapInfo : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service *service) {}
   public:
    ExperimentalWithRawCallbackMethod_GetMapInfo() {
      ::grpc::Service::experimental().MarkMethodRawCallback(0,
        new ::grpc::internal::CallbackUnaryHandler< ::grpc::ByteBuffer, ::grpc::ByteBuffer>(
          [this](::grpc::ServerContext* context,
                 const ::grpc::ByteBuffer* request,
                 ::grpc::ByteBuffer* response,
                 ::grpc::experimental::ServerCallbackRpcController* controller) {
                   this->GetMapInfo(context, request, response, controller);
                 }));
    }
    ~ExperimentalWithRawCallbackMethod_GetMapInfo() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status GetMapInfo(::grpc::ServerContext* context, const ::navService::GetMapInfoRequest* request, ::navService::GetMapInfoResponse* response) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    virtual void GetMapInfo(::grpc::ServerContext* context, const ::grpc::ByteBuffer* request, ::grpc::ByteBuffer* response, ::grpc::experimental::ServerCallbackRpcController* controller) { controller->Finish(::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "")); }
  };
  template <class BaseClass>
  class ExperimentalWithRawCallbackMethod_MapPositionStream : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service *service) {}
   public:
    ExperimentalWithRawCallbackMethod_MapPositionStream() {
      ::grpc::Service::experimental().MarkMethodRawCallback(1,
        new ::grpc::internal::CallbackServerStreamingHandler< ::grpc::ByteBuffer, ::grpc::ByteBuffer>(
          [this] { return this->MapPositionStream(); }));
    }
    ~ExperimentalWithRawCallbackMethod_MapPositionStream() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status MapPositionStream(::grpc::ServerContext* context, const ::navService::MapPositionStreamRequest* request, ::grpc::ServerWriter< ::navService::MapPositionStreamResponse>* writer) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    virtual ::grpc::experimental::ServerWriteReactor< ::grpc::ByteBuffer, ::grpc::ByteBuffer>* MapPositionStream() {
      return new ::grpc::internal::UnimplementedWriteReactor<
        ::grpc::ByteBuffer, ::grpc::ByteBuffer>;}
  };
  template <class BaseClass>
  class ExperimentalWithRawCallbackMethod_LocationReset : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service *service) {}
   public:
    ExperimentalWithRawCallbackMethod_LocationReset() {
      ::grpc::Service::experimental().MarkMethodRawCallback(2,
        new ::grpc::internal::CallbackUnaryHandler< ::grpc::ByteBuffer, ::grpc::ByteBuffer>(
          [this](::grpc::ServerContext* context,
                 const ::grpc::ByteBuffer* request,
                 ::grpc::ByteBuffer* response,
                 ::grpc::experimental::ServerCallbackRpcController* controller) {
                   this->LocationReset(context, request, response, controller);
                 }));
    }
    ~ExperimentalWithRawCallbackMethod_LocationReset() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status LocationReset(::grpc::ServerContext* context, const ::navService::LocationResetRequest* request, ::navService::LocationResetResponse* response) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    virtual void LocationReset(::grpc::ServerContext* context, const ::grpc::ByteBuffer* request, ::grpc::ByteBuffer* response, ::grpc::experimental::ServerCallbackRpcController* controller) { controller->Finish(::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "")); }
  };
  template <class BaseClass>
  class WithStreamedUnaryMethod_GetMapInfo : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service *service) {}
   public:
    WithStreamedUnaryMethod_GetMapInfo() {
      ::grpc::Service::MarkMethodStreamed(0,
        new ::grpc::internal::StreamedUnaryHandler< ::navService::GetMapInfoRequest, ::navService::GetMapInfoResponse>(std::bind(&WithStreamedUnaryMethod_GetMapInfo<BaseClass>::StreamedGetMapInfo, this, std::placeholders::_1, std::placeholders::_2)));
    }
    ~WithStreamedUnaryMethod_GetMapInfo() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable regular version of this method
    ::grpc::Status GetMapInfo(::grpc::ServerContext* context, const ::navService::GetMapInfoRequest* request, ::navService::GetMapInfoResponse* response) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    // replace default version of method with streamed unary
    virtual ::grpc::Status StreamedGetMapInfo(::grpc::ServerContext* context, ::grpc::ServerUnaryStreamer< ::navService::GetMapInfoRequest,::navService::GetMapInfoResponse>* server_unary_streamer) = 0;
  };
  template <class BaseClass>
  class WithStreamedUnaryMethod_LocationReset : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service *service) {}
   public:
    WithStreamedUnaryMethod_LocationReset() {
      ::grpc::Service::MarkMethodStreamed(2,
        new ::grpc::internal::StreamedUnaryHandler< ::navService::LocationResetRequest, ::navService::LocationResetResponse>(std::bind(&WithStreamedUnaryMethod_LocationReset<BaseClass>::StreamedLocationReset, this, std::placeholders::_1, std::placeholders::_2)));
    }
    ~WithStreamedUnaryMethod_LocationReset() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable regular version of this method
    ::grpc::Status LocationReset(::grpc::ServerContext* context, const ::navService::LocationResetRequest* request, ::navService::LocationResetResponse* response) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    // replace default version of method with streamed unary
    virtual ::grpc::Status StreamedLocationReset(::grpc::ServerContext* context, ::grpc::ServerUnaryStreamer< ::navService::LocationResetRequest,::navService::LocationResetResponse>* server_unary_streamer) = 0;
  };
  typedef WithStreamedUnaryMethod_GetMapInfo<WithStreamedUnaryMethod_LocationReset<Service > > StreamedUnaryService;
  template <class BaseClass>
  class WithSplitStreamingMethod_MapPositionStream : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service *service) {}
   public:
    WithSplitStreamingMethod_MapPositionStream() {
      ::grpc::Service::MarkMethodStreamed(1,
        new ::grpc::internal::SplitServerStreamingHandler< ::navService::MapPositionStreamRequest, ::navService::MapPositionStreamResponse>(std::bind(&WithSplitStreamingMethod_MapPositionStream<BaseClass>::StreamedMapPositionStream, this, std::placeholders::_1, std::placeholders::_2)));
    }
    ~WithSplitStreamingMethod_MapPositionStream() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable regular version of this method
    ::grpc::Status MapPositionStream(::grpc::ServerContext* context, const ::navService::MapPositionStreamRequest* request, ::grpc::ServerWriter< ::navService::MapPositionStreamResponse>* writer) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    // replace default version of method with split streamed
    virtual ::grpc::Status StreamedMapPositionStream(::grpc::ServerContext* context, ::grpc::ServerSplitStreamer< ::navService::MapPositionStreamRequest,::navService::MapPositionStreamResponse>* server_split_streamer) = 0;
  };
  typedef WithSplitStreamingMethod_MapPositionStream<Service > SplitStreamedService;
  typedef WithStreamedUnaryMethod_GetMapInfo<WithSplitStreamingMethod_MapPositionStream<WithStreamedUnaryMethod_LocationReset<Service > > > StreamedService;
};

}  // namespace navService


#endif  // GRPC_map_2eproto__INCLUDED