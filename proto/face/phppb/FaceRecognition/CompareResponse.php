<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: face.proto

namespace FaceRecognition;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>faceRecognition.CompareResponse</code>
 */
class CompareResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * 对比结果信任值 [0, 1.0]
     *
     * Generated from protobuf field <code>float confidence = 1;</code>
     */
    private $confidence = 0.0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type float $confidence
     *           对比结果信任值 [0, 1.0]
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Face::initOnce();
        parent::__construct($data);
    }

    /**
     * 对比结果信任值 [0, 1.0]
     *
     * Generated from protobuf field <code>float confidence = 1;</code>
     * @return float
     */
    public function getConfidence()
    {
        return $this->confidence;
    }

    /**
     * 对比结果信任值 [0, 1.0]
     *
     * Generated from protobuf field <code>float confidence = 1;</code>
     * @param float $var
     * @return $this
     */
    public function setConfidence($var)
    {
        GPBUtil::checkFloat($var);
        $this->confidence = $var;

        return $this;
    }

}

