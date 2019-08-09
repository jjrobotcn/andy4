<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: expression.proto

namespace ExpressionService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;
use Google\Protobuf\Internal\GPBWrapperUtils;

/**
 * 上传表情请求
 *
 * Generated from protobuf message <code>expressionService.UploadExpressionFileRequest</code>
 */
class UploadExpressionFileRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * 表情名
     * 为空时将产生随机表情名
     *
     * Generated from protobuf field <code>string name = 1;</code>
     */
    private $name = '';
    /**
     * 表情zip文件
     *
     * Generated from protobuf field <code>bytes data = 2;</code>
     */
    private $data = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $name
     *           表情名
     *           为空时将产生随机表情名
     *     @type string $data
     *           表情zip文件
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Expression::initOnce();
        parent::__construct($data);
    }

    /**
     * 表情名
     * 为空时将产生随机表情名
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * 表情名
     * 为空时将产生随机表情名
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setName($var)
    {
        GPBUtil::checkString($var, True);
        $this->name = $var;

        return $this;
    }

    /**
     * 表情zip文件
     *
     * Generated from protobuf field <code>bytes data = 2;</code>
     * @return string
     */
    public function getData()
    {
        return $this->data;
    }

    /**
     * 表情zip文件
     *
     * Generated from protobuf field <code>bytes data = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setData($var)
    {
        GPBUtil::checkString($var, False);
        $this->data = $var;

        return $this;
    }

}

