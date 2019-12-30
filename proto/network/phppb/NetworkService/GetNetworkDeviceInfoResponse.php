<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: network.proto

namespace NetworkService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * 获取网络设备相关信息结果
 *
 * Generated from protobuf message <code>networkService.GetNetworkDeviceInfoResponse</code>
 */
class GetNetworkDeviceInfoResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * 网络设备信息
     *
     * Generated from protobuf field <code>.networkService.NetworkDeviceInfo network_device_info = 1;</code>
     */
    private $network_device_info = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \NetworkService\NetworkDeviceInfo $network_device_info
     *           网络设备信息
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Network::initOnce();
        parent::__construct($data);
    }

    /**
     * 网络设备信息
     *
     * Generated from protobuf field <code>.networkService.NetworkDeviceInfo network_device_info = 1;</code>
     * @return \NetworkService\NetworkDeviceInfo
     */
    public function getNetworkDeviceInfo()
    {
        return $this->network_device_info;
    }

    /**
     * 网络设备信息
     *
     * Generated from protobuf field <code>.networkService.NetworkDeviceInfo network_device_info = 1;</code>
     * @param \NetworkService\NetworkDeviceInfo $var
     * @return $this
     */
    public function setNetworkDeviceInfo($var)
    {
        GPBUtil::checkMessage($var, \NetworkService\NetworkDeviceInfo::class);
        $this->network_device_info = $var;

        return $this;
    }

}

