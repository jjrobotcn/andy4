<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: escpos.proto

namespace EscposService;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;
use Google\Protobuf\Internal\GPBWrapperUtils;

/**
 * 单行中打印对象
 *
 * Generated from protobuf message <code>escposService.ElementRow</code>
 */
class ElementRow extends \Google\Protobuf\Internal\Message
{
    /**
     * 打印对象列表
     *
     * Generated from protobuf field <code>repeated .escposService.Element elements = 1;</code>
     */
    private $elements;
    /**
     * 行对齐方式
     *
     * Generated from protobuf field <code>.escposService.ElementAlign align = 2;</code>
     */
    private $align = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \EscposService\Element[]|\Google\Protobuf\Internal\RepeatedField $elements
     *           打印对象列表
     *     @type int $align
     *           行对齐方式
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Escpos::initOnce();
        parent::__construct($data);
    }

    /**
     * 打印对象列表
     *
     * Generated from protobuf field <code>repeated .escposService.Element elements = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getElements()
    {
        return $this->elements;
    }

    /**
     * 打印对象列表
     *
     * Generated from protobuf field <code>repeated .escposService.Element elements = 1;</code>
     * @param \EscposService\Element[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setElements($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \EscposService\Element::class);
        $this->elements = $arr;

        return $this;
    }

    /**
     * 行对齐方式
     *
     * Generated from protobuf field <code>.escposService.ElementAlign align = 2;</code>
     * @return int
     */
    public function getAlign()
    {
        return $this->align;
    }

    /**
     * 行对齐方式
     *
     * Generated from protobuf field <code>.escposService.ElementAlign align = 2;</code>
     * @param int $var
     * @return $this
     */
    public function setAlign($var)
    {
        GPBUtil::checkEnum($var, \EscposService\ElementAlign::class);
        $this->align = $var;

        return $this;
    }

}
