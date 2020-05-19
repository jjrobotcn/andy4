<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: expression.proto

namespace ExpressionService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * 上传表情结果
 *
 * Generated from protobuf message <code>expressionService.UploadExpressionFileResponse</code>
 */
class UploadExpressionFileResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * 表情对象
     *
     * Generated from protobuf field <code>.expressionService.ExpressionInfo expression_info = 1;</code>
     */
    private $expression_info = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \ExpressionService\ExpressionInfo $expression_info
     *           表情对象
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Expression::initOnce();
        parent::__construct($data);
    }

    /**
     * 表情对象
     *
     * Generated from protobuf field <code>.expressionService.ExpressionInfo expression_info = 1;</code>
     * @return \ExpressionService\ExpressionInfo
     */
    public function getExpressionInfo()
    {
        return $this->expression_info;
    }

    /**
     * 表情对象
     *
     * Generated from protobuf field <code>.expressionService.ExpressionInfo expression_info = 1;</code>
     * @param \ExpressionService\ExpressionInfo $var
     * @return $this
     */
    public function setExpressionInfo($var)
    {
        GPBUtil::checkMessage($var, \ExpressionService\ExpressionInfo::class);
        $this->expression_info = $var;

        return $this;
    }

}
