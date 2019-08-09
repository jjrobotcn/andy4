<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: camera.proto

namespace CameraService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;
use Google\Protobuf\Internal\GPBWrapperUtils;

/**
 * Generated from protobuf message <code>cameraService.DvrListDateVideosRequest</code>
 */
class DvrListDateVideosRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * 请求日期, 根据DvrListDatesResonse中日期
     *
     * Generated from protobuf field <code>string date = 1;</code>
     */
    private $date = '';
    /**
     * 过滤参数
     *
     * Generated from protobuf field <code>.cameraService.DvrDateVideosFilter filter = 2;</code>
     */
    private $filter = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $date
     *           请求日期, 根据DvrListDatesResonse中日期
     *     @type \CameraService\DvrDateVideosFilter $filter
     *           过滤参数
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Camera::initOnce();
        parent::__construct($data);
    }

    /**
     * 请求日期, 根据DvrListDatesResonse中日期
     *
     * Generated from protobuf field <code>string date = 1;</code>
     * @return string
     */
    public function getDate()
    {
        return $this->date;
    }

    /**
     * 请求日期, 根据DvrListDatesResonse中日期
     *
     * Generated from protobuf field <code>string date = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setDate($var)
    {
        GPBUtil::checkString($var, True);
        $this->date = $var;

        return $this;
    }

    /**
     * 过滤参数
     *
     * Generated from protobuf field <code>.cameraService.DvrDateVideosFilter filter = 2;</code>
     * @return \CameraService\DvrDateVideosFilter
     */
    public function getFilter()
    {
        return $this->filter;
    }

    /**
     * 过滤参数
     *
     * Generated from protobuf field <code>.cameraService.DvrDateVideosFilter filter = 2;</code>
     * @param \CameraService\DvrDateVideosFilter $var
     * @return $this
     */
    public function setFilter($var)
    {
        GPBUtil::checkMessage($var, \CameraService\DvrDateVideosFilter::class);
        $this->filter = $var;

        return $this;
    }

}

