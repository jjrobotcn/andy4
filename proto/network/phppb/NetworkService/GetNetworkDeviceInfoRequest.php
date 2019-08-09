<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: network.proto

namespace NetworkService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;
use Google\Protobuf\Internal\GPBWrapperUtils;

/**
 * 获取网络设备相关信息请求
 *
 * Generated from protobuf message <code>networkService.GetNetworkDeviceInfoRequest</code>
 */
class GetNetworkDeviceInfoRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * 是否获取密码
     *
     * Generated from protobuf field <code>bool with_credential = 1;</code>
     */
    private $with_credential = false;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type bool $with_credential
     *           是否获取密码
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Network::initOnce();
        parent::__construct($data);
    }

    /**
     * 是否获取密码
     *
     * Generated from protobuf field <code>bool with_credential = 1;</code>
     * @return bool
     */
    public function getWithCredential()
    {
        return $this->with_credential;
    }

    /**
     * 是否获取密码
     *
     * Generated from protobuf field <code>bool with_credential = 1;</code>
     * @param bool $var
     * @return $this
     */
    public function setWithCredential($var)
    {
        GPBUtil::checkBool($var);
        $this->with_credential = $var;

        return $this;
    }

}
