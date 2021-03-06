// Code generated by protoc-gen-go. DO NOT EDIT.
// source: xcodescanner.proto

package xcodescannerpb

import (
	context "context"
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
	math "math"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion3 // please upgrade the proto package

type GetScanDataRequest struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetScanDataRequest) Reset()         { *m = GetScanDataRequest{} }
func (m *GetScanDataRequest) String() string { return proto.CompactTextString(m) }
func (*GetScanDataRequest) ProtoMessage()    {}
func (*GetScanDataRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_299530cd27f121ef, []int{0}
}

func (m *GetScanDataRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetScanDataRequest.Unmarshal(m, b)
}
func (m *GetScanDataRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetScanDataRequest.Marshal(b, m, deterministic)
}
func (m *GetScanDataRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetScanDataRequest.Merge(m, src)
}
func (m *GetScanDataRequest) XXX_Size() int {
	return xxx_messageInfo_GetScanDataRequest.Size(m)
}
func (m *GetScanDataRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_GetScanDataRequest.DiscardUnknown(m)
}

var xxx_messageInfo_GetScanDataRequest proto.InternalMessageInfo

// 扫码结果
type GetScanDataResponse struct {
	Content              string   `protobuf:"bytes,1,opt,name=content,proto3" json:"content,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetScanDataResponse) Reset()         { *m = GetScanDataResponse{} }
func (m *GetScanDataResponse) String() string { return proto.CompactTextString(m) }
func (*GetScanDataResponse) ProtoMessage()    {}
func (*GetScanDataResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_299530cd27f121ef, []int{1}
}

func (m *GetScanDataResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetScanDataResponse.Unmarshal(m, b)
}
func (m *GetScanDataResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetScanDataResponse.Marshal(b, m, deterministic)
}
func (m *GetScanDataResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetScanDataResponse.Merge(m, src)
}
func (m *GetScanDataResponse) XXX_Size() int {
	return xxx_messageInfo_GetScanDataResponse.Size(m)
}
func (m *GetScanDataResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_GetScanDataResponse.DiscardUnknown(m)
}

var xxx_messageInfo_GetScanDataResponse proto.InternalMessageInfo

func (m *GetScanDataResponse) GetContent() string {
	if m != nil {
		return m.Content
	}
	return ""
}

func init() {
	proto.RegisterType((*GetScanDataRequest)(nil), "xcScannerService.GetScanDataRequest")
	proto.RegisterType((*GetScanDataResponse)(nil), "xcScannerService.GetScanDataResponse")
}

func init() { proto.RegisterFile("xcodescanner.proto", fileDescriptor_299530cd27f121ef) }

var fileDescriptor_299530cd27f121ef = []byte{
	// 188 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x12, 0xaa, 0x48, 0xce, 0x4f,
	0x49, 0x2d, 0x4e, 0x4e, 0xcc, 0xcb, 0x4b, 0x2d, 0xd2, 0x2b, 0x28, 0xca, 0x2f, 0xc9, 0x17, 0x12,
	0xa8, 0x48, 0x0e, 0x86, 0x08, 0x04, 0xa7, 0x16, 0x95, 0x65, 0x26, 0xa7, 0x2a, 0x89, 0x70, 0x09,
	0xb9, 0xa7, 0x96, 0x80, 0x04, 0x5d, 0x12, 0x4b, 0x12, 0x83, 0x52, 0x0b, 0x4b, 0x53, 0x8b, 0x4b,
	0x94, 0xf4, 0xb9, 0x84, 0x51, 0x44, 0x8b, 0x0b, 0xf2, 0xf3, 0x8a, 0x53, 0x85, 0x24, 0xb8, 0xd8,
	0x93, 0xf3, 0xf3, 0x4a, 0x52, 0xf3, 0x4a, 0x24, 0x18, 0x15, 0x18, 0x35, 0x38, 0x83, 0x60, 0x5c,
	0xa3, 0x52, 0x2e, 0xe1, 0x08, 0xe7, 0xfc, 0x94, 0x54, 0x54, 0xd3, 0x85, 0xe2, 0xb8, 0xb8, 0x91,
	0xcc, 0x11, 0x52, 0xd1, 0x43, 0xb7, 0x5f, 0x0f, 0xd3, 0x72, 0x29, 0x55, 0x02, 0xaa, 0x20, 0x8e,
	0x51, 0x62, 0x30, 0x60, 0x74, 0xf2, 0xe4, 0x52, 0x48, 0xce, 0xcf, 0xd5, 0xcb, 0xca, 0x2a, 0xca,
	0x4f, 0xca, 0x2f, 0xd1, 0x4b, 0xcc, 0x4b, 0xa9, 0x34, 0xd1, 0x43, 0xf6, 0x77, 0x41, 0x92, 0x93,
	0x28, 0x16, 0x87, 0x05, 0x38, 0x45, 0xf1, 0xa1, 0x2a, 0x4b, 0x62, 0x03, 0x87, 0x90, 0x31, 0x20,
	0x00, 0x00, 0xff, 0xff, 0xa2, 0x01, 0x56, 0x15, 0x37, 0x01, 0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConnInterface

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion6

// XCodeScannerServiceClient is the client API for XCodeScannerService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type XCodeScannerServiceClient interface {
	// GetScanData 监听扫码设备数据
	//
	// 支持读取常用的二维码，BarCode
	//
	// 开发管理平台功能参考: http://10.10.10.2/xcode_scanner
	GetScanData(ctx context.Context, in *GetScanDataRequest, opts ...grpc.CallOption) (XCodeScannerService_GetScanDataClient, error)
}

type xCodeScannerServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewXCodeScannerServiceClient(cc grpc.ClientConnInterface) XCodeScannerServiceClient {
	return &xCodeScannerServiceClient{cc}
}

func (c *xCodeScannerServiceClient) GetScanData(ctx context.Context, in *GetScanDataRequest, opts ...grpc.CallOption) (XCodeScannerService_GetScanDataClient, error) {
	stream, err := c.cc.NewStream(ctx, &_XCodeScannerService_serviceDesc.Streams[0], "/xcScannerService.XCodeScannerService/GetScanData", opts...)
	if err != nil {
		return nil, err
	}
	x := &xCodeScannerServiceGetScanDataClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type XCodeScannerService_GetScanDataClient interface {
	Recv() (*GetScanDataResponse, error)
	grpc.ClientStream
}

type xCodeScannerServiceGetScanDataClient struct {
	grpc.ClientStream
}

func (x *xCodeScannerServiceGetScanDataClient) Recv() (*GetScanDataResponse, error) {
	m := new(GetScanDataResponse)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

// XCodeScannerServiceServer is the server API for XCodeScannerService service.
type XCodeScannerServiceServer interface {
	// GetScanData 监听扫码设备数据
	//
	// 支持读取常用的二维码，BarCode
	//
	// 开发管理平台功能参考: http://10.10.10.2/xcode_scanner
	GetScanData(*GetScanDataRequest, XCodeScannerService_GetScanDataServer) error
}

// UnimplementedXCodeScannerServiceServer can be embedded to have forward compatible implementations.
type UnimplementedXCodeScannerServiceServer struct {
}

func (*UnimplementedXCodeScannerServiceServer) GetScanData(req *GetScanDataRequest, srv XCodeScannerService_GetScanDataServer) error {
	return status.Errorf(codes.Unimplemented, "method GetScanData not implemented")
}

func RegisterXCodeScannerServiceServer(s *grpc.Server, srv XCodeScannerServiceServer) {
	s.RegisterService(&_XCodeScannerService_serviceDesc, srv)
}

func _XCodeScannerService_GetScanData_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(GetScanDataRequest)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(XCodeScannerServiceServer).GetScanData(m, &xCodeScannerServiceGetScanDataServer{stream})
}

type XCodeScannerService_GetScanDataServer interface {
	Send(*GetScanDataResponse) error
	grpc.ServerStream
}

type xCodeScannerServiceGetScanDataServer struct {
	grpc.ServerStream
}

func (x *xCodeScannerServiceGetScanDataServer) Send(m *GetScanDataResponse) error {
	return x.ServerStream.SendMsg(m)
}

var _XCodeScannerService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "xcScannerService.XCodeScannerService",
	HandlerType: (*XCodeScannerServiceServer)(nil),
	Methods:     []grpc.MethodDesc{},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "GetScanData",
			Handler:       _XCodeScannerService_GetScanData_Handler,
			ServerStreams: true,
		},
	},
	Metadata: "xcodescanner.proto",
}
