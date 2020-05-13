<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: facedetect.proto

namespace FaceRecognition;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>faceRecognition.FromImageRequest</code>
 */
class FromImageRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * 检测图片内容
     *
     * Generated from protobuf field <code>bytes image = 1;</code>
     */
    private $image = '';
    /**
     * 检测性别
     *
     * Generated from protobuf field <code>bool with_gender = 2;</code>
     */
    private $with_gender = false;
    /**
     * 检测年龄
     *
     * Generated from protobuf field <code>bool with_age = 3;</code>
     */
    private $with_age = false;
    /**
     * 检测人脸位置
     *
     * Generated from protobuf field <code>bool with_position = 4;</code>
     */
    private $with_position = false;
    /**
     * 返回人脸图片戳宽度
     *
     * Generated from protobuf field <code>bool with_face_crop_width = 5;</code>
     */
    private $with_face_crop_width = false;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $image
     *           检测图片内容
     *     @type bool $with_gender
     *           检测性别
     *     @type bool $with_age
     *           检测年龄
     *     @type bool $with_position
     *           检测人脸位置
     *     @type bool $with_face_crop_width
     *           返回人脸图片戳宽度
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Facedetect::initOnce();
        parent::__construct($data);
    }

    /**
     * 检测图片内容
     *
     * Generated from protobuf field <code>bytes image = 1;</code>
     * @return string
     */
    public function getImage()
    {
        return $this->image;
    }

    /**
     * 检测图片内容
     *
     * Generated from protobuf field <code>bytes image = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setImage($var)
    {
        GPBUtil::checkString($var, False);
        $this->image = $var;

        return $this;
    }

    /**
     * 检测性别
     *
     * Generated from protobuf field <code>bool with_gender = 2;</code>
     * @return bool
     */
    public function getWithGender()
    {
        return $this->with_gender;
    }

    /**
     * 检测性别
     *
     * Generated from protobuf field <code>bool with_gender = 2;</code>
     * @param bool $var
     * @return $this
     */
    public function setWithGender($var)
    {
        GPBUtil::checkBool($var);
        $this->with_gender = $var;

        return $this;
    }

    /**
     * 检测年龄
     *
     * Generated from protobuf field <code>bool with_age = 3;</code>
     * @return bool
     */
    public function getWithAge()
    {
        return $this->with_age;
    }

    /**
     * 检测年龄
     *
     * Generated from protobuf field <code>bool with_age = 3;</code>
     * @param bool $var
     * @return $this
     */
    public function setWithAge($var)
    {
        GPBUtil::checkBool($var);
        $this->with_age = $var;

        return $this;
    }

    /**
     * 检测人脸位置
     *
     * Generated from protobuf field <code>bool with_position = 4;</code>
     * @return bool
     */
    public function getWithPosition()
    {
        return $this->with_position;
    }

    /**
     * 检测人脸位置
     *
     * Generated from protobuf field <code>bool with_position = 4;</code>
     * @param bool $var
     * @return $this
     */
    public function setWithPosition($var)
    {
        GPBUtil::checkBool($var);
        $this->with_position = $var;

        return $this;
    }

    /**
     * 返回人脸图片戳宽度
     *
     * Generated from protobuf field <code>bool with_face_crop_width = 5;</code>
     * @return bool
     */
    public function getWithFaceCropWidth()
    {
        return $this->with_face_crop_width;
    }

    /**
     * 返回人脸图片戳宽度
     *
     * Generated from protobuf field <code>bool with_face_crop_width = 5;</code>
     * @param bool $var
     * @return $this
     */
    public function setWithFaceCropWidth($var)
    {
        GPBUtil::checkBool($var);
        $this->with_face_crop_width = $var;

        return $this;
    }

}

