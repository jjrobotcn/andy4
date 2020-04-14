<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: nav.proto

namespace NavService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * 导航目标信息
 * 判断顺序为index>name
 *
 * Generated from protobuf message <code>navService.NavTarget</code>
 */
class NavTarget extends \Google\Protobuf\Internal\Message
{
    /**
     * 激活线路中线路点序号
     *
     * Generated from protobuf field <code>string index = 1;</code>
     */
    private $index = '';
    /**
     * 激活线路中线路点名
     *
     * Generated from protobuf field <code>string name = 2;</code>
     */
    private $name = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $index
     *           激活线路中线路点序号
     *     @type string $name
     *           激活线路中线路点名
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Nav::initOnce();
        parent::__construct($data);
    }

    /**
     * 激活线路中线路点序号
     *
     * Generated from protobuf field <code>string index = 1;</code>
     * @return string
     */
    public function getIndex()
    {
        return $this->index;
    }

    /**
     * 激活线路中线路点序号
     *
     * Generated from protobuf field <code>string index = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setIndex($var)
    {
        GPBUtil::checkString($var, True);
        $this->index = $var;

        return $this;
    }

    /**
     * 激活线路中线路点名
     *
     * Generated from protobuf field <code>string name = 2;</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * 激活线路中线路点名
     *
     * Generated from protobuf field <code>string name = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setName($var)
    {
        GPBUtil::checkString($var, True);
        $this->name = $var;

        return $this;
    }

}

