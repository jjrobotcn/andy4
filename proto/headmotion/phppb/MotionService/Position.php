<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: headmotion.proto

namespace MotionService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;
use Google\Protobuf\Internal\GPBWrapperUtils;

/**
 * 位置坐标定义
 * 0值为默认居中
 *
 * Generated from protobuf message <code>motionService.Position</code>
 */
class Position extends \Google\Protobuf\Internal\Message
{
    /**
     * x轴位置
     * 正负值, 左值为负
     *
     * Generated from protobuf field <code>int32 x_axis = 1;</code>
     */
    private $x_axis = 0;
    /**
     * y轴位置
     * 正负值, 底值为负
     *
     * Generated from protobuf field <code>int32 y_axis = 2;</code>
     */
    private $y_axis = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $x_axis
     *           x轴位置
     *           正负值, 左值为负
     *     @type int $y_axis
     *           y轴位置
     *           正负值, 底值为负
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Headmotion::initOnce();
        parent::__construct($data);
    }

    /**
     * x轴位置
     * 正负值, 左值为负
     *
     * Generated from protobuf field <code>int32 x_axis = 1;</code>
     * @return int
     */
    public function getXAxis()
    {
        return $this->x_axis;
    }

    /**
     * x轴位置
     * 正负值, 左值为负
     *
     * Generated from protobuf field <code>int32 x_axis = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setXAxis($var)
    {
        GPBUtil::checkInt32($var);
        $this->x_axis = $var;

        return $this;
    }

    /**
     * y轴位置
     * 正负值, 底值为负
     *
     * Generated from protobuf field <code>int32 y_axis = 2;</code>
     * @return int
     */
    public function getYAxis()
    {
        return $this->y_axis;
    }

    /**
     * y轴位置
     * 正负值, 底值为负
     *
     * Generated from protobuf field <code>int32 y_axis = 2;</code>
     * @param int $var
     * @return $this
     */
    public function setYAxis($var)
    {
        GPBUtil::checkInt32($var);
        $this->y_axis = $var;

        return $this;
    }

}
