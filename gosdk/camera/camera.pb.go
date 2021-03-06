// Code generated by protoc-gen-go. DO NOT EDIT.
// source: camera.proto

package camerapb

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

type LiveH264StreamRequest struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *LiveH264StreamRequest) Reset()         { *m = LiveH264StreamRequest{} }
func (m *LiveH264StreamRequest) String() string { return proto.CompactTextString(m) }
func (*LiveH264StreamRequest) ProtoMessage()    {}
func (*LiveH264StreamRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_2f444de3b23b55d1, []int{0}
}

func (m *LiveH264StreamRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_LiveH264StreamRequest.Unmarshal(m, b)
}
func (m *LiveH264StreamRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_LiveH264StreamRequest.Marshal(b, m, deterministic)
}
func (m *LiveH264StreamRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_LiveH264StreamRequest.Merge(m, src)
}
func (m *LiveH264StreamRequest) XXX_Size() int {
	return xxx_messageInfo_LiveH264StreamRequest.Size(m)
}
func (m *LiveH264StreamRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_LiveH264StreamRequest.DiscardUnknown(m)
}

var xxx_messageInfo_LiveH264StreamRequest proto.InternalMessageInfo

type LiveH264StreamResponse struct {
	// H264帧数据
	Frame                []byte   `protobuf:"bytes,1,opt,name=frame,proto3" json:"frame,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *LiveH264StreamResponse) Reset()         { *m = LiveH264StreamResponse{} }
func (m *LiveH264StreamResponse) String() string { return proto.CompactTextString(m) }
func (*LiveH264StreamResponse) ProtoMessage()    {}
func (*LiveH264StreamResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_2f444de3b23b55d1, []int{1}
}

func (m *LiveH264StreamResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_LiveH264StreamResponse.Unmarshal(m, b)
}
func (m *LiveH264StreamResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_LiveH264StreamResponse.Marshal(b, m, deterministic)
}
func (m *LiveH264StreamResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_LiveH264StreamResponse.Merge(m, src)
}
func (m *LiveH264StreamResponse) XXX_Size() int {
	return xxx_messageInfo_LiveH264StreamResponse.Size(m)
}
func (m *LiveH264StreamResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_LiveH264StreamResponse.DiscardUnknown(m)
}

var xxx_messageInfo_LiveH264StreamResponse proto.InternalMessageInfo

func (m *LiveH264StreamResponse) GetFrame() []byte {
	if m != nil {
		return m.Frame
	}
	return nil
}

type LatestImageRequest struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *LatestImageRequest) Reset()         { *m = LatestImageRequest{} }
func (m *LatestImageRequest) String() string { return proto.CompactTextString(m) }
func (*LatestImageRequest) ProtoMessage()    {}
func (*LatestImageRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_2f444de3b23b55d1, []int{2}
}

func (m *LatestImageRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_LatestImageRequest.Unmarshal(m, b)
}
func (m *LatestImageRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_LatestImageRequest.Marshal(b, m, deterministic)
}
func (m *LatestImageRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_LatestImageRequest.Merge(m, src)
}
func (m *LatestImageRequest) XXX_Size() int {
	return xxx_messageInfo_LatestImageRequest.Size(m)
}
func (m *LatestImageRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_LatestImageRequest.DiscardUnknown(m)
}

var xxx_messageInfo_LatestImageRequest proto.InternalMessageInfo

type LatestImageResponse struct {
	// 截图时间
	// e.g. "1577811723000"
	Time string `protobuf:"bytes,1,opt,name=time,proto3" json:"time,omitempty"`
	// 图片数据内容
	Image                []byte   `protobuf:"bytes,2,opt,name=image,proto3" json:"image,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *LatestImageResponse) Reset()         { *m = LatestImageResponse{} }
func (m *LatestImageResponse) String() string { return proto.CompactTextString(m) }
func (*LatestImageResponse) ProtoMessage()    {}
func (*LatestImageResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_2f444de3b23b55d1, []int{3}
}

func (m *LatestImageResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_LatestImageResponse.Unmarshal(m, b)
}
func (m *LatestImageResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_LatestImageResponse.Marshal(b, m, deterministic)
}
func (m *LatestImageResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_LatestImageResponse.Merge(m, src)
}
func (m *LatestImageResponse) XXX_Size() int {
	return xxx_messageInfo_LatestImageResponse.Size(m)
}
func (m *LatestImageResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_LatestImageResponse.DiscardUnknown(m)
}

var xxx_messageInfo_LatestImageResponse proto.InternalMessageInfo

func (m *LatestImageResponse) GetTime() string {
	if m != nil {
		return m.Time
	}
	return ""
}

func (m *LatestImageResponse) GetImage() []byte {
	if m != nil {
		return m.Image
	}
	return nil
}

func init() {
	proto.RegisterType((*LiveH264StreamRequest)(nil), "cameraService.LiveH264StreamRequest")
	proto.RegisterType((*LiveH264StreamResponse)(nil), "cameraService.LiveH264StreamResponse")
	proto.RegisterType((*LatestImageRequest)(nil), "cameraService.LatestImageRequest")
	proto.RegisterType((*LatestImageResponse)(nil), "cameraService.LatestImageResponse")
}

func init() { proto.RegisterFile("camera.proto", fileDescriptor_2f444de3b23b55d1) }

var fileDescriptor_2f444de3b23b55d1 = []byte{
	// 244 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0xe2, 0x49, 0x4e, 0xcc, 0x4d,
	0x2d, 0x4a, 0xd4, 0x2b, 0x28, 0xca, 0x2f, 0xc9, 0x17, 0xe2, 0x85, 0xf0, 0x82, 0x53, 0x8b, 0xca,
	0x32, 0x93, 0x53, 0x95, 0xc4, 0xb9, 0x44, 0x7d, 0x32, 0xcb, 0x52, 0x3d, 0x8c, 0xcc, 0x4c, 0x82,
	0x4b, 0x8a, 0x52, 0x13, 0x73, 0x83, 0x52, 0x0b, 0x4b, 0x53, 0x8b, 0x4b, 0x94, 0xf4, 0xb8, 0xc4,
	0xd0, 0x25, 0x8a, 0x0b, 0xf2, 0xf3, 0x8a, 0x53, 0x85, 0x44, 0xb8, 0x58, 0xd3, 0x8a, 0x12, 0x73,
	0x53, 0x25, 0x18, 0x15, 0x18, 0x35, 0x78, 0x82, 0x20, 0x1c, 0x25, 0x11, 0x2e, 0x21, 0x9f, 0xc4,
	0x92, 0xd4, 0xe2, 0x12, 0xcf, 0xdc, 0xc4, 0xf4, 0x54, 0x98, 0x29, 0xf6, 0x5c, 0xc2, 0x28, 0xa2,
	0x50, 0x23, 0x84, 0xb8, 0x58, 0x4a, 0x32, 0xa1, 0x26, 0x70, 0x06, 0x81, 0xd9, 0x20, 0x63, 0x33,
	0x41, 0x8a, 0x24, 0x98, 0x20, 0xc6, 0x82, 0x39, 0x46, 0xa7, 0x18, 0xb9, 0x78, 0x9d, 0x91, 0x5d,
	0x2c, 0x94, 0xc8, 0xc5, 0x87, 0xea, 0x30, 0x21, 0x15, 0x3d, 0x14, 0x3f, 0xe9, 0x61, 0xf5, 0x90,
	0x94, 0x2a, 0x01, 0x55, 0x10, 0xa7, 0x29, 0x31, 0x18, 0x30, 0x0a, 0x85, 0x71, 0x71, 0x23, 0xb9,
	0x5a, 0x48, 0x11, 0x5d, 0x27, 0x86, 0x3f, 0xa5, 0x94, 0xf0, 0x29, 0x81, 0x99, 0xec, 0x64, 0xce,
	0x25, 0x95, 0x9c, 0x9f, 0xab, 0x97, 0x95, 0x55, 0x94, 0x9f, 0x94, 0x5f, 0xa2, 0x97, 0x98, 0x97,
	0x52, 0x69, 0x02, 0xd5, 0x58, 0x90, 0xe4, 0xc4, 0x8f, 0xe2, 0xcf, 0x00, 0xa7, 0x28, 0x0e, 0x98,
	0x54, 0x12, 0x1b, 0x38, 0xee, 0x8c, 0x01, 0x01, 0x00, 0x00, 0xff, 0xff, 0x3c, 0x09, 0x33, 0x9b,
	0xcb, 0x01, 0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConnInterface

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion6

// CameraServiceClient is the client API for CameraService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type CameraServiceClient interface {
	// LiveH264Stream 获取主摄像头视频流数据
	//
	// 输出数据为H264裸流，无音频，分辨率为960*720
	//
	// 网关不包含当前方法，WebSocket用户请使用独立接口
	// ws://10.10.10.2(:81)/api/v2/camera/ws/h264/live(?token=)
	// web应用中需调整数据类型: ws.binaryType = 'arraybuffer';
	//
	// 开发管理平台功能参考: http://10.10.10.2/camera/live/ws
	LiveH264Stream(ctx context.Context, in *LiveH264StreamRequest, opts ...grpc.CallOption) (CameraService_LiveH264StreamClient, error)
	// LatestImage 获取主摄像头实时图片数据
	//
	// 开发管理平台功能参考: http://10.10.10.2/camera/live/image
	LatestImage(ctx context.Context, in *LatestImageRequest, opts ...grpc.CallOption) (*LatestImageResponse, error)
}

type cameraServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewCameraServiceClient(cc grpc.ClientConnInterface) CameraServiceClient {
	return &cameraServiceClient{cc}
}

func (c *cameraServiceClient) LiveH264Stream(ctx context.Context, in *LiveH264StreamRequest, opts ...grpc.CallOption) (CameraService_LiveH264StreamClient, error) {
	stream, err := c.cc.NewStream(ctx, &_CameraService_serviceDesc.Streams[0], "/cameraService.CameraService/LiveH264Stream", opts...)
	if err != nil {
		return nil, err
	}
	x := &cameraServiceLiveH264StreamClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type CameraService_LiveH264StreamClient interface {
	Recv() (*LiveH264StreamResponse, error)
	grpc.ClientStream
}

type cameraServiceLiveH264StreamClient struct {
	grpc.ClientStream
}

func (x *cameraServiceLiveH264StreamClient) Recv() (*LiveH264StreamResponse, error) {
	m := new(LiveH264StreamResponse)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *cameraServiceClient) LatestImage(ctx context.Context, in *LatestImageRequest, opts ...grpc.CallOption) (*LatestImageResponse, error) {
	out := new(LatestImageResponse)
	err := c.cc.Invoke(ctx, "/cameraService.CameraService/LatestImage", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// CameraServiceServer is the server API for CameraService service.
type CameraServiceServer interface {
	// LiveH264Stream 获取主摄像头视频流数据
	//
	// 输出数据为H264裸流，无音频，分辨率为960*720
	//
	// 网关不包含当前方法，WebSocket用户请使用独立接口
	// ws://10.10.10.2(:81)/api/v2/camera/ws/h264/live(?token=)
	// web应用中需调整数据类型: ws.binaryType = 'arraybuffer';
	//
	// 开发管理平台功能参考: http://10.10.10.2/camera/live/ws
	LiveH264Stream(*LiveH264StreamRequest, CameraService_LiveH264StreamServer) error
	// LatestImage 获取主摄像头实时图片数据
	//
	// 开发管理平台功能参考: http://10.10.10.2/camera/live/image
	LatestImage(context.Context, *LatestImageRequest) (*LatestImageResponse, error)
}

// UnimplementedCameraServiceServer can be embedded to have forward compatible implementations.
type UnimplementedCameraServiceServer struct {
}

func (*UnimplementedCameraServiceServer) LiveH264Stream(req *LiveH264StreamRequest, srv CameraService_LiveH264StreamServer) error {
	return status.Errorf(codes.Unimplemented, "method LiveH264Stream not implemented")
}
func (*UnimplementedCameraServiceServer) LatestImage(ctx context.Context, req *LatestImageRequest) (*LatestImageResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method LatestImage not implemented")
}

func RegisterCameraServiceServer(s *grpc.Server, srv CameraServiceServer) {
	s.RegisterService(&_CameraService_serviceDesc, srv)
}

func _CameraService_LiveH264Stream_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(LiveH264StreamRequest)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(CameraServiceServer).LiveH264Stream(m, &cameraServiceLiveH264StreamServer{stream})
}

type CameraService_LiveH264StreamServer interface {
	Send(*LiveH264StreamResponse) error
	grpc.ServerStream
}

type cameraServiceLiveH264StreamServer struct {
	grpc.ServerStream
}

func (x *cameraServiceLiveH264StreamServer) Send(m *LiveH264StreamResponse) error {
	return x.ServerStream.SendMsg(m)
}

func _CameraService_LatestImage_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(LatestImageRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(CameraServiceServer).LatestImage(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/cameraService.CameraService/LatestImage",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(CameraServiceServer).LatestImage(ctx, req.(*LatestImageRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _CameraService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "cameraService.CameraService",
	HandlerType: (*CameraServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "LatestImage",
			Handler:    _CameraService_LatestImage_Handler,
		},
	},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "LiveH264Stream",
			Handler:       _CameraService_LiveH264Stream_Handler,
			ServerStreams: true,
		},
	},
	Metadata: "camera.proto",
}
