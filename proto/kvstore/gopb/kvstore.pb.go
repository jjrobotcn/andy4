// Code generated by protoc-gen-go. DO NOT EDIT.
// source: kvstore.proto

package kvstore

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

type PutRequest struct {
	Key                  []byte   `protobuf:"bytes,1,opt,name=key,proto3" json:"key,omitempty"`
	Value                []byte   `protobuf:"bytes,2,opt,name=value,proto3" json:"value,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *PutRequest) Reset()         { *m = PutRequest{} }
func (m *PutRequest) String() string { return proto.CompactTextString(m) }
func (*PutRequest) ProtoMessage()    {}
func (*PutRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_088d7f6aff848d9e, []int{0}
}

func (m *PutRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_PutRequest.Unmarshal(m, b)
}
func (m *PutRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_PutRequest.Marshal(b, m, deterministic)
}
func (m *PutRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_PutRequest.Merge(m, src)
}
func (m *PutRequest) XXX_Size() int {
	return xxx_messageInfo_PutRequest.Size(m)
}
func (m *PutRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_PutRequest.DiscardUnknown(m)
}

var xxx_messageInfo_PutRequest proto.InternalMessageInfo

func (m *PutRequest) GetKey() []byte {
	if m != nil {
		return m.Key
	}
	return nil
}

func (m *PutRequest) GetValue() []byte {
	if m != nil {
		return m.Value
	}
	return nil
}

type PutResponse struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *PutResponse) Reset()         { *m = PutResponse{} }
func (m *PutResponse) String() string { return proto.CompactTextString(m) }
func (*PutResponse) ProtoMessage()    {}
func (*PutResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_088d7f6aff848d9e, []int{1}
}

func (m *PutResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_PutResponse.Unmarshal(m, b)
}
func (m *PutResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_PutResponse.Marshal(b, m, deterministic)
}
func (m *PutResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_PutResponse.Merge(m, src)
}
func (m *PutResponse) XXX_Size() int {
	return xxx_messageInfo_PutResponse.Size(m)
}
func (m *PutResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_PutResponse.DiscardUnknown(m)
}

var xxx_messageInfo_PutResponse proto.InternalMessageInfo

type GetRequest struct {
	Key                  []byte   `protobuf:"bytes,1,opt,name=key,proto3" json:"key,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetRequest) Reset()         { *m = GetRequest{} }
func (m *GetRequest) String() string { return proto.CompactTextString(m) }
func (*GetRequest) ProtoMessage()    {}
func (*GetRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_088d7f6aff848d9e, []int{2}
}

func (m *GetRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetRequest.Unmarshal(m, b)
}
func (m *GetRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetRequest.Marshal(b, m, deterministic)
}
func (m *GetRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetRequest.Merge(m, src)
}
func (m *GetRequest) XXX_Size() int {
	return xxx_messageInfo_GetRequest.Size(m)
}
func (m *GetRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_GetRequest.DiscardUnknown(m)
}

var xxx_messageInfo_GetRequest proto.InternalMessageInfo

func (m *GetRequest) GetKey() []byte {
	if m != nil {
		return m.Key
	}
	return nil
}

type GetResponse struct {
	Value                []byte   `protobuf:"bytes,1,opt,name=value,proto3" json:"value,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetResponse) Reset()         { *m = GetResponse{} }
func (m *GetResponse) String() string { return proto.CompactTextString(m) }
func (*GetResponse) ProtoMessage()    {}
func (*GetResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_088d7f6aff848d9e, []int{3}
}

func (m *GetResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetResponse.Unmarshal(m, b)
}
func (m *GetResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetResponse.Marshal(b, m, deterministic)
}
func (m *GetResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetResponse.Merge(m, src)
}
func (m *GetResponse) XXX_Size() int {
	return xxx_messageInfo_GetResponse.Size(m)
}
func (m *GetResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_GetResponse.DiscardUnknown(m)
}

var xxx_messageInfo_GetResponse proto.InternalMessageInfo

func (m *GetResponse) GetValue() []byte {
	if m != nil {
		return m.Value
	}
	return nil
}

type GetPrefixRequest struct {
	// keys: [not_match, match_1, match_2, match.3, match@4]
	// match: [match_1, match_2, match.3, match@4]
	// match_: [match_1,, match_2]
	// match@: [match@3]
	// match!: []
	KeyPrefix            []byte   `protobuf:"bytes,1,opt,name=key_prefix,json=keyPrefix,proto3" json:"key_prefix,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetPrefixRequest) Reset()         { *m = GetPrefixRequest{} }
func (m *GetPrefixRequest) String() string { return proto.CompactTextString(m) }
func (*GetPrefixRequest) ProtoMessage()    {}
func (*GetPrefixRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_088d7f6aff848d9e, []int{4}
}

func (m *GetPrefixRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetPrefixRequest.Unmarshal(m, b)
}
func (m *GetPrefixRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetPrefixRequest.Marshal(b, m, deterministic)
}
func (m *GetPrefixRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetPrefixRequest.Merge(m, src)
}
func (m *GetPrefixRequest) XXX_Size() int {
	return xxx_messageInfo_GetPrefixRequest.Size(m)
}
func (m *GetPrefixRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_GetPrefixRequest.DiscardUnknown(m)
}

var xxx_messageInfo_GetPrefixRequest proto.InternalMessageInfo

func (m *GetPrefixRequest) GetKeyPrefix() []byte {
	if m != nil {
		return m.KeyPrefix
	}
	return nil
}

type GetPrefixResponse struct {
	Matches              []*GetPrefixResponse_Match `protobuf:"bytes,1,rep,name=matches,proto3" json:"matches,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                   `json:"-"`
	XXX_unrecognized     []byte                     `json:"-"`
	XXX_sizecache        int32                      `json:"-"`
}

func (m *GetPrefixResponse) Reset()         { *m = GetPrefixResponse{} }
func (m *GetPrefixResponse) String() string { return proto.CompactTextString(m) }
func (*GetPrefixResponse) ProtoMessage()    {}
func (*GetPrefixResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_088d7f6aff848d9e, []int{5}
}

func (m *GetPrefixResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetPrefixResponse.Unmarshal(m, b)
}
func (m *GetPrefixResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetPrefixResponse.Marshal(b, m, deterministic)
}
func (m *GetPrefixResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetPrefixResponse.Merge(m, src)
}
func (m *GetPrefixResponse) XXX_Size() int {
	return xxx_messageInfo_GetPrefixResponse.Size(m)
}
func (m *GetPrefixResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_GetPrefixResponse.DiscardUnknown(m)
}

var xxx_messageInfo_GetPrefixResponse proto.InternalMessageInfo

func (m *GetPrefixResponse) GetMatches() []*GetPrefixResponse_Match {
	if m != nil {
		return m.Matches
	}
	return nil
}

type GetPrefixResponse_Match struct {
	Key                  []byte   `protobuf:"bytes,1,opt,name=key,proto3" json:"key,omitempty"`
	Value                []byte   `protobuf:"bytes,2,opt,name=value,proto3" json:"value,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetPrefixResponse_Match) Reset()         { *m = GetPrefixResponse_Match{} }
func (m *GetPrefixResponse_Match) String() string { return proto.CompactTextString(m) }
func (*GetPrefixResponse_Match) ProtoMessage()    {}
func (*GetPrefixResponse_Match) Descriptor() ([]byte, []int) {
	return fileDescriptor_088d7f6aff848d9e, []int{5, 0}
}

func (m *GetPrefixResponse_Match) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetPrefixResponse_Match.Unmarshal(m, b)
}
func (m *GetPrefixResponse_Match) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetPrefixResponse_Match.Marshal(b, m, deterministic)
}
func (m *GetPrefixResponse_Match) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetPrefixResponse_Match.Merge(m, src)
}
func (m *GetPrefixResponse_Match) XXX_Size() int {
	return xxx_messageInfo_GetPrefixResponse_Match.Size(m)
}
func (m *GetPrefixResponse_Match) XXX_DiscardUnknown() {
	xxx_messageInfo_GetPrefixResponse_Match.DiscardUnknown(m)
}

