<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: nav.proto

namespace NavService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>navService.NavRoaming</code>
 */
class NavRoaming extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.navService.RoamingType nav_roaming_type = 1;</code>
     */
    private $nav_roaming_type = 0;
    /**
     * 到达漫游点后等待时间， -1为无限等待可通过ROAMING_TYPE_CONTINUE继续， 0为不等待(默认)
     *
     * Generated from protobuf field <code>int32 wait_sec = 2;</code>
     */
    private $wait_sec = 0;
    /**
     * 漫游点索引， 为空时将漫游全部点
     *
     * Generated from protobuf field <code>repeated string roaming_target_indexes = 3;</code>
     */
    private $roaming_target_indexes;
    /**
     * 是否循环(仅有序巡航)
     *
     * Generated from protobuf field <code>bool order_loop = 4;</code>
     */
    private $order_loop = false;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $nav_roaming_type
     *     @type int $wait_sec
     *           到达漫游点后等待时间， -1为无限等待可通过ROAMING_TYPE_CONTINUE继续， 0为不等待(默认)
     *     @type string[]|\Google\Protobuf\Internal\RepeatedField $roaming_target_indexes
     *           漫游点索引， 为空时将漫游全部点
     *     @type bool $order_loop
     *           是否循环(仅有序巡航)
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Nav::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.navService.RoamingType nav_roaming_type = 1;</code>
     * @return int
     */
    public function getNavRoamingType()
    {
        return $this->nav_roaming_type;
    }

    /**
     * Generated from protobuf field <code>.navService.RoamingType nav_roaming_type = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setNavRoamingType($var)
    {
        GPBUtil::checkEnum($var, \NavService\RoamingType::class);
        $this->nav_roaming_type = $var;

        return $this;
    }

    /**
     * 到达漫游点后等待时间， -1为无限等待可通过ROAMING_TYPE_CONTINUE继续， 0为不等待(默认)
     *
     * Generated from protobuf field <code>int32 wait_sec = 2;</code>
     * @return int
     */
    public function getWaitSec()
    {
        return $this->wait_sec;
    }

    /**
     * 到达漫游点后等待时间， -1为无限等待可通过ROAMING_TYPE_CONTINUE继续， 0为不等待(默认)
     *
     * Generated from protobuf field <code>int32 wait_sec = 2;</code>
     * @param int $var
     * @return $this
     */
    public function setWaitSec($var)
    {
        GPBUtil::checkInt32($var);
        $this->wait_sec = $var;

        return $this;
    }

    /**
     * 漫游点索引， 为空时将漫游全部点
     *
     * Generated from protobuf field <code>repeated string roaming_target_indexes = 3;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getRoamingTargetIndexes()
    {
        return $this->roaming_target_indexes;
    }

    /**
     * 漫游点索引， 为空时将漫游全部点
     *
     * Generated from protobuf field <code>repeated string roaming_target_indexes = 3;</code>
     * @param string[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setRoamingTargetIndexes($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->roaming_target_indexes = $arr;

        return $this;
    }

    /**
     * 是否循环(仅有序巡航)
     *
     * Generated from protobuf field <code>bool order_loop = 4;</code>
     * @return bool
     */
    public function getOrderLoop()
    {
        return $this->order_loop;
    }

    /**
     * 是否循环(仅有序巡航)
     *
     * Generated from protobuf field <code>bool order_loop = 4;</code>
     * @param bool $var
     * @return $this
     */
    public function setOrderLoop($var)
    {
        GPBUtil::checkBool($var);
        $this->order_loop = $var;

        return $this;
    }

}
