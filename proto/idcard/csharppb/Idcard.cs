// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: idcard.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace IdCardService {

  /// <summary>Holder for reflection information generated from idcard.proto</summary>
  public static partial class IdcardReflection {

    #region Descriptor
    /// <summary>File descriptor for idcard.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static IdcardReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "CgxpZGNhcmQucHJvdG8SDWlkQ2FyZFNlcnZpY2UiEgoQR2V0SWRJbmZvUmVx",
            "dWVzdCLHAQoGSWRJbmZvEgoKAmlkGAEgASgJEgwKBG5hbWUYAiABKAkSDgoG",
            "Z2VuZGVyGAMgASgJEhAKCG5hdGlvbmFsGAQgASgJEhAKCGJpcnRoZGF5GAUg",
            "ASgJEg8KB2FkZHJlc3MYBiABKAkSGQoRc2lnbl9vcmdhbml6YXRpb24YByAB",
            "KAkSEgoKc3RhcnRfZGF0ZRgIIAEoCRIQCghlbmRfZGF0ZRgJIAEoCRINCgVw",
            "aG90bxgKIAEoDEoECAsQDFIIcmVzZXJ2ZWQiOwoRR2V0SWRJbmZvUmVzcG9u",
            "c2USJgoHaWRfaW5mbxgBIAEoCzIVLmlkQ2FyZFNlcnZpY2UuSWRJbmZvMmMK",
            "DUlEQ2FyZFNlcnZpY2USUgoJR2V0SWRJbmZvEh8uaWRDYXJkU2VydmljZS5H",
            "ZXRJZEluZm9SZXF1ZXN0GiAuaWRDYXJkU2VydmljZS5HZXRJZEluZm9SZXNw",
            "b25zZSIAMAFiBnByb3RvMw=="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { },
          new pbr::GeneratedClrTypeInfo(null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::IdCardService.GetIdInfoRequest), global::IdCardService.GetIdInfoRequest.Parser, null, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::IdCardService.IdInfo), global::IdCardService.IdInfo.Parser, new[]{ "Id", "Name", "Gender", "National", "Birthday", "Address", "SignOrganization", "StartDate", "EndDate", "Photo" }, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::IdCardService.GetIdInfoResponse), global::IdCardService.GetIdInfoResponse.Parser, new[]{ "IdInfo" }, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  /// <summary>
  /// 获取读卡数据流请求
  /// </summary>
  public sealed partial class GetIdInfoRequest : pb::IMessage<GetIdInfoRequest> {
    private static readonly pb::MessageParser<GetIdInfoRequest> _parser = new pb::MessageParser<GetIdInfoRequest>(() => new GetIdInfoRequest());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<GetIdInfoRequest> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::IdCardService.IdcardReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public GetIdInfoRequest() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public GetIdInfoRequest(GetIdInfoRequest other) : this() {
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public GetIdInfoRequest Clone() {
      return new GetIdInfoRequest(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as GetIdInfoRequest);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(GetIdInfoRequest other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void WriteTo(pb::CodedOutputStream output) {
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(GetIdInfoRequest other) {
      if (other == null) {
        return;
      }
      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
        }
      }
    }

  }

  /// <summary>
  /// 身份证数据
  /// </summary>
  public sealed partial class IdInfo : pb::IMessage<IdInfo> {
    private static readonly pb::MessageParser<IdInfo> _parser = new pb::MessageParser<IdInfo>(() => new IdInfo());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<IdInfo> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::IdCardService.IdcardReflection.Descriptor.MessageTypes[1]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public IdInfo() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public IdInfo(IdInfo other) : this() {
      id_ = other.id_;
      name_ = other.name_;
      gender_ = other.gender_;
      national_ = other.national_;
      birthday_ = other.birthday_;
      address_ = other.address_;
      signOrganization_ = other.signOrganization_;
      startDate_ = other.startDate_;
      endDate_ = other.endDate_;
      photo_ = other.photo_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public IdInfo Clone() {
      return new IdInfo(this);
    }

    /// <summary>Field number for the "id" field.</summary>
    public const int IdFieldNumber = 1;
    private string id_ = "";
    /// <summary>
    /// 身份证号
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Id {
      get { return id_; }
      set {
        id_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "name" field.</summary>
    public const int NameFieldNumber = 2;
    private string name_ = "";
    /// <summary>
    /// 姓名
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Name {
      get { return name_; }
      set {
        name_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "gender" field.</summary>
    public const int GenderFieldNumber = 3;
    private string gender_ = "";
    /// <summary>
    /// 性别
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Gender {
      get { return gender_; }
      set {
        gender_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "national" field.</summary>
    public const int NationalFieldNumber = 4;
    private string national_ = "";
    /// <summary>
    /// 民族
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string National {
      get { return national_; }
      set {
        national_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "birthday" field.</summary>
    public const int BirthdayFieldNumber = 5;
    private string birthday_ = "";
    /// <summary>
    /// 出生日期
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Birthday {
      get { return birthday_; }
      set {
        birthday_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "address" field.</summary>
    public const int AddressFieldNumber = 6;
    private string address_ = "";
    /// <summary>
    /// 地址
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Address {
      get { return address_; }
      set {
        address_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "sign_organization" field.</summary>
    public const int SignOrganizationFieldNumber = 7;
    private string signOrganization_ = "";
    /// <summary>
    /// 发证机关
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string SignOrganization {
      get { return signOrganization_; }
      set {
        signOrganization_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "start_date" field.</summary>
    public const int StartDateFieldNumber = 8;
    private string startDate_ = "";
    /// <summary>
    /// 有效期开始日期
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string StartDate {
      get { return startDate_; }
      set {
        startDate_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "end_date" field.</summary>
    public const int EndDateFieldNumber = 9;
    private string endDate_ = "";
    /// <summary>
    /// 有效期截止日期
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string EndDate {
      get { return endDate_; }
      set {
        endDate_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "photo" field.</summary>
    public const int PhotoFieldNumber = 10;
    private pb::ByteString photo_ = pb::ByteString.Empty;
    /// <summary>
    /// 身份证头像图片数据
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pb::ByteString Photo {
      get { return photo_; }
      set {
        photo_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as IdInfo);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(IdInfo other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Id != other.Id) return false;
      if (Name != other.Name) return false;
      if (Gender != other.Gender) return false;
      if (National != other.National) return false;
      if (Birthday != other.Birthday) return false;
      if (Address != other.Address) return false;
      if (SignOrganization != other.SignOrganization) return false;
      if (StartDate != other.StartDate) return false;
      if (EndDate != other.EndDate) return false;
      if (Photo != other.Photo) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (Id.Length != 0) hash ^= Id.GetHashCode();
      if (Name.Length != 0) hash ^= Name.GetHashCode();
      if (Gender.Length != 0) hash ^= Gender.GetHashCode();
      if (National.Length != 0) hash ^= National.GetHashCode();
      if (Birthday.Length != 0) hash ^= Birthday.GetHashCode();
      if (Address.Length != 0) hash ^= Address.GetHashCode();
      if (SignOrganization.Length != 0) hash ^= SignOrganization.GetHashCode();
      if (StartDate.Length != 0) hash ^= StartDate.GetHashCode();
      if (EndDate.Length != 0) hash ^= EndDate.GetHashCode();
      if (Photo.Length != 0) hash ^= Photo.GetHashCode();
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void WriteTo(pb::CodedOutputStream output) {
      if (Id.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(Id);
      }
      if (Name.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(Name);
      }
      if (Gender.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(Gender);
      }
      if (National.Length != 0) {
        output.WriteRawTag(34);
        output.WriteString(National);
      }
      if (Birthday.Length != 0) {
        output.WriteRawTag(42);
        output.WriteString(Birthday);
      }
      if (Address.Length != 0) {
        output.WriteRawTag(50);
        output.WriteString(Address);
      }
      if (SignOrganization.Length != 0) {
        output.WriteRawTag(58);
        output.WriteString(SignOrganization);
      }
      if (StartDate.Length != 0) {
        output.WriteRawTag(66);
        output.WriteString(StartDate);
      }
      if (EndDate.Length != 0) {
        output.WriteRawTag(74);
        output.WriteString(EndDate);
      }
      if (Photo.Length != 0) {
        output.WriteRawTag(82);
        output.WriteBytes(Photo);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (Id.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Id);
      }
      if (Name.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Name);
      }
      if (Gender.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Gender);
      }
      if (National.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(National);
      }
      if (Birthday.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Birthday);
      }
      if (Address.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Address);
      }
      if (SignOrganization.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(SignOrganization);
      }
      if (StartDate.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(StartDate);
      }
      if (EndDate.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(EndDate);
      }
      if (Photo.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeBytesSize(Photo);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(IdInfo other) {
      if (other == null) {
        return;
      }
      if (other.Id.Length != 0) {
        Id = other.Id;
      }
      if (other.Name.Length != 0) {
        Name = other.Name;
      }
      if (other.Gender.Length != 0) {
        Gender = other.Gender;
      }
      if (other.National.Length != 0) {
        National = other.National;
      }
      if (other.Birthday.Length != 0) {
        Birthday = other.Birthday;
      }
      if (other.Address.Length != 0) {
        Address = other.Address;
      }
      if (other.SignOrganization.Length != 0) {
        SignOrganization = other.SignOrganization;
      }
      if (other.StartDate.Length != 0) {
        StartDate = other.StartDate;
      }
      if (other.EndDate.Length != 0) {
        EndDate = other.EndDate;
      }
      if (other.Photo.Length != 0) {
        Photo = other.Photo;
      }
      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 10: {
            Id = input.ReadString();
            break;
          }
          case 18: {
            Name = input.ReadString();
            break;
          }
          case 26: {
            Gender = input.ReadString();
            break;
          }
          case 34: {
            National = input.ReadString();
            break;
          }
          case 42: {
            Birthday = input.ReadString();
            break;
          }
          case 50: {
            Address = input.ReadString();
            break;
          }
          case 58: {
            SignOrganization = input.ReadString();
            break;
          }
          case 66: {
            StartDate = input.ReadString();
            break;
          }
          case 74: {
            EndDate = input.ReadString();
            break;
          }
          case 82: {
            Photo = input.ReadBytes();
            break;
          }
        }
      }
    }

  }

  /// <summary>
  /// 获取读卡数据流结果
  /// </summary>
  public sealed partial class GetIdInfoResponse : pb::IMessage<GetIdInfoResponse> {
    private static readonly pb::MessageParser<GetIdInfoResponse> _parser = new pb::MessageParser<GetIdInfoResponse>(() => new GetIdInfoResponse());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<GetIdInfoResponse> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::IdCardService.IdcardReflection.Descriptor.MessageTypes[2]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public GetIdInfoResponse() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public GetIdInfoResponse(GetIdInfoResponse other) : this() {
      idInfo_ = other.idInfo_ != null ? other.idInfo_.Clone() : null;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public GetIdInfoResponse Clone() {
      return new GetIdInfoResponse(this);
    }

    /// <summary>Field number for the "id_info" field.</summary>
    public const int IdInfoFieldNumber = 1;
    private global::IdCardService.IdInfo idInfo_;
    /// <summary>
    /// 身份证数据
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::IdCardService.IdInfo IdInfo {
      get { return idInfo_; }
      set {
        idInfo_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as GetIdInfoResponse);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(GetIdInfoResponse other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (!object.Equals(IdInfo, other.IdInfo)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (idInfo_ != null) hash ^= IdInfo.GetHashCode();
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void WriteTo(pb::CodedOutputStream output) {
      if (idInfo_ != null) {
        output.WriteRawTag(10);
        output.WriteMessage(IdInfo);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (idInfo_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(IdInfo);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(GetIdInfoResponse other) {
      if (other == null) {
        return;
      }
      if (other.idInfo_ != null) {
        if (idInfo_ == null) {
          IdInfo = new global::IdCardService.IdInfo();
        }
        IdInfo.MergeFrom(other.IdInfo);
      }
      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 10: {
            if (idInfo_ == null) {
              IdInfo = new global::IdCardService.IdInfo();
            }
            input.ReadMessage(IdInfo);
            break;
          }
        }
      }
    }

  }

  #endregion

}

#endregion Designer generated code