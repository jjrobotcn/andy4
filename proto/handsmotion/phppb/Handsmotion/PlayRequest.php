<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: player.proto

namespace Handsmotion;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>handsmotion.PlayRequest</code>
 */
class PlayRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * 手臂动作
     * 支持通过id或名称任意一值
     *
     * Generated from protobuf field <code>.handsmotion.MotionMeta motion = 1;</code>
     */
    private $motion = null;
    /**
     * 同步标识
     * true: 等待动作完成时返回
     * false: 动作开始执行时立即返回
     *
     * Generated from protobuf field <code>bool sync_mode = 2;</code>
     */
    private $sync_mode = false;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Handsmotion\MotionMeta $motion
     *           手臂动作
     *           支持通过id或名称任意一值
     *     @type bool $sync_mode
     *           同步标识
     *           true: 等待动作完成时返回
     *           false: 动作开始执行时立即返回
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Player::initOnce();
        parent::__construct($data);
    }

    /**
     * 手臂动作
     * 支持通过id或名称任意一值
     *
     * Generated from protobuf field <code>.handsmotion.MotionMeta motion = 1;</code>
     * @return \Handsmotion\MotionMeta
     */
    public function getMotion()
    {
        return $this->motion;
    }

    /**
     * 手臂动作
     * 支持通过id或名称任意一值
     *
     * Generated from protobuf field <code>.handsmotion.MotionMeta motion = 1;</code>
     * @param \Handsmotion\MotionMeta $var
     * @return $this
     */
    public function setMotion($var)
    {
        GPBUtil::checkMessage($var, \Handsmotion\MotionMeta::class);
        $this->motion = $var;

        return $this;
    }

    /**
     * 同步标识
     * true: 等待动作完成时返回
     * false: 动作开始执行时立即返回
     *
     * Generated from protobuf field <code>bool sync_mode = 2;</code>
     * @return bool
     */
    public function getSyncMode()
    {
        return $this->sync_mode;
    }

    /**
     * 同步标识
     * true: 等待动作完成时返回
     * false: 动作开始执行时立即返回
     *
     * Generated from protobuf field <code>bool sync_mode = 2;</code>
     * @param bool $var
     * @return $this
     */
    public function setSyncMode($var)
    {
        GPBUtil::checkBool($var);
        $this->sync_mode = $var;

        return $this;
    }

}

