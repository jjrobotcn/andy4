<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: escpos.proto

namespace EscposService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;
use Google\Protobuf\Internal\GPBWrapperUtils;

/**
 * html模板
 *
 * Generated from protobuf message <code>escposService.HtmlTemplate</code>
 */
class HtmlTemplate extends \Google\Protobuf\Internal\Message
{
    /**
     * 创建时id将自动生成
     * 修改时根据此id获取模板数据
     *
     * Generated from protobuf field <code>string id = 1;</code>
     */
    private $id = '';
    /**
     * 创建时传入空值将生成随机名
     * 修改时传入空值将不改变
     *
     * Generated from protobuf field <code>string name = 2;</code>
     */
    private $name = '';
    /**
     * 修改时传入空值将不改变
     *
     * Generated from protobuf field <code>string content = 3;</code>
     */
    private $content = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $id
     *           创建时id将自动生成
     *           修改时根据此id获取模板数据
     *     @type string $name
     *           创建时传入空值将生成随机名
     *           修改时传入空值将不改变
     *     @type string $content
     *           修改时传入空值将不改变
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Escpos::initOnce();
        parent::__construct($data);
    }

    /**
     * 创建时id将自动生成
     * 修改时根据此id获取模板数据
     *
     * Generated from protobuf field <code>string id = 1;</code>
     * @return string
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * 创建时id将自动生成
     * 修改时根据此id获取模板数据
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

    /**
     * 创建时传入空值将生成随机名
     * 修改时传入空值将不改变
     *
     * Generated from protobuf field <code>string name = 2;</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * 创建时传入空值将生成随机名
     * 修改时传入空值将不改变
     *
     * Generated from protobuf field <code>string name = 2;</code>
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
     * 修改时传入空值将不改变
     *
     * Generated from protobuf field <code>string content = 3;</code>
     * @return string
     */
    public function getContent()
    {
        return $this->content;
    }

    /**
     * 修改时传入空值将不改变
     *
     * Generated from protobuf field <code>string content = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setContent($var)
    {
        GPBUtil::checkString($var, True);
        $this->content = $var;

        return $this;
    }

}

