// Code generated by protoc-gen-go. DO NOT EDIT.
// source: group.proto

package handsmotion

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

type MotionMeta struct {
	Id                   string   `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Name                 string   `protobuf:"bytes,2,opt,name=name,proto3" json:"name,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *MotionMeta) Reset()         { *m = MotionMeta{} }
func (m *MotionMeta) String() string { return proto.CompactTextString(m) }
func (*MotionMeta) ProtoMessage()    {}
func (*MotionMeta) Descriptor() ([]byte, []int) {
	return fileDescriptor_e10f4c9b19ad8eee, []int{0}
}

func (m *MotionMeta) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_MotionMeta.Unmarshal(m, b)
}
func (m *MotionMeta) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_MotionMeta.Marshal(b, m, deterministic)
}
func (m *MotionMeta) XXX_Merge(src proto.Message) {
	xxx_messageInfo_MotionMeta.Merge(m, src)
}
func (m *MotionMeta) XXX_Size() int {
	return xxx_messageInfo_MotionMeta.Size(m)
}
func (m *MotionMeta) XXX_DiscardUnknown() {
	xxx_messageInfo_MotionMeta.DiscardUnknown(m)
}

var xxx_messageInfo_MotionMeta proto.InternalMessageInfo

func (m *MotionMeta) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *MotionMeta) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

type NewMotionGroupRequest struct {
	Name                 string   `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *NewMotionGroupRequest) Reset()         { *m = NewMotionGroupRequest{} }
func (m *NewMotionGroupRequest) String() string { return proto.CompactTextString(m) }
func (*NewMotionGroupRequest) ProtoMessage()    {}
func (*NewMotionGroupRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_e10f4c9b19ad8eee, []int{1}
}

func (m *NewMotionGroupRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_NewMotionGroupRequest.Unmarshal(m, b)
}
func (m *NewMotionGroupRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_NewMotionGroupRequest.Marshal(b, m, deterministic)
}
func (m *NewMotionGroupRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_NewMotionGroupRequest.Merge(m, src)
}
func (m *NewMotionGroupRequest) XXX_Size() int {
	return xxx_messageInfo_NewMotionGroupRequest.Size(m)
}
func (m *NewMotionGroupRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_NewMotionGroupRequest.DiscardUnknown(m)
}

var xxx_messageInfo_NewMotionGroupRequest proto.InternalMessageInfo

func (m *NewMotionGroupRequest) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

type NewMotionGroupResponse struct {
	Motion               *MotionMeta `protobuf:"bytes,1,opt,name=motion,proto3" json:"motion,omitempty"`
	XXX_NoUnkeyedLiteral struct{}    `json:"-"`
	XXX_unrecognized     []byte      `json:"-"`
	XXX_sizecache        int32       `json:"-"`
}

func (m *NewMotionGroupResponse) Reset()         { *m = NewMotionGroupResponse{} }
func (m *NewMotionGroupResponse) String() string { return proto.CompactTextString(m) }
func (*NewMotionGroupResponse) ProtoMessage()    {}
func (*NewMotionGroupResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_e10f4c9b19ad8eee, []int{2}
}

func (m *NewMotionGroupResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_NewMotionGroupResponse.Unmarshal(m, b)
}
func (m *NewMotionGroupResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_NewMotionGroupResponse.Marshal(b, m, deterministic)
}
func (m *NewMotionGroupResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_NewMotionGroupResponse.Merge(m, src)
}
func (m *NewMotionGroupResponse) XXX_Size() int {
	return xxx_messageInfo_NewMotionGroupResponse.Size(m)
}
func (m *NewMotionGroupResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_NewMotionGroupResponse.DiscardUnknown(m)
}

var xxx_messageInfo_NewMotionGroupResponse proto.InternalMessageInfo

func (m *NewMotionGroupResponse) GetMotion() *MotionMeta {
	if m != nil {
		return m.Motion
	}
	return nil
}

type ListMotionGroupsRequest struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *ListMotionGroupsRequest) Reset()         { *m = ListMotionGroupsRequest{} }
func (m *ListMotionGroupsRequest) String() string { return proto.CompactTextString(m) }
func (*ListMotionGroupsRequest) ProtoMessage()    {}
func (*ListMotionGroupsRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_e10f4c9b19ad8eee, []int{3}
}

func (m *ListMotionGroupsRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ListMotionGroupsRequest.Unmarshal(m, b)
}
func (m *ListMotionGroupsRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ListMotionGroupsRequest.Marshal(b, m, deterministic)
}
func (m *ListMotionGroupsRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ListMotionGroupsRequest.Merge(m, src)
}
func (m *ListMotionGroupsRequest) XXX_Size() int {
	return xxx_messageInfo_ListMotionGroupsRequest.Size(m)
}
func (m *ListMotionGroupsRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_ListMotionGroupsRequest.DiscardUnknown(m)
}

var xxx_messageInfo_ListMotionGroupsRequest proto.InternalMessageInfo

type ListMotionGroupsResponse struct {
	Motions              []*MotionMeta `protobuf:"bytes,1,rep,name=motions,proto3" json:"motions,omitempty"`
	XXX_NoUnkeyedLiteral struct{}      `json:"-"`
	XXX_unrecognized     []byte        `json:"-"`
	XXX_sizecache        int32         `json:"-"`
}

func (m *ListMotionGroupsResponse) Reset()         { *m = ListMotionGroupsResponse{} }
func (m *ListMotionGroupsResponse) String() string { return proto.CompactTextString(m) }
func (*ListMotionGroupsResponse) ProtoMessage()    {}
func (*ListMotionGroupsResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_e10f4c9b19ad8eee, []int{4}
}

func (m *ListMotionGroupsResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ListMotionGroupsResponse.Unmarshal(m, b)
}
func (m *ListMotionGroupsResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ListMotionGroupsResponse.Marshal(b, m, deterministic)
}
func (m *ListMotionGroupsResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ListMotionGroupsResponse.Merge(m, src)
}
func (m *ListMotionGroupsResponse) XXX_Size() int {
	return xxx_messageInfo_ListMotionGroupsResponse.Size(m)
}
func (m *ListMotionGroupsResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_ListMotionGroupsResponse.DiscardUnknown(m)
}

var xxx_messageInfo_ListMotionGroupsResponse proto.InternalMessageInfo

func (m *ListMotionGroupsResponse) GetMotions() []*MotionMeta {
	if m != nil {
		return m.Motions
	}
	return nil
}

type DeleteMotionGroupRequest struct {
	Id                   string   `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *DeleteMotionGroupRequest) Reset()         { *m = DeleteMotionGroupRequest{} }
