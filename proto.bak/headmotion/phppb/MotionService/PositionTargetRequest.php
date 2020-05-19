<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: headmotion.proto

namespace MotionService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;
use Google\Protobuf\Internal\GPBWrapperUtils;

/**
 * 单点目标请求
 *
 * Generated from protobuf message <code>motionService.PositionTargetRequest</code>
 */
class PositionTargetRequest extends \Google\Protobuf\Internal\Message
{
    protected $position_target_oneof;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \MotionService\Target $absolute_target
     *           绝对值目标
     *     @type \MotionService\Target $relative_target
     *           相对当前点目标
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Headmotion::initOnce();
        parent::__construct($data);
    }

    /**
     * 绝对值目标
     *
     * Generated from protobuf field <code>.motionService.Target absolute_target = 1;</code>
     * @return \MotionService\Target
     */
    public function getAbsoluteTarget()
    {
        return $this->readOneof(1);
    }

    /**
     * 绝对值目标
     *
     * Generated from protobuf field <code>.motionService.Target absolute_target = 1;</code>
     * @param \MotionService\Target $var
     * @return $this
     */
    public function setAbsoluteTarget($var)
    {
        GPBUtil::checkMessage($var, \MotionService\Target::class);
        $this->writeOneof(1, $var);

        return $this;
    }

    /**
     * 相对当前点目标
     *
     * Generated from protobuf field <code>.motionService.Target relative_target = 2;</code>
     * @return \MotionService\Target
     */
    public function getRelativeTarget()
    {
        return $this->readOneof(2);
    }

    /**
     * 相对当前点目标
     *
     * Generated from protobuf field <code>.motionService.Target relative_target = 2;</code>
     * @param \MotionService\Target $var
     * @return $this
     */
    public function setRelativeTarget($var)
    {
        GPBUtil::checkMessage($var, \MotionService\Target::class);
        $this->writeOneof(2, $var);

        return $this;
    }

    /**
     * @return string
     */
    public function getPositionTargetOneof()
    {
        return $this->whichOneof("position_target_oneof");
    }

}
