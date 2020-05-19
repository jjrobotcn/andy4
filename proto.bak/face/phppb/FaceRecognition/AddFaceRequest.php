<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: faceset.proto

namespace FaceRecognition;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>faceRecognition.AddFaceRequest</code>
 */
class AddFaceRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * FaceSet.id
     *
     * Generated from protobuf field <code>string face_set_id = 1;</code>
     */
    private $face_set_id = '';
    /**
     * 待识别添加的人脸图片
     *
     * Generated from protobuf field <code>bytes face_img = 2;</code>
     */
    private $face_img = '';
    /**
     * 自定义信息数据
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
     *     @type string $face_set_id
     *           FaceSet.id
     *     @type string $face_img
     *           待识别添加的人脸图片
     *     @type array|\Google\Protobuf\Internal\MapField $detail
     *           自定义信息数据
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Faceset::initOnce();
        parent::__construct($data);
    }

    /**
     * FaceSet.id
     *
     * Generated from protobuf field <code>string face_set_id = 1;</code>
     * @return string
     */
    public function getFaceSetId()
    {
        return $this->face_set_id;
    }

    /**
     * FaceSet.id
     *
     * Generated from protobuf field <code>string face_set_id = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setFaceSetId($var)
    {
        GPBUtil::checkString($var, True);
        $this->face_set_id = $var;

        return $this;
    }

    /**
     * 待识别添加的人脸图片
     *
     * Generated from protobuf field <code>bytes face_img = 2;</code>
     * @return string
     */
    public function getFaceImg()
    {
        return $this->face_img;
    }

    /**
     * 待识别添加的人脸图片
     *
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
     * 自定义信息数据
     *
     * Generated from protobuf field <code>map<string, string> detail = 3;</code>
     * @return \Google\Protobuf\Internal\MapField
     */
    public function getDetail()
    {
        return $this->detail;
    }

    /**
     * 自定义信息数据
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