var xxx_messageInfo_GetPrefixResponse_Match proto.InternalMessageInfo

func (m *GetPrefixResponse_Match) GetKey() []byte {
	if m != nil {
		return m.Key
	}
	return nil
}

func (m *GetPrefixResponse_Match) GetValue() []byte {
	if m != nil {
		return m.Value
	}
	return nil
}

type GetPrefixStreamRequest struct {
	// keys: [not_match, match_1, match_2, match.3, match@4]
	// match: [match_1, match_2, match.3, match@4]
	// match_: [match_1,, match_2]
	// match@: [match@3]
	// match!: []
	KeyPrefix            []byte   `protobuf:"bytes,1,opt,name=key_prefix,json=keyPrefix,proto3" json:"key_prefix,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetPrefixStreamRequest) Reset()         { *m = GetPrefixStreamRequest{} }
func (m *GetPrefixStreamRequest) String() string { return proto.CompactTextString(m) }
func (*GetPrefixStreamRequest) ProtoMessage()    {}
func (*GetPrefixStreamRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_088d7f6aff848d9e, []int{6}
}

func (m *GetPrefixStreamRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetPrefixStreamRequest.Unmarshal(m, b)
}
func (m *GetPrefixStreamRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetPrefixStreamRequest.Marshal(b, m, deterministic)
}
func (m *GetPrefixStreamRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetPrefixStreamRequest.Merge(m, src)
}
func (m *GetPrefixStreamRequest) XXX_Size() int {
	return xxx_messageInfo_GetPrefixStreamRequest.Size(m)
}
func (m *GetPrefixStreamRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_GetPrefixStreamRequest.DiscardUnknown(m)
}

var xxx_messageInfo_GetPrefixStreamRequest proto.InternalMessageInfo

func (m *GetPrefixStreamRequest) GetKeyPrefix() []byte {
	if m != nil {
		return m.KeyPrefix
	}
	return nil
}

type GetPrefixStreamResponse struct {
	Key                  []byte   `protobuf:"bytes,1,opt,name=key,proto3" json:"key,omitempty"`
	Value                []byte   `protobuf:"bytes,2,opt,name=value,proto3" json:"value,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetPrefixStreamResponse) Reset()         { *m = GetPrefixStreamResponse{} }
func (m *GetPrefixStreamResponse) String() string { return proto.CompactTextString(m) }
func (*GetPrefixStreamResponse) ProtoMessage()    {}
func (*GetPrefixStreamResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_088d7f6aff848d9e, []int{7}
}

func (m *GetPrefixStreamResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetPrefixStreamResponse.Unmarshal(m, b)
}
func (m *GetPrefixStreamResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetPrefixStreamResponse.Marshal(b, m, deterministic)
}
func (m *GetPrefixStreamResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetPrefixStreamResponse.Merge(m, src)
}
func (m *GetPrefixStreamResponse) XXX_Size() int {
	return xxx_messageInfo_GetPrefixStreamResponse.Size(m)
}
func (m *GetPrefixStreamResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_GetPrefixStreamResponse.DiscardUnknown(m)
}

var xxx_messageInfo_GetPrefixStreamResponse proto.InternalMessageInfo

func (m *GetPrefixStreamResponse) GetKey() []byte {
	if m != nil {
		return m.Key
	}
	return nil
}

func (m *GetPrefixStreamResponse) GetValue() []byte {
	if m != nil {
		return m.Value
	}
	return nil
}

type DeleteRequest struct {
	Key                  []byte   `protobuf:"bytes,1,opt,name=key,proto3" json:"key,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *DeleteRequest) Reset()         { *m = DeleteRequest{} }
func (m *DeleteRequest) String() string { return proto.CompactTextString(m) }
func (*DeleteRequest) ProtoMessage()    {}
func (*DeleteRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_088d7f6aff848d9e, []int{8}
}

func (m *DeleteRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_DeleteRequest.Unmarshal(m, b)
}
func (m *DeleteRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_DeleteRequest.Marshal(b, m, deterministic)
}
func (m *DeleteRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_DeleteRequest.Merge(m, src)
}
func (m *DeleteRequest) XXX_Size() int {
	return xxx_messageInfo_DeleteRequest.Size(m)
}
func (m *DeleteRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_DeleteRequest.DiscardUnknown(m)
}

var xxx_messageInfo_DeleteRequest proto.InternalMessageInfo

func (m *DeleteRequest) GetKey() []byte {
	if m != nil {
		return m.Key
	}
	return nil
}

type DeleteResponse struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *DeleteResponse) Reset()         { *m = DeleteResponse{} }
func (m *DeleteResponse) String() string { return proto.CompactTextString(m) }
func (*DeleteResponse) ProtoMessage()    {}
func (*DeleteResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_088d7f6aff848d9e, []int{9}
}

func (m *DeleteResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_DeleteResponse.Unmarshal(m, b)
}
func (m *DeleteResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_DeleteResponse.Marshal(b, m, deterministic)
}
func (m *DeleteResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_DeleteResponse.Merge(m, src)
}
func (m *DeleteResponse) XXX_Size() int {
	return xxx_messageInfo_DeleteResponse.Size(m)
}
func (m *DeleteResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_DeleteResponse.DiscardUnknown(m)
}

var xxx_messageInfo_DeleteResponse proto.InternalMessageInfo

func init() {
	proto.RegisterType((*PutRequest)(nil), "kvstore.PutRequest")
	proto.RegisterType((*PutResponse)(nil), "kvstore.PutResponse")
	proto.RegisterType((*GetRequest)(nil), "kvstore.GetRequest")
	proto.RegisterType((*GetResponse)(nil), "kvstore.GetResponse")
	proto.RegisterType((*GetPrefixRequest)(nil), "kvstore.GetPrefixRequest")
	proto.RegisterType((*GetPrefixResponse)(nil), "kvstore.GetPrefixResponse")
	proto.RegisterType((*GetPrefixResponse_Match)(nil), "kvstore.GetPrefixResponse.Match")
	proto.RegisterType((*GetPrefixStreamRequest)(nil), "kvstore.GetPrefixStreamRequest")
	proto.RegisterType((*GetPrefixStreamResponse)(nil), "kvstore.GetPrefixStreamResponse")
	proto.RegisterType((*DeleteRequest)(nil), "kvstore.DeleteRequest")
	proto.RegisterType((*DeleteResponse)(nil), "kvstore.DeleteResponse")
}

func init() { proto.RegisterFile("kvstore.proto", fileDescriptor_088d7f6aff848d9e) }

var fileDescriptor_088d7f6aff848d9e = []byte{
	// 471 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x8c, 0x94, 0xc1, 0x6e, 0xd3, 0x40,
	0x10, 0x86, 0xb5, 0x0d, 0x6d, 0xd4, 0x09, 0x81, 0x74, 0x53, 0x52, 0x63, 0x0a, 0x38, 0xdb, 0x4b,
	0xe9, 0x21, 0x86, 0x00, 0x42, 0x8a, 0xc4, 0x81, 0x16, 0x29, 0x07, 0x84, 0xb0, 0x52, 0x89, 0x03,
	0x42, 0xaa, 0x0c, 0x0c, 0x26, 0xb2, 0xeb, 0x35, 0xde, 0x75, 0x44, 0x6e, 0xc0, 0x85, 0x07, 0xe0,
	0x45, 0x78, 0x17, 0x5e, 0x81, 0x07, 0x41, 0x5e, 0xaf, 0x1d, 0x27, 0x8e, 0xab, 0xdc, 0xe2, 0xf1,
	0x3f, 0xdf, 0x3f, 0x99, 0xf9, 0x65, 0x68, 0xfb, 0x33, 0x21, 0x79, 0x8c, 0x83, 0x28, 0xe6, 0x92,
	0xd3, 0xa6, 0x7e, 0x34, 0x0f, 0x3d, 0xce, 0xbd, 0x00, 0x6d, 0x37, 0x9a, 0xda, 0x6e, 0x18, 0x72,
	0xe9, 0xca, 0x29, 0x0f, 0x45, 0x26, 0x63, 0x4f, 0x00, 0x9c, 0x44, 0x4e, 0xf0, 0x6b, 0x82, 0x42,
	0xd2, 0x0e, 0x34, 0x7c, 0x9c, 0x1b, 0xc4, 0x22, 0xc7, 0xd7, 0x27, 0xe9, 0x4f, 0xba, 0x0f, 0xdb,
	0x33, 0x37, 0x48, 0xd0, 0xd8, 0x52, 0xb5, 0xec, 0x81, 0xb5, 0xa1, 0xa5, 0xba, 0x44, 0xc4, 0x43,
	0x81, 0xec, 0x1e, 0xc0, 0x18, 0xeb, 0x21, 0xec, 0x08, 0x5a, 0xea, 0x7d, 0x26, 0x5f, 0x30, 0x49,
	0x99, 0xf9, 0x08, 0x3a, 0x63, 0x94, 0x4e, 0x8c, 0x9f, 0xa7, 0xdf, 0x72, 0xd4, 0x5d, 0x00, 0x1f,
	0xe7, 0x17, 0x91, 0x2a, 0x6a, 0xf9, 0xae, 0x8f, 0xf3, 0x4c, 0xc5, 0xbe, 0x13, 0xd8, 0x2b, 0xf5,
	0x68, 0xfc, 0x08, 0x9a, 0x97, 0xae, 0xfc, 0xf8, 0x05, 0x85, 0x41, 0xac, 0xc6, 0x71, 0x6b, 0x68,
	0x0d, 0xf2, 0xd5, 0x54, 0xc4, 0x83, 0xd7, 0xa9, 0x72, 0x92, 0x37, 0x98, 0x36, 0x6c, 0xab, 0xca,
	0xc6, 0x9b, 0x78, 0x06, 0xbd, 0x02, 0x7a, 0x2e, 0x63, 0x74, 0x2f, 0x37, 0x9c, 0xfd, 0x05, 0x1c,
	0x54, 0x1a, 0xf5, 0x1f, 0xd8, 0xd4, 0xbb, 0x0f, 0xed, 0x97, 0x18, 0xa0, 0xc4, 0xfa, 0xcd, 0x77,
	0xe0, 0x46, 0x2e, 0xc9, 0xe0, 0xc3, 0x3f, 0xd7, 0xa0, 0xf9, 0xea, 0xed, 0x79, 0xba, 0x0e, 0xea,
	0x40, 0xc3, 0x49, 0x24, 0xed, 0x16, 0xfb, 0x59, 0x44, 0xc1, 0xdc, 0x5f, 0x2e, 0xe6, 0x97, 0xfe,
	0xf9, 0xf7, 0xdf, 0xef, 0x2d, 0x83, 0x75, 0x55, 0x9c, 0x66, 0x43, 0x5b, 0x8b, 0xec, 0x28, 0x91,
	0x23, 0x72, 0x42, 0x3d, 0x68, 0x8c, 0xb1, 0x4c, 0x5c, 0xe4, 0xa2, 0x44, 0x2c, 0x85, 0x81, 0x3d,
	0x55, 0x44, 0xbb, 0x4a, 0xf4, 0x30, 0x25, 0xbe, 0xbb, 0x45, 0xd7, 0xbd, 0xa1, 0xbf, 0x08, 0xec,
	0x16, 0xfb, 0xa3, 0xb7, 0xd7, 0x5d, 0x38, 0x73, 0x35, 0xeb, 0x8f, 0xcf, 0xce, 0x94, 0xf7, 0x73,
	0x66, 0xae, 0x71, 0xd0, 0x87, 0x4b, 0x47, 0x38, 0xa4, 0x57, 0x08, 0xe8, 0x0f, 0x02, 0x37, 0x57,
	0x2e, 0x49, 0xef, 0x57, 0x4d, 0x97, 0xc2, 0x61, 0x5a, 0xf5, 0x02, 0x3d, 0xdb, 0x03, 0x35, 0xdb,
	0x11, 0xed, 0xd7, 0x5b, 0x5f, 0x08, 0xd5, 0xf2, 0x90, 0xd0, 0xf7, 0xb0, 0x93, 0x9d, 0x99, 0xf6,
	0x0a, 0xf0, 0x52, 0x34, 0xcc, 0x83, 0x4a, 0x5d, 0xfb, 0xf4, 0x95, 0xcf, 0x1d, 0xd6, 0x5b, 0xf5,
	0xf9, 0xa4, 0x74, 0x23, 0x72, 0x72, 0xda, 0x3d, 0xdd, 0xd3, 0x89, 0x79, 0x93, 0x48, 0x8c, 0xcf,
	0x02, 0x57, 0x88, 0x0f, 0x3b, 0xea, 0xfb, 0xf1, 0xf8, 0x7f, 0x00, 0x00, 0x00, 0xff, 0xff, 0x28,
	0xbc, 0xa1, 0x33, 0x77, 0x04, 0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// KVStoreClient is the client API for KVStore service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type KVStoreClient interface {
	// Put 创建kv键值对
	// 若key已存在将更新value值
	Put(ctx context.Context, in *PutRequest, opts ...grpc.CallOption) (*PutResponse, error)
	// Get 获取key的value
	// 若key不存在则返回gRPC错误:NotFound
	Get(ctx context.Context, in *GetRequest, opts ...grpc.CallOption) (*GetResponse, error)
	// GetPrefix 获取符合key_prefix的多个kv键值对
	GetPrefix(ctx context.Context, in *GetPrefixRequest, opts ...grpc.CallOption) (*GetPrefixResponse, error)
	// GetPrefixStream gRPC stream方式获取符合key_prefix的多个kv键值对
	GetPrefixStream(ctx context.Context, in *GetPrefixStreamRequest, opts ...grpc.CallOption) (KVStore_GetPrefixStreamClient, error)
	// Delete 删除kv键值对
	Delete(ctx context.Context, in *DeleteRequest, opts ...grpc.CallOption) (*DeleteResponse, error)
}

type kVStoreClient struct {
	cc *grpc.ClientConn
}

func NewKVStoreClient(cc *grpc.ClientConn) KVStoreClient {
	return &kVStoreClient{cc}
}

func (c *kVStoreClient) Put(ctx context.Context, in *PutRequest, opts ...grpc.CallOption) (*PutResponse, error) {
	out := new(PutResponse)
	err := c.cc.Invoke(ctx, "/kvstore.KVStore/Put", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *kVStoreClient) Get(ctx context.Context, in *GetRequest, opts ...grpc.CallOption) (*GetResponse, error) {
	out := new(GetResponse)
	err := c.cc.Invoke(ctx, "/kvstore.KVStore/Get", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *kVStoreClient) GetPrefix(ctx context.Context, in *GetPrefixRequest, opts ...grpc.CallOption) (*GetPrefixResponse, error) {
	out := new(GetPrefixResponse)
	err := c.cc.Invoke(ctx, "/kvstore.KVStore/GetPrefix", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *kVStoreClient) GetPrefixStream(ctx context.Context, in *GetPrefixStreamRequest, opts ...grpc.CallOption) (KVStore_GetPrefixStreamClient, error) {
	stream, err := c.cc.NewStream(ctx, &_KVStore_serviceDesc.Streams[0], "/kvstore.KVStore/GetPrefixStream", opts...)
	if err != nil {
		return nil, err
	}
	x := &kVStoreGetPrefixStreamClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type KVStore_GetPrefixStreamClient interface {
	Recv() (*GetPrefixStreamResponse, error)
	grpc.ClientStream
}

type kVStoreGetPrefixStreamClient struct {
	grpc.ClientStream
}

func (x *kVStoreGetPrefixStreamClient) Recv() (*GetPrefixStreamResponse, error) {
	m := new(GetPrefixStreamResponse)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *kVStoreClient) Delete(ctx context.Context, in *DeleteRequest, opts ...grpc.CallOption) (*DeleteResponse, error) {
	out := new(DeleteResponse)
	err := c.cc.Invoke(ctx, "/kvstore.KVStore/Delete", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// KVStoreServer is the server API for KVStore service.
type KVStoreServer interface {
	// Put 创建kv键值对
	// 若key已存在将更新value值
	Put(context.Context, *PutRequest) (*PutResponse, error)
	// Get 获取key的value
	// 若key不存在则返回gRPC错误:NotFound
	Get(context.Context, *GetRequest) (*GetResponse, error)
	// GetPrefix 获取符合key_prefix的多个kv键值对
	GetPrefix(context.Context, *GetPrefixRequest) (*GetPrefixResponse, error)
	// GetPrefixStream gRPC stream方式获取符合key_prefix的多个kv键值对
	GetPrefixStream(*GetPrefixStreamRequest, KVStore_GetPrefixStreamServer) error
	// Delete 删除kv键值对
	Delete(context.Context, *DeleteRequest) (*DeleteResponse, error)
}

// UnimplementedKVStoreServer can be embedded to have forward compatible implementations.
type UnimplementedKVStoreServer struct {
}

func (*UnimplementedKVStoreServer) Put(ctx context.Context, req *PutRequest) (*PutResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Put not implemented")
}
func (*UnimplementedKVStoreServer) Get(ctx context.Context, req *GetRequest) (*GetResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Get not implemented")
}
func (*UnimplementedKVStoreServer) GetPrefix(ctx context.Context, req *GetPrefixRequest) (*GetPrefixResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetPrefix not implemented")
}
func (*UnimplementedKVStoreServer) GetPrefixStream(req *GetPrefixStreamRequest, srv KVStore_GetPrefixStreamServer) error {
	return status.Errorf(codes.Unimplemented, "method GetPrefixStream not implemented")
}
func (*UnimplementedKVStoreServer) Delete(ctx context.Context, req *DeleteRequest) (*DeleteResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Delete not implemented")
}

func RegisterKVStoreServer(s *grpc.Server, srv KVStoreServer) {
	s.RegisterService(&_KVStore_serviceDesc, srv)
}

func _KVStore_Put_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(PutRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(KVStoreServer).Put(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/kvstore.KVStore/Put",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(KVStoreServer).Put(ctx, req.(*PutRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _KVStore_Get_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(KVStoreServer).Get(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/kvstore.KVStore/Get",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(KVStoreServer).Get(ctx, req.(*GetRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _KVStore_GetPrefix_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetPrefixRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(KVStoreServer).GetPrefix(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/kvstore.KVStore/GetPrefix",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(KVStoreServer).GetPrefix(ctx, req.(*GetPrefixRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _KVStore_GetPrefixStream_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(GetPrefixStreamRequest)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(KVStoreServer).GetPrefixStream(m, &kVStoreGetPrefixStreamServer{stream})
}

type KVStore_GetPrefixStreamServer interface {
	Send(*GetPrefixStreamResponse) error
	grpc.ServerStream
}

type kVStoreGetPrefixStreamServer struct {
	grpc.ServerStream
}

func (x *kVStoreGetPrefixStreamServer) Send(m *GetPrefixStreamResponse) error {
	return x.ServerStream.SendMsg(m)
}

func _KVStore_Delete_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(KVStoreServer).Delete(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/kvstore.KVStore/Delete",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(KVStoreServer).Delete(ctx, req.(*DeleteRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _KVStore_serviceDesc = grpc.ServiceDesc{
	ServiceName: "kvstore.KVStore",
	HandlerType: (*KVStoreServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Put",
			Handler:    _KVStore_Put_Handler,
		},
		{
			MethodName: "Get",
			Handler:    _KVStore_Get_Handler,
		},
		{
			MethodName: "GetPrefix",
			Handler:    _KVStore_GetPrefix_Handler,
		},
		{
			MethodName: "Delete",
			Handler:    _KVStore_Delete_Handler,
		},
	},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "GetPrefixStream",
			Handler:       _KVStore_GetPrefixStream_Handler,
			ServerStreams: true,
		},
	},
	Metadata: "kvstore.proto",
}
