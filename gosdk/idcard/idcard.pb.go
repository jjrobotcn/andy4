// Code generated by protoc-gen-go. DO NOT EDIT.
// source: idcard.proto

package idcardpb

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

// 获取读卡数据流请求
type GetIdInfoRequest struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetIdInfoRequest) Reset()         { *m = GetIdInfoRequest{} }
func (m *GetIdInfoRequest) String() string { return proto.CompactTextString(m) }
func (*GetIdInfoRequest) ProtoMessage()    {}
func (*GetIdInfoRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_c0457ec9a92161a4, []int{0}
}

func (m *GetIdInfoRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetIdInfoRequest.Unmarshal(m, b)
}
func (m *GetIdInfoRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetIdInfoRequest.Marshal(b, m, deterministic)
}
func (m *GetIdInfoRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetIdInfoRequest.Merge(m, src)
}
func (m *GetIdInfoRequest) XXX_Size() int {
	return xxx_messageInfo_GetIdInfoRequest.Size(m)
}
func (m *GetIdInfoRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_GetIdInfoRequest.DiscardUnknown(m)
}

var xxx_messageInfo_GetIdInfoRequest proto.InternalMessageInfo

// 身份证数据
type IdInfo struct {
	// 身份证号
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	// 姓名
	Name string `protobuf:"bytes,2,opt,name=name,proto3" json:"name,omitempty"`
	// 性别
	Gender string `protobuf:"bytes,3,opt,name=gender,proto3" json:"gender,omitempty"`
	// 民族
	National string `protobuf:"bytes,4,opt,name=national,proto3" json:"national,omitempty"`
	// 出生日期
	Birthday string `protobuf:"bytes,5,opt,name=birthday,proto3" json:"birthday,omitempty"`
	// 地址
	Address string `protobuf:"bytes,6,opt,name=address,proto3" json:"address,omitempty"`
	// 发证机关
	SignOrganization string `protobuf:"bytes,7,opt,name=sign_organization,json=signOrganization,proto3" json:"sign_organization,omitempty"`
	// 有效期开始日期
	StartDate string `protobuf:"bytes,8,opt,name=start_date,json=startDate,proto3" json:"start_date,omitempty"`
	// 有效期截止日期
	EndDate string `protobuf:"bytes,9,opt,name=end_date,json=endDate,proto3" json:"end_date,omitempty"`
	// 身份证头像图片数据
	Photo                []byte   `protobuf:"bytes,10,opt,name=photo,proto3" json:"photo,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *IdInfo) Reset()         { *m = IdInfo{} }
func (m *IdInfo) String() string { return proto.CompactTextString(m) }
func (*IdInfo) ProtoMessage()    {}
func (*IdInfo) Descriptor() ([]byte, []int) {
	return fileDescriptor_c0457ec9a92161a4, []int{1}
}

func (m *IdInfo) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_IdInfo.Unmarshal(m, b)
}
func (m *IdInfo) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_IdInfo.Marshal(b, m, deterministic)
}
func (m *IdInfo) XXX_Merge(src proto.Message) {
	xxx_messageInfo_IdInfo.Merge(m, src)
}
func (m *IdInfo) XXX_Size() int {
	return xxx_messageInfo_IdInfo.Size(m)
}
func (m *IdInfo) XXX_DiscardUnknown() {
	xxx_messageInfo_IdInfo.DiscardUnknown(m)
}

var xxx_messageInfo_IdInfo proto.InternalMessageInfo

func (m *IdInfo) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *IdInfo) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

func (m *IdInfo) GetGender() string {
	if m != nil {
		return m.Gender
	}
	return ""
}

func (m *IdInfo) GetNational() string {
	if m != nil {
		return m.National
	}
	return ""
}

func (m *IdInfo) GetBirthday() string {
	if m != nil {
		return m.Birthday
	}
	return ""
}

func (m *IdInfo) GetAddress() string {
	if m != nil {
		return m.Address
	}
	return ""
}

func (m *IdInfo) GetSignOrganization() string {
	if m != nil {
		return m.SignOrganization
	}
	return ""
}

func (m *IdInfo) GetStartDate() string {
	if m != nil {
		return m.StartDate
	}
	return ""
}

func (m *IdInfo) GetEndDate() string {
	if m != nil {
		return m.EndDate
	}
	return ""
}

func (m *IdInfo) GetPhoto() []byte {
	if m != nil {
		return m.Photo
	}
	return nil
}

// 获取读卡数据流结果
type GetIdInfoResponse struct {
	// 身份证数据
	IdInfo               *IdInfo  `protobuf:"bytes,1,opt,name=id_info,json=idInfo,proto3" json:"id_info,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetIdInfoResponse) Reset()         { *m = GetIdInfoResponse{} }
func (m *GetIdInfoResponse) String() string { return proto.CompactTextString(m) }
func (*GetIdInfoResponse) ProtoMessage()    {}
func (*GetIdInfoResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_c0457ec9a92161a4, []int{2}
}

func (m *GetIdInfoResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetIdInfoResponse.Unmarshal(m, b)
}
func (m *GetIdInfoResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetIdInfoResponse.Marshal(b, m, deterministic)
}
func (m *GetIdInfoResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetIdInfoResponse.Merge(m, src)
}
func (m *GetIdInfoResponse) XXX_Size() int {
	return xxx_messageInfo_GetIdInfoResponse.Size(m)
}
func (m *GetIdInfoResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_GetIdInfoResponse.DiscardUnknown(m)
}

var xxx_messageInfo_GetIdInfoResponse proto.InternalMessageInfo

func (m *GetIdInfoResponse) GetIdInfo() *IdInfo {
	if m != nil {
		return m.IdInfo
	}
	return nil
}

func init() {
	proto.RegisterType((*GetIdInfoRequest)(nil), "idCardService.GetIdInfoRequest")
	proto.RegisterType((*IdInfo)(nil), "idCardService.IdInfo")
	proto.RegisterType((*GetIdInfoResponse)(nil), "idCardService.GetIdInfoResponse")
}

func init() { proto.RegisterFile("idcard.proto", fileDescriptor_c0457ec9a92161a4) }

var fileDescriptor_c0457ec9a92161a4 = []byte{
	// 357 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x74, 0x92, 0xd1, 0x8b, 0xda, 0x40,
	0x10, 0xc6, 0x9b, 0x54, 0x63, 0x32, 0x6a, 0xab, 0x4b, 0x5b, 0xb6, 0x42, 0xa9, 0xe4, 0x49, 0x28,
	0x84, 0x62, 0x0b, 0x7d, 0x57, 0xa1, 0xd8, 0x97, 0x96, 0xf4, 0xed, 0x5e, 0x64, 0x93, 0x19, 0x75,
	0xe5, 0xdc, 0xcd, 0xed, 0xee, 0x09, 0xde, 0xbf, 0x73, 0xff, 0xe8, 0xe1, 0x46, 0x45, 0x85, 0x7b,
	0x4a, 0xbe, 0xef, 0xf7, 0xed, 0xec, 0x30, 0x3b, 0xd0, 0x91, 0x58, 0x0a, 0x83, 0x59, 0x65, 0xb4,
	0xd3, 0xac, 0x2b, 0x71, 0x2a, 0x0c, 0xfe, 0x27, 0xb3, 0x93, 0x25, 0xa5, 0x0c, 0x7a, 0xbf, 0xc9,
	0xcd, 0x71, 0xae, 0x96, 0x3a, 0xa7, 0x87, 0x47, 0xb2, 0x2e, 0x7d, 0x0e, 0x21, 0xaa, 0x1d, 0xf6,
	0x0e, 0x42, 0x89, 0x3c, 0x18, 0x06, 0xa3, 0x24, 0x0f, 0x25, 0x32, 0x06, 0x0d, 0x25, 0xb6, 0xc4,
	0x43, 0xef, 0xf8, 0x7f, 0xf6, 0x09, 0xa2, 0x15, 0x29, 0x24, 0xc3, 0xdf, 0x7a, 0xf7, 0xa8, 0xd8,
	0x00, 0x62, 0x25, 0x9c, 0xd4, 0x4a, 0xdc, 0xf3, 0x86, 0x27, 0x67, 0x7d, 0x60, 0x85, 0x34, 0x6e,
	0x8d, 0x62, 0xcf, 0x9b, 0x35, 0x3b, 0x69, 0xc6, 0xa1, 0x25, 0x10, 0x0d, 0x59, 0xcb, 0x23, 0x8f,
	0x4e, 0x92, 0x7d, 0x83, 0xbe, 0x95, 0x2b, 0xb5, 0xd0, 0x66, 0x25, 0x94, 0x7c, 0xf2, 0xc5, 0x78,
	0xcb, 0x67, 0x7a, 0x07, 0xf0, 0xf7, 0xc2, 0x67, 0x5f, 0x00, 0xac, 0x13, 0xc6, 0x2d, 0x50, 0x38,
	0xe2, 0xb1, 0x4f, 0x25, 0xde, 0x99, 0x09, 0x47, 0xec, 0x33, 0xc4, 0xa4, 0xb0, 0x86, 0x49, 0x7d,
	0x0d, 0x29, 0xf4, 0xe8, 0x03, 0x34, 0xab, 0xb5, 0x76, 0x9a, 0xc3, 0x30, 0x18, 0x75, 0xf2, 0x5a,
	0xfc, 0x69, 0xc4, 0xed, 0x5e, 0x27, 0x8f, 0x0d, 0x59, 0x32, 0x3b, 0xc2, 0x74, 0x0a, 0xfd, 0x8b,
	0xc9, 0xd9, 0x4a, 0x2b, 0x4b, 0x2c, 0x83, 0x96, 0xc4, 0x85, 0x54, 0x4b, 0xed, 0x87, 0xd6, 0x1e,
	0x7f, 0xcc, 0xae, 0xe6, 0x9d, 0x1d, 0xf3, 0x91, 0xf4, 0xdf, 0x71, 0x09, 0xdd, 0xf9, 0xec, 0x82,
	0xb3, 0x1c, 0x92, 0x73, 0x55, 0xf6, 0xf5, 0xe6, 0xf0, 0xed, 0x4b, 0x0d, 0x86, 0xaf, 0x07, 0xea,
	0x86, 0xd2, 0x37, 0xdf, 0x83, 0xc9, 0x2f, 0x18, 0x94, 0x7a, 0x9b, 0x6d, 0x36, 0x46, 0x17, 0xda,
	0x65, 0x42, 0xe1, 0xfe, 0x67, 0x56, 0x2f, 0x45, 0x55, 0x4c, 0xde, 0x5f, 0x35, 0xf0, 0x6f, 0x72,
	0x17, 0x9f, 0x50, 0x11, 0xf9, 0x95, 0xf9, 0xf1, 0x12, 0x00, 0x00, 0xff, 0xff, 0x8f, 0x91, 0x7c,
	0x03, 0x42, 0x02, 0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConnInterface

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion6

// IDCardServiceClient is the client API for IDCardService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type IDCardServiceClient interface {
	// GetIdInfo 监听读取身份证数据
	//
	// 开发管理平台功能参考: http://10.10.10.2/id_card
	GetIdInfo(ctx context.Context, in *GetIdInfoRequest, opts ...grpc.CallOption) (IDCardService_GetIdInfoClient, error)
}

type iDCardServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewIDCardServiceClient(cc grpc.ClientConnInterface) IDCardServiceClient {
	return &iDCardServiceClient{cc}
}

func (c *iDCardServiceClient) GetIdInfo(ctx context.Context, in *GetIdInfoRequest, opts ...grpc.CallOption) (IDCardService_GetIdInfoClient, error) {
	stream, err := c.cc.NewStream(ctx, &_IDCardService_serviceDesc.Streams[0], "/idCardService.IDCardService/GetIdInfo", opts...)
	if err != nil {
		return nil, err
	}
	x := &iDCardServiceGetIdInfoClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type IDCardService_GetIdInfoClient interface {
	Recv() (*GetIdInfoResponse, error)
	grpc.ClientStream
}

type iDCardServiceGetIdInfoClient struct {
	grpc.ClientStream
}

func (x *iDCardServiceGetIdInfoClient) Recv() (*GetIdInfoResponse, error) {
	m := new(GetIdInfoResponse)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

// IDCardServiceServer is the server API for IDCardService service.
type IDCardServiceServer interface {
	// GetIdInfo 监听读取身份证数据
	//
	// 开发管理平台功能参考: http://10.10.10.2/id_card
	GetIdInfo(*GetIdInfoRequest, IDCardService_GetIdInfoServer) error
}

// UnimplementedIDCardServiceServer can be embedded to have forward compatible implementations.
type UnimplementedIDCardServiceServer struct {
}

func (*UnimplementedIDCardServiceServer) GetIdInfo(req *GetIdInfoRequest, srv IDCardService_GetIdInfoServer) error {
	return status.Errorf(codes.Unimplemented, "method GetIdInfo not implemented")
}

func RegisterIDCardServiceServer(s *grpc.Server, srv IDCardServiceServer) {
	s.RegisterService(&_IDCardService_serviceDesc, srv)
}

func _IDCardService_GetIdInfo_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(GetIdInfoRequest)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(IDCardServiceServer).GetIdInfo(m, &iDCardServiceGetIdInfoServer{stream})
}

type IDCardService_GetIdInfoServer interface {
	Send(*GetIdInfoResponse) error
	grpc.ServerStream
}

type iDCardServiceGetIdInfoServer struct {
	grpc.ServerStream
}

func (x *iDCardServiceGetIdInfoServer) Send(m *GetIdInfoResponse) error {
	return x.ServerStream.SendMsg(m)
}

var _IDCardService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "idCardService.IDCardService",
	HandlerType: (*IDCardServiceServer)(nil),
	Methods:     []grpc.MethodDesc{},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "GetIdInfo",
			Handler:       _IDCardService_GetIdInfo_Handler,
			ServerStreams: true,
		},
	},
	Metadata: "idcard.proto",
}