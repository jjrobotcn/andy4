<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: nav.proto

namespace NavService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * 线路点数据
 *
 * Generated from protobuf message <code>navService.RoutePoint</code>
 */
class RoutePoint extends \Google\Protobuf\Internal\Message
{
    /**
     * 线路点名 创建时若为空将生成随机名
     *
     * Generated from protobuf field <code>string name = 1;</code>
     */
    private $name = '';
    /**
     * 线路点角度
     *
     * Generated from protobuf field <code>uint32 rotate = 2;</code>
     */
    private $rotate = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $name
     *           线路点名 创建时若为空将生成随机名
     *     @type int $rotate
     *           线路点角度
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Nav::initOnce();
        parent::__construct($data);
    }

    /**
     * 线路点名 创建时若为空将生成随机名
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * 线路点名 创建时若为空将生成随机名
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setName($var)
    {
        GPBUtil::checkString($var, True);
        $this->name = $var;

        return $this;
    }

    /**
     * 线路点角度
     *
     * Generated from protobuf field <code>uint32 rotate = 2;</code>
     * @return int
     */
    public function getRotate()
    {
        return $this->rotate;
    }

    /**
     * 线路点角度
     *
     * Generated from protobuf field <code>uint32 rotate = 2;</code>
     * @param int $var
     * @return $this
     */
    public function setRotate($var)
    {
        GPBUtil::checkUint32($var);
        $this->rotate = $var;

        return $this;
    }

}

