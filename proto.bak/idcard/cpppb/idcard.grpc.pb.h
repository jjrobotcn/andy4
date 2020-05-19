// Generated by the gRPC C++ plugin.
// If you make any local change, they will be lost.
// source: idcard.proto
#ifndef GRPC_idcard_2eproto__INCLUDED
#define GRPC_idcard_2eproto__INCLUDED

#include "idcard.pb.h"

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
class Channel;
class CompletionQueue;
class ServerCompletionQueue;
}  // namespace grpc_impl

namespace grpc {
namespace experimental {
template <typename RequestT, typename ResponseT>
class MessageAllocator;
}  // namespace experimental
}  // namespace grpc_impl

namespace grpc {
class ServerContext;
}  // namespace grpc

namespace idCardService {

class IDCardService final {
 public:
  static constexpr char const* service_full_name() {
    return "idCardService.IDCardService";
  }
  class StubInterface {
   public:
    virtual ~StubInterface() {}
    // 获取读卡数据流
    std::unique_ptr< ::grpc::ClientReaderInterface< ::idCardService::GetIdInfoResponse>> GetIdInfo(::grpc::ClientContext* context, const ::idCardService::GetIdInfoRequest& request) {
      return std::unique_ptr< ::grpc::ClientReaderInterface< ::idCardService::GetIdInfoResponse>>(GetIdInfoRaw(context, request));
    }
    std::unique_ptr< ::grpc::ClientAsyncReaderInterface< ::idCardService::GetIdInfoResponse>> AsyncGetIdInfo(::grpc::ClientContext* context, const ::idCardService::GetIdInfoRequest& request, ::grpc::CompletionQueue* cq, void* tag) {
      return std::unique_ptr< ::grpc::ClientAsyncReaderInterface< ::idCardService::GetIdInfoResponse>>(AsyncGetIdInfoRaw(context, request, cq, tag));
    }
    std::unique_ptr< ::grpc::ClientAsyncReaderInterface< ::idCardService::GetIdInfoResponse>> PrepareAsyncGetIdInfo(::grpc::ClientContext* context, const ::idCardService::GetIdInfoRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncReaderInterface< ::idCardService::GetIdInfoResponse>>(PrepareAsyncGetIdInfoRaw(context, request, cq));
    }
    class experimental_async_interface {
     public:
      virtual ~experimental_async_interface() {}
      // 获取读卡数据流
      virtual void GetIdInfo(::grpc::ClientContext* context, ::idCardService::GetIdInfoRequest* request, ::grpc::experimental::ClientReadReactor< ::idCardService::GetIdInfoResponse>* reactor) = 0;
    };
    virtual class experimental_async_interface* experimental_async() { return nullptr; }
  private:
    virtual ::grpc::ClientReaderInterface< ::idCardService::GetIdInfoResponse>* GetIdInfoRaw(::grpc::ClientContext* context, const ::idCardService::GetIdInfoRequest& request) = 0;
    virtual ::grpc::ClientAsyncReaderInterface< ::idCardService::GetIdInfoResponse>* AsyncGetIdInfoRaw(::grpc::ClientContext* context, const ::idCardService::GetIdInfoRequest& request, ::grpc::CompletionQueue* cq, void* tag) = 0;
    virtual ::grpc::ClientAsyncReaderInterface< ::idCardService::GetIdInfoResponse>* PrepareAsyncGetIdInfoRaw(::grpc::ClientContext* context, const ::idCardService::GetIdInfoRequest& request, ::grpc::CompletionQueue* cq) = 0;
  };
  class Stub final : public StubInterface {
   public:
    Stub(const std::shared_ptr< ::grpc::ChannelInterface>& channel);
    std::unique_ptr< ::grpc::ClientReader< ::idCardService::GetIdInfoResponse>> GetIdInfo(::grpc::ClientContext* context, const ::idCardService::GetIdInfoRequest& request) {
      return std::unique_ptr< ::grpc::ClientReader< ::idCardService::GetIdInfoResponse>>(GetIdInfoRaw(context, request));
    }
    std::unique_ptr< ::grpc::ClientAsyncReader< ::idCardService::GetIdInfoResponse>> AsyncGetIdInfo(::grpc::ClientContext* context, const ::idCardService::GetIdInfoRequest& request, ::grpc::CompletionQueue* cq, void* tag) {
      return std::unique_ptr< ::grpc::ClientAsyncReader< ::idCardService::GetIdInfoResponse>>(AsyncGetIdInfoRaw(context, request, cq, tag));
    }
    std::unique_ptr< ::grpc::ClientAsyncReader< ::idCardService::GetIdInfoResponse>> PrepareAsyncGetIdInfo(::grpc::ClientContext* context, const ::idCardService::GetIdInfoRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncReader< ::idCardService::GetIdInfoResponse>>(PrepareAsyncGetIdInfoRaw(context, request, cq));
    }
    class experimental_async final :
      public StubInterface::experimental_async_interface {
     public:
      void GetIdInfo(::grpc::ClientContext* context, ::idCardService::GetIdInfoRequest* request, ::grpc::experimental::ClientReadReactor< ::idCardService::GetIdInfoResponse>* reactor) override;
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
    ::grpc::ClientReader< ::idCardService::GetIdInfoResponse>* GetIdInfoRaw(::grpc::ClientContext* context, const ::idCardService::GetIdInfoRequest& request) override;
    ::grpc::ClientAsyncReader< ::idCardService::GetIdInfoResponse>* AsyncGetIdInfoRaw(::grpc::ClientContext* context, const ::idCardService::GetIdInfoRequest& request, ::grpc::CompletionQueue* cq, void* tag) override;
    ::grpc::ClientAsyncReader< ::idCardService::GetIdInfoResponse>* PrepareAsyncGetIdInfoRaw(::grpc::ClientContext* context, const ::idCardService::GetIdInfoRequest& request, ::grpc::CompletionQueue* cq) override;
    const ::grpc::internal::RpcMethod rpcmethod_GetIdInfo_;
  };
  static std::unique_ptr<Stub> NewStub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options = ::grpc::StubOptions());

