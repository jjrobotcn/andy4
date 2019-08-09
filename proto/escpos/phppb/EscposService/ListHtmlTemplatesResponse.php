<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: escpos.proto

namespace EscposService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;
use Google\Protobuf\Internal\GPBWrapperUtils;

/**
 * 获取模板列表结果
 *
 * Generated from protobuf message <code>escposService.ListHtmlTemplatesResponse</code>
 */
class ListHtmlTemplatesResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * html模板列表
     *
     * Generated from protobuf field <code>repeated .escposService.HtmlTemplate html_templates = 1;</code>
     */
    private $html_templates;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \EscposService\HtmlTemplate[]|\Google\Protobuf\Internal\RepeatedField $html_templates
     *           html模板列表
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Escpos::initOnce();
        parent::__construct($data);
    }

    /**
     * html模板列表
     *
     * Generated from protobuf field <code>repeated .escposService.HtmlTemplate html_templates = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getHtmlTemplates()
    {
        return $this->html_templates;
    }

    /**
     * html模板列表
     *
     * Generated from protobuf field <code>repeated .escposService.HtmlTemplate html_templates = 1;</code>
     * @param \EscposService\HtmlTemplate[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setHtmlTemplates($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \EscposService\HtmlTemplate::class);
        $this->html_templates = $arr;

        return $this;
    }

}

