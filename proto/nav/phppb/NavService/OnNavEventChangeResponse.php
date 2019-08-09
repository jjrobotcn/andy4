<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: nav.proto

namespace NavService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;
use Google\Protobuf\Internal\GPBWrapperUtils;

/**
 * Generated from protobuf message <code>navService.OnNavEventChangeResponse</code>
 */
class OnNavEventChangeResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.navService.NavEventType nav_event_type = 1;</code>
     */
    private $nav_event_type = 0;
    protected $change_oneof;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $nav_event_type
     *     @type \NavService\MoveEvent $move_event
     *     @type \NavService\NavEvent $nav_event
     *     @type \NavService\RotateEvent $rotate_event
     *     @type \NavService\AutoChargeEvent $auto_charge_event
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Nav::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.navService.NavEventType nav_event_type = 1;</code>
     * @return int
     */
    public function getNavEventType()
    {
        return $this->nav_event_type;
    }

    /**
     * Generated from protobuf field <code>.navService.NavEventType nav_event_type = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setNavEventType($var)
    {
        GPBUtil::checkEnum($var, \NavService\NavEventType::class);
        $this->nav_event_type = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.navService.MoveEvent move_event = 2;</code>
     * @return \NavService\MoveEvent
     */
    public function getMoveEvent()
    {
        return $this->readOneof(2);
    }

    /**
     * Generated from protobuf field <code>.navService.MoveEvent move_event = 2;</code>
     * @param \NavService\MoveEvent $var
     * @return $this
     */
    public function setMoveEvent($var)
    {
        GPBUtil::checkMessage($var, \NavService\MoveEvent::class);
        $this->writeOneof(2, $var);

        return $this;
    }

    /**
     * Generated from protobuf field <code>.navService.NavEvent nav_event = 3;</code>
     * @return \NavService\NavEvent
     */
    public function getNavEvent()
    {
        return $this->readOneof(3);
    }

    /**
     * Generated from protobuf field <code>.navService.NavEvent nav_event = 3;</code>
     * @param \NavService\NavEvent $var
     * @return $this
     */
    public function setNavEvent($var)
    {
        GPBUtil::checkMessage($var, \NavService\NavEvent::class);
        $this->writeOneof(3, $var);

        return $this;
    }

    /**
     * Generated from protobuf field <code>.navService.RotateEvent rotate_event = 4;</code>
     * @return \NavService\RotateEvent
     */
    public function getRotateEvent()
    {
        return $this->readOneof(4);
    }

    /**
     * Generated from protobuf field <code>.navService.RotateEvent rotate_event = 4;</code>
     * @param \NavService\RotateEvent $var
     * @return $this
     */
    public function setRotateEvent($var)
    {
        GPBUtil::checkMessage($var, \NavService\RotateEvent::class);
        $this->writeOneof(4, $var);

        return $this;
    }

    /**
     * Generated from protobuf field <code>.navService.AutoChargeEvent auto_charge_event = 5;</code>
     * @return \NavService\AutoChargeEvent
     */
    public function getAutoChargeEvent()
    {
        return $this->readOneof(5);
    }

    /**
     * Generated from protobuf field <code>.navService.AutoChargeEvent auto_charge_event = 5;</code>
     * @param \NavService\AutoChargeEvent $var
     * @return $this
     */
    public function setAutoChargeEvent($var)
    {
        GPBUtil::checkMessage($var, \NavService\AutoChargeEvent::class);
        $this->writeOneof(5, $var);

        return $this;
    }

    /**
     * @return string
     */
    public function getChangeOneof()
    {
        return $this->whichOneof("change_oneof");
    }

}
