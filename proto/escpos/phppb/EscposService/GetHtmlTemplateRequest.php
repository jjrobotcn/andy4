<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: escpos.proto

namespace EscposService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;
use Google\Protobuf\Internal\GPBWrapperUtils;

/**
 * 获取指定模板内容请求
 *
 * Generated from protobuf message <code>escposService.GetHtmlTemplateRequest</code>
 */
class GetHtmlTemplateRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * html模板id
     *
     * Generated from protobuf field <code>string id = 1;</code>
     */
    private $id = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $id
     *           html模板id
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Escpos::initOnce();
        parent::__construct($data);
    }

    /**
     * html模板id
     *
     * Generated from protobuf field <code>string id = 1;</code>
     * @return string
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * html模板id
     *
     * Generated from protobuf field <code>string id = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setId($var)
    {
        GPBUtil::checkString($var, True);
        $this->id = $var;

        return $this;
    }

}