func (m *DeleteMotionGroupRequest) String() string { return proto.CompactTextString(m) }
func (*DeleteMotionGroupRequest) ProtoMessage()    {}
func (*DeleteMotionGroupRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_e10f4c9b19ad8eee, []int{5}
}

func (m *DeleteMotionGroupRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_DeleteMotionGroupRequest.Unmarshal(m, b)
}
func (m *DeleteMotionGroupRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_DeleteMotionGroupRequest.Marshal(b, m, deterministic)
}
func (m *DeleteMotionGroupRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_DeleteMotionGroupRequest.Merge(m, src)
}
func (m *DeleteMotionGroupRequest) XXX_Size() int {
	return xxx_messageInfo_DeleteMotionGroupRequest.Size(m)
}
func (m *DeleteMotionGroupRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_DeleteMotionGroupRequest.DiscardUnknown(m)
}

var xxx_messageInfo_DeleteMotionGroupRequest proto.InternalMessageInfo

func (m *DeleteMotionGroupRequest) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

type DeleteMotionGroupResponse struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *DeleteMotionGroupResponse) Reset()         { *m = DeleteMotionGroupResponse{} }
func (m *DeleteMotionGroupResponse) String() string { return proto.CompactTextString(m) }
func (*DeleteMotionGroupResponse) ProtoMessage()    {}
func (*DeleteMotionGroupResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_e10f4c9b19ad8eee, []int{6}
}

func (m *DeleteMotionGroupResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_DeleteMotionGroupResponse.Unmarshal(m, b)
}
func (m *DeleteMotionGroupResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_DeleteMotionGroupResponse.Marshal(b, m, deterministic)
}
func (m *DeleteMotionGroupResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_DeleteMotionGroupResponse.Merge(m, src)
}
func (m *DeleteMotionGroupResponse) XXX_Size() int {
	return xxx_messageInfo_DeleteMotionGroupResponse.Size(m)
}
func (m *DeleteMotionGroupResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_DeleteMotionGroupResponse.DiscardUnknown(m)
}

var xxx_messageInfo_DeleteMotionGroupResponse proto.InternalMessageInfo

