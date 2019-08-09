<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: network.proto

namespace NetworkService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;
use Google\Protobuf\Internal\GPBWrapperUtils;

/**
 * 获取连接状态流结果
 *
 * Generated from protobuf message <code>networkService.GetStatusResponse</code>
 */
class GetStatusResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * 网络状态
     *
     * Generated from protobuf field <code>.networkService.NetworkStatus network_status = 1;</code>
     */
    private $network_status = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \NetworkService\NetworkStatus $network_status
     *           网络状态
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Network::initOnce();
        parent::__construct($data);
    }

    /**
     * 网络状态
     *
     * Generated from protobuf field <code>.networkService.NetworkStatus network_status = 1;</code>
     * @return \NetworkService\NetworkStatus
     */
    public function getNetworkStatus()
    {
        return $this->network_status;
    }

    /**
     * 网络状态
     *
     * Generated from protobuf field <code>.networkService.NetworkStatus network_status = 1;</code>
     * @param \NetworkService\NetworkStatus $var
     * @return $this
     */
    public function setNetworkStatus($var)
    {
        GPBUtil::checkMessage($var, \NetworkService\NetworkStatus::class);
        $this->network_status = $var;

        return $this;
    }

}

