// Code generated by protoc-gen-go. DO NOT EDIT.
// source: face.proto

package faceRecognition

import (
	context "context"
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	_ "google.golang.org/genproto/googleapis/api/annotations"
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

type CompareRequest struct {
	FaceImg1             []byte   `protobuf:"bytes,1,opt,name=face_img1,json=faceImg1,proto3" json:"face_img1,omitempty"`
	FaceImg2             []byte   `protobuf:"bytes,2,opt,name=face_img2,json=faceImg2,proto3" json:"face_img2,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *CompareRequest) Reset()         { *m = CompareRequest{} }
func (m *CompareRequest) String() string { return proto.CompactTextString(m) }
func (*CompareRequest) ProtoMessage()    {}
func (*CompareRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_543a5193e84d47c5, []int{0}
}

func (m *CompareRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_CompareRequest.Unmarshal(m, b)
}
func (m *CompareRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_CompareRequest.Marshal(b, m, deterministic)
}
func (m *CompareRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_CompareRequest.Merge(m, src)
}
func (m *CompareRequest) XXX_Size() int {
	return xxx_messageInfo_CompareRequest.Size(m)
}
func (m *CompareRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_CompareRequest.DiscardUnknown(m)
}

var xxx_messageInfo_CompareRequest proto.InternalMessageInfo

func (m *CompareRequest) GetFaceImg1() []byte {
	if m != nil {
		return m.FaceImg1
	}
	return nil
}

func (m *CompareRequest) GetFaceImg2() []byte {
	if m != nil {
		return m.FaceImg2
	}
	return nil
}

type CompareResponse struct {
	// 对比结果信任值 [0, 1.0]
	Confidence           float32  `protobuf:"fixed32,1,opt,name=confidence,proto3" json:"confidence,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *CompareResponse) Reset()         { *m = CompareResponse{} }
func (m *CompareResponse) String() string { return proto.CompactTextString(m) }
func (*CompareResponse) ProtoMessage()    {}
func (*CompareResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_543a5193e84d47c5, []int{1}
}

func (m *CompareResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_CompareResponse.Unmarshal(m, b)
}
func (m *CompareResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_CompareResponse.Marshal(b, m, deterministic)
}
func (m *CompareResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_CompareResponse.Merge(m, src)
}
func (m *CompareResponse) XXX_Size() int {
	return xxx_messageInfo_CompareResponse.Size(m)
}
func (m *CompareResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_CompareResponse.DiscardUnknown(m)
}

var xxx_messageInfo_CompareResponse proto.InternalMessageInfo

func (m *CompareResponse) GetConfidence() float32 {
	if m != nil {
		return m.Confidence
	}
	return 0
}

type SearchRequest struct {
	// FaceSet.id
	FaceSetId string `protobuf:"bytes,1,opt,name=face_set_id,json=faceSetId,proto3" json:"face_set_id,omitempty"`
	// 待搜索人脸图片
	FaceImg              []byte   `protobuf:"bytes,2,opt,name=face_img,json=faceImg,proto3" json:"face_img,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *SearchRequest) Reset()         { *m = SearchRequest{} }
func (m *SearchRequest) String() string { return proto.CompactTextString(m) }
func (*SearchRequest) ProtoMessage()    {}
func (*SearchRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_543a5193e84d47c5, []int{2}
}

func (m *SearchRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_SearchRequest.Unmarshal(m, b)
}
func (m *SearchRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_SearchRequest.Marshal(b, m, deterministic)
}
func (m *SearchRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_SearchRequest.Merge(m, src)
}
func (m *SearchRequest) XXX_Size() int {
	return xxx_messageInfo_SearchRequest.Size(m)
}
func (m *SearchRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_SearchRequest.DiscardUnknown(m)
}

var xxx_messageInfo_SearchRequest proto.InternalMessageInfo

func (m *SearchRequest) GetFaceSetId() string {
	if m != nil {
		return m.FaceSetId
	}
	return ""
}

func (m *SearchRequest) GetFaceImg() []byte {
	if m != nil {
		return m.FaceImg
	}
	return nil
}

type SearchResponse struct {
	// 搜索结果信任值 [0, 1.0]
	Confidence float32 `protobuf:"fixed32,1,opt,name=confidence,proto3" json:"confidence,omitempty"`
	// 搜索结果FaceDetail.token
	FaceToken            string   `protobuf:"bytes,2,opt,name=face_token,json=faceToken,proto3" json:"face_token,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *SearchResponse) Reset()         { *m = SearchResponse{} }
func (m *SearchResponse) String() string { return proto.CompactTextString(m) }
func (*SearchResponse) ProtoMessage()    {}
func (*SearchResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_543a5193e84d47c5, []int{3}
}

func (m *SearchResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_SearchResponse.Unmarshal(m, b)
}
func (m *SearchResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_SearchResponse.Marshal(b, m, deterministic)
}
func (m *SearchResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_SearchResponse.Merge(m, src)
}
func (m *SearchResponse) XXX_Size() int {
	return xxx_messageInfo_SearchResponse.Size(m)
}
func (m *SearchResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_SearchResponse.DiscardUnknown(m)
}

var xxx_messageInfo_SearchResponse proto.InternalMessageInfo

func (m *SearchResponse) GetConfidence() float32 {
	if m != nil {
		return m.Confidence
	}
	return 0
}

func (m *SearchResponse) GetFaceToken() string {
	if m != nil {
		return m.FaceToken
	}
	return ""
}

func init() {
	proto.RegisterType((*CompareRequest)(nil), "faceRecognition.CompareRequest")
	proto.RegisterType((*CompareResponse)(nil), "faceRecognition.CompareResponse")
	proto.RegisterType((*SearchRequest)(nil), "faceRecognition.SearchRequest")
	proto.RegisterType((*SearchResponse)(nil), "faceRecognition.SearchResponse")
}

func init() { proto.RegisterFile("face.proto", fileDescriptor_543a5193e84d47c5) }

var fileDescriptor_543a5193e84d47c5 = []byte{
	// 322 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x8c, 0x92, 0xbf, 0x4e, 0xf3, 0x30,
	0x14, 0xc5, 0x95, 0x0e, 0xfd, 0x73, 0xfb, 0x7d, 0xad, 0x64, 0x18, 0xda, 0x02, 0x69, 0xe5, 0x09,
	0x75, 0x68, 0xd4, 0xb0, 0x75, 0x45, 0x42, 0x6a, 0x17, 0xa4, 0x94, 0x3d, 0x32, 0xce, 0x6d, 0xb0,
	0x20, 0x76, 0x88, 0x4d, 0x1f, 0x80, 0x57, 0xe0, 0xd1, 0x78, 0x05, 0x24, 0x5e, 0x03, 0xd9, 0x49,
	0x50, 0x03, 0xaa, 0xc4, 0x16, 0x9d, 0x7b, 0x7c, 0x7e, 0xbe, 0x27, 0x06, 0xd8, 0x31, 0x8e, 0x8b,
	0xbc, 0x50, 0x46, 0x91, 0xa1, 0xfd, 0x8e, 0x90, 0xab, 0x54, 0x0a, 0x23, 0x94, 0x9c, 0x9c, 0xa7,
	0x4a, 0xa5, 0x4f, 0x18, 0xb0, 0x5c, 0x04, 0x4c, 0x4a, 0x65, 0x98, 0x95, 0x75, 0x69, 0xa7, 0x1b,
	0x18, 0x5c, 0xab, 0x2c, 0x67, 0x05, 0x46, 0xf8, 0xfc, 0x82, 0xda, 0x90, 0x33, 0xe8, 0xd9, 0x88,
	0x58, 0x64, 0xe9, 0x72, 0xe4, 0xcd, 0xbc, 0xcb, 0x7f, 0x51, 0xd7, 0x0a, 0xeb, 0x2c, 0x5d, 0x1e,
	0x0e, 0xc3, 0x51, 0xab, 0x31, 0x0c, 0xe9, 0x12, 0x86, 0xdf, 0x59, 0x3a, 0x57, 0x52, 0x23, 0xf1,
	0x01, 0xb8, 0x92, 0x3b, 0x91, 0xa0, 0xe4, 0xe8, 0xd2, 0x5a, 0xd1, 0x81, 0x42, 0x37, 0xf0, 0x7f,
	0x8b, 0xac, 0xe0, 0x0f, 0x35, 0xdd, 0x87, 0xbe, 0x03, 0x68, 0x34, 0xb1, 0x48, 0xdc, 0x89, 0x5e,
	0xe4, 0x98, 0x5b, 0x34, 0xeb, 0x84, 0x8c, 0xa1, 0x5b, 0x5f, 0xa0, 0xe2, 0x77, 0x2a, 0x3e, 0xbd,
	0x85, 0x41, 0x9d, 0xf5, 0x37, 0x3a, 0xb9, 0x28, 0x9b, 0x8b, 0x8d, 0x7a, 0x44, 0xe9, 0xe2, 0x2a,
	0xd6, 0x9d, 0x15, 0xc2, 0x4f, 0x0f, 0xfa, 0x37, 0x8e, 0x5c, 0xec, 0x05, 0x47, 0x92, 0x41, 0xa7,
	0xda, 0x8f, 0x4c, 0x17, 0x3f, 0x6a, 0x5e, 0x34, 0x5b, 0x9c, 0xcc, 0x8e, 0x1b, 0xca, 0xcb, 0xd1,
	0xe9, 0xeb, 0xfb, 0xc7, 0x5b, 0x6b, 0x4c, 0x4f, 0xdd, 0x9f, 0xd9, 0x87, 0x81, 0x3d, 0x10, 0xf0,
	0xd2, 0xb5, 0xf2, 0xe6, 0x44, 0x40, 0xbb, 0xdc, 0x87, 0xf8, 0xbf, 0xc2, 0x1a, 0xa5, 0x4d, 0xa6,
	0x47, 0xe7, 0x15, 0xcb, 0x77, 0xac, 0x11, 0x3d, 0x69, 0xb0, 0xb4, 0x33, 0xad, 0xbc, 0xf9, 0x7d,
	0xdb, 0x3d, 0x86, 0xab, 0xaf, 0x00, 0x00, 0x00, 0xff, 0xff, 0x4d, 0xb6, 0x60, 0xf8, 0x49, 0x02,
	0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// FaceServiceClient is the client API for FaceService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type FaceServiceClient interface {
	// Compare方法实现了两张人脸图片对比识别，返回两图片的对比可信度
	Compare(ctx context.Context, in *CompareRequest, opts ...grpc.CallOption) (*CompareResponse, error)
	// Search方法实现搜索FaceSet中近似人脸数据，
	// 若存在匹配数据时返回一个FaceDetail及其confidence
	Search(ctx context.Context, in *SearchRequest, opts ...grpc.CallOption) (*SearchResponse, error)
}

type faceServiceClient struct {
	cc *grpc.ClientConn
}

func NewFaceServiceClient(cc *grpc.ClientConn) FaceServiceClient {
	return &faceServiceClient{cc}
}

func (c *faceServiceClient) Compare(ctx context.Context, in *CompareRequest, opts ...grpc.CallOption) (*CompareResponse, error) {
	out := new(CompareResponse)
	err := c.cc.Invoke(ctx, "/faceRecognition.FaceService/Compare", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *faceServiceClient) Search(ctx context.Context, in *SearchRequest, opts ...grpc.CallOption) (*SearchResponse, error) {
	out := new(SearchResponse)
	err := c.cc.Invoke(ctx, "/faceRecognition.FaceService/Search", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// FaceServiceServer is the server API for FaceService service.
type FaceServiceServer interface {
	// Compare方法实现了两张人脸图片对比识别，返回两图片的对比可信度
	Compare(context.Context, *CompareRequest) (*CompareResponse, error)
	// Search方法实现搜索FaceSet中近似人脸数据，
	// 若存在匹配数据时返回一个FaceDetail及其confidence
	Search(context.Context, *SearchRequest) (*SearchResponse, error)
}

// UnimplementedFaceServiceServer can be embedded to have forward compatible implementations.
type UnimplementedFaceServiceServer struct {
}

func (*UnimplementedFaceServiceServer) Compare(ctx context.Context, req *CompareRequest) (*CompareResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Compare not implemented")
}
func (*UnimplementedFaceServiceServer) Search(ctx context.Context, req *SearchRequest) (*SearchResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Search not implemented")
}

func RegisterFaceServiceServer(s *grpc.Server, srv FaceServiceServer) {
	s.RegisterService(&_FaceService_serviceDesc, srv)
}

func _FaceService_Compare_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CompareRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FaceServiceServer).Compare(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/faceRecognition.FaceService/Compare",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FaceServiceServer).Compare(ctx, req.(*CompareRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FaceService_Search_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(SearchRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FaceServiceServer).Search(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/faceRecognition.FaceService/Search",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FaceServiceServer).Search(ctx, req.(*SearchRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _FaceService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "faceRecognition.FaceService",
	HandlerType: (*FaceServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Compare",
			Handler:    _FaceService_Compare_Handler,
		},
		{
			MethodName: "Search",
			Handler:    _FaceService_Search_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "face.proto",
}
