<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: faceset.proto

namespace FaceRecognition;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>faceRecognition.FaceDetail</code>
 */
class FaceDetail extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string face_token = 1;</code>
     */
    private $face_token = '';
    /**
     * Generated from protobuf field <code>bytes face_img = 2;</code>
     */
    private $face_img = '';
    /**
     * 自定义detail
     *
     * Generated from protobuf field <code>map<string, string> detail = 3;</code>
     */
    private $detail;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $face_token
     *     @type string $face_img
     *     @type array|\Google\Protobuf\Internal\MapField $detail
     *           自定义detail
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Faceset::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string face_token = 1;</code>
     * @return string
     */
    public function getFaceToken()
    {
        return $this->face_token;
    }

    /**
     * Generated from protobuf field <code>string face_token = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setFaceToken($var)
    {
        GPBUtil::checkString($var, True);
        $this->face_token = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bytes face_img = 2;</code>
     * @return string
     */
    public function getFaceImg()
    {
        return $this->face_img;
    }

    /**
     * Generated from protobuf field <code>bytes face_img = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setFaceImg($var)
    {
        GPBUtil::checkString($var, False);
        $this->face_img = $var;

        return $this;
    }

    /**
     * 自定义detail
     *
     * Generated from protobuf field <code>map<string, string> detail = 3;</code>
     * @return \Google\Protobuf\Internal\MapField
     */
    public function getDetail()
    {
        return $this->detail;
    }

    /**
     * 自定义detail
     *
     * Generated from protobuf field <code>map<string, string> detail = 3;</code>
     * @param array|\Google\Protobuf\Internal\MapField $var
     * @return $this
     */
    public function setDetail($var)
    {
        $arr = GPBUtil::checkMapField($var, \Google\Protobuf\Internal\GPBType::STRING, \Google\Protobuf\Internal\GPBType::STRING);
        $this->detail = $arr;

        return $this;
    }

}

