// Code generated by protoc-gen-go. DO NOT EDIT.
// source: facedetect.proto

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

type Gender int32

const (
	Gender_GENDER_UNKNOWN Gender = 0
	Gender_GENDER_MALE    Gender = 1
	Gender_GENDER_FEMALE  Gender = 2
)

var Gender_name = map[int32]string{
	0: "GENDER_UNKNOWN",
	1: "GENDER_MALE",
	2: "GENDER_FEMALE",
}

var Gender_value = map[string]int32{
	"GENDER_UNKNOWN": 0,
	"GENDER_MALE":    1,
	"GENDER_FEMALE":  2,
}

func (x Gender) String() string {
	return proto.EnumName(Gender_name, int32(x))
}

func (Gender) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_5314bd1755b5a080, []int{0}
}

//
//人脸中心位置坐标
//坐标由左上角至右下角
//(0,0)   --- (100,0) x
//|
//|
//(0,100) --- (100,100)
//y
type FacePosition struct {
	X                    uint32   `protobuf:"varint,1,opt,name=x,proto3" json:"x,omitempty"`
	Y                    uint32   `protobuf:"varint,2,opt,name=y,proto3" json:"y,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *FacePosition) Reset()         { *m = FacePosition{} }
func (m *FacePosition) String() string { return proto.CompactTextString(m) }
func (*FacePosition) ProtoMessage()    {}
func (*FacePosition) Descriptor() ([]byte, []int) {
	return fileDescriptor_5314bd1755b5a080, []int{0}
}

func (m *FacePosition) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_FacePosition.Unmarshal(m, b)
}
func (m *FacePosition) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_FacePosition.Marshal(b, m, deterministic)
}
func (m *FacePosition) XXX_Merge(src proto.Message) {
	xxx_messageInfo_FacePosition.Merge(m, src)
}
func (m *FacePosition) XXX_Size() int {
	return xxx_messageInfo_FacePosition.Size(m)
}
func (m *FacePosition) XXX_DiscardUnknown() {
	xxx_messageInfo_FacePosition.DiscardUnknown(m)
}

var xxx_messageInfo_FacePosition proto.InternalMessageInfo

func (m *FacePosition) GetX() uint32 {
	if m != nil {
		return m.X
	}
	return 0
}

func (m *FacePosition) GetY() uint32 {
	if m != nil {
		return m.Y
	}
	return 0
}

type FromImageRequest struct {
	// 检测图片内容
	Image []byte `protobuf:"bytes,1,opt,name=image,proto3" json:"image,omitempty"`
	// 检测性别
	WithGender bool `protobuf:"varint,2,opt,name=with_gender,json=withGender,proto3" json:"with_gender,omitempty"`
	// 检测年龄
	WithAge bool `protobuf:"varint,3,opt,name=with_age,json=withAge,proto3" json:"with_age,omitempty"`
	// 检测人脸位置
	WithPosition bool `protobuf:"varint,4,opt,name=with_position,json=withPosition,proto3" json:"with_position,omitempty"`
	// 返回人脸图片戳宽度
	WithFaceCropWidth    bool     `protobuf:"varint,5,opt,name=with_face_crop_width,json=withFaceCropWidth,proto3" json:"with_face_crop_width,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *FromImageRequest) Reset()         { *m = FromImageRequest{} }
func (m *FromImageRequest) String() string { return proto.CompactTextString(m) }
func (*FromImageRequest) ProtoMessage()    {}
func (*FromImageRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_5314bd1755b5a080, []int{1}
}

func (m *FromImageRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_FromImageRequest.Unmarshal(m, b)
}
func (m *FromImageRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_FromImageRequest.Marshal(b, m, deterministic)
}
func (m *FromImageRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_FromImageRequest.Merge(m, src)
}
func (m *FromImageRequest) XXX_Size() int {
	return xxx_messageInfo_FromImageRequest.Size(m)
}
func (m *FromImageRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_FromImageRequest.DiscardUnknown(m)
}

var xxx_messageInfo_FromImageRequest proto.InternalMessageInfo

func (m *FromImageRequest) GetImage() []byte {
	if m != nil {
		return m.Image
	}
	return nil
}

func (m *FromImageRequest) GetWithGender() bool {
	if m != nil {
		return m.WithGender
	}
	return false
}

func (m *FromImageRequest) GetWithAge() bool {
	if m != nil {
		return m.WithAge
	}
	return false
}

func (m *FromImageRequest) GetWithPosition() bool {
	if m != nil {
		return m.WithPosition
	}
	return false
}

func (m *FromImageRequest) GetWithFaceCropWidth() bool {
	if m != nil {
		return m.WithFaceCropWidth
	}
	return false
}

type FromImageResponse struct {
	// 检测人脸图片戳列表
	FaceCrops [][]byte `protobuf:"bytes,1,rep,name=face_crops,json=faceCrops,proto3" json:"face_crops,omitempty"`
	// 检测人脸性别列表
	Genders []Gender `protobuf:"varint,2,rep,packed,name=genders,proto3,enum=faceRecognition.Gender" json:"genders,omitempty"`
	// 检测人脸年龄列表
	Ages []int32 `protobuf:"varint,3,rep,packed,name=ages,proto3" json:"ages,omitempty"`
	// 检测人脸坐标列表
	Positions []*FacePosition `protobuf:"bytes,4,rep,name=positions,proto3" json:"positions,omitempty"`
	// 人脸图片戳宽度列表
	FaceCropWidths       []uint32 `protobuf:"varint,5,rep,packed,name=face_crop_widths,json=faceCropWidths,proto3" json:"face_crop_widths,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *FromImageResponse) Reset()         { *m = FromImageResponse{} }
func (m *FromImageResponse) String() string { return proto.CompactTextString(m) }
func (*FromImageResponse) ProtoMessage()    {}
func (*FromImageResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_5314bd1755b5a080, []int{2}
}

func (m *FromImageResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_FromImageResponse.Unmarshal(m, b)
}
func (m *FromImageResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_FromImageResponse.Marshal(b, m, deterministic)
}
func (m *FromImageResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_FromImageResponse.Merge(m, src)
}
func (m *FromImageResponse) XXX_Size() int {
	return xxx_messageInfo_FromImageResponse.Size(m)
}
func (m *FromImageResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_FromImageResponse.DiscardUnknown(m)
}

var xxx_messageInfo_FromImageResponse proto.InternalMessageInfo

func (m *FromImageResponse) GetFaceCrops() [][]byte {
	if m != nil {
		return m.FaceCrops
	}
	return nil
}

func (m *FromImageResponse) GetGenders() []Gender {
	if m != nil {
		return m.Genders
	}
	return nil
}

func (m *FromImageResponse) GetAges() []int32 {
	if m != nil {
		return m.Ages
	}
	return nil
}

func (m *FromImageResponse) GetPositions() []*FacePosition {
	if m != nil {
		return m.Positions
	}
	return nil
}

func (m *FromImageResponse) GetFaceCropWidths() []uint32 {
	if m != nil {
		return m.FaceCropWidths
	}
	return nil
}

type OnFaceDetectRequest struct {
	// 检测间隔时间(毫秒)
	IntervalMillisecond uint32 `protobuf:"varint,1,opt,name=interval_millisecond,json=intervalMillisecond,proto3" json:"interval_millisecond,omitempty"`
	// 检测性别
	WithGender bool `protobuf:"varint,2,opt,name=with_gender,json=withGender,proto3" json:"with_gender,omitempty"`
	// 检测年龄
	WithAge bool `protobuf:"varint,3,opt,name=with_age,json=withAge,proto3" json:"with_age,omitempty"`
	// 检测人脸位置
	WithPosition bool `protobuf:"varint,4,opt,name=with_position,json=withPosition,proto3" json:"with_position,omitempty"`
	// 返回人脸图片戳宽度
	WithFaceCropWidth    bool     `protobuf:"varint,5,opt,name=with_face_crop_width,json=withFaceCropWidth,proto3" json:"with_face_crop_width,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *OnFaceDetectRequest) Reset()         { *m = OnFaceDetectRequest{} }
func (m *OnFaceDetectRequest) String() string { return proto.CompactTextString(m) }
func (*OnFaceDetectRequest) ProtoMessage()    {}
func (*OnFaceDetectRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_5314bd1755b5a080, []int{3}
}

func (m *OnFaceDetectRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_OnFaceDetectRequest.Unmarshal(m, b)
}
func (m *OnFaceDetectRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_OnFaceDetectRequest.Marshal(b, m, deterministic)
}
func (m *OnFaceDetectRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_OnFaceDetectRequest.Merge(m, src)
}
func (m *OnFaceDetectRequest) XXX_Size() int {
	return xxx_messageInfo_OnFaceDetectRequest.Size(m)
}
func (m *OnFaceDetectRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_OnFaceDetectRequest.DiscardUnknown(m)
}

var xxx_messageInfo_OnFaceDetectRequest proto.InternalMessageInfo

func (m *OnFaceDetectRequest) GetIntervalMillisecond() uint32 {
	if m != nil {
		return m.IntervalMillisecond
	}
	return 0
}

func (m *OnFaceDetectRequest) GetWithGender() bool {
	if m != nil {
		return m.WithGender
	}
	return false
}

func (m *OnFaceDetectRequest) GetWithAge() bool {
	if m != nil {
		return m.WithAge
	}
	return false
}

func (m *OnFaceDetectRequest) GetWithPosition() bool {
	if m != nil {
		return m.WithPosition
	}
	return false
}

func (m *OnFaceDetectRequest) GetWithFaceCropWidth() bool {
	if m != nil {
		return m.WithFaceCropWidth
	}
	return false
}

type OnFaceDetectResponse struct {
	// 检测人脸图片戳列表
	FaceCrops [][]byte `protobuf:"bytes,1,rep,name=face_crops,json=faceCrops,proto3" json:"face_crops,omitempty"`
	// 检测人脸性别列表
	Genders []Gender `protobuf:"varint,2,rep,packed,name=genders,proto3,enum=faceRecognition.Gender" json:"genders,omitempty"`
	// 检测人脸年龄列表
	Ages []int32 `protobuf:"varint,3,rep,packed,name=ages,proto3" json:"ages,omitempty"`
	// 检测人脸坐标列表
	Positions []*FacePosition `protobuf:"bytes,4,rep,name=positions,proto3" json:"positions,omitempty"`
	// 人脸图片戳宽度列表
	FaceCropWidths       []uint32 `protobuf:"varint,5,rep,packed,name=face_crop_widths,json=faceCropWidths,proto3" json:"face_crop_widths,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *OnFaceDetectResponse) Reset()         { *m = OnFaceDetectResponse{} }
func (m *OnFaceDetectResponse) String() string { return proto.CompactTextString(m) }
func (*OnFaceDetectResponse) ProtoMessage()    {}
func (*OnFaceDetectResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_5314bd1755b5a080, []int{4}
}

func (m *OnFaceDetectResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_OnFaceDetectResponse.Unmarshal(m, b)
}
func (m *OnFaceDetectResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_OnFaceDetectResponse.Marshal(b, m, deterministic)
}
func (m *OnFaceDetectResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_OnFaceDetectResponse.Merge(m, src)
}
func (m *OnFaceDetectResponse) XXX_Size() int {
	return xxx_messageInfo_OnFaceDetectResponse.Size(m)
}
func (m *OnFaceDetectResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_OnFaceDetectResponse.DiscardUnknown(m)
}

var xxx_messageInfo_OnFaceDetectResponse proto.InternalMessageInfo

func (m *OnFaceDetectResponse) GetFaceCrops() [][]byte {
	if m != nil {
		return m.FaceCrops
	}
	return nil
}

func (m *OnFaceDetectResponse) GetGenders() []Gender {
	if m != nil {
		return m.Genders
	}
	return nil
}

func (m *OnFaceDetectResponse) GetAges() []int32 {
	if m != nil {
		return m.Ages
	}
	return nil
}

func (m *OnFaceDetectResponse) GetPositions() []*FacePosition {
	if m != nil {
		return m.Positions
	}
	return nil
}

func (m *OnFaceDetectResponse) GetFaceCropWidths() []uint32 {
	if m != nil {
		return m.FaceCropWidths
	}
	return nil
}

type OnFaceSetFaceDetectRequest struct {
	// FaceSet.id
	FaceSetId string `protobuf:"bytes,1,opt,name=face_set_id,json=faceSetId,proto3" json:"face_set_id,omitempty"`
	// 返回结果是否包含人脸图片戳
	// false时Response中face数据将为空
	WithFaceCrop bool `protobuf:"varint,2,opt,name=with_face_crop,json=withFaceCrop,proto3" json:"with_face_crop,omitempty"`
	// 检测性别
	WithGender bool `protobuf:"varint,3,opt,name=with_gender,json=withGender,proto3" json:"with_gender,omitempty"`
	// 检测年龄
	WithAge bool `protobuf:"varint,4,opt,name=with_age,json=withAge,proto3" json:"with_age,omitempty"`
	// 检测人脸位置
	WithPosition bool `protobuf:"varint,5,opt,name=with_position,json=withPosition,proto3" json:"with_position,omitempty"`
	// 检测间隔时间(毫秒)
	IntervalMillisecond uint32 `protobuf:"varint,6,opt,name=interval_millisecond,json=intervalMillisecond,proto3" json:"interval_millisecond,omitempty"`
	// 最低信任值，小于该值的数据将无效并过滤 [0, 1]
	ConfidenceMin float32 `protobuf:"fixed32,7,opt,name=confidence_min,json=confidenceMin,proto3" json:"confidence_min,omitempty"`
	// 返回人脸图片戳宽度
	WithFaceCropWidth    bool     `protobuf:"varint,8,opt,name=with_face_crop_width,json=withFaceCropWidth,proto3" json:"with_face_crop_width,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *OnFaceSetFaceDetectRequest) Reset()         { *m = OnFaceSetFaceDetectRequest{} }
func (m *OnFaceSetFaceDetectRequest) String() string { return proto.CompactTextString(m) }
func (*OnFaceSetFaceDetectRequest) ProtoMessage()    {}
func (*OnFaceSetFaceDetectRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_5314bd1755b5a080, []int{5}
}

func (m *OnFaceSetFaceDetectRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_OnFaceSetFaceDetectRequest.Unmarshal(m, b)
}
func (m *OnFaceSetFaceDetectRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_OnFaceSetFaceDetectRequest.Marshal(b, m, deterministic)
}
func (m *OnFaceSetFaceDetectRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_OnFaceSetFaceDetectRequest.Merge(m, src)
}
func (m *OnFaceSetFaceDetectRequest) XXX_Size() int {
	return xxx_messageInfo_OnFaceSetFaceDetectRequest.Size(m)
}
func (m *OnFaceSetFaceDetectRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_OnFaceSetFaceDetectRequest.DiscardUnknown(m)
}

var xxx_messageInfo_OnFaceSetFaceDetectRequest proto.InternalMessageInfo

func (m *OnFaceSetFaceDetectRequest) GetFaceSetId() string {
	if m != nil {
		return m.FaceSetId
	}
	return ""
}

func (m *OnFaceSetFaceDetectRequest) GetWithFaceCrop() bool {
	if m != nil {
		return m.WithFaceCrop
	}
	return false
}

func (m *OnFaceSetFaceDetectRequest) GetWithGender() bool {
	if m != nil {
		return m.WithGender
	}
	return false
}

func (m *OnFaceSetFaceDetectRequest) GetWithAge() bool {
	if m != nil {
		return m.WithAge
	}
	return false
}

func (m *OnFaceSetFaceDetectRequest) GetWithPosition() bool {
	if m != nil {
		return m.WithPosition
	}
	return false
}

func (m *OnFaceSetFaceDetectRequest) GetIntervalMillisecond() uint32 {
	if m != nil {
		return m.IntervalMillisecond
	}
	return 0
}

func (m *OnFaceSetFaceDetectRequest) GetConfidenceMin() float32 {
	if m != nil {
		return m.ConfidenceMin
	}
	return 0
}

func (m *OnFaceSetFaceDetectRequest) GetWithFaceCropWidth() bool {
	if m != nil {
		return m.WithFaceCropWidth
	}
	return false
}

type OnFaceSetFaceDetectResponse struct {
	// 匹配结果信任值列表 [0, 1.0]
	Confidences []float32 `protobuf:"fixed32,1,rep,packed,name=confidences,proto3" json:"confidences,omitempty"`
	// 检测人脸token列表
	FaceTokens []string `protobuf:"bytes,2,rep,name=face_tokens,json=faceTokens,proto3" json:"face_tokens,omitempty"`
	// 检测人脸图片戳列表
	FaceCrops [][]byte `protobuf:"bytes,3,rep,name=face_crops,json=faceCrops,proto3" json:"face_crops,omitempty"`
	// 检测人脸性别列表
	Genders []Gender `protobuf:"varint,4,rep,packed,name=genders,proto3,enum=faceRecognition.Gender" json:"genders,omitempty"`
	// 检测人脸年龄列表
	Ages []int32 `protobuf:"varint,5,rep,packed,name=ages,proto3" json:"ages,omitempty"`
	// 检测人脸坐标列表
	Positions []*FacePosition `protobuf:"bytes,6,rep,name=positions,proto3" json:"positions,omitempty"`
	// 人脸图片戳宽度列表
	FaceCropWidths       []uint32 `protobuf:"varint,7,rep,packed,name=face_crop_widths,json=faceCropWidths,proto3" json:"face_crop_widths,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *OnFaceSetFaceDetectResponse) Reset()         { *m = OnFaceSetFaceDetectResponse{} }
func (m *OnFaceSetFaceDetectResponse) String() string { return proto.CompactTextString(m) }
func (*OnFaceSetFaceDetectResponse) ProtoMessage()    {}
func (*OnFaceSetFaceDetectResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_5314bd1755b5a080, []int{6}
}

func (m *OnFaceSetFaceDetectResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_OnFaceSetFaceDetectResponse.Unmarshal(m, b)
}
func (m *OnFaceSetFaceDetectResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_OnFaceSetFaceDetectResponse.Marshal(b, m, deterministic)
}
func (m *OnFaceSetFaceDetectResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_OnFaceSetFaceDetectResponse.Merge(m, src)
}
func (m *OnFaceSetFaceDetectResponse) XXX_Size() int {
	return xxx_messageInfo_OnFaceSetFaceDetectResponse.Size(m)
}
func (m *OnFaceSetFaceDetectResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_OnFaceSetFaceDetectResponse.DiscardUnknown(m)
}

var xxx_messageInfo_OnFaceSetFaceDetectResponse proto.InternalMessageInfo

func (m *OnFaceSetFaceDetectResponse) GetConfidences() []float32 {
	if m != nil {
		return m.Confidences
	}
	return nil
}

func (m *OnFaceSetFaceDetectResponse) GetFaceTokens() []string {
	if m != nil {
		return m.FaceTokens
	}
	return nil
}

func (m *OnFaceSetFaceDetectResponse) GetFaceCrops() [][]byte {
	if m != nil {
		return m.FaceCrops
	}
	return nil
}

func (m *OnFaceSetFaceDetectResponse) GetGenders() []Gender {
	if m != nil {
		return m.Genders
	}
	return nil
}

func (m *OnFaceSetFaceDetectResponse) GetAges() []int32 {
	if m != nil {
		return m.Ages
	}
	return nil
}

func (m *OnFaceSetFaceDetectResponse) GetPositions() []*FacePosition {
	if m != nil {
		return m.Positions
	}
	return nil
}

func (m *OnFaceSetFaceDetectResponse) GetFaceCropWidths() []uint32 {
	if m != nil {
		return m.FaceCropWidths
	}
	return nil
}

func init() {
	proto.RegisterEnum("faceRecognition.Gender", Gender_name, Gender_value)
	proto.RegisterType((*FacePosition)(nil), "faceRecognition.FacePosition")
	proto.RegisterType((*FromImageRequest)(nil), "faceRecognition.FromImageRequest")
	proto.RegisterType((*FromImageResponse)(nil), "faceRecognition.FromImageResponse")
	proto.RegisterType((*OnFaceDetectRequest)(nil), "faceRecognition.OnFaceDetectRequest")
	proto.RegisterType((*OnFaceDetectResponse)(nil), "faceRecognition.OnFaceDetectResponse")
	proto.RegisterType((*OnFaceSetFaceDetectRequest)(nil), "faceRecognition.OnFaceSetFaceDetectRequest")
	proto.RegisterType((*OnFaceSetFaceDetectResponse)(nil), "faceRecognition.OnFaceSetFaceDetectResponse")
}

func init() { proto.RegisterFile("facedetect.proto", fileDescriptor_5314bd1755b5a080) }

var fileDescriptor_5314bd1755b5a080 = []byte{
	// 726 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xdc, 0x56, 0xcb, 0x6e, 0xd3, 0x40,
	0x14, 0xc5, 0x76, 0x1e, 0xcd, 0xcd, 0xa3, 0xe9, 0x34, 0x12, 0x26, 0xd0, 0x62, 0xdc, 0x56, 0x32,
	0x29, 0x34, 0x34, 0xdd, 0xc1, 0x86, 0x8a, 0xa6, 0x55, 0x05, 0x4d, 0x91, 0x0b, 0xea, 0xd2, 0x32,
	0xce, 0x24, 0xb5, 0x48, 0x66, 0x42, 0xc6, 0xf4, 0xb1, 0x60, 0xc3, 0x8e, 0x35, 0x1f, 0xc1, 0x8a,
	0x1f, 0x60, 0xc7, 0x0f, 0xb0, 0x61, 0xc7, 0x0a, 0x09, 0x3e, 0x04, 0xcd, 0x8c, 0x93, 0x38, 0xcf,
	0x82, 0xc4, 0x02, 0xb1, 0xcb, 0x9c, 0x7b, 0xe7, 0xfa, 0xdc, 0x7b, 0x8e, 0xee, 0x04, 0xf2, 0x0d,
	0xd7, 0xc3, 0x75, 0x1c, 0x60, 0x2f, 0xd8, 0xe8, 0x74, 0x69, 0x40, 0xd1, 0x3c, 0x47, 0x6c, 0xec,
	0xd1, 0x26, 0xf1, 0x03, 0x9f, 0x92, 0xe2, 0x8d, 0x26, 0xa5, 0xcd, 0x16, 0x2e, 0xbb, 0x1d, 0xbf,
	0xec, 0x12, 0x42, 0x03, 0x97, 0xc3, 0x4c, 0xa6, 0x9b, 0x25, 0xc8, 0xec, 0xba, 0x1e, 0x7e, 0x4a,
	0x99, 0xc8, 0x46, 0x19, 0x50, 0xce, 0x75, 0xc5, 0x50, 0xac, 0xac, 0xad, 0x9c, 0xf3, 0xd3, 0x85,
	0xae, 0xca, 0xd3, 0x85, 0xf9, 0x49, 0x81, 0xfc, 0x6e, 0x97, 0xb6, 0xf7, 0xdb, 0x6e, 0x13, 0xdb,
	0xf8, 0xd5, 0x6b, 0xcc, 0x02, 0x54, 0x80, 0xb8, 0xcf, 0xcf, 0xe2, 0x52, 0xc6, 0x96, 0x07, 0x74,
	0x13, 0xd2, 0x67, 0x7e, 0x70, 0xe2, 0x34, 0x31, 0xa9, 0xe3, 0xae, 0x28, 0x31, 0x67, 0x03, 0x87,
	0xf6, 0x04, 0x82, 0xae, 0xc1, 0x9c, 0x48, 0xe0, 0x37, 0x35, 0x11, 0x4d, 0xf2, 0xf3, 0x76, 0x13,
	0xa3, 0x15, 0xc8, 0x8a, 0x50, 0x27, 0xe4, 0xa4, 0xc7, 0x44, 0x3c, 0xc3, 0xc1, 0x3e, 0xcf, 0x32,
	0x14, 0x44, 0x12, 0xef, 0xd6, 0xf1, 0xba, 0xb4, 0xe3, 0x9c, 0xf9, 0xf5, 0xe0, 0x44, 0x8f, 0x8b,
	0xdc, 0x05, 0x1e, 0xe3, 0x7d, 0x3d, 0xea, 0xd2, 0xce, 0x31, 0x0f, 0x98, 0xdf, 0x15, 0x58, 0x88,
	0x90, 0x67, 0x1d, 0x4a, 0x18, 0x46, 0x4b, 0x00, 0xfd, 0x0a, 0x4c, 0x57, 0x0c, 0xcd, 0xca, 0xd8,
	0xa9, 0x46, 0x78, 0x91, 0xa1, 0x4d, 0x48, 0xca, 0x0e, 0x98, 0xae, 0x1a, 0x9a, 0x95, 0xab, 0x5c,
	0xdd, 0x18, 0x19, 0xef, 0x86, 0xec, 0xc7, 0xee, 0xe5, 0x21, 0x04, 0x31, 0xb7, 0x89, 0x99, 0xae,
	0x19, 0x9a, 0x15, 0xb7, 0xc5, 0x6f, 0xf4, 0x00, 0x52, 0xbd, 0x66, 0x98, 0x1e, 0x33, 0x34, 0x2b,
	0x5d, 0x59, 0x1a, 0x2b, 0x14, 0x95, 0xc1, 0x1e, 0xe4, 0x23, 0x4b, 0x8a, 0x1c, 0x69, 0x92, 0xe9,
	0x71, 0x43, 0xb3, 0xb2, 0x76, 0xae, 0x11, 0xed, 0x90, 0x99, 0xdf, 0x14, 0x58, 0x3c, 0x24, 0xbc,
	0xce, 0x8e, 0x70, 0x44, 0x4f, 0xa2, 0x4d, 0x28, 0xf8, 0x24, 0xc0, 0xdd, 0x53, 0xb7, 0xe5, 0xb4,
	0xfd, 0x56, 0xcb, 0x67, 0xd8, 0xa3, 0xa4, 0x1e, 0xca, 0xbc, 0xd8, 0x8b, 0x1d, 0x0c, 0x42, 0xff,
	0xa0, 0x7e, 0x3f, 0x14, 0x28, 0x0c, 0x37, 0xf7, 0x3f, 0x4a, 0xf8, 0x45, 0x85, 0xa2, 0xec, 0xf2,
	0x08, 0x07, 0xe3, 0x4a, 0x2e, 0x43, 0x5a, 0x14, 0x62, 0x38, 0x70, 0x7c, 0x29, 0x60, 0x4a, 0x36,
	0x7b, 0x84, 0x83, 0xfd, 0x3a, 0x5a, 0x85, 0xdc, 0xf0, 0x54, 0x43, 0xe5, 0x32, 0xd1, 0x79, 0x8e,
	0x8a, 0xab, 0xcd, 0x14, 0x37, 0x76, 0x89, 0xb8, 0xf1, 0x09, 0xe2, 0x4e, 0x33, 0x5c, 0x62, 0xba,
	0xe1, 0xd6, 0x20, 0xe7, 0x51, 0xd2, 0xf0, 0xeb, 0x98, 0x78, 0xd8, 0x69, 0xfb, 0x44, 0x4f, 0x1a,
	0x8a, 0xa5, 0xda, 0xd9, 0x01, 0x7a, 0xe0, 0x4f, 0xb7, 0xcd, 0xdc, 0x34, 0xdb, 0x7c, 0x54, 0xe1,
	0xfa, 0xc4, 0x81, 0x86, 0xee, 0x31, 0x20, 0x3d, 0xf8, 0x82, 0xb4, 0x8f, 0x6a, 0x47, 0x21, 0x3e,
	0x2d, 0xf1, 0xb5, 0x80, 0xbe, 0xc4, 0x44, 0x9a, 0x28, 0x65, 0x0b, 0xcb, 0x3d, 0x13, 0xc8, 0x88,
	0x01, 0xb5, 0x19, 0x06, 0x8c, 0xfd, 0xa1, 0x01, 0xe3, 0xd3, 0x0c, 0x98, 0xf8, 0x0b, 0x06, 0x4c,
	0x4e, 0x32, 0x60, 0xe9, 0x21, 0x24, 0x42, 0x13, 0x20, 0xc8, 0xed, 0x55, 0x6b, 0x3b, 0x55, 0xdb,
	0x79, 0x5e, 0x7b, 0x5c, 0x3b, 0x3c, 0xae, 0xe5, 0xaf, 0xa0, 0x79, 0x48, 0x87, 0xd8, 0xc1, 0xf6,
	0x93, 0x6a, 0x5e, 0x41, 0x0b, 0x90, 0x0d, 0x81, 0xdd, 0xaa, 0x80, 0xd4, 0xca, 0x67, 0x0d, 0x60,
	0x30, 0x68, 0xf4, 0x06, 0x52, 0xfd, 0xb5, 0x8b, 0x6e, 0x8d, 0x33, 0x1e, 0x79, 0x4f, 0x8a, 0xe6,
	0xac, 0x14, 0x29, 0x9a, 0x79, 0xfb, 0xed, 0xd7, 0x9f, 0xef, 0xd5, 0x15, 0x73, 0x59, 0x3c, 0x6a,
	0xa7, 0x95, 0x32, 0xbf, 0x52, 0x96, 0xcf, 0x60, 0xb9, 0xd1, 0xa5, 0x6d, 0x47, 0xbc, 0x42, 0xf7,
	0x95, 0x12, 0x7a, 0xa7, 0x40, 0x26, 0xba, 0x36, 0xd0, 0xea, 0x58, 0xfd, 0x09, 0x2b, 0xb3, 0xb8,
	0x76, 0x49, 0x56, 0x48, 0xa4, 0x24, 0x88, 0xac, 0x22, 0x73, 0x12, 0x11, 0x4a, 0xa4, 0x4d, 0xe5,
	0xf1, 0x9e, 0x82, 0x3e, 0xf4, 0xf7, 0xf3, 0x90, 0x17, 0xd1, 0xfa, 0x94, 0x8f, 0x4d, 0x5a, 0x01,
	0xc5, 0x3b, 0xbf, 0x97, 0x1c, 0x12, 0xdc, 0x12, 0x04, 0xef, 0xa2, 0xf5, 0x59, 0x04, 0xf9, 0x36,
	0x19, 0x62, 0xfa, 0x22, 0x21, 0xfe, 0x1c, 0x6c, 0xfd, 0x0a, 0x00, 0x00, 0xff, 0xff, 0xdc, 0x10,
	0x3d, 0x6a, 0x5f, 0x08, 0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// FaceDetectClient is the client API for FaceDetect service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type FaceDetectClient interface {
	// FromImage实现对输入图片进行人脸检测，返回检测人脸图片列表
	FromImage(ctx context.Context, in *FromImageRequest, opts ...grpc.CallOption) (*FromImageResponse, error)
	// OnFaceDetect实现动态检测人脸，流式返回检测人脸图片戳列表
	OnFaceDetect(ctx context.Context, in *OnFaceDetectRequest, opts ...grpc.CallOption) (FaceDetect_OnFaceDetectClient, error)
	// OnFaceSetFaceDetect实现动态检测人脸并与指定FaceSet进行对比，流式返回检测结果
	OnFaceSetFaceDetect(ctx context.Context, in *OnFaceSetFaceDetectRequest, opts ...grpc.CallOption) (FaceDetect_OnFaceSetFaceDetectClient, error)
}

type faceDetectClient struct {
	cc *grpc.ClientConn
}

func NewFaceDetectClient(cc *grpc.ClientConn) FaceDetectClient {
	return &faceDetectClient{cc}
}

func (c *faceDetectClient) FromImage(ctx context.Context, in *FromImageRequest, opts ...grpc.CallOption) (*FromImageResponse, error) {
	out := new(FromImageResponse)
	err := c.cc.Invoke(ctx, "/faceRecognition.FaceDetect/FromImage", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *faceDetectClient) OnFaceDetect(ctx context.Context, in *OnFaceDetectRequest, opts ...grpc.CallOption) (FaceDetect_OnFaceDetectClient, error) {
	stream, err := c.cc.NewStream(ctx, &_FaceDetect_serviceDesc.Streams[0], "/faceRecognition.FaceDetect/OnFaceDetect", opts...)
	if err != nil {
		return nil, err
	}
	x := &faceDetectOnFaceDetectClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type FaceDetect_OnFaceDetectClient interface {
	Recv() (*OnFaceDetectResponse, error)
	grpc.ClientStream
}

type faceDetectOnFaceDetectClient struct {
	grpc.ClientStream
}

func (x *faceDetectOnFaceDetectClient) Recv() (*OnFaceDetectResponse, error) {
	m := new(OnFaceDetectResponse)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *faceDetectClient) OnFaceSetFaceDetect(ctx context.Context, in *OnFaceSetFaceDetectRequest, opts ...grpc.CallOption) (FaceDetect_OnFaceSetFaceDetectClient, error) {
	stream, err := c.cc.NewStream(ctx, &_FaceDetect_serviceDesc.Streams[1], "/faceRecognition.FaceDetect/OnFaceSetFaceDetect", opts...)
	if err != nil {
		return nil, err
	}
	x := &faceDetectOnFaceSetFaceDetectClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type FaceDetect_OnFaceSetFaceDetectClient interface {
	Recv() (*OnFaceSetFaceDetectResponse, error)
	grpc.ClientStream
}

type faceDetectOnFaceSetFaceDetectClient struct {
	grpc.ClientStream
}

func (x *faceDetectOnFaceSetFaceDetectClient) Recv() (*OnFaceSetFaceDetectResponse, error) {
	m := new(OnFaceSetFaceDetectResponse)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

// FaceDetectServer is the server API for FaceDetect service.
type FaceDetectServer interface {
	// FromImage实现对输入图片进行人脸检测，返回检测人脸图片列表
	FromImage(context.Context, *FromImageRequest) (*FromImageResponse, error)
	// OnFaceDetect实现动态检测人脸，流式返回检测人脸图片戳列表
	OnFaceDetect(*OnFaceDetectRequest, FaceDetect_OnFaceDetectServer) error
	// OnFaceSetFaceDetect实现动态检测人脸并与指定FaceSet进行对比，流式返回检测结果
	OnFaceSetFaceDetect(*OnFaceSetFaceDetectRequest, FaceDetect_OnFaceSetFaceDetectServer) error
}

// UnimplementedFaceDetectServer can be embedded to have forward compatible implementations.
type UnimplementedFaceDetectServer struct {
}

func (*UnimplementedFaceDetectServer) FromImage(ctx context.Context, req *FromImageRequest) (*FromImageResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method FromImage not implemented")
}
func (*UnimplementedFaceDetectServer) OnFaceDetect(req *OnFaceDetectRequest, srv FaceDetect_OnFaceDetectServer) error {
	return status.Errorf(codes.Unimplemented, "method OnFaceDetect not implemented")
}
func (*UnimplementedFaceDetectServer) OnFaceSetFaceDetect(req *OnFaceSetFaceDetectRequest, srv FaceDetect_OnFaceSetFaceDetectServer) error {
	return status.Errorf(codes.Unimplemented, "method OnFaceSetFaceDetect not implemented")
}

func RegisterFaceDetectServer(s *grpc.Server, srv FaceDetectServer) {
	s.RegisterService(&_FaceDetect_serviceDesc, srv)
}

func _FaceDetect_FromImage_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(FromImageRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FaceDetectServer).FromImage(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/faceRecognition.FaceDetect/FromImage",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FaceDetectServer).FromImage(ctx, req.(*FromImageRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FaceDetect_OnFaceDetect_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(OnFaceDetectRequest)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(FaceDetectServer).OnFaceDetect(m, &faceDetectOnFaceDetectServer{stream})
}

type FaceDetect_OnFaceDetectServer interface {
	Send(*OnFaceDetectResponse) error
	grpc.ServerStream
}

type faceDetectOnFaceDetectServer struct {
	grpc.ServerStream
}

func (x *faceDetectOnFaceDetectServer) Send(m *OnFaceDetectResponse) error {
	return x.ServerStream.SendMsg(m)
}

func _FaceDetect_OnFaceSetFaceDetect_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(OnFaceSetFaceDetectRequest)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(FaceDetectServer).OnFaceSetFaceDetect(m, &faceDetectOnFaceSetFaceDetectServer{stream})
}

type FaceDetect_OnFaceSetFaceDetectServer interface {
	Send(*OnFaceSetFaceDetectResponse) error
	grpc.ServerStream
}

type faceDetectOnFaceSetFaceDetectServer struct {
	grpc.ServerStream
}

func (x *faceDetectOnFaceSetFaceDetectServer) Send(m *OnFaceSetFaceDetectResponse) error {
	return x.ServerStream.SendMsg(m)
}

var _FaceDetect_serviceDesc = grpc.ServiceDesc{
	ServiceName: "faceRecognition.FaceDetect",
	HandlerType: (*FaceDetectServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "FromImage",
			Handler:    _FaceDetect_FromImage_Handler,
		},
	},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "OnFaceDetect",
			Handler:       _FaceDetect_OnFaceDetect_Handler,
			ServerStreams: true,
		},
		{
			StreamName:    "OnFaceSetFaceDetect",
			Handler:       _FaceDetect_OnFaceSetFaceDetect_Handler,
			ServerStreams: true,
		},
	},
	Metadata: "facedetect.proto",
}
