<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: headmotion.proto

namespace MotionService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;
use Google\Protobuf\Internal\GPBWrapperUtils;

/**
 * 组目标请求
 *
 * Generated from protobuf message <code>motionService.GroupTargetRequest</code>
 */
class GroupTargetRequest extends \Google\Protobuf\Internal\Message
{
    protected $group_id_name_oneof;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $id
     *           组id
     *           GroupInfo.id
     *     @type string $name
     *           组名
     *           GroupInfo.name
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Headmotion::initOnce();
        parent::__construct($data);
    }

    /**
     * 组id
     * GroupInfo.id
     *
     * Generated from protobuf field <code>string id = 1;</code>
     * @return string
     */
    public function getId()
    {
        return $this->readOneof(1);
    }

    /**
     * 组id
     * GroupInfo.id
     *
     * Generated from protobuf field <code>string id = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setId($var)
    {
        GPBUtil::checkString($var, True);
        $this->writeOneof(1, $var);

        return $this;
    }

    /**
     * 组名
     * GroupInfo.name
     *
     * Generated from protobuf field <code>string name = 2;</code>
     * @return string
     */
    public function getName()
    {
        return $this->readOneof(2);
    }

    /**
     * 组名
     * GroupInfo.name
     *
     * Generated from protobuf field <code>string name = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setName($var)
    {
        GPBUtil::checkString($var, True);
        $this->writeOneof(2, $var);

        return $this;
    }

    /**
     * @return string
     */
    public function getGroupIdNameOneof()
    {
        return $this->whichOneof("group_id_name_oneof");
    }

}
