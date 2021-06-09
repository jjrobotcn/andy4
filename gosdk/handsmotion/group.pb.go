// Code generated by protoc-gen-go. DO NOT EDIT.
// source: group.proto

package handmotionpb

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
	// 488 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x9c, 0x94, 0x6f, 0x6f, 0xd3, 0x30,
	0x10, 0xc6, 0xdb, 0x50, 0x6d, 0xe2, 0x8a, 0xca, 0xb0, 0xd4, 0xd5, 0x4b, 0x05, 0x9a, 0xcc, 0x9f,
	0x4d, 0x4c, 0x0a, 0x30, 0xe0, 0x0b, 0x54, 0x48, 0x1b, 0x88, 0x22, 0x54, 0xc4, 0x1b, 0xf6, 0xca,
	0x4d, 0xcc, 0xf0, 0xb4, 0xd8, 0x21, 0xf6, 0x86, 0x26, 0xf1, 0x95, 0xf9, 0x0e, 0x68, 0xb6, 0xdb,
	0xc5, 0x6e, 0xb2, 0x54, 0x7b, 0x57, 0xd5, 0xbf, 0xbb, 0xe7, 0xee, 0xb9, 0x47, 0x81, 0xfe, 0x69,
	0x29, 0x2f, 0x8a, 0xa4, 0x28, 0xa5, 0x96, 0xa8, 0xff, 0x8b, 0x8a, 0x4c, 0xe5, 0x52, 0x73, 0x29,
	0xe2, 0xad, 0x94, 0x16, 0x74, 0xce, 0xcf, 0xb9, 0xbe, 0xb2, 0xcf, 0xe4, 0x35, 0xc0, 0xd4, 0xbc,
	0x4d, 0x99, 0xa6, 0x68, 0x00, 0x11, 0xcf, 0x70, 0x77, 0xb7, 0xbb, 0x7f, 0x7f, 0x16, 0xf1, 0x0c,
	0x21, 0xe8, 0x09, 0x9a, 0x33, 0x1c, 0x99, 0x7f, 0xcc, 0x6f, 0x72, 0x00, 0xc3, 0x2f, 0xec, 0x8f,
	0x2d, 0x3a, 0xba, 0x16, 0x9a, 0xb1, 0xdf, 0x17, 0x4c, 0xe9, 0x25, 0xdc, 0xad, 0xc0, 0x1f, 0x61,
	0x3b, 0x84, 0x55, 0x21, 0x85, 0x62, 0xe8, 0x15, 0x6c, 0xd8, 0xa1, 0x0c, 0xdf, 0x3f, 0x1c, 0x25,
	0x95, 0x41, 0x93, 0x9b, 0x99, 0x66, 0x0e, 0x23, 0x3b, 0x30, 0xfa, 0xcc, 0x95, 0xae, 0xf4, 0x52,
	0x4e, 0x99, 0x4c, 0x01, 0xaf, 0x3e, 0x39, 0x9d, 0x37, 0xb0, 0x69, 0x1b, 0x28, 0xdc, 0xdd, 0xbd,
	0x77, 0x9b, 0xd0, 0x82, 0x23, 0x2f, 0x01, 0x7f, 0x60, 0xe7, 0x4c, 0xb3, 0x9a, 0x25, 0x03, 0x87,
	0xc8, 0x18, 0x76, 0x6a, 0x58, 0xab, 0x4d, 0xf6, 0x60, 0x78, 0xc4, 0xf4, 0x1a, 0x5d, 0xfe, 0xc2,
	0x76, 0x08, 0xba, 0xf1, 0x0f, 0xa0, 0x97, 0x33, 0x4d, 0xdb, 0x4c, 0x32, 0x10, 0x7a, 0x0f, 0x9b,
	0x2a, 0x2d, 0x79, 0xa1, 0x15, 0x8e, 0xcc, 0xae, 0xe3, 0x80, 0xbf, 0x64, 0x39, 0x13, 0xfa, 0x9b,
	0x61, 0x66, 0x0b, 0x96, 0x7c, 0x82, 0xd1, 0xf7, 0x22, 0xa3, 0x8b, 0x1d, 0x4c, 0x43, 0x37, 0xe8,
	0xcd, 0x95, 0xa2, 0xf5, 0xae, 0x14, 0x03, 0x5e, 0xed, 0xe5, 0xec, 0x48, 0x21, 0xae, 0xbe, 0xd9,
	0x31, 0x54, 0x83, 0x27, 0x77, 0x5d, 0xe6, 0x31, 0x8c, 0x6b, 0x45, 0xec, 0x0c, 0x87, 0xff, 0x7a,
	0xf0, 0xd0, 0x38, 0x3c, 0xa5, 0x82, 0x9e, 0x9a, 0x0e, 0xe8, 0x04, 0x06, 0x7e, 0x48, 0x11, 0xf1,
	0xa4, 0x6a, 0xe3, 0x1e, 0x3f, 0xbd, 0x95, 0x71, 0x2b, 0x77, 0x10, 0x85, 0xad, 0x30, 0x9b, 0xe8,
	0x99, 0x57, 0xda, 0x90, 0xea, 0xf8, 0x79, 0x0b, 0xb5, 0x94, 0xc8, 0xe0, 0xd1, 0x4a, 0x06, 0x91,
	0x5f, 0xdd, 0x94, 0xe7, 0xf8, 0x45, 0x1b, 0xb6, 0x54, 0x39, 0x81, 0x81, 0x9f, 0xd1, 0xc0, 0xa5,
	0xda, 0xa4, 0x07, 0x2e, 0xd5, 0x87, 0x9c, 0x74, 0xd0, 0x4f, 0x18, 0x56, 0xaf, 0x66, 0x2f, 0x74,
	0x1d, 0x69, 0xdf, 0xaa, 0x86, 0x98, 0x06, 0x56, 0x35, 0x06, 0xb0, 0x83, 0xa4, 0x1f, 0x4f, 0xa3,
	0xe3, 0x22, 0x82, 0xf6, 0x1a, 0x9b, 0xf8, 0x49, 0x8d, 0xf7, 0xdb, 0xc1, 0x85, 0xe0, 0xe4, 0x18,
	0x9e, 0xa4, 0x32, 0x4f, 0xce, 0xce, 0x4a, 0x39, 0x97, 0x3a, 0xa1, 0x22, 0xbb, 0x7a, 0x67, 0xca,
	0x6d, 0x75, 0x31, 0x9f, 0xe0, 0x63, 0x2a, 0xb2, 0xea, 0x38, 0xac, 0xbc, 0xe4, 0x29, 0xfb, 0x3a,
	0xf9, 0xf1, 0xa0, 0xca, 0xcd, 0x37, 0xcc, 0x07, 0xfb, 0xed, 0xff, 0x00, 0x00, 0x00, 0xff, 0xff,
	0x6c, 0xa8, 0xb6, 0xf5, 0xde, 0x05, 0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConnInterface

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion6

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
	cc grpc.ClientConnInterface
}

func NewGroupManagementClient(cc grpc.ClientConnInterface) GroupManagementClient {
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