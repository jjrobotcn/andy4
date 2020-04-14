<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: nav.proto

namespace NavService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * 导航状态
 *
 * Generated from protobuf message <code>navService.NavToResponse</code>
 */
class NavToResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.navService.StatusCode status_code = 1;</code>
     */
    private $status_code = 0;
    protected $target_oneof;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $status_code
     *     @type \NavService\NavTarget $target
     *           导航请求目标
     *     @type bool $is_roaming
     *           漫游模式
     *     @type \NavService\MapPosition $map_position
     *           地图位置目标
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Nav::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.navService.StatusCode status_code = 1;</code>
     * @return int
     */
    public function getStatusCode()
    {
        return $this->status_code;
    }

    /**
     * Generated from protobuf field <code>.navService.StatusCode status_code = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setStatusCode($var)
    {
        GPBUtil::checkEnum($var, \NavService\StatusCode::class);
        $this->status_code = $var;

        return $this;
    }

    /**
     * 导航请求目标
     *
     * Generated from protobuf field <code>.navService.NavTarget target = 2;</code>
     * @return \NavService\NavTarget
     */
    public function getTarget()
    {
        return $this->readOneof(2);
    }

    /**
     * 导航请求目标
     *
     * Generated from protobuf field <code>.navService.NavTarget target = 2;</code>
     * @param \NavService\NavTarget $var
     * @return $this
     */
    public function setTarget($var)
    {
        GPBUtil::checkMessage($var, \NavService\NavTarget::class);
        $this->writeOneof(2, $var);

        return $this;
    }

    /**
     * 漫游模式
     *
     * Generated from protobuf field <code>bool is_roaming = 3;</code>
     * @return bool
     */
    public function getIsRoaming()
    {
        return $this->readOneof(3);
    }

    /**
     * 漫游模式
     *
     * Generated from protobuf field <code>bool is_roaming = 3;</code>
     * @param bool $var
     * @return $this
     */
    public function setIsRoaming($var)
    {
        GPBUtil::checkBool($var);
        $this->writeOneof(3, $var);

        return $this;
    }

    /**
     * 地图位置目标
     *
     * Generated from protobuf field <code>.navService.MapPosition map_position = 4;</code>
     * @return \NavService\MapPosition
     */
    public function getMapPosition()
    {
        return $this->readOneof(4);
    }

    /**
     * 地图位置目标
     *
     * Generated from protobuf field <code>.navService.MapPosition map_position = 4;</code>
     * @param \NavService\MapPosition $var
     * @return $this
     */
    public function setMapPosition($var)
    {
        GPBUtil::checkMessage($var, \NavService\MapPosition::class);
        $this->writeOneof(4, $var);

        return $this;
    }

    /**
     * @return string
     */
    public function getTargetOneof()
    {
        return $this->whichOneof("target_oneof");
    }

}

