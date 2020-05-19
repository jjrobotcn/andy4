<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: faceset.proto

namespace FaceRecognition;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>faceRecognition.ListFaceDetailsRequest</code>
 */
class ListFaceDetailsRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * FaceSet.id
     *
     * Generated from protobuf field <code>string face_set_id = 1;</code>
     */
    private $face_set_id = '';
    /**
     * 结果总数限制
     * 默认:10
     *
     * Generated from protobuf field <code>uint32 limit = 2;</code>
     */
    private $limit = 0;
    /**
     * 结果匹配offset
     * 默认:0
     *
     * Generated from protobuf field <code>uint32 offset = 3;</code>
     */
    private $offset = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $face_set_id
     *           FaceSet.id
     *     @type int $limit
     *           结果总数限制
     *           默认:10
     *     @type int $offset
     *           结果匹配offset
     *           默认:0
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
     * 结果总数限制
     * 默认:10
     *
     * Generated from protobuf field <code>uint32 limit = 2;</code>
     * @return int
     */
    public function getLimit()
    {
        return $this->limit;
    }

    /**
     * 结果总数限制
     * 默认:10
     *
     * Generated from protobuf field <code>uint32 limit = 2;</code>
     * @param int $var
     * @return $this
     */
    public function setLimit($var)
    {
        GPBUtil::checkUint32($var);
        $this->limit = $var;

        return $this;
    }

    /**
     * 结果匹配offset
     * 默认:0
     *
     * Generated from protobuf field <code>uint32 offset = 3;</code>
     * @return int
     */
    public function getOffset()
    {
        return $this->offset;
    }

    /**
     * 结果匹配offset
     * 默认:0
     *
     * Generated from protobuf field <code>uint32 offset = 3;</code>
     * @param int $var
     * @return $this
     */
    public function setOffset($var)
    {
        GPBUtil::checkUint32($var);
        $this->offset = $var;

        return $this;
    }

}
