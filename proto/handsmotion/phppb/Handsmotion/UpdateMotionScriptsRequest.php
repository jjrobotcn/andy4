<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: group.proto

namespace Handsmotion;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>handsmotion.UpdateMotionScriptsRequest</code>
 */
class UpdateMotionScriptsRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string id = 1;</code>
     */
    private $id = '';
    /**
     * Generated from protobuf field <code>repeated .handsmotion.MovementScript scripts = 2;</code>
     */
    private $scripts;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $id
     *     @type \Handsmotion\MovementScript[]|\Google\Protobuf\Internal\RepeatedField $scripts
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Group::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string id = 1;</code>
     * @return string
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * Generated from protobuf field <code>string id = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setId($var)
    {
        GPBUtil::checkString($var, True);
        $this->id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>repeated .handsmotion.MovementScript scripts = 2;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getScripts()
    {
        return $this->scripts;
    }

    /**
     * Generated from protobuf field <code>repeated .handsmotion.MovementScript scripts = 2;</code>
     * @param \Handsmotion\MovementScript[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setScripts($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Handsmotion\MovementScript::class);
        $this->scripts = $arr;

        return $this;
    }

}

