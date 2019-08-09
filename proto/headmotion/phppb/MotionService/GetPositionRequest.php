<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: headmotion.proto

namespace MotionService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;
use Google\Protobuf\Internal\GPBWrapperUtils;

/**
 * 获取当前位置信息请求
 *
 * Generated from protobuf message <code>motionService.GetPositionRequest</code>
 */
class GetPositionRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.motionService.MotionType motion_type = 1;</code>
     */
    private $motion_type = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $motion_type
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Headmotion::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.motionService.MotionType motion_type = 1;</code>
     * @return int
     */
    public function getMotionType()
    {
        return $this->motion_type;
    }

    /**
     * Generated from protobuf field <code>.motionService.MotionType motion_type = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setMotionType($var)
    {
        GPBUtil::checkEnum($var, \MotionService\MotionType::class);
        $this->motion_type = $var;

        return $this;
    }

}