  class Service : public ::grpc::Service {
   public:
    Service();
    virtual ~Service();
    // 获取读卡数据流
    virtual ::grpc::Status GetIdInfo(::grpc::ServerContext* context, const ::idCardService::GetIdInfoRequest* request, ::grpc::ServerWriter< ::idCardService::GetIdInfoResponse>* writer);
  };
  template <class BaseClass>
  class WithAsyncMethod_GetIdInfo : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service *service) {}
   public:
    WithAsyncMethod_GetIdInfo() {
      ::grpc::Service::MarkMethodAsync(0);
    }
    ~WithAsyncMethod_GetIdInfo() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status GetIdInfo(::grpc::ServerContext* context, const ::idCardService::GetIdInfoRequest* request, ::grpc::ServerWriter< ::idCardService::GetIdInfoResponse>* writer) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    void RequestGetIdInfo(::grpc::ServerContext* context, ::idCardService::GetIdInfoRequest* request, ::grpc::ServerAsyncWriter< ::idCardService::GetIdInfoResponse>* writer, ::grpc::CompletionQueue* new_call_cq, ::grpc::ServerCompletionQueue* notification_cq, void *tag) {
      ::grpc::Service::RequestAsyncServerStreaming(0, context, request, writer, new_call_cq, notification_cq, tag);
    }
  };
  typedef WithAsyncMethod_GetIdInfo<Service > AsyncService;
  template <class BaseClass>
  class ExperimentalWithCallbackMethod_GetIdInfo : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service *service) {}
   public:
    ExperimentalWithCallbackMethod_GetIdInfo() {
      ::grpc::Service::experimental().MarkMethodCallback(0,
        new ::grpc::internal::CallbackServerStreamingHandler< ::idCardService::GetIdInfoRequest, ::idCardService::GetIdInfoResponse>(
          [this] { return this->GetIdInfo(); }));
    }
    ~ExperimentalWithCallbackMethod_GetIdInfo() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status GetIdInfo(::grpc::ServerContext* context, const ::idCardService::GetIdInfoRequest* request, ::grpc::ServerWriter< ::idCardService::GetIdInfoResponse>* writer) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    virtual ::grpc::experimental::ServerWriteReactor< ::idCardService::GetIdInfoRequest, ::idCardService::GetIdInfoResponse>* GetIdInfo() {
      return new ::grpc::internal::UnimplementedWriteReactor<
        ::idCardService::GetIdInfoRequest, ::idCardService::GetIdInfoResponse>;}
  };
  typedef ExperimentalWithCallbackMethod_GetIdInfo<Service > ExperimentalCallbackService;
  template <class BaseClass>
  class WithGenericMethod_GetIdInfo : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service *service) {}
   public:
    WithGenericMethod_GetIdInfo() {
      ::grpc::Service::MarkMethodGeneric(0);
    }
    ~WithGenericMethod_GetIdInfo() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status GetIdInfo(::grpc::ServerContext* context, const ::idCardService::GetIdInfoRequest* request, ::grpc::ServerWriter< ::idCardService::GetIdInfoResponse>* writer) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
  };
  template <class BaseClass>
  class WithRawMethod_GetIdInfo : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service *service) {}
   public:
    WithRawMethod_GetIdInfo() {
      ::grpc::Service::MarkMethodRaw(0);
    }
    ~WithRawMethod_GetIdInfo() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status GetIdInfo(::grpc::ServerContext* context, const ::idCardService::GetIdInfoRequest* request, ::grpc::ServerWriter< ::idCardService::GetIdInfoResponse>* writer) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    void RequestGetIdInfo(::grpc::ServerContext* context, ::grpc::ByteBuffer* request, ::grpc::ServerAsyncWriter< ::grpc::ByteBuffer>* writer, ::grpc::CompletionQueue* new_call_cq, ::grpc::ServerCompletionQueue* notification_cq, void *tag) {
      ::grpc::Service::RequestAsyncServerStreaming(0, context, request, writer, new_call_cq, notification_cq, tag);
    }
  };
  template <class BaseClass>
  class ExperimentalWithRawCallbackMethod_GetIdInfo : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service *service) {}
   public:
    ExperimentalWithRawCallbackMethod_GetIdInfo() {
      ::grpc::Service::experimental().MarkMethodRawCallback(0,
        new ::grpc::internal::CallbackServerStreamingHandler< ::grpc::ByteBuffer, ::grpc::ByteBuffer>(
          [this] { return this->GetIdInfo(); }));
    }
    ~ExperimentalWithRawCallbackMethod_GetIdInfo() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status GetIdInfo(::grpc::ServerContext* context, const ::idCardService::GetIdInfoRequest* request, ::grpc::ServerWriter< ::idCardService::GetIdInfoResponse>* writer) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    virtual ::grpc::experimental::ServerWriteReactor< ::grpc::ByteBuffer, ::grpc::ByteBuffer>* GetIdInfo() {
      return new ::grpc::internal::UnimplementedWriteReactor<
        ::grpc::ByteBuffer, ::grpc::ByteBuffer>;}
  };
  typedef Service StreamedUnaryService;
  template <class BaseClass>
  class WithSplitStreamingMethod_GetIdInfo : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service *service) {}
   public:
    WithSplitStreamingMethod_GetIdInfo() {
      ::grpc::Service::MarkMethodStreamed(0,
        new ::grpc::internal::SplitServerStreamingHandler< ::idCardService::GetIdInfoRequest, ::idCardService::GetIdInfoResponse>(std::bind(&WithSplitStreamingMethod_GetIdInfo<BaseClass>::StreamedGetIdInfo, this, std::placeholders::_1, std::placeholders::_2)));
    }
    ~WithSplitStreamingMethod_GetIdInfo() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable regular version of this method
    ::grpc::Status GetIdInfo(::grpc::ServerContext* context, const ::idCardService::GetIdInfoRequest* request, ::grpc::ServerWriter< ::idCardService::GetIdInfoResponse>* writer) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    // replace default version of method with split streamed
    virtual ::grpc::Status StreamedGetIdInfo(::grpc::ServerContext* context, ::grpc::ServerSplitStreamer< ::idCardService::GetIdInfoRequest,::idCardService::GetIdInfoResponse>* server_split_streamer) = 0;
  };
  typedef WithSplitStreamingMethod_GetIdInfo<Service > SplitStreamedService;
  typedef WithSplitStreamingMethod_GetIdInfo<Service > StreamedService;
};

}  // namespace idCardService


#endif  // GRPC_idcard_2eproto__INCLUDED