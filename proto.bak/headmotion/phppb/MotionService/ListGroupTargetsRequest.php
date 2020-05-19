<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: headmotion.proto

namespace MotionService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;
use Google\Protobuf\Internal\GPBWrapperUtils;

/**
 * 获取组动作点列表请求
 *
 * Generated from protobuf message <code>motionService.ListGroupTargetsRequest</code>
 */
class ListGroupTargetsRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * 组id
     *
     * Generated from protobuf field <code>string group_id = 1;</code>
     */
    private $group_id = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $group_id
     *           组id
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Headmotion::initOnce();
        parent::__construct($data);
    }

    /**
     * 组id
     *
     * Generated from protobuf field <code>string group_id = 1;</code>
     * @return string
     */
    public function getGroupId()
    {
        return $this->group_id;
    }

    /**
     * 组id
     *
     * Generated from protobuf field <code>string group_id = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setGroupId($var)
    {
        GPBUtil::checkString($var, True);
        $this->group_id = $var;

        return $this;
    }

}
