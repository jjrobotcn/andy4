<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: lights.proto

namespace LightsService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;
use Google\Protobuf\Internal\GPBWrapperUtils;

/**
 * 删除灯光请求
 *
 * Generated from protobuf message <code>lightsService.DeleteLightsRequest</code>
 */
class DeleteLightsRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * 删除灯光id列表
     *
     * Generated from protobuf field <code>repeated string lights_id = 1;</code>
     */
    private $lights_id;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string[]|\Google\Protobuf\Internal\RepeatedField $lights_id
     *           删除灯光id列表
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Lights::initOnce();
        parent::__construct($data);
    }

    /**
     * 删除灯光id列表
     *
     * Generated from protobuf field <code>repeated string lights_id = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getLightsId()
    {
        return $this->lights_id;
    }

    /**
     * 删除灯光id列表
     *
     * Generated from protobuf field <code>repeated string lights_id = 1;</code>
     * @param string[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setLightsId($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->lights_id = $arr;

        return $this;
    }

}

