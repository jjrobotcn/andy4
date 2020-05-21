// Code generated by protoc-gen-go. DO NOT EDIT.
// source: network.proto

package networkpb

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

// 连接状态
type Status int32

const (
	// 保留数据
	Status_UNKNOWN Status = 0
	// 连接断开
	Status_DISCONNECTED Status = 1
	// 连接中
	Status_CONNECTING Status = 2
	// 已连接
	Status_CONNECTED Status = 3
)

var Status_name = map[int32]string{
	0: "UNKNOWN",
	1: "DISCONNECTED",
	2: "CONNECTING",
	3: "CONNECTED",
}

var Status_value = map[string]int32{
	"UNKNOWN":      0,
	"DISCONNECTED": 1,
	"CONNECTING":   2,
	"CONNECTED":    3,
}

func (x Status) String() string {
	return proto.EnumName(Status_name, int32(x))
}

func (Status) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_8571034d60397816, []int{0}
}

// 网络信息
type NetworkInfo struct {
	// wifi名
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// mac地址
	Mac string `protobuf:"bytes,2,opt,name=mac,proto3" json:"mac,omitempty"`
	// 网络信道
	Channel uint32 `protobuf:"varint,3,opt,name=channel,proto3" json:"channel,omitempty"`
	// 信号强度 0-100
	Rssi                 uint32   `protobuf:"varint,4,opt,name=rssi,proto3" json:"rssi,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *NetworkInfo) Reset()         { *m = NetworkInfo{} }
func (m *NetworkInfo) String() string { return proto.CompactTextString(m) }
func (*NetworkInfo) ProtoMessage()    {}
func (*NetworkInfo) Descriptor() ([]byte, []int) {
	return fileDescriptor_8571034d60397816, []int{0}
}

func (m *NetworkInfo) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_NetworkInfo.Unmarshal(m, b)
}
func (m *NetworkInfo) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_NetworkInfo.Marshal(b, m, deterministic)
}
func (m *NetworkInfo) XXX_Merge(src proto.Message) {
	xxx_messageInfo_NetworkInfo.Merge(m, src)
}
func (m *NetworkInfo) XXX_Size() int {
	return xxx_messageInfo_NetworkInfo.Size(m)
}
func (m *NetworkInfo) XXX_DiscardUnknown() {
	xxx_messageInfo_NetworkInfo.DiscardUnknown(m)
}

var xxx_messageInfo_NetworkInfo proto.InternalMessageInfo

func (m *NetworkInfo) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

func (m *NetworkInfo) GetMac() string {
	if m != nil {
		return m.Mac
	}
	return ""
}

func (m *NetworkInfo) GetChannel() uint32 {
	if m != nil {
		return m.Channel
	}
	return 0
}

func (m *NetworkInfo) GetRssi() uint32 {
	if m != nil {
		return m.Rssi
	}
	return 0
}

// 获取网络扫描结果流请求
type ListNetworksRequest struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *ListNetworksRequest) Reset()         { *m = ListNetworksRequest{} }
func (m *ListNetworksRequest) String() string { return proto.CompactTextString(m) }
func (*ListNetworksRequest) ProtoMessage()    {}
func (*ListNetworksRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_8571034d60397816, []int{1}
}

func (m *ListNetworksRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ListNetworksRequest.Unmarshal(m, b)
}
func (m *ListNetworksRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ListNetworksRequest.Marshal(b, m, deterministic)
}
func (m *ListNetworksRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ListNetworksRequest.Merge(m, src)
}
func (m *ListNetworksRequest) XXX_Size() int {
	return xxx_messageInfo_ListNetworksRequest.Size(m)
}
func (m *ListNetworksRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_ListNetworksRequest.DiscardUnknown(m)
}

var xxx_messageInfo_ListNetworksRequest proto.InternalMessageInfo

// 获取网络扫描结果流结果
type ListNetworksResponse struct {
	// 网络信息列表
	NetworksInfo         []*NetworkInfo `protobuf:"bytes,1,rep,name=networks_info,json=networksInfo,proto3" json:"networks_info,omitempty"`
	XXX_NoUnkeyedLiteral struct{}       `json:"-"`
	XXX_unrecognized     []byte         `json:"-"`
	XXX_sizecache        int32          `json:"-"`
}

func (m *ListNetworksResponse) Reset()         { *m = ListNetworksResponse{} }
func (m *ListNetworksResponse) String() string { return proto.CompactTextString(m) }
func (*ListNetworksResponse) ProtoMessage()    {}
func (*ListNetworksResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_8571034d60397816, []int{2}
}

func (m *ListNetworksResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ListNetworksResponse.Unmarshal(m, b)
}
func (m *ListNetworksResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ListNetworksResponse.Marshal(b, m, deterministic)
}
func (m *ListNetworksResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ListNetworksResponse.Merge(m, src)
}
func (m *ListNetworksResponse) XXX_Size() int {
	return xxx_messageInfo_ListNetworksResponse.Size(m)
}
func (m *ListNetworksResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_ListNetworksResponse.DiscardUnknown(m)
}

var xxx_messageInfo_ListNetworksResponse proto.InternalMessageInfo

func (m *ListNetworksResponse) GetNetworksInfo() []*NetworkInfo {
	if m != nil {
		return m.NetworksInfo
	}
	return nil
}

// 连接至指定网络请求
type ConnectRequest struct {
	// 目标网络信息
	// 此对象应由ListNetworks.ListNetworksResponse.NetworkInfo中获取
	//
	// 已废弃，请使用ssid作为连接目标参数
	NetworkInfo *NetworkInfo `protobuf:"bytes,1,opt,name=network_info,json=networkInfo,proto3" json:"network_info,omitempty"` // Deprecated: Do not use.
	// 目标网络ssid
	// 自动获取当前的NetworkInfo信息中首个匹配ssid，
	// 若匹配失败将直接返回连接错误
	// 不支持隐藏ssid的链接
	Ssid string `protobuf:"bytes,3,opt,name=ssid,proto3" json:"ssid,omitempty"`
	// wifi密码
	Pwd string `protobuf:"bytes,2,opt,name=pwd,proto3" json:"pwd,omitempty"`
	// 保持当前外部连接
	// 配置此参数后将立即启动状态监听。
	// 若出现DISCONNECTED状态且keep_alive_interval间隔时间内，
	// 状态持续为DISCONNECTED状态将自动发起ConnectRequest。
	// 在等待期间出现非DISCONNECTED的任意状态切换，
	// keep_alive_interval都将重新计算。
	KeepAlive bool `protobuf:"varint,4,opt,name=keep_alive,json=keepAlive,proto3" json:"keep_alive,omitempty"`
	// 保持当前连接判断间隔, 默认及最小为30s
	KeepAliveInterval    uint32   `protobuf:"varint,5,opt,name=keep_alive_interval,json=keepAliveInterval,proto3" json:"keep_alive_interval,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *ConnectRequest) Reset()         { *m = ConnectRequest{} }
func (m *ConnectRequest) String() string { return proto.CompactTextString(m) }
func (*ConnectRequest) ProtoMessage()    {}
func (*ConnectRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_8571034d60397816, []int{3}
}

func (m *ConnectRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ConnectRequest.Unmarshal(m, b)
}
func (m *ConnectRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ConnectRequest.Marshal(b, m, deterministic)
}
func (m *ConnectRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ConnectRequest.Merge(m, src)
}
func (m *ConnectRequest) XXX_Size() int {
	return xxx_messageInfo_ConnectRequest.Size(m)
}
func (m *ConnectRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_ConnectRequest.DiscardUnknown(m)
}

var xxx_messageInfo_ConnectRequest proto.InternalMessageInfo

// Deprecated: Do not use.
func (m *ConnectRequest) GetNetworkInfo() *NetworkInfo {
	if m != nil {
		return m.NetworkInfo
	}
	return nil
}

func (m *ConnectRequest) GetSsid() string {
	if m != nil {
		return m.Ssid
	}
	return ""
}

func (m *ConnectRequest) GetPwd() string {
	if m != nil {
		return m.Pwd
	}
	return ""
}

func (m *ConnectRequest) GetKeepAlive() bool {
	if m != nil {
		return m.KeepAlive
	}
	return false
}

func (m *ConnectRequest) GetKeepAliveInterval() uint32 {
	if m != nil {
		return m.KeepAliveInterval
	}
	return 0
}

// 网络状态
type NetworkStatus struct {
	// 连接状态
	Status Status `protobuf:"varint,1,opt,name=status,proto3,enum=networkService.Status" json:"status,omitempty"`
	// 连接的上级网络ssid
	Name string `protobuf:"bytes,2,opt,name=name,proto3" json:"name,omitempty"`
	// 连接的上级网络ip
	PublicIp string `protobuf:"bytes,3,opt,name=public_ip,json=publicIp,proto3" json:"public_ip,omitempty"`
	// 当前信号强度
	Rssi uint32 `protobuf:"varint,4,opt,name=rssi,proto3" json:"rssi,omitempty"`
	// 当前上传速度
	Upload uint32 `protobuf:"varint,5,opt,name=upload,proto3" json:"upload,omitempty"`
	// 当前下载速度
	Download             uint32   `protobuf:"varint,6,opt,name=download,proto3" json:"download,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *NetworkStatus) Reset()         { *m = NetworkStatus{} }
func (m *NetworkStatus) String() string { return proto.CompactTextString(m) }
func (*NetworkStatus) ProtoMessage()    {}
func (*NetworkStatus) Descriptor() ([]byte, []int) {
	return fileDescriptor_8571034d60397816, []int{4}
}

func (m *NetworkStatus) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_NetworkStatus.Unmarshal(m, b)
}
func (m *NetworkStatus) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_NetworkStatus.Marshal(b, m, deterministic)
}
func (m *NetworkStatus) XXX_Merge(src proto.Message) {
	xxx_messageInfo_NetworkStatus.Merge(m, src)
}
func (m *NetworkStatus) XXX_Size() int {
	return xxx_messageInfo_NetworkStatus.Size(m)
}
func (m *NetworkStatus) XXX_DiscardUnknown() {
	xxx_messageInfo_NetworkStatus.DiscardUnknown(m)
}

var xxx_messageInfo_NetworkStatus proto.InternalMessageInfo

func (m *NetworkStatus) GetStatus() Status {
	if m != nil {
		return m.Status
	}
	return Status_UNKNOWN
}

func (m *NetworkStatus) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

func (m *NetworkStatus) GetPublicIp() string {
	if m != nil {
		return m.PublicIp
	}
	return ""
}

func (m *NetworkStatus) GetRssi() uint32 {
	if m != nil {
		return m.Rssi
	}
	return 0
}

func (m *NetworkStatus) GetUpload() uint32 {
	if m != nil {
		return m.Upload
	}
	return 0
}

func (m *NetworkStatus) GetDownload() uint32 {
	if m != nil {
		return m.Download
	}
	return 0
}

// 连接至指定网络请求结果
type ConnectResponse struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *ConnectResponse) Reset()         { *m = ConnectResponse{} }
func (m *ConnectResponse) String() string { return proto.CompactTextString(m) }
func (*ConnectResponse) ProtoMessage()    {}
func (*ConnectResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_8571034d60397816, []int{5}
}

func (m *ConnectResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ConnectResponse.Unmarshal(m, b)
}
func (m *ConnectResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ConnectResponse.Marshal(b, m, deterministic)
}
func (m *ConnectResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ConnectResponse.Merge(m, src)
}
func (m *ConnectResponse) XXX_Size() int {
	return xxx_messageInfo_ConnectResponse.Size(m)
}
func (m *ConnectResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_ConnectResponse.DiscardUnknown(m)
}

var xxx_messageInfo_ConnectResponse proto.InternalMessageInfo

// 获取连接状态流请求
type GetStatusRequest struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetStatusRequest) Reset()         { *m = GetStatusRequest{} }
func (m *GetStatusRequest) String() string { return proto.CompactTextString(m) }
func (*GetStatusRequest) ProtoMessage()    {}
func (*GetStatusRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_8571034d60397816, []int{6}
}

func (m *GetStatusRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetStatusRequest.Unmarshal(m, b)
}
func (m *GetStatusRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetStatusRequest.Marshal(b, m, deterministic)
}
func (m *GetStatusRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetStatusRequest.Merge(m, src)
}
func (m *GetStatusRequest) XXX_Size() int {
	return xxx_messageInfo_GetStatusRequest.Size(m)
}
func (m *GetStatusRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_GetStatusRequest.DiscardUnknown(m)
}

var xxx_messageInfo_GetStatusRequest proto.InternalMessageInfo

// 获取连接状态流结果
type GetStatusResponse struct {
	// 网络状态
	NetworkStatus        *NetworkStatus `protobuf:"bytes,1,opt,name=network_status,json=networkStatus,proto3" json:"network_status,omitempty"`
	XXX_NoUnkeyedLiteral struct{}       `json:"-"`
	XXX_unrecognized     []byte         `json:"-"`
	XXX_sizecache        int32          `json:"-"`
}

func (m *GetStatusResponse) Reset()         { *m = GetStatusResponse{} }
func (m *GetStatusResponse) String() string { return proto.CompactTextString(m) }
func (*GetStatusResponse) ProtoMessage()    {}
func (*GetStatusResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_8571034d60397816, []int{7}
}

func (m *GetStatusResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetStatusResponse.Unmarshal(m, b)
}
func (m *GetStatusResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetStatusResponse.Marshal(b, m, deterministic)
}
func (m *GetStatusResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetStatusResponse.Merge(m, src)
}
func (m *GetStatusResponse) XXX_Size() int {
	return xxx_messageInfo_GetStatusResponse.Size(m)
}
func (m *GetStatusResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_GetStatusResponse.DiscardUnknown(m)
}

var xxx_messageInfo_GetStatusResponse proto.InternalMessageInfo

func (m *GetStatusResponse) GetNetworkStatus() *NetworkStatus {
	if m != nil {
		return m.NetworkStatus
	}
	return nil
}

// 网络设备信息
type NetworkDeviceInfo struct {
	// wifi名
	// 5G网络名为(2.4G)-5G
	Ssid string `protobuf:"bytes,1,opt,name=ssid,proto3" json:"ssid,omitempty"`
	// 密码
	Credential           string   `protobuf:"bytes,2,opt,name=credential,proto3" json:"credential,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *NetworkDeviceInfo) Reset()         { *m = NetworkDeviceInfo{} }
func (m *NetworkDeviceInfo) String() string { return proto.CompactTextString(m) }
func (*NetworkDeviceInfo) ProtoMessage()    {}
func (*NetworkDeviceInfo) Descriptor() ([]byte, []int) {
	return fileDescriptor_8571034d60397816, []int{8}
}

func (m *NetworkDeviceInfo) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_NetworkDeviceInfo.Unmarshal(m, b)
}
func (m *NetworkDeviceInfo) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_NetworkDeviceInfo.Marshal(b, m, deterministic)
}
func (m *NetworkDeviceInfo) XXX_Merge(src proto.Message) {
	xxx_messageInfo_NetworkDeviceInfo.Merge(m, src)
}
func (m *NetworkDeviceInfo) XXX_Size() int {
	return xxx_messageInfo_NetworkDeviceInfo.Size(m)
}
func (m *NetworkDeviceInfo) XXX_DiscardUnknown() {
	xxx_messageInfo_NetworkDeviceInfo.DiscardUnknown(m)
}

