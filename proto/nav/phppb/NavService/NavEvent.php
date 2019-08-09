<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: nav.proto

namespace NavService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;
use Google\Protobuf\Internal\GPBWrapperUtils;

/**
 * Generated from protobuf message <code>navService.NavEvent</code>
 */
class NavEvent extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.navService.StatusCode status_code = 1;</code>
     */
    private $status_code = 0;
    /**
     * Generated from protobuf field <code>.navService.NavTarget nav_target = 2;</code>
     */
    private $nav_target = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $status_code
     *     @type \NavService\NavTarget $nav_target
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
     * Generated from protobuf field <code>.navService.NavTarget nav_target = 2;</code>
     * @return \NavService\NavTarget
     */
    public function getNavTarget()
    {
        return $this->nav_target;
    }

    /**
     * Generated from protobuf field <code>.navService.NavTarget nav_target = 2;</code>
     * @param \NavService\NavTarget $var
     * @return $this
     */
    public function setNavTarget($var)
    {
        GPBUtil::checkMessage($var, \NavService\NavTarget::class);
        $this->nav_target = $var;

        return $this;
    }

}