type GetMotionGroupRequest struct {
	Id                   string   `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetMotionGroupRequest) Reset()         { *m = GetMotionGroupRequest{} }
func (m *GetMotionGroupRequest) String() string { return proto.CompactTextString(m) }
func (*GetMotionGroupRequest) ProtoMessage()    {}
func (*GetMotionGroupRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_e10f4c9b19ad8eee, []int{7}
}

func (m *GetMotionGroupRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetMotionGroupRequest.Unmarshal(m, b)
}
func (m *GetMotionGroupRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetMotionGroupRequest.Marshal(b, m, deterministic)
}
func (m *GetMotionGroupRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetMotionGroupRequest.Merge(m, src)
}
func (m *GetMotionGroupRequest) XXX_Size() int {
	return xxx_messageInfo_GetMotionGroupRequest.Size(m)
}
func (m *GetMotionGroupRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_GetMotionGroupRequest.DiscardUnknown(m)
}

var xxx_messageInfo_GetMotionGroupRequest proto.InternalMessageInfo

func (m *GetMotionGroupRequest) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

type GetMotionGroupResponse struct {
	Meta                 *MotionMeta       `protobuf:"bytes,1,opt,name=meta,proto3" json:"meta,omitempty"`
	Scripts              []*MovementScript `protobuf:"bytes,2,rep,name=scripts,proto3" json:"scripts,omitempty"`
	XXX_NoUnkeyedLiteral struct{}          `json:"-"`
	XXX_unrecognized     []byte            `json:"-"`
	XXX_sizecache        int32             `json:"-"`
}

func (m *GetMotionGroupResponse) Reset()         { *m = GetMotionGroupResponse{} }
func (m *GetMotionGroupResponse) String() string { return proto.CompactTextString(m) }
func (*GetMotionGroupResponse) ProtoMessage()    {}
func (*GetMotionGroupResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_e10f4c9b19ad8eee, []int{8}
}

func (m *GetMotionGroupResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetMotionGroupResponse.Unmarshal(m, b)
}
func (m *GetMotionGroupResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetMotionGroupResponse.Marshal(b, m, deterministic)
}
func (m *GetMotionGroupResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetMotionGroupResponse.Merge(m, src)
}
func (m *GetMotionGroupResponse) XXX_Size() int {
	return xxx_messageInfo_GetMotionGroupResponse.Size(m)
}
func (m *GetMotionGroupResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_GetMotionGroupResponse.DiscardUnknown(m)
}

var xxx_messageInfo_GetMotionGroupResponse proto.InternalMessageInfo

func (m *GetMotionGroupResponse) GetMeta() *MotionMeta {
	if m != nil {
		return m.Meta
	}
	return nil
}

func (m *GetMotionGroupResponse) GetScripts() []*MovementScript {
	if m != nil {
		return m.Scripts
	}
	return nil
}

type UpdateMotionMetaRequest struct {
	Motion               *MotionMeta `protobuf:"bytes,2,opt,name=motion,proto3" json:"motion,omitempty"`
	XXX_NoUnkeyedLiteral struct{}    `json:"-"`
	XXX_unrecognized     []byte      `json:"-"`
	XXX_sizecache        int32       `json:"-"`
}

func (m *UpdateMotionMetaRequest) Reset()         { *m = UpdateMotionMetaRequest{} }
func (m *UpdateMotionMetaRequest) String() string { return proto.CompactTextString(m) }
func (*UpdateMotionMetaRequest) ProtoMessage()    {}
func (*UpdateMotionMetaRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_e10f4c9b19ad8eee, []int{9}
}

func (m *UpdateMotionMetaRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_UpdateMotionMetaRequest.Unmarshal(m, b)
}
func (m *UpdateMotionMetaRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_UpdateMotionMetaRequest.Marshal(b, m, deterministic)
}
func (m *UpdateMotionMetaRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_UpdateMotionMetaRequest.Merge(m, src)
}
func (m *UpdateMotionMetaRequest) XXX_Size() int {
	return xxx_messageInfo_UpdateMotionMetaRequest.Size(m)
}
func (m *UpdateMotionMetaRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_UpdateMotionMetaRequest.DiscardUnknown(m)
}

var xxx_messageInfo_UpdateMotionMetaRequest proto.InternalMessageInfo

func (m *UpdateMotionMetaRequest) GetMotion() *MotionMeta {
	if m != nil {
		return m.Motion
	}
	return nil
}

type UpdateMotionMetaResponse struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *UpdateMotionMetaResponse) Reset()         { *m = UpdateMotionMetaResponse{} }
func (m *UpdateMotionMetaResponse) String() string { return proto.CompactTextString(m) }
func (*UpdateMotionMetaResponse) ProtoMessage()    {}
func (*UpdateMotionMetaResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_e10f4c9b19ad8eee, []int{10}
}

func (m *UpdateMotionMetaResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_UpdateMotionMetaResponse.Unmarshal(m, b)
}
func (m *UpdateMotionMetaResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_UpdateMotionMetaResponse.Marshal(b, m, deterministic)
}
func (m *UpdateMotionMetaResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_UpdateMotionMetaResponse.Merge(m, src)
}
func (m *UpdateMotionMetaResponse) XXX_Size() int {
	return xxx_messageInfo_UpdateMotionMetaResponse.Size(m)
}
func (m *UpdateMotionMetaResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_UpdateMotionMetaResponse.DiscardUnknown(m)
}

var xxx_messageInfo_UpdateMotionMetaResponse proto.InternalMessageInfo

type UpdateMotionScriptsRequest struct {
	Id                   string            `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Scripts              []*MovementScript `protobuf:"bytes,2,rep,name=scripts,proto3" json:"scripts,omitempty"`
	XXX_NoUnkeyedLiteral struct{}          `json:"-"`
	XXX_unrecognized     []byte            `json:"-"`
	XXX_sizecache        int32             `json:"-"`
}

