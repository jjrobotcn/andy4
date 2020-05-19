<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: faceset.proto

namespace FaceRecognition;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>faceRecognition.FaceDetailResponse</code>
 */
class FaceDetailResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.faceRecognition.FaceDetail face_detail = 1;</code>
     */
    private $face_detail = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \FaceRecognition\FaceDetail $face_detail
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Faceset::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.faceRecognition.FaceDetail face_detail = 1;</code>
     * @return \FaceRecognition\FaceDetail
     */
    public function getFaceDetail()
    {
        return $this->face_detail;
    }

    /**
     * Generated from protobuf field <code>.faceRecognition.FaceDetail face_detail = 1;</code>
     * @param \FaceRecognition\FaceDetail $var
     * @return $this
     */
    public function setFaceDetail($var)
    {
        GPBUtil::checkMessage($var, \FaceRecognition\FaceDetail::class);
        $this->face_detail = $var;

        return $this;
    }

}
