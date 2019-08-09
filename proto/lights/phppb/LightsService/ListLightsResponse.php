<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: lights.proto

namespace LightsService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;
use Google\Protobuf\Internal\GPBWrapperUtils;

/**
 * 获取灯光数据结果
 *
 * Generated from protobuf message <code>lightsService.ListLightsResponse</code>
 */
class ListLightsResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * 灯光数据明细列表
     *
     * Generated from protobuf field <code>repeated .lightsService.LightInfo lights_info = 1;</code>
     */
    private $lights_info;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \LightsService\LightInfo[]|\Google\Protobuf\Internal\RepeatedField $lights_info
     *           灯光数据明细列表
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Lights::initOnce();
        parent::__construct($data);
    }

    /**
     * 灯光数据明细列表
     *
     * Generated from protobuf field <code>repeated .lightsService.LightInfo lights_info = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getLightsInfo()
    {
        return $this->lights_info;
    }

    /**
     * 灯光数据明细列表
     *
     * Generated from protobuf field <code>repeated .lightsService.LightInfo lights_info = 1;</code>
     * @param \LightsService\LightInfo[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setLightsInfo($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \LightsService\LightInfo::class);
        $this->lights_info = $arr;

        return $this;
    }

}