func (m *UpdateMotionScriptsRequest) Reset()         { *m = UpdateMotionScriptsRequest{} }
func (m *UpdateMotionScriptsRequest) String() string { return proto.CompactTextString(m) }
func (*UpdateMotionScriptsRequest) ProtoMessage()    {}
func (*UpdateMotionScriptsRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_e10f4c9b19ad8eee, []int{11}
}

func (m *UpdateMotionScriptsRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_UpdateMotionScriptsRequest.Unmarshal(m, b)
}
func (m *UpdateMotionScriptsRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_UpdateMotionScriptsRequest.Marshal(b, m, deterministic)
}
func (m *UpdateMotionScriptsRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_UpdateMotionScriptsRequest.Merge(m, src)
}
func (m *UpdateMotionScriptsRequest) XXX_Size() int {
	return xxx_messageInfo_UpdateMotionScriptsRequest.Size(m)
}
func (m *UpdateMotionScriptsRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_UpdateMotionScriptsRequest.DiscardUnknown(m)
}

var xxx_messageInfo_UpdateMotionScriptsRequest proto.InternalMessageInfo

func (m *UpdateMotionScriptsRequest) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *UpdateMotionScriptsRequest) GetScripts() []*MovementScript {
	if m != nil {
		return m.Scripts
	}
	return nil
}

type UpdateMotionScriptsResponse struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *UpdateMotionScriptsResponse) Reset()         { *m = UpdateMotionScriptsResponse{} }
func (m *UpdateMotionScriptsResponse) String() string { return proto.CompactTextString(m) }
func (*UpdateMotionScriptsResponse) ProtoMessage()    {}
func (*UpdateMotionScriptsResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_e10f4c9b19ad8eee, []int{12}
}

func (m *UpdateMotionScriptsResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_UpdateMotionScriptsResponse.Unmarshal(m, b)
}
func (m *UpdateMotionScriptsResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_UpdateMotionScriptsResponse.Marshal(b, m, deterministic)
}
func (m *UpdateMotionScriptsResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_UpdateMotionScriptsResponse.Merge(m, src)
}
func (m *UpdateMotionScriptsResponse) XXX_Size() int {
	return xxx_messageInfo_UpdateMotionScriptsResponse.Size(m)
}
func (m *UpdateMotionScriptsResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_UpdateMotionScriptsResponse.DiscardUnknown(m)
}

var xxx_messageInfo_UpdateMotionScriptsResponse proto.InternalMessageInfo

func init() {
	proto.RegisterType((*MotionMeta)(nil), "handsmotion.MotionMeta")
	proto.RegisterType((*NewMotionGroupRequest)(nil), "handsmotion.NewMotionGroupRequest")
	proto.RegisterType((*NewMotionGroupResponse)(nil), "handsmotion.NewMotionGroupResponse")
	proto.RegisterType((*ListMotionGroupsRequest)(nil), "handsmotion.ListMotionGroupsRequest")
	proto.RegisterType((*ListMotionGroupsResponse)(nil), "handsmotion.ListMotionGroupsResponse")
	proto.RegisterType((*DeleteMotionGroupRequest)(nil), "handsmotion.DeleteMotionGroupRequest")
	proto.RegisterType((*DeleteMotionGroupResponse)(nil), "handsmotion.DeleteMotionGroupResponse")
	proto.RegisterType((*GetMotionGroupRequest)(nil), "handsmotion.GetMotionGroupRequest")
	proto.RegisterType((*GetMotionGroupResponse)(nil), "handsmotion.GetMotionGroupResponse")
	proto.RegisterType((*UpdateMotionMetaRequest)(nil), "handsmotion.UpdateMotionMetaRequest")
	proto.RegisterType((*UpdateMotionMetaResponse)(nil), "handsmotion.UpdateMotionMetaResponse")
	proto.RegisterType((*UpdateMotionScriptsRequest)(nil), "handsmotion.UpdateMotionScriptsRequest")
	proto.RegisterType((*UpdateMotionScriptsResponse)(nil), "handsmotion.UpdateMotionScriptsResponse")
}