var xxx_messageInfo_NetworkDeviceInfo proto.InternalMessageInfo

func (m *NetworkDeviceInfo) GetSsid() string {
	if m != nil {
		return m.Ssid
	}
	return ""
}

func (m *NetworkDeviceInfo) GetCredential() string {
	if m != nil {
		return m.Credential
	}
	return ""
}

// 获取网络设备相关信息请求
type GetNetworkDeviceInfoRequest struct {
	// 是否获取密码
	WithCredential       bool     `protobuf:"varint,1,opt,name=with_credential,json=withCredential,proto3" json:"with_credential,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetNetworkDeviceInfoRequest) Reset()         { *m = GetNetworkDeviceInfoRequest{} }
func (m *GetNetworkDeviceInfoRequest) String() string { return proto.CompactTextString(m) }
func (*GetNetworkDeviceInfoRequest) ProtoMessage()    {}
func (*GetNetworkDeviceInfoRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_8571034d60397816, []int{9}
}

func (m *GetNetworkDeviceInfoRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetNetworkDeviceInfoRequest.Unmarshal(m, b)
}
func (m *GetNetworkDeviceInfoRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetNetworkDeviceInfoRequest.Marshal(b, m, deterministic)
}
func (m *GetNetworkDeviceInfoRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetNetworkDeviceInfoRequest.Merge(m, src)
}
func (m *GetNetworkDeviceInfoRequest) XXX_Size() int {
	return xxx_messageInfo_GetNetworkDeviceInfoRequest.Size(m)
}
func (m *GetNetworkDeviceInfoRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_GetNetworkDeviceInfoRequest.DiscardUnknown(m)
}

var xxx_messageInfo_GetNetworkDeviceInfoRequest proto.InternalMessageInfo

func (m *GetNetworkDeviceInfoRequest) GetWithCredential() bool {
	if m != nil {
		return m.WithCredential
	}
	return false
}

// 获取网络设备相关信息结果
type GetNetworkDeviceInfoResponse struct {
	// 网络设备信息
	NetworkDeviceInfo    *NetworkDeviceInfo `protobuf:"bytes,1,opt,name=network_device_info,json=networkDeviceInfo,proto3" json:"network_device_info,omitempty"`
	XXX_NoUnkeyedLiteral struct{}           `json:"-"`
	XXX_unrecognized     []byte             `json:"-"`
	XXX_sizecache        int32              `json:"-"`
}

func (m *GetNetworkDeviceInfoResponse) Reset()         { *m = GetNetworkDeviceInfoResponse{} }
func (m *GetNetworkDeviceInfoResponse) String() string { return proto.CompactTextString(m) }
func (*GetNetworkDeviceInfoResponse) ProtoMessage()    {}
func (*GetNetworkDeviceInfoResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_8571034d60397816, []int{10}
}

func (m *GetNetworkDeviceInfoResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetNetworkDeviceInfoResponse.Unmarshal(m, b)
}
func (m *GetNetworkDeviceInfoResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetNetworkDeviceInfoResponse.Marshal(b, m, deterministic)
}
func (m *GetNetworkDeviceInfoResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetNetworkDeviceInfoResponse.Merge(m, src)
}
func (m *GetNetworkDeviceInfoResponse) XXX_Size() int {
	return xxx_messageInfo_GetNetworkDeviceInfoResponse.Size(m)
}
func (m *GetNetworkDeviceInfoResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_GetNetworkDeviceInfoResponse.DiscardUnknown(m)
}

var xxx_messageInfo_GetNetworkDeviceInfoResponse proto.InternalMessageInfo

func (m *GetNetworkDeviceInfoResponse) GetNetworkDeviceInfo() *NetworkDeviceInfo {
	if m != nil {
		return m.NetworkDeviceInfo
	}
	return nil
}

// 修改网络设备相关信息请求
type UpdateNetworkDeviceInfoRequest struct {
	// 网络设备信息
	// NetworkInfo中留空为不更新
	NetworkDeviceInfo    *NetworkDeviceInfo `protobuf:"bytes,1,opt,name=network_device_info,json=networkDeviceInfo,proto3" json:"network_device_info,omitempty"`
	XXX_NoUnkeyedLiteral struct{}           `json:"-"`
	XXX_unrecognized     []byte             `json:"-"`
	XXX_sizecache        int32              `json:"-"`
}

func (m *UpdateNetworkDeviceInfoRequest) Reset()         { *m = UpdateNetworkDeviceInfoRequest{} }
func (m *UpdateNetworkDeviceInfoRequest) String() string { return proto.CompactTextString(m) }
func (*UpdateNetworkDeviceInfoRequest) ProtoMessage()    {}
func (*UpdateNetworkDeviceInfoRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_8571034d60397816, []int{11}
}

func (m *UpdateNetworkDeviceInfoRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_UpdateNetworkDeviceInfoRequest.Unmarshal(m, b)
}
func (m *UpdateNetworkDeviceInfoRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_UpdateNetworkDeviceInfoRequest.Marshal(b, m, deterministic)
}
func (m *UpdateNetworkDeviceInfoRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_UpdateNetworkDeviceInfoRequest.Merge(m, src)
}
func (m *UpdateNetworkDeviceInfoRequest) XXX_Size() int {
	return xxx_messageInfo_UpdateNetworkDeviceInfoRequest.Size(m)
}
func (m *UpdateNetworkDeviceInfoRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_UpdateNetworkDeviceInfoRequest.DiscardUnknown(m)
}

var xxx_messageInfo_UpdateNetworkDeviceInfoRequest proto.InternalMessageInfo

func (m *UpdateNetworkDeviceInfoRequest) GetNetworkDeviceInfo() *NetworkDeviceInfo {
	if m != nil {
		return m.NetworkDeviceInfo
	}
	return nil
}

// 修改网络设备相关信息结果
type UpdateNetworkDeviceInfoResponse struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *UpdateNetworkDeviceInfoResponse) Reset()         { *m = UpdateNetworkDeviceInfoResponse{} }
func (m *UpdateNetworkDeviceInfoResponse) String() string { return proto.CompactTextString(m) }
func (*UpdateNetworkDeviceInfoResponse) ProtoMessage()    {}
func (*UpdateNetworkDeviceInfoResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_8571034d60397816, []int{12}
}

func (m *UpdateNetworkDeviceInfoResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_UpdateNetworkDeviceInfoResponse.Unmarshal(m, b)
}
func (m *UpdateNetworkDeviceInfoResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_UpdateNetworkDeviceInfoResponse.Marshal(b, m, deterministic)
}
func (m *UpdateNetworkDeviceInfoResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_UpdateNetworkDeviceInfoResponse.Merge(m, src)
}
func (m *UpdateNetworkDeviceInfoResponse) XXX_Size() int {
	return xxx_messageInfo_UpdateNetworkDeviceInfoResponse.Size(m)
}
func (m *UpdateNetworkDeviceInfoResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_UpdateNetworkDeviceInfoResponse.DiscardUnknown(m)
}

var xxx_messageInfo_UpdateNetworkDeviceInfoResponse proto.InternalMessageInfo

func init() {
	proto.RegisterEnum("networkService.Status", Status_name, Status_value)
	proto.RegisterType((*NetworkInfo)(nil), "networkService.NetworkInfo")
	proto.RegisterType((*ListNetworksRequest)(nil), "networkService.ListNetworksRequest")
	proto.RegisterType((*ListNetworksResponse)(nil), "networkService.ListNetworksResponse")
	proto.RegisterType((*ConnectRequest)(nil), "networkService.ConnectRequest")
	proto.RegisterType((*NetworkStatus)(nil), "networkService.NetworkStatus")
	proto.RegisterType((*ConnectResponse)(nil), "networkService.ConnectResponse")
	proto.RegisterType((*GetStatusRequest)(nil), "networkService.GetStatusRequest")
	proto.RegisterType((*GetStatusResponse)(nil), "networkService.GetStatusResponse")
	proto.RegisterType((*NetworkDeviceInfo)(nil), "networkService.NetworkDeviceInfo")
	proto.RegisterType((*GetNetworkDeviceInfoRequest)(nil), "networkService.GetNetworkDeviceInfoRequest")
	proto.RegisterType((*GetNetworkDeviceInfoResponse)(nil), "networkService.GetNetworkDeviceInfoResponse")
	proto.RegisterType((*UpdateNetworkDeviceInfoRequest)(nil), "networkService.UpdateNetworkDeviceInfoRequest")
	proto.RegisterType((*UpdateNetworkDeviceInfoResponse)(nil), "networkService.UpdateNetworkDeviceInfoResponse")
}

func init() { proto.RegisterFile("network.proto", fileDescriptor_8571034d60397816) }

var fileDescriptor_8571034d60397816 = []byte{
	// 688 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xb4, 0x55, 0xdf, 0x4f, 0xd3, 0x50,
	0x14, 0xa6, 0x1b, 0x0e, 0x7a, 0xc6, 0x46, 0x77, 0x41, 0x6c, 0x36, 0x81, 0x51, 0x4d, 0x24, 0x6a,
	0xaa, 0x99, 0x3e, 0xf9, 0xa4, 0xdb, 0x60, 0x59, 0x24, 0x45, 0x0b, 0xc4, 0x1f, 0x89, 0x59, 0xba,
	0xf6, 0x12, 0x0a, 0xe3, 0xb6, 0xf4, 0xde, 0xb1, 0x98, 0xf8, 0xec, 0xdf, 0xe4, 0xbf, 0xe0, 0x7f,
	0x65, 0x7a, 0x7b, 0x5b, 0xda, 0xba, 0x22, 0x2f, 0xbe, 0xdd, 0xf3, 0x9d, 0x73, 0xcf, 0x3d, 0xdf,
	0xf9, 0xbe, 0x75, 0x50, 0x23, 0x98, 0xcd, 0xbc, 0xe0, 0x42, 0xf7, 0x03, 0x8f, 0x79, 0xa8, 0x2e,
	0xc2, 0x23, 0x1c, 0x5c, 0xbb, 0x36, 0xd6, 0x2c, 0xa8, 0x1a, 0x11, 0x32, 0x24, 0xa7, 0x1e, 0x42,
	0xb0, 0x48, 0xac, 0x4b, 0xac, 0x4a, 0x6d, 0x69, 0x57, 0x36, 0xf9, 0x19, 0x29, 0x50, 0xbe, 0xb4,
	0x6c, 0xb5, 0xc4, 0xa1, 0xf0, 0x88, 0x54, 0x58, 0xb2, 0xcf, 0x2c, 0x42, 0xf0, 0x44, 0x2d, 0xb7,
	0xa5, 0xdd, 0x9a, 0x19, 0x87, 0xe1, 0xfd, 0x80, 0x52, 0x57, 0x5d, 0xe4, 0x30, 0x3f, 0x6b, 0xf7,
	0x61, 0xed, 0xc0, 0xa5, 0x4c, 0x3c, 0x43, 0x4d, 0x7c, 0x35, 0xc5, 0x94, 0x69, 0x9f, 0x61, 0x3d,
	0x0b, 0x53, 0xdf, 0x23, 0x14, 0xa3, 0xb7, 0xc9, 0xc8, 0x74, 0xe4, 0x92, 0x53, 0x4f, 0x95, 0xda,
	0xe5, 0xdd, 0x6a, 0xa7, 0xa5, 0x67, 0x27, 0xd7, 0x53, 0x63, 0x9b, 0x2b, 0xf1, 0x8d, 0x30, 0xd2,
	0x7e, 0x4b, 0x50, 0xef, 0x79, 0x84, 0x60, 0x9b, 0x89, 0xc7, 0x50, 0x17, 0xe2, 0x92, 0xb8, 0xa7,
	0xf4, 0x8f, 0x9e, 0xdd, 0x92, 0x2a, 0x99, 0x55, 0x92, 0xdd, 0x0d, 0xa5, 0xae, 0xc3, 0x29, 0xcb,
	0x26, 0x3f, 0x87, 0xbb, 0xf1, 0x67, 0x4e, 0xbc, 0x1b, 0x7f, 0xe6, 0xa0, 0x4d, 0x80, 0x0b, 0x8c,
	0xfd, 0x91, 0x35, 0x71, 0xaf, 0x31, 0xdf, 0xc3, 0xb2, 0x29, 0x87, 0xc8, 0xbb, 0x10, 0x40, 0x3a,
	0xac, 0xdd, 0xa4, 0x47, 0x2e, 0x61, 0x38, 0xb8, 0xb6, 0x26, 0xea, 0x3d, 0xbe, 0xaf, 0x46, 0x52,
	0x37, 0x14, 0x09, 0xed, 0x97, 0x04, 0x35, 0x31, 0xd5, 0x11, 0xb3, 0xd8, 0x94, 0x22, 0x1d, 0x2a,
	0x94, 0x9f, 0x38, 0x89, 0x7a, 0x67, 0x23, 0x4f, 0x22, 0xaa, 0x33, 0x45, 0x55, 0x22, 0x69, 0x29,
	0x25, 0x69, 0x0b, 0x64, 0x7f, 0x3a, 0x9e, 0xb8, 0xf6, 0xc8, 0xf5, 0x05, 0x9f, 0xe5, 0x08, 0x18,
	0xfa, 0xf3, 0x34, 0x44, 0x1b, 0x50, 0x99, 0xfa, 0x13, 0xcf, 0x72, 0xc4, 0xa4, 0x22, 0x42, 0x4d,
	0x58, 0x76, 0xbc, 0x19, 0xe1, 0x99, 0x0a, 0xcf, 0x24, 0xb1, 0xd6, 0x80, 0xd5, 0x44, 0x85, 0x48,
	0x5b, 0x0d, 0x81, 0x32, 0xc0, 0x4c, 0x0c, 0x28, 0x7c, 0xf0, 0x05, 0x1a, 0x29, 0x4c, 0x98, 0xa0,
	0x0f, 0xb1, 0x51, 0x47, 0x29, 0xb2, 0xd5, 0xce, 0x66, 0x81, 0x62, 0xe2, 0x7a, 0xec, 0x9c, 0x28,
	0xd4, 0x06, 0xd0, 0x10, 0xf9, 0x3e, 0x0e, 0xab, 0x33, 0x32, 0x4a, 0x29, 0x19, 0xb7, 0x00, 0xec,
	0x00, 0x3b, 0x98, 0x30, 0xd7, 0x9a, 0x88, 0x4d, 0xa5, 0x10, 0x6d, 0x1f, 0x5a, 0x03, 0xcc, 0xfe,
	0xea, 0x15, 0xbb, 0xeb, 0x09, 0xac, 0xce, 0x5c, 0x76, 0x36, 0x4a, 0xf5, 0x90, 0xb8, 0xf0, 0xf5,
	0x10, 0xee, 0xdd, 0xf4, 0xb9, 0x82, 0x87, 0xf3, 0xfb, 0x08, 0xda, 0x1f, 0x61, 0x2d, 0xa6, 0xed,
	0xf0, 0x6c, 0xda, 0xad, 0x3b, 0x05, 0xdc, 0x53, 0x7d, 0x1a, 0x24, 0x0f, 0x69, 0x14, 0xb6, 0x4e,
	0x7c, 0xc7, 0x62, 0xb8, 0x70, 0xfa, 0xff, 0xf0, 0xe8, 0x0e, 0x6c, 0x17, 0x3e, 0x1a, 0x51, 0x7d,
	0xba, 0x0f, 0x15, 0x61, 0xe8, 0x2a, 0x2c, 0x9d, 0x18, 0xef, 0x8d, 0xc3, 0x4f, 0x86, 0xb2, 0x80,
	0x14, 0x58, 0xe9, 0x0f, 0x8f, 0x7a, 0x87, 0x86, 0xb1, 0xd7, 0x3b, 0xde, 0xeb, 0x2b, 0x12, 0xaa,
	0x03, 0x88, 0x70, 0x68, 0x0c, 0x94, 0x12, 0xaa, 0x81, 0x7c, 0x93, 0x2e, 0x77, 0x7e, 0x2e, 0x42,
	0xdd, 0xc8, 0x8c, 0x88, 0xbe, 0xc1, 0x4a, 0xfa, 0xcb, 0x82, 0x1e, 0xe5, 0x39, 0xcc, 0xf9, 0x1c,
	0x35, 0x1f, 0xdf, 0x5e, 0x24, 0x0c, 0xbc, 0xf0, 0x52, 0x42, 0x07, 0xb0, 0x24, 0x7c, 0x8d, 0xb6,
	0xf2, 0x97, 0xb2, 0x9f, 0x9d, 0xe6, 0x76, 0x61, 0x3e, 0xee, 0x87, 0x8e, 0x41, 0x4e, 0xec, 0x8f,
	0xda, 0xf9, 0xfa, 0xfc, 0xaf, 0xa5, 0xb9, 0x73, 0x4b, 0x45, 0x6a, 0x46, 0x0a, 0xeb, 0xf3, 0x8c,
	0x86, 0x9e, 0xcd, 0xb9, 0x5e, 0x64, 0x8c, 0xe6, 0xf3, 0xbb, 0x15, 0x27, 0x54, 0x7e, 0xc0, 0x83,
	0x02, 0xd5, 0x91, 0x9e, 0x6f, 0x75, 0xbb, 0x27, 0x9b, 0x2f, 0xee, 0x5c, 0x1f, 0xbf, 0xde, 0x7d,
	0x03, 0x2d, 0xdb, 0xbb, 0xd4, 0xcf, 0xcf, 0x03, 0x6f, 0xec, 0x31, 0xdd, 0x22, 0xce, 0xf7, 0xd7,
	0x71, 0x17, 0x7f, 0xdc, 0x55, 0xb2, 0x26, 0xf9, 0xd0, 0xfd, 0x2a, 0x27, 0xc9, 0x71, 0x85, 0xff,
	0x39, 0xbe, 0xfa, 0x13, 0x00, 0x00, 0xff, 0xff, 0x7d, 0x9b, 0x76, 0xe0, 0x2d, 0x07, 0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConnInterface

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion6

// NetworkServiceClient is the client API for NetworkService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type NetworkServiceClient interface {
	// ListNetworks 扫描附近无线信息
	//
	// 此方法在同一扫描时刻中为单例
	//
	// 360路由设备：
	//    由于持续扫描可能造成内部网络的断流，因此该类型路由不会进行后续的自动持续扫描，
	//    但持续监听支持后续新请求结果的同步返回
	ListNetworks(ctx context.Context, in *ListNetworksRequest, opts ...grpc.CallOption) (NetworkService_ListNetworksClient, error)
	// Connect 路由设备连接无线网络
	//
	// 连接失败将立即返回错误
	// 若30秒后成功获取状态将返回超时失败
	Connect(ctx context.Context, in *ConnectRequest, opts ...grpc.CallOption) (*ConnectResponse, error)
	// GetStatus 获取路由连接状态
	GetStatus(ctx context.Context, in *GetStatusRequest, opts ...grpc.CallOption) (NetworkService_GetStatusClient, error)
	// GetNetworkDeviceInfo 获取路由设备相关信息
	GetNetworkDeviceInfo(ctx context.Context, in *GetNetworkDeviceInfoRequest, opts ...grpc.CallOption) (*GetNetworkDeviceInfoResponse, error)
	// UpdateNetworkDeviceInfo 修改网络设备相关信息
	UpdateNetworkDeviceInfo(ctx context.Context, in *UpdateNetworkDeviceInfoRequest, opts ...grpc.CallOption) (*UpdateNetworkDeviceInfoResponse, error)
}

type networkServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewNetworkServiceClient(cc grpc.ClientConnInterface) NetworkServiceClient {
	return &networkServiceClient{cc}
}

func (c *networkServiceClient) ListNetworks(ctx context.Context, in *ListNetworksRequest, opts ...grpc.CallOption) (NetworkService_ListNetworksClient, error) {
	stream, err := c.cc.NewStream(ctx, &_NetworkService_serviceDesc.Streams[0], "/networkService.NetworkService/ListNetworks", opts...)
	if err != nil {
		return nil, err
	}
	x := &networkServiceListNetworksClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type NetworkService_ListNetworksClient interface {
	Recv() (*ListNetworksResponse, error)
	grpc.ClientStream
}

type networkServiceListNetworksClient struct {
	grpc.ClientStream
}

func (x *networkServiceListNetworksClient) Recv() (*ListNetworksResponse, error) {
	m := new(ListNetworksResponse)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *networkServiceClient) Connect(ctx context.Context, in *ConnectRequest, opts ...grpc.CallOption) (*ConnectResponse, error) {
	out := new(ConnectResponse)
	err := c.cc.Invoke(ctx, "/networkService.NetworkService/Connect", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *networkServiceClient) GetStatus(ctx context.Context, in *GetStatusRequest, opts ...grpc.CallOption) (NetworkService_GetStatusClient, error) {
	stream, err := c.cc.NewStream(ctx, &_NetworkService_serviceDesc.Streams[1], "/networkService.NetworkService/GetStatus", opts...)
	if err != nil {
		return nil, err
	}
	x := &networkServiceGetStatusClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type NetworkService_GetStatusClient interface {
	Recv() (*GetStatusResponse, error)
	grpc.ClientStream
}

type networkServiceGetStatusClient struct {
	grpc.ClientStream
}

func (x *networkServiceGetStatusClient) Recv() (*GetStatusResponse, error) {
	m := new(GetStatusResponse)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *networkServiceClient) GetNetworkDeviceInfo(ctx context.Context, in *GetNetworkDeviceInfoRequest, opts ...grpc.CallOption) (*GetNetworkDeviceInfoResponse, error) {
	out := new(GetNetworkDeviceInfoResponse)
	err := c.cc.Invoke(ctx, "/networkService.NetworkService/GetNetworkDeviceInfo", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *networkServiceClient) UpdateNetworkDeviceInfo(ctx context.Context, in *UpdateNetworkDeviceInfoRequest, opts ...grpc.CallOption) (*UpdateNetworkDeviceInfoResponse, error) {
	out := new(UpdateNetworkDeviceInfoResponse)
	err := c.cc.Invoke(ctx, "/networkService.NetworkService/UpdateNetworkDeviceInfo", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// NetworkServiceServer is the server API for NetworkService service.
type NetworkServiceServer interface {
	// ListNetworks 扫描附近无线信息
	//
	// 此方法在同一扫描时刻中为单例
	//
	// 360路由设备：
	//    由于持续扫描可能造成内部网络的断流，因此该类型路由不会进行后续的自动持续扫描，
	//    但持续监听支持后续新请求结果的同步返回
	ListNetworks(*ListNetworksRequest, NetworkService_ListNetworksServer) error
	// Connect 路由设备连接无线网络
	//
	// 连接失败将立即返回错误
	// 若30秒后成功获取状态将返回超时失败
	Connect(context.Context, *ConnectRequest) (*ConnectResponse, error)
	// GetStatus 获取路由连接状态
	GetStatus(*GetStatusRequest, NetworkService_GetStatusServer) error
	// GetNetworkDeviceInfo 获取路由设备相关信息
	GetNetworkDeviceInfo(context.Context, *GetNetworkDeviceInfoRequest) (*GetNetworkDeviceInfoResponse, error)
	// UpdateNetworkDeviceInfo 修改网络设备相关信息
	UpdateNetworkDeviceInfo(context.Context, *UpdateNetworkDeviceInfoRequest) (*UpdateNetworkDeviceInfoResponse, error)
}

// UnimplementedNetworkServiceServer can be embedded to have forward compatible implementations.
type UnimplementedNetworkServiceServer struct {
}

func (*UnimplementedNetworkServiceServer) ListNetworks(req *ListNetworksRequest, srv NetworkService_ListNetworksServer) error {
	return status.Errorf(codes.Unimplemented, "method ListNetworks not implemented")
}
func (*UnimplementedNetworkServiceServer) Connect(ctx context.Context, req *ConnectRequest) (*ConnectResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Connect not implemented")
}
func (*UnimplementedNetworkServiceServer) GetStatus(req *GetStatusRequest, srv NetworkService_GetStatusServer) error {
	return status.Errorf(codes.Unimplemented, "method GetStatus not implemented")
}
func (*UnimplementedNetworkServiceServer) GetNetworkDeviceInfo(ctx context.Context, req *GetNetworkDeviceInfoRequest) (*GetNetworkDeviceInfoResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetNetworkDeviceInfo not implemented")
}
func (*UnimplementedNetworkServiceServer) UpdateNetworkDeviceInfo(ctx context.Context, req *UpdateNetworkDeviceInfoRequest) (*UpdateNetworkDeviceInfoResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateNetworkDeviceInfo not implemented")
}

func RegisterNetworkServiceServer(s *grpc.Server, srv NetworkServiceServer) {
	s.RegisterService(&_NetworkService_serviceDesc, srv)
}

func _NetworkService_ListNetworks_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(ListNetworksRequest)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(NetworkServiceServer).ListNetworks(m, &networkServiceListNetworksServer{stream})
}

type NetworkService_ListNetworksServer interface {
	Send(*ListNetworksResponse) error
	grpc.ServerStream
}

type networkServiceListNetworksServer struct {
	grpc.ServerStream
}

func (x *networkServiceListNetworksServer) Send(m *ListNetworksResponse) error {
	return x.ServerStream.SendMsg(m)
}

func _NetworkService_Connect_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ConnectRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NetworkServiceServer).Connect(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/networkService.NetworkService/Connect",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NetworkServiceServer).Connect(ctx, req.(*ConnectRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _NetworkService_GetStatus_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(GetStatusRequest)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(NetworkServiceServer).GetStatus(m, &networkServiceGetStatusServer{stream})
}

type NetworkService_GetStatusServer interface {
	Send(*GetStatusResponse) error
	grpc.ServerStream
}

type networkServiceGetStatusServer struct {
	grpc.ServerStream
}

func (x *networkServiceGetStatusServer) Send(m *GetStatusResponse) error {
	return x.ServerStream.SendMsg(m)
}

func _NetworkService_GetNetworkDeviceInfo_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetNetworkDeviceInfoRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NetworkServiceServer).GetNetworkDeviceInfo(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/networkService.NetworkService/GetNetworkDeviceInfo",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NetworkServiceServer).GetNetworkDeviceInfo(ctx, req.(*GetNetworkDeviceInfoRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _NetworkService_UpdateNetworkDeviceInfo_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateNetworkDeviceInfoRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NetworkServiceServer).UpdateNetworkDeviceInfo(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/networkService.NetworkService/UpdateNetworkDeviceInfo",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NetworkServiceServer).UpdateNetworkDeviceInfo(ctx, req.(*UpdateNetworkDeviceInfoRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _NetworkService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "networkService.NetworkService",
	HandlerType: (*NetworkServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Connect",
			Handler:    _NetworkService_Connect_Handler,
		},
		{
			MethodName: "GetNetworkDeviceInfo",
			Handler:    _NetworkService_GetNetworkDeviceInfo_Handler,
		},
		{
			MethodName: "UpdateNetworkDeviceInfo",
			Handler:    _NetworkService_UpdateNetworkDeviceInfo_Handler,
		},
	},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "ListNetworks",
			Handler:       _NetworkService_ListNetworks_Handler,
			ServerStreams: true,
		},
		{
			StreamName:    "GetStatus",
			Handler:       _NetworkService_GetStatus_Handler,
			ServerStreams: true,
		},
	},
	Metadata: "network.proto",
}