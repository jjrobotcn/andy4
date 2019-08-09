<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: camera.proto

namespace CameraService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;
use Google\Protobuf\Internal\GPBWrapperUtils;

/**
 * Generated from protobuf message <code>cameraService.DvrListDatesResponse</code>
 */
class DvrListDatesResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>repeated string date_list = 1;</code>
     */
    private $date_list;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string[]|\Google\Protobuf\Internal\RepeatedField $date_list
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Camera::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>repeated string date_list = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getDateList()
    {
        return $this->date_list;
    }

    /**
     * Generated from protobuf field <code>repeated string date_list = 1;</code>
     * @param string[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setDateList($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->date_list = $arr;

        return $this;
    }

}