func init() { proto.RegisterFile("group.proto", fileDescriptor_e10f4c9b19ad8eee) }

var fileDescriptor_e10f4c9b19ad8eee = []byte{
	// 599 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x9c, 0x95, 0xcf, 0x6e, 0xd3, 0x40,
	0x10, 0xc6, 0xb5, 0xa6, 0x6a, 0x61, 0x2a, 0x85, 0xb2, 0x52, 0x1a, 0xd7, 0x01, 0xa9, 0x5a, 0xfe,
	0xb4, 0x4a, 0x51, 0xdc, 0x86, 0xa2, 0x8a, 0x08, 0x09, 0x09, 0x21, 0x55, 0x20, 0xc2, 0x21, 0x88,
	0x4b, 0x2f, 0xd1, 0x36, 0x59, 0x19, 0x8b, 0xc4, 0x36, 0xd9, 0x4d, 0x2b, 0x24, 0x4e, 0x3c, 0x02,
	0xdc, 0xb9, 0xf1, 0x00, 0x9c, 0xb8, 0x73, 0xe6, 0xc6, 0x2b, 0xf0, 0x20, 0x28, 0xb3, 0x1b, 0xea,
	0x75, 0x6c, 0xa7, 0xe1, 0x16, 0xed, 0x7e, 0x33, 0xf3, 0x9b, 0xf1, 0x7c, 0x1b, 0x58, 0x0f, 0xc6,
	0xf1, 0x24, 0x69, 0x26, 0xe3, 0x58, 0xc5, 0x74, 0xfd, 0x2d, 0x8f, 0x06, 0x72, 0x14, 0xab, 0x30,
	0x8e, 0xbc, 0x8d, 0x3e, 0x4f, 0xf8, 0x69, 0x38, 0x0c, 0xd5, 0x07, 0x7d, 0xed, 0xdd, 0x0c, 0xe2,
	0x38, 0x18, 0x0a, 0x9f, 0x27, 0xa1, 0xcf, 0xa3, 0x28, 0x56, 0x7c, 0x2a, 0x94, 0xfa, 0x96, 0xed,
	0x03, 0x74, 0x30, 0xb2, 0x23, 0x14, 0xa7, 0x15, 0x70, 0xc2, 0x81, 0x4b, 0xb6, 0xc9, 0xee, 0xb5,
	0xae, 0x13, 0x0e, 0x28, 0x85, 0x95, 0x88, 0x8f, 0x84, 0xeb, 0xe0, 0x09, 0xfe, 0x66, 0x7b, 0x50,
	0x7d, 0x25, 0xce, 0x75, 0xd0, 0xf1, 0x14, 0xa3, 0x2b, 0xde, 0x4f, 0x84, 0x54, 0xff, 0xc4, 0x24,
	0x25, 0x7e, 0x0e, 0x9b, 0x59, 0xb1, 0x4c, 0xe2, 0x48, 0x0a, 0xea, 0xc3, 0xaa, 0x46, 0x46, 0xfd,
	0x7a, 0xab, 0xd6, 0x4c, 0xb5, 0xd1, 0xbc, 0x60, 0xea, 0x1a, 0x19, 0xdb, 0x82, 0xda, 0xcb, 0x50,
	0xaa, 0x54, 0x2e, 0x69, 0x2a, 0xb3, 0x0e, 0xb8, 0xf3, 0x57, 0xa6, 0xce, 0x01, 0xac, 0xe9, 0x04,
	0xd2, 0x25, 0xdb, 0x57, 0xca, 0x0a, 0xcd, 0x74, 0xac, 0x01, 0xee, 0x33, 0x31, 0x14, 0x4a, 0xe4,
	0x34, 0x99, 0x99, 0x10, 0xab, 0xc3, 0x56, 0x8e, 0x56, 0xd7, 0x66, 0x3b, 0x50, 0x3d, 0x16, 0xea,
	0x12, 0x59, 0x3e, 0xc2, 0x66, 0x56, 0x68, 0xf0, 0xf7, 0x60, 0x65, 0x24, 0x14, 0x5f, 0x34, 0x24,
	0x14, 0xd1, 0x87, 0xb0, 0x26, 0xfb, 0xe3, 0x30, 0x51, 0xd2, 0x75, 0xb0, 0xd7, 0x7a, 0x46, 0x7f,
	0x26, 0x46, 0x22, 0x52, 0xaf, 0x51, 0xd3, 0x9d, 0x69, 0xd9, 0x0b, 0xa8, 0xbd, 0x49, 0x06, 0x7c,
	0xd6, 0x03, 0x26, 0x34, 0xa0, 0x17, 0x5f, 0xc9, 0xb9, 0xdc, 0x57, 0xf2, 0xc0, 0x9d, 0xcf, 0x65,
	0xc6, 0xd1, 0x07, 0x2f, 0x7d, 0xa7, 0x31, 0x64, 0xc1, 0x4c, 0xfe, 0xb7, 0x99, 0x5b, 0x50, 0xcf,
	0x2d, 0xa2, 0x19, 0x5a, 0x3f, 0xae, 0xc2, 0x75, 0x9c, 0x70, 0x87, 0x47, 0x3c, 0xc0, 0x0c, 0xf4,
	0x33, 0x81, 0x8a, 0xbd, 0xa5, 0x94, 0x59, 0xb5, 0x72, 0xf7, 0xdd, 0xbb, 0x5d, 0xaa, 0x31, 0x3d,
	0x1f, 0x7d, 0xfa, 0xfd, 0xe7, 0x8b, 0x73, 0xc0, 0xee, 0xa3, 0xff, 0xce, 0x5a, 0xbe, 0x96, 0xfb,
	0x18, 0xea, 0xa3, 0x8d, 0xa5, 0x1f, 0x89, 0xf3, 0x9e, 0x3e, 0xef, 0xe1, 0x49, 0x9b, 0x34, 0xe8,
	0x2f, 0x02, 0x1b, 0xd9, 0xa5, 0xa6, 0x77, 0xac, 0x92, 0x05, 0x76, 0xf0, 0xee, 0x2e, 0x50, 0x19,
	0xb4, 0x77, 0x88, 0x26, 0x58, 0xb3, 0x0c, 0x6d, 0x18, 0x4a, 0x65, 0xb1, 0xc9, 0x36, 0x69, 0x9c,
	0xec, 0xd3, 0x25, 0x83, 0xe8, 0x57, 0x02, 0x37, 0xe6, 0x8c, 0x42, 0x6d, 0xd2, 0x22, 0xd3, 0x79,
	0xf7, 0x16, 0xc9, 0x4c, 0x47, 0x6d, 0xec, 0xe8, 0x90, 0xf9, 0x65, 0x70, 0x03, 0x0c, 0x9f, 0x9b,
	0xf7, 0x4f, 0x02, 0x15, 0xdb, 0x83, 0x99, 0x25, 0xc8, 0x75, 0x72, 0x66, 0x09, 0xf2, 0x4d, 0xcc,
	0x02, 0xe4, 0xe2, 0xe5, 0x4b, 0x10, 0x08, 0x95, 0x85, 0x3a, 0x69, 0xd2, 0xa5, 0x42, 0xe8, 0x37,
	0x02, 0xd5, 0xf4, 0xf6, 0xeb, 0x4d, 0x9f, 0x3e, 0x0d, 0xf6, 0xe6, 0x14, 0xd8, 0x3d, 0xb3, 0x39,
	0x85, 0x46, 0x7e, 0x82, 0xfd, 0x3c, 0x62, 0x87, 0x65, 0x70, 0x13, 0x8c, 0xb6, 0xf8, 0x7a, 0xd3,
	0x57, 0x6a, 0x3a, 0xec, 0xef, 0xc4, 0x7e, 0x26, 0x90, 0xd3, 0x58, 0x95, 0xee, 0x14, 0x42, 0xd8,
	0x2f, 0x86, 0xb7, 0xbb, 0x58, 0x68, 0x80, 0x9f, 0x22, 0xf0, 0x63, 0x76, 0xb4, 0x2c, 0xb0, 0x79,
	0x55, 0xda, 0xa4, 0x71, 0xba, 0x8a, 0x7f, 0x98, 0x0f, 0xfe, 0x06, 0x00, 0x00, 0xff, 0xff, 0x15,
	0xdc, 0x3b, 0x5a, 0x7c, 0x07, 0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// GroupManagementClient is the client API for GroupManagement service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type GroupManagementClient interface {
	// 新建动作分组
	NewMotionGroup(ctx context.Context, in *NewMotionGroupRequest, opts ...grpc.CallOption) (*NewMotionGroupResponse, error)
	// 获取所有动作分组列表
	ListMotionGroups(ctx context.Context, in *ListMotionGroupsRequest, opts ...grpc.CallOption) (*ListMotionGroupsResponse, error)
	// 删除动作分组
	DeleteMotionGroup(ctx context.Context, in *DeleteMotionGroupRequest, opts ...grpc.CallOption) (*DeleteMotionGroupResponse, error)
	// 获取动作分组
	GetMotionGroup(ctx context.Context, in *GetMotionGroupRequest, opts ...grpc.CallOption) (*GetMotionGroupResponse, error)
	// 更新动作分组Meta
	UpdateMotionGroupMeta(ctx context.Context, in *UpdateMotionMetaRequest, opts ...grpc.CallOption) (*UpdateMotionMetaResponse, error)
	// 更新动作分组Scripts
	UpdateMotionGroupScripts(ctx context.Context, in *UpdateMotionScriptsRequest, opts ...grpc.CallOption) (*UpdateMotionScriptsResponse, error)
}

type groupManagementClient struct {
	cc *grpc.ClientConn
}

func NewGroupManagementClient(cc *grpc.ClientConn) GroupManagementClient {
	return &groupManagementClient{cc}
}

func (c *groupManagementClient) NewMotionGroup(ctx context.Context, in *NewMotionGroupRequest, opts ...grpc.CallOption) (*NewMotionGroupResponse, error) {
	out := new(NewMotionGroupResponse)
	err := c.cc.Invoke(ctx, "/handsmotion.GroupManagement/NewMotionGroup", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *groupManagementClient) ListMotionGroups(ctx context.Context, in *ListMotionGroupsRequest, opts ...grpc.CallOption) (*ListMotionGroupsResponse, error) {
	out := new(ListMotionGroupsResponse)
	err := c.cc.Invoke(ctx, "/handsmotion.GroupManagement/ListMotionGroups", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *groupManagementClient) DeleteMotionGroup(ctx context.Context, in *DeleteMotionGroupRequest, opts ...grpc.CallOption) (*DeleteMotionGroupResponse, error) {
	out := new(DeleteMotionGroupResponse)
	err := c.cc.Invoke(ctx, "/handsmotion.GroupManagement/DeleteMotionGroup", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *groupManagementClient) GetMotionGroup(ctx context.Context, in *GetMotionGroupRequest, opts ...grpc.CallOption) (*GetMotionGroupResponse, error) {
	out := new(GetMotionGroupResponse)
	err := c.cc.Invoke(ctx, "/handsmotion.GroupManagement/GetMotionGroup", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *groupManagementClient) UpdateMotionGroupMeta(ctx context.Context, in *UpdateMotionMetaRequest, opts ...grpc.CallOption) (*UpdateMotionMetaResponse, error) {
	out := new(UpdateMotionMetaResponse)
	err := c.cc.Invoke(ctx, "/handsmotion.GroupManagement/UpdateMotionGroupMeta", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *groupManagementClient) UpdateMotionGroupScripts(ctx context.Context, in *UpdateMotionScriptsRequest, opts ...grpc.CallOption) (*UpdateMotionScriptsResponse, error) {
	out := new(UpdateMotionScriptsResponse)
	err := c.cc.Invoke(ctx, "/handsmotion.GroupManagement/UpdateMotionGroupScripts", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// GroupManagementServer is the server API for GroupManagement service.
type GroupManagementServer interface {
	// 新建动作分组
	NewMotionGroup(context.Context, *NewMotionGroupRequest) (*NewMotionGroupResponse, error)
	// 获取所有动作分组列表
	ListMotionGroups(context.Context, *ListMotionGroupsRequest) (*ListMotionGroupsResponse, error)
	// 删除动作分组
	DeleteMotionGroup(context.Context, *DeleteMotionGroupRequest) (*DeleteMotionGroupResponse, error)
	// 获取动作分组
	GetMotionGroup(context.Context, *GetMotionGroupRequest) (*GetMotionGroupResponse, error)
	// 更新动作分组Meta
	UpdateMotionGroupMeta(context.Context, *UpdateMotionMetaRequest) (*UpdateMotionMetaResponse, error)
	// 更新动作分组Scripts
	UpdateMotionGroupScripts(context.Context, *UpdateMotionScriptsRequest) (*UpdateMotionScriptsResponse, error)
}

// UnimplementedGroupManagementServer can be embedded to have forward compatible implementations.
type UnimplementedGroupManagementServer struct {
}

func (*UnimplementedGroupManagementServer) NewMotionGroup(ctx context.Context, req *NewMotionGroupRequest) (*NewMotionGroupResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method NewMotionGroup not implemented")
}
func (*UnimplementedGroupManagementServer) ListMotionGroups(ctx context.Context, req *ListMotionGroupsRequest) (*ListMotionGroupsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListMotionGroups not implemented")
}
func (*UnimplementedGroupManagementServer) DeleteMotionGroup(ctx context.Context, req *DeleteMotionGroupRequest) (*DeleteMotionGroupResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteMotionGroup not implemented")
}
func (*UnimplementedGroupManagementServer) GetMotionGroup(ctx context.Context, req *GetMotionGroupRequest) (*GetMotionGroupResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetMotionGroup not implemented")
}
func (*UnimplementedGroupManagementServer) UpdateMotionGroupMeta(ctx context.Context, req *UpdateMotionMetaRequest) (*UpdateMotionMetaResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateMotionGroupMeta not implemented")
}
func (*UnimplementedGroupManagementServer) UpdateMotionGroupScripts(ctx context.Context, req *UpdateMotionScriptsRequest) (*UpdateMotionScriptsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateMotionGroupScripts not implemented")
}

func RegisterGroupManagementServer(s *grpc.Server, srv GroupManagementServer) {
	s.RegisterService(&_GroupManagement_serviceDesc, srv)
}

func _GroupManagement_NewMotionGroup_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(NewMotionGroupRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(GroupManagementServer).NewMotionGroup(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/handsmotion.GroupManagement/NewMotionGroup",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(GroupManagementServer).NewMotionGroup(ctx, req.(*NewMotionGroupRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _GroupManagement_ListMotionGroups_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListMotionGroupsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(GroupManagementServer).ListMotionGroups(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/handsmotion.GroupManagement/ListMotionGroups",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(GroupManagementServer).ListMotionGroups(ctx, req.(*ListMotionGroupsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _GroupManagement_DeleteMotionGroup_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteMotionGroupRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(GroupManagementServer).DeleteMotionGroup(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/handsmotion.GroupManagement/DeleteMotionGroup",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(GroupManagementServer).DeleteMotionGroup(ctx, req.(*DeleteMotionGroupRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _GroupManagement_GetMotionGroup_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetMotionGroupRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(GroupManagementServer).GetMotionGroup(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/handsmotion.GroupManagement/GetMotionGroup",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(GroupManagementServer).GetMotionGroup(ctx, req.(*GetMotionGroupRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _GroupManagement_UpdateMotionGroupMeta_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateMotionMetaRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(GroupManagementServer).UpdateMotionGroupMeta(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/handsmotion.GroupManagement/UpdateMotionGroupMeta",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(GroupManagementServer).UpdateMotionGroupMeta(ctx, req.(*UpdateMotionMetaRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _GroupManagement_UpdateMotionGroupScripts_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateMotionScriptsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(GroupManagementServer).UpdateMotionGroupScripts(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/handsmotion.GroupManagement/UpdateMotionGroupScripts",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(GroupManagementServer).UpdateMotionGroupScripts(ctx, req.(*UpdateMotionScriptsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _GroupManagement_serviceDesc = grpc.ServiceDesc{
	ServiceName: "handsmotion.GroupManagement",
	HandlerType: (*GroupManagementServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "NewMotionGroup",
			Handler:    _GroupManagement_NewMotionGroup_Handler,
		},
		{
			MethodName: "ListMotionGroups",
			Handler:    _GroupManagement_ListMotionGroups_Handler,
		},
		{
			MethodName: "DeleteMotionGroup",
			Handler:    _GroupManagement_DeleteMotionGroup_Handler,
		},
		{
			MethodName: "GetMotionGroup",
			Handler:    _GroupManagement_GetMotionGroup_Handler,
		},
		{
			MethodName: "UpdateMotionGroupMeta",
			Handler:    _GroupManagement_UpdateMotionGroupMeta_Handler,
		},
		{
			MethodName: "UpdateMotionGroupScripts",
			Handler:    _GroupManagement_UpdateMotionGroupScripts_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "group.proto",
}
